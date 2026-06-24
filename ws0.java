import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

public class ws0 extends Drawable implements gm1 {
  public static final Paint H;
  
  public static final vs0[] I = new vs0[4];
  
  public boolean A;
  
  public vl1 B;
  
  public mo1 C;
  
  public final lo1[] D;
  
  public float[] E;
  
  public float[] F;
  
  public f G;
  
  public final ts0 b;
  
  public us0 c;
  
  public final em1[] e;
  
  public final em1[] f;
  
  public final BitSet g;
  
  public boolean h;
  
  public boolean i;
  
  public final Matrix j;
  
  public final Path k;
  
  public final Path l;
  
  public final RectF m;
  
  public final RectF n;
  
  public final Region o;
  
  public final Region p;
  
  public final Paint q;
  
  public final Paint r;
  
  public final tl1 s;
  
  public final ts0 t;
  
  public final xl1 u;
  
  public PorterDuffColorFilter v;
  
  public PorterDuffColorFilter w;
  
  public int x;
  
  public final RectF y;
  
  public boolean z;
  
  static {
    byte b = 0;
    while (true) {
      vs0[] arrayOfVs0 = I;
      if (b < arrayOfVs0.length) {
        arrayOfVs0[b] = new vs0(b);
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public ws0() {
    this(new vl1());
  }
  
  public ws0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this(vl1.b(paramContext, paramAttributeSet, paramInt1, paramInt2).a());
  }
  
  public ws0(us0 paramus0) {
    xl1 xl11;
    this.b = new ts0(this);
    this.e = new em1[4];
    this.f = new em1[4];
    this.g = new BitSet(8);
    this.j = new Matrix();
    this.k = new Path();
    this.l = new Path();
    this.m = new RectF();
    this.n = new RectF();
    this.o = new Region();
    this.p = new Region();
    Paint paint1 = new Paint(1);
    this.q = paint1;
    Paint paint2 = new Paint(1);
    this.r = paint2;
    this.s = new tl1();
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      xl11 = wl1.a;
    } else {
      xl11 = new xl1();
    } 
    this.u = xl11;
    this.y = new RectF();
    this.z = true;
    this.A = true;
    this.D = new lo1[4];
    this.c = paramus0;
    paint2.setStyle(Paint.Style.STROKE);
    paint1.setStyle(Paint.Style.FILL);
    x();
    v(getState());
    this.t = new ts0(this);
  }
  
  public ws0(vl1 paramvl1) {
    this(new us0(paramvl1));
  }
  
  public static float c(RectF paramRectF, vl1 paramvl1, float[] paramArrayOffloat) {
    if (paramArrayOffloat == null) {
      if (paramvl1.e(paramRectF))
        return paramvl1.e.a(paramRectF); 
    } else {
      float f1;
      int i = paramArrayOffloat.length;
      byte b = 1;
      if (i > 1) {
        f1 = paramArrayOffloat[0];
        while (b < paramArrayOffloat.length) {
          if (paramArrayOffloat[b] == f1) {
            b++;
            continue;
          } 
          return -1.0F;
        } 
      } 
      if (paramvl1.d())
        return paramArrayOffloat[0]; 
      while (b < paramArrayOffloat.length) {
        if (paramArrayOffloat[b] == f1) {
          b++;
          continue;
        } 
        return -1.0F;
      } 
    } 
    return -1.0F;
  }
  
  public void a() {
    invalidateSelf();
  }
  
  public final void b(RectF paramRectF, Path paramPath) {
    us0 us01 = this.c;
    vl1 vl11 = us01.a;
    float[] arrayOfFloat = this.E;
    float f1 = us01.j;
    ts0 ts01 = this.t;
    this.u.a(vl11, arrayOfFloat, f1, paramRectF, ts01, paramPath);
    if (this.c.i != 1.0F) {
      Matrix matrix = this.j;
      matrix.reset();
      f1 = this.c.i;
      matrix.setScale(f1, f1, paramRectF.width() / 2.0F, paramRectF.height() / 2.0F);
      paramPath.transform(matrix);
    } 
    paramPath.computeBounds(this.y, true);
  }
  
  public final void d(Canvas paramCanvas) {
    if (this.g.cardinality() > 0)
      Log.w("ws0", "Compatibility shadow requested but can't be drawn for all operations in this shape."); 
    int i = this.c.q;
    Path path = this.k;
    tl1 tl11 = this.s;
    if (i != 0)
      paramCanvas.drawPath(path, tl11.a); 
    for (i = 0; i < 4; i++) {
      em1 em11 = this.e[i];
      int j = this.c.p;
      Matrix matrix = em1.b;
      em11.a(matrix, tl11, j, paramCanvas);
      this.f[i].a(matrix, tl11, this.c.p, paramCanvas);
    } 
    if (this.z) {
      double d = this.c.q;
      i = (int)(Math.sin(Math.toRadians(0.0D)) * d);
      d = this.c.q;
      int j = (int)(Math.cos(Math.toRadians(0.0D)) * d);
      paramCanvas.translate(-i, -j);
      paramCanvas.drawPath(path, H);
      paramCanvas.translate(i, j);
    } 
  }
  
  public void draw(Canvas paramCanvas) {
    PorterDuffColorFilter porterDuffColorFilter1 = this.v;
    Paint paint1 = this.q;
    paint1.setColorFilter((ColorFilter)porterDuffColorFilter1);
    int j = paint1.getAlpha();
    int i = this.c.l;
    paint1.setAlpha((i + (i >>> 7)) * j >>> 8);
    PorterDuffColorFilter porterDuffColorFilter2 = this.w;
    Paint paint2 = this.r;
    paint2.setColorFilter((ColorFilter)porterDuffColorFilter2);
    paint2.setStrokeWidth(this.c.k);
    int k = paint2.getAlpha();
    i = this.c.l;
    paint2.setAlpha((i + (i >>> 7)) * k >>> 8);
    Paint.Style style = this.c.r;
    if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
      boolean bool = this.h;
      Path path = this.k;
      if (bool) {
        b(f(), path);
        this.h = false;
      } 
      us0 us01 = this.c;
      i = us01.o;
      if (i != 1 && us01.p > 0 && (i == 2 || (!l() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
        paramCanvas.save();
        int m = (int)(this.c.q * Math.sin(Math.toRadians(0.0D)));
        double d = this.c.q;
        i = (int)(Math.cos(Math.toRadians(0.0D)) * d);
        paramCanvas.translate(m, i);
        if (!this.z) {
          d(paramCanvas);
          paramCanvas.restore();
        } else {
          RectF rectF1 = this.y;
          int n = (int)(rectF1.width() - getBounds().width());
          i = (int)(rectF1.height() - getBounds().height());
          if (n >= 0 && i >= 0) {
            int i2 = (int)rectF1.width();
            int i1 = this.c.p;
            m = (int)rectF1.height();
            Bitmap bitmap = Bitmap.createBitmap(i1 * 2 + i2 + n, this.c.p * 2 + m + i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float f2 = ((getBounds()).left - this.c.p - n);
            float f3 = ((getBounds()).top - this.c.p - i);
            canvas.translate(-f2, -f3);
            d(canvas);
            paramCanvas.drawBitmap(bitmap, f2, f3, null);
            bitmap.recycle();
            paramCanvas.restore();
          } else {
            tp.f("Invalid shadow bounds. Check that the treatments result in a valid path.");
            return;
          } 
        } 
      } 
      vl1 vl11 = this.c.a;
      float[] arrayOfFloat = this.E;
      RectF rectF = f();
      float f1 = c(rectF, vl11, arrayOfFloat);
      if (f1 >= 0.0F) {
        f1 *= this.c.j;
        paramCanvas.drawRoundRect(rectF, f1, f1, paint1);
      } else {
        paramCanvas.drawPath(path, paint1);
      } 
    } 
    if (j()) {
      if (this.i) {
        vl1 vl12 = this.c.a;
        ul1 ul1 = vl12.f();
        ls ls = vl12.e;
        ts0 ts01 = this.b;
        ul1.e = ts01.a(ls);
        ul1.f = ts01.a(vl12.f);
        ul1.h = ts01.a(vl12.h);
        ul1.g = ts01.a(vl12.g);
        this.B = ul1.a();
        float[] arrayOfFloat = this.E;
        if (arrayOfFloat == null) {
          this.F = null;
        } else {
          if (this.F == null)
            this.F = new float[arrayOfFloat.length]; 
          float f3 = h();
          i = 0;
          while (true) {
            arrayOfFloat = this.E;
            if (i < arrayOfFloat.length) {
              this.F[i] = Math.max(0.0F, arrayOfFloat[i] - f3);
              i++;
              continue;
            } 
            break;
          } 
        } 
        vl1 vl11 = this.B;
        arrayOfFloat = this.F;
        float f2 = this.c.j;
        RectF rectF2 = f();
        RectF rectF1 = this.n;
        rectF1.set(rectF2);
        float f1 = h();
        rectF1.inset(f1, f1);
        Path path = this.l;
        this.u.a(vl11, arrayOfFloat, f2, rectF1, null, path);
        this.i = false;
      } 
      e(paramCanvas);
    } 
    paint1.setAlpha(j);
    paint2.setAlpha(k);
  }
  
  public void e(Canvas paramCanvas) {
    vl1 vl11 = this.B;
    float[] arrayOfFloat = this.F;
    RectF rectF2 = f();
    RectF rectF1 = this.n;
    rectF1.set(rectF2);
    float f1 = h();
    rectF1.inset(f1, f1);
    f1 = c(rectF1, vl11, arrayOfFloat);
    Paint paint = this.r;
    if (f1 >= 0.0F) {
      f1 *= this.c.j;
      paramCanvas.drawRoundRect(rectF1, f1, f1, paint);
      return;
    } 
    paramCanvas.drawPath(this.l, paint);
  }
  
  public final RectF f() {
    Rect rect = getBounds();
    RectF rectF = this.m;
    rectF.set(rect);
    return rectF;
  }
  
  public final float g() {
    float[] arrayOfFloat = this.E;
    if (arrayOfFloat != null)
      return (arrayOfFloat[3] + arrayOfFloat[2] - arrayOfFloat[1] - arrayOfFloat[0]) / 2.0F; 
    RectF rectF = f();
    vl1 vl11 = this.c.a;
    xl1 xl11 = this.u;
    xl11.getClass();
    float f3 = vl11.e.a(rectF);
    vl11 = this.c.a;
    xl11.getClass();
    float f2 = vl11.h.a(rectF);
    vl11 = this.c.a;
    xl11.getClass();
    float f1 = vl11.g.a(rectF);
    vl11 = this.c.a;
    xl11.getClass();
    return (f2 + f3 - f1 - vl11.f.a(rectF)) / 2.0F;
  }
  
  public final int getAlpha() {
    return this.c.l;
  }
  
  public final Drawable.ConstantState getConstantState() {
    return this.c;
  }
  
  public final int getOpacity() {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline) {
    if (this.c.o != 2) {
      RectF rectF = f();
      if (!rectF.isEmpty()) {
        float f1 = c(rectF, this.c.a, this.E);
        if (f1 >= 0.0F) {
          paramOutline.setRoundRect(getBounds(), f1 * this.c.j);
          return;
        } 
        boolean bool = this.h;
        Path path = this.k;
        if (bool) {
          b(rectF, path);
          this.h = false;
        } 
        p8.i(paramOutline, path);
        return;
      } 
    } 
  }
  
  public final boolean getPadding(Rect paramRect) {
    Rect rect = this.c.h;
    if (rect != null) {
      paramRect.set(rect);
      return true;
    } 
    return super.getPadding(paramRect);
  }
  
  public final Region getTransparentRegion() {
    Rect rect = getBounds();
    Region region1 = this.o;
    region1.set(rect);
    RectF rectF = f();
    Path path = this.k;
    b(rectF, path);
    Region region2 = this.p;
    region2.setPath(path, region1);
    region1.op(region2, Region.Op.DIFFERENCE);
    return region1;
  }
  
  public final float h() {
    return j() ? (this.r.getStrokeWidth() / 2.0F) : 0.0F;
  }
  
  public final float i() {
    float[] arrayOfFloat = this.E;
    return (arrayOfFloat != null) ? arrayOfFloat[3] : this.c.a.e.a(f());
  }
  
  public final void invalidateSelf() {
    this.h = true;
    this.i = true;
    super.invalidateSelf();
  }
  
  public boolean isStateful() {
    if (!super.isStateful()) {
      ColorStateList colorStateList = this.c.f;
      if (colorStateList == null || !colorStateList.isStateful()) {
        this.c.getClass();
        colorStateList = this.c.e;
        if (colorStateList == null || !colorStateList.isStateful()) {
          colorStateList = this.c.d;
          if (colorStateList == null || !colorStateList.isStateful()) {
            mp1 mp1 = this.c.b;
            if (mp1 == null || !mp1.d())
              return false; 
          } 
        } 
      } 
    } 
    return true;
  }
  
  public final boolean j() {
    Paint.Style style = this.c.r;
    return ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0F);
  }
  
  public final void k(Context paramContext) {
    this.c.c = new o30(paramContext);
    y();
  }
  
  public final boolean l() {
    if (!this.c.a.e(f())) {
      float[] arrayOfFloat = this.E;
      if (arrayOfFloat != null) {
        if (arrayOfFloat.length > 1) {
          float f1 = arrayOfFloat[0];
          for (byte b = 1; b < arrayOfFloat.length; b++) {
            if (arrayOfFloat[b] != f1)
              // Byte code: goto -> 80 
          } 
        } 
        if (this.c.a.d())
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  public final void m(mo1 parammo1) {
    if (this.C != parammo1) {
      this.C = parammo1;
      byte b = 0;
      while (true) {
        lo1[] arrayOfLo1 = this.D;
        if (b < arrayOfLo1.length) {
          if (arrayOfLo1[b] == null)
            arrayOfLo1[b] = new lo1(this, I[b]); 
          lo1 lo11 = arrayOfLo1[b];
          mo1 mo11 = new mo1();
          mo11.a((float)parammo1.b);
          double d = parammo1.a;
          mo11.b((float)(d * d));
          lo11.m = mo11;
          b++;
          continue;
        } 
        w(getState(), true);
        invalidateSelf();
        break;
      } 
    } 
  }
  
  public Drawable mutate() {
    this.c = new us0(this.c);
    return this;
  }
  
  public final void n(float paramFloat) {
    us0 us01 = this.c;
    if (us01.n != paramFloat) {
      us01.n = paramFloat;
      y();
    } 
  }
  
  public final void o(ColorStateList paramColorStateList) {
    us0 us01 = this.c;
    if (us01.d != paramColorStateList) {
      us01.d = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public void onBoundsChange(Rect paramRect) {
    this.h = true;
    this.i = true;
    super.onBoundsChange(paramRect);
    if (this.c.b != null && !paramRect.isEmpty())
      w(getState(), this.A); 
    this.A = paramRect.isEmpty();
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    mp1 mp1 = this.c.b;
    boolean bool = false;
    if (mp1 != null)
      w(paramArrayOfint, false); 
    boolean bool2 = v(paramArrayOfint);
    boolean bool1 = x();
    if (bool2 || bool1)
      bool = true; 
    if (bool)
      invalidateSelf(); 
    return bool;
  }
  
  public final void p(float paramFloat) {
    us0 us01 = this.c;
    if (us01.j != paramFloat) {
      us01.j = paramFloat;
      this.h = true;
      this.i = true;
      invalidateSelf();
    } 
  }
  
  public final void q() {
    this.s.a(-12303292);
    this.c.getClass();
    super.invalidateSelf();
  }
  
  public final void r() {
    us0 us01 = this.c;
    if (us01.o != 2) {
      us01.o = 2;
      super.invalidateSelf();
    } 
  }
  
  public final void s(mp1 parammp1) {
    us0 us01 = this.c;
    if (us01.b != parammp1) {
      us01.b = parammp1;
      w(getState(), true);
      invalidateSelf();
    } 
  }
  
  public final void setAlpha(int paramInt) {
    us0 us01 = this.c;
    if (us01.l != paramInt) {
      us01.l = paramInt;
      super.invalidateSelf();
    } 
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    this.c.getClass();
    super.invalidateSelf();
  }
  
  public final void setShapeAppearanceModel(vl1 paramvl1) {
    us0 us01 = this.c;
    us01.a = paramvl1;
    us01.b = null;
    this.E = null;
    this.F = null;
    invalidateSelf();
  }
  
  public final void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList) {
    this.c.f = paramColorStateList;
    x();
    super.invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode) {
    us0 us01 = this.c;
    if (us01.g != paramMode) {
      us01.g = paramMode;
      x();
      super.invalidateSelf();
    } 
  }
  
  public final void t(ColorStateList paramColorStateList) {
    us0 us01 = this.c;
    if (us01.e != paramColorStateList) {
      us01.e = paramColorStateList;
      onStateChange(getState());
    } 
  }
  
  public final void u(float paramFloat) {
    this.c.k = paramFloat;
    invalidateSelf();
  }
  
  public final boolean v(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lus0;
    //   4: getfield d : Landroid/content/res/ColorStateList;
    //   7: ifnull -> 52
    //   10: aload_0
    //   11: getfield q : Landroid/graphics/Paint;
    //   14: astore #5
    //   16: aload #5
    //   18: invokevirtual getColor : ()I
    //   21: istore_3
    //   22: aload_0
    //   23: getfield c : Lus0;
    //   26: getfield d : Landroid/content/res/ColorStateList;
    //   29: aload_1
    //   30: iload_3
    //   31: invokevirtual getColorForState : ([II)I
    //   34: istore_2
    //   35: iload_3
    //   36: iload_2
    //   37: if_icmpeq -> 52
    //   40: aload #5
    //   42: iload_2
    //   43: invokevirtual setColor : (I)V
    //   46: iconst_1
    //   47: istore #4
    //   49: goto -> 55
    //   52: iconst_0
    //   53: istore #4
    //   55: aload_0
    //   56: getfield c : Lus0;
    //   59: getfield e : Landroid/content/res/ColorStateList;
    //   62: ifnull -> 103
    //   65: aload_0
    //   66: getfield r : Landroid/graphics/Paint;
    //   69: astore #5
    //   71: aload #5
    //   73: invokevirtual getColor : ()I
    //   76: istore_3
    //   77: aload_0
    //   78: getfield c : Lus0;
    //   81: getfield e : Landroid/content/res/ColorStateList;
    //   84: aload_1
    //   85: iload_3
    //   86: invokevirtual getColorForState : ([II)I
    //   89: istore_2
    //   90: iload_3
    //   91: iload_2
    //   92: if_icmpeq -> 103
    //   95: aload #5
    //   97: iload_2
    //   98: invokevirtual setColor : (I)V
    //   101: iconst_1
    //   102: ireturn
    //   103: iload #4
    //   105: ireturn
  }
  
  public final void w(int[] paramArrayOfint, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()Landroid/graphics/RectF;
    //   4: astore #9
    //   6: aload_0
    //   7: getfield c : Lus0;
    //   10: getfield b : Lmp1;
    //   13: ifnull -> 458
    //   16: aload #9
    //   18: invokevirtual isEmpty : ()Z
    //   21: ifeq -> 27
    //   24: goto -> 458
    //   27: aload_0
    //   28: getfield C : Lmo1;
    //   31: ifnonnull -> 40
    //   34: iconst_1
    //   35: istore #4
    //   37: goto -> 43
    //   40: iconst_0
    //   41: istore #4
    //   43: iload_2
    //   44: iload #4
    //   46: ior
    //   47: istore #6
    //   49: aload_0
    //   50: getfield E : [F
    //   53: ifnonnull -> 63
    //   56: aload_0
    //   57: iconst_4
    //   58: newarray float
    //   60: putfield E : [F
    //   63: aload_0
    //   64: getfield c : Lus0;
    //   67: getfield b : Lmp1;
    //   70: astore #12
    //   72: aload #12
    //   74: getfield d : [Lvl1;
    //   77: astore #13
    //   79: aload #12
    //   81: getfield a : I
    //   84: istore #7
    //   86: aload #12
    //   88: getfield c : [[I
    //   91: astore #14
    //   93: aload #12
    //   95: getfield h : Lkp1;
    //   98: astore #10
    //   100: aload #12
    //   102: getfield g : Lkp1;
    //   105: astore #11
    //   107: aload #12
    //   109: getfield f : Lkp1;
    //   112: astore #8
    //   114: aload #12
    //   116: getfield e : Lkp1;
    //   119: astore #12
    //   121: iconst_0
    //   122: istore #4
    //   124: iload #4
    //   126: iload #7
    //   128: if_icmpge -> 152
    //   131: aload #14
    //   133: iload #4
    //   135: aaload
    //   136: aload_1
    //   137: invokestatic stateSetMatches : ([I[I)Z
    //   140: ifeq -> 146
    //   143: goto -> 155
    //   146: iinc #4, 1
    //   149: goto -> 124
    //   152: iconst_m1
    //   153: istore #4
    //   155: iload #4
    //   157: istore #5
    //   159: iload #4
    //   161: ifge -> 208
    //   164: getstatic android/util/StateSet.WILD_CARD : [I
    //   167: astore #15
    //   169: iconst_0
    //   170: istore #4
    //   172: iload #4
    //   174: iload #7
    //   176: if_icmpge -> 201
    //   179: aload #14
    //   181: iload #4
    //   183: aaload
    //   184: aload #15
    //   186: invokestatic stateSetMatches : ([I[I)Z
    //   189: ifeq -> 195
    //   192: goto -> 204
    //   195: iinc #4, 1
    //   198: goto -> 172
    //   201: iconst_m1
    //   202: istore #4
    //   204: iload #4
    //   206: istore #5
    //   208: aload #12
    //   210: ifnonnull -> 238
    //   213: aload #8
    //   215: ifnonnull -> 238
    //   218: aload #11
    //   220: ifnonnull -> 238
    //   223: aload #10
    //   225: ifnonnull -> 238
    //   228: aload #13
    //   230: iload #5
    //   232: aaload
    //   233: astore #8
    //   235: goto -> 319
    //   238: aload #13
    //   240: iload #5
    //   242: aaload
    //   243: invokevirtual f : ()Lul1;
    //   246: astore #13
    //   248: aload #12
    //   250: ifnull -> 264
    //   253: aload #13
    //   255: aload #12
    //   257: aload_1
    //   258: invokevirtual c : ([I)Lls;
    //   261: putfield e : Lls;
    //   264: aload #8
    //   266: ifnull -> 280
    //   269: aload #13
    //   271: aload #8
    //   273: aload_1
    //   274: invokevirtual c : ([I)Lls;
    //   277: putfield f : Lls;
    //   280: aload #11
    //   282: ifnull -> 296
    //   285: aload #13
    //   287: aload #11
    //   289: aload_1
    //   290: invokevirtual c : ([I)Lls;
    //   293: putfield h : Lls;
    //   296: aload #10
    //   298: ifnull -> 312
    //   301: aload #13
    //   303: aload #10
    //   305: aload_1
    //   306: invokevirtual c : ([I)Lls;
    //   309: putfield g : Lls;
    //   312: aload #13
    //   314: invokevirtual a : ()Lvl1;
    //   317: astore #8
    //   319: iconst_0
    //   320: istore #4
    //   322: iload #4
    //   324: iconst_4
    //   325: if_icmpge -> 449
    //   328: aload_0
    //   329: getfield u : Lxl1;
    //   332: invokevirtual getClass : ()Ljava/lang/Class;
    //   335: pop
    //   336: iload #4
    //   338: iconst_1
    //   339: if_icmpeq -> 381
    //   342: iload #4
    //   344: iconst_2
    //   345: if_icmpeq -> 372
    //   348: iload #4
    //   350: iconst_3
    //   351: if_icmpeq -> 363
    //   354: aload #8
    //   356: getfield f : Lls;
    //   359: astore_1
    //   360: goto -> 387
    //   363: aload #8
    //   365: getfield e : Lls;
    //   368: astore_1
    //   369: goto -> 387
    //   372: aload #8
    //   374: getfield h : Lls;
    //   377: astore_1
    //   378: goto -> 387
    //   381: aload #8
    //   383: getfield g : Lls;
    //   386: astore_1
    //   387: aload_1
    //   388: aload #9
    //   390: invokeinterface a : (Landroid/graphics/RectF;)F
    //   395: fstore_3
    //   396: iload #6
    //   398: ifeq -> 409
    //   401: aload_0
    //   402: getfield E : [F
    //   405: iload #4
    //   407: fload_3
    //   408: fastore
    //   409: aload_0
    //   410: getfield D : [Llo1;
    //   413: astore #10
    //   415: aload #10
    //   417: iload #4
    //   419: aaload
    //   420: astore_1
    //   421: aload_1
    //   422: ifnull -> 443
    //   425: aload_1
    //   426: fload_3
    //   427: invokevirtual a : (F)V
    //   430: iload #6
    //   432: ifeq -> 443
    //   435: aload #10
    //   437: iload #4
    //   439: aaload
    //   440: invokevirtual d : ()V
    //   443: iinc #4, 1
    //   446: goto -> 322
    //   449: iload #6
    //   451: ifeq -> 458
    //   454: aload_0
    //   455: invokevirtual invalidateSelf : ()V
    //   458: return
  }
  
  public final boolean x() {
    o30 o30;
    PorterDuffColorFilter porterDuffColorFilter1;
    PorterDuffColorFilter porterDuffColorFilter3 = this.v;
    PorterDuffColorFilter porterDuffColorFilter2 = this.w;
    us0 us01 = this.c;
    ColorStateList colorStateList = us01.f;
    PorterDuff.Mode mode = us01.g;
    if (colorStateList == null || mode == null) {
      int i;
      int j = this.q.getColor();
      us0 us02 = this.c;
      float f2 = us02.n;
      float f1 = us02.m;
      o30 = us02.c;
      if (o30 != null) {
        i = o30.a(j, f2 + 0.0F + f1);
      } else {
        i = j;
      } 
      this.x = i;
      if (i != j) {
        porterDuffColorFilter1 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
      } else {
        o30 = null;
      } 
    } else {
      int j = colorStateList.getColorForState(getState(), 0);
      us0 us02 = this.c;
      float f1 = us02.n;
      float f2 = us02.m;
      o30 o301 = us02.c;
      int i = j;
      if (o301 != null)
        i = o301.a(j, f1 + 0.0F + f2); 
      this.x = i;
      porterDuffColorFilter1 = new PorterDuffColorFilter(i, (PorterDuff.Mode)o30);
    } 
    this.v = porterDuffColorFilter1;
    this.c.getClass();
    this.w = null;
    this.c.getClass();
    return (!Objects.equals(porterDuffColorFilter3, this.v) || !Objects.equals(porterDuffColorFilter2, this.w));
  }
  
  public final void y() {
    us0 us01 = this.c;
    float f1 = us01.n + 0.0F;
    us01.p = (int)Math.ceil((0.75F * f1));
    this.c.q = (int)Math.ceil((f1 * 0.25F));
    x();
    super.invalidateSelf();
  }
  
  static {
    Paint paint = new Paint(1);
    H = paint;
    paint.setColor(-1);
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ws0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */