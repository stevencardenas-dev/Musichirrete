import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.utils.SgV.YbNJ;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParser;
import r3.IKWi.AyxAR;

public abstract class z51 {
  public static Boolean A;
  
  public static Boolean B;
  
  public static boolean C = false;
  
  public static Field D;
  
  public static boolean E = false;
  
  public static Class F;
  
  public static boolean G = false;
  
  public static Field H;
  
  public static boolean I = false;
  
  public static Field J;
  
  public static boolean K = false;
  
  public static boolean L = true;
  
  public static Field M;
  
  public static boolean N;
  
  public static final int[] a = new int[] { 16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779 };
  
  public static final int[] b = new int[] { 16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867 };
  
  public static final int[] c = new int[] { 
      16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 
      16843789, 16843979, 16843980, 16844062 };
  
  public static final int[] d = new int[] { 16842755, 16843781, 16844062 };
  
  public static final int[] e = new int[] { 16843161 };
  
  public static final int[] f = new int[] { 16842755, 16843213 };
  
  public static final Object g = new Object();
  
  public static final int[] h = new int[] { 13, 15, 14 };
  
  public static final int[] i = new int[] { 2131886586, 2131886589, 2131886583, 2131886584, 2131887027, 2131887028, 2131886477, 2131886478, 2131886437, 2131886438 };
  
  public static final int[] j = new int[] { 0, 1, 8, 9, 2, 3, 4, 5, 6, 7 };
  
  public static final int[] k = new int[] { 
      2131886974, 2131886975, 2131887027, 2131887028, 2131886477, 2131886478, 2131887602, 2131887603, 2131886437, 2131886438, 
      2131886206, 2131886207, 2131886151, 2131886152, 2131886395, 2131886396 };
  
  public static final int[] l = new int[] { 
      0, 1, 2, 3, 4, 5, 8, 9, 6, 7, 
      10, 11, 12, 13, 14, 15 };
  
  public static final int[] m = new int[] { 2131886974, 2131886975, 2131887027, 2131887028, 2131886477, 2131886478, 2131886437, 2131886438 };
  
  public static final int[] n = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
  
  public static final int[] o = new int[] { 
      0, 1, 2, 3, 38, 39, 28, 29, 30, 31, 
      4, 5, 6, 7, 8, 9, 24, 25, 26, 27, 
      12, 13, 10, 11, 14, 15, 16, 17, 18, 19, 
      20, 21, 22, 23, 1000 };
  
  public static final int[] p = new int[] { 
      2131887509, 2131887510, 2131886569, 2131886564, 2131886567, 2131886568, 2131886586, 2131886589, 2131886583, 2131886584, 
      2131886139, 2131886140, 2131886206, 2131886207, 2131886151, 2131886152, 2131886395, 2131886396, 2131886625, 2131886626, 
      2131887516, 2131887517, 2131886477, 2131886478, 2131887602, 2131887603, 2131886431, 2131886432, 2131886427, 2131886428, 
      2131886434, 2131886435, 2131886843, 2131886725, 2131887140 };
  
  public static g7 q;
  
  public static int r;
  
  public static int s;
  
  public static String t;
  
  public static final zb0 u = new zb0(22);
  
  public static Boolean v;
  
  public static Boolean w;
  
  public static Boolean x;
  
  public static Boolean y;
  
  public static Boolean z;
  
  public static Context A(Context paramContext) {
    Locale locale = o(paramContext);
    if ((paramContext.getResources().getConfiguration()).locale.equals(locale))
      return paramContext; 
    Locale.setDefault(locale);
    q = null;
    Resources resources = paramContext.getResources();
    Configuration configuration = resources.getConfiguration();
    configuration.setLocale(locale);
    paramContext = paramContext.createConfigurationContext(configuration);
    resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    return paramContext;
  }
  
  public static da0 B(XmlResourceParser paramXmlResourceParser, Resources paramResources) {
    // Byte code:
    //   0: getstatic java/util/concurrent/TimeUnit.DAYS : Ljava/util/concurrent/TimeUnit;
    //   3: astore #9
    //   5: aload_0
    //   6: invokeinterface next : ()I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_2
    //   14: if_icmpeq -> 25
    //   17: iload_2
    //   18: iconst_1
    //   19: if_icmpeq -> 25
    //   22: goto -> 5
    //   25: iload_2
    //   26: iconst_2
    //   27: if_icmpne -> 1037
    //   30: aload_0
    //   31: iconst_2
    //   32: aconst_null
    //   33: ldc 'font-family'
    //   35: invokeinterface require : (ILjava/lang/String;Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokeinterface getName : ()Ljava/lang/String;
    //   46: ldc 'font-family'
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 1031
    //   54: aload_1
    //   55: aload_0
    //   56: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   59: getstatic hc1.b : [I
    //   62: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   65: astore #10
    //   67: aload #10
    //   69: iconst_0
    //   70: invokevirtual getString : (I)Ljava/lang/String;
    //   73: astore #13
    //   75: aload #10
    //   77: iconst_5
    //   78: invokevirtual getString : (I)Ljava/lang/String;
    //   81: astore #11
    //   83: aload #10
    //   85: bipush #6
    //   87: invokevirtual getString : (I)Ljava/lang/String;
    //   90: astore #14
    //   92: aload #10
    //   94: iconst_2
    //   95: invokevirtual getString : (I)Ljava/lang/String;
    //   98: astore #12
    //   100: aload #10
    //   102: iconst_1
    //   103: iconst_0
    //   104: invokevirtual getResourceId : (II)I
    //   107: istore #4
    //   109: aload #10
    //   111: iconst_3
    //   112: iconst_1
    //   113: invokevirtual getInteger : (II)I
    //   116: istore_2
    //   117: aload #10
    //   119: iconst_4
    //   120: sipush #500
    //   123: invokevirtual getInteger : (II)I
    //   126: istore_3
    //   127: aload #10
    //   129: bipush #7
    //   131: invokevirtual getString : (I)Ljava/lang/String;
    //   134: astore #8
    //   136: aload #10
    //   138: invokevirtual recycle : ()V
    //   141: aload #13
    //   143: ifnull -> 730
    //   146: aload #11
    //   148: ifnull -> 730
    //   151: aload_1
    //   152: iload #4
    //   154: invokestatic G : (Landroid/content/res/Resources;I)Ljava/util/List;
    //   157: astore #16
    //   159: new java/util/ArrayList
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: astore #15
    //   168: aload_0
    //   169: invokeinterface next : ()I
    //   174: iconst_3
    //   175: if_icmpeq -> 625
    //   178: aload_0
    //   179: invokeinterface getEventType : ()I
    //   184: iconst_2
    //   185: if_icmpeq -> 191
    //   188: goto -> 168
    //   191: aload_0
    //   192: invokeinterface getName : ()Ljava/lang/String;
    //   197: ldc_w 'fallback'
    //   200: invokevirtual equals : (Ljava/lang/Object;)Z
    //   203: ifeq -> 618
    //   206: aload_1
    //   207: aload_0
    //   208: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   211: getstatic hc1.d : [I
    //   214: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   217: astore #10
    //   219: aload #10
    //   221: iconst_0
    //   222: invokevirtual getString : (I)Ljava/lang/String;
    //   225: astore #18
    //   227: aload #10
    //   229: iconst_1
    //   230: invokevirtual getString : (I)Ljava/lang/String;
    //   233: astore #19
    //   235: aload #10
    //   237: iconst_2
    //   238: invokevirtual getString : (I)Ljava/lang/String;
    //   241: astore #17
    //   243: aload #18
    //   245: ifnull -> 459
    //   248: aload_0
    //   249: invokeinterface next : ()I
    //   254: istore #4
    //   256: iload #4
    //   258: iconst_3
    //   259: if_icmpeq -> 273
    //   262: aload_0
    //   263: invokestatic O : (Lorg/xmlpull/v1/XmlPullParser;)V
    //   266: goto -> 248
    //   269: astore_0
    //   270: goto -> 472
    //   273: new y90
    //   276: dup
    //   277: aload #13
    //   279: aload #11
    //   281: aload #18
    //   283: aload #16
    //   285: aload #19
    //   287: aload #17
    //   289: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    //   292: astore #17
    //   294: aload #10
    //   296: instanceof java/lang/AutoCloseable
    //   299: ifeq -> 315
    //   302: aload #10
    //   304: checkcast java/lang/AutoCloseable
    //   307: invokeinterface close : ()V
    //   312: goto -> 437
    //   315: aload #10
    //   317: instanceof java/util/concurrent/ExecutorService
    //   320: ifeq -> 432
    //   323: aload #10
    //   325: checkcast java/util/concurrent/ExecutorService
    //   328: astore #18
    //   330: aload #18
    //   332: invokestatic commonPool : ()Ljava/util/concurrent/ForkJoinPool;
    //   335: if_acmpne -> 341
    //   338: goto -> 437
    //   341: aload #18
    //   343: invokeinterface isTerminated : ()Z
    //   348: istore #6
    //   350: iload #6
    //   352: ifne -> 437
    //   355: aload #18
    //   357: invokeinterface shutdown : ()V
    //   362: iconst_0
    //   363: istore #4
    //   365: iload #6
    //   367: istore #7
    //   369: iload #7
    //   371: ifne -> 418
    //   374: aload #18
    //   376: lconst_1
    //   377: aload #9
    //   379: invokeinterface awaitTermination : (JLjava/util/concurrent/TimeUnit;)Z
    //   384: istore #6
    //   386: goto -> 365
    //   389: astore #10
    //   391: iload #7
    //   393: istore #6
    //   395: iload #4
    //   397: ifne -> 365
    //   400: aload #18
    //   402: invokeinterface shutdownNow : ()Ljava/util/List;
    //   407: pop
    //   408: iconst_1
    //   409: istore #4
    //   411: iload #7
    //   413: istore #6
    //   415: goto -> 365
    //   418: iload #4
    //   420: ifeq -> 437
    //   423: invokestatic currentThread : ()Ljava/lang/Thread;
    //   426: invokevirtual interrupt : ()V
    //   429: goto -> 437
    //   432: aload #10
    //   434: invokevirtual recycle : ()V
    //   437: aload #15
    //   439: aload #17
    //   441: invokevirtual add : (Ljava/lang/Object;)Z
    //   444: pop
    //   445: goto -> 622
    //   448: astore_0
    //   449: goto -> 472
    //   452: goto -> 449
    //   455: astore_0
    //   456: goto -> 452
    //   459: new org/xmlpull/v1/XmlPullParserException
    //   462: astore_0
    //   463: aload_0
    //   464: ldc_w 'query attribute must be set in fallback element'
    //   467: invokespecial <init> : (Ljava/lang/String;)V
    //   470: aload_0
    //   471: athrow
    //   472: aload #10
    //   474: ifnull -> 616
    //   477: aload #10
    //   479: instanceof java/lang/AutoCloseable
    //   482: ifne -> 597
    //   485: aload #10
    //   487: instanceof java/util/concurrent/ExecutorService
    //   490: ifeq -> 589
    //   493: aload #10
    //   495: checkcast java/util/concurrent/ExecutorService
    //   498: astore_1
    //   499: aload_1
    //   500: invokestatic commonPool : ()Ljava/util/concurrent/ForkJoinPool;
    //   503: if_acmpeq -> 616
    //   506: aload_1
    //   507: invokeinterface isTerminated : ()Z
    //   512: istore #6
    //   514: iload #6
    //   516: ifne -> 616
    //   519: aload_1
    //   520: invokeinterface shutdown : ()V
    //   525: iconst_0
    //   526: istore_2
    //   527: iload #6
    //   529: istore #7
    //   531: iload #7
    //   533: ifne -> 576
    //   536: aload_1
    //   537: lconst_1
    //   538: aload #9
    //   540: invokeinterface awaitTermination : (JLjava/util/concurrent/TimeUnit;)Z
    //   545: istore #6
    //   547: goto -> 527
    //   550: astore #8
    //   552: iload #7
    //   554: istore #6
    //   556: iload_2
    //   557: ifne -> 527
    //   560: aload_1
    //   561: invokeinterface shutdownNow : ()Ljava/util/List;
    //   566: pop
    //   567: iconst_1
    //   568: istore_2
    //   569: iload #7
    //   571: istore #6
    //   573: goto -> 527
    //   576: iload_2
    //   577: ifeq -> 616
    //   580: invokestatic currentThread : ()Ljava/lang/Thread;
    //   583: invokevirtual interrupt : ()V
    //   586: goto -> 616
    //   589: aload #10
    //   591: invokevirtual recycle : ()V
    //   594: goto -> 616
    //   597: aload #10
    //   599: checkcast java/lang/AutoCloseable
    //   602: invokeinterface close : ()V
    //   607: goto -> 616
    //   610: astore_1
    //   611: aload_0
    //   612: aload_1
    //   613: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   616: aload_0
    //   617: athrow
    //   618: aload_0
    //   619: invokestatic O : (Lorg/xmlpull/v1/XmlPullParser;)V
    //   622: goto -> 168
    //   625: aload #15
    //   627: invokevirtual isEmpty : ()Z
    //   630: ifne -> 650
    //   633: new ga0
    //   636: dup
    //   637: aload #15
    //   639: iload_2
    //   640: iload_3
    //   641: aload #8
    //   643: invokespecial <init> : (Ljava/util/ArrayList;IILjava/lang/String;)V
    //   646: astore_0
    //   647: goto -> 720
    //   650: aload #14
    //   652: ifnull -> 722
    //   655: aload #15
    //   657: new y90
    //   660: dup
    //   661: aload #13
    //   663: aload #11
    //   665: aload #14
    //   667: aload #16
    //   669: aconst_null
    //   670: aconst_null
    //   671: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    //   674: invokevirtual add : (Ljava/lang/Object;)Z
    //   677: pop
    //   678: aload #12
    //   680: ifnull -> 706
    //   683: aload #15
    //   685: new y90
    //   688: dup
    //   689: aload #13
    //   691: aload #11
    //   693: aload #12
    //   695: aload #16
    //   697: aconst_null
    //   698: aconst_null
    //   699: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    //   702: invokevirtual add : (Ljava/lang/Object;)Z
    //   705: pop
    //   706: new ga0
    //   709: dup
    //   710: aload #15
    //   712: iload_2
    //   713: iload_3
    //   714: aload #8
    //   716: invokespecial <init> : (Ljava/util/ArrayList;IILjava/lang/String;)V
    //   719: astore_0
    //   720: aload_0
    //   721: areturn
    //   722: ldc_w 'The provider font XML requires query attribute or fallback children.'
    //   725: invokestatic l : (Ljava/lang/String;)V
    //   728: aconst_null
    //   729: areturn
    //   730: new java/util/ArrayList
    //   733: dup
    //   734: invokespecial <init> : ()V
    //   737: astore #9
    //   739: aload_0
    //   740: invokeinterface next : ()I
    //   745: iconst_3
    //   746: if_icmpeq -> 1001
    //   749: aload_0
    //   750: invokeinterface getEventType : ()I
    //   755: iconst_2
    //   756: if_icmpeq -> 762
    //   759: goto -> 739
    //   762: aload_0
    //   763: invokeinterface getName : ()Ljava/lang/String;
    //   768: ldc_w 'font'
    //   771: invokevirtual equals : (Ljava/lang/Object;)Z
    //   774: ifeq -> 994
    //   777: aload_1
    //   778: aload_0
    //   779: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   782: getstatic hc1.c : [I
    //   785: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   788: astore #11
    //   790: bipush #8
    //   792: istore_2
    //   793: aload #11
    //   795: bipush #8
    //   797: invokevirtual hasValue : (I)Z
    //   800: ifeq -> 806
    //   803: goto -> 808
    //   806: iconst_1
    //   807: istore_2
    //   808: aload #11
    //   810: iload_2
    //   811: sipush #400
    //   814: invokevirtual getInt : (II)I
    //   817: istore #4
    //   819: aload #11
    //   821: bipush #6
    //   823: invokevirtual hasValue : (I)Z
    //   826: ifeq -> 835
    //   829: bipush #6
    //   831: istore_2
    //   832: goto -> 840
    //   835: iconst_2
    //   836: istore_2
    //   837: goto -> 832
    //   840: iconst_1
    //   841: aload #11
    //   843: iload_2
    //   844: iconst_0
    //   845: invokevirtual getInt : (II)I
    //   848: if_icmpne -> 857
    //   851: iconst_1
    //   852: istore #6
    //   854: goto -> 860
    //   857: iconst_0
    //   858: istore #6
    //   860: bipush #9
    //   862: istore_2
    //   863: aload #11
    //   865: bipush #9
    //   867: invokevirtual hasValue : (I)Z
    //   870: ifeq -> 876
    //   873: goto -> 878
    //   876: iconst_3
    //   877: istore_2
    //   878: aload #11
    //   880: bipush #7
    //   882: invokevirtual hasValue : (I)Z
    //   885: ifeq -> 894
    //   888: bipush #7
    //   890: istore_3
    //   891: goto -> 896
    //   894: iconst_4
    //   895: istore_3
    //   896: aload #11
    //   898: iload_3
    //   899: invokevirtual getString : (I)Ljava/lang/String;
    //   902: astore #8
    //   904: aload #11
    //   906: iload_2
    //   907: iconst_0
    //   908: invokevirtual getInt : (II)I
    //   911: istore_3
    //   912: aload #11
    //   914: iconst_5
    //   915: invokevirtual hasValue : (I)Z
    //   918: ifeq -> 926
    //   921: iconst_5
    //   922: istore_2
    //   923: goto -> 928
    //   926: iconst_0
    //   927: istore_2
    //   928: aload #11
    //   930: iload_2
    //   931: iconst_0
    //   932: invokevirtual getResourceId : (II)I
    //   935: istore #5
    //   937: aload #11
    //   939: iload_2
    //   940: invokevirtual getString : (I)Ljava/lang/String;
    //   943: astore #10
    //   945: aload #11
    //   947: invokevirtual recycle : ()V
    //   950: aload_0
    //   951: invokeinterface next : ()I
    //   956: iconst_3
    //   957: if_icmpeq -> 967
    //   960: aload_0
    //   961: invokestatic O : (Lorg/xmlpull/v1/XmlPullParser;)V
    //   964: goto -> 950
    //   967: aload #9
    //   969: new fa0
    //   972: dup
    //   973: aload #10
    //   975: iload #4
    //   977: iload #6
    //   979: aload #8
    //   981: iload_3
    //   982: iload #5
    //   984: invokespecial <init> : (Ljava/lang/String;IZLjava/lang/String;II)V
    //   987: invokevirtual add : (Ljava/lang/Object;)Z
    //   990: pop
    //   991: goto -> 739
    //   994: aload_0
    //   995: invokestatic O : (Lorg/xmlpull/v1/XmlPullParser;)V
    //   998: goto -> 739
    //   1001: aload #9
    //   1003: invokevirtual isEmpty : ()Z
    //   1006: ifeq -> 1011
    //   1009: aconst_null
    //   1010: areturn
    //   1011: new ea0
    //   1014: dup
    //   1015: aload #9
    //   1017: iconst_0
    //   1018: anewarray fa0
    //   1021: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1024: checkcast [Lfa0;
    //   1027: invokespecial <init> : ([Lfa0;)V
    //   1030: areturn
    //   1031: aload_0
    //   1032: invokestatic O : (Lorg/xmlpull/v1/XmlPullParser;)V
    //   1035: aconst_null
    //   1036: areturn
    //   1037: new org/xmlpull/v1/XmlPullParserException
    //   1040: dup
    //   1041: ldc_w 'No start tag found'
    //   1044: invokespecial <init> : (Ljava/lang/String;)V
    //   1047: athrow
    // Exception table:
    //   from	to	target	type
    //   219	243	455	finally
    //   248	256	455	finally
    //   262	266	269	finally
    //   273	294	448	finally
    //   374	386	389	java/lang/InterruptedException
    //   459	472	448	finally
    //   477	514	610	finally
    //   519	525	610	finally
    //   536	547	550	java/lang/InterruptedException
    //   536	547	610	finally
    //   560	567	610	finally
    //   580	586	610	finally
    //   589	594	610	finally
    //   597	607	610	finally
  }
  
  public static final Object D(Object paramObject1, Object paramObject2) {
    if (paramObject1 == null)
      return paramObject2; 
    if (paramObject1 instanceof ArrayList) {
      ((ArrayList<Object>)paramObject1).add(paramObject2);
      return paramObject1;
    } 
    ArrayList<Object> arrayList = new ArrayList(4);
    arrayList.add(paramObject1);
    arrayList.add(paramObject2);
    return arrayList;
  }
  
  public static void E(int paramInt, ArrayList<?> paramArrayList) {
    if (paramArrayList != null && !paramArrayList.isEmpty()) {
      ArrayList arrayList = new ArrayList(paramArrayList);
      paramArrayList.clear();
      if (paramInt >= 0 && paramInt < arrayList.size())
        paramArrayList.add(arrayList.remove(paramInt)); 
      Random random = new Random();
      while (!arrayList.isEmpty())
        paramArrayList.add(arrayList.remove(random.nextInt(arrayList.size()))); 
    } 
  }
  
  public static ft1 F(th1 paramth1, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: ldc_w 'PRAGMA table_info(`'
    //   12: invokespecial <init> : (Ljava/lang/String;)V
    //   15: astore #12
    //   17: aload #12
    //   19: aload_1
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload #12
    //   26: ldc_w '`)'
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_0
    //   34: aload #12
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   44: astore #14
    //   46: aload #14
    //   48: invokeinterface L : ()Z
    //   53: istore #9
    //   55: lconst_0
    //   56: lstore #10
    //   58: iload #9
    //   60: ifne -> 84
    //   63: getstatic e40.b : Le40;
    //   66: astore #13
    //   68: aload #14
    //   70: aconst_null
    //   71: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   74: lconst_0
    //   75: lstore #10
    //   77: goto -> 284
    //   80: astore_0
    //   81: goto -> 911
    //   84: aload #14
    //   86: ldc_w 'name'
    //   89: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   92: istore_2
    //   93: aload #14
    //   95: ldc_w 'type'
    //   98: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   101: istore #6
    //   103: aload #14
    //   105: ldc_w 'notnull'
    //   108: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   111: istore_3
    //   112: aload #14
    //   114: ldc_w 'pk'
    //   117: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   120: istore #7
    //   122: aload #14
    //   124: ldc_w 'dflt_value'
    //   127: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   130: istore #4
    //   132: new kr0
    //   135: astore #13
    //   137: aload #13
    //   139: invokespecial <init> : ()V
    //   142: aload #14
    //   144: iload_2
    //   145: invokeinterface j : (I)Ljava/lang/String;
    //   150: astore #16
    //   152: aload #14
    //   154: iload #6
    //   156: invokeinterface j : (I)Ljava/lang/String;
    //   161: astore #15
    //   163: aload #14
    //   165: iload_3
    //   166: invokeinterface getLong : (I)J
    //   171: lload #10
    //   173: lcmp
    //   174: ifeq -> 183
    //   177: iconst_1
    //   178: istore #9
    //   180: goto -> 189
    //   183: iconst_0
    //   184: istore #9
    //   186: goto -> 180
    //   189: aload #14
    //   191: iload #7
    //   193: invokeinterface getLong : (I)J
    //   198: l2i
    //   199: istore #5
    //   201: aload #14
    //   203: iload #4
    //   205: invokeinterface isNull : (I)Z
    //   210: ifeq -> 219
    //   213: aconst_null
    //   214: astore #12
    //   216: goto -> 230
    //   219: aload #14
    //   221: iload #4
    //   223: invokeinterface j : (I)Ljava/lang/String;
    //   228: astore #12
    //   230: new ct1
    //   233: astore #17
    //   235: aload #17
    //   237: aload #16
    //   239: aload #15
    //   241: iload #9
    //   243: iload #5
    //   245: aload #12
    //   247: iconst_2
    //   248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V
    //   251: aload #13
    //   253: aload #16
    //   255: aload #17
    //   257: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   260: pop
    //   261: aload #14
    //   263: invokeinterface L : ()Z
    //   268: ifne -> 908
    //   271: aload #13
    //   273: invokevirtual b : ()Lkr0;
    //   276: astore #13
    //   278: aload #14
    //   280: aconst_null
    //   281: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   284: new java/lang/StringBuilder
    //   287: dup
    //   288: ldc_w 'PRAGMA foreign_key_list(`'
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: astore #12
    //   296: aload #12
    //   298: aload_1
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload #12
    //   305: ldc_w '`)'
    //   308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload_0
    //   313: aload #12
    //   315: invokevirtual toString : ()Ljava/lang/String;
    //   318: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   323: astore #15
    //   325: aload #15
    //   327: ldc_w 'id'
    //   330: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   333: istore_3
    //   334: aload #15
    //   336: ldc_w 'seq'
    //   339: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   342: istore_2
    //   343: aload #15
    //   345: ldc_w 'table'
    //   348: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   351: istore #7
    //   353: aload #15
    //   355: ldc_w 'on_delete'
    //   358: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   361: istore #5
    //   363: aload #15
    //   365: ldc_w 'on_update'
    //   368: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   371: istore #6
    //   373: aload #15
    //   375: invokestatic H : (Lai1;)Ljava/util/List;
    //   378: astore #12
    //   380: aload #15
    //   382: invokeinterface reset : ()V
    //   387: new dl1
    //   390: astore #16
    //   392: aload #16
    //   394: invokespecial <init> : ()V
    //   397: aload #15
    //   399: invokeinterface L : ()Z
    //   404: ifeq -> 634
    //   407: aload #15
    //   409: iload_2
    //   410: invokeinterface getLong : (I)J
    //   415: lload #10
    //   417: lcmp
    //   418: ifeq -> 424
    //   421: goto -> 397
    //   424: aload #15
    //   426: iload_3
    //   427: invokeinterface getLong : (I)J
    //   432: l2i
    //   433: istore #4
    //   435: new java/util/ArrayList
    //   438: astore #17
    //   440: aload #17
    //   442: invokespecial <init> : ()V
    //   445: new java/util/ArrayList
    //   448: astore #18
    //   450: aload #18
    //   452: invokespecial <init> : ()V
    //   455: new java/util/ArrayList
    //   458: astore #14
    //   460: aload #14
    //   462: invokespecial <init> : ()V
    //   465: aload #12
    //   467: invokeinterface iterator : ()Ljava/util/Iterator;
    //   472: astore #19
    //   474: aload #19
    //   476: invokeinterface hasNext : ()Z
    //   481: ifeq -> 521
    //   484: aload #19
    //   486: invokeinterface next : ()Ljava/lang/Object;
    //   491: astore #20
    //   493: aload #20
    //   495: checkcast ka0
    //   498: getfield b : I
    //   501: iload #4
    //   503: if_icmpne -> 514
    //   506: aload #14
    //   508: aload #20
    //   510: invokevirtual add : (Ljava/lang/Object;)Z
    //   513: pop
    //   514: goto -> 474
    //   517: astore_0
    //   518: goto -> 897
    //   521: aload #14
    //   523: invokevirtual size : ()I
    //   526: istore #8
    //   528: iconst_0
    //   529: istore #4
    //   531: iload #4
    //   533: iload #8
    //   535: if_icmpge -> 582
    //   538: aload #14
    //   540: iload #4
    //   542: invokevirtual get : (I)Ljava/lang/Object;
    //   545: astore #19
    //   547: iinc #4, 1
    //   550: aload #19
    //   552: checkcast ka0
    //   555: astore #19
    //   557: aload #17
    //   559: aload #19
    //   561: getfield e : Ljava/lang/String;
    //   564: invokevirtual add : (Ljava/lang/Object;)Z
    //   567: pop
    //   568: aload #18
    //   570: aload #19
    //   572: getfield f : Ljava/lang/String;
    //   575: invokevirtual add : (Ljava/lang/Object;)Z
    //   578: pop
    //   579: goto -> 531
    //   582: new dt1
    //   585: astore #14
    //   587: aload #14
    //   589: aload #15
    //   591: iload #7
    //   593: invokeinterface j : (I)Ljava/lang/String;
    //   598: aload #15
    //   600: iload #5
    //   602: invokeinterface j : (I)Ljava/lang/String;
    //   607: aload #15
    //   609: iload #6
    //   611: invokeinterface j : (I)Ljava/lang/String;
    //   616: aload #17
    //   618: aload #18
    //   620: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    //   623: aload #16
    //   625: aload #14
    //   627: invokevirtual add : (Ljava/lang/Object;)Z
    //   630: pop
    //   631: goto -> 397
    //   634: aload #16
    //   636: invokestatic h : (Ldl1;)Ldl1;
    //   639: astore #12
    //   641: aload #15
    //   643: aconst_null
    //   644: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   647: new java/lang/StringBuilder
    //   650: dup
    //   651: ldc_w 'PRAGMA index_list(`'
    //   654: invokespecial <init> : (Ljava/lang/String;)V
    //   657: astore #14
    //   659: aload #14
    //   661: aload_1
    //   662: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: pop
    //   666: aload #14
    //   668: ldc_w '`)'
    //   671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: aload_0
    //   676: aload #14
    //   678: invokevirtual toString : ()Ljava/lang/String;
    //   681: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   686: astore #14
    //   688: aload #14
    //   690: ldc_w 'name'
    //   693: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   696: istore_3
    //   697: aload #14
    //   699: ldc_w 'origin'
    //   702: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   705: istore_2
    //   706: aload #14
    //   708: ldc_w 'unique'
    //   711: invokestatic d : (Lai1;Ljava/lang/String;)I
    //   714: istore #4
    //   716: iload_3
    //   717: iconst_m1
    //   718: if_icmpeq -> 732
    //   721: iload_2
    //   722: iconst_m1
    //   723: if_icmpeq -> 732
    //   726: iload #4
    //   728: iconst_m1
    //   729: if_icmpne -> 735
    //   732: goto -> 864
    //   735: new dl1
    //   738: astore #15
    //   740: aload #15
    //   742: invokespecial <init> : ()V
    //   745: aload #14
    //   747: invokeinterface L : ()Z
    //   752: ifeq -> 849
    //   755: ldc_w 'c'
    //   758: aload #14
    //   760: iload_2
    //   761: invokeinterface j : (I)Ljava/lang/String;
    //   766: invokevirtual equals : (Ljava/lang/Object;)Z
    //   769: ifne -> 775
    //   772: goto -> 745
    //   775: aload #14
    //   777: iload_3
    //   778: invokeinterface j : (I)Ljava/lang/String;
    //   783: astore #16
    //   785: aload #14
    //   787: iload #4
    //   789: invokeinterface getLong : (I)J
    //   794: lconst_1
    //   795: lcmp
    //   796: ifne -> 805
    //   799: iconst_1
    //   800: istore #9
    //   802: goto -> 808
    //   805: iconst_0
    //   806: istore #9
    //   808: aload_0
    //   809: aload #16
    //   811: iload #9
    //   813: invokestatic I : (Lth1;Ljava/lang/String;Z)Let1;
    //   816: astore #16
    //   818: aload #16
    //   820: ifnonnull -> 834
    //   823: aload #14
    //   825: aconst_null
    //   826: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   829: aconst_null
    //   830: astore_0
    //   831: goto -> 872
    //   834: aload #15
    //   836: aload #16
    //   838: invokevirtual add : (Ljava/lang/Object;)Z
    //   841: pop
    //   842: goto -> 745
    //   845: astore_0
    //   846: goto -> 886
    //   849: aload #15
    //   851: invokestatic h : (Ldl1;)Ldl1;
    //   854: astore_0
    //   855: aload #14
    //   857: aconst_null
    //   858: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   861: goto -> 872
    //   864: aload #14
    //   866: aconst_null
    //   867: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   870: aconst_null
    //   871: astore_0
    //   872: new ft1
    //   875: dup
    //   876: aload_1
    //   877: aload #13
    //   879: aload #12
    //   881: aload_0
    //   882: invokespecial <init> : (Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V
    //   885: areturn
    //   886: aload_0
    //   887: athrow
    //   888: astore_1
    //   889: aload #14
    //   891: aload_0
    //   892: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   895: aload_1
    //   896: athrow
    //   897: aload_0
    //   898: athrow
    //   899: astore_1
    //   900: aload #15
    //   902: aload_0
    //   903: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   906: aload_1
    //   907: athrow
    //   908: goto -> 142
    //   911: aload_0
    //   912: athrow
    //   913: astore_1
    //   914: aload #14
    //   916: aload_0
    //   917: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   920: aload_1
    //   921: athrow
    // Exception table:
    //   from	to	target	type
    //   46	55	80	finally
    //   63	68	80	finally
    //   84	142	80	finally
    //   142	177	80	finally
    //   189	213	80	finally
    //   219	230	80	finally
    //   230	278	80	finally
    //   325	397	517	finally
    //   397	421	517	finally
    //   424	474	517	finally
    //   474	514	517	finally
    //   521	528	517	finally
    //   538	547	517	finally
    //   550	579	517	finally
    //   582	631	517	finally
    //   634	641	517	finally
    //   688	716	845	finally
    //   735	745	845	finally
    //   745	772	845	finally
    //   775	799	845	finally
    //   808	818	845	finally
    //   834	842	845	finally
    //   849	855	845	finally
    //   886	888	888	finally
    //   897	899	899	finally
    //   911	913	913	finally
  }
  
  public static List G(Resources paramResources, int paramInt) {
    if (paramInt == 0)
      return Collections.EMPTY_LIST; 
    TypedArray typedArray = paramResources.obtainTypedArray(paramInt);
    try {
      if (typedArray.length() == 0) {
        List list = Collections.EMPTY_LIST;
        typedArray.recycle();
        return list;
      } 
    } finally {}
    ArrayList<ArrayList<byte[]>> arrayList = new ArrayList();
    this();
    if (typedArray.getType(0) == 1) {
      for (paramInt = 0; paramInt < typedArray.length(); paramInt++) {
        int i = typedArray.getResourceId(paramInt, 0);
        if (i != 0) {
          String[] arrayOfString = paramResources.getStringArray(i);
          ArrayList<byte[]> arrayList1 = new ArrayList();
          this();
          int j = arrayOfString.length;
          for (i = 0; i < j; i++)
            arrayList1.add(Base64.decode(arrayOfString[i], 0)); 
          arrayList.add(arrayList1);
        } 
      } 
    } else {
      String[] arrayOfString = paramResources.getStringArray(paramInt);
      ArrayList<byte[]> arrayList1 = new ArrayList();
      this();
      int i = arrayOfString.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        arrayList1.add(Base64.decode(arrayOfString[paramInt], 0)); 
      arrayList.add(arrayList1);
    } 
    typedArray.recycle();
    return arrayList;
  }
  
  public static final List H(ai1 paramai1) {
    int i = zo2.d(paramai1, "id");
    int j = zo2.d(paramai1, "seq");
    int k = zo2.d(paramai1, "from");
    int m = zo2.d(paramai1, "to");
    tn0 tn0 = new tn0(10);
    while (paramai1.L()) {
      int i1 = (int)paramai1.getLong(i);
      int n = (int)paramai1.getLong(j);
      tn0.add(new ka0(paramai1.j(k), i1, n, paramai1.j(m)));
    } 
    return nm.r0(zo2.b(tn0));
  }
  
  public static final et1 I(th1 paramth1, String paramString, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder("PRAGMA index_xinfo(`");
    stringBuilder.append(paramString);
    stringBuilder.append("`)");
    ai1 ai1 = paramth1.O(stringBuilder.toString());
    try {
      int m = zo2.d(ai1, "seqno");
      int j = zo2.d(ai1, "cid");
      int k = zo2.d(ai1, "name");
      int i = zo2.d(ai1, "desc");
      if (m == -1 || j == -1 || k == -1 || i == -1) {
        d(ai1, null);
        return null;
      } 
      linkedHashMap2 = new LinkedHashMap<Object, Object>();
      this();
      linkedHashMap1 = new LinkedHashMap<Object, Object>();
      this();
      while (ai1.L()) {
        String str1;
        if ((int)ai1.getLong(j) < 0)
          continue; 
        int n = (int)ai1.getLong(m);
        String str2 = ai1.j(k);
        if (ai1.getLong(i) > 0L) {
          str1 = "DESC";
        } else {
          str1 = "ASC";
        } 
        linkedHashMap2.put(Integer.valueOf(n), str2);
        linkedHashMap1.put(Integer.valueOf(n), str1);
      } 
    } finally {}
    Set<Map.Entry<Object, Object>> set2 = linkedHashMap2.entrySet();
    ij ij1 = new ij();
    this(9);
    LinkedHashMap<Object, Object> linkedHashMap1;
    LinkedHashMap<Object, Object> linkedHashMap2;
    List list3 = nm.s0(set2, ij1);
    ArrayList<String> arrayList1 = new ArrayList();
    this(pm.k0(list3));
    Iterator<Map.Entry> iterator2 = list3.iterator();
    while (iterator2.hasNext())
      arrayList1.add((String)((Map.Entry)iterator2.next()).getValue()); 
    List list1 = nm.v0(arrayList1);
    Set<Map.Entry<Object, Object>> set1 = linkedHashMap1.entrySet();
    ij ij2 = new ij();
    this(10);
    List list2 = nm.s0(set1, ij2);
    ArrayList<String> arrayList2 = new ArrayList();
    this(pm.k0(list2));
    Iterator<Map.Entry> iterator1 = list2.iterator();
    while (iterator1.hasNext())
      arrayList2.add((String)((Map.Entry)iterator1.next()).getValue()); 
    et1 et1 = new et1(paramString, paramBoolean, list1, nm.v0(arrayList2));
    d(ai1, null);
    return et1;
  }
  
  public static void J() {
    (b()).e = null;
  }
  
  public static void K(CheckBox paramCheckBox, int paramInt) {
    if (dd1.O(dd1.j0(paramCheckBox.getContext(), 16842806, 0))) {
      i = -16777216;
    } else {
      i = -1;
    } 
    int i = dd1.b(i, 0.3F);
    int[] arrayOfInt2 = { 16842910, -16842912 };
    int[] arrayOfInt3 = { 16842910, 16842912 };
    int[] arrayOfInt1 = { -16842910, 16842912 };
    int j = dd1.j0(paramCheckBox.getContext(), 2130968901, 0);
    paramCheckBox.setButtonTintList(new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt3, { -16842910, -16842912 }, , arrayOfInt1 }, new int[] { j, paramInt, i, i }));
  }
  
  public static void L(EditText paramEditText, int paramInt) {
    Context context = paramEditText.getContext();
    int i = dd1.j0(context, 2130968901, 0);
    int j = dd1.j0(context, 2130968901, 0);
    ColorStateList colorStateList = new ColorStateList(new int[][] { { -16842910 }, , { -16842919, -16842908 }, , {} }, new int[] { i, j, paramInt });
    if (paramEditText instanceof a7) {
      ((a7)paramEditText).setSupportBackgroundTintList(colorStateList);
    } else {
      paramEditText.setBackgroundTintList(colorStateList);
    } 
    try {
      Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
      field.setAccessible(true);
      i = field.getInt(paramEditText);
      field = TextView.class.getDeclaredField("mEditor");
      field.setAccessible(true);
      Object object = field.get(paramEditText);
      field = object.getClass().getDeclaredField("mCursorDrawable");
      field.setAccessible(true);
      Drawable drawable1 = paramEditText.getContext().getDrawable(i);
      Drawable drawable2 = paramEditText.getContext().getDrawable(i);
      Drawable[] arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = drawable1;
      arrayOfDrawable[1] = drawable2;
      drawable2 = arrayOfDrawable[0];
      PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
      drawable2.setColorFilter(paramInt, mode);
      arrayOfDrawable[1].setColorFilter(paramInt, mode);
      field.set(object, arrayOfDrawable);
    } catch (Exception exception) {}
  }
  
  public static void N(Context paramContext, String paramString, Runnable paramRunnable, int paramInt) {
    Drawable drawable = paramContext.getResources().getDrawable(2131231068).mutate();
    drawable.setColorFilter(m92.h[5], PorterDuff.Mode.SRC_ATOP);
    ag0.L0(paramContext, paramContext.getApplicationContext().getString(2131887437), drawable, paramString, paramInt, new int[] { 
          0, 1, 2, 3, 38, 39, 28, 29, 30, 31, 
          4, 5, 6, 7, 8, 9, 24, 25, 26, 27, 
          12, 13, 10, 11, 14, 15, 16, 17, 18, 19, 
          20, 21, 22, 23 }, new int[] { 
          2131887509, 2131887510, 2131886569, 2131886564, 2131886567, 2131886568, 2131886586, 2131886589, 2131886583, 2131886584, 
          2131886139, 2131886140, 2131886206, 2131886207, 2131886151, 2131886152, 2131886395, 2131886396, 2131886625, 2131886626, 
          2131887516, 2131887517, 2131886477, 2131886478, 2131887602, 2131887603, 2131886431, 2131886432, 2131886427, 2131886428, 
          2131886434, 2131886435, 2131886843, 2131886725 }, paramRunnable);
  }
  
  public static void O(XmlPullParser paramXmlPullParser) {
    for (byte b = 1; b; b++) {
      int i = paramXmlPullParser.next();
      if (i != 2) {
        if (i != 3)
          continue; 
        b--;
        continue;
      } 
    } 
  }
  
  public static void P(ArrayList<?> paramArrayList, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int i = paramInt % 2;
    paramInt -= i;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    if (paramInt == 0) {
      Collections.sort(paramArrayList, new bo1(paramBoolean1, paramBoolean2, bool, 0));
      return;
    } 
    if (paramInt == 2) {
      Collections.sort(paramArrayList, new ao1(1, bool));
      return;
    } 
    if (paramInt == 4) {
      Collections.sort(paramArrayList, new ao1(2, bool));
      return;
    } 
    if (paramInt == 6) {
      Collections.sort(paramArrayList, new ao1(3, bool));
      return;
    } 
    if (paramInt == 8) {
      Collections.sort(paramArrayList, new bo1(paramBoolean1, paramBoolean2, bool, 1));
      return;
    } 
    if (paramInt == 10) {
      Collections.sort(paramArrayList, new bo1(paramBoolean1, paramBoolean2, bool, 2));
      return;
    } 
    if (paramInt == 12) {
      Collections.sort(paramArrayList, new bo1(paramBoolean1, paramBoolean2, bool, 3));
      return;
    } 
    if (paramInt == 14)
      Collections.sort(paramArrayList, new bo1(paramBoolean1, paramBoolean2, bool, 4)); 
  }
  
  public static void Q(int paramInt, ArrayList<?> paramArrayList) {
    int i = paramInt % 2;
    paramInt -= i;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    if (paramInt == 0) {
      Collections.sort(paramArrayList, new ao1(15, bool));
      return;
    } 
    if (paramInt == 8) {
      Collections.sort(paramArrayList, new ao1(16, bool));
      return;
    } 
    if (paramInt == 2) {
      Collections.sort(paramArrayList, new ao1(18, bool));
      return;
    } 
    if (paramInt == 4) {
      Collections.sort(paramArrayList, new ao1(19, bool));
      return;
    } 
    if (paramInt == 6)
      Collections.sort(paramArrayList, new ao1(20, bool)); 
  }
  
  public static void R(int paramInt, ArrayList<?> paramArrayList) {
    if (paramInt < 0);
    int i = paramInt % 2;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    switch (paramInt - i) {
      default:
        return;
      case 1000:
        E(-1, paramArrayList);
        return;
      case 38:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(17, bool));
          return;
        } 
      case 36:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(11, bool));
          return;
        } 
      case 34:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(12, bool));
          return;
        } 
      case 32:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(27, bool));
          return;
        } 
      case 30:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(5, bool));
          return;
        } 
      case 28:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(24, bool));
          return;
        } 
      case 26:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(0, bool));
          return;
        } 
      case 24:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(4, bool));
          return;
        } 
      case 22:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(14, bool));
          return;
        } 
      case 20:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(13, bool));
          return;
        } 
      case 18:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(22, bool));
          return;
        } 
      case 16:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(23, bool));
          return;
        } 
      case 14:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(8, bool));
          return;
        } 
      case 12:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(10, bool));
          return;
        } 
      case 10:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(25, bool));
          return;
        } 
      case 8:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(21, bool));
          return;
        } 
      case 6:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(6, bool));
          return;
        } 
      case 4:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(7, bool));
          return;
        } 
      case 2:
        if (paramArrayList != null && !paramArrayList.isEmpty()) {
          Collections.sort(paramArrayList, new ao1(9, bool));
          return;
        } 
      case 0:
        break;
    } 
    if (paramArrayList == null || paramArrayList.isEmpty());
    Collections.sort(paramArrayList, new ao1(26, bool));
  }
  
  public static void S(v00 paramv00, File paramFile) {
    try {
      String str = paramFile.getCanonicalPath();
      FileInputStream fileInputStream = ws2.n(paramv00);
      ZipInputStream zipInputStream = new ZipInputStream();
      BufferedInputStream bufferedInputStream = new BufferedInputStream();
      this(fileInputStream);
      this(bufferedInputStream);
      byte[] arrayOfByte = new byte[1024];
      while (true) {
        SecurityException securityException;
        ZipEntry zipEntry = zipInputStream.getNextEntry();
        return;
      } 
    } finally {
      paramv00 = null;
      paramv00.printStackTrace();
    } 
  }
  
  public static final void T(List paramList, BufferedWriter paramBufferedWriter) {
    if (!paramList.isEmpty()) {
      Iterator<List> iterator = paramList.iterator();
      for (byte b = 0; iterator.hasNext(); b++) {
        String str1;
        String str2;
        paramList = iterator.next();
        if (b)
          paramBufferedWriter.write(","); 
        if (paramList instanceof String) {
          boolean bool;
          str2 = (String)paramList;
          if (gq1.H0(str2, ",") || gq1.H0(str2, "\"") || gq1.H0(str2, "\n") || gq1.H0(str2, "\r")) {
            bool = true;
          } else {
            bool = false;
          } 
          str1 = str2;
          if (gq1.H0(str2, "\""))
            str1 = oq1.E0(str2, "\"", "\"\""); 
          str2 = str1;
          if (bool)
            str2 = x41.w("\"", str1, "\""); 
        } else {
          str2 = str1.toString();
        } 
        paramBufferedWriter.write(str2);
      } 
    } 
  }
  
  public static final boolean U(v00 paramv00, String paramString, int paramInt) {
    paramString.getClass();
    if (paramv00 != null) {
      try {
        OutputStream outputStream = ws2.r(paramv00);
        outputStream.getClass();
        Charset charset = lk.a;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter();
        this(outputStream, charset);
        BufferedWriter bufferedWriter = new BufferedWriter();
        this(outputStreamWriter, 8192);
        try {
          u51 u51 = l51.f(paramString);
          Object object = u51.b;
          if (paramInt == 1) {
            try {
              ArrayList arrayList = m92.F(u51);
              T(om.h0((Object[])new String[] { "ARTIST", "PERCENTAGE" }, ), bufferedWriter);
              Iterator<u51> iterator = arrayList.iterator();
              iterator.getClass();
              while (iterator.hasNext()) {
                u51 u511 = iterator.next();
                bufferedWriter.newLine();
                T(om.h0(new Object[] { u511.a, u511.b }, ), bufferedWriter);
              } 
            } finally {}
          } else {
            T(om.h0((Object[])new String[] { "FILE_PATH", "TITLE", "ARTIST", "ALBUM", "ALBUM_ARTIST", "COMPOSER", "GENRE", "YEAR", "DURATION_MS", "PLAY_COUNT" }, ), bufferedWriter);
            if (object != null) {
              ArrayList<u51> arrayList = (ArrayList)u51.a;
              if (arrayList != null) {
                boolean bool1;
                int j = arrayList.size();
                paramInt = 0;
                int i = 0;
                while (true) {
                  if (i < j) {
                    u51 = arrayList.get(i);
                    int k = i + 1;
                    if (paramInt >= 0) {
                      km0 km0 = (km0)u51;
                      if (km0 != null) {
                        int m;
                        int n;
                        qn1 qn1 = km0.c;
                        bufferedWriter.newLine();
                        String str1 = km0.h;
                        String str3 = km0.g;
                        StringBuilder stringBuilder = new StringBuilder();
                        this();
                        stringBuilder.append(str1);
                        stringBuilder.append("/");
                        stringBuilder.append(str3);
                        String str2 = ml0.f(stringBuilder.toString());
                        str1 = str2;
                        if (str2 == null)
                          str1 = ""; 
                        String str5 = qn1.b;
                        String str7 = qn1.e;
                        String str4 = qn1.c;
                        String str6 = km0.j;
                        str3 = km0.f;
                        try {
                          str2 = km0.e;
                          n = km0.p;
                          m = qn1.g;
                          Integer integer = ((ArrayList<Integer>)object).get(paramInt);
                          if (integer != null) {
                            i = integer.intValue();
                          } else {
                            i = 0;
                          } 
                        } finally {}
                        T(om.h0(new Object[] { str1, str5, str7, str4, str6, str3, str2, Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i) }, ), bufferedWriter);
                      } 
                      paramInt++;
                      i = k;
                      continue;
                    } 
                    om.j0();
                    throw null;
                  } 
                  try {
                    return true;
                  } finally {
                    u51 = null;
                    bool1 = true;
                  } 
                } 
                u51.printStackTrace();
                return bool1;
              } 
            } 
          } 
        } finally {}
        try {
          return true;
        } finally {
          outputStreamWriter = null;
          boolean bool1 = true;
        } 
      } finally {}
    } else {
      return false;
    } 
    boolean bool = false;
    paramv00.printStackTrace();
    return bool;
  }
  
  public static int W(int paramInt) {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }
  
  public static String X(String paramString, Object... paramVarArgs) {
    int k;
    int i = paramVarArgs.length;
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + i * 16);
    i = 0;
    int j = 0;
    while (true) {
      k = paramVarArgs.length;
      if (i < k) {
        int m = paramString.indexOf(YbNJ.LPoBuGESHZQY, j);
        if (m == -1)
          break; 
        stringBuilder.append(paramString, j, m);
        stringBuilder.append(Y(paramVarArgs[i]));
        j = m + 2;
        i++;
        continue;
      } 
      break;
    } 
    stringBuilder.append(paramString, j, paramString.length());
    if (i < k) {
      for (paramString = jLnXOLx.dPC; i < paramVarArgs.length; paramString = AyxAR.mMOatYD) {
        stringBuilder.append(paramString);
        stringBuilder.append(Y(paramVarArgs[i]));
        i++;
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static String Y(Object paramObject) {
    if (paramObject == null)
      return "null"; 
    try {
      return paramObject.toString();
    } catch (Exception exception) {
      String str = paramObject.getClass().getName();
      paramObject = Integer.toHexString(System.identityHashCode(paramObject));
      paramObject = x41.l(str, AyxAR.ULdrRbhjKqx, (String)paramObject);
      Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat((String)paramObject), exception);
      str = exception.getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(RqlokDsQOju.DTXHmwNJPR);
      stringBuilder.append((String)paramObject);
      stringBuilder.append(" threw ");
      stringBuilder.append(str);
      stringBuilder.append(ybWnIKHovcRr.XYPunvoTeryM);
      return stringBuilder.toString();
    } 
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public static g7 b() {
    if (q == null) {
      try {
        t = MyApplication.o().getString("igthar_wl", "A An The");
        r = MyApplication.o().getInt("igthar_t", 0);
        s = MyApplication.o().getInt("alpnmsr_t", 0);
      } finally {
        Exception exception;
      } 
      String str = t;
      if (str != null) {
        String[] arrayOfString = str.split("(\\s)+");
      } else {
        str = null;
      } 
      q = new g7((String[])str);
    } 
    return q;
  }
  
  public static void c(String paramString, Object paramObject) {
    if (paramObject != null)
      return; 
    k91.h(paramString);
  }
  
  public static final void d(ai1 paramai1, Throwable paramThrowable) {
    if (paramai1 != null) {
      ExecutorService executorService;
      if (paramThrowable == null) {
        if (paramai1 instanceof AutoCloseable) {
          paramai1.close();
        } else if (paramai1 instanceof ExecutorService) {
          executorService = (ExecutorService)paramai1;
          if (executorService != ForkJoinPool.commonPool()) {
            boolean bool = executorService.isTerminated();
            if (!bool) {
              executorService.shutdown();
              boolean bool1 = false;
              while (true) {
                boolean bool2 = bool;
                if (!bool2) {
                  try {
                    bool = executorService.awaitTermination(1L, TimeUnit.DAYS);
                  } catch (InterruptedException interruptedException) {
                    bool = bool2;
                    if (!bool1) {
                      executorService.shutdownNow();
                      bool1 = true;
                      bool = bool2;
                    } 
                  } 
                  continue;
                } 
                if (bool1)
                  Thread.currentThread().interrupt(); 
                break;
              } 
            } 
          } 
        } else if (executorService instanceof TypedArray) {
          ((TypedArray)executorService).recycle();
        } else if (executorService instanceof MediaMetadataRetriever) {
          ((MediaMetadataRetriever)executorService).release();
        } else if (executorService instanceof MediaDrm) {
          ((MediaDrm)executorService).release();
        } else {
          l0.k();
          return;
        } 
      } else {
        try {
          return;
        } finally {
          executorService = null;
        } 
      } 
    } 
  }
  
  public static ko1 e(Context paramContext) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{ws2}} */
    try {
      if (ws2.c == null) {
        bu bu = new bu();
        Context context = paramContext.getApplicationContext();
        if (context != null)
          paramContext = context; 
        this(paramContext);
        gd2 gd21 = new gd2();
        this(bu);
        ws2.c = gd21;
      } 
    } finally {}
    gd2 gd2 = ws2.c;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{ws2}} */
    return (ko1)gd2.c.a();
  }
  
  public static boolean g(Object paramObject1, Object paramObject2) {
    return (paramObject1 != paramObject2) ? ((paramObject1 != null && paramObject1.equals(paramObject2))) : true;
  }
  
  public static void h(Resources paramResources, Locale paramLocale) {
    Locale.setDefault(paramLocale);
    q = null;
    Configuration configuration = paramResources.getConfiguration();
    configuration.setLocale(paramLocale);
    paramResources.updateConfiguration(configuration, paramResources.getDisplayMetrics());
  }
  
  public static Locale i(String paramString) {
    try {
      JSONArray jSONArray;
      return new Locale(jSONArray.getString(0), jSONArray.getString(1), jSONArray.getString(2));
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public static void j() {
    synchronized (g) {
      IllegalStateException illegalStateException = new IllegalStateException();
      this("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
      throw illegalStateException;
    } 
  }
  
  public static ArrayList k() {
    String str;
    ArrayList<Locale> arrayList = new ArrayList();
    Locale locale1 = n();
    Locale locale2 = i(MyApplication.r);
    arrayList.add(locale1);
    Locale locale9 = new Locale("hi", "");
    Locale locale10 = new Locale("pa", "");
    Locale locale13 = new Locale("af", "");
    Locale locale11 = new Locale("sv", "");
    Locale locale18 = new Locale("cs", "");
    Locale locale17 = new Locale("de", "");
    Locale locale3 = new Locale("el", "");
    Locale locale8 = new Locale("ja", "");
    Locale locale7 = new Locale("sk", "");
    Locale locale5 = new Locale("bg", "");
    Locale locale12 = new Locale("ko", "");
    Locale locale16 = new Locale("sr", "");
    Locale locale15 = new Locale("tr", "");
    Locale locale14 = new Locale("pl", "");
    Locale locale6 = new Locale("ta", "");
    Locale locale4 = new Locale("te", "");
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      str = "id";
    } else {
      str = "in";
    } 
    Locale locale28 = new Locale(str, "");
    Locale locale26 = new Locale("pt", "BR");
    Locale locale22 = new Locale("uk", "");
    Locale locale31 = new Locale("zh", "CN");
    Locale locale32 = new Locale(GMDx.Csmb, "");
    Locale locale30 = new Locale("hu", "");
    Locale locale23 = new Locale("ar", "");
    Locale locale24 = new Locale("vi", "");
    Locale locale29 = new Locale("zh", "TW");
    Locale locale27 = new Locale("es", "");
    Locale locale20 = new Locale("fr", "");
    Locale locale25 = new Locale("it", "");
    Locale locale21 = new Locale("fa", "");
    Locale locale19 = new Locale("ru", "");
    if (i >= 35) {
      str = "he";
    } else {
      str = "iw";
    } 
    List<Locale> list = Arrays.asList(new Locale[] { 
          locale9, locale10, locale13, locale11, locale18, locale17, locale3, locale8, locale7, locale5, 
          locale12, locale16, locale15, locale14, locale6, locale4, locale28, locale26, locale22, locale31, 
          locale32, locale30, locale23, locale24, locale29, locale27, locale20, locale25, locale21, locale19, 
          new Locale(str, ""), new Locale("kn", ""), new Locale("ro", ""), new Locale("mr", ""), new Locale("gu", "") });
    Collections.sort(list, new rl0(0, locale1));
    Collections.sort(list, new rl0(1, locale2));
    Collections.sort(list, new rl0(2, locale2));
    arrayList.addAll(list);
    return arrayList;
  }
  
  public static int m(Context paramContext) {
    DisplayMetrics displayMetrics = paramContext.getResources().getDisplayMetrics();
    if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
      i = 1;
    } else {
      i = 0;
    } 
    TypedValue typedValue = new TypedValue();
    Resources resources = paramContext.getResources();
    if (i) {
      i = 2131166115;
    } else {
      i = 2131166114;
    } 
    resources.getValue(i, typedValue, true);
    int i = typedValue.type;
    if (i == 5) {
      float f = typedValue.getDimension(displayMetrics);
      return (int)f;
    } 
    if (i == 6) {
      i = displayMetrics.widthPixels;
      float f = typedValue.getFraction(i, i);
      return (int)f;
    } 
    return -2;
  }
  
  public static Locale n() {
    Locale locale = new Locale("en");
    if (Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
      Locale locale1 = i(MyApplication.r);
      locale = new Locale(locale.getLanguage(), locale1.getCountry(), locale.getVariant());
      try {
        String str = locale.getISO3Country();
      } finally {
        locale1 = null;
      } 
      return locale;
    } 
    return locale;
  }
  
  public static Locale o(Context paramContext) {
    byte b = 0;
    SharedPreferences sharedPreferences = paramContext.getSharedPreferences("PP", 0);
    Locale locale = null;
    String str = sharedPreferences.getString("k_s_lng", null);
    if (str != null) {
      Locale locale2 = i(str);
      Locale locale1 = locale2;
      if (Locale.ENGLISH.getLanguage().equals(locale2.getLanguage())) {
        locale1 = i(MyApplication.r);
        locale2 = new Locale(locale2.getLanguage(), locale1.getCountry(), locale2.getVariant());
        try {
        
        } finally {
          locale1 = null;
        } 
        if (TextUtils.isEmpty((CharSequence)locale1)) {
          locale1 = Locale.ENGLISH;
        } else {
          locale1 = locale2;
        } 
      } 
      ArrayList<Locale> arrayList = k();
      int i = arrayList.size();
      while (b < i) {
        locale = arrayList.get(b);
        b++;
        if (locale.getLanguage().equals(locale1.getLanguage()))
          return locale1; 
      } 
      return n();
    } 
    return i(MyApplication.r);
  }
  
  public static c22 r(Bundle paramBundle) {
    try {
      paramBundle = (Bundle)paramBundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
      if (paramBundle != null) {
        paramBundle.setClassLoader(z51.class.getClassLoader());
        Parcelable parcelable = paramBundle.getParcelable("a");
        if (parcelable instanceof ParcelImpl)
          return ((ParcelImpl)parcelable).b; 
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        this("Invalid parcel");
        throw illegalArgumentException;
      } 
    } catch (RuntimeException runtimeException) {}
    return null;
  }
  
  public static boolean s(Context paramContext) {
    PackageManager packageManager = paramContext.getPackageManager();
    if (A == null) {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
        bool = true;
      } else {
        bool = false;
      } 
      A = Boolean.valueOf(bool);
    } 
    return A.booleanValue();
  }
  
  public static boolean t(Resources paramResources) {
    boolean bool = false;
    if (paramResources == null)
      return false; 
    if (y == null) {
      Configuration configuration = paramResources.getConfiguration();
      boolean bool1 = bool;
      if ((configuration.screenLayout & 0xF) <= 3) {
        bool1 = bool;
        if (configuration.smallestScreenWidthDp >= 600)
          bool1 = true; 
      } 
      y = Boolean.valueOf(bool1);
    } 
    return y.booleanValue();
  }
  
  public static boolean u(Context paramContext) {
    Resources resources = paramContext.getResources();
    boolean bool = false;
    if (resources == null)
      return false; 
    if (w == null) {
      if (((resources.getConfiguration()).screenLayout & 0xF) > 3 || t(resources))
        bool = true; 
      w = Boolean.valueOf(bool);
    } 
    return w.booleanValue();
  }
  
  public static boolean v(Context paramContext) {
    PackageManager packageManager = paramContext.getPackageManager();
    if (B == null) {
      boolean bool;
      if (packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback")) {
        bool = true;
      } else {
        bool = false;
      } 
      B = Boolean.valueOf(bool);
    } 
    return B.booleanValue();
  }
  
  public static boolean w(int paramInt) {
    return ((paramInt & s) != 0);
  }
  
  public static boolean x(int paramInt) {
    b();
    return ((paramInt & r) != 0);
  }
  
  public static final boolean y(char paramChar) {
    return (Character.isWhitespace(paramChar) || Character.isSpaceChar(paramChar));
  }
  
  public static int z(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean1, boolean paramBoolean2) {
    g7 g71 = b();
    Pattern pattern = (Pattern)g71.c;
    CharSequence charSequence2 = paramCharSequence1;
    CharSequence charSequence1 = paramCharSequence2;
    if (paramBoolean1) {
      charSequence2 = paramCharSequence1;
      charSequence1 = paramCharSequence2;
      if (pattern != null) {
        Matcher matcher2 = pattern.matcher(paramCharSequence1);
        CharSequence charSequence = paramCharSequence1;
        if (matcher2.find()) {
          int i = matcher2.end();
          charSequence = paramCharSequence1;
          if (i < paramCharSequence1.length())
            charSequence = CharBuffer.wrap(paramCharSequence1, i, paramCharSequence1.length()); 
        } 
        Matcher matcher1 = pattern.matcher(paramCharSequence2);
        charSequence2 = charSequence;
        charSequence1 = paramCharSequence2;
        if (matcher1.find()) {
          int i = matcher1.end();
          charSequence2 = charSequence;
          charSequence1 = paramCharSequence2;
          if (i < paramCharSequence2.length()) {
            charSequence1 = CharBuffer.wrap(paramCharSequence2, i, paramCharSequence2.length());
            charSequence2 = charSequence;
          } 
        } 
      } 
    } 
    if ((gh1)g71.e == null)
      g71.e = new gh1(6); 
    gh1 gh1 = (gh1)g71.e;
    gh1.getClass();
    Collator collator = (Collator)gh1.c;
    if (paramBoolean2) {
      if (charSequence2 instanceof CharBuffer) {
        paramCharSequence1 = charSequence2;
      } else {
        paramCharSequence1 = CharBuffer.wrap(charSequence2);
      } 
      if (charSequence1 instanceof CharBuffer) {
        paramCharSequence2 = charSequence1;
      } else {
        paramCharSequence2 = CharBuffer.wrap(charSequence1);
      } 
      while (paramCharSequence1.hasRemaining() && paramCharSequence2.hasRemaining()) {
        int i;
        gh1.p((CharBuffer)paramCharSequence1);
        gh1.p((CharBuffer)paramCharSequence2);
        boolean bool = false;
        if (gh1.o(paramCharSequence1.charAt(0)) && gh1.o(paramCharSequence2.charAt(0))) {
          i = paramCharSequence1.length() - paramCharSequence2.length();
          if (i == 0) {
            byte b = 0;
            while (true) {
              i = bool;
              if (b < paramCharSequence1.remaining()) {
                i = bool;
                if (b < paramCharSequence2.remaining()) {
                  i = paramCharSequence1.charAt(b) - paramCharSequence2.charAt(b);
                  if (i != 0)
                    break; 
                  b++;
                  continue;
                } 
              } 
              break;
            } 
          } 
        } else if (collator != null) {
          i = collator.compare(paramCharSequence1.toString(), paramCharSequence2.toString());
        } else {
          i = paramCharSequence1.toString().compareToIgnoreCase(paramCharSequence2.toString());
        } 
        if (i != 0)
          return i; 
        paramCharSequence1.position(paramCharSequence1.limit()).limit(paramCharSequence1.capacity());
        paramCharSequence2.position(paramCharSequence2.limit()).limit(paramCharSequence2.capacity());
      } 
      return charSequence2.length() - charSequence1.length();
    } 
    if (charSequence2 instanceof CharBuffer) {
      paramCharSequence1 = charSequence2;
    } else {
      paramCharSequence1 = CharBuffer.wrap(charSequence2);
    } 
    if (charSequence1 instanceof CharBuffer) {
      paramCharSequence2 = charSequence1;
    } else {
      paramCharSequence2 = CharBuffer.wrap(charSequence1);
    } 
    return (collator != null) ? collator.compare(paramCharSequence1.toString(), paramCharSequence2.toString()) : paramCharSequence1.toString().compareToIgnoreCase(paramCharSequence2.toString());
  }
  
  public abstract Object C(Intent paramIntent, int paramInt);
  
  public void M(View paramView, float paramFloat) {
    if (L)
      try {
        e42.b(paramView, paramFloat);
        return;
      } catch (NoSuchMethodError noSuchMethodError) {
        L = false;
      }  
    paramView.setAlpha(paramFloat);
  }
  
  public abstract Intent f(Context paramContext, Object paramObject);
  
  public abstract void l(fm1 paramfm1, float paramFloat1, float paramFloat2);
  
  public s0 p(Context paramContext, Object paramObject) {
    return null;
  }
  
  public float q(View paramView) {
    if (L)
      try {
        return e42.a(paramView);
      } catch (NoSuchMethodError noSuchMethodError) {
        L = false;
      }  
    return paramView.getAlpha();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */