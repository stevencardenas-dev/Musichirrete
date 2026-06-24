import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class yn1 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public final ImageView A;
  
  public final ImageView B;
  
  public final cj0 C;
  
  public final TextView w;
  
  public final TextView x;
  
  public final TextView y;
  
  public final TextView z;
  
  public yn1(View paramView, cj0 paramcj0, boolean paramBoolean) {
    super(paramView);
    this.y = (TextView)paramView.findViewById(2131297890);
    this.w = (TextView)paramView.findViewById(2131297685);
    this.x = (TextView)paramView.findViewById(2131297692);
    this.z = (TextView)paramView.findViewById(2131297740);
    this.A = (ImageView)paramView.findViewById(2131296913);
    this.B = (ImageView)paramView.findViewById(2131296842);
    ImageView imageView = (ImageView)paramView.findViewById(2131296876);
    this.C = paramcj0;
    paramView.setOnClickListener(this);
    imageView.setOnClickListener(this);
    paramView.setOnLongClickListener(this);
    if (paramBoolean)
      paramView.setBackgroundDrawable(m92.z(paramView.getContext(), 2130969903)); 
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      int j = paramView.getId();
      cj0 cj01 = this.C;
      if (j == 2131296876) {
        cj01.a(i);
        return;
      } 
      cj01.d(i);
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    if (i >= 0)
      this.C.b(i); 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */