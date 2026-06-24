import java.util.Iterator;
import java.util.Map;

public final class rm2 extends km2 {
  public final transient zh2 h;
  
  public final transient Object[] i;
  
  public final transient int j;
  
  public rm2(zh2 paramzh2, Object[] paramArrayOfObject, int paramInt) {
    super(1);
    this.h = paramzh2;
    this.i = paramArrayOfObject;
    this.j = paramInt;
  }
  
  public final boolean contains(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      Map.Entry entry = (Map.Entry)paramObject;
      paramObject = entry.getKey();
      entry = (Map.Entry)entry.getValue();
      if (entry != null && entry.equals(this.h.get(paramObject)))
        return true; 
    } 
    return false;
  }
  
  public final int f(Object[] paramArrayOfObject) {
    im2 im22 = this.f;
    im2 im21 = im22;
    if (im22 == null) {
      im21 = i();
      this.f = im21;
    } 
    return im21.f(paramArrayOfObject);
  }
  
  public final im2 i() {
    return new pm2(this);
  }
  
  public final Iterator iterator() {
    im2 im22 = this.f;
    im2 im21 = im22;
    if (im22 == null) {
      im21 = i();
      this.f = im21;
    } 
    return im21.i(0);
  }
  
  public final int size() {
    return this.j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */