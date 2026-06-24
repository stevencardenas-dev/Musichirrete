package j$.time;

import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.zone.f;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ZoneOffset extends ZoneId implements n, o, Comparable<ZoneOffset>, Serializable {
  public static final ConcurrentMap c = new ConcurrentHashMap<Object, Object>(16, 0.75F, 4);
  
  public static final ConcurrentMap d = new ConcurrentHashMap<Object, Object>(16, 0.75F, 4);
  
  public static final ZoneOffset e = ofTotalSeconds(0);
  
  public static final ZoneOffset f = ofTotalSeconds(-64800);
  
  public static final ZoneOffset g = ofTotalSeconds(64800);
  
  private static final long serialVersionUID = 2357656521762053153L;
  
  public final int a;
  
  public final transient String b;
  
  public ZoneOffset(int paramInt) {
    String str;
    this.a = paramInt;
    if (paramInt == 0) {
      str = "Z";
    } else {
      int j = Math.abs(paramInt);
      StringBuilder stringBuilder = new StringBuilder();
      int k = j / 3600;
      int i = j / 60 % 60;
      if (paramInt < 0) {
        str = "-";
      } else {
        str = "+";
      } 
      stringBuilder.append(str);
      if (k < 10) {
        str = "0";
      } else {
        str = "";
      } 
      stringBuilder.append(str);
      stringBuilder.append(k);
      String str1 = ":";
      if (i < 10) {
        str = ":0";
      } else {
        str = ":";
      } 
      stringBuilder.append(str);
      stringBuilder.append(i);
      paramInt = j % 60;
      if (paramInt != 0) {
        str = str1;
        if (paramInt < 10)
          str = ":0"; 
        stringBuilder.append(str);
        stringBuilder.append(paramInt);
      } 
      str = stringBuilder.toString();
    } 
    this.b = str;
  }
  
  public static ZoneOffset I(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'offsetId'
    //   3: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   6: pop
    //   7: getstatic j$/time/ZoneOffset.d : Ljava/util/concurrent/ConcurrentMap;
    //   10: checkcast java/util/concurrent/ConcurrentHashMap
    //   13: aload_0
    //   14: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast j$/time/ZoneOffset
    //   20: astore #7
    //   22: aload #7
    //   24: ifnull -> 30
    //   27: aload #7
    //   29: areturn
    //   30: aload_0
    //   31: invokevirtual length : ()I
    //   34: istore_3
    //   35: iload_3
    //   36: iconst_2
    //   37: if_icmpeq -> 177
    //   40: aload_0
    //   41: astore #7
    //   43: iload_3
    //   44: iconst_3
    //   45: if_icmpeq -> 222
    //   48: iload_3
    //   49: iconst_5
    //   50: if_icmpeq -> 159
    //   53: iload_3
    //   54: bipush #6
    //   56: if_icmpeq -> 138
    //   59: iload_3
    //   60: bipush #7
    //   62: if_icmpeq -> 112
    //   65: iload_3
    //   66: bipush #9
    //   68: if_icmpne -> 98
    //   71: aload_0
    //   72: iconst_1
    //   73: iconst_0
    //   74: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   77: istore_3
    //   78: aload_0
    //   79: iconst_4
    //   80: iconst_1
    //   81: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   84: istore #4
    //   86: aload_0
    //   87: bipush #7
    //   89: iconst_1
    //   90: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   93: istore #5
    //   95: goto -> 239
    //   98: new java/lang/RuntimeException
    //   101: dup
    //   102: ldc 'Invalid ID for ZoneOffset, invalid format: '
    //   104: aload_0
    //   105: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: athrow
    //   112: aload_0
    //   113: iconst_1
    //   114: iconst_0
    //   115: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   118: istore_3
    //   119: aload_0
    //   120: iconst_3
    //   121: iconst_0
    //   122: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   125: istore #4
    //   127: aload_0
    //   128: iconst_5
    //   129: iconst_0
    //   130: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   133: istore #5
    //   135: goto -> 239
    //   138: aload_0
    //   139: iconst_1
    //   140: iconst_0
    //   141: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   144: istore_3
    //   145: aload_0
    //   146: iconst_4
    //   147: iconst_1
    //   148: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   151: istore #4
    //   153: iconst_0
    //   154: istore #5
    //   156: goto -> 239
    //   159: aload_0
    //   160: iconst_1
    //   161: iconst_0
    //   162: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   165: istore_3
    //   166: aload_0
    //   167: iconst_3
    //   168: iconst_0
    //   169: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   172: istore #4
    //   174: goto -> 153
    //   177: aload_0
    //   178: iconst_0
    //   179: invokevirtual charAt : (I)C
    //   182: istore_2
    //   183: aload_0
    //   184: iconst_1
    //   185: invokevirtual charAt : (I)C
    //   188: istore_1
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore_0
    //   197: aload_0
    //   198: iload_2
    //   199: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: aload_0
    //   204: ldc '0'
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload_0
    //   211: iload_1
    //   212: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_0
    //   217: invokevirtual toString : ()Ljava/lang/String;
    //   220: astore #7
    //   222: aload #7
    //   224: iconst_1
    //   225: iconst_0
    //   226: invokestatic K : (Ljava/lang/CharSequence;IZ)I
    //   229: istore_3
    //   230: iconst_0
    //   231: istore #4
    //   233: iconst_0
    //   234: istore #5
    //   236: aload #7
    //   238: astore_0
    //   239: aload_0
    //   240: iconst_0
    //   241: invokevirtual charAt : (I)C
    //   244: istore #6
    //   246: iload #6
    //   248: bipush #43
    //   250: if_icmpeq -> 277
    //   253: iload #6
    //   255: bipush #45
    //   257: if_icmpne -> 263
    //   260: goto -> 277
    //   263: new java/lang/RuntimeException
    //   266: dup
    //   267: ldc 'Invalid ID for ZoneOffset, plus/minus not found when expected: '
    //   269: aload_0
    //   270: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   273: invokespecial <init> : (Ljava/lang/String;)V
    //   276: athrow
    //   277: iload #6
    //   279: bipush #45
    //   281: if_icmpne -> 296
    //   284: iload_3
    //   285: ineg
    //   286: iload #4
    //   288: ineg
    //   289: iload #5
    //   291: ineg
    //   292: invokestatic J : (III)Lj$/time/ZoneOffset;
    //   295: areturn
    //   296: iload_3
    //   297: iload #4
    //   299: iload #5
    //   301: invokestatic J : (III)Lj$/time/ZoneOffset;
    //   304: areturn
  }
  
  public static ZoneOffset J(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= -18 && paramInt1 <= 18) {
      if (paramInt1 > 0) {
        if (paramInt2 < 0 || paramInt3 < 0)
          throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive"); 
      } else if (paramInt1 < 0) {
        if (paramInt2 > 0 || paramInt3 > 0)
          throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative"); 
      } else if ((paramInt2 > 0 && paramInt3 < 0) || (paramInt2 < 0 && paramInt3 > 0)) {
        throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
      } 
      if (paramInt2 >= -59 && paramInt2 <= 59) {
        if (paramInt3 >= -59 && paramInt3 <= 59) {
          if (Math.abs(paramInt1) != 18 || (paramInt2 | paramInt3) == 0)
            return ofTotalSeconds(paramInt2 * 60 + paramInt1 * 3600 + paramInt3); 
          throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        } 
        f.b("Zone offset seconds not in valid range: value ", paramInt3, " is not in the range -59 to 59");
        return null;
      } 
      f.b("Zone offset minutes not in valid range: value ", paramInt2, " is not in the range -59 to 59");
      return null;
    } 
    f.b("Zone offset hours not in valid range: value ", paramInt1, " is not in the range -18 to 18");
    return null;
  }
  
  public static int K(CharSequence paramCharSequence, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      String str1 = (String)paramCharSequence;
      if (str1.charAt(paramInt - 1) != ':') {
        paramCharSequence = new StringBuilder("Invalid ID for ZoneOffset, colon not found when expected: ");
        paramCharSequence.append(str1);
        throw new RuntimeException(paramCharSequence.toString());
      } 
    } 
    String str = (String)paramCharSequence;
    char c = str.charAt(paramInt);
    paramInt = str.charAt(paramInt + 1);
    if (c >= '0' && c <= '9' && paramInt >= 48 && paramInt <= 57)
      return paramInt - 48 + (c - 48) * 10; 
    paramCharSequence = new StringBuilder("Invalid ID for ZoneOffset, non numeric characters found: ");
    paramCharSequence.append(str);
    throw new RuntimeException(paramCharSequence.toString());
  }
  
  public static ZoneOffset L(DataInput paramDataInput) {
    byte b = paramDataInput.readByte();
    return (b == Byte.MAX_VALUE) ? ofTotalSeconds(paramDataInput.readInt()) : ofTotalSeconds(b * 900);
  }
  
  public static ZoneOffset ofTotalSeconds(int paramInt) {
    if (paramInt >= -64800 && paramInt <= 64800) {
      if (paramInt % 900 == 0) {
        Integer integer = Integer.valueOf(paramInt);
        ConcurrentMap concurrentMap = c;
        ZoneOffset zoneOffset = (ZoneOffset)((ConcurrentHashMap)concurrentMap).get(integer);
        if (zoneOffset == null) {
          zoneOffset = new ZoneOffset(paramInt);
          ((ConcurrentHashMap<Integer, ZoneOffset>)concurrentMap).putIfAbsent(integer, zoneOffset);
          zoneOffset = (ZoneOffset)((ConcurrentHashMap)concurrentMap).get(integer);
          ConcurrentMap concurrentMap1 = d;
          String str = zoneOffset.b;
          ((ConcurrentHashMap<String, ZoneOffset>)concurrentMap1).putIfAbsent(str, zoneOffset);
          return zoneOffset;
        } 
        return zoneOffset;
      } 
      return new ZoneOffset(paramInt);
    } 
    throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)8, this);
  }
  
  public final void G(DataOutput paramDataOutput) {
    paramDataOutput.writeByte(8);
    M(paramDataOutput);
  }
  
  public final void M(DataOutput paramDataOutput) {
    byte b;
    int i = this.a;
    if (i % 900 == 0) {
      b = i / 900;
    } else {
      b = 127;
    } 
    paramDataOutput.writeByte(b);
    if (b == 127)
      paramDataOutput.writeInt(i); 
  }
  
  public final Object b(b paramb) {
    Object object = this;
    if (paramb != r.d)
      if (paramb == r.e) {
        object = this;
      } else {
        object = super.b(paramb);
      }  
    return object;
  }
  
  public final m c(m paramm) {
    a a = a.OFFSET_SECONDS;
    return paramm.h(this.a, (q)a);
  }
  
  public final int compareTo(Object paramObject) {
    return ((ZoneOffset)paramObject).a - this.a;
  }
  
  public final int e(q paramq) {
    if (paramq == a.OFFSET_SECONDS)
      return this.a; 
    if (paramq == null)
      return j(paramq).a(g(paramq), paramq); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof ZoneOffset && this.a == ((ZoneOffset)paramObject).a));
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.OFFSET_SECONDS) : (paramq != null && paramq.r(this)));
  }
  
  public final long g(q paramq) {
    if (paramq == a.OFFSET_SECONDS)
      return this.a; 
    if (!(paramq instanceof a))
      return paramq.E(this); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  public final String getId() {
    return this.b;
  }
  
  public int getTotalSeconds() {
    return this.a;
  }
  
  public final int hashCode() {
    return this.a;
  }
  
  public final f r() {
    return new f(this);
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\ZoneOffset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */