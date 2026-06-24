import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class th implements Closeable, Flushable {
  public final wz b;
  
  public th(File paramFile, long paramLong) {
    int i = wz.b;
    if (paramLong > 0L) {
      LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue();
      Pattern pattern = b12.a;
      kx kx = new kx("OkHttp DiskLruCache");
      new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, linkedBlockingQueue, kx);
      Object object = new Object();
      new LinkedHashMap<Object, Object>(0, 0.75F, true);
      new e3(8, object);
      new File(paramFile, "journal");
      new File(paramFile, "journal.tmp");
      new File(paramFile, "journal.bkp");
      this.b = (wz)object;
      return;
    } 
    l0.l("maxSize <= 0");
    throw null;
  }
  
  public final void close() {
    this.b.close();
  }
  
  public final void flush() {
    wz wz1 = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{wz}, name=null} */
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{wz}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */