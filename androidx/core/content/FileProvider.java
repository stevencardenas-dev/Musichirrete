package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.utils.SgV.zpEN;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l0;
import m60;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import org.xmlpull.v1.XmlPullParserException;
import x41;
import x70;

public class FileProvider extends ContentProvider {
  public static final String[] g = new String[] { "_display_name", "_size" };
  
  public static final File h = new File("/");
  
  public static final HashMap i = new HashMap<Object, Object>();
  
  public final Object b = new Object();
  
  public final int c;
  
  public String e;
  
  public x70 f;
  
  public FileProvider() {
    this(0);
  }
  
  public FileProvider(int paramInt) {
    this.c = paramInt;
  }
  
  public static String a(String paramString) {
    String str = paramString;
    if (paramString.length() > 0) {
      str = paramString;
      if (paramString.charAt(paramString.length() - 1) == '/')
        str = paramString.substring(0, paramString.length() - 1); 
    } 
    return str;
  }
  
  public static x70 c(int paramInt, Context paramContext, String paramString) {
    x70 x701;
    HashMap<String, x70> hashMap = i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
    try {
      x70 x702 = (x70)hashMap.get(paramString);
      x701 = x702;
      if (x702 == null)
        try {
          x701 = e(paramInt, paramContext, paramString);
          hashMap.put(paramString, x701);
        } catch (IOException iOException) {
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException);
          throw illegalArgumentException;
        } catch (XmlPullParserException xmlPullParserException) {
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)xmlPullParserException);
          throw illegalArgumentException;
        }  
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{x70}]>}, name=null} */
    return x701;
  }
  
  public static Uri d(Context paramContext, String paramString, File paramFile) {
    StringBuilder stringBuilder;
    x70 x701 = c(0, paramContext, paramString);
    try {
      Map.Entry entry;
      String str = paramFile.getCanonicalPath();
      Iterator<Map.Entry> iterator = x701.b.entrySet().iterator();
      paramContext = null;
      while (iterator.hasNext()) {
        Map.Entry entry1 = iterator.next();
        String str1 = ((File)entry1.getValue()).getPath();
        if (a(str).startsWith(a(str1).concat("/")) && (paramContext == null || str1.length() > ((File)paramContext.getValue()).getPath().length()))
          entry = entry1; 
      } 
      if (entry != null) {
        paramString = ((File)entry.getValue()).getPath();
        if (paramString.endsWith("/")) {
          paramString = str.substring(paramString.length());
        } else {
          paramString = str.substring(paramString.length() + 1);
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append(Uri.encode((String)entry.getKey()));
        stringBuilder.append('/');
        stringBuilder.append(Uri.encode(paramString, "/"));
        String str1 = stringBuilder.toString();
        return (new Uri.Builder()).scheme("content").authority(x701.a).encodedPath(str1).build();
      } 
      l0.l(x41.k("Failed to find configured root that contains ", str));
      return null;
    } catch (IOException iOException) {
      m60.k("Failed to resolve canonical path for ", stringBuilder);
      return null;
    } 
  }
  
  public static x70 e(int paramInt, Context paramContext, String paramString) {
    File file;
    x70 x701 = new x70(paramString);
    ProviderInfo providerInfo = paramContext.getPackageManager().resolveContentProvider(paramString, 128);
    if (providerInfo != null) {
      Bundle bundle;
      if (providerInfo.metaData == null && paramInt != 0) {
        bundle = new Bundle(1);
        providerInfo.metaData = bundle;
        bundle.putInt("android.support.FILE_PROVIDER_PATHS", paramInt);
      } 
      XmlResourceParser xmlResourceParser = providerInfo.loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
      if (xmlResourceParser != null)
        while (true) {
          paramInt = xmlResourceParser.next();
          if (paramInt != 1) {
            if (paramInt == 2) {
              String str1 = xmlResourceParser.getName();
              String str3 = xmlResourceParser.getAttributeValue(null, "name");
              String str2 = xmlResourceParser.getAttributeValue(null, "path");
              if ("root-path".equals(str1)) {
                file = h;
                continue;
              } 
              if ("files-path".equals(file)) {
                file = iOException.getFilesDir();
                continue;
              } 
              if ("cache-path".equals(file)) {
                file = iOException.getCacheDir();
                continue;
              } 
              if (IGBYXeDFmKYajx.fmspgBjBsqjzLVM.equals(file)) {
                file = Environment.getExternalStorageDirectory();
                continue;
              } 
              if ("external-files-path".equals(file)) {
                File[] arrayOfFile = iOException.getExternalFilesDirs(null);
                if (arrayOfFile.length > 0) {
                  file = arrayOfFile[0];
                  continue;
                } 
              } else {
                File file1;
                if ("external-cache-path".equals(file)) {
                  File[] arrayOfFile = iOException.getExternalCacheDirs();
                  if (arrayOfFile.length > 0) {
                    file1 = arrayOfFile[0];
                    continue;
                  } 
                } else if (zpEN.HyvyqgTtj.equals(file1)) {
                  File[] arrayOfFile = iOException.getExternalMediaDirs();
                  if (arrayOfFile.length > 0) {
                    File file2 = arrayOfFile[0];
                    continue;
                  } 
                } 
              } 
              file = null;
              continue;
            } 
            continue;
          } 
          return x701;
          if (bundle != null) {
            File file1;
            (new String[1])[0] = (String)providerInfo;
            String str = (new String[1])[0];
            Bundle bundle1 = bundle;
            if (str != null)
              file1 = new File((File)bundle, str); 
            if (!TextUtils.isEmpty((CharSequence)SYNTHETIC_LOCAL_VARIABLE_6)) {
              try {
                file = file1.getCanonicalFile();
                x701.b.put(SYNTHETIC_LOCAL_VARIABLE_6, file);
              } catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder("Failed to resolve canonical path for ");
                stringBuilder.append(file1);
                throw new IllegalArgumentException(stringBuilder.toString(), iOException);
              } 
              continue;
            } 
            l0.l("Name must not be empty");
            return null;
          } 
        }  
      l0.l("Missing android.support.FILE_PROVIDER_PATHS meta-data");
      return null;
    } 
    l0.l(x41.k(VDgS.Vdwl, (String)file));
    return null;
  }
  
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    super.attachInfo(paramContext, paramProviderInfo);
    if (!paramProviderInfo.exported) {
      if (paramProviderInfo.grantUriPermissions) {
        String str = paramProviderInfo.authority;
        if (str != null && !str.trim().isEmpty()) {
          str = paramProviderInfo.authority.split(";")[0];
          synchronized (this.b) {
            this.e = str;
            synchronized (i) {
              null.remove(str);
              return;
            } 
          } 
        } 
        throw new SecurityException("Provider must have a non-empty authority");
      } 
      throw new SecurityException("Provider must grant uri permissions");
    } 
    throw new SecurityException("Provider must not be exported");
  }
  
  public final x70 b() {
    Object object = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      String str2 = this.e;
      String str1 = fXMDNeMWaILNVh.QOcPJhyylqEmRY;
      if (str2 != null) {
        if (this.f == null) {
          Context context = getContext();
          str2 = this.e;
          this.f = c(this.c, context, str2);
        } 
        x70 x701 = this.f;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return x701;
      } 
    } finally {}
    NullPointerException nullPointerException = new NullPointerException();
    this((String)exception);
    Exception exception;
    throw nullPointerException;
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return b().a(paramUri).delete();
  }
  
  public final String getType(Uri paramUri) {
    File file = b().a(paramUri);
    int i = file.getName().lastIndexOf('.');
    if (i >= 0) {
      String str = file.getName().substring(i + 1);
      str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
      if (str != null)
        return str; 
    } 
    return "application/octet-stream";
  }
  
  public final String getTypeAnonymous(Uri paramUri) {
    return "application/octet-stream";
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues) {
    throw new UnsupportedOperationException("No external inserts");
  }
  
  public final boolean onCreate() {
    return true;
  }
  
  public final ParcelFileDescriptor openFile(Uri paramUri, String paramString) {
    int i;
    File file = b().a(paramUri);
    if ("r".equals(paramString)) {
      i = 268435456;
    } else {
      if ("w".equals(paramString) || "wt".equals(paramString)) {
        i = 738197504;
        return ParcelFileDescriptor.open(file, i);
      } 
      if ("wa".equals(paramString)) {
        i = 704643072;
      } else if ("rw".equals(paramString)) {
        i = 939524096;
      } else if ("rwt".equals(paramString)) {
        i = 1006632960;
      } else {
        l0.l(x41.k("Invalid mode: ", paramString));
        return null;
      } 
    } 
    return ParcelFileDescriptor.open(file, i);
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    Object object;
    int i;
    File file = b().a(paramUri);
    paramString1 = paramUri.getQueryParameter("displayName");
    String[] arrayOfString1 = paramArrayOfString1;
    if (paramArrayOfString1 == null)
      arrayOfString1 = g; 
    String[] arrayOfString2 = new String[arrayOfString1.length];
    Object[] arrayOfObject2 = new Object[arrayOfString1.length];
    int j = arrayOfString1.length;
    byte b = 0;
    boolean bool = false;
    while (b < j) {
      String str1 = arrayOfString1[b];
      String str2 = DJqHMztxflt.YTZKyssUAAFBPQT;
      if (str2.equals(str1)) {
        arrayOfString2[object] = str2;
        int m = object + 1;
        if (paramString1 == null) {
          str1 = file.getName();
        } else {
          str1 = paramString1;
        } 
        arrayOfObject2[object] = str1;
        i = m;
      } else {
        int m = i;
        if ("_size".equals(str1)) {
          arrayOfString2[i] = "_size";
          m = i + 1;
          arrayOfObject2[i] = Long.valueOf(file.length());
          i = m;
        } else {
          continue;
        } 
      } 
      int k = i;
      continue;
      b++;
      object = SYNTHETIC_LOCAL_VARIABLE_8;
    } 
    paramArrayOfString1 = new String[i];
    System.arraycopy(arrayOfString2, 0, paramArrayOfString1, 0, i);
    Object[] arrayOfObject1 = new Object[i];
    System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, i);
    MatrixCursor matrixCursor = new MatrixCursor(paramArrayOfString1, 1);
    matrixCursor.addRow(arrayOfObject1);
    return (Cursor)matrixCursor;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    throw new UnsupportedOperationException("No external updates");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\content\FileProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */