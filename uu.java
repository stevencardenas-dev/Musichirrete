import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public enum uu implements ri0, ti0 {
  b;
  
  public static final HashMap c;
  
  public static final ArrayList e;
  
  public static final int f;
  
  public static final int g;
  
  public static final uu[] h;
  
  static {
    Enum<Enum> enum_ = new Enum<Enum>("INSTANCE", 0);
    b = (uu)enum_;
    h = new uu[] { (uu)enum_ };
    e = new ArrayList();
    ArrayList<Comparable> arrayList = new ArrayList(hv.j().b());
    Collections.sort(arrayList);
    c = new HashMap<Object, Object>();
    int m = arrayList.size();
    int i = 0;
    int j = 0;
    for (int k = j; k < m; k = n) {
      String str1 = (String)arrayList.get(k);
      int n = k + 1;
      String str2 = str1;
      int i1 = str2.indexOf('/');
      if (i1 >= 0) {
        k = i1;
        if (i1 < str2.length())
          k = i1 + 1; 
        j = Math.max(j, k);
        str1 = str2.substring(0, k + 1);
        String str = str2.substring(k);
        HashMap hashMap = c;
        if (!hashMap.containsKey(str1))
          hashMap.put(str1, new ArrayList()); 
        ((List<String>)hashMap.get(str1)).add(str);
      } else {
        e.add(str2);
      } 
      i = Math.max(i, str2.length());
    } 
    f = i;
    g = j;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface length : ()I
    //   6: istore #6
    //   8: iload #6
    //   10: getstatic uu.g : I
    //   13: iload_3
    //   14: iadd
    //   15: invokestatic min : (II)I
    //   18: istore #5
    //   20: iload_3
    //   21: istore #4
    //   23: iload #4
    //   25: iload #5
    //   27: if_icmpge -> 152
    //   30: aload_2
    //   31: iload #4
    //   33: invokeinterface charAt : (I)C
    //   38: bipush #47
    //   40: if_icmpne -> 146
    //   43: iload #4
    //   45: iconst_1
    //   46: iadd
    //   47: istore #7
    //   49: aload_2
    //   50: iload_3
    //   51: iload #7
    //   53: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   58: invokeinterface toString : ()Ljava/lang/String;
    //   63: astore #9
    //   65: aload #9
    //   67: invokevirtual length : ()I
    //   70: iload_3
    //   71: iadd
    //   72: istore #5
    //   74: iload #4
    //   76: iload #6
    //   78: if_icmpge -> 112
    //   81: aload #9
    //   83: invokestatic p : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: astore #8
    //   88: aload #8
    //   90: aload_2
    //   91: iload #7
    //   93: invokeinterface charAt : (I)C
    //   98: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #8
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: astore #8
    //   109: goto -> 116
    //   112: aload #9
    //   114: astore #8
    //   116: getstatic uu.c : Ljava/util/HashMap;
    //   119: aload #8
    //   121: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   124: checkcast java/util/List
    //   127: astore #10
    //   129: iload #5
    //   131: istore #4
    //   133: aload #10
    //   135: astore #8
    //   137: aload #10
    //   139: ifnonnull -> 164
    //   142: iload_3
    //   143: iconst_m1
    //   144: ixor
    //   145: ireturn
    //   146: iinc #4, 1
    //   149: goto -> 23
    //   152: getstatic uu.e : Ljava/util/ArrayList;
    //   155: astore #8
    //   157: ldc ''
    //   159: astore #9
    //   161: iload_3
    //   162: istore #4
    //   164: iconst_0
    //   165: istore #5
    //   167: aconst_null
    //   168: astore #10
    //   170: iload #5
    //   172: aload #8
    //   174: invokeinterface size : ()I
    //   179: if_icmpge -> 247
    //   182: aload #8
    //   184: iload #5
    //   186: invokeinterface get : (I)Ljava/lang/Object;
    //   191: checkcast java/lang/String
    //   194: astore #12
    //   196: aload #10
    //   198: astore #11
    //   200: aload #12
    //   202: aload_2
    //   203: iload #4
    //   205: invokestatic o : (Ljava/lang/String;Ljava/lang/CharSequence;I)Z
    //   208: ifeq -> 237
    //   211: aload #10
    //   213: ifnull -> 233
    //   216: aload #10
    //   218: astore #11
    //   220: aload #12
    //   222: invokevirtual length : ()I
    //   225: aload #10
    //   227: invokevirtual length : ()I
    //   230: if_icmple -> 237
    //   233: aload #12
    //   235: astore #11
    //   237: iinc #5, 1
    //   240: aload #11
    //   242: astore #10
    //   244: goto -> 170
    //   247: aload #10
    //   249: ifnull -> 282
    //   252: aload #9
    //   254: aload #10
    //   256: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   259: invokestatic c : (Ljava/lang/String;)Lhv;
    //   262: astore_2
    //   263: aload_1
    //   264: aconst_null
    //   265: putfield i : Lbv;
    //   268: aload_1
    //   269: aload_2
    //   270: putfield d : Lhv;
    //   273: aload #10
    //   275: invokevirtual length : ()I
    //   278: iload #4
    //   280: iadd
    //   281: ireturn
    //   282: iload_3
    //   283: iconst_m1
    //   284: ixor
    //   285: ireturn
  }
  
  public final int b() {
    return f;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {}
  
  public final int d() {
    return f;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    String str;
    if (paramhv != null) {
      str = paramhv.b;
    } else {
      str = "";
    } 
    paramStringBuilder.append(str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */