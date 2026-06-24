import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public final class vh0 extends AnimatorListenerAdapter {
  public final int a;
  
  public final TextView b;
  
  public final int c;
  
  public final TextView d;
  
  public final xh0 e;
  
  public vh0(xh0 paramxh0, int paramInt1, TextView paramTextView1, int paramInt2, TextView paramTextView2) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {
    int i = this.a;
    xh0 xh01 = this.e;
    xh01.n = i;
    xh01.l = null;
    TextView textView = this.b;
    if (textView != null) {
      textView.setVisibility(4);
      if (this.c == 1) {
        AppCompatTextView appCompatTextView = xh01.r;
        if (appCompatTextView != null)
          appCompatTextView.setText(null); 
      } 
    } 
    textView = this.d;
    if (textView != null) {
      textView.setTranslationY(0.0F);
      textView.setAlpha(1.0F);
    } 
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    TextView textView = this.d;
    if (textView != null) {
      textView.setVisibility(0);
      textView.setAlpha(0.0F);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */