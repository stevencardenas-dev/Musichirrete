import android.os.Bundle;
import java.util.LinkedHashMap;

public final class ti1 {
  public final ui1 a;
  
  public final pp b;
  
  public final fb0 c;
  
  public final LinkedHashMap d;
  
  public boolean e;
  
  public Bundle f;
  
  public boolean g;
  
  public boolean h;
  
  public ti1(ui1 paramui1, pp parampp) {
    this.a = paramui1;
    this.b = parampp;
    this.c = (fb0)new Object();
    this.d = new LinkedHashMap<Object, Object>();
    this.h = true;
  }
  
  public final void a() {
    ui1 ui11 = this.a;
    if ((pm0)(ui11.N()).i == pm0.c) {
      if (!this.e) {
        this.b.a();
        ui11.N().a(new io(2, this));
        this.e = true;
        return;
      } 
      tp.f("SavedStateRegistry was already attached.");
      return;
    } 
    tp.f("Restarter must be created only during owner's initialization stage");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ti1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */