package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import ay0;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.RangeSlider2;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import cr0;
import cy0;
import dy0;
import f;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import jn;
import k80;
import k91;
import ki;
import km0;
import l51;
import m92;
import ms0;
import n0;
import no;
import os0;
import p41;
import pc;
import pq;
import q41;
import q70;
import rv1;
import sn;
import ss.com.bannerslider.Slider;
import ss0;
import tp;
import u51;
import ws2;
import x41;
import xx0;
import zx0;

public class MostPlayedActivity extends pc implements p41, q41, View.OnClickListener {
  public static final Object k0 = new Object();
  
  public ki R;
  
  public ss0 S;
  
  public FrameLayout T;
  
  public final String[] U = new String[2];
  
  public final File[] V = new File[2];
  
  public final Bitmap[] W = new Bitmap[2];
  
  public String X = null;
  
  public String Y;
  
  public final ArrayList Z = new ArrayList();
  
  public int[] a0;
  
  public ArrayList b0;
  
  public List c0;
  
  public long d0;
  
  public List e0;
  
  public List f0;
  
  public rv1 g0;
  
  public Bundle h0;
  
  public final q70 i0 = new q70(1, this);
  
  public boolean j0 = false;
  
  public static void l0(MostPlayedActivity paramMostPlayedActivity, int paramInt, rv1 paramrv1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield W : [Landroid/graphics/Bitmap;
    //   4: astore #6
    //   6: iconst_0
    //   7: istore_3
    //   8: iload_3
    //   9: iconst_2
    //   10: if_icmpge -> 220
    //   13: aload #6
    //   15: iload_3
    //   16: aaload
    //   17: astore #4
    //   19: aload #4
    //   21: ifnull -> 39
    //   24: aload #4
    //   26: invokevirtual isRecycled : ()Z
    //   29: ifeq -> 214
    //   32: goto -> 39
    //   35: astore_2
    //   36: goto -> 276
    //   39: aload_0
    //   40: getfield V : [Ljava/io/File;
    //   43: iload_3
    //   44: aaload
    //   45: invokestatic s : (Ljava/io/File;)Lcd1;
    //   48: astore #4
    //   50: getstatic p3.a : Ljava/util/HashMap;
    //   53: astore #5
    //   55: aload #4
    //   57: ldc 'r'
    //   59: invokestatic J : (Lu00;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   62: astore #5
    //   64: aload #5
    //   66: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   69: iconst_0
    //   70: iconst_0
    //   71: invokestatic o : (Ljava/io/FileDescriptor;II)Landroid/graphics/Bitmap;
    //   74: astore #4
    //   76: aload #5
    //   78: invokevirtual close : ()V
    //   81: goto -> 97
    //   84: astore #4
    //   86: aload #5
    //   88: invokevirtual close : ()V
    //   91: aconst_null
    //   92: astore #4
    //   94: goto -> 81
    //   97: aload #4
    //   99: bipush #60
    //   101: sipush #262
    //   104: aload #4
    //   106: invokevirtual getWidth : ()I
    //   109: i2f
    //   110: ldc 120.0
    //   112: fsub
    //   113: f2i
    //   114: aload #4
    //   116: invokevirtual getHeight : ()I
    //   119: i2f
    //   120: ldc 524.0
    //   122: fsub
    //   123: f2i
    //   124: aconst_null
    //   125: iconst_1
    //   126: invokestatic createBitmap : (Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   129: astore #5
    //   131: aload #5
    //   133: aload #4
    //   135: if_acmpeq -> 143
    //   138: aload #4
    //   140: invokevirtual recycle : ()V
    //   143: aload #5
    //   145: astore #4
    //   147: aload #5
    //   149: invokevirtual getWidth : ()I
    //   152: iload_1
    //   153: if_icmple -> 190
    //   156: aload #5
    //   158: iload_1
    //   159: aload #5
    //   161: invokevirtual getHeight : ()I
    //   164: iload_1
    //   165: imul
    //   166: aload #5
    //   168: invokevirtual getWidth : ()I
    //   171: idiv
    //   172: iconst_1
    //   173: invokestatic createScaledBitmap : (Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   176: astore #4
    //   178: aload #4
    //   180: aload #5
    //   182: if_acmpeq -> 190
    //   185: aload #5
    //   187: invokevirtual recycle : ()V
    //   190: aload #4
    //   192: iload_1
    //   193: i2f
    //   194: ldc 0.03125
    //   196: fmul
    //   197: f2i
    //   198: invokestatic l : (Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   201: astore #5
    //   203: aload #4
    //   205: invokevirtual recycle : ()V
    //   208: aload #6
    //   210: iload_3
    //   211: aload #5
    //   213: aastore
    //   214: iinc #3, 1
    //   217: goto -> 8
    //   220: new vf
    //   223: astore #4
    //   225: aload #4
    //   227: iconst_0
    //   228: aload #6
    //   230: invokespecial <init> : (ILjava/lang/Object;)V
    //   233: aload #4
    //   235: iconst_1
    //   236: putfield a : Z
    //   239: iload_1
    //   240: i2f
    //   241: ldc 0.11111111
    //   243: fmul
    //   244: f2i
    //   245: istore_1
    //   246: aload_0
    //   247: getfield N : Landroid/os/Handler;
    //   250: astore #5
    //   252: new ff
    //   255: astore #6
    //   257: aload #6
    //   259: aload_0
    //   260: aload_2
    //   261: aload #4
    //   263: iload_1
    //   264: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;Lrv1;Lvf;I)V
    //   267: aload #5
    //   269: aload #6
    //   271: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   274: pop
    //   275: return
    //   276: aload_2
    //   277: invokevirtual printStackTrace : ()V
    //   280: aload_0
    //   281: invokespecial finish : ()V
    //   284: return
    //   285: astore #5
    //   287: goto -> 81
    //   290: astore #4
    //   292: goto -> 91
    // Exception table:
    //   from	to	target	type
    //   24	32	35	finally
    //   39	64	35	finally
    //   64	76	84	finally
    //   76	81	285	finally
    //   86	91	290	finally
    //   97	131	35	finally
    //   138	143	35	finally
    //   147	178	35	finally
    //   185	190	35	finally
    //   190	208	35	finally
    //   220	239	35	finally
    //   246	275	35	finally
  }
  
  public static void m0(MostPlayedActivity paramMostPlayedActivity, View paramView, int paramInt) {
    try {
      if (paramView.getParent() == null || paramView.getWidth() == 0)
        return; 
      Bitmap bitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
      Canvas canvas = new Canvas();
      this(bitmap);
      paramView.draw(canvas);
      cy0 cy0 = new cy0();
      return;
    } finally {
      paramView = null;
      paramView.printStackTrace();
      paramMostPlayedActivity.finish();
    } 
  }
  
  public static void n0(MostPlayedActivity paramMostPlayedActivity) {
    rv1 rv11 = paramMostPlayedActivity.g0;
    try {
      paramMostPlayedActivity.T.removeAllViews();
      int j = ((Slider)rv11.i).getWidth();
      int i = (int)((((Slider)rv11.i).getWidth() * 120) / 1080.0F);
      Thread thread = new Thread();
      xx0 xx0 = new xx0();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
      paramMostPlayedActivity.finish();
    } 
  }
  
  public static void o0(MostPlayedActivity paramMostPlayedActivity, View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c0 : Ljava/util/List;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnull -> 90
    //   11: aload_0
    //   12: getfield e0 : Ljava/util/List;
    //   15: ifnull -> 90
    //   18: aload #8
    //   20: invokeinterface size : ()I
    //   25: iconst_3
    //   26: if_icmplt -> 90
    //   29: aload_0
    //   30: getfield c0 : Ljava/util/List;
    //   33: invokeinterface size : ()I
    //   38: aload_0
    //   39: getfield e0 : Ljava/util/List;
    //   42: invokeinterface size : ()I
    //   47: if_icmpne -> 90
    //   50: aload_0
    //   51: getfield f0 : Ljava/util/List;
    //   54: ifnull -> 90
    //   57: aload_0
    //   58: getfield c0 : Ljava/util/List;
    //   61: astore #9
    //   63: aload_0
    //   64: getfield e0 : Ljava/util/List;
    //   67: astore #10
    //   69: aload #9
    //   71: invokeinterface size : ()I
    //   76: istore_2
    //   77: aload_0
    //   78: getfield f0 : Ljava/util/List;
    //   81: astore #8
    //   83: goto -> 348
    //   86: astore_1
    //   87: goto -> 1078
    //   90: aload_0
    //   91: getfield X : Ljava/lang/String;
    //   94: invokestatic f : (Ljava/lang/String;)Lu51;
    //   97: astore #8
    //   99: bipush #10
    //   101: aload #8
    //   103: getfield a : Ljava/lang/Object;
    //   106: checkcast java/util/ArrayList
    //   109: invokevirtual size : ()I
    //   112: invokestatic min : (II)I
    //   115: istore_3
    //   116: iload_3
    //   117: iconst_3
    //   118: if_icmpge -> 190
    //   121: new java/lang/StringBuilder
    //   124: astore_1
    //   125: aload_1
    //   126: invokespecial <init> : ()V
    //   129: aload_1
    //   130: aload_0
    //   131: ldc_w 2131887402
    //   134: invokevirtual getString : (I)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_1
    //   142: ldc_w ' < '
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_1
    //   150: aload_0
    //   151: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   154: ldc_w 2131755061
    //   157: iconst_3
    //   158: iconst_1
    //   159: anewarray java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: iconst_3
    //   165: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   168: aastore
    //   169: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: iconst_1
    //   177: aload_1
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: iconst_1
    //   182: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   185: aload_0
    //   186: invokespecial finish : ()V
    //   189: return
    //   190: aload_0
    //   191: lconst_0
    //   192: putfield d0 : J
    //   195: iconst_0
    //   196: istore_2
    //   197: iload_2
    //   198: aload #8
    //   200: getfield a : Ljava/lang/Object;
    //   203: checkcast java/util/ArrayList
    //   206: invokevirtual size : ()I
    //   209: if_icmpge -> 273
    //   212: aload_0
    //   213: getfield d0 : J
    //   216: lstore #5
    //   218: aload_0
    //   219: aload #8
    //   221: getfield a : Ljava/lang/Object;
    //   224: checkcast java/util/ArrayList
    //   227: iload_2
    //   228: invokevirtual get : (I)Ljava/lang/Object;
    //   231: checkcast km0
    //   234: getfield c : Lqn1;
    //   237: getfield g : I
    //   240: i2l
    //   241: aload #8
    //   243: getfield b : Ljava/lang/Object;
    //   246: checkcast java/util/ArrayList
    //   249: iload_2
    //   250: invokevirtual get : (I)Ljava/lang/Object;
    //   253: checkcast java/lang/Integer
    //   256: invokevirtual intValue : ()I
    //   259: i2l
    //   260: lmul
    //   261: lload #5
    //   263: ladd
    //   264: putfield d0 : J
    //   267: iinc #2, 1
    //   270: goto -> 197
    //   273: aload #8
    //   275: getfield a : Ljava/lang/Object;
    //   278: checkcast java/util/ArrayList
    //   281: iconst_0
    //   282: iload_3
    //   283: invokevirtual subList : (II)Ljava/util/List;
    //   286: astore #9
    //   288: aload #8
    //   290: getfield b : Ljava/lang/Object;
    //   293: checkcast java/util/ArrayList
    //   296: iconst_0
    //   297: iload_3
    //   298: invokevirtual subList : (II)Ljava/util/List;
    //   301: astore #10
    //   303: aload_0
    //   304: aload #9
    //   306: putfield c0 : Ljava/util/List;
    //   309: aload_0
    //   310: aload #10
    //   312: putfield e0 : Ljava/util/List;
    //   315: aload #8
    //   317: invokestatic F : (Lu51;)Ljava/util/ArrayList;
    //   320: astore #8
    //   322: aload #8
    //   324: iconst_0
    //   325: aload #8
    //   327: invokevirtual size : ()I
    //   330: bipush #10
    //   332: invokestatic min : (II)I
    //   335: invokevirtual subList : (II)Ljava/util/List;
    //   338: astore #8
    //   340: aload_0
    //   341: aload #8
    //   343: putfield f0 : Ljava/util/List;
    //   346: iload_3
    //   347: istore_2
    //   348: aload_0
    //   349: getfield b0 : Ljava/util/ArrayList;
    //   352: astore #11
    //   354: aload #11
    //   356: ifnull -> 377
    //   359: aload #11
    //   361: invokevirtual size : ()I
    //   364: iload_2
    //   365: if_icmpne -> 377
    //   368: aload_0
    //   369: getfield b0 : Ljava/util/ArrayList;
    //   372: astore #11
    //   374: goto -> 465
    //   377: new java/util/ArrayList
    //   380: astore #11
    //   382: aload #11
    //   384: iload_2
    //   385: invokespecial <init> : (I)V
    //   388: iconst_0
    //   389: istore_3
    //   390: iload_3
    //   391: iload_2
    //   392: if_icmpge -> 456
    //   395: aload_0
    //   396: getfield R : Lki;
    //   399: astore #12
    //   401: aload #12
    //   403: ifnull -> 1086
    //   406: aload #12
    //   408: getfield b : Z
    //   411: ifeq -> 417
    //   414: goto -> 1086
    //   417: aload #11
    //   419: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   422: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   425: aload #9
    //   427: iload_3
    //   428: invokeinterface get : (I)Ljava/lang/Object;
    //   433: checkcast km0
    //   436: bipush #120
    //   438: bipush #120
    //   440: ldc_w 2131230842
    //   443: invokestatic h : (Landroid/content/Context;Lkm0;III)Landroid/graphics/Bitmap;
    //   446: invokevirtual add : (Ljava/lang/Object;)Z
    //   449: pop
    //   450: iinc #3, 1
    //   453: goto -> 390
    //   456: aload_0
    //   457: aload #11
    //   459: putfield b0 : Ljava/util/ArrayList;
    //   462: goto -> 374
    //   465: aload_0
    //   466: getfield R : Lki;
    //   469: astore #12
    //   471: aload #12
    //   473: ifnull -> 1086
    //   476: aload #12
    //   478: getfield b : Z
    //   481: ifeq -> 487
    //   484: goto -> 1086
    //   487: aload_0
    //   488: getfield a0 : [I
    //   491: ifnull -> 497
    //   494: goto -> 680
    //   497: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   500: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   503: aload #9
    //   505: iconst_0
    //   506: invokeinterface get : (I)Ljava/lang/Object;
    //   511: checkcast km0
    //   514: bipush #120
    //   516: bipush #120
    //   518: ldc_w 2131230842
    //   521: invokestatic h : (Landroid/content/Context;Lkm0;III)Landroid/graphics/Bitmap;
    //   524: iconst_1
    //   525: newarray boolean
    //   527: dup
    //   528: iconst_0
    //   529: iconst_0
    //   530: bastore
    //   531: invokestatic a : (Landroid/graphics/Bitmap;[Z)[Ly51;
    //   534: astore #14
    //   536: aload_0
    //   537: getfield R : Lki;
    //   540: astore #12
    //   542: aload #12
    //   544: ifnull -> 1086
    //   547: aload #12
    //   549: getfield b : Z
    //   552: ifeq -> 558
    //   555: goto -> 1086
    //   558: aconst_null
    //   559: astore #13
    //   561: aload #14
    //   563: ifnull -> 575
    //   566: aload #14
    //   568: iconst_0
    //   569: aaload
    //   570: astore #12
    //   572: goto -> 578
    //   575: aconst_null
    //   576: astore #12
    //   578: aload #14
    //   580: ifnull -> 589
    //   583: aload #14
    //   585: iconst_1
    //   586: aaload
    //   587: astore #13
    //   589: aload #12
    //   591: aload #13
    //   593: invokestatic g : (Ly51;Ly51;)[I
    //   596: astore #12
    //   598: aload_0
    //   599: aload #12
    //   601: putfield a0 : [I
    //   604: aload_0
    //   605: getfield Z : Ljava/util/ArrayList;
    //   608: astore #14
    //   610: new u51
    //   613: astore #13
    //   615: aload #13
    //   617: aload #12
    //   619: iconst_1
    //   620: iaload
    //   621: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   624: aload #12
    //   626: iconst_0
    //   627: iaload
    //   628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   631: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   634: aload #14
    //   636: iconst_0
    //   637: aload #13
    //   639: invokevirtual add : (ILjava/lang/Object;)V
    //   642: aload_0
    //   643: getfield Z : Ljava/util/ArrayList;
    //   646: astore #13
    //   648: new u51
    //   651: astore #14
    //   653: aload #14
    //   655: aload #12
    //   657: iconst_0
    //   658: iaload
    //   659: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   662: aload #12
    //   664: iconst_1
    //   665: iaload
    //   666: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   669: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   672: aload #13
    //   674: iconst_1
    //   675: aload #14
    //   677: invokevirtual add : (ILjava/lang/Object;)V
    //   680: aload_0
    //   681: getfield h0 : Landroid/os/Bundle;
    //   684: ldc_w 'ti'
    //   687: iconst_0
    //   688: invokevirtual getInt : (Ljava/lang/String;I)I
    //   691: istore_3
    //   692: aload_0
    //   693: getfield Z : Ljava/util/ArrayList;
    //   696: iload_3
    //   697: invokevirtual get : (I)Ljava/lang/Object;
    //   700: checkcast u51
    //   703: getfield a : Ljava/lang/Object;
    //   706: checkcast java/lang/Integer
    //   709: invokevirtual intValue : ()I
    //   712: istore_2
    //   713: aload_0
    //   714: getfield Z : Ljava/util/ArrayList;
    //   717: iload_3
    //   718: invokevirtual get : (I)Ljava/lang/Object;
    //   721: checkcast u51
    //   724: getfield b : Ljava/lang/Object;
    //   727: checkcast java/lang/Integer
    //   730: invokevirtual intValue : ()I
    //   733: istore_3
    //   734: new android/graphics/drawable/ColorDrawable
    //   737: astore #12
    //   739: aload #12
    //   741: iload_2
    //   742: invokespecial <init> : (I)V
    //   745: aload_0
    //   746: getfield d0 : J
    //   749: lstore #5
    //   751: aload_0
    //   752: getfield R : Lki;
    //   755: astore #13
    //   757: aload #13
    //   759: ifnull -> 1086
    //   762: aload #13
    //   764: getfield b : Z
    //   767: istore #7
    //   769: iload #7
    //   771: ifeq -> 777
    //   774: goto -> 1086
    //   777: aload_1
    //   778: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   781: ifnull -> 1086
    //   784: aload_1
    //   785: invokevirtual getWidth : ()I
    //   788: istore #4
    //   790: iload #4
    //   792: ifne -> 805
    //   795: goto -> 1086
    //   798: astore #13
    //   800: aload #13
    //   802: invokevirtual printStackTrace : ()V
    //   805: aload_0
    //   806: getfield V : [Ljava/io/File;
    //   809: iconst_0
    //   810: aaload
    //   811: invokestatic r0 : (Ljava/io/File;)Z
    //   814: ifne -> 929
    //   817: aload #8
    //   819: invokeinterface size : ()I
    //   824: aload_0
    //   825: getfield h0 : Landroid/os/Bundle;
    //   828: ldc_w 'mnarws'
    //   831: iconst_3
    //   832: invokevirtual getInt : (Ljava/lang/String;I)I
    //   835: invokestatic min : (II)I
    //   838: istore #4
    //   840: aload_0
    //   841: getfield N : Landroid/os/Handler;
    //   844: astore #14
    //   846: new yx0
    //   849: astore #13
    //   851: aload #13
    //   853: aload_0
    //   854: aload_1
    //   855: aload #12
    //   857: iload_3
    //   858: iload_2
    //   859: lload #5
    //   861: aload #9
    //   863: aload #10
    //   865: aload #11
    //   867: aload #8
    //   869: iload #4
    //   871: iconst_0
    //   872: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;IIJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;II)V
    //   875: aload #14
    //   877: aload #13
    //   879: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   882: pop
    //   883: aload_0
    //   884: getfield V : [Ljava/io/File;
    //   887: iconst_0
    //   888: aaload
    //   889: invokestatic r0 : (Ljava/io/File;)Z
    //   892: ifne -> 929
    //   895: getstatic in/krosbits/musicolet/MostPlayedActivity.k0 : Ljava/lang/Object;
    //   898: astore #13
    //   900: aload #13
    //   902: monitorenter
    //   903: aload #13
    //   905: ldc2_w 150
    //   908: invokevirtual wait : (J)V
    //   911: goto -> 918
    //   914: astore_1
    //   915: goto -> 924
    //   918: aload #13
    //   920: monitorexit
    //   921: goto -> 883
    //   924: aload #13
    //   926: monitorexit
    //   927: aload_1
    //   928: athrow
    //   929: aload_0
    //   930: getfield V : [Ljava/io/File;
    //   933: iconst_1
    //   934: aaload
    //   935: invokestatic r0 : (Ljava/io/File;)Z
    //   938: ifne -> 1051
    //   941: aload #8
    //   943: invokeinterface size : ()I
    //   948: aload_0
    //   949: getfield h0 : Landroid/os/Bundle;
    //   952: ldc_w 'mnarwos'
    //   955: bipush #10
    //   957: invokevirtual getInt : (Ljava/lang/String;I)I
    //   960: invokestatic min : (II)I
    //   963: istore #4
    //   965: aload_0
    //   966: getfield N : Landroid/os/Handler;
    //   969: astore #13
    //   971: new yx0
    //   974: astore #14
    //   976: aload #14
    //   978: aload_0
    //   979: aload_1
    //   980: aload #12
    //   982: iload_3
    //   983: iload_2
    //   984: lload #5
    //   986: aload #9
    //   988: aload #10
    //   990: aload #11
    //   992: aload #8
    //   994: iload #4
    //   996: iconst_1
    //   997: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;Landroid/view/View;Landroid/graphics/drawable/ColorDrawable;IIJLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;II)V
    //   1000: aload #13
    //   1002: aload #14
    //   1004: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1007: pop
    //   1008: aload_0
    //   1009: getfield V : [Ljava/io/File;
    //   1012: iconst_1
    //   1013: aaload
    //   1014: invokestatic r0 : (Ljava/io/File;)Z
    //   1017: ifne -> 1051
    //   1020: getstatic in/krosbits/musicolet/MostPlayedActivity.k0 : Ljava/lang/Object;
    //   1023: astore_1
    //   1024: aload_1
    //   1025: monitorenter
    //   1026: aload_1
    //   1027: ldc2_w 150
    //   1030: invokevirtual wait : (J)V
    //   1033: goto -> 1041
    //   1036: astore #8
    //   1038: goto -> 1046
    //   1041: aload_1
    //   1042: monitorexit
    //   1043: goto -> 1008
    //   1046: aload_1
    //   1047: monitorexit
    //   1048: aload #8
    //   1050: athrow
    //   1051: aload_0
    //   1052: getfield N : Landroid/os/Handler;
    //   1055: astore_1
    //   1056: new zx0
    //   1059: astore #8
    //   1061: aload #8
    //   1063: aload_0
    //   1064: iconst_0
    //   1065: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;I)V
    //   1068: aload_1
    //   1069: aload #8
    //   1071: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1074: pop
    //   1075: goto -> 1086
    //   1078: aload_1
    //   1079: invokevirtual printStackTrace : ()V
    //   1082: aload_0
    //   1083: invokespecial finish : ()V
    //   1086: return
    //   1087: astore #14
    //   1089: goto -> 918
    //   1092: astore #8
    //   1094: goto -> 1041
    // Exception table:
    //   from	to	target	type
    //   0	6	86	finally
    //   11	83	86	finally
    //   90	116	86	finally
    //   121	189	86	finally
    //   190	195	86	finally
    //   197	267	86	finally
    //   273	346	86	finally
    //   348	354	86	finally
    //   359	374	86	finally
    //   377	388	86	finally
    //   395	401	86	finally
    //   406	414	86	finally
    //   417	450	86	finally
    //   456	462	86	finally
    //   465	471	86	finally
    //   476	484	86	finally
    //   487	494	86	finally
    //   497	542	86	finally
    //   547	555	86	finally
    //   589	680	86	finally
    //   680	757	86	finally
    //   762	769	86	finally
    //   777	790	798	finally
    //   800	805	86	finally
    //   805	883	86	finally
    //   883	903	86	finally
    //   903	911	1087	java/lang/InterruptedException
    //   903	911	914	finally
    //   918	921	914	finally
    //   924	927	914	finally
    //   927	929	86	finally
    //   929	1008	86	finally
    //   1008	1026	86	finally
    //   1026	1033	1092	java/lang/InterruptedException
    //   1026	1033	1036	finally
    //   1041	1043	1036	finally
    //   1046	1048	1036	finally
    //   1048	1051	86	finally
    //   1051	1075	86	finally
  }
  
  public static Uri p0(MostPlayedActivity paramMostPlayedActivity, int paramInt) {
    Uri uri1;
    ContentResolver contentResolver = MyApplication.i.getApplicationContext().getContentResolver();
    Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    String str2 = x41.n(new StringBuilder(), Environment.DIRECTORY_PICTURES, "/Musicolet/");
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = paramMostPlayedActivity.U;
    String str1 = arrayOfString[paramInt];
    stringBuilder.append(str1.substring(0, str1.lastIndexOf('.')));
    stringBuilder.append("%.");
    stringBuilder.append(ag0.C(arrayOfString[paramInt]));
    str1 = stringBuilder.toString();
    Bundle bundle = new Bundle();
    bundle.putString("android:query-arg-sql-selection", "_display_name like ? AND relative_path=?");
    bundle.putStringArray("android:query-arg-sql-selection-args", new String[] { str1, str2 });
    bundle.putInt("android:query-arg-sql-limit", 1);
    str1 = null;
    stringBuilder = null;
    Cursor cursor = contentResolver.query(uri2, new String[] { "_id" }, bundle, null);
    if (cursor != null) {
      StringBuilder stringBuilder1 = stringBuilder;
      if (cursor.moveToNext())
        uri1 = Uri.withAppendedPath(uri2, String.valueOf(cursor.getInt(0))); 
      cursor.close();
    } 
    if (uri1 != null)
      return uri1; 
    ContentValues contentValues = new ContentValues(4);
    contentValues.put("_display_name", arrayOfString[paramInt]);
    contentValues.put("relative_path", str2);
    contentValues.put("mime_type", "image/jpeg");
    return contentResolver.insert(uri2, contentValues);
  }
  
  public static void q0(Window paramWindow) {
    paramWindow.getDecorView().setSystemUiVisibility(5638);
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      WindowManager.LayoutParams layoutParams = paramWindow.getAttributes();
      if (i >= 30) {
        i = 3;
      } else {
        i = 1;
      } 
      tp.c(layoutParams, i);
    } 
  }
  
  public static boolean r0(File paramFile) {
    return (paramFile != null && paramFile.isFile());
  }
  
  public static void v0() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MostPlayedActivity.k0 : Ljava/lang/Object;
    //   3: astore_0
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: invokevirtual notifyAll : ()V
    //   10: goto -> 18
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual printStackTrace : ()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   6	10	13	finally
    //   14	18	21	finally
    //   18	20	21	finally
    //   22	24	21	finally
  }
  
  public final void K(int paramInt) {
    Bundle bundle = this.h0;
    if (paramInt == 0) {
      paramInt = 0;
    } else {
      paramInt = 1;
    } 
    bundle.putInt("ltm", paramInt);
    u0();
  }
  
  public void onClick(View paramView) {
    ss0 ss01;
    int i = paramView.getId();
    if (i == 2131296381) {
      finish();
      return;
    } 
    boolean bool = false;
    int j = 2;
    if (i == 2131296898) {
      ms0 ms0 = new ms0((Context)this);
      ms0.i(new CharSequence[] { getString(2131887272), getString(2131886538) });
      ms0.j((os0)new f(21, this));
      ms0.p();
      return;
    } 
    if (i == 2131296904) {
      w0(true);
      return;
    } 
    if (i == 2131296453) {
      ss01 = (new cr0(this, this.h0, new zx0(this, 1), this.Z)).b;
      q0(ss01.getWindow());
      ss01.show();
      return;
    } 
    if (ss01 == (MaterialButton)this.g0.c) {
      Integer integer = Integer.valueOf(5);
      int k = ((Slider)this.g0.i).k;
      PopupMenu popupMenu = new PopupMenu((Context)this, (View)this.g0.c);
      if (k == 0) {
        List list = this.c0;
        if (list != null) {
          i = list.size();
        } else {
          i = 0;
        } 
        list = this.f0;
        if (list != null) {
          m = list.size();
        } else {
          m = 0;
        } 
        int n = Math.min(m, 5);
        if (i > 5) {
          m = Math.min(this.h0.getInt("mnsg", 10), i);
          popupMenu.getMenu().add(0, 105, 0, getResources().getQuantityString(2131755061, 5, new Object[] { integer }));
          popupMenu.getMenu().add(0, i + 100, 1, getResources().getQuantityString(2131755061, i, new Object[] { Integer.valueOf(i) }));
          popupMenu.getMenu().setGroupCheckable(0, true, true);
          popupMenu.getMenu().findItem(m + 100).setChecked(true);
          i = j;
          if (Build.VERSION.SDK_INT >= 28) {
            popupMenu.getMenu().setGroupDividerEnabled(true);
            i = j;
          } 
        } else {
          i = 0;
        } 
        j = Math.min(this.h0.getInt("mnarws", 3), n);
        int m = bool;
        while (m <= n) {
          popupMenu.getMenu().add(1, m + 200, i, getResources().getQuantityString(2131755040, m, new Object[] { Integer.valueOf(m) }));
          m++;
          i++;
        } 
        popupMenu.getMenu().setGroupCheckable(1, true, true);
        popupMenu.getMenu().findItem(j + 200).setChecked(true);
      } else if (k == 1) {
        List list = this.f0;
        if (list != null) {
          i = list.size();
        } else {
          i = 0;
        } 
        int m = Math.min(this.h0.getInt("mnarwos", 10), i);
        popupMenu.getMenu().add(1, 205, 0, getResources().getQuantityString(2131755040, 5, new Object[] { integer }));
        popupMenu.getMenu().add(1, i + 200, 1, getResources().getQuantityString(2131755040, i, new Object[] { Integer.valueOf(i) }));
        popupMenu.getMenu().setGroupCheckable(1, true, true);
        popupMenu.getMenu().findItem(m + 200).setChecked(true);
      } 
      popupMenu.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)new ay0(this, k));
      popupMenu.show();
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    m92.t(this);
    getTheme().applyStyle(2131953009, true);
    super.onCreate(paramBundle);
    if (!MyApplication.k()) {
      finish();
      return;
    } 
    LayoutInflater layoutInflater = LayoutInflater.from((Context)this);
    Bundle bundle = null;
    Object object = layoutInflater.inflate(2131492904, null, false);
    int i = 2131296381;
    MaterialButton materialButton = (MaterialButton)ws2.C((View)object, 2131296381);
    if (materialButton != null) {
      i = 2131296417;
      MaterialButton materialButton1 = (MaterialButton)ws2.C((View)object, 2131296417);
      if (materialButton1 != null) {
        i = 2131296453;
        MaterialButton materialButton2 = (MaterialButton)ws2.C((View)object, 2131296453);
        if (materialButton2 != null) {
          i = 2131296578;
          if ((ConstraintLayout)ws2.C((View)object, 2131296578) != null) {
            i = 2131296733;
            FrameLayout frameLayout = (FrameLayout)ws2.C((View)object, 2131296733);
            if (frameLayout != null) {
              i = 2131296898;
              MaterialButton materialButton3 = (MaterialButton)ws2.C((View)object, 2131296898);
              if (materialButton3 != null) {
                i = 2131296904;
                MaterialButton materialButton4 = (MaterialButton)ws2.C((View)object, 2131296904);
                if (materialButton4 != null) {
                  i = 2131297482;
                  Slider slider = (Slider)ws2.C((View)object, 2131297482);
                  if (slider != null) {
                    FrameLayout frameLayout1 = (FrameLayout)object;
                    object = new Object();
                    ((rv1)object).b = materialButton;
                    ((rv1)object).c = materialButton1;
                    ((rv1)object).e = materialButton2;
                    ((rv1)object).f = frameLayout;
                    ((rv1)object).g = materialButton3;
                    ((rv1)object).h = materialButton4;
                    ((rv1)object).i = slider;
                    this.g0 = (rv1)object;
                    setContentView((View)frameLayout1);
                    rv1 rv11 = this.g0;
                    this.T = (FrameLayout)rv11.f;
                    ((MaterialButton)rv11.b).setOnClickListener(this);
                    ((MaterialButton)this.g0.g).setOnClickListener(this);
                    ((MaterialButton)this.g0.h).setOnClickListener(this);
                    ((MaterialButton)this.g0.e).setOnClickListener(this);
                    ((MaterialButton)this.g0.c).setOnClickListener(this);
                    ms0 ms0 = new ms0((Context)this);
                    ms0.J = false;
                    ms0.K = false;
                    ms0.c(2131887105);
                    ms0.o(0, true);
                    ms0.t0 = false;
                    ss0 ss01 = new ss0(ms0);
                    this.S = ss01;
                    q0(ss01.getWindow());
                    String str2 = getIntent().getStringExtra("pcs");
                    this.X = str2;
                    if (str2 == null) {
                      finish();
                      return;
                    } 
                    str2 = l51.d(str2, false, true, false);
                    this.Y = str2;
                    if (str2 == null) {
                      finish();
                      return;
                    } 
                    if (str2.equals(MyApplication.j.c.L)) {
                      SharedPreferences.Editor editor = MyApplication.x().edit();
                      StringBuilder stringBuilder = new StringBuilder("s_b_mpssn_");
                      stringBuilder.append(this.Y);
                      editor.putBoolean(stringBuilder.toString(), true).apply();
                      try {
                        MusicActivity.R0.d0.D0();
                      } finally {}
                    } 
                    if (paramBundle != null)
                      bundle = paramBundle.getBundle("pfb"); 
                    str2 = jLnXOLx.flyCNHNwTNxf;
                    paramBundle = bundle;
                    if (bundle == null) {
                      bundle = getIntent().getBundleExtra("pfb");
                      paramBundle = bundle;
                      if (bundle != null) {
                        bundle.getInt("ltm", 0);
                        bundle.putInt("mnsg", 10);
                        bundle.putInt(str2, 3);
                        bundle.putInt("mnarwos", 10);
                        paramBundle = bundle;
                      } 
                    } 
                    if (paramBundle == null) {
                      paramBundle = new Bundle();
                      paramBundle.putInt("ltm", 0);
                      paramBundle.putInt("mnsg", 10);
                      paramBundle.putInt(str2, 3);
                      paramBundle.putInt("mnarwos", 10);
                    } 
                    this.h0 = paramBundle;
                    u51 u51 = new u51(Integer.valueOf(Color.parseColor("#65ffa0")), Integer.valueOf(Color.parseColor("#00210d")));
                    ArrayList<u51> arrayList = this.Z;
                    arrayList.add(u51);
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#00210d")), Integer.valueOf(Color.parseColor("#65ffa0"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#e8e870")), Integer.valueOf(Color.parseColor("#494900"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#1d1b16")), Integer.valueOf(Color.parseColor("#f2d100"))));
                    i = Color.parseColor("#ffd9de");
                    String str1 = ybWnIKHovcRr.LcNKeVjetSCB;
                    arrayList.add(new u51(Integer.valueOf(i), Integer.valueOf(Color.parseColor(str1))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor(str1)), Integer.valueOf(Color.parseColor("#ffd9de"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#cae6ff")), Integer.valueOf(Color.parseColor("#004b70"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#004b70")), Integer.valueOf(Color.parseColor("#cae6ff"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#e0e3e1")), Integer.valueOf(Color.parseColor("#005048"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#005048")), Integer.valueOf(Color.parseColor("#e0e3e1"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#1b1c18")), Integer.valueOf(Color.parseColor("#ffdf9c"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#ffdf9c")), Integer.valueOf(Color.parseColor("#1b1c18"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#fffbff")), Integer.valueOf(Color.parseColor("#ba1a1a"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#930009")), Integer.valueOf(Color.parseColor("#ffdad5"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#a2f94f")), Integer.valueOf(Color.parseColor("#1b1c18"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#1b1c18")), Integer.valueOf(Color.parseColor("#88dc33"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#fffbff")), Integer.valueOf(Color.parseColor("#ef6f00"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#201b17")), Integer.valueOf(Color.parseColor("#ff9b00"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#fbfcff")), Integer.valueOf(Color.parseColor("#00668a"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#191c1e")), Integer.valueOf(Color.parseColor("#00b4f2"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#fffbff")), Integer.valueOf(Color.parseColor("#9d00c7"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#1e1b1e")), Integer.valueOf(Color.parseColor("#f1afff"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#ffffff")), Integer.valueOf(Color.parseColor("#000000"))));
                    arrayList.add(new u51(Integer.valueOf(Color.parseColor("#000000")), Integer.valueOf(Color.parseColor("#f5f5f5"))));
                    t0();
                    q0(getWindow());
                    return;
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(object.getResources().getResourceName(i)));
  }
  
  public final void onDestroy() {
    ki ki1 = this.R;
    if (ki1 != null) {
      ki1.a(true);
      this.R = null;
    } 
    for (File file : this.V) {
      if (file != null)
        try {
          file.delete();
        } finally {
          file = null;
        }  
    } 
    super.onDestroy();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBundle("pfb", this.h0);
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    if (this.j0 != paramBoolean) {
      if (paramBoolean)
        try {
          q0(getWindow());
        } finally {
          Exception exception;
        }  
      this.j0 = paramBoolean;
    } 
  }
  
  public final void s0(int paramInt1, View paramView, ColorDrawable paramColorDrawable, int paramInt2, int paramInt3, long paramLong, List<km0> paramList1, List paramList2, List<Bitmap> paramList3, List<u51> paramList4, int paramInt4) {
    int i = paramInt3;
    try {
      if (paramView.getParent() == null || paramView.getWidth() == 0) {
        v0();
        return;
      } 
      sn sn = sn.a(paramView);
      ((ImageView)paramView.findViewById(2131296457)).setImageDrawable((Drawable)paramColorDrawable);
      ((ImageView)paramView.findViewById(2131296820)).setColorFilter(paramInt2);
      ((TextView)paramView.findViewById(2131297620)).setTextColor(paramInt2);
      TextView textView = (TextView)paramView.findViewById(2131297623);
      textView.setTextColor(paramInt2);
      str2 = MyApplication.i.getApplicationContext().getString(2131886842);
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append(str2);
      stringBuilder1.append(" <small>✶</small> ");
      stringBuilder1.append(this.Y);
      textView.setText((CharSequence)Html.fromHtml(stringBuilder1.toString()));
      k = jn.i(paramInt2, 175);
      j = jn.i(paramInt2, 130);
      m = jn.i(paramInt2, 64);
      MaterialButton materialButton1 = (MaterialButton)paramView.findViewById(2131296496);
      materialButton1.setIconTint(ColorStateList.valueOf(k));
      materialButton1.setTextColor(k);
      materialButton1.setText(ag0.u(1, paramLong).concat("+"));
      materialButton1.setStrokeColor(ColorStateList.valueOf(j));
      linearLayout = (LinearLayout)paramView.findViewById(2131296974);
      linearLayout.removeAllViews();
      flexboxLayout = (FlexboxLayout)paramView.findViewById(2131296740);
      for (paramInt3 = 0; paramInt3 < flexboxLayout.getChildCount(); paramInt3++) {
        View view = flexboxLayout.getChildAt(paramInt3);
        if (view != sn.a) {
          flexboxLayout.removeView(view);
          continue;
        } 
      } 
    } finally {}
    if (paramInt1 == 0) {
      if (paramList1 != null && paramList2 != null && paramList3 != null) {
        try {
          bool = Math.min(paramList1.size(), this.h0.getInt("mnsg", 10));
          if (paramInt4 <= 1) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          } 
          for (byte b1 = 0; b1 < bool; b1++) {
            TextView textView;
            String str = ((km0)paramList1.get(b1)).c.e;
            if (bool <= 5) {
              View view = LayoutInflater.from((Context)this).inflate(2131493059, (ViewGroup)linearLayout, false);
              TextView textView1 = (TextView)view.findViewById(2131297872);
              textView1.setText(String.valueOf(b1 + 1));
              textView1.setTextColor(k);
              textView1 = (TextView)view.findViewById(2131297890);
              textView1.setText(ag0.W(paramList1.get(b1)));
              textView1.setTextColor(paramInt2);
              textView1 = (TextView)view.findViewById(2131297692);
              if (!ag0.f0(str)) {
                textView1.setText(str);
                textView1.setTextColor(paramInt2);
              } else {
                textView1.setVisibility(8);
              } 
              textView = (TextView)view.findViewById(2131297824);
              textView.setText(String.valueOf(paramList2.get(b1)));
              textView.setBackgroundColor(paramInt2);
              textView.setTextColor(i);
              ((ImageView)view.findViewById(2131296913)).setImageBitmap(paramList3.get(b1));
              linearLayout.addView(view);
            } else {
              String str4;
              View view = LayoutInflater.from((Context)this).inflate(2131493060, (ViewGroup)linearLayout, false);
              TextView textView2 = (TextView)view.findViewById(2131297872);
              textView2.setText(String.valueOf(b1 + 1));
              textView2.setTextColor(k);
              textView2 = (TextView)view.findViewById(2131297890);
              if (ag0.f0((String)textView)) {
                str4 = "";
              } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                this();
                stringBuilder2.append(" • ");
                stringBuilder2.append(Html.escapeHtml(str4));
                str4 = stringBuilder2.toString();
              } 
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append("<b>");
              stringBuilder1.append(Html.escapeHtml(ag0.W(paramList1.get(b1))));
              stringBuilder1.append("</b>");
              stringBuilder1.append(str4);
              textView2.setText((CharSequence)Html.fromHtml(stringBuilder1.toString()));
              textView2.setTextColor(paramInt2);
              TextView textView1 = (TextView)view.findViewById(2131297824);
              textView1.setText(String.valueOf(paramList2.get(b1)));
              textView1.setBackgroundColor(paramInt2);
              textView1.setTextColor(i);
              ((ImageView)view.findViewById(2131296913)).setImageBitmap(paramList3.get(b1));
              linearLayout.addView(view);
            } 
          } 
        } finally {}
      } else {
        paramInt3 = 0;
      } 
      byte b = 0;
      while (true) {
        bool = paramInt3;
        str3 = str2;
        if (b < paramInt4) {
          u51 u51 = paramList4.get(b);
          MaterialButton materialButton1 = (MaterialButton)LayoutInflater.from((Context)this).inflate(2131492927, (ViewGroup)flexboxLayout, false);
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append(n0.e(((Double)u51.b).doubleValue(), 0));
          stringBuilder1.append("% ");
          stringBuilder1.append((String)u51.a);
          materialButton1.setText(stringBuilder1.toString());
          materialButton1.setTextColor(k);
          materialButton1.setStrokeColor(ColorStateList.valueOf(j));
          k80 k80 = new k80();
          ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams();
          this(-2, -2);
          super(layoutParams);
          k80.b = 1;
          k80.c = 0.0F;
          k80.f = -1;
          k80.g = -1.0F;
          k80.h = -1;
          k80.i = -1;
          k80.j = 16777215;
          k80.k = 16777215;
          k80.e = 0.0F;
          flexboxLayout.addView((View)materialButton1, (ViewGroup.LayoutParams)k80);
          b++;
          continue;
        } 
        break;
      } 
    } else if (paramInt1 == 1) {
      if (paramInt4 < 10) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      } 
      double[] arrayOfDouble = new double[paramInt4];
      double d = 0.0D;
      for (bool = false; bool < paramInt4; bool++) {
        arrayOfDouble[bool] = d;
        d += ((Double)((u51)paramList4.get(bool)).b).doubleValue();
      } 
      for (bool = false; bool < paramInt4; bool = n) {
        u51 u51 = paramList4.get(bool);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this);
        if (paramInt4 <= 5) {
          n = 2131493057;
        } else {
          n = 2131493058;
        } 
        View view = layoutInflater.inflate(n, (ViewGroup)linearLayout, false);
        TextView textView1 = (TextView)view.findViewById(2131297872);
        int n = bool + 1;
        textView1.setText(String.valueOf(n));
        textView1.setTextColor(k);
        textView1 = (TextView)view.findViewById(2131297890);
        textView1.setText((CharSequence)u51.a);
        textView1.setTextColor(paramInt2);
        RangeSlider2 rangeSlider2 = (RangeSlider2)view.findViewById(2131297404);
        Double double_ = (Double)u51.b;
        double d2 = arrayOfDouble[bool];
        double d1 = double_.doubleValue();
        d = 100.0D;
        if (d2 + d1 <= 100.0D) {
          d1 = arrayOfDouble[bool];
          d = d1 + double_.doubleValue();
        } else {
          d1 = 100.0D - double_.doubleValue();
        } 
        rangeSlider2.setValues(new Float[] { Float.valueOf((float)d1), Float.valueOf((float)d) });
        rangeSlider2.setTrackActiveTintList(ColorStateList.valueOf(paramInt2));
        rangeSlider2.setTrackInactiveTintList(ColorStateList.valueOf(m));
        TextView textView2 = (TextView)view.findViewById(2131297824);
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(n0.e(double_.doubleValue(), 1));
        stringBuilder1.append("%");
        textView2.setText(stringBuilder1.toString());
        textView2.setTextColor(paramInt2);
        textView2.setBackgroundColor(0);
        linearLayout.addView(view);
      } 
      bool = paramInt3;
      str3 = str2;
    } else {
      bool = false;
      str3 = str2;
    } 
    pq pq = new pq();
    this();
    String str2;
    String str1;
    String str3;
    boolean bool;
    int j;
    int k;
    int m;
    LinearLayout linearLayout;
    FlexboxLayout flexboxLayout;
    ConstraintLayout constraintLayout = (ConstraintLayout)paramView;
    pq.c(constraintLayout);
    if (bool) {
      (pq.g(2131296740)).d.c0 = 150;
    } else {
      (pq.g(2131296740)).d.c0 = 0;
    } 
    pq.a(constraintLayout);
    MaterialButton materialButton = (MaterialButton)paramView.findViewById(2131296782);
    materialButton.setTextColor(k);
    materialButton.setIconTint(ColorStateList.valueOf(k));
    materialButton.setStrokeColor(ColorStateList.valueOf(j));
    ((MaterialButton)this.g0.h).setBackgroundColor(i);
    ((MaterialButton)this.g0.h).setIconTint(ColorStateList.valueOf(paramInt2));
    ((MaterialButton)this.g0.h).setTextColor(paramInt2);
    ((MaterialButton)this.g0.g).setBackgroundColor(i);
    ((MaterialButton)this.g0.g).setIconTint(ColorStateList.valueOf(paramInt2));
    ((MaterialButton)this.g0.g).setTextColor(paramInt2);
    ((MaterialButton)this.g0.e).setBackgroundColor(i);
    ((MaterialButton)this.g0.e).setIconTint(ColorStateList.valueOf(paramInt2));
    ((MaterialButton)this.g0.e).setTextColor(paramInt2);
    ((MaterialButton)this.g0.c).setBackgroundColor(i);
    ((MaterialButton)this.g0.c).setIconTint(ColorStateList.valueOf(paramInt2));
    ((MaterialButton)this.g0.c).setTextColor(paramInt2);
    ((MaterialButton)this.g0.b).setBackgroundColor(i);
    ((MaterialButton)this.g0.b).setIconTint(ColorStateList.valueOf(paramInt2));
    ((MaterialButton)this.g0.b).setTextColor(paramInt2);
    paramInt3 = i;
    if (jn.d(paramInt2, -16777216) > jn.d(i, -16777216))
      paramInt3 = paramInt2; 
    GradientDrawable gradientDrawable = (GradientDrawable)((Slider)this.g0.i).h.c;
    gradientDrawable.setColor(paramInt3);
    gradientDrawable.setAlpha(Color.alpha(paramInt2));
    gradientDrawable.setBounds(0, 0, (int)(MyApplication.p * 4.0F), 0);
    gradientDrawable = (GradientDrawable)((Slider)this.g0.i).h.e;
    gradientDrawable.setColor(paramInt3);
    gradientDrawable.setAlpha(Color.alpha(j));
    gradientDrawable.setBounds(0, 0, (int)(MyApplication.p * 2.0F), 0);
    if (paramInt1 == 1) {
      StringBuilder stringBuilder1 = new StringBuilder();
      this(" ");
      stringBuilder1.append(getString(2131886211));
      str1 = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    if (paramInt1 == 0) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    } 
    String[] arrayOfString = this.U;
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(str3);
    stringBuilder.append(str1);
    stringBuilder.append(" ");
    stringBuilder.append(this.Y);
    stringBuilder.append(".jpg");
    arrayOfString[paramInt1] = stringBuilder.toString();
    FrameLayout frameLayout = this.T;
    no no = new no();
    this((Activity)this, paramView, paramInt1, 4);
    frameLayout.postDelayed((Runnable)no, 150L);
  }
  
  public final void t0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield R : Lki;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 22
    //   9: aload_1
    //   10: iconst_1
    //   11: invokevirtual a : (Z)V
    //   14: goto -> 22
    //   17: astore_1
    //   18: aload_1
    //   19: invokevirtual printStackTrace : ()V
    //   22: aload_0
    //   23: getfield S : Lss0;
    //   26: invokevirtual show : ()V
    //   29: aload_0
    //   30: getfield V : [Ljava/io/File;
    //   33: astore_1
    //   34: aload_1
    //   35: iconst_0
    //   36: aconst_null
    //   37: aastore
    //   38: aload_1
    //   39: iconst_1
    //   40: aconst_null
    //   41: aastore
    //   42: aload_0
    //   43: getfield U : [Ljava/lang/String;
    //   46: astore_1
    //   47: aload_1
    //   48: iconst_0
    //   49: aconst_null
    //   50: aastore
    //   51: aload_1
    //   52: iconst_1
    //   53: aconst_null
    //   54: aastore
    //   55: aload_0
    //   56: getfield W : [Landroid/graphics/Bitmap;
    //   59: astore_1
    //   60: aload_1
    //   61: iconst_1
    //   62: aconst_null
    //   63: aastore
    //   64: aload_1
    //   65: iconst_0
    //   66: aconst_null
    //   67: aastore
    //   68: aload_0
    //   69: getfield T : Landroid/widget/FrameLayout;
    //   72: invokevirtual removeAllViews : ()V
    //   75: aload_0
    //   76: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   79: ldc_w 2131493034
    //   82: aload_0
    //   83: getfield T : Landroid/widget/FrameLayout;
    //   86: iconst_0
    //   87: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   90: astore_1
    //   91: aload_0
    //   92: getfield T : Landroid/widget/FrameLayout;
    //   95: aload_1
    //   96: invokevirtual addView : (Landroid/view/View;)V
    //   99: aload_1
    //   100: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   103: astore_2
    //   104: new by0
    //   107: astore_3
    //   108: aload_3
    //   109: aload_0
    //   110: aload_1
    //   111: invokespecial <init> : (Lin/krosbits/musicolet/MostPlayedActivity;Landroid/view/View;)V
    //   114: aload_2
    //   115: aload_3
    //   116: invokevirtual addOnGlobalLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   119: goto -> 131
    //   122: astore_1
    //   123: aload_1
    //   124: invokevirtual printStackTrace : ()V
    //   127: aload_0
    //   128: invokespecial finish : ()V
    //   131: return
    // Exception table:
    //   from	to	target	type
    //   0	5	17	finally
    //   9	14	17	finally
    //   18	22	122	finally
    //   22	34	122	finally
    //   42	47	122	finally
    //   55	60	122	finally
    //   68	119	122	finally
  }
  
  public final void u0() {
    int i;
    byte b1;
    List list = this.c0;
    byte b2 = 0;
    if (list != null) {
      i = list.size();
    } else {
      i = 0;
    } 
    list = this.f0;
    if (list != null) {
      b1 = list.size();
    } else {
      b1 = 0;
    } 
    int j = ((Slider)this.g0.i).k;
    Bundle bundle = this.h0;
    if (j == 0) {
      if (i > 5) {
        i = Math.min(bundle.getInt("mnsg", 10), i);
        b1 = b2;
      } else {
        i = Math.min(bundle.getInt("mnarws", 3), b1);
        b1 = b2;
      } 
    } else {
      i = Math.min(bundle.getInt("mnarwos", 10), b1);
      if (b1 > 5) {
        b1 = b2;
      } else {
        b1 = 8;
      } 
    } 
    ((MaterialButton)this.g0.c).setVisibility(b1);
    ((MaterialButton)this.g0.c).setText(String.valueOf(i));
    ((MaterialButton)this.g0.g).setEnabled(true);
    ((MaterialButton)this.g0.g).setText(2131887265);
    ((MaterialButton)this.g0.g).setIconResource(2131231384);
  }
  
  public final void w0(boolean paramBoolean) {
    this.S.show();
    ki ki1 = this.R;
    if (ki1 != null && ki1.isAlive())
      return; 
    dy0 dy0 = new dy0(this, ((Slider)this.g0.i).k, paramBoolean);
    this.R = (ki)dy0;
    dy0.start();
  }
  
  public final void x0(Bitmap paramBitmap, int paramInt) {
    try {
      ki ki2 = this.R;
      if (ki2 == null || ki2.b)
        return; 
      File file = new File();
      this(getCacheDir(), this.U[paramInt]);
      file.deleteOnExit();
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
      fileOutputStream.flush();
      fileOutputStream.close();
      paramBitmap.recycle();
      ki ki1 = this.R;
      return;
    } finally {
      paramBitmap = null;
      paramBitmap.printStackTrace();
      finish();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MostPlayedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */