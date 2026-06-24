import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

public class xf1 extends Fragment {
  public static final int b = 0;
  
  public final void a(om0 paramom0) {
    if (Build.VERSION.SDK_INT < 29) {
      Activity activity = getActivity();
      activity.getClass();
      vf1.a(activity, paramom0);
    } 
  }
  
  public final void onActivityCreated(Bundle paramBundle) {
    super.onActivityCreated(paramBundle);
    a(om0.ON_CREATE);
  }
  
  public final void onDestroy() {
    super.onDestroy();
    a(om0.ON_DESTROY);
  }
  
  public final void onPause() {
    super.onPause();
    a(om0.ON_PAUSE);
  }
  
  public final void onResume() {
    super.onResume();
    a(om0.ON_RESUME);
  }
  
  public final void onStart() {
    super.onStart();
    a(om0.ON_START);
  }
  
  public final void onStop() {
    super.onStop();
    a(om0.ON_STOP);
  }
  
  public static final class a implements Application.ActivityLifecycleCallbacks {
    public static final wf1 Companion = (wf1)new Object();
    
    public static final void registerIn(Activity param1Activity) {
      Companion.getClass();
      wf1.a(param1Activity);
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {
      param1Activity.getClass();
    }
    
    public void onActivityDestroyed(Activity param1Activity) {
      param1Activity.getClass();
    }
    
    public void onActivityPaused(Activity param1Activity) {
      param1Activity.getClass();
    }
    
    public void onActivityPostCreated(Activity param1Activity, Bundle param1Bundle) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_CREATE);
    }
    
    public void onActivityPostResumed(Activity param1Activity) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_RESUME);
    }
    
    public void onActivityPostStarted(Activity param1Activity) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_START);
    }
    
    public void onActivityPreDestroyed(Activity param1Activity) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_DESTROY);
    }
    
    public void onActivityPrePaused(Activity param1Activity) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_PAUSE);
    }
    
    public void onActivityPreStopped(Activity param1Activity) {
      param1Activity.getClass();
      int i = xf1.b;
      vf1.a(param1Activity, om0.ON_STOP);
    }
    
    public void onActivityResumed(Activity param1Activity) {
      param1Activity.getClass();
    }
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {
      param1Activity.getClass();
      param1Bundle.getClass();
    }
    
    public void onActivityStarted(Activity param1Activity) {
      param1Activity.getClass();
    }
    
    public void onActivityStopped(Activity param1Activity) {
      param1Activity.getClass();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */