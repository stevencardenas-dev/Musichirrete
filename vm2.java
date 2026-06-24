import java.util.Objects;

public final class vm2 extends im2 {
  public final transient Object[] g;
  
  public final transient int h;
  
  public final transient int i;
  
  public vm2(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    super(1);
    this.g = paramArrayOfObject;
    this.h = paramInt1;
    this.i = paramInt2;
  }
  
  public final Object get(int paramInt) {
    wf2.y0(paramInt, this.i);
    int i = this.h;
    Object object = this.g[paramInt + paramInt + i];
    Objects.requireNonNull(object);
    return object;
  }
  
  public final int size() {
    return this.i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */