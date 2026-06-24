import java.util.Map;

public final class pn0 implements Map.Entry {
  public pn0 b;
  
  public pn0 c;
  
  public pn0 e;
  
  public pn0 f;
  
  public pn0 g;
  
  public final Object h;
  
  public final boolean i;
  
  public Object j;
  
  public int k;
  
  public pn0(boolean paramBoolean) {
    this.h = null;
    this.i = paramBoolean;
    this.g = this;
    this.f = this;
  }
  
  public pn0(boolean paramBoolean, pn0 parampn01, Object paramObject, pn0 parampn02, pn0 parampn03) {
    this.b = parampn01;
    this.h = paramObject;
    this.i = paramBoolean;
    this.k = 1;
    this.f = parampn02;
    this.g = parampn03;
    parampn03.f = this;
    parampn02.g = this;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      paramObject = paramObject;
      Object object = this.h;
      if ((object == null) ? (paramObject.getKey() == null) : object.equals(paramObject.getKey())) {
        object = this.j;
        if ((object == null) ? (paramObject.getValue() == null) : object.equals(paramObject.getValue()))
          return true; 
      } 
    } 
    return false;
  }
  
  public final Object getKey() {
    return this.h;
  }
  
  public final Object getValue() {
    return this.j;
  }
  
  public final int hashCode() {
    int i;
    int j = 0;
    Object object = this.h;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.j;
    if (object != null)
      j = object.hashCode(); 
    return i ^ j;
  }
  
  public final Object setValue(Object paramObject) {
    if (paramObject != null || this.i) {
      Object object = this.j;
      this.j = paramObject;
      return object;
    } 
    k91.h("value == null");
    return null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.h);
    stringBuilder.append("=");
    stringBuilder.append(this.j);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */