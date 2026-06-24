import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.slider.RangeSlider2;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;

public final class dr0 extends id1 {
  public final ArrayList d;
  
  public final double[] e;
  
  public final g7 f;
  
  public dr0(ArrayList paramArrayList, g7 paramg7) {
    this.d = paramArrayList;
    this.e = new double[paramArrayList.size()];
    this.f = paramg7;
    int i = paramArrayList.size();
    double d = 0.0D;
    for (byte b = 0; b < i; b++) {
      this.e[b] = d;
      d += ((Double)((u51)paramArrayList.get(b)).b).doubleValue();
    } 
  }
  
  public final int c() {
    return this.d.size();
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    er0 er0 = (er0)paramhe1;
    ArrayList arrayList = this.d;
    double d3 = ((Double)((u51)arrayList.get(paramInt)).b).doubleValue();
    n2 n2 = er0.w;
    ((MaterialTextView)n2.f).setText(String.valueOf(paramInt + 1));
    ((MaterialTextView)n2.g).setText((CharSequence)((u51)arrayList.get(paramInt)).a);
    ((MaterialTextView)n2.e).setText(n0.e(d3, 1).concat("%"));
    double d1 = this.e[paramInt];
    double d2 = d1 + d3;
    if (d2 > 100.0D) {
      d1 = 100.0D - d3;
      d2 = 100.0D;
    } 
    ((RangeSlider2)n2.c).setValues(new Float[] { Float.valueOf((float)d1), Float.valueOf((float)d2) });
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    return new er0(LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493061, paramViewGroup, false), this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */