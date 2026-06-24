package androidx.work;

import ad0;
import android.content.Context;
import bt;
import ct;
import dd1;
import ei;
import g92;
import ms;
import oo0;
import os;
import ui0;
import xj0;
import zo2;

public abstract class CoroutineWorker extends oo0 {
  public final WorkerParameters e;
  
  public final bt f;
  
  public CoroutineWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
    this.e = paramWorkerParameters;
    this.f = bt.e;
  }
  
  public final ei a() {
    xj0 xj0 = g92.a();
    bt bt1 = this.f;
    bt1.getClass();
    return zo2.D(dd1.f0((ms)bt1, (os)xj0), (ad0)new ct(this, null, 0));
  }
  
  public final ei b() {
    os os;
    bt bt2 = bt.e;
    bt bt1 = this.f;
    if (ui0.c(bt1, bt2))
      os = this.e.d; 
    os.getClass();
    return zo2.D(os.k((os)g92.a()), (ad0)new ct(this, null, 1));
  }
  
  public abstract Object c(ct paramct);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\CoroutineWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */