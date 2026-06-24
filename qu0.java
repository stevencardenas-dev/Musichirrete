import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public final class qu0 extends z3 {
  public static final int s0 = 30000;
  
  public TextView A;
  
  public final boolean B = true;
  
  public final boolean C;
  
  public LinearLayout D;
  
  public RelativeLayout E;
  
  public LinearLayout F;
  
  public View G;
  
  public OverlayListView H;
  
  public pu0 I;
  
  public ArrayList J;
  
  public HashSet K;
  
  public HashSet L;
  
  public HashSet M;
  
  public SeekBar N;
  
  public ou0 O;
  
  public hv0 P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public final int T;
  
  public HashMap U;
  
  public g7 V;
  
  public final nu0 W;
  
  public PlaybackStateCompat X;
  
  public MediaDescriptionCompat Y;
  
  public mu0 Z;
  
  public Bitmap a0;
  
  public Uri b0;
  
  public boolean c0;
  
  public Bitmap d0;
  
  public int e0;
  
  public boolean f0;
  
  public boolean g0;
  
  public boolean h0;
  
  public boolean i0;
  
  public final iv0 j;
  
  public boolean j0;
  
  public final dj k;
  
  public int k0;
  
  public final hv0 l;
  
  public int l0;
  
  public final Context m;
  
  public int m0;
  
  public boolean n;
  
  public Interpolator n0;
  
  public boolean o;
  
  public final Interpolator o0;
  
  public int p;
  
  public final Interpolator p0;
  
  public Button q;
  
  public final AccessibilityManager q0;
  
  public Button r;
  
  public final e3 r0 = new e3(19, this);
  
  public ImageButton s;
  
  public MediaRouteExpandCollapseButton t;
  
  public FrameLayout u;
  
  public LinearLayout v;
  
  public FrameLayout w;
  
  public ImageView x;
  
  public TextView y;
  
  public TextView z;
  
  public qu0(Context paramContext) {
    super(contextThemeWrapper, i);
    Context context = getContext();
    this.m = context;
    this.W = new nu0(this);
    this.j = iv0.d(context);
    this.C = iv0.h();
    this.k = new dj(2, this);
    this.l = iv0.g();
    p(iv0.e());
    this.T = context.getResources().getDimensionPixelSize(2131166112);
    this.q0 = (AccessibilityManager)context.getSystemService("accessibility");
    this.o0 = AnimationUtils.loadInterpolator((Context)contextThemeWrapper, 2131427343);
    this.p0 = AnimationUtils.loadInterpolator((Context)contextThemeWrapper, 2131427342);
  }
  
  public static void o(View paramView, int paramInt) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    layoutParams.height = paramInt;
    paramView.setLayoutParams(layoutParams);
  }
  
  public final void g(View paramView, int paramInt) {
    ju0 ju0 = new ju0(paramView, (paramView.getLayoutParams()).height, paramInt);
    ju0.setDuration(this.k0);
    ju0.setInterpolator(this.n0);
    paramView.startAnimation(ju0);
  }
  
  public final boolean i() {
    return (this.Y != null || this.X != null);
  }
  
  public final void j(boolean paramBoolean) {
    int j = this.H.getFirstVisiblePosition();
    for (int i = 0;; i++) {
      View view;
      int k = this.H.getChildCount();
      OverlayListView overlayListView = this.H;
      if (i < k) {
        view = overlayListView.getChildAt(i);
        hv0 hv01 = (hv0)this.I.getItem(j + i);
        if (paramBoolean) {
          HashSet hashSet = this.K;
          if (hashSet != null && hashSet.contains(hv01))
            continue; 
        } 
        ((LinearLayout)view.findViewById(2131297961)).setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0F, 1.0F);
        alphaAnimation.setDuration(0L);
        animationSet.addAnimation((Animation)alphaAnimation);
        (new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F)).setDuration(0L);
        animationSet.setFillAfter(true);
        animationSet.setFillEnabled(true);
        view.clearAnimation();
        view.startAnimation((Animation)animationSet);
        continue;
      } 
      ArrayList<Object> arrayList = ((OverlayListView)view).b;
      k = arrayList.size();
      i = 0;
      while (i < k) {
        j51 j51 = (j51)arrayList.get(i);
        j = i + 1;
        j51 = j51;
        j51.j = true;
        j51.k = true;
        g7 g71 = j51.l;
        i = j;
        if (g71 != null) {
          qu0 qu01 = (qu0)g71.e;
          qu01.M.remove(g71.c);
          qu01.I.notifyDataSetChanged();
          i = j;
        } 
      } 
      if (!paramBoolean)
        k(false); 
      return;
    } 
  }
  
  public final void k(boolean paramBoolean) {
    this.K = null;
    this.L = null;
    this.i0 = false;
    if (this.j0) {
      this.j0 = false;
      t(paramBoolean);
    } 
    this.H.setEnabled(true);
  }
  
  public final int l(int paramInt1, int paramInt2) {
    int i = this.p;
    if (paramInt1 >= paramInt2) {
      float f3 = i * paramInt2;
      float f4 = paramInt1;
      return (int)(f3 / f4 + 0.5F);
    } 
    float f1 = i * 9.0F;
    float f2 = 16.0F;
    return (int)(f1 / f2 + 0.5F);
  }
  
  public final int m(boolean paramBoolean) {
    if (paramBoolean || this.F.getVisibility() == 0) {
      int i = this.D.getPaddingTop();
      int j = this.D.getPaddingBottom() + i;
      i = j;
      if (paramBoolean)
        i = j + this.E.getMeasuredHeight(); 
      j = i;
      if (this.F.getVisibility() == 0)
        j = i + this.F.getMeasuredHeight(); 
      return (paramBoolean && this.F.getVisibility() == 0) ? (this.G.getMeasuredHeight() + j) : j;
    } 
    return 0;
  }
  
  public final boolean n() {
    hv0 hv01 = this.l;
    return (hv01.e() && Collections.unmodifiableList(hv01.w).size() > 1);
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.o = true;
    cv0 cv0 = cv0.c;
    dj dj1 = this.k;
    this.j.a(cv0, dj1, 2);
    p(iv0.e());
  }
  
  public final void onCreate(Bundle paramBundle) {
    Interpolator interpolator;
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(17170445);
    setContentView(2131493123);
    findViewById(16908315).setVisibility(8);
    lu0 lu01 = new lu0(this, 0);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131297199);
    this.u = frameLayout1;
    frameLayout1.setOnClickListener(new lu0(this, 1));
    LinearLayout linearLayout2 = (LinearLayout)findViewById(2131297198);
    this.v = linearLayout2;
    linearLayout2.setOnClickListener((View.OnClickListener)new Object());
    Context context = this.m;
    int j = qz1.B(context, 0, 2130968930);
    int i = j;
    if (jn.d(j, qz1.B(context, 0, 16842801)) < 3.0D)
      i = qz1.B(context, 0, 2130968892); 
    Button button = (Button)findViewById(16908314);
    this.q = button;
    button.setText(2131886867);
    this.q.setTextColor(i);
    this.q.setOnClickListener(lu01);
    button = (Button)findViewById(16908313);
    this.r = button;
    button.setText(2131886874);
    this.r.setTextColor(i);
    this.r.setOnClickListener(lu01);
    this.A = (TextView)findViewById(2131297203);
    ((ImageButton)findViewById(2131297190)).setOnClickListener(lu01);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131297196);
    this.w = (FrameLayout)findViewById(2131297197);
    lu0 lu02 = new lu0(this, 2);
    ImageView imageView = (ImageView)findViewById(2131297155);
    this.x = imageView;
    imageView.setOnClickListener(lu02);
    findViewById(2131297195).setOnClickListener(lu02);
    this.D = (LinearLayout)findViewById(2131297202);
    this.G = findViewById(2131297191);
    this.E = (RelativeLayout)findViewById(2131297210);
    this.y = (TextView)findViewById(2131297194);
    this.z = (TextView)findViewById(2131297193);
    ImageButton imageButton = (ImageButton)findViewById(2131297192);
    this.s = imageButton;
    imageButton.setOnClickListener(lu01);
    LinearLayout linearLayout1 = (LinearLayout)findViewById(2131297212);
    this.F = linearLayout1;
    linearLayout1.setVisibility(8);
    SeekBar seekBar = (SeekBar)findViewById(2131297215);
    this.N = seekBar;
    hv0 hv01 = this.l;
    seekBar.setTag(hv01);
    ou0 ou01 = new ou0(this);
    this.O = ou01;
    this.N.setOnSeekBarChangeListener(ou01);
    this.H = (OverlayListView)findViewById(2131297213);
    this.J = new ArrayList();
    pu0 pu01 = new pu0(this, this.H.getContext(), this.J);
    this.I = pu01;
    this.H.setAdapter((ListAdapter)pu01);
    this.M = new HashSet();
    LinearLayout linearLayout3 = this.D;
    OverlayListView overlayListView = this.H;
    boolean bool = n();
    int k = qz1.B(context, 0, 2130968930);
    int m = qz1.B(context, 0, 2130968932);
    j = k;
    i = m;
    if (bool) {
      j = k;
      i = m;
      if (qz1.w(context, 0) == -570425344) {
        i = k;
        j = -1;
      } 
    } 
    linearLayout3.setBackgroundColor(j);
    overlayListView.setBackgroundColor(i);
    linearLayout3.setTag(Integer.valueOf(j));
    overlayListView.setTag(Integer.valueOf(i));
    MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider)this.N;
    linearLayout3 = this.D;
    j = qz1.w(context, 0);
    i = j;
    if (Color.alpha(j) != 255)
      i = jn.g(j, ((Integer)linearLayout3.getTag()).intValue()); 
    mediaRouteVolumeSlider.a(i, i);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    this.U = hashMap;
    hashMap.put(hv01, this.N);
    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton)findViewById(2131297200);
    this.t = mediaRouteExpandCollapseButton;
    mediaRouteExpandCollapseButton.k = new lu0(this, 3);
    if (this.h0) {
      interpolator = this.o0;
    } else {
      interpolator = this.p0;
    } 
    this.n0 = interpolator;
    this.k0 = context.getResources().getInteger(2131361843);
    this.l0 = context.getResources().getInteger(2131361844);
    this.m0 = context.getResources().getInteger(2131361845);
    this.n = true;
    s();
  }
  
  public final void onDetachedFromWindow() {
    this.j.j(this.k);
    p(null);
    this.o = false;
    super.onDetachedFromWindow();
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 25 || paramInt == 24) {
      if (this.C || !this.h0) {
        if (paramInt == 25) {
          paramInt = -1;
        } else {
          paramInt = 1;
        } 
        this.l.k(paramInt);
      } 
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    return (paramInt == 25 || paramInt == 24) ? true : super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void p(MediaSessionCompat.Token paramToken) {
    // Byte code:
    //   0: aload_0
    //   1: getfield W : Lnu0;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield V : Lg7;
    //   9: astore #4
    //   11: aconst_null
    //   12: astore_2
    //   13: aload #4
    //   15: ifnull -> 29
    //   18: aload #4
    //   20: aload_3
    //   21: invokevirtual L : (Lnu0;)V
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield V : Lg7;
    //   29: aload_1
    //   30: ifnonnull -> 36
    //   33: goto -> 43
    //   36: aload_0
    //   37: getfield o : Z
    //   40: ifne -> 44
    //   43: return
    //   44: new g7
    //   47: dup
    //   48: aload_0
    //   49: getfield m : Landroid/content/Context;
    //   52: aload_1
    //   53: invokespecial <init> : (Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    //   56: astore #4
    //   58: aload_0
    //   59: aload #4
    //   61: putfield V : Lg7;
    //   64: aload_3
    //   65: ifnull -> 251
    //   68: aload #4
    //   70: getfield e : Ljava/lang/Object;
    //   73: checkcast java/util/Set
    //   76: aload_3
    //   77: invokeinterface add : (Ljava/lang/Object;)Z
    //   82: ifne -> 98
    //   85: ldc_w 'MediaControllerCompat'
    //   88: ldc_w 'the callback has already been registered'
    //   91: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   94: pop
    //   95: goto -> 257
    //   98: new android/os/Handler
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: astore_1
    //   106: aload_3
    //   107: aload_1
    //   108: invokevirtual e : (Landroid/os/Handler;)V
    //   111: aload #4
    //   113: getfield c : Ljava/lang/Object;
    //   116: checkcast android/support/v4/media/session/b
    //   119: astore #4
    //   121: aload #4
    //   123: getfield a : Landroid/media/session/MediaController;
    //   126: aload_3
    //   127: getfield a : Lzs0;
    //   130: aload_1
    //   131: invokevirtual registerCallback : (Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V
    //   134: aload #4
    //   136: getfield b : Ljava/lang/Object;
    //   139: astore_1
    //   140: aload_1
    //   141: monitorenter
    //   142: aload #4
    //   144: getfield e : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   147: invokevirtual b : ()Llg0;
    //   150: ifnull -> 227
    //   153: new bt0
    //   156: astore #5
    //   158: aload #5
    //   160: aload_3
    //   161: invokespecial <init> : (Lnu0;)V
    //   164: aload #4
    //   166: getfield d : Ljava/util/HashMap;
    //   169: aload_3
    //   170: aload #5
    //   172: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   175: pop
    //   176: aload_3
    //   177: aload #5
    //   179: putfield c : Lbt0;
    //   182: aload #4
    //   184: getfield e : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   187: invokevirtual b : ()Llg0;
    //   190: aload #5
    //   192: invokeinterface L : (Ljg0;)V
    //   197: aload_3
    //   198: bipush #13
    //   200: aconst_null
    //   201: aconst_null
    //   202: invokevirtual d : (ILjava/lang/Object;Landroid/os/Bundle;)V
    //   205: goto -> 242
    //   208: astore_2
    //   209: goto -> 247
    //   212: astore_3
    //   213: ldc_w 'MediaControllerCompat'
    //   216: ldc_w 'Dead object in registerCallback.'
    //   219: aload_3
    //   220: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   223: pop
    //   224: goto -> 242
    //   227: aload_3
    //   228: aconst_null
    //   229: putfield c : Lbt0;
    //   232: aload #4
    //   234: getfield c : Ljava/util/ArrayList;
    //   237: aload_3
    //   238: invokevirtual add : (Ljava/lang/Object;)Z
    //   241: pop
    //   242: aload_1
    //   243: monitorexit
    //   244: goto -> 257
    //   247: aload_1
    //   248: monitorexit
    //   249: aload_2
    //   250: athrow
    //   251: ldc_w 'callback must not be null'
    //   254: invokestatic l : (Ljava/lang/String;)V
    //   257: aload_0
    //   258: getfield V : Lg7;
    //   261: getfield c : Ljava/lang/Object;
    //   264: checkcast android/support/v4/media/session/b
    //   267: getfield a : Landroid/media/session/MediaController;
    //   270: invokevirtual getMetadata : ()Landroid/media/MediaMetadata;
    //   273: astore_1
    //   274: aload_1
    //   275: ifnull -> 286
    //   278: aload_1
    //   279: invokestatic b : (Landroid/media/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;
    //   282: astore_1
    //   283: goto -> 288
    //   286: aconst_null
    //   287: astore_1
    //   288: aload_1
    //   289: ifnonnull -> 297
    //   292: aconst_null
    //   293: astore_1
    //   294: goto -> 302
    //   297: aload_1
    //   298: invokevirtual e : ()Landroid/support/v4/media/MediaDescriptionCompat;
    //   301: astore_1
    //   302: aload_0
    //   303: aload_1
    //   304: putfield Y : Landroid/support/v4/media/MediaDescriptionCompat;
    //   307: aload_0
    //   308: getfield V : Lg7;
    //   311: getfield c : Ljava/lang/Object;
    //   314: checkcast android/support/v4/media/session/b
    //   317: astore_3
    //   318: aload_3
    //   319: getfield e : Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   322: astore_1
    //   323: aload_1
    //   324: invokevirtual b : ()Llg0;
    //   327: ifnull -> 355
    //   330: aload_1
    //   331: invokevirtual b : ()Llg0;
    //   334: invokeinterface j : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   339: astore_1
    //   340: goto -> 374
    //   343: astore_1
    //   344: ldc_w 'MediaControllerCompat'
    //   347: ldc_w 'Dead object in getPlaybackState.'
    //   350: aload_1
    //   351: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   354: pop
    //   355: aload_3
    //   356: getfield a : Landroid/media/session/MediaController;
    //   359: invokevirtual getPlaybackState : ()Landroid/media/session/PlaybackState;
    //   362: astore_3
    //   363: aload_2
    //   364: astore_1
    //   365: aload_3
    //   366: ifnull -> 374
    //   369: aload_3
    //   370: invokestatic b : (Landroid/media/session/PlaybackState;)Landroid/support/v4/media/session/PlaybackStateCompat;
    //   373: astore_1
    //   374: aload_0
    //   375: aload_1
    //   376: putfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   379: aload_0
    //   380: invokevirtual r : ()V
    //   383: aload_0
    //   384: iconst_0
    //   385: invokevirtual q : (Z)V
    //   388: return
    // Exception table:
    //   from	to	target	type
    //   142	182	208	finally
    //   182	205	212	android/os/RemoteException
    //   182	205	208	finally
    //   213	224	208	finally
    //   227	242	208	finally
    //   242	244	208	finally
    //   247	249	208	finally
    //   330	340	343	android/os/RemoteException
  }
  
  public final void q(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield P : Lhv0;
    //   4: astore #9
    //   6: iconst_1
    //   7: istore #4
    //   9: aload #9
    //   11: ifnull -> 30
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield f0 : Z
    //   19: aload_0
    //   20: iload_1
    //   21: aload_0
    //   22: getfield g0 : Z
    //   25: ior
    //   26: putfield g0 : Z
    //   29: return
    //   30: iconst_0
    //   31: istore #5
    //   33: aload_0
    //   34: iconst_0
    //   35: putfield f0 : Z
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield g0 : Z
    //   43: aload_0
    //   44: getfield l : Lhv0;
    //   47: astore #11
    //   49: aload #11
    //   51: invokevirtual g : ()Z
    //   54: ifeq -> 895
    //   57: aload #11
    //   59: invokevirtual d : ()Z
    //   62: ifeq -> 68
    //   65: goto -> 895
    //   68: aload_0
    //   69: getfield n : Z
    //   72: ifne -> 76
    //   75: return
    //   76: aload_0
    //   77: getfield A : Landroid/widget/TextView;
    //   80: aload #11
    //   82: getfield d : Ljava/lang/String;
    //   85: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   88: aload_0
    //   89: getfield q : Landroid/widget/Button;
    //   92: astore #9
    //   94: aload #11
    //   96: getfield j : Z
    //   99: ifeq -> 107
    //   102: iconst_0
    //   103: istore_2
    //   104: goto -> 110
    //   107: bipush #8
    //   109: istore_2
    //   110: aload #9
    //   112: iload_2
    //   113: invokevirtual setVisibility : (I)V
    //   116: aload_0
    //   117: getfield c0 : Z
    //   120: istore #7
    //   122: aconst_null
    //   123: astore #10
    //   125: iload #7
    //   127: ifeq -> 222
    //   130: aload_0
    //   131: getfield d0 : Landroid/graphics/Bitmap;
    //   134: astore #9
    //   136: aload #9
    //   138: ifnull -> 185
    //   141: aload #9
    //   143: invokevirtual isRecycled : ()Z
    //   146: ifeq -> 185
    //   149: new java/lang/StringBuilder
    //   152: dup
    //   153: ldc_w 'Can't set artwork image with recycled bitmap: '
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: astore #9
    //   161: aload #9
    //   163: aload_0
    //   164: getfield d0 : Landroid/graphics/Bitmap;
    //   167: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: ldc 'MediaRouteCtrlDialog'
    //   173: aload #9
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   181: pop
    //   182: goto -> 207
    //   185: aload_0
    //   186: getfield x : Landroid/widget/ImageView;
    //   189: aload_0
    //   190: getfield d0 : Landroid/graphics/Bitmap;
    //   193: invokevirtual setImageBitmap : (Landroid/graphics/Bitmap;)V
    //   196: aload_0
    //   197: getfield x : Landroid/widget/ImageView;
    //   200: aload_0
    //   201: getfield e0 : I
    //   204: invokevirtual setBackgroundColor : (I)V
    //   207: aload_0
    //   208: iconst_0
    //   209: putfield c0 : Z
    //   212: aload_0
    //   213: aconst_null
    //   214: putfield d0 : Landroid/graphics/Bitmap;
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield e0 : I
    //   222: aload_0
    //   223: getfield C : Z
    //   226: istore #7
    //   228: iload #7
    //   230: ifne -> 298
    //   233: aload_0
    //   234: invokevirtual n : ()Z
    //   237: ifeq -> 298
    //   240: aload_0
    //   241: getfield F : Landroid/widget/LinearLayout;
    //   244: bipush #8
    //   246: invokevirtual setVisibility : (I)V
    //   249: aload_0
    //   250: iconst_1
    //   251: putfield h0 : Z
    //   254: aload_0
    //   255: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   258: iconst_0
    //   259: invokevirtual setVisibility : (I)V
    //   262: aload_0
    //   263: getfield h0 : Z
    //   266: ifeq -> 278
    //   269: aload_0
    //   270: getfield o0 : Landroid/view/animation/Interpolator;
    //   273: astore #9
    //   275: goto -> 284
    //   278: aload_0
    //   279: getfield p0 : Landroid/view/animation/Interpolator;
    //   282: astore #9
    //   284: aload_0
    //   285: aload #9
    //   287: putfield n0 : Landroid/view/animation/Interpolator;
    //   290: aload_0
    //   291: iconst_0
    //   292: invokevirtual t : (Z)V
    //   295: goto -> 430
    //   298: aload_0
    //   299: getfield h0 : Z
    //   302: ifeq -> 310
    //   305: iload #7
    //   307: ifeq -> 421
    //   310: aload_0
    //   311: getfield B : Z
    //   314: ifeq -> 421
    //   317: aload #11
    //   319: invokevirtual e : ()Z
    //   322: ifeq -> 336
    //   325: invokestatic h : ()Z
    //   328: ifne -> 336
    //   331: iconst_0
    //   332: istore_2
    //   333: goto -> 342
    //   336: aload #11
    //   338: getfield o : I
    //   341: istore_2
    //   342: iload_2
    //   343: iconst_1
    //   344: if_icmpne -> 421
    //   347: aload_0
    //   348: getfield F : Landroid/widget/LinearLayout;
    //   351: invokevirtual getVisibility : ()I
    //   354: bipush #8
    //   356: if_icmpne -> 430
    //   359: aload_0
    //   360: getfield F : Landroid/widget/LinearLayout;
    //   363: iconst_0
    //   364: invokevirtual setVisibility : (I)V
    //   367: aload_0
    //   368: getfield N : Landroid/widget/SeekBar;
    //   371: aload #11
    //   373: getfield q : I
    //   376: invokevirtual setMax : (I)V
    //   379: aload_0
    //   380: getfield N : Landroid/widget/SeekBar;
    //   383: aload #11
    //   385: getfield p : I
    //   388: invokevirtual setProgress : (I)V
    //   391: aload_0
    //   392: getfield t : Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;
    //   395: astore #9
    //   397: aload_0
    //   398: invokevirtual n : ()Z
    //   401: ifeq -> 409
    //   404: iconst_0
    //   405: istore_2
    //   406: goto -> 412
    //   409: bipush #8
    //   411: istore_2
    //   412: aload #9
    //   414: iload_2
    //   415: invokevirtual setVisibility : (I)V
    //   418: goto -> 430
    //   421: aload_0
    //   422: getfield F : Landroid/widget/LinearLayout;
    //   425: bipush #8
    //   427: invokevirtual setVisibility : (I)V
    //   430: aload_0
    //   431: invokevirtual i : ()Z
    //   434: ifeq -> 889
    //   437: aload_0
    //   438: getfield Y : Landroid/support/v4/media/MediaDescriptionCompat;
    //   441: astore #9
    //   443: aload #9
    //   445: ifnonnull -> 454
    //   448: aconst_null
    //   449: astore #9
    //   451: goto -> 461
    //   454: aload #9
    //   456: getfield c : Ljava/lang/CharSequence;
    //   459: astore #9
    //   461: aload #9
    //   463: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   466: istore #8
    //   468: aload_0
    //   469: getfield Y : Landroid/support/v4/media/MediaDescriptionCompat;
    //   472: astore #12
    //   474: aload #12
    //   476: ifnonnull -> 482
    //   479: goto -> 489
    //   482: aload #12
    //   484: getfield e : Ljava/lang/CharSequence;
    //   487: astore #10
    //   489: aload #10
    //   491: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   494: istore #7
    //   496: aload #11
    //   498: getfield s : I
    //   501: iconst_m1
    //   502: if_icmpeq -> 522
    //   505: aload_0
    //   506: getfield y : Landroid/widget/TextView;
    //   509: ldc_w 2131886864
    //   512: invokevirtual setText : (I)V
    //   515: iconst_0
    //   516: istore_2
    //   517: iconst_1
    //   518: istore_3
    //   519: goto -> 637
    //   522: aload_0
    //   523: getfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   526: astore #11
    //   528: aload #11
    //   530: ifnull -> 624
    //   533: aload #11
    //   535: getfield b : I
    //   538: ifne -> 544
    //   541: goto -> 624
    //   544: iload #8
    //   546: ifeq -> 567
    //   549: iload #7
    //   551: ifeq -> 567
    //   554: aload_0
    //   555: getfield y : Landroid/widget/TextView;
    //   558: ldc_w 2131886869
    //   561: invokevirtual setText : (I)V
    //   564: goto -> 515
    //   567: iload #8
    //   569: ifne -> 586
    //   572: aload_0
    //   573: getfield y : Landroid/widget/TextView;
    //   576: aload #9
    //   578: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   581: iconst_1
    //   582: istore_2
    //   583: goto -> 588
    //   586: iconst_0
    //   587: istore_2
    //   588: iload #7
    //   590: ifne -> 613
    //   593: aload_0
    //   594: getfield z : Landroid/widget/TextView;
    //   597: aload #10
    //   599: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   602: iconst_1
    //   603: istore #6
    //   605: iload_2
    //   606: istore_3
    //   607: iload #6
    //   609: istore_2
    //   610: goto -> 637
    //   613: iconst_0
    //   614: istore #6
    //   616: iload_2
    //   617: istore_3
    //   618: iload #6
    //   620: istore_2
    //   621: goto -> 637
    //   624: aload_0
    //   625: getfield y : Landroid/widget/TextView;
    //   628: ldc_w 2131886870
    //   631: invokevirtual setText : (I)V
    //   634: goto -> 515
    //   637: aload_0
    //   638: getfield y : Landroid/widget/TextView;
    //   641: astore #9
    //   643: iload_3
    //   644: ifeq -> 652
    //   647: iconst_0
    //   648: istore_3
    //   649: goto -> 655
    //   652: bipush #8
    //   654: istore_3
    //   655: aload #9
    //   657: iload_3
    //   658: invokevirtual setVisibility : (I)V
    //   661: aload_0
    //   662: getfield z : Landroid/widget/TextView;
    //   665: astore #9
    //   667: iload_2
    //   668: ifeq -> 676
    //   671: iconst_0
    //   672: istore_2
    //   673: goto -> 679
    //   676: bipush #8
    //   678: istore_2
    //   679: aload #9
    //   681: iload_2
    //   682: invokevirtual setVisibility : (I)V
    //   685: aload_0
    //   686: getfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   689: astore #9
    //   691: aload #9
    //   693: ifnull -> 889
    //   696: aload #9
    //   698: getfield b : I
    //   701: istore_2
    //   702: iload_2
    //   703: bipush #6
    //   705: if_icmpeq -> 721
    //   708: iload_2
    //   709: iconst_3
    //   710: if_icmpne -> 716
    //   713: goto -> 721
    //   716: iconst_0
    //   717: istore_2
    //   718: goto -> 723
    //   721: iconst_1
    //   722: istore_2
    //   723: aload_0
    //   724: getfield s : Landroid/widget/ImageButton;
    //   727: invokevirtual getContext : ()Landroid/content/Context;
    //   730: astore #10
    //   732: iload_2
    //   733: ifeq -> 763
    //   736: aload_0
    //   737: getfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   740: getfield g : J
    //   743: ldc2_w 514
    //   746: land
    //   747: lconst_0
    //   748: lcmp
    //   749: ifeq -> 763
    //   752: ldc_w 2130969650
    //   755: istore_2
    //   756: ldc_w 2131886871
    //   759: istore_3
    //   760: goto -> 830
    //   763: iload_2
    //   764: ifeq -> 792
    //   767: aload_0
    //   768: getfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   771: getfield g : J
    //   774: lconst_1
    //   775: land
    //   776: lconst_0
    //   777: lcmp
    //   778: ifeq -> 792
    //   781: ldc_w 2130969654
    //   784: istore_2
    //   785: ldc_w 2131886873
    //   788: istore_3
    //   789: goto -> 830
    //   792: iload_2
    //   793: ifne -> 823
    //   796: aload_0
    //   797: getfield X : Landroid/support/v4/media/session/PlaybackStateCompat;
    //   800: getfield g : J
    //   803: ldc2_w 516
    //   806: land
    //   807: lconst_0
    //   808: lcmp
    //   809: ifeq -> 823
    //   812: ldc_w 2130969651
    //   815: istore_2
    //   816: ldc_w 2131886872
    //   819: istore_3
    //   820: goto -> 830
    //   823: iconst_0
    //   824: istore #4
    //   826: iconst_0
    //   827: istore_2
    //   828: iload_2
    //   829: istore_3
    //   830: aload_0
    //   831: getfield s : Landroid/widget/ImageButton;
    //   834: astore #9
    //   836: iload #4
    //   838: ifeq -> 844
    //   841: goto -> 848
    //   844: bipush #8
    //   846: istore #5
    //   848: aload #9
    //   850: iload #5
    //   852: invokevirtual setVisibility : (I)V
    //   855: iload #4
    //   857: ifeq -> 889
    //   860: aload_0
    //   861: getfield s : Landroid/widget/ImageButton;
    //   864: aload #10
    //   866: iload_2
    //   867: invokestatic C : (Landroid/content/Context;I)I
    //   870: invokevirtual setImageResource : (I)V
    //   873: aload_0
    //   874: getfield s : Landroid/widget/ImageButton;
    //   877: aload #10
    //   879: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   882: iload_3
    //   883: invokevirtual getText : (I)Ljava/lang/CharSequence;
    //   886: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   889: aload_0
    //   890: iload_1
    //   891: invokevirtual t : (Z)V
    //   894: return
    //   895: aload_0
    //   896: invokevirtual dismiss : ()V
    //   899: return
  }
  
  public final void r() {
    Bitmap bitmap1;
    Bitmap bitmap2;
    Uri uri2;
    MediaDescriptionCompat mediaDescriptionCompat = this.Y;
    Uri uri1 = null;
    if (mediaDescriptionCompat == null) {
      bitmap1 = null;
    } else {
      bitmap1 = mediaDescriptionCompat.g;
    } 
    if (mediaDescriptionCompat != null)
      uri1 = mediaDescriptionCompat.h; 
    mu0 mu01 = this.Z;
    if (mu01 == null) {
      bitmap2 = this.a0;
    } else {
      bitmap2 = mu01.a;
    } 
    if (mu01 == null) {
      uri2 = this.b0;
    } else {
      uri2 = ((mu0)uri2).b;
    } 
    if ((bitmap2 != bitmap1 || (bitmap2 == null && (uri2 == null || !uri2.equals(uri1)) && (uri2 != null || uri1 != null))) && (!n() || this.C)) {
      mu0 mu02 = this.Z;
      if (mu02 != null)
        mu02.cancel(true); 
      mu02 = new mu0(this);
      this.Z = mu02;
      mu02.execute((Object[])new Void[0]);
    } 
  }
  
  public final void s() {
    Context context = this.m;
    int i = z51.m(context);
    getWindow().setLayout(i, -2);
    View view = getWindow().getDecorView();
    this.p = i - view.getPaddingLeft() - view.getPaddingRight();
    Resources resources = context.getResources();
    this.Q = resources.getDimensionPixelSize(2131166110);
    this.R = resources.getDimensionPixelSize(2131166109);
    this.S = resources.getDimensionPixelSize(2131166111);
    this.a0 = null;
    this.b0 = null;
    r();
    q(false);
  }
  
  public final void t(boolean paramBoolean) {
    this.w.requestLayout();
    this.w.getViewTreeObserver().addOnGlobalLayoutListener(new iu0(this, paramBoolean));
  }
  
  public final void u(boolean paramBoolean) {
    View view = this.G;
    int i = this.F.getVisibility();
    boolean bool = false;
    if (i == 0 && paramBoolean) {
      i = 0;
    } else {
      i = 8;
    } 
    view.setVisibility(i);
    LinearLayout linearLayout = this.D;
    i = bool;
    if (this.F.getVisibility() == 8) {
      i = bool;
      if (!paramBoolean)
        i = 8; 
    } 
    linearLayout.setVisibility(i);
  }
  
  static {
    Log.isLoggable("MediaRouteCtrlDialog", 3);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */