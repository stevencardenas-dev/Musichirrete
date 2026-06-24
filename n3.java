import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import in.krosbits.musicolet.Tag2Activity;

public final class n3 extends he1 implements View.OnClickListener {
  public final ImageView w;
  
  public final o3 x;
  
  public n3(o3 paramo3, View paramView, int paramInt) {
    super(paramView);
    this.w = (ImageView)paramView.findViewById(2131296878);
    ImageView imageView = (ImageView)paramView.findViewById(2131296866);
    if (paramInt == 1) {
      imageView.setImageResource(2131231146);
      imageView.setVisibility(0);
    } 
    paramView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      Tag2Activity tag2Activity;
      o3 o31 = this.x;
      if (o31.j.f(i) == 1) {
        tag2Activity = o31.e;
        tag2Activity.getClass();
        n0.A((Activity)tag2Activity, 10311);
        return;
      } 
      Intent intent = new Intent();
      intent.setData(((o3)tag2Activity).i.get(i));
      ((o3)tag2Activity).e.w0(intent);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */