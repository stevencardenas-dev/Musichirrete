import android.content.Context;
import android.media.MediaPlayer;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class n4 extends hc {
  public r4 m;
  
  public int n = 0;
  
  public int o;
  
  public float p = 1.0F;
  
  public float q = 1.0F;
  
  public n4(Context paramContext) {
    super(paramContext);
  }
  
  public final int A() {
    try {
      return this.m.getCurrentPosition();
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final int C() {
    try {
      return this.m.getDuration();
    } catch (Exception exception) {
      exception.printStackTrace();
      return 0;
    } 
  }
  
  public final float D() {
    return this.q;
  }
  
  public final float E() {
    return this.p;
  }
  
  public final int F() {
    return this.m.c;
  }
  
  public final void G(Context paramContext) {
    this.m = new r4(MyApplication.o().getInt("k_i_lfch", 100), MyApplication.o().getInt("k_i_rgch", 100));
    c0(0);
    this.m.setWakeMode(paramContext, 1);
    this.m.setAudioAttributes(MusicService.x());
    this.m.setOnCompletionListener(new j4(0, this));
    this.m.setOnPreparedListener(new k4(this));
    this.m.setOnInfoListener((MediaPlayer.OnInfoListener)new Object());
    this.m.setOnErrorListener(new m4(this));
  }
  
  public final boolean H() {
    return true;
  }
  
  public final boolean J() {
    try {
      return this.m.isPlaying();
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void M() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void O() {
    this.m.release();
    this.e = null;
    this.c = null;
    this.f = null;
  }
  
  public final void Q() {
    try {
      this.m.reset();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void R(int paramInt) {
    this.m.seekTo(paramInt);
  }
  
  public final void T(int paramInt) {
    this.o = paramInt;
    this.m.setAudioSessionId(paramInt);
  }
  
  public final void U() {
    this.m.setAuxEffectSendLevel(1.0F);
  }
  
  public final void W(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   4: astore #5
    //   6: aload #5
    //   8: invokevirtual getPath : ()Ljava/lang/String;
    //   11: astore #4
    //   13: ldc 'file'
    //   15: aload #5
    //   17: invokevirtual getScheme : ()Ljava/lang/String;
    //   20: invokevirtual equals : (Ljava/lang/Object;)Z
    //   23: ifeq -> 64
    //   26: aload #4
    //   28: ifnull -> 64
    //   31: aload #4
    //   33: ldc ':'
    //   35: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   38: ifeq -> 64
    //   41: aload_0
    //   42: getfield m : Lr4;
    //   45: aload_1
    //   46: invokevirtual setDataSource : (Ljava/lang/String;)V
    //   49: goto -> 217
    //   52: astore_1
    //   53: goto -> 101
    //   56: astore_1
    //   57: goto -> 108
    //   60: astore_1
    //   61: goto -> 115
    //   64: aload #5
    //   66: astore #4
    //   68: aload #5
    //   70: invokestatic N : (Landroid/net/Uri;)Z
    //   73: ifeq -> 83
    //   76: aload #5
    //   78: invokestatic M : (Landroid/net/Uri;)Landroid/net/Uri;
    //   81: astore #4
    //   83: aload_0
    //   84: getfield m : Lr4;
    //   87: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   90: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   93: aload #4
    //   95: invokevirtual setDataSource : (Landroid/content/Context;Landroid/net/Uri;)V
    //   98: goto -> 217
    //   101: aload_1
    //   102: invokevirtual printStackTrace : ()V
    //   105: goto -> 217
    //   108: aload_1
    //   109: invokevirtual printStackTrace : ()V
    //   112: goto -> 217
    //   115: aload_1
    //   116: invokevirtual printStackTrace : ()V
    //   119: goto -> 217
    //   122: astore #4
    //   124: aload_1
    //   125: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   128: astore_1
    //   129: aload_0
    //   130: getfield m : Lr4;
    //   133: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   136: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   139: aload_1
    //   140: invokevirtual setDataSource : (Landroid/content/Context;Landroid/net/Uri;)V
    //   143: goto -> 217
    //   146: astore #4
    //   148: aload_1
    //   149: invokevirtual getPath : ()Ljava/lang/String;
    //   152: astore #4
    //   154: ldc 'file'
    //   156: aload_1
    //   157: invokevirtual getScheme : ()Ljava/lang/String;
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 217
    //   166: aload #4
    //   168: ifnull -> 217
    //   171: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   174: aload #4
    //   176: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   179: astore_1
    //   180: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   183: aload_1
    //   184: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   187: astore_1
    //   188: aload_1
    //   189: ifnull -> 217
    //   192: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   195: aload_1
    //   196: invokevirtual l : (Lv00;)Lv00;
    //   199: astore_1
    //   200: aload_0
    //   201: getfield m : Lr4;
    //   204: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   207: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   210: aload_1
    //   211: invokevirtual j : ()Landroid/net/Uri;
    //   214: invokevirtual setDataSource : (Landroid/content/Context;Landroid/net/Uri;)V
    //   217: aload_0
    //   218: getfield m : Lr4;
    //   221: aload_0
    //   222: getfield n : I
    //   225: invokevirtual attachAuxEffect : (I)V
    //   228: getstatic ag0.d : Ljava/lang/String;
    //   231: astore_1
    //   232: aload_1
    //   233: ifnull -> 248
    //   236: aload_1
    //   237: invokevirtual length : ()I
    //   240: istore_3
    //   241: iload_3
    //   242: ifle -> 248
    //   245: goto -> 276
    //   248: aload_0
    //   249: getfield m : Lr4;
    //   252: astore_1
    //   253: iload_2
    //   254: ifeq -> 264
    //   257: aload_1
    //   258: invokevirtual prepare : ()V
    //   261: goto -> 276
    //   264: aload_1
    //   265: invokevirtual prepareAsync : ()V
    //   268: goto -> 276
    //   271: astore_1
    //   272: aload_1
    //   273: invokevirtual printStackTrace : ()V
    //   276: return
    // Exception table:
    //   from	to	target	type
    //   0	26	122	java/io/IOException
    //   0	26	60	java/lang/IllegalArgumentException
    //   0	26	56	java/lang/SecurityException
    //   0	26	52	java/lang/IllegalStateException
    //   31	49	122	java/io/IOException
    //   31	49	60	java/lang/IllegalArgumentException
    //   31	49	56	java/lang/SecurityException
    //   31	49	52	java/lang/IllegalStateException
    //   68	83	122	java/io/IOException
    //   68	83	60	java/lang/IllegalArgumentException
    //   68	83	56	java/lang/SecurityException
    //   68	83	52	java/lang/IllegalStateException
    //   83	98	122	java/io/IOException
    //   83	98	60	java/lang/IllegalArgumentException
    //   83	98	56	java/lang/SecurityException
    //   83	98	52	java/lang/IllegalStateException
    //   101	105	271	java/io/IOException
    //   108	112	271	java/io/IOException
    //   115	119	271	java/io/IOException
    //   124	129	271	java/io/IOException
    //   129	143	146	java/io/IOException
    //   148	166	271	java/io/IOException
    //   171	188	271	java/io/IOException
    //   192	217	271	java/io/IOException
    //   217	232	271	java/io/IOException
    //   236	241	271	java/io/IOException
    //   257	261	271	java/io/IOException
    //   264	268	271	java/io/IOException
  }
  
  public final void Y(int paramInt1, int paramInt2) {
    r4 r41 = this.m;
    r41.getClass();
    try {
      r41.a = paramInt1;
      return;
    } finally {
      r41 = null;
      r41.printStackTrace();
    } 
  }
  
  public final void a0(float paramFloat) {
    r4 r41 = this.m;
    r41.getClass();
    try {
      r41.setPlaybackParams(r41.getPlaybackParams().setPitch(paramFloat));
    } finally {
      r41 = null;
    } 
  }
  
  public final void b0(float paramFloat) {
    boolean bool;
    r4 r41;
    try {
      bool = this.m.isPlaying();
    } finally {
      Exception exception = null;
    } 
    r41.getClass();
    try {
      r41.setPlaybackParams(r41.getPlaybackParams().setSpeed(paramFloat));
    } finally {
      r41 = null;
    } 
    this.p = paramFloat;
  }
  
  public final void c0(int paramInt) {
    this.m.a(paramInt);
  }
  
  public final void e0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void g0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void u(int paramInt) {
    this.n = paramInt;
    this.m.attachAuxEffect(paramInt);
  }
  
  public final boolean w() {
    return true;
  }
  
  public final int x() {
    return this.m.getAudioSessionId();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */