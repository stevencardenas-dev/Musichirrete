import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public final class jm implements u5 {
  public final CollapsingToolbarLayout b;
  
  public jm(CollapsingToolbarLayout paramCollapsingToolbarLayout) {
    this.b = paramCollapsingToolbarLayout;
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    CollapsingToolbarLayout collapsingToolbarLayout = this.b;
    hm hm1 = collapsingToolbarLayout.o;
    hm hm2 = collapsingToolbarLayout.n;
    collapsingToolbarLayout.D = paramInt;
    x62 x62 = collapsingToolbarLayout.G;
    if (x62 != null) {
      i = x62.d();
    } else {
      i = 0;
    } 
    int k = collapsingToolbarLayout.getChildCount();
    int j;
    for (j = 0; j < k; j++) {
      View view = collapsingToolbarLayout.getChildAt(j);
      im im = (im)view.getLayoutParams();
      n32 n32 = CollapsingToolbarLayout.b(view);
      int n = im.a;
      if (n != 1) {
        if (n == 2)
          n32.b(Math.round(-paramInt * im.b)); 
      } else {
        n = -paramInt;
        n32 n321 = CollapsingToolbarLayout.b(view);
        im im1 = (im)view.getLayoutParams();
        n32.b(ui0.i(n, 0, collapsingToolbarLayout.getHeight() - n321.b - view.getHeight() - im1.bottomMargin));
      } 
    } 
    collapsingToolbarLayout.d();
    if (collapsingToolbarLayout.u != null && i)
      collapsingToolbarLayout.postInvalidateOnAnimation(); 
    j = collapsingToolbarLayout.getHeight();
    k = j - collapsingToolbarLayout.getMinimumHeight() - i;
    int i = collapsingToolbarLayout.getScrimVisibleHeightTrigger();
    int m = collapsingToolbarLayout.D + k;
    float f1 = Math.abs(paramInt);
    float f2 = k;
    f1 /= f2;
    f2 = (j - i) / f2;
    float f3 = Math.min(1.0F, f2);
    hm2.d = f3;
    hm2.e = x41.e(1.0F, f3, 0.5F, f3);
    hm2.f = m;
    hm2.A(f1);
    f2 = Math.min(1.0F, f2);
    hm1.d = f2;
    hm1.e = x41.e(1.0F, f2, 0.5F, f2);
    hm1.f = m;
    hm1.A(f1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */