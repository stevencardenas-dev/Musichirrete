import java.io.OutputStream;

public final class gm0 extends OutputStream {
  public long b;
  
  public final void write(int paramInt) {
    this.b++;
  }
  
  public final void write(byte[] paramArrayOfbyte) {
    this.b += paramArrayOfbyte.length;
  }
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 <= paramArrayOfbyte.length && paramInt2 >= 0) {
      paramInt1 += paramInt2;
      if (paramInt1 <= paramArrayOfbyte.length && paramInt1 >= 0) {
        this.b += paramInt2;
        return;
      } 
    } 
    throw new IndexOutOfBoundsException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */