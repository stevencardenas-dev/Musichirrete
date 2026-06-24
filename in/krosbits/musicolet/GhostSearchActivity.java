package in.krosbits.musicolet;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import c3;
import cn;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import im0;
import in.krosbits.rs.RestartActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l3;
import m92;
import ms0;
import pc;
import q6;
import ss0;
import tg;
import yi1;
import zd0;
import zf0;
import zi1;

public class GhostSearchActivity extends pc implements DialogInterface.OnDismissListener {
  public static Object b;
  
  public static ArrayList f0;
  
  public static im0 g0;
  
  public static GhostSearchActivity h0;
  
  public static final Object i0 = new Object();
  
  public zi1 R;
  
  public ss0 S;
  
  public tg T = null;
  
  public final String[] U = new String[] { "https://google.com/search", "https://duckduckgo.com", "https://bing.com/search", "https://yandex.com/search", "https://www.baidu.com/s", "https://kagi.com/search" };
  
  public final String[] V = new String[] { "q", "q", "q", "text", "wd", "q" };
  
  public final String[] W = new String[] { "https://google.com/search?tbm=isch", "https://duckduckgo.com/?iax=images&ia=images", "https://bing.com/images/search", "https://yandex.com/images/search", "https://image.baidu.com/search/index?tn=baiduimage", "https://kagi.com/images" };
  
  public final String[] X = new String[] { "q", "q", "q", "text", "word", "q" };
  
  public final String[] Y = new String[] { "Google", "DuckDuckGo", "Bing", "Yandex", "Baidu", "Kagi" };
  
  public q6 Z;
  
  public boolean a0;
  
  public boolean b0;
  
  public boolean c0 = false;
  
  public c3 d0;
  
  public boolean e0;
  
  public static void l0() {
    GhostSearchActivity ghostSearchActivity = h0;
    if (ghostSearchActivity != null) {
      if (!ghostSearchActivity.c0) {
        ghostSearchActivity.finish();
        return;
      } 
      try {
        Intent intent = new Intent();
        this((Context)h0, RestartActivity.class);
        ghostSearchActivity.startActivity(intent);
        h0.finish();
        Thread thread = new Thread();
        l3 l3 = new l3();
        this(3);
        this((Runnable)l3);
        return;
      } finally {
        ghostSearchActivity = null;
      } 
    } 
  }
  
  public final void m0() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getIntent : ()Landroid/content/Intent;
    //   4: invokevirtual getAction : ()Ljava/lang/String;
    //   7: astore #5
    //   9: aload_0
    //   10: invokevirtual getIntent : ()Landroid/content/Intent;
    //   13: invokevirtual getData : ()Landroid/net/Uri;
    //   16: astore #6
    //   18: ldc 'A_BGU'
    //   20: aload #5
    //   22: invokevirtual equals : (Ljava/lang/Object;)Z
    //   25: ifne -> 53
    //   28: aload_0
    //   29: getfield R : Lzi1;
    //   32: astore #7
    //   34: aload #7
    //   36: ifnull -> 53
    //   39: aload #7
    //   41: aconst_null
    //   42: putfield z : Lin/krosbits/musicolet/GhostSearchActivity;
    //   45: aload #7
    //   47: getfield b : Lss0;
    //   50: invokevirtual dismiss : ()V
    //   53: ldc 'A_OSRCHRES'
    //   55: aload #5
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 284
    //   63: aload_0
    //   64: invokevirtual getIntent : ()Landroid/content/Intent;
    //   67: ldc 'E_SRCHQ'
    //   69: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   72: astore #7
    //   74: aload #7
    //   76: ifnull -> 1736
    //   79: aload_0
    //   80: invokevirtual getIntent : ()Landroid/content/Intent;
    //   83: ldc 'E_SRCHTY'
    //   85: iconst_0
    //   86: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   89: iconst_1
    //   90: if_icmpne -> 108
    //   93: aload_0
    //   94: getfield W : [Ljava/lang/String;
    //   97: astore #6
    //   99: aload_0
    //   100: getfield X : [Ljava/lang/String;
    //   103: astore #5
    //   105: goto -> 123
    //   108: aload_0
    //   109: getfield U : [Ljava/lang/String;
    //   112: astore #6
    //   114: aload_0
    //   115: getfield V : [Ljava/lang/String;
    //   118: astore #5
    //   120: goto -> 105
    //   123: invokestatic o : ()Landroid/content/SharedPreferences;
    //   126: ldc 'dfsrchen'
    //   128: iconst_m1
    //   129: invokeinterface getInt : (Ljava/lang/String;I)I
    //   134: istore_1
    //   135: iload_1
    //   136: iflt -> 167
    //   139: iload_1
    //   140: aload #6
    //   142: arraylength
    //   143: if_icmpge -> 167
    //   146: aload_0
    //   147: aload #6
    //   149: iload_1
    //   150: aaload
    //   151: aload #5
    //   153: iload_1
    //   154: aaload
    //   155: aload #7
    //   157: invokevirtual o0 : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_0
    //   161: invokevirtual finish : ()V
    //   164: goto -> 1736
    //   167: new ms0
    //   170: dup
    //   171: aload_0
    //   172: invokespecial <init> : (Landroid/content/Context;)V
    //   175: astore #8
    //   177: aload #8
    //   179: aload_0
    //   180: invokevirtual getIntent : ()Landroid/content/Intent;
    //   183: ldc 'E_SRCHTI'
    //   185: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   188: putfield f : Ljava/lang/CharSequence;
    //   191: aload #8
    //   193: aload_0
    //   194: getfield Y : [Ljava/lang/String;
    //   197: invokevirtual i : ([Ljava/lang/CharSequence;)V
    //   200: aload #8
    //   202: new wd0
    //   205: dup
    //   206: aload_0
    //   207: aload #6
    //   209: aload #5
    //   211: aload #7
    //   213: iconst_0
    //   214: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   217: invokevirtual j : (Los0;)V
    //   220: aload #8
    //   222: ldc 2131887157
    //   224: invokestatic x : ()Landroid/content/SharedPreferences;
    //   227: ldc 's_udtlkremse'
    //   229: iconst_0
    //   230: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   235: iconst_1
    //   236: ixor
    //   237: new xd0
    //   240: dup
    //   241: iconst_0
    //   242: invokespecial <init> : (I)V
    //   245: invokevirtual b : (IZLxd0;)V
    //   248: aload #8
    //   250: new un
    //   253: dup
    //   254: iconst_5
    //   255: aload_0
    //   256: invokespecial <init> : (ILjava/lang/Object;)V
    //   259: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   262: aload #8
    //   264: ldc_w 2131886278
    //   267: invokevirtual l : (I)V
    //   270: aload #8
    //   272: invokestatic T : (Lms0;)V
    //   275: aload #8
    //   277: invokevirtual p : ()Lss0;
    //   280: pop
    //   281: goto -> 1736
    //   284: ldc 'A_BGU'
    //   286: aload #5
    //   288: invokevirtual equals : (Ljava/lang/Object;)Z
    //   291: ifeq -> 301
    //   294: aload_0
    //   295: invokevirtual n0 : ()V
    //   298: goto -> 1736
    //   301: ldc_w 'A_ADTPL'
    //   304: aload #5
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifne -> 916
    //   312: ldc_w 'A_RMFPL'
    //   315: aload #5
    //   317: invokevirtual equals : (Ljava/lang/Object;)Z
    //   320: ifeq -> 326
    //   323: goto -> 916
    //   326: ldc_w 'android.intent.action.VIEW'
    //   329: aload #5
    //   331: invokevirtual equals : (Ljava/lang/Object;)Z
    //   334: ifeq -> 708
    //   337: aload #6
    //   339: ifnull -> 708
    //   342: ldc_w 'musicolet'
    //   345: aload #6
    //   347: invokevirtual getScheme : ()Ljava/lang/String;
    //   350: invokevirtual equals : (Ljava/lang/Object;)Z
    //   353: ifeq -> 708
    //   356: ldc_w 'dl'
    //   359: aload #6
    //   361: invokevirtual getHost : ()Ljava/lang/String;
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifeq -> 708
    //   370: aload #6
    //   372: invokevirtual getLastPathSegment : ()Ljava/lang/String;
    //   375: astore #7
    //   377: ldc_w 'sft'
    //   380: aload #7
    //   382: invokevirtual equals : (Ljava/lang/Object;)Z
    //   385: ifeq -> 396
    //   388: aload_0
    //   389: aload_0
    //   390: invokestatic M0 : (Landroid/content/Context;Lin/krosbits/musicolet/GhostSearchActivity;)V
    //   393: goto -> 1736
    //   396: ldc_w 'dkmp'
    //   399: aload #7
    //   401: invokevirtual equals : (Ljava/lang/Object;)Z
    //   404: ifeq -> 416
    //   407: aload_0
    //   408: iconst_0
    //   409: aload_0
    //   410: invokestatic Y : (Lpc;ZLin/krosbits/musicolet/GhostSearchActivity;)V
    //   413: goto -> 1736
    //   416: ldc_w 'pruwapl'
    //   419: aload #7
    //   421: invokevirtual equals : (Ljava/lang/Object;)Z
    //   424: ifeq -> 465
    //   427: aload_0
    //   428: new android/content/Intent
    //   431: dup
    //   432: aload_0
    //   433: ldc_w in/krosbits/musicolet/SettingsActivity
    //   436: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   439: ldc_w 'hs'
    //   442: iconst_1
    //   443: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   446: ldc_w 'jmparg'
    //   449: ldc_w 'k_b_puwapl_'
    //   452: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   455: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   458: aload_0
    //   459: invokevirtual finish : ()V
    //   462: goto -> 1736
    //   465: ldc_w 'f2s'
    //   468: aload #7
    //   470: invokevirtual equals : (Ljava/lang/Object;)Z
    //   473: ifeq -> 557
    //   476: getstatic android/os/Build$VERSION.SDK_INT : I
    //   479: bipush #30
    //   481: if_icmplt -> 557
    //   484: getstatic in/krosbits/musicolet/WelcomeActivity.d0 : Lin/krosbits/musicolet/WelcomeActivity;
    //   487: ifnull -> 496
    //   490: invokestatic p0 : ()V
    //   493: goto -> 550
    //   496: new android/content/Intent
    //   499: dup
    //   500: aload_0
    //   501: ldc_w in/krosbits/musicolet/WelcomeActivity
    //   504: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   507: astore #5
    //   509: aload #5
    //   511: ldc_w 'ARGWCPGS'
    //   514: iconst_1
    //   515: newarray int
    //   517: dup
    //   518: iconst_0
    //   519: iconst_4
    //   520: iastore
    //   521: invokevirtual putExtra : (Ljava/lang/String;[I)Landroid/content/Intent;
    //   524: pop
    //   525: aload #5
    //   527: ldc_w 'ARGWCF2SHJANFD'
    //   530: iconst_1
    //   531: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   534: pop
    //   535: aload_0
    //   536: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   539: aload #5
    //   541: ldc_w 268435456
    //   544: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   547: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   550: aload_0
    //   551: invokevirtual finish : ()V
    //   554: goto -> 1736
    //   557: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.OqgvAJdQjZRPjHg : Ljava/lang/String;
    //   560: astore #5
    //   562: aload #5
    //   564: aload #7
    //   566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   569: ifeq -> 647
    //   572: aload #6
    //   574: aload #5
    //   576: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   579: astore #7
    //   581: aload #7
    //   583: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   586: ifne -> 640
    //   589: aload_0
    //   590: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   593: astore #5
    //   595: new android/content/Intent
    //   598: astore #6
    //   600: aload #6
    //   602: ldc_w 'android.intent.action.VIEW'
    //   605: aload #7
    //   607: iconst_0
    //   608: anewarray java/lang/String
    //   611: invokestatic B : (Ljava/lang/String;[Ljava/lang/String;)Landroid/net/Uri;
    //   614: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   617: aload #5
    //   619: aload #6
    //   621: ldc_w 268435456
    //   624: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   627: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   630: goto -> 640
    //   633: astore #5
    //   635: aload #5
    //   637: invokevirtual printStackTrace : ()V
    //   640: aload_0
    //   641: invokevirtual finish : ()V
    //   644: goto -> 1736
    //   647: ldc_w 'cpy'
    //   650: aload #7
    //   652: invokevirtual equals : (Ljava/lang/Object;)Z
    //   655: ifeq -> 683
    //   658: aload #6
    //   660: ldc_w 'txt'
    //   663: invokevirtual getQueryParameter : (Ljava/lang/String;)Ljava/lang/String;
    //   666: invokestatic i : (Ljava/lang/CharSequence;)V
    //   669: ldc_w 2131886406
    //   672: iconst_0
    //   673: invokestatic O0 : (II)V
    //   676: aload_0
    //   677: invokevirtual finish : ()V
    //   680: goto -> 1736
    //   683: ldc_w ''
    //   686: aload #7
    //   688: invokevirtual equals : (Ljava/lang/Object;)Z
    //   691: ifeq -> 701
    //   694: aload_0
    //   695: invokevirtual finish : ()V
    //   698: goto -> 1736
    //   701: aload_0
    //   702: invokevirtual finish : ()V
    //   705: goto -> 1736
    //   708: ldc_w 'A_BKMS'
    //   711: aload #5
    //   713: invokevirtual equals : (Ljava/lang/Object;)Z
    //   716: ifeq -> 808
    //   719: invokestatic k : ()Z
    //   722: ifeq -> 801
    //   725: aload_0
    //   726: invokevirtual getIntent : ()Landroid/content/Intent;
    //   729: ldc_w 'E_1_SRI'
    //   732: iconst_0
    //   733: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   736: istore_1
    //   737: iload_1
    //   738: ifne -> 748
    //   741: aload_0
    //   742: invokevirtual finish : ()V
    //   745: goto -> 1736
    //   748: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   751: getfield c : Llm0;
    //   754: iload_1
    //   755: invokevirtual a : (I)Lkm0;
    //   758: astore #5
    //   760: aload #5
    //   762: ifnull -> 794
    //   765: new tg
    //   768: dup
    //   769: aload_0
    //   770: aload #5
    //   772: invokespecial <init> : (Lin/krosbits/musicolet/GhostSearchActivity;Lkm0;)V
    //   775: astore #5
    //   777: aload #5
    //   779: getfield e : Lss0;
    //   782: invokevirtual show : ()V
    //   785: aload_0
    //   786: aload #5
    //   788: putfield T : Ltg;
    //   791: goto -> 1736
    //   794: aload_0
    //   795: invokevirtual finish : ()V
    //   798: goto -> 1736
    //   801: aload_0
    //   802: invokevirtual p0 : ()V
    //   805: goto -> 1736
    //   808: ldc_w 'A_RMS'
    //   811: aload #5
    //   813: invokevirtual equals : (Ljava/lang/Object;)Z
    //   816: ifeq -> 890
    //   819: new ms0
    //   822: dup
    //   823: aload_0
    //   824: invokespecial <init> : (Landroid/content/Context;)V
    //   827: astore #5
    //   829: aload #5
    //   831: ldc_w 2131886199
    //   834: invokevirtual q : (I)V
    //   837: aload #5
    //   839: iconst_0
    //   840: iconst_1
    //   841: invokevirtual o : (IZ)V
    //   844: aload #5
    //   846: iconst_0
    //   847: putfield J : Z
    //   850: aload #5
    //   852: iconst_0
    //   853: putfield K : Z
    //   856: aload #5
    //   858: iconst_1
    //   859: putfield t0 : Z
    //   862: aload #5
    //   864: invokevirtual p : ()Lss0;
    //   867: pop
    //   868: new java/lang/Thread
    //   871: dup
    //   872: new yd0
    //   875: dup
    //   876: aload_0
    //   877: iconst_0
    //   878: invokespecial <init> : (Lin/krosbits/musicolet/GhostSearchActivity;I)V
    //   881: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   884: invokevirtual start : ()V
    //   887: goto -> 1736
    //   890: new android/os/Handler
    //   893: dup
    //   894: invokespecial <init> : ()V
    //   897: new yd0
    //   900: dup
    //   901: aload_0
    //   902: iconst_1
    //   903: invokespecial <init> : (Lin/krosbits/musicolet/GhostSearchActivity;I)V
    //   906: ldc2_w 400
    //   909: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   912: pop
    //   913: goto -> 1736
    //   916: invokestatic k : ()Z
    //   919: ifeq -> 1732
    //   922: aload_0
    //   923: getfield d0 : Lc3;
    //   926: ifnull -> 932
    //   929: goto -> 1736
    //   932: aload_0
    //   933: invokevirtual getIntent : ()Landroid/content/Intent;
    //   936: ldc_w 'E_1_SRI'
    //   939: iconst_0
    //   940: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   943: istore_1
    //   944: iload_1
    //   945: ifeq -> 988
    //   948: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   951: getfield c : Llm0;
    //   954: iload_1
    //   955: invokevirtual a : (I)Lkm0;
    //   958: astore #6
    //   960: aload #6
    //   962: ifnull -> 988
    //   965: new java/util/ArrayList
    //   968: dup
    //   969: iconst_1
    //   970: invokespecial <init> : (I)V
    //   973: astore #7
    //   975: aload #7
    //   977: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   980: aload #7
    //   982: aload #6
    //   984: invokevirtual add : (Ljava/lang/Object;)Z
    //   987: pop
    //   988: getstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   991: astore #6
    //   993: aload #6
    //   995: ifnull -> 1725
    //   998: aload #6
    //   1000: invokevirtual size : ()I
    //   1003: ifle -> 1725
    //   1006: getstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1009: astore #7
    //   1011: ldc_w 'A_ADTPL'
    //   1014: aload #5
    //   1016: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1019: istore_3
    //   1020: aload_0
    //   1021: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1024: ldc_w 'E_TL'
    //   1027: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1030: astore #6
    //   1032: new java/lang/Object
    //   1035: dup
    //   1036: invokespecial <init> : ()V
    //   1039: astore #5
    //   1041: aload #5
    //   1043: iconst_0
    //   1044: putfield c : I
    //   1047: aload #5
    //   1049: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   1052: ldc_w 12.0
    //   1055: fmul
    //   1056: f2i
    //   1057: putfield n : I
    //   1060: aload #5
    //   1062: iconst_m1
    //   1063: putfield r : I
    //   1066: aload #7
    //   1068: ifnull -> 1643
    //   1071: aload #7
    //   1073: invokevirtual isEmpty : ()Z
    //   1076: ifeq -> 1082
    //   1079: goto -> 1643
    //   1082: new java/util/ArrayList
    //   1085: dup
    //   1086: aload #7
    //   1088: invokespecial <init> : (Ljava/util/Collection;)V
    //   1091: astore #8
    //   1093: aload #5
    //   1095: aload #8
    //   1097: putfield k : Ljava/util/ArrayList;
    //   1100: new java/util/ArrayList
    //   1103: dup
    //   1104: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1107: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1110: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   1113: invokespecial <init> : (Ljava/util/Collection;)V
    //   1116: astore #7
    //   1118: aload #5
    //   1120: aload #7
    //   1122: putfield i : Ljava/util/ArrayList;
    //   1125: aload #5
    //   1127: new java/util/HashSet
    //   1130: dup
    //   1131: aload #7
    //   1133: invokevirtual size : ()I
    //   1136: invokespecial <init> : (I)V
    //   1139: putfield j : Ljava/util/HashSet;
    //   1142: aload #5
    //   1144: aload #7
    //   1146: invokevirtual isEmpty : ()Z
    //   1149: putfield p : Z
    //   1152: aload #6
    //   1154: ifnull -> 1167
    //   1157: aload #5
    //   1159: aload #6
    //   1161: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1164: putfield o : Ljava/lang/String;
    //   1167: aload #8
    //   1169: invokevirtual size : ()I
    //   1172: iconst_1
    //   1173: if_icmpne -> 1191
    //   1176: aload #5
    //   1178: new z2
    //   1181: dup
    //   1182: iconst_0
    //   1183: aload #5
    //   1185: invokespecial <init> : (ILjava/lang/Object;)V
    //   1188: putfield q : Lz2;
    //   1191: new ms0
    //   1194: dup
    //   1195: aload_0
    //   1196: invokespecial <init> : (Landroid/content/Context;)V
    //   1199: astore #6
    //   1201: aload #6
    //   1203: ldc_w 2131492947
    //   1206: iconst_0
    //   1207: invokevirtual e : (IZ)V
    //   1210: aload #6
    //   1212: getfield u : Landroid/view/View;
    //   1215: astore #7
    //   1217: aload #5
    //   1219: aload #7
    //   1221: ldc_w 2131297796
    //   1224: invokevirtual findViewById : (I)Landroid/view/View;
    //   1227: checkcast android/widget/TextView
    //   1230: putfield f : Landroid/widget/TextView;
    //   1233: aload #5
    //   1235: aload #7
    //   1237: ldc_w 2131297656
    //   1240: invokevirtual findViewById : (I)Landroid/view/View;
    //   1243: checkcast com/google/android/material/button/MaterialButtonToggleGroup
    //   1246: putfield h : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1249: aload #5
    //   1251: aload #7
    //   1253: ldc_w 2131296414
    //   1256: invokevirtual findViewById : (I)Landroid/view/View;
    //   1259: checkcast android/widget/TextView
    //   1262: putfield g : Landroid/widget/TextView;
    //   1265: iconst_0
    //   1266: istore_1
    //   1267: aload #5
    //   1269: getfield h : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1272: invokevirtual getChildCount : ()I
    //   1275: istore_2
    //   1276: aload #5
    //   1278: getfield h : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1281: astore #8
    //   1283: iload_1
    //   1284: iload_2
    //   1285: if_icmpge -> 1317
    //   1288: aload #8
    //   1290: iload_1
    //   1291: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1294: checkcast android/widget/Button
    //   1297: astore #8
    //   1299: aload #8
    //   1301: iconst_0
    //   1302: invokevirtual setAllCaps : (Z)V
    //   1305: aload #8
    //   1307: iconst_3
    //   1308: invokevirtual setMaxLines : (I)V
    //   1311: iinc #1, 1
    //   1314: goto -> 1267
    //   1317: aload #8
    //   1319: ldc_w 2131297589
    //   1322: iconst_1
    //   1323: invokevirtual g : (IZ)V
    //   1326: aload #7
    //   1328: ldc_w 2131297419
    //   1331: invokevirtual findViewById : (I)Landroid/view/View;
    //   1334: checkcast androidx/recyclerview/widget/RecyclerView
    //   1337: astore #8
    //   1339: aload #5
    //   1341: aload #8
    //   1343: putfield l : Landroidx/recyclerview/widget/RecyclerView;
    //   1346: aload #8
    //   1348: new androidx/recyclerview/widget/LinearLayoutManager
    //   1351: dup
    //   1352: iconst_1
    //   1353: invokespecial <init> : (I)V
    //   1356: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   1359: new a3
    //   1362: dup
    //   1363: iconst_0
    //   1364: aload #5
    //   1366: invokespecial <init> : (ILjava/lang/Object;)V
    //   1369: astore #7
    //   1371: aload #5
    //   1373: aload #7
    //   1375: putfield m : La3;
    //   1378: aload #8
    //   1380: aload #7
    //   1382: invokevirtual setAdapter : (Lid1;)V
    //   1385: aload #5
    //   1387: getfield g : Landroid/widget/TextView;
    //   1390: aload #5
    //   1392: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1395: aload #5
    //   1397: aload_0
    //   1398: putfield b : Lin/krosbits/musicolet/GhostSearchActivity;
    //   1401: aload #6
    //   1403: ldc_w 2131886117
    //   1406: invokevirtual n : (I)V
    //   1409: aload #6
    //   1411: ldc_w 2131886278
    //   1414: invokevirtual k : (I)V
    //   1417: aload #6
    //   1419: aload #5
    //   1421: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   1424: aload #6
    //   1426: aload #5
    //   1428: putfield A : Lrs0;
    //   1431: aload #6
    //   1433: aload #5
    //   1435: putfield Y : Landroid/content/DialogInterface$OnShowListener;
    //   1438: aload #5
    //   1440: new ss0
    //   1443: dup
    //   1444: aload #6
    //   1446: invokespecial <init> : (Lms0;)V
    //   1449: putfield e : Lss0;
    //   1452: aload #5
    //   1454: getfield p : Z
    //   1457: istore #4
    //   1459: aload #5
    //   1461: getfield h : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   1464: astore #6
    //   1466: iload #4
    //   1468: ifne -> 1481
    //   1471: aload #6
    //   1473: aload #5
    //   1475: invokevirtual f : (Lhs0;)V
    //   1478: goto -> 1488
    //   1481: aload #6
    //   1483: bipush #8
    //   1485: invokevirtual setVisibility : (I)V
    //   1488: aload #5
    //   1490: getfield k : Ljava/util/ArrayList;
    //   1493: invokevirtual size : ()I
    //   1496: istore_1
    //   1497: aload #5
    //   1499: getfield f : Landroid/widget/TextView;
    //   1502: astore #7
    //   1504: iload_1
    //   1505: iconst_1
    //   1506: if_icmpne -> 1532
    //   1509: aload #7
    //   1511: aload #5
    //   1513: getfield k : Ljava/util/ArrayList;
    //   1516: iconst_0
    //   1517: invokevirtual get : (I)Ljava/lang/Object;
    //   1520: checkcast km0
    //   1523: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   1526: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1529: goto -> 1618
    //   1532: new java/lang/StringBuilder
    //   1535: dup
    //   1536: getstatic androidx/profileinstaller/Vuyf/nBRIsU.yvFJhZKmbJ : Ljava/lang/String;
    //   1539: invokespecial <init> : (Ljava/lang/String;)V
    //   1542: astore #6
    //   1544: aload #6
    //   1546: aload_0
    //   1547: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1550: ldc_w 2131755061
    //   1553: aload #5
    //   1555: getfield k : Ljava/util/ArrayList;
    //   1558: invokevirtual size : ()I
    //   1561: iconst_1
    //   1562: anewarray java/lang/Object
    //   1565: dup
    //   1566: iconst_0
    //   1567: aload #5
    //   1569: getfield k : Ljava/util/ArrayList;
    //   1572: invokevirtual size : ()I
    //   1575: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1578: aastore
    //   1579: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1582: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1585: pop
    //   1586: aload #6
    //   1588: ldc_w '</a>'
    //   1591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1594: pop
    //   1595: aload #7
    //   1597: aload #6
    //   1599: invokevirtual toString : ()Ljava/lang/String;
    //   1602: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1605: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1608: aload #5
    //   1610: getfield f : Landroid/widget/TextView;
    //   1613: aload #5
    //   1615: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1618: aload #5
    //   1620: iload_3
    //   1621: iconst_1
    //   1622: ixor
    //   1623: putfield c : I
    //   1626: aload #5
    //   1628: invokevirtual c : ()V
    //   1631: aload #5
    //   1633: getfield l : Landroidx/recyclerview/widget/RecyclerView;
    //   1636: aconst_null
    //   1637: invokevirtual setItemAnimator : (Lod1;)V
    //   1640: goto -> 1654
    //   1643: aload_0
    //   1644: aload #5
    //   1646: getfield e : Lss0;
    //   1649: invokeinterface onDismiss : (Landroid/content/DialogInterface;)V
    //   1654: aload_0
    //   1655: aload #5
    //   1657: putfield d0 : Lc3;
    //   1660: aload_0
    //   1661: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1664: ldc_w 'E_SHOLCSR'
    //   1667: iconst_0
    //   1668: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   1671: ifeq -> 1682
    //   1674: aload_0
    //   1675: getfield d0 : Lc3;
    //   1678: iconst_1
    //   1679: putfield u : Z
    //   1682: aload_0
    //   1683: getfield d0 : Lc3;
    //   1686: astore #6
    //   1688: aload #6
    //   1690: getfield e : Lss0;
    //   1693: astore #5
    //   1695: aload #5
    //   1697: ifnull -> 1736
    //   1700: aload #6
    //   1702: getfield u : Z
    //   1705: ifeq -> 1717
    //   1708: aload #5
    //   1710: getfield e : Lms0;
    //   1713: iconst_1
    //   1714: putfield t : Z
    //   1717: aload #5
    //   1719: invokevirtual show : ()V
    //   1722: goto -> 1736
    //   1725: aload_0
    //   1726: invokevirtual finish : ()V
    //   1729: goto -> 1736
    //   1732: aload_0
    //   1733: invokevirtual p0 : ()V
    //   1736: aconst_null
    //   1737: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1740: return
    //   1741: astore #6
    //   1743: goto -> 1488
    // Exception table:
    //   from	to	target	type
    //   589	630	633	android/content/ActivityNotFoundException
    //   1481	1488	1741	finally
  }
  
  public final void n0() {
    boolean bool1;
    boolean bool2;
    zi1 zi11 = this.R;
    if (zi11 != null) {
      bool2 = zi11.y;
      zi11.z = null;
    } else {
      bool2 = true;
    } 
    im0 im01 = g0;
    g0 = null;
    Object object = new Object();
    ((zi1)object).x = new Handler(Looper.getMainLooper());
    ((zi1)object).D = new yi1(0, object);
    ((zi1)object).w = this;
    String str2 = MyApplication.i.getApplicationContext().getString(2131887485);
    String str1 = MyApplication.i.getApplicationContext().getString(2131886970);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = str2;
    arrayOfString[1] = str1;
    ((zi1)object).C = arrayOfString;
    ms0 ms0 = new ms0((Context)this);
    ms0.e(2131492972, false);
    View view = ms0.u;
    ImageView imageView = (ImageView)view.findViewById(2131296903);
    ((zi1)object).q = imageView;
    TextView textView1 = (TextView)view.findViewById(2131296435);
    ((zi1)object).n = textView1;
    ((zi1)object).f = (TextView)view.findViewById(2131297890);
    CheckBox checkBox = (CheckBox)view.findViewById(2131296550);
    ((zi1)object).r = checkBox;
    TextInputLayout textInputLayout = (TextInputLayout)view.findViewById(2131297647);
    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView)view.findViewById(2131296330);
    ((zi1)object).s = materialAutoCompleteTextView;
    TextView textView7 = (TextView)view.findViewById(2131297683);
    ((zi1)object).h = textView7;
    TextView textView4 = (TextView)view.findViewById(2131297761);
    ((zi1)object).g = textView4;
    ((zi1)object).c = (ScrollView)view.findViewById(2131297556);
    ((zi1)object).e = (ScrollView)view.findViewById(2131297557);
    ((zi1)object).i = (TextView)view.findViewById(2131297836);
    ((zi1)object).j = (TextView)view.findViewById(2131297895);
    ((zi1)object).k = (TextView)view.findViewById(2131297896);
    TextView textView3 = (TextView)view.findViewById(2131297894);
    ((zi1)object).l = textView3;
    TextView textView6 = (TextView)view.findViewById(2131297754);
    ((zi1)object).p = textView6;
    TextView textView2 = (TextView)view.findViewById(2131297749);
    ((zi1)object).o = textView2;
    TextView textView5 = (TextView)view.findViewById(2131297893);
    ((zi1)object).m = textView5;
    ((zi1)object).v = (ProgressBar)view.findViewById(2131297298);
    Button button1 = (Button)view.findViewById(2131296382);
    ((zi1)object).u = button1;
    Button button2 = (Button)view.findViewById(2131296376);
    ((zi1)object).t = button2;
    ((zi1)object).A = new View[] { (View)checkBox, (View)textInputLayout };
    textView4.setOnClickListener((View.OnClickListener)object);
    textView3.setOnClickListener((View.OnClickListener)object);
    textView6.setOnClickListener((View.OnClickListener)object);
    textView2.setOnClickListener((View.OnClickListener)object);
    textView5.setOnClickListener((View.OnClickListener)object);
    textView7.setOnClickListener((View.OnClickListener)object);
    textView1.setOnClickListener((View.OnClickListener)object);
    button2.setOnClickListener((View.OnClickListener)object);
    button1.setOnClickListener((View.OnClickListener)object);
    imageView.setOnClickListener((View.OnClickListener)object);
    if (MyApplication.o().getInt("k_i_pfsnr", 0) == 0) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    materialAutoCompleteTextView.setText(arrayOfString[bool1]);
    materialAutoCompleteTextView.setAdapter((ListAdapter)new ArrayAdapter((Context)this, 2131493042, (Object[])arrayOfString));
    ms0.W = (DialogInterface.OnDismissListener)object;
    ((zi1)object).b = ms0.p();
    zi1 zi12 = zi1.E;
    if (zi12 != null) {
      ss0 ss01 = zi12.b;
      if (ss01 != null && ss01.isShowing())
        try {
          zi1.E.b.dismiss();
        } finally {} 
    } 
    zi1.E = (zi1)object;
    Handler handler = ((zi1)object).x;
    if (handler != null)
      handler.post((Runnable)((zi1)object).D); 
    ((zi1)object).z = this;
    this.R = (zi1)object;
    if (im01 != null) {
      im0.w(im01);
      if (getIntent().getBooleanExtra("E_SACC", true))
        this.R.y = bool2; 
    } 
  }
  
  public final void o0(String paramString1, String paramString2, String paramString3) {
    Uri.Builder builder = Uri.parse(paramString1).buildUpon();
    builder.appendQueryParameter(paramString2, paramString3);
    Intent intent = (new Intent("android.intent.action.VIEW", builder.build())).addFlags(268435456);
    try {
      getApplicationContext().startActivity(intent);
      return;
    } catch (Exception exception) {
      try {
        startActivity(intent);
      } catch (Exception exception1) {}
      return;
    } 
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1 && paramInt2 == -1) {
      n0();
      return;
    } 
    if (paramInt1 == 10401) {
      recreate();
      return;
    } 
    if (paramInt1 == 10501 || paramInt1 == 10502 || paramInt1 == 10503) {
      zd0 zd0 = new zd0(this, paramInt1, paramInt2, paramIntent);
      this.N.postDelayed((Runnable)zd0, 600L);
      return;
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    m92.d(this);
    super.onCreate(paramBundle);
    h0 = this;
    setVisible(true);
    overridePendingTransition(0, 0);
    if (getIntent().getBooleanExtra("E_SHOLCSR", false)) {
      try {
        Object object = MyApplication.i.getApplicationContext().getSystemService("statusbar");
        if (Build.VERSION.SDK_INT < 31) {
          Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", null);
          method.setAccessible(true);
          method.invoke(object, null);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      this.a0 = true;
      this.b0 = getIntent().getBooleanExtra("E_ALSHFLCSR", false);
      if (LockScreenReceiver.a.inKeyguardRestrictedInputMode()) {
        getWindow().addFlags(524288);
        getTheme().applyStyle(2131953017, true);
        (new Thread((Runnable)new zf0((Activity)this, 2131953017, 0))).start();
      } 
    } 
    m0();
  }
  
  public final void onDestroy() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/GhostSearchActivity.h0 : Lin/krosbits/musicolet/GhostSearchActivity;
    //   3: aload_0
    //   4: if_acmpne -> 11
    //   7: aconst_null
    //   8: putstatic in/krosbits/musicolet/GhostSearchActivity.h0 : Lin/krosbits/musicolet/GhostSearchActivity;
    //   11: getstatic in/krosbits/musicolet/GhostSearchActivity.i0 : Ljava/lang/Object;
    //   14: astore_1
    //   15: aload_1
    //   16: monitorenter
    //   17: aload_1
    //   18: invokevirtual notifyAll : ()V
    //   21: aload_1
    //   22: monitorexit
    //   23: getstatic in/krosbits/musicolet/GhostSearchActivity.b : Ljava/lang/Object;
    //   26: ifnull -> 51
    //   29: getstatic in/krosbits/musicolet/GhostSearchActivity.i0 : Ljava/lang/Object;
    //   32: astore_1
    //   33: aload_1
    //   34: monitorenter
    //   35: getstatic in/krosbits/musicolet/GhostSearchActivity.b : Ljava/lang/Object;
    //   38: invokevirtual notifyAll : ()V
    //   41: aload_1
    //   42: monitorexit
    //   43: goto -> 51
    //   46: astore_2
    //   47: aload_1
    //   48: monitorexit
    //   49: aload_2
    //   50: athrow
    //   51: aload_0
    //   52: getfield S : Lss0;
    //   55: astore_1
    //   56: aload_1
    //   57: ifnull -> 65
    //   60: aload_1
    //   61: aconst_null
    //   62: invokevirtual setOnDismissListener : (Landroid/content/DialogInterface$OnDismissListener;)V
    //   65: aload_0
    //   66: getfield Z : Lq6;
    //   69: ifnull -> 93
    //   72: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   75: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   78: invokestatic o : (Landroid/content/Context;)Lcn;
    //   81: aload_0
    //   82: getfield Z : Lq6;
    //   85: invokevirtual C : (Landroid/content/BroadcastReceiver;)V
    //   88: aload_0
    //   89: aconst_null
    //   90: putfield Z : Lq6;
    //   93: aload_0
    //   94: getfield R : Lzi1;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnull -> 138
    //   102: aload_1
    //   103: aconst_null
    //   104: putfield z : Lin/krosbits/musicolet/GhostSearchActivity;
    //   107: aload_1
    //   108: getfield b : Lss0;
    //   111: astore_1
    //   112: aload_1
    //   113: ifnull -> 133
    //   116: aload_1
    //   117: invokevirtual isShowing : ()Z
    //   120: ifeq -> 133
    //   123: aload_0
    //   124: getfield R : Lzi1;
    //   127: getfield b : Lss0;
    //   130: invokevirtual dismiss : ()V
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield R : Lzi1;
    //   138: aload_0
    //   139: getfield d0 : Lc3;
    //   142: astore_1
    //   143: aload_1
    //   144: ifnull -> 165
    //   147: aload_1
    //   148: getfield e : Lss0;
    //   151: astore_1
    //   152: aload_1
    //   153: ifnull -> 160
    //   156: aload_1
    //   157: invokevirtual dismiss : ()V
    //   160: aload_0
    //   161: aconst_null
    //   162: putfield d0 : Lc3;
    //   165: aload_0
    //   166: getfield b0 : Z
    //   169: ifeq -> 198
    //   172: aload_0
    //   173: new android/content/Intent
    //   176: dup
    //   177: ldc_w 'in.krosbits_SCREEN_ON'
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   186: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   189: ldc_w in/krosbits/musicolet/LockScreenReceiver
    //   192: invokevirtual setClass : (Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    //   195: invokevirtual sendBroadcast : (Landroid/content/Intent;)V
    //   198: aload_0
    //   199: invokespecial onDestroy : ()V
    //   202: return
    //   203: astore_2
    //   204: aload_1
    //   205: monitorexit
    //   206: aload_2
    //   207: athrow
    //   208: astore_2
    //   209: goto -> 21
    //   212: astore_2
    //   213: goto -> 41
    // Exception table:
    //   from	to	target	type
    //   17	21	208	finally
    //   21	23	203	finally
    //   35	41	212	finally
    //   41	43	46	finally
    //   47	49	46	finally
    //   204	206	203	finally
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    m0();
  }
  
  public final void onResume() {
    super.onResume();
    this.e0 = hasWindowFocus();
    GhostSearchActivity ghostSearchActivity = h0;
    if (ghostSearchActivity != this) {
      if (ghostSearchActivity != null && !ghostSearchActivity.isFinishing())
        h0.finish(); 
      h0 = this;
    } 
  }
  
  public final void onStop() {
    super.onStop();
    if ((this.e0 || this.b0) && this.a0)
      finish(); 
  }
  
  public final void p0() {
    if (this.Z == null)
      this.Z = new q6(3, this); 
    ms0 ms0 = new ms0((Context)this);
    ms0.o(0, true);
    ms0.c(2131887105);
    ms0.W = this;
    this.S = ms0.p();
    cn.o(MyApplication.i.getApplicationContext()).t((BroadcastReceiver)this.Z, new IntentFilter("ACTASCH"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\GhostSearchActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */