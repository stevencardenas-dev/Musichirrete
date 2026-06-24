import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class n30 extends zb0 {
  public final int h;
  
  public final void p(TabLayout paramTabLayout, View paramView1, View paramView2, float paramFloat, Drawable paramDrawable) {
    float f;
    int i;
    switch (this.h) {
      default:
        i = paramFloat cmp 0.5F;
        if (i >= 0)
          paramView1 = paramView2; 
        rectF1 = zb0.o(paramTabLayout, paramView1);
        if (i < 0) {
          paramFloat = g5.b(1.0F, 0.0F, 0.0F, 0.5F, paramFloat);
        } else {
          paramFloat = g5.b(0.0F, 1.0F, 0.5F, 1.0F, paramFloat);
        } 
        paramDrawable.setBounds((int)rectF1.left, (paramDrawable.getBounds()).top, (int)rectF1.right, (paramDrawable.getBounds()).bottom);
        paramDrawable.setAlpha((int)(paramFloat * 255.0F));
        return;
      case 0:
        break;
    } 
    RectF rectF2 = zb0.o((TabLayout)rectF1, paramView1);
    RectF rectF1 = zb0.o((TabLayout)rectF1, paramView2);
    if (rectF2.left < rectF1.left) {
      double d = paramFloat * Math.PI / 2.0D;
      f = (float)(1.0D - Math.cos(d));
      paramFloat = (float)Math.sin(d);
    } else {
      double d = paramFloat * Math.PI / 2.0D;
      f = (float)Math.sin(d);
      paramFloat = (float)(1.0D - Math.cos(d));
    } 
    paramDrawable.setBounds(g5.c(f, (int)rectF2.left, (int)rectF1.left), (paramDrawable.getBounds()).top, g5.c(paramFloat, (int)rectF2.right, (int)rectF1.right), (paramDrawable.getBounds()).bottom);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */