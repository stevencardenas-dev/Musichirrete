import android.view.View;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

public final class j6 extends x32 {
  public final int a;
  
  public final Object b;
  
  public final void a() {
    PopupWindow popupWindow;
    WeakHashMap weakHashMap;
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        object = ((g7)object).e;
        ((u6)object).w.setVisibility(8);
        popupWindow = ((u6)object).x;
        if (popupWindow != null) {
          popupWindow.dismiss();
        } else if (((u6)object).w.getParent() instanceof View) {
          View view = (View)((u6)object).w.getParent();
          WeakHashMap weakHashMap1 = v22.a;
          view.requestApplyInsets();
        } 
        ((u6)object).w.e();
        ((u6)object).z.d(null);
        ((u6)object).z = null;
        object = ((u6)object).C;
        weakHashMap = v22.a;
        object.requestApplyInsets();
        return;
      case 1:
        object = object;
        ((u6)object).w.setAlpha(1.0F);
        ((u6)object).z.d(null);
        ((u6)object).z = null;
        return;
      case 0:
        break;
    } 
    object = ((h6)object).c;
    ((u6)object).w.setAlpha(1.0F);
    ((u6)object).z.d(null);
    ((u6)object).z = null;
  }
  
  public void c() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return;
      case 1:
        object = object;
        ((u6)object).w.setVisibility(0);
        if (((u6)object).w.getParent() instanceof View) {
          object = ((u6)object).w.getParent();
          WeakHashMap weakHashMap = v22.a;
          object.requestApplyInsets();
        } 
        return;
      case 0:
        break;
    } 
    ((h6)object).c.w.setVisibility(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */