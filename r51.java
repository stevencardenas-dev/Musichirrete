import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public final class r51 extends td1 {
  public RecyclerView a;
  
  public final on1 b = new on1(this);
  
  public e51 c;
  
  public e51 d;
  
  public static int b(View paramView, f51 paramf51) {
    int i = paramf51.g(paramView);
    int k = paramf51.e(paramView) / 2;
    int j = paramf51.m();
    return k + i - paramf51.n() / 2 + j;
  }
  
  public static View c(a parama, f51 paramf51) {
    int m = parama.G();
    View view = null;
    if (m == 0)
      return null; 
    int k = paramf51.m();
    int j = paramf51.n() / 2;
    int i = Integer.MAX_VALUE;
    byte b = 0;
    while (b < m) {
      View view1 = parama.F(b);
      int n = paramf51.g(view1);
      int i1 = Math.abs(paramf51.e(view1) / 2 + n - j + k);
      n = i;
      if (i1 < i) {
        view = view1;
        n = i1;
      } 
      b++;
      i = n;
    } 
    return view;
  }
  
  public final int[] a(a parama, View paramView) {
    int[] arrayOfInt = new int[2];
    if (parama.o()) {
      arrayOfInt[0] = b(paramView, d(parama));
    } else {
      arrayOfInt[0] = 0;
    } 
    if (parama.p()) {
      arrayOfInt[1] = b(paramView, e(parama));
      return arrayOfInt;
    } 
    arrayOfInt[1] = 0;
    return arrayOfInt;
  }
  
  public final f51 d(a parama) {
    e51 e511 = this.d;
    if (e511 == null || (a)e511.b != parama)
      this.d = new e51(parama, 0); 
    return this.d;
  }
  
  public final f51 e(a parama) {
    e51 e511 = this.c;
    if (e511 == null || (a)e511.b != parama)
      this.c = new e51(parama, 1); 
    return this.c;
  }
  
  public final void f() {
    RecyclerView recyclerView = this.a;
    if (recyclerView != null) {
      a a = recyclerView.getLayoutManager();
      if (a != null) {
        if (a.p()) {
          View view = c(a, e(a));
        } else if (a.o()) {
          View view = c(a, d(a));
        } else {
          recyclerView = null;
        } 
        if (recyclerView != null) {
          int[] arrayOfInt = a(a, (View)recyclerView);
          int i = arrayOfInt[0];
          if (i != 0 || arrayOfInt[1] != 0) {
            this.a.m0(i, arrayOfInt[1], false);
            return;
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */