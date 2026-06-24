import android.view.ViewGroup;
import java.util.ArrayList;

public final class mw1 extends lw1 {
  public final b9 a;
  
  public final nw1 b;
  
  public mw1(nw1 paramnw1, b9 paramb9) {
    this.b = paramnw1;
    this.a = paramb9;
  }
  
  public final void d(kw1 paramkw1) {
    ViewGroup viewGroup = this.b.c;
    ((ArrayList)this.a.get(viewGroup)).remove(paramkw1);
    paramkw1.A(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */