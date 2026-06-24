import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class pi extends bo {
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(pi.class, "_resumed$volatile");
  
  public volatile int _resumed$volatile = 0;
  
  public pi(ni paramni, Throwable paramThrowable, boolean paramBoolean) {
    super(throwable, paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */