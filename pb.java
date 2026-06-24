import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class pb implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
  public static final pb g = new pb();
  
  public final AtomicBoolean b = new AtomicBoolean();
  
  public final AtomicBoolean c = new AtomicBoolean();
  
  public final ArrayList e = new ArrayList();
  
  public boolean f = false;
  
  public final void a(boolean paramBoolean) {
    pb pb1 = g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{pb}, name=null} */
    try {
      ArrayList<Object> arrayList = this.e;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        oe0 oe0 = (oe0)arrayList.get(b);
        b++;
        oe0 = ((pa2)oe0).a;
        Message message = oe0.o.obtainMessage(1, Boolean.valueOf(paramBoolean));
        oe0.o.sendMessage(message);
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{pb}, name=null} */
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool)
      a(false); 
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool)
      a(false); 
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt) {
    if (paramInt == 20 && this.b.compareAndSet(false, true)) {
      this.c.set(true);
      a(true);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */