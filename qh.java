import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class qh implements Serializable, Comparable {
  public static final char[] f = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public final byte[] b;
  
  public transient int c;
  
  public transient String e;
  
  public qh(byte[] paramArrayOfbyte) {
    this.b = paramArrayOfbyte;
  }
  
  public static void a(String paramString) {
    if (paramString.length() % 2 == 0) {
      int i = paramString.length() / 2;
      byte[] arrayOfByte = new byte[i];
      for (byte b = 0; b < i; b++) {
        int k = b * 2;
        int j = b(paramString.charAt(k));
        arrayOfByte[b] = (byte)(b(paramString.charAt(k + 1)) + (j << 4));
      } 
      return;
    } 
    l0.l("Unexpected hex string: ".concat(paramString));
  }
  
  public static int b(char paramChar) {
    if (paramChar >= '0' && paramChar <= '9')
      return paramChar - 48; 
    if (paramChar >= 'a' && paramChar <= 'f')
      return paramChar - 87; 
    if (paramChar >= 'A' && paramChar <= 'F')
      return paramChar - 55; 
    StringBuilder stringBuilder = new StringBuilder("Unexpected hex digit: ");
    stringBuilder.append(paramChar);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public byte c(int paramInt) {
    return this.b[paramInt];
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int j = e();
    int k = paramObject.e();
    int i = Math.min(j, k);
    byte b = 0;
    while (b < i) {
      int n = c(b) & 0xFF;
      int m = paramObject.c(b) & 0xFF;
      if (n == m) {
        b++;
        continue;
      } 
      return (n < m) ? -1 : 1;
    } 
    return (j == k) ? 0 : ((j < k) ? -1 : 1);
  }
  
  public String d() {
    byte[] arrayOfByte = this.b;
    char[] arrayOfChar = new char[arrayOfByte.length * 2];
    int j = arrayOfByte.length;
    byte b = 0;
    int i = 0;
    while (true) {
      int k = i;
      if (b < j) {
        byte b1 = arrayOfByte[b];
        char[] arrayOfChar1 = f;
        arrayOfChar[k] = arrayOfChar1[b1 >> 4 & 0xF];
        i = k + 2;
        arrayOfChar[k + 1] = arrayOfChar1[b1 & 0xF];
        b++;
        continue;
      } 
      return new String(arrayOfChar);
    } 
  }
  
  public int e() {
    return this.b.length;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof qh) {
      qh qh1 = (qh)paramObject;
      int i = qh1.e();
      paramObject = this.b;
      if (i == paramObject.length) {
        int j = paramObject.length;
        byte[] arrayOfByte = qh1.b;
        if (arrayOfByte.length - j >= 0 && paramObject.length - j >= 0) {
          Charset charset = c12.a;
          for (i = 0; i < j; i++) {
            if (arrayOfByte[i + 0] != paramObject[i + 0])
              // Byte code: goto -> 102 
          } 
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0)
          return true; 
      } 
    } 
    return false;
  }
  
  public int hashCode() {
    int i = this.c;
    if (i != 0)
      return i; 
    i = Arrays.hashCode(this.b);
    this.c = i;
    return i;
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : [B
    //   4: astore #6
    //   6: aload #6
    //   8: arraylength
    //   9: ifne -> 15
    //   12: ldc '[size=0]'
    //   14: areturn
    //   15: aload_0
    //   16: getfield e : Ljava/lang/String;
    //   19: astore #5
    //   21: aload #5
    //   23: ifnull -> 29
    //   26: goto -> 49
    //   29: new java/lang/String
    //   32: dup
    //   33: aload #6
    //   35: getstatic c12.a : Ljava/nio/charset/Charset;
    //   38: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   41: astore #5
    //   43: aload_0
    //   44: aload #5
    //   46: putfield e : Ljava/lang/String;
    //   49: aload #5
    //   51: invokevirtual length : ()I
    //   54: istore_3
    //   55: iconst_0
    //   56: istore_1
    //   57: iconst_0
    //   58: istore_2
    //   59: iload_1
    //   60: iload_3
    //   61: if_icmpge -> 129
    //   64: iload_2
    //   65: bipush #64
    //   67: if_icmpne -> 73
    //   70: goto -> 135
    //   73: aload #5
    //   75: iload_1
    //   76: invokevirtual codePointAt : (I)I
    //   79: istore #4
    //   81: iload #4
    //   83: invokestatic isISOControl : (I)Z
    //   86: ifeq -> 103
    //   89: iload #4
    //   91: bipush #10
    //   93: if_icmpeq -> 103
    //   96: iload #4
    //   98: bipush #13
    //   100: if_icmpne -> 110
    //   103: iload #4
    //   105: ldc 65533
    //   107: if_icmpne -> 115
    //   110: iconst_m1
    //   111: istore_1
    //   112: goto -> 135
    //   115: iinc #2, 1
    //   118: iload_1
    //   119: iload #4
    //   121: invokestatic charCount : (I)I
    //   124: iadd
    //   125: istore_1
    //   126: goto -> 59
    //   129: aload #5
    //   131: invokevirtual length : ()I
    //   134: istore_1
    //   135: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.oHIJcmoKRjvLQZ : Ljava/lang/String;
    //   138: astore #7
    //   140: iload_1
    //   141: iconst_m1
    //   142: if_icmpne -> 317
    //   145: aload #6
    //   147: arraylength
    //   148: bipush #64
    //   150: if_icmpgt -> 188
    //   153: new java/lang/StringBuilder
    //   156: dup
    //   157: ldc '[hex='
    //   159: invokespecial <init> : (Ljava/lang/String;)V
    //   162: astore #5
    //   164: aload #5
    //   166: aload_0
    //   167: invokevirtual d : ()Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload #5
    //   176: aload #7
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #5
    //   184: invokevirtual toString : ()Ljava/lang/String;
    //   187: areturn
    //   188: new java/lang/StringBuilder
    //   191: dup
    //   192: ldc '[size='
    //   194: invokespecial <init> : (Ljava/lang/String;)V
    //   197: astore #7
    //   199: aload #7
    //   201: aload #6
    //   203: arraylength
    //   204: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload #7
    //   210: ldc ' hex='
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: bipush #64
    //   218: aload #6
    //   220: arraylength
    //   221: if_icmpgt -> 269
    //   224: bipush #64
    //   226: aload #6
    //   228: arraylength
    //   229: if_icmpne -> 238
    //   232: aload_0
    //   233: astore #5
    //   235: goto -> 292
    //   238: bipush #64
    //   240: newarray byte
    //   242: astore #5
    //   244: aload #6
    //   246: iconst_0
    //   247: aload #5
    //   249: iconst_0
    //   250: bipush #64
    //   252: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   255: new qh
    //   258: dup
    //   259: aload #5
    //   261: invokespecial <init> : ([B)V
    //   264: astore #5
    //   266: goto -> 292
    //   269: new java/lang/StringBuilder
    //   272: dup
    //   273: ldc 'endIndex > length('
    //   275: invokespecial <init> : (Ljava/lang/String;)V
    //   278: aload #6
    //   280: arraylength
    //   281: ldc ')'
    //   283: invokestatic m : (Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;
    //   286: invokestatic l : (Ljava/lang/String;)V
    //   289: aconst_null
    //   290: astore #5
    //   292: aload #7
    //   294: aload #5
    //   296: invokevirtual d : ()Ljava/lang/String;
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload #7
    //   305: ldc '…]'
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload #7
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: areturn
    //   317: aload #5
    //   319: iconst_0
    //   320: iload_1
    //   321: invokevirtual substring : (II)Ljava/lang/String;
    //   324: ldc '\'
    //   326: ldc '\\'
    //   328: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   331: ldc '\\n'
    //   333: ldc '\n'
    //   335: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   338: ldc '\\r'
    //   340: ldc '\r'
    //   342: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   345: astore #8
    //   347: iload_1
    //   348: aload #5
    //   350: invokevirtual length : ()I
    //   353: if_icmpge -> 406
    //   356: new java/lang/StringBuilder
    //   359: dup
    //   360: ldc '[size='
    //   362: invokespecial <init> : (Ljava/lang/String;)V
    //   365: astore #5
    //   367: aload #5
    //   369: aload #6
    //   371: arraylength
    //   372: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload #5
    //   378: ldc ' text='
    //   380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: pop
    //   384: aload #5
    //   386: aload #8
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: pop
    //   392: aload #5
    //   394: ldc '…]'
    //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: pop
    //   400: aload #5
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: areturn
    //   406: ldc '[text='
    //   408: aload #8
    //   410: aload #7
    //   412: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   415: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */