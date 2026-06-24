import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;

public final class n7 implements t7, DialogInterface.OnClickListener {
  public z3 b;
  
  public o7 c;
  
  public CharSequence e;
  
  public final u7 f;
  
  public n7(u7 paramu7) {
    this.f = paramu7;
  }
  
  public final boolean b() {
    z3 z31 = this.b;
    return (z31 != null) ? z31.isShowing() : false;
  }
  
  public final int c() {
    return 0;
  }
  
  public final void dismiss() {
    z3 z31 = this.b;
    if (z31 != null) {
      z31.dismiss();
      this.b = null;
    } 
  }
  
  public final Drawable e() {
    return null;
  }
  
  public final void g(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
  }
  
  public final void i(Drawable paramDrawable) {
    Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
  }
  
  public final void k(int paramInt) {
    Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
  }
  
  public final void l(int paramInt) {
    Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
  }
  
  public final void m(int paramInt) {
    Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
  }
  
  public final void n(int paramInt1, int paramInt2) {
    if (this.c == null)
      return; 
    u7 u71 = this.f;
    mi2 mi2 = new mi2(u71.getPopupContext());
    v3 v3 = (v3)mi2.e;
    CharSequence charSequence = this.e;
    if (charSequence != null)
      v3.d = charSequence; 
    o7 o71 = this.c;
    int i = u71.getSelectedItemPosition();
    v3.o = o71;
    v3.p = this;
    v3.u = i;
    v3.t = true;
    z3 z31 = mi2.c();
    this.b = z31;
    AlertController.RecycleListView recycleListView = z31.i.f;
    recycleListView.setTextDirection(paramInt1);
    recycleListView.setTextAlignment(paramInt2);
    this.b.show();
  }
  
  public final int o() {
    return 0;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    u7 u71 = this.f;
    u71.setSelection(paramInt);
    if (u71.getOnItemClickListener() != null)
      u71.performItemClick(null, paramInt, this.c.getItemId(paramInt)); 
    dismiss();
  }
  
  public final CharSequence p() {
    return this.e;
  }
  
  public final void q(ListAdapter paramListAdapter) {
    this.c = (o7)paramListAdapter;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */