import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

public final class xo {
  public int a;
  
  public MessageDigest b;
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    MessageDigest messageDigest = this.b;
    long l = (int)Math.ceil((paramInt / this.a));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (byte b = 1; b <= l; b++) {
      messageDigest.update(qz1.u(b));
      messageDigest.update(paramArrayOfbyte1);
      messageDigest.update(paramArrayOfbyte2);
      byte[] arrayOfByte = messageDigest.digest();
      byteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    } 
    paramInt /= 8;
    paramArrayOfbyte2 = byteArrayOutputStream.toByteArray();
    paramArrayOfbyte1 = paramArrayOfbyte2;
    if (paramArrayOfbyte2.length != paramInt)
      paramArrayOfbyte1 = qz1.Q(paramArrayOfbyte2, 0, paramInt); 
    return paramArrayOfbyte1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */