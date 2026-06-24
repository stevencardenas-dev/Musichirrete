import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Messenger;
import android.os.PowerManager;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.providers.CastProvider;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

public final class fl extends hc implements cl1 {
  public final Object A;
  
  public km0 B;
  
  public final Handler C;
  
  public final bl D;
  
  public boolean E;
  
  public int F;
  
  public float G;
  
  public ArrayList H;
  
  public int I;
  
  public boolean J;
  
  public nf1 K;
  
  public boolean L;
  
  public boolean M;
  
  public int N;
  
  public boolean O;
  
  public iv0 P;
  
  public boolean Q;
  
  public final dl R;
  
  public BasePendingResult S;
  
  public boolean T;
  
  public final bl1 m;
  
  public boolean n;
  
  public String o;
  
  public final HandlerThread p;
  
  public final cl q;
  
  public final PowerManager.WakeLock r;
  
  public final WifiManager.WifiLock s;
  
  public final String t;
  
  public final zk u;
  
  public long v;
  
  public float w;
  
  public final al x;
  
  public String y;
  
  public qc1 z;
  
  public fl(Context paramContext) {
    super(paramContext);
    bl1 bl11;
    this.n = false;
    HandlerThread handlerThread = new HandlerThread("cc_work");
    this.p = handlerThread;
    this.t = UUID.randomUUID().toString();
    this.u = new zk(0, this);
    this.w = -1.0F;
    this.x = new al(0);
    this.A = new Object();
    this.C = new Handler(Looper.getMainLooper());
    bl bl2 = new bl(0, this);
    this.D = bl2;
    this.F = 0;
    this.G = 1.0F;
    this.Q = true;
    this.R = new dl(this);
    this.T = false;
    kj kj = kj.b(MyApplication.i.getApplicationContext());
    kj.getClass();
    n21.j();
    this.m = kj.c;
    handlerThread.start();
    cl cl2 = new cl(this, handlerThread.getLooper());
    this.q = cl2;
    new Messenger(cl2);
    Intent intent = (new Intent()).setClassName("in.krosbits.castplugin", FgdLmmRfTxSFKI.khmrcKIu);
    try {
      paramContext.bindService(intent, bl2, 65);
    } finally {}
    try {
      PowerManager.WakeLock wakeLock = MyApplication.p().newWakeLock(1, ":cc_wlck");
      this.r = wakeLock;
      wakeLock.setReferenceCounted(false);
    } finally {
      bl2 = null;
    } 
    bl11.getClass();
    n21.j();
    bl11.a(this, al1.class);
  }
  
  public static boolean k0(int paramInt) {
    return (paramInt == 3 || paramInt == 2);
  }
  
  public final int A() {
    int i = this.F;
    if (i > 0)
      return i; 
    if (Looper.myLooper() == Looper.getMainLooper()) {
      nf1 nf11 = l0();
      if (nf11 != null && !this.O)
        this.N = (int)nf11.a(); 
    } 
    return this.N;
  }
  
  public final int C() {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      nf1 nf11 = l0();
      if (nf11 != null)
        return (int)nf11.f(); 
    } 
    return this.I;
  }
  
  public final float D() {
    return 1.0F;
  }
  
  public final float E() {
    float f = this.w;
    return (f != -1.0F) ? f : this.G;
  }
  
  public final int F() {
    return 100;
  }
  
  public final void G(Context paramContext) {
    CastProvider.a(null, null, false);
    oj oj = this.m.c();
    if (oj != null)
      m0(oj); 
  }
  
  public final boolean H() {
    return false;
  }
  
  public final boolean I() {
    return false;
  }
  
  public final boolean J() {
    nf1 nf11 = l0();
    return (!this.Q && nf11 != null && nf11.l());
  }
  
  public final void L() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: monitorexit
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_1
    //   12: athrow
    //   13: astore_1
    //   14: goto -> 9
    // Exception table:
    //   from	to	target	type
    //   2	6	13	finally
    //   9	11	13	finally
  }
  
  public final void M() {
    wk wk = new wk(this, 2);
    this.C.post(wk);
  }
  
  public final void N(int paramInt1, int paramInt2, Runnable paramRunnable) {
    paramRunnable = new wk(this, 2);
    this.C.post(paramRunnable);
  }
  
  public final void O() {
    wk wk = new wk(this, 4);
    this.C.post(wk);
  }
  
  public final void Q() {
    this.E = false;
    wk wk = new wk(this, 3);
    this.C.post(wk);
  }
  
  public final void R(int paramInt) {
    this.F = paramInt;
    xk xk = new xk(this, paramInt, 0);
    this.C.post(xk);
  }
  
  public final void T(int paramInt) {}
  
  public final void U() {}
  
  public final void W(String paramString, boolean paramBoolean) {
    if (MyApplication.k()) {
      this.E = false;
      this.J = false;
      km0 km01 = MyApplication.j.c.b(new wo(paramString, null));
      if (km01 != null) {
        vk vk = new vk(this, km01, 0);
        this.C.post(vk);
        return;
      } 
    } 
  }
  
  public final void X(boolean paramBoolean) {
    this.Q = paramBoolean;
  }
  
  public final void Z(MusicService paramMusicService) {
    this.l = (gc)paramMusicService;
  }
  
  public final void a0(float paramFloat) {}
  
  public final void b0(float paramFloat) {
    if (this.G != paramFloat) {
      float f = paramFloat;
      if (paramFloat < 0.5D)
        f = 0.5F; 
      paramFloat = f;
      if (f > 2.0D)
        paramFloat = 2.0F; 
      yk yk = new yk(this, paramFloat);
      this.C.post(yk);
    } 
  }
  
  public final void c0(int paramInt) {}
  
  public final void d(al1 paramal1, int paramInt) {}
  
  public final void e(al1 paramal1, int paramInt) {
    this.K = null;
    if (paramal1 instanceof oj) {
      StringBuilder stringBuilder = new StringBuilder("cp ose:");
      stringBuilder.append(paramal1);
      stringBuilder.append(", e=");
      stringBuilder.append(paramal1);
      stringBuilder.append(": ");
      stringBuilder.append(paramal1.e());
      stringBuilder.append(", ");
      stringBuilder.append(paramal1.a());
      stringBuilder.append(", ");
      stringBuilder.append(paramal1.c());
      stringBuilder.append(" ::: ");
      stringBuilder.append(paramal1.d());
      n21.F(stringBuilder.toString());
      paramal1 = paramal1;
      n21.j();
      nf1 nf11 = ((oj)paramal1).j;
      if (nf11 != null) {
        this.N = (int)nf11.a();
        n21.j();
        zk zk1 = this.u;
        if (zk1 != null)
          nf11.h.remove(zk1); 
      } 
    } 
  }
  
  public final void e0() {
    wk wk = new wk(this, 5);
    this.C.post(wk);
  }
  
  public final void f0(int paramInt1, int paramInt2) {
    wk wk = new wk(this, 5);
    this.C.post(wk);
  }
  
  public final void g0() {
    wk wk = new wk(this, 1);
    this.C.post(wk);
  }
  
  public final void h(al1 paramal1) {
    this.O = true;
    nf1 nf11 = l0();
    if (nf11 != null)
      this.N = (int)nf11.a(); 
  }
  
  public final void h0() {
    try {
      PowerManager.WakeLock wakeLock = this.r;
    } finally {
      Exception exception = null;
    } 
    try {
      WifiManager.WifiLock wifiLock = this.s;
    } finally {
      Exception exception = null;
    } 
    p0(3);
  }
  
  public final void i0() {
    bl1 bl11 = this.m;
    try {
      return;
    } finally {
      bl11 = null;
      bl11.printStackTrace();
    } 
  }
  
  public final void j(al1 paramal1, int paramInt) {}
  
  public final int j0() {
    try {
      oj oj = this.m.c();
      oj.getClass();
      n21.j();
      pg2 pg2 = oj.i;
      return (int)(d * 20.0D);
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void k(al1 paramal1, boolean paramBoolean) {
    m0(paramal1);
  }
  
  public final void l(al1 paramal1, String paramString) {
    m0(paramal1);
  }
  
  public final nf1 l0() {
    nf1 nf11 = this.K;
    if (nf11 != null)
      return nf11; 
    oj oj = this.m.c();
    if (oj != null && ow.d > 0) {
      n21.j();
      nf1 nf12 = oj.j;
    } else {
      oj = null;
    } 
    this.K = (nf1)oj;
    return (nf1)oj;
  }
  
  public final void m(al1 paramal1) {}
  
  public final void m0(al1 paramal1) {
    this.O = false;
    this.K = null;
    if (paramal1 == this.m.d() && paramal1 instanceof oj) {
      paramal1 = paramal1;
      if (l0() != null) {
        n21.j();
        CastDevice castDevice = ((oj)paramal1).k;
        if (castDevice != null)
          this.y = castDevice.e.getHostAddress(); 
        nf1 nf11 = l0();
        nf11.getClass();
        n21.j();
        zk zk1 = this.u;
        if (zk1 != null)
          nf11.h.remove(zk1); 
        l0().o(zk1);
        if (this.H != null && this.z != null && l0() != null)
          n0(this.H); 
        p01 p01 = ew0.a(this.g);
        el el = new el(this, j0());
        ((m01)p01.c).a.setPlaybackToRemote(el.a());
        iv0 iv01 = iv0.d(MyApplication.i.getApplicationContext());
        this.P = iv01;
        al al2 = this.x;
        iv01.j(al2);
        this.P.a(kj.b(MyApplication.i.getApplicationContext()).a(), al2, 0);
      } 
    } 
  }
  
  public final void n0(ArrayList<String> paramArrayList) {
    if (this.B != null) {
      fc fc;
      this.H = null;
      nf1 nf11 = l0();
      if (nf11 != null && j50.a > 0) {
        km0 km01 = this.B;
        ArrayList<MediaTrack> arrayList = new ArrayList(3);
        String str1 = ag0.W(km01);
        arrayList.add(new MediaTrack(0L, 2, paramArrayList.get(0), "audio/*", str1, null, 0, null, null));
        km0 km02 = this.B;
        kt0 kt0 = new kt0(3);
        String str4 = ag0.W(km02);
        kt0.e("com.google.android.gms.cast.metadata.TITLE", 1);
        Bundle bundle = kt0.c;
        bundle.putString("com.google.android.gms.cast.metadata.TITLE", str4);
        qn1 qn1 = km02.c;
        String str5 = qn1.c;
        kt0.e("com.google.android.gms.cast.metadata.ALBUM_TITLE", 1);
        bundle.putString("com.google.android.gms.cast.metadata.ALBUM_TITLE", str5);
        String str3 = qn1.e;
        kt0.e("com.google.android.gms.cast.metadata.ARTIST", 1);
        bundle.putString("com.google.android.gms.cast.metadata.ARTIST", str3);
        str3 = km02.j;
        kt0.e("com.google.android.gms.cast.metadata.ALBUM_ARTIST", 1);
        bundle.putString("com.google.android.gms.cast.metadata.ALBUM_ARTIST", str3);
        str3 = km02.f;
        kt0.e("com.google.android.gms.cast.metadata.COMPOSER", 1);
        bundle.putString("com.google.android.gms.cast.metadata.COMPOSER", str3);
        int i = km02.c();
        kt0.e("com.google.android.gms.cast.metadata.DISC_NUMBER", 2);
        bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", i);
        i = km02.l();
        kt0.e("com.google.android.gms.cast.metadata.TRACK_NUMBER", 2);
        bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", i);
        i52 i52 = new i52(0, 0, Uri.parse(paramArrayList.get(1)));
        kt0.b.add(i52);
        String str2 = paramArrayList.get(0);
        long l = this.I;
        if (l >= 0L || l == -1L) {
          MediaInfo mediaInfo;
          JSONObject jSONObject = new JSONObject();
          try {
            jSONObject.put("crd", this.t);
          } finally {
            km02 = null;
          } 
          this.v = System.currentTimeMillis();
          if (!this.Q)
            h0(); 
          i = Math.max(this.F, 0);
          this.N = i;
          boolean bool = this.Q;
          l = i;
          float f = this.w;
          if (f != -1.0F) {
            this.G = f;
            this.w = -1.0F;
          } 
          double d = this.G;
          if (Double.compare(d, 2.0D) <= 0 && Double.compare(d, 0.5D) >= 0) {
            if (Double.compare(d, 2.0D) <= 0 && Double.compare(d, 0.5D) >= 0) {
              jt0 jt0 = new jt0(mediaInfo, null, Boolean.valueOf(bool ^ true), l, d, null, null, null, null, null, null, 0L);
              n21.j();
              if (!nf11.v()) {
                nf1.u();
              } else {
                nf1.w(new ce2(nf11, jt0, 1));
              } 
              this.H = null;
              this.S = null;
              this.F = 0;
              if (this.E) {
                fc = this.c;
                if (fc != null)
                  fc.E(this); 
              } 
              return;
            } 
            l0.l("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            return;
          } 
          l0.l("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
          return;
        } 
        l0.l("Invalid stream duration");
        return;
      } 
      this.H = (ArrayList)fc;
      return;
    } 
  }
  
  public final void o0() {
    PowerManager.WakeLock wakeLock = this.r;
    if (wakeLock != null)
      try {
        if (wakeLock.isHeld())
          wakeLock.release(); 
      } finally {
        wakeLock = null;
      }  
    WifiManager.WifiLock wifiLock = this.s;
    if (wifiLock != null)
      try {
        if (wifiLock.isHeld())
          wifiLock.release(); 
      } finally {
        wifiLock = null;
      }  
    p0(-3);
  }
  
  public final void p(al1 paramal1, String paramString) {}
  
  public final void p0(int paramInt) {
    try {
      cl cl2 = this.q;
      xk xk = new xk();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void q0(int paramInt) {
    try {
      if (paramInt != j0()) {
        double d = paramInt / 20.0D;
        this.m.c().i(d);
        this.P.getClass();
        iv0.g().j(paramInt);
      } 
    } finally {
      Exception exception;
    } 
  }
  
  public final void r(al1 paramal1, int paramInt) {
    nf1 nf11 = l0();
    if (nf11 != null)
      this.N = (int)nf11.a(); 
  }
  
  public final void u(int paramInt) {}
  
  public final boolean v() {
    return false;
  }
  
  public final boolean w() {
    return true;
  }
  
  public final int x() {
    return 1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */