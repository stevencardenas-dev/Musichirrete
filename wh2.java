import java.util.Iterator;
import java.util.Map;

public final class wh2 extends rh2 {
  public final transient zh2 e;
  
  public final transient Object[] f;
  
  public final transient int g;
  
  public wh2(zh2 paramzh2, Object[] paramArrayOfObject, int paramInt) {
    this.e = paramzh2;
    this.f = paramArrayOfObject;
    this.g = paramInt;
  }
  
  public final int c(Object[] paramArrayOfObject) {
    return f().c(paramArrayOfObject);
  }
  
  public final boolean contains(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      Map.Entry entry = (Map.Entry)paramObject;
      paramObject = entry.getKey();
      entry = (Map.Entry)entry.getValue();
      if (entry != null && entry.equals(this.e.get(paramObject)))
        return true; 
    } 
    return false;
  }
  
  public final ch2 i() {
    return new uh2(this);
  }
  
  public final int size() {
    return this.g;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */