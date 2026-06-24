import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class s70 extends FileInputStream {
  public final int b;
  
  public Closeable c;
  
  private final void c() {}
  
  public void a() {
    try {
      super.close();
      return;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return;
    } 
  }
  
  public final void close() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 24, 0 -> 46
    //   24: aload_0
    //   25: getfield c : Ljava/io/Closeable;
    //   28: checkcast c02
    //   31: astore_1
    //   32: aload_1
    //   33: getfield c : Z
    //   36: ifne -> 45
    //   39: aload_1
    //   40: lconst_0
    //   41: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   44: pop
    //   45: return
    //   46: aload_0
    //   47: invokespecial close : ()V
    //   50: aload_0
    //   51: getfield c : Ljava/io/Closeable;
    //   54: checkcast android/os/ParcelFileDescriptor
    //   57: invokevirtual close : ()V
    //   60: goto -> 68
    //   63: astore_1
    //   64: aload_1
    //   65: invokevirtual printStackTrace : ()V
    //   68: return
    //   69: astore_1
    //   70: goto -> 45
    // Exception table:
    //   from	to	target	type
    //   24	45	69	java/io/IOException
    //   50	60	63	finally
  }
  
  public c02 d() {
    if ((c02)this.c == null)
      this.c = new c02(super.getChannel()); 
    return (c02)this.c;
  }
  
  public void finalize() {
    switch (this.b) {
      default:
        super.finalize();
        break;
      case 1:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */