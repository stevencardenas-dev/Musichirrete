import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class w6 extends so implements y5 {
  public u6 g;
  
  public final v6 h = new v6(this);
  
  public w6(Context paramContext, int paramInt) {
    super(paramContext, i);
    g6 g6 = d();
    int i = paramInt;
    if (paramInt == 0) {
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(2130969066, typedValue, true);
      i = typedValue.resourceId;
    } 
    ((u6)g6).V = i;
    g6.e();
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    c();
    u6 u61 = (u6)d();
    u61.w();
    ((ViewGroup)u61.C.findViewById(16908290)).addView(paramView, paramLayoutParams);
    u61.o.a(u61.n.getCallback());
  }
  
  public final g6 d() {
    if (this.g == null) {
      tk1 tk1 = g6.b;
      this.g = new u6(getContext(), getWindow(), this, this);
    } 
    return this.g;
  }
  
  public void dismiss() {
    super.dismiss();
    d().f();
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return ws2.A(this.h, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public final boolean e(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final View findViewById(int paramInt) {
    u6 u61 = (u6)d();
    u61.w();
    return u61.n.findViewById(paramInt);
  }
  
  public final void invalidateOptionsMenu() {
    d().b();
  }
  
  public void onCreate(Bundle paramBundle) {
    d().a();
    super.onCreate(paramBundle);
    d().e();
  }
  
  public final void onStop() {
    super.onStop();
    u6 u61 = (u6)d();
    u61.A();
    ui0 ui0 = u61.p;
    if (ui0 != null)
      ui0.d0(false); 
  }
  
  public void setContentView(int paramInt) {
    c();
    d().j(paramInt);
  }
  
  public void setContentView(View paramView) {
    c();
    d().k(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    c();
    d().l(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt) {
    super.setTitle(paramInt);
    d().m(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    d().m(paramCharSequence);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */