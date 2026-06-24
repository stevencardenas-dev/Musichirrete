import java.util.Date;
import java.util.HashMap;

public final class mk0 implements i40 {
  public static final jk0 g = new jk0(0);
  
  public static final kk0 h = new kk0(0);
  
  public static final kk0 i = new kk0(1);
  
  public static final lk0 j = (lk0)new Object();
  
  public final HashMap b;
  
  public final HashMap c;
  
  public final jk0 e;
  
  public boolean f;
  
  public mk0() {
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    this.b = hashMap1;
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    this.c = hashMap2;
    this.e = g;
    this.f = false;
    hashMap2.put(String.class, h);
    hashMap1.remove(String.class);
    hashMap2.put(Boolean.class, i);
    hashMap1.remove(Boolean.class);
    hashMap2.put(Date.class, j);
    hashMap1.remove(Date.class);
  }
  
  public final i40 a(Class<?> paramClass, f31 paramf31) {
    this.b.put(paramClass, paramf31);
    this.c.remove(paramClass);
    return this;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */