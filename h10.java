import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class h10 {
  public static final boolean a;
  
  public static final Method b;
  
  public static final Field c;
  
  public static final Field d;
  
  public static final Field e;
  
  public static final Field f;
  
  static {
    // Byte code:
    //   0: ldc 'android.graphics.Insets'
    //   2: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5: astore_3
    //   6: ldc android/graphics/drawable/Drawable
    //   8: ldc 'getOpticalInsets'
    //   10: aconst_null
    //   11: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   14: astore_1
    //   15: aload_3
    //   16: ldc 'left'
    //   18: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   21: astore_2
    //   22: aload_3
    //   23: ldc 'top'
    //   25: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   28: astore #4
    //   30: aload_3
    //   31: ldc 'right'
    //   33: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   36: astore #5
    //   38: aload_3
    //   39: getstatic org/jaudiotagger/tag/mp4/bKj/fXMDNeMWaILNVh.xkErRY : Ljava/lang/String;
    //   42: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   45: astore_3
    //   46: iconst_1
    //   47: istore_0
    //   48: goto -> 135
    //   51: astore_3
    //   52: aconst_null
    //   53: astore #5
    //   55: aload_1
    //   56: astore_3
    //   57: aload #5
    //   59: astore_1
    //   60: goto -> 122
    //   63: astore_3
    //   64: aconst_null
    //   65: astore #4
    //   67: aconst_null
    //   68: astore #5
    //   70: aload_1
    //   71: astore_3
    //   72: aload #5
    //   74: astore_1
    //   75: goto -> 122
    //   78: astore_3
    //   79: goto -> 64
    //   82: astore_3
    //   83: goto -> 64
    //   86: astore_2
    //   87: aconst_null
    //   88: astore_2
    //   89: goto -> 64
    //   92: astore_2
    //   93: aconst_null
    //   94: astore_2
    //   95: goto -> 64
    //   98: astore_2
    //   99: aconst_null
    //   100: astore_2
    //   101: goto -> 64
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_1
    //   107: goto -> 87
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_1
    //   113: goto -> 93
    //   116: astore_1
    //   117: aconst_null
    //   118: astore_1
    //   119: goto -> 99
    //   122: aconst_null
    //   123: astore #6
    //   125: iconst_0
    //   126: istore_0
    //   127: aload_1
    //   128: astore #5
    //   130: aload_3
    //   131: astore_1
    //   132: aload #6
    //   134: astore_3
    //   135: iload_0
    //   136: ifeq -> 168
    //   139: aload_1
    //   140: putstatic h10.b : Ljava/lang/reflect/Method;
    //   143: aload_2
    //   144: putstatic h10.c : Ljava/lang/reflect/Field;
    //   147: aload #4
    //   149: putstatic h10.d : Ljava/lang/reflect/Field;
    //   152: aload #5
    //   154: putstatic h10.e : Ljava/lang/reflect/Field;
    //   157: aload_3
    //   158: putstatic h10.f : Ljava/lang/reflect/Field;
    //   161: iconst_1
    //   162: putstatic h10.a : Z
    //   165: goto -> 192
    //   168: aconst_null
    //   169: putstatic h10.b : Ljava/lang/reflect/Method;
    //   172: aconst_null
    //   173: putstatic h10.c : Ljava/lang/reflect/Field;
    //   176: aconst_null
    //   177: putstatic h10.d : Ljava/lang/reflect/Field;
    //   180: aconst_null
    //   181: putstatic h10.e : Ljava/lang/reflect/Field;
    //   184: aconst_null
    //   185: putstatic h10.f : Ljava/lang/reflect/Field;
    //   188: iconst_0
    //   189: putstatic h10.a : Z
    //   192: return
    //   193: astore_3
    //   194: aload_1
    //   195: astore_3
    //   196: aload #5
    //   198: astore_1
    //   199: goto -> 122
    // Exception table:
    //   from	to	target	type
    //   0	15	116	java/lang/NoSuchMethodException
    //   0	15	110	java/lang/ClassNotFoundException
    //   0	15	104	java/lang/NoSuchFieldException
    //   15	22	98	java/lang/NoSuchMethodException
    //   15	22	92	java/lang/ClassNotFoundException
    //   15	22	86	java/lang/NoSuchFieldException
    //   22	30	82	java/lang/NoSuchMethodException
    //   22	30	78	java/lang/ClassNotFoundException
    //   22	30	63	java/lang/NoSuchFieldException
    //   30	38	51	java/lang/NoSuchMethodException
    //   30	38	51	java/lang/ClassNotFoundException
    //   30	38	51	java/lang/NoSuchFieldException
    //   38	46	193	java/lang/NoSuchMethodException
    //   38	46	193	java/lang/ClassNotFoundException
    //   38	46	193	java/lang/NoSuchFieldException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */