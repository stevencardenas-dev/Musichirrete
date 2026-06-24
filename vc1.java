import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class vc1 implements eu {
  public final uc1 b;
  
  public final long c;
  
  public final long e;
  
  public final v00 f;
  
  public vc1(String paramString) {
    this.b = uc11;
    this.c = 0L;
    this.e = -1L;
    this.f = v001;
  }
  
  public vc1(uc1 paramuc1, long paramLong1, long paramLong2) {
    if (paramLong1 >= 0L) {
      if (paramLong2 >= 0L) {
        this.b = paramuc1;
        this.c = paramLong1;
        this.e = paramLong2;
        return;
      } 
      l0.k();
      throw null;
    } 
    l0.k();
    throw null;
  }
  
  public static void b(long paramLong1, long paramLong2, long paramLong3) {
    if (paramLong1 >= 0L) {
      if (paramLong2 >= 0L) {
        if (paramLong1 <= paramLong3) {
          paramLong2 += paramLong1;
          if (paramLong2 >= paramLong1) {
            if (paramLong2 <= paramLong3)
              return; 
            l0.k();
            return;
          } 
          l0.k();
          return;
        } 
        l0.k();
        return;
      } 
      l0.k();
      return;
    } 
    l0.k();
  }
  
  public final void a(long paramLong1, long paramLong2, bh0 parambh0) {
    long l = size();
    b(paramLong1, paramLong2, l);
    if (paramLong2 != 0L) {
      paramLong1 = this.c + paramLong1;
      int i = (int)Math.min(paramLong2, 65536L);
      byte[] arrayOfByte = new byte[i];
      while (paramLong2 > 0L) {
        uc1 uc11;
        MessageDigest[] arrayOfMessageDigest;
        int j = (int)Math.min(paramLong2, i);
        synchronized (this.b) {
          this.b.h(paramLong1);
          this.b.readFully(arrayOfByte, 0, j);
          arrayOfMessageDigest = (MessageDigest[])parambh0.c;
          int k = arrayOfMessageDigest.length;
          for (byte b = 0; b < k; b++)
            arrayOfMessageDigest[b].update(arrayOfByte, 0, j); 
          l = j;
          paramLong1 += l;
          paramLong2 -= l;
        } 
      } 
    } 
  }
  
  public final ByteBuffer c(int paramInt, long paramLong) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt);
    long l = size();
    b(paramLong, paramInt, l);
    if (paramInt != 0) {
      paramLong = this.c + paramLong;
      int i = byteBuffer.limit();
      try {
        byteBuffer.limit(byteBuffer.position() + paramInt);
        FileChannel fileChannel = this.b.a();
        while (paramInt > 0) {
          synchronized (this.b) {
            fileChannel.position(paramLong);
            int j = fileChannel.read(byteBuffer);
            paramLong += j;
            paramInt -= j;
          } 
        } 
      } finally {
        Exception exception;
      } 
      byteBuffer.limit(i);
    } 
    byteBuffer.flip();
    return byteBuffer;
  }
  
  public final eu d(long paramLong1, long paramLong2) {
    e91.f++;
    long l = size();
    b(paramLong1, paramLong2, l);
    if (paramLong1 == 0L && paramLong2 == l)
      return this; 
    if (ag0.d == null) {
      ag0.d = JkpGFvCVQHzgc.pBLtCvvgKaZk;
      if ((c61.a(this.f)).a.b())
        ag0.d = x41.n(new StringBuilder(), ag0.d, "\n"); 
    } 
    l = this.c;
    return new vc1(this.b, l + paramLong1, paramLong2);
  }
  
  public final long size() {
    long l = this.e;
    if (l == -1L)
      try {
        return this.b.d();
      } catch (IOException iOException) {
        return 0L;
      }  
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */