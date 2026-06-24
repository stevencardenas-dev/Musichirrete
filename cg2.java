import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

public abstract class cg2 extends BasePendingResult {
  public a42 l;
  
  public final boolean m;
  
  public final nf1 n;
  
  public cg2(nf1 paramnf1, boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public abstract void i();
  
  public final ye2 j() {
    if (this.l == null)
      this.l = new a42(11, this); 
    return this.l;
  }
  
  public final void k() {
    if (!this.m) {
      nf1 nf11 = this.n;
      Iterator iterator = nf11.g.iterator();
      if (!iterator.hasNext()) {
        Iterator<zk> iterator1 = nf11.h.iterator();
        while (iterator1.hasNext())
          ((zk)iterator1.next()).getClass(); 
      } else {
        throw x41.g(iterator);
      } 
    } 
    try {
      synchronized (this.n.a) {
        i();
        return;
      } 
    } catch (pe2 pe2) {
      e(new kf2(this, new Status(2100, null, null, null)));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */