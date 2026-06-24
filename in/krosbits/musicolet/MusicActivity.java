package in.krosbits.musicolet;

import a51;
import ag0;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageSwitcher;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b41;
import cn;
import com.google.android.gms.common.annotation.zQ.PVdqHjWVkmL;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import e3;
import e6;
import ew0;
import f2;
import g2;
import gf;
import gf0;
import h50;
import hc;
import im0;
import j50;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import jz;
import kc;
import ki;
import km0;
import kn1;
import kt1;
import l0;
import l2;
import l81;
import l90;
import lb;
import lb0;
import lb1;
import ly0;
import m92;
import ms0;
import my0;
import mz;
import n2;
import n21;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.mp4.fwr.whGJe;
import p51;
import pc;
import pj;
import q6;
import qo;
import qy0;
import r90;
import ss0;
import t32;
import ua0;
import v61;
import vy0;
import wg;
import wn;
import ws1;
import x5;
import yy0;
import z51;
import z71;
import zo2;

public class MusicActivity extends pc implements DialogInterface.OnDismissListener, View.OnTouchListener, qy0, DialogInterface.OnCancelListener, View.OnLongClickListener {
  public static MusicActivity R0;
  
  public static ss0 S0;
  
  public final Stack A0 = new Stack();
  
  public boolean B0;
  
  public Bundle C0;
  
  public boolean D0;
  
  public boolean E0;
  
  public boolean F0;
  
  public int G0 = 720;
  
  public int H0 = 480;
  
  public final e3 I0 = new e3(22, this);
  
  public ss0 J0;
  
  public boolean K0 = false;
  
  public boolean L0 = false;
  
  public boolean M0 = false;
  
  public q6 N0;
  
  public boolean O0 = false;
  
  public final l90 P0 = new l90(this, 5);
  
  public final l2 Q0;
  
  public ArrayList R;
  
  public Toolbar S;
  
  public TabLayout T;
  
  public t32 U;
  
  public TextView V;
  
  public TextView W;
  
  public ProgressBar X;
  
  public int Y = 0;
  
  public wn Z;
  
  public wn a0;
  
  public wn b0;
  
  public r90 c0;
  
  public z71 d0;
  
  public l81 e0;
  
  public lb1 f0;
  
  public gf0 g0;
  
  public h50 h0;
  
  public lb0 i0;
  
  public MusicService j0;
  
  public String k0 = null;
  
  public int l0 = 0;
  
  public ProgressDialog m0;
  
  public int n0 = 0;
  
  public Handler o0;
  
  public boolean p0 = false;
  
  public ImageSwitcher q0;
  
  public Bitmap r0;
  
  public yy0 s0 = new yy0((ContextWrapper)this, 0);
  
  public ly0 t0;
  
  public kn1 u0;
  
  public boolean v0;
  
  public int w0 = -1;
  
  public SharedPreferences x0;
  
  public Intent y0;
  
  public boolean z0;
  
  public MusicActivity() {
    g2 g2 = new g2(1);
    this.Q0 = W((f2)new vy0(this), (z51)g2);
  }
  
  public static void D0(ArrayList<Object> paramArrayList) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 360
    //   4: aload_0
    //   5: invokevirtual size : ()I
    //   8: ifgt -> 14
    //   11: goto -> 360
    //   14: aload_0
    //   15: invokevirtual size : ()I
    //   18: istore_1
    //   19: iload_1
    //   20: bipush #100
    //   22: if_icmple -> 31
    //   25: ldc 2131887369
    //   27: iconst_1
    //   28: invokestatic O0 : (II)V
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: ldc 'SSH:'
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: astore_3
    //   41: aload_3
    //   42: iload_1
    //   43: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual toString : ()Ljava/lang/String;
    //   51: invokestatic F : (Ljava/lang/String;)V
    //   54: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   57: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   60: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   63: ldc 2131755033
    //   65: iload_1
    //   66: iconst_1
    //   67: anewarray java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: iload_1
    //   73: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   76: aastore
    //   77: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   80: astore #4
    //   82: new java/util/ArrayList
    //   85: dup
    //   86: aload_0
    //   87: invokevirtual size : ()I
    //   90: invokespecial <init> : (I)V
    //   93: astore_3
    //   94: aload_0
    //   95: invokevirtual size : ()I
    //   98: istore_2
    //   99: iconst_0
    //   100: istore_1
    //   101: iload_1
    //   102: iload_2
    //   103: if_icmpge -> 145
    //   106: aload_0
    //   107: iload_1
    //   108: invokevirtual get : (I)Ljava/lang/Object;
    //   111: astore #5
    //   113: iinc #1, 1
    //   116: aload #5
    //   118: checkcast km0
    //   121: astore #5
    //   123: aload_3
    //   124: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   127: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   130: aload #5
    //   132: invokevirtual d : ()Lv00;
    //   135: invokestatic s : (Landroid/content/Context;Lu00;)Landroid/net/Uri;
    //   138: invokevirtual add : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: goto -> 101
    //   145: aload_3
    //   146: invokevirtual size : ()I
    //   149: iconst_1
    //   150: if_icmple -> 176
    //   153: new android/content/Intent
    //   156: dup
    //   157: ldc_w 'android.intent.action.SEND_MULTIPLE'
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: astore_0
    //   164: aload_0
    //   165: ldc_w 'android.intent.extra.STREAM'
    //   168: aload_3
    //   169: invokevirtual putParcelableArrayListExtra : (Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //   172: pop
    //   173: goto -> 203
    //   176: new android/content/Intent
    //   179: dup
    //   180: ldc_w 'android.intent.action.SEND'
    //   183: invokespecial <init> : (Ljava/lang/String;)V
    //   186: astore_0
    //   187: aload_0
    //   188: ldc_w 'android.intent.extra.STREAM'
    //   191: aload_3
    //   192: iconst_0
    //   193: invokevirtual get : (I)Ljava/lang/Object;
    //   196: checkcast android/os/Parcelable
    //   199: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   202: pop
    //   203: aload_0
    //   204: ldc_w 268435456
    //   207: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   210: pop
    //   211: aload_0
    //   212: iconst_1
    //   213: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   216: pop
    //   217: aload_0
    //   218: ldc_w '*/*'
    //   221: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   224: pop
    //   225: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   228: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   231: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   234: aload_0
    //   235: ldc_w 65536
    //   238: invokevirtual resolveActivity : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   241: astore_3
    //   242: goto -> 281
    //   245: astore_3
    //   246: aload_3
    //   247: invokevirtual printStackTrace : ()V
    //   250: ldc_w 'SSH:AL'
    //   253: invokestatic F : (Ljava/lang/String;)V
    //   256: aload_0
    //   257: ldc_w 'audio/*'
    //   260: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   263: pop
    //   264: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   267: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   270: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   273: aload_0
    //   274: ldc_w 65536
    //   277: invokevirtual resolveActivity : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   280: astore_3
    //   281: new java/lang/StringBuilder
    //   284: astore #5
    //   286: aload #5
    //   288: invokespecial <init> : ()V
    //   291: aload #5
    //   293: ldc_w 'SSH:RI>'
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload #5
    //   302: aload_3
    //   303: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload #5
    //   309: invokevirtual toString : ()Ljava/lang/String;
    //   312: invokestatic F : (Ljava/lang/String;)V
    //   315: aload_3
    //   316: ifnull -> 345
    //   319: aload_0
    //   320: aload #4
    //   322: invokestatic createChooser : (Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //   325: ldc_w 268435456
    //   328: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   331: astore_0
    //   332: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   335: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   338: aload_0
    //   339: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   342: goto -> 360
    //   345: ldc_w 2131886992
    //   348: iconst_0
    //   349: invokestatic O0 : (II)V
    //   352: goto -> 360
    //   355: astore_0
    //   356: aload_0
    //   357: invokevirtual printStackTrace : ()V
    //   360: return
    // Exception table:
    //   from	to	target	type
    //   225	242	245	finally
    //   246	281	355	finally
    //   281	315	355	finally
    //   319	342	355	finally
    //   345	352	355	finally
  }
  
  public static void E0() {
    try {
      Intent intent = new Intent();
      this();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void F0(Context paramContext, km0 paramkm0, int... paramVarArgs) {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MusicActivity.S0 : Lss0;
    //   3: astore #22
    //   5: aload #22
    //   7: ifnull -> 22
    //   10: aload #22
    //   12: aconst_null
    //   13: invokevirtual setOnDismissListener : (Landroid/content/DialogInterface$OnDismissListener;)V
    //   16: getstatic in/krosbits/musicolet/MusicActivity.S0 : Lss0;
    //   19: invokevirtual dismiss : ()V
    //   22: aload_1
    //   23: ifnonnull -> 29
    //   26: goto -> 379
    //   29: aload_1
    //   30: getfield c : Lqn1;
    //   33: astore #22
    //   35: aload_1
    //   36: invokevirtual d : ()Lv00;
    //   39: astore #23
    //   41: aload #23
    //   43: ifnull -> 3864
    //   46: aload #23
    //   48: invokevirtual l : ()Z
    //   51: ifne -> 57
    //   54: goto -> 3864
    //   57: aload #22
    //   59: getfield b : Ljava/lang/String;
    //   62: astore #25
    //   64: aload #22
    //   66: getfield f : Lwo;
    //   69: astore #37
    //   71: aload #22
    //   73: getfield g : I
    //   76: istore #12
    //   78: aload #22
    //   80: getfield c : Ljava/lang/String;
    //   83: astore #27
    //   85: aload #22
    //   87: getfield e : Ljava/lang/String;
    //   90: astore #50
    //   92: aload_1
    //   93: getfield j : Ljava/lang/String;
    //   96: astore #49
    //   98: aload_1
    //   99: getfield f : Ljava/lang/String;
    //   102: astore #46
    //   104: aload_1
    //   105: getfield e : Ljava/lang/String;
    //   108: astore #43
    //   110: aload_1
    //   111: getfield h : Ljava/lang/String;
    //   114: astore #45
    //   116: aload_1
    //   117: getfield p : I
    //   120: istore #10
    //   122: aload_1
    //   123: invokevirtual l : ()I
    //   126: istore #7
    //   128: aload_1
    //   129: invokevirtual c : ()I
    //   132: istore #9
    //   134: new java/util/Date
    //   137: dup
    //   138: aload_1
    //   139: getfield l : J
    //   142: invokespecial <init> : (J)V
    //   145: astore #24
    //   147: new java/util/Date
    //   150: dup
    //   151: aload_1
    //   152: getfield k : J
    //   155: invokespecial <init> : (J)V
    //   158: astore #26
    //   160: aload_1
    //   161: getfield o : I
    //   164: istore #8
    //   166: aload_1
    //   167: getfield m : J
    //   170: lstore #13
    //   172: lload #13
    //   174: lconst_0
    //   175: lcmp
    //   176: ifle -> 193
    //   179: new java/util/Date
    //   182: dup
    //   183: lload #13
    //   185: invokespecial <init> : (J)V
    //   188: astore #22
    //   190: goto -> 196
    //   193: aconst_null
    //   194: astore #22
    //   196: aload #23
    //   198: invokevirtual n : ()J
    //   201: lstore #13
    //   203: new java/util/ArrayList
    //   206: dup
    //   207: iconst_1
    //   208: invokespecial <init> : (I)V
    //   211: astore #34
    //   213: aload #34
    //   215: aload_1
    //   216: invokevirtual add : (Ljava/lang/Object;)Z
    //   219: pop
    //   220: new android/content/Intent
    //   223: dup
    //   224: aload_0
    //   225: ldc_w in/krosbits/musicolet/Tag2Activity
    //   228: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   231: ldc_w 'tl'
    //   234: aload #25
    //   236: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   239: ldc_w 'al'
    //   242: aload #27
    //   244: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   247: ldc_w 'ar'
    //   250: aload #50
    //   252: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   255: ldc_w 'alar'
    //   258: aload #49
    //   260: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   263: ldc_w 'cm'
    //   266: aload #46
    //   268: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   271: ldc_w 'yr'
    //   274: iload #10
    //   276: invokestatic valueOf : (I)Ljava/lang/String;
    //   279: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   282: ldc_w 'gn'
    //   285: aload #43
    //   287: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   290: ldc_w 'trn'
    //   293: iload #7
    //   295: invokestatic valueOf : (I)Ljava/lang/String;
    //   298: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   301: ldc_w 'dcn'
    //   304: iload #9
    //   306: invokestatic valueOf : (I)Ljava/lang/String;
    //   309: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   312: astore #33
    //   314: aload_2
    //   315: arraylength
    //   316: ifle -> 380
    //   319: aload_2
    //   320: iconst_0
    //   321: iaload
    //   322: istore #7
    //   324: iload #7
    //   326: iconst_1
    //   327: if_icmpne -> 352
    //   330: aload #33
    //   332: ldc_w 'LRCDLG'
    //   335: iconst_1
    //   336: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   339: pop
    //   340: aload #34
    //   342: putstatic in/krosbits/musicolet/Tag2Activity.L1 : Ljava/util/ArrayList;
    //   345: aload_0
    //   346: aload #33
    //   348: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   351: return
    //   352: iload #7
    //   354: iconst_2
    //   355: if_icmpne -> 379
    //   358: aload #33
    //   360: ldc_w 'ATCDLG'
    //   363: iconst_1
    //   364: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   367: pop
    //   368: aload #34
    //   370: putstatic in/krosbits/musicolet/Tag2Activity.L1 : Ljava/util/ArrayList;
    //   373: aload_0
    //   374: aload #33
    //   376: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   379: return
    //   380: aload_0
    //   381: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   384: ldc_w 2131493021
    //   387: aconst_null
    //   388: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   391: astore #35
    //   393: aload #35
    //   395: ldc_w 2131296973
    //   398: invokevirtual findViewById : (I)Landroid/view/View;
    //   401: checkcast android/widget/LinearLayout
    //   404: astore #38
    //   406: aload #38
    //   408: ldc_w 2131297383
    //   411: invokevirtual findViewById : (I)Landroid/view/View;
    //   414: checkcast android/widget/RelativeLayout
    //   417: astore_2
    //   418: aload_2
    //   419: ldc_w 2131296833
    //   422: invokevirtual findViewById : (I)Landroid/view/View;
    //   425: checkcast android/widget/ImageView
    //   428: astore #36
    //   430: aload_2
    //   431: ldc_w 2131297751
    //   434: invokevirtual findViewById : (I)Landroid/view/View;
    //   437: checkcast android/widget/TextView
    //   440: astore #65
    //   442: aload #38
    //   444: ldc_w 2131297770
    //   447: invokevirtual findViewById : (I)Landroid/view/View;
    //   450: checkcast android/widget/TextView
    //   453: astore #51
    //   455: aload #38
    //   457: ldc_w 2131297820
    //   460: invokevirtual findViewById : (I)Landroid/view/View;
    //   463: checkcast android/widget/TextView
    //   466: astore #52
    //   468: aload #38
    //   470: ldc_w 2131297890
    //   473: invokevirtual findViewById : (I)Landroid/view/View;
    //   476: checkcast android/widget/TextView
    //   479: astore #70
    //   481: aload #38
    //   483: ldc_w 2131297763
    //   486: invokevirtual findViewById : (I)Landroid/view/View;
    //   489: checkcast android/widget/TextView
    //   492: astore #60
    //   494: aload #38
    //   496: ldc_w 2131297685
    //   499: invokevirtual findViewById : (I)Landroid/view/View;
    //   502: checkcast android/widget/TextView
    //   505: astore #59
    //   507: aload #38
    //   509: ldc_w 2131297765
    //   512: invokevirtual findViewById : (I)Landroid/view/View;
    //   515: checkcast android/widget/TextView
    //   518: astore #58
    //   520: aload #38
    //   522: ldc_w 2131297692
    //   525: invokevirtual findViewById : (I)Landroid/view/View;
    //   528: checkcast android/widget/TextView
    //   531: astore #57
    //   533: aload #38
    //   535: ldc_w 2131297764
    //   538: invokevirtual findViewById : (I)Landroid/view/View;
    //   541: checkcast android/widget/TextView
    //   544: astore #55
    //   546: aload #38
    //   548: ldc_w 2131297686
    //   551: invokevirtual findViewById : (I)Landroid/view/View;
    //   554: checkcast android/widget/TextView
    //   557: astore #56
    //   559: aload #38
    //   561: ldc_w 2131297767
    //   564: invokevirtual findViewById : (I)Landroid/view/View;
    //   567: checkcast android/widget/TextView
    //   570: astore #54
    //   572: aload #38
    //   574: ldc_w 2131297713
    //   577: invokevirtual findViewById : (I)Landroid/view/View;
    //   580: checkcast android/widget/TextView
    //   583: astore #53
    //   585: aload #38
    //   587: ldc_w 2131297768
    //   590: invokevirtual findViewById : (I)Landroid/view/View;
    //   593: checkcast android/widget/TextView
    //   596: astore #48
    //   598: aload #38
    //   600: ldc_w 2131297757
    //   603: invokevirtual findViewById : (I)Landroid/view/View;
    //   606: checkcast android/widget/TextView
    //   609: astore #47
    //   611: aload #38
    //   613: ldc_w 2131297785
    //   616: invokevirtual findViewById : (I)Landroid/view/View;
    //   619: checkcast android/widget/TextView
    //   622: astore #69
    //   624: aload #38
    //   626: ldc_w 2131297769
    //   629: invokevirtual findViewById : (I)Landroid/view/View;
    //   632: checkcast android/widget/TextView
    //   635: astore #42
    //   637: aload #38
    //   639: ldc_w 2131297856
    //   642: invokevirtual findViewById : (I)Landroid/view/View;
    //   645: checkcast android/widget/TextView
    //   648: astore #64
    //   650: aload #38
    //   652: ldc_w 2131297706
    //   655: invokevirtual findViewById : (I)Landroid/view/View;
    //   658: checkcast android/widget/TextView
    //   661: astore #63
    //   663: aload #38
    //   665: ldc_w 2131297755
    //   668: invokevirtual findViewById : (I)Landroid/view/View;
    //   671: checkcast android/widget/TextView
    //   674: astore #67
    //   676: aload #38
    //   678: ldc_w 2131297747
    //   681: invokevirtual findViewById : (I)Landroid/view/View;
    //   684: checkcast android/widget/TextView
    //   687: astore #62
    //   689: aload #38
    //   691: ldc_w 2131297708
    //   694: invokevirtual findViewById : (I)Landroid/view/View;
    //   697: checkcast android/widget/TextView
    //   700: astore #68
    //   702: aload #38
    //   704: ldc_w 2131297897
    //   707: invokevirtual findViewById : (I)Landroid/view/View;
    //   710: checkcast android/widget/TextView
    //   713: astore #32
    //   715: aload #38
    //   717: ldc_w 2131297737
    //   720: invokevirtual findViewById : (I)Landroid/view/View;
    //   723: checkcast android/widget/TextView
    //   726: astore #30
    //   728: aload #38
    //   730: ldc_w 2131297913
    //   733: invokevirtual findViewById : (I)Landroid/view/View;
    //   736: checkcast android/widget/TextView
    //   739: astore #72
    //   741: aload #38
    //   743: ldc_w 2131297740
    //   746: invokevirtual findViewById : (I)Landroid/view/View;
    //   749: checkcast android/widget/TextView
    //   752: astore #73
    //   754: aload #38
    //   756: ldc_w 2131297871
    //   759: invokevirtual findViewById : (I)Landroid/view/View;
    //   762: checkcast android/widget/TextView
    //   765: astore #40
    //   767: aload #38
    //   769: ldc_w 2131297705
    //   772: invokevirtual findViewById : (I)Landroid/view/View;
    //   775: checkcast android/widget/TextView
    //   778: astore #39
    //   780: aload #38
    //   782: ldc_w 2131297722
    //   785: invokevirtual findViewById : (I)Landroid/view/View;
    //   788: checkcast android/widget/TextView
    //   791: astore_2
    //   792: aload #38
    //   794: ldc_w 2131297725
    //   797: invokevirtual findViewById : (I)Landroid/view/View;
    //   800: checkcast android/widget/TextView
    //   803: astore #29
    //   805: aload #38
    //   807: ldc_w 2131297724
    //   810: invokevirtual findViewById : (I)Landroid/view/View;
    //   813: checkcast android/widget/TextView
    //   816: astore #28
    //   818: aload #38
    //   820: ldc_w 2131297824
    //   823: invokevirtual findViewById : (I)Landroid/view/View;
    //   826: checkcast android/widget/TextView
    //   829: astore #31
    //   831: aload #38
    //   833: ldc_w 2131297746
    //   836: invokevirtual findViewById : (I)Landroid/view/View;
    //   839: checkcast android/widget/TextView
    //   842: astore #44
    //   844: aload #38
    //   846: ldc_w 2131297784
    //   849: invokevirtual findViewById : (I)Landroid/view/View;
    //   852: checkcast android/widget/TextView
    //   855: astore #41
    //   857: aload #38
    //   859: ldc_w 2131297766
    //   862: invokevirtual findViewById : (I)Landroid/view/View;
    //   865: checkcast android/widget/TextView
    //   868: astore #61
    //   870: aload #38
    //   872: ldc_w 2131297712
    //   875: invokevirtual findViewById : (I)Landroid/view/View;
    //   878: checkcast android/widget/TextView
    //   881: astore #66
    //   883: aload #38
    //   885: ldc_w 2131296380
    //   888: invokevirtual findViewById : (I)Landroid/view/View;
    //   891: checkcast android/widget/Button
    //   894: astore #71
    //   896: aload #22
    //   898: ifnonnull -> 911
    //   901: aload #71
    //   903: bipush #8
    //   905: invokevirtual setVisibility : (I)V
    //   908: goto -> 926
    //   911: aload #71
    //   913: new wy0
    //   916: dup
    //   917: aload_0
    //   918: aload_1
    //   919: iconst_0
    //   920: invokespecial <init> : (Landroid/content/Context;Lkm0;I)V
    //   923: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   926: aload #52
    //   928: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   931: aload #45
    //   933: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   936: getfield b : Ljava/lang/String;
    //   939: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   942: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   945: aload #73
    //   947: iload #12
    //   949: i2l
    //   950: iconst_0
    //   951: iconst_0
    //   952: invokestatic B : (JZI)Ljava/lang/String;
    //   955: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   958: aload #36
    //   960: new wy0
    //   963: dup
    //   964: aload_0
    //   965: aload_1
    //   966: iconst_2
    //   967: invokespecial <init> : (Landroid/content/Context;Lkm0;I)V
    //   970: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   973: aload #25
    //   975: ifnull -> 1010
    //   978: aload #25
    //   980: invokevirtual trim : ()Ljava/lang/String;
    //   983: invokevirtual length : ()I
    //   986: ifle -> 1010
    //   989: aload #25
    //   991: ldc_w '<unknown>'
    //   994: invokevirtual equals : (Ljava/lang/Object;)Z
    //   997: ifne -> 1010
    //   1000: aload #70
    //   1002: aload #25
    //   1004: invokevirtual trim : ()Ljava/lang/String;
    //   1007: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1010: aload #27
    //   1012: invokevirtual trim : ()Ljava/lang/String;
    //   1015: invokevirtual length : ()I
    //   1018: ifle -> 1042
    //   1021: aload #27
    //   1023: ldc_w '<unknown>'
    //   1026: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1029: ifne -> 1042
    //   1032: aload #59
    //   1034: aload #27
    //   1036: invokevirtual trim : ()Ljava/lang/String;
    //   1039: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1042: aload #50
    //   1044: invokevirtual trim : ()Ljava/lang/String;
    //   1047: invokevirtual length : ()I
    //   1050: ifle -> 1074
    //   1053: aload #50
    //   1055: ldc_w '<unknown>'
    //   1058: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1061: ifne -> 1074
    //   1064: aload #57
    //   1066: aload #50
    //   1068: invokevirtual trim : ()Ljava/lang/String;
    //   1071: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1074: aload #49
    //   1076: ifnull -> 1117
    //   1079: aload #49
    //   1081: invokevirtual trim : ()Ljava/lang/String;
    //   1084: invokevirtual length : ()I
    //   1087: ifle -> 1117
    //   1090: aload #49
    //   1092: ldc_w '<unknown>'
    //   1095: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1098: ifne -> 1114
    //   1101: aload #56
    //   1103: aload #49
    //   1105: invokevirtual trim : ()Ljava/lang/String;
    //   1108: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1111: goto -> 1117
    //   1114: goto -> 1117
    //   1117: aload #46
    //   1119: ifnull -> 1160
    //   1122: aload #46
    //   1124: invokevirtual trim : ()Ljava/lang/String;
    //   1127: invokevirtual length : ()I
    //   1130: ifle -> 1160
    //   1133: aload #46
    //   1135: ldc_w '<unknown>'
    //   1138: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1141: ifne -> 1157
    //   1144: aload #53
    //   1146: aload #46
    //   1148: invokevirtual trim : ()Ljava/lang/String;
    //   1151: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1154: goto -> 1163
    //   1157: goto -> 1163
    //   1160: goto -> 1157
    //   1163: aload #43
    //   1165: ifnull -> 1200
    //   1168: aload #43
    //   1170: invokevirtual trim : ()Ljava/lang/String;
    //   1173: invokevirtual length : ()I
    //   1176: ifle -> 1200
    //   1179: aload #43
    //   1181: ldc_w '<unknown>'
    //   1184: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1187: ifne -> 1197
    //   1190: aload #47
    //   1192: aload #43
    //   1194: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1197: goto -> 1203
    //   1200: goto -> 1197
    //   1203: iload #10
    //   1205: iconst_m1
    //   1206: if_icmpeq -> 1219
    //   1209: aload #72
    //   1211: iload #10
    //   1213: invokestatic valueOf : (I)Ljava/lang/String;
    //   1216: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1219: iload #7
    //   1221: iconst_m1
    //   1222: if_icmpeq -> 1235
    //   1225: aload #32
    //   1227: iload #7
    //   1229: invokestatic valueOf : (I)Ljava/lang/String;
    //   1232: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1235: iload #9
    //   1237: iconst_m1
    //   1238: if_icmpeq -> 1251
    //   1241: aload #30
    //   1243: iload #9
    //   1245: invokestatic valueOf : (I)Ljava/lang/String;
    //   1248: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1251: aload #31
    //   1253: aload_0
    //   1254: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1257: ldc_w 2131755073
    //   1260: iload #8
    //   1262: iconst_1
    //   1263: anewarray java/lang/Object
    //   1266: dup
    //   1267: iconst_0
    //   1268: iload #8
    //   1270: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1273: aastore
    //   1274: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1277: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1280: iconst_1
    //   1281: iconst_3
    //   1282: aload_0
    //   1283: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1286: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   1289: getfield locale : Ljava/util/Locale;
    //   1292: invokestatic getDateTimeInstance : (IILjava/util/Locale;)Ljava/text/DateFormat;
    //   1295: astore #25
    //   1297: aload #29
    //   1299: aload #25
    //   1301: aload #24
    //   1303: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   1306: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1309: aload_2
    //   1310: aload #25
    //   1312: aload #26
    //   1314: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   1317: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1320: aload #22
    //   1322: ifnull -> 1337
    //   1325: aload #28
    //   1327: aload #25
    //   1329: aload #22
    //   1331: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   1334: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1337: aload #23
    //   1339: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1342: astore_2
    //   1343: goto -> 1456
    //   1346: astore #22
    //   1348: aconst_null
    //   1349: astore #24
    //   1351: aconst_null
    //   1352: astore_2
    //   1353: iconst_m1
    //   1354: istore #7
    //   1356: aconst_null
    //   1357: astore #23
    //   1359: aconst_null
    //   1360: astore #26
    //   1362: aload_2
    //   1363: astore #28
    //   1365: aload #24
    //   1367: astore_2
    //   1368: aconst_null
    //   1369: astore #25
    //   1371: aload #26
    //   1373: astore #24
    //   1375: aconst_null
    //   1376: astore #27
    //   1378: iconst_0
    //   1379: istore #19
    //   1381: iconst_0
    //   1382: istore #8
    //   1384: aload #22
    //   1386: astore #26
    //   1388: aload #25
    //   1390: astore #22
    //   1392: aload #27
    //   1394: astore #25
    //   1396: goto -> 2126
    //   1399: astore_2
    //   1400: aconst_null
    //   1401: astore #24
    //   1403: aconst_null
    //   1404: astore_2
    //   1405: iconst_m1
    //   1406: istore #7
    //   1408: aconst_null
    //   1409: astore #23
    //   1411: aconst_null
    //   1412: astore #26
    //   1414: aload_2
    //   1415: astore #22
    //   1417: aload #24
    //   1419: astore_2
    //   1420: aconst_null
    //   1421: astore #25
    //   1423: aload #26
    //   1425: astore #24
    //   1427: aconst_null
    //   1428: astore #26
    //   1430: iconst_0
    //   1431: istore #19
    //   1433: iconst_0
    //   1434: istore #8
    //   1436: aload_2
    //   1437: astore #30
    //   1439: aload #22
    //   1441: astore #29
    //   1443: aload #26
    //   1445: astore_2
    //   1446: goto -> 2161
    //   1449: astore_2
    //   1450: aload #23
    //   1452: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1455: astore_2
    //   1456: aload_2
    //   1457: invokevirtual getTag : ()Lorg/jaudiotagger/tag/Tag;
    //   1460: astore #28
    //   1462: aload_2
    //   1463: invokevirtual getAudioHeader : ()Lorg/jaudiotagger/audio/AudioHeader;
    //   1466: astore #29
    //   1468: aload #28
    //   1470: getstatic org/jaudiotagger/tag/FieldKey.LYRICIST : Lorg/jaudiotagger/tag/FieldKey;
    //   1473: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   1478: astore_2
    //   1479: aload #28
    //   1481: getstatic org/jaudiotagger/tag/FieldKey.COMMENT : Lorg/jaudiotagger/tag/FieldKey;
    //   1484: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   1489: astore #22
    //   1491: aload #29
    //   1493: invokeinterface getSampleRate : ()Ljava/lang/String;
    //   1498: astore #23
    //   1500: aload #29
    //   1502: invokeinterface getBitsPerSample : ()I
    //   1507: istore #7
    //   1509: aload #29
    //   1511: invokeinterface getFormat : ()Ljava/lang/String;
    //   1516: astore #24
    //   1518: aload #29
    //   1520: invokeinterface getEncodingType : ()Ljava/lang/String;
    //   1525: astore #25
    //   1527: aload #29
    //   1529: invokeinterface getChannels : ()Ljava/lang/String;
    //   1534: astore #27
    //   1536: aload #29
    //   1538: invokeinterface getBitRate : ()Ljava/lang/String;
    //   1543: astore #26
    //   1545: aload #29
    //   1547: invokeinterface isVariableBitRate : ()Z
    //   1552: istore #19
    //   1554: aload #26
    //   1556: ifnull -> 1655
    //   1559: aload #26
    //   1561: invokevirtual trim : ()Ljava/lang/String;
    //   1564: astore #26
    //   1566: aload #26
    //   1568: ldc_w '~'
    //   1571: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1574: istore #20
    //   1576: iload #20
    //   1578: ifeq -> 1609
    //   1581: aload #26
    //   1583: iconst_1
    //   1584: invokevirtual substring : (I)Ljava/lang/String;
    //   1587: invokevirtual trim : ()Ljava/lang/String;
    //   1590: astore #26
    //   1592: iconst_1
    //   1593: istore #20
    //   1595: goto -> 1613
    //   1598: astore #26
    //   1600: iconst_0
    //   1601: istore #8
    //   1603: iconst_1
    //   1604: istore #19
    //   1606: goto -> 1658
    //   1609: iload #19
    //   1611: istore #20
    //   1613: aload #26
    //   1615: invokestatic parseInt : (Ljava/lang/String;)I
    //   1618: istore #9
    //   1620: iload #9
    //   1622: istore #8
    //   1624: iload #20
    //   1626: istore #19
    //   1628: iload #20
    //   1630: ifeq -> 1658
    //   1633: iload #9
    //   1635: invokestatic f : (I)I
    //   1638: istore #8
    //   1640: iload #20
    //   1642: istore #19
    //   1644: goto -> 1658
    //   1647: goto -> 1655
    //   1650: astore #26
    //   1652: goto -> 1647
    //   1655: iconst_0
    //   1656: istore #8
    //   1658: goto -> 1672
    //   1661: astore #26
    //   1663: iconst_0
    //   1664: istore #8
    //   1666: iconst_0
    //   1667: istore #19
    //   1669: goto -> 1658
    //   1672: iload #8
    //   1674: ifgt -> 1904
    //   1677: aload #29
    //   1679: invokeinterface getAudioDataEndPosition : ()Ljava/lang/Long;
    //   1684: astore #26
    //   1686: aload #29
    //   1688: invokeinterface getAudioDataStartPosition : ()Ljava/lang/Long;
    //   1693: astore #29
    //   1695: aload #26
    //   1697: ifnull -> 1904
    //   1700: aload #29
    //   1702: ifnull -> 1904
    //   1705: aload #29
    //   1707: invokevirtual longValue : ()J
    //   1710: lconst_0
    //   1711: lcmp
    //   1712: iflt -> 1904
    //   1715: aload #26
    //   1717: invokevirtual longValue : ()J
    //   1720: aload #29
    //   1722: invokevirtual longValue : ()J
    //   1725: lcmp
    //   1726: ifle -> 1904
    //   1729: aload #26
    //   1731: invokevirtual longValue : ()J
    //   1734: lstore #15
    //   1736: aload #29
    //   1738: invokevirtual longValue : ()J
    //   1741: lstore #17
    //   1743: iload #19
    //   1745: istore #21
    //   1747: iload #8
    //   1749: istore #11
    //   1751: iload #19
    //   1753: istore #20
    //   1755: iload #8
    //   1757: istore #10
    //   1759: lload #15
    //   1761: lload #17
    //   1763: lsub
    //   1764: ldc2_w 1024
    //   1767: ldiv
    //   1768: lstore #15
    //   1770: lload #15
    //   1772: l2d
    //   1773: iload #12
    //   1775: i2d
    //   1776: ldc2_w 1000.0
    //   1779: ddiv
    //   1780: ddiv
    //   1781: d2i
    //   1782: istore #10
    //   1784: iload #8
    //   1786: istore #9
    //   1788: iload #10
    //   1790: ifle -> 1908
    //   1793: iload #10
    //   1795: bipush #8
    //   1797: imul
    //   1798: invokestatic f : (I)I
    //   1801: istore #9
    //   1803: iconst_1
    //   1804: istore #19
    //   1806: goto -> 1908
    //   1809: astore #26
    //   1811: iconst_1
    //   1812: istore #19
    //   1814: aload #22
    //   1816: astore #28
    //   1818: aload #25
    //   1820: astore #22
    //   1822: aload #27
    //   1824: astore #25
    //   1826: goto -> 2126
    //   1829: astore #26
    //   1831: iconst_1
    //   1832: istore #19
    //   1834: aload_2
    //   1835: astore #30
    //   1837: aload #22
    //   1839: astore #29
    //   1841: aload #27
    //   1843: astore_2
    //   1844: goto -> 2161
    //   1847: astore #26
    //   1849: aload #22
    //   1851: astore #28
    //   1853: aload #25
    //   1855: astore #22
    //   1857: aload #27
    //   1859: astore #25
    //   1861: iload #21
    //   1863: istore #19
    //   1865: iload #11
    //   1867: istore #8
    //   1869: goto -> 2126
    //   1872: astore #26
    //   1874: aload #22
    //   1876: astore #28
    //   1878: aload #25
    //   1880: astore #22
    //   1882: aload #27
    //   1884: astore #25
    //   1886: goto -> 2126
    //   1889: astore #26
    //   1891: aload_2
    //   1892: astore #30
    //   1894: aload #22
    //   1896: astore #29
    //   1898: aload #27
    //   1900: astore_2
    //   1901: goto -> 2161
    //   1904: iload #8
    //   1906: istore #9
    //   1908: iload #19
    //   1910: istore #21
    //   1912: iload #9
    //   1914: istore #11
    //   1916: iload #19
    //   1918: istore #20
    //   1920: iload #9
    //   1922: istore #10
    //   1924: aload #28
    //   1926: invokestatic A : (Lorg/jaudiotagger/tag/Tag;)Ljava/lang/String;
    //   1929: astore #29
    //   1931: aload #23
    //   1933: astore #28
    //   1935: aload #24
    //   1937: astore #30
    //   1939: aload #27
    //   1941: astore #24
    //   1943: iload #9
    //   1945: istore #8
    //   1947: aload #25
    //   1949: astore #26
    //   1951: aload #29
    //   1953: astore #23
    //   1955: aload #22
    //   1957: astore #29
    //   1959: aload #28
    //   1961: astore #25
    //   1963: aload #30
    //   1965: astore #27
    //   1967: goto -> 2467
    //   1970: astore #26
    //   1972: aload #22
    //   1974: astore #28
    //   1976: aload #26
    //   1978: astore #22
    //   1980: goto -> 1375
    //   1983: astore #26
    //   1985: goto -> 1427
    //   1988: astore #25
    //   1990: aload #22
    //   1992: astore #28
    //   1994: aload #25
    //   1996: astore #22
    //   1998: aload #24
    //   2000: astore #26
    //   2002: goto -> 1368
    //   2005: astore #25
    //   2007: aload #24
    //   2009: astore #26
    //   2011: goto -> 1420
    //   2014: astore #24
    //   2016: aload #22
    //   2018: astore #25
    //   2020: aload #24
    //   2022: astore #22
    //   2024: aload_2
    //   2025: astore #24
    //   2027: aload #25
    //   2029: astore_2
    //   2030: goto -> 1359
    //   2033: astore #24
    //   2035: aload_2
    //   2036: astore #24
    //   2038: aload #22
    //   2040: astore_2
    //   2041: goto -> 1411
    //   2044: astore #24
    //   2046: aload #22
    //   2048: astore #25
    //   2050: iconst_m1
    //   2051: istore #7
    //   2053: aload #24
    //   2055: astore #22
    //   2057: aload_2
    //   2058: astore #24
    //   2060: aload #25
    //   2062: astore_2
    //   2063: goto -> 1359
    //   2066: astore #24
    //   2068: iconst_m1
    //   2069: istore #7
    //   2071: aload_2
    //   2072: astore #24
    //   2074: aload #22
    //   2076: astore_2
    //   2077: goto -> 1411
    //   2080: astore #24
    //   2082: aload #22
    //   2084: astore #23
    //   2086: aload #24
    //   2088: astore #22
    //   2090: aload_2
    //   2091: astore #24
    //   2093: aload #23
    //   2095: astore_2
    //   2096: goto -> 1353
    //   2099: astore #23
    //   2101: aload_2
    //   2102: astore #24
    //   2104: aload #22
    //   2106: astore_2
    //   2107: goto -> 1405
    //   2110: astore #22
    //   2112: aload_2
    //   2113: astore #24
    //   2115: goto -> 1351
    //   2118: astore #22
    //   2120: aload_2
    //   2121: astore #24
    //   2123: goto -> 1403
    //   2126: aload #26
    //   2128: invokevirtual printStackTrace : ()V
    //   2131: aload #28
    //   2133: astore #29
    //   2135: aload #24
    //   2137: astore #27
    //   2139: aload #25
    //   2141: astore #24
    //   2143: aconst_null
    //   2144: astore #26
    //   2146: aload #23
    //   2148: astore #25
    //   2150: aload #26
    //   2152: astore #23
    //   2154: aload #22
    //   2156: astore #26
    //   2158: goto -> 1967
    //   2161: aload #37
    //   2163: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2166: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   2169: astore #26
    //   2171: aload #26
    //   2173: astore #22
    //   2175: aload #26
    //   2177: invokestatic N : (Landroid/net/Uri;)Z
    //   2180: ifeq -> 2201
    //   2183: aload #26
    //   2185: invokestatic M : (Landroid/net/Uri;)Landroid/net/Uri;
    //   2188: astore #22
    //   2190: goto -> 2201
    //   2193: astore #26
    //   2195: aconst_null
    //   2196: astore #22
    //   2198: goto -> 2386
    //   2201: new jt1
    //   2204: astore #31
    //   2206: aload_0
    //   2207: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2210: astore #26
    //   2212: aload #31
    //   2214: aload #26
    //   2216: aload #22
    //   2218: bipush #19
    //   2220: invokespecial <init> : (Landroid/content/Context;Landroid/net/Uri;I)V
    //   2223: aload #31
    //   2225: astore #32
    //   2227: iload #7
    //   2229: istore #9
    //   2231: aload #23
    //   2233: astore #22
    //   2235: aload #24
    //   2237: astore #26
    //   2239: aload #25
    //   2241: astore #27
    //   2243: aload_2
    //   2244: astore #28
    //   2246: aload #31
    //   2248: getfield c : Z
    //   2251: ifeq -> 2369
    //   2254: aload #31
    //   2256: getfield e : Ljava/lang/String;
    //   2259: astore #26
    //   2261: aload #31
    //   2263: getfield f : Ljava/lang/String;
    //   2266: astore #22
    //   2268: aload #31
    //   2270: getfield g : Ljava/lang/String;
    //   2273: astore #25
    //   2275: aload #31
    //   2277: getfield h : Ljava/lang/String;
    //   2280: astore_2
    //   2281: aload #31
    //   2283: getfield i : I
    //   2286: istore #9
    //   2288: aload #22
    //   2290: astore #27
    //   2292: aload #31
    //   2294: astore #32
    //   2296: aload_2
    //   2297: astore #22
    //   2299: aload #25
    //   2301: astore #28
    //   2303: goto -> 2369
    //   2306: astore #24
    //   2308: aload_2
    //   2309: astore #23
    //   2311: aload #25
    //   2313: astore_2
    //   2314: aload #22
    //   2316: astore #25
    //   2318: aload #24
    //   2320: astore #22
    //   2322: aload #26
    //   2324: astore #24
    //   2326: aload #22
    //   2328: astore #26
    //   2330: aload #31
    //   2332: astore #22
    //   2334: goto -> 2386
    //   2337: astore #24
    //   2339: goto -> 2311
    //   2342: astore #24
    //   2344: aload #22
    //   2346: astore #25
    //   2348: aload #24
    //   2350: astore #22
    //   2352: goto -> 2322
    //   2355: astore #22
    //   2357: goto -> 2322
    //   2360: astore #26
    //   2362: aload #31
    //   2364: astore #22
    //   2366: goto -> 2386
    //   2369: aload #32
    //   2371: invokevirtual close : ()V
    //   2374: aload #22
    //   2376: astore #31
    //   2378: goto -> 2441
    //   2381: astore #26
    //   2383: goto -> 2195
    //   2386: aload #26
    //   2388: invokevirtual printStackTrace : ()V
    //   2391: iload #7
    //   2393: istore #9
    //   2395: aload #23
    //   2397: astore #31
    //   2399: aload #24
    //   2401: astore #26
    //   2403: aload #25
    //   2405: astore #27
    //   2407: aload_2
    //   2408: astore #28
    //   2410: aload #22
    //   2412: ifnull -> 2441
    //   2415: aload #22
    //   2417: astore #32
    //   2419: iload #7
    //   2421: istore #9
    //   2423: aload #23
    //   2425: astore #22
    //   2427: aload #24
    //   2429: astore #26
    //   2431: aload #25
    //   2433: astore #27
    //   2435: aload_2
    //   2436: astore #28
    //   2438: goto -> 2369
    //   2441: aload #31
    //   2443: astore #23
    //   2445: aload #30
    //   2447: astore_2
    //   2448: iload #9
    //   2450: istore #7
    //   2452: aload #26
    //   2454: astore #24
    //   2456: aload #27
    //   2458: astore #22
    //   2460: aload #28
    //   2462: astore #25
    //   2464: goto -> 2135
    //   2467: aload_1
    //   2468: invokestatic D : (Lkm0;)Lv00;
    //   2471: astore #22
    //   2473: aload_2
    //   2474: ifnull -> 2506
    //   2477: aload_2
    //   2478: invokevirtual trim : ()Ljava/lang/String;
    //   2481: invokevirtual length : ()I
    //   2484: ifle -> 2506
    //   2487: aload_2
    //   2488: ldc_w '<unknown>'
    //   2491: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2494: ifne -> 2506
    //   2497: aload #69
    //   2499: aload_2
    //   2500: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2503: goto -> 2506
    //   2506: aload #29
    //   2508: ifnull -> 2588
    //   2511: aload #29
    //   2513: invokevirtual trim : ()Ljava/lang/String;
    //   2516: astore_2
    //   2517: aload_2
    //   2518: invokevirtual length : ()I
    //   2521: ifle -> 2588
    //   2524: aload_2
    //   2525: ldc_w '<unknown>'
    //   2528: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2531: ifne -> 2588
    //   2534: aload #66
    //   2536: aload_2
    //   2537: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2540: new ql
    //   2543: dup
    //   2544: iconst_4
    //   2545: aload_2
    //   2546: invokespecial <init> : (ILjava/lang/Object;)V
    //   2549: astore_2
    //   2550: aload #66
    //   2552: aload_2
    //   2553: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2556: aload #61
    //   2558: aload_2
    //   2559: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2562: aload #61
    //   2564: aconst_null
    //   2565: aconst_null
    //   2566: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2569: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2572: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2575: ldc_w 2131231364
    //   2578: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   2581: aconst_null
    //   2582: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   2585: goto -> 2588
    //   2588: aload #25
    //   2590: ifnull -> 2614
    //   2593: aload #25
    //   2595: invokevirtual length : ()I
    //   2598: ifle -> 2614
    //   2601: aload #64
    //   2603: aload #25
    //   2605: ldc_w ' Hz'
    //   2608: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   2611: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2614: iload #7
    //   2616: ifle -> 2629
    //   2619: aload #63
    //   2621: iload #7
    //   2623: invokestatic valueOf : (I)Ljava/lang/String;
    //   2626: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2629: aload #27
    //   2631: ifnull -> 2649
    //   2634: aload #27
    //   2636: invokevirtual length : ()I
    //   2639: ifle -> 2649
    //   2642: aload #67
    //   2644: aload #27
    //   2646: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2649: aload #26
    //   2651: ifnull -> 2669
    //   2654: aload #26
    //   2656: invokevirtual length : ()I
    //   2659: ifle -> 2669
    //   2662: aload #62
    //   2664: aload #26
    //   2666: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2669: aload #24
    //   2671: ifnull -> 2689
    //   2674: aload #24
    //   2676: invokevirtual length : ()I
    //   2679: ifle -> 2689
    //   2682: aload #68
    //   2684: aload #24
    //   2686: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2689: aload #65
    //   2691: aload_1
    //   2692: getfield g : Ljava/lang/String;
    //   2695: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2698: new sy0
    //   2701: dup
    //   2702: aload_1
    //   2703: aload_1
    //   2704: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   2707: getfield c : Llm0;
    //   2710: getfield D : I
    //   2713: invokevirtual m : (I)Ljava/lang/String;
    //   2716: iconst_0
    //   2717: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2720: astore_2
    //   2721: aload #59
    //   2723: aload_2
    //   2724: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2727: aload #60
    //   2729: aload_2
    //   2730: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2733: new sy0
    //   2736: dup
    //   2737: aload_1
    //   2738: aload #50
    //   2740: iconst_1
    //   2741: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2744: astore_2
    //   2745: aload #57
    //   2747: aload_2
    //   2748: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2751: aload #58
    //   2753: aload_2
    //   2754: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2757: new sy0
    //   2760: dup
    //   2761: aload_1
    //   2762: aload #49
    //   2764: iconst_2
    //   2765: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2768: astore_2
    //   2769: aload #56
    //   2771: aload_2
    //   2772: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2775: aload #55
    //   2777: aload_2
    //   2778: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2781: new sy0
    //   2784: dup
    //   2785: aload_1
    //   2786: aload #46
    //   2788: iconst_3
    //   2789: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2792: astore_2
    //   2793: aload #53
    //   2795: aload_2
    //   2796: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2799: aload #54
    //   2801: aload_2
    //   2802: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2805: new sy0
    //   2808: dup
    //   2809: aload_1
    //   2810: aload #45
    //   2812: iconst_4
    //   2813: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2816: astore_2
    //   2817: aload #52
    //   2819: aload_2
    //   2820: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2823: aload #51
    //   2825: aload_2
    //   2826: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2829: new sy0
    //   2832: dup
    //   2833: aload_1
    //   2834: aload #43
    //   2836: iconst_5
    //   2837: invokespecial <init> : (Lkm0;Ljava/lang/String;I)V
    //   2840: astore_2
    //   2841: aload #47
    //   2843: aload_2
    //   2844: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2847: aload #48
    //   2849: aload_2
    //   2850: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2853: aload #23
    //   2855: ifnull -> 2886
    //   2858: aload #23
    //   2860: invokevirtual trim : ()Ljava/lang/String;
    //   2863: invokevirtual length : ()I
    //   2866: ifle -> 2886
    //   2869: aload #23
    //   2871: ldc_w '<unknown>'
    //   2874: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2877: ifne -> 2886
    //   2880: iconst_1
    //   2881: istore #20
    //   2883: goto -> 2889
    //   2886: iconst_0
    //   2887: istore #20
    //   2889: aload #22
    //   2891: ifnull -> 2900
    //   2894: iconst_1
    //   2895: istore #21
    //   2897: goto -> 2903
    //   2900: iconst_0
    //   2901: istore #21
    //   2903: iload #20
    //   2905: ifne -> 2921
    //   2908: iload #21
    //   2910: ifeq -> 2916
    //   2913: goto -> 2921
    //   2916: aconst_null
    //   2917: astore_2
    //   2918: goto -> 2939
    //   2921: new ty0
    //   2924: dup
    //   2925: iload #21
    //   2927: aload #23
    //   2929: iload #20
    //   2931: aload #22
    //   2933: aload_1
    //   2934: aload_0
    //   2935: invokespecial <init> : (ZLjava/lang/String;ZLv00;Lkm0;Landroid/content/Context;)V
    //   2938: astore_2
    //   2939: iload #20
    //   2941: ifeq -> 2959
    //   2944: aload #44
    //   2946: iconst_0
    //   2947: invokevirtual setVisibility : (I)V
    //   2950: aload #44
    //   2952: aload_2
    //   2953: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2956: goto -> 2959
    //   2959: iload #21
    //   2961: ifeq -> 3009
    //   2964: aload #41
    //   2966: iconst_0
    //   2967: invokevirtual setVisibility : (I)V
    //   2970: aload #41
    //   2972: aload_2
    //   2973: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2976: iload #20
    //   2978: ifeq -> 3009
    //   2981: aload #41
    //   2983: aload #41
    //   2985: invokevirtual getPaddingLeft : ()I
    //   2988: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   2991: ldc_w 8.0
    //   2994: fmul
    //   2995: f2i
    //   2996: aload #41
    //   2998: invokevirtual getPaddingRight : ()I
    //   3001: aload #41
    //   3003: invokevirtual getPaddingBottom : ()I
    //   3006: invokevirtual setPadding : (IIII)V
    //   3009: iload #20
    //   3011: ifne -> 3025
    //   3014: iload #21
    //   3016: ifeq -> 3022
    //   3019: goto -> 3025
    //   3022: goto -> 3044
    //   3025: aload #42
    //   3027: iconst_0
    //   3028: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   3031: ldc_w 4.0
    //   3034: fmul
    //   3035: f2i
    //   3036: iconst_0
    //   3037: iconst_0
    //   3038: invokevirtual setPadding : (IIII)V
    //   3041: goto -> 3022
    //   3044: lload #13
    //   3046: l2d
    //   3047: dstore_3
    //   3048: dload_3
    //   3049: ldc2_w 1.073741824E9
    //   3052: ddiv
    //   3053: dstore #5
    //   3055: dload #5
    //   3057: dconst_1
    //   3058: dcmpl
    //   3059: ifle -> 3088
    //   3062: aload #40
    //   3064: ldc_w '%.2f GB'
    //   3067: iconst_1
    //   3068: anewarray java/lang/Object
    //   3071: dup
    //   3072: iconst_0
    //   3073: dload #5
    //   3075: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3078: aastore
    //   3079: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3082: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3085: goto -> 3196
    //   3088: dload_3
    //   3089: ldc2_w 1048576.0
    //   3092: ddiv
    //   3093: dstore #5
    //   3095: dload #5
    //   3097: dconst_1
    //   3098: dcmpl
    //   3099: ifle -> 3128
    //   3102: aload #40
    //   3104: ldc_w '%.2f MB'
    //   3107: iconst_1
    //   3108: anewarray java/lang/Object
    //   3111: dup
    //   3112: iconst_0
    //   3113: dload #5
    //   3115: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3118: aastore
    //   3119: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3122: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3125: goto -> 3196
    //   3128: dload_3
    //   3129: ldc2_w 1024.0
    //   3132: ddiv
    //   3133: dstore_3
    //   3134: dload_3
    //   3135: dconst_1
    //   3136: dcmpl
    //   3137: ifle -> 3165
    //   3140: aload #40
    //   3142: ldc_w '%.2f KB'
    //   3145: iconst_1
    //   3146: anewarray java/lang/Object
    //   3149: dup
    //   3150: iconst_0
    //   3151: dload_3
    //   3152: invokestatic valueOf : (D)Ljava/lang/Double;
    //   3155: aastore
    //   3156: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3159: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3162: goto -> 3196
    //   3165: new java/lang/StringBuilder
    //   3168: dup
    //   3169: invokespecial <init> : ()V
    //   3172: astore_2
    //   3173: aload_2
    //   3174: dload_3
    //   3175: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3178: pop
    //   3179: aload_2
    //   3180: ldc_w 'bytes'
    //   3183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3186: pop
    //   3187: aload #40
    //   3189: aload_2
    //   3190: invokevirtual toString : ()Ljava/lang/String;
    //   3193: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3196: iload #8
    //   3198: ifle -> 3268
    //   3201: new java/lang/StringBuilder
    //   3204: astore #22
    //   3206: aload #22
    //   3208: invokespecial <init> : ()V
    //   3211: iload #19
    //   3213: ifeq -> 3223
    //   3216: ldc_w '~'
    //   3219: astore_2
    //   3220: goto -> 3227
    //   3223: ldc_w ''
    //   3226: astore_2
    //   3227: aload #22
    //   3229: aload_2
    //   3230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3233: pop
    //   3234: aload #22
    //   3236: iload #8
    //   3238: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3241: pop
    //   3242: aload #22
    //   3244: ldc_w ' kbps'
    //   3247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3250: pop
    //   3251: aload #39
    //   3253: aload #22
    //   3255: invokevirtual toString : ()Ljava/lang/String;
    //   3258: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3261: goto -> 3329
    //   3264: astore_2
    //   3265: goto -> 3322
    //   3268: lload #13
    //   3270: iload #12
    //   3272: i2l
    //   3273: ldiv
    //   3274: ldc2_w 8
    //   3277: lmul
    //   3278: l2i
    //   3279: invokestatic f : (I)I
    //   3282: istore #7
    //   3284: new java/lang/StringBuilder
    //   3287: astore_2
    //   3288: aload_2
    //   3289: ldc_w '~'
    //   3292: invokespecial <init> : (Ljava/lang/String;)V
    //   3295: aload_2
    //   3296: iload #7
    //   3298: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3301: pop
    //   3302: aload_2
    //   3303: ldc_w ' kbps'
    //   3306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3309: pop
    //   3310: aload #39
    //   3312: aload_2
    //   3313: invokevirtual toString : ()Ljava/lang/String;
    //   3316: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3319: goto -> 3329
    //   3322: aload_2
    //   3323: invokevirtual toString : ()Ljava/lang/String;
    //   3326: invokestatic v : (Ljava/lang/String;)V
    //   3329: invokestatic U : ()Z
    //   3332: ifeq -> 3653
    //   3335: aload #35
    //   3337: ldc_w 2131297924
    //   3340: invokevirtual findViewById : (I)Landroid/view/View;
    //   3343: iconst_0
    //   3344: invokevirtual setVisibility : (I)V
    //   3347: aload #35
    //   3349: ldc_w 2131297772
    //   3352: invokevirtual findViewById : (I)Landroid/view/View;
    //   3355: iconst_0
    //   3356: invokevirtual setVisibility : (I)V
    //   3359: aload #38
    //   3361: ldc_w 2131297846
    //   3364: invokevirtual findViewById : (I)Landroid/view/View;
    //   3367: checkcast android/widget/TextView
    //   3370: astore #23
    //   3372: aload #38
    //   3374: ldc_w 2131296426
    //   3377: invokevirtual findViewById : (I)Landroid/view/View;
    //   3380: checkcast android/widget/Button
    //   3383: astore #24
    //   3385: aload #23
    //   3387: iconst_0
    //   3388: invokevirtual setVisibility : (I)V
    //   3391: aload #24
    //   3393: iconst_0
    //   3394: invokevirtual setVisibility : (I)V
    //   3397: aload #37
    //   3399: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   3402: invokestatic j0 : (Ljava/lang/String;)[F
    //   3405: astore #22
    //   3407: aload #22
    //   3409: iconst_0
    //   3410: faload
    //   3411: ldc_w -999.0
    //   3414: fcmpl
    //   3415: ifne -> 3434
    //   3418: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3421: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3424: ldc_w 2131887531
    //   3427: invokevirtual getString : (I)Ljava/lang/String;
    //   3430: astore_2
    //   3431: goto -> 3467
    //   3434: new java/lang/StringBuilder
    //   3437: dup
    //   3438: invokespecial <init> : ()V
    //   3441: astore_2
    //   3442: aload_2
    //   3443: aload #22
    //   3445: iconst_0
    //   3446: faload
    //   3447: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   3450: pop
    //   3451: aload_2
    //   3452: ldc_w ' dB'
    //   3455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3458: pop
    //   3459: aload_2
    //   3460: invokevirtual toString : ()Ljava/lang/String;
    //   3463: astore_2
    //   3464: goto -> 3431
    //   3467: aload #22
    //   3469: iconst_1
    //   3470: faload
    //   3471: ldc_w -999.0
    //   3474: fcmpl
    //   3475: ifne -> 3495
    //   3478: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3481: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3484: ldc_w 2131887531
    //   3487: invokevirtual getString : (I)Ljava/lang/String;
    //   3490: astore #22
    //   3492: goto -> 3530
    //   3495: new java/lang/StringBuilder
    //   3498: dup
    //   3499: invokespecial <init> : ()V
    //   3502: astore #25
    //   3504: aload #25
    //   3506: aload #22
    //   3508: iconst_1
    //   3509: faload
    //   3510: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   3513: pop
    //   3514: aload #25
    //   3516: ldc_w ' dB'
    //   3519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3522: pop
    //   3523: aload #25
    //   3525: invokevirtual toString : ()Ljava/lang/String;
    //   3528: astore #22
    //   3530: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3533: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3536: ldc_w 2131887518
    //   3539: invokevirtual getString : (I)Ljava/lang/String;
    //   3542: astore #25
    //   3544: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   3547: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   3550: ldc_w 2131886141
    //   3553: invokevirtual getString : (I)Ljava/lang/String;
    //   3556: astore #26
    //   3558: new java/lang/StringBuilder
    //   3561: dup
    //   3562: invokespecial <init> : ()V
    //   3565: astore #27
    //   3567: aload #27
    //   3569: aload #25
    //   3571: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3574: pop
    //   3575: aload #27
    //   3577: ldc_w ' = '
    //   3580: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3583: pop
    //   3584: aload #27
    //   3586: aload_2
    //   3587: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3590: pop
    //   3591: aload #27
    //   3593: ldc_w '\\n'
    //   3596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3599: pop
    //   3600: aload #27
    //   3602: aload #26
    //   3604: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3607: pop
    //   3608: aload #27
    //   3610: ldc_w ' = '
    //   3613: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3616: pop
    //   3617: aload #27
    //   3619: aload #22
    //   3621: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3624: pop
    //   3625: aload #23
    //   3627: aload #27
    //   3629: invokevirtual toString : ()Ljava/lang/String;
    //   3632: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   3635: aload #24
    //   3637: new wy0
    //   3640: dup
    //   3641: aload_0
    //   3642: aload_1
    //   3643: iconst_1
    //   3644: invokespecial <init> : (Landroid/content/Context;Lkm0;I)V
    //   3647: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   3650: goto -> 3653
    //   3653: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   3656: aload_1
    //   3657: getstatic m92.k : I
    //   3660: iconst_1
    //   3661: invokestatic n : (Lkm0;IZ)Landroid/net/Uri;
    //   3664: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   3667: astore_2
    //   3668: aload_2
    //   3669: iconst_1
    //   3670: newarray int
    //   3672: dup
    //   3673: iconst_0
    //   3674: iconst_2
    //   3675: iastore
    //   3676: invokevirtual g : ([I)V
    //   3679: aload_2
    //   3680: iconst_1
    //   3681: putfield d : Z
    //   3684: aload_2
    //   3685: iconst_1
    //   3686: putfield c : Z
    //   3689: aload_2
    //   3690: invokevirtual b : ()V
    //   3693: aload_2
    //   3694: aload #36
    //   3696: invokevirtual f : (Landroid/widget/ImageView;)V
    //   3699: aload_0
    //   3700: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   3703: ldc_w 2131231186
    //   3706: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   3709: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   3712: astore_2
    //   3713: getstatic m92.h : [I
    //   3716: iconst_5
    //   3717: iaload
    //   3718: aload_2
    //   3719: invokestatic C0 : (ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   3722: pop
    //   3723: new ms0
    //   3726: dup
    //   3727: aload_0
    //   3728: invokespecial <init> : (Landroid/content/Context;)V
    //   3731: astore #22
    //   3733: aload #22
    //   3735: ldc_w 2131887416
    //   3738: invokevirtual q : (I)V
    //   3741: aload #22
    //   3743: aload_2
    //   3744: putfield S : Landroid/graphics/drawable/Drawable;
    //   3747: aload #22
    //   3749: aload #35
    //   3751: iconst_0
    //   3752: invokevirtual f : (Landroid/view/View;Z)V
    //   3755: aload #22
    //   3757: ldc_w 2131886467
    //   3760: invokevirtual n : (I)V
    //   3763: aload #22
    //   3765: new java/lang/Object
    //   3768: dup
    //   3769: invokespecial <init> : ()V
    //   3772: putfield W : Landroid/content/DialogInterface$OnDismissListener;
    //   3775: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   3778: astore_2
    //   3779: aload_2
    //   3780: aload_0
    //   3781: if_acmpne -> 3787
    //   3784: goto -> 3789
    //   3787: aconst_null
    //   3788: astore_2
    //   3789: aload #22
    //   3791: aload_2
    //   3792: putfield X : Landroid/content/DialogInterface$OnCancelListener;
    //   3795: aload #22
    //   3797: ldc_w 2131886487
    //   3800: invokevirtual l : (I)V
    //   3803: aload #22
    //   3805: new xw
    //   3808: dup
    //   3809: aload #34
    //   3811: aload_0
    //   3812: aload #33
    //   3814: iconst_5
    //   3815: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   3818: putfield C : Lrs0;
    //   3821: new ss0
    //   3824: dup
    //   3825: aload #22
    //   3827: invokespecial <init> : (Lms0;)V
    //   3830: astore_0
    //   3831: aload_0
    //   3832: invokevirtual show : ()V
    //   3835: aload_0
    //   3836: aload_1
    //   3837: getfield b : I
    //   3840: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3843: putfield v : Ljava/lang/Integer;
    //   3846: aload_0
    //   3847: putstatic in/krosbits/musicolet/MusicActivity.S0 : Lss0;
    //   3850: return
    //   3851: astore_0
    //   3852: aload #22
    //   3854: ifnull -> 3862
    //   3857: aload #22
    //   3859: invokevirtual close : ()V
    //   3862: aload_0
    //   3863: athrow
    //   3864: ldc_w 2131886562
    //   3867: iconst_0
    //   3868: invokestatic O0 : (II)V
    //   3871: return
    //   3872: astore #26
    //   3874: goto -> 1647
    //   3877: astore #26
    //   3879: iload #20
    //   3881: istore #19
    //   3883: goto -> 1655
    //   3886: astore #26
    //   3888: iload #9
    //   3890: istore #8
    //   3892: iload #20
    //   3894: istore #19
    //   3896: goto -> 1658
    //   3899: astore #26
    //   3901: aload_2
    //   3902: astore #30
    //   3904: aload #22
    //   3906: astore #29
    //   3908: aload #27
    //   3910: astore_2
    //   3911: iload #20
    //   3913: istore #19
    //   3915: iload #10
    //   3917: istore #8
    //   3919: goto -> 2161
    //   3922: astore_2
    //   3923: aload #22
    //   3925: astore #31
    //   3927: goto -> 2441
    //   3930: astore_1
    //   3931: goto -> 3862
    // Exception table:
    //   from	to	target	type
    //   1337	1343	1449	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   1337	1343	1449	org/jaudiotagger/tag/TagException
    //   1337	1343	1449	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   1337	1343	1399	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1337	1343	1346	finally
    //   1450	1456	1399	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1450	1456	1346	finally
    //   1456	1479	1399	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1456	1479	1346	finally
    //   1479	1491	2118	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1479	1491	2110	finally
    //   1491	1500	2099	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1491	1500	2080	finally
    //   1500	1509	2066	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1500	1509	2044	finally
    //   1509	1518	2033	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1509	1518	2014	finally
    //   1518	1527	2005	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1518	1527	1988	finally
    //   1527	1536	1983	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1527	1536	1970	finally
    //   1536	1554	1661	finally
    //   1559	1566	1650	finally
    //   1566	1576	3872	finally
    //   1581	1592	1598	finally
    //   1613	1620	3877	finally
    //   1633	1640	3886	finally
    //   1677	1695	1889	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1677	1695	1872	finally
    //   1705	1743	1889	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1705	1743	1872	finally
    //   1759	1770	3899	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1759	1770	1847	finally
    //   1793	1803	1829	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1793	1803	1809	finally
    //   1924	1931	3899	org/jaudiotagger/audio/exceptions/CannotReadException
    //   1924	1931	1847	finally
    //   2161	2171	2193	finally
    //   2175	2190	2193	finally
    //   2201	2212	2193	finally
    //   2212	2223	2381	finally
    //   2246	2261	2360	finally
    //   2261	2268	2355	finally
    //   2268	2275	2342	finally
    //   2275	2281	2337	finally
    //   2281	2288	2306	finally
    //   2369	2374	3922	finally
    //   2386	2391	3851	finally
    //   3201	3211	3264	java/lang/ArithmeticException
    //   3227	3261	3264	java/lang/ArithmeticException
    //   3268	3319	3264	java/lang/ArithmeticException
    //   3857	3862	3930	finally
  }
  
  public static void G0(String paramString, int paramInt) {
    Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("actshjp_AL_").putExtra("extshjp_", paramString).putExtra("extshjsr_", paramInt).addFlags(268435456);
    MyApplication.i.getApplicationContext().startActivity(intent);
  }
  
  public static void H0(int paramInt1, int paramInt2, String paramString) {
    Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).putExtra("extshjp_", paramString).putExtra("extshjsr_", paramInt1).addFlags(268435456);
    if (paramInt2 == 0) {
      intent.setAction("actshjp_AR_");
    } else if (paramInt2 == 1) {
      intent.setAction("actshjp_ALAR_");
    } else if (paramInt2 == 2) {
      intent.setAction("actshjp_CM_");
    } 
    MyApplication.i.getApplicationContext().startActivity(intent);
  }
  
  public static void I0(String paramString, int paramInt) {
    Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("actshjp_F_").putExtra("extshjsr_", paramInt).putExtra("extshjp_", paramString).addFlags(268435456);
    MyApplication.i.getApplicationContext().startActivity(intent);
  }
  
  public static void J0(String paramString, int paramInt) {
    Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction(PwbbJfsdcHrAjW.rYe).putExtra("extshjsr_", paramInt).putExtra("extshjp_", paramString).addFlags(268435456);
    MyApplication.i.getApplicationContext().startActivity(intent);
  }
  
  public static void l0(MusicActivity paramMusicActivity) {
    wg wg;
    Toolbar toolbar = paramMusicActivity.S;
    if (paramMusicActivity.F0) {
      wg = new wg(0, 1);
      wg.d = (int)(MyApplication.p * 2.0F);
    } else {
      wg = new wg(0, 0);
      wg.d = (int)(MyApplication.p * 2.0F);
    } 
    toolbar.setBackground((Drawable)wg);
    paramMusicActivity.T.getTabSelectedIndicator().invalidateSelf();
    TabLayout tabLayout = paramMusicActivity.T;
    int[] arrayOfInt = m92.h;
    tabLayout.setSelectedTabIndicatorColor(arrayOfInt[5]);
    ag0.C0(arrayOfInt[5], paramMusicActivity.T.getTabSelectedIndicator());
    if (paramMusicActivity.U.getCurrentItem() == 1) {
      ws1 ws1 = paramMusicActivity.T.h(1);
      tabLayout = ws1.g;
      if (tabLayout != null) {
        tabLayout.m(ws1, true);
      } else {
        l0.l("Tab not attached to a TabLayout");
        return;
      } 
    } 
    paramMusicActivity.d0.J0(true);
    paramMusicActivity.p0 = true;
  }
  
  public static void n0(MusicActivity paramMusicActivity) {
    InputMethodManager inputMethodManager = (InputMethodManager)paramMusicActivity.getSystemService("input_method");
    if (inputMethodManager != null) {
      byte b = 0;
      while (true) {
        if (b < 3) {
          (new String[3])[0] = "mCurRootView";
          (new String[3])[1] = "mServedView";
          (new String[3])[2] = "mNextServedView";
          String str = (new String[3])[b];
          try {
            Field field = inputMethodManager.getClass().getDeclaredField(str);
            if (!field.isAccessible())
              field.setAccessible(true); 
            Object object = field.get(inputMethodManager);
            if (object instanceof View) {
              object = object;
              if (object.getContext() == paramMusicActivity) {
                field.set(inputMethodManager, null);
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("fixInputMethodManagerLeak break, context is not suitable, get_context=");
                stringBuilder.append(object.getContext());
                stringBuilder.append(" dest_context=");
                stringBuilder.append(paramMusicActivity);
                Log.e("JSTMUSIC2", stringBuilder.toString());
                return;
              } 
            } 
          } finally {}
          b++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public static String o0(int paramInt) {
    switch (paramInt) {
      default:
        return null;
      case 6:
        return MyApplication.i.getApplicationContext().getString(2131886629);
      case 5:
        return MyApplication.i.getApplicationContext().getString(2131887104);
      case 4:
        return MyApplication.i.getApplicationContext().getString(2131886211);
      case 3:
        return MyApplication.i.getApplicationContext().getString(2131886155);
      case 2:
        return MyApplication.i.getApplicationContext().getString(2131886603);
      case 1:
        return MyApplication.i.getApplicationContext().getString(2131887023);
      case 0:
        break;
    } 
    return MyApplication.i.getApplicationContext().getString(2131887136);
  }
  
  public final void A() {
    ua0 ua0 = this.h0.h(this.U.getCurrentItem());
    if (ua0 instanceof qy0)
      ((qy0)ua0).A(); 
  }
  
  public final void A0() {
    Intent intent = this.y0;
    if (intent != null) {
      Bundle bundle = intent.getExtras();
      String str = this.y0.getStringExtra("query");
      this.y0 = null;
      MusicService musicService = this.j0;
      if (musicService != null && musicService.w)
        ew0.e(musicService, str, bundle); 
    } 
  }
  
  public final void B0() {
    // Byte code:
    //   0: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3: ldc_w 'k_i_npblam'
    //   6: iconst_3
    //   7: invokeinterface getInt : (Ljava/lang/String;I)I
    //   12: istore #5
    //   14: iload #5
    //   16: ifeq -> 50
    //   19: aload_0
    //   20: getfield U : Lt32;
    //   23: invokevirtual getCurrentItem : ()I
    //   26: istore_2
    //   27: iconst_1
    //   28: istore_1
    //   29: iload_2
    //   30: iconst_1
    //   31: if_icmpne -> 50
    //   34: aload_0
    //   35: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   38: ifnull -> 50
    //   41: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   44: ifnull -> 50
    //   47: goto -> 52
    //   50: iconst_0
    //   51: istore_1
    //   52: invokestatic y : ()Lkm0;
    //   55: astore #8
    //   57: aload #8
    //   59: ifnull -> 71
    //   62: aload #8
    //   64: getfield b : I
    //   67: istore_3
    //   68: goto -> 73
    //   71: iconst_0
    //   72: istore_3
    //   73: aconst_null
    //   74: astore #7
    //   76: iload_3
    //   77: ifeq -> 88
    //   80: iload_3
    //   81: aload_0
    //   82: getfield n0 : I
    //   85: if_icmpeq -> 93
    //   88: aload_0
    //   89: aconst_null
    //   90: putfield r0 : Landroid/graphics/Bitmap;
    //   93: iload_1
    //   94: ifeq -> 382
    //   97: iload_3
    //   98: ifne -> 106
    //   101: aload_0
    //   102: invokevirtual z0 : ()V
    //   105: return
    //   106: aload_0
    //   107: getfield n0 : I
    //   110: istore_1
    //   111: iload_3
    //   112: iload_1
    //   113: if_icmpne -> 123
    //   116: aload_0
    //   117: getfield p0 : Z
    //   120: ifne -> 386
    //   123: iload_3
    //   124: iload_1
    //   125: if_icmpne -> 161
    //   128: aload_0
    //   129: getfield r0 : Landroid/graphics/Bitmap;
    //   132: astore #9
    //   134: aload #9
    //   136: ifnull -> 161
    //   139: aload #9
    //   141: invokevirtual isRecycled : ()Z
    //   144: ifne -> 161
    //   147: aload_0
    //   148: getfield s0 : Lyy0;
    //   151: aload_0
    //   152: getfield r0 : Landroid/graphics/Bitmap;
    //   155: invokevirtual c : (Landroid/graphics/Bitmap;)V
    //   158: goto -> 386
    //   161: aload_0
    //   162: aconst_null
    //   163: putfield r0 : Landroid/graphics/Bitmap;
    //   166: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   169: aload_0
    //   170: getfield s0 : Lyy0;
    //   173: invokevirtual b : (Lkt1;)V
    //   176: iload #5
    //   178: iconst_3
    //   179: if_icmpne -> 202
    //   182: new w61
    //   185: astore #7
    //   187: aload #7
    //   189: iconst_4
    //   190: invokespecial <init> : (I)V
    //   193: bipush #24
    //   195: istore_1
    //   196: bipush #24
    //   198: istore_2
    //   199: goto -> 247
    //   202: aload_0
    //   203: getfield G0 : I
    //   206: istore_1
    //   207: aload_0
    //   208: getfield H0 : I
    //   211: istore_2
    //   212: iload #5
    //   214: iconst_2
    //   215: if_icmpne -> 247
    //   218: iload_1
    //   219: i2d
    //   220: ldc2_w 4.7
    //   223: ddiv
    //   224: d2i
    //   225: istore_1
    //   226: iload_2
    //   227: i2d
    //   228: ldc2_w 4.7
    //   231: ddiv
    //   232: d2i
    //   233: istore_2
    //   234: new w61
    //   237: dup
    //   238: iconst_3
    //   239: invokespecial <init> : (I)V
    //   242: astore #7
    //   244: goto -> 247
    //   247: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   250: astore #9
    //   252: aload #8
    //   254: getfield b : I
    //   257: istore #6
    //   259: getstatic p3.a : Ljava/util/HashMap;
    //   262: astore #8
    //   264: iconst_m1
    //   265: istore #4
    //   267: aload #9
    //   269: iload #6
    //   271: iconst_m1
    //   272: iconst_0
    //   273: invokestatic c : (IIZ)Landroid/net/Uri;
    //   276: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   279: astore #8
    //   281: aload #8
    //   283: iconst_1
    //   284: newarray int
    //   286: dup
    //   287: iconst_0
    //   288: iconst_2
    //   289: iastore
    //   290: invokevirtual g : ([I)V
    //   293: aload #8
    //   295: getfield b : Lyf1;
    //   298: iload_1
    //   299: iload_2
    //   300: invokevirtual a : (II)V
    //   303: aload #8
    //   305: invokevirtual i : ()V
    //   308: aload #8
    //   310: invokevirtual a : ()V
    //   313: aload #7
    //   315: ifnull -> 325
    //   318: aload #8
    //   320: aload #7
    //   322: invokevirtual l : (Lcw1;)V
    //   325: new x61
    //   328: astore #7
    //   330: getstatic m92.j : I
    //   333: ldc_w 2131953014
    //   336: if_icmpne -> 345
    //   339: iload #4
    //   341: istore_1
    //   342: goto -> 349
    //   345: ldc_w -16777216
    //   348: istore_1
    //   349: aload #7
    //   351: iload_1
    //   352: getstatic m92.h : [I
    //   355: bipush #6
    //   357: iaload
    //   358: iload #5
    //   360: invokespecial <init> : (III)V
    //   363: aload #8
    //   365: aload #7
    //   367: invokevirtual l : (Lcw1;)V
    //   370: aload #8
    //   372: aload_0
    //   373: getfield s0 : Lyy0;
    //   376: invokevirtual e : (Lkt1;)V
    //   379: goto -> 386
    //   382: aload_0
    //   383: invokevirtual z0 : ()V
    //   386: aload_0
    //   387: iload_3
    //   388: putfield n0 : I
    //   391: return
    //   392: astore #7
    //   394: aload #7
    //   396: invokevirtual printStackTrace : ()V
    //   399: return
    // Exception table:
    //   from	to	target	type
    //   0	14	392	finally
    //   19	27	392	finally
    //   34	47	392	finally
    //   52	57	392	finally
    //   62	68	392	finally
    //   80	88	392	finally
    //   88	93	392	finally
    //   101	105	392	finally
    //   106	111	392	finally
    //   116	123	392	finally
    //   128	134	392	finally
    //   139	158	392	finally
    //   161	176	392	finally
    //   182	193	392	finally
    //   234	244	392	finally
    //   247	264	392	finally
    //   267	313	392	finally
    //   318	325	392	finally
    //   325	339	392	finally
    //   349	379	392	finally
    //   382	386	392	finally
    //   386	391	392	finally
  }
  
  public final void C0(Intent paramIntent) {
    try {
      String str = paramIntent.getStringExtra("data");
      if (str != null) {
        this.k0 = str;
        this.l0 = paramIntent.getIntExtra("jSeek", 0);
      } else {
        paramIntent.getData();
      } 
    } finally {
      Exception exception;
    } 
    paramIntent.setAction(null);
    paramIntent = getIntent();
    paramIntent.setAction(null);
    paramIntent.setData(null);
    setIntent(paramIntent);
  }
  
  public final void K0() {
    runOnUiThread((Runnable)new kc(this, 5));
  }
  
  public final void L0(Bundle paramBundle) {
    // Byte code:
    //   0: ldc_w 'MSAUAC:'
    //   3: invokestatic F : (Ljava/lang/String;)V
    //   6: aload_0
    //   7: getfield M0 : Z
    //   10: ifeq -> 16
    //   13: goto -> 2560
    //   16: aload_0
    //   17: iconst_1
    //   18: putfield M0 : Z
    //   21: getstatic m92.h : [I
    //   24: astore #9
    //   26: ldc_w 'ASAOC:2'
    //   29: invokestatic F : (Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield K0 : Z
    //   36: ifne -> 48
    //   39: aload_0
    //   40: invokestatic c : (Landroid/app/Activity;)V
    //   43: aload_0
    //   44: iconst_1
    //   45: putfield K0 : Z
    //   48: aload_0
    //   49: ldc_w 2131492905
    //   52: invokevirtual setContentView : (I)V
    //   55: aload_0
    //   56: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   59: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   62: astore #7
    //   64: aload_0
    //   65: aload #7
    //   67: getfield widthPixels : I
    //   70: putfield G0 : I
    //   73: aload_0
    //   74: aload #7
    //   76: getfield heightPixels : I
    //   79: putfield H0 : I
    //   82: goto -> 92
    //   85: astore #7
    //   87: aload #7
    //   89: invokevirtual printStackTrace : ()V
    //   92: aload_0
    //   93: invokevirtual getWindow : ()Landroid/view/Window;
    //   96: invokevirtual getDecorView : ()Landroid/view/View;
    //   99: pop
    //   100: new android/app/ProgressDialog
    //   103: dup
    //   104: aload_0
    //   105: invokespecial <init> : (Landroid/content/Context;)V
    //   108: astore #7
    //   110: aload_0
    //   111: aload #7
    //   113: putfield m0 : Landroid/app/ProgressDialog;
    //   116: aload #7
    //   118: iconst_0
    //   119: invokevirtual setCancelable : (Z)V
    //   122: aload_0
    //   123: getfield m0 : Landroid/app/ProgressDialog;
    //   126: ldc_w 'Processing'
    //   129: invokevirtual setMessage : (Ljava/lang/CharSequence;)V
    //   132: aload_0
    //   133: aload_0
    //   134: ldc_w 2131297607
    //   137: invokevirtual findViewById : (I)Landroid/view/View;
    //   140: checkcast androidx/appcompat/widget/Toolbar
    //   143: putfield S : Landroidx/appcompat/widget/Toolbar;
    //   146: aload_0
    //   147: aload_0
    //   148: ldc_w 2131297566
    //   151: invokevirtual findViewById : (I)Landroid/view/View;
    //   154: checkcast com/google/android/material/tabs/TabLayout
    //   157: putfield T : Lcom/google/android/material/tabs/TabLayout;
    //   160: aload_0
    //   161: aload_0
    //   162: ldc_w 2131297962
    //   165: invokevirtual findViewById : (I)Landroid/view/View;
    //   168: checkcast t32
    //   171: putfield U : Lt32;
    //   174: aload_0
    //   175: aload_0
    //   176: ldc_w 2131296839
    //   179: invokevirtual findViewById : (I)Landroid/view/View;
    //   182: checkcast android/widget/ImageSwitcher
    //   185: putfield q0 : Landroid/widget/ImageSwitcher;
    //   188: aload_0
    //   189: ldc_w 2131297382
    //   192: invokevirtual findViewById : (I)Landroid/view/View;
    //   195: checkcast android/view/ViewGroup
    //   198: astore #7
    //   200: aload_0
    //   201: aload_0
    //   202: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   205: invokevirtual g0 : (Landroidx/appcompat/widget/Toolbar;)V
    //   208: aload_0
    //   209: invokevirtual Y : ()Lui0;
    //   212: astore #7
    //   214: aload #7
    //   216: invokevirtual c0 : ()V
    //   219: aload #7
    //   221: iconst_0
    //   222: invokevirtual b0 : (Z)V
    //   225: aload #7
    //   227: invokevirtual a0 : ()V
    //   230: aload_0
    //   231: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   234: astore #7
    //   236: aload #7
    //   238: invokevirtual d : ()V
    //   241: aload #7
    //   243: getfield v : Lrh1;
    //   246: astore #7
    //   248: aload #7
    //   250: iconst_0
    //   251: putfield h : Z
    //   254: aload #7
    //   256: iconst_0
    //   257: putfield e : I
    //   260: aload #7
    //   262: iconst_0
    //   263: putfield a : I
    //   266: aload #7
    //   268: iconst_0
    //   269: putfield f : I
    //   272: aload #7
    //   274: iconst_0
    //   275: putfield b : I
    //   278: aload_0
    //   279: invokevirtual Z : ()Llb0;
    //   282: astore #7
    //   284: aload_0
    //   285: aload #7
    //   287: putfield i0 : Llb0;
    //   290: aload #7
    //   292: invokevirtual C : ()V
    //   295: goto -> 305
    //   298: astore #7
    //   300: aload #7
    //   302: invokevirtual printStackTrace : ()V
    //   305: aconst_null
    //   306: astore #8
    //   308: aconst_null
    //   309: astore #7
    //   311: aload_0
    //   312: aconst_null
    //   313: putfield b0 : Lwn;
    //   316: aload_0
    //   317: aconst_null
    //   318: putfield a0 : Lwn;
    //   321: aload_0
    //   322: aconst_null
    //   323: putfield Z : Lwn;
    //   326: aload_0
    //   327: aconst_null
    //   328: putfield c0 : Lr90;
    //   331: aload_0
    //   332: aconst_null
    //   333: putfield g0 : Lgf0;
    //   336: aload_0
    //   337: aconst_null
    //   338: putfield e0 : Ll81;
    //   341: aload_0
    //   342: aconst_null
    //   343: putfield d0 : Lz71;
    //   346: aload_0
    //   347: aconst_null
    //   348: putfield f0 : Llb1;
    //   351: aload_1
    //   352: ifnull -> 838
    //   355: aload_0
    //   356: getfield i0 : Llb0;
    //   359: invokevirtual C : ()V
    //   362: aload_0
    //   363: getfield i0 : Llb0;
    //   366: astore #10
    //   368: aload #10
    //   370: invokevirtual getClass : ()Ljava/lang/Class;
    //   373: pop
    //   374: new lb
    //   377: dup
    //   378: aload #10
    //   380: invokespecial <init> : (Llb0;)V
    //   383: astore #10
    //   385: aload_0
    //   386: aload_0
    //   387: getfield i0 : Llb0;
    //   390: ldc_w 'albumFragment'
    //   393: aload_1
    //   394: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   397: checkcast wn
    //   400: putfield Z : Lwn;
    //   403: aload_0
    //   404: getfield Z : Lwn;
    //   407: astore #11
    //   409: aload #11
    //   411: ifnull -> 436
    //   414: aload #11
    //   416: invokevirtual Y : ()Z
    //   419: ifeq -> 436
    //   422: aload #10
    //   424: aload_0
    //   425: getfield Z : Lwn;
    //   428: invokevirtual j : (Lua0;)V
    //   431: iconst_1
    //   432: istore_3
    //   433: goto -> 438
    //   436: iconst_0
    //   437: istore_3
    //   438: aload_0
    //   439: aload_0
    //   440: getfield i0 : Llb0;
    //   443: ldc_w 'artistFragment'
    //   446: aload_1
    //   447: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   450: checkcast wn
    //   453: putfield a0 : Lwn;
    //   456: aload_0
    //   457: getfield a0 : Lwn;
    //   460: astore #11
    //   462: iload_3
    //   463: istore_2
    //   464: aload #11
    //   466: ifnull -> 490
    //   469: iload_3
    //   470: istore_2
    //   471: aload #11
    //   473: invokevirtual Y : ()Z
    //   476: ifeq -> 490
    //   479: aload #10
    //   481: aload_0
    //   482: getfield a0 : Lwn;
    //   485: invokevirtual j : (Lua0;)V
    //   488: iconst_1
    //   489: istore_2
    //   490: aload_0
    //   491: aload_0
    //   492: getfield i0 : Llb0;
    //   495: ldc_w 'folderFragment'
    //   498: aload_1
    //   499: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   502: checkcast r90
    //   505: putfield c0 : Lr90;
    //   508: aload_0
    //   509: getfield c0 : Lr90;
    //   512: astore #11
    //   514: iload_2
    //   515: istore_3
    //   516: aload #11
    //   518: ifnull -> 542
    //   521: iload_2
    //   522: istore_3
    //   523: aload #11
    //   525: invokevirtual Y : ()Z
    //   528: ifeq -> 542
    //   531: aload #10
    //   533: aload_0
    //   534: getfield c0 : Lr90;
    //   537: invokevirtual j : (Lua0;)V
    //   540: iconst_1
    //   541: istore_3
    //   542: aload_0
    //   543: aload_0
    //   544: getfield i0 : Llb0;
    //   547: ldc_w 'playerFragment'
    //   550: aload_1
    //   551: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   554: checkcast z71
    //   557: putfield d0 : Lz71;
    //   560: aload_0
    //   561: getfield d0 : Lz71;
    //   564: astore #11
    //   566: iload_3
    //   567: istore_2
    //   568: aload #11
    //   570: ifnull -> 594
    //   573: iload_3
    //   574: istore_2
    //   575: aload #11
    //   577: invokevirtual Y : ()Z
    //   580: ifeq -> 594
    //   583: aload #10
    //   585: aload_0
    //   586: getfield d0 : Lz71;
    //   589: invokevirtual j : (Lua0;)V
    //   592: iconst_1
    //   593: istore_2
    //   594: aload_0
    //   595: aload_0
    //   596: getfield i0 : Llb0;
    //   599: ldc_w 'playlistFragment'
    //   602: aload_1
    //   603: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   606: checkcast l81
    //   609: putfield e0 : Ll81;
    //   612: aload_0
    //   613: getfield e0 : Ll81;
    //   616: astore #11
    //   618: iload_2
    //   619: istore_3
    //   620: aload #11
    //   622: ifnull -> 646
    //   625: iload_2
    //   626: istore_3
    //   627: aload #11
    //   629: invokevirtual Y : ()Z
    //   632: ifeq -> 646
    //   635: aload #10
    //   637: aload_0
    //   638: getfield e0 : Ll81;
    //   641: invokevirtual j : (Lua0;)V
    //   644: iconst_1
    //   645: istore_3
    //   646: aload_0
    //   647: aload_0
    //   648: getfield i0 : Llb0;
    //   651: ldc_w 'queueFragment'
    //   654: aload_1
    //   655: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   658: checkcast lb1
    //   661: putfield f0 : Llb1;
    //   664: aload_0
    //   665: getfield f0 : Llb1;
    //   668: astore #11
    //   670: iload_3
    //   671: istore_2
    //   672: aload #11
    //   674: ifnull -> 698
    //   677: iload_3
    //   678: istore_2
    //   679: aload #11
    //   681: invokevirtual Y : ()Z
    //   684: ifeq -> 698
    //   687: aload #10
    //   689: aload_0
    //   690: getfield f0 : Llb1;
    //   693: invokevirtual j : (Lua0;)V
    //   696: iconst_1
    //   697: istore_2
    //   698: aload_0
    //   699: aload_0
    //   700: getfield i0 : Llb0;
    //   703: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.vYZMy : Ljava/lang/String;
    //   706: aload_1
    //   707: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   710: checkcast gf0
    //   713: putfield g0 : Lgf0;
    //   716: aload_0
    //   717: getfield g0 : Lgf0;
    //   720: astore #11
    //   722: iload_2
    //   723: istore_3
    //   724: aload #11
    //   726: ifnull -> 750
    //   729: iload_2
    //   730: istore_3
    //   731: aload #11
    //   733: invokevirtual Y : ()Z
    //   736: ifeq -> 750
    //   739: aload #10
    //   741: aload_0
    //   742: getfield g0 : Lgf0;
    //   745: invokevirtual j : (Lua0;)V
    //   748: iconst_1
    //   749: istore_3
    //   750: aload_0
    //   751: aload_0
    //   752: getfield i0 : Llb0;
    //   755: ldc_w 'genreFragment'
    //   758: aload_1
    //   759: invokevirtual H : (Ljava/lang/String;Landroid/os/Bundle;)Lua0;
    //   762: checkcast wn
    //   765: putfield b0 : Lwn;
    //   768: aload_0
    //   769: getfield b0 : Lwn;
    //   772: astore_1
    //   773: iload_3
    //   774: istore_2
    //   775: aload_1
    //   776: ifnull -> 799
    //   779: iload_3
    //   780: istore_2
    //   781: aload_1
    //   782: invokevirtual Y : ()Z
    //   785: ifeq -> 799
    //   788: aload #10
    //   790: aload_0
    //   791: getfield b0 : Lwn;
    //   794: invokevirtual j : (Lua0;)V
    //   797: iconst_1
    //   798: istore_2
    //   799: iload_2
    //   800: ifeq -> 838
    //   803: aload #10
    //   805: getfield g : Z
    //   808: ifne -> 831
    //   811: aload #10
    //   813: iconst_0
    //   814: putfield h : Z
    //   817: aload #10
    //   819: getfield r : Llb0;
    //   822: aload #10
    //   824: iconst_0
    //   825: invokevirtual A : (Llb;Z)V
    //   828: goto -> 838
    //   831: ldc_w 'This transaction is already being added to the back stack'
    //   834: invokestatic f : (Ljava/lang/String;)V
    //   837: return
    //   838: invokestatic o : ()Landroid/content/SharedPreferences;
    //   841: ldc_w 'k_i_tbabt'
    //   844: ldc_w '1'
    //   847: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   852: ldc_w '1'
    //   855: invokevirtual equals : (Ljava/lang/Object;)Z
    //   858: ifeq -> 1029
    //   861: aload_0
    //   862: iconst_1
    //   863: putfield F0 : Z
    //   866: aload_0
    //   867: ldc_w 2131297382
    //   870: invokevirtual findViewById : (I)Landroid/view/View;
    //   873: checkcast androidx/constraintlayout/widget/ConstraintLayout
    //   876: astore #10
    //   878: new pq
    //   881: dup
    //   882: invokespecial <init> : ()V
    //   885: astore_1
    //   886: aload_1
    //   887: aload #10
    //   889: invokevirtual c : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   892: aload_1
    //   893: aload_0
    //   894: getfield U : Lt32;
    //   897: invokevirtual getId : ()I
    //   900: iconst_3
    //   901: iconst_0
    //   902: iconst_3
    //   903: invokevirtual d : (IIII)V
    //   906: aload_1
    //   907: aload_0
    //   908: getfield U : Lt32;
    //   911: invokevirtual getId : ()I
    //   914: iconst_4
    //   915: aload_0
    //   916: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   919: invokevirtual getId : ()I
    //   922: iconst_3
    //   923: invokevirtual d : (IIII)V
    //   926: aload_1
    //   927: aload_0
    //   928: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   931: invokevirtual getId : ()I
    //   934: iconst_3
    //   935: aload_0
    //   936: getfield U : Lt32;
    //   939: invokevirtual getId : ()I
    //   942: iconst_4
    //   943: invokevirtual d : (IIII)V
    //   946: aload_1
    //   947: aload_0
    //   948: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   951: invokevirtual getId : ()I
    //   954: iconst_4
    //   955: iconst_0
    //   956: iconst_4
    //   957: invokevirtual d : (IIII)V
    //   960: aload #10
    //   962: aload_1
    //   963: invokevirtual setConstraintSet : (Lpq;)V
    //   966: aload_0
    //   967: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   970: iconst_2
    //   971: invokevirtual setSelectedTabIndicatorGravity : (I)V
    //   974: aload_0
    //   975: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   978: astore #10
    //   980: new wg
    //   983: dup
    //   984: aload #9
    //   986: iconst_0
    //   987: iaload
    //   988: iconst_1
    //   989: invokespecial <init> : (II)V
    //   992: astore_1
    //   993: aload_1
    //   994: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   997: fconst_0
    //   998: fmul
    //   999: f2i
    //   1000: putfield d : I
    //   1003: aload #10
    //   1005: aload_1
    //   1006: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   1009: aload_0
    //   1010: getfield U : Lt32;
    //   1013: iconst_1
    //   1014: invokestatic e : (Landroid/view/View;Z)V
    //   1017: aload_0
    //   1018: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   1021: iconst_1
    //   1022: iconst_0
    //   1023: invokestatic d : (Landroid/view/View;ZZ)V
    //   1026: goto -> 1082
    //   1029: aload_0
    //   1030: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   1033: astore_1
    //   1034: new wg
    //   1037: dup
    //   1038: aload #9
    //   1040: iconst_0
    //   1041: iaload
    //   1042: iconst_0
    //   1043: invokespecial <init> : (II)V
    //   1046: astore #10
    //   1048: aload #10
    //   1050: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   1053: fconst_0
    //   1054: fmul
    //   1055: f2i
    //   1056: putfield d : I
    //   1059: aload_1
    //   1060: aload #10
    //   1062: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   1065: aload_0
    //   1066: getfield S : Landroidx/appcompat/widget/Toolbar;
    //   1069: iconst_1
    //   1070: invokestatic e : (Landroid/view/View;Z)V
    //   1073: aload_0
    //   1074: getfield U : Lt32;
    //   1077: iconst_1
    //   1078: iconst_0
    //   1079: invokestatic d : (Landroid/view/View;ZZ)V
    //   1082: aload_0
    //   1083: getfield x0 : Landroid/content/SharedPreferences;
    //   1086: ldc_w 'IA_TABO'
    //   1089: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.VqkUBWVUpfOf : Ljava/lang/String;
    //   1092: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1097: astore #10
    //   1099: aload_0
    //   1100: getfield x0 : Landroid/content/SharedPreferences;
    //   1103: aload_0
    //   1104: ldc_w 2131886711
    //   1107: invokevirtual getString : (I)Ljava/lang/String;
    //   1110: iconst_1
    //   1111: invokestatic valueOf : (I)Ljava/lang/String;
    //   1114: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1119: invokestatic parseInt : (Ljava/lang/String;)I
    //   1122: iconst_1
    //   1123: if_icmpne -> 1132
    //   1126: iconst_1
    //   1127: istore #6
    //   1129: goto -> 1135
    //   1132: iconst_0
    //   1133: istore #6
    //   1135: aload_0
    //   1136: iload #6
    //   1138: putfield v0 : Z
    //   1141: aload_0
    //   1142: getfield x0 : Landroid/content/SharedPreferences;
    //   1145: ldc_w 'B_GEN_SPT'
    //   1148: iconst_1
    //   1149: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1154: istore #6
    //   1156: new org/json/JSONArray
    //   1159: astore_1
    //   1160: aload_1
    //   1161: aload #10
    //   1163: invokespecial <init> : (Ljava/lang/String;)V
    //   1166: new java/util/ArrayList
    //   1169: astore #10
    //   1171: aload #10
    //   1173: aload_1
    //   1174: invokevirtual length : ()I
    //   1177: invokespecial <init> : (I)V
    //   1180: aload_0
    //   1181: aload #10
    //   1183: putfield R : Ljava/util/ArrayList;
    //   1186: iconst_0
    //   1187: istore_2
    //   1188: iload_2
    //   1189: aload_1
    //   1190: invokevirtual length : ()I
    //   1193: if_icmpge -> 1241
    //   1196: aload_1
    //   1197: iload_2
    //   1198: invokevirtual getInt : (I)I
    //   1201: bipush #6
    //   1203: if_icmpne -> 1214
    //   1206: iload #6
    //   1208: ifne -> 1214
    //   1211: goto -> 1230
    //   1214: aload_0
    //   1215: getfield R : Ljava/util/ArrayList;
    //   1218: aload_1
    //   1219: iload_2
    //   1220: invokevirtual getInt : (I)I
    //   1223: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1226: invokevirtual add : (Ljava/lang/Object;)Z
    //   1229: pop
    //   1230: iinc #2, 1
    //   1233: goto -> 1188
    //   1236: astore_1
    //   1237: aload_1
    //   1238: invokevirtual printStackTrace : ()V
    //   1241: new h50
    //   1244: dup
    //   1245: aload_0
    //   1246: aload_0
    //   1247: getfield i0 : Llb0;
    //   1250: iconst_1
    //   1251: invokespecial <init> : (Lpc;Llb0;I)V
    //   1254: astore_1
    //   1255: aload_0
    //   1256: aload_1
    //   1257: putfield h0 : Lh50;
    //   1260: aload_0
    //   1261: getfield U : Lt32;
    //   1264: aload_1
    //   1265: invokevirtual c : ()I
    //   1268: invokevirtual setOffscreenPageLimit : (I)V
    //   1271: aload_0
    //   1272: getfield U : Lt32;
    //   1275: aload_0
    //   1276: getfield h0 : Lh50;
    //   1279: invokevirtual setAdapter : (Lp51;)V
    //   1282: aload_0
    //   1283: getfield i0 : Llb0;
    //   1286: invokevirtual C : ()V
    //   1289: goto -> 1297
    //   1292: astore_1
    //   1293: aload_1
    //   1294: invokevirtual printStackTrace : ()V
    //   1297: aload_0
    //   1298: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1301: aload_0
    //   1302: getfield U : Lt32;
    //   1305: invokevirtual setupWithViewPager : (Lt32;)V
    //   1308: aload_0
    //   1309: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1312: aload #9
    //   1314: iconst_3
    //   1315: iaload
    //   1316: invokevirtual setSelectedTabIndicatorColor : (I)V
    //   1319: aload_0
    //   1320: getfield U : Lt32;
    //   1323: iconst_1
    //   1324: invokevirtual setCurrentItem : (I)V
    //   1327: aload_0
    //   1328: getfield A0 : Ljava/util/Stack;
    //   1331: astore_1
    //   1332: aload_1
    //   1333: invokevirtual clear : ()V
    //   1336: aload_1
    //   1337: iconst_1
    //   1338: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1341: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1344: pop
    //   1345: aload #9
    //   1347: bipush #7
    //   1349: iaload
    //   1350: invokestatic alpha : (I)I
    //   1353: istore #4
    //   1355: iconst_0
    //   1356: istore_3
    //   1357: iload_3
    //   1358: aload_0
    //   1359: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1362: invokevirtual getTabCount : ()I
    //   1365: if_icmpge -> 1595
    //   1368: aload_0
    //   1369: getfield R : Ljava/util/ArrayList;
    //   1372: iload_3
    //   1373: invokevirtual get : (I)Ljava/lang/Object;
    //   1376: checkcast java/lang/Integer
    //   1379: invokevirtual intValue : ()I
    //   1382: istore #5
    //   1384: aload_0
    //   1385: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1388: astore_1
    //   1389: iload #5
    //   1391: tableswitch default -> 1432, 0 -> 1479, 1 -> 1472, 2 -> 1465, 3 -> 1458, 4 -> 1451, 5 -> 1444, 6 -> 1437
    //   1432: iconst_0
    //   1433: istore_2
    //   1434: goto -> 1483
    //   1437: ldc_w 2131231412
    //   1440: istore_2
    //   1441: goto -> 1483
    //   1444: ldc_w 2131231370
    //   1447: istore_2
    //   1448: goto -> 1483
    //   1451: ldc_w 2131231081
    //   1454: istore_2
    //   1455: goto -> 1483
    //   1458: ldc_w 2131231076
    //   1461: istore_2
    //   1462: goto -> 1483
    //   1465: ldc_w 2131231144
    //   1468: istore_2
    //   1469: goto -> 1483
    //   1472: ldc_w 2131231189
    //   1475: istore_2
    //   1476: goto -> 1483
    //   1479: ldc_w 2131231375
    //   1482: istore_2
    //   1483: aload_1
    //   1484: iload_2
    //   1485: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1488: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   1491: astore #10
    //   1493: aload #10
    //   1495: iload #4
    //   1497: invokevirtual setAlpha : (I)V
    //   1500: aload_0
    //   1501: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1504: iload_3
    //   1505: invokevirtual h : (I)Lws1;
    //   1508: astore_1
    //   1509: aload_1
    //   1510: aload #10
    //   1512: putfield b : Landroid/graphics/drawable/Drawable;
    //   1515: aload_1
    //   1516: getfield g : Lcom/google/android/material/tabs/TabLayout;
    //   1519: astore #10
    //   1521: aload #10
    //   1523: getfield C : I
    //   1526: iconst_1
    //   1527: if_icmpeq -> 1539
    //   1530: aload #10
    //   1532: getfield F : I
    //   1535: iconst_2
    //   1536: if_icmpne -> 1545
    //   1539: aload #10
    //   1541: iconst_1
    //   1542: invokevirtual q : (Z)V
    //   1545: aload_1
    //   1546: getfield h : Lzs1;
    //   1549: astore_1
    //   1550: aload_1
    //   1551: ifnull -> 1558
    //   1554: aload_1
    //   1555: invokevirtual d : ()V
    //   1558: aload_0
    //   1559: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1562: iload_3
    //   1563: invokevirtual h : (I)Lws1;
    //   1566: astore_1
    //   1567: aload_1
    //   1568: iload #5
    //   1570: invokestatic o0 : (I)Ljava/lang/String;
    //   1573: putfield d : Ljava/lang/CharSequence;
    //   1576: aload_1
    //   1577: getfield h : Lzs1;
    //   1580: astore_1
    //   1581: aload_1
    //   1582: ifnull -> 1589
    //   1585: aload_1
    //   1586: invokevirtual d : ()V
    //   1589: iinc #3, 1
    //   1592: goto -> 1357
    //   1595: aload_0
    //   1596: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1599: aload #9
    //   1601: iconst_5
    //   1602: iaload
    //   1603: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   1606: invokevirtual setTabIconTint : (Landroid/content/res/ColorStateList;)V
    //   1609: aload_0
    //   1610: getfield U : Lt32;
    //   1613: new zy0
    //   1616: dup
    //   1617: aload_0
    //   1618: invokespecial <init> : (Lin/krosbits/musicolet/MusicActivity;)V
    //   1621: invokevirtual b : (Lr32;)V
    //   1624: aload_0
    //   1625: getfield T : Lcom/google/android/material/tabs/TabLayout;
    //   1628: new az0
    //   1631: dup
    //   1632: aload_0
    //   1633: iconst_0
    //   1634: invokespecial <init> : (Landroid/view/KeyEvent$Callback;I)V
    //   1637: invokevirtual a : (Lss1;)V
    //   1640: aload_0
    //   1641: invokevirtual P0 : ()V
    //   1644: aload_0
    //   1645: invokevirtual O0 : ()V
    //   1648: aload_0
    //   1649: invokevirtual invalidateOptionsMenu : ()V
    //   1652: aload_0
    //   1653: invokevirtual N0 : ()V
    //   1656: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1659: astore_1
    //   1660: aload_1
    //   1661: ifnull -> 1679
    //   1664: aload_1
    //   1665: getfield w : Z
    //   1668: ifeq -> 1679
    //   1671: aload_0
    //   1672: aload_1
    //   1673: invokevirtual u0 : (Lin/krosbits/musicolet/MusicService;)V
    //   1676: goto -> 1755
    //   1679: aload_0
    //   1680: iconst_1
    //   1681: putfield O0 : Z
    //   1684: new android/content/Intent
    //   1687: dup
    //   1688: aload_0
    //   1689: ldc_w in/krosbits/musicolet/MusicService
    //   1692: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1695: ldc_w 'ACTION_INIT'
    //   1698: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1701: astore #9
    //   1703: aload_0
    //   1704: aload #9
    //   1706: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   1709: pop
    //   1710: goto -> 1755
    //   1713: astore_1
    //   1714: new java/lang/StringBuilder
    //   1717: dup
    //   1718: ldc_w 'MAIS>'
    //   1721: invokespecial <init> : (Ljava/lang/String;)V
    //   1724: astore #10
    //   1726: aload #10
    //   1728: aload_1
    //   1729: invokevirtual toString : ()Ljava/lang/String;
    //   1732: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1735: pop
    //   1736: aload #10
    //   1738: invokevirtual toString : ()Ljava/lang/String;
    //   1741: invokestatic v : (Ljava/lang/String;)V
    //   1744: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1747: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1750: aload #9
    //   1752: invokestatic n0 : (Landroid/content/Context;Landroid/content/Intent;)V
    //   1755: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   1758: instanceof fl
    //   1761: ifeq -> 1776
    //   1764: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   1767: ldc_w -2147483648
    //   1770: invokevirtual setVolumeControlStream : (I)V
    //   1773: goto -> 1783
    //   1776: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   1779: iconst_3
    //   1780: invokevirtual setVolumeControlStream : (I)V
    //   1783: new ly0
    //   1786: dup
    //   1787: aload_0
    //   1788: invokespecial <init> : (Lpc;)V
    //   1791: astore_1
    //   1792: aload_0
    //   1793: aload_1
    //   1794: putfield t0 : Lly0;
    //   1797: getstatic my0.b : Ljava/util/ArrayList;
    //   1800: ifnonnull -> 1813
    //   1803: new java/util/ArrayList
    //   1806: dup
    //   1807: invokespecial <init> : ()V
    //   1810: putstatic my0.b : Ljava/util/ArrayList;
    //   1813: getstatic my0.b : Ljava/util/ArrayList;
    //   1816: aload_1
    //   1817: invokevirtual remove : (Ljava/lang/Object;)Z
    //   1820: ifeq -> 1826
    //   1823: goto -> 1813
    //   1826: getstatic my0.b : Ljava/util/ArrayList;
    //   1829: aload_1
    //   1830: invokevirtual add : (Ljava/lang/Object;)Z
    //   1833: pop
    //   1834: aload_0
    //   1835: new kn1
    //   1838: dup
    //   1839: aload_0
    //   1840: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1843: aconst_null
    //   1844: invokespecial <init> : (Landroid/content/res/Resources;Lin/krosbits/musicolet/PlaylistEditActivity;)V
    //   1847: putfield u0 : Lkn1;
    //   1850: aload_0
    //   1851: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1854: astore_1
    //   1855: aload_1
    //   1856: invokevirtual getAction : ()Ljava/lang/String;
    //   1859: astore #9
    //   1861: ldc_w 'android.intent.action.VIEW'
    //   1864: aload #9
    //   1866: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1869: ifeq -> 1891
    //   1872: aload_0
    //   1873: aload_1
    //   1874: invokevirtual C0 : (Landroid/content/Intent;)V
    //   1877: aload_0
    //   1878: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   1881: ifnull -> 1958
    //   1884: aload_0
    //   1885: invokevirtual q0 : ()V
    //   1888: goto -> 1958
    //   1891: ldc_w 'musicolet.search'
    //   1894: aload #9
    //   1896: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1899: ifeq -> 1920
    //   1902: aload_0
    //   1903: new android/content/Intent
    //   1906: dup
    //   1907: aload_0
    //   1908: ldc_w in/krosbits/musicolet/SearchActivity
    //   1911: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1914: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   1917: goto -> 1958
    //   1920: ldc_w 'android.intent.action.SEARCH'
    //   1923: aload #9
    //   1925: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1928: ifne -> 1953
    //   1931: ldc_w 'android.intent.action.MEDIA_SEARCH'
    //   1934: aload #9
    //   1936: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1939: ifne -> 1953
    //   1942: ldc_w 'android.media.action.MEDIA_PLAY_FROM_SEARCH'
    //   1945: aload #9
    //   1947: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1950: ifeq -> 1958
    //   1953: aload_0
    //   1954: aload_1
    //   1955: putfield y0 : Landroid/content/Intent;
    //   1958: ldc_w 'jump_queue'
    //   1961: aload_1
    //   1962: ldc_w 'jump_key'
    //   1965: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1968: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1971: ifeq -> 1983
    //   1974: aload_0
    //   1975: getfield U : Lt32;
    //   1978: iconst_0
    //   1979: iconst_0
    //   1980: invokevirtual w : (IZ)V
    //   1983: aload_1
    //   1984: ldc_w 'extlrc'
    //   1987: iconst_0
    //   1988: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   1991: ifeq -> 1999
    //   1994: aload_0
    //   1995: iconst_1
    //   1996: putfield D0 : Z
    //   1999: aload_1
    //   2000: ldc_w 'exlrsrc'
    //   2003: iconst_0
    //   2004: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   2007: ifeq -> 2015
    //   2010: aload_0
    //   2011: iconst_1
    //   2012: putfield E0 : Z
    //   2015: getstatic z51.C : Z
    //   2018: ifeq -> 2124
    //   2021: iconst_0
    //   2022: putstatic z51.C : Z
    //   2025: invokestatic g : ()Landroid/content/SharedPreferences;
    //   2028: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2033: ldc_w 'FSP_PLDC'
    //   2036: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   2041: invokeinterface apply : ()V
    //   2046: aload_0
    //   2047: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2050: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   2053: getfield locale : Ljava/util/Locale;
    //   2056: astore_1
    //   2057: getstatic dd1.l : Ljava/lang/ref/WeakReference;
    //   2060: astore #9
    //   2062: aload #9
    //   2064: ifnull -> 2072
    //   2067: aload #9
    //   2069: invokevirtual clear : ()V
    //   2072: aconst_null
    //   2073: putstatic dd1.l : Ljava/lang/ref/WeakReference;
    //   2076: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2079: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2082: aload_1
    //   2083: invokestatic P : (Landroid/content/Context;Ljava/util/Locale;)Z
    //   2086: ifne -> 2124
    //   2089: invokestatic k : ()Ljava/util/ArrayList;
    //   2092: aload_1
    //   2093: invokevirtual contains : (Ljava/lang/Object;)Z
    //   2096: ifeq -> 2124
    //   2099: new ql0
    //   2102: dup
    //   2103: aload_0
    //   2104: invokespecial <init> : (Landroid/content/Context;)V
    //   2107: astore #9
    //   2109: aload #9
    //   2111: aload_1
    //   2112: putfield J0 : Ljava/util/Locale;
    //   2115: aload #9
    //   2117: invokevirtual p : ()Lss0;
    //   2120: pop
    //   2121: goto -> 2193
    //   2124: getstatic in/krosbits/musicolet/b.b : Z
    //   2127: ifeq -> 2193
    //   2130: new ms0
    //   2133: dup
    //   2134: aload_0
    //   2135: invokespecial <init> : (Landroid/content/Context;)V
    //   2138: astore_1
    //   2139: aload_1
    //   2140: ldc_w 2131887211
    //   2143: invokevirtual c : (I)V
    //   2146: aload_1
    //   2147: ldc_w 2131887198
    //   2150: invokevirtual n : (I)V
    //   2153: aload_1
    //   2154: ldc_w 2131887001
    //   2157: invokevirtual l : (I)V
    //   2160: aload_1
    //   2161: new java/lang/Object
    //   2164: dup
    //   2165: invokespecial <init> : ()V
    //   2168: putfield X : Landroid/content/DialogInterface$OnCancelListener;
    //   2171: aload_1
    //   2172: new vy0
    //   2175: dup
    //   2176: aload_0
    //   2177: invokespecial <init> : (Lin/krosbits/musicolet/MusicActivity;)V
    //   2180: putfield D : Lrs0;
    //   2183: aload_1
    //   2184: iconst_0
    //   2185: putfield P : Z
    //   2188: aload_1
    //   2189: invokevirtual p : ()Lss0;
    //   2192: pop
    //   2193: getstatic in/krosbits/musicolet/b.a : Z
    //   2196: ifeq -> 2560
    //   2199: iconst_0
    //   2200: putstatic in/krosbits/musicolet/b.a : Z
    //   2203: aload #8
    //   2205: astore_1
    //   2206: aload_0
    //   2207: invokevirtual getAssets : ()Landroid/content/res/AssetManager;
    //   2210: ldc_w 'change_log.txt'
    //   2213: invokevirtual open : (Ljava/lang/String;)Ljava/io/InputStream;
    //   2216: astore #8
    //   2218: aload #8
    //   2220: astore #7
    //   2222: aload #8
    //   2224: astore_1
    //   2225: new java/io/BufferedReader
    //   2228: astore #10
    //   2230: aload #8
    //   2232: astore #7
    //   2234: aload #8
    //   2236: astore_1
    //   2237: new java/io/InputStreamReader
    //   2240: astore #9
    //   2242: aload #8
    //   2244: astore #7
    //   2246: aload #8
    //   2248: astore_1
    //   2249: aload #9
    //   2251: aload #8
    //   2253: invokespecial <init> : (Ljava/io/InputStream;)V
    //   2256: aload #8
    //   2258: astore #7
    //   2260: aload #8
    //   2262: astore_1
    //   2263: aload #10
    //   2265: aload #9
    //   2267: invokespecial <init> : (Ljava/io/Reader;)V
    //   2270: aload #8
    //   2272: astore #7
    //   2274: aload #8
    //   2276: astore_1
    //   2277: new java/lang/StringBuilder
    //   2280: astore #9
    //   2282: aload #8
    //   2284: astore #7
    //   2286: aload #8
    //   2288: astore_1
    //   2289: aload #9
    //   2291: invokespecial <init> : ()V
    //   2294: aload #8
    //   2296: astore #7
    //   2298: aload #8
    //   2300: astore_1
    //   2301: aload #10
    //   2303: invokevirtual readLine : ()Ljava/lang/String;
    //   2306: astore #11
    //   2308: aload #11
    //   2310: ifnull -> 2390
    //   2313: aload #8
    //   2315: astore #7
    //   2317: aload #8
    //   2319: astore_1
    //   2320: aload #9
    //   2322: aload #11
    //   2324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2327: pop
    //   2328: aload #8
    //   2330: astore #7
    //   2332: aload #8
    //   2334: astore_1
    //   2335: aload #10
    //   2337: invokevirtual readLine : ()Ljava/lang/String;
    //   2340: astore #11
    //   2342: aload #11
    //   2344: ifnull -> 2390
    //   2347: aload #8
    //   2349: astore #7
    //   2351: aload #8
    //   2353: astore_1
    //   2354: aload #9
    //   2356: ldc_w '\\n'
    //   2359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2362: pop
    //   2363: aload #8
    //   2365: astore #7
    //   2367: aload #8
    //   2369: astore_1
    //   2370: aload #9
    //   2372: aload #11
    //   2374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2377: pop
    //   2378: goto -> 2328
    //   2381: astore_1
    //   2382: goto -> 2538
    //   2385: astore #8
    //   2387: goto -> 2523
    //   2390: aload #8
    //   2392: astore #7
    //   2394: aload #8
    //   2396: astore_1
    //   2397: new ms0
    //   2400: astore #10
    //   2402: aload #8
    //   2404: astore #7
    //   2406: aload #8
    //   2408: astore_1
    //   2409: aload #10
    //   2411: aload_0
    //   2412: invokespecial <init> : (Landroid/content/Context;)V
    //   2415: aload #8
    //   2417: astore #7
    //   2419: aload #8
    //   2421: astore_1
    //   2422: aload #10
    //   2424: ldc_w 2131886963
    //   2427: invokevirtual q : (I)V
    //   2430: aload #8
    //   2432: astore #7
    //   2434: aload #8
    //   2436: astore_1
    //   2437: aload #10
    //   2439: aload #9
    //   2441: invokevirtual toString : ()Ljava/lang/String;
    //   2444: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   2447: aload #8
    //   2449: astore #7
    //   2451: aload #8
    //   2453: astore_1
    //   2454: aload #10
    //   2456: ldc_w 2131887030
    //   2459: invokevirtual n : (I)V
    //   2462: aload #8
    //   2464: astore #7
    //   2466: aload #8
    //   2468: astore_1
    //   2469: new ss0
    //   2472: astore #9
    //   2474: aload #8
    //   2476: astore #7
    //   2478: aload #8
    //   2480: astore_1
    //   2481: aload #9
    //   2483: aload #10
    //   2485: invokespecial <init> : (Lms0;)V
    //   2488: aload #8
    //   2490: astore #7
    //   2492: aload #8
    //   2494: astore_1
    //   2495: aload #9
    //   2497: invokevirtual show : ()V
    //   2500: aload #8
    //   2502: ifnull -> 2560
    //   2505: aload #8
    //   2507: astore_1
    //   2508: aload_1
    //   2509: invokevirtual close : ()V
    //   2512: goto -> 2560
    //   2515: astore_1
    //   2516: aload_1
    //   2517: invokevirtual printStackTrace : ()V
    //   2520: goto -> 2560
    //   2523: aload_1
    //   2524: astore #7
    //   2526: aload #8
    //   2528: invokevirtual printStackTrace : ()V
    //   2531: aload_1
    //   2532: ifnull -> 2560
    //   2535: goto -> 2508
    //   2538: aload #7
    //   2540: ifnull -> 2558
    //   2543: aload #7
    //   2545: invokevirtual close : ()V
    //   2548: goto -> 2558
    //   2551: astore #7
    //   2553: aload #7
    //   2555: invokevirtual printStackTrace : ()V
    //   2558: aload_1
    //   2559: athrow
    //   2560: return
    //   2561: astore #11
    //   2563: goto -> 403
    //   2566: astore #11
    //   2568: goto -> 456
    //   2571: astore #11
    //   2573: goto -> 508
    //   2576: astore #11
    //   2578: goto -> 560
    //   2581: astore #11
    //   2583: goto -> 612
    //   2586: astore #11
    //   2588: goto -> 664
    //   2591: astore #11
    //   2593: goto -> 716
    //   2596: astore_1
    //   2597: goto -> 768
    // Exception table:
    //   from	to	target	type
    //   55	82	85	java/lang/Exception
    //   290	295	298	finally
    //   385	403	2561	finally
    //   438	456	2566	finally
    //   490	508	2571	finally
    //   542	560	2576	finally
    //   594	612	2581	finally
    //   646	664	2586	finally
    //   698	716	2591	finally
    //   750	768	2596	finally
    //   1156	1186	1236	org/json/JSONException
    //   1188	1206	1236	org/json/JSONException
    //   1214	1230	1236	org/json/JSONException
    //   1282	1289	1292	finally
    //   1703	1710	1713	finally
    //   2206	2218	2385	java/io/IOException
    //   2206	2218	2381	finally
    //   2225	2230	2385	java/io/IOException
    //   2225	2230	2381	finally
    //   2237	2242	2385	java/io/IOException
    //   2237	2242	2381	finally
    //   2249	2256	2385	java/io/IOException
    //   2249	2256	2381	finally
    //   2263	2270	2385	java/io/IOException
    //   2263	2270	2381	finally
    //   2277	2282	2385	java/io/IOException
    //   2277	2282	2381	finally
    //   2289	2294	2385	java/io/IOException
    //   2289	2294	2381	finally
    //   2301	2308	2385	java/io/IOException
    //   2301	2308	2381	finally
    //   2320	2328	2385	java/io/IOException
    //   2320	2328	2381	finally
    //   2335	2342	2385	java/io/IOException
    //   2335	2342	2381	finally
    //   2354	2363	2385	java/io/IOException
    //   2354	2363	2381	finally
    //   2370	2378	2385	java/io/IOException
    //   2370	2378	2381	finally
    //   2397	2402	2385	java/io/IOException
    //   2397	2402	2381	finally
    //   2409	2415	2385	java/io/IOException
    //   2409	2415	2381	finally
    //   2422	2430	2385	java/io/IOException
    //   2422	2430	2381	finally
    //   2437	2447	2385	java/io/IOException
    //   2437	2447	2381	finally
    //   2454	2462	2385	java/io/IOException
    //   2454	2462	2381	finally
    //   2469	2474	2385	java/io/IOException
    //   2469	2474	2381	finally
    //   2481	2488	2385	java/io/IOException
    //   2481	2488	2381	finally
    //   2495	2500	2385	java/io/IOException
    //   2495	2500	2381	finally
    //   2508	2512	2515	finally
    //   2526	2531	2381	finally
    //   2543	2548	2551	finally
  }
  
  public final void M0() {
    if (this.j0 != null)
      runOnUiThread((Runnable)new kc(this, 4)); 
  }
  
  public final void N0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void O0() {
    int k = this.U.getCurrentItem();
    if (this.w0 == k)
      return; 
    int[] arrayOfInt = m92.h;
    int m = Color.alpha(arrayOfInt[5]);
    int j = Color.alpha(arrayOfInt[7]);
    int i = this.w0;
    if (i >= 0)
      try {
        (this.T.h(i)).b.setAlpha(j);
      } finally {
        arrayOfInt = null;
      }  
    (this.T.h(k)).b.setAlpha(m);
    this.w0 = k;
  }
  
  public final void P0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (MyApplication.w != 4)
      return super.dispatchKeyEvent(paramKeyEvent); 
    int j = paramKeyEvent.getAction();
    int i = paramKeyEvent.getKeyCode();
    if (i != 24 && i != 25) {
      if (i == 82 || i == 84) {
        if (j == 0)
          startActivity(new Intent((Context)this, SearchActivity.class)); 
        return true;
      } 
    } else if (j == 0) {
      z71 z711 = this.d0;
      if (z711 != null && z711.Y())
        return this.d0.h1(i); 
    } 
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void givePermissionClick(View paramView) {
    n21.P((Activity)this, new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 1);
  }
  
  public void goBack(View paramView) {
    onBackPressed();
  }
  
  public final void m0() {
    this.k0 = null;
    this.l0 = 0;
    SearchActivity.l0();
    EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
    if (equalizerActivity2 != null)
      equalizerActivity2.finish(); 
    SettingsActivity settingsActivity = SettingsActivity.m0;
    if (settingsActivity != null)
      settingsActivity.finish(); 
    Tag2Activity tag2Activity = Tag2Activity.O1;
    if (tag2Activity != null)
      tag2Activity.finish(); 
    AboutActivity aboutActivity = AboutActivity.Z;
    if (aboutActivity != null)
      aboutActivity.finish(); 
    FolderExcluderActivity folderExcluderActivity = FolderExcluderActivity.Y;
    if (folderExcluderActivity != null)
      folderExcluderActivity.finish(); 
    finish();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (paramInt1 == 10312 && paramInt2 == -1) {
      this.o0.postDelayed((Runnable)new e6(12, this, paramIntent), 400L);
    } else if (paramInt1 == 10300) {
      try {
        pj pj = zo2.m;
      } finally {
        Exception exception = null;
      } 
    } else if (paramInt1 == 10400 && !jz.f()) {
      y0();
    } 
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onBackPressed() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MyApplication.w : I
    //   3: iconst_4
    //   4: if_icmpeq -> 12
    //   7: aload_0
    //   8: invokespecial onBackPressed : ()V
    //   11: return
    //   12: aload_0
    //   13: getfield t0 : Lly0;
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -> 36
    //   21: aload_2
    //   22: invokevirtual d : ()Z
    //   25: ifeq -> 36
    //   28: aload_0
    //   29: getfield t0 : Lly0;
    //   32: invokevirtual h : ()V
    //   35: return
    //   36: aload_0
    //   37: getfield U : Lt32;
    //   40: astore_2
    //   41: aload_2
    //   42: ifnonnull -> 50
    //   45: aload_0
    //   46: invokespecial onBackPressed : ()V
    //   49: return
    //   50: aload_0
    //   51: getfield h0 : Lh50;
    //   54: aload_2
    //   55: invokevirtual getCurrentItem : ()I
    //   58: invokevirtual h : (I)Lua0;
    //   61: checkcast ob
    //   64: invokeinterface e : ()Z
    //   69: istore_1
    //   70: iload_1
    //   71: ifeq -> 82
    //   74: goto -> 283
    //   77: astore_2
    //   78: aload_2
    //   79: invokevirtual printStackTrace : ()V
    //   82: ldc_w '0'
    //   85: invokestatic o : ()Landroid/content/SharedPreferences;
    //   88: ldc_w 'k_s_bbhv'
    //   91: ldc_w '0'
    //   94: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: invokevirtual equals : (Ljava/lang/Object;)Z
    //   102: ifeq -> 148
    //   105: aload_0
    //   106: getfield A0 : Ljava/util/Stack;
    //   109: astore_2
    //   110: aload_2
    //   111: invokevirtual size : ()I
    //   114: iconst_1
    //   115: if_icmple -> 148
    //   118: aload_2
    //   119: invokevirtual pop : ()Ljava/lang/Object;
    //   122: pop
    //   123: aload_2
    //   124: invokevirtual peek : ()Ljava/lang/Object;
    //   127: checkcast java/lang/Integer
    //   130: astore_2
    //   131: aload_0
    //   132: iconst_1
    //   133: putfield B0 : Z
    //   136: aload_0
    //   137: getfield U : Lt32;
    //   140: aload_2
    //   141: invokevirtual intValue : ()I
    //   144: invokevirtual setCurrentItem : (I)V
    //   147: return
    //   148: aload_0
    //   149: getfield U : Lt32;
    //   152: invokevirtual getCurrentItem : ()I
    //   155: iconst_1
    //   156: if_icmpeq -> 173
    //   159: aload_0
    //   160: iconst_1
    //   161: putfield B0 : Z
    //   164: aload_0
    //   165: getfield U : Lt32;
    //   168: iconst_1
    //   169: invokevirtual setCurrentItem : (I)V
    //   172: return
    //   173: aload_0
    //   174: getfield x0 : Landroid/content/SharedPreferences;
    //   177: ldc_w 'k_b_cfmex'
    //   180: iconst_1
    //   181: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   186: ifeq -> 247
    //   189: aload_0
    //   190: getfield z0 : Z
    //   193: ifne -> 247
    //   196: aload_0
    //   197: getfield d0 : Lz71;
    //   200: astore_2
    //   201: aload_2
    //   202: ifnull -> 247
    //   205: aload_2
    //   206: getfield a0 : Landroid/view/View;
    //   209: astore_2
    //   210: aload_2
    //   211: ifnonnull -> 217
    //   214: goto -> 247
    //   217: aload_0
    //   218: iconst_1
    //   219: putfield z0 : Z
    //   222: aload_0
    //   223: aload_2
    //   224: ldc_w 2131886232
    //   227: sipush #3500
    //   230: iconst_m1
    //   231: aconst_null
    //   232: new kc
    //   235: dup
    //   236: aload_0
    //   237: iconst_2
    //   238: invokespecial <init> : (Lin/krosbits/musicolet/MusicActivity;I)V
    //   241: invokevirtual k0 : (Landroid/view/View;IIILog;Lkc;)V
    //   244: goto -> 283
    //   247: invokestatic a : ()V
    //   250: aload_0
    //   251: getfield N : Landroid/os/Handler;
    //   254: astore_2
    //   255: new kc
    //   258: astore_3
    //   259: aload_3
    //   260: aload_0
    //   261: iconst_0
    //   262: invokespecial <init> : (Lin/krosbits/musicolet/MusicActivity;I)V
    //   265: aload_2
    //   266: aload_3
    //   267: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   270: pop
    //   271: goto -> 279
    //   274: astore_2
    //   275: aload_2
    //   276: invokevirtual printStackTrace : ()V
    //   279: aload_0
    //   280: invokespecial onBackPressed : ()V
    //   283: return
    // Exception table:
    //   from	to	target	type
    //   50	70	77	java/lang/NullPointerException
    //   250	271	274	finally
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    if (paramDialogInterface == S0)
      S0 = null; 
  }
  
  public final void onCreate(Bundle paramBundle) {
    PVdqHjWVkmL.YwDuMPiKDvp.invoke(null, new Object[] { this, paramBundle });
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    if (!MyApplication.k())
      return false; 
    if (getResources().getBoolean(2131034118) || this.R.size() < 7) {
      int j = 2131623941;
      getMenuInflater().inflate(j, paramMenu);
      ag0.A0(paramMenu, a51.l);
      return true;
    } 
    int i = 2131623940;
    getMenuInflater().inflate(i, paramMenu);
    ag0.A0(paramMenu, a51.l);
    return true;
  }
  
  public final void onDestroy() {
    PVdqHjWVkmL.oftOWyepQKDHaL.invoke(null, new Object[] { this });
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    if (paramDialogInterface == S0)
      S0 = null; 
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131297300)
      MyApplication.w(); 
    return false;
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    try {
      String str = paramIntent.getStringExtra("jump_key");
      if (str != null) {
        boolean bool = str.equals("jump_player");
        if (bool) {
          this.U.w(1, paramIntent.getBooleanExtra("smooth", true));
        } else if (str.equals("jump_queue")) {
          if (this.j0 != null) {
            MusicService.H0 = true;
            MusicService.I0 = (MyApplication.h()).c;
          } 
          this.U.w(0, paramIntent.getBooleanExtra("smooth", true));
          lb1 lb11 = this.f0;
          if (lb11 != null && lb11.Y()) {
            MusicService.H0 = true;
            MusicService.I0 = (MyApplication.h()).c;
            lb11 = this.f0;
            lb11.u0 = true;
            lb11.H0();
          } 
        } 
      } 
      str = paramIntent.getAction();
      if ("android.intent.action.VIEW".equals(str)) {
        C0(paramIntent);
        q0();
      } else if (ybWnIKHovcRr.BCTzikgLU.equals(str) || "android.intent.action.MEDIA_SEARCH".equals(str) || "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(str)) {
        this.y0 = paramIntent;
        A0();
      } 
      if (paramIntent.getBooleanExtra("extlrc", false))
        this.D0 = true; 
      if (paramIntent.getBooleanExtra("exlrsrc", false))
        this.E0 = true; 
      return;
    } finally {
      paramIntent = null;
      paramIntent.printStackTrace();
    } 
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 2131297136) {
      startActivity(new Intent((Context)this, SearchActivity.class));
    } else if (i == 2131297122) {
      startService((new Intent((Context)this, MusicService.class)).setAction("ACTION_CLOSE"));
    } else if (i == 2131297121) {
      w0();
    } else if (i == 2131297141) {
      y0();
    } else if (i == 2131297139) {
      startActivity(new Intent((Context)this, SettingsActivity.class));
    } else if (i == 2131297114) {
      startActivity(new Intent((Context)this, AboutActivity.class));
    } else if (i == 2131297135) {
      startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_BGU"));
    } 
    return true;
  }
  
  public final void onResume() {
    whGJe.zmavDDkancLJQZ.invoke(null, new Object[] { this });
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    lb0 lb01 = this.i0;
    if (lb01 != null) {
      try {
        lb01.C();
      } finally {
        lb01 = null;
      } 
      if (wn2 != null && wn2.Y())
        this.i0.W(paramBundle, "albumFragment", (ua0)this.Z); 
      wn wn2 = this.a0;
      if (wn2 != null && wn2.Y())
        this.i0.W(paramBundle, "artistFragment", (ua0)this.a0); 
      r90 r901 = this.c0;
      if (r901 != null && r901.Y())
        this.i0.W(paramBundle, "folderFragment", (ua0)this.c0); 
      z71 z711 = this.d0;
      if (z711 != null && z711.Y())
        this.i0.W(paramBundle, "playerFragment", (ua0)this.d0); 
      l81 l811 = this.e0;
      if (l811 != null && l811.Y())
        this.i0.W(paramBundle, "playlistFragment", (ua0)this.e0); 
      lb1 lb11 = this.f0;
      if (lb11 != null && lb11.Y())
        this.i0.W(paramBundle, "queueFragment", (ua0)this.f0); 
      gf0 gf01 = this.g0;
      if (gf01 != null && gf01.Y())
        this.i0.W(paramBundle, "hFolderFragment", (ua0)this.g0); 
      wn wn1 = this.b0;
      if (wn1 != null && wn1.Y())
        this.i0.W(paramBundle, "genreFragment", (ua0)this.b0); 
    } 
  }
  
  public final void onStart() {
    whGJe.FMz.invoke(null, new Object[] { this });
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    return false;
  }
  
  public final void p() {
    ua0 ua0 = this.h0.h(this.U.getCurrentItem());
    if (ua0 instanceof qy0)
      ((qy0)ua0).p(); 
  }
  
  public final int p0(int paramInt) {
    for (byte b = 0; b < this.R.size(); b++) {
      if (((Integer)this.R.get(b)).intValue() == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public final void q0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   4: ifnull -> 220
    //   7: aload_0
    //   8: getfield k0 : Ljava/lang/String;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnonnull -> 19
    //   16: goto -> 220
    //   19: getstatic im0.n0 : Ljava/util/HashSet;
    //   22: aload_3
    //   23: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   26: invokevirtual contains : (Ljava/lang/Object;)Z
    //   29: ifeq -> 64
    //   32: aload_0
    //   33: new android/content/Intent
    //   36: dup
    //   37: aload_0
    //   38: ldc_w in/krosbits/musicolet/PlaylistActivity
    //   41: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   44: ldc_w 'imt'
    //   47: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   50: ldc_w 'extpt'
    //   53: aload_0
    //   54: getfield k0 : Ljava/lang/String;
    //   57: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   60: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   63: return
    //   64: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   67: getfield c : Llm0;
    //   70: new wo
    //   73: dup
    //   74: aload_0
    //   75: getfield k0 : Ljava/lang/String;
    //   78: aconst_null
    //   79: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   82: invokevirtual b : (Lwo;)Lkm0;
    //   85: astore_3
    //   86: aload_3
    //   87: ifnull -> 220
    //   90: aload_3
    //   91: getfield b : I
    //   94: istore_2
    //   95: invokestatic y : ()Lkm0;
    //   98: getfield b : I
    //   101: istore_1
    //   102: iload_1
    //   103: iload_2
    //   104: if_icmpne -> 110
    //   107: goto -> 220
    //   110: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   113: getfield c : Llm0;
    //   116: aload_3
    //   117: getfield h : Ljava/lang/String;
    //   120: invokevirtual m : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   123: astore #4
    //   125: invokestatic o : ()Landroid/content/SharedPreferences;
    //   128: ldc_w 'I_K_SRTBYF_F'
    //   131: bipush #30
    //   133: invokeinterface getInt : (Ljava/lang/String;I)I
    //   138: aload #4
    //   140: invokestatic R : (ILjava/util/ArrayList;)V
    //   143: iconst_0
    //   144: istore_1
    //   145: iload_1
    //   146: aload #4
    //   148: invokevirtual size : ()I
    //   151: if_icmpge -> 179
    //   154: aload #4
    //   156: iload_1
    //   157: invokevirtual get : (I)Ljava/lang/Object;
    //   160: checkcast km0
    //   163: getfield b : I
    //   166: iload_2
    //   167: if_icmpne -> 173
    //   170: goto -> 181
    //   173: iinc #1, 1
    //   176: goto -> 145
    //   179: iconst_m1
    //   180: istore_1
    //   181: iload_1
    //   182: iconst_m1
    //   183: if_icmpeq -> 211
    //   186: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   189: aload_0
    //   190: getfield l0 : I
    //   193: putfield c : I
    //   196: aload_0
    //   197: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   200: aload #4
    //   202: iload_1
    //   203: aload_3
    //   204: getfield i : Ljava/lang/String;
    //   207: iconst_1
    //   208: invokevirtual k : (Ljava/util/ArrayList;ILjava/lang/String;Z)V
    //   211: aload_0
    //   212: getfield U : Lt32;
    //   215: iconst_1
    //   216: iconst_0
    //   217: invokevirtual w : (IZ)V
    //   220: return
    //   221: astore #4
    //   223: goto -> 110
    // Exception table:
    //   from	to	target	type
    //   95	102	221	finally
  }
  
  public final void r() {
    int i = this.U.getCurrentItem();
    if (my0.d() && this.h0.h(i) instanceof qy0) {
      this.t0.g();
    } else {
      this.t0.c();
    } 
    for (i = 0; i < this.R.size(); i++) {
      ua0 ua0 = this.h0.h(i);
      if (ua0 != null && ua0.Y() && ua0 instanceof qy0)
        ((qy0)ua0).r(); 
    } 
  }
  
  public final void r0() {
    if (this.j0 == null)
      return; 
    try {
      if (this.D0) {
        this.d0.U0();
        Handler handler = this.o0;
        kc kc = new kc();
        this(this, 1);
        handler.postDelayed((Runnable)kc, 400L);
        this.D0 = false;
      } 
    } finally {
      Exception exception;
    } 
    if (this.E0) {
      this.d0.U0();
      Handler handler = this.o0;
      kc kc = new kc();
      this(this, 3);
      handler.postDelayed((Runnable)kc, 400L);
      this.E0 = false;
    } 
    this.D0 = false;
  }
  
  public final void s0(Intent paramIntent) {
    if (this.j0 != null && paramIntent != null) {
      String str = paramIntent.getAction();
      if (str != null)
        if ("actshjp_AL_".equals(str)) {
          str = paramIntent.getStringExtra("extshjp_");
          int i = paramIntent.getIntExtra("extshjsr_", 0);
          try {
            ss0 ss01 = S0;
            if (ss01 != null)
              ss01.dismiss(); 
            int j = p0(3);
          } finally {
            paramIntent = null;
          } 
        } else {
          String str1;
          l81 l811;
          if ("actshjp_AR_".equals(str)) {
            str = paramIntent.getStringExtra("extshjp_");
            v0(paramIntent.getIntExtra("extshjsr_", 0), 0, str);
            return;
          } 
          if ("actshjp_ALAR_".equals(str)) {
            str = paramIntent.getStringExtra("extshjp_");
            v0(paramIntent.getIntExtra("extshjsr_", 0), 1, str);
            return;
          } 
          if ("actshjp_CM_".equals(str)) {
            str = paramIntent.getStringExtra("extshjp_");
            v0(paramIntent.getIntExtra("extshjsr_", 0), 2, str);
            return;
          } 
          if ("actshjp_GN_".equals(str)) {
            x0(paramIntent.getStringExtra("extshjp_"), paramIntent.getIntExtra("extshjsr_", 0));
            return;
          } 
          if ("actshjp_SP_".equals(str)) {
            str1 = paramIntent.getStringExtra("extshjp_");
            try {
              ss0 ss01 = S0;
              if (ss01 != null)
                ss01.dismiss(); 
              int i = p0(5);
            } finally {
              str1 = null;
            } 
          } else {
            l81 l812;
            if ("actshjp_UP_".equals(l811)) {
              str1 = str1.getStringExtra("extshjp_");
              try {
                ss0 ss01 = S0;
                if (ss01 != null)
                  ss01.dismiss(); 
                int i = p0(5);
              } finally {
                str1 = null;
              } 
            } else {
              gf0 gf01;
              if ("actshjp_F_".equals(l812)) {
                String str2 = str1.getStringExtra("extshjp_");
                int i = str1.getIntExtra("extshjsr_", 0);
                try {
                  ss0 ss01 = S0;
                  if (ss01 != null)
                    ss01.dismiss(); 
                  int j = p0(2);
                } finally {
                  str1 = null;
                } 
                return;
              } 
              "actshjp_HF_".equals(gf01);
              return;
            } 
          } 
        }  
    } 
  }
  
  public final void t0() {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/musicolet/MusicActivity}} */
    try {
      if (this.L0 || isFinishing()) {
        /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicActivity}} */
        return;
      } 
      int i = MyApplication.w;
      String str = null;
      if (i == 4) {
        if (this.N0 != null) {
          this.L0 = true;
          L0(this.C0);
          cn.o((Context)this).C((BroadcastReceiver)this.N0);
          this.N0 = null;
          this.W = null;
          this.V = null;
          this.X = null;
        } 
      } else {
        if (this.V == null || this.X == null || this.W == null) {
          this.V = (TextView)findViewById(2131297900);
          this.W = (TextView)findViewById(2131297836);
          ProgressBar progressBar1 = (ProgressBar)findViewById(2131297300);
          this.X = progressBar1;
          progressBar1.setOnLongClickListener(this);
        } 
        i = MyApplication.w;
        ProgressBar progressBar = this.X;
        if (i == 0) {
          progressBar.setVisibility(8);
          this.V.setVisibility(8);
          this.W.setVisibility(8);
        } else {
          progressBar.setVisibility(0);
          this.V.setVisibility(0);
          this.W.setVisibility(0);
          String str1 = MyApplication.m;
          im0 im0 = im0.g0;
          if (im0 != null) {
            str = im0.c;
            i = im0.a;
            ProgressBar progressBar1 = this.X;
            if (i > 0) {
              progressBar1.setMax(i);
              this.X.setProgress(im0.b);
              this.X.setIndeterminate(false);
            } else {
              progressBar1.setIndeterminate(true);
            } 
          } else {
            this.X.setIndeterminate(true);
          } 
          this.V.setText(str1);
          this.W.setText(str);
        } 
        if (MyApplication.w == -1) {
          int[] arrayOfInt = MyApplication.l;
          if (arrayOfInt != null && arrayOfInt.length > 0) {
            Intent intent = new Intent();
            this((Context)this, WelcomeActivity.class);
            startActivity(intent.putExtra("ARGWCPGS", MyApplication.l));
            finish();
          } 
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicActivity}} */
  }
  
  public final void u0(MusicService paramMusicService) {
    this.j0 = paramMusicService;
    paramMusicService.s = this;
    lb1 lb11 = this.f0;
    if (lb11 != null && lb11.Y())
      this.f0.D0(); 
    z71 z711 = this.d0;
    if (z711 != null && z711.Y()) {
      this.d0.g1();
      this.d0.d1();
    } 
    q0();
    B0();
    A0();
    s0(getIntent());
    r0();
    try {
      if (ag0.l) {
        ag0.l = false;
        if (!ag0.f)
          ag0.Y(this, true, null); 
      } 
    } finally {
      z711 = null;
    } 
  }
  
  public final void v0(int paramInt1, int paramInt2, String paramString) {
    try {
      ss0 ss01 = S0;
      if (ss01 != null)
        ss01.dismiss(); 
      int i = p0(4);
      if (i < 0)
        return; 
      if (paramInt2 == 0) {
        Pattern pattern = MyApplication.j.c.E;
      } else if (paramInt2 == 1) {
        Pattern pattern = MyApplication.j.c.F;
      } else if (paramInt2 == 2) {
        Pattern pattern = MyApplication.j.c.G;
      } else {
        ss01 = null;
      } 
      String str = paramString;
      if (ss01 != null) {
        String[] arrayOfString = ss01.split(paramString);
        str = paramString;
        if (arrayOfString.length > 1) {
          ms0 ms01;
          gf<String> gf;
          ArrayList<String> arrayList = new ArrayList();
          this(arrayOfString.length);
          int j = arrayOfString.length;
          for (byte b = 0; b < j; b++) {
            str = arrayOfString[b].trim();
            if (str.length() > 0)
              arrayList.add(str); 
          } 
          if (arrayList.size() > 1) {
            ms01 = new ms0();
            this((Context)this);
            ms01.h(arrayList);
            gf = new gf();
            this(paramInt1, paramInt2, this);
            return;
          } 
          ms0 ms02 = ms01;
          if (gf.size() == 1)
            str = gf.get(0); 
        } 
      } 
      wn wn1 = (wn)this.h0.h(i);
      if (paramInt1 > 0)
        wn1.S0 = paramInt1; 
      if (paramInt2 == 0) {
        wn1.U0 = str;
      } else if (paramInt2 == 1) {
        wn1.V0 = str;
      } else if (paramInt2 == 2) {
        wn1.W0 = str;
      } 
      if (wn1.Y())
        wn1.D0(); 
      this.U.w(i, false);
      return;
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public final void w() {
    ua0 ua0 = this.h0.h(this.U.getCurrentItem());
    if (ua0 instanceof qy0)
      ((qy0)ua0).w(); 
  }
  
  public final void w0() {
    hc hc = MusicService.E0;
    if (hc != null)
      if (hc.H()) {
        int i = getSharedPreferences("PP", 0).getInt("etu2", 0);
        if (i == 0 || i == 2) {
          startActivity(new Intent((Context)this, EqualizerActivity2.class));
          return;
        } 
        if (i == 1) {
          Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
          intent.putExtra("android.media.extra.AUDIO_SESSION", MusicService.E0.x());
          intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        } 
      } else {
        if (MusicService.E0 instanceof fl) {
          ms0 ms0 = new ms0((Context)this);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(getString(2131886339));
          stringBuilder.append(" ");
          stringBuilder.append(getString(2131887543));
          ms0.d(stringBuilder.toString());
          ms0.n(2131887030);
          ms0.p();
          return;
        } 
        ag0.P0(1, getString(2131887014, new Object[] { j50.g() }), true);
      }  
  }
  
  public final void x() {
    ua0 ua0 = this.h0.h(this.U.getCurrentItem());
    if (ua0 instanceof qy0)
      ((qy0)ua0).x(); 
  }
  
  public final void x0(String paramString, int paramInt) {
    try {
      ss0 ss01 = S0;
      if (ss01 != null)
        ss01.dismiss(); 
      int i = p0(6);
      if (i < 0)
        return; 
      Pattern pattern = MyApplication.j.c.H;
      String str = paramString;
      if (pattern != null) {
        String[] arrayOfString = pattern.split(paramString);
        str = paramString;
        if (arrayOfString.length > 1) {
          ms0 ms01;
          ArrayList<String> arrayList = new ArrayList();
          this(arrayOfString.length);
          int j = arrayOfString.length;
          for (byte b = 0; b < j; b++) {
            str = arrayOfString[b].trim();
            if (str.length() > 0)
              arrayList.add(str); 
          } 
          if (arrayList.size() > 1) {
            ms01 = new ms0();
            this((Context)this);
            ms01.h(arrayList);
            mz mz = new mz();
            this(paramInt, 2, this);
            return;
          } 
          ms0 ms02 = ms01;
          if (arrayList.size() == 1)
            str = arrayList.get(0); 
        } 
      } 
      wn wn1 = (wn)this.h0.h(i);
      if (paramInt > 0)
        wn1.S0 = paramInt; 
      wn1.X0 = str;
      if (wn1.Y())
        wn1.D0(); 
      this.U.w(i, false);
      return;
    } finally {
      paramString = null;
      paramString.printStackTrace();
    } 
  }
  
  public final void y0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void z0() {
    int[] arrayOfInt = m92.h;
    if (this.p0)
      try {
        wg wg;
        this.q0.setImageDrawable(null);
        MyApplication.v.b((kt1)this.s0);
        Toolbar toolbar = this.S;
        if (this.F0) {
          wg = new wg();
          this(arrayOfInt[0], 1);
          wg.d = (int)(MyApplication.p * 0.0F);
        } else {
          wg = new wg();
          this(arrayOfInt[0], 0);
          wg.d = (int)(MyApplication.p * 0.0F);
        } 
        toolbar.setBackground((Drawable)wg);
        this.T.setSelectedTabIndicatorColor(arrayOfInt[3]);
        ag0.C0(arrayOfInt[3], this.T.getTabSelectedIndicator());
        this.p0 = false;
        this.d0.J0(false);
        return;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MusicActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */