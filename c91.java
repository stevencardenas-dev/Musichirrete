import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;

public final class c91 extends u00 {
  public final int b;
  
  public Context c;
  
  public Uri d;
  
  public c91(Context paramContext, Uri paramUri) {
    super(null);
    this.c = paramContext;
    this.d = paramUri;
  }
  
  public c91(c91 paramc91, Context paramContext, Uri paramUri) {
    super(paramc91);
    this.c = paramContext;
    this.d = paramUri;
  }
  
  public static void p(Cursor paramCursor) {
    if (paramCursor != null) {
      try {
        paramCursor.close();
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {}
      return;
    } 
  }
  
  public static long q(Context paramContext, Uri paramUri, String paramString, long paramLong) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    Cursor cursor = null;
    paramContext = null;
    try {
      Cursor cursor2 = contentResolver.query(paramUri, new String[] { paramString }, null, null, null);
      Cursor cursor1 = cursor2;
      cursor = cursor2;
      if (cursor2.moveToFirst()) {
        cursor1 = cursor2;
        cursor = cursor2;
        if (!cursor2.isNull(0)) {
          cursor1 = cursor2;
          cursor = cursor2;
          return cursor2.getLong(0);
        } 
      } 
      return paramLong;
    } catch (Exception exception) {
      return paramLong;
    } finally {
      p((Cursor)exception);
    } 
  }
  
  public static String r(Context paramContext, Uri paramUri, String paramString) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      Cursor cursor = contentResolver.query(paramUri, new String[] { paramString }, null, null, null);
    } finally {
      contentResolver = null;
    } 
    p((Cursor)contentResolver);
    return null;
  }
  
  public final boolean a() {
    Context context;
    Uri uri;
    int i = this.b;
    boolean bool3 = true;
    boolean bool2 = true;
    boolean bool1 = true;
    switch (i) {
      default:
        context = this.c;
        uri = this.d;
        if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(g92.W(context, uri, "mime_type")))
          bool1 = false; 
        return bool1;
      case 1:
        context = this.c;
        uri = this.d;
        if (context.checkCallingOrSelfUriPermission(uri, 1) != 0)
          return false; 
        bool1 = bool3;
        return TextUtils.isEmpty(g92.W(context, uri, "mime_type")) ? false : bool1;
      case 0:
        break;
    } 
    if (this.c.checkCallingOrSelfUriPermission(this.d, 1) == 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    return bool1;
  }
  
  public final boolean b() {
    switch (this.b) {
      default:
        return g92.i(this.c, this.d);
      case 1:
        return g92.i(this.c, this.d);
      case 0:
        break;
    } 
    Context context = this.c;
    Uri uri = this.d;
    if (context.checkCallingOrSelfUriPermission(uri, 2) == 0) {
      String str = r(context, uri, "mime_type");
      int i = (int)q(context, uri, "flags", 0L);
      if (!TextUtils.isEmpty(str) && ((i & 0x4) != 0 || ("vnd.android.document/directory".equals(str) && (i & 0x8) != 0) || (!TextUtils.isEmpty(str) && (i & 0x2) != 0)))
        return true; 
    } 
    return false;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    c91 c911;
    String str;
    Context context;
    Uri uri;
    switch (this.b) {
      default:
        context = this.c;
        uri = this.d;
        str = null;
        try {
          Uri uri1 = DocumentsContract.createDocument(context.getContentResolver(), uri, paramString1, paramString2);
        } catch (Exception exception) {
          exception = null;
        } 
        paramString2 = str;
        if (exception != null)
          c911 = new c91(this, context, (Uri)exception); 
        return c911;
      case 1:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final boolean e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: iconst_0
    //   11: istore_2
    //   12: iload_1
    //   13: tableswitch default -> 36, 0 -> 72, 1 -> 55
    //   36: aload_0
    //   37: getfield c : Landroid/content/Context;
    //   40: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   43: aload_0
    //   44: getfield d : Landroid/net/Uri;
    //   47: invokestatic deleteDocument : (Landroid/content/ContentResolver;Landroid/net/Uri;)Z
    //   50: istore_3
    //   51: iload_3
    //   52: istore_2
    //   53: iload_2
    //   54: ireturn
    //   55: aload_0
    //   56: getfield c : Landroid/content/Context;
    //   59: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   62: aload_0
    //   63: getfield d : Landroid/net/Uri;
    //   66: invokestatic deleteDocument : (Landroid/content/ContentResolver;Landroid/net/Uri;)Z
    //   69: istore_2
    //   70: iload_2
    //   71: ireturn
    //   72: iload #4
    //   74: istore_2
    //   75: aload_0
    //   76: getfield c : Landroid/content/Context;
    //   79: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   82: aload_0
    //   83: getfield d : Landroid/net/Uri;
    //   86: aconst_null
    //   87: aconst_null
    //   88: invokevirtual delete : (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   91: ifle -> 96
    //   94: iconst_1
    //   95: istore_2
    //   96: iload_2
    //   97: ireturn
    //   98: astore #5
    //   100: goto -> 53
    //   103: astore #5
    //   105: iload_3
    //   106: istore_2
    //   107: goto -> 70
    // Exception table:
    //   from	to	target	type
    //   36	51	98	java/lang/Exception
    //   55	70	103	java/lang/Exception
  }
  
  public final boolean f() {
    switch (this.b) {
      default:
        return g92.B(this.c, this.d);
      case 1:
        return g92.B(this.c, this.d);
      case 0:
        break;
    } 
    ContentResolver contentResolver = this.c.getContentResolver();
    boolean bool = false;
    null = null;
    Cursor cursor = null;
    try {
      Cursor cursor1 = contentResolver.query(this.d, new String[] { "document_id" }, null, null, null);
      cursor = cursor1;
      null = cursor1;
      int i = cursor1.getCount();
      null = cursor1;
    } catch (Exception exception) {
    
    } finally {
      p(cursor);
    } 
    p((Cursor)SYNTHETIC_LOCAL_VARIABLE_3);
    return bool;
  }
  
  public final String h() {
    switch (this.b) {
      default:
        return g92.W(this.c, this.d, "_display_name");
      case 1:
        return g92.W(this.c, this.d, "_display_name");
      case 0:
        break;
    } 
    Context context = this.c;
    Uri uri = this.d;
    String str2 = r(context, uri, "_display_name");
    String str1 = str2;
    if (str2 == null) {
      str1 = uri.toString();
      str2 = Uri.decode(str1.substring(str1.lastIndexOf('/') + 1));
      int i = str2.lastIndexOf('/');
      if (i >= 0 && i < str2.length() - 1) {
        str1 = str2.substring(i + 1);
      } else {
        str1 = null;
        i = -1;
      } 
      if (i == -1) {
        i = str2.lastIndexOf(':');
        if (i >= 0 && i < str2.length() - 1)
          str1 = str2.substring(0, i + 1); 
      } 
    } 
    return str1;
  }
  
  public final Uri j() {
    switch (this.b) {
      default:
        return this.d;
      case 1:
        return this.d;
      case 0:
        break;
    } 
    return this.d;
  }
  
  public final boolean k() {
    int i = this.b;
    String str = FgdLmmRfTxSFKI.AxcUSRqHdVC;
    switch (i) {
      default:
        return "vnd.android.document/directory".equals(g92.W(this.c, this.d, str));
      case 1:
        return "vnd.android.document/directory".equals(g92.W(this.c, this.d, str));
      case 0:
        break;
    } 
    return "vnd.android.document/directory".equals(r(this.c, this.d, str));
  }
  
  public final boolean l() {
    boolean bool1;
    String str;
    int i = this.b;
    boolean bool2 = false;
    boolean bool3 = false;
    switch (i) {
      default:
        str = g92.W(this.c, this.d, "mime_type");
        bool1 = bool3;
        if (!"vnd.android.document/directory".equals(str))
          if (TextUtils.isEmpty(str)) {
            bool1 = bool3;
          } else {
            bool1 = true;
          }  
        return bool1;
      case 1:
        str = g92.W(this.c, this.d, "mime_type");
        bool1 = bool2;
        if (!"vnd.android.document/directory".equals(str))
          if (TextUtils.isEmpty(str)) {
            bool1 = bool2;
          } else {
            bool1 = true;
          }  
        return bool1;
      case 0:
        break;
    } 
    return "vnd.android.document/directory".equals(r(this.c, this.d, "mime_type")) ^ true;
  }
  
  public final long n() {
    switch (this.b) {
      default:
        return g92.V(this.c, this.d, "_size", 0L);
      case 1:
        return g92.V(this.c, this.d, "_size", 0L);
      case 0:
        break;
    } 
    return q(this.c, this.d, "_size", 0L);
  }
  
  public final boolean o(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 28, 0 -> 70, 1 -> 62
    //   28: aload_0
    //   29: getfield c : Landroid/content/Context;
    //   32: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   35: aload_0
    //   36: getfield d : Landroid/net/Uri;
    //   39: aload_1
    //   40: invokestatic renameDocument : (Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull -> 58
    //   48: aload_0
    //   49: aload_1
    //   50: putfield d : Landroid/net/Uri;
    //   53: iconst_1
    //   54: istore_2
    //   55: goto -> 60
    //   58: iconst_0
    //   59: istore_2
    //   60: iload_2
    //   61: ireturn
    //   62: new java/lang/UnsupportedOperationException
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: athrow
    //   70: new java/lang/UnsupportedOperationException
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: athrow
    //   78: astore_1
    //   79: goto -> 58
    // Exception table:
    //   from	to	target	type
    //   28	44	78	java/lang/Exception
    //   48	53	78	java/lang/Exception
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */