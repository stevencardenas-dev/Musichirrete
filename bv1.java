import java.util.concurrent.ExecutionException;

public final class bv1 implements Runnable {
  public final int b;
  
  public final ho0 c;
  
  public final ni e;
  
  public final void run() {
    Throwable throwable;
    int i = this.b;
    ni ni1 = this.e;
    ho0 ho01 = this.c;
    switch (i) {
      default:
        if (ho01.isCancelled()) {
          ni1.p(null);
        } else {
          try {
            ni1.f(e0.g(ho01));
          } catch (ExecutionException executionException) {
            throwable = executionException.getCause();
            if (throwable != null) {
              ni1.f(new qg1(throwable));
              return;
            } 
          } 
        } 
        return;
      case 0:
        break;
    } 
    if (throwable.isCancelled()) {
      ni1.p(null);
    } else {
      i = 0;
      while (true) {
        try {
          Object object = throwable.get();
          if (i != 0)
            return; 
        } catch (InterruptedException interruptedException) {
        
        } finally {
          if (i != 0)
            Thread.currentThread().interrupt(); 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */