import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.HashSet;

public final class mv0 extends MediaRouter.Callback {
  public final h71 a;
  
  public mv0(h71 paramh71) {
    this.a = paramh71;
  }
  
  public final void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    if (h711.h(paramRouteInfo))
      h711.q(); 
  }
  
  public final void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    h711.getClass();
    if (h71.m(paramRouteInfo) == null) {
      int i = h711.i(paramRouteInfo);
      if (i >= 0) {
        h711.r(h711.s.get(i));
        h711.q();
      } 
    } 
  }
  
  public final void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt) {
    this.a.getClass();
  }
  
  public final void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    int i = h711.i(paramRouteInfo);
    if (i >= 0) {
      j71 j71 = h711.s.get(i);
      Display display = paramRouteInfo.getPresentationDisplay();
      if (display != null) {
        i = display.getDisplayId();
      } else {
        i = -1;
      } 
      if (i != j71.c.a.getInt("presentationDisplayId", -1)) {
        su0 su0 = j71.c;
        new ArrayList();
        new ArrayList();
        new HashSet();
        if (su0 != null) {
          Bundle bundle = new Bundle(su0.a);
          ArrayList<?> arrayList1 = su0.c();
          ArrayList<?> arrayList2 = su0.b();
          HashSet<?> hashSet = su0.a();
          bundle.putInt("presentationDisplayId", i);
          bundle.putParcelableArrayList("controlFilters", new ArrayList(arrayList2));
          arrayList1 = new ArrayList(arrayList1);
          bundle.putStringArrayList(YbNJ.ERkkdUJH, arrayList1);
          bundle.putStringArrayList("allowedPackages", new ArrayList(hashSet));
          j71.c = new su0(bundle);
          h711.q();
          return;
        } 
        l0.l("descriptor must not be null");
      } 
    } 
  }
  
  public final void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    h711.getClass();
    if (h71.m(paramRouteInfo) == null) {
      int i = h711.i(paramRouteInfo);
      if (i >= 0) {
        h711.s.remove(i);
        h711.q();
      } 
    } 
  }
  
  public final void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    if (paramRouteInfo == h711.l.getSelectedRoute(8388611)) {
      k71 k71 = h71.m(paramRouteInfo);
      if (k71 != null) {
        k71.a.l(false);
        return;
      } 
      paramInt = h711.i(paramRouteInfo);
      if (paramInt >= 0) {
        j71 j71 = h711.s.get(paramInt);
        ee0 ee0 = h711.k;
        String str = j71.b;
        ee0.a.removeMessages(262);
        gv0 gv0 = ee0.d(ee0.t);
        if (gv0 != null) {
          hv0 hv0 = gv0.a(str);
          if (hv0 != null)
            hv0.l(false); 
        } 
      } 
    } 
  }
  
  public final void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup) {
    this.a.getClass();
  }
  
  public final void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo) {
    this.a.getClass();
  }
  
  public final void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo) {
    h71 h711 = this.a;
    h711.getClass();
    if (h71.m(paramRouteInfo) == null) {
      int i = h711.i(paramRouteInfo);
      if (i >= 0) {
        j71 j71 = h711.s.get(i);
        i = paramRouteInfo.getVolume();
        if (i != j71.c.a.getInt("volume")) {
          su0 su0 = j71.c;
          new ArrayList();
          new ArrayList();
          new HashSet();
          if (su0 != null) {
            Bundle bundle = new Bundle(su0.a);
            ArrayList<?> arrayList2 = su0.c();
            ArrayList<?> arrayList1 = su0.b();
            HashSet<?> hashSet = su0.a();
            bundle.putInt("volume", i);
            bundle.putParcelableArrayList("controlFilters", new ArrayList(arrayList1));
            bundle.putStringArrayList("groupMemberIds", new ArrayList(arrayList2));
            bundle.putStringArrayList("allowedPackages", new ArrayList(hashSet));
            j71.c = new su0(bundle);
            h711.q();
            return;
          } 
          l0.l("descriptor must not be null");
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */