public abstract class yj0 extends yo0 implements k00, qh0 {
  public dk0 i;
  
  public final boolean a() {
    return true;
  }
  
  public final void b() {
    q().Z(this);
  }
  
  public final f21 d() {
    return null;
  }
  
  public vj0 getParent() {
    return q();
  }
  
  public final dk0 q() {
    dk0 dk01 = this.i;
    if (dk01 != null)
      return dk01; 
    ui0.n0("job");
    throw null;
  }
  
  public abstract boolean r();
  
  public abstract void s(Throwable paramThrowable);
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append('@');
    stringBuilder.append(qv.s(this));
    stringBuilder.append("[job@");
    stringBuilder.append(qv.s(q()));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */