package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import hy0;
import iy0;
import java.util.LinkedHashMap;

public final class MultiInstanceInvalidationService extends Service {
  public int b;
  
  public final LinkedHashMap c = new LinkedHashMap<Object, Object>();
  
  public final iy0 e = new iy0(this);
  
  public final hy0 f = new hy0(this);
  
  public final IBinder onBind(Intent paramIntent) {
    paramIntent.getClass();
    return (IBinder)this.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\room\MultiInstanceInvalidationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */