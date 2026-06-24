import java.util.Arrays;

public final class yn2 extends fn2 {
  public final byte[] g;
  
  public yn2(byte[] paramArrayOfbyte) {
    super(Arrays.copyOfRange(paramArrayOfbyte, 0, 25));
    this.g = paramArrayOfbyte;
  }
  
  public final byte[] p0() {
    return this.g;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */