import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

public final class r7 extends co0 implements t7 {
  public CharSequence E;
  
  public o7 F;
  
  public final Rect G = new Rect();
  
  public int H;
  
  public final u7 I;
  
  public r7(u7 paramu7, Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    this.q = (View)paramu7;
    this.A = true;
    this.B.setFocusable(true);
    this.r = new p7(0, this);
  }
  
  public final void g(CharSequence paramCharSequence) {
    this.E = paramCharSequence;
  }
  
  public final void l(int paramInt) {
    this.H = paramInt;
  }
  
  public final void n(int paramInt1, int paramInt2) {
    f7 f7 = this.B;
    boolean bool = f7.isShowing();
    s();
    f7.setInputMethodMode(2);
    d();
    y10 y101 = this.e;
    y101.setChoiceMode(1);
    y101.setTextDirection(paramInt1);
    y101.setTextAlignment(paramInt2);
    u7 u71 = this.I;
    paramInt1 = u71.getSelectedItemPosition();
    y10 y102 = this.e;
    if (f7.isShowing() && y102 != null) {
      y102.setListSelectionHidden(false);
      y102.setSelection(paramInt1);
      if (y102.getChoiceMode() != 0)
        y102.setItemChecked(paramInt1, true); 
    } 
    if (!bool) {
      ViewTreeObserver viewTreeObserver = u71.getViewTreeObserver();
      if (viewTreeObserver != null) {
        l7 l7 = new l7(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(l7);
        f7.setOnDismissListener(new q7(this, l7));
      } 
    } 
  }
  
  public final CharSequence p() {
    return this.E;
  }
  
  public final void q(ListAdapter paramListAdapter) {
    super.q(paramListAdapter);
    this.F = (o7)paramListAdapter;
  }
  
  public final void s() {
    int i;
    f7 f7 = this.B;
    Drawable drawable = f7.getBackground();
    u7 u71 = this.I;
    Rect rect = u71.j;
    if (drawable != null) {
      drawable.getPadding(rect);
      boolean bool1 = d42.a;
      if (u71.getLayoutDirection() == 1) {
        i = rect.right;
      } else {
        i = -rect.left;
      } 
    } else {
      i = 0;
      rect.right = 0;
      rect.left = 0;
    } 
    int n = u71.getPaddingLeft();
    int m = u71.getPaddingRight();
    int k = u71.getWidth();
    int j = u71.i;
    if (j == -2) {
      int i1 = u71.a(this.F, f7.getBackground());
      int i2 = (u71.getContext().getResources().getDisplayMetrics()).widthPixels - rect.left - rect.right;
      j = i1;
      if (i1 > i2)
        j = i2; 
      r(Math.max(j, k - n - m));
    } else if (j == -1) {
      r(k - n - m);
    } else {
      r(j);
    } 
    boolean bool = d42.a;
    if (u71.getLayoutDirection() == 1) {
      i = k - m - this.g - this.H + i;
    } else {
      i = n + this.H + i;
    } 
    this.h = i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */