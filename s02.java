import java.io.Serializable;

public final class s02 implements vl0, Serializable {
  public lc0 b;
  
  public Object c;
  
  public final Object getValue() {
    if (this.c == j30.g) {
      lc0 lc01 = this.b;
      lc01.getClass();
      this.c = lc01.a();
      this.b = null;
    } 
    return this.c;
  }
  
  public final String toString() {
    return (this.c != j30.g) ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */