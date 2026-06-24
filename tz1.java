import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class tz1 extends qz1 {
  public static Class k;
  
  public static Constructor l;
  
  public static Method m;
  
  public static Method n;
  
  public static boolean o = false;
  
  public static boolean Z(Object paramObject, String paramString, int paramInt, boolean paramBoolean) {
    a0();
    try {
      return ((Boolean)m.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException|InvocationTargetException illegalAccessException) {
      k91.n(illegalAccessException);
      return false;
    } 
  }
  
  public static void a0() {
    Method method;
    ClassNotFoundException classNotFoundException;
    if (o)
      return; 
    o = true;
    Constructor<?> constructor = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(null);
      Method method1 = clazz.getMethod("addFontWeightStyle", new Class[] { String.class, int.class, boolean.class });
      method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
    } catch (ClassNotFoundException classNotFoundException1) {
      Log.e("TypefaceCompatApi21Impl", classNotFoundException1.getClass().getName(), classNotFoundException1);
      method = null;
      classNotFoundException1 = null;
      classNotFoundException = classNotFoundException1;
    } catch (NoSuchMethodException noSuchMethodException) {}
    l = constructor;
    k = (Class)noSuchMethodException;
    m = (Method)classNotFoundException;
    n = method;
  }
  
  public Typeface j(Context paramContext, ea0 paramea0, Resources paramResources, int paramInt) {
    a0();
    try {
      Object object = l.newInstance(null);
      fa0[] arrayOfFa0 = paramea0.a;
      int i = arrayOfFa0.length;
      paramInt = 0;
      while (paramInt < i) {
        fa0 fa0 = arrayOfFa0[paramInt];
        File file = g92.J(paramContext);
        if (file == null)
          return null; 
        try {
          boolean bool = g92.u(file, paramResources, fa0.f);
          if (!bool)
            return null; 
          bool = Z(object, file.getPath(), fa0.b, fa0.c);
          if (!bool)
            return null; 
          file.delete();
        } catch (RuntimeException runtimeException) {
          return null;
        } finally {
          file.delete();
        } 
      } 
      a0();
      try {
        null = Array.newInstance(k, 1);
        Array.set(null, 0, object);
        return (Typeface)n.invoke(null, new Object[] { null });
      } catch (IllegalAccessException illegalAccessException) {
      
      } catch (InvocationTargetException null) {}
      k91.n(invocationTargetException);
      return null;
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    k91.n(invocationTargetException);
    return null;
  }
  
  public Typeface k(Context paramContext, ha0[] paramArrayOfha0, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge -> 9
    //   6: goto -> 261
    //   9: aload_2
    //   10: iload_3
    //   11: invokestatic r : ([Lha0;I)Lha0;
    //   14: astore #5
    //   16: aload_1
    //   17: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   20: astore_2
    //   21: aload_2
    //   22: aload #5
    //   24: getfield a : Landroid/net/Uri;
    //   27: ldc 'r'
    //   29: aconst_null
    //   30: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   33: astore #5
    //   35: aload #5
    //   37: ifnonnull -> 52
    //   40: aload #5
    //   42: ifnull -> 261
    //   45: aload #5
    //   47: invokevirtual close : ()V
    //   50: aconst_null
    //   51: areturn
    //   52: new java/lang/StringBuilder
    //   55: astore_2
    //   56: aload_2
    //   57: ldc '/proc/self/fd/'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: aload_2
    //   63: aload #5
    //   65: invokevirtual getFd : ()I
    //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: invokestatic readlink : (Ljava/lang/String;)Ljava/lang/String;
    //   79: astore #6
    //   81: aload #6
    //   83: invokestatic stat : (Ljava/lang/String;)Landroid/system/StructStat;
    //   86: getfield st_mode : I
    //   89: invokestatic S_ISREG : (I)Z
    //   92: ifeq -> 108
    //   95: new java/io/File
    //   98: astore_2
    //   99: aload_2
    //   100: aload #6
    //   102: invokespecial <init> : (Ljava/lang/String;)V
    //   105: goto -> 110
    //   108: aconst_null
    //   109: astore_2
    //   110: aload_2
    //   111: ifnull -> 140
    //   114: aload_2
    //   115: invokevirtual canRead : ()Z
    //   118: ifne -> 124
    //   121: goto -> 140
    //   124: aload_2
    //   125: invokestatic createFromFile : (Ljava/io/File;)Landroid/graphics/Typeface;
    //   128: astore_1
    //   129: aload #5
    //   131: invokevirtual close : ()V
    //   134: aload_1
    //   135: areturn
    //   136: astore_1
    //   137: goto -> 245
    //   140: new java/io/FileInputStream
    //   143: astore_2
    //   144: aload_2
    //   145: aload #5
    //   147: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   150: invokespecial <init> : (Ljava/io/FileDescriptor;)V
    //   153: aload_1
    //   154: invokestatic J : (Landroid/content/Context;)Ljava/io/File;
    //   157: astore #6
    //   159: aload #6
    //   161: ifnonnull -> 169
    //   164: aconst_null
    //   165: astore_1
    //   166: goto -> 218
    //   169: aload #6
    //   171: aload_2
    //   172: invokestatic v : (Ljava/io/File;Ljava/io/InputStream;)Z
    //   175: istore #4
    //   177: iload #4
    //   179: ifne -> 191
    //   182: aload #6
    //   184: invokevirtual delete : ()Z
    //   187: pop
    //   188: goto -> 164
    //   191: aload #6
    //   193: invokevirtual getPath : ()Ljava/lang/String;
    //   196: invokestatic createFromFile : (Ljava/lang/String;)Landroid/graphics/Typeface;
    //   199: astore_1
    //   200: aload #6
    //   202: invokevirtual delete : ()Z
    //   205: pop
    //   206: goto -> 218
    //   209: astore_1
    //   210: aload #6
    //   212: invokevirtual delete : ()Z
    //   215: pop
    //   216: aload_1
    //   217: athrow
    //   218: aload_2
    //   219: invokevirtual close : ()V
    //   222: aload #5
    //   224: invokevirtual close : ()V
    //   227: aload_1
    //   228: areturn
    //   229: astore_1
    //   230: aload_2
    //   231: invokevirtual close : ()V
    //   234: goto -> 243
    //   237: astore_2
    //   238: aload_1
    //   239: aload_2
    //   240: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   243: aload_1
    //   244: athrow
    //   245: aload #5
    //   247: invokevirtual close : ()V
    //   250: goto -> 259
    //   253: astore_2
    //   254: aload_1
    //   255: aload_2
    //   256: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   259: aload_1
    //   260: athrow
    //   261: aconst_null
    //   262: areturn
    //   263: astore_1
    //   264: goto -> 261
    //   267: astore_2
    //   268: goto -> 108
    //   271: astore_1
    //   272: goto -> 182
    // Exception table:
    //   from	to	target	type
    //   21	35	263	java/io/IOException
    //   45	50	263	java/io/IOException
    //   52	105	267	android/system/ErrnoException
    //   52	105	136	finally
    //   114	121	136	finally
    //   124	129	136	finally
    //   129	134	263	java/io/IOException
    //   140	153	136	finally
    //   153	159	229	finally
    //   169	177	271	java/lang/RuntimeException
    //   169	177	209	finally
    //   182	188	229	finally
    //   191	200	271	java/lang/RuntimeException
    //   191	200	209	finally
    //   200	206	229	finally
    //   210	218	229	finally
    //   218	222	136	finally
    //   222	227	263	java/io/IOException
    //   230	234	237	finally
    //   238	243	136	finally
    //   243	245	136	finally
    //   245	250	253	finally
    //   254	259	263	java/io/IOException
    //   259	261	263	java/io/IOException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */