public final class cc0 extends RuntimeException {
  public final dc0 b;
  
  public final Throwable c;
  
  public cc0(dc0 paramdc0, Throwable paramThrowable) {
    super(paramThrowable);
    this.b = paramdc0;
    this.c = paramThrowable;
  }
  
  public final Throwable getCause() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */