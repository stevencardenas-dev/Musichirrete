import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public final class gs0 {
  public final MaterialButton a;
  
  public vl1 b;
  
  public mp1 c;
  
  public mo1 d;
  
  public f e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public PorterDuff.Mode l;
  
  public ColorStateList m;
  
  public ColorStateList n;
  
  public ColorStateList o;
  
  public ws0 p;
  
  public boolean q = false;
  
  public boolean r = false;
  
  public boolean s = false;
  
  public boolean t;
  
  public boolean u = true;
  
  public RippleDrawable v;
  
  public int w;
  
  public gs0(MaterialButton paramMaterialButton, vl1 paramvl1) {
    this.a = paramMaterialButton;
    this.b = paramvl1;
  }
  
  public final ws0 a(boolean paramBoolean) {
    RippleDrawable rippleDrawable = this.v;
    return (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) ? (ws0)((LayerDrawable)((InsetDrawable)this.v.getDrawable(0)).getDrawable()).getDrawable(paramBoolean ^ true) : null;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    MaterialButton materialButton = this.a;
    int i = materialButton.getPaddingStart();
    int n = materialButton.getPaddingTop();
    int i1 = materialButton.getPaddingEnd();
    int m = materialButton.getPaddingBottom();
    int j = this.h;
    int k = this.i;
    this.i = paramInt2;
    this.h = paramInt1;
    if (!this.r)
      c(); 
    materialButton.setPaddingRelative(i, n + paramInt1 - j, i1, m + paramInt2 - k);
  }
  
  public final void c() {
    boolean bool;
    ws0 ws02 = new ws0(this.b);
    mp1 mp11 = this.c;
    if (mp11 != null)
      ws02.s(mp11); 
    mo1 mo11 = this.d;
    if (mo11 != null)
      ws02.m(mo11); 
    f f2 = this.e;
    if (f2 != null)
      ws02.G = f2; 
    MaterialButton materialButton = this.a;
    ws02.k(materialButton.getContext());
    ws02.setTintList(this.m);
    PorterDuff.Mode mode = this.l;
    if (mode != null)
      ws02.setTintMode(mode); 
    float f1 = this.k;
    ColorStateList colorStateList = this.n;
    ws02.u(f1);
    ws02.t(colorStateList);
    ws0 ws03 = new ws0(this.b);
    mp1 mp12 = this.c;
    if (mp12 != null)
      ws03.s(mp12); 
    mo1 mo13 = this.d;
    if (mo13 != null)
      ws03.m(mo13); 
    ws03.setTint(0);
    f1 = this.k;
    if (this.q) {
      bool = m92.x((View)materialButton, 2130968945);
    } else {
      bool = false;
    } 
    ws03.u(f1);
    ws03.t(ColorStateList.valueOf(bool));
    ws0 ws04 = new ws0(this.b);
    this.p = ws04;
    mp1 mp13 = this.c;
    if (mp13 != null)
      ws04.s(mp13); 
    mo1 mo12 = this.d;
    if (mo12 != null)
      this.p.m(mo12); 
    this.p.setTint(-1);
    RippleDrawable rippleDrawable = new RippleDrawable(yg1.c(this.o), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[] { ws03, ws02 }, ), this.f, this.h, this.g, this.i), this.p);
    this.v = rippleDrawable;
    materialButton.setInternalBackground((Drawable)rippleDrawable);
    ws0 ws01 = a(false);
    if (ws01 != null) {
      ws01.n(this.w);
      ws01.setState(materialButton.getDrawableState());
    } 
  }
  
  public final void d() {
    ws0 ws01 = a(false);
    if (ws01 != null) {
      mp1 mp11 = this.c;
      if (mp11 != null) {
        ws01.s(mp11);
      } else {
        ws01.setShapeAppearanceModel(this.b);
      } 
      mo1 mo11 = this.d;
      if (mo11 != null)
        ws01.m(mo11); 
    } 
    ws01 = a(true);
    if (ws01 != null) {
      mp1 mp11 = this.c;
      if (mp11 != null) {
        ws01.s(mp11);
      } else {
        ws01.setShapeAppearanceModel(this.b);
      } 
      mo1 mo11 = this.d;
      if (mo11 != null)
        ws01.m(mo11); 
    } 
    RippleDrawable rippleDrawable = this.v;
    if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
      gm1 gm1;
      int i = this.v.getNumberOfLayers();
      rippleDrawable = this.v;
      if (i > 2) {
        gm1 = (gm1)rippleDrawable.getDrawable(2);
      } else {
        gm1 = (gm1)gm1.getDrawable(1);
      } 
    } else {
      rippleDrawable = null;
    } 
    if (rippleDrawable != null) {
      rippleDrawable.setShapeAppearanceModel(this.b);
      if (rippleDrawable instanceof ws0) {
        ws0 ws02 = (ws0)rippleDrawable;
        mp1 mp11 = this.c;
        if (mp11 != null)
          ws02.s(mp11); 
        mo1 mo11 = this.d;
        if (mo11 != null)
          ws02.m(mo11); 
      } 
    } 
  }
  
  public final void e() {
    int i = 0;
    ws0 ws02 = a(false);
    ws0 ws01 = a(true);
    if (ws02 != null) {
      float f1 = this.k;
      ColorStateList colorStateList = this.n;
      ws02.u(f1);
      ws02.t(colorStateList);
      if (ws01 != null) {
        f1 = this.k;
        if (this.q)
          i = m92.x((View)this.a, 2130968945); 
        ws01.u(f1);
        ws01.t(ColorStateList.valueOf(i));
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */