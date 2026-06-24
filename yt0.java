import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

public final class yt0 extends wu0 {
  public final String f;
  
  public final MediaRouter2.RoutingController g;
  
  public final Messenger h;
  
  public final Messenger i;
  
  public final SparseArray j = new SparseArray();
  
  public final Handler k;
  
  public final AtomicInteger l = new AtomicInteger(1);
  
  public final xt0 m = new xt0(0, this);
  
  public int n = -1;
  
  public su0 o;
  
  public yt0(cu0 paramcu0, MediaRouter2.RoutingController paramRoutingController, String paramString) {
    this.g = paramRoutingController;
    this.f = paramString;
    Messenger messenger = cu0.h(paramRoutingController);
    this.h = messenger;
    if (messenger == null) {
      messenger = null;
    } else {
      messenger = new Messenger(new cj(this));
    } 
    this.i = messenger;
    this.k = new Handler(Looper.getMainLooper());
  }
  
  public final void d() {
    this.g.release();
  }
  
  public final void f(int paramInt) {
    MediaRouter2.RoutingController routingController = this.g;
    if (routingController == null)
      return; 
    routingController.setVolume(paramInt);
    this.n = paramInt;
    Handler handler = this.k;
    xt0 xt01 = this.m;
    handler.removeCallbacks(xt01);
    handler.postDelayed(xt01, 1000L);
  }
  
  public final void i(int paramInt) {
    MediaRouter2.RoutingController routingController = this.g;
    if (routingController == null)
      return; 
    int j = this.n;
    int i = j;
    if (j < 0)
      i = routingController.getVolume(); 
    paramInt = Math.max(0, Math.min(i + paramInt, this.g.getVolumeMax()));
    this.n = paramInt;
    this.g.setVolume(paramInt);
    Handler handler = this.k;
    xt0 xt01 = this.m;
    handler.removeCallbacks(xt01);
    handler.postDelayed(xt01, 1000L);
  }
  
  public final String k() {
    su0 su01 = this.o;
    return (su01 != null) ? su01.d() : this.g.getId();
  }
  
  public final void l(String paramString, int paramInt) {
    MediaRouter2.RoutingController routingController = this.g;
    if (routingController != null && !routingController.isReleased()) {
      Messenger messenger = this.h;
      if (messenger != null) {
        int i = this.l.getAndIncrement();
        Message message = Message.obtain();
        message.what = 7;
        message.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", paramInt);
        bundle.putString("routeId", paramString);
        message.setData(bundle);
        message.replyTo = this.i;
        try {
          messenger.send(message);
          return;
        } catch (DeadObjectException deadObjectException) {
        
        } catch (RemoteException remoteException) {
          Log.e("MR2Provider", "Could not send control request to service.", (Throwable)remoteException);
        } 
      } 
    } 
  }
  
  public final void m(String paramString, int paramInt) {
    MediaRouter2.RoutingController routingController = this.g;
    if (routingController != null && !routingController.isReleased()) {
      Messenger messenger = this.h;
      if (messenger != null) {
        int i = this.l.getAndIncrement();
        Message message = Message.obtain();
        message.what = 8;
        message.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", paramInt);
        bundle.putString("routeId", paramString);
        message.setData(bundle);
        message.replyTo = this.i;
        try {
          messenger.send(message);
          return;
        } catch (DeadObjectException deadObjectException) {
        
        } catch (RemoteException remoteException) {
          Log.e("MR2Provider", "Could not send control request to service.", (Throwable)remoteException);
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */