import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public class er {
  public int A;
  
  public float B;
  
  public final int[] C;
  
  public float D;
  
  public boolean E;
  
  public boolean F;
  
  public int G;
  
  public int H;
  
  public final bq I;
  
  public final bq J;
  
  public final bq K;
  
  public final bq L;
  
  public final bq M;
  
  public final bq N;
  
  public final bq O;
  
  public final bq P;
  
  public final bq[] Q;
  
  public final ArrayList R;
  
  public final boolean[] S;
  
  public er T;
  
  public int U;
  
  public int V;
  
  public float W;
  
  public int X;
  
  public int Y;
  
  public int Z;
  
  public boolean a = false;
  
  public int a0;
  
  public wj b;
  
  public int b0;
  
  public wj c;
  
  public int c0;
  
  public fg0 d = null;
  
  public float d0;
  
  public d22 e = null;
  
  public float e0;
  
  public final boolean[] f = new boolean[] { true, true };
  
  public View f0;
  
  public boolean g = true;
  
  public int g0;
  
  public int h = -1;
  
  public String h0;
  
  public int i = -1;
  
  public int i0;
  
  public String j;
  
  public int j0;
  
  public boolean k;
  
  public final float[] k0;
  
  public boolean l;
  
  public final er[] l0;
  
  public boolean m;
  
  public final er[] m0;
  
  public boolean n;
  
  public int n0;
  
  public int o;
  
  public int o0;
  
  public int p;
  
  public final int[] p0;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public final int[] t;
  
  public int u;
  
  public int v;
  
  public float w;
  
  public int x;
  
  public int y;
  
  public float z;
  
  public er() {
    new HashMap<Object, Object>();
    this.k = false;
    this.l = false;
    this.m = false;
    this.n = false;
    this.o = -1;
    this.p = -1;
    this.q = 0;
    this.r = 0;
    this.s = 0;
    this.t = new int[2];
    this.u = 0;
    this.v = 0;
    this.w = 1.0F;
    this.x = 0;
    this.y = 0;
    this.z = 1.0F;
    this.A = -1;
    this.B = 1.0F;
    this.C = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
    this.D = Float.NaN;
    this.E = false;
    this.G = 0;
    this.H = 0;
    bq bq7 = new bq(this, 2);
    this.I = bq7;
    bq bq8 = new bq(this, 3);
    this.J = bq8;
    bq bq3 = new bq(this, 4);
    this.K = bq3;
    bq bq1 = new bq(this, 5);
    this.L = bq1;
    bq bq6 = new bq(this, 6);
    this.M = bq6;
    bq bq4 = new bq(this, 8);
    this.N = bq4;
    bq bq5 = new bq(this, 9);
    this.O = bq5;
    bq bq2 = new bq(this, 7);
    this.P = bq2;
    this.Q = new bq[] { bq7, bq3, bq8, bq1, bq6, bq2 };
    ArrayList<bq> arrayList = new ArrayList();
    this.R = arrayList;
    this.S = new boolean[2];
    this.p0 = new int[] { 1, 1 };
    this.T = null;
    this.U = 0;
    this.V = 0;
    this.W = 0.0F;
    this.X = -1;
    this.Y = 0;
    this.Z = 0;
    this.a0 = 0;
    this.d0 = 0.5F;
    this.e0 = 0.5F;
    this.g0 = 0;
    this.h0 = null;
    this.i0 = 0;
    this.j0 = 0;
    this.k0 = new float[] { -1.0F, -1.0F };
    this.l0 = new er[] { null, null };
    this.m0 = new er[] { null, null };
    this.n0 = -1;
    this.o0 = -1;
    arrayList.add(bq7);
    arrayList.add(bq8);
    arrayList.add(bq3);
    arrayList.add(bq1);
    arrayList.add(bq4);
    arrayList.add(bq5);
    arrayList.add(bq2);
    arrayList.add(bq6);
  }
  
  public static void D(int paramInt1, int paramInt2, String paramString, StringBuilder paramStringBuilder) {
    if (paramInt1 == paramInt2)
      return; 
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramInt1);
    paramStringBuilder.append(",\n");
  }
  
  public static void E(StringBuilder paramStringBuilder, String paramString, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return; 
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramFloat1);
    paramStringBuilder.append(",\n");
  }
  
  public static void m(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, int paramInt6) {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    if (paramInt6 != 1) {
      if (paramInt6 != 2) {
        if (paramInt6 != 3) {
          if (paramInt6 == 4) {
            paramString = "MATCH_PARENT";
          } else {
            throw null;
          } 
        } else {
          paramString = "MATCH_CONSTRAINT";
        } 
      } else {
        paramString = "WRAP_CONTENT";
      } 
    } else {
      paramString = "FIXED";
    } 
    if (!"FIXED".equals(paramString))
      x41.v(paramStringBuilder, "      behavior", " :   ", paramString, ",\n"); 
    D(paramInt1, 0, "      size", paramStringBuilder);
    D(paramInt2, 0, "      min", paramStringBuilder);
    D(paramInt3, 2147483647, "      max", paramStringBuilder);
    D(paramInt4, 0, "      matchMin", paramStringBuilder);
    D(paramInt5, 0, "      matchDef", paramStringBuilder);
    E(paramStringBuilder, "      matchPercent", paramFloat, 1.0F);
    paramStringBuilder.append("    },\n");
  }
  
  public static void n(StringBuilder paramStringBuilder, String paramString, bq parambq) {
    if (parambq.f == null)
      return; 
    paramStringBuilder.append("    ");
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramStringBuilder.append(parambq.f);
    paramStringBuilder.append("'");
    if (parambq.h != Integer.MIN_VALUE || parambq.g != 0) {
      paramStringBuilder.append(",");
      paramStringBuilder.append(parambq.g);
      if (parambq.h != Integer.MIN_VALUE) {
        paramStringBuilder.append(",");
        paramStringBuilder.append(parambq.h);
        paramStringBuilder.append(",");
      } 
    } 
    paramStringBuilder.append(" ] ,\n");
  }
  
  public void A() {
    this.I.g();
    this.J.g();
    this.K.g();
    this.L.g();
    this.M.g();
    this.N.g();
    this.O.g();
    this.P.g();
    this.T = null;
    this.D = Float.NaN;
    this.U = 0;
    this.V = 0;
    this.W = 0.0F;
    this.X = -1;
    this.Y = 0;
    this.Z = 0;
    this.a0 = 0;
    this.b0 = 0;
    this.c0 = 0;
    this.d0 = 0.5F;
    this.e0 = 0.5F;
    int[] arrayOfInt3 = this.p0;
    arrayOfInt3[0] = 1;
    arrayOfInt3[1] = 1;
    this.f0 = null;
    this.g0 = 0;
    this.i0 = 0;
    this.j0 = 0;
    float[] arrayOfFloat = this.k0;
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    this.o = -1;
    this.p = -1;
    int[] arrayOfInt2 = this.C;
    arrayOfInt2[0] = Integer.MAX_VALUE;
    arrayOfInt2[1] = Integer.MAX_VALUE;
    this.r = 0;
    this.s = 0;
    this.w = 1.0F;
    this.z = 1.0F;
    this.v = Integer.MAX_VALUE;
    this.y = Integer.MAX_VALUE;
    this.u = 0;
    this.x = 0;
    this.A = -1;
    this.B = 1.0F;
    boolean[] arrayOfBoolean = this.f;
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    arrayOfBoolean = this.S;
    arrayOfBoolean[0] = false;
    arrayOfBoolean[1] = false;
    this.g = true;
    int[] arrayOfInt1 = this.t;
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    this.h = -1;
    this.i = -1;
  }
  
  public final void B() {
    this.k = false;
    this.l = false;
    this.m = false;
    this.n = false;
    ArrayList<bq> arrayList = this.R;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      bq bq1 = arrayList.get(b);
      bq1.c = false;
      bq1.b = 0;
    } 
  }
  
  public void C(zv0 paramzv0) {
    this.I.h();
    this.J.h();
    this.K.h();
    this.L.h();
    this.M.h();
    this.P.h();
    this.N.h();
    this.O.h();
  }
  
  public final void F(int paramInt1, int paramInt2) {
    if (this.k)
      return; 
    this.I.i(paramInt1);
    this.K.i(paramInt2);
    this.Y = paramInt1;
    this.U = paramInt2 - paramInt1;
    this.k = true;
  }
  
  public final void G(int paramInt1, int paramInt2) {
    if (this.l)
      return; 
    this.J.i(paramInt1);
    this.L.i(paramInt2);
    this.Z = paramInt1;
    this.V = paramInt2 - paramInt1;
    if (this.E) {
      paramInt2 = this.a0;
      this.M.i(paramInt1 + paramInt2);
    } 
    this.l = true;
  }
  
  public final void H(int paramInt) {
    this.V = paramInt;
    int i = this.c0;
    if (paramInt < i)
      this.V = i; 
  }
  
  public final void I(int paramInt) {
    this.p0[0] = paramInt;
  }
  
  public final void J(int paramInt) {
    this.p0[1] = paramInt;
  }
  
  public final void K(int paramInt) {
    this.U = paramInt;
    int i = this.b0;
    if (paramInt < i)
      this.U = i; 
  }
  
  public void L(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lfg0;
    //   4: astore #10
    //   6: iload_1
    //   7: aload #10
    //   9: getfield g : Z
    //   12: iand
    //   13: istore #9
    //   15: aload_0
    //   16: getfield e : Ld22;
    //   19: astore #11
    //   21: iload_2
    //   22: aload #11
    //   24: getfield g : Z
    //   27: iand
    //   28: istore #8
    //   30: aload #10
    //   32: getfield h : Liy;
    //   35: getfield g : I
    //   38: istore_3
    //   39: aload #11
    //   41: getfield h : Liy;
    //   44: getfield g : I
    //   47: istore #4
    //   49: aload #10
    //   51: getfield i : Liy;
    //   54: getfield g : I
    //   57: istore #6
    //   59: aload #11
    //   61: getfield i : Liy;
    //   64: getfield g : I
    //   67: istore #7
    //   69: iload #6
    //   71: iload_3
    //   72: isub
    //   73: iflt -> 146
    //   76: iload #7
    //   78: iload #4
    //   80: isub
    //   81: iflt -> 146
    //   84: iload_3
    //   85: ldc_w -2147483648
    //   88: if_icmpeq -> 146
    //   91: iload_3
    //   92: ldc 2147483647
    //   94: if_icmpeq -> 146
    //   97: iload #4
    //   99: ldc_w -2147483648
    //   102: if_icmpeq -> 146
    //   105: iload #4
    //   107: ldc 2147483647
    //   109: if_icmpeq -> 146
    //   112: iload #6
    //   114: ldc_w -2147483648
    //   117: if_icmpeq -> 146
    //   120: iload #6
    //   122: ldc 2147483647
    //   124: if_icmpeq -> 146
    //   127: iload #7
    //   129: ldc_w -2147483648
    //   132: if_icmpeq -> 146
    //   135: iload #7
    //   137: istore #5
    //   139: iload #7
    //   141: ldc 2147483647
    //   143: if_icmpne -> 158
    //   146: iconst_0
    //   147: istore #6
    //   149: iconst_0
    //   150: istore #5
    //   152: iload #5
    //   154: istore_3
    //   155: iload_3
    //   156: istore #4
    //   158: iload #6
    //   160: iload_3
    //   161: isub
    //   162: istore #6
    //   164: iload #5
    //   166: iload #4
    //   168: isub
    //   169: istore #5
    //   171: iload #9
    //   173: ifeq -> 181
    //   176: aload_0
    //   177: iload_3
    //   178: putfield Y : I
    //   181: iload #8
    //   183: ifeq -> 192
    //   186: aload_0
    //   187: iload #4
    //   189: putfield Z : I
    //   192: aload_0
    //   193: getfield g0 : I
    //   196: bipush #8
    //   198: if_icmpne -> 212
    //   201: aload_0
    //   202: iconst_0
    //   203: putfield U : I
    //   206: aload_0
    //   207: iconst_0
    //   208: putfield V : I
    //   211: return
    //   212: aload_0
    //   213: getfield p0 : [I
    //   216: astore #10
    //   218: iload #9
    //   220: ifeq -> 276
    //   223: iload #6
    //   225: istore_3
    //   226: aload #10
    //   228: iconst_0
    //   229: iaload
    //   230: iconst_1
    //   231: if_icmpne -> 253
    //   234: aload_0
    //   235: getfield U : I
    //   238: istore #4
    //   240: iload #6
    //   242: istore_3
    //   243: iload #6
    //   245: iload #4
    //   247: if_icmpge -> 253
    //   250: iload #4
    //   252: istore_3
    //   253: aload_0
    //   254: iload_3
    //   255: putfield U : I
    //   258: aload_0
    //   259: getfield b0 : I
    //   262: istore #4
    //   264: iload_3
    //   265: iload #4
    //   267: if_icmpge -> 276
    //   270: aload_0
    //   271: iload #4
    //   273: putfield U : I
    //   276: iload #8
    //   278: ifeq -> 334
    //   281: iload #5
    //   283: istore_3
    //   284: aload #10
    //   286: iconst_1
    //   287: iaload
    //   288: iconst_1
    //   289: if_icmpne -> 311
    //   292: aload_0
    //   293: getfield V : I
    //   296: istore #4
    //   298: iload #5
    //   300: istore_3
    //   301: iload #5
    //   303: iload #4
    //   305: if_icmpge -> 311
    //   308: iload #4
    //   310: istore_3
    //   311: aload_0
    //   312: iload_3
    //   313: putfield V : I
    //   316: aload_0
    //   317: getfield c0 : I
    //   320: istore #4
    //   322: iload_3
    //   323: iload #4
    //   325: if_icmpge -> 334
    //   328: aload_0
    //   329: iload #4
    //   331: putfield V : I
    //   334: return
  }
  
  public void M(ln0 paramln0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: getfield I : Lbq;
    //   9: invokestatic n : (Ljava/lang/Object;)I
    //   12: istore #4
    //   14: aload_0
    //   15: getfield J : Lbq;
    //   18: invokestatic n : (Ljava/lang/Object;)I
    //   21: istore #8
    //   23: aload_0
    //   24: getfield K : Lbq;
    //   27: invokestatic n : (Ljava/lang/Object;)I
    //   30: istore #6
    //   32: aload_0
    //   33: getfield L : Lbq;
    //   36: invokestatic n : (Ljava/lang/Object;)I
    //   39: istore #7
    //   41: iload #6
    //   43: istore #5
    //   45: iload #4
    //   47: istore_3
    //   48: iload_2
    //   49: ifeq -> 124
    //   52: aload_0
    //   53: getfield d : Lfg0;
    //   56: astore #9
    //   58: iload #6
    //   60: istore #5
    //   62: iload #4
    //   64: istore_3
    //   65: aload #9
    //   67: ifnull -> 124
    //   70: aload #9
    //   72: getfield h : Liy;
    //   75: astore_1
    //   76: iload #6
    //   78: istore #5
    //   80: iload #4
    //   82: istore_3
    //   83: aload_1
    //   84: getfield j : Z
    //   87: ifeq -> 124
    //   90: aload #9
    //   92: getfield i : Liy;
    //   95: astore #9
    //   97: iload #6
    //   99: istore #5
    //   101: iload #4
    //   103: istore_3
    //   104: aload #9
    //   106: getfield j : Z
    //   109: ifeq -> 124
    //   112: aload_1
    //   113: getfield g : I
    //   116: istore_3
    //   117: aload #9
    //   119: getfield g : I
    //   122: istore #5
    //   124: iload #8
    //   126: istore #6
    //   128: iload #7
    //   130: istore #4
    //   132: iload_2
    //   133: ifeq -> 212
    //   136: aload_0
    //   137: getfield e : Ld22;
    //   140: astore #9
    //   142: iload #8
    //   144: istore #6
    //   146: iload #7
    //   148: istore #4
    //   150: aload #9
    //   152: ifnull -> 212
    //   155: aload #9
    //   157: getfield h : Liy;
    //   160: astore_1
    //   161: iload #8
    //   163: istore #6
    //   165: iload #7
    //   167: istore #4
    //   169: aload_1
    //   170: getfield j : Z
    //   173: ifeq -> 212
    //   176: aload #9
    //   178: getfield i : Liy;
    //   181: astore #9
    //   183: iload #8
    //   185: istore #6
    //   187: iload #7
    //   189: istore #4
    //   191: aload #9
    //   193: getfield j : Z
    //   196: ifeq -> 212
    //   199: aload_1
    //   200: getfield g : I
    //   203: istore #6
    //   205: aload #9
    //   207: getfield g : I
    //   210: istore #4
    //   212: iload #5
    //   214: iload_3
    //   215: isub
    //   216: iflt -> 300
    //   219: iload #4
    //   221: iload #6
    //   223: isub
    //   224: iflt -> 300
    //   227: iload_3
    //   228: ldc_w -2147483648
    //   231: if_icmpeq -> 300
    //   234: iload_3
    //   235: ldc 2147483647
    //   237: if_icmpeq -> 300
    //   240: iload #6
    //   242: ldc_w -2147483648
    //   245: if_icmpeq -> 300
    //   248: iload #6
    //   250: ldc 2147483647
    //   252: if_icmpeq -> 300
    //   255: iload #5
    //   257: ldc_w -2147483648
    //   260: if_icmpeq -> 300
    //   263: iload #5
    //   265: ldc 2147483647
    //   267: if_icmpeq -> 300
    //   270: iload #4
    //   272: ldc_w -2147483648
    //   275: if_icmpeq -> 300
    //   278: iload #6
    //   280: istore #7
    //   282: iload #5
    //   284: istore #8
    //   286: iload #4
    //   288: istore #6
    //   290: iload_3
    //   291: istore #5
    //   293: iload #4
    //   295: ldc 2147483647
    //   297: if_icmpne -> 315
    //   300: iconst_0
    //   301: istore #5
    //   303: iconst_0
    //   304: istore #7
    //   306: iload #7
    //   308: istore_3
    //   309: iload_3
    //   310: istore #6
    //   312: iload_3
    //   313: istore #8
    //   315: iload #8
    //   317: iload #5
    //   319: isub
    //   320: istore #4
    //   322: iload #6
    //   324: iload #7
    //   326: isub
    //   327: istore #6
    //   329: aload_0
    //   330: iload #5
    //   332: putfield Y : I
    //   335: aload_0
    //   336: iload #7
    //   338: putfield Z : I
    //   341: aload_0
    //   342: getfield g0 : I
    //   345: bipush #8
    //   347: if_icmpne -> 361
    //   350: aload_0
    //   351: iconst_0
    //   352: putfield U : I
    //   355: aload_0
    //   356: iconst_0
    //   357: putfield V : I
    //   360: return
    //   361: aload_0
    //   362: getfield p0 : [I
    //   365: astore_1
    //   366: aload_1
    //   367: iconst_0
    //   368: iaload
    //   369: istore #7
    //   371: iload #4
    //   373: istore_3
    //   374: iload #7
    //   376: iconst_1
    //   377: if_icmpne -> 399
    //   380: aload_0
    //   381: getfield U : I
    //   384: istore #5
    //   386: iload #4
    //   388: istore_3
    //   389: iload #4
    //   391: iload #5
    //   393: if_icmpge -> 399
    //   396: iload #5
    //   398: istore_3
    //   399: iload #6
    //   401: istore #4
    //   403: aload_1
    //   404: iconst_1
    //   405: iaload
    //   406: iconst_1
    //   407: if_icmpne -> 431
    //   410: aload_0
    //   411: getfield V : I
    //   414: istore #5
    //   416: iload #6
    //   418: istore #4
    //   420: iload #6
    //   422: iload #5
    //   424: if_icmpge -> 431
    //   427: iload #5
    //   429: istore #4
    //   431: aload_0
    //   432: iload_3
    //   433: putfield U : I
    //   436: aload_0
    //   437: iload #4
    //   439: putfield V : I
    //   442: aload_0
    //   443: getfield c0 : I
    //   446: istore #5
    //   448: iload #4
    //   450: iload #5
    //   452: if_icmpge -> 461
    //   455: aload_0
    //   456: iload #5
    //   458: putfield V : I
    //   461: aload_0
    //   462: getfield b0 : I
    //   465: istore #5
    //   467: iload_3
    //   468: iload #5
    //   470: if_icmpge -> 479
    //   473: aload_0
    //   474: iload #5
    //   476: putfield U : I
    //   479: aload_0
    //   480: getfield v : I
    //   483: istore #5
    //   485: iload #5
    //   487: ifle -> 509
    //   490: iload #7
    //   492: iconst_3
    //   493: if_icmpne -> 509
    //   496: aload_0
    //   497: aload_0
    //   498: getfield U : I
    //   501: iload #5
    //   503: invokestatic min : (II)I
    //   506: putfield U : I
    //   509: aload_0
    //   510: getfield y : I
    //   513: istore #5
    //   515: iload #5
    //   517: ifle -> 540
    //   520: aload_1
    //   521: iconst_1
    //   522: iaload
    //   523: iconst_3
    //   524: if_icmpne -> 540
    //   527: aload_0
    //   528: aload_0
    //   529: getfield V : I
    //   532: iload #5
    //   534: invokestatic min : (II)I
    //   537: putfield V : I
    //   540: aload_0
    //   541: getfield U : I
    //   544: istore #5
    //   546: iload_3
    //   547: iload #5
    //   549: if_icmpeq -> 558
    //   552: aload_0
    //   553: iload #5
    //   555: putfield h : I
    //   558: aload_0
    //   559: getfield V : I
    //   562: istore_3
    //   563: iload #4
    //   565: iload_3
    //   566: if_icmpeq -> 574
    //   569: aload_0
    //   570: iload_3
    //   571: putfield i : I
    //   574: return
  }
  
  public final void a(fr paramfr, ln0 paramln0, HashSet paramHashSet, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      if (!paramHashSet.contains(this))
        return; 
      qz1.g(paramfr, paramln0, this);
      paramHashSet.remove(this);
      b(paramln0, paramfr.S(64));
    } 
    if (paramInt == 0) {
      HashSet hashSet = this.I.a;
      if (hashSet != null) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((bq)iterator.next()).d.a(paramfr, paramln0, paramHashSet, paramInt, true); 
      } 
      hashSet = this.K.a;
      if (hashSet != null) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((bq)iterator.next()).d.a(paramfr, paramln0, paramHashSet, paramInt, true); 
      } 
    } else {
      HashSet hashSet = this.J.a;
      if (hashSet != null) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((bq)iterator.next()).d.a(paramfr, paramln0, paramHashSet, paramInt, true); 
      } 
      hashSet = this.L.a;
      if (hashSet != null) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((bq)iterator.next()).d.a(paramfr, paramln0, paramHashSet, paramInt, true); 
      } 
      hashSet = this.M.a;
      if (hashSet != null) {
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((bq)iterator.next()).d.a(paramfr, paramln0, paramHashSet, paramInt, true); 
      } 
    } 
  }
  
  public void b(ln0 paramln0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Lbq;
    //   4: astore #35
    //   6: aload_1
    //   7: aload #35
    //   9: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   12: astore #41
    //   14: aload_0
    //   15: getfield K : Lbq;
    //   18: astore #36
    //   20: aload_1
    //   21: aload #36
    //   23: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   26: astore #39
    //   28: aload_0
    //   29: getfield J : Lbq;
    //   32: astore #47
    //   34: aload_1
    //   35: aload #47
    //   37: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   40: astore #38
    //   42: aload_0
    //   43: getfield L : Lbq;
    //   46: astore #42
    //   48: aload_1
    //   49: aload #42
    //   51: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   54: astore #40
    //   56: aload_0
    //   57: getfield M : Lbq;
    //   60: astore #43
    //   62: aload_1
    //   63: aload #43
    //   65: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   68: astore #44
    //   70: aload_0
    //   71: getfield T : Ler;
    //   74: astore #37
    //   76: aload #37
    //   78: ifnull -> 170
    //   81: aload #37
    //   83: getfield p0 : [I
    //   86: astore #37
    //   88: aload #37
    //   90: iconst_0
    //   91: iaload
    //   92: iconst_2
    //   93: if_icmpne -> 102
    //   96: iconst_1
    //   97: istore #23
    //   99: goto -> 105
    //   102: iconst_0
    //   103: istore #23
    //   105: aload #37
    //   107: iconst_1
    //   108: iaload
    //   109: iconst_2
    //   110: if_icmpne -> 119
    //   113: iconst_1
    //   114: istore #24
    //   116: goto -> 122
    //   119: iconst_0
    //   120: istore #24
    //   122: aload_0
    //   123: getfield q : I
    //   126: istore #11
    //   128: iload #11
    //   130: iconst_1
    //   131: if_icmpeq -> 164
    //   134: iload #11
    //   136: iconst_2
    //   137: if_icmpeq -> 158
    //   140: iload #11
    //   142: iconst_3
    //   143: if_icmpeq -> 149
    //   146: goto -> 173
    //   149: iconst_0
    //   150: istore #24
    //   152: iconst_0
    //   153: istore #23
    //   155: goto -> 173
    //   158: iconst_0
    //   159: istore #23
    //   161: goto -> 146
    //   164: iconst_0
    //   165: istore #24
    //   167: goto -> 173
    //   170: goto -> 149
    //   173: aload_0
    //   174: getfield g0 : I
    //   177: istore #11
    //   179: aload_0
    //   180: getfield S : [Z
    //   183: astore #37
    //   185: iload #11
    //   187: bipush #8
    //   189: if_icmpne -> 270
    //   192: aload_0
    //   193: getfield R : Ljava/util/ArrayList;
    //   196: astore #46
    //   198: aload #46
    //   200: invokevirtual size : ()I
    //   203: istore #11
    //   205: iconst_0
    //   206: istore #12
    //   208: iload #12
    //   210: iload #11
    //   212: if_icmpge -> 255
    //   215: aload #46
    //   217: iload #12
    //   219: invokevirtual get : (I)Ljava/lang/Object;
    //   222: checkcast bq
    //   225: getfield a : Ljava/util/HashSet;
    //   228: astore #45
    //   230: aload #45
    //   232: ifnonnull -> 238
    //   235: goto -> 249
    //   238: aload #45
    //   240: invokevirtual size : ()I
    //   243: ifle -> 249
    //   246: goto -> 270
    //   249: iinc #12, 1
    //   252: goto -> 208
    //   255: aload #37
    //   257: iconst_0
    //   258: baload
    //   259: ifne -> 270
    //   262: aload #37
    //   264: iconst_1
    //   265: baload
    //   266: ifne -> 270
    //   269: return
    //   270: aload_0
    //   271: getfield k : Z
    //   274: istore #25
    //   276: iload #25
    //   278: ifne -> 288
    //   281: aload_0
    //   282: getfield l : Z
    //   285: ifeq -> 683
    //   288: iload #25
    //   290: ifeq -> 453
    //   293: aload_1
    //   294: aload #41
    //   296: aload_0
    //   297: getfield Y : I
    //   300: invokevirtual d : (Lpn1;I)V
    //   303: aload_1
    //   304: aload #39
    //   306: aload_0
    //   307: getfield Y : I
    //   310: aload_0
    //   311: getfield U : I
    //   314: iadd
    //   315: invokevirtual d : (Lpn1;I)V
    //   318: iload #23
    //   320: ifeq -> 453
    //   323: aload_0
    //   324: getfield T : Ler;
    //   327: astore #45
    //   329: aload #45
    //   331: ifnull -> 453
    //   334: aload #45
    //   336: checkcast fr
    //   339: astore #45
    //   341: aload #45
    //   343: getfield H0 : Ljava/lang/ref/WeakReference;
    //   346: astore #46
    //   348: aload #46
    //   350: ifnull -> 383
    //   353: aload #46
    //   355: invokevirtual get : ()Ljava/lang/Object;
    //   358: ifnull -> 383
    //   361: aload #35
    //   363: invokevirtual c : ()I
    //   366: aload #45
    //   368: getfield H0 : Ljava/lang/ref/WeakReference;
    //   371: invokevirtual get : ()Ljava/lang/Object;
    //   374: checkcast bq
    //   377: invokevirtual c : ()I
    //   380: if_icmple -> 397
    //   383: aload #45
    //   385: new java/lang/ref/WeakReference
    //   388: dup
    //   389: aload #35
    //   391: invokespecial <init> : (Ljava/lang/Object;)V
    //   394: putfield H0 : Ljava/lang/ref/WeakReference;
    //   397: aload #45
    //   399: getfield J0 : Ljava/lang/ref/WeakReference;
    //   402: astore #46
    //   404: aload #46
    //   406: ifnull -> 439
    //   409: aload #46
    //   411: invokevirtual get : ()Ljava/lang/Object;
    //   414: ifnull -> 439
    //   417: aload #36
    //   419: invokevirtual c : ()I
    //   422: aload #45
    //   424: getfield J0 : Ljava/lang/ref/WeakReference;
    //   427: invokevirtual get : ()Ljava/lang/Object;
    //   430: checkcast bq
    //   433: invokevirtual c : ()I
    //   436: if_icmple -> 453
    //   439: aload #45
    //   441: new java/lang/ref/WeakReference
    //   444: dup
    //   445: aload #36
    //   447: invokespecial <init> : (Ljava/lang/Object;)V
    //   450: putfield J0 : Ljava/lang/ref/WeakReference;
    //   453: aload_0
    //   454: getfield l : Z
    //   457: ifeq -> 658
    //   460: aload_1
    //   461: aload #38
    //   463: aload_0
    //   464: getfield Z : I
    //   467: invokevirtual d : (Lpn1;I)V
    //   470: aload_1
    //   471: aload #40
    //   473: aload_0
    //   474: getfield Z : I
    //   477: aload_0
    //   478: getfield V : I
    //   481: iadd
    //   482: invokevirtual d : (Lpn1;I)V
    //   485: aload #43
    //   487: getfield a : Ljava/util/HashSet;
    //   490: astore #45
    //   492: aload #45
    //   494: ifnonnull -> 500
    //   497: goto -> 523
    //   500: aload #45
    //   502: invokevirtual size : ()I
    //   505: ifle -> 523
    //   508: aload_1
    //   509: aload #44
    //   511: aload_0
    //   512: getfield Z : I
    //   515: aload_0
    //   516: getfield a0 : I
    //   519: iadd
    //   520: invokevirtual d : (Lpn1;I)V
    //   523: iload #24
    //   525: ifeq -> 658
    //   528: aload_0
    //   529: getfield T : Ler;
    //   532: astore #45
    //   534: aload #45
    //   536: ifnull -> 658
    //   539: aload #45
    //   541: checkcast fr
    //   544: astore #45
    //   546: aload #45
    //   548: getfield G0 : Ljava/lang/ref/WeakReference;
    //   551: astore #46
    //   553: aload #46
    //   555: ifnull -> 588
    //   558: aload #46
    //   560: invokevirtual get : ()Ljava/lang/Object;
    //   563: ifnull -> 588
    //   566: aload #47
    //   568: invokevirtual c : ()I
    //   571: aload #45
    //   573: getfield G0 : Ljava/lang/ref/WeakReference;
    //   576: invokevirtual get : ()Ljava/lang/Object;
    //   579: checkcast bq
    //   582: invokevirtual c : ()I
    //   585: if_icmple -> 602
    //   588: aload #45
    //   590: new java/lang/ref/WeakReference
    //   593: dup
    //   594: aload #47
    //   596: invokespecial <init> : (Ljava/lang/Object;)V
    //   599: putfield G0 : Ljava/lang/ref/WeakReference;
    //   602: aload #45
    //   604: getfield I0 : Ljava/lang/ref/WeakReference;
    //   607: astore #46
    //   609: aload #46
    //   611: ifnull -> 644
    //   614: aload #46
    //   616: invokevirtual get : ()Ljava/lang/Object;
    //   619: ifnull -> 644
    //   622: aload #42
    //   624: invokevirtual c : ()I
    //   627: aload #45
    //   629: getfield I0 : Ljava/lang/ref/WeakReference;
    //   632: invokevirtual get : ()Ljava/lang/Object;
    //   635: checkcast bq
    //   638: invokevirtual c : ()I
    //   641: if_icmple -> 658
    //   644: aload #45
    //   646: new java/lang/ref/WeakReference
    //   649: dup
    //   650: aload #42
    //   652: invokespecial <init> : (Ljava/lang/Object;)V
    //   655: putfield I0 : Ljava/lang/ref/WeakReference;
    //   658: aload_0
    //   659: getfield k : Z
    //   662: ifeq -> 683
    //   665: aload_0
    //   666: getfield l : Z
    //   669: ifeq -> 683
    //   672: aload_0
    //   673: iconst_0
    //   674: putfield k : Z
    //   677: aload_0
    //   678: iconst_0
    //   679: putfield l : Z
    //   682: return
    //   683: aload_0
    //   684: getfield f : [Z
    //   687: astore #45
    //   689: iload_2
    //   690: ifeq -> 940
    //   693: aload_0
    //   694: getfield d : Lfg0;
    //   697: astore #46
    //   699: aload #46
    //   701: ifnull -> 940
    //   704: aload_0
    //   705: getfield e : Ld22;
    //   708: astore #48
    //   710: aload #48
    //   712: ifnull -> 940
    //   715: aload #46
    //   717: getfield h : Liy;
    //   720: astore #49
    //   722: aload #49
    //   724: getfield j : Z
    //   727: ifeq -> 937
    //   730: aload #46
    //   732: getfield i : Liy;
    //   735: getfield j : Z
    //   738: ifeq -> 937
    //   741: aload #48
    //   743: getfield h : Liy;
    //   746: getfield j : Z
    //   749: ifeq -> 937
    //   752: aload #48
    //   754: getfield i : Liy;
    //   757: getfield j : Z
    //   760: ifeq -> 937
    //   763: aload_1
    //   764: aload #41
    //   766: aload #49
    //   768: getfield g : I
    //   771: invokevirtual d : (Lpn1;I)V
    //   774: aload_1
    //   775: aload #39
    //   777: aload_0
    //   778: getfield d : Lfg0;
    //   781: getfield i : Liy;
    //   784: getfield g : I
    //   787: invokevirtual d : (Lpn1;I)V
    //   790: aload_1
    //   791: aload #38
    //   793: aload_0
    //   794: getfield e : Ld22;
    //   797: getfield h : Liy;
    //   800: getfield g : I
    //   803: invokevirtual d : (Lpn1;I)V
    //   806: aload_1
    //   807: aload #40
    //   809: aload_0
    //   810: getfield e : Ld22;
    //   813: getfield i : Liy;
    //   816: getfield g : I
    //   819: invokevirtual d : (Lpn1;I)V
    //   822: aload_1
    //   823: aload #44
    //   825: aload_0
    //   826: getfield e : Ld22;
    //   829: getfield k : Liy;
    //   832: getfield g : I
    //   835: invokevirtual d : (Lpn1;I)V
    //   838: aload_0
    //   839: getfield T : Ler;
    //   842: ifnull -> 926
    //   845: iload #23
    //   847: ifeq -> 884
    //   850: aload #45
    //   852: iconst_0
    //   853: baload
    //   854: ifeq -> 884
    //   857: aload_0
    //   858: invokevirtual v : ()Z
    //   861: ifne -> 884
    //   864: aload_1
    //   865: aload_1
    //   866: aload_0
    //   867: getfield T : Ler;
    //   870: getfield K : Lbq;
    //   873: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   876: aload #39
    //   878: iconst_0
    //   879: bipush #8
    //   881: invokevirtual f : (Lpn1;Lpn1;II)V
    //   884: iload #24
    //   886: ifeq -> 926
    //   889: aload #45
    //   891: iconst_1
    //   892: baload
    //   893: ifeq -> 926
    //   896: aload_0
    //   897: invokevirtual w : ()Z
    //   900: ifne -> 926
    //   903: aload_1
    //   904: aload_1
    //   905: aload_0
    //   906: getfield T : Ler;
    //   909: getfield L : Lbq;
    //   912: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   915: aload #40
    //   917: iconst_0
    //   918: bipush #8
    //   920: invokevirtual f : (Lpn1;Lpn1;II)V
    //   923: goto -> 926
    //   926: aload_0
    //   927: iconst_0
    //   928: putfield k : Z
    //   931: aload_0
    //   932: iconst_0
    //   933: putfield l : Z
    //   936: return
    //   937: goto -> 943
    //   940: goto -> 937
    //   943: aload_0
    //   944: getfield T : Ler;
    //   947: ifnull -> 1145
    //   950: aload_0
    //   951: iconst_0
    //   952: invokevirtual u : (I)Z
    //   955: ifeq -> 976
    //   958: aload_0
    //   959: getfield T : Ler;
    //   962: checkcast fr
    //   965: aload_0
    //   966: iconst_0
    //   967: invokevirtual N : (Ler;I)V
    //   970: iconst_1
    //   971: istore #25
    //   973: goto -> 982
    //   976: aload_0
    //   977: invokevirtual v : ()Z
    //   980: istore #25
    //   982: aload_0
    //   983: iconst_1
    //   984: invokevirtual u : (I)Z
    //   987: ifeq -> 1008
    //   990: aload_0
    //   991: getfield T : Ler;
    //   994: checkcast fr
    //   997: aload_0
    //   998: iconst_1
    //   999: invokevirtual N : (Ler;I)V
    //   1002: iconst_1
    //   1003: istore #26
    //   1005: goto -> 1014
    //   1008: aload_0
    //   1009: invokevirtual w : ()Z
    //   1012: istore #26
    //   1014: iload #25
    //   1016: ifne -> 1071
    //   1019: iload #23
    //   1021: ifeq -> 1071
    //   1024: aload_0
    //   1025: getfield g0 : I
    //   1028: bipush #8
    //   1030: if_icmpeq -> 1071
    //   1033: aload #35
    //   1035: getfield f : Lbq;
    //   1038: ifnonnull -> 1071
    //   1041: aload #36
    //   1043: getfield f : Lbq;
    //   1046: ifnonnull -> 1071
    //   1049: aload_1
    //   1050: aload_1
    //   1051: aload_0
    //   1052: getfield T : Ler;
    //   1055: getfield K : Lbq;
    //   1058: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   1061: aload #39
    //   1063: iconst_0
    //   1064: iconst_1
    //   1065: invokevirtual f : (Lpn1;Lpn1;II)V
    //   1068: goto -> 1071
    //   1071: iload #26
    //   1073: ifne -> 1130
    //   1076: iload #24
    //   1078: ifeq -> 1130
    //   1081: aload_0
    //   1082: getfield g0 : I
    //   1085: bipush #8
    //   1087: if_icmpeq -> 1130
    //   1090: aload #47
    //   1092: getfield f : Lbq;
    //   1095: ifnonnull -> 1130
    //   1098: aload #42
    //   1100: getfield f : Lbq;
    //   1103: ifnonnull -> 1130
    //   1106: aload #43
    //   1108: ifnonnull -> 1130
    //   1111: aload_1
    //   1112: aload_1
    //   1113: aload_0
    //   1114: getfield T : Ler;
    //   1117: getfield L : Lbq;
    //   1120: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   1123: aload #40
    //   1125: iconst_0
    //   1126: iconst_1
    //   1127: invokevirtual f : (Lpn1;Lpn1;II)V
    //   1130: iload #26
    //   1132: istore #27
    //   1134: iload #25
    //   1136: istore #26
    //   1138: iload #27
    //   1140: istore #25
    //   1142: goto -> 1151
    //   1145: iconst_0
    //   1146: istore #26
    //   1148: iconst_0
    //   1149: istore #25
    //   1151: aload_0
    //   1152: getfield U : I
    //   1155: istore #17
    //   1157: aload_0
    //   1158: getfield b0 : I
    //   1161: istore #11
    //   1163: iload #17
    //   1165: iload #11
    //   1167: if_icmpge -> 1173
    //   1170: goto -> 1177
    //   1173: iload #17
    //   1175: istore #11
    //   1177: aload_0
    //   1178: getfield V : I
    //   1181: istore #18
    //   1183: aload_0
    //   1184: getfield c0 : I
    //   1187: istore #12
    //   1189: iload #18
    //   1191: iload #12
    //   1193: if_icmpge -> 1199
    //   1196: goto -> 1203
    //   1199: iload #18
    //   1201: istore #12
    //   1203: aload_0
    //   1204: getfield p0 : [I
    //   1207: astore #46
    //   1209: aload #46
    //   1211: iconst_0
    //   1212: iaload
    //   1213: istore #19
    //   1215: iload #19
    //   1217: iconst_3
    //   1218: if_icmpeq -> 1227
    //   1221: iconst_1
    //   1222: istore #15
    //   1224: goto -> 1233
    //   1227: iconst_0
    //   1228: istore #15
    //   1230: goto -> 1224
    //   1233: aload #46
    //   1235: iconst_1
    //   1236: iaload
    //   1237: istore #20
    //   1239: iload #20
    //   1241: iconst_3
    //   1242: if_icmpeq -> 1251
    //   1245: iconst_1
    //   1246: istore #16
    //   1248: goto -> 1254
    //   1251: iconst_0
    //   1252: istore #16
    //   1254: aload_0
    //   1255: getfield X : I
    //   1258: istore #21
    //   1260: aload_0
    //   1261: iload #21
    //   1263: putfield A : I
    //   1266: aload_0
    //   1267: getfield W : F
    //   1270: fstore #9
    //   1272: aload_0
    //   1273: fload #9
    //   1275: putfield B : F
    //   1278: aload_0
    //   1279: getfield r : I
    //   1282: istore #13
    //   1284: aload_0
    //   1285: getfield s : I
    //   1288: istore #14
    //   1290: fload #9
    //   1292: fconst_0
    //   1293: fcmpl
    //   1294: ifle -> 1844
    //   1297: aload_0
    //   1298: getfield g0 : I
    //   1301: istore #22
    //   1303: iload #22
    //   1305: bipush #8
    //   1307: if_icmpeq -> 1841
    //   1310: iload #19
    //   1312: iconst_3
    //   1313: if_icmpne -> 1327
    //   1316: iload #13
    //   1318: ifne -> 1327
    //   1321: iconst_3
    //   1322: istore #13
    //   1324: goto -> 1327
    //   1327: iload #20
    //   1329: iconst_3
    //   1330: if_icmpne -> 1344
    //   1333: iload #14
    //   1335: ifne -> 1344
    //   1338: iconst_3
    //   1339: istore #14
    //   1341: goto -> 1344
    //   1344: iload #19
    //   1346: iconst_3
    //   1347: if_icmpne -> 1666
    //   1350: iload #20
    //   1352: iconst_3
    //   1353: if_icmpne -> 1666
    //   1356: iload #13
    //   1358: iconst_3
    //   1359: if_icmpne -> 1666
    //   1362: iload #14
    //   1364: iconst_3
    //   1365: if_icmpne -> 1666
    //   1368: iload #21
    //   1370: iconst_m1
    //   1371: if_icmpne -> 1421
    //   1374: iload #15
    //   1376: ifeq -> 1392
    //   1379: iload #16
    //   1381: ifne -> 1392
    //   1384: aload_0
    //   1385: iconst_0
    //   1386: putfield A : I
    //   1389: goto -> 1421
    //   1392: iload #15
    //   1394: ifne -> 1421
    //   1397: iload #16
    //   1399: ifeq -> 1421
    //   1402: aload_0
    //   1403: iconst_1
    //   1404: putfield A : I
    //   1407: iload #21
    //   1409: iconst_m1
    //   1410: if_icmpne -> 1421
    //   1413: aload_0
    //   1414: fconst_1
    //   1415: fload #9
    //   1417: fdiv
    //   1418: putfield B : F
    //   1421: aload_0
    //   1422: getfield A : I
    //   1425: ifne -> 1447
    //   1428: aload #47
    //   1430: invokevirtual f : ()Z
    //   1433: ifeq -> 1444
    //   1436: aload #42
    //   1438: invokevirtual f : ()Z
    //   1441: ifne -> 1447
    //   1444: goto -> 1450
    //   1447: goto -> 1458
    //   1450: aload_0
    //   1451: iconst_1
    //   1452: putfield A : I
    //   1455: goto -> 1487
    //   1458: aload_0
    //   1459: getfield A : I
    //   1462: iconst_1
    //   1463: if_icmpne -> 1487
    //   1466: aload #35
    //   1468: invokevirtual f : ()Z
    //   1471: ifeq -> 1482
    //   1474: aload #36
    //   1476: invokevirtual f : ()Z
    //   1479: ifne -> 1487
    //   1482: aload_0
    //   1483: iconst_0
    //   1484: putfield A : I
    //   1487: aload_0
    //   1488: getfield A : I
    //   1491: iconst_m1
    //   1492: if_icmpne -> 1582
    //   1495: aload #47
    //   1497: invokevirtual f : ()Z
    //   1500: ifeq -> 1527
    //   1503: aload #42
    //   1505: invokevirtual f : ()Z
    //   1508: ifeq -> 1527
    //   1511: aload #35
    //   1513: invokevirtual f : ()Z
    //   1516: ifeq -> 1527
    //   1519: aload #36
    //   1521: invokevirtual f : ()Z
    //   1524: ifne -> 1582
    //   1527: aload #47
    //   1529: invokevirtual f : ()Z
    //   1532: ifeq -> 1551
    //   1535: aload #42
    //   1537: invokevirtual f : ()Z
    //   1540: ifeq -> 1551
    //   1543: aload_0
    //   1544: iconst_0
    //   1545: putfield A : I
    //   1548: goto -> 1582
    //   1551: aload #35
    //   1553: invokevirtual f : ()Z
    //   1556: ifeq -> 1582
    //   1559: aload #36
    //   1561: invokevirtual f : ()Z
    //   1564: ifeq -> 1582
    //   1567: aload_0
    //   1568: fconst_1
    //   1569: aload_0
    //   1570: getfield B : F
    //   1573: fdiv
    //   1574: putfield B : F
    //   1577: aload_0
    //   1578: iconst_1
    //   1579: putfield A : I
    //   1582: iload #11
    //   1584: istore #15
    //   1586: aload_0
    //   1587: getfield A : I
    //   1590: iconst_m1
    //   1591: if_icmpne -> 1719
    //   1594: aload_0
    //   1595: getfield u : I
    //   1598: istore #16
    //   1600: iload #16
    //   1602: ifle -> 1624
    //   1605: aload_0
    //   1606: getfield x : I
    //   1609: ifne -> 1624
    //   1612: aload_0
    //   1613: iconst_0
    //   1614: putfield A : I
    //   1617: iload #11
    //   1619: istore #15
    //   1621: goto -> 1719
    //   1624: iload #11
    //   1626: istore #15
    //   1628: iload #16
    //   1630: ifne -> 1719
    //   1633: iload #11
    //   1635: istore #15
    //   1637: aload_0
    //   1638: getfield x : I
    //   1641: ifle -> 1719
    //   1644: aload_0
    //   1645: fconst_1
    //   1646: aload_0
    //   1647: getfield B : F
    //   1650: fdiv
    //   1651: putfield B : F
    //   1654: aload_0
    //   1655: iconst_1
    //   1656: putfield A : I
    //   1659: iload #11
    //   1661: istore #15
    //   1663: goto -> 1719
    //   1666: iload #19
    //   1668: iconst_3
    //   1669: if_icmpne -> 1741
    //   1672: iload #13
    //   1674: iconst_3
    //   1675: if_icmpne -> 1741
    //   1678: aload_0
    //   1679: iconst_0
    //   1680: putfield A : I
    //   1683: fload #9
    //   1685: iload #18
    //   1687: i2f
    //   1688: fmul
    //   1689: f2i
    //   1690: istore #16
    //   1692: iload #16
    //   1694: istore #15
    //   1696: iload #20
    //   1698: iconst_3
    //   1699: if_icmpeq -> 1719
    //   1702: iload #12
    //   1704: istore #11
    //   1706: iconst_4
    //   1707: istore #15
    //   1709: iconst_0
    //   1710: istore #13
    //   1712: iload #16
    //   1714: istore #12
    //   1716: goto -> 1862
    //   1719: iload #12
    //   1721: istore #11
    //   1723: iload #15
    //   1725: istore #12
    //   1727: iconst_1
    //   1728: istore #16
    //   1730: iload #13
    //   1732: istore #15
    //   1734: iload #16
    //   1736: istore #13
    //   1738: goto -> 1716
    //   1741: iload #11
    //   1743: istore #15
    //   1745: iload #20
    //   1747: iconst_3
    //   1748: if_icmpne -> 1719
    //   1751: iload #11
    //   1753: istore #15
    //   1755: iload #14
    //   1757: iconst_3
    //   1758: if_icmpne -> 1719
    //   1761: aload_0
    //   1762: iconst_1
    //   1763: putfield A : I
    //   1766: iload #21
    //   1768: iconst_m1
    //   1769: if_icmpne -> 1780
    //   1772: aload_0
    //   1773: fconst_1
    //   1774: fload #9
    //   1776: fdiv
    //   1777: putfield B : F
    //   1780: aload_0
    //   1781: getfield B : F
    //   1784: iload #17
    //   1786: i2f
    //   1787: fmul
    //   1788: f2i
    //   1789: istore #15
    //   1791: iload #19
    //   1793: iconst_3
    //   1794: if_icmpeq -> 1830
    //   1797: iload #13
    //   1799: istore #12
    //   1801: iconst_4
    //   1802: istore #14
    //   1804: iload #15
    //   1806: istore #13
    //   1808: iconst_0
    //   1809: istore #16
    //   1811: iload #12
    //   1813: istore #15
    //   1815: iload #11
    //   1817: istore #12
    //   1819: iload #13
    //   1821: istore #11
    //   1823: iload #16
    //   1825: istore #13
    //   1827: goto -> 1862
    //   1830: iload #11
    //   1832: istore #12
    //   1834: iload #15
    //   1836: istore #11
    //   1838: goto -> 1727
    //   1841: goto -> 1847
    //   1844: goto -> 1841
    //   1847: iload #12
    //   1849: istore #15
    //   1851: iload #13
    //   1853: istore #12
    //   1855: iload #15
    //   1857: istore #13
    //   1859: goto -> 1808
    //   1862: aload_0
    //   1863: getfield t : [I
    //   1866: astore #35
    //   1868: aload #35
    //   1870: iconst_0
    //   1871: iload #15
    //   1873: iastore
    //   1874: aload #35
    //   1876: iconst_1
    //   1877: iload #14
    //   1879: iastore
    //   1880: iload #13
    //   1882: ifeq -> 1908
    //   1885: aload_0
    //   1886: getfield A : I
    //   1889: istore #16
    //   1891: iload #16
    //   1893: ifeq -> 1902
    //   1896: iload #16
    //   1898: iconst_m1
    //   1899: if_icmpne -> 1908
    //   1902: iconst_1
    //   1903: istore #28
    //   1905: goto -> 1911
    //   1908: iconst_0
    //   1909: istore #28
    //   1911: iload #13
    //   1913: ifeq -> 1940
    //   1916: aload_0
    //   1917: getfield A : I
    //   1920: istore #16
    //   1922: iload #16
    //   1924: iconst_1
    //   1925: if_icmpeq -> 1934
    //   1928: iload #16
    //   1930: iconst_m1
    //   1931: if_icmpne -> 1940
    //   1934: iconst_1
    //   1935: istore #27
    //   1937: goto -> 1946
    //   1940: iconst_0
    //   1941: istore #27
    //   1943: goto -> 1937
    //   1946: aload #46
    //   1948: iconst_0
    //   1949: iaload
    //   1950: iconst_2
    //   1951: if_icmpne -> 1967
    //   1954: aload_0
    //   1955: instanceof fr
    //   1958: ifeq -> 1967
    //   1961: iconst_1
    //   1962: istore #29
    //   1964: goto -> 1970
    //   1967: iconst_0
    //   1968: istore #29
    //   1970: iload #29
    //   1972: ifeq -> 1978
    //   1975: iconst_0
    //   1976: istore #12
    //   1978: aload_0
    //   1979: getfield P : Lbq;
    //   1982: astore #47
    //   1984: aload #47
    //   1986: invokevirtual f : ()Z
    //   1989: iconst_1
    //   1990: ixor
    //   1991: istore #31
    //   1993: aload #37
    //   1995: iconst_0
    //   1996: baload
    //   1997: istore #33
    //   1999: aload #37
    //   2001: iconst_1
    //   2002: baload
    //   2003: istore #32
    //   2005: aload_0
    //   2006: getfield o : I
    //   2009: istore #16
    //   2011: aload_0
    //   2012: getfield C : [I
    //   2015: astore #48
    //   2017: aconst_null
    //   2018: astore #37
    //   2020: iload #16
    //   2022: iconst_2
    //   2023: if_icmpeq -> 2154
    //   2026: aload_0
    //   2027: getfield k : Z
    //   2030: ifne -> 2154
    //   2033: iload_2
    //   2034: ifeq -> 2157
    //   2037: aload_0
    //   2038: getfield d : Lfg0;
    //   2041: astore #35
    //   2043: aload #35
    //   2045: ifnull -> 2157
    //   2048: aload #35
    //   2050: getfield h : Liy;
    //   2053: astore #36
    //   2055: aload #36
    //   2057: getfield j : Z
    //   2060: ifeq -> 2074
    //   2063: aload #35
    //   2065: getfield i : Liy;
    //   2068: getfield j : Z
    //   2071: ifne -> 2077
    //   2074: goto -> 2157
    //   2077: iload_2
    //   2078: ifeq -> 2154
    //   2081: aload_1
    //   2082: aload #41
    //   2084: aload #36
    //   2086: getfield g : I
    //   2089: invokevirtual d : (Lpn1;I)V
    //   2092: aload_1
    //   2093: aload #39
    //   2095: aload_0
    //   2096: getfield d : Lfg0;
    //   2099: getfield i : Liy;
    //   2102: getfield g : I
    //   2105: invokevirtual d : (Lpn1;I)V
    //   2108: aload_0
    //   2109: getfield T : Ler;
    //   2112: ifnull -> 2154
    //   2115: iload #23
    //   2117: ifeq -> 2154
    //   2120: aload #45
    //   2122: iconst_0
    //   2123: baload
    //   2124: ifeq -> 2154
    //   2127: aload_0
    //   2128: invokevirtual v : ()Z
    //   2131: ifne -> 2154
    //   2134: aload_1
    //   2135: aload_1
    //   2136: aload_0
    //   2137: getfield T : Ler;
    //   2140: getfield K : Lbq;
    //   2143: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2146: aload #39
    //   2148: iconst_0
    //   2149: bipush #8
    //   2151: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2154: goto -> 2347
    //   2157: aload_0
    //   2158: getfield T : Ler;
    //   2161: astore #35
    //   2163: aload #35
    //   2165: ifnull -> 2182
    //   2168: aload_1
    //   2169: aload #35
    //   2171: getfield K : Lbq;
    //   2174: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2177: astore #35
    //   2179: goto -> 2185
    //   2182: aconst_null
    //   2183: astore #35
    //   2185: aload_0
    //   2186: getfield T : Ler;
    //   2189: astore #36
    //   2191: aload #36
    //   2193: ifnull -> 2210
    //   2196: aload_1
    //   2197: aload #36
    //   2199: getfield I : Lbq;
    //   2202: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2205: astore #36
    //   2207: goto -> 2216
    //   2210: aconst_null
    //   2211: astore #36
    //   2213: goto -> 2207
    //   2216: aload #45
    //   2218: iconst_0
    //   2219: baload
    //   2220: istore #34
    //   2222: aload #46
    //   2224: iconst_0
    //   2225: iaload
    //   2226: istore #19
    //   2228: aload_0
    //   2229: getfield Y : I
    //   2232: istore #18
    //   2234: aload_0
    //   2235: getfield b0 : I
    //   2238: istore #20
    //   2240: aload #48
    //   2242: iconst_0
    //   2243: iaload
    //   2244: istore #16
    //   2246: aload_0
    //   2247: getfield d0 : F
    //   2250: fstore #10
    //   2252: iconst_1
    //   2253: istore #30
    //   2255: aload #46
    //   2257: iconst_1
    //   2258: iaload
    //   2259: iconst_3
    //   2260: if_icmpne -> 2266
    //   2263: goto -> 2269
    //   2266: iconst_0
    //   2267: istore #30
    //   2269: aload_0
    //   2270: getfield u : I
    //   2273: istore #17
    //   2275: aload_0
    //   2276: getfield v : I
    //   2279: istore #21
    //   2281: aload_0
    //   2282: getfield w : F
    //   2285: fstore #9
    //   2287: aload_0
    //   2288: aload_1
    //   2289: iconst_1
    //   2290: iload #23
    //   2292: iload #24
    //   2294: iload #34
    //   2296: aload #36
    //   2298: aload #35
    //   2300: iload #19
    //   2302: iload #29
    //   2304: aload_0
    //   2305: getfield I : Lbq;
    //   2308: aload_0
    //   2309: getfield K : Lbq;
    //   2312: iload #18
    //   2314: iload #12
    //   2316: iload #20
    //   2318: iload #16
    //   2320: fload #10
    //   2322: iload #28
    //   2324: iload #30
    //   2326: iload #26
    //   2328: iload #25
    //   2330: iload #33
    //   2332: iload #15
    //   2334: iload #14
    //   2336: iload #17
    //   2338: iload #21
    //   2340: fload #9
    //   2342: iload #31
    //   2344: invokevirtual d : (Lln0;ZZZZLpn1;Lpn1;IZLbq;Lbq;IIIIFZZZZZIIIIFZ)V
    //   2347: iload_2
    //   2348: ifeq -> 2493
    //   2351: aload_0
    //   2352: getfield e : Ld22;
    //   2355: astore #35
    //   2357: aload #35
    //   2359: ifnull -> 2493
    //   2362: aload #35
    //   2364: getfield h : Liy;
    //   2367: astore #36
    //   2369: aload #36
    //   2371: getfield j : Z
    //   2374: ifeq -> 2493
    //   2377: aload #35
    //   2379: getfield i : Liy;
    //   2382: getfield j : Z
    //   2385: ifeq -> 2493
    //   2388: aload_1
    //   2389: aload #38
    //   2391: aload #36
    //   2393: getfield g : I
    //   2396: invokevirtual d : (Lpn1;I)V
    //   2399: aload_0
    //   2400: getfield e : Ld22;
    //   2403: getfield i : Liy;
    //   2406: getfield g : I
    //   2409: istore #12
    //   2411: aload_1
    //   2412: aload #40
    //   2414: iload #12
    //   2416: invokevirtual d : (Lpn1;I)V
    //   2419: aload_1
    //   2420: aload #44
    //   2422: aload_0
    //   2423: getfield e : Ld22;
    //   2426: getfield k : Liy;
    //   2429: getfield g : I
    //   2432: invokevirtual d : (Lpn1;I)V
    //   2435: aload_0
    //   2436: getfield T : Ler;
    //   2439: astore #35
    //   2441: aload #35
    //   2443: ifnull -> 2487
    //   2446: iload #25
    //   2448: ifne -> 2487
    //   2451: iload #24
    //   2453: ifeq -> 2487
    //   2456: aload #45
    //   2458: iconst_1
    //   2459: baload
    //   2460: ifeq -> 2484
    //   2463: aload_1
    //   2464: aload_1
    //   2465: aload #35
    //   2467: getfield L : Lbq;
    //   2470: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2473: aload #40
    //   2475: iconst_0
    //   2476: bipush #8
    //   2478: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2481: goto -> 2487
    //   2484: goto -> 2487
    //   2487: iconst_0
    //   2488: istore #12
    //   2490: goto -> 2496
    //   2493: iconst_1
    //   2494: istore #12
    //   2496: iconst_1
    //   2497: istore #29
    //   2499: aload_0
    //   2500: getfield p : I
    //   2503: iconst_2
    //   2504: if_icmpne -> 2510
    //   2507: iconst_0
    //   2508: istore #12
    //   2510: iload #12
    //   2512: ifeq -> 2876
    //   2515: aload_0
    //   2516: getfield l : Z
    //   2519: ifne -> 2876
    //   2522: aload #46
    //   2524: iconst_1
    //   2525: iaload
    //   2526: iconst_2
    //   2527: if_icmpne -> 2542
    //   2530: aload_0
    //   2531: instanceof fr
    //   2534: ifeq -> 2542
    //   2537: iconst_1
    //   2538: istore_2
    //   2539: goto -> 2544
    //   2542: iconst_0
    //   2543: istore_2
    //   2544: iload_2
    //   2545: ifeq -> 2554
    //   2548: iconst_0
    //   2549: istore #11
    //   2551: goto -> 2554
    //   2554: aload_0
    //   2555: getfield T : Ler;
    //   2558: astore #35
    //   2560: aload #35
    //   2562: ifnull -> 2579
    //   2565: aload_1
    //   2566: aload #35
    //   2568: getfield L : Lbq;
    //   2571: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2574: astore #35
    //   2576: goto -> 2582
    //   2579: aconst_null
    //   2580: astore #35
    //   2582: aload_0
    //   2583: getfield T : Ler;
    //   2586: astore #49
    //   2588: aload #37
    //   2590: astore #36
    //   2592: aload #49
    //   2594: ifnull -> 2608
    //   2597: aload_1
    //   2598: aload #49
    //   2600: getfield J : Lbq;
    //   2603: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2606: astore #36
    //   2608: aload_0
    //   2609: getfield a0 : I
    //   2612: istore #12
    //   2614: iload #12
    //   2616: ifgt -> 2632
    //   2619: iload #31
    //   2621: istore #28
    //   2623: aload_0
    //   2624: getfield g0 : I
    //   2627: bipush #8
    //   2629: if_icmpne -> 2746
    //   2632: aload #43
    //   2634: getfield f : Lbq;
    //   2637: ifnull -> 2699
    //   2640: aload_1
    //   2641: aload #44
    //   2643: aload #38
    //   2645: iload #12
    //   2647: bipush #8
    //   2649: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2652: aload_1
    //   2653: aload #44
    //   2655: aload_1
    //   2656: aload #43
    //   2658: getfield f : Lbq;
    //   2661: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2664: aload #43
    //   2666: invokevirtual d : ()I
    //   2669: bipush #8
    //   2671: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2674: iload #24
    //   2676: ifeq -> 2693
    //   2679: aload_1
    //   2680: aload #35
    //   2682: aload_1
    //   2683: aload #42
    //   2685: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   2688: iconst_0
    //   2689: iconst_5
    //   2690: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2693: iconst_0
    //   2694: istore #28
    //   2696: goto -> 2746
    //   2699: aload_0
    //   2700: getfield g0 : I
    //   2703: bipush #8
    //   2705: if_icmpne -> 2730
    //   2708: aload_1
    //   2709: aload #44
    //   2711: aload #38
    //   2713: aload #43
    //   2715: invokevirtual d : ()I
    //   2718: bipush #8
    //   2720: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2723: iload #31
    //   2725: istore #28
    //   2727: goto -> 2746
    //   2730: aload_1
    //   2731: aload #44
    //   2733: aload #38
    //   2735: iload #12
    //   2737: bipush #8
    //   2739: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2742: iload #31
    //   2744: istore #28
    //   2746: aload #45
    //   2748: iconst_1
    //   2749: baload
    //   2750: istore #30
    //   2752: aload #46
    //   2754: iconst_1
    //   2755: iaload
    //   2756: istore #17
    //   2758: aload_0
    //   2759: getfield Z : I
    //   2762: istore #16
    //   2764: aload_0
    //   2765: getfield c0 : I
    //   2768: istore #12
    //   2770: aload #48
    //   2772: iconst_1
    //   2773: iaload
    //   2774: istore #20
    //   2776: aload_0
    //   2777: getfield e0 : F
    //   2780: fstore #10
    //   2782: aload #46
    //   2784: iconst_0
    //   2785: iaload
    //   2786: iconst_3
    //   2787: if_icmpne -> 2793
    //   2790: goto -> 2796
    //   2793: iconst_0
    //   2794: istore #29
    //   2796: aload_0
    //   2797: getfield x : I
    //   2800: istore #18
    //   2802: aload_0
    //   2803: getfield y : I
    //   2806: istore #19
    //   2808: aload_0
    //   2809: getfield z : F
    //   2812: fstore #9
    //   2814: aload_0
    //   2815: aload_1
    //   2816: iconst_0
    //   2817: iload #24
    //   2819: iload #23
    //   2821: iload #30
    //   2823: aload #36
    //   2825: aload #35
    //   2827: iload #17
    //   2829: iload_2
    //   2830: aload_0
    //   2831: getfield J : Lbq;
    //   2834: aload_0
    //   2835: getfield L : Lbq;
    //   2838: iload #16
    //   2840: iload #11
    //   2842: iload #12
    //   2844: iload #20
    //   2846: fload #10
    //   2848: iload #27
    //   2850: iload #29
    //   2852: iload #25
    //   2854: iload #26
    //   2856: iload #32
    //   2858: iload #14
    //   2860: iload #15
    //   2862: iload #18
    //   2864: iload #19
    //   2866: fload #9
    //   2868: iload #28
    //   2870: invokevirtual d : (Lln0;ZZZZLpn1;Lpn1;IZLbq;Lbq;IIIIFZZZZZIIIIFZ)V
    //   2873: goto -> 2876
    //   2876: iload #13
    //   2878: ifeq -> 3022
    //   2881: aload_0
    //   2882: getfield A : I
    //   2885: istore #11
    //   2887: aload_0
    //   2888: getfield B : F
    //   2891: fstore #9
    //   2893: iload #11
    //   2895: iconst_1
    //   2896: if_icmpne -> 2962
    //   2899: aload_1
    //   2900: invokevirtual l : ()Lc9;
    //   2903: astore #35
    //   2905: aload #35
    //   2907: getfield d : Lw8;
    //   2910: aload #40
    //   2912: ldc -1.0
    //   2914: invokevirtual g : (Lpn1;F)V
    //   2917: aload #35
    //   2919: getfield d : Lw8;
    //   2922: aload #38
    //   2924: fconst_1
    //   2925: invokevirtual g : (Lpn1;F)V
    //   2928: aload #35
    //   2930: getfield d : Lw8;
    //   2933: aload #39
    //   2935: fload #9
    //   2937: invokevirtual g : (Lpn1;F)V
    //   2940: aload #35
    //   2942: getfield d : Lw8;
    //   2945: aload #41
    //   2947: fload #9
    //   2949: fneg
    //   2950: invokevirtual g : (Lpn1;F)V
    //   2953: aload_1
    //   2954: aload #35
    //   2956: invokevirtual c : (Lc9;)V
    //   2959: goto -> 3022
    //   2962: aload_1
    //   2963: invokevirtual l : ()Lc9;
    //   2966: astore #35
    //   2968: aload #35
    //   2970: getfield d : Lw8;
    //   2973: aload #39
    //   2975: ldc -1.0
    //   2977: invokevirtual g : (Lpn1;F)V
    //   2980: aload #35
    //   2982: getfield d : Lw8;
    //   2985: aload #41
    //   2987: fconst_1
    //   2988: invokevirtual g : (Lpn1;F)V
    //   2991: aload #35
    //   2993: getfield d : Lw8;
    //   2996: aload #40
    //   2998: fload #9
    //   3000: invokevirtual g : (Lpn1;F)V
    //   3003: aload #35
    //   3005: getfield d : Lw8;
    //   3008: aload #38
    //   3010: fload #9
    //   3012: fneg
    //   3013: invokevirtual g : (Lpn1;F)V
    //   3016: aload_1
    //   3017: aload #35
    //   3019: invokevirtual c : (Lc9;)V
    //   3022: aload #47
    //   3024: invokevirtual f : ()Z
    //   3027: ifeq -> 3327
    //   3030: aload #47
    //   3032: getfield f : Lbq;
    //   3035: getfield d : Ler;
    //   3038: astore #42
    //   3040: aload_0
    //   3041: getfield D : F
    //   3044: ldc_w 90.0
    //   3047: fadd
    //   3048: f2d
    //   3049: invokestatic toRadians : (D)D
    //   3052: d2f
    //   3053: fstore #9
    //   3055: aload #47
    //   3057: invokevirtual d : ()I
    //   3060: istore #11
    //   3062: aload_1
    //   3063: aload_0
    //   3064: iconst_2
    //   3065: invokevirtual g : (I)Lbq;
    //   3068: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3071: astore #35
    //   3073: aload_1
    //   3074: aload_0
    //   3075: iconst_3
    //   3076: invokevirtual g : (I)Lbq;
    //   3079: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3082: astore #41
    //   3084: aload_1
    //   3085: aload_0
    //   3086: iconst_4
    //   3087: invokevirtual g : (I)Lbq;
    //   3090: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3093: astore #37
    //   3095: aload_1
    //   3096: aload_0
    //   3097: iconst_5
    //   3098: invokevirtual g : (I)Lbq;
    //   3101: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3104: astore #39
    //   3106: aload_1
    //   3107: aload #42
    //   3109: iconst_2
    //   3110: invokevirtual g : (I)Lbq;
    //   3113: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3116: astore #36
    //   3118: aload_1
    //   3119: aload #42
    //   3121: iconst_3
    //   3122: invokevirtual g : (I)Lbq;
    //   3125: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3128: astore #40
    //   3130: aload_1
    //   3131: aload #42
    //   3133: iconst_4
    //   3134: invokevirtual g : (I)Lbq;
    //   3137: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3140: astore #38
    //   3142: aload_1
    //   3143: aload #42
    //   3145: iconst_5
    //   3146: invokevirtual g : (I)Lbq;
    //   3149: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3152: astore #43
    //   3154: aload_1
    //   3155: invokevirtual l : ()Lc9;
    //   3158: astore #42
    //   3160: fload #9
    //   3162: f2d
    //   3163: dstore #7
    //   3165: dload #7
    //   3167: invokestatic sin : (D)D
    //   3170: dstore #5
    //   3172: iload #11
    //   3174: i2d
    //   3175: dstore_3
    //   3176: dload #5
    //   3178: dload_3
    //   3179: dmul
    //   3180: d2f
    //   3181: fstore #9
    //   3183: aload #42
    //   3185: getfield d : Lw8;
    //   3188: aload #40
    //   3190: ldc 0.5
    //   3192: invokevirtual g : (Lpn1;F)V
    //   3195: aload #42
    //   3197: getfield d : Lw8;
    //   3200: aload #43
    //   3202: ldc 0.5
    //   3204: invokevirtual g : (Lpn1;F)V
    //   3207: aload #42
    //   3209: getfield d : Lw8;
    //   3212: aload #41
    //   3214: ldc_w -0.5
    //   3217: invokevirtual g : (Lpn1;F)V
    //   3220: aload #42
    //   3222: getfield d : Lw8;
    //   3225: aload #39
    //   3227: ldc_w -0.5
    //   3230: invokevirtual g : (Lpn1;F)V
    //   3233: aload #42
    //   3235: fload #9
    //   3237: fneg
    //   3238: putfield b : F
    //   3241: aload_1
    //   3242: aload #42
    //   3244: invokevirtual c : (Lc9;)V
    //   3247: aload_1
    //   3248: invokevirtual l : ()Lc9;
    //   3251: astore #39
    //   3253: dload #7
    //   3255: invokestatic cos : (D)D
    //   3258: dload_3
    //   3259: dmul
    //   3260: d2f
    //   3261: fstore #9
    //   3263: aload #39
    //   3265: getfield d : Lw8;
    //   3268: aload #36
    //   3270: ldc 0.5
    //   3272: invokevirtual g : (Lpn1;F)V
    //   3275: aload #39
    //   3277: getfield d : Lw8;
    //   3280: aload #38
    //   3282: ldc 0.5
    //   3284: invokevirtual g : (Lpn1;F)V
    //   3287: aload #39
    //   3289: getfield d : Lw8;
    //   3292: aload #35
    //   3294: ldc_w -0.5
    //   3297: invokevirtual g : (Lpn1;F)V
    //   3300: aload #39
    //   3302: getfield d : Lw8;
    //   3305: aload #37
    //   3307: ldc_w -0.5
    //   3310: invokevirtual g : (Lpn1;F)V
    //   3313: aload #39
    //   3315: fload #9
    //   3317: fneg
    //   3318: putfield b : F
    //   3321: aload_1
    //   3322: aload #39
    //   3324: invokevirtual c : (Lc9;)V
    //   3327: aload_0
    //   3328: iconst_0
    //   3329: putfield k : Z
    //   3332: aload_0
    //   3333: iconst_0
    //   3334: putfield l : Z
    //   3337: return
  }
  
  public boolean c() {
    return (this.g0 != 8);
  }
  
  public final void d(ln0 paramln0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, pn1 parampn11, pn1 parampn12, int paramInt1, boolean paramBoolean5, bq parambq1, bq parambq2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat2, boolean paramBoolean11) {
    // Byte code:
    //   0: aload_1
    //   1: aload #10
    //   3: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   6: astore #39
    //   8: aload_1
    //   9: aload #11
    //   11: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   14: astore #37
    //   16: aload_1
    //   17: aload #10
    //   19: getfield f : Lbq;
    //   22: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   25: astore #34
    //   27: aload_1
    //   28: aload #11
    //   30: getfield f : Lbq;
    //   33: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   36: astore #38
    //   38: aload #10
    //   40: invokevirtual f : ()Z
    //   43: istore #31
    //   45: aload #11
    //   47: invokevirtual f : ()Z
    //   50: istore #32
    //   52: aload_0
    //   53: getfield P : Lbq;
    //   56: invokevirtual f : ()Z
    //   59: istore #33
    //   61: iload #32
    //   63: ifeq -> 75
    //   66: iload #31
    //   68: iconst_1
    //   69: iadd
    //   70: istore #28
    //   72: goto -> 79
    //   75: iload #31
    //   77: istore #28
    //   79: iload #28
    //   81: istore #30
    //   83: iload #33
    //   85: ifeq -> 94
    //   88: iload #28
    //   90: iconst_1
    //   91: iadd
    //   92: istore #30
    //   94: iload #17
    //   96: ifeq -> 105
    //   99: iconst_3
    //   100: istore #29
    //   102: goto -> 109
    //   105: iload #22
    //   107: istore #29
    //   109: iload #8
    //   111: invokestatic y : (I)I
    //   114: istore #8
    //   116: iload #8
    //   118: ifeq -> 133
    //   121: iload #8
    //   123: iconst_1
    //   124: if_icmpeq -> 133
    //   127: iload #8
    //   129: iconst_2
    //   130: if_icmpeq -> 139
    //   133: iconst_0
    //   134: istore #8
    //   136: goto -> 148
    //   139: iload #29
    //   141: iconst_4
    //   142: if_icmpeq -> 133
    //   145: iconst_1
    //   146: istore #8
    //   148: aload_0
    //   149: getfield h : I
    //   152: istore #22
    //   154: iload #22
    //   156: iconst_m1
    //   157: if_icmpeq -> 179
    //   160: iload_2
    //   161: ifeq -> 179
    //   164: aload_0
    //   165: iconst_m1
    //   166: putfield h : I
    //   169: iconst_0
    //   170: istore #13
    //   172: iload #22
    //   174: istore #8
    //   176: goto -> 191
    //   179: iload #13
    //   181: istore #22
    //   183: iload #8
    //   185: istore #13
    //   187: iload #22
    //   189: istore #8
    //   191: aload_0
    //   192: getfield i : I
    //   195: istore #22
    //   197: iload #22
    //   199: iconst_m1
    //   200: if_icmpeq -> 222
    //   203: iload_2
    //   204: ifne -> 222
    //   207: aload_0
    //   208: iconst_m1
    //   209: putfield i : I
    //   212: iload #22
    //   214: istore #13
    //   216: iconst_0
    //   217: istore #8
    //   219: goto -> 234
    //   222: iload #13
    //   224: istore #22
    //   226: iload #8
    //   228: istore #13
    //   230: iload #22
    //   232: istore #8
    //   234: aload_0
    //   235: getfield g0 : I
    //   238: bipush #8
    //   240: if_icmpne -> 252
    //   243: iconst_0
    //   244: istore #28
    //   246: iconst_0
    //   247: istore #13
    //   249: goto -> 256
    //   252: iload #8
    //   254: istore #28
    //   256: iload #27
    //   258: ifeq -> 315
    //   261: iload #31
    //   263: ifne -> 287
    //   266: iload #32
    //   268: ifne -> 287
    //   271: iload #33
    //   273: ifne -> 287
    //   276: aload_1
    //   277: aload #39
    //   279: iload #12
    //   281: invokevirtual d : (Lpn1;I)V
    //   284: goto -> 315
    //   287: iload #31
    //   289: ifeq -> 284
    //   292: iload #32
    //   294: ifne -> 284
    //   297: aload_1
    //   298: aload #39
    //   300: aload #34
    //   302: aload #10
    //   304: invokevirtual d : ()I
    //   307: bipush #8
    //   309: invokevirtual e : (Lpn1;Lpn1;II)V
    //   312: goto -> 315
    //   315: iload #28
    //   317: ifne -> 417
    //   320: iload #9
    //   322: ifeq -> 390
    //   325: aload_1
    //   326: aload #37
    //   328: aload #39
    //   330: iconst_0
    //   331: iconst_3
    //   332: invokevirtual e : (Lpn1;Lpn1;II)V
    //   335: iload #14
    //   337: ifle -> 352
    //   340: aload_1
    //   341: aload #37
    //   343: aload #39
    //   345: iload #14
    //   347: bipush #8
    //   349: invokevirtual f : (Lpn1;Lpn1;II)V
    //   352: iload #24
    //   354: istore #8
    //   356: iload #25
    //   358: istore #12
    //   360: iload #15
    //   362: ldc 2147483647
    //   364: if_icmpge -> 410
    //   367: aload_1
    //   368: aload #37
    //   370: aload #39
    //   372: iload #15
    //   374: bipush #8
    //   376: invokevirtual g : (Lpn1;Lpn1;II)V
    //   379: iload #24
    //   381: istore #8
    //   383: iload #25
    //   385: istore #12
    //   387: goto -> 410
    //   390: aload_1
    //   391: aload #37
    //   393: aload #39
    //   395: iload #13
    //   397: bipush #8
    //   399: invokevirtual e : (Lpn1;Lpn1;II)V
    //   402: iload #25
    //   404: istore #12
    //   406: iload #24
    //   408: istore #8
    //   410: iload #8
    //   412: istore #24
    //   414: goto -> 863
    //   417: iload #30
    //   419: iconst_2
    //   420: if_icmpeq -> 488
    //   423: iload #17
    //   425: ifne -> 488
    //   428: iload #29
    //   430: iconst_1
    //   431: if_icmpeq -> 439
    //   434: iload #29
    //   436: ifne -> 488
    //   439: iload #24
    //   441: iload #13
    //   443: invokestatic max : (II)I
    //   446: istore #12
    //   448: iload #12
    //   450: istore #8
    //   452: iload #25
    //   454: ifle -> 466
    //   457: iload #25
    //   459: iload #12
    //   461: invokestatic min : (II)I
    //   464: istore #8
    //   466: aload_1
    //   467: aload #37
    //   469: aload #39
    //   471: iload #8
    //   473: bipush #8
    //   475: invokevirtual e : (Lpn1;Lpn1;II)V
    //   478: iconst_0
    //   479: istore #28
    //   481: iload #25
    //   483: istore #12
    //   485: goto -> 863
    //   488: iload #24
    //   490: istore #8
    //   492: iload #24
    //   494: bipush #-2
    //   496: if_icmpne -> 503
    //   499: iload #13
    //   501: istore #8
    //   503: iload #25
    //   505: istore #12
    //   507: iload #25
    //   509: bipush #-2
    //   511: if_icmpne -> 518
    //   514: iload #13
    //   516: istore #12
    //   518: iload #13
    //   520: istore #15
    //   522: iload #13
    //   524: ifle -> 540
    //   527: iload #13
    //   529: istore #15
    //   531: iload #29
    //   533: iconst_1
    //   534: if_icmpeq -> 540
    //   537: iconst_0
    //   538: istore #15
    //   540: iload #15
    //   542: istore #13
    //   544: iload #8
    //   546: ifle -> 570
    //   549: aload_1
    //   550: aload #37
    //   552: aload #39
    //   554: iload #8
    //   556: bipush #8
    //   558: invokevirtual f : (Lpn1;Lpn1;II)V
    //   561: iload #15
    //   563: iload #8
    //   565: invokestatic max : (II)I
    //   568: istore #13
    //   570: iload #13
    //   572: istore #15
    //   574: iload #12
    //   576: ifle -> 613
    //   579: iload_3
    //   580: ifeq -> 592
    //   583: iload #29
    //   585: iconst_1
    //   586: if_icmpne -> 592
    //   589: goto -> 604
    //   592: aload_1
    //   593: aload #37
    //   595: aload #39
    //   597: iload #12
    //   599: bipush #8
    //   601: invokevirtual g : (Lpn1;Lpn1;II)V
    //   604: iload #13
    //   606: iload #12
    //   608: invokestatic min : (II)I
    //   611: istore #15
    //   613: iload #29
    //   615: iconst_1
    //   616: if_icmpne -> 695
    //   619: iload_3
    //   620: ifeq -> 638
    //   623: aload_1
    //   624: aload #37
    //   626: aload #39
    //   628: iload #15
    //   630: bipush #8
    //   632: invokevirtual e : (Lpn1;Lpn1;II)V
    //   635: goto -> 410
    //   638: iload #19
    //   640: ifeq -> 669
    //   643: aload_1
    //   644: aload #37
    //   646: aload #39
    //   648: iload #15
    //   650: iconst_5
    //   651: invokevirtual e : (Lpn1;Lpn1;II)V
    //   654: aload_1
    //   655: aload #37
    //   657: aload #39
    //   659: iload #15
    //   661: bipush #8
    //   663: invokevirtual g : (Lpn1;Lpn1;II)V
    //   666: goto -> 410
    //   669: aload_1
    //   670: aload #37
    //   672: aload #39
    //   674: iload #15
    //   676: iconst_5
    //   677: invokevirtual e : (Lpn1;Lpn1;II)V
    //   680: aload_1
    //   681: aload #37
    //   683: aload #39
    //   685: iload #15
    //   687: bipush #8
    //   689: invokevirtual g : (Lpn1;Lpn1;II)V
    //   692: goto -> 410
    //   695: iload #29
    //   697: iconst_2
    //   698: if_icmpne -> 856
    //   701: aload #10
    //   703: getfield e : I
    //   706: istore #13
    //   708: iload #13
    //   710: iconst_3
    //   711: if_icmpeq -> 720
    //   714: iload #13
    //   716: iconst_5
    //   717: if_icmpne -> 723
    //   720: goto -> 754
    //   723: aload_1
    //   724: aload_0
    //   725: getfield T : Ler;
    //   728: iconst_2
    //   729: invokevirtual g : (I)Lbq;
    //   732: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   735: astore #36
    //   737: aload_1
    //   738: aload_0
    //   739: getfield T : Ler;
    //   742: iconst_4
    //   743: invokevirtual g : (I)Lbq;
    //   746: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   749: astore #35
    //   751: goto -> 782
    //   754: aload_1
    //   755: aload_0
    //   756: getfield T : Ler;
    //   759: iconst_3
    //   760: invokevirtual g : (I)Lbq;
    //   763: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   766: astore #36
    //   768: aload_1
    //   769: aload_0
    //   770: getfield T : Ler;
    //   773: iconst_5
    //   774: invokevirtual g : (I)Lbq;
    //   777: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   780: astore #35
    //   782: aload_1
    //   783: invokevirtual l : ()Lc9;
    //   786: astore #40
    //   788: aload #40
    //   790: getfield d : Lw8;
    //   793: aload #37
    //   795: ldc -1.0
    //   797: invokevirtual g : (Lpn1;F)V
    //   800: aload #40
    //   802: getfield d : Lw8;
    //   805: aload #39
    //   807: fconst_1
    //   808: invokevirtual g : (Lpn1;F)V
    //   811: aload #40
    //   813: getfield d : Lw8;
    //   816: aload #35
    //   818: fload #26
    //   820: invokevirtual g : (Lpn1;F)V
    //   823: aload #40
    //   825: getfield d : Lw8;
    //   828: aload #36
    //   830: fload #26
    //   832: fneg
    //   833: invokevirtual g : (Lpn1;F)V
    //   836: aload_1
    //   837: aload #40
    //   839: invokevirtual c : (Lc9;)V
    //   842: iload_3
    //   843: ifeq -> 849
    //   846: iconst_0
    //   847: istore #28
    //   849: iload #8
    //   851: istore #24
    //   853: goto -> 863
    //   856: iconst_1
    //   857: istore #5
    //   859: iload #8
    //   861: istore #24
    //   863: iload #27
    //   865: ifeq -> 873
    //   868: iload #19
    //   870: ifeq -> 876
    //   873: goto -> 2288
    //   876: iload #31
    //   878: ifne -> 894
    //   881: iload #32
    //   883: ifne -> 894
    //   886: iload #33
    //   888: ifne -> 894
    //   891: goto -> 2230
    //   894: iload #31
    //   896: ifeq -> 941
    //   899: iload #32
    //   901: ifne -> 941
    //   904: aload #10
    //   906: getfield f : Lbq;
    //   909: getfield d : Ler;
    //   912: astore #6
    //   914: iload_3
    //   915: ifeq -> 933
    //   918: aload #6
    //   920: instanceof yb
    //   923: ifeq -> 933
    //   926: bipush #8
    //   928: istore #8
    //   930: goto -> 936
    //   933: iconst_5
    //   934: istore #8
    //   936: iload_3
    //   937: istore_2
    //   938: goto -> 2235
    //   941: iload #31
    //   943: ifne -> 987
    //   946: iload #32
    //   948: ifeq -> 987
    //   951: aload_1
    //   952: aload #37
    //   954: aload #38
    //   956: aload #11
    //   958: invokevirtual d : ()I
    //   961: ineg
    //   962: bipush #8
    //   964: invokevirtual e : (Lpn1;Lpn1;II)V
    //   967: iload_3
    //   968: ifeq -> 984
    //   971: aload_1
    //   972: aload #39
    //   974: aload #6
    //   976: iconst_0
    //   977: iconst_5
    //   978: invokevirtual f : (Lpn1;Lpn1;II)V
    //   981: goto -> 2230
    //   984: goto -> 891
    //   987: iload #31
    //   989: ifeq -> 984
    //   992: iload #32
    //   994: ifeq -> 984
    //   997: aload #10
    //   999: getfield f : Lbq;
    //   1002: getfield d : Ler;
    //   1005: astore #41
    //   1007: aload #11
    //   1009: getfield f : Lbq;
    //   1012: getfield d : Ler;
    //   1015: astore #40
    //   1017: aload_0
    //   1018: getfield T : Ler;
    //   1021: astore #36
    //   1023: bipush #6
    //   1025: istore #30
    //   1027: iload #28
    //   1029: ifeq -> 1501
    //   1032: iload #29
    //   1034: ifne -> 1206
    //   1037: iload #12
    //   1039: ifne -> 1115
    //   1042: iload #24
    //   1044: ifne -> 1115
    //   1047: aload #34
    //   1049: getfield h : Z
    //   1052: ifeq -> 1095
    //   1055: aload #38
    //   1057: getfield h : Z
    //   1060: ifeq -> 1095
    //   1063: aload_1
    //   1064: aload #39
    //   1066: aload #34
    //   1068: aload #10
    //   1070: invokevirtual d : ()I
    //   1073: bipush #8
    //   1075: invokevirtual e : (Lpn1;Lpn1;II)V
    //   1078: aload_1
    //   1079: aload #37
    //   1081: aload #38
    //   1083: aload #11
    //   1085: invokevirtual d : ()I
    //   1088: ineg
    //   1089: bipush #8
    //   1091: invokevirtual e : (Lpn1;Lpn1;II)V
    //   1094: return
    //   1095: bipush #8
    //   1097: istore #12
    //   1099: bipush #8
    //   1101: istore #22
    //   1103: iconst_0
    //   1104: istore #8
    //   1106: iconst_1
    //   1107: istore #13
    //   1109: iconst_0
    //   1110: istore #15
    //   1112: goto -> 1130
    //   1115: iconst_5
    //   1116: istore #12
    //   1118: iconst_5
    //   1119: istore #22
    //   1121: iconst_1
    //   1122: istore #8
    //   1124: iconst_0
    //   1125: istore #13
    //   1127: iconst_1
    //   1128: istore #15
    //   1130: aload #41
    //   1132: instanceof yb
    //   1135: ifne -> 1180
    //   1138: aload #40
    //   1140: instanceof yb
    //   1143: ifeq -> 1149
    //   1146: goto -> 1180
    //   1149: iload #13
    //   1151: istore #23
    //   1153: iload #12
    //   1155: istore #13
    //   1157: iload #22
    //   1159: istore #12
    //   1161: iload #23
    //   1163: istore #22
    //   1165: iload #8
    //   1167: istore #23
    //   1169: iload #13
    //   1171: istore #8
    //   1173: bipush #6
    //   1175: istore #13
    //   1177: goto -> 1604
    //   1180: iload #13
    //   1182: istore #22
    //   1184: bipush #6
    //   1186: istore #13
    //   1188: iload #8
    //   1190: istore #23
    //   1192: iconst_4
    //   1193: istore #25
    //   1195: iload #12
    //   1197: istore #8
    //   1199: iload #25
    //   1201: istore #12
    //   1203: goto -> 1604
    //   1206: iload #29
    //   1208: iconst_2
    //   1209: if_icmpne -> 1258
    //   1212: aload #41
    //   1214: instanceof yb
    //   1217: ifne -> 1249
    //   1220: aload #40
    //   1222: instanceof yb
    //   1225: ifeq -> 1231
    //   1228: goto -> 1249
    //   1231: iconst_5
    //   1232: istore #8
    //   1234: iconst_5
    //   1235: istore #12
    //   1237: iconst_1
    //   1238: istore #23
    //   1240: iconst_1
    //   1241: istore #15
    //   1243: iconst_0
    //   1244: istore #22
    //   1246: goto -> 1173
    //   1249: iconst_5
    //   1250: istore #8
    //   1252: iconst_4
    //   1253: istore #12
    //   1255: goto -> 1237
    //   1258: iload #29
    //   1260: iconst_1
    //   1261: if_icmpne -> 1271
    //   1264: bipush #8
    //   1266: istore #8
    //   1268: goto -> 1252
    //   1271: iload #29
    //   1273: iconst_3
    //   1274: if_icmpne -> 1479
    //   1277: aload_0
    //   1278: getfield A : I
    //   1281: iconst_m1
    //   1282: if_icmpne -> 1341
    //   1285: iload #20
    //   1287: ifeq -> 1330
    //   1290: bipush #8
    //   1292: istore #15
    //   1294: iload_3
    //   1295: ifeq -> 1324
    //   1298: iconst_5
    //   1299: istore #8
    //   1301: iconst_5
    //   1302: istore #12
    //   1304: iload #8
    //   1306: istore #13
    //   1308: iload #15
    //   1310: istore #8
    //   1312: iconst_1
    //   1313: istore #23
    //   1315: iconst_1
    //   1316: istore #15
    //   1318: iconst_1
    //   1319: istore #22
    //   1321: goto -> 1604
    //   1324: iconst_4
    //   1325: istore #8
    //   1327: goto -> 1301
    //   1330: bipush #8
    //   1332: istore #15
    //   1334: bipush #8
    //   1336: istore #8
    //   1338: goto -> 1301
    //   1341: iload #17
    //   1343: ifeq -> 1393
    //   1346: iload #23
    //   1348: iconst_2
    //   1349: if_icmpeq -> 1371
    //   1352: iload #23
    //   1354: iconst_1
    //   1355: if_icmpne -> 1361
    //   1358: goto -> 1371
    //   1361: bipush #8
    //   1363: istore #8
    //   1365: iconst_5
    //   1366: istore #12
    //   1368: goto -> 1377
    //   1371: iconst_5
    //   1372: istore #8
    //   1374: iconst_4
    //   1375: istore #12
    //   1377: iconst_1
    //   1378: istore #22
    //   1380: iconst_1
    //   1381: istore #15
    //   1383: iconst_1
    //   1384: istore #23
    //   1386: bipush #6
    //   1388: istore #13
    //   1390: goto -> 1604
    //   1393: iload #12
    //   1395: ifle -> 1408
    //   1398: bipush #6
    //   1400: istore #8
    //   1402: iconst_5
    //   1403: istore #15
    //   1405: goto -> 1301
    //   1408: iload #12
    //   1410: ifne -> 1466
    //   1413: iload #24
    //   1415: ifne -> 1466
    //   1418: iload #20
    //   1420: ifne -> 1437
    //   1423: bipush #6
    //   1425: istore #13
    //   1427: iconst_5
    //   1428: istore #8
    //   1430: bipush #8
    //   1432: istore #12
    //   1434: goto -> 1312
    //   1437: aload #41
    //   1439: aload #36
    //   1441: if_acmpeq -> 1457
    //   1444: aload #40
    //   1446: aload #36
    //   1448: if_acmpeq -> 1457
    //   1451: iconst_4
    //   1452: istore #8
    //   1454: goto -> 1460
    //   1457: iconst_5
    //   1458: istore #8
    //   1460: iconst_4
    //   1461: istore #12
    //   1463: goto -> 1377
    //   1466: bipush #6
    //   1468: istore #13
    //   1470: iconst_5
    //   1471: istore #8
    //   1473: iconst_4
    //   1474: istore #12
    //   1476: goto -> 1312
    //   1479: iconst_0
    //   1480: istore #23
    //   1482: iconst_0
    //   1483: istore #15
    //   1485: iconst_4
    //   1486: istore #12
    //   1488: bipush #6
    //   1490: istore #13
    //   1492: iconst_5
    //   1493: istore #8
    //   1495: iconst_0
    //   1496: istore #22
    //   1498: goto -> 1604
    //   1501: aload #34
    //   1503: getfield h : Z
    //   1506: ifeq -> 1595
    //   1509: aload #38
    //   1511: getfield h : Z
    //   1514: ifeq -> 1595
    //   1517: aload_1
    //   1518: aload #39
    //   1520: aload #34
    //   1522: aload #10
    //   1524: invokevirtual d : ()I
    //   1527: fload #16
    //   1529: aload #38
    //   1531: aload #37
    //   1533: aload #11
    //   1535: invokevirtual d : ()I
    //   1538: bipush #8
    //   1540: invokevirtual b : (Lpn1;Lpn1;IFLpn1;Lpn1;II)V
    //   1543: iload_3
    //   1544: ifeq -> 2433
    //   1547: iload #5
    //   1549: ifeq -> 2433
    //   1552: aload #11
    //   1554: getfield f : Lbq;
    //   1557: ifnull -> 1570
    //   1560: aload #11
    //   1562: invokevirtual d : ()I
    //   1565: istore #8
    //   1567: goto -> 1576
    //   1570: iconst_0
    //   1571: istore #8
    //   1573: goto -> 1567
    //   1576: aload #38
    //   1578: aload #7
    //   1580: if_acmpeq -> 2433
    //   1583: aload_1
    //   1584: aload #7
    //   1586: aload #37
    //   1588: iload #8
    //   1590: iconst_5
    //   1591: invokevirtual f : (Lpn1;Lpn1;II)V
    //   1594: return
    //   1595: iconst_1
    //   1596: istore #23
    //   1598: iconst_1
    //   1599: istore #15
    //   1601: goto -> 1485
    //   1604: aload #34
    //   1606: astore #35
    //   1608: iload #15
    //   1610: ifeq -> 1636
    //   1613: aload #35
    //   1615: aload #38
    //   1617: if_acmpne -> 1636
    //   1620: aload #41
    //   1622: aload #36
    //   1624: if_acmpeq -> 1636
    //   1627: iconst_0
    //   1628: istore #15
    //   1630: iconst_0
    //   1631: istore #25
    //   1633: goto -> 1639
    //   1636: iconst_1
    //   1637: istore #25
    //   1639: iload #23
    //   1641: ifeq -> 1743
    //   1644: iload #28
    //   1646: ifne -> 1689
    //   1649: iload #18
    //   1651: ifne -> 1689
    //   1654: iload #20
    //   1656: ifne -> 1689
    //   1659: aload #35
    //   1661: aload #6
    //   1663: if_acmpne -> 1689
    //   1666: aload #38
    //   1668: aload #7
    //   1670: if_acmpne -> 1689
    //   1673: bipush #8
    //   1675: istore #23
    //   1677: iconst_0
    //   1678: istore_2
    //   1679: bipush #8
    //   1681: istore #13
    //   1683: iconst_0
    //   1684: istore #8
    //   1686: goto -> 1706
    //   1689: iload_3
    //   1690: istore_2
    //   1691: iload #13
    //   1693: istore #23
    //   1695: iload #8
    //   1697: istore #13
    //   1699: iload #25
    //   1701: istore #8
    //   1703: goto -> 1686
    //   1706: aload_1
    //   1707: aload #39
    //   1709: aload #35
    //   1711: aload #10
    //   1713: invokevirtual d : ()I
    //   1716: fload #16
    //   1718: aload #38
    //   1720: aload #37
    //   1722: aload #11
    //   1724: invokevirtual d : ()I
    //   1727: iload #23
    //   1729: invokevirtual b : (Lpn1;Lpn1;IFLpn1;Lpn1;II)V
    //   1732: iload #8
    //   1734: istore #25
    //   1736: iload #13
    //   1738: istore #8
    //   1740: goto -> 1745
    //   1743: iload_3
    //   1744: istore_2
    //   1745: aload_0
    //   1746: getfield g0 : I
    //   1749: bipush #8
    //   1751: if_icmpne -> 1777
    //   1754: aload #11
    //   1756: getfield a : Ljava/util/HashSet;
    //   1759: astore #35
    //   1761: aload #35
    //   1763: ifnonnull -> 1769
    //   1766: goto -> 2433
    //   1769: aload #35
    //   1771: invokevirtual size : ()I
    //   1774: ifle -> 2433
    //   1777: iload #8
    //   1779: istore #13
    //   1781: iload #15
    //   1783: ifeq -> 1869
    //   1786: iload #8
    //   1788: istore #13
    //   1790: iload_2
    //   1791: ifeq -> 1838
    //   1794: iload #8
    //   1796: istore #13
    //   1798: aload #34
    //   1800: aload #38
    //   1802: if_acmpeq -> 1838
    //   1805: iload #8
    //   1807: istore #13
    //   1809: iload #28
    //   1811: ifne -> 1838
    //   1814: aload #41
    //   1816: instanceof yb
    //   1819: ifne -> 1834
    //   1822: iload #8
    //   1824: istore #13
    //   1826: aload #40
    //   1828: instanceof yb
    //   1831: ifeq -> 1838
    //   1834: bipush #6
    //   1836: istore #13
    //   1838: aload_1
    //   1839: aload #39
    //   1841: aload #34
    //   1843: aload #10
    //   1845: invokevirtual d : ()I
    //   1848: iload #13
    //   1850: invokevirtual f : (Lpn1;Lpn1;II)V
    //   1853: aload_1
    //   1854: aload #37
    //   1856: aload #38
    //   1858: aload #11
    //   1860: invokevirtual d : ()I
    //   1863: ineg
    //   1864: iload #13
    //   1866: invokevirtual g : (Lpn1;Lpn1;II)V
    //   1869: iload_2
    //   1870: ifeq -> 1915
    //   1873: iload #21
    //   1875: ifeq -> 1915
    //   1878: aload #41
    //   1880: instanceof yb
    //   1883: ifne -> 1915
    //   1886: aload #40
    //   1888: instanceof yb
    //   1891: ifne -> 1915
    //   1894: aload #40
    //   1896: aload #36
    //   1898: if_acmpeq -> 1915
    //   1901: bipush #6
    //   1903: istore #8
    //   1905: bipush #6
    //   1907: istore #13
    //   1909: iconst_1
    //   1910: istore #12
    //   1912: goto -> 1923
    //   1915: iload #12
    //   1917: istore #8
    //   1919: iload #25
    //   1921: istore #12
    //   1923: iload #12
    //   1925: ifeq -> 2128
    //   1928: iload #8
    //   1930: istore #12
    //   1932: iload #22
    //   1934: ifeq -> 2038
    //   1937: iload #20
    //   1939: ifeq -> 1951
    //   1942: iload #8
    //   1944: istore #12
    //   1946: iload #4
    //   1948: ifeq -> 2038
    //   1951: iload #30
    //   1953: istore #12
    //   1955: aload #41
    //   1957: aload #36
    //   1959: if_acmpeq -> 1980
    //   1962: aload #40
    //   1964: aload #36
    //   1966: if_acmpne -> 1976
    //   1969: iload #30
    //   1971: istore #12
    //   1973: goto -> 1980
    //   1976: iload #8
    //   1978: istore #12
    //   1980: aload #41
    //   1982: instanceof bf0
    //   1985: ifne -> 1996
    //   1988: aload #40
    //   1990: instanceof bf0
    //   1993: ifeq -> 1999
    //   1996: iconst_5
    //   1997: istore #12
    //   1999: aload #41
    //   2001: instanceof yb
    //   2004: ifne -> 2015
    //   2007: aload #40
    //   2009: instanceof yb
    //   2012: ifeq -> 2018
    //   2015: iconst_5
    //   2016: istore #12
    //   2018: iload #20
    //   2020: ifeq -> 2029
    //   2023: iconst_5
    //   2024: istore #12
    //   2026: goto -> 2029
    //   2029: iload #12
    //   2031: iload #8
    //   2033: invokestatic max : (II)I
    //   2036: istore #12
    //   2038: iload #12
    //   2040: istore #8
    //   2042: iload_2
    //   2043: ifeq -> 2097
    //   2046: iload #13
    //   2048: iload #12
    //   2050: invokestatic min : (II)I
    //   2053: istore #12
    //   2055: iload #12
    //   2057: istore #8
    //   2059: iload #17
    //   2061: ifeq -> 2097
    //   2064: iload #12
    //   2066: istore #8
    //   2068: iload #20
    //   2070: ifne -> 2097
    //   2073: aload #41
    //   2075: aload #36
    //   2077: if_acmpeq -> 2091
    //   2080: iload #12
    //   2082: istore #8
    //   2084: aload #40
    //   2086: aload #36
    //   2088: if_acmpne -> 2097
    //   2091: iconst_4
    //   2092: istore #8
    //   2094: goto -> 2097
    //   2097: aload_1
    //   2098: aload #39
    //   2100: aload #34
    //   2102: aload #10
    //   2104: invokevirtual d : ()I
    //   2107: iload #8
    //   2109: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2112: aload_1
    //   2113: aload #37
    //   2115: aload #38
    //   2117: aload #11
    //   2119: invokevirtual d : ()I
    //   2122: ineg
    //   2123: iload #8
    //   2125: invokevirtual e : (Lpn1;Lpn1;II)V
    //   2128: iload_2
    //   2129: ifeq -> 2170
    //   2132: aload #6
    //   2134: aload #34
    //   2136: if_acmpne -> 2149
    //   2139: aload #10
    //   2141: invokevirtual d : ()I
    //   2144: istore #8
    //   2146: goto -> 2152
    //   2149: iconst_0
    //   2150: istore #8
    //   2152: aload #34
    //   2154: aload #6
    //   2156: if_acmpeq -> 2170
    //   2159: aload_1
    //   2160: aload #39
    //   2162: aload #6
    //   2164: iload #8
    //   2166: iconst_5
    //   2167: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2170: iload_2
    //   2171: ifeq -> 2211
    //   2174: iload #28
    //   2176: ifeq -> 2211
    //   2179: iload #14
    //   2181: ifne -> 2211
    //   2184: iload #24
    //   2186: ifne -> 2211
    //   2189: iload #28
    //   2191: ifeq -> 2214
    //   2194: iload #29
    //   2196: iconst_3
    //   2197: if_icmpne -> 2214
    //   2200: aload_1
    //   2201: aload #37
    //   2203: aload #39
    //   2205: iconst_0
    //   2206: bipush #8
    //   2208: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2211: goto -> 2224
    //   2214: aload_1
    //   2215: aload #37
    //   2217: aload #39
    //   2219: iconst_0
    //   2220: iconst_5
    //   2221: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2224: iconst_5
    //   2225: istore #8
    //   2227: goto -> 2235
    //   2230: iload_3
    //   2231: istore_2
    //   2232: goto -> 2224
    //   2235: iload_2
    //   2236: ifeq -> 2433
    //   2239: iload #5
    //   2241: ifeq -> 2433
    //   2244: aload #11
    //   2246: getfield f : Lbq;
    //   2249: ifnull -> 2262
    //   2252: aload #11
    //   2254: invokevirtual d : ()I
    //   2257: istore #12
    //   2259: goto -> 2268
    //   2262: iconst_0
    //   2263: istore #12
    //   2265: goto -> 2259
    //   2268: aload #38
    //   2270: aload #7
    //   2272: if_acmpeq -> 2433
    //   2275: aload_1
    //   2276: aload #7
    //   2278: aload #37
    //   2280: iload #12
    //   2282: iload #8
    //   2284: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2287: return
    //   2288: iload #30
    //   2290: iconst_2
    //   2291: if_icmpge -> 2433
    //   2294: iload_3
    //   2295: ifeq -> 2433
    //   2298: iload #5
    //   2300: ifeq -> 2433
    //   2303: aload_1
    //   2304: aload #39
    //   2306: aload #6
    //   2308: iconst_0
    //   2309: bipush #8
    //   2311: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2314: aload_0
    //   2315: getfield M : Lbq;
    //   2318: astore #6
    //   2320: iload_2
    //   2321: ifne -> 2341
    //   2324: aload #6
    //   2326: getfield f : Lbq;
    //   2329: ifnonnull -> 2335
    //   2332: goto -> 2341
    //   2335: iconst_0
    //   2336: istore #8
    //   2338: goto -> 2344
    //   2341: iconst_1
    //   2342: istore #8
    //   2344: iload #8
    //   2346: istore #12
    //   2348: iload_2
    //   2349: ifne -> 2417
    //   2352: aload #6
    //   2354: getfield f : Lbq;
    //   2357: astore #6
    //   2359: iload #8
    //   2361: istore #12
    //   2363: aload #6
    //   2365: ifnull -> 2417
    //   2368: aload #6
    //   2370: getfield d : Ler;
    //   2373: astore #6
    //   2375: aload #6
    //   2377: getfield W : F
    //   2380: fconst_0
    //   2381: fcmpl
    //   2382: ifeq -> 2414
    //   2385: aload #6
    //   2387: getfield p0 : [I
    //   2390: astore #6
    //   2392: aload #6
    //   2394: iconst_0
    //   2395: iaload
    //   2396: iconst_3
    //   2397: if_icmpne -> 2414
    //   2400: aload #6
    //   2402: iconst_1
    //   2403: iaload
    //   2404: iconst_3
    //   2405: if_icmpne -> 2414
    //   2408: iconst_1
    //   2409: istore #12
    //   2411: goto -> 2417
    //   2414: iconst_0
    //   2415: istore #12
    //   2417: iload #12
    //   2419: ifeq -> 2433
    //   2422: aload_1
    //   2423: aload #7
    //   2425: aload #37
    //   2427: iconst_0
    //   2428: bipush #8
    //   2430: invokevirtual f : (Lpn1;Lpn1;II)V
    //   2433: return
  }
  
  public final void e(ln0 paramln0) {
    paramln0.k(this.I);
    paramln0.k(this.J);
    paramln0.k(this.K);
    paramln0.k(this.L);
    if (this.a0 > 0)
      paramln0.k(this.M); 
  }
  
  public final void f() {
    if (this.d == null) {
      m52 m52 = new m52(this);
      m52.h.e = 4;
      m52.i.e = 5;
      m52.f = 0;
      this.d = (fg0)m52;
    } 
    if (this.e == null) {
      m52 m52 = new m52(this);
      iy iy = new iy(m52);
      ((d22)m52).k = iy;
      ((d22)m52).l = null;
      m52.h.e = 6;
      m52.i.e = 7;
      iy.e = 8;
      m52.f = 1;
      this.e = (d22)m52;
    } 
  }
  
  public bq g(int paramInt) {
    switch (x41.y(paramInt)) {
      default:
        throw new AssertionError(x41.x(paramInt));
      case 8:
        return this.O;
      case 7:
        return this.N;
      case 6:
        return this.P;
      case 5:
        return this.M;
      case 4:
        return this.L;
      case 3:
        return this.K;
      case 2:
        return this.J;
      case 1:
        return this.I;
      case 0:
        break;
    } 
    return null;
  }
  
  public final int h(int paramInt) {
    int[] arrayOfInt = this.p0;
    return (paramInt == 0) ? arrayOfInt[0] : ((paramInt == 1) ? arrayOfInt[1] : 0);
  }
  
  public final int i() {
    return (this.g0 == 8) ? 0 : this.V;
  }
  
  public final er j(int paramInt) {
    if (paramInt == 0) {
      bq bq1 = this.K;
      bq bq2 = bq1.f;
      if (bq2 != null && bq2.f == bq1)
        return bq2.d; 
    } else if (paramInt == 1) {
      bq bq2 = this.L;
      bq bq1 = bq2.f;
      if (bq1 != null && bq1.f == bq2)
        return bq1.d; 
    } 
    return null;
  }
  
  public final er k(int paramInt) {
    if (paramInt == 0) {
      bq bq1 = this.I;
      bq bq2 = bq1.f;
      if (bq2 != null && bq2.f == bq1)
        return bq2.d; 
    } else if (paramInt == 1) {
      bq bq1 = this.J;
      bq bq2 = bq1.f;
      if (bq2 != null && bq2.f == bq1)
        return bq2.d; 
    } 
    return null;
  }
  
  public void l(StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder("  ");
    stringBuilder.append(this.j);
    stringBuilder.append(zLtYiJUm.nym);
    paramStringBuilder.append(stringBuilder.toString());
    stringBuilder = new StringBuilder("    actualWidth:");
    stringBuilder.append(this.U);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder("    actualHeight:");
    stringBuilder.append(this.V);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder("    actualLeft:");
    stringBuilder.append(this.Y);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder("    actualTop:");
    stringBuilder.append(this.Z);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    n(paramStringBuilder, "left", this.I);
    n(paramStringBuilder, "top", this.J);
    n(paramStringBuilder, "right", this.K);
    n(paramStringBuilder, "bottom", this.L);
    n(paramStringBuilder, "baseline", this.M);
    n(paramStringBuilder, "centerX", this.N);
    n(paramStringBuilder, "centerY", this.O);
    int n = this.U;
    int k = this.b0;
    int[] arrayOfInt2 = this.C;
    int i1 = arrayOfInt2[0];
    int i = this.u;
    int j = this.r;
    float f1 = this.w;
    int[] arrayOfInt1 = this.p0;
    int m = arrayOfInt1[0];
    float[] arrayOfFloat = this.k0;
    float f2 = arrayOfFloat[0];
    m(paramStringBuilder, "    width", n, k, i1, i, j, f1, m);
    n = this.V;
    k = this.c0;
    m = arrayOfInt2[1];
    j = this.x;
    i1 = this.s;
    f2 = this.z;
    i = arrayOfInt1[1];
    f1 = arrayOfFloat[1];
    m(paramStringBuilder, "    height", n, k, m, j, i1, f2, i);
    f1 = this.W;
    i = this.X;
    if (f1 != 0.0F) {
      paramStringBuilder.append("    dimensionRatio");
      paramStringBuilder.append(" :  [");
      paramStringBuilder.append(f1);
      paramStringBuilder.append(",");
      paramStringBuilder.append(i);
      paramStringBuilder.append("");
      paramStringBuilder.append("],\n");
    } 
    E(paramStringBuilder, "    horizontalBias", this.d0, 0.5F);
    E(paramStringBuilder, "    verticalBias", this.e0, 0.5F);
    D(this.i0, 0, "    horizontalChainStyle", paramStringBuilder);
    D(this.j0, 0, "    verticalChainStyle", paramStringBuilder);
    paramStringBuilder.append("  }");
  }
  
  public final int o() {
    return (this.g0 == 8) ? 0 : this.U;
  }
  
  public final int p() {
    er er1 = this.T;
    return (er1 != null && er1 instanceof fr) ? (((fr)er1).x0 + this.Y) : this.Y;
  }
  
  public final int q() {
    er er1 = this.T;
    return (er1 != null && er1 instanceof fr) ? (((fr)er1).y0 + this.Z) : this.Z;
  }
  
  public final boolean r(int paramInt) {
    if (paramInt == 0) {
      byte b;
      if (this.I.f != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      if (this.K.f != null) {
        b = 1;
      } else {
        b = 0;
      } 
      if (paramInt + b < 2)
        return true; 
    } else {
      byte b1;
      byte b2;
      if (this.J.f != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      if (this.L.f != null) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if (this.M.f != null) {
        b2 = 1;
      } else {
        b2 = 0;
      } 
      if (paramInt + b1 + b2 < 2)
        return true; 
    } 
    return false;
  }
  
  public final boolean s(int paramInt1, int paramInt2) {
    if (paramInt1 == 0) {
      bq bq1 = this.I;
      bq bq2 = bq1.f;
      if (bq2 != null && bq2.c) {
        bq bq3 = this.K;
        bq2 = bq3.f;
        if (bq2 != null && bq2.c) {
          int i = bq2.c();
          paramInt1 = bq3.d();
          int j = bq1.f.c();
          if (i - paramInt1 - bq1.d() + j >= paramInt2)
            return true; 
        } 
      } 
    } else {
      bq bq1 = this.J;
      bq bq2 = bq1.f;
      if (bq2 != null && bq2.c) {
        bq2 = this.L;
        bq bq3 = bq2.f;
        if (bq3 != null && bq3.c) {
          int i = bq3.c();
          paramInt1 = bq2.d();
          int j = bq1.f.c();
          if (i - paramInt1 - bq1.d() + j >= paramInt2)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public final void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4, er paramer) {
    g(paramInt1).a(paramer.g(paramInt2), paramInt3, paramInt4);
  }
  
  public String toString() {
    String str = "";
    StringBuilder stringBuilder = x41.p("");
    if (this.h0 != null)
      str = x41.n(new StringBuilder("id: "), this.h0, " "); 
    stringBuilder.append(str);
    stringBuilder.append("(");
    stringBuilder.append(this.Y);
    stringBuilder.append(", ");
    stringBuilder.append(this.Z);
    stringBuilder.append(") - (");
    stringBuilder.append(this.U);
    stringBuilder.append(" x ");
    return x41.m(stringBuilder, this.V, ")");
  }
  
  public final boolean u(int paramInt) {
    paramInt *= 2;
    bq[] arrayOfBq = this.Q;
    bq bq1 = arrayOfBq[paramInt];
    bq bq2 = bq1.f;
    if (bq2 != null && bq2.f != bq1) {
      bq bq3 = arrayOfBq[paramInt + 1];
      bq1 = bq3.f;
      if (bq1 != null && bq1.f == bq3)
        return true; 
    } 
    return false;
  }
  
  public final boolean v() {
    bq bq2 = this.I;
    bq bq1 = bq2.f;
    if (bq1 == null || bq1.f != bq2) {
      bq1 = this.K;
      bq2 = bq1.f;
      if (bq2 == null || bq2.f != bq1)
        return false; 
    } 
    return true;
  }
  
  public final boolean w() {
    bq bq2 = this.J;
    bq bq1 = bq2.f;
    if (bq1 == null || bq1.f != bq2) {
      bq2 = this.L;
      bq1 = bq2.f;
      if (bq1 == null || bq1.f != bq2)
        return false; 
    } 
    return true;
  }
  
  public final boolean x() {
    return (this.g && this.g0 != 8);
  }
  
  public boolean y() {
    return (this.k || (this.I.c && this.K.c));
  }
  
  public boolean z() {
    return (this.l || (this.J.c && this.L.c));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */