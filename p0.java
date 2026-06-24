import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Set;

public abstract class p0 {
  public static boolean a(NotificationManager paramNotificationManager) {
    return paramNotificationManager.canUseFullScreenIntent();
  }
  
  public static JobScheduler b(JobScheduler paramJobScheduler) {
    paramJobScheduler = paramJobScheduler.forNamespace("androidx.work.systemjobscheduler");
    paramJobScheduler.getClass();
    return paramJobScheduler;
  }
  
  public static AccessibilityNodeInfo.AccessibilityAction c() {
    return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
  }
  
  public static float d(VelocityTracker paramVelocityTracker, int paramInt) {
    return paramVelocityTracker.getAxisVelocity(paramInt);
  }
  
  public static void e(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect) {
    paramAccessibilityNodeInfo.getBoundsInWindow(paramRect);
  }
  
  public static CharSequence f(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getContainerTitle();
  }
  
  public static Set g(MediaRoute2Info paramMediaRoute2Info) {
    return paramMediaRoute2Info.getDeduplicationIds();
  }
  
  public static int h(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3) {
    return paramViewConfiguration.getScaledMaximumFlingVelocity(paramInt1, paramInt2, paramInt3);
  }
  
  public static int i(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3) {
    return paramViewConfiguration.getScaledMinimumFlingVelocity(paramInt1, paramInt2, paramInt3);
  }
  
  public static int j(MediaRoute2Info paramMediaRoute2Info) {
    return paramMediaRoute2Info.getType();
  }
  
  public static boolean k(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.isAccessibilityDataSensitive();
  }
  
  public static void l(TextView paramTextView, int paramInt, float paramFloat) {
    paramTextView.setLineHeight(paramInt, paramFloat);
  }
  
  public static void m(MediaRouter2 paramMediaRouter2, RouteListingPreference paramRouteListingPreference) {
    paramMediaRouter2.setRouteListingPreference(paramRouteListingPreference);
  }
  
  public static RouteListingPreference n(nh1 paramnh1) {
    ArrayList<RouteListingPreference.Item> arrayList = new ArrayList();
    for (mh1 mh1 : paramnh1.a)
      arrayList.add((new RouteListingPreference.Item.Builder(mh1.a)).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(mh1.b).build()); 
    return (new RouteListingPreference.Builder()).setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(paramnh1.b).build();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */