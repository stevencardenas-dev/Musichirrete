import java.util.ArrayList;
import java.util.Iterator;

public final class ik0 extends nk0 implements Iterable {
  public final ArrayList b = new ArrayList();
  
  public ik0() {}
  
  public ik0(int paramInt) {}
  
  public final boolean c() {
    return n().c();
  }
  
  public final float d() {
    return n().d();
  }
  
  public final int e() {
    return n().e();
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == this || (paramObject instanceof ik0 && ((ik0)paramObject).b.equals(this.b)));
  }
  
  public final long h() {
    return n().h();
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final String i() {
    return n().i();
  }
  
  public final Iterator iterator() {
    return this.b.iterator();
  }
  
  public final void j(nk0 paramnk0) {
    this.b.add(paramnk0);
  }
  
  public final void k(Number paramNumber) {
    qk0 qk0;
    sk0 sk0;
    if (paramNumber == null) {
      qk0 = qk0.b;
    } else {
      sk0 = new sk0((Number)qk0);
    } 
    this.b.add(sk0);
  }
  
  public final void l(String paramString) {
    qk0 qk0;
    sk0 sk0;
    if (paramString == null) {
      qk0 = qk0.b;
    } else {
      sk0 = new sk0((String)qk0);
    } 
    this.b.add(sk0);
  }
  
  public final nk0 m(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public final nk0 n() {
    ArrayList<nk0> arrayList = this.b;
    int i = arrayList.size();
    if (i == 1)
      return arrayList.get(0); 
    tp.f(ga1.i("Array must have size 1, but has size ", i));
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ik0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */