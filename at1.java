import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;

public final class at1 extends he1 implements View.OnTouchListener {
  public final SmartTextView w;
  
  public final SmartImageView x;
  
  public final ImageView y;
  
  public final bt1 z;
  
  public at1(bt1 parambt1, View paramView) {
    super(paramView);
    this.w = (SmartTextView)paramView.findViewById(2131297884);
    this.x = (SmartImageView)paramView.findViewById(2131296909);
    ImageView imageView = (ImageView)paramView.findViewById(2131296852);
    this.y = imageView;
    imageView.setOnTouchListener(this);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    this.z.E0.q(this);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\at1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */