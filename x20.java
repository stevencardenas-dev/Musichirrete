import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

public final class x20 extends od {
  public final String d;
  
  public final int e;
  
  public x20(String paramString1, int paramInt, String paramString2, String paramString3) {
    super(paramString1, paramString2);
    this.d = paramString3;
    this.e = paramInt;
  }
  
  public static byte[] l(byte[] paramArrayOfbyte) {
    int k;
    int m = paramArrayOfbyte.length / 2;
    int i = m;
    while (true) {
      boolean bool = true;
      if (i > 1 && paramArrayOfbyte[m - i] == 0) {
        i--;
        continue;
      } 
      break;
    } 
    int n = m - i;
    if (paramArrayOfbyte[n] < 0) {
      k = i + 1;
    } else {
      k = i;
    } 
    int j;
    for (j = m; j > 1 && paramArrayOfbyte[m * 2 - j] == 0; j--);
    int i1 = m * 2 - j;
    if (paramArrayOfbyte[i1] < 0) {
      m = j + 1;
    } else {
      m = j;
    } 
    int i2 = k + 4 + m;
    if (i2 <= 255) {
      byte b;
      byte[] arrayOfByte;
      if (i2 < 128) {
        arrayOfByte = new byte[k + 6 + m];
      } else {
        arrayOfByte = new byte[k + 7 + m];
        arrayOfByte[1] = -127;
        b = 2;
      } 
      arrayOfByte[0] = 48;
      arrayOfByte[b] = (byte)i2;
      arrayOfByte[b + 1] = 2;
      arrayOfByte[b + 2] = (byte)k;
      k = b + 3 + k;
      System.arraycopy(paramArrayOfbyte, n, arrayOfByte, k - i, i);
      arrayOfByte[k] = 2;
      arrayOfByte[k + 1] = (byte)m;
      System.arraycopy(paramArrayOfbyte, i1, arrayOfByte, k + 2 + m - j, j);
      return arrayOfByte;
    } 
    throw new IOException();
  }
  
  public final boolean i(byte[] paramArrayOfbyte1, Key paramKey, byte[] paramArrayOfbyte2, j01 paramj01) {
    if (paramArrayOfbyte1.length <= this.e) {
      BigInteger bigInteger3 = new BigInteger(1, qz1.Q(paramArrayOfbyte1, 0, paramArrayOfbyte1.length / 2));
      int i = paramArrayOfbyte1.length / 2;
      BigInteger bigInteger1 = new BigInteger(1, qz1.Q(paramArrayOfbyte1, i, i));
      String str = this.d;
      BigInteger bigInteger2 = ((ECParameterSpec)q30.a.get(str)).getOrder();
      bigInteger3 = bigInteger3.mod(bigInteger2);
      BigInteger bigInteger4 = BigInteger.ZERO;
      if (!bigInteger3.equals(bigInteger4) && !bigInteger1.mod(bigInteger2).equals(bigInteger4))
        try {
          paramArrayOfbyte1 = l(paramArrayOfbyte1);
          return super.i(paramArrayOfbyte1, paramKey, paramArrayOfbyte2, paramj01);
        } catch (IOException iOException) {
          throw new Exception("", iOException);
        }  
    } 
    return false;
  }
  
  public final void k(PublicKey paramPublicKey) {
    if (paramPublicKey instanceof ECKey) {
      EllipticCurve ellipticCurve = ((ECKey)paramPublicKey).getParams().getCurve();
      String str = (String)q30.b.get(ellipticCurve);
      if (!this.d.equals(str))
        m60.f(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */