import java.util.Objects;

public final class om2 extends im2 {
  public static final om2 i = new om2(0, new Object[0]);
  
  public final transient Object[] g;
  
  public final transient int h;
  
  public om2(int paramInt, Object[] paramArrayOfObject) {
    super(1);
    this.g = paramArrayOfObject;
    this.h = paramInt;
  }
  
  public final Object[] c() {
    return this.g;
  }
  
  public final int d() {
    return 0;
  }
  
  public final int e() {
    return this.h;
  }
  
  public final int f(Object[] paramArrayOfObject) {
    Object[] arrayOfObject = this.g;
    int i = this.h;
    System.arraycopy(arrayOfObject, 0, paramArrayOfObject, 0, i);
    return i;
  }
  
  public final Object get(int paramInt) {
    wf2.y0(paramInt, this.h);
    Object object = this.g[paramInt];
    Objects.requireNonNull(object);
    return object;
  }
  
  public final int size() {
    return this.h;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\om2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */