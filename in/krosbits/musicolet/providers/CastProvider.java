package in.krosbits.musicolet.providers;

import ag0;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import p3;
import u00;
import v00;
import ws2;

public class CastProvider extends ContentProvider {
  public static v00 b;
  
  public static String c;
  
  public static ArrayList e;
  
  public static boolean f;
  
  public static ArrayList a(String paramString, v00 paramv00, boolean paramBoolean) {
    ArrayList<Object> arrayList = e;
    byte b = 0;
    if (arrayList != null) {
      int i = arrayList.size();
      byte b1 = 0;
      while (b1 < i) {
        String str = (String)arrayList.get(b1);
        b1++;
        str = str;
        MyApplication.i.getApplicationContext().revokeUriPermission(Uri.parse(str), 1);
      } 
      e = null;
    } 
    c = paramString;
    b = paramv00;
    f = paramBoolean;
    if (paramString != null) {
      ArrayList<String> arrayList1 = new ArrayList();
      arrayList1.add("content://in.krosbits.musicolet.providers.CastProvider/f/".concat(paramString));
      arrayList1.add("content://in.krosbits.musicolet.providers.CastProvider/a/".concat(paramString));
      e = arrayList1;
      int i = arrayList1.size();
      byte b1 = b;
      while (b1 < i) {
        paramString = arrayList1.get(b1);
        b1++;
        paramString = paramString;
        MyApplication.i.getApplicationContext().grantUriPermission("in.krosbits.castplugin", Uri.parse(paramString), 1);
      } 
      return arrayList1;
    } 
    return null;
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return 0;
  }
  
  public final String getType(Uri paramUri) {
    try {
      if ("f".equals(paramUri.getPathSegments().get(0))) {
        String str = ag0.C(b.v());
        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (str != null)
          return str; 
      } 
    } finally {
      paramUri = null;
    } 
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return null;
  }
  
  public final boolean onCreate() {
    return true;
  }
  
  public final ParcelFileDescriptor openFile(Uri paramUri, String paramString) {
    String str = c;
    if (str != null && str.equals(paramUri.getLastPathSegment())) {
      str = paramUri.getPathSegments().get(0);
      if ("f".equals(str) && f)
        return ws2.J((u00)b, "r"); 
      if ("a".equals(str)) {
        MyApplication.i.getApplicationContext();
        return p3.i(b, 2131230842, false);
      } 
    } 
    return super.openFile(paramUri, paramString);
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    if ("in.krosbits.musicolet.providers.CastProvider".equals(paramUri.getAuthority()))
      try {
        boolean bool;
        String str = c;
        if (str != null && str.equals(paramUri.getLastPathSegment())) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          MatrixCursor matrixCursor;
          str = paramUri.getPathSegments().get(0);
          boolean bool1 = "f".equals(str);
          if (bool1 && f) {
            matrixCursor = new MatrixCursor();
            this(new String[] { "_display_name", "_size", "type" }, 1);
            matrixCursor.addRow(new Object[] { b.v(), Long.valueOf(b.n()), getType(paramUri) });
            return (Cursor)matrixCursor;
          } 
          if ("a".equals(matrixCursor)) {
            MatrixCursor matrixCursor1 = new MatrixCursor();
            this(new String[] { "_display_name", "_size", "type" }, 1);
            matrixCursor1.addRow(new Object[] { "a", null, "application/octet" });
            return (Cursor)matrixCursor1;
          } 
        } 
      } finally {} 
    return null;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\providers\CastProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */