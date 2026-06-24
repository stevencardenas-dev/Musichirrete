import java.util.Iterator;

public final class tm2 extends km2 {
  public final transient zh2 h;
  
  public final transient vm2 i;
  
  public tm2(zh2 paramzh2, vm2 paramvm2) {
    super(1);
    this.h = paramzh2;
    this.i = paramvm2;
  }
  
  public final boolean contains(Object paramObject) {
    return (this.h.get(paramObject) != null);
  }
  
  public final int f(Object[] paramArrayOfObject) {
    return this.i.f(paramArrayOfObject);
  }
  
  public final int size() {
    return this.h.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */