import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public final class fv1 implements hx0 {
  public rw0 b;
  
  public uw0 c;
  
  public final Toolbar e;
  
  public fv1(Toolbar paramToolbar) {
    this.e = paramToolbar;
  }
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {}
  
  public final boolean c(uw0 paramuw0) {
    Toolbar toolbar = this.e;
    View view = toolbar.k;
    if (view instanceof fm)
      ((fm)view).onActionViewCollapsed(); 
    toolbar.removeView(toolbar.k);
    toolbar.removeView((View)toolbar.j);
    toolbar.k = null;
    ArrayList<View> arrayList = toolbar.G;
    for (int i = arrayList.size() - 1; i >= 0; i--)
      toolbar.addView(arrayList.get(i)); 
    arrayList.clear();
    this.c = null;
    toolbar.requestLayout();
    paramuw0.C = false;
    paramuw0.n.p(false);
    toolbar.v();
    return true;
  }
  
  public final boolean f(uw0 paramuw0) {
    Toolbar toolbar = this.e;
    toolbar.c();
    ViewParent viewParent2 = toolbar.j.getParent();
    if (viewParent2 != toolbar) {
      if (viewParent2 instanceof ViewGroup)
        ((ViewGroup)viewParent2).removeView((View)toolbar.j); 
      toolbar.addView((View)toolbar.j);
    } 
    View view2 = paramuw0.getActionView();
    toolbar.k = view2;
    this.c = paramuw0;
    ViewParent viewParent1 = view2.getParent();
    if (viewParent1 != toolbar) {
      if (viewParent1 instanceof ViewGroup)
        ((ViewGroup)viewParent1).removeView(toolbar.k); 
      gv1 gv1 = Toolbar.h();
      gv1.a = toolbar.p & 0x70 | 0x800003;
      gv1.b = 2;
      toolbar.k.setLayoutParams((ViewGroup.LayoutParams)gv1);
      toolbar.addView(toolbar.k);
    } 
    for (int i = toolbar.getChildCount() - 1; i >= 0; i--) {
      View view = toolbar.getChildAt(i);
      if (((gv1)view.getLayoutParams()).b != 2 && view != toolbar.b) {
        toolbar.removeViewAt(i);
        toolbar.G.add(view);
      } 
    } 
    toolbar.requestLayout();
    paramuw0.C = true;
    paramuw0.n.p(false);
    View view1 = toolbar.k;
    if (view1 instanceof fm)
      ((fm)view1).onActionViewExpanded(); 
    toolbar.v();
    return true;
  }
  
  public final void g() {
    if (this.c != null) {
      rw0 rw01 = this.b;
      if (rw01 != null) {
        int i = rw01.f.size();
        for (byte b = 0; b < i; b++) {
          if (this.b.getItem(b) == this.c)
            // Byte code: goto -> 64 
        } 
      } 
      c(this.c);
    } 
  }
  
  public final void i(Context paramContext, rw0 paramrw0) {
    rw0 rw01 = this.b;
    if (rw01 != null) {
      uw0 uw01 = this.c;
      if (uw01 != null)
        rw01.d(uw01); 
    } 
    this.b = paramrw0;
  }
  
  public final boolean j(tq1 paramtq1) {
    return false;
  }
  
  public final boolean k() {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */