import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;

public final class bd1 extends u00 {
  public File b;
  
  public bd1(bd1 parambd1, File paramFile) {
    super(parambd1);
    this.b = paramFile;
  }
  
  public static boolean p(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool2 = true;
    boolean bool1 = true;
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      byte b = 0;
      while (true) {
        bool2 = bool1;
        if (b < i) {
          paramFile = arrayOfFile[b];
          bool2 = bool1;
          if (paramFile.isDirectory())
            bool2 = bool1 & p(paramFile); 
          bool1 = bool2;
          if (!paramFile.delete()) {
            StringBuilder stringBuilder = new StringBuilder("Failed to delete ");
            stringBuilder.append(paramFile);
            Log.w("DocumentFile", stringBuilder.toString());
            bool1 = false;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } 
    return bool2;
  }
  
  public final boolean a() {
    return this.b.canRead();
  }
  
  public final boolean b() {
    return this.b.canWrite();
  }
  
  public final u00 d(String paramString1, String paramString2) {
    String str = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString1);
    paramString1 = paramString2;
    if (str != null)
      paramString1 = x41.l(paramString2, ".", str); 
    File file = new File(this.b, paramString1);
    try {
      if (file.createNewFile())
        return new bd1(this, file); 
    } catch (IOException iOException) {}
    return null;
  }
  
  public final boolean e() {
    p(this.b);
    return this.b.delete();
  }
  
  public final boolean f() {
    return this.b.exists();
  }
  
  public final String h() {
    return this.b.getName();
  }
  
  public final Uri j() {
    return Uri.fromFile(this.b);
  }
  
  public final boolean k() {
    return this.b.isDirectory();
  }
  
  public final boolean l() {
    return this.b.isFile();
  }
  
  public final long n() {
    return this.b.length();
  }
  
  public final boolean o(String paramString) {
    File file = new File(this.b.getParentFile(), paramString);
    if (this.b.renameTo(file)) {
      this.b = file;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */