import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class c2 implements Application.ActivityLifecycleCallbacks {
  public Object b;
  
  public Activity c;
  
  public final int e;
  
  public boolean f = false;
  
  public boolean g = false;
  
  public boolean h = false;
  
  public c2(Activity paramActivity) {
    this.c = paramActivity;
    this.e = paramActivity.hashCode();
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {
    if (this.c == paramActivity) {
      this.c = null;
      this.g = true;
    } 
  }
  
  public final void onActivityPaused(Activity paramActivity) {
    if (this.g && !this.h && !this.f) {
      Object object = this.b;
      try {
        Object object1 = d2.c.get(paramActivity);
      } finally {
        paramActivity = null;
      } 
    } 
  }
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {
    if (this.c == paramActivity)
      this.f = true; 
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */