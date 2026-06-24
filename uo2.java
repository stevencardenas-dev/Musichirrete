import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class uo2 {
  public static final rp0 u = new rp0("MediaNotificationProxy", null);
  
  public final Context a;
  
  public final NotificationManager b;
  
  public final a31 c;
  
  public final ComponentName d;
  
  public final ComponentName e;
  
  public ArrayList f = new ArrayList();
  
  public int[] g;
  
  public final long h;
  
  public final cn i;
  
  public final Resources j;
  
  public xn2 k;
  
  public qj2 l;
  
  public o21 m;
  
  public o21 n;
  
  public o21 o;
  
  public o21 p;
  
  public o21 q;
  
  public o21 r;
  
  public o21 s;
  
  public o21 t;
  
  public uo2(Context paramContext) {
    this.a = paramContext;
    NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
    this.b = notificationManager;
    rp0 rp01 = kj.k;
    n21.j();
    kj kj = kj.m;
    n21.m(kj);
    n21.j();
    mj mj = kj.e;
    n21.m(mj);
    lj lj = mj.h;
    n21.m(lj);
    a31 a311 = lj.f;
    n21.m(a311);
    this.c = a311;
    lj.e();
    Resources resources = paramContext.getResources();
    this.j = resources;
    this.d = new ComponentName(paramContext.getApplicationContext(), lj.b);
    String str = a311.f;
    if (!TextUtils.isEmpty(str)) {
      this.e = new ComponentName(paramContext.getApplicationContext(), str);
    } else {
      this.e = null;
    } 
    this.h = a311.e;
    int i = resources.getDimensionPixelSize(a311.t);
    gh0 gh0 = new gh0(1, i, i);
    this.i = new cn(paramContext.getApplicationContext(), gh0);
    if (ws2.S() && notificationManager != null) {
      NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", paramContext.getResources().getString(2131886822), 2);
      notificationChannel.setShowBadge(false);
      notificationManager.createNotificationChannel(notificationChannel);
    } 
    zq2.a(wp2.g0);
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/app/NotificationManager;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnull -> 1113
    //   11: aload_0
    //   12: getfield k : Lxn2;
    //   15: ifnonnull -> 21
    //   18: goto -> 1113
    //   21: aload_0
    //   22: getfield l : Lqj2;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnull -> 69
    //   32: aload #5
    //   34: getfield c : Ljava/lang/Object;
    //   37: checkcast android/graphics/Bitmap
    //   40: astore #6
    //   42: aload #6
    //   44: ifnull -> 69
    //   47: aload #6
    //   49: invokevirtual getWidth : ()I
    //   52: iconst_1
    //   53: if_icmple -> 69
    //   56: aload #6
    //   58: astore #5
    //   60: aload #6
    //   62: invokevirtual getHeight : ()I
    //   65: iconst_1
    //   66: if_icmpgt -> 72
    //   69: aconst_null
    //   70: astore #5
    //   72: aload_0
    //   73: getfield a : Landroid/content/Context;
    //   76: astore #9
    //   78: new s21
    //   81: dup
    //   82: aload #9
    //   84: ldc 'cast_media_notification'
    //   86: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   89: astore #8
    //   91: aload #8
    //   93: aload #5
    //   95: invokevirtual e : (Landroid/graphics/Bitmap;)V
    //   98: aload_0
    //   99: getfield c : La31;
    //   102: astore #10
    //   104: aload #10
    //   106: getfield g : I
    //   109: istore_1
    //   110: aload #8
    //   112: getfield z : Landroid/app/Notification;
    //   115: iload_1
    //   116: putfield icon : I
    //   119: aload #8
    //   121: aload_0
    //   122: getfield k : Lxn2;
    //   125: getfield d : Ljava/lang/String;
    //   128: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   131: putfield e : Ljava/lang/CharSequence;
    //   134: aload #10
    //   136: getfield u : I
    //   139: istore_1
    //   140: aload_0
    //   141: getfield k : Lxn2;
    //   144: getfield e : Ljava/lang/String;
    //   147: astore #5
    //   149: aload #8
    //   151: aload_0
    //   152: getfield j : Landroid/content/res/Resources;
    //   155: iload_1
    //   156: iconst_1
    //   157: anewarray java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload #5
    //   164: aastore
    //   165: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   168: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   171: putfield f : Ljava/lang/CharSequence;
    //   174: aload #8
    //   176: iconst_2
    //   177: iconst_1
    //   178: invokevirtual d : (IZ)V
    //   181: iconst_0
    //   182: istore_2
    //   183: aload #8
    //   185: iconst_0
    //   186: putfield k : Z
    //   189: aload #8
    //   191: iconst_1
    //   192: putfield u : I
    //   195: aload_0
    //   196: getfield e : Landroid/content/ComponentName;
    //   199: astore #5
    //   201: aload #5
    //   203: ifnonnull -> 212
    //   206: aconst_null
    //   207: astore #5
    //   209: goto -> 423
    //   212: new android/content/Intent
    //   215: dup
    //   216: invokespecial <init> : ()V
    //   219: astore #11
    //   221: aload #11
    //   223: ldc_w 'targetActivity'
    //   226: aload #5
    //   228: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   231: pop
    //   232: aload #11
    //   234: aload #5
    //   236: invokevirtual flattenToString : ()Ljava/lang/String;
    //   239: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   242: pop
    //   243: aload #11
    //   245: aload #5
    //   247: invokevirtual setComponent : (Landroid/content/ComponentName;)Landroid/content/Intent;
    //   250: pop
    //   251: new java/util/ArrayList
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: astore #12
    //   260: aload #11
    //   262: invokevirtual getComponent : ()Landroid/content/ComponentName;
    //   265: astore #6
    //   267: aload #6
    //   269: astore #5
    //   271: aload #6
    //   273: ifnonnull -> 288
    //   276: aload #11
    //   278: aload #9
    //   280: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   283: invokevirtual resolveActivity : (Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
    //   286: astore #5
    //   288: aload #5
    //   290: ifnull -> 358
    //   293: aload #12
    //   295: invokevirtual size : ()I
    //   298: istore_1
    //   299: aload #9
    //   301: aload #5
    //   303: invokestatic O : (Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    //   306: astore #5
    //   308: aload #5
    //   310: ifnull -> 358
    //   313: aload #12
    //   315: iload_1
    //   316: aload #5
    //   318: invokevirtual add : (ILjava/lang/Object;)V
    //   321: aload #9
    //   323: aload #5
    //   325: invokevirtual getComponent : ()Landroid/content/ComponentName;
    //   328: invokestatic O : (Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    //   331: astore #5
    //   333: goto -> 308
    //   336: astore #5
    //   338: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.LtMeSrdRMRLnQO : Ljava/lang/String;
    //   341: ldc_w 'Bad ComponentName while traversing activity parent metadata'
    //   344: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   347: pop
    //   348: new java/lang/IllegalArgumentException
    //   351: dup
    //   352: aload #5
    //   354: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   357: athrow
    //   358: aload #12
    //   360: aload #11
    //   362: invokevirtual add : (Ljava/lang/Object;)Z
    //   365: pop
    //   366: aload #12
    //   368: invokevirtual isEmpty : ()Z
    //   371: ifne -> 1107
    //   374: aload #12
    //   376: iconst_0
    //   377: anewarray android/content/Intent
    //   380: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   383: checkcast [Landroid/content/Intent;
    //   386: astore #5
    //   388: aload #5
    //   390: iconst_0
    //   391: new android/content/Intent
    //   394: dup
    //   395: aload #5
    //   397: iconst_0
    //   398: aaload
    //   399: invokespecial <init> : (Landroid/content/Intent;)V
    //   402: ldc_w 268484608
    //   405: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   408: aastore
    //   409: aload #9
    //   411: iconst_1
    //   412: aload #5
    //   414: ldc_w 201326592
    //   417: aconst_null
    //   418: invokestatic getActivities : (Landroid/content/Context;I[Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //   421: astore #5
    //   423: aload #5
    //   425: ifnull -> 435
    //   428: aload #8
    //   430: aload #5
    //   432: putfield g : Landroid/app/PendingIntent;
    //   435: aload #10
    //   437: getfield H : Lsj2;
    //   440: astore #6
    //   442: getstatic uo2.u : Lrp0;
    //   445: astore #5
    //   447: aload #6
    //   449: ifnull -> 861
    //   452: aload #5
    //   454: ldc_w 'actionsProvider != null'
    //   457: iconst_0
    //   458: anewarray java/lang/Object
    //   461: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   464: aload #6
    //   466: invokestatic b : (Lsj2;)[I
    //   469: astore #5
    //   471: aload #5
    //   473: ifnonnull -> 482
    //   476: aconst_null
    //   477: astore #5
    //   479: goto -> 492
    //   482: aload #5
    //   484: invokevirtual clone : ()Ljava/lang/Object;
    //   487: checkcast [I
    //   490: astore #5
    //   492: aload_0
    //   493: aload #5
    //   495: putfield g : [I
    //   498: aload #6
    //   500: invokestatic a : (Lsj2;)Ljava/util/ArrayList;
    //   503: astore #10
    //   505: aload_0
    //   506: new java/util/ArrayList
    //   509: dup
    //   510: invokespecial <init> : ()V
    //   513: putfield f : Ljava/util/ArrayList;
    //   516: aload #10
    //   518: ifnonnull -> 524
    //   521: goto -> 976
    //   524: aload #10
    //   526: invokevirtual size : ()I
    //   529: istore #4
    //   531: iconst_0
    //   532: istore_1
    //   533: iload_1
    //   534: iload #4
    //   536: if_icmpge -> 976
    //   539: aload #10
    //   541: iload_1
    //   542: invokevirtual get : (I)Ljava/lang/Object;
    //   545: astore #5
    //   547: iload_1
    //   548: iconst_1
    //   549: iadd
    //   550: istore_3
    //   551: aload #5
    //   553: checkcast m21
    //   556: astore #5
    //   558: aload #5
    //   560: getfield b : Ljava/lang/String;
    //   563: astore #6
    //   565: aload #6
    //   567: ldc_w 'com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK'
    //   570: invokevirtual equals : (Ljava/lang/Object;)Z
    //   573: ifne -> 831
    //   576: aload #6
    //   578: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_NEXT'
    //   581: invokevirtual equals : (Ljava/lang/Object;)Z
    //   584: ifne -> 831
    //   587: aload #6
    //   589: ldc_w 'com.google.android.gms.cast.framework.action.SKIP_PREV'
    //   592: invokevirtual equals : (Ljava/lang/Object;)Z
    //   595: ifne -> 831
    //   598: aload #6
    //   600: ldc_w 'com.google.android.gms.cast.framework.action.FORWARD'
    //   603: invokevirtual equals : (Ljava/lang/Object;)Z
    //   606: ifne -> 831
    //   609: aload #6
    //   611: ldc_w 'com.google.android.gms.cast.framework.action.REWIND'
    //   614: invokevirtual equals : (Ljava/lang/Object;)Z
    //   617: ifne -> 831
    //   620: aload #6
    //   622: ldc_w 'com.google.android.gms.cast.framework.action.STOP_CASTING'
    //   625: invokevirtual equals : (Ljava/lang/Object;)Z
    //   628: ifne -> 831
    //   631: aload #6
    //   633: ldc_w 'com.google.android.gms.cast.framework.action.DISCONNECT'
    //   636: invokevirtual equals : (Ljava/lang/Object;)Z
    //   639: ifeq -> 645
    //   642: goto -> 831
    //   645: new android/content/Intent
    //   648: dup
    //   649: aload #6
    //   651: invokespecial <init> : (Ljava/lang/String;)V
    //   654: astore #6
    //   656: aload #6
    //   658: aload_0
    //   659: getfield d : Landroid/content/ComponentName;
    //   662: invokevirtual setComponent : (Landroid/content/ComponentName;)Landroid/content/Intent;
    //   665: pop
    //   666: aload #9
    //   668: iconst_0
    //   669: aload #6
    //   671: ldc_w 67108864
    //   674: invokestatic getBroadcast : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   677: astore #11
    //   679: aload #5
    //   681: getfield c : I
    //   684: istore_1
    //   685: aload #5
    //   687: getfield e : Ljava/lang/String;
    //   690: astore #6
    //   692: iload_1
    //   693: ifne -> 702
    //   696: aconst_null
    //   697: astore #5
    //   699: goto -> 712
    //   702: aconst_null
    //   703: ldc_w ''
    //   706: iload_1
    //   707: invokestatic b : (Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;
    //   710: astore #5
    //   712: new android/os/Bundle
    //   715: dup
    //   716: invokespecial <init> : ()V
    //   719: astore #12
    //   721: aload #6
    //   723: invokestatic c : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   726: astore #13
    //   728: new java/util/ArrayList
    //   731: dup
    //   732: invokespecial <init> : ()V
    //   735: astore #14
    //   737: new java/util/ArrayList
    //   740: dup
    //   741: invokespecial <init> : ()V
    //   744: astore #6
    //   746: aload #14
    //   748: invokevirtual isEmpty : ()Z
    //   751: ifeq -> 757
    //   754: goto -> 775
    //   757: aload #14
    //   759: aload #14
    //   761: invokevirtual size : ()I
    //   764: anewarray mf1
    //   767: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   770: checkcast [Lmf1;
    //   773: astore #14
    //   775: aload #6
    //   777: invokevirtual isEmpty : ()Z
    //   780: ifeq -> 789
    //   783: aconst_null
    //   784: astore #6
    //   786: goto -> 807
    //   789: aload #6
    //   791: aload #6
    //   793: invokevirtual size : ()I
    //   796: anewarray mf1
    //   799: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   802: checkcast [Lmf1;
    //   805: astore #6
    //   807: new o21
    //   810: dup
    //   811: aload #5
    //   813: aload #13
    //   815: aload #11
    //   817: aload #12
    //   819: aload #6
    //   821: iconst_1
    //   822: iconst_1
    //   823: invokespecial <init> : (Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Lmf1;ZZ)V
    //   826: astore #5
    //   828: goto -> 839
    //   831: aload_0
    //   832: aload #6
    //   834: invokevirtual b : (Ljava/lang/String;)Lo21;
    //   837: astore #5
    //   839: iload_3
    //   840: istore_1
    //   841: aload #5
    //   843: ifnull -> 533
    //   846: aload_0
    //   847: getfield f : Ljava/util/ArrayList;
    //   850: aload #5
    //   852: invokevirtual add : (Ljava/lang/Object;)Z
    //   855: pop
    //   856: iload_3
    //   857: istore_1
    //   858: goto -> 533
    //   861: aload #5
    //   863: ldc_w 'actionsProvider == null'
    //   866: iconst_0
    //   867: anewarray java/lang/Object
    //   870: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   873: aload_0
    //   874: new java/util/ArrayList
    //   877: dup
    //   878: invokespecial <init> : ()V
    //   881: putfield f : Ljava/util/ArrayList;
    //   884: aload #10
    //   886: getfield b : Ljava/util/ArrayList;
    //   889: astore #5
    //   891: aload #5
    //   893: invokevirtual size : ()I
    //   896: istore #4
    //   898: iconst_0
    //   899: istore_1
    //   900: iload_1
    //   901: iload #4
    //   903: if_icmpge -> 951
    //   906: aload #5
    //   908: iload_1
    //   909: invokevirtual get : (I)Ljava/lang/Object;
    //   912: astore #6
    //   914: iload_1
    //   915: iconst_1
    //   916: iadd
    //   917: istore_3
    //   918: aload_0
    //   919: aload #6
    //   921: checkcast java/lang/String
    //   924: invokevirtual b : (Ljava/lang/String;)Lo21;
    //   927: astore #6
    //   929: iload_3
    //   930: istore_1
    //   931: aload #6
    //   933: ifnull -> 900
    //   936: aload_0
    //   937: getfield f : Ljava/util/ArrayList;
    //   940: aload #6
    //   942: invokevirtual add : (Ljava/lang/Object;)Z
    //   945: pop
    //   946: iload_3
    //   947: istore_1
    //   948: goto -> 900
    //   951: aload #10
    //   953: getfield c : [I
    //   956: astore #5
    //   958: aload_0
    //   959: aload #5
    //   961: aload #5
    //   963: arraylength
    //   964: invokestatic copyOf : ([II)[I
    //   967: invokevirtual clone : ()Ljava/lang/Object;
    //   970: checkcast [I
    //   973: putfield g : [I
    //   976: aload_0
    //   977: getfield f : Ljava/util/ArrayList;
    //   980: astore #5
    //   982: aload #5
    //   984: invokevirtual size : ()I
    //   987: istore_3
    //   988: iload_2
    //   989: istore_1
    //   990: iload_1
    //   991: iload_3
    //   992: if_icmpge -> 1037
    //   995: aload #5
    //   997: iload_1
    //   998: invokevirtual get : (I)Ljava/lang/Object;
    //   1001: astore #6
    //   1003: iload_1
    //   1004: iconst_1
    //   1005: iadd
    //   1006: istore_2
    //   1007: aload #6
    //   1009: checkcast o21
    //   1012: astore #6
    //   1014: iload_2
    //   1015: istore_1
    //   1016: aload #6
    //   1018: ifnull -> 990
    //   1021: aload #8
    //   1023: getfield b : Ljava/util/ArrayList;
    //   1026: aload #6
    //   1028: invokevirtual add : (Ljava/lang/Object;)Z
    //   1031: pop
    //   1032: iload_2
    //   1033: istore_1
    //   1034: goto -> 990
    //   1037: new u21
    //   1040: dup
    //   1041: invokespecial <init> : ()V
    //   1044: astore #5
    //   1046: aload_0
    //   1047: getfield g : [I
    //   1050: astore #6
    //   1052: aload #6
    //   1054: ifnull -> 1064
    //   1057: aload #5
    //   1059: aload #6
    //   1061: putfield b : [I
    //   1064: aload_0
    //   1065: getfield k : Lxn2;
    //   1068: getfield a : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   1071: astore #6
    //   1073: aload #6
    //   1075: ifnull -> 1085
    //   1078: aload #5
    //   1080: aload #6
    //   1082: putfield c : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   1085: aload #8
    //   1087: aload #5
    //   1089: invokevirtual f : (Lhd;)V
    //   1092: aload #7
    //   1094: ldc_w 'castMediaNotification'
    //   1097: iconst_1
    //   1098: aload #8
    //   1100: invokevirtual b : ()Landroid/app/Notification;
    //   1103: invokevirtual notify : (Ljava/lang/String;ILandroid/app/Notification;)V
    //   1106: return
    //   1107: ldc_w 'No intents added to TaskStackBuilder; cannot getPendingIntent'
    //   1110: invokestatic f : (Ljava/lang/String;)V
    //   1113: return
    // Exception table:
    //   from	to	target	type
    //   299	308	336	android/content/pm/PackageManager$NameNotFoundException
    //   313	333	336	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public final o21 b(String paramString) {
    IconCompat iconCompat;
    mf1[] arrayOfMf1;
    int i = paramString.hashCode();
    long l = this.h;
    ArrayList arrayList2 = null;
    CharSequence charSequence = null;
    ArrayList arrayList4 = null;
    ArrayList arrayList3 = null;
    PendingIntent pendingIntent = null;
    Bundle bundle = null;
    rp0 rp01 = null;
    ArrayList arrayList1 = null;
    Resources resources = this.j;
    a31 a311 = this.c;
    Context context = this.a;
    ComponentName componentName = this.d;
    switch (i) {
      default:
        rp01 = u;
        Log.e(rp01.a, rp01.c("Action: %s is not a pre-defined action.", new Object[] { paramString }));
        return null;
      case 1362116196:
        if (paramString.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
          if (this.q == null) {
            mf1[] arrayOfMf11;
            Intent intent = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
            intent.setComponent(componentName);
            intent.putExtra("googlecast-extra_skip_step_ms", l);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 201326592);
            rp0 rp02 = hs2.a;
            int k = l cmp 10000L;
            i = a311.m;
            if (k == 0) {
              i = a311.n;
            } else if (l == 30000L) {
              i = a311.o;
            } 
            int j = a311.A;
            if (k == 0) {
              j = a311.B;
            } else if (l == 30000L) {
              j = a311.C;
            } 
            String str = resources.getString(j);
            if (i == 0) {
              rp02 = null;
            } else {
              iconCompat = IconCompat.b(null, "", i);
            } 
            bundle = new Bundle();
            charSequence = s21.c(str);
            arrayList2 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            if (!arrayList2.isEmpty())
              arrayOfMf1 = (mf1[])arrayList2.toArray((Object[])new mf1[arrayList2.size()]); 
            if (arrayList.isEmpty()) {
              arrayList = arrayList1;
            } else {
              arrayOfMf11 = (mf1[])arrayList.toArray((Object[])new mf1[arrayList.size()]);
            } 
            this.q = new o21(iconCompat, charSequence, pendingIntent, bundle, arrayOfMf11, true, true);
          } 
          return this.q;
        } 
      case 235550565:
        if (iconCompat.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
          mf1[] arrayOfMf11;
          xn2 xn21 = this.k;
          i = xn21.c;
          if (xn21.b) {
            if (this.n == null) {
              IconCompat iconCompat1;
              int j;
              mf1[] arrayOfMf12;
              if (i == 2) {
                j = a311.h;
                i = a311.v;
              } else {
                j = a311.i;
                i = a311.w;
              } 
              Intent intent = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
              intent.setComponent(componentName);
              pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 67108864);
              String str = resources.getString(i);
              if (j == 0) {
                intent = null;
              } else {
                iconCompat1 = IconCompat.b(null, "", j);
              } 
              bundle = new Bundle();
              CharSequence charSequence1 = s21.c(str);
              ArrayList arrayList6 = new ArrayList();
              ArrayList arrayList5 = new ArrayList();
              if (!arrayList6.isEmpty())
                arrayOfMf11 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
              if (arrayList5.isEmpty()) {
                arrayOfMf12 = arrayOfMf1;
              } else {
                arrayOfMf12 = (mf1[])arrayOfMf12.toArray((Object[])new mf1[arrayOfMf12.size()]);
              } 
              this.n = new o21(iconCompat1, charSequence1, pendingIntent, bundle, arrayOfMf12, true, true);
            } 
            return this.n;
          } 
          if (this.m == null) {
            mf1[] arrayOfMf12;
            Intent intent = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            i = a311.j;
            String str = resources.getString(a311.x);
            if (i == 0) {
              intent = null;
            } else {
              iconCompat = IconCompat.b(null, "", i);
            } 
            bundle = new Bundle();
            CharSequence charSequence1 = s21.c(str);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList6.isEmpty())
              mf1[] arrayOfMf13 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
            if (arrayList5.isEmpty()) {
              arrayOfMf12 = arrayOfMf11;
            } else {
              arrayOfMf12 = (mf1[])arrayOfMf12.toArray((Object[])new mf1[arrayOfMf12.size()]);
            } 
            this.m = new o21(iconCompat, charSequence1, pendingIntent, bundle, arrayOfMf12, true, true);
          } 
          return this.m;
        } 
      case -124479363:
        if (iconCompat.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
          if (this.s == null) {
            mf1[] arrayOfMf11;
            Intent intent = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            i = a311.s;
            String str = resources.getString(a311.G, new Object[] { "" });
            if (i == 0) {
              intent = null;
            } else {
              iconCompat = IconCompat.b(null, "", i);
            } 
            bundle = new Bundle();
            CharSequence charSequence1 = s21.c(str);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList6.isEmpty())
              mf1[] arrayOfMf12 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
            if (arrayList5.isEmpty()) {
              arrayList5 = arrayList4;
            } else {
              arrayOfMf11 = (mf1[])arrayList5.toArray((Object[])new mf1[arrayList5.size()]);
            } 
            this.s = new o21(iconCompat, charSequence1, pendingIntent, bundle, arrayOfMf11, true, true);
          } 
          return this.s;
        } 
      case -668151673:
        if (iconCompat.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
          if (this.t == null) {
            mf1[] arrayOfMf11;
            Intent intent = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            i = a311.s;
            String str = resources.getString(a311.G);
            if (i == 0) {
              intent = null;
            } else {
              iconCompat = IconCompat.b(null, "", i);
            } 
            bundle = new Bundle();
            CharSequence charSequence1 = s21.c(str);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList6.isEmpty())
              mf1[] arrayOfMf12 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
            if (arrayList5.isEmpty()) {
              arrayList5 = arrayList3;
            } else {
              arrayOfMf11 = (mf1[])arrayList5.toArray((Object[])new mf1[arrayList5.size()]);
            } 
            this.t = new o21(iconCompat, charSequence1, pendingIntent, bundle, arrayOfMf11, true, true);
          } 
          return this.t;
        } 
      case -945080078:
        if (iconCompat.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
          boolean bool = this.k.g;
          if (this.p == null) {
            IconCompat iconCompat1;
            mf1[] arrayOfMf11;
            if (bool) {
              Intent intent = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
              intent.setComponent(componentName);
              PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            } else {
              iconCompat = null;
            } 
            i = a311.l;
            String str = resources.getString(a311.z);
            if (i == 0) {
              rp01 = null;
            } else {
              iconCompat1 = IconCompat.b(null, "", i);
            } 
            bundle = new Bundle();
            CharSequence charSequence1 = s21.c(str);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList6.isEmpty())
              mf1[] arrayOfMf12 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
            if (!arrayList5.isEmpty())
              arrayOfMf11 = (mf1[])arrayList5.toArray((Object[])new mf1[arrayList5.size()]); 
            this.p = new o21(iconCompat1, charSequence1, (PendingIntent)iconCompat, bundle, arrayOfMf11, true, true);
          } 
          return this.p;
        } 
      case -945151566:
        if (iconCompat.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
          boolean bool = this.k.f;
          if (this.o == null) {
            IconCompat iconCompat1;
            Bundle bundle1;
            mf1[] arrayOfMf11;
            if (bool) {
              Intent intent = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
              intent.setComponent(componentName);
              PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            } else {
              iconCompat = null;
            } 
            i = a311.k;
            String str = resources.getString(a311.y);
            if (i == 0) {
              rp01 = null;
            } else {
              iconCompat1 = IconCompat.b(null, "", i);
            } 
            Bundle bundle2 = new Bundle();
            charSequence = s21.c(str);
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList6.isEmpty())
              mf1[] arrayOfMf12 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
            if (arrayList5.isEmpty()) {
              bundle1 = bundle;
            } else {
              arrayOfMf11 = (mf1[])bundle1.toArray((Object[])new mf1[bundle1.size()]);
            } 
            this.o = new o21(iconCompat1, charSequence, (PendingIntent)iconCompat, bundle2, arrayOfMf11, true, true);
          } 
          return this.o;
        } 
      case -1699820260:
        break;
    } 
    if (iconCompat.equals("com.google.android.gms.cast.framework.action.REWIND")) {
      if (this.r == null) {
        IconCompat iconCompat1;
        mf1[] arrayOfMf11;
        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
        intent.setComponent(componentName);
        intent.putExtra("googlecast-extra_skip_step_ms", l);
        pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        rp0 rp02 = hs2.a;
        int k = l cmp 10000L;
        i = a311.p;
        if (k == 0) {
          i = a311.q;
        } else if (l == 30000L) {
          i = a311.r;
        } 
        int j = a311.D;
        if (k == 0) {
          j = a311.E;
        } else if (l == 30000L) {
          j = a311.F;
        } 
        String str = resources.getString(j);
        if (i == 0) {
          rp02 = null;
        } else {
          iconCompat1 = IconCompat.b(null, "", i);
        } 
        bundle = new Bundle();
        CharSequence charSequence1 = s21.c(str);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList6.isEmpty())
          mf1[] arrayOfMf12 = (mf1[])arrayList6.toArray((Object[])new mf1[arrayList6.size()]); 
        if (!arrayList5.isEmpty())
          arrayOfMf11 = (mf1[])arrayList5.toArray((Object[])new mf1[arrayList5.size()]); 
        this.r = new o21(iconCompat1, charSequence1, pendingIntent, bundle, arrayOfMf11, true, true);
      } 
      return this.r;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */