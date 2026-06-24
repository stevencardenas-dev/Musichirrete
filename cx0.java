import android.transition.Transition;
import android.widget.PopupWindow;

public abstract class cx0 {
  public static void a(PopupWindow paramPopupWindow, Transition paramTransition) {
    paramPopupWindow.setEnterTransition(paramTransition);
  }
  
  public static void b(PopupWindow paramPopupWindow, Transition paramTransition) {
    paramPopupWindow.setExitTransition(paramTransition);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */