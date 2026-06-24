import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.material.appbar.AppBarLayout;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.audio_cutter.TrimActivity;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MiniPlayerActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RGReadCalcActivity;
import in.krosbits.musicolet.SettingsActivity;
import in.krosbits.musicolet.Tag2Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class r90 extends ua0 implements bj0, qy0, View.OnClickListener, u5, View.OnLongClickListener, ob, sb1 {
  public static final int[] O0 = new int[] { -1, 0, 1, 2, 3 };
  
  public static final int[] P0 = new int[] { 2131886223, 2131887004, 2131887026, 2131886476, 2131886436 };
  
  public k90 A0;
  
  public ArrayList B0;
  
  public RecyclerViewScrollBar C0;
  
  public RecyclerViewScrollBar D0;
  
  public km0 E0;
  
  public int F0 = 0;
  
  public String G0;
  
  public long H0;
  
  public long I0;
  
  public SharedPreferences J0;
  
  public ArrayList K0;
  
  public final o90 L0 = new o90(this, 1);
  
  public final wg M0 = new wg(0, 0);
  
  public final ColorDrawable N0 = new ColorDrawable(0);
  
  public RecyclerView a0;
  
  public RecyclerView b0;
  
  public ViewGroup c0;
  
  public ViewGroup d0;
  
  public ImageView e0;
  
  public ImageView f0;
  
  public ImageView g0;
  
  public ImageView h0;
  
  public ImageView i0;
  
  public ImageView j0;
  
  public ImageView k0;
  
  public ImageView l0;
  
  public TextView m0;
  
  public TextView n0;
  
  public TextView o0;
  
  public TextView p0;
  
  public TextView q0;
  
  public TextView r0;
  
  public TextView s0;
  
  public p90 t0;
  
  public rn1 u0;
  
  public CoordinatorLayout v0;
  
  public AppBarLayout w0;
  
  public ss0 x0;
  
  public MusicActivity y0;
  
  public boolean z0 = false;
  
  public static int E0() {
    int i = MyApplication.o().getInt("k_i_eilfl", -1);
    if (i == -1) {
      i = MyApplication.o().getInt(KjdXPYm.oxpFbgTz, 0);
      i -= i % 2;
      return (i == 2) ? 1 : ((i == 4) ? 2 : ((i == 6) ? 3 : 0));
    } 
    return i;
  }
  
  public final void A() {
    my0.g(this.u0.d);
  }
  
  public final void D0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield G0 : Ljava/lang/String;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 172
    //   9: aload_0
    //   10: aload_2
    //   11: invokevirtual F0 : (Ljava/lang/String;)I
    //   14: istore_1
    //   15: iload_1
    //   16: iflt -> 162
    //   19: aload_0
    //   20: getfield a0 : Landroidx/recyclerview/widget/RecyclerView;
    //   23: iload_1
    //   24: invokevirtual k0 : (I)V
    //   27: aload_0
    //   28: iload_1
    //   29: invokevirtual I0 : (I)V
    //   32: aload_0
    //   33: getfield a0 : Landroidx/recyclerview/widget/RecyclerView;
    //   36: iload_1
    //   37: invokevirtual k0 : (I)V
    //   40: aload_0
    //   41: getfield u0 : Lrn1;
    //   44: getfield d : Ljava/util/ArrayList;
    //   47: astore_2
    //   48: iconst_0
    //   49: istore_1
    //   50: iload_1
    //   51: aload_2
    //   52: invokevirtual size : ()I
    //   55: if_icmpge -> 85
    //   58: aload_2
    //   59: iload_1
    //   60: invokevirtual get : (I)Ljava/lang/Object;
    //   63: checkcast km0
    //   66: getfield b : I
    //   69: aload_0
    //   70: getfield F0 : I
    //   73: if_icmpne -> 79
    //   76: goto -> 87
    //   79: iinc #1, 1
    //   82: goto -> 50
    //   85: iconst_m1
    //   86: istore_1
    //   87: aload_0
    //   88: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   91: astore_2
    //   92: iload_1
    //   93: iflt -> 138
    //   96: aload_2
    //   97: iload_1
    //   98: invokevirtual k0 : (I)V
    //   101: aload_0
    //   102: getfield w0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   105: iconst_0
    //   106: iconst_1
    //   107: iconst_1
    //   108: invokevirtual f : (ZZZ)V
    //   111: new android/os/Handler
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: new y2
    //   121: dup
    //   122: iload_1
    //   123: iconst_5
    //   124: aload_0
    //   125: invokespecial <init> : (IILjava/lang/Object;)V
    //   128: ldc2_w 300
    //   131: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   134: pop
    //   135: goto -> 151
    //   138: aload_2
    //   139: iconst_0
    //   140: invokevirtual k0 : (I)V
    //   143: aload_0
    //   144: getfield w0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   147: iconst_1
    //   148: invokevirtual setExpanded : (Z)V
    //   151: aload_0
    //   152: iconst_0
    //   153: putfield F0 : I
    //   156: aload_0
    //   157: aconst_null
    //   158: putfield G0 : Ljava/lang/String;
    //   161: return
    //   162: aload_0
    //   163: iconst_0
    //   164: putfield F0 : I
    //   167: aload_0
    //   168: aconst_null
    //   169: putfield G0 : Ljava/lang/String;
    //   172: return
  }
  
  public final int F0(String paramString) {
    byte b = 0;
    try {
      while (b < this.t0.e.size()) {
        boolean bool = ((k90)this.t0.e.get(b)).c.equals(paramString);
        if (bool)
          return b; 
        b++;
      } 
    } finally {
      paramString = null;
    } 
  }
  
  public final ArrayList G0(k90 paramk90) {
    try {
      return arrayList;
    } finally {
      paramk90 = null;
      paramk90.printStackTrace();
    } 
  }
  
  public final void H0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield z0 : Z
    //   4: istore_2
    //   5: aconst_null
    //   6: astore #4
    //   8: iload_2
    //   9: ifeq -> 44
    //   12: aload_0
    //   13: getfield K0 : Ljava/util/ArrayList;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 44
    //   21: aload_3
    //   22: invokevirtual size : ()I
    //   25: iconst_1
    //   26: if_icmpne -> 44
    //   29: aload_0
    //   30: getfield K0 : Ljava/util/ArrayList;
    //   33: iconst_0
    //   34: invokevirtual get : (I)Ljava/lang/Object;
    //   37: checkcast km0
    //   40: astore_3
    //   41: goto -> 46
    //   44: aconst_null
    //   45: astore_3
    //   46: aload_0
    //   47: getfield t0 : Lp90;
    //   50: astore #5
    //   52: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   55: getfield c : Llm0;
    //   58: getfield q : Ljava/util/ArrayList;
    //   61: invokevirtual clone : ()Ljava/lang/Object;
    //   64: checkcast java/util/ArrayList
    //   67: astore #6
    //   69: invokestatic o : ()Landroid/content/SharedPreferences;
    //   72: ldc_w 'K_S_SFB'
    //   75: iconst_0
    //   76: invokeinterface getInt : (Ljava/lang/String;I)I
    //   81: aload #6
    //   83: invokestatic Q : (ILjava/util/ArrayList;)V
    //   86: aload #5
    //   88: aload #6
    //   90: invokestatic E0 : ()I
    //   93: invokestatic l : (Lp90;Ljava/util/ArrayList;I)V
    //   96: aload_0
    //   97: getfield C0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   100: aload_0
    //   101: getfield a0 : Landroidx/recyclerview/widget/RecyclerView;
    //   104: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   107: aload_0
    //   108: getfield z0 : Z
    //   111: ifeq -> 167
    //   114: aload_0
    //   115: aload_0
    //   116: getfield A0 : Lk90;
    //   119: getfield c : Ljava/lang/String;
    //   122: invokevirtual F0 : (Ljava/lang/String;)I
    //   125: istore_1
    //   126: iload_1
    //   127: iflt -> 162
    //   130: aload_0
    //   131: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   134: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   137: invokevirtual t0 : ()Landroid/os/Parcelable;
    //   140: astore #5
    //   142: aload_0
    //   143: iload_1
    //   144: invokevirtual I0 : (I)V
    //   147: aload_0
    //   148: getfield b0 : Landroidx/recyclerview/widget/RecyclerView;
    //   151: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   154: aload #5
    //   156: invokevirtual s0 : (Landroid/os/Parcelable;)V
    //   159: goto -> 167
    //   162: aload_0
    //   163: invokevirtual e : ()Z
    //   166: pop
    //   167: aload_3
    //   168: ifnull -> 239
    //   171: aload_0
    //   172: getfield z0 : Z
    //   175: ifeq -> 194
    //   178: aload_0
    //   179: getfield u0 : Lrn1;
    //   182: getfield d : Ljava/util/ArrayList;
    //   185: aload_3
    //   186: invokestatic p : (Ljava/util/ArrayList;Lkm0;)Ljava/lang/Object;
    //   189: checkcast km0
    //   192: astore #4
    //   194: aload #4
    //   196: ifnull -> 227
    //   199: aload_0
    //   200: aload #4
    //   202: putfield E0 : Lkm0;
    //   205: new java/util/ArrayList
    //   208: dup
    //   209: iconst_1
    //   210: invokespecial <init> : (I)V
    //   213: astore_3
    //   214: aload_0
    //   215: aload_3
    //   216: putfield K0 : Ljava/util/ArrayList;
    //   219: aload_3
    //   220: aload #4
    //   222: invokevirtual add : (Ljava/lang/Object;)Z
    //   225: pop
    //   226: return
    //   227: aload_0
    //   228: new java/util/ArrayList
    //   231: dup
    //   232: iconst_0
    //   233: invokespecial <init> : (I)V
    //   236: putfield K0 : Ljava/util/ArrayList;
    //   239: return
  }
  
  public final void I0(int paramInt) {
    if (paramInt < this.t0.e.size())
      try {
        k90 k901 = this.t0.e.get(paramInt);
        this.A0 = k901;
        this.B0 = G0(k901);
        J0();
        this.b0.k0(0);
        this.m0.setText(k901.getName());
        this.n0.setText(k901.getName());
        RecyclerView recyclerView = this.a0;
        paramInt = 8;
        recyclerView.setVisibility(8);
        this.C0.setVisibility(8);
        this.d0.setVisibility(8);
        if (this.B0.size() > 3) {
          boolean bool = MyApplication.o().getBoolean("k_b_qsfl1", true);
          TextView textView = this.o0;
          if (bool)
            paramInt = 0; 
          textView.setVisibility(paramInt);
        } else {
          this.o0.setVisibility(8);
        } 
        this.v0.setVisibility(0);
        this.D0.setRecyclerView(this.b0);
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      }  
  }
  
  public final void J(km0 paramkm0) {
    ss0 ss02 = this.x0;
    if (ss02 != null)
      ss02.dismiss(); 
    this.E0 = paramkm0;
    ArrayList<km0> arrayList = new ArrayList(1);
    this.K0 = arrayList;
    arrayList.add(this.E0);
    View view = LayoutInflater.from(P()).inflate(2131493015, null);
    TextView textView = (TextView)view.findViewById(2131297873);
    ImageView imageView = (ImageView)view.findViewById(2131296860);
    textView.setText(ag0.W(this.E0));
    if (c81.c(P()).c(this.E0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener(new ag(3, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296973);
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0 ms0 = new ms0(P());
    ms0.f(view, false);
    ss0 ss01 = new ss0(ms0);
    this.x0 = ss01;
    ss01.show();
  }
  
  public final void J0() {
    z51.R(this.J0.getInt("I_K_SRTBYF_F", 30), this.B0);
    ArrayList arrayList = new ArrayList(this.B0);
    rn1 rn11 = this.u0;
    rn11.d = arrayList;
    rn11.g();
    this.K0 = this.B0;
    this.q0.setText(this.A0.c);
    this.r0.setText(S().getQuantityString(2131755061, this.B0.size(), new Object[] { Integer.valueOf(this.B0.size()) }));
    this.s0.setText(ag0.B(this.I0, false, 0));
  }
  
  public final void c0(int paramInt1, int paramInt2, Intent paramIntent) {
    if (paramInt1 == 1 && paramInt2 == -1)
      B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_BGU")); 
    super.c0(paramInt1, paramInt2, paramIntent);
  }
  
  public final void d(int paramInt) {
    ArrayList arrayList = new ArrayList(this.u0.d);
    this.K0 = arrayList;
    this.y0.j0.k(arrayList, paramInt, this.A0.getName(), true);
    B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
  }
  
  public final boolean e() {
    if (this.z0) {
      this.z0 = false;
      this.a0.setVisibility(0);
      this.C0.setVisibility(0);
      this.d0.setVisibility(0);
      this.v0.setVisibility(8);
      this.o0.setVisibility(8);
      this.C0.setRecyclerView(this.a0);
      this.w0.f(true, false, true);
      try {
        MusicActivity musicActivity = this.y0;
        if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
          this.y0.t0.f(this.z0);
          this.y0.t0.j = 0;
          return true;
        } 
      } finally {
        Exception exception;
      } 
      return true;
    } 
    return false;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.y0 = (MusicActivity)paramContext;
    this.J0 = paramContext.getSharedPreferences("PP", 0);
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492992, paramViewGroup, false);
    this.a0 = (RecyclerView)view.findViewById(2131297415);
    this.b0 = (RecyclerView)view.findViewById(2131297414);
    this.c0 = (ViewGroup)view.findViewById(2131297386);
    paramViewGroup = (ViewGroup)view.findViewById(2131297049);
    this.d0 = paramViewGroup;
    paramViewGroup.setBackgroundDrawable(new wg(0, 0));
    this.q0 = (TextView)view.findViewById(2131297879);
    this.f0 = (ImageView)this.c0.findViewById(2131296876);
    this.e0 = (ImageView)this.c0.findViewById(2131296906);
    this.i0 = (ImageView)this.c0.findViewById(2131296907);
    this.g0 = (ImageView)this.c0.findViewById(2131296835);
    this.m0 = (TextView)this.c0.findViewById(2131297753);
    this.C0 = (RecyclerViewScrollBar)view.findViewById(2131297396);
    this.D0 = (RecyclerViewScrollBar)view.findViewById(2131297395);
    this.b0.h(this.y0.u0);
    this.a0.h(this.y0.u0);
    this.a0.setHasFixedSize(true);
    this.b0.setHasFixedSize(true);
    this.p0 = (TextView)view.findViewById(2131297863);
    this.l0 = (ImageView)view.findViewById(2131296846);
    this.k0 = (ImageView)view.findViewById(2131296910);
    this.o0 = (TextView)view.findViewById(2131297864);
    view.findViewById(2131297928).setBackground(new wg(0, 1));
    view.findViewById(2131296589).setBackground(new wg(0, 0));
    this.v0 = (CoordinatorLayout)view.findViewById(2131296579);
    this.w0 = (AppBarLayout)view.findViewById(2131296354);
    this.h0 = (ImageView)view.findViewById(2131296836);
    this.n0 = (TextView)view.findViewById(2131297690);
    this.j0 = (ImageView)view.findViewById(2131296911);
    this.r0 = (TextView)view.findViewById(2131297796);
    this.s0 = (TextView)view.findViewById(2131297740);
    this.p0.setText(2131887299);
    this.m0.setOnClickListener(this);
    this.o0.setOnClickListener(this);
    this.p0.setOnClickListener(this);
    this.g0.setOnClickListener(this);
    this.h0.setOnClickListener(this);
    this.e0.setOnClickListener(this);
    this.f0.setOnClickListener(this);
    this.k0.setOnClickListener(this);
    this.j0.setOnClickListener(this);
    this.l0.setOnClickListener(this);
    this.i0.setOnClickListener(this);
    this.e0.setOnLongClickListener(this);
    this.w0.a(this);
    p90 p901 = new p90(this);
    this.t0 = p901;
    ArrayList arrayList = (ArrayList)MyApplication.j.c.q.clone();
    z51.Q(MyApplication.o().getInt("K_S_SFB", 0), arrayList);
    p90.l(p901, arrayList, E0());
    this.u0 = new rn1(P(), new ArrayList(0), 0, this);
    this.a0.setAdapter(this.t0);
    this.a0.setLayoutManager((a)new LinearLayoutManager(1));
    this.b0.setAdapter(this.u0);
    this.b0.setLayoutManager((a)new LinearLayoutManager(1));
    this.C0.setRecyclerView(this.a0);
    this.H0 = my0.g;
    this.q0.setTextColor(m92.h[6]);
    this.q0.setTypeface(Typeface.DEFAULT);
    this.q0.setTextSize(1, 14.0F);
    return view;
  }
  
  public final void i() {
    if (this.z0) {
      e();
      return;
    } 
    this.a0.k0(0);
  }
  
  public final void j0() {
    this.u0 = null;
    this.t0 = null;
    this.b0 = null;
    this.a0 = null;
    this.x0 = null;
    this.i0 = null;
    this.e0 = null;
    this.f0 = null;
    this.g0 = null;
    this.m0 = null;
    this.y0 = null;
    this.I = true;
  }
  
  public final void n0(Bundle paramBundle) {
    paramBundle.putParcelable("rv_foldersState", this.a0.getLayoutManager().t0());
    paramBundle.putBoolean("isSongsShowing", this.z0);
    if (this.z0) {
      paramBundle.putString("selectedFolder", this.A0.c);
      paramBundle.putParcelable("rv_folderSongsState", this.b0.getLayoutManager().t0());
    } 
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    int i = Math.abs(paramInt);
    paramInt = paramAppBarLayout.getTotalScrollRange();
    ViewGroup viewGroup = this.c0;
    if (i - paramInt == 0) {
      viewGroup.setBackground(this.M0);
      this.m0.setVisibility(0);
      this.g0.setVisibility(0);
      return;
    } 
    viewGroup.setBackground((Drawable)this.N0);
    this.m0.setVisibility(4);
    this.g0.setVisibility(4);
  }
  
  public final void o0() {
    this.I = true;
    D0();
  }
  
  public final void onClick(View paramView) {
    k90 k901;
    ss0 ss01 = this.x0;
    if (ss01 != null)
      ss01.dismiss(); 
    int i = paramView.getId();
    if (i == 2131296835 || i == 2131296836) {
      e();
      return;
    } 
    if (i == 2131297753) {
      this.b0.k0(0);
      this.w0.f(true, true, true);
      return;
    } 
    ss01 = null;
    if (i == 2131296876) {
      ss0 ss03;
      ml0 ml0;
      View view2 = LayoutInflater.from(P()).inflate(2131493016, null);
      LinearLayout linearLayout = (LinearLayout)view2.findViewById(2131296973);
      linearLayout.findViewById(2131297009).setVisibility(0);
      linearLayout.findViewById(2131296949).setVisibility(0);
      String str = ml0.c(this.A0.c);
      if (str == null) {
        ss03 = ss01;
      } else {
        ml0 = new ml0((String)ss03);
      } 
      if (ml0 != null) {
        String str1 = ml0.b;
        if (MyApplication.F.d(str1) != null && !str1.equals("Storage"))
          linearLayout.findViewById(2131296984).setVisibility(0); 
      } 
      linearLayout.findViewById(2131296979).setVisibility(0);
      linearLayout.findViewById(2131296975).setVisibility(0);
      linearLayout.findViewById(2131296991).setVisibility(0);
      View view1 = linearLayout.findViewById(2131296992);
      if (my0.d()) {
        i = 8;
      } else {
        i = 0;
      } 
      view1.setVisibility(i);
      if (!ws2.U())
        linearLayout.findViewById(2131297008).setVisibility(8); 
      ArrayList arrayList = G0(this.A0);
      z51.R(this.J0.getInt("I_K_SRTBYF_F", 30), arrayList);
      this.K0 = arrayList;
      ag0.x0((ViewGroup)linearLayout, this, a51.q);
      ms0 ms0 = new ms0(P());
      ms0.f = this.A0.getName();
      ms0.f(view2, false);
      ss0 ss02 = new ss0(ms0);
      this.x0 = ss02;
      ss02.show();
      return;
    } 
    if (i == 2131296992) {
      my0.i(P());
      return;
    } 
    if (i == 2131297009) {
      k901 = this.A0;
      try {
        Intent intent = new Intent();
        this(P(), FolderExcluderActivity.class);
        return;
      } finally {
        k901 = null;
        k901.printStackTrace();
      } 
    } 
    if (i == 2131297033) {
      MusicActivity.F0(P(), this.E0, new int[0]);
      this.E0 = null;
      return;
    } 
    if (i == 2131296998) {
      this.y0.j0.k(this.K0, 0, this.A0.getName(), true);
      B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
      return;
    } 
    if (i == 2131297027 || i == 2131296906) {
      ArrayList arrayList;
      if (k901.getId() == 2131297027) {
        arrayList = new ArrayList(this.K0);
      } else {
        arrayList = new ArrayList(this.u0.d);
      } 
      z51.E(-1, arrayList);
      this.y0.j0.k(arrayList, 0, this.A0.getName(), true);
      if (this.z0 && !MyApplication.x().getBoolean("lpshbtps", false)) {
        MyApplication.x().edit().putBoolean("lpshbtps", true).apply();
        ms0 ms0 = new ms0(P());
        ms0.q(2131887506);
        ms0.c(2131886755);
        ms0.W = new un(4, this);
        ms0.n(2131886639);
        ms0.p();
        return;
      } 
      B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
      return;
    } 
    if (i == 2131296999) {
      MusicService musicService = this.y0.j0;
      if (musicService != null) {
        musicService.f(this.E0);
        this.E0 = null;
        return;
      } 
    } else if (i == 2131297000) {
      MusicService musicService = this.y0.j0;
      if (musicService != null) {
        musicService.g(this.K0);
        return;
      } 
    } else if (i == 2131296955) {
      if (this.y0.j0 != null && this.E0 != null) {
        ArrayList<km0> arrayList = new ArrayList(1);
        arrayList.add(this.E0);
        MusicService musicService = this.y0.j0;
        boolean bool = MusicService.C0;
        musicService.j((MyApplication.h()).c, arrayList);
        arrayList.clear();
        this.E0 = null;
        return;
      } 
    } else if (i == 2131296956) {
      MusicService musicService = this.y0.j0;
      if (musicService != null) {
        ArrayList arrayList = this.K0;
        boolean bool = MusicService.C0;
        musicService.j((MyApplication.h()).c, arrayList);
        return;
      } 
    } else if (i == 2131296953) {
      if (this.y0.j0 != null && this.E0 != null) {
        ArrayList<km0> arrayList = new ArrayList(1);
        arrayList.add(this.E0);
        Context context = P();
        boolean bool = MusicService.C0;
        Stack stack = (MyApplication.h()).b;
        MusicService musicService = this.y0.j0;
        ((ss0)(new tk(context, stack, (MyApplication.h()).c, new vn(2, this, arrayList))).f).show();
        this.E0 = null;
        return;
      } 
    } else if (i == 2131296954) {
      if (this.y0.j0 != null) {
        Context context = P();
        boolean bool = MusicService.C0;
        Stack stack = (MyApplication.h()).b;
        MusicService musicService = this.y0.j0;
        ((ss0)(new tk(context, stack, (MyApplication.h()).c, new f(14, this))).f).show();
        return;
      } 
    } else {
      if (i == 2131296979 || i == 2131296978) {
        if (this.K0 != null) {
          Context context = P();
          lm0 lm0 = MyApplication.j.c;
          ag0.j(context, lm0.l(this.K0), true);
        } 
        return;
      } 
      if (i == 2131296991) {
        if (this.K0 != null) {
          Context context = P();
          lm0 lm0 = MyApplication.j.c;
          ag0.h0(context, lm0.l(this.K0), true);
          return;
        } 
      } else if (i == 2131296975) {
        if (this.K0 != null) {
          Context context = P();
          lm0 lm0 = MyApplication.j.c;
          ag0.h(context, lm0.l(this.K0));
          return;
        } 
      } else if (i == 2131297025) {
        if (this.E0 != null) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.E0);
          MusicActivity.D0(arrayList);
          return;
        } 
      } else {
        if (i == 2131297026) {
          MusicActivity.D0(this.K0);
          return;
        } 
        if (i == 2131296951) {
          if (this.E0 != null) {
            ArrayList<km0> arrayList = new ArrayList(1);
            arrayList.add(this.E0);
            GhostSearchActivity.f0 = arrayList;
            B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.A0.getName()));
            return;
          } 
        } else {
          if (i == 2131296952) {
            GhostSearchActivity.f0 = this.K0;
            B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.A0.getName()));
            return;
          } 
          if (i == 2131297023) {
            TrimActivity.v0((Activity)this.y0, this.E0);
            return;
          } 
          if (i == 2131296964) {
            TrimActivity.w0((Activity)this.y0, this.E0);
            return;
          } 
          if (i == 2131296907) {
            z51.N(P(), "I_K_SRTBYF_F", new o90(this, 0), 30);
            return;
          } 
          if (i == 2131297864) {
            this.x0 = (new ub1(P(), this.o0.getText().toString(), new ArrayList(this.u0.d), 1, this, null)).p();
            return;
          } 
          if (i == 2131297863) {
            this.x0 = (new ub1(P(), this.p0.getText().toString(), new ArrayList(this.t0.e), 0, this, null)).p();
            return;
          } 
          if (i == 2131296910 || i == 2131296911) {
            B0((new Intent(P(), SettingsActivity.class)).putExtra("hs", true).putExtra("jmparg", "folders"));
            return;
          } 
          if (i == 2131296949) {
            n21.b(P(), this.A0.getName(), "actshjp_F_", this.A0.c, 0, 2131231447);
            return;
          } 
          if (i == 2131296984) {
            ag0.t0(P(), MyApplication.F.d(this.A0.c), true);
            return;
          } 
          if (i == 2131297021) {
            my0.h(this.K0);
            return;
          } 
          if (i == 2131296980) {
            my0.b(this.K0);
            return;
          } 
          if (i == 2131296846) {
            Drawable drawable = ag0.C0(m92.h[5], S().getDrawable(2131231068));
            ag0.L0(P(), T(2131887427), drawable, "K_S_SFB", 0, z51.j, z51.i, this.L0);
            return;
          } 
          if (i == 2131296958) {
            ag0.F0(P(), this.K0, null, true, null, false, null);
            return;
          } 
          if (i == 2131296983) {
            Tag2Activity.L1 = this.K0;
            B0(new Intent(P(), Tag2Activity.class));
            return;
          } 
          if (i == 2131297823) {
            (new p71(P(), this.K0)).p();
            return;
          } 
          if (i == 2131297008) {
            RGReadCalcActivity.n0(M(), new HashSet(this.K0));
            return;
          } 
          if (i == 2131297001) {
            Uri uri = this.E0.c.a();
            B0((new Intent(P(), MiniPlayerActivity.class)).setAction("pr").putExtra("data", (Parcelable)uri));
            return;
          } 
        } 
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296906)
      ag0.F0(P(), this.B0, null, true, null, false, null); 
    return true;
  }
  
  public final void p() {
    my0.h(this.u0.d);
  }
  
  public final void r() {
    try {
      MusicActivity musicActivity = this.y0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        this.y0.t0.f(this.z0);
        this.y0.t0.j = 0;
      } 
    } catch (Exception exception) {}
    if (this.H0 == my0.g)
      return; 
    this.u0.l();
    this.t0.g();
    this.H0 = my0.g;
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null) {
      this.a0.getLayoutManager().s0(paramBundle.getParcelable("rv_foldersState"));
      this.C0.setRecyclerView(this.a0);
      if (paramBundle.getBoolean("isSongsShowing")) {
        int i = F0(paramBundle.getString("selectedFolder"));
        if (i >= 0) {
          I0(i);
          this.b0.getLayoutManager().s0(paramBundle.getParcelable("rv_folderSongsState"));
        } 
      } 
    } 
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    if (paramInt == 0)
      try {
        return;
      } finally {
        paramxj1 = null;
        paramxj1.printStackTrace();
      }  
    if (paramInt == 1) {
      paramxj1 = paramxj1;
      this.G0 = ((km0)paramxj1).h;
      this.F0 = ((km0)paramxj1).b;
    } 
    D0();
  }
  
  public final void w() {
    my0.b(this.u0.d);
  }
  
  public final void x() {
    my0.k(this.u0.d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */