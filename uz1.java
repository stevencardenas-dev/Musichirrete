import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public final class uz1 extends qz1 {
  public static final Class k;
  
  public static final Constructor l;
  
  public static final Method m;
  
  public static final Method n;
  
  static {
    Method method1;
    Method method2;
    Constructor<?> constructor = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(null);
      Class<int> clazz1 = int.class;
      method2 = clazz.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, clazz1, List.class, clazz1, boolean.class });
      method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi24Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      classNotFoundException = null;
      method1 = null;
      method2 = method1;
    } catch (NoSuchMethodException noSuchMethodException) {}
    l = constructor;
    k = (Class)noSuchMethodException;
    m = method2;
    n = method1;
  }
  
  public static boolean Z(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean) {
    try {
      return ((Boolean)m.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public static Typeface a0(Object paramObject) {
    try {
      Object object = Array.newInstance(k, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)n.invoke(null, new Object[] { object });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public final Typeface j(Context paramContext, ea0 paramea0, Resources paramResources, int paramInt) {
    // Byte code:
    //   0: getstatic uz1.l : Ljava/lang/reflect/Constructor;
    //   3: aconst_null
    //   4: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   7: astore #10
    //   9: goto -> 17
    //   12: astore #10
    //   14: aconst_null
    //   15: astore #10
    //   17: aload #10
    //   19: ifnonnull -> 25
    //   22: goto -> 202
    //   25: aload_2
    //   26: getfield a : [Lfa0;
    //   29: astore #12
    //   31: aload #12
    //   33: arraylength
    //   34: istore #5
    //   36: iconst_0
    //   37: istore #4
    //   39: iload #4
    //   41: iload #5
    //   43: if_icmpge -> 219
    //   46: aload #12
    //   48: iload #4
    //   50: aaload
    //   51: astore #11
    //   53: aload #11
    //   55: getfield f : I
    //   58: istore #6
    //   60: aload_1
    //   61: invokestatic J : (Landroid/content/Context;)Ljava/io/File;
    //   64: astore #13
    //   66: aload #13
    //   68: ifnonnull -> 76
    //   71: aconst_null
    //   72: astore_2
    //   73: goto -> 171
    //   76: aload #13
    //   78: aload_3
    //   79: iload #6
    //   81: invokestatic u : (Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   84: istore #7
    //   86: iload #7
    //   88: ifne -> 100
    //   91: aload #13
    //   93: invokevirtual delete : ()Z
    //   96: pop
    //   97: goto -> 71
    //   100: new java/io/FileInputStream
    //   103: astore #14
    //   105: aload #14
    //   107: aload #13
    //   109: invokespecial <init> : (Ljava/io/File;)V
    //   112: aload #14
    //   114: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   117: astore_2
    //   118: aload_2
    //   119: invokevirtual size : ()J
    //   122: lstore #8
    //   124: aload_2
    //   125: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY : Ljava/nio/channels/FileChannel$MapMode;
    //   128: lconst_0
    //   129: lload #8
    //   131: invokevirtual map : (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   134: astore_2
    //   135: aload #14
    //   137: invokevirtual close : ()V
    //   140: goto -> 165
    //   143: astore_2
    //   144: aload #14
    //   146: invokevirtual close : ()V
    //   149: goto -> 160
    //   152: astore #14
    //   154: aload_2
    //   155: aload #14
    //   157: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   160: aload_2
    //   161: athrow
    //   162: astore_2
    //   163: aconst_null
    //   164: astore_2
    //   165: aload #13
    //   167: invokevirtual delete : ()Z
    //   170: pop
    //   171: aload_2
    //   172: ifnonnull -> 178
    //   175: goto -> 202
    //   178: aload #10
    //   180: aload_2
    //   181: aload #11
    //   183: getfield e : I
    //   186: aload #11
    //   188: getfield b : I
    //   191: aload #11
    //   193: getfield c : Z
    //   196: invokestatic Z : (Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    //   199: ifne -> 204
    //   202: aconst_null
    //   203: areturn
    //   204: iinc #4, 1
    //   207: goto -> 39
    //   210: astore_1
    //   211: aload #13
    //   213: invokevirtual delete : ()Z
    //   216: pop
    //   217: aload_1
    //   218: athrow
    //   219: aload #10
    //   221: invokestatic a0 : (Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   224: areturn
    // Exception table:
    //   from	to	target	type
    //   0	9	12	java/lang/IllegalAccessException
    //   0	9	12	java/lang/InstantiationException
    //   0	9	12	java/lang/reflect/InvocationTargetException
    //   76	86	210	finally
    //   100	112	162	java/io/IOException
    //   100	112	210	finally
    //   112	135	143	finally
    //   135	140	162	java/io/IOException
    //   135	140	210	finally
    //   144	149	152	finally
    //   154	160	162	java/io/IOException
    //   154	160	210	finally
    //   160	162	162	java/io/IOException
    //   160	162	210	finally
  }
  
  public final Typeface k(Context paramContext, ha0[] paramArrayOfha0, int paramInt) {
    try {
      illegalAccessException = (IllegalAccessException)l.newInstance(null);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      illegalAccessException = null;
    } 
    if (illegalAccessException != null) {
      byte b = 0;
      zm1 zm1 = new zm1(0);
      int i = paramArrayOfha0.length;
      while (b < i) {
        ha0 ha01 = paramArrayOfha0[b];
        Uri uri = ha01.a;
        ByteBuffer byteBuffer2 = (ByteBuffer)zm1.get(uri);
        ByteBuffer byteBuffer1 = byteBuffer2;
        if (byteBuffer2 == null) {
          byteBuffer1 = g92.R(paramContext, uri);
          zm1.put(uri, byteBuffer1);
        } 
        if (byteBuffer1 == null)
          // Byte code: goto -> 153 
        if (!Z(illegalAccessException, byteBuffer1, ha01.b, ha01.c, ha01.d))
          // Byte code: goto -> 153 
        b++;
      } 
      Typeface typeface = a0(illegalAccessException);
      if (typeface != null)
        return Typeface.create(typeface, paramInt); 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */