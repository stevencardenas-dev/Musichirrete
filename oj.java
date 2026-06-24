import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class oj extends al1 {
  public static final rp0 m = new rp0("CastSession", null);
  
  public final Context c;
  
  public final HashSet d;
  
  public final be2 e;
  
  public final mj f;
  
  public final eh2 g;
  
  public final qr2 h;
  
  public pg2 i;
  
  public nf1 j;
  
  public CastDevice k;
  
  public mt2 l;
  
  public oj(Context paramContext, String paramString1, String paramString2, mj parammj, eh2 parameh2, qr2 paramqr2) {
    super(paramContext, paramString1, paramString2);
    rp0 rp01;
    this.d = new HashSet();
    this.c = paramContext.getApplicationContext();
    this.f = parammj;
    this.g = parameh2;
    this.h = paramqr2;
    sg0 sg0 = h();
    dc2 dc2 = new dc2(this);
    rp0 rp02 = lf2.a;
    rp02 = null;
    if (sg0 == null) {
      rp01 = rp02;
    } else {
      try {
        be2 be21 = lf2.b((Context)rp01).t0(parammj, sg0, dc2);
      } catch (RemoteException remoteException) {
        lf2.a.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "newCastSessionImpl", zf2.class.getSimpleName() });
        rp0 rp03 = rp02;
      } catch (wx0 wx0) {}
    } 
    this.e = (be2)wx0;
  }
  
  public final void i(double paramDouble) {
    n21.j();
    pg2 pg21 = this.i;
    if (pg21 != null && pg21.i()) {
      if (!Double.isInfinite(paramDouble) && !Double.isNaN(paramDouble)) {
        ah ah = ah.b();
        ah.d = new yf2(pg21, paramDouble);
        ah.b = 8411;
        pg21.c(1, ah.a());
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramDouble).length() + 17);
      stringBuilder.append("Volume cannot be ");
      stringBuilder.append(paramDouble);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
  }
  
  public final void j(String paramString, du2 paramdu2) {
    Parcel parcel2;
    Parcel parcel3;
    rp0 rp01 = m;
    be2 be21 = this.e;
    if (be21 == null)
      return; 
    try {
      if (paramdu2.f()) {
        q8 q8;
        boolean bool;
        String str;
        yq2 yq2 = (yq2)paramdu2.e();
        Status status = yq2.b;
        if (status.b <= 0) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool) {
          rp01.b("%s() -> success result", new Object[] { paramString });
          nf1 nf12 = new nf1();
          te2 te2 = new te2();
          this();
          this(te2);
          this.j = nf12;
          nf12.r(this.i);
          nf1 nf13 = this.j;
          zk zk = new zk();
          this(this);
          nf13.o(zk);
          this.j.s();
          qr2 qr21 = this.h;
          nf1 nf11 = this.j;
          n21.j();
          qr21.a(nf11, this.k);
          q8 = yq2.c;
          n21.m(q8);
          String str1 = yq2.e;
          str = yq2.f;
          n21.m(str);
          bool = yq2.g;
          vd2 vd22 = (vd2)be21;
          parcel3 = vd22.o();
          mh2.b(parcel3, q8);
          parcel3.writeString(str1);
          parcel3.writeString(str);
          parcel3.writeInt(bool);
          vd22.o0(parcel3, 4);
          return;
        } 
        rp01.b("%s() -> failure result", new Object[] { q8 });
        int i = ((Status)str).b;
        vd2 vd21 = (vd2)parcel3;
        parcel2 = vd21.o();
        parcel2.writeInt(i);
        vd21.o0(parcel2, 5);
        return;
      } 
    } catch (RemoteException remoteException) {}
    Exception exception = parcel2.d();
    if (exception instanceof l5) {
      int i = ((l5)exception).b.b;
      vd2 vd21 = (vd2)parcel3;
      parcel2 = vd21.o();
      parcel2.writeInt(i);
      vd21.o0(parcel2, 5);
      return;
    } 
    vd2 vd2 = (vd2)parcel3;
    Parcel parcel1 = vd2.o();
    parcel1.writeInt(2476);
    vd2.o0(parcel1, 5);
  }
  
  public final void k(int paramInt) {
    qr2 qr21 = this.h;
    if (qr21.q) {
      qr21.q = false;
      nf1 nf12 = qr21.n;
      if (nf12 != null) {
        zk zk = qr21.m;
        n21.j();
        if (zk != null)
          nf12.h.remove(zk); 
      } 
      AudioManager audioManager = (AudioManager)qr21.a.getSystemService("audio");
      if (audioManager != null)
        audioManager.abandonAudioFocus(null); 
      qr21.c.f.getClass();
      iv0.b();
      ee0 ee0 = iv0.c();
      ee0.F = null;
      p01 p01 = ee0.E;
      if (p01 != null)
        p01.b(); 
      ee0.E = null;
      cn cn = qr21.h;
      if (cn != null) {
        cn.G();
        cn.g = null;
      } 
      cn = qr21.i;
      if (cn != null) {
        cn.G();
        cn.g = null;
      } 
      zv0 zv0 = qr21.p;
      if (zv0 != null) {
        zv0.B(null, null);
        qr21.p.C(new MediaMetadataCompat(new Bundle()));
        qr21.d(0, null);
      } 
      zv0 = qr21.p;
      if (zv0 != null) {
        tv0 tv0;
        ((tv0)zv0.c).a.setActive(false);
        Iterator iterator = ((ArrayList)zv0.f).iterator();
        if (!iterator.hasNext()) {
          tv0 = (tv0)qr21.p.c;
          MediaSession mediaSession = tv0.a;
          tv0.f.kill();
          if (Build.VERSION.SDK_INT == 27)
            try {
              Field field = mediaSession.getClass().getDeclaredField("mCallback");
              field.setAccessible(true);
              Handler handler = (Handler)field.get(mediaSession);
              if (handler != null)
                handler.removeCallbacksAndMessages(null); 
            } catch (Exception exception) {
              Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", exception);
            }  
          mediaSession.setCallback(null);
          ((AtomicReference)tv0.b.g).set(null);
          mediaSession.release();
          qr21.p = null;
        } else {
          throw x41.g(tv0);
        } 
      } 
      qr21.n = null;
      qr21.o = null;
      qr21.h();
      if (paramInt == 0)
        qr21.j(); 
    } 
    pg2 pg21 = this.i;
    if (pg21 != null) {
      ah ah = ah.b();
      ah.d = zb0.g;
      ah.b = 8403;
      pg21.c(1, ah.a());
      pg21.h();
      pg21.g(pg21.k);
      this.i = null;
    } 
    this.k = null;
    nf1 nf11 = this.j;
    if (nf11 != null) {
      nf11.r(null);
      this.j = null;
    } 
  }
  
  public final void l(Bundle paramBundle) {
    lj lj;
    boolean bool1;
    CastDevice castDevice1 = CastDevice.e(paramBundle);
    this.k = castDevice1;
    if (castDevice1 == null) {
      bool1 = d();
      ef2 ef2 = this.a;
      if (bool1) {
        if (ef2 != null)
          try {
            ef2 = ef2;
            Parcel parcel = ef2.o();
            parcel.writeInt(2153);
            ef2.o0(parcel, 15);
            return;
          } catch (RemoteException remoteException) {
            al1.b.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "notifyFailedToResumeSession", ef2.class.getSimpleName() });
            return;
          }  
      } else if (remoteException != null) {
        try {
          xe2 xe2 = (xe2)remoteException;
          Parcel parcel = xe2.o();
          parcel.writeInt(2151);
          xe2.o0(parcel, 12);
          return;
        } catch (RemoteException remoteException1) {
          al1.b.a((Exception)remoteException1, "Unable to call %s on %s.", new Object[] { "notifyFailedToStartSession", ef2.class.getSimpleName() });
          return;
        } 
      } 
      return;
    } 
    pg2 pg22 = this.i;
    a31 a31 = null;
    if (pg22 != null) {
      ah ah = ah.b();
      ah.d = zb0.g;
      ah.b = 8403;
      pg22.c(1, ah.a());
      pg22.h();
      pg22.g(pg22.k);
      this.i = null;
    } 
    m.b("Acquiring a connection to Google Play Services for %s", new Object[] { this.k });
    CastDevice castDevice2 = this.k;
    n21.m(castDevice2);
    Bundle bundle = new Bundle();
    mj mj1 = this.f;
    if (mj1 == null) {
      mj1 = null;
    } else {
      lj = mj1.h;
    } 
    if (lj != null)
      a31 = lj.f; 
    boolean bool2 = false;
    if (lj != null && lj.g) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (a31 != null)
      bool2 = true; 
    bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", bool2);
    bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", bool1);
    eh2 eh21 = this.g;
    bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", eh21.q0());
    bundle.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", eh21.m);
    p01 p01 = new p01(castDevice2, new fu2(this));
    p01.f = bundle;
    aj aj = new aj(p01);
    Context context = this.c;
    int i = bj.a;
    pg2 pg21 = new pg2(context, aj);
    zv2 zv2 = new zv2(this);
    pg21.E.add(zv2);
    this.i = pg21;
    qo0 qo0 = pg21.b(pg21.k);
    tk tk = new tk();
    a42 a421 = new a42(12, pg21);
    fb0 fb0 = fb0.c;
    pg21.F = 2;
    tk.e = qo0;
    tk.c = a421;
    tk.d = fb0;
    tk.f = new u70[] { g92.i };
    tk.b = 8428;
    po0 po0 = ((qo0)tk.e).a;
    n21.n("Key must not be null", po0);
    qo0 = (qo0)tk.e;
    u70[] arrayOfU70 = (u70[])tk.f;
    i = tk.b;
    Object object = new Object();
    ((of)object).d = tk;
    ((of)object).b = qo0;
    ((of)object).c = arrayOfU70;
    ((of)object).a = true;
    a42 a422 = new a42(tk, po0);
    n21.n("Listener has already been released.", qo0.a);
    oe0 oe0 = pg21.j;
    oe0.getClass();
    nt1 nt1 = new nt1();
    oe0.b(nt1, i, pg21);
    ab2 ab2 = new ab2(new ib2(new bb2((of)object, a422), nt1), oe0.k.get(), pg21);
    object = oe0.o;
    object.sendMessage(object.obtainMessage(8, ab2));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */