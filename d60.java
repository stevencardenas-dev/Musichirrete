import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

public final class d60 extends MediaDataSource {
  public long b;
  
  public final i60 c;
  
  public d60(i60 parami60) {}
  
  public final void close() {}
  
  public final long getSize() {
    return -1L;
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    i60 i601 = this.c;
    DataInputStream dataInputStream = i601.b;
    if (paramInt2 == 0)
      return 0; 
    if (paramLong < 0L)
      return -1; 
    try {
      long l = this.b;
      if (l != paramLong) {
        if (l >= 0L && paramLong >= l + dataInputStream.available())
          return -1; 
        i601.c(paramLong);
        this.b = paramLong;
      } 
      int i = paramInt2;
      if (paramInt2 > dataInputStream.available())
        i = dataInputStream.available(); 
      paramInt1 = i601.read(paramArrayOfbyte, paramInt1, i);
      if (paramInt1 >= 0) {
        this.b += paramInt1;
        return paramInt1;
      } 
    } catch (IOException iOException) {}
    this.b = -1L;
    return -1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */