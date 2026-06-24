import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class x70 {
  public final String a;
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public x70(String paramString) {
    this.a = paramString;
  }
  
  public final File a(Uri paramUri) {
    String str = paramUri.getEncodedPath();
    int i = str.indexOf('/', 1);
    if (i != -1) {
      String str1 = Uri.decode(str.substring(1, i));
      str = Uri.decode(str.substring(i + 1));
      File file = (File)this.b.get(str1);
      if (file != null) {
        String str2;
        File file1 = new File(file, str);
        try {
          File file2 = file1.getCanonicalFile();
          str2 = file2.getPath();
          String str3 = file.getPath();
          if (FileProvider.a(str2).startsWith(FileProvider.a(str3).concat("/")))
            return file2; 
          throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException iOException) {
          m60.k("Failed to resolve canonical path for ", str2);
          return null;
        } 
      } 
      m60.k("Unable to find configured root for ", iOException);
      return null;
    } 
    m60.k("Unable to find path from root: ", iOException);
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */