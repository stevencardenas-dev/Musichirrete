import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

public final class u82 extends FileChannel {
  public final FileChannel b;
  
  public final Closeable c;
  
  public u82(FileChannel paramFileChannel, Closeable paramCloseable) {
    this.b = paramFileChannel;
    this.c = paramCloseable;
  }
  
  public final void force(boolean paramBoolean) {
    this.b.force(paramBoolean);
  }
  
  public final void implCloseChannel() {
    try {
      this.b.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    try {
      this.c.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public final FileLock lock(long paramLong1, long paramLong2, boolean paramBoolean) {
    return this.b.lock(paramLong1, paramLong2, paramBoolean);
  }
  
  public final MappedByteBuffer map(FileChannel.MapMode paramMapMode, long paramLong1, long paramLong2) {
    return this.b.map(paramMapMode, paramLong1, paramLong2);
  }
  
  public final long position() {
    return this.b.position();
  }
  
  public final FileChannel position(long paramLong) {
    return this.b.position(paramLong);
  }
  
  public final SeekableByteChannel position(long paramLong) {
    return this.b.position(paramLong);
  }
  
  public final int read(ByteBuffer paramByteBuffer) {
    return this.b.read(paramByteBuffer);
  }
  
  public final int read(ByteBuffer paramByteBuffer, long paramLong) {
    return this.b.read(paramByteBuffer, paramLong);
  }
  
  public final long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    return this.b.read(paramArrayOfByteBuffer, paramInt1, paramInt2);
  }
  
  public final long size() {
    return this.b.size();
  }
  
  public final long transferFrom(ReadableByteChannel paramReadableByteChannel, long paramLong1, long paramLong2) {
    return this.b.transferFrom(paramReadableByteChannel, paramLong1, paramLong2);
  }
  
  public final long transferTo(long paramLong1, long paramLong2, WritableByteChannel paramWritableByteChannel) {
    return this.b.transferTo(paramLong1, paramLong2, paramWritableByteChannel);
  }
  
  public final FileChannel truncate(long paramLong) {
    return this.b.truncate(paramLong);
  }
  
  public final SeekableByteChannel truncate(long paramLong) {
    return this.b.truncate(paramLong);
  }
  
  public final FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) {
    return this.b.tryLock(paramLong1, paramLong2, paramBoolean);
  }
  
  public final int write(ByteBuffer paramByteBuffer) {
    return this.b.write(paramByteBuffer);
  }
  
  public final int write(ByteBuffer paramByteBuffer, long paramLong) {
    return this.b.write(paramByteBuffer, paramLong);
  }
  
  public final long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    return this.b.write(paramArrayOfByteBuffer, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */