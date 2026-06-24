import java.util.concurrent.atomic.AtomicReference;

public final class cu2 extends id2 {
  public final AtomicReference g;
  
  public final cl h;
  
  public cu2(cv2 paramcv2) {
    super(1);
    this.g = new AtomicReference<cv2>(paramcv2);
    this.h = new cl(paramcv2.d, 6);
  }
  
  public final void A0(wb2 paramwb2) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.S.b("onApplicationStatusChanged", new Object[0]);
    zn2 zn2 = new zn2(this, cv2, paramwb2, 4);
    this.h.post(zn2);
  }
  
  public final void B0(String paramString1, String paramString2) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.S.b("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
    lf0 lf0 = new lf0(this, cv2, paramString1, paramString2);
    this.h.post(lf0);
  }
  
  public final void C0(String paramString, byte[] paramArrayOfbyte) {
    if ((cv2)this.g.get() == null)
      return; 
    rp0 rp0 = cv2.S;
    int i = paramArrayOfbyte.length;
    cv2.S.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] { paramString, Integer.valueOf(i) });
  }
  
  public final void D0(int paramInt, long paramLong) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.v(paramLong);
  }
  
  public final void E0(long paramLong) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.v(paramLong);
  }
  
  public final void p0(int paramInt) {
    AtomicReference<cv2> atomicReference = this.g;
    cv2 cv21 = null;
    cv2 cv22 = atomicReference.getAndSet(null);
    if (cv22 != null) {
      cv22.M = -1;
      cv22.N = -1;
      cv22.A = null;
      cv22.G = null;
      cv22.K = 0.0D;
      cv22.u();
      cv22.H = false;
      cv22.L = null;
      cv21 = cv22;
    } 
    if (cv21 != null) {
      cv2.S.b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt != 0) {
        paramInt = cv21.x.get();
        uf2 uf2 = cv21.f;
        uf2.sendMessage(uf2.obtainMessage(6, paramInt, 2));
      } 
    } 
  }
  
  public final void r0(int paramInt) {}
  
  public final void s0(int paramInt) {}
  
  public final void t0(q8 paramq8, String paramString1, String paramString2, boolean paramBoolean) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.A = paramq8;
    cv2.O = paramq8.b;
    cv2.P = paramString2;
    cv2.G = paramString1;
    synchronized (cv2.T) {
      return;
    } 
  }
  
  public final void u0(int paramInt) {
    if ((cv2)this.g.get() == null)
      return; 
    synchronized (cv2.T) {
      return;
    } 
  }
  
  public final void v0(int paramInt) {
    if ((cv2)this.g.get() == null)
      return; 
    synchronized (cv2.U) {
      return;
    } 
  }
  
  public final void w0(int paramInt) {
    if ((cv2)this.g.get() == null)
      return; 
    synchronized (cv2.U) {
      return;
    } 
  }
  
  public final void x0(int paramInt) {
    cv2 cv2 = this.g.get();
    if (cv2 != null) {
      cv2.O = null;
      cv2.P = null;
      synchronized (cv2.U) {
        if (cv2.C != null)
          this.h.post(new sd(this, cv2, paramInt)); 
        return;
      } 
    } 
  }
  
  public final void y0() {
    cv2.S.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
  }
  
  public final void z0(cd2 paramcd2) {
    cv2 cv2 = this.g.get();
    if (cv2 == null)
      return; 
    cv2.S.b("onDeviceStatusChanged", new Object[0]);
    zn2 zn2 = new zn2(this, cv2, paramcd2, 3);
    this.h.post(zn2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */