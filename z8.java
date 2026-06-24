import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class z8 implements Iterator, Map.Entry {
  public int b;
  
  public int c;
  
  public boolean e;
  
  public final b9 f;
  
  public z8(b9 paramb9) {
    this.f = paramb9;
    this.b = paramb9.e - 1;
    this.c = -1;
  }
  
  public final boolean equals(Object paramObject) {
    if (this.e) {
      if (paramObject instanceof Map.Entry) {
        Map.Entry entry = (Map.Entry)paramObject;
        paramObject = entry.getKey();
        int i = this.c;
        b9 b91 = this.f;
        if (ui0.c(paramObject, b91.f(i)) && ui0.c(entry.getValue(), b91.i(this.c)))
          return true; 
      } 
      return false;
    } 
    tp.f("This container does not support retaining Map.Entry objects");
    return false;
  }
  
  public final Object getKey() {
    if (this.e)
      return this.f.f(this.c); 
    tp.f("This container does not support retaining Map.Entry objects");
    return null;
  }
  
  public final Object getValue() {
    if (this.e)
      return this.f.i(this.c); 
    tp.f(xveccWbRzqx.pjEniLGfgyTihu);
    return null;
  }
  
  public final boolean hasNext() {
    return (this.c < this.b);
  }
  
  public final int hashCode() {
    boolean bool = this.e;
    int i = 0;
    if (bool) {
      int j = this.c;
      b9 b91 = this.f;
      Object object1 = b91.f(j);
      Object object2 = b91.i(this.c);
      if (object1 == null) {
        j = 0;
      } else {
        j = object1.hashCode();
      } 
      if (object2 != null)
        i = object2.hashCode(); 
      return j ^ i;
    } 
    tp.f("This container does not support retaining Map.Entry objects");
    return 0;
  }
  
  public final Object next() {
    if (hasNext()) {
      this.c++;
      this.e = true;
      return this;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    if (this.e) {
      this.f.g(this.c);
      this.c--;
      this.b--;
      this.e = false;
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final Object setValue(Object paramObject) {
    if (this.e)
      return this.f.h(this.c, paramObject); 
    tp.f("This container does not support retaining Map.Entry objects");
    return null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getKey());
    stringBuilder.append("=");
    stringBuilder.append(getValue());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */