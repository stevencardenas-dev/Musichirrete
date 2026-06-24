package org.jaudiotagger.audio.asf.io;

import java.io.OutputStream;

public class CountingOutputstream extends OutputStream {
  static final boolean $assertionsDisabled = false;
  
  private long count = 0L;
  
  private final OutputStream wrapped;
  
  public CountingOutputstream(OutputStream paramOutputStream) {
    this.wrapped = paramOutputStream;
  }
  
  public void close() {
    this.wrapped.close();
  }
  
  public void flush() {
    this.wrapped.flush();
  }
  
  public long getCount() {
    return this.count;
  }
  
  public void write(int paramInt) {
    this.wrapped.write(paramInt);
    this.count++;
  }
  
  public void write(byte[] paramArrayOfbyte) {
    this.wrapped.write(paramArrayOfbyte);
    this.count += paramArrayOfbyte.length;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.wrapped.write(paramArrayOfbyte, paramInt1, paramInt2);
    this.count += paramInt2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\CountingOutputstream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */