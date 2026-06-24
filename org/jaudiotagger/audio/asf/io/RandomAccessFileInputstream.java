package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import l0;
import uc1;

public final class RandomAccessFileInputstream extends InputStream {
  private final uc1 source;
  
  public RandomAccessFileInputstream(uc1 paramuc1) {
    if (paramuc1 != null) {
      this.source = paramuc1;
      return;
    } 
    l0.l("null");
    throw null;
  }
  
  public int read() {
    return this.source.read();
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return this.source.read(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public long skip(long paramLong) {
    if (paramLong >= 0L)
      while (true) {
        uc1 uc11 = this.source;
        if (paramLong > 2147483647L) {
          uc11.skipBytes(2147483647);
          paramLong -= 2147483647L;
          continue;
        } 
        return uc11.skipBytes((int)paramLong);
      }  
    l0.l("invalid negative value");
    return 0L;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\RandomAccessFileInputstream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */