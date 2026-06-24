import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.Html;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public abstract class n0 {
  public static void A(Activity paramActivity, int paramInt) {
    ActivityInfo activityInfo1;
    String str;
    Intent intent2;
    ActivityInfo activityInfo2 = null;
    try {
      int i = Build.VERSION.SDK_INT;
      if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
        i = 1;
      } else {
        i = 0;
      } 
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
    if (Build.VERSION.SDK_INT >= 30) {
      str = "android.intent.action.OPEN_DOCUMENT";
    } else {
      str = "android.intent.action.GET_CONTENT";
    } 
    Intent intent1 = new Intent(str);
    intent1.addCategory("android.intent.category.OPENABLE");
    intent1.setType("image/*");
    try {
      intent2 = Intent.createChooser(intent1, "Select image from...");
      if (activityInfo1 != null)
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Parcelable[] { (Parcelable)activityInfo1 }); 
    } finally {}
    paramActivity.startActivityForResult(intent2, paramInt);
  }
  
  public static su0 B(MediaRoute2Info paramMediaRoute2Info) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 7
    //   4: goto -> 724
    //   7: new n2
    //   10: dup
    //   11: aload_0
    //   12: invokevirtual getId : ()Ljava/lang/String;
    //   15: aload_0
    //   16: invokevirtual getName : ()Ljava/lang/CharSequence;
    //   19: invokeinterface toString : ()Ljava/lang/String;
    //   24: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   27: astore_3
    //   28: aload_3
    //   29: getfield c : Ljava/lang/Object;
    //   32: checkcast android/os/Bundle
    //   35: astore #4
    //   37: aload #4
    //   39: ldc 'connectionState'
    //   41: aload_0
    //   42: invokevirtual getConnectionState : ()I
    //   45: invokevirtual putInt : (Ljava/lang/String;I)V
    //   48: aload #4
    //   50: ldc 'volumeHandling'
    //   52: aload_0
    //   53: invokevirtual getVolumeHandling : ()I
    //   56: invokevirtual putInt : (Ljava/lang/String;I)V
    //   59: aload #4
    //   61: ldc 'volumeMax'
    //   63: aload_0
    //   64: invokevirtual getVolumeMax : ()I
    //   67: invokevirtual putInt : (Ljava/lang/String;I)V
    //   70: aload #4
    //   72: ldc 'volume'
    //   74: aload_0
    //   75: invokevirtual getVolume : ()I
    //   78: invokevirtual putInt : (Ljava/lang/String;I)V
    //   81: aload_0
    //   82: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   85: astore #5
    //   87: aload #5
    //   89: ifnonnull -> 103
    //   92: aload #4
    //   94: ldc 'extras'
    //   96: aconst_null
    //   97: invokevirtual putBundle : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   100: goto -> 119
    //   103: aload #4
    //   105: ldc 'extras'
    //   107: new android/os/Bundle
    //   110: dup
    //   111: aload #5
    //   113: invokespecial <init> : (Landroid/os/Bundle;)V
    //   116: invokevirtual putBundle : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   119: aload #4
    //   121: ldc 'enabled'
    //   123: iconst_1
    //   124: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   127: aload #4
    //   129: ldc 'canDisconnect'
    //   131: iconst_0
    //   132: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   135: getstatic android/os/Build$VERSION.SDK_INT : I
    //   138: bipush #34
    //   140: if_icmplt -> 446
    //   143: aload #4
    //   145: ldc 'deduplicationIds'
    //   147: new java/util/ArrayList
    //   150: dup
    //   151: aload_0
    //   152: invokestatic g : (Landroid/media/MediaRoute2Info;)Ljava/util/Set;
    //   155: invokespecial <init> : (Ljava/util/Collection;)V
    //   158: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   161: aload_0
    //   162: invokestatic j : (Landroid/media/MediaRoute2Info;)I
    //   165: istore_2
    //   166: iconst_2
    //   167: istore_1
    //   168: iload_2
    //   169: iconst_2
    //   170: if_icmpeq -> 440
    //   173: iload_2
    //   174: iconst_3
    //   175: if_icmpeq -> 434
    //   178: iload_2
    //   179: iconst_4
    //   180: if_icmpeq -> 428
    //   183: iload_2
    //   184: bipush #22
    //   186: if_icmpeq -> 422
    //   189: iload_2
    //   190: bipush #23
    //   192: if_icmpeq -> 416
    //   195: iload_2
    //   196: bipush #26
    //   198: if_icmpeq -> 410
    //   201: iload_2
    //   202: bipush #29
    //   204: if_icmpeq -> 404
    //   207: iload_2
    //   208: sipush #2000
    //   211: if_icmpeq -> 397
    //   214: iload_2
    //   215: tableswitch default -> 252, 8 -> 392, 9 -> 386, 10 -> 380, 11 -> 374, 12 -> 368, 13 -> 362
    //   252: iload_2
    //   253: tableswitch default -> 308, 1001 -> 357, 1002 -> 448, 1003 -> 352, 1004 -> 347, 1005 -> 341, 1006 -> 335, 1007 -> 329, 1008 -> 323, 1009 -> 317, 1010 -> 311
    //   308: goto -> 446
    //   311: bipush #11
    //   313: istore_1
    //   314: goto -> 448
    //   317: bipush #10
    //   319: istore_1
    //   320: goto -> 448
    //   323: bipush #9
    //   325: istore_1
    //   326: goto -> 448
    //   329: bipush #8
    //   331: istore_1
    //   332: goto -> 448
    //   335: bipush #7
    //   337: istore_1
    //   338: goto -> 448
    //   341: bipush #6
    //   343: istore_1
    //   344: goto -> 448
    //   347: iconst_5
    //   348: istore_1
    //   349: goto -> 448
    //   352: iconst_4
    //   353: istore_1
    //   354: goto -> 448
    //   357: iconst_1
    //   358: istore_1
    //   359: goto -> 448
    //   362: bipush #19
    //   364: istore_1
    //   365: goto -> 448
    //   368: bipush #18
    //   370: istore_1
    //   371: goto -> 448
    //   374: bipush #17
    //   376: istore_1
    //   377: goto -> 448
    //   380: bipush #23
    //   382: istore_1
    //   383: goto -> 448
    //   386: bipush #16
    //   388: istore_1
    //   389: goto -> 448
    //   392: iconst_3
    //   393: istore_1
    //   394: goto -> 448
    //   397: sipush #1000
    //   400: istore_1
    //   401: goto -> 448
    //   404: bipush #24
    //   406: istore_1
    //   407: goto -> 448
    //   410: bipush #22
    //   412: istore_1
    //   413: goto -> 448
    //   416: bipush #21
    //   418: istore_1
    //   419: goto -> 448
    //   422: bipush #20
    //   424: istore_1
    //   425: goto -> 448
    //   428: bipush #14
    //   430: istore_1
    //   431: goto -> 448
    //   434: bipush #13
    //   436: istore_1
    //   437: goto -> 448
    //   440: bipush #12
    //   442: istore_1
    //   443: goto -> 448
    //   446: iconst_0
    //   447: istore_1
    //   448: aload_0
    //   449: invokevirtual getDescription : ()Ljava/lang/CharSequence;
    //   452: astore #5
    //   454: aload #5
    //   456: ifnull -> 473
    //   459: aload #4
    //   461: ldc 'status'
    //   463: aload #5
    //   465: invokeinterface toString : ()Ljava/lang/String;
    //   470: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   473: aload_0
    //   474: invokevirtual getIconUri : ()Landroid/net/Uri;
    //   477: astore #5
    //   479: aload #5
    //   481: ifnull -> 496
    //   484: aload #4
    //   486: ldc 'iconUri'
    //   488: aload #5
    //   490: invokevirtual toString : ()Ljava/lang/String;
    //   493: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   496: aload_0
    //   497: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   500: astore #5
    //   502: aload #5
    //   504: ifnull -> 724
    //   507: aload #5
    //   509: ldc 'androidx.mediarouter.media.KEY_EXTRAS'
    //   511: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   514: ifeq -> 724
    //   517: aload #5
    //   519: ldc 'androidx.mediarouter.media.KEY_DEVICE_TYPE'
    //   521: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   524: ifeq -> 724
    //   527: aload #5
    //   529: ldc 'androidx.mediarouter.media.KEY_CONTROL_FILTERS'
    //   531: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   534: ifne -> 540
    //   537: goto -> 724
    //   540: aload #5
    //   542: ldc 'androidx.mediarouter.media.KEY_EXTRAS'
    //   544: invokevirtual getBundle : (Ljava/lang/String;)Landroid/os/Bundle;
    //   547: astore #6
    //   549: aload #6
    //   551: ifnonnull -> 565
    //   554: aload #4
    //   556: ldc 'extras'
    //   558: aconst_null
    //   559: invokevirtual putBundle : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   562: goto -> 581
    //   565: aload #4
    //   567: ldc 'extras'
    //   569: new android/os/Bundle
    //   572: dup
    //   573: aload #6
    //   575: invokespecial <init> : (Landroid/os/Bundle;)V
    //   578: invokevirtual putBundle : (Ljava/lang/String;Landroid/os/Bundle;)V
    //   581: iload_1
    //   582: ifeq -> 588
    //   585: goto -> 597
    //   588: aload #5
    //   590: ldc 'androidx.mediarouter.media.KEY_DEVICE_TYPE'
    //   592: iconst_0
    //   593: invokevirtual getInt : (Ljava/lang/String;I)I
    //   596: istore_1
    //   597: aload #4
    //   599: ldc 'deviceType'
    //   601: iload_1
    //   602: invokevirtual putInt : (Ljava/lang/String;I)V
    //   605: aload #4
    //   607: ldc 'playbackType'
    //   609: aload #5
    //   611: ldc 'androidx.mediarouter.media.KEY_PLAYBACK_TYPE'
    //   613: iconst_1
    //   614: invokevirtual getInt : (Ljava/lang/String;I)I
    //   617: invokevirtual putInt : (Ljava/lang/String;I)V
    //   620: aload #5
    //   622: ldc 'androidx.mediarouter.media.KEY_CONTROL_FILTERS'
    //   624: invokevirtual getParcelableArrayList : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   627: astore #6
    //   629: aload #6
    //   631: ifnull -> 640
    //   634: aload_3
    //   635: aload #6
    //   637: invokevirtual e : (Ljava/util/ArrayList;)V
    //   640: aload_0
    //   641: invokevirtual getFeatures : ()Ljava/util/List;
    //   644: astore_0
    //   645: aload_0
    //   646: ldc_w 'android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE'
    //   649: invokeinterface contains : (Ljava/lang/Object;)Z
    //   654: ifeq -> 666
    //   657: aload #4
    //   659: ldc_w 'isDynamicGroupRoute'
    //   662: iconst_1
    //   663: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   666: aload_0
    //   667: ldc_w 'android.media.route.feature.REMOTE_GROUP_PLAYBACK'
    //   670: invokeinterface contains : (Ljava/lang/Object;)Z
    //   675: ifeq -> 719
    //   678: aload #5
    //   680: ldc_w 'androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS'
    //   683: invokevirtual getStringArrayList : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   686: astore_0
    //   687: aload_0
    //   688: ifnull -> 709
    //   691: aload_0
    //   692: invokevirtual isEmpty : ()Z
    //   695: ifeq -> 701
    //   698: goto -> 709
    //   701: aload_3
    //   702: aload_0
    //   703: invokevirtual g : (Ljava/util/ArrayList;)V
    //   706: goto -> 719
    //   709: ldc_w 'MediaRouter2Utils'
    //   712: ldc_w 'Invalid feature of a group without members'
    //   715: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   718: pop
    //   719: aload_3
    //   720: invokevirtual k : ()Lsu0;
    //   723: areturn
    //   724: aconst_null
    //   725: areturn
  }
  
  public static void a(qo paramqo, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: iload_1
    //   6: ifne -> 76
    //   9: getstatic m92.f : I
    //   12: ifne -> 76
    //   15: new hs1
    //   18: astore #4
    //   20: new ps
    //   23: astore_3
    //   24: aload_3
    //   25: iconst_3
    //   26: invokespecial <init> : (I)V
    //   29: aload #4
    //   31: iconst_0
    //   32: iconst_1
    //   33: aload_3
    //   34: invokespecial <init> : (IILwc0;)V
    //   37: sipush #128
    //   40: bipush #27
    //   42: bipush #27
    //   44: bipush #27
    //   46: invokestatic argb : (IIII)I
    //   49: istore_2
    //   50: new hs1
    //   53: astore_3
    //   54: new ps
    //   57: astore #5
    //   59: aload #5
    //   61: iconst_3
    //   62: invokespecial <init> : (I)V
    //   65: aload_3
    //   66: iload_2
    //   67: iconst_1
    //   68: aload #5
    //   70: invokespecial <init> : (IILwc0;)V
    //   73: goto -> 118
    //   76: new hs1
    //   79: astore #4
    //   81: new ps
    //   84: astore_3
    //   85: aload_3
    //   86: iconst_4
    //   87: invokespecial <init> : (I)V
    //   90: aload #4
    //   92: iconst_0
    //   93: iconst_2
    //   94: aload_3
    //   95: invokespecial <init> : (IILwc0;)V
    //   98: new ps
    //   101: astore_3
    //   102: aload_3
    //   103: iconst_4
    //   104: invokespecial <init> : (I)V
    //   107: new hs1
    //   110: dup
    //   111: iconst_0
    //   112: iconst_2
    //   113: aload_3
    //   114: invokespecial <init> : (IILwc0;)V
    //   117: astore_3
    //   118: aload_0
    //   119: aload #4
    //   121: aload_3
    //   122: invokestatic a : (Lqo;Lhs1;Lhs1;)V
    //   125: aload_0
    //   126: invokevirtual getWindow : ()Landroid/view/Window;
    //   129: astore_3
    //   130: aload_3
    //   131: ldc_w -2147483648
    //   134: invokevirtual addFlags : (I)V
    //   137: aload_3
    //   138: invokevirtual getDecorView : ()Landroid/view/View;
    //   141: astore_0
    //   142: aload_0
    //   143: invokevirtual getClass : ()Ljava/lang/Class;
    //   146: pop
    //   147: getstatic android/os/Build$VERSION.SDK_INT : I
    //   150: istore_2
    //   151: iload_2
    //   152: bipush #35
    //   154: if_icmpne -> 187
    //   157: aload_0
    //   158: invokevirtual getSystemUiVisibility : ()I
    //   161: istore_2
    //   162: iload_2
    //   163: sipush #1792
    //   166: iand
    //   167: sipush #1792
    //   170: if_icmpeq -> 187
    //   173: aload_0
    //   174: iload_2
    //   175: sipush #1792
    //   178: ior
    //   179: invokevirtual setSystemUiVisibility : (I)V
    //   182: aload_3
    //   183: iconst_0
    //   184: invokevirtual setDecorFitsSystemWindows : (Z)V
    //   187: getstatic b32.a : Landroid/view/WindowInsets;
    //   190: astore_3
    //   191: getstatic android/os/Build$VERSION.SDK_INT : I
    //   194: bipush #30
    //   196: if_icmplt -> 202
    //   199: goto -> 235
    //   202: new a32
    //   205: astore_3
    //   206: aload_3
    //   207: invokespecial <init> : ()V
    //   210: aload_0
    //   211: ldc_w 2131297573
    //   214: aload_3
    //   215: invokevirtual setTag : (ILjava/lang/Object;)V
    //   218: aload_0
    //   219: aload_3
    //   220: invokevirtual setOnApplyWindowInsetsListener : (Landroid/view/View$OnApplyWindowInsetsListener;)V
    //   223: iconst_1
    //   224: putstatic b32.b : Z
    //   227: goto -> 235
    //   230: astore_0
    //   231: aload_0
    //   232: invokevirtual printStackTrace : ()V
    //   235: return
    //   236: astore_3
    //   237: goto -> 187
    // Exception table:
    //   from	to	target	type
    //   9	73	230	finally
    //   76	118	230	finally
    //   118	151	230	finally
    //   157	162	236	finally
    //   173	187	236	finally
    //   187	199	230	finally
    //   202	227	230	finally
  }
  
  public static String b(long paramLong) {
    double d1 = paramLong;
    double d2 = d1 / 1.073741824E9D;
    if (d2 > 1.0D)
      return String.format(Locale.ENGLISH, "%.2f GB", new Object[] { Double.valueOf(d2) }); 
    d2 = d1 / 1048576.0D;
    if (d2 > 1.0D)
      return String.format(Locale.ENGLISH, "%.2f MB", new Object[] { Double.valueOf(d2) }); 
    d1 /= 1024.0D;
    if (d1 > 1.0D)
      return String.format(Locale.ENGLISH, "%.2f KB", new Object[] { Double.valueOf(d1) }); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(d1);
    stringBuilder.append("bytes");
    return stringBuilder.toString();
  }
  
  public static Bitmap c(Activity paramActivity, Bitmap paramBitmap) {
    Display display;
    if (Build.VERSION.SDK_INT >= 30) {
      display = paramActivity.getDisplay();
    } else {
      display = ((WindowManager)MyApplication.i.getApplicationContext().getSystemService("window")).getDefaultDisplay();
    } 
    Point point = new Point();
    display.getRealSize(point);
    int i = point.y;
    return ag0.v0(paramBitmap, point.x, i);
  }
  
  public static Icon d(Uri paramUri) {
    return Icon.createWithAdaptiveBitmapContentUri(paramUri);
  }
  
  public static String e(double paramDouble, int paramInt) {
    byte b = 0;
    int i = 0;
    while (b < paramInt) {
      if (Math.round(Math.pow(10.0D, b) * paramDouble * 10.0D) % 10L != 0L)
        i = b + 1; 
      b++;
    } 
    String str2 = String.format(Locale.ENGLISH, x41.i(i, "%.", "f"), new Object[] { Double.valueOf(paramDouble) });
    String str1 = str2;
    if (str2.equals("0")) {
      if (paramInt == 0)
        return LHyji.uBxoUZrO; 
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(1.0D / Math.pow(10.0D, paramInt));
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public static int f(int paramInt) {
    int i = paramInt;
    if (paramInt >= 4)
      if (paramInt > 1600) {
        i = paramInt;
      } else {
        int k = 27;
        int[] arrayOfInt = new int[27];
        arrayOfInt[0] = 8;
        arrayOfInt[1] = 16;
        arrayOfInt[2] = 32;
        arrayOfInt[3] = 40;
        arrayOfInt[4] = 48;
        arrayOfInt[5] = 56;
        arrayOfInt[6] = 64;
        arrayOfInt[7] = 80;
        arrayOfInt[8] = 96;
        arrayOfInt[9] = 112;
        arrayOfInt[10] = 128;
        arrayOfInt[11] = 144;
        arrayOfInt[12] = 160;
        arrayOfInt[13] = 192;
        arrayOfInt[14] = 224;
        arrayOfInt[15] = 256;
        arrayOfInt[16] = 320;
        arrayOfInt[17] = 384;
        arrayOfInt[18] = 448;
        arrayOfInt[19] = 512;
        arrayOfInt[20] = 576;
        arrayOfInt[21] = 640;
        arrayOfInt[22] = 768;
        arrayOfInt[23] = 960;
        arrayOfInt[24] = 1152;
        arrayOfInt[25] = 1344;
        arrayOfInt[26] = 1536;
        i = 0;
        int j = arrayOfInt[0];
        if (paramInt <= j)
          return j; 
        j = arrayOfInt[26];
        if (paramInt >= j)
          return j; 
        j = 0;
        while (true) {
          if (i < k) {
            try {
              j = (i + k) / 2;
              int m = arrayOfInt[j];
              return m;
            } finally {
              arrayOfInt = null;
            } 
          } else {
            i = arrayOfInt[j];
          } 
          return i;
        } 
      }  
    return i;
  }
  
  public static int[] g(y51 paramy511, y51 paramy512) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #16
    //   3: ldc_w -16777216
    //   6: istore #10
    //   8: iconst_m1
    //   9: istore #15
    //   11: aload_0
    //   12: ifnonnull -> 21
    //   15: aconst_null
    //   16: astore #17
    //   18: goto -> 27
    //   21: aload_0
    //   22: getfield d : Lx51;
    //   25: astore #17
    //   27: aload #17
    //   29: ifnull -> 56
    //   32: aload_0
    //   33: getfield d : Lx51;
    //   36: getfield d : I
    //   39: istore #11
    //   41: iload #11
    //   43: ldc_w -16777216
    //   46: ior
    //   47: istore #10
    //   49: goto -> 61
    //   52: astore_0
    //   53: goto -> 542
    //   56: ldc_w -16777216
    //   59: istore #10
    //   61: aload_0
    //   62: ifnull -> 219
    //   65: aload_1
    //   66: ifnull -> 219
    //   69: aload #17
    //   71: ifnull -> 219
    //   74: aload_1
    //   75: getstatic lt1.e : Llt1;
    //   78: invokevirtual g : (Llt1;)Lx51;
    //   81: astore #16
    //   83: aload_1
    //   84: getstatic lt1.h : Llt1;
    //   87: invokevirtual g : (Llt1;)Lx51;
    //   90: astore #18
    //   92: aload #16
    //   94: ifnull -> 124
    //   97: aload #16
    //   99: astore_0
    //   100: aload #16
    //   102: getfield d : I
    //   105: iload #10
    //   107: invokestatic d : (II)D
    //   110: ldc2_w 3.5
    //   113: dcmpg
    //   114: ifge -> 151
    //   117: goto -> 124
    //   120: astore_0
    //   121: goto -> 542
    //   124: iload #10
    //   126: invokestatic E0 : (I)Z
    //   129: ifeq -> 143
    //   132: aload_1
    //   133: getstatic lt1.d : Llt1;
    //   136: invokevirtual g : (Llt1;)Lx51;
    //   139: astore_0
    //   140: goto -> 151
    //   143: aload_1
    //   144: getstatic lt1.f : Llt1;
    //   147: invokevirtual g : (Llt1;)Lx51;
    //   150: astore_0
    //   151: aload #18
    //   153: ifnull -> 186
    //   156: aload #18
    //   158: astore #16
    //   160: aload #18
    //   162: getfield d : I
    //   165: iload #10
    //   167: invokestatic d : (II)D
    //   170: ldc2_w 3.0
    //   173: dcmpg
    //   174: ifge -> 180
    //   177: goto -> 186
    //   180: aload #16
    //   182: astore_1
    //   183: goto -> 224
    //   186: iload #10
    //   188: invokestatic E0 : (I)Z
    //   191: ifeq -> 208
    //   194: aload_1
    //   195: getstatic lt1.g : Llt1;
    //   198: invokevirtual g : (Llt1;)Lx51;
    //   201: astore_1
    //   202: aload_1
    //   203: astore #16
    //   205: goto -> 180
    //   208: aload_1
    //   209: getstatic lt1.i : Llt1;
    //   212: invokevirtual g : (Llt1;)Lx51;
    //   215: astore_1
    //   216: goto -> 202
    //   219: aconst_null
    //   220: astore_1
    //   221: aload #16
    //   223: astore_0
    //   224: iload #15
    //   226: istore #11
    //   228: iload #10
    //   230: istore #12
    //   232: aload #17
    //   234: ifnull -> 554
    //   237: aload_0
    //   238: ifnull -> 258
    //   241: aload_0
    //   242: getfield d : I
    //   245: istore #11
    //   247: iload #11
    //   249: ldc_w -16777216
    //   252: ior
    //   253: istore #14
    //   255: goto -> 273
    //   258: aload #17
    //   260: invokevirtual a : ()V
    //   263: aload #17
    //   265: getfield h : I
    //   268: istore #11
    //   270: goto -> 247
    //   273: aload_1
    //   274: ifnull -> 286
    //   277: aload_1
    //   278: getfield d : I
    //   281: istore #13
    //   283: goto -> 298
    //   286: aload #17
    //   288: invokevirtual a : ()V
    //   291: aload #17
    //   293: getfield g : I
    //   296: istore #13
    //   298: iload #14
    //   300: iload #10
    //   302: invokestatic d : (II)D
    //   305: dstore #8
    //   307: iload #13
    //   309: iload #10
    //   311: invokestatic d : (II)D
    //   314: dstore #4
    //   316: iload #13
    //   318: istore #11
    //   320: iload #14
    //   322: istore #12
    //   324: dload #8
    //   326: dstore #6
    //   328: dload #4
    //   330: dstore_2
    //   331: dload #8
    //   333: ldc2_w 3.5
    //   336: dcmpl
    //   337: iflt -> 410
    //   340: iload #13
    //   342: istore #11
    //   344: iload #14
    //   346: istore #12
    //   348: dload #8
    //   350: dstore #6
    //   352: dload #4
    //   354: dstore_2
    //   355: dload #4
    //   357: ldc2_w 3.0
    //   360: dcmpl
    //   361: iflt -> 410
    //   364: iload #13
    //   366: istore #11
    //   368: iload #14
    //   370: istore #12
    //   372: dload #8
    //   374: dstore #6
    //   376: dload #4
    //   378: dstore_2
    //   379: dload #4
    //   381: dload #8
    //   383: dsub
    //   384: ldc2_w 2.0
    //   387: dcmpl
    //   388: iflt -> 410
    //   391: iload #13
    //   393: ldc_w -16777216
    //   396: ior
    //   397: istore #12
    //   399: iload #14
    //   401: istore #11
    //   403: dload #8
    //   405: dstore_2
    //   406: dload #4
    //   408: dstore #6
    //   410: ldc2_w 2.147483647E9
    //   413: dstore #8
    //   415: dload #6
    //   417: dstore #4
    //   419: dload #6
    //   421: ldc2_w 3.5
    //   424: dcmpl
    //   425: iflt -> 433
    //   428: ldc2_w 2.147483647E9
    //   431: dstore #4
    //   433: dload_2
    //   434: dstore #6
    //   436: dload_2
    //   437: ldc2_w 3.0
    //   440: dcmpl
    //   441: iflt -> 449
    //   444: ldc2_w 2.147483647E9
    //   447: dstore #6
    //   449: dload #4
    //   451: dstore_2
    //   452: dload #4
    //   454: ldc2_w 3.5
    //   457: dcmpg
    //   458: ifge -> 481
    //   461: aload #17
    //   463: invokevirtual a : ()V
    //   466: aload #17
    //   468: getfield h : I
    //   471: ldc_w -16777216
    //   474: ior
    //   475: istore #12
    //   477: ldc2_w 2.147483647E9
    //   480: dstore_2
    //   481: dload #6
    //   483: ldc2_w 3.0
    //   486: dcmpg
    //   487: ifge -> 509
    //   490: aload #17
    //   492: invokevirtual a : ()V
    //   495: aload #17
    //   497: getfield g : I
    //   500: istore #11
    //   502: dload #8
    //   504: dstore #6
    //   506: goto -> 509
    //   509: dload_2
    //   510: dload #6
    //   512: dcmpg
    //   513: ifge -> 531
    //   516: iload #11
    //   518: ldc_w -16777216
    //   521: ior
    //   522: istore #11
    //   524: iload #10
    //   526: istore #12
    //   528: goto -> 554
    //   531: iload #12
    //   533: istore #11
    //   535: iload #10
    //   537: istore #12
    //   539: goto -> 554
    //   542: aload_0
    //   543: invokevirtual printStackTrace : ()V
    //   546: iload #10
    //   548: istore #12
    //   550: iload #15
    //   552: istore #11
    //   554: iconst_2
    //   555: newarray int
    //   557: dup
    //   558: iconst_0
    //   559: iload #12
    //   561: iastore
    //   562: dup
    //   563: iconst_1
    //   564: iload #11
    //   566: iastore
    //   567: areturn
    // Exception table:
    //   from	to	target	type
    //   21	27	52	finally
    //   32	41	52	finally
    //   74	92	120	finally
    //   100	117	120	finally
    //   124	140	120	finally
    //   143	151	120	finally
    //   160	177	120	finally
    //   186	202	120	finally
    //   208	216	120	finally
    //   241	247	120	finally
    //   258	270	120	finally
    //   277	283	120	finally
    //   286	298	120	finally
    //   298	316	120	finally
    //   461	477	120	finally
    //   490	502	120	finally
  }
  
  public static Rect h(WindowManager paramWindowManager) {
    return paramWindowManager.getCurrentWindowMetrics().getBounds();
  }
  
  public static void i(int paramInt) {
    SdkExtensions.getExtensionVersion(paramInt);
  }
  
  public static Uri j(u00 paramu00) {
    if (paramu00 != null) {
      try {
        Uri uri = paramu00.j();
        if (uri.toString().startsWith(uvJYmft.mObmjybt)) {
          String str1;
          String str2 = uri.toString();
          str2 = Uri.decode(str2.substring(str2.lastIndexOf('/') + 1));
          if (paramu00 instanceof v00) {
            str1 = ((v00)paramu00).w();
          } else {
            paramu00 = null;
          } 
          Uri.Builder builder2 = new Uri.Builder();
          this();
          Uri.Builder builder1 = builder2.scheme(uri.getScheme()).authority(uri.getAuthority());
          if (TextUtils.isEmpty((CharSequence)paramu00)) {
            str1 = "root";
          } else {
            str1 = "document";
          } 
          return builder1.appendPath(str1).appendPath(str2).build();
        } 
      } finally {}
      if (paramu00 instanceof lw0) {
        String str1;
        paramu00 = paramu00;
        String str3 = paramu00.w();
        String str2 = paramu00.y();
        StringBuilder stringBuilder = new StringBuilder();
        this("content://com.android.externalstorage.documents");
        if (TextUtils.isEmpty(str3)) {
          str1 = "/root/";
        } else {
          str1 = "/document/";
        } 
        stringBuilder.append(str1);
        if ("primary".equals(str2)) {
          str1 = str2;
        } else {
          str1 = String.valueOf(str2).toUpperCase(Locale.ENGLISH);
        } 
        stringBuilder.append(str1);
        if (TextUtils.isEmpty(str3)) {
          str1 = "";
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          this(":");
          stringBuilder1.append(Uri.encode(str3));
          str1 = stringBuilder1.toString();
        } 
        stringBuilder.append(str1);
        return Uri.parse(stringBuilder.toString());
      } 
    } 
    return null;
  }
  
  public static void k(pc parampc, int paramInt, ArrayList paramArrayList) {
    PendingIntent pendingIntent = MediaStore.createWriteRequest(MyApplication.i.getApplicationContext().getContentResolver(), paramArrayList);
    try {
      parampc.startIntentSenderForResult(pendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
      return;
    } catch (android.content.IntentSender.SendIntentException sendIntentException) {
      sendIntentException.printStackTrace();
      return;
    } 
  }
  
  public static Bitmap l(Bitmap paramBitmap, int paramInt) {
    Bitmap bitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
    Paint paint = new Paint();
    Rect rect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF rectF = new RectF(rect);
    float f = paramInt;
    paint.setAntiAlias(true);
    canvas.drawARGB(0, 0, 0, 0);
    paint.setColor(-12434878);
    canvas.drawRoundRect(rectF, f, f, paint);
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    canvas.drawBitmap(paramBitmap, rect, rect, paint);
    return bitmap;
  }
  
  public static ArrayList m(List paramList) {
    if (paramList == null)
      return new ArrayList(); 
    ArrayList<String> arrayList = new ArrayList();
    for (MediaRoute2Info mediaRoute2Info : paramList) {
      if (mediaRoute2Info == null)
        continue; 
      arrayList.add(mediaRoute2Info.getId());
    } 
    return arrayList;
  }
  
  public static CharSequence n(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getStateDescription();
  }
  
  public static void o(pc parampc, Runnable paramRunnable, String paramString) {
    try {
      String str = parampc.getString(2131887563);
      ms0 ms0 = new ms0();
      this((Context)parampc);
      StringBuilder stringBuilder = new StringBuilder();
      this("<small>");
      stringBuilder.append(paramString);
      stringBuilder.append("</small>");
      ms0.f = (CharSequence)Html.fromHtml(stringBuilder.toString());
      ms0.d(str);
      ms0.n(2131886577);
      ms0.k(2131886679);
      vn vn = new vn();
      this(5, parampc, paramRunnable);
      ms0.D = vn;
      int[] arrayOfInt = m92.h;
      int i = arrayOfInt[6];
      ms0.m = i;
      ms0.u0 = true;
      ms0.x = dd1.w(ms0.b, i);
      ms0.x0 = true;
      ms0.P = false;
      return;
    } finally {
      parampc = null;
      parampc.printStackTrace();
    } 
  }
  
  public static boolean p() {
    try {
      ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
      this();
      ActivityManager.getMyMemoryState(runningAppProcessInfo);
      int i = runningAppProcessInfo.importance;
      return (i == 200 || i == 100 || i == 125);
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public static v00 q(v00 paramv00, ArrayList<Object> paramArrayList) {
    int i = paramArrayList.size();
    byte b = 0;
    while (b < i) {
      v00 v001 = (v00)paramArrayList.get(b);
      b++;
      v001 = v001;
      if (paramv00.b.toString().equals(v001.b.toString()) || paramv00.C(v001))
        return v001; 
    } 
    return null;
  }
  
  public static boolean r() {
    return MyApplication.p().isIgnoringBatteryOptimizations(MyApplication.i.getApplicationContext().getPackageName());
  }
  
  public static void s(ContextWrapper paramContextWrapper, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContextWrapper.registerReceiver(paramBroadcastReceiver, paramIntentFilter, null, null, 2);
      return;
    } 
    paramContextWrapper.registerReceiver(paramBroadcastReceiver, paramIntentFilter, null, null);
  }
  
  public static void t(Activity paramActivity, Drawable paramDrawable, int paramInt) {
    try {
      no no = new no();
      return;
    } finally {
      paramActivity = null;
      paramActivity.printStackTrace();
    } 
  }
  
  public static void u(Window paramWindow, boolean paramBoolean) {
    View view = paramWindow.getDecorView();
    int i = view.getSystemUiVisibility();
    if (paramBoolean) {
      i &= 0xFFFFFEFF;
    } else {
      i |= 0x100;
    } 
    view.setSystemUiVisibility(i);
    paramWindow.setDecorFitsSystemWindows(paramBoolean);
  }
  
  public static void v(Window paramWindow, boolean paramBoolean) {
    paramWindow.setDecorFitsSystemWindows(paramBoolean);
  }
  
  public static void w(EditorInfo paramEditorInfo, CharSequence paramCharSequence) {
    paramEditorInfo.setInitialSurroundingSubText(paramCharSequence, 0);
  }
  
  public static void x(AccessibilityNodeInfo paramAccessibilityNodeInfo, CharSequence paramCharSequence) {
    paramAccessibilityNodeInfo.setStateDescription(paramCharSequence);
  }
  
  public static ss0 y(Context paramContext, DialogInterface.OnDismissListener paramOnDismissListener, v00 paramv00) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 26
    //   4: getstatic lw0.r : Landroid/net/Uri;
    //   7: aload_2
    //   8: invokevirtual j : ()Landroid/net/Uri;
    //   11: invokevirtual equals : (Ljava/lang/Object;)Z
    //   14: ifeq -> 26
    //   17: iconst_1
    //   18: istore_3
    //   19: goto -> 28
    //   22: astore_0
    //   23: goto -> 646
    //   26: iconst_0
    //   27: istore_3
    //   28: new java/lang/StringBuilder
    //   31: astore #7
    //   33: aload #7
    //   35: ldc_w '<small>⚠️ '
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: new java/lang/StringBuilder
    //   44: astore #4
    //   46: aload #4
    //   48: invokespecial <init> : ()V
    //   51: aload #4
    //   53: getstatic android/os/Environment.DIRECTORY_MUSIC : Ljava/lang/String;
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload #4
    //   62: ldc_w ', '
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload #4
    //   71: invokestatic d : ()Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload #4
    //   80: ldc_w ', '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload #4
    //   89: getstatic android/os/Environment.DIRECTORY_PODCASTS : Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload #4
    //   98: ldc_w ' etc.'
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload #4
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: astore #8
    //   112: aload_2
    //   113: ifnull -> 134
    //   116: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   119: aload_2
    //   120: getfield b : Ld61;
    //   123: invokevirtual toString : ()Ljava/lang/String;
    //   126: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   129: astore #4
    //   131: goto -> 137
    //   134: aconst_null
    //   135: astore #4
    //   137: iload_3
    //   138: ifne -> 159
    //   141: aload #4
    //   143: ifnull -> 159
    //   146: aload #4
    //   148: getfield b : Ljava/lang/String;
    //   151: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   154: astore #4
    //   156: goto -> 168
    //   159: aload_0
    //   160: ldc_w 2131887277
    //   163: invokevirtual getString : (I)Ljava/lang/String;
    //   166: astore #4
    //   168: new java/lang/StringBuilder
    //   171: astore #9
    //   173: aload #9
    //   175: invokespecial <init> : ()V
    //   178: ldc_w '"'
    //   181: astore #6
    //   183: aload_2
    //   184: ifnull -> 195
    //   187: ldc_w '"<a href="1">'
    //   190: astore #5
    //   192: goto -> 200
    //   195: ldc_w '"'
    //   198: astore #5
    //   200: aload #9
    //   202: aload #5
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload #9
    //   210: aload #4
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload #6
    //   218: astore #4
    //   220: aload_2
    //   221: ifnull -> 229
    //   224: ldc_w '</a>"'
    //   227: astore #4
    //   229: aload #9
    //   231: aload #4
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload #7
    //   239: aload_0
    //   240: ldc_w 2131886741
    //   243: iconst_1
    //   244: anewarray java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload #9
    //   251: invokevirtual toString : ()Ljava/lang/String;
    //   254: aastore
    //   255: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: aload #7
    //   264: ldc_w '<br/><br/>🔸 '
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload #7
    //   273: aload_0
    //   274: ldc_w 2131886742
    //   277: iconst_1
    //   278: anewarray java/lang/Object
    //   281: dup
    //   282: iconst_0
    //   283: ldc_w ', '
    //   286: invokestatic g : ()Ljava/util/ArrayList;
    //   289: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   292: aastore
    //   293: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload #7
    //   302: ldc_w '<br/>🔸 '
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload #7
    //   311: aload_0
    //   312: ldc_w 2131886743
    //   315: invokevirtual getString : (I)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #7
    //   324: ldc_w '<br/>🔸 '
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload #7
    //   333: aload_0
    //   334: ldc_w 2131886744
    //   337: invokevirtual getString : (I)Ljava/lang/String;
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload #7
    //   346: ldc_w '<br/>🔸 '
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: aload #7
    //   355: aload_0
    //   356: ldc_w 2131886745
    //   359: invokevirtual getString : (I)Ljava/lang/String;
    //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: pop
    //   366: aload #7
    //   368: ldc_w '<br/>\\t\\t • '
    //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: pop
    //   375: aload #7
    //   377: aload_0
    //   378: ldc_w 2131886592
    //   381: invokevirtual getString : (I)Ljava/lang/String;
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload #7
    //   390: ldc_w '<br/>\\t\\t • '
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload #7
    //   399: aload_0
    //   400: ldc_w 2131887278
    //   403: invokevirtual getString : (I)Ljava/lang/String;
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: pop
    //   410: aload #7
    //   412: ldc_w '<br/>\\t\\t • '
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #7
    //   421: aload_0
    //   422: ldc_w 2131887280
    //   425: invokevirtual getString : (I)Ljava/lang/String;
    //   428: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: pop
    //   432: aload #7
    //   434: ldc_w '<br/>\\t\\t • '
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload #7
    //   443: aload_0
    //   444: ldc_w 2131887286
    //   447: invokevirtual getString : (I)Ljava/lang/String;
    //   450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload #7
    //   456: ldc_w '<br/><br/><b><i>'
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload #7
    //   465: aload_0
    //   466: ldc_w 2131887413
    //   469: invokevirtual getString : (I)Ljava/lang/String;
    //   472: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   475: pop
    //   476: aload #7
    //   478: ldc_w '</i></b><br/>✅ '
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: aload #7
    //   487: aload_0
    //   488: ldc_w 2131887414
    //   491: invokevirtual getString : (I)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: pop
    //   498: aload #7
    //   500: ldc_w ' '
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload #7
    //   509: aload #8
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: aload #7
    //   517: ldc_w '<br/>✅ '
    //   520: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: pop
    //   524: aload #7
    //   526: aload_0
    //   527: ldc_w 2131887415
    //   530: iconst_1
    //   531: anewarray java/lang/Object
    //   534: dup
    //   535: iconst_0
    //   536: aload #8
    //   538: aastore
    //   539: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   542: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: pop
    //   546: aload #7
    //   548: ldc_w '</small>'
    //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: pop
    //   555: new ms0
    //   558: astore #4
    //   560: aload #4
    //   562: aload_0
    //   563: invokespecial <init> : (Landroid/content/Context;)V
    //   566: aload #4
    //   568: aload #7
    //   570: invokevirtual toString : ()Ljava/lang/String;
    //   573: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   576: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   579: aload #4
    //   581: ldc_w 2131886639
    //   584: invokevirtual n : (I)V
    //   587: aload #4
    //   589: aload_1
    //   590: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   593: aload #4
    //   595: invokevirtual p : ()Lss0;
    //   598: astore #4
    //   600: aload #4
    //   602: getfield m : Landroid/widget/TextView;
    //   605: astore #5
    //   607: aload #5
    //   609: ifnull -> 643
    //   612: new qi0
    //   615: astore_1
    //   616: new xw
    //   619: astore #6
    //   621: aload #6
    //   623: aload #4
    //   625: aload_2
    //   626: aload_0
    //   627: iconst_2
    //   628: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   631: aload_1
    //   632: aload #6
    //   634: invokespecial <init> : (Lpi0;)V
    //   637: aload #5
    //   639: aload_1
    //   640: invokevirtual setMovementMethod : (Landroid/text/method/MovementMethod;)V
    //   643: aload #4
    //   645: areturn
    //   646: aload_0
    //   647: invokevirtual printStackTrace : ()V
    //   650: aconst_null
    //   651: areturn
    // Exception table:
    //   from	to	target	type
    //   4	17	22	finally
    //   28	112	22	finally
    //   116	131	22	finally
    //   146	156	22	finally
    //   159	168	22	finally
    //   168	178	22	finally
    //   200	216	22	finally
    //   229	607	22	finally
    //   612	643	22	finally
  }
  
  public static void z(Context paramContext) {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   3: astore_1
    //   4: aload_1
    //   5: invokevirtual getClass : ()Ljava/lang/Class;
    //   8: pop
    //   9: getstatic android/os/Build$VERSION.SDK_INT : I
    //   12: bipush #30
    //   14: if_icmplt -> 32
    //   17: aload_1
    //   18: invokevirtual d : ()Ljava/util/ArrayList;
    //   21: iconst_0
    //   22: invokevirtual get : (I)Ljava/lang/Object;
    //   25: checkcast v00
    //   28: astore_1
    //   29: goto -> 34
    //   32: aconst_null
    //   33: astore_1
    //   34: aload_0
    //   35: aconst_null
    //   36: aload_1
    //   37: invokestatic y : (Landroid/content/Context;Landroid/content/DialogInterface$OnDismissListener;Lv00;)Lss0;
    //   40: pop
    //   41: return
    //   42: astore_1
    //   43: goto -> 32
    // Exception table:
    //   from	to	target	type
    //   9	29	42	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */