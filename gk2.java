import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class gk2 implements Iterable, Serializable {
  public static final hk2 c = new hk2(il2.b);
  
  public int b = 0;
  
  static {
    int i = ak2.a;
  }
  
  public static int j(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0) {
      if (paramInt1 >= 0) {
        if (paramInt2 < paramInt1) {
          m60.m(ga1.j("Beginning index larger than ending index: ", paramInt1, paramInt2, ", "));
          return 0;
        } 
        m60.m(ga1.j("End index: ", paramInt2, paramInt3, " >= "));
        return 0;
      } 
      m60.m(x41.i(paramInt1, "Beginning index: ", " < 0"));
      return 0;
    } 
    return i;
  }
  
  public static hk2 k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      j(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
      byte[] arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
      return new hk2(arrayOfByte);
    } catch (ll2 ll2) {
      throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", ll2);
    } 
  }
  
  public abstract byte c(int paramInt);
  
  public abstract byte d(int paramInt);
  
  public abstract int e(int paramInt1, int paramInt2);
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (!(paramObject instanceof gk2))
        return false; 
      paramObject = paramObject;
      int i = f();
      if (i != paramObject.f())
        return false; 
      if (i != 0) {
        i = this.b;
        int j = ((gk2)paramObject).b;
        return (i == 0 || j == 0 || i == j) ? i((gk2)paramObject) : false;
      } 
    } 
    return true;
  }
  
  public abstract int f();
  
  public abstract gk2 g(int paramInt1, int paramInt2);
  
  public abstract void h(ik2 paramik2);
  
  public final int hashCode() {
    int j = this.b;
    int i = j;
    if (j == 0) {
      i = f();
      j = e(i, i);
      i = j;
      if (j == 0)
        i = 1; 
      this.b = i;
    } 
    return i;
  }
  
  public abstract boolean i(gk2 paramgk2);
  
  public final String toString() {
    String str1;
    Locale locale = Locale.ROOT;
    String str2 = Integer.toHexString(System.identityHashCode(this));
    int i = f();
    if (f() <= 50) {
      str1 = n21.X(this);
    } else {
      str1 = n21.X(g(0, 47)).concat("...");
    } 
    StringBuilder stringBuilder = new StringBuilder("<ByteString@");
    stringBuilder.append(str2);
    stringBuilder.append(" size=");
    stringBuilder.append(i);
    stringBuilder.append(" contents=\"");
    return x41.n(stringBuilder, str1, "\">");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */