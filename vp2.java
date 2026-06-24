import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;

public final class vp2 extends rv0 {
  public final qr2 f;
  
  public vp2(qr2 paramqr2) {}
  
  public final void b(String paramString) {
    nf1 nf12;
    bl1 bl1;
    nf1 nf11;
    qr2.v.b("onCustomAction with action = %s", new Object[] { paramString });
    int i = paramString.hashCode();
    qr2 qr21 = this.f;
    switch (i) {
      case 1362116196:
        if (paramString.equals(ckOPp.gWeiplEwgXIlnCu)) {
          long l = qr21.e.e;
          nf12 = qr21.n;
          if (nf12 != null) {
            l = Math.max(0L, nf12.a() + l);
            l = Math.min(nf12.f(), l);
            nf12 = qr21.n;
            if (nf12 != null) {
              nf12.p(new ov0(l));
              return;
            } 
          } 
          return;
        } 
        break;
      case -124479363:
        if (nf12.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
          bl1 = qr21.d;
          if (bl1 != null) {
            bl1.b(false);
            return;
          } 
          return;
        } 
        break;
      case -668151673:
        if (bl1.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
          bl1 = qr21.d;
          if (bl1 != null) {
            bl1.b(true);
            return;
          } 
          return;
        } 
        break;
      case -1699820260:
        if (bl1.equals("com.google.android.gms.cast.framework.action.REWIND")) {
          long l = -qr21.e.e;
          nf11 = qr21.n;
          if (nf11 != null) {
            l = Math.max(0L, nf11.a() + l);
            l = Math.min(nf11.f(), l);
            nf11 = qr21.n;
            if (nf11 != null) {
              nf11.p(new ov0(l));
              return;
            } 
          } 
          return;
        } 
        break;
    } 
    Intent intent = new Intent((String)nf11);
    intent.setComponent(qr21.g);
    i = Build.VERSION.SDK_INT;
    Context context = qr21.a;
    if (i < 34) {
      context.sendBroadcast(intent);
      return;
    } 
    context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
  }
  
  public final boolean c(Intent paramIntent) {
    qr2.v.b("onMediaButtonEvent", new Object[0]);
    KeyEvent keyEvent = (KeyEvent)paramIntent.getParcelableExtra(tlzLOCPTHRhep.VgzKdtgqtgwOc);
    if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
      nf1 nf1 = this.f.n;
      if (nf1 != null)
        nf1.q(); 
    } 
    return true;
  }
  
  public final void d() {
    qr2.v.b("onPause", new Object[0]);
    nf1 nf1 = this.f.n;
    if (nf1 != null)
      nf1.q(); 
  }
  
  public final void e() {
    qr2.v.b("onPlay", new Object[0]);
    nf1 nf1 = this.f.n;
    if (nf1 != null)
      nf1.q(); 
  }
  
  public final void f(long paramLong) {
    rp0 rp0 = qr2.v;
    qr2.v.b("onSeekTo %d", new Object[] { Long.valueOf(paramLong) });
    nf1 nf1 = this.f.n;
    if (nf1 == null)
      return; 
    nf1.p(new ov0(paramLong));
  }
  
  public final void g() {
    qr2.v.b("onSkipToNext", new Object[0]);
    nf1 nf1 = this.f.n;
    if (nf1 != null) {
      n21.j();
      if (!nf1.v()) {
        nf1.u();
        return;
      } 
      nf1.w(new hd2(nf1, 1, false));
    } 
  }
  
  public final void h() {
    qr2.v.b("onSkipToPrevious", new Object[0]);
    nf1 nf1 = this.f.n;
    if (nf1 != null) {
      n21.j();
      if (!nf1.v()) {
        nf1.u();
        return;
      } 
      nf1.w(new hd2(nf1, 0, false));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */