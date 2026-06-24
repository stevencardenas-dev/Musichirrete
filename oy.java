public final class oy extends RuntimeException {
  public final transient os b;
  
  public oy(os paramos) {
    this.b = paramos;
  }
  
  public final Throwable fillInStackTrace() {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public final String getLocalizedMessage() {
    return this.b.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */