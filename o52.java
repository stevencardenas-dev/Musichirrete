import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

public abstract class o52 {
  public static boolean a(Window.Callback paramCallback, SearchEvent paramSearchEvent) {
    return paramCallback.onSearchRequested(paramSearchEvent);
  }
  
  public static ActionMode b(Window.Callback paramCallback, ActionMode.Callback paramCallback1, int paramInt) {
    return paramCallback.onWindowStartingActionMode(paramCallback1, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */