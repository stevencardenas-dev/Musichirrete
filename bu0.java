import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class bu0 extends MediaRouter2.TransferCallback {
  public final cu0 a;
  
  public bu0(cu0 paramcu0) {}
  
  public final void onStop(MediaRouter2.RoutingController paramRoutingController) {
    ee0 ee0;
    cu0 cu01 = this.a;
    cu01.u = null;
    xu0 xu0 = (xu0)cu01.m.remove(paramRoutingController);
    if (xu0 != null) {
      ee0 = cu01.l.a;
      if (xu0 == ee0.e) {
        hv0 hv0 = ee0.c();
        if (ee0.g() != hv0)
          ee0.l(hv0, 2, true); 
        return;
      } 
      int i = ee0.H;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("onStop: No matching routeController found. routingController=");
    stringBuilder.append(ee0);
    Log.w("MR2Provider", stringBuilder.toString());
  }
  
  public final void onTransfer(MediaRouter2.RoutingController paramRoutingController1, MediaRouter2.RoutingController paramRoutingController2) {
    hv0 hv0;
    StringBuilder stringBuilder;
    ee0 ee01;
    cu0 cu01 = this.a;
    yt0 yt02 = null;
    cu01.u = null;
    cu01.m.remove(paramRoutingController1);
    if (paramRoutingController2 == cu01.k.getSystemController()) {
      ee01 = cu01.l.a;
      hv0 = ee01.c();
      if (ee01.g() != hv0)
        ee01.l(hv0, 3, true); 
      return;
    } 
    List list = ee01.getSelectedRoutes();
    if (list.isEmpty()) {
      Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
      return;
    } 
    byte b = 0;
    String str = m60.d(list.get(0)).getId();
    yt0 yt01 = new yt0(cu01, (MediaRouter2.RoutingController)ee01, str);
    cu01.m.put(ee01, yt01);
    ee0 ee02 = cu01.l.a;
    ArrayList<yt0> arrayList = ee02.j;
    int i = arrayList.size();
    while (true) {
      yt01 = yt02;
      if (b < i) {
        yt01 = arrayList.get(b);
        b++;
        hv0 = (hv0)yt01;
        if (hv0.c() == ee02.s && TextUtils.equals(str, hv0.b))
          break; 
        continue;
      } 
      break;
    } 
    if (hv0 == null) {
      stringBuilder = new StringBuilder("onSelectRoute: The target RouteInfo is not found for descriptorId=");
      stringBuilder.append(str);
      Log.w("AxMediaRouter", stringBuilder.toString());
    } else {
      ee02.l((hv0)stringBuilder, 3, true);
    } 
    cu01.k((MediaRouter2.RoutingController)ee01);
  }
  
  public final void onTransferFailure(MediaRoute2Info paramMediaRoute2Info) {
    this.a.u = null;
    StringBuilder stringBuilder = new StringBuilder("Transfer failed. requestedRoute=");
    stringBuilder.append(paramMediaRoute2Info);
    Log.w("MR2Provider", stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */