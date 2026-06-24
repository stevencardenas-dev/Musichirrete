import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class sq1 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public ImageView w;
  
  public TextView x;
  
  public j41 y;
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0)
      this.y.v(i); 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    return (i >= 0) ? this.y.s(i) : true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */