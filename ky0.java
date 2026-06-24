import android.view.View;
import android.widget.TextView;

public final class ky0 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final ly0 x;
  
  public ky0(ly0 paramly0, View paramView) {
    super(paramView);
    this.w = (TextView)paramView.findViewById(2131297890);
    paramView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      this.x.getClass();
      if (my0.d() && my0.d()) {
        km0 km0 = my0.c.remove(i);
        if (km0 != null) {
          my0.e -= km0.c.g;
          my0.d.remove(Integer.valueOf(km0.b));
          if (my0.h)
            my0.f(); 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ky0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */