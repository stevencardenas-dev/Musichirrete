import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

public final class e01 {
  public ByteBuffer A;
  
  public ByteBuffer B;
  
  public byte[] C;
  
  public int D;
  
  public int E;
  
  public boolean F;
  
  public boolean G;
  
  public boolean H;
  
  public int I;
  
  public jb J;
  
  public boolean K;
  
  public long L;
  
  public short M;
  
  public final ConditionVariable a = new ConditionVariable(true);
  
  public final ca b = new ca(new bh0(15, this));
  
  public final ArrayDeque c;
  
  public bh0 d;
  
  public AudioTrack e;
  
  public c01 f;
  
  public c01 g;
  
  public AudioTrack h;
  
  public k9 i;
  
  public r71 j;
  
  public r71 k;
  
  public long l;
  
  public long m;
  
  public ByteBuffer n;
  
  public int o;
  
  public long p;
  
  public long q;
  
  public long r;
  
  public long s;
  
  public int t;
  
  public int u;
  
  public long v;
  
  public float w;
  
  public u9[] x;
  
  public ByteBuffer[] y;
  
  public ByteBuffer z;
  
  public e01(int paramInt, hp2 paramhp2, r71 paramr71) {
    new ArrayList();
    this.w = 1.0F;
    this.u = 0;
    this.i = k9.b;
    this.I = paramInt;
    this.J = new jb(0, 0.0F);
    this.k = paramr71;
    this.E = -1;
    this.x = new u9[0];
    this.y = new ByteBuffer[0];
    this.c = new ArrayDeque();
  }
  
  public final void a(r71 paramr71, long paramLong) {
    if (!this.g.i)
      paramr71 = r71.d; 
    paramLong = Math.max(0L, paramLong);
    c01 c011 = this.g;
    d01 d01 = new d01(paramr71, paramLong, e() * 1000000L / c011.e);
    this.c.add(d01);
    u9[] arrayOfU9 = this.g.j;
    ArrayList arrayList = new ArrayList();
    if (arrayOfU9.length <= 0) {
      int i = arrayList.size();
      u9[] arrayOfU91 = (u9[])arrayList.toArray((Object[])new u9[i]);
      this.x = arrayOfU91;
      this.y = new ByteBuffer[i];
      if (arrayOfU91.length <= 0)
        return; 
      u9 u92 = arrayOfU91[0];
      throw null;
    } 
    u9 u91 = arrayOfU9[0];
    throw null;
  }
  
  public final boolean b() {
    int i;
    if (this.E == -1) {
      this.g.getClass();
      this.E = this.x.length;
      i = 1;
    } else {
      i = 0;
    } 
    int j = this.E;
    u9[] arrayOfU9 = this.x;
    if (j < arrayOfU9.length) {
      u9 u91 = arrayOfU9[j];
      if (!i) {
        j = this.x.length;
        i = j;
        while (i >= 0) {
          ByteBuffer byteBuffer1;
          if (i > 0) {
            byteBuffer1 = this.y[i - 1];
          } else {
            byteBuffer1 = this.z;
            if (byteBuffer1 == null)
              byteBuffer1 = u9.a; 
          } 
          if (i == j) {
            o(byteBuffer1, -9223372036854775807L);
            if (!byteBuffer1.hasRemaining()) {
              i--;
              continue;
            } 
            break;
          } 
          u9 u92 = this.x[i];
          throw null;
        } 
        throw null;
      } 
      throw null;
    } 
    ByteBuffer byteBuffer = this.B;
    if (byteBuffer != null) {
      o(byteBuffer, -9223372036854775807L);
      if (this.B != null)
        return false; 
    } 
    this.E = -1;
    return true;
  }
  
  public final void c() {
    if (h()) {
      this.p = 0L;
      this.q = 0L;
      this.r = 0L;
      this.s = 0L;
      this.t = 0;
      r71 r711 = this.j;
      ArrayDeque arrayDeque = this.c;
      if (r711 != null) {
        this.k = r711;
        this.j = null;
      } else if (!arrayDeque.isEmpty()) {
        this.k = ((d01)arrayDeque.getLast()).a;
      } 
      arrayDeque.clear();
      this.l = 0L;
      this.m = 0L;
      u9[] arrayOfU9 = this.x;
      if (arrayOfU9.length <= 0) {
        this.z = null;
        this.A = null;
        this.B = null;
        this.G = false;
        this.F = false;
        this.E = -1;
        this.n = null;
        this.o = 0;
        this.u = 0;
        ca1 = this.b;
        AudioTrack audioTrack = ca1.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3)
          this.h.pause(); 
        audioTrack = this.h;
        this.h = null;
        c01 c011 = this.f;
        if (c011 != null) {
          this.g = c011;
          this.f = null;
        } 
        ca1.j = 0L;
        ca1.u = 0;
        ca1.t = 0;
        ca1.k = 0L;
        ca1.A = 0L;
        ca1.D = 0L;
        ca1.c = null;
        ca1.f = null;
        this.a.close();
        (new b01(this, audioTrack)).start();
        return;
      } 
      ca ca1 = ca1[0];
      throw null;
    } 
  }
  
  public final long d() {
    c01 c011 = this.g;
    return c011.a ? (this.p / c011.b) : this.q;
  }
  
  public final long e() {
    c01 c011 = this.g;
    return c011.a ? (this.r / c011.d) : this.s;
  }
  
  public final boolean f() {
    return (h() && this.b.b(e()));
  }
  
  public final boolean g() {
    return (!h() || (this.F && !f()));
  }
  
  public final boolean h() {
    return (this.h != null);
  }
  
  public final void i() {
    this.H = true;
    if (h()) {
      ba ba = this.b.f;
      ba.getClass();
      ba.a();
      this.h.play();
    } 
  }
  
  public final void j() {
    if (!this.G) {
      this.G = true;
      long l = e();
      ca ca1 = this.b;
      ca1.x = ca1.a();
      ca1.v = SystemClock.elapsedRealtime() * 1000L;
      ca1.y = l;
      this.h.stop();
      this.o = 0;
    } 
  }
  
  public final void k() {
    if (!this.F && h() && b()) {
      j();
      this.F = true;
    } 
  }
  
  public final void l(k9 paramk9) {
    if (!this.i.equals(paramk9)) {
      this.i = paramk9;
      if (!this.K) {
        c();
        return;
      } 
    } 
  }
  
  public final void m(jb paramjb) {
    if (this.J.equals(paramjb))
      return; 
    int i = paramjb.a;
    float f = paramjb.b;
    AudioTrack audioTrack = this.h;
    if (audioTrack != null) {
      if (this.J.a != i)
        audioTrack.attachAuxEffect(i); 
      if (i != 0)
        this.h.setAuxEffectSendLevel(f); 
    } 
    this.J = paramjb;
  }
  
  public final void n(float paramFloat) {
    if (this.w != paramFloat) {
      this.w = paramFloat;
      if (h()) {
        int i = d12.a;
        AudioTrack audioTrack = this.h;
        paramFloat = this.w;
        if (i >= 21) {
          try {
            audioTrack.setVolume(paramFloat);
          } finally {}
        } else {
          audioTrack.setStereoVolume(paramFloat, paramFloat);
        } 
      } 
    } 
  }
  
  public final void o(ByteBuffer paramByteBuffer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual hasRemaining : ()Z
    //   4: ifne -> 10
    //   7: goto -> 575
    //   10: aload_0
    //   11: getfield B : Ljava/nio/ByteBuffer;
    //   14: astore #9
    //   16: iconst_0
    //   17: istore #4
    //   19: aload #9
    //   21: ifnull -> 47
    //   24: aload #9
    //   26: aload_1
    //   27: if_acmpne -> 36
    //   30: iconst_1
    //   31: istore #8
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #8
    //   39: iload #8
    //   41: invokestatic h : (Z)V
    //   44: goto -> 123
    //   47: aload_0
    //   48: aload_1
    //   49: putfield B : Ljava/nio/ByteBuffer;
    //   52: getstatic d12.a : I
    //   55: bipush #21
    //   57: if_icmpge -> 123
    //   60: aload_1
    //   61: invokevirtual remaining : ()I
    //   64: istore #6
    //   66: aload_0
    //   67: getfield C : [B
    //   70: astore #9
    //   72: aload #9
    //   74: ifnull -> 85
    //   77: aload #9
    //   79: arraylength
    //   80: iload #6
    //   82: if_icmpge -> 93
    //   85: aload_0
    //   86: iload #6
    //   88: newarray byte
    //   90: putfield C : [B
    //   93: aload_1
    //   94: invokevirtual position : ()I
    //   97: istore #5
    //   99: aload_1
    //   100: aload_0
    //   101: getfield C : [B
    //   104: iconst_0
    //   105: iload #6
    //   107: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
    //   110: pop
    //   111: aload_1
    //   112: iload #5
    //   114: invokevirtual position : (I)Ljava/nio/Buffer;
    //   117: pop
    //   118: aload_0
    //   119: iconst_0
    //   120: putfield D : I
    //   123: aload_1
    //   124: invokevirtual remaining : ()I
    //   127: istore #6
    //   129: getstatic d12.a : I
    //   132: istore #5
    //   134: iload #5
    //   136: bipush #21
    //   138: if_icmpge -> 251
    //   141: aload_0
    //   142: getfield r : J
    //   145: lstore_2
    //   146: aload_0
    //   147: getfield b : Lca;
    //   150: astore #9
    //   152: lload_2
    //   153: aload #9
    //   155: invokevirtual a : ()J
    //   158: aload #9
    //   160: getfield d : I
    //   163: i2l
    //   164: lmul
    //   165: lsub
    //   166: l2i
    //   167: istore #5
    //   169: aload #9
    //   171: getfield e : I
    //   174: iload #5
    //   176: isub
    //   177: istore #5
    //   179: iload #5
    //   181: ifle -> 506
    //   184: iload #6
    //   186: iload #5
    //   188: invokestatic min : (II)I
    //   191: istore #4
    //   193: aload_0
    //   194: getfield h : Landroid/media/AudioTrack;
    //   197: aload_0
    //   198: getfield C : [B
    //   201: aload_0
    //   202: getfield D : I
    //   205: iload #4
    //   207: invokevirtual write : ([BII)I
    //   210: istore #5
    //   212: iload #5
    //   214: istore #4
    //   216: iload #5
    //   218: ifle -> 506
    //   221: aload_0
    //   222: aload_0
    //   223: getfield D : I
    //   226: iload #5
    //   228: iadd
    //   229: putfield D : I
    //   232: aload_1
    //   233: aload_1
    //   234: invokevirtual position : ()I
    //   237: iload #5
    //   239: iadd
    //   240: invokevirtual position : (I)Ljava/nio/Buffer;
    //   243: pop
    //   244: iload #5
    //   246: istore #4
    //   248: goto -> 506
    //   251: aload_0
    //   252: getfield K : Z
    //   255: ifeq -> 493
    //   258: lload_2
    //   259: ldc2_w -9223372036854775807
    //   262: lcmp
    //   263: ifeq -> 272
    //   266: iconst_1
    //   267: istore #8
    //   269: goto -> 275
    //   272: iconst_0
    //   273: istore #8
    //   275: iload #8
    //   277: invokestatic r : (Z)V
    //   280: aload_0
    //   281: getfield h : Landroid/media/AudioTrack;
    //   284: astore #9
    //   286: iload #5
    //   288: bipush #26
    //   290: if_icmplt -> 312
    //   293: aload #9
    //   295: aload_1
    //   296: iload #6
    //   298: iconst_1
    //   299: lload_2
    //   300: ldc2_w 1000
    //   303: lmul
    //   304: invokevirtual write : (Ljava/nio/ByteBuffer;IIJ)I
    //   307: istore #4
    //   309: goto -> 506
    //   312: aload_0
    //   313: getfield n : Ljava/nio/ByteBuffer;
    //   316: ifnonnull -> 352
    //   319: bipush #16
    //   321: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   324: astore #10
    //   326: aload_0
    //   327: aload #10
    //   329: putfield n : Ljava/nio/ByteBuffer;
    //   332: aload #10
    //   334: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   337: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   340: pop
    //   341: aload_0
    //   342: getfield n : Ljava/nio/ByteBuffer;
    //   345: ldc_w 1431633921
    //   348: invokevirtual putInt : (I)Ljava/nio/ByteBuffer;
    //   351: pop
    //   352: aload_0
    //   353: getfield o : I
    //   356: ifne -> 400
    //   359: aload_0
    //   360: getfield n : Ljava/nio/ByteBuffer;
    //   363: iconst_4
    //   364: iload #6
    //   366: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   369: pop
    //   370: aload_0
    //   371: getfield n : Ljava/nio/ByteBuffer;
    //   374: bipush #8
    //   376: lload_2
    //   377: ldc2_w 1000
    //   380: lmul
    //   381: invokevirtual putLong : (IJ)Ljava/nio/ByteBuffer;
    //   384: pop
    //   385: aload_0
    //   386: getfield n : Ljava/nio/ByteBuffer;
    //   389: iconst_0
    //   390: invokevirtual position : (I)Ljava/nio/Buffer;
    //   393: pop
    //   394: aload_0
    //   395: iload #6
    //   397: putfield o : I
    //   400: aload_0
    //   401: getfield n : Ljava/nio/ByteBuffer;
    //   404: invokevirtual remaining : ()I
    //   407: istore #7
    //   409: iload #7
    //   411: ifle -> 455
    //   414: aload #9
    //   416: aload_0
    //   417: getfield n : Ljava/nio/ByteBuffer;
    //   420: iload #7
    //   422: iconst_1
    //   423: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   426: istore #5
    //   428: iload #5
    //   430: ifge -> 445
    //   433: aload_0
    //   434: iconst_0
    //   435: putfield o : I
    //   438: iload #5
    //   440: istore #4
    //   442: goto -> 506
    //   445: iload #5
    //   447: iload #7
    //   449: if_icmpge -> 455
    //   452: goto -> 506
    //   455: aload #9
    //   457: aload_1
    //   458: iload #6
    //   460: iconst_1
    //   461: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   464: istore #4
    //   466: iload #4
    //   468: ifge -> 479
    //   471: aload_0
    //   472: iconst_0
    //   473: putfield o : I
    //   476: goto -> 506
    //   479: aload_0
    //   480: aload_0
    //   481: getfield o : I
    //   484: iload #4
    //   486: isub
    //   487: putfield o : I
    //   490: goto -> 476
    //   493: aload_0
    //   494: getfield h : Landroid/media/AudioTrack;
    //   497: aload_1
    //   498: iload #6
    //   500: iconst_1
    //   501: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   504: istore #4
    //   506: aload_0
    //   507: invokestatic elapsedRealtime : ()J
    //   510: putfield L : J
    //   513: iload #4
    //   515: iflt -> 576
    //   518: aload_0
    //   519: getfield g : Lc01;
    //   522: getfield a : Z
    //   525: istore #8
    //   527: iload #8
    //   529: ifeq -> 544
    //   532: aload_0
    //   533: aload_0
    //   534: getfield r : J
    //   537: iload #4
    //   539: i2l
    //   540: ladd
    //   541: putfield r : J
    //   544: iload #4
    //   546: iload #6
    //   548: if_icmpne -> 575
    //   551: iload #8
    //   553: ifne -> 570
    //   556: aload_0
    //   557: aload_0
    //   558: getfield s : J
    //   561: aload_0
    //   562: getfield t : I
    //   565: i2l
    //   566: ladd
    //   567: putfield s : J
    //   570: aload_0
    //   571: aconst_null
    //   572: putfield B : Ljava/nio/ByteBuffer;
    //   575: return
    //   576: new java/lang/Exception
    //   579: dup
    //   580: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.XcHpnKUYgjjq : Ljava/lang/String;
    //   583: iload #4
    //   585: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   588: invokespecial <init> : (Ljava/lang/String;)V
    //   591: athrow
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */