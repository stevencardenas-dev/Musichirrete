package in.krosbits.musicolet;

import a3;
import ag0;
import ag1;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import app.futured.hauler.HaulerView;
import bp1;
import c81;
import cm0;
import com.esafirm.stubutton.StuButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import cp0;
import cw1;
import dd;
import dk1;
import dp0;
import ep0;
import f;
import fp0;
import g41;
import gp0;
import h41;
import id1;
import in.krosbits.android.widgets.ClockView;
import in.krosbits.android.widgets.DateView;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.android.widgets.swipetoloadlayout.SwipeToLoadLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import km0;
import l41;
import l90;
import m92;
import ms0;
import nl0;
import o41;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import p3;
import pc;
import pd1;
import pm0;
import pq;
import qq1;
import qz1;
import tp;
import x61;
import z51;
import zb0;
import zf0;
import zl0;

public class LockScreenActivity extends pc implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener, dd, o41, l41 {
  public static LockScreenActivity a1;
  
  public cm0 A0;
  
  public zl0 B0;
  
  public final dp0 C0;
  
  public final dp0 D0;
  
  public dp0 E0;
  
  public boolean F0;
  
  public Handler G0;
  
  public boolean H0;
  
  public StuButton I0;
  
  public FrameLayout J0;
  
  public final l90 K0;
  
  public cp0 L0;
  
  public final cp0 M0;
  
  public boolean N0;
  
  public final cp0 O0;
  
  public boolean P0;
  
  public float Q0;
  
  public MaterialButton R;
  
  public float R0;
  
  public MaterialButton S;
  
  public boolean S0;
  
  public Group T;
  
  public int T0;
  
  public Slider U;
  
  public boolean U0;
  
  public TextView V;
  
  public int V0;
  
  public TextView W;
  
  public RectF W0;
  
  public TextView X;
  
  public RectF X0;
  
  public TextView Y;
  
  public boolean Y0;
  
  public TextView Z;
  
  public boolean Z0;
  
  public ImageView a0;
  
  public ImageView b0;
  
  public ImageView c0;
  
  public ImageView d0;
  
  public ImageView e0;
  
  public ImageView f0;
  
  public ImageView g0;
  
  public ImageView h0;
  
  public ImageView i0;
  
  public ImageView j0;
  
  public SharedPreferences k0;
  
  public km0 l0;
  
  public boolean m0 = false;
  
  public boolean n0;
  
  public long o0;
  
  public int p0;
  
  public int q0;
  
  public int r0;
  
  public FrameLayout s0;
  
  public ImageView t0;
  
  public ImageView u0;
  
  public ClockView v0;
  
  public DateView w0;
  
  public final ArrayList x0 = new ArrayList();
  
  public SwipeToLoadLayout y0;
  
  public HaulerView z0;
  
  public LockScreenActivity() {
    new AtomicReference(null);
    new WeakHashMap<Object, Object>();
    new HashMap<Object, Object>();
    new ArrayList();
    new WeakReference<LockScreenActivity>(this);
    qz1.b(pm0.c);
    this.C0 = new dp0(this, 0);
    this.D0 = new dp0(this, 1);
    this.E0 = new dp0(this, 2);
    this.K0 = new l90(this, 3);
    this.L0 = new cp0(this, 0);
    this.M0 = new cp0(this, 1);
    this.O0 = new cp0(this, 2);
    this.P0 = false;
    String str = MyApplication.f;
    this.V0 = -2;
  }
  
  public static void A0() {
    LockScreenActivity lockScreenActivity = a1;
    if (lockScreenActivity != null)
      try {
        return;
      } finally {
        lockScreenActivity = null;
      }  
  }
  
  public static void n0(LockScreenActivity paramLockScreenActivity) {
    InputMethodManager inputMethodManager = (InputMethodManager)paramLockScreenActivity.getSystemService("input_method");
    if (inputMethodManager != null) {
      byte b = 0;
      while (true) {
        if (b < 3) {
          (new String[3])[0] = "mCurRootView";
          (new String[3])[1] = "mServedView";
          (new String[3])[2] = "mNextServedView";
          String str = (new String[3])[b];
          try {
            Field field = inputMethodManager.getClass().getDeclaredField(str);
            if (!field.isAccessible())
              field.setAccessible(true); 
            Object object = field.get(inputMethodManager);
            if (object instanceof View) {
              object = object;
              if (object.getContext() == paramLockScreenActivity) {
                field.set(inputMethodManager, null);
              } else {
                String str1 = GMDx.QrNwzkedC;
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("fixInputMethodManagerLeak break, context is not suitable, get_context=");
                stringBuilder.append(object.getContext());
                stringBuilder.append(" dest_context=");
                stringBuilder.append(paramLockScreenActivity);
                Log.e(str1, stringBuilder.toString());
                return;
              } 
            } 
          } finally {}
          b++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public static void v0() {
    LockScreenActivity lockScreenActivity = a1;
    if (lockScreenActivity != null) {
      zl0 zl01 = lockScreenActivity.B0;
      if (zl01 != null)
        try {
          zl01.d(MusicService.y());
        } finally {} 
    } 
  }
  
  public final void C(View paramView) {
    Slider slider = (Slider)paramView;
    MusicService musicService = MusicService.P0;
    if (musicService != null && !this.Y0 && !this.Z0)
      musicService.t0((int)slider.getValue()); 
    this.m0 = true;
  }
  
  public final void D() {
    SwipeToLoadLayout swipeToLoadLayout = this.y0;
    if (swipeToLoadLayout != null) {
      swipeToLoadLayout.setLoadingMore(false);
      Handler handler = this.G0;
      if (handler != null)
        handler.postDelayed((Runnable)new cp0(this, 4), 250L); 
    } 
  }
  
  public final void attachBaseContext(Context paramContext) {
    super.attachBaseContext(z51.A(paramContext));
  }
  
  public final void c() {
    SwipeToLoadLayout swipeToLoadLayout = this.y0;
    if (swipeToLoadLayout != null) {
      swipeToLoadLayout.setRefreshing(false);
      Handler handler = this.G0;
      if (handler != null)
        handler.postDelayed((Runnable)new cp0(this, 3), 250L); 
    } 
  }
  
  public final void g(View paramView) {
    Slider slider = (Slider)paramView;
    this.m0 = false;
  }
  
  public final void l0() {
    if (m0())
      return; 
    try {
      Intent intent = new Intent();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean m0() {
    try {
      MusicService musicService = MusicService.P0;
      if (musicService != null && !musicService.x && MyApplication.e().getMode() == 0) {
        boolean bool;
        KeyguardManager keyguardManager = LockScreenReceiver.a;
        if (MyApplication.o().getBoolean("k_b_slsiulc", true)) {
          bool = LockScreenReceiver.a.inKeyguardRestrictedInputMode();
        } else {
          bool = true;
        } 
        if (bool && MusicService.V0 != null && LockScreenReceiver.a())
          return false; 
      } 
    } finally {
      Exception exception;
    } 
    this.F0 = false;
    finish();
    return true;
  }
  
  public final void o0() {
    ArrayList<Object> arrayList = this.x0;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      View view = (View)arrayList.get(b);
      b++;
      ((View)view).setVisibility(8);
    } 
    this.s0.setVisibility(0);
  }
  
  public final void onBackPressed() {
    cm0 cm01 = this.A0;
    if (cm01 != null && cm01.b.getVisibility() == 0) {
      t0();
      return;
    } 
    zl0 zl01 = this.B0;
    if (zl01 != null && zl01.b.getVisibility() == 0)
      t0(); 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296800) {
      this.D0.run();
      return;
    } 
    if (i == 2131296808) {
      this.C0.run();
      return;
    } 
    if (i == 2131296879) {
      MusicService musicService = MusicService.P0;
      if (musicService != null) {
        musicService.X(new Integer[0]);
        return;
      } 
    } else {
      if (i == 2131296875) {
        startService((new Intent((Context)this, MusicService.class)).setAction("ACTION_NEXT").putExtra("EXT_IFOAU", false).putExtra("EXT_DIP", false));
        return;
      } 
      if (i == 2131296884) {
        startService((new Intent((Context)this, MusicService.class)).setAction("ACTION_PREV").putExtra("EXT_IFOAU", false).putExtra("EXT_DIP", false));
        return;
      } 
      if (i == 2131296859) {
        startService((new Intent((Context)this, MusicService.class)).setAction("ACT_FAV").putExtra("EXT_S_RID", this.l0.b));
        return;
      } 
      if (i == 2131296798) {
        this.F0 = false;
        if (this.P0) {
          startActivityForResult((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_1_SRI", this.l0.b).putExtra("E_SHOLCSR", true).putExtra("E_ALSHFLCSR", true), 1);
          return;
        } 
        finish();
        startService((new Intent((Context)this, MusicService.class)).setAction("ACTION_CLOSE"));
        return;
      } 
      if (i == 2131296886) {
        o0();
        if (this.A0 == null) {
          FrameLayout frameLayout = this.s0;
          Object object = new Object();
          LayoutInflater layoutInflater = LayoutInflater.from((Context)this);
          ((cm0)object).h = layoutInflater;
          View view = layoutInflater.inflate(2131493041, (ViewGroup)frameLayout, false);
          ((cm0)object).b = view;
          ImageView imageView = (ImageView)view.findViewById(2131296835);
          TextView textView1 = (TextView)view.findViewById(2131297719);
          ((cm0)object).c = textView1;
          TextView textView2 = (TextView)view.findViewById(2131297743);
          RecyclerView recyclerView = (RecyclerView)view.findViewById(2131297420);
          ((cm0)object).e = recyclerView;
          a3 a3 = new a3(9, object);
          ((cm0)object).i = a3;
          recyclerView.setAdapter((id1)a3);
          recyclerView.setLayoutManager((a)new LinearLayoutManager(1));
          textView1.setOnClickListener((View.OnClickListener)object);
          textView2.setOnClickListener((View.OnClickListener)object);
          recyclerView.h((pd1)new Object());
          this.A0 = (cm0)object;
          this.s0.addView(view);
        } 
        this.A0.b.setVisibility(0);
        w0();
        return;
      } 
      if (i == 2131296867) {
        o0();
        if (this.B0 == null) {
          FrameLayout frameLayout = this.s0;
          Object object = new Object();
          View view = LayoutInflater.from((Context)this).inflate(2131493040, (ViewGroup)frameLayout, false);
          ((zl0)object).b = view;
          TextView textView2 = (TextView)view.findViewById(2131297745);
          ((zl0)object).c = textView2;
          TextView textView1 = (TextView)view.findViewById(2131297741);
          ((zl0)object).e = textView1;
          LyricsView lyricsView = (LyricsView)view.findViewById(2131297046);
          ((zl0)object).f = lyricsView;
          ImageView imageView = (ImageView)view.findViewById(2131296835);
          textView1.setOnClickListener((View.OnClickListener)object);
          lyricsView.setSeekableOn(2);
          textView2.setOnClickListener((View.OnClickListener)object);
          this.B0 = (zl0)object;
          this.s0.addView(view);
        } 
        this.B0.b.setVisibility(0);
        v0();
        x0();
        return;
      } 
      if (i == 2131296733) {
        t0();
        return;
      } 
      if (i == 2131296441) {
        this.Z0 = true;
        MotionEvent motionEvent = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0F, 0.0F, 0);
        q0(1, 0, 0, motionEvent);
        try {
          getWindow().superDispatchTouchEvent(motionEvent);
        } finally {}
      } else if (i == 2131296440) {
        this.Y0 = true;
        q0(1, 0, 0, MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0F, 0.0F, 0));
        MotionEvent motionEvent = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0F, 0.0F, 0);
        getWindow().superDispatchTouchEvent(motionEvent);
      } 
    } 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    z51.A((Context)this);
  }
  
  public final void onCreate(Bundle paramBundle) {
    int i;
    m92.t(this);
    super.onCreate(paramBundle);
    this.G0 = new Handler();
    LockScreenActivity lockScreenActivity = a1;
    if (lockScreenActivity != null && lockScreenActivity != this) {
      lockScreenActivity.F0 = false;
      lockScreenActivity.finish();
    } 
    a1 = this;
    SharedPreferences sharedPreferences = MyApplication.o();
    this.k0 = sharedPreferences;
    this.H0 = sharedPreferences.getBoolean("k_b_lcshadpliocl", true);
    U().a(this.K0);
    (new Thread((Runnable)new zf0((Activity)this, 2131953017, 0))).start();
    if (MyApplication.o().getBoolean("k_b_gcls2", false)) {
      i = 2131492893;
    } else {
      i = 2131492892;
    } 
    setContentView(i);
    this.r0 = (int)(getResources().getDimension(2131165390) * 12.0F);
    this.y0 = (SwipeToLoadLayout)findViewById(2131297561);
    this.j0 = (ImageView)findViewById(2131296913);
    this.z0 = (HaulerView)findViewById(2131296783);
    this.i0 = (ImageView)findViewById(2131296782);
    this.U = (Slider)findViewById(2131297441);
    this.T = (Group)findViewById(2131297462);
    this.R = (MaterialButton)findViewById(2131296441);
    this.S = (MaterialButton)findViewById(2131296440);
    this.V = (TextView)findViewById(2131297890);
    this.W = (TextView)findViewById(2131297685);
    this.X = (TextView)findViewById(2131297692);
    this.Z = (TextView)findViewById(2131297718);
    this.Y = (TextView)findViewById(2131297740);
    this.b0 = (ImageView)findViewById(2131296879);
    this.c0 = (ImageView)findViewById(2131296800);
    this.d0 = (ImageView)findViewById(2131296808);
    this.a0 = (ImageView)findViewById(2131296875);
    this.e0 = (ImageView)findViewById(2131296884);
    this.f0 = (ImageView)findViewById(2131296859);
    this.h0 = (ImageView)findViewById(2131296851);
    this.g0 = (ImageView)findViewById(2131296798);
    this.s0 = (FrameLayout)findViewById(2131296733);
    this.t0 = (ImageView)findViewById(2131296886);
    this.u0 = (ImageView)findViewById(2131296867);
    this.v0 = (ClockView)findViewById(2131296629);
    this.w0 = (DateView)findViewById(2131296640);
    this.I0 = (StuButton)findViewById(2131297545);
    this.J0 = (FrameLayout)findViewById(2131296736);
    ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(2131297564);
    getWindow().addFlags(524288);
    x0();
    p0();
    Configuration configuration = getResources().getConfiguration();
    if (configuration.orientation == 2 && (configuration.screenWidthDp < 480 || configuration.screenHeightDp < 350)) {
      this.V.setTextSize(1, 14.0F);
      this.X.setTextSize(1, 12.0F);
      this.W.setTextSize(1, 12.0F);
      if (this.z0 != null)
        this.i0.setVisibility(8); 
      this.v0.setTextSize(1, 16.0F);
    } 
    Animation animation = AnimationUtils.loadAnimation(MyApplication.i.getApplicationContext(), 2130772026);
    HaulerView haulerView2 = this.z0;
    ImageView imageView2 = this.h0;
    if (haulerView2 != null) {
      imageView2.clearAnimation();
      animation.setAnimationListener((Animation.AnimationListener)new ep0(0, this));
      this.h0.setAnimation(animation);
      this.h0.animate();
    } else {
      imageView2.setVisibility(8);
      this.I0.setVisibility(0);
      this.I0.setOnUnlockListener((qq1)new fp0(this));
      s0(false);
      pq pq = new pq();
      pq.c(constraintLayout);
      (pq.g(2131296782)).d.w = 1.0F;
      if (configuration.screenHeightDp > 650) {
        pq.l(2131296782, 4, (int)(MyApplication.p * 40.0F));
        pq.l(2131297545, 4, (int)(MyApplication.p * 28.0F));
      } 
      pq.a(constraintLayout);
    } 
    this.U.setLabelFormatter((nl0)new zb0(4));
    this.U.b(this);
    this.b0.setOnClickListener(this);
    this.c0.setOnClickListener(this);
    this.d0.setOnClickListener(this);
    this.a0.setOnTouchListener(this);
    this.e0.setOnTouchListener(this);
    this.U.setOnTouchListener(this);
    this.b0.setOnLongClickListener(this);
    this.f0.setOnClickListener(this);
    this.g0.setOnClickListener(this);
    this.t0.setOnClickListener(this);
    this.u0.setOnClickListener(this);
    this.s0.setOnClickListener(this);
    this.S.setOnClickListener(this);
    this.R.setOnClickListener(this);
    HaulerView haulerView1 = this.z0;
    if (haulerView1 != null) {
      haulerView1.setDragEnabled(true);
      this.z0.setOnDragDismissedListener((h41)new f(18, this));
      this.z0.setOnDragActivityListener((g41)new fp0(this));
    } 
    this.F0 = true;
    ImageView imageView1 = this.t0;
    ArrayList<ImageView> arrayList = this.x0;
    arrayList.add(imageView1);
    arrayList.add(this.u0);
    arrayList.add(this.v0);
    arrayList.add(this.w0);
    arrayList.add(this.V);
    arrayList.add(this.W);
    arrayList.add(this.X);
    arrayList.add(this.U);
    arrayList.add(this.Y);
    arrayList.add(this.Z);
    arrayList.add(this.f0);
    arrayList.add(this.e0);
    arrayList.add(this.b0);
    arrayList.add(this.a0);
    arrayList.add(this.g0);
    SwipeToLoadLayout swipeToLoadLayout = this.y0;
    if (swipeToLoadLayout != null) {
      swipeToLoadLayout.setRefreshEnabled(true);
      this.y0.setLoadMoreEnabled(true);
      this.y0.setOnRefreshListener(this);
      this.y0.setOnLoadMoreListener(this);
    } 
    if (!MyApplication.o().getBoolean("k_b_scpqls", true)) {
      this.t0.setVisibility(4);
      this.u0.setVisibility(4);
    } 
    if (!MyApplication.o().getBoolean("k_b_lcffrw", true)) {
      this.d0.setVisibility(8);
      this.c0.setVisibility(8);
    } else {
      arrayList.add(this.c0);
      arrayList.add(this.d0);
    } 
    if (Build.VERSION.SDK_INT >= 29)
      lc.e.run(); 
    z0();
  }
  
  public final void onDestroy() {
    if (a1 == this)
      a1 = null; 
    this.G0.removeCallbacks((Runnable)this.L0);
    this.G0.removeCallbacksAndMessages(null);
    MyApplication.v.a(this.j0);
    this.G0 = null;
    this.E0 = null;
    this.L0 = null;
    super.onDestroy();
    try {
      n0(this);
    } finally {
      Exception exception = null;
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296879 && this.l0 != null && MusicService.P0 != null && MusicService.F0) {
      MusicService musicService = MusicService.P0;
      if (!musicService.j)
        musicService.X(new Integer[0]); 
      MusicService.P0.t0(0);
      return false;
    } 
    return true;
  }
  
  public final void onResume() {
    super.onResume();
    if (m0())
      return; 
    LockScreenActivity lockScreenActivity = a1;
    if (lockScreenActivity != this) {
      if (lockScreenActivity != null && !lockScreenActivity.isFinishing())
        a1.finish(); 
      a1 = this;
    } 
    p0();
    this.n0 = this.k0.getBoolean("RCPOS", false);
    this.m0 = true;
    this.G0.postDelayed((Runnable)this.E0, 1000L);
  }
  
  public final void onStop() {
    super.onStop();
    this.G0.removeCallbacks((Runnable)this.L0);
    if (this.F0) {
      this.G0.postDelayed((Runnable)this.L0, 500L);
      this.F0 = false;
    } 
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    try {
      dp0 dp01;
      int k = paramMotionEvent.getActionMasked();
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      ImageView imageView = this.e0;
      if (paramView == imageView) {
        dp01 = this.C0;
        if (k == 0) {
          imageView.setPressed(true);
          this.o0 = System.currentTimeMillis();
          this.G0.postDelayed((Runnable)dp01, 700L);
          this.q0 = i;
          this.p0 = j;
          return true;
        } 
        if (k == 1 || k == 3) {
          imageView.setPressed(false);
          this.G0.removeCallbacks((Runnable)dp01);
          if (System.currentTimeMillis() - this.o0 < 700L && k == 1)
            onClick((View)this.e0); 
          this.o0 = 0L;
          return true;
        } 
        if (Math.abs(i - this.q0) > this.r0 || Math.abs(j - this.p0) > this.r0) {
          this.G0.removeCallbacks((Runnable)dp01);
          this.o0 = 0L;
          this.e0.setPressed(false);
          return true;
        } 
      } else {
        imageView = this.a0;
        if (dp01 == imageView) {
          dp01 = this.D0;
          if (k == 0) {
            imageView.setPressed(true);
            this.o0 = System.currentTimeMillis();
            this.G0.postDelayed((Runnable)dp01, 700L);
            this.q0 = i;
            this.p0 = j;
            return true;
          } 
          if (k == 1 || k == 3) {
            imageView.setPressed(false);
            this.G0.removeCallbacks((Runnable)dp01);
            if (System.currentTimeMillis() - this.o0 < 700L && k == 1)
              onClick((View)this.a0); 
            this.o0 = 0L;
            return true;
          } 
          if (Math.abs(i - this.q0) > this.r0 || Math.abs(j - this.p0) > this.r0) {
            this.G0.removeCallbacks((Runnable)dp01);
            this.o0 = 0L;
            this.a0.setPressed(false);
            return true;
          } 
        } else if (dp01 == this.U) {
          q0(k, i, j, paramMotionEvent);
        } 
      } 
    } finally {}
    return true;
  }
  
  public final void p0() {
    getWindow().getDecorView().setSystemUiVisibility(5638);
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
      if (i >= 30) {
        i = 3;
      } else {
        i = 1;
      } 
      tp.c(layoutParams, i);
    } 
  }
  
  public final void q0(int paramInt1, int paramInt2, int paramInt3, MotionEvent paramMotionEvent) {
    cp0 cp02 = this.M0;
    cp0 cp01 = this.O0;
    float f = 0.85F;
    boolean bool = true;
    int i = 1;
    boolean bool1 = false;
    if (paramInt1 == 0) {
      paramInt1 = paramInt2 - this.U.getTrackSidePadding();
      this.Q0 = paramInt1;
      this.R0 = paramInt3;
      float f1 = this.U.getTrackWidth();
      paramInt2 = (int)((this.U.getValue() - this.U.getValueFrom()) * f1 / (this.U.getValueTo() - this.U.getValueFrom()));
      paramInt3 = (int)(MyApplication.p * 30.0F);
      boolean bool2 = MyApplication.o().getBoolean("k_b_sbpvtact2", false);
      this.N0 = MyApplication.o().getBoolean("k_b_sskhpbt", true);
      if (bool2 && paramInt1 < paramInt2 - paramInt3) {
        this.T0 = 0;
        this.U.getParent().requestDisallowInterceptTouchEvent(false);
      } else if (bool2 && paramInt1 > paramInt2 + paramInt3) {
        this.T0 = 1;
        this.U.getParent().requestDisallowInterceptTouchEvent(false);
      } else {
        this.T0 = 2;
        this.U0 = true;
        this.Z0 = false;
        this.Y0 = false;
        this.X0 = null;
        this.W0 = null;
        this.G0.removeCallbacks((Runnable)cp02);
        this.S.setPressed(false);
        this.R.setPressed(false);
        this.R.setScaleX(0.85F);
        this.R.setScaleY(0.85F);
        this.S.setScaleX(0.85F);
        this.S.setScaleY(0.85F);
        ((ViewGroup)this.U.getParent()).requestDisallowInterceptTouchEvent(true);
        this.G0.removeCallbacks((Runnable)cp01);
        this.G0.postDelayed((Runnable)cp01, 700L);
        paramInt1 = i;
        this.S0 = false;
      } 
      paramInt1 = 0;
    } else {
      ViewGroup viewGroup;
      if (paramInt1 == 2) {
        if (this.S0)
          return; 
        float f3 = Math.abs(paramMotionEvent.getX() - this.Q0);
        float f2 = Math.abs(paramMotionEvent.getY() - this.R0);
        float f1 = this.U.getHeight() / 2.0F;
        if (this.T0 == 2) {
          if ((f3 > f1 || f2 > f1) && this.N0)
            this.T.setVisibility(0); 
          int[] arrayOfInt = new int[2];
          if (this.W0 == null && this.N0) {
            this.S.getLocationOnScreen(arrayOfInt);
            i = arrayOfInt[0];
            paramInt1 = arrayOfInt[1];
            paramInt3 = this.S.getWidth();
            paramInt2 = this.S.getHeight();
            if (paramInt3 > 0 && paramInt2 > 0)
              this.W0 = new RectF(i, 0.0F, (paramInt3 * 2 + i), (paramInt1 + paramInt2)); 
          } 
          if (this.X0 == null && this.N0) {
            this.R.getLocationOnScreen(arrayOfInt);
            paramInt3 = arrayOfInt[0];
            paramInt1 = arrayOfInt[1];
            i = this.R.getWidth();
            paramInt2 = this.R.getHeight();
            if (i > 0 && paramInt2 > 0)
              this.X0 = new RectF((paramInt3 - i), 0.0F, (paramInt3 + i), (paramInt1 + paramInt2)); 
          } 
          f3 = paramMotionEvent.getRawX();
          f2 = paramMotionEvent.getRawY();
          RectF rectF = this.W0;
          if (rectF != null && rectF.contains(f3, f2)) {
            bool2 = true;
          } else {
            bool2 = false;
          } 
          if (this.Y0 != bool2) {
            this.S.setPressed(bool2);
            if (bool2) {
              f1 = 1.0F;
            } else {
              f1 = 0.85F;
            } 
            this.S.setScaleX(f1);
            this.S.setScaleY(f1);
          } 
          this.Y0 = bool2;
          rectF = this.X0;
          boolean bool2 = bool1;
          if (rectF != null) {
            bool2 = bool1;
            if (rectF.contains(f3, f2))
              bool2 = true; 
          } 
          if (this.Z0 != bool2) {
            this.R.setPressed(bool2);
            f1 = f;
            if (bool2)
              f1 = 1.0F; 
            this.R.setScaleX(f1);
            this.R.setScaleY(f1);
          } 
          this.Z0 = bool2;
          paramInt1 = bool;
        } else {
          if (f3 > f1 || f2 > f1) {
            this.T0 = -1;
            this.U0 = false;
            try {
              viewGroup = (ViewGroup)this.U.getParent();
              this.S0 = true;
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
        if (paramInt1 == 1 || paramInt1 == 3) {
          if (paramInt1 == 1 && this.U0) {
            bool1 = this.Z0;
            if (!bool1) {
              boolean bool2 = this.Y0;
              if (!bool2) {
                Slider slider = this.U;
                MusicService musicService = MusicService.P0;
                if (musicService != null && !bool2 && !bool1)
                  musicService.t0((int)slider.getValue()); 
                this.m0 = true;
              } 
            } 
            if (this.Z0) {
              dk1 dk1 = new dk1((Context)this, MusicService.E0.A(), this.l0.c.g);
              ((ms0)dk1).t = true;
              dk1.p();
            } 
          } 
          if (this.U0) {
            this.U.onTouchEvent(paramMotionEvent);
            this.S.setPressed(false);
            this.R.setPressed(false);
            this.R.setScaleX(0.85F);
            this.R.setScaleY(0.85F);
            this.S.setScaleX(0.85F);
            this.S.setScaleY(0.85F);
          } 
          this.G0.postDelayed((Runnable)cp02, 300L);
          this.U.getParent().requestDisallowInterceptTouchEvent(true);
          y0();
          this.T0 = -1;
          this.U0 = false;
          this.S0 = false;
          this.G0.removeCallbacks((Runnable)viewGroup);
          this.T.setVisibility(8);
        } 
        paramInt1 = 0;
      } 
      if (paramInt1 != 0)
        this.U.onTouchEvent(paramMotionEvent); 
    } 
    this.S0 = false;
  }
  
  public final void r0() {
    if (this.V0 != this.T0) {
      int i;
      MusicService musicService = MusicService.P0;
      if (musicService == null || musicService.j) {
        i = 1;
      } else {
        i = 0;
      } 
      Slider slider = this.U;
      if (i) {
        i = 16842808;
      } else {
        i = 16842806;
      } 
      slider.setTrackActiveTintList(ColorStateList.valueOf(m92.y(this, i)));
      this.U.setTrackInactiveTintList(ColorStateList.valueOf(m92.y(this, 2130968902)));
      this.d0.setPressed(false);
      this.c0.setPressed(false);
    } 
    this.V0 = this.T0;
  }
  
  public final void s0(boolean paramBoolean) {
    StuButton stuButton = this.I0;
    if (paramBoolean) {
      float f = MyApplication.p;
      stuButton.setStuBackground((Drawable)ag0.V((Context)this, -1, 1157627903, (int)f * 2, f * 24.0F));
      stuButton = this.I0;
      ImageView imageView = stuButton.c;
      if (imageView != null) {
        imageView.setImageResource(2131231205);
        stuButton.c.setColorFilter(0);
        stuButton.c.setImageAlpha(255);
        return;
      } 
    } else {
      stuButton.setStuBackground((Drawable)ag0.V((Context)this, 16777215, 16777215, 0, MyApplication.p * 24.0F));
      stuButton = this.I0;
      ImageView imageView = stuButton.c;
      if (imageView != null) {
        imageView.setImageResource(2131231206);
        stuButton.c.setColorFilter(-1);
        stuButton.c.setImageAlpha(153);
      } 
    } 
  }
  
  public final void t0() {
    ArrayList<Object> arrayList = this.x0;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      View view = (View)arrayList.get(b);
      b++;
      ((View)view).setVisibility(0);
    } 
    this.s0.setVisibility(8);
    cm0 cm01 = this.A0;
    if (cm01 != null) {
      cm01.b.setVisibility(8);
      this.A0.getClass();
    } 
    zl0 zl01 = this.B0;
    if (zl01 != null) {
      zl01.b.setVisibility(8);
      zl01 = this.B0;
      zl01.getClass();
      try {
        bp1 bp1 = zl01.i;
      } finally {
        zl01 = null;
      } 
    } 
    x0();
  }
  
  public final void u0() {
    this.F0 = false;
    finish();
    if (Build.VERSION.SDK_INT >= 26)
      try {
        KeyguardManager keyguardManager = LockScreenReceiver.a;
        gp0 gp0 = new gp0();
        super();
        return;
      } finally {
        Exception exception = null;
      }  
  }
  
  public final void w0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield A0 : Lcm0;
    //   4: ifnull -> 179
    //   7: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   10: astore #4
    //   12: iconst_0
    //   13: istore_2
    //   14: aload #4
    //   16: ifnull -> 51
    //   19: invokestatic z : ()Lxn1;
    //   22: astore #5
    //   24: aload #5
    //   26: ifnull -> 51
    //   29: aload #5
    //   31: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   34: invokevirtual g : (Z)Ljava/util/ArrayList;
    //   37: astore #4
    //   39: aload #5
    //   41: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   44: invokevirtual e : (Z)I
    //   47: istore_1
    //   48: goto -> 56
    //   51: aconst_null
    //   52: astore #4
    //   54: iconst_0
    //   55: istore_1
    //   56: aload_0
    //   57: getfield A0 : Lcm0;
    //   60: astore #5
    //   62: aload #5
    //   64: aload #4
    //   66: putfield f : Ljava/util/ArrayList;
    //   69: aload #5
    //   71: iload_1
    //   72: putfield g : I
    //   75: aload #5
    //   77: getfield i : La3;
    //   80: invokevirtual g : ()V
    //   83: aload #5
    //   85: getfield f : Ljava/util/ArrayList;
    //   88: astore #4
    //   90: aload #4
    //   92: ifnull -> 104
    //   95: aload #4
    //   97: invokevirtual size : ()I
    //   100: istore_1
    //   101: goto -> 106
    //   104: iconst_0
    //   105: istore_1
    //   106: aload #5
    //   108: getfield c : Landroid/widget/TextView;
    //   111: astore #4
    //   113: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   116: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   119: astore #6
    //   121: aload #5
    //   123: getfield g : I
    //   126: istore_3
    //   127: iload_1
    //   128: ifle -> 133
    //   131: iconst_1
    //   132: istore_2
    //   133: aload #4
    //   135: aload #6
    //   137: ldc_w 2131886418
    //   140: iconst_2
    //   141: anewarray java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: iload_3
    //   147: iload_2
    //   148: iadd
    //   149: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: iload_1
    //   156: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   159: aastore
    //   160: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   163: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   166: aload #5
    //   168: getfield e : Landroidx/recyclerview/widget/RecyclerView;
    //   171: aload #5
    //   173: getfield g : I
    //   176: invokevirtual k0 : (I)V
    //   179: return
  }
  
  public final void x0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void y0() {
    MusicService musicService = MusicService.P0;
    int i = 0;
    if (musicService != null && this.l0 != null && MusicService.F0) {
      int j = MusicService.E0.A();
      this.Z.setText(ag0.B(j, this.n0, this.l0.c.g));
      if (this.m0 || (this.T0 == -1 && (this.Y0 || this.Z0))) {
        if (j >= 0)
          i = j; 
        Slider slider1 = this.U;
        float f = i;
        ag0.z0(slider1, slider1.getValueFrom(), slider1.getValueTo(), f);
        return;
      } 
      return;
    } 
    this.Z.setText(ag0.B(0L, false, 0));
    Slider slider = this.U;
    ag0.z0(slider, slider.getValueFrom(), slider.getValueTo(), 0.0F);
  }
  
  public final void z0() {
    if (MusicService.P0 != null) {
      km0 km01 = MusicService.y();
      this.l0 = km01;
      if (km01 != null) {
        this.V.setText(MusicService.X0);
        this.W.setText(MusicService.Y0);
        this.X.setText(MusicService.Z0);
        this.Y.setText(ag0.B(this.l0.c.g, false, 0));
        ag0.z0(this.U, 0.0F, this.l0.c.g, 0.0F);
        this.U.setEnabled(true);
        try {
          this.P0 = false;
          MusicService musicService = MusicService.P0;
          if (musicService != null) {
            boolean bool2 = musicService.j;
            TextView textView = this.V;
            if (bool2) {
              textView.setTextColor(getResources().getColor(2131100780));
              this.Z.setTextColor(getResources().getColor(2131100780));
              this.Y.setTextColor(getResources().getColor(2131100780));
              this.b0.setAlpha(0.7F);
              this.e0.setAlpha(0.7F);
              this.a0.setAlpha(0.7F);
              this.b0.setImageResource(2131231063);
              this.U.setTrackActiveTintList(ColorStateList.valueOf(getResources().getColor(2131100780)));
              this.U.setThumbTintList(ColorStateList.valueOf(ag0.g(-16777216, getResources().getColor(2131100780))));
            } else {
              textView.setTextColor(getResources().getColor(2131100755));
              this.Z.setTextColor(getResources().getColor(2131100755));
              this.Y.setTextColor(getResources().getColor(2131100755));
              this.b0.setAlpha(1.0F);
              this.e0.setAlpha(1.0F);
              this.a0.setAlpha(1.0F);
              this.b0.setImageResource(2131231061);
              this.U.setTrackActiveTintList(ColorStateList.valueOf(getResources().getColor(2131100755)));
              this.U.setThumbTintList(ColorStateList.valueOf(ag0.g(-16777216, getResources().getColor(2131100755))));
              if (this.H0)
                this.P0 = true; 
            } 
          } else {
            this.V.setTextColor(getResources().getColor(2131100780));
            this.Z.setTextColor(getResources().getColor(2131100780));
            this.Y.setTextColor(getResources().getColor(2131100780));
            this.b0.setAlpha(0.7F);
            this.e0.setAlpha(0.7F);
            this.a0.setAlpha(0.7F);
            this.b0.setImageResource(2131231063);
            this.U.setTrackActiveTintList(ColorStateList.valueOf(getResources().getColor(2131100780)));
            this.U.setThumbTintList(ColorStateList.valueOf(ag0.g(-16777216, getResources().getColor(2131100780))));
          } 
          boolean bool1 = this.P0;
          ImageView imageView1 = this.g0;
          if (bool1) {
            imageView1.setImageResource(2131231371);
            this.g0.setContentDescription(getString(2131886125));
          } else {
            imageView1.setImageResource(2131231113);
            this.g0.setContentDescription(getString(2131886364));
          } 
        } catch (Exception exception) {}
        y0();
        boolean bool = c81.c((Context)this).c(this.l0);
        ImageView imageView = this.f0;
        if (bool) {
          imageView.setImageResource(2131231058);
        } else {
          imageView.setImageResource(2131231057);
        } 
        w0();
        v0();
        int i = this.k0.getInt("I_LSNBG", 0);
        if (i == 0) {
          ag1 ag1 = MyApplication.v.f(p3.n(this.l0, 2131230842, false));
          ag1.d = true;
          ag1.a();
          ag1.e = 2131099836;
          ag1.c = true;
          ag1.l((cw1)new x61(getResources().getColor(2131099692), getResources().getColor(2131100780), 1));
          ag1.f(this.j0);
        } else if (i == 1) {
          this.j0.setImageDrawable((Drawable)new ColorDrawable(-16777216));
        } else if (i == 2) {
          this.j0.setImageDrawable((Drawable)new ColorDrawable(-2013265920));
        } 
        return;
      } 
    } 
    this.V.setText(2131886999);
    this.W.setText(2131887531);
    this.X.setText(2131887531);
    this.Y.setText(ag0.B(0L, false, 0));
    ag0.z0(this.U, 0.0F, 0.0F, 0.0F);
    this.U.setEnabled(false);
    this.b0.setImageResource(2131231063);
    getWindow().getDecorView().setBackgroundDrawable((Drawable)new ColorDrawable(-16777216));
    y0();
    w0();
    v0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\LockScreenActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */