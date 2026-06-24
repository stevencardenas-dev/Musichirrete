package org.jaudiotagger.audio.asf.io;

import java.io.OutputStream;
import uc1;

public final class RandomAccessFileOutputStream extends OutputStream {
  private final uc1 targetFile;
  
  public RandomAccessFileOutputStream(uc1 paramuc1) {
    this.targetFile = paramuc1;
  }
  
  public void write(int paramInt) {
    this.targetFile.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.targetFile.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\RandomAccessFileOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */