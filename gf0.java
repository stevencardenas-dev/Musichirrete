import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.Html;
import android.view.AbsSavedState;
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
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.d;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.android.widgets.SmartTextView;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;

public class gf0 extends ua0 implements ob, View.OnClickListener, bj0, qy0, sb1, u5 {
  public boolean A0;
  
  public ArrayList B0;
  
  public int C0 = -1;
  
  public final HashMap D0 = new HashMap<Object, Object>();
  
  public final wg E0 = new wg(0, 0);
  
  public final ColorDrawable F0 = new ColorDrawable(0);
  
  public RecyclerView a0;
  
  public RecyclerViewScrollBar b0;
  
  public u90 c0;
  
  public ViewGroup d0;
  
  public ImageView e0;
  
  public ImageView f0;
  
  public ImageView g0;
  
  public ImageView h0;
  
  public SmartTextView i0;
  
  public SmartTextView j0;
  
  public SmartTextView k0;
  
  public SmartTextView l0;
  
  public SmartTextView m0;
  
  public SmartTextView n0;
  
  public ss0 o0;
  
  public MusicActivity p0;
  
  public km0 q0;
  
  public int r0 = 0;
  
  public String s0;
  
  public jm0 t0;
  
  public jm0 u0;
  
  public ArrayList v0;
  
  public ArrayList w0;
  
  public AppBarLayout x0;
  
  public int y0;
  
  public long z0;
  
  public static ArrayList E0(String paramString) {
    ArrayList arrayList = MyApplication.j.c.n(paramString);
    z51.R(MyApplication.o().getInt("I_K_SRTBYF_F", 30), arrayList);
    return arrayList;
  }
  
  public final void A() {
    my0.g(this.c0.e);
  }
  
  public final void D0() {
    String str = this.s0;
    if (str != null) {
      String str1 = str.toLowerCase(Locale.ENGLISH);
      byte b = -1;
      this.C0 = -1;
      jm0 jm01 = MyApplication.j.c.j(str1);
      if (jm01 != null) {
        if (!str1.equals(MyApplication.j.c.u.c)) {
          jm0 jm02 = jm01.f;
          if (jm02 != null) {
            I0(jm02);
            ArrayList arrayList = jm02.c();
            for (byte b1 = 0; b1 < arrayList.size(); b1++) {
              if (((jm0)arrayList.get(b1)).c.equals(str1)) {
                this.C0 = b1;
                break;
              } 
            } 
          } 
        } 
        I0(jm01);
        this.D0.clear();
        if (this.r0 > 0) {
          int j;
          ArrayList arrayList = this.c0.e;
          int i = 0;
          while (true) {
            j = b;
            if (i < arrayList.size()) {
              if (((km0)arrayList.get(i)).b == this.r0) {
                j = i;
                break;
              } 
              i++;
              continue;
            } 
            break;
          } 
          if (j >= 0) {
            u90 u901 = this.c0;
            j++;
            ArrayList arrayList1 = u901.d;
            i = j;
            if (arrayList1 != null)
              i = j + arrayList1.size(); 
            this.x0.f(false, true, true);
            this.a0.k0(i);
            (new Handler()).postDelayed(new ff0(this, i, 0), 300L);
          } 
          this.r0 = 0;
          this.s0 = null;
        } 
      } 
    } 
  }
  
  public final boolean F0() {
    jm0 jm01 = this.t0;
    if (jm01 != null) {
      jm0 jm02 = jm01.f;
      if (jm02 != null) {
        String str = jm02.c;
        HashMap hashMap = this.D0;
        if (hashMap.get(str) != null) {
          i = 1;
        } else {
          i = 0;
        } 
        I0(jm02);
        hashMap.remove(jm01.c);
        if (!i && this.C0 == -1) {
          ArrayList<jm0> arrayList = jm02.c();
          for (i = 0; i < arrayList.size(); i++) {
            if ((jm0)arrayList.get(i) == jm01) {
              this.C0 = i;
              break;
            } 
          } 
        } 
        int i = this.C0;
        if (i >= 0) {
          this.a0.k0(i);
          this.x0.f(false, true, true);
          this.C0 = -1;
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean G0() {
    String str1 = MyApplication.j.c.u.c;
    String str2 = this.t0.c;
    return (str1.startsWith(str2) && !str2.equals(str1));
  }
  
  public final boolean H0() {
    return this.t0.c.equals(MyApplication.j.c.u.c);
  }
  
  public final void I0(jm0 paramjm0) {
    HashMap<String, Bundle> hashMap = this.D0;
    if (paramjm0 == null) {
      paramjm0 = MyApplication.j.c.t;
      if (paramjm0 != null)
        I0(paramjm0); 
      return;
    } 
    try {
      if (this.t0 != null) {
        Bundle bundle = new Bundle();
        this(2);
        bundle.putParcelable("rv_hFolderSongsState", this.a0.getLayoutManager().t0());
        AppBarLayout.Behavior behavior = (AppBarLayout.Behavior)((is)this.x0.getLayoutParams()).a;
        if (behavior != null) {
          d d1;
          AppBarLayout appBarLayout = this.x0;
          AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
          d d2 = behavior.G((Parcelable)absSavedState, appBarLayout);
          if (d2 != null)
            d1 = d2; 
          bundle.putParcelable("abState", (Parcelable)d1);
        } 
        hashMap.put(this.t0.c, bundle);
      } 
    } finally {
      Exception exception = null;
    } 
    k90 k90 = paramjm0.g;
    if (k90 != null) {
      arrayList1 = k90.c(MyApplication.j.c, new int[0]);
    } else {
      arrayList1 = new ArrayList(0);
    } 
    this.v0 = arrayList1;
    this.w0 = paramjm0.c();
    int j = this.v0.size();
    int i = this.w0.size();
    boolean bool = true;
    if (i + j > 5) {
      boolean bool1 = MyApplication.o().getBoolean("k_b_qsfl1", true);
      SmartTextView smartTextView = this.j0;
      if (bool1) {
        i = 0;
      } else {
        i = 8;
      } 
      smartTextView.setVisibility(i);
    } else {
      this.j0.setVisibility(8);
    } 
    z51.R(MyApplication.o().getInt("I_K_SRTBYF_F", 30), this.v0);
    u90 u901 = this.c0;
    ArrayList arrayList2 = this.w0;
    ArrayList arrayList1 = this.v0;
    u901.getClass();
    if (arrayList2 != null && arrayList1 != null) {
      u901.d = arrayList2;
      u901.e = arrayList1;
      u901.g();
    } 
    if (this.t0.f == null) {
      i = 1;
    } else {
      i = 0;
    } 
    ImageView imageView = this.g0;
    if (i != 0) {
      imageView.setVisibility(8);
      this.f0.setVisibility(8);
      this.d0.setPadding((int)MyApplication.p * 10, 0, 0, 0);
    } else {
      imageView.setVisibility(0);
      boolean bool1 = this.A0;
      imageView = this.f0;
      if (bool1) {
        imageView.setVisibility(0);
      } else {
        imageView.setVisibility(4);
      } 
      this.d0.setPadding(0, 0, 0, 0);
    } 
    if (G0() || H0()) {
      this.f0.setImageResource(2131231080);
      this.g0.setImageResource(2131231080);
    } else {
      this.f0.setImageResource(2131231085);
      this.g0.setImageResource(2131231085);
    } 
    if (H0()) {
      Drawable drawable = S().getDrawable(2131231147);
      this.i0.setCompoundDrawables(drawable, null, null, null);
      this.k0.setCompoundDrawables(drawable, null, null, null);
    } else {
      this.i0.setCompoundDrawables(null, null, null, null);
      this.k0.setCompoundDrawables(null, null, null, null);
    } 
    i = this.w0.size();
    imageView = this.e0;
    if (i > 0) {
      imageView.setVisibility(0);
    } else {
      imageView.setVisibility(4);
    } 
    this.a0.k0(0);
    ml0 ml0 = paramjm0.l;
    if (ml0 == null) {
      ml0 = MyApplication.F.c(paramjm0.b);
      paramjm0.l = ml0;
    } 
    String str2 = ml0.b;
    this.i0.setText(ml0.b(str2));
    this.k0.setText(ml0.b(str2));
    this.l0.setText(ml0.a(str2));
    this.l0.setVisibility(0);
    this.l0.setSelected(true);
    this.b0.setRecyclerView(this.a0);
    try {
      Bundle bundle = hashMap.remove(this.t0.c);
    } finally {
      str2 = null;
    } 
    try {
      MusicActivity musicActivity = this.p0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        ly0 ly0 = this.p0.t0;
        if (this.v0.size() == 0)
          bool = false; 
        ly0.f(bool);
        this.p0.t0.j = 0;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    i = paramjm0.i;
    j = paramjm0.j;
    long l = paramjm0.k;
    this.n0.setText(ag0.B(l, false, 0));
    str2 = S().getQuantityString(2131755061, i, new Object[] { Integer.valueOf(i) });
    String str1 = str2;
    if (j > 0)
      str1 = x41.o(new StringBuilder(), S().getQuantityString(2131755072, j, new Object[] { Integer.valueOf(j) }), ", ", str2); 
    this.m0.setText(str1);
  }
  
  public final void J(km0 paramkm0) {
    ss0 ss02 = this.o0;
    if (ss02 != null)
      ss02.dismiss(); 
    this.q0 = paramkm0;
    ArrayList<km0> arrayList = new ArrayList(1);
    this.B0 = arrayList;
    arrayList.add(paramkm0);
    this.u0 = this.t0;
    View view = LayoutInflater.from(P()).inflate(2131493015, null);
    TextView textView = (TextView)view.findViewById(2131297873);
    ImageView imageView = (ImageView)view.findViewById(2131296860);
    textView.setText(ag0.W(this.q0));
    if (c81.c(P()).c(this.q0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener(new ag(5, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296973);
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0 ms0 = new ms0(P());
    ms0.f(view, false);
    ss0 ss01 = new ss0(ms0);
    this.o0 = ss01;
    ss01.show();
  }
  
  public final void J0() {
    jm0 jm01 = this.u0;
    ArrayList<km0> arrayList = this.B0;
    km0 km01 = null;
    if (arrayList != null && arrayList.size() == 1) {
      km0 km02 = this.B0.get(0);
    } else {
      arrayList = null;
    } 
    jm0 jm02 = MyApplication.j.c.j(this.t0.c);
    Parcelable parcelable = this.a0.getLayoutManager().t0();
    I0(jm02);
    this.a0.getLayoutManager().s0(parcelable);
    if (jm01 != null) {
      if (Objects.equals(this.t0, jm01))
        km01 = (km0)ag0.p(this.c0.e, (km0)arrayList); 
      if (km01 != null) {
        this.q0 = km01;
        arrayList = new ArrayList(1);
        this.B0 = arrayList;
        arrayList.add(km01);
        this.u0 = this.t0;
        return;
      } 
      this.B0 = new ArrayList(0);
    } 
  }
  
  public final void K0() {
    String str;
    this.u0 = this.t0;
    if (this.y0 == 0) {
      str = S().getString(2131887051);
      this.B0 = E0(this.u0.c);
    } else {
      int i = this.c0.e.size();
      str = S().getQuantityString(2131755025, i, new Object[] { Integer.valueOf(i) });
      this.B0 = new ArrayList(this.c0.e);
    } 
    ms0 ms0 = new ms0(P());
    ms0.f = this.u0.b();
    ms0.e(2131493016, false);
    ViewGroup viewGroup = (ViewGroup)ms0.u.findViewById(2131296973);
    viewGroup.findViewById(2131297027).setVisibility(0);
    viewGroup.findViewById(2131297009).setVisibility(0);
    boolean bool = ws2.U();
    byte b = 8;
    if (!bool)
      viewGroup.findViewById(2131297008).setVisibility(8); 
    jm0 jm01 = this.u0.f;
    if (jm01 != null) {
      String str1 = jm01.b;
      if (MyApplication.F.d(str1) != null && !str1.equals("Storage"))
        viewGroup.findViewById(2131296984).setVisibility(0); 
    } 
    viewGroup.findViewById(2131296949).setVisibility(0);
    viewGroup.findViewById(2131296991).setVisibility(0);
    viewGroup.findViewById(2131296975).setVisibility(0);
    viewGroup.findViewById(2131296979).setVisibility(0);
    View view = viewGroup.findViewById(2131296992);
    if (!my0.d())
      b = 0; 
    view.setVisibility(b);
    TextView textView = (TextView)viewGroup.findViewById(2131297714);
    textView.setText(str);
    textView.setVisibility(0);
    if (!H0())
      viewGroup.findViewById(2131297024).setVisibility(0); 
    ag0.x0(viewGroup, this, a51.q);
    this.o0 = ms0.p();
  }
  
  public final void c0(int paramInt1, int paramInt2, Intent paramIntent) {
    if (paramInt1 == 1 && paramInt2 == -1)
      B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_BGU")); 
    super.c0(paramInt1, paramInt2, paramIntent);
  }
  
  public final void d(int paramInt) {
    try {
      this.p0.j0.k(this.c0.e, paramInt, this.t0.b(), true);
    } finally {
      Exception exception = null;
    } 
  }
  
  public final boolean e() {
    if (H0())
      return false; 
    if (G0()) {
      if (this.t0 != null && G0()) {
        ml0 ml02 = new ml0(MyApplication.j.c.u.c);
        String str = this.t0.c;
        ml0 ml01 = ml02.d();
        while (ml01 != null) {
          String str1 = ml01.b;
          if (str1.startsWith(str) && !str1.equals(str)) {
            ml0 ml0 = ml01.d();
            ml02 = ml01;
            ml01 = ml0;
          } 
        } 
        I0(MyApplication.j.c.j(ml02.b));
        return true;
      } 
      return false;
    } 
    return F0();
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.p0 = (MusicActivity)paramContext;
  }
  
  public final void f0(Bundle paramBundle) {
    super.f0(paramBundle);
    Context context = P();
    id1 id1 = new id1();
    ((u90)id1).f = context;
    ((u90)id1).i = this;
    ((u90)id1).g = LayoutInflater.from(context);
    this.c0 = (u90)id1;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492994, paramViewGroup, false);
    this.a0 = (RecyclerView)view.findViewById(2131297414);
    paramViewGroup = (ViewGroup)view.findViewById(2131297386);
    this.d0 = paramViewGroup;
    this.e0 = (ImageView)paramViewGroup.findViewById(2131296876);
    this.f0 = (ImageView)this.d0.findViewById(2131296835);
    this.i0 = (SmartTextView)this.d0.findViewById(2131297753);
    this.b0 = (RecyclerViewScrollBar)view.findViewById(2131297395);
    this.a0.h(this.p0.u0);
    this.j0 = (SmartTextView)view.findViewById(2131297864);
    view.findViewById(2131297928).setBackground(new wg(0, 1));
    view.findViewById(2131296589).setBackground(new wg(0, 0));
    CoordinatorLayout coordinatorLayout = (CoordinatorLayout)view.findViewById(2131296579);
    this.x0 = (AppBarLayout)view.findViewById(2131296354);
    this.g0 = (ImageView)view.findViewById(2131296836);
    this.m0 = (SmartTextView)view.findViewById(2131297796);
    this.n0 = (SmartTextView)view.findViewById(2131297740);
    this.k0 = (SmartTextView)view.findViewById(2131297690);
    this.l0 = (SmartTextView)view.findViewById(2131297879);
    SmartTextView smartTextView = (SmartTextView)view.findViewById(2131297869);
    this.h0 = (ImageView)view.findViewById(2131296911);
    this.j0.setOnClickListener(this);
    this.f0.setOnClickListener(this);
    this.g0.setOnClickListener(this);
    this.e0.setOnClickListener(this);
    this.i0.setOnClickListener(this);
    this.h0.setOnClickListener(this);
    this.x0.a(this);
    this.a0.setHasFixedSize(true);
    this.a0.setAdapter(this.c0);
    this.a0.setLayoutManager((a)new LinearLayoutManager(1));
    this.b0.setRecyclerView(this.a0);
    if (paramBundle == null)
      I0(MyApplication.j.c.u); 
    this.z0 = my0.g;
    this.l0.setTextColor(m92.h[6]);
    this.l0.setTypeface(Typeface.DEFAULT);
    this.l0.setTextSize(1, 14.0F);
    return view;
  }
  
  public final void i() {
    if (!H0()) {
      I0(MyApplication.j.c.u);
      this.D0.clear();
      return;
    } 
    this.a0.k0(0);
    this.x0.f(true, true, true);
  }
  
  public final void j0() {
    this.o0 = null;
    this.e0 = null;
    this.f0 = null;
    this.i0 = null;
    this.p0 = null;
    this.D0.clear();
    this.C0 = -1;
    this.I = true;
  }
  
  public final void n0(Bundle paramBundle) {
    paramBundle.putString("currentFolderPath", this.t0.b);
    paramBundle.putParcelable("rv_hFolderSongsState", this.a0.getLayoutManager().t0());
    AppBarLayout.Behavior behavior = (AppBarLayout.Behavior)((is)this.x0.getLayoutParams()).a;
    if (behavior != null) {
      d d1;
      AppBarLayout appBarLayout = this.x0;
      AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
      d d2 = behavior.G((Parcelable)absSavedState, appBarLayout);
      if (d2 != null)
        d1 = d2; 
      paramBundle.putParcelable("abState", (Parcelable)d1);
    } 
  }
  
  public final void o(AppBarLayout paramAppBarLayout, int paramInt) {
    if (Math.abs(paramInt) - paramAppBarLayout.getTotalScrollRange() == 0) {
      this.A0 = true;
      this.d0.setBackground(this.E0);
      this.i0.setVisibility(0);
    } else {
      this.A0 = false;
      this.d0.setBackground((Drawable)this.F0);
      this.i0.setVisibility(4);
    } 
    if (this.t0.f == null)
      return; 
    boolean bool = this.A0;
    ImageView imageView = this.f0;
    if (bool) {
      imageView.setVisibility(0);
      return;
    } 
    imageView.setVisibility(4);
  }
  
  public final void o0() {
    this.I = true;
    D0();
  }
  
  public final void onClick(View paramView) {
    ss0 ss01 = this.o0;
    if (ss01 != null)
      ss01.dismiss(); 
    int i = paramView.getId();
    if (i == 2131296835 || i == 2131296836) {
      if (H0() || G0()) {
        F0();
        return;
      } 
      e();
      return;
    } 
    if (i == 2131296876) {
      this.y0 = 0;
      K0();
      return;
    } 
    if (i == 2131296992) {
      my0.i(P());
      return;
    } 
    if (i == 2131297009) {
      jm0 jm01 = this.u0;
      try {
        Intent intent = new Intent();
        this(P(), FolderExcluderActivity.class);
        return;
      } finally {
        jm01 = null;
        jm01.printStackTrace();
      } 
    } 
    if (i == 2131297033) {
      MusicActivity.F0(P(), this.q0, new int[0]);
      this.q0 = null;
      return;
    } 
    String str = "";
    if (i == 2131296998) {
      MusicService musicService = this.p0.j0;
      ArrayList arrayList = this.B0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.u0.b());
      if (this.y0 == 0)
        str = "(+)"; 
      stringBuilder.append(str);
      musicService.k(arrayList, 0, stringBuilder.toString(), true);
      B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
      return;
    } 
    if (i == 2131297027 || i == 2131296906) {
      ArrayList arrayList = this.B0;
      z51.E(-1, arrayList);
      MusicService musicService = this.p0.j0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.u0.b());
      if (this.y0 == 0)
        str = "(+)"; 
      stringBuilder.append(str);
      musicService.k(arrayList, 0, stringBuilder.toString(), true);
      B0((new Intent(P(), MusicActivity.class)).putExtra("jump_key", "jump_player"));
      return;
    } 
    if (i == 2131296999) {
      MusicService musicService = this.p0.j0;
      if (musicService != null) {
        musicService.f(this.q0);
        this.q0 = null;
        return;
      } 
    } else {
      if (i == 2131297000) {
        this.p0.j0.g(this.B0);
        return;
      } 
      if (i == 2131296955) {
        if (this.p0.j0 != null && this.q0 != null) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.q0);
          MusicService musicService = this.p0.j0;
          boolean bool = MusicService.C0;
          musicService.j((MyApplication.h()).c, arrayList);
          arrayList.clear();
          this.q0 = null;
          return;
        } 
      } else {
        if (i == 2131296956) {
          MusicService musicService = this.p0.j0;
          ArrayList arrayList = this.B0;
          boolean bool = MusicService.C0;
          musicService.j((MyApplication.h()).c, arrayList);
          return;
        } 
        if (i == 2131296953) {
          if (this.p0.j0 != null && this.q0 != null) {
            ArrayList<km0> arrayList = new ArrayList(1);
            arrayList.add(this.q0);
            Context context = P();
            boolean bool = MusicService.C0;
            Stack stack = (MyApplication.h()).b;
            MusicService musicService = this.p0.j0;
            ((ss0)(new tk(context, stack, (MyApplication.h()).c, new ef0(this, arrayList, 0))).f).show();
            this.q0 = null;
            return;
          } 
        } else {
          if (i == 2131296954) {
            ArrayList arrayList = this.B0;
            Context context = P();
            boolean bool = MusicService.C0;
            Stack stack = (MyApplication.h()).b;
            MusicService musicService = this.p0.j0;
            ((ss0)(new tk(context, stack, (MyApplication.h()).c, new ef0(this, arrayList, 1))).f).show();
            return;
          } 
          if (i == 2131296979 || i == 2131296978) {
            if (this.B0 != null)
              ag0.j(P(), lm0.l(this.B0), true); 
            return;
          } 
          if (i == 2131296991) {
            if (this.B0 != null) {
              ag0.h0(P(), lm0.l(this.B0), true);
              return;
            } 
          } else if (i == 2131296975) {
            if (this.B0 != null) {
              ag0.h(P(), lm0.l(this.B0));
              return;
            } 
          } else if (i == 2131297025) {
            if (this.q0 != null) {
              ArrayList<km0> arrayList = new ArrayList(1);
              arrayList.add(this.q0);
              MusicActivity.D0(arrayList);
              return;
            } 
          } else {
            if (i == 2131297026) {
              MusicActivity.D0(this.B0);
              return;
            } 
            if (i == 2131296951) {
              if (this.q0 != null) {
                ArrayList<km0> arrayList = new ArrayList(1);
                arrayList.add(this.q0);
                GhostSearchActivity.f0 = arrayList;
                B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.u0.b()));
                return;
              } 
            } else {
              if (i == 2131296952) {
                GhostSearchActivity.f0 = this.B0;
                B0((new Intent(P(), GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.u0.b()));
                return;
              } 
              if (i == 2131297023) {
                TrimActivity.v0((Activity)this.p0, this.q0);
                return;
              } 
              if (i == 2131296964) {
                TrimActivity.w0((Activity)this.p0, this.q0);
                return;
              } 
              if (i == 2131297864) {
                i = this.c0.e.size();
                ArrayList arrayList = new ArrayList(this.c0.d.size() + i);
                arrayList.addAll(this.c0.d);
                arrayList.addAll(this.c0.e);
                this.o0 = (new ub1(P(), this.j0.getText().toString(), arrayList, 1, this, null)).p();
                return;
              } 
              if (i == 2131297753) {
                this.a0.k0(0);
                this.x0.f(true, true, true);
                return;
              } 
              if (i == 2131296910 || i == 2131296911) {
                B0((new Intent(P(), SettingsActivity.class)).putExtra("jmparg", "folders").putExtra("hs", true));
                return;
              } 
              if (i == 2131296949) {
                Context context = P();
                str = this.u0.b();
                String str1 = this.u0.b;
                n21.b(context, str, OETETTfAjV.JVv, str1, 0, 2131231447);
                return;
              } 
              if (i == 2131297024) {
                str = this.u0.b;
                MyApplication.o().edit().putString("k_s_hfp", str).apply();
                MyApplication.j.c.u = this.u0;
                if (!MyApplication.x().getBoolean("mnflex", false)) {
                  Drawable drawable = S().getDrawable(2131231147).mutate();
                  ag0.C0(m92.h[5], drawable);
                  ms0 ms02 = new ms0(P());
                  ms02.S = drawable;
                  ms02.q(2131887350);
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append(T(2131886347));
                  stringBuilder.append("\n");
                  stringBuilder.append(T(2131887354));
                  stringBuilder.append(" › ");
                  stringBuilder.append(T(2131886696));
                  stringBuilder.append(" › ");
                  stringBuilder.append(T(2131886603));
                  stringBuilder.append(" › ");
                  stringBuilder.append(T(2131887149));
                  ms02.d(stringBuilder.toString());
                  ms02.n(2131886639);
                  ms02.p();
                  ms0 ms01 = new ms0(P());
                  ms01.S = drawable;
                  ms01.q(2131887350);
                  ms01.d((CharSequence)Html.fromHtml(T(2131887351)));
                  ms01.n(2131886639);
                  ms01.p();
                } 
                I0(this.u0);
                return;
              } 
              if (i == 2131296984) {
                ag0.t0(P(), MyApplication.F.d(this.u0.b), true);
                return;
              } 
              if (i == 2131297021) {
                my0.h(this.c0.e);
                return;
              } 
              if (i == 2131297022) {
                my0.h(this.B0);
                return;
              } 
              if (i == 2131296980) {
                my0.b(this.c0.e);
                return;
              } 
              if (i == 2131296981) {
                my0.b(this.B0);
                return;
              } 
              if (i == 2131296958) {
                ag0.F0(P(), this.B0, null, true, null, false, null);
                return;
              } 
              if (i == 2131296983) {
                Tag2Activity.L1 = this.B0;
                B0(new Intent(P(), Tag2Activity.class));
                return;
              } 
              if (i == 2131297823) {
                (new p71(P(), this.B0)).p();
                return;
              } 
              if (i == 2131297008) {
                RGReadCalcActivity.n0(M(), new HashSet(this.B0));
                return;
              } 
              if (i == 2131297001) {
                Uri uri = this.q0.c.a();
                B0((new Intent(P(), MiniPlayerActivity.class)).setAction("pr").putExtra("data", (Parcelable)uri));
                return;
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  public final void p() {
    my0.h(this.c0.e);
  }
  
  public final void r() {
    try {
      MusicActivity musicActivity = this.p0;
      if (musicActivity.h0.h(musicActivity.U.getCurrentItem()) == this) {
        boolean bool;
        ly0 ly0 = this.p0.t0;
        if (this.c0.e.size() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        ly0.f(bool);
        this.p0.t0.j = 0;
      } 
    } catch (Exception exception) {}
    if (this.z0 == my0.g)
      return; 
    u90 u901 = this.c0;
    u901.getClass();
    if (!my0.d())
      u901.h = false; 
    if (u901.h) {
      u901.h = false;
    } else {
      u901.g();
    } 
    this.z0 = my0.g;
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null)
      try {
        I0(MyApplication.j.c.j(paramBundle.getString(IGBYXeDFmKYajx.mDVPGCjE)));
        this.a0.getLayoutManager().s0(paramBundle.getParcelable("rv_hFolderSongsState"));
        Parcelable parcelable = paramBundle.getParcelable("abState");
      } finally {
        paramBundle = null;
      }  
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: if_icmpne -> 203
    //   5: aload_2
    //   6: instanceof jm0
    //   9: istore #4
    //   11: iconst_0
    //   12: istore_1
    //   13: iload #4
    //   15: ifeq -> 69
    //   18: aload_2
    //   19: checkcast jm0
    //   22: astore_2
    //   23: iload_1
    //   24: aload_0
    //   25: getfield w0 : Ljava/util/ArrayList;
    //   28: invokevirtual size : ()I
    //   31: if_icmpge -> 63
    //   34: aload_0
    //   35: getfield w0 : Ljava/util/ArrayList;
    //   38: iload_1
    //   39: invokevirtual get : (I)Ljava/lang/Object;
    //   42: checkcast jm0
    //   45: aload_2
    //   46: if_acmpne -> 57
    //   49: aload_0
    //   50: iload_1
    //   51: putfield C0 : I
    //   54: goto -> 63
    //   57: iinc #1, 1
    //   60: goto -> 23
    //   63: aload_0
    //   64: aload_2
    //   65: invokevirtual I0 : (Ljm0;)V
    //   68: return
    //   69: aload_2
    //   70: instanceof km0
    //   73: ifeq -> 203
    //   76: aload_2
    //   77: checkcast km0
    //   80: astore #5
    //   82: aload_0
    //   83: getfield c0 : Lu90;
    //   86: getfield e : Ljava/util/ArrayList;
    //   89: astore_2
    //   90: iconst_0
    //   91: istore_1
    //   92: iload_1
    //   93: aload_2
    //   94: invokevirtual size : ()I
    //   97: if_icmpge -> 128
    //   100: aload_2
    //   101: iload_1
    //   102: invokevirtual get : (I)Ljava/lang/Object;
    //   105: checkcast km0
    //   108: getfield b : I
    //   111: aload #5
    //   113: getfield b : I
    //   116: if_icmpne -> 122
    //   119: goto -> 130
    //   122: iinc #1, 1
    //   125: goto -> 92
    //   128: iconst_m1
    //   129: istore_1
    //   130: iload_1
    //   131: iflt -> 203
    //   134: aload_0
    //   135: getfield c0 : Lu90;
    //   138: astore_2
    //   139: iload_1
    //   140: iconst_1
    //   141: iadd
    //   142: istore_3
    //   143: aload_2
    //   144: getfield d : Ljava/util/ArrayList;
    //   147: astore_2
    //   148: iload_3
    //   149: istore_1
    //   150: aload_2
    //   151: ifnull -> 161
    //   154: iload_3
    //   155: aload_2
    //   156: invokevirtual size : ()I
    //   159: iadd
    //   160: istore_1
    //   161: aload_0
    //   162: getfield x0 : Lcom/google/android/material/appbar/AppBarLayout;
    //   165: iconst_0
    //   166: iconst_1
    //   167: iconst_1
    //   168: invokevirtual f : (ZZZ)V
    //   171: aload_0
    //   172: getfield a0 : Landroidx/recyclerview/widget/RecyclerView;
    //   175: iload_1
    //   176: invokevirtual k0 : (I)V
    //   179: new android/os/Handler
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: new ff0
    //   189: dup
    //   190: aload_0
    //   191: iload_1
    //   192: iconst_1
    //   193: invokespecial <init> : (Lgf0;II)V
    //   196: ldc2_w 300
    //   199: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   202: pop
    //   203: return
  }
  
  public final void w() {
    my0.b(this.c0.e);
  }
  
  public final void x() {
    my0.k(this.c0.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */