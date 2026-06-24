import java.util.concurrent.ScheduledFuture;

public final class j00 implements k00 {
  public final ScheduledFuture b;
  
  public j00(ScheduledFuture paramScheduledFuture) {
    this.b = paramScheduledFuture;
  }
  
  public final void b() {
    this.b.cancel(false);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DisposableFutureHandle[");
    stringBuilder.append(this.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */