import java.util.concurrent.ExecutionException;

public abstract class s82 {
  public static final String a = qp0.j("WorkerWrapper");
  
  public static final Object a(ho0 paramho0, oo0 paramoo0, pr1 parampr1) {
    try {
      boolean bool1 = paramho0.isDone();
      boolean bool = false;
      if (bool1)
        while (true) {
          try {
            paramoo0 = paramho0.get();
            return paramoo0;
          } catch (InterruptedException interruptedException) {
          
          } finally {
            if (bool)
              Thread.currentThread().interrupt(); 
          } 
        }  
      ni ni = new ni(1, dd1.N(parampr1));
      ni.x();
      paramho0.a(new bv1(paramho0, ni, 0), sz.b);
      ni.z(new r82((oo0)interruptedException, paramho0));
      return ni.v();
    } catch (ExecutionException executionException) {
      Throwable throwable = executionException.getCause();
      throwable.getClass();
      throw throwable;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */