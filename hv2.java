import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class hv2 implements Iterable, Serializable {
  public static final iv2 c = new iv2(vv2.b);
  
  public int b = 0;
  
  static {
    int i = ev2.a;
  }
  
  public static int j(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0) {
      if (paramInt1 >= 0) {
        if (paramInt2 < paramInt1) {
          StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(paramInt1).length() + 44 + String.valueOf(paramInt2).length());
          stringBuilder2.append("Beginning index larger than ending index: ");
          stringBuilder2.append(paramInt1);
          stringBuilder2.append(", ");
          stringBuilder2.append(paramInt2);
          throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(paramInt2).length() + 15 + String.valueOf(paramInt3).length());
        stringBuilder1.append("End index: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" >= ");
        stringBuilder1.append(paramInt3);
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramInt1).length() + 21);
      stringBuilder.append("Beginning index: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    } 
    return i;
  }
  
  public abstract byte c(int paramInt);
  
  public abstract byte d(int paramInt);
  
  public abstract int e();
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (!(paramObject instanceof hv2))
        return false; 
      paramObject = paramObject;
      int i = e();
      if (i != paramObject.e())
        return false; 
      if (i != 0) {
        int j = this.b;
        i = ((hv2)paramObject).b;
        return (j == 0 || i == 0 || j == i) ? h((hv2)paramObject) : false;
      } 
    } 
    return true;
  }
  
  public abstract hv2 f(int paramInt1, int paramInt2);
  
  public abstract void g(jv2 paramjv2);
  
  public abstract boolean h(hv2 paramhv2);
  
  public final int hashCode() {
    int j = this.b;
    int i = j;
    if (j == 0) {
      i = e();
      j = i(i, i);
      i = j;
      if (j == 0)
        i = 1; 
      this.b = i;
    } 
    return i;
  }
  
  public abstract int i(int paramInt1, int paramInt2);
  
  public final String toString() {
    String str1;
    Locale locale = Locale.ROOT;
    String str2 = Integer.toHexString(System.identityHashCode(this));
    int i = e();
    if (e() <= 50) {
      str1 = qz1.W(this);
    } else {
      str1 = qz1.W(f(0, 47)).concat("...");
    } 
    StringBuilder stringBuilder = new StringBuilder("<ByteString@");
    stringBuilder.append(str2);
    stringBuilder.append(" size=");
    stringBuilder.append(i);
    stringBuilder.append(" contents=\"");
    return x41.n(stringBuilder, str1, "\">");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */