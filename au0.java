import android.media.MediaRouter2;
import in.krosbits.musicolet.MusicService;
import java.util.List;

public final class au0 extends MediaRouter2.RouteCallback {
  public final int a;
  
  public final Object b;
  
  public void onRoutesAdded(List paramList) {
    switch (this.a) {
      default:
        super.onRoutesAdded(paramList);
        return;
      case 0:
        break;
    } 
    ((cu0)this.b).j();
  }
  
  public void onRoutesChanged(List paramList) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        super.onRoutesChanged(paramList);
        return;
      case 2:
        MusicService.b((MusicService)object);
        return;
      case 0:
        break;
    } 
    ((cu0)object).j();
  }
  
  public void onRoutesRemoved(List paramList) {
    switch (this.a) {
      default:
        super.onRoutesRemoved(paramList);
        return;
      case 0:
        break;
    } 
    ((cu0)this.b).j();
  }
  
  public void onRoutesUpdated(List paramList) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        super.onRoutesUpdated(paramList);
        return;
      case 2:
        MusicService.b((MusicService)object);
        return;
      case 1:
        break;
    } 
    ((cu0)object).j();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\au0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */