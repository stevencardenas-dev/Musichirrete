import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class jn1 extends id1 {
  public q41 d;
  
  public in1 e;
  
  public boolean f;
  
  public bo0 g;
  
  public m9 h;
  
  public final int c() {
    byte b;
    int i = this.e.a();
    if (this.f) {
      b = 2;
    } else {
      b = 0;
    } 
    return i + b;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    View view = paramhe1.b;
    m9 m91 = this.h;
    in1 in11 = this.e;
    if (!this.f) {
      in11.b(paramInt, (jh0)paramhe1);
    } else if (paramInt == 0) {
      in11.b(((in1)m91.c).a() - 1, (jh0)paramhe1);
    } else if (paramInt == c() - 1) {
      m91.getClass();
      in11.b(0, (jh0)paramhe1);
    } else {
      in11.b(paramInt - 1, (jh0)paramhe1);
    } 
    boolean bool = in11.a;
    view.setOnClickListener(new fj(1, this, paramhe1));
    view.setOnTouchListener(this.g);
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    if (paramInt == 0) {
      ImageView imageView = new ImageView(paramViewGroup.getContext());
      sd1 sd1 = new sd1(-1, -1);
      if (this.e.a) {
        imageView.setScaleX(0.95F);
        imageView.setScaleY(0.95F);
        ((k61)sd1).g = 60.0F;
      } 
      imageView.setLayoutParams((ViewGroup.LayoutParams)sd1);
      he1 he1 = new he1((View)imageView);
      ((jh0)he1).w = imageView;
      return he1;
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */