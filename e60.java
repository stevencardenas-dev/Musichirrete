import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class e60 extends InputStream implements DataInput {
  public final DataInputStream b;
  
  public int c;
  
  public ByteOrder e;
  
  public byte[] f;
  
  public final int g;
  
  public e60(BufferedInputStream paramBufferedInputStream) {
    this(paramBufferedInputStream);
  }
  
  public e60(InputStream paramInputStream) {
    byte b;
    DataInputStream dataInputStream = new DataInputStream(paramInputStream);
    this.b = dataInputStream;
    dataInputStream.mark(0);
    this.c = 0;
    this.e = byteOrder;
    if (paramInputStream instanceof e60) {
      b = ((e60)paramInputStream).g;
    } else {
      b = -1;
    } 
    this.g = b;
  }
  
  public e60(byte[] paramArrayOfbyte) {
    this(byteArrayInputStream);
    this.g = paramArrayOfbyte.length;
  }
  
  public final void a(int paramInt) {
    int i;
    for (i = 0; i < paramInt; i += j) {
      int m = paramInt - i;
      long l = m;
      DataInputStream dataInputStream = this.b;
      int k = (int)dataInputStream.skip(l);
      int j = k;
      if (k <= 0) {
        if (this.f == null)
          this.f = new byte[8192]; 
        j = Math.min(8192, m);
        j = dataInputStream.read(this.f, 0, j);
        if (j == -1)
          throw new EOFException(x41.i(paramInt, "Reached EOF while skipping ", " bytes.")); 
      } 
    } 
    this.c += i;
  }
  
  public final int available() {
    return this.b.available();
  }
  
  public final void mark(int paramInt) {
    throw new UnsupportedOperationException("Mark is currently unsupported");
  }
  
  public final int read() {
    this.c++;
    return this.b.read();
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = this.b.read(paramArrayOfbyte, paramInt1, paramInt2);
    this.c += paramInt1;
    return paramInt1;
  }
  
  public final boolean readBoolean() {
    this.c++;
    return this.b.readBoolean();
  }
  
  public final byte readByte() {
    this.c++;
    int i = this.b.read();
    if (i >= 0)
      return (byte)i; 
    throw new EOFException();
  }
  
  public final char readChar() {
    this.c += 2;
    return this.b.readChar();
  }
  
  public final double readDouble() {
    return Double.longBitsToDouble(readLong());
  }
  
  public final float readFloat() {
    return Float.intBitsToFloat(readInt());
  }
  
  public final void readFully(byte[] paramArrayOfbyte) {
    this.c += paramArrayOfbyte.length;
    this.b.readFully(paramArrayOfbyte);
  }
  
  public final void readFully(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.c += paramInt2;
    this.b.readFully(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public final int readInt() {
    this.c += 4;
    DataInputStream dataInputStream = this.b;
    int j = dataInputStream.read();
    int i = dataInputStream.read();
    int m = dataInputStream.read();
    int k = dataInputStream.read();
    if ((j | i | m | k) >= 0) {
      ByteOrder byteOrder = this.e;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN)
        return (k << 24) + (m << 16) + (i << 8) + j; 
      if (byteOrder == ByteOrder.BIG_ENDIAN)
        return (j << 24) + (i << 16) + (m << 8) + k; 
      tp.m("Invalid byte order: ", this.e);
      return 0;
    } 
    throw new EOFException();
  }
  
  public final String readLine() {
    Log.d("ExifInterface", "Currently unsupported");
    return null;
  }
  
  public final long readLong() {
    this.c += 8;
    DataInputStream dataInputStream = this.b;
    int n = dataInputStream.read();
    int k = dataInputStream.read();
    int j = dataInputStream.read();
    int m = dataInputStream.read();
    int i1 = dataInputStream.read();
    int i3 = dataInputStream.read();
    int i = dataInputStream.read();
    int i2 = dataInputStream.read();
    if ((n | k | j | m | i1 | i3 | i | i2) >= 0) {
      ByteOrder byteOrder = this.e;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN)
        return (i2 << 56L) + (i << 48L) + (i3 << 40L) + (i1 << 32L) + (m << 24L) + (j << 16L) + (k << 8L) + n; 
      if (byteOrder == ByteOrder.BIG_ENDIAN)
        return (n << 56L) + (k << 48L) + (j << 40L) + (m << 32L) + (i1 << 24L) + (i3 << 16L) + (i << 8L) + i2; 
      tp.m("Invalid byte order: ", this.e);
      return 0L;
    } 
    throw new EOFException();
  }
  
  public final short readShort() {
    this.c += 2;
    DataInputStream dataInputStream = this.b;
    int j = dataInputStream.read();
    int i = dataInputStream.read();
    if ((j | i) >= 0) {
      ByteOrder byteOrder = this.e;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN)
        return (short)((i << 8) + j); 
      if (byteOrder == ByteOrder.BIG_ENDIAN)
        return (short)((j << 8) + i); 
      tp.m("Invalid byte order: ", this.e);
      return 0;
    } 
    throw new EOFException();
  }
  
  public final String readUTF() {
    this.c += 2;
    return this.b.readUTF();
  }
  
  public final int readUnsignedByte() {
    this.c++;
    return this.b.readUnsignedByte();
  }
  
  public final int readUnsignedShort() {
    this.c += 2;
    DataInputStream dataInputStream = this.b;
    int i = dataInputStream.read();
    int j = dataInputStream.read();
    if ((i | j) >= 0) {
      ByteOrder byteOrder = this.e;
      if (byteOrder == ByteOrder.LITTLE_ENDIAN)
        return (j << 8) + i; 
      if (byteOrder == ByteOrder.BIG_ENDIAN)
        return (i << 8) + j; 
      tp.m("Invalid byte order: ", this.e);
      return 0;
    } 
    throw new EOFException();
  }
  
  public final void reset() {
    throw new UnsupportedOperationException("Reset is currently unsupported");
  }
  
  public final int skipBytes(int paramInt) {
    throw new UnsupportedOperationException("skipBytes is currently unsupported");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */