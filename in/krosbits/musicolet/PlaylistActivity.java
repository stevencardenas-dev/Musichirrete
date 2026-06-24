package in.krosbits.musicolet;

import ag0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b81;
import bd1;
import bv0;
import c81;
import c91;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import dd1;
import e3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import km0;
import l81;
import m92;
import ms0;
import pc;
import qy;
import rs0;
import ss0;
import tk;
import u00;
import ui0;
import uu0;
import v00;
import vn;
import ws2;
import z51;
import z71;
import zy;

public class PlaylistActivity extends pc implements Runnable, DialogInterface.OnDismissListener, rs0, View.OnClickListener {
  public static final Pattern e0 = Pattern.compile("\\\\");
  
  public static b81 f0;
  
  public ss0 R;
  
  public ss0 S;
  
  public Thread T;
  
  public boolean U = false;
  
  public Intent V;
  
  public boolean W;
  
  public final List X = Arrays.asList(new String[] { "m3u", "m3u8" });
  
  public int Y;
  
  public int Z;
  
  public final e3 a0 = new e3(25, this);
  
  public final Handler b0 = new Handler();
  
  public ArrayList c0;
  
  public String d0;
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.e) {
      finish();
      this.b0.removeCallbacks((Runnable)this.a0);
    } 
  }
  
  public final void l0(bv0 parambv0, u00 paramu00) {
    // Byte code:
    //   0: aload_1
    //   1: getfield a : Ljava/util/ArrayList;
    //   4: astore #12
    //   6: new b81
    //   9: dup
    //   10: aload_2
    //   11: invokevirtual h : ()Ljava/lang/String;
    //   14: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: astore #10
    //   22: aload #12
    //   24: invokevirtual size : ()I
    //   27: istore #6
    //   29: new java/util/ArrayList
    //   32: dup
    //   33: iload #6
    //   35: invokespecial <init> : (I)V
    //   38: astore #11
    //   40: iconst_0
    //   41: istore #5
    //   43: iconst_0
    //   44: istore_3
    //   45: iload_3
    //   46: iload #6
    //   48: if_icmpge -> 545
    //   51: aload #12
    //   53: iload_3
    //   54: invokevirtual get : (I)Ljava/lang/Object;
    //   57: checkcast f81
    //   60: astore #13
    //   62: aload_0
    //   63: invokevirtual m0 : ()Z
    //   66: ifeq -> 72
    //   69: goto -> 624
    //   72: aload #13
    //   74: ifnonnull -> 80
    //   77: goto -> 539
    //   80: aload #13
    //   82: ldc 'uri'
    //   84: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   87: astore_2
    //   88: aload_2
    //   89: bipush #58
    //   91: invokevirtual indexOf : (I)I
    //   94: istore #4
    //   96: aload_2
    //   97: astore_1
    //   98: iload #4
    //   100: iflt -> 112
    //   103: aload_2
    //   104: iload #4
    //   106: iconst_1
    //   107: iadd
    //   108: invokevirtual substring : (I)Ljava/lang/String;
    //   111: astore_1
    //   112: getstatic in/krosbits/musicolet/PlaylistActivity.e0 : Ljava/util/regex/Pattern;
    //   115: aload_1
    //   116: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   119: ldc '/'
    //   121: invokevirtual replaceAll : (Ljava/lang/String;)Ljava/lang/String;
    //   124: astore_2
    //   125: aload_2
    //   126: ifnull -> 209
    //   129: aload_2
    //   130: ldc '/'
    //   132: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   135: istore #8
    //   137: iload #8
    //   139: ifeq -> 209
    //   142: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   145: aload_2
    //   146: invokevirtual f : (Ljava/lang/String;)Ljava/lang/String;
    //   149: astore_1
    //   150: aload_1
    //   151: ifnull -> 209
    //   154: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   157: aload_1
    //   158: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   161: astore_1
    //   162: aload_1
    //   163: ifnull -> 209
    //   166: aload_1
    //   167: invokevirtual j : ()Landroid/net/Uri;
    //   170: invokevirtual toString : ()Ljava/lang/String;
    //   173: astore_1
    //   174: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   177: getfield c : Llm0;
    //   180: astore #14
    //   182: new wo
    //   185: astore #9
    //   187: aload #9
    //   189: aload_1
    //   190: aconst_null
    //   191: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   194: aload #14
    //   196: aload #9
    //   198: invokevirtual b : (Lwo;)Lkm0;
    //   201: astore_1
    //   202: goto -> 211
    //   205: astore_2
    //   206: goto -> 493
    //   209: aconst_null
    //   210: astore_1
    //   211: aload_1
    //   212: ifnull -> 246
    //   215: new sn1
    //   218: astore #9
    //   220: aload #9
    //   222: aload_2
    //   223: lconst_0
    //   224: aconst_null
    //   225: aconst_null
    //   226: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    //   229: aload #9
    //   231: aload_1
    //   232: putfield e : Lkm0;
    //   235: aload #11
    //   237: aload #9
    //   239: invokevirtual add : (Ljava/lang/Object;)Z
    //   242: pop
    //   243: goto -> 539
    //   246: aload #13
    //   248: ldc 'duration'
    //   250: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   253: invokestatic parseInt : (Ljava/lang/String;)I
    //   256: istore #4
    //   258: iload #4
    //   260: sipush #1000
    //   263: imul
    //   264: istore #4
    //   266: goto -> 336
    //   269: astore_1
    //   270: goto -> 274
    //   273: astore_1
    //   274: new java/lang/StringBuilder
    //   277: astore #9
    //   279: aload #9
    //   281: invokespecial <init> : ()V
    //   284: aload #9
    //   286: ldc 'PLA:gmplfex>pse_d '
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload #9
    //   294: aload #13
    //   296: ldc 'uri'
    //   298: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload #9
    //   307: ldc ': '
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload #9
    //   315: aload_1
    //   316: invokevirtual toString : ()Ljava/lang/String;
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload #9
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: invokestatic v : (Ljava/lang/String;)V
    //   331: sipush #-999
    //   334: istore #4
    //   336: aload_2
    //   337: astore #9
    //   339: aload_2
    //   340: ldc '/'
    //   342: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   345: ifeq -> 355
    //   348: aload_2
    //   349: iconst_1
    //   350: invokevirtual substring : (I)Ljava/lang/String;
    //   353: astore #9
    //   355: aload #13
    //   357: ldc_w 'playlist_metadata'
    //   360: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   363: astore_1
    //   364: aload_1
    //   365: ifnull -> 428
    //   368: aload_1
    //   369: invokevirtual trim : ()Ljava/lang/String;
    //   372: astore_2
    //   373: aload_2
    //   374: bipush #45
    //   376: invokevirtual indexOf : (I)I
    //   379: istore #7
    //   381: iload #7
    //   383: iconst_1
    //   384: if_icmple -> 428
    //   387: iload #7
    //   389: aload_2
    //   390: invokevirtual length : ()I
    //   393: iconst_2
    //   394: isub
    //   395: if_icmpge -> 428
    //   398: aload_2
    //   399: iconst_0
    //   400: iload #7
    //   402: iconst_1
    //   403: isub
    //   404: invokevirtual substring : (II)Ljava/lang/String;
    //   407: astore_1
    //   408: aload_2
    //   409: iload #7
    //   411: iconst_2
    //   412: iadd
    //   413: invokevirtual substring : (I)Ljava/lang/String;
    //   416: astore_2
    //   417: goto -> 432
    //   420: astore_1
    //   421: aconst_null
    //   422: astore_1
    //   423: aconst_null
    //   424: astore_2
    //   425: goto -> 435
    //   428: aconst_null
    //   429: astore_2
    //   430: aconst_null
    //   431: astore_1
    //   432: goto -> 425
    //   435: new sn1
    //   438: astore #15
    //   440: new java/lang/StringBuilder
    //   443: astore #14
    //   445: aload #14
    //   447: invokespecial <init> : ()V
    //   450: aload #14
    //   452: ldc_w '~/~/'
    //   455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: aload #14
    //   461: aload #9
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: pop
    //   467: aload #15
    //   469: aload #14
    //   471: invokevirtual toString : ()Ljava/lang/String;
    //   474: iload #4
    //   476: i2l
    //   477: aload_2
    //   478: aload_1
    //   479: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    //   482: aload #11
    //   484: aload #15
    //   486: invokevirtual add : (Ljava/lang/Object;)Z
    //   489: pop
    //   490: goto -> 539
    //   493: new java/lang/StringBuilder
    //   496: dup
    //   497: ldc_w 'PLA:gmplfex>psentry '
    //   500: invokespecial <init> : (Ljava/lang/String;)V
    //   503: astore_1
    //   504: aload_1
    //   505: aload #13
    //   507: ldc 'uri'
    //   509: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: pop
    //   516: aload_1
    //   517: ldc ': '
    //   519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: pop
    //   523: aload_1
    //   524: aload_2
    //   525: invokevirtual toString : ()Ljava/lang/String;
    //   528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: aload_1
    //   533: invokevirtual toString : ()Ljava/lang/String;
    //   536: invokestatic v : (Ljava/lang/String;)V
    //   539: iinc #3, 1
    //   542: goto -> 45
    //   545: aload_0
    //   546: invokevirtual m0 : ()Z
    //   549: ifeq -> 555
    //   552: goto -> 624
    //   555: aload #11
    //   557: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   560: getfield c : Llm0;
    //   563: iconst_0
    //   564: newarray int
    //   566: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   569: invokestatic o : (Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   572: aload #11
    //   574: invokevirtual size : ()I
    //   577: istore #4
    //   579: iload #5
    //   581: istore_3
    //   582: iload_3
    //   583: iload #4
    //   585: if_icmpge -> 625
    //   588: aload #11
    //   590: iload_3
    //   591: invokevirtual get : (I)Ljava/lang/Object;
    //   594: astore_1
    //   595: iinc #3, 1
    //   598: aload_1
    //   599: checkcast sn1
    //   602: getfield e : Lkm0;
    //   605: astore_1
    //   606: aload_1
    //   607: ifnull -> 617
    //   610: aload #10
    //   612: aload_1
    //   613: invokevirtual a : (Lkm0;)Z
    //   616: pop
    //   617: aload_0
    //   618: invokevirtual m0 : ()Z
    //   621: ifeq -> 582
    //   624: return
    //   625: aload_0
    //   626: new ww
    //   629: dup
    //   630: aload_0
    //   631: invokestatic currentThread : ()Ljava/lang/Thread;
    //   634: aload #10
    //   636: iconst_4
    //   637: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   640: invokevirtual runOnUiThread : (Ljava/lang/Runnable;)V
    //   643: return
    //   644: astore_1
    //   645: goto -> 209
    //   648: astore_2
    //   649: goto -> 423
    // Exception table:
    //   from	to	target	type
    //   80	96	205	finally
    //   103	112	205	finally
    //   112	125	205	finally
    //   129	137	205	finally
    //   142	150	644	finally
    //   154	162	644	finally
    //   166	202	644	finally
    //   215	243	205	finally
    //   246	258	273	java/lang/NumberFormatException
    //   246	258	269	java/lang/NullPointerException
    //   246	258	205	finally
    //   274	331	205	finally
    //   339	355	205	finally
    //   355	364	205	finally
    //   368	381	420	finally
    //   387	408	420	finally
    //   408	417	648	finally
    //   435	490	205	finally
  }
  
  public final boolean m0() {
    return (this.U || Thread.currentThread() != this.T);
  }
  
  public final void n0(b81 paramb81, String paramString) {
    this.R.dismiss();
    this.S.dismiss();
    this.c0 = paramb81.c;
    this.d0 = paramString;
    String str = getResources().getQuantityString(2131755067, this.c0.size(), new Object[] { Integer.valueOf(this.c0.size()) });
    ms0 ms0 = new ms0((Context)this);
    ms0.f = paramString;
    ms0.D = this;
    ms0.W = this;
    byte b = 0;
    ms0.e(2131492967, false);
    LinearLayout linearLayout = (LinearLayout)ms0.u.findViewById(2131296973);
    TextView textView = (TextView)linearLayout.findViewById(2131297714);
    textView.setText((CharSequence)Html.fromHtml(str));
    textView.setMovementMethod(null);
    int i = linearLayout.indexOfChild((View)textView);
    if (paramb81.c.size() == 0) {
      int j = linearLayout.getChildCount();
      while (b < j) {
        if (b != i)
          linearLayout.getChildAt(b).setVisibility(8); 
        b++;
      } 
      ms0.k(2131886363);
    } else {
      ag0.x0((ViewGroup)linearLayout, this, null);
    } 
    this.R = ms0.p();
  }
  
  public final void o0() {
    this.R.dismiss();
    this.V = getIntent();
    this.T = new Thread(this);
    this.U = false;
    this.S.j(2131887105);
    this.S.show();
    this.T.start();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297714) {
      ArrayList<String> arrayList = new ArrayList(this.c0.size());
      ArrayList<Object> arrayList1 = this.c0;
      int j = arrayList1.size();
      i = 0;
      while (i < j) {
        km0 km0 = (km0)arrayList1.get(i);
        i++;
        arrayList.add(ag0.W(km0));
      } 
      ms0 ms0 = new ms0((Context)this);
      ms0.f = getResources().getQuantityString(2131755061, arrayList.size(), new Object[] { Integer.valueOf(arrayList.size()) });
      ms0.h(arrayList);
      ms0.P = false;
      m92.T(ms0);
      ms0.p();
      return;
    } 
    String str = KjdXPYm.XyMRpcLWrvrg;
    if (i == 2131296998) {
      try {
        ArrayList arrayList = this.c0;
        MusicService.P0.k(arrayList, 0, null, true);
        finish();
        Intent intent = new Intent();
        this((Context)this, MusicActivity.class);
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131297027) {
      try {
        ArrayList arrayList = this.c0;
        z51.E(-1, arrayList);
        MusicService.P0.k(arrayList, 0, null, true);
        finish();
        Intent intent = new Intent();
        this((Context)this, MusicActivity.class);
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131296958) {
      try {
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131297000) {
      try {
        MusicService.P0.g(this.c0);
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131296956) {
      try {
        MusicService musicService = MusicService.P0;
        ArrayList arrayList = this.c0;
        musicService.j((MyApplication.h()).c, arrayList);
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131296954) {
      try {
        ArrayList arrayList = this.c0;
        tk tk = new tk();
        boolean bool = MusicService.C0;
        Stack stack = (MyApplication.h()).b;
        i = (MyApplication.h()).c;
        vn vn = new vn();
        this(11, this, arrayList);
        this((Context)this, stack, i, (zy)vn);
        ss0 ss01 = (ss0)tk.f;
        ss01.setOnDismissListener(this);
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131296952) {
      try {
        GhostSearchActivity.f0 = this.c0;
        Intent intent = new Intent();
        this((Context)this, GhostSearchActivity.class);
        startActivity(intent.setAction("A_ADTPL").putExtra("E_TL", this.d0));
        return;
      } finally {
        str = null;
      } 
    } else if (i == 2131296950) {
      try {
        ArrayList<Object> arrayList = this.c0;
        int j = arrayList.size();
        i = 0;
        while (i < j) {
          km0 km0 = (km0)arrayList.get(i);
          i++;
          km0 = km0;
          c81.c(MyApplication.i.getApplicationContext()).a(km0);
        } 
        c81.j();
        MusicService.M0();
        i = arrayList.size();
        ag0.P0(0, getResources().getQuantityString(2131755063, i, new Object[] { Integer.valueOf(i) }), true);
        MusicActivity musicActivity = MusicActivity.R0;
        if (musicActivity != null) {
          z71 z71 = musicActivity.d0;
          if (z71 != null && z71.Y())
            musicActivity.d0.X0(); 
          l81 l81 = musicActivity.e0;
          if (l81 != null && l81.Y())
            musicActivity.e0.N0(); 
        } 
        MusicService.P0.b0(false);
        MusicService.M0();
        return;
      } finally {
        str = null;
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    m92.d(this);
    super.onCreate(paramBundle);
    ms0 ms02 = new ms0((Context)this);
    ms02.e0 = true;
    ms02.o(0, false);
    ms02.d("");
    ms02.J = false;
    ms02.K = false;
    ms02.k(2131886278);
    ms02.D = this;
    ms0 ms01 = new ms0((Context)this);
    ms01.e0 = false;
    ms01.o(0, true);
    ms01.t0 = true;
    ms01.d("");
    ms01.J = false;
    ms01.K = false;
    ms01.k(2131886278);
    ms01.D = this;
    m92.T(ms02);
    m92.T(ms01);
    this.R = new ss0(ms02);
    this.S = new ss0(ms01);
    this.V = getIntent();
    o0();
  }
  
  public final void onDestroy() {
    Handler handler = this.b0;
    if (handler != null)
      handler.removeCallbacks((Runnable)this.a0); 
    this.R.dismiss();
    this.S.dismiss();
    try {
      Thread thread = this.T;
    } finally {
      handler = null;
    } 
    this.U = true;
    this.T = null;
    super.onDestroy();
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.R.dismiss();
    finish();
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    try {
      Thread thread = this.T;
    } finally {
      paramIntent = null;
    } 
    this.U = true;
    this.T = null;
    this.R.dismiss();
    this.S.dismiss();
    o0();
  }
  
  public final void run() {
    Intent intent = this.V;
    if (intent != null) {
      UnsupportedOperationException unsupportedOperationException;
      String str1 = intent.getAction();
      boolean bool = "imt".equals(str1);
      FileInputStream fileInputStream = null;
      String str2 = null;
      byte b = 0;
      if (bool) {
        bd1 bd1;
        FileInputStream fileInputStream1;
        try {
          this.S.j(2131887145);
          this.R.j(2131887145);
          this.R.l(0);
          this.R.m(0);
          this.S.show();
          if (this.V == null)
            finish(); 
        } finally {
          null = null;
        } 
        if (str1.startsWith("/")) {
          if (str1.startsWith(getCacheDir().getAbsolutePath()))
            this.W = true; 
          File file = new File();
          this(str1);
          bd1 = new bd1();
          this(null, file);
        } else {
          bd1 bd11;
          if (bd1.startsWith("file:")) {
            String str = Uri.parse((String)bd1).getPath();
            if (str.startsWith(getCacheDir().getAbsolutePath()))
              this.W = true; 
            File file = new File();
            this(str);
            bd11 = new bd1(null, file);
          } else if (bd11.startsWith("content:")) {
            c91 c91 = new c91(MyApplication.i.getApplicationContext(), Uri.parse((String)bd11));
          } else {
            unsupportedOperationException = new UnsupportedOperationException();
            this();
            throw unsupportedOperationException;
          } 
        } 
        try {
          fileInputStream = ws2.n((u00)unsupportedOperationException);
          try {
            String str = unsupportedOperationException.h();
            str2 = ag0.C(str);
            this.X.contains(str2);
            bv0 bv0 = new bv0();
            super();
            bv0.a = null;
            ArrayList arrayList = new ArrayList();
            this();
            bv0.a = arrayList;
            dd1.d0(str, fileInputStream, bv0);
            fileInputStream.close();
            bool = m0();
          } finally {
            null = null;
          } 
        } finally {}
        try {
          null.printStackTrace();
          finish();
          ag0.O0(2131886512, 1);
        } finally {
          if (fileInputStream1 != null)
            try {
              fileInputStream1.close();
            } catch (IOException iOException) {
              iOException.printStackTrace();
            }  
          if (this.W && unsupportedOperationException != null)
            try {
              unsupportedOperationException.e();
            } finally {
              unsupportedOperationException = null;
            }  
        } 
      } 
      if ("imtm".equals(unsupportedOperationException)) {
        this.S.j(2131887145);
        this.R.j(2131887145);
        this.R.l(0);
        this.R.m(0);
        this.S.show();
        try {
        
        } finally {
          unsupportedOperationException = null;
          unsupportedOperationException.printStackTrace();
        } 
      } else {
        b81 b811;
        if ("ext".equals(unsupportedOperationException)) {
          b811 = f0;
          if (b811 == null || b811.d()) {
            ag0.O0(2131887496, 0);
            finish();
            return;
          } 
          b81 b813 = f0;
          f0 = null;
          this.R.j(2131886413);
          this.S.j(2131886413);
          this.S.show();
          try {
            ArrayList<km0> arrayList;
            Uri uri = (Uri)getIntent().getParcelableExtra("extslcur");
            if (uri != null) {
              Context context = MyApplication.i.getApplicationContext();
              c91 c91 = new c91();
              this(null);
              c91.c = context;
              c91.d = uri;
            } else {
              b811 = null;
            } 
            b81 b814 = b811;
            if (b811 == null) {
              try {
                v00 v002 = ag0.H().A("Exported playlists");
                v00 v001 = v002;
              } finally {
                b814 = null;
              } 
            } else {
              uu0 uu0;
              try {
                OutputStream outputStream1;
                PrintWriter printWriter;
                OutputStream outputStream2 = ws2.r((u00)b814);
                try {
                  printWriter = new PrintWriter();
                  this(outputStream2, false);
                  printWriter.println("#EXTM3U");
                  arrayList = b813.c;
                } finally {
                  OutputStream outputStream;
                  b811 = null;
                  outputStream1 = outputStream2;
                  b81 b815 = b811;
                } 
                printWriter.flush();
                printWriter.close();
                bool = m0();
                if (bool) {
                  if (outputStream2 != null) {
                    outputStream2.flush();
                  } else {
                    return;
                  } 
                } else {
                  Thread thread = Thread.currentThread();
                  String str = MyApplication.F.e((u00)outputStream1, true);
                  if (str == null)
                    str = outputStream1.h(); 
                  uu0 = new uu0();
                  this(this, thread, str, outputStream1, 4);
                  runOnUiThread((Runnable)uu0);
                  if (outputStream2 != null)
                    try {
                      outputStream2.flush();
                      outputStream2.close();
                    } catch (IOException iOException) {
                      iOException.printStackTrace();
                    }  
                  this.R.dismiss();
                  this.S.dismiss();
                } 
              } finally {
                str2 = null;
                uu0 uu01 = uu0;
              } 
              return;
            } 
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(ag0.e(((b81)arrayList).b));
            stringBuilder.append(".m3u");
            v00 v00 = b814.A(stringBuilder.toString());
          } catch (Exception exception) {
            b811 = null;
          } 
        } else {
          if ("extm".equals(b811)) {
            b811 = f0;
            if (b811 == null || b811.d()) {
              ag0.O0(2131887496, 0);
              finish();
              return;
            } 
            b811 = f0;
            f0 = null;
            this.S.j(2131887105);
            this.S.show();
            try {
              ui0.X(MyApplication.i.getApplicationContext(), b811);
              this.R.dismiss();
              this.S.dismiss();
            } finally {
              b811 = null;
            } 
            return;
          } 
          finish();
          return;
        } 
        exception.printStackTrace();
        b81 b812 = b811;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\PlaylistActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */