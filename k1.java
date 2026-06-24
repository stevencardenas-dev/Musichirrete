import android.animation.Animator;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class k1 implements Runnable {
  public final int b;
  
  public final ActionBarOverlayLayout c;
  
  public final void run() {
    int i = this.b;
    ActionBarOverlayLayout actionBarOverlayLayout = this.c;
    switch (i) {
      default:
        actionBarOverlayLayout.h();
        actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(-actionBarOverlayLayout.f.getHeight()).setListener((Animator.AnimatorListener)actionBarOverlayLayout.z);
        return;
      case 0:
        break;
    } 
    actionBarOverlayLayout.h();
    actionBarOverlayLayout.y = actionBarOverlayLayout.f.animate().translationY(0.0F).setListener((Animator.AnimatorListener)actionBarOverlayLayout.z);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */