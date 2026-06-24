import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.material.appbar.AppBarLayout;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.audio_cutter.TrimActivity;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MiniPlayerActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RGReadCalcActivity;
import in.krosbits.musicolet.SettingsActivity;
import in.krosbits.musicolet.Tag2Activity;
import in.krosbits.musicolet.providers.AAProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public class wn extends ua0 implements bj0, qy0, b91, View.OnClickListener, j41, u5, View.OnLongClickListener, ob, rq1, sb1 {
  public static final int[] s1 = new int[] { 0, 1, 8, 9 };
  
  public static final int[] t1 = new int[] { 2131886974, 2131886975, 2131887602, 2131887603 };
  
  public TextView A0;
  
  public TextView B0;
  
  public TextView C0;
  
  public TextView D0;
  
  public RecyclerView E0;
  
  public m90 F0;
  
  public ImageView G0;
  
  public ImageView H0;
  
  public boolean I0;
  
  public int J0;
  
  public int K0;
  
  public MusicActivity L0;
  
  public ss0 M0;
  
  public km0 N0;
  
  public ArrayList O0;
  
  public RecyclerViewScrollBar P0;
  
  public RecyclerViewScrollBar Q0;
  
  public SharedPreferences R0;
  
  public int S0 = 0;
  
  public String T0;
  
  public String U0;
  
  public String V0;
  
  public String W0;
  
  public String X0;
  
  public boolean Y0;
  
  public long Z0;
  
  public int a0 = 0;
  
  public int a1;
  
  public RecyclerView b0;
  
  public long b1;
  
  public RecyclerView c0;
  
  public q3 c1;
  
  public rn d0;
  
  public ArrayList d1 = new ArrayList();
  
  public rn1 e0;
  
  public boolean[] e1;
  
  public ArrayList f0;
  
  public boolean[] f1;
  
  public ArrayList g0;
  
  public boolean g1;
  
  public ViewGroup h0;
  
  public bx0 h1;
  
  public ViewGroup i0;
  
  public int i1;
  
  public ViewGroup j0;
  
  public boolean j1;
  
  public ImageView k0;
  
  public Drawable k1;
  
  public ImageView l0;
  
  public int l1 = 8;
  
  public TextView m0;
  
  public final tn m1 = new tn(this, 0);
  
  public TextView n0;
  
  public HashMap n1;
  
  public TextView o0;
  
  public int o1;
  
  public TextView p0;
  
  public final wg p1 = new wg(0, 0);
  
  public TextView q0;
  
  public final ColorDrawable q1 = new ColorDrawable(0);
  
  public ViewGroup r0;
  
  public String r1;
  
  public TextView s0;
  
  public AppBarLayout t0;
  
  public ImageView u0;
  
  public ImageView v0;
  
  public ImageView w0;
  
  public ImageView x0;
  
  public TextView y0;
  
  public TextView z0;
  
  public static String I0(int paramInt) {
    return (paramInt == 2) ? "k_srt_sb_al" : ((paramInt == 0) ? jLnXOLx.ULrSHwWkeR : ((paramInt == 1) ? "k_srt_sb_alar" : ((paramInt == 3) ? "k_srt_sb_gn" : ((paramInt == 4) ? "k_srt_sb_cm" : "k_srt_sb_al"))));
  }
  
  public final void A() {
    my0.g(this.e0.d);
  }
  
  public final void D0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield T0 : Ljava/lang/String;
    //   4: astore #5
    //   6: aload #5
    //   8: ifnull -> 18
    //   11: iconst_0
    //   12: istore_1
    //   13: iload_1
    //   14: istore_2
    //   15: goto -> 137
    //   18: aload_0
    //   19: getfield U0 : Ljava/lang/String;
    //   22: astore #6
    //   24: aload #6
    //   26: ifnull -> 51
    //   29: aload #6
    //   31: astore #5
    //   33: aload_0
    //   34: getfield a0 : I
    //   37: ifeq -> 11
    //   40: iconst_1
    //   41: istore_1
    //   42: iconst_0
    //   43: istore_2
    //   44: aload #6
    //   46: astore #5
    //   48: goto -> 137
    //   51: aload_0
    //   52: getfield V0 : Ljava/lang/String;
    //   55: astore #6
    //   57: aload #6
    //   59: ifnull -> 83
    //   62: aload #6
    //   64: astore #5
    //   66: aload_0
    //   67: getfield a0 : I
    //   70: iconst_1
    //   71: if_icmpeq -> 11
    //   74: iconst_1
    //   75: istore_1
    //   76: aload #6
    //   78: astore #5
    //   80: goto -> 13
    //   83: aload_0
    //   84: getfield W0 : Ljava/lang/String;
    //   87: astore #6
    //   89: aload #6
    //   91: ifnull -> 117
    //   94: aload #6
    //   96: astore #5
    //   98: aload_0
    //   99: getfield a0 : I
    //   102: iconst_2
    //   103: if_icmpeq -> 11
    //   106: iconst_2
    //   107: istore_2
    //   108: iconst_1
    //   109: istore_1
    //   110: aload #6
    //   112: astore #5
    //   114: goto -> 137
    //   117: aload_0
    //   118: getfield X0 : Ljava/lang/String;
    //   121: astore #5
    //   123: aload #5
    //   125: ifnull -> 131
    //   128: goto -> 11
    //   131: aconst_null
    //   132: astore #5
    //   134: goto -> 11
    //   137: aload_0
    //   138: getfield S0 : I
    //   141: istore #4
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield S0 : I
    //   148: aload_0
    //   149: aconst_null
    //   150: putfield W0 : Ljava/lang/String;
    //   153: aload_0
    //   154: aconst_null
    //   155: putfield X0 : Ljava/lang/String;
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield V0 : Ljava/lang/String;
    //   163: aload_0
    //   164: aconst_null
    //   165: putfield U0 : Ljava/lang/String;
    //   168: aload_0
    //   169: aconst_null
    //   170: putfield T0 : Ljava/lang/String;
    //   173: aload #5
    //   175: ifnonnull -> 179
    //   178: return
    //   179: iload_1
    //   180: istore_3
    //   181: aload_0
    //   182: getfield Y0 : Z
    //   185: ifeq -> 199
    //   188: iload_1
    //   189: istore_3
    //   190: aload_0
    //   191: getfield I0 : Z
    //   194: ifeq -> 199
    //   197: iconst_1
    //   198: istore_3
    //   199: iload_3
    //   200: ifeq -> 233
    //   203: invokestatic o : ()Landroid/content/SharedPreferences;
    //   206: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   211: ldc 'k_i_armd'
    //   213: iload_2
    //   214: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   219: invokeinterface apply : ()V
    //   224: aload_0
    //   225: invokevirtual e : ()Z
    //   228: pop
    //   229: aload_0
    //   230: invokevirtual N0 : ()V
    //   233: aload_0
    //   234: getfield Y0 : Z
    //   237: ifeq -> 252
    //   240: aload_0
    //   241: iconst_0
    //   242: putfield Y0 : Z
    //   245: aload_0
    //   246: aload #5
    //   248: invokevirtual M0 : (Ljava/lang/String;)V
    //   251: return
    //   252: aload #5
    //   254: invokevirtual trim : ()Ljava/lang/String;
    //   257: astore #5
    //   259: iconst_0
    //   260: istore_1
    //   261: aload_0
    //   262: getfield f0 : Ljava/util/ArrayList;
    //   265: invokevirtual size : ()I
    //   268: istore_2
    //   269: iconst_m1
    //   270: istore_3
    //   271: iload_1
    //   272: iload_2
    //   273: if_icmpge -> 307
    //   276: aload #5
    //   278: aload_0
    //   279: getfield f0 : Ljava/util/ArrayList;
    //   282: iload_1
    //   283: invokevirtual get : (I)Ljava/lang/Object;
    //   286: checkcast q3
    //   289: getfield r : Ljava/lang/String;
    //   292: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   295: ifeq -> 301
    //   298: goto -> 309
    //   301: iinc #1, 1
    //   304: goto -> 261
    //   307: iconst_m1
    //   308: istore_1
    //   309: iload_1
    //   310: ifge -> 399
    //   313: aload_0
    //   314: getfield J0 : I
    //   317: istore_1
    //   318: iload_1
    //   319: iconst_2
    //   320: if_icmpne -> 363
    //   323: aload_0
    //   324: getfield a0 : I
    //   327: istore_1
    //   328: iload_1
    //   329: ifne -> 339
    //   332: ldc_w 2131886210
    //   335: istore_1
    //   336: goto -> 379
    //   339: iload_1
    //   340: iconst_1
    //   341: if_icmpne -> 351
    //   344: ldc_w 2131886153
    //   347: istore_1
    //   348: goto -> 379
    //   351: iload_1
    //   352: iconst_2
    //   353: if_icmpne -> 375
    //   356: ldc_w 2131886397
    //   359: istore_1
    //   360: goto -> 379
    //   363: iload_1
    //   364: iconst_3
    //   365: if_icmpne -> 375
    //   368: ldc_w 2131886628
    //   371: istore_1
    //   372: goto -> 379
    //   375: ldc_w 2131886149
    //   378: istore_1
    //   379: iconst_0
    //   380: aload_0
    //   381: iload_1
    //   382: iconst_1
    //   383: anewarray java/lang/Object
    //   386: dup
    //   387: iconst_0
    //   388: aload #5
    //   390: aastore
    //   391: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   394: iconst_1
    //   395: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   398: return
    //   399: aload_0
    //   400: iload_1
    //   401: invokevirtual L0 : (I)V
    //   404: aload_0
    //   405: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   408: aload_0
    //   409: getfield K0 : I
    //   412: invokevirtual k0 : (I)V
    //   415: aload_0
    //   416: getfield e0 : Lrn1;
    //   419: getfield d : Ljava/util/ArrayList;
    //   422: astore #5
    //   424: iconst_0
    //   425: istore_1
    //   426: iload_3
    //   427: istore_2
    //   428: iload_1
    //   429: aload #5
    //   431: invokevirtual size : ()I
    //   434: if_icmpge -> 465
    //   437: aload #5
    //   439: iload_1
    //   440: invokevirtual get : (I)Ljava/lang/Object;
    //   443: checkcast km0
    //   446: getfield b : I
    //   449: iload #4
    //   451: if_icmpne -> 459
    //   454: iload_1
    //   455: istore_2
    //   456: goto -> 465
    //   459: iinc #1, 1
    //   462: goto -> 426
    //   465: iload_2
    //   466: iflt -> 510
    //   469: aload_0
    //   470: getfield t0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   473: iconst_0
    //   474: invokevirtual setExpanded : (Z)V
    //   477: aload_0
    //   478: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   481: iload_2
    //   482: invokevirtual k0 : (I)V
    //   485: new android/os/Handler
    //   488: dup
    //   489: invokespecial <init> : ()V
    //   492: new y2
    //   495: dup
    //   496: iload_2
    //   497: iconst_3
    //   498: aload_0
    //   499: invokespecial <init> : (IILjava/lang/Object;)V
    //   502: ldc2_w 300
    //   505: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   508: pop
    //   509: return
    //   510: aload_0
    //   511: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   514: iconst_0
    //   515: invokevirtual k0 : (I)V
    //   518: aload_0
    //   519: getfield t0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   522: iconst_1
    //   523: invokevirtual setExpanded : (Z)V
    //   526: return
  }
  
  public final int E0() {
    String str;
    int i = this.J0;
    if (i == 1) {
      str = "k_i_eilal";
    } else if (i == 2) {
      str = "k_i_eilar";
    } else if (i == 3) {
      str = "k_i_eilgn";
    } else {
      str = null;
    } 
    i = MyApplication.o().getInt(str, -1);
    if (i == -1) {
      i = this.o1;
      i -= i % 2;
      return (i != 2) ? ((i != 4) ? ((i != 6) ? ((i != 8) ? ((i != 10) ? ((i != 12) ? ((i != 14) ? 0 : 7) : 6) : 5) : 4) : 3) : 2) : 1;
    } 
    return i;
  }
  
  public final String F0() {
    int i = this.a1;
    return (i == 2) ? "lpsidscral" : ((i == 0) ? "lpsidscrar" : ((i == 1) ? "lpsidscralar" : ((i == 4) ? "lpsidscrcm" : ((i == 3) ? "lpsidscrgn" : null))));
  }
  
  public final Uri G(int paramInt) {
    ArrayList arrayList = this.d1;
    if (arrayList == null || this.a1 != 2)
      return null; 
    int i = paramInt;
    if (arrayList.size() > 1) {
      if (paramInt == 0)
        return null; 
      i = paramInt - 1;
    } 
    paramInt = ((q3)this.d1.get(i)).i;
    HashMap hashMap = p3.a;
    return AAProvider.c(paramInt, m92.k, false);
  }
  
  public final String G0() {
    boolean bool;
    boolean bool1 = this.j1;
    byte b = 0;
    if (bool1 && !K0()) {
      bool = true;
    } else {
      bool = false;
    } 
    StringBuilder stringBuilder = new StringBuilder(this.c1.r);
    if (bool)
      try {
        if (this.e1 != null) {
          bool = false;
          while (true) {
            boolean[] arrayOfBoolean = this.e1;
            if (b < arrayOfBoolean.length) {
              boolean bool2 = bool;
              if (arrayOfBoolean[b]) {
                if (!bool) {
                  stringBuilder.append(" › ");
                  bool = true;
                } else {
                  stringBuilder.append(", ");
                } 
                stringBuilder.append(((q3)this.d1.get(b)).c);
                bool2 = bool;
              } 
              b++;
              bool = bool2;
              continue;
            } 
            break;
          } 
        } 
      } finally {
        Exception exception;
      }  
    return stringBuilder.toString();
  }
  
  public final String H0() {
    int i = this.J0;
    return (i == 1) ? "I_K_SRTBYF_AL" : ((i == 2) ? "I_K_SRTBYF_AR" : ((i == 3) ? "I_K_SRTBYF_G" : "I_K_SRTBYF_AL"));
  }
  
  public final void J(km0 paramkm0) {
    this.N0 = paramkm0;
    ArrayList<km0> arrayList = new ArrayList(1);
    this.O0 = arrayList;
    arrayList.add(paramkm0);
    ms0 ms0 = new ms0(P());
    View view = LayoutInflater.from(P()).inflate(2131493015, null);
    TextView textView = (TextView)view.findViewById(2131297873);
    ImageView imageView = (ImageView)view.findViewById(2131296860);
    textView.setText(ag0.W(this.N0));
    if (c81.c(P()).c(this.N0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener(new ag(1, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296973);
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0.f(view, false);
    ss0 ss01 = this.M0;
    if (ss01 != null && ss01.isShowing())
      this.M0.dismiss(); 
    this.M0 = ms0.p();
  }
  
  public final void J0() {
    if (this.J0 == 2) {
      ViewParent viewParent;
      this.a0 = this.R0.getInt("k_i_armd", 0);
      int[] arrayOfInt = m92.h;
      ag0.C0(arrayOfInt[11], this.o0.getBackground());
      ag0.C0(arrayOfInt[11], this.p0.getBackground());
      ag0.C0(arrayOfInt[11], this.q0.getBackground());
      this.o0.setTextColor(arrayOfInt[7]);
      this.p0.setTextColor(arrayOfInt[7]);
      this.q0.setTextColor(arrayOfInt[7]);
      int j = this.a0;
      if (j == 0) {
        this.n0.setText(2131887306);
        this.x0.setContentDescription(T(2131887424));
        ag0.C0(arrayOfInt[3], this.o0.getBackground());
        this.o0.setTextColor(arrayOfInt[3]);
        viewParent = this.o0.getParent();
        TextView textView = this.o0;
        viewParent.requestChildFocus((View)textView, (View)textView);
      } else {
        TextView textView;
        if (j == 1) {
          this.n0.setText(2131887305);
          this.x0.setContentDescription(T(2131887422));
          ag0.C0(viewParent[3], this.p0.getBackground());
          this.p0.setTextColor(viewParent[3]);
          ViewParent viewParent1 = this.p0.getParent();
          textView = this.p0;
          viewParent1.requestChildFocus((View)textView, (View)textView);
        } else if (j == 2) {
          this.n0.setText(2131887298);
          this.x0.setContentDescription(T(2131887426));
          ag0.C0(textView[3], this.q0.getBackground());
          this.q0.setTextColor(textView[3]);
          ViewParent viewParent1 = this.q0.getParent();
          textView = this.q0;
          viewParent1.requestChildFocus((View)textView, (View)textView);
        } 
      } 
    } 
    this.f0 = new ArrayList();
    this.g0 = new ArrayList();
    int i = this.J0;
    if (i == 1) {
      try {
        this.f0 = MyApplication.j.c.e();
        boolean bool1 = z51.x(8);
        boolean bool2 = z51.w(8);
        i = MyApplication.o().getInt("K_S_SALB", 0);
        this.o1 = i;
        z51.P(this.f0, i, bool1, bool2);
      } finally {
        Exception exception = null;
      } 
    } else if (i == 2) {
      boolean bool1;
      boolean bool2;
      try {
        i = this.a0;
        if (i == 0) {
          bool2 = z51.x(16);
          bool1 = z51.w(16);
          this.f0 = MyApplication.j.c.f();
        } else if (i == 1) {
          bool2 = z51.x(32);
          bool1 = z51.w(32);
          this.f0 = MyApplication.j.c.d();
        } else if (i == 2) {
          bool2 = z51.x(64);
          bool1 = z51.w(64);
          this.f0 = MyApplication.j.c.g();
        } else {
          bool1 = false;
          bool2 = false;
        } 
      } finally {
        Exception exception;
      } 
      i = MyApplication.o().getInt("K_S_SARB", 0);
      this.o1 = i;
      z51.P(this.f0, i, bool2, bool1);
    } else {
      try {
        this.f0 = MyApplication.j.c.h();
        i = MyApplication.o().getInt("K_S_SGNB", 0);
        this.o1 = i;
        z51.P(this.f0, i, false, false);
      } finally {
        Exception exception = null;
      } 
    } 
    ArrayList arrayList = this.f0;
    if (arrayList != null && arrayList.size() > 3) {
      this.n0.setVisibility(0);
    } else {
      this.n0.setVisibility(4);
    } 
  }
  
  public final boolean K0() {
    if (this.e1 == null)
      return false; 
    byte b = 0;
    while (true) {
      boolean[] arrayOfBoolean = this.e1;
      if (b < arrayOfBoolean.length) {
        if (!arrayOfBoolean[b])
          return false; 
        b++;
        continue;
      } 
      return true;
    } 
  }
  
  public final void L0(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield f0 : Ljava/util/ArrayList;
    //   5: invokevirtual size : ()I
    //   8: if_icmplt -> 24
    //   11: aload_0
    //   12: getfield f0 : Ljava/util/ArrayList;
    //   15: invokevirtual size : ()I
    //   18: iconst_1
    //   19: isub
    //   20: istore_1
    //   21: goto -> 24
    //   24: aconst_null
    //   25: astore #6
    //   27: iload_1
    //   28: iflt -> 47
    //   31: aload_0
    //   32: getfield f0 : Ljava/util/ArrayList;
    //   35: iload_1
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast q3
    //   42: astore #5
    //   44: goto -> 50
    //   47: aconst_null
    //   48: astore #5
    //   50: aload_0
    //   51: aload #5
    //   53: putfield c1 : Lq3;
    //   56: aload_0
    //   57: iload_1
    //   58: putfield K0 : I
    //   61: aload_0
    //   62: getfield m0 : Landroid/widget/TextView;
    //   65: astore #7
    //   67: aload #5
    //   69: ifnull -> 1513
    //   72: aload #7
    //   74: aload #5
    //   76: getfield c : Ljava/lang/String;
    //   79: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   82: aload_0
    //   83: getfield y0 : Landroid/widget/TextView;
    //   86: aload_0
    //   87: getfield c1 : Lq3;
    //   90: getfield c : Ljava/lang/String;
    //   93: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   96: aload_0
    //   97: getfield J0 : I
    //   100: istore_1
    //   101: bipush #8
    //   103: istore_2
    //   104: iload_1
    //   105: iconst_1
    //   106: if_icmpne -> 499
    //   109: aload_0
    //   110: iconst_0
    //   111: putfield j1 : Z
    //   114: aload_0
    //   115: getfield R0 : Landroid/content/SharedPreferences;
    //   118: ldc_w 'k_b_alsubcme'
    //   121: iconst_1
    //   122: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   127: ifeq -> 460
    //   130: aload_0
    //   131: iconst_1
    //   132: putfield j1 : Z
    //   135: aload_0
    //   136: getfield z0 : Landroid/widget/TextView;
    //   139: aconst_null
    //   140: aconst_null
    //   141: aload_0
    //   142: getfield k1 : Landroid/graphics/drawable/Drawable;
    //   145: aconst_null
    //   146: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   149: aload_0
    //   150: getfield z0 : Landroid/widget/TextView;
    //   153: iconst_0
    //   154: invokevirtual setVisibility : (I)V
    //   157: aload_0
    //   158: getfield D0 : Landroid/widget/TextView;
    //   161: iconst_0
    //   162: invokevirtual setVisibility : (I)V
    //   165: aload_0
    //   166: getfield R0 : Landroid/content/SharedPreferences;
    //   169: ldc_w 'k_i_alsubcmt'
    //   172: iconst_0
    //   173: invokeinterface getInt : (Ljava/lang/String;I)I
    //   178: istore_1
    //   179: aload_0
    //   180: iload_1
    //   181: putfield a1 : I
    //   184: iload_1
    //   185: ifne -> 270
    //   188: aload_0
    //   189: getfield z0 : Landroid/widget/TextView;
    //   192: ldc_w 2131886211
    //   195: invokevirtual setText : (I)V
    //   198: aload_0
    //   199: getfield c1 : Lq3;
    //   202: astore #5
    //   204: aload #5
    //   206: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   209: getfield c : Llm0;
    //   212: invokevirtual m : (Llm0;)V
    //   215: new java/util/ArrayList
    //   218: dup
    //   219: aload #5
    //   221: getfield o : Lzi;
    //   224: invokevirtual values : ()Ljava/util/Collection;
    //   227: invokespecial <init> : (Ljava/util/Collection;)V
    //   230: astore #5
    //   232: aload_0
    //   233: aload #5
    //   235: putfield d1 : Ljava/util/ArrayList;
    //   238: aload #5
    //   240: invokevirtual size : ()I
    //   243: pop
    //   244: aload_0
    //   245: getfield A0 : Landroid/widget/TextView;
    //   248: ldc_w 2131887390
    //   251: invokevirtual setText : (I)V
    //   254: bipush #16
    //   256: invokestatic x : (I)Z
    //   259: istore_3
    //   260: bipush #16
    //   262: invokestatic w : (I)Z
    //   265: istore #4
    //   267: goto -> 449
    //   270: iload_1
    //   271: iconst_1
    //   272: if_icmpne -> 357
    //   275: aload_0
    //   276: getfield z0 : Landroid/widget/TextView;
    //   279: ldc_w 2131886154
    //   282: invokevirtual setText : (I)V
    //   285: aload_0
    //   286: getfield c1 : Lq3;
    //   289: astore #5
    //   291: aload #5
    //   293: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   296: getfield c : Llm0;
    //   299: invokevirtual m : (Llm0;)V
    //   302: new java/util/ArrayList
    //   305: dup
    //   306: aload #5
    //   308: getfield p : Lzi;
    //   311: invokevirtual values : ()Ljava/util/Collection;
    //   314: invokespecial <init> : (Ljava/util/Collection;)V
    //   317: astore #5
    //   319: aload_0
    //   320: aload #5
    //   322: putfield d1 : Ljava/util/ArrayList;
    //   325: aload #5
    //   327: invokevirtual size : ()I
    //   330: pop
    //   331: aload_0
    //   332: getfield A0 : Landroid/widget/TextView;
    //   335: ldc_w 2131887385
    //   338: invokevirtual setText : (I)V
    //   341: bipush #32
    //   343: invokestatic x : (I)Z
    //   346: istore_3
    //   347: bipush #32
    //   349: invokestatic w : (I)Z
    //   352: istore #4
    //   354: goto -> 449
    //   357: iload_1
    //   358: iconst_4
    //   359: if_icmpne -> 444
    //   362: aload_0
    //   363: getfield z0 : Landroid/widget/TextView;
    //   366: ldc_w 2131886398
    //   369: invokevirtual setText : (I)V
    //   372: aload_0
    //   373: getfield c1 : Lq3;
    //   376: astore #5
    //   378: aload #5
    //   380: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   383: getfield c : Llm0;
    //   386: invokevirtual m : (Llm0;)V
    //   389: new java/util/ArrayList
    //   392: dup
    //   393: aload #5
    //   395: getfield q : Lzi;
    //   398: invokevirtual values : ()Ljava/util/Collection;
    //   401: invokespecial <init> : (Ljava/util/Collection;)V
    //   404: astore #5
    //   406: aload_0
    //   407: aload #5
    //   409: putfield d1 : Ljava/util/ArrayList;
    //   412: aload #5
    //   414: invokevirtual size : ()I
    //   417: pop
    //   418: aload_0
    //   419: getfield A0 : Landroid/widget/TextView;
    //   422: ldc_w 2131887391
    //   425: invokevirtual setText : (I)V
    //   428: bipush #64
    //   430: invokestatic x : (I)Z
    //   433: istore_3
    //   434: bipush #64
    //   436: invokestatic w : (I)Z
    //   439: istore #4
    //   441: goto -> 449
    //   444: iconst_0
    //   445: istore_3
    //   446: iconst_0
    //   447: istore #4
    //   449: aload_0
    //   450: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   453: iconst_0
    //   454: invokevirtual setVisibility : (I)V
    //   457: goto -> 1175
    //   460: aload_0
    //   461: getfield z0 : Landroid/widget/TextView;
    //   464: bipush #8
    //   466: invokevirtual setVisibility : (I)V
    //   469: aload_0
    //   470: getfield D0 : Landroid/widget/TextView;
    //   473: bipush #8
    //   475: invokevirtual setVisibility : (I)V
    //   478: aload_0
    //   479: getfield A0 : Landroid/widget/TextView;
    //   482: bipush #8
    //   484: invokevirtual setVisibility : (I)V
    //   487: aload_0
    //   488: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   491: bipush #8
    //   493: invokevirtual setVisibility : (I)V
    //   496: goto -> 1170
    //   499: iload_1
    //   500: iconst_2
    //   501: if_icmpne -> 691
    //   504: aload_0
    //   505: iconst_0
    //   506: putfield j1 : Z
    //   509: aload_0
    //   510: getfield z0 : Landroid/widget/TextView;
    //   513: aconst_null
    //   514: aconst_null
    //   515: aconst_null
    //   516: aconst_null
    //   517: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   520: aload_0
    //   521: getfield R0 : Landroid/content/SharedPreferences;
    //   524: ldc_w 'k_b_arsubcme'
    //   527: iconst_1
    //   528: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   533: ifeq -> 652
    //   536: aload_0
    //   537: iconst_1
    //   538: putfield j1 : Z
    //   541: aload_0
    //   542: getfield z0 : Landroid/widget/TextView;
    //   545: iconst_0
    //   546: invokevirtual setVisibility : (I)V
    //   549: aload_0
    //   550: getfield D0 : Landroid/widget/TextView;
    //   553: iconst_0
    //   554: invokevirtual setVisibility : (I)V
    //   557: aload_0
    //   558: iconst_2
    //   559: putfield a1 : I
    //   562: aload_0
    //   563: getfield z0 : Landroid/widget/TextView;
    //   566: ldc_w 2131886155
    //   569: invokevirtual setText : (I)V
    //   572: aload_0
    //   573: getfield c1 : Lq3;
    //   576: astore #5
    //   578: aload #5
    //   580: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   583: getfield c : Llm0;
    //   586: invokevirtual m : (Llm0;)V
    //   589: new java/util/ArrayList
    //   592: dup
    //   593: aload #5
    //   595: getfield n : Lzi;
    //   598: invokevirtual values : ()Ljava/util/Collection;
    //   601: invokespecial <init> : (Ljava/util/Collection;)V
    //   604: astore #5
    //   606: aload_0
    //   607: aload #5
    //   609: putfield d1 : Ljava/util/ArrayList;
    //   612: aload #5
    //   614: invokevirtual size : ()I
    //   617: pop
    //   618: aload_0
    //   619: getfield A0 : Landroid/widget/TextView;
    //   622: ldc_w 2131887386
    //   625: invokevirtual setText : (I)V
    //   628: bipush #8
    //   630: invokestatic x : (I)Z
    //   633: istore_3
    //   634: bipush #8
    //   636: invokestatic w : (I)Z
    //   639: istore #4
    //   641: aload_0
    //   642: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   645: iconst_0
    //   646: invokevirtual setVisibility : (I)V
    //   649: goto -> 1175
    //   652: aload_0
    //   653: getfield z0 : Landroid/widget/TextView;
    //   656: bipush #8
    //   658: invokevirtual setVisibility : (I)V
    //   661: aload_0
    //   662: getfield D0 : Landroid/widget/TextView;
    //   665: bipush #8
    //   667: invokevirtual setVisibility : (I)V
    //   670: aload_0
    //   671: getfield A0 : Landroid/widget/TextView;
    //   674: bipush #8
    //   676: invokevirtual setVisibility : (I)V
    //   679: aload_0
    //   680: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   683: bipush #8
    //   685: invokevirtual setVisibility : (I)V
    //   688: goto -> 1170
    //   691: iload_1
    //   692: iconst_3
    //   693: if_icmpne -> 1170
    //   696: aload_0
    //   697: iconst_0
    //   698: putfield j1 : Z
    //   701: aload_0
    //   702: getfield R0 : Landroid/content/SharedPreferences;
    //   705: ldc_w 'k_b_gnsubcme'
    //   708: iconst_1
    //   709: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   714: ifeq -> 1134
    //   717: aload_0
    //   718: iconst_1
    //   719: putfield j1 : Z
    //   722: aload_0
    //   723: getfield z0 : Landroid/widget/TextView;
    //   726: aconst_null
    //   727: aconst_null
    //   728: aload_0
    //   729: getfield k1 : Landroid/graphics/drawable/Drawable;
    //   732: aconst_null
    //   733: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   736: aload_0
    //   737: getfield z0 : Landroid/widget/TextView;
    //   740: iconst_0
    //   741: invokevirtual setVisibility : (I)V
    //   744: aload_0
    //   745: getfield D0 : Landroid/widget/TextView;
    //   748: iconst_0
    //   749: invokevirtual setVisibility : (I)V
    //   752: aload_0
    //   753: getfield R0 : Landroid/content/SharedPreferences;
    //   756: ldc_w 'k_i_gnsubcmt'
    //   759: iconst_0
    //   760: invokeinterface getInt : (Ljava/lang/String;I)I
    //   765: istore_1
    //   766: aload_0
    //   767: iload_1
    //   768: putfield a1 : I
    //   771: iload_1
    //   772: ifne -> 857
    //   775: aload_0
    //   776: getfield z0 : Landroid/widget/TextView;
    //   779: ldc_w 2131886211
    //   782: invokevirtual setText : (I)V
    //   785: aload_0
    //   786: getfield c1 : Lq3;
    //   789: astore #5
    //   791: aload #5
    //   793: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   796: getfield c : Llm0;
    //   799: invokevirtual m : (Llm0;)V
    //   802: new java/util/ArrayList
    //   805: dup
    //   806: aload #5
    //   808: getfield o : Lzi;
    //   811: invokevirtual values : ()Ljava/util/Collection;
    //   814: invokespecial <init> : (Ljava/util/Collection;)V
    //   817: astore #5
    //   819: aload_0
    //   820: aload #5
    //   822: putfield d1 : Ljava/util/ArrayList;
    //   825: aload #5
    //   827: invokevirtual size : ()I
    //   830: pop
    //   831: aload_0
    //   832: getfield A0 : Landroid/widget/TextView;
    //   835: ldc_w 2131887390
    //   838: invokevirtual setText : (I)V
    //   841: bipush #16
    //   843: invokestatic x : (I)Z
    //   846: istore_3
    //   847: bipush #16
    //   849: invokestatic w : (I)Z
    //   852: istore #4
    //   854: goto -> 1123
    //   857: iload_1
    //   858: iconst_1
    //   859: if_icmpne -> 944
    //   862: aload_0
    //   863: getfield z0 : Landroid/widget/TextView;
    //   866: ldc_w 2131886154
    //   869: invokevirtual setText : (I)V
    //   872: aload_0
    //   873: getfield c1 : Lq3;
    //   876: astore #5
    //   878: aload #5
    //   880: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   883: getfield c : Llm0;
    //   886: invokevirtual m : (Llm0;)V
    //   889: new java/util/ArrayList
    //   892: dup
    //   893: aload #5
    //   895: getfield p : Lzi;
    //   898: invokevirtual values : ()Ljava/util/Collection;
    //   901: invokespecial <init> : (Ljava/util/Collection;)V
    //   904: astore #5
    //   906: aload_0
    //   907: aload #5
    //   909: putfield d1 : Ljava/util/ArrayList;
    //   912: aload #5
    //   914: invokevirtual size : ()I
    //   917: pop
    //   918: aload_0
    //   919: getfield A0 : Landroid/widget/TextView;
    //   922: ldc_w 2131887385
    //   925: invokevirtual setText : (I)V
    //   928: bipush #32
    //   930: invokestatic x : (I)Z
    //   933: istore_3
    //   934: bipush #32
    //   936: invokestatic w : (I)Z
    //   939: istore #4
    //   941: goto -> 1123
    //   944: iload_1
    //   945: iconst_2
    //   946: if_icmpne -> 1031
    //   949: aload_0
    //   950: getfield z0 : Landroid/widget/TextView;
    //   953: ldc_w 2131886155
    //   956: invokevirtual setText : (I)V
    //   959: aload_0
    //   960: getfield c1 : Lq3;
    //   963: astore #5
    //   965: aload #5
    //   967: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   970: getfield c : Llm0;
    //   973: invokevirtual m : (Llm0;)V
    //   976: new java/util/ArrayList
    //   979: dup
    //   980: aload #5
    //   982: getfield n : Lzi;
    //   985: invokevirtual values : ()Ljava/util/Collection;
    //   988: invokespecial <init> : (Ljava/util/Collection;)V
    //   991: astore #5
    //   993: aload_0
    //   994: aload #5
    //   996: putfield d1 : Ljava/util/ArrayList;
    //   999: aload #5
    //   1001: invokevirtual size : ()I
    //   1004: pop
    //   1005: aload_0
    //   1006: getfield A0 : Landroid/widget/TextView;
    //   1009: ldc_w 2131887386
    //   1012: invokevirtual setText : (I)V
    //   1015: bipush #8
    //   1017: invokestatic x : (I)Z
    //   1020: istore_3
    //   1021: bipush #8
    //   1023: invokestatic w : (I)Z
    //   1026: istore #4
    //   1028: goto -> 1123
    //   1031: iload_1
    //   1032: iconst_4
    //   1033: if_icmpne -> 1118
    //   1036: aload_0
    //   1037: getfield z0 : Landroid/widget/TextView;
    //   1040: ldc_w 2131886398
    //   1043: invokevirtual setText : (I)V
    //   1046: aload_0
    //   1047: getfield c1 : Lq3;
    //   1050: astore #5
    //   1052: aload #5
    //   1054: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1057: getfield c : Llm0;
    //   1060: invokevirtual m : (Llm0;)V
    //   1063: new java/util/ArrayList
    //   1066: dup
    //   1067: aload #5
    //   1069: getfield q : Lzi;
    //   1072: invokevirtual values : ()Ljava/util/Collection;
    //   1075: invokespecial <init> : (Ljava/util/Collection;)V
    //   1078: astore #5
    //   1080: aload_0
    //   1081: aload #5
    //   1083: putfield d1 : Ljava/util/ArrayList;
    //   1086: aload #5
    //   1088: invokevirtual size : ()I
    //   1091: pop
    //   1092: aload_0
    //   1093: getfield A0 : Landroid/widget/TextView;
    //   1096: ldc_w 2131887391
    //   1099: invokevirtual setText : (I)V
    //   1102: bipush #64
    //   1104: invokestatic x : (I)Z
    //   1107: istore_3
    //   1108: bipush #64
    //   1110: invokestatic w : (I)Z
    //   1113: istore #4
    //   1115: goto -> 1123
    //   1118: iconst_0
    //   1119: istore_3
    //   1120: iconst_0
    //   1121: istore #4
    //   1123: aload_0
    //   1124: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1127: iconst_0
    //   1128: invokevirtual setVisibility : (I)V
    //   1131: goto -> 1175
    //   1134: aload_0
    //   1135: getfield z0 : Landroid/widget/TextView;
    //   1138: bipush #8
    //   1140: invokevirtual setVisibility : (I)V
    //   1143: aload_0
    //   1144: getfield D0 : Landroid/widget/TextView;
    //   1147: bipush #8
    //   1149: invokevirtual setVisibility : (I)V
    //   1152: aload_0
    //   1153: getfield A0 : Landroid/widget/TextView;
    //   1156: bipush #8
    //   1158: invokevirtual setVisibility : (I)V
    //   1161: aload_0
    //   1162: getfield E0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1165: bipush #8
    //   1167: invokevirtual setVisibility : (I)V
    //   1170: iconst_0
    //   1171: istore_3
    //   1172: iconst_0
    //   1173: istore #4
    //   1175: aload_0
    //   1176: getfield a1 : I
    //   1179: invokestatic I0 : (I)Ljava/lang/String;
    //   1182: astore #5
    //   1184: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1187: aload #5
    //   1189: iconst_0
    //   1190: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1195: istore_1
    //   1196: aload_0
    //   1197: getfield d1 : Ljava/util/ArrayList;
    //   1200: iload_1
    //   1201: iload_3
    //   1202: iload #4
    //   1204: invokestatic P : (Ljava/util/ArrayList;IZZ)V
    //   1207: aload_0
    //   1208: getfield f1 : [Z
    //   1211: astore #5
    //   1213: aload #5
    //   1215: ifnull -> 1245
    //   1218: aload #5
    //   1220: arraylength
    //   1221: aload_0
    //   1222: getfield d1 : Ljava/util/ArrayList;
    //   1225: invokevirtual size : ()I
    //   1228: if_icmpeq -> 1234
    //   1231: goto -> 1245
    //   1234: aload_0
    //   1235: aload_0
    //   1236: getfield f1 : [Z
    //   1239: putfield e1 : [Z
    //   1242: goto -> 1284
    //   1245: aload_0
    //   1246: aload_0
    //   1247: getfield d1 : Ljava/util/ArrayList;
    //   1250: invokevirtual size : ()I
    //   1253: newarray boolean
    //   1255: putfield e1 : [Z
    //   1258: iconst_0
    //   1259: istore_1
    //   1260: aload_0
    //   1261: getfield e1 : [Z
    //   1264: astore #5
    //   1266: iload_1
    //   1267: aload #5
    //   1269: arraylength
    //   1270: if_icmpge -> 1284
    //   1273: aload #5
    //   1275: iload_1
    //   1276: iconst_1
    //   1277: bastore
    //   1278: iinc #1, 1
    //   1281: goto -> 1260
    //   1284: aload_0
    //   1285: aconst_null
    //   1286: putfield f1 : [Z
    //   1289: aload_0
    //   1290: invokevirtual O0 : ()V
    //   1293: aload_0
    //   1294: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1297: bipush #8
    //   1299: invokevirtual setVisibility : (I)V
    //   1302: aload_0
    //   1303: getfield P0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   1306: bipush #8
    //   1308: invokevirtual setVisibility : (I)V
    //   1311: aload_0
    //   1312: getfield i0 : Landroid/view/ViewGroup;
    //   1315: bipush #8
    //   1317: invokevirtual setVisibility : (I)V
    //   1320: aload_0
    //   1321: getfield j0 : Landroid/view/ViewGroup;
    //   1324: bipush #8
    //   1326: invokevirtual setVisibility : (I)V
    //   1329: aload_0
    //   1330: getfield g0 : Ljava/util/ArrayList;
    //   1333: invokevirtual size : ()I
    //   1336: iconst_3
    //   1337: if_icmple -> 1420
    //   1340: aload_0
    //   1341: getfield J0 : I
    //   1344: istore_1
    //   1345: iload_1
    //   1346: iconst_1
    //   1347: if_icmpne -> 1358
    //   1350: ldc_w 'k_b_qsal1'
    //   1353: astore #5
    //   1355: goto -> 1385
    //   1358: iload_1
    //   1359: iconst_2
    //   1360: if_icmpne -> 1371
    //   1363: ldc_w 'k_b_qsar1'
    //   1366: astore #5
    //   1368: goto -> 1385
    //   1371: aload #6
    //   1373: astore #5
    //   1375: iload_1
    //   1376: iconst_3
    //   1377: if_icmpne -> 1385
    //   1380: ldc_w 'k_b_qsgn1'
    //   1383: astore #5
    //   1385: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1388: aload #5
    //   1390: iconst_1
    //   1391: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1396: istore_3
    //   1397: aload_0
    //   1398: getfield s0 : Landroid/widget/TextView;
    //   1401: astore #5
    //   1403: iload_2
    //   1404: istore_1
    //   1405: iload_3
    //   1406: ifeq -> 1411
    //   1409: iconst_0
    //   1410: istore_1
    //   1411: aload #5
    //   1413: iload_1
    //   1414: invokevirtual setVisibility : (I)V
    //   1417: goto -> 1429
    //   1420: aload_0
    //   1421: getfield s0 : Landroid/widget/TextView;
    //   1424: bipush #8
    //   1426: invokevirtual setVisibility : (I)V
    //   1429: aload_0
    //   1430: getfield r0 : Landroid/view/ViewGroup;
    //   1433: iconst_0
    //   1434: invokevirtual setVisibility : (I)V
    //   1437: aload_0
    //   1438: getfield Q0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   1441: aload_0
    //   1442: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   1445: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   1448: aload_0
    //   1449: iconst_1
    //   1450: putfield I0 : Z
    //   1453: aload_0
    //   1454: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1457: astore #5
    //   1459: aload #5
    //   1461: getfield h0 : Lh50;
    //   1464: aload #5
    //   1466: getfield U : Lt32;
    //   1469: invokevirtual getCurrentItem : ()I
    //   1472: invokevirtual h : (I)Lua0;
    //   1475: aload_0
    //   1476: if_acmpne -> 1504
    //   1479: aload_0
    //   1480: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1483: getfield t0 : Lly0;
    //   1486: aload_0
    //   1487: getfield I0 : Z
    //   1490: invokevirtual f : (Z)V
    //   1493: aload_0
    //   1494: getfield L0 : Lin/krosbits/musicolet/MusicActivity;
    //   1497: getfield t0 : Lly0;
    //   1500: iconst_0
    //   1501: putfield j : I
    //   1504: return
    //   1505: astore #5
    //   1507: aload #5
    //   1509: invokevirtual printStackTrace : ()V
    //   1512: return
    //   1513: aload #7
    //   1515: ldc_w ''
    //   1518: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1521: aload_0
    //   1522: getfield y0 : Landroid/widget/TextView;
    //   1525: ldc_w ''
    //   1528: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1531: return
    // Exception table:
    //   from	to	target	type
    //   1453	1504	1505	java/lang/Exception
  }
  
  public final void M0(String paramString) {
    if (this.J0 == 1)
      int i = this.d0.i; 
    this.M0 = (new ub1(P(), this.n0.getText().toString(), new ArrayList(this.d0.e), 0, this, paramString)).p();
  }
  
  public final void N0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f0 : Ljava/util/ArrayList;
    //   4: invokevirtual size : ()I
    //   7: pop
    //   8: aload_0
    //   9: getfield I0 : Z
    //   12: istore_2
    //   13: aconst_null
    //   14: astore #4
    //   16: iload_2
    //   17: ifeq -> 52
    //   20: aload_0
    //   21: getfield O0 : Ljava/util/ArrayList;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull -> 52
    //   29: aload_3
    //   30: invokevirtual size : ()I
    //   33: iconst_1
    //   34: if_icmpne -> 52
    //   37: aload_0
    //   38: getfield O0 : Ljava/util/ArrayList;
    //   41: iconst_0
    //   42: invokevirtual get : (I)Ljava/lang/Object;
    //   45: checkcast km0
    //   48: astore_3
    //   49: goto -> 54
    //   52: aconst_null
    //   53: astore_3
    //   54: aload_0
    //   55: getfield I0 : Z
    //   58: ifeq -> 69
    //   61: aload_0
    //   62: aload_0
    //   63: getfield e1 : [Z
    //   66: putfield f1 : [Z
    //   69: aload_0
    //   70: invokevirtual J0 : ()V
    //   73: aload_0
    //   74: getfield d0 : Lrn;
    //   77: astore #6
    //   79: aload_0
    //   80: getfield f0 : Ljava/util/ArrayList;
    //   83: astore #5
    //   85: aload_0
    //   86: invokevirtual E0 : ()I
    //   89: istore_1
    //   90: aload #6
    //   92: aload #5
    //   94: putfield e : Ljava/util/ArrayList;
    //   97: aload #6
    //   99: iload_1
    //   100: putfield d : I
    //   103: aload #6
    //   105: invokevirtual g : ()V
    //   108: aload_0
    //   109: getfield I0 : Z
    //   112: ifeq -> 171
    //   115: aload_0
    //   116: getfield c1 : Lq3;
    //   119: ifnull -> 171
    //   122: iconst_0
    //   123: istore_1
    //   124: iload_1
    //   125: aload_0
    //   126: getfield f0 : Ljava/util/ArrayList;
    //   129: invokevirtual size : ()I
    //   132: if_icmpge -> 171
    //   135: aload_0
    //   136: getfield f0 : Ljava/util/ArrayList;
    //   139: iload_1
    //   140: invokevirtual get : (I)Ljava/lang/Object;
    //   143: checkcast q3
    //   146: getfield r : Ljava/lang/String;
    //   149: aload_0
    //   150: getfield c1 : Lq3;
    //   153: getfield r : Ljava/lang/String;
    //   156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   159: ifeq -> 165
    //   162: goto -> 173
    //   165: iinc #1, 1
    //   168: goto -> 124
    //   171: iconst_m1
    //   172: istore_1
    //   173: iload_1
    //   174: iflt -> 221
    //   177: aload_0
    //   178: getfield I0 : Z
    //   181: ifeq -> 231
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield I0 : Z
    //   189: aload_0
    //   190: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   193: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   196: invokevirtual t0 : ()Landroid/os/Parcelable;
    //   199: astore #5
    //   201: aload_0
    //   202: iload_1
    //   203: invokevirtual d : (I)V
    //   206: aload_0
    //   207: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   210: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   213: aload #5
    //   215: invokevirtual s0 : (Landroid/os/Parcelable;)V
    //   218: goto -> 231
    //   221: aload_0
    //   222: iconst_1
    //   223: putfield I0 : Z
    //   226: aload_0
    //   227: invokevirtual e : ()Z
    //   230: pop
    //   231: aload_0
    //   232: getfield P0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   235: aload_0
    //   236: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   239: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   242: aload_3
    //   243: ifnull -> 314
    //   246: aload_0
    //   247: getfield I0 : Z
    //   250: ifeq -> 269
    //   253: aload_0
    //   254: getfield e0 : Lrn1;
    //   257: getfield d : Ljava/util/ArrayList;
    //   260: aload_3
    //   261: invokestatic p : (Ljava/util/ArrayList;Lkm0;)Ljava/lang/Object;
    //   264: checkcast km0
    //   267: astore #4
    //   269: aload #4
    //   271: ifnull -> 302
    //   274: aload_0
    //   275: aload #4
    //   277: putfield N0 : Lkm0;
    //   280: new java/util/ArrayList
    //   283: dup
    //   284: iconst_1
    //   285: invokespecial <init> : (I)V
    //   288: astore_3
    //   289: aload_0
    //   290: aload_3
    //   291: putfield O0 : Ljava/util/ArrayList;
    //   294: aload_3
    //   295: aload #4
    //   297: invokevirtual add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: return
    //   302: aload_0
    //   303: new java/util/ArrayList
    //   306: dup
    //   307: iconst_0
    //   308: invokespecial <init> : (I)V
    //   311: putfield O0 : Ljava/util/ArrayList;
    //   314: return
  }
  
  public final void O0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield J0 : I
    //   4: istore_1
    //   5: aload_0
    //   6: getfield c1 : Lq3;
    //   9: astore_3
    //   10: iload_1
    //   11: iconst_1
    //   12: if_icmpne -> 236
    //   15: aload_0
    //   16: getfield j1 : Z
    //   19: ifne -> 47
    //   22: aload_0
    //   23: aload_3
    //   24: getfield l : J
    //   27: putfield b1 : J
    //   30: aload_3
    //   31: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   34: getfield c : Llm0;
    //   37: iconst_0
    //   38: newarray int
    //   40: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   43: astore_3
    //   44: goto -> 228
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield i1 : I
    //   52: aload_0
    //   53: lconst_0
    //   54: putfield b1 : J
    //   57: new java/util/HashSet
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: astore #4
    //   66: iconst_0
    //   67: istore_1
    //   68: aload_0
    //   69: getfield e1 : [Z
    //   72: astore_3
    //   73: iload_1
    //   74: aload_3
    //   75: arraylength
    //   76: if_icmpge -> 120
    //   79: aload_3
    //   80: iload_1
    //   81: baload
    //   82: ifeq -> 114
    //   85: aload #4
    //   87: aload_0
    //   88: getfield d1 : Ljava/util/ArrayList;
    //   91: iload_1
    //   92: invokevirtual get : (I)Ljava/lang/Object;
    //   95: checkcast q3
    //   98: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   101: getfield c : Llm0;
    //   104: iconst_0
    //   105: newarray int
    //   107: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   110: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   113: pop
    //   114: iinc #1, 1
    //   117: goto -> 68
    //   120: new java/util/ArrayList
    //   123: dup
    //   124: aload #4
    //   126: invokevirtual size : ()I
    //   129: invokespecial <init> : (I)V
    //   132: astore_3
    //   133: aload #4
    //   135: invokevirtual iterator : ()Ljava/util/Iterator;
    //   138: astore #4
    //   140: aload #4
    //   142: invokeinterface hasNext : ()Z
    //   147: ifeq -> 190
    //   150: aload #4
    //   152: invokeinterface next : ()Ljava/lang/Object;
    //   157: checkcast km0
    //   160: astore #5
    //   162: aload_3
    //   163: aload #5
    //   165: invokevirtual add : (Ljava/lang/Object;)Z
    //   168: pop
    //   169: aload_0
    //   170: aload_0
    //   171: getfield b1 : J
    //   174: aload #5
    //   176: getfield c : Lqn1;
    //   179: getfield g : I
    //   182: i2l
    //   183: ladd
    //   184: putfield b1 : J
    //   187: goto -> 140
    //   190: iconst_0
    //   191: istore_1
    //   192: aload_0
    //   193: getfield e1 : [Z
    //   196: astore #4
    //   198: iload_1
    //   199: aload #4
    //   201: arraylength
    //   202: if_icmpge -> 228
    //   205: aload #4
    //   207: iload_1
    //   208: baload
    //   209: ifeq -> 222
    //   212: aload_0
    //   213: aload_0
    //   214: getfield i1 : I
    //   217: iconst_1
    //   218: iadd
    //   219: putfield i1 : I
    //   222: iinc #1, 1
    //   225: goto -> 192
    //   228: aload_0
    //   229: aload_3
    //   230: putfield g0 : Ljava/util/ArrayList;
    //   233: goto -> 602
    //   236: aload_0
    //   237: getfield j1 : Z
    //   240: istore_2
    //   241: iload_1
    //   242: iconst_2
    //   243: if_icmpne -> 387
    //   246: iload_2
    //   247: ifne -> 275
    //   250: aload_0
    //   251: aload_3
    //   252: getfield l : J
    //   255: putfield b1 : J
    //   258: aload_3
    //   259: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   262: getfield c : Llm0;
    //   265: iconst_0
    //   266: newarray int
    //   268: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   271: astore_3
    //   272: goto -> 379
    //   275: aload_0
    //   276: iconst_0
    //   277: putfield i1 : I
    //   280: aload_0
    //   281: lconst_0
    //   282: putfield b1 : J
    //   285: new java/util/ArrayList
    //   288: dup
    //   289: invokespecial <init> : ()V
    //   292: astore #4
    //   294: iconst_0
    //   295: istore_1
    //   296: aload_0
    //   297: getfield e1 : [Z
    //   300: astore #5
    //   302: aload #4
    //   304: astore_3
    //   305: iload_1
    //   306: aload #5
    //   308: arraylength
    //   309: if_icmpge -> 379
    //   312: aload #5
    //   314: iload_1
    //   315: baload
    //   316: ifeq -> 373
    //   319: aload_0
    //   320: getfield d1 : Ljava/util/ArrayList;
    //   323: iload_1
    //   324: invokevirtual get : (I)Ljava/lang/Object;
    //   327: checkcast q3
    //   330: astore_3
    //   331: aload #4
    //   333: aload_3
    //   334: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   337: getfield c : Llm0;
    //   340: iconst_0
    //   341: newarray int
    //   343: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   346: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   349: pop
    //   350: aload_0
    //   351: aload_0
    //   352: getfield b1 : J
    //   355: aload_3
    //   356: getfield l : J
    //   359: ladd
    //   360: putfield b1 : J
    //   363: aload_0
    //   364: aload_0
    //   365: getfield i1 : I
    //   368: iconst_1
    //   369: iadd
    //   370: putfield i1 : I
    //   373: iinc #1, 1
    //   376: goto -> 296
    //   379: aload_0
    //   380: aload_3
    //   381: putfield g0 : Ljava/util/ArrayList;
    //   384: goto -> 602
    //   387: iload_2
    //   388: ifne -> 416
    //   391: aload_0
    //   392: aload_3
    //   393: getfield l : J
    //   396: putfield b1 : J
    //   399: aload_3
    //   400: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   403: getfield c : Llm0;
    //   406: iconst_0
    //   407: newarray int
    //   409: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   412: astore_3
    //   413: goto -> 597
    //   416: aload_0
    //   417: iconst_0
    //   418: putfield i1 : I
    //   421: aload_0
    //   422: lconst_0
    //   423: putfield b1 : J
    //   426: new java/util/HashSet
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: astore #4
    //   435: iconst_0
    //   436: istore_1
    //   437: aload_0
    //   438: getfield e1 : [Z
    //   441: astore_3
    //   442: iload_1
    //   443: aload_3
    //   444: arraylength
    //   445: if_icmpge -> 489
    //   448: aload_3
    //   449: iload_1
    //   450: baload
    //   451: ifeq -> 483
    //   454: aload #4
    //   456: aload_0
    //   457: getfield d1 : Ljava/util/ArrayList;
    //   460: iload_1
    //   461: invokevirtual get : (I)Ljava/lang/Object;
    //   464: checkcast q3
    //   467: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   470: getfield c : Llm0;
    //   473: iconst_0
    //   474: newarray int
    //   476: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   479: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   482: pop
    //   483: iinc #1, 1
    //   486: goto -> 437
    //   489: new java/util/ArrayList
    //   492: dup
    //   493: aload #4
    //   495: invokevirtual size : ()I
    //   498: invokespecial <init> : (I)V
    //   501: astore_3
    //   502: aload #4
    //   504: invokevirtual iterator : ()Ljava/util/Iterator;
    //   507: astore #4
    //   509: aload #4
    //   511: invokeinterface hasNext : ()Z
    //   516: ifeq -> 559
    //   519: aload #4
    //   521: invokeinterface next : ()Ljava/lang/Object;
    //   526: checkcast km0
    //   529: astore #5
    //   531: aload_3
    //   532: aload #5
    //   534: invokevirtual add : (Ljava/lang/Object;)Z
    //   537: pop
    //   538: aload_0
    //   539: aload_0
    //   540: getfield b1 : J
    //   543: aload #5
    //   545: getfield c : Lqn1;
    //   548: getfield g : I
    //   551: i2l
    //   552: ladd
    //   553: putfield b1 : J
    //   556: goto -> 509
    //   559: iconst_0
    //   560: istore_1
    //   561: aload_0
    //   562: getfield e1 : [Z
    //   565: astore #4
    //   567: iload_1
    //   568: aload #4
    //   570: arraylength
    //   571: if_icmpge -> 597
    //   574: aload #4
    //   576: iload_1
    //   577: baload
    //   578: ifeq -> 591
    //   581: aload_0
    //   582: aload_0
    //   583: getfield i1 : I
    //   586: iconst_1
    //   587: iadd
    //   588: putfield i1 : I
    //   591: iinc #1, 1
    //   594: goto -> 561
    //   597: aload_0
    //   598: aload_3
    //   599: putfield g0 : Ljava/util/ArrayList;
    //   602: aload_0
    //   603: invokevirtual H0 : ()Ljava/lang/String;
    //   606: astore_3
    //   607: aload_0
    //   608: getfield J0 : I
    //   611: istore_1
    //   612: iload_1
    //   613: iconst_1
    //   614: if_icmpne -> 623
    //   617: bipush #12
    //   619: istore_1
    //   620: goto -> 635
    //   623: iload_1
    //   624: iconst_2
    //   625: if_icmpne -> 633
    //   628: iconst_4
    //   629: istore_1
    //   630: goto -> 635
    //   633: iconst_0
    //   634: istore_1
    //   635: aload_0
    //   636: getfield R0 : Landroid/content/SharedPreferences;
    //   639: aload_3
    //   640: iload_1
    //   641: invokeinterface getInt : (Ljava/lang/String;I)I
    //   646: aload_0
    //   647: getfield g0 : Ljava/util/ArrayList;
    //   650: invokestatic R : (ILjava/util/ArrayList;)V
    //   653: aload_0
    //   654: getfield j1 : Z
    //   657: ifeq -> 1006
    //   660: aload_0
    //   661: getfield a1 : I
    //   664: istore_1
    //   665: iload_1
    //   666: ifne -> 733
    //   669: aload_0
    //   670: getfield D0 : Landroid/widget/TextView;
    //   673: aload_0
    //   674: invokevirtual S : ()Landroid/content/res/Resources;
    //   677: ldc_w 2131887597
    //   680: iconst_2
    //   681: anewarray java/lang/Object
    //   684: dup
    //   685: iconst_0
    //   686: aload_0
    //   687: getfield i1 : I
    //   690: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   693: aastore
    //   694: dup
    //   695: iconst_1
    //   696: aload_0
    //   697: getfield e1 : [Z
    //   700: arraylength
    //   701: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   704: aastore
    //   705: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   708: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   711: aload_0
    //   712: aload_0
    //   713: ldc_w 2131886205
    //   716: invokevirtual T : (I)Ljava/lang/String;
    //   719: putfield r1 : Ljava/lang/String;
    //   722: aload_0
    //   723: ldc_w 2131886211
    //   726: invokevirtual T : (I)Ljava/lang/String;
    //   729: pop
    //   730: goto -> 1006
    //   733: iload_1
    //   734: iconst_1
    //   735: if_icmpne -> 802
    //   738: aload_0
    //   739: getfield D0 : Landroid/widget/TextView;
    //   742: aload_0
    //   743: invokevirtual S : ()Landroid/content/res/Resources;
    //   746: ldc_w 2131887595
    //   749: iconst_2
    //   750: anewarray java/lang/Object
    //   753: dup
    //   754: iconst_0
    //   755: aload_0
    //   756: getfield i1 : I
    //   759: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   762: aastore
    //   763: dup
    //   764: iconst_1
    //   765: aload_0
    //   766: getfield e1 : [Z
    //   769: arraylength
    //   770: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   773: aastore
    //   774: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   777: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   780: aload_0
    //   781: aload_0
    //   782: ldc_w 2131886150
    //   785: invokevirtual T : (I)Ljava/lang/String;
    //   788: putfield r1 : Ljava/lang/String;
    //   791: aload_0
    //   792: ldc_w 2131886154
    //   795: invokevirtual T : (I)Ljava/lang/String;
    //   798: pop
    //   799: goto -> 1006
    //   802: iload_1
    //   803: iconst_2
    //   804: if_icmpne -> 871
    //   807: aload_0
    //   808: getfield D0 : Landroid/widget/TextView;
    //   811: aload_0
    //   812: invokevirtual S : ()Landroid/content/res/Resources;
    //   815: ldc_w 2131887596
    //   818: iconst_2
    //   819: anewarray java/lang/Object
    //   822: dup
    //   823: iconst_0
    //   824: aload_0
    //   825: getfield i1 : I
    //   828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   831: aastore
    //   832: dup
    //   833: iconst_1
    //   834: aload_0
    //   835: getfield e1 : [Z
    //   838: arraylength
    //   839: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   842: aastore
    //   843: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   846: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   849: aload_0
    //   850: aload_0
    //   851: ldc_w 2131886137
    //   854: invokevirtual T : (I)Ljava/lang/String;
    //   857: putfield r1 : Ljava/lang/String;
    //   860: aload_0
    //   861: ldc_w 2131886155
    //   864: invokevirtual T : (I)Ljava/lang/String;
    //   867: pop
    //   868: goto -> 1006
    //   871: iload_1
    //   872: iconst_3
    //   873: if_icmpne -> 940
    //   876: aload_0
    //   877: getfield D0 : Landroid/widget/TextView;
    //   880: aload_0
    //   881: invokevirtual S : ()Landroid/content/res/Resources;
    //   884: ldc_w 2131887599
    //   887: iconst_2
    //   888: anewarray java/lang/Object
    //   891: dup
    //   892: iconst_0
    //   893: aload_0
    //   894: getfield i1 : I
    //   897: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   900: aastore
    //   901: dup
    //   902: iconst_1
    //   903: aload_0
    //   904: getfield e1 : [Z
    //   907: arraylength
    //   908: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   911: aastore
    //   912: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   915: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   918: aload_0
    //   919: aload_0
    //   920: ldc_w 2131886624
    //   923: invokevirtual T : (I)Ljava/lang/String;
    //   926: putfield r1 : Ljava/lang/String;
    //   929: aload_0
    //   930: ldc_w 2131886629
    //   933: invokevirtual T : (I)Ljava/lang/String;
    //   936: pop
    //   937: goto -> 1006
    //   940: iload_1
    //   941: iconst_4
    //   942: if_icmpne -> 1006
    //   945: aload_0
    //   946: getfield D0 : Landroid/widget/TextView;
    //   949: aload_0
    //   950: invokevirtual S : ()Landroid/content/res/Resources;
    //   953: ldc_w 2131887598
    //   956: iconst_2
    //   957: anewarray java/lang/Object
    //   960: dup
    //   961: iconst_0
    //   962: aload_0
    //   963: getfield i1 : I
    //   966: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   969: aastore
    //   970: dup
    //   971: iconst_1
    //   972: aload_0
    //   973: getfield e1 : [Z
    //   976: arraylength
    //   977: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   980: aastore
    //   981: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   984: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   987: aload_0
    //   988: aload_0
    //   989: ldc_w 2131886394
    //   992: invokevirtual T : (I)Ljava/lang/String;
    //   995: putfield r1 : Ljava/lang/String;
    //   998: aload_0
    //   999: ldc_w 2131886398
    //   1002: invokevirtual T : (I)Ljava/lang/String;
    //   1005: pop
    //   1006: aload_0
    //   1007: getfield B0 : Landroid/widget/TextView;
    //   1010: aload_0
    //   1011: invokevirtual S : ()Landroid/content/res/Resources;
    //   1014: ldc_w 2131755061
    //   1017: aload_0
    //   1018: getfield g0 : Ljava/util/ArrayList;
    //   1021: invokevirtual size : ()I
    //   1024: iconst_1
    //   1025: anewarray java/lang/Object
    //   1028: dup
    //   1029: iconst_0
    //   1030: aload_0
    //   1031: getfield g0 : Ljava/util/ArrayList;
    //   1034: invokevirtual size : ()I
    //   1037: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1040: aastore
    //   1041: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1044: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1047: aload_0
    //   1048: getfield C0 : Landroid/widget/TextView;
    //   1051: aload_0
    //   1052: getfield b1 : J
    //   1055: iconst_0
    //   1056: iconst_0
    //   1057: invokestatic B : (JZI)Ljava/lang/String;
    //   1060: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1063: aload_0
    //   1064: getfield g0 : Ljava/util/ArrayList;
    //   1067: astore #4
    //   1069: aload_0
    //   1070: getfield e0 : Lrn1;
    //   1073: astore_3
    //   1074: aload_3
    //   1075: aload #4
    //   1077: putfield d : Ljava/util/ArrayList;
    //   1080: aload_3
    //   1081: invokevirtual g : ()V
    //   1084: aload_0
    //   1085: new java/util/ArrayList
    //   1088: dup
    //   1089: aload #4
    //   1091: invokespecial <init> : (Ljava/util/Collection;)V
    //   1094: putfield O0 : Ljava/util/ArrayList;
    //   1097: aload_0
    //   1098: getfield g1 : Z
    //   1101: ifne -> 1111
    //   1104: aload_0
    //   1105: getfield F0 : Lm90;
    //   1108: invokevirtual g : ()V
    //   1111: aload_0
    //   1112: iconst_0
    //   1113: putfield g1 : Z
    //   1116: return
  }
  
  public final void d(int paramInt) {
    if (!this.I0) {
      L0(paramInt);
      return;
    } 
    this.L0.j0.k(this.g0, paramInt, G0(), true);
    B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
  }
  
  public final boolean e() {
    if (this.I0) {
      this.E0.k0(0);
      this.c0.k0(0);
      this.t0.f(true, false, true);
      this.s0.setVisibility(8);
      this.r0.setVisibility(8);
      this.j0.setVisibility(this.l1);
      this.i0.setVisibility(0);
      this.b0.setVisibility(0);
      this.P0.setVisibility(0);
      this.P0.setRecyclerView(this.b0);
      this.I0 = false;
      try {
        MusicActivity musicActivity = this.L0;
        if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
          this.L0.t0.f(this.I0);
          this.L0.t0.j = 0;
          return true;
        } 
      } catch (Exception exception) {}
      return true;
    } 
    return false;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.L0 = (MusicActivity)paramContext;
  }
  
  public final void f0(Bundle paramBundle) {
    super.f0(paramBundle);
    if (paramBundle != null)
      this.J0 = paramBundle.getInt("type"); 
    this.R0 = P().getSharedPreferences("PP", 0);
    P().getSharedPreferences("USP", 0);
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492988, paramViewGroup, false);
    this.k1 = S().getDrawable(2131231191);
    paramViewGroup = (ViewGroup)view.findViewById(2131297936);
    this.j0 = paramViewGroup;
    this.o0 = (TextView)paramViewGroup.findViewById(2131297694);
    this.p0 = (TextView)this.j0.findViewById(2131297693);
    this.q0 = (TextView)this.j0.findViewById(2131297695);
    paramViewGroup = (ViewGroup)view.findViewById(2131297049);
    this.i0 = paramViewGroup;
    paramViewGroup.setBackgroundDrawable(new wg(0, 0));
    this.n0 = (TextView)this.i0.findViewById(2131297863);
    this.v0 = (ImageView)this.i0.findViewById(2131296910);
    this.x0 = (ImageView)this.i0.findViewById(2131296846);
    this.b0 = (RecyclerView)view.findViewById(2131297407);
    this.P0 = (RecyclerViewScrollBar)view.findViewById(2131297394);
    this.s0 = (TextView)view.findViewById(2131297864);
    view.findViewById(2131297928).setBackground(new wg(0, 1));
    view.findViewById(2131296589).setBackground(new wg(0, 0));
    paramViewGroup = (ViewGroup)view.findViewById(2131296579);
    this.r0 = paramViewGroup;
    this.c0 = (RecyclerView)paramViewGroup.findViewById(2131297406);
    this.Q0 = (RecyclerViewScrollBar)this.r0.findViewById(2131297403);
    this.w0 = (ImageView)this.r0.findViewById(2131296911);
    this.t0 = (AppBarLayout)this.r0.findViewById(2131296354);
    this.u0 = (ImageView)this.r0.findViewById(2131296836);
    this.y0 = (TextView)this.r0.findViewById(2131297690);
    this.z0 = (TextView)this.r0.findViewById(2131297879);
    this.A0 = (TextView)this.r0.findViewById(2131297869);
    this.E0 = (RecyclerView)this.r0.findViewById(2131297427);
    this.B0 = (TextView)this.r0.findViewById(2131297796);
    this.C0 = (TextView)this.r0.findViewById(2131297740);
    this.D0 = (TextView)this.r0.findViewById(2131297811);
    paramViewGroup = (ViewGroup)this.r0.findViewById(2131297386);
    this.h0 = paramViewGroup;
    this.k0 = (ImageView)paramViewGroup.findViewById(2131296835);
    this.m0 = (TextView)this.h0.findViewById(2131297689);
    this.G0 = (ImageView)this.h0.findViewById(2131296876);
    this.H0 = (ImageView)this.h0.findViewById(2131296906);
    this.l0 = (ImageView)this.h0.findViewById(2131296907);
    RecyclerView recyclerView = this.E0;
    String str = ag0.a;
    recyclerView.setWillNotDraw(false);
    recyclerView.setWillNotCacheDrawing(false);
    recyclerView.setLayerType(1, null);
    this.b0.setHasFixedSize(true);
    this.c0.setHasFixedSize(true);
    this.E0.setHasFixedSize(true);
    this.E0.setItemAnimator(null);
    this.c0.setItemAnimator(null);
    this.b0.setItemAnimator(null);
    m90 m901 = new m90(this, this);
    this.F0 = m901;
    this.E0.setAdapter(m901);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
    this.E0.setLayoutManager((a)linearLayoutManager);
    Context context = P();
    n2 n2 = new n2(context, (View)this.z0);
    rw0 rw0 = (rw0)n2.c;
    (new cr1(context)).inflate(2131623946, rw0);
    int i = this.J0;
    int j = 3;
    if (i == 1) {
      rw0.findItem(2131297118).setVisible(true);
      rw0.findItem(2131297116).setVisible(true);
      rw0.findItem(2131297119).setVisible(true);
    } else if (i == 3) {
      rw0.findItem(2131297117).setVisible(true);
      rw0.findItem(2131297118).setVisible(true);
      rw0.findItem(2131297116).setVisible(true);
      rw0.findItem(2131297119).setVisible(true);
    } 
    n2.f = this;
    ag0.A0(rw0, null);
    this.h1 = new bx0(P(), rw0, (View)this.z0);
    this.n0.setOnClickListener(this);
    this.s0.setOnClickListener(this);
    this.x0.setOnClickListener(this);
    this.v0.setOnClickListener(this);
    this.w0.setOnClickListener(this);
    this.m0.setOnClickListener(this);
    i = this.J0;
    if (i == 1 || i == 3)
      this.z0.setOnClickListener(this); 
    this.A0.setOnClickListener(this);
    this.H0.setOnClickListener(this);
    this.k0.setOnClickListener(this);
    this.u0.setOnClickListener(this);
    this.G0.setOnClickListener(this);
    this.l0.setOnClickListener(this);
    this.t0.a(this);
    this.o0.setOnClickListener(this);
    this.p0.setOnClickListener(this);
    this.q0.setOnClickListener(this);
    this.H0.setOnLongClickListener(this);
    J0();
    context = P();
    ArrayList arrayList = this.f0;
    i = E0();
    id1 id1 = new id1();
    ((rn)id1).h = context;
    ((rn)id1).e = arrayList;
    ((rn)id1).i = 0;
    ((rn)id1).d = i;
    ((rn)id1).f = LayoutInflater.from(context);
    this.d0 = (rn)id1;
    this.b0.setAdapter(id1);
    i = this.J0;
    if (i == 1) {
      this.n0.setText(2131887304);
      this.x0.setContentDescription(T(2131887423));
      this.e0 = new rn1(P(), new ArrayList(0), 2, this);
      try {
        i = Integer.parseInt(this.R0.getString(S().getString(2131886706), "2"));
      } catch (Exception exception) {
        exception.printStackTrace();
        i = 1;
      } 
      this.d0.i = i;
      if (i == 2) {
        float f1;
        MusicActivity musicActivity = this.L0;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        musicActivity.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int k = displayMetrics.widthPixels;
        i = MyApplication.o().getInt("k_i_gds", 2);
        if (i == 0) {
          f1 = 72.0F;
          i = 5;
        } else if (i == 1) {
          i = 4;
          f1 = 92.0F;
        } else if (i == 2) {
          f1 = 120.0F;
          i = j;
        } else if (i == 3) {
          f1 = 150.0F;
          i = 2;
        } else {
          f1 = 200.0F;
          i = 1;
        } 
        float f3 = k;
        float f2 = MyApplication.p;
        if (f3 / f2 > 450.0F) {
          j = (int)(f3 / f1 * f2);
          i = j;
          if (j <= 0)
            i = 1; 
        } 
        k /= i;
        j = (int)(f2 * 16.0F);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        this.b0.setLayoutManager((a)gridLayoutManager);
        this.b0.h(musicActivity.u0);
        this.d0.j = k - j;
      } else {
        this.b0.setLayoutManager((a)new LinearLayoutManager(1));
        this.b0.h(this.L0.u0);
      } 
      this.n1 = a51.r;
    } else if (i == 2) {
      this.l1 = 0;
      this.j0.setVisibility(0);
      this.e0 = new rn1(P(), new ArrayList(0), 4, this);
      this.b0.setLayoutManager((a)new LinearLayoutManager(1));
      this.b0.h(this.L0.u0);
      this.n1 = a51.s;
    } else {
      this.n0.setText(2131887300);
      this.x0.setContentDescription(T(2131887428));
      this.e0 = new rn1(P(), new ArrayList(0), 0, this);
      this.b0.setLayoutManager((a)new LinearLayoutManager(1));
      this.b0.h(this.L0.u0);
      this.n1 = a51.t;
    } 
    this.d0.g = this;
    this.c0.setAdapter(this.e0);
    this.c0.setLayoutManager((a)new LinearLayoutManager(1));
    this.c0.h(this.L0.u0);
    this.Q0.setRecyclerView(this.b0);
    this.P0.setRecyclerView(this.c0);
    this.P0.setRecyclerView(this.b0);
    this.Z0 = my0.g;
    return view;
  }
  
  public final void i() {
    if (this.I0) {
      e();
      return;
    } 
    this.b0.k0(0);
  }
  
  public final int j() {
    ArrayList arrayList = this.d1;
    if (arrayList == null)
      return 0; 
    int j = arrayList.size();
    int i = j;
    if (j > 1)
      i = j + 1; 
    return i;
  }
  
  public final void j0() {
    ss0 ss01 = this.M0;
    if (ss01 != null)
      ss01.dismiss(); 
    this.L0 = null;
    this.d0 = null;
    this.e0 = null;
    this.b0 = null;
    this.c0 = null;
    this.G0 = null;
    this.H0 = null;
    this.k0 = null;
    this.h0 = null;
    this.M0 = null;
    this.I = true;
  }
  
  public final void l0() {
    ss0 ss01 = this.M0;
    if (ss01 != null) {
      ss01.dismiss();
      this.M0 = null;
    } 
    this.I = true;
  }
  
  public final int n(int paramInt) {
    ArrayList arrayList = this.d1;
    if (arrayList == null)
      return 1; 
    int i = paramInt;
    if (arrayList.size() > 1) {
      if (paramInt == 0)
        return K0() ? 2 : 3; 
      i = paramInt - 1;
    } 
    paramInt = this.a1;
    boolean[] arrayOfBoolean = this.e1;
    return (paramInt == 2) ? (arrayOfBoolean[i] ? 4 : 5) : (arrayOfBoolean[i] ^ true);
  }
  
  public final void n0(Bundle paramBundle) {
    paramBundle.putBooleanArray("subselect", this.e1);
    paramBundle.putInt("type", this.J0);
    paramBundle.putParcelable("recycler1InstanceState", this.b0.getLayoutManager().t0());
    paramBundle.putBoolean("isShowingAnAlbumOrArtist", this.I0);
    if (this.I0) {
      paramBundle.putInt("position", this.K0);
      Parcelable parcelable = this.c0.getLayoutManager().t0();
      paramBundle.putParcelable(uvJYmft.olYtH, parcelable);
    } 
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    paramInt = Math.abs(paramInt);
    int i = paramAppBarLayout.getTotalScrollRange();
    ViewGroup viewGroup = this.h0;
    if (paramInt - i == 0) {
      viewGroup.setBackground(this.p1);
      this.m0.setVisibility(0);
      this.k0.setVisibility(0);
      return;
    } 
    viewGroup.setBackground((Drawable)this.q1);
    this.m0.setVisibility(4);
    this.k0.setVisibility(4);
  }
  
  public final void o0() {
    this.I = true;
    D0();
  }
  
  public final void onClick(View paramView) {
    MusicService musicService;
    ss0 ss01 = this.M0;
    ArrayList<km0> arrayList = null;
    LinearLayout linearLayout = null;
    if (ss01 != null && ss01.isShowing()) {
      this.M0.dismiss();
      this.M0 = null;
    } 
    int k = paramView.getId();
    if (k == 2131296835 || k == 2131296836) {
      e();
      return;
    } 
    int j = 0;
    int i = 0;
    if (k == 2131297033) {
      MusicActivity.F0(P(), this.N0, new int[0]);
      this.N0 = null;
      return;
    } 
    if (k == 2131296998) {
      musicService = this.L0.j0;
      if (musicService != null) {
        musicService.k(this.O0, 0, G0(), true);
        B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
        return;
      } 
    } else {
      int m = -1;
      if (k == 2131297027 || k == 2131296906) {
        ArrayList arrayList1;
        if (musicService.getId() == 2131297027) {
          arrayList1 = new ArrayList(this.O0);
        } else {
          arrayList1 = new ArrayList(this.e0.d);
        } 
        z51.E(-1, arrayList1);
        this.L0.j0.k(arrayList1, 0, G0(), true);
        if (this.I0 && !MyApplication.x().getBoolean("lpshbtps", false)) {
          MyApplication.x().edit().putBoolean("lpshbtps", true).apply();
          ms0 ms0 = new ms0(P());
          ms0.q(2131887506);
          ms0.c(2131886755);
          ms0.W = new un(0, this);
          ms0.n(2131886639);
          ms0.p();
          return;
        } 
        B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
        return;
      } 
      if (k == 2131296999) {
        musicService = this.L0.j0;
        if (musicService != null) {
          musicService.f(this.N0);
          this.N0 = null;
          return;
        } 
      } else if (k == 2131297000) {
        musicService = this.L0.j0;
        if (musicService != null) {
          musicService.g(this.O0);
          return;
        } 
      } else if (k == 2131296955) {
        if (this.L0.j0 != null) {
          arrayList = new ArrayList(1);
          arrayList.add(this.N0);
          musicService = this.L0.j0;
          boolean bool = MusicService.C0;
          musicService.j((MyApplication.h()).c, arrayList);
          arrayList.clear();
          this.N0 = null;
          return;
        } 
      } else if (k == 2131296956) {
        musicService = this.L0.j0;
        if (musicService != null) {
          arrayList = this.O0;
          boolean bool = MusicService.C0;
          musicService.j((MyApplication.h()).c, arrayList);
          this.N0 = null;
          return;
        } 
      } else if (k == 2131296953) {
        if (this.L0.j0 != null) {
          arrayList = new ArrayList<km0>(1);
          arrayList.add(this.N0);
          Context context = P();
          boolean bool = MusicService.C0;
          ((ss0)(new tk(context, (MyApplication.h()).b, (MyApplication.h()).c, new vn(0, this, arrayList))).f).show();
          return;
        } 
      } else if (k == 2131296954) {
        if (this.L0.j0 != null) {
          Context context = P();
          boolean bool = MusicService.C0;
          ((ss0)(new tk(context, (MyApplication.h()).b, (MyApplication.h()).c, new f(4, this))).f).show();
          return;
        } 
      } else {
        if (k == 2131296979 || k == 2131296978) {
          ag0.j(P(), lm0.l(this.O0), true);
          return;
        } 
        if (k == 2131296991) {
          ag0.h0(P(), lm0.l(this.O0), true);
          return;
        } 
        if (k == 2131296975) {
          ag0.h(P(), lm0.l(this.O0));
          return;
        } 
        if (k == 2131297025) {
          ArrayList<km0> arrayList1 = new ArrayList(1);
          arrayList1.add(this.N0);
          MusicActivity.D0(arrayList1);
          return;
        } 
        if (k == 2131297026) {
          rn1 rn11 = this.e0;
          if (rn11 != null) {
            ArrayList arrayList1 = rn11.d;
            if (arrayList1 != null && arrayList1.size() > 0) {
              MusicActivity.D0(this.O0);
              return;
            } 
          } 
        } else {
          if (k == 2131296951) {
            ArrayList<km0> arrayList1 = new ArrayList(1);
            arrayList1.add(this.N0);
            GhostSearchActivity.f0 = arrayList1;
            B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.c1.c));
            return;
          } 
          if (k == 2131296952) {
            GhostSearchActivity.f0 = this.O0;
            B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", G0()));
            return;
          } 
          if (k == 2131296876) {
            View view1 = LayoutInflater.from(P()).inflate(2131493016, null);
            linearLayout = (LinearLayout)view1.findViewById(2131296973);
            linearLayout.findViewById(2131296949).setVisibility(0);
            linearLayout.findViewById(2131296979).setVisibility(0);
            linearLayout.findViewById(2131296991).setVisibility(0);
            linearLayout.findViewById(2131296975).setVisibility(0);
            View view2 = linearLayout.findViewById(2131296992);
            if (my0.d()) {
              m = 8;
            } else {
              m = 0;
            } 
            view2.setVisibility(m);
            if (!ws2.U())
              linearLayout.findViewById(2131297008).setVisibility(8); 
            ag0.x0((ViewGroup)linearLayout, this, this.n1);
            ms0 ms0 = new ms0(P());
            ms0.f = this.c1.c;
            ms0.J = true;
            ms0.K = true;
            ms0.f(view1, false);
            this.M0 = new ss0(ms0);
            this.O0 = new ArrayList(this.g0);
            this.M0.show();
            return;
          } 
          if (k == 2131296992) {
            my0.i(P());
            return;
          } 
          if (k == 2131297023) {
            TrimActivity.v0((Activity)this.L0, this.N0);
            return;
          } 
          if (k == 2131296964) {
            TrimActivity.w0((Activity)this.L0, this.N0);
            return;
          } 
          if (k == 2131296907) {
            String str = H0();
            j = this.J0;
            if (j == 1) {
              m = 12;
            } else {
              m = i;
              if (j == 2)
                m = 4; 
            } 
            z51.N(P(), str, new tn(this, 1), m);
            return;
          } 
          if (k == 2131296910 || k == 2131296911) {
            String str;
            m = this.J0;
            if (m == 2) {
              str = "artists";
            } else if (m == 3) {
              str = "genres";
            } else {
              str = "albums";
            } 
            B0((new Intent(P(), SettingsActivity.class)).putExtra("jmparg", str).putExtra("hs", true));
            return;
          } 
          if (k == 2131297879) {
            this.h1.e();
            return;
          } 
          if (k == 2131297863) {
            M0(null);
            return;
          } 
          if (k == 2131297864) {
            this.M0 = (new ub1(P(), this.s0.getText().toString(), new ArrayList(this.g0), 1, this, null)).p();
            return;
          } 
          if (k == 2131297689) {
            this.c0.k0(0);
            this.t0.f(true, true, true);
            return;
          } 
          if (k == 2131296949) {
            String str;
            k = this.J0;
            if (k == 1) {
              i = this.c1.i;
              str = "actshjp_AL_";
            } else if (k == 2) {
              int n = this.a0;
              k = 2131231446;
              if (n == 0) {
                str = "actshjp_AR_";
                i = j;
                m = k;
              } else if (n == 1) {
                str = "actshjp_ALAR_";
                i = j;
                m = k;
              } else {
                LinearLayout linearLayout1 = linearLayout;
                i = j;
                m = k;
                if (n == 2) {
                  str = "actshjp_CM_";
                  i = j;
                  m = k;
                } 
              } 
            } else {
              LinearLayout linearLayout1 = linearLayout;
              i = j;
              if (k == 3) {
                str = "actshjp_GN_";
                m = 2131231448;
                i = j;
              } 
            } 
            Context context = P();
            q3 q31 = this.c1;
            n21.b(context, q31.c, str, q31.r, i, m);
            return;
          } 
          if (k == 2131297021) {
            my0.h(this.O0);
            return;
          } 
          if (k == 2131296980) {
            my0.b(this.O0);
            return;
          } 
          if (k == 2131297694) {
            MyApplication.o().edit().putInt("k_i_armd", 0).apply();
            N0();
            return;
          } 
          if (k == 2131297693) {
            MyApplication.o().edit().putInt("k_i_armd", 1).apply();
            N0();
            return;
          } 
          if (k == 2131297695) {
            MyApplication.o().edit().putInt("k_i_armd", 2).apply();
            N0();
            return;
          } 
          if (k == 2131296846) {
            String str;
            int[] arrayOfInt1;
            int[] arrayOfInt2;
            int[] arrayOfInt4 = z51.n;
            int[] arrayOfInt3 = z51.m;
            i = this.J0;
            if (i == 1) {
              arrayOfInt2 = z51.l;
              arrayOfInt1 = z51.k;
              str = "K_S_SALB";
              m = 2131887423;
            } else if (i == 2) {
              i = this.a0;
              if (i == 0) {
                m = 2131887424;
              } else if (i == 1) {
                m = 2131887422;
              } else if (i == 2) {
                m = 2131887426;
              } 
              arrayOfInt2 = arrayOfInt4;
              str = "K_S_SARB";
              arrayOfInt1 = arrayOfInt3;
            } else {
              arrayOfInt2 = arrayOfInt4;
              int[] arrayOfInt = arrayOfInt1;
              arrayOfInt1 = arrayOfInt3;
              if (i == 3) {
                str = "K_S_SGNB";
                m = 2131887428;
                arrayOfInt2 = arrayOfInt4;
                arrayOfInt1 = arrayOfInt3;
              } 
            } 
            Drawable drawable = ag0.C0(m92.h[5], S().getDrawable(2131231068));
            ag0.L0(P(), T(m), drawable, str, 0, arrayOfInt2, arrayOfInt1, this.m1);
            return;
          } 
          if (k == 2131296958) {
            ag0.F0(P(), this.O0, null, true, null, false, null);
            return;
          } 
          if (k == 2131296983) {
            Tag2Activity.L1 = this.O0;
            B0(new Intent(P(), Tag2Activity.class));
            return;
          } 
          if (k == 2131297823) {
            (new p71(P(), this.O0)).p();
            return;
          } 
          if (k == 2131297008) {
            RGReadCalcActivity.n0(M(), new HashSet(this.O0));
            return;
          } 
          if (k == 2131297001) {
            Uri uri = this.N0.c.a();
            B0((new Intent(P(), MiniPlayerActivity.class)).setAction("pr").putExtra("data", (Parcelable)uri));
          } 
        } 
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296906)
      ag0.F0(P(), this.g0, null, true, null, false, null); 
    return true;
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    byte b = 0;
    if (i == 2131297117 || i == 2131297118 || i == 2131297116 || i == 2131297119 || i == 2131297124) {
      String str1;
      byte b1;
      int j = this.J0;
      String str2 = "k_i_alsubcmt";
      if (j == 1) {
        if (i == 2131297118) {
          b1 = b;
          str1 = str2;
        } else {
          if (i == 2131297116) {
            str1 = str2;
          } else {
            byte b2 = b;
            str1 = str2;
            if (i == 2131297119) {
              str1 = str2;
            } else {
              this.R0.edit().putInt(str1, b2).apply();
              N0();
              return true;
            } 
            b2 = 4;
          } 
          b1 = 1;
        } 
      } else {
        b1 = b;
        str1 = str2;
        if (j == 3) {
          str2 = "k_i_gnsubcmt";
          if (i == 2131297117) {
            b1 = 2;
            str1 = str2;
          } else if (i == 2131297118) {
            b1 = b;
            str1 = str2;
          } else {
            if (i == 2131297116) {
              str1 = str2;
            } else {
              b1 = b;
              str1 = str2;
              if (i == 2131297119) {
                str1 = str2;
              } else {
                this.R0.edit().putInt(str1, b1).apply();
                N0();
                return true;
              } 
              b1 = 4;
            } 
            b1 = 1;
          } 
        } 
      } 
      this.R0.edit().putInt(str1, b1).apply();
      N0();
      return true;
    } 
    return false;
  }
  
  public final void p() {
    my0.h(this.e0.d);
  }
  
  public final void r() {
    try {
      MusicActivity musicActivity = this.L0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        this.L0.t0.f(this.I0);
        this.L0.t0.j = 0;
      } 
    } catch (Exception exception) {}
    if (this.Z0 == my0.g)
      return; 
    this.e0.l();
    this.d0.g();
    this.Z0 = my0.g;
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null) {
      this.b0.getLayoutManager().s0(paramBundle.getParcelable("recycler1InstanceState"));
      if (paramBundle.getBoolean("isShowingAnAlbumOrArtist")) {
        int i = paramBundle.getInt("position");
        this.K0 = i;
        if (i < this.f0.size()) {
          this.f1 = paramBundle.getBooleanArray("subselect");
          L0(this.K0);
          this.Q0.setRecyclerView(this.c0);
          return;
        } 
      } else {
        this.c0.k0(0);
        this.E0.k0(0);
        this.t0.setExpanded(true);
      } 
    } 
  }
  
  public final boolean s(int paramInt) {
    boolean bool;
    ArrayList arrayList = this.d1;
    if (arrayList == null)
      return false; 
    if (arrayList.size() > 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = paramInt;
    if (bool) {
      if (paramInt == 0) {
        boolean bool1 = K0();
        boolean[] arrayOfBoolean1 = this.e1;
        if (bool1) {
          Arrays.fill(arrayOfBoolean1, false);
        } else {
          Arrays.fill(arrayOfBoolean1, true);
        } 
        O0();
        return false;
      } 
      i = paramInt - 1;
    } 
    boolean[] arrayOfBoolean = this.e1;
    arrayOfBoolean[i] = arrayOfBoolean[i] ^ true;
    m90 m901 = this.F0;
    if (bool) {
      paramInt = i + 1;
    } else {
      paramInt = i;
    } 
    m901.h(paramInt);
    this.g1 = true;
    O0();
    if (bool && this.e1[i] && this.i1 == 1) {
      String str = F0();
      if (!MyApplication.x().getBoolean(str, false)) {
        str = F0();
        MyApplication.x().edit().putBoolean(str, true).apply();
        ms0 ms0 = new ms0(P());
        ms0.q(2131887506);
        String str1 = this.r1;
        ms0.d((CharSequence)Html.fromHtml(U(2131887464, new Object[] { str1, str1 })));
        ms0.n(2131886639);
        ms0.p();
      } 
    } 
    return true;
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    String str;
    if (paramInt == 0) {
      str = ((q3)paramxj1).r;
      paramInt = this.J0;
      if (paramInt == 1) {
        this.T0 = str;
      } else if (paramInt == 2) {
        paramInt = this.a0;
        if (paramInt == 0) {
          this.U0 = str;
        } else if (paramInt == 1) {
          this.V0 = str;
        } else if (paramInt == 2) {
          this.W0 = str;
        } 
      } else if (paramInt == 3) {
        this.X0 = str;
      } 
      D0();
      return;
    } 
    if (paramInt == 1) {
      km0 km01 = (km0)str;
      paramInt = this.J0;
      if (paramInt == 1) {
        this.T0 = this.c1.r;
      } else if (paramInt == 2) {
        paramInt = this.a0;
        if (paramInt == 0) {
          this.U0 = this.c1.r;
        } else if (paramInt == 1) {
          this.V0 = this.c1.r;
        } else if (paramInt == 2) {
          this.W0 = this.c1.r;
        } 
      } else if (paramInt == 3) {
        this.X0 = this.c1.r;
      } 
      this.S0 = km01.b;
      D0();
      this.t0.setExpanded(false);
    } 
  }
  
  public final void v(int paramInt) {
    ArrayList arrayList = this.d1;
    if (arrayList == null)
      return; 
    int i = paramInt;
    if (arrayList.size() > 1) {
      if (paramInt == 0) {
        boolean bool = K0();
        boolean[] arrayOfBoolean1 = this.e1;
        if (bool) {
          Arrays.fill(arrayOfBoolean1, false);
        } else {
          Arrays.fill(arrayOfBoolean1, true);
        } 
        O0();
        return;
      } 
      i = paramInt - 1;
    } 
    Arrays.fill(this.e1, false);
    boolean[] arrayOfBoolean = this.e1;
    arrayOfBoolean[i] = arrayOfBoolean[i] ^ true;
    O0();
  }
  
  public final void w() {
    my0.b(this.e0.d);
  }
  
  public final void x() {
    my0.k(this.e0.d);
  }
  
  public final String z(int paramInt) {
    ArrayList arrayList = this.d1;
    if (arrayList == null)
      return null; 
    int i = paramInt;
    if (arrayList.size() > 1) {
      if (paramInt == 0) {
        i = this.a1;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i == 4)
                  return S().getString(2131886160); 
              } else {
                return S().getString(2131886161);
              } 
            } else {
              return S().getString(2131886157);
            } 
          } else {
            return S().getString(2131886156);
          } 
        } else {
          return S().getString(2131886159);
        } 
      } 
      i = paramInt - 1;
    } 
    return ((q3)this.d1.get(i)).c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */