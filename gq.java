import android.view.ViewGroup;

public final class gq extends ViewGroup.MarginLayoutParams {
  public int A = Integer.MIN_VALUE;
  
  public int B = Integer.MIN_VALUE;
  
  public int C = Integer.MIN_VALUE;
  
  public int D = 0;
  
  public float E = 0.5F;
  
  public float F = 0.5F;
  
  public String G = null;
  
  public float H = -1.0F;
  
  public float I = -1.0F;
  
  public int J = 0;
  
  public int K = 0;
  
  public int L = 0;
  
  public int M = 0;
  
  public int N = 0;
  
  public int O = 0;
  
  public int P = 0;
  
  public int Q = 0;
  
  public float R = 1.0F;
  
  public float S = 1.0F;
  
  public int T = -1;
  
  public int U = -1;
  
  public int V = -1;
  
  public boolean W = false;
  
  public boolean X = false;
  
  public String Y = null;
  
  public int Z = 0;
  
  public int a = -1;
  
  public boolean a0 = true;
  
  public int b = -1;
  
  public boolean b0 = true;
  
  public float c = -1.0F;
  
  public boolean c0 = false;
  
  public boolean d = true;
  
  public boolean d0 = false;
  
  public int e = -1;
  
  public boolean e0 = false;
  
  public int f = -1;
  
  public boolean f0 = false;
  
  public int g = -1;
  
  public int g0 = -1;
  
  public int h = -1;
  
  public int h0 = -1;
  
  public int i = -1;
  
  public int i0 = -1;
  
  public int j = -1;
  
  public int j0 = -1;
  
  public int k = -1;
  
  public int k0 = Integer.MIN_VALUE;
  
  public int l = -1;
  
  public int l0 = Integer.MIN_VALUE;
  
  public int m = -1;
  
  public float m0 = 0.5F;
  
  public int n = -1;
  
  public int n0;
  
  public int o = -1;
  
  public int o0;
  
  public int p = -1;
  
  public float p0;
  
  public int q = 0;
  
  public er q0 = new er();
  
  public float r = 0.0F;
  
  public int s = -1;
  
  public int t = -1;
  
  public int u = -1;
  
  public int v = -1;
  
  public int w = Integer.MIN_VALUE;
  
  public int x = Integer.MIN_VALUE;
  
  public int y = Integer.MIN_VALUE;
  
  public int z = Integer.MIN_VALUE;
  
  public gq(int paramInt) {
    super(paramInt, -2);
  }
  
  public final void a() {
    this.d0 = false;
    this.a0 = true;
    this.b0 = true;
    int i = this.width;
    if (i == -2 && this.W) {
      this.a0 = false;
      if (this.L == 0)
        this.L = 1; 
    } 
    int j = this.height;
    if (j == -2 && this.X) {
      this.b0 = false;
      if (this.M == 0)
        this.M = 1; 
    } 
    if (i == 0 || i == -1) {
      this.a0 = false;
      if (i == 0 && this.L == 1) {
        this.width = -2;
        this.W = true;
      } 
    } 
    if (j == 0 || j == -1) {
      this.b0 = false;
      if (j == 0 && this.M == 1) {
        this.height = -2;
        this.X = true;
      } 
    } 
    if (this.c != -1.0F || this.a != -1 || this.b != -1) {
      this.d0 = true;
      this.a0 = true;
      this.b0 = true;
      if (!(this.q0 instanceof bf0))
        this.q0 = new bf0(); 
      ((bf0)this.q0).O(this.V);
      return;
    } 
  }
  
  public final void resolveLayoutDirection(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield leftMargin : I
    //   4: istore #5
    //   6: aload_0
    //   7: getfield rightMargin : I
    //   10: istore #6
    //   12: aload_0
    //   13: iload_1
    //   14: invokespecial resolveLayoutDirection : (I)V
    //   17: aload_0
    //   18: invokevirtual getLayoutDirection : ()I
    //   21: istore_1
    //   22: iconst_0
    //   23: istore #4
    //   25: iconst_1
    //   26: iload_1
    //   27: if_icmpne -> 35
    //   30: iconst_1
    //   31: istore_1
    //   32: goto -> 37
    //   35: iconst_0
    //   36: istore_1
    //   37: aload_0
    //   38: iconst_m1
    //   39: putfield i0 : I
    //   42: aload_0
    //   43: iconst_m1
    //   44: putfield j0 : I
    //   47: aload_0
    //   48: iconst_m1
    //   49: putfield g0 : I
    //   52: aload_0
    //   53: iconst_m1
    //   54: putfield h0 : I
    //   57: aload_0
    //   58: aload_0
    //   59: getfield w : I
    //   62: putfield k0 : I
    //   65: aload_0
    //   66: aload_0
    //   67: getfield y : I
    //   70: putfield l0 : I
    //   73: aload_0
    //   74: getfield E : F
    //   77: fstore_2
    //   78: aload_0
    //   79: fload_2
    //   80: putfield m0 : F
    //   83: aload_0
    //   84: getfield a : I
    //   87: istore #8
    //   89: aload_0
    //   90: iload #8
    //   92: putfield n0 : I
    //   95: aload_0
    //   96: getfield b : I
    //   99: istore #9
    //   101: aload_0
    //   102: iload #9
    //   104: putfield o0 : I
    //   107: aload_0
    //   108: getfield c : F
    //   111: fstore_3
    //   112: aload_0
    //   113: fload_3
    //   114: putfield p0 : F
    //   117: aload_0
    //   118: getfield s : I
    //   121: istore #7
    //   123: iload_1
    //   124: ifeq -> 358
    //   127: iload #7
    //   129: iconst_m1
    //   130: if_icmpeq -> 144
    //   133: aload_0
    //   134: iload #7
    //   136: putfield i0 : I
    //   139: iconst_1
    //   140: istore_1
    //   141: goto -> 168
    //   144: aload_0
    //   145: getfield t : I
    //   148: istore #10
    //   150: iload #4
    //   152: istore_1
    //   153: iload #10
    //   155: iconst_m1
    //   156: if_icmpeq -> 168
    //   159: aload_0
    //   160: iload #10
    //   162: putfield j0 : I
    //   165: goto -> 139
    //   168: aload_0
    //   169: getfield u : I
    //   172: istore #4
    //   174: iload #4
    //   176: iconst_m1
    //   177: if_icmpeq -> 188
    //   180: aload_0
    //   181: iload #4
    //   183: putfield h0 : I
    //   186: iconst_1
    //   187: istore_1
    //   188: aload_0
    //   189: getfield v : I
    //   192: istore #4
    //   194: iload #4
    //   196: iconst_m1
    //   197: if_icmpeq -> 208
    //   200: aload_0
    //   201: iload #4
    //   203: putfield g0 : I
    //   206: iconst_1
    //   207: istore_1
    //   208: aload_0
    //   209: getfield A : I
    //   212: istore #4
    //   214: iload #4
    //   216: ldc -2147483648
    //   218: if_icmpeq -> 227
    //   221: aload_0
    //   222: iload #4
    //   224: putfield l0 : I
    //   227: aload_0
    //   228: getfield B : I
    //   231: istore #4
    //   233: iload #4
    //   235: ldc -2147483648
    //   237: if_icmpeq -> 246
    //   240: aload_0
    //   241: iload #4
    //   243: putfield k0 : I
    //   246: iload_1
    //   247: ifeq -> 257
    //   250: aload_0
    //   251: fconst_1
    //   252: fload_2
    //   253: fsub
    //   254: putfield m0 : F
    //   257: aload_0
    //   258: getfield d0 : Z
    //   261: ifeq -> 447
    //   264: aload_0
    //   265: getfield V : I
    //   268: iconst_1
    //   269: if_icmpne -> 447
    //   272: aload_0
    //   273: getfield d : Z
    //   276: ifeq -> 447
    //   279: fload_3
    //   280: ldc -1.0
    //   282: fcmpl
    //   283: ifeq -> 306
    //   286: aload_0
    //   287: fconst_1
    //   288: fload_3
    //   289: fsub
    //   290: putfield p0 : F
    //   293: aload_0
    //   294: iconst_m1
    //   295: putfield n0 : I
    //   298: aload_0
    //   299: iconst_m1
    //   300: putfield o0 : I
    //   303: goto -> 447
    //   306: iload #8
    //   308: iconst_m1
    //   309: if_icmpeq -> 332
    //   312: aload_0
    //   313: iload #8
    //   315: putfield o0 : I
    //   318: aload_0
    //   319: iconst_m1
    //   320: putfield n0 : I
    //   323: aload_0
    //   324: ldc -1.0
    //   326: putfield p0 : F
    //   329: goto -> 447
    //   332: iload #9
    //   334: iconst_m1
    //   335: if_icmpeq -> 447
    //   338: aload_0
    //   339: iload #9
    //   341: putfield n0 : I
    //   344: aload_0
    //   345: iconst_m1
    //   346: putfield o0 : I
    //   349: aload_0
    //   350: ldc -1.0
    //   352: putfield p0 : F
    //   355: goto -> 447
    //   358: iload #7
    //   360: iconst_m1
    //   361: if_icmpeq -> 370
    //   364: aload_0
    //   365: iload #7
    //   367: putfield h0 : I
    //   370: aload_0
    //   371: getfield t : I
    //   374: istore_1
    //   375: iload_1
    //   376: iconst_m1
    //   377: if_icmpeq -> 385
    //   380: aload_0
    //   381: iload_1
    //   382: putfield g0 : I
    //   385: aload_0
    //   386: getfield u : I
    //   389: istore_1
    //   390: iload_1
    //   391: iconst_m1
    //   392: if_icmpeq -> 400
    //   395: aload_0
    //   396: iload_1
    //   397: putfield i0 : I
    //   400: aload_0
    //   401: getfield v : I
    //   404: istore_1
    //   405: iload_1
    //   406: iconst_m1
    //   407: if_icmpeq -> 415
    //   410: aload_0
    //   411: iload_1
    //   412: putfield j0 : I
    //   415: aload_0
    //   416: getfield A : I
    //   419: istore_1
    //   420: iload_1
    //   421: ldc -2147483648
    //   423: if_icmpeq -> 431
    //   426: aload_0
    //   427: iload_1
    //   428: putfield k0 : I
    //   431: aload_0
    //   432: getfield B : I
    //   435: istore_1
    //   436: iload_1
    //   437: ldc -2147483648
    //   439: if_icmpeq -> 447
    //   442: aload_0
    //   443: iload_1
    //   444: putfield l0 : I
    //   447: aload_0
    //   448: getfield u : I
    //   451: iconst_m1
    //   452: if_icmpne -> 613
    //   455: aload_0
    //   456: getfield v : I
    //   459: iconst_m1
    //   460: if_icmpne -> 613
    //   463: aload_0
    //   464: getfield t : I
    //   467: iconst_m1
    //   468: if_icmpne -> 613
    //   471: iload #7
    //   473: iconst_m1
    //   474: if_icmpne -> 613
    //   477: aload_0
    //   478: getfield g : I
    //   481: istore_1
    //   482: iload_1
    //   483: iconst_m1
    //   484: if_icmpeq -> 513
    //   487: aload_0
    //   488: iload_1
    //   489: putfield i0 : I
    //   492: aload_0
    //   493: getfield rightMargin : I
    //   496: ifgt -> 546
    //   499: iload #6
    //   501: ifle -> 546
    //   504: aload_0
    //   505: iload #6
    //   507: putfield rightMargin : I
    //   510: goto -> 546
    //   513: aload_0
    //   514: getfield h : I
    //   517: istore_1
    //   518: iload_1
    //   519: iconst_m1
    //   520: if_icmpeq -> 546
    //   523: aload_0
    //   524: iload_1
    //   525: putfield j0 : I
    //   528: aload_0
    //   529: getfield rightMargin : I
    //   532: ifgt -> 546
    //   535: iload #6
    //   537: ifle -> 546
    //   540: aload_0
    //   541: iload #6
    //   543: putfield rightMargin : I
    //   546: aload_0
    //   547: getfield e : I
    //   550: istore_1
    //   551: iload_1
    //   552: iconst_m1
    //   553: if_icmpeq -> 580
    //   556: aload_0
    //   557: iload_1
    //   558: putfield g0 : I
    //   561: aload_0
    //   562: getfield leftMargin : I
    //   565: ifgt -> 613
    //   568: iload #5
    //   570: ifle -> 613
    //   573: aload_0
    //   574: iload #5
    //   576: putfield leftMargin : I
    //   579: return
    //   580: aload_0
    //   581: getfield f : I
    //   584: istore_1
    //   585: iload_1
    //   586: iconst_m1
    //   587: if_icmpeq -> 613
    //   590: aload_0
    //   591: iload_1
    //   592: putfield h0 : I
    //   595: aload_0
    //   596: getfield leftMargin : I
    //   599: ifgt -> 613
    //   602: iload #5
    //   604: ifle -> 613
    //   607: aload_0
    //   608: iload #5
    //   610: putfield leftMargin : I
    //   613: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */