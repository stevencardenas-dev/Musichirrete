import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

public final class pi1 implements si1 {
  public final j01 a;
  
  public boolean b;
  
  public Bundle c;
  
  public final cs1 d;
  
  public pi1(j01 paramj01, l32 paraml32) {
    this.a = paramj01;
    this.d = new cs1(new pp(6, paraml32));
  }
  
  public final Bundle a() {
    Bundle bundle1 = n21.e(Arrays.<t51>copyOf(new t51[0], 0));
    Bundle bundle2 = this.c;
    if (bundle2 != null)
      bundle1.putAll(bundle2); 
    for (Map.Entry entry : ((qi1)this.d.getValue()).b.entrySet()) {
      String str = (String)entry.getKey();
      Bundle bundle = ((jo)((mi1)entry.getValue()).a.g).a();
      if (!bundle.isEmpty()) {
        str.getClass();
        bundle1.putBundle(str, bundle);
      } 
    } 
    this.b = false;
    return bundle1;
  }
  
  public final void b() {
    if (!this.b) {
      Bundle bundle1 = this.a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
      Bundle bundle2 = n21.e(Arrays.<t51>copyOf(new t51[0], 0));
      Bundle bundle3 = this.c;
      if (bundle3 != null)
        bundle2.putAll(bundle3); 
      if (bundle1 != null)
        bundle2.putAll(bundle1); 
      this.c = bundle2;
      this.b = true;
      qi1 qi1 = (qi1)this.d.getValue();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */