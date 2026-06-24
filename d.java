import java.util.concurrent.CancellationException;

public final class d extends CancellationException {
  public final transient zq b;
  
  public d(zq paramzq) {
    super("Flow was aborted, no more elements needed");
    this.b = paramzq;
  }
  
  public final Throwable fillInStackTrace() {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */