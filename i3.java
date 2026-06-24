import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class i3 extends e4 implements il0 {
  public final ym1 c;
  
  public final int d;
  
  public i3(String paramString, int paramInt) {
    this.a = paramString;
    this.b = ym1.b;
    this.c = new ym1(this.b);
    this.d = paramInt;
  }
  
  public final void a(Key paramKey, qr paramqr) {
    qv.j0(paramKey, this.d);
  }
  
  public final p01 d(Key paramKey, n2 paramn2, j01 paramj01) {
    byte[] arrayOfByte = (new zb(-1)).b(paramn2.y("iv"));
    Object object = paramj01.c;
    return new p01(this.c.b(paramKey, arrayOfByte), null, null, 6);
  }
  
  public final boolean g() {
    this.c.getClass();
    return true;
  }
  
  public final Key h(p01 paramp01, byte[] paramArrayOfbyte, qp0 paramqp0, n2 paramn2, j01 paramj01) {
    byte[] arrayOfByte2 = (new zb(-1)).b(paramn2.y("tag"));
    Cipher cipher = (Cipher)paramp01.c;
    this.c.getClass();
    byte[] arrayOfByte1 = ym1.a(paramArrayOfbyte, arrayOfByte2, null, cipher);
    paramqp0.getClass();
    return new SecretKeySpec(arrayOfByte1, "AES");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */