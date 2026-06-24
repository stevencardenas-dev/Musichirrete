import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class fn extends he1 implements View.OnClickListener {
  public final FloatingActionButton w;
  
  public final j41 x;
  
  public fn(FloatingActionButton paramFloatingActionButton, int paramInt, bh0 parambh0) {
    super((View)paramFloatingActionButton);
    this.w = paramFloatingActionButton;
    this.x = parambh0;
    paramFloatingActionButton.setSize(1);
    if (paramInt == 0) {
      paramFloatingActionButton.setImageResource(2131231117);
    } else {
      paramFloatingActionButton.setImageResource(2131231127);
    } 
    paramFloatingActionButton.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    this.x.v(c());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */