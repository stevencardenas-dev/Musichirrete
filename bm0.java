import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class bm0 extends he1 implements View.OnClickListener {
  public final TextView w;
  
  public final TextView x;
  
  public final TextView y;
  
  public final TextView z;
  
  public bm0(cm0 paramcm0, View paramView, int paramInt) {
    super(paramView);
    TextView textView1 = (TextView)paramView.findViewById(2131297872);
    this.w = textView1;
    TextView textView4 = (TextView)paramView.findViewById(2131297890);
    this.x = textView4;
    TextView textView3 = (TextView)paramView.findViewById(2131297692);
    this.y = textView3;
    TextView textView2 = (TextView)paramView.findViewById(2131297740);
    this.z = textView2;
    int i = MyApplication.i.getApplicationContext().getResources().getColor(2131100755);
    int j = MyApplication.i.getApplicationContext().getResources().getColor(2131100780);
    if (paramInt == 0)
      i = j; 
    if (textView1 != null)
      textView1.setTextColor(i); 
    textView4.setTextColor(i);
    textView3.setTextColor(i);
    textView2.setTextColor(i);
    if (paramInt == 1) {
      ImageView imageView = (ImageView)paramView.findViewById(2131296879);
      if (imageView != null) {
        imageView.setColorFilter(0xFF000000 | i);
        imageView.setImageAlpha(Color.alpha(i));
      } 
    } 
    paramView.setOnClickListener(this);
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicService.class)).setAction("ACTION_WQJTS").putExtra("E_WQSI", i);
      MyApplication.i.getApplicationContext().startService(intent);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */