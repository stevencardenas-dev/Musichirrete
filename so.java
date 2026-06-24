import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

public class so extends Dialog implements um0, ui1 {
  public wm0 b;
  
  public final j01 c = new j01(new ti1(this, new pp(7, this)));
  
  public final cs1 e = new cs1(new ro(this, 0));
  
  public final cs1 f = new cs1(new ro(this, 1));
  
  public so(Context paramContext, int paramInt) {
    super(paramContext, paramInt);
  }
  
  public static void a(so paramso) {
    paramso.onBackPressed();
  }
  
  public final wm0 N() {
    wm0 wm02 = this.b;
    wm0 wm01 = wm02;
    if (wm02 == null) {
      wm01 = new wm0(this);
      this.b = wm01;
    } 
    return wm01;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    paramView.getClass();
    c();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final b41 b() {
    return (b41)this.f.getValue();
  }
  
  public final void c() {
    Window window4 = getWindow();
    window4.getClass();
    View view4 = window4.getDecorView();
    view4.getClass();
    view4.setTag(2131297954, this);
    Window window3 = getWindow();
    window3.getClass();
    View view3 = window3.getDecorView();
    view3.getClass();
    view3.setTag(2131297956, this);
    Window window2 = getWindow();
    window2.getClass();
    View view2 = window2.getDecorView();
    view2.getClass();
    view2.setTag(2131297957, this);
    Window window1 = getWindow();
    window1.getClass();
    View view1 = window1.getDecorView();
    view1.getClass();
    view1.setTag(2131297955, this);
  }
  
  public final j01 h() {
    return (j01)this.c.e;
  }
  
  public final void onBackPressed() {
    ((vz)this.e.getValue()).a();
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 33) {
      b41 b41 = b();
      OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
      onBackInvokedDispatcher.getClass();
      b41.c(onBackInvokedDispatcher);
    } 
    this.c.t(paramBundle);
    wm0 wm02 = this.b;
    wm0 wm01 = wm02;
    if (wm02 == null) {
      wm01 = new wm0(this);
      this.b = wm01;
    } 
    wm01.e(om0.ON_CREATE);
  }
  
  public final Bundle onSaveInstanceState() {
    Bundle bundle = super.onSaveInstanceState();
    bundle.getClass();
    this.c.u(bundle);
    return bundle;
  }
  
  public void onStart() {
    super.onStart();
    wm0 wm02 = this.b;
    wm0 wm01 = wm02;
    if (wm02 == null) {
      wm01 = new wm0(this);
      this.b = wm01;
    } 
    wm01.e(om0.ON_RESUME);
  }
  
  public void onStop() {
    wm0 wm02 = this.b;
    wm0 wm01 = wm02;
    if (wm02 == null) {
      wm01 = new wm0(this);
      this.b = wm01;
    } 
    wm01.e(om0.ON_DESTROY);
    this.b = null;
    super.onStop();
  }
  
  public void setContentView(int paramInt) {
    c();
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView) {
    paramView.getClass();
    c();
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    paramView.getClass();
    c();
    super.setContentView(paramView, paramLayoutParams);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */