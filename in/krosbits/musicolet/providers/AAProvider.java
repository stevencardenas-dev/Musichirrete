package in.krosbits.musicolet.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.view.insets.UWhd.GEkLxj;
import com.google.android.gms.common.annotation.zQ.PVdqHjWVkmL;
import in.krosbits.musicolet.MyApplication;
import java.util.List;
import java.util.UUID;
import km0;
import org.jaudiotagger.tag.mp4.fwr.whGJe;
import p3;
import v00;

public class AAProvider extends ContentProvider {
  public static final String b = UUID.randomUUID().toString();
  
  public static Bitmap a(int paramInt1, int paramInt2, Uri paramUri) {
    try {
      int j = Integer.parseInt(paramUri.getQueryParameter("fa"));
      int i = Integer.parseInt(paramUri.getQueryParameter("rid"));
      boolean bool = TextUtils.isEmpty(paramUri.getQueryParameter("fl"));
      km0 km0 = MyApplication.j.c.a(i);
      if (km0 != null) {
        v00 v00 = km0.d();
        return p3.g(MyApplication.i.getApplicationContext(), v00, paramInt1, paramInt2, j, bool ^ true);
      } 
    } finally {}
    return null;
  }
  
  public static Bitmap b(int paramInt1, int paramInt2, Uri paramUri) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #10
    //   3: aconst_null
    //   4: astore #11
    //   6: aload #11
    //   8: astore #9
    //   10: aload_2
    //   11: ldc 'ufaaf'
    //   13: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   16: pop
    //   17: aload #11
    //   19: astore #9
    //   21: aload_2
    //   22: ldc 'unlc'
    //   24: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   27: pop
    //   28: aload #11
    //   30: astore #9
    //   32: aload_2
    //   33: ldc 'srids'
    //   35: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   38: astore #12
    //   40: aload #11
    //   42: astore #9
    //   44: aload_2
    //   45: ldc 'fa'
    //   47: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic parseInt : (Ljava/lang/String;)I
    //   53: istore #6
    //   55: aload #11
    //   57: astore #9
    //   59: aload_2
    //   60: ldc 'spcpx'
    //   62: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   65: invokestatic parseFloat : (Ljava/lang/String;)F
    //   68: fstore #4
    //   70: aload #11
    //   72: astore #9
    //   74: aload_2
    //   75: ldc 'crdpx'
    //   77: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   80: invokestatic parseFloat : (Ljava/lang/String;)F
    //   83: fstore_3
    //   84: aload #11
    //   86: astore #9
    //   88: aload_2
    //   89: ldc 'fl'
    //   91: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   94: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   97: istore #8
    //   99: aload #10
    //   101: astore_2
    //   102: aload #12
    //   104: ifnull -> 252
    //   107: aload #11
    //   109: astore #9
    //   111: aload #12
    //   113: ldc ','
    //   115: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   118: astore_2
    //   119: aload #11
    //   121: astore #9
    //   123: new java/util/ArrayList
    //   126: astore #12
    //   128: aload #11
    //   130: astore #9
    //   132: aload #12
    //   134: aload_2
    //   135: arraylength
    //   136: invokespecial <init> : (I)V
    //   139: aload #11
    //   141: astore #9
    //   143: aload_2
    //   144: arraylength
    //   145: istore #7
    //   147: iconst_0
    //   148: istore #5
    //   150: iload #5
    //   152: iload #7
    //   154: if_icmpge -> 207
    //   157: aload_2
    //   158: iload #5
    //   160: aaload
    //   161: astore #9
    //   163: iload_0
    //   164: iload_1
    //   165: aload #9
    //   167: invokestatic parseInt : (Ljava/lang/String;)I
    //   170: iload #6
    //   172: iload #8
    //   174: iconst_1
    //   175: ixor
    //   176: invokestatic c : (IIZ)Landroid/net/Uri;
    //   179: invokestatic a : (IILandroid/net/Uri;)Landroid/graphics/Bitmap;
    //   182: astore #9
    //   184: aload #9
    //   186: ifnull -> 197
    //   189: aload #12
    //   191: aload #9
    //   193: invokevirtual add : (Ljava/lang/Object;)Z
    //   196: pop
    //   197: iinc #5, 1
    //   200: goto -> 150
    //   203: astore_2
    //   204: goto -> 327
    //   207: aload #11
    //   209: astore #9
    //   211: aload #12
    //   213: invokevirtual isEmpty : ()Z
    //   216: istore #8
    //   218: aload #10
    //   220: astore_2
    //   221: iload #8
    //   223: ifne -> 252
    //   226: aload #12
    //   228: iload_0
    //   229: iload_1
    //   230: fload #4
    //   232: fload_3
    //   233: invokestatic o : (Ljava/util/ArrayList;IIFF)Landroid/graphics/Bitmap;
    //   236: astore_2
    //   237: goto -> 252
    //   240: astore_2
    //   241: aload #11
    //   243: astore #9
    //   245: aload_2
    //   246: invokevirtual printStackTrace : ()V
    //   249: aload #10
    //   251: astore_2
    //   252: aload_2
    //   253: astore #9
    //   255: aload_2
    //   256: ifnonnull -> 331
    //   259: aload_2
    //   260: astore #9
    //   262: iload #6
    //   264: iconst_m1
    //   265: if_icmpeq -> 331
    //   268: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   271: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   274: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   277: iload #6
    //   279: iload_0
    //   280: iload_1
    //   281: invokestatic c : (Landroid/content/res/Resources;III)Landroid/graphics/Bitmap;
    //   284: astore #9
    //   286: goto -> 331
    //   289: astore #10
    //   291: goto -> 299
    //   294: astore #10
    //   296: goto -> 313
    //   299: aload_2
    //   300: astore #9
    //   302: aload #10
    //   304: invokevirtual printStackTrace : ()V
    //   307: aload_2
    //   308: astore #9
    //   310: goto -> 331
    //   313: aload_2
    //   314: astore #9
    //   316: aload #10
    //   318: invokevirtual printStackTrace : ()V
    //   321: aload_2
    //   322: astore #9
    //   324: goto -> 331
    //   327: aload_2
    //   328: invokevirtual printStackTrace : ()V
    //   331: aload #9
    //   333: areturn
    //   334: astore #9
    //   336: goto -> 197
    // Exception table:
    //   from	to	target	type
    //   10	17	203	finally
    //   21	28	203	finally
    //   32	40	203	finally
    //   44	55	203	finally
    //   59	70	203	finally
    //   74	84	203	finally
    //   88	99	203	finally
    //   111	119	203	finally
    //   123	128	203	finally
    //   132	139	203	finally
    //   143	147	203	finally
    //   163	184	334	finally
    //   189	197	334	finally
    //   211	218	203	finally
    //   226	237	240	finally
    //   245	249	203	finally
    //   268	286	294	java/lang/OutOfMemoryError
    //   268	286	289	finally
    //   302	307	203	finally
    //   316	321	203	finally
  }
  
  public static Uri c(int paramInt1, int paramInt2, boolean paramBoolean) {
    String str;
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority("in.krosbits.musicolet.providers.AAProvider").appendPath("raabl").appendQueryParameter("rid", String.valueOf(paramInt1)).appendQueryParameter("fa", String.valueOf(paramInt2));
    if (paramBoolean) {
      str = "fl";
    } else {
      str = "";
    } 
    return builder.appendQueryParameter("fl", str).build();
  }
  
  public static Uri d(km0 paramkm0) {
    if (paramkm0 == null)
      return null; 
    int i = paramkm0.b;
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority("in.krosbits.musicolet.providers.AAProvider").appendPath("raarp");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i);
    stringBuilder.append(b);
    return builder.appendQueryParameter("k", String.valueOf(stringBuilder.toString().hashCode())).appendQueryParameter("rid", String.valueOf(i)).appendQueryParameter("fa", String.valueOf(2131230842)).appendQueryParameter("fl", "").build();
  }
  
  public static boolean e(Uri paramUri) {
    if ("in.krosbits.musicolet.providers.AAProvider".equals(paramUri.getAuthority())) {
      List list = paramUri.getPathSegments();
      if (list != null && !list.isEmpty() && "raarp".equals(list.get(0)))
        try {
          int i = Integer.parseInt(paramUri.getQueryParameter("rid"));
          String str = paramUri.getQueryParameter("k");
          if (str != null) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(i);
            stringBuilder.append(b);
            boolean bool = str.equals(String.valueOf(stringBuilder.toString().hashCode()));
            if (bool)
              return true; 
          } 
        } finally {} 
    } 
    return false;
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return ((Integer)GEkLxj.aLhEkr.invoke(null, new Object[] { this, paramUri, paramString, paramArrayOfString })).intValue();
  }
  
  public final String getType(Uri paramUri) {
    return e(paramUri) ? "application/octet" : null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return (Uri)whGJe.tfDOuqUzwgJb.invoke(null, new Object[] { this, paramUri, paramContentValues });
  }
  
  public final boolean onCreate() {
    return ((Boolean)PVdqHjWVkmL.qFkQRxGMYEjyIC.invoke(null, new Object[] { this })).booleanValue();
  }
  
  public final ParcelFileDescriptor openFile(Uri paramUri, String paramString) {
    if (e(paramUri)) {
      int i = Integer.parseInt(paramUri.getQueryParameter("fa"));
      try {
        int j = Integer.parseInt(paramUri.getQueryParameter("rid"));
        km0 km0 = MyApplication.j.c.a(j);
      } finally {
        Exception exception = null;
      } 
    } 
    return super.openFile(paramUri, paramString);
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return (Cursor)GEkLxj.rHHWhgs.invoke(null, new Object[] { this, paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2 });
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return ((Integer)GEkLxj.BBPjhCRBTih.invoke(null, new Object[] { this, paramUri, paramContentValues, paramString, paramArrayOfString })).intValue();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\providers\AAProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */