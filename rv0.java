import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

public abstract class rv0 {
  public final Object a = new Object();
  
  public final qv0 b = new qv0(0, this);
  
  public boolean c;
  
  public WeakReference d = new WeakReference(null);
  
  public cj e;
  
  public final void a(tv0 paramtv0, Handler paramHandler) {
    if (this.c) {
      boolean bool1;
      boolean bool2;
      long l;
      boolean bool3 = false;
      this.c = false;
      paramHandler.removeMessages(1);
      PlaybackStateCompat playbackStateCompat = paramtv0.g;
      if (playbackStateCompat == null) {
        l = 0L;
      } else {
        l = playbackStateCompat.g;
      } 
      if (playbackStateCompat != null && playbackStateCompat.b == 3) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if ((0x204L & l) != 0L) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if ((l & 0x202L) != 0L)
        bool3 = true; 
      if (bool1 && bool3) {
        d();
        return;
      } 
      if (!bool1 && bool2)
        e(); 
    } 
  }
  
  public void b(String paramString) {}
  
  public boolean c(Intent paramIntent) {
    if (Build.VERSION.SDK_INT < 27)
      synchronized (this.a) {
        tv0 tv0 = this.d.get();
        cj cj1 = this.e;
        if (tv0 != null && cj1 != null) {
          KeyEvent keyEvent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
          if (keyEvent != null && keyEvent.getAction() == 0) {
            null = tv0.b();
            int i = keyEvent.getKeyCode();
            if (i != 79 && i != 85) {
              a(tv0, cj1);
              return false;
            } 
            if (keyEvent.getRepeatCount() == 0) {
              if (this.c) {
                long l;
                cj1.removeMessages(1);
                this.c = false;
                PlaybackStateCompat playbackStateCompat = tv0.g;
                if (playbackStateCompat == null) {
                  l = 0L;
                } else {
                  l = playbackStateCompat.g;
                } 
                if ((l & 0x20L) != 0L)
                  g(); 
                return true;
              } 
              this.c = true;
              cj1.sendMessageDelayed(cj1.obtainMessage(1, null), ViewConfiguration.getDoubleTapTimeout());
              return true;
            } 
            a(tv0, cj1);
            return true;
          } 
        } 
        return false;
      }  
    return false;
  }
  
  public void d() {}
  
  public void e() {}
  
  public void f(long paramLong) {}
  
  public void g() {}
  
  public void h() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */