import java.util.Objects;

public final class th2 extends ch2 {
  public static final th2 g = new th2(0, new Object[0]);
  
  public final transient Object[] e;
  
  public final transient int f;
  
  public th2(int paramInt, Object[] paramArrayOfObject) {
    this.e = paramArrayOfObject;
    this.f = paramInt;
  }
  
  public final int c(Object[] paramArrayOfObject) {
    Object[] arrayOfObject = this.e;
    int i = this.f;
    System.arraycopy(arrayOfObject, 0, paramArrayOfObject, 0, i);
    return i;
  }
  
  public final int d() {
    return this.f;
  }
  
  public final int e() {
    return 0;
  }
  
  public final boolean g() {
    return false;
  }
  
  public final Object get(int paramInt) {
    ui0.u0(paramInt, this.f);
    Object object = this.e[paramInt];
    Objects.requireNonNull(object);
    return object;
  }
  
  public final Object[] h() {
    return this.e;
  }
  
  public final int size() {
    return this.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\th2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */