import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class m10 extends AnimatorListenerAdapter {
  public final int a;
  
  public final n10 b;
  
  public void onAnimationEnd(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationEnd(paramAnimator);
        return;
      case 1:
        break;
    } 
    super.onAnimationEnd(paramAnimator);
    n10 n101 = this.b;
    n10.a(n101);
    ArrayList<Object> arrayList = n101.i;
    if (arrayList != null && !n101.j) {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        md md = (md)arrayList.get(b);
        b++;
        ((md)md).a(n101);
      } 
    } 
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 0:
        break;
    } 
    super.onAnimationStart(paramAnimator);
    n10 n101 = this.b;
    ArrayList<Animator> arrayList = n101.i;
    if (arrayList != null && !n101.j) {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        paramAnimator = arrayList.get(b);
        b++;
        ((md)paramAnimator).b(n101);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */