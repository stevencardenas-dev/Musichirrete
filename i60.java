import java.io.BufferedInputStream;

public final class i60 extends e60 {
  public i60(BufferedInputStream paramBufferedInputStream) {
    super(paramBufferedInputStream);
    if (paramBufferedInputStream.markSupported()) {
      this.b.mark(2147483647);
      return;
    } 
    l0.l("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    throw null;
  }
  
  public i60(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    this.b.mark(2147483647);
  }
  
  public final void c(long paramLong) {
    int i = this.c;
    if (i > paramLong) {
      this.c = 0;
      this.b.reset();
    } else {
      paramLong -= i;
    } 
    a((int)paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */