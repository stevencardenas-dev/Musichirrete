import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class d2 {
  public static final Class a;
  
  public static final Field b;
  
  public static final Field c;
  
  public static final Method d;
  
  public static final Method e;
  
  public static final Method f;
  
  public static final Handler g;
  
  static {
    // Byte code:
    //   0: new android/os/Handler
    //   3: dup
    //   4: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   7: invokespecial <init> : (Landroid/os/Looper;)V
    //   10: putstatic d2.g : Landroid/os/Handler;
    //   13: aconst_null
    //   14: astore_2
    //   15: ldc 'android.app.ActivityThread'
    //   17: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   20: astore_1
    //   21: goto -> 27
    //   24: astore_1
    //   25: aconst_null
    //   26: astore_1
    //   27: aload_1
    //   28: putstatic d2.a : Ljava/lang/Class;
    //   31: ldc android/app/Activity
    //   33: ldc 'mMainThread'
    //   35: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   38: astore_1
    //   39: aload_1
    //   40: iconst_1
    //   41: invokevirtual setAccessible : (Z)V
    //   44: goto -> 50
    //   47: astore_1
    //   48: aconst_null
    //   49: astore_1
    //   50: aload_1
    //   51: putstatic d2.b : Ljava/lang/reflect/Field;
    //   54: ldc android/app/Activity
    //   56: ldc 'mToken'
    //   58: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   61: astore_1
    //   62: aload_1
    //   63: iconst_1
    //   64: invokevirtual setAccessible : (Z)V
    //   67: goto -> 73
    //   70: astore_1
    //   71: aconst_null
    //   72: astore_1
    //   73: aload_1
    //   74: putstatic d2.c : Ljava/lang/reflect/Field;
    //   77: getstatic d2.a : Ljava/lang/Class;
    //   80: astore_1
    //   81: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   84: astore_3
    //   85: aload_1
    //   86: ifnonnull -> 94
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -> 124
    //   94: aload_1
    //   95: ldc 'performStopActivity'
    //   97: iconst_3
    //   98: anewarray java/lang/Class
    //   101: dup
    //   102: iconst_0
    //   103: ldc android/os/IBinder
    //   105: aastore
    //   106: dup
    //   107: iconst_1
    //   108: aload_3
    //   109: aastore
    //   110: dup
    //   111: iconst_2
    //   112: ldc java/lang/String
    //   114: aastore
    //   115: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   118: astore_1
    //   119: aload_1
    //   120: iconst_1
    //   121: invokevirtual setAccessible : (Z)V
    //   124: aload_1
    //   125: putstatic d2.d : Ljava/lang/reflect/Method;
    //   128: getstatic d2.a : Ljava/lang/Class;
    //   131: astore_1
    //   132: aload_1
    //   133: ifnonnull -> 141
    //   136: aconst_null
    //   137: astore_1
    //   138: goto -> 166
    //   141: aload_1
    //   142: ldc 'performStopActivity'
    //   144: iconst_2
    //   145: anewarray java/lang/Class
    //   148: dup
    //   149: iconst_0
    //   150: ldc android/os/IBinder
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: aload_3
    //   156: aastore
    //   157: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   160: astore_1
    //   161: aload_1
    //   162: iconst_1
    //   163: invokevirtual setAccessible : (Z)V
    //   166: aload_1
    //   167: putstatic d2.e : Ljava/lang/reflect/Method;
    //   170: getstatic d2.a : Ljava/lang/Class;
    //   173: astore_3
    //   174: getstatic android/os/Build$VERSION.SDK_INT : I
    //   177: istore_0
    //   178: iload_0
    //   179: bipush #26
    //   181: if_icmpeq -> 192
    //   184: aload_2
    //   185: astore_1
    //   186: iload_0
    //   187: bipush #27
    //   189: if_icmpne -> 272
    //   192: aload_3
    //   193: ifnonnull -> 201
    //   196: aload_2
    //   197: astore_1
    //   198: goto -> 272
    //   201: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   204: astore #4
    //   206: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   209: astore_1
    //   210: aload_3
    //   211: ldc 'requestRelaunchActivity'
    //   213: bipush #9
    //   215: anewarray java/lang/Class
    //   218: dup
    //   219: iconst_0
    //   220: ldc android/os/IBinder
    //   222: aastore
    //   223: dup
    //   224: iconst_1
    //   225: ldc java/util/List
    //   227: aastore
    //   228: dup
    //   229: iconst_2
    //   230: ldc java/util/List
    //   232: aastore
    //   233: dup
    //   234: iconst_3
    //   235: aload #4
    //   237: aastore
    //   238: dup
    //   239: iconst_4
    //   240: aload_1
    //   241: aastore
    //   242: dup
    //   243: iconst_5
    //   244: ldc android/content/res/Configuration
    //   246: aastore
    //   247: dup
    //   248: bipush #6
    //   250: ldc android/content/res/Configuration
    //   252: aastore
    //   253: dup
    //   254: bipush #7
    //   256: aload_1
    //   257: aastore
    //   258: dup
    //   259: bipush #8
    //   261: aload_1
    //   262: aastore
    //   263: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   266: astore_1
    //   267: aload_1
    //   268: iconst_1
    //   269: invokevirtual setAccessible : (Z)V
    //   272: aload_1
    //   273: putstatic d2.f : Ljava/lang/reflect/Method;
    //   276: return
    //   277: astore_1
    //   278: goto -> 89
    //   281: astore_1
    //   282: goto -> 136
    //   285: astore_1
    //   286: aload_2
    //   287: astore_1
    //   288: goto -> 272
    // Exception table:
    //   from	to	target	type
    //   15	21	24	finally
    //   31	44	47	finally
    //   54	67	70	finally
    //   94	124	277	finally
    //   141	166	281	finally
    //   201	272	285	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */