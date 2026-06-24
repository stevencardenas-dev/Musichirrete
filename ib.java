import android.util.Base64;
import java.util.Arrays;

public final class ib {
  public final String a;
  
  public final byte[] b;
  
  public final fa1 c;
  
  public ib(String paramString, byte[] paramArrayOfbyte, fa1 paramfa1) {
    this.a = paramString;
    this.b = paramArrayOfbyte;
    this.c = paramfa1;
  }
  
  public static zv0 a() {
    zv0 zv0 = new zv0(2);
    zv0.f = fa1.b;
    return zv0;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ib) {
      paramObject = paramObject;
      if (this.a.equals(((ib)paramObject).a) && Arrays.equals(this.b, ((ib)paramObject).b) && this.c.equals(((ib)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    int j = Arrays.hashCode(this.b);
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public final String toString() {
    String str;
    byte[] arrayOfByte = this.b;
    if (arrayOfByte == null) {
      str = "";
    } else {
      str = Base64.encodeToString((byte[])str, 2);
    } 
    StringBuilder stringBuilder = new StringBuilder("TransportContext(");
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    return x41.n(stringBuilder, str, ")");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */