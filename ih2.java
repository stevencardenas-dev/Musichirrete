import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

public final class ih2 implements rf2 {
  public final FileChannel b;
  
  public final long c;
  
  public final long e;
  
  public ih2(FileChannel paramFileChannel, long paramLong1, long paramLong2) {
    this.b = paramFileChannel;
    this.c = paramLong1;
    this.e = paramLong2;
  }
  
  public final long a() {
    return this.e;
  }
  
  public final void g(MessageDigest[] paramArrayOfMessageDigest, long paramLong, int paramInt) {
    long l2 = this.c;
    long l1 = paramInt;
    MappedByteBuffer mappedByteBuffer = this.b.map(FileChannel.MapMode.READ_ONLY, l2 + paramLong, l1);
    mappedByteBuffer.load();
    for (paramInt = 0; paramInt < paramArrayOfMessageDigest.length; paramInt++) {
      MessageDigest messageDigest = paramArrayOfMessageDigest[paramInt];
      mappedByteBuffer.position(0);
      messageDigest.update(mappedByteBuffer);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ih2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */