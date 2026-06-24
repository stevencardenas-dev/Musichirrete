import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class od1 {
  public xy a;
  
  public ArrayList b;
  
  public long c;
  
  public long d;
  
  public long e;
  
  public long f;
  
  public static void b(he1 paramhe1) {
    int i = paramhe1.l;
    if (!paramhe1.h() && (i & 0x4) == 0)
      paramhe1.b(); 
  }
  
  public abstract boolean a(he1 paramhe11, he1 paramhe12, p11 paramp111, p11 paramp112);
  
  public final void c(he1 paramhe1) {
    xy xy1 = this.a;
    if (xy1 != null) {
      RecyclerView recyclerView = xy1.b;
      boolean bool1 = true;
      paramhe1.p(true);
      View view = paramhe1.b;
      if (paramhe1.j != null && paramhe1.k == null)
        paramhe1.j = null; 
      paramhe1.k = null;
      if ((paramhe1.l & 0x10) != 0)
        return; 
      yd1 yd1 = recyclerView.e;
      recyclerView.o0();
      tk tk = recyclerView.h;
      sk sk = (sk)tk.d;
      xy xy2 = (xy)tk.c;
      int i = tk.b;
      if (i == 1) {
        if ((View)tk.f != view) {
          tp.f("Cannot call removeViewIfHidden within removeView(At) for a different view");
          return;
        } 
      } else {
        if (i != 2) {
          try {
            tk.b = 2;
            i = xy2.b.indexOfChild(view);
            if (i == -1) {
              tk.k(view);
            } else if (sk.d(i)) {
              sk.g(i);
              tk.k(view);
              xy2.j(i);
            } else {
              tk.b = 0;
              bool1 = false;
            } 
            tk.b = 0;
          } finally {}
        } else {
          tp.f("Cannot call removeViewIfHidden within removeViewIfHidden");
          return;
        } 
        if (bool1) {
          he1 he11 = RecyclerView.O(view);
          yd1.m(he11);
          yd1.j(he11);
          if (RecyclerView.F0) {
            StringBuilder stringBuilder = new StringBuilder("after removing animated view: ");
            stringBuilder.append(view);
            stringBuilder.append(", ");
            stringBuilder.append(recyclerView);
            Log.d("RecyclerView", stringBuilder.toString());
          } 
        } 
      } 
    } else {
      return;
    } 
    boolean bool = false;
  }
  
  public abstract void d(he1 paramhe1);
  
  public abstract void e();
  
  public abstract boolean f();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\od1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */