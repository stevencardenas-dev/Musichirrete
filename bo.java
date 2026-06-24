import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class bo {
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(bo.class, "_handled$volatile");
  
  public volatile int _handled$volatile;
  
  public final Throwable a;
  
  public bo(Throwable paramThrowable, boolean paramBoolean) {
    this.a = paramThrowable;
    this._handled$volatile = paramBoolean;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append('[');
    stringBuilder.append(this.a);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */