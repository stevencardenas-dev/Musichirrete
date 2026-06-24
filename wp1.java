import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import in.krosbits.musicolet.MyApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public class wp1 extends eh implements DialogInterface.OnShowListener {
  public static Intent F0;
  
  public static int G0;
  
  public static int H0;
  
  public pc A0;
  
  public HashSet B0;
  
  public boolean C0;
  
  public vp1 D0;
  
  public boolean E0 = false;
  
  public long q0;
  
  public xp1 r0;
  
  public String s0;
  
  public File t0;
  
  public RecyclerView u0;
  
  public ArrayList v0;
  
  public dq1 w0;
  
  public View x0;
  
  public TextView y0;
  
  public TextView z0;
  
  public static boolean K0(Context paramContext) {
    try {
      PackageManager packageManager = paramContext.getPackageManager();
      ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.android.documentsui", 0);
      String str = applicationInfo.loadLabel(packageManager).toString();
      if (!applicationInfo.enabled) {
        P0(paramContext, str);
        return true;
      } 
    } finally {
      Exception exception;
    } 
    return false;
  }
  
  public static void P0(Context paramContext, String paramString) {
    try {
      ms0 ms0 = new ms0();
      this(paramContext);
      ms0.d((CharSequence)Html.fromHtml(String.format(ms0.b.getString(2131886495), new Object[] { paramString })));
      ms0.k(2131886278);
      ms0.q = paramContext.getString(2131886494, new Object[] { paramString });
      k91 k91 = new k91();
      this(9);
      ms0.A = k91;
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public final void D0() {
    try {
      this.C0 = true;
      super.D0();
    } finally {
      Exception exception;
    } 
  }
  
  public final Dialog F0(Bundle paramBundle) {
    dh dh = new dh(P(), this.f0);
    if (dh.getContext() != P())
      m92.s(dh.getContext().getTheme()); 
    dh.setOnShowListener(this);
    return dh;
  }
  
  public final void I0(int paramInt1, int paramInt2, Intent paramIntent) {
    StringBuilder stringBuilder = new StringBuilder("SF>OAR");
    stringBuilder.append(paramIntent);
    n21.F(stringBuilder.toString());
    xp1 xp11 = this.r0;
    if ((paramInt1 == 11 || paramInt1 == 12) && xp11 != null) {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (paramIntent != null) {
        Uri uri = paramIntent.getData();
        bool1 = bool2;
        if (uri != null) {
          String str1;
          StringBuilder stringBuilder1 = new StringBuilder("SF>OAR: ");
          stringBuilder1.append(uri);
          String str3 = fXMDNeMWaILNVh.tNjcuTJa;
          stringBuilder1.append(str3);
          stringBuilder1.append(xp11);
          stringBuilder1.append(str3);
          stringBuilder1.append(this.s0);
          n21.F(stringBuilder1.toString());
          String str2 = yp1.e;
          Uri uri1 = xp11.b();
          StringBuilder stringBuilder2 = new StringBuilder("reur: ");
          stringBuilder2.append(uri);
          stringBuilder2.append("\ngur: ");
          stringBuilder2.append(uri1);
          n21.F(stringBuilder2.toString());
          bool2 = uri.equals(uri1);
          v00 v00 = v00.q(MyApplication.i.getApplicationContext(), uri.toString());
          StringBuilder stringBuilder3 = new StringBuilder("F>OAR>UDF: ");
          stringBuilder3.append(v00);
          stringBuilder3.append(", id:");
          if (v00 != null) {
            Boolean bool = Boolean.valueOf(v00.k());
          } else {
            str1 = IGBYXeDFmKYajx.wPO;
          } 
          stringBuilder3.append(str1);
          n21.F(stringBuilder3.toString());
          bool1 = bool2;
          if (!bool2) {
            str1 = this.s0;
            bool1 = bool2;
            if (str1 != null) {
              v00 v001 = v00.A(str1);
              StringBuilder stringBuilder4 = new StringBuilder("F>OAR>TCF1: ");
              stringBuilder4.append(v001);
              n21.F(stringBuilder4.toString());
              bool1 = bool2;
              if (v001 != null) {
                bool1 = v001.f();
                stringBuilder4 = new StringBuilder("F>OAR>TCF1>e: ");
                stringBuilder4.append(bool1);
                n21.F(stringBuilder4.toString());
              } 
            } 
          } 
          bool2 = bool1;
          if (!bool1) {
            bool2 = bool1;
            if (xp11.d().a()) {
              bool2 = bool1;
              if (v00.b()) {
                v00 v002 = xp11.d();
                str1 = yp1.h;
                v002 = v002.A(str1);
                v00 v001 = v00.A(str1);
                StringBuilder stringBuilder4 = new StringBuilder("F>OAR>TCF2: ");
                stringBuilder4.append(v002);
                n21.F(stringBuilder4.toString());
                stringBuilder4 = new StringBuilder("F>OAR>TCF2M: ");
                stringBuilder4.append(v001);
                n21.F(stringBuilder4.toString());
                boolean bool4 = v002.f();
                boolean bool3 = v001.f();
                stringBuilder4 = new StringBuilder("F>OAR>TCF2>e:");
                stringBuilder4.append(bool4);
                n21.F(stringBuilder4.toString());
                stringBuilder4 = new StringBuilder("F>OAR>TCF2M>e:");
                stringBuilder4.append(bool3);
                n21.F(stringBuilder4.toString());
                bool2 = bool1;
                if (bool4 == bool3) {
                  if (bool4) {
                    v001.e();
                  } else {
                    v001.p();
                  } 
                  bool1 = v002.f();
                  stringBuilder4 = new StringBuilder("F>OAR>TCF2>e2:");
                  stringBuilder4.append(bool1);
                  n21.F(stringBuilder4.toString());
                  if (bool3 != bool1) {
                    bool2 = true;
                  } else {
                    bool2 = false;
                  } 
                  stringBuilder4 = new StringBuilder("F>OAR>TCF2>s: ");
                  stringBuilder4.append(bool2);
                  n21.F(stringBuilder4.toString());
                  v001.e();
                } 
              } 
            } 
          } 
          if (bool2) {
            str1 = xp11.e;
            String str = ag0.Q(str1);
            MyApplication.v().edit().putString(str, uri.toString()).apply();
            MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(uri, 3);
            StringBuilder stringBuilder4 = new StringBuilder("SF>SPU: ");
            stringBuilder4.append(str);
            stringBuilder4.append(str3);
            stringBuilder4.append(uri);
            n21.F(stringBuilder4.toString());
            MyApplication.F = new yp1();
            n21.F("SF>SPU>smc");
            M0();
            zi1.b();
            HashSet hashSet = this.B0;
            if (hashSet != null) {
              hashSet.remove(str1);
              String[] arrayOfString = (String[])this.B0.toArray((Object[])new String[0]);
              this.i.putStringArray("arg_reqattu", arrayOfString);
              if (this.B0.size() == 0)
                D0(); 
            } 
          } 
          bool1 = bool2;
        } 
      } 
      if (this.t0 != null) {
        n21.F("SF>OAR>DF");
        this.t0.delete();
        this.t0 = null;
      } 
      this.s0 = null;
      if (!bool1) {
        if (paramInt1 == 11)
          ag0.P0(1, MyApplication.i.getApplicationContext().getString(2131887337, new Object[] { xp11.c() }), true); 
        L0(xp11);
      } 
    } 
  }
  
  public final void J0(xp1 paramxp1) {
    StringBuilder stringBuilder = new StringBuilder("SF OCAA: ");
    stringBuilder.append(paramxp1.e);
    stringBuilder.append("-");
    stringBuilder.append(paramxp1.c());
    n21.F(stringBuilder.toString());
    if (!K0(P()))
      L0(paramxp1); 
  }
  
  public final void L0(xp1 paramxp1) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore #5
    //   5: lload #5
    //   7: aload_0
    //   8: getfield q0 : J
    //   11: lsub
    //   12: ldc2_w 1100
    //   15: lcmp
    //   16: ifge -> 25
    //   19: iconst_1
    //   20: istore #4
    //   22: goto -> 28
    //   25: iconst_0
    //   26: istore #4
    //   28: aload_1
    //   29: iload #4
    //   31: invokevirtual a : (Z)Landroid/content/Intent;
    //   34: astore #8
    //   36: aload_1
    //   37: getfield l : Ljava/lang/String;
    //   40: astore #9
    //   42: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   45: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   48: aconst_null
    //   49: invokevirtual getExternalFilesDirs : (Ljava/lang/String;)[Ljava/io/File;
    //   52: astore #10
    //   54: aload #10
    //   56: arraylength
    //   57: istore_3
    //   58: iconst_0
    //   59: istore_2
    //   60: iload_2
    //   61: iload_3
    //   62: if_icmpge -> 93
    //   65: aload #10
    //   67: iload_2
    //   68: aaload
    //   69: astore #7
    //   71: aload #7
    //   73: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   76: aload #9
    //   78: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   81: ifeq -> 87
    //   84: goto -> 96
    //   87: iinc #2, 1
    //   90: goto -> 60
    //   93: aconst_null
    //   94: astore #7
    //   96: aload #7
    //   98: ifnull -> 219
    //   101: new java/io/File
    //   104: astore #10
    //   106: aload #10
    //   108: aload #7
    //   110: invokestatic currentTimeMillis : ()J
    //   113: invokestatic valueOf : (J)Ljava/lang/String;
    //   116: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   119: aload #10
    //   121: invokevirtual createNewFile : ()Z
    //   124: pop
    //   125: aload #10
    //   127: invokevirtual exists : ()Z
    //   130: ifeq -> 219
    //   133: aload #10
    //   135: invokevirtual deleteOnExit : ()V
    //   138: aload_0
    //   139: aload #10
    //   141: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   144: aload #9
    //   146: invokevirtual length : ()I
    //   149: iconst_1
    //   150: iadd
    //   151: invokevirtual substring : (I)Ljava/lang/String;
    //   154: putfield s0 : Ljava/lang/String;
    //   157: aload_0
    //   158: aload #10
    //   160: putfield t0 : Ljava/io/File;
    //   163: new java/lang/StringBuilder
    //   166: astore #7
    //   168: aload #7
    //   170: invokespecial <init> : ()V
    //   173: aload #7
    //   175: ldc_w 'SF>OSTRA>F: '
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #7
    //   184: aload_0
    //   185: getfield t0 : Ljava/io/File;
    //   188: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload #7
    //   194: ldc_w ', '
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload #7
    //   203: aload_0
    //   204: getfield s0 : Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #7
    //   213: invokevirtual toString : ()Ljava/lang/String;
    //   216: invokestatic F : (Ljava/lang/String;)V
    //   219: aload #8
    //   221: iconst_3
    //   222: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   225: pop
    //   226: aload #8
    //   228: bipush #64
    //   230: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   233: pop
    //   234: ldc_w 'android.os.storage.action.OPEN_EXTERNAL_DIRECTORY'
    //   237: aload #8
    //   239: invokevirtual getAction : ()Ljava/lang/String;
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifeq -> 291
    //   248: aload_0
    //   249: lload #5
    //   251: putfield q0 : J
    //   254: aload_0
    //   255: aload_1
    //   256: putfield r0 : Lxp1;
    //   259: aload_0
    //   260: getfield A0 : Lpc;
    //   263: aload #8
    //   265: bipush #12
    //   267: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   270: goto -> 862
    //   273: astore_1
    //   274: aload_1
    //   275: invokevirtual printStackTrace : ()V
    //   278: aload_0
    //   279: invokevirtual P : ()Landroid/content/Context;
    //   282: ldc_w 'Files (or Documents)'
    //   285: invokestatic P0 : (Landroid/content/Context;Ljava/lang/String;)V
    //   288: goto -> 862
    //   291: new ms0
    //   294: dup
    //   295: aload_0
    //   296: invokevirtual P : ()Landroid/content/Context;
    //   299: invokespecial <init> : (Landroid/content/Context;)V
    //   302: astore #11
    //   304: aload_0
    //   305: invokevirtual P : ()Landroid/content/Context;
    //   308: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   311: ldc_w 2131492973
    //   314: aconst_null
    //   315: iconst_0
    //   316: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   319: astore #10
    //   321: aload #10
    //   323: ldc_w 2131297480
    //   326: invokevirtual findViewById : (I)Landroid/view/View;
    //   329: checkcast ss/com/bannerslider/Slider
    //   332: astore #9
    //   334: aload #10
    //   336: ldc_w 2131297876
    //   339: invokevirtual findViewById : (I)Landroid/view/View;
    //   342: checkcast android/widget/TextView
    //   345: astore #7
    //   347: new java/lang/StringBuilder
    //   350: dup
    //   351: ldc_w '1. '
    //   354: invokespecial <init> : (Ljava/lang/String;)V
    //   357: astore #13
    //   359: aload #13
    //   361: aload_0
    //   362: ldc_w 2131887257
    //   365: invokevirtual T : (I)Ljava/lang/String;
    //   368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload #13
    //   374: ldc_w '<br/>2. '
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload_1
    //   382: invokestatic l : (Lxp1;)Ljava/lang/String;
    //   385: astore #12
    //   387: aload_1
    //   388: getfield m : Z
    //   391: istore #4
    //   393: aload #13
    //   395: aload_0
    //   396: ldc_w 2131887258
    //   399: iconst_1
    //   400: anewarray java/lang/Object
    //   403: dup
    //   404: iconst_0
    //   405: aload #12
    //   407: aastore
    //   408: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: pop
    //   415: aload #13
    //   417: ldc_w '<br/>'
    //   420: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: pop
    //   424: getstatic android/os/Build$VERSION.SDK_INT : I
    //   427: istore_2
    //   428: iload_2
    //   429: bipush #29
    //   431: if_icmplt -> 490
    //   434: aload #13
    //   436: ldc_w '3. '
    //   439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: pop
    //   443: aload #13
    //   445: aload_0
    //   446: ldc_w 2131887259
    //   449: invokevirtual T : (I)Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload #13
    //   458: ldc_w '<br/>4. '
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload #13
    //   467: aload_0
    //   468: ldc_w 2131887261
    //   471: invokevirtual T : (I)Ljava/lang/String;
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #13
    //   480: ldc_w '<br/>'
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: goto -> 521
    //   490: aload #13
    //   492: ldc_w '3. '
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload #13
    //   501: aload_0
    //   502: ldc_w 2131887260
    //   505: invokevirtual T : (I)Ljava/lang/String;
    //   508: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: pop
    //   512: aload #13
    //   514: ldc_w '<br/>'
    //   517: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: pop
    //   521: aload #7
    //   523: aload #13
    //   525: invokevirtual toString : ()Ljava/lang/String;
    //   528: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   531: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   534: iload_2
    //   535: bipush #29
    //   537: if_icmplt -> 601
    //   540: iconst_3
    //   541: newarray int
    //   543: astore #7
    //   545: aload_1
    //   546: getfield a : Z
    //   549: ifeq -> 562
    //   552: aload #7
    //   554: iconst_0
    //   555: ldc_w 2131231019
    //   558: iastore
    //   559: goto -> 584
    //   562: iload #4
    //   564: ifeq -> 577
    //   567: aload #7
    //   569: iconst_0
    //   570: ldc_w 2131231017
    //   573: iastore
    //   574: goto -> 584
    //   577: aload #7
    //   579: iconst_0
    //   580: ldc_w 2131231016
    //   583: iastore
    //   584: aload #7
    //   586: iconst_1
    //   587: ldc_w 2131231018
    //   590: iastore
    //   591: aload #7
    //   593: iconst_2
    //   594: ldc_w 2131231015
    //   597: iastore
    //   598: goto -> 663
    //   601: iload_2
    //   602: bipush #26
    //   604: if_icmplt -> 644
    //   607: iconst_2
    //   608: newarray int
    //   610: astore #7
    //   612: iload #4
    //   614: ifeq -> 627
    //   617: aload #7
    //   619: iconst_0
    //   620: ldc_w 2131231017
    //   623: iastore
    //   624: goto -> 634
    //   627: aload #7
    //   629: iconst_0
    //   630: ldc_w 2131231016
    //   633: iastore
    //   634: aload #7
    //   636: iconst_1
    //   637: ldc_w 2131231018
    //   640: iastore
    //   641: goto -> 663
    //   644: iconst_2
    //   645: newarray int
    //   647: astore #7
    //   649: aload #7
    //   651: iconst_0
    //   652: ldc_w 2131231016
    //   655: iastore
    //   656: aload #7
    //   658: iconst_1
    //   659: ldc_w 2131231018
    //   662: iastore
    //   663: aload #9
    //   665: new vf
    //   668: dup
    //   669: iconst_1
    //   670: aload #7
    //   672: invokespecial <init> : (ILjava/lang/Object;)V
    //   675: invokevirtual setAdapter : (Lin1;)V
    //   678: aload_0
    //   679: invokevirtual S : ()Landroid/content/res/Resources;
    //   682: ldc_w 2131231443
    //   685: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   688: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   691: checkcast android/graphics/drawable/GradientDrawable
    //   694: astore #7
    //   696: getstatic m92.h : [I
    //   699: astore #12
    //   701: aload #7
    //   703: aload #12
    //   705: iconst_5
    //   706: iaload
    //   707: ldc_w -16777216
    //   710: ior
    //   711: invokevirtual setColor : (I)V
    //   714: aload #7
    //   716: aload #12
    //   718: iconst_5
    //   719: iaload
    //   720: invokestatic alpha : (I)I
    //   723: invokevirtual setAlpha : (I)V
    //   726: aload #7
    //   728: iconst_0
    //   729: iconst_0
    //   730: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   733: ldc_w 4.0
    //   736: fmul
    //   737: f2i
    //   738: iconst_0
    //   739: invokevirtual setBounds : (IIII)V
    //   742: aload_0
    //   743: invokevirtual S : ()Landroid/content/res/Resources;
    //   746: ldc_w 2131231443
    //   749: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   752: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   755: checkcast android/graphics/drawable/GradientDrawable
    //   758: astore #13
    //   760: aload #13
    //   762: aload #12
    //   764: bipush #6
    //   766: iaload
    //   767: ldc_w -16777216
    //   770: ior
    //   771: invokevirtual setColor : (I)V
    //   774: aload #13
    //   776: aload #12
    //   778: bipush #6
    //   780: iaload
    //   781: invokestatic alpha : (I)I
    //   784: invokevirtual setAlpha : (I)V
    //   787: aload #13
    //   789: iconst_0
    //   790: iconst_0
    //   791: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   794: fconst_2
    //   795: fmul
    //   796: f2i
    //   797: iconst_0
    //   798: invokevirtual setBounds : (IIII)V
    //   801: aload #9
    //   803: aload #7
    //   805: invokevirtual setSelectedSlideIndicator : (Landroid/graphics/drawable/Drawable;)V
    //   808: aload #9
    //   810: aload #13
    //   812: invokevirtual setUnSelectedSlideIndicator : (Landroid/graphics/drawable/Drawable;)V
    //   815: aload #11
    //   817: aload #10
    //   819: iconst_1
    //   820: invokevirtual f : (Landroid/view/View;Z)V
    //   823: aload #11
    //   825: ldc_w 2131886633
    //   828: invokevirtual n : (I)V
    //   831: aload #11
    //   833: ldc 2131886278
    //   835: invokevirtual k : (I)V
    //   838: aload #11
    //   840: new xw
    //   843: dup
    //   844: aload_0
    //   845: aload #8
    //   847: aload_1
    //   848: bipush #10
    //   850: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   853: putfield A : Lrs0;
    //   856: aload #11
    //   858: invokevirtual p : ()Lss0;
    //   861: pop
    //   862: return
    //   863: astore #7
    //   865: goto -> 219
    // Exception table:
    //   from	to	target	type
    //   42	58	863	finally
    //   71	84	863	finally
    //   101	219	863	finally
    //   259	270	273	android/content/ActivityNotFoundException
  }
  
  public final void M0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/os/Bundle;
    //   4: astore #7
    //   6: aload_0
    //   7: aconst_null
    //   8: putfield B0 : Ljava/util/HashSet;
    //   11: iconst_0
    //   12: istore_2
    //   13: aload #7
    //   15: ifnull -> 174
    //   18: aload #7
    //   20: ldc_w 'arg_reqattu'
    //   23: invokevirtual getStringArray : (Ljava/lang/String;)[Ljava/lang/String;
    //   26: astore #10
    //   28: aload #10
    //   30: ifnull -> 174
    //   33: aload_0
    //   34: new java/util/HashSet
    //   37: dup
    //   38: aload #10
    //   40: arraylength
    //   41: invokespecial <init> : (I)V
    //   44: putfield B0 : Ljava/util/HashSet;
    //   47: new java/util/ArrayList
    //   50: dup
    //   51: aload #10
    //   53: arraylength
    //   54: invokespecial <init> : (I)V
    //   57: astore #8
    //   59: aload #10
    //   61: arraylength
    //   62: istore_3
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: iload_3
    //   67: if_icmpge -> 109
    //   70: aload #10
    //   72: iload_1
    //   73: aaload
    //   74: astore #9
    //   76: aload #8
    //   78: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   81: aload #9
    //   83: invokevirtual b : (Ljava/lang/String;)Lxp1;
    //   86: invokestatic l : (Lxp1;)Ljava/lang/String;
    //   89: invokevirtual add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_0
    //   94: getfield B0 : Ljava/util/HashSet;
    //   97: aload #9
    //   99: invokevirtual add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: iinc #1, 1
    //   106: goto -> 65
    //   109: aload #7
    //   111: ldc_w 'arg_reqattpid'
    //   114: ldc_w 2131755023
    //   117: invokevirtual getInt : (Ljava/lang/String;I)I
    //   120: istore_1
    //   121: aload_0
    //   122: invokevirtual S : ()Landroid/content/res/Resources;
    //   125: iload_1
    //   126: aload #8
    //   128: invokevirtual size : ()I
    //   131: invokevirtual getQuantityString : (II)Ljava/lang/String;
    //   134: astore #9
    //   136: aload_0
    //   137: getfield z0 : Landroid/widget/TextView;
    //   140: aload #9
    //   142: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   145: aload_0
    //   146: getfield y0 : Landroid/widget/TextView;
    //   149: ldc_w ', '
    //   152: aload #8
    //   154: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   157: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   160: aload #7
    //   162: ldc_w 'arg_bshmsg'
    //   165: iconst_1
    //   166: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   169: istore #4
    //   171: goto -> 177
    //   174: iconst_0
    //   175: istore #4
    //   177: aload_0
    //   178: getfield z0 : Landroid/widget/TextView;
    //   181: astore #8
    //   183: iload #4
    //   185: ifeq -> 213
    //   188: aload #8
    //   190: iconst_0
    //   191: invokevirtual setVisibility : (I)V
    //   194: aload_0
    //   195: getfield y0 : Landroid/widget/TextView;
    //   198: iconst_0
    //   199: invokevirtual setVisibility : (I)V
    //   202: aload_0
    //   203: getfield x0 : Landroid/view/View;
    //   206: iconst_0
    //   207: invokevirtual setVisibility : (I)V
    //   210: goto -> 238
    //   213: aload #8
    //   215: bipush #8
    //   217: invokevirtual setVisibility : (I)V
    //   220: aload_0
    //   221: getfield y0 : Landroid/widget/TextView;
    //   224: bipush #8
    //   226: invokevirtual setVisibility : (I)V
    //   229: aload_0
    //   230: getfield x0 : Landroid/view/View;
    //   233: bipush #8
    //   235: invokevirtual setVisibility : (I)V
    //   238: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   241: iconst_1
    //   242: invokevirtual m : (Z)Ljava/util/ArrayList;
    //   245: astore #8
    //   247: aload_0
    //   248: aload #8
    //   250: putfield v0 : Ljava/util/ArrayList;
    //   253: aload_0
    //   254: getfield B0 : Ljava/util/HashSet;
    //   257: ifnull -> 274
    //   260: aload #8
    //   262: new es0
    //   265: dup
    //   266: iconst_1
    //   267: aload_0
    //   268: invokespecial <init> : (ILjava/lang/Object;)V
    //   271: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   274: aload_0
    //   275: new dq1
    //   278: dup
    //   279: aload_0
    //   280: aload_0
    //   281: getfield v0 : Ljava/util/ArrayList;
    //   284: aload_0
    //   285: getfield B0 : Ljava/util/HashSet;
    //   288: invokespecial <init> : (Lwp1;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    //   291: putfield w0 : Ldq1;
    //   294: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   297: invokevirtual p : ()Z
    //   300: ifne -> 374
    //   303: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   306: astore #8
    //   308: aload #8
    //   310: getfield a : Z
    //   313: ifeq -> 366
    //   316: aload #8
    //   318: iconst_0
    //   319: putfield a : Z
    //   322: ldc_w 'SF:rl>rqrSS'
    //   325: invokestatic F : (Ljava/lang/String;)V
    //   328: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   331: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   334: astore #9
    //   336: new android/content/Intent
    //   339: astore #8
    //   341: aload #8
    //   343: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   346: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   349: ldc_w in/krosbits/musicolet/MusicService
    //   352: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   355: aload #9
    //   357: aload #8
    //   359: invokevirtual stopService : (Landroid/content/Intent;)Z
    //   362: pop
    //   363: invokestatic A : ()V
    //   366: aload_0
    //   367: getfield w0 : Ldq1;
    //   370: iconst_0
    //   371: putfield g : Z
    //   374: aload_0
    //   375: getfield u0 : Landroidx/recyclerview/widget/RecyclerView;
    //   378: aload_0
    //   379: getfield w0 : Ldq1;
    //   382: invokevirtual setAdapter : (Lid1;)V
    //   385: aload #7
    //   387: ifnull -> 545
    //   390: aload #7
    //   392: ldc_w 'a_safvu'
    //   395: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   398: astore #8
    //   400: aload #8
    //   402: ifnull -> 469
    //   405: aload_0
    //   406: getfield v0 : Ljava/util/ArrayList;
    //   409: astore #9
    //   411: aload #9
    //   413: invokevirtual size : ()I
    //   416: istore_3
    //   417: iload_2
    //   418: istore_1
    //   419: iload_1
    //   420: iload_3
    //   421: if_icmpge -> 461
    //   424: aload #9
    //   426: iload_1
    //   427: invokevirtual get : (I)Ljava/lang/Object;
    //   430: astore #10
    //   432: iinc #1, 1
    //   435: aload #10
    //   437: checkcast xp1
    //   440: astore #10
    //   442: aload #10
    //   444: getfield e : Ljava/lang/String;
    //   447: aload #8
    //   449: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   452: ifeq -> 419
    //   455: aload_0
    //   456: aload #10
    //   458: putfield r0 : Lxp1;
    //   461: aload #7
    //   463: ldc_w 'a_safvu'
    //   466: invokevirtual remove : (Ljava/lang/String;)V
    //   469: aload #7
    //   471: ldc_w 'a_safrptcr'
    //   474: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   477: astore #8
    //   479: aload #8
    //   481: ifnull -> 513
    //   484: aload_0
    //   485: aload #8
    //   487: putfield s0 : Ljava/lang/String;
    //   490: aload_0
    //   491: new java/io/File
    //   494: dup
    //   495: aload_0
    //   496: getfield s0 : Ljava/lang/String;
    //   499: invokespecial <init> : (Ljava/lang/String;)V
    //   502: putfield t0 : Ljava/io/File;
    //   505: aload #7
    //   507: ldc_w 'a_safrptcr'
    //   510: invokevirtual remove : (Ljava/lang/String;)V
    //   513: aload #7
    //   515: ldc_w 'a_saflrqt'
    //   518: lconst_0
    //   519: invokevirtual getLong : (Ljava/lang/String;J)J
    //   522: lstore #5
    //   524: lload #5
    //   526: lconst_0
    //   527: lcmp
    //   528: ifle -> 545
    //   531: aload_0
    //   532: lload #5
    //   534: putfield q0 : J
    //   537: aload #7
    //   539: ldc_w 'a_saflrqt'
    //   542: invokevirtual remove : (Ljava/lang/String;)V
    //   545: return
    //   546: astore #8
    //   548: goto -> 363
    // Exception table:
    //   from	to	target	type
    //   328	363	546	finally
  }
  
  public final void N0(pc parampc) {
    O0(parampc, parampc.Z());
  }
  
  public final void O0(pc parampc, lb0 paramlb0) {
    this.A0 = parampc;
    try {
      wp1 wp11 = parampc.H;
      if (wp11 != null) {
        wp11.D0 = null;
        wp11.D0();
        this.A0.H = null;
      } 
    } finally {}
    H0(paramlb0, "sf");
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    Context context = paramLayoutInflater.getContext();
    if (context != null)
      m92.s(context.getTheme()); 
    View view = paramLayoutInflater.inflate(2131492998, paramViewGroup, false);
    this.u0 = (RecyclerView)view.findViewById(2131297426);
    this.x0 = view.findViewById(2131297922);
    this.y0 = (TextView)view.findViewById(2131297885);
    this.z0 = (TextView)view.findViewById(2131297879);
    this.u0.setLayoutManager((a)new LinearLayoutManager(1));
    M0();
    return view;
  }
  
  public final void o0() {
    super.o0();
    if (this.C0)
      try {
        lb0 lb0 = R();
        lb lb = new lb();
        this(lb0);
        lb.j(this);
        return;
      } finally {
        Exception exception = null;
      }  
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    super.onDismiss(paramDialogInterface);
    vp1 vp11 = this.D0;
    if (vp11 != null)
      try {
        vp11.c(this);
      } finally {} 
    pc pc1 = this.A0;
    if (pc1 != null && pc1.H == this)
      pc1.H = null; 
    this.A0 = null;
    this.r0 = null;
    F0 = null;
    this.s0 = null;
    this.D0 = null;
    if (this.t0 != null && !this.E0) {
      n21.F("SF>OD>DF");
      this.t0.delete();
      this.t0 = null;
    } 
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    try {
      BottomSheetBehavior.B(((dh)paramDialogInterface).findViewById(2131296648)).I(3);
      this.A0.H = this;
      return;
    } finally {
      paramDialogInterface = null;
      paramDialogInterface.printStackTrace();
    } 
  }
  
  public final void v(int paramInt) {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   3: invokevirtual p : ()Z
    //   6: ifne -> 12
    //   9: goto -> 217
    //   12: aload_0
    //   13: getfield v0 : Ljava/util/ArrayList;
    //   16: iload_1
    //   17: invokevirtual get : (I)Ljava/lang/Object;
    //   20: checkcast xp1
    //   23: astore #5
    //   25: aload #5
    //   27: getfield j : I
    //   30: istore_1
    //   31: aload #5
    //   33: getfield k : Ljava/lang/String;
    //   36: astore #6
    //   38: aload #5
    //   40: getfield i : Z
    //   43: istore_2
    //   44: iload_1
    //   45: ifne -> 56
    //   48: ldc_w 2131886645
    //   51: iconst_0
    //   52: invokestatic O0 : (II)V
    //   55: return
    //   56: iload_2
    //   57: ifeq -> 316
    //   60: new java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: astore #4
    //   69: aload #5
    //   71: getfield j : I
    //   74: istore_1
    //   75: iload_1
    //   76: ifne -> 89
    //   79: iconst_0
    //   80: aload #6
    //   82: iconst_1
    //   83: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   86: goto -> 207
    //   89: iload_1
    //   90: iconst_m1
    //   91: if_icmpne -> 149
    //   94: iload_2
    //   95: ifeq -> 139
    //   98: aload_0
    //   99: ldc_w 2131886612
    //   102: invokevirtual T : (I)Ljava/lang/String;
    //   105: astore_3
    //   106: aload #4
    //   108: aload_0
    //   109: ldc_w 2131886753
    //   112: invokevirtual T : (I)Ljava/lang/String;
    //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload #4
    //   121: ldc_w '<br/><br/>'
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #4
    //   130: aload #6
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: goto -> 209
    //   139: iconst_0
    //   140: aload #6
    //   142: iconst_1
    //   143: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   146: goto -> 207
    //   149: iload_1
    //   150: bipush #-2
    //   152: if_icmpne -> 207
    //   155: iload_2
    //   156: ifeq -> 200
    //   159: aload_0
    //   160: ldc_w 2131886612
    //   163: invokevirtual T : (I)Ljava/lang/String;
    //   166: astore_3
    //   167: aload #4
    //   169: aload_0
    //   170: ldc_w 2131886753
    //   173: invokevirtual T : (I)Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload #4
    //   182: ldc_w '<br/><br/>'
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload #4
    //   191: aload #6
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: goto -> 209
    //   200: iconst_0
    //   201: aload #6
    //   203: iconst_1
    //   204: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   207: aconst_null
    //   208: astore_3
    //   209: aload #4
    //   211: invokevirtual length : ()I
    //   214: ifne -> 218
    //   217: return
    //   218: new ms0
    //   221: dup
    //   222: aload_0
    //   223: invokevirtual P : ()Landroid/content/Context;
    //   226: invokespecial <init> : (Landroid/content/Context;)V
    //   229: astore #6
    //   231: aload #6
    //   233: aload_3
    //   234: putfield f : Ljava/lang/CharSequence;
    //   237: aload #6
    //   239: new qi0
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: putfield c : Landroid/text/method/MovementMethod;
    //   249: aload #6
    //   251: aload #4
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   259: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   262: iload_2
    //   263: ifeq -> 301
    //   266: aload #6
    //   268: ldc_w 2131886164
    //   271: invokevirtual n : (I)V
    //   274: aload #6
    //   276: ldc 2131886278
    //   278: invokevirtual k : (I)V
    //   281: aload #6
    //   283: new vn
    //   286: dup
    //   287: bipush #19
    //   289: aload_0
    //   290: aload #5
    //   292: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   295: putfield A : Lrs0;
    //   298: goto -> 309
    //   301: aload #6
    //   303: ldc_w 2131887030
    //   306: invokevirtual k : (I)V
    //   309: aload #6
    //   311: invokevirtual p : ()Lss0;
    //   314: pop
    //   315: return
    //   316: iconst_0
    //   317: aload #6
    //   319: iconst_1
    //   320: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   323: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */