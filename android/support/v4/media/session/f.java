package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import g01;
import h01;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import jg0;
import lg0;

public final class f {
  public final MediaController a;
  
  public final Object b = new Object();
  
  public final ArrayList c = new ArrayList();
  
  public final HashMap d = new HashMap<Object, Object>();
  
  public final MediaSessionCompat$Token e;
  
  public f(Context paramContext, MediaSessionCompat$Token paramMediaSessionCompat$Token) {
    this.e = paramMediaSessionCompat$Token;
    MediaController mediaController = new MediaController(paramContext, (MediaSession.Token)paramMediaSessionCompat$Token.c);
    this.a = mediaController;
    if (paramMediaSessionCompat$Token.b() == null) {
      ResultReceiver resultReceiver = new ResultReceiver(null);
      ((MyMediaControllerCompat2$MediaControllerImplApi21$ExtraBinderRequestResultReceiver)resultReceiver).b = new WeakReference<f>(this);
      mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
    } 
  }
  
  public final void a() {
    MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
    if (mediaSessionCompat$Token.b() == null)
      return; 
    ArrayList<Object> arrayList = this.c;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      g01 g01 = (g01)arrayList.get(b);
      b++;
      g01 = g01;
      h01 h01 = new h01(g01);
      this.d.put(g01, h01);
      g01.c = h01;
      try {
        mediaSessionCompat$Token.b().L((jg0)h01);
        g01.c(13, null, null);
      } catch (RemoteException remoteException) {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
        break;
      } 
    } 
    arrayList.clear();
  }
  
  public final void b(g01 paramg01) {
    this.a.unregisterCallback((MediaController.Callback)paramg01.a);
    Object object = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      lg0 lg0 = this.e.b();
      if (lg0 != null) {
        try {
          h01 h01 = (h01)this.d.remove(paramg01);
          if (h01 != null) {
            paramg01.c = null;
            this.e.b().y((jg0)h01);
          } 
        } catch (RemoteException remoteException) {
          Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", (Throwable)remoteException);
        } 
      } else {
        this.c.remove(remoteException);
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */