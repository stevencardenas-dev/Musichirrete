import android.os.Bundle;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class v5 implements si1 {
  public final int a;
  
  public final Object b = new LinkedHashSet();
  
  public v5(j01 paramj01) {
    paramj01.x("androidx.savedstate.Restarter", this);
  }
  
  public v5(pc parampc) {}
  
  public final Bundle a() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        bundle = n21.e(Arrays.<t51>copyOf(new t51[0], 0));
        object = nm.v0((LinkedHashSet)object);
        if (object instanceof ArrayList) {
          object = object;
        } else {
          object = new ArrayList((Collection<?>)object);
        } 
        bundle.putStringArrayList(KjdXPYm.eLpoWpy, (ArrayList)object);
        return bundle;
      case 0:
        break;
    } 
    Bundle bundle = new Bundle();
    ((pc)object).X().getClass();
    return bundle;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */