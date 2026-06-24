import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class s4 {
  public int a;
  
  public boolean b;
  
  public MediaExtractor c;
  
  public MediaCodec d;
  
  public long e;
  
  public String f;
  
  public ByteBuffer[] g;
  
  public ByteBuffer[] h;
  
  public boolean i;
  
  public MediaCodec.BufferInfo j;
  
  public ByteBuffer k;
  
  public final long a() {
    MediaCodec mediaCodec = this.d;
    MediaExtractor mediaExtractor = this.c;
    if (!this.i) {
      int i = mediaCodec.dequeueInputBuffer(0L);
      if (i >= 0) {
        ByteBuffer byteBuffer;
        if (d12.a >= 21) {
          byteBuffer = mediaCodec.getInputBuffer(i);
        } else {
          byteBuffer = this.g[i];
        } 
        long l = mediaExtractor.getSampleTime();
        int j = mediaExtractor.readSampleData(byteBuffer, 0);
        if (j > 0) {
          long l1 = mediaExtractor.getSampleTime();
          this.d.queueInputBuffer(i, 0, byteBuffer.limit(), l, 0);
          return l1;
        } 
        if (j == -1)
          this.i = true; 
      } 
    } 
    return 0L;
  }
  
  public final int b(ByteBuffer paramByteBuffer, byte[] paramArrayOfbyte) {
    int j = this.a;
    int i = 0;
    byte b = 0;
    while (true) {
      int k = i + 1;
      try {
        if (k * j < paramArrayOfbyte.length && paramByteBuffer.remaining() >= j * 2) {
          for (byte b1 = 0; b1 < j; b1++) {
            if (paramByteBuffer.order() == ByteOrder.nativeOrder()) {
              paramArrayOfbyte[i] = paramByteBuffer.get();
              paramArrayOfbyte[k] = paramByteBuffer.get();
            } else {
              paramArrayOfbyte[k] = paramByteBuffer.get();
              paramArrayOfbyte[i] = paramByteBuffer.get();
            } 
          } 
          b++;
          i += j * 2;
          continue;
        } 
      } finally {}
      return b;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */