import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

public class tv0 {
  public final MediaSession a;
  
  public final sv0 b;
  
  public final MediaSessionCompat.Token c;
  
  public final Object d = new Object();
  
  public Bundle e;
  
  public final RemoteCallbackList f = new RemoteCallbackList();
  
  public PlaybackStateCompat g;
  
  public MediaMetadataCompat h;
  
  public rv0 i;
  
  public aw0 j;
  
  public tv0(Context paramContext) {
    MediaSession mediaSession = a(paramContext);
    this.a = mediaSession;
    sv0 sv01 = new sv0(this);
    this.b = sv01;
    this.c = new MediaSessionCompat.Token((Parcelable)mediaSession.getSessionToken(), sv01);
    this.e = null;
    mediaSession.setFlags(3);
  }
  
  public tv0(Object paramObject) {
    if (paramObject instanceof MediaSession) {
      paramObject = paramObject;
      this.a = (MediaSession)paramObject;
      sv0 sv01 = new sv0(this);
      this.b = sv01;
      this.c = new MediaSessionCompat.Token((Parcelable)paramObject.getSessionToken(), sv01);
      this.e = null;
      paramObject.setFlags(3);
      return;
    } 
    l0.l("mediaSession is not a valid MediaSession object");
    throw null;
  }
  
  public MediaSession a(Context paramContext) {
    return new MediaSession(paramContext, "CastMediaSession");
  }
  
  public aw0 b() {
    synchronized (this.d) {
      return this.j;
    } 
  }
  
  public final void c(rv0 paramrv0, Handler paramHandler) {
    synchronized (this.d) {
      qv0 qv0;
      this.i = paramrv0;
      MediaSession mediaSession = this.a;
      Handler handler = null;
      if (paramrv0 == null) {
        qv0 = null;
      } else {
        qv0 = paramrv0.b;
      } 
      mediaSession.setCallback(qv0, paramHandler);
      if (paramrv0 != null) {
        Object object = paramrv0.a;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          WeakReference weakReference = new WeakReference();
          this((T)this);
          paramrv0.d = weakReference;
          cj cj = paramrv0.e;
          if (cj != null)
            cj.removeCallbacksAndMessages(null); 
        } finally {}
        if (paramHandler == null) {
          paramHandler = handler;
        } else {
          paramHandler = new cj(paramrv0, paramHandler.getLooper(), 7);
        } 
        paramrv0.e = (cj)paramHandler;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } 
      return;
    } 
  }
  
  public void d(aw0 paramaw0) {
    synchronized (this.d) {
      this.j = paramaw0;
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */