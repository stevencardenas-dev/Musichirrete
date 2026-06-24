import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public abstract class nf0 extends m32 {
  public final Rect c = new Rect();
  
  public final Rect d = new Rect();
  
  public int e = 0;
  
  public int f;
  
  public nf0() {}
  
  public nf0(int paramInt) {
    super(0);
  }
  
  public final boolean m(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3) {
    int i = (paramView.getLayoutParams()).height;
    if (i == -1 || i == -2) {
      AppBarLayout appBarLayout = AppBarLayout.ScrollingViewBehavior.z(paramCoordinatorLayout.k(paramView));
      if (appBarLayout != null) {
        int j = View.MeasureSpec.getSize(paramInt3);
        if (j > 0) {
          paramInt3 = j;
          if (appBarLayout.getFitsSystemWindows()) {
            x62 x62 = paramCoordinatorLayout.getLastWindowInsets();
            paramInt3 = j;
            if (x62 != null) {
              paramInt3 = x62.d();
              paramInt3 = j + x62.a() + paramInt3;
            } 
          } 
        } else {
          paramInt3 = paramCoordinatorLayout.getHeight();
        } 
        paramInt3 = appBarLayout.getTotalScrollRange() + paramInt3;
        j = appBarLayout.getMeasuredHeight();
        if (this instanceof com.google.android.material.search.SearchBar.ScrollingViewBehavior) {
          paramView.setTranslationY(-j);
        } else {
          paramView.setTranslationY(0.0F);
          paramInt3 -= j;
        } 
        if (i == -1) {
          j = 1073741824;
        } else {
          j = Integer.MIN_VALUE;
        } 
        paramCoordinatorLayout.s(paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(paramInt3, j), paramView);
        return true;
      } 
    } 
    return false;
  }
  
  public final void x(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    Rect rect;
    AppBarLayout appBarLayout = AppBarLayout.ScrollingViewBehavior.z(paramCoordinatorLayout.k(paramView));
    if (appBarLayout != null) {
      is is = (is)paramView.getLayoutParams();
      int m = paramCoordinatorLayout.getPaddingLeft();
      int i6 = is.leftMargin;
      int n = appBarLayout.getBottom();
      int j = is.topMargin;
      int i2 = paramCoordinatorLayout.getWidth();
      int i1 = paramCoordinatorLayout.getPaddingRight();
      int k = is.rightMargin;
      int i = paramCoordinatorLayout.getHeight();
      int i4 = appBarLayout.getBottom();
      int i3 = paramCoordinatorLayout.getPaddingBottom();
      int i5 = is.bottomMargin;
      Rect rect1 = this.c;
      rect1.set(m + i6, n + j, i2 - i1 - k, i4 + i - i3 - i5);
      x62 x62 = paramCoordinatorLayout.getLastWindowInsets();
      if (x62 != null && paramCoordinatorLayout.getFitsSystemWindows() && !paramView.getFitsSystemWindows()) {
        i = rect1.left;
        rect1.left = x62.b() + i;
        rect1.right -= x62.c();
      } 
      j = is.c;
      i = j;
      if (j == 0)
        i = 8388659; 
      k = paramView.getMeasuredWidth();
      j = paramView.getMeasuredHeight();
      rect = this.d;
      Gravity.apply(i, k, j, rect1, rect, paramInt);
      paramInt = y((View)appBarLayout);
      paramView.layout(rect.left, rect.top - paramInt, rect.right, rect.bottom - paramInt);
      this.e = rect.top - appBarLayout.getBottom();
      return;
    } 
    rect.r(paramView, paramInt);
    this.e = 0;
  }
  
  public final int y(View paramView) {
    if (this.f == 0)
      return 0; 
    boolean bool = paramView instanceof AppBarLayout;
    float f2 = 0.0F;
    float f1 = f2;
    if (bool) {
      byte b;
      AppBarLayout appBarLayout = (AppBarLayout)paramView;
      int j = appBarLayout.getTotalScrollRange();
      int k = appBarLayout.getDownNestedPreScrollRange();
      fs fs = ((is)appBarLayout.getLayoutParams()).a;
      if (fs instanceof AppBarLayout.BaseBehavior) {
        b = ((AppBarLayout.BaseBehavior)fs).y();
      } else {
        b = 0;
      } 
      if (k != 0 && j + b <= k) {
        f1 = f2;
      } else {
        j -= k;
        f1 = f2;
        if (j != 0)
          f1 = b / j + 1.0F; 
      } 
    } 
    int i = this.f;
    return ui0.i((int)(f1 * i), 0, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */