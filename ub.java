import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public final class ub extends Drawable implements yt1 {
  public final WeakReference b;
  
  public final ws0 c;
  
  public final zt1 e;
  
  public final Rect f;
  
  public final xb g;
  
  public float h;
  
  public float i;
  
  public final int j;
  
  public float k;
  
  public float l;
  
  public float m;
  
  public WeakReference n;
  
  public WeakReference o;
  
  public ub(Context paramContext) {
    int j;
    WeakReference<Context> weakReference1 = new WeakReference<Context>(paramContext);
    this.b = weakReference1;
    g92.p(paramContext, g92.h, "Theme.MaterialComponents");
    this.f = new Rect();
    zt1 zt11 = new zt1(this);
    this.e = zt11;
    Paint.Align align = Paint.Align.CENTER;
    TextPaint textPaint = zt11.a;
    textPaint.setTextAlign(align);
    xb xb1 = new xb(paramContext);
    this.g = xb1;
    boolean bool = g();
    wb wb = xb1.b;
    if (bool) {
      i = wb.i.intValue();
    } else {
      i = wb.g.intValue();
    } 
    if (g()) {
      j = wb.j.intValue();
    } else {
      j = wb.h.intValue();
    } 
    ws0 ws01 = new ws0(vl1.a(paramContext, i, j, new k(0.0F)).a());
    this.c = ws01;
    i();
    Context context = weakReference1.get();
    if (context != null) {
      vt1 vt1 = new vt1(context, wb.f.intValue());
      if (zt11.g != vt1) {
        zt11.b(vt1, context);
        textPaint.setColor(wb.e.intValue());
        invalidateSelf();
        k();
        invalidateSelf();
      } 
    } 
    int i = wb.n;
    if (i != -2) {
      this.j = (int)Math.pow(10.0D, i - 1.0D) - 1;
    } else {
      this.j = wb.o;
    } 
    zt11.e = true;
    k();
    invalidateSelf();
    zt11.e = true;
    i();
    k();
    invalidateSelf();
    textPaint.setAlpha(getAlpha());
    invalidateSelf();
    ColorStateList colorStateList = ColorStateList.valueOf(wb.c.intValue());
    if (ws01.c.d != colorStateList) {
      ws01.o(colorStateList);
      invalidateSelf();
    } 
    textPaint.setColor(wb.e.intValue());
    invalidateSelf();
    WeakReference<FrameLayout> weakReference = this.n;
    if (weakReference != null && weakReference.get() != null) {
      View view = this.n.get();
      weakReference = this.o;
      if (weakReference != null) {
        FrameLayout frameLayout = weakReference.get();
      } else {
        weakReference = null;
      } 
      j(view, (FrameLayout)weakReference);
    } 
    k();
    setVisible(wb.v.booleanValue(), false);
  }
  
  public final void a() {
    invalidateSelf();
  }
  
  public final void b(View paramView1, View paramView2) {
    FrameLayout frameLayout1;
    ViewParent viewParent;
    float f1;
    float f2;
    boolean bool;
    FrameLayout frameLayout2 = e();
    if (frameLayout2 == null) {
      f2 = paramView1.getY();
      f1 = paramView1.getX();
      viewParent = paramView1.getParent();
    } else {
      f2 = 0.0F;
      f1 = 0.0F;
      frameLayout1 = frameLayout2;
    } 
    while (true) {
      bool = frameLayout1 instanceof View;
      if (bool && frameLayout1 != paramView2) {
        ViewParent viewParent1 = frameLayout1.getParent();
        if (!(viewParent1 instanceof ViewGroup) || ((ViewGroup)viewParent1).getClipChildren())
          break; 
        View view = (View)frameLayout1;
        f2 += view.getY();
        f1 += view.getX();
        viewParent = frameLayout1.getParent();
        continue;
      } 
      break;
    } 
    if (bool) {
      float f4 = this.i - this.m + f2;
      float f3 = this.h - this.l + f1;
      View view = (View)viewParent;
      float f5 = view.getHeight();
      f2 = this.i + this.m - f5 + f2;
      f5 = view.getWidth();
      f1 = this.h + this.l - f5 + f1;
      if (f4 < 0.0F) {
        f5 = this.i;
        this.i = Math.abs(f4) + f5;
      } 
      if (f3 < 0.0F) {
        f4 = this.h;
        this.h = Math.abs(f3) + f4;
      } 
      if (f2 > 0.0F)
        this.i -= Math.abs(f2); 
      if (f1 > 0.0F)
        this.h -= Math.abs(f1); 
    } 
  }
  
  public final String c() {
    xb xb1 = this.g;
    wb wb1 = xb1.b;
    wb wb2 = xb1.b;
    String str = wb1.l;
    WeakReference<Context> weakReference = this.b;
    if (str != null) {
      int i = wb1.n;
      if (i != -2 && str != null && str.length() > i) {
        Context context = weakReference.get();
        if (context != null) {
          str = str.substring(0, i - 1);
          return String.format(context.getString(2131886761), new Object[] { str, "…" });
        } 
      } else {
        return str;
      } 
    } else {
      if (h()) {
        int i = this.j;
        if (i == -2 || f() <= i)
          return NumberFormat.getInstance(wb2.p).format(f()); 
        Context context = weakReference.get();
        return (context != null) ? String.format(wb2.p, context.getString(2131886901), new Object[] { Integer.valueOf(i), "+" }) : "";
      } 
      return null;
    } 
    return "";
  }
  
  public final CharSequence d() {
    if (isVisible()) {
      xb xb1 = this.g;
      wb wb2 = xb1.b;
      if (wb2.l != null) {
        CharSequence charSequence = wb2.q;
        return (charSequence != null) ? charSequence : xb1.b.l;
      } 
      boolean bool = h();
      wb wb1 = xb1.b;
      if (bool) {
        if (wb1.s != 0) {
          Context context = this.b.get();
          if (context != null) {
            int i = this.j;
            return (i == -2 || f() <= i) ? context.getResources().getQuantityString(wb1.s, f(), new Object[] { Integer.valueOf(f()) }) : context.getString(wb1.t, new Object[] { Integer.valueOf(i) });
          } 
        } 
        return null;
      } 
      return wb1.r;
    } 
    return null;
  }
  
  public final void draw(Canvas paramCanvas) {
    if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
      this.c.draw(paramCanvas);
      if (g()) {
        String str = c();
        if (str != null) {
          int i;
          Rect rect = new Rect();
          zt1 zt11 = this.e;
          zt11.a.getTextBounds(str, 0, str.length(), rect);
          float f2 = this.i - rect.exactCenterY();
          float f1 = this.h;
          if (rect.bottom <= 0) {
            i = (int)f2;
          } else {
            i = Math.round(f2);
          } 
          f2 = i;
          paramCanvas.drawText(str, f1, f2, (Paint)zt11.a);
        } 
      } 
    } 
  }
  
  public final FrameLayout e() {
    WeakReference<FrameLayout> weakReference = this.o;
    return (weakReference != null) ? weakReference.get() : null;
  }
  
  public final int f() {
    int i = this.g.b.m;
    return (i != -1) ? i : 0;
  }
  
  public final boolean g() {
    return (this.g.b.l != null || h());
  }
  
  public final int getAlpha() {
    return this.g.b.k;
  }
  
  public final int getIntrinsicHeight() {
    return this.f.height();
  }
  
  public final int getIntrinsicWidth() {
    return this.f.width();
  }
  
  public final int getOpacity() {
    return -3;
  }
  
  public final boolean h() {
    wb wb = this.g.b;
    return (wb.l == null && wb.m != -1);
  }
  
  public final void i() {
    int i;
    int j;
    Context context = this.b.get();
    if (context == null)
      return; 
    boolean bool = g();
    xb xb1 = this.g;
    if (bool) {
      i = xb1.b.i.intValue();
    } else {
      i = xb1.b.g.intValue();
    } 
    if (g()) {
      j = xb1.b.j.intValue();
    } else {
      j = xb1.b.h.intValue();
    } 
    vl1 vl1 = vl1.a(context, i, j, new k(0.0F)).a();
    this.c.setShapeAppearanceModel(vl1);
    invalidateSelf();
  }
  
  public final boolean isStateful() {
    return false;
  }
  
  public final void j(View paramView, FrameLayout paramFrameLayout) {
    this.n = new WeakReference<View>(paramView);
    this.o = new WeakReference<FrameLayout>(paramFrameLayout);
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    viewGroup.setClipChildren(false);
    viewGroup.setClipToPadding(false);
    k();
    invalidateSelf();
  }
  
  public final void k() {
    float f1;
    float f2;
    WeakReference<Context> weakReference2 = this.b;
    Context context = weakReference2.get();
    WeakReference<View> weakReference = this.n;
    if (weakReference != null) {
      View view = weakReference.get();
    } else {
      weakReference = null;
    } 
    if (context == null || weakReference == null)
      return; 
    Rect rect2 = new Rect();
    Rect rect1 = this.f;
    rect2.set(rect1);
    Rect rect3 = new Rect();
    weakReference.getDrawingRect(rect3);
    WeakReference<ViewGroup> weakReference1 = this.o;
    if (weakReference1 != null) {
      ViewGroup viewGroup = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    if (weakReference1 != null)
      weakReference1.offsetDescendantRectToMyCoords((View)weakReference, rect3); 
    boolean bool = g();
    xb xb1 = this.g;
    if (bool) {
      f1 = xb1.d;
    } else {
      f1 = xb1.c;
    } 
    this.k = f1;
    if (f1 != -1.0F) {
      this.l = f1;
      this.m = f1;
    } else {
      if (g()) {
        f1 = xb1.g;
      } else {
        f1 = xb1.e;
      } 
      f1 /= 2.0F;
      this.l = Math.round(f1);
      if (g()) {
        f1 = xb1.h;
      } else {
        f1 = xb1.f;
      } 
      f1 /= 2.0F;
      this.m = Math.round(f1);
    } 
    if (g()) {
      String str = c();
      f2 = this.l;
      zt1 zt11 = this.e;
      if (!zt11.e) {
        f1 = zt11.c;
      } else {
        zt11.a(str);
        f1 = zt11.c;
      } 
      this.l = Math.max(f2, f1 / 2.0F + xb1.b.w.intValue());
      f1 = this.m;
      if (zt11.e)
        zt11.a(str); 
      f1 = Math.max(f1, zt11.d / 2.0F + xb1.b.x.intValue());
      this.m = f1;
      this.l = Math.max(this.l, f1);
    } 
    wb wb1 = xb1.b;
    wb wb2 = xb1.b;
    int k = xb1.k;
    int i = wb1.z.intValue();
    if (g()) {
      int m = wb1.B.intValue();
      Context context1 = weakReference2.get();
      i = m;
      if (context1 != null)
        i = g5.c(g5.b(0.0F, 1.0F, 0.3F, 1.0F, (context1.getResources().getConfiguration()).fontScale - 1.0F), m, m - wb1.E.intValue()); 
    } 
    int j = i;
    if (k == 0)
      j = i - Math.round(this.m); 
    j = wb1.D.intValue() + j;
    i = wb2.u.intValue();
    if (i != 8388691 && i != 8388693) {
      this.i = (rect3.top + j);
    } else {
      this.i = (rect3.bottom - j);
    } 
    if (g()) {
      i = wb1.A.intValue();
    } else {
      i = wb2.y.intValue();
    } 
    j = i;
    if (k == 1) {
      if (g()) {
        j = xb1.j;
      } else {
        j = xb1.i;
      } 
      j = i + j;
    } 
    i = wb1.C.intValue() + j;
    j = wb2.u.intValue();
    if (j != 8388659 && j != 8388691) {
      if (xb1.l == 0) {
        if (weakReference.getLayoutDirection() == 0) {
          f1 = rect3.right + this.l;
          f2 = i;
        } else {
          f1 = rect3.left - this.l + i;
          this.h = f1;
        } 
      } else {
        if (weakReference.getLayoutDirection() == 0) {
          f1 = rect3.right - this.l + this.m * 2.0F - i;
        } else {
          f1 = rect3.left + this.l;
          f2 = this.m * 2.0F - i;
          f1 -= f2;
        } 
        this.h = f1;
      } 
    } else {
      if (xb1.l == 0) {
        if (weakReference.getLayoutDirection() == 0) {
          f1 = rect3.left + this.l;
          f2 = this.m * 2.0F - i;
        } else {
          f1 = rect3.right - this.l + this.m * 2.0F - i;
          this.h = f1;
        } 
      } else {
        if (weakReference.getLayoutDirection() == 0) {
          f1 = rect3.left - this.l + i;
        } else {
          f1 = rect3.right + this.l;
          f2 = i;
          f1 -= f2;
        } 
        this.h = f1;
      } 
      f1 -= f2;
    } 
    f1 -= f2;
  }
  
  public final boolean onStateChange(int[] paramArrayOfint) {
    return super.onStateChange(paramArrayOfint);
  }
  
  public final void setAlpha(int paramInt) {
    xb xb1 = this.g;
    xb1.a.k = paramInt;
    xb1.b.k = paramInt;
    this.e.a.setAlpha(getAlpha());
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */