import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class o40 {
  public final TextInputLayout a;
  
  public final n40 b;
  
  public final Context c;
  
  public final CheckableImageButton d;
  
  public o40(n40 paramn40) {
    this.a = paramn40.b;
    this.b = paramn40;
    this.c = paramn40.getContext();
    this.d = paramn40.i;
  }
  
  public void a() {}
  
  public void b() {}
  
  public int c() {
    return 0;
  }
  
  public int d() {
    return 0;
  }
  
  public View.OnFocusChangeListener e() {
    return null;
  }
  
  public View.OnClickListener f() {
    return null;
  }
  
  public View.OnFocusChangeListener g() {
    return null;
  }
  
  public AccessibilityManager.TouchExplorationStateChangeListener h() {
    return null;
  }
  
  public boolean i(int paramInt) {
    return true;
  }
  
  public boolean j() {
    return this instanceof c20;
  }
  
  public boolean k() {
    return false;
  }
  
  public void l(EditText paramEditText) {}
  
  public void m(t0 paramt0) {}
  
  public void n(AccessibilityEvent paramAccessibilityEvent) {}
  
  public void o(boolean paramBoolean) {}
  
  public final void p() {
    this.b.e(false);
  }
  
  public void q() {}
  
  public void r() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */