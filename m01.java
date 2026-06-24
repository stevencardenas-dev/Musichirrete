import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class m01 {
  public final MediaSession a;
  
  public final MediaSessionCompat.Token b;
  
  public final Object c = new Object();
  
  public final RemoteCallbackList d = new RemoteCallbackList();
  
  public PlaybackStateCompat e;
  
  public ArrayList f;
  
  public MediaMetadataCompat g;
  
  public int h;
  
  public int i;
  
  public l01 j;
  
  public m01(MediaSession paramMediaSession) {
    this.a = paramMediaSession;
    this.b = new MediaSessionCompat.Token((Parcelable)paramMediaSession.getSessionToken(), new sv0(this));
    paramMediaSession.setFlags(3);
  }
  
  public void a() {
    synchronized (this.c) {
      return;
    } 
  }
  
  public final void b(l01 paraml01, Handler paramHandler) {
    synchronized (this.c) {
      qv0 qv0;
      this.j = paraml01;
      MediaSession mediaSession = this.a;
      Handler handler = null;
      if (paraml01 == null) {
        qv0 = null;
      } else {
        qv0 = paraml01.b;
      } 
      mediaSession.setCallback(qv0, paramHandler);
      if (paraml01 != null) {
        Object object = paraml01.a;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          WeakReference weakReference = new WeakReference();
          this((T)this);
          paraml01.c = weakReference;
          cj cj = paraml01.d;
          if (cj != null)
            cj.removeCallbacksAndMessages(null); 
        } finally {}
        if (paramHandler == null) {
          paramHandler = handler;
        } else {
          paramHandler = new cj(paraml01, paramHandler.getLooper(), 8);
        } 
        paraml01.d = (cj)paramHandler;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } 
      return;
    } 
  }
  
  public void c(aw0 paramaw0) {
    synchronized (this.c) {
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */