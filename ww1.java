import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.system.StructStatVfs;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.ArrayList;

public final class ww1 extends v00 {
  public final Context e;
  
  public wo f;
  
  public String g;
  
  public String h;
  
  public long i;
  
  public boolean j;
  
  public ww1(ww1 paramww1, Context paramContext, Uri paramUri, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong) {
    super(paramww1);
    this.e = paramContext;
    this.f = new wo(paramUri.toString(), null);
    this.g = paramString3;
    this.h = paramString4;
    this.i = paramLong;
    if (paramString1 != null) {
      this.b = new d61(paramString1, null);
      return;
    } 
    F(paramString2, h());
  }
  
  public static void G(Cursor paramCursor) {
    if (paramCursor != null)
      try {
        x41.s(paramCursor);
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {} 
  }
  
  public static long I(Context paramContext, Uri paramUri) {
    StructStatVfs structStatVfs1;
    StructStatVfs structStatVfs2 = null;
    null = null;
    try {
      ParcelFileDescriptor parcelFileDescriptor = paramContext.getContentResolver().openFileDescriptor(paramUri, "r");
    } finally {
      null = null;
      paramUri = null;
    } 
    try {
      null.printStackTrace();
      return -1L;
    } finally {
      if (structStatVfs1 != null)
        try {
          paramUri.close();
        } finally {} 
    } 
  }
  
  public final v00 A(String paramString) {
    try {
      if ("".equals(paramString))
        return this; 
      String str2 = this.f.toString();
      int i = str2.lastIndexOf('/') + 1;
      String str1 = Uri.decode(str2.substring(i));
      boolean bool = str1.endsWith(":");
      if (bool) {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(str1);
        stringBuilder1.append(paramString);
        str1 = stringBuilder1.toString();
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(str1);
        stringBuilder1.append("/");
        stringBuilder1.append(paramString);
        str1 = stringBuilder1.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(str2.substring(0, i));
      stringBuilder.append(Uri.encode(str1));
      str2 = stringBuilder.toString();
      Context context = this.e;
      Uri uri = Uri.parse(str2);
      stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(this.b.toString());
      stringBuilder.append("/");
      stringBuilder.append(paramString);
      return new ww1(null, context, uri, stringBuilder.toString(), null, null, null, -1L);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public final boolean C(v00 paramv00) {
    if (Build.VERSION.SDK_INT >= 29)
      try {
        return DocumentsContract.isChildDocument(this.e.getContentResolver(), paramv00.j(), j());
      } finally {
        Exception exception;
      }  
    return super.C(paramv00);
  }
  
  public final ArrayList D(q01 paramq01) {
    ContentResolver contentResolver = this.e.getContentResolver();
    Uri uri2 = j();
    Uri uri1 = DocumentsContract.buildChildDocumentsUriUsingTree(uri2, DocumentsContract.getDocumentId(uri2));
    ArrayList<ww1> arrayList = null;
    String str = null;
    try {
      Cursor cursor = contentResolver.query(uri1, new String[] { "document_id", "_display_name", "mime_type", "last_modified" }, null, null, null);
    } catch (Exception exception) {
    
    } finally {
      String str1 = str;
      G((Cursor)str1);
    } 
    return new ArrayList(0);
  }
  
  public final boolean E() {
    if (!k()) {
      v00 v001 = (v00)i();
      if (v001 != null && (v001.k() || v001.E()) && v001.c(h()) != null)
        return true; 
    } 
    return false;
  }
  
  public final boolean H() {
    try {
      ArrayList<Object> arrayList = D(null);
      int j = arrayList.size();
      boolean bool = true;
      int i = 0;
      return bool;
    } finally {
      Exception exception = null;
    } 
  }
  
  public final Uri J() {
    Uri uri = j();
    return DocumentsContract.buildTreeDocumentUri(uri.getAuthority(), DocumentsContract.getTreeDocumentId(uri));
  }
  
  public final String K() {
    if (this.h == null) {
      Cursor cursor2;
      ContentResolver contentResolver = this.e.getContentResolver();
      null = null;
      Cursor cursor1 = null;
      try {
        Cursor cursor = contentResolver.query(j(), new String[] { "mime_type" }, null, null, null);
        cursor1 = cursor;
        cursor2 = cursor;
        null = cursor;
      } catch (Exception exception) {
      
      } finally {
        G(cursor1);
      } 
      G(cursor2);
    } 
    return this.h;
  }
  
  public final boolean a() {
    return (this.i != -1L && this.b.toString().startsWith("Storage/")) ? true : (TextUtils.isEmpty(K()) ^ true);
  }
  
  public final boolean b() {
    long l1;
    String str = K();
    boolean bool = TextUtils.isEmpty(str);
    boolean bool1 = false;
    if (bool)
      return false; 
    ContentResolver contentResolver = n21.f.getContentResolver();
    long l2 = 0L;
    Cursor cursor1 = null;
    Cursor cursor2 = null;
    try {
      Cursor cursor3 = contentResolver.query(j(), new String[] { "flags" }, null, null, null);
      Cursor cursor4 = cursor3;
      l1 = l2;
      cursor2 = cursor3;
      cursor1 = cursor3;
      if (cursor3.moveToFirst()) {
        cursor4 = cursor3;
        l1 = l2;
        cursor2 = cursor3;
        cursor1 = cursor3;
        if (!cursor3.isNull(0)) {
          cursor2 = cursor3;
          cursor1 = cursor3;
          l1 = cursor3.getLong(0);
          cursor4 = cursor3;
        } 
      } 
      G(cursor4);
    } catch (Exception exception) {
      cursor2 = cursor1;
      StringBuilder stringBuilder = new StringBuilder();
      cursor2 = cursor1;
      this("Failed query: ");
      cursor2 = cursor1;
      stringBuilder.append(exception);
      cursor2 = cursor1;
      Log.w("DocumentFile", stringBuilder.toString());
      Cursor cursor = cursor1;
      l1 = l2;
      G(cursor);
    } finally {}
    int i = (int)l1;
    if ((i & 0x4) != 0 || ("vnd.android.document/directory".equals(str) && (i & 0x8) != 0))
      return true; 
    bool = bool1;
    if (!TextUtils.isEmpty(str)) {
      bool = bool1;
      if ((i & 0x2) != 0)
        return true; 
    } 
    return bool;
  }
  
  public final u00 c(String paramString) {
    Context context = this.e;
    Uri uri = j();
    try {
      Uri uri1 = DocumentsContract.createDocument(context.getContentResolver(), uri, "vnd.android.document/directory", paramString);
    } catch (Exception exception) {
      exception = null;
    } 
    if (exception != null) {
      String str = this.b.toString();
      return new ww1(null, this.e, (Uri)exception, null, str, null, "vnd.android.document/directory", -1L);
    } 
    return null;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    Context context = this.e;
    Uri uri = j();
    try {
      Uri uri1 = DocumentsContract.createDocument(context.getContentResolver(), uri, paramString1, paramString2);
    } catch (Exception exception) {
      exception = null;
    } 
    if (exception != null) {
      String str = this.b.toString();
      return new ww1(null, this.e, (Uri)exception, null, str, null, paramString1, -1L);
    } 
    return null;
  }
  
  public final boolean e() {
    if (H()) {
      this.j = false;
      try {
        return DocumentsContract.deleteDocument(this.e.getContentResolver(), j());
      } finally {
        Exception exception = null;
      } 
    } 
    return false;
  }
  
  public final boolean f() {
    return this.j ? true : g92.B(this.e, j());
  }
  
  public final String h() {
    if (this.g == null) {
      String str = this.b.toString();
      if (str != null && (str.startsWith("Storage/") || str.startsWith("~/")))
        this.g = ml0.b(str); 
      if (this.g == null) {
        Cursor cursor2;
        ContentResolver contentResolver = this.e.getContentResolver();
        str = null;
        Cursor cursor1 = null;
        try {
          Cursor cursor = contentResolver.query(j(), new String[] { "_display_name" }, null, null, null);
          cursor1 = cursor;
          cursor2 = cursor;
          null = cursor;
        } catch (Exception exception) {
        
        } finally {
          G(cursor1);
        } 
        G(cursor2);
      } 
    } 
    return this.g;
  }
  
  public final u00 i() {
    u00 u001 = this.a;
    if (u001 != null)
      return u001; 
    try {
      str3 = this.f.toString();
      Uri uri = Uri.parse(str3);
      if (DocumentsContract.getTreeDocumentId(uri).equals(uri.getLastPathSegment()))
        return null; 
      j = str3.lastIndexOf('/') + 1;
      String str = Uri.decode(str3.substring(j));
      i = str.lastIndexOf('/');
      if (i >= 0 && i < str.length() - 1) {
        str = str.substring(0, i);
      } else {
        i = -1;
      } 
    } finally {}
    u00 u002 = u001;
    if (i == -1) {
      String str;
      i = u001.lastIndexOf(':');
      if (i >= 0 && i < u001.length() - 1) {
        str = u001.substring(0, i + 1);
      } else {
        i = -1;
      } 
      str2 = str;
      if (i == -1)
        return null; 
    } 
    String str3 = str3.substring(0, j);
    StringBuilder stringBuilder = new StringBuilder();
    this();
    int i;
    int j;
    stringBuilder.append(str3);
    stringBuilder.append(Uri.encode(str2));
    str3 = stringBuilder.toString();
    String str1 = "~";
    String str4 = this.b.toString();
    String str2 = str1;
    if (str4 != null) {
      i = str4.lastIndexOf('/');
      if (i >= 0)
        str1 = str4.substring(0, i); 
      str2 = str1;
      if ("Storage".equals(str1))
        return null; 
    } 
    if (this.j) {
      str1 = "vnd.android.document/directory";
    } else {
      str1 = null;
    } 
    ww1 ww11 = new ww1();
    this(null, this.e, Uri.parse(str3), str2, null, null, str1, -1L);
    ww11.j = this.j;
    return ww11;
  }
  
  public final Uri j() {
    return Uri.parse(this.f.toString());
  }
  
  public final boolean k() {
    FileDescriptor fileDescriptor;
    Exception exception;
    if (this.h == null) {
      FileDescriptor fileDescriptor1 = null;
      fileDescriptor = null;
      try {
        ParcelFileDescriptor parcelFileDescriptor = this.e.getContentResolver().openFileDescriptor(j(), "r");
        fileDescriptor = fileDescriptor1;
      } finally {
        exception = null;
      } 
    } else {
      return "vnd.android.document/directory".equals(K());
    } 
    if (fileDescriptor != null)
      try {
        exception.close();
      } finally {} 
    return false;
  }
  
  public final boolean l() {
    String str = K();
    return !("vnd.android.document/directory".equals(str) || TextUtils.isEmpty(str));
  }
  
  public final long m() {
    FileDescriptor fileDescriptor;
    Exception exception;
    long l = this.i;
    null = l;
    if (l == -1L) {
      FileDescriptor fileDescriptor1 = null;
      fileDescriptor = null;
      try {
        ParcelFileDescriptor parcelFileDescriptor = this.e.getContentResolver().openFileDescriptor(j(), "r");
        fileDescriptor = fileDescriptor1;
      } finally {
        exception = null;
      } 
    } else {
      return null;
    } 
    if (fileDescriptor != null)
      try {
        exception.close();
      } finally {} 
    return 0L;
  }
  
  public final long n() {
    Exception exception;
    Context context = this.e;
    Uri uri = j();
    FileDescriptor fileDescriptor2 = null;
    FileDescriptor fileDescriptor1 = null;
    try {
      ParcelFileDescriptor parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
      fileDescriptor1 = fileDescriptor2;
    } finally {
      exception = null;
    } 
    if (fileDescriptor1 != null)
      try {
        exception.close();
      } finally {} 
    return g92.V(context, uri, "_size", 0L);
  }
  
  public final boolean o(String paramString) {
    try {
      Uri uri = DocumentsContract.renameDocument(this.e.getContentResolver(), j(), paramString);
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public final boolean p() {
    try {
      if (!f()) {
        u00 u00 = i();
        if (u00 != null && (u00.k() || ((ww1)u00).E())) {
          u00 = u00.d(K(), h());
          if (u00 != null)
            return true; 
        } 
      } 
    } finally {
      Exception exception;
    } 
    return false;
  }
  
  public final long u() {
    return I(this.e, j());
  }
  
  public final String v() {
    String str1 = h();
    String str2 = str1;
    if (str1 == null) {
      str2 = j().toString();
      String str = Uri.decode(str2.substring(str2.lastIndexOf('/') + 1));
      int i = str.lastIndexOf('/');
      if (i >= 0 && i < str.length() - 1) {
        str1 = str.substring(i + 1);
      } else {
        i = -1;
      } 
      str2 = str1;
      if (i == -1) {
        i = str.lastIndexOf(':');
        str2 = str1;
        if (i >= 0) {
          str2 = str1;
          if (i < str.length() - 1)
            return str.substring(0, i + 1); 
        } 
      } 
    } 
    return str2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ww1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */