import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

public final class j22 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
  public final WeakHashMap b = new WeakHashMap<Object, Object>();
  
  public final void onGlobalLayout() {
    if (Build.VERSION.SDK_INT < 28)
      for (Map.Entry entry : this.b.entrySet()) {
        boolean bool1;
        View view = (View)entry.getKey();
        boolean bool2 = ((Boolean)entry.getValue()).booleanValue();
        if (view.isShown() && view.getWindowVisibility() == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (bool2 != bool1) {
          byte b;
          if (bool1) {
            b = 16;
          } else {
            b = 32;
          } 
          v22.h(view, b);
          entry.setValue(Boolean.valueOf(bool1));
        } 
      }  
  }
  
  public final void onViewAttachedToWindow(View paramView) {
    paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
  }
  
  public final void onViewDetachedFromWindow(View paramView) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */