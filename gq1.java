import java.util.ArrayList;
import java.util.List;

public abstract class gq1 extends oq1 {
  public static boolean H0(String paramString1, String paramString2) {
    return (J0(paramString1, paramString2, 0, 2) >= 0);
  }
  
  public static final int I0(CharSequence paramCharSequence, String paramString, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_1
    //   6: invokevirtual getClass : ()Ljava/lang/Class;
    //   9: pop
    //   10: iload_3
    //   11: ifne -> 34
    //   14: aload_0
    //   15: instanceof java/lang/String
    //   18: ifne -> 24
    //   21: goto -> 34
    //   24: aload_0
    //   25: checkcast java/lang/String
    //   28: aload_1
    //   29: iload_2
    //   30: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   33: ireturn
    //   34: aload_0
    //   35: invokeinterface length : ()I
    //   40: istore #5
    //   42: iload_2
    //   43: istore #4
    //   45: iload_2
    //   46: ifge -> 52
    //   49: iconst_0
    //   50: istore #4
    //   52: aload_0
    //   53: invokeinterface length : ()I
    //   58: istore #6
    //   60: iload #5
    //   62: istore_2
    //   63: iload #5
    //   65: iload #6
    //   67: if_icmple -> 73
    //   70: iload #6
    //   72: istore_2
    //   73: new ji0
    //   76: dup
    //   77: iload #4
    //   79: iload_2
    //   80: iconst_1
    //   81: invokespecial <init> : (III)V
    //   84: astore #8
    //   86: aload_0
    //   87: instanceof java/lang/String
    //   90: istore #7
    //   92: aload #8
    //   94: getfield e : I
    //   97: istore #6
    //   99: aload #8
    //   101: getfield c : I
    //   104: istore #5
    //   106: aload #8
    //   108: getfield b : I
    //   111: istore #4
    //   113: iload #7
    //   115: ifeq -> 218
    //   118: aload_1
    //   119: instanceof java/lang/String
    //   122: ifeq -> 218
    //   125: iload #6
    //   127: ifle -> 137
    //   130: iload #4
    //   132: iload #5
    //   134: if_icmple -> 149
    //   137: iload #6
    //   139: ifge -> 281
    //   142: iload #5
    //   144: iload #4
    //   146: if_icmpgt -> 281
    //   149: iload #4
    //   151: istore_2
    //   152: aload_0
    //   153: checkcast java/lang/String
    //   156: astore #8
    //   158: aload_1
    //   159: invokevirtual length : ()I
    //   162: istore #4
    //   164: iload_3
    //   165: ifne -> 183
    //   168: aload_1
    //   169: iconst_0
    //   170: aload #8
    //   172: iload_2
    //   173: iload #4
    //   175: invokevirtual regionMatches : (ILjava/lang/String;II)Z
    //   178: istore #7
    //   180: goto -> 196
    //   183: aload_1
    //   184: iload_3
    //   185: iconst_0
    //   186: aload #8
    //   188: iload_2
    //   189: iload #4
    //   191: invokevirtual regionMatches : (ZILjava/lang/String;II)Z
    //   194: istore #7
    //   196: iload #7
    //   198: ifeq -> 204
    //   201: goto -> 283
    //   204: iload_2
    //   205: iload #5
    //   207: if_icmpeq -> 281
    //   210: iload_2
    //   211: iload #6
    //   213: iadd
    //   214: istore_2
    //   215: goto -> 152
    //   218: iload #6
    //   220: ifle -> 233
    //   223: iload #4
    //   225: istore_2
    //   226: iload #4
    //   228: iload #5
    //   230: if_icmple -> 248
    //   233: iload #6
    //   235: ifge -> 281
    //   238: iload #5
    //   240: iload #4
    //   242: if_icmpgt -> 281
    //   245: iload #4
    //   247: istore_2
    //   248: aload_1
    //   249: aload_0
    //   250: iload_2
    //   251: aload_1
    //   252: invokeinterface length : ()I
    //   257: iload_3
    //   258: invokestatic N0 : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z
    //   261: ifeq -> 267
    //   264: goto -> 283
    //   267: iload_2
    //   268: iload #5
    //   270: if_icmpeq -> 281
    //   273: iload_2
    //   274: iload #6
    //   276: iadd
    //   277: istore_2
    //   278: goto -> 248
    //   281: iconst_m1
    //   282: istore_2
    //   283: iload_2
    //   284: ireturn
  }
  
  public static int K0(String paramString, char paramChar) {
    return paramString.indexOf(paramChar, 0);
  }
  
  public static boolean L0(String paramString) {
    paramString.getClass();
    for (byte b = 0; b < paramString.length(); b++) {
      if (!z51.y(paramString.charAt(b)))
        return false; 
    } 
    return true;
  }
  
  public static List M0(String paramString) {
    mn0 mn0 = new mn0(paramString);
    if (!mn0.hasNext())
      return d40.b; 
    Object object = mn0.next();
    if (!mn0.hasNext())
      return zo2.E(object); 
    ArrayList<Object> arrayList = new ArrayList();
    arrayList.add(object);
    while (mn0.hasNext())
      arrayList.add(mn0.next()); 
    return arrayList;
  }
  
  public static final boolean N0(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean) {
    paramCharSequence1.getClass();
    paramCharSequence2.getClass();
    if (paramInt1 >= 0 && paramCharSequence1.length() - paramInt2 >= 0 && paramInt1 <= paramCharSequence2.length() - paramInt2)
      for (byte b = 0;; b++) {
        if (b < paramInt2) {
          char c1 = paramCharSequence1.charAt(b);
          char c2 = paramCharSequence2.charAt(paramInt1 + b);
          if (c1 == c2)
            continue; 
          if (!paramBoolean)
            break; 
          c1 = Character.toUpperCase(c1);
          c2 = Character.toUpperCase(c2);
          if (c1 == c2 || Character.toLowerCase(c1) == Character.toLowerCase(c2))
            continue; 
          break;
        } 
        return true;
      }  
    return false;
  }
  
  public static String O0(String paramString1, String paramString2) {
    int i = J0(paramString1, paramString2, 0, 6);
    return (i == -1) ? paramString1 : paramString1.substring(paramString2.length() + i, paramString1.length());
  }
  
  public static String P0(String paramString) {
    paramString.getClass();
    int i = paramString.length();
    if (127 <= i)
      i = 127; 
    return paramString.substring(0, i);
  }
  
  public static CharSequence Q0(String paramString) {
    paramString.getClass();
    int i = paramString.length() - 1;
    byte b = 0;
    boolean bool = false;
    while (b <= i) {
      int j;
      if (!bool) {
        j = b;
      } else {
        j = i;
      } 
      boolean bool1 = z51.y(paramString.charAt(j));
      if (!bool) {
        if (!bool1) {
          bool = true;
          continue;
        } 
        b++;
        continue;
      } 
      if (!bool1)
        break; 
      i--;
    } 
    return paramString.subSequence(b, i + 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */