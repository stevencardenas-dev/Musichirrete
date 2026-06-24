package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import bt0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import jg0;
import lg0;
import nu0;

public class b {
  public final MediaController a;
  
  public final Object b = new Object();
  
  public final ArrayList c = new ArrayList();
  
  public final HashMap d = new HashMap<Object, Object>();
  
  public final MediaSessionCompat$Token e;
  
  public b(Context paramContext, MediaSessionCompat$Token paramMediaSessionCompat$Token) {
    this.e = paramMediaSessionCompat$Token;
    MediaController mediaController = new MediaController(paramContext, (MediaSession.Token)paramMediaSessionCompat$Token.c);
    this.a = mediaController;
    if (paramMediaSessionCompat$Token.b() == null) {
      ResultReceiver resultReceiver = new ResultReceiver(null);
      ((MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver)resultReceiver).b = new WeakReference<b>(this);
      mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
    } 
  }
  
  public final void a() {
    MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
    if (mediaSessionCompat$Token.b() == null)
      return; 
    ArrayList<Object> arrayList = this.c;
    int i = arrayList.size();
    byte b1 = 0;
    while (b1 < i) {
      nu0 nu0 = (nu0)arrayList.get(b1);
      b1++;
      nu0 = nu0;
      bt0 bt0 = new bt0(nu0);
      this.d.put(nu0, bt0);
      nu0.c = bt0;
      try {
        mediaSessionCompat$Token.b().L((jg0)bt0);
        nu0.d(13, null, null);
      } catch (RemoteException remoteException) {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
        break;
      } 
    } 
    arrayList.clear();
  }
  
  public final void b(nu0 paramnu0) {
    this.a.unregisterCallback((MediaController.Callback)paramnu0.a);
    Object object = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      lg0 lg0 = this.e.b();
      if (lg0 != null) {
        try {
          bt0 bt0 = (bt0)this.d.remove(paramnu0);
          if (bt0 != null) {
            paramnu0.c = null;
            this.e.b().y((jg0)bt0);
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */