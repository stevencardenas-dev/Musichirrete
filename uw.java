import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

public final class uw extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final CompoundButton w;
  
  public final TextView x;
  
  public final vw y;
  
  public uw(View paramView, vw paramvw) {
    super(paramView);
    this.w = (CompoundButton)paramView.findViewById(2131297099);
    this.x = (TextView)paramView.findViewById(2131297108);
    this.y = paramvw;
    paramView.setOnClickListener(this);
    paramvw.d.e.getClass();
  }
  
  public final void onClick(View paramView) {
    vw vw1 = this.y;
    ss0 ss02 = vw1.g;
    ss0 ss01 = vw1.d;
    if (ss02 != null) {
      if (ss01.e.p != null && c() < ss01.e.p.size())
        CharSequence charSequence = ss01.e.p.get(c()); 
      vw1.g.e(paramView, c(), false);
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    vw vw1 = this.y;
    ss0 ss02 = vw1.g;
    ss0 ss01 = vw1.d;
    if (ss02 != null) {
      if (ss01.e.p != null && c() < ss01.e.p.size())
        CharSequence charSequence = ss01.e.p.get(c()); 
      return vw1.g.e(paramView, c(), true);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */