import java.security.Key;

public final class uz extends e4 implements il0 {
  public final void a(Key paramKey, qr paramqr) {
    if (paramKey != null) {
      if (paramKey.getEncoded() != null) {
        int i = (paramKey.getEncoded()).length;
        if ((paramqr.c()).b != i)
          m60.f(); 
      } 
      return;
    } 
    m60.f();
  }
  
  public final p01 d(Key paramKey, n2 paramn2, j01 paramj01) {
    return new p01(null, paramKey, null, 6);
  }
  
  public final boolean g() {
    return true;
  }
  
  public final Key h(p01 paramp01, byte[] paramArrayOfbyte, qp0 paramqp0, n2 paramn2, j01 paramj01) {
    Key key = (Key)paramp01.e;
    if (paramArrayOfbyte.length == 0)
      return key; 
    m60.f();
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */