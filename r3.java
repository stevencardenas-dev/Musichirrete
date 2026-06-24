import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class r3 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public ImageView A;
  
  public rn1 B;
  
  public TextView w;
  
  public TextView x;
  
  public TextView y;
  
  public ImageView z;
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      int j = paramView.getId();
      rn1 rn11 = this.B;
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
      this.B.b(i); 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */