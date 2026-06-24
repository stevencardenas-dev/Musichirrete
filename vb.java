import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class vb extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public TextView A;
  
  public ImageView B;
  
  public ImageView C;
  
  public rn1 D;
  
  public TextView w;
  
  public TextView x;
  
  public TextView y;
  
  public TextView z;
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      int j = paramView.getId();
      rn1 rn11 = this.D;
      if (j == 2131296876) {
        rn11.a(i);
        return;
      } 
      rn11.d(i);
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0)
      this.D.b(i); 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */