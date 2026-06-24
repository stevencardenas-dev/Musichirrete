import android.app.Notification;
import android.app.job.JobParameters;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.NetworkRequest;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import androidx.work.impl.background.systemjob.SystemJobService;

public abstract class f00 {
  public static int[] a(NetworkRequest paramNetworkRequest) {
    paramNetworkRequest.getClass();
    int[] arrayOfInt = paramNetworkRequest.getCapabilities();
    arrayOfInt.getClass();
    return arrayOfInt;
  }
  
  public static kh1 b(Display paramDisplay, int paramInt) {
    if (Build.VERSION.SDK_INT >= 31) {
      RoundedCorner roundedCorner = paramDisplay.getRoundedCorner(paramInt);
      if (roundedCorner != null) {
        int i = roundedCorner.getPosition();
        if (i != 0) {
          paramInt = 1;
          if (i != 1) {
            paramInt = 2;
            if (i != 2) {
              paramInt = 3;
              if (i != 3) {
                l0.l(ga1.i("Invalid position: ", i));
                return null;
              } 
            } 
          } 
        } else {
          paramInt = 0;
        } 
        return new kh1(paramInt, roundedCorner.getRadius(), roundedCorner.getCenter());
      } 
    } 
    return null;
  }
  
  public static int c(JobParameters paramJobParameters) {
    int j = paramJobParameters.getStopReason();
    String str = SystemJobService.g;
    int i = j;
    switch (j) {
      default:
        i = -512;
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        break;
    } 
    return i;
  }
  
  public static Typeface d(Configuration paramConfiguration, Typeface paramTypeface) {
    if (Build.VERSION.SDK_INT >= 31) {
      int i = k91.a(paramConfiguration);
      if (i != Integer.MAX_VALUE && i != 0 && paramTypeface != null)
        return Typeface.create(paramTypeface, ui0.i(paramTypeface.getWeight() + k91.a(paramConfiguration), 1, 1000), paramTypeface.isItalic()); 
    } 
    return null;
  }
  
  public static void e(Notification.Action.Builder paramBuilder) {
    paramBuilder.setAuthenticationRequired(false);
  }
  
  public static int[] f(NetworkRequest paramNetworkRequest) {
    paramNetworkRequest.getClass();
    int[] arrayOfInt = paramNetworkRequest.getTransportTypes();
    arrayOfInt.getClass();
    return arrayOfInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */