import java.util.Arrays;

public final class g40 {
  public final j40 a;
  
  public final byte[] b;
  
  public g40(j40 paramj40, byte[] paramArrayOfbyte) {
    if (paramj40 != null) {
      if (paramArrayOfbyte != null) {
        this.a = paramj40;
        this.b = paramArrayOfbyte;
        return;
      } 
      k91.h("bytes is null");
      throw null;
    } 
    k91.h("encoding is null");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g40))
      return false; 
    paramObject = paramObject;
    return !this.a.equals(((g40)paramObject).a) ? false : Arrays.equals(this.b, ((g40)paramObject).b);
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return Arrays.hashCode(this.b) ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("EncodedPayload{encoding=");
    stringBuilder.append(this.a);
    stringBuilder.append(", bytes=[...]}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */