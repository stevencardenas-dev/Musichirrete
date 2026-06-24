import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public final class f71 extends v00 {
  public Uri e;
  
  public String f;
  
  public f71(Uri paramUri) {
    super(null);
    this.e = paramUri;
    this.b = new d61(v00.B(n21.f, paramUri), null);
  }
  
  public static void G(Cursor paramCursor) {
    if (paramCursor != null) {
      try {
        paramCursor.close();
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {}
      return;
    } 
  }
  
  public static long I(Uri paramUri, String paramString, long paramLong) {
    Cursor cursor2 = null;
    Cursor cursor1 = null;
    try {
      Cursor cursor = n21.f.getContentResolver().query(paramUri, new String[] { paramString }, null, null, null);
      cursor1 = cursor;
      cursor2 = cursor;
      if (cursor.moveToFirst()) {
        cursor1 = cursor;
        cursor2 = cursor;
        if (!cursor.isNull(0)) {
          cursor1 = cursor;
          cursor2 = cursor;
          return cursor.getLong(0);
        } 
      } 
      return paramLong;
    } catch (Exception exception) {
      return paramLong;
    } finally {
      G(cursor1);
    } 
  }
  
  public static String J(Uri paramUri, String paramString) {
    try {
      Cursor cursor = n21.f.getContentResolver().query(paramUri, new String[] { paramString }, null, null, null);
    } finally {
      paramUri = null;
    } 
    G((Cursor)paramUri);
    return null;
  }
  
  public final v00 A(String paramString) {
    return null;
  }
  
  public final ArrayList D(q01 paramq01) {
    return new ArrayList(0);
  }
  
  public final boolean E() {
    return false;
  }
  
  public final String H() {
    String str = J(this.e, "mime_type");
    if (str != null)
      return str; 
    str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h());
    return (str != null) ? str : "application/octet-stream";
  }
  
  public final boolean a() {
    return (n21.f.checkCallingOrSelfUriPermission(this.e, 1) == 0);
  }
  
  public final boolean b() {
    if (n21.f.checkCallingOrSelfUriPermission(this.e, 2) != 0)
      return false; 
    String str = H();
    int i = (int)I(this.e, KjdXPYm.sidJjy, 0L);
    return TextUtils.isEmpty(str) ? false : (((i & 0x4) != 0) ? true : ((FgdLmmRfTxSFKI.wZUabAarzSjDt.equals(str) && (i & 0x8) != 0) ? true : ((!TextUtils.isEmpty(str) && (i & 0x2) != 0))));
  }
  
  public final u00 c(String paramString) {
    return null;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    return null;
  }
  
  public final boolean e() {
    try {
      return DocumentsContract.deleteDocument(n21.f.getContentResolver(), this.e);
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    } 
  }
  
  public final boolean f() {
    boolean bool = false;
    null = null;
    Cursor cursor = null;
    try {
      Cursor cursor1 = n21.f.getContentResolver().query(this.e, new String[] { "document_id" }, null, null, null);
      cursor = cursor1;
      null = cursor1;
      int i = cursor1.getCount();
      if (i > 0)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      return false;
    } finally {
      G((Cursor)exception);
    } 
  }
  
  public final String h() {
    String str = this.f;
    if (str != null)
      return str; 
    str = J(this.e, "_display_name");
    if (str != null) {
      this.f = str;
      return str;
    } 
    return v();
  }
  
  public final Uri j() {
    return this.e;
  }
  
  public final boolean k() {
    return (f() && !"vnd.android.document/directory".equals(H()));
  }
  
  public final boolean l() {
    return (f() && !"vnd.android.document/directory".equals(H()));
  }
  
  public final long m() {
    return I(this.e, "last_modified", 0L);
  }
  
  public final long n() {
    return I(this.e, "_size", 0L);
  }
  
  public final boolean o(String paramString) {
    try {
      Uri uri = DocumentsContract.renameDocument(n21.f.getContentResolver(), this.e, paramString);
      if (uri != null) {
        this.e = uri;
        return true;
      } 
    } catch (FileNotFoundException fileNotFoundException) {}
    return false;
  }
  
  public final boolean p() {
    return false;
  }
  
  public final String v() {
    return ml0.b(this.b.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */