package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import c22;
import java.lang.ref.WeakReference;
import kg0;
import lg0;
import z51;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
  public WeakReference b;
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle) {
    Object object2;
    b b = this.b.get();
    if (b == null || paramBundle == null)
      return; 
    Object object1 = b.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      kg0 kg0;
      MediaSessionCompat$Token mediaSessionCompat$Token = b.e;
      IBinder iBinder = paramBundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
      paramInt = a.e;
      if (iBinder == null) {
        kg0 = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterface != null && iInterface instanceof lg0) {
          lg0 lg0 = (lg0)iInterface;
        } else {
          kg0 = new kg0();
          super();
          kg0.e = iBinder;
        } 
      } 
      object2 = mediaSessionCompat$Token.b;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        mediaSessionCompat$Token.e = (lg0)kg0;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        null = b.e;
        c22 c22 = z51.r(paramBundle);
        synchronized (null.b) {
          null.f = c22;
          b.a();
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } 
      } finally {}
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    throw paramBundle;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */