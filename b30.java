import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public abstract class b30 {
  public static i30 a;
  
  static {
    Color.argb(230, 255, 255, 255);
    Color.argb(128, 27, 27, 27);
  }
  
  public static final void a(qo paramqo, hs1 paramhs11, hs1 paramhs12) {
    paramqo.getClass();
    View view = paramqo.getWindow().getDecorView();
    view.getClass();
    i30 i301 = a;
    Object object = i301;
    if (i301 == null) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 35) {
        object = new Object();
      } else if (i >= 30) {
        object = new Object();
      } else if (i >= 29) {
        object = new Object();
      } else if (i >= 28) {
        object = new Object();
      } else if (i >= 26) {
        object = new Object();
      } else {
        object = new Object();
      } 
      a = (i30)object;
    } 
    z20 z20 = new z20(object, paramhs11, paramhs12, paramqo, view, 0);
    ViewGroup viewGroup = (ViewGroup)view;
    byte b = 0;
    while (true) {
      boolean bool;
      if (b < viewGroup.getChildCount()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        View view1 = viewGroup.getChildAt(b);
        if (view1 != null) {
          if (view1.getTag() instanceof i30)
            break; 
          b++;
          continue;
        } 
        throw new IndexOutOfBoundsException();
      } 
      a30 a30 = new a30(z20, viewGroup.getContext());
      a30.setTag(object);
      a30.setVisibility(8);
      a30.setWillNotDraw(true);
      viewGroup.addView(a30);
      break;
    } 
    z20.run();
    Window window = paramqo.getWindow();
    window.getClass();
    object.a(window);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */