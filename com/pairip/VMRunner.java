package com.pairip;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Future;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class VMRunner {
  private static final int PACKAGE_MANAGER_TRIES = 5;
  
  private static final String TAG = "VMRunner";
  
  private static String apkPath;
  
  private static Context context;
  
  private static Future<?> job;
  
  private static String loggingEnabled = "false";
  
  private static int versionCode = 53000;
  
  static {
    System.loadLibrary("pairipcore");
  }
  
  public static Runnable createInvokeRunnable(final String vmByteCodeFile, final Object[] args) {
    return new Runnable() {
        final Object[] val$args;
        
        final String val$vmByteCodeFile;
        
        public void run() {
          VMRunner.invoke(vmByteCodeFile, args);
        }
      };
  }
  
  public static native Object executeVM(byte[] paramArrayOfbyte, Object[] paramArrayOfObject);
  
  private static ZipFile getApkFromContextPath() {
    StringBuilder stringBuilder;
    Context context = context;
    ZipFile zipFile = null;
    if (context == null)
      return null; 
    byte b = 0;
    while (b < 5) {
      try {
        zipFile = tryOpen((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).sourceDir);
        if (zipFile != null)
          return zipFile; 
        b++;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        String str = nameNotFoundException.getMessage();
        stringBuilder = new StringBuilder("Error while opening base apk: ");
        stringBuilder.append(str);
        throw new VMRunnerException(stringBuilder.toString(), nameNotFoundException);
      } 
    } 
    return (ZipFile)stringBuilder;
  }
  
  private static String getApkPathFromResource() {
    // Byte code:
    //   0: ldc com/pairip/VMRunner
    //   2: monitorenter
    //   3: invokestatic currentTimeMillis : ()J
    //   6: lstore_0
    //   7: ldc com/pairip/VMRunner
    //   9: ldc '/AndroidManifest.xml'
    //   11: invokevirtual getResource : (Ljava/lang/String;)Ljava/net/URL;
    //   14: astore #4
    //   16: aload #4
    //   18: ifnonnull -> 40
    //   21: invokestatic isDebuggingEnabled : ()Z
    //   24: ifeq -> 35
    //   27: ldc 'VMRunner'
    //   29: ldc 'Cannot load resource!'
    //   31: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   34: pop
    //   35: ldc com/pairip/VMRunner
    //   37: monitorexit
    //   38: aconst_null
    //   39: areturn
    //   40: invokestatic isDebuggingEnabled : ()Z
    //   43: ifeq -> 78
    //   46: aload #4
    //   48: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   51: astore_2
    //   52: new java/lang/StringBuilder
    //   55: astore_3
    //   56: aload_3
    //   57: ldc 'Resource URL is '
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: aload_3
    //   63: aload_2
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: pop
    //   68: ldc 'VMRunner'
    //   70: aload_3
    //   71: invokevirtual toString : ()Ljava/lang/String;
    //   74: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   77: pop
    //   78: aload #4
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: astore_2
    //   84: aload_2
    //   85: bipush #9
    //   87: aload_2
    //   88: bipush #33
    //   90: invokevirtual lastIndexOf : (I)I
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: astore_2
    //   97: invokestatic isDebuggingEnabled : ()Z
    //   100: ifeq -> 133
    //   103: ldc 'VMRunner'
    //   105: ldc 'Found APK path %s after %d ms.'
    //   107: iconst_2
    //   108: anewarray java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_2
    //   114: aastore
    //   115: dup
    //   116: iconst_1
    //   117: invokestatic currentTimeMillis : ()J
    //   120: lload_0
    //   121: lsub
    //   122: invokestatic valueOf : (J)Ljava/lang/Long;
    //   125: aastore
    //   126: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   129: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   132: pop
    //   133: ldc com/pairip/VMRunner
    //   135: monitorexit
    //   136: aload_2
    //   137: areturn
    //   138: astore_2
    //   139: ldc com/pairip/VMRunner
    //   141: monitorexit
    //   142: aload_2
    //   143: athrow
    // Exception table:
    //   from	to	target	type
    //   3	16	138	finally
    //   21	35	138	finally
    //   40	78	138	finally
    //   78	133	138	finally
    //   139	142	138	finally
  }
  
  public static Context getContext() {
    return context;
  }
  
  public static Future<?> getJob() {
    return job;
  }
  
  private static byte[] getVmByteCode(String paramString) throws IOException {
    byte[] arrayOfByte = readByteCode(paramString);
    return (new VmDecryptor()).decrypt(arrayOfByte, versionCode, isDebuggingEnabled());
  }
  
  public static Object invoke(String paramString, Object[] paramArrayOfObject) {
    if (context == null)
      setContext(InitContextProvider.tryToCreateContextForBindingApp()); 
    if (isDebuggingEnabled()) {
      StringBuilder stringBuilder = new StringBuilder("Executing ");
      stringBuilder.append(paramString);
      Log.i("VMRunner", stringBuilder.toString());
    } 
    try {
      byte[] arrayOfByte = getVmByteCode(paramString);
      long l = System.currentTimeMillis();
      Object object = executeVM(arrayOfByte, paramArrayOfObject);
      if (isDebuggingEnabled())
        Log.i("VMRunner", String.format("Finished executing %s after %d ms.", new Object[] { paramString, Long.valueOf(System.currentTimeMillis() - l) })); 
      return object;
    } catch (IOException iOException) {
      throw new VMRunnerException("Error while loading bytecode.", iOException);
    } 
  }
  
  private static boolean isDebuggingEnabled() {
    return "true".equals(loggingEnabled);
  }
  
  private static ZipFile openBaseApk() {
    ZipFile zipFile = tryOpen(apkPath);
    if (zipFile != null)
      return zipFile; 
    zipFile = tryOpen(getApkPathFromResource());
    if (zipFile != null)
      return zipFile; 
    zipFile = getApkFromContextPath();
    if (zipFile != null)
      return zipFile; 
    throw new VMRunnerException("Could not open base apk.");
  }
  
  private static byte[] readByteCode(String paramString) throws IOException {
    long l = System.currentTimeMillis();
    ZipFile zipFile = openBaseApk();
    try {
      StringBuilder stringBuilder1 = new StringBuilder();
      this("assets/");
      stringBuilder1.append(paramString);
      ZipEntry zipEntry = zipFile.getEntry(stringBuilder1.toString());
      if (zipEntry != null) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
          int i = (int)zipEntry.getSize();
          byte[] arrayOfByte = new byte[i];
          readFullByteArrayFromStream(inputStream, arrayOfByte);
          if (isDebuggingEnabled())
            Log.i("VMRunner", String.format("Finished loading %s (%d kB) after %d ms.", new Object[] { paramString, Integer.valueOf(i / 1024), Long.valueOf(System.currentTimeMillis() - l) })); 
          return arrayOfByte;
        } finally {
          if (inputStream != null)
            try {
              inputStream.close();
            } finally {
              inputStream = null;
            }  
        } 
      } 
      IOException iOException = new IOException();
      StringBuilder stringBuilder2 = new StringBuilder();
      this();
      stringBuilder2.append(paramString);
      stringBuilder2.append(" not found.");
      this(stringBuilder2.toString());
      throw iOException;
    } finally {
      if (zipFile != null)
        try {
          zipFile.close();
        } finally {
          zipFile = null;
        }  
    } 
  }
  
  private static byte[] readFullByteArrayFromStream(InputStream paramInputStream, byte[] paramArrayOfbyte) throws IOException {
    int i = 0;
    while (true) {
      int j = paramInputStream.read(paramArrayOfbyte, i, paramArrayOfbyte.length - i);
      if (j > 0) {
        i += j;
        continue;
      } 
      if (i == paramArrayOfbyte.length)
        return paramArrayOfbyte; 
      j = paramArrayOfbyte.length;
      StringBuilder stringBuilder = new StringBuilder("Read ");
      stringBuilder.append(i);
      stringBuilder.append("/");
      stringBuilder.append(j);
      stringBuilder.append(" bytes.");
      throw new IOException(stringBuilder.toString());
    } 
  }
  
  public static void setContext(Context paramContext) {
    context = paramContext;
  }
  
  public static void setJob(Future<?> paramFuture) {
    job = paramFuture;
  }
  
  private static ZipFile tryOpen(String paramString) {
    if (paramString == null)
      return null; 
    try {
      ZipFile zipFile = new ZipFile();
      this(paramString);
      apkPath = paramString;
      return zipFile;
    } catch (IOException iOException) {
      if (isDebuggingEnabled()) {
        String str = iOException.getMessage();
        StringBuilder stringBuilder = new StringBuilder("Cannot open zipfile ");
        stringBuilder.append(paramString);
        stringBuilder.append(" error: ");
        stringBuilder.append(str);
        Log.i("VMRunner", stringBuilder.toString());
      } 
      return null;
    } 
  }
  
  private static class VMRunnerException extends RuntimeException {
    public VMRunnerException(String param1String) {
      super(param1String);
    }
    
    public VMRunnerException(String param1String, Throwable param1Throwable) {
      super(param1String, param1Throwable);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\VMRunner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */