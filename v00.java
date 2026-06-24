import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class v00 extends u00 {
  public static final d61 c = new d61(null, "~");
  
  public static final String d = "Storage/".toLowerCase(Locale.ENGLISH);
  
  public d61 b = c;
  
  public v00(u00 paramu00) {
    super(paramu00);
  }
  
  public static String B(Context paramContext, Uri paramUri) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: aload_1
    //   10: invokevirtual getAuthority : ()Ljava/lang/String;
    //   13: ldc 'com.android.externalstorage.documents'
    //   15: invokevirtual equals : (Ljava/lang/Object;)Z
    //   18: istore #4
    //   20: iconst_0
    //   21: istore_2
    //   22: iload #4
    //   24: ifeq -> 38
    //   27: aload #7
    //   29: ldc 'Storage'
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: goto -> 116
    //   38: aload_1
    //   39: invokevirtual getAuthority : ()Ljava/lang/String;
    //   42: ldc 'com.android.externalstorage.downloads'
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 62
    //   50: aload #7
    //   52: getstatic android/os/Environment.DIRECTORY_DOWNLOADS : Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: goto -> 116
    //   62: aload_0
    //   63: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   66: astore #5
    //   68: aload #5
    //   70: aload_1
    //   71: invokevirtual getAuthority : ()Ljava/lang/String;
    //   74: iconst_0
    //   75: invokevirtual resolveContentProvider : (Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   78: astore #6
    //   80: aload #6
    //   82: ifnull -> 106
    //   85: aload #7
    //   87: aload #6
    //   89: aload #5
    //   91: invokevirtual loadLabel : (Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    //   94: invokeinterface toString : ()Ljava/lang/String;
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: goto -> 116
    //   106: aload #7
    //   108: aload_1
    //   109: invokevirtual getAuthority : ()Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: getstatic android/os/Build$VERSION.SDK_INT : I
    //   119: bipush #26
    //   121: if_icmplt -> 136
    //   124: aload_0
    //   125: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   128: aload_1
    //   129: invokestatic findDocumentPath : (Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/provider/DocumentsContract$Path;
    //   132: astore_0
    //   133: goto -> 138
    //   136: aconst_null
    //   137: astore_0
    //   138: getstatic android/os/Build$VERSION.SDK_INT : I
    //   141: bipush #26
    //   143: if_icmplt -> 312
    //   146: aload_0
    //   147: ifnull -> 312
    //   150: aload_0
    //   151: invokevirtual getPath : ()Ljava/util/List;
    //   154: astore #8
    //   156: aload #8
    //   158: ifnull -> 312
    //   161: aload #8
    //   163: invokeinterface isEmpty : ()Z
    //   168: ifne -> 312
    //   171: aload #8
    //   173: iconst_0
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast java/lang/String
    //   182: astore #5
    //   184: aload #8
    //   186: iconst_0
    //   187: aload #5
    //   189: bipush #58
    //   191: bipush #47
    //   193: invokevirtual replace : (CC)Ljava/lang/String;
    //   196: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: aload #8
    //   204: invokeinterface size : ()I
    //   209: istore_3
    //   210: iload_2
    //   211: iload_3
    //   212: if_icmpge -> 355
    //   215: aload #8
    //   217: iload_2
    //   218: invokeinterface get : (I)Ljava/lang/Object;
    //   223: checkcast java/lang/String
    //   226: astore_0
    //   227: aload_0
    //   228: astore #6
    //   230: aload #5
    //   232: astore_1
    //   233: iload_2
    //   234: ifeq -> 287
    //   237: aload_0
    //   238: astore #6
    //   240: aload #5
    //   242: astore_1
    //   243: aload_0
    //   244: aload #5
    //   246: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   249: ifeq -> 287
    //   252: aload_0
    //   253: astore #6
    //   255: aload #5
    //   257: astore_1
    //   258: aload_0
    //   259: invokevirtual length : ()I
    //   262: aload #5
    //   264: invokevirtual length : ()I
    //   267: iconst_1
    //   268: iadd
    //   269: if_icmple -> 287
    //   272: aload_0
    //   273: aload #5
    //   275: invokevirtual length : ()I
    //   278: iconst_1
    //   279: iadd
    //   280: invokevirtual substring : (I)Ljava/lang/String;
    //   283: astore #6
    //   285: aload_0
    //   286: astore_1
    //   287: aload #7
    //   289: bipush #47
    //   291: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload #7
    //   297: aload #6
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: iinc #2, 1
    //   306: aload_1
    //   307: astore #5
    //   309: goto -> 210
    //   312: aload_1
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: astore_0
    //   317: aload_0
    //   318: aload_0
    //   319: bipush #47
    //   321: invokevirtual lastIndexOf : (I)I
    //   324: iconst_1
    //   325: iadd
    //   326: invokevirtual substring : (I)Ljava/lang/String;
    //   329: invokestatic decode : (Ljava/lang/String;)Ljava/lang/String;
    //   332: bipush #58
    //   334: bipush #47
    //   336: invokevirtual replace : (CC)Ljava/lang/String;
    //   339: astore_0
    //   340: aload #7
    //   342: bipush #47
    //   344: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: aload #7
    //   350: aload_0
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload #7
    //   357: invokevirtual toString : ()Ljava/lang/String;
    //   360: areturn
    //   361: astore_0
    //   362: goto -> 136
    // Exception table:
    //   from	to	target	type
    //   124	133	361	finally
  }
  
  public static v00 q(Context paramContext, String paramString) {
    return r(paramContext, paramString, "~", null, -1L);
  }
  
  public static v00 r(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong) {
    if (paramString1 != null) {
      List list;
      try {
        if (paramString1.startsWith("content:")) {
          Uri uri = Uri.parse(paramString1);
          list = uri.getPathSegments();
          return (v00)((list.size() >= 2 && "tree".equals(list.get(0))) ? new ww1(null, paramContext, z(uri), paramString2, null, paramString3, null, paramLong) : new f71(uri));
        } 
      } finally {}
      if (list.startsWith("file:")) {
        File file = new File();
        this(Uri.parse((String)list).getPath());
        return new cd1(null, file, paramString2, null);
      } 
      if (list.startsWith("/")) {
        File file = new File();
        this((String)list);
        return new cd1(null, file, paramString2, null);
      } 
      if (Build.VERSION.SDK_INT >= 30 && list.startsWith("musicolet:"))
        return lw0.K(Uri.parse((String)list)); 
    } 
    return null;
  }
  
  public static cd1 s(File paramFile) {
    return new cd1(null, paramFile, "~", null);
  }
  
  public static v00 t(Context paramContext, Uri paramUri) {
    if (paramUri != null) {
      int i;
      try {
        i = Build.VERSION.SDK_INT;
        if (i >= 30 && DocumentsContract.isTreeUri(paramUri)) {
          paramUri = z(paramUri);
          return new ww1(null, paramContext, paramUri, B(paramContext, paramUri), null, null, null, -1L);
        } 
      } finally {}
      if (i >= 30 && lw0.N(paramUri))
        return lw0.K(paramUri); 
    } 
    return null;
  }
  
  public static Uri z(Uri paramUri) {
    boolean bool1;
    boolean bool2 = false;
    try {
      List list = paramUri.getPathSegments();
      int i = list.size();
    } finally {
      Exception exception = null;
    } 
    return bool1 ? paramUri : DocumentsContract.buildDocumentUriUsingTree(paramUri, DocumentsContract.getTreeDocumentId(paramUri));
  }
  
  public abstract v00 A(String paramString);
  
  public boolean C(v00 paramv00) {
    if (!getClass().equals(paramv00.getClass()))
      return false; 
    String str = this.b.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramv00.b.toString());
    stringBuilder.append("/");
    return str.startsWith(stringBuilder.toString());
  }
  
  public abstract ArrayList D(q01 paramq01);
  
  public abstract boolean E();
  
  public final void F(String paramString1, String paramString2) {
    if (paramString2 == null)
      paramString2 = "~"; 
    this.b = new d61(paramString1, paramString2);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof v00) {
      Uri uri = j();
      paramObject = ((v00)paramObject).j();
      if (uri == paramObject)
        return true; 
      if (uri != null)
        return uri.equals(paramObject); 
    } else if (this == paramObject) {
      return true;
    } 
    return false;
  }
  
  public final int hashCode() {
    return j().hashCode();
  }
  
  public abstract boolean p();
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(j());
    return stringBuilder.toString();
  }
  
  public long u() {
    return -1L;
  }
  
  public abstract String v();
  
  public final String w() {
    String str = this.b.toString();
    if (str != null)
      try {
        if (str.startsWith("Storage/"))
          return (i == -1) ? "" : str.substring(i + 1); 
      } finally {
        str = null;
      }  
    return null;
  }
  
  public final v00 x(String paramString) {
    v00 v001 = (v00)i();
    return (v001 != null) ? v001.A(paramString) : null;
  }
  
  public final String y() {
    try {
      String str = this.b.toString();
      if (str.startsWith("Storage/"))
        return (i > 8) ? str.substring(8, i) : str.substring(8); 
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */