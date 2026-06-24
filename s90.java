import android.view.View;
import android.widget.TextView;

public final class s90 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final u90 x;
  
  public s90(u90 paramu90, View paramView) {
    super(paramView);
    this.w = (TextView)paramView.findViewById(2131297759);
    paramView.findViewById(2131296892).setOnClickListener(this);
    paramView.findViewById(2131296876).setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    gf0 gf0 = this.x.i;
    int i = paramView.getId();
    if (i == 2131296892) {
      z51.N(gf0.P(), "I_K_SRTBYF_F", new e(22, gf0), 30);
      return;
    } 
    if (i == 2131296876) {
      gf0.y0 = 1;
      gf0.K0();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */