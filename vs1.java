import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

public final class vs1 extends LinearLayout {
  public static final int e = 0;
  
  public ValueAnimator b;
  
  public final TabLayout c;
  
  public vs1(TabLayout paramTabLayout, Context paramContext) {
    super(paramContext);
    setWillNotDraw(false);
  }
  
  public final void a(int paramInt) {
    TabLayout tabLayout = this.c;
    if (tabLayout.a0 != 0 && ((tabLayout.getTabSelectedIndicator().getBounds()).left != -1 || (tabLayout.getTabSelectedIndicator().getBounds()).right != -1))
      return; 
    View view = getChildAt(paramInt);
    zb0 zb0 = tabLayout.L;
    Drawable drawable = tabLayout.q;
    zb0.getClass();
    RectF rectF = zb0.o(tabLayout, view);
    drawable.setBounds((int)rectF.left, (drawable.getBounds()).top, (int)rectF.right, (drawable.getBounds()).bottom);
    tabLayout.b = paramInt;
  }
  
  public final void b(int paramInt) {
    TabLayout tabLayout = this.c;
    Rect rect = tabLayout.q.getBounds();
    tabLayout.q.setBounds(rect.left, 0, rect.right, paramInt);
    requestLayout();
  }
  
  public final void c(View paramView1, View paramView2, float paramFloat) {
    TabLayout tabLayout = this.c;
    if (paramView1 != null && paramView1.getWidth() > 0) {
      tabLayout.L.p(tabLayout, paramView1, paramView2, paramFloat, tabLayout.q);
    } else {
      Drawable drawable = tabLayout.q;
      drawable.setBounds(-1, (drawable.getBounds()).top, -1, (tabLayout.q.getBounds()).bottom);
    } 
    postInvalidateOnAnimation();
  }
  
  public final void d(int paramInt1, int paramInt2, boolean paramBoolean) {
    TabLayout tabLayout = this.c;
    if (tabLayout.b == paramInt1)
      return; 
    View view1 = getChildAt(tabLayout.getSelectedTabPosition());
    View view2 = getChildAt(paramInt1);
    if (view2 == null) {
      a(tabLayout.getSelectedTabPosition());
      return;
    } 
    tabLayout.b = paramInt1;
    us1 us1 = new us1(this, view1, view2);
    if (paramBoolean) {
      ValueAnimator valueAnimator = new ValueAnimator();
      this.b = valueAnimator;
      valueAnimator.setInterpolator(tabLayout.M);
      valueAnimator.setDuration(paramInt2);
      valueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
      valueAnimator.addUpdateListener(us1);
      valueAnimator.start();
      return;
    } 
    this.b.removeAllUpdateListeners();
    this.b.addUpdateListener(us1);
  }
  
  public final void draw(Canvas paramCanvas) {
    TabLayout tabLayout = this.c;
    int j = tabLayout.q.getBounds().height();
    int i = j;
    if (j < 0)
      i = tabLayout.q.getIntrinsicHeight(); 
    int k = tabLayout.E;
    if (k != 0) {
      if (k != 1) {
        boolean bool = false;
        j = bool;
        if (k != 2)
          if (k != 3) {
            i = 0;
            j = bool;
          } else {
            i = getHeight();
            j = bool;
          }  
      } else {
        j = (getHeight() - i) / 2;
        i = (getHeight() + i) / 2;
      } 
    } else {
      j = getHeight() - i;
      i = getHeight();
    } 
    if (tabLayout.q.getBounds().width() > 0) {
      Rect rect = tabLayout.q.getBounds();
      tabLayout.q.setBounds(rect.left, j, rect.right, i);
      tabLayout.q.draw(paramCanvas);
    } 
    super.draw(paramCanvas);
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ValueAnimator valueAnimator = this.b;
    TabLayout tabLayout = this.c;
    if (valueAnimator != null && valueAnimator.isRunning()) {
      d(tabLayout.getSelectedTabPosition(), -1, false);
      return;
    } 
    if (tabLayout.b == -1)
      tabLayout.b = tabLayout.getSelectedTabPosition(); 
    a(tabLayout.b);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      TabLayout tabLayout = this.c;
      int i = tabLayout.C;
      boolean bool = true;
      if (i == 1 || tabLayout.F == 2) {
        int k = getChildCount();
        boolean bool1 = false;
        byte b = 0;
        int j;
        for (j = 0; b < k; j = i) {
          View view = getChildAt(b);
          i = j;
          if (view.getVisibility() == 0)
            i = Math.max(j, view.getMeasuredWidth()); 
          b++;
        } 
        if (j > 0) {
          LinearLayout.LayoutParams layoutParams;
          i = (int)n21.u(getContext(), 16);
          if (j * k <= getMeasuredWidth() - i * 2) {
            i = 0;
            for (b = bool1; b < k; b++) {
              layoutParams = (LinearLayout.LayoutParams)getChildAt(b).getLayoutParams();
              if (layoutParams.width != j || layoutParams.weight != 0.0F) {
                layoutParams.width = j;
                layoutParams.weight = 0.0F;
                i = 1;
              } 
            } 
          } else {
            ((TabLayout)layoutParams).C = 0;
            layoutParams.q(false);
            i = bool;
          } 
          if (i != 0)
            super.onMeasure(paramInt1, paramInt2); 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */