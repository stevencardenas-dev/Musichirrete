import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public final class bn1 extends hd {
  public final lz0[] b;
  
  public final p60 c;
  
  public final Handler d;
  
  public final CopyOnWriteArraySet e;
  
  public final CopyOnWriteArraySet f;
  
  public final wv g;
  
  public final i4 h;
  
  public final m9 i;
  
  public final q9 j;
  
  public final up k;
  
  public final nf l;
  
  public Surface m;
  
  public boolean n;
  
  public int o;
  
  public int p;
  
  public k9 q;
  
  public final float r;
  
  public ad s;
  
  public boolean t;
  
  public bn1(Context paramContext, f paramf, zv0 paramzv0, nw paramnw, wv paramwv, i4 parami4, Looper paramLooper) {
    boolean bool;
    this.g = paramwv;
    this.h = parami4;
    an1 an1 = new an1(this);
    CopyOnWriteArraySet<i4> copyOnWriteArraySet1 = new CopyOnWriteArraySet();
    this.e = copyOnWriteArraySet1;
    CopyOnWriteArraySet<i4> copyOnWriteArraySet2 = new CopyOnWriteArraySet();
    this.f = copyOnWriteArraySet2;
    new CopyOnWriteArraySet();
    CopyOnWriteArraySet<i4> copyOnWriteArraySet4 = new CopyOnWriteArraySet();
    CopyOnWriteArraySet<i4> copyOnWriteArraySet3 = new CopyOnWriteArraySet();
    CopyOnWriteArraySet<i4> copyOnWriteArraySet5 = new CopyOnWriteArraySet();
    Handler handler = new Handler(paramLooper);
    this.d = handler;
    lz0 lz01 = ((w60)paramf.c).y;
    lz0[] arrayOfLz0 = new lz0[1];
    arrayOfLz0[0] = lz01;
    this.b = arrayOfLz0;
    this.r = 1.0F;
    this.q = k9.b;
    p60 p601 = new p60(arrayOfLz0, paramzv0, paramnw, paramwv, paramLooper);
    this.c = p601;
    if (parami4.f == null || parami4.e.a.isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.r(bool);
    parami4.f = p601;
    fd fd = new fd(parami4);
    CopyOnWriteArrayList<fd> copyOnWriteArrayList1 = p601.g;
    copyOnWriteArrayList1.addIfAbsent(fd);
    copyOnWriteArrayList1.addIfAbsent(new fd(an1));
    copyOnWriteArraySet3.add(parami4);
    copyOnWriteArraySet1.add(parami4);
    copyOnWriteArraySet5.add(parami4);
    copyOnWriteArraySet2.add(parami4);
    copyOnWriteArraySet4.add(parami4);
    gh1 gh1 = paramwv.c;
    gh1.getClass();
    CopyOnWriteArrayList<m50> copyOnWriteArrayList = (CopyOnWriteArrayList)gh1.c;
    for (m50 m50 : copyOnWriteArrayList) {
      if (m50.b == parami4) {
        m50.c = true;
        copyOnWriteArrayList.remove(m50);
      } 
    } 
    copyOnWriteArrayList.add(new m50(handler, parami4));
    Object object = new Object();
    ((m9)object).b = paramContext.getApplicationContext();
    ((m9)object).c = new l9((m9)object, handler, an1);
    this.i = (m9)object;
    this.j = new q9(paramContext, handler, an1);
    object = new Object();
    ((up)object).c = paramContext.getApplicationContext().getSystemService("power");
    this.k = (up)object;
    object = new Object();
    WifiManager wifiManager = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
    this.l = (nf)object;
  }
  
  public static void l(bn1 parambn1, int paramInt1, int paramInt2) {
    if (paramInt1 != parambn1.o || paramInt2 != parambn1.p) {
      parambn1.o = paramInt1;
      parambn1.p = paramInt2;
      for (i4 i41 : parambn1.e) {
        i41.f(i41.e.f);
        Iterator iterator = i41.b.iterator();
        if (!iterator.hasNext())
          continue; 
        throw x41.g(iterator);
      } 
    } 
  }
  
  public static void m(bn1 parambn1, Surface paramSurface, boolean paramBoolean) {
    ArrayList<Surface> arrayList = new ArrayList();
    lz0[] arrayOfLz0 = parambn1.b;
    int i = arrayOfLz0.length;
    byte b;
    for (b = 0; b < i; b++)
      arrayOfLz0[b].getClass(); 
    Surface surface = parambn1.m;
    if (surface != null && surface != paramSurface) {
      try {
        i = arrayList.size();
        b = 0;
        while (b < i) {
          surface = arrayList.get(b);
          b++;
          a81 a81 = (a81)surface;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{a81}, name=null} */
          try {
            boolean bool;
            n21.r(a81.f);
            if (a81.e.getLooper().getThread() != Thread.currentThread()) {
              bool = true;
            } else {
              bool = false;
            } 
            n21.r(bool);
            while (!a81.g)
              a81.wait(); 
          } finally {}
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{a81}, name=null} */
        } 
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
      if (parambn1.n)
        parambn1.m.release(); 
    } 
    parambn1.m = paramSurface;
    parambn1.n = paramBoolean;
  }
  
  public final boolean c() {
    return this.c.j;
  }
  
  public final int d() {
    return this.c.q.e;
  }
  
  public final int e() {
    return this.c.k;
  }
  
  public final int n() {
    return this.c.n();
  }
  
  public final long o() {
    fw0 fw0;
    p60 p601 = this.c;
    su1 su1 = p601.h;
    boolean bool = p601.p();
    q71 q71 = p601.q;
    if (bool) {
      fw0 = q71.b;
      q71.a.g(fw0.a, su1);
      int i = fw0.b;
      su1.f.c[i].getClass();
      return rh.b(-9223372036854775807L);
    } 
    uu1 uu1 = q71.a;
    return uu1.n() ? -9223372036854775807L : rh.b((uu1.l(fw0.n(), (tu1)((hd)fw0).a, 0L)).j);
  }
  
  public final void p(ad paramad, boolean paramBoolean) {
    ad ad1 = this.s;
    i4 i41 = this.h;
    if (ad1 != null) {
      ad1.n(i41);
      i41.l();
    } 
    this.s = paramad;
    d7 d7 = paramad.c;
    d7.getClass();
    Handler handler = this.d;
    if (handler != null && i41 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.h(bool);
    ((CopyOnWriteArrayList<iw0>)d7.e).add(new iw0(handler, i41));
    p60 p601 = this.c;
    boolean bool = p601.j;
    u(this.j.c(2, bool), bool);
    q71 q71 = p601.o(true, paramBoolean, true, 2);
    p601.m = true;
    p601.l++;
    p601.e.i.a.obtainMessage(0, 1, paramBoolean, paramad).sendToTarget();
    p601.t(q71, false, 4, 1, false);
  }
  
  public final void q(int paramInt, long paramLong) {
    i4 i41 = this.h;
    h4 h4 = i41.e;
    if (!h4.h) {
      i41.k();
      h4.h = true;
      Iterator iterator = i41.b.iterator();
      if (iterator.hasNext())
        throw x41.g(iterator); 
    } 
    p60 p601 = this.c;
    tu1 tu1 = (tu1)p601.a;
    uu1 uu1 = p601.q.a;
    if (paramInt >= 0 && (uu1.n() || paramInt < uu1.m())) {
      p601.n = true;
      p601.l++;
      if (p601.p()) {
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        p601.d.obtainMessage(0, 1, -1, p601.q).sendToTarget();
      } else {
        p601.r = paramInt;
        boolean bool = uu1.n();
        long l = 0L;
        if (bool) {
          if (paramLong != -9223372036854775807L)
            l = paramLong; 
          p601.t = l;
          p601.s = 0;
        } else {
          if (paramLong == -9223372036854775807L) {
            l = (uu1.l(paramInt, tu1, 0L)).i;
          } else {
            l = rh.a(paramLong);
          } 
          Pair pair = uu1.i(tu1, p601.h, paramInt, l);
          p601.t = rh.b(l);
          p601.s = uu1.b(pair.first);
        } 
        t60 t60 = p601.e;
        paramLong = rh.a(paramLong);
        w9 w9 = t60.i;
        s60 s60 = new s60(uu1, paramInt, paramLong);
        w9.a.obtainMessage(3, s60).sendToTarget();
        p601.q(new m60(1));
      } 
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final void r(boolean paramBoolean) {
    u(this.j.c(d(), paramBoolean), paramBoolean);
  }
  
  public final void s(r71 paramr71) {
    p60 p601 = this.c;
    if (p601.p.equals(paramr71))
      return; 
    p601.o++;
    p601.p = paramr71;
    p601.e.i.a.obtainMessage(4, paramr71).sendToTarget();
    p601.q(new m60(2, paramr71));
  }
  
  public final void t(boolean paramBoolean) {
    p60 p601 = this.c;
    boolean bool = p601.j;
    this.j.c(1, bool);
    q71 q71 = p601.o(paramBoolean, paramBoolean, paramBoolean, 1);
    p601.l++;
    p601.e.i.a.obtainMessage(6, paramBoolean, 0).sendToTarget();
    p601.t(q71, false, 4, 1, false);
    ad ad1 = this.s;
    if (ad1 != null) {
      i4 i41 = this.h;
      ad1.n(i41);
      i41.l();
      if (paramBoolean)
        this.s = null; 
    } 
  }
  
  public final void u(int paramInt, boolean paramBoolean) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    if (paramBoolean && paramInt != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (paramBoolean && paramInt != 1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    p60 p601 = this.c;
    boolean bool5 = p601.f();
    if (p601.j && p601.k == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramBoolean && paramInt == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 != bool2)
      p601.e.i.a.obtainMessage(1, bool2, 0).sendToTarget(); 
    if (p601.j != paramBoolean) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (p601.k != paramInt) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    p601.j = paramBoolean;
    p601.k = paramInt;
    boolean bool6 = p601.f();
    if (bool5 != bool6) {
      bool5 = true;
    } else {
      bool5 = false;
    } 
    if (bool3 || bool4 || bool5) {
      p601.q(new n60(bool3, paramBoolean, p601.q.e, bool4, paramInt, bool5, bool6));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */