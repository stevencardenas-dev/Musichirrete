import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;

public final class or extends dg1 {
  public static final UriMatcher b;
  
  public final Context a;
  
  static {
    UriMatcher uriMatcher = new UriMatcher(-1);
    b = uriMatcher;
    uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
    uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
    uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
    uriMatcher.addURI("com.android.contacts", xveccWbRzqx.MEOSlJsskvnw, 3);
    uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
  }
  
  public or(Context paramContext) {
    this.a = paramContext;
  }
  
  public final boolean b(zf1 paramzf1) {
    Uri uri = paramzf1.b;
    return ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(uri) != -1);
  }
  
  public final m40 e(zf1 paramzf1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/content/Context;
    //   4: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   7: astore #4
    //   9: aload_1
    //   10: getfield b : Landroid/net/Uri;
    //   13: astore_3
    //   14: getstatic or.b : Landroid/content/UriMatcher;
    //   17: aload_3
    //   18: invokevirtual match : (Landroid/net/Uri;)I
    //   21: istore_2
    //   22: iload_2
    //   23: iconst_1
    //   24: if_icmpeq -> 65
    //   27: iload_2
    //   28: iconst_2
    //   29: if_icmpeq -> 55
    //   32: aload_3
    //   33: astore_1
    //   34: iload_2
    //   35: iconst_3
    //   36: if_icmpeq -> 83
    //   39: iload_2
    //   40: iconst_4
    //   41: if_icmpne -> 47
    //   44: goto -> 55
    //   47: ldc 'Invalid uri: '
    //   49: aload_3
    //   50: invokestatic o : (Ljava/lang/String;Ljava/lang/Object;)V
    //   53: aconst_null
    //   54: areturn
    //   55: aload #4
    //   57: aload_3
    //   58: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   61: astore_1
    //   62: goto -> 91
    //   65: aload #4
    //   67: aload_3
    //   68: invokestatic lookupContact : (Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/net/Uri;
    //   71: astore_3
    //   72: aload_3
    //   73: astore_1
    //   74: aload_3
    //   75: ifnonnull -> 83
    //   78: aconst_null
    //   79: astore_1
    //   80: goto -> 91
    //   83: aload #4
    //   85: aload_1
    //   86: iconst_1
    //   87: invokestatic openContactPhotoInputStream : (Landroid/content/ContentResolver;Landroid/net/Uri;Z)Ljava/io/InputStream;
    //   90: astore_1
    //   91: aload_1
    //   92: ifnull -> 107
    //   95: new m40
    //   98: dup
    //   99: aconst_null
    //   100: aload_1
    //   101: iconst_2
    //   102: iconst_0
    //   103: invokespecial <init> : (Landroid/graphics/Bitmap;Ljava/io/InputStream;II)V
    //   106: areturn
    //   107: aconst_null
    //   108: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\or.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */