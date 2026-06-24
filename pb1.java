import android.os.Handler;
import java.util.ArrayList;

public final class pb1 extends i61 {
  public final String c;
  
  public final ub1 e;
  
  public pb1(ub1 paramub1, String paramString) {}
  
  public final void run() {
    ArrayList<xj1> arrayList = new ArrayList();
    String str = this.c;
    int i = str.length();
    ub1 ub11 = this.e;
    if (i > 0) {
      String[] arrayOfString = ag0.N(str);
      ArrayList<Object> arrayList1 = ub11.C0;
      int j = arrayList1.size();
      i = 0;
      while (i < j) {
        xj1 xj1 = (xj1)arrayList1.get(i);
        int k = i + 1;
        xj1 = xj1;
        i = k;
        if (xj1.a(arrayOfString)) {
          arrayList.add(xj1);
          i = k;
        } 
      } 
    } 
    new rb1(arrayList);
    j61 j61 = ub11.J0;
    if (j61 != null) {
      i61 i611 = j61.b;
      if (i611 != null && i611.b)
        return; 
    } 
    Handler handler = ub11.L0;
    if (handler != null)
      handler.post(new e6(17, ub11, arrayList)); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */