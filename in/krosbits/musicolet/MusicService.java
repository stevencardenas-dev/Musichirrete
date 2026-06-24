package in.krosbits.musicolet;

import a60;
import ag0;
import ag1;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.media.audiofx.EnvironmentalReverb;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.f;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;
import au0;
import b71;
import bh0;
import bl1;
import bz0;
import c70;
import c81;
import cl1;
import cn;
import com.android.billingclient.api.wH.DJqHMztxflt;
import cv0;
import cz0;
import dc;
import dj;
import dv0;
import e91;
import ec;
import ew0;
import ez0;
import f;
import f01;
import fc;
import fz0;
import g92;
import gc;
import gz0;
import hc;
import hi;
import hz0;
import in.krosbits.musicolet.providers.AAProvider;
import in.krosbits.utils.SgV.YbNJ;
import iv0;
import iz0;
import j01;
import j50;
import j61;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jz;
import jz0;
import k5;
import kd;
import kj;
import km0;
import kt1;
import kz0;
import l0;
import l3;
import lb1;
import m01;
import ms0;
import my0;
import n0;
import n21;
import of;
import oj;
import ow;
import p01;
import p3;
import qn1;
import r9;
import ss0;
import ty;
import v00;
import v61;
import v71;
import ve;
import wk1;
import wn1;
import wo;
import ws2;
import xn1;
import yk1;
import yp1;
import yv0;
import yy0;
import z21;
import z71;
import zo2;

public class MusicService extends Service implements gc, fc, ec, dc, AudioManager.OnAudioFocusChangeListener {
  public static boolean C0 = false;
  
  public static int D0 = 1;
  
  public static hc E0;
  
  public static boolean F0 = false;
  
  public static boolean G0 = false;
  
  public static boolean H0 = false;
  
  public static int I0 = 0;
  
  public static int J0 = -1;
  
  public static ow K0;
  
  public static ve L0;
  
  public static ve M0;
  
  public static e91 N0;
  
  public static EnvironmentalReverb O0;
  
  public static MusicService P0;
  
  public static long Q0;
  
  public static int R0;
  
  public static int S0;
  
  public static String T0;
  
  public static final l3 U0 = new l3(6);
  
  public static wo V0;
  
  public static km0 W0;
  
  public static String X0;
  
  public static String Y0;
  
  public static String Z0;
  
  public static boolean a1;
  
  public static final Handler b1;
  
  public static final l3 c1 = new l3(7);
  
  public static AudioAttributes d1;
  
  public static final ExecutorService e1 = Executors.newSingleThreadExecutor();
  
  public static final ExecutorService f1 = Executors.newSingleThreadExecutor();
  
  public static boolean g1;
  
  public static final hi h1 = new hi(100);
  
  public long A;
  
  public kj A0;
  
  public long B;
  
  public final of B0;
  
  public PendingIntent C;
  
  public PendingIntent D;
  
  public ScheduledThreadPoolExecutor E;
  
  public ScheduledFuture F;
  
  public j61 G;
  
  public r9 H;
  
  public long I;
  
  public int J;
  
  public final r9 K;
  
  public gz0 L;
  
  public hz0 M;
  
  public boolean N;
  
  public boolean O;
  
  public boolean P;
  
  public int Q;
  
  public int R;
  
  public boolean S;
  
  public final r9 T;
  
  public boolean U;
  
  public boolean V;
  
  public boolean W;
  
  public boolean X;
  
  public boolean Y;
  
  public long Z;
  
  public Runnable a0;
  
  public long b;
  
  public long b0;
  
  public int c;
  
  public gz0 c0;
  
  public yy0 d0;
  
  public long e;
  
  public b71 e0;
  
  public boolean f;
  
  public r9 f0;
  
  public boolean g;
  
  public final gz0 g0;
  
  public int h;
  
  public LockScreenReceiver h0;
  
  public km0 i;
  
  public boolean i0;
  
  public boolean j;
  
  public boolean j0;
  
  public boolean k;
  
  public boolean k0;
  
  public boolean l;
  
  public PowerManager.WakeLock l0;
  
  public boolean m;
  
  public boolean m0;
  
  public boolean n;
  
  public final LinkedList n0;
  
  public final r9 o;
  
  public final hz0 o0;
  
  public boolean p;
  
  public int p0;
  
  public int q;
  
  public c70 q0;
  
  public boolean r;
  
  public MyReceiver r0;
  
  public MusicActivity s;
  
  public final r9 s0;
  
  public SharedPreferences t;
  
  public final dj t0;
  
  public SharedPreferences u;
  
  public final au0 u0;
  
  public Handler v;
  
  public final iz0 v0;
  
  public boolean w;
  
  public AudioFocusRequest w0;
  
  public boolean x;
  
  public int x0;
  
  public boolean y;
  
  public bl1 y0;
  
  public kz0 z;
  
  public bh0 z0;
  
  public MusicService() {
    iz0 iz01;
    this.k = false;
    this.o = new r9(this, 3);
    this.q = 240;
    this.r = false;
    this.w = false;
    this.A = System.currentTimeMillis();
    au0 au02 = null;
    this.E = null;
    this.H = new r9(this, 4);
    this.I = 0L;
    this.J = 0;
    this.K = new r9(this, 5);
    this.L = new gz0(this, 0);
    this.Q = -1;
    this.R = -1;
    this.T = new r9(this, 6);
    this.Z = 0L;
    this.a0 = null;
    this.b0 = 0L;
    this.c0 = new gz0(this, 1);
    this.d0 = new yy0((ContextWrapper)this, 1);
    this.f0 = new r9(this, 7);
    this.g0 = new gz0(this, 2);
    this.n0 = new LinkedList();
    this.o0 = new hz0(this, 0);
    this.s0 = new r9(this, 8);
    this.t0 = new dj(3, this);
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      au01 = new au0(2, this);
    } else {
      au01 = null;
    } 
    this.u0 = au01;
    au0 au01 = au02;
    if (i >= 31)
      iz01 = new iz0(this); 
    this.v0 = iz01;
    this.x0 = -1;
    Object object = new Object();
    ((of)object).d = new ty(1, object);
    ((of)object).a = false;
    this.B0 = (of)object;
  }
  
  public static boolean K() {
    return (MyApplication.e().getMode() != 0);
  }
  
  public static void K0() {
    EnvironmentalReverb environmentalReverb;
    ow ow1 = K0;
    if (ow1 != null)
      try {
        ow1.c(false, F0);
      } finally {
        ow1 = null;
      }  
    ve ve1 = L0;
    if (ve1 != null)
      try {
        ve1.b(false);
      } finally {
        ve1 = null;
      }  
    ve1 = M0;
    if (ve1 != null)
      try {
        ve1.b(false);
      } finally {
        ve1 = null;
      }  
    e91 e911 = N0;
    if (e911 != null)
      try {
        e911.b(false);
      } finally {
        e911 = null;
      }  
    try {
      j50.w(E0);
    } finally {
      e911 = null;
    } 
    if (environmentalReverb != null)
      try {
        environmentalReverb.setEnabled(false);
      } finally {
        environmentalReverb = null;
      }  
  }
  
  public static boolean L() {
    return (MyApplication.e().isBluetoothA2dpOn() || MyApplication.e().isWiredHeadsetOn());
  }
  
  public static void M0() {
    try {
      p01 p01 = ew0.a(MyApplication.i.getApplicationContext());
      MediaMetadata mediaMetadata = ((f)((j01)p01.e).c).a.getMetadata();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void O0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void Q0(Context paramContext) {
    R0(paramContext);
    S0(paramContext);
    T0(paramContext);
  }
  
  public static void R0(Context paramContext) {
    try {
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static void S0(Context paramContext) {
    try {
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static void T0(Context paramContext) {
    try {
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public static void Z() {
    if (ws2.U() && j50.u()) {
      int j = MyApplication.o().getInt("k_i_rgm", 0);
      int i = MyApplication.o().getInt("k_i_crgvcns", 2);
      if (j != 0 && i != 0) {
        jz0 jz0 = new jz0(j, i);
        String str = ag0.a;
        jz0.executeOnExecutor(e1, new Object[0]);
      } 
    } 
  }
  
  public static void b(MusicService paramMusicService) {
    r9 r91 = paramMusicService.s0;
    if (paramMusicService.w && F0) {
      Handler handler = paramMusicService.v;
      if (handler != null)
        try {
          handler.removeCallbacks((Runnable)r91);
          paramMusicService.v.postDelayed((Runnable)r91, 1000L);
          return;
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    } 
  }
  
  public static void c(int paramInt, HashSet<km0> paramHashSet) {
    km0 km01 = y();
    if (km01 != null) {
      qn1 qn1 = km01.c;
      wn1 wn1 = MyApplication.j;
      wo wo1 = qn1.f;
      String str = qn1.c;
      float[] arrayOfFloat = wn1.k(ag0.Q0(wo1));
      if (arrayOfFloat != null && arrayOfFloat.length >= 2) {
        if (paramInt == 1) {
          if (arrayOfFloat[0] == -999.0F)
            paramHashSet.add(km01); 
        } else if (paramInt == 2 && arrayOfFloat[1] == -999.0F) {
          String str1 = str;
          if (km01.i.equals(str))
            str1 = ReplayGainReadCalcService.a(km01); 
          if (str1 != null) {
            str1 = str1.trim();
            if (!str1.isEmpty() && !"<unknown>".equals(str1))
              paramHashSet.add(km01); 
          } 
        } 
      } else {
        paramHashSet.add(km01);
      } 
      km0 km02 = P0.V(1, true, true, new String[1]);
      if (km02 != null) {
        qn1 qn11 = km02.c;
        if (!km02.equals(km01)) {
          wn1 wn11 = MyApplication.j;
          wo wo2 = qn11.f;
          String str1 = qn11.c;
          float[] arrayOfFloat1 = wn11.k(ag0.Q0(wo2));
          if (arrayOfFloat1 != null && arrayOfFloat1.length >= 2) {
            if (paramInt == 1) {
              if (arrayOfFloat1[0] == -999.0F) {
                paramHashSet.add(km02);
                return;
              } 
            } else if (paramInt == 2 && arrayOfFloat1[1] == -999.0F) {
              String str2 = str1;
              if (km02.i.equals(str1))
                str2 = ReplayGainReadCalcService.a(km02); 
              if (str2 != null) {
                str2 = str2.trim();
                if (!str2.isEmpty() && !"<unknown>".equals(str2)) {
                  paramHashSet.add(km02);
                  return;
                } 
              } 
            } 
          } else {
            paramHashSet.add(km02);
          } 
        } 
      } 
    } 
  }
  
  public static void c0() {
    K0();
    ow ow1 = K0;
    if (ow1 != null)
      try {
        ow1.a();
      } finally {
        ow1 = null;
      }  
    ve ve1 = L0;
    if (ve1 != null)
      try {
        ve1.a();
      } finally {
        ve1 = null;
      }  
    ve1 = M0;
    if (ve1 != null)
      try {
        ve1.a();
      } finally {
        ve1 = null;
      }  
    e91 e911 = N0;
    if (e911 != null)
      try {
        e911.a();
      } finally {
        e911 = null;
      }  
    EnvironmentalReverb environmentalReverb = O0;
    if (environmentalReverb != null)
      try {
        environmentalReverb.release();
      } finally {
        environmentalReverb = null;
      }  
  }
  
  public static void m() {
    kd kd;
    hc hc1 = E0;
    if (hc1 instanceof kd) {
      kd = (kd)hc1;
      if (kd.x) {
        try {
          StringBuilder stringBuilder = new StringBuilder();
          this("bpp:cfote>");
          stringBuilder.append(kd.m);
          n21.F(stringBuilder.toString());
          hc hc3 = kd.m;
          if (hc3.h != null) {
            if (hc3.j) {
              hc3.j = false;
              hc3.c0(100);
            } 
            kd.m.h.a(true);
          } 
        } finally {
          Exception exception;
        } 
        hc hc2 = kd.n;
        if (hc2.h != null) {
          if (hc2.j) {
            hc2.j = false;
            hc2.c0(100);
          } 
          kd.n.h.a(true);
        } 
      } else {
        return;
      } 
    } else {
      return;
    } 
    kd.x = false;
  }
  
  public static void q0(boolean paramBoolean) {
    // Byte code:
    //   0: ldc in/krosbits/musicolet/MusicService
    //   2: monitorenter
    //   3: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 206
    //   11: aload_3
    //   12: getfield c : Llm0;
    //   15: ifnonnull -> 21
    //   18: goto -> 206
    //   21: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   24: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   27: invokevirtual getFilesDir : ()Ljava/io/File;
    //   30: astore_3
    //   31: new java/io/File
    //   34: astore #4
    //   36: aload #4
    //   38: aload_3
    //   39: ldc_w '0.qstk'
    //   42: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   45: new java/io/File
    //   48: astore #5
    //   50: aload #5
    //   52: aload_3
    //   53: ldc_w 'a.qstk'
    //   56: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   59: iload_0
    //   60: ifeq -> 116
    //   63: invokestatic h : ()Lwk1;
    //   66: getfield e : Z
    //   69: istore_0
    //   70: iload_0
    //   71: ifne -> 116
    //   74: aload #5
    //   76: invokestatic w : ()[I
    //   79: invokestatic e : (Ljava/io/File;[I)V
    //   82: iconst_1
    //   83: istore_1
    //   84: iconst_1
    //   85: istore_2
    //   86: invokestatic h : ()Lwk1;
    //   89: iconst_0
    //   90: putfield f : Z
    //   93: goto -> 118
    //   96: astore_3
    //   97: iload_2
    //   98: istore_1
    //   99: goto -> 105
    //   102: astore_3
    //   103: iconst_0
    //   104: istore_1
    //   105: aload_3
    //   106: invokevirtual printStackTrace : ()V
    //   109: goto -> 118
    //   112: astore_3
    //   113: goto -> 210
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_1
    //   119: ifne -> 202
    //   122: new java/lang/StringBuilder
    //   125: astore_3
    //   126: aload_3
    //   127: ldc_w 'MS>SQA>QQA: '
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: aload_3
    //   134: aload #4
    //   136: invokevirtual isFile : ()Z
    //   139: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_3
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: invokestatic F : (Ljava/lang/String;)V
    //   150: aload #5
    //   152: invokevirtual delete : ()Z
    //   155: istore_0
    //   156: new java/lang/StringBuilder
    //   159: astore_3
    //   160: aload_3
    //   161: ldc_w 'MS>SQA>QQA>d: '
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: aload_3
    //   168: iload_0
    //   169: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload_3
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: invokestatic F : (Ljava/lang/String;)V
    //   180: invokestatic h : ()Lwk1;
    //   183: aload #4
    //   185: invokestatic f : (Lwk1;Ljava/io/File;)V
    //   188: invokestatic h : ()Lwk1;
    //   191: iconst_0
    //   192: putfield e : Z
    //   195: invokestatic h : ()Lwk1;
    //   198: iconst_0
    //   199: putfield f : Z
    //   202: ldc in/krosbits/musicolet/MusicService
    //   204: monitorexit
    //   205: return
    //   206: ldc in/krosbits/musicolet/MusicService
    //   208: monitorexit
    //   209: return
    //   210: ldc in/krosbits/musicolet/MusicService
    //   212: monitorexit
    //   213: aload_3
    //   214: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	112	finally
    //   11	18	112	finally
    //   21	59	112	finally
    //   63	70	112	finally
    //   74	82	102	finally
    //   86	93	96	finally
    //   105	109	112	finally
    //   122	202	112	finally
    //   210	213	112	finally
  }
  
  public static void v0(km0 paramkm0) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 29
    //   4: aconst_null
    //   5: putstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   8: aconst_null
    //   9: putstatic in/krosbits/musicolet/MusicService.W0 : Lkm0;
    //   12: aconst_null
    //   13: putstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   16: aconst_null
    //   17: putstatic in/krosbits/musicolet/MusicService.Z0 : Ljava/lang/String;
    //   20: aconst_null
    //   21: putstatic in/krosbits/musicolet/MusicService.Y0 : Ljava/lang/String;
    //   24: iconst_0
    //   25: putstatic in/krosbits/musicolet/MusicService.a1 : Z
    //   28: return
    //   29: aload_0
    //   30: getfield c : Lqn1;
    //   33: astore #8
    //   35: aload #8
    //   37: getfield f : Lwo;
    //   40: astore #7
    //   42: aload #8
    //   44: getfield c : Ljava/lang/String;
    //   47: astore #5
    //   49: aload #8
    //   51: getfield e : Ljava/lang/String;
    //   54: astore #6
    //   56: aload #7
    //   58: putstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   61: aload_0
    //   62: putstatic in/krosbits/musicolet/MusicService.W0 : Lkm0;
    //   65: aload_0
    //   66: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   69: astore #7
    //   71: aload #8
    //   73: getfield g : I
    //   76: istore_1
    //   77: iconst_1
    //   78: istore #4
    //   80: iload_1
    //   81: ldc_w 600000
    //   84: if_icmplt -> 92
    //   87: iconst_1
    //   88: istore_2
    //   89: goto -> 94
    //   92: iconst_0
    //   93: istore_2
    //   94: iload_2
    //   95: ifne -> 144
    //   98: aload_0
    //   99: getfield h : Ljava/lang/String;
    //   102: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   105: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   108: astore_0
    //   109: iload #4
    //   111: istore_3
    //   112: aload_0
    //   113: ldc_w 'audiobook'
    //   116: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   119: ifne -> 155
    //   122: aload_0
    //   123: ldc_w 'podcast'
    //   126: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   129: istore_3
    //   130: iload_3
    //   131: ifeq -> 144
    //   134: iload #4
    //   136: istore_3
    //   137: goto -> 155
    //   140: astore_0
    //   141: goto -> 149
    //   144: iload_2
    //   145: istore_3
    //   146: goto -> 155
    //   149: aload_0
    //   150: invokevirtual printStackTrace : ()V
    //   153: iconst_0
    //   154: istore_3
    //   155: iload_3
    //   156: putstatic in/krosbits/musicolet/MusicService.a1 : Z
    //   159: getstatic ag0.i : Z
    //   162: ifeq -> 195
    //   165: aload #7
    //   167: iconst_0
    //   168: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   171: putstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   174: aload #6
    //   176: iconst_0
    //   177: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   180: putstatic in/krosbits/musicolet/MusicService.Z0 : Ljava/lang/String;
    //   183: aload #5
    //   185: iconst_0
    //   186: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   189: putstatic in/krosbits/musicolet/MusicService.Y0 : Ljava/lang/String;
    //   192: goto -> 210
    //   195: aload #7
    //   197: putstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   200: aload #6
    //   202: putstatic in/krosbits/musicolet/MusicService.Z0 : Ljava/lang/String;
    //   205: aload #5
    //   207: putstatic in/krosbits/musicolet/MusicService.Y0 : Ljava/lang/String;
    //   210: return
    // Exception table:
    //   from	to	target	type
    //   71	77	140	finally
    //   98	109	140	finally
    //   112	130	140	finally
  }
  
  public static int[] w() {
    int[] arrayOfInt = new int[(MyApplication.h()).b.size() * 3 + 1];
    int i = (MyApplication.h()).c;
    byte b = 0;
    arrayOfInt[0] = i;
    while (b < (MyApplication.h()).b.size()) {
      i = b * 3;
      xn1 xn1 = (MyApplication.h()).b.get(b);
      arrayOfInt[i + 1] = xn1.e;
      arrayOfInt[i + 2] = xn1.f;
      arrayOfInt[i + 3] = xn1.g;
      b++;
    } 
    return arrayOfInt;
  }
  
  public static AudioAttributes x() {
    if (d1 == null)
      d1 = (new AudioAttributes.Builder()).setUsage(1).setContentType(2).setLegacyStreamType(3).build(); 
    return d1;
  }
  
  public static km0 y() {
    if (!MyApplication.k())
      return null; 
    try {
      if (z().i())
        return null; 
      if (F0) {
        int i = e91.f;
        if (i == 0) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0)
          return null; 
      } 
    } finally {
      Exception exception;
    } 
    try {
      return z().d();
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Log.e("JSTMUSIC2", indexOutOfBoundsException.toString());
    } 
    return null;
  }
  
  public static xn1 z() {
    if (!MyApplication.k())
      return new xn1(0, "", new ArrayList(0), null); 
    Stack stack = (MyApplication.h()).b;
    if ((MyApplication.h()).b.size() == 0) {
      Stack<xn1> stack1 = (MyApplication.h()).b;
      ArrayList arrayList = new ArrayList();
      stack1.add(new xn1(0, ag0.O(MyApplication.i.getApplicationContext(), (MyApplication.h()).b), arrayList, null));
      MusicService musicService = P0;
      if (musicService != null && musicService.s != null)
        musicService.j0(); 
    } 
    if ((MyApplication.h()).c >= (MyApplication.h()).b.size()) {
      (MyApplication.h()).c = (MyApplication.h()).b.size() - 1;
      MusicService musicService = P0;
      if (musicService != null && musicService.s != null)
        musicService.j0(); 
    } 
    return (MyApplication.h()).b.get((MyApplication.h()).c);
  }
  
  public final PlaybackStateCompat A() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   3: istore #10
    //   5: ldc2_w 8063
    //   8: lstore #6
    //   10: iload #10
    //   12: ifeq -> 526
    //   15: new android/support/v4/media/session/g
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #11
    //   24: getstatic ew0.d : Z
    //   27: ifeq -> 35
    //   30: ldc2_w 6561791
    //   33: lstore #6
    //   35: aload #11
    //   37: lload #6
    //   39: putfield e : J
    //   42: aload_0
    //   43: getfield j : Z
    //   46: ifne -> 54
    //   49: iconst_3
    //   50: istore_2
    //   51: goto -> 59
    //   54: iconst_2
    //   55: istore_2
    //   56: goto -> 51
    //   59: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   62: invokevirtual A : ()I
    //   65: i2l
    //   66: lstore #6
    //   68: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   71: astore #12
    //   73: aload #12
    //   75: ifnull -> 100
    //   78: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   81: ifeq -> 100
    //   84: aload #12
    //   86: invokevirtual E : ()F
    //   89: fstore_1
    //   90: goto -> 102
    //   93: astore #12
    //   95: aload #12
    //   97: invokevirtual printStackTrace : ()V
    //   100: fconst_1
    //   101: fstore_1
    //   102: invokestatic elapsedRealtime : ()J
    //   105: lstore #8
    //   107: aload #11
    //   109: iload_2
    //   110: putfield b : I
    //   113: aload #11
    //   115: lload #6
    //   117: putfield c : J
    //   120: aload #11
    //   122: lload #8
    //   124: putfield f : J
    //   127: aload #11
    //   129: fload_1
    //   130: putfield d : F
    //   133: aload #11
    //   135: invokestatic z : ()Lxn1;
    //   138: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   141: invokevirtual e : (Z)I
    //   144: i2l
    //   145: putfield g : J
    //   148: getstatic in/krosbits/musicolet/MusicService.a1 : Z
    //   151: ifeq -> 206
    //   154: aload_0
    //   155: getfield j : Z
    //   158: ifne -> 206
    //   161: aload #11
    //   163: ldc_w 2131231137
    //   166: ldc_w 'AR10'
    //   169: aload_0
    //   170: ldc_w 2131887239
    //   173: invokevirtual getString : (I)Ljava/lang/String;
    //   176: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   179: aload #11
    //   181: ldc_w 2131231135
    //   184: ldc_w 'AF10'
    //   187: aload_0
    //   188: ldc_w 2131886554
    //   191: invokevirtual getString : (I)Ljava/lang/String;
    //   194: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   197: aload_0
    //   198: aload #11
    //   200: invokevirtual h : (Landroid/support/v4/media/session/g;)V
    //   203: goto -> 248
    //   206: aload_0
    //   207: aload #11
    //   209: invokevirtual h : (Landroid/support/v4/media/session/g;)V
    //   212: aload #11
    //   214: ldc_w 2131231137
    //   217: ldc_w 'AR10'
    //   220: aload_0
    //   221: ldc_w 2131887239
    //   224: invokevirtual getString : (I)Ljava/lang/String;
    //   227: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   230: aload #11
    //   232: ldc_w 2131231135
    //   235: ldc_w 'AF10'
    //   238: aload_0
    //   239: ldc_w 2131886554
    //   242: invokevirtual getString : (I)Ljava/lang/String;
    //   245: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   248: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   251: ifeq -> 275
    //   254: aload #11
    //   256: ldc_w 2131231397
    //   259: ldc_w 'ACT_SFL'
    //   262: aload_0
    //   263: ldc_w 2131887398
    //   266: invokevirtual getString : (I)Ljava/lang/String;
    //   269: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   272: goto -> 293
    //   275: aload #11
    //   277: ldc_w 2131231399
    //   280: ldc_w 'ACT_SFL'
    //   283: aload_0
    //   284: ldc_w 2131887398
    //   287: invokevirtual getString : (I)Ljava/lang/String;
    //   290: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   293: invokestatic z : ()Ltf1;
    //   296: astore #12
    //   298: aload #12
    //   300: getfield a : I
    //   303: istore #5
    //   305: aload #12
    //   307: getfield c : I
    //   310: istore_3
    //   311: aload #12
    //   313: getfield d : I
    //   316: istore_2
    //   317: aload #12
    //   319: getfield b : I
    //   322: istore #4
    //   324: iload #4
    //   326: iconst_m1
    //   327: if_icmpeq -> 455
    //   330: iload_2
    //   331: iconst_m1
    //   332: if_icmpeq -> 455
    //   335: new java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: astore #13
    //   344: aload #13
    //   346: aload_0
    //   347: ldc_w 2131887579
    //   350: invokevirtual getString : (I)Ljava/lang/String;
    //   353: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: getstatic org/jaudiotagger/audio/exceptions/yb/zLtYiJUm.TOxc : Ljava/lang/String;
    //   360: astore #12
    //   362: aload #13
    //   364: aload #12
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload #13
    //   372: aload_0
    //   373: iload_3
    //   374: invokevirtual getString : (I)Ljava/lang/String;
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #11
    //   383: iload #5
    //   385: ldc_w 'ACT_RPTS_TGL'
    //   388: aload #13
    //   390: invokevirtual toString : ()Ljava/lang/String;
    //   393: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   396: new java/lang/StringBuilder
    //   399: dup
    //   400: invokespecial <init> : ()V
    //   403: astore #13
    //   405: aload #13
    //   407: aload_0
    //   408: ldc_w 2131887584
    //   411: invokevirtual getString : (I)Ljava/lang/String;
    //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: pop
    //   418: aload #13
    //   420: aload #12
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload #13
    //   428: aload_0
    //   429: iload_2
    //   430: invokevirtual getString : (I)Ljava/lang/String;
    //   433: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload #11
    //   439: iload #4
    //   441: ldc_w 'ACT_REPTQ_TGL'
    //   444: aload #13
    //   446: invokevirtual toString : ()Ljava/lang/String;
    //   449: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   452: goto -> 470
    //   455: aload #11
    //   457: iload #5
    //   459: ldc_w 'ACT_RPTS_TGL'
    //   462: aload_0
    //   463: iload_3
    //   464: invokevirtual getString : (I)Ljava/lang/String;
    //   467: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   470: new android/os/Bundle
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: astore #12
    //   479: aload #12
    //   481: ldc_w 'shuffle_mode'
    //   484: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   487: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   490: invokestatic y : ()Lkm0;
    //   493: astore #13
    //   495: aload #13
    //   497: ifnull -> 513
    //   500: aload #12
    //   502: ldc_w 'EXT_RID'
    //   505: aload #13
    //   507: getfield b : I
    //   510: invokevirtual putInt : (Ljava/lang/String;I)V
    //   513: aload #11
    //   515: aload #12
    //   517: putfield h : Landroid/os/Bundle;
    //   520: aload #11
    //   522: invokevirtual b : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   525: areturn
    //   526: new java/util/ArrayList
    //   529: dup
    //   530: invokespecial <init> : ()V
    //   533: astore #11
    //   535: getstatic ew0.d : Z
    //   538: ifeq -> 549
    //   541: ldc2_w 6561791
    //   544: lstore #6
    //   546: goto -> 554
    //   549: ldc2_w 8063
    //   552: lstore #6
    //   554: new android/support/v4/media/session/PlaybackStateCompat
    //   557: dup
    //   558: iconst_0
    //   559: ldc2_w -1
    //   562: lconst_0
    //   563: fconst_1
    //   564: lload #6
    //   566: iconst_0
    //   567: aconst_null
    //   568: invokestatic elapsedRealtime : ()J
    //   571: aload #11
    //   573: ldc2_w -1
    //   576: aconst_null
    //   577: invokespecial <init> : (IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V
    //   580: areturn
    // Exception table:
    //   from	to	target	type
    //   68	73	93	finally
    //   78	90	93	finally
  }
  
  public final int A0(int paramInt, boolean paramBoolean) {
    if (this.D != null)
      MyApplication.c().cancel(this.D); 
    k0();
    m();
    if (paramInt > 0) {
      z0(-1L, false, false);
      B0(null);
    } 
    this.b = -1L;
    this.h = paramInt;
    this.g = paramBoolean;
    if (paramInt == 1) {
      E0.L();
      if (paramBoolean)
        u(); 
    } 
    if (this.h == 0)
      E0.L(); 
    return this.h;
  }
  
  public final boolean[] B(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore #6
    //   5: aload_0
    //   6: getfield a0 : Ljava/lang/Runnable;
    //   9: astore #8
    //   11: aload_0
    //   12: getfield v : Landroid/os/Handler;
    //   15: astore #9
    //   17: aload #9
    //   19: ifnull -> 34
    //   22: aload #8
    //   24: ifnull -> 34
    //   27: aload #9
    //   29: aload #8
    //   31: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   34: iload_2
    //   35: ifne -> 69
    //   38: iload_1
    //   39: ifeq -> 69
    //   42: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   45: ifeq -> 69
    //   48: invokestatic o : ()Landroid/content/SharedPreferences;
    //   51: getstatic com/google/android/material/tabs/xm/VDgS.NDFXCZVdOUWcK : Ljava/lang/String;
    //   54: iconst_0
    //   55: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   60: ifeq -> 69
    //   63: iconst_1
    //   64: istore #5
    //   66: goto -> 72
    //   69: iconst_0
    //   70: istore #5
    //   72: iload #5
    //   74: istore #4
    //   76: iload #5
    //   78: ifeq -> 114
    //   81: iload #5
    //   83: istore #4
    //   85: iconst_1
    //   86: invokestatic o : ()Landroid/content/SharedPreferences;
    //   89: ldc_w 'k_i_oenxpvbfltp'
    //   92: iconst_1
    //   93: invokeinterface getInt : (Ljava/lang/String;I)I
    //   98: if_icmpne -> 114
    //   101: iload #5
    //   103: istore #4
    //   105: getstatic in/krosbits/musicolet/MusicService.a1 : Z
    //   108: ifne -> 114
    //   111: iconst_0
    //   112: istore #4
    //   114: iload #4
    //   116: istore #5
    //   118: iload #4
    //   120: ifeq -> 170
    //   123: invokestatic o : ()Landroid/content/SharedPreferences;
    //   126: ldc_w 'k_i_oenxpvbowplps'
    //   129: iconst_1
    //   130: invokeinterface getInt : (Ljava/lang/String;I)I
    //   135: istore_3
    //   136: aload_0
    //   137: getfield j : Z
    //   140: ifeq -> 158
    //   143: iload #4
    //   145: istore #5
    //   147: iload_3
    //   148: iconst_1
    //   149: if_icmpne -> 170
    //   152: iconst_0
    //   153: istore #5
    //   155: goto -> 170
    //   158: iload #4
    //   160: istore #5
    //   162: iload_3
    //   163: iconst_2
    //   164: if_icmpne -> 170
    //   167: goto -> 152
    //   170: iload #5
    //   172: ifeq -> 210
    //   175: lload #6
    //   177: aload_0
    //   178: getfield b0 : J
    //   181: lsub
    //   182: ldc2_w 2000
    //   185: lcmp
    //   186: iflt -> 210
    //   189: invokestatic o : ()Landroid/content/SharedPreferences;
    //   192: ldc_w 'k_i_oenxpvbowptw'
    //   195: iconst_0
    //   196: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   201: ifeq -> 210
    //   204: iconst_1
    //   205: istore #4
    //   207: goto -> 213
    //   210: iconst_0
    //   211: istore #4
    //   213: iload_1
    //   214: ifeq -> 227
    //   217: iload_2
    //   218: ifne -> 227
    //   221: aload_0
    //   222: lload #6
    //   224: putfield b0 : J
    //   227: iconst_2
    //   228: newarray boolean
    //   230: dup
    //   231: iconst_0
    //   232: iload #5
    //   234: bastore
    //   235: dup
    //   236: iconst_1
    //   237: iload #4
    //   239: bastore
    //   240: areturn
  }
  
  public final void B0(km0 paramkm0) {
    if (paramkm0 != null) {
      z0(-1L, false, false);
      A0(0, false);
    } 
    this.i = paramkm0;
    E0.L();
  }
  
  public final int C() {
    byte b;
    try {
      hc hc1 = E0;
      bl1 bl11 = this.y0;
      oj oj2 = null;
      oj oj1 = oj2;
      if (bl11 != null) {
        oj1 = oj2;
        try {
        
        } finally {
          oj1 = null;
        } 
      } 
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
    return b;
  }
  
  public final void C0(boolean paramBoolean) {
    if (this.m0 != paramBoolean) {
      if (!ag0.f)
        MyApplication.g().edit().putBoolean("FSP_WPA", paramBoolean).apply(); 
      this.m0 = paramBoolean;
      o0();
    } 
  }
  
  public final void D() {
    F(null, false);
  }
  
  public final void D0() {
    if (!this.l) {
      if (!ag0.d0(true))
        return; 
      kj kj1 = kj.b(MyApplication.i.getApplicationContext());
      this.A0 = kj1;
      kj1.getClass();
      n21.j();
      bl1 bl11 = kj1.c;
      this.y0 = bl11;
      bh0 bh01 = new bh0(13, this);
      this.z0 = bh01;
      if (bl11 != null)
        bl11.a((cl1)bh01, oj.class); 
      this.l = true;
    } 
    F0();
  }
  
  public final void E(hc paramhc) {
    if (E0 == null) {
      n21.F("MSoP>TLT!");
      return;
    } 
    F0 = true;
    int j = (z()).g;
    try {
      this.P = false;
      km0 km01 = y();
      StringBuilder stringBuilder = new StringBuilder();
      this("MSSP:");
      stringBuilder.append(km01.c.f);
      n21.F(stringBuilder.toString());
    } finally {
      paramhc = null;
      i = j;
    } 
    if (i > 0)
      E0.R(i); 
    int i = this.c;
    if (i > 0)
      E0.R(i); 
    this.c = 0;
    if (this.k0) {
      this.k0 = false;
      p();
    } 
    if (this.j0) {
      this.j0 = false;
    } else {
      p0();
    } 
    if (!this.j) {
      if (g0() == 1) {
        w0(false);
        this.A = System.currentTimeMillis();
        if (!E0.I()) {
          boolean bool = n0();
          E0.c0(0);
          paramhc = E0;
          if (bool) {
            i = 101;
          } else {
            i = 0;
          } 
          paramhc.f0(i, 0);
          if (bool) {
            this.x0 = D0;
            n21.F("MS>ES");
          } 
        } 
        if (this.X) {
          this.X = false;
          Q();
        } 
      } else if (!n0.p()) {
        this.Z = System.currentTimeMillis();
      } 
      MyApplication.c().cancel(this.C);
      if (C() == 0 && !this.n) {
        this.n = true;
        ag0.O0(2131887559, 1);
      } 
      if (MyApplication.o().getBoolean("k_b_dtplim", false) && C() == 0 && !this.j)
        X(new Integer[] { Integer.valueOf(1) }); 
      m();
      G0();
    } else {
      h0();
    } 
    QsService.a((Context)this);
    MusicActivity musicActivity = this.s;
    if (musicActivity != null)
      musicActivity.M0(); 
    if (MusicActivity.R0 != null)
      ag0.m.postDelayed((Runnable)new l3(5), 300L); 
    if (SettingsActivity.m0 != null)
      ag0.m.postDelayed((Runnable)new l3(13), 300L); 
    EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
    if (equalizerActivity2 != null && equalizerActivity2.f0)
      equalizerActivity2.f0 = false; 
    EqualizerActivity2.m0();
    D();
  }
  
  public final boolean E0(int paramInt) {
    Integer integer = Integer.valueOf(1);
    if (this.v != null) {
      boolean bool;
      int i = MyApplication.o().getInt("B_R_AFL", 3);
      if (paramInt == -3) {
        bool = true;
      } else {
        bool = false;
      } 
      if (i == 4 || (i == 3 && !bool) || (i == 2 && !bool))
        return true; 
      if (!bool) {
        if (i == 1) {
          if (K()) {
            this.U = false;
            return true;
          } 
          if (!this.U) {
            this.U = true;
            this.v.postDelayed((Runnable)new bz0(this, paramInt, 0), 1000L);
          } else {
            this.U = false;
          } 
        } 
        if (i == 0 && Build.VERSION.SDK_INT >= 26)
          if (K()) {
            this.U = false;
            if (!this.j && F0 && E0 != null) {
              X(new Integer[] { integer });
              X(new Integer[] { integer });
              return false;
            } 
          } else {
            if (!this.U) {
              this.U = true;
              this.v.postDelayed((Runnable)new bz0(this, paramInt, 1), 1000L);
              return false;
            } 
            this.U = false;
          }  
      } 
    } 
    return false;
  }
  
  public final void F(Bitmap paramBitmap, boolean paramBoolean) {
    int i;
    Bundle bundle;
    xn1 xn1;
    bh0 bh01;
    km0 km01;
    String str1;
    String str2;
    String str3;
    p01 p01 = ew0.a(getApplicationContext());
    if (F0) {
      bh01 = new bh0();
      km01 = y();
      xn1 = z();
      if (km01 != null) {
        i = km01.b;
        str3 = km01.f;
        str1 = km01.j;
        str2 = km01.e;
        qn1 qn1 = km01.c;
        if (!paramBoolean)
          this.r = false; 
        if (Build.VERSION.SDK_INT >= 33 || this.u.getBoolean("B_SYSLCSBG", true)) {
          ag1 ag1;
          MyApplication.v.b((kt1)this.d0);
          if (!paramBoolean) {
            int j = this.q;
            char c = 'Ԁ';
            if (j < 1920) {
              c = 'и';
              if (j < 1280) {
                c = 'Ѐ';
                if (j < 1080) {
                  c = '̠';
                  if (j < 1024) {
                    c = 'ː';
                    if (j < 800) {
                      c = 'ʀ';
                      if (j < 720) {
                        c = 'Ȁ';
                        if (j < 640) {
                          c = 'Ǡ';
                          if (j < 512) {
                            c = 'Ũ';
                            if (j < 480)
                              if (j >= 360) {
                                c = 'ð';
                              } else {
                                c = 'x';
                              }  
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
            ag1 = MyApplication.v.f(p3.n(km01, 2131230842, false));
            ag1.g(new int[] { 2 });
            ag1.c = true;
            ag1.b.a(c, c);
            ag1.i();
            ag1.a();
            ag1.e((kt1)this.d0);
          } else {
            try {
              if (ag0.j) {
                bh01.z("android.media.metadata.ALBUM_ART", (Bitmap)ag1);
              } else {
                bh01.z("android.media.metadata.ART", (Bitmap)ag1);
              } 
            } finally {}
            if (MyApplication.o().getBoolean("k_b_bcalaturs", false)) {
              String str = AAProvider.d(km01).toString();
              bh01.C("android.media.metadata.ALBUM_ART_URI", str);
              bh01.C("android.media.metadata.ART_URI", str);
              bh01.C("android.media.metadata.DISPLAY_ICON_URI", str);
            } 
          } 
        } else {
          paramBoolean = true;
        } 
      } else {
        return;
      } 
    } else {
      p01.o(null);
      b0(true);
      if (!this.j0) {
        Intent intent = new Intent("com.android.music.playbackcomplete");
        bundle = new Bundle();
        bundle.putBoolean("playing", false);
        bundle.putString("scrobbling_source", getPackageName());
        intent.putExtras(bundle);
        sendBroadcast(intent);
      } 
      return;
    } 
    if (paramBoolean) {
      ArrayList<String> arrayList = new ArrayList(2);
      if (!TextUtils.isEmpty(Z0) && !"<unknown>".equals(Z0)) {
        arrayList.add(Z0);
        bh01.C("android.media.metadata.ARTIST", Z0);
      } 
      if (!TextUtils.isEmpty(Y0) && !"<unknown>".equals(Y0)) {
        arrayList.add(Y0);
        bh01.C("android.media.metadata.ALBUM", Y0);
      } 
      if (!TextUtils.isEmpty(X0) && !"<unknown>".equals(X0)) {
        String str = X0;
        bh01.C("android.media.metadata.TITLE", str);
      } else {
        paramBitmap = null;
      } 
      if (!TextUtils.isEmpty(str2) && !"<unknown>".equals(str2))
        bh01.C("android.media.metadata.GENRE", str2); 
      if (!TextUtils.isEmpty(str1) && !"<unknown>".equals(str1))
        bh01.C("android.media.metadata.ALBUM_ARTIST", str1); 
      if (!TextUtils.isEmpty(str3) && !"<unknown>".equals(str3))
        bh01.C("android.media.metadata.COMPOSER", str3); 
      bh01.A(((qn1)bundle).g, "android.media.metadata.DURATION");
      int m = xn1.b.size();
      int j = xn1.e(C0);
      StringBuilder stringBuilder = new StringBuilder("musicolet.media.r.7.s_");
      stringBuilder.append(i);
      bh01.C("android.media.metadata.MEDIA_ID", stringBuilder.toString());
      int k = j + 1;
      bh01.A(k, "android.media.metadata.TRACK_NUMBER");
      long l = m;
      bh01.A(l, "android.media.metadata.NUM_TRACKS");
      bh01.A(l, "com.google.android.music.mediasession.METADATA_KEY_QUEUE_SIZE");
      bh01.A(j, "com.google.android.music.mediasession.METADATA_KEY_QUEUE_POSITION");
      bh01.A(km01.c(), "android.media.metadata.DISC_NUMBER");
      bh01.A(i, "musicolet.metadata.RID");
      if (ew0.d) {
        float f;
        if (c81.c(getApplicationContext()).c(km01)) {
          f = 1.0F;
        } else {
          f = 0.0F;
        } 
        RatingCompat ratingCompat = new RatingCompat(1, f);
        bh01.B("android.media.metadata.RATING", ratingCompat);
        bh01.B("android.media.metadata.USER_RATING", ratingCompat);
      } 
      if (MyApplication.o().getBoolean("k_b_mstlstds2", false)) {
        if (paramBitmap != null)
          bh01.C("android.media.metadata.DISPLAY_TITLE", (String)paramBitmap); 
        if (!arrayList.isEmpty())
          bh01.C("android.media.metadata.DISPLAY_SUBTITLE", TextUtils.join(" • ", arrayList)); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(k);
        stringBuilder1.append("/");
        stringBuilder1.append(m);
        stringBuilder1.append(" • ");
        stringBuilder1.append(xn1.h);
        bh01.C("android.media.metadata.DISPLAY_DESCRIPTION", stringBuilder1.toString());
      } 
      MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat((Bundle)bh01.c);
      p01.o(mediaMetadataCompat);
      b0(true);
      if (ag0.k) {
        PlaybackStateCompat playbackStateCompat = A();
        p01.o(mediaMetadataCompat);
        p01.p(playbackStateCompat);
      } 
    } 
    if (paramBoolean) {
      Intent intent = new Intent("com.android.music.metachanged");
      Bundle bundle1 = new Bundle();
      bundle1.putString("track", ((qn1)bundle).b);
      bundle1.putString("artist", ((qn1)bundle).e);
      bundle1.putString("album", ((qn1)bundle).c);
      bundle1.putLong("duration", ((qn1)bundle).g);
      bundle1.putLong("position", E0.A());
      bundle1.putBoolean("playing", this.j ^ true);
      bundle1.putString("scrobbling_source", getPackageName());
      intent.putExtras(bundle1);
      sendBroadcast(intent);
    } 
  }
  
  public final void F0() {
    hc hc1 = E0;
    if (ag0.d0(true) && hc1 != null) {
      boolean bool = hc1 instanceof fl;
      if (J() && !bool)
        a0(100L); 
    } 
  }
  
  public final void G() {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   4: aload_0
    //   5: invokevirtual J : ()Z
    //   8: ifeq -> 30
    //   11: new fl
    //   14: dup
    //   15: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   18: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   21: invokespecial <init> : (Landroid/content/Context;)V
    //   24: putstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   27: goto -> 70
    //   30: invokestatic o : ()Landroid/content/SharedPreferences;
    //   33: ldc_w 'k_i_adt'
    //   36: iconst_0
    //   37: invokeinterface getInt : (Ljava/lang/String;I)I
    //   42: istore_2
    //   43: new kd
    //   46: dup
    //   47: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   50: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   53: iload_2
    //   54: invokespecial <init> : (Landroid/content/Context;I)V
    //   57: putstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   60: aload_0
    //   61: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   64: invokestatic a : (Landroid/content/Context;)Lp01;
    //   67: invokevirtual q : ()V
    //   70: aload_0
    //   71: invokestatic d : (Landroid/content/Context;)Liv0;
    //   74: pop
    //   75: aload_0
    //   76: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   79: invokestatic a : (Landroid/content/Context;)Lp01;
    //   82: getfield c : Ljava/lang/Object;
    //   85: checkcast m01
    //   88: getfield a : Landroid/media/session/MediaSession;
    //   91: invokestatic k : (Ljava/lang/Object;)V
    //   94: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   97: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   100: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   103: invokevirtual G : (Landroid/content/Context;)V
    //   106: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   109: astore #5
    //   111: aload #5
    //   113: aload_0
    //   114: putfield c : Lfc;
    //   117: aload #5
    //   119: aload_0
    //   120: putfield e : Ldc;
    //   123: aload #5
    //   125: aload_0
    //   126: putfield f : Lec;
    //   129: aload #5
    //   131: aload_0
    //   132: invokevirtual Z : (Lin/krosbits/musicolet/MusicService;)V
    //   135: aload_0
    //   136: invokevirtual o : ()Z
    //   139: pop
    //   140: iconst_1
    //   141: putstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   144: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   147: invokevirtual H : ()Z
    //   150: ifeq -> 765
    //   153: aload_0
    //   154: getfield u : Landroid/content/SharedPreferences;
    //   157: ldc_w 'etu2'
    //   160: iconst_0
    //   161: invokeinterface getInt : (Ljava/lang/String;I)I
    //   166: istore_2
    //   167: iload_2
    //   168: ifeq -> 191
    //   171: iload_2
    //   172: iconst_2
    //   173: if_icmpne -> 179
    //   176: goto -> 191
    //   179: iload_2
    //   180: iconst_1
    //   181: if_icmpne -> 760
    //   184: aload_0
    //   185: invokevirtual J0 : ()V
    //   188: goto -> 760
    //   191: invokestatic K0 : ()V
    //   194: invokestatic h : ()I
    //   197: istore_2
    //   198: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   201: iload_2
    //   202: invokestatic i : (II)I
    //   205: putstatic in/krosbits/musicolet/MusicService.J0 : I
    //   208: invokestatic b : ()Lf01;
    //   211: getstatic in/krosbits/musicolet/MusicService.J0 : I
    //   214: invokevirtual d : (I)V
    //   217: invokestatic b : ()Lf01;
    //   220: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   223: invokestatic s : (I)Z
    //   226: iconst_0
    //   227: invokevirtual e : (ZZ)Z
    //   230: pop
    //   231: getstatic in/krosbits/musicolet/MusicService.K0 : Low;
    //   234: astore #5
    //   236: aload #5
    //   238: ifnonnull -> 292
    //   241: new ow
    //   244: astore #5
    //   246: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   249: invokevirtual y : ()Ljava/util/List;
    //   252: astore #6
    //   254: aload #5
    //   256: getstatic in/krosbits/musicolet/MusicService.J0 : I
    //   259: aload #6
    //   261: invokespecial <init> : (ILjava/util/List;)V
    //   264: aload #5
    //   266: putstatic in/krosbits/musicolet/MusicService.K0 : Low;
    //   269: aload #5
    //   271: invokestatic x : (Low;)V
    //   274: goto -> 292
    //   277: astore #5
    //   279: aload #5
    //   281: invokevirtual printStackTrace : ()V
    //   284: goto -> 292
    //   287: astore #5
    //   289: goto -> 751
    //   292: getstatic in/krosbits/musicolet/MusicService.L0 : Lve;
    //   295: astore #5
    //   297: aload #5
    //   299: ifnonnull -> 389
    //   302: new ve
    //   305: astore #5
    //   307: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   310: invokevirtual y : ()Ljava/util/List;
    //   313: astore #6
    //   315: aload #5
    //   317: getstatic in/krosbits/musicolet/MusicService.J0 : I
    //   320: iconst_0
    //   321: aload #6
    //   323: invokespecial <init> : (IILjava/util/List;)V
    //   326: aload #5
    //   328: putstatic in/krosbits/musicolet/MusicService.L0 : Lve;
    //   331: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   334: istore_3
    //   335: new java/lang/StringBuilder
    //   338: astore #6
    //   340: aload #6
    //   342: ldc_w 'EQBBS_'
    //   345: invokespecial <init> : (Ljava/lang/String;)V
    //   348: aload #6
    //   350: iload_3
    //   351: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload #6
    //   357: invokevirtual toString : ()Ljava/lang/String;
    //   360: astore #6
    //   362: aload #5
    //   364: invokestatic o : ()Landroid/content/SharedPreferences;
    //   367: aload #6
    //   369: iconst_0
    //   370: invokeinterface getInt : (Ljava/lang/String;I)I
    //   375: i2s
    //   376: invokevirtual c : (S)V
    //   379: goto -> 389
    //   382: astore #5
    //   384: aload #5
    //   386: invokevirtual printStackTrace : ()V
    //   389: getstatic in/krosbits/musicolet/MusicService.M0 : Lve;
    //   392: astore #5
    //   394: aload #5
    //   396: ifnonnull -> 486
    //   399: new ve
    //   402: astore #5
    //   404: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   407: invokevirtual y : ()Ljava/util/List;
    //   410: astore #6
    //   412: aload #5
    //   414: getstatic in/krosbits/musicolet/MusicService.J0 : I
    //   417: iconst_1
    //   418: aload #6
    //   420: invokespecial <init> : (IILjava/util/List;)V
    //   423: aload #5
    //   425: putstatic in/krosbits/musicolet/MusicService.M0 : Lve;
    //   428: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   431: istore_3
    //   432: new java/lang/StringBuilder
    //   435: astore #6
    //   437: aload #6
    //   439: ldc_w 'EQVS_'
    //   442: invokespecial <init> : (Ljava/lang/String;)V
    //   445: aload #6
    //   447: iload_3
    //   448: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   451: pop
    //   452: aload #6
    //   454: invokevirtual toString : ()Ljava/lang/String;
    //   457: astore #6
    //   459: aload #5
    //   461: invokestatic o : ()Landroid/content/SharedPreferences;
    //   464: aload #6
    //   466: iconst_0
    //   467: invokeinterface getInt : (Ljava/lang/String;I)I
    //   472: i2s
    //   473: invokevirtual c : (S)V
    //   476: goto -> 486
    //   479: astore #5
    //   481: aload #5
    //   483: invokevirtual printStackTrace : ()V
    //   486: getstatic in/krosbits/musicolet/MusicService.N0 : Le91;
    //   489: astore #5
    //   491: aload #5
    //   493: ifnonnull -> 678
    //   496: new e91
    //   499: astore #5
    //   501: aload #5
    //   503: iload_2
    //   504: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   507: invokevirtual y : ()Ljava/util/List;
    //   510: invokespecial <init> : (ILjava/util/List;)V
    //   513: aload #5
    //   515: putstatic in/krosbits/musicolet/MusicService.N0 : Le91;
    //   518: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   521: istore_3
    //   522: new java/lang/StringBuilder
    //   525: astore #6
    //   527: aload #6
    //   529: ldc_w 'k_i_prmd_'
    //   532: invokespecial <init> : (Ljava/lang/String;)V
    //   535: aload #6
    //   537: iload_3
    //   538: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   541: pop
    //   542: aload #6
    //   544: invokevirtual toString : ()Ljava/lang/String;
    //   547: astore #6
    //   549: invokestatic o : ()Landroid/content/SharedPreferences;
    //   552: aload #6
    //   554: iconst_0
    //   555: invokeinterface getInt : (Ljava/lang/String;I)I
    //   560: istore_2
    //   561: iload_2
    //   562: iconst_m1
    //   563: if_icmpne -> 613
    //   566: new java/lang/StringBuilder
    //   569: astore #6
    //   571: aload #6
    //   573: ldc_w 'k_i_hdrmg_'
    //   576: invokespecial <init> : (Ljava/lang/String;)V
    //   579: aload #6
    //   581: iload_3
    //   582: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   585: pop
    //   586: aload #6
    //   588: invokevirtual toString : ()Ljava/lang/String;
    //   591: astore #6
    //   593: invokestatic o : ()Landroid/content/SharedPreferences;
    //   596: aload #6
    //   598: bipush #6
    //   600: invokeinterface getInt : (Ljava/lang/String;I)I
    //   605: ineg
    //   606: istore_2
    //   607: iload_2
    //   608: i2f
    //   609: fstore_1
    //   610: goto -> 662
    //   613: iload_2
    //   614: iconst_1
    //   615: if_icmpne -> 660
    //   618: new java/lang/StringBuilder
    //   621: astore #6
    //   623: aload #6
    //   625: ldc_w 'k_i_vbg_'
    //   628: invokespecial <init> : (Ljava/lang/String;)V
    //   631: aload #6
    //   633: iload_3
    //   634: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: aload #6
    //   640: invokevirtual toString : ()Ljava/lang/String;
    //   643: astore #6
    //   645: invokestatic o : ()Landroid/content/SharedPreferences;
    //   648: aload #6
    //   650: iconst_2
    //   651: invokeinterface getInt : (Ljava/lang/String;I)I
    //   656: istore_2
    //   657: goto -> 607
    //   660: fconst_0
    //   661: fstore_1
    //   662: aload #5
    //   664: fload_1
    //   665: invokevirtual c : (F)V
    //   668: goto -> 678
    //   671: astore #5
    //   673: aload #5
    //   675: invokevirtual printStackTrace : ()V
    //   678: getstatic in/krosbits/musicolet/MusicService.O0 : Landroid/media/audiofx/EnvironmentalReverb;
    //   681: ifnonnull -> 756
    //   684: invokestatic o : ()Landroid/content/SharedPreferences;
    //   687: ldc_w 'k_b_eqrefe'
    //   690: iconst_0
    //   691: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   696: istore #4
    //   698: iload #4
    //   700: ifeq -> 756
    //   703: new android/media/audiofx/EnvironmentalReverb
    //   706: astore #5
    //   708: aload #5
    //   710: iconst_1
    //   711: iconst_0
    //   712: invokespecial <init> : (II)V
    //   715: aload #5
    //   717: putstatic in/krosbits/musicolet/MusicService.O0 : Landroid/media/audiofx/EnvironmentalReverb;
    //   720: aload #5
    //   722: aconst_null
    //   723: invokestatic y : (Landroid/media/audiofx/EnvironmentalReverb;Lhc;)V
    //   726: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   729: getstatic in/krosbits/musicolet/MusicService.O0 : Landroid/media/audiofx/EnvironmentalReverb;
    //   732: invokevirtual getId : ()I
    //   735: invokevirtual u : (I)V
    //   738: goto -> 756
    //   741: astore #5
    //   743: aload #5
    //   745: invokevirtual printStackTrace : ()V
    //   748: goto -> 756
    //   751: aload #5
    //   753: invokevirtual printStackTrace : ()V
    //   756: aload_0
    //   757: invokevirtual I0 : ()V
    //   760: aload_0
    //   761: iconst_1
    //   762: putfield X : Z
    //   765: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   768: invokevirtual H : ()Z
    //   771: ifeq -> 942
    //   774: getstatic in/krosbits/musicolet/MusicService.J0 : I
    //   777: ifne -> 942
    //   780: new r4
    //   783: astore #5
    //   785: aload #5
    //   787: bipush #100
    //   789: bipush #100
    //   791: invokespecial <init> : (II)V
    //   794: aload #5
    //   796: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   799: invokevirtual x : ()I
    //   802: invokevirtual setAudioSessionId : (I)V
    //   805: new dz0
    //   808: astore #6
    //   810: aload #6
    //   812: invokespecial <init> : ()V
    //   815: aload #5
    //   817: aload #6
    //   819: invokevirtual setOnPreparedListener : (Landroid/media/MediaPlayer$OnPreparedListener;)V
    //   822: new j4
    //   825: astore #6
    //   827: aload #6
    //   829: iconst_1
    //   830: aload_0
    //   831: invokespecial <init> : (ILjava/lang/Object;)V
    //   834: aload #5
    //   836: aload #6
    //   838: invokevirtual setOnCompletionListener : (Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   841: aload_0
    //   842: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   845: ldc_w 2131820546
    //   848: invokevirtual openRawResourceFd : (I)Landroid/content/res/AssetFileDescriptor;
    //   851: astore #6
    //   853: aload #6
    //   855: ifnull -> 927
    //   858: aload #5
    //   860: aload #6
    //   862: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   865: aload #6
    //   867: invokevirtual getStartOffset : ()J
    //   870: aload #6
    //   872: invokevirtual getLength : ()J
    //   875: invokevirtual setDataSource : (Ljava/io/FileDescriptor;JJ)V
    //   878: getstatic in/krosbits/musicolet/MusicService.O0 : Landroid/media/audiofx/EnvironmentalReverb;
    //   881: astore #7
    //   883: aload #7
    //   885: ifnull -> 914
    //   888: aload #5
    //   890: aload #7
    //   892: invokevirtual getId : ()I
    //   895: invokevirtual attachAuxEffect : (I)V
    //   898: aload #5
    //   900: fconst_1
    //   901: invokevirtual setAuxEffectSendLevel : (F)V
    //   904: goto -> 914
    //   907: astore #7
    //   909: aload #7
    //   911: invokevirtual printStackTrace : ()V
    //   914: aload #6
    //   916: invokevirtual close : ()V
    //   919: aload #5
    //   921: invokevirtual prepare : ()V
    //   924: goto -> 942
    //   927: aload #5
    //   929: invokevirtual release : ()V
    //   932: goto -> 942
    //   935: astore #5
    //   937: aload #5
    //   939: invokevirtual printStackTrace : ()V
    //   942: return
    // Exception table:
    //   from	to	target	type
    //   194	236	287	java/lang/Exception
    //   241	274	277	finally
    //   279	284	287	java/lang/Exception
    //   292	297	287	java/lang/Exception
    //   302	379	382	finally
    //   384	389	287	java/lang/Exception
    //   389	394	287	java/lang/Exception
    //   399	476	479	finally
    //   481	486	287	java/lang/Exception
    //   486	491	287	java/lang/Exception
    //   496	561	671	finally
    //   566	607	671	finally
    //   618	657	671	finally
    //   662	668	671	finally
    //   673	678	287	java/lang/Exception
    //   678	698	287	java/lang/Exception
    //   703	738	741	finally
    //   743	748	287	java/lang/Exception
    //   780	853	935	java/lang/Exception
    //   858	883	935	java/lang/Exception
    //   888	904	907	finally
    //   909	914	935	java/lang/Exception
    //   914	924	935	java/lang/Exception
    //   927	932	935	java/lang/Exception
  }
  
  public final void G0() {
    if (!this.j && F0 && E0 != null) {
      long l = this.b;
      if (l > 0L && this.g) {
        l -= System.currentTimeMillis();
        if (l > 0L && l < (E0.C() - E0.A())) {
          m();
          u();
          return;
        } 
      } else if (this.h == 1 && this.g) {
        m();
        u();
      } 
    } 
  }
  
  public final void H() {
    n21.F("MSSI:");
    if (!this.w) {
      boolean bool;
      Stack stack;
      a60 a60;
      ag0.m.removeCallbacks((Runnable)h1);
      Intent intent = (new Intent(getApplicationContext(), MyReceiver.class)).setAction("a_atcl");
      this.C = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 167772160);
      if (ag0.c0())
        this.E = new ScheduledThreadPoolExecutor(1); 
      this.t = MyApplication.u();
      kz0 kz01 = new kz0(this);
      this.z = kz01;
      this.u.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)kz01);
      zo2.c();
      try {
        if ((MyApplication.h()).c >= (MyApplication.h()).b.size())
          (MyApplication.h()).c = (MyApplication.h()).b.size() - 1; 
      } finally {
        kz01 = null;
      } 
      if ((MyApplication.h()).b.size() == 0) {
        n21.F("MSSNQS:");
        try {
          IllegalStateException illegalStateException = new IllegalStateException();
          this("MSIS=N");
          throw illegalStateException;
        } catch (IllegalStateException illegalStateException) {
          illegalStateException.printStackTrace();
          (MyApplication.h()).b = new Stack();
          ArrayList arrayList = new ArrayList();
          i(0, ag0.O(getApplicationContext(), (MyApplication.h()).b), arrayList);
          (MyApplication.h()).c = 0;
        } 
      } 
      if ((MyApplication.h()).c < 0)
        (MyApplication.h()).c = 0; 
      this.j = true;
      h0();
      this.b = -1L;
      this.h = 0;
      this.i = null;
      this.A = System.currentTimeMillis();
      this.j0 = true;
      this.k0 = true;
      try {
        WindowManager windowManager = (WindowManager)getSystemService("window");
        Point point = new Point();
        this();
        windowManager.getDefaultDisplay().getRealSize(point);
        Math.max(point.x, point.y);
        this.q = Math.min(point.x, point.y);
      } finally {
        stack = null;
      } 
      G();
      j0();
      if (this.q0 == null)
        this.q0 = new c70(2); 
      IntentFilter intentFilter2 = new IntentFilter();
      intentFilter2.addAction("android.media.VOLUME_CHANGED_ACTION");
      n0.s((ContextWrapper)this, (BroadcastReceiver)this.q0, intentFilter2);
      if (this.r0 == null)
        this.r0 = new MyReceiver(); 
      intentFilter2 = new IntentFilter();
      intentFilter2.addAction("android.media.AUDIO_BECOMING_NOISY");
      intentFilter2.setPriority(2147483647);
      n0.s((ContextWrapper)this, this.r0, intentFilter2);
      IntentFilter intentFilter3 = new IntentFilter("android.intent.action.SCREEN_ON");
      intentFilter3.addAction("android.intent.action.SCREEN_OFF");
      LockScreenReceiver lockScreenReceiver = new LockScreenReceiver();
      this.h0 = lockScreenReceiver;
      n0.s((ContextWrapper)this, lockScreenReceiver, intentFilter3);
      if (this.M == null)
        this.M = new hz0(this, 1); 
      if (MyApplication.e().isBluetoothA2dpOn() || MyApplication.e().isWiredHeadsetOn()) {
        bool = true;
      } else {
        bool = false;
      } 
      this.N = bool;
      IntentFilter intentFilter1 = new IntentFilter();
      intentFilter1.addAction("android.intent.action.HEADSET_PLUG");
      intentFilter1.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      intentFilter1.addAction("android.bluetooth.device.action.ACL_CONNECTED");
      intentFilter1.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
      intentFilter1.setPriority(2147483647);
      n0.s((ContextWrapper)this, (BroadcastReceiver)this.M, intentFilter1);
      iv0 iv0 = iv0.d((Context)this);
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        MediaRouter2 mediaRouter2 = MediaRouter2.getInstance(getApplicationContext());
        if (i >= 28) {
          Executor executor = k5.e((Context)this);
        } else {
          a60 = new a60(new Handler(getMainLooper()), 0);
        } 
        RouteDiscoveryPreference.Builder builder = new RouteDiscoveryPreference.Builder();
        RouteDiscoveryPreference routeDiscoveryPreference = (new RouteDiscoveryPreference.Builder(Collections.singletonList("android.media.route.feature.LIVE_AUDIO"), false)).build();
        mediaRouter2.registerRouteCallback((Executor)a60, (MediaRouter2.RouteCallback)this.u0, routeDiscoveryPreference);
      } else {
        ArrayList<String> arrayList = new ArrayList();
        if (!arrayList.contains("android.media.intent.category.LIVE_AUDIO"))
          arrayList.add("android.media.intent.category.LIVE_AUDIO"); 
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        a60.a(new cv0(bundle, arrayList), (dv0)this.t0, 8);
      } 
      f f = new f(22, this);
      iv0.b();
      (iv0.c()).f = f;
      D0();
      this.p = K();
      if (i >= 31) {
        iz0 iz01 = this.v0;
        if (iz01 != null)
          MyApplication.e().addOnModeChangedListener(f1, (AudioManager.OnModeChangedListener)iz01); 
      } 
      P0();
      this.l0 = MyApplication.p().newWakeLock(1, "musicolet:SongChangeWakeLock");
    } 
    this.w = true;
    P0 = this;
  }
  
  public final void H0(Notification paramNotification) {
    if (Build.VERSION.SDK_INT >= 29) {
      startForeground(100, paramNotification, 2);
      return;
    } 
    startForeground(100, paramNotification);
  }
  
  public final boolean I() {
    int i = this.Q;
    return (i > 0 && this.R > i);
  }
  
  public final void I0() {
    try {
      boolean bool1 = j50.r(D0);
      int i = this.x0;
      int j = D0;
      boolean bool = false;
      if (i != j && bool1 && bool1) {
        hc hc1 = E0;
        if (hc1 != null && F0 && !this.j) {
          hc1.c0(0);
          E0.f0(101, 1);
          this.x0 = D0;
          n21.F("MS>ES");
        } 
      } 
      K0.c(bool1, F0);
      L0.b(bool1);
      M0.b(bool1);
      e91 e911 = N0;
      if (e911 != null)
        e911.b(bool1); 
      j50.w(E0);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final boolean J() {
    bl1 bl11 = this.y0;
    if (bl11 != null) {
      oj oj = bl11.c();
    } else {
      bl11 = null;
    } 
    MyApplication.F.getClass();
    return (!yp1.a() && bl11 != null && bl11.a());
  }
  
  public final void J0() {
    if (E0 != null && G0) {
      Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
      int i = E0.x();
      intent.putExtra(YbNJ.JyEPDZFxOnsj, i);
      intent.putExtra("android.media.extra.PACKAGE_NAME", getPackageName());
      intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
      sendBroadcast(intent);
    } 
  }
  
  public final void L0() {
    if (E0 != null) {
      Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
      intent.putExtra("android.media.extra.AUDIO_SESSION", E0.x());
      intent.putExtra("android.media.extra.PACKAGE_NAME", getPackageName());
      intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
      sendBroadcast(intent);
    } 
  }
  
  public final void M() {
    r9 r91 = this.T;
    try {
      Handler handler = this.v;
      if (handler != null) {
        handler.removeCallbacks((Runnable)r91);
        int i = E0.A();
        if (this.R > this.Q) {
          if (I()) {
            int j = this.R;
            if (i >= j)
              return; 
            long l = (long)((j - i) / E0.E());
            return;
          } 
          IllegalStateException illegalStateException1 = new IllegalStateException();
          this("a B nE");
          throw illegalStateException1;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this("a < b");
        throw illegalStateException;
      } 
      AssertionError assertionError = new AssertionError();
      this();
      throw assertionError;
    } finally {
      r91 = null;
    } 
  }
  
  public final void N(p01 paramp01) {
    qn1<ArrayList<MediaSessionCompat.QueueItem>> qn1;
    int i;
    int j;
    int k;
    ArrayList<MediaSessionCompat.QueueItem> arrayList;
    ArrayList<km0> arrayList1;
    m01 m01 = (m01)paramp01.c;
    xn1 xn1 = z();
    String str = ag0.a;
    boolean bool = false;
    try {
      arrayList1 = xn1.g(C0);
      arrayList = new ArrayList();
      this(arrayList1.size());
      k = xn1.e(C0);
      if (MyApplication.o().getBoolean("k_b_nlmsqi", false)) {
        j = arrayList1.size();
        i = 0;
      } else {
        i = Math.max(0, k - 10);
        j = Math.min(arrayList1.size(), k + 26);
      } 
    } finally {}
    while (true) {
      ArrayList<MediaSessionCompat.QueueItem> arrayList2 = arrayList;
      if (i < j) {
        km0 km01 = arrayList1.get(i);
        qn1 = km01.c;
        String str1 = qn1.b;
        String str2 = qn1.e;
        if (k == i) {
          String str3 = qn1.c;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("musicolet.media.r.7.s_");
          stringBuilder.append(km01.b);
          String str4 = stringBuilder.toString();
        } else {
          str = null;
          qn1 = null;
        } 
        Uri uri = AAProvider.d(km01);
        MediaSessionCompat.QueueItem queueItem = new MediaSessionCompat.QueueItem();
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat();
        this(str, str1, str2, (CharSequence)qn1, null, uri, null, null);
        this(null, mediaDescriptionCompat, i);
        arrayList.add(queueItem);
        i++;
        continue;
      } 
      break;
    } 
    str = getString(2131887534);
    m01.a.setQueueTitle(str);
    if (qn1 != null) {
      HashSet<Long> hashSet = new HashSet();
      j = qn1.size();
      i = 0;
      while (i < j) {
        arrayList = qn1.get(i);
        i++;
        MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem)arrayList;
        if (queueItem != null) {
          long l = queueItem.c;
          if (hashSet.contains(Long.valueOf(l))) {
            StringBuilder stringBuilder = new StringBuilder("Found duplicate queue id: ");
            stringBuilder.append(l);
            Log.e("MediaSessionCompat", stringBuilder.toString(), new IllegalArgumentException("id of each queue item should be unique"));
          } 
          hashSet.add(Long.valueOf(l));
          continue;
        } 
        l0.l("queue shouldn't have null items");
        return;
      } 
    } 
    MediaSession mediaSession = m01.a;
    m01.f = (ArrayList)qn1;
    if (qn1 == null) {
      mediaSession.setQueue(null);
    } else {
      ArrayList<MediaSession.QueueItem> arrayList2 = new ArrayList();
      j = qn1.size();
      i = bool;
      while (i < j) {
        str = (String)qn1.get(i);
        i++;
        MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem)str;
        MediaSession.QueueItem queueItem2 = queueItem.e;
        MediaSession.QueueItem queueItem1 = queueItem2;
        if (queueItem2 == null) {
          queueItem1 = yv0.a(queueItem.b.e(), queueItem.c);
          queueItem.e = queueItem1;
        } 
        arrayList2.add(queueItem1);
      } 
      mediaSession.setQueue(arrayList2);
    } 
  }
  
  public final void N0(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic in/krosbits/musicolet/MusicService.b1 : Landroid/os/Handler;
    //   5: getstatic in/krosbits/musicolet/MusicService.c1 : Ll3;
    //   8: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   11: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   14: astore #36
    //   16: aload #36
    //   18: ifnonnull -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: new d51
    //   27: astore #40
    //   29: aload #40
    //   31: aload_0
    //   32: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   35: ldc_w 'in.krosbits.musicolet.nid.0'
    //   38: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   41: invokestatic y : ()Lkm0;
    //   44: astore #38
    //   46: aload #38
    //   48: ifnull -> 7100
    //   51: invokestatic d : ()Landroid/content/Context;
    //   54: invokestatic a : (Landroid/content/Context;)Lp01;
    //   57: invokevirtual e : ()Lj01;
    //   60: astore #36
    //   62: aload #36
    //   64: invokevirtual k : ()Landroid/support/v4/media/session/PlaybackStateCompat;
    //   67: astore #37
    //   69: aload #37
    //   71: ifnull -> 169
    //   74: aload #37
    //   76: invokevirtual i : ()I
    //   79: ifeq -> 169
    //   82: aload #37
    //   84: invokevirtual e : ()Landroid/os/Bundle;
    //   87: astore #37
    //   89: aload #37
    //   91: ifnull -> 133
    //   94: aload #37
    //   96: ldc_w 'EXT_RID'
    //   99: iconst_m1
    //   100: invokevirtual getInt : (Ljava/lang/String;I)I
    //   103: istore #11
    //   105: iload #11
    //   107: iconst_m1
    //   108: if_icmpeq -> 133
    //   111: aload #38
    //   113: getfield b : I
    //   116: istore #10
    //   118: iload #11
    //   120: iload #10
    //   122: if_icmpeq -> 133
    //   125: aload_0
    //   126: monitorexit
    //   127: return
    //   128: astore #36
    //   130: goto -> 164
    //   133: aload #36
    //   135: getfield c : Ljava/lang/Object;
    //   138: checkcast android/support/v4/media/session/f
    //   141: getfield a : Landroid/media/session/MediaController;
    //   144: invokevirtual getMetadata : ()Landroid/media/MediaMetadata;
    //   147: astore #36
    //   149: aload #36
    //   151: ifnull -> 169
    //   154: aload #36
    //   156: invokestatic b : (Landroid/media/MediaMetadata;)Landroid/support/v4/media/MediaMetadataCompat;
    //   159: astore #36
    //   161: goto -> 172
    //   164: aload #36
    //   166: invokevirtual printStackTrace : ()V
    //   169: aconst_null
    //   170: astore #36
    //   172: aload #36
    //   174: ifnonnull -> 180
    //   177: aload_0
    //   178: monitorexit
    //   179: return
    //   180: aload_0
    //   181: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   184: ldc_w 2131165390
    //   187: invokevirtual getDimension : (I)F
    //   190: ldc_w 120.0
    //   193: fmul
    //   194: f2i
    //   195: istore #28
    //   197: aload_0
    //   198: getfield u : Landroid/content/SharedPreferences;
    //   201: ldc_w 'k_i_nstl'
    //   204: getstatic jm1.d : I
    //   207: invokeinterface getInt : (Ljava/lang/String;I)I
    //   212: istore #12
    //   214: invokestatic c0 : ()Z
    //   217: ifne -> 250
    //   220: aload_0
    //   221: getfield u : Landroid/content/SharedPreferences;
    //   224: ldc_w 'k_b_mn_ex'
    //   227: iconst_1
    //   228: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   233: ifeq -> 239
    //   236: goto -> 250
    //   239: iconst_0
    //   240: istore #10
    //   242: goto -> 253
    //   245: astore #36
    //   247: goto -> 7236
    //   250: iconst_1
    //   251: istore #10
    //   253: invokestatic c0 : ()Z
    //   256: ifne -> 281
    //   259: aload_0
    //   260: getfield u : Landroid/content/SharedPreferences;
    //   263: ldc_w 'k_b_mn_alex'
    //   266: iconst_0
    //   267: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   272: ifeq -> 281
    //   275: iconst_1
    //   276: istore #21
    //   278: goto -> 284
    //   281: iconst_0
    //   282: istore #21
    //   284: iload #10
    //   286: istore #22
    //   288: iload #21
    //   290: ifeq -> 296
    //   293: iconst_1
    //   294: istore #22
    //   296: getstatic android/os/Build$VERSION.SDK_INT : I
    //   299: istore #25
    //   301: iload #25
    //   303: bipush #35
    //   305: if_icmpge -> 346
    //   308: iload #25
    //   310: bipush #33
    //   312: if_icmplt -> 321
    //   315: iload #12
    //   317: iconst_2
    //   318: if_icmpeq -> 346
    //   321: aload_0
    //   322: getfield u : Landroid/content/SharedPreferences;
    //   325: ldc_w 'k_b_sclnot'
    //   328: iconst_1
    //   329: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   334: ifeq -> 340
    //   337: goto -> 346
    //   340: iconst_0
    //   341: istore #19
    //   343: goto -> 349
    //   346: iconst_1
    //   347: istore #19
    //   349: iload #19
    //   351: ifeq -> 360
    //   354: iconst_1
    //   355: istore #30
    //   357: goto -> 373
    //   360: aload_0
    //   361: getfield j : Z
    //   364: ifne -> 370
    //   367: goto -> 354
    //   370: iconst_0
    //   371: istore #30
    //   373: iload #12
    //   375: iconst_1
    //   376: if_icmpeq -> 404
    //   379: aload_0
    //   380: getfield u : Landroid/content/SharedPreferences;
    //   383: ldc_w 'k_b_mn_aa'
    //   386: iconst_1
    //   387: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   392: ifeq -> 398
    //   395: goto -> 404
    //   398: iconst_0
    //   399: istore #18
    //   401: goto -> 407
    //   404: iconst_1
    //   405: istore #18
    //   407: aload_0
    //   408: getfield u : Landroid/content/SharedPreferences;
    //   411: ldc_w 'k_b_mn_crcbcm'
    //   414: iconst_1
    //   415: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   420: istore #33
    //   422: aload_0
    //   423: getfield u : Landroid/content/SharedPreferences;
    //   426: ldc_w 'k_b_mn_crcbex'
    //   429: iconst_1
    //   430: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   435: istore #31
    //   437: aload_0
    //   438: getfield u : Landroid/content/SharedPreferences;
    //   441: ldc_w 'k_i_mn_bg'
    //   444: getstatic jm1.a : I
    //   447: invokeinterface getInt : (Ljava/lang/String;I)I
    //   452: istore #10
    //   454: iload #10
    //   456: iconst_2
    //   457: if_icmpeq -> 476
    //   460: iload #10
    //   462: istore #11
    //   464: iload #10
    //   466: iconst_3
    //   467: if_icmpne -> 473
    //   470: goto -> 476
    //   473: goto -> 483
    //   476: bipush #6
    //   478: istore #11
    //   480: goto -> 473
    //   483: iload #11
    //   485: istore #10
    //   487: iload #11
    //   489: bipush #6
    //   491: if_icmpne -> 509
    //   494: invokestatic K : ()Z
    //   497: ifeq -> 506
    //   500: iconst_2
    //   501: istore #10
    //   503: goto -> 509
    //   506: iconst_3
    //   507: istore #10
    //   509: iload #10
    //   511: istore #23
    //   513: iload #12
    //   515: iconst_1
    //   516: if_icmpne -> 522
    //   519: iconst_4
    //   520: istore #23
    //   522: aload #38
    //   524: invokestatic o : (Lkm0;)Landroid/graphics/Bitmap;
    //   527: astore #36
    //   529: aload #38
    //   531: invokestatic v : (Lkm0;)Ly51;
    //   534: astore #41
    //   536: aload #38
    //   538: invokestatic w : (Lkm0;)Ly51;
    //   541: astore #37
    //   543: aload #37
    //   545: astore #43
    //   547: aload #37
    //   549: ifnonnull -> 556
    //   552: aload #41
    //   554: astore #43
    //   556: ldc_w -14606047
    //   559: istore #11
    //   561: aload #41
    //   563: ifnull -> 738
    //   566: aload #41
    //   568: invokevirtual c : ()Lx51;
    //   571: astore #42
    //   573: aload #42
    //   575: ifnull -> 717
    //   578: aload #42
    //   580: getfield d : I
    //   583: ldc_w -16777216
    //   586: ior
    //   587: istore #11
    //   589: aload #43
    //   591: invokevirtual h : ()Lx51;
    //   594: astore #39
    //   596: aload #43
    //   598: invokevirtual f : ()Lx51;
    //   601: astore #44
    //   603: aload #39
    //   605: ifnull -> 632
    //   608: aload #39
    //   610: astore #37
    //   612: aload #39
    //   614: getfield d : I
    //   617: iload #11
    //   619: invokestatic d : (II)D
    //   622: ldc2_w 3.5
    //   625: dcmpg
    //   626: ifge -> 657
    //   629: goto -> 632
    //   632: iload #11
    //   634: invokestatic E0 : (I)Z
    //   637: ifeq -> 650
    //   640: aload #43
    //   642: invokevirtual e : ()Lx51;
    //   645: astore #37
    //   647: goto -> 657
    //   650: aload #43
    //   652: invokevirtual b : ()Lx51;
    //   655: astore #37
    //   657: aload #44
    //   659: ifnull -> 689
    //   662: aload #44
    //   664: astore #39
    //   666: aload #44
    //   668: getfield d : I
    //   671: iload #11
    //   673: invokestatic d : (II)D
    //   676: ldc2_w 3.0
    //   679: dcmpg
    //   680: ifge -> 686
    //   683: goto -> 689
    //   686: goto -> 744
    //   689: iload #11
    //   691: invokestatic E0 : (I)Z
    //   694: ifeq -> 707
    //   697: aload #43
    //   699: invokevirtual d : ()Lx51;
    //   702: astore #39
    //   704: goto -> 686
    //   707: aload #43
    //   709: invokevirtual a : ()Lx51;
    //   712: astore #39
    //   714: goto -> 686
    //   717: aload #42
    //   719: astore #37
    //   721: aconst_null
    //   722: astore #43
    //   724: aconst_null
    //   725: astore #39
    //   727: aload #37
    //   729: astore #42
    //   731: aload #43
    //   733: astore #37
    //   735: goto -> 744
    //   738: aconst_null
    //   739: astore #37
    //   741: goto -> 721
    //   744: aload #42
    //   746: ifnonnull -> 755
    //   749: aconst_null
    //   750: astore #41
    //   752: goto -> 758
    //   755: goto -> 752
    //   758: iload #12
    //   760: ifne -> 902
    //   763: ldc_w -1996488704
    //   766: istore #13
    //   768: iload #23
    //   770: ifne -> 798
    //   773: iconst_m1
    //   774: istore #10
    //   776: ldc_w -16777216
    //   779: istore #15
    //   781: iconst_0
    //   782: istore #14
    //   784: iconst_1
    //   785: istore #16
    //   787: iload #13
    //   789: istore #11
    //   791: iload #15
    //   793: istore #13
    //   795: goto -> 868
    //   798: iload #23
    //   800: iconst_2
    //   801: if_icmpne -> 812
    //   804: ldc_w 16777215
    //   807: istore #10
    //   809: goto -> 776
    //   812: iload #23
    //   814: iconst_3
    //   815: if_icmpne -> 850
    //   818: iconst_0
    //   819: istore #10
    //   821: iconst_0
    //   822: istore #11
    //   824: ldc_w -1291845633
    //   827: istore #15
    //   829: iconst_m1
    //   830: istore #13
    //   832: iconst_0
    //   833: istore #16
    //   835: iload #10
    //   837: istore #14
    //   839: iload #11
    //   841: istore #10
    //   843: iload #15
    //   845: istore #11
    //   847: goto -> 868
    //   850: iload #23
    //   852: iconst_4
    //   853: if_icmpne -> 862
    //   856: iconst_1
    //   857: istore #10
    //   859: goto -> 824
    //   862: iconst_0
    //   863: istore #10
    //   865: goto -> 824
    //   868: iload #23
    //   870: iconst_5
    //   871: if_icmpne -> 892
    //   874: ldc_w -1711276032
    //   877: istore #10
    //   879: iconst_1
    //   880: istore #14
    //   882: iconst_1
    //   883: istore #15
    //   885: iload #16
    //   887: istore #20
    //   889: goto -> 927
    //   892: iconst_0
    //   893: istore #15
    //   895: iload #16
    //   897: istore #20
    //   899: goto -> 927
    //   902: ldc_w -1291845633
    //   905: istore #16
    //   907: iload #11
    //   909: istore #10
    //   911: iconst_0
    //   912: istore #14
    //   914: iconst_0
    //   915: istore #15
    //   917: iconst_m1
    //   918: istore #13
    //   920: iconst_0
    //   921: istore #20
    //   923: iload #16
    //   925: istore #11
    //   927: iload #11
    //   929: istore #17
    //   931: iload #13
    //   933: istore #16
    //   935: aload #41
    //   937: ifnull -> 1256
    //   940: iload #11
    //   942: istore #17
    //   944: iload #13
    //   946: istore #16
    //   948: aload #42
    //   950: ifnull -> 1256
    //   953: aload #37
    //   955: ifnull -> 976
    //   958: aload #37
    //   960: getfield d : I
    //   963: istore #11
    //   965: iload #11
    //   967: ldc_w -16777216
    //   970: ior
    //   971: istore #17
    //   973: goto -> 991
    //   976: aload #42
    //   978: invokevirtual a : ()V
    //   981: aload #42
    //   983: getfield h : I
    //   986: istore #11
    //   988: goto -> 965
    //   991: aload #39
    //   993: ifnull -> 1006
    //   996: aload #39
    //   998: getfield d : I
    //   1001: istore #13
    //   1003: goto -> 1018
    //   1006: aload #42
    //   1008: invokevirtual a : ()V
    //   1011: aload #42
    //   1013: getfield g : I
    //   1016: istore #13
    //   1018: iload #17
    //   1020: iload #10
    //   1022: invokestatic d : (II)D
    //   1025: dstore #8
    //   1027: iload #13
    //   1029: iload #10
    //   1031: invokestatic d : (II)D
    //   1034: dstore #4
    //   1036: iload #17
    //   1038: istore #16
    //   1040: iload #13
    //   1042: istore #11
    //   1044: dload #8
    //   1046: dstore #6
    //   1048: dload #4
    //   1050: dstore_2
    //   1051: dload #8
    //   1053: ldc2_w 3.5
    //   1056: dcmpl
    //   1057: iflt -> 1130
    //   1060: iload #17
    //   1062: istore #16
    //   1064: iload #13
    //   1066: istore #11
    //   1068: dload #8
    //   1070: dstore #6
    //   1072: dload #4
    //   1074: dstore_2
    //   1075: dload #4
    //   1077: ldc2_w 3.0
    //   1080: dcmpl
    //   1081: iflt -> 1130
    //   1084: iload #17
    //   1086: istore #16
    //   1088: iload #13
    //   1090: istore #11
    //   1092: dload #8
    //   1094: dstore #6
    //   1096: dload #4
    //   1098: dstore_2
    //   1099: dload #4
    //   1101: dload #8
    //   1103: dsub
    //   1104: ldc2_w 2.0
    //   1107: dcmpl
    //   1108: iflt -> 1130
    //   1111: iload #17
    //   1113: istore #11
    //   1115: iload #13
    //   1117: ldc_w -16777216
    //   1120: ior
    //   1121: istore #16
    //   1123: dload #8
    //   1125: dstore_2
    //   1126: dload #4
    //   1128: dstore #6
    //   1130: ldc2_w 2.147483647E9
    //   1133: dstore #8
    //   1135: dload #6
    //   1137: dstore #4
    //   1139: dload #6
    //   1141: ldc2_w 3.5
    //   1144: dcmpl
    //   1145: iflt -> 1153
    //   1148: ldc2_w 2.147483647E9
    //   1151: dstore #4
    //   1153: dload_2
    //   1154: dstore #6
    //   1156: dload_2
    //   1157: ldc2_w 3.0
    //   1160: dcmpl
    //   1161: iflt -> 1169
    //   1164: ldc2_w 2.147483647E9
    //   1167: dstore #6
    //   1169: iload #16
    //   1171: istore #13
    //   1173: dload #4
    //   1175: dstore_2
    //   1176: dload #4
    //   1178: ldc2_w 3.5
    //   1181: dcmpg
    //   1182: ifge -> 1205
    //   1185: aload #42
    //   1187: invokevirtual a : ()V
    //   1190: aload #42
    //   1192: getfield h : I
    //   1195: ldc_w -16777216
    //   1198: ior
    //   1199: istore #13
    //   1201: ldc2_w 2.147483647E9
    //   1204: dstore_2
    //   1205: dload #6
    //   1207: ldc2_w 3.0
    //   1210: dcmpg
    //   1211: ifge -> 1233
    //   1214: aload #42
    //   1216: invokevirtual a : ()V
    //   1219: aload #42
    //   1221: getfield g : I
    //   1224: istore #16
    //   1226: dload #8
    //   1228: dstore #6
    //   1230: goto -> 1237
    //   1233: iload #11
    //   1235: istore #16
    //   1237: dload_2
    //   1238: dload #6
    //   1240: dcmpg
    //   1241: ifge -> 1267
    //   1244: iload #16
    //   1246: ldc_w -16777216
    //   1249: ior
    //   1250: istore #16
    //   1252: iload #13
    //   1254: istore #17
    //   1256: iload #16
    //   1258: istore #11
    //   1260: iload #17
    //   1262: istore #24
    //   1264: goto -> 1275
    //   1267: iload #13
    //   1269: istore #11
    //   1271: iload #16
    //   1273: istore #24
    //   1275: new android/content/Intent
    //   1278: astore #37
    //   1280: aload #37
    //   1282: aload_0
    //   1283: ldc in/krosbits/musicolet/MusicService
    //   1285: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1288: aload #37
    //   1290: ldc_w 'ACTION_NEXT'
    //   1293: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1296: ldc_w 'EXT_DIP'
    //   1299: iconst_0
    //   1300: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   1303: astore #47
    //   1305: new android/content/Intent
    //   1308: astore #37
    //   1310: aload #37
    //   1312: aload_0
    //   1313: ldc in/krosbits/musicolet/MusicService
    //   1315: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1318: aload #37
    //   1320: getstatic r3/IKWi/AyxAR.zzFQ : Ljava/lang/String;
    //   1323: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1326: ldc_w 'EXT_DIP'
    //   1329: iconst_0
    //   1330: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   1333: astore #48
    //   1335: new android/content/Intent
    //   1338: astore #37
    //   1340: aload #37
    //   1342: aload_0
    //   1343: ldc in/krosbits/musicolet/MusicService
    //   1345: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1348: aload #37
    //   1350: ldc_w 'ACTION_CLOSE'
    //   1353: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1356: astore #37
    //   1358: new android/content/Intent
    //   1361: astore #39
    //   1363: aload #39
    //   1365: aload_0
    //   1366: ldc in/krosbits/musicolet/MusicService
    //   1368: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1371: aload #39
    //   1373: ldc_w 'ACT_NOTCL'
    //   1376: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1379: astore #46
    //   1381: new android/content/Intent
    //   1384: astore #39
    //   1386: aload #39
    //   1388: aload_0
    //   1389: ldc in/krosbits/musicolet/MusicService
    //   1391: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1394: aload #39
    //   1396: ldc_w 'ACTION_PLAY_PAUSE'
    //   1399: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1402: astore #50
    //   1404: new android/content/Intent
    //   1407: astore #39
    //   1409: aload #39
    //   1411: aload_0
    //   1412: ldc in/krosbits/musicolet/MusicService
    //   1414: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1417: aload #39
    //   1419: ldc_w 'AF10'
    //   1422: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1425: astore #49
    //   1427: new android/content/Intent
    //   1430: astore #39
    //   1432: aload #39
    //   1434: aload_0
    //   1435: ldc in/krosbits/musicolet/MusicService
    //   1437: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1440: aload #39
    //   1442: ldc_w 'AR10'
    //   1445: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1448: astore #52
    //   1450: new android/content/Intent
    //   1453: astore #39
    //   1455: aload #39
    //   1457: aload_0
    //   1458: ldc in/krosbits/musicolet/MusicService
    //   1460: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1463: aload #39
    //   1465: ldc_w 'ACT_FAV'
    //   1468: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1471: ldc_w 'EXT_S_RID'
    //   1474: aload #38
    //   1476: getfield b : I
    //   1479: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   1482: astore #53
    //   1484: new android/content/Intent
    //   1487: astore #39
    //   1489: aload #39
    //   1491: aload_0
    //   1492: ldc_w in/krosbits/musicolet/GhostSearchActivity
    //   1495: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1498: aload #39
    //   1500: ldc_w 'A_ADTPL'
    //   1503: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1506: astore #39
    //   1508: aload #37
    //   1510: astore #43
    //   1512: aload #39
    //   1514: ldc_w 'E_1_SRI'
    //   1517: aload #38
    //   1519: getfield b : I
    //   1522: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   1525: ldc_w 'E_SHOLCSR'
    //   1528: iconst_1
    //   1529: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   1532: astore #51
    //   1534: new android/content/Intent
    //   1537: astore #39
    //   1539: aload #39
    //   1541: aload_0
    //   1542: ldc in/krosbits/musicolet/MusicService
    //   1544: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1547: aload #39
    //   1549: ldc_w 'ACT_RPTS_TGL'
    //   1552: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1555: astore #56
    //   1557: new android/content/Intent
    //   1560: astore #39
    //   1562: aload #39
    //   1564: aload_0
    //   1565: ldc in/krosbits/musicolet/MusicService
    //   1567: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1570: aload #39
    //   1572: ldc_w 'ACT_REPTQ_TGL'
    //   1575: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1578: astore #55
    //   1580: new android/content/Intent
    //   1583: astore #39
    //   1585: aload #39
    //   1587: aload_0
    //   1588: ldc in/krosbits/musicolet/MusicService
    //   1590: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1593: aload #39
    //   1595: getstatic org/jaudiotagger/audio/opus/bsQ/uvJYmft.ppwJbCRBbVIE : Ljava/lang/String;
    //   1598: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1601: astore #39
    //   1603: aload_0
    //   1604: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1607: aload #38
    //   1609: invokevirtual c : (Lkm0;)Z
    //   1612: ifeq -> 1627
    //   1615: ldc_w 2131231058
    //   1618: istore #26
    //   1620: aload #38
    //   1622: astore #42
    //   1624: goto -> 1635
    //   1627: ldc_w 2131231057
    //   1630: istore #26
    //   1632: goto -> 1620
    //   1635: invokestatic z : ()Ltf1;
    //   1638: astore #54
    //   1640: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1643: ifeq -> 1658
    //   1646: ldc_w 2131231397
    //   1649: istore #13
    //   1651: aload #39
    //   1653: astore #44
    //   1655: goto -> 1666
    //   1658: ldc_w 2131231399
    //   1661: istore #13
    //   1663: goto -> 1651
    //   1666: iload #12
    //   1668: ifeq -> 2562
    //   1671: iload #12
    //   1673: iconst_1
    //   1674: if_icmpne -> 1680
    //   1677: goto -> 2562
    //   1680: iload #12
    //   1682: iconst_2
    //   1683: if_icmpne -> 2552
    //   1686: aload #40
    //   1688: iconst_1
    //   1689: invokevirtual e : (Z)V
    //   1692: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1695: ldc_w 'k_b_st_ex_blayt'
    //   1698: bipush #85
    //   1700: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1705: istore #11
    //   1707: iload #25
    //   1709: bipush #33
    //   1711: if_icmplt -> 1718
    //   1714: bipush #84
    //   1716: istore #11
    //   1718: iconst_1
    //   1719: iload #11
    //   1721: invokestatic b : (II)Z
    //   1724: ifeq -> 1763
    //   1727: aload_0
    //   1728: ldc_w 2131887512
    //   1731: invokevirtual getString : (I)Ljava/lang/String;
    //   1734: astore #37
    //   1736: aload #40
    //   1738: iload #26
    //   1740: aload_0
    //   1741: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1744: iconst_0
    //   1745: aload #53
    //   1747: iload #30
    //   1749: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   1752: aload #37
    //   1754: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1757: iconst_1
    //   1758: istore #10
    //   1760: goto -> 1769
    //   1763: iconst_0
    //   1764: istore #10
    //   1766: goto -> 1760
    //   1769: iload #10
    //   1771: istore #15
    //   1773: iconst_2
    //   1774: iload #11
    //   1776: invokestatic b : (II)Z
    //   1779: ifeq -> 1825
    //   1782: aload #54
    //   1784: getfield a : I
    //   1787: istore #12
    //   1789: aload_0
    //   1790: ldc_w 2131887182
    //   1793: invokevirtual getString : (I)Ljava/lang/String;
    //   1796: astore #37
    //   1798: aload #40
    //   1800: iload #12
    //   1802: aload_0
    //   1803: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1806: iconst_0
    //   1807: aload #56
    //   1809: iload #30
    //   1811: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   1814: aload #37
    //   1816: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1819: iload #10
    //   1821: iconst_1
    //   1822: iadd
    //   1823: istore #15
    //   1825: aload_0
    //   1826: ldc_w 2131887124
    //   1829: invokevirtual getString : (I)Ljava/lang/String;
    //   1832: astore #37
    //   1834: aload #40
    //   1836: ldc_w 2131231066
    //   1839: aload_0
    //   1840: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1843: iconst_0
    //   1844: aload #48
    //   1846: iload #30
    //   1848: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   1851: aload #37
    //   1853: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1856: iload #15
    //   1858: iconst_1
    //   1859: iadd
    //   1860: istore #12
    //   1862: bipush #8
    //   1864: iload #11
    //   1866: invokestatic b : (II)Z
    //   1869: ifeq -> 1909
    //   1872: aload_0
    //   1873: ldc_w 2131887239
    //   1876: invokevirtual getString : (I)Ljava/lang/String;
    //   1879: astore #37
    //   1881: aload #40
    //   1883: ldc_w 2131231138
    //   1886: aload_0
    //   1887: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1890: iconst_0
    //   1891: aload #52
    //   1893: iload #30
    //   1895: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   1898: aload #37
    //   1900: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1903: iload #15
    //   1905: iconst_2
    //   1906: iadd
    //   1907: istore #12
    //   1909: aload_0
    //   1910: getfield j : Z
    //   1913: ifeq -> 1924
    //   1916: ldc_w 2131231064
    //   1919: istore #10
    //   1921: goto -> 1929
    //   1924: ldc_w 2131231062
    //   1927: istore #10
    //   1929: aload_0
    //   1930: ldc_w 2131887090
    //   1933: invokevirtual getString : (I)Ljava/lang/String;
    //   1936: astore #37
    //   1938: aload #40
    //   1940: iload #10
    //   1942: aload_0
    //   1943: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1946: iconst_0
    //   1947: aload #50
    //   1949: iload #30
    //   1951: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   1954: aload #37
    //   1956: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   1959: iload #12
    //   1961: iconst_1
    //   1962: iadd
    //   1963: istore #16
    //   1965: bipush #32
    //   1967: iload #11
    //   1969: invokestatic b : (II)Z
    //   1972: ifeq -> 2015
    //   1975: aload_0
    //   1976: ldc_w 2131886554
    //   1979: invokevirtual getString : (I)Ljava/lang/String;
    //   1982: astore #37
    //   1984: aload #40
    //   1986: ldc_w 2131231136
    //   1989: aload_0
    //   1990: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1993: iconst_0
    //   1994: aload #49
    //   1996: iload #30
    //   1998: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   2001: aload #37
    //   2003: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2006: iload #12
    //   2008: iconst_2
    //   2009: iadd
    //   2010: istore #17
    //   2012: goto -> 2019
    //   2015: iload #16
    //   2017: istore #17
    //   2019: aload_0
    //   2020: ldc_w 2131886986
    //   2023: invokevirtual getString : (I)Ljava/lang/String;
    //   2026: astore #37
    //   2028: aload #40
    //   2030: ldc_w 2131231060
    //   2033: aload_0
    //   2034: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2037: iconst_0
    //   2038: aload #47
    //   2040: iload #30
    //   2042: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   2045: aload #37
    //   2047: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2050: iload #17
    //   2052: iconst_1
    //   2053: iadd
    //   2054: istore #10
    //   2056: sipush #128
    //   2059: iload #11
    //   2061: invokestatic b : (II)Z
    //   2064: ifeq -> 2103
    //   2067: aload_0
    //   2068: ldc_w 2131887398
    //   2071: invokevirtual getString : (I)Ljava/lang/String;
    //   2074: astore #37
    //   2076: aload #40
    //   2078: iload #13
    //   2080: aload_0
    //   2081: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2084: iconst_0
    //   2085: aload #44
    //   2087: iload #30
    //   2089: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   2092: aload #37
    //   2094: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2097: iload #17
    //   2099: iconst_2
    //   2100: iadd
    //   2101: istore #10
    //   2103: sipush #512
    //   2106: iload #11
    //   2108: invokestatic b : (II)Z
    //   2111: istore #32
    //   2113: iload #32
    //   2115: ifeq -> 2149
    //   2118: aload_0
    //   2119: ldc_w 2131886125
    //   2122: invokevirtual getString : (I)Ljava/lang/String;
    //   2125: astore #37
    //   2127: aload #40
    //   2129: ldc_w 2131231371
    //   2132: aload_0
    //   2133: aload #51
    //   2135: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   2138: aload #37
    //   2140: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2143: iinc #10, 1
    //   2146: goto -> 2149
    //   2149: iload #19
    //   2151: ifne -> 2178
    //   2154: iload #25
    //   2156: bipush #33
    //   2158: if_icmplt -> 2164
    //   2161: goto -> 2178
    //   2164: iconst_0
    //   2165: istore #13
    //   2167: iload #10
    //   2169: istore #11
    //   2171: iload #13
    //   2173: istore #10
    //   2175: goto -> 2270
    //   2178: iload #31
    //   2180: ifeq -> 2230
    //   2183: iload #32
    //   2185: ifne -> 2230
    //   2188: aload_0
    //   2189: getfield j : Z
    //   2192: ifne -> 2230
    //   2195: iload #25
    //   2197: bipush #33
    //   2199: if_icmpge -> 2230
    //   2202: aload_0
    //   2203: ldc_w 2131886125
    //   2206: invokevirtual getString : (I)Ljava/lang/String;
    //   2209: astore #37
    //   2211: aload #40
    //   2213: ldc_w 2131231371
    //   2216: aload_0
    //   2217: aload #51
    //   2219: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   2222: aload #37
    //   2224: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2227: goto -> 2261
    //   2230: aload_0
    //   2231: ldc_w 2131886364
    //   2234: invokevirtual getString : (I)Ljava/lang/String;
    //   2237: astore #37
    //   2239: aload #40
    //   2241: ldc_w 2131231115
    //   2244: aload_0
    //   2245: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2248: iconst_0
    //   2249: aload #43
    //   2251: iload #30
    //   2253: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   2256: aload #37
    //   2258: invokevirtual a : (ILandroid/app/PendingIntent;Ljava/lang/String;)V
    //   2261: iload #10
    //   2263: iconst_1
    //   2264: iadd
    //   2265: istore #11
    //   2267: goto -> 2175
    //   2270: iload #11
    //   2272: iconst_5
    //   2273: if_icmple -> 2282
    //   2276: iconst_5
    //   2277: istore #11
    //   2279: goto -> 2282
    //   2282: iload #18
    //   2284: ifeq -> 2342
    //   2287: aload #36
    //   2289: ifnull -> 2299
    //   2292: aload #36
    //   2294: astore #37
    //   2296: goto -> 2309
    //   2299: iconst_2
    //   2300: iconst_2
    //   2301: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   2304: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   2307: astore #37
    //   2309: aload #40
    //   2311: getfield a : Landroid/app/Notification$Builder;
    //   2314: astore #39
    //   2316: aload #39
    //   2318: ifnull -> 2332
    //   2321: aload #39
    //   2323: aload #37
    //   2325: invokevirtual setLargeIcon : (Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
    //   2328: pop
    //   2329: goto -> 2342
    //   2332: aload #40
    //   2334: getfield b : Ls21;
    //   2337: aload #37
    //   2339: invokevirtual e : (Landroid/graphics/Bitmap;)V
    //   2342: aload #41
    //   2344: ifnull -> 2356
    //   2347: aload #41
    //   2349: aload #36
    //   2351: aload #40
    //   2353: invokestatic d : (Ly51;Landroid/graphics/Bitmap;Ld51;)V
    //   2356: new c51
    //   2359: astore #36
    //   2361: aload #36
    //   2363: invokespecial <init> : ()V
    //   2366: aload #36
    //   2368: aload_0
    //   2369: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2372: invokestatic a : (Landroid/content/Context;)Lp01;
    //   2375: invokevirtual h : ()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    //   2378: invokevirtual l : (Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lu21;
    //   2381: pop
    //   2382: aload_0
    //   2383: getfield j : Z
    //   2386: ifeq -> 2492
    //   2389: iload #12
    //   2391: iconst_1
    //   2392: isub
    //   2393: istore #13
    //   2395: iload #13
    //   2397: iload #15
    //   2399: if_icmpeq -> 2405
    //   2402: goto -> 2408
    //   2405: iconst_0
    //   2406: istore #13
    //   2408: iload #19
    //   2410: ifeq -> 2416
    //   2413: goto -> 2436
    //   2416: iload #16
    //   2418: iload #17
    //   2420: if_icmpeq -> 2430
    //   2423: iload #16
    //   2425: istore #10
    //   2427: goto -> 2436
    //   2430: iload #11
    //   2432: iconst_1
    //   2433: isub
    //   2434: istore #10
    //   2436: iconst_3
    //   2437: newarray int
    //   2439: astore #39
    //   2441: aload #39
    //   2443: iconst_0
    //   2444: iload #13
    //   2446: iastore
    //   2447: aload #39
    //   2449: iconst_1
    //   2450: iload #12
    //   2452: iastore
    //   2453: aload #39
    //   2455: iconst_2
    //   2456: iload #10
    //   2458: iastore
    //   2459: aload #36
    //   2461: getfield d : Landroid/app/Notification$MediaStyle;
    //   2464: astore #37
    //   2466: aload #37
    //   2468: ifnull -> 2482
    //   2471: aload #37
    //   2473: aload #39
    //   2475: invokevirtual setShowActionsInCompactView : ([I)Landroid/app/Notification$MediaStyle;
    //   2478: pop
    //   2479: goto -> 2545
    //   2482: aload #36
    //   2484: aload #39
    //   2486: putfield b : [I
    //   2489: goto -> 2545
    //   2492: iconst_3
    //   2493: newarray int
    //   2495: astore #39
    //   2497: aload #39
    //   2499: iconst_0
    //   2500: iload #15
    //   2502: iastore
    //   2503: aload #39
    //   2505: iconst_1
    //   2506: iload #12
    //   2508: iastore
    //   2509: aload #39
    //   2511: iconst_2
    //   2512: iload #17
    //   2514: iastore
    //   2515: aload #36
    //   2517: getfield d : Landroid/app/Notification$MediaStyle;
    //   2520: astore #37
    //   2522: aload #37
    //   2524: ifnull -> 2538
    //   2527: aload #37
    //   2529: aload #39
    //   2531: invokevirtual setShowActionsInCompactView : ([I)Landroid/app/Notification$MediaStyle;
    //   2534: pop
    //   2535: goto -> 2545
    //   2538: aload #36
    //   2540: aload #39
    //   2542: putfield b : [I
    //   2545: aload #40
    //   2547: aload #36
    //   2549: invokevirtual p : (Lhd;)V
    //   2552: aload #40
    //   2554: astore #36
    //   2556: iconst_0
    //   2557: istore #11
    //   2559: goto -> 6445
    //   2562: iload #23
    //   2564: iconst_2
    //   2565: if_icmpeq -> 2581
    //   2568: iload #23
    //   2570: iconst_3
    //   2571: if_icmpeq -> 2581
    //   2574: iload #23
    //   2576: bipush #6
    //   2578: if_icmpne -> 2592
    //   2581: iload #12
    //   2583: ifne -> 2592
    //   2586: iconst_0
    //   2587: istore #25
    //   2589: goto -> 2595
    //   2592: iconst_1
    //   2593: istore #25
    //   2595: invokestatic c0 : ()Z
    //   2598: ifeq -> 2650
    //   2601: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2604: ldc_w 'k_b_clntfc'
    //   2607: iconst_1
    //   2608: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   2613: ifeq -> 2647
    //   2616: iload #19
    //   2618: ifeq -> 2647
    //   2621: iload #23
    //   2623: ifeq -> 2641
    //   2626: iload #23
    //   2628: iconst_1
    //   2629: if_icmpeq -> 2641
    //   2632: iload #23
    //   2634: iconst_4
    //   2635: if_icmpne -> 2653
    //   2638: goto -> 2641
    //   2641: iconst_1
    //   2642: istore #17
    //   2644: goto -> 2656
    //   2647: goto -> 2653
    //   2650: goto -> 2647
    //   2653: iconst_0
    //   2654: istore #17
    //   2656: iload #13
    //   2658: istore #16
    //   2660: iload #21
    //   2662: ifne -> 3686
    //   2665: iload #12
    //   2667: iconst_1
    //   2668: if_icmpne -> 2679
    //   2671: ldc_w 2131493033
    //   2674: istore #23
    //   2676: goto -> 2684
    //   2679: ldc_w 2131493037
    //   2682: istore #23
    //   2684: new android/widget/RemoteViews
    //   2687: astore #45
    //   2689: aload #45
    //   2691: ldc_w 'in.krosbits.musicolet'
    //   2694: iload #23
    //   2696: invokespecial <init> : (Ljava/lang/String;I)V
    //   2699: iload #17
    //   2701: ifeq -> 2710
    //   2704: iconst_0
    //   2705: istore #23
    //   2707: goto -> 2717
    //   2710: iload #10
    //   2712: istore #23
    //   2714: goto -> 2707
    //   2717: aload #45
    //   2719: ldc_w 2131297942
    //   2722: ldc_w 'setBackgroundColor'
    //   2725: iload #23
    //   2727: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2730: iload #25
    //   2732: ifeq -> 2894
    //   2735: aload #45
    //   2737: ldc_w 2131297892
    //   2740: ldc_w 'setTextColor'
    //   2743: iload #11
    //   2745: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2748: aload #45
    //   2750: ldc_w 2131297880
    //   2753: ldc_w 'setTextColor'
    //   2756: iload #24
    //   2758: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2761: aload #45
    //   2763: ldc_w 2131296799
    //   2766: ldc_w 'setColorFilter'
    //   2769: iload #11
    //   2771: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2774: aload #45
    //   2776: ldc_w 2131296807
    //   2779: ldc_w 'setColorFilter'
    //   2782: iload #11
    //   2784: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2787: aload #45
    //   2789: ldc_w 2131296804
    //   2792: ldc_w 'setColorFilter'
    //   2795: iload #11
    //   2797: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2800: aload #45
    //   2802: ldc_w 2131296808
    //   2805: ldc_w 'setColorFilter'
    //   2808: iload #11
    //   2810: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2813: aload #45
    //   2815: ldc_w 2131296803
    //   2818: ldc_w 'setColorFilter'
    //   2821: iload #11
    //   2823: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2826: aload #45
    //   2828: ldc_w 2131296800
    //   2831: ldc_w 'setColorFilter'
    //   2834: iload #11
    //   2836: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2839: aload #45
    //   2841: ldc_w 2131296802
    //   2844: ldc_w 'setColorFilter'
    //   2847: iload #11
    //   2849: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2852: aload #45
    //   2854: ldc_w 2131296810
    //   2857: ldc_w 'setColorFilter'
    //   2860: iload #11
    //   2862: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2865: aload #45
    //   2867: ldc_w 2131296796
    //   2870: ldc_w 'setColorFilter'
    //   2873: iload #11
    //   2875: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2878: aload #45
    //   2880: ldc_w 2131296798
    //   2883: ldc_w 'setColorFilter'
    //   2886: iload #11
    //   2888: invokevirtual setInt : (ILjava/lang/String;I)V
    //   2891: goto -> 2894
    //   2894: aload_0
    //   2895: getfield j : Z
    //   2898: ifeq -> 2915
    //   2901: aload #45
    //   2903: ldc_w 2131296803
    //   2906: ldc_w 2131231064
    //   2909: invokevirtual setImageViewResource : (II)V
    //   2912: goto -> 2926
    //   2915: aload #45
    //   2917: ldc_w 2131296803
    //   2920: ldc_w 2131231062
    //   2923: invokevirtual setImageViewResource : (II)V
    //   2926: iload #18
    //   2928: ifeq -> 2978
    //   2931: aload #36
    //   2933: ifnull -> 2943
    //   2936: aload #36
    //   2938: astore #41
    //   2940: goto -> 2956
    //   2943: iconst_2
    //   2944: iconst_2
    //   2945: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   2948: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   2951: astore #41
    //   2953: goto -> 2940
    //   2956: aload #45
    //   2958: ldc_w 2131296913
    //   2961: aload #41
    //   2963: invokevirtual setImageViewBitmap : (ILandroid/graphics/Bitmap;)V
    //   2966: aload #45
    //   2968: ldc_w 2131296913
    //   2971: iconst_0
    //   2972: invokevirtual setViewVisibility : (II)V
    //   2975: goto -> 2988
    //   2978: aload #45
    //   2980: ldc_w 2131296913
    //   2983: bipush #8
    //   2985: invokevirtual setViewVisibility : (II)V
    //   2988: iload #15
    //   2990: ifeq -> 3040
    //   2993: aload #36
    //   2995: ifnull -> 3005
    //   2998: aload #36
    //   3000: astore #41
    //   3002: goto -> 3018
    //   3005: iconst_2
    //   3006: iconst_2
    //   3007: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   3010: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   3013: astore #41
    //   3015: goto -> 3002
    //   3018: aload #45
    //   3020: ldc_w 2131296837
    //   3023: aload #41
    //   3025: invokevirtual setImageViewBitmap : (ILandroid/graphics/Bitmap;)V
    //   3028: aload #45
    //   3030: ldc_w 2131296837
    //   3033: iconst_0
    //   3034: invokevirtual setViewVisibility : (II)V
    //   3037: goto -> 3053
    //   3040: aload #45
    //   3042: ldc_w 2131296837
    //   3045: bipush #8
    //   3047: invokevirtual setViewVisibility : (II)V
    //   3050: goto -> 3037
    //   3053: aload #45
    //   3055: ldc_w 2131296804
    //   3058: aload_0
    //   3059: iconst_0
    //   3060: aload #48
    //   3062: iload #30
    //   3064: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3067: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3070: aload #45
    //   3072: ldc_w 2131296803
    //   3075: aload_0
    //   3076: iconst_0
    //   3077: aload #50
    //   3079: iload #30
    //   3081: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3084: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3087: aload #45
    //   3089: ldc_w 2131296802
    //   3092: aload_0
    //   3093: iconst_0
    //   3094: aload #47
    //   3096: iload #30
    //   3098: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3101: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3104: iload #12
    //   3106: ifne -> 3117
    //   3109: ldc_w 'k_b_mn_cp_blayt'
    //   3112: astore #41
    //   3114: goto -> 3122
    //   3117: ldc_w 'k_b_mo_cp_blayt'
    //   3120: astore #41
    //   3122: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3125: aload #41
    //   3127: bipush #85
    //   3129: invokeinterface getInt : (Ljava/lang/String;I)I
    //   3134: istore #23
    //   3136: iconst_1
    //   3137: iload #23
    //   3139: invokestatic b : (II)Z
    //   3142: ifeq -> 3184
    //   3145: aload #45
    //   3147: ldc_w 2131296799
    //   3150: iconst_0
    //   3151: invokevirtual setViewVisibility : (II)V
    //   3154: aload #45
    //   3156: ldc_w 2131296799
    //   3159: iload #26
    //   3161: invokevirtual setImageViewResource : (II)V
    //   3164: aload #45
    //   3166: ldc_w 2131296799
    //   3169: aload_0
    //   3170: iconst_0
    //   3171: aload #53
    //   3173: iload #30
    //   3175: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3178: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3181: goto -> 3197
    //   3184: aload #45
    //   3186: ldc_w 2131296799
    //   3189: bipush #8
    //   3191: invokevirtual setViewVisibility : (II)V
    //   3194: goto -> 3181
    //   3197: iconst_2
    //   3198: iload #23
    //   3200: invokestatic b : (II)Z
    //   3203: ifeq -> 3248
    //   3206: aload #45
    //   3208: ldc_w 2131296807
    //   3211: iconst_0
    //   3212: invokevirtual setViewVisibility : (II)V
    //   3215: aload #45
    //   3217: ldc_w 2131296807
    //   3220: aload #54
    //   3222: getfield a : I
    //   3225: invokevirtual setImageViewResource : (II)V
    //   3228: aload #45
    //   3230: ldc_w 2131296807
    //   3233: aload_0
    //   3234: iconst_0
    //   3235: aload #56
    //   3237: iload #30
    //   3239: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3242: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3245: goto -> 3261
    //   3248: aload #45
    //   3250: ldc_w 2131296807
    //   3253: bipush #8
    //   3255: invokevirtual setViewVisibility : (II)V
    //   3258: goto -> 3245
    //   3261: bipush #32
    //   3263: iload #23
    //   3265: invokestatic b : (II)Z
    //   3268: ifeq -> 3300
    //   3271: aload #45
    //   3273: ldc_w 2131296800
    //   3276: iconst_0
    //   3277: invokevirtual setViewVisibility : (II)V
    //   3280: aload #45
    //   3282: ldc_w 2131296800
    //   3285: aload_0
    //   3286: iconst_0
    //   3287: aload #49
    //   3289: iload #30
    //   3291: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3294: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3297: goto -> 3310
    //   3300: aload #45
    //   3302: ldc_w 2131296800
    //   3305: bipush #8
    //   3307: invokevirtual setViewVisibility : (II)V
    //   3310: bipush #8
    //   3312: iload #23
    //   3314: invokestatic b : (II)Z
    //   3317: ifeq -> 3349
    //   3320: aload #45
    //   3322: ldc_w 2131296808
    //   3325: iconst_0
    //   3326: invokevirtual setViewVisibility : (II)V
    //   3329: aload #45
    //   3331: ldc_w 2131296808
    //   3334: aload_0
    //   3335: iconst_0
    //   3336: aload #52
    //   3338: iload #30
    //   3340: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3343: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3346: goto -> 3362
    //   3349: aload #45
    //   3351: ldc_w 2131296808
    //   3354: bipush #8
    //   3356: invokevirtual setViewVisibility : (II)V
    //   3359: goto -> 3346
    //   3362: sipush #128
    //   3365: iload #23
    //   3367: invokestatic b : (II)Z
    //   3370: ifeq -> 3416
    //   3373: aload #45
    //   3375: ldc_w 2131296810
    //   3378: iconst_0
    //   3379: invokevirtual setViewVisibility : (II)V
    //   3382: aload #45
    //   3384: ldc_w 2131296810
    //   3387: iload #16
    //   3389: invokevirtual setImageViewResource : (II)V
    //   3392: aload #45
    //   3394: ldc_w 2131296810
    //   3397: aload_0
    //   3398: iconst_0
    //   3399: aload #44
    //   3401: iload #30
    //   3403: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3406: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3409: iload #13
    //   3411: istore #16
    //   3413: goto -> 3429
    //   3416: aload #45
    //   3418: ldc_w 2131296810
    //   3421: bipush #8
    //   3423: invokevirtual setViewVisibility : (II)V
    //   3426: goto -> 3409
    //   3429: sipush #512
    //   3432: iload #23
    //   3434: invokestatic b : (II)Z
    //   3437: istore #32
    //   3439: iload #32
    //   3441: ifeq -> 3470
    //   3444: aload #45
    //   3446: ldc_w 2131296796
    //   3449: iconst_0
    //   3450: invokevirtual setViewVisibility : (II)V
    //   3453: aload #45
    //   3455: ldc_w 2131296796
    //   3458: aload_0
    //   3459: aload #51
    //   3461: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   3464: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3467: goto -> 3480
    //   3470: aload #45
    //   3472: ldc_w 2131296796
    //   3475: bipush #8
    //   3477: invokevirtual setViewVisibility : (II)V
    //   3480: iload #19
    //   3482: ifeq -> 3570
    //   3485: aload #45
    //   3487: ldc_w 2131296798
    //   3490: iconst_0
    //   3491: invokevirtual setViewVisibility : (II)V
    //   3494: iload #33
    //   3496: ifeq -> 3539
    //   3499: iload #32
    //   3501: ifne -> 3539
    //   3504: aload_0
    //   3505: getfield j : Z
    //   3508: ifne -> 3539
    //   3511: aload #45
    //   3513: ldc_w 2131296798
    //   3516: ldc_w 2131231371
    //   3519: invokevirtual setImageViewResource : (II)V
    //   3522: aload #45
    //   3524: ldc_w 2131296798
    //   3527: aload_0
    //   3528: aload #51
    //   3530: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   3533: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3536: goto -> 3580
    //   3539: aload #45
    //   3541: ldc_w 2131296798
    //   3544: ldc_w 2131231115
    //   3547: invokevirtual setImageViewResource : (II)V
    //   3550: aload #45
    //   3552: ldc_w 2131296798
    //   3555: aload_0
    //   3556: iconst_0
    //   3557: aload #43
    //   3559: iload #30
    //   3561: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   3564: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   3567: goto -> 3580
    //   3570: aload #45
    //   3572: ldc_w 2131296798
    //   3575: bipush #8
    //   3577: invokevirtual setViewVisibility : (II)V
    //   3580: aload #39
    //   3582: astore #41
    //   3584: aload #45
    //   3586: ldc_w 2131297892
    //   3589: getstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   3592: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   3595: aload #45
    //   3597: ldc_w 2131297880
    //   3600: invokestatic x : ()Ljava/lang/String;
    //   3603: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   3606: iload #12
    //   3608: iconst_1
    //   3609: if_icmpne -> 3671
    //   3612: invokestatic c0 : ()Z
    //   3615: ifne -> 3646
    //   3618: aload #37
    //   3620: astore #41
    //   3622: iload #12
    //   3624: istore #16
    //   3626: aload #45
    //   3628: ldc_w 2131297147
    //   3631: ldc_w 'setColorFilter'
    //   3634: iload #10
    //   3636: invokevirtual setInt : (ILjava/lang/String;I)V
    //   3639: aload #45
    //   3641: astore #41
    //   3643: goto -> 3693
    //   3646: aload #37
    //   3648: astore #41
    //   3650: iload #12
    //   3652: istore #16
    //   3654: aload #45
    //   3656: ldc_w 2131297147
    //   3659: bipush #8
    //   3661: invokevirtual setViewVisibility : (II)V
    //   3664: aload #45
    //   3666: astore #41
    //   3668: goto -> 3693
    //   3671: aload #37
    //   3673: astore #41
    //   3675: iload #12
    //   3677: istore #16
    //   3679: aload #45
    //   3681: astore #41
    //   3683: goto -> 3693
    //   3686: iload #12
    //   3688: istore #16
    //   3690: aconst_null
    //   3691: astore #41
    //   3693: aload #39
    //   3695: astore #43
    //   3697: aload #37
    //   3699: astore #44
    //   3701: iload #13
    //   3703: istore #27
    //   3705: iload #12
    //   3707: istore #23
    //   3709: iload #22
    //   3711: ifeq -> 6144
    //   3714: iload #23
    //   3716: ifne -> 3727
    //   3719: ldc_w 'k_b_mn_ex_blayt'
    //   3722: astore #37
    //   3724: goto -> 3732
    //   3727: ldc_w 'k_b_mo_ex_blayt'
    //   3730: astore #37
    //   3732: iload #23
    //   3734: ifne -> 3744
    //   3737: bipush #125
    //   3739: istore #12
    //   3741: goto -> 3751
    //   3744: bipush #85
    //   3746: istore #12
    //   3748: goto -> 3741
    //   3751: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3754: aload #37
    //   3756: iload #12
    //   3758: invokeinterface getInt : (Ljava/lang/String;I)I
    //   3763: istore #29
    //   3765: iload #23
    //   3767: ifne -> 3791
    //   3770: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3773: ldc_w 'k_b_mn_upcsngs'
    //   3776: iconst_1
    //   3777: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   3782: ifeq -> 3791
    //   3785: iconst_1
    //   3786: istore #22
    //   3788: goto -> 3794
    //   3791: iconst_0
    //   3792: istore #22
    //   3794: iload #23
    //   3796: ifne -> 3813
    //   3799: iload #29
    //   3801: sipush #511
    //   3804: if_icmpne -> 3813
    //   3807: iconst_1
    //   3808: istore #12
    //   3810: goto -> 3816
    //   3813: iconst_0
    //   3814: istore #12
    //   3816: iload #23
    //   3818: ifne -> 3893
    //   3821: iload #12
    //   3823: ifeq -> 3839
    //   3826: iload #22
    //   3828: ifne -> 3839
    //   3831: ldc_w 2131493164
    //   3834: istore #13
    //   3836: goto -> 3844
    //   3839: ldc_w 2131493163
    //   3842: istore #13
    //   3844: iload #13
    //   3846: istore #16
    //   3848: iload #12
    //   3850: ifne -> 3867
    //   3853: iload #13
    //   3855: istore #16
    //   3857: iload #22
    //   3859: ifeq -> 3867
    //   3862: ldc_w 2131493165
    //   3865: istore #16
    //   3867: iload #16
    //   3869: istore #13
    //   3871: iload #12
    //   3873: ifeq -> 3890
    //   3876: iload #16
    //   3878: istore #13
    //   3880: iload #22
    //   3882: ifeq -> 3890
    //   3885: ldc_w 2131493166
    //   3888: istore #13
    //   3890: goto -> 3901
    //   3893: ldc_w 2131493032
    //   3896: istore #13
    //   3898: goto -> 3890
    //   3901: new android/widget/RemoteViews
    //   3904: astore #45
    //   3906: aload #45
    //   3908: aload_0
    //   3909: invokevirtual getPackageName : ()Ljava/lang/String;
    //   3912: iload #13
    //   3914: invokespecial <init> : (Ljava/lang/String;I)V
    //   3917: iload #23
    //   3919: ifne -> 4007
    //   3922: iload #29
    //   3924: invokestatic a : (I)I
    //   3927: istore #16
    //   3929: iload #19
    //   3931: ifeq -> 3940
    //   3934: iconst_4
    //   3935: istore #13
    //   3937: goto -> 3943
    //   3940: iconst_5
    //   3941: istore #13
    //   3943: iload #16
    //   3945: iload #13
    //   3947: if_icmpgt -> 3970
    //   3950: new android/widget/RemoteViews
    //   3953: astore #37
    //   3955: aload #37
    //   3957: aload_0
    //   3958: invokevirtual getPackageName : ()Ljava/lang/String;
    //   3961: ldc_w 2131493036
    //   3964: invokespecial <init> : (Ljava/lang/String;I)V
    //   3967: goto -> 3986
    //   3970: new android/widget/RemoteViews
    //   3973: dup
    //   3974: aload_0
    //   3975: invokevirtual getPackageName : ()Ljava/lang/String;
    //   3978: ldc_w 2131493035
    //   3981: invokespecial <init> : (Ljava/lang/String;I)V
    //   3984: astore #37
    //   3986: aload #45
    //   3988: ldc_w 2131296733
    //   3991: invokevirtual removeAllViews : (I)V
    //   3994: aload #45
    //   3996: ldc_w 2131296733
    //   3999: aload #37
    //   4001: invokevirtual addView : (ILandroid/widget/RemoteViews;)V
    //   4004: goto -> 4011
    //   4007: aload #45
    //   4009: astore #37
    //   4011: iload #17
    //   4013: ifeq -> 4022
    //   4016: iconst_0
    //   4017: istore #13
    //   4019: goto -> 4029
    //   4022: iload #10
    //   4024: istore #13
    //   4026: goto -> 4019
    //   4029: aload #37
    //   4031: ldc_w 2131297942
    //   4034: ldc_w 'setBackgroundColor'
    //   4037: iload #13
    //   4039: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4042: iload #25
    //   4044: ifeq -> 4138
    //   4047: aload #37
    //   4049: ldc_w 2131297890
    //   4052: ldc_w 'setTextColor'
    //   4055: iload #11
    //   4057: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4060: aload #37
    //   4062: ldc_w 2131297692
    //   4065: ldc_w 'setTextColor'
    //   4068: iload #24
    //   4070: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4073: aload #37
    //   4075: ldc_w 2131297685
    //   4078: ldc_w 'setTextColor'
    //   4081: iload #24
    //   4083: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4086: aload #37
    //   4088: ldc_w 2131296804
    //   4091: ldc_w 'setColorFilter'
    //   4094: iload #11
    //   4096: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4099: aload #37
    //   4101: ldc_w 2131296803
    //   4104: ldc_w 'setColorFilter'
    //   4107: iload #11
    //   4109: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4112: aload #37
    //   4114: ldc_w 2131296802
    //   4117: ldc_w 'setColorFilter'
    //   4120: iload #11
    //   4122: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4125: aload #37
    //   4127: ldc_w 2131296798
    //   4130: ldc_w 'setColorFilter'
    //   4133: iload #11
    //   4135: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4138: iload #18
    //   4140: ifeq -> 4190
    //   4143: aload #36
    //   4145: ifnull -> 4155
    //   4148: aload #36
    //   4150: astore #39
    //   4152: goto -> 4168
    //   4155: iconst_2
    //   4156: iconst_2
    //   4157: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   4160: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   4163: astore #39
    //   4165: goto -> 4152
    //   4168: aload #37
    //   4170: ldc_w 2131296913
    //   4173: aload #39
    //   4175: invokevirtual setImageViewBitmap : (ILandroid/graphics/Bitmap;)V
    //   4178: aload #37
    //   4180: ldc_w 2131296913
    //   4183: iconst_0
    //   4184: invokevirtual setViewVisibility : (II)V
    //   4187: goto -> 4200
    //   4190: aload #37
    //   4192: ldc_w 2131296913
    //   4195: bipush #8
    //   4197: invokevirtual setViewVisibility : (II)V
    //   4200: iload #15
    //   4202: ifeq -> 4248
    //   4205: aload #36
    //   4207: ifnull -> 4213
    //   4210: goto -> 4226
    //   4213: iconst_2
    //   4214: iconst_2
    //   4215: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   4218: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   4221: astore #36
    //   4223: goto -> 4210
    //   4226: aload #45
    //   4228: ldc_w 2131296837
    //   4231: aload #36
    //   4233: invokevirtual setImageViewBitmap : (ILandroid/graphics/Bitmap;)V
    //   4236: aload #45
    //   4238: ldc_w 2131296837
    //   4241: iconst_0
    //   4242: invokevirtual setViewVisibility : (II)V
    //   4245: goto -> 4258
    //   4248: aload #45
    //   4250: ldc_w 2131296837
    //   4253: bipush #8
    //   4255: invokevirtual setViewVisibility : (II)V
    //   4258: aload_0
    //   4259: getfield j : Z
    //   4262: ifeq -> 4279
    //   4265: aload #45
    //   4267: ldc_w 2131296803
    //   4270: ldc_w 2131231064
    //   4273: invokevirtual setImageViewResource : (II)V
    //   4276: goto -> 4293
    //   4279: aload #37
    //   4281: ldc_w 2131296803
    //   4284: ldc_w 2131231062
    //   4287: invokevirtual setImageViewResource : (II)V
    //   4290: goto -> 4276
    //   4293: iconst_1
    //   4294: iload #29
    //   4296: invokestatic b : (II)Z
    //   4299: ifeq -> 4365
    //   4302: iload #25
    //   4304: ifeq -> 4323
    //   4307: aload #37
    //   4309: ldc_w 2131296799
    //   4312: ldc_w 'setColorFilter'
    //   4315: iload #11
    //   4317: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4320: goto -> 4326
    //   4323: goto -> 4320
    //   4326: aload #37
    //   4328: ldc_w 2131296799
    //   4331: iconst_0
    //   4332: invokevirtual setViewVisibility : (II)V
    //   4335: aload #37
    //   4337: ldc_w 2131296799
    //   4340: iload #26
    //   4342: invokevirtual setImageViewResource : (II)V
    //   4345: aload #37
    //   4347: ldc_w 2131296799
    //   4350: aload_0
    //   4351: iconst_0
    //   4352: aload #53
    //   4354: iload #30
    //   4356: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   4359: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   4362: goto -> 4378
    //   4365: aload #37
    //   4367: ldc_w 2131296799
    //   4370: bipush #8
    //   4372: invokevirtual setViewVisibility : (II)V
    //   4375: goto -> 4362
    //   4378: iconst_2
    //   4379: iload #29
    //   4381: invokestatic b : (II)Z
    //   4384: ifeq -> 4453
    //   4387: iload #25
    //   4389: ifeq -> 4408
    //   4392: aload #37
    //   4394: ldc_w 2131296807
    //   4397: ldc_w 'setColorFilter'
    //   4400: iload #11
    //   4402: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4405: goto -> 4411
    //   4408: goto -> 4405
    //   4411: aload #37
    //   4413: ldc_w 2131296807
    //   4416: iconst_0
    //   4417: invokevirtual setViewVisibility : (II)V
    //   4420: aload #37
    //   4422: ldc_w 2131296807
    //   4425: aload #54
    //   4427: getfield a : I
    //   4430: invokevirtual setImageViewResource : (II)V
    //   4433: aload #37
    //   4435: ldc_w 2131296807
    //   4438: aload_0
    //   4439: iconst_0
    //   4440: aload #56
    //   4442: iload #30
    //   4444: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   4447: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   4450: goto -> 4463
    //   4453: aload #37
    //   4455: ldc_w 2131296807
    //   4458: bipush #8
    //   4460: invokevirtual setViewVisibility : (II)V
    //   4463: invokestatic z : ()Lxn1;
    //   4466: astore #39
    //   4468: aload #39
    //   4470: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   4473: invokevirtual e : (Z)I
    //   4476: istore #15
    //   4478: invokestatic d : ()Landroid/content/Context;
    //   4481: astore #36
    //   4483: new android/content/Intent
    //   4486: astore #53
    //   4488: aload #53
    //   4490: invokestatic d : ()Landroid/content/Context;
    //   4493: ldc_w in/krosbits/musicolet/MusicActivity
    //   4496: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   4499: aload #36
    //   4501: iconst_0
    //   4502: aload #53
    //   4504: ldc_w 'jump_queue'
    //   4507: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   4510: ldc_w 335544320
    //   4513: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   4516: ldc_w 'jump_key'
    //   4519: ldc_w 'jump_queue'
    //   4522: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   4525: ldc_w 'smooth'
    //   4528: iconst_0
    //   4529: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   4532: ldc_w 167772160
    //   4535: invokestatic r : ()Landroid/os/Bundle;
    //   4538: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //   4541: astore #36
    //   4543: iload #12
    //   4545: ifeq -> 5045
    //   4548: iload #25
    //   4550: ifeq -> 4670
    //   4553: aload #37
    //   4555: ldc_w 2131296797
    //   4558: ldc_w 'setColorFilter'
    //   4561: iload #11
    //   4563: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4566: aload #37
    //   4568: ldc_w 2131296806
    //   4571: ldc_w 'setColorFilter'
    //   4574: iload #11
    //   4576: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4579: aload #37
    //   4581: ldc_w 2131296805
    //   4584: ldc_w 'setColorFilter'
    //   4587: iload #11
    //   4589: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4592: aload #37
    //   4594: ldc_w 2131296801
    //   4597: ldc_w 'setColorFilter'
    //   4600: iload #11
    //   4602: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4605: aload #37
    //   4607: ldc_w 2131296809
    //   4610: ldc_w 'setColorFilter'
    //   4613: iload #11
    //   4615: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4618: aload #37
    //   4620: ldc_w 2131297720
    //   4623: ldc_w 'setTextColor'
    //   4626: iload #24
    //   4628: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4631: aload #37
    //   4633: ldc_w 2131297718
    //   4636: ldc_w 'setTextColor'
    //   4639: iload #24
    //   4641: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4644: aload #37
    //   4646: ldc_w 2131297926
    //   4649: ldc_w 'setColorFilter'
    //   4652: iload #11
    //   4654: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4657: aload #37
    //   4659: ldc_w 2131297927
    //   4662: ldc_w 'setColorFilter'
    //   4665: iload #24
    //   4667: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4670: aload #37
    //   4672: ldc_w 2131297927
    //   4675: ldc_w 'setImageAlpha'
    //   4678: bipush #76
    //   4680: invokevirtual setInt : (ILjava/lang/String;I)V
    //   4683: aload #37
    //   4685: ldc_w 2131297384
    //   4688: iconst_0
    //   4689: invokevirtual setViewVisibility : (II)V
    //   4692: aload #54
    //   4694: getfield b : I
    //   4697: istore #13
    //   4699: iload #13
    //   4701: iconst_m1
    //   4702: if_icmpeq -> 4735
    //   4705: aload #37
    //   4707: ldc_w 2131296805
    //   4710: iload #13
    //   4712: invokevirtual setImageViewResource : (II)V
    //   4715: aload #37
    //   4717: ldc_w 2131296805
    //   4720: aload_0
    //   4721: iconst_0
    //   4722: aload #55
    //   4724: iload #30
    //   4726: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   4729: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   4732: goto -> 4745
    //   4735: aload #37
    //   4737: ldc_w 2131296805
    //   4740: bipush #8
    //   4742: invokevirtual setViewVisibility : (II)V
    //   4745: aload #39
    //   4747: getfield b : Ljava/util/ArrayList;
    //   4750: invokevirtual size : ()I
    //   4753: istore #16
    //   4755: new java/lang/StringBuilder
    //   4758: astore #39
    //   4760: aload #39
    //   4762: ldc_w '('
    //   4765: invokespecial <init> : (Ljava/lang/String;)V
    //   4768: iload #16
    //   4770: ifne -> 4779
    //   4773: iconst_0
    //   4774: istore #13
    //   4776: goto -> 4785
    //   4779: iload #15
    //   4781: iconst_1
    //   4782: iadd
    //   4783: istore #13
    //   4785: aload #39
    //   4787: iload #13
    //   4789: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4792: pop
    //   4793: aload #39
    //   4795: ldc_w '/'
    //   4798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4801: pop
    //   4802: aload #39
    //   4804: iload #16
    //   4806: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4809: pop
    //   4810: aload #39
    //   4812: ldc_w ')'
    //   4815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4818: pop
    //   4819: aload #37
    //   4821: ldc_w 2131297720
    //   4824: aload #39
    //   4826: invokevirtual toString : ()Ljava/lang/String;
    //   4829: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   4832: invokestatic o : ()Landroid/content/SharedPreferences;
    //   4835: ldc_w 'RCPOS'
    //   4838: iconst_0
    //   4839: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   4844: istore #32
    //   4846: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   4849: invokevirtual A : ()I
    //   4852: istore #13
    //   4854: aload #42
    //   4856: getfield c : Lqn1;
    //   4859: getfield g : I
    //   4862: istore #16
    //   4864: new java/lang/StringBuilder
    //   4867: astore #39
    //   4869: aload #39
    //   4871: invokespecial <init> : ()V
    //   4874: aload #39
    //   4876: iload #13
    //   4878: i2l
    //   4879: iload #32
    //   4881: iload #16
    //   4883: invokestatic B : (JZI)Ljava/lang/String;
    //   4886: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4889: pop
    //   4890: aload #39
    //   4892: ldc_w '/'
    //   4895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4898: pop
    //   4899: aload #39
    //   4901: iload #16
    //   4903: i2l
    //   4904: iconst_0
    //   4905: iconst_0
    //   4906: invokestatic B : (JZI)Ljava/lang/String;
    //   4909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4912: pop
    //   4913: aload #37
    //   4915: ldc_w 2131297718
    //   4918: aload #39
    //   4920: invokevirtual toString : ()Ljava/lang/String;
    //   4923: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   4926: iload #13
    //   4928: ifne -> 4944
    //   4931: aload #37
    //   4933: ldc_w 2131297002
    //   4936: bipush #8
    //   4938: invokevirtual setViewVisibility : (II)V
    //   4941: goto -> 4974
    //   4944: aload #37
    //   4946: ldc_w 2131297002
    //   4949: ldc_w 'setWeightSum'
    //   4952: iload #16
    //   4954: i2f
    //   4955: iload #13
    //   4957: i2f
    //   4958: fdiv
    //   4959: invokevirtual setFloat : (ILjava/lang/String;F)V
    //   4962: aload #37
    //   4964: ldc_w 2131297002
    //   4967: iconst_0
    //   4968: invokevirtual setViewVisibility : (II)V
    //   4971: goto -> 4941
    //   4974: aload #37
    //   4976: ldc_w 2131296806
    //   4979: aload #36
    //   4981: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   4984: aload #37
    //   4986: ldc_w 2131297720
    //   4989: aload #36
    //   4991: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   4994: aload #37
    //   4996: ldc_w 2131296801
    //   4999: aload_0
    //   5000: iconst_0
    //   5001: aload #49
    //   5003: iload #30
    //   5005: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5008: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5011: aload #37
    //   5013: ldc_w 2131296809
    //   5016: aload_0
    //   5017: iconst_0
    //   5018: aload #52
    //   5020: iload #30
    //   5022: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5025: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5028: aload #37
    //   5030: ldc_w 2131296797
    //   5033: aload_0
    //   5034: aload #51
    //   5036: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   5039: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5042: goto -> 5055
    //   5045: aload #37
    //   5047: ldc_w 2131297384
    //   5050: bipush #8
    //   5052: invokevirtual setViewVisibility : (II)V
    //   5055: iload #11
    //   5057: istore #13
    //   5059: new java/lang/StringBuilder
    //   5062: astore #39
    //   5064: aload #39
    //   5066: ldc_w '--- '
    //   5069: invokespecial <init> : (Ljava/lang/String;)V
    //   5072: aload #39
    //   5074: aload_0
    //   5075: ldc_w 2131886498
    //   5078: invokevirtual getString : (I)Ljava/lang/String;
    //   5081: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5084: pop
    //   5085: aload #39
    //   5087: ldc_w ' ---'
    //   5090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5093: pop
    //   5094: aload #39
    //   5096: invokevirtual toString : ()Ljava/lang/String;
    //   5099: astore #39
    //   5101: iload #22
    //   5103: ifeq -> 5552
    //   5106: aload #37
    //   5108: ldc_w 2131296732
    //   5111: iconst_0
    //   5112: invokevirtual setViewVisibility : (II)V
    //   5115: iconst_1
    //   5116: anewarray java/lang/String
    //   5119: astore #54
    //   5121: aload_0
    //   5122: iconst_1
    //   5123: iconst_0
    //   5124: iconst_0
    //   5125: aload #54
    //   5127: invokevirtual V : (IZZ[Ljava/lang/String;)Lkm0;
    //   5130: astore #42
    //   5132: aload #42
    //   5134: ifnull -> 5329
    //   5137: new java/lang/StringBuilder
    //   5140: astore #53
    //   5142: aload #53
    //   5144: invokespecial <init> : ()V
    //   5147: aload #53
    //   5149: aload #42
    //   5151: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   5154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5157: pop
    //   5158: aload #53
    //   5160: ldc_w ' - '
    //   5163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5166: pop
    //   5167: aload #53
    //   5169: aload #42
    //   5171: getfield c : Lqn1;
    //   5174: getfield e : Ljava/lang/String;
    //   5177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5180: pop
    //   5181: aload #53
    //   5183: ldc_w ' - '
    //   5186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5189: pop
    //   5190: aload #53
    //   5192: aload #42
    //   5194: getfield c : Lqn1;
    //   5197: getfield c : Ljava/lang/String;
    //   5200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5203: pop
    //   5204: aload #37
    //   5206: ldc_w 2131297898
    //   5209: aload #53
    //   5211: invokevirtual toString : ()Ljava/lang/String;
    //   5214: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   5217: aload_0
    //   5218: iconst_2
    //   5219: iconst_0
    //   5220: iconst_0
    //   5221: aload #54
    //   5223: invokevirtual V : (IZZ[Ljava/lang/String;)Lkm0;
    //   5226: astore #42
    //   5228: aload #42
    //   5230: ifnull -> 5316
    //   5233: new java/lang/StringBuilder
    //   5236: astore #39
    //   5238: aload #39
    //   5240: invokespecial <init> : ()V
    //   5243: aload #39
    //   5245: aload #42
    //   5247: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   5250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5253: pop
    //   5254: aload #39
    //   5256: ldc_w ' - '
    //   5259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5262: pop
    //   5263: aload #39
    //   5265: aload #42
    //   5267: getfield c : Lqn1;
    //   5270: getfield e : Ljava/lang/String;
    //   5273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5276: pop
    //   5277: aload #39
    //   5279: ldc_w ' - '
    //   5282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5285: pop
    //   5286: aload #39
    //   5288: aload #42
    //   5290: getfield c : Lqn1;
    //   5293: getfield c : Ljava/lang/String;
    //   5296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5299: pop
    //   5300: aload #37
    //   5302: ldc_w 2131297899
    //   5305: aload #39
    //   5307: invokevirtual toString : ()Ljava/lang/String;
    //   5310: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   5313: goto -> 5350
    //   5316: aload #37
    //   5318: ldc_w 2131297899
    //   5321: aload #39
    //   5323: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   5326: goto -> 5350
    //   5329: aload #37
    //   5331: ldc_w 2131297898
    //   5334: aload #39
    //   5336: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   5339: aload #37
    //   5341: ldc_w 2131297899
    //   5344: ldc_w '----'
    //   5347: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   5350: aload #37
    //   5352: ldc_w 2131296902
    //   5355: ldc_w 'setImageAlpha'
    //   5358: bipush #38
    //   5360: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5363: iload #25
    //   5365: ifeq -> 5423
    //   5368: aload #37
    //   5370: ldc_w 2131296902
    //   5373: ldc_w 'setColorFilter'
    //   5376: iload #24
    //   5378: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5381: aload #37
    //   5383: ldc_w 2131297711
    //   5386: ldc_w 'setTextColor'
    //   5389: iload #13
    //   5391: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5394: aload #37
    //   5396: ldc_w 2131297898
    //   5399: ldc_w 'setTextColor'
    //   5402: iload #24
    //   5404: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5407: aload #37
    //   5409: ldc_w 2131297899
    //   5412: ldc_w 'setTextColor'
    //   5415: iload #24
    //   5417: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5420: goto -> 5423
    //   5423: aload #37
    //   5425: ldc_w 2131297711
    //   5428: aload #36
    //   5430: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5433: invokestatic d : ()Landroid/content/Context;
    //   5436: astore #39
    //   5438: new android/content/Intent
    //   5441: astore #36
    //   5443: aload #36
    //   5445: invokestatic d : ()Landroid/content/Context;
    //   5448: ldc in/krosbits/musicolet/MusicService
    //   5450: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   5453: aload #37
    //   5455: ldc_w 2131297898
    //   5458: aload #39
    //   5460: iconst_1
    //   5461: aload #36
    //   5463: ldc_w 'ACTION_WQJTS'
    //   5466: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   5469: ldc_w 'E_WQSI'
    //   5472: iload #15
    //   5474: iconst_1
    //   5475: iadd
    //   5476: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   5479: iload #30
    //   5481: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5484: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5487: invokestatic d : ()Landroid/content/Context;
    //   5490: astore #36
    //   5492: new android/content/Intent
    //   5495: astore #39
    //   5497: aload #39
    //   5499: invokestatic d : ()Landroid/content/Context;
    //   5502: ldc in/krosbits/musicolet/MusicService
    //   5504: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   5507: aload #37
    //   5509: ldc_w 2131297899
    //   5512: aload #36
    //   5514: iconst_2
    //   5515: aload #39
    //   5517: ldc_w 'ACTION_WQJTS'
    //   5520: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   5523: ldc_w 'E_WQSI'
    //   5526: iload #15
    //   5528: iconst_2
    //   5529: iadd
    //   5530: invokevirtual putExtra : (Ljava/lang/String;I)Landroid/content/Intent;
    //   5533: iload #30
    //   5535: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5538: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5541: iload #11
    //   5543: istore #15
    //   5545: aload #38
    //   5547: astore #36
    //   5549: goto -> 5565
    //   5552: aload #45
    //   5554: ldc_w 2131296732
    //   5557: bipush #8
    //   5559: invokevirtual setViewVisibility : (II)V
    //   5562: goto -> 5541
    //   5565: sipush #128
    //   5568: iload #29
    //   5570: invokestatic b : (II)Z
    //   5573: ifeq -> 5639
    //   5576: iload #25
    //   5578: ifeq -> 5597
    //   5581: aload #37
    //   5583: ldc_w 2131296810
    //   5586: ldc_w 'setColorFilter'
    //   5589: iload #15
    //   5591: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5594: goto -> 5600
    //   5597: goto -> 5594
    //   5600: aload #37
    //   5602: ldc_w 2131296810
    //   5605: iconst_0
    //   5606: invokevirtual setViewVisibility : (II)V
    //   5609: aload #37
    //   5611: ldc_w 2131296810
    //   5614: iload #27
    //   5616: invokevirtual setImageViewResource : (II)V
    //   5619: aload #37
    //   5621: ldc_w 2131296810
    //   5624: aload_0
    //   5625: iconst_0
    //   5626: aload #43
    //   5628: iload #30
    //   5630: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5633: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5636: goto -> 5649
    //   5639: aload #37
    //   5641: ldc_w 2131296810
    //   5644: bipush #8
    //   5646: invokevirtual setViewVisibility : (II)V
    //   5649: iload #12
    //   5651: ifne -> 5717
    //   5654: bipush #32
    //   5656: iload #29
    //   5658: invokestatic b : (II)Z
    //   5661: ifeq -> 5717
    //   5664: iload #25
    //   5666: ifeq -> 5685
    //   5669: aload #37
    //   5671: ldc_w 2131296800
    //   5674: ldc_w 'setColorFilter'
    //   5677: iload #15
    //   5679: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5682: goto -> 5688
    //   5685: goto -> 5682
    //   5688: aload #37
    //   5690: ldc_w 2131296800
    //   5693: iconst_0
    //   5694: invokevirtual setViewVisibility : (II)V
    //   5697: aload #37
    //   5699: ldc_w 2131296800
    //   5702: aload_0
    //   5703: iconst_0
    //   5704: aload #49
    //   5706: iload #30
    //   5708: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5711: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5714: goto -> 5727
    //   5717: aload #37
    //   5719: ldc_w 2131296800
    //   5722: bipush #8
    //   5724: invokevirtual setViewVisibility : (II)V
    //   5727: iload #12
    //   5729: ifne -> 5798
    //   5732: bipush #8
    //   5734: iload #29
    //   5736: invokestatic b : (II)Z
    //   5739: ifeq -> 5795
    //   5742: iload #25
    //   5744: ifeq -> 5763
    //   5747: aload #37
    //   5749: ldc_w 2131296808
    //   5752: ldc_w 'setColorFilter'
    //   5755: iload #15
    //   5757: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5760: goto -> 5766
    //   5763: goto -> 5760
    //   5766: aload #37
    //   5768: ldc_w 2131296808
    //   5771: iconst_0
    //   5772: invokevirtual setViewVisibility : (II)V
    //   5775: aload #37
    //   5777: ldc_w 2131296808
    //   5780: aload_0
    //   5781: iconst_0
    //   5782: aload #52
    //   5784: iload #30
    //   5786: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5789: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5792: goto -> 5811
    //   5795: goto -> 5801
    //   5798: goto -> 5795
    //   5801: aload #37
    //   5803: ldc_w 2131296808
    //   5806: bipush #8
    //   5808: invokevirtual setViewVisibility : (II)V
    //   5811: iload #12
    //   5813: ifne -> 5833
    //   5816: sipush #512
    //   5819: iload #29
    //   5821: invokestatic b : (II)Z
    //   5824: ifeq -> 5833
    //   5827: iconst_1
    //   5828: istore #13
    //   5830: goto -> 5836
    //   5833: iconst_0
    //   5834: istore #13
    //   5836: iload #13
    //   5838: ifeq -> 5891
    //   5841: iload #25
    //   5843: ifeq -> 5862
    //   5846: aload #37
    //   5848: ldc_w 2131296796
    //   5851: ldc_w 'setColorFilter'
    //   5854: iload #15
    //   5856: invokevirtual setInt : (ILjava/lang/String;I)V
    //   5859: goto -> 5865
    //   5862: goto -> 5859
    //   5865: aload #37
    //   5867: ldc_w 2131296796
    //   5870: iconst_0
    //   5871: invokevirtual setViewVisibility : (II)V
    //   5874: aload #37
    //   5876: ldc_w 2131296796
    //   5879: aload_0
    //   5880: aload #51
    //   5882: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   5885: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5888: goto -> 5904
    //   5891: aload #37
    //   5893: ldc_w 2131296796
    //   5896: bipush #8
    //   5898: invokevirtual setViewVisibility : (II)V
    //   5901: goto -> 5888
    //   5904: aload #37
    //   5906: ldc_w 2131296804
    //   5909: aload_0
    //   5910: iconst_0
    //   5911: aload #48
    //   5913: iload #30
    //   5915: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5918: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5921: aload #37
    //   5923: ldc_w 2131296803
    //   5926: aload_0
    //   5927: iconst_0
    //   5928: aload #50
    //   5930: iload #30
    //   5932: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5935: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5938: aload #37
    //   5940: ldc_w 2131296802
    //   5943: aload_0
    //   5944: iconst_0
    //   5945: aload #47
    //   5947: iload #30
    //   5949: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   5952: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   5955: iload #19
    //   5957: ifeq -> 6050
    //   5960: aload #37
    //   5962: ldc_w 2131296798
    //   5965: iconst_0
    //   5966: invokevirtual setViewVisibility : (II)V
    //   5969: iload #31
    //   5971: ifeq -> 6019
    //   5974: iload #13
    //   5976: ifne -> 6019
    //   5979: iload #12
    //   5981: ifne -> 6019
    //   5984: aload_0
    //   5985: getfield j : Z
    //   5988: ifne -> 6019
    //   5991: aload #37
    //   5993: ldc_w 2131296798
    //   5996: ldc_w 2131231371
    //   5999: invokevirtual setImageViewResource : (II)V
    //   6002: aload #37
    //   6004: ldc_w 2131296798
    //   6007: aload_0
    //   6008: aload #51
    //   6010: invokestatic G : (Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    //   6013: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   6016: goto -> 6060
    //   6019: aload #37
    //   6021: ldc_w 2131296798
    //   6024: ldc_w 2131231115
    //   6027: invokevirtual setImageViewResource : (II)V
    //   6030: aload #37
    //   6032: ldc_w 2131296798
    //   6035: aload_0
    //   6036: iconst_0
    //   6037: aload #44
    //   6039: iload #30
    //   6041: invokestatic M : (Landroid/content/Context;ILandroid/content/Intent;Z)Landroid/app/PendingIntent;
    //   6044: invokevirtual setOnClickPendingIntent : (ILandroid/app/PendingIntent;)V
    //   6047: goto -> 6060
    //   6050: aload #37
    //   6052: ldc_w 2131296798
    //   6055: bipush #8
    //   6057: invokevirtual setViewVisibility : (II)V
    //   6060: aload #37
    //   6062: ldc_w 2131297692
    //   6065: getstatic in/krosbits/musicolet/MusicService.Z0 : Ljava/lang/String;
    //   6068: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   6071: aload #37
    //   6073: ldc_w 2131297890
    //   6076: getstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   6079: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   6082: aload #37
    //   6084: ldc_w 2131297685
    //   6087: getstatic in/krosbits/musicolet/MusicService.Y0 : Ljava/lang/String;
    //   6090: invokevirtual setTextViewText : (ILjava/lang/CharSequence;)V
    //   6093: iload #23
    //   6095: iconst_1
    //   6096: if_icmpne -> 6115
    //   6099: aload #37
    //   6101: ldc_w 2131297147
    //   6104: ldc_w 'setColorFilter'
    //   6107: iload #10
    //   6109: invokevirtual setInt : (ILjava/lang/String;I)V
    //   6112: goto -> 6115
    //   6115: iload #10
    //   6117: istore #13
    //   6119: iload #21
    //   6121: ifeq -> 6134
    //   6124: aload #40
    //   6126: aload #45
    //   6128: invokevirtual f : (Landroid/widget/RemoteViews;)V
    //   6131: goto -> 6155
    //   6134: aload #40
    //   6136: aload #45
    //   6138: invokevirtual j : (Landroid/widget/RemoteViews;)V
    //   6141: goto -> 6155
    //   6144: iload #10
    //   6146: istore #12
    //   6148: iload #11
    //   6150: istore #12
    //   6152: iconst_0
    //   6153: istore #12
    //   6155: aload #38
    //   6157: astore #36
    //   6159: aload #40
    //   6161: astore #36
    //   6163: aload #41
    //   6165: ifnull -> 6201
    //   6168: aload #36
    //   6170: getfield a : Landroid/app/Notification$Builder;
    //   6173: astore #37
    //   6175: aload #37
    //   6177: ifnull -> 6191
    //   6180: aload #37
    //   6182: aload #41
    //   6184: invokevirtual setCustomContentView : (Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
    //   6187: pop
    //   6188: goto -> 6201
    //   6191: aload #36
    //   6193: getfield b : Ls21;
    //   6196: aload #41
    //   6198: putfield v : Landroid/widget/RemoteViews;
    //   6201: iload #17
    //   6203: ifeq -> 6251
    //   6206: aload #36
    //   6208: getfield a : Landroid/app/Notification$Builder;
    //   6211: astore #37
    //   6213: aload #37
    //   6215: ifnull -> 6229
    //   6218: aload #37
    //   6220: iload #10
    //   6222: invokevirtual setColor : (I)Landroid/app/Notification$Builder;
    //   6225: pop
    //   6226: goto -> 6242
    //   6229: aload #36
    //   6231: getfield b : Ls21;
    //   6234: iload #10
    //   6236: putfield t : I
    //   6239: goto -> 6226
    //   6242: aload #36
    //   6244: iconst_1
    //   6245: invokevirtual e : (Z)V
    //   6248: goto -> 6367
    //   6251: iconst_3
    //   6252: newarray float
    //   6254: astore #41
    //   6256: iconst_3
    //   6257: newarray float
    //   6259: astore #39
    //   6261: getstatic jn.a : Ljava/lang/ThreadLocal;
    //   6264: astore #37
    //   6266: iload #11
    //   6268: invokestatic red : (I)I
    //   6271: iload #11
    //   6273: invokestatic green : (I)I
    //   6276: iload #11
    //   6278: invokestatic blue : (I)I
    //   6281: aload #41
    //   6283: invokestatic a : (III[F)V
    //   6286: iload #10
    //   6288: invokestatic red : (I)I
    //   6291: iload #10
    //   6293: invokestatic green : (I)I
    //   6296: iload #10
    //   6298: invokestatic blue : (I)I
    //   6301: aload #39
    //   6303: invokestatic a : (III[F)V
    //   6306: aload #39
    //   6308: iconst_1
    //   6309: faload
    //   6310: aload #41
    //   6312: iconst_1
    //   6313: faload
    //   6314: fcmpl
    //   6315: ifle -> 6321
    //   6318: goto -> 6325
    //   6321: iload #11
    //   6323: istore #10
    //   6325: aload #36
    //   6327: getfield a : Landroid/app/Notification$Builder;
    //   6330: astore #37
    //   6332: aload #37
    //   6334: ifnull -> 6348
    //   6337: aload #37
    //   6339: iload #10
    //   6341: invokevirtual setColor : (I)Landroid/app/Notification$Builder;
    //   6344: pop
    //   6345: goto -> 6361
    //   6348: aload #36
    //   6350: getfield b : Ls21;
    //   6353: iload #10
    //   6355: putfield t : I
    //   6358: goto -> 6345
    //   6361: aload #36
    //   6363: iconst_0
    //   6364: invokevirtual e : (Z)V
    //   6367: aload_0
    //   6368: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   6371: invokestatic a : (Landroid/content/Context;)Lp01;
    //   6374: invokevirtual f : ()Landroid/media/session/MediaSession;
    //   6377: astore #37
    //   6379: aload #37
    //   6381: ifnull -> 6414
    //   6384: new android/os/Bundle
    //   6387: astore #39
    //   6389: aload #39
    //   6391: invokespecial <init> : ()V
    //   6394: aload #39
    //   6396: ldc_w 'android.mediaSession'
    //   6399: aload #37
    //   6401: invokevirtual getSessionToken : ()Landroid/media/session/MediaSession$Token;
    //   6404: invokevirtual putParcelable : (Ljava/lang/String;Landroid/os/Parcelable;)V
    //   6407: aload #36
    //   6409: aload #39
    //   6411: invokevirtual b : (Landroid/os/Bundle;)V
    //   6414: iload #12
    //   6416: istore #11
    //   6418: invokestatic c0 : ()Z
    //   6421: ifeq -> 6445
    //   6424: new android/app/Notification$DecoratedCustomViewStyle
    //   6427: astore #37
    //   6429: aload #37
    //   6431: invokespecial <init> : ()V
    //   6434: aload #36
    //   6436: aload #37
    //   6438: invokevirtual q : (Landroid/app/Notification$DecoratedCustomViewStyle;)V
    //   6441: iload #12
    //   6443: istore #11
    //   6445: aload #40
    //   6447: getstatic in/krosbits/musicolet/MusicService.X0 : Ljava/lang/String;
    //   6450: invokevirtual i : (Ljava/lang/CharSequence;)V
    //   6453: aload #40
    //   6455: getstatic in/krosbits/musicolet/MusicService.Z0 : Ljava/lang/String;
    //   6458: invokevirtual h : (Ljava/lang/CharSequence;)V
    //   6461: aload #40
    //   6463: getstatic in/krosbits/musicolet/MusicService.Y0 : Ljava/lang/String;
    //   6466: invokevirtual r : (Ljava/lang/String;)V
    //   6469: aload #40
    //   6471: getfield a : Landroid/app/Notification$Builder;
    //   6474: astore #36
    //   6476: aload #36
    //   6478: ifnull -> 6491
    //   6481: aload #36
    //   6483: iconst_0
    //   6484: invokevirtual setShowWhen : (Z)Landroid/app/Notification$Builder;
    //   6487: pop
    //   6488: goto -> 6500
    //   6491: aload #40
    //   6493: getfield b : Ls21;
    //   6496: iconst_0
    //   6497: putfield k : Z
    //   6500: aload #40
    //   6502: ldc_w 2131231578
    //   6505: invokevirtual o : (I)V
    //   6508: aload #40
    //   6510: iload #30
    //   6512: invokevirtual l : (Z)V
    //   6515: aload #40
    //   6517: getfield a : Landroid/app/Notification$Builder;
    //   6520: ifnull -> 6526
    //   6523: goto -> 6535
    //   6526: aload #40
    //   6528: getfield b : Ls21;
    //   6531: iconst_2
    //   6532: putfield j : I
    //   6535: aload #40
    //   6537: invokevirtual m : ()V
    //   6540: new android/content/Intent
    //   6543: astore #36
    //   6545: aload #36
    //   6547: aload_0
    //   6548: ldc_w in/krosbits/musicolet/MusicActivity
    //   6551: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   6554: aload #40
    //   6556: aload_0
    //   6557: iconst_0
    //   6558: aload #36
    //   6560: ldc_w 'jump_key'
    //   6563: ldc_w 'jump_player'
    //   6566: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   6569: ldc_w 'smooth'
    //   6572: iconst_0
    //   6573: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   6576: ldc_w 67108864
    //   6579: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   6582: ldc_w 167772160
    //   6585: invokestatic r : ()Landroid/os/Bundle;
    //   6588: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //   6591: invokevirtual g : (Landroid/app/PendingIntent;)V
    //   6594: aload #40
    //   6596: invokevirtual s : ()V
    //   6599: aload #40
    //   6601: getfield a : Landroid/app/Notification$Builder;
    //   6604: astore #36
    //   6606: aload #36
    //   6608: ifnull -> 6623
    //   6611: aload #36
    //   6613: ldc_w 'transport'
    //   6616: invokevirtual setCategory : (Ljava/lang/String;)Landroid/app/Notification$Builder;
    //   6619: pop
    //   6620: goto -> 6637
    //   6623: aload #40
    //   6625: getfield b : Ls21;
    //   6628: ldc_w 'transport'
    //   6631: putfield r : Ljava/lang/String;
    //   6634: goto -> 6620
    //   6637: aload #40
    //   6639: aload_0
    //   6640: iconst_0
    //   6641: aload #46
    //   6643: ldc_w 167772160
    //   6646: invokestatic getService : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   6649: invokevirtual k : (Landroid/app/PendingIntent;)V
    //   6652: aload #40
    //   6654: invokevirtual c : ()Landroid/app/Notification;
    //   6657: astore #36
    //   6659: aload #38
    //   6661: invokestatic B : (Lkm0;)Z
    //   6664: ifne -> 6923
    //   6667: aload_0
    //   6668: getfield e0 : Lb71;
    //   6671: astore #37
    //   6673: aload #37
    //   6675: ifnull -> 6762
    //   6678: aload #38
    //   6680: aload #37
    //   6682: getfield d : Lkm0;
    //   6685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6688: ifeq -> 6721
    //   6691: aload_0
    //   6692: getfield e0 : Lb71;
    //   6695: astore #37
    //   6697: aload #37
    //   6699: getfield b : [Z
    //   6702: iconst_0
    //   6703: baload
    //   6704: ifne -> 6721
    //   6707: aload #37
    //   6709: getfield e : Z
    //   6712: ifne -> 6721
    //   6715: iconst_1
    //   6716: istore #10
    //   6718: goto -> 6724
    //   6721: iconst_0
    //   6722: istore #10
    //   6724: iload #10
    //   6726: istore #12
    //   6728: iload #10
    //   6730: ifne -> 6765
    //   6733: aload_0
    //   6734: getfield e0 : Lb71;
    //   6737: astore #37
    //   6739: aload #37
    //   6741: getfield b : [Z
    //   6744: iconst_0
    //   6745: iconst_1
    //   6746: bastore
    //   6747: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   6750: aload #37
    //   6752: invokevirtual b : (Lkt1;)V
    //   6755: iload #10
    //   6757: istore #12
    //   6759: goto -> 6765
    //   6762: iconst_0
    //   6763: istore #12
    //   6765: invokestatic c : ()V
    //   6768: iload #12
    //   6770: ifne -> 6923
    //   6773: iload #18
    //   6775: ifne -> 6821
    //   6778: iload #14
    //   6780: ifeq -> 6786
    //   6783: goto -> 6821
    //   6786: aload_0
    //   6787: getfield e0 : Lb71;
    //   6790: astore #37
    //   6792: aload #37
    //   6794: ifnull -> 6813
    //   6797: aload #37
    //   6799: getfield b : [Z
    //   6802: iconst_0
    //   6803: iconst_1
    //   6804: bastore
    //   6805: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   6808: aload #37
    //   6810: invokevirtual b : (Lkt1;)V
    //   6813: aload_0
    //   6814: aconst_null
    //   6815: putfield e0 : Lb71;
    //   6818: goto -> 6923
    //   6821: new b71
    //   6824: astore #36
    //   6826: aload #36
    //   6828: aload_0
    //   6829: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   6832: aload #38
    //   6834: invokespecial <init> : (Landroid/content/Context;Lkm0;)V
    //   6837: aload_0
    //   6838: aload #36
    //   6840: putfield e0 : Lb71;
    //   6843: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   6846: astore #36
    //   6848: iload #20
    //   6850: ifeq -> 6861
    //   6853: ldc_w 2131230843
    //   6856: istore #10
    //   6858: goto -> 6866
    //   6861: ldc_w 2131230842
    //   6864: istore #10
    //   6866: aload #36
    //   6868: aload #38
    //   6870: iload #10
    //   6872: invokestatic m : (Lkm0;I)Landroid/net/Uri;
    //   6875: invokevirtual f : (Landroid/net/Uri;)Lag1;
    //   6878: astore #36
    //   6880: aload #36
    //   6882: iconst_1
    //   6883: newarray int
    //   6885: dup
    //   6886: iconst_0
    //   6887: iconst_2
    //   6888: iastore
    //   6889: invokevirtual g : ([I)V
    //   6892: aload #36
    //   6894: iload #28
    //   6896: iload #28
    //   6898: invokevirtual j : (II)V
    //   6901: aload #36
    //   6903: invokevirtual i : ()V
    //   6906: aload #36
    //   6908: invokevirtual h : ()V
    //   6911: aload #36
    //   6913: aload_0
    //   6914: getfield e0 : Lb71;
    //   6917: invokevirtual e : (Lkt1;)V
    //   6920: goto -> 7062
    //   6923: iload #30
    //   6925: ifeq -> 7037
    //   6928: aload_0
    //   6929: aload #36
    //   6931: invokevirtual H0 : (Landroid/app/Notification;)V
    //   6934: new z21
    //   6937: astore #37
    //   6939: aload #37
    //   6941: aload_0
    //   6942: invokespecial <init> : (Landroid/content/Context;)V
    //   6945: aload #37
    //   6947: bipush #100
    //   6949: aload #36
    //   6951: invokevirtual c : (ILandroid/app/Notification;)V
    //   6954: aload_0
    //   6955: getfield Z : J
    //   6958: lstore #34
    //   6960: lload #34
    //   6962: lconst_0
    //   6963: lcmp
    //   6964: ifeq -> 7062
    //   6967: aload_0
    //   6968: getfield j : Z
    //   6971: ifeq -> 7029
    //   6974: invokestatic currentTimeMillis : ()J
    //   6977: aload_0
    //   6978: getfield Z : J
    //   6981: lsub
    //   6982: ldc2_w 5000
    //   6985: lcmp
    //   6986: ifge -> 7029
    //   6989: aload_0
    //   6990: getfield v : Landroid/os/Handler;
    //   6993: astore #36
    //   6995: new r9
    //   6998: astore #37
    //   7000: aload #37
    //   7002: aload_0
    //   7003: bipush #13
    //   7005: invokespecial <init> : (Lin/krosbits/musicolet/MusicService;I)V
    //   7008: aload #36
    //   7010: aload #37
    //   7012: ldc2_w 300
    //   7015: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   7018: pop
    //   7019: goto -> 7029
    //   7022: astore #36
    //   7024: aload #36
    //   7026: invokevirtual printStackTrace : ()V
    //   7029: aload_0
    //   7030: lconst_0
    //   7031: putfield Z : J
    //   7034: goto -> 7062
    //   7037: aload_0
    //   7038: iconst_2
    //   7039: invokevirtual stopForeground : (I)V
    //   7042: new z21
    //   7045: astore #37
    //   7047: aload #37
    //   7049: aload_0
    //   7050: invokespecial <init> : (Landroid/content/Context;)V
    //   7053: aload #37
    //   7055: bipush #100
    //   7057: aload #36
    //   7059: invokevirtual c : (ILandroid/app/Notification;)V
    //   7062: iload #11
    //   7064: ifeq -> 7087
    //   7067: aload_0
    //   7068: getfield j : Z
    //   7071: ifne -> 7087
    //   7074: getstatic in/krosbits/musicolet/MusicService.b1 : Landroid/os/Handler;
    //   7077: getstatic in/krosbits/musicolet/MusicService.c1 : Ll3;
    //   7080: ldc2_w 1000
    //   7083: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   7086: pop
    //   7087: aload_0
    //   7088: aload_0
    //   7089: getfield j : Z
    //   7092: iconst_1
    //   7093: ixor
    //   7094: invokevirtual C0 : (Z)V
    //   7097: goto -> 7220
    //   7100: aload_0
    //   7101: getfield e0 : Lb71;
    //   7104: astore #36
    //   7106: aload #36
    //   7108: ifnull -> 7127
    //   7111: aload #36
    //   7113: getfield b : [Z
    //   7116: iconst_0
    //   7117: iconst_1
    //   7118: bastore
    //   7119: getstatic in/krosbits/musicolet/MyApplication.v : Lv61;
    //   7122: aload #36
    //   7124: invokevirtual b : (Lkt1;)V
    //   7127: aload_0
    //   7128: aconst_null
    //   7129: putfield e0 : Lb71;
    //   7132: getstatic android/os/Build$VERSION.SDK_INT : I
    //   7135: bipush #26
    //   7137: if_icmplt -> 7148
    //   7140: aload_0
    //   7141: iconst_2
    //   7142: invokevirtual stopForeground : (I)V
    //   7145: goto -> 7153
    //   7148: aload_0
    //   7149: iconst_0
    //   7150: invokevirtual stopForeground : (Z)V
    //   7153: aload_0
    //   7154: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   7157: astore #36
    //   7159: new z21
    //   7162: astore #37
    //   7164: aload #37
    //   7166: aload #36
    //   7168: invokespecial <init> : (Landroid/content/Context;)V
    //   7171: aload #37
    //   7173: bipush #100
    //   7175: invokevirtual b : (I)V
    //   7178: getstatic ag0.m : Landroid/os/Handler;
    //   7181: astore #37
    //   7183: getstatic in/krosbits/musicolet/MusicService.h1 : Lhi;
    //   7186: astore #36
    //   7188: aload #37
    //   7190: aload #36
    //   7192: ldc2_w 2000
    //   7195: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   7198: pop
    //   7199: aload #37
    //   7201: aload #36
    //   7203: ldc2_w 5300
    //   7206: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   7209: pop
    //   7210: aload_0
    //   7211: iconst_1
    //   7212: invokevirtual stopForeground : (Z)V
    //   7215: aload_0
    //   7216: iconst_0
    //   7217: invokevirtual C0 : (Z)V
    //   7220: iload_1
    //   7221: ifeq -> 7233
    //   7224: invokestatic d : ()Landroid/content/Context;
    //   7227: invokestatic Q0 : (Landroid/content/Context;)V
    //   7230: invokestatic A0 : ()V
    //   7233: aload_0
    //   7234: monitorexit
    //   7235: return
    //   7236: aload_0
    //   7237: monitorexit
    //   7238: aload #36
    //   7240: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	245	finally
    //   24	46	245	finally
    //   51	69	128	finally
    //   74	89	128	finally
    //   94	105	128	finally
    //   111	118	128	finally
    //   133	149	128	finally
    //   154	161	128	finally
    //   164	169	245	finally
    //   180	236	245	finally
    //   253	275	245	finally
    //   296	301	245	finally
    //   321	337	245	finally
    //   360	367	245	finally
    //   379	395	245	finally
    //   407	454	245	finally
    //   494	500	245	finally
    //   522	543	245	finally
    //   566	573	245	finally
    //   578	603	245	finally
    //   612	629	245	finally
    //   632	647	245	finally
    //   650	657	245	finally
    //   666	683	245	finally
    //   689	704	245	finally
    //   707	714	245	finally
    //   958	965	245	finally
    //   976	988	245	finally
    //   996	1003	245	finally
    //   1006	1018	245	finally
    //   1018	1036	245	finally
    //   1185	1201	245	finally
    //   1214	1226	245	finally
    //   1275	1508	245	finally
    //   1512	1615	245	finally
    //   1635	1646	245	finally
    //   1686	1707	245	finally
    //   1718	1757	245	finally
    //   1773	1819	245	finally
    //   1825	1856	245	finally
    //   1862	1903	245	finally
    //   1909	1916	245	finally
    //   1929	1959	245	finally
    //   1965	2006	245	finally
    //   2019	2050	245	finally
    //   2056	2097	245	finally
    //   2103	2113	245	finally
    //   2118	2143	245	finally
    //   2188	2195	245	finally
    //   2202	2227	245	finally
    //   2230	2261	245	finally
    //   2299	2309	245	finally
    //   2309	2316	245	finally
    //   2321	2329	245	finally
    //   2332	2342	245	finally
    //   2347	2356	245	finally
    //   2356	2389	245	finally
    //   2436	2441	245	finally
    //   2459	2466	245	finally
    //   2471	2479	245	finally
    //   2482	2489	245	finally
    //   2492	2497	245	finally
    //   2515	2522	245	finally
    //   2527	2535	245	finally
    //   2538	2545	245	finally
    //   2545	2552	245	finally
    //   2595	2616	245	finally
    //   2684	2699	245	finally
    //   2717	2730	245	finally
    //   2735	2891	245	finally
    //   2894	2912	245	finally
    //   2915	2926	245	finally
    //   2943	2953	245	finally
    //   2956	2975	245	finally
    //   2978	2988	245	finally
    //   3005	3015	245	finally
    //   3018	3037	245	finally
    //   3040	3050	245	finally
    //   3053	3104	245	finally
    //   3122	3181	245	finally
    //   3184	3194	245	finally
    //   3197	3245	245	finally
    //   3248	3258	245	finally
    //   3261	3297	245	finally
    //   3300	3310	245	finally
    //   3310	3346	245	finally
    //   3349	3359	245	finally
    //   3362	3392	245	finally
    //   3392	3409	245	finally
    //   3416	3426	245	finally
    //   3429	3439	245	finally
    //   3444	3467	245	finally
    //   3470	3480	245	finally
    //   3485	3494	245	finally
    //   3504	3536	245	finally
    //   3539	3567	245	finally
    //   3570	3580	245	finally
    //   3584	3606	245	finally
    //   3612	3618	245	finally
    //   3626	3639	245	finally
    //   3654	3664	245	finally
    //   3751	3765	245	finally
    //   3770	3785	245	finally
    //   3901	3906	245	finally
    //   3906	3917	245	finally
    //   3922	3929	245	finally
    //   3950	3967	245	finally
    //   3970	3986	245	finally
    //   3986	4004	245	finally
    //   4029	4042	245	finally
    //   4047	4138	245	finally
    //   4155	4165	245	finally
    //   4168	4187	245	finally
    //   4190	4200	245	finally
    //   4213	4223	245	finally
    //   4226	4245	245	finally
    //   4248	4258	245	finally
    //   4258	4276	245	finally
    //   4279	4290	245	finally
    //   4293	4302	245	finally
    //   4307	4320	245	finally
    //   4326	4362	245	finally
    //   4365	4375	245	finally
    //   4378	4387	245	finally
    //   4392	4405	245	finally
    //   4411	4450	245	finally
    //   4453	4463	245	finally
    //   4463	4543	245	finally
    //   4553	4670	245	finally
    //   4670	4699	245	finally
    //   4705	4732	245	finally
    //   4735	4745	245	finally
    //   4745	4768	245	finally
    //   4785	4926	245	finally
    //   4931	4941	245	finally
    //   4944	4971	245	finally
    //   4974	5042	245	finally
    //   5045	5055	245	finally
    //   5059	5101	245	finally
    //   5106	5132	245	finally
    //   5137	5228	245	finally
    //   5233	5313	245	finally
    //   5316	5326	245	finally
    //   5329	5350	245	finally
    //   5350	5363	245	finally
    //   5368	5420	245	finally
    //   5423	5541	245	finally
    //   5552	5562	245	finally
    //   5565	5576	245	finally
    //   5581	5594	245	finally
    //   5600	5636	245	finally
    //   5639	5649	245	finally
    //   5654	5664	245	finally
    //   5669	5682	245	finally
    //   5688	5714	245	finally
    //   5717	5727	245	finally
    //   5732	5742	245	finally
    //   5747	5760	245	finally
    //   5766	5792	245	finally
    //   5801	5811	245	finally
    //   5816	5827	245	finally
    //   5846	5859	245	finally
    //   5865	5888	245	finally
    //   5891	5901	245	finally
    //   5904	5955	245	finally
    //   5960	5969	245	finally
    //   5984	6016	245	finally
    //   6019	6047	245	finally
    //   6050	6060	245	finally
    //   6060	6093	245	finally
    //   6099	6112	245	finally
    //   6124	6131	245	finally
    //   6134	6141	245	finally
    //   6168	6175	245	finally
    //   6180	6188	245	finally
    //   6191	6201	245	finally
    //   6206	6213	245	finally
    //   6218	6226	245	finally
    //   6229	6239	245	finally
    //   6242	6248	245	finally
    //   6251	6306	245	finally
    //   6325	6332	245	finally
    //   6337	6345	245	finally
    //   6348	6358	245	finally
    //   6361	6367	245	finally
    //   6367	6379	245	finally
    //   6384	6414	245	finally
    //   6418	6441	245	finally
    //   6445	6476	245	finally
    //   6481	6488	245	finally
    //   6491	6500	245	finally
    //   6500	6523	245	finally
    //   6526	6535	245	finally
    //   6535	6606	245	finally
    //   6611	6620	245	finally
    //   6623	6634	245	finally
    //   6637	6673	245	finally
    //   6678	6715	245	finally
    //   6733	6755	245	finally
    //   6765	6768	245	finally
    //   6786	6792	245	finally
    //   6797	6813	245	finally
    //   6813	6818	245	finally
    //   6821	6848	245	finally
    //   6866	6920	245	finally
    //   6928	6960	245	finally
    //   6967	7019	7022	finally
    //   7024	7029	245	finally
    //   7029	7034	245	finally
    //   7037	7062	245	finally
    //   7067	7087	245	finally
    //   7087	7097	245	finally
    //   7100	7106	245	finally
    //   7111	7127	245	finally
    //   7127	7145	245	finally
    //   7148	7153	245	finally
    //   7153	7220	245	finally
    //   7224	7233	245	finally
    //   7236	7238	245	finally
  }
  
  public final void O() {
    n21.F("MSOABNS");
    if (!this.w) {
      stopSelf();
      return;
    } 
    if (F0 && (!this.j || this.W) && this.u.getBoolean(getResources().getString(2131886707), true)) {
      if (!this.j)
        X(new Integer[] { Integer.valueOf(1) }); 
      this.V = true;
    } 
    if (this.x)
      this.x = false; 
    this.m = false;
    this.N = L();
    if (j50.v(D0))
      BluetoothUsbReceiver.a = System.currentTimeMillis(); 
  }
  
  public final void P(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      this.U = false; 
    if (F0 && E0 != null)
      if (paramInt == 1) {
        try {
          if (this.x) {
            this.x = false;
            if (this.j)
              X(new Integer[0]); 
          } 
        } finally {
          Exception exception = null;
        } 
      } else {
        paramBoolean = E0(paramInt);
        if (paramBoolean && !this.j) {
          this.x = true;
          int j = MyApplication.o().getInt("B_R_AFL", 3);
          paramBoolean = MyApplication.o().getBoolean("B_RAF_RACE", true);
          if (j >= 1 && !paramBoolean && K())
            this.x = false; 
          X(new Integer[] { Integer.valueOf(1) });
        } 
        int i = MyApplication.o().getInt("B_R_AFL", 3);
        if (paramInt == -3 && i == 3 && !this.j) {
          this.y = true;
          hc hc1 = E0;
          String str = ag0.a;
          hc1.c0((int)(hc1.F() * 0.4D));
        } 
        if (K()) {
          LockScreenActivity lockScreenActivity = LockScreenActivity.a1;
          if (lockScreenActivity != null) {
            lockScreenActivity.F0 = false;
            lockScreenActivity.finish();
            return;
          } 
        } 
      }  
  }
  
  public final boolean P0() {
    if (ws2.U())
      try {
        return this.B0.d(MyApplication.m().getSelectedRoute(1).getPresentationDisplay());
      } finally {
        Exception exception = null;
      }  
    return false;
  }
  
  public final void Q() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 'MSOAPC>'
    //   7: invokespecial <init> : (Ljava/lang/String;)V
    //   10: astore #4
    //   12: aload #4
    //   14: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   17: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   20: pop
    //   21: aload #4
    //   23: invokevirtual toString : ()Ljava/lang/String;
    //   26: invokestatic F : (Ljava/lang/String;)V
    //   29: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   32: astore #4
    //   34: aload #4
    //   36: ifnull -> 89
    //   39: aload #4
    //   41: invokevirtual H : ()Z
    //   44: ifeq -> 89
    //   47: aload_0
    //   48: getfield u : Landroid/content/SharedPreferences;
    //   51: ldc_w 'etu2'
    //   54: iconst_0
    //   55: invokeinterface getInt : (Ljava/lang/String;I)I
    //   60: istore_2
    //   61: iload_2
    //   62: ifeq -> 85
    //   65: iload_2
    //   66: iconst_2
    //   67: if_icmpne -> 73
    //   70: goto -> 85
    //   73: iload_2
    //   74: iconst_1
    //   75: if_icmpne -> 89
    //   78: aload_0
    //   79: invokevirtual J0 : ()V
    //   82: goto -> 89
    //   85: aload_0
    //   86: invokevirtual I0 : ()V
    //   89: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   92: astore #4
    //   94: aload #4
    //   96: ifnull -> 693
    //   99: aload #4
    //   101: invokevirtual H : ()Z
    //   104: ifne -> 110
    //   107: goto -> 693
    //   110: getstatic in/krosbits/musicolet/MusicService.K0 : Low;
    //   113: invokestatic x : (Low;)V
    //   116: goto -> 126
    //   119: astore #4
    //   121: aload #4
    //   123: invokevirtual printStackTrace : ()V
    //   126: getstatic in/krosbits/musicolet/MusicService.L0 : Lve;
    //   129: astore #4
    //   131: getstatic j50.a : I
    //   134: istore_2
    //   135: aload #4
    //   137: ifnonnull -> 143
    //   140: goto -> 201
    //   143: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   146: istore_2
    //   147: new java/lang/StringBuilder
    //   150: astore #5
    //   152: aload #5
    //   154: ldc_w 'EQBBS_'
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: aload #5
    //   162: iload_2
    //   163: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload #5
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: astore #5
    //   174: aload #4
    //   176: invokestatic o : ()Landroid/content/SharedPreferences;
    //   179: aload #5
    //   181: iconst_0
    //   182: invokeinterface getInt : (Ljava/lang/String;I)I
    //   187: i2s
    //   188: invokevirtual c : (S)V
    //   191: goto -> 201
    //   194: astore #4
    //   196: aload #4
    //   198: invokevirtual printStackTrace : ()V
    //   201: getstatic in/krosbits/musicolet/MusicService.M0 : Lve;
    //   204: astore #4
    //   206: getstatic j50.a : I
    //   209: istore_2
    //   210: aload #4
    //   212: ifnonnull -> 218
    //   215: goto -> 276
    //   218: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   221: istore_2
    //   222: new java/lang/StringBuilder
    //   225: astore #5
    //   227: aload #5
    //   229: ldc_w 'EQVS_'
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: aload #5
    //   237: iload_2
    //   238: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload #5
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: astore #5
    //   249: aload #4
    //   251: invokestatic o : ()Landroid/content/SharedPreferences;
    //   254: aload #5
    //   256: iconst_0
    //   257: invokeinterface getInt : (Ljava/lang/String;I)I
    //   262: i2s
    //   263: invokevirtual c : (S)V
    //   266: goto -> 276
    //   269: astore #4
    //   271: aload #4
    //   273: invokevirtual printStackTrace : ()V
    //   276: getstatic in/krosbits/musicolet/MusicService.N0 : Le91;
    //   279: astore #4
    //   281: getstatic j50.a : I
    //   284: istore_2
    //   285: aload #4
    //   287: ifnonnull -> 293
    //   290: goto -> 453
    //   293: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   296: istore_2
    //   297: new java/lang/StringBuilder
    //   300: astore #5
    //   302: aload #5
    //   304: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.tvPYb : Ljava/lang/String;
    //   307: invokespecial <init> : (Ljava/lang/String;)V
    //   310: aload #5
    //   312: iload_2
    //   313: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload #5
    //   319: invokevirtual toString : ()Ljava/lang/String;
    //   322: astore #5
    //   324: invokestatic o : ()Landroid/content/SharedPreferences;
    //   327: aload #5
    //   329: iconst_0
    //   330: invokeinterface getInt : (Ljava/lang/String;I)I
    //   335: istore_3
    //   336: iload_3
    //   337: iconst_m1
    //   338: if_icmpne -> 388
    //   341: new java/lang/StringBuilder
    //   344: astore #5
    //   346: aload #5
    //   348: ldc_w 'k_i_hdrmg_'
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: aload #5
    //   356: iload_2
    //   357: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: aload #5
    //   363: invokevirtual toString : ()Ljava/lang/String;
    //   366: astore #5
    //   368: invokestatic o : ()Landroid/content/SharedPreferences;
    //   371: aload #5
    //   373: bipush #6
    //   375: invokeinterface getInt : (Ljava/lang/String;I)I
    //   380: ineg
    //   381: istore_2
    //   382: iload_2
    //   383: i2f
    //   384: fstore_1
    //   385: goto -> 437
    //   388: iload_3
    //   389: iconst_1
    //   390: if_icmpne -> 435
    //   393: new java/lang/StringBuilder
    //   396: astore #5
    //   398: aload #5
    //   400: ldc_w 'k_i_vbg_'
    //   403: invokespecial <init> : (Ljava/lang/String;)V
    //   406: aload #5
    //   408: iload_2
    //   409: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   412: pop
    //   413: aload #5
    //   415: invokevirtual toString : ()Ljava/lang/String;
    //   418: astore #5
    //   420: invokestatic o : ()Landroid/content/SharedPreferences;
    //   423: aload #5
    //   425: iconst_2
    //   426: invokeinterface getInt : (Ljava/lang/String;I)I
    //   431: istore_2
    //   432: goto -> 382
    //   435: fconst_0
    //   436: fstore_1
    //   437: aload #4
    //   439: fload_1
    //   440: invokevirtual c : (F)V
    //   443: goto -> 453
    //   446: astore #4
    //   448: aload #4
    //   450: invokevirtual printStackTrace : ()V
    //   453: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   456: invokestatic w : (Lhc;)V
    //   459: goto -> 469
    //   462: astore #4
    //   464: aload #4
    //   466: invokevirtual printStackTrace : ()V
    //   469: getstatic in/krosbits/musicolet/MusicService.O0 : Landroid/media/audiofx/EnvironmentalReverb;
    //   472: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   475: invokestatic y : (Landroid/media/audiofx/EnvironmentalReverb;Lhc;)V
    //   478: goto -> 488
    //   481: astore #4
    //   483: aload #4
    //   485: invokevirtual printStackTrace : ()V
    //   488: getstatic in/krosbits/musicolet/EqualizerActivity2.q0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   491: astore #5
    //   493: aload #5
    //   495: ifnull -> 607
    //   498: aload #5
    //   500: getfield S : Landroid/widget/Spinner;
    //   503: ifnull -> 574
    //   506: aload #5
    //   508: getfield X : Lzm;
    //   511: ifnull -> 574
    //   514: invokestatic l0 : ()Ljava/util/ArrayList;
    //   517: astore #4
    //   519: iconst_0
    //   520: istore_2
    //   521: iload_2
    //   522: aload #4
    //   524: invokevirtual size : ()I
    //   527: if_icmpge -> 574
    //   530: aload #4
    //   532: iload_2
    //   533: invokevirtual get : (I)Ljava/lang/Object;
    //   536: checkcast dl0
    //   539: getfield c : I
    //   542: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   545: if_icmpne -> 568
    //   548: aload #5
    //   550: getfield S : Landroid/widget/Spinner;
    //   553: iload_2
    //   554: invokevirtual setSelection : (I)V
    //   557: aload #5
    //   559: getfield X : Lzm;
    //   562: invokevirtual notifyDataSetChanged : ()V
    //   565: goto -> 574
    //   568: iinc #2, 1
    //   571: goto -> 521
    //   574: aload #5
    //   576: getfield Z : Lz40;
    //   579: invokevirtual E0 : ()V
    //   582: aload #5
    //   584: getfield a0 : Ld50;
    //   587: invokevirtual E0 : ()V
    //   590: aload #5
    //   592: getfield b0 : Le50;
    //   595: astore #4
    //   597: aload #4
    //   599: ifnull -> 607
    //   602: aload #4
    //   604: invokevirtual E0 : ()V
    //   607: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   610: invokestatic v : (I)Z
    //   613: ifeq -> 649
    //   616: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   619: ifeq -> 649
    //   622: aload_0
    //   623: getfield Y : Z
    //   626: ifeq -> 649
    //   629: aload_0
    //   630: iconst_0
    //   631: putfield Y : Z
    //   634: aload_0
    //   635: getfield j : Z
    //   638: ifeq -> 649
    //   641: aload_0
    //   642: iconst_0
    //   643: anewarray java/lang/Integer
    //   646: invokevirtual X : ([Ljava/lang/Integer;)V
    //   649: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   652: invokevirtual isCurrentThread : ()Z
    //   655: ifeq -> 666
    //   658: aload_0
    //   659: invokevirtual P0 : ()Z
    //   662: pop
    //   663: goto -> 693
    //   666: aload_0
    //   667: getfield v : Landroid/os/Handler;
    //   670: astore #4
    //   672: aload #4
    //   674: ifnull -> 693
    //   677: aload #4
    //   679: new r9
    //   682: dup
    //   683: aload_0
    //   684: bipush #12
    //   686: invokespecial <init> : (Lin/krosbits/musicolet/MusicService;I)V
    //   689: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   692: pop
    //   693: return
    // Exception table:
    //   from	to	target	type
    //   110	116	119	finally
    //   126	135	194	finally
    //   143	191	194	finally
    //   201	210	269	finally
    //   218	266	269	finally
    //   276	285	446	finally
    //   293	336	446	finally
    //   341	382	446	finally
    //   393	432	446	finally
    //   437	443	446	finally
    //   453	459	462	finally
    //   469	478	481	finally
  }
  
  public final void R(int paramInt, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder("MSOEEC:");
    stringBuilder.append(paramInt);
    stringBuilder.append(">");
    stringBuilder.append(paramBoolean);
    n21.F(stringBuilder.toString());
    if (paramInt == D0) {
      hc hc1 = E0;
      if (hc1 != null && hc1.H()) {
        if (paramBoolean && j50.d(paramInt) != 100) {
          hc1 = E0;
          if (hc1 instanceof kd && ((kd)hc1).o == 1) {
            a0(60L);
            return;
          } 
        } 
        if (paramBoolean) {
          I0();
          return;
        } 
        K0();
      } 
    } 
  }
  
  public final void S(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    boolean[] arrayOfBoolean = B(paramBoolean2, paramBoolean3);
    paramBoolean3 = arrayOfBoolean[0];
    if (arrayOfBoolean[1]) {
      Handler handler = this.v;
      if (handler != null) {
        cz0 cz0 = new cz0(this, paramBoolean1, paramBoolean2, 1);
        if (handler.postDelayed((Runnable)cz0, 3000L)) {
          this.a0 = (Runnable)cz0;
          return;
        } 
      } 
    } else {
      if (paramBoolean3) {
        s0();
        return;
      } 
      W();
      if (this.j && paramBoolean1)
        X(new Integer[0]); 
    } 
  }
  
  public final void T(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    boolean[] arrayOfBoolean = B(paramBoolean2, paramBoolean3);
    paramBoolean3 = arrayOfBoolean[0];
    if (arrayOfBoolean[1]) {
      Handler handler = this.v;
      if (handler != null) {
        cz0 cz0 = new cz0(this, paramBoolean1, paramBoolean2, 0);
        if (handler.postDelayed((Runnable)cz0, 2000L)) {
          this.a0 = (Runnable)cz0;
          return;
        } 
      } 
    } else {
      if (paramBoolean3) {
        r0();
        return;
      } 
      Y();
      if (this.j && paramBoolean1)
        X(new Integer[0]); 
    } 
  }
  
  public final void U() {
    try {
      int i = C();
      this.n = false;
      if (i == 0) {
        if (!this.j && MyApplication.o().getBoolean("k_b_pwm", true)) {
          this.m = true;
          ag0.O0(2131887073, 0);
          X(new Integer[0]);
        } 
      } else if (i > 0 && this.j && this.m && MyApplication.o().getBoolean("k_b_rwum", true)) {
        ag0.O0(2131887229, 0);
        X(new Integer[0]);
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final km0 V(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString) {
    // Byte code:
    //   0: invokestatic z : ()Lxn1;
    //   3: astore #12
    //   5: aload #12
    //   7: invokevirtual i : ()Z
    //   10: istore #9
    //   12: aload #12
    //   14: getfield b : Ljava/util/ArrayList;
    //   17: astore #13
    //   19: iload #9
    //   21: ifeq -> 30
    //   24: iconst_0
    //   25: istore #5
    //   27: goto -> 40
    //   30: aload #12
    //   32: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   35: invokevirtual e : (Z)I
    //   38: istore #5
    //   40: invokestatic u : ()Landroid/content/SharedPreferences;
    //   43: ldc_w 'RSM'
    //   46: iconst_2
    //   47: invokeinterface getInt : (Ljava/lang/String;I)I
    //   52: istore #6
    //   54: iload_2
    //   55: ifeq -> 97
    //   58: iload #6
    //   60: iconst_2
    //   61: if_icmpeq -> 97
    //   64: iload #6
    //   66: iconst_1
    //   67: if_icmpne -> 73
    //   70: goto -> 788
    //   73: iload #6
    //   75: iconst_4
    //   76: if_icmpne -> 82
    //   79: goto -> 788
    //   82: iload #6
    //   84: iconst_3
    //   85: if_icmpne -> 788
    //   88: invokestatic y : ()Lkm0;
    //   91: areturn
    //   92: astore #4
    //   94: goto -> 790
    //   97: aload #13
    //   99: invokevirtual size : ()I
    //   102: istore #6
    //   104: iload #5
    //   106: iload_1
    //   107: iadd
    //   108: istore_1
    //   109: iload_1
    //   110: iload #6
    //   112: if_icmpge -> 129
    //   115: iload_1
    //   116: iflt -> 129
    //   119: aload #12
    //   121: iload_1
    //   122: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   125: invokevirtual h : (IZ)Lkm0;
    //   128: areturn
    //   129: invokestatic u : ()Landroid/content/SharedPreferences;
    //   132: ldc_w 'RQM'
    //   135: iconst_2
    //   136: invokeinterface getInt : (Ljava/lang/String;I)I
    //   141: istore #5
    //   143: invokestatic u : ()Landroid/content/SharedPreferences;
    //   146: ldc_w 'R_SFFQ'
    //   149: iconst_0
    //   150: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   155: istore_2
    //   156: invokestatic u : ()Landroid/content/SharedPreferences;
    //   159: ldc_w 'R_RFLP'
    //   162: iconst_1
    //   163: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   168: istore #11
    //   170: invokestatic u : ()Landroid/content/SharedPreferences;
    //   173: ldc_w 'R_RSFLQ'
    //   176: iconst_1
    //   177: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   182: istore #9
    //   184: invokestatic u : ()Landroid/content/SharedPreferences;
    //   187: ldc_w 'R_b_rwq'
    //   190: iconst_1
    //   191: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   196: istore #10
    //   198: iload #5
    //   200: iconst_1
    //   201: if_icmpne -> 207
    //   204: goto -> 788
    //   207: iload_3
    //   208: ifeq -> 788
    //   211: iload #5
    //   213: iconst_2
    //   214: if_icmpne -> 646
    //   217: iload_1
    //   218: ifge -> 224
    //   221: goto -> 229
    //   224: iload_1
    //   225: iload #6
    //   227: isub
    //   228: istore_1
    //   229: invokestatic h : ()Lwk1;
    //   232: getfield c : I
    //   235: istore #5
    //   237: iload_1
    //   238: istore #7
    //   240: iconst_0
    //   241: istore #6
    //   243: iload #7
    //   245: ifge -> 286
    //   248: iload #5
    //   250: iconst_1
    //   251: isub
    //   252: istore #8
    //   254: iload #8
    //   256: istore #5
    //   258: iload #8
    //   260: ifge -> 280
    //   263: iload_2
    //   264: ifeq -> 788
    //   267: invokestatic h : ()Lwk1;
    //   270: getfield b : Ljava/util/Stack;
    //   273: invokevirtual size : ()I
    //   276: iconst_1
    //   277: isub
    //   278: istore #5
    //   280: iconst_0
    //   281: istore #8
    //   283: goto -> 320
    //   286: iload #5
    //   288: iconst_1
    //   289: iadd
    //   290: istore #8
    //   292: iload #8
    //   294: istore #5
    //   296: iload #8
    //   298: invokestatic h : ()Lwk1;
    //   301: getfield b : Ljava/util/Stack;
    //   304: invokevirtual size : ()I
    //   307: if_icmplt -> 317
    //   310: iload_2
    //   311: ifeq -> 788
    //   314: iconst_0
    //   315: istore #5
    //   317: iconst_1
    //   318: istore #8
    //   320: invokestatic h : ()Lwk1;
    //   323: getfield b : Ljava/util/Stack;
    //   326: iload #5
    //   328: invokevirtual get : (I)Ljava/lang/Object;
    //   331: checkcast xn1
    //   334: astore #13
    //   336: iload #6
    //   338: ifeq -> 357
    //   341: aload #13
    //   343: aload #12
    //   345: if_acmpne -> 357
    //   348: iload #7
    //   350: iload_1
    //   351: if_icmpne -> 357
    //   354: goto -> 788
    //   357: aload #13
    //   359: invokevirtual i : ()Z
    //   362: istore_3
    //   363: aload #13
    //   365: getfield b : Ljava/util/ArrayList;
    //   368: astore #14
    //   370: iload_3
    //   371: ifne -> 500
    //   374: iload #8
    //   376: ifeq -> 410
    //   379: aload #13
    //   381: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   384: invokevirtual j : (Z)Z
    //   387: ifeq -> 404
    //   390: aload #13
    //   392: getfield g : I
    //   395: ifne -> 404
    //   398: iconst_1
    //   399: istore #6
    //   401: goto -> 465
    //   404: iconst_0
    //   405: istore #6
    //   407: goto -> 465
    //   410: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   413: ifeq -> 426
    //   416: aload #13
    //   418: getfield f : I
    //   421: istore #6
    //   423: goto -> 433
    //   426: aload #13
    //   428: getfield e : I
    //   431: istore #6
    //   433: iload #6
    //   435: iconst_1
    //   436: isub
    //   437: ifge -> 446
    //   440: iconst_1
    //   441: istore #6
    //   443: goto -> 449
    //   446: iconst_0
    //   447: istore #6
    //   449: iload #6
    //   451: ifeq -> 404
    //   454: aload #13
    //   456: getfield g : I
    //   459: ifne -> 404
    //   462: goto -> 398
    //   465: iload #11
    //   467: ifeq -> 495
    //   470: aload #13
    //   472: aload #12
    //   474: if_acmpeq -> 495
    //   477: iload #6
    //   479: ifne -> 495
    //   482: aload #13
    //   484: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   487: invokevirtual e : (Z)I
    //   490: istore #6
    //   492: goto -> 513
    //   495: iload #8
    //   497: ifeq -> 506
    //   500: iconst_0
    //   501: istore #6
    //   503: goto -> 513
    //   506: aload #14
    //   508: invokevirtual size : ()I
    //   511: istore #6
    //   513: iload #6
    //   515: iload #7
    //   517: iadd
    //   518: istore #6
    //   520: iload #6
    //   522: iflt -> 614
    //   525: iload #6
    //   527: aload #14
    //   529: invokevirtual size : ()I
    //   532: if_icmpge -> 614
    //   535: aload #12
    //   537: aload #13
    //   539: if_acmpne -> 564
    //   542: iload #10
    //   544: ifeq -> 561
    //   547: iload #9
    //   549: ifeq -> 561
    //   552: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   555: ifeq -> 561
    //   558: goto -> 788
    //   561: goto -> 576
    //   564: aload #4
    //   566: iconst_0
    //   567: aload #13
    //   569: getfield h : Ljava/lang/String;
    //   572: aastore
    //   573: goto -> 561
    //   576: aload_0
    //   577: getfield t : Landroid/content/SharedPreferences;
    //   580: ldc_w 'R_RFLP'
    //   583: iconst_1
    //   584: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   589: ifeq -> 603
    //   592: aload #13
    //   594: getfield g : I
    //   597: ifle -> 603
    //   600: goto -> 788
    //   603: aload #13
    //   605: iload #6
    //   607: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   610: invokevirtual h : (IZ)Lkm0;
    //   613: areturn
    //   614: iload #6
    //   616: ifge -> 622
    //   619: goto -> 632
    //   622: iload #6
    //   624: aload #14
    //   626: invokevirtual size : ()I
    //   629: isub
    //   630: istore #6
    //   632: iconst_1
    //   633: istore #8
    //   635: iload #6
    //   637: istore #7
    //   639: iload #8
    //   641: istore #6
    //   643: goto -> 243
    //   646: iload #5
    //   648: iconst_3
    //   649: if_icmpne -> 788
    //   652: iload_1
    //   653: ifge -> 659
    //   656: goto -> 664
    //   659: iload_1
    //   660: iload #6
    //   662: isub
    //   663: istore_1
    //   664: iload #9
    //   666: ifeq -> 678
    //   669: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   672: ifeq -> 678
    //   675: goto -> 788
    //   678: iload_1
    //   679: istore #5
    //   681: iconst_0
    //   682: istore #6
    //   684: iload #6
    //   686: ifeq -> 698
    //   689: iload #5
    //   691: iload_1
    //   692: if_icmpne -> 698
    //   695: goto -> 788
    //   698: aload #12
    //   700: invokevirtual i : ()Z
    //   703: ifne -> 721
    //   706: iload #5
    //   708: ifge -> 721
    //   711: aload #13
    //   713: invokevirtual size : ()I
    //   716: istore #6
    //   718: goto -> 724
    //   721: iconst_0
    //   722: istore #6
    //   724: iload #6
    //   726: iload #5
    //   728: iadd
    //   729: istore #5
    //   731: iload #5
    //   733: iflt -> 757
    //   736: iload #5
    //   738: aload #13
    //   740: invokevirtual size : ()I
    //   743: if_icmpge -> 757
    //   746: aload #12
    //   748: iload #5
    //   750: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   753: invokevirtual h : (IZ)Lkm0;
    //   756: areturn
    //   757: iload #5
    //   759: ifge -> 765
    //   762: goto -> 782
    //   765: aload #13
    //   767: invokevirtual size : ()I
    //   770: istore #6
    //   772: iload #5
    //   774: iload #6
    //   776: isub
    //   777: istore #5
    //   779: goto -> 762
    //   782: iconst_1
    //   783: istore #6
    //   785: goto -> 684
    //   788: aconst_null
    //   789: areturn
    //   790: aload #4
    //   792: invokevirtual printStackTrace : ()V
    //   795: aconst_null
    //   796: areturn
    // Exception table:
    //   from	to	target	type
    //   0	12	92	finally
    //   30	40	92	finally
    //   40	54	92	finally
    //   88	92	92	finally
    //   97	104	92	finally
    //   119	129	92	finally
    //   129	198	92	finally
    //   229	237	92	finally
    //   267	280	92	finally
    //   296	310	92	finally
    //   320	336	92	finally
    //   357	363	92	finally
    //   379	398	92	finally
    //   410	423	92	finally
    //   426	433	92	finally
    //   454	462	92	finally
    //   482	492	92	finally
    //   506	513	92	finally
    //   525	535	92	finally
    //   552	558	92	finally
    //   564	573	92	finally
    //   576	600	92	finally
    //   603	614	92	finally
    //   622	632	92	finally
    //   669	675	92	finally
    //   698	706	92	finally
    //   711	718	92	finally
    //   736	757	92	finally
    //   765	772	92	finally
  }
  
  public final boolean W() {
    boolean bool;
    if (!this.w) {
      H();
      MyApplication.h().b();
    } 
    m0(false);
    int i = this.t.getInt("RQM", 2);
    boolean bool2 = this.t.getBoolean("R_RFLP", true);
    if (C0 && this.t.getBoolean("R_RSFLQ", true)) {
      bool = true;
    } else {
      bool = false;
    } 
    boolean bool1 = this.t.getBoolean("R_b_rwq", true);
    if (z().i() || z().j(C0)) {
      if (i == 2) {
        String str;
        xn1 xn11 = z();
        if ((MyApplication.h()).c == (MyApplication.h()).b.size() - 1) {
          if (this.t.getBoolean("R_SFFQ", false)) {
            r();
            (MyApplication.h()).c = 0;
            H0 = true;
            I0 = (MyApplication.h()).c;
            i = 0;
          } else {
            if (C0) {
              str = getString(2131886502);
            } else {
              str = getString(2131886501);
            } 
            ag0.P0(0, str, true);
            return false;
          } 
        } else {
          if ((MyApplication.h()).c == (MyApplication.h()).b.size() - 2) {
            i = 1;
          } else {
            i = 0;
          } 
          r();
          wk1 wk1 = MyApplication.h();
          wk1.c++;
          H0 = true;
          I0 = (MyApplication.h()).c;
        } 
        if (z().i()) {
          t((MyApplication.h()).c);
          if (i != 0)
            if ((MyApplication.h()).c == (MyApplication.h()).b.size() - 1) {
              if (this.t.getBoolean("R_SFFQ", false)) {
                r();
                (MyApplication.h()).c = 0;
                H0 = true;
                I0 = (MyApplication.h()).c;
              } else {
                if (C0) {
                  str = getString(2131886502);
                } else {
                  str = getString(2131886501);
                } 
                ag0.P0(0, str, true);
                return false;
              } 
            } else {
              r();
              wk1 wk1 = MyApplication.h();
              wk1.c++;
              H0 = true;
              I0 = (MyApplication.h()).c;
            }  
        } 
        str.l(0);
        if (bool1) {
          if (bool) {
            ((xn1)str).i = true;
            ((xn1)str).j = true;
            MyApplication.h().a();
          } 
          str.o(C0);
        } 
        if (!z().i() && z().j(C0) && (z()).g == 0) {
          i = 1;
        } else {
          i = 0;
        } 
        if (bool2 && str != z() && i == 0) {
          ag0.O0(2131887135, 0);
        } else {
          z().o(C0);
          z().l(0);
        } 
      } else {
        if (i == 1) {
          String str;
          if (C0) {
            str = getString(2131886499);
          } else {
            str = getString(2131886498);
          } 
          ag0.P0(0, str, true);
          return false;
        } 
        if (i == 3) {
          r();
          if (bool) {
            (z()).i = true;
            (z()).j = true;
            MyApplication.h().a();
          } 
          z().o(C0);
        } 
        z().l(0);
      } 
      j0();
      return true;
    } 
    r();
    xn1 xn1 = z();
    if (C0) {
      xn1.f++;
      xn1.e = ((Integer)xn1.f().get(xn1.f)).intValue();
    } else {
      xn1.e++;
    } 
    z().l(0);
  }
  
  public final void X(Integer... paramVarArgs) {
    if (!this.w)
      H(); 
    if (!z().i()) {
      if (this.j) {
        int i = g0();
        if (MyApplication.o().getBoolean("k_b_dtplim", false) && C() == 0) {
          ag0.O0(2131887073, 1);
          return;
        } 
        if (i == 1) {
          w0(false);
          int j = MyApplication.o().getInt("k_b_fdid", 0);
          i = j;
          if (n0()) {
            i = j;
            if (j < 300)
              i = 101; 
            j = i;
            if (i % 2 == 0)
              j = i + 1; 
            this.x0 = D0;
            n21.F("MS>ES");
            E0.c0(0);
            i = j;
          } 
          E0.f0(i, 1);
          this.j = false;
          MyApplication.c().cancel(this.C);
          this.A = System.currentTimeMillis();
          if (this.X) {
            this.X = false;
            Q();
          } else {
            o();
          } 
        } else if (!n0.p()) {
          this.Z = System.currentTimeMillis();
        } 
        this.V = false;
        this.m = false;
        this.N = L();
        this.W = false;
        this.Y = false;
        if (C() == 0 && !this.n) {
          this.n = true;
          ag0.O0(2131887559, 1);
        } 
      } else {
        if (paramVarArgs.length > 0 && paramVarArgs[0].intValue() == 1) {
          E0.c0(0);
          E0.M();
        } else {
          E0.N(MyApplication.o().getInt("k_b_fdod", 0), 2, null);
        } 
        this.j = true;
        this.e = System.currentTimeMillis();
        long l1 = System.currentTimeMillis();
        long l2 = this.B;
        this.B = l1 - this.A + l2;
        h0();
      } 
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null) {
        z71 z71 = musicActivity.d0;
        if (z71 != null && z71.Y()) {
          z71 = MusicActivity.R0.d0;
          z71.K0.post((Runnable)new v71(z71, 5));
          MusicActivity.R0.d0.Y0();
        } 
      } 
      LockScreenActivity.v0();
      b0(false);
      d0();
      QsService.a((Context)this);
      try {
        MediaBrowserServiceImpl mediaBrowserServiceImpl = MediaBrowserServiceImpl.b;
      } finally {
        musicActivity = null;
      } 
      km0 km01 = y();
      if (km01 != null) {
        qn1 qn1 = km01.c;
        Intent intent = new Intent("com.android.music.playstatechanged");
        Bundle bundle = new Bundle();
        bundle.putString("track", qn1.b);
        bundle.putString("artist", qn1.e);
        bundle.putString("album", qn1.c);
        bundle.putLong("duration", qn1.g);
        bundle.putLong("position", E0.A());
        bundle.putBoolean("playing", this.j ^ true);
        bundle.putString("scrobbling_source", getPackageName());
        intent.putExtras(bundle);
        sendBroadcast(intent);
      } 
    } 
  }
  
  public final void Y() {
    // Byte code:
    //   0: aload_0
    //   1: getfield w : Z
    //   4: ifne -> 17
    //   7: aload_0
    //   8: invokevirtual H : ()V
    //   11: invokestatic h : ()Lwk1;
    //   14: invokevirtual b : ()V
    //   17: aload_0
    //   18: iconst_0
    //   19: invokevirtual m0 : (Z)V
    //   22: iconst_1
    //   23: istore_2
    //   24: aload_0
    //   25: getfield u : Landroid/content/SharedPreferences;
    //   28: aload_0
    //   29: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   32: ldc_w 2131886715
    //   35: invokevirtual getString : (I)Ljava/lang/String;
    //   38: ldc_w '1'
    //   41: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: invokestatic parseInt : (Ljava/lang/String;)I
    //   49: iconst_1
    //   50: if_icmpne -> 95
    //   53: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   56: ifeq -> 95
    //   59: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   62: astore #5
    //   64: aload #5
    //   66: ifnull -> 95
    //   69: aload #5
    //   71: invokevirtual A : ()I
    //   74: i2l
    //   75: ldc2_w 10000
    //   78: lcmp
    //   79: ifle -> 95
    //   82: aload_0
    //   83: iconst_0
    //   84: invokevirtual t0 : (I)V
    //   87: return
    //   88: astore #5
    //   90: aload #5
    //   92: invokevirtual printStackTrace : ()V
    //   95: aload_0
    //   96: getfield t : Landroid/content/SharedPreferences;
    //   99: ldc_w 'RQM'
    //   102: iconst_2
    //   103: invokeinterface getInt : (Ljava/lang/String;I)I
    //   108: istore_3
    //   109: aload_0
    //   110: getfield t : Landroid/content/SharedPreferences;
    //   113: ldc_w 'R_RFLP'
    //   116: iconst_1
    //   117: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   122: istore #4
    //   124: invokestatic z : ()Lxn1;
    //   127: invokevirtual i : ()Z
    //   130: ifne -> 237
    //   133: invokestatic z : ()Lxn1;
    //   136: astore #5
    //   138: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   141: ifeq -> 153
    //   144: aload #5
    //   146: getfield f : I
    //   149: istore_1
    //   150: goto -> 159
    //   153: aload #5
    //   155: getfield e : I
    //   158: istore_1
    //   159: iload_1
    //   160: iconst_1
    //   161: isub
    //   162: ifge -> 168
    //   165: goto -> 237
    //   168: aload_0
    //   169: invokevirtual r : ()V
    //   172: invokestatic z : ()Lxn1;
    //   175: astore #5
    //   177: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   180: ifeq -> 222
    //   183: aload #5
    //   185: aload #5
    //   187: getfield f : I
    //   190: iconst_1
    //   191: isub
    //   192: putfield f : I
    //   195: aload #5
    //   197: aload #5
    //   199: invokevirtual f : ()Ljava/util/ArrayList;
    //   202: aload #5
    //   204: getfield f : I
    //   207: invokevirtual get : (I)Ljava/lang/Object;
    //   210: checkcast java/lang/Integer
    //   213: invokevirtual intValue : ()I
    //   216: putfield e : I
    //   219: goto -> 616
    //   222: aload #5
    //   224: aload #5
    //   226: getfield e : I
    //   229: iconst_1
    //   230: isub
    //   231: putfield e : I
    //   234: goto -> 616
    //   237: iload_3
    //   238: iconst_2
    //   239: if_icmpne -> 585
    //   242: invokestatic z : ()Lxn1;
    //   245: astore #5
    //   247: invokestatic h : ()Lwk1;
    //   250: getfield c : I
    //   253: ifne -> 319
    //   256: aload_0
    //   257: getfield t : Landroid/content/SharedPreferences;
    //   260: ldc_w 'R_SFFQ'
    //   263: iconst_0
    //   264: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   269: ifeq -> 311
    //   272: aload_0
    //   273: invokevirtual r : ()V
    //   276: invokestatic h : ()Lwk1;
    //   279: invokestatic h : ()Lwk1;
    //   282: getfield b : Ljava/util/Stack;
    //   285: invokevirtual size : ()I
    //   288: iconst_1
    //   289: isub
    //   290: putfield c : I
    //   293: iconst_1
    //   294: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   297: invokestatic h : ()Lwk1;
    //   300: getfield c : I
    //   303: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   306: iconst_0
    //   307: istore_1
    //   308: goto -> 355
    //   311: ldc_w 2131886500
    //   314: iconst_0
    //   315: invokestatic O0 : (II)V
    //   318: return
    //   319: aload_0
    //   320: invokevirtual r : ()V
    //   323: invokestatic h : ()Lwk1;
    //   326: astore #6
    //   328: aload #6
    //   330: aload #6
    //   332: getfield c : I
    //   335: iconst_1
    //   336: isub
    //   337: putfield c : I
    //   340: iconst_1
    //   341: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   344: invokestatic h : ()Lwk1;
    //   347: getfield c : I
    //   350: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   353: iconst_1
    //   354: istore_1
    //   355: invokestatic z : ()Lxn1;
    //   358: invokevirtual i : ()Z
    //   361: ifeq -> 483
    //   364: aload_0
    //   365: invokestatic h : ()Lwk1;
    //   368: getfield c : I
    //   371: invokevirtual t : (I)Z
    //   374: pop
    //   375: iload_1
    //   376: ifeq -> 483
    //   379: invokestatic h : ()Lwk1;
    //   382: getfield c : I
    //   385: ifne -> 449
    //   388: aload_0
    //   389: getfield t : Landroid/content/SharedPreferences;
    //   392: ldc_w 'R_SFFQ'
    //   395: iconst_0
    //   396: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   401: ifeq -> 441
    //   404: aload_0
    //   405: invokevirtual r : ()V
    //   408: invokestatic h : ()Lwk1;
    //   411: invokestatic h : ()Lwk1;
    //   414: getfield b : Ljava/util/Stack;
    //   417: invokevirtual size : ()I
    //   420: iconst_1
    //   421: isub
    //   422: putfield c : I
    //   425: iconst_1
    //   426: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   429: invokestatic h : ()Lwk1;
    //   432: getfield c : I
    //   435: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   438: goto -> 483
    //   441: ldc_w 2131886500
    //   444: iconst_0
    //   445: invokestatic O0 : (II)V
    //   448: return
    //   449: aload_0
    //   450: invokevirtual r : ()V
    //   453: invokestatic h : ()Lwk1;
    //   456: astore #6
    //   458: aload #6
    //   460: aload #6
    //   462: getfield c : I
    //   465: iconst_1
    //   466: isub
    //   467: putfield c : I
    //   470: iconst_1
    //   471: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   474: invokestatic h : ()Lwk1;
    //   477: getfield c : I
    //   480: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   483: aload #5
    //   485: iconst_0
    //   486: invokevirtual l : (I)V
    //   489: invokestatic z : ()Lxn1;
    //   492: invokevirtual i : ()Z
    //   495: ifne -> 544
    //   498: invokestatic z : ()Lxn1;
    //   501: astore #6
    //   503: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   506: ifeq -> 518
    //   509: aload #6
    //   511: getfield f : I
    //   514: istore_1
    //   515: goto -> 524
    //   518: aload #6
    //   520: getfield e : I
    //   523: istore_1
    //   524: iload_1
    //   525: iconst_1
    //   526: isub
    //   527: ifge -> 544
    //   530: invokestatic z : ()Lxn1;
    //   533: getfield g : I
    //   536: ifne -> 544
    //   539: iload_2
    //   540: istore_1
    //   541: goto -> 546
    //   544: iconst_0
    //   545: istore_1
    //   546: iload #4
    //   548: ifeq -> 573
    //   551: aload #5
    //   553: invokestatic z : ()Lxn1;
    //   556: if_acmpeq -> 573
    //   559: iload_1
    //   560: ifne -> 573
    //   563: ldc_w 2131887135
    //   566: iconst_0
    //   567: invokestatic O0 : (II)V
    //   570: goto -> 623
    //   573: invokestatic z : ()Lxn1;
    //   576: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   579: invokevirtual p : (Z)V
    //   582: goto -> 616
    //   585: iload_3
    //   586: iconst_1
    //   587: if_icmpne -> 598
    //   590: ldc_w 2131886498
    //   593: iconst_0
    //   594: invokestatic O0 : (II)V
    //   597: return
    //   598: iload_3
    //   599: iconst_3
    //   600: if_icmpne -> 616
    //   603: aload_0
    //   604: invokevirtual r : ()V
    //   607: invokestatic z : ()Lxn1;
    //   610: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   613: invokevirtual p : (Z)V
    //   616: invokestatic z : ()Lxn1;
    //   619: iconst_0
    //   620: invokevirtual l : (I)V
    //   623: aload_0
    //   624: invokevirtual j0 : ()V
    //   627: return
    // Exception table:
    //   from	to	target	type
    //   24	64	88	java/lang/Exception
    //   69	87	88	java/lang/Exception
  }
  
  public final String a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: iconst_1
    //   5: if_icmpne -> 11
    //   8: goto -> 410
    //   11: aload_0
    //   12: getfield i : Lkm0;
    //   15: astore #8
    //   17: aload #8
    //   19: ifnull -> 36
    //   22: aload #8
    //   24: invokestatic y : ()Lkm0;
    //   27: invokevirtual equals : (Ljava/lang/Object;)Z
    //   30: ifeq -> 36
    //   33: goto -> 410
    //   36: aload_0
    //   37: invokevirtual I : ()Z
    //   40: ifeq -> 46
    //   43: goto -> 410
    //   46: aload_0
    //   47: iconst_1
    //   48: iconst_1
    //   49: iconst_1
    //   50: iconst_1
    //   51: anewarray java/lang/String
    //   54: invokevirtual V : (IZZ[Ljava/lang/String;)Lkm0;
    //   57: astore #9
    //   59: aload #9
    //   61: ifnull -> 410
    //   64: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   67: astore #8
    //   69: new m60
    //   72: astore #10
    //   74: aload #10
    //   76: bipush #24
    //   78: invokespecial <init> : (I)V
    //   81: aload_0
    //   82: getfield v : Landroid/os/Handler;
    //   85: astore #12
    //   87: aload #8
    //   89: invokevirtual getClass : ()Ljava/lang/Class;
    //   92: pop
    //   93: aload #9
    //   95: getfield c : Lqn1;
    //   98: getfield f : Lwo;
    //   101: astore #11
    //   103: aload #11
    //   105: ifnull -> 124
    //   108: aload #8
    //   110: aload #11
    //   112: aload #10
    //   114: aload #12
    //   116: invokevirtual l : (Lwo;Lvn1;Landroid/os/Handler;)[F
    //   119: astore #8
    //   121: goto -> 127
    //   124: aconst_null
    //   125: astore #8
    //   127: aload #8
    //   129: ifnull -> 152
    //   132: aload #8
    //   134: arraylength
    //   135: iconst_2
    //   136: if_icmplt -> 152
    //   139: aload #8
    //   141: iconst_0
    //   142: faload
    //   143: fstore_2
    //   144: aload #8
    //   146: iconst_1
    //   147: faload
    //   148: fstore_1
    //   149: goto -> 198
    //   152: aload_0
    //   153: getfield u : Landroid/content/SharedPreferences;
    //   156: ldc_w 'k_f_plyspd4'
    //   159: sipush #10000
    //   162: invokeinterface getInt : (Ljava/lang/String;I)I
    //   167: i2f
    //   168: ldc_w 10000.0
    //   171: fdiv
    //   172: fstore_2
    //   173: aload_0
    //   174: getfield u : Landroid/content/SharedPreferences;
    //   177: ldc_w 'k_f_plyptch4'
    //   180: sipush #10000
    //   183: invokeinterface getInt : (Ljava/lang/String;I)I
    //   188: istore #5
    //   190: iload #5
    //   192: i2f
    //   193: ldc_w 10000.0
    //   196: fdiv
    //   197: fstore_1
    //   198: fconst_1
    //   199: fstore #4
    //   201: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   204: astore #8
    //   206: aload #8
    //   208: ifnull -> 233
    //   211: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   214: ifeq -> 233
    //   217: aload #8
    //   219: invokevirtual E : ()F
    //   222: fstore_3
    //   223: goto -> 235
    //   226: astore #8
    //   228: aload #8
    //   230: invokevirtual printStackTrace : ()V
    //   233: fconst_1
    //   234: fstore_3
    //   235: fload_3
    //   236: fload_2
    //   237: fcmpl
    //   238: ifne -> 410
    //   241: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   244: astore #8
    //   246: fload #4
    //   248: fstore_2
    //   249: aload #8
    //   251: ifnull -> 282
    //   254: fload #4
    //   256: fstore_2
    //   257: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   260: ifeq -> 282
    //   263: aload #8
    //   265: invokevirtual D : ()F
    //   268: fstore_2
    //   269: goto -> 282
    //   272: astore #8
    //   274: aload #8
    //   276: invokevirtual printStackTrace : ()V
    //   279: fload #4
    //   281: fstore_2
    //   282: fload_2
    //   283: fload_1
    //   284: fcmpl
    //   285: ifeq -> 291
    //   288: goto -> 410
    //   291: invokestatic o : ()Landroid/content/SharedPreferences;
    //   294: aload #9
    //   296: invokestatic D0 : (Landroid/content/SharedPreferences;Lkm0;)Z
    //   299: ifeq -> 357
    //   302: aload #9
    //   304: getfield n : J
    //   307: lstore #6
    //   309: lload #6
    //   311: ldc2_w 10000
    //   314: lcmp
    //   315: iflt -> 357
    //   318: lload #6
    //   320: aload #9
    //   322: getfield c : Lqn1;
    //   325: getfield g : I
    //   328: sipush #6000
    //   331: isub
    //   332: i2l
    //   333: lcmp
    //   334: ifge -> 357
    //   337: aload_0
    //   338: getfield u : Landroid/content/SharedPreferences;
    //   341: ldc_w 'k_i_rsb'
    //   344: iconst_1
    //   345: invokeinterface getInt : (Ljava/lang/String;I)I
    //   350: iconst_2
    //   351: if_icmpne -> 357
    //   354: goto -> 410
    //   357: aload #9
    //   359: getfield c : Lqn1;
    //   362: getfield f : Lwo;
    //   365: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   368: astore #9
    //   370: aload #9
    //   372: astore #8
    //   374: aload #9
    //   376: getstatic com/android/billingclient/api/wH/DJqHMztxflt.adYTzIs : Ljava/lang/String;
    //   379: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   382: ifeq -> 407
    //   385: new java/io/File
    //   388: astore #8
    //   390: aload #8
    //   392: aload #9
    //   394: invokespecial <init> : (Ljava/lang/String;)V
    //   397: aload #8
    //   399: invokestatic fromFile : (Ljava/io/File;)Landroid/net/Uri;
    //   402: invokevirtual toString : ()Ljava/lang/String;
    //   405: astore #8
    //   407: aload #8
    //   409: areturn
    //   410: aconst_null
    //   411: areturn
    //   412: astore #8
    //   414: goto -> 410
    // Exception table:
    //   from	to	target	type
    //   0	8	412	finally
    //   11	17	412	finally
    //   22	33	412	finally
    //   36	43	412	finally
    //   46	59	412	finally
    //   64	103	412	finally
    //   108	121	412	finally
    //   132	139	412	finally
    //   152	190	412	finally
    //   201	206	226	finally
    //   211	223	226	finally
    //   228	233	412	finally
    //   241	246	272	finally
    //   257	269	272	finally
    //   274	279	412	finally
    //   291	309	412	finally
    //   318	354	412	finally
    //   357	370	412	finally
    //   374	407	412	finally
  }
  
  public final void a0(long paramLong) {
    if (this.v != null) {
      if (F0 && E0 != null && !this.j) {
        X(new Integer[] { Integer.valueOf(1) });
        this.j = false;
      } 
      L0();
      c0();
      try {
        if (E0 != null) {
          boolean bool = F0;
          if (bool) {
            byte b;
            try {
              long l;
              PlaybackStateCompat playbackStateCompat = ((j01)(ew0.a(MyApplication.i.getApplicationContext())).e).k();
              if (!this.j) {
                l = Math.max(0L, playbackStateCompat.c + (long)(playbackStateCompat.f * (float)(SystemClock.elapsedRealtime() - playbackStateCompat.j)));
              } else {
                l = playbackStateCompat.c;
              } 
            } finally {
              Exception exception = null;
            } 
            int i = b;
            if (b)
              i = E0.A(); 
            z().l(i);
            i0();
          } 
        } 
      } finally {
        Exception exception = null;
      } 
      F0 = false;
      hc hc1 = E0;
      if (hc1 != null)
        hc1.O(); 
      d();
      f01.n = null;
      this.v.removeCallbacks((Runnable)this.H);
      this.v.postDelayed((Runnable)this.H, paramLong);
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null && musicActivity.D) {
        ss0 ss0 = musicActivity.J0;
        if (ss0 != null) {
          ss0.dismiss();
          MusicActivity.R0.J0 = null;
        } 
        MusicActivity musicActivity1 = MusicActivity.R0;
        ms0 ms0 = new ms0((Context)musicActivity1);
        ms0.o(0, true);
        ms0.c(2131887105);
        ms0.J = false;
        ms0.K = false;
        musicActivity1.J0 = ms0.p();
      } 
      EqualizerActivity2.r0();
      SettingsActivity settingsActivity = SettingsActivity.m0;
      if (settingsActivity != null && settingsActivity.D) {
        ss0 ss0 = settingsActivity.c0;
        if (ss0 != null) {
          ss0.dismiss();
          SettingsActivity.m0.c0 = null;
        } 
        SettingsActivity settingsActivity1 = SettingsActivity.m0;
        ms0 ms0 = new ms0((Context)settingsActivity1);
        ms0.o(0, true);
        ms0.c(2131887105);
        ms0.J = false;
        ms0.K = false;
        settingsActivity1.c0 = ms0.p();
      } 
    } 
  }
  
  public final void b0(boolean paramBoolean) {
    try {
      if (E0 == null)
        return; 
      p01 p01 = ew0.a(getApplicationContext());
      if (paramBoolean) {
        boolean bool = C0;
        p01.s(bool);
        m01 m01 = (m01)p01.c;
        int i = ew0.b();
        p01.r(i);
        Bundle bundle = ew0.c(bool, i);
        m01.a.setExtras(bundle);
        MediaSession mediaSession = m01.a;
        if (mediaSession != null) {
          bundle = new Bundle();
          this();
          boolean bool1 = false;
          if (i == 1) {
            i = 1;
          } else {
            i = 0;
          } 
          bundle.putInt("repeat", i);
          i = bool1;
          if (bool == true)
            i = 1; 
          bundle.putInt("shuffle", i);
          mediaSession.sendSessionEvent(ew0.b, bundle);
        } 
        N(p01);
        n21.F("mS>rpS?1");
        E0.L();
        Z();
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void d() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void d0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void e(boolean paramBoolean, float[] paramArrayOffloat) {
    float f1;
    float f2;
    if (g92.P()) {
      f2 = this.u.getInt("k_f_plyspd4", 10000) / 10000.0F;
      f1 = 1.0F;
    } else if (paramArrayOffloat != null && paramArrayOffloat.length >= 2) {
      f2 = paramArrayOffloat[0];
      f1 = paramArrayOffloat[1];
    } else {
      f2 = this.u.getInt("k_f_plyspd4", 10000) / 10000.0F;
      f1 = this.u.getInt("k_f_plyptch4", 10000) / 10000.0F;
    } 
    if (paramBoolean || f2 != 1.0F || f1 != 1.0F || f2 != E0.E() || f1 != E0.D()) {
      E0.b0(f2);
      E0.a0(f1);
    } 
    if (paramBoolean && F0 && this.j)
      E0.M(); 
    if (!this.j && paramBoolean)
      b0(false); 
  }
  
  public final boolean e0(int paramInt, ArrayList<Integer> paramArrayList) {
    int i = paramArrayList.size();
    int j = 0;
    if (i == 0)
      return false; 
    m0(false);
    xn1 xn1 = (MyApplication.h()).b.get(paramInt);
    if (C0) {
      ArrayList<Integer> arrayList = xn1.f();
      for (i = 0; i < paramArrayList.size(); i++)
        paramArrayList.set(i, arrayList.get(((Integer)paramArrayList.get(i)).intValue())); 
    } else {
      xn1.getClass();
    } 
    i = 0;
    boolean bool = false;
    while (i < paramArrayList.size()) {
      int k = ((Integer)paramArrayList.get(i)).intValue();
      xn1.b.set(k, yk1.a);
      if (k == xn1.e)
        bool = true; 
      i++;
    } 
    km0 km01 = yk1.a;
    xn1.getClass();
    xn1.k(km01, C0, false);
    if (bool)
      xn1.g = 0; 
    xn1.k = null;
    if (bool && paramInt == (MyApplication.h()).c) {
      i = 1;
    } else {
      i = 0;
    } 
    if (xn1.i())
      j = t(paramInt) ^ true; 
    MyApplication.h().a();
    if (i != 0) {
      j0();
      return j;
    } 
    if (this.s != null) {
      Handler handler = this.v;
      if (handler != null)
        handler.post((Runnable)new r9(this, 10)); 
    } 
    return j;
  }
  
  public final void f(km0 paramkm0) {
    ArrayList<km0> arrayList = new ArrayList(1);
    arrayList.add(paramkm0);
    g(arrayList);
  }
  
  public final void f0(int paramInt, ArrayList<km0> paramArrayList) {
    if (paramArrayList.size() != 0) {
      boolean bool2 = false;
      m0(false);
      xn1 xn1 = (MyApplication.h()).b.get(paramInt);
      ArrayList<km0> arrayList = xn1.b;
      HashSet<wo> hashSet = new HashSet(paramArrayList.size());
      int i = paramArrayList.size();
      byte b = 0;
      boolean bool1;
      for (bool1 = false; b < i; bool1 = bool) {
        km0 km01 = paramArrayList.get(b);
        boolean bool = bool1;
        if (arrayList.size() > 0) {
          bool = bool1;
          if (km01.equals(arrayList.get(xn1.e)))
            bool = true; 
        } 
        hashSet.add(km01.c.f);
        b++;
      } 
      for (b = 0; b < arrayList.size(); b++) {
        if (hashSet.contains(((km0)arrayList.get(b)).c.f))
          arrayList.set(b, yk1.a); 
      } 
      xn1.k(yk1.a, C0, false);
      if (bool1)
        xn1.g = 0; 
      xn1.k = null;
      b = bool2;
      if (bool1) {
        b = bool2;
        if (paramInt == (MyApplication.h()).c)
          b = 1; 
      } 
      if (xn1.i())
        t(paramInt); 
      MyApplication.h().a();
      if (b != 0) {
        j0();
        return;
      } 
      if (this.s != null) {
        Handler handler = this.v;
        if (handler != null)
          handler.post((Runnable)new r9(this, 11)); 
      } 
    } 
  }
  
  public final void g(ArrayList<?> paramArrayList) {
    if (paramArrayList != null && !paramArrayList.isEmpty()) {
      paramArrayList = new ArrayList(paramArrayList);
      xn1 xn1 = z();
      xn1.getClass();
      boolean bool = xn1.c(paramArrayList, C0, false);
      H0 = true;
      I0 = (MyApplication.h()).c;
      if (bool && (MyApplication.h()).b.size() == 1) {
        if (!MyApplication.o().getBoolean("k_b_dtplim", false) || C() != 0) {
          this.j = false;
          E0.X(false);
        } 
        j0();
      } 
      MusicActivity musicActivity = this.s;
      if (musicActivity != null)
        musicActivity.M0(); 
      b0(true);
      MyApplication.h().a();
      int i = paramArrayList.size();
      ag0.P0(0, getResources().getQuantityString(2131755064, i, new Object[] { Integer.valueOf(i) }), true);
    } 
  }
  
  public final int g0() {
    int i = MyApplication.o().getInt("B_R_AFL", 3);
    this.Z = 0L;
    if (i == 0 || E0 instanceof fl || (i == 1 && !K()))
      return 1; 
    if (Build.VERSION.SDK_INT >= 26) {
      if (this.w0 == null) {
        boolean bool;
        if (i != 3) {
          bool = true;
        } else {
          bool = false;
        } 
        this.w0 = (new AudioFocusRequest.Builder(1)).setAudioAttributes(x()).setWillPauseWhenDucked(bool).setOnAudioFocusChangeListener(this).build();
      } 
      return MyApplication.e().requestAudioFocus(this.w0);
    } 
    return MyApplication.e().requestAudioFocus(this, 3, 1);
  }
  
  public final void h(g paramg) {
    if (c81.c(getApplicationContext()).c(y())) {
      paramg.a(2131231058, "ACT_FAV", getString(2131887162));
    } else {
      paramg.a(2131231057, "ACT_FAV", getString(2131886123));
    } 
    paramg.a(2131231115, "ACTION_CLOSE", getString(2131886364));
  }
  
  public final void h0() {
    try {
      MyApplication.c().cancel(this.C);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final xn1 i(int paramInt, String paramString, ArrayList paramArrayList) {
    MyApplication.h().a();
    if ((MyApplication.h()).b.size() == 1 && z().i())
      (MyApplication.h()).b.clear(); 
    String str = paramString;
    if (paramString == null)
      str = ag0.O(getApplicationContext(), (MyApplication.h()).b); 
    xn1 xn1 = new xn1(paramInt, str, paramArrayList, null);
    (MyApplication.h()).b.push(xn1);
    if ((MyApplication.h()).b.size() > 20) {
      (MyApplication.h()).b.remove(0);
      if ((MyApplication.h()).c == 0) {
        j0();
        Toast.makeText(getApplicationContext(), getString(2131886809, new Object[] { Integer.valueOf(20) }), 1).show();
        return xn1;
      } 
      wk1 wk1 = MyApplication.h();
      wk1.c--;
    } 
    return xn1;
  }
  
  public final void i0() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void j(int paramInt, ArrayList<?> paramArrayList) {
    if (paramArrayList != null && paramArrayList.size() != 0) {
      paramArrayList = new ArrayList(paramArrayList);
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = paramInt;
      xn1 xn1 = (MyApplication.h()).b.get(paramInt);
      boolean bool = xn1.a(paramArrayList, true, 0);
      if ((MyApplication.h()).b.size() > 20) {
        (MyApplication.h()).b.remove(0);
        if ((MyApplication.h()).c == 0) {
          j0();
          Toast.makeText((Context)this, getString(2131886809, new Object[] { Integer.valueOf(20) }), 1).show();
        } else {
          wk1 wk1 = MyApplication.h();
          wk1.c--;
        } 
        arrayOfInt[0] = arrayOfInt[0] - 1;
      } 
      if (bool && paramArrayList.size() == 1)
        xn1.h = ag0.W((km0)paramArrayList.get(0)); 
      if (bool && (MyApplication.h()).b.size() == 1)
        j0(); 
      MusicActivity musicActivity = this.s;
      if (musicActivity != null)
        musicActivity.M0(); 
      b0(true);
      MyApplication.h().a();
      if (!this.i0) {
        paramInt = paramArrayList.size();
        if (arrayOfInt[0] == (MyApplication.h()).c) {
          ag0.P0(0, getResources().getQuantityString(2131755062, paramInt, new Object[] { Integer.valueOf(paramInt) }), true);
        } else {
          ag0.P0(0, getResources().getQuantityString(2131755059, paramInt, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(arrayOfInt[0] + 1) }), true);
        } 
      } 
      this.i0 = false;
    } 
  }
  
  public final void j0() {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
    try {
      n21.F("MSSR:");
      if (V0 != null)
        r(); 
    } finally {
      Exception exception;
    } 
    boolean bool = F0;
    F0 = false;
    l();
    d0();
    Handler handler = this.v;
    if (handler != null)
      handler.removeCallbacks((Runnable)this.g0); 
    if (MyApplication.v != null && this.e0 != null && Looper.myLooper() == Looper.getMainLooper())
      MyApplication.v.b((kt1)this.e0); 
    if (this.k) {
      boolean bool1;
      n21.F("MSSR:CAR");
      this.k = false;
      ag0.O0(2131887454, 1);
      if (MyApplication.s > 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1) {
        this.j = true;
        hc hc1 = E0;
        if (hc1 != null)
          hc1.X(true); 
        this.b = -1L;
        this.h = 0;
        this.i = null;
        jz.f();
      } else {
        stopSelf();
        /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
        return;
      } 
    } 
    this.Z = 0L;
    if (!z().i()) {
      km0 km01 = y();
      if (km01 != null) {
        try {
          String str = ag0.Q0(km01.c.f);
          v0(km01);
          StringBuilder stringBuilder = new StringBuilder();
          this("MSSRP:");
          stringBuilder.append(str);
          n21.F(stringBuilder.toString());
          v00 v00 = v00.q(MyApplication.i.getApplicationContext(), str);
          if (v00.l()) {
            if (!E0.I()) {
              String str1 = v00.j().toString();
              boolean bool1 = str1.equals(E0.b);
              if (bool1 && !bool) {
                /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
                return;
              } 
              E0.P();
              E0.V(str1, true);
              ag0.m.removeCallbacks((Runnable)h1);
            } 
            /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
            return;
          } 
        } finally {}
        n21.F("MSSRN:");
        ag0.O0(2131886562, 0);
        n();
        FileNotFoundException fileNotFoundException = new FileNotFoundException();
        this();
        throw fileNotFoundException;
      } 
    } 
    this.j = true;
    E0.P();
    MusicActivity musicActivity = this.s;
    if (musicActivity != null)
      musicActivity.M0(); 
    if (this.j0) {
      this.j0 = false;
    } else {
      p0();
      D();
    } 
    h0();
    v0(null);
    if (MusicActivity.R0 != null) {
      Handler handler1 = ag0.m;
      l3 l31 = new l3();
      this(5);
      handler1.postDelayed((Runnable)l31, 300L);
    } 
    EqualizerActivity2.m0();
    if (SettingsActivity.m0 != null) {
      Handler handler1 = ag0.m;
      l3 l31 = new l3();
      this(13);
      handler1.postDelayed((Runnable)l31, 300L);
    } 
    EqualizerActivity2 equalizerActivity2 = EqualizerActivity2.q0;
    if (equalizerActivity2 != null && equalizerActivity2.f0)
      equalizerActivity2.f0 = false; 
    QsService.a((Context)this);
    /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
  }
  
  public final void k(ArrayList paramArrayList, int paramInt, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 525
    //   4: aload_1
    //   5: invokevirtual size : ()I
    //   8: ifgt -> 14
    //   11: goto -> 525
    //   14: invokestatic h : ()Lwk1;
    //   17: invokevirtual a : ()V
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: aload_1
    //   25: invokespecial <init> : (Ljava/util/Collection;)V
    //   28: astore #6
    //   30: aload_0
    //   31: iconst_0
    //   32: invokevirtual m0 : (Z)V
    //   35: iconst_0
    //   36: istore #5
    //   38: iload #5
    //   40: invokestatic h : ()Lwk1;
    //   43: getfield b : Ljava/util/Stack;
    //   46: invokevirtual size : ()I
    //   49: if_icmpge -> 85
    //   52: invokestatic h : ()Lwk1;
    //   55: getfield b : Ljava/util/Stack;
    //   58: iload #5
    //   60: invokevirtual get : (I)Ljava/lang/Object;
    //   63: checkcast xn1
    //   66: getfield h : Ljava/lang/String;
    //   69: aload_3
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 79
    //   76: goto -> 88
    //   79: iinc #5, 1
    //   82: goto -> 38
    //   85: iconst_m1
    //   86: istore #5
    //   88: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   91: ifeq -> 124
    //   94: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   97: ifnull -> 124
    //   100: invokestatic z : ()Lxn1;
    //   103: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   106: invokevirtual A : ()I
    //   109: invokevirtual l : (I)V
    //   112: aload_0
    //   113: invokevirtual r : ()V
    //   116: goto -> 124
    //   119: astore_1
    //   120: aload_1
    //   121: invokevirtual printStackTrace : ()V
    //   124: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   127: astore_1
    //   128: aload_1
    //   129: ifnull -> 146
    //   132: aload_1
    //   133: getfield f0 : Llb1;
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull -> 146
    //   141: aload_1
    //   142: iconst_1
    //   143: putfield u0 : Z
    //   146: iload #5
    //   148: iflt -> 392
    //   151: aload #6
    //   153: iload_2
    //   154: invokevirtual get : (I)Ljava/lang/Object;
    //   157: checkcast km0
    //   160: astore_1
    //   161: goto -> 167
    //   164: astore_1
    //   165: aconst_null
    //   166: astore_1
    //   167: invokestatic h : ()Lwk1;
    //   170: getfield b : Ljava/util/Stack;
    //   173: iload #5
    //   175: invokevirtual remove : (I)Ljava/lang/Object;
    //   178: checkcast xn1
    //   181: astore_3
    //   182: invokestatic h : ()Lwk1;
    //   185: getfield b : Ljava/util/Stack;
    //   188: aload_3
    //   189: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   192: pop
    //   193: invokestatic o : ()Landroid/content/SharedPreferences;
    //   196: ldc_w 'k_i_hwqwsnaex'
    //   199: iconst_0
    //   200: invokeinterface getInt : (Ljava/lang/String;I)I
    //   205: ifne -> 242
    //   208: aload_3
    //   209: getfield b : Ljava/util/ArrayList;
    //   212: invokevirtual clear : ()V
    //   215: aload_3
    //   216: getfield c : Ljava/util/ArrayList;
    //   219: astore #7
    //   221: aload #7
    //   223: ifnull -> 231
    //   226: aload #7
    //   228: invokevirtual clear : ()V
    //   231: aload_3
    //   232: iconst_0
    //   233: iconst_0
    //   234: invokevirtual m : (IZ)V
    //   237: aload_3
    //   238: iconst_0
    //   239: putfield g : I
    //   242: aload_0
    //   243: iconst_1
    //   244: putfield i0 : Z
    //   247: aload_3
    //   248: aload #6
    //   250: iload #4
    //   252: iload_2
    //   253: invokevirtual a : (Ljava/util/ArrayList;ZI)Z
    //   256: pop
    //   257: aload_3
    //   258: getfield b : Ljava/util/ArrayList;
    //   261: astore #6
    //   263: aload #6
    //   265: ifnull -> 313
    //   268: iconst_0
    //   269: istore_2
    //   270: iload_2
    //   271: aload #6
    //   273: invokevirtual size : ()I
    //   276: if_icmpge -> 313
    //   279: aload #6
    //   281: iload_2
    //   282: invokevirtual get : (I)Ljava/lang/Object;
    //   285: checkcast km0
    //   288: aload_1
    //   289: invokevirtual equals : (Ljava/lang/Object;)Z
    //   292: ifeq -> 307
    //   295: aload_3
    //   296: iload_2
    //   297: putfield e : I
    //   300: aload_3
    //   301: invokevirtual q : ()V
    //   304: goto -> 313
    //   307: iinc #2, 1
    //   310: goto -> 270
    //   313: aload_3
    //   314: iconst_0
    //   315: invokevirtual l : (I)V
    //   318: invokestatic h : ()Lwk1;
    //   321: invokestatic h : ()Lwk1;
    //   324: getfield b : Ljava/util/Stack;
    //   327: invokevirtual size : ()I
    //   330: iconst_1
    //   331: isub
    //   332: putfield c : I
    //   335: invokestatic h : ()Lwk1;
    //   338: getfield c : I
    //   341: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   344: iconst_1
    //   345: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   348: invokestatic o : ()Landroid/content/SharedPreferences;
    //   351: ldc_w 'k_b_dtplim'
    //   354: iconst_0
    //   355: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   360: ifeq -> 373
    //   363: aload_0
    //   364: invokevirtual C : ()I
    //   367: ifne -> 373
    //   370: goto -> 385
    //   373: aload_0
    //   374: iconst_0
    //   375: putfield j : Z
    //   378: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   381: iconst_0
    //   382: invokevirtual X : (Z)V
    //   385: aload_0
    //   386: invokevirtual j0 : ()V
    //   389: goto -> 525
    //   392: aload_3
    //   393: astore_1
    //   394: aload #6
    //   396: invokevirtual size : ()I
    //   399: iconst_1
    //   400: if_icmpne -> 422
    //   403: aload_3
    //   404: astore_1
    //   405: aload_3
    //   406: ifnonnull -> 422
    //   409: aload #6
    //   411: iconst_0
    //   412: invokevirtual get : (I)Ljava/lang/Object;
    //   415: checkcast km0
    //   418: invokestatic W : (Lkm0;)Ljava/lang/String;
    //   421: astore_1
    //   422: new java/util/ArrayList
    //   425: astore_3
    //   426: aload_3
    //   427: invokespecial <init> : ()V
    //   430: aload_0
    //   431: iload_2
    //   432: aload_1
    //   433: aload_3
    //   434: invokevirtual i : (ILjava/lang/String;Ljava/util/ArrayList;)Lxn1;
    //   437: aload #6
    //   439: iload #4
    //   441: iload_2
    //   442: invokevirtual a : (Ljava/util/ArrayList;ZI)Z
    //   445: pop
    //   446: invokestatic h : ()Lwk1;
    //   449: invokestatic h : ()Lwk1;
    //   452: getfield b : Ljava/util/Stack;
    //   455: invokevirtual size : ()I
    //   458: iconst_1
    //   459: isub
    //   460: putfield c : I
    //   463: invokestatic h : ()Lwk1;
    //   466: getfield c : I
    //   469: putstatic in/krosbits/musicolet/MusicService.I0 : I
    //   472: iconst_1
    //   473: putstatic in/krosbits/musicolet/MusicService.H0 : Z
    //   476: invokestatic o : ()Landroid/content/SharedPreferences;
    //   479: ldc_w 'k_b_dtplim'
    //   482: iconst_0
    //   483: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   488: ifeq -> 501
    //   491: aload_0
    //   492: invokevirtual C : ()I
    //   495: ifne -> 501
    //   498: goto -> 513
    //   501: aload_0
    //   502: iconst_0
    //   503: putfield j : Z
    //   506: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   509: iconst_0
    //   510: invokevirtual X : (Z)V
    //   513: aload_0
    //   514: invokevirtual j0 : ()V
    //   517: goto -> 525
    //   520: astore_1
    //   521: aload_1
    //   522: invokevirtual printStackTrace : ()V
    //   525: return
    // Exception table:
    //   from	to	target	type
    //   88	116	119	finally
    //   124	128	520	finally
    //   132	137	520	finally
    //   141	146	520	finally
    //   151	161	164	finally
    //   167	221	520	finally
    //   226	231	520	finally
    //   231	242	520	finally
    //   242	263	520	finally
    //   270	304	520	finally
    //   313	370	520	finally
    //   373	385	520	finally
    //   385	389	520	finally
    //   394	403	520	finally
    //   409	422	520	finally
    //   422	498	520	finally
    //   501	513	520	finally
    //   513	517	520	finally
  }
  
  public final void k0() {
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.E;
    if (scheduledThreadPoolExecutor != null) {
      scheduledThreadPoolExecutor.remove((Runnable)U0);
      ScheduledFuture scheduledFuture = this.F;
      if (scheduledFuture != null) {
        scheduledFuture.cancel(false);
        this.E.purge();
        this.F = null;
      } 
    } 
  }
  
  public final void l() {
    boolean bool = I();
    this.R = -1;
    this.Q = -1;
    Handler handler = this.v;
    if (handler != null)
      handler.removeCallbacks((Runnable)this.T); 
    if (bool)
      E0.L(); 
  }
  
  public final void l0(int paramInt) {
    if (paramInt == (MyApplication.h()).c && E0.J()) {
      ag0.O0(2131887499, 0);
      return;
    } 
    m0(false);
    if (F0)
      z().l(E0.A()); 
    xn1 xn1 = (MyApplication.h()).b.remove(paramInt);
    (MyApplication.h()).b.push(xn1);
    if (xn1.i()) {
      ag0.O0(2131886490, 0);
      return;
    } 
    (MyApplication.h()).c = (MyApplication.h()).b.size() - 1;
    H0 = true;
    I0 = (MyApplication.h()).b.size() - 1;
    MyApplication.h().a();
    if (!MyApplication.o().getBoolean("k_b_dtplim", false) || C() != 0) {
      this.j = false;
      E0.X(false);
    } 
    j0();
    ag0.O0(2131887501, 0);
  }
  
  public final void m0(boolean paramBoolean) {
    try {
      km0 km01 = ((xn1)(MyApplication.h()).b.get((MyApplication.h()).c)).d();
      if (km01 != null && ag0.D0(this.u, km01) && F0) {
        int j = E0.A();
        int i = j;
        if (j > km01.c.g - 6000)
          i = 0; 
        if (i >= 10000)
          MyApplication.j.u(km01, i, paramBoolean); 
      } 
    } finally {
      Exception exception;
    } 
  }
  
  public final void n() {
    if ((MyApplication.j()).length > 0) {
      MusicActivity musicActivity = this.s;
      if (musicActivity != null)
        musicActivity.m0(); 
      stopSelf();
      MyApplication.A();
    } 
  }
  
  public final boolean n0() {
    try {
      if (this.x0 != D0 && J0 == 0) {
        ow ow1 = K0;
        if (ow1 != null) {
          boolean bool = ow1.a;
          if (bool)
            return true; 
        } 
      } 
    } finally {
      Exception exception;
    } 
    return false;
  }
  
  public final boolean o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   5: istore_3
    //   6: invokestatic j : ()I
    //   9: putstatic in/krosbits/musicolet/MusicService.D0 : I
    //   12: new java/lang/StringBuilder
    //   15: astore #6
    //   17: aload #6
    //   19: ldc_w 'MSCAP>'
    //   22: invokespecial <init> : (Ljava/lang/String;)V
    //   25: aload #6
    //   27: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   30: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload #6
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokestatic F : (Ljava/lang/String;)V
    //   42: getstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   45: ifeq -> 288
    //   48: iload_3
    //   49: iflt -> 288
    //   52: iload_3
    //   53: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   56: if_icmpeq -> 288
    //   59: aload_0
    //   60: iconst_m1
    //   61: putfield x0 : I
    //   64: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   67: invokevirtual z : ()I
    //   70: istore_1
    //   71: iload_1
    //   72: ifle -> 93
    //   75: iload_1
    //   76: iconst_3
    //   77: invokestatic getNativeOutputSampleRate : (I)I
    //   80: if_icmpeq -> 93
    //   83: iconst_1
    //   84: istore_1
    //   85: goto -> 95
    //   88: astore #6
    //   90: goto -> 292
    //   93: iconst_0
    //   94: istore_1
    //   95: invokestatic h : ()I
    //   98: istore #5
    //   100: iload_1
    //   101: istore_2
    //   102: iload #5
    //   104: ifne -> 245
    //   107: iload_3
    //   108: iload #5
    //   110: invokestatic i : (II)I
    //   113: istore #4
    //   115: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   118: iload #5
    //   120: invokestatic i : (II)I
    //   123: istore #5
    //   125: invokestatic b : ()Lf01;
    //   128: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   131: invokestatic s : (I)Z
    //   134: iconst_0
    //   135: invokevirtual e : (ZZ)Z
    //   138: ifeq -> 149
    //   141: ldc_w 'mcSR!'
    //   144: invokestatic F : (Ljava/lang/String;)V
    //   147: iconst_1
    //   148: istore_1
    //   149: iload_1
    //   150: istore_2
    //   151: iload #4
    //   153: iload #5
    //   155: if_icmpeq -> 245
    //   158: iload #4
    //   160: ifeq -> 192
    //   163: iload #5
    //   165: ifne -> 171
    //   168: goto -> 192
    //   171: ldc_w 'bcSR!'
    //   174: invokestatic F : (Ljava/lang/String;)V
    //   177: invokestatic b : ()Lf01;
    //   180: iload #5
    //   182: invokevirtual d : (I)V
    //   185: iconst_0
    //   186: istore_1
    //   187: iconst_1
    //   188: istore_2
    //   189: goto -> 247
    //   192: ldc_w 'bcFR!'
    //   195: invokestatic F : (Ljava/lang/String;)V
    //   198: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   201: iconst_1
    //   202: if_icmpne -> 231
    //   205: iload_3
    //   206: ldc_w 40000
    //   209: if_icmpge -> 227
    //   212: iload_3
    //   213: iconst_2
    //   214: if_icmpeq -> 227
    //   217: iload_3
    //   218: iconst_3
    //   219: if_icmpeq -> 227
    //   222: iload_3
    //   223: iconst_5
    //   224: if_icmpne -> 231
    //   227: aload_0
    //   228: invokevirtual O : ()V
    //   231: aload_0
    //   232: ldc2_w 300
    //   235: invokevirtual a0 : (J)V
    //   238: iconst_0
    //   239: istore_2
    //   240: iconst_1
    //   241: istore_1
    //   242: goto -> 247
    //   245: iconst_0
    //   246: istore_1
    //   247: aload_0
    //   248: iconst_0
    //   249: putfield n : Z
    //   252: aload_0
    //   253: iconst_0
    //   254: putfield m : Z
    //   257: iload_1
    //   258: ifne -> 265
    //   261: aload_0
    //   262: invokevirtual Q : ()V
    //   265: iload_1
    //   266: ifne -> 279
    //   269: iload_2
    //   270: ifeq -> 279
    //   273: invokestatic b : ()Lf01;
    //   276: invokevirtual g : ()V
    //   279: aload_0
    //   280: iconst_0
    //   281: putfield Y : Z
    //   284: aload_0
    //   285: monitorexit
    //   286: iconst_1
    //   287: ireturn
    //   288: aload_0
    //   289: monitorexit
    //   290: iconst_0
    //   291: ireturn
    //   292: aload_0
    //   293: monitorexit
    //   294: aload #6
    //   296: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	88	finally
    //   52	71	88	finally
    //   75	83	88	finally
    //   95	100	88	finally
    //   107	125	88	finally
    //   125	147	88	finally
    //   171	185	88	finally
    //   192	205	88	finally
    //   227	231	88	finally
    //   231	238	88	finally
    //   247	257	88	finally
    //   261	265	88	finally
    //   273	279	88	finally
    //   279	284	88	finally
    //   292	294	88	finally
  }
  
  public final void o0() {
    try {
      Handler handler = this.v;
      r9 r91 = this.o;
      if (handler != null)
        handler.removeCallbacks((Runnable)r91); 
      if (Q0 > 0L) {
        if (System.currentTimeMillis() - Q0 > 50000L)
          p0(); 
      } else {
        Q0 = System.currentTimeMillis();
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void onAudioFocusChange(int paramInt) {
    P(paramInt, true);
  }
  
  public final IBinder onBind(Intent paramIntent) {
    return (IBinder)new Binder();
  }
  
  public final void onCreate() {
    super.onCreate();
    this.v = new Handler(getMainLooper());
    this.u = MyApplication.o();
    this.N = L();
    if (MyApplication.w != 4) {
      cn cn = cn.o((Context)this);
      IntentFilter intentFilter = new IntentFilter("ACTASCH");
      cn.t((BroadcastReceiver)this.o0, intentFilter);
    } 
  }
  
  public final void onDestroy() {
    P0 = null;
    FileUtilsActivity.V = false;
    cn.o(getApplicationContext()).C((BroadcastReceiver)this.o0);
    try {
      PowerManager.WakeLock wakeLock = ws2.j;
    } finally {
      Exception exception = null;
    } 
    b1.removeCallbacks((Runnable)c1);
    C0(false);
    this.Z = 0L;
    try {
      if (Build.VERSION.SDK_INT >= 26) {
        stopForeground(2);
      } else {
        stopForeground(false);
      } 
    } finally {
      Exception exception;
    } 
    (new z21(getApplicationContext())).b(100);
    Handler handler2 = ag0.m;
    hi hi1 = h1;
    handler2.postDelayed((Runnable)hi1, 2000L);
    handler2.postDelayed((Runnable)hi1, 5300L);
    if (!this.w) {
      super.onDestroy();
      return;
    } 
    if (F0 && !this.j && E0 != null)
      X(new Integer[] { Integer.valueOf(1) }); 
    LockScreenReceiver lockScreenReceiver = this.h0;
    if (lockScreenReceiver != null) {
      unregisterReceiver(lockScreenReceiver);
      this.h0 = null;
    } 
    if (G0) {
      r();
      if (F0) {
        m0(false);
        z().l(E0.A());
      } 
      E0.O();
      E0 = null;
    } 
    c0();
    L0();
    G0 = false;
    F0 = false;
    d0();
    Handler handler1 = this.v;
    if (handler1 != null)
      handler1.removeCallbacksAndMessages(null); 
    MusicActivity musicActivity = this.s;
    if (musicActivity != null) {
      musicActivity.m0();
      this.s = null;
    } 
    GhostSearchActivity.l0();
    d();
    D();
    MyApplication.c();
    if (this.C != null)
      MyApplication.c().cancel(this.C); 
    if (this.D != null)
      MyApplication.c().cancel(this.D); 
    k0();
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.E;
    if (scheduledThreadPoolExecutor != null)
      scheduledThreadPoolExecutor.shutdownNow(); 
    SharedPreferences sharedPreferences = this.u;
    if (sharedPreferences != null) {
      sharedPreferences.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this.z);
      this.z = null;
    } 
    Q0(MyApplication.i.getApplicationContext());
    LockScreenActivity lockScreenActivity = LockScreenActivity.a1;
    if (lockScreenActivity != null) {
      lockScreenActivity.F0 = false;
      lockScreenActivity.finish();
    } 
    QsService.a((Context)this);
    this.O = true;
    if (Build.VERSION.SDK_INT < 26)
      try {
        Intent intent = new Intent();
        this((Context)this, TaskSaviour.class);
        startService(intent);
      } finally {} 
    p0();
    v61 v61 = MyApplication.v;
    if (v61 != null) {
      v61.b((kt1)this.e0);
      MyApplication.v.b((kt1)this.d0);
    } 
    this.d0 = null;
    b71 b711 = this.e0;
    if (b711 != null)
      b711.b[0] = true; 
    this.e0 = null;
    my0.a();
    MyReceiver myReceiver = this.r0;
    if (myReceiver != null)
      try {
        unregisterReceiver(myReceiver);
      } finally {
        myReceiver = null;
      }  
    this.r0 = null;
    c70 c701 = this.q0;
    if (c701 != null) {
      unregisterReceiver((BroadcastReceiver)c701);
      this.q0 = null;
    } 
    hz0 hz01 = this.M;
    if (hz01 != null)
      unregisterReceiver((BroadcastReceiver)hz01); 
    this.M = null;
    iv0 iv0 = iv0.d((Context)this);
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      MediaRouter2.getInstance(getApplicationContext()).unregisterRouteCallback((MediaRouter2.RouteCallback)this.u0);
    } else {
      iv0.j((dv0)this.t0);
    } 
    iv0.b();
    (iv0.c()).f = null;
    if (this.A0 != null) {
      bh0 bh01 = this.z0;
      if (bh01 != null) {
        bl1 bl11 = this.y0;
        if (bl11 != null) {
          bl11.e((cl1)bh01, oj.class);
          this.y0 = null;
        } 
      } 
      of of1 = this.B0;
      if (of1.b()) {
        iv0.d(MyApplication.i.getApplicationContext());
        iv0.m(1);
      } 
      of1.d(null);
    } 
    if (i >= 31) {
      iz0 iz01 = this.v0;
      if (iz01 != null)
        MyApplication.e().removeOnModeChangedListener((AudioManager.OnModeChangedListener)iz01); 
    } 
    zo2.c();
    v0(null);
    this.u = null;
    this.v = null;
    this.c0 = null;
    this.L = null;
    this.f0 = null;
    this.H = null;
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 'MSSSC:'
    //   7: invokespecial <init> : (Ljava/lang/String;)V
    //   10: astore #17
    //   12: aload #17
    //   14: aload_1
    //   15: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload #17
    //   21: invokevirtual toString : ()Ljava/lang/String;
    //   24: invokestatic F : (Ljava/lang/String;)V
    //   27: getstatic in/krosbits/musicolet/MyApplication.w : I
    //   30: istore #7
    //   32: iconst_1
    //   33: istore #4
    //   35: iconst_1
    //   36: istore #6
    //   38: iconst_4
    //   39: istore #5
    //   41: iload #7
    //   43: iconst_4
    //   44: if_icmpeq -> 197
    //   47: iload #7
    //   49: iconst_m1
    //   50: if_icmpeq -> 197
    //   53: aload_1
    //   54: ifnull -> 197
    //   57: aload_0
    //   58: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   61: astore #18
    //   63: aload_0
    //   64: getfield n0 : Ljava/util/LinkedList;
    //   67: astore #17
    //   69: aload #17
    //   71: aload #18
    //   73: aload #17
    //   75: invokevirtual size : ()I
    //   78: aload_1
    //   79: ldc_w 1107296256
    //   82: invokestatic getService : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   85: invokevirtual add : (Ljava/lang/Object;)Z
    //   88: pop
    //   89: new java/lang/StringBuilder
    //   92: dup
    //   93: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.lsHTm : Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: astore #17
    //   101: aload #17
    //   103: getstatic in/krosbits/musicolet/MyApplication.n : Landroid/app/Notification;
    //   106: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload #17
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: invokestatic F : (Ljava/lang/String;)V
    //   118: getstatic in/krosbits/musicolet/MyApplication.n : Landroid/app/Notification;
    //   121: ifnull -> 155
    //   124: getstatic in/krosbits/musicolet/MyApplication.o : Z
    //   127: ifne -> 155
    //   130: new z21
    //   133: dup
    //   134: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   137: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   140: invokespecial <init> : (Landroid/content/Context;)V
    //   143: bipush #120
    //   145: getstatic in/krosbits/musicolet/MyApplication.n : Landroid/app/Notification;
    //   148: invokevirtual c : (ILandroid/app/Notification;)V
    //   151: iconst_1
    //   152: putstatic in/krosbits/musicolet/MyApplication.o : Z
    //   155: getstatic ws2.j : Landroid/os/PowerManager$WakeLock;
    //   158: astore #17
    //   160: aload #17
    //   162: ifnull -> 189
    //   165: aload #17
    //   167: invokevirtual isHeld : ()Z
    //   170: ifeq -> 189
    //   173: getstatic ws2.j : Landroid/os/PowerManager$WakeLock;
    //   176: invokevirtual release : ()V
    //   179: goto -> 189
    //   182: astore #17
    //   184: aload #17
    //   186: invokevirtual printStackTrace : ()V
    //   189: aload_0
    //   190: aload_1
    //   191: iload_2
    //   192: iload_3
    //   193: invokespecial onStartCommand : (Landroid/content/Intent;II)I
    //   196: ireturn
    //   197: iload #7
    //   199: iconst_m1
    //   200: if_icmpne -> 211
    //   203: aload_0
    //   204: aload_1
    //   205: iload_2
    //   206: iload_3
    //   207: invokespecial onStartCommand : (Landroid/content/Intent;II)I
    //   210: ireturn
    //   211: aload_1
    //   212: ifnull -> 2476
    //   215: getstatic android/os/Build$VERSION.SDK_INT : I
    //   218: istore #9
    //   220: iconst_0
    //   221: istore #7
    //   223: iconst_0
    //   224: istore_3
    //   225: iconst_0
    //   226: istore #8
    //   228: iload #9
    //   230: bipush #26
    //   232: if_icmplt -> 244
    //   235: aload_1
    //   236: ldc_w 'EXT_NFG'
    //   239: iconst_0
    //   240: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   243: pop
    //   244: aload_1
    //   245: invokevirtual getAction : ()Ljava/lang/String;
    //   248: astore #17
    //   250: aload #17
    //   252: ldc_w 'ACTION_INIT'
    //   255: invokevirtual equals : (Ljava/lang/Object;)Z
    //   258: ifeq -> 290
    //   261: aload_0
    //   262: invokevirtual H : ()V
    //   265: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   268: astore_1
    //   269: aload_1
    //   270: ifnull -> 2476
    //   273: aload_1
    //   274: invokevirtual isFinishing : ()Z
    //   277: ifne -> 2476
    //   280: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   283: aload_0
    //   284: invokevirtual u0 : (Lin/krosbits/musicolet/MusicService;)V
    //   287: goto -> 2476
    //   290: aload #17
    //   292: ldc_w 'ACTION_NEXT'
    //   295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   298: ifeq -> 325
    //   301: aload_0
    //   302: aload_1
    //   303: ldc_w 'EXT_DIP'
    //   306: iconst_1
    //   307: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   310: aload_1
    //   311: ldc_w 'EXT_IFOAU'
    //   314: iconst_1
    //   315: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   318: iconst_0
    //   319: invokevirtual S : (ZZZ)V
    //   322: goto -> 2476
    //   325: aload #17
    //   327: ldc_w 'ACTION_PREV'
    //   330: invokevirtual equals : (Ljava/lang/Object;)Z
    //   333: ifeq -> 360
    //   336: aload_0
    //   337: aload_1
    //   338: ldc_w 'EXT_DIP'
    //   341: iconst_1
    //   342: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   345: aload_1
    //   346: ldc_w 'EXT_IFOAU'
    //   349: iconst_1
    //   350: invokevirtual getBooleanExtra : (Ljava/lang/String;Z)Z
    //   353: iconst_0
    //   354: invokevirtual T : (ZZZ)V
    //   357: goto -> 2476
    //   360: aload #17
    //   362: ldc_w 'ACTION_PLAY_PAUSE'
    //   365: invokevirtual equals : (Ljava/lang/Object;)Z
    //   368: ifeq -> 382
    //   371: aload_0
    //   372: iconst_0
    //   373: anewarray java/lang/Integer
    //   376: invokevirtual X : ([Ljava/lang/Integer;)V
    //   379: goto -> 2476
    //   382: aload #17
    //   384: ldc_w 'ACTION_PLAY'
    //   387: invokevirtual equals : (Ljava/lang/Object;)Z
    //   390: ifeq -> 422
    //   393: aload_0
    //   394: getfield w : Z
    //   397: ifne -> 404
    //   400: aload_0
    //   401: invokevirtual H : ()V
    //   404: aload_0
    //   405: getfield j : Z
    //   408: ifeq -> 2476
    //   411: aload_0
    //   412: iconst_0
    //   413: anewarray java/lang/Integer
    //   416: invokevirtual X : ([Ljava/lang/Integer;)V
    //   419: goto -> 2476
    //   422: aload #17
    //   424: ldc_w 'ACTION_PLAY_BL'
    //   427: invokevirtual equals : (Ljava/lang/Object;)Z
    //   430: ifeq -> 489
    //   433: aload_0
    //   434: getfield w : Z
    //   437: ifne -> 444
    //   440: aload_0
    //   441: invokevirtual H : ()V
    //   444: aload_0
    //   445: getfield j : Z
    //   448: ifeq -> 2476
    //   451: aload_0
    //   452: invokevirtual o : ()Z
    //   455: pop
    //   456: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   459: invokestatic v : (I)Z
    //   462: ifeq -> 481
    //   465: aload_0
    //   466: iconst_0
    //   467: putfield Y : Z
    //   470: aload_0
    //   471: iconst_0
    //   472: anewarray java/lang/Integer
    //   475: invokevirtual X : ([Ljava/lang/Integer;)V
    //   478: goto -> 2476
    //   481: aload_0
    //   482: iconst_1
    //   483: putfield Y : Z
    //   486: goto -> 2476
    //   489: aload #17
    //   491: ldc_w 'ACTION_PAUSE'
    //   494: invokevirtual equals : (Ljava/lang/Object;)Z
    //   497: ifeq -> 529
    //   500: aload_0
    //   501: getfield w : Z
    //   504: ifne -> 511
    //   507: aload_0
    //   508: invokevirtual stopSelf : ()V
    //   511: aload_0
    //   512: getfield j : Z
    //   515: ifne -> 2476
    //   518: aload_0
    //   519: iconst_0
    //   520: anewarray java/lang/Integer
    //   523: invokevirtual X : ([Ljava/lang/Integer;)V
    //   526: goto -> 2476
    //   529: aload #17
    //   531: ldc_w 'ACTION_SEEK'
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 569
    //   540: aload_1
    //   541: ldc_w 'EXTRA_SEEKMILL'
    //   544: ldc2_w -1
    //   547: invokevirtual getLongExtra : (Ljava/lang/String;J)J
    //   550: lstore #10
    //   552: lload #10
    //   554: lconst_0
    //   555: lcmp
    //   556: iflt -> 2476
    //   559: aload_0
    //   560: lload #10
    //   562: l2i
    //   563: invokevirtual t0 : (I)V
    //   566: goto -> 2476
    //   569: aload #17
    //   571: ldc_w 'ACTION_WQJTS'
    //   574: invokevirtual equals : (Ljava/lang/Object;)Z
    //   577: ifeq -> 646
    //   580: aload_1
    //   581: ldc_w 'E_WQSI'
    //   584: iconst_m1
    //   585: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   588: istore_2
    //   589: aload_0
    //   590: getfield w : Z
    //   593: ifne -> 606
    //   596: aload_0
    //   597: invokevirtual H : ()V
    //   600: invokestatic h : ()Lwk1;
    //   603: invokevirtual b : ()V
    //   606: invokestatic z : ()Lxn1;
    //   609: astore_1
    //   610: aload_1
    //   611: invokevirtual i : ()Z
    //   614: ifne -> 2476
    //   617: iload_2
    //   618: iflt -> 2476
    //   621: iload_2
    //   622: aload_1
    //   623: getfield b : Ljava/util/ArrayList;
    //   626: invokevirtual size : ()I
    //   629: if_icmpge -> 2476
    //   632: aload_0
    //   633: invokestatic h : ()Lwk1;
    //   636: getfield c : I
    //   639: iload_2
    //   640: invokevirtual x0 : (II)V
    //   643: goto -> 2476
    //   646: aload #17
    //   648: ldc_w 'ACTION_HSH'
    //   651: invokevirtual equals : (Ljava/lang/Object;)Z
    //   654: istore #16
    //   656: iconst_3
    //   657: istore_2
    //   658: iload #16
    //   660: ifeq -> 975
    //   663: aload_1
    //   664: ldc_w 'EXTRA_KA'
    //   667: iconst_m1
    //   668: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   671: istore_2
    //   672: aload_0
    //   673: getfield w : Z
    //   676: ifne -> 683
    //   679: aload_0
    //   680: invokevirtual H : ()V
    //   683: aload_0
    //   684: getfield v : Landroid/os/Handler;
    //   687: ifnonnull -> 693
    //   690: goto -> 2476
    //   693: iload_2
    //   694: iconst_1
    //   695: if_icmpne -> 701
    //   698: goto -> 2476
    //   701: iload_2
    //   702: ifne -> 2476
    //   705: aload_0
    //   706: getfield J : I
    //   709: iconst_2
    //   710: if_icmplt -> 721
    //   713: ldc2_w 3500
    //   716: lstore #10
    //   718: goto -> 726
    //   721: ldc2_w 700
    //   724: lstore #10
    //   726: invokestatic currentTimeMillis : ()J
    //   729: lstore #12
    //   731: aload_0
    //   732: getfield I : J
    //   735: lstore #14
    //   737: aload_0
    //   738: getfield K : Lr9;
    //   741: astore_1
    //   742: lload #12
    //   744: lload #14
    //   746: lsub
    //   747: lload #10
    //   749: lcmp
    //   750: ifge -> 936
    //   753: aload_0
    //   754: getfield v : Landroid/os/Handler;
    //   757: aload_0
    //   758: getfield c0 : Lgz0;
    //   761: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   764: aload_0
    //   765: getfield v : Landroid/os/Handler;
    //   768: aload_0
    //   769: getfield L : Lgz0;
    //   772: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   775: aload_0
    //   776: getfield v : Landroid/os/Handler;
    //   779: aload_1
    //   780: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   783: aload_0
    //   784: getfield v : Landroid/os/Handler;
    //   787: aload_0
    //   788: getfield f0 : Lr9;
    //   791: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   794: aload_0
    //   795: getfield J : I
    //   798: iconst_1
    //   799: iadd
    //   800: istore_2
    //   801: aload_0
    //   802: iload_2
    //   803: putfield J : I
    //   806: iload_2
    //   807: iconst_2
    //   808: if_icmpne -> 858
    //   811: aload_0
    //   812: getfield u : Landroid/content/SharedPreferences;
    //   815: aload_0
    //   816: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   819: ldc_w 2131886709
    //   822: invokevirtual getString : (I)Ljava/lang/String;
    //   825: ldc_w '2'
    //   828: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   833: invokestatic parseInt : (Ljava/lang/String;)I
    //   836: istore_2
    //   837: iload_2
    //   838: ifeq -> 919
    //   841: aload_0
    //   842: getfield v : Landroid/os/Handler;
    //   845: aload_0
    //   846: getfield c0 : Lgz0;
    //   849: lload #10
    //   851: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   854: pop
    //   855: goto -> 919
    //   858: iload_2
    //   859: iconst_1
    //   860: if_icmpne -> 910
    //   863: aload_0
    //   864: getfield u : Landroid/content/SharedPreferences;
    //   867: aload_0
    //   868: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   871: ldc_w 2131886708
    //   874: invokevirtual getString : (I)Ljava/lang/String;
    //   877: ldc_w '1'
    //   880: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   885: invokestatic parseInt : (Ljava/lang/String;)I
    //   888: istore_2
    //   889: iload_2
    //   890: ifeq -> 919
    //   893: aload_0
    //   894: getfield v : Landroid/os/Handler;
    //   897: aload_0
    //   898: getfield L : Lgz0;
    //   901: lload #10
    //   903: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   906: pop
    //   907: goto -> 919
    //   910: iload_2
    //   911: iconst_3
    //   912: if_icmplt -> 919
    //   915: aload_0
    //   916: invokevirtual s0 : ()V
    //   919: aload_0
    //   920: getfield v : Landroid/os/Handler;
    //   923: aload_0
    //   924: getfield f0 : Lr9;
    //   927: lload #10
    //   929: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   932: pop
    //   933: goto -> 966
    //   936: invokestatic z : ()Lxn1;
    //   939: invokevirtual i : ()Z
    //   942: ifeq -> 955
    //   945: aload_0
    //   946: ldc_w 'musicolet.media.r.2'
    //   949: invokestatic d : (Lin/krosbits/musicolet/MusicService;Ljava/lang/String;)V
    //   952: goto -> 2476
    //   955: aload_0
    //   956: getfield v : Landroid/os/Handler;
    //   959: aload_1
    //   960: lload #10
    //   962: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   965: pop
    //   966: aload_0
    //   967: lload #12
    //   969: putfield I : J
    //   972: goto -> 2476
    //   975: aload #17
    //   977: ldc_w 'ACTION_CLOSE'
    //   980: invokevirtual equals : (Ljava/lang/Object;)Z
    //   983: ifeq -> 1026
    //   986: aload_0
    //   987: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   990: astore_1
    //   991: aload_1
    //   992: ifnull -> 999
    //   995: aload_1
    //   996: invokevirtual m0 : ()V
    //   999: iload #9
    //   1001: bipush #26
    //   1003: if_icmplt -> 1014
    //   1006: aload_0
    //   1007: iconst_2
    //   1008: invokevirtual stopForeground : (I)V
    //   1011: goto -> 1019
    //   1014: aload_0
    //   1015: iconst_0
    //   1016: invokevirtual stopForeground : (Z)V
    //   1019: aload_0
    //   1020: invokevirtual stopSelf : ()V
    //   1023: goto -> 2476
    //   1026: aload #17
    //   1028: ldc_w 'ACT_NOTCL'
    //   1031: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1034: ifeq -> 1106
    //   1037: aload_0
    //   1038: getfield w : Z
    //   1041: ifeq -> 2476
    //   1044: getstatic in/krosbits/musicolet/MyApplication.s : I
    //   1047: ifle -> 1056
    //   1050: iload #6
    //   1052: istore_2
    //   1053: goto -> 1058
    //   1056: iconst_0
    //   1057: istore_2
    //   1058: iload_2
    //   1059: ifne -> 2476
    //   1062: aload_0
    //   1063: getfield j : Z
    //   1066: ifne -> 1072
    //   1069: goto -> 2476
    //   1072: new android/content/Intent
    //   1075: astore_1
    //   1076: aload_1
    //   1077: aload_0
    //   1078: ldc in/krosbits/musicolet/MusicService
    //   1080: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1083: aload_0
    //   1084: aload_1
    //   1085: ldc_w 'ACTION_CLOSE'
    //   1088: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1091: invokevirtual startService : (Landroid/content/Intent;)Landroid/content/ComponentName;
    //   1094: pop
    //   1095: goto -> 2476
    //   1098: astore_1
    //   1099: aload_1
    //   1100: invokevirtual printStackTrace : ()V
    //   1103: goto -> 2476
    //   1106: aload #17
    //   1108: ldc_w 'android.media.AUDIO_BECOMING_NOISY'
    //   1111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1114: ifeq -> 1124
    //   1117: aload_0
    //   1118: invokevirtual O : ()V
    //   1121: goto -> 2476
    //   1124: aload #17
    //   1126: ldc_w 'a_atcl'
    //   1129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1132: ifeq -> 1213
    //   1135: getstatic in/krosbits/musicolet/MyApplication.s : I
    //   1138: ifle -> 1144
    //   1141: goto -> 2476
    //   1144: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   1147: ifeq -> 1166
    //   1150: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   1153: ifnull -> 1166
    //   1156: aload_0
    //   1157: getfield j : Z
    //   1160: ifne -> 1166
    //   1163: goto -> 2476
    //   1166: aload_0
    //   1167: getfield w : Z
    //   1170: ifeq -> 1193
    //   1173: aload_0
    //   1174: getfield x : Z
    //   1177: ifeq -> 1193
    //   1180: invokestatic K : ()Z
    //   1183: ifeq -> 1193
    //   1186: aload_0
    //   1187: invokevirtual h0 : ()V
    //   1190: goto -> 2476
    //   1193: aload_0
    //   1194: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   1197: astore_1
    //   1198: aload_1
    //   1199: ifnull -> 1206
    //   1202: aload_1
    //   1203: invokevirtual m0 : ()V
    //   1206: aload_0
    //   1207: invokevirtual stopSelf : ()V
    //   1210: goto -> 2476
    //   1213: aload #17
    //   1215: ldc_w 'a_sltmcl'
    //   1218: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1221: ifeq -> 1366
    //   1224: aload_0
    //   1225: getfield f : Z
    //   1228: ifeq -> 1290
    //   1231: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   1234: ifeq -> 1290
    //   1237: aload_0
    //   1238: getfield j : Z
    //   1241: ifne -> 1290
    //   1244: aload_0
    //   1245: iconst_0
    //   1246: putfield f : Z
    //   1249: aload_0
    //   1250: ldc2_w -1
    //   1253: putfield b : J
    //   1256: aload_0
    //   1257: iconst_1
    //   1258: putfield h : I
    //   1261: aload_0
    //   1262: aconst_null
    //   1263: putfield i : Lkm0;
    //   1266: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   1269: invokevirtual L : ()V
    //   1272: invokestatic f : ()Z
    //   1275: pop
    //   1276: aload_0
    //   1277: getfield g : Z
    //   1280: ifeq -> 2476
    //   1283: aload_0
    //   1284: invokevirtual u : ()V
    //   1287: goto -> 2476
    //   1290: aload_0
    //   1291: ldc_w 2131887454
    //   1294: iconst_1
    //   1295: invokestatic makeText : (Landroid/content/Context;II)Landroid/widget/Toast;
    //   1298: invokevirtual show : ()V
    //   1301: aload_0
    //   1302: ldc2_w -1
    //   1305: putfield b : J
    //   1308: aload_0
    //   1309: iconst_0
    //   1310: putfield h : I
    //   1313: aload_0
    //   1314: aconst_null
    //   1315: putfield i : Lkm0;
    //   1318: invokestatic f : ()Z
    //   1321: pop
    //   1322: getstatic in/krosbits/musicolet/MyApplication.s : I
    //   1325: ifle -> 1346
    //   1328: aload_0
    //   1329: getfield j : Z
    //   1332: ifne -> 1346
    //   1335: aload_0
    //   1336: iconst_0
    //   1337: anewarray java/lang/Integer
    //   1340: invokevirtual X : ([Ljava/lang/Integer;)V
    //   1343: goto -> 2476
    //   1346: aload_0
    //   1347: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   1350: astore_1
    //   1351: aload_1
    //   1352: ifnull -> 1359
    //   1355: aload_1
    //   1356: invokevirtual m0 : ()V
    //   1359: aload_0
    //   1360: invokevirtual stopSelf : ()V
    //   1363: goto -> 2476
    //   1366: aload #17
    //   1368: ldc_w 'AF10'
    //   1371: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1374: ifeq -> 1395
    //   1377: aload_0
    //   1378: getfield w : Z
    //   1381: ifne -> 1388
    //   1384: aload_0
    //   1385: invokevirtual H : ()V
    //   1388: aload_0
    //   1389: invokevirtual s0 : ()V
    //   1392: goto -> 2476
    //   1395: aload #17
    //   1397: ldc_w 'AR10'
    //   1400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1403: ifeq -> 1424
    //   1406: aload_0
    //   1407: getfield w : Z
    //   1410: ifne -> 1417
    //   1413: aload_0
    //   1414: invokevirtual H : ()V
    //   1417: aload_0
    //   1418: invokevirtual r0 : ()V
    //   1421: goto -> 2476
    //   1424: ldc_w 'musicolet.media.r.1'
    //   1427: aload #17
    //   1429: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1432: ifeq -> 1483
    //   1435: aload_0
    //   1436: getfield w : Z
    //   1439: ifne -> 1446
    //   1442: aload_0
    //   1443: invokevirtual H : ()V
    //   1446: invokestatic z : ()Lxn1;
    //   1449: invokevirtual i : ()Z
    //   1452: ifeq -> 1465
    //   1455: aload_0
    //   1456: ldc_w 'musicolet.media.r.2'
    //   1459: invokestatic d : (Lin/krosbits/musicolet/MusicService;Ljava/lang/String;)V
    //   1462: goto -> 2476
    //   1465: aload_0
    //   1466: getfield j : Z
    //   1469: ifeq -> 2476
    //   1472: aload_0
    //   1473: iconst_0
    //   1474: anewarray java/lang/Integer
    //   1477: invokevirtual X : ([Ljava/lang/Integer;)V
    //   1480: goto -> 2476
    //   1483: ldc_w 'ACT_MID'
    //   1486: aload #17
    //   1488: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1491: ifeq -> 1525
    //   1494: aload_0
    //   1495: getfield w : Z
    //   1498: ifne -> 1511
    //   1501: aload_0
    //   1502: invokevirtual H : ()V
    //   1505: invokestatic h : ()Lwk1;
    //   1508: invokevirtual b : ()V
    //   1511: aload_0
    //   1512: aload_1
    //   1513: ldc_w 'EXT_MID'
    //   1516: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1519: invokestatic d : (Lin/krosbits/musicolet/MusicService;Ljava/lang/String;)V
    //   1522: goto -> 2476
    //   1525: ldc_w 'ACT_S_P'
    //   1528: aload #17
    //   1530: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1533: ifeq -> 1574
    //   1536: aload_0
    //   1537: getfield w : Z
    //   1540: ifne -> 1553
    //   1543: aload_0
    //   1544: invokevirtual H : ()V
    //   1547: invokestatic h : ()Lwk1;
    //   1550: invokevirtual b : ()V
    //   1553: aload_0
    //   1554: aload_1
    //   1555: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.OSkUurUqCuL : Ljava/lang/String;
    //   1558: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   1561: aload_1
    //   1562: ldc_w 'EXT_S_E'
    //   1565: invokevirtual getBundleExtra : (Ljava/lang/String;)Landroid/os/Bundle;
    //   1568: invokestatic e : (Lin/krosbits/musicolet/MusicService;Ljava/lang/String;Landroid/os/Bundle;)V
    //   1571: goto -> 2476
    //   1574: ldc_w 'ACT_FAV'
    //   1577: aload #17
    //   1579: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1582: ifeq -> 1801
    //   1585: aload_0
    //   1586: getfield w : Z
    //   1589: ifne -> 1603
    //   1592: aload_0
    //   1593: invokevirtual H : ()V
    //   1596: goto -> 1603
    //   1599: astore_1
    //   1600: goto -> 1794
    //   1603: aload_1
    //   1604: ldc_w 'EXT_S_RID'
    //   1607: iconst_0
    //   1608: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   1611: istore_2
    //   1612: iload_2
    //   1613: ifeq -> 1630
    //   1616: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   1619: getfield c : Llm0;
    //   1622: iload_2
    //   1623: invokevirtual a : (I)Lkm0;
    //   1626: astore_1
    //   1627: goto -> 1634
    //   1630: invokestatic y : ()Lkm0;
    //   1633: astore_1
    //   1634: aload_1
    //   1635: ifnull -> 2476
    //   1638: aload_0
    //   1639: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1642: aload_1
    //   1643: invokevirtual c : (Lkm0;)Z
    //   1646: ifeq -> 1660
    //   1649: aload_0
    //   1650: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1653: aload_1
    //   1654: invokevirtual f : (Lkm0;)V
    //   1657: goto -> 1669
    //   1660: aload_0
    //   1661: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1664: aload_1
    //   1665: invokevirtual a : (Lkm0;)Z
    //   1668: pop
    //   1669: invokestatic j : ()V
    //   1672: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   1675: astore #17
    //   1677: aload_1
    //   1678: invokestatic y : ()Lkm0;
    //   1681: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1684: ifeq -> 2476
    //   1687: aload #17
    //   1689: ifnull -> 1783
    //   1692: aload #17
    //   1694: getfield d0 : Lz71;
    //   1697: astore_1
    //   1698: aload_1
    //   1699: ifnull -> 1717
    //   1702: aload_1
    //   1703: invokevirtual Y : ()Z
    //   1706: ifeq -> 1717
    //   1709: aload #17
    //   1711: getfield d0 : Lz71;
    //   1714: invokevirtual X0 : ()V
    //   1717: aload #17
    //   1719: getfield e0 : Ll81;
    //   1722: astore_1
    //   1723: aload_1
    //   1724: ifnull -> 1783
    //   1727: aload_1
    //   1728: invokevirtual Y : ()Z
    //   1731: ifeq -> 1783
    //   1734: aload #17
    //   1736: getfield e0 : Ll81;
    //   1739: astore_1
    //   1740: aload_1
    //   1741: getfield C0 : Z
    //   1744: ifeq -> 1783
    //   1747: aload_1
    //   1748: getfield a0 : I
    //   1751: iconst_1
    //   1752: if_icmpne -> 1783
    //   1755: aload_1
    //   1756: invokevirtual N0 : ()V
    //   1759: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1762: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1765: invokestatic c : (Landroid/content/Context;)Lb81;
    //   1768: invokevirtual d : ()Z
    //   1771: ifeq -> 1783
    //   1774: aload #17
    //   1776: getfield e0 : Ll81;
    //   1779: invokevirtual e : ()Z
    //   1782: pop
    //   1783: invokestatic M0 : ()V
    //   1786: aload_0
    //   1787: iconst_0
    //   1788: invokevirtual b0 : (Z)V
    //   1791: goto -> 2476
    //   1794: aload_1
    //   1795: invokevirtual printStackTrace : ()V
    //   1798: goto -> 2476
    //   1801: ldc_w 'ACT_SFL'
    //   1804: aload #17
    //   1806: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1809: ifeq -> 1834
    //   1812: getstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   1815: ifne -> 1822
    //   1818: aload_0
    //   1819: invokevirtual H : ()V
    //   1822: aload_0
    //   1823: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   1826: iconst_1
    //   1827: ixor
    //   1828: invokevirtual y0 : (Z)V
    //   1831: goto -> 2476
    //   1834: ldc_w 'ACT_RPTS_TGL'
    //   1837: aload #17
    //   1839: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1842: ifeq -> 2009
    //   1845: getstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   1848: ifne -> 1855
    //   1851: aload_0
    //   1852: invokevirtual H : ()V
    //   1855: invokestatic O : ()Z
    //   1858: ifeq -> 1900
    //   1861: invokestatic B : ()I
    //   1864: istore_2
    //   1865: iload_2
    //   1866: ifne -> 1876
    //   1869: iconst_2
    //   1870: invokestatic e0 : (I)V
    //   1873: goto -> 1968
    //   1876: iload_2
    //   1877: iconst_2
    //   1878: if_icmpne -> 1888
    //   1881: iconst_1
    //   1882: invokestatic e0 : (I)V
    //   1885: goto -> 1968
    //   1888: iload_2
    //   1889: iconst_1
    //   1890: if_icmpne -> 1968
    //   1893: iconst_0
    //   1894: invokestatic e0 : (I)V
    //   1897: goto -> 1968
    //   1900: invokestatic u : ()Landroid/content/SharedPreferences;
    //   1903: ldc_w 'RSM'
    //   1906: iconst_2
    //   1907: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1912: istore_2
    //   1913: iload_2
    //   1914: iconst_1
    //   1915: if_icmpne -> 1924
    //   1918: iload #5
    //   1920: istore_2
    //   1921: goto -> 1946
    //   1924: iload_2
    //   1925: iconst_4
    //   1926: if_icmpne -> 1934
    //   1929: iconst_2
    //   1930: istore_2
    //   1931: goto -> 1946
    //   1934: iload_2
    //   1935: iconst_2
    //   1936: if_icmpne -> 1944
    //   1939: iconst_3
    //   1940: istore_2
    //   1941: goto -> 1946
    //   1944: iconst_1
    //   1945: istore_2
    //   1946: invokestatic u : ()Landroid/content/SharedPreferences;
    //   1949: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1954: ldc_w 'RSM'
    //   1957: iload_2
    //   1958: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1963: invokeinterface apply : ()V
    //   1968: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   1971: astore_1
    //   1972: aload_1
    //   1973: ifnull -> 2001
    //   1976: aload_1
    //   1977: getfield d0 : Lz71;
    //   1980: astore_1
    //   1981: aload_1
    //   1982: ifnull -> 2001
    //   1985: aload_1
    //   1986: invokevirtual Y : ()Z
    //   1989: ifeq -> 2001
    //   1992: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   1995: getfield d0 : Lz71;
    //   1998: invokevirtual d1 : ()V
    //   2001: aload_0
    //   2002: iconst_1
    //   2003: invokevirtual b0 : (Z)V
    //   2006: goto -> 2476
    //   2009: ldc_w 'ACT_REPTQ_TGL'
    //   2012: aload #17
    //   2014: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2017: ifeq -> 2117
    //   2020: getstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   2023: ifne -> 2030
    //   2026: aload_0
    //   2027: invokevirtual H : ()V
    //   2030: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2033: ldc_w 'RQM'
    //   2036: iconst_2
    //   2037: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2042: iconst_1
    //   2043: iadd
    //   2044: istore_3
    //   2045: iload_3
    //   2046: istore_2
    //   2047: iload_3
    //   2048: iconst_4
    //   2049: if_icmpne -> 2054
    //   2052: iconst_1
    //   2053: istore_2
    //   2054: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2057: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2062: ldc_w 'RQM'
    //   2065: iload_2
    //   2066: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2071: invokeinterface apply : ()V
    //   2076: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   2079: astore_1
    //   2080: aload_1
    //   2081: ifnull -> 2109
    //   2084: aload_1
    //   2085: getfield d0 : Lz71;
    //   2088: astore_1
    //   2089: aload_1
    //   2090: ifnull -> 2109
    //   2093: aload_1
    //   2094: invokevirtual Y : ()Z
    //   2097: ifeq -> 2109
    //   2100: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   2103: getfield d0 : Lz71;
    //   2106: invokevirtual d1 : ()V
    //   2109: aload_0
    //   2110: iconst_1
    //   2111: invokevirtual b0 : (Z)V
    //   2114: goto -> 2476
    //   2117: ldc_w 'A_RMMS'
    //   2120: aload #17
    //   2122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2125: ifeq -> 2341
    //   2128: getstatic in/krosbits/musicolet/MusicService.G0 : Z
    //   2131: ifne -> 2138
    //   2134: aload_0
    //   2135: invokevirtual H : ()V
    //   2138: aload_1
    //   2139: ldc_w 'E_RMMS'
    //   2142: iconst_m1
    //   2143: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   2146: istore_3
    //   2147: iload_3
    //   2148: iconst_3
    //   2149: if_icmpne -> 2158
    //   2152: iconst_2
    //   2153: istore #4
    //   2155: goto -> 2169
    //   2158: iload_3
    //   2159: istore #4
    //   2161: iload_3
    //   2162: iconst_m1
    //   2163: if_icmpne -> 2169
    //   2166: goto -> 2476
    //   2169: aload_0
    //   2170: getfield p0 : I
    //   2173: iload #4
    //   2175: if_icmpne -> 2181
    //   2178: goto -> 2476
    //   2181: iload #4
    //   2183: ifne -> 2216
    //   2186: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2189: ldc_w 'RQM'
    //   2192: iconst_2
    //   2193: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2198: iconst_3
    //   2199: if_icmpne -> 2207
    //   2202: iconst_1
    //   2203: istore_2
    //   2204: goto -> 2209
    //   2207: iconst_m1
    //   2208: istore_2
    //   2209: iload_2
    //   2210: istore_3
    //   2211: iconst_2
    //   2212: istore_2
    //   2213: goto -> 2240
    //   2216: iload #4
    //   2218: iconst_1
    //   2219: if_icmpne -> 2227
    //   2222: iconst_m1
    //   2223: istore_3
    //   2224: goto -> 2240
    //   2227: iload #4
    //   2229: iconst_2
    //   2230: if_icmpne -> 2236
    //   2233: goto -> 2209
    //   2236: iconst_m1
    //   2237: istore_3
    //   2238: iconst_m1
    //   2239: istore_2
    //   2240: iload_2
    //   2241: iconst_m1
    //   2242: if_icmpeq -> 2267
    //   2245: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2248: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2253: ldc_w 'RSM'
    //   2256: iload_2
    //   2257: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2262: invokeinterface apply : ()V
    //   2267: iload_3
    //   2268: iconst_m1
    //   2269: if_icmpeq -> 2294
    //   2272: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2275: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2280: ldc_w 'RQM'
    //   2283: iload_3
    //   2284: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2289: invokeinterface apply : ()V
    //   2294: aload_0
    //   2295: iload #4
    //   2297: putfield p0 : I
    //   2300: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   2303: astore_1
    //   2304: aload_1
    //   2305: ifnull -> 2333
    //   2308: aload_1
    //   2309: getfield d0 : Lz71;
    //   2312: astore_1
    //   2313: aload_1
    //   2314: ifnull -> 2333
    //   2317: aload_1
    //   2318: invokevirtual Y : ()Z
    //   2321: ifeq -> 2333
    //   2324: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   2327: getfield d0 : Lz71;
    //   2330: invokevirtual d1 : ()V
    //   2333: aload_0
    //   2334: iconst_1
    //   2335: invokevirtual b0 : (Z)V
    //   2338: goto -> 2476
    //   2341: ldc_w 'ACT_RNF'
    //   2344: aload #17
    //   2346: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   2349: ifeq -> 2358
    //   2352: invokestatic O0 : ()V
    //   2355: goto -> 2476
    //   2358: getstatic ew0.b : Ljava/lang/String;
    //   2361: aload #17
    //   2363: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2366: ifeq -> 2476
    //   2369: aload_1
    //   2370: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   2373: astore_1
    //   2374: getstatic ew0.c : Ll01;
    //   2377: astore #17
    //   2379: getstatic ew0.d : Z
    //   2382: ifne -> 2388
    //   2385: goto -> 2476
    //   2388: aload_1
    //   2389: ifnull -> 2476
    //   2392: aload_1
    //   2393: ldc_w 'repeat'
    //   2396: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   2399: ifne -> 2407
    //   2402: iconst_0
    //   2403: istore_2
    //   2404: goto -> 2420
    //   2407: aload_1
    //   2408: ldc_w 'repeat'
    //   2411: invokevirtual getInt : (Ljava/lang/String;)I
    //   2414: iconst_1
    //   2415: if_icmpne -> 2402
    //   2418: iconst_1
    //   2419: istore_2
    //   2420: iload_2
    //   2421: iconst_m1
    //   2422: if_icmpeq -> 2431
    //   2425: aload #17
    //   2427: iload_2
    //   2428: invokevirtual m : (I)V
    //   2431: aload_1
    //   2432: ldc_w 'shuffle'
    //   2435: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   2438: ifne -> 2446
    //   2441: iload_3
    //   2442: istore_2
    //   2443: goto -> 2465
    //   2446: aload_1
    //   2447: ldc_w 'shuffle'
    //   2450: invokevirtual getInt : (Ljava/lang/String;)I
    //   2453: iconst_1
    //   2454: if_icmpne -> 2463
    //   2457: iload #4
    //   2459: istore_2
    //   2460: goto -> 2465
    //   2463: iconst_0
    //   2464: istore_2
    //   2465: iload_2
    //   2466: iconst_m1
    //   2467: if_icmpeq -> 2476
    //   2470: aload #17
    //   2472: iload_2
    //   2473: invokevirtual o : (I)V
    //   2476: getstatic ws2.j : Landroid/os/PowerManager$WakeLock;
    //   2479: astore_1
    //   2480: aload_1
    //   2481: ifnull -> 2505
    //   2484: aload_1
    //   2485: invokevirtual isHeld : ()Z
    //   2488: ifeq -> 2505
    //   2491: getstatic ws2.j : Landroid/os/PowerManager$WakeLock;
    //   2494: invokevirtual release : ()V
    //   2497: goto -> 2505
    //   2500: astore_1
    //   2501: aload_1
    //   2502: invokevirtual printStackTrace : ()V
    //   2505: iconst_2
    //   2506: ireturn
    //   2507: astore_1
    //   2508: iload #8
    //   2510: istore_2
    //   2511: goto -> 837
    //   2514: astore_1
    //   2515: iload #7
    //   2517: istore_2
    //   2518: goto -> 889
    // Exception table:
    //   from	to	target	type
    //   155	160	182	finally
    //   165	179	182	finally
    //   811	837	2507	java/lang/NumberFormatException
    //   863	889	2514	java/lang/NumberFormatException
    //   1037	1050	1098	finally
    //   1062	1069	1098	finally
    //   1072	1095	1098	finally
    //   1585	1596	1599	finally
    //   1603	1612	1599	finally
    //   1616	1627	1599	finally
    //   1630	1634	1599	finally
    //   1638	1657	1599	finally
    //   1660	1669	1599	finally
    //   1669	1687	1599	finally
    //   1692	1698	1599	finally
    //   1702	1717	1599	finally
    //   1717	1723	1599	finally
    //   1727	1783	1599	finally
    //   1783	1791	1599	finally
    //   2476	2480	2500	finally
    //   2484	2497	2500	finally
  }
  
  public final void onTaskRemoved(Intent paramIntent) {
    try {
      return;
    } finally {
      paramIntent = null;
      paramIntent.printStackTrace();
    } 
  }
  
  public final boolean onUnbind(Intent paramIntent) {
    boolean bool1;
    if (y() == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    boolean bool2 = bool1;
    if (this.w) {
      bool2 = bool1;
      if (this.j)
        bool2 = true; 
    } 
    if (bool2) {
      Handler handler = this.v;
      if (handler != null)
        handler.post((Runnable)new r9(this, 2)); 
    } 
    return true;
  }
  
  public final void p() {
    if (!o()) {
      this.W = false;
      Handler handler = this.v;
      if (handler != null)
        handler.postDelayed((Runnable)new r9(this, 9), 4500L); 
    } 
  }
  
  public final void p0() {
    try {
      if (!this.w) {
        Intent intent = new Intent();
        this((Context)this, TaskSaviour.class);
        return;
      } 
      PowerManager.WakeLock wakeLock = this.l0;
      if (wakeLock != null)
        try {
          wakeLock.setReferenceCounted(false);
          this.l0.acquire(10000L);
        } finally {
          wakeLock = null;
        }  
      Stack stack = (MyApplication.h()).b;
      int i = (MyApplication.h()).c;
      long l = System.currentTimeMillis();
      Q0 = l;
      try {
        if (E0 != null && F0)
          z().l(E0.A()); 
      } finally {
        stack = null;
      } 
      fz0 fz0 = new fz0();
      this(this, l);
      j61 j611 = this.G;
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void q() {
    xn1 xn1 = z();
    (MyApplication.h()).b.clear();
    (MyApplication.h()).b.add(xn1);
    (MyApplication.h()).c = 0;
    MyApplication.h().a();
    MusicActivity musicActivity = this.s;
    if (musicActivity != null)
      musicActivity.M0(); 
  }
  
  public final void r() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MusicService.W0 : Lkm0;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield j : Z
    //   9: ifne -> 31
    //   12: aload_0
    //   13: getfield B : J
    //   16: lstore_3
    //   17: aload_0
    //   18: invokestatic currentTimeMillis : ()J
    //   21: aload_0
    //   22: getfield A : J
    //   25: lsub
    //   26: lload_3
    //   27: ladd
    //   28: putfield B : J
    //   31: aload #7
    //   33: ifnull -> 173
    //   36: aload_0
    //   37: getfield u : Landroid/content/SharedPreferences;
    //   40: aload_0
    //   41: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   44: ldc_w 2131886714
    //   47: invokevirtual getString : (I)Ljava/lang/String;
    //   50: ldc_w '30'
    //   53: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   58: invokestatic parseInt : (Ljava/lang/String;)I
    //   61: istore_2
    //   62: iload_2
    //   63: iflt -> 74
    //   66: iload_2
    //   67: istore_1
    //   68: iload_2
    //   69: bipush #100
    //   71: if_icmple -> 108
    //   74: aload_0
    //   75: getfield u : Landroid/content/SharedPreferences;
    //   78: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   83: aload_0
    //   84: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   87: ldc_w 2131886714
    //   90: invokevirtual getString : (I)Ljava/lang/String;
    //   93: bipush #30
    //   95: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   100: invokeinterface apply : ()V
    //   105: bipush #30
    //   107: istore_1
    //   108: aload #7
    //   110: getfield c : Lqn1;
    //   113: getfield g : I
    //   116: i2l
    //   117: iload_1
    //   118: i2l
    //   119: lmul
    //   120: l2d
    //   121: ldc2_w 100.0
    //   124: ddiv
    //   125: d2l
    //   126: lstore_3
    //   127: aload_0
    //   128: getfield u : Landroid/content/SharedPreferences;
    //   131: ldc_w 'k_i_cfd'
    //   134: iconst_0
    //   135: invokeinterface getInt : (Ljava/lang/String;I)I
    //   140: i2l
    //   141: lstore #5
    //   143: aload_0
    //   144: getfield B : J
    //   147: lload_3
    //   148: lload #5
    //   150: lsub
    //   151: lcmp
    //   152: iflt -> 173
    //   155: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   158: aload #7
    //   160: invokevirtual r : (Lkm0;)V
    //   163: goto -> 173
    //   166: astore #7
    //   168: aload #7
    //   170: invokevirtual printStackTrace : ()V
    //   173: aload_0
    //   174: invokestatic currentTimeMillis : ()J
    //   177: putfield A : J
    //   180: aload_0
    //   181: lconst_0
    //   182: putfield B : J
    //   185: return
    // Exception table:
    //   from	to	target	type
    //   36	62	166	finally
    //   74	105	166	finally
    //   108	163	166	finally
  }
  
  public final void r0() {
    if (F0) {
      int i = E0.A();
      int k = E0.C();
      int j = i - MyApplication.o().getInt("k_s_rwd", 10) * 1000;
      i = j;
      if (j < 0)
        i = 0; 
      if (i >= 0 && i < k)
        t0(i); 
    } 
  }
  
  public final void s(hc paramhc) {
    if (E0 == null) {
      n21.F("MSoC>TLT!");
      return;
    } 
    n21.F("MSSC:");
    if (I()) {
      n21.F("MSoC>jab");
      M();
      return;
    } 
    PowerManager.WakeLock wakeLock = this.l0;
    if (wakeLock != null)
      try {
        wakeLock.setReferenceCounted(false);
        this.l0.acquire(10000L);
      } finally {
        wakeLock = null;
      }  
    n();
    i0();
    int i = this.h;
    if (i > 0) {
      this.h = --i;
      if (i == 0) {
        this.k = true;
        m();
      } else if (i == 1) {
        ag0.O0(2131887592, 0);
      } else if (i <= 3) {
        Resources resources = getResources();
        i = this.h;
        ag0.P0(0, resources.getQuantityString(2131755037, i, new Object[] { Integer.valueOf(i) }), true);
      } 
      jz.f();
    } 
    km0 km01 = this.i;
    if (km01 != null && km01.equals(y())) {
      this.i = null;
      this.k = true;
    } 
    i = this.t.getInt("RSM", 2);
    boolean bool = this.t.getBoolean("R_b_rwq", true);
    if (i == 2 || i == 4) {
      if (i == 4) {
        r();
        this.j = true;
        this.e = System.currentTimeMillis();
        E0.X(this.j);
      } 
      if (!W() && (!F0 || !E0.J())) {
        r();
        z().l(0);
        if (bool && !z().i() && z().j(C0)) {
          if (C0 && this.t.getBoolean("R_RSFLQ", true)) {
            (z()).i = true;
            (z()).j = true;
            MyApplication.h().a();
          } 
          z().o(C0);
        } 
        this.j = true;
        this.e = System.currentTimeMillis();
        E0.X(this.j);
        j0();
      } 
      return;
    } 
    if (i == 1) {
      r();
      z().l(0);
      this.j = true;
      this.e = System.currentTimeMillis();
      E0.X(this.j);
      j0();
      return;
    } 
    if (i == 3) {
      r();
      z().l(0);
      j0();
      return;
    } 
  }
  
  public final void s0() {
    if (F0) {
      int j = E0.A();
      int i = E0.C();
      j = MyApplication.o().getInt("k_s_ffd", 10) * 1000 + j;
      if (j > 0 && j < i)
        t0(j); 
    } 
  }
  
  public final boolean t(int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: iconst_0
    //   4: invokevirtual m0 : (Z)V
    //   7: invokestatic h : ()Lwk1;
    //   10: getfield c : I
    //   13: iload_1
    //   14: if_icmpne -> 22
    //   17: iconst_1
    //   18: istore_2
    //   19: goto -> 24
    //   22: iconst_0
    //   23: istore_2
    //   24: invokestatic h : ()Lwk1;
    //   27: invokevirtual a : ()V
    //   30: invokestatic h : ()Lwk1;
    //   33: getfield b : Ljava/util/Stack;
    //   36: invokevirtual size : ()I
    //   39: iconst_1
    //   40: if_icmple -> 74
    //   43: invokestatic h : ()Lwk1;
    //   46: getfield b : Ljava/util/Stack;
    //   49: iload_1
    //   50: invokevirtual remove : (I)Ljava/lang/Object;
    //   53: pop
    //   54: goto -> 301
    //   57: astore #4
    //   59: ldc_w 'JSTMUSIC2'
    //   62: aload #4
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   70: pop
    //   71: goto -> 301
    //   74: invokestatic h : ()Lwk1;
    //   77: getfield b : Ljava/util/Stack;
    //   80: iconst_0
    //   81: invokevirtual get : (I)Ljava/lang/Object;
    //   84: checkcast xn1
    //   87: getfield b : Ljava/util/ArrayList;
    //   90: invokevirtual clear : ()V
    //   93: invokestatic h : ()Lwk1;
    //   96: getfield b : Ljava/util/Stack;
    //   99: iconst_0
    //   100: invokevirtual get : (I)Ljava/lang/Object;
    //   103: checkcast xn1
    //   106: getfield c : Ljava/util/ArrayList;
    //   109: ifnull -> 131
    //   112: invokestatic h : ()Lwk1;
    //   115: getfield b : Ljava/util/Stack;
    //   118: iconst_0
    //   119: invokevirtual get : (I)Ljava/lang/Object;
    //   122: checkcast xn1
    //   125: getfield c : Ljava/util/ArrayList;
    //   128: invokevirtual clear : ()V
    //   131: invokestatic h : ()Lwk1;
    //   134: getfield b : Ljava/util/Stack;
    //   137: iconst_0
    //   138: invokevirtual get : (I)Ljava/lang/Object;
    //   141: checkcast xn1
    //   144: iconst_0
    //   145: iconst_0
    //   146: invokevirtual m : (IZ)V
    //   149: invokestatic h : ()Lwk1;
    //   152: getfield b : Ljava/util/Stack;
    //   155: iconst_0
    //   156: invokevirtual get : (I)Ljava/lang/Object;
    //   159: checkcast xn1
    //   162: iconst_0
    //   163: putfield g : I
    //   166: invokestatic h : ()Lwk1;
    //   169: getfield b : Ljava/util/Stack;
    //   172: invokevirtual size : ()I
    //   175: iconst_1
    //   176: if_icmpne -> 268
    //   179: invokestatic z : ()Lxn1;
    //   182: invokevirtual i : ()Z
    //   185: ifeq -> 268
    //   188: invokestatic z : ()Lxn1;
    //   191: getfield h : Ljava/lang/String;
    //   194: astore #5
    //   196: new java/lang/StringBuilder
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: astore #4
    //   205: aload #4
    //   207: aload_0
    //   208: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   211: ldc_w 2131887092
    //   214: invokevirtual getString : (I)Ljava/lang/String;
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload #4
    //   223: ldc_w ' A'
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload #5
    //   232: aload #4
    //   234: invokevirtual toString : ()Ljava/lang/String;
    //   237: invokevirtual equals : (Ljava/lang/Object;)Z
    //   240: ifeq -> 268
    //   243: invokestatic h : ()Lwk1;
    //   246: getfield b : Ljava/util/Stack;
    //   249: iconst_0
    //   250: invokevirtual get : (I)Ljava/lang/Object;
    //   253: checkcast xn1
    //   256: invokestatic z : ()Lxn1;
    //   259: getfield h : Ljava/lang/String;
    //   262: putfield h : Ljava/lang/String;
    //   265: goto -> 297
    //   268: invokestatic h : ()Lwk1;
    //   271: getfield b : Ljava/util/Stack;
    //   274: iconst_0
    //   275: invokevirtual get : (I)Ljava/lang/Object;
    //   278: checkcast xn1
    //   281: aload_0
    //   282: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   285: invokestatic h : ()Lwk1;
    //   288: getfield b : Ljava/util/Stack;
    //   291: invokestatic O : (Landroid/content/Context;Ljava/util/Stack;)Ljava/lang/String;
    //   294: putfield h : Ljava/lang/String;
    //   297: iconst_0
    //   298: istore_1
    //   299: iconst_1
    //   300: istore_3
    //   301: iload_1
    //   302: invokestatic h : ()Lwk1;
    //   305: getfield c : I
    //   308: if_icmpge -> 328
    //   311: invokestatic h : ()Lwk1;
    //   314: astore #4
    //   316: aload #4
    //   318: aload #4
    //   320: getfield c : I
    //   323: iconst_1
    //   324: isub
    //   325: putfield c : I
    //   328: invokestatic h : ()Lwk1;
    //   331: getfield c : I
    //   334: invokestatic h : ()Lwk1;
    //   337: getfield b : Ljava/util/Stack;
    //   340: invokevirtual size : ()I
    //   343: if_icmplt -> 363
    //   346: invokestatic h : ()Lwk1;
    //   349: invokestatic h : ()Lwk1;
    //   352: getfield b : Ljava/util/Stack;
    //   355: invokevirtual size : ()I
    //   358: iconst_1
    //   359: isub
    //   360: putfield c : I
    //   363: iload_2
    //   364: ifeq -> 419
    //   367: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   370: getfield b : Ljava/lang/String;
    //   373: ifnull -> 393
    //   376: aload_0
    //   377: invokevirtual j0 : ()V
    //   380: goto -> 442
    //   383: astore #4
    //   385: aload #4
    //   387: invokevirtual printStackTrace : ()V
    //   390: goto -> 442
    //   393: aload_0
    //   394: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   397: ifnull -> 442
    //   400: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   403: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   406: invokestatic T0 : (Landroid/content/Context;)V
    //   409: aload_0
    //   410: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   413: invokevirtual M0 : ()V
    //   416: goto -> 442
    //   419: aload_0
    //   420: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   423: ifnull -> 442
    //   426: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   429: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   432: invokestatic T0 : (Landroid/content/Context;)V
    //   435: aload_0
    //   436: getfield s : Lin/krosbits/musicolet/MusicActivity;
    //   439: invokevirtual M0 : ()V
    //   442: iload_3
    //   443: ireturn
    // Exception table:
    //   from	to	target	type
    //   43	54	57	java/lang/IndexOutOfBoundsException
    //   376	380	383	finally
  }
  
  public final void t0(int paramInt) {
    if (!this.w)
      H(); 
    hc hc1 = E0;
    if (hc1 != null && F0) {
      if (hc1.A() == paramInt)
        return; 
      if (paramInt == 0 && this.j) {
        z().l(0);
        i0();
        j0();
      } else {
        km0 km02 = y();
        if (km02 != null) {
          int j = km02.c.g;
          if (j >= 0 && paramInt >= 0 && paramInt <= j) {
            E0.R(paramInt);
            b0(false);
          } 
        } 
      } 
      d0();
      int i = this.Q;
      if (i > 0 && paramInt < i)
        this.Q = 0; 
      if (I() && paramInt + 150 > this.R)
        this.R = 0; 
      M();
    } 
    MusicActivity musicActivity = MusicActivity.R0;
    if (musicActivity != null) {
      z71 z71 = musicActivity.d0;
      if (z71 != null && z71.Y()) {
        MusicActivity.R0.d0.Y0();
        MusicActivity.R0.d0.V0();
      } 
    } 
    LockScreenActivity.v0();
    km0 km01 = y();
    if (km01 != null) {
      qn1 qn1 = km01.c;
      Intent intent = new Intent("com.android.music.playstatechanged");
      Bundle bundle = new Bundle();
      bundle.putString("track", qn1.b);
      bundle.putString("artist", qn1.e);
      bundle.putString("album", qn1.c);
      bundle.putLong("duration", qn1.g);
      bundle.putLong("position", E0.A());
      bundle.putBoolean("playing", this.j ^ true);
      bundle.putString("scrobbling_source", getPackageName());
      intent.putExtras(bundle);
      sendBroadcast(intent);
    } 
  }
  
  public final void u() {
    try {
      if (F0 && !this.j) {
        hc hc1 = E0;
        if (hc1 instanceof kd)
          ((kd)hc1).m0(V0.toString()); 
      } 
    } finally {
      Exception exception;
    } 
  }
  
  public final void u0(int paramInt) {
    if (F0 && E0 != null) {
      boolean bool1;
      boolean bool2;
      try {
        bool1 = I();
        this.R = paramInt;
        bool2 = I();
        if (bool2) {
          if (this.j)
            X(new Integer[] { Integer.valueOf(1) }); 
          M();
        } 
      } catch (Exception exception) {}
      if (bool1 != bool2) {
        E0.L();
        return;
      } 
    } 
  }
  
  public final boolean v(hc paramhc, int paramInt1, int paramInt2) {
    n();
    if (paramInt1 == -38)
      return true; 
    try {
      if (!F0) {
        MusicActivity musicActivity = this.s;
        if (musicActivity != null)
          musicActivity.M0(); 
        D();
      } 
    } finally {
      paramhc = null;
    } 
  }
  
  public final void w0(boolean paramBoolean) {
    try {
      wo wo2 = V0;
      wn1 wn1 = MyApplication.j;
      wo wo1 = V0;
      ez0 ez0 = new ez0();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void x0(int paramInt1, int paramInt2) {
    r();
    m0(false);
    try {
      if (paramInt1 != (MyApplication.h()).c && F0 && E0 != null)
        z().l(E0.A()); 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void y0(boolean paramBoolean) {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
    try {
      if (C0 != paramBoolean && this.w) {
        getSharedPreferences("RPN", 0).edit().putBoolean("R_SM", paramBoolean).apply();
        C0 = paramBoolean;
        if (!paramBoolean) {
          for (xn1 xn1 : (MyApplication.h()).b) {
            xn1.c = null;
            xn1.i = false;
          } 
        } else {
          for (xn1 xn1 : (MyApplication.h()).b) {
            xn1.i = true;
            xn1.f();
          } 
        } 
        H0 = true;
        I0 = (MyApplication.h()).c;
        MusicActivity musicActivity = MusicActivity.R0;
        if (musicActivity != null) {
          lb1 lb1 = musicActivity.f0;
          if (lb1 != null && lb1.Y())
            MusicActivity.R0.f0.H0(); 
          z71 z71 = MusicActivity.R0.d0;
          if (z71 != null && z71.Y())
            MusicActivity.R0.d0.d1(); 
        } 
        b0(true);
        MyApplication.h().a();
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/MusicService}} */
  }
  
  public final long z0(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    PendingIntent pendingIntent = this.D;
    boolean bool = false;
    if (pendingIntent == null)
      this.D = PendingIntent.getBroadcast((Context)this, 0, (new Intent((Context)this, MyReceiver.class)).setAction(DJqHMztxflt.bfGefT), 167772160); 
    MyApplication.c().cancel(this.D);
    k0();
    m();
    int i = paramLong cmp 0L;
    if (i > 0) {
      A0(0, false);
      B0(null);
    } 
    if (i > 0) {
      long l = System.currentTimeMillis() + paramLong;
      if (Build.VERSION.SDK_INT >= 31) {
        if (MyApplication.c().canScheduleExactAlarms()) {
          MyApplication.c().setExactAndAllowWhileIdle(0, l, this.D);
        } else {
          this.F = this.E.schedule((Runnable)U0, paramLong, TimeUnit.MILLISECONDS);
        } 
      } else {
        MyApplication.c().setExactAndAllowWhileIdle(0, l, this.D);
      } 
      this.f = paramBoolean1;
      boolean bool1 = bool;
      if (paramBoolean1) {
        bool1 = bool;
        if (paramBoolean2)
          bool1 = true; 
      } 
      this.g = bool1;
      this.b = l;
      G0();
      return l;
    } 
    E0.L();
    this.b = -1L;
    return -1L;
  }
  
  static {
    HandlerThread handlerThread = new HandlerThread("t_notif_updater");
    handlerThread.start();
    b1 = new Handler(handlerThread.getLooper());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MusicService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */