import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

public final class vi1 implements j32 {
  public final Application b;
  
  public final i32 c;
  
  public final Bundle e;
  
  public final wm0 f;
  
  public final j01 g;
  
  public vi1(Application paramApplication, ui1 paramui1, Bundle paramBundle) {
    i32 i321;
    this.g = paramui1.h();
    this.f = paramui1.N();
    this.e = paramBundle;
    this.b = paramApplication;
    if (paramApplication != null) {
      if (i32.i == null)
        i32.i = new i32(paramApplication); 
      i321 = i32.i;
      i321.getClass();
    } else {
      i321 = new i32(null);
    } 
    this.c = i321;
  }
  
  public final g32 a(Class paramClass) {
    String str = paramClass.getCanonicalName();
    if (str != null)
      return b(paramClass, str); 
    l0.l("Local and anonymous classes can not be ViewModels");
    return null;
  }
  
  public final g32 b(Class<?> paramClass, String paramString) {
    wm0 wm01 = this.f;
    if (wm01 != null) {
      g32 g32;
      Constructor constructor;
      boolean bool = w4.class.isAssignableFrom(paramClass);
      Application application = this.b;
      if (bool && application != null) {
        constructor = wi1.a(paramClass, wi1.a);
      } else {
        constructor = wi1.a(paramClass, wi1.b);
      } 
      if (constructor == null) {
        if (application != null)
          return this.c.a(paramClass); 
        if (zb0.f == null)
          zb0.f = new zb0(19); 
        zb0.f.getClass();
        return zo2.h(paramClass);
      } 
      j01 j011 = this.g;
      j011.getClass();
      Bundle bundle = this.e;
      mi1 mi1 = ui0.l(j011.g(paramString), bundle);
      ni1 ni1 = new ni1(paramString, mi1);
      ni1.c(wm01, j011);
      pm0 pm0 = (pm0)wm01.i;
      if (pm0 == pm0.c || pm0.compareTo(pm0.f) >= 0) {
        j011.B();
      } else {
        wm01.a(new fm0(wm01, j011));
      } 
      if (bool && application != null) {
        g32 = wi1.b(paramClass, constructor, new Object[] { application, mi1 });
      } else {
        g32 = wi1.b((Class)g32, constructor, new Object[] { mi1 });
      } 
      g32.a("androidx.lifecycle.savedstate.vm.tag", ni1);
      return g32;
    } 
    tp.j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    return null;
  }
  
  public final g32 g(Class<?> paramClass, uz0 paramuz0) {
    fb0 fb0 = ui0.i;
    LinkedHashMap linkedHashMap = paramuz0.a;
    String str = (String)linkedHashMap.get(fb0);
    if (str != null) {
      Application application;
      if (linkedHashMap.get(ui0.f) != null && linkedHashMap.get(ui0.g) != null) {
        Constructor constructor;
        application = (Application)linkedHashMap.get(i32.j);
        boolean bool = w4.class.isAssignableFrom(paramClass);
        if (bool && application != null) {
          constructor = wi1.a(paramClass, wi1.a);
        } else {
          constructor = wi1.a(paramClass, wi1.b);
        } 
        return (constructor == null) ? this.c.g(paramClass, paramuz0) : ((bool && application != null) ? wi1.b(paramClass, constructor, new Object[] { application, ui0.m(paramuz0) }) : wi1.b(paramClass, constructor, new Object[] { ui0.m(paramuz0) }));
      } 
      if (this.f != null)
        return b(paramClass, (String)application); 
      tp.f("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
      return null;
    } 
    tp.f("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    return null;
  }
  
  public final g32 l(ll paramll, uz0 paramuz0) {
    Class clazz = paramll.a;
    clazz.getClass();
    return g(clazz, paramuz0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */