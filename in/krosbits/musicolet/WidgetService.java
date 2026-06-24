package in.krosbits.musicolet;

import android.content.Intent;
import android.widget.RemoteViewsService;
import n52;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public class WidgetService extends RemoteViewsService {
  public static n52 b;
  
  public final void onCreate() {
    super.onCreate();
    if (b == null)
      b = new n52(); 
    getSharedPreferences(fXMDNeMWaILNVh.uidTy, 0);
  }
  
  public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent paramIntent) {
    if (b == null)
      b = new n52(); 
    return (RemoteViewsService.RemoteViewsFactory)b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\WidgetService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */