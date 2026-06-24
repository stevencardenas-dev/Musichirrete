import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;

public final class wn0 implements hx0, AdapterView.OnItemClickListener {
  public Context b;
  
  public LayoutInflater c;
  
  public rw0 e;
  
  public ExpandedMenuView f;
  
  public gx0 g;
  
  public vn0 h;
  
  public wn0(ContextWrapper paramContextWrapper) {
    this.b = (Context)paramContextWrapper;
    this.c = LayoutInflater.from((Context)paramContextWrapper);
  }
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {
    gx0 gx01 = this.g;
    if (gx01 != null)
      gx01.a(paramrw0, paramBoolean); 
  }
  
  public final boolean c(uw0 paramuw0) {
    return false;
  }
  
  public final void e(gx0 paramgx0) {
    throw null;
  }
  
  public final boolean f(uw0 paramuw0) {
    return false;
  }
  
  public final void g() {
    vn0 vn01 = this.h;
    if (vn01 != null)
      vn01.notifyDataSetChanged(); 
  }
  
  public final void i(Context paramContext, rw0 paramrw0) {
    if (this.b != null) {
      this.b = paramContext;
      if (this.c == null)
        this.c = LayoutInflater.from(paramContext); 
    } 
    this.e = paramrw0;
    vn0 vn01 = this.h;
    if (vn01 != null)
      vn01.notifyDataSetChanged(); 
  }
  
  public final boolean j(tq1 paramtq1) {
    boolean bool = paramtq1.hasVisibleItems();
    Context context = paramtq1.a;
    if (!bool)
      return false; 
    Object object = new Object();
    ((sw0)object).b = paramtq1;
    mi2 mi2 = new mi2(context);
    v3 v3 = (v3)mi2.e;
    wn0 wn01 = new wn0((ContextWrapper)v3.a);
    ((sw0)object).e = wn01;
    wn01.g = (gx0)object;
    paramtq1.b(wn01, context);
    wn01 = ((sw0)object).e;
    if (wn01.h == null)
      wn01.h = new vn0(wn01); 
    v3.o = (ListAdapter)wn01.h;
    v3.p = (DialogInterface.OnClickListener)object;
    View view = paramtq1.o;
    if (view != null) {
      v3.e = view;
    } else {
      v3.c = paramtq1.n;
      v3.d = paramtq1.m;
    } 
    v3.m = (sw0)object;
    z3 z3 = mi2.c();
    ((sw0)object).c = z3;
    z3.setOnDismissListener((DialogInterface.OnDismissListener)object);
    WindowManager.LayoutParams layoutParams = ((sw0)object).c.getWindow().getAttributes();
    layoutParams.type = 1003;
    layoutParams.flags |= 0x20000;
    ((sw0)object).c.show();
    object = this.g;
    if (object != null)
      object.k(paramtq1); 
    return true;
  }
  
  public final boolean k() {
    return false;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.e.q(this.h.b(paramInt), this, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */