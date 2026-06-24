import android.view.View;
import java.util.List;

public final class gi0 extends hd {
  public final View b;
  
  public int c;
  
  public int d;
  
  public final int[] e = new int[2];
  
  public gi0(View paramView) {
    this.b = paramView;
  }
  
  public final void h(d62 paramd62) {
    this.b.setTranslationY(0.0F);
  }
  
  public final void i(d62 paramd62) {
    View view = this.b;
    int[] arrayOfInt = this.e;
    view.getLocationOnScreen(arrayOfInt);
    this.c = arrayOfInt[1];
  }
  
  public final x62 j(x62 paramx62, List paramList) {
    for (d62 d62 : paramList) {
      if ((d62.a.d() & 0x8) != 0) {
        int i = this.d;
        float f = g5.c(d62.a.c(), i, 0);
        this.b.setTranslationY(f);
        break;
      } 
    } 
    return paramx62;
  }
  
  public final j01 k(d62 paramd62, j01 paramj01) {
    View view = this.b;
    int[] arrayOfInt = this.e;
    view.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    i = this.c - i;
    this.d = i;
    view.setTranslationY(i);
    return paramj01;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */