import java.util.Iterator;

public class ji0 implements Iterable, fl0 {
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public ji0(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 != 0) {
      if (paramInt3 != Integer.MIN_VALUE) {
        this.b = paramInt1;
        if (paramInt3 > 0) {
          if (paramInt1 < paramInt2) {
            int i = paramInt2 % paramInt3;
            if (i < 0)
              i += paramInt3; 
            paramInt1 %= paramInt3;
            if (paramInt1 < 0)
              paramInt1 += paramInt3; 
            paramInt1 = (i - paramInt1) % paramInt3;
            if (paramInt1 < 0)
              paramInt1 += paramInt3; 
            paramInt2 -= paramInt1;
          } 
        } else if (paramInt3 < 0) {
          if (paramInt1 > paramInt2) {
            int j = -paramInt3;
            paramInt1 %= j;
            if (paramInt1 < 0)
              paramInt1 += j; 
            int i = paramInt2 % j;
            if (i < 0)
              i += j; 
            paramInt1 = (paramInt1 - i) % j;
            if (paramInt1 < 0)
              paramInt1 += j; 
            paramInt2 += paramInt1;
          } 
        } else {
          l0.l("Step is zero.");
          throw null;
        } 
        this.c = paramInt2;
        this.e = paramInt3;
        return;
      } 
      l0.l("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
      throw null;
    } 
    l0.l("Step must be non-zero.");
    throw null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof ji0)
      if (!isEmpty() || !((ji0)paramObject).isEmpty()) {
        paramObject = paramObject;
        int i = ((ji0)paramObject).b;
        if (this.b == i && this.c == ((ji0)paramObject).c && this.e == ((ji0)paramObject).e)
          return true; 
      } else {
        return true;
      }  
    return false;
  }
  
  public int hashCode() {
    return isEmpty() ? -1 : ((this.b * 31 + this.c) * 31 + this.e);
  }
  
  public boolean isEmpty() {
    int i = this.c;
    int k = this.e;
    int j = this.b;
    return (k > 0) ? ((j > i)) : ((j < i));
  }
  
  public final Iterator iterator() {
    int j = this.c;
    int i = this.e;
    return new ki0(this.b, j, i);
  }
  
  public String toString() {
    int i = this.c;
    int k = this.e;
    int j = this.b;
    StringBuilder stringBuilder = new StringBuilder();
    if (k > 0) {
      this();
      stringBuilder.append(j);
      stringBuilder.append("..");
      stringBuilder.append(i);
      stringBuilder.append(" step ");
      stringBuilder.append(k);
      return stringBuilder.toString();
    } 
    this();
    stringBuilder.append(j);
    stringBuilder.append(" downTo ");
    stringBuilder.append(i);
    stringBuilder.append(" step ");
    stringBuilder.append(-k);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ji0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */