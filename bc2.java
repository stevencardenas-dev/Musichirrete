import android.os.Process;

public final class bc2 extends Thread {
  public final void run() {
    Exception exception;
    Process.setThreadPriority(19);
    /* monitor enter ThisExpression{ObjectType{bc2}} */
    try {
      while (true)
        wait(); 
    } catch (InterruptedException null) {
      /* monitor exit ThisExpression{ObjectType{bc2}} */
      return;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{bc2}} */
    throw exception;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */