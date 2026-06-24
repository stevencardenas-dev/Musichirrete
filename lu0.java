import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;

public final class lu0 implements View.OnClickListener {
  public final int b;
  
  public final qu0 c;
  
  public final void onClick(View paramView) {
    Interpolator interpolator;
    g7 g7;
    PendingIntent pendingIntent;
    boolean bool;
    StringBuilder stringBuilder;
    PlaybackStateCompat playbackStateCompat;
    int j = this.b;
    boolean bool2 = false;
    int i = 1;
    boolean bool1 = true;
    qu0 qu01 = this.c;
    switch (j) {
      default:
        bool = qu01.h0;
        qu01.h0 = bool ^ true;
        if (!bool)
          qu01.H.setVisibility(0); 
        if (qu01.h0) {
          interpolator = qu01.o0;
        } else {
          interpolator = qu01.p0;
        } 
        qu01.n0 = interpolator;
        qu01.t(true);
        return;
      case 2:
        g7 = qu01.V;
        if (g7 != null) {
          pendingIntent = ((b)g7.c).a.getSessionActivity();
          if (pendingIntent != null)
            try {
              pendingIntent.send();
              qu01.dismiss();
            } catch (android.app.PendingIntent.CanceledException canceledException) {
              stringBuilder = new StringBuilder();
              stringBuilder.append(pendingIntent);
              stringBuilder.append(" was not sent, it had been canceled.");
              Log.e("MediaRouteCtrlDialog", stringBuilder.toString());
            }  
        } 
        return;
      case 1:
        stringBuilder.dismiss();
        return;
      case 0:
        break;
    } 
    Context context = ((qu0)stringBuilder).m;
    AccessibilityManager accessibilityManager = ((qu0)stringBuilder).q0;
    j = pendingIntent.getId();
    if (j == 16908313 || j == 16908314) {
      if (((qu0)stringBuilder).l.g()) {
        iv0 iv0 = ((qu0)stringBuilder).j;
        if (j == 16908313)
          i = 2; 
        iv0.getClass();
        iv0.m(i);
      } 
      stringBuilder.dismiss();
      return;
    } 
    if (j == 2131297192) {
      g7 g71 = ((qu0)stringBuilder).V;
      if (g71 != null) {
        playbackStateCompat = ((qu0)stringBuilder).X;
        if (playbackStateCompat != null) {
          if (playbackStateCompat.b != 3)
            bool1 = false; 
          if (bool1 && (playbackStateCompat.g & 0x202L) != 0L) {
            (g71.y()).a.pause();
            i = 2131886871;
          } else if (bool1 && (playbackStateCompat.g & 0x1L) != 0L) {
            (g71.y()).a.stop();
            i = 2131886873;
          } else {
            i = bool2;
            if (!bool1) {
              i = bool2;
              if ((playbackStateCompat.g & 0x204L) != 0L) {
                (g71.y()).a.play();
                i = 2131886872;
              } 
            } 
          } 
          if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
            AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(16384);
            accessibilityEvent.setPackageName(context.getPackageName());
            accessibilityEvent.setClassName(lu0.class.getName());
            accessibilityEvent.getText().add(context.getString(i));
            accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
          } 
        } 
      } 
    } else if (j == 2131297190) {
      playbackStateCompat.dismiss();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */