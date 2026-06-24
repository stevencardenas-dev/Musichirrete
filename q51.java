import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

public final class q51 extends kn0 {
  public final r51 q;
  
  public q51(r51 paramr51, Context paramContext) {
    super(paramContext);
  }
  
  public final float d(DisplayMetrics paramDisplayMetrics) {
    return 100.0F / paramDisplayMetrics.densityDpi;
  }
  
  public final int e(int paramInt) {
    return Math.min(100, super.e(paramInt));
  }
  
  public final void h(View paramView, bd parambd) {
    r51 r511 = this.q;
    int[] arrayOfInt = r511.a(r511.a.getLayoutManager(), paramView);
    int j = arrayOfInt[0];
    int i = arrayOfInt[1];
    int k = (int)Math.ceil(e(Math.max(Math.abs(j), Math.abs(i))) / 0.3356D);
    if (k > 0) {
      parambd.a = j;
      parambd.b = i;
      parambd.c = k;
      parambd.g = this.j;
      parambd.e = true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */