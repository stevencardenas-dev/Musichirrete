import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

public final class go0 implements View.OnTouchListener {
  public static final int t = ViewConfiguration.getTapTimeout();
  
  public final ra b;
  
  public final AccelerateInterpolator c;
  
  public final y10 e;
  
  public e3 f;
  
  public final float[] g;
  
  public final float[] h;
  
  public final int i;
  
  public final int j;
  
  public final float[] k;
  
  public final float[] l;
  
  public final float[] m;
  
  public boolean n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public final y10 s;
  
  public go0(y10 paramy10) {
    Object object = new Object();
    ((ra)object).e = Long.MIN_VALUE;
    ((ra)object).g = -1L;
    ((ra)object).f = 0L;
    this.b = (ra)object;
    this.c = new AccelerateInterpolator();
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = 0.0F;
    arrayOfFloat2[1] = 0.0F;
    this.g = arrayOfFloat2;
    float[] arrayOfFloat5 = new float[2];
    arrayOfFloat5[0] = Float.MAX_VALUE;
    arrayOfFloat5[1] = Float.MAX_VALUE;
    this.h = arrayOfFloat5;
    float[] arrayOfFloat3 = new float[2];
    arrayOfFloat3[0] = 0.0F;
    arrayOfFloat3[1] = 0.0F;
    this.k = arrayOfFloat3;
    float[] arrayOfFloat4 = new float[2];
    arrayOfFloat4[0] = 0.0F;
    arrayOfFloat4[1] = 0.0F;
    this.l = arrayOfFloat4;
    float[] arrayOfFloat1 = new float[2];
    arrayOfFloat1[0] = Float.MAX_VALUE;
    arrayOfFloat1[1] = Float.MAX_VALUE;
    this.m = arrayOfFloat1;
    this.e = paramy10;
    float f = (Resources.getSystem().getDisplayMetrics()).density;
    int i = (int)(1575.0F * f + 0.5F);
    int j = (int)(f * 315.0F + 0.5F);
    f = i / 1000.0F;
    arrayOfFloat1[0] = f;
    arrayOfFloat1[1] = f;
    f = j / 1000.0F;
    arrayOfFloat4[0] = f;
    arrayOfFloat4[1] = f;
    this.i = 1;
    arrayOfFloat5[0] = Float.MAX_VALUE;
    arrayOfFloat5[1] = Float.MAX_VALUE;
    arrayOfFloat2[0] = 0.2F;
    arrayOfFloat2[1] = 0.2F;
    arrayOfFloat3[0] = 0.001F;
    arrayOfFloat3[1] = 0.001F;
    this.j = t;
    ((ra)object).a = 500;
    ((ra)object).b = 500;
    this.s = paramy10;
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 > paramFloat3) ? paramFloat3 : ((paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1);
  }
  
  public final float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f1 = b(this.g[paramInt] * paramFloat2, 0.0F, this.h[paramInt]);
    float f2 = c(paramFloat1, f1);
    paramFloat1 = c(paramFloat2 - paramFloat1, f1) - f2;
    AccelerateInterpolator accelerateInterpolator = this.c;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -accelerateInterpolator.getInterpolation(-paramFloat1);
    } else if (paramFloat1 > 0.0F) {
      paramFloat1 = accelerateInterpolator.getInterpolation(paramFloat1);
    } else {
      paramFloat1 = 0.0F;
      int j = paramFloat1 cmp 0.0F;
    } 
    paramFloat1 = b(paramFloat1, -1.0F, 1.0F);
    int i = paramFloat1 cmp 0.0F;
  }
  
  public final float c(float paramFloat1, float paramFloat2) {
    if (paramFloat2 != 0.0F) {
      int i = this.i;
      if (i != 0 && i != 1) {
        if (i == 2 && paramFloat1 < 0.0F)
          return paramFloat1 / -paramFloat2; 
      } else if (paramFloat1 < paramFloat2) {
        if (paramFloat1 >= 0.0F)
          return 1.0F - paramFloat1 / paramFloat2; 
        if (this.q && i == 1)
          return 1.0F; 
      } 
    } 
    return 0.0F;
  }
  
  public final void d() {
    boolean bool1 = this.o;
    boolean bool = false;
    if (bool1) {
      this.q = false;
      return;
    } 
    long l = AnimationUtils.currentAnimationTimeMillis();
    ra ra1 = this.b;
    int i = (int)(l - ra1.e);
    int j = ra1.b;
    if (i > j) {
      i = j;
    } else if (i < 0) {
      i = bool;
    } 
    ra1.i = i;
    ra1.h = ra1.a(l);
    ra1.g = l;
  }
  
  public final boolean e() {
    ra ra1 = this.b;
    float f = ra1.d;
    int i = (int)(f / Math.abs(f));
    Math.abs(ra1.c);
    if (i != 0) {
      y10 y101 = this.s;
      int j = y101.getCount();
      if (j != 0) {
        int k = y101.getChildCount();
        int m = y101.getFirstVisiblePosition();
        if ((i > 0) ? (m + k >= j && y101.getChildAt(k - 1).getBottom() <= y101.getHeight()) : (i >= 0 || (m <= 0 && y101.getChildAt(0).getTop() >= 0)))
          return true; 
      } 
    } 
    return false;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Z
    //   4: ifne -> 10
    //   7: goto -> 228
    //   10: aload_2
    //   11: invokevirtual getActionMasked : ()I
    //   14: istore #5
    //   16: iload #5
    //   18: ifeq -> 48
    //   21: iload #5
    //   23: iconst_1
    //   24: if_icmpeq -> 42
    //   27: iload #5
    //   29: iconst_2
    //   30: if_icmpeq -> 58
    //   33: iload #5
    //   35: iconst_3
    //   36: if_icmpeq -> 42
    //   39: goto -> 228
    //   42: aload_0
    //   43: invokevirtual d : ()V
    //   46: iconst_0
    //   47: ireturn
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield p : Z
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield n : Z
    //   58: aload_2
    //   59: invokevirtual getX : ()F
    //   62: fstore #4
    //   64: aload_1
    //   65: invokevirtual getWidth : ()I
    //   68: i2f
    //   69: fstore_3
    //   70: aload_0
    //   71: getfield e : Ly10;
    //   74: astore #8
    //   76: aload_0
    //   77: iconst_0
    //   78: fload #4
    //   80: fload_3
    //   81: aload #8
    //   83: invokevirtual getWidth : ()I
    //   86: i2f
    //   87: invokevirtual a : (IFFF)F
    //   90: fstore_3
    //   91: aload_0
    //   92: iconst_1
    //   93: aload_2
    //   94: invokevirtual getY : ()F
    //   97: aload_1
    //   98: invokevirtual getHeight : ()I
    //   101: i2f
    //   102: aload #8
    //   104: invokevirtual getHeight : ()I
    //   107: i2f
    //   108: invokevirtual a : (IFFF)F
    //   111: fstore #4
    //   113: aload_0
    //   114: getfield b : Lra;
    //   117: astore_1
    //   118: aload_1
    //   119: fload_3
    //   120: putfield c : F
    //   123: aload_1
    //   124: fload #4
    //   126: putfield d : F
    //   129: aload_0
    //   130: getfield q : Z
    //   133: ifne -> 228
    //   136: aload_0
    //   137: invokevirtual e : ()Z
    //   140: ifeq -> 228
    //   143: aload_0
    //   144: getfield f : Le3;
    //   147: ifnonnull -> 163
    //   150: aload_0
    //   151: new e3
    //   154: dup
    //   155: iconst_1
    //   156: aload_0
    //   157: invokespecial <init> : (ILjava/lang/Object;)V
    //   160: putfield f : Le3;
    //   163: aload_0
    //   164: iconst_1
    //   165: putfield q : Z
    //   168: aload_0
    //   169: iconst_1
    //   170: putfield o : Z
    //   173: aload_0
    //   174: getfield n : Z
    //   177: ifne -> 216
    //   180: aload_0
    //   181: getfield j : I
    //   184: istore #5
    //   186: iload #5
    //   188: ifle -> 216
    //   191: aload_0
    //   192: getfield f : Le3;
    //   195: astore_2
    //   196: iload #5
    //   198: i2l
    //   199: lstore #6
    //   201: getstatic v22.a : Ljava/util/WeakHashMap;
    //   204: astore_1
    //   205: aload #8
    //   207: aload_2
    //   208: lload #6
    //   210: invokevirtual postOnAnimationDelayed : (Ljava/lang/Runnable;J)V
    //   213: goto -> 223
    //   216: aload_0
    //   217: getfield f : Le3;
    //   220: invokevirtual run : ()V
    //   223: aload_0
    //   224: iconst_1
    //   225: putfield n : Z
    //   228: iconst_0
    //   229: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\go0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */