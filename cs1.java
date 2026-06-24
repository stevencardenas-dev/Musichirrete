import java.io.Serializable;

public final class cs1 implements vl0, Serializable {
  public lc0 b;
  
  public volatile Object c;
  
  public final Object e;
  
  public cs1(lc0 paramlc0) {
    this.b = paramlc0;
    this.c = j30.g;
    this.e = this;
  }
  
  public final Object getValue() {
    null = this.c;
    j30 j30 = j30.g;
    if (null != j30)
      return null; 
    synchronized (this.e) {
      null = this.c;
      if (null == j30) {
        null = this.b;
        null.getClass();
        null = null.a();
        this.c = null;
        this.b = null;
      } 
      return null;
    } 
  }
  
  public final String toString() {
    return (this.c != j30.g) ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */