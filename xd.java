import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.slider.RangeSlider2;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public abstract class xd extends View {
  public int A;
  
  public int B;
  
  public int C;
  
  public int D;
  
  public final int E;
  
  public float F;
  
  public MotionEvent G;
  
  public nl0 H;
  
  public boolean I = false;
  
  public float J;
  
  public float K;
  
  public ArrayList L = new ArrayList();
  
  public int M = -1;
  
  public int N = -1;
  
  public float O = 0.0F;
  
  public float[] P;
  
  public boolean Q = true;
  
  public int R;
  
  public int S;
  
  public int T;
  
  public boolean U = false;
  
  public boolean V;
  
  public ColorStateList W;
  
  public ColorStateList a0;
  
  public final Paint b;
  
  public ColorStateList b0;
  
  public final Paint c;
  
  public ColorStateList c0;
  
  public ColorStateList d0;
  
  public final Paint e;
  
  public final ws0 e0;
  
  public final Paint f;
  
  public Drawable f0;
  
  public final Paint g;
  
  public List g0;
  
  public final Paint h;
  
  public float h0;
  
  public final td i;
  
  public int i0;
  
  public final AccessibilityManager j;
  
  public sd k;
  
  public final int l;
  
  public final ArrayList m = new ArrayList();
  
  public final ArrayList n = new ArrayList();
  
  public final ArrayList o = new ArrayList();
  
  public boolean p = false;
  
  public ValueAnimator q;
  
  public ValueAnimator r;
  
  public final int s;
  
  public final int t;
  
  public final int u;
  
  public final int v;
  
  public final int w;
  
  public final int x;
  
  public int y;
  
  public int z;
  
  public xd(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952921), paramAttributeSet, paramInt);
    ws0 ws01 = new ws0();
    this.e0 = ws01;
    this.g0 = Collections.EMPTY_LIST;
    this.i0 = 0;
    Context context = getContext();
    Paint paint2 = new Paint();
    this.b = paint2;
    Paint.Style style1 = Paint.Style.STROKE;
    paint2.setStyle(style1);
    Paint.Cap cap = Paint.Cap.ROUND;
    paint2.setStrokeCap(cap);
    paint2 = new Paint();
    this.c = paint2;
    paint2.setStyle(style1);
    paint2.setStrokeCap(cap);
    Paint paint3 = new Paint(1);
    this.e = paint3;
    Paint.Style style2 = Paint.Style.FILL;
    paint3.setStyle(style2);
    paint3.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    paint3 = new Paint(1);
    this.f = paint3;
    paint3.setStyle(style2);
    Paint paint1 = new Paint();
    this.g = paint1;
    paint1.setStyle(style1);
    paint1.setStrokeCap(cap);
    paint1 = new Paint();
    this.h = paint1;
    paint1.setStyle(style1);
    paint1.setStrokeCap(cap);
    Resources resources = context.getResources();
    this.B = 0;
    this.t = resources.getDimensionPixelSize(2131166284);
    this.u = resources.getDimensionPixelSize(2131166287);
    this.v = resources.getDimensionPixelSize(2131166286);
    this.w = resources.getDimensionPixelSize(2131166286);
    this.E = resources.getDimensionPixelSize(2131166280);
    g92.m(context, paramAttributeSet, paramInt, 2131952921);
    int[] arrayOfInt = zb1.D;
    g92.o(context, paramAttributeSet, arrayOfInt, paramInt, 2131952921, new int[0]);
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 2131952921);
    this.l = typedArray.getResourceId(10, 2131952955);
    this.J = typedArray.getFloat(4, 0.0F);
    this.K = typedArray.getFloat(5, 1.0F);
    setValues(new Float[] { Float.valueOf(this.J) });
    this.O = typedArray.getFloat(3, 0.0F);
    this.x = (int)Math.ceil(typedArray.getDimension(11, (float)Math.ceil(n21.u(getContext(), 48))));
    byte b = 36;
    boolean bool = typedArray.hasValue(36);
    if (bool) {
      paramInt = 36;
    } else {
      paramInt = 38;
    } 
    if (!bool)
      b = 37; 
    ColorStateList colorStateList = wf2.u(context, typedArray, paramInt);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100638); 
    setTrackInactiveTintList(colorStateList);
    colorStateList = wf2.u(context, typedArray, b);
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
    this.Q = typedArray.getBoolean(35, true);
    b = 29;
    bool = typedArray.hasValue(29);
    if (bool) {
      paramInt = 29;
    } else {
      paramInt = 31;
    } 
    if (!bool)
      b = 30; 
    colorStateList = wf2.u(context, typedArray, paramInt);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100637); 
    setTickInactiveTintList(colorStateList);
    colorStateList = wf2.u(context, typedArray, b);
    if (colorStateList == null)
      colorStateList = n21.y(context, 2131100634); 
    setTickActiveTintList(colorStateList);
    setThumbRadius(typedArray.getDimensionPixelSize(24, 0));
    setHaloRadius(typedArray.getDimensionPixelSize(8, 0));
    setThumbElevation(typedArray.getDimension(22, 0.0F));
    setTrackHeight(typedArray.getDimensionPixelSize(40, 0));
    setTickActiveRadius(typedArray.getDimensionPixelSize(32, 0));
    setTickInactiveRadius(typedArray.getDimensionPixelSize(33, 0));
    setLabelBehavior(typedArray.getInt(9, 0));
    if (!typedArray.getBoolean(0, true))
      setEnabled(false); 
    typedArray.recycle();
    setFocusable(true);
    setClickable(true);
    ws01.r();
    this.s = ViewConfiguration.get(context).getScaledTouchSlop();
    td td1 = new td((RangeSlider2)this);
    this.i = td1;
    v22.n(this, td1);
    this.j = (AccessibilityManager)getContext().getSystemService("accessibility");
  }
  
  public final void a(Drawable paramDrawable) {
    int i = this.C * 2;
    int j = paramDrawable.getIntrinsicWidth();
    int k = paramDrawable.getIntrinsicHeight();
    if (j == -1 && k == -1) {
      paramDrawable.setBounds(0, 0, i, i);
      return;
    } 
    float f = i / Math.max(j, k);
    paramDrawable.setBounds(0, 0, (int)(j * f), (int)(k * f));
  }
  
  public final int b() {
    int j = this.y / 2;
    int k = this.z;
    int i = 0;
    if (k == 1 || k == 3)
      i = ((qv1)this.m.get(0)).getIntrinsicHeight(); 
    return j + i;
  }
  
  public final ValueAnimator c(boolean paramBoolean) {
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
      valueAnimator1 = this.r;
    } else {
      valueAnimator1 = this.q;
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
    valueAnimator2.addUpdateListener(new vd(0, this));
    return valueAnimator2;
  }
  
  public final void d(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat, Drawable paramDrawable) {
    paramCanvas.save();
    paramCanvas.translate((this.B + (int)(n(paramFloat) * paramInt1)) - paramDrawable.getBounds().width() / 2.0F, paramInt2 - paramDrawable.getBounds().height() / 2.0F);
    paramDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public final boolean dispatchHoverEvent(MotionEvent paramMotionEvent) {
    return (this.i.l(paramMotionEvent) || super.dispatchHoverEvent(paramMotionEvent));
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    int i = g(this.d0);
    this.b.setColor(i);
    i = g(this.c0);
    this.c.setColor(i);
    i = g(this.b0);
    this.g.setColor(i);
    i = g(this.a0);
    this.h.setColor(i);
    ArrayList<Object> arrayList = this.m;
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
    ws0 ws01 = this.e0;
    if (ws01.isStateful())
      ws01.setState(getDrawableState()); 
    i = g(this.W);
    Paint paint = this.f;
    paint.setColor(i);
    paint.setAlpha(63);
  }
  
  public final String e(float paramFloat) {
    String str;
    nl0 nl01 = this.H;
    if (nl01 != null)
      return nl01.e(paramFloat); 
    if ((int)paramFloat == paramFloat) {
      str = "%.0f";
    } else {
      str = "%.2f";
    } 
    return String.format(str, new Object[] { Float.valueOf(paramFloat) });
  }
  
  public final float[] f() {
    float f2 = ((Float)Collections.<Float>max(getValues())).floatValue();
    float f1 = ((Float)Collections.<Float>min(getValues())).floatValue();
    if (this.L.size() == 1)
      f1 = this.J; 
    f1 = n(f1);
    f2 = n(f2);
    return j() ? new float[] { f2, f1 } : new float[] { f1, f2 };
  }
  
  public final int g(ColorStateList paramColorStateList) {
    return paramColorStateList.getColorForState(getDrawableState(), paramColorStateList.getDefaultColor());
  }
  
  public final int getAccessibilityFocusedVirtualViewId() {
    return this.i.k;
  }
  
  public abstract float getMinSeparation();
  
  public abstract List getValues();
  
  public final boolean h(float paramFloat) {
    double d = (new BigDecimal(Float.toString(paramFloat))).divide(new BigDecimal(Float.toString(this.O)), MathContext.DECIMAL64).doubleValue();
    return (Math.abs(Math.round(d) - d) < 1.0E-4D);
  }
  
  public final boolean i(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getToolType(0) != 3)
      for (ViewParent viewParent = getParent(); viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
        ViewGroup viewGroup = (ViewGroup)viewParent;
        if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState())
          return true; 
      }  
    return false;
  }
  
  public final boolean j() {
    WeakHashMap weakHashMap = v22.a;
    return (getLayoutDirection() == 1);
  }
  
  public final void k() {
    if (this.O > 0.0F) {
      x();
      int i = Math.min((int)((this.K - this.J) / this.O + 1.0F), this.T / this.A * 2 + 1);
      float[] arrayOfFloat = this.P;
      if (arrayOfFloat == null || arrayOfFloat.length != i * 2)
        this.P = new float[i * 2]; 
      float f = this.T / (i - 1);
      for (byte b = 0; b < i * 2; b += 2) {
        arrayOfFloat = this.P;
        float f1 = this.B;
        arrayOfFloat[b] = b / 2.0F * f + f1;
        arrayOfFloat[b + 1] = b();
      } 
    } 
  }
  
  public final boolean l(int paramInt) {
    long l1;
    int i = this.N;
    long l3 = i + paramInt;
    long l2 = (this.L.size() - 1);
    if (l3 < 0L) {
      l1 = 0L;
    } else {
      l1 = l3;
      if (l3 > l2)
        l1 = l2; 
    } 
    paramInt = (int)l1;
    this.N = paramInt;
    if (paramInt == i)
      return false; 
    if (this.M != -1)
      this.M = paramInt; 
    v();
    postInvalidate();
    return true;
  }
  
  public final void m(int paramInt) {
    int i = paramInt;
    if (j())
      if (paramInt == Integer.MIN_VALUE) {
        i = Integer.MAX_VALUE;
      } else {
        i = -paramInt;
      }  
    l(i);
  }
  
  public final float n(float paramFloat) {
    float f = this.J;
    paramFloat = (paramFloat - f) / (this.K - f);
    return j() ? (1.0F - paramFloat) : paramFloat;
  }
  
  public final void o() {
    ArrayList<Object> arrayList = this.o;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      dd dd = (dd)arrayList.get(b);
      b++;
      ((dd)dd).g(this);
    } 
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    ArrayList<Object> arrayList = this.m;
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
    sd sd1 = this.k;
    if (sd1 != null)
      removeCallbacks(sd1); 
    this.p = false;
    ArrayList<sd> arrayList = this.m;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      a42 a42;
      sd1 = arrayList.get(i);
      int k = i + 1;
      qv1 qv1 = (qv1)sd1;
      ViewGroup viewGroup = n21.z(this);
      if (viewGroup == null) {
        viewGroup = null;
      } else {
        a42 = new a42(0, viewGroup);
      } 
      i = k;
      if (a42 != null) {
        ((ViewGroup)a42.c).getOverlay().remove(qv1);
        ViewGroup viewGroup1 = n21.z(this);
        if (viewGroup1 == null) {
          qv1.getClass();
          i = k;
          continue;
        } 
        viewGroup1.removeOnLayoutChangeListener(qv1.N);
        i = k;
      } 
    } 
    super.onDetachedFromWindow();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    if (this.V) {
      x();
      k();
    } 
    super.onDraw(paramCanvas);
    int k = b();
    int i = this.T;
    float[] arrayOfFloat = f();
    int j = this.B;
    float f3 = j;
    float f2 = arrayOfFloat[1];
    float f1 = i;
    f2 = f2 * f1 + f3;
    f3 = (j + i);
    Paint paint = this.b;
    if (f2 < f3) {
      float f = k;
      paramCanvas.drawLine(f2, f, f3, f, paint);
    } 
    f2 = this.B;
    j = 0;
    f3 = arrayOfFloat[0] * f1 + f2;
    if (f3 > f2) {
      f1 = k;
      paramCanvas.drawLine(f2, f1, f3, f1, paint);
    } 
    if (((Float)Collections.<Float>max(getValues())).floatValue() > this.J) {
      i = this.T;
      arrayOfFloat = f();
      float f5 = this.B;
      f3 = arrayOfFloat[1];
      f2 = i;
      float f4 = arrayOfFloat[0];
      f1 = k;
      paramCanvas.drawLine(f4 * f2 + f5, f1, f3 * f2 + f5, f1, this.c);
    } 
    if (this.Q && this.O > 0.0F) {
      arrayOfFloat = f();
      float[] arrayOfFloat1 = this.P;
      int n = Math.round(arrayOfFloat[0] * (arrayOfFloat1.length / 2 - 1));
      arrayOfFloat1 = this.P;
      i = Math.round(arrayOfFloat[1] * (arrayOfFloat1.length / 2 - 1));
      arrayOfFloat1 = this.P;
      n *= 2;
      Paint paint1 = this.g;
      paramCanvas.drawPoints(arrayOfFloat1, 0, n, paint1);
      arrayOfFloat1 = this.P;
      i *= 2;
      paramCanvas.drawPoints(arrayOfFloat1, n, i - n, this.h);
      arrayOfFloat1 = this.P;
      paramCanvas.drawPoints(arrayOfFloat1, i, arrayOfFloat1.length - i, paint1);
    } 
    if ((this.I || isFocused()) && isEnabled()) {
      i = this.T;
      if (!(getBackground() instanceof android.graphics.drawable.RippleDrawable)) {
        f1 = this.B;
        int n = (int)(n(((Float)this.L.get(this.N)).floatValue()) * i + f1);
        if (Build.VERSION.SDK_INT < 28) {
          i = this.D;
          paramCanvas.clipRect((n - i), (k - i), (n + i), (i + k), Region.Op.UNION);
        } 
        paramCanvas.drawCircle(n, k, this.D, this.f);
      } 
    } 
    if ((this.M != -1 || this.z == 3) && isEnabled()) {
      if (this.z != 2) {
        if (!this.p) {
          this.p = true;
          ValueAnimator valueAnimator = c(true);
          this.q = valueAnimator;
          this.r = null;
          valueAnimator.start();
        } 
        ArrayList arrayList = this.m;
        Iterator<qv1> iterator = arrayList.iterator();
        for (i = 0; i < this.L.size() && iterator.hasNext(); i++) {
          if (i != this.N)
            q(iterator.next(), ((Float)this.L.get(i)).floatValue()); 
        } 
        if (iterator.hasNext()) {
          q(iterator.next(), ((Float)this.L.get(this.N)).floatValue());
        } else {
          throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[] { Integer.valueOf(arrayList.size()), Integer.valueOf(this.L.size()) }));
        } 
      } 
    } else if (this.p) {
      this.p = false;
      ValueAnimator valueAnimator = c(false);
      this.r = valueAnimator;
      this.q = null;
      valueAnimator.addListener((Animator.AnimatorListener)new j1(3, this));
      this.r.start();
    } 
    int m = this.T;
    i = k;
    while (j < this.L.size()) {
      f1 = ((Float)this.L.get(j)).floatValue();
      Drawable drawable = this.f0;
      if (drawable != null) {
        d(paramCanvas, m, i, f1, drawable);
      } else if (j < this.g0.size()) {
        d(paramCanvas, m, i, f1, this.g0.get(j));
      } else {
        if (!isEnabled()) {
          f2 = this.B;
          paramCanvas.drawCircle(n(f1) * m + f2, i, this.C, this.e);
        } 
        d(paramCanvas, m, i, f1, this.e0);
      } 
      j++;
    } 
  }
  
  public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    td td1 = this.i;
    if (!paramBoolean) {
      this.M = -1;
      td1.j(this.N);
      return;
    } 
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 17) {
          if (paramInt == 66)
            m(-2147483648); 
        } else {
          m(2147483647);
        } 
      } else {
        l(-2147483648);
      } 
    } else {
      l(2147483647);
    } 
    td1.o(this.N);
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
    //   15: getfield L : Ljava/util/ArrayList;
    //   18: invokevirtual size : ()I
    //   21: iconst_1
    //   22: if_icmpne -> 30
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield M : I
    //   30: aload_0
    //   31: getfield M : I
    //   34: istore #5
    //   36: aconst_null
    //   37: astore #8
    //   39: aconst_null
    //   40: astore #7
    //   42: iload #5
    //   44: iconst_m1
    //   45: if_icmpne -> 244
    //   48: iload_1
    //   49: bipush #61
    //   51: if_icmpeq -> 181
    //   54: iload_1
    //   55: bipush #66
    //   57: if_icmpeq -> 161
    //   60: iload_1
    //   61: bipush #81
    //   63: if_icmpeq -> 147
    //   66: iload_1
    //   67: bipush #69
    //   69: if_icmpeq -> 133
    //   72: iload_1
    //   73: bipush #70
    //   75: if_icmpeq -> 147
    //   78: iload_1
    //   79: tableswitch default -> 104, 21 -> 120, 22 -> 107, 23 -> 161
    //   104: goto -> 226
    //   107: aload_0
    //   108: iconst_1
    //   109: invokevirtual m : (I)V
    //   112: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   115: astore #7
    //   117: goto -> 226
    //   120: aload_0
    //   121: iconst_m1
    //   122: invokevirtual m : (I)V
    //   125: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   128: astore #7
    //   130: goto -> 226
    //   133: aload_0
    //   134: iconst_m1
    //   135: invokevirtual l : (I)Z
    //   138: pop
    //   139: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   142: astore #7
    //   144: goto -> 226
    //   147: aload_0
    //   148: iconst_1
    //   149: invokevirtual l : (I)Z
    //   152: pop
    //   153: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   156: astore #7
    //   158: goto -> 226
    //   161: aload_0
    //   162: aload_0
    //   163: getfield N : I
    //   166: putfield M : I
    //   169: aload_0
    //   170: invokevirtual postInvalidate : ()V
    //   173: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   176: astore #7
    //   178: goto -> 226
    //   181: aload_2
    //   182: invokevirtual hasNoModifiers : ()Z
    //   185: ifeq -> 201
    //   188: aload_0
    //   189: iconst_1
    //   190: invokevirtual l : (I)Z
    //   193: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   196: astore #7
    //   198: goto -> 226
    //   201: aload_2
    //   202: invokevirtual isShiftPressed : ()Z
    //   205: ifeq -> 221
    //   208: aload_0
    //   209: iconst_m1
    //   210: invokevirtual l : (I)Z
    //   213: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   216: astore #7
    //   218: goto -> 226
    //   221: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   224: astore #7
    //   226: aload #7
    //   228: ifnull -> 237
    //   231: aload #7
    //   233: invokevirtual booleanValue : ()Z
    //   236: ireturn
    //   237: aload_0
    //   238: iload_1
    //   239: aload_2
    //   240: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   243: ireturn
    //   244: aload_0
    //   245: getfield U : Z
    //   248: aload_2
    //   249: invokevirtual isLongPress : ()Z
    //   252: ior
    //   253: istore #6
    //   255: aload_0
    //   256: iload #6
    //   258: putfield U : Z
    //   261: aload_0
    //   262: getfield O : F
    //   265: fstore #4
    //   267: iload #6
    //   269: ifeq -> 325
    //   272: fload #4
    //   274: fstore_3
    //   275: fload #4
    //   277: fconst_0
    //   278: fcmpl
    //   279: ifne -> 284
    //   282: fconst_1
    //   283: fstore_3
    //   284: aload_0
    //   285: getfield K : F
    //   288: aload_0
    //   289: getfield J : F
    //   292: fsub
    //   293: fload_3
    //   294: fdiv
    //   295: fstore #4
    //   297: fload #4
    //   299: ldc_w 20.0
    //   302: fcmpg
    //   303: ifgt -> 309
    //   306: goto -> 337
    //   309: fload_3
    //   310: fload #4
    //   312: ldc_w 20.0
    //   315: fdiv
    //   316: invokestatic round : (F)I
    //   319: i2f
    //   320: fmul
    //   321: fstore_3
    //   322: goto -> 337
    //   325: fload #4
    //   327: fstore_3
    //   328: fload #4
    //   330: fconst_0
    //   331: fcmpl
    //   332: ifne -> 337
    //   335: fconst_1
    //   336: fstore_3
    //   337: iload_1
    //   338: bipush #21
    //   340: if_icmpeq -> 417
    //   343: iload_1
    //   344: bipush #22
    //   346: if_icmpeq -> 393
    //   349: iload_1
    //   350: bipush #69
    //   352: if_icmpeq -> 383
    //   355: iload_1
    //   356: bipush #70
    //   358: if_icmpeq -> 374
    //   361: iload_1
    //   362: bipush #81
    //   364: if_icmpeq -> 374
    //   367: aload #8
    //   369: astore #7
    //   371: goto -> 436
    //   374: fload_3
    //   375: invokestatic valueOf : (F)Ljava/lang/Float;
    //   378: astore #7
    //   380: goto -> 436
    //   383: fload_3
    //   384: fneg
    //   385: invokestatic valueOf : (F)Ljava/lang/Float;
    //   388: astore #7
    //   390: goto -> 436
    //   393: fload_3
    //   394: fstore #4
    //   396: aload_0
    //   397: invokevirtual j : ()Z
    //   400: ifeq -> 407
    //   403: fload_3
    //   404: fneg
    //   405: fstore #4
    //   407: fload #4
    //   409: invokestatic valueOf : (F)Ljava/lang/Float;
    //   412: astore #7
    //   414: goto -> 436
    //   417: aload_0
    //   418: invokevirtual j : ()Z
    //   421: ifeq -> 427
    //   424: goto -> 430
    //   427: fload_3
    //   428: fneg
    //   429: fstore_3
    //   430: fload_3
    //   431: invokestatic valueOf : (F)Ljava/lang/Float;
    //   434: astore #7
    //   436: aload #7
    //   438: ifnull -> 491
    //   441: aload_0
    //   442: getfield L : Ljava/util/ArrayList;
    //   445: aload_0
    //   446: getfield M : I
    //   449: invokevirtual get : (I)Ljava/lang/Object;
    //   452: checkcast java/lang/Float
    //   455: invokevirtual floatValue : ()F
    //   458: fstore_3
    //   459: aload #7
    //   461: invokevirtual floatValue : ()F
    //   464: fstore #4
    //   466: aload_0
    //   467: aload_0
    //   468: getfield M : I
    //   471: fload #4
    //   473: fload_3
    //   474: fadd
    //   475: invokevirtual s : (IF)Z
    //   478: ifeq -> 489
    //   481: aload_0
    //   482: invokevirtual v : ()V
    //   485: aload_0
    //   486: invokevirtual postInvalidate : ()V
    //   489: iconst_1
    //   490: ireturn
    //   491: iload_1
    //   492: bipush #23
    //   494: if_icmpeq -> 544
    //   497: iload_1
    //   498: bipush #61
    //   500: if_icmpeq -> 516
    //   503: iload_1
    //   504: bipush #66
    //   506: if_icmpeq -> 544
    //   509: aload_0
    //   510: iload_1
    //   511: aload_2
    //   512: invokespecial onKeyDown : (ILandroid/view/KeyEvent;)Z
    //   515: ireturn
    //   516: aload_2
    //   517: invokevirtual hasNoModifiers : ()Z
    //   520: ifeq -> 529
    //   523: aload_0
    //   524: iconst_1
    //   525: invokevirtual l : (I)Z
    //   528: ireturn
    //   529: aload_2
    //   530: invokevirtual isShiftPressed : ()Z
    //   533: ifeq -> 542
    //   536: aload_0
    //   537: iconst_m1
    //   538: invokevirtual l : (I)Z
    //   541: ireturn
    //   542: iconst_0
    //   543: ireturn
    //   544: aload_0
    //   545: iconst_m1
    //   546: putfield M : I
    //   549: aload_0
    //   550: invokevirtual postInvalidate : ()V
    //   553: iconst_1
    //   554: ireturn
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    this.U = false;
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i = this.y;
    int j = this.z;
    paramInt2 = 0;
    if (j == 1 || j == 3)
      paramInt2 = ((qv1)this.m.get(0)).getIntrinsicHeight(); 
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(i + paramInt2, 1073741824));
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    wd wd = (wd)paramParcelable;
    super.onRestoreInstanceState(wd.getSuperState());
    this.J = wd.b;
    this.K = wd.c;
    r(wd.e);
    this.O = wd.f;
    if (wd.g)
      requestFocus(); 
  }
  
  public Parcelable onSaveInstanceState() {
    View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
    ((wd)baseSavedState).b = this.J;
    ((wd)baseSavedState).c = this.K;
    ((wd)baseSavedState).e = new ArrayList(this.L);
    ((wd)baseSavedState).f = this.O;
    ((wd)baseSavedState).g = hasFocus();
    return (Parcelable)baseSavedState;
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.T = Math.max(paramInt1 - this.B * 2, 0);
    k();
    v();
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    boolean bool = isEnabled();
    byte b = 0;
    if (!bool)
      return false; 
    float f1 = paramMotionEvent.getX();
    float f2 = (f1 - this.B) / this.T;
    this.h0 = f2;
    f2 = Math.max(0.0F, f2);
    this.h0 = f2;
    this.h0 = Math.min(1.0F, f2);
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      int j = this.s;
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            setPressed(this.I);
            this.G = MotionEvent.obtain(paramMotionEvent);
            return true;
          } 
        } else {
          if (!this.I) {
            if (i(paramMotionEvent) && Math.abs(f1 - this.F) < j)
              return false; 
            getParent().requestDisallowInterceptTouchEvent(true);
            o();
          } 
          if (p()) {
            this.I = true;
            t();
            v();
            invalidate();
          } 
          setPressed(this.I);
          this.G = MotionEvent.obtain(paramMotionEvent);
          return true;
        }  
      this.I = false;
      MotionEvent motionEvent = this.G;
      if (motionEvent != null && motionEvent.getActionMasked() == 0) {
        f1 = Math.abs(this.G.getX() - paramMotionEvent.getX());
        f2 = j;
        if (f1 <= f2 && Math.abs(this.G.getY() - paramMotionEvent.getY()) <= f2 && p())
          o(); 
      } 
      if (this.M != -1) {
        t();
        v();
        this.M = -1;
        ArrayList<MotionEvent> arrayList = this.o;
        i = arrayList.size();
        while (b < i) {
          motionEvent = arrayList.get(b);
          b++;
          ((dd)motionEvent).C(this);
        } 
      } 
      invalidate();
    } else {
      this.F = f1;
      if (!i(paramMotionEvent)) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (p()) {
          requestFocus();
          this.I = true;
          t();
          v();
          invalidate();
          o();
        } 
      } 
    } 
    setPressed(this.I);
    this.G = MotionEvent.obtain(paramMotionEvent);
    return true;
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt != 0) {
      a42 a42;
      ViewGroup viewGroup = n21.z(this);
      paramInt = 0;
      if (viewGroup == null) {
        viewGroup = null;
      } else {
        a42 = new a42(0, viewGroup);
      } 
      if (a42 != null) {
        ArrayList<Object> arrayList = this.m;
        int i = arrayList.size();
        while (paramInt < i) {
          qv1 qv1 = (qv1)arrayList.get(paramInt);
          paramInt++;
          qv1 = qv1;
          ((ViewGroup)a42.c).getOverlay().remove(qv1);
        } 
      } 
    } 
  }
  
  public final boolean p() {
    if (this.M == -1) {
      float f2 = this.h0;
      float f1 = f2;
      if (j())
        f1 = 1.0F - f2; 
      f2 = this.K;
      float f3 = this.J;
      float f4 = x41.e(f2, f3, f1, f3);
      float f5 = n(f4) * this.T + this.B;
      this.M = 0;
      f1 = Math.abs(((Float)this.L.get(0)).floatValue() - f4);
      byte b = 1;
      while (b < this.L.size()) {
        boolean bool;
        f3 = Math.abs(((Float)this.L.get(b)).floatValue() - f4);
        float f = n(((Float)this.L.get(b)).floatValue()) * this.T + this.B;
        if (Float.compare(f3, f1) > 1)
          break; 
        if (j() ? (f - f5 > 0.0F) : (f - f5 < 0.0F)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (Float.compare(f3, f1) < 0) {
          this.M = b;
        } else {
          f2 = f1;
          if (Float.compare(f3, f1) == 0) {
            if (Math.abs(f - f5) < this.s) {
              this.M = -1;
              return false;
            } 
            f2 = f1;
            if (bool) {
              this.M = b;
            } else {
              continue;
            } 
          } else {
            continue;
          } 
        } 
        f2 = f3;
        continue;
        b++;
        f1 = f2;
      } 
      if (this.M == -1)
        return false; 
    } 
    return true;
  }
  
  public final void q(qv1 paramqv1, float paramFloat) {
    a42 a42;
    paramqv1.C(e(paramFloat));
    int j = this.B + (int)(n(paramFloat) * this.T) - paramqv1.getIntrinsicWidth() / 2;
    int i = b() - this.E + this.C;
    paramqv1.setBounds(j, i - paramqv1.getIntrinsicHeight(), paramqv1.getIntrinsicWidth() + j, i);
    Rect rect = new Rect(paramqv1.getBounds());
    jy.c(n21.z(this), this, rect);
    paramqv1.setBounds(rect);
    ViewGroup viewGroup = n21.z(this);
    if (viewGroup == null) {
      viewGroup = null;
    } else {
      a42 = new a42(0, viewGroup);
    } 
    ((ViewGroup)a42.c).getOverlay().add(paramqv1);
  }
  
  public final void r(ArrayList<Comparable> paramArrayList) {
    if (!paramArrayList.isEmpty()) {
      Collections.sort(paramArrayList);
      if (this.L.size() == paramArrayList.size() && this.L.equals(paramArrayList))
        return; 
      this.L = paramArrayList;
      byte b = 1;
      this.V = true;
      this.N = 0;
      v();
      ArrayList<qv1> arrayList = this.m;
      if (arrayList.size() > this.L.size()) {
        List list = arrayList.subList(this.L.size(), arrayList.size());
        for (qv1 qv1 : list) {
          WeakHashMap weakHashMap = v22.a;
          if (isAttachedToWindow()) {
            a42 a42;
            ViewGroup viewGroup = n21.z(this);
            if (viewGroup == null) {
              viewGroup = null;
            } else {
              a42 = new a42(0, viewGroup);
            } 
            if (a42 != null) {
              ((ViewGroup)a42.c).getOverlay().remove(qv1);
              ViewGroup viewGroup1 = n21.z(this);
              if (viewGroup1 == null) {
                qv1.getClass();
                continue;
              } 
              viewGroup1.removeOnLayoutChangeListener(qv1.N);
            } 
          } 
        } 
        list.clear();
      } 
      while (arrayList.size() < this.L.size()) {
        qv1 qv1 = qv1.A(getContext(), this.l);
        arrayList.add(qv1);
        WeakHashMap weakHashMap = v22.a;
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
      if (arrayList.size() == 1)
        b = 0; 
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        paramArrayList = (ArrayList<Comparable>)arrayList.get(i);
        i++;
        ((qv1)paramArrayList).u(b);
      } 
      paramArrayList = this.n;
      int k = paramArrayList.size();
      i = 0;
      label53: while (i < k) {
        arrayList = (ArrayList<qv1>)paramArrayList.get(i);
        j = i + 1;
        cd cd = (cd)arrayList;
        arrayList = this.L;
        int m = arrayList.size();
        b = 0;
        while (true) {
          i = j;
          if (b < m) {
            Float float_ = (Float)arrayList.get(b);
            b++;
            cd.a(this, ((Float)float_).floatValue(), false);
            continue;
          } 
          continue label53;
        } 
      } 
      postInvalidate();
      return;
    } 
    l0.l("At least one value must be set");
  }
  
  public final boolean s(int paramInt, float paramFloat) {
    this.N = paramInt;
    double d = Math.abs(paramFloat - ((Float)this.L.get(paramInt)).floatValue());
    byte b = 0;
    if (d < 1.0E-4D)
      return false; 
    float f2 = getMinSeparation();
    float f1 = f2;
    if (this.i0 == 0)
      if (f2 == 0.0F) {
        f1 = 0.0F;
      } else {
        f1 = (f2 - this.B) / this.T;
        f2 = this.J;
        f1 = x41.e(f2, this.K, f1, f2);
      }  
    f2 = f1;
    if (j())
      f2 = -f1; 
    int i = paramInt + 1;
    if (i >= this.L.size()) {
      f1 = this.K;
    } else {
      f1 = ((Float)this.L.get(i)).floatValue() - f2;
    } 
    i = paramInt - 1;
    if (i < 0) {
      f2 = this.J;
    } else {
      f2 += ((Float)this.L.get(i)).floatValue();
    } 
    paramFloat = ui0.h(paramFloat, f2, f1);
    this.L.set(paramInt, Float.valueOf(paramFloat));
    ArrayList<Object> arrayList = this.n;
    i = arrayList.size();
    while (b < i) {
      cd cd = (cd)arrayList.get(b);
      b++;
      ((cd)cd).a(this, ((Float)this.L.get(paramInt)).floatValue(), true);
    } 
    AccessibilityManager accessibilityManager = this.j;
    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
      sd sd1 = this.k;
      if (sd1 == null) {
        this.k = new sd(this, 1);
      } else {
        removeCallbacks(sd1);
      } 
      sd1 = this.k;
      sd1.c = paramInt;
      postDelayed(sd1, 200L);
    } 
    return true;
  }
  
  public void setActiveThumbIndex(int paramInt) {
    this.M = paramInt;
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
  
  public abstract void setHaloRadius(int paramInt);
  
  public abstract void setHaloTintList(ColorStateList paramColorStateList);
  
  public abstract void setLabelBehavior(int paramInt);
  
  public void setSeparationUnit(int paramInt) {
    this.i0 = paramInt;
    this.V = true;
    postInvalidate();
  }
  
  public abstract void setThumbElevation(float paramFloat);
  
  public abstract void setThumbRadius(int paramInt);
  
  public abstract void setThumbStrokeColor(ColorStateList paramColorStateList);
  
  public abstract void setThumbStrokeWidth(float paramFloat);
  
  public abstract void setTickActiveRadius(int paramInt);
  
  public abstract void setTickActiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTickInactiveRadius(int paramInt);
  
  public abstract void setTickInactiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTrackActiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setTrackHeight(int paramInt);
  
  public abstract void setTrackInactiveTintList(ColorStateList paramColorStateList);
  
  public abstract void setValues(Float... paramVarArgs);
  
  public final void t() {
    double d1;
    float f2 = this.h0;
    float f1 = this.O;
    if (f1 > 0.0F) {
      int i = (int)((this.K - this.J) / f1);
      d1 = Math.round(f2 * i) / i;
    } else {
      d1 = f2;
    } 
    double d2 = d1;
    if (j())
      d2 = 1.0D - d1; 
    f1 = this.K;
    f2 = this.J;
    f1 = (float)(d2 * (f1 - f2) + f2);
    s(this.M, f1);
  }
  
  public final void u(int paramInt, Rect paramRect) {
    int k = this.B + (int)(n(((Float)getValues().get(paramInt)).floatValue()) * this.T);
    int j = b();
    paramInt = this.C;
    int i = this.x;
    if (paramInt <= i)
      paramInt = i; 
    paramInt /= 2;
    paramRect.set(k - paramInt, j - paramInt, k + paramInt, j + paramInt);
  }
  
  public final void v() {
    if (getBackground() instanceof android.graphics.drawable.RippleDrawable && getMeasuredWidth() > 0) {
      Drawable drawable = getBackground();
      if (drawable instanceof android.graphics.drawable.RippleDrawable) {
        int i = (int)(n(((Float)this.L.get(this.N)).floatValue()) * this.T + this.B);
        int k = b();
        int j = this.D;
        drawable.setHotspotBounds(i - j, k - j, i + j, k + j);
      } 
    } 
  }
  
  public final void w() {
    int m = getPaddingTop();
    int n = getPaddingBottom();
    int i = this.A;
    int j = this.C;
    int k = getPaddingTop();
    i = Math.max(i + n + m, getPaddingBottom() + k + j * 2);
    j = 0;
    i = Math.max(0, i);
    if (i == this.y) {
      i = 0;
    } else {
      this.y = i;
      i = 1;
    } 
    k = Math.max(this.C - this.t, 0);
    int i1 = Math.max((this.A - this.u) / 2, 0);
    m = Math.max(this.R - this.v, 0);
    n = Math.max(this.S - this.w, 0);
    k = Math.max(Math.max(k, i1), Math.max(m, n));
    if (this.B != k) {
      this.B = k;
      WeakHashMap weakHashMap = v22.a;
      if (isLaidOut()) {
        this.T = Math.max(getWidth() - this.B * 2, 0);
        k();
      } 
      j = 1;
    } 
    if (i != 0) {
      requestLayout();
      return;
    } 
    if (j != 0)
      postInvalidate(); 
  }
  
  public final void x() {
    if (this.V) {
      float f2 = this.J;
      float f1 = this.K;
      if (f2 < f1) {
        if (f1 > f2) {
          if (this.O <= 0.0F || h(f1 - f2)) {
            ArrayList<Object> arrayList = this.L;
            int j = arrayList.size();
            int i = 0;
            while (i < j) {
              Float float_ = (Float)arrayList.get(i);
              int k = i + 1;
              float_ = float_;
              if (float_.floatValue() >= this.J && float_.floatValue() <= this.K) {
                i = k;
                if (this.O > 0.0F) {
                  if (h(float_.floatValue() - this.J)) {
                    i = k;
                    continue;
                  } 
                  f1 = this.J;
                  f2 = this.O;
                  StringBuilder stringBuilder3 = new StringBuilder("Value(");
                  stringBuilder3.append(float_);
                  stringBuilder3.append(") must be equal to valueFrom(");
                  stringBuilder3.append(f1);
                  stringBuilder3.append(") plus a multiple of stepSize(");
                  stringBuilder3.append(f2);
                  stringBuilder3.append(") when using stepSize(");
                  stringBuilder3.append(f2);
                  stringBuilder3.append(")");
                  throw new IllegalStateException(stringBuilder3.toString());
                } 
                continue;
              } 
              f1 = this.J;
              f2 = this.K;
              StringBuilder stringBuilder2 = new StringBuilder("Slider value(");
              stringBuilder2.append(float_);
              stringBuilder2.append(") must be greater or equal to valueFrom(");
              stringBuilder2.append(f1);
              stringBuilder2.append("), and lower or equal to valueTo(");
              stringBuilder2.append(f2);
              stringBuilder2.append(")");
              throw new IllegalStateException(stringBuilder2.toString());
            } 
            f1 = getMinSeparation();
            if (f1 >= 0.0F) {
              f2 = this.O;
              if (f2 > 0.0F && f1 > 0.0F)
                if (this.i0 == 1) {
                  if (f1 < f2 || !h(f1)) {
                    f2 = this.O;
                    StringBuilder stringBuilder2 = new StringBuilder("minSeparation(");
                    stringBuilder2.append(f1);
                    stringBuilder2.append(PwbbJfsdcHrAjW.mUlxOoRh);
                    stringBuilder2.append(f2);
                    stringBuilder2.append(") when using stepSize(");
                    stringBuilder2.append(f2);
                    stringBuilder2.append(")");
                    throw new IllegalStateException(stringBuilder2.toString());
                  } 
                } else {
                  l0.g("minSeparation(", f1, ") cannot be set as a dimension when using stepSize(", f2);
                  return;
                }  
              f1 = this.O;
              if (f1 != 0.0F) {
                if ((int)f1 != f1) {
                  StringBuilder stringBuilder2 = new StringBuilder("Floating point value used for stepSize(");
                  stringBuilder2.append(f1);
                  stringBuilder2.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("xd", stringBuilder2.toString());
                } 
                f1 = this.J;
                if ((int)f1 != f1) {
                  StringBuilder stringBuilder2 = new StringBuilder("Floating point value used for valueFrom(");
                  stringBuilder2.append(f1);
                  stringBuilder2.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("xd", stringBuilder2.toString());
                } 
                f1 = this.K;
                if ((int)f1 != f1) {
                  StringBuilder stringBuilder2 = new StringBuilder("Floating point value used for valueTo(");
                  stringBuilder2.append(f1);
                  stringBuilder2.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                  Log.w("xd", stringBuilder2.toString());
                } 
              } 
              this.V = false;
              return;
            } 
            StringBuilder stringBuilder1 = new StringBuilder("minSeparation(");
            stringBuilder1.append(f1);
            stringBuilder1.append(") must be greater or equal to 0");
            throw new IllegalStateException(stringBuilder1.toString());
          } 
          float f = this.O;
          f2 = this.J;
          f1 = this.K;
          StringBuilder stringBuilder = new StringBuilder("The stepSize(");
          stringBuilder.append(f);
          stringBuilder.append(") must be 0, or a factor of the valueFrom(");
          stringBuilder.append(f2);
          stringBuilder.append(")-valueTo(");
          stringBuilder.append(f1);
          stringBuilder.append(") range");
          throw new IllegalStateException(stringBuilder.toString());
        } 
        l0.g("valueTo(", f1, ") must be greater than valueFrom(", f2);
        return;
      } 
      l0.g("valueFrom(", f2, ") must be smaller than valueTo(", f1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */