package in.krosbits.musicolet;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.insets.ProtectionLayout;
import androidx.core.view.insets.UWhd.GEkLxj;
import androidx.core.widget.NestedScrollView;
import b41;
import com.google.android.gms.common.annotation.zQ.PVdqHjWVkmL;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import ds1;
import ig;
import j52;
import java.util.ArrayList;
import java.util.List;
import l3;
import l90;
import ms0;
import pc;
import qo;
import rs0;
import ss1;
import u5;
import ws1;
import x5;

public class WidgetPrefActivity extends pc implements CompoundButton.OnCheckedChangeListener, View.OnTouchListener, View.OnClickListener, RadioGroup.OnCheckedChangeListener, u5 {
  public static final l3 O0 = new l3(22);
  
  public ImageView A0;
  
  public ImageView B0;
  
  public ImageView C0;
  
  public TextView D0;
  
  public TextView E0;
  
  public TextView F0;
  
  public ListView G0;
  
  public int H0;
  
  public boolean I0;
  
  public FloatingActionButton J0;
  
  public int K0;
  
  public final l90 L0 = new l90(this, 13);
  
  public j52 M0;
  
  public boolean N0 = false;
  
  public FrameLayout R;
  
  public RadioGroup S;
  
  public RadioButton T;
  
  public RadioButton U;
  
  public TextView V;
  
  public SeekBar W;
  
  public LayoutInflater X;
  
  public CheckBox Y;
  
  public CheckBox Z;
  
  public CheckBox a0;
  
  public CheckBox b0;
  
  public CheckBox c0;
  
  public CheckBox d0;
  
  public CheckBox e0;
  
  public CheckBox f0;
  
  public CheckBox g0;
  
  public CheckBox h0;
  
  public CheckBox i0;
  
  public TabLayout j0;
  
  public LinearLayout k0;
  
  public LinearLayout l0;
  
  public LinearLayout m0;
  
  public AppBarLayout n0;
  
  public ImageView o0;
  
  public ImageView p0;
  
  public NestedScrollView q0;
  
  public CoordinatorLayout r0;
  
  public int s0;
  
  public final ImageView[] t0 = new ImageView[2];
  
  public ImageView u0;
  
  public ImageView v0;
  
  public ImageView w0;
  
  public ImageView x0;
  
  public ImageView y0;
  
  public ImageView z0;
  
  public final void l0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield R : Landroid/widget/FrameLayout;
    //   4: invokevirtual removeAllViews : ()V
    //   7: aload_0
    //   8: getfield j0 : Lcom/google/android/material/tabs/TabLayout;
    //   11: astore #4
    //   13: aload_0
    //   14: aload #4
    //   16: aload #4
    //   18: invokevirtual getSelectedTabPosition : ()I
    //   21: invokevirtual h : (I)Lws1;
    //   24: getfield a : Ljava/lang/String;
    //   27: invokevirtual toString : ()Ljava/lang/String;
    //   30: invokestatic parseInt : (Ljava/lang/String;)I
    //   33: putfield H0 : I
    //   36: goto -> 51
    //   39: astore #4
    //   41: aload #4
    //   43: invokevirtual printStackTrace : ()V
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield H0 : I
    //   51: new android/widget/FrameLayout$LayoutParams
    //   54: dup
    //   55: iconst_m1
    //   56: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   59: ldc_w 72.0
    //   62: fmul
    //   63: f2i
    //   64: invokespecial <init> : (II)V
    //   67: astore #4
    //   69: aload_0
    //   70: getfield H0 : I
    //   73: istore_1
    //   74: iload_1
    //   75: iconst_1
    //   76: if_icmpne -> 108
    //   79: aload_0
    //   80: getfield k0 : Landroid/widget/LinearLayout;
    //   83: iconst_0
    //   84: invokevirtual setVisibility : (I)V
    //   87: aload_0
    //   88: getfield l0 : Landroid/widget/LinearLayout;
    //   91: bipush #8
    //   93: invokevirtual setVisibility : (I)V
    //   96: aload_0
    //   97: getfield m0 : Landroid/widget/LinearLayout;
    //   100: bipush #8
    //   102: invokevirtual setVisibility : (I)V
    //   105: goto -> 223
    //   108: iload_1
    //   109: iconst_2
    //   110: if_icmpne -> 164
    //   113: new android/widget/FrameLayout$LayoutParams
    //   116: dup
    //   117: iconst_m1
    //   118: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   121: ldc_w 72.0
    //   124: fmul
    //   125: f2i
    //   126: invokespecial <init> : (II)V
    //   129: astore #4
    //   131: aload_0
    //   132: getfield k0 : Landroid/widget/LinearLayout;
    //   135: bipush #8
    //   137: invokevirtual setVisibility : (I)V
    //   140: aload_0
    //   141: getfield l0 : Landroid/widget/LinearLayout;
    //   144: iconst_0
    //   145: invokevirtual setVisibility : (I)V
    //   148: aload_0
    //   149: getfield m0 : Landroid/widget/LinearLayout;
    //   152: bipush #8
    //   154: invokevirtual setVisibility : (I)V
    //   157: ldc_w 2131493217
    //   160: istore_1
    //   161: goto -> 227
    //   164: iload_1
    //   165: iconst_3
    //   166: if_icmpne -> 223
    //   169: new android/widget/FrameLayout$LayoutParams
    //   172: dup
    //   173: iconst_m1
    //   174: aload_0
    //   175: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   178: ldc_w 2131166383
    //   181: invokevirtual getDimension : (I)F
    //   184: f2i
    //   185: invokespecial <init> : (II)V
    //   188: astore #4
    //   190: aload_0
    //   191: getfield k0 : Landroid/widget/LinearLayout;
    //   194: bipush #8
    //   196: invokevirtual setVisibility : (I)V
    //   199: aload_0
    //   200: getfield l0 : Landroid/widget/LinearLayout;
    //   203: bipush #8
    //   205: invokevirtual setVisibility : (I)V
    //   208: aload_0
    //   209: getfield m0 : Landroid/widget/LinearLayout;
    //   212: iconst_0
    //   213: invokevirtual setVisibility : (I)V
    //   216: ldc_w 2131493218
    //   219: istore_1
    //   220: goto -> 227
    //   223: ldc_w 2131493216
    //   226: istore_1
    //   227: aload_0
    //   228: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   231: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   234: getfield screenWidthDp : I
    //   237: istore_3
    //   238: iload_3
    //   239: istore_2
    //   240: iload_3
    //   241: sipush #360
    //   244: if_icmple -> 251
    //   247: sipush #360
    //   250: istore_2
    //   251: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   254: iload_2
    //   255: bipush #48
    //   257: isub
    //   258: i2f
    //   259: fmul
    //   260: ldc_w 4.0
    //   263: fdiv
    //   264: f2i
    //   265: istore_2
    //   266: aload_0
    //   267: getfield H0 : I
    //   270: iconst_1
    //   271: if_icmpne -> 285
    //   274: aload #4
    //   276: iload_2
    //   277: iconst_3
    //   278: imul
    //   279: putfield width : I
    //   282: goto -> 293
    //   285: aload #4
    //   287: iload_2
    //   288: iconst_4
    //   289: imul
    //   290: putfield width : I
    //   293: aload #4
    //   295: bipush #17
    //   297: putfield gravity : I
    //   300: aload_0
    //   301: getfield X : Landroid/view/LayoutInflater;
    //   304: iload_1
    //   305: aload_0
    //   306: getfield R : Landroid/widget/FrameLayout;
    //   309: iconst_0
    //   310: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   313: checkcast android/view/ViewGroup
    //   316: astore #5
    //   318: aload #5
    //   320: aload #4
    //   322: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   325: aload_0
    //   326: getfield R : Landroid/widget/FrameLayout;
    //   329: aload #5
    //   331: invokevirtual addView : (Landroid/view/View;)V
    //   334: aload_0
    //   335: getfield R : Landroid/widget/FrameLayout;
    //   338: ldc_w 2131297919
    //   341: invokevirtual findViewById : (I)Landroid/view/View;
    //   344: checkcast android/widget/ImageView
    //   347: astore #4
    //   349: aload_0
    //   350: getfield t0 : [Landroid/widget/ImageView;
    //   353: astore #5
    //   355: aload #5
    //   357: iconst_0
    //   358: aload #4
    //   360: aastore
    //   361: aload #5
    //   363: iconst_1
    //   364: aload_0
    //   365: getfield R : Landroid/widget/FrameLayout;
    //   368: ldc_w 2131297920
    //   371: invokevirtual findViewById : (I)Landroid/view/View;
    //   374: checkcast android/widget/ImageView
    //   377: aastore
    //   378: aload_0
    //   379: aload_0
    //   380: getfield R : Landroid/widget/FrameLayout;
    //   383: ldc_w 2131296913
    //   386: invokevirtual findViewById : (I)Landroid/view/View;
    //   389: checkcast android/widget/ImageView
    //   392: putfield u0 : Landroid/widget/ImageView;
    //   395: aload_0
    //   396: aload_0
    //   397: getfield R : Landroid/widget/FrameLayout;
    //   400: ldc_w 2131296879
    //   403: invokevirtual findViewById : (I)Landroid/view/View;
    //   406: checkcast android/widget/ImageView
    //   409: putfield z0 : Landroid/widget/ImageView;
    //   412: aload_0
    //   413: aload_0
    //   414: getfield R : Landroid/widget/FrameLayout;
    //   417: ldc_w 2131296880
    //   420: invokevirtual findViewById : (I)Landroid/view/View;
    //   423: checkcast android/widget/ImageView
    //   426: putfield C0 : Landroid/widget/ImageView;
    //   429: aload_0
    //   430: aload_0
    //   431: getfield R : Landroid/widget/FrameLayout;
    //   434: ldc_w 2131296859
    //   437: invokevirtual findViewById : (I)Landroid/view/View;
    //   440: checkcast android/widget/ImageView
    //   443: putfield v0 : Landroid/widget/ImageView;
    //   446: aload_0
    //   447: aload_0
    //   448: getfield R : Landroid/widget/FrameLayout;
    //   451: ldc_w 2131296951
    //   454: invokevirtual findViewById : (I)Landroid/view/View;
    //   457: checkcast android/widget/ImageView
    //   460: putfield w0 : Landroid/widget/ImageView;
    //   463: aload_0
    //   464: aload_0
    //   465: getfield R : Landroid/widget/FrameLayout;
    //   468: ldc_w 2131296862
    //   471: invokevirtual findViewById : (I)Landroid/view/View;
    //   474: checkcast android/widget/ImageView
    //   477: putfield y0 : Landroid/widget/ImageView;
    //   480: aload_0
    //   481: aload_0
    //   482: getfield R : Landroid/widget/FrameLayout;
    //   485: ldc_w 2131296897
    //   488: invokevirtual findViewById : (I)Landroid/view/View;
    //   491: checkcast android/widget/ImageView
    //   494: putfield x0 : Landroid/widget/ImageView;
    //   497: aload_0
    //   498: aload_0
    //   499: getfield R : Landroid/widget/FrameLayout;
    //   502: ldc_w 2131296879
    //   505: invokevirtual findViewById : (I)Landroid/view/View;
    //   508: checkcast android/widget/ImageView
    //   511: putfield z0 : Landroid/widget/ImageView;
    //   514: aload_0
    //   515: aload_0
    //   516: getfield R : Landroid/widget/FrameLayout;
    //   519: ldc_w 2131296875
    //   522: invokevirtual findViewById : (I)Landroid/view/View;
    //   525: checkcast android/widget/ImageView
    //   528: putfield A0 : Landroid/widget/ImageView;
    //   531: aload_0
    //   532: aload_0
    //   533: getfield R : Landroid/widget/FrameLayout;
    //   536: ldc_w 2131296884
    //   539: invokevirtual findViewById : (I)Landroid/view/View;
    //   542: checkcast android/widget/ImageView
    //   545: putfield B0 : Landroid/widget/ImageView;
    //   548: aload_0
    //   549: aload_0
    //   550: getfield R : Landroid/widget/FrameLayout;
    //   553: ldc_w 2131297890
    //   556: invokevirtual findViewById : (I)Landroid/view/View;
    //   559: checkcast android/widget/TextView
    //   562: putfield D0 : Landroid/widget/TextView;
    //   565: aload_0
    //   566: aload_0
    //   567: getfield R : Landroid/widget/FrameLayout;
    //   570: ldc_w 2131297692
    //   573: invokevirtual findViewById : (I)Landroid/view/View;
    //   576: checkcast android/widget/TextView
    //   579: putfield E0 : Landroid/widget/TextView;
    //   582: aload_0
    //   583: aload_0
    //   584: getfield R : Landroid/widget/FrameLayout;
    //   587: ldc_w 2131297839
    //   590: invokevirtual findViewById : (I)Landroid/view/View;
    //   593: checkcast android/widget/TextView
    //   596: putfield F0 : Landroid/widget/TextView;
    //   599: aload_0
    //   600: aload_0
    //   601: getfield R : Landroid/widget/FrameLayout;
    //   604: ldc_w 2131297047
    //   607: invokevirtual findViewById : (I)Landroid/view/View;
    //   610: checkcast android/widget/ListView
    //   613: putfield G0 : Landroid/widget/ListView;
    //   616: aload_0
    //   617: invokestatic o : ()Landroid/content/SharedPreferences;
    //   620: ldc_w 'I_WIDTRS'
    //   623: bipush #100
    //   625: invokeinterface getInt : (Ljava/lang/String;I)I
    //   630: invokevirtual p0 : (I)V
    //   633: invokestatic y : ()Lkm0;
    //   636: astore #5
    //   638: aload_0
    //   639: new j52
    //   642: dup
    //   643: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   646: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   649: aload #5
    //   651: iconst_0
    //   652: invokespecial <init> : (Landroid/content/Context;Lkm0;Z)V
    //   655: putfield M0 : Lj52;
    //   658: aload_0
    //   659: getfield D0 : Landroid/widget/TextView;
    //   662: astore #6
    //   664: aload #6
    //   666: ifnull -> 703
    //   669: aload #5
    //   671: ifnull -> 687
    //   674: aload #5
    //   676: getfield c : Lqn1;
    //   679: getfield b : Ljava/lang/String;
    //   682: astore #4
    //   684: goto -> 696
    //   687: aload_0
    //   688: ldc_w 2131887508
    //   691: invokevirtual getString : (I)Ljava/lang/String;
    //   694: astore #4
    //   696: aload #6
    //   698: aload #4
    //   700: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   703: aload_0
    //   704: getfield E0 : Landroid/widget/TextView;
    //   707: astore #6
    //   709: aload #6
    //   711: ifnull -> 748
    //   714: aload #5
    //   716: ifnull -> 732
    //   719: aload #5
    //   721: getfield c : Lqn1;
    //   724: getfield e : Ljava/lang/String;
    //   727: astore #4
    //   729: goto -> 741
    //   732: aload_0
    //   733: ldc_w 2131886205
    //   736: invokevirtual getString : (I)Ljava/lang/String;
    //   739: astore #4
    //   741: aload #6
    //   743: aload #4
    //   745: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   748: aload_0
    //   749: getfield F0 : Landroid/widget/TextView;
    //   752: astore #4
    //   754: aload #4
    //   756: ifnull -> 789
    //   759: aload #4
    //   761: aload_0
    //   762: ldc_w 2131886418
    //   765: iconst_2
    //   766: anewarray java/lang/Object
    //   769: dup
    //   770: iconst_0
    //   771: iconst_2
    //   772: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   775: aastore
    //   776: dup
    //   777: iconst_1
    //   778: iconst_4
    //   779: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   782: aastore
    //   783: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   786: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   789: aload_0
    //   790: getfield G0 : Landroid/widget/ListView;
    //   793: astore #4
    //   795: aload #4
    //   797: ifnull -> 815
    //   800: aload #4
    //   802: new l52
    //   805: dup
    //   806: aload_0
    //   807: aload #5
    //   809: invokespecial <init> : (Lin/krosbits/musicolet/WidgetPrefActivity;Lkm0;)V
    //   812: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   815: new java/lang/Thread
    //   818: dup
    //   819: new xt0
    //   822: dup
    //   823: bipush #27
    //   825: aload_0
    //   826: invokespecial <init> : (ILjava/lang/Object;)V
    //   829: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   832: invokevirtual start : ()V
    //   835: aload_0
    //   836: invokevirtual o0 : ()V
    //   839: return
    // Exception table:
    //   from	to	target	type
    //   7	36	39	finally
  }
  
  public final void m0() {
    if (this.s0 != 0) {
      if (!MyApplication.x().getBoolean("s_wsts", false)) {
        n0();
        return;
      } 
      Intent intent = new Intent();
      intent.putExtra("appWidgetId", this.K0);
      setResult(-1, intent);
      finish();
      return;
    } 
    finish();
  }
  
  public final void n0() {
    this.r0.setVisibility(8);
    this.I0 = true;
    StringBuilder stringBuilder = new StringBuilder("<b>");
    stringBuilder.append(getString(2131886347));
    stringBuilder.append("</b><br/>");
    stringBuilder = new StringBuilder(stringBuilder.toString());
    stringBuilder.append(getString(2131886189));
    stringBuilder.append(" › ");
    stringBuilder.append(getString(2131887354));
    stringBuilder.append(" › ");
    stringBuilder.append(getString(2131886669));
    String str = stringBuilder.toString();
    ms0 ms0 = new ms0((Context)this);
    ms0.d((CharSequence)Html.fromHtml(str));
    ms0.n(2131886639);
    ms0.X = (DialogInterface.OnCancelListener)new ig(this, 2);
    ms0.A = (rs0)new ds1(7, this);
    ms0.p();
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    paramInt = Math.abs(paramInt);
    paramInt = (int)((paramAppBarLayout.getTotalScrollRange() - paramInt) / paramAppBarLayout.getTotalScrollRange() * 255.0F);
    this.o0.setImageAlpha(255 - paramInt);
    this.p0.setImageAlpha(paramInt);
    paramAppBarLayout.getTotalScrollRange();
  }
  
  public final void o0() {
    int i = this.H0;
    if (i == 1) {
      boolean bool = MyApplication.o().getBoolean("k_b_w31saa", true);
      ImageView imageView = this.u0;
      if (bool) {
        imageView.setVisibility(0);
        this.C0.setVisibility(0);
      } else {
        imageView.setVisibility(8);
        this.C0.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w31sfv", true);
      imageView = this.v0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w31sadpl", true);
      imageView = this.w0;
      if (bool) {
        imageView.setVisibility(0);
        return;
      } 
      imageView.setVisibility(8);
      return;
    } 
    if (i == 2) {
      boolean bool = MyApplication.o().getBoolean("k_b_w41saa", true);
      ImageView imageView = this.u0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w41sfv", true);
      imageView = this.v0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w41sadpl", true);
      imageView = this.w0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w41sffrw", true);
      imageView = this.x0;
      if (bool) {
        imageView.setVisibility(0);
        this.y0.setVisibility(0);
        return;
      } 
      imageView.setVisibility(8);
      this.y0.setVisibility(8);
      return;
    } 
    if (i == 3) {
      boolean bool = MyApplication.o().getBoolean("k_b_w43saa", true);
      ImageView imageView = this.u0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w43sfv", true);
      imageView = this.v0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w43sadpl", true);
      imageView = this.w0;
      if (bool) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(8);
      } 
      bool = MyApplication.o().getBoolean("k_b_w43sffrw", true);
      imageView = this.x0;
      if (bool) {
        imageView.setVisibility(0);
        this.y0.setVisibility(0);
        return;
      } 
      imageView.setVisibility(8);
      this.y0.setVisibility(8);
    } 
  }
  
  public final void onBackPressed() {
    m0();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Y : Landroid/widget/CheckBox;
    //   4: astore #7
    //   6: iconst_1
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #4
    //   14: aload_1
    //   15: aload #7
    //   17: if_acmpne -> 48
    //   20: invokestatic o : ()Landroid/content/SharedPreferences;
    //   23: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   28: ldc_w 'k_b_w31saa'
    //   31: iload_2
    //   32: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   37: invokeinterface apply : ()V
    //   42: iconst_0
    //   43: istore #4
    //   45: goto -> 402
    //   48: aload_1
    //   49: aload_0
    //   50: getfield Z : Landroid/widget/CheckBox;
    //   53: if_acmpne -> 81
    //   56: invokestatic o : ()Landroid/content/SharedPreferences;
    //   59: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   64: ldc_w 'k_b_w31sadpl'
    //   67: iload_2
    //   68: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   73: invokeinterface apply : ()V
    //   78: goto -> 42
    //   81: aload_1
    //   82: aload_0
    //   83: getfield a0 : Landroid/widget/CheckBox;
    //   86: if_acmpne -> 114
    //   89: invokestatic o : ()Landroid/content/SharedPreferences;
    //   92: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   97: ldc_w 'k_b_w31sfv'
    //   100: iload_2
    //   101: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   106: invokeinterface apply : ()V
    //   111: goto -> 42
    //   114: aload_1
    //   115: aload_0
    //   116: getfield b0 : Landroid/widget/CheckBox;
    //   119: if_acmpne -> 163
    //   122: invokestatic o : ()Landroid/content/SharedPreferences;
    //   125: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   130: ldc_w 'k_b_w41saa'
    //   133: iload_2
    //   134: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   139: invokeinterface apply : ()V
    //   144: iconst_1
    //   145: istore #4
    //   147: iconst_0
    //   148: istore #6
    //   150: iconst_0
    //   151: istore_3
    //   152: iload #4
    //   154: istore #5
    //   156: iload #6
    //   158: istore #4
    //   160: goto -> 402
    //   163: aload_1
    //   164: aload_0
    //   165: getfield c0 : Landroid/widget/CheckBox;
    //   168: if_acmpne -> 196
    //   171: invokestatic o : ()Landroid/content/SharedPreferences;
    //   174: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   179: ldc_w 'k_b_w41sadpl'
    //   182: iload_2
    //   183: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   188: invokeinterface apply : ()V
    //   193: goto -> 144
    //   196: aload_1
    //   197: aload_0
    //   198: getfield d0 : Landroid/widget/CheckBox;
    //   201: if_acmpne -> 229
    //   204: invokestatic o : ()Landroid/content/SharedPreferences;
    //   207: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   212: ldc_w 'k_b_w41sfv'
    //   215: iload_2
    //   216: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   221: invokeinterface apply : ()V
    //   226: goto -> 144
    //   229: aload_1
    //   230: aload_0
    //   231: getfield e0 : Landroid/widget/CheckBox;
    //   234: if_acmpne -> 262
    //   237: invokestatic o : ()Landroid/content/SharedPreferences;
    //   240: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   245: ldc_w 'k_b_w41sffrw'
    //   248: iload_2
    //   249: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   254: invokeinterface apply : ()V
    //   259: goto -> 144
    //   262: aload_1
    //   263: aload_0
    //   264: getfield f0 : Landroid/widget/CheckBox;
    //   267: if_acmpne -> 300
    //   270: invokestatic o : ()Landroid/content/SharedPreferences;
    //   273: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   278: ldc_w 'k_b_w43saa'
    //   281: iload_2
    //   282: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   287: invokeinterface apply : ()V
    //   292: iconst_1
    //   293: istore #4
    //   295: iconst_0
    //   296: istore_3
    //   297: goto -> 402
    //   300: aload_1
    //   301: aload_0
    //   302: getfield g0 : Landroid/widget/CheckBox;
    //   305: if_acmpne -> 333
    //   308: invokestatic o : ()Landroid/content/SharedPreferences;
    //   311: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   316: ldc_w 'k_b_w43sadpl'
    //   319: iload_2
    //   320: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   325: invokeinterface apply : ()V
    //   330: goto -> 292
    //   333: aload_1
    //   334: aload_0
    //   335: getfield h0 : Landroid/widget/CheckBox;
    //   338: if_acmpne -> 366
    //   341: invokestatic o : ()Landroid/content/SharedPreferences;
    //   344: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   349: ldc_w 'k_b_w43sfv'
    //   352: iload_2
    //   353: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   358: invokeinterface apply : ()V
    //   363: goto -> 292
    //   366: aload_1
    //   367: aload_0
    //   368: getfield i0 : Landroid/widget/CheckBox;
    //   371: if_acmpne -> 399
    //   374: invokestatic o : ()Landroid/content/SharedPreferences;
    //   377: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   382: ldc_w 'k_b_w43sffrw'
    //   385: iload_2
    //   386: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   391: invokeinterface apply : ()V
    //   396: goto -> 292
    //   399: goto -> 147
    //   402: aload_0
    //   403: invokevirtual o0 : ()V
    //   406: iload_3
    //   407: ifeq -> 420
    //   410: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   413: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   416: invokestatic R0 : (Landroid/content/Context;)V
    //   419: return
    //   420: iload #5
    //   422: ifeq -> 435
    //   425: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   428: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   431: invokestatic S0 : (Landroid/content/Context;)V
    //   434: return
    //   435: iload #4
    //   437: ifeq -> 449
    //   440: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   443: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   446: invokestatic T0 : (Landroid/content/Context;)V
    //   449: return
    //   450: astore_1
    //   451: aload_1
    //   452: invokevirtual printStackTrace : ()V
    //   455: return
    // Exception table:
    //   from	to	target	type
    //   402	406	450	java/lang/Exception
    //   410	419	450	java/lang/Exception
    //   425	434	450	java/lang/Exception
    //   440	449	450	java/lang/Exception
  }
  
  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_2
    //   3: ldc_w 2131297361
    //   6: if_icmpne -> 14
    //   9: iconst_0
    //   10: istore_2
    //   11: goto -> 162
    //   14: iload_2
    //   15: ldc_w 2131297360
    //   18: if_icmpne -> 26
    //   21: iconst_1
    //   22: istore_2
    //   23: goto -> 162
    //   26: iload_2
    //   27: ldc_w 2131297362
    //   30: if_icmpne -> 84
    //   33: aload_0
    //   34: getfield N0 : Z
    //   37: ifne -> 77
    //   40: iconst_1
    //   41: putstatic in/krosbits/musicolet/Widget4X1.a : Z
    //   44: iconst_1
    //   45: putstatic in/krosbits/musicolet/Widget4X1Adv.a : Z
    //   48: iconst_1
    //   49: putstatic in/krosbits/musicolet/Widget4X3.a : Z
    //   52: getstatic ag0.m : Landroid/os/Handler;
    //   55: astore #4
    //   57: getstatic in/krosbits/musicolet/WidgetPrefActivity.O0 : Ll3;
    //   60: astore_1
    //   61: aload #4
    //   63: aload_1
    //   64: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   67: aload #4
    //   69: aload_1
    //   70: ldc2_w 2000
    //   73: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   76: pop
    //   77: iconst_2
    //   78: istore_2
    //   79: iconst_1
    //   80: istore_3
    //   81: goto -> 162
    //   84: iload_2
    //   85: ldc_w 2131297358
    //   88: if_icmpne -> 96
    //   91: iconst_4
    //   92: istore_2
    //   93: goto -> 162
    //   96: iload_2
    //   97: ldc_w 2131297359
    //   100: if_icmpne -> 21
    //   103: getstatic j52.o : Lj52;
    //   106: astore_1
    //   107: aload_1
    //   108: ifnull -> 156
    //   111: aload_1
    //   112: getfield k : [Z
    //   115: iconst_0
    //   116: iconst_1
    //   117: bastore
    //   118: aload_1
    //   119: getfield l : Lz2;
    //   122: astore #4
    //   124: aload #4
    //   126: ifnull -> 151
    //   129: aload #4
    //   131: iconst_1
    //   132: invokevirtual cancel : (Z)Z
    //   135: pop
    //   136: aload_1
    //   137: aconst_null
    //   138: putfield l : Lz2;
    //   141: goto -> 151
    //   144: astore #4
    //   146: aload #4
    //   148: invokevirtual printStackTrace : ()V
    //   151: aload_1
    //   152: aconst_null
    //   153: putfield h : Landroid/graphics/Bitmap;
    //   156: aconst_null
    //   157: putstatic j52.o : Lj52;
    //   160: iconst_5
    //   161: istore_2
    //   162: aload_0
    //   163: iload_3
    //   164: putfield N0 : Z
    //   167: invokestatic o : ()Landroid/content/SharedPreferences;
    //   170: ldc_w 'I_WIDTRS'
    //   173: bipush #100
    //   175: invokeinterface getInt : (Ljava/lang/String;I)I
    //   180: bipush #90
    //   182: if_icmpge -> 201
    //   185: ldc_w 'I_WIDTRS'
    //   188: bipush #90
    //   190: invokestatic u : (Ljava/lang/String;I)V
    //   193: aload_0
    //   194: getfield W : Landroid/widget/SeekBar;
    //   197: iconst_2
    //   198: invokevirtual setProgress : (I)V
    //   201: invokestatic f : ()V
    //   204: invokestatic o : ()Landroid/content/SharedPreferences;
    //   207: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   212: ldc_w 'k_i_wdth'
    //   215: iload_2
    //   216: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   221: invokeinterface apply : ()V
    //   226: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   229: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   232: invokestatic Q0 : (Landroid/content/Context;)V
    //   235: aload_0
    //   236: invokevirtual l0 : ()V
    //   239: return
    // Exception table:
    //   from	to	target	type
    //   129	141	144	java/lang/Exception
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131296384)
      m0(); 
  }
  
  public final void onCreate(Bundle paramBundle) {
    GEkLxj.xJNCFJgjNtbdxAs.invoke(null, new Object[] { this, paramBundle });
  }
  
  public final void onDestroy() {
    PVdqHjWVkmL.GryUelLocqfQ.invoke(null, new Object[] { this });
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    if (paramBundle.getBoolean("s_wsts", false))
      n0(); 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("s_wsts", this.I0);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    return false;
  }
  
  public final void p0(int paramInt) {
    TextView textView = this.V;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(100 - paramInt);
    stringBuilder.append("%");
    textView.setText(stringBuilder.toString());
    int i = (int)(paramInt / 100.0D * 255.0D);
    paramInt = 0;
    while (true) {
      ImageView[] arrayOfImageView = this.t0;
      if (paramInt < arrayOfImageView.length) {
        ImageView imageView = arrayOfImageView[paramInt];
        if (imageView != null)
          imageView.setImageAlpha(i); 
        paramInt++;
        continue;
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\WidgetPrefActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */