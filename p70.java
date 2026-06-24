import java.util.HashMap;

public final class p70 extends ji1 {
  public final HashMap g = new HashMap<Object, Object>();
  
  public final gi1 c(Object paramObject) {
    return (gi1)this.g.get(paramObject);
  }
  
  public final Object d(Object paramObject) {
    Object object = super.d(paramObject);
    this.g.remove(paramObject);
    return object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */