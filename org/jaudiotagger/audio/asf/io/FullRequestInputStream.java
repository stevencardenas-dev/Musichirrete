package org.jaudiotagger.audio.asf.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FullRequestInputStream extends FilterInputStream {
  public FullRequestInputStream(InputStream paramInputStream) {
    super(paramInputStream);
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = 0;
    while (i < paramInt2) {
      int k = super.read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
      int j = i;
      if (k >= 0)
        j = i + k; 
      if (k != -1) {
        i = j;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramInt2 - j);
      stringBuilder.append(" more bytes expected.");
      throw new IOException(stringBuilder.toString());
    } 
    return i;
  }
  
  public long skip(long paramLong) {
    byte b = 0;
    long l = 0L;
    while (l < paramLong) {
      long l1 = super.skip(paramLong - l);
      byte b1 = b;
      if (l1 == 0L) {
        b1 = ++b;
        if (b == 2)
          break; 
      } 
      l += l1;
      b = b1;
    } 
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\FullRequestInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */