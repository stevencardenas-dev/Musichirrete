import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public final class j7 extends g7 {
  public final AppCompatSeekBar g;
  
  public Drawable h;
  
  public ColorStateList i = null;
  
  public PorterDuff.Mode j = null;
  
  public boolean k = false;
  
  public boolean l = false;
  
  public j7(AppCompatSeekBar paramAppCompatSeekBar) {
    super((AbsSeekBar)paramAppCompatSeekBar);
    this.g = paramAppCompatSeekBar;
  }
  
  public final void A(AttributeSet paramAttributeSet, int paramInt) {
    super.A(paramAttributeSet, paramInt);
    AppCompatSeekBar appCompatSeekBar = this.g;
    Context context = appCompatSeekBar.getContext();
    int[] arrayOfInt = nc1.g;
    zv0 zv0 = zv0.y(paramInt, 0, context, paramAttributeSet, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    v22.m((View)appCompatSeekBar, appCompatSeekBar.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    Drawable drawable1 = zv0.p(0);
    if (drawable1 != null)
      appCompatSeekBar.setThumb(drawable1); 
    Drawable drawable2 = zv0.o(1);
    drawable1 = this.h;
    if (drawable1 != null)
      drawable1.setCallback(null); 
    this.h = drawable2;
    if (drawable2 != null) {
      drawable2.setCallback((Drawable.Callback)appCompatSeekBar);
      drawable2.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
      if (drawable2.isStateful())
        drawable2.setState(appCompatSeekBar.getDrawableState()); 
      M();
    } 
    appCompatSeekBar.invalidate();
    if (typedArray.hasValue(3)) {
      this.j = l10.c(typedArray.getInt(3, -1), this.j);
      this.l = true;
    } 
    if (typedArray.hasValue(2)) {
      this.i = zv0.n(2);
      this.k = true;
    } 
    zv0.z();
    M();
  }
  
  public final void M() {
    Drawable drawable = this.h;
    if (drawable != null && (this.k || this.l)) {
      drawable = drawable.mutate();
      this.h = drawable;
      if (this.k)
        drawable.setTintList(this.i); 
      if (this.l)
        this.h.setTintMode(this.j); 
      if (this.h.isStateful())
        this.h.setState(this.g.getDrawableState()); 
    } 
  }
  
  public final void N(Canvas paramCanvas) {
    if (this.h != null) {
      AppCompatSeekBar appCompatSeekBar = this.g;
      int j = appCompatSeekBar.getMax();
      int i = 1;
      if (j > 1) {
        int k = this.h.getIntrinsicWidth();
        int m = this.h.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        } else {
          k = 1;
        } 
        if (m >= 0)
          i = m / 2; 
        this.h.setBounds(-k, -i, k, i);
        float f = (appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft() - appCompatSeekBar.getPaddingRight()) / j;
        i = paramCanvas.save();
        paramCanvas.translate(appCompatSeekBar.getPaddingLeft(), (appCompatSeekBar.getHeight() / 2));
        for (k = 0; k <= j; k++) {
          this.h.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
        } 
        paramCanvas.restoreToCount(i);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */