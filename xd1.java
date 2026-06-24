import android.util.SparseArray;
import java.util.Set;

public final class xd1 {
  public SparseArray a;
  
  public int b;
  
  public Set c;
  
  public final wd1 a(int paramInt) {
    SparseArray sparseArray = this.a;
    wd1 wd12 = (wd1)sparseArray.get(paramInt);
    wd1 wd11 = wd12;
    if (wd12 == null) {
      wd11 = new wd1();
      sparseArray.put(paramInt, wd11);
    } 
    return wd11;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */