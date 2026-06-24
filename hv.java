import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class hv implements Serializable {
  public static final a02 c = a02.h;
  
  public static final AtomicReference e = new AtomicReference();
  
  public static final AtomicReference f = new AtomicReference();
  
  public static final AtomicReference g = new AtomicReference();
  
  public final String b;
  
  public hv(String paramString) {
    if (paramString != null) {
      this.b = paramString;
      return;
    } 
    l0.l("Id must not be null");
    throw null;
  }
  
  public static hv c(String paramString) {
    if (!paramString.equals("UTC")) {
      hv hv1 = j().a(paramString);
      if (hv1 != null)
        return hv1; 
      if (paramString.startsWith("+") || paramString.startsWith("-")) {
        int i = n(paramString);
        if (i != 0L) {
          paramString = p(i);
          if (i != 0)
            return new d80(paramString, i, i, null); 
        } 
        return c;
      } 
      l0.l(x41.w("The datetime zone id '", paramString, "' is not recognised"));
      return null;
    } 
    return c;
  }
  
  public static hv d(TimeZone paramTimeZone) {
    if (paramTimeZone == null)
      return e(); 
    String str = paramTimeZone.getID();
    if (str != null) {
      boolean bool = str.equals("UTC");
      a02 a021 = c;
      if (!bool) {
        hv hv1;
        String str1 = (String)gv.a.get(str);
        eb1 eb1 = j();
        if (str1 != null) {
          hv hv2 = eb1.a(str1);
        } else {
          paramTimeZone = null;
        } 
        TimeZone timeZone = paramTimeZone;
        if (paramTimeZone == null)
          hv1 = eb1.a(str); 
        if (hv1 != null)
          return hv1; 
        if (str1 == null && (str.startsWith("GMT+") || str.startsWith("GMT-"))) {
          String str3 = str.substring(3);
          String str2 = str3;
          if (str3.length() > 2) {
            char c = str3.charAt(1);
            str2 = str3;
            if (c > '9') {
              str2 = str3;
              if (Character.isDigit(c)) {
                StringBuilder stringBuilder = new StringBuilder(str3);
                for (byte b = 0; b < stringBuilder.length(); b++) {
                  int j = Character.digit(stringBuilder.charAt(b), 10);
                  if (j >= 0)
                    stringBuilder.setCharAt(b, (char)(j + 48)); 
                } 
                str2 = stringBuilder.toString();
              } 
            } 
          } 
          int i = n(str2);
          if (i != 0L) {
            str2 = p(i);
            return (hv)((i == 0) ? a021 : new d80(str2, i, i, null));
          } 
          return a021;
        } 
        l0.l(x41.w("The datetime zone id '", str, "' is not recognised"));
        return null;
      } 
      return a021;
    } 
    l0.l("The TimeZone id must not be null");
    return null;
  }
  
  public static hv e() {
    AtomicReference<hv> atomicReference = g;
    hv hv1 = atomicReference.get();
    if (hv1 == null) {
      try {
        String str = System.getProperty("user.timezone");
        hv2 = hv1;
        if (str != null)
          hv2 = c(str); 
      } catch (RuntimeException runtimeException) {
        hv2 = hv1;
      } 
      hv1 = hv2;
      if (hv2 == null)
        try {
          hv1 = d(TimeZone.getDefault());
        } catch (IllegalArgumentException illegalArgumentException) {
          hv1 = hv2;
        }  
      hv hv2 = hv1;
      if (hv1 == null)
        hv2 = c; 
      while (!atomicReference.compareAndSet(null, hv2)) {
        if (atomicReference.get() != null) {
          hv2 = atomicReference.get();
          break;
        } 
      } 
      return hv2;
    } 
    return hv1;
  }
  
  public static sw g() {
    // Byte code:
    //   0: getstatic hv.f : Ljava/util/concurrent/atomic/AtomicReference;
    //   3: astore_2
    //   4: aload_2
    //   5: invokevirtual get : ()Ljava/lang/Object;
    //   8: checkcast sw
    //   11: astore_0
    //   12: aload_0
    //   13: ifnonnull -> 172
    //   16: ldc 'org.joda.time.DateTimeZone.NameProvider'
    //   18: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_0
    //   22: aload_0
    //   23: ifnull -> 113
    //   26: aload_0
    //   27: iconst_0
    //   28: ldc hv
    //   30: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   33: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   36: astore_0
    //   37: ldc sw
    //   39: aload_0
    //   40: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   43: ifeq -> 71
    //   46: aload_0
    //   47: ldc sw
    //   49: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
    //   52: aconst_null
    //   53: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   56: aconst_null
    //   57: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   60: checkcast sw
    //   63: astore_1
    //   64: goto -> 115
    //   67: astore_0
    //   68: goto -> 102
    //   71: new java/lang/IllegalArgumentException
    //   74: astore_0
    //   75: new java/lang/StringBuilder
    //   78: astore_1
    //   79: aload_1
    //   80: ldc 'System property referred to class that does not implement '
    //   82: invokespecial <init> : (Ljava/lang/String;)V
    //   85: aload_1
    //   86: ldc sw
    //   88: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_0
    //   93: aload_1
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: invokespecial <init> : (Ljava/lang/String;)V
    //   100: aload_0
    //   101: athrow
    //   102: new java/lang/RuntimeException
    //   105: astore_1
    //   106: aload_1
    //   107: aload_0
    //   108: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   111: aload_1
    //   112: athrow
    //   113: aconst_null
    //   114: astore_1
    //   115: aload_1
    //   116: astore_0
    //   117: aload_1
    //   118: ifnonnull -> 143
    //   121: new java/lang/Object
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: astore_0
    //   129: aload_0
    //   130: invokestatic a : ()Ljava/util/HashMap;
    //   133: putfield a : Ljava/util/HashMap;
    //   136: aload_0
    //   137: invokestatic a : ()Ljava/util/HashMap;
    //   140: putfield b : Ljava/util/HashMap;
    //   143: aload_2
    //   144: aconst_null
    //   145: aload_0
    //   146: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   149: ifeq -> 155
    //   152: goto -> 170
    //   155: aload_2
    //   156: invokevirtual get : ()Ljava/lang/Object;
    //   159: ifnull -> 143
    //   162: aload_2
    //   163: invokevirtual get : ()Ljava/lang/Object;
    //   166: checkcast sw
    //   169: astore_0
    //   170: aload_0
    //   171: areturn
    //   172: aload_0
    //   173: areturn
    //   174: astore_0
    //   175: goto -> 113
    // Exception table:
    //   from	to	target	type
    //   16	22	174	java/lang/SecurityException
    //   26	64	67	java/lang/Exception
    //   71	102	67	java/lang/Exception
    //   102	113	174	java/lang/SecurityException
  }
  
  public static eb1 j() {
    // Byte code:
    //   0: getstatic hv.e : Ljava/util/concurrent/atomic/AtomicReference;
    //   3: astore_1
    //   4: aload_1
    //   5: invokevirtual get : ()Ljava/lang/Object;
    //   8: checkcast eb1
    //   11: astore_0
    //   12: aload_0
    //   13: ifnonnull -> 224
    //   16: ldc 'org.joda.time.DateTimeZone.Provider'
    //   18: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_0
    //   22: aload_0
    //   23: ifnull -> 117
    //   26: aload_0
    //   27: iconst_0
    //   28: ldc hv
    //   30: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   33: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   36: astore_0
    //   37: ldc eb1
    //   39: aload_0
    //   40: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   43: ifeq -> 75
    //   46: aload_0
    //   47: ldc eb1
    //   49: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
    //   52: aconst_null
    //   53: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   56: aconst_null
    //   57: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   60: checkcast eb1
    //   63: astore_0
    //   64: aload_0
    //   65: invokestatic q : (Leb1;)V
    //   68: goto -> 195
    //   71: astore_2
    //   72: goto -> 106
    //   75: new java/lang/IllegalArgumentException
    //   78: astore_2
    //   79: new java/lang/StringBuilder
    //   82: astore_0
    //   83: aload_0
    //   84: ldc 'System property referred to class that does not implement '
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: aload_0
    //   90: ldc eb1
    //   92: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_2
    //   97: aload_0
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: aload_2
    //   105: athrow
    //   106: new java/lang/RuntimeException
    //   109: astore_0
    //   110: aload_0
    //   111: aload_2
    //   112: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   115: aload_0
    //   116: athrow
    //   117: ldc 'org.joda.time.DateTimeZone.Folder'
    //   119: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   122: astore_3
    //   123: aload_3
    //   124: ifnull -> 164
    //   127: new c92
    //   130: astore_0
    //   131: new java/io/File
    //   134: astore_2
    //   135: aload_2
    //   136: aload_3
    //   137: invokespecial <init> : (Ljava/lang/String;)V
    //   140: aload_0
    //   141: aload_2
    //   142: invokespecial <init> : (Ljava/io/File;)V
    //   145: aload_0
    //   146: invokestatic q : (Leb1;)V
    //   149: goto -> 195
    //   152: astore_0
    //   153: new java/lang/RuntimeException
    //   156: astore_2
    //   157: aload_2
    //   158: aload_0
    //   159: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   162: aload_2
    //   163: athrow
    //   164: new c92
    //   167: astore_0
    //   168: aload_0
    //   169: invokespecial <init> : ()V
    //   172: aload_0
    //   173: invokestatic q : (Leb1;)V
    //   176: goto -> 68
    //   179: astore_0
    //   180: aload_0
    //   181: invokevirtual printStackTrace : ()V
    //   184: new java/lang/Object
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore_0
    //   192: goto -> 68
    //   195: aload_1
    //   196: aconst_null
    //   197: aload_0
    //   198: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   201: ifeq -> 207
    //   204: goto -> 222
    //   207: aload_1
    //   208: invokevirtual get : ()Ljava/lang/Object;
    //   211: ifnull -> 195
    //   214: aload_1
    //   215: invokevirtual get : ()Ljava/lang/Object;
    //   218: checkcast eb1
    //   221: astore_0
    //   222: aload_0
    //   223: areturn
    //   224: aload_0
    //   225: areturn
    //   226: astore_0
    //   227: goto -> 117
    //   230: astore_0
    //   231: goto -> 164
    // Exception table:
    //   from	to	target	type
    //   16	22	226	java/lang/SecurityException
    //   26	68	71	java/lang/Exception
    //   75	106	71	java/lang/Exception
    //   106	117	226	java/lang/SecurityException
    //   117	123	230	java/lang/SecurityException
    //   127	149	152	java/lang/Exception
    //   153	164	230	java/lang/SecurityException
    //   164	176	179	java/lang/Exception
  }
  
  public static int n(String paramString) {
    ku ku = gv.b;
    ri0 ri0 = ku.b;
    dd1 dd1 = ku.c;
    if (ri0 != null) {
      int i;
      dd1 dd11;
      AtomicReference atomicReference = ev.a;
      if (dd1 == null) {
        dd11 = xg0.T0();
      } else {
        dd11 = dd1;
      } 
      if (dd1 != null)
        dd11 = dd1; 
      hv hv1 = ku.d;
      dd1 = dd11;
      if (hv1 != null)
        dd1 = dd11.z0(hv1); 
      cv cv = new cv(dd1);
      int j = ri0.a(cv, paramString, 0);
      if (j >= 0) {
        i = j;
        if (j >= paramString.length())
          return -((int)cv.b(paramString)); 
      } else {
        i = j ^ 0xFFFFFFFF;
      } 
      String str = paramString.toString();
      j = ma0.b;
      if (str.length() <= i + 35) {
        paramString = str;
      } else {
        paramString = str.substring(0, i + 32).concat("...");
      } 
      if (i > 0) {
        if (i >= str.length()) {
          paramString = x41.w("Invalid format: \"", paramString, "\" is too short");
        } else {
          StringBuilder stringBuilder = x41.q("Invalid format: \"", paramString, "\" is malformed at \"");
          stringBuilder.append(paramString.substring(i));
          stringBuilder.append('"');
          paramString = stringBuilder.toString();
        } 
      } else {
        StringBuilder stringBuilder = new StringBuilder("Invalid format: \"");
        stringBuilder.append(paramString);
        stringBuilder.append('"');
        paramString = stringBuilder.toString();
      } 
      throw new IllegalArgumentException(paramString);
    } 
    tp.j("Parsing not supported");
    return 0;
  }
  
  public static String p(int paramInt) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramInt >= 0) {
      stringBuffer.append('+');
    } else {
      stringBuffer.append('-');
      paramInt = -paramInt;
    } 
    int i = paramInt / 3600000;
    try {
      ma0.a(stringBuffer, i, 2);
    } catch (IOException iOException) {}
    i = paramInt - i * 3600000;
    paramInt = i / 60000;
    stringBuffer.append(':');
    try {
      ma0.a(stringBuffer, paramInt, 2);
    } catch (IOException iOException) {}
    paramInt = i - paramInt * 60000;
    if (paramInt == 0)
      return stringBuffer.toString(); 
    i = paramInt / 1000;
    stringBuffer.append(':');
    try {
      ma0.a(stringBuffer, i, 2);
    } catch (IOException iOException) {}
    paramInt -= i * 1000;
    if (paramInt == 0)
      return stringBuffer.toString(); 
    stringBuffer.append('.');
    try {
      ma0.a(stringBuffer, paramInt, 3);
    } catch (IOException iOException) {}
  }
  
  public static void q(eb1 parameb1) {
    Set set = parameb1.b();
    if (set != null && set.size() != 0) {
      if (set.contains("UTC")) {
        hv hv1 = parameb1.a("UTC");
        c.getClass();
        if (hv1 instanceof a02)
          return; 
        l0.l("Invalid UTC zone provided");
        return;
      } 
      l0.l("The provider doesn't support UTC");
      return;
    } 
    l0.l(jLnXOLx.jtDdoY);
  }
  
  public final long a(long paramLong1, long paramLong2) {
    int i = h(paramLong2);
    paramLong2 = paramLong1 - i;
    if (h(paramLong2) == i)
      return paramLong2; 
    int j = h(paramLong1);
    long l2 = paramLong1 - j;
    i = h(l2);
    if (j != i && j < 0) {
      long l4 = m(l2);
      long l3 = Long.MAX_VALUE;
      paramLong2 = l4;
      if (l4 == l2)
        paramLong2 = Long.MAX_VALUE; 
      l2 = paramLong1 - i;
      l4 = m(l2);
      if (l4 != l2)
        l3 = l4; 
      if (paramLong2 != l3)
        i = j; 
    } 
    paramLong2 = i;
    long l1 = paramLong1 - paramLong2;
    if ((paramLong1 ^ l1) >= 0L || (paramLong1 ^ paramLong2) >= 0L)
      return l1; 
    throw new ArithmeticException("Subtracting time zone offset caused overflow");
  }
  
  public final long b(long paramLong) {
    long l1 = h(paramLong);
    long l2 = paramLong + l1;
    if ((paramLong ^ l2) >= 0L || (paramLong ^ l1) < 0L)
      return l2; 
    throw new ArithmeticException("Adding time zone offset caused overflow");
  }
  
  public abstract boolean equals(Object paramObject);
  
  public abstract String f(long paramLong);
  
  public abstract int h(long paramLong);
  
  public int hashCode() {
    return this.b.hashCode() + 57;
  }
  
  public int i(long paramLong) {
    int i = h(paramLong);
    long l = paramLong - i;
    int j = h(l);
    if (i != j) {
      if (i - j < 0) {
        long l3 = m(l);
        long l2 = Long.MAX_VALUE;
        long l1 = l3;
        if (l3 == l)
          l1 = Long.MAX_VALUE; 
        l3 = paramLong - j;
        paramLong = m(l3);
        if (paramLong == l3)
          paramLong = l2; 
        if (l1 != paramLong)
          return i; 
      } 
    } else if (i >= 0) {
      paramLong = o(l);
      if (paramLong < l) {
        int k = h(paramLong);
        if (l - paramLong <= (k - i))
          return k; 
      } 
    } 
    return j;
  }
  
  public abstract int k(long paramLong);
  
  public abstract boolean l();
  
  public abstract long m(long paramLong);
  
  public abstract long o(long paramLong);
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */