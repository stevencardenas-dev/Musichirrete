import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class z42 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final TextView w;
  
  public final TextView x;
  
  public final ImageView y;
  
  public final a52 z;
  
  public z42(a52 parama52, View paramView) {
    super(paramView);
    TextView textView1 = (TextView)paramView.findViewById(2131297890);
    this.w = textView1;
    TextView textView2 = (TextView)paramView.findViewById(2131297878);
    this.x = textView2;
    ImageView imageView = (ImageView)paramView.findViewById(2131296843);
    imageView.setVisibility(0);
    textView2.setVisibility(0);
    this.y = (ImageView)paramView.findViewById(2131296866);
    imageView.setOnClickListener(this);
    paramView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
    textView1.setSingleLine(true);
    textView2.setSelected(true);
  }
  
  public final void onClick(View paramView) {
    if (paramView.getId() == 2131296843) {
      a52.E0(this.z, c());
      return;
    } 
    s();
  }
  
  public final boolean onLongClick(View paramView) {
    s();
    return true;
  }
  
  public final void s() {
    a52 a521 = this.z;
    v00 v00 = a521.k0.get(c());
    if (v00 instanceof ww1) {
      ms0 ms0 = new ms0(a521.P());
      ms0.f = v00.v();
      ms0.i(new CharSequence[] { a521.T(2131886527), a521.T(2131887170) });
      ms0.j(new ds1(6, this));
      ms0.p();
      return;
    } 
    if (v00 instanceof lw0)
      a521.m0 = n0.y(a521.P(), a521, v00); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */