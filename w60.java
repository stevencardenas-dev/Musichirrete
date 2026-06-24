import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class w60 extends hc implements u71, au {
  public static int K;
  
  public e01 A;
  
  public final ew B = (ew)new Object();
  
  public HandlerThread C;
  
  public Handler D;
  
  public final Handler E = new Handler(Looper.getMainLooper());
  
  public boolean F = true;
  
  public boolean G = false;
  
  public boolean H = false;
  
  public final e3 I = new e3(11, this);
  
  public final m60 J = new m60(3);
  
  public fp m;
  
  public int n;
  
  public float o;
  
  public int p;
  
  public final int q;
  
  public final f01 r;
  
  public boolean s;
  
  public float t;
  
  public float u;
  
  public int v = -1;
  
  public PowerManager.WakeLock w;
  
  public int x = 0;
  
  public lz0 y;
  
  public bn1 z;
  
  public w60(Context paramContext, int paramInt, f01 paramf01) {
    super(paramContext);
    this.q = paramInt;
    this.r = paramf01;
    if (g92.P()) {
      g92.z();
      this.t = MyApplication.o().getInt("k_f_plyspd4", 10000) / 10000.0F;
      this.u = 1.0F;
      return;
    } 
    this.t = MyApplication.o().getInt("k_f_plyspd4", 10000) / 10000.0F;
    this.u = MyApplication.o().getInt("k_f_plyptch4", 10000) / 10000.0F;
  }
  
  public static float[] j0(String paramString) {
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = -999.0F;
    arrayOfFloat2[1] = -999.0F;
    float[] arrayOfFloat1 = MyApplication.j.k(paramString);
    if (arrayOfFloat1 != null)
      return arrayOfFloat1; 
    arrayOfFloat1 = arrayOfFloat2;
    if (MyApplication.o().getInt("k_i_crgvcns", 2) == 1) {
      String str = null;
      try {
        jt1 jt1 = new jt1();
        this(MyApplication.i.getApplicationContext(), Uri.parse(paramString), 128);
      } finally {
        arrayOfFloat1 = null;
        paramString = str;
      } 
    } 
    return arrayOfFloat1;
  }
  
  public final int A() {
    int i = this.v;
    if (i >= 0)
      return i; 
    try {
      return (int)l;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final int C() {
    try {
      return (i < 0) ? 0 : i;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final float D() {
    return this.u;
  }
  
  public final float E() {
    return this.t;
  }
  
  public final int F() {
    return Math.round(this.A.w * 100.0F);
  }
  
  public final void G(Context paramContext) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc 'exw:wt_'
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: astore #5
    //   11: getstatic w60.K : I
    //   14: iconst_1
    //   15: iadd
    //   16: istore_2
    //   17: iload_2
    //   18: putstatic w60.K : I
    //   21: aload #5
    //   23: iload_2
    //   24: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: new android/os/HandlerThread
    //   31: dup
    //   32: aload #5
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: astore #5
    //   42: aload_0
    //   43: aload #5
    //   45: putfield C : Landroid/os/HandlerThread;
    //   48: aload #5
    //   50: invokevirtual start : ()V
    //   53: aload_0
    //   54: new android/os/Handler
    //   57: dup
    //   58: aload_0
    //   59: getfield C : Landroid/os/HandlerThread;
    //   62: invokevirtual getLooper : ()Landroid/os/Looper;
    //   65: invokespecial <init> : (Landroid/os/Looper;)V
    //   68: putfield D : Landroid/os/Handler;
    //   71: invokestatic p : ()Landroid/os/PowerManager;
    //   74: astore #5
    //   76: new java/lang/StringBuilder
    //   79: astore #6
    //   81: aload #6
    //   83: ldc ':exw.'
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: aload #6
    //   90: getstatic w60.K : I
    //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #6
    //   99: ldc '_wlck'
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #5
    //   107: iconst_1
    //   108: aload #6
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: invokevirtual newWakeLock : (ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   116: astore #5
    //   118: aload_0
    //   119: aload #5
    //   121: putfield w : Landroid/os/PowerManager$WakeLock;
    //   124: aload #5
    //   126: iconst_0
    //   127: invokevirtual setReferenceCounted : (Z)V
    //   130: goto -> 140
    //   133: astore #5
    //   135: aload #5
    //   137: invokevirtual printStackTrace : ()V
    //   140: getstatic n9.c : I
    //   143: istore_2
    //   144: aload_1
    //   145: aconst_null
    //   146: new android/content/IntentFilter
    //   149: dup
    //   150: ldc_w 'android.media.action.HDMI_AUDIO_PLUG'
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: invokestatic h : (Landroid/content/Context;Lvv;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   159: astore #5
    //   161: getstatic d12.a : I
    //   164: bipush #17
    //   166: if_icmplt -> 199
    //   169: ldc_w 'Amazon'
    //   172: getstatic d12.c : Ljava/lang/String;
    //   175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   178: ifeq -> 199
    //   181: aload_1
    //   182: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   185: ldc_w 'external_surround_sound_enabled'
    //   188: iconst_0
    //   189: invokestatic getInt : (Landroid/content/ContentResolver;Ljava/lang/String;I)I
    //   192: iconst_1
    //   193: if_icmpne -> 199
    //   196: goto -> 245
    //   199: aload #5
    //   201: ifnull -> 245
    //   204: aload #5
    //   206: ldc_w 'android.media.extra.AUDIO_PLUG_STATE'
    //   209: iconst_0
    //   210: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   213: ifne -> 219
    //   216: goto -> 245
    //   219: new n9
    //   222: dup
    //   223: aload #5
    //   225: ldc_w 'android.media.extra.ENCODINGS'
    //   228: invokevirtual getIntArrayExtra : (Ljava/lang/String;)[I
    //   231: aload #5
    //   233: ldc_w 'android.media.extra.MAX_CHANNEL_COUNT'
    //   236: bipush #8
    //   238: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   241: invokespecial <init> : ([II)V
    //   244: pop
    //   245: new r71
    //   248: dup
    //   249: aload_0
    //   250: getfield t : F
    //   253: aload_0
    //   254: getfield u : F
    //   257: iconst_0
    //   258: invokespecial <init> : (FFI)V
    //   261: astore #5
    //   263: new e01
    //   266: dup
    //   267: aload_0
    //   268: getfield q : I
    //   271: new java/lang/Object
    //   274: dup
    //   275: invokespecial <init> : ()V
    //   278: aload #5
    //   280: invokespecial <init> : (ILhp2;Lr71;)V
    //   283: astore #5
    //   285: aload_0
    //   286: aload #5
    //   288: putfield A : Le01;
    //   291: aload #5
    //   293: new java/lang/Object
    //   296: dup
    //   297: invokespecial <init> : ()V
    //   300: invokevirtual l : (Lk9;)V
    //   303: aload_0
    //   304: getfield B : Lew;
    //   307: astore #5
    //   309: aload #5
    //   311: monitorenter
    //   312: aload #5
    //   314: monitorexit
    //   315: aload_0
    //   316: getfield B : Lew;
    //   319: astore #5
    //   321: aload #5
    //   323: monitorenter
    //   324: aload #5
    //   326: monitorexit
    //   327: aload_0
    //   328: new lz0
    //   331: dup
    //   332: aload_0
    //   333: getfield D : Landroid/os/Handler;
    //   336: aload_0
    //   337: getfield A : Le01;
    //   340: invokespecial <init> : (Landroid/os/Handler;Le01;)V
    //   343: putfield y : Llz0;
    //   346: iconst_0
    //   347: ldc_w 'bufferForPlaybackMs'
    //   350: ldc_w '0'
    //   353: invokestatic a : (ILjava/lang/String;Ljava/lang/String;)V
    //   356: iconst_0
    //   357: ldc_w 'bufferForPlaybackAfterRebufferMs'
    //   360: ldc_w '0'
    //   363: invokestatic a : (ILjava/lang/String;Ljava/lang/String;)V
    //   366: iconst_0
    //   367: ldc_w 'minBufferMs'
    //   370: ldc_w 'bufferForPlaybackMs'
    //   373: invokestatic a : (ILjava/lang/String;Ljava/lang/String;)V
    //   376: iconst_0
    //   377: ldc_w 'minBufferMs'
    //   380: ldc_w 'bufferForPlaybackAfterRebufferMs'
    //   383: invokestatic a : (ILjava/lang/String;Ljava/lang/String;)V
    //   386: sipush #300
    //   389: ldc_w 'maxBufferMs'
    //   392: ldc_w 'minBufferMs'
    //   395: invokestatic a : (ILjava/lang/String;Ljava/lang/String;)V
    //   398: new nw
    //   401: dup
    //   402: new uv
    //   405: dup
    //   406: invokespecial <init> : ()V
    //   409: invokespecial <init> : (Luv;)V
    //   412: astore #5
    //   414: new f
    //   417: dup
    //   418: bipush #12
    //   420: aload_0
    //   421: invokespecial <init> : (ILjava/lang/Object;)V
    //   424: astore #6
    //   426: new zv0
    //   429: dup
    //   430: aload_1
    //   431: invokespecial <init> : (Landroid/content/Context;)V
    //   434: astore #7
    //   436: getstatic wv.i : Ljava/util/Map;
    //   439: astore #8
    //   441: ldc_w wv
    //   444: monitorenter
    //   445: getstatic wv.n : Lwv;
    //   448: ifnonnull -> 513
    //   451: new of
    //   454: astore #9
    //   456: aload #9
    //   458: aload_1
    //   459: invokespecial <init> : (Landroid/content/Context;)V
    //   462: new wv
    //   465: astore #8
    //   467: aload #8
    //   469: aload #9
    //   471: getfield b : Ljava/lang/Object;
    //   474: checkcast android/content/Context
    //   477: aload #9
    //   479: getfield c : Ljava/lang/Object;
    //   482: checkcast android/util/SparseArray
    //   485: aload #9
    //   487: getfield d : Ljava/lang/Object;
    //   490: checkcast j30
    //   493: aload #9
    //   495: getfield a : Z
    //   498: invokespecial <init> : (Landroid/content/Context;Landroid/util/SparseArray;Lj30;Z)V
    //   501: aload #8
    //   503: putstatic wv.n : Lwv;
    //   506: goto -> 513
    //   509: astore_1
    //   510: goto -> 1006
    //   513: getstatic wv.n : Lwv;
    //   516: astore #9
    //   518: ldc_w wv
    //   521: monitorexit
    //   522: aload_0
    //   523: getfield D : Landroid/os/Handler;
    //   526: invokevirtual getLooper : ()Landroid/os/Looper;
    //   529: astore #8
    //   531: new bn1
    //   534: dup
    //   535: aload_1
    //   536: aload #6
    //   538: aload #7
    //   540: aload #5
    //   542: aload #9
    //   544: new i4
    //   547: dup
    //   548: invokespecial <init> : ()V
    //   551: aload #8
    //   553: invokespecial <init> : (Landroid/content/Context;Lf;Lzv0;Lnw;Lwv;Li4;Landroid/os/Looper;)V
    //   556: astore #5
    //   558: aload_0
    //   559: aload #5
    //   561: putfield z : Lbn1;
    //   564: new java/lang/Object
    //   567: dup
    //   568: invokespecial <init> : ()V
    //   571: astore #7
    //   573: aload #5
    //   575: getfield j : Lq9;
    //   578: astore_1
    //   579: aload #5
    //   581: getfield c : Lp60;
    //   584: astore #6
    //   586: aload #5
    //   588: getfield t : Z
    //   591: ifeq -> 597
    //   594: goto -> 805
    //   597: aload #5
    //   599: getfield q : Lk9;
    //   602: aload #7
    //   604: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   607: ifne -> 775
    //   610: aload #5
    //   612: aload #7
    //   614: putfield q : Lk9;
    //   617: aload #5
    //   619: getfield b : [Llz0;
    //   622: astore #8
    //   624: aload #8
    //   626: arraylength
    //   627: istore_3
    //   628: iconst_0
    //   629: istore_2
    //   630: iload_2
    //   631: iload_3
    //   632: if_icmpge -> 700
    //   635: aload #8
    //   637: iload_2
    //   638: aaload
    //   639: astore #9
    //   641: aload #9
    //   643: invokevirtual getClass : ()Ljava/lang/Class;
    //   646: pop
    //   647: aload #6
    //   649: aload #9
    //   651: invokevirtual l : (Llz0;)La81;
    //   654: astore #9
    //   656: aload #9
    //   658: getfield f : Z
    //   661: iconst_1
    //   662: ixor
    //   663: invokestatic r : (Z)V
    //   666: aload #9
    //   668: iconst_3
    //   669: putfield c : I
    //   672: aload #9
    //   674: getfield f : Z
    //   677: iconst_1
    //   678: ixor
    //   679: invokestatic r : (Z)V
    //   682: aload #9
    //   684: aload #7
    //   686: putfield d : Ljava/lang/Object;
    //   689: aload #9
    //   691: invokevirtual b : ()V
    //   694: iinc #2, 1
    //   697: goto -> 630
    //   700: aload #5
    //   702: getfield f : Ljava/util/concurrent/CopyOnWriteArraySet;
    //   705: invokevirtual iterator : ()Ljava/util/Iterator;
    //   708: astore #7
    //   710: aload #7
    //   712: invokeinterface hasNext : ()Z
    //   717: ifeq -> 775
    //   720: aload #7
    //   722: invokeinterface next : ()Ljava/lang/Object;
    //   727: checkcast i4
    //   730: astore #8
    //   732: aload #8
    //   734: aload #8
    //   736: getfield e : Lh4;
    //   739: getfield f : Lg4;
    //   742: invokevirtual f : (Lg4;)Lip2;
    //   745: pop
    //   746: aload #8
    //   748: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
    //   751: invokevirtual iterator : ()Ljava/util/Iterator;
    //   754: astore #8
    //   756: aload #8
    //   758: invokeinterface hasNext : ()Z
    //   763: ifne -> 769
    //   766: goto -> 710
    //   769: aload #8
    //   771: invokestatic g : (Ljava/util/Iterator;)Ljava/lang/ClassCastException;
    //   774: athrow
    //   775: aload_1
    //   776: invokevirtual getClass : ()Ljava/lang/Class;
    //   779: pop
    //   780: aload #6
    //   782: getfield j : Z
    //   785: istore #4
    //   787: aload #5
    //   789: aload_1
    //   790: aload #5
    //   792: invokevirtual d : ()I
    //   795: iload #4
    //   797: invokevirtual c : (IZ)I
    //   800: iload #4
    //   802: invokevirtual u : (IZ)V
    //   805: aload_0
    //   806: getfield z : Lbn1;
    //   809: astore #5
    //   811: aload #5
    //   813: getfield l : Lnf;
    //   816: astore_1
    //   817: aload #5
    //   819: getfield k : Lup;
    //   822: astore #5
    //   824: aload #5
    //   826: getfield d : Ljava/lang/Object;
    //   829: checkcast android/os/PowerManager$WakeLock
    //   832: ifnonnull -> 887
    //   835: aload #5
    //   837: getfield c : Ljava/lang/Object;
    //   840: checkcast android/os/PowerManager
    //   843: astore #6
    //   845: aload #6
    //   847: ifnonnull -> 863
    //   850: ldc_w 'WakeLockManager'
    //   853: ldc_w 'PowerManager is null, therefore not creating the WakeLock.'
    //   856: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   859: pop
    //   860: goto -> 932
    //   863: aload #6
    //   865: iconst_1
    //   866: ldc_w 'ExoPlayer:WakeLockManager'
    //   869: invokevirtual newWakeLock : (ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   872: astore #6
    //   874: aload #5
    //   876: aload #6
    //   878: putfield d : Ljava/lang/Object;
    //   881: aload #6
    //   883: iconst_0
    //   884: invokevirtual setReferenceCounted : (Z)V
    //   887: aload #5
    //   889: iconst_1
    //   890: putfield a : Z
    //   893: aload #5
    //   895: getfield d : Ljava/lang/Object;
    //   898: checkcast android/os/PowerManager$WakeLock
    //   901: astore #6
    //   903: aload #6
    //   905: ifnonnull -> 911
    //   908: goto -> 932
    //   911: aload #5
    //   913: getfield b : Z
    //   916: ifeq -> 927
    //   919: aload #6
    //   921: invokevirtual acquire : ()V
    //   924: goto -> 932
    //   927: aload #6
    //   929: invokevirtual release : ()V
    //   932: aload_1
    //   933: iconst_0
    //   934: putfield a : Z
    //   937: aload_0
    //   938: getfield B : Lew;
    //   941: astore_1
    //   942: aload_1
    //   943: monitorenter
    //   944: aload_1
    //   945: monitorexit
    //   946: aload_0
    //   947: new fp
    //   950: dup
    //   951: new sm1
    //   954: dup
    //   955: iconst_2
    //   956: invokespecial <init> : (I)V
    //   959: iconst_0
    //   960: anewarray ad
    //   963: invokespecial <init> : (Lsm1;[Lad;)V
    //   966: putfield m : Lfp;
    //   969: aload_0
    //   970: getfield z : Lbn1;
    //   973: getfield c : Lp60;
    //   976: getfield g : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   979: new fd
    //   982: dup
    //   983: aload_0
    //   984: invokespecial <init> : (Lu71;)V
    //   987: invokevirtual addIfAbsent : (Ljava/lang/Object;)Z
    //   990: pop
    //   991: aload_0
    //   992: getfield r : Lf01;
    //   995: astore_1
    //   996: aload_1
    //   997: ifnull -> 1005
    //   1000: aload_1
    //   1001: aload_0
    //   1002: invokevirtual c : (Lau;)V
    //   1005: return
    //   1006: ldc_w wv
    //   1009: monitorexit
    //   1010: aload_1
    //   1011: athrow
    // Exception table:
    //   from	to	target	type
    //   71	130	133	finally
    //   445	506	509	finally
    //   513	518	509	finally
    //   1006	1010	509	finally
  }
  
  public final boolean H() {
    return true;
  }
  
  public final boolean J() {
    int i = this.z.d();
    return ((i == 2 || i == 3) && this.z.c.j);
  }
  
  public final boolean K() {
    return this.F ^ true;
  }
  
  public final void M() {
    this.F = true;
    this.D.post(new v60(this, 6));
    k0();
  }
  
  public final void O() {
    this.D.post(new v60(this, 5));
  }
  
  public final void Q() {
    this.F = true;
    this.D.post(new v60(this, 3));
  }
  
  public final void R(int paramInt) {
    this.v = paramInt;
    this.D.post(new y2(paramInt, 4, this));
  }
  
  public final void S(int paramInt) {
    f01 f011 = this.r;
    if (f011 != null) {
      float f = (paramInt - 100) / 100.0F;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f01}, name=null} */
      try {
        f91 f91 = f011.a;
        if (f91.c != f) {
          f91.c = f;
          try {
            ArrayList<Object> arrayList = f011.m;
            int i = arrayList.size();
            paramInt = 0;
          } finally {
            f91 = null;
          } 
        } 
      } finally {
        Exception exception;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f01}, name=null} */
      return;
    } 
  }
  
  public final void T(int paramInt) {}
  
  public final void U() {
    this.o = 1.0F;
    this.A.m(new jb(this.n, 1.0F));
  }
  
  public final void W(String paramString, boolean paramBoolean) {
    this.D.post(new e6(6, this, paramString));
  }
  
  public final void a(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder("epw:opd>");
    stringBuilder.append(paramInt);
    stringBuilder.append(":");
    stringBuilder.append(this);
    n21.F(stringBuilder.toString());
    if (paramInt == 0)
      m0(new v60(this, 2)); 
  }
  
  public final void a0(float paramFloat) {
    if (this.u != paramFloat) {
      bn1 bn11 = this.z;
      r71 r712 = bn11.c.p;
      r71 r711 = r712;
      if (r712 == null)
        r711 = r71.d; 
      bn11.s(new r71(r711.a, paramFloat, 0));
      this.u = paramFloat;
      f(qn.e);
    } 
  }
  
  public final void b0(float paramFloat) {
    if (this.t != paramFloat) {
      bn1 bn11 = this.z;
      r71 r712 = bn11.c.p;
      r71 r711 = r712;
      if (r712 == null)
        r711 = r71.d; 
      bn11.s(new r71(paramFloat, r711.b, 0));
      this.t = paramFloat;
      f(qn.e);
    } 
  }
  
  public final void c0(int paramInt) {
    this.A.n(paramInt / 100.0F);
  }
  
  public final void d0() {
    /* monitor enter ThisExpression{ObjectType{w60}} */
    try {
      this.s = false;
      if (this.G || this.b != null) {
        fp fp1;
        f01 f011;
        bn1 bn11 = this.z;
        boolean bool = bn11.c.j;
        bn11.r(false);
        long l = this.z.c.m();
        String str = this.b;
        this.z.t(true);
        r71 r71 = new r71();
        this(this.t, this.u, 0);
        this.y.f(r71);
        this.z.s(r71);
        if (this.m.A() > 0)
          this.m.v(); 
        null = i0(str);
        synchronized (this.m) {
          synchronized (fp1.i.size()) {
            fp1.u(null, Collections.singletonList(null));
            this.z.p(this.m, true);
            bn1 bn12 = this.z;
            bn12.q(bn12.n(), l);
            this.z.r(bool);
            f011 = this.r;
            if (f011 != null)
              f011.c(this); 
            /* monitor exit ThisExpression{ObjectType{w60}} */
            return;
          } 
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{w60}} */
  }
  
  public final void e0() {
    this.F = false;
    try {
      PowerManager.WakeLock wakeLock = this.w;
    } finally {
      Exception exception = null;
    } 
    this.D.post(new v60(this, 4));
  }
  
  public final void f(qn paramqn) {
    if (paramqn == qn.e && !this.s) {
      Handler handler = this.D;
      e3 e31 = this.I;
      handler.removeCallbacks(e31);
      this.s = true;
      this.D.post(e31);
    } 
  }
  
  public final void g(l60 paraml60) {
    ec ec = this.f;
    if (ec != null)
      ec.v(this, paraml60.b, paraml60.f); 
  }
  
  public final void g0() {
    this.F = true;
    this.D.post(new v60(this, 8));
    k0();
  }
  
  public final void h0(String paramString) {
    String str = kOkiWEITVb.QDv;
    /* monitor enter ThisExpression{ObjectType{w60}} */
    try {
      StringBuilder stringBuilder2 = new StringBuilder();
      this(str);
      stringBuilder2.append(this);
      n21.F(stringBuilder2.toString());
      if (this.m.A() == 2)
        synchronized (this.m) {
          null.z(1);
          null.C(1, 2);
        }  
      StringBuilder stringBuilder1 = new StringBuilder();
      this("epw:ant>");
      stringBuilder1.append(this);
      stringBuilder1.append(" -> ");
      stringBuilder1.append(paramString);
      stringBuilder1.append(" -> ");
      stringBuilder1.append(this.m.A());
      n21.F(stringBuilder1.toString());
      if (paramString != null && this.m.A() == 1) {
        fp fp1 = this.m;
        synchronized (i0(paramString)) {
          fp1.u(1, Collections.singletonList(null));
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fp}, name=null} */
        } 
      } 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{w60}} */
  }
  
  public final rz0 i0(String paramString) {
    km0 km0 = null;
    if (paramString != null) {
      long l;
      try {
        lm0 lm0 = MyApplication.j.c;
        wo wo = new wo();
        this(paramString, null);
        km0 km01 = lm0.b(wo);
        km0 = km01;
      } finally {
        Exception exception;
      } 
      boolean bool2 = MyApplication.o().getBoolean("k_b_mtdc", true);
      int i = MyApplication.o().getInt("k_i_osprt", 0);
      boolean bool1 = MyApplication.o().getBoolean("k_b_opr64b", false);
      Uri uri = Uri.parse(paramString);
      if (km0 != null) {
        l = km0.c.g;
      } else {
        l = 0L;
      } 
      float f1 = this.t;
      float f2 = this.u;
      f01 f011 = this.r;
      m60 m601 = this.J;
      return new rz0(this.g, uri, l, i, bool1, false, f1, f2, bool2, f011, m601);
    } 
    return null;
  }
  
  public final void k0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void l0() {
    // Byte code:
    //   0: ldc_w 'epw:rt'
    //   3: invokestatic F : (Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield x : I
    //   10: ifne -> 188
    //   13: aload_0
    //   14: getfield b : Ljava/lang/String;
    //   17: ifnull -> 188
    //   20: aload_0
    //   21: getfield m : Lfp;
    //   24: astore_2
    //   25: aload_2
    //   26: aload_0
    //   27: getfield z : Lbn1;
    //   30: getfield s : Lad;
    //   33: if_acmpne -> 188
    //   36: aload_2
    //   37: invokevirtual A : ()I
    //   40: ifle -> 188
    //   43: aload_0
    //   44: getfield m : Lfp;
    //   47: iconst_0
    //   48: invokevirtual z : (I)Lur0;
    //   51: ifnull -> 188
    //   54: aload_0
    //   55: getfield m : Lfp;
    //   58: iconst_0
    //   59: invokevirtual z : (I)Lur0;
    //   62: getfield i : Lad;
    //   65: invokevirtual f : ()Ljava/lang/Object;
    //   68: ifnull -> 119
    //   71: aload_0
    //   72: getfield A : Le01;
    //   75: astore_2
    //   76: aload_2
    //   77: getfield h : Landroid/media/AudioTrack;
    //   80: ifnull -> 113
    //   83: aload_2
    //   84: getfield F : Z
    //   87: ifeq -> 113
    //   90: aload_2
    //   91: invokevirtual f : ()Z
    //   94: ifne -> 113
    //   97: aload_2
    //   98: getfield h : Landroid/media/AudioTrack;
    //   101: invokevirtual getPlayState : ()I
    //   104: iconst_1
    //   105: if_icmpne -> 113
    //   108: iconst_1
    //   109: istore_1
    //   110: goto -> 115
    //   113: iconst_0
    //   114: istore_1
    //   115: iload_1
    //   116: ifeq -> 188
    //   119: aload_0
    //   120: getfield z : Lbn1;
    //   123: astore_2
    //   124: aload_2
    //   125: getfield s : Lad;
    //   128: ifnull -> 188
    //   131: aload_2
    //   132: invokevirtual d : ()I
    //   135: iconst_3
    //   136: if_icmpne -> 188
    //   139: aload_2
    //   140: getfield c : Lp60;
    //   143: getfield j : Z
    //   146: ifeq -> 188
    //   149: aload_0
    //   150: aload_0
    //   151: getfield x : I
    //   154: iconst_1
    //   155: iadd
    //   156: putfield x : I
    //   159: aload_0
    //   160: getfield z : Lbn1;
    //   163: astore_2
    //   164: aload_2
    //   165: invokevirtual getClass : ()Ljava/lang/Class;
    //   168: pop
    //   169: getstatic com/google/android/gms/common/internal/Qg/jHxlGgUTadw.ukKDtVAlgviFQ : Ljava/lang/String;
    //   172: ldc_w 'sep:rt2'
    //   175: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   178: pop
    //   179: aload_2
    //   180: aload_2
    //   181: getfield s : Lad;
    //   184: iconst_0
    //   185: invokevirtual p : (Lad;Z)V
    //   188: return
  }
  
  public final void m0(Runnable paramRunnable) {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      paramRunnable.run();
      return;
    } 
    this.E.post(paramRunnable);
  }
  
  public final void n(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : I
    //   4: istore_2
    //   5: aload_0
    //   6: iload_1
    //   7: putfield p : I
    //   10: iload_1
    //   11: iconst_3
    //   12: if_icmpne -> 20
    //   15: aload_0
    //   16: iconst_m1
    //   17: putfield v : I
    //   20: iload_2
    //   21: iload_1
    //   22: if_icmpeq -> 222
    //   25: iload_1
    //   26: iconst_3
    //   27: if_icmpne -> 118
    //   30: aload_0
    //   31: getfield x : I
    //   34: ifle -> 118
    //   37: aload_0
    //   38: getfield z : Lbn1;
    //   41: getfield s : Lad;
    //   44: astore #4
    //   46: aload_0
    //   47: getfield b : Ljava/lang/String;
    //   50: ifnull -> 104
    //   53: aload #4
    //   55: ifnull -> 104
    //   58: aload_0
    //   59: getfield m : Lfp;
    //   62: astore_3
    //   63: aload_3
    //   64: aload #4
    //   66: if_acmpne -> 104
    //   69: aload_3
    //   70: invokevirtual A : ()I
    //   73: ifeq -> 104
    //   76: aload_0
    //   77: getfield m : Lfp;
    //   80: iconst_0
    //   81: invokevirtual z : (I)Lur0;
    //   84: ifnull -> 104
    //   87: aload_0
    //   88: getfield m : Lfp;
    //   91: iconst_0
    //   92: invokevirtual z : (I)Lur0;
    //   95: getfield i : Lad;
    //   98: invokevirtual f : ()Ljava/lang/Object;
    //   101: ifnull -> 118
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield x : I
    //   109: goto -> 118
    //   112: astore_3
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield x : I
    //   118: iload_1
    //   119: iconst_3
    //   120: if_icmpne -> 163
    //   123: aload_0
    //   124: getfield G : Z
    //   127: ifne -> 163
    //   130: aload_0
    //   131: getfield b : Ljava/lang/String;
    //   134: ifnull -> 163
    //   137: aload_0
    //   138: iconst_1
    //   139: putfield G : Z
    //   142: aload_0
    //   143: iconst_0
    //   144: putfield H : Z
    //   147: aload_0
    //   148: new v60
    //   151: dup
    //   152: aload_0
    //   153: iconst_0
    //   154: invokespecial <init> : (Lw60;I)V
    //   157: invokevirtual m0 : (Ljava/lang/Runnable;)V
    //   160: goto -> 222
    //   163: iload_1
    //   164: iconst_4
    //   165: if_icmpne -> 222
    //   168: aload_0
    //   169: getfield H : Z
    //   172: ifne -> 222
    //   175: aload_0
    //   176: iconst_0
    //   177: putfield G : Z
    //   180: aload_0
    //   181: iconst_1
    //   182: putfield H : Z
    //   185: new java/lang/StringBuilder
    //   188: dup
    //   189: ldc_w 'epw:ops>E:'
    //   192: invokespecial <init> : (Ljava/lang/String;)V
    //   195: astore_3
    //   196: aload_3
    //   197: aload_0
    //   198: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_3
    //   203: invokevirtual toString : ()Ljava/lang/String;
    //   206: invokestatic F : (Ljava/lang/String;)V
    //   209: aload_0
    //   210: new v60
    //   213: dup
    //   214: aload_0
    //   215: iconst_1
    //   216: invokespecial <init> : (Lw60;I)V
    //   219: invokevirtual m0 : (Ljava/lang/Runnable;)V
    //   222: return
    // Exception table:
    //   from	to	target	type
    //   37	53	112	finally
    //   58	63	112	finally
    //   69	104	112	finally
    //   104	109	112	finally
  }
  
  public final void u(int paramInt) {
    this.n = paramInt;
    this.A.m(new jb(paramInt, this.o));
  }
  
  public final boolean v() {
    return true;
  }
  
  public final boolean w() {
    return true;
  }
  
  public final int x() {
    e01 e011 = this.A;
    return (e011 != null) ? e011.I : 7295;
  }
  
  public final int z() {
    byte b1;
    byte b2 = 0;
    try {
      AudioTrack audioTrack = this.A.h;
      b1 = b2;
    } finally {
      Exception exception = null;
    } 
    return b1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */