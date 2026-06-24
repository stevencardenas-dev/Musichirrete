import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class pr0 extends InputStream {
  public final InputStream b;
  
  public long c;
  
  public long e;
  
  public long f;
  
  public long g = -1L;
  
  public pr0(InputStream paramInputStream) {
    InputStream inputStream = paramInputStream;
    if (!paramInputStream.markSupported())
      inputStream = new BufferedInputStream(paramInputStream, 4096); 
    this.b = inputStream;
  }
  
  public final void a(long paramLong) {
    if (this.c <= this.f && paramLong >= this.e) {
      this.b.reset();
      d(this.e, paramLong);
      this.c = paramLong;
      return;
    } 
    m60.i("Cannot reset");
  }
  
  public final int available() {
    return this.b.available();
  }
  
  public final long c(int paramInt) {
    long l2 = this.c;
    long l3 = paramInt + l2;
    long l1 = this.f;
    if (l1 < l3)
      try {
        long l = this.e;
        InputStream inputStream = this.b;
        if (l < l2 && l2 <= l1) {
          inputStream.reset();
          inputStream.mark((int)(l3 - this.e));
          d(this.e, this.c);
        } else {
          this.e = l2;
          inputStream.mark((int)(l3 - l2));
        } 
        this.f = l3;
      } catch (IOException iOException) {
        m60.o("Unable to mark: ", iOException);
        return 0L;
      }  
    return this.c;
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final void d(long paramLong1, long paramLong2) {
    while (paramLong1 < paramLong2) {
      long l2 = this.b.skip(paramLong2 - paramLong1);
      long l1 = l2;
      if (l2 == 0L) {
        if (read() == -1)
          break; 
        l1 = 1L;
      } 
      paramLong1 += l1;
    } 
  }
  
  public final void mark(int paramInt) {
    this.g = c(paramInt);
  }
  
  public final boolean markSupported() {
    return this.b.markSupported();
  }
  
  public final int read() {
    int i = this.b.read();
    if (i != -1)
      this.c++; 
    return i;
  }
  
  public final int read(byte[] paramArrayOfbyte) {
    int i = this.b.read(paramArrayOfbyte);
    if (i != -1)
      this.c += i; 
    return i;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = this.b.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt1 != -1)
      this.c += paramInt1; 
    return paramInt1;
  }
  
  public final void reset() {
    a(this.g);
  }
  
  public final long skip(long paramLong) {
    paramLong = this.b.skip(paramLong);
    this.c += paramLong;
    return paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */