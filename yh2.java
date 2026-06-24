import java.util.Objects;

public final class yh2 extends ch2 {
  public final transient Object[] e;
  
  public final transient int f;
  
  public final transient int g;
  
  public yh2(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    this.e = paramArrayOfObject;
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public final boolean g() {
    return true;
  }
  
  public final Object get(int paramInt) {
    ui0.u0(paramInt, this.g);
    int i = this.f;
    Object object = this.e[paramInt + paramInt + i];
    Objects.requireNonNull(object);
    return object;
  }
  
  public final int size() {
    return this.g;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */