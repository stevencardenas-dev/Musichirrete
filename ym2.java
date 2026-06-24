import com.google.android.material.tabs.xm.VDgS;
import java.util.Iterator;

public final class ym2 extends km2 {
  public final transient Object h;
  
  public ym2(Object paramObject) {
    super(1);
    this.h = paramObject;
  }
  
  public final boolean contains(Object paramObject) {
    return this.h.equals(paramObject);
  }
  
  public final int f(Object[] paramArrayOfObject) {
    paramArrayOfObject[0] = this.h;
    return 1;
  }
  
  public final int hashCode() {
    return this.h.hashCode();
  }
  
  public final int size() {
    return 1;
  }
  
  public final String toString() {
    String str = this.h.toString();
    return x41.o(new StringBuilder(String.valueOf(str).length() + 2), VDgS.LYCAuFHDJ, str, "]");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ym2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */