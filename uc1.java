import android.net.Uri;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class uc1 implements Closeable, DataInput, DataOutput {
  public final RandomAccessFile b;
  
  public final u00 c;
  
  public final byte[] e = new byte[8];
  
  public FileChannel f = null;
  
  public uc1(u00 paramu00, String paramString) {
    Uri uri = paramu00.j();
    if ("file".equals(uri.getScheme())) {
      this.b = new RandomAccessFile(uri.getPath(), paramString);
      return;
    } 
    this.c = paramu00;
    if (paramu00 instanceof wh)
      ((wh)paramu00).q(); 
    paramString.contains("w");
  }
  
  public final FileChannel a() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.getChannel(); 
    /* monitor enter ThisExpression{ObjectType{uc1}} */
    try {
      if (this.f == null) {
        u00 u001 = this.c;
        if (u001 instanceof wh) {
          this.f = ((wh)u001).g;
        } else {
          w70 w70 = new w70();
          this(this.c.j());
          this.f = w70;
        } 
      } 
    } finally {}
    FileChannel fileChannel = this.f;
    /* monitor exit ThisExpression{ObjectType{uc1}} */
    return fileChannel;
  }
  
  public final long c() {
    RandomAccessFile randomAccessFile = this.b;
    return (randomAccessFile != null) ? randomAccessFile.getFilePointer() : a().position();
  }
  
  public final void close() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.close();
      return;
    } 
    FileChannel fileChannel = this.f;
    if (fileChannel != null && fileChannel.isOpen())
      this.f.close(); 
  }
  
  public final long d() {
    RandomAccessFile randomAccessFile = this.b;
    return (randomAccessFile != null) ? randomAccessFile.length() : a().size();
  }
  
  public final void finalize() {
    try {
      close();
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public final void g(byte[] paramArrayOfbyte) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.read(paramArrayOfbyte);
      return;
    } 
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    a().read(byteBuffer);
  }
  
  public final void h(long paramLong) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.seek(paramLong);
      return;
    } 
    if (paramLong >= 0L) {
      a().position(paramLong);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("offset < 0: ");
    stringBuilder.append(paramLong);
    throw new IOException(stringBuilder.toString());
  }
  
  public final void k(long paramLong) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.setLength(paramLong);
      return;
    } 
    if (paramLong >= 0L) {
      if (paramLong > a().size()) {
        a().position(paramLong - 1L);
        a().write(ByteBuffer.allocate(1));
      } else {
        a().truncate(paramLong);
      } 
      if (c() > paramLong)
        h(paramLong); 
      return;
    } 
    l0.l("newLength < 0");
  }
  
  public final int read() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.read(); 
    byte[] arrayOfByte = this.e;
    return (read(arrayOfByte, 0, 1) != -1) ? (arrayOfByte[0] & 0xFF) : -1;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.read(paramArrayOfbyte, paramInt1, paramInt2); 
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt1, paramInt2);
    return a().read(byteBuffer);
  }
  
  public final boolean readBoolean() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readBoolean(); 
    int i = read();
    if (i >= 0)
      return (i != 0); 
    throw new EOFException();
  }
  
  public final byte readByte() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readByte(); 
    int i = read();
    if (i >= 0)
      return (byte)i; 
    throw new EOFException();
  }
  
  public final char readChar() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readChar(); 
    int j = read();
    int i = read();
    if ((j | i) >= 0)
      return (char)((j << 8) + i); 
    throw new EOFException();
  }
  
  public final double readDouble() {
    RandomAccessFile randomAccessFile = this.b;
    return (randomAccessFile != null) ? randomAccessFile.readDouble() : Double.longBitsToDouble(readLong());
  }
  
  public final float readFloat() {
    RandomAccessFile randomAccessFile = this.b;
    return (randomAccessFile != null) ? randomAccessFile.readFloat() : Float.intBitsToFloat(readInt());
  }
  
  public final void readFully(byte[] paramArrayOfbyte) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.readFully(paramArrayOfbyte);
      return;
    } 
    readFully(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public final void readFully(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.readFully(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } 
    int i = 0;
    while (true) {
      int j = read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
      if (j >= 0) {
        j = i + j;
        i = j;
        if (j >= paramInt2)
          return; 
        continue;
      } 
      throw new EOFException();
    } 
  }
  
  public final int readInt() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readInt(); 
    int j = read();
    int k = read();
    int i = read();
    int m = read();
    if ((j | k | i | m) >= 0)
      return (j << 24) + (k << 16) + (i << 8) + m; 
    throw new EOFException();
  }
  
  public final String readLine() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readLine(); 
    StringBuffer stringBuffer = new StringBuffer();
    boolean bool = false;
    int i = -1;
    while (!bool) {
      i = read();
      if (i != -1 && i != 10) {
        if (i != 13) {
          stringBuffer.append((char)i);
          continue;
        } 
        long l = c();
        if (read() != 10)
          h(l); 
      } 
      bool = true;
    } 
    return (i == -1 && stringBuffer.length() == 0) ? null : stringBuffer.toString();
  }
  
  public final long readLong() {
    return (this.b != null) ? readLong() : ((readInt() << 32L) + (readInt() & 0xFFFFFFFFL));
  }
  
  public final short readShort() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readShort(); 
    int j = read();
    int i = read();
    if ((j | i) >= 0)
      return (short)((j << 8) + i); 
    throw new EOFException();
  }
  
  public final String readUTF() {
    RandomAccessFile randomAccessFile = this.b;
    return (randomAccessFile != null) ? randomAccessFile.readUTF() : DataInputStream.readUTF(this);
  }
  
  public final int readUnsignedByte() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readUnsignedByte(); 
    int i = read();
    if (i >= 0)
      return i; 
    throw new EOFException();
  }
  
  public final int readUnsignedShort() {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.readUnsignedShort(); 
    int i = read();
    int j = read();
    if ((i | j) >= 0)
      return (i << 8) + j; 
    throw new EOFException();
  }
  
  public final int skipBytes(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null)
      return randomAccessFile.skipBytes(paramInt); 
    if (paramInt <= 0)
      return 0; 
    long l3 = c();
    long l1 = d();
    long l2 = paramInt + l3;
    if (l2 <= l1)
      l1 = l2; 
    h(l1);
    return (int)(l1 - l3);
  }
  
  public final void write(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.write(paramInt);
      return;
    } 
    byte b = (byte)(paramInt & 0xFF);
    byte[] arrayOfByte = this.e;
    arrayOfByte[0] = b;
    write(arrayOfByte, 0, 1);
  }
  
  public final void write(byte[] paramArrayOfbyte) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.write(paramArrayOfbyte);
      return;
    } 
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    a().write(byteBuffer);
  }
  
  public final void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.write(paramArrayOfbyte, paramInt1, paramInt2);
      return;
    } 
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte, paramInt1, paramInt2);
    a().write(byteBuffer);
  }
  
  public final void writeBoolean(boolean paramBoolean) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeBoolean(paramBoolean);
      return;
    } 
    write(paramBoolean);
  }
  
  public final void writeByte(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeByte(paramInt);
      return;
    } 
    write(paramInt);
  }
  
  public final void writeBytes(String paramString) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeBytes(paramString);
      return;
    } 
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i];
    paramString.getBytes(0, i, arrayOfByte, 0);
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte, 0, i);
    a().write(byteBuffer);
  }
  
  public final void writeChar(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeChar(paramInt);
      return;
    } 
    write(paramInt >>> 8 & 0xFF);
    write(paramInt & 0xFF);
  }
  
  public final void writeChars(String paramString) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeChars(paramString);
      return;
    } 
    int k = paramString.length();
    int j = k * 2;
    byte[] arrayOfByte = new byte[j];
    char[] arrayOfChar = new char[k];
    paramString.getChars(0, k, arrayOfChar, 0);
    byte b = 0;
    int i = 0;
    while (true) {
      int m = i;
      if (b < k) {
        char c = arrayOfChar[b];
        arrayOfByte[m] = (byte)(c >>> 8);
        i = m + 2;
        arrayOfByte[m + 1] = (byte)c;
        b++;
        continue;
      } 
      ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte, 0, j);
      a().write(byteBuffer);
      return;
    } 
  }
  
  public final void writeDouble(double paramDouble) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeDouble(paramDouble);
      return;
    } 
    writeLong(Double.doubleToLongBits(paramDouble));
  }
  
  public final void writeFloat(float paramFloat) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeFloat(paramFloat);
      return;
    } 
    writeInt(Float.floatToIntBits(paramFloat));
  }
  
  public final void writeInt(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeInt(paramInt);
      return;
    } 
    write(paramInt >>> 24 & 0xFF);
    write(paramInt >>> 16 & 0xFF);
    write(paramInt >>> 8 & 0xFF);
    write(paramInt & 0xFF);
  }
  
  public final void writeLong(long paramLong) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeLong(paramLong);
      return;
    } 
    write((int)(paramLong >>> 56L) & 0xFF);
    write((int)(paramLong >>> 48L) & 0xFF);
    write((int)(paramLong >>> 40L) & 0xFF);
    write((int)(paramLong >>> 32L) & 0xFF);
    write((int)(paramLong >>> 24L) & 0xFF);
    write((int)(paramLong >>> 16L) & 0xFF);
    write((int)(paramLong >>> 8L) & 0xFF);
    write((int)paramLong & 0xFF);
  }
  
  public final void writeShort(int paramInt) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeShort(paramInt);
      return;
    } 
    write(paramInt >>> 8 & 0xFF);
    write(paramInt & 0xFF);
  }
  
  public final void writeUTF(String paramString) {
    RandomAccessFile randomAccessFile = this.b;
    if (randomAccessFile != null) {
      randomAccessFile.writeUTF(paramString);
      return;
    } 
    int j = paramString.length();
    char c = Character.MIN_VALUE;
    int i = 0;
    while (c < j) {
      char c1 = paramString.charAt(c);
      if (c1 >= '\001' && c1 <= '') {
        i++;
      } else if (c1 > '߿') {
        i += 3;
      } else {
        i += 2;
      } 
      c++;
    } 
    if (i <= 65535) {
      char c1;
      int k;
      int m = i + 2;
      byte[] arrayOfByte = new byte[m];
      arrayOfByte[0] = (byte)(i >>> 8 & 0xFF);
      arrayOfByte[1] = (byte)(i & 0xFF);
      i = 2;
      c = Character.MIN_VALUE;
      while (true) {
        k = i;
        c1 = c;
        if (c < j) {
          char c2 = paramString.charAt(c);
          k = i;
          c1 = c;
          if (c2 >= '\001') {
            if (c2 > '') {
              k = i;
              c1 = c;
              break;
            } 
            arrayOfByte[i] = (byte)c2;
            c++;
            i++;
            continue;
          } 
        } 
        break;
      } 
      while (c1 < j) {
        c = paramString.charAt(c1);
        if (c >= '\001' && c <= '') {
          arrayOfByte[k] = (byte)c;
          i = k + 1;
        } else if (c > '߿') {
          arrayOfByte[k] = (byte)(c >> 12 & 0xF | 0xE0);
          arrayOfByte[k + 1] = (byte)(c >> 6 & 0x3F | 0x80);
          i = k + 3;
          arrayOfByte[k + 2] = (byte)(c & 0x3F | 0x80);
        } else {
          arrayOfByte[k] = (byte)(c >> 6 & 0x1F | 0xC0);
          i = k + 2;
          arrayOfByte[k + 1] = (byte)(c & 0x3F | 0x80);
        } 
        c1++;
        k = i;
      } 
      write(arrayOfByte, 0, m);
      return;
    } 
    throw new UTFDataFormatException(x41.i(i, "encoded string too long: ", " bytes"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uc1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */