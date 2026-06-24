import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class kd extends hc {
  public static final Handler H = new Handler(Looper.getMainLooper());
  
  public final jd A = new jd(this, 0);
  
  public ScheduledFuture B;
  
  public final jd C = new jd(this, 1);
  
  public int D = 0;
  
  public final id E = new id(this);
  
  public final id F = new id(this);
  
  public final jd G = new jd(this, 2);
  
  public hc m;
  
  public hc n;
  
  public final int o;
  
  public boolean p;
  
  public String q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t = true;
  
  public int u = 0;
  
  public final ScheduledThreadPoolExecutor v = new ScheduledThreadPoolExecutor(1);
  
  public boolean w;
  
  public boolean x;
  
  public final e y = new e(3, this);
  
  public final id z = new id(this);
  
  public kd(Context paramContext, int paramInt) {
    super(paramContext);
    this.o = paramInt;
  }
  
  public static String h0(kd paramkd) {
    hc hc1 = paramkd.m;
    return (hc1 instanceof w60 && ((w60)hc1).m.A() == 2) ? String.valueOf((((w60)paramkd.m).m.z(1)).i.f()) : paramkd.n.b;
  }
  
  public final int A() {
    return this.m.A();
  }
  
  public final int C() {
    return this.m.C();
  }
  
  public final float D() {
    return this.m.D();
  }
  
  public final float E() {
    return this.m.E();
  }
  
  public final int F() {
    return this.m.F();
  }
  
  public final void G(Context paramContext) {
    boolean bool = false;
    int i = this.o;
    if (i == 1) {
      this.m = new n4(paramContext);
      this.n = new n4(paramContext);
      this.m.G(paramContext);
      this.n.G(paramContext);
      if (MyApplication.o().getInt("etu2", 0) == 1) {
        i = this.m.x();
        this.n.T(i);
      } 
    } else if (i == 0) {
      w60 w60 = new w60(paramContext, MyApplication.e().generateAudioSessionId(), f01.b());
      this.m = w60;
      w60.G(paramContext);
      if (MyApplication.o().getInt("etu2", 0) == 1) {
        i = this.m.x();
      } else {
        i = MyApplication.e().generateAudioSessionId();
      } 
      w60 = new w60(paramContext, i, f01.b());
      this.n = w60;
      w60.G(paramContext);
    } 
    hc hc1 = this.m;
    id id1 = this.F;
    hc1.e = id1;
    id id2 = this.z;
    hc1.c = id2;
    id id3 = this.E;
    hc1.f = id3;
    hc1 = this.n;
    hc1.e = id1;
    hc1.c = id2;
    hc1.f = id3;
    i = bool;
    if (ws2.U())
      if (MyApplication.o().getInt("etu2", 0) == 1) {
        i = bool;
      } else {
        i = MyApplication.o().getInt("k_i_cfd", 0);
      }  
    this.u = i;
    this.t = MyApplication.o().getBoolean(nFLlOYeP.VkHk, true);
  }
  
  public final boolean H() {
    return this.m.H();
  }
  
  public final boolean I() {
    return this.w;
  }
  
  public final boolean J() {
    return this.m.J();
  }
  
  public final void L() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic kd.H : Landroid/os/Handler;
    //   5: astore_1
    //   6: aload_1
    //   7: aload_0
    //   8: getfield y : Le;
    //   11: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   14: aload_1
    //   15: aload_0
    //   16: getfield y : Le;
    //   19: ldc2_w 1000
    //   22: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   25: pop
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	29	finally
    //   30	32	29	finally
  }
  
  public final void M() {
    o0();
    this.m.M();
    if (this.u > 0 && this.r)
      j0(); 
  }
  
  public final void N(int paramInt1, int paramInt2, Runnable paramRunnable) {
    o0();
    super.N(paramInt1, paramInt2, paramRunnable);
    if (this.u > 0 && this.r)
      j0(); 
  }
  
  public final void O() {
    H.removeCallbacks(this.G);
    o0();
    this.m.O();
    this.n.O();
    this.v.shutdownNow();
    this.e = null;
    this.c = null;
    this.f = null;
  }
  
  public final void Q() {
    H.removeCallbacks(this.G);
    o0();
    this.m.P();
    this.n.P();
    this.b = null;
    this.q = null;
    this.s = false;
  }
  
  public final void R(int paramInt) {
    o0();
    this.m.R(paramInt);
    k0();
  }
  
  public final void S(int paramInt) {
    if (this.o == 0) {
      MusicService musicService = MusicService.P0;
      if (musicService != null)
        musicService.x0 = -1; 
      this.m.S(paramInt);
      this.n.S(paramInt);
    } 
    super.S(paramInt);
  }
  
  public final void T(int paramInt) {
    this.m.T(paramInt);
    this.n.T(paramInt);
  }
  
  public final void U() {
    this.m.U();
    this.n.U();
  }
  
  public final void W(String paramString, boolean paramBoolean) {
    o0();
    this.m.V(paramString, paramBoolean);
  }
  
  public final void Y(int paramInt1, int paramInt2) {
    this.m.Y(paramInt1, paramInt2);
    this.n.Y(paramInt1, paramInt2);
  }
  
  public final void a0(float paramFloat) {
    this.m.a0(paramFloat);
    this.n.a0(paramFloat);
  }
  
  public final void b0(float paramFloat) {
    this.m.b0(paramFloat);
    this.n.b0(paramFloat);
    k0();
  }
  
  public final void c0(int paramInt) {
    o0();
    this.m.c0(paramInt);
  }
  
  public final void d0() {
    if (this.m instanceof w60) {
      this.q = null;
      o0();
      ((w60)this.m).f(qn.e);
    } 
  }
  
  public final void e0() {
    o0();
    this.m.e0();
    if (this.m.J())
      this.D = 0; 
    k0();
  }
  
  public final void f0(int paramInt1, int paramInt2) {
    o0();
    super.f0(paramInt1, paramInt2);
    if (this.m.J())
      this.D = 0; 
    k0();
  }
  
  public final void g0() {
    o0();
    this.m.g0();
  }
  
  public final void i0() {
    /* monitor enter ThisExpression{ObjectType{kd}} */
    try {
      if (this.u > 0 || this.t) {
        String str;
        boolean bool = this.x;
        km0 km0 = null;
        if (bool) {
          str = null;
        } else {
          str = this.l.a();
        } 
        if (!TextUtils.equals(str, this.q)) {
          this.r = false;
          if (this.u > 0) {
            bool = this.p;
            if (bool) {
              /* monitor exit ThisExpression{ObjectType{kd}} */
              return;
            } 
          } 
          this.q = str;
          int i = this.o;
          if (i == 1) {
            if (str != null) {
              n0();
            } else {
              n0();
            } 
          } else if (i == 0) {
            if (str != null) {
              boolean bool1 = this.t;
              lm0 lm0 = MyApplication.j.c;
              wo wo = new wo();
              this(str, null);
              km0 km01 = lm0.b(wo);
              if (km01 != null) {
                i = km01.c.g;
              } else {
                i = -1;
              } 
              bool = bool1;
              if (bool1) {
                bool = bool1;
                if (this.u > 0) {
                  bool = bool1;
                  if (i > 0) {
                    int k = this.m.C();
                    int j = k;
                    if (k <= 0) {
                      km0 km02;
                      String str1 = this.b;
                      km01 = km0;
                      if (str1 != null) {
                        lm0 lm01 = MyApplication.j.c;
                        wo wo1 = new wo();
                        this(str1, null);
                        km02 = lm01.b(wo1);
                      } 
                      j = k;
                      if (km02 != null)
                        j = km02.c.g; 
                    } 
                    k = this.u;
                    bool = bool1;
                    if (j > k) {
                      bool = bool1;
                      if (i > k * 2)
                        bool = false; 
                    } 
                  } 
                } 
              } 
              if (bool) {
                ((w60)this.m).h0(this.q);
                this.r = true;
                this.s = true;
              } else if (this.u > 0) {
                n0();
                this.n.V(this.q, false);
              } else {
                n0();
              } 
            } else {
              n0();
            } 
          } 
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{kd}} */
  }
  
  public final void j0() {
    jd jd1 = this.C;
    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.v;
    scheduledThreadPoolExecutor.remove(jd1);
    ScheduledFuture scheduledFuture = this.B;
    if (scheduledFuture != null) {
      scheduledFuture.cancel(false);
      scheduledThreadPoolExecutor.purge();
      this.B = null;
    } 
  }
  
  public final void k0() {
    j0();
    if (this.u > 0 && this.s && this.r && this.m.K() && !this.m.j && this.n.C() > this.u * 2 && this.m.C() > this.u) {
      int k = this.m.A();
      int m = this.m.C();
      int j = m - this.u;
      int i = m - k;
      MyApplication.F.getClass();
      if (yp1.a())
        i = m * 2; 
      if (i > 0) {
        if (j > k) {
          i = (int)(Math.abs(k - j) / this.m.E());
          try {
            this.B = this.v.schedule(this.C, i, TimeUnit.MILLISECONDS);
            return;
          } catch (RejectedExecutionException rejectedExecutionException) {
            rejectedExecutionException.printStackTrace();
            return;
          } 
        } 
        H.post(this.A);
      } 
    } 
  }
  
  public final void l0(boolean paramBoolean) {
    if (paramBoolean != this.t) {
      this.t = paramBoolean;
      if (paramBoolean) {
        L();
        return;
      } 
      if (this.r)
        n0(); 
    } 
  }
  
  public final void m0(String paramString) {
    hc hc1;
    if (Objects.equals(this.m.b, paramString)) {
      hc1 = this.m;
    } else if (Objects.equals(this.n.b, hc1)) {
      hc1 = this.n;
    } else {
      hc1 = null;
    } 
    if (hc1 != null) {
      int i = (int)((this.m.C() - this.m.A()) / this.m.E());
      if (i > 1000) {
        StringBuilder stringBuilder = new StringBuilder("bpp:sfote>");
        stringBuilder.append(hc1);
        n21.F(stringBuilder.toString());
        this.x = true;
        if (!this.p)
          hc1.N(i, 0, new e3(3, hc1)); 
      } 
    } 
  }
  
  public final void n0() {
    try {
      int i = this.o;
      if (i == 1) {
        ((n4)this.m).m.setNextMediaPlayer(null);
        ((n4)this.n).m.setNextMediaPlayer(null);
      } else if (i == 0) {
        ((w60)this.m).h0(null);
        ((w60)this.n).h0(null);
      } 
    } finally {
      Exception exception;
    } 
    hc hc1 = this.n;
    hc1.k = false;
    hc1.j = false;
    try {
      hc1.g0();
    } finally {}
    this.n.c0(0);
    this.n.P();
    this.s = false;
    k0();
  }
  
  public final void o0() {
    if (this.p) {
      n21.F("bpp>scf");
      hc hc1 = this.m;
      if (hc1.k)
        hc1.c0(100); 
      hc1 = this.m;
      hc1.k = false;
      hc1.j = false;
      n0();
      this.p = false;
      L();
      if (this.x)
        m0(this.m.b); 
    } 
  }
  
  public final void u(int paramInt) {
    this.m.u(paramInt);
    this.n.u(paramInt);
  }
  
  public final boolean v() {
    return this.m.v();
  }
  
  public final boolean w() {
    return this.m.w();
  }
  
  public final int x() {
    try {
      return this.m.x();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final List y() {
    try {
      return Arrays.asList(new Integer[] { Integer.valueOf(this.m.x()), Integer.valueOf(this.n.x()) });
    } finally {
      Exception exception = null;
    } 
  }
  
  public final int z() {
    hc hc1 = this.m;
    return (hc1 instanceof w60) ? hc1.z() : 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */