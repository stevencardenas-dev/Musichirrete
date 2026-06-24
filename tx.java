import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class tx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  public final ag1 b;
  
  public final WeakReference c;
  
  public tx(ag1 paramag1, ImageView paramImageView) {
    this.b = paramag1;
    this.c = new WeakReference<ImageView>(paramImageView);
    paramImageView.addOnAttachStateChangeListener(this);
    if (paramImageView.getWindowToken() != null)
      paramImageView.getViewTreeObserver().addOnPreDrawListener(this); 
  }
  
  public final boolean onPreDraw() {
    WeakReference<ImageView> weakReference = this.c;
    ImageView imageView = weakReference.get();
    if (imageView != null) {
      ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
      if (viewTreeObserver.isAlive()) {
        int j = imageView.getWidth();
        int i = imageView.getHeight();
        if (j > 0 && i > 0) {
          imageView.removeOnAttachStateChangeListener(this);
          viewTreeObserver.removeOnPreDrawListener(this);
          weakReference.clear();
          ag1 ag11 = this.b;
          ag11.d = false;
          ag11.b.a(j, i);
          ag11.f(imageView);
        } 
      } 
    } 
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView) {
    paramView.getViewTreeObserver().addOnPreDrawListener(this);
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    paramView.getViewTreeObserver().removeOnPreDrawListener(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */