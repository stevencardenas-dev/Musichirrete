import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public abstract class yd extends View {
  public static final int X0 = 0;
  
  public final int A;
  
  public ColorStateList A0;
  
  public int B;
  
  public ColorStateList B0;
  
  public final int C;
  
  public ColorStateList C0;
  
  public int D;
  
  public ColorStateList D0;
  
  public int E;
  
  public final Path E0;
  
  public int F;
  
  public final RectF F0;
  
  public int G;
  
  public final RectF G0;
  
  public int H;
  
  public final RectF H0;
  
  public int I;
  
  public final RectF I0;
  
  public int J;
  
  public final Rect J0;
  
  public int K;
  
  public final RectF K0;
  
  public int L;
  
  public final Rect L0;
  
  public int M;
  
  public final Matrix M0;
  
  public int N;
  
  public final ws0 N0;
  
  public int O;
  
  public Drawable O0;
  
  public int P;
  
  public List P0;
  
  public boolean Q;
  
  public float Q0;
  
  public Drawable R;
  
  public int R0;
  
  public boolean S;
  
  public final int S0;
  
  public Drawable T;
  
  public final qd T0;
  
  public boolean U;
  
  public final rd U0;
  
  public ColorStateList V;
  
  public final e V0;
  
  public Drawable W;
  
  public boolean W0;
  
  public boolean a0;
  
  public final Paint b;
  
  public Drawable b0;
  
  public final Paint c;
  
  public boolean c0;
  
  public ColorStateList d0;
  
  public final Paint e;
  
  public int e0;
  
  public final Paint f;
  
  public final int f0;
  
  public final Paint g;
  
  public final int g0;
  
  public final Paint h;
  
  public float h0;
  
  public final Paint i;
  
  public float i0;
  
  public final td j;
  
  public MotionEvent j0;
  
  public final AccessibilityManager k;
  
  public nl0 k0;
  
  public sd l;
  
  public boolean l0;
  
  public final int m;
  
  public float m0;
  
  public final ArrayList n;
  
  public float n0;
  
  public final ArrayList o;
  
  public ArrayList o0;
  
  public final ArrayList p;
  
  public int p0;
  
  public boolean q;
  
  public int q0;
  
  public ValueAnimator r;
  
  public float r0;
  
  public ValueAnimator s;
  
  public float[] s0;
  
  public final int t;
  
  public int t0;
  
  public final int u;
  
  public int u0;
  
  public final int v;
  
  public int v0;
  
  public final int w;
  
  public int w0;
  
  public final int x;
  
  public boolean x0;
  
  public final int y;
  
  public boolean y0;
  
  public final int z;
  
  public ColorStateList z0;
  
  public yd(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952921), paramAttributeSet, paramInt);
    float f;
    this.n = new ArrayList();
    this.o = new ArrayList();
    this.p = new ArrayList();
    this.q = false;
    this.L = -1;
    this.M = -1;
    this.Q = false;
    this.S = false;
    this.U = false;
    this.a0 = false;
    this.c0 = false;
    this.l0 = false;
    this.o0 = new ArrayList();
    this.p0 = -1;
    this.q0 = -1;
    this.r0 = 0.0F;
    this.x0 = false;
    this.E0 = new Path();
    this.F0 = new RectF();
    this.G0 = new RectF();
    this.H0 = new RectF();
    this.I0 = new RectF();
    this.J0 = new Rect();
    this.K0 = new RectF();
    this.L0 = new Rect();
    this.M0 = new Matrix();
    ws0 ws01 = new ws0();
    this.N0 = ws01;
    this.P0 = Collections.EMPTY_LIST;
    this.R0 = 0;
    this.T0 = new qd(this);
    this.U0 = new rd((KeyEvent.Callback)this, 0);
    this.V0 = new e(5, this);
    Context context = getContext();
    this.W0 = isShown();
    this.b = new Paint();
    this.c = new Paint();
    Paint paint1 = new Paint(1);
    this.e = paint1;
    Paint.Style style1 = Paint.Style.FILL;
    paint1.setStyle(style1);
    paint1.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    paint1 = new Paint(1);
    this.f = paint1;
    paint1.setStyle(style1);
    Paint paint3 = new Paint();
    this.g = paint3;
    Paint.Style style2 = Paint.Style.STROKE;
    paint3.setStyle(style2);
    Paint.Cap cap = Paint.Cap.ROUND;
    paint3.setStrokeCap(cap);
    paint3 = new Paint();
    this.h = paint3;
    paint3.setStyle(style2);
    paint3.setStrokeCap(cap);
    Paint paint2 = new Paint();
    this.i = paint2;
    paint2.setStyle(style1);
    paint2.setStrokeCap(cap);
    Resources resources = context.getResources();
    this.C = resources.getDimensionPixelSize(2131166289);
    int i = resources.getDimensionPixelOffset(2131166288);
    this.u = i;
    this.G = i;
    this.v = resources.getDimensionPixelSize(2131166284);
    this.w = resources.getDimensionPixelSize(2131166287);
    this.x = resources.getDimensionPixelSize(2131166286);
    this.y = resources.getDimensionPixelSize(2131166286);
    this.z = resources.getDimensionPixelSize(2131166285);
    this.g0 = resources.getDimensionPixelSize(2131166280);
    this.f0 = resources.getDimensionPixelOffset(2131165947);
    g92.m(context, paramAttributeSet, paramInt, 2131952921);
    int[] arrayOfInt = zb1.D;
    g92.o(context, paramAttributeSet, arrayOfInt, paramInt, 2131952921, new int[0]);
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 2131952921);
    setOrientation(typedArray.getInt(2, 0));
    this.m = typedArray.getResourceId(10, 2131952955);
    this.m0 = typedArray.getFloat(4, 0.0F);
    this.n0 = typedArray.getFloat(5, 1.0F);
    setValues(new Float[] { Float.valueOf(this.m0) });
    setCentered(typedArray.getBoolean(6, false));
    this.r0 = typedArray.getFloat(3, 0.0F);
    TypedValue typedValue = g92.Y(context, 2130969668);
    if (typedValue == null || typedValue.type != 5) {
      f = context.getResources().getDimension(2131166244);
    } else {
      f = typedValue.getDimension(context.getResources().getDisplayMetrics());
    } 
    paramInt = (int)f;
    this.A = (int)Math.ceil(typedArray.getDimension(11, paramInt));
    i = 36;
    boolean bool = typedArray.hasValue(36);
    if (bool) {
      paramInt = 36;
    } else {
      paramInt = 38;
    } 
    if (!bool)
      i = 37; 
    ColorStateList colorStateList = wf2.u(context, typedArray, paramInt);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100638); 
    setTrackInactiveTintList(colorStateList);
    colorStateList = wf2.u(context, typedArray, i);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100635); 
    setTrackActiveTintList(colorStateList);
    ws01.o(wf2.u(context, typedArray, 21));
    if (typedArray.hasValue(25))
      setThumbStrokeColor(wf2.u(context, typedArray, 25)); 
    setThumbStrokeWidth(typedArray.getDimension(26, 0.0F));
    colorStateList = wf2.u(context, typedArray, 7);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100636); 
    setHaloTintList(colorStateList);
    if (typedArray.hasValue(34)) {
      paramInt = typedArray.getInt(34, -1);
    } else if (typedArray.getBoolean(35, true)) {
      paramInt = 0;
    } else {
      paramInt = 2;
    } 
    this.t0 = paramInt;
    bool = typedArray.hasValue(29);
    if (bool) {
      paramInt = 29;
    } else {
      paramInt = 31;
    } 
    if (bool) {
      i = 29;
    } else {
      i = 30;
    } 
    colorStateList = wf2.u(context, typedArray, paramInt);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100637); 
    setTickInactiveTintList(colorStateList);
    colorStateList = wf2.u(context, typedArray, i);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100634); 
    setTickActiveTintList(colorStateList);
    setThumbTrackGapSize(typedArray.getDimensionPixelSize(27, 0));
    setTrackStopIndicatorSize(typedArray.getDimensionPixelSize(49, 0));
    setTrackCornerSize(typedArray.getDimensionPixelSize(39, -1));
    setTrackInsideCornerSize(typedArray.getDimensionPixelSize(48, 0));
    setTrackIconActiveStart(wf2.y(context, typedArray, 43));
    setTrackIconActiveEnd(wf2.y(context, typedArray, 42));
    setTrackIconActiveColor(wf2.u(context, typedArray, 41));
    setTrackIconInactiveStart(wf2.y(context, typedArray, 46));
    setTrackIconInactiveEnd(wf2.y(context, typedArray, 45));
    setTrackIconInactiveColor(wf2.u(context, typedArray, 44));
    setTrackIconSize(typedArray.getDimensionPixelSize(47, 0));
    i = typedArray.getDimensionPixelSize(24, 0) * 2;
    paramInt = typedArray.getDimensionPixelSize(28, i);
    i = typedArray.getDimensionPixelSize(23, i);
    setThumbWidth(paramInt);
    setThumbHeight(i);
    setHaloRadius(typedArray.getDimensionPixelSize(8, 0));
    setThumbElevation(typedArray.getDimension(22, 0.0F));
    setTrackHeight(typedArray.getDimensionPixelSize(40, 0));
    setTickActiveRadius(typedArray.getDimensionPixelSize(32, this.N / 2));
    setTickInactiveRadius(typedArray.getDimensionPixelSize(33, this.N / 2));
    setLabelBehavior(typedArray.getInt(9, 0));
    if (!typedArray.getBoolean(0, true))
      setEnabled(false); 
    typedArray.recycle();
    setFocusable(true);
    setClickable(true);
    ws01.r();
    this.t = ViewConfiguration.get(context).getScaledTouchSlop();
    td td1 = new td(this);
    this.j = td1;
    v22.n(this, td1);
    AccessibilityManager accessibilityManager = (AccessibilityManager)getContext().getSystemService(nFLlOYeP.pnrTi);
    this.k = accessibilityManager;
    if (Build.VERSION.SDK_INT >= 29) {
      this.S0 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
      return;
    } 
    this.S0 = 120000;
  }
  
  public final void A(qv1 paramqv1, float paramFloat) {
    int j;
    paramqv1.C(n(paramFloat));
    boolean bool = u();
    int i = this.G;
    int k = this.g0;
    if (bool) {
      j = i + (int)(x(paramFloat) * this.w0) - paramqv1.getIntrinsicHeight() / 2;
      i = paramqv1.getIntrinsicHeight() + j;
      if (t()) {
        k = e() - this.I / 2 + k;
        m = paramqv1.getIntrinsicWidth();
      } else {
        m = e();
        m = this.I / 2 + k + m;
        k = paramqv1.getIntrinsicWidth() + m;
        Rect rect1 = this.J0;
        rect1.set(j, m, i, k);
      } 
    } else {
      j = i + (int)(x(paramFloat) * this.w0) - paramqv1.getIntrinsicWidth() / 2;
      i = paramqv1.getIntrinsicWidth() + j;
      k = e() - this.I / 2 + k;
      m = paramqv1.getIntrinsicHeight();
    } 
    int m = k - m;
    Rect rect = this.J0;
    rect.set(j, m, i, k);
  }
  
  public final void B(ArrayList<Comparable> paramArrayList) {
    if (!paramArrayList.isEmpty()) {
      Collections.sort(paramArrayList);
      if (this.o0.size() == paramArrayList.size() && this.o0.equals(paramArrayList))
        return; 
      this.o0 = paramArrayList;
      byte b = 1;
      this.y0 = true;
      this.q0 = 0;
      F();
      paramArrayList = this.n;
      if (paramArrayList.size() > this.o0.size()) {
        List<Comparable> list = paramArrayList.subList(this.o0.size(), paramArrayList.size());
        for (qv1 qv1 : list) {
          if (isAttachedToWindow()) {
            ViewGroup viewGroup = n21.z(this);
            if (viewGroup == null)
              continue; 
            viewGroup.getOverlay().remove(qv1);
            viewGroup.removeOnLayoutChangeListener(qv1.N);
          } 
        } 
        list.clear();
      } 
      while (paramArrayList.size() < this.o0.size()) {
        qv1 qv1 = qv1.A(getContext(), this.m);
        paramArrayList.add(qv1);
        if (isAttachedToWindow()) {
          ViewGroup viewGroup = n21.z(this);
          if (viewGroup == null)
            continue; 
          int[] arrayOfInt = new int[2];
          viewGroup.getLocationOnScreen(arrayOfInt);
          qv1.V = arrayOfInt[0];
          viewGroup.getWindowVisibleDisplayFrame(qv1.O);
          viewGroup.addOnLayoutChangeListener(qv1.N);
        } 
      } 
      if (paramArrayList.size() == 1)
        b = 0; 
      int j = paramArrayList.size();
      int i = 0;
      while (i < j) {
        qv1 qv1 = (qv1)paramArrayList.get(i);
        i++;
        ((qv1)qv1).u(b);
      } 
      paramArrayList = this.o;
      int k = paramArrayList.size();
      i = 0;
      label46: while (i < k) {
        cd cd1 = (cd)paramArrayList.get(i);
        j = i + 1;
        cd cd2 = cd1;
        ArrayList<cd> arrayList = this.o0;
        int m = arrayList.size();
        b = 0;
        while (true) {
          i = j;
          if (b < m) {
            cd1 = arrayList.get(b);
            b++;
            cd2.a(this, ((Float)cd1).floatValue(), false);
            continue;
          } 
          continue label46;
        } 
      } 
      postInvalidate();
      return;
    } 
    l0.l("At least one value must be set");
  }
  
  public final boolean C(int paramInt, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield q0 : I
    //   5: fload_2
    //   6: aload_0
    //   7: getfield o0 : Ljava/util/ArrayList;
    //   10: iload_1
    //   11: invokevirtual get : (I)Ljava/lang/Object;
    //   14: checkcast java/lang/Float
    //   17: invokevirtual floatValue : ()F
    //   20: fsub
    //   21: invokestatic abs : (F)F
    //   24: f2d
    //   25: ldc2_w 1.0E-4
    //   28: dcmpg
    //   29: ifge -> 34
    //   32: iconst_0
    //   33: ireturn
    //   34: aload_0
    //   35: invokevirtual getMinSeparation : ()F
    //   38: fstore #4
    //   40: fload #4
    //   42: fstore_3
    //   43: aload_0
    //   44: getfield R0 : I
    //   47: ifne -> 96
    //   50: fload #4
    //   52: fconst_0
    //   53: fcmpl
    //   54: ifne -> 62
    //   57: fconst_0
    //   58: fstore_3
    //   59: goto -> 96
    //   62: fload #4
    //   64: aload_0
    //   65: getfield G : I
    //   68: i2f
    //   69: fsub
    //   70: aload_0
    //   71: getfield w0 : I
    //   74: i2f
    //   75: fdiv
    //   76: fstore_3
    //   77: aload_0
    //   78: getfield m0 : F
    //   81: fstore #4
    //   83: fload #4
    //   85: aload_0
    //   86: getfield n0 : F
    //   89: fload_3
    //   90: fload #4
    //   92: invokestatic e : (FFFF)F
    //   95: fstore_3
    //   96: aload_0
    //   97: invokevirtual t : ()Z
    //   100: ifne -> 113
    //   103: fload_3
    //   104: fstore #4
    //   106: aload_0
    //   107: invokevirtual u : ()Z
    //   110: ifeq -> 117
    //   113: fload_3
    //   114: fneg
    //   115: fstore #4
    //   117: iload_1
    //   118: iconst_1
    //   119: iadd
    //   120: istore #5
    //   122: iload #5
    //   124: aload_0
    //   125: getfield o0 : Ljava/util/ArrayList;
    //   128: invokevirtual size : ()I
    //   131: if_icmplt -> 142
    //   134: aload_0
    //   135: getfield n0 : F
    //   138: fstore_3
    //   139: goto -> 161
    //   142: aload_0
    //   143: getfield o0 : Ljava/util/ArrayList;
    //   146: iload #5
    //   148: invokevirtual get : (I)Ljava/lang/Object;
    //   151: checkcast java/lang/Float
    //   154: invokevirtual floatValue : ()F
    //   157: fload #4
    //   159: fsub
    //   160: fstore_3
    //   161: iload_1
    //   162: iconst_1
    //   163: isub
    //   164: istore #5
    //   166: iload #5
    //   168: ifge -> 180
    //   171: aload_0
    //   172: getfield m0 : F
    //   175: fstore #4
    //   177: goto -> 200
    //   180: fload #4
    //   182: aload_0
    //   183: getfield o0 : Ljava/util/ArrayList;
    //   186: iload #5
    //   188: invokevirtual get : (I)Ljava/lang/Object;
    //   191: checkcast java/lang/Float
    //   194: invokevirtual floatValue : ()F
    //   197: fadd
    //   198: fstore #4
    //   200: fload_2
    //   201: fload #4
    //   203: fload_3
    //   204: invokestatic h : (FFF)F
    //   207: fstore_2
    //   208: aload_0
    //   209: getfield o0 : Ljava/util/ArrayList;
    //   212: iload_1
    //   213: fload_2
    //   214: invokestatic valueOf : (F)Ljava/lang/Float;
    //   217: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: aload_0
    //   222: getfield o : Ljava/util/ArrayList;
    //   225: astore #8
    //   227: aload #8
    //   229: invokevirtual size : ()I
    //   232: istore #6
    //   234: iconst_0
    //   235: istore #5
    //   237: iload #5
    //   239: iload #6
    //   241: if_icmpge -> 285
    //   244: aload #8
    //   246: iload #5
    //   248: invokevirtual get : (I)Ljava/lang/Object;
    //   251: astore #7
    //   253: iinc #5, 1
    //   256: aload #7
    //   258: checkcast cd
    //   261: aload_0
    //   262: aload_0
    //   263: getfield o0 : Ljava/util/ArrayList;
    //   266: iload_1
    //   267: invokevirtual get : (I)Ljava/lang/Object;
    //   270: checkcast java/lang/Float
    //   273: invokevirtual floatValue : ()F
    //   276: iconst_1
    //   277: invokeinterface a : (Landroid/view/View;FZ)V
    //   282: goto -> 237
    //   285: aload_0
    //   286: getfield k : Landroid/view/accessibility/AccessibilityManager;
    //   289: astore #7
    //   291: aload #7
    //   293: ifnull -> 360
    //   296: aload #7
    //   298: invokevirtual isEnabled : ()Z
    //   301: ifeq -> 360
    //   304: aload_0
    //   305: getfield l : Lsd;
    //   308: astore #7
    //   310: aload #7
    //   312: ifnonnull -> 331
    //   315: aload_0
    //   316: new sd
    //   319: dup
    //   320: aload_0
    //   321: iconst_0
    //   322: invokespecial <init> : (Landroid/view/View;I)V
    //   325: putfield l : Lsd;
    //   328: goto -> 338
    //   331: aload_0
    //   332: aload #7
    //   334: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   337: pop
    //   338: aload_0
    //   339: getfield l : Lsd;
    //   342: astore #7
    //   344: aload #7
    //   346: iload_1
    //   347: putfield c : I
    //   350: aload_0
    //   351: aload #7
    //   353: ldc2_w 200
    //   356: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   359: pop
    //   360: iconst_1
    //   361: ireturn
  }
  
  public final void D() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Q0 : F
    //   4: fstore #5
    //   6: aload_0
    //   7: getfield r0 : F
    //   10: fstore #6
    //   12: fload #6
    //   14: fconst_0
    //   15: fcmpl
    //   16: ifle -> 52
    //   19: aload_0
    //   20: getfield n0 : F
    //   23: aload_0
    //   24: getfield m0 : F
    //   27: fsub
    //   28: fload #6
    //   30: fdiv
    //   31: f2i
    //   32: istore #7
    //   34: fload #5
    //   36: iload #7
    //   38: i2f
    //   39: fmul
    //   40: invokestatic round : (F)I
    //   43: i2d
    //   44: iload #7
    //   46: i2d
    //   47: ddiv
    //   48: dstore_1
    //   49: goto -> 56
    //   52: fload #5
    //   54: f2d
    //   55: dstore_1
    //   56: aload_0
    //   57: invokevirtual t : ()Z
    //   60: ifne -> 72
    //   63: dload_1
    //   64: dstore_3
    //   65: aload_0
    //   66: invokevirtual u : ()Z
    //   69: ifeq -> 76
    //   72: dconst_1
    //   73: dload_1
    //   74: dsub
    //   75: dstore_3
    //   76: aload_0
    //   77: getfield n0 : F
    //   80: fstore #6
    //   82: aload_0
    //   83: getfield m0 : F
    //   86: fstore #5
    //   88: dload_3
    //   89: fload #6
    //   91: fload #5
    //   93: fsub
    //   94: f2d
    //   95: dmul
    //   96: fload #5
    //   98: f2d
    //   99: dadd
    //   100: d2f
    //   101: fstore #5
    //   103: aload_0
    //   104: aload_0
    //   105: getfield p0 : I
    //   108: fload #5
    //   110: invokevirtual C : (IF)Z
    //   113: pop
    //   114: return
  }
  
  public final void E(int paramInt, Rect paramRect) {
    int i = this.G + (int)(x(((Float)getValues().get(paramInt)).floatValue()) * this.w0);
    paramInt = e();
    int k = Math.max(this.H / 2, this.A / 2);
    int j = Math.max(this.I / 2, this.A / 2);
    RectF rectF = new RectF((i - k), (paramInt - j), (i + k), (paramInt + j));
    if (u())
      this.M0.mapRect(rectF); 
    paramRect.set((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
  }
  
  public final void F() {
    if (getBackground() instanceof RippleDrawable && getMeasuredWidth() > 0) {
      Drawable drawable = getBackground();
      if (drawable instanceof RippleDrawable) {
        float f4 = x(((Float)this.o0.get(this.q0)).floatValue()) * this.w0 + this.G;
        int i = e();
        int j = this.J;
        float f3 = j;
        float f2 = (i - j);
        float f1 = (i + j);
        float[] arrayOfFloat = new float[4];
        arrayOfFloat[0] = f4 - f3;
        arrayOfFloat[1] = f2;
        arrayOfFloat[2] = f4 + f3;
        arrayOfFloat[3] = f1;
        if (u())
          this.M0.mapPoints(arrayOfFloat); 
        drawable.setHotspotBounds((int)arrayOfFloat[0], (int)arrayOfFloat[1], (int)arrayOfFloat[2], (int)arrayOfFloat[3]);
      } 
    } 
  }
  
  public final void G() {
    float f1;
    boolean bool2 = u();
    boolean bool1 = t();
    float f2 = 0.5F;
    if (bool2 && bool1) {
      f1 = 0.5F;
      f2 = -0.2F;
    } else {
      f1 = 1.2F;
      if (bool2) {
        f2 = 1.2F;
        f1 = 0.5F;
      } 
    } 
    ArrayList<Object> arrayList = this.n;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      qv1 qv1 = (qv1)arrayList.get(i);
      i++;
      qv1 = qv1;
      qv1.Y = f2;
      qv1.Z = f1;
      qv1.invalidateSelf();
    } 
    i = this.E;
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i == 3) {
          if (isEnabled()) {
            Rect rect = new Rect();
            n21.z(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.W0) {
              l();
              return;
            } 
          } 
          m();
          return;
        } 
        m60.n("Unexpected labelBehavior: ", this.E);
        return;
      } 
      m();
      return;
    } 
    if (this.p0 != -1 && isEnabled()) {
      l();
      return;
    } 
    m();
  }
  
  public final void H() {
    int i = this.K;
    if (i > 0) {
      int j = this.H;
      this.L = j;
      this.M = i;
      i = Math.round(j * 0.5F);
      j = this.H;
      setThumbWidth(i);
      setThumbTrackGapSize(this.K - (j - i) / 2);
    } 
  }
  
  public final void I() {
    Q();
    float f = this.r0;
    int i = 0;
    if (f <= 0.0F) {
      J(0);
      return;
    } 
    int j = this.t0;
    if (j != 0) {
      if (j != 1) {
        if (j != 2) {
          m60.j("Unexpected tickVisibilityMode: ", this.t0);
          return;
        } 
      } else {
        j = (int)((this.n0 - this.m0) / f + 1.0F);
        if (j <= this.w0 / this.z + 1)
          i = j; 
      } 
    } else {
      i = Math.min((int)((this.n0 - this.m0) / f + 1.0F), this.w0 / this.z + 1);
    } 
    J(i);
  }
  
  public final void J(int paramInt) {
    if (paramInt == 0) {
      this.s0 = null;
      return;
    } 
    float[] arrayOfFloat = this.s0;
    if (arrayOfFloat == null || arrayOfFloat.length != paramInt * 2)
      this.s0 = new float[paramInt * 2]; 
    float f2 = this.w0 / (paramInt - 1);
    float f1 = e();
    for (byte b = 0; b < paramInt * 2; b += 2) {
      arrayOfFloat = this.s0;
      float f = this.G;
      arrayOfFloat[b] = b / 2.0F * f2 + f;
      arrayOfFloat[b + 1] = f1;
    } 
    if (u())
      this.M0.mapPoints(this.s0); 
  }
  
  public final void K(Canvas paramCanvas, Paint paramPaint, RectF paramRectF, float paramFloat, int paramInt) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual isEmpty : ()Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield o0 : Ljava/util/ArrayList;
    //   12: invokevirtual isEmpty : ()Z
    //   15: ifne -> 109
    //   18: aload_0
    //   19: getfield K : I
    //   22: ifle -> 109
    //   25: aload_0
    //   26: invokevirtual t : ()Z
    //   29: ifne -> 48
    //   32: aload_0
    //   33: invokevirtual u : ()Z
    //   36: ifeq -> 42
    //   39: goto -> 48
    //   42: iconst_0
    //   43: istore #10
    //   45: goto -> 59
    //   48: aload_0
    //   49: getfield o0 : Ljava/util/ArrayList;
    //   52: invokevirtual size : ()I
    //   55: iconst_1
    //   56: isub
    //   57: istore #10
    //   59: aload_0
    //   60: aload_0
    //   61: getfield o0 : Ljava/util/ArrayList;
    //   64: iload #10
    //   66: invokevirtual get : (I)Ljava/lang/Object;
    //   69: checkcast java/lang/Float
    //   72: invokevirtual floatValue : ()F
    //   75: invokevirtual S : (F)F
    //   78: aload_0
    //   79: getfield G : I
    //   82: i2f
    //   83: fsub
    //   84: fstore #6
    //   86: fload #6
    //   88: fload #4
    //   90: fcmpg
    //   91: ifge -> 109
    //   94: fload #6
    //   96: aload_0
    //   97: getfield P : I
    //   100: i2f
    //   101: invokestatic max : (FF)F
    //   104: fstore #6
    //   106: goto -> 113
    //   109: fload #4
    //   111: fstore #6
    //   113: fload #4
    //   115: fstore #7
    //   117: aload_0
    //   118: getfield o0 : Ljava/util/ArrayList;
    //   121: invokevirtual isEmpty : ()Z
    //   124: ifne -> 236
    //   127: fload #4
    //   129: fstore #7
    //   131: aload_0
    //   132: getfield K : I
    //   135: ifle -> 236
    //   138: aload_0
    //   139: invokevirtual t : ()Z
    //   142: ifne -> 169
    //   145: aload_0
    //   146: invokevirtual u : ()Z
    //   149: ifeq -> 155
    //   152: goto -> 169
    //   155: aload_0
    //   156: getfield o0 : Ljava/util/ArrayList;
    //   159: invokevirtual size : ()I
    //   162: iconst_1
    //   163: isub
    //   164: istore #10
    //   166: goto -> 172
    //   169: iconst_0
    //   170: istore #10
    //   172: aload_0
    //   173: aload_0
    //   174: getfield o0 : Ljava/util/ArrayList;
    //   177: iload #10
    //   179: invokevirtual get : (I)Ljava/lang/Object;
    //   182: checkcast java/lang/Float
    //   185: invokevirtual floatValue : ()F
    //   188: invokevirtual S : (F)F
    //   191: aload_0
    //   192: getfield G : I
    //   195: i2f
    //   196: fsub
    //   197: fstore #8
    //   199: aload_0
    //   200: getfield w0 : I
    //   203: i2f
    //   204: fstore #9
    //   206: fload #4
    //   208: fstore #7
    //   210: fload #8
    //   212: fload #9
    //   214: fload #4
    //   216: fsub
    //   217: fcmpl
    //   218: ifle -> 236
    //   221: fload #9
    //   223: fload #8
    //   225: fsub
    //   226: aload_0
    //   227: getfield P : I
    //   230: i2f
    //   231: invokestatic max : (FF)F
    //   234: fstore #7
    //   236: iload #5
    //   238: invokestatic y : (I)I
    //   241: istore #10
    //   243: iload #10
    //   245: iconst_1
    //   246: if_icmpeq -> 288
    //   249: iload #10
    //   251: iconst_2
    //   252: if_icmpeq -> 278
    //   255: iload #10
    //   257: iconst_3
    //   258: if_icmpeq -> 264
    //   261: goto -> 295
    //   264: aload_0
    //   265: getfield P : I
    //   268: i2f
    //   269: fstore #6
    //   271: fload #6
    //   273: fstore #7
    //   275: goto -> 295
    //   278: aload_0
    //   279: getfield P : I
    //   282: i2f
    //   283: fstore #6
    //   285: goto -> 295
    //   288: aload_0
    //   289: getfield P : I
    //   292: i2f
    //   293: fstore #7
    //   295: aload_2
    //   296: getstatic android/graphics/Paint$Style.FILL : Landroid/graphics/Paint$Style;
    //   299: invokevirtual setStyle : (Landroid/graphics/Paint$Style;)V
    //   302: aload_2
    //   303: getstatic android/graphics/Paint$Cap.BUTT : Landroid/graphics/Paint$Cap;
    //   306: invokevirtual setStrokeCap : (Landroid/graphics/Paint$Cap;)V
    //   309: aload_0
    //   310: getfield K : I
    //   313: ifle -> 321
    //   316: aload_2
    //   317: iconst_1
    //   318: invokevirtual setAntiAlias : (Z)V
    //   321: new android/graphics/RectF
    //   324: dup
    //   325: aload_3
    //   326: invokespecial <init> : (Landroid/graphics/RectF;)V
    //   329: astore #13
    //   331: aload_0
    //   332: invokevirtual u : ()Z
    //   335: istore #11
    //   337: aload_0
    //   338: getfield M0 : Landroid/graphics/Matrix;
    //   341: astore #14
    //   343: iload #11
    //   345: ifeq -> 356
    //   348: aload #14
    //   350: aload #13
    //   352: invokevirtual mapRect : (Landroid/graphics/RectF;)Z
    //   355: pop
    //   356: aload_0
    //   357: getfield E0 : Landroid/graphics/Path;
    //   360: astore #12
    //   362: aload #12
    //   364: invokevirtual reset : ()V
    //   367: aload_3
    //   368: invokevirtual width : ()F
    //   371: fload #6
    //   373: fload #7
    //   375: fadd
    //   376: fcmpl
    //   377: iflt -> 503
    //   380: aload_0
    //   381: invokevirtual u : ()Z
    //   384: ifeq -> 437
    //   387: bipush #8
    //   389: newarray float
    //   391: astore_3
    //   392: aload_3
    //   393: iconst_0
    //   394: fload #6
    //   396: fastore
    //   397: aload_3
    //   398: iconst_1
    //   399: fload #6
    //   401: fastore
    //   402: aload_3
    //   403: iconst_2
    //   404: fload #6
    //   406: fastore
    //   407: aload_3
    //   408: iconst_3
    //   409: fload #6
    //   411: fastore
    //   412: aload_3
    //   413: iconst_4
    //   414: fload #7
    //   416: fastore
    //   417: aload_3
    //   418: iconst_5
    //   419: fload #7
    //   421: fastore
    //   422: aload_3
    //   423: bipush #6
    //   425: fload #7
    //   427: fastore
    //   428: aload_3
    //   429: bipush #7
    //   431: fload #7
    //   433: fastore
    //   434: goto -> 484
    //   437: bipush #8
    //   439: newarray float
    //   441: astore_3
    //   442: aload_3
    //   443: iconst_0
    //   444: fload #6
    //   446: fastore
    //   447: aload_3
    //   448: iconst_1
    //   449: fload #6
    //   451: fastore
    //   452: aload_3
    //   453: iconst_2
    //   454: fload #7
    //   456: fastore
    //   457: aload_3
    //   458: iconst_3
    //   459: fload #7
    //   461: fastore
    //   462: aload_3
    //   463: iconst_4
    //   464: fload #7
    //   466: fastore
    //   467: aload_3
    //   468: iconst_5
    //   469: fload #7
    //   471: fastore
    //   472: aload_3
    //   473: bipush #6
    //   475: fload #6
    //   477: fastore
    //   478: aload_3
    //   479: bipush #7
    //   481: fload #6
    //   483: fastore
    //   484: aload #12
    //   486: aload #13
    //   488: aload_3
    //   489: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   492: invokevirtual addRoundRect : (Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V
    //   495: aload_1
    //   496: aload #12
    //   498: aload_2
    //   499: invokevirtual drawPath : (Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   502: return
    //   503: fload #6
    //   505: fload #7
    //   507: invokestatic min : (FF)F
    //   510: fstore #4
    //   512: fload #6
    //   514: fload #7
    //   516: invokestatic max : (FF)F
    //   519: fstore #6
    //   521: aload_1
    //   522: invokevirtual save : ()I
    //   525: pop
    //   526: aload #12
    //   528: aload #13
    //   530: fload #4
    //   532: fload #4
    //   534: getstatic android/graphics/Path$Direction.CW : Landroid/graphics/Path$Direction;
    //   537: invokevirtual addRoundRect : (Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V
    //   540: aload_1
    //   541: aload #12
    //   543: invokevirtual clipPath : (Landroid/graphics/Path;)Z
    //   546: pop
    //   547: iload #5
    //   549: invokestatic y : (I)I
    //   552: istore #5
    //   554: aload_0
    //   555: getfield I0 : Landroid/graphics/RectF;
    //   558: astore #12
    //   560: iload #5
    //   562: iconst_1
    //   563: if_icmpeq -> 633
    //   566: iload #5
    //   568: iconst_2
    //   569: if_icmpeq -> 602
    //   572: aload #12
    //   574: aload_3
    //   575: invokevirtual centerX : ()F
    //   578: fload #6
    //   580: fsub
    //   581: aload_3
    //   582: getfield top : F
    //   585: aload_3
    //   586: invokevirtual centerX : ()F
    //   589: fload #6
    //   591: fadd
    //   592: aload_3
    //   593: getfield bottom : F
    //   596: invokevirtual set : (FFFF)V
    //   599: goto -> 661
    //   602: aload_3
    //   603: getfield right : F
    //   606: fstore #4
    //   608: aload #12
    //   610: fload #4
    //   612: fconst_2
    //   613: fload #6
    //   615: fmul
    //   616: fsub
    //   617: aload_3
    //   618: getfield top : F
    //   621: fload #4
    //   623: aload_3
    //   624: getfield bottom : F
    //   627: invokevirtual set : (FFFF)V
    //   630: goto -> 661
    //   633: aload_3
    //   634: getfield left : F
    //   637: fstore #4
    //   639: aload #12
    //   641: fload #4
    //   643: aload_3
    //   644: getfield top : F
    //   647: fconst_2
    //   648: fload #6
    //   650: fmul
    //   651: fload #4
    //   653: fadd
    //   654: aload_3
    //   655: getfield bottom : F
    //   658: invokevirtual set : (FFFF)V
    //   661: aload_0
    //   662: invokevirtual u : ()Z
    //   665: ifeq -> 676
    //   668: aload #14
    //   670: aload #12
    //   672: invokevirtual mapRect : (Landroid/graphics/RectF;)Z
    //   675: pop
    //   676: aload_1
    //   677: aload #12
    //   679: fload #6
    //   681: fload #6
    //   683: aload_2
    //   684: invokevirtual drawRoundRect : (Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    //   687: aload_1
    //   688: invokevirtual restore : ()V
    //   691: return
  }
  
  public final void L() {
    Drawable drawable = this.T;
    if (drawable != null) {
      if (!this.U && this.V != null) {
        this.T = drawable.mutate();
        this.U = true;
      } 
      if (this.U)
        this.T.setTintList(this.V); 
    } 
  }
  
  public final void M() {
    Drawable drawable = this.R;
    if (drawable != null) {
      if (!this.S && this.V != null) {
        this.R = drawable.mutate();
        this.S = true;
      } 
      if (this.S)
        this.R.setTintList(this.V); 
    } 
  }
  
  public final void N() {
    Drawable drawable = this.b0;
    if (drawable != null) {
      if (!this.c0 && this.d0 != null) {
        this.b0 = drawable.mutate();
        this.c0 = true;
      } 
      if (this.c0)
        this.b0.setTintList(this.d0); 
    } 
  }
  
  public final void O() {
    Drawable drawable = this.W;
    if (drawable != null) {
      if (!this.a0 && this.d0 != null) {
        this.W = drawable.mutate();
        this.a0 = true;
      } 
      if (this.a0)
        this.W.setTintList(this.d0); 
    } 
  }
  
  public final void P(boolean paramBoolean) {
    if (u()) {
      j = getPaddingLeft();
      i = getPaddingRight();
    } else {
      j = getPaddingTop();
      i = getPaddingBottom();
    } 
    int j = i + j;
    int i = this.F;
    int k = this.I;
    i = Math.max(this.C, Math.max(i + j, k + j));
    j = this.D;
    k = 1;
    if (i == j) {
      i = 0;
    } else {
      this.D = i;
      i = 1;
    } 
    int m = Math.max(this.H / 2 - this.v, 0);
    int i1 = Math.max((this.F - this.w) / 2, 0);
    int n = Math.max(this.u0 - this.x, 0);
    j = Math.max(this.v0 - this.y, 0);
    j = Math.max(Math.max(m, i1), Math.max(n, j)) + this.u;
    if (this.G == j) {
      j = 0;
    } else {
      this.G = j;
      j = k;
      if (isLaidOut()) {
        if (u()) {
          j = getHeight();
        } else {
          j = getWidth();
        } 
        this.w0 = Math.max(j - this.G * 2, 0);
        I();
        j = k;
      } 
    } 
    if (u()) {
      float f = e();
      Matrix matrix = this.M0;
      matrix.reset();
      matrix.setRotate(90.0F, f, f);
    } 
    if (i != 0 || paramBoolean) {
      requestLayout();
      return;
    } 
    if (j != 0)
      postInvalidate(); 
  }
  
  public final void Q() {
    if (this.y0) {
      float f2 = this.m0;
      float f1 = this.n0;
      if (f2 < f1) {
        ArrayList<Object> arrayList = this.o0;
        int j = arrayList.size();
        int i = 0;
        while (true) {
          String str = GMDx.cVUQL;
          if (i < j) {
            Float float_ = (Float)arrayList.get(i);
            int k = i + 1;
            float_ = float_;
            if (float_.floatValue() >= this.m0) {
              if (float_.floatValue() <= this.n0) {
                i = k;
                if (this.r0 > 0.0F) {
                  if (R(float_.floatValue())) {
                    i = k;
                    continue;
                  } 
                  f1 = this.m0;
                  f2 = this.r0;
                  StringBuilder stringBuilder1 = new StringBuilder("Value(");
                  stringBuilder1.append(float_);
                  stringBuilder1.append(") must be equal to valueFrom(");
                  stringBuilder1.append(f1);
                  stringBuilder1.append(") plus a multiple of stepSize(");
                  stringBuilder1.append(f2);
                  stringBuilder1.append(str);
                  stringBuilder1.append(f2);
                  stringBuilder1.append(")");
                  throw new IllegalStateException(stringBuilder1.toString());
                } 
                continue;
              } 
              continue;
            } 
            f1 = this.m0;
            f2 = this.n0;
            stringBuilder = new StringBuilder("Slider value(");
            stringBuilder.append(float_);
            stringBuilder.append(") must be greater or equal to valueFrom(");
            stringBuilder.append(f1);
            stringBuilder.append("), and lower or equal to valueTo(");
            stringBuilder.append(f2);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
          } 
          if (this.r0 <= 0.0F || R(this.n0)) {
            f1 = getMinSeparation();
            if (f1 >= 0.0F) {
              f2 = this.r0;
              if (f2 > 0.0F && f1 > 0.0F)
                if (this.R0 == 1) {
                  if (f1 < f2 || !q(f1)) {
                    f2 = this.r0;
                    StringBuilder stringBuilder1 = new StringBuilder("minSeparation(");
                    stringBuilder1.append(f1);
                    stringBuilder1.append(") must be greater or equal and a multiple of stepSize(");
                    stringBuilder1.append(f2);
                    stringBuilder1.append((String)stringBuilder);
                    stringBuilder1.append(f2);
                    stringBuilder1.append(")");
                    throw new IllegalStateException(stringBuilder1.toString());
                  } 
                } else {
                  l0.g("minSeparation(", f1, ") cannot be set as a dimension when using stepSize(", f2);
                  return;
                }  
              f1 = this.r0;
              if (f1 != 0.0F) {
                if ((int)f1 != f1) {
                  stringBuilder = new StringBuilder("Floating point value used for stepSize(");
                  stringBuilder.append(f1);
                  stringBuilder.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("yd", stringBuilder.toString());
                } 
                f1 = this.m0;
                if ((int)f1 != f1) {
                  stringBuilder = new StringBuilder("Floating point value used for valueFrom(");
                  stringBuilder.append(f1);
                  stringBuilder.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("yd", stringBuilder.toString());
                } 
                f1 = this.n0;
                if ((int)f1 != f1) {
                  stringBuilder = new StringBuilder("Floating point value used for valueTo(");
                  stringBuilder.append(f1);
                  stringBuilder.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("yd", stringBuilder.toString());
                } 
              } 
              this.y0 = false;
              return;
            } 
            stringBuilder = new StringBuilder("minSeparation(");
            stringBuilder.append(f1);
            stringBuilder.append(") must be greater or equal to 0");
            throw new IllegalStateException(stringBuilder.toString());
          } 
          float f = this.r0;
          f2 = this.m0;
          f1 = this.n0;
          StringBuilder stringBuilder = new StringBuilder("The stepSize(");
          stringBuilder.append(f);
          stringBuilder.append(") must be 0, or a factor of the valueFrom(");
          stringBuilder.append(f2);
          stringBuilder.append(")-valueTo(");
          stringBuilder.append(f1);
          stringBuilder.append(") range");
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
      l0.g("valueFrom(", f2, ") must be smaller than valueTo(", f1);
    } 
  }
  
  public final boolean R(float paramFloat) {
    return q((new BigDecimal(Float.toString(paramFloat))).subtract(new BigDecimal(Float.toString(this.m0)), MathContext.DECIMAL64).doubleValue());
  }
  
  public final float S(float paramFloat) {
    return x(paramFloat) * this.w0 + this.G;
  }
  
  public final void a(cd paramcd) {
    this.o.add(paramcd);
  }
  
  public final void b(dd paramdd) {
    this.p.add(paramdd);
  }
  
  public final void c(Drawable paramDrawable) {
    int j = paramDrawable.getIntrinsicWidth();
    int i = paramDrawable.getIntrinsicHeight();
    if (j == -1 && i == -1) {
      paramDrawable.setBounds(0, 0, this.H, this.I);
      return;
    } 
    float f = Math.max(this.H, this.I) / Math.max(j, i);
    paramDrawable.setBounds(0, 0, (int)(j * f), (int)(i * f));
  }
  
  public final void d(Canvas paramCanvas, RectF paramRectF, Drawable paramDrawable, boolean paramBoolean) {
    if (paramDrawable != null) {
      int i = this.e0;
      float f1 = paramRectF.right;
      float f2 = paramRectF.left;
      int j = this.f0;
      float f3 = (j * 2 + i);
      RectF rectF = this.K0;
      if (f1 - f2 >= f3) {
        boolean bool;
        if (t() || u()) {
          bool = true;
        } else {
          bool = false;
        } 
        if (paramBoolean ^ bool) {
          f1 = paramRectF.left + j;
        } else {
          f1 = paramRectF.right - j - i;
        } 
        f3 = e();
        f2 = i;
        f3 -= f2 / 2.0F;
        rectF.set(f1, f3, f1 + f2, f2 + f3);
      } else {
        rectF.setEmpty();
      } 
      if (!rectF.isEmpty()) {
        if (u())
          this.M0.mapRect(rectF); 
        Rect rect = this.L0;
        rectF.round(rect);
        paramDrawable.setBounds(rect);
        paramDrawable.draw(paramCanvas);
      } 
    } 
  }
  
  public final boolean dispatchHoverEvent(MotionEvent paramMotionEvent) {
    return (this.j.l(paramMotionEvent) || super.dispatchHoverEvent(paramMotionEvent));
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    int i = p(this.D0);
    this.b.setColor(i);
    i = p(this.C0);
    this.c.setColor(i);
    i = p(this.B0);
    this.g.setColor(i);
    i = p(this.A0);
    this.h.setColor(i);
    i = p(this.B0);
    this.i.setColor(i);
    ArrayList<Object> arrayList = this.n;
    int j = arrayList.size();
    i = 0;
    while (i < j) {
      qv1 qv1 = (qv1)arrayList.get(i);
      int k = i + 1;
      qv1 = qv1;
      i = k;
      if (qv1.isStateful()) {
        qv1.setState(getDrawableState());
        i = k;
      } 
    } 
    ws0 ws01 = this.N0;
    if (ws01.isStateful())
      ws01.setState(getDrawableState()); 
    i = p(this.z0);
    Paint paint = this.f;
    paint.setColor(i);
    paint.setAlpha(63);
  }
  
  public final int e() {
    int j = this.D / 2;
    int k = this.E;
    int i = 0;
    if (k == 1 || k == 3)
      i = ((qv1)this.n.get(0)).getIntrinsicHeight(); 
    return j + i;
  }
  
  public final ValueAnimator f(boolean paramBoolean) {
    float f1;
    int i;
    ValueAnimator valueAnimator1;
    TimeInterpolator timeInterpolator;
    float f3 = 1.0F;
    if (paramBoolean) {
      f1 = 0.0F;
    } else {
      f1 = 1.0F;
    } 
    if (paramBoolean) {
      valueAnimator1 = this.s;
    } else {
      valueAnimator1 = this.r;
    } 
    float f2 = f1;
    if (valueAnimator1 != null) {
      f2 = f1;
      if (valueAnimator1.isRunning()) {
        f2 = ((Float)valueAnimator1.getAnimatedValue()).floatValue();
        valueAnimator1.cancel();
      } 
    } 
    if (paramBoolean) {
      f1 = f3;
    } else {
      f1 = 0.0F;
    } 
    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[] { f2, f1 });
    if (paramBoolean) {
      i = zo2.P(getContext(), 2130969689, 83);
      timeInterpolator = zo2.Q(getContext(), 2130969699, (TimeInterpolator)g5.e);
    } else {
      i = zo2.P(getContext(), 2130969692, 117);
      timeInterpolator = zo2.Q(getContext(), 2130969697, (TimeInterpolator)g5.c);
    } 
    valueAnimator2.setDuration(i);
    valueAnimator2.setInterpolator(timeInterpolator);
    valueAnimator2.addUpdateListener(new pd(0, this));
    return valueAnimator2;
  }
  
  public final void g(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Canvas paramCanvas, RectF paramRectF, int paramInt) {
    if (paramFloat2 - paramFloat1 > (getTrackCornerSize() - this.K)) {
      paramRectF.set(paramFloat1, paramFloat3, paramFloat2, paramFloat4);
    } else {
      paramRectF.setEmpty();
    } 
    paramFloat1 = getTrackCornerSize();
    K(paramCanvas, this.b, paramRectF, paramFloat1, paramInt);
  }
  
  public final int getAccessibilityFocusedVirtualViewId() {
    return this.j.k;
  }
  
  public float getMinSeparation() {
    return 0.0F;
  }
  
  public abstract int getThumbRadius();
  
  public abstract int getTrackCornerSize();
  
  public abstract float getValueFrom();
  
  public abstract float getValueTo();
  
  public List<Float> getValues() {
    return new ArrayList<Float>(this.o0);
  }
  
  public final void h(Canvas paramCanvas, float paramFloat1, float paramFloat2) {
    ArrayList<Object> arrayList = this.o0;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      Float float_ = (Float)arrayList.get(i);
      int k = i + 1;
      float f1 = S(((Float)float_).floatValue());
      float f2 = this.K;
      f2 = this.H / 2.0F + f2;
      i = k;
      if (paramFloat1 >= f1 - f2) {
        i = k;
        if (paramFloat1 <= f1 + f2)
          return; 
      } 
    } 
    boolean bool = u();
    Paint paint = this.i;
    if (bool) {
      paramCanvas.drawPoint(paramFloat2, paramFloat1, paint);
      return;
    } 
    paramCanvas.drawPoint(paramFloat1, paramFloat2, paint);
  }
  
  public final void i(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat, Drawable paramDrawable) {
    paramCanvas.save();
    if (u())
      paramCanvas.concat(this.M0); 
    paramCanvas.translate((this.G + (int)(x(paramFloat) * paramInt1)) - paramDrawable.getBounds().width() / 2.0F, paramInt2 - paramDrawable.getBounds().height() / 2.0F);
    paramDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public final void j(Canvas paramCanvas, int paramInt1, int paramInt2, Paint paramPaint) {
    while (paramInt1 < paramInt2) {
      float f1;
      boolean bool = u();
      float[] arrayOfFloat2 = this.s0;
      if (bool) {
        f1 = arrayOfFloat2[paramInt1 + 1];
      } else {
        f1 = arrayOfFloat2[paramInt1];
      } 
      float f2 = this.K;
      f2 = this.H / 2.0F + f2;
      Iterator<Float> iterator = this.o0.iterator();
      if (iterator.hasNext()) {
        float f = S(((Float)iterator.next()).floatValue());
        if (f1 >= f - f2 && f1 <= f + f2)
          continue; 
      } 
      if (this.Q) {
        f2 = this.K;
        float f = this.H / 2.0F + f2;
        int i = this.w0;
        f2 = (this.G * 2 + i) / 2.0F;
        if (f1 >= f2 - f && f1 <= f2 + f)
          continue; 
      } 
      float[] arrayOfFloat1 = this.s0;
      paramCanvas.drawPoint(arrayOfFloat1[paramInt1], arrayOfFloat1[paramInt1 + 1], paramPaint);
      continue;
      paramInt1 += 2;
    } 
  }
  
  public final void k(Canvas paramCanvas, RectF paramRectF1, RectF paramRectF2) {
    if (this.R != null || this.T != null || this.W != null || this.b0 != null) {
      if (this.o0.size() > 1)
        Log.w("yd", "Track icons can only be used when only 1 thumb is present."); 
      d(paramCanvas, paramRectF1, this.R, true);
      d(paramCanvas, paramRectF2, this.W, true);
      d(paramCanvas, paramRectF1, this.T, false);
      d(paramCanvas, paramRectF2, this.b0, false);
      return;
    } 
  }
  
  public final void l() {
    if (!this.q) {
      this.q = true;
      ValueAnimator valueAnimator = f(true);
      this.r = valueAnimator;
      this.s = null;
      valueAnimator.start();
    } 
    ArrayList arrayList = this.n;
    Iterator<qv1> iterator = arrayList.iterator();
    for (byte b = 0; b < this.o0.size() && iterator.hasNext(); b++) {
      if (b != this.q0)
        A(iterator.next(), ((Float)this.o0.get(b)).floatValue()); 
    } 
    if (iterator.hasNext()) {
      A(iterator.next(), ((Float)this.o0.get(this.q0)).floatValue());
      return;
    } 
    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[] { Integer.valueOf(arrayList.size()), Integer.valueOf(this.o0.size()) }));
  }
  
  public final void m() {
    if (this.q) {
      this.q = false;
      ValueAnimator valueAnimator = f(false);
      this.s = valueAnimator;
      this.r = null;
      valueAnimator.addListener((Animator.AnimatorListener)new j1(2, this));
      this.s.start();
    } 
  }
  
  public final String n(float paramFloat) {
    String str;
    nl0 nl01 = this.k0;
    if (nl01 != null)
      return nl01.e(paramFloat); 
    if ((int)paramFloat == paramFloat) {
      str = "%.0f";
    } else {
      str = "%.2f";
    } 
    return String.format(str, new Object[] { Float.valueOf(paramFloat) });
  }
  
  public final float[] o() {
    float f1 = ((Float)this.o0.get(0)).floatValue();
    ArrayList<Float> arrayList = this.o0;
    float f3 = ((Float)arrayList.get(arrayList.size() - 1)).floatValue();
    if (this.o0.size() == 1)
      f1 = this.m0; 
    float f2 = x(f1);
    f3 = x(f3);
    f1 = f3;
    if (this.Q) {
      f2 = Math.min(0.5F, f3);
      f1 = Math.max(0.5F, f3);
    } 
    return (!this.Q && (t() || u())) ? new float[] { f1, f2 } : new float[] { f2, f1 };
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.W0 = isShown();
    getViewTreeObserver().addOnScrollChangedListener(this.T0);
    getViewTreeObserver().addOnGlobalLayoutListener(this.U0);
    ArrayList<Object> arrayList = this.n;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      qv1 qv11 = (qv1)arrayList.get(b);
      b++;
      qv1 qv12 = qv11;
      ViewGroup viewGroup = n21.z(this);
      qv12.getClass();
      if (viewGroup == null)
        continue; 
      int[] arrayOfInt = new int[2];
      viewGroup.getLocationOnScreen(arrayOfInt);
      qv12.V = arrayOfInt[0];
      viewGroup.getWindowVisibleDisplayFrame(qv12.O);
      viewGroup.addOnLayoutChangeListener(qv12.N);
    } 
  }
  
  public final void onDetachedFromWindow() {
    sd sd1 = this.l;
    if (sd1 != null)
      removeCallbacks(sd1); 
    byte b = 0;
    this.q = false;
    ArrayList<Object> arrayList = this.n;
    int i = arrayList.size();
    while (b < i) {
      qv1 qv1 = (qv1)arrayList.get(b);
      b++;
      qv1 = qv1;
      ViewGroup viewGroup = n21.z(this);
      if (viewGroup == null)
        continue; 
      viewGroup.getOverlay().remove(qv1);
      viewGroup.removeOnLayoutChangeListener(qv1.N);
    } 
    getViewTreeObserver().removeOnScrollChangedListener(this.T0);
    getViewTreeObserver().removeOnGlobalLayoutListener(this.U0);
    super.onDetachedFromWindow();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y0 : Z
    //   4: ifeq -> 15
    //   7: aload_0
    //   8: invokevirtual Q : ()V
    //   11: aload_0
    //   12: invokevirtual I : ()V
    //   15: aload_0
    //   16: aload_1
    //   17: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   20: aload_0
    //   21: invokevirtual e : ()I
    //   24: istore #15
    //   26: aload_0
    //   27: getfield w0 : I
    //   30: istore #12
    //   32: aload_0
    //   33: invokevirtual o : ()[F
    //   36: astore #19
    //   38: iload #15
    //   40: i2f
    //   41: fstore #7
    //   43: aload_0
    //   44: getfield F : I
    //   47: i2f
    //   48: fstore_2
    //   49: fconst_2
    //   50: fstore #6
    //   52: fload_2
    //   53: fconst_2
    //   54: fdiv
    //   55: fstore_3
    //   56: fload #7
    //   58: fload_3
    //   59: fsub
    //   60: fstore_2
    //   61: fload_3
    //   62: fload #7
    //   64: fadd
    //   65: fstore #4
    //   67: aload_0
    //   68: getfield G : I
    //   71: aload_0
    //   72: invokevirtual getTrackCornerSize : ()I
    //   75: isub
    //   76: i2f
    //   77: fstore #9
    //   79: aload_0
    //   80: getfield G : I
    //   83: i2f
    //   84: fstore #8
    //   86: iconst_0
    //   87: istore #16
    //   89: aload #19
    //   91: iconst_0
    //   92: faload
    //   93: fstore #10
    //   95: iload #12
    //   97: i2f
    //   98: fstore_3
    //   99: aload_0
    //   100: getfield K : I
    //   103: i2f
    //   104: fstore #5
    //   106: aload_0
    //   107: getfield G0 : Landroid/graphics/RectF;
    //   110: astore #18
    //   112: aload_0
    //   113: fload #9
    //   115: fload #10
    //   117: fload_3
    //   118: fmul
    //   119: fload #8
    //   121: fadd
    //   122: fload #5
    //   124: fsub
    //   125: fload_2
    //   126: fload #4
    //   128: aload_1
    //   129: aload #18
    //   131: iconst_2
    //   132: invokevirtual g : (FFFFLandroid/graphics/Canvas;Landroid/graphics/RectF;I)V
    //   135: aload_0
    //   136: getfield G : I
    //   139: istore #11
    //   141: iload #11
    //   143: i2f
    //   144: fstore #10
    //   146: aload #19
    //   148: iconst_1
    //   149: faload
    //   150: fstore #5
    //   152: aload_0
    //   153: getfield K : I
    //   156: i2f
    //   157: fstore #8
    //   159: aload_0
    //   160: invokevirtual getTrackCornerSize : ()I
    //   163: iload #11
    //   165: iload #12
    //   167: iadd
    //   168: iadd
    //   169: i2f
    //   170: fstore #9
    //   172: aload_0
    //   173: getfield H0 : Landroid/graphics/RectF;
    //   176: astore #21
    //   178: iconst_3
    //   179: istore #13
    //   181: iconst_1
    //   182: istore #12
    //   184: iconst_1
    //   185: istore #14
    //   187: aload_0
    //   188: fload #5
    //   190: fload_3
    //   191: fmul
    //   192: fload #10
    //   194: fadd
    //   195: fload #8
    //   197: fadd
    //   198: fload #9
    //   200: fload_2
    //   201: fload #4
    //   203: aload_1
    //   204: aload #21
    //   206: iconst_3
    //   207: invokevirtual g : (FFFFLandroid/graphics/Canvas;Landroid/graphics/RectF;I)V
    //   210: aload_0
    //   211: getfield w0 : I
    //   214: istore #11
    //   216: aload_0
    //   217: invokevirtual o : ()[F
    //   220: astore #20
    //   222: aload_0
    //   223: getfield G : I
    //   226: i2f
    //   227: fstore_3
    //   228: aload #20
    //   230: iconst_1
    //   231: faload
    //   232: fstore_2
    //   233: iload #11
    //   235: i2f
    //   236: fstore #4
    //   238: fload_2
    //   239: fload #4
    //   241: fmul
    //   242: fload_3
    //   243: fadd
    //   244: fstore_2
    //   245: aload #20
    //   247: iconst_0
    //   248: faload
    //   249: fload #4
    //   251: fmul
    //   252: fload_3
    //   253: fadd
    //   254: fstore_3
    //   255: fload_2
    //   256: fstore #4
    //   258: aload_0
    //   259: getfield F0 : Landroid/graphics/RectF;
    //   262: astore #19
    //   264: fload_3
    //   265: fload_2
    //   266: fcmpl
    //   267: iflt -> 281
    //   270: aload #19
    //   272: invokevirtual setEmpty : ()V
    //   275: fload #6
    //   277: fstore_2
    //   278: goto -> 681
    //   281: aload_0
    //   282: getfield o0 : Ljava/util/ArrayList;
    //   285: invokevirtual size : ()I
    //   288: iconst_1
    //   289: if_icmpne -> 330
    //   292: aload_0
    //   293: getfield Q : Z
    //   296: ifne -> 330
    //   299: iload #13
    //   301: istore #11
    //   303: aload_0
    //   304: invokevirtual t : ()Z
    //   307: ifne -> 333
    //   310: aload_0
    //   311: invokevirtual u : ()Z
    //   314: ifeq -> 324
    //   317: iload #13
    //   319: istore #11
    //   321: goto -> 333
    //   324: iconst_2
    //   325: istore #11
    //   327: goto -> 333
    //   330: iconst_4
    //   331: istore #11
    //   333: iconst_0
    //   334: istore #13
    //   336: iload #12
    //   338: istore #14
    //   340: fload #6
    //   342: fstore_2
    //   343: iload #13
    //   345: aload_0
    //   346: getfield o0 : Ljava/util/ArrayList;
    //   349: invokevirtual size : ()I
    //   352: if_icmpge -> 278
    //   355: fload_3
    //   356: fstore_2
    //   357: aload_0
    //   358: getfield o0 : Ljava/util/ArrayList;
    //   361: invokevirtual size : ()I
    //   364: iload #12
    //   366: if_icmple -> 451
    //   369: iload #13
    //   371: ifle -> 400
    //   374: aload_0
    //   375: aload_0
    //   376: getfield o0 : Ljava/util/ArrayList;
    //   379: iload #13
    //   381: iconst_1
    //   382: isub
    //   383: invokevirtual get : (I)Ljava/lang/Object;
    //   386: checkcast java/lang/Float
    //   389: invokevirtual floatValue : ()F
    //   392: invokevirtual S : (F)F
    //   395: fstore #4
    //   397: goto -> 403
    //   400: fload_3
    //   401: fstore #4
    //   403: aload_0
    //   404: aload_0
    //   405: getfield o0 : Ljava/util/ArrayList;
    //   408: iload #13
    //   410: invokevirtual get : (I)Ljava/lang/Object;
    //   413: checkcast java/lang/Float
    //   416: invokevirtual floatValue : ()F
    //   419: invokevirtual S : (F)F
    //   422: fstore_3
    //   423: aload_0
    //   424: invokevirtual t : ()Z
    //   427: ifne -> 449
    //   430: aload_0
    //   431: invokevirtual u : ()Z
    //   434: ifeq -> 440
    //   437: goto -> 449
    //   440: fload #4
    //   442: fstore_2
    //   443: fload_3
    //   444: fstore #4
    //   446: goto -> 451
    //   449: fload_3
    //   450: fstore_2
    //   451: aload_0
    //   452: invokevirtual getTrackCornerSize : ()I
    //   455: istore #17
    //   457: iload #11
    //   459: invokestatic y : (I)I
    //   462: istore #14
    //   464: iload #14
    //   466: iload #12
    //   468: if_icmpeq -> 600
    //   471: iload #14
    //   473: iconst_2
    //   474: if_icmpeq -> 581
    //   477: iload #14
    //   479: iconst_3
    //   480: if_icmpeq -> 492
    //   483: fload_2
    //   484: fstore_3
    //   485: fload #4
    //   487: fstore #5
    //   489: goto -> 518
    //   492: aload_0
    //   493: getfield Q : Z
    //   496: ifne -> 521
    //   499: aload_0
    //   500: getfield K : I
    //   503: i2f
    //   504: fstore #5
    //   506: fload_2
    //   507: fload #5
    //   509: fadd
    //   510: fstore_3
    //   511: fload #4
    //   513: fload #5
    //   515: fsub
    //   516: fstore #5
    //   518: goto -> 615
    //   521: aload #20
    //   523: iload #12
    //   525: faload
    //   526: ldc_w 0.5
    //   529: fcmpl
    //   530: ifne -> 548
    //   533: fload_2
    //   534: aload_0
    //   535: getfield K : I
    //   538: i2f
    //   539: fadd
    //   540: fstore_3
    //   541: fload #4
    //   543: fstore #5
    //   545: goto -> 518
    //   548: fload_2
    //   549: fstore_3
    //   550: fload #4
    //   552: fstore #5
    //   554: aload #20
    //   556: iconst_0
    //   557: faload
    //   558: ldc_w 0.5
    //   561: fcmpl
    //   562: ifne -> 518
    //   565: aload_0
    //   566: getfield K : I
    //   569: istore #14
    //   571: iload #14
    //   573: i2f
    //   574: fstore #5
    //   576: fload_2
    //   577: fstore_3
    //   578: goto -> 511
    //   581: fload_2
    //   582: aload_0
    //   583: getfield K : I
    //   586: i2f
    //   587: fadd
    //   588: fstore_3
    //   589: fload #4
    //   591: iload #17
    //   593: i2f
    //   594: fadd
    //   595: fstore #5
    //   597: goto -> 518
    //   600: fload_2
    //   601: iload #17
    //   603: i2f
    //   604: fsub
    //   605: fstore_2
    //   606: aload_0
    //   607: getfield K : I
    //   610: istore #14
    //   612: goto -> 571
    //   615: fload_3
    //   616: fload #5
    //   618: fcmpl
    //   619: iflt -> 630
    //   622: aload #19
    //   624: invokevirtual setEmpty : ()V
    //   627: goto -> 671
    //   630: aload_0
    //   631: getfield F : I
    //   634: i2f
    //   635: fload #6
    //   637: fdiv
    //   638: fstore_2
    //   639: aload #19
    //   641: fload_3
    //   642: fload #7
    //   644: fload_2
    //   645: fsub
    //   646: fload #5
    //   648: fload_2
    //   649: fload #7
    //   651: fadd
    //   652: invokevirtual set : (FFFF)V
    //   655: aload_0
    //   656: aload_1
    //   657: aload_0
    //   658: getfield c : Landroid/graphics/Paint;
    //   661: aload #19
    //   663: iload #17
    //   665: i2f
    //   666: iload #11
    //   668: invokevirtual K : (Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/RectF;FI)V
    //   671: iinc #13, 1
    //   674: fload #5
    //   676: fstore #4
    //   678: goto -> 336
    //   681: aload_0
    //   682: invokevirtual t : ()Z
    //   685: ifne -> 710
    //   688: aload_0
    //   689: invokevirtual u : ()Z
    //   692: ifeq -> 698
    //   695: goto -> 710
    //   698: aload_0
    //   699: aload_1
    //   700: aload #19
    //   702: aload #21
    //   704: invokevirtual k : (Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    //   707: goto -> 719
    //   710: aload_0
    //   711: aload_1
    //   712: aload #19
    //   714: aload #18
    //   716: invokevirtual k : (Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    //   719: aload_0
    //   720: getfield s0 : [F
    //   723: astore #18
    //   725: aload #18
    //   727: ifnull -> 877
    //   730: aload #18
    //   732: arraylength
    //   733: ifne -> 739
    //   736: goto -> 877
    //   739: aload_0
    //   740: invokevirtual o : ()[F
    //   743: astore #18
    //   745: aload #18
    //   747: iconst_0
    //   748: faload
    //   749: fstore_3
    //   750: aload_0
    //   751: getfield s0 : [F
    //   754: arraylength
    //   755: i2f
    //   756: fload_2
    //   757: fdiv
    //   758: fconst_1
    //   759: fsub
    //   760: fload_3
    //   761: fmul
    //   762: f2d
    //   763: invokestatic ceil : (D)D
    //   766: d2i
    //   767: istore #12
    //   769: aload #18
    //   771: iload #14
    //   773: faload
    //   774: fstore_3
    //   775: aload_0
    //   776: getfield s0 : [F
    //   779: arraylength
    //   780: i2f
    //   781: fload_2
    //   782: fdiv
    //   783: fconst_1
    //   784: fsub
    //   785: fload_3
    //   786: fmul
    //   787: f2d
    //   788: invokestatic floor : (D)D
    //   791: d2i
    //   792: istore #11
    //   794: aload_0
    //   795: getfield g : Landroid/graphics/Paint;
    //   798: astore #19
    //   800: iload #12
    //   802: ifle -> 817
    //   805: aload_0
    //   806: aload_1
    //   807: iconst_0
    //   808: iload #12
    //   810: iconst_2
    //   811: imul
    //   812: aload #19
    //   814: invokevirtual j : (Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    //   817: iload #12
    //   819: iload #11
    //   821: if_icmpgt -> 843
    //   824: aload_0
    //   825: aload_1
    //   826: iload #12
    //   828: iconst_2
    //   829: imul
    //   830: iload #11
    //   832: iconst_1
    //   833: iadd
    //   834: iconst_2
    //   835: imul
    //   836: aload_0
    //   837: getfield h : Landroid/graphics/Paint;
    //   840: invokevirtual j : (Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    //   843: iload #11
    //   845: iconst_1
    //   846: iadd
    //   847: iconst_2
    //   848: imul
    //   849: istore #11
    //   851: aload_0
    //   852: getfield s0 : [F
    //   855: astore #18
    //   857: iload #11
    //   859: aload #18
    //   861: arraylength
    //   862: if_icmpge -> 877
    //   865: aload_0
    //   866: aload_1
    //   867: iload #11
    //   869: aload #18
    //   871: arraylength
    //   872: aload #19
    //   874: invokevirtual j : (Landroid/graphics/Canvas;IILandroid/graphics/Paint;)V
    //   877: aload_0
    //   878: getfield N : I
    //   881: ifle -> 1001
    //   884: aload_0
    //   885: getfield o0 : Ljava/util/ArrayList;
    //   888: invokevirtual isEmpty : ()Z
    //   891: ifeq -> 897
    //   894: goto -> 1001
    //   897: aload_0
    //   898: getfield o0 : Ljava/util/ArrayList;
    //   901: astore #18
    //   903: aload #18
    //   905: aload #18
    //   907: invokevirtual size : ()I
    //   910: iconst_1
    //   911: isub
    //   912: invokevirtual get : (I)Ljava/lang/Object;
    //   915: checkcast java/lang/Float
    //   918: invokevirtual floatValue : ()F
    //   921: fstore_2
    //   922: aload_0
    //   923: getfield n0 : F
    //   926: fstore_3
    //   927: fload_2
    //   928: fload_3
    //   929: fcmpg
    //   930: ifge -> 945
    //   933: aload_0
    //   934: aload_1
    //   935: aload_0
    //   936: fload_3
    //   937: invokevirtual S : (F)F
    //   940: fload #7
    //   942: invokevirtual h : (Landroid/graphics/Canvas;FF)V
    //   945: aload_0
    //   946: getfield Q : Z
    //   949: ifne -> 986
    //   952: aload_0
    //   953: getfield o0 : Ljava/util/ArrayList;
    //   956: invokevirtual size : ()I
    //   959: iload #14
    //   961: if_icmple -> 1001
    //   964: aload_0
    //   965: getfield o0 : Ljava/util/ArrayList;
    //   968: iconst_0
    //   969: invokevirtual get : (I)Ljava/lang/Object;
    //   972: checkcast java/lang/Float
    //   975: invokevirtual floatValue : ()F
    //   978: aload_0
    //   979: getfield m0 : F
    //   982: fcmpl
    //   983: ifle -> 1001
    //   986: aload_0
    //   987: aload_1
    //   988: aload_0
    //   989: aload_0
    //   990: getfield m0 : F
    //   993: invokevirtual S : (F)F
    //   996: fload #7
    //   998: invokevirtual h : (Landroid/graphics/Canvas;FF)V
    //   1001: aload_0
    //   1002: getfield l0 : Z
    //   1005: ifne -> 1021
    //   1008: aload_0
    //   1009: invokevirtual isFocused : ()Z
    //   1012: ifeq -> 1018
    //   1015: goto -> 1021
    //   1018: goto -> 1185
    //   1021: aload_0
    //   1022: invokevirtual isEnabled : ()Z
    //   1025: ifeq -> 1018
    //   1028: aload_0
    //   1029: getfield w0 : I
    //   1032: istore #11
    //   1034: aload_0
    //   1035: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
    //   1038: instanceof android/graphics/drawable/RippleDrawable
    //   1041: ifne -> 1018
    //   1044: aload_0
    //   1045: getfield G : I
    //   1048: i2f
    //   1049: fstore_3
    //   1050: aload_0
    //   1051: aload_0
    //   1052: getfield o0 : Ljava/util/ArrayList;
    //   1055: aload_0
    //   1056: getfield q0 : I
    //   1059: invokevirtual get : (I)Ljava/lang/Object;
    //   1062: checkcast java/lang/Float
    //   1065: invokevirtual floatValue : ()F
    //   1068: invokevirtual x : (F)F
    //   1071: fstore #4
    //   1073: iload #11
    //   1075: i2f
    //   1076: fstore_2
    //   1077: iconst_2
    //   1078: newarray float
    //   1080: astore #18
    //   1082: aload #18
    //   1084: iconst_0
    //   1085: fload #4
    //   1087: fload_2
    //   1088: fmul
    //   1089: fload_3
    //   1090: fadd
    //   1091: fastore
    //   1092: aload #18
    //   1094: iconst_1
    //   1095: fload #7
    //   1097: fastore
    //   1098: aload_0
    //   1099: invokevirtual u : ()Z
    //   1102: ifeq -> 1114
    //   1105: aload_0
    //   1106: getfield M0 : Landroid/graphics/Matrix;
    //   1109: aload #18
    //   1111: invokevirtual mapPoints : ([F)V
    //   1114: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1117: bipush #28
    //   1119: if_icmpge -> 1164
    //   1122: aload #18
    //   1124: iconst_0
    //   1125: faload
    //   1126: fstore_2
    //   1127: aload_0
    //   1128: getfield J : I
    //   1131: i2f
    //   1132: fstore_3
    //   1133: aload #18
    //   1135: iconst_1
    //   1136: faload
    //   1137: fstore #4
    //   1139: aload_1
    //   1140: fload_2
    //   1141: fload_3
    //   1142: fsub
    //   1143: fload #4
    //   1145: fload_3
    //   1146: fsub
    //   1147: fload_2
    //   1148: fload_3
    //   1149: fadd
    //   1150: fload #4
    //   1152: fload_3
    //   1153: fadd
    //   1154: getstatic android/graphics/Region$Op.UNION : Landroid/graphics/Region$Op;
    //   1157: invokevirtual clipRect : (FFFFLandroid/graphics/Region$Op;)Z
    //   1160: pop
    //   1161: goto -> 1164
    //   1164: aload_1
    //   1165: aload #18
    //   1167: iconst_0
    //   1168: faload
    //   1169: aload #18
    //   1171: iconst_1
    //   1172: faload
    //   1173: aload_0
    //   1174: getfield J : I
    //   1177: i2f
    //   1178: aload_0
    //   1179: getfield f : Landroid/graphics/Paint;
    //   1182: invokevirtual drawCircle : (FFFLandroid/graphics/Paint;)V
    //   1185: aload_0
    //   1186: invokevirtual G : ()V
    //   1189: aload_0
    //   1190: getfield w0 : I
    //   1193: istore #13
    //   1195: iload #16
    //   1197: istore #11
    //   1199: iload #15
    //   1201: istore #12
    //   1203: iload #11
    //   1205: aload_0
    //   1206: getfield o0 : Ljava/util/ArrayList;
    //   1209: invokevirtual size : ()I
    //   1212: if_icmpge -> 1357
    //   1215: aload_0
    //   1216: getfield o0 : Ljava/util/ArrayList;
    //   1219: iload #11
    //   1221: invokevirtual get : (I)Ljava/lang/Object;
    //   1224: checkcast java/lang/Float
    //   1227: invokevirtual floatValue : ()F
    //   1230: fstore_2
    //   1231: aload_0
    //   1232: getfield O0 : Landroid/graphics/drawable/Drawable;
    //   1235: astore #18
    //   1237: aload #18
    //   1239: ifnull -> 1257
    //   1242: aload_0
    //   1243: aload_1
    //   1244: iload #13
    //   1246: iload #12
    //   1248: fload_2
    //   1249: aload #18
    //   1251: invokevirtual i : (Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
    //   1254: goto -> 1351
    //   1257: iload #11
    //   1259: aload_0
    //   1260: getfield P0 : Ljava/util/List;
    //   1263: invokeinterface size : ()I
    //   1268: if_icmpge -> 1298
    //   1271: aload_0
    //   1272: aload_1
    //   1273: iload #13
    //   1275: iload #12
    //   1277: fload_2
    //   1278: aload_0
    //   1279: getfield P0 : Ljava/util/List;
    //   1282: iload #11
    //   1284: invokeinterface get : (I)Ljava/lang/Object;
    //   1289: checkcast android/graphics/drawable/Drawable
    //   1292: invokevirtual i : (Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
    //   1295: goto -> 1351
    //   1298: aload_0
    //   1299: invokevirtual isEnabled : ()Z
    //   1302: ifne -> 1337
    //   1305: aload_0
    //   1306: getfield G : I
    //   1309: i2f
    //   1310: fstore_3
    //   1311: aload_1
    //   1312: aload_0
    //   1313: fload_2
    //   1314: invokevirtual x : (F)F
    //   1317: iload #13
    //   1319: i2f
    //   1320: fmul
    //   1321: fload_3
    //   1322: fadd
    //   1323: fload #7
    //   1325: aload_0
    //   1326: invokevirtual getThumbRadius : ()I
    //   1329: i2f
    //   1330: aload_0
    //   1331: getfield e : Landroid/graphics/Paint;
    //   1334: invokevirtual drawCircle : (FFFLandroid/graphics/Paint;)V
    //   1337: aload_0
    //   1338: aload_1
    //   1339: iload #13
    //   1341: iload #12
    //   1343: fload_2
    //   1344: aload_0
    //   1345: getfield N0 : Lws0;
    //   1348: invokevirtual i : (Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
    //   1351: iinc #11, 1
    //   1354: goto -> 1203
    //   1357: return
  }
  
  public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    td td1 = this.j;
    if (!paramBoolean) {
      this.p0 = -1;
      td1.j(this.q0);
      return;
    } 
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 17) {
          if (paramInt == 66)
            w(-2147483648); 
        } else {
          w(2147483647);
        } 
      } else {
        v(-2147483648);
      } 
    } else {
      v(2147483647);
    } 
    td1.o(this.q0);
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setVisibleToUser(false);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEnabled : ()Z
    //   4: ifne -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   13: ireturn
    //   14: aload_0
    //   15: getfield o0 : Ljava/util/ArrayList;
    //   18: invokevirtual size : ()I
    //   21: iconst_1
    //   22: if_icmpne -> 30
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield p0 : I
    //   30: aload_0
    //   31: getfield p0 : I
    //   34: istore #5
    //   36: aconst_null
    //   37: astore #7
    //   39: aconst_null
    //   40: astore #8
    //   42: iload #5
    //   44: iconst_m1
    //   45: if_icmpne -> 248
    //   48: iload_1
    //   49: bipush #61
    //   51: if_icmpeq -> 185
    //   54: iload_1
    //   55: bipush #66
    //   57: if_icmpeq -> 165
    //   60: iload_1
    //   61: bipush #81
    //   63: if_icmpeq -> 151
    //   66: iload_1
    //   67: bipush #69
    //   69: if_icmpeq -> 137
    //   72: iload_1
    //   73: bipush #70
    //   75: if_icmpeq -> 151
    //   78: iload_1
    //   79: tableswitch default -> 104, 21 -> 124, 22 -> 111, 23 -> 165
    //   104: aload #8
    //   106: astore #7
    //   108: goto -> 230
    //   111: aload_0
    //   112: iconst_1
    //   113: invokevirtual w : (I)V
    //   116: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   119: astore #7
    //   121: goto -> 230
    //   124: aload_0
    //   125: iconst_m1
    //   126: invokevirtual w : (I)V
    //   129: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   132: astore #7
    //   134: goto -> 230
    //   137: aload_0
    //   138: iconst_m1
    //   139: invokevirtual v : (I)Z
    //   142: pop
    //   143: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   146: astore #7
    //   148: goto -> 230
    //   151: aload_0
    //   152: iconst_1
    //   153: invokevirtual v : (I)Z
    //   156: pop
    //   157: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   160: astore #7
    //   162: goto -> 230
    //   165: aload_0
    //   166: aload_0
    //   167: getfield q0 : I
    //   170: putfield p0 : I
    //   173: aload_0
    //   174: invokevirtual postInvalidate : ()V
    //   177: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   180: astore #7
    //   182: goto -> 230
    //   185: aload_2
    //   186: invokevirtual hasNoModifiers : ()Z
    //   189: ifeq -> 205
    //   192: aload_0
    //   193: iconst_1
    //   194: invokevirtual v : (I)Z
    //   197: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   200: astore #7
    //   202: goto -> 230
    //   205: aload_2
    //   206: invokevirtual isShiftPressed : ()Z
    //   209: ifeq -> 225
    //   212: aload_0
    //   213: iconst_m1
    //   214: invokevirtual v : (I)Z
    //   217: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   220: astore #7
    //   222: goto -> 230
    //   225: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   228: astore #7
    //   230: aload #7
    //   232: ifnull -> 241
    //   235: aload #7
    //   237: invokevirtual booleanValue : ()Z
    //   240: ireturn
    //   241: aload_0
    //   242: iload_1
    //   243: aload_2
    //   244: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   247: ireturn
    //   248: aload_0
    //   249: getfield x0 : Z
    //   252: aload_2
    //   253: invokevirtual isLongPress : ()Z
    //   256: ior
    //   257: istore #6
    //   259: aload_0
    //   260: iload #6
    //   262: putfield x0 : Z
    //   265: aload_0
    //   266: getfield r0 : F
    //   269: fstore #4
    //   271: iload #6
    //   273: ifeq -> 329
    //   276: fload #4
    //   278: fstore_3
    //   279: fload #4
    //   281: fconst_0
    //   282: fcmpl
    //   283: ifne -> 288
    //   286: fconst_1
    //   287: fstore_3
    //   288: aload_0
    //   289: getfield n0 : F
    //   292: aload_0
    //   293: getfield m0 : F
    //   296: fsub
    //   297: fload_3
    //   298: fdiv
    //   299: fstore #4
    //   301: fload #4
    //   303: ldc_w 20.0
    //   306: fcmpg
    //   307: ifgt -> 313
    //   310: goto -> 341
    //   313: fload_3
    //   314: fload #4
    //   316: ldc_w 20.0
    //   319: fdiv
    //   320: invokestatic round : (F)I
    //   323: i2f
    //   324: fmul
    //   325: fstore_3
    //   326: goto -> 341
    //   329: fload #4
    //   331: fstore_3
    //   332: fload #4
    //   334: fconst_0
    //   335: fcmpl
    //   336: ifne -> 341
    //   339: fconst_1
    //   340: fstore_3
    //   341: iload_1
    //   342: bipush #69
    //   344: if_icmpeq -> 483
    //   347: iload_1
    //   348: bipush #70
    //   350: if_icmpeq -> 474
    //   353: iload_1
    //   354: bipush #81
    //   356: if_icmpeq -> 474
    //   359: iload_1
    //   360: tableswitch default -> 392, 19 -> 458, 20 -> 441, 21 -> 419, 22 -> 395
    //   392: goto -> 490
    //   395: fload_3
    //   396: fstore #4
    //   398: aload_0
    //   399: invokevirtual t : ()Z
    //   402: ifeq -> 409
    //   405: fload_3
    //   406: fneg
    //   407: fstore #4
    //   409: fload #4
    //   411: invokestatic valueOf : (F)Ljava/lang/Float;
    //   414: astore #7
    //   416: goto -> 490
    //   419: aload_0
    //   420: invokevirtual t : ()Z
    //   423: ifeq -> 429
    //   426: goto -> 432
    //   429: fload_3
    //   430: fneg
    //   431: fstore_3
    //   432: fload_3
    //   433: invokestatic valueOf : (F)Ljava/lang/Float;
    //   436: astore #7
    //   438: goto -> 490
    //   441: aload_0
    //   442: invokevirtual u : ()Z
    //   445: ifeq -> 490
    //   448: fload_3
    //   449: fneg
    //   450: invokestatic valueOf : (F)Ljava/lang/Float;
    //   453: astore #7
    //   455: goto -> 490
    //   458: aload_0
    //   459: invokevirtual u : ()Z
    //   462: ifeq -> 490
    //   465: fload_3
    //   466: invokestatic valueOf : (F)Ljava/lang/Float;
    //   469: astore #7
    //   471: goto -> 490
    //   474: fload_3
    //   475: invokestatic valueOf : (F)Ljava/lang/Float;
    //   478: astore #7
    //   480: goto -> 490
    //   483: fload_3
    //   484: fneg
    //   485: invokestatic valueOf : (F)Ljava/lang/Float;
    //   488: astore #7
    //   490: aload #7
    //   492: ifnull -> 545
    //   495: aload_0
    //   496: getfield o0 : Ljava/util/ArrayList;
    //   499: aload_0
    //   500: getfield p0 : I
    //   503: invokevirtual get : (I)Ljava/lang/Object;
    //   506: checkcast java/lang/Float
    //   509: invokevirtual floatValue : ()F
    //   512: fstore #4
    //   514: aload #7
    //   516: invokevirtual floatValue : ()F
    //   519: fstore_3
    //   520: aload_0
    //   521: aload_0
    //   522: getfield p0 : I
    //   525: fload_3
    //   526: fload #4
    //   528: fadd
    //   529: invokevirtual C : (IF)Z
    //   532: ifeq -> 543
    //   535: aload_0
    //   536: invokevirtual F : ()V
    //   539: aload_0
    //   540: invokevirtual postInvalidate : ()V
    //   543: iconst_1
    //   544: ireturn
    //   545: iload_1
    //   546: bipush #23
    //   548: if_icmpeq -> 598
    //   551: iload_1
    //   552: bipush #61
    //   554: if_icmpeq -> 570
    //   557: iload_1
    //   558: bipush #66
    //   560: if_icmpeq -> 598
    //   563: aload_0
    //   564: iload_1
    //   565: aload_2
    //   566: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   569: ireturn
    //   570: aload_2
    //   571: invokevirtual hasNoModifiers : ()Z
    //   574: ifeq -> 583
    //   577: aload_0
    //   578: iconst_1
    //   579: invokevirtual v : (I)Z
    //   582: ireturn
    //   583: aload_2
    //   584: invokevirtual isShiftPressed : ()Z
    //   587: ifeq -> 596
    //   590: aload_0
    //   591: iconst_m1
    //   592: invokevirtual v : (I)Z
    //   595: ireturn
    //   596: iconst_0
    //   597: ireturn
    //   598: aload_0
    //   599: iconst_m1
    //   600: putfield p0 : I
    //   603: aload_0
    //   604: invokevirtual postInvalidate : ()V
    //   607: iconst_1
    //   608: ireturn
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    this.x0 = false;
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int j = this.E;
    int i = 0;
    if (j == 1 || j == 3)
      i = ((qv1)this.n.get(0)).getIntrinsicHeight(); 
    i = View.MeasureSpec.makeMeasureSpec(this.D + i, 1073741824);
    if (u()) {
      super.onMeasure(i, paramInt2);
      return;
    } 
    super.onMeasure(paramInt1, i);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    ud ud = (ud)paramParcelable;
    super.onRestoreInstanceState(ud.getSuperState());
    this.m0 = ud.b;
    this.n0 = ud.c;
    B(ud.e);
    this.r0 = ud.f;
    if (ud.g)
      requestFocus(); 
  }
  
  public Parcelable onSaveInstanceState() {
    View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
    ((ud)baseSavedState).b = this.m0;
    ((ud)baseSavedState).c = this.n0;
    ((ud)baseSavedState).e = new ArrayList(this.o0);
    ((ud)baseSavedState).f = this.r0;
    ((ud)baseSavedState).g = hasFocus();
    return (Parcelable)baseSavedState;
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (u())
      paramInt1 = paramInt2; 
    this.w0 = Math.max(paramInt1 - this.G * 2, 0);
    I();
    F();
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    float f1;
    float f2;
    boolean bool = isEnabled();
    byte b = 0;
    if (!bool)
      return false; 
    if (u()) {
      f1 = paramMotionEvent.getY();
    } else {
      f1 = paramMotionEvent.getX();
    } 
    if (u()) {
      f2 = paramMotionEvent.getX();
    } else {
      f2 = paramMotionEvent.getY();
    } 
    float f3 = (f1 - this.G) / this.w0;
    this.Q0 = f3;
    f3 = Math.max(0.0F, f3);
    this.Q0 = f3;
    this.Q0 = Math.min(1.0F, f3);
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      int j = this.t;
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            setPressed(this.l0);
            this.j0 = MotionEvent.obtain(paramMotionEvent);
            return true;
          } 
        } else {
          if (!this.l0) {
            if ((!u() && s(paramMotionEvent) && Math.abs(f1 - this.h0) < j) || (u() && r(paramMotionEvent) && Math.abs(f2 - this.i0) < j * 0.8F))
              return false; 
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!z()) {
              setPressed(this.l0);
              this.j0 = MotionEvent.obtain(paramMotionEvent);
              return true;
            } 
            this.l0 = true;
            H();
            y();
          } 
          D();
          F();
          invalidate();
          setPressed(this.l0);
          this.j0 = MotionEvent.obtain(paramMotionEvent);
          return true;
        }  
      this.l0 = false;
      MotionEvent motionEvent = this.j0;
      if (motionEvent != null && motionEvent.getActionMasked() == 0) {
        f1 = Math.abs(this.j0.getX() - paramMotionEvent.getX());
        f2 = j;
        if (f1 <= f2 && Math.abs(this.j0.getY() - paramMotionEvent.getY()) <= f2 && z())
          y(); 
      } 
      if (this.p0 != -1) {
        D();
        F();
        if (this.K > 0) {
          j = this.L;
          if (j != -1 && this.M != -1) {
            setThumbWidth(j);
            setThumbTrackGapSize(this.M);
          } 
        } 
        this.p0 = -1;
        ArrayList<MotionEvent> arrayList = this.p;
        j = arrayList.size();
        while (b < j) {
          motionEvent = arrayList.get(b);
          b++;
          ((dd)motionEvent).C(this);
        } 
      } 
      invalidate();
    } else {
      this.h0 = f1;
      this.i0 = f2;
      if ((u() || !s(paramMotionEvent)) && (!u() || !r(paramMotionEvent))) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (z()) {
          requestFocus();
          this.l0 = true;
          H();
          y();
          D();
          F();
          invalidate();
        } 
      } 
    } 
    setPressed(this.l0);
    this.j0 = MotionEvent.obtain(paramMotionEvent);
    return true;
  }
  
  public final void onVisibilityAggregated(boolean paramBoolean) {
    super.onVisibilityAggregated(paramBoolean);
    this.W0 = paramBoolean;
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt != 0) {
      ViewOverlay viewOverlay;
      ViewGroup viewGroup = n21.z(this);
      if (viewGroup == null) {
        viewGroup = null;
      } else {
        viewOverlay = viewGroup.getOverlay();
      } 
      if (viewOverlay != null) {
        ArrayList<Object> arrayList = this.n;
        int i = arrayList.size();
        paramInt = 0;
        while (paramInt < i) {
          qv1 qv1 = (qv1)arrayList.get(paramInt);
          paramInt++;
          viewOverlay.remove(qv1);
        } 
      } 
    } 
  }
  
  public final int p(ColorStateList paramColorStateList) {
    return paramColorStateList.getColorForState(getDrawableState(), paramColorStateList.getDefaultColor());
  }
  
  public final boolean q(double paramDouble) {
    paramDouble = (new BigDecimal(Double.toString(paramDouble))).divide(new BigDecimal(Float.toString(this.r0)), MathContext.DECIMAL64).doubleValue();
    return (Math.abs(Math.round(paramDouble) - paramDouble) < 1.0E-4D);
  }
  
  public final boolean r(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getToolType(0) != 3)
      for (ViewParent viewParent = getParent(); viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
        ViewGroup viewGroup = (ViewGroup)viewParent;
        if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState())
          return true; 
      }  
    return false;
  }
  
  public final boolean s(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getToolType(0) != 3)
      for (ViewParent viewParent = getParent(); viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
        ViewGroup viewGroup = (ViewGroup)viewParent;
        if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState())
          return true; 
      }  
    return false;
  }
  
  public void setActiveThumbIndex(int paramInt) {
    this.p0 = paramInt;
  }
  
  public void setCentered(boolean paramBoolean) {
    if (this.Q == paramBoolean)
      return; 
    this.Q = paramBoolean;
    float f = this.m0;
    if (paramBoolean) {
      setValues(new Float[] { Float.valueOf((f + this.n0) / 2.0F) });
    } else {
      setValues(new Float[] { Float.valueOf(f) });
    } 
    P(true);
  }
  
  public void setCustomThumbDrawablesForValues(int... paramVarArgs) {
    Drawable[] arrayOfDrawable = new Drawable[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayOfDrawable[b] = getResources().getDrawable(paramVarArgs[b]); 
    setCustomThumbDrawablesForValues(arrayOfDrawable);
  }
  
  public void setCustomThumbDrawablesForValues(Drawable... paramVarArgs) {
    this.O0 = null;
    this.P0 = new ArrayList();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      Drawable drawable = paramVarArgs[b];
      List<Drawable> list = this.P0;
      drawable = drawable.mutate().getConstantState().newDrawable();
      c(drawable);
      list.add(drawable);
    } 
    postInvalidate();
  }
  
  public void setEnabled(boolean paramBoolean) {
    byte b;
    super.setEnabled(paramBoolean);
    if (paramBoolean) {
      b = 0;
    } else {
      b = 2;
    } 
    setLayerType(b, null);
  }
  
  public void setFocusedThumbIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < this.o0.size()) {
      this.q0 = paramInt;
      this.j.o(paramInt);
      postInvalidate();
      return;
    } 
    l0.l("index out of range");
  }
  
  public void setHaloRadius(int paramInt) {
    if (paramInt == this.J)
      return; 
    this.J = paramInt;
    Drawable drawable = getBackground();
    if (getBackground() instanceof RippleDrawable && drawable instanceof RippleDrawable) {
      ((RippleDrawable)drawable).setRadius(this.J);
      return;
    } 
    postInvalidate();
  }
  
  public void setHaloTintList(ColorStateList paramColorStateList) {
    if (paramColorStateList.equals(this.z0))
      return; 
    this.z0 = paramColorStateList;
    Drawable drawable = getBackground();
    if (getBackground() instanceof RippleDrawable && drawable instanceof RippleDrawable) {
      ((RippleDrawable)drawable).setColor(paramColorStateList);
      return;
    } 
    int i = p(paramColorStateList);
    Paint paint = this.f;
    paint.setColor(i);
    paint.setAlpha(63);
    invalidate();
  }
  
  public abstract void setLabelBehavior(int paramInt);
  
  public abstract void setOrientation(int paramInt);
  
  public void setSeparationUnit(int paramInt) {
    this.R0 = paramInt;
    this.y0 = true;
    postInvalidate();
  }
  
  public void setStepSize(float paramFloat) {
    if (paramFloat >= 0.0F) {
      if (this.r0 != paramFloat) {
        this.r0 = paramFloat;
        this.y0 = true;
        postInvalidate();
      } 
      return;
    } 
    float f2 = this.m0;
    float f1 = this.n0;
    StringBuilder stringBuilder = new StringBuilder("The stepSize(");
    stringBuilder.append(paramFloat);
    stringBuilder.append(") must be 0, or a factor of the valueFrom(");
    stringBuilder.append(f2);
    stringBuilder.append(")-valueTo(");
    stringBuilder.append(f1);
    stringBuilder.append(jHxlGgUTadw.HvtAIPqhrOystbA);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public abstract void setThumbElevation(float paramFloat);
  
  public void setThumbHeight(int paramInt) {
    if (paramInt == this.I)
      return; 
    this.I = paramInt;
    this.N0.setBounds(0, 0, this.H, paramInt);
    Drawable drawable = this.O0;
    if (drawable != null)
      c(drawable); 
    Iterator<Drawable> iterator = this.P0.iterator();
    while (iterator.hasNext())
      c(iterator.next()); 
    P(false);
  }
  
  public abstract void setThumbStrokeColor(ColorStateList paramColorStateList);
  
  public abstract void setThumbStrokeWidth(float paramFloat);
  
  public abstract void setThumbTrackGapSize(int paramInt);
  
  public void setThumbWidth(int paramInt) {
    if (paramInt == this.H)
      return; 
    this.H = paramInt;
    Object object5 = new Object();
    Object object4 = new Object();
    Object object3 = new Object();
    Object object2 = new Object();
    float f = this.H / 2.0F;
    z51 z51 = zo2.g(0);
    k k4 = new k(f);
    k k3 = new k(f);
    k k1 = new k(f);
    k k2 = new k(f);
    Object object1 = new Object();
    ((vl1)object1).a = z51;
    ((vl1)object1).b = z51;
    ((vl1)object1).c = z51;
    ((vl1)object1).d = z51;
    ((vl1)object1).e = k4;
    ((vl1)object1).f = k3;
    ((vl1)object1).g = k1;
    ((vl1)object1).h = k2;
    ((vl1)object1).i = (j30)object5;
    ((vl1)object1).j = (j30)object4;
    ((vl1)object1).k = (j30)object3;
    ((vl1)object1).l = (j30)object2;
    object2 = this.N0;
    object2.setShapeAppearanceModel((vl1)object1);
    object2.setBounds(0, 0, this.H, this.I);
    object1 = this.O0;
    if (object1 != null)
      c((Drawable)object1); 
    object1 = this.P0.iterator();
    while (object1.hasNext())
      c(object1.next()); 
    P(false);
  }
  
  public abstract void setTickActiveRadius(int paramInt);
  
  public abstract void setTickActiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTickInactiveRadius(int paramInt);
  
  public abstract void setTickInactiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTrackActiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTrackCornerSize(int paramInt);
  
  public abstract void setTrackHeight(int paramInt);
  
  public abstract void setTrackIconActiveColor(ColorStateList paramColorStateList);
  
  public abstract void setTrackIconActiveEnd(Drawable paramDrawable);
  
  public abstract void setTrackIconActiveStart(Drawable paramDrawable);
  
  public abstract void setTrackIconInactiveColor(ColorStateList paramColorStateList);
  
  public abstract void setTrackIconInactiveEnd(Drawable paramDrawable);
  
  public abstract void setTrackIconInactiveStart(Drawable paramDrawable);
  
  public abstract void setTrackIconSize(int paramInt);
  
  public abstract void setTrackInactiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTrackInsideCornerSize(int paramInt);
  
  public abstract void setTrackStopIndicatorSize(int paramInt);
  
  public void setValues(List<Float> paramList) {
    B(new ArrayList<Float>(paramList));
  }
  
  public void setValues(Float... paramVarArgs) {
    ArrayList<? super Float> arrayList = new ArrayList();
    Collections.addAll(arrayList, paramVarArgs);
    B(arrayList);
  }
  
  public final boolean t() {
    return (getLayoutDirection() == 1);
  }
  
  public final boolean u() {
    return (this.B == 1);
  }
  
  public final boolean v(int paramInt) {
    long l1;
    int i = this.q0;
    long l2 = i + paramInt;
    long l3 = (this.o0.size() - 1);
    if (l2 < 0L) {
      l1 = 0L;
    } else {
      l1 = l2;
      if (l2 > l3)
        l1 = l3; 
    } 
    paramInt = (int)l1;
    this.q0 = paramInt;
    if (paramInt == i)
      return false; 
    if (this.p0 != -1)
      this.p0 = paramInt; 
    F();
    postInvalidate();
    return true;
  }
  
  public final void w(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual t : ()Z
    //   4: ifne -> 16
    //   7: iload_1
    //   8: istore_2
    //   9: aload_0
    //   10: invokevirtual u : ()Z
    //   13: ifeq -> 33
    //   16: iload_1
    //   17: ldc_w -2147483648
    //   20: if_icmpne -> 30
    //   23: ldc_w 2147483647
    //   26: istore_2
    //   27: goto -> 33
    //   30: iload_1
    //   31: ineg
    //   32: istore_2
    //   33: aload_0
    //   34: iload_2
    //   35: invokevirtual v : (I)Z
    //   38: pop
    //   39: return
  }
  
  public final float x(float paramFloat) {
    float f = this.m0;
    paramFloat = (paramFloat - f) / (this.n0 - f);
    return (t() || u()) ? (1.0F - paramFloat) : paramFloat;
  }
  
  public final void y() {
    ArrayList<Object> arrayList = this.p;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      dd dd = (dd)arrayList.get(b);
      b++;
      ((dd)dd).g(this);
    } 
  }
  
  public boolean z() {
    // Byte code:
    //   0: aload_0
    //   1: getfield p0 : I
    //   4: iconst_m1
    //   5: if_icmpeq -> 10
    //   8: iconst_1
    //   9: ireturn
    //   10: aload_0
    //   11: getfield Q0 : F
    //   14: fstore_2
    //   15: aload_0
    //   16: invokevirtual t : ()Z
    //   19: ifne -> 31
    //   22: fload_2
    //   23: fstore_1
    //   24: aload_0
    //   25: invokevirtual u : ()Z
    //   28: ifeq -> 35
    //   31: fconst_1
    //   32: fload_2
    //   33: fsub
    //   34: fstore_1
    //   35: aload_0
    //   36: getfield n0 : F
    //   39: fstore_2
    //   40: aload_0
    //   41: getfield m0 : F
    //   44: fstore_3
    //   45: fload_2
    //   46: fload_3
    //   47: fload_1
    //   48: fload_3
    //   49: invokestatic e : (FFFF)F
    //   52: fstore #5
    //   54: aload_0
    //   55: fload #5
    //   57: invokevirtual S : (F)F
    //   60: fstore #4
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield p0 : I
    //   67: aload_0
    //   68: getfield o0 : Ljava/util/ArrayList;
    //   71: iconst_0
    //   72: invokevirtual get : (I)Ljava/lang/Object;
    //   75: checkcast java/lang/Float
    //   78: invokevirtual floatValue : ()F
    //   81: fload #5
    //   83: fsub
    //   84: invokestatic abs : (F)F
    //   87: fstore_2
    //   88: iconst_1
    //   89: istore #7
    //   91: iload #7
    //   93: aload_0
    //   94: getfield o0 : Ljava/util/ArrayList;
    //   97: invokevirtual size : ()I
    //   100: if_icmpge -> 283
    //   103: aload_0
    //   104: getfield o0 : Ljava/util/ArrayList;
    //   107: iload #7
    //   109: invokevirtual get : (I)Ljava/lang/Object;
    //   112: checkcast java/lang/Float
    //   115: invokevirtual floatValue : ()F
    //   118: fload #5
    //   120: fsub
    //   121: invokestatic abs : (F)F
    //   124: fstore_3
    //   125: aload_0
    //   126: aload_0
    //   127: getfield o0 : Ljava/util/ArrayList;
    //   130: iload #7
    //   132: invokevirtual get : (I)Ljava/lang/Object;
    //   135: checkcast java/lang/Float
    //   138: invokevirtual floatValue : ()F
    //   141: invokevirtual S : (F)F
    //   144: fstore #6
    //   146: fload_3
    //   147: fload_2
    //   148: invokestatic compare : (FF)I
    //   151: ifle -> 157
    //   154: goto -> 283
    //   157: aload_0
    //   158: invokevirtual t : ()Z
    //   161: ifne -> 196
    //   164: aload_0
    //   165: invokevirtual u : ()Z
    //   168: ifeq -> 174
    //   171: goto -> 196
    //   174: fload #6
    //   176: fload #4
    //   178: fsub
    //   179: fconst_0
    //   180: fcmpg
    //   181: ifge -> 190
    //   184: iconst_1
    //   185: istore #8
    //   187: goto -> 209
    //   190: iconst_0
    //   191: istore #8
    //   193: goto -> 209
    //   196: fload #6
    //   198: fload #4
    //   200: fsub
    //   201: fconst_0
    //   202: fcmpl
    //   203: ifle -> 190
    //   206: goto -> 184
    //   209: fload_3
    //   210: fload_2
    //   211: invokestatic compare : (FF)I
    //   214: ifge -> 226
    //   217: aload_0
    //   218: iload #7
    //   220: putfield p0 : I
    //   223: goto -> 273
    //   226: fload_2
    //   227: fstore_1
    //   228: fload_3
    //   229: fload_2
    //   230: invokestatic compare : (FF)I
    //   233: ifne -> 275
    //   236: fload #6
    //   238: fload #4
    //   240: fsub
    //   241: invokestatic abs : (F)F
    //   244: aload_0
    //   245: getfield t : I
    //   248: i2f
    //   249: fcmpg
    //   250: ifge -> 260
    //   253: aload_0
    //   254: iconst_m1
    //   255: putfield p0 : I
    //   258: iconst_0
    //   259: ireturn
    //   260: fload_2
    //   261: fstore_1
    //   262: iload #8
    //   264: ifeq -> 275
    //   267: aload_0
    //   268: iload #7
    //   270: putfield p0 : I
    //   273: fload_3
    //   274: fstore_1
    //   275: iinc #7, 1
    //   278: fload_1
    //   279: fstore_2
    //   280: goto -> 91
    //   283: aload_0
    //   284: getfield p0 : I
    //   287: iconst_m1
    //   288: if_icmpeq -> 293
    //   291: iconst_1
    //   292: ireturn
    //   293: iconst_0
    //   294: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */