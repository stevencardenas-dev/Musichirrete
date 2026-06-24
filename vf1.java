import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

public abstract class vf1 {
  public static void a(Activity paramActivity, om0 paramom0) {
    paramom0.getClass();
    if (paramActivity instanceof um0) {
      wm0 wm0 = ((um0)paramActivity).N();
      if (wm0 != null)
        wm0.e(paramom0); 
    } 
  }
  
  public static void b(po parampo) {
    if (Build.VERSION.SDK_INT >= 29) {
      xf1.a.Companion.getClass();
      wf1.a(parampo);
    } 
    FragmentManager fragmentManager = parampo.getFragmentManager();
    if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
      fragmentManager.beginTransaction().add(new xf1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      fragmentManager.executePendingTransactions();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */