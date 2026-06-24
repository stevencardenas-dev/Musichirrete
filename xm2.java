import java.util.Iterator;

public final class xm2 extends km2 {
  public static final Object[] m;
  
  public static final xm2 n;
  
  public final transient Object[] h;
  
  public final transient int i;
  
  public final transient Object[] j;
  
  public final transient int k;
  
  public final transient int l;
  
  static {
    Object[] arrayOfObject = new Object[0];
    m = arrayOfObject;
    n = new xm2(0, 0, 0, arrayOfObject, arrayOfObject);
  }
  
  public xm2(int paramInt1, int paramInt2, int paramInt3, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    super(1);
    this.h = paramArrayOfObject1;
    this.i = paramInt1;
    this.j = paramArrayOfObject2;
    this.k = paramInt2;
    this.l = paramInt3;
  }
  
  public final Object[] c() {
    return this.h;
  }
  
  public final boolean contains(Object paramObject) {
    if (paramObject != null) {
      Object[] arrayOfObject = this.j;
      if (arrayOfObject.length != 0)
        for (int i = fv2.a(paramObject.hashCode());; i++) {
          i &= this.k;
          Object object = arrayOfObject[i];
          if (object == null)
            return false; 
          if (object.equals(paramObject))
            return true; 
        }  
    } 
    return false;
  }
  
  public final int d() {
    return 0;
  }
  
  public final int e() {
    return this.l;
  }
  
  public final int f(Object[] paramArrayOfObject) {
    Object[] arrayOfObject = this.h;
    int i = this.l;
    System.arraycopy(arrayOfObject, 0, paramArrayOfObject, 0, i);
    return i;
  }
  
  public final int hashCode() {
    return this.i;
  }
  
  public final Iterator iterator() {
    im2 im22 = this.f;
    im2 im21 = im22;
    if (im22 == null) {
      Object[] arrayOfObject = this.h;
      im21 = im2.h(this.l, arrayOfObject);
      this.f = im21;
    } 
    return im21.i(0);
  }
  
  public final int size() {
    return this.l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */