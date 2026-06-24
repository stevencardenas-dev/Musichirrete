import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public class lb1 extends ua0 implements qy0, b91, View.OnClickListener, ob, sb1 {
  public static boolean A0;
  
  public static final int[] B0 = new int[] { 
      1000, 1002, 0, 1, 2, 3, 38, 39, 28, 29, 
      30, 31, 4, 5, 6, 7, 8, 9, 24, 25, 
      26, 27, 12, 13, 10, 11, 14, 15, 16, 17, 
      18, 19, 20, 21, 22, 23, 1004 };
  
  public static final int[] C0 = new int[] { 
      2131887140, 2131887235, 2131887509, 2131887510, 2131886569, 2131886564, 2131886567, 2131886568, 2131886586, 2131886589, 
      2131886583, 2131886584, 2131886139, 2131886140, 2131886206, 2131886207, 2131886151, 2131886152, 2131886395, 2131886396, 
      2131886625, 2131886626, 2131887516, 2131887517, 2131886477, 2131886478, 2131887602, 2131887603, 2131886431, 2131886432, 
      2131886427, 2131886428, 2131886434, 2131886435, 2131886843, 2131886725, 2131886131 };
  
  public SmartTextView a0;
  
  public TextView b0;
  
  public int c0;
  
  public oz d0;
  
  public MusicActivity e0;
  
  public SmartImageView f0;
  
  public SmartImageView g0;
  
  public SmartImageView h0;
  
  public SmartImageView i0;
  
  public SmartImageView j0;
  
  public SmartTextView k0;
  
  public Bundle l0;
  
  public RecyclerView m0;
  
  public mb1 n0;
  
  public ss0 o0;
  
  public km0 p0;
  
  public int q0;
  
  public RecyclerViewScrollBar r0;
  
  public ij0 s0;
  
  public long t0;
  
  public boolean u0;
  
  public tj v0;
  
  public tj w0;
  
  public tj x0;
  
  public final StyleSpan y0;
  
  public Boolean z0;
  
  public lb1() {
    new Handler(Looper.getMainLooper());
    this.y0 = new StyleSpan(1);
    this.z0 = null;
  }
  
  public final void A() {
    my0.g(this.n0.d.g(MusicService.C0));
  }
  
  public final void D0() {
    MusicActivity musicActivity = this.e0;
    if (musicActivity != null && musicActivity.j0 != null && MusicService.P0 != null) {
      boolean bool1;
      boolean bool2;
      Bundle bundle = this.l0;
      boolean bool3 = true;
      if (bundle != null) {
        boolean bool4;
        if (MusicService.H0) {
          this.c0 = MusicService.I0;
          MusicService.H0 = false;
          bool4 = true;
        } else {
          this.c0 = bundle.getInt("spinnerPos");
          bool4 = false;
        } 
        bool1 = bool4;
        if (this.c0 >= (MyApplication.h()).b.size()) {
          this.c0 = (MyApplication.h()).b.size() - 1;
          bool1 = bool4;
        } 
      } else {
        boolean bool4;
        if (MusicService.H0) {
          this.c0 = MusicService.I0;
          MusicService.H0 = false;
          bool4 = true;
        } else {
          this.c0 = (MyApplication.h()).c;
          bool4 = false;
        } 
        bool1 = bool4;
        if (this.c0 >= (MyApplication.h()).b.size()) {
          this.c0 = (MyApplication.h()).b.size() - 1;
          bool1 = bool4;
        } 
      } 
      Context context = P();
      xn1 xn1 = (MyApplication.h()).b.get(this.c0);
      MusicService musicService = this.e0.j0;
      if ((MyApplication.h()).c == this.c0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      boolean bool = this.e0.x0.getBoolean("k_b_aaquet", true);
      id1 id1 = new id1();
      ((mb1)id1).e = LayoutInflater.from(context);
      ((mb1)id1).d = xn1;
      ((mb1)id1).g = this;
      ((mb1)id1).f = bool2;
      ((mb1)id1).i = bool;
      this.n0 = (mb1)id1;
      SmartTextView smartTextView1 = this.a0;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(this.c0 + 1);
      stringBuilder2.append(". ");
      stringBuilder2.append(((xn1)(MyApplication.h()).b.get(this.c0)).h);
      smartTextView1.setText(stringBuilder2.toString());
      SmartTextView smartTextView2 = this.a0;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(T(2131886419));
      stringBuilder1.append(this.a0.getText());
      stringBuilder1.append(".");
      smartTextView2.setContentDescription(stringBuilder1.toString());
      this.a0.setSelected(true);
      if (this.c0 == (MyApplication.h()).c) {
        bool2 = bool3;
      } else {
        bool2 = false;
      } 
      I0(bool2);
      G0();
      this.m0.setAdapter(this.n0);
      mb1 mb11 = this.n0;
      gj0 gj0 = new gj0();
      ((f10)gj0).d = mb11;
      ij0 ij01 = new ij0(gj0);
      this.s0 = ij01;
      ij01.g(this.m0);
      if (bool1) {
        this.m0.post(new kb1(this, 0));
      } else {
        Bundle bundle1 = this.l0;
        RecyclerView recyclerView = this.m0;
        if (bundle1 != null) {
          recyclerView.getLayoutManager().s0(this.l0.getParcelable("rv"));
        } else {
          recyclerView.getLayoutManager().E0(this.n0.d.e(MusicService.C0));
        } 
      } 
      this.l0 = null;
      this.r0.setRecyclerView(this.m0);
      F0();
    } 
  }
  
  public final void E0(int paramInt) {
    this.p0 = this.n0.d.h(paramInt, MusicService.C0);
    this.q0 = paramInt;
    ms0 ms0 = new ms0(P());
    View view1 = LayoutInflater.from(P()).inflate(2131493014, null);
    TextView textView = (TextView)view1.findViewById(2131297873);
    ImageView imageView = (ImageView)view1.findViewById(2131296860);
    textView.setText(ag0.W(this.p0));
    if (c81.c(P()).c(this.p0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener(new ag(8, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view1.findViewById(2131296973);
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    View view2 = linearLayout.findViewById(2131297034);
    if (view2 instanceof TextView) {
      TextView textView1 = (TextView)view2;
      if (this.p0.equals(MusicService.P0.i)) {
        textView1.setText(2131887194);
      } else {
        textView1.setText(2131887453);
      } 
    } 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0.f(view1, false);
    ss0 ss01 = this.o0;
    if (ss01 != null && ss01.isShowing())
      this.o0.dismiss(); 
    this.o0 = ms0.p();
  }
  
  public final void F0() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: lconst_0
    //   3: lstore #5
    //   5: aload_0
    //   6: getfield n0 : Lmb1;
    //   9: getfield d : Lxn1;
    //   12: getfield b : Ljava/util/ArrayList;
    //   15: invokevirtual size : ()I
    //   18: istore #4
    //   20: lload #5
    //   22: lstore #7
    //   24: iload #4
    //   26: ifle -> 224
    //   29: lload #5
    //   31: lstore #7
    //   33: aload_0
    //   34: getfield n0 : Lmb1;
    //   37: getfield d : Lxn1;
    //   40: astore #14
    //   42: lload #5
    //   44: lstore #7
    //   46: aload #14
    //   48: getfield k : Ljava/lang/Long;
    //   51: astore #15
    //   53: aload #15
    //   55: ifnonnull -> 170
    //   58: lload #5
    //   60: lstore #7
    //   62: aload #14
    //   64: getfield b : Ljava/util/ArrayList;
    //   67: astore #15
    //   69: lload #5
    //   71: lstore #7
    //   73: getstatic ag0.a : Ljava/lang/String;
    //   76: astore #16
    //   78: aload #15
    //   80: ifnull -> 146
    //   83: lload #5
    //   85: lstore #7
    //   87: aload #15
    //   89: invokevirtual size : ()I
    //   92: istore_2
    //   93: iconst_0
    //   94: istore_1
    //   95: lconst_0
    //   96: lstore #9
    //   98: lload #9
    //   100: lstore #11
    //   102: iload_1
    //   103: iload_2
    //   104: if_icmpge -> 149
    //   107: lload #5
    //   109: lstore #7
    //   111: aload #15
    //   113: iload_1
    //   114: invokevirtual get : (I)Ljava/lang/Object;
    //   117: astore #16
    //   119: iinc #1, 1
    //   122: lload #5
    //   124: lstore #7
    //   126: lload #9
    //   128: aload #16
    //   130: checkcast km0
    //   133: getfield c : Lqn1;
    //   136: getfield g : I
    //   139: i2l
    //   140: ladd
    //   141: lstore #9
    //   143: goto -> 98
    //   146: lconst_0
    //   147: lstore #11
    //   149: lload #5
    //   151: lstore #7
    //   153: aload #14
    //   155: lload #11
    //   157: invokestatic valueOf : (J)Ljava/lang/Long;
    //   160: putfield k : Ljava/lang/Long;
    //   163: lload #11
    //   165: lstore #5
    //   167: goto -> 181
    //   170: lload #5
    //   172: lstore #7
    //   174: aload #15
    //   176: invokevirtual longValue : ()J
    //   179: lstore #5
    //   181: lload #5
    //   183: lstore #7
    //   185: aload_0
    //   186: getfield n0 : Lmb1;
    //   189: invokevirtual l : ()I
    //   192: istore_1
    //   193: iload_1
    //   194: istore_2
    //   195: iload_1
    //   196: iconst_m1
    //   197: if_icmpne -> 214
    //   200: aload_0
    //   201: getfield n0 : Lmb1;
    //   204: getfield d : Lxn1;
    //   207: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   210: invokevirtual e : (Z)I
    //   213: istore_2
    //   214: iload_2
    //   215: iconst_1
    //   216: iadd
    //   217: istore_1
    //   218: iload #4
    //   220: istore_2
    //   221: goto -> 242
    //   224: iconst_0
    //   225: istore_1
    //   226: lload #7
    //   228: lstore #5
    //   230: iload #4
    //   232: istore_2
    //   233: goto -> 242
    //   236: astore #14
    //   238: iconst_0
    //   239: istore_2
    //   240: iconst_0
    //   241: istore_1
    //   242: lload #5
    //   244: iconst_0
    //   245: iconst_0
    //   246: invokestatic B : (JZI)Ljava/lang/String;
    //   249: astore #14
    //   251: new android/text/SpannableStringBuilder
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: astore #15
    //   260: aload #15
    //   262: iload_1
    //   263: invokestatic valueOf : (I)Ljava/lang/String;
    //   266: aload_0
    //   267: getfield y0 : Landroid/text/style/StyleSpan;
    //   270: bipush #33
    //   272: invokevirtual append : (Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;
    //   275: ldc_w ' / '
    //   278: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   281: iload_2
    //   282: invokestatic valueOf : (I)Ljava/lang/String;
    //   285: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   288: ldc_w '\\n '
    //   291: aload_0
    //   292: getfield x0 : Ltj;
    //   295: iconst_0
    //   296: invokevirtual append : (Ljava/lang/CharSequence;Ljava/lang/Object;I)Landroid/text/SpannableStringBuilder;
    //   299: ldc_w ' '
    //   302: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   305: aload #14
    //   307: invokevirtual append : (Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
    //   310: pop
    //   311: aload_0
    //   312: getfield k0 : Lin/krosbits/android/widgets/SmartTextView;
    //   315: aload #15
    //   317: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   320: aload_0
    //   321: getfield n0 : Lmb1;
    //   324: getfield d : Lxn1;
    //   327: getfield b : Ljava/util/ArrayList;
    //   330: astore #14
    //   332: aload #14
    //   334: ifnull -> 388
    //   337: aload #14
    //   339: invokevirtual size : ()I
    //   342: iconst_3
    //   343: if_icmple -> 388
    //   346: invokestatic o : ()Landroid/content/SharedPreferences;
    //   349: ldc_w 'k_b_qsque'
    //   352: iconst_1
    //   353: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   358: istore #13
    //   360: aload_0
    //   361: getfield b0 : Landroid/widget/TextView;
    //   364: astore #14
    //   366: iload #13
    //   368: ifeq -> 376
    //   371: iload_3
    //   372: istore_1
    //   373: goto -> 379
    //   376: bipush #8
    //   378: istore_1
    //   379: aload #14
    //   381: iload_1
    //   382: invokevirtual setVisibility : (I)V
    //   385: goto -> 397
    //   388: aload_0
    //   389: getfield b0 : Landroid/widget/TextView;
    //   392: bipush #8
    //   394: invokevirtual setVisibility : (I)V
    //   397: return
    //   398: astore #14
    //   400: goto -> 224
    //   403: astore #14
    //   405: iload #4
    //   407: istore_2
    //   408: goto -> 242
    // Exception table:
    //   from	to	target	type
    //   5	20	236	finally
    //   33	42	398	finally
    //   46	53	398	finally
    //   62	69	398	finally
    //   73	78	398	finally
    //   87	93	398	finally
    //   111	119	398	finally
    //   126	143	398	finally
    //   153	163	398	finally
    //   174	181	398	finally
    //   185	193	398	finally
    //   200	214	403	finally
  }
  
  public final void G0() {
    int i = this.c0;
    boolean bool = MusicService.C0;
    if (i == (MyApplication.h()).c) {
      MusicService musicService = MusicService.P0;
      if (musicService != null && !musicService.j) {
        this.g0.setImageResource(2131231061);
        this.g0.setContentDescription(T(2131887090));
        return;
      } 
    } 
    this.g0.setImageResource(2131231063);
    this.g0.setContentDescription(T(2131887223));
  }
  
  public final void H0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   4: astore #5
    //   6: aload #5
    //   8: ifnull -> 605
    //   11: aload #5
    //   13: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   16: ifnull -> 605
    //   19: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   22: ifnonnull -> 28
    //   25: goto -> 605
    //   28: getstatic lb1.A0 : Z
    //   31: ifeq -> 39
    //   34: iconst_0
    //   35: putstatic lb1.A0 : Z
    //   38: return
    //   39: getstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   42: ifeq -> 84
    //   45: iconst_0
    //   46: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   49: aload #5
    //   51: getfield U : Lt32;
    //   54: invokevirtual getCurrentItem : ()I
    //   57: ifne -> 67
    //   60: aload_0
    //   61: getfield u0 : Z
    //   64: ifeq -> 84
    //   67: aload_0
    //   68: iconst_0
    //   69: putfield u0 : Z
    //   72: aload_0
    //   73: getstatic in/krosbits/musicolet/MusicService.I0 : I
    //   76: putfield c0 : I
    //   79: iconst_1
    //   80: istore_1
    //   81: goto -> 86
    //   84: iconst_0
    //   85: istore_1
    //   86: aload_0
    //   87: getfield c0 : I
    //   90: invokestatic h : ()Lwk1;
    //   93: getfield b : Ljava/util/Stack;
    //   96: invokevirtual size : ()I
    //   99: if_icmplt -> 117
    //   102: aload_0
    //   103: invokestatic h : ()Lwk1;
    //   106: getfield b : Ljava/util/Stack;
    //   109: invokevirtual size : ()I
    //   112: iconst_1
    //   113: isub
    //   114: putfield c0 : I
    //   117: aload_0
    //   118: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   121: astore #5
    //   123: new java/lang/StringBuilder
    //   126: astore #6
    //   128: aload #6
    //   130: invokespecial <init> : ()V
    //   133: aload #6
    //   135: aload_0
    //   136: getfield c0 : I
    //   139: iconst_1
    //   140: iadd
    //   141: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload #6
    //   147: ldc_w '. '
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload #6
    //   156: invokestatic h : ()Lwk1;
    //   159: getfield b : Ljava/util/Stack;
    //   162: aload_0
    //   163: getfield c0 : I
    //   166: invokevirtual get : (I)Ljava/lang/Object;
    //   169: checkcast xn1
    //   172: getfield h : Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #5
    //   181: aload #6
    //   183: invokevirtual toString : ()Ljava/lang/String;
    //   186: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   189: aload_0
    //   190: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   193: astore #5
    //   195: new java/lang/StringBuilder
    //   198: astore #6
    //   200: aload #6
    //   202: invokespecial <init> : ()V
    //   205: aload #6
    //   207: aload_0
    //   208: ldc_w 2131886419
    //   211: invokevirtual T : (I)Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload #6
    //   220: aload_0
    //   221: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   224: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   227: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload #6
    //   233: ldc_w '.'
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload #5
    //   242: aload #6
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   250: aload_0
    //   251: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   254: iconst_1
    //   255: invokevirtual setSelected : (Z)V
    //   258: aload_0
    //   259: getfield n0 : Lmb1;
    //   262: astore #7
    //   264: invokestatic h : ()Lwk1;
    //   267: getfield b : Ljava/util/Stack;
    //   270: aload_0
    //   271: getfield c0 : I
    //   274: invokevirtual get : (I)Ljava/lang/Object;
    //   277: checkcast xn1
    //   280: astore #5
    //   282: aload_0
    //   283: getfield c0 : I
    //   286: istore_2
    //   287: aload_0
    //   288: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   291: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   294: astore #6
    //   296: iload_2
    //   297: invokestatic h : ()Lwk1;
    //   300: getfield c : I
    //   303: if_icmpne -> 311
    //   306: iconst_1
    //   307: istore_3
    //   308: goto -> 313
    //   311: iconst_0
    //   312: istore_3
    //   313: aload_0
    //   314: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   317: getfield x0 : Landroid/content/SharedPreferences;
    //   320: ldc 'k_b_aaquet'
    //   322: iconst_1
    //   323: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   328: istore #4
    //   330: aload #7
    //   332: aload #5
    //   334: putfield d : Lxn1;
    //   337: aload #7
    //   339: iload_3
    //   340: putfield f : Z
    //   343: aload #7
    //   345: iload #4
    //   347: putfield i : Z
    //   350: aload_0
    //   351: getfield c0 : I
    //   354: invokestatic h : ()Lwk1;
    //   357: getfield c : I
    //   360: if_icmpne -> 368
    //   363: iconst_1
    //   364: istore_3
    //   365: goto -> 370
    //   368: iconst_0
    //   369: istore_3
    //   370: aload_0
    //   371: iload_3
    //   372: invokevirtual I0 : (Z)V
    //   375: aload_0
    //   376: invokevirtual G0 : ()V
    //   379: aload_0
    //   380: getfield n0 : Lmb1;
    //   383: invokevirtual g : ()V
    //   386: iload_1
    //   387: ifeq -> 413
    //   390: aload_0
    //   391: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   394: aload_0
    //   395: getfield n0 : Lmb1;
    //   398: getfield d : Lxn1;
    //   401: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   404: invokevirtual e : (Z)I
    //   407: invokevirtual k0 : (I)V
    //   410: goto -> 476
    //   413: aload_0
    //   414: getfield l0 : Landroid/os/Bundle;
    //   417: ifnull -> 443
    //   420: aload_0
    //   421: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   424: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   427: aload_0
    //   428: getfield l0 : Landroid/os/Bundle;
    //   431: ldc_w 'rv'
    //   434: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   437: invokevirtual s0 : (Landroid/os/Parcelable;)V
    //   440: goto -> 476
    //   443: aload_0
    //   444: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   447: getfield U : Lt32;
    //   450: invokevirtual getCurrentItem : ()I
    //   453: ifeq -> 476
    //   456: aload_0
    //   457: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   460: aload_0
    //   461: getfield n0 : Lmb1;
    //   464: getfield d : Lxn1;
    //   467: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   470: invokevirtual e : (Z)I
    //   473: invokevirtual k0 : (I)V
    //   476: aload_0
    //   477: getfield r0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   480: aload_0
    //   481: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   484: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   487: aload_0
    //   488: getfield d0 : Loz;
    //   491: astore #5
    //   493: aload #5
    //   495: ifnull -> 523
    //   498: aload #5
    //   500: getfield k : Lss0;
    //   503: invokevirtual isShowing : ()Z
    //   506: ifeq -> 523
    //   509: iload_1
    //   510: ifeq -> 523
    //   513: aload_0
    //   514: getfield d0 : Loz;
    //   517: getfield i : La3;
    //   520: invokevirtual g : ()V
    //   523: aload_0
    //   524: aconst_null
    //   525: putfield l0 : Landroid/os/Bundle;
    //   528: aload_0
    //   529: invokevirtual F0 : ()V
    //   532: aload_0
    //   533: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   536: astore #5
    //   538: aload #5
    //   540: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   543: astore #6
    //   545: aload #6
    //   547: getfield S : Z
    //   550: ifeq -> 605
    //   553: aload #6
    //   555: iconst_0
    //   556: putfield S : Z
    //   559: aload #6
    //   561: getfield P : Z
    //   564: ifeq -> 605
    //   567: aload #5
    //   569: getfield U : Lt32;
    //   572: invokevirtual getCurrentItem : ()I
    //   575: ifne -> 605
    //   578: aload_0
    //   579: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   582: getfield U : Lt32;
    //   585: iconst_1
    //   586: invokevirtual setCurrentItem : (I)V
    //   589: return
    //   590: astore #5
    //   592: aload #5
    //   594: invokevirtual printStackTrace : ()V
    //   597: return
    //   598: astore #5
    //   600: aload #5
    //   602: invokevirtual printStackTrace : ()V
    //   605: return
    // Exception table:
    //   from	to	target	type
    //   117	306	598	finally
    //   313	350	598	finally
    //   532	589	590	finally
  }
  
  public final void I0(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #5
    //   5: aload_0
    //   6: getfield z0 : Ljava/lang/Boolean;
    //   9: astore #6
    //   11: aload #6
    //   13: ifnull -> 29
    //   16: aload #6
    //   18: invokevirtual booleanValue : ()Z
    //   21: iload_1
    //   22: if_icmpeq -> 28
    //   25: goto -> 29
    //   28: return
    //   29: aload_0
    //   30: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   33: astore #6
    //   35: iload_1
    //   36: ifeq -> 256
    //   39: aload #6
    //   41: getstatic android/graphics/Typeface.DEFAULT_BOLD : Landroid/graphics/Typeface;
    //   44: iconst_1
    //   45: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   48: aload_0
    //   49: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   52: iconst_5
    //   53: invokevirtual setTextTintIndex : (I)V
    //   56: aload_0
    //   57: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   60: astore #6
    //   62: aload_0
    //   63: invokevirtual P : ()Landroid/content/Context;
    //   66: astore #7
    //   68: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   71: fstore_2
    //   72: fload_2
    //   73: f2d
    //   74: ldc2_w 1.5
    //   77: dmul
    //   78: d2i
    //   79: istore_3
    //   80: fload_2
    //   81: ldc_w 8.0
    //   84: fmul
    //   85: f2i
    //   86: i2f
    //   87: fstore_2
    //   88: aload #5
    //   90: iconst_3
    //   91: iaload
    //   92: ldc_w 16777215
    //   95: iand
    //   96: istore #4
    //   98: aload #6
    //   100: aload #7
    //   102: iload_3
    //   103: fload_2
    //   104: iload #4
    //   106: ldc_w 1677721600
    //   109: ior
    //   110: iload #4
    //   112: ldc_w 771751936
    //   115: ior
    //   116: aload #5
    //   118: iconst_2
    //   119: iaload
    //   120: aload #5
    //   122: iconst_5
    //   123: iaload
    //   124: ldc_w 16777215
    //   127: iand
    //   128: ldc_w 1040187392
    //   131: ior
    //   132: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   135: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   138: aload_0
    //   139: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   142: astore #5
    //   144: new java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: astore #6
    //   153: aload #6
    //   155: aload_0
    //   156: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   159: invokevirtual getContentDescription : ()Ljava/lang/CharSequence;
    //   162: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload #6
    //   168: aload_0
    //   169: ldc_w 2131887498
    //   172: invokevirtual T : (I)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #5
    //   181: aload #6
    //   183: invokevirtual toString : ()Ljava/lang/String;
    //   186: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   189: aload_0
    //   190: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   193: iconst_5
    //   194: invokevirtual setCompoundDrawableColorIndex : (I)V
    //   197: aload_0
    //   198: getfield f0 : Lin/krosbits/android/widgets/SmartImageView;
    //   201: iconst_5
    //   202: invokevirtual setColorTintIndex : (I)V
    //   205: aload_0
    //   206: getfield g0 : Lin/krosbits/android/widgets/SmartImageView;
    //   209: iconst_5
    //   210: invokevirtual setColorTintIndex : (I)V
    //   213: aload_0
    //   214: getfield h0 : Lin/krosbits/android/widgets/SmartImageView;
    //   217: iconst_5
    //   218: invokevirtual setColorTintIndex : (I)V
    //   221: aload_0
    //   222: getfield i0 : Lin/krosbits/android/widgets/SmartImageView;
    //   225: iconst_5
    //   226: invokevirtual setColorTintIndex : (I)V
    //   229: aload_0
    //   230: getfield j0 : Lin/krosbits/android/widgets/SmartImageView;
    //   233: iconst_5
    //   234: invokevirtual setColorTintIndex : (I)V
    //   237: aload_0
    //   238: getfield k0 : Lin/krosbits/android/widgets/SmartTextView;
    //   241: iconst_5
    //   242: invokevirtual setTextTintIndex : (I)V
    //   245: aload_0
    //   246: aload_0
    //   247: getfield v0 : Ltj;
    //   250: putfield x0 : Ltj;
    //   253: goto -> 479
    //   256: aload #6
    //   258: getstatic android/graphics/Typeface.DEFAULT : Landroid/graphics/Typeface;
    //   261: iconst_0
    //   262: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   265: aload_0
    //   266: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   269: bipush #6
    //   271: invokevirtual setTextTintIndex : (I)V
    //   274: aload_0
    //   275: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   278: astore #7
    //   280: aload_0
    //   281: invokevirtual P : ()Landroid/content/Context;
    //   284: astore #6
    //   286: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   289: fstore_2
    //   290: fload_2
    //   291: f2d
    //   292: ldc2_w 1.5
    //   295: dmul
    //   296: d2i
    //   297: istore_3
    //   298: fload_2
    //   299: ldc_w 8.0
    //   302: fmul
    //   303: f2i
    //   304: i2f
    //   305: fstore_2
    //   306: aload #5
    //   308: iconst_3
    //   309: iaload
    //   310: ldc_w 16777215
    //   313: iand
    //   314: istore #4
    //   316: aload #7
    //   318: aload #6
    //   320: iload_3
    //   321: fload_2
    //   322: iload #4
    //   324: ldc_w 1677721600
    //   327: ior
    //   328: iload #4
    //   330: ldc_w 771751936
    //   333: ior
    //   334: aload #5
    //   336: iconst_2
    //   337: iaload
    //   338: aload #5
    //   340: bipush #6
    //   342: iaload
    //   343: ldc_w 16777215
    //   346: iand
    //   347: ldc_w 620756992
    //   350: ior
    //   351: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   354: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   357: aload_0
    //   358: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   361: astore #6
    //   363: new java/lang/StringBuilder
    //   366: dup
    //   367: invokespecial <init> : ()V
    //   370: astore #5
    //   372: aload #5
    //   374: aload_0
    //   375: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   378: invokevirtual getContentDescription : ()Ljava/lang/CharSequence;
    //   381: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   384: pop
    //   385: aload #5
    //   387: aload_0
    //   388: ldc_w 2131887500
    //   391: invokevirtual T : (I)Ljava/lang/String;
    //   394: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: aload #6
    //   400: aload #5
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   408: aload_0
    //   409: getfield a0 : Lin/krosbits/android/widgets/SmartTextView;
    //   412: bipush #6
    //   414: invokevirtual setCompoundDrawableColorIndex : (I)V
    //   417: aload_0
    //   418: getfield f0 : Lin/krosbits/android/widgets/SmartImageView;
    //   421: bipush #6
    //   423: invokevirtual setColorTintIndex : (I)V
    //   426: aload_0
    //   427: getfield g0 : Lin/krosbits/android/widgets/SmartImageView;
    //   430: bipush #6
    //   432: invokevirtual setColorTintIndex : (I)V
    //   435: aload_0
    //   436: getfield h0 : Lin/krosbits/android/widgets/SmartImageView;
    //   439: bipush #6
    //   441: invokevirtual setColorTintIndex : (I)V
    //   444: aload_0
    //   445: getfield i0 : Lin/krosbits/android/widgets/SmartImageView;
    //   448: bipush #6
    //   450: invokevirtual setColorTintIndex : (I)V
    //   453: aload_0
    //   454: getfield j0 : Lin/krosbits/android/widgets/SmartImageView;
    //   457: bipush #6
    //   459: invokevirtual setColorTintIndex : (I)V
    //   462: aload_0
    //   463: getfield k0 : Lin/krosbits/android/widgets/SmartTextView;
    //   466: bipush #6
    //   468: invokevirtual setTextTintIndex : (I)V
    //   471: aload_0
    //   472: aload_0
    //   473: getfield w0 : Ltj;
    //   476: putfield x0 : Ltj;
    //   479: aload_0
    //   480: iload_1
    //   481: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   484: putfield z0 : Ljava/lang/Boolean;
    //   487: return
  }
  
  public final boolean e() {
    return false;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.e0 = (MusicActivity)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    if (paramBundle != null)
      this.l0 = paramBundle; 
    View view = paramLayoutInflater.inflate(2131492997, paramViewGroup, false);
    int[] arrayOfInt = m92.h;
    Drawable drawable2 = ag0.C0(arrayOfInt[5], MyApplication.i.getApplicationContext().getResources().getDrawable(2131231413).mutate());
    int i = (int)(S().getDimension(2131166369) * 11.0F);
    drawable2.setBounds(0, 0, i, i);
    this.v0 = new tj(drawable2);
    Drawable drawable1 = ag0.C0(arrayOfInt[6], MyApplication.i.getApplicationContext().getResources().getDrawable(2131231413).mutate());
    i = (int)(S().getDimension(2131166369) * 11.0F);
    drawable1.setBounds(0, 0, i, i);
    tj tj1 = new tj(drawable1);
    this.w0 = tj1;
    this.x0 = tj1;
    this.a0 = (SmartTextView)view.findViewById(2131297513);
    this.b0 = (TextView)view.findViewById(2131297864);
    view.findViewById(2131297928).setBackground(new wg(0, 1));
    this.g0 = (SmartImageView)view.findViewById(2131296887);
    this.f0 = (SmartImageView)view.findViewById(2131296888);
    this.h0 = (SmartImageView)view.findViewById(2131296892);
    this.i0 = (SmartImageView)view.findViewById(2131296898);
    view.findViewById(2131297945);
    this.j0 = (SmartImageView)view.findViewById(2131296873);
    this.r0 = (RecyclerViewScrollBar)view.findViewById(2131297399);
    this.k0 = (SmartTextView)view.findViewById(2131297716);
    RecyclerView recyclerView = (RecyclerView)view.findViewById(2131297420);
    this.m0 = recyclerView;
    recyclerView.h(this.e0.u0);
    this.m0.setLayoutManager((a)new LinearLayoutManager(1));
    this.m0.setHasFixedSize(true);
    this.b0.setOnClickListener(this);
    this.f0.setOnClickListener(this);
    this.g0.setOnClickListener(this);
    this.h0.setOnClickListener(this);
    this.i0.setOnClickListener(this);
    this.j0.setOnClickListener(this);
    this.a0.setOnClickListener(this);
    this.k0.setOnClickListener(this);
    if (this.e0.j0 != null)
      D0(); 
    this.t0 = my0.g;
    return view;
  }
  
  public final void i() {
    try {
      int i = this.c0;
      boolean bool = MusicService.C0;
      if (i != (MyApplication.h()).c) {
        this.c0 = (MyApplication.h()).c;
        H0();
      } 
      this.m0.k0(this.n0.d.e(MusicService.C0));
    } finally {
      Exception exception;
    } 
  }
  
  public final void j0() {
    ij0 ij01 = this.s0;
    if (ij01 != null)
      ij01.g(null); 
    this.e0 = null;
    this.d0 = null;
    this.n0 = null;
    this.m0 = null;
    this.a0 = null;
    this.j0 = null;
    this.i0 = null;
    this.h0 = null;
    this.g0 = null;
    this.f0 = null;
    this.r0 = null;
    this.s0 = null;
    this.o0 = null;
    this.k0 = null;
    this.I = true;
  }
  
  public final void l0() {
    ss0 ss01 = this.o0;
    if (ss01 != null) {
      ss01.dismiss();
      this.o0 = null;
    } 
    this.I = true;
  }
  
  public final void m0() {
    this.I = true;
  }
  
  public final void n0(Bundle paramBundle) {
    paramBundle.putInt("spinnerPos", this.c0);
    paramBundle.putParcelable("rv", this.m0.getLayoutManager().t0());
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o0 : Lss0;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 31
    //   11: aload #4
    //   13: invokevirtual isShowing : ()Z
    //   16: ifeq -> 31
    //   19: aload_0
    //   20: getfield o0 : Lss0;
    //   23: invokevirtual dismiss : ()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield o0 : Lss0;
    //   31: aload_1
    //   32: invokevirtual getId : ()I
    //   35: istore_2
    //   36: iload_2
    //   37: ldc_w 2131297513
    //   40: if_icmpne -> 202
    //   43: aload_0
    //   44: getfield d0 : Loz;
    //   47: astore_1
    //   48: aload_1
    //   49: ifnull -> 68
    //   52: aload_1
    //   53: getfield k : Lss0;
    //   56: astore_1
    //   57: aload_1
    //   58: ifnull -> 68
    //   61: aload_1
    //   62: invokevirtual isShowing : ()Z
    //   65: ifne -> 1800
    //   68: aload_0
    //   69: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   72: astore_1
    //   73: aload_1
    //   74: ifnull -> 1800
    //   77: aload_1
    //   78: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   81: ifnonnull -> 87
    //   84: goto -> 1800
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield d0 : Loz;
    //   92: new oz
    //   95: astore #4
    //   97: aload_0
    //   98: invokevirtual P : ()Landroid/content/Context;
    //   101: astore #5
    //   103: aload_0
    //   104: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   107: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   110: astore_1
    //   111: aload_0
    //   112: getfield c0 : I
    //   115: istore_2
    //   116: new bh0
    //   119: astore #6
    //   121: aload #6
    //   123: bipush #23
    //   125: aload_0
    //   126: invokespecial <init> : (ILjava/lang/Object;)V
    //   129: aload #4
    //   131: aload #5
    //   133: aload_1
    //   134: iload_2
    //   135: aload #6
    //   137: invokespecial <init> : (Landroid/content/Context;Lin/krosbits/musicolet/MusicService;ILbh0;)V
    //   140: aload_0
    //   141: aload #4
    //   143: putfield d0 : Loz;
    //   146: goto -> 154
    //   149: astore_1
    //   150: aload_1
    //   151: invokevirtual printStackTrace : ()V
    //   154: aload_0
    //   155: getfield d0 : Loz;
    //   158: astore_1
    //   159: aload_1
    //   160: ifnull -> 1800
    //   163: aload_1
    //   164: getfield k : Lss0;
    //   167: astore_1
    //   168: aload_1
    //   169: ifnull -> 1800
    //   172: aload_1
    //   173: invokevirtual show : ()V
    //   176: new android/os/Handler
    //   179: dup
    //   180: invokespecial <init> : ()V
    //   183: new kb1
    //   186: dup
    //   187: aload_0
    //   188: iconst_1
    //   189: invokespecial <init> : (Llb1;I)V
    //   192: ldc2_w 30
    //   195: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   198: pop
    //   199: goto -> 1800
    //   202: iload_2
    //   203: ldc_w 2131296888
    //   206: if_icmpne -> 364
    //   209: aload_0
    //   210: getfield c0 : I
    //   213: istore_2
    //   214: iload_2
    //   215: iflt -> 1800
    //   218: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   221: istore_3
    //   222: iload_2
    //   223: invokestatic h : ()Lwk1;
    //   226: getfield b : Ljava/util/Stack;
    //   229: invokevirtual size : ()I
    //   232: if_icmpge -> 1800
    //   235: invokestatic o : ()Landroid/content/SharedPreferences;
    //   238: ldc_w 'k_b_cnfbrque'
    //   241: iconst_1
    //   242: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   247: ifeq -> 338
    //   250: new ms0
    //   253: astore #4
    //   255: aload #4
    //   257: aload_0
    //   258: invokevirtual P : ()Landroid/content/Context;
    //   261: invokespecial <init> : (Landroid/content/Context;)V
    //   264: aload #4
    //   266: ldc_w 2131887173
    //   269: invokevirtual q : (I)V
    //   272: aload #4
    //   274: invokestatic h : ()Lwk1;
    //   277: getfield b : Ljava/util/Stack;
    //   280: aload_0
    //   281: getfield c0 : I
    //   284: invokevirtual get : (I)Ljava/lang/Object;
    //   287: checkcast xn1
    //   290: getfield h : Ljava/lang/String;
    //   293: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   296: aload #4
    //   298: ldc_w 2131886989
    //   301: invokevirtual k : (I)V
    //   304: aload #4
    //   306: ldc_w 2131887604
    //   309: invokevirtual n : (I)V
    //   312: new f
    //   315: astore_1
    //   316: aload_1
    //   317: bipush #25
    //   319: aload_0
    //   320: invokespecial <init> : (ILjava/lang/Object;)V
    //   323: aload #4
    //   325: aload_1
    //   326: putfield A : Lrs0;
    //   329: aload #4
    //   331: invokevirtual p : ()Lss0;
    //   334: pop
    //   335: goto -> 1800
    //   338: aload_0
    //   339: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   342: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   345: aload_0
    //   346: getfield c0 : I
    //   349: invokevirtual t : (I)Z
    //   352: pop
    //   353: goto -> 1800
    //   356: astore_1
    //   357: aload_1
    //   358: invokevirtual printStackTrace : ()V
    //   361: goto -> 1800
    //   364: iload_2
    //   365: ldc_w 2131296887
    //   368: if_icmpne -> 442
    //   371: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   374: ifnull -> 1800
    //   377: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   380: ifne -> 386
    //   383: goto -> 1800
    //   386: aload_0
    //   387: getfield c0 : I
    //   390: invokestatic h : ()Lwk1;
    //   393: getfield c : I
    //   396: if_icmpne -> 422
    //   399: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   402: ifnull -> 1800
    //   405: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   408: ifeq -> 1800
    //   411: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   414: iconst_0
    //   415: anewarray java/lang/Integer
    //   418: invokevirtual X : ([Ljava/lang/Integer;)V
    //   421: return
    //   422: aload_0
    //   423: iconst_1
    //   424: putfield u0 : Z
    //   427: aload_0
    //   428: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   431: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   434: aload_0
    //   435: getfield c0 : I
    //   438: invokevirtual l0 : (I)V
    //   441: return
    //   442: iload_2
    //   443: ldc_w 2131297033
    //   446: if_icmpne -> 469
    //   449: aload_0
    //   450: invokevirtual P : ()Landroid/content/Context;
    //   453: aload_0
    //   454: getfield p0 : Lkm0;
    //   457: iconst_0
    //   458: newarray int
    //   460: invokestatic F0 : (Landroid/content/Context;Lkm0;[I)V
    //   463: aload_0
    //   464: aconst_null
    //   465: putfield p0 : Lkm0;
    //   468: return
    //   469: iload_2
    //   470: ldc_w 2131296999
    //   473: if_icmpne -> 502
    //   476: aload_0
    //   477: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   480: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   483: astore_1
    //   484: aload_1
    //   485: ifnull -> 1800
    //   488: aload_1
    //   489: aload_0
    //   490: getfield p0 : Lkm0;
    //   493: invokevirtual f : (Lkm0;)V
    //   496: aload_0
    //   497: aconst_null
    //   498: putfield p0 : Lkm0;
    //   501: return
    //   502: iload_2
    //   503: ldc_w 2131297012
    //   506: if_icmpne -> 533
    //   509: aload_0
    //   510: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   513: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   516: ifnull -> 1800
    //   519: aload_0
    //   520: getfield q0 : I
    //   523: istore_2
    //   524: aload_0
    //   525: getfield n0 : Lmb1;
    //   528: iload_2
    //   529: invokevirtual m : (I)V
    //   532: return
    //   533: iload_2
    //   534: ldc_w 2131296976
    //   537: if_icmpne -> 620
    //   540: aload_0
    //   541: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   544: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   547: ifnull -> 1800
    //   550: new java/util/ArrayList
    //   553: dup
    //   554: iconst_1
    //   555: invokespecial <init> : (I)V
    //   558: astore_1
    //   559: aload_1
    //   560: aload_0
    //   561: getfield p0 : Lkm0;
    //   564: invokevirtual add : (Ljava/lang/Object;)Z
    //   567: pop
    //   568: aload_0
    //   569: invokevirtual P : ()Landroid/content/Context;
    //   572: astore #4
    //   574: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   577: istore_3
    //   578: new tk
    //   581: dup
    //   582: aload #4
    //   584: invokestatic h : ()Lwk1;
    //   587: getfield b : Ljava/util/Stack;
    //   590: invokestatic h : ()Lwk1;
    //   593: getfield c : I
    //   596: new vn
    //   599: dup
    //   600: bipush #15
    //   602: aload_0
    //   603: aload_1
    //   604: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   607: invokespecial <init> : (Landroid/content/Context;Ljava/util/Stack;ILzy;)V
    //   610: getfield f : Ljava/lang/Object;
    //   613: checkcast ss0
    //   616: invokevirtual show : ()V
    //   619: return
    //   620: iload_2
    //   621: ldc_w 2131296892
    //   624: if_icmpne -> 756
    //   627: aload_0
    //   628: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   631: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   634: ifnull -> 1800
    //   637: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   640: ifeq -> 651
    //   643: ldc_w 2131886285
    //   646: iconst_0
    //   647: invokestatic O0 : (II)V
    //   650: return
    //   651: invokestatic h : ()Lwk1;
    //   654: getfield b : Ljava/util/Stack;
    //   657: aload_0
    //   658: getfield c0 : I
    //   661: invokevirtual get : (I)Ljava/lang/Object;
    //   664: checkcast xn1
    //   667: astore #5
    //   669: getstatic m92.h : [I
    //   672: iconst_5
    //   673: iaload
    //   674: aload_0
    //   675: invokevirtual P : ()Landroid/content/Context;
    //   678: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   681: ldc_w 2131231068
    //   684: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   687: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   690: invokestatic C0 : (ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   693: astore_1
    //   694: new ms0
    //   697: dup
    //   698: aload_0
    //   699: invokevirtual P : ()Landroid/content/Context;
    //   702: invokespecial <init> : (Landroid/content/Context;)V
    //   705: astore #4
    //   707: aload #4
    //   709: aload_1
    //   710: putfield S : Landroid/graphics/drawable/Drawable;
    //   713: aload #4
    //   715: ldc_w 2131887439
    //   718: invokevirtual q : (I)V
    //   721: aload #4
    //   723: getstatic lb1.C0 : [I
    //   726: invokestatic R : ([I)Ljava/util/ArrayList;
    //   729: invokevirtual h : (Ljava/util/Collection;)V
    //   732: aload #4
    //   734: new vn
    //   737: dup
    //   738: bipush #16
    //   740: aload_0
    //   741: aload #5
    //   743: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   746: invokevirtual j : (Los0;)V
    //   749: aload #4
    //   751: invokevirtual p : ()Lss0;
    //   754: pop
    //   755: return
    //   756: iload_2
    //   757: ldc_w 2131296898
    //   760: if_icmpne -> 961
    //   763: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   766: istore_3
    //   767: invokestatic h : ()Lwk1;
    //   770: getfield b : Ljava/util/Stack;
    //   773: aload_0
    //   774: getfield c0 : I
    //   777: invokevirtual get : (I)Ljava/lang/Object;
    //   780: checkcast xn1
    //   783: astore #6
    //   785: aload #6
    //   787: invokevirtual i : ()Z
    //   790: ifne -> 1800
    //   793: aload_0
    //   794: invokevirtual P : ()Landroid/content/Context;
    //   797: astore #5
    //   799: new n2
    //   802: dup
    //   803: aload #5
    //   805: aload_0
    //   806: getfield i0 : Lin/krosbits/android/widgets/SmartImageView;
    //   809: invokespecial <init> : (Landroid/content/Context;Landroid/view/View;)V
    //   812: astore_1
    //   813: aload_1
    //   814: getfield c : Ljava/lang/Object;
    //   817: checkcast rw0
    //   820: astore #4
    //   822: new cr1
    //   825: dup
    //   826: aload #5
    //   828: invokespecial <init> : (Landroid/content/Context;)V
    //   831: ldc_w 2131623944
    //   834: aload #4
    //   836: invokevirtual inflate : (ILandroid/view/Menu;)V
    //   839: aload #4
    //   841: ldc_w 2131297134
    //   844: invokevirtual findItem : (I)Landroid/view/MenuItem;
    //   847: astore #5
    //   849: aload #6
    //   851: getfield h : Ljava/lang/String;
    //   854: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   857: astore #6
    //   859: aload #6
    //   861: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   864: astore #7
    //   866: aload #7
    //   868: ifnull -> 898
    //   871: aload #5
    //   873: aload_0
    //   874: ldc_w 2131887269
    //   877: iconst_1
    //   878: anewarray java/lang/Object
    //   881: dup
    //   882: iconst_0
    //   883: aload #7
    //   885: aastore
    //   886: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   889: invokeinterface setTitle : (Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    //   894: pop
    //   895: goto -> 922
    //   898: aload #5
    //   900: aload_0
    //   901: ldc_w 2131887267
    //   904: iconst_1
    //   905: anewarray java/lang/Object
    //   908: dup
    //   909: iconst_0
    //   910: aload #6
    //   912: aastore
    //   913: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   916: invokeinterface setTitle : (Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    //   921: pop
    //   922: aload_1
    //   923: aload_0
    //   924: putfield f : Ljava/lang/Object;
    //   927: aload #4
    //   929: aconst_null
    //   930: invokestatic A0 : (Landroid/view/Menu;Ljava/util/HashMap;)V
    //   933: new bx0
    //   936: dup
    //   937: aload_0
    //   938: invokevirtual P : ()Landroid/content/Context;
    //   941: aload #4
    //   943: aload_0
    //   944: getfield i0 : Lin/krosbits/android/widgets/SmartImageView;
    //   947: invokespecial <init> : (Landroid/content/Context;Lrw0;Landroid/view/View;)V
    //   950: astore_1
    //   951: aload_1
    //   952: iconst_1
    //   953: invokevirtual d : (Z)V
    //   956: aload_1
    //   957: invokevirtual e : ()V
    //   960: return
    //   961: iload_2
    //   962: ldc_w 2131296983
    //   965: if_icmpne -> 1009
    //   968: new java/util/ArrayList
    //   971: dup
    //   972: iconst_1
    //   973: invokespecial <init> : (I)V
    //   976: astore_1
    //   977: aload_1
    //   978: aload_0
    //   979: getfield p0 : Lkm0;
    //   982: invokevirtual add : (Ljava/lang/Object;)Z
    //   985: pop
    //   986: aload_1
    //   987: putstatic in/krosbits/musicolet/Tag2Activity.L1 : Ljava/util/ArrayList;
    //   990: aload_0
    //   991: new android/content/Intent
    //   994: dup
    //   995: aload_0
    //   996: invokevirtual P : ()Landroid/content/Context;
    //   999: ldc_w in/krosbits/musicolet/Tag2Activity
    //   1002: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1005: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1008: return
    //   1009: iload_2
    //   1010: ldc_w 2131297823
    //   1013: if_icmpne -> 1039
    //   1016: new p71
    //   1019: dup
    //   1020: aload_0
    //   1021: invokevirtual P : ()Landroid/content/Context;
    //   1024: aload_0
    //   1025: getfield p0 : Lkm0;
    //   1028: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1031: invokespecial <init> : (Landroid/content/Context;Ljava/util/List;)V
    //   1034: invokevirtual p : ()Lss0;
    //   1037: pop
    //   1038: return
    //   1039: iload_2
    //   1040: ldc_w 2131297008
    //   1043: if_icmpne -> 1068
    //   1046: aload_0
    //   1047: invokevirtual M : ()Lx5;
    //   1050: new java/util/HashSet
    //   1053: dup
    //   1054: aload_0
    //   1055: getfield p0 : Lkm0;
    //   1058: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1061: invokespecial <init> : (Ljava/util/Collection;)V
    //   1064: invokestatic n0 : (Landroid/app/Activity;Ljava/util/HashSet;)V
    //   1067: return
    //   1068: iload_2
    //   1069: ldc_w 2131296978
    //   1072: if_icmpne -> 1124
    //   1075: new java/util/ArrayList
    //   1078: dup
    //   1079: iconst_1
    //   1080: invokespecial <init> : (I)V
    //   1083: astore #4
    //   1085: aload #4
    //   1087: aload_0
    //   1088: getfield p0 : Lkm0;
    //   1091: invokevirtual add : (Ljava/lang/Object;)Z
    //   1094: pop
    //   1095: aload_0
    //   1096: invokevirtual P : ()Landroid/content/Context;
    //   1099: astore #5
    //   1101: getstatic lm0.M : Ljava/util/Calendar;
    //   1104: astore_1
    //   1105: aload #5
    //   1107: aload #4
    //   1109: iconst_0
    //   1110: anewarray km0
    //   1113: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1116: checkcast [Lkm0;
    //   1119: iconst_1
    //   1120: invokestatic j : (Landroid/content/Context;[Lkm0;Z)V
    //   1123: return
    //   1124: iload_2
    //   1125: ldc_w 2131296991
    //   1128: if_icmpne -> 1179
    //   1131: new java/util/ArrayList
    //   1134: dup
    //   1135: iconst_1
    //   1136: invokespecial <init> : (I)V
    //   1139: astore #4
    //   1141: aload #4
    //   1143: aload_0
    //   1144: getfield p0 : Lkm0;
    //   1147: invokevirtual add : (Ljava/lang/Object;)Z
    //   1150: pop
    //   1151: aload_0
    //   1152: invokevirtual P : ()Landroid/content/Context;
    //   1155: astore_1
    //   1156: getstatic lm0.M : Ljava/util/Calendar;
    //   1159: astore #5
    //   1161: aload_1
    //   1162: aload #4
    //   1164: iconst_0
    //   1165: anewarray km0
    //   1168: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1171: checkcast [Lkm0;
    //   1174: iconst_1
    //   1175: invokestatic h0 : (Landroid/content/Context;[Lkm0;Z)V
    //   1178: return
    //   1179: iload_2
    //   1180: ldc_w 2131296975
    //   1183: if_icmpne -> 1232
    //   1186: new java/util/ArrayList
    //   1189: dup
    //   1190: iconst_1
    //   1191: invokespecial <init> : (I)V
    //   1194: astore_1
    //   1195: aload_1
    //   1196: aload_0
    //   1197: getfield p0 : Lkm0;
    //   1200: invokevirtual add : (Ljava/lang/Object;)Z
    //   1203: pop
    //   1204: aload_0
    //   1205: invokevirtual P : ()Landroid/content/Context;
    //   1208: astore #5
    //   1210: getstatic lm0.M : Ljava/util/Calendar;
    //   1213: astore #4
    //   1215: aload #5
    //   1217: aload_1
    //   1218: iconst_0
    //   1219: anewarray km0
    //   1222: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1225: checkcast [Lkm0;
    //   1228: invokestatic h : (Landroid/content/Context;[Lkm0;)V
    //   1231: return
    //   1232: iload_2
    //   1233: ldc_w 2131297025
    //   1236: if_icmpne -> 1262
    //   1239: new java/util/ArrayList
    //   1242: dup
    //   1243: iconst_1
    //   1244: invokespecial <init> : (I)V
    //   1247: astore_1
    //   1248: aload_1
    //   1249: aload_0
    //   1250: getfield p0 : Lkm0;
    //   1253: invokevirtual add : (Ljava/lang/Object;)Z
    //   1256: pop
    //   1257: aload_1
    //   1258: invokestatic D0 : (Ljava/util/ArrayList;)V
    //   1261: return
    //   1262: iload_2
    //   1263: ldc_w 2131296873
    //   1266: if_icmpne -> 1399
    //   1269: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1272: istore_3
    //   1273: invokestatic h : ()Lwk1;
    //   1276: getfield b : Ljava/util/Stack;
    //   1279: aload_0
    //   1280: getfield c0 : I
    //   1283: invokevirtual get : (I)Ljava/lang/Object;
    //   1286: checkcast xn1
    //   1289: invokevirtual i : ()Z
    //   1292: ifne -> 1800
    //   1295: aload_0
    //   1296: invokevirtual P : ()Landroid/content/Context;
    //   1299: astore #4
    //   1301: new n2
    //   1304: dup
    //   1305: aload #4
    //   1307: aload_0
    //   1308: getfield j0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1311: invokespecial <init> : (Landroid/content/Context;Landroid/view/View;)V
    //   1314: astore_1
    //   1315: aload_1
    //   1316: getfield c : Ljava/lang/Object;
    //   1319: checkcast rw0
    //   1322: astore #5
    //   1324: new cr1
    //   1327: dup
    //   1328: aload #4
    //   1330: invokespecial <init> : (Landroid/content/Context;)V
    //   1333: ldc_w 2131623943
    //   1336: aload #5
    //   1338: invokevirtual inflate : (ILandroid/view/Menu;)V
    //   1341: aload #5
    //   1343: ldc_w 2131297129
    //   1346: invokevirtual findItem : (I)Landroid/view/MenuItem;
    //   1349: invokestatic d : ()Z
    //   1352: iconst_1
    //   1353: ixor
    //   1354: invokeinterface setVisible : (Z)Landroid/view/MenuItem;
    //   1359: pop
    //   1360: aload_1
    //   1361: aload_0
    //   1362: putfield f : Ljava/lang/Object;
    //   1365: aload #5
    //   1367: aconst_null
    //   1368: invokestatic A0 : (Landroid/view/Menu;Ljava/util/HashMap;)V
    //   1371: new bx0
    //   1374: dup
    //   1375: aload_0
    //   1376: invokevirtual P : ()Landroid/content/Context;
    //   1379: aload #5
    //   1381: aload_0
    //   1382: getfield j0 : Lin/krosbits/android/widgets/SmartImageView;
    //   1385: invokespecial <init> : (Landroid/content/Context;Lrw0;Landroid/view/View;)V
    //   1388: astore_1
    //   1389: aload_1
    //   1390: iconst_1
    //   1391: invokevirtual d : (Z)V
    //   1394: aload_1
    //   1395: invokevirtual e : ()V
    //   1398: return
    //   1399: iload_2
    //   1400: ldc_w 2131296951
    //   1403: if_icmpne -> 1490
    //   1406: new java/util/ArrayList
    //   1409: dup
    //   1410: iconst_1
    //   1411: invokespecial <init> : (I)V
    //   1414: astore #4
    //   1416: aload #4
    //   1418: aload_0
    //   1419: getfield p0 : Lkm0;
    //   1422: invokevirtual add : (Ljava/lang/Object;)Z
    //   1425: pop
    //   1426: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1429: istore_3
    //   1430: invokestatic h : ()Lwk1;
    //   1433: getfield b : Ljava/util/Stack;
    //   1436: aload_0
    //   1437: getfield c0 : I
    //   1440: invokevirtual get : (I)Ljava/lang/Object;
    //   1443: checkcast xn1
    //   1446: getfield h : Ljava/lang/String;
    //   1449: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1452: astore_1
    //   1453: aload #4
    //   1455: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1458: aload_0
    //   1459: new android/content/Intent
    //   1462: dup
    //   1463: aload_0
    //   1464: invokevirtual P : ()Landroid/content/Context;
    //   1467: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1470: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1473: ldc_w 'A_ADTPL'
    //   1476: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1479: ldc_w 'E_TL'
    //   1482: aload_1
    //   1483: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1486: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1489: return
    //   1490: iload_2
    //   1491: ldc_w 2131297023
    //   1494: if_icmpne -> 1509
    //   1497: aload_0
    //   1498: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   1501: aload_0
    //   1502: getfield p0 : Lkm0;
    //   1505: invokestatic v0 : (Landroid/app/Activity;Lkm0;)V
    //   1508: return
    //   1509: iload_2
    //   1510: ldc_w 2131296964
    //   1513: if_icmpne -> 1528
    //   1516: aload_0
    //   1517: getfield e0 : Lin/krosbits/musicolet/MusicActivity;
    //   1520: aload_0
    //   1521: getfield p0 : Lkm0;
    //   1524: invokestatic w0 : (Landroid/app/Activity;Lkm0;)V
    //   1527: return
    //   1528: iload_2
    //   1529: ldc_w 2131297716
    //   1532: if_icmpne -> 1584
    //   1535: aload_0
    //   1536: getfield n0 : Lmb1;
    //   1539: getfield d : Lxn1;
    //   1542: invokevirtual i : ()Z
    //   1545: ifne -> 1576
    //   1548: aload_0
    //   1549: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1552: aload_0
    //   1553: getfield n0 : Lmb1;
    //   1556: getfield d : Lxn1;
    //   1559: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1562: invokevirtual e : (Z)I
    //   1565: invokevirtual k0 : (I)V
    //   1568: ldc_w 2131887294
    //   1571: iconst_0
    //   1572: invokestatic O0 : (II)V
    //   1575: return
    //   1576: ldc_w 2131886491
    //   1579: iconst_0
    //   1580: invokestatic O0 : (II)V
    //   1583: return
    //   1584: iload_2
    //   1585: ldc_w 2131297864
    //   1588: if_icmpne -> 1642
    //   1591: aload_0
    //   1592: new ub1
    //   1595: dup
    //   1596: aload_0
    //   1597: invokevirtual P : ()Landroid/content/Context;
    //   1600: aload_0
    //   1601: getfield b0 : Landroid/widget/TextView;
    //   1604: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   1607: invokeinterface toString : ()Ljava/lang/String;
    //   1612: new java/util/ArrayList
    //   1615: dup
    //   1616: aload_0
    //   1617: getfield n0 : Lmb1;
    //   1620: getfield d : Lxn1;
    //   1623: getfield b : Ljava/util/ArrayList;
    //   1626: invokespecial <init> : (Ljava/util/Collection;)V
    //   1629: iconst_1
    //   1630: aload_0
    //   1631: aconst_null
    //   1632: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;ILsb1;Ljava/lang/CharSequence;)V
    //   1635: invokevirtual p : ()Lss0;
    //   1638: putfield o0 : Lss0;
    //   1641: return
    //   1642: iload_2
    //   1643: ldc_w 2131297001
    //   1646: if_icmpne -> 1692
    //   1649: aload_0
    //   1650: getfield p0 : Lkm0;
    //   1653: getfield c : Lqn1;
    //   1656: invokevirtual a : ()Landroid/net/Uri;
    //   1659: astore_1
    //   1660: aload_0
    //   1661: new android/content/Intent
    //   1664: dup
    //   1665: aload_0
    //   1666: invokevirtual P : ()Landroid/content/Context;
    //   1669: ldc_w in/krosbits/musicolet/MiniPlayerActivity
    //   1672: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1675: getstatic com/google/android/gms/common/api/Gldr/hbrAVtEa.lxvzsUYZoO : Ljava/lang/String;
    //   1678: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1681: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.QDpuQzCqm : Ljava/lang/String;
    //   1684: aload_1
    //   1685: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   1688: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1691: return
    //   1692: iload_2
    //   1693: ldc_w 2131297034
    //   1696: if_icmpne -> 1800
    //   1699: aload_0
    //   1700: getfield p0 : Lkm0;
    //   1703: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1706: getfield i : Lkm0;
    //   1709: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1712: ifeq -> 1730
    //   1715: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1718: aconst_null
    //   1719: invokevirtual B0 : (Lkm0;)V
    //   1722: ldc_w 2131886467
    //   1725: iconst_0
    //   1726: invokestatic O0 : (II)V
    //   1729: return
    //   1730: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   1733: aload_0
    //   1734: getfield p0 : Lkm0;
    //   1737: invokevirtual B0 : (Lkm0;)V
    //   1740: new java/lang/StringBuilder
    //   1743: dup
    //   1744: invokespecial <init> : ()V
    //   1747: astore_1
    //   1748: aload_1
    //   1749: aload_0
    //   1750: ldc_w 2131887593
    //   1753: invokevirtual T : (I)Ljava/lang/String;
    //   1756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1759: pop
    //   1760: aload_1
    //   1761: ldc_w ' <b>'
    //   1764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1767: pop
    //   1768: aload_1
    //   1769: aload_0
    //   1770: getfield p0 : Lkm0;
    //   1773: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   1776: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1779: pop
    //   1780: aload_1
    //   1781: ldc_w '</b>'
    //   1784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1787: pop
    //   1788: iconst_1
    //   1789: aload_1
    //   1790: invokevirtual toString : ()Ljava/lang/String;
    //   1793: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1796: iconst_1
    //   1797: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   1800: return
    //   1801: astore_1
    //   1802: goto -> 1800
    // Exception table:
    //   from	to	target	type
    //   92	146	149	finally
    //   235	335	356	finally
    //   338	353	356	finally
    //   1535	1575	1801	finally
    //   1576	1583	1801	finally
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    boolean bool = MusicService.C0;
    xn1 xn1 = (MyApplication.h()).b.get(this.c0);
    String str = ag0.e(xn1.h);
    ArrayList arrayList = new ArrayList(xn1.g(MusicService.C0));
    int i = paramMenuItem.getItemId();
    if (i == 2131297133) {
      GhostSearchActivity.f0 = arrayList;
      B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", str));
      return false;
    } 
    if (i == 2131297134) {
      if (TextUtils.isEmpty(str)) {
        ag0.O0(2131886570, 1);
        return false;
      } 
      if (c81.g(MyApplication.i.getApplicationContext()).contains(str)) {
        ms0 ms0 = new ms0(P());
        ms0.d((CharSequence)Html.fromHtml(String.format(ms0.b.getString(2131886518), new Object[] { str })));
        ms0.n(2131887265);
        ms0.k(2131886278);
        ms0.A = new vn(14, str, arrayList);
        ms0.p();
        return false;
      } 
      b81 b81 = new b81(str, arrayList);
      c81.k(MyApplication.i.getApplicationContext(), b81);
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null) {
        l81 l81 = musicActivity.e0;
        if (l81 != null && l81.Y()) {
          MusicActivity.R0.e0.N0();
          ag0.O0(2131886467, 0);
          return false;
        } 
      } 
    } else {
      if (i == 2131297140) {
        MusicActivity.D0(arrayList);
        return false;
      } 
      if (i == 2131297123) {
        if (TextUtils.isEmpty(str)) {
          ag0.O0(2131886570, 1);
          return false;
        } 
        b81 b81 = new b81(x41.k("Queue_", str), arrayList);
        ag0.m((pc)P(), b81);
        return false;
      } 
      if (i == 2131297129)
        my0.i(P()); 
    } 
    return false;
  }
  
  public final void p() {
    my0.h(this.n0.d.g(MusicService.C0));
  }
  
  public final void r() {
    try {
      MusicActivity musicActivity = this.e0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        this.e0.t0.f(true);
        this.e0.t0.j = 1;
      } 
    } finally {
      Exception exception;
    } 
    if (this.t0 == my0.g)
      return; 
    mb1 mb11 = this.n0;
    mb11.getClass();
    if (!my0.d())
      mb11.h = false; 
    if (mb11.h) {
      mb11.h = false;
    } else {
      mb11.g();
    } 
    this.t0 = my0.g;
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmpne -> 117
    //   5: aload_2
    //   6: checkcast km0
    //   9: astore_2
    //   10: iconst_0
    //   11: istore_1
    //   12: iload_1
    //   13: aload_0
    //   14: getfield n0 : Lmb1;
    //   17: getfield d : Lxn1;
    //   20: getfield b : Ljava/util/ArrayList;
    //   23: invokevirtual size : ()I
    //   26: if_icmpge -> 68
    //   29: aload_0
    //   30: getfield n0 : Lmb1;
    //   33: getfield d : Lxn1;
    //   36: iload_1
    //   37: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   40: invokevirtual h : (IZ)Lkm0;
    //   43: getfield c : Lqn1;
    //   46: getfield f : Lwo;
    //   49: aload_2
    //   50: getfield c : Lqn1;
    //   53: getfield f : Lwo;
    //   56: if_acmpne -> 62
    //   59: goto -> 70
    //   62: iinc #1, 1
    //   65: goto -> 12
    //   68: iconst_m1
    //   69: istore_1
    //   70: iload_1
    //   71: iflt -> 117
    //   74: aload_0
    //   75: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   78: iload_1
    //   79: invokevirtual k0 : (I)V
    //   82: new android/os/Handler
    //   85: astore_3
    //   86: aload_3
    //   87: invokespecial <init> : ()V
    //   90: new y2
    //   93: astore_2
    //   94: aload_2
    //   95: iload_1
    //   96: bipush #10
    //   98: aload_0
    //   99: invokespecial <init> : (IILjava/lang/Object;)V
    //   102: aload_3
    //   103: aload_2
    //   104: ldc2_w 300
    //   107: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   110: pop
    //   111: return
    //   112: astore_2
    //   113: aload_2
    //   114: invokevirtual printStackTrace : ()V
    //   117: return
    // Exception table:
    //   from	to	target	type
    //   5	10	112	finally
    //   12	59	112	finally
    //   74	111	112	finally
  }
  
  public final void w() {
    my0.b(this.n0.d.g(MusicService.C0));
  }
  
  public final void x() {
    my0.k(this.n0.d.g(MusicService.C0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */