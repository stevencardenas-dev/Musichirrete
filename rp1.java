import android.os.HandlerThread;

public final class rp1 {
  public final bh0 a;
  
  public final cj b;
  
  public long c;
  
  public long d;
  
  public long e;
  
  public long f;
  
  public long g;
  
  public long h;
  
  public long i;
  
  public long j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public rp1(bh0 parambh0) {
    this.a = parambh0;
    HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
    handlerThread.start();
    cl cl = new cl(handlerThread.getLooper(), 3, false);
    cl.sendMessageDelayed(cl.obtainMessage(), 1000L);
    this.b = new cj(handlerThread.getLooper(), this, 10);
  }
  
  public final sp1 a() {
    null = (tp0)this.a.c;
    synchronized ((fb0)null.g) {
      int i = null.b;
      null = (tp0)this.a.c;
      synchronized ((fb0)null.g) {
        int j = null.c;
        return new sp1(i, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, System.currentTimeMillis());
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */