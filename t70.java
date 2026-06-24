import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;

public final class t70 extends FileOutputStream {
  public final ParcelFileDescriptor b;
  
  public t70(ParcelFileDescriptor paramParcelFileDescriptor) {
    super(paramParcelFileDescriptor.getFileDescriptor());
    this.b = paramParcelFileDescriptor;
  }
  
  public final void close() {
    super.close();
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */