import android.media.MediaRouter;

public final class nv0 extends MediaRouter.VolumeCallback {
  public final h71 a;
  
  public nv0(h71 paramh71) {
    this.a = paramh71;
  }
  
  public final void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt) {
    this.a.getClass();
    k71 k71 = h71.m(paramRouteInfo);
    if (k71 != null)
      k71.a.j(paramInt); 
  }
  
  public final void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt) {
    this.a.getClass();
    k71 k71 = h71.m(paramRouteInfo);
    if (k71 != null)
      k71.a.k(paramInt); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */