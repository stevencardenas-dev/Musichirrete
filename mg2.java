import com.google.android.gms.common.api.Status;

public final class mg2 extends id2 {
  public final pg2 g;
  
  public mg2(pg2 parampg2) {
    super(1);
  }
  
  public final void A0(wb2 paramwb2) {
    this.g.f().post(new vi2(25, this, paramwb2));
  }
  
  public final void B0(String paramString1, String paramString2) {
    pg2.G.b("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
    this.g.f().post(new lf0(this, paramString1, paramString2, 4, false));
  }
  
  public final void C0(String paramString, byte[] paramArrayOfbyte) {
    rp0 rp0 = pg2.G;
    int i = paramArrayOfbyte.length;
    pg2.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] { paramString, Integer.valueOf(i) });
  }
  
  public final void D0(int paramInt, long paramLong) {
    this.g.e(paramInt, paramLong);
  }
  
  public final void E0(long paramLong) {
    this.g.e(0, paramLong);
  }
  
  public final void p0(int paramInt) {
    this.g.f().post(new hg2(this, paramInt, 3));
  }
  
  public final void r0(int paramInt) {
    this.g.f().post(new hg2(this, paramInt, 0));
  }
  
  public final void s0(int paramInt) {
    this.g.f().post(new hg2(this, paramInt, 1));
  }
  
  public final void t0(q8 paramq8, String paramString1, String paramString2, boolean paramBoolean) {
    pg2 pg21 = this.g;
    pg21.t = paramq8;
    pg21.u = paramString1;
    yq2 yq2 = new yq2(new Status(0, null, null, null), paramq8, paramString1, paramString2, paramBoolean);
    Object object = pg21.r;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      nt1 nt1 = pg21.o;
      if (nt1 != null)
        nt1.b(yq2); 
    } finally {}
    pg21.o = null;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void u0(int paramInt) {
    this.g.j(paramInt);
  }
  
  public final void v0(int paramInt) {
    this.g.d(paramInt);
  }
  
  public final void w0(int paramInt) {
    this.g.d(paramInt);
  }
  
  public final void x0(int paramInt) {
    pg2 pg21 = this.g;
    pg21.d(paramInt);
    if (pg21.D != null)
      pg21.f().post(new hg2(this, paramInt, 2)); 
  }
  
  public final void y0() {
    pg2.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
  }
  
  public final void z0(cd2 paramcd2) {
    this.g.f().post(new vi2(24, this, paramcd2));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */