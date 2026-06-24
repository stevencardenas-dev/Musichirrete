import java.lang.reflect.Method;

public final class o02 extends r02 {
  public final Method b;
  
  public final int c;
  
  public o02(int paramInt, Method paramMethod) {
    this.b = paramMethod;
    this.c = paramInt;
  }
  
  public final Object a(Class paramClass) {
    String str = g7.d(paramClass);
    if (str == null) {
      int i = this.c;
      return this.b.invoke(null, new Object[] { paramClass, Integer.valueOf(i) });
    } 
    throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(str));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */