import java.util.ArrayList;
import java.util.Collection;

public final class fv0 extends hv0 {
  public final ArrayList x = new ArrayList();
  
  public final b9 y = (b9)new zm1(0);
  
  public fv0(gv0 paramgv0, String paramString1, String paramString2) {
    super(paramgv0, paramString1, paramString2, false);
  }
  
  public final void n(Collection paramCollection) {
    this.w.clear();
    ArrayList<hv0> arrayList = this.x;
    arrayList.clear();
    b9 b91 = this.y;
    b91.clear();
    for (vu0 vu0 : paramCollection) {
      String str = vu0.a.d();
      hv0 hv01 = this.a.a(str);
      if (hv01 == null)
        continue; 
      arrayList.add(hv01);
      b91.put(hv01.c, vu0);
      int i = vu0.b;
      if (i == 2 || i == 3)
        this.w.add(hv01); 
    } 
    (iv0.c()).a.b(259, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */