import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

public final class w70 extends FileChannel {
  public ParcelFileDescriptor b;
  
  public ParcelFileDescriptor c;
  
  public FileInputStream e;
  
  public FileOutputStream f;
  
  public long g;
  
  public final Uri h;
  
  public w70(Uri paramUri) {
    Uri uri = paramUri;
    if (lw0.N(paramUri))
      uri = lw0.M(paramUri); 
    this.h = uri;
  }
  
  public final FileInputStream a() {
    if (this.e == null)
      try {
        this.b = ws2.K(this.h, "r");
        FileInputStream fileInputStream = new FileInputStream();
        this(this.b.getFileDescriptor());
        this.e = fileInputStream;
      } catch (FileNotFoundException fileNotFoundException) {
        fileNotFoundException.printStackTrace();
      }  
    return this.e;
  }
  
  public final FileOutputStream c() {
    if (this.f == null)
      try {
        this.c = ws2.K(this.h, "rw");
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(this.c.getFileDescriptor());
        this.f = fileOutputStream;
      } finally {
        Exception exception = null;
      }  
    return this.f;
  }
  
  public final void force(boolean paramBoolean) {
    c().getChannel().force(paramBoolean);
    this.c.getFileDescriptor().sync();
  }
  
  public final void implCloseChannel() {
    if (this.f != null)
      c().flush(); 
    if (this.f != null)
      c().getChannel().close(); 
    if (this.f != null)
      c().close(); 
    if (this.e != null)
      a().close(); 
    ParcelFileDescriptor parcelFileDescriptor = this.b;
    if (parcelFileDescriptor != null)
      parcelFileDescriptor.close(); 
    parcelFileDescriptor = this.c;
    if (parcelFileDescriptor != null)
      parcelFileDescriptor.close(); 
  }
  
  public final FileLock lock(long paramLong1, long paramLong2, boolean paramBoolean) {
    return c().getChannel().lock(paramLong1, paramLong2, paramBoolean);
  }
  
  public final MappedByteBuffer map(FileChannel.MapMode paramMapMode, long paramLong1, long paramLong2) {
    if (paramMapMode == FileChannel.MapMode.READ_ONLY)
      return a().getChannel().map(paramMapMode, paramLong1, paramLong2); 
    if (paramMapMode == FileChannel.MapMode.PRIVATE)
      return c().getChannel().map(paramMapMode, paramLong1, paramLong2); 
    throw new UnsupportedOperationException();
  }
  
  public final long position() {
    return this.g;
  }
  
  public final FileChannel position(long paramLong) {
    this.g = paramLong;
    return this;
  }
  
  public final SeekableByteChannel position(long paramLong) {
    this.g = paramLong;
    return this;
  }
  
  public final int read(ByteBuffer paramByteBuffer) {
    try {
      FileChannel fileChannel = a().getChannel();
      fileChannel.position(this.g);
      int i = fileChannel.read(paramByteBuffer);
      this.g = fileChannel.position();
      return i;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1;
    } 
  }
  
  public final int read(ByteBuffer paramByteBuffer, long paramLong) {
    try {
      FileChannel fileChannel = a().getChannel();
      fileChannel.position(this.g);
      return fileChannel.read(paramByteBuffer, paramLong);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1;
    } 
  }
  
  public final long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    try {
      FileChannel fileChannel = a().getChannel();
      fileChannel.position(this.g);
      long l = fileChannel.read(paramArrayOfByteBuffer, paramInt1, paramInt2);
      this.g = fileChannel.position();
      return l;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1L;
    } 
  }
  
  public final long size() {
    return a().getChannel().size();
  }
  
  public final long transferFrom(ReadableByteChannel paramReadableByteChannel, long paramLong1, long paramLong2) {
    FileChannel fileChannel = c().getChannel();
    fileChannel.position(this.g);
    return fileChannel.transferFrom(paramReadableByteChannel, paramLong1, paramLong2);
  }
  
  public final long transferTo(long paramLong1, long paramLong2, WritableByteChannel paramWritableByteChannel) {
    FileChannel fileChannel = a().getChannel();
    fileChannel.position(this.g);
    return fileChannel.transferTo(paramLong1, paramLong2, paramWritableByteChannel);
  }
  
  public final FileChannel truncate(long paramLong) {
    FileChannel fileChannel = c().getChannel();
    try {
      fileChannel.truncate(paramLong);
      this.g = fileChannel.position();
      return this;
    } catch (Exception exception) {
      exception.printStackTrace();
      this.g = fileChannel.position();
      return this;
    } 
  }
  
  public final FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) {
    return c().getChannel().tryLock(paramLong1, paramLong2, paramBoolean);
  }
  
  public final int write(ByteBuffer paramByteBuffer) {
    try {
      FileChannel fileChannel = c().getChannel();
      fileChannel.position(this.g);
      int i = fileChannel.write(paramByteBuffer);
      this.g = fileChannel.position();
      return i;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1;
    } 
  }
  
  public final int write(ByteBuffer paramByteBuffer, long paramLong) {
    try {
      FileChannel fileChannel = c().getChannel();
      fileChannel.position(this.g);
      return fileChannel.write(paramByteBuffer, paramLong);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1;
    } 
  }
  
  public final long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) {
    try {
      FileChannel fileChannel = c().getChannel();
      fileChannel.position(this.g);
      long l = fileChannel.write(paramArrayOfByteBuffer, paramInt1, paramInt2);
      this.g = fileChannel.position();
      return l;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return -1L;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */