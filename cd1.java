import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public final class cd1 extends v00 {
  public File e;
  
  public cd1(cd1 paramcd1, File paramFile, String paramString1, String paramString2) {
    super(paramcd1);
    this.e = paramFile;
    if (paramString1 != null) {
      this.b = new d61(paramString1, null);
      return;
    } 
    F(paramString2, h());
  }
  
  public static boolean G(File paramFile) {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool2 = true;
    boolean bool1 = true;
    if (arrayOfFile != null) {
      int i = arrayOfFile.length;
      byte b = 0;
      while (true) {
        bool2 = bool1;
        if (b < i) {
          File file = arrayOfFile[b];
          bool2 = bool1;
          if (file.isDirectory())
            bool2 = bool1 & G(file); 
          bool1 = bool2;
          if (!file.delete()) {
            StringBuilder stringBuilder = new StringBuilder("Failed to delete ");
            stringBuilder.append(file);
            String str = stringBuilder.toString();
            Log.w(hbrAVtEa.KCk, str);
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
  
  public final v00 A(String paramString) {
    try {
      if ("".equals(paramString))
        return this; 
      File file = new File();
      this(this.e, paramString);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(this.b.toString());
      return new cd1(null, file, stringBuilder.toString(), null);
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public final ArrayList D(q01 paramq01) {
    File file = this.e;
    byte b = 0;
    if (file != null) {
      File[] arrayOfFile = file.listFiles();
      if (arrayOfFile != null) {
        boolean bool;
        if (arrayOfFile.length >= 5000) {
          bool = true;
        } else {
          bool = false;
        } 
        ArrayList<cd1> arrayList = new ArrayList(arrayOfFile.length);
        String str2 = this.b.toString();
        String str1 = str2;
        if (bool) {
          str1 = str2;
          if (paramq01 != null)
            str1 = paramq01.a(str2); 
        } 
        int i = arrayOfFile.length;
        while (b < i) {
          cd1 cd11 = new cd1(this, arrayOfFile[b], null, str1);
          if (bool && paramq01 != null) {
            d61 d61 = cd11.b;
            d61.b = paramq01.a(d61.b);
          } 
          arrayList.add(cd11);
          b++;
        } 
        return arrayList;
      } 
    } 
    return new ArrayList(0);
  }
  
  public final boolean E() {
    try {
      return this.e.mkdirs();
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final String H() {
    File file = this.e;
    return (file != null) ? file.getAbsolutePath() : null;
  }
  
  public final boolean a() {
    try {
      return this.e.canRead();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final boolean b() {
    try {
      return this.e.canWrite();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final u00 c(String paramString) {
    if (this.e != null) {
      File file = new File(this.e, paramString);
      if (file.isDirectory() || file.mkdir()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append("/");
        stringBuilder.append(paramString);
        return new cd1(this, file, stringBuilder.toString(), null);
      } 
    } 
    return null;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    String str;
    if (this.e == null)
      return null; 
    if (paramString1 != null) {
      str = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString1);
    } else {
      str = null;
    } 
    paramString1 = paramString2;
    if (str != null)
      paramString1 = x41.l(paramString2, ".", str); 
    File file = new File(this.e, paramString1);
    try {
      file.createNewFile();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(this.b.toString());
      stringBuilder.append("/");
      stringBuilder.append(paramString1);
      return new cd1(null, file, stringBuilder.toString(), null);
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder("Failed to createFile: ");
      stringBuilder.append(iOException);
      Log.w("DocumentFile", stringBuilder.toString());
      return null;
    } 
  }
  
  public final boolean e() {
    try {
      if (G(this.e))
        return this.e.delete(); 
    } finally {
      Exception exception;
    } 
    return false;
  }
  
  public final boolean f() {
    try {
      return this.e.exists();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final String h() {
    try {
      return this.e.getName();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final u00 i() {
    u00 u00 = this.a;
    if (u00 != null)
      return u00; 
    File file = this.e.getParentFile();
    if (file != null) {
      String str2;
      String str1 = this.b.toString();
      if (str1 != null) {
        int i = str1.lastIndexOf('/');
        if (i >= 0) {
          str1 = str1.substring(0, i);
        } else {
          str1 = null;
        } 
        str2 = str1;
        if ("Storage".equals(str1))
          return null; 
      } else {
        str2 = null;
      } 
      return new cd1(null, file, str2, null);
    } 
    return null;
  }
  
  public final Uri j() {
    File file = this.e;
    return (file != null) ? Uri.fromFile(file) : Uri.parse("null://r");
  }
  
  public final boolean k() {
    try {
      return this.e.isDirectory();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final boolean l() {
    try {
      return this.e.isFile();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final long m() {
    try {
      return this.e.lastModified();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final long n() {
    try {
      return this.e.length();
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean o(String paramString) {
    if (this.e == null)
      return false; 
    File file = new File(this.e.getParentFile(), paramString);
    paramString = ml0.c(this.b.toString());
    if (this.e.renameTo(file)) {
      this.e = file;
      if (paramString == null)
        paramString = "~"; 
      F(paramString, file.getName());
      return true;
    } 
    return false;
  }
  
  public final boolean p() {
    try {
      File file = this.e.getParentFile();
      if (file != null && !file.exists())
        file.mkdirs(); 
      return this.e.createNewFile();
    } catch (IOException iOException) {
      iOException.printStackTrace();
      return false;
    } 
  }
  
  public final long u() {
    try {
      long l2 = this.e.getUsableSpace();
      StatFs statFs = new StatFs();
      return (l1 > 0L) ? l1 : l2;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final String v() {
    return h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */