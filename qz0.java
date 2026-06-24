import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.nativex.FDTS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class qz0 implements nt0, au {
  public long b;
  
  public boolean c;
  
  public boolean e = false;
  
  public final Uri f;
  
  public final FDTS g;
  
  public boolean h;
  
  public la0 i;
  
  public final nf j;
  
  public final rz0 k;
  
  public pz0 l;
  
  public final boolean m;
  
  public final long n;
  
  public final int o;
  
  public final boolean p;
  
  public final boolean q;
  
  public final float r;
  
  public final float s;
  
  public final boolean t;
  
  public mt0 u;
  
  public final f01 v;
  
  public final Handler w;
  
  public final m60 x;
  
  public final ArrayList y = new ArrayList();
  
  public qz0(Context paramContext, Uri paramUri, long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, boolean paramBoolean3, rz0 paramrz0, boolean paramBoolean4, f01 paramf01, m60 paramm60) {
    this.f = paramUri;
    this.o = paramInt;
    this.q = paramBoolean1;
    this.p = paramBoolean2;
    this.r = paramFloat1;
    this.s = paramFloat2;
    this.t = paramBoolean3;
    this.k = paramrz0;
    this.x = paramm60;
    this.g = new FDTS(paramContext, paramUri);
    this.j = (nf)new Object();
    this.m = paramBoolean4;
    this.n = paramLong;
    this.v = paramf01;
    this.w = new Handler();
  }
  
  public final boolean a() {
    return false;
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Lin/krosbits/nativex/FDTS;
    //   4: astore #11
    //   6: aload #11
    //   8: getfield obPS : I
    //   11: iconst_4
    //   12: idiv
    //   13: istore_3
    //   14: aload #11
    //   16: iload_3
    //   17: putfield obPS : I
    //   20: iload_3
    //   21: iconst_2
    //   22: if_icmpne -> 34
    //   25: aload #11
    //   27: iconst_2
    //   28: putfield e : I
    //   31: goto -> 45
    //   34: iload_3
    //   35: iconst_4
    //   36: if_icmpne -> 45
    //   39: aload #11
    //   41: iconst_4
    //   42: putfield e : I
    //   45: aload #11
    //   47: getfield ocC : I
    //   50: istore #4
    //   52: aload #11
    //   54: iload #4
    //   56: iload_3
    //   57: imul
    //   58: aload #11
    //   60: getfield n_sISoF : I
    //   63: imul
    //   64: putfield d : I
    //   67: aload #11
    //   69: getfield oEnc : Ljava/lang/String;
    //   72: astore #10
    //   74: aload #11
    //   76: getfield p : J
    //   79: lstore #8
    //   81: aload_0
    //   82: new la0
    //   85: dup
    //   86: aconst_null
    //   87: aconst_null
    //   88: iconst_0
    //   89: iconst_0
    //   90: iconst_m1
    //   91: aload #10
    //   93: aconst_null
    //   94: aconst_null
    //   95: ldc 'audio/raw'
    //   97: aload #11
    //   99: getfield osR : I
    //   102: i2d
    //   103: ldc2_w 1000.0
    //   106: ddiv
    //   107: lload #8
    //   109: l2d
    //   110: dmul
    //   111: invokestatic ceil : (D)D
    //   114: d2i
    //   115: iload #4
    //   117: imul
    //   118: iload_3
    //   119: imul
    //   120: aconst_null
    //   121: aconst_null
    //   122: ldc2_w 9223372036854775807
    //   125: iconst_m1
    //   126: iconst_m1
    //   127: ldc -1.0
    //   129: iconst_m1
    //   130: ldc -1.0
    //   132: aconst_null
    //   133: iconst_m1
    //   134: aconst_null
    //   135: aload #11
    //   137: getfield ocC : I
    //   140: aload #11
    //   142: getfield osR : I
    //   145: aload #11
    //   147: getfield e : I
    //   150: iconst_m1
    //   151: iconst_m1
    //   152: aconst_null
    //   153: iconst_m1
    //   154: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lnx0;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ls10;JIIFIF[BILdn;IIIIILjava/lang/String;I)V
    //   157: putfield i : Lla0;
    //   160: aload #11
    //   162: getfield oEnc : Ljava/lang/String;
    //   165: astore #10
    //   167: aload #11
    //   169: getfield n : J
    //   172: lstore #8
    //   174: aload #11
    //   176: getfield odUs : J
    //   179: l2d
    //   180: ldc2_w 1000.0
    //   183: ddiv
    //   184: dstore_1
    //   185: aload #10
    //   187: ldc 'adpcm'
    //   189: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   192: istore #7
    //   194: iconst_1
    //   195: istore #6
    //   197: iload #6
    //   199: istore #5
    //   201: iload #7
    //   203: ifne -> 369
    //   206: aload #10
    //   208: ldc 'pcm'
    //   210: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   213: ifeq -> 223
    //   216: iload #6
    //   218: istore #5
    //   220: goto -> 369
    //   223: lload #8
    //   225: lconst_0
    //   226: lcmp
    //   227: ifle -> 366
    //   230: dload_1
    //   231: dconst_0
    //   232: dcmpl
    //   233: ifle -> 366
    //   236: lload #8
    //   238: l2d
    //   239: dload_1
    //   240: ddiv
    //   241: ldc2_w 8.0
    //   244: dmul
    //   245: d2i
    //   246: istore_3
    //   247: iload_3
    //   248: sipush #384
    //   251: if_icmpge -> 366
    //   254: aload #10
    //   256: ldc 'mp2'
    //   258: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   261: ifne -> 324
    //   264: aload #10
    //   266: ldc 'mp3'
    //   268: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   271: ifne -> 324
    //   274: aload #10
    //   276: ldc 'aac'
    //   278: invokevirtual equals : (Ljava/lang/Object;)Z
    //   281: ifne -> 324
    //   284: aload #10
    //   286: ldc 'ac3'
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifne -> 324
    //   294: aload #10
    //   296: ldc 'vorbis'
    //   298: invokevirtual equals : (Ljava/lang/Object;)Z
    //   301: ifne -> 324
    //   304: aload #10
    //   306: ldc 'opus'
    //   308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   311: ifne -> 324
    //   314: aload #10
    //   316: ldc 'wmav'
    //   318: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   321: ifeq -> 366
    //   324: new java/lang/StringBuilder
    //   327: dup
    //   328: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.AsLluEIhYiEdd : Ljava/lang/String;
    //   331: invokespecial <init> : (Ljava/lang/String;)V
    //   334: astore #11
    //   336: aload #11
    //   338: aload #10
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload #11
    //   346: iload_3
    //   347: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   350: pop
    //   351: aload #11
    //   353: invokevirtual toString : ()Ljava/lang/String;
    //   356: invokestatic G : (Ljava/lang/String;)V
    //   359: iload #6
    //   361: istore #5
    //   363: goto -> 369
    //   366: iconst_0
    //   367: istore #5
    //   369: aload_0
    //   370: iload #5
    //   372: putfield e : Z
    //   375: return
  }
  
  public final long c() {
    return j();
  }
  
  public final long d() {
    return -9223372036854775807L;
  }
  
  public final long e(long paramLong, bk1 parambk1) {
    return paramLong;
  }
  
  public final void f(qn paramqn) {
    if (paramqn == qn.e)
      return; 
    synchronized (this.y) {
      while (this.y.remove(paramqn));
      this.y.add(paramqn);
      return;
    } 
  }
  
  public final void g(mt0 parammt0, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder("cp:mmp>");
    stringBuilder.append(this.f);
    ui0.G(stringBuilder.toString());
    this.u = parammt0;
    if (!this.m) {
      q();
      return;
    } 
    (new Thread(new mz0(this, 0))).start();
    this.h = true;
  }
  
  public final long h(zd[] paramArrayOfzd, boolean[] paramArrayOfboolean1, li1[] paramArrayOfli1, boolean[] paramArrayOfboolean2, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder("st:mmp.1>");
    stringBuilder.append(Arrays.toString((Object[])paramArrayOfzd));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString(paramArrayOfboolean1));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString((Object[])paramArrayOfli1));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString(paramArrayOfboolean2));
    ui0.G(stringBuilder.toString());
    byte b;
    for (b = 0; b < paramArrayOfzd.length; b++) {
      if (paramArrayOfli1[b] != null && (paramArrayOfzd[b] == null || !paramArrayOfboolean1[b]))
        paramArrayOfli1[b] = null; 
    } 
    for (b = 0; b < paramArrayOfzd.length; b++) {
      if (paramArrayOfli1[b] == null && paramArrayOfzd[b] != null) {
        pz0 pz01 = this.l;
        if (pz01 != null) {
          nz0 nz0 = (nz0)pz01.b;
          if (nz0 != null)
            nz0.b(nz0); 
        } 
        Object object = new Object();
        ((pz0)object).c = this;
        ((pz0)object).a = -1L;
        object.d(true, true);
        this.l = (pz0)object;
        if (paramLong > 0L)
          ((pz0)object).a = paramLong; 
        this.g.nte0F = false;
        this.c = false;
        paramArrayOfli1[b] = (li1)object;
        paramArrayOfboolean2[b] = true;
      } 
    } 
    stringBuilder = new StringBuilder("st:mmp.2>");
    stringBuilder.append(Arrays.toString((Object[])paramArrayOfzd));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString(paramArrayOfboolean1));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString((Object[])paramArrayOfli1));
    stringBuilder.append(", ");
    stringBuilder.append(Arrays.toString(paramArrayOfboolean2));
    ui0.G(stringBuilder.toString());
    return paramLong;
  }
  
  public final vv1 i() {
    return new vv1(new uv1[] { new uv1(new la0[] { this.i }) });
  }
  
  public final long j() {
    long l = this.b;
    return (this.c || l >= this.g.odUs - 5000000L) ? Long.MIN_VALUE : l;
  }
  
  public final void k() {
    if (this.h)
      return; 
    throw new IOException();
  }
  
  public final long l(long paramLong) {
    FDTS fDTS = this.g;
    long l = fDTS.l_Hps;
    boolean bool = true;
    if ((l > 0L) ? (paramLong >= 0L) : (paramLong > 0L))
      bool = false; 
    pz0 pz01 = this.l;
    if (pz01 != null && bool) {
      pz01.a = paramLong;
      fDTS.nte0F = false;
      this.c = false;
    } 
    return paramLong;
  }
  
  public final void m(long paramLong) {}
  
  public final boolean n(long paramLong) {
    return false;
  }
  
  public final void o(long paramLong) {}
  
  public final oz0 p() {
    ArrayList<f91> arrayList;
    byte b2 = 0;
    f01 f011 = this.v;
    if (f011 != null) {
      p5 p5 = f011.k;
      f91 f911 = f011.a;
      ArrayList<f91> arrayList1 = new ArrayList();
      f91 f912 = f011.c;
      if (f912.a)
        arrayList1.add(f912); 
      if (f011.l) {
        ArrayList<Object> arrayList2 = f011.g;
        int i = arrayList2.size();
        null = 0;
        while (null < i) {
          r01 r01 = (r01)arrayList2.get(null);
          int j = null + 1;
          r01 = r01;
          null = j;
          if (r01.a) {
            arrayList1.add(r01);
            null = j;
          } 
        } 
        for (a a : f011.h) {
          if (a.d())
            arrayList1.add(a); 
        } 
      } 
      b b4 = f011.f;
      if (b4.a)
        arrayList1.add(b4); 
      b4 = f011.b;
      if (b4.a)
        arrayList1.add(b4); 
      if (f911.d())
        arrayList1.add(f911); 
      p5.getClass();
      arrayList1.add(p5);
      b b3 = f011.j;
      arrayList = arrayList1;
      if (b3.a) {
        arrayList1.add(b3);
        arrayList = arrayList1;
      } 
    } else {
      arrayList = new ArrayList();
    } 
    if (this.x != null) {
      float f;
      String str = this.f.toString();
      int i = MyApplication.o().getInt("k_i_rgm", 0);
      if (i == 0 || !ws2.U()) {
        f = 0.0F;
      } else {
        float[] arrayOfFloat = w60.j0(str);
        if (i == 2) {
          float f2 = arrayOfFloat[1];
          f = f2;
          if (f2 == -999.0F)
            f = arrayOfFloat[0]; 
        } else {
          f = arrayOfFloat[0];
        } 
        float f1 = -24.0F;
        if (f == -999.0F) {
          float f2 = MyApplication.o().getFloat("k_f_rgpna", 0.0F);
          f = f2;
          if (f2 > 0.0F)
            f = 0.0F; 
          if (f < -24.0F)
            f = f1; 
          f -= 3.0F;
        } else {
          float f3 = MyApplication.o().getFloat("k_f_rgpa", 0.0F);
          float f2 = f3;
          if (f3 > 0.0F)
            f2 = 0.0F; 
          if (f2 < -24.0F)
            f2 = f1; 
          f = f2 + 5.0F + f;
        } 
      } 
      if (f != 0.0F)
        arrayList.add(0, new f91(f)); 
    } 
    String[] arrayOfString2 = new String[arrayList.size()];
    String[] arrayOfString3 = new String[arrayList.size()];
    String[] arrayOfString1 = new String[arrayList.size()];
    for (byte b1 = b2; b1 < arrayList.size(); b1++) {
      a a = arrayList.get(b1);
      arrayOfString2[b1] = a.a();
      arrayOfString3[b1] = a.b();
      arrayOfString1[b1] = a.c();
    } 
    return new oz0(arrayList.size(), arrayOfString2, arrayOfString3, arrayOfString1);
  }
  
  public final void q() {
    nf nf1;
    mz0 mz0;
    try {
      if (this.g.d()) {
        oz0 oz0 = p();
        int i = this.o;
        if (i <= 0)
          try {
            i = AudioTrack.getNativeOutputSampleRate(3);
          } finally {
            Exception exception = null;
          }  
        if (this.g.c(this.n, i, this.q, this.p, this.r, this.s, false, oz0.b, (String[])oz0.c, (String[])oz0.e, (String[])oz0.f)) {
          b();
          this.h = true;
        } else {
          this.h = false;
        } 
        f01 f011 = this.v;
        if (f011 != null) {
          i = (int)this.g.odUs;
          if (f011.i == 0)
            MyApplication.o().edit().putInt("k_i_wdthnm", i).apply(); 
        } 
      } else {
        ui0.G("cp:mmpi>piof");
        this.h = false;
      } 
    } finally {
      Exception exception;
    } 
    if (!this.h)
      this.g.a(); 
    synchronized (this.j) {
      boolean bool = nf1.a;
      if (bool) {
      
      } else {
        nf1.a = true;
        nf1.notifyAll();
      } 
      if (this.h) {
        f01 f011 = this.v;
        if (f011 != null)
          f011.c(this); 
        ui0.G("cp:mmpi:p");
        Handler handler = this.w;
        mz0 = new mz0();
        this(this, 1);
        handler.post(mz0);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */