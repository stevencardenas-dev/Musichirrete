import java.io.IOException;

public abstract class nk0 {
  public boolean c() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public float d() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public int e() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public final ik0 f() {
    if (this instanceof ik0)
      return (ik0)this; 
    m60.o("Not a JSON Array: ", this);
    return null;
  }
  
  public final rk0 g() {
    if (this instanceof rk0)
      return (rk0)this; 
    m60.o("Not a JSON Object: ", this);
    return null;
  }
  
  public long h() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public String i() {
    throw new UnsupportedOperationException(getClass().getSimpleName());
  }
  
  public final String toString() {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      cl0 cl0 = new cl0();
      pp0 pp0 = new pp0();
      this(stringBuilder);
      this(pp0);
      cl0.j = 1;
      ok0.a.getClass();
      ok0.f(this, cl0);
      return stringBuilder.toString();
    } catch (IOException iOException) {
      throw new AssertionError(iOException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */