import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

public abstract class p52 {
  public static void a(Window.Callback paramCallback, List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt) {
    paramCallback.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */