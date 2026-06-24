import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public final class zs0 extends MediaController.Callback {
  public final int a;
  
  public final WeakReference b;
  
  public zs0(g01 paramg01) {
    this.b = new WeakReference<g01>(paramg01);
  }
  
  public zs0(nu0 paramnu0) {
    this.b = new WeakReference<nu0>(paramnu0);
  }
  
  public final void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo) {
    int i = this.a;
    WeakReference<g01> weakReference = this.b;
    switch (i) {
      default:
        if ((g01)weakReference.get() != null) {
          paramPlaybackInfo.getPlaybackType();
          paramPlaybackInfo.getAudioAttributes();
          i = AudioAttributesCompat.b;
          paramPlaybackInfo.getVolumeControl();
          paramPlaybackInfo.getMaxVolume();
          paramPlaybackInfo.getCurrentVolume();
        } 
        return;
      case 0:
        break;
    } 
    if ((nu0)weakReference.get() != null) {
      paramPlaybackInfo.getPlaybackType();
      paramPlaybackInfo.getAudioAttributes();
      i = AudioAttributesCompat.b;
      paramPlaybackInfo.getVolumeControl();
      paramPlaybackInfo.getMaxVolume();
      paramPlaybackInfo.getCurrentVolume();
    } 
  }
  
  public final void onExtrasChanged(Bundle paramBundle) {
    g01 g01;
    switch (this.a) {
      default:
        p01.d(paramBundle);
        g01 = this.b.get();
        return;
      case 0:
        break;
    } 
    zv0.m((Bundle)g01);
    nu0 nu0 = this.b.get();
  }
  
  public final void onMetadataChanged(MediaMetadata paramMediaMetadata) {
    g01 g01;
    int i = this.a;
    WeakReference<g01> weakReference = this.b;
    switch (i) {
      default:
        g01 = weakReference.get();
        if (g01 != null) {
          MediaMetadataCompat.b(paramMediaMetadata);
          g01.a();
        } 
        return;
      case 0:
        break;
    } 
    nu0 nu0 = g01.get();
    if (nu0 != null)
      nu0.a(MediaMetadataCompat.b(paramMediaMetadata)); 
  }
  
  public final void onPlaybackStateChanged(PlaybackState paramPlaybackState) {
    g01 g01;
    int i = this.a;
    WeakReference<g01> weakReference = this.b;
    switch (i) {
      default:
        g01 = weakReference.get();
        if (g01 != null && g01.c == null)
          g01.b(PlaybackStateCompat.b(paramPlaybackState)); 
        return;
      case 0:
        break;
    } 
    nu0 nu0 = g01.get();
    if (nu0 != null && nu0.c == null)
      nu0.b(PlaybackStateCompat.b(paramPlaybackState)); 
  }
  
  public final void onQueueChanged(List paramList) {
    switch (this.a) {
      default:
        if ((g01)this.b.get() != null)
          MediaSessionCompat.QueueItem.b(paramList); 
        return;
      case 0:
        break;
    } 
    if ((nu0)this.b.get() != null)
      MediaSessionCompat.QueueItem.b(paramList); 
  }
  
  public final void onQueueTitleChanged(CharSequence paramCharSequence) {
    g01 g01;
    switch (this.a) {
      default:
        g01 = this.b.get();
        return;
      case 0:
        break;
    } 
    nu0 nu0 = this.b.get();
  }
  
  public final void onSessionDestroyed() {
    g01 g01;
    int i = this.a;
    WeakReference<g01> weakReference = this.b;
    switch (i) {
      default:
        g01 = weakReference.get();
        return;
      case 0:
        break;
    } 
    nu0 nu0 = g01.get();
    if (nu0 != null)
      nu0.c(); 
  }
  
  public final void onSessionEvent(String paramString, Bundle paramBundle) {
    g01 g01;
    switch (this.a) {
      default:
        p01.d(paramBundle);
        g01 = this.b.get();
        return;
      case 0:
        break;
    } 
    zv0.m(paramBundle);
    nu0 nu0 = this.b.get();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */