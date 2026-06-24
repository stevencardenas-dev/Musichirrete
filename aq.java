import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class aq implements nk1 {
  public final AtomicReference a;
  
  public aq(nk1 paramnk1) {
    this.a = new AtomicReference<nk1>(paramnk1);
  }
  
  public final Iterator iterator() {
    nk1 nk11 = this.a.getAndSet(null);
    if (nk11 != null)
      return nk11.iterator(); 
    tp.f("This sequence can be consumed only once.");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */