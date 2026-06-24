public final class ak0 extends ni {
  public final dk0 m;
  
  public ak0(cs paramcs, dk0 paramdk0) {
    super(1, paramcs);
    this.m = paramdk0;
  }
  
  public final String D() {
    return "AwaitContinuation";
  }
  
  public final Throwable t(dk0 paramdk0) {
    Object object = this.m.I();
    if (object instanceof ck0) {
      Throwable throwable = ((ck0)object).e();
      if (throwable != null)
        return throwable; 
    } 
    return (object instanceof bo) ? ((bo)object).a : paramdk0.C();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ak0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */