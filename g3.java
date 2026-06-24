import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;

public final class g3 extends e4 implements qr {
  public final String c;
  
  public final int d;
  
  public final qp0 e;
  
  public g3(String paramString1, int paramInt1, String paramString2, int paramInt2) {
    this.a = paramString1;
    this.e = new qp0(paramInt1);
    this.c = paramString2;
    this.d = paramInt2;
    this.b = tlzLOCPTHRhep.xTVjlPtNyGt;
  }
  
  public final qp0 c() {
    return this.e;
  }
  
  public final byte[] e(p01 paramp01, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, n2 paramn2, j01 paramj01) {
    if (paramn2 != null && "dir".equals(paramn2.y("alg"))) {
      object = paramj01.c;
    } else {
      object = ((j01)object).e;
    } 
    if (paramn2 != null)
      "dir".equals(paramn2.y("alg")); 
    Object object = paramp01.c;
    byte[] arrayOfByte2 = (byte[])paramp01.e;
    byte[] arrayOfByte1 = (byte[])paramp01.f;
    long l = qz1.e(paramArrayOfbyte1.length);
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.putLong(l);
    byte[] arrayOfByte3 = qz1.i(new byte[][] { paramArrayOfbyte1, (byte[])object, arrayOfByte2, byteBuffer.array() });
    j3 j3 = new j3(1, qz1.Q(paramArrayOfbyte2, 0, paramArrayOfbyte2.length / 2));
    if (qz1.O(arrayOfByte1, qz1.Q(dd1.C(this.c, j3).doFinal(arrayOfByte3), 0, this.d))) {
      int i = paramArrayOfbyte2.length / 2;
      j3 j31 = new j3(0, qz1.Q(paramArrayOfbyte2, i, i));
      Cipher cipher = qz1.v(this.b);
      try {
        IvParameterSpec ivParameterSpec = new IvParameterSpec();
        this((byte[])object);
        cipher.init(2, j31, ivParameterSpec);
        try {
          return cipher.doFinal(arrayOfByte2);
        } catch (IllegalBlockSizeException|javax.crypto.BadPaddingException illegalBlockSizeException) {
          throw new Exception(illegalBlockSizeException.toString(), illegalBlockSizeException);
        } 
      } catch (InvalidKeyException invalidKeyException) {
      
      } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
        throw new Exception(invalidAlgorithmParameterException.toString(), invalidAlgorithmParameterException);
      } 
      throw new Exception(this.b, invalidAlgorithmParameterException);
    } 
    throw new Exception("");
  }
  
  public final boolean g() {
    int i = this.e.b / 2;
    String str = this.b;
    int j = qz1.e(i);
    try {
      i = Cipher.getMaxAllowedKeyLength(str);
      if (j <= i)
        return true; 
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */