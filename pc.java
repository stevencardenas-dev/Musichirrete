import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.Locale;

public abstract class pc extends x5 {
  public static vp1 Q;
  
  public boolean D;
  
  public boolean E;
  
  public boolean F;
  
  public boolean G;
  
  public wp1 H;
  
  public z3 I;
  
  public long J;
  
  public CharSequence K;
  
  public int L;
  
  public String[] M;
  
  public final Handler N;
  
  public final e3 O;
  
  public ln1 P;
  
  public pc() {
    ((j01)this.g.e).x("androidx:appcompat", new v5(this));
    T(new w5(this));
    this.D = false;
    this.N = new Handler(Looper.getMainLooper());
    this.O = new e3(2, this);
  }
  
  public void attachBaseContext(Context paramContext) {
    paramContext = z51.A(paramContext);
    Locale locale = (paramContext.getResources().getConfiguration()).locale;
    super.attachBaseContext(paramContext);
    if (!(getResources().getConfiguration()).locale.equals(locale))
      z51.h(getResources(), locale); 
    io1.a(this);
    if (!(getResources().getConfiguration()).locale.equals(locale))
      z51.h(getResources(), locale); 
  }
  
  public final boolean h0() {
    return (this.E && !isFinishing());
  }
  
  public final void i0() {
    if (this.D) {
      recreate();
      return;
    } 
    this.F = true;
  }
  
  public final void j0(String[] paramArrayOfString, CharSequence paramCharSequence, String paramString, int paramInt) {
    PackageManager packageManager1;
    PackageManager packageManager2 = null;
    try {
      packageManager1 = MyApplication.i.getApplicationContext().getPackageManager();
    } finally {
      Exception exception = null;
      paramString = null;
      exception.printStackTrace();
    } 
    ms0 ms0 = new ms0((Context)this);
    ms0.e(2131492968, true);
    View view = ms0.u;
    TextView textView2 = (TextView)view.findViewById(2131297890);
    TextView textView1 = (TextView)view.findViewById(2131297714);
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296398);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296376);
    if (paramCharSequence != null) {
      textView2.setText(paramCharSequence);
      textView2.setVisibility(0);
    } else {
      textView2.setVisibility(8);
    } 
    if (paramString != null) {
      textView1.setText((CharSequence)Html.fromHtml(getString(2131887077, new Object[] { paramString })));
    } else {
      textView1.setText(2131887080);
    } 
    if (paramString != null) {
      materialButton1.setText((CharSequence)Html.fromHtml(getString(2131887600, new Object[] { paramString })));
    } else {
      materialButton1.setText(2131886983);
    } 
    if (packageManager1 != null) {
      materialButton1.setIcon((Drawable)packageManager1);
      materialButton1.setIconSize((int)(MyApplication.p * 24.0F));
    } 
    ss0 ss0 = ms0.p();
    materialButton1.setOnClickListener(new mc(this, paramArrayOfString, paramInt, paramString, ss0));
    materialButton2.setOnClickListener(new nc(ss0, 0));
  }
  
  public final void k0(View paramView, int paramInt1, int paramInt2, int paramInt3, og paramog, kc paramkc) {
    String str1;
    String str2 = paramView.getContext().getString(paramInt1);
    if (paramInt3 != -1) {
      str1 = paramView.getContext().getString(paramInt3);
    } else {
      str1 = null;
    } 
    paramView.getHandler().post(new lc(this, paramView, str2, paramInt2, str1, paramog, paramkc));
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    // Byte code:
    //   0: iload_1
    //   1: bipush #11
    //   3: if_icmpeq -> 856
    //   6: iload_1
    //   7: bipush #12
    //   9: if_icmpne -> 15
    //   12: goto -> 856
    //   15: iload_1
    //   16: bipush #30
    //   18: if_icmpne -> 115
    //   21: iload_2
    //   22: iconst_m1
    //   23: if_icmpne -> 115
    //   26: aload_3
    //   27: ifnull -> 115
    //   30: aload_3
    //   31: invokevirtual getData : ()Landroid/net/Uri;
    //   34: ifnull -> 115
    //   37: getstatic in/krosbits/musicolet/PlaylistActivity.f0 : Lb81;
    //   40: astore #8
    //   42: aload #8
    //   44: ifnull -> 115
    //   47: aload_3
    //   48: invokevirtual getData : ()Landroid/net/Uri;
    //   51: astore #10
    //   53: getstatic ag0.a : Ljava/lang/String;
    //   56: astore #9
    //   58: new android/content/Intent
    //   61: dup
    //   62: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   65: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   68: ldc_w in/krosbits/musicolet/PlaylistActivity
    //   71: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   74: ldc_w 'extslcur'
    //   77: aload #10
    //   79: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   82: ldc_w 'ext'
    //   85: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   88: ldc_w 268435456
    //   91: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   94: astore #9
    //   96: aload #8
    //   98: putstatic in/krosbits/musicolet/PlaylistActivity.f0 : Lb81;
    //   101: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   104: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   107: aload #9
    //   109: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   112: goto -> 890
    //   115: iload_1
    //   116: bipush #110
    //   118: if_icmpne -> 144
    //   121: getstatic ag0.m : Landroid/os/Handler;
    //   124: new jc
    //   127: dup
    //   128: iload_1
    //   129: iload_2
    //   130: aload_3
    //   131: invokespecial <init> : (IILandroid/content/Intent;)V
    //   134: ldc2_w 200
    //   137: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   140: pop
    //   141: goto -> 890
    //   144: iload_1
    //   145: sipush #301
    //   148: if_icmpne -> 205
    //   151: getstatic ag0.a : Ljava/lang/String;
    //   154: astore #8
    //   156: iload_2
    //   157: iconst_m1
    //   158: if_icmpne -> 198
    //   161: aload_3
    //   162: ifnull -> 198
    //   165: aload_3
    //   166: invokevirtual getData : ()Landroid/net/Uri;
    //   169: ifnull -> 198
    //   172: getstatic ag0.b : [Lkm0;
    //   175: astore #8
    //   177: aload #8
    //   179: ifnull -> 198
    //   182: aload_0
    //   183: aload #8
    //   185: aload_3
    //   186: invokevirtual getData : ()Landroid/net/Uri;
    //   189: invokevirtual toString : ()Ljava/lang/String;
    //   192: getstatic ag0.A : I
    //   195: invokestatic b0 : (Landroid/content/Context;[Lkm0;Ljava/lang/String;I)V
    //   198: aconst_null
    //   199: putstatic ag0.b : [Lkm0;
    //   202: goto -> 890
    //   205: iload_1
    //   206: sipush #300
    //   209: if_icmpeq -> 419
    //   212: iload_1
    //   213: sipush #306
    //   216: if_icmpne -> 222
    //   219: goto -> 419
    //   222: iload_1
    //   223: sipush #305
    //   226: if_icmpne -> 261
    //   229: iload_2
    //   230: iconst_m1
    //   231: if_icmpne -> 254
    //   234: getstatic ag0.c : [Lkm0;
    //   237: astore #8
    //   239: aload_0
    //   240: aload #8
    //   242: aload #8
    //   244: arraylength
    //   245: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   248: checkcast [Lkm0;
    //   251: invokestatic k : (Landroid/content/Context;[Lkm0;)V
    //   254: aconst_null
    //   255: putstatic ag0.c : [Lkm0;
    //   258: goto -> 890
    //   261: iload_1
    //   262: sipush #10101
    //   265: if_icmpne -> 325
    //   268: iload_2
    //   269: iconst_m1
    //   270: if_icmpne -> 325
    //   273: aload_3
    //   274: invokevirtual getData : ()Landroid/net/Uri;
    //   277: ifnull -> 325
    //   280: aload_0
    //   281: instanceof in/krosbits/musicolet/MusicActivity
    //   284: istore #7
    //   286: aload_0
    //   287: new android/content/Intent
    //   290: dup
    //   291: aload_0
    //   292: ldc_w in/krosbits/musicolet/RestoreActivity
    //   295: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   298: ldc_w 'fresh'
    //   301: iload #7
    //   303: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   306: ldc_w 'path'
    //   309: aload_3
    //   310: invokevirtual getData : ()Landroid/net/Uri;
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   319: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   322: goto -> 890
    //   325: iload_1
    //   326: sipush #10201
    //   329: if_icmpne -> 385
    //   332: iload_2
    //   333: iconst_m1
    //   334: if_icmpne -> 385
    //   337: aload_3
    //   338: ifnull -> 385
    //   341: aload_3
    //   342: invokevirtual getData : ()Landroid/net/Uri;
    //   345: ifnull -> 385
    //   348: aload_0
    //   349: new android/content/Intent
    //   352: dup
    //   353: aload_0
    //   354: ldc_w in/krosbits/musicolet/PlaylistActivity
    //   357: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   360: ldc_w 'imt'
    //   363: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   366: ldc_w 'extpt'
    //   369: aload_3
    //   370: invokevirtual getData : ()Landroid/net/Uri;
    //   373: invokevirtual toString : ()Ljava/lang/String;
    //   376: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   379: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   382: goto -> 890
    //   385: iload_1
    //   386: sipush #10103
    //   389: if_icmpne -> 890
    //   392: invokestatic p : ()Landroid/os/PowerManager;
    //   395: aload_0
    //   396: invokevirtual getPackageName : ()Ljava/lang/String;
    //   399: invokevirtual isIgnoringBatteryOptimizations : (Ljava/lang/String;)Z
    //   402: ifeq -> 890
    //   405: ldc_w 2131886467
    //   408: iconst_1
    //   409: invokestatic O0 : (II)V
    //   412: aload_0
    //   413: invokevirtual recreate : ()V
    //   416: goto -> 890
    //   419: iload_2
    //   420: iconst_m1
    //   421: if_icmpne -> 845
    //   424: getstatic ag0.b : [Lkm0;
    //   427: ifnull -> 845
    //   430: iload_1
    //   431: sipush #300
    //   434: if_icmpne -> 818
    //   437: aload_3
    //   438: ifnull -> 818
    //   441: aload_3
    //   442: invokevirtual getData : ()Landroid/net/Uri;
    //   445: ifnull -> 818
    //   448: aload_3
    //   449: invokevirtual getData : ()Landroid/net/Uri;
    //   452: astore #9
    //   454: aload #9
    //   456: invokevirtual toString : ()Ljava/lang/String;
    //   459: astore #8
    //   461: new java/lang/StringBuilder
    //   464: dup
    //   465: ldc_w 'hm:hpmi>t:'
    //   468: invokespecial <init> : (Ljava/lang/String;)V
    //   471: astore #10
    //   473: aload #10
    //   475: aload #8
    //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   480: pop
    //   481: aload #10
    //   483: invokevirtual toString : ()Ljava/lang/String;
    //   486: invokestatic F : (Ljava/lang/String;)V
    //   489: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   492: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   495: aload #9
    //   497: invokestatic t : (Landroid/content/Context;Landroid/net/Uri;)Lv00;
    //   500: astore #11
    //   502: new java/lang/StringBuilder
    //   505: dup
    //   506: ldc_w 'hm:hpmi>d:'
    //   509: invokespecial <init> : (Ljava/lang/String;)V
    //   512: astore #10
    //   514: aload #10
    //   516: aload #11
    //   518: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   521: pop
    //   522: aload #10
    //   524: invokevirtual toString : ()Ljava/lang/String;
    //   527: invokestatic F : (Ljava/lang/String;)V
    //   530: getstatic android/os/Build$VERSION.SDK_INT : I
    //   533: bipush #30
    //   535: if_icmplt -> 706
    //   538: aload #11
    //   540: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   543: invokevirtual b : ()Ljava/util/ArrayList;
    //   546: invokestatic q : (Lv00;Ljava/util/ArrayList;)Lv00;
    //   549: ifnonnull -> 706
    //   552: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   555: invokevirtual b : ()Ljava/util/ArrayList;
    //   558: astore #12
    //   560: new java/util/ArrayList
    //   563: dup
    //   564: invokespecial <init> : ()V
    //   567: astore #10
    //   569: aload #12
    //   571: invokevirtual size : ()I
    //   574: istore #6
    //   576: iconst_0
    //   577: istore #4
    //   579: iload #4
    //   581: iload #6
    //   583: if_icmpge -> 637
    //   586: aload #12
    //   588: iload #4
    //   590: invokevirtual get : (I)Ljava/lang/Object;
    //   593: astore #13
    //   595: iload #4
    //   597: iconst_1
    //   598: iadd
    //   599: istore #5
    //   601: aload #13
    //   603: checkcast v00
    //   606: astore #13
    //   608: iload #5
    //   610: istore #4
    //   612: aload #13
    //   614: aload #11
    //   616: invokevirtual C : (Lv00;)Z
    //   619: ifeq -> 579
    //   622: aload #10
    //   624: aload #13
    //   626: invokevirtual add : (Ljava/lang/Object;)Z
    //   629: pop
    //   630: iload #5
    //   632: istore #4
    //   634: goto -> 579
    //   637: aload #10
    //   639: invokevirtual isEmpty : ()Z
    //   642: ifne -> 698
    //   645: aload #10
    //   647: invokevirtual size : ()I
    //   650: istore #5
    //   652: iconst_0
    //   653: istore #4
    //   655: iload #4
    //   657: iload #5
    //   659: if_icmpge -> 698
    //   662: aload #10
    //   664: iload #4
    //   666: invokevirtual get : (I)Ljava/lang/Object;
    //   669: astore #11
    //   671: iinc #4, 1
    //   674: aload #11
    //   676: checkcast v00
    //   679: astore #11
    //   681: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   684: aload #11
    //   686: checkcast ww1
    //   689: invokevirtual J : ()Landroid/net/Uri;
    //   692: invokevirtual e : (Landroid/net/Uri;)V
    //   695: goto -> 655
    //   698: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   701: aload #9
    //   703: invokevirtual a : (Landroid/net/Uri;)V
    //   706: getstatic ag0.b : [Lkm0;
    //   709: astore #10
    //   711: new java/util/ArrayList
    //   714: dup
    //   715: invokespecial <init> : ()V
    //   718: astore #11
    //   720: aload #10
    //   722: arraylength
    //   723: istore #5
    //   725: iconst_0
    //   726: istore #4
    //   728: iload #4
    //   730: iload #5
    //   732: if_icmpge -> 773
    //   735: aload #10
    //   737: iload #4
    //   739: aaload
    //   740: invokevirtual d : ()Lv00;
    //   743: astore #9
    //   745: aload #9
    //   747: instanceof lw0
    //   750: ifeq -> 767
    //   753: aload #11
    //   755: aload #9
    //   757: checkcast lw0
    //   760: invokevirtual L : ()Landroid/net/Uri;
    //   763: invokevirtual add : (Ljava/lang/Object;)Z
    //   766: pop
    //   767: iinc #4, 1
    //   770: goto -> 728
    //   773: aload #11
    //   775: invokevirtual isEmpty : ()Z
    //   778: ifeq -> 793
    //   781: aload_0
    //   782: aload #10
    //   784: aload #8
    //   786: iconst_0
    //   787: invokestatic b0 : (Landroid/content/Context;[Lkm0;Ljava/lang/String;I)V
    //   790: goto -> 845
    //   793: getstatic android/os/Build$VERSION.SDK_INT : I
    //   796: bipush #30
    //   798: if_icmplt -> 845
    //   801: aload #8
    //   803: putstatic ag0.a : Ljava/lang/String;
    //   806: aload_0
    //   807: sipush #306
    //   810: aload #11
    //   812: invokestatic k : (Lpc;ILjava/util/ArrayList;)V
    //   815: goto -> 890
    //   818: iload_1
    //   819: sipush #306
    //   822: if_icmpne -> 845
    //   825: getstatic ag0.a : Ljava/lang/String;
    //   828: astore #8
    //   830: aload #8
    //   832: ifnull -> 845
    //   835: aload_0
    //   836: getstatic ag0.b : [Lkm0;
    //   839: aload #8
    //   841: iconst_0
    //   842: invokestatic b0 : (Landroid/content/Context;[Lkm0;Ljava/lang/String;I)V
    //   845: aconst_null
    //   846: putstatic ag0.a : Ljava/lang/String;
    //   849: aconst_null
    //   850: putstatic ag0.b : [Lkm0;
    //   853: goto -> 890
    //   856: aload_0
    //   857: getfield H : Lwp1;
    //   860: astore #8
    //   862: aload #8
    //   864: ifnull -> 878
    //   867: aload #8
    //   869: iload_1
    //   870: iload_2
    //   871: aload_3
    //   872: invokevirtual I0 : (IILandroid/content/Intent;)V
    //   875: goto -> 890
    //   878: aload_3
    //   879: putstatic wp1.F0 : Landroid/content/Intent;
    //   882: iload_1
    //   883: putstatic wp1.H0 : I
    //   886: iload_2
    //   887: putstatic wp1.G0 : I
    //   890: aload_0
    //   891: iload_1
    //   892: iload_2
    //   893: aload_3
    //   894: invokespecial onActivityResult : (IILandroid/content/Intent;)V
    //   897: return
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    z51.A((Context)this);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      try {
        lb0 lb0 = Z();
        ua0 ua0 = lb0.E("sf");
        if (ua0 != null && ua0.Y()) {
          lb lb = new lb();
          this(lb0);
          lb.j(ua0);
          lb.f();
        } 
      } finally {} 
  }
  
  public void onDestroy() {
    if (isFinishing())
      this.E = false; 
    wp1 wp11 = this.H;
    if (wp11 != null) {
      wp11.D0 = null;
      wp11.D0();
      this.H = null;
    } 
    z3 z31 = this.I;
    if (z31 != null) {
      try {
        z31.dismiss();
      } finally {}
      this.I = null;
    } 
    this.N.removeCallbacks(this.O);
    super.onDestroy();
  }
  
  public void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    if (this.G) {
      this.G = false;
      if (this.M != null && this.K != null && this.L > 0 && this.J > 0L)
        runOnUiThread(new e(2, this)); 
    } 
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
    if (paramInt == this.L && paramArrayOfint.length > 0 && paramArrayOfString.length > 0 && paramArrayOfint[0] != 0 && System.currentTimeMillis() - this.J < 900L) {
      if (paramArrayOfString.length == 1 && Build.VERSION.SDK_INT >= 33 && "android.permission.POST_NOTIFICATIONS".equals(paramArrayOfString[0])) {
        startActivity((new Intent("android.settings.APP_NOTIFICATION_SETTINGS")).putExtra("android.provider.extra.APP_PACKAGE", getPackageName()));
      } else {
        ag0.j0((Context)this, getPackageName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(2131887081));
        stringBuilder.append(" › ");
        CharSequence charSequence = this.K;
        if (charSequence == null)
          charSequence = ""; 
        stringBuilder.append(charSequence);
        ag0.P0(1, stringBuilder.toString(), true);
      } 
      this.G = true;
      e3 e31 = this.O;
      this.N.postDelayed(e31, 1000L);
    } 
  }
  
  public void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    Bundle bundle = paramBundle.getBundle("ba_sfarg");
    if (bundle != null) {
      wp1 wp11 = new wp1();
      wp11.x0(bundle);
      wp11.D0 = Q;
      wp11.O0(this, Z());
    } 
    Q = null;
  }
  
  public void onResume() {
    super.onResume();
    if (this.F) {
      this.F = false;
      recreate();
    } 
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    wp1 wp11 = this.H;
    if (wp11 != null) {
      Bundle bundle1 = new Bundle();
      Bundle bundle2 = wp11.i;
      if (bundle2 != null)
        bundle1.putAll(bundle2); 
      xp1 xp1 = wp11.r0;
      if (xp1 != null) {
        bundle1.putString("a_safvu", xp1.e);
        bundle1.putString("a_safrptcr", wp11.s0);
        bundle1.putLong("a_saflrqt", wp11.q0);
        wp11.E0 = true;
      } 
      paramBundle.putBundle("ba_sfarg", bundle1);
      Q = this.H.D0;
    } 
    this.E = true;
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStart() {
    super.onStart();
    MyApplication.s++;
    this.D = true;
    setTaskDescription(new ActivityManager.TaskDescription(null, null, m92.h[0]));
    this.E = false;
  }
  
  public void onStop() {
    super.onStop();
    int i = MyApplication.s - 1;
    MyApplication.s = i;
    if (i == 0)
      MyApplication.f(); 
    try {
      MusicService musicService = MusicService.P0;
    } finally {
      Exception exception = null;
    } 
    this.D = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */