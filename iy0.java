import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class iy0 extends RemoteCallbackList {
  public final MultiInstanceInvalidationService a;
  
  public iy0(MultiInstanceInvalidationService paramMultiInstanceInvalidationService) {}
  
  public final void onCallbackDied(IInterface paramIInterface, Object paramObject) {
    ((ng0)paramIInterface).getClass();
    paramObject.getClass();
    this.a.c.remove(paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */