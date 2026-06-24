import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import in.krosbits.musicolet.IapActivity;

public final class vd implements ValueAnimator.AnimatorUpdateListener {
  public final int a;
  
  public final Object b;
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    TextView textView;
    r70 r70;
    ws0 ws0;
    int j = this.a;
    int i = 0;
    Object object = this.b;
    switch (j) {
      default:
        f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
        textView = (TextView)object;
        textView.setScaleX(f);
        textView.setScaleY(f);
        return;
      case 7:
        ((TextInputLayout)object).y0.A(((Float)textView.getAnimatedValue()).floatValue());
        return;
      case 6:
        ((TabLayout)object).scrollTo(((Integer)textView.getAnimatedValue()).intValue(), 0);
        return;
      case 5:
        ((ej0)object).m = textView.getAnimatedFraction();
        return;
      case 4:
        object = object;
        try {
          Float float_ = (Float)textView.getAnimatedValue();
          ((IapActivity)object).U.s.getForeground().setAlpha((int)((1.0F - float_.floatValue() * 1.0F) * 255.0F));
          ((IapActivity)object).U.w.setAlpha(1.0F - float_.floatValue() * 1.0F);
          f = float_.floatValue() * 0.1F + 0.9F;
          ((IapActivity)object).U.s.setScaleX(f);
          ((IapActivity)object).U.s.setScaleY(f);
        } finally {
          textView = null;
        } 
      case 3:
        i = (int)(((Float)textView.getAnimatedValue()).floatValue() * 255.0F);
        r70 = (r70)object;
        r70.c.setAlpha(i);
        r70.d.setAlpha(i);
        r70.s.invalidate();
        return;
      case 2:
        ((CollapsingToolbarLayout)object).setScrimAlpha(((Integer)r70.getAnimatedValue()).intValue());
        return;
      case 1:
        f = ((Float)r70.getAnimatedValue()).floatValue();
        ws0 = ((BottomSheetBehavior)object).i;
        if (ws0 != null)
          ws0.p(f); 
        return;
      case 0:
        break;
    } 
    float f = ((Float)ws0.getAnimatedValue()).floatValue();
    xd xd = (xd)object;
    object = xd.m;
    j = object.size();
    while (i < j) {
      qv1 qv1 = (qv1)object.get(i);
      i++;
      qv1 = qv1;
      qv1.W = f;
      qv1.X = f;
      qv1.a0 = g5.b(0.0F, 1.0F, 0.19F, 1.0F, f);
      qv1.invalidateSelf();
    } 
    object = v22.a;
    xd.postInvalidateOnAnimation();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */