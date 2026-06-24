public final class nx implements Comparable {
  public final boolean b;
  
  public final String c;
  
  public final ox e;
  
  public final boolean f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final boolean j;
  
  public final int k;
  
  public final int l;
  
  public final int m;
  
  public nx(la0 paramla0, ox paramox, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_2
    //   6: putfield e : Lox;
    //   9: aload_0
    //   10: aload_1
    //   11: getfield C : Ljava/lang/String;
    //   14: invokestatic x : (Ljava/lang/String;)Ljava/lang/String;
    //   17: putfield c : Ljava/lang/String;
    //   20: iconst_0
    //   21: istore #4
    //   23: aload_0
    //   24: iload_3
    //   25: iconst_0
    //   26: invokestatic t : (IZ)Z
    //   29: putfield f : Z
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: getfield b : Ljava/lang/String;
    //   38: iconst_0
    //   39: invokestatic r : (Lla0;Ljava/lang/String;Z)I
    //   42: putfield g : I
    //   45: aload_1
    //   46: getfield e : I
    //   49: istore_3
    //   50: iconst_1
    //   51: istore #7
    //   53: iload_3
    //   54: iconst_1
    //   55: iand
    //   56: ifeq -> 65
    //   59: iconst_1
    //   60: istore #6
    //   62: goto -> 68
    //   65: iconst_0
    //   66: istore #6
    //   68: aload_0
    //   69: iload #6
    //   71: putfield j : Z
    //   74: aload_1
    //   75: getfield x : I
    //   78: istore_3
    //   79: aload_0
    //   80: iload_3
    //   81: putfield k : I
    //   84: aload_0
    //   85: aload_1
    //   86: getfield y : I
    //   89: putfield l : I
    //   92: aload_1
    //   93: getfield g : I
    //   96: istore #5
    //   98: aload_0
    //   99: iload #5
    //   101: putfield m : I
    //   104: iload #5
    //   106: iconst_m1
    //   107: if_icmpeq -> 119
    //   110: iload #5
    //   112: aload_2
    //   113: getfield s : I
    //   116: if_icmpgt -> 143
    //   119: iload #7
    //   121: istore #6
    //   123: iload_3
    //   124: iconst_m1
    //   125: if_icmpeq -> 146
    //   128: iload_3
    //   129: aload_2
    //   130: getfield r : I
    //   133: if_icmpgt -> 143
    //   136: iload #7
    //   138: istore #6
    //   140: goto -> 146
    //   143: iconst_0
    //   144: istore #6
    //   146: aload_0
    //   147: iload #6
    //   149: putfield b : Z
    //   152: getstatic d12.a : I
    //   155: istore_3
    //   156: invokestatic getSystem : ()Landroid/content/res/Resources;
    //   159: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   162: astore_2
    //   163: getstatic d12.a : I
    //   166: istore_3
    //   167: iload_3
    //   168: bipush #24
    //   170: if_icmplt -> 190
    //   173: aload_2
    //   174: invokevirtual getLocales : ()Landroid/os/LocaleList;
    //   177: invokevirtual toLanguageTags : ()Ljava/lang/String;
    //   180: ldc ','
    //   182: iconst_m1
    //   183: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   186: astore_2
    //   187: goto -> 223
    //   190: aload_2
    //   191: getfield locale : Ljava/util/Locale;
    //   194: astore_2
    //   195: iload_3
    //   196: bipush #21
    //   198: if_icmplt -> 209
    //   201: aload_2
    //   202: invokevirtual toLanguageTag : ()Ljava/lang/String;
    //   205: astore_2
    //   206: goto -> 214
    //   209: aload_2
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: astore_2
    //   214: iconst_1
    //   215: anewarray java/lang/String
    //   218: dup
    //   219: iconst_0
    //   220: aload_2
    //   221: aastore
    //   222: astore_2
    //   223: iconst_0
    //   224: istore_3
    //   225: iload_3
    //   226: aload_2
    //   227: arraylength
    //   228: if_icmpge -> 246
    //   231: aload_2
    //   232: iload_3
    //   233: aload_2
    //   234: iload_3
    //   235: aaload
    //   236: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   239: aastore
    //   240: iinc #3, 1
    //   243: goto -> 225
    //   246: iconst_0
    //   247: istore_3
    //   248: iload_3
    //   249: aload_2
    //   250: arraylength
    //   251: if_icmpge -> 282
    //   254: aload_1
    //   255: aload_2
    //   256: iload_3
    //   257: aaload
    //   258: iconst_0
    //   259: invokestatic r : (Lla0;Ljava/lang/String;Z)I
    //   262: istore #5
    //   264: iload #5
    //   266: ifle -> 276
    //   269: iload #5
    //   271: istore #4
    //   273: goto -> 285
    //   276: iinc #3, 1
    //   279: goto -> 248
    //   282: ldc 2147483647
    //   284: istore_3
    //   285: aload_0
    //   286: iload_3
    //   287: putfield h : I
    //   290: aload_0
    //   291: iload #4
    //   293: putfield i : I
    //   296: return
  }
  
  public final int a(nx paramnx) {
    boolean bool2 = paramnx.f;
    int j = paramnx.m;
    int i = -1;
    boolean bool1 = this.f;
    if (bool1 != bool2) {
      if (bool1)
        return 1; 
    } else {
      int k = paramnx.g;
      int m = this.g;
      if (m != k)
        return zv0.i(m, k); 
      boolean bool = paramnx.b;
      bool2 = this.b;
      if (bool2 != bool) {
        if (bool2)
          return 1; 
      } else {
        bool = this.e.x;
        m = this.m;
        if (bool) {
          k = zv0.l(m, j);
          if (k != 0)
            return (k > 0) ? -1 : 1; 
        } 
        boolean bool3 = paramnx.j;
        bool = this.j;
        if (bool != bool3)
          return bool ? 1 : -1; 
        int n = paramnx.h;
        k = this.h;
        if (k != n)
          return -zv0.i(k, n); 
        k = paramnx.i;
        n = this.i;
        if (n != k)
          return zv0.i(n, k); 
        k = i;
        if (bool2) {
          k = i;
          if (bool1)
            k = 1; 
        } 
        n = paramnx.k;
        i = this.k;
        if (i != n)
          return zv0.i(i, n) * k; 
        n = paramnx.l;
        i = this.l;
        return (i != n) ? (zv0.i(i, n) * k) : (d12.a(this.c, paramnx.c) ? (zv0.i(m, j) * k) : 0);
      } 
    } 
    return -1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */