import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

public final class c02 extends FileChannel {
  public final FileChannel b;
  
  public boolean c;
  
  public c02(FileChannel paramFileChannel) {
    this.b = paramFileChannel;
  }
  
  public final void force(boolean paramBoolean) {
    throw new IOException();
  }
  
  public final void implCloseChannel() {
    position(0L);
  }
  
  public final FileLock lock(long paramLong1, long paramLong2, boolean paramBoolean) {
    throw new IOException();
  }
  
  public final MappedByteBuffer map(FileChannel.MapMode paramMapMode, long paramLong1, long paramLong2) {
    if (paramMapMode == FileChannel.MapMode.READ_ONLY)
      return this.b.map(paramMapMode, paramLong1, paramLong2); 
    throw new IOException();
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
    throw new IOException();
  }
  
  public final long transferTo(long paramLong1, long paramLong2, WritableByteChannel paramWritableByteChannel) {
    return this.b.transferTo(paramLong1, paramLong2, paramWritableByteChannel);
  }
  
  public final FileChannel truncate(long paramLong) {
    throw new IOException();
  }
  
  public final SeekableByteChannel truncate(long paramLong) {
    throw new IOException();
  }
  
  public final FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) {
    throw new IOException();
  }
  
  public final int write(ByteBuffer paramByteBuffer) {
    throw new IOException();
  }
  
  public final int write(ByteBuffer paramByteBuffer, long paramLong) {
    throw new IOException();
  }
  
  public final long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    throw new IOException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */