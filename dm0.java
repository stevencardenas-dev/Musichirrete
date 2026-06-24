import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class dm0 extends qv {
  public final int i;
  
  public final SideSheetBehavior j;
  
  public final boolean H(float paramFloat) {
    boolean bool;
    switch (this.i) {
      default:
        if (paramFloat < 0.0F) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (paramFloat > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean I(View paramView) {
    int j;
    int i = this.i;
    boolean bool1 = false;
    boolean bool2 = false;
    switch (i) {
      default:
        i = paramView.getLeft();
        j = this.j.m;
        bool1 = bool2;
        if (i > (r() + j) / 2)
          bool1 = true; 
        return bool1;
      case 0:
        break;
    } 
    if (paramView.getRight() < (r() - t()) / 2)
      bool1 = true; 
    return bool1;
  }
  
  public final boolean J(float paramFloat1, float paramFloat2) {
    boolean bool;
    switch (this.i) {
      default:
        if (Math.abs(paramFloat1) > Math.abs(paramFloat2) && Math.abs(paramFloat1) > 500.0F) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (Math.abs(paramFloat1) > Math.abs(paramFloat2) && Math.abs(paramFloat1) > 500.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean a0(View paramView, float paramFloat) {
    int i = this.i;
    boolean bool1 = false;
    boolean bool2 = false;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        f = paramView.getRight();
        bool1 = bool2;
        if (Math.abs(paramFloat * sideSheetBehavior.k + f) > 0.5F)
          bool1 = true; 
        return bool1;
      case 0:
        break;
    } 
    float f = paramView.getLeft();
    if (Math.abs(paramFloat * sideSheetBehavior.k + f) > 0.5F)
      bool1 = true; 
    return bool1;
  }
  
  public final int f(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    switch (this.i) {
      default:
        return paramMarginLayoutParams.rightMargin;
      case 0:
        break;
    } 
    return paramMarginLayoutParams.leftMargin;
  }
  
  public final float g(int paramInt) {
    switch (this.i) {
      default:
        f2 = this.j.m;
        f1 = r();
        return (f2 - paramInt) / (f2 - f1);
      case 0:
        break;
    } 
    float f2 = t();
    float f1 = r();
    return (paramInt - f2) / (f1 - f2);
  }
  
  public final void h0(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt) {
    switch (this.i) {
      default:
        paramMarginLayoutParams.rightMargin = paramInt;
        return;
      case 0:
        break;
    } 
    paramMarginLayoutParams.leftMargin = paramInt;
  }
  
  public final void i0(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt1, int paramInt2) {
    int i = this.i;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        paramInt2 = sideSheetBehavior.m;
        if (paramInt1 <= paramInt2)
          paramMarginLayoutParams.rightMargin = paramInt2 - paramInt1; 
        return;
      case 0:
        break;
    } 
    if (paramInt1 <= sideSheetBehavior.m)
      paramMarginLayoutParams.leftMargin = paramInt2; 
  }
  
  public final int q(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    switch (this.i) {
      default:
        return paramMarginLayoutParams.rightMargin;
      case 0:
        break;
    } 
    return paramMarginLayoutParams.leftMargin;
  }
  
  public final int r() {
    int i = this.i;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        return Math.max(0, sideSheetBehavior.m - sideSheetBehavior.l - sideSheetBehavior.o);
      case 0:
        break;
    } 
    return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
  }
  
  public final int t() {
    int i = this.i;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        return sideSheetBehavior.m;
      case 0:
        break;
    } 
    return -sideSheetBehavior.l - sideSheetBehavior.o;
  }
  
  public final int v() {
    int i = this.i;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        return sideSheetBehavior.m;
      case 0:
        break;
    } 
    return sideSheetBehavior.o;
  }
  
  public final int w() {
    switch (this.i) {
      default:
        return r();
      case 0:
        break;
    } 
    return -this.j.l;
  }
  
  public final int x(View paramView) {
    int i = this.i;
    SideSheetBehavior sideSheetBehavior = this.j;
    switch (i) {
      default:
        return paramView.getLeft() - sideSheetBehavior.o;
      case 0:
        break;
    } 
    return paramView.getRight() + sideSheetBehavior.o;
  }
  
  public final int y(CoordinatorLayout paramCoordinatorLayout) {
    switch (this.i) {
      default:
        return paramCoordinatorLayout.getRight();
      case 0:
        break;
    } 
    return paramCoordinatorLayout.getLeft();
  }
  
  public final int z() {
    switch (this.i) {
      default:
        return 0;
      case 0:
        break;
    } 
    return 1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */