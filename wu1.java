public final class wu1 extends gj1 implements Runnable {
  public final long i;
  
  public wu1(long paramLong, qp paramqp) {
    super(paramqp, os);
    this.i = paramLong;
  }
  
  public final String S() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.S());
    stringBuilder.append("(timeMillis=");
    stringBuilder.append(this.i);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
  
  public final void run() {
    ui0.w(this.g);
    StringBuilder stringBuilder = new StringBuilder("Timed out waiting for ");
    stringBuilder.append(this.i);
    stringBuilder.append(" ms");
    u(new vu1(stringBuilder.toString(), this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */