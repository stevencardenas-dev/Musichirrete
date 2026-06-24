import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class c92 implements eb1 {
  public final File a;
  
  public final String b;
  
  public final ClassLoader c;
  
  public final ConcurrentHashMap d;
  
  public final SortedSet e;
  
  public c92() {
    String str = "org/joda/time/tz/data".concat("/");
    this.a = null;
    this.b = str;
    this.c = c92.class.getClassLoader();
    ConcurrentHashMap concurrentHashMap = d(e("ZoneInfoMap"));
    this.d = concurrentHashMap;
    this.e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMap.keySet()));
  }
  
  public c92(File paramFile) {
    ConcurrentHashMap concurrentHashMap;
    if (paramFile.exists()) {
      if (paramFile.isDirectory()) {
        this.a = paramFile;
        this.b = null;
        this.c = null;
        concurrentHashMap = d(e("ZoneInfoMap"));
        this.d = concurrentHashMap;
        this.e = Collections.unmodifiableSortedSet(new TreeSet(concurrentHashMap.keySet()));
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder("File doesn't refer to a directory: ");
      stringBuilder1.append(concurrentHashMap);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder("File directory doesn't exist: ");
    stringBuilder.append(concurrentHashMap);
    throw new IOException(stringBuilder.toString());
  }
  
  public static ConcurrentHashMap d(InputStream paramInputStream) {
    null = new ConcurrentHashMap<Object, Object>();
    paramInputStream = new DataInputStream(paramInputStream);
    try {
      int i = paramInputStream.readUnsignedShort();
      String[] arrayOfString = new String[i];
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++)
        arrayOfString[b] = paramInputStream.readUTF().intern(); 
      i = paramInputStream.readUnsignedShort();
      b = bool;
      while (true) {
        if (b < i) {
          try {
            null.put(arrayOfString[paramInputStream.readUnsignedShort()], arrayOfString[paramInputStream.readUnsignedShort()]);
            b++;
            continue;
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            m60.i("Corrupt zone info map");
          } 
        } else {
          break;
        } 
        try {
          paramInputStream.close();
        } catch (IOException null) {}
      } 
    } finally {
      try {
        iOException.close();
      } catch (IOException iOException1) {}
    } 
  }
  
  public final hv a(String paramString) {
    Object object = this.d.get(paramString);
    if (object == null)
      return null; 
    if (object instanceof SoftReference) {
      object = ((SoftReference<hv>)object).get();
      return (hv)((object != null) ? object : c(paramString));
    } 
    return paramString.equals(object) ? c(paramString) : a((String)object);
  }
  
  public final Set b() {
    return this.e;
  }
  
  public final hv c(String paramString) {
    IOException iOException1;
    InputStream inputStream2;
    ConcurrentHashMap<String, SoftReference> concurrentHashMap = this.d;
    hv hv = null;
    try {
      inputStream2 = e(paramString);
      InputStream inputStream = inputStream2;
    } catch (IOException iOException2) {
    
    } finally {
      Exception exception = null;
    } 
    InputStream inputStream1 = inputStream2;
    iOException2.printStackTrace();
    inputStream1 = inputStream2;
    concurrentHashMap.remove(iOException1);
    if (inputStream2 != null)
      try {
        inputStream2.close();
      } catch (IOException iOException) {} 
    return null;
  }
  
  public final InputStream e(String paramString) {
    StringBuilder stringBuilder;
    File file = this.a;
    if (file != null)
      return new FileInputStream(new File(file, paramString)); 
    paramString = this.b.concat(paramString);
    InputStream inputStream = AccessController.<InputStream>doPrivileged(new b92(this, paramString));
    if (inputStream == null) {
      String str;
      stringBuilder = new StringBuilder(40);
      stringBuilder.append("Resource not found: \"");
      stringBuilder.append(paramString);
      stringBuilder.append("\" ClassLoader: ");
      ClassLoader classLoader = this.c;
      if (classLoader != null) {
        str = classLoader.toString();
      } else {
        str = "system";
      } 
      stringBuilder.append(str);
      throw new IOException(stringBuilder.toString());
    } 
    return (InputStream)stringBuilder;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */