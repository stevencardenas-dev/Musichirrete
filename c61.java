import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public final class c61 {
  public u00 a;
  
  public static c61 a(u00 paramu00) {
    Object object = new Object();
    ((c61)object).a = paramu00;
    return (c61)object;
  }
  
  public final FileChannel b(String paramString) {
    RandomAccessFile randomAccessFile;
    u00 u001 = this.a;
    if (u001 instanceof wh) {
      ((wh)u001).q();
      return ((wh)this.a).g;
    } 
    if (u001 instanceof cd1) {
      File file = ((cd1)u001).e;
      if (paramString.contains("w")) {
        paramString = "rw";
      } else {
        paramString = "r";
      } 
      randomAccessFile = new RandomAccessFile(file, paramString);
      return new u82(randomAccessFile.getChannel(), randomAccessFile);
    } 
    if (randomAccessFile.contains("w"))
      return new w70(this.a.j()); 
    FileInputStream fileInputStream = ws2.n(this.a);
    return new u82(fileInputStream.getChannel(), fileInputStream);
  }
  
  public final String toString() {
    return this.a.j().toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */