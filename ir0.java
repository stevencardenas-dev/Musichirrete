import java.util.ConcurrentModificationException;
import java.util.Map;

public final class ir0 implements Map.Entry, fl0 {
  public final kr0 b;
  
  public final int c;
  
  public final int e;
  
  public ir0(kr0 paramkr0, int paramInt) {
    this.b = paramkr0;
    this.c = paramInt;
    this.e = paramkr0.j;
  }
  
  public final void a() {
    if (this.b.j == this.e)
      return; 
    throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      paramObject = paramObject;
      if (ui0.c(paramObject.getKey(), getKey()) && ui0.c(paramObject.getValue(), getValue()))
        return true; 
    } 
    return false;
  }
  
  public final Object getKey() {
    a();
    return this.b.b[this.c];
  }
  
  public final Object getValue() {
    a();
    Object[] arrayOfObject = this.b.c;
    arrayOfObject.getClass();
    return arrayOfObject[this.c];
  }
  
  public final int hashCode() {
    int i;
    Object object = getKey();
    int j = 0;
    if (object != null) {
      i = object.hashCode();
    } else {
      i = 0;
    } 
    object = getValue();
    if (object != null)
      j = object.hashCode(); 
    return i ^ j;
  }
  
  public final Object setValue(Object paramObject) {
    a();
    kr0 kr01 = this.b;
    kr01.c();
    Object[] arrayOfObject = kr01.c;
    if (arrayOfObject == null) {
      int j = kr01.b.length;
      if (j >= 0) {
        arrayOfObject = new Object[j];
        kr01.c = arrayOfObject;
        j = this.c;
        Object object1 = arrayOfObject[j];
        arrayOfObject[j] = paramObject;
        return object1;
      } 
      l0.l("capacity must be non-negative.");
      return null;
    } 
    int i = this.c;
    Object object = arrayOfObject[i];
    arrayOfObject[i] = paramObject;
    return object;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getKey());
    stringBuilder.append('=');
    stringBuilder.append(getValue());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ir0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */