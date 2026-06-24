import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class wm2 {
  public static final Unsafe a;
  
  public static final Class b;
  
  public static final oc2 c;
  
  public static final boolean d;
  
  public static final boolean e;
  
  public static final long f;
  
  public static final boolean g;
  
  static {
    // Byte code:
    //   0: invokestatic i : ()Lsun/misc/Unsafe;
    //   3: astore #6
    //   5: aload #6
    //   7: putstatic wm2.a : Lsun/misc/Unsafe;
    //   10: getstatic ak2.a : I
    //   13: istore_0
    //   14: ldc libcore/io/Memory
    //   16: putstatic wm2.b : Ljava/lang/Class;
    //   19: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   22: astore #5
    //   24: aload #5
    //   26: invokestatic o : (Ljava/lang/Class;)Z
    //   29: istore_2
    //   30: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   33: astore #4
    //   35: aload #4
    //   37: invokestatic o : (Ljava/lang/Class;)Z
    //   40: istore_1
    //   41: aconst_null
    //   42: astore_3
    //   43: aload #6
    //   45: ifnonnull -> 51
    //   48: goto -> 82
    //   51: iload_2
    //   52: ifeq -> 68
    //   55: new oc2
    //   58: dup
    //   59: aload #6
    //   61: invokespecial <init> : (Lsun/misc/Unsafe;)V
    //   64: astore_3
    //   65: goto -> 82
    //   68: iload_1
    //   69: ifeq -> 82
    //   72: new oc2
    //   75: dup
    //   76: aload #6
    //   78: invokespecial <init> : (Lsun/misc/Unsafe;)V
    //   81: astore_3
    //   82: aload_3
    //   83: putstatic wm2.c : Loc2;
    //   86: iconst_1
    //   87: istore_2
    //   88: aload_3
    //   89: ifnonnull -> 97
    //   92: iconst_0
    //   93: istore_1
    //   94: goto -> 191
    //   97: aload_3
    //   98: getfield a : Lsun/misc/Unsafe;
    //   101: astore_3
    //   102: aload_3
    //   103: invokevirtual getClass : ()Ljava/lang/Class;
    //   106: astore_3
    //   107: aload_3
    //   108: ldc 'objectFieldOffset'
    //   110: iconst_1
    //   111: anewarray java/lang/Class
    //   114: dup
    //   115: iconst_0
    //   116: ldc java/lang/reflect/Field
    //   118: aastore
    //   119: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   122: pop
    //   123: aload_3
    //   124: ldc 'getLong'
    //   126: iconst_2
    //   127: anewarray java/lang/Class
    //   130: dup
    //   131: iconst_0
    //   132: ldc java/lang/Object
    //   134: aastore
    //   135: dup
    //   136: iconst_1
    //   137: aload #5
    //   139: aastore
    //   140: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   143: pop
    //   144: invokestatic b : ()Ljava/lang/reflect/Field;
    //   147: astore_3
    //   148: aload_3
    //   149: ifnonnull -> 155
    //   152: goto -> 92
    //   155: iconst_1
    //   156: istore_1
    //   157: goto -> 191
    //   160: astore_3
    //   161: ldc wm2
    //   163: invokevirtual getName : ()Ljava/lang/String;
    //   166: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   169: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   172: ldc 'com.google.protobuf.UnsafeUtil'
    //   174: ldc 'logMissingMethod'
    //   176: ldc 'platform method missing - proto runtime falling back to safer methods: '
    //   178: aload_3
    //   179: invokevirtual toString : ()Ljava/lang/String;
    //   182: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   185: invokevirtual logp : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   188: goto -> 92
    //   191: iload_1
    //   192: putstatic wm2.d : Z
    //   195: getstatic wm2.c : Loc2;
    //   198: astore_3
    //   199: aload_3
    //   200: ifnonnull -> 208
    //   203: iconst_0
    //   204: istore_1
    //   205: goto -> 443
    //   208: aload_3
    //   209: getfield a : Lsun/misc/Unsafe;
    //   212: astore_3
    //   213: aload_3
    //   214: invokevirtual getClass : ()Ljava/lang/Class;
    //   217: astore_3
    //   218: aload_3
    //   219: ldc 'objectFieldOffset'
    //   221: iconst_1
    //   222: anewarray java/lang/Class
    //   225: dup
    //   226: iconst_0
    //   227: ldc java/lang/reflect/Field
    //   229: aastore
    //   230: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   233: pop
    //   234: aload_3
    //   235: ldc 'arrayBaseOffset'
    //   237: iconst_1
    //   238: anewarray java/lang/Class
    //   241: dup
    //   242: iconst_0
    //   243: ldc java/lang/Class
    //   245: aastore
    //   246: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   249: pop
    //   250: aload_3
    //   251: ldc 'arrayIndexScale'
    //   253: iconst_1
    //   254: anewarray java/lang/Class
    //   257: dup
    //   258: iconst_0
    //   259: ldc java/lang/Class
    //   261: aastore
    //   262: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   265: pop
    //   266: aload_3
    //   267: ldc 'getInt'
    //   269: iconst_2
    //   270: anewarray java/lang/Class
    //   273: dup
    //   274: iconst_0
    //   275: ldc java/lang/Object
    //   277: aastore
    //   278: dup
    //   279: iconst_1
    //   280: aload #5
    //   282: aastore
    //   283: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   286: pop
    //   287: aload_3
    //   288: ldc 'putInt'
    //   290: iconst_3
    //   291: anewarray java/lang/Class
    //   294: dup
    //   295: iconst_0
    //   296: ldc java/lang/Object
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: aload #5
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: aload #4
    //   308: aastore
    //   309: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   312: pop
    //   313: aload_3
    //   314: ldc 'getLong'
    //   316: iconst_2
    //   317: anewarray java/lang/Class
    //   320: dup
    //   321: iconst_0
    //   322: ldc java/lang/Object
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: aload #5
    //   329: aastore
    //   330: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   333: pop
    //   334: aload_3
    //   335: ldc 'putLong'
    //   337: iconst_3
    //   338: anewarray java/lang/Class
    //   341: dup
    //   342: iconst_0
    //   343: ldc java/lang/Object
    //   345: aastore
    //   346: dup
    //   347: iconst_1
    //   348: aload #5
    //   350: aastore
    //   351: dup
    //   352: iconst_2
    //   353: aload #5
    //   355: aastore
    //   356: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   359: pop
    //   360: aload_3
    //   361: ldc 'getObject'
    //   363: iconst_2
    //   364: anewarray java/lang/Class
    //   367: dup
    //   368: iconst_0
    //   369: ldc java/lang/Object
    //   371: aastore
    //   372: dup
    //   373: iconst_1
    //   374: aload #5
    //   376: aastore
    //   377: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   380: pop
    //   381: aload_3
    //   382: ldc 'putObject'
    //   384: iconst_3
    //   385: anewarray java/lang/Class
    //   388: dup
    //   389: iconst_0
    //   390: ldc java/lang/Object
    //   392: aastore
    //   393: dup
    //   394: iconst_1
    //   395: aload #5
    //   397: aastore
    //   398: dup
    //   399: iconst_2
    //   400: ldc java/lang/Object
    //   402: aastore
    //   403: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   406: pop
    //   407: iconst_1
    //   408: istore_1
    //   409: goto -> 443
    //   412: astore_3
    //   413: ldc wm2
    //   415: invokevirtual getName : ()Ljava/lang/String;
    //   418: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   421: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
    //   424: ldc 'com.google.protobuf.UnsafeUtil'
    //   426: ldc 'logMissingMethod'
    //   428: ldc 'platform method missing - proto runtime falling back to safer methods: '
    //   430: aload_3
    //   431: invokevirtual toString : ()Ljava/lang/String;
    //   434: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   437: invokevirtual logp : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   440: goto -> 203
    //   443: iload_1
    //   444: putstatic wm2.e : Z
    //   447: ldc [B
    //   449: invokestatic p : (Ljava/lang/Class;)I
    //   452: i2l
    //   453: putstatic wm2.f : J
    //   456: ldc [Z
    //   458: invokestatic p : (Ljava/lang/Class;)I
    //   461: pop
    //   462: ldc [Z
    //   464: invokestatic a : (Ljava/lang/Class;)V
    //   467: ldc [I
    //   469: invokestatic p : (Ljava/lang/Class;)I
    //   472: pop
    //   473: ldc [I
    //   475: invokestatic a : (Ljava/lang/Class;)V
    //   478: ldc [J
    //   480: invokestatic p : (Ljava/lang/Class;)I
    //   483: pop
    //   484: ldc [J
    //   486: invokestatic a : (Ljava/lang/Class;)V
    //   489: ldc [F
    //   491: invokestatic p : (Ljava/lang/Class;)I
    //   494: pop
    //   495: ldc [F
    //   497: invokestatic a : (Ljava/lang/Class;)V
    //   500: ldc [D
    //   502: invokestatic p : (Ljava/lang/Class;)I
    //   505: pop
    //   506: ldc [D
    //   508: invokestatic a : (Ljava/lang/Class;)V
    //   511: ldc [Ljava/lang/Object;
    //   513: invokestatic p : (Ljava/lang/Class;)I
    //   516: pop
    //   517: ldc [Ljava/lang/Object;
    //   519: invokestatic a : (Ljava/lang/Class;)V
    //   522: invokestatic b : ()Ljava/lang/reflect/Field;
    //   525: astore #4
    //   527: aload #4
    //   529: ifnull -> 550
    //   532: getstatic wm2.c : Loc2;
    //   535: astore_3
    //   536: aload_3
    //   537: ifnull -> 550
    //   540: aload_3
    //   541: getfield a : Lsun/misc/Unsafe;
    //   544: aload #4
    //   546: invokevirtual objectFieldOffset : (Ljava/lang/reflect/Field;)J
    //   549: pop2
    //   550: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   553: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   556: if_acmpne -> 564
    //   559: iload_2
    //   560: istore_1
    //   561: goto -> 566
    //   564: iconst_0
    //   565: istore_1
    //   566: iload_1
    //   567: putstatic wm2.g : Z
    //   570: return
    // Exception table:
    //   from	to	target	type
    //   102	148	160	finally
    //   213	407	412	finally
  }
  
  public static void a(Class<?> paramClass) {
    if (e)
      c.a.arrayIndexScale(paramClass); 
  }
  
  public static Field b() {
    Exception exception;
    int i = ak2.a;
    try {
      Field field = Buffer.class.getDeclaredField("effectiveDirectAddress");
    } finally {
      exception = null;
    } 
    return (Field)exception;
  }
  
  public static void c(Object paramObject, long paramLong, byte paramByte) {
    Unsafe unsafe = c.a;
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int j = unsafe.getInt(paramObject, l);
    int i = (((int)paramLong ^ 0xFFFFFFFF) & 0x3) << 3;
    unsafe.putInt(paramObject, l, (0xFF & paramByte) << i | j & (255 << i ^ 0xFFFFFFFF));
  }
  
  public static void d(Object paramObject, long paramLong, byte paramByte) {
    Unsafe unsafe = c.a;
    long l = 0xFFFFFFFFFFFFFFFCL & paramLong;
    int i = unsafe.getInt(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    unsafe.putInt(paramObject, l, (0xFF & paramByte) << j | i & (255 << j ^ 0xFFFFFFFF));
  }
  
  public static int e(long paramLong, Object paramObject) {
    return c.a.getInt(paramObject, paramLong);
  }
  
  public static long f(long paramLong, Object paramObject) {
    return c.a.getLong(paramObject, paramLong);
  }
  
  public static Object g(Class<?> paramClass) {
    try {
      return a.allocateInstance(paramClass);
    } catch (InstantiationException instantiationException) {
      throw new IllegalStateException(instantiationException);
    } 
  }
  
  public static Object h(long paramLong, Object paramObject) {
    return c.a.getObject(paramObject, paramLong);
  }
  
  public static Unsafe i() {
    Exception exception;
    try {
      qm2 qm2 = new qm2();
      super();
      Unsafe unsafe = AccessController.<Unsafe>doPrivileged(qm2);
    } finally {
      exception = null;
    } 
    try {
      exception.arrayBaseOffset(byte[].class);
      return (Unsafe)exception;
    } catch (Exception exception1) {
      Logger.getLogger(wm2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
      return null;
    } 
  }
  
  public static void j(Object paramObject, long paramLong, int paramInt) {
    c.a.putInt(paramObject, paramLong, paramInt);
  }
  
  public static void k(Object paramObject, long paramLong1, long paramLong2) {
    c.a.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public static void l(long paramLong, Object paramObject1, Object paramObject2) {
    c.a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public static boolean o(Class paramClass) {
    int i = ak2.a;
    try {
      Class clazz2 = b;
      Class<boolean> clazz = boolean.class;
      clazz2.getMethod("peekLong", new Class[] { paramClass, clazz });
      clazz2.getMethod("pokeLong", new Class[] { paramClass, long.class, clazz });
      Class<int> clazz1 = int.class;
      clazz2.getMethod("pokeInt", new Class[] { paramClass, clazz1, clazz });
      clazz2.getMethod("peekInt", new Class[] { paramClass, clazz });
      clazz2.getMethod("pokeByte", new Class[] { paramClass, byte.class });
      clazz2.getMethod("peekByte", new Class[] { paramClass });
      clazz2.getMethod(eRUgfgGAccgka.QSZZTqsnisPiooZ, new Class[] { paramClass, byte[].class, clazz1, clazz1 });
      return true;
    } finally {
      paramClass = null;
    } 
  }
  
  public static int p(Class<?> paramClass) {
    return e ? c.a.arrayBaseOffset(paramClass) : -1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */