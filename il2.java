import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class il2 {
  public static final Charset a = Charset.forName("UTF-8");
  
  public static final byte[] b;
  
  static {
    Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = new byte[0];
    b = arrayOfByte;
    ByteBuffer.wrap(arrayOfByte);
  }
  
  public static int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = paramInt2;
    int j = paramInt1;
    for (paramInt1 = i; paramInt1 < paramInt2 + paramInt3; paramInt1++)
      j = j * 31 + paramArrayOfbyte[paramInt1]; 
    return j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\il2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */