import android.view.View;
import java.util.List;

public final class hn0 {
  public boolean a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public List k;
  
  public boolean l;
  
  public final void a(View paramView) {
    View view2;
    int j = this.k.size();
    View view1 = null;
    int i = Integer.MAX_VALUE;
    byte b = 0;
    while (true) {
      view2 = view1;
      if (b < j) {
        View view = ((he1)this.k.get(b)).b;
        sd1 sd1 = (sd1)view.getLayoutParams();
        view2 = view1;
        int k = i;
        if (view != paramView)
          if (sd1.b.j()) {
            view2 = view1;
            k = i;
          } else {
            int m = (sd1.b.d() - this.d) * this.e;
            if (m < 0) {
              view2 = view1;
              k = i;
            } else {
              view2 = view1;
              k = i;
              if (m < i) {
                view1 = view;
                if (m == 0) {
                  view2 = view1;
                  break;
                } 
                k = m;
                view2 = view1;
              } 
            } 
          }  
        b++;
        view1 = view2;
        i = k;
        continue;
      } 
      break;
    } 
    if (view2 == null) {
      this.d = -1;
      return;
    } 
    this.d = ((sd1)view2.getLayoutParams()).b.d();
  }
  
  public final View b(yd1 paramyd1) {
    List list = this.k;
    if (list != null) {
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        view = ((he1)this.k.get(b)).b;
        sd1 sd1 = (sd1)view.getLayoutParams();
        if (!sd1.b.j() && this.d == sd1.b.d()) {
          a(view);
          return view;
        } 
      } 
      return null;
    } 
    View view = view.d(this.d);
    this.d += this.e;
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */