import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class lw0 extends v00 {
  public static final e20 q = (e20)new v00(null);
  
  public static final Uri r = (new lw0("external", null, null, -1L, true, 0)).j();
  
  public static final HashSet s;
  
  public final boolean e;
  
  public long f;
  
  public final String g;
  
  public final String h;
  
  public String i;
  
  public final int j;
  
  public boolean k;
  
  public boolean l;
  
  public int m = -1;
  
  public String n;
  
  public long o = -1L;
  
  public long p = -1L;
  
  static {
    String str = FgdLmmRfTxSFKI.odvlvFI;
    s = new HashSet(Arrays.asList((Object[])new String[] { IGBYXeDFmKYajx.DUF, "m4a", "flac", "opus", "ogg", str, "wma" }));
  }
  
  public lw0(String paramString1, String paramString2, String paramString3, long paramLong, boolean paramBoolean, int paramInt) {
    super(null);
    String str = paramString2;
    if (paramString2 != null) {
      str = paramString2;
      if (!paramString2.isEmpty()) {
        str = paramString2;
        if (paramString2.charAt(paramString2.length() - 1) == '/')
          str = paramString2.substring(0, paramString2.length() - 1); 
      } 
    } 
    paramString2 = paramString1;
    if ("external_primary".equals(paramString1))
      paramString2 = "primary"; 
    this.g = paramString2;
    this.h = str;
    this.i = paramString3;
    this.b = new d61(H(paramString2, str, paramString3), null);
    this.f = paramLong;
    this.e = paramBoolean;
    this.j = paramInt;
  }
  
  public static void G(ArrayList paramArrayList, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, q01 paramq01) {
    // Byte code:
    //   0: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.iWkRPsL : Ljava/lang/String;
    //   3: astore #12
    //   5: iconst_5
    //   6: anewarray java/lang/String
    //   9: astore #19
    //   11: aload #19
    //   13: iconst_0
    //   14: ldc 'relative_path'
    //   16: aastore
    //   17: aload #19
    //   19: iconst_1
    //   20: ldc '_display_name'
    //   22: aastore
    //   23: aload #19
    //   25: iconst_2
    //   26: ldc '_id'
    //   28: aastore
    //   29: aload #19
    //   31: iconst_3
    //   32: ldc 'date_modified'
    //   34: aastore
    //   35: aload #19
    //   37: iconst_4
    //   38: aload #12
    //   40: aastore
    //   41: iload_3
    //   42: ifeq -> 442
    //   45: aload_1
    //   46: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   49: astore #14
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: ldc 'is_alarm=0 AND is_notification=0 AND is_ringtone=0 AND is_trashed=0 AND is_drm=0 AND _size>0 '
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: astore #12
    //   62: getstatic android/os/Build$VERSION.SDK_INT : I
    //   65: bipush #31
    //   67: if_icmplt -> 78
    //   70: aload #12
    //   72: ldc ' AND is_recording=0 '
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload #12
    //   80: invokestatic J : (Ljava/lang/StringBuilder;)Ljava/lang/String;
    //   83: astore #13
    //   85: aload #13
    //   87: astore #12
    //   89: aload_2
    //   90: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   93: ifne -> 150
    //   96: aload #13
    //   98: ldc ' AND relative_path like '
    //   100: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: astore #13
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: astore #12
    //   114: aload #12
    //   116: aload_2
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload #12
    //   123: ldc '/%'
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload #13
    //   131: aload #12
    //   133: invokevirtual toString : ()Ljava/lang/String;
    //   136: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #13
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: astore #12
    //   150: new android/os/Bundle
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #13
    //   159: aload #13
    //   161: ldc 'android:query-arg-sql-selection'
    //   163: aload #12
    //   165: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   168: aload #13
    //   170: ldc 'android:query-arg-sql-selection-args'
    //   172: iconst_0
    //   173: anewarray java/lang/String
    //   176: invokevirtual putStringArray : (Ljava/lang/String;[Ljava/lang/String;)V
    //   179: aload #13
    //   181: ldc 'android:query-arg-match-pending'
    //   183: iconst_1
    //   184: invokevirtual putInt : (Ljava/lang/String;I)V
    //   187: getstatic n21.f : Landroid/content/Context;
    //   190: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   193: aload #14
    //   195: aload #19
    //   197: aload #13
    //   199: aconst_null
    //   200: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   203: astore #12
    //   205: goto -> 218
    //   208: astore #12
    //   210: aload #12
    //   212: invokevirtual printStackTrace : ()V
    //   215: aconst_null
    //   216: astore #12
    //   218: aload #12
    //   220: ifnull -> 442
    //   223: aload #12
    //   225: invokeinterface getCount : ()I
    //   230: sipush #5000
    //   233: if_icmplt -> 242
    //   236: iconst_1
    //   237: istore #6
    //   239: goto -> 245
    //   242: iconst_0
    //   243: istore #6
    //   245: aload #12
    //   247: invokeinterface moveToNext : ()Z
    //   252: ifeq -> 432
    //   255: aload #12
    //   257: iconst_0
    //   258: invokeinterface getString : (I)Ljava/lang/String;
    //   263: astore #18
    //   265: aload #12
    //   267: iconst_1
    //   268: invokeinterface getString : (I)Ljava/lang/String;
    //   273: astore #17
    //   275: aload #12
    //   277: iconst_2
    //   278: invokeinterface getLong : (I)J
    //   283: lstore #8
    //   285: aload #12
    //   287: iconst_3
    //   288: invokeinterface getLong : (I)J
    //   293: lstore #10
    //   295: aload #12
    //   297: iconst_4
    //   298: invokeinterface getString : (I)Ljava/lang/String;
    //   303: astore #16
    //   305: aload #16
    //   307: astore #15
    //   309: aload #18
    //   311: astore #14
    //   313: aload #17
    //   315: astore #13
    //   317: iload #6
    //   319: ifeq -> 366
    //   322: aload #16
    //   324: astore #15
    //   326: aload #18
    //   328: astore #14
    //   330: aload #17
    //   332: astore #13
    //   334: aload #5
    //   336: ifnull -> 366
    //   339: aload #5
    //   341: aload #18
    //   343: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   346: astore #14
    //   348: aload #5
    //   350: aload #17
    //   352: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   355: astore #13
    //   357: aload #5
    //   359: aload #16
    //   361: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   364: astore #15
    //   366: new lw0
    //   369: dup
    //   370: aload_1
    //   371: aload #14
    //   373: aload #13
    //   375: lload #8
    //   377: iconst_0
    //   378: iconst_1
    //   379: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZI)V
    //   382: astore #13
    //   384: aload #13
    //   386: lload #10
    //   388: ldc2_w 1000
    //   391: lmul
    //   392: putfield o : J
    //   395: aload #13
    //   397: aload #15
    //   399: putfield n : Ljava/lang/String;
    //   402: iload #6
    //   404: ifeq -> 422
    //   407: aload #5
    //   409: ifnull -> 422
    //   412: aload #13
    //   414: getfield b : Ld61;
    //   417: aload #5
    //   419: invokevirtual a : (Lq01;)V
    //   422: aload_0
    //   423: aload #13
    //   425: invokevirtual add : (Ljava/lang/Object;)Z
    //   428: pop
    //   429: goto -> 245
    //   432: aload #12
    //   434: invokeinterface close : ()V
    //   439: goto -> 445
    //   442: iconst_0
    //   443: istore #6
    //   445: iload #4
    //   447: ifeq -> 822
    //   450: aload_1
    //   451: invokestatic getContentUri : (Ljava/lang/String;)Landroid/net/Uri;
    //   454: astore #14
    //   456: new java/lang/StringBuilder
    //   459: dup
    //   460: ldc_w 'is_trashed=0 AND is_drm=0 AND _size>0 '
    //   463: invokespecial <init> : (Ljava/lang/String;)V
    //   466: invokestatic J : (Ljava/lang/StringBuilder;)Ljava/lang/String;
    //   469: astore #13
    //   471: aload #13
    //   473: astore #12
    //   475: aload_2
    //   476: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   479: ifne -> 536
    //   482: aload #13
    //   484: ldc ' AND relative_path like '
    //   486: invokestatic l : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: astore #13
    //   491: new java/lang/StringBuilder
    //   494: dup
    //   495: invokespecial <init> : ()V
    //   498: astore #12
    //   500: aload #12
    //   502: aload_2
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload #12
    //   509: ldc '/%'
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: aload #13
    //   517: aload #12
    //   519: invokevirtual toString : ()Ljava/lang/String;
    //   522: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   525: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: pop
    //   529: aload #13
    //   531: invokevirtual toString : ()Ljava/lang/String;
    //   534: astore #12
    //   536: new android/os/Bundle
    //   539: dup
    //   540: invokespecial <init> : ()V
    //   543: astore_2
    //   544: aload_2
    //   545: ldc 'android:query-arg-sql-selection'
    //   547: aload #12
    //   549: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   552: aload_2
    //   553: ldc 'android:query-arg-sql-selection-args'
    //   555: iconst_0
    //   556: anewarray java/lang/String
    //   559: invokevirtual putStringArray : (Ljava/lang/String;[Ljava/lang/String;)V
    //   562: aload_2
    //   563: ldc 'android:query-arg-match-pending'
    //   565: iconst_1
    //   566: invokevirtual putInt : (Ljava/lang/String;I)V
    //   569: getstatic n21.f : Landroid/content/Context;
    //   572: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   575: astore #12
    //   577: aload #12
    //   579: aload #14
    //   581: aload #19
    //   583: aload_2
    //   584: aconst_null
    //   585: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   588: astore_2
    //   589: goto -> 603
    //   592: astore_2
    //   593: goto -> 597
    //   596: astore_2
    //   597: aload_2
    //   598: invokevirtual printStackTrace : ()V
    //   601: aconst_null
    //   602: astore_2
    //   603: aload_2
    //   604: ifnull -> 822
    //   607: aload_2
    //   608: invokeinterface getCount : ()I
    //   613: sipush #5000
    //   616: if_icmplt -> 625
    //   619: iconst_1
    //   620: istore #7
    //   622: goto -> 628
    //   625: iconst_0
    //   626: istore #7
    //   628: iload #6
    //   630: iload #7
    //   632: ior
    //   633: istore #6
    //   635: aload_2
    //   636: invokeinterface moveToNext : ()Z
    //   641: ifeq -> 816
    //   644: aload_2
    //   645: iconst_0
    //   646: invokeinterface getString : (I)Ljava/lang/String;
    //   651: astore #17
    //   653: aload_2
    //   654: iconst_1
    //   655: invokeinterface getString : (I)Ljava/lang/String;
    //   660: astore #16
    //   662: aload_2
    //   663: iconst_2
    //   664: invokeinterface getLong : (I)J
    //   669: lstore #8
    //   671: aload_2
    //   672: iconst_3
    //   673: invokeinterface getLong : (I)J
    //   678: lstore #10
    //   680: aload_2
    //   681: iconst_4
    //   682: invokeinterface getString : (I)Ljava/lang/String;
    //   687: astore #15
    //   689: aload #17
    //   691: astore #14
    //   693: aload #16
    //   695: astore #13
    //   697: aload #15
    //   699: astore #12
    //   701: iload #6
    //   703: ifeq -> 750
    //   706: aload #17
    //   708: astore #14
    //   710: aload #16
    //   712: astore #13
    //   714: aload #15
    //   716: astore #12
    //   718: aload #5
    //   720: ifnull -> 750
    //   723: aload #5
    //   725: aload #17
    //   727: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   730: astore #14
    //   732: aload #5
    //   734: aload #16
    //   736: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   739: astore #13
    //   741: aload #5
    //   743: aload #15
    //   745: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   748: astore #12
    //   750: new lw0
    //   753: dup
    //   754: aload_1
    //   755: aload #14
    //   757: aload #13
    //   759: lload #8
    //   761: iconst_0
    //   762: iconst_2
    //   763: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZI)V
    //   766: astore #13
    //   768: aload #13
    //   770: lload #10
    //   772: ldc2_w 1000
    //   775: lmul
    //   776: putfield o : J
    //   779: aload #13
    //   781: aload #12
    //   783: putfield n : Ljava/lang/String;
    //   786: iload #6
    //   788: ifeq -> 806
    //   791: aload #5
    //   793: ifnull -> 806
    //   796: aload #13
    //   798: getfield b : Ld61;
    //   801: aload #5
    //   803: invokevirtual a : (Lq01;)V
    //   806: aload_0
    //   807: aload #13
    //   809: invokevirtual add : (Ljava/lang/Object;)Z
    //   812: pop
    //   813: goto -> 635
    //   816: aload_2
    //   817: invokeinterface close : ()V
    //   822: return
    // Exception table:
    //   from	to	target	type
    //   187	205	208	finally
    //   569	577	596	finally
    //   577	589	592	finally
  }
  
  public static String H(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder("Storage/");
    stringBuilder.append(paramString1);
    boolean bool = TextUtils.isEmpty(paramString2);
    String str = "";
    if (bool) {
      paramString1 = "";
    } else {
      paramString1 = x41.k("/", paramString2);
    } 
    stringBuilder.append(paramString1);
    if (TextUtils.isEmpty(paramString3)) {
      paramString1 = str;
    } else {
      paramString1 = x41.k("/", paramString3);
    } 
    stringBuilder.append(paramString1);
    return stringBuilder.toString();
  }
  
  public static Uri I(String paramString, int paramInt) {
    String str = paramString;
    if ("primary".equals(paramString))
      str = "external_primary"; 
    Uri uri = MediaStore.Files.getContentUri(str);
    return (paramInt == 1) ? MediaStore.Audio.Media.getContentUri(str) : ((paramInt == 2) ? MediaStore.Video.Media.getContentUri(str) : ((paramInt == 3) ? MediaStore.Images.Media.getContentUri(str) : uri));
  }
  
  public static String J(StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder("(is_pending=1 OR (");
    stringBuilder.append(paramStringBuilder);
    stringBuilder.append("))");
    return stringBuilder.toString();
  }
  
  public static lw0 K(Uri paramUri) {
    try {
      long l1;
      String str2 = paramUri.getQueryParameter("p_v");
      String str3 = paramUri.getQueryParameter("p_rp");
      String str4 = paramUri.getQueryParameter("p_dn");
      String str6 = paramUri.getQueryParameter("p_id");
      String str5 = paramUri.getQueryParameter("p_mt");
      long l2 = -1L;
      try {
        if (TextUtils.isEmpty(str6)) {
          l1 = l2;
        } else {
          l1 = Long.parseLong(str6);
        } 
      } catch (NumberFormatException numberFormatException) {
        l1 = l2;
      } 
      int i = -1;
      try {
        if (!TextUtils.isEmpty(str5)) {
          int j = Integer.parseInt(str5);
          i = j;
        } 
      } catch (NumberFormatException numberFormatException) {}
      return new lw0(str2, str3, str4, l1, bool, i);
    } finally {
      paramUri = null;
      paramUri.printStackTrace();
    } 
  }
  
  public static Uri M(Uri paramUri) {
    int i = Integer.parseInt(paramUri.getQueryParameter("p_mt"));
    long l = Long.parseLong(paramUri.getQueryParameter("p_id"));
    return Uri.withAppendedPath(I(paramUri.getQueryParameter("p_v"), i), String.valueOf(l));
  }
  
  public static boolean N(Uri paramUri) {
    return (paramUri != null && "musicolet".equals(paramUri.getScheme()) && "media-store".equals(paramUri.getAuthority()));
  }
  
  public final v00 A(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : I
    //   4: istore_3
    //   5: ldc_w ''
    //   8: astore #7
    //   10: iload_3
    //   11: istore_2
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpne -> 69
    //   17: aload_1
    //   18: ifnull -> 49
    //   21: aload_1
    //   22: ldc_w '.'
    //   25: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   28: istore_2
    //   29: iload_2
    //   30: iconst_m1
    //   31: if_icmpeq -> 49
    //   34: aload_1
    //   35: iload_2
    //   36: iconst_1
    //   37: iadd
    //   38: invokevirtual substring : (I)Ljava/lang/String;
    //   41: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   44: astore #6
    //   46: goto -> 54
    //   49: ldc_w ''
    //   52: astore #6
    //   54: iload_3
    //   55: istore_2
    //   56: getstatic lw0.s : Ljava/util/HashSet;
    //   59: aload #6
    //   61: invokevirtual contains : (Ljava/lang/Object;)Z
    //   64: ifeq -> 69
    //   67: iconst_1
    //   68: istore_2
    //   69: iload_2
    //   70: iconst_m1
    //   71: if_icmpeq -> 425
    //   74: aload_0
    //   75: getfield g : Ljava/lang/String;
    //   78: iload_2
    //   79: invokestatic I : (Ljava/lang/String;I)Landroid/net/Uri;
    //   82: astore #6
    //   84: new java/lang/StringBuilder
    //   87: astore #8
    //   89: aload #8
    //   91: invokespecial <init> : ()V
    //   94: aload #8
    //   96: aload_0
    //   97: getfield b : Ld61;
    //   100: invokevirtual toString : ()Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_1
    //   108: invokevirtual length : ()I
    //   111: istore_3
    //   112: iload_3
    //   113: ifne -> 122
    //   116: aload #7
    //   118: astore_1
    //   119: goto -> 130
    //   122: ldc_w '/'
    //   125: aload_1
    //   126: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   129: astore_1
    //   130: aload #8
    //   132: aload_1
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload #8
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: astore #7
    //   144: aload #7
    //   146: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   149: astore_1
    //   150: aload_1
    //   151: ifnonnull -> 159
    //   154: aconst_null
    //   155: astore_1
    //   156: goto -> 168
    //   159: new ml0
    //   162: dup
    //   163: aload_1
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: astore_1
    //   168: aload_1
    //   169: getfield b : Ljava/lang/String;
    //   172: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
    //   175: astore_1
    //   176: new java/lang/StringBuilder
    //   179: astore #8
    //   181: aload #8
    //   183: ldc_w 'relative_path = '
    //   186: invokespecial <init> : (Ljava/lang/String;)V
    //   189: new java/lang/StringBuilder
    //   192: astore #9
    //   194: aload #9
    //   196: invokespecial <init> : ()V
    //   199: aload #9
    //   201: aload_1
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload #9
    //   208: ldc_w '/'
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload #8
    //   217: aload #9
    //   219: invokevirtual toString : ()Ljava/lang/String;
    //   222: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #8
    //   231: ldc_w ' AND _display_name = '
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #8
    //   240: aload #7
    //   242: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   245: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload #8
    //   254: ldc_w ' COLLATE NOCASE'
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload #8
    //   263: invokevirtual toString : ()Ljava/lang/String;
    //   266: astore #8
    //   268: new android/os/Bundle
    //   271: astore #9
    //   273: aload #9
    //   275: invokespecial <init> : ()V
    //   278: aload #9
    //   280: ldc 'android:query-arg-sql-selection'
    //   282: aload #8
    //   284: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   287: aload #9
    //   289: ldc 'android:query-arg-match-pending'
    //   291: iconst_1
    //   292: invokevirtual putInt : (Ljava/lang/String;I)V
    //   295: getstatic n21.f : Landroid/content/Context;
    //   298: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   301: aload #6
    //   303: iconst_1
    //   304: anewarray java/lang/String
    //   307: dup
    //   308: iconst_0
    //   309: ldc '_id'
    //   311: aastore
    //   312: aload #9
    //   314: aconst_null
    //   315: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   318: astore #6
    //   320: aload #6
    //   322: ifnull -> 376
    //   325: aload #6
    //   327: invokeinterface getCount : ()I
    //   332: iconst_1
    //   333: if_icmpne -> 363
    //   336: aload #6
    //   338: invokeinterface moveToNext : ()Z
    //   343: ifeq -> 363
    //   346: aload #6
    //   348: iconst_0
    //   349: invokeinterface getLong : (I)J
    //   354: lstore #4
    //   356: goto -> 366
    //   359: astore_1
    //   360: goto -> 421
    //   363: lconst_0
    //   364: lstore #4
    //   366: aload #6
    //   368: invokeinterface close : ()V
    //   373: goto -> 379
    //   376: lconst_0
    //   377: lstore #4
    //   379: lload #4
    //   381: lconst_0
    //   382: lcmp
    //   383: ifeq -> 425
    //   386: new lw0
    //   389: astore #6
    //   391: aload #6
    //   393: aload_0
    //   394: getfield g : Ljava/lang/String;
    //   397: aload_1
    //   398: aload #7
    //   400: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   403: lload #4
    //   405: iconst_0
    //   406: iload_2
    //   407: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZI)V
    //   410: aload #6
    //   412: ldc_w '*/*'
    //   415: putfield n : Ljava/lang/String;
    //   418: aload #6
    //   420: areturn
    //   421: aload_1
    //   422: invokevirtual printStackTrace : ()V
    //   425: new v00
    //   428: dup
    //   429: aconst_null
    //   430: invokespecial <init> : (Lu00;)V
    //   433: areturn
    //   434: astore #6
    //   436: goto -> 49
    // Exception table:
    //   from	to	target	type
    //   34	46	434	finally
    //   74	112	359	java/lang/Exception
    //   122	130	359	java/lang/Exception
    //   130	150	359	java/lang/Exception
    //   159	168	359	java/lang/Exception
    //   168	320	359	java/lang/Exception
    //   325	356	359	java/lang/Exception
    //   366	373	359	java/lang/Exception
    //   386	418	359	java/lang/Exception
  }
  
  public final boolean C(v00 paramv00) {
    return "external".equals(paramv00.j().getQueryParameter("p_v")) ? true : super.C(paramv00);
  }
  
  public final ArrayList D(q01 paramq01) {
    ArrayList arrayList = new ArrayList();
    String str2 = this.g;
    if ("primary".equals(str2)) {
      str1 = "external_primary";
    } else {
      str1 = str2;
    } 
    if ("external".equals(str2)) {
      for (String str1 : MediaStore.getExternalVolumeNames(n21.f)) {
        try {
          String str = this.h;
          boolean bool1 = this.l;
          boolean bool2 = this.k;
          try {
            G(arrayList, str1, str, bool1, bool2, paramq01);
            continue;
          } finally {}
        } finally {}
        str1.printStackTrace();
      } 
    } else {
      try {
        Set set = MediaStore.getExternalVolumeNames(n21.f);
        str2 = str1;
        if (!set.contains(str1)) {
          Locale locale = Locale.ENGLISH;
          str2 = str1;
          if (set.contains(str1.toLowerCase(locale)))
            str2 = str1.toLowerCase(locale); 
        } 
      } finally {}
      G(arrayList, str2, this.h, this.l, this.k, paramq01);
      return arrayList;
    } 
    return arrayList;
  }
  
  public final boolean E() {
    return false;
  }
  
  public final Uri L() {
    return M(j());
  }
  
  public final boolean a() {
    return true;
  }
  
  public final boolean b() {
    return true;
  }
  
  public final u00 c(String paramString) {
    return null;
  }
  
  public final u00 d(String paramString1, String paramString2) {
    return null;
  }
  
  public final boolean e() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new uc1
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: ldc_w 'w'
    //   11: invokespecial <init> : (Lu00;Ljava/lang/String;)V
    //   14: aload_3
    //   15: lconst_0
    //   16: invokevirtual k : (J)V
    //   19: aload_3
    //   20: invokevirtual close : ()V
    //   23: goto -> 31
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual printStackTrace : ()V
    //   31: new android/content/ContentValues
    //   34: astore_3
    //   35: aload_3
    //   36: iconst_3
    //   37: invokespecial <init> : (I)V
    //   40: aload_3
    //   41: ldc_w 'is_trashed'
    //   44: iconst_1
    //   45: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   48: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   51: aload_3
    //   52: ldc '_display_name'
    //   54: ldc_w '_'
    //   57: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield j : I
    //   64: istore_1
    //   65: iload_1
    //   66: iconst_1
    //   67: if_icmpne -> 116
    //   70: new java/lang/StringBuilder
    //   73: astore #4
    //   75: aload #4
    //   77: invokespecial <init> : ()V
    //   80: aload #4
    //   82: getstatic android/os/Environment.DIRECTORY_RINGTONES : Ljava/lang/String;
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload #4
    //   91: ldc_w '/_cache/'
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_3
    //   99: ldc 'relative_path'
    //   101: aload #4
    //   103: invokevirtual toString : ()Ljava/lang/String;
    //   106: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   109: goto -> 207
    //   112: astore_3
    //   113: goto -> 233
    //   116: iload_1
    //   117: iconst_2
    //   118: if_icmpne -> 163
    //   121: new java/lang/StringBuilder
    //   124: astore #4
    //   126: aload #4
    //   128: invokespecial <init> : ()V
    //   131: aload #4
    //   133: getstatic android/os/Environment.DIRECTORY_MOVIES : Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload #4
    //   142: ldc_w '/_cache/'
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_3
    //   150: ldc 'relative_path'
    //   152: aload #4
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   160: goto -> 207
    //   163: iload_1
    //   164: iconst_3
    //   165: if_icmpne -> 207
    //   168: new java/lang/StringBuilder
    //   171: astore #4
    //   173: aload #4
    //   175: invokespecial <init> : ()V
    //   178: aload #4
    //   180: getstatic android/os/Environment.DIRECTORY_PICTURES : Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload #4
    //   189: ldc_w '/_cache/'
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_3
    //   197: ldc 'relative_path'
    //   199: aload #4
    //   201: invokevirtual toString : ()Ljava/lang/String;
    //   204: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   207: getstatic n21.f : Landroid/content/Context;
    //   210: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   213: aload_0
    //   214: invokevirtual L : ()Landroid/net/Uri;
    //   217: aload_3
    //   218: aconst_null
    //   219: aconst_null
    //   220: invokevirtual update : (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   223: istore_1
    //   224: iload_1
    //   225: iconst_1
    //   226: if_icmpne -> 231
    //   229: iconst_1
    //   230: istore_2
    //   231: iload_2
    //   232: ireturn
    //   233: aload_3
    //   234: invokevirtual printStackTrace : ()V
    //   237: iconst_0
    //   238: ireturn
    // Exception table:
    //   from	to	target	type
    //   2	23	26	finally
    //   27	31	112	finally
    //   31	65	112	finally
    //   70	109	112	finally
    //   121	160	112	finally
    //   168	207	112	finally
    //   207	224	112	finally
  }
  
  public final boolean f() {
    return true;
  }
  
  public final String h() {
    String str = this.i;
    return (str != null) ? str : "";
  }
  
  public final u00 i() {
    if (!this.e) {
      ml0 ml0;
      String str = ml0.c(this.b.toString());
      if (str == null) {
        str = null;
      } else {
        ml0 = new ml0(str);
      } 
      if (ml0 != null) {
        String str1 = ml0.f(ml0.b);
        return new lw0(this.g, str1, null, -1L, true, 0);
      } 
    } 
    return null;
  }
  
  public final Uri j() {
    String str2 = this.i;
    long l = this.f;
    Uri.Builder builder = (new Uri.Builder()).scheme("musicolet").authority("media-store").appendQueryParameter("p_v", this.g);
    String str1 = this.h;
    if (!TextUtils.isEmpty(str1))
      builder.appendQueryParameter("p_rp", str1); 
    if (!TextUtils.isEmpty(str2))
      builder.appendQueryParameter("p_dn", str2); 
    if (l != -1L)
      builder.appendQueryParameter("p_id", String.valueOf(l)); 
    int i = this.j;
    if (i != -1)
      builder.appendQueryParameter("p_mt", String.valueOf(i)); 
    boolean bool = this.e;
    if (bool)
      builder.appendQueryParameter(fXMDNeMWaILNVh.zXxFMBiWN, String.valueOf(bool)); 
    return builder.build();
  }
  
  public final boolean k() {
    return this.e;
  }
  
  public final boolean l() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: istore #4
    //   6: iconst_0
    //   7: istore_3
    //   8: iload_3
    //   9: istore_2
    //   10: iload #4
    //   12: ifne -> 502
    //   15: aload_0
    //   16: getfield h : Ljava/lang/String;
    //   19: astore #10
    //   21: aload_0
    //   22: getfield n : Ljava/lang/String;
    //   25: ifnonnull -> 488
    //   28: ldc_w ''
    //   31: astore #7
    //   33: aload #7
    //   35: astore #6
    //   37: aload_0
    //   38: getfield j : I
    //   41: istore_1
    //   42: aload #7
    //   44: astore #6
    //   46: aload_0
    //   47: getfield g : Ljava/lang/String;
    //   50: iload_1
    //   51: invokestatic I : (Ljava/lang/String;I)Landroid/net/Uri;
    //   54: astore #9
    //   56: aload #7
    //   58: astore #6
    //   60: new java/lang/StringBuilder
    //   63: astore #5
    //   65: aload #7
    //   67: astore #6
    //   69: aload #5
    //   71: ldc_w '_id='
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: aload #7
    //   79: astore #6
    //   81: aload #5
    //   83: aload_0
    //   84: getfield f : J
    //   87: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload #7
    //   93: astore #6
    //   95: aload #5
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: astore #8
    //   102: aload #7
    //   104: astore #6
    //   106: aload #8
    //   108: astore #5
    //   110: aload #10
    //   112: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   115: ifne -> 241
    //   118: aload #7
    //   120: astore #6
    //   122: new java/lang/StringBuilder
    //   125: astore #5
    //   127: aload #7
    //   129: astore #6
    //   131: aload #5
    //   133: invokespecial <init> : ()V
    //   136: aload #7
    //   138: astore #6
    //   140: aload #5
    //   142: aload #8
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload #7
    //   150: astore #6
    //   152: aload #5
    //   154: ldc_w ' AND relative_path='
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload #7
    //   163: astore #6
    //   165: new java/lang/StringBuilder
    //   168: astore #8
    //   170: aload #7
    //   172: astore #6
    //   174: aload #8
    //   176: invokespecial <init> : ()V
    //   179: aload #7
    //   181: astore #6
    //   183: aload #8
    //   185: aload #10
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload #7
    //   193: astore #6
    //   195: aload #8
    //   197: ldc_w '/'
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload #7
    //   206: astore #6
    //   208: aload #5
    //   210: aload #8
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload #7
    //   224: astore #6
    //   226: aload #5
    //   228: invokevirtual toString : ()Ljava/lang/String;
    //   231: astore #5
    //   233: goto -> 241
    //   236: astore #5
    //   238: goto -> 473
    //   241: aload #7
    //   243: astore #6
    //   245: aload #5
    //   247: astore #8
    //   249: aload_0
    //   250: getfield i : Ljava/lang/String;
    //   253: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   256: ifne -> 330
    //   259: aload #7
    //   261: astore #6
    //   263: new java/lang/StringBuilder
    //   266: astore #8
    //   268: aload #7
    //   270: astore #6
    //   272: aload #8
    //   274: invokespecial <init> : ()V
    //   277: aload #7
    //   279: astore #6
    //   281: aload #8
    //   283: aload #5
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload #7
    //   291: astore #6
    //   293: aload #8
    //   295: ldc_w ' AND _display_name='
    //   298: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload #7
    //   304: astore #6
    //   306: aload #8
    //   308: aload_0
    //   309: getfield i : Ljava/lang/String;
    //   312: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: pop
    //   319: aload #7
    //   321: astore #6
    //   323: aload #8
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: astore #8
    //   330: aload #7
    //   332: astore #6
    //   334: new android/os/Bundle
    //   337: astore #5
    //   339: aload #7
    //   341: astore #6
    //   343: aload #5
    //   345: invokespecial <init> : ()V
    //   348: aload #7
    //   350: astore #6
    //   352: aload #5
    //   354: ldc 'android:query-arg-sql-selection'
    //   356: aload #8
    //   358: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   361: aload #7
    //   363: astore #6
    //   365: aload #5
    //   367: ldc 'android:query-arg-sql-selection-args'
    //   369: iconst_0
    //   370: anewarray java/lang/String
    //   373: invokevirtual putStringArray : (Ljava/lang/String;[Ljava/lang/String;)V
    //   376: aload #7
    //   378: astore #6
    //   380: aload #5
    //   382: ldc 'android:query-arg-match-pending'
    //   384: iconst_1
    //   385: invokevirtual putInt : (Ljava/lang/String;I)V
    //   388: aload #7
    //   390: astore #6
    //   392: getstatic n21.f : Landroid/content/Context;
    //   395: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   398: aload #9
    //   400: iconst_1
    //   401: anewarray java/lang/String
    //   404: dup
    //   405: iconst_0
    //   406: ldc_w 'mime_type'
    //   409: aastore
    //   410: aload #5
    //   412: aconst_null
    //   413: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   416: astore #8
    //   418: aload #7
    //   420: astore #5
    //   422: aload #8
    //   424: ifnull -> 482
    //   427: aload #7
    //   429: astore #6
    //   431: aload #7
    //   433: astore #5
    //   435: aload #8
    //   437: invokeinterface moveToNext : ()Z
    //   442: ifeq -> 459
    //   445: aload #7
    //   447: astore #6
    //   449: aload #8
    //   451: iconst_0
    //   452: invokeinterface getString : (I)Ljava/lang/String;
    //   457: astore #5
    //   459: aload #5
    //   461: astore #6
    //   463: aload #8
    //   465: invokeinterface close : ()V
    //   470: goto -> 482
    //   473: aload #5
    //   475: invokevirtual printStackTrace : ()V
    //   478: aload #6
    //   480: astore #5
    //   482: aload_0
    //   483: aload #5
    //   485: putfield n : Ljava/lang/String;
    //   488: iload_3
    //   489: istore_2
    //   490: aload_0
    //   491: getfield n : Ljava/lang/String;
    //   494: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   497: ifne -> 502
    //   500: iconst_1
    //   501: istore_2
    //   502: iload_2
    //   503: ireturn
    // Exception table:
    //   from	to	target	type
    //   37	42	236	finally
    //   46	56	236	finally
    //   60	65	236	finally
    //   69	77	236	finally
    //   81	91	236	finally
    //   95	102	236	finally
    //   110	118	236	finally
    //   122	127	236	finally
    //   131	136	236	finally
    //   140	148	236	finally
    //   152	161	236	finally
    //   165	170	236	finally
    //   174	179	236	finally
    //   183	191	236	finally
    //   195	204	236	finally
    //   208	222	236	finally
    //   226	233	236	finally
    //   249	259	236	finally
    //   263	268	236	finally
    //   272	277	236	finally
    //   281	289	236	finally
    //   293	302	236	finally
    //   306	319	236	finally
    //   323	330	236	finally
    //   334	339	236	finally
    //   343	348	236	finally
    //   352	361	236	finally
    //   365	376	236	finally
    //   380	388	236	finally
    //   392	418	236	finally
    //   435	445	236	finally
    //   449	459	236	finally
    //   463	470	236	finally
  }
  
  public final long m() {
    if (this.o == -1L) {
      long l1;
      long l3 = 0L;
      long l2 = l3;
      try {
        int i = this.j;
        l2 = l3;
        Uri uri = I(this.g, i);
        l2 = l3;
        StringBuilder stringBuilder = new StringBuilder();
        l2 = l3;
        this("_id=");
        l2 = l3;
        stringBuilder.append(this.f);
        l2 = l3;
        String str = stringBuilder.toString();
        l2 = l3;
        Bundle bundle = new Bundle();
        l2 = l3;
        this();
        l2 = l3;
        bundle.putString("android:query-arg-sql-selection", str);
        l2 = l3;
        bundle.putStringArray("android:query-arg-sql-selection-args", new String[0]);
        l2 = l3;
        bundle.putInt("android:query-arg-match-pending", 1);
        l2 = l3;
        Cursor cursor = n21.f.getContentResolver().query(uri, new String[] { "date_modified" }, bundle, null);
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      } 
      this.o = l1;
    } 
    return this.o;
  }
  
  public final long n() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : I
    //   4: istore_1
    //   5: getstatic in/krosbits/utils/SgV/YbNJ.Ltez : Ljava/lang/String;
    //   8: astore #10
    //   10: aload_0
    //   11: getfield p : J
    //   14: ldc2_w -1
    //   17: lcmp
    //   18: ifne -> 336
    //   21: lconst_0
    //   22: lstore #6
    //   24: lload #6
    //   26: lstore #4
    //   28: aload_0
    //   29: getfield g : Ljava/lang/String;
    //   32: iload_1
    //   33: invokestatic I : (Ljava/lang/String;I)Landroid/net/Uri;
    //   36: astore #8
    //   38: lload #6
    //   40: lstore #4
    //   42: new java/lang/StringBuilder
    //   45: astore #9
    //   47: lload #6
    //   49: lstore #4
    //   51: aload #9
    //   53: aload #10
    //   55: invokespecial <init> : (Ljava/lang/String;)V
    //   58: lload #6
    //   60: lstore #4
    //   62: aload #9
    //   64: aload_0
    //   65: getfield f : J
    //   68: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: lload #6
    //   74: lstore #4
    //   76: aload #9
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: astore #10
    //   83: lload #6
    //   85: lstore #4
    //   87: new android/os/Bundle
    //   90: astore #9
    //   92: lload #6
    //   94: lstore #4
    //   96: aload #9
    //   98: invokespecial <init> : ()V
    //   101: lload #6
    //   103: lstore #4
    //   105: aload #9
    //   107: ldc 'android:query-arg-sql-selection'
    //   109: aload #10
    //   111: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   114: lload #6
    //   116: lstore #4
    //   118: aload #9
    //   120: ldc 'android:query-arg-sql-selection-args'
    //   122: iconst_0
    //   123: anewarray java/lang/String
    //   126: invokevirtual putStringArray : (Ljava/lang/String;[Ljava/lang/String;)V
    //   129: lload #6
    //   131: lstore #4
    //   133: aload #9
    //   135: ldc 'android:query-arg-match-pending'
    //   137: iconst_1
    //   138: invokevirtual putInt : (Ljava/lang/String;I)V
    //   141: lload #6
    //   143: lstore #4
    //   145: getstatic n21.f : Landroid/content/Context;
    //   148: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   151: aload #8
    //   153: iconst_1
    //   154: anewarray java/lang/String
    //   157: dup
    //   158: iconst_0
    //   159: ldc_w '_size'
    //   162: aastore
    //   163: aload #9
    //   165: aconst_null
    //   166: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   169: astore #9
    //   171: lload #6
    //   173: lstore_2
    //   174: aload #9
    //   176: ifnull -> 331
    //   179: lload #6
    //   181: lstore #4
    //   183: lload #6
    //   185: lstore_2
    //   186: aload #9
    //   188: invokeinterface moveToNext : ()Z
    //   193: ifeq -> 313
    //   196: lload #6
    //   198: lstore #4
    //   200: aload #9
    //   202: iconst_0
    //   203: invokeinterface getLong : (I)J
    //   208: lstore_2
    //   209: lload_2
    //   210: lconst_0
    //   211: lcmp
    //   212: ifne -> 313
    //   215: iload_1
    //   216: ifeq -> 313
    //   219: aload_0
    //   220: invokevirtual L : ()Landroid/net/Uri;
    //   223: astore #8
    //   225: getstatic n21.f : Landroid/content/Context;
    //   228: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   231: aload #8
    //   233: ldc_w 'r'
    //   236: aconst_null
    //   237: invokevirtual openFile : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   240: astore #8
    //   242: aload #8
    //   244: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   247: invokestatic fstat : (Ljava/io/FileDescriptor;)Landroid/system/StructStat;
    //   250: getfield st_size : J
    //   253: lstore #6
    //   255: lload #6
    //   257: lstore #4
    //   259: aload #8
    //   261: invokevirtual close : ()V
    //   264: lload #6
    //   266: lstore_2
    //   267: goto -> 313
    //   270: astore #8
    //   272: lload #4
    //   274: lstore_2
    //   275: goto -> 326
    //   278: astore #9
    //   280: aload #8
    //   282: ifnull -> 310
    //   285: aload #8
    //   287: invokevirtual close : ()V
    //   290: goto -> 310
    //   293: astore #8
    //   295: aload #9
    //   297: aload #8
    //   299: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   302: goto -> 310
    //   305: astore #8
    //   307: goto -> 326
    //   310: aload #9
    //   312: athrow
    //   313: lload_2
    //   314: lstore #4
    //   316: aload #9
    //   318: invokeinterface close : ()V
    //   323: goto -> 331
    //   326: aload #8
    //   328: invokevirtual printStackTrace : ()V
    //   331: aload_0
    //   332: lload_2
    //   333: putfield p : J
    //   336: aload_0
    //   337: getfield p : J
    //   340: lreturn
    // Exception table:
    //   from	to	target	type
    //   28	38	270	finally
    //   42	47	270	finally
    //   51	58	270	finally
    //   62	72	270	finally
    //   76	83	270	finally
    //   87	92	270	finally
    //   96	101	270	finally
    //   105	114	270	finally
    //   118	129	270	finally
    //   133	141	270	finally
    //   145	171	270	finally
    //   186	196	270	finally
    //   200	209	270	finally
    //   219	242	305	finally
    //   242	255	278	finally
    //   259	264	270	finally
    //   285	290	293	finally
    //   295	302	305	finally
    //   310	313	305	finally
    //   316	323	270	finally
  }
  
  public final boolean o(String paramString) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #30
    //   5: if_icmplt -> 389
    //   8: new android/content/ContentValues
    //   11: astore #5
    //   13: aload #5
    //   15: iconst_2
    //   16: invokespecial <init> : (I)V
    //   19: aload #5
    //   21: getstatic com/google/android/gms/dynamite/descriptors/com/google/android/gms/flags/Ou/tlzLOCPTHRhep.KCfijQcjPTZWI : Ljava/lang/String;
    //   24: aload_1
    //   25: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   28: invokestatic getSingleton : ()Landroid/webkit/MimeTypeMap;
    //   31: astore #6
    //   33: aload_1
    //   34: ifnull -> 65
    //   37: aload_1
    //   38: ldc_w '.'
    //   41: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   44: istore_2
    //   45: iload_2
    //   46: iconst_m1
    //   47: if_icmpeq -> 65
    //   50: aload_1
    //   51: iload_2
    //   52: iconst_1
    //   53: iadd
    //   54: invokevirtual substring : (I)Ljava/lang/String;
    //   57: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   60: astore #4
    //   62: goto -> 70
    //   65: ldc_w ''
    //   68: astore #4
    //   70: aload #6
    //   72: aload #4
    //   74: invokevirtual getMimeTypeFromExtension : (Ljava/lang/String;)Ljava/lang/String;
    //   77: astore #4
    //   79: aload #4
    //   81: ifnull -> 101
    //   84: aload #5
    //   86: ldc_w 'mime_type'
    //   89: aload #4
    //   91: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   94: goto -> 101
    //   97: astore_1
    //   98: goto -> 385
    //   101: getstatic n21.f : Landroid/content/Context;
    //   104: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   107: astore #6
    //   109: aload #6
    //   111: aload_0
    //   112: invokevirtual L : ()Landroid/net/Uri;
    //   115: aload #5
    //   117: aconst_null
    //   118: invokevirtual update : (Landroid/net/Uri;Landroid/content/ContentValues;Landroid/os/Bundle;)I
    //   121: iconst_1
    //   122: if_icmpne -> 389
    //   125: aload_0
    //   126: aload_1
    //   127: putfield i : Ljava/lang/String;
    //   130: aload_0
    //   131: aconst_null
    //   132: putfield n : Ljava/lang/String;
    //   135: aload_0
    //   136: ldc2_w -1
    //   139: putfield p : J
    //   142: aload_0
    //   143: invokevirtual l : ()Z
    //   146: istore_3
    //   147: aload_0
    //   148: getfield g : Ljava/lang/String;
    //   151: astore #4
    //   153: aload_0
    //   154: getfield h : Ljava/lang/String;
    //   157: astore #5
    //   159: iload_3
    //   160: ifne -> 356
    //   163: new android/os/Bundle
    //   166: astore #7
    //   168: aload #7
    //   170: invokespecial <init> : ()V
    //   173: new java/lang/StringBuilder
    //   176: astore #8
    //   178: aload #8
    //   180: ldc_w 'relative_path = '
    //   183: invokespecial <init> : (Ljava/lang/String;)V
    //   186: new java/lang/StringBuilder
    //   189: astore #9
    //   191: aload #9
    //   193: invokespecial <init> : ()V
    //   196: aload #9
    //   198: aload #5
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload #9
    //   206: getstatic in/krosbits/utils/SgV/zpEN.csyXEzOL : Ljava/lang/String;
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload #8
    //   215: aload #9
    //   217: invokevirtual toString : ()Ljava/lang/String;
    //   220: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload #8
    //   229: ldc_w ' AND _display_name = '
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload #8
    //   238: aload_1
    //   239: invokestatic sqlEscapeString : (Ljava/lang/String;)Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload #8
    //   248: ldc_w ' COLLATE NOCASE'
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: aload #7
    //   257: ldc 'android:query-arg-sql-selection'
    //   259: aload #8
    //   261: invokevirtual toString : ()Ljava/lang/String;
    //   264: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload #7
    //   269: ldc 'android:query-arg-match-pending'
    //   271: iconst_1
    //   272: invokevirtual putInt : (Ljava/lang/String;I)V
    //   275: aload #7
    //   277: ldc_w 'android:query-arg-limit'
    //   280: iconst_1
    //   281: invokevirtual putInt : (Ljava/lang/String;I)V
    //   284: aload #7
    //   286: ldc_w 'android:query-arg-sql-limit'
    //   289: iconst_1
    //   290: invokevirtual putInt : (Ljava/lang/String;I)V
    //   293: aload #6
    //   295: aload #4
    //   297: aload_0
    //   298: getfield j : I
    //   301: invokestatic I : (Ljava/lang/String;I)Landroid/net/Uri;
    //   304: iconst_1
    //   305: anewarray java/lang/String
    //   308: dup
    //   309: iconst_0
    //   310: getstatic com/google/android/material/tabs/xm/VDgS.iLZzlJVLspXiIqH : Ljava/lang/String;
    //   313: aastore
    //   314: aload #7
    //   316: aconst_null
    //   317: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   320: astore #6
    //   322: aload #6
    //   324: ifnull -> 356
    //   327: aload #6
    //   329: invokeinterface moveToFirst : ()Z
    //   334: ifeq -> 349
    //   337: aload_0
    //   338: aload #6
    //   340: iconst_0
    //   341: invokeinterface getLong : (I)J
    //   346: putfield f : J
    //   349: aload #6
    //   351: invokeinterface close : ()V
    //   356: aload #4
    //   358: aload #5
    //   360: aload_1
    //   361: invokestatic H : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   364: astore_1
    //   365: new d61
    //   368: astore #4
    //   370: aload #4
    //   372: aload_1
    //   373: aconst_null
    //   374: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   377: aload_0
    //   378: aload #4
    //   380: putfield b : Ld61;
    //   383: iconst_1
    //   384: ireturn
    //   385: aload_1
    //   386: invokevirtual printStackTrace : ()V
    //   389: iconst_0
    //   390: ireturn
    //   391: astore #4
    //   393: goto -> 65
    // Exception table:
    //   from	to	target	type
    //   0	33	97	finally
    //   37	45	97	finally
    //   50	62	391	finally
    //   70	79	97	finally
    //   84	94	97	finally
    //   101	147	97	finally
    //   163	322	97	finally
    //   327	349	97	finally
    //   349	356	97	finally
    //   356	383	97	finally
  }
  
  public final boolean p() {
    return false;
  }
  
  public final long u() {
    return ww1.I(n21.f, L());
  }
  
  public final String v() {
    return h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */