import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import ss.com.bannerslider.PercentLinearLayoutManager;
import ss.com.bannerslider.Slider;

public final class gn1 extends vd1 {
  public final int a;
  
  public final Slider b;
  
  public final void a(RecyclerView paramRecyclerView, int paramInt) {
    int i = this.a;
    Slider slider = this.b;
    switch (i) {
      default:
        if (slider.j.b && paramInt == 0) {
          paramInt = slider.k;
          jn1 jn1 = slider.g;
          if (paramInt == 0) {
            paramRecyclerView.k0(jn1.c() - 2);
            slider.a(slider.g.c() - 2);
          } else if (paramInt == jn1.c() - 1) {
            paramRecyclerView.k0(1);
            slider.a(1);
          } 
        } 
        return;
      case 0:
        break;
    } 
    if (slider.p != paramInt) {
      slider.p = paramInt;
      if (paramInt == 0) {
        PercentLinearLayoutManager percentLinearLayoutManager = slider.e;
        View view = percentLinearLayoutManager.b1(0, percentLinearLayoutManager.G(), true, false);
        if (view == null) {
          i = -1;
        } else {
          i = a.R(view);
        } 
        if (i >= 0 && i != slider.o) {
          slider.h.K(i);
          slider.a(i);
          slider.o = i;
        } 
      } 
      vd1 vd11 = slider.q;
      if (vd11 != null)
        vd11.a(paramRecyclerView, paramInt); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */