import android.os.Handler;
import android.util.Log;

public final class a81 {
  public final lz0 a;
  
  public final t60 b;
  
  public int c;
  
  public Object d;
  
  public final Handler e;
  
  public boolean f;
  
  public boolean g;
  
  public a81(t60 paramt60, lz0 paramlz0, uu1 paramuu1, int paramInt, Handler paramHandler) {
    this.b = paramt60;
    this.a = paramlz0;
    this.e = paramHandler;
  }
  
  public final void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield g : Z
    //   7: aload_0
    //   8: invokevirtual notifyAll : ()V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
    //   15	17	14	finally
  }
  
  public final void b() {
    n21.r(this.f ^ true);
    this.f = true;
    synchronized (this.b) {
      if (null.w || !null.j.isAlive()) {
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
        return;
      } 
      null.i.a.obtainMessage(15, this).sendToTarget();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */