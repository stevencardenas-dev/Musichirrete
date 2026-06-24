import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.android.widgets.NestedHorizontalScrollView;
import in.krosbits.android.widgets.PassScrollSmartTextView;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.android.widgets.swipetoloadlayout.SwipeToLoadLayout;
import in.krosbits.musicolet.IVActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;
import java.util.ArrayList;

public class z71 extends ua0 implements View.OnTouchListener, o41, View.OnDragListener, l41, View.OnClickListener, PopupWindow.OnDismissListener, View.OnLongClickListener, rq0, dd, ob {
  public static final l3 Q1 = new l3(12);
  
  public static boolean R1 = false;
  
  public static int S1 = -1;
  
  public LinearLayout A0;
  
  public float A1;
  
  public ImageView B0;
  
  public float B1;
  
  public LyricsView C0;
  
  public boolean C1;
  
  public SwipeToLoadLayout D0;
  
  public int D1;
  
  public MusicActivity E0;
  
  public boolean E1;
  
  public mq0 F0;
  
  public int F1;
  
  public boolean G0 = false;
  
  public RectF G1;
  
  public boolean H0;
  
  public RectF H1;
  
  public SharedPreferences I0;
  
  public boolean I1;
  
  public ss0 J0;
  
  public boolean J1;
  
  public Handler K0;
  
  public boolean K1;
  
  public q42 L0;
  
  public final w71 L1;
  
  public km0 M0;
  
  public final v71 M1;
  
  public boolean N0 = false;
  
  public jj N1;
  
  public LinearLayout O0;
  
  public boolean O1;
  
  public SharedPreferences P0;
  
  public long P1;
  
  public long Q0;
  
  public float R0;
  
  public float S0;
  
  public float T0;
  
  public final v71 U0 = new v71(this, 6);
  
  public xp0 V0;
  
  public ViewGroup W0;
  
  public ViewGroup X0;
  
  public ViewGroup Y0;
  
  public TextView Z0;
  
  public View a0;
  
  public SmartImageView a1;
  
  public Slider b0;
  
  public MaterialButton b1;
  
  public MaterialButton c0;
  
  public MaterialButton c1;
  
  public MaterialButton d0;
  
  public ImageView d1;
  
  public Group e0;
  
  public boolean e1 = false;
  
  public SmartTextView f0;
  
  public boolean f1 = false;
  
  public SmartTextView g0;
  
  public long g1 = 0L;
  
  public SmartTextView h0;
  
  public ImageView h1;
  
  public SmartTextView i0;
  
  public ImageView i1;
  
  public SmartTextView j0;
  
  public m2 j1;
  
  public SmartImageView k0;
  
  public bp1 k1;
  
  public SmartImageView l0;
  
  public final y71 l1 = new y71(this, 0);
  
  public SmartImageView m0;
  
  public final y71 m1 = new y71(this, 1);
  
  public SmartImageView n0;
  
  public final v71 n1 = new v71(this, 7);
  
  public SmartImageView o0;
  
  public ConstraintLayout o1;
  
  public SmartImageView p0;
  
  public final al p1 = new al(1);
  
  public SmartImageView q0;
  
  public boolean q1;
  
  public SmartImageView r0;
  
  public boolean r1 = false;
  
  public SmartImageView s0;
  
  public boolean s1;
  
  public SmartImageView t0;
  
  public boolean t1;
  
  public SmartImageView u0;
  
  public boolean u1;
  
  public SmartImageView v0;
  
  public boolean v1;
  
  public SmartImageView w0;
  
  public boolean w1;
  
  public SmartImageView x0;
  
  public cv0 x1 = cv0.c;
  
  public View y0;
  
  public iv0 y1;
  
  public SmartImageView z0;
  
  public boolean z1;
  
  public z71() {
    String str = MyApplication.f;
    this.F1 = -2;
    this.L1 = new w71(this);
    this.M1 = new v71(this, 8);
    this.O1 = false;
    this.P1 = 0L;
  }
  
  public static boolean I0(Context paramContext) {
    Configuration configuration = paramContext.getResources().getConfiguration();
    return (configuration.orientation == 2 && (configuration.screenWidthDp < 480 || configuration.screenHeightDp < 300));
  }
  
  public static void T0(View paramView, float paramFloat) {
    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(paramView, "scaleX", new float[] { paramFloat });
    ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(paramView, "scaleY", new float[] { paramFloat });
    objectAnimator2.setDuration(150L);
    objectAnimator1.setDuration(150L);
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.play((Animator)objectAnimator2).with((Animator)objectAnimator1);
    animatorSet.start();
  }
  
  public final void C(View paramView) {
    Slider slider = (Slider)paramView;
    MusicService musicService = this.E0.j0;
    if (musicService != null && !this.I1 && !this.J1)
      musicService.t0((int)slider.getValue()); 
    this.G0 = true;
  }
  
  public final void D() {
    this.D0.setLoadingMore(false);
    Handler handler = this.K0;
    if (handler != null)
      handler.postDelayed(new l3(11), 220L); 
  }
  
  public final void D0() {
    boolean bool1 = this.I0.getBoolean("k_b_ctrali", false);
    this.z1 = this.I0.getBoolean("k_b_alaric", false);
    int i = (P().getResources().getConfiguration()).smallestScreenWidthDp;
    if (i >= 480 && i < 840) {
      i = 1;
    } else {
      i = 0;
    } 
    if ((P().getResources().getConfiguration()).smallestScreenWidthDp >= 840) {
      j = 1;
    } else {
      j = 0;
    } 
    this.r1 = MyApplication.o().getBoolean("k_b_npsctx", true);
    pq pq = new pq();
    pq.c(this.o1);
    boolean bool2 = this.I0.getBoolean("k_b_al", true);
    this.v1 = bool2;
    SmartTextView smartTextView = this.g0;
    if (bool2) {
      pq.m(smartTextView.getId(), 0);
      smartTextView = this.g0;
      if (bool1) {
        smartTextView.setGravity(17);
      } else {
        smartTextView.setGravity(0);
      } 
      this.g0.setSelected(this.r1);
    } else {
      pq.m(smartTextView.getId(), 8);
    } 
    bool2 = this.I0.getBoolean("k_b_ar", true);
    this.w1 = bool2;
    smartTextView = this.h0;
    if (bool2) {
      pq.m(smartTextView.getId(), 0);
      smartTextView = this.h0;
      if (bool1) {
        smartTextView.setGravity(17);
      } else {
        smartTextView.setGravity(0);
      } 
      this.h0.setSelected(this.r1);
    } else {
      pq.m(smartTextView.getId(), 8);
    } 
    smartTextView = this.f0;
    if (bool1) {
      smartTextView.setGravity(17);
    } else {
      smartTextView.setGravity(0);
    } 
    this.f0.setSelected(this.r1);
    if (this.s1 || this.t1) {
      this.f0.setTextSize(2, 14.0F);
      this.h0.setTextSize(2, 12.0F);
      this.g0.setTextSize(2, 12.0F);
    } else if (i != 0 || j) {
      this.f0.setTextSize(2, 20.0F);
      this.h0.setTextSize(2, 18.0F);
      this.g0.setTextSize(2, 18.0F);
    } 
    i = MyApplication.o().getInt("etu2", 0);
    SmartImageView smartImageView = this.p0;
    if (i == -1) {
      smartImageView.setEnabled(false);
      this.p0.setAlpha(0.3F);
    } else {
      smartImageView.setEnabled(true);
      this.p0.setAlpha(1.0F);
    } 
    float f = MyApplication.p;
    int k = (int)(6.0F * f);
    int m = (int)(8.0F * f);
    i = (int)(4.0F * f);
    int j = (int)(2.0F * f);
    int n = (int)f;
    if (this.s1) {
      n = (int)(f * 50.0F);
      (pq.g(2131296879)).d.Z = n;
      n = (int)(MyApplication.p * 48.0F);
      (pq.g(2131297441)).d.c = n;
      pq.l(2131296879, 4, j);
      pq.l(2131297740, 4, j);
      pq.l(2131296905, 4, j);
      pq.l(2131297685, 4, j);
      pq.l(2131297692, 4, j);
      pq.l(2131297890, 4, j);
      pq.l(2131296847, 3, i);
      pq.l(2131296847, 4, i);
      pq.l(2131296847, 1, i);
      pq.l(2131296847, 2, i);
      this.l0.setPadding(k, 0, k, 0);
      this.k0.setPadding(k, 0, k, 0);
      this.m0.setPadding(k, 0, k, 0);
      this.w0.setPadding(k, 0, k, 0);
      this.x0.setPadding(k, 0, k, 0);
      this.p0.setPadding(m, 0, m, 0);
      this.o0.setPadding(m, 0, m, 0);
    } else if (this.t1) {
      int i1 = (int)(f * 50.0F);
      (pq.g(2131296879)).d.a0 = i1;
      i1 = (int)(MyApplication.p * 48.0F);
      (pq.g(2131297441)).d.c = i1;
      pq.l(2131296879, 4, i);
      pq.l(2131297441, 4, 0);
      pq.l(2131296905, 4, 0);
      pq.l(2131297685, 4, n);
      pq.l(2131297692, 4, n);
      pq.l(2131297890, 4, n);
      pq.l(2131296847, 3, 0);
      pq.l(2131296847, 4, j);
      pq.l(2131296847, 1, m);
      pq.l(2131296847, 2, m);
      this.l0.setPadding(k, k, k, k);
      this.k0.setPadding(k, k, k, k);
      this.m0.setPadding(k, k, k, k);
      this.w0.setPadding(k, 0, k, 0);
      this.x0.setPadding(k, 0, k, 0);
    } 
    pq.a(this.o1);
    if (MyApplication.j.c.J && MyApplication.o().getBoolean("k_b_rcmpaemy", true)) {
      View view = this.o1.findViewById(2131296411);
      SharedPreferences sharedPreferences = MyApplication.x();
      StringBuilder stringBuilder = new StringBuilder("s_b_mpssn_");
      stringBuilder.append(MyApplication.j.c.L);
      bool1 = sharedPreferences.getBoolean(stringBuilder.toString(), false);
      if (view instanceof MaterialButton) {
        pq pq1 = new pq();
        pq1.c(this.o1);
        if (bool1) {
          pq1.m(2131296411, 8);
        } else {
          pq1.m(2131296411, 0);
        } 
        pq1.a(this.o1);
      } else {
        i = (int)MyApplication.p;
        if (!bool1) {
          MaterialButton materialButton = new MaterialButton(P());
          int[] arrayOfInt = m92.h;
          materialButton.setBackgroundColor(arrayOfInt[5]);
          materialButton.setTextColor(arrayOfInt[2]);
          materialButton.setIconTint(ColorStateList.valueOf(arrayOfInt[2]));
          materialButton.setIconResource(2131231220);
          materialButton.setAllCaps(false);
          materialButton.setIconSize((int)(S().getDimension(2131165390) * 20.0F));
          materialButton.setId(2131296411);
          materialButton.setOnClickListener(this);
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(T(2131886842));
          stringBuilder1.append(" ✶ ");
          stringBuilder1.append(MyApplication.j.c.L);
          stringBuilder1.append("  ➜");
          materialButton.setText(stringBuilder1.toString());
          materialButton.setLayoutParams((ViewGroup.LayoutParams)new gq(0));
          this.o1.addView((View)materialButton);
          pq = new pq();
          pq.c(this.o1);
          pq.d(2131296411, 3, 2131296847, 3);
          pq.d(2131296411, 4, 2131296847, 4);
          pq.d(2131296411, 1, 2131296847, 1);
          pq.d(2131296411, 2, 2131296847, 2);
          (pq.g(2131296411)).d.x = 0.0F;
          (pq.g(2131296411)).d.X = 1;
          i *= 8;
          pq.l(2131296411, 1, i);
          pq.l(2131296411, 2, i);
          pq.l(2131296411, 3, i);
          pq.a(this.o1);
        } 
      } 
    } else if (this.o1.findViewById(2131296411) != null) {
      pq.c(this.o1);
      pq.m(2131296411, 8);
      pq.a(this.o1);
    } 
    W0();
    L0();
  }
  
  public final int E() {
    try {
      if (MusicService.P0 != null && MusicService.F0) {
        hc hc = MusicService.E0;
        if (hc != null)
          return hc.A(); 
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void E0() {
    boolean bool;
    xp0 xp02 = this.V0;
    MaterialButton materialButton = (MaterialButton)this.j1.b;
    if (xp02 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    materialButton.setEnabled(bool);
    xp0 xp01 = xp02;
    if (xp02 == null) {
      xp01 = new xp0(null, "⏳", false);
      xp01.f = true;
      xp01.g = true;
    } 
    ArrayList arrayList = xp01.a;
    if (this.u1 && (arrayList.size() > 5 || (arrayList.size() >= 1 && xp01.b(0).length() > 60))) {
      this.f0.setVisibility(8);
      this.h0.setVisibility(8);
      this.g0.setVisibility(8);
    } else {
      if (this.w1)
        this.h0.setVisibility(0); 
      if (this.v1)
        this.g0.setVisibility(0); 
      this.f0.setVisibility(0);
    } 
    this.f0.setSelected(false);
    this.g0.setSelected(false);
    this.h0.setSelected(false);
    this.C0.w0(xp01, this);
    Z0();
    MusicActivity musicActivity = this.E0;
    if (musicActivity != null)
      musicActivity.N0(); 
  }
  
  public final void F0(SmartTextView paramSmartTextView, String paramString, int paramInt) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    if (paramInt == 0) {
      try {
        paramSmartTextView.setText(str);
      } finally {
        paramSmartTextView = null;
      } 
    } else {
      try {
        Drawable drawable = S().getDrawable(paramInt);
      } catch (android.content.res.Resources.NotFoundException notFoundException) {
        notFoundException.printStackTrace();
        notFoundException = null;
      } catch (NullPointerException nullPointerException) {}
      SpannableString spannableString = new SpannableString();
      String str1 = str;
      if (nullPointerException != null)
        str1 = "  ".concat(str); 
      this(str1);
      if (nullPointerException != null) {
        paramInt = paramSmartTextView.getLineHeight();
        ag0.C0(paramSmartTextView.getCurrentTextColor(), (Drawable)nullPointerException);
        nullPointerException.setBounds(0, 0, paramInt, paramInt);
        ImageSpan imageSpan = new ImageSpan();
        this((Drawable)nullPointerException);
        spannableString.setSpan(imageSpan, 0, 1, 0);
      } 
      paramSmartTextView.setText((CharSequence)spannableString);
    } 
  }
  
  public final q42 G0() {
    if (this.L0 == null) {
      Context context = P();
      AudioManager audioManager = MyApplication.e();
      PopupWindow popupWindow = new PopupWindow(context);
      ((q42)popupWindow).h = new Handler();
      ((q42)popupWindow).i = new xt0(23, popupWindow);
      ((q42)popupWindow).b = audioManager;
      ((q42)popupWindow).j = this;
      View view = LayoutInflater.from(context).inflate(2131493215, null);
      AppCompatSeekBar appCompatSeekBar1 = (AppCompatSeekBar)view.findViewById(2131297442);
      ((q42)popupWindow).c = appCompatSeekBar1;
      SmartTextView smartTextView = (SmartTextView)view.findViewById(2131297905);
      ((q42)popupWindow).e = smartTextView;
      SmartImageView smartImageView = (SmartImageView)view.findViewById(2131296915);
      ((q42)popupWindow).f = smartImageView;
      appCompatSeekBar1.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)popupWindow);
      smartImageView.setOnClickListener((View.OnClickListener)popupWindow);
      smartTextView.setOnClickListener((View.OnClickListener)popupWindow);
      popupWindow.setHeight(-2);
      popupWindow.setWidth(-2);
      popupWindow.setContentView(view);
      popupWindow.setOutsideTouchable(true);
      popupWindow.setBackgroundDrawable((Drawable)new BitmapDrawable(context.getResources(), ""));
      popupWindow.setElevation(context.getResources().getDimension(2131165391));
      this.L0 = (q42)popupWindow;
      popupWindow.setOnDismissListener(this);
    } 
    int i = MyApplication.e().getStreamVolume(3);
    int j = MyApplication.e().getStreamMaxVolume(3);
    hc hc = MusicService.E0;
    if (hc instanceof fl) {
      int k = ((fl)hc).j0();
      ((fl)MusicService.E0).getClass();
      byte b = 20;
      i = k;
      j = b;
      if (k < 0) {
        i = 0;
        j = b;
      } 
    } 
    q42 q421 = this.L0;
    q421.g = j;
    AppCompatSeekBar appCompatSeekBar = q421.c;
    appCompatSeekBar.setMax(j);
    appCompatSeekBar.setProgress(0);
    appCompatSeekBar.setProgress(i);
    q421.e.setText(String.valueOf(i));
    q421.f.setImageResource(ag0.X(i, j));
    return this.L0;
  }
  
  public final void H0() {
    this.C0.setSelectionModeOn(false);
    this.C0.setVisibility(8);
    ((MaterialButton)this.j1.b).setVisibility(8);
    ((SmartImageView)this.j1.f).setVisibility(8);
    ((SmartImageView)this.j1.e).setVisibility(8);
    ((SmartImageView)this.j1.d).setVisibility(8);
    ((SmartImageView)this.j1.c).setVisibility(8);
    this.t0.setVisibility(8);
    this.v0.setVisibility(8);
    this.u0.setVisibility(8);
    this.B0.setVisibility(0);
    if (this.w1)
      this.h0.setVisibility(0); 
    if (this.v1)
      this.g0.setVisibility(0); 
    this.f0.setVisibility(0);
    this.f0.setSelected(this.r1);
    this.h0.setSelected(this.r1);
    this.h0.setSelected(this.r1);
    MusicActivity musicActivity = this.E0;
    if (musicActivity != null)
      musicActivity.N0(); 
  }
  
  public final void J0(boolean paramBoolean) {
    try {
      LyricsView lyricsView = this.C0;
      int i = m92.h[12];
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void K0() {
    int i = MyApplication.o().getInt("k_i_boclalatnp", -2);
    if (i == -2) {
      ag0.K0(P(), T(2131887580), null, "k_i_boclalatnp", -2, 2130903087, 2130903063, null, new v71(this, 4));
      return;
    } 
    if (i == 0) {
      U0();
      return;
    } 
    if (i == 1) {
      if (this.M0 != null) {
        B0((new Intent(P(), IVActivity.class)).putExtra("rid", this.M0.b));
        return;
      } 
    } else if (i == 2) {
      onClick((View)this.l0);
    } 
  }
  
  public final void L0() {
    LyricsView lyricsView = this.C0;
    if (lyricsView != null) {
      lyricsView.u0();
      if (this.C0.getVisibility() == 0)
        U0(); 
    } 
  }
  
  public final void M0() {
    try {
      this.H0 = this.I0.getBoolean("RCPOS", false);
      int i = MyApplication.e().getStreamVolume(3);
      int j = MyApplication.e().getStreamMaxVolume(3);
      hc hc = MusicService.E0;
      if (hc instanceof fl) {
        i = ((fl)hc).j0();
        ((fl)MusicService.E0).getClass();
        j = 20;
      } 
      this.o0.setImageResource(ag0.X(i, j));
      this.G0 = true;
      Handler handler = this.K0;
      l3 l31 = Q1;
      handler.removeCallbacks(l31);
      this.K0.postDelayed(l31, 1000L);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void N0(Intent paramIntent) {
    int i;
    Uri uri;
    km0 km01;
    try {
      uri = paramIntent.getData();
      i = S1;
      if (i == -1)
        i = paramIntent.getIntExtra("rowid", -1); 
      mq0 mq01 = this.F0;
      km01 = this.M0;
      if (km01 != null && i == km01.b) {
        i = 1;
      } else {
        i = 0;
      } 
    } catch (Exception exception) {
    
    } finally {}
    if (uri != null) {
      String str = uri.toString();
      v00 v00 = v00.q(n21.f, str);
      if (v00 != null) {
        IllegalArgumentException illegalArgumentException;
        if (i != 0) {
          if (S1 != -1)
            if ("lrc".equals(ag0.C(v00.h()))) {
              MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission(uri, 3);
            } else {
              ag0.P0(0, U(2131887333, new Object[] { "'.lrc'" }), true);
              illegalArgumentException = new IllegalArgumentException();
              this("ext!=lrc");
              throw illegalArgumentException;
            }  
          if (illegalArgumentException != null) {
            ((mq0)illegalArgumentException).E0 = v00;
            illegalArgumentException.t();
          } else if (R1) {
            S0(v00, km01);
          } else {
            try {
              this.V0 = null;
              Y0();
            } finally {
              illegalArgumentException = null;
            } 
          } 
        } else if (illegalArgumentException != null) {
          try {
            ss0 ss01 = ((mq0)illegalArgumentException).F0;
            if (ss01 != null)
              ss01.dismiss(); 
          } finally {}
        } 
      } 
    } 
    R1 = false;
    S1 = -1;
  }
  
  public final void O0(int paramInt) {
    int i = MyApplication.e().getStreamMaxVolume(3);
    hc hc = MusicService.E0;
    if (hc instanceof fl) {
      ((fl)hc).getClass();
      i = 20;
    } 
    this.o0.setImageResource(ag0.X(paramInt, i));
  }
  
  public final void P0() {
    this.A0.removeAllViews();
    this.z0 = null;
    float f = MyApplication.p;
    null = (int)(40.0F * f);
    int i = (int)(f * 8.0F);
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(null, null);
    layoutParams.leftMargin = (int)(MyApplication.p * 8.0F);
    layoutParams.gravity = 16;
    for (z41 z41 : a51.f) {
      if (z41 != a51.a) {
        boolean bool = z41.f;
        int j = z41.a;
        if (bool) {
          if (j == 2131297823) {
            int k = j50.a;
            MusicService musicService = MusicService.P0;
            if (musicService != null)
              musicService.J(); 
          } 
          if (j != 2131297717 || ws2.U()) {
            SmartImageView smartImageView = new SmartImageView(P());
            smartImageView.setId(j);
            smartImageView.setImageResource(z41.e);
            smartImageView.setContentDescription(T(z41.b));
            smartImageView.setBackground(m92.z(P(), 2130969899));
            smartImageView.setPadding(i, i, i, i);
            smartImageView.setColorTintIndex(6);
            smartImageView.setOnClickListener(this);
            this.A0.addView((View)smartImageView, (ViewGroup.LayoutParams)layoutParams);
            if (j == 2131296859)
              this.z0 = smartImageView; 
          } 
        } 
      } 
    } 
    if (this.z0 != null && this.M0 != null)
      X0(); 
  }
  
  public final void Q0(MotionEvent paramMotionEvent, int paramInt, float paramFloat1, float paramFloat2) {
    v71 v712 = this.U0;
    v71 v711 = this.M1;
    float f = 0.85F;
    int i = 1;
    int j = 1;
    boolean bool = false;
    if (paramInt == 0) {
      paramFloat1 -= this.b0.getTrackSidePadding();
      this.A1 = paramFloat1;
      this.B1 = paramFloat2;
      paramFloat2 = this.b0.getTrackWidth();
      i = (int)((this.b0.getValue() - this.b0.getValueFrom()) * paramFloat2 / (this.b0.getValueTo() - this.b0.getValueFrom()));
      paramInt = (int)(MyApplication.p * 30.0F);
      boolean bool1 = MyApplication.o().getBoolean("k_b_sbpvtact2", false);
      this.K1 = MyApplication.o().getBoolean("k_b_sskhpbt", true);
      if (bool1 && paramFloat1 < (i - paramInt)) {
        this.D1 = 0;
        this.b0.getParent().requestDisallowInterceptTouchEvent(false);
      } else if (bool1 && paramFloat1 > (i + paramInt)) {
        this.D1 = 1;
        this.b0.getParent().requestDisallowInterceptTouchEvent(false);
      } else {
        this.D1 = 2;
        this.E1 = true;
        this.J1 = false;
        this.I1 = false;
        this.H1 = null;
        this.G1 = null;
        this.K0.removeCallbacks(v712);
        this.d0.setPressed(false);
        this.c0.setPressed(false);
        this.c0.setScaleX(0.85F);
        this.c0.setScaleY(0.85F);
        this.d0.setScaleX(0.85F);
        this.d0.setScaleY(0.85F);
        ((ViewGroup)this.b0.getParent()).requestDisallowInterceptTouchEvent(true);
        this.K0.removeCallbacks(v711);
        this.K0.postDelayed(v711, 700L);
        paramInt = j;
        this.C1 = false;
      } 
      paramInt = 0;
    } else {
      if (paramInt == 2) {
        if (this.C1)
          return; 
        paramFloat1 = Math.abs(paramMotionEvent.getX() - this.A1);
        paramFloat2 = Math.abs(paramMotionEvent.getY() - this.B1);
        float f1 = this.b0.getHeight() / 2.0F;
        if (this.D1 == 2) {
          if ((paramFloat1 > f1 || paramFloat2 > f1) && this.K1)
            this.e0.setVisibility(0); 
          int[] arrayOfInt = new int[2];
          if (this.G1 == null && this.K1) {
            this.d0.getLocationOnScreen(arrayOfInt);
            int m = arrayOfInt[0];
            paramInt = arrayOfInt[1];
            int k = this.d0.getWidth();
            j = this.d0.getHeight();
            if (k > 0 && j > 0)
              this.G1 = new RectF(m, 0.0F, (k * 2 + m), (paramInt + j)); 
          } 
          if (this.H1 == null && this.K1) {
            this.c0.getLocationOnScreen(arrayOfInt);
            int m = arrayOfInt[0];
            paramInt = arrayOfInt[1];
            j = this.c0.getWidth();
            int k = this.c0.getHeight();
            if (j > 0 && k > 0)
              this.H1 = new RectF((m - j), 0.0F, (m + j), (paramInt + k)); 
          } 
          f1 = paramMotionEvent.getRawX();
          paramFloat2 = paramMotionEvent.getRawY();
          RectF rectF = this.G1;
          if (rectF != null && rectF.contains(f1, paramFloat2)) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          if (this.I1 != bool1) {
            this.d0.setPressed(bool1);
            if (bool1) {
              paramFloat1 = 1.0F;
            } else {
              paramFloat1 = 0.85F;
            } 
            this.d0.setScaleX(paramFloat1);
            this.d0.setScaleY(paramFloat1);
          } 
          this.I1 = bool1;
          rectF = this.H1;
          boolean bool1 = bool;
          if (rectF != null) {
            bool1 = bool;
            if (rectF.contains(f1, paramFloat2))
              bool1 = true; 
          } 
          if (this.J1 != bool1) {
            this.c0.setPressed(bool1);
            paramFloat1 = f;
            if (bool1)
              paramFloat1 = 1.0F; 
            this.c0.setScaleX(paramFloat1);
            this.c0.setScaleY(paramFloat1);
          } 
          this.J1 = bool1;
          paramInt = i;
        } else {
          if (paramFloat1 > f1 || paramFloat2 > f1) {
            this.D1 = -1;
            this.E1 = false;
            try {
              ViewGroup viewGroup = (ViewGroup)this.b0.getParent();
              this.C1 = true;
              viewGroup.requestDisallowInterceptTouchEvent(false);
              viewGroup.onTouchEvent(paramMotionEvent);
            } finally {
              paramMotionEvent = null;
            } 
            return;
          } 
          return;
        } 
      } else {
        if (paramInt == 1 || paramInt == 3) {
          if (paramInt == 1 && this.E1) {
            bool = this.J1;
            if (!bool) {
              boolean bool1 = this.I1;
              if (!bool1) {
                Slider slider = this.b0;
                MusicService musicService = this.E0.j0;
                if (musicService != null && !bool1 && !bool)
                  musicService.t0((int)slider.getValue()); 
                this.G0 = true;
              } 
            } 
            if (this.J1)
              (new dk1(P(), MusicService.E0.A(), this.M0.c.g)).p(); 
          } 
          if (this.E1) {
            this.b0.onTouchEvent(paramMotionEvent);
            this.d0.setPressed(false);
            this.c0.setPressed(false);
            this.c0.setScaleX(0.85F);
            this.c0.setScaleY(0.85F);
            this.d0.setScaleX(0.85F);
            this.d0.setScaleY(0.85F);
          } 
          this.K0.postDelayed(v712, 300L);
          this.b0.getParent().requestDisallowInterceptTouchEvent(true);
          f1();
          this.D1 = -1;
          this.E1 = false;
          this.C1 = false;
          this.K0.removeCallbacks(v711);
          this.e0.setVisibility(8);
        } 
        paramInt = 0;
      } 
      if (paramInt != 0)
        this.b0.onTouchEvent(paramMotionEvent); 
    } 
    this.C1 = false;
  }
  
  public final void R0() {
    if (this.F1 != this.D1) {
      byte b;
      MusicService musicService = MusicService.P0;
      if (musicService == null || musicService.j) {
        b = 1;
      } else {
        b = 0;
      } 
      Slider slider = this.b0;
      int[] arrayOfInt = m92.h;
      if (b) {
        b = 6;
      } else {
        b = 5;
      } 
      slider.setTrackActiveTintList(ColorStateList.valueOf(arrayOfInt[b]));
      this.b0.setTrackInactiveTintList(ColorStateList.valueOf(arrayOfInt[8]));
      this.x0.setPressed(false);
      this.w0.setPressed(false);
    } 
    this.F1 = this.D1;
  }
  
  public final void S0(v00 paramv00, km0 paramkm0) {
    if (paramkm0 == null)
      return; 
    mq0 mq02 = this.F0;
    if (mq02 != null) {
      boolean bool;
      ss0 ss01 = mq02.F0;
      if (ss01 != null) {
        bool = ss01.isShowing();
      } else {
        bool = false;
      } 
      if (bool) {
        ss01 = this.F0.F0;
        if (ss01 != null)
          ss01.setOnDismissListener(null); 
        mq0 mq03 = this.F0;
        mq03.getClass();
        try {
          ss0 ss02 = mq03.F0;
          if (ss02 != null)
            ss02.dismiss(); 
        } finally {}
      } 
    } 
    mq0 mq01 = new mq0(this.E0, paramkm0, new pp(5, this), paramv00);
    this.F0 = mq01;
    mq01.W = new x71(this, 2);
    mq01.p();
  }
  
  public final void U0() {
    if (this.M0 != null) {
      this.C0.setVisibility(0);
      this.u0.setVisibility(0);
      ((SmartImageView)this.j1.f).setVisibility(0);
      this.B0.setVisibility(8);
      if (this.M0 != null)
        Y0(); 
    } 
  }
  
  public final void V0() {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #8
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield e1 : Z
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield f1 : Z
    //   15: lconst_0
    //   16: lstore_2
    //   17: aload_0
    //   18: lconst_0
    //   19: putfield g1 : J
    //   22: aload_0
    //   23: getfield K0 : Landroid/os/Handler;
    //   26: astore #9
    //   28: aload_0
    //   29: getfield n1 : Lv71;
    //   32: astore #7
    //   34: aload #9
    //   36: aload #7
    //   38: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   41: aload_0
    //   42: getfield M0 : Lkm0;
    //   45: astore #9
    //   47: aload #9
    //   49: ifnull -> 199
    //   52: aload_0
    //   53: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   56: astore #10
    //   58: aload #10
    //   60: ifnull -> 199
    //   63: aload #10
    //   65: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   68: astore #10
    //   70: aload #10
    //   72: ifnull -> 199
    //   75: aload #10
    //   77: getfield P : Z
    //   80: ifeq -> 118
    //   83: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   86: getfield c : Llm0;
    //   89: invokevirtual getClass : ()Ljava/lang/Class;
    //   92: pop
    //   93: aload #9
    //   95: getfield n : J
    //   98: lstore #4
    //   100: lload #4
    //   102: lstore_2
    //   103: goto -> 113
    //   106: astore #9
    //   108: aload #9
    //   110: invokevirtual printStackTrace : ()V
    //   113: aload_0
    //   114: lload_2
    //   115: putfield g1 : J
    //   118: aload_0
    //   119: getfield g1 : J
    //   122: ldc2_w 10000
    //   125: lcmp
    //   126: iflt -> 168
    //   129: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   132: ifeq -> 168
    //   135: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   138: astore #9
    //   140: aload #9
    //   142: ifnull -> 168
    //   145: aload #9
    //   147: invokevirtual A : ()I
    //   150: i2l
    //   151: aload_0
    //   152: getfield g1 : J
    //   155: ldc2_w 6000
    //   158: lsub
    //   159: lcmp
    //   160: ifge -> 168
    //   163: aload_0
    //   164: iconst_1
    //   165: putfield e1 : Z
    //   168: aload_0
    //   169: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   172: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   175: getfield Q : I
    //   178: iflt -> 187
    //   181: iconst_1
    //   182: istore #6
    //   184: goto -> 190
    //   187: iconst_0
    //   188: istore #6
    //   190: aload_0
    //   191: iload #6
    //   193: putfield f1 : Z
    //   196: goto -> 209
    //   199: aload_0
    //   200: iconst_0
    //   201: putfield e1 : Z
    //   204: aload_0
    //   205: iconst_0
    //   206: putfield f1 : Z
    //   209: aload_0
    //   210: getfield f1 : Z
    //   213: ifeq -> 434
    //   216: aload_0
    //   217: iconst_0
    //   218: putfield e1 : Z
    //   221: aload_0
    //   222: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   225: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   228: getfield Q : I
    //   231: ifle -> 239
    //   234: iconst_1
    //   235: istore_1
    //   236: goto -> 241
    //   239: iconst_0
    //   240: istore_1
    //   241: aload_0
    //   242: getfield b1 : Lcom/google/android/material/button/MaterialButton;
    //   245: astore #9
    //   247: iload_1
    //   248: ifeq -> 297
    //   251: aload #9
    //   253: aload #8
    //   255: iconst_4
    //   256: iaload
    //   257: invokevirtual setTextColor : (I)V
    //   260: aload_0
    //   261: getfield b1 : Lcom/google/android/material/button/MaterialButton;
    //   264: ldc_w '<small>A=</small>'
    //   267: aload_0
    //   268: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   271: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   274: getfield Q : I
    //   277: i2l
    //   278: l2i
    //   279: i2l
    //   280: iconst_0
    //   281: iconst_0
    //   282: invokestatic B : (JZI)Ljava/lang/String;
    //   285: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   288: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   291: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   294: goto -> 317
    //   297: aload #9
    //   299: aload #8
    //   301: bipush #6
    //   303: iaload
    //   304: invokevirtual setTextColor : (I)V
    //   307: aload_0
    //   308: getfield b1 : Lcom/google/android/material/button/MaterialButton;
    //   311: ldc_w 'A'
    //   314: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   317: aload_0
    //   318: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   321: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   324: invokevirtual I : ()Z
    //   327: istore #6
    //   329: aload_0
    //   330: getfield a1 : Lin/krosbits/android/widgets/SmartImageView;
    //   333: astore #9
    //   335: iload #6
    //   337: ifeq -> 394
    //   340: aload #9
    //   342: iconst_5
    //   343: invokevirtual setColorTintIndex : (I)V
    //   346: aload_0
    //   347: getfield c1 : Lcom/google/android/material/button/MaterialButton;
    //   350: aload #8
    //   352: iconst_4
    //   353: iaload
    //   354: invokevirtual setTextColor : (I)V
    //   357: aload_0
    //   358: getfield c1 : Lcom/google/android/material/button/MaterialButton;
    //   361: ldc_w '<small>B=</small>'
    //   364: aload_0
    //   365: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   368: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   371: getfield R : I
    //   374: i2l
    //   375: l2i
    //   376: i2l
    //   377: iconst_0
    //   378: iconst_0
    //   379: invokestatic B : (JZI)Ljava/lang/String;
    //   382: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   385: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   388: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   391: goto -> 423
    //   394: aload #9
    //   396: bipush #7
    //   398: invokevirtual setColorTintIndex : (I)V
    //   401: aload_0
    //   402: getfield c1 : Lcom/google/android/material/button/MaterialButton;
    //   405: aload #8
    //   407: bipush #6
    //   409: iaload
    //   410: invokevirtual setTextColor : (I)V
    //   413: aload_0
    //   414: getfield c1 : Lcom/google/android/material/button/MaterialButton;
    //   417: ldc_w 'B'
    //   420: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   423: aload_0
    //   424: getfield Y0 : Landroid/view/ViewGroup;
    //   427: iconst_0
    //   428: invokevirtual setVisibility : (I)V
    //   431: goto -> 443
    //   434: aload_0
    //   435: getfield Y0 : Landroid/view/ViewGroup;
    //   438: bipush #8
    //   440: invokevirtual setVisibility : (I)V
    //   443: aload_0
    //   444: getfield e1 : Z
    //   447: ifeq -> 506
    //   450: aload_0
    //   451: getfield Z0 : Landroid/widget/TextView;
    //   454: aload_0
    //   455: ldc_w 2131887216
    //   458: iconst_1
    //   459: anewarray java/lang/Object
    //   462: dup
    //   463: iconst_0
    //   464: aload_0
    //   465: getfield g1 : J
    //   468: l2i
    //   469: i2l
    //   470: iconst_0
    //   471: iconst_0
    //   472: invokestatic B : (JZI)Ljava/lang/String;
    //   475: aastore
    //   476: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   479: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   482: aload_0
    //   483: getfield K0 : Landroid/os/Handler;
    //   486: aload #7
    //   488: ldc2_w 6000
    //   491: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   494: pop
    //   495: aload_0
    //   496: getfield X0 : Landroid/view/ViewGroup;
    //   499: iconst_0
    //   500: invokevirtual setVisibility : (I)V
    //   503: goto -> 515
    //   506: aload_0
    //   507: getfield X0 : Landroid/view/ViewGroup;
    //   510: bipush #8
    //   512: invokevirtual setVisibility : (I)V
    //   515: aload_0
    //   516: getfield f1 : Z
    //   519: ifne -> 547
    //   522: aload_0
    //   523: getfield e1 : Z
    //   526: ifeq -> 532
    //   529: goto -> 547
    //   532: aload_0
    //   533: getfield W0 : Landroid/view/ViewGroup;
    //   536: bipush #8
    //   538: invokevirtual setVisibility : (I)V
    //   541: aload_0
    //   542: iconst_0
    //   543: invokevirtual a1 : (Z)V
    //   546: return
    //   547: aload_0
    //   548: getfield W0 : Landroid/view/ViewGroup;
    //   551: iconst_0
    //   552: invokevirtual setVisibility : (I)V
    //   555: aload_0
    //   556: iconst_1
    //   557: invokevirtual a1 : (Z)V
    //   560: return
    // Exception table:
    //   from	to	target	type
    //   93	100	106	finally
  }
  
  public final void W0() {
    SharedPreferences sharedPreferences = this.I0;
    boolean bool = true;
    int i = sharedPreferences.getInt("k_i_ffrwnp3", 1);
    if (i == 1) {
      bool = MusicService.a1;
    } else if (i != 2) {
      bool = false;
    } 
    SmartImageView smartImageView = this.w0;
    if (bool) {
      smartImageView.setVisibility(0);
      this.x0.setVisibility(0);
      this.k0.setContentDescription(T(2131886986));
      this.m0.setContentDescription(T(2131887124));
      this.k0.setOnTouchListener(null);
      this.m0.setOnTouchListener(null);
    } else {
      smartImageView.setVisibility(8);
      this.x0.setVisibility(8);
      this.k0.setContentDescription(T(2131886987));
      this.m0.setContentDescription(T(2131887125));
      this.k0.setOnTouchListener(this);
      this.m0.setOnTouchListener(this);
    } 
    if (this.s1 && bool) {
      this.p0.setVisibility(8);
      this.o0.setVisibility(8);
      return;
    } 
    this.p0.setVisibility(0);
    this.o0.setVisibility(0);
  }
  
  public final void X0() {
    SmartImageView smartImageView = this.z0;
    if (smartImageView != null) {
      if (this.E0 != null && this.M0 != null) {
        boolean bool = c81.c(P()).c(this.M0);
        smartImageView = this.z0;
        if (bool) {
          smartImageView.setImageResource(2131231058);
          return;
        } 
        smartImageView.setImageResource(2131231057);
        return;
      } 
      smartImageView.setImageResource(2131231057);
    } 
  }
  
  public final void Y0() {
    try {
      if (this.C0.getVisibility() != 0)
        return; 
      km0 km01 = this.M0;
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void Z0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean a() {
    return true;
  }
  
  public final void a1(boolean paramBoolean) {
    try {
      int i = (int)(P().getResources().getDimension(2131165390) * 48.0F);
      if ((P().getResources().getConfiguration()).orientation == 1) {
        LyricsView lyricsView = this.C0;
        if (!paramBoolean)
          i = 0; 
        lyricsView.setPadding(0, 0, 0, i);
      } 
    } finally {
      Exception exception;
    } 
  }
  
  public final boolean b() {
    return (Y() && this.E0.U.getCurrentItem() == 1 && this.C0.getVisibility() == 0);
  }
  
  public final void b0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null)
      M0(); 
  }
  
  public final void b1() {
    boolean bool;
    kj kj = kj.b(MyApplication.i.getApplicationContext());
    kj.getClass();
    n21.j();
    bl1 bl1 = kj.c;
    bl1.getClass();
    try {
      ff2 ff2 = bl1.a;
      Parcel parcel = ff2.u(ff2.o(), 8);
      bool = parcel.readInt();
      parcel.recycle();
    } catch (RemoteException remoteException) {
      bl1.c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "addCastStateListener", ff2.class.getSimpleName() });
      bool = true;
    } 
    c1(bool);
  }
  
  public final void c() {
    this.D0.setRefreshing(false);
    Handler handler = this.K0;
    if (handler != null)
      handler.postDelayed(new l3(10), 220L); 
  }
  
  public final void c1(int paramInt) {
    if (this.q1 && this.y1 != null) {
      if (iv0.i(this.x1, 3) || paramInt == 4 || paramInt == 3) {
        jj jj1;
        this.h1.setVisibility(0);
        this.y1.getClass();
        hv0 hv0 = iv0.g();
        if (ws2.U()) {
          jj1 = (jj)hv0.b();
        } else {
          jj1 = null;
        } 
        if (paramInt == 4 || !hv0.d() || jj1 != null) {
          boolean bool;
          ImageView imageView;
          jj1 = this.N1;
          if (jj1 != null)
            jj1.dismiss(); 
          try {
            bool = MusicService.P0.B0.b();
          } finally {
            jj1 = null;
            jj1.printStackTrace();
          } 
          paramInt = 2131231281;
        } else {
          ImageView imageView = this.i1;
          if (paramInt == 3) {
            imageView.setVisibility(8);
            paramInt = 2131231504;
          } else {
            imageView.setVisibility(8);
            paramInt = 2131231347;
          } 
        } 
        Drawable drawable = S().getDrawable(paramInt);
        this.h1.setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable)
          ((AnimationDrawable)drawable).start(); 
        return;
      } 
      this.h1.setVisibility(8);
      this.i1.setVisibility(8);
      return;
    } 
  }
  
  public final void d1() {
    boolean bool = ui0.O();
    int i = 2131231382;
    int j = 2131231381;
    if (bool) {
      j = ui0.B();
      if (j != 1)
        if (j != 2) {
          i = 2131231359;
        } else {
          i = 2131231381;
        }  
      this.q0.setImageResource(i);
      this.y0.setVisibility(8);
      this.r0.setVisibility(8);
    } else {
      int m = this.P0.getInt("RSM", 2);
      int k = this.P0.getInt("RQM", 2);
      if (m != 1) {
        if (m != 2) {
          if (m != 3)
            if (m != 4) {
              i = 0;
            } else {
              i = 2131231200;
            }  
        } else {
          i = 2131231359;
        } 
      } else {
        i = 2131231401;
      } 
      this.q0.setImageResource(i);
      if (k != 1) {
        if (k != 2) {
          i = j;
          if (k != 3)
            i = 0; 
        } else {
          i = 2131231358;
        } 
      } else {
        i = 2131231400;
      } 
      this.y0.setVisibility(0);
      this.r0.setVisibility(0);
      this.r0.setImageResource(i);
    } 
    bool = MusicService.C0;
    SmartImageView smartImageView = this.s0;
    if (bool) {
      smartImageView.setImageResource(2131231397);
      return;
    } 
    smartImageView.setImageResource(2131231399);
  }
  
  public final boolean e() {
    q42 q421 = this.L0;
    if (q421 != null && q421.isShowing()) {
      this.L0.dismiss();
      return true;
    } 
    return false;
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.K0 = new Handler();
    this.E0 = (MusicActivity)paramContext;
    this.I0 = paramContext.getSharedPreferences("PP", 0);
    this.P0 = P().getSharedPreferences("RPN", 0);
    this.H0 = this.I0.getBoolean("RCPOS", false);
    this.T0 = (int)(S().getDimension(2131165390) * 12.0F);
  }
  
  public final void e1() {
    boolean bool = this.I0.getBoolean("k_b_gcnp", true);
    SwipeToLoadLayout swipeToLoadLayout = this.D0;
    if (bool) {
      swipeToLoadLayout.setRefreshEnabled(true);
      this.D0.setLoadMoreEnabled(true);
      this.D0.setOnRefreshListener(this);
      this.D0.setOnLoadMoreListener(this);
      return;
    } 
    swipeToLoadLayout.setRefreshEnabled(false);
    this.D0.setLoadMoreEnabled(false);
    this.D0.setOnRefreshListener(null);
    this.D0.setOnLoadMoreListener(null);
  }
  
  public final boolean f() {
    try {
      MusicService musicService = MusicService.P0;
    } finally {
      Exception exception = null;
    } 
    return false;
  }
  
  public final void f1() {
    this.K0.post(new v71(this, 2));
  }
  
  public final void g(View paramView) {
    Slider slider = (Slider)paramView;
    this.G0 = false;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    boolean bool1;
    this.s1 = I0(P());
    Configuration configuration = P().getResources().getConfiguration();
    int i = configuration.orientation;
    boolean bool2 = true;
    if (i == 1 && (configuration.screenHeightDp < 512 || configuration.screenWidthDp < 300)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.t1 = bool1;
    configuration = P().getResources().getConfiguration();
    if (configuration.orientation == 1 && configuration.screenHeightDp < 790) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    this.u1 = bool1;
    View view = paramLayoutInflater.inflate(2131492987, paramViewGroup, false);
    int j = 2131297216;
    this.h1 = (ImageView)view.findViewById(2131297216);
    this.i1 = (ImageView)view.findViewById(2131296436);
    Object object = view.findViewById(2131297564);
    this.o1 = (ConstraintLayout)object;
    if ((SmartImageView)ws2.C((View)object, 2131296436) != null) {
      if ((MaterialButton)ws2.C((View)object, 2131296440) != null) {
        if ((MaterialButton)ws2.C((View)object, 2131296441) != null) {
          if ((CoordinatorLayout)ws2.C((View)object, 2131296603) != null) {
            Guideline guideline = (Guideline)ws2.C((View)object, 2131296780);
            i = 2131296794;
            if ((NestedHorizontalScrollView)ws2.C((View)object, 2131296794) != null)
              if ((SmartImageView)ws2.C((View)object, 2131296844) != null) {
                if ((ImageView)ws2.C((View)object, 2131296847) != null) {
                  SmartImageView smartImageView = (SmartImageView)ws2.C((View)object, 2131296856);
                  if (smartImageView != null) {
                    if ((SmartImageView)ws2.C((View)object, 2131296857) != null) {
                      if ((SmartImageView)ws2.C((View)object, 2131296858) != null) {
                        SmartImageView smartImageView1 = (SmartImageView)ws2.C((View)object, 2131296868);
                        if (smartImageView1 != null) {
                          SmartImageView smartImageView2 = (SmartImageView)ws2.C((View)object, 2131296869);
                          if (smartImageView2 != null) {
                            i = 2131296870;
                            if ((SmartImageView)ws2.C((View)object, 2131296870) != null) {
                              SmartImageView smartImageView3 = (SmartImageView)ws2.C((View)object, 2131296871);
                              if (smartImageView3 != null) {
                                i = 2131296875;
                                if ((SmartImageView)ws2.C((View)object, 2131296875) != null) {
                                  i = 2131296876;
                                  if ((SmartImageView)ws2.C((View)object, 2131296876) != null) {
                                    i = 2131296879;
                                    if ((SmartImageView)ws2.C((View)object, 2131296879) != null) {
                                      i = 2131296884;
                                      if ((SmartImageView)ws2.C((View)object, 2131296884) != null) {
                                        i = 2131296893;
                                        if ((SmartImageView)ws2.C((View)object, 2131296893) != null) {
                                          i = 2131296894;
                                          if ((SmartImageView)ws2.C((View)object, 2131296894) != null)
                                            if ((SmartImageView)ws2.C((View)object, 2131296897) != null) {
                                              SmartImageView smartImageView4 = (SmartImageView)ws2.C((View)object, 2131296901);
                                              if (smartImageView4 != null) {
                                                i = 2131296905;
                                                if ((SmartImageView)ws2.C((View)object, 2131296905) != null) {
                                                  i = 2131296915;
                                                  if ((SmartImageView)ws2.C((View)object, 2131296915) != null) {
                                                    i = 2131297006;
                                                    if ((LinearLayout)ws2.C((View)object, 2131297006) != null) {
                                                      i = 2131297013;
                                                      if ((LinearLayout)ws2.C((View)object, 2131297013) != null) {
                                                        i = 2131297046;
                                                        if ((LyricsView)ws2.C((View)object, 2131297046) != null) {
                                                          i = j;
                                                          if ((SmartImageView)ws2.C((View)object, 2131297216) != null) {
                                                            i = 2131297441;
                                                            if ((Slider)ws2.C((View)object, 2131297441) != null) {
                                                              i = 2131297462;
                                                              if ((Group)ws2.C((View)object, 2131297462) != null) {
                                                                i = 2131297685;
                                                                if ((PassScrollSmartTextView)ws2.C((View)object, 2131297685) != null) {
                                                                  i = 2131297692;
                                                                  if ((PassScrollSmartTextView)ws2.C((View)object, 2131297692) != null) {
                                                                    i = 2131297718;
                                                                    if ((SmartTextView)ws2.C((View)object, 2131297718) != null)
                                                                      if ((SmartTextView)ws2.C((View)object, 2131297740) != null) {
                                                                        MaterialButton materialButton = (MaterialButton)ws2.C((View)object, 2131297786);
                                                                        if (materialButton != null) {
                                                                          i = 2131297890;
                                                                          if ((PassScrollSmartTextView)ws2.C((View)object, 2131297890) != null)
                                                                            if (ws2.C((View)object, 2131297930) != null) {
                                                                              i = 2131297939;
                                                                              View view1 = ws2.C((View)object, 2131297939);
                                                                              if (view1 != null) {
                                                                                i = 2131296832;
                                                                                if ((SmartImageView)ws2.C(view1, 2131296832) != null) {
                                                                                  i = 2131296845;
                                                                                  if ((SmartImageView)ws2.C(view1, 2131296845) != null) {
                                                                                    i = 2131297679;
                                                                                    if ((MaterialButton)ws2.C(view1, 2131297679) != null) {
                                                                                      i = 2131297696;
                                                                                      if ((SmartTextView)ws2.C(view1, 2131297696) != null) {
                                                                                        i = 2131297699;
                                                                                        if ((MaterialButton)ws2.C(view1, 2131297699) != null) {
                                                                                          i = 2131297721;
                                                                                          if ((TextView)ws2.C(view1, 2131297721) != null) {
                                                                                            i = 2131297935;
                                                                                            if ((RelativeLayout)ws2.C(view1, 2131297935) != null) {
                                                                                              i = 2131297937;
                                                                                              if ((LinearLayout)ws2.C(view1, 2131297937) != null) {
                                                                                                FrameLayout frameLayout = (FrameLayout)view1;
                                                                                                object = new Object();
                                                                                                ((m2)object).a = smartImageView;
                                                                                                ((m2)object).c = smartImageView1;
                                                                                                ((m2)object).d = smartImageView2;
                                                                                                ((m2)object).e = smartImageView3;
                                                                                                ((m2)object).f = smartImageView4;
                                                                                                ((m2)object).b = materialButton;
                                                                                                this.j1 = (m2)object;
                                                                                                this.D0 = (SwipeToLoadLayout)view.findViewById(2131297561);
                                                                                                this.b0 = (Slider)view.findViewById(2131297441);
                                                                                                this.f0 = (SmartTextView)view.findViewById(2131297890);
                                                                                                this.g0 = (SmartTextView)view.findViewById(2131297685);
                                                                                                this.h0 = (SmartTextView)view.findViewById(2131297692);
                                                                                                this.A0 = (LinearLayout)view.findViewById(2131297006);
                                                                                                P0();
                                                                                                this.n0 = (SmartImageView)view.findViewById(2131296876);
                                                                                                this.j0 = (SmartTextView)view.findViewById(2131297718);
                                                                                                this.i0 = (SmartTextView)view.findViewById(2131297740);
                                                                                                this.B0 = (ImageView)view.findViewById(2131296847);
                                                                                                this.l0 = (SmartImageView)view.findViewById(2131296879);
                                                                                                this.k0 = (SmartImageView)view.findViewById(2131296875);
                                                                                                this.m0 = (SmartImageView)view.findViewById(2131296884);
                                                                                                this.s0 = (SmartImageView)view.findViewById(2131296905);
                                                                                                this.o0 = (SmartImageView)view.findViewById(2131296915);
                                                                                                this.p0 = (SmartImageView)view.findViewById(2131296857);
                                                                                                LinearLayout linearLayout = (LinearLayout)view.findViewById(2131297013);
                                                                                                this.O0 = linearLayout;
                                                                                                this.q0 = (SmartImageView)linearLayout.findViewById(2131296894);
                                                                                                this.y0 = this.O0.findViewById(2131297930);
                                                                                                this.r0 = (SmartImageView)this.O0.findViewById(2131296893);
                                                                                                this.t0 = (SmartImageView)view.findViewById(2131296856);
                                                                                                this.v0 = (SmartImageView)view.findViewById(2131296870);
                                                                                                this.u0 = (SmartImageView)view.findViewById(2131296844);
                                                                                                this.w0 = (SmartImageView)view.findViewById(2131296858);
                                                                                                this.x0 = (SmartImageView)view.findViewById(2131296897);
                                                                                                this.C0 = (LyricsView)view.findViewById(2131297046);
                                                                                                this.c0 = (MaterialButton)view.findViewById(2131296441);
                                                                                                this.d0 = (MaterialButton)view.findViewById(2131296440);
                                                                                                this.e0 = (Group)view.findViewById(2131297462);
                                                                                                this.a0 = view.findViewById(2131296603);
                                                                                                ViewGroup viewGroup = (ViewGroup)view.findViewById(2131297939);
                                                                                                this.W0 = viewGroup;
                                                                                                this.X0 = (ViewGroup)viewGroup.findViewById(2131297937);
                                                                                                this.Y0 = (ViewGroup)this.W0.findViewById(2131297935);
                                                                                                this.d1 = (ImageView)this.W0.findViewById(2131296845);
                                                                                                this.Z0 = (TextView)this.X0.findViewById(2131297696);
                                                                                                this.b1 = (MaterialButton)this.Y0.findViewById(2131297679);
                                                                                                this.a1 = (SmartImageView)this.Y0.findViewById(2131296832);
                                                                                                this.c1 = (MaterialButton)this.Y0.findViewById(2131297699);
                                                                                                this.C0.setSeekableOn(2);
                                                                                                J0(false);
                                                                                                i = (int)S().getDimension(2131165390);
                                                                                                SmartTextView smartTextView = this.h0;
                                                                                                i *= 5;
                                                                                                smartTextView.setCompoundDrawablePadding(i);
                                                                                                this.g0.setCompoundDrawablePadding(i);
                                                                                                D0();
                                                                                                e1();
                                                                                                this.b0.setLabelFormatter((nl0)new Object());
                                                                                                this.b0.b(this);
                                                                                                this.O0.setOnClickListener(this);
                                                                                                this.O0.setOnLongClickListener(this);
                                                                                                this.j0.setOnClickListener(this);
                                                                                                this.l0.setOnClickListener(this);
                                                                                                this.n0.setOnClickListener(this);
                                                                                                this.o0.setOnClickListener(this);
                                                                                                this.p0.setOnClickListener(this);
                                                                                                this.s0.setOnClickListener(this);
                                                                                                this.B0.setOnClickListener(this);
                                                                                                this.B0.setOnLongClickListener(this);
                                                                                                this.u0.setOnClickListener(this);
                                                                                                this.t0.setOnClickListener(this);
                                                                                                ((SmartImageView)this.j1.f).setOnClickListener(this);
                                                                                                ((SmartImageView)this.j1.d).setOnClickListener(this);
                                                                                                ((SmartImageView)this.j1.e).setOnClickListener(this);
                                                                                                ((SmartImageView)this.j1.c).setOnClickListener(this);
                                                                                                ((MaterialButton)this.j1.b).setOnClickListener(this);
                                                                                                this.v0.setOnClickListener(this);
                                                                                                this.w0.setOnClickListener(this);
                                                                                                this.x0.setOnClickListener(this);
                                                                                                this.g0.setOnClickListener(this);
                                                                                                this.h0.setOnClickListener(this);
                                                                                                this.f0.setOnClickListener(this);
                                                                                                this.C0.setOnClickListener(this);
                                                                                                this.d1.setOnClickListener(this);
                                                                                                this.b1.setOnClickListener(this);
                                                                                                this.c1.setOnClickListener(this);
                                                                                                this.a1.setOnClickListener(this);
                                                                                                this.Z0.setOnClickListener(this);
                                                                                                this.Y0.setOnClickListener(this);
                                                                                                this.k0.setOnClickListener(this);
                                                                                                this.m0.setOnClickListener(this);
                                                                                                this.d0.setOnClickListener(this);
                                                                                                this.c0.setOnClickListener(this);
                                                                                                this.l0.setOnLongClickListener(this);
                                                                                                this.w0.setOnLongClickListener(this);
                                                                                                this.x0.setOnLongClickListener(this);
                                                                                                this.b0.setOnTouchListener(this);
                                                                                                this.d0.setOnDragListener(this);
                                                                                                return view;
                                                                                              } 
                                                                                            } 
                                                                                          } 
                                                                                        } 
                                                                                      } 
                                                                                    } 
                                                                                  } 
                                                                                } 
                                                                                k91.h("Missing required view with ID: ".concat(view1.getResources().getResourceName(i)));
                                                                                return null;
                                                                              } 
                                                                            } else {
                                                                              i = 2131297930;
                                                                            }  
                                                                        } else {
                                                                          i = 2131297786;
                                                                        } 
                                                                      } else {
                                                                        i = 2131297740;
                                                                      }  
                                                                  } 
                                                                } 
                                                              } 
                                                            } 
                                                          } 
                                                        } 
                                                      } 
                                                    } 
                                                  } 
                                                } 
                                              } else {
                                                i = 2131296901;
                                              } 
                                            } else {
                                              i = 2131296897;
                                            }  
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } else {
                                i = 2131296871;
                              } 
                            } 
                          } else {
                            i = 2131296869;
                          } 
                        } else {
                          i = 2131296868;
                        } 
                      } else {
                        i = 2131296858;
                      } 
                    } else {
                      i = 2131296857;
                    } 
                  } else {
                    i = 2131296856;
                  } 
                } else {
                  i = 2131296847;
                } 
              } else {
                i = 2131296844;
              }  
          } else {
            i = 2131296603;
          } 
        } else {
          i = 2131296441;
        } 
      } else {
        i = 2131296440;
      } 
    } else {
      i = 2131296436;
    } 
    k91.h("Missing required view with ID: ".concat(object.getResources().getResourceName(i)));
    return null;
  }
  
  public final void g1() {
    this.M0 = null;
    StringBuilder stringBuilder = new StringBuilder("PFU:");
    stringBuilder.append(this.M0);
    n21.F(stringBuilder.toString());
    MusicActivity musicActivity = this.E0;
    if (musicActivity == null)
      return; 
    MusicService musicService = musicActivity.j0;
    int i = 2131231081;
    int j = 2131231076;
    if (musicService != null && MusicService.P0 != null) {
      km0 km01 = MusicService.y();
      this.M0 = km01;
      if (km01 != null) {
        StringBuilder stringBuilder1 = new StringBuilder("PFU?");
        stringBuilder1.append(this.M0.c.f);
        n21.F(stringBuilder1.toString());
        this.f0.setText(MusicService.X0);
        SmartTextView smartTextView = this.g0;
        String str = MusicService.Y0;
        if (!this.z1)
          j = 0; 
        F0(smartTextView, str, j);
        smartTextView = this.h0;
        str = MusicService.Z0;
        if (!this.z1)
          i = 0; 
        F0(smartTextView, str, i);
        this.i0.setText(ag0.B(this.M0.c.g, false, 0));
        ag0.z0(this.b0, 0.0F, this.M0.c.g, 0.0F);
        this.b0.setEnabled(true);
        Uri uri = p3.l(this.M0);
        ag1 ag1 = MyApplication.v.f(uri);
        ag1.d = true;
        ag1.c = true;
        ag1.b();
        ag1.f(this.B0);
        this.K0.post(new v71(this, 5));
        f1();
        X0();
        if (this.C0.getVisibility() == 0) {
          Y0();
        } else {
          MusicActivity musicActivity1 = this.E0;
          if (musicActivity1 != null)
            musicActivity1.N0(); 
        } 
        V0();
        W0();
        return;
      } 
    } 
    this.f0.setText(2131886999);
    SmartTextView smartTextView2 = this.g0;
    String str1 = T(2131887531);
    if (!this.z1)
      j = 0; 
    F0(smartTextView2, str1, j);
    SmartTextView smartTextView1 = this.h0;
    String str2 = T(2131887531);
    if (!this.z1)
      i = 0; 
    F0(smartTextView1, str2, i);
    this.i0.setText(ag0.B(0L, false, 0));
    ag0.z0(this.b0, 0.0F, 0.0F, 0.0F);
    this.b0.setEnabled(false);
    smartTextView1 = this.f0;
    int[] arrayOfInt = m92.h;
    smartTextView1.setTextColor(arrayOfInt[6]);
    this.j0.setTextColor(arrayOfInt[6]);
    this.i0.setTextColor(arrayOfInt[6]);
    this.l0.setColorTintIndex(6);
    this.m0.setColorTintIndex(6);
    this.k0.setColorTintIndex(6);
    this.b0.setTrackActiveTintList(ColorStateList.valueOf(arrayOfInt[6]));
    this.b0.setThumbTintList(ColorStateList.valueOf(ag0.g(arrayOfInt[2], arrayOfInt[6])));
    SmartImageView smartImageView = this.z0;
    if (smartImageView != null)
      smartImageView.setImageResource(2131231057); 
    this.l0.setImageResource(2131231063);
    MyApplication.v.a(this.B0);
    H0();
    this.B0.setImageDrawable(null);
    f1();
    Y0();
    V0();
    W0();
  }
  
  public final void h0() {
    q42 q421 = this.L0;
    if (q421 != null) {
      q421.h.removeCallbacks(q421.i);
      this.L0.dismiss();
    } 
    this.K0.removeCallbacks(Q1);
    this.K0.removeCallbacksAndMessages(null);
    this.K0 = null;
    this.E0 = null;
    this.j0 = null;
    this.f0 = null;
    this.i0 = null;
    this.h0 = null;
    this.g0 = null;
    jj jj1 = this.N1;
    if (jj1 != null)
      jj1.dismiss(); 
    this.I = true;
  }
  
  public final boolean h1(int paramInt) {
    int i;
    q42 q421 = this.L0;
    int j = 0;
    if (q421 != null && q421.isShowing()) {
      q421 = this.L0;
      AppCompatSeekBar appCompatSeekBar = q421.c;
      int m = appCompatSeekBar.getProgress();
      if (paramInt == 24) {
        j = m + 1;
        i = q421.g;
        paramInt = j;
        if (j > i)
          paramInt = i; 
      } else {
        i = m;
        if (paramInt == 25) {
          paramInt = m - 1;
          i = paramInt;
          if (paramInt < 0) {
            paramInt = j;
            appCompatSeekBar.setProgress(paramInt);
            SmartTextView smartTextView1 = q421.e;
            stringBuilder = new StringBuilder("");
            stringBuilder.append(paramInt);
            smartTextView1.setText(stringBuilder.toString());
            q421.f.setImageResource(ag0.X(paramInt, q421.g));
            q421.j.O0(paramInt);
            q421.b(paramInt);
            q421.a();
            return true;
          } 
        } 
        paramInt = i;
      } 
      stringBuilder.setProgress(paramInt);
      SmartTextView smartTextView = q421.e;
      StringBuilder stringBuilder = new StringBuilder("");
      stringBuilder.append(paramInt);
      smartTextView.setText(stringBuilder.toString());
      q421.f.setImageResource(ag0.X(paramInt, q421.g));
      q421.j.O0(paramInt);
      q421.b(paramInt);
      q421.a();
      return true;
    } 
    j = MyApplication.e().getStreamVolume(3);
    int k = MyApplication.e().getStreamMaxVolume(3);
    hc hc = MusicService.E0;
    if (hc instanceof fl) {
      int m = ((fl)hc).j0();
      ((fl)MusicService.E0).getClass();
      i = 20;
      j = m;
      k = i;
      if (m < 0) {
        j = 0;
        k = i;
      } 
    } 
    if (paramInt == 24) {
      paramInt = j + 1;
      i = paramInt;
      if (paramInt > k)
        i = k; 
    } else {
      i = j;
      if (paramInt == 25) {
        paramInt = j - 1;
        i = paramInt;
        if (paramInt < 0)
          i = 0; 
      } 
    } 
    O0(i);
    return false;
  }
  
  public final void i() {}
  
  public final float k() {
    try {
      if (MusicService.E0 != null && MusicService.P0 != null)
        return MusicService.E0.E(); 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void l() {
    H0();
  }
  
  public final void l0() {
    this.I = true;
  }
  
  public final void m(int paramInt) {
    try {
      Context context = P();
      Intent intent = new Intent();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void m0() {
    this.I = true;
    M0();
  }
  
  public final void n0(Bundle paramBundle) {
    mq0 mq01 = this.F0;
    boolean bool2 = false;
    if (mq01 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    paramBundle.putBoolean("lrcsrc", bool1);
    boolean bool1 = bool2;
    if (this.C0.getVisibility() == 0)
      bool1 = true; 
    paramBundle.putBoolean("islrcv", bool1);
  }
  
  public final void o0() {
    this.I = true;
    if (ag0.d0(false) && !this.q1) {
      this.y1 = iv0.d(MyApplication.i.getApplicationContext());
      this.h1.setOnClickListener(this);
      this.i1.setOnClickListener(this);
      this.q1 = true;
    } 
    if (this.q1) {
      if (this.y1 != null) {
        kj kj = kj.b(MyApplication.i.getApplicationContext());
        cv0 cv01 = kj.a();
        if (cv01 != null) {
          ArrayList<String> arrayList;
          cv01.a();
          if (!cv01.b.isEmpty()) {
            ArrayList arrayList1 = new ArrayList(cv01.b);
          } else {
            cv01 = null;
          } 
          cv0 cv03 = cv01;
          if (cv01 == null)
            arrayList = new ArrayList(); 
          if (!arrayList.contains("android.media.intent.category.LIVE_AUDIO"))
            arrayList.add("android.media.intent.category.LIVE_AUDIO"); 
          Bundle bundle = new Bundle();
          bundle.putStringArrayList("controlCategories", arrayList);
          cv0 cv02 = new cv0(bundle, arrayList);
          this.x1 = cv02;
          this.y1.a(cv02, this.p1, 8);
          n21.j();
          w71 w711 = this.L1;
          n21.m(w711);
          bl1 bl1 = kj.c;
          bl1.getClass();
          try {
            ff2 ff2 = bl1.a;
            dc2 dc2 = new dc2();
            this(w711);
            Parcel parcel = ff2.o();
            mh2.c(parcel, dc2);
            ff2.o0(parcel, 4);
          } catch (RemoteException remoteException) {
            rp0 rp0 = bl1.c;
            String str = ff2.class.getSimpleName();
            rp0.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { tlzLOCPTHRhep.zehEd, str });
          } 
        } else {
          l0.l("selector must not be null");
          return;
        } 
      } 
      b1();
    } 
  }
  
  public final void onClick(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield J0 : Lss0;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnull -> 31
    //   11: aload #8
    //   13: invokevirtual isShowing : ()Z
    //   16: ifeq -> 31
    //   19: aload_0
    //   20: getfield J0 : Lss0;
    //   23: invokevirtual dismiss : ()V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield J0 : Lss0;
    //   31: aload_0
    //   32: getfield N0 : Z
    //   35: istore #5
    //   37: iconst_0
    //   38: istore #4
    //   40: iconst_0
    //   41: istore_2
    //   42: iload #5
    //   44: ifeq -> 53
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield N0 : Z
    //   52: return
    //   53: aload_1
    //   54: invokevirtual getId : ()I
    //   57: istore_3
    //   58: iload_3
    //   59: ldc_w 2131297718
    //   62: if_icmpne -> 106
    //   65: aload_0
    //   66: aload_0
    //   67: getfield H0 : Z
    //   70: iconst_1
    //   71: ixor
    //   72: putfield H0 : Z
    //   75: aload_0
    //   76: getfield I0 : Landroid/content/SharedPreferences;
    //   79: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   84: ldc_w 'RCPOS'
    //   87: aload_0
    //   88: getfield H0 : Z
    //   91: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   96: invokeinterface apply : ()V
    //   101: aload_0
    //   102: invokevirtual f1 : ()V
    //   105: return
    //   106: iload_3
    //   107: ldc_w 2131296879
    //   110: if_icmpne -> 179
    //   113: aload_0
    //   114: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   117: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   120: astore_1
    //   121: aload_1
    //   122: ifnull -> 4365
    //   125: aload_0
    //   126: getfield M0 : Lkm0;
    //   129: ifnull -> 141
    //   132: aload_1
    //   133: iconst_0
    //   134: anewarray java/lang/Integer
    //   137: invokevirtual X : ([Ljava/lang/Integer;)V
    //   140: return
    //   141: aload_0
    //   142: invokevirtual P : ()Landroid/content/Context;
    //   145: new android/content/Intent
    //   148: dup
    //   149: aload_0
    //   150: invokevirtual P : ()Landroid/content/Context;
    //   153: ldc_w in/krosbits/musicolet/MusicService
    //   156: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   159: ldc_w 'ACT_MID'
    //   162: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   165: ldc_w 'EXT_MID'
    //   168: ldc_w 'musicolet.media.r.2'
    //   171: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   174: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   177: pop
    //   178: return
    //   179: iload_3
    //   180: ldc_w 2131296875
    //   183: if_icmpne -> 204
    //   186: aload_0
    //   187: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   190: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   193: astore_1
    //   194: aload_1
    //   195: ifnull -> 4365
    //   198: aload_1
    //   199: invokevirtual W : ()Z
    //   202: pop
    //   203: return
    //   204: iload_3
    //   205: ldc_w 2131296884
    //   208: if_icmpne -> 228
    //   211: aload_0
    //   212: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   215: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   218: astore_1
    //   219: aload_1
    //   220: ifnull -> 4365
    //   223: aload_1
    //   224: invokevirtual Y : ()V
    //   227: return
    //   228: iload_3
    //   229: ldc_w 2131297685
    //   232: if_icmpne -> 267
    //   235: aload_0
    //   236: getfield M0 : Lkm0;
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull -> 4365
    //   244: aload_1
    //   245: getfield b : I
    //   248: istore_2
    //   249: aload_1
    //   250: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   253: getfield c : Llm0;
    //   256: getfield D : I
    //   259: invokevirtual m : (I)Ljava/lang/String;
    //   262: iload_2
    //   263: invokestatic G0 : (Ljava/lang/String;I)V
    //   266: return
    //   267: iload_3
    //   268: ldc_w 2131297692
    //   271: if_icmpne -> 299
    //   274: aload_0
    //   275: getfield M0 : Lkm0;
    //   278: astore_1
    //   279: aload_1
    //   280: ifnull -> 4365
    //   283: aload_1
    //   284: getfield b : I
    //   287: iconst_0
    //   288: aload_1
    //   289: getfield c : Lqn1;
    //   292: getfield e : Ljava/lang/String;
    //   295: invokestatic H0 : (IILjava/lang/String;)V
    //   298: return
    //   299: iload_3
    //   300: ldc_w 2131297033
    //   303: if_icmpeq -> 4344
    //   306: iload_3
    //   307: ldc_w 2131297890
    //   310: if_icmpne -> 316
    //   313: goto -> 4344
    //   316: iload_3
    //   317: ldc_w 2131297023
    //   320: if_icmpne -> 335
    //   323: aload_0
    //   324: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   327: aload_0
    //   328: getfield M0 : Lkm0;
    //   331: invokestatic v0 : (Landroid/app/Activity;Lkm0;)V
    //   334: return
    //   335: iload_3
    //   336: ldc_w 2131297025
    //   339: if_icmpne -> 372
    //   342: aload_0
    //   343: getfield M0 : Lkm0;
    //   346: ifnull -> 4365
    //   349: new java/util/ArrayList
    //   352: dup
    //   353: iconst_1
    //   354: invokespecial <init> : (I)V
    //   357: astore_1
    //   358: aload_1
    //   359: aload_0
    //   360: getfield M0 : Lkm0;
    //   363: invokevirtual add : (Ljava/lang/Object;)Z
    //   366: pop
    //   367: aload_1
    //   368: invokestatic D0 : (Ljava/util/ArrayList;)V
    //   371: return
    //   372: iload_3
    //   373: ldc_w 2131296859
    //   376: if_icmpne -> 542
    //   379: aload_0
    //   380: getfield M0 : Lkm0;
    //   383: ifnull -> 4365
    //   386: aload_0
    //   387: invokevirtual P : ()Landroid/content/Context;
    //   390: invokestatic c : (Landroid/content/Context;)Lb81;
    //   393: aload_0
    //   394: getfield M0 : Lkm0;
    //   397: invokevirtual a : (Lkm0;)Z
    //   400: ifne -> 436
    //   403: aload_0
    //   404: invokevirtual P : ()Landroid/content/Context;
    //   407: invokestatic c : (Landroid/content/Context;)Lb81;
    //   410: aload_0
    //   411: getfield M0 : Lkm0;
    //   414: invokevirtual f : (Lkm0;)V
    //   417: aload_0
    //   418: getfield z0 : Lin/krosbits/android/widgets/SmartImageView;
    //   421: astore_1
    //   422: aload_1
    //   423: ifnull -> 452
    //   426: aload_1
    //   427: ldc_w 2131231057
    //   430: invokevirtual setImageResource : (I)V
    //   433: goto -> 452
    //   436: aload_0
    //   437: getfield z0 : Lin/krosbits/android/widgets/SmartImageView;
    //   440: astore_1
    //   441: aload_1
    //   442: ifnull -> 452
    //   445: aload_1
    //   446: ldc_w 2131231058
    //   449: invokevirtual setImageResource : (I)V
    //   452: invokestatic j : ()V
    //   455: aload_0
    //   456: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   459: getfield e0 : Ll81;
    //   462: astore_1
    //   463: aload_1
    //   464: ifnull -> 525
    //   467: aload_1
    //   468: invokevirtual Y : ()Z
    //   471: ifeq -> 525
    //   474: aload_0
    //   475: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   478: getfield e0 : Ll81;
    //   481: astore_1
    //   482: aload_1
    //   483: getfield C0 : Z
    //   486: ifeq -> 525
    //   489: aload_1
    //   490: getfield a0 : I
    //   493: iconst_1
    //   494: if_icmpne -> 525
    //   497: aload_1
    //   498: invokevirtual N0 : ()V
    //   501: aload_0
    //   502: invokevirtual P : ()Landroid/content/Context;
    //   505: invokestatic c : (Landroid/content/Context;)Lb81;
    //   508: invokevirtual d : ()Z
    //   511: ifeq -> 525
    //   514: aload_0
    //   515: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   518: getfield e0 : Ll81;
    //   521: invokevirtual e : ()Z
    //   524: pop
    //   525: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   528: astore_1
    //   529: aload_1
    //   530: ifnull -> 538
    //   533: aload_1
    //   534: iconst_0
    //   535: invokevirtual b0 : (Z)V
    //   538: invokestatic M0 : ()V
    //   541: return
    //   542: iload_3
    //   543: ldc_w 2131296876
    //   546: if_icmpne -> 1191
    //   549: aload_0
    //   550: getfield M0 : Lkm0;
    //   553: ifnull -> 4365
    //   556: aload_0
    //   557: invokevirtual P : ()Landroid/content/Context;
    //   560: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   563: ldc_w 2131493017
    //   566: aconst_null
    //   567: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   570: astore #8
    //   572: aload #8
    //   574: ldc_w 2131296973
    //   577: invokevirtual findViewById : (I)Landroid/view/View;
    //   580: checkcast android/widget/LinearLayout
    //   583: astore #9
    //   585: aload_0
    //   586: getfield B0 : Landroid/widget/ImageView;
    //   589: invokevirtual getVisibility : ()I
    //   592: ifne -> 621
    //   595: aload #9
    //   597: ldc_w 2131297868
    //   600: invokevirtual findViewById : (I)Landroid/view/View;
    //   603: ldc_w 2131297868
    //   606: invokevirtual findViewById : (I)Landroid/view/View;
    //   609: checkcast android/widget/TextView
    //   612: ldc_w 2131887376
    //   615: invokevirtual setText : (I)V
    //   618: goto -> 644
    //   621: aload #9
    //   623: ldc_w 2131297868
    //   626: invokevirtual findViewById : (I)Landroid/view/View;
    //   629: ldc_w 2131297868
    //   632: invokevirtual findViewById : (I)Landroid/view/View;
    //   635: checkcast android/widget/TextView
    //   638: ldc_w 2131886659
    //   641: invokevirtual setText : (I)V
    //   644: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   647: astore_1
    //   648: aload_1
    //   649: ifnull -> 659
    //   652: aload_1
    //   653: invokevirtual w : ()Z
    //   656: ifne -> 672
    //   659: aload #9
    //   661: ldc_w 2131297823
    //   664: invokevirtual findViewById : (I)Landroid/view/View;
    //   667: bipush #8
    //   669: invokevirtual setVisibility : (I)V
    //   672: invokestatic U : ()Z
    //   675: ifne -> 690
    //   678: getstatic in/krosbits/musicolet/MyApplication.g : Z
    //   681: ifne -> 690
    //   684: getstatic in/krosbits/musicolet/MyApplication.h : Z
    //   687: ifeq -> 822
    //   690: aload #9
    //   692: ldc_w 2131296989
    //   695: invokevirtual findViewById : (I)Landroid/view/View;
    //   698: checkcast in/krosbits/android/widgets/SmartTextView
    //   701: astore #11
    //   703: aload #11
    //   705: iconst_0
    //   706: invokevirtual setVisibility : (I)V
    //   709: invokestatic U : ()Z
    //   712: ifeq -> 796
    //   715: invokestatic Q : ()Ljava/lang/String;
    //   718: astore #10
    //   720: new java/lang/StringBuilder
    //   723: dup
    //   724: invokespecial <init> : ()V
    //   727: astore_1
    //   728: aload_1
    //   729: aload_0
    //   730: ldc_w 2131887129
    //   733: invokevirtual T : (I)Ljava/lang/String;
    //   736: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: pop
    //   740: aload_1
    //   741: ldc_w ' <small>'
    //   744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: pop
    //   748: aload_1
    //   749: aload #10
    //   751: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   754: pop
    //   755: aload_1
    //   756: ldc_w '</small>'
    //   759: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   762: pop
    //   763: aload #11
    //   765: aload_1
    //   766: invokevirtual toString : ()Ljava/lang/String;
    //   769: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   772: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   775: aload #11
    //   777: aload_0
    //   778: invokevirtual S : ()Landroid/content/res/Resources;
    //   781: ldc_w 2131231111
    //   784: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   787: aconst_null
    //   788: aconst_null
    //   789: aconst_null
    //   790: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   793: goto -> 822
    //   796: aload #11
    //   798: ldc_w 2131886632
    //   801: invokevirtual setText : (I)V
    //   804: aload #11
    //   806: aload_0
    //   807: invokevirtual S : ()Landroid/content/res/Resources;
    //   810: ldc_w 2131231096
    //   813: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   816: aconst_null
    //   817: aconst_null
    //   818: aconst_null
    //   819: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   822: invokestatic U : ()Z
    //   825: ifne -> 841
    //   828: aload #9
    //   830: ldc_w 2131297014
    //   833: invokevirtual findViewById : (I)Landroid/view/View;
    //   836: bipush #8
    //   838: invokevirtual setVisibility : (I)V
    //   841: invokestatic U : ()Z
    //   844: ifeq -> 854
    //   847: aload_0
    //   848: getfield q1 : Z
    //   851: ifne -> 867
    //   854: aload #9
    //   856: ldc_w 2131296962
    //   859: invokevirtual findViewById : (I)Landroid/view/View;
    //   862: bipush #8
    //   864: invokevirtual setVisibility : (I)V
    //   867: aload #9
    //   869: ldc_w 2131297717
    //   872: invokevirtual findViewById : (I)Landroid/view/View;
    //   875: checkcast android/widget/TextView
    //   878: astore #10
    //   880: invokestatic U : ()Z
    //   883: ifeq -> 972
    //   886: invokestatic o : ()Landroid/content/SharedPreferences;
    //   889: getstatic com/google/android/gms/cast/framework/internal/featurehighlight/aS/xveccWbRzqx.WIMUG : Ljava/lang/String;
    //   892: iconst_0
    //   893: invokeinterface getInt : (Ljava/lang/String;I)I
    //   898: istore_2
    //   899: iload_2
    //   900: ifne -> 914
    //   903: aload_0
    //   904: ldc_w 2131886134
    //   907: invokevirtual T : (I)Ljava/lang/String;
    //   910: astore_1
    //   911: goto -> 921
    //   914: iconst_3
    //   915: iload_2
    //   916: i2l
    //   917: invokestatic u : (IJ)Ljava/lang/String;
    //   920: astore_1
    //   921: new java/lang/StringBuilder
    //   924: dup
    //   925: invokespecial <init> : ()V
    //   928: astore #11
    //   930: aload #11
    //   932: aload_0
    //   933: ldc_w 2131886415
    //   936: invokevirtual T : (I)Ljava/lang/String;
    //   939: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   942: pop
    //   943: aload #11
    //   945: ldc_w ': '
    //   948: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   951: pop
    //   952: aload #11
    //   954: aload_1
    //   955: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: pop
    //   959: aload #10
    //   961: aload #11
    //   963: invokevirtual toString : ()Ljava/lang/String;
    //   966: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   969: goto -> 979
    //   972: aload #10
    //   974: bipush #8
    //   976: invokevirtual setVisibility : (I)V
    //   979: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   982: getfield c : Llm0;
    //   985: getfield I : Z
    //   988: ifeq -> 1064
    //   991: aload #9
    //   993: ldc_w 2131296411
    //   996: invokevirtual findViewById : (I)Landroid/view/View;
    //   999: checkcast android/widget/TextView
    //   1002: astore #10
    //   1004: new java/lang/StringBuilder
    //   1007: dup
    //   1008: invokespecial <init> : ()V
    //   1011: astore_1
    //   1012: aload_1
    //   1013: aload_0
    //   1014: ldc_w 2131886842
    //   1017: invokevirtual T : (I)Ljava/lang/String;
    //   1020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1023: pop
    //   1024: aload_1
    //   1025: ldc_w ' <small>✶</small> '
    //   1028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: pop
    //   1032: aload_1
    //   1033: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1036: getfield c : Llm0;
    //   1039: getfield L : Ljava/lang/String;
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: pop
    //   1046: aload #10
    //   1048: aload_1
    //   1049: invokevirtual toString : ()Ljava/lang/String;
    //   1052: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   1055: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1058: aload #10
    //   1060: iconst_0
    //   1061: invokevirtual setVisibility : (I)V
    //   1064: aload #9
    //   1066: aload_0
    //   1067: getstatic a51.o : Ljava/util/HashMap;
    //   1070: invokestatic x0 : (Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;Ljava/util/HashMap;)V
    //   1073: aload #9
    //   1075: ldc_w 2131296859
    //   1078: invokevirtual findViewById : (I)Landroid/view/View;
    //   1081: checkcast in/krosbits/android/widgets/SmartTextView
    //   1084: astore_1
    //   1085: aload_1
    //   1086: ifnull -> 1153
    //   1089: aload_1
    //   1090: invokevirtual getVisibility : ()I
    //   1093: ifne -> 1153
    //   1096: aload_0
    //   1097: invokevirtual P : ()Landroid/content/Context;
    //   1100: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1103: aload_0
    //   1104: getfield M0 : Lkm0;
    //   1107: invokevirtual c : (Lkm0;)Z
    //   1110: ifeq -> 1127
    //   1113: aload_1
    //   1114: ldc_w 2131887162
    //   1117: invokevirtual setText : (I)V
    //   1120: ldc_w 2131231057
    //   1123: istore_2
    //   1124: goto -> 1138
    //   1127: aload_1
    //   1128: ldc_w 2131886123
    //   1131: invokevirtual setText : (I)V
    //   1134: ldc_w 2131231058
    //   1137: istore_2
    //   1138: aload_1
    //   1139: aload_0
    //   1140: invokevirtual S : ()Landroid/content/res/Resources;
    //   1143: iload_2
    //   1144: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   1147: aconst_null
    //   1148: aconst_null
    //   1149: aconst_null
    //   1150: invokevirtual setCompoundDrawables : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1153: new ms0
    //   1156: dup
    //   1157: aload_0
    //   1158: invokevirtual P : ()Landroid/content/Context;
    //   1161: invokespecial <init> : (Landroid/content/Context;)V
    //   1164: astore_1
    //   1165: aload_1
    //   1166: aload #8
    //   1168: iconst_0
    //   1169: invokevirtual f : (Landroid/view/View;Z)V
    //   1172: new ss0
    //   1175: dup
    //   1176: aload_1
    //   1177: invokespecial <init> : (Lms0;)V
    //   1180: astore_1
    //   1181: aload_0
    //   1182: aload_1
    //   1183: putfield J0 : Lss0;
    //   1186: aload_1
    //   1187: invokevirtual show : ()V
    //   1190: return
    //   1191: iload_3
    //   1192: ldc_w 2131296978
    //   1195: if_icmpne -> 1253
    //   1198: aload_0
    //   1199: getfield M0 : Lkm0;
    //   1202: ifnull -> 4365
    //   1205: new java/util/ArrayList
    //   1208: dup
    //   1209: iconst_1
    //   1210: invokespecial <init> : (I)V
    //   1213: astore #9
    //   1215: aload #9
    //   1217: aload_0
    //   1218: getfield M0 : Lkm0;
    //   1221: invokevirtual add : (Ljava/lang/Object;)Z
    //   1224: pop
    //   1225: aload_0
    //   1226: invokevirtual P : ()Landroid/content/Context;
    //   1229: astore_1
    //   1230: getstatic lm0.M : Ljava/util/Calendar;
    //   1233: astore #8
    //   1235: aload_1
    //   1236: aload #9
    //   1238: iconst_0
    //   1239: anewarray km0
    //   1242: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1245: checkcast [Lkm0;
    //   1248: iconst_1
    //   1249: invokestatic j : (Landroid/content/Context;[Lkm0;Z)V
    //   1252: return
    //   1253: iload_3
    //   1254: ldc_w 2131296983
    //   1257: if_icmpne -> 1308
    //   1260: aload_0
    //   1261: getfield M0 : Lkm0;
    //   1264: ifnull -> 4365
    //   1267: new java/util/ArrayList
    //   1270: dup
    //   1271: iconst_1
    //   1272: invokespecial <init> : (I)V
    //   1275: astore_1
    //   1276: aload_1
    //   1277: aload_0
    //   1278: getfield M0 : Lkm0;
    //   1281: invokevirtual add : (Ljava/lang/Object;)Z
    //   1284: pop
    //   1285: aload_1
    //   1286: putstatic in/krosbits/musicolet/Tag2Activity.L1 : Ljava/util/ArrayList;
    //   1289: aload_0
    //   1290: new android/content/Intent
    //   1293: dup
    //   1294: aload_0
    //   1295: invokevirtual P : ()Landroid/content/Context;
    //   1298: ldc_w in/krosbits/musicolet/Tag2Activity
    //   1301: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1304: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1307: return
    //   1308: iload_3
    //   1309: ldc_w 2131296967
    //   1312: if_icmpne -> 1360
    //   1315: aload_0
    //   1316: getfield M0 : Lkm0;
    //   1319: ifnull -> 4365
    //   1322: aload_0
    //   1323: new android/content/Intent
    //   1326: dup
    //   1327: aload_0
    //   1328: invokevirtual P : ()Landroid/content/Context;
    //   1331: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1334: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1337: ldc_w 'A_BKMS'
    //   1340: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1343: ldc_w 'E_1_SRI'
    //   1346: aload_0
    //   1347: getfield M0 : Lkm0;
    //   1350: getfield b : I
    //   1353: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   1356: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1359: return
    //   1360: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.dfdEqpBbeDy : Ljava/lang/String;
    //   1363: astore #9
    //   1365: iload_3
    //   1366: ldc_w 2131297014
    //   1369: if_icmpne -> 1406
    //   1372: aload_0
    //   1373: new android/content/Intent
    //   1376: dup
    //   1377: aload_0
    //   1378: invokevirtual P : ()Landroid/content/Context;
    //   1381: ldc_w in/krosbits/musicolet/SettingsActivity
    //   1384: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1387: aload #9
    //   1389: iconst_1
    //   1390: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   1393: ldc_w 'jmparg'
    //   1396: ldc_w 'rgp_'
    //   1399: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1402: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1405: return
    //   1406: iload_3
    //   1407: ldc_w 2131296991
    //   1410: if_icmpne -> 1469
    //   1413: aload_0
    //   1414: getfield M0 : Lkm0;
    //   1417: ifnull -> 4365
    //   1420: new java/util/ArrayList
    //   1423: dup
    //   1424: iconst_1
    //   1425: invokespecial <init> : (I)V
    //   1428: astore #8
    //   1430: aload #8
    //   1432: aload_0
    //   1433: getfield M0 : Lkm0;
    //   1436: invokevirtual add : (Ljava/lang/Object;)Z
    //   1439: pop
    //   1440: aload_0
    //   1441: invokevirtual P : ()Landroid/content/Context;
    //   1444: astore #9
    //   1446: getstatic lm0.M : Ljava/util/Calendar;
    //   1449: astore_1
    //   1450: aload #9
    //   1452: aload #8
    //   1454: iconst_0
    //   1455: anewarray km0
    //   1458: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1461: checkcast [Lkm0;
    //   1464: iconst_1
    //   1465: invokestatic h0 : (Landroid/content/Context;[Lkm0;Z)V
    //   1468: return
    //   1469: iload_3
    //   1470: ldc_w 2131296975
    //   1473: if_icmpne -> 1530
    //   1476: aload_0
    //   1477: getfield M0 : Lkm0;
    //   1480: ifnull -> 4365
    //   1483: new java/util/ArrayList
    //   1486: dup
    //   1487: iconst_1
    //   1488: invokespecial <init> : (I)V
    //   1491: astore #9
    //   1493: aload #9
    //   1495: aload_0
    //   1496: getfield M0 : Lkm0;
    //   1499: invokevirtual add : (Ljava/lang/Object;)Z
    //   1502: pop
    //   1503: aload_0
    //   1504: invokevirtual P : ()Landroid/content/Context;
    //   1507: astore_1
    //   1508: getstatic lm0.M : Ljava/util/Calendar;
    //   1511: astore #8
    //   1513: aload_1
    //   1514: aload #9
    //   1516: iconst_0
    //   1517: anewarray km0
    //   1520: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1523: checkcast [Lkm0;
    //   1526: invokestatic h : (Landroid/content/Context;[Lkm0;)V
    //   1529: return
    //   1530: iload_3
    //   1531: ldc_w 2131296953
    //   1534: if_icmpne -> 1615
    //   1537: aload_0
    //   1538: getfield M0 : Lkm0;
    //   1541: ifnull -> 4365
    //   1544: new java/util/ArrayList
    //   1547: dup
    //   1548: iconst_1
    //   1549: invokespecial <init> : (I)V
    //   1552: astore_1
    //   1553: aload_1
    //   1554: aload_0
    //   1555: getfield M0 : Lkm0;
    //   1558: invokevirtual add : (Ljava/lang/Object;)Z
    //   1561: pop
    //   1562: aload_0
    //   1563: invokevirtual P : ()Landroid/content/Context;
    //   1566: astore #8
    //   1568: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1571: istore #4
    //   1573: new tk
    //   1576: dup
    //   1577: aload #8
    //   1579: invokestatic h : ()Lwk1;
    //   1582: getfield b : Ljava/util/Stack;
    //   1585: invokestatic h : ()Lwk1;
    //   1588: getfield c : I
    //   1591: new vn
    //   1594: dup
    //   1595: bipush #10
    //   1597: aload_0
    //   1598: aload_1
    //   1599: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   1602: invokespecial <init> : (Landroid/content/Context;Ljava/util/Stack;ILzy;)V
    //   1605: getfield f : Ljava/lang/Object;
    //   1608: checkcast ss0
    //   1611: invokevirtual show : ()V
    //   1614: return
    //   1615: iload_3
    //   1616: ldc_w 2131296951
    //   1619: if_icmpne -> 1676
    //   1622: aload_0
    //   1623: getfield M0 : Lkm0;
    //   1626: ifnull -> 4365
    //   1629: new java/util/ArrayList
    //   1632: dup
    //   1633: iconst_1
    //   1634: invokespecial <init> : (I)V
    //   1637: astore_1
    //   1638: aload_1
    //   1639: putstatic in/krosbits/musicolet/GhostSearchActivity.f0 : Ljava/util/ArrayList;
    //   1642: aload_1
    //   1643: aload_0
    //   1644: getfield M0 : Lkm0;
    //   1647: invokevirtual add : (Ljava/lang/Object;)Z
    //   1650: pop
    //   1651: aload_0
    //   1652: new android/content/Intent
    //   1655: dup
    //   1656: aload_0
    //   1657: invokevirtual P : ()Landroid/content/Context;
    //   1660: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1663: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1666: ldc_w 'A_ADTPL'
    //   1669: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1672: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1675: return
    //   1676: iload_3
    //   1677: ldc_w 2131297019
    //   1680: if_icmpne -> 1969
    //   1683: new android/graphics/Rect
    //   1686: dup
    //   1687: invokespecial <init> : ()V
    //   1690: astore #11
    //   1692: new android/graphics/Rect
    //   1695: dup
    //   1696: invokespecial <init> : ()V
    //   1699: astore #10
    //   1701: aload_0
    //   1702: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   1705: astore #8
    //   1707: getstatic ag0.a : Ljava/lang/String;
    //   1710: astore_1
    //   1711: aload #8
    //   1713: invokevirtual getWindow : ()Landroid/view/Window;
    //   1716: invokevirtual getDecorView : ()Landroid/view/View;
    //   1719: astore #8
    //   1721: aload #8
    //   1723: invokevirtual isDrawingCacheEnabled : ()Z
    //   1726: istore #4
    //   1728: aload #8
    //   1730: iconst_1
    //   1731: invokevirtual setDrawingCacheEnabled : (Z)V
    //   1734: aload #8
    //   1736: invokevirtual getDrawingCache : ()Landroid/graphics/Bitmap;
    //   1739: invokestatic createBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   1742: astore_1
    //   1743: aload #8
    //   1745: iload #4
    //   1747: invokevirtual setDrawingCacheEnabled : (Z)V
    //   1750: aload #8
    //   1752: aload #11
    //   1754: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   1757: pop
    //   1758: getstatic v22.a : Ljava/util/WeakHashMap;
    //   1761: astore #9
    //   1763: aload #8
    //   1765: invokestatic a : (Landroid/view/View;)Lx62;
    //   1768: astore #8
    //   1770: aload #8
    //   1772: ifnull -> 1857
    //   1775: aload #8
    //   1777: getfield a : Lu62;
    //   1780: sipush #519
    //   1783: invokevirtual h : (I)Lfi0;
    //   1786: astore #8
    //   1788: aload #8
    //   1790: ifnull -> 1857
    //   1793: aload #10
    //   1795: aload #11
    //   1797: getfield left : I
    //   1800: aload #8
    //   1802: getfield a : I
    //   1805: iadd
    //   1806: putfield left : I
    //   1809: aload #10
    //   1811: aload #11
    //   1813: getfield top : I
    //   1816: aload #8
    //   1818: getfield b : I
    //   1821: iadd
    //   1822: putfield top : I
    //   1825: aload #10
    //   1827: aload #11
    //   1829: getfield right : I
    //   1832: aload #8
    //   1834: getfield c : I
    //   1837: isub
    //   1838: putfield right : I
    //   1841: aload #10
    //   1843: aload #11
    //   1845: getfield bottom : I
    //   1848: aload #8
    //   1850: getfield d : I
    //   1853: isub
    //   1854: putfield bottom : I
    //   1857: goto -> 1867
    //   1860: astore_1
    //   1861: aload_1
    //   1862: invokevirtual printStackTrace : ()V
    //   1865: aconst_null
    //   1866: astore_1
    //   1867: aload_1
    //   1868: ifnonnull -> 1879
    //   1871: ldc_w 2131886513
    //   1874: iconst_0
    //   1875: invokestatic O0 : (II)V
    //   1878: return
    //   1879: aload_0
    //   1880: invokevirtual P : ()Landroid/content/Context;
    //   1883: aload_0
    //   1884: getfield M0 : Lkm0;
    //   1887: sipush #300
    //   1890: sipush #300
    //   1893: getstatic m92.k : I
    //   1896: invokestatic h : (Landroid/content/Context;Lkm0;III)Landroid/graphics/Bitmap;
    //   1899: astore #9
    //   1901: aload #9
    //   1903: astore #8
    //   1905: aload #9
    //   1907: ifnonnull -> 1922
    //   1910: aload_0
    //   1911: invokevirtual S : ()Landroid/content/res/Resources;
    //   1914: getstatic m92.k : I
    //   1917: invokestatic decodeResource : (Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   1920: astore #8
    //   1922: getstatic m92.h : [I
    //   1925: iconst_5
    //   1926: iaload
    //   1927: istore_2
    //   1928: new dz
    //   1931: dup
    //   1932: aload_0
    //   1933: invokevirtual P : ()Landroid/content/Context;
    //   1936: aload_1
    //   1937: aload #8
    //   1939: iload_2
    //   1940: aload #11
    //   1942: aload #10
    //   1944: aload_0
    //   1945: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   1948: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1951: ldc_w 2131165390
    //   1954: invokevirtual getDimension : (I)F
    //   1957: invokespecial <init> : (Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILandroid/graphics/Rect;Landroid/graphics/Rect;F)V
    //   1960: getfield p : Lss0;
    //   1963: invokevirtual show : ()V
    //   1966: goto -> 4365
    //   1969: iload_3
    //   1970: ldc_w 2131296989
    //   1973: if_icmpne -> 1995
    //   1976: aload_0
    //   1977: new android/content/Intent
    //   1980: dup
    //   1981: aload_0
    //   1982: invokevirtual P : ()Landroid/content/Context;
    //   1985: ldc_w in/krosbits/musicolet/IapActivity
    //   1988: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1991: invokevirtual B0 : (Landroid/content/Intent;)V
    //   1994: return
    //   1995: iload_3
    //   1996: ldc_w 2131296915
    //   1999: if_icmpne -> 2089
    //   2002: aload_0
    //   2003: aload_0
    //   2004: invokevirtual G0 : ()Lq42;
    //   2007: putfield L0 : Lq42;
    //   2010: new android/graphics/Rect
    //   2013: astore_1
    //   2014: aload_1
    //   2015: invokespecial <init> : ()V
    //   2018: aload_0
    //   2019: getfield o0 : Lin/krosbits/android/widgets/SmartImageView;
    //   2022: aload_1
    //   2023: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   2026: pop
    //   2027: aload_0
    //   2028: invokevirtual P : ()Landroid/content/Context;
    //   2031: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2034: ldc_w 2131165392
    //   2037: invokevirtual getDimension : (I)F
    //   2040: f2i
    //   2041: istore_2
    //   2042: aload_0
    //   2043: getfield L0 : Lq42;
    //   2046: aload_0
    //   2047: getfield o0 : Lin/krosbits/android/widgets/SmartImageView;
    //   2050: iconst_0
    //   2051: aload_1
    //   2052: getfield left : I
    //   2055: iload_2
    //   2056: iconst_3
    //   2057: imul
    //   2058: isub
    //   2059: aload_1
    //   2060: getfield top : I
    //   2063: iload_2
    //   2064: bipush #14
    //   2066: imul
    //   2067: isub
    //   2068: invokevirtual showAtLocation : (Landroid/view/View;III)V
    //   2071: aload_0
    //   2072: getfield L0 : Lq42;
    //   2075: invokevirtual a : ()V
    //   2078: goto -> 4365
    //   2081: astore_1
    //   2082: aload_1
    //   2083: invokevirtual printStackTrace : ()V
    //   2086: goto -> 4365
    //   2089: iload_3
    //   2090: ldc_w 2131296857
    //   2093: if_icmpne -> 2104
    //   2096: aload_0
    //   2097: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2100: invokevirtual w0 : ()V
    //   2103: return
    //   2104: iload_3
    //   2105: ldc_w 2131297013
    //   2108: if_icmpne -> 2134
    //   2111: new rf1
    //   2114: dup
    //   2115: aload_0
    //   2116: invokevirtual P : ()Landroid/content/Context;
    //   2119: aload_0
    //   2120: getfield P0 : Landroid/content/SharedPreferences;
    //   2123: aload_0
    //   2124: invokespecial <init> : (Landroid/content/Context;Landroid/content/SharedPreferences;Lz71;)V
    //   2127: getfield s : Lss0;
    //   2130: invokevirtual show : ()V
    //   2133: return
    //   2134: iload_3
    //   2135: ldc_w 2131296905
    //   2138: if_icmpne -> 2189
    //   2141: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   2144: istore #4
    //   2146: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   2149: iload #4
    //   2151: iconst_1
    //   2152: ixor
    //   2153: invokevirtual y0 : (Z)V
    //   2156: aload_0
    //   2157: invokevirtual d1 : ()V
    //   2160: iload #4
    //   2162: ifne -> 2173
    //   2165: ldc_w 2131887397
    //   2168: iconst_0
    //   2169: invokestatic O0 : (II)V
    //   2172: return
    //   2173: ldc_w 2131887396
    //   2176: iconst_0
    //   2177: invokestatic O0 : (II)V
    //   2180: return
    //   2181: astore_1
    //   2182: aload_1
    //   2183: invokevirtual printStackTrace : ()V
    //   2186: goto -> 4365
    //   2189: iload_3
    //   2190: ldc_w 2131297046
    //   2193: if_icmpeq -> 4339
    //   2196: iload_3
    //   2197: ldc_w 2131296844
    //   2200: if_icmpne -> 2206
    //   2203: goto -> 4339
    //   2206: iload_3
    //   2207: ldc_w 2131296847
    //   2210: if_icmpne -> 2228
    //   2213: aload_0
    //   2214: getfield M0 : Lkm0;
    //   2217: ifnonnull -> 2223
    //   2220: goto -> 4365
    //   2223: aload_0
    //   2224: invokevirtual K0 : ()V
    //   2227: return
    //   2228: iload_3
    //   2229: ldc_w 2131296856
    //   2232: if_icmpne -> 2371
    //   2235: aload_0
    //   2236: getfield M0 : Lkm0;
    //   2239: astore #9
    //   2241: aload #9
    //   2243: ifnull -> 4365
    //   2246: aload_0
    //   2247: getfield V0 : Lxp0;
    //   2250: astore_1
    //   2251: aload_1
    //   2252: ifnull -> 4365
    //   2255: aload_1
    //   2256: getfield e : Z
    //   2259: ifne -> 2281
    //   2262: aload_0
    //   2263: invokevirtual P : ()Landroid/content/Context;
    //   2266: aload_0
    //   2267: getfield M0 : Lkm0;
    //   2270: iconst_1
    //   2271: newarray int
    //   2273: dup
    //   2274: iconst_0
    //   2275: iconst_1
    //   2276: iastore
    //   2277: invokestatic F0 : (Landroid/content/Context;Lkm0;[I)V
    //   2280: return
    //   2281: aload_0
    //   2282: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2285: astore #8
    //   2287: aload #9
    //   2289: getfield c : Lqn1;
    //   2292: astore #11
    //   2294: aload #11
    //   2296: getfield b : Ljava/lang/String;
    //   2299: astore #9
    //   2301: aload #11
    //   2303: getfield c : Ljava/lang/String;
    //   2306: astore #10
    //   2308: aload #11
    //   2310: getfield e : Ljava/lang/String;
    //   2313: astore #11
    //   2315: aload_1
    //   2316: getfield f : Z
    //   2319: ifeq -> 2327
    //   2322: aconst_null
    //   2323: astore_1
    //   2324: goto -> 2335
    //   2327: aload_1
    //   2328: getfield a : Ljava/util/ArrayList;
    //   2331: invokestatic C : (Ljava/util/ArrayList;)Ljava/lang/String;
    //   2334: astore_1
    //   2335: aload #8
    //   2337: aload #9
    //   2339: aload #10
    //   2341: aload #11
    //   2343: aload_1
    //   2344: aload_0
    //   2345: getfield M0 : Lkm0;
    //   2348: getfield c : Lqn1;
    //   2351: getfield f : Lwo;
    //   2354: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2357: iconst_1
    //   2358: aload_0
    //   2359: getfield V0 : Lxp0;
    //   2362: getfield h : Ljava/lang/String;
    //   2365: iconst_1
    //   2366: iconst_0
    //   2367: invokestatic z0 : (Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   2370: return
    //   2371: iload_3
    //   2372: ldc_w 2131296870
    //   2375: if_icmpne -> 2401
    //   2378: aload_0
    //   2379: getfield M0 : Lkm0;
    //   2382: ifnull -> 4365
    //   2385: new zp0
    //   2388: dup
    //   2389: aload_0
    //   2390: invokevirtual P : ()Landroid/content/Context;
    //   2393: invokespecial <init> : (Landroid/content/Context;)V
    //   2396: invokevirtual p : ()Lss0;
    //   2399: pop
    //   2400: return
    //   2401: iload_3
    //   2402: ldc_w 2131296858
    //   2405: if_icmpne -> 2444
    //   2408: aload_0
    //   2409: getfield M0 : Lkm0;
    //   2412: ifnull -> 4365
    //   2415: aload_0
    //   2416: invokevirtual P : ()Landroid/content/Context;
    //   2419: new android/content/Intent
    //   2422: dup
    //   2423: aload_0
    //   2424: invokevirtual P : ()Landroid/content/Context;
    //   2427: ldc_w in/krosbits/musicolet/MusicService
    //   2430: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2433: ldc_w 'AF10'
    //   2436: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   2439: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   2442: pop
    //   2443: return
    //   2444: iload_3
    //   2445: ldc_w 2131296897
    //   2448: if_icmpne -> 2487
    //   2451: aload_0
    //   2452: getfield M0 : Lkm0;
    //   2455: ifnull -> 4365
    //   2458: aload_0
    //   2459: invokevirtual P : ()Landroid/content/Context;
    //   2462: new android/content/Intent
    //   2465: dup
    //   2466: aload_0
    //   2467: invokevirtual P : ()Landroid/content/Context;
    //   2470: ldc_w in/krosbits/musicolet/MusicService
    //   2473: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2476: ldc_w 'AR10'
    //   2479: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   2482: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   2485: pop
    //   2486: return
    //   2487: iload_3
    //   2488: ldc_w 2131297868
    //   2491: if_icmpne -> 2514
    //   2494: aload_0
    //   2495: getfield B0 : Landroid/widget/ImageView;
    //   2498: invokevirtual getVisibility : ()I
    //   2501: ifne -> 2509
    //   2504: aload_0
    //   2505: invokevirtual U0 : ()V
    //   2508: return
    //   2509: aload_0
    //   2510: invokevirtual H0 : ()V
    //   2513: return
    //   2514: iload_3
    //   2515: ldc_w 2131296845
    //   2518: if_icmpne -> 2577
    //   2521: aload_0
    //   2522: getfield e1 : Z
    //   2525: ifeq -> 2545
    //   2528: aload_0
    //   2529: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2532: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2535: invokevirtual i0 : ()V
    //   2538: aload_0
    //   2539: getfield n1 : Lv71;
    //   2542: invokevirtual run : ()V
    //   2545: aload_0
    //   2546: getfield f1 : Z
    //   2549: ifeq -> 4365
    //   2552: aload_0
    //   2553: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2556: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2559: invokevirtual l : ()V
    //   2562: goto -> 2570
    //   2565: astore_1
    //   2566: aload_1
    //   2567: invokevirtual printStackTrace : ()V
    //   2570: aload_0
    //   2571: invokevirtual V0 : ()V
    //   2574: goto -> 4365
    //   2577: iload_3
    //   2578: ldc_w 2131297696
    //   2581: if_icmpne -> 2676
    //   2584: aload_0
    //   2585: getfield g1 : J
    //   2588: lstore #6
    //   2590: lload #6
    //   2592: lconst_0
    //   2593: lcmp
    //   2594: ifle -> 2642
    //   2597: aload_0
    //   2598: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2601: astore_1
    //   2602: aload_1
    //   2603: ifnull -> 2637
    //   2606: aload_1
    //   2607: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2610: astore_1
    //   2611: aload_1
    //   2612: ifnull -> 2637
    //   2615: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   2618: ifeq -> 2637
    //   2621: aload_1
    //   2622: iconst_0
    //   2623: putfield P : Z
    //   2626: aload_1
    //   2627: lload #6
    //   2629: l2i
    //   2630: invokevirtual t0 : (I)V
    //   2633: aload_0
    //   2634: invokevirtual V0 : ()V
    //   2637: aload_0
    //   2638: lconst_0
    //   2639: putfield g1 : J
    //   2642: aload_0
    //   2643: getfield f1 : Z
    //   2646: ifeq -> 4365
    //   2649: aload_0
    //   2650: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2653: astore_1
    //   2654: aload_1
    //   2655: ifnull -> 4365
    //   2658: aload_1
    //   2659: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2662: astore_1
    //   2663: aload_1
    //   2664: ifnull -> 4365
    //   2667: aload_1
    //   2668: invokevirtual l : ()V
    //   2671: aload_0
    //   2672: invokevirtual V0 : ()V
    //   2675: return
    //   2676: iload_3
    //   2677: ldc_w 2131297679
    //   2680: if_icmpne -> 2761
    //   2683: aload_0
    //   2684: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2687: astore_1
    //   2688: aload_1
    //   2689: ifnull -> 4365
    //   2692: aload_1
    //   2693: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2696: astore_1
    //   2697: aload_1
    //   2698: ifnull -> 4365
    //   2701: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   2704: ifeq -> 2756
    //   2707: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2710: astore #8
    //   2712: aload #8
    //   2714: ifnull -> 2756
    //   2717: aload #8
    //   2719: invokevirtual A : ()I
    //   2722: istore_2
    //   2723: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   2726: ifeq -> 2756
    //   2729: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2732: ifnull -> 2756
    //   2735: aload_1
    //   2736: iload_2
    //   2737: iconst_1
    //   2738: iadd
    //   2739: putfield Q : I
    //   2742: goto -> 2756
    //   2745: astore #8
    //   2747: aload #8
    //   2749: invokevirtual printStackTrace : ()V
    //   2752: aload_1
    //   2753: invokevirtual l : ()V
    //   2756: aload_0
    //   2757: invokevirtual V0 : ()V
    //   2760: return
    //   2761: iload_3
    //   2762: ldc_w 2131297699
    //   2765: if_icmpne -> 2928
    //   2768: aload_0
    //   2769: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2772: astore_1
    //   2773: aload_1
    //   2774: ifnull -> 4365
    //   2777: aload_1
    //   2778: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2781: astore_1
    //   2782: aload_1
    //   2783: ifnull -> 4365
    //   2786: aload_1
    //   2787: invokevirtual I : ()Z
    //   2790: istore #4
    //   2792: aload_0
    //   2793: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2796: astore_1
    //   2797: iload #4
    //   2799: ifeq -> 2886
    //   2802: aload_1
    //   2803: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2806: astore_1
    //   2807: aload_1
    //   2808: invokevirtual getClass : ()Ljava/lang/Class;
    //   2811: pop
    //   2812: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   2815: ifeq -> 2921
    //   2818: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2821: ifnull -> 2921
    //   2824: aload_1
    //   2825: invokevirtual I : ()Z
    //   2828: istore #4
    //   2830: aload_1
    //   2831: iconst_0
    //   2832: putfield R : I
    //   2835: aload_1
    //   2836: invokevirtual I : ()Z
    //   2839: istore #5
    //   2841: iload #5
    //   2843: ifeq -> 2858
    //   2846: aload_1
    //   2847: invokevirtual M : ()V
    //   2850: goto -> 2858
    //   2853: astore #8
    //   2855: goto -> 2874
    //   2858: iload #4
    //   2860: iload #5
    //   2862: if_icmpeq -> 2921
    //   2865: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2868: invokevirtual L : ()V
    //   2871: goto -> 2921
    //   2874: aload #8
    //   2876: invokevirtual printStackTrace : ()V
    //   2879: aload_1
    //   2880: invokevirtual l : ()V
    //   2883: goto -> 2921
    //   2886: aload_1
    //   2887: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2890: astore_1
    //   2891: aload_1
    //   2892: invokevirtual getClass : ()Ljava/lang/Class;
    //   2895: pop
    //   2896: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   2899: ifeq -> 2921
    //   2902: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2905: astore #8
    //   2907: aload #8
    //   2909: ifnull -> 2921
    //   2912: aload_1
    //   2913: aload #8
    //   2915: invokevirtual A : ()I
    //   2918: invokevirtual u0 : (I)V
    //   2921: aload_0
    //   2922: invokevirtual V0 : ()V
    //   2925: goto -> 4365
    //   2928: aload_1
    //   2929: aload_0
    //   2930: getfield a1 : Lin/krosbits/android/widgets/SmartImageView;
    //   2933: if_acmpne -> 2986
    //   2936: aload_0
    //   2937: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2940: astore_1
    //   2941: aload_1
    //   2942: ifnull -> 4365
    //   2945: aload_1
    //   2946: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   2949: astore_1
    //   2950: aload_1
    //   2951: ifnull -> 4365
    //   2954: aload_1
    //   2955: invokevirtual I : ()Z
    //   2958: istore #4
    //   2960: aload_1
    //   2961: iconst_0
    //   2962: putfield R : I
    //   2965: aload_1
    //   2966: iconst_0
    //   2967: putfield Q : I
    //   2970: iload #4
    //   2972: ifeq -> 2981
    //   2975: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   2978: invokevirtual L : ()V
    //   2981: aload_0
    //   2982: invokevirtual V0 : ()V
    //   2985: return
    //   2986: iload_3
    //   2987: ldc_w 2131297680
    //   2990: if_icmpne -> 3083
    //   2993: aload_0
    //   2994: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   2997: astore_1
    //   2998: aload_1
    //   2999: ifnull -> 4365
    //   3002: aload_1
    //   3003: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   3006: astore_1
    //   3007: aload_1
    //   3008: ifnull -> 4365
    //   3011: aload_1
    //   3012: invokevirtual I : ()Z
    //   3015: ifne -> 3068
    //   3018: aload_0
    //   3019: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   3022: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   3025: astore_1
    //   3026: aload_1
    //   3027: getfield Q : I
    //   3030: iflt -> 3036
    //   3033: goto -> 3068
    //   3036: aload_1
    //   3037: invokevirtual I : ()Z
    //   3040: istore #4
    //   3042: aload_1
    //   3043: iconst_0
    //   3044: putfield R : I
    //   3047: aload_1
    //   3048: iconst_0
    //   3049: putfield Q : I
    //   3052: iload #4
    //   3054: ifeq -> 3063
    //   3057: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   3060: invokevirtual L : ()V
    //   3063: aload_0
    //   3064: invokevirtual V0 : ()V
    //   3067: return
    //   3068: aload_0
    //   3069: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   3072: getfield j0 : Lin/krosbits/musicolet/MusicService;
    //   3075: invokevirtual l : ()V
    //   3078: aload_0
    //   3079: invokevirtual V0 : ()V
    //   3082: return
    //   3083: iload_3
    //   3084: ldc_w 2131297823
    //   3087: if_icmpne -> 3106
    //   3090: new p71
    //   3093: dup
    //   3094: aload_0
    //   3095: invokevirtual P : ()Landroid/content/Context;
    //   3098: invokespecial <init> : (Landroid/content/Context;)V
    //   3101: invokevirtual p : ()Lss0;
    //   3104: pop
    //   3105: return
    //   3106: iload_3
    //   3107: ldc_w 2131297007
    //   3110: if_icmpne -> 3143
    //   3113: aload_0
    //   3114: invokevirtual P : ()Landroid/content/Context;
    //   3117: aload_0
    //   3118: ldc_w 2131887138
    //   3121: invokevirtual T : (I)Ljava/lang/String;
    //   3124: getstatic a51.f : [Lz41;
    //   3127: getstatic a51.p : Ljava/util/HashMap;
    //   3130: new v71
    //   3133: dup
    //   3134: aload_0
    //   3135: iconst_0
    //   3136: invokespecial <init> : (Lz71;I)V
    //   3139: invokestatic d : (Landroid/content/Context;Ljava/lang/String;[Lz41;Ljava/util/HashMap;Ljava/lang/Runnable;)V
    //   3142: return
    //   3143: iload_3
    //   3144: ldc_w 2131297136
    //   3147: if_icmpne -> 3175
    //   3150: aload_0
    //   3151: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   3154: astore_1
    //   3155: aload_1
    //   3156: ifnull -> 4365
    //   3159: aload_1
    //   3160: new android/content/Intent
    //   3163: dup
    //   3164: aload_1
    //   3165: ldc_w in/krosbits/musicolet/SearchActivity
    //   3168: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3171: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   3174: return
    //   3175: iload_3
    //   3176: ldc_w 2131297141
    //   3179: if_icmpne -> 3196
    //   3182: aload_0
    //   3183: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   3186: astore_1
    //   3187: aload_1
    //   3188: ifnull -> 4365
    //   3191: aload_1
    //   3192: invokevirtual y0 : ()V
    //   3195: return
    //   3196: iload_3
    //   3197: ldc_w 2131297717
    //   3200: if_icmpne -> 3211
    //   3203: aload_0
    //   3204: invokevirtual P : ()Landroid/content/Context;
    //   3207: invokestatic t0 : (Landroid/content/Context;)V
    //   3210: return
    //   3211: iload_3
    //   3212: ldc_w 2131296441
    //   3215: if_icmpne -> 3260
    //   3218: aload_0
    //   3219: iconst_1
    //   3220: putfield J1 : Z
    //   3223: invokestatic currentTimeMillis : ()J
    //   3226: invokestatic currentTimeMillis : ()J
    //   3229: iconst_1
    //   3230: fconst_0
    //   3231: fconst_0
    //   3232: iconst_0
    //   3233: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   3236: astore_1
    //   3237: aload_0
    //   3238: aload_1
    //   3239: iconst_1
    //   3240: fconst_0
    //   3241: fconst_0
    //   3242: invokevirtual Q0 : (Landroid/view/MotionEvent;IFF)V
    //   3245: aload_0
    //   3246: invokevirtual M : ()Lx5;
    //   3249: invokevirtual getWindow : ()Landroid/view/Window;
    //   3252: aload_1
    //   3253: invokevirtual superDispatchTouchEvent : (Landroid/view/MotionEvent;)Z
    //   3256: pop
    //   3257: goto -> 4365
    //   3260: iload_3
    //   3261: ldc_w 2131296440
    //   3264: if_icmpne -> 3321
    //   3267: aload_0
    //   3268: iconst_1
    //   3269: putfield I1 : Z
    //   3272: aload_0
    //   3273: invokestatic currentTimeMillis : ()J
    //   3276: invokestatic currentTimeMillis : ()J
    //   3279: iconst_1
    //   3280: fconst_0
    //   3281: fconst_0
    //   3282: iconst_0
    //   3283: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   3286: iconst_1
    //   3287: fconst_0
    //   3288: fconst_0
    //   3289: invokevirtual Q0 : (Landroid/view/MotionEvent;IFF)V
    //   3292: invokestatic currentTimeMillis : ()J
    //   3295: invokestatic currentTimeMillis : ()J
    //   3298: iconst_1
    //   3299: fconst_0
    //   3300: fconst_0
    //   3301: iconst_0
    //   3302: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   3305: astore_1
    //   3306: aload_0
    //   3307: invokevirtual M : ()Lx5;
    //   3310: invokevirtual getWindow : ()Landroid/view/Window;
    //   3313: aload_1
    //   3314: invokevirtual superDispatchTouchEvent : (Landroid/view/MotionEvent;)Z
    //   3317: pop
    //   3318: goto -> 4365
    //   3321: iload_3
    //   3322: ldc_w 2131296411
    //   3325: if_icmpne -> 3362
    //   3328: aload_0
    //   3329: new android/content/Intent
    //   3332: dup
    //   3333: aload_0
    //   3334: invokevirtual P : ()Landroid/content/Context;
    //   3337: ldc_w in/krosbits/musicolet/MostPlayedActivity
    //   3340: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3343: ldc_w 'pcs'
    //   3346: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   3349: getfield c : Llm0;
    //   3352: getfield K : Ljava/lang/String;
    //   3355: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   3358: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3361: return
    //   3362: aload_0
    //   3363: getfield j1 : Lm2;
    //   3366: astore #8
    //   3368: aload_1
    //   3369: aload #8
    //   3371: getfield f : Ljava/lang/Object;
    //   3374: checkcast in/krosbits/android/widgets/SmartImageView
    //   3377: if_acmpne -> 3514
    //   3380: aload_0
    //   3381: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3384: astore_1
    //   3385: aload_1
    //   3386: getfield S0 : Z
    //   3389: ifeq -> 3508
    //   3392: aload_1
    //   3393: getfield T0 : Ljava/util/HashSet;
    //   3396: invokevirtual size : ()I
    //   3399: aload_1
    //   3400: getfield N0 : Lxp0;
    //   3403: getfield a : Ljava/util/ArrayList;
    //   3406: invokevirtual size : ()I
    //   3409: if_icmpne -> 3415
    //   3412: goto -> 3425
    //   3415: aload_0
    //   3416: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3419: invokevirtual getSelectedLinesSize : ()I
    //   3422: ifne -> 3434
    //   3425: aload_0
    //   3426: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3429: iconst_0
    //   3430: invokevirtual setSelectionModeOn : (Z)V
    //   3433: return
    //   3434: aload_0
    //   3435: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3438: astore #8
    //   3440: aload #8
    //   3442: getfield O0 : Lrq0;
    //   3445: astore_1
    //   3446: aload_1
    //   3447: ifnull -> 3503
    //   3450: aload_1
    //   3451: invokeinterface a : ()Z
    //   3456: ifeq -> 3503
    //   3459: aload #8
    //   3461: getfield N0 : Lxp0;
    //   3464: getfield a : Ljava/util/ArrayList;
    //   3467: invokevirtual size : ()I
    //   3470: istore_3
    //   3471: iload_2
    //   3472: iload_3
    //   3473: if_icmpge -> 3495
    //   3476: aload #8
    //   3478: getfield T0 : Ljava/util/HashSet;
    //   3481: iload_2
    //   3482: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3485: invokevirtual add : (Ljava/lang/Object;)Z
    //   3488: pop
    //   3489: iinc #2, 1
    //   3492: goto -> 3471
    //   3495: aload #8
    //   3497: getfield P0 : La3;
    //   3500: invokevirtual g : ()V
    //   3503: aload_0
    //   3504: invokevirtual Z0 : ()V
    //   3507: return
    //   3508: aload_1
    //   3509: iconst_1
    //   3510: invokevirtual setSelectionModeOn : (Z)V
    //   3513: return
    //   3514: aload_1
    //   3515: aload #8
    //   3517: getfield d : Ljava/lang/Object;
    //   3520: checkcast in/krosbits/android/widgets/SmartImageView
    //   3523: if_acmpne -> 3561
    //   3526: aload_0
    //   3527: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3530: astore_1
    //   3531: aload_1
    //   3532: getfield S0 : Z
    //   3535: ifeq -> 4365
    //   3538: aload_1
    //   3539: invokevirtual getSelectedTextString : ()Ljava/lang/CharSequence;
    //   3542: invokestatic i : (Ljava/lang/CharSequence;)V
    //   3545: ldc_w 2131886406
    //   3548: iconst_0
    //   3549: invokestatic O0 : (II)V
    //   3552: aload_0
    //   3553: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3556: iconst_0
    //   3557: invokevirtual setSelectionModeOn : (Z)V
    //   3560: return
    //   3561: aload_1
    //   3562: aload #8
    //   3564: getfield e : Ljava/lang/Object;
    //   3567: checkcast in/krosbits/android/widgets/SmartImageView
    //   3570: if_acmpne -> 3636
    //   3573: aload_0
    //   3574: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3577: astore_1
    //   3578: aload_1
    //   3579: getfield S0 : Z
    //   3582: ifeq -> 4365
    //   3585: aload_1
    //   3586: invokevirtual getSelectedTextString : ()Ljava/lang/CharSequence;
    //   3589: astore_1
    //   3590: aload_0
    //   3591: new android/content/Intent
    //   3594: dup
    //   3595: ldc_w 'android.intent.action.SEND'
    //   3598: invokespecial <init> : (Ljava/lang/String;)V
    //   3601: ldc_w 'text/plain'
    //   3604: invokevirtual setType : (Ljava/lang/String;)Landroid/content/Intent;
    //   3607: ldc_w 'android.intent.extra.TEXT'
    //   3610: aload_1
    //   3611: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //   3614: aload_0
    //   3615: ldc_w 2131887367
    //   3618: invokevirtual T : (I)Ljava/lang/String;
    //   3621: invokestatic createChooser : (Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //   3624: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3627: aload_0
    //   3628: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3631: iconst_0
    //   3632: invokevirtual setSelectionModeOn : (Z)V
    //   3635: return
    //   3636: aload_1
    //   3637: aload #8
    //   3639: getfield c : Ljava/lang/Object;
    //   3642: checkcast in/krosbits/android/widgets/SmartImageView
    //   3645: if_acmpne -> 3767
    //   3648: aload_0
    //   3649: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3652: astore_1
    //   3653: aload_1
    //   3654: getfield S0 : Z
    //   3657: ifeq -> 4365
    //   3660: aload_1
    //   3661: invokevirtual getABRepeatTimesArrayMs : ()[I
    //   3664: astore_1
    //   3665: aload_1
    //   3666: ifnull -> 4365
    //   3669: aload_1
    //   3670: arraylength
    //   3671: iconst_2
    //   3672: if_icmpne -> 4365
    //   3675: aload_1
    //   3676: iconst_0
    //   3677: iaload
    //   3678: istore_2
    //   3679: iload_2
    //   3680: aload_1
    //   3681: iconst_1
    //   3682: iaload
    //   3683: if_icmpge -> 4365
    //   3686: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   3689: iload_2
    //   3690: invokevirtual t0 : (I)V
    //   3693: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   3696: astore #9
    //   3698: aload_1
    //   3699: iconst_0
    //   3700: iaload
    //   3701: istore_2
    //   3702: aload #9
    //   3704: invokevirtual getClass : ()Ljava/lang/Class;
    //   3707: pop
    //   3708: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   3711: ifeq -> 3741
    //   3714: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   3717: ifnull -> 3741
    //   3720: aload #9
    //   3722: iload_2
    //   3723: putfield Q : I
    //   3726: goto -> 3741
    //   3729: astore #8
    //   3731: aload #8
    //   3733: invokevirtual printStackTrace : ()V
    //   3736: aload #9
    //   3738: invokevirtual l : ()V
    //   3741: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   3744: aload_1
    //   3745: iconst_1
    //   3746: iaload
    //   3747: sipush #150
    //   3750: isub
    //   3751: invokevirtual u0 : (I)V
    //   3754: aload_0
    //   3755: invokevirtual V0 : ()V
    //   3758: aload_0
    //   3759: getfield C0 : Lin/krosbits/android/widgets/LyricsView;
    //   3762: iconst_0
    //   3763: invokevirtual setSelectionModeOn : (Z)V
    //   3766: return
    //   3767: aload_1
    //   3768: aload #8
    //   3770: getfield b : Ljava/lang/Object;
    //   3773: checkcast com/google/android/material/button/MaterialButton
    //   3776: if_acmpne -> 3789
    //   3779: aload_0
    //   3780: aconst_null
    //   3781: aload_0
    //   3782: getfield M0 : Lkm0;
    //   3785: invokevirtual S0 : (Lv00;Lkm0;)V
    //   3788: return
    //   3789: iload_3
    //   3790: ldc_w 2131296964
    //   3793: if_icmpne -> 3808
    //   3796: aload_0
    //   3797: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   3800: aload_0
    //   3801: getfield M0 : Lkm0;
    //   3804: invokestatic w0 : (Landroid/app/Activity;Lkm0;)V
    //   3807: return
    //   3808: iload_3
    //   3809: ldc_w 2131296962
    //   3812: if_icmpeq -> 3899
    //   3815: aload_1
    //   3816: aload_0
    //   3817: getfield h1 : Landroid/widget/ImageView;
    //   3820: if_acmpne -> 3826
    //   3823: goto -> 3899
    //   3826: iload_3
    //   3827: ldc_w 2131296436
    //   3830: if_icmpne -> 3858
    //   3833: aload_0
    //   3834: new android/content/Intent
    //   3837: dup
    //   3838: aload_0
    //   3839: invokevirtual M : ()Lx5;
    //   3842: ldc_w in/krosbits/musicolet/ScreenSaverActivity
    //   3845: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3848: ldc_w 536870912
    //   3851: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   3854: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3857: return
    //   3858: iload_3
    //   3859: ldc_w 2131296994
    //   3862: if_icmpne -> 4365
    //   3865: aload_0
    //   3866: new android/content/Intent
    //   3869: dup
    //   3870: aload_0
    //   3871: invokevirtual P : ()Landroid/content/Context;
    //   3874: ldc_w in/krosbits/musicolet/SettingsActivity
    //   3877: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   3880: aload #9
    //   3882: iconst_1
    //   3883: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   3886: ldc_w 'jmparg'
    //   3889: ldc_w 'now_playing'
    //   3892: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   3895: invokevirtual B0 : (Landroid/content/Intent;)V
    //   3898: return
    //   3899: aload_0
    //   3900: getfield y1 : Liv0;
    //   3903: ifnonnull -> 3909
    //   3906: goto -> 4365
    //   3909: invokestatic currentTimeMillis : ()J
    //   3912: lstore #6
    //   3914: lload #6
    //   3916: aload_0
    //   3917: getfield P1 : J
    //   3920: lsub
    //   3921: ldc2_w 1000
    //   3924: lcmp
    //   3925: ifge -> 3931
    //   3928: goto -> 4365
    //   3931: aload_0
    //   3932: lload #6
    //   3934: putfield P1 : J
    //   3937: aload_0
    //   3938: getfield y1 : Liv0;
    //   3941: invokevirtual getClass : ()Ljava/lang/Class;
    //   3944: pop
    //   3945: invokestatic g : ()Lhv0;
    //   3948: astore #9
    //   3950: invokestatic U : ()Z
    //   3953: ifeq -> 3965
    //   3956: aload #9
    //   3958: invokevirtual b : ()Landroid/view/Display;
    //   3961: astore_1
    //   3962: goto -> 3967
    //   3965: aconst_null
    //   3966: astore_1
    //   3967: aload #9
    //   3969: invokevirtual d : ()Z
    //   3972: ifeq -> 4149
    //   3975: aload_1
    //   3976: ifnull -> 3982
    //   3979: goto -> 4149
    //   3982: invokestatic c : ()I
    //   3985: bipush #7
    //   3987: if_icmpge -> 4006
    //   3990: new nj
    //   3993: dup
    //   3994: invokespecial <init> : ()V
    //   3997: aload_0
    //   3998: invokevirtual O : ()Llb0;
    //   4001: aconst_null
    //   4002: invokevirtual H0 : (Llb0;Ljava/lang/String;)V
    //   4005: return
    //   4006: aload_0
    //   4007: getfield N1 : Ljj;
    //   4010: astore_1
    //   4011: aload_1
    //   4012: ifnull -> 4019
    //   4015: aload_1
    //   4016: invokevirtual dismiss : ()V
    //   4019: new jj
    //   4022: dup
    //   4023: aload_0
    //   4024: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   4027: invokespecial <init> : (Lin/krosbits/musicolet/MusicActivity;)V
    //   4030: astore #10
    //   4032: aload_0
    //   4033: getfield x1 : Lcv0;
    //   4036: astore_1
    //   4037: aload_1
    //   4038: ifnull -> 4142
    //   4041: aload #10
    //   4043: getfield m : Lcv0;
    //   4046: aload_1
    //   4047: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4050: ifne -> 4102
    //   4053: aload #10
    //   4055: aload_1
    //   4056: putfield m : Lcv0;
    //   4059: aload #10
    //   4061: getfield s : Z
    //   4064: ifeq -> 4097
    //   4067: aload #10
    //   4069: getfield i : Liv0;
    //   4072: astore #9
    //   4074: aload #10
    //   4076: getfield j : Ldj;
    //   4079: astore #8
    //   4081: aload #9
    //   4083: aload #8
    //   4085: invokevirtual j : (Ldv0;)V
    //   4088: aload #9
    //   4090: aload_1
    //   4091: aload #8
    //   4093: iconst_1
    //   4094: invokevirtual a : (Lcv0;Ldv0;I)V
    //   4097: aload #10
    //   4099: invokevirtual f : ()V
    //   4102: aload #10
    //   4104: new x71
    //   4107: dup
    //   4108: aload_0
    //   4109: iconst_0
    //   4110: invokespecial <init> : (Lz71;I)V
    //   4113: invokevirtual setOnDismissListener : (Landroid/content/DialogInterface$OnDismissListener;)V
    //   4116: aload #10
    //   4118: invokevirtual show : ()V
    //   4121: aload_0
    //   4122: aload #10
    //   4124: putfield N1 : Ljj;
    //   4127: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   4130: invokevirtual D0 : ()V
    //   4133: return
    //   4134: astore_1
    //   4135: aload_1
    //   4136: invokevirtual printStackTrace : ()V
    //   4139: goto -> 4365
    //   4142: ldc_w 'selector must not be null'
    //   4145: invokestatic l : (Ljava/lang/String;)V
    //   4148: return
    //   4149: aload_0
    //   4150: getfield O1 : Z
    //   4153: ifne -> 4238
    //   4156: aload_1
    //   4157: ifnull -> 4238
    //   4160: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   4163: astore #8
    //   4165: aload #8
    //   4167: ifnull -> 4238
    //   4170: aload #8
    //   4172: getfield B0 : Lof;
    //   4175: astore #10
    //   4177: aload #10
    //   4179: invokevirtual b : ()Z
    //   4182: ifne -> 4238
    //   4185: invokestatic U : ()Z
    //   4188: ifeq -> 4238
    //   4191: aload_0
    //   4192: iconst_1
    //   4193: putfield O1 : Z
    //   4196: aload_1
    //   4197: invokevirtual getName : ()Ljava/lang/String;
    //   4200: astore_1
    //   4201: aload #10
    //   4203: iconst_1
    //   4204: putfield a : Z
    //   4207: aload #8
    //   4209: invokevirtual P0 : ()Z
    //   4212: istore #5
    //   4214: iload #5
    //   4216: istore #4
    //   4218: goto -> 4240
    //   4221: astore #8
    //   4223: goto -> 4230
    //   4226: astore #8
    //   4228: aconst_null
    //   4229: astore_1
    //   4230: aload #8
    //   4232: invokevirtual printStackTrace : ()V
    //   4235: goto -> 4240
    //   4238: aconst_null
    //   4239: astore_1
    //   4240: iload #4
    //   4242: ifeq -> 4303
    //   4245: aload_1
    //   4246: ifnull -> 4365
    //   4249: new ms0
    //   4252: dup
    //   4253: aload_0
    //   4254: invokevirtual P : ()Landroid/content/Context;
    //   4257: invokespecial <init> : (Landroid/content/Context;)V
    //   4260: astore #8
    //   4262: aload #8
    //   4264: aload_0
    //   4265: ldc_w 2131886294
    //   4268: iconst_1
    //   4269: anewarray java/lang/Object
    //   4272: dup
    //   4273: iconst_0
    //   4274: aload_1
    //   4275: aastore
    //   4276: invokevirtual U : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   4279: invokevirtual d : (Ljava/lang/CharSequence;)V
    //   4282: aload #8
    //   4284: ldc_w 2131887030
    //   4287: invokevirtual n : (I)V
    //   4290: aload #8
    //   4292: invokevirtual p : ()Lss0;
    //   4295: pop
    //   4296: aload_0
    //   4297: invokevirtual b1 : ()V
    //   4300: goto -> 4365
    //   4303: aload #9
    //   4305: invokevirtual d : ()Z
    //   4308: ifne -> 4329
    //   4311: new k01
    //   4314: dup
    //   4315: invokespecial <init> : ()V
    //   4318: aload_0
    //   4319: invokevirtual O : ()Llb0;
    //   4322: aconst_null
    //   4323: invokevirtual H0 : (Llb0;Ljava/lang/String;)V
    //   4326: goto -> 4365
    //   4329: aload_0
    //   4330: getfield E0 : Lin/krosbits/musicolet/MusicActivity;
    //   4333: invokestatic I : (Lin/krosbits/musicolet/MusicActivity;)V
    //   4336: goto -> 4365
    //   4339: aload_0
    //   4340: invokevirtual H0 : ()V
    //   4343: return
    //   4344: aload_0
    //   4345: getfield M0 : Lkm0;
    //   4348: ifnull -> 4365
    //   4351: aload_0
    //   4352: invokevirtual P : ()Landroid/content/Context;
    //   4355: aload_0
    //   4356: getfield M0 : Lkm0;
    //   4359: iconst_0
    //   4360: newarray int
    //   4362: invokestatic F0 : (Landroid/content/Context;Lkm0;[I)V
    //   4365: return
    //   4366: astore_1
    //   4367: goto -> 4365
    // Exception table:
    //   from	to	target	type
    //   1711	1770	1860	finally
    //   1775	1788	1860	finally
    //   1793	1857	1860	finally
    //   2002	2078	2081	finally
    //   2141	2160	2181	finally
    //   2165	2172	2181	finally
    //   2173	2180	2181	finally
    //   2552	2562	2565	java/lang/Exception
    //   2735	2742	2745	java/lang/Exception
    //   2824	2841	2853	java/lang/Exception
    //   2846	2850	2853	java/lang/Exception
    //   2865	2871	2853	java/lang/Exception
    //   3245	3257	4366	finally
    //   3306	3318	4366	finally
    //   3720	3726	3729	java/lang/Exception
    //   4127	4133	4134	finally
    //   4160	4165	4226	finally
    //   4170	4201	4226	finally
    //   4201	4214	4221	finally
  }
  
  public final void onDismiss() {
    this.N0 = true;
    Handler handler = this.K0;
    if (handler != null)
      handler.postDelayed(new v71(this, 3), 300L); 
    q42 q421 = this.L0;
    if (q421 != null)
      q421.h.removeCallbacks(q421.i); 
  }
  
  public final boolean onDrag(View paramView, DragEvent paramDragEvent) {
    return (paramView == this.d0 && paramDragEvent.getLocalState() == MyApplication.i.getApplicationContext() && paramDragEvent.getClipData().getItemCount() > 0 && "abc".contentEquals(paramDragEvent.getClipData().getItemAt(0).getText()));
  }
  
  public final boolean onLongClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296847) {
      if (this.M0 != null) {
        ms0 ms0 = new ms0(P());
        ms0.i(new CharSequence[] { T(2131887556), T(2131886345), T(2131887580) });
        ms0.j(new w71(this));
        ms0.p();
      } 
    } else {
      MusicService musicService;
      if (i == 2131296879) {
        if (this.M0 != null && MusicService.F0) {
          musicService = this.E0.j0;
          if (!musicService.j)
            musicService.X(new Integer[0]); 
          this.E0.j0.t0(0);
          return false;
        } 
      } else if (i == 2131297013) {
        ag0.G0((View)musicService);
      } else if (i == 2131296858) {
        SettingsActivity.u0(P(), "k_s_ffd");
      } else if (i == 2131296897) {
        SettingsActivity.u0(P(), "k_s_rwd");
      } 
    } 
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    y71 y711;
    int i = paramMotionEvent.getActionMasked();
    float f2 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    SmartImageView smartImageView = this.m0;
    if (paramView == smartImageView) {
      y711 = this.l1;
      if (i == 0) {
        smartImageView.setPressed(true);
        this.Q0 = System.currentTimeMillis();
        this.K0.postDelayed(y711, 700L);
        this.S0 = f2;
        this.R0 = f1;
        return true;
      } 
      if (i == 1) {
        smartImageView.setPressed(false);
        this.K0.removeCallbacks(y711);
        if (System.currentTimeMillis() - this.Q0 < 700L)
          this.m0.performClick(); 
        this.Q0 = 0L;
        return true;
      } 
      if (Math.abs(f2 - this.S0) > this.T0 || Math.abs(f1 - this.R0) > this.T0) {
        this.K0.removeCallbacks(y711);
        this.Q0 = 0L;
        this.m0.setPressed(false);
        return true;
      } 
    } else {
      smartImageView = this.k0;
      if (y711 == smartImageView) {
        y711 = this.m1;
        if (i == 0) {
          smartImageView.setPressed(true);
          this.Q0 = System.currentTimeMillis();
          this.K0.postDelayed(y711, 700L);
          this.S0 = f2;
          this.R0 = f1;
          return true;
        } 
        if (i == 1) {
          smartImageView.setPressed(false);
          this.K0.removeCallbacks(y711);
          if (System.currentTimeMillis() - this.Q0 < 700L)
            this.k0.performClick(); 
          this.Q0 = 0L;
          return true;
        } 
        if (Math.abs(f2 - this.S0) > this.T0 || Math.abs(f1 - this.R0) > this.T0) {
          this.K0.removeCallbacks(y711);
          this.Q0 = 0L;
          this.k0.setPressed(false);
          return true;
        } 
      } else if (y711 == this.b0) {
        Q0(paramMotionEvent, i, f2, f1);
      } 
    } 
    return true;
  }
  
  public final void p0() {
    this.I = true;
    this.K0.removeCallbacks(Q1);
    if (this.q1 && this.y1 != null) {
      kj kj = kj.b(MyApplication.i.getApplicationContext());
      kj.getClass();
      n21.j();
      w71 w711 = this.L1;
      if (w711 != null) {
        bl1 bl1 = kj.c;
        bl1.getClass();
        try {
          ff2 ff2 = bl1.a;
          dc2 dc2 = new dc2();
          this(w711);
          Parcel parcel = ff2.o();
          mh2.c(parcel, dc2);
          ff2.o0(parcel, 5);
        } catch (RemoteException remoteException) {
          bl1.c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "removeCastStateListener", ff2.class.getSimpleName() });
        } 
      } 
      this.y1.j(this.p1);
      this.x1 = cv0.c;
    } 
  }
  
  public final int q() {
    try {
      if (MusicService.P0 != null && MusicService.F0) {
        hc hc = MusicService.E0;
        if (hc != null)
          return hc.C(); 
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void r0(Bundle paramBundle) {
    this.I = true;
    if (paramBundle != null) {
      if (paramBundle.getBoolean("islrcv"))
        U0(); 
      if (paramBundle.getBoolean("lrcsrc") && !R1)
        S0(null, this.M0); 
    } 
  }
  
  public final void t() {
    Z0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */