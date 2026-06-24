import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

public final class wb0 implements kf0, ui1, l32 {
  public final ua0 b;
  
  public final k32 c;
  
  public final e e;
  
  public wm0 f = null;
  
  public j01 g = null;
  
  public wb0(ua0 paramua0, k32 paramk32, e parame) {
    this.b = paramua0;
    this.c = paramk32;
    this.e = parame;
  }
  
  public final k32 H() {
    b();
    return this.c;
  }
  
  public final wm0 N() {
    b();
    return this.f;
  }
  
  public final void a(om0 paramom0) {
    this.f.e(paramom0);
  }
  
  public final void b() {
    if (this.f == null) {
      this.f = new wm0(this);
      j01 j011 = new j01(new ti1(this, new pp(7, this)));
      this.g = j011;
      j011.s();
      this.e.run();
    } 
  }
  
  public final j01 h() {
    b();
    return (j01)this.g.e;
  }
  
  public final uz0 y() {
    ua0 ua01 = this.b;
    Context context = ua01.u0().getApplicationContext();
    while (true) {
      if (context instanceof ContextWrapper) {
        Application application;
        if (context instanceof Application) {
          application = (Application)context;
          break;
        } 
        Context context1 = ((ContextWrapper)application).getBaseContext();
        continue;
      } 
      context = null;
      break;
    } 
    uz0 uz0 = new uz0(0);
    LinkedHashMap<fb0, Context> linkedHashMap = uz0.a;
    if (context != null)
      linkedHashMap.put(i32.j, context); 
    linkedHashMap.put(ui0.f, ua01);
    linkedHashMap.put(ui0.g, this);
    Bundle bundle = ua01.i;
    if (bundle != null)
      linkedHashMap.put(ui0.h, bundle); 
    return uz0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */