import android.media.MediaRouter;

public final class i71 extends xu0 {
  public final MediaRouter.RouteInfo a;
  
  public i71(MediaRouter.RouteInfo paramRouteInfo) {
    this.a = paramRouteInfo;
  }
  
  public final void f(int paramInt) {
    this.a.requestSetVolume(paramInt);
  }
  
  public final void i(int paramInt) {
    this.a.requestUpdateVolume(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */