package org.jaudiotagger.audio.asf.io;

import java.io.FilterInputStream;
import java.io.InputStream;

class CountingInputStream extends FilterInputStream {
  private long markPos = 0L;
  
  private long readCount = 0L;
  
  public CountingInputStream(InputStream paramInputStream) {
    super(paramInputStream);
  }
  
  private void bytesRead(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_1
    //   3: lconst_0
    //   4: lcmp
    //   5: iflt -> 26
    //   8: aload_0
    //   9: aload_0
    //   10: getfield readCount : J
    //   13: lload_1
    //   14: ladd
    //   15: putfield readCount : J
    //   18: goto -> 26
    //   21: astore_3
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_3
    //   25: athrow
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    // Exception table:
    //   from	to	target	type
    //   8	18	21	finally
    //   22	24	21	finally
  }
  
  public long getReadCount() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield readCount : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
    //   12	14	11	finally
  }
  
  public void mark(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokespecial mark : (I)V
    //   7: aload_0
    //   8: aload_0
    //   9: getfield readCount : J
    //   12: putfield markPos : J
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
    //   19	21	18	finally
  }
  
  public int read() {
    int i = super.read();
    bytesRead(1L);
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    bytesRead(paramInt1);
    return paramInt1;
  }
  
  public void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial reset : ()V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: aload_0
    //   10: getfield markPos : J
    //   13: putfield readCount : J
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	26	finally
    //   8	18	21	finally
    //   22	24	21	finally
    //   24	26	26	finally
    //   27	29	26	finally
  }
  
  public long skip(long paramLong) {
    paramLong = super.skip(paramLong);
    bytesRead(paramLong);
    return paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\CountingInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */