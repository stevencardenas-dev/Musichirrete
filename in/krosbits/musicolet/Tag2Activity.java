package in.krosbits.musicolet;

import a3;
import ag0;
import ag1;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.insets.ProtectionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.button.MaterialButton;
import dd1;
import ds1;
import g92;
import gt1;
import he;
import hn;
import ht1;
import id1;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import it1;
import java.io.File;
import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import jn;
import k91;
import l0;
import l90;
import lw0;
import m22;
import m92;
import ms0;
import n0;
import n21;
import o3;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.tag.Tag;
import p3;
import pc;
import qo;
import qy;
import rs0;
import s31;
import ss0;
import t8;
import u51;
import ui0;
import un;
import v00;
import v22;
import v52;
import v61;
import vp1;
import wo;
import wp1;
import x62;
import xp1;
import yi1;
import z20;
import zo2;

public class Tag2Activity extends pc implements Runnable, rs0, View.OnClickListener {
  public static ArrayList L1;
  
  public static ArrayList M1;
  
  public static ArrayList N1;
  
  public static Tag2Activity O1;
  
  public static HashSet P1;
  
  public static List Q1;
  
  public static List R1;
  
  public static List S1;
  
  public static List T1;
  
  public static List U1;
  
  public static final k91 V1 = new k91(11);
  
  public AppCompatAutoCompleteTextView A0;
  
  public t8 A1;
  
  public AppCompatAutoCompleteTextView B0;
  
  public t8 B1;
  
  public FrameLayout C0;
  
  public t8 C1;
  
  public ImageView D0;
  
  public boolean D1;
  
  public ImageView E0;
  
  public final HashSet E1 = new HashSet();
  
  public ImageView F0;
  
  public boolean F1;
  
  public ImageView G0;
  
  public boolean G1;
  
  public boolean H0;
  
  public final l90 H1 = new l90(this, 10);
  
  public boolean I0;
  
  public z20 I1 = null;
  
  public boolean J0;
  
  public final gt1 J1 = new gt1(this, 0);
  
  public boolean K0;
  
  public final yi1 K1 = new yi1(4, this);
  
  public boolean L0;
  
  public boolean M0;
  
  public boolean N0;
  
  public boolean O0;
  
  public boolean P0;
  
  public boolean Q0;
  
  public ss0 R;
  
  public boolean R0;
  
  public ss0 S;
  
  public boolean S0;
  
  public ss0 T;
  
  public boolean T0;
  
  public o3 U;
  
  public String U0;
  
  public Thread V;
  
  public String V0;
  
  public boolean W = false;
  
  public String W0;
  
  public ArrayList X;
  
  public String X0;
  
  public int Y;
  
  public String Y0;
  
  public int Z;
  
  public String Z0;
  
  public final Handler a0 = new Handler();
  
  public String a1;
  
  public Button b0;
  
  public String b1;
  
  public ScrollView c0;
  
  public String c1;
  
  public TextView d0;
  
  public String d1;
  
  public TextView e0;
  
  public String e1;
  
  public TextView f0;
  
  public String f1;
  
  public LinearLayout g0;
  
  public String g1;
  
  public LinearLayout h0;
  
  public String h1;
  
  public LinearLayout i0;
  
  public String i1;
  
  public LinearLayout j0;
  
  public String j1;
  
  public LinearLayout k0;
  
  public String k1;
  
  public LinearLayout l0;
  
  public String l1;
  
  public LinearLayout m0;
  
  public String m1;
  
  public LinearLayout n0;
  
  public String n1;
  
  public LinearLayout o0;
  
  public String o1;
  
  public LinearLayout p0;
  
  public String p1;
  
  public LinearLayout q0;
  
  public String q1;
  
  public EditText r0;
  
  public String r1;
  
  public EditText s0;
  
  public int s1 = 0;
  
  public EditText t0;
  
  public File t1;
  
  public EditText u0;
  
  public boolean u1;
  
  public EditText v0;
  
  public int v1;
  
  public EditText w0;
  
  public final ArrayList w1 = new ArrayList();
  
  public AppCompatAutoCompleteTextView x0;
  
  public ss0 x1;
  
  public AppCompatAutoCompleteTextView y0;
  
  public t8 y1;
  
  public AppCompatAutoCompleteTextView z0;
  
  public t8 z1;
  
  public static void m0(Tag2Activity paramTag2Activity, HashMap paramHashMap) {
    Toast.makeText(MyApplication.i.getApplicationContext(), paramTag2Activity.getResources().getQuantityString(2131755070, paramHashMap.size(), new Object[] { Integer.valueOf(paramHashMap.size()) }), 1).show();
    MusicService musicService = MusicService.P0;
    if (musicService != null) {
      MusicService.v0(MusicService.y());
      musicService.D();
      MyApplication.f();
      dd1.f();
      zo2.c();
    } 
    MusicActivity musicActivity = MusicActivity.R0;
    if (musicActivity != null) {
      musicActivity.d0.V0 = null;
      musicActivity.K0();
      musicActivity.M0();
      musicActivity.n0 = 0;
      musicActivity.z0();
    } 
    paramTag2Activity.finish();
    ag0.b();
  }
  
  public static String q0(String paramString) {
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = "<unknown>"; 
    return str;
  }
  
  public static boolean s0(String paramString1, String paramString2) {
    String str = paramString1;
    if (paramString1 == null)
      str = ""; 
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = ""; 
    return str.trim().equals(paramString1.trim());
  }
  
  public static void z0(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, String paramString6, boolean paramBoolean2, boolean paramBoolean3) {
    ClipData clipData = ClipData.newPlainText("lrc", paramString4);
    clipData.addItem(new ClipData.Item(paramString5));
    Intent intent = (new Intent((Context)paramActivity, LyricsEditActivity.class)).putExtra("tl", paramString1).putExtra("al", paramString2).putExtra("ar", paramString3).putExtra("lrcu", paramString6).putExtra("lrce", paramBoolean1).putExtra("hpel", paramBoolean3).putExtra("frcinvd", paramBoolean2);
    intent.setClipData(clipData);
    paramActivity.startActivityForResult(intent, 10312);
  }
  
  public final boolean A0() {
    boolean bool;
    if (this.s1 != 0 || !s0(this.g1, this.U0) || !s0(this.h1, this.r0.getText().toString()) || !s0(this.i1, this.x0.getText().toString()) || !s0(this.j1, this.y0.getText().toString()) || !s0(this.k1, this.z0.getText().toString()) || !s0(this.l1, this.A0.getText().toString()) || !s0(this.m1, this.B0.getText().toString()) || !s0(this.n1, this.t0.getText().toString()) || !s0(this.o1, this.s0.getText().toString()) || !s0(this.p1, this.u0.getText().toString()) || !s0(this.q1, this.v0.getText().toString()) || !s0(this.r1, this.w0.getText().toString())) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      ms0 ms0 = new ms0((Context)this);
      ms0.q(2131887268);
      ms0.l(2131886278);
      ms0.k(2131886989);
      ms0.n(2131887604);
      ms0.D = this;
      this.T = ms0.p();
    } 
    return bool ^ true;
  }
  
  public final void B0() {
    ArrayList arrayList = this.w1;
    this.Z = arrayList.size();
    this.Y = 0;
    this.R.j(2131886199);
    this.a0.post((Runnable)this.K1);
    this.V0 = this.r0.getText().toString().trim();
    this.W0 = this.x0.getText().toString().trim();
    this.X0 = this.y0.getText().toString().trim();
    this.Y0 = this.z0.getText().toString().trim();
    this.Z0 = this.A0.getText().toString().trim();
    this.a1 = this.B0.getText().toString().trim();
    this.b1 = this.t0.getText().toString().trim();
    this.c1 = this.s0.getText().toString().trim();
    this.d1 = this.u0.getText().toString().trim();
    this.e1 = this.v0.getText().toString().trim();
    this.f1 = this.w0.getText().toString().trim();
    if (this.u1 || arrayList.size() <= 1) {
      if (this.u1) {
        if (this.s1 == 0)
          this.H0 = false; 
        String str = this.U0;
        if (str == null || str.length() == 0)
          this.I0 = false; 
        if (this.V0.length() == 0)
          this.J0 = false; 
        if (this.W0.length() == 0)
          this.K0 = false; 
        if (this.X0.length() == 0)
          this.L0 = false; 
        if (this.Y0.length() == 0)
          this.M0 = false; 
        if (this.Z0.length() == 0)
          this.N0 = false; 
        if (this.a1.length() == 0)
          this.O0 = false; 
        if (this.b1.length() == 0)
          this.P0 = false; 
        if (this.c1.length() == 0)
          this.Q0 = false; 
        if (this.d1.length() == 0)
          this.R0 = false; 
        if (this.e1.length() == 0)
          this.S0 = false; 
        if (this.f1.length() == 0)
          this.T0 = false; 
      } 
      Thread thread = new Thread((Runnable)this.J1);
      this.V = thread;
      thread.start();
      return;
    } 
    l0.k();
  }
  
  public final void C0(ScrollView paramScrollView, View paramView, ViewGroup paramViewGroup, x62 paramx62) {
    try {
      z20 z201 = this.I1;
      if (z201 != null)
        this.N.removeCallbacks((Runnable)z201); 
      z201 = new z20();
      this(this, paramView, paramViewGroup, paramScrollView, paramx62);
      return;
    } finally {
      paramScrollView = null;
      paramScrollView.printStackTrace();
    } 
  }
  
  public final void D0() {
    ms0 ms0 = new ms0((Context)this);
    ms0.q(2131886216);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d0.getText());
    stringBuilder.append(" ");
    Resources resources = getResources();
    ArrayList arrayList = this.w1;
    stringBuilder.append(resources.getQuantityString(2131755036, arrayList.size(), new Object[] { Integer.valueOf(arrayList.size()) }));
    ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
    ms0.n(2131886672);
    ms0.k(2131886278);
    ms0.J = false;
    ms0.K = false;
    ms0.D = this;
    ss0 ss01 = ms0.p();
    this.x1 = ss01;
    TextView textView = ss01.m;
    textView.setMovementMethod(null);
    textView.setOnClickListener(this);
  }
  
  public final void E0() {
    MyApplication.v.a(this.D0);
    int i = this.s1;
    if (i == 0) {
      if (this.u1 || !this.D1) {
        ag1 ag1 = MyApplication.v.e(m92.k);
        ag1.c = true;
        ag1.g(new int[] { 2 });
        ag1.d = true;
        ag1.b();
        ag1.f(this.D0);
      } else {
        ag1 ag1 = MyApplication.v.f(p3.n(MyApplication.j.c.b(new wo(((v00)((u51)this.w1.get(0)).a).j().toString(), null)), m92.k, true));
        ag1.c = true;
        ag1.g(new int[] { 2 });
        ag1.d = true;
        ag1.b();
        ag1.f(this.D0);
      } 
      this.E0.setVisibility(0);
      this.F0.setVisibility(0);
      this.G0.setVisibility(8);
      if (!this.u1 && !this.D1)
        this.F0.setVisibility(8); 
      this.e0.setText(2131886994);
      this.e0.setTypeface(Typeface.DEFAULT);
    } else if (i == 1) {
      ag1 ag1;
      v61 v61 = MyApplication.v;
      File file = this.t1;
      v61.getClass();
      if (file == null) {
        ag1 = new ag1(v61, null, 0);
      } else {
        ag1 = v61.f(Uri.fromFile((File)ag1));
      } 
      ag1.c = true;
      ag1.g(new int[] { 2 });
      ag1.d = true;
      ag1.b();
      ag1.f(this.D0);
      this.E0.setVisibility(0);
      this.F0.setVisibility(0);
      this.G0.setVisibility(0);
      if (!this.u1 && !this.D1)
        this.F0.setVisibility(8); 
      this.e0.setText(2131886346);
      this.e0.setTypeface(Typeface.DEFAULT_BOLD);
    } else if (i == 2) {
      ag1 ag1 = MyApplication.v.e(m92.k);
      ag1.c = true;
      ag1.g(new int[] { 2 });
      ag1.d = true;
      ag1.b();
      ag1.f(this.D0);
      this.E0.setVisibility(0);
      this.F0.setVisibility(8);
      this.G0.setVisibility(0);
      if (!this.u1 && !this.D1)
        this.G0.setVisibility(8); 
      this.e0.setText(2131886447);
      this.e0.setTypeface(Typeface.DEFAULT_BOLD);
    } 
    boolean bool = this.u1;
    TextView textView = this.e0;
    if (bool) {
      textView.setVisibility(0);
      return;
    } 
    textView.setVisibility(8);
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    ss0 ss01 = this.T;
    qy qy1 = qy.e;
    if (paramss0 == ss01) {
      if (paramqy == qy.b) {
        p0(true);
        return;
      } 
      if (paramqy == qy1) {
        finish();
        return;
      } 
    } else {
      if (paramss0 == this.R) {
        this.S.show();
        this.W = true;
        this.V = null;
        return;
      } 
      if (paramss0 == this.x1 && paramqy == qy1)
        finish(); 
    } 
  }
  
  public final void n0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a0 : Landroid/os/Handler;
    //   4: astore #25
    //   6: aload_0
    //   7: invokevirtual t0 : ()Z
    //   10: ifeq -> 16
    //   13: goto -> 1916
    //   16: aload_0
    //   17: getfield w1 : Ljava/util/ArrayList;
    //   20: astore #18
    //   22: new java/util/HashMap
    //   25: dup
    //   26: aload #18
    //   28: invokevirtual size : ()I
    //   31: invokespecial <init> : (I)V
    //   34: astore #26
    //   36: new q01
    //   39: dup
    //   40: iconst_0
    //   41: invokespecial <init> : (I)V
    //   44: astore #17
    //   46: iconst_0
    //   47: istore_2
    //   48: iload_2
    //   49: aload #18
    //   51: invokevirtual size : ()I
    //   54: if_icmpge -> 1588
    //   57: aload_0
    //   58: iload_2
    //   59: putfield Y : I
    //   62: aload #25
    //   64: aload_0
    //   65: getfield K1 : Lyi1;
    //   68: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   71: pop
    //   72: aload_0
    //   73: invokevirtual t0 : ()Z
    //   76: ifeq -> 82
    //   79: goto -> 1588
    //   82: aload #18
    //   84: iload_2
    //   85: invokevirtual get : (I)Ljava/lang/Object;
    //   88: checkcast u51
    //   91: astore #16
    //   93: aload #16
    //   95: getfield a : Ljava/lang/Object;
    //   98: checkcast v00
    //   101: astore #27
    //   103: aload #16
    //   105: getfield b : Ljava/lang/Object;
    //   108: checkcast org/jaudiotagger/tag/Tag
    //   111: astore #30
    //   113: new wo
    //   116: astore #28
    //   118: aload #28
    //   120: aload #27
    //   122: invokevirtual j : ()Landroid/net/Uri;
    //   125: invokevirtual toString : ()Ljava/lang/String;
    //   128: aload #17
    //   130: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   133: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   136: getfield c : Llm0;
    //   139: aload #28
    //   141: invokevirtual b : (Lwo;)Lkm0;
    //   144: astore #29
    //   146: aload_0
    //   147: getfield H0 : Z
    //   150: ifeq -> 204
    //   153: aload_0
    //   154: getfield s1 : I
    //   157: istore_1
    //   158: iload_1
    //   159: iconst_1
    //   160: if_icmpne -> 192
    //   163: aload #30
    //   165: invokeinterface deleteArtworkField : ()V
    //   170: aload #30
    //   172: aload_0
    //   173: getfield t1 : Ljava/io/File;
    //   176: invokestatic createArtworkFromFile : (Ljava/io/File;)Lorg/jaudiotagger/tag/images/Artwork;
    //   179: invokeinterface setField : (Lorg/jaudiotagger/tag/images/Artwork;)V
    //   184: goto -> 204
    //   187: astore #16
    //   189: goto -> 1750
    //   192: iload_1
    //   193: iconst_2
    //   194: if_icmpne -> 204
    //   197: aload #30
    //   199: invokeinterface deleteArtworkField : ()V
    //   204: aload_0
    //   205: getfield I0 : Z
    //   208: istore #7
    //   210: iload #7
    //   212: ifeq -> 268
    //   215: aload #30
    //   217: getstatic org/jaudiotagger/tag/FieldKey.SYNC_LYRICS : Lorg/jaudiotagger/tag/FieldKey;
    //   220: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   225: getstatic org/jaudiotagger/tag/FieldKey.UNSYNC_LYRICS : Lorg/jaudiotagger/tag/FieldKey;
    //   228: astore #19
    //   230: aload #30
    //   232: aload #19
    //   234: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   239: aload_0
    //   240: getfield U0 : Ljava/lang/String;
    //   243: astore #16
    //   245: aload #16
    //   247: ifnull -> 268
    //   250: aload #30
    //   252: aload #19
    //   254: iconst_1
    //   255: anewarray java/lang/String
    //   258: dup
    //   259: iconst_0
    //   260: aload #16
    //   262: aastore
    //   263: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   268: aload #29
    //   270: getfield c : Lqn1;
    //   273: astore #16
    //   275: aload #16
    //   277: getfield b : Ljava/lang/String;
    //   280: astore #19
    //   282: aload #16
    //   284: getfield c : Ljava/lang/String;
    //   287: astore #20
    //   289: aload #16
    //   291: getfield e : Ljava/lang/String;
    //   294: astore #21
    //   296: aload #29
    //   298: getfield j : Ljava/lang/String;
    //   301: astore #22
    //   303: aload #29
    //   305: getfield f : Ljava/lang/String;
    //   308: astore #23
    //   310: aload #29
    //   312: getfield e : Ljava/lang/String;
    //   315: astore #24
    //   317: aload #29
    //   319: invokevirtual l : ()I
    //   322: istore_1
    //   323: aload #29
    //   325: invokevirtual c : ()I
    //   328: istore #6
    //   330: aload #29
    //   332: getfield p : I
    //   335: istore #5
    //   337: aload_0
    //   338: getfield J0 : Z
    //   341: ifeq -> 390
    //   344: aload_0
    //   345: getfield V0 : Ljava/lang/String;
    //   348: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   351: astore #19
    //   353: getstatic org/jaudiotagger/tag/FieldKey.TITLE : Lorg/jaudiotagger/tag/FieldKey;
    //   356: astore #16
    //   358: aload #30
    //   360: aload #16
    //   362: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   367: aload #30
    //   369: aload #16
    //   371: iconst_1
    //   372: anewarray java/lang/String
    //   375: dup
    //   376: iconst_0
    //   377: aload_0
    //   378: getfield V0 : Ljava/lang/String;
    //   381: aastore
    //   382: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   387: goto -> 393
    //   390: goto -> 387
    //   393: aload_0
    //   394: getfield K0 : Z
    //   397: ifeq -> 443
    //   400: aload_0
    //   401: getfield W0 : Ljava/lang/String;
    //   404: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   407: astore #20
    //   409: getstatic org/jaudiotagger/tag/FieldKey.ALBUM : Lorg/jaudiotagger/tag/FieldKey;
    //   412: astore #16
    //   414: aload #30
    //   416: aload #16
    //   418: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   423: aload #30
    //   425: aload #16
    //   427: iconst_1
    //   428: anewarray java/lang/String
    //   431: dup
    //   432: iconst_0
    //   433: aload_0
    //   434: getfield W0 : Ljava/lang/String;
    //   437: aastore
    //   438: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   443: aload_0
    //   444: getfield L0 : Z
    //   447: ifeq -> 496
    //   450: aload_0
    //   451: getfield X0 : Ljava/lang/String;
    //   454: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   457: astore #21
    //   459: getstatic org/jaudiotagger/tag/FieldKey.ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   462: astore #16
    //   464: aload #30
    //   466: aload #16
    //   468: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   473: aload #30
    //   475: aload #16
    //   477: iconst_1
    //   478: anewarray java/lang/String
    //   481: dup
    //   482: iconst_0
    //   483: aload_0
    //   484: getfield X0 : Ljava/lang/String;
    //   487: aastore
    //   488: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   493: goto -> 496
    //   496: aload_0
    //   497: getfield M0 : Z
    //   500: ifeq -> 546
    //   503: aload_0
    //   504: getfield Y0 : Ljava/lang/String;
    //   507: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   510: astore #22
    //   512: getstatic org/jaudiotagger/tag/FieldKey.ALBUM_ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   515: astore #16
    //   517: aload #30
    //   519: aload #16
    //   521: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   526: aload #30
    //   528: aload #16
    //   530: iconst_1
    //   531: anewarray java/lang/String
    //   534: dup
    //   535: iconst_0
    //   536: aload_0
    //   537: getfield Y0 : Ljava/lang/String;
    //   540: aastore
    //   541: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   546: aload_0
    //   547: getfield N0 : Z
    //   550: ifeq -> 596
    //   553: aload_0
    //   554: getfield Z0 : Ljava/lang/String;
    //   557: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   560: astore #23
    //   562: getstatic org/jaudiotagger/tag/FieldKey.COMPOSER : Lorg/jaudiotagger/tag/FieldKey;
    //   565: astore #16
    //   567: aload #30
    //   569: aload #16
    //   571: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   576: aload #30
    //   578: aload #16
    //   580: iconst_1
    //   581: anewarray java/lang/String
    //   584: dup
    //   585: iconst_0
    //   586: aload_0
    //   587: getfield Z0 : Ljava/lang/String;
    //   590: aastore
    //   591: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   596: aload_0
    //   597: getfield O0 : Z
    //   600: ifeq -> 646
    //   603: aload_0
    //   604: getfield a1 : Ljava/lang/String;
    //   607: invokestatic q0 : (Ljava/lang/String;)Ljava/lang/String;
    //   610: astore #24
    //   612: getstatic org/jaudiotagger/tag/FieldKey.GENRE : Lorg/jaudiotagger/tag/FieldKey;
    //   615: astore #16
    //   617: aload #30
    //   619: aload #16
    //   621: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   626: aload #30
    //   628: aload #16
    //   630: iconst_1
    //   631: anewarray java/lang/String
    //   634: dup
    //   635: iconst_0
    //   636: aload_0
    //   637: getfield a1 : Ljava/lang/String;
    //   640: aastore
    //   641: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   646: aload_0
    //   647: getfield P0 : Z
    //   650: ifeq -> 687
    //   653: getstatic org/jaudiotagger/tag/FieldKey.COMMENT : Lorg/jaudiotagger/tag/FieldKey;
    //   656: astore #16
    //   658: aload #30
    //   660: aload #16
    //   662: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   667: aload #30
    //   669: aload #16
    //   671: iconst_1
    //   672: anewarray java/lang/String
    //   675: dup
    //   676: iconst_0
    //   677: aload_0
    //   678: getfield b1 : Ljava/lang/String;
    //   681: aastore
    //   682: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   687: aload_0
    //   688: getfield Q0 : Z
    //   691: ifeq -> 728
    //   694: getstatic org/jaudiotagger/tag/FieldKey.LYRICIST : Lorg/jaudiotagger/tag/FieldKey;
    //   697: astore #16
    //   699: aload #30
    //   701: aload #16
    //   703: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   708: aload #30
    //   710: aload #16
    //   712: iconst_1
    //   713: anewarray java/lang/String
    //   716: dup
    //   717: iconst_0
    //   718: aload_0
    //   719: getfield c1 : Ljava/lang/String;
    //   722: aastore
    //   723: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   728: aload_0
    //   729: getfield R0 : Z
    //   732: istore #7
    //   734: iload_1
    //   735: istore_3
    //   736: iload #7
    //   738: ifeq -> 797
    //   741: aload_0
    //   742: getfield d1 : Ljava/lang/String;
    //   745: invokestatic parseInt : (Ljava/lang/String;)I
    //   748: istore_3
    //   749: iload_3
    //   750: istore_1
    //   751: goto -> 761
    //   754: astore #16
    //   756: aload #16
    //   758: invokevirtual printStackTrace : ()V
    //   761: getstatic org/jaudiotagger/tag/FieldKey.TRACK : Lorg/jaudiotagger/tag/FieldKey;
    //   764: astore #16
    //   766: aload #30
    //   768: aload #16
    //   770: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   775: aload #30
    //   777: aload #16
    //   779: iconst_1
    //   780: anewarray java/lang/String
    //   783: dup
    //   784: iconst_0
    //   785: aload_0
    //   786: getfield d1 : Ljava/lang/String;
    //   789: aastore
    //   790: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   795: iload_1
    //   796: istore_3
    //   797: aload_0
    //   798: getfield S0 : Z
    //   801: istore #7
    //   803: iload #6
    //   805: istore #4
    //   807: iload #7
    //   809: ifeq -> 870
    //   812: aload_0
    //   813: getfield e1 : Ljava/lang/String;
    //   816: invokestatic parseInt : (Ljava/lang/String;)I
    //   819: istore_1
    //   820: goto -> 833
    //   823: astore #16
    //   825: aload #16
    //   827: invokevirtual printStackTrace : ()V
    //   830: iload #6
    //   832: istore_1
    //   833: getstatic org/jaudiotagger/tag/FieldKey.DISC_NO : Lorg/jaudiotagger/tag/FieldKey;
    //   836: astore #16
    //   838: aload #30
    //   840: aload #16
    //   842: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   847: aload #30
    //   849: aload #16
    //   851: iconst_1
    //   852: anewarray java/lang/String
    //   855: dup
    //   856: iconst_0
    //   857: aload_0
    //   858: getfield e1 : Ljava/lang/String;
    //   861: aastore
    //   862: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   867: iload_1
    //   868: istore #4
    //   870: aload_0
    //   871: getfield T0 : Z
    //   874: istore #7
    //   876: iload #7
    //   878: ifeq -> 939
    //   881: aload_0
    //   882: getfield f1 : Ljava/lang/String;
    //   885: invokestatic parseInt : (Ljava/lang/String;)I
    //   888: istore_1
    //   889: goto -> 902
    //   892: astore #16
    //   894: aload #16
    //   896: invokevirtual printStackTrace : ()V
    //   899: iload #5
    //   901: istore_1
    //   902: getstatic org/jaudiotagger/tag/FieldKey.YEAR : Lorg/jaudiotagger/tag/FieldKey;
    //   905: astore #16
    //   907: aload #30
    //   909: aload #16
    //   911: invokeinterface deleteField : (Lorg/jaudiotagger/tag/FieldKey;)V
    //   916: aload #30
    //   918: aload #16
    //   920: iconst_1
    //   921: anewarray java/lang/String
    //   924: dup
    //   925: iconst_0
    //   926: aload_0
    //   927: getfield f1 : Ljava/lang/String;
    //   930: aastore
    //   931: invokeinterface setField : (Lorg/jaudiotagger/tag/FieldKey;[Ljava/lang/String;)V
    //   936: goto -> 942
    //   939: iload #5
    //   941: istore_1
    //   942: invokestatic y : ()Lkm0;
    //   945: astore #16
    //   947: aload #16
    //   949: ifnonnull -> 958
    //   952: iconst_0
    //   953: istore #7
    //   955: goto -> 973
    //   958: aload #16
    //   960: getfield c : Lqn1;
    //   963: getfield f : Lwo;
    //   966: aload #28
    //   968: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   971: istore #7
    //   973: iload #7
    //   975: ifeq -> 986
    //   978: invokestatic o0 : ()Z
    //   981: istore #8
    //   983: goto -> 989
    //   986: iconst_0
    //   987: istore #8
    //   989: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   992: aload #27
    //   994: invokevirtual l : (Lv00;)Lv00;
    //   997: astore #31
    //   999: aload #31
    //   1001: invokevirtual n : ()J
    //   1004: lstore #12
    //   1006: aload_0
    //   1007: getfield t1 : Ljava/io/File;
    //   1010: astore #16
    //   1012: aload #16
    //   1014: ifnull -> 1039
    //   1017: lconst_0
    //   1018: aload #16
    //   1020: invokevirtual length : ()J
    //   1023: invokestatic max : (JJ)J
    //   1026: lstore #10
    //   1028: goto -> 1042
    //   1031: astore #16
    //   1033: iconst_0
    //   1034: istore #7
    //   1036: goto -> 1311
    //   1039: lconst_0
    //   1040: lstore #10
    //   1042: lload #12
    //   1044: lload #10
    //   1046: ladd
    //   1047: ldc2_w 10240
    //   1050: ladd
    //   1051: lstore #10
    //   1053: aload #31
    //   1055: invokevirtual u : ()J
    //   1058: lstore #14
    //   1060: lload #14
    //   1062: lconst_0
    //   1063: lcmp
    //   1064: iflt -> 1101
    //   1067: lload #12
    //   1069: lconst_0
    //   1070: lcmp
    //   1071: ifle -> 1101
    //   1074: lload #14
    //   1076: lload #10
    //   1078: lcmp
    //   1079: iflt -> 1085
    //   1082: goto -> 1101
    //   1085: new java/lang/IllegalStateException
    //   1088: astore #16
    //   1090: aload #16
    //   1092: ldc_w 'TAG:ACA>nos.d!'
    //   1095: invokespecial <init> : (Ljava/lang/String;)V
    //   1098: aload #16
    //   1100: athrow
    //   1101: aload #31
    //   1103: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1106: astore #16
    //   1108: goto -> 1123
    //   1111: astore #16
    //   1113: aload #31
    //   1115: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1118: astore #16
    //   1120: goto -> 1108
    //   1123: aload #16
    //   1125: aload #30
    //   1127: invokevirtual setTag : (Lorg/jaudiotagger/tag/Tag;)V
    //   1130: aload_0
    //   1131: invokevirtual t0 : ()Z
    //   1134: ifeq -> 1140
    //   1137: goto -> 1588
    //   1140: new java/io/File
    //   1143: astore #30
    //   1145: aload #30
    //   1147: aload_0
    //   1148: invokevirtual getCacheDir : ()Ljava/io/File;
    //   1151: aload #31
    //   1153: invokevirtual v : ()Ljava/lang/String;
    //   1156: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   1159: aload #30
    //   1161: invokevirtual deleteOnExit : ()V
    //   1164: aload #30
    //   1166: invokestatic s : (Ljava/io/File;)Lcd1;
    //   1169: astore #30
    //   1171: aload #30
    //   1173: invokevirtual f : ()Z
    //   1176: ifeq -> 1194
    //   1179: aload #30
    //   1181: invokevirtual e : ()Z
    //   1184: pop
    //   1185: aload #30
    //   1187: invokevirtual p : ()Z
    //   1190: pop
    //   1191: goto -> 1200
    //   1194: aload #30
    //   1196: invokevirtual p : ()Z
    //   1199: pop
    //   1200: aload #30
    //   1202: invokevirtual u : ()J
    //   1205: lstore #14
    //   1207: lload #14
    //   1209: lconst_0
    //   1210: lcmp
    //   1211: iflt -> 1248
    //   1214: lload #12
    //   1216: lconst_0
    //   1217: lcmp
    //   1218: ifle -> 1248
    //   1221: lload #14
    //   1223: lload #10
    //   1225: lcmp
    //   1226: iflt -> 1232
    //   1229: goto -> 1248
    //   1232: new java/lang/IllegalStateException
    //   1235: astore #16
    //   1237: aload #16
    //   1239: ldc_w 'TAG:ACA>nos.c!'
    //   1242: invokespecial <init> : (Ljava/lang/String;)V
    //   1245: aload #16
    //   1247: athrow
    //   1248: aload #16
    //   1250: aload #30
    //   1252: invokestatic writeAs : (Lorg/jaudiotagger/audio/AudioFile;Lu00;)V
    //   1255: aload_0
    //   1256: invokevirtual t0 : ()Z
    //   1259: ifeq -> 1271
    //   1262: aload #30
    //   1264: invokevirtual e : ()Z
    //   1267: pop
    //   1268: goto -> 1588
    //   1271: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1274: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1277: pop
    //   1278: aload #30
    //   1280: aload #31
    //   1282: invokestatic f : (Lv00;Lv00;)Z
    //   1285: istore #7
    //   1287: aload #30
    //   1289: invokevirtual e : ()Z
    //   1292: pop
    //   1293: goto -> 1316
    //   1296: astore #16
    //   1298: goto -> 1311
    //   1301: astore #16
    //   1303: goto -> 1033
    //   1306: astore #16
    //   1308: goto -> 1303
    //   1311: aload #16
    //   1313: invokevirtual printStackTrace : ()V
    //   1316: invokestatic y : ()Lkm0;
    //   1319: astore #16
    //   1321: aload #16
    //   1323: ifnonnull -> 1332
    //   1326: iconst_0
    //   1327: istore #9
    //   1329: goto -> 1347
    //   1332: aload #16
    //   1334: getfield c : Lqn1;
    //   1337: getfield f : Lwo;
    //   1340: aload #28
    //   1342: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1345: istore #9
    //   1347: iload #9
    //   1349: ifeq -> 1396
    //   1352: iload #8
    //   1354: ifeq -> 1378
    //   1357: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1360: invokevirtual i0 : ()V
    //   1363: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1366: iconst_0
    //   1367: putfield j : Z
    //   1370: goto -> 1378
    //   1373: astore #16
    //   1375: goto -> 1391
    //   1378: aconst_null
    //   1379: invokestatic v0 : (Lkm0;)V
    //   1382: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1385: invokevirtual j0 : ()V
    //   1388: goto -> 1396
    //   1391: aload #16
    //   1393: invokevirtual printStackTrace : ()V
    //   1396: iload #7
    //   1398: ifeq -> 1579
    //   1401: new km0
    //   1404: astore #30
    //   1406: aload #29
    //   1408: getfield b : I
    //   1411: istore #5
    //   1413: new qn1
    //   1416: astore #31
    //   1418: aload #29
    //   1420: getfield c : Lqn1;
    //   1423: astore #16
    //   1425: aload #31
    //   1427: aload #16
    //   1429: getfield f : Lwo;
    //   1432: aload #19
    //   1434: aload #20
    //   1436: aload #21
    //   1438: aload #16
    //   1440: getfield g : I
    //   1443: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1446: aload #30
    //   1448: iload #5
    //   1450: aload #31
    //   1452: aload #24
    //   1454: aload #23
    //   1456: aload #22
    //   1458: aload #29
    //   1460: getfield k : J
    //   1463: invokestatic currentTimeMillis : ()J
    //   1466: ldc2_w 30000
    //   1469: ladd
    //   1470: aload #29
    //   1472: getfield m : J
    //   1475: aload #29
    //   1477: getfield n : J
    //   1480: aload #29
    //   1482: getfield o : I
    //   1485: aload #29
    //   1487: getfield r : I
    //   1490: aload #29
    //   1492: getfield s : I
    //   1495: aload #29
    //   1497: getfield t : I
    //   1500: iload_1
    //   1501: iload #4
    //   1503: sipush #1000
    //   1506: imul
    //   1507: iload_3
    //   1508: sipush #1000
    //   1511: irem
    //   1512: iadd
    //   1513: aload #29
    //   1515: getfield h : Ljava/lang/String;
    //   1518: aload #29
    //   1520: getfield i : Ljava/lang/String;
    //   1523: aload #29
    //   1525: getfield g : Ljava/lang/String;
    //   1528: aload #29
    //   1530: getfield u : I
    //   1533: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1536: aload #26
    //   1538: aload #28
    //   1540: aload #30
    //   1542: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1545: pop
    //   1546: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1549: aload #27
    //   1551: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   1554: astore #16
    //   1556: aload #16
    //   1558: ifnull -> 1579
    //   1561: aload_0
    //   1562: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1565: iconst_1
    //   1566: anewarray java/lang/String
    //   1569: dup
    //   1570: iconst_0
    //   1571: aload #16
    //   1573: aastore
    //   1574: aconst_null
    //   1575: aconst_null
    //   1576: invokestatic scanFile : (Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    //   1579: invokestatic b : ()V
    //   1582: iinc #2, 1
    //   1585: goto -> 48
    //   1588: aload #25
    //   1590: new gt1
    //   1593: dup
    //   1594: aload_0
    //   1595: iconst_1
    //   1596: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;I)V
    //   1599: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1602: pop
    //   1603: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1606: aload #26
    //   1608: invokevirtual y : (Ljava/util/HashMap;)V
    //   1611: invokestatic b : ()V
    //   1614: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1617: invokevirtual o : ()V
    //   1620: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1623: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1626: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1629: aload #26
    //   1631: invokevirtual h : (Ljava/util/HashMap;)Z
    //   1634: ifeq -> 1640
    //   1637: invokestatic i : ()V
    //   1640: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1643: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1646: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   1649: astore #16
    //   1651: iconst_0
    //   1652: istore_1
    //   1653: iload_1
    //   1654: aload #16
    //   1656: invokevirtual size : ()I
    //   1659: if_icmpge -> 1713
    //   1662: aload #16
    //   1664: iload_1
    //   1665: invokevirtual get : (I)Ljava/lang/Object;
    //   1668: checkcast java/lang/String
    //   1671: astore #17
    //   1673: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1676: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1679: aload #17
    //   1681: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   1684: astore #17
    //   1686: aload #17
    //   1688: aload #26
    //   1690: invokevirtual h : (Ljava/util/HashMap;)Z
    //   1693: ifeq -> 1707
    //   1696: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1699: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1702: aload #17
    //   1704: invokestatic m : (Landroid/content/Context;Lb81;)V
    //   1707: iinc #1, 1
    //   1710: goto -> 1653
    //   1713: invokestatic h : ()Lwk1;
    //   1716: invokevirtual a : ()V
    //   1719: invokestatic r : ()V
    //   1722: invokestatic b : ()V
    //   1725: new e6
    //   1728: dup
    //   1729: bipush #24
    //   1731: aload_0
    //   1732: aload #26
    //   1734: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1737: astore #16
    //   1739: aload #25
    //   1741: aload #16
    //   1743: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1746: pop
    //   1747: goto -> 1916
    //   1750: ldc_w 2131886550
    //   1753: iconst_0
    //   1754: invokestatic O0 : (II)V
    //   1757: aload #16
    //   1759: invokevirtual printStackTrace : ()V
    //   1762: aload #25
    //   1764: new gt1
    //   1767: dup
    //   1768: aload_0
    //   1769: iconst_1
    //   1770: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;I)V
    //   1773: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1776: pop
    //   1777: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1780: aload #26
    //   1782: invokevirtual y : (Ljava/util/HashMap;)V
    //   1785: invokestatic b : ()V
    //   1788: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1791: invokevirtual o : ()V
    //   1794: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1797: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1800: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1803: aload #26
    //   1805: invokevirtual h : (Ljava/util/HashMap;)Z
    //   1808: ifeq -> 1814
    //   1811: invokestatic i : ()V
    //   1814: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1817: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1820: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   1823: astore #16
    //   1825: iconst_0
    //   1826: istore_1
    //   1827: iload_1
    //   1828: aload #16
    //   1830: invokevirtual size : ()I
    //   1833: if_icmpge -> 1887
    //   1836: aload #16
    //   1838: iload_1
    //   1839: invokevirtual get : (I)Ljava/lang/Object;
    //   1842: checkcast java/lang/String
    //   1845: astore #17
    //   1847: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1850: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1853: aload #17
    //   1855: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   1858: astore #17
    //   1860: aload #17
    //   1862: aload #26
    //   1864: invokevirtual h : (Ljava/util/HashMap;)Z
    //   1867: ifeq -> 1881
    //   1870: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1873: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1876: aload #17
    //   1878: invokestatic m : (Landroid/content/Context;Lb81;)V
    //   1881: iinc #1, 1
    //   1884: goto -> 1827
    //   1887: invokestatic h : ()Lwk1;
    //   1890: invokevirtual a : ()V
    //   1893: invokestatic r : ()V
    //   1896: invokestatic b : ()V
    //   1899: new e6
    //   1902: dup
    //   1903: bipush #24
    //   1905: aload_0
    //   1906: aload #26
    //   1908: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1911: astore #16
    //   1913: goto -> 1739
    //   1916: return
    //   1917: astore #16
    //   1919: aload #25
    //   1921: new gt1
    //   1924: dup
    //   1925: aload_0
    //   1926: iconst_1
    //   1927: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;I)V
    //   1930: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1933: pop
    //   1934: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1937: aload #26
    //   1939: invokevirtual y : (Ljava/util/HashMap;)V
    //   1942: invokestatic b : ()V
    //   1945: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1948: invokevirtual o : ()V
    //   1951: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1954: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1957: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1960: aload #26
    //   1962: invokevirtual h : (Ljava/util/HashMap;)Z
    //   1965: ifeq -> 1971
    //   1968: invokestatic i : ()V
    //   1971: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1974: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1977: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   1980: astore #17
    //   1982: iconst_0
    //   1983: istore_1
    //   1984: iload_1
    //   1985: aload #17
    //   1987: invokevirtual size : ()I
    //   1990: if_icmpge -> 2044
    //   1993: aload #17
    //   1995: iload_1
    //   1996: invokevirtual get : (I)Ljava/lang/Object;
    //   1999: checkcast java/lang/String
    //   2002: astore #18
    //   2004: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2007: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2010: aload #18
    //   2012: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   2015: astore #18
    //   2017: aload #18
    //   2019: aload #26
    //   2021: invokevirtual h : (Ljava/util/HashMap;)Z
    //   2024: ifeq -> 2038
    //   2027: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2030: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2033: aload #18
    //   2035: invokestatic m : (Landroid/content/Context;Lb81;)V
    //   2038: iinc #1, 1
    //   2041: goto -> 1984
    //   2044: invokestatic h : ()Lwk1;
    //   2047: invokevirtual a : ()V
    //   2050: invokestatic r : ()V
    //   2053: invokestatic b : ()V
    //   2056: aload #25
    //   2058: new e6
    //   2061: dup
    //   2062: bipush #24
    //   2064: aload_0
    //   2065: aload #26
    //   2067: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   2070: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   2073: pop
    //   2074: aload #16
    //   2076: athrow
    //   2077: astore #16
    //   2079: goto -> 225
    //   2082: astore #16
    //   2084: goto -> 986
    //   2087: astore #16
    //   2089: goto -> 1579
    // Exception table:
    //   from	to	target	type
    //   48	79	187	finally
    //   82	158	187	finally
    //   163	184	187	finally
    //   197	204	187	finally
    //   204	210	187	finally
    //   215	225	2077	finally
    //   225	245	187	finally
    //   250	268	187	finally
    //   268	387	187	finally
    //   393	443	187	finally
    //   443	493	187	finally
    //   496	546	187	finally
    //   546	596	187	finally
    //   596	646	187	finally
    //   646	687	187	finally
    //   687	728	187	finally
    //   728	734	187	finally
    //   741	749	754	java/lang/NumberFormatException
    //   741	749	187	finally
    //   756	761	187	finally
    //   761	795	187	finally
    //   797	803	187	finally
    //   812	820	823	java/lang/NumberFormatException
    //   812	820	187	finally
    //   825	830	187	finally
    //   833	867	187	finally
    //   870	876	187	finally
    //   881	889	892	java/lang/NumberFormatException
    //   881	889	187	finally
    //   894	899	187	finally
    //   902	936	187	finally
    //   942	947	2082	java/lang/Exception
    //   942	947	187	finally
    //   958	973	2082	java/lang/Exception
    //   958	973	187	finally
    //   978	983	2082	java/lang/Exception
    //   978	983	187	finally
    //   989	1006	1306	finally
    //   1006	1012	1301	finally
    //   1017	1028	1031	finally
    //   1053	1060	1031	finally
    //   1085	1101	1031	finally
    //   1101	1108	1111	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   1101	1108	1111	org/jaudiotagger/tag/TagException
    //   1101	1108	1111	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   1101	1108	1031	finally
    //   1113	1120	1031	finally
    //   1123	1137	1031	finally
    //   1140	1191	1031	finally
    //   1194	1200	1031	finally
    //   1200	1207	1031	finally
    //   1232	1248	1031	finally
    //   1248	1268	1031	finally
    //   1271	1287	1031	finally
    //   1287	1293	1296	finally
    //   1311	1316	187	finally
    //   1316	1321	187	finally
    //   1332	1347	187	finally
    //   1357	1370	1373	java/lang/Exception
    //   1357	1370	187	finally
    //   1378	1388	1373	java/lang/Exception
    //   1378	1388	187	finally
    //   1391	1396	187	finally
    //   1401	1546	187	finally
    //   1546	1556	2087	finally
    //   1561	1579	2087	finally
    //   1579	1582	187	finally
    //   1750	1762	1917	finally
  }
  
  public final void o0() {
    if (Build.VERSION.SDK_INT >= 30) {
      ArrayList<Uri> arrayList1 = new ArrayList();
      ArrayList<Object> arrayList = this.w1;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        v00 v00 = (v00)arrayList.get(i);
        int k = i + 1;
        v00 = (v00)((u51)v00).a;
        i = k;
        if (v00 instanceof lw0) {
          arrayList1.add(((lw0)v00).L());
          i = k;
        } 
      } 
      if (!arrayList1.isEmpty()) {
        n0.k(this, 10302, arrayList1);
        return;
      } 
      B0();
      return;
    } 
    B0();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10311 && paramInt2 == -1) {
      w0(paramIntent);
      return;
    } 
    if (paramInt1 == 10302) {
      if (paramInt2 == -1) {
        B0();
        return;
      } 
    } else if (paramInt1 == 10312) {
      if (paramInt2 == -1) {
        try {
          ClipData clipData = paramIntent.getClipData();
        } finally {
          paramIntent = null;
        } 
      } else if (this.G1) {
        onBackPressed();
      } 
      this.G1 = false;
    } 
  }
  
  public final void onBackPressed() {
    if (A0())
      super.onBackPressed(); 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296833 || i == 2131296855) {
      x0();
      return;
    } 
    if (i == 2131296890) {
      this.s1 = 2;
      E0();
      return;
    } 
    if (i == 2131296896) {
      this.s1 = 0;
      E0();
      return;
    } 
    if (i == 2131296387) {
      y0(true);
      return;
    } 
    if (i == 2131297744) {
      D0();
      return;
    } 
    if (i == 2131297095) {
      ArrayList arrayList = this.w1;
      int j = arrayList.size();
      v00[] arrayOfV00 = new v00[j];
      for (i = 0; i < arrayList.size(); i++)
        arrayOfV00[i] = (v00)((u51)arrayList.get(i)).a; 
      ms0 ms0 = new ms0((Context)this);
      ms0.a((id1)new a3((Object[])arrayOfV00), (LinearLayoutManager2)new LinearLayoutManager(1));
      ms0.f = getResources().getQuantityString(2131755061, j, new Object[] { Integer.valueOf(j) });
      ms0.P = false;
      ms0.p();
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(null);
    O1 = this;
    U().a(this.H1);
    this.t1 = new File(getCacheDir(), "temp_albumart");
    if (paramBundle == null || paramBundle.getInt("extaast", -1) != 1)
      this.t1.delete(); 
    ms0 ms0 = new ms0((Context)this);
    ms0.c(2131886575);
    ms0.o(0, true);
    ms0.J = false;
    ms0.K = false;
    ms0.t0 = true;
    this.S = new ss0(ms0);
    ms0 = new ms0((Context)this);
    ms0.d("");
    ms0.e0 = true;
    ms0.o(0, false);
    ms0.J = false;
    ms0.K = false;
    ms0.k(2131886278);
    ms0.D = this;
    this.R = new ss0(ms0);
    this.v1 = getIntent().getIntExtra("extm", 0);
    setContentView(2131492915);
    Toolbar toolbar = (Toolbar)findViewById(2131297607);
    g92.e((View)toolbar, true);
    TextView textView = (TextView)findViewById(2131297744);
    this.d0 = textView;
    v52 v52 = new v52((View)textView, 2);
    WeakHashMap weakHashMap = v22.a;
    m22.c((View)textView, (s31)v52);
    ScrollView scrollView = (ScrollView)findViewById(2131297555);
    this.c0 = scrollView;
    g92.d((View)scrollView, true, true);
    ProtectionLayout protectionLayout = (ProtectionLayout)findViewById(2131296941);
    hn hn = new hn(8, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    g0(toolbar);
    ui0 ui0 = Y();
    ui0.f0(2131887489);
    ui0.Z(true);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296734);
    this.C0 = frameLayout;
    this.D0 = (ImageView)frameLayout.findViewById(2131296833);
    this.E0 = (ImageView)this.C0.findViewById(2131296855);
    this.F0 = (ImageView)this.C0.findViewById(2131296890);
    this.G0 = (ImageView)this.C0.findViewById(2131296896);
    this.b0 = (Button)findViewById(2131296387);
    this.e0 = (TextView)findViewById(2131297793);
    this.f0 = (TextView)findViewById(2131297794);
    this.g0 = (LinearLayout)findViewById(2131297038);
    this.r0 = (EditText)findViewById(2131296713);
    this.h0 = (LinearLayout)findViewById(2131296960);
    this.x0 = (AppCompatAutoCompleteTextView)findViewById(2131296693);
    this.i0 = (LinearLayout)findViewById(2131296963);
    this.y0 = (AppCompatAutoCompleteTextView)findViewById(2131296695);
    this.j0 = (LinearLayout)findViewById(2131296961);
    this.z0 = (AppCompatAutoCompleteTextView)findViewById(2131296694);
    this.k0 = (LinearLayout)findViewById(2131296972);
    this.A0 = (AppCompatAutoCompleteTextView)findViewById(2131296697);
    this.l0 = (LinearLayout)findViewById(2131296988);
    this.B0 = (AppCompatAutoCompleteTextView)findViewById(2131296701);
    this.m0 = (LinearLayout)findViewById(2131296971);
    this.t0 = (EditText)findViewById(2131296696);
    this.n0 = (LinearLayout)findViewById(2131296990);
    this.s0 = (EditText)findViewById(2131296702);
    this.o0 = (LinearLayout)findViewById(2131297040);
    this.u0 = (EditText)findViewById(2131296714);
    this.p0 = (LinearLayout)findViewById(2131296982);
    this.v0 = (EditText)findViewById(2131296698);
    this.q0 = (LinearLayout)findViewById(2131297042);
    this.w0 = (EditText)findViewById(2131296716);
    this.E0.setBackground((Drawable)ag0.U(MyApplication.i.getApplicationContext(), 0, Color.parseColor("#aa000000")));
    this.F0.setBackground((Drawable)ag0.U(MyApplication.i.getApplicationContext(), 0, Color.parseColor("#aa000000")));
    this.G0.setBackground((Drawable)ag0.U(MyApplication.i.getApplicationContext(), 0, Color.parseColor("#aa000000")));
    this.D0.setOnClickListener(this);
    this.E0.setOnClickListener(this);
    this.F0.setOnClickListener(this);
    this.G0.setOnClickListener(this);
    this.b0.setOnClickListener(this);
    this.d0.setOnClickListener(this);
    LinearLayout linearLayout = (LinearLayout)findViewById(2131297938);
    linearLayout.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new ht1(this, linearLayout));
    linearLayout.getViewTreeObserver().addOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener)new it1(this, linearLayout));
    int i = this.v1;
    if (i == 0) {
      this.T0 = true;
      this.S0 = true;
      this.R0 = true;
      this.Q0 = true;
      this.O0 = true;
      this.P0 = true;
      this.N0 = true;
      this.M0 = true;
      this.L0 = true;
      this.K0 = true;
      this.J0 = true;
      this.I0 = true;
      this.H0 = true;
    } else if (i == 1) {
      this.Q0 = true;
      this.T0 = true;
      this.P0 = true;
      this.O0 = true;
      this.N0 = true;
      this.M0 = true;
      this.L0 = true;
      this.K0 = true;
    } else if (i == 999) {
      this.H0 = getIntent().getBooleanExtra("extaa", false);
      this.I0 = getIntent().getBooleanExtra("extlrc", false);
      this.J0 = getIntent().getBooleanExtra("exttl", false);
      this.K0 = getIntent().getBooleanExtra("extal", false);
      this.L0 = getIntent().getBooleanExtra("extar", false);
      this.M0 = getIntent().getBooleanExtra("extalar", false);
      this.N0 = getIntent().getBooleanExtra("extcmpsr", false);
      this.P0 = getIntent().getBooleanExtra("extcmt", false);
      this.O0 = getIntent().getBooleanExtra("extgnr", false);
      this.Q0 = getIntent().getBooleanExtra("extlrcst", false);
      this.R0 = getIntent().getBooleanExtra("exttrc", false);
      this.S0 = getIntent().getBooleanExtra("extdsc", false);
      this.T0 = getIntent().getBooleanExtra("extyr", false);
    } 
    if (paramBundle == null) {
      try {
        ArrayList arrayList1 = L1;
        if (arrayList1 != null && arrayList1.size() != 0) {
          arrayList1 = new ArrayList();
          this(L1);
          this.X = arrayList1;
          L1 = null;
          this.Z = arrayList1.size();
          this.Y = 0;
          this.R.j(2131887118);
          this.a0.post((Runnable)this.K1);
          this.W = false;
          Thread thread = new Thread();
          this(this);
          this.V = thread;
          thread.start();
        } else {
          n21.F("empty");
          IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
          this();
          throw illegalArgumentException;
        } 
      } finally {}
    } else {
      u0(paramBundle);
      this.F1 = true;
      r0();
    } 
    M1 = null;
    N1 = null;
    P1 = null;
    Q1 = null;
    R1 = null;
    S1 = null;
    T1 = null;
    U1 = null;
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    getMenuInflater().inflate(2131623945, paramMenu);
    ag0.B0(paramMenu, null, m92.h[3]);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public final void onDestroy() {
    if (O1 == this)
      O1 = null; 
    this.W = true;
    this.V = null;
    this.S.dismiss();
    this.R.dismiss();
    if (!h0() || this.s1 != 1)
      this.t1.delete(); 
    this.W = false;
    Handler handler = this.a0;
    if (handler != null)
      handler.removeCallbacks((Runnable)this.K1); 
    super.onDestroy();
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 16908332) {
      if (A0())
        finish(); 
    } else if (i == 2131297132) {
      p0(true);
    } 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onResume() {
    super.onResume();
    o3 o31 = this.U;
    if (o31 != null)
      o31.a(); 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    M1 = this.X;
    N1 = this.w1;
    P1 = this.E1;
    paramBundle.putBoolean("extisml", this.u1);
    paramBundle.putBoolean("extaa", this.H0);
    paramBundle.putBoolean("extlrc", this.I0);
    paramBundle.putBoolean("exttl", this.J0);
    paramBundle.putBoolean("extal", this.K0);
    paramBundle.putBoolean("extar", this.L0);
    paramBundle.putBoolean("extalar", this.M0);
    paramBundle.putBoolean("extcmpsr", this.N0);
    paramBundle.putBoolean("extgnr", this.O0);
    paramBundle.putBoolean("extcmt", this.P0);
    paramBundle.putBoolean("extlrcst", this.Q0);
    paramBundle.putBoolean("exttrc", this.R0);
    paramBundle.putBoolean("extdsc", this.S0);
    paramBundle.putBoolean("extyr", this.T0);
    paramBundle.putBoolean("extfaaf", this.D1);
    paramBundle.putInt("extaast", this.s1);
    String str1 = getIntent().toUri(1);
    String str2 = this.g1;
    String str3 = this.U0;
    if (str2 != str3)
      paramBundle.putString("elrc", str3); 
    t8 t81 = this.y1;
    if (t81 != null)
      Q1 = (List)t81.c; 
    t81 = this.z1;
    if (t81 != null)
      R1 = (List)t81.c; 
    t81 = this.A1;
    if (t81 != null)
      S1 = (List)t81.c; 
    t81 = this.B1;
    if (t81 != null)
      T1 = (List)t81.c; 
    t81 = this.C1;
    if (t81 != null)
      U1 = (List)t81.c; 
    paramBundle.putString(Intent.class.toString(), str1);
    paramBundle.putBoolean("w_lrc_f", this.G1);
  }
  
  public final void p0(boolean paramBoolean) {
    Bundle bundle;
    wp1 wp1;
    ArrayList<xp1> arrayList2 = new ArrayList();
    ArrayList<xp1> arrayList1 = new ArrayList();
    HashSet hashSet = this.E1;
    for (String str : hashSet) {
      xp1 xp1 = MyApplication.F.b(str);
      if (xp1 == null || xp1.j == 0)
        continue; 
      if (xp1.i) {
        arrayList2.add(xp1);
        continue;
      } 
      arrayList1.add(xp1);
    } 
    if (arrayList2.size() > 0) {
      if (paramBoolean) {
        bundle = new Bundle();
        String[] arrayOfString = new String[arrayList2.size()];
        for (byte b = 0; b < arrayList2.size(); b++)
          arrayOfString[b] = ((xp1)arrayList2.get(b)).e; 
        bundle.putStringArray("arg_reqattu", arrayOfString);
        wp1 = new wp1();
        wp1.x0(bundle);
        wp1.D0 = (vp1)V1;
        wp1.O0(this, Z());
      } 
      return;
    } 
    if (wp1.size() > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getQuantityString(2131755031, wp1.size()));
      stringBuilder.append("<br/><b>");
      stringBuilder.append(TextUtils.join(",", (Iterable)wp1));
      stringBuilder.append("</b>");
      Spanned spanned = Html.fromHtml(stringBuilder.toString());
      ms0 ms0 = new ms0((Context)this);
      ms0.d((CharSequence)spanned);
      if (bundle.size() != wp1.size()) {
        ms0.n(2131886404);
        ms0.A = (rs0)new ds1(2, this);
      } 
      ms0.l(2131886278);
      ms0.p();
      return;
    } 
    o0();
  }
  
  public final void r0() {
    this.R.dismiss();
    this.S.dismiss();
    boolean bool = this.F1;
    ArrayList arrayList = this.w1;
    if (!bool && arrayList.size() != this.X.size()) {
      int i = this.X.size();
      ag0.P0(1, getResources().getQuantityString(2131755054, i, new Object[] { Integer.valueOf(i - arrayList.size()), Integer.valueOf(i) }), true);
    } 
    if (this.u1) {
      this.d0.setText(getResources().getQuantityString(2131755014, arrayList.size(), new Object[] { Integer.valueOf(arrayList.size()) }));
      this.d0.setVisibility(0);
      this.f0.setVisibility(0);
      this.r0.setHint(2131887530);
      this.x0.setHint(2131887530);
      this.y0.setHint(2131887530);
      this.z0.setHint(2131887530);
      this.A0.setHint(2131887530);
      this.B0.setHint(2131887530);
      this.s0.setHint(2131887530);
      this.t0.setHint(2131887530);
      this.u0.setHint(2131887530);
      this.v0.setHint(2131887530);
      this.w0.setHint(2131887530);
    } 
    if (this.H0) {
      E0();
      this.C0.setVisibility(0);
    } 
    if (this.I0) {
      if (!this.u1) {
        String str = m92.A((Tag)((u51)arrayList.get(0)).b);
        this.g1 = str;
        if (this.U0 == null)
          this.U0 = str; 
      } 
      this.b0.setVisibility(0);
    } 
    if (this.J0) {
      String str = getIntent().getStringExtra("tl");
      this.h1 = str;
      if (str != null) {
        str = str.trim();
        this.h1 = str;
        if ("<unknown>".equals(str))
          this.h1 = null; 
      } 
      this.r0.setText(this.h1);
      this.g0.setVisibility(0);
    } 
    if (this.K0) {
      String str = getIntent().getStringExtra("al");
      this.i1 = str;
      if (str != null) {
        str = str.trim();
        this.i1 = str;
        if ("<unknown>".equals(str))
          this.i1 = null; 
      } 
      this.x0.setText(this.i1);
      this.h0.setVisibility(0);
      this.x0.setAdapter((ListAdapter)this.y1);
    } 
    if (this.L0) {
      String str = getIntent().getStringExtra(GMDx.mYHXA);
      this.j1 = str;
      if (str != null) {
        str = str.trim();
        this.j1 = str;
        if ("<unknown>".equals(str))
          this.j1 = null; 
      } 
      this.y0.setText(this.j1);
      this.i0.setVisibility(0);
      this.y0.setAdapter((ListAdapter)this.z1);
    } 
    if (this.M0) {
      String str = getIntent().getStringExtra("alar");
      this.k1 = str;
      if (str != null) {
        str = str.trim();
        this.k1 = str;
        if ("<unknown>".equals(str))
          this.k1 = null; 
      } 
      this.z0.setText(this.k1);
      this.j0.setVisibility(0);
      this.z0.setAdapter((ListAdapter)this.A1);
    } 
    if (this.N0) {
      String str = getIntent().getStringExtra("cm");
      this.l1 = str;
      if (str != null) {
        str = str.trim();
        this.l1 = str;
        if ("<unknown>".equals(str))
          this.l1 = null; 
      } 
      this.A0.setText(this.l1);
      this.k0.setVisibility(0);
      this.A0.setAdapter((ListAdapter)this.B1);
    } 
    if (this.O0) {
      String str = getIntent().getStringExtra("gn");
      this.m1 = str;
      if (str != null) {
        str = str.trim();
        this.m1 = str;
        if ("<unknown>".equals(str))
          this.m1 = null; 
      } 
      this.B0.setText(this.m1);
      this.l0.setVisibility(0);
      this.B0.setAdapter((ListAdapter)this.C1);
    } 
    if (this.Q0) {
      String str = getIntent().getStringExtra("lrst");
      this.o1 = str;
      if (str != null) {
        str = str.trim();
        this.o1 = str;
        if ("<unknown>".equals(str))
          this.o1 = null; 
      } 
      this.s0.setText(this.o1);
      this.n0.setVisibility(0);
    } 
    if (this.P0) {
      String str = getIntent().getStringExtra("cmt");
      this.n1 = str;
      if (str != null) {
        str = str.trim();
        this.n1 = str;
        if ("<unknown>".equals(str))
          this.n1 = null; 
      } 
      this.t0.setOnTouchListener((View.OnTouchListener)new he(2));
      this.t0.setText(this.n1);
      this.m0.setVisibility(0);
    } 
    if (this.R0) {
      String str = getIntent().getStringExtra("trn");
      this.p1 = str;
      if (str != null) {
        str = str.trim();
        this.p1 = str;
        if ("<unknown>".equals(str))
          this.p1 = null; 
      } 
      this.u0.setText(this.p1);
      this.o0.setVisibility(0);
    } 
    if (this.S0) {
      String str = getIntent().getStringExtra("dcn");
      this.q1 = str;
      if (str != null) {
        str = str.trim();
        this.q1 = str;
        if ("<unknown>".equals(str))
          this.q1 = null; 
      } 
      this.v0.setText(this.q1);
      this.p0.setVisibility(0);
    } 
    if (this.T0) {
      String str = getIntent().getStringExtra("yr");
      this.r1 = str;
      if (str != null) {
        str = str.trim();
        this.r1 = str;
        if ("<unknown>".equals(str))
          this.r1 = null; 
      } 
      this.w0.setText(this.r1);
      this.q0.setVisibility(0);
    } 
    if (!this.F1 && this.u1)
      D0(); 
    if (getIntent().getBooleanExtra("LRCDLG", false) && this.I0) {
      getIntent().removeExtra("LRCDLG");
      y0(false);
      this.G1 = true;
      return;
    } 
    if (getIntent().getBooleanExtra("ATCDLG", false) && this.H0)
      x0(); 
  }
  
  public final void run() {
    try {
      return;
    } catch (InterruptedException interruptedException) {
    
    } finally {
      Exception exception = null;
      ag0.O0(2131886510, 1);
      exception.printStackTrace();
    } 
  }
  
  public final boolean t0() {
    return (this.W || Thread.currentThread() != this.V);
  }
  
  public final void u0(Bundle paramBundle) {
    ArrayList arrayList = M1;
    if (arrayList != null) {
      ArrayList arrayList1 = N1;
      if (arrayList1 != null && P1 != null) {
        boolean bool;
        this.X = arrayList;
        arrayList = this.w1;
        arrayList.addAll(arrayList1);
        this.E1.addAll(P1);
        if (Q1 != null)
          this.y1 = new t8(this, Q1); 
        if (R1 != null)
          this.z1 = new t8(this, R1); 
        if (S1 != null)
          this.A1 = new t8(this, S1); 
        if (T1 != null)
          this.B1 = new t8(this, T1); 
        if (U1 != null)
          this.C1 = new t8(this, U1); 
        if (arrayList.size() > 1) {
          bool = true;
        } else {
          bool = false;
        } 
        this.u1 = paramBundle.getBoolean("extisml", bool);
        this.H0 = paramBundle.getBoolean("extaa", false);
        this.I0 = paramBundle.getBoolean("extlrc", false);
        this.J0 = paramBundle.getBoolean("exttl", false);
        this.K0 = paramBundle.getBoolean("extal", false);
        this.L0 = paramBundle.getBoolean("extar", false);
        this.M0 = paramBundle.getBoolean("extalar", false);
        this.N0 = paramBundle.getBoolean("extcmpsr", false);
        this.O0 = paramBundle.getBoolean("extgnr", false);
        this.P0 = paramBundle.getBoolean("extcmt", false);
        this.Q0 = paramBundle.getBoolean("extlrcst", false);
        this.R0 = paramBundle.getBoolean("exttrc", false);
        this.S0 = paramBundle.getBoolean("extdsc", false);
        this.T0 = paramBundle.getBoolean("extyr", false);
        this.D1 = paramBundle.getBoolean("extfaaf", false);
        this.s1 = paramBundle.getInt("extaast", -1);
        this.U0 = paramBundle.getString("elrc");
        if (this.s1 >= 0) {
          setIntent(Intent.parseUri(paramBundle.getString(Intent.class.toString()), 1));
          this.G1 = paramBundle.getBoolean("w_lrc_f");
          return;
        } 
        throw new IllegalSelectorException();
      } 
    } 
    throw new IllegalStateException();
  }
  
  public final void v0() {
    // Byte code:
    //   0: ldc_w ''
    //   3: astore #12
    //   5: iconst_m1
    //   6: istore_1
    //   7: iconst_m1
    //   8: istore_2
    //   9: iconst_m1
    //   10: istore #4
    //   12: iconst_0
    //   13: istore #7
    //   15: aconst_null
    //   16: astore #23
    //   18: aconst_null
    //   19: astore #22
    //   21: aconst_null
    //   22: astore #21
    //   24: aconst_null
    //   25: astore #20
    //   27: aconst_null
    //   28: astore #19
    //   30: aconst_null
    //   31: astore #18
    //   33: aconst_null
    //   34: astore #17
    //   36: aconst_null
    //   37: astore #16
    //   39: iconst_1
    //   40: istore_3
    //   41: aload_0
    //   42: getfield X : Ljava/util/ArrayList;
    //   45: invokevirtual size : ()I
    //   48: istore #5
    //   50: aload_0
    //   51: getfield a0 : Landroid/os/Handler;
    //   54: astore #14
    //   56: aload_0
    //   57: getfield w1 : Ljava/util/ArrayList;
    //   60: astore #24
    //   62: iload #7
    //   64: iload #5
    //   66: if_icmpge -> 924
    //   69: aload_0
    //   70: invokevirtual t0 : ()Z
    //   73: ifne -> 916
    //   76: aload_0
    //   77: iload #7
    //   79: putfield Y : I
    //   82: aload #14
    //   84: aload_0
    //   85: getfield K1 : Lyi1;
    //   88: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   91: pop
    //   92: aload_0
    //   93: getfield X : Ljava/util/ArrayList;
    //   96: iload #7
    //   98: invokevirtual get : (I)Ljava/lang/Object;
    //   101: checkcast km0
    //   104: astore #29
    //   106: aload #29
    //   108: invokevirtual d : ()Lv00;
    //   111: astore #30
    //   113: aload #29
    //   115: getfield p : I
    //   118: istore #10
    //   120: aload #29
    //   122: getfield e : Ljava/lang/String;
    //   125: astore #27
    //   127: aload #29
    //   129: getfield f : Ljava/lang/String;
    //   132: astore #25
    //   134: aload #29
    //   136: getfield j : Ljava/lang/String;
    //   139: astore #26
    //   141: aload #29
    //   143: getfield c : Lqn1;
    //   146: astore #28
    //   148: aload #30
    //   150: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   153: astore #13
    //   155: goto -> 183
    //   158: astore #15
    //   160: aload #12
    //   162: astore #14
    //   164: aload #14
    //   166: astore #13
    //   168: goto -> 379
    //   171: astore #13
    //   173: aload #30
    //   175: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   178: astore #13
    //   180: goto -> 155
    //   183: aload #13
    //   185: invokevirtual getTagAndConvertOrCreateAndSetDefault : ()Lorg/jaudiotagger/tag/Tag;
    //   188: astore #31
    //   190: aload #31
    //   192: ifnonnull -> 213
    //   195: aload #22
    //   197: astore #14
    //   199: aload #21
    //   201: astore #24
    //   203: aload #20
    //   205: astore #25
    //   207: iload_3
    //   208: istore #8
    //   210: goto -> 895
    //   213: aload_0
    //   214: getfield Q0 : Z
    //   217: istore #11
    //   219: iload #11
    //   221: ifeq -> 261
    //   224: aload #31
    //   226: getstatic org/jaudiotagger/tag/FieldKey.UNSYNC_LYRICS : Lorg/jaudiotagger/tag/FieldKey;
    //   229: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   234: pop
    //   235: aload #31
    //   237: getstatic org/jaudiotagger/tag/FieldKey.LYRICIST : Lorg/jaudiotagger/tag/FieldKey;
    //   240: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   245: astore #13
    //   247: goto -> 265
    //   250: astore #13
    //   252: aload #12
    //   254: astore #13
    //   256: iconst_0
    //   257: istore_3
    //   258: goto -> 265
    //   261: aload #12
    //   263: astore #13
    //   265: aload #31
    //   267: getstatic org/jaudiotagger/tag/FieldKey.COMMENT : Lorg/jaudiotagger/tag/FieldKey;
    //   270: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   275: astore #14
    //   277: aload #14
    //   279: ifnull -> 301
    //   282: aload #14
    //   284: invokevirtual trim : ()Ljava/lang/String;
    //   287: astore #15
    //   289: aload #15
    //   291: astore #14
    //   293: goto -> 305
    //   296: astore #15
    //   298: goto -> 379
    //   301: aload #12
    //   303: astore #14
    //   305: new u51
    //   308: astore #15
    //   310: aload #15
    //   312: aload #30
    //   314: aload #31
    //   316: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   319: aload #24
    //   321: aload #15
    //   323: invokevirtual add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: aload #30
    //   329: invokevirtual y : ()Ljava/lang/String;
    //   332: astore #15
    //   334: aload_0
    //   335: getfield E1 : Ljava/util/HashSet;
    //   338: aload #15
    //   340: invokevirtual add : (Ljava/lang/Object;)Z
    //   343: pop
    //   344: aload #14
    //   346: astore #24
    //   348: aload #13
    //   350: astore #14
    //   352: goto -> 395
    //   355: astore #15
    //   357: goto -> 379
    //   360: astore #15
    //   362: aload #12
    //   364: astore #14
    //   366: goto -> 379
    //   369: astore #15
    //   371: goto -> 160
    //   374: astore #15
    //   376: goto -> 160
    //   379: aload #15
    //   381: invokevirtual printStackTrace : ()V
    //   384: aload #14
    //   386: astore #24
    //   388: aload #13
    //   390: astore #14
    //   392: goto -> 352
    //   395: iload #7
    //   397: ifne -> 471
    //   400: aload #28
    //   402: getfield b : Ljava/lang/String;
    //   405: astore #23
    //   407: aload #28
    //   409: getfield c : Ljava/lang/String;
    //   412: astore #13
    //   414: aload #28
    //   416: getfield e : Ljava/lang/String;
    //   419: astore #15
    //   421: aload #29
    //   423: invokevirtual l : ()I
    //   426: istore #4
    //   428: aload #29
    //   430: invokevirtual c : ()I
    //   433: istore_2
    //   434: aload #25
    //   436: astore #19
    //   438: aload #26
    //   440: astore #25
    //   442: aload #27
    //   444: astore #18
    //   446: aload #24
    //   448: astore #17
    //   450: iload #10
    //   452: istore_1
    //   453: aload #14
    //   455: astore #16
    //   457: aload #13
    //   459: astore #14
    //   461: aload #15
    //   463: astore #24
    //   465: iload_3
    //   466: istore #8
    //   468: goto -> 895
    //   471: aload #23
    //   473: astore #13
    //   475: aload #23
    //   477: ifnull -> 500
    //   480: aload #23
    //   482: astore #13
    //   484: aload #23
    //   486: aload #28
    //   488: getfield b : Ljava/lang/String;
    //   491: invokevirtual equals : (Ljava/lang/Object;)Z
    //   494: ifne -> 500
    //   497: aconst_null
    //   498: astore #13
    //   500: aload #22
    //   502: astore #15
    //   504: aload #22
    //   506: ifnull -> 529
    //   509: aload #22
    //   511: astore #15
    //   513: aload #22
    //   515: aload #28
    //   517: getfield c : Ljava/lang/String;
    //   520: invokevirtual equals : (Ljava/lang/Object;)Z
    //   523: ifne -> 529
    //   526: aconst_null
    //   527: astore #15
    //   529: aload #21
    //   531: astore #22
    //   533: aload #21
    //   535: ifnull -> 558
    //   538: aload #21
    //   540: astore #22
    //   542: aload #21
    //   544: aload #28
    //   546: getfield e : Ljava/lang/String;
    //   549: invokevirtual equals : (Ljava/lang/Object;)Z
    //   552: ifne -> 558
    //   555: aconst_null
    //   556: astore #22
    //   558: aload #20
    //   560: astore #21
    //   562: aload #20
    //   564: ifnull -> 584
    //   567: aload #20
    //   569: astore #21
    //   571: aload #20
    //   573: aload #26
    //   575: invokevirtual equals : (Ljava/lang/Object;)Z
    //   578: ifne -> 584
    //   581: aconst_null
    //   582: astore #21
    //   584: aload #19
    //   586: astore #20
    //   588: aload #19
    //   590: ifnull -> 610
    //   593: aload #19
    //   595: astore #20
    //   597: aload #19
    //   599: aload #25
    //   601: invokevirtual equals : (Ljava/lang/Object;)Z
    //   604: ifne -> 610
    //   607: aconst_null
    //   608: astore #20
    //   610: aload #18
    //   612: astore #26
    //   614: aload #18
    //   616: ifnull -> 636
    //   619: aload #18
    //   621: astore #26
    //   623: aload #18
    //   625: aload #27
    //   627: invokevirtual equals : (Ljava/lang/Object;)Z
    //   630: ifne -> 636
    //   633: aconst_null
    //   634: astore #26
    //   636: aload #17
    //   638: astore #27
    //   640: aload #17
    //   642: ifnull -> 662
    //   645: aload #17
    //   647: astore #27
    //   649: aload #17
    //   651: aload #24
    //   653: invokevirtual equals : (Ljava/lang/Object;)Z
    //   656: ifne -> 662
    //   659: aconst_null
    //   660: astore #27
    //   662: aload #16
    //   664: ifnull -> 683
    //   667: aload #16
    //   669: aload #14
    //   671: invokevirtual equals : (Ljava/lang/Object;)Z
    //   674: ifne -> 683
    //   677: aconst_null
    //   678: astore #28
    //   680: goto -> 690
    //   683: aload #16
    //   685: astore #28
    //   687: goto -> 680
    //   690: iload #4
    //   692: iconst_m1
    //   693: if_icmpeq -> 712
    //   696: iload #4
    //   698: aload #29
    //   700: invokevirtual l : ()I
    //   703: if_icmpeq -> 712
    //   706: iconst_m1
    //   707: istore #5
    //   709: goto -> 719
    //   712: iload #4
    //   714: istore #5
    //   716: goto -> 709
    //   719: iload_2
    //   720: iconst_m1
    //   721: if_icmpeq -> 742
    //   724: iload_2
    //   725: aload #29
    //   727: invokevirtual c : ()I
    //   730: if_icmpeq -> 742
    //   733: iconst_m1
    //   734: istore #6
    //   736: iload_1
    //   737: istore #9
    //   739: goto -> 748
    //   742: iload_2
    //   743: istore #6
    //   745: goto -> 736
    //   748: iload #9
    //   750: istore_1
    //   751: iload #6
    //   753: istore_2
    //   754: iload #5
    //   756: istore #4
    //   758: aload #13
    //   760: astore #23
    //   762: aload #15
    //   764: astore #14
    //   766: aload #22
    //   768: astore #24
    //   770: aload #21
    //   772: astore #25
    //   774: aload #20
    //   776: astore #19
    //   778: aload #26
    //   780: astore #18
    //   782: aload #27
    //   784: astore #17
    //   786: aload #28
    //   788: astore #16
    //   790: iload_3
    //   791: istore #8
    //   793: iload #9
    //   795: iconst_m1
    //   796: if_icmpeq -> 895
    //   799: iload #9
    //   801: istore_1
    //   802: iload #6
    //   804: istore_2
    //   805: iload #5
    //   807: istore #4
    //   809: aload #13
    //   811: astore #23
    //   813: aload #15
    //   815: astore #14
    //   817: aload #22
    //   819: astore #24
    //   821: aload #21
    //   823: astore #25
    //   825: aload #20
    //   827: astore #19
    //   829: aload #26
    //   831: astore #18
    //   833: aload #27
    //   835: astore #17
    //   837: aload #28
    //   839: astore #16
    //   841: iload_3
    //   842: istore #8
    //   844: iload #9
    //   846: iload #10
    //   848: if_icmpeq -> 895
    //   851: iconst_m1
    //   852: istore_1
    //   853: iload_3
    //   854: istore #8
    //   856: aload #28
    //   858: astore #16
    //   860: aload #27
    //   862: astore #17
    //   864: aload #26
    //   866: astore #18
    //   868: aload #20
    //   870: astore #19
    //   872: aload #21
    //   874: astore #25
    //   876: aload #22
    //   878: astore #24
    //   880: aload #15
    //   882: astore #14
    //   884: aload #13
    //   886: astore #23
    //   888: iload #5
    //   890: istore #4
    //   892: iload #6
    //   894: istore_2
    //   895: iinc #7, 1
    //   898: aload #14
    //   900: astore #22
    //   902: aload #24
    //   904: astore #21
    //   906: aload #25
    //   908: astore #20
    //   910: iload #8
    //   912: istore_3
    //   913: goto -> 41
    //   916: new java/lang/InterruptedException
    //   919: dup
    //   920: invokespecial <init> : ()V
    //   923: athrow
    //   924: aload #23
    //   926: ifnull -> 942
    //   929: aload_0
    //   930: invokevirtual getIntent : ()Landroid/content/Intent;
    //   933: ldc_w 'tl'
    //   936: aload #23
    //   938: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   941: pop
    //   942: aload #22
    //   944: ifnull -> 960
    //   947: aload_0
    //   948: invokevirtual getIntent : ()Landroid/content/Intent;
    //   951: ldc_w 'al'
    //   954: aload #22
    //   956: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   959: pop
    //   960: aload #21
    //   962: ifnull -> 978
    //   965: aload_0
    //   966: invokevirtual getIntent : ()Landroid/content/Intent;
    //   969: ldc_w 'ar'
    //   972: aload #21
    //   974: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   977: pop
    //   978: aload #20
    //   980: ifnull -> 996
    //   983: aload_0
    //   984: invokevirtual getIntent : ()Landroid/content/Intent;
    //   987: ldc_w 'alar'
    //   990: aload #20
    //   992: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   995: pop
    //   996: aload #19
    //   998: ifnull -> 1014
    //   1001: aload_0
    //   1002: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1005: ldc_w 'cm'
    //   1008: aload #19
    //   1010: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1013: pop
    //   1014: aload #18
    //   1016: ifnull -> 1032
    //   1019: aload_0
    //   1020: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1023: ldc_w 'gn'
    //   1026: aload #18
    //   1028: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1031: pop
    //   1032: aload #17
    //   1034: ifnull -> 1050
    //   1037: aload_0
    //   1038: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1041: ldc_w 'cmt'
    //   1044: aload #17
    //   1046: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1049: pop
    //   1050: aload #16
    //   1052: ifnull -> 1068
    //   1055: aload_0
    //   1056: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1059: ldc_w 'lrst'
    //   1062: aload #16
    //   1064: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1067: pop
    //   1068: iload #4
    //   1070: iconst_m1
    //   1071: if_icmpeq -> 1090
    //   1074: aload_0
    //   1075: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1078: ldc_w 'trn'
    //   1081: iload #4
    //   1083: invokestatic valueOf : (I)Ljava/lang/String;
    //   1086: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1089: pop
    //   1090: iload_2
    //   1091: iconst_m1
    //   1092: if_icmpeq -> 1110
    //   1095: aload_0
    //   1096: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1099: ldc_w 'dcn'
    //   1102: iload_2
    //   1103: invokestatic valueOf : (I)Ljava/lang/String;
    //   1106: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1109: pop
    //   1110: iload_1
    //   1111: iconst_m1
    //   1112: if_icmpeq -> 1130
    //   1115: aload_0
    //   1116: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1119: ldc_w 'yr'
    //   1122: iload_1
    //   1123: invokestatic valueOf : (I)Ljava/lang/String;
    //   1126: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1129: pop
    //   1130: aload_0
    //   1131: invokevirtual t0 : ()Z
    //   1134: ifne -> 1772
    //   1137: aload #24
    //   1139: invokevirtual size : ()I
    //   1142: ifne -> 1172
    //   1145: iconst_1
    //   1146: aload_0
    //   1147: ldc_w 2131886566
    //   1150: invokevirtual getString : (I)Ljava/lang/String;
    //   1153: iconst_1
    //   1154: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   1157: aload_0
    //   1158: invokevirtual finish : ()V
    //   1161: aload_0
    //   1162: iconst_1
    //   1163: putfield W : Z
    //   1166: aload_0
    //   1167: aconst_null
    //   1168: putfield V : Ljava/lang/Thread;
    //   1171: return
    //   1172: aconst_null
    //   1173: astore #13
    //   1175: aload #24
    //   1177: invokevirtual size : ()I
    //   1180: iconst_1
    //   1181: if_icmple -> 1190
    //   1184: iconst_1
    //   1185: istore #11
    //   1187: goto -> 1193
    //   1190: iconst_0
    //   1191: istore #11
    //   1193: aload_0
    //   1194: iload #11
    //   1196: putfield u1 : Z
    //   1199: iload #11
    //   1201: ifeq -> 1214
    //   1204: aload_0
    //   1205: iconst_0
    //   1206: putfield J0 : Z
    //   1209: aload_0
    //   1210: iconst_0
    //   1211: putfield I0 : Z
    //   1214: iload_3
    //   1215: ifne -> 1228
    //   1218: aload_0
    //   1219: iconst_0
    //   1220: putfield Q0 : Z
    //   1223: aload_0
    //   1224: iconst_0
    //   1225: putfield I0 : Z
    //   1228: aload_0
    //   1229: getfield K0 : Z
    //   1232: ifeq -> 1315
    //   1235: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1238: getfield c : Llm0;
    //   1241: invokevirtual e : ()Ljava/util/ArrayList;
    //   1244: astore #15
    //   1246: new java/util/ArrayList
    //   1249: dup
    //   1250: aload #15
    //   1252: invokevirtual size : ()I
    //   1255: invokespecial <init> : (I)V
    //   1258: astore #12
    //   1260: aload #15
    //   1262: invokevirtual size : ()I
    //   1265: istore_2
    //   1266: iconst_0
    //   1267: istore_1
    //   1268: iload_1
    //   1269: iload_2
    //   1270: if_icmpge -> 1301
    //   1273: aload #15
    //   1275: iload_1
    //   1276: invokevirtual get : (I)Ljava/lang/Object;
    //   1279: astore #16
    //   1281: iinc #1, 1
    //   1284: aload #12
    //   1286: aload #16
    //   1288: checkcast q3
    //   1291: getfield c : Ljava/lang/String;
    //   1294: invokevirtual add : (Ljava/lang/Object;)Z
    //   1297: pop
    //   1298: goto -> 1268
    //   1301: aload_0
    //   1302: new t8
    //   1305: dup
    //   1306: aload_0
    //   1307: aload #12
    //   1309: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;Ljava/util/List;)V
    //   1312: putfield y1 : Lt8;
    //   1315: aload_0
    //   1316: getfield L0 : Z
    //   1319: ifeq -> 1402
    //   1322: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1325: getfield c : Llm0;
    //   1328: invokevirtual f : ()Ljava/util/ArrayList;
    //   1331: astore #12
    //   1333: new java/util/ArrayList
    //   1336: dup
    //   1337: aload #12
    //   1339: invokevirtual size : ()I
    //   1342: invokespecial <init> : (I)V
    //   1345: astore #16
    //   1347: aload #12
    //   1349: invokevirtual size : ()I
    //   1352: istore_2
    //   1353: iconst_0
    //   1354: istore_1
    //   1355: iload_1
    //   1356: iload_2
    //   1357: if_icmpge -> 1388
    //   1360: aload #12
    //   1362: iload_1
    //   1363: invokevirtual get : (I)Ljava/lang/Object;
    //   1366: astore #15
    //   1368: iinc #1, 1
    //   1371: aload #16
    //   1373: aload #15
    //   1375: checkcast q3
    //   1378: getfield c : Ljava/lang/String;
    //   1381: invokevirtual add : (Ljava/lang/Object;)Z
    //   1384: pop
    //   1385: goto -> 1355
    //   1388: aload_0
    //   1389: new t8
    //   1392: dup
    //   1393: aload_0
    //   1394: aload #16
    //   1396: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;Ljava/util/List;)V
    //   1399: putfield z1 : Lt8;
    //   1402: aload_0
    //   1403: getfield M0 : Z
    //   1406: ifeq -> 1489
    //   1409: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1412: getfield c : Llm0;
    //   1415: invokevirtual d : ()Ljava/util/ArrayList;
    //   1418: astore #15
    //   1420: new java/util/ArrayList
    //   1423: dup
    //   1424: aload #15
    //   1426: invokevirtual size : ()I
    //   1429: invokespecial <init> : (I)V
    //   1432: astore #16
    //   1434: aload #15
    //   1436: invokevirtual size : ()I
    //   1439: istore_2
    //   1440: iconst_0
    //   1441: istore_1
    //   1442: iload_1
    //   1443: iload_2
    //   1444: if_icmpge -> 1475
    //   1447: aload #15
    //   1449: iload_1
    //   1450: invokevirtual get : (I)Ljava/lang/Object;
    //   1453: astore #12
    //   1455: iinc #1, 1
    //   1458: aload #16
    //   1460: aload #12
    //   1462: checkcast q3
    //   1465: getfield c : Ljava/lang/String;
    //   1468: invokevirtual add : (Ljava/lang/Object;)Z
    //   1471: pop
    //   1472: goto -> 1442
    //   1475: aload_0
    //   1476: new t8
    //   1479: dup
    //   1480: aload_0
    //   1481: aload #16
    //   1483: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;Ljava/util/List;)V
    //   1486: putfield A1 : Lt8;
    //   1489: aload_0
    //   1490: getfield N0 : Z
    //   1493: ifeq -> 1576
    //   1496: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1499: getfield c : Llm0;
    //   1502: invokevirtual g : ()Ljava/util/ArrayList;
    //   1505: astore #15
    //   1507: new java/util/ArrayList
    //   1510: dup
    //   1511: aload #15
    //   1513: invokevirtual size : ()I
    //   1516: invokespecial <init> : (I)V
    //   1519: astore #16
    //   1521: aload #15
    //   1523: invokevirtual size : ()I
    //   1526: istore_2
    //   1527: iconst_0
    //   1528: istore_1
    //   1529: iload_1
    //   1530: iload_2
    //   1531: if_icmpge -> 1562
    //   1534: aload #15
    //   1536: iload_1
    //   1537: invokevirtual get : (I)Ljava/lang/Object;
    //   1540: astore #12
    //   1542: iinc #1, 1
    //   1545: aload #16
    //   1547: aload #12
    //   1549: checkcast q3
    //   1552: getfield c : Ljava/lang/String;
    //   1555: invokevirtual add : (Ljava/lang/Object;)Z
    //   1558: pop
    //   1559: goto -> 1529
    //   1562: aload_0
    //   1563: new t8
    //   1566: dup
    //   1567: aload_0
    //   1568: aload #16
    //   1570: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;Ljava/util/List;)V
    //   1573: putfield B1 : Lt8;
    //   1576: aload_0
    //   1577: getfield O0 : Z
    //   1580: ifeq -> 1663
    //   1583: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1586: getfield c : Llm0;
    //   1589: invokevirtual h : ()Ljava/util/ArrayList;
    //   1592: astore #12
    //   1594: new java/util/ArrayList
    //   1597: dup
    //   1598: aload #12
    //   1600: invokevirtual size : ()I
    //   1603: invokespecial <init> : (I)V
    //   1606: astore #15
    //   1608: aload #12
    //   1610: invokevirtual size : ()I
    //   1613: istore_2
    //   1614: iconst_0
    //   1615: istore_1
    //   1616: iload_1
    //   1617: iload_2
    //   1618: if_icmpge -> 1649
    //   1621: aload #12
    //   1623: iload_1
    //   1624: invokevirtual get : (I)Ljava/lang/Object;
    //   1627: astore #16
    //   1629: iinc #1, 1
    //   1632: aload #15
    //   1634: aload #16
    //   1636: checkcast q3
    //   1639: getfield c : Ljava/lang/String;
    //   1642: invokevirtual add : (Ljava/lang/Object;)Z
    //   1645: pop
    //   1646: goto -> 1616
    //   1649: aload_0
    //   1650: new t8
    //   1653: dup
    //   1654: aload_0
    //   1655: aload #15
    //   1657: invokespecial <init> : (Lin/krosbits/musicolet/Tag2Activity;Ljava/util/List;)V
    //   1660: putfield C1 : Lt8;
    //   1663: aload_0
    //   1664: getfield u1 : Z
    //   1667: ifne -> 1752
    //   1670: aload_0
    //   1671: getfield H0 : Z
    //   1674: ifeq -> 1752
    //   1677: aload #24
    //   1679: iconst_0
    //   1680: invokevirtual get : (I)Ljava/lang/Object;
    //   1683: checkcast u51
    //   1686: getfield a : Ljava/lang/Object;
    //   1689: checkcast u00
    //   1692: invokestatic j : (Lu00;)[B
    //   1695: astore #15
    //   1697: aload #13
    //   1699: astore #12
    //   1701: aload #15
    //   1703: ifnull -> 1729
    //   1706: aload #15
    //   1708: iconst_0
    //   1709: iconst_0
    //   1710: invokestatic b : ([BII)Landroid/graphics/Bitmap;
    //   1713: astore #12
    //   1715: goto -> 1729
    //   1718: astore #12
    //   1720: aload #12
    //   1722: invokevirtual printStackTrace : ()V
    //   1725: aload #13
    //   1727: astore #12
    //   1729: aload #12
    //   1731: ifnull -> 1747
    //   1734: aload #12
    //   1736: invokevirtual recycle : ()V
    //   1739: aload_0
    //   1740: iconst_1
    //   1741: putfield D1 : Z
    //   1744: goto -> 1752
    //   1747: aload_0
    //   1748: iconst_0
    //   1749: putfield D1 : Z
    //   1752: aload #14
    //   1754: new e6
    //   1757: dup
    //   1758: bipush #23
    //   1760: aload_0
    //   1761: invokestatic currentThread : ()Ljava/lang/Thread;
    //   1764: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1767: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1770: pop
    //   1771: return
    //   1772: new java/lang/InterruptedException
    //   1775: dup
    //   1776: invokespecial <init> : ()V
    //   1779: athrow
    // Exception table:
    //   from	to	target	type
    //   148	155	171	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   148	155	171	org/jaudiotagger/tag/TagException
    //   148	155	171	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   148	155	158	finally
    //   173	180	158	finally
    //   183	190	374	finally
    //   213	219	369	finally
    //   224	247	250	finally
    //   265	277	360	finally
    //   282	289	296	finally
    //   305	344	355	finally
    //   1677	1697	1718	finally
    //   1706	1715	1718	finally
  }
  
  public final void w0(Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield U : Lo3;
    //   4: astore #5
    //   6: aconst_null
    //   7: astore #4
    //   9: aload #5
    //   11: ifnull -> 37
    //   14: aload #5
    //   16: getfield b : Lss0;
    //   19: astore #6
    //   21: aload #6
    //   23: ifnull -> 37
    //   26: aload #6
    //   28: invokevirtual dismiss : ()V
    //   31: aload #5
    //   33: aconst_null
    //   34: putfield b : Lss0;
    //   37: aload_1
    //   38: invokevirtual getData : ()Landroid/net/Uri;
    //   41: astore_1
    //   42: aload_0
    //   43: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   46: aload_1
    //   47: invokevirtual openInputStream : (Landroid/net/Uri;)Ljava/io/InputStream;
    //   50: astore #6
    //   52: new java/io/File
    //   55: astore #5
    //   57: aload #5
    //   59: aload_0
    //   60: invokevirtual getCacheDir : ()Ljava/io/File;
    //   63: ldc_w 't'
    //   66: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   69: new java/io/FileOutputStream
    //   72: astore_1
    //   73: aload_1
    //   74: aload #5
    //   76: invokespecial <init> : (Ljava/io/File;)V
    //   79: sipush #1024
    //   82: newarray byte
    //   84: astore #7
    //   86: aload #6
    //   88: aload #7
    //   90: invokevirtual read : ([B)I
    //   93: istore_3
    //   94: iconst_0
    //   95: istore_2
    //   96: iload_3
    //   97: ifle -> 123
    //   100: aload_1
    //   101: aload #7
    //   103: iconst_0
    //   104: iload_3
    //   105: invokevirtual write : ([BII)V
    //   108: goto -> 86
    //   111: astore_1
    //   112: goto -> 318
    //   115: astore_1
    //   116: goto -> 300
    //   119: astore_1
    //   120: goto -> 307
    //   123: aload_1
    //   124: invokevirtual flush : ()V
    //   127: aload_1
    //   128: invokevirtual close : ()V
    //   131: aload #6
    //   133: invokevirtual close : ()V
    //   136: new j60
    //   139: astore_1
    //   140: aload_1
    //   141: aload #5
    //   143: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: aload_1
    //   150: ldc_w 'Orientation'
    //   153: invokevirtual c : (Ljava/lang/String;)Lf60;
    //   156: astore #6
    //   158: aload #6
    //   160: ifnonnull -> 166
    //   163: goto -> 178
    //   166: aload #6
    //   168: aload_1
    //   169: getfield f : Ljava/nio/ByteOrder;
    //   172: invokevirtual e : (Ljava/nio/ByteOrder;)I
    //   175: istore_3
    //   176: iload_3
    //   177: istore_2
    //   178: aload #5
    //   180: invokestatic s : (Ljava/io/File;)Lcd1;
    //   183: astore_1
    //   184: getstatic p3.a : Ljava/util/HashMap;
    //   187: astore #6
    //   189: aload_1
    //   190: ldc_w 'r'
    //   193: invokestatic J : (Lu00;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   196: astore #6
    //   198: aload #6
    //   200: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   203: sipush #800
    //   206: sipush #800
    //   209: invokestatic o : (Ljava/io/FileDescriptor;II)Landroid/graphics/Bitmap;
    //   212: astore_1
    //   213: aload #6
    //   215: invokevirtual close : ()V
    //   218: aload #5
    //   220: invokevirtual delete : ()Z
    //   223: pop
    //   224: aload_1
    //   225: astore #4
    //   227: aload_1
    //   228: ifnull -> 251
    //   231: aload_1
    //   232: iload_2
    //   233: invokestatic u0 : (Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   236: astore #4
    //   238: goto -> 251
    //   241: astore #4
    //   243: aload #4
    //   245: invokevirtual printStackTrace : ()V
    //   248: aload_1
    //   249: astore #4
    //   251: new java/io/FileOutputStream
    //   254: astore_1
    //   255: aload_1
    //   256: aload_0
    //   257: getfield t1 : Ljava/io/File;
    //   260: invokespecial <init> : (Ljava/io/File;)V
    //   263: aload #4
    //   265: getstatic android/graphics/Bitmap$CompressFormat.JPEG : Landroid/graphics/Bitmap$CompressFormat;
    //   268: bipush #90
    //   270: aload_1
    //   271: invokevirtual compress : (Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   274: pop
    //   275: aload_1
    //   276: invokevirtual flush : ()V
    //   279: aload_1
    //   280: invokevirtual close : ()V
    //   283: aload_0
    //   284: iconst_1
    //   285: putfield s1 : I
    //   288: aload #4
    //   290: invokevirtual recycle : ()V
    //   293: aload_0
    //   294: invokevirtual E0 : ()V
    //   297: goto -> 317
    //   300: aload_1
    //   301: invokevirtual printStackTrace : ()V
    //   304: goto -> 293
    //   307: aload_1
    //   308: invokevirtual printStackTrace : ()V
    //   311: invokestatic gc : ()V
    //   314: goto -> 293
    //   317: return
    //   318: aload_0
    //   319: invokevirtual E0 : ()V
    //   322: aload_1
    //   323: athrow
    //   324: astore_1
    //   325: goto -> 178
    //   328: astore_1
    //   329: aload #4
    //   331: astore_1
    //   332: goto -> 213
    //   335: astore #4
    //   337: goto -> 218
    // Exception table:
    //   from	to	target	type
    //   37	86	119	java/lang/OutOfMemoryError
    //   37	86	115	java/lang/Exception
    //   37	86	111	finally
    //   86	94	119	java/lang/OutOfMemoryError
    //   86	94	115	java/lang/Exception
    //   86	94	111	finally
    //   100	108	119	java/lang/OutOfMemoryError
    //   100	108	115	java/lang/Exception
    //   100	108	111	finally
    //   123	158	119	java/lang/OutOfMemoryError
    //   123	158	115	java/lang/Exception
    //   123	158	111	finally
    //   166	176	324	java/lang/NumberFormatException
    //   166	176	119	java/lang/OutOfMemoryError
    //   166	176	115	java/lang/Exception
    //   166	176	111	finally
    //   178	198	119	java/lang/OutOfMemoryError
    //   178	198	115	java/lang/Exception
    //   178	198	111	finally
    //   198	213	328	finally
    //   213	218	335	finally
    //   218	224	119	java/lang/OutOfMemoryError
    //   218	224	115	java/lang/Exception
    //   218	224	111	finally
    //   231	238	241	finally
    //   243	248	119	java/lang/OutOfMemoryError
    //   243	248	115	java/lang/Exception
    //   243	248	111	finally
    //   251	293	119	java/lang/OutOfMemoryError
    //   251	293	115	java/lang/Exception
    //   251	293	111	finally
    //   300	304	111	finally
    //   307	314	111	finally
  }
  
  public final void x0() {
    getIntent().putExtra("ATCDLG", true);
    this.E0.requestFocus();
    if (this.r0.getVisibility() == 0) {
      this.r0.requestFocus();
    } else if (this.x0.getVisibility() == 0) {
      this.x0.requestFocus();
    } 
    o3 o31 = this.U;
    if (o31 != null) {
      o31.a();
      return;
    } 
    un un = new un(9, this);
    Object object = new Object();
    a3 a3 = new a3(1, object);
    ((o3)object).j = a3;
    ((o3)object).e = this;
    ((o3)object).c = LayoutInflater.from((Context)this);
    ((o3)object).g = un;
    ms0 ms0 = new ms0((Context)this);
    ms0.e(2131492948, true);
    ms0.q(2131886345);
    RecyclerView recyclerView = (RecyclerView)ms0.u.findViewById(2131297417);
    ((o3)object).f = recyclerView;
    ((o3)object).h = (TextView)ms0.u.findViewById(2131297620);
    recyclerView.setLayoutManager((a)new LinearLayoutManager(0));
    recyclerView.setAdapter((id1)a3);
    MaterialButton materialButton1 = (MaterialButton)ms0.u.findViewById(2131296443);
    MaterialButton materialButton2 = (MaterialButton)ms0.u.findViewById(2131296439);
    materialButton1.setText((CharSequence)Html.fromHtml(MyApplication.i.getApplicationContext().getString(2131886646)));
    materialButton2.setText((CharSequence)Html.fromHtml(MyApplication.i.getApplicationContext().getString(2131886468)));
    materialButton1.setOnClickListener((View.OnClickListener)object);
    materialButton2.setOnClickListener((View.OnClickListener)object);
    ms0.W = (DialogInterface.OnDismissListener)object;
    ms0.Y = (DialogInterface.OnShowListener)object;
    ss0 ss01 = new ss0(ms0);
    ((o3)object).b = ss01;
    ss01.show();
    this.U = (o3)object;
  }
  
  public final void y0(boolean paramBoolean) {
    z0((Activity)this, this.r0.getText().toString(), this.x0.getText().toString(), this.y0.getText().toString(), this.U0, ((v00)((u51)this.w1.get(0)).a).j().toString(), false, null, false, paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\Tag2Activity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */