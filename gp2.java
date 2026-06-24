import android.os.Build;
import android.util.Log;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class gp2 {
  public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
  
  public final pz0 a;
  
  public gp2(pz0 parampz0) {
    this.a = parampz0;
  }
  
  public static void b(qf2 paramqf2, ao2 paramao2) {
    try {
      ZipFile zipFile = new ZipFile();
      this(paramqf2.a);
      try {
        String str = paramqf2.b;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        this();
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        while (true) {
          boolean bool = enumeration.hasMoreElements();
          if (bool) {
            ZipEntry zipEntry = enumeration.nextElement();
            String str1 = zipEntry.getName();
            Matcher matcher = b.matcher(str1);
            if (matcher.matches()) {
              String str2 = matcher.group(1);
              String str3 = matcher.group(2);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("NativeLibraryExtractor: split '");
              stringBuilder.append(str);
              stringBuilder.append("' has native library '");
              stringBuilder.append(str3);
              stringBuilder.append("' for ABI '");
              stringBuilder.append(str2);
              stringBuilder.append("'");
              Log.d("SplitCompat", stringBuilder.toString());
              Set<xo2> set2 = (Set)hashMap.get(str2);
              Set<xo2> set1 = set2;
              if (set2 == null) {
                set1 = new HashSet();
                super();
                hashMap.put(str2, set1);
              } 
              xo2 xo2 = new xo2();
              this(zipEntry, str3);
              set1.add(xo2);
            } 
            continue;
          } 
          HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
          this();
          for (String str1 : Build.SUPPORTED_ABIS) {
            if (hashMap.containsKey(str1)) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("NativeLibraryExtractor: there are native libraries for supported ABI ");
              stringBuilder.append(str1);
              stringBuilder.append("; will use this ABI");
              Log.d("SplitCompat", stringBuilder.toString());
              for (xo2 xo2 : hashMap.get(str1)) {
                str = xo2.a;
                bool = hashMap1.containsKey(str);
                if (bool) {
                  stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("NativeLibraryExtractor: skipping library ");
                  stringBuilder1.append(str);
                  stringBuilder1.append(" for ABI ");
                  stringBuilder1.append(str1);
                  stringBuilder1.append("; already present for a better ABI");
                  Log.d("SplitCompat", stringBuilder1.toString());
                  continue;
                } 
                hashMap1.put(str, stringBuilder1);
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("NativeLibraryExtractor: using library ");
                stringBuilder1.append(str);
                stringBuilder1.append(" for ABI ");
                stringBuilder1.append(str1);
                Log.d("SplitCompat", stringBuilder1.toString());
              } 
            } else {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("NativeLibraryExtractor: there are no native libraries for supported ABI ");
              stringBuilder.append(str1);
              Log.d("SplitCompat", stringBuilder.toString());
            } 
          } 
          HashSet hashSet = new HashSet();
          this(hashMap1.values());
          paramao2.b(zipFile, hashSet);
          zipFile.close();
          return;
        } 
      } catch (IOException null) {
        ZipFile zipFile1 = zipFile;
      } 
    } catch (IOException iOException) {
      paramao2 = null;
    } 
    if (paramao2 != null)
      try {
        paramao2.close();
      } catch (IOException iOException1) {
        qz1.X(iOException, iOException1);
      }  
    throw iOException;
  }
  
  public final HashSet a() {
    Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
    pz0 pz01 = this.a;
    HashSet hashSet2 = pz01.e();
    ArrayList<String> arrayList = new ArrayList();
    File file = new File(pz01.k(), "native-libraries");
    pz0.i(file);
    File[] arrayOfFile = file.listFiles();
    if (arrayOfFile != null)
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++) {
        file = arrayOfFile[b1];
        if (file.isDirectory())
          arrayList.add(file.getName()); 
      }  
    int i = arrayList.size();
    byte b = 0;
    label44: while (b < i) {
      file = (File)arrayList.get(b);
      b++;
      String str = (String)file;
      Iterator iterator = hashSet2.iterator();
      while (iterator.hasNext()) {
        if (((qf2)iterator.next()).b.equals(str))
          continue label44; 
      } 
      StringBuilder stringBuilder = new StringBuilder("NativeLibraryExtractor: extracted split '");
      stringBuilder.append(str);
      stringBuilder.append("' has no corresponding split; deleting");
      Log.i("SplitCompat", stringBuilder.toString());
      File file2 = new File(pz01.k(), "native-libraries");
      pz0.i(file2);
      File file1 = pz0.h(file2, str);
      pz0.i(file1);
      pz0.g(file1);
    } 
    HashSet hashSet1 = new HashSet();
    for (qf2 qf2 : hashSet2) {
      HashSet hashSet = new HashSet();
      b(qf2, new zv0(this, hashSet, qf2));
      String str = qf2.b;
      HashSet<File> hashSet3 = new HashSet();
      File file1 = new File(pz01.k(), "native-libraries");
      pz0.i(file1);
      file1 = pz0.h(file1, str);
      pz0.i(file1);
      File[] arrayOfFile1 = file1.listFiles();
      if (arrayOfFile1 != null)
        for (b = 0; b < arrayOfFile1.length; b++) {
          file1 = arrayOfFile1[b];
          if (file1.isFile())
            hashSet3.add(file1); 
        }  
      for (File file2 : hashSet3) {
        if (!hashSet.contains(file2)) {
          String str2 = file2.getAbsolutePath();
          String str1 = qf2.a.getAbsolutePath();
          StringBuilder stringBuilder = new StringBuilder(eRUgfgGAccgka.geKtnmWHfyGCye);
          stringBuilder.append(str2);
          stringBuilder.append("' found in split '");
          stringBuilder.append(str);
          stringBuilder.append("' that is not in the split file '");
          stringBuilder.append(str1);
          stringBuilder.append("'; removing");
          Log.i("SplitCompat", stringBuilder.toString());
          File file4 = file2.getParentFile().getParentFile();
          File file3 = new File(pz01.k(), "native-libraries");
          pz0.i(file3);
          if (file4.equals(file3)) {
            pz0.g(file2);
            continue;
          } 
          tp.f("File to remove is not a native library");
          return null;
        } 
      } 
      hashSet1.addAll(hashSet);
    } 
    return hashSet1;
  }
  
  public final void c(qf2 paramqf2, HashSet paramHashSet, qo2 paramqo2) {
    for (xo2 xo2 : paramHashSet) {
      String str2 = paramqf2.b;
      String str1 = xo2.a;
      pz0 pz01 = this.a;
      pz01.getClass();
      File file3 = new File(pz01.k(), "native-libraries");
      pz0.i(file3);
      File file2 = pz0.h(file3, str2);
      pz0.i(file2);
      File file1 = pz0.h(file2, str1);
      boolean bool = file1.exists();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool) {
        bool1 = bool2;
        if (file1.length() == xo2.b.getSize()) {
          bool1 = bool2;
          if (!file1.canWrite())
            bool1 = true; 
        } 
      } 
      paramqo2.n(xo2, file1, bool1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */