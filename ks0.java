import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

public final class ks0 {
  static {
    if (Build.VERSION.SDK_INT <= 28) {
      colorDrawable = new ColorDrawable();
    } else {
      colorDrawable = null;
    } 
    z = colorDrawable;
  }
  
  public ks0(MaterialCardView paramMaterialCardView, AttributeSet paramAttributeSet, int paramInt) {
    this.a = paramMaterialCardView;
    ws0 ws01 = new ws0(paramMaterialCardView.getContext(), paramAttributeSet, paramInt, 2131952863);
    this.c = ws01;
    ws01.k(paramMaterialCardView.getContext());
    ws01.q();
    ul1 ul1 = ws01.c.a.f();
    TypedArray typedArray = paramMaterialCardView.getContext().obtainStyledAttributes(paramAttributeSet, ec1.a, paramInt, 2131951913);
    if (typedArray.hasValue(3)) {
      float f = typedArray.getDimension(3, 0.0F);
      ul1.e = new k(f);
      ul1.f = new k(f);
      ul1.g = new k(f);
      ul1.h = new k(f);
    } 
    this.d = new ws0();
    h(ul1.a());
    this.u = zo2.Q(paramMaterialCardView.getContext(), 2130969701, (TimeInterpolator)g5.a);
    this.v = zo2.P(paramMaterialCardView.getContext(), 2130969691, 300);
    this.w = zo2.P(paramMaterialCardView.getContext(), 2130969690, 300);
    typedArray.recycle();
  }
  
  public static float b(z51 paramz51, float paramFloat) {
    return (paramz51 instanceof lh1) ? (float)((1.0D - y) * paramFloat) : ((paramz51 instanceof qt) ? (paramFloat / 2.0F) : 0.0F);
  }
  
  public final float a() {
    float f1;
    z51 z511 = this.m.a;
    ws0 ws01 = this.c;
    float f2 = b(z511, ws01.i());
    z511 = this.m.b;
    float[] arrayOfFloat2 = ws01.E;
    if (arrayOfFloat2 != null) {
      f1 = arrayOfFloat2[0];
    } else {
      f1 = ws01.c.a.f.a(ws01.f());
    } 
    f2 = Math.max(f2, b(z511, f1));
    z511 = this.m.c;
    arrayOfFloat2 = ws01.E;
    if (arrayOfFloat2 != null) {
      f1 = arrayOfFloat2[1];
    } else {
      f1 = ws01.c.a.g.a(ws01.f());
    } 
    float f3 = b(z511, f1);
    z51 z512 = this.m.d;
    float[] arrayOfFloat1 = ws01.E;
    if (arrayOfFloat1 != null) {
      f1 = arrayOfFloat1[2];
    } else {
      f1 = ws01.c.a.h.a(ws01.f());
    } 
    return Math.max(f2, Math.max(f3, b(z512, f1)));
  }
  
  public final LayerDrawable c() {
    if (this.o == null) {
      this.q = new ws0(this.m);
      this.o = new RippleDrawable(this.k, null, this.q);
    } 
    if (this.p == null) {
      RippleDrawable rippleDrawable = this.o;
      Drawable drawable = this.j;
      LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)rippleDrawable, this.d, drawable });
      this.p = layerDrawable;
      layerDrawable.setId(2, 2131297226);
    } 
    return this.p;
  }
  
  public final js0 d(Drawable paramDrawable) {
    boolean bool1;
    boolean bool2;
    MaterialCardView materialCardView = this.a;
    if (materialCardView.getUseCompatPadding()) {
      float f3 = materialCardView.getMaxCardElevation();
      boolean bool = i();
      float f2 = 0.0F;
      if (bool) {
        f1 = a();
      } else {
        f1 = 0.0F;
      } 
      bool1 = (int)Math.ceil((f3 * 1.5F + f1));
      f3 = materialCardView.getMaxCardElevation();
      float f1 = f2;
      if (i())
        f1 = a(); 
      bool2 = (int)Math.ceil((f3 + f1));
    } else {
      bool2 = false;
      bool1 = false;
    } 
    return (js0)new InsetDrawable(paramDrawable, bool2, bool1, bool2, bool1);
  }
  
  public final void e(int paramInt1, int paramInt2) {
    if (this.p != null) {
      int i;
      byte b;
      int k;
      MaterialCardView materialCardView = this.a;
      boolean bool = materialCardView.getUseCompatPadding();
      boolean bool2 = false;
      if (bool) {
        float f3 = materialCardView.getMaxCardElevation();
        bool = i();
        float f2 = 0.0F;
        if (bool) {
          f1 = a();
        } else {
          f1 = 0.0F;
        } 
        b = (int)Math.ceil(((f3 * 1.5F + f1) * 2.0F));
        f3 = materialCardView.getMaxCardElevation();
        float f1 = f2;
        if (i())
          f1 = a(); 
        m = (int)Math.ceil(((f3 + f1) * 2.0F));
      } else {
        b = 0;
        m = 0;
      } 
      int n = this.g;
      if ((n & 0x800005) == 8388613) {
        i = 1;
      } else {
        i = 0;
      } 
      int j = this.e;
      if (i) {
        i = paramInt1 - j - this.f - m;
      } else {
        i = j;
      } 
      if ((n & 0x50) == 80) {
        k = 1;
      } else {
        k = 0;
      } 
      if (k) {
        k = j;
      } else {
        k = paramInt2 - j - this.f - b;
      } 
      if ((n & 0x800005) == 8388613) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1) {
        paramInt1 = j;
      } else {
        paramInt1 = paramInt1 - j - this.f - m;
      } 
      boolean bool1 = bool2;
      if ((n & 0x50) == 80)
        bool1 = true; 
      int m = j;
      if (bool1)
        m = paramInt2 - j - this.f - b; 
      if (materialCardView.getLayoutDirection() == 1) {
        paramInt2 = paramInt1;
        paramInt1 = i;
        i = paramInt2;
      } 
      this.p.setLayerInset(2, i, m, paramInt1, k);
    } 
  }
  
  public final void f(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.j;
    if (drawable != null) {
      ValueAnimator valueAnimator;
      int i = 0;
      float f1 = 0.0F;
      float f2 = 0.0F;
      if (paramBoolean2) {
        f1 = f2;
        if (paramBoolean1)
          f1 = 1.0F; 
        float f = this.x;
        f2 = f;
        if (paramBoolean1)
          f2 = 1.0F - f; 
        valueAnimator = this.t;
        if (valueAnimator != null) {
          valueAnimator.cancel();
          this.t = null;
        } 
        valueAnimator = ValueAnimator.ofFloat(new float[] { this.x, f1 });
        this.t = valueAnimator;
        valueAnimator.addUpdateListener(new pd(3, this));
        this.t.setInterpolator(this.u);
        valueAnimator = this.t;
        if (paramBoolean1) {
          i = this.v;
        } else {
          i = this.w;
        } 
        long l = (long)(i * f2);
        valueAnimator.setDuration(l);
        this.t.start();
        return;
      } 
      if (paramBoolean1)
        i = 255; 
      valueAnimator.setAlpha(i);
      if (paramBoolean1)
        f1 = 1.0F; 
      this.x = f1;
    } 
  }
  
  public final void g(Drawable paramDrawable) {
    if (paramDrawable != null) {
      paramDrawable = paramDrawable.mutate();
      this.j = paramDrawable;
      paramDrawable.setTintList(this.l);
      f(this.a.k, false);
    } else {
      this.j = (Drawable)z;
    } 
    LayerDrawable layerDrawable = this.p;
    if (layerDrawable != null)
      layerDrawable.setDrawableByLayerId(2131297226, this.j); 
  }
  
  public final void h(vl1 paramvl1) {
    this.m = paramvl1;
    ws0 ws01 = this.c;
    ws01.setShapeAppearanceModel(paramvl1);
    ws01.z = ws01.l() ^ true;
    ws01 = this.d;
    if (ws01 != null)
      ws01.setShapeAppearanceModel(paramvl1); 
    ws01 = this.q;
    if (ws01 != null)
      ws01.setShapeAppearanceModel(paramvl1); 
  }
  
  public final boolean i() {
    MaterialCardView materialCardView = this.a;
    return (materialCardView.getPreventCornerOverlap() && this.c.l() && materialCardView.getUseCompatPadding());
  }
  
  public final boolean j() {
    View view;
    MaterialCardView materialCardView2 = this.a;
    MaterialCardView materialCardView1 = materialCardView2;
    if (materialCardView2.isClickable())
      return true; 
    while (materialCardView1.isDuplicateParentStateEnabled() && materialCardView1.getParent() instanceof View)
      view = (View)materialCardView1.getParent(); 
    return view.isClickable();
  }
  
  public final void k() {
    ws0 ws01;
    Drawable drawable = this.i;
    if (j()) {
      LayerDrawable layerDrawable = c();
    } else {
      ws01 = this.d;
    } 
    this.i = ws01;
    if (drawable != ws01) {
      MaterialCardView materialCardView = this.a;
      if (materialCardView.getForeground() instanceof InsetDrawable) {
        ((InsetDrawable)materialCardView.getForeground()).setDrawable(ws01);
        return;
      } 
      materialCardView.setForeground((Drawable)d(ws01));
    } 
  }
  
  public final void l() {
    MaterialCardView materialCardView = this.a;
    boolean bool = materialCardView.getPreventCornerOverlap();
    float f3 = 0.0F;
    if ((bool && !this.c.l()) || i()) {
      f1 = a();
    } else {
      f1 = 0.0F;
    } 
    float f2 = f3;
    if (materialCardView.getPreventCornerOverlap()) {
      f2 = f3;
      if (materialCardView.getUseCompatPadding())
        f2 = (float)((1.0D - y) * materialCardView.getCardViewRadius()); 
    } 
    int m = (int)(f1 - f2);
    Rect rect = this.b;
    int k = rect.left;
    int n = rect.top;
    int i = rect.right;
    int j = rect.bottom;
    ((qi)materialCardView).e.set(k + m, n + m, i + m, j + m);
    g7 g7 = ((qi)materialCardView).g;
    qi qi = (qi)g7.e;
    if (!qi.getUseCompatPadding()) {
      g7.I(0, 0, 0, 0);
      return;
    } 
    ih1 ih1 = (ih1)g7.c;
    f2 = ih1.e;
    float f1 = ih1.a;
    j = (int)Math.ceil(jh1.a(f2, f1, qi.getPreventCornerOverlap()));
    i = (int)Math.ceil(jh1.b(f2, f1, qi.getPreventCornerOverlap()));
    g7.I(j, i, j, i);
  }
  
  public final void m() {
    boolean bool = this.r;
    MaterialCardView materialCardView = this.a;
    if (!bool)
      materialCardView.setBackgroundInternal((Drawable)d(this.c)); 
    materialCardView.setForeground((Drawable)d(this.i));
  }
  
  static {
    ColorDrawable colorDrawable;
  }
  
  public static final double y = Math.cos(Math.toRadians(45.0D));
  
  public static final ColorDrawable z;
  
  public final MaterialCardView a;
  
  public final Rect b = new Rect();
  
  public final ws0 c;
  
  public final ws0 d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public Drawable i;
  
  public Drawable j;
  
  public ColorStateList k;
  
  public ColorStateList l;
  
  public vl1 m;
  
  public ColorStateList n;
  
  public RippleDrawable o;
  
  public LayerDrawable p;
  
  public ws0 q;
  
  public boolean r = false;
  
  public boolean s;
  
  public ValueAnimator t;
  
  public final TimeInterpolator u;
  
  public final int v;
  
  public final int w;
  
  public float x = 0.0F;
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ks0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */