import javax.crypto.spec.SecretKeySpec;

public final class j3 extends SecretKeySpec {
  public final int b;
  
  public j3(int paramInt, byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte, "HMAC");
  }
  
  public String toString() {
    switch (this.b) {
      default:
        return super.toString();
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(qz1.e((getEncoded()).length));
    stringBuilder.append(" bit AES key");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */