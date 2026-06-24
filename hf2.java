import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class hf2 extends y92 {
  public static final rp0 h = new rp0("AppVisibilityProxy", null);
  
  public static final int i = 1;
  
  public final Set f = Collections.synchronizedSet(new HashSet());
  
  public int g = i;
  
  public hf2() {
    super("com.google.android.gms.cast.framework.IAppVisibilityListener", 3);
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    if (paramInt != 1) {
      wg2 wg2;
      Set set = this.f;
      rp0 rp01 = h;
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4)
            return false; 
          paramParcel2.writeNoException();
          paramParcel2.writeInt(12451000);
          return true;
        } 
        Log.i(rp01.a, rp01.c("onAppEnteredBackground", new Object[0]));
        this.g = 2;
        iterator = set.iterator();
        while (iterator.hasNext()) {
          wg2 = ((tg2)iterator.next()).a;
          wg2.getClass();
          wg2.f.b("Stopping RouteDiscovery.", new Object[0]);
          wg2.c.clear();
          if (Looper.myLooper() == Looper.getMainLooper()) {
            j01 j01 = wg2.e;
            if ((iv0)j01.e == null)
              j01.e = iv0.d((Context)j01.c); 
            iv0 iv0 = (iv0)j01.e;
            if (iv0 != null)
              iv0.j(wg2); 
            continue;
          } 
          (new cl(Looper.getMainLooper(), 6)).post(new vg2(wg2, 1));
        } 
        paramParcel2.writeNoException();
        return true;
      } 
      Log.i(((rp0)wg2).a, wg2.c("onAppEnteredForeground", new Object[0]));
      this.g = 1;
      Iterator iterator = iterator.iterator();
      while (iterator.hasNext())
        ((tg2)iterator.next()).a.q(); 
      paramParcel2.writeNoException();
      return true;
    } 
    j31 j31 = new j31(this);
    paramParcel2.writeNoException();
    mh2.c(paramParcel2, j31);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */