import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class gd1 implements sm0 {
  public final int b;
  
  public final Object c;
  
  public final void a(um0 paramum0, om0 paramom0) {
    StringBuilder stringBuilder;
    sd0[] arrayOfSd0;
    sd0 sd0;
    qo qo;
    lo lo;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        if (paramom0 == om0.ON_CREATE) {
          paramum0.N().g(this);
          ((pi1)object).b();
          return;
        } 
        stringBuilder = new StringBuilder("Next event must be ON_CREATE, it was ");
        stringBuilder.append(paramom0);
        throw new IllegalStateException(stringBuilder.toString().toString());
      case 3:
        if (paramom0 == om0.ON_STOP) {
          View view = ((ua0)object).K;
          if (view != null)
            view.cancelPendingInputEvents(); 
        } 
        return;
      case 2:
        new HashMap<Object, Object>();
        arrayOfSd0 = (sd0[])object;
        if (arrayOfSd0.length <= 0) {
          if (arrayOfSd0.length <= 0)
            return; 
          sd0 = arrayOfSd0[0];
          throw null;
        } 
        sd0 = sd0[0];
        throw null;
      case 1:
        qo = (qo)object;
        if (qo.h == null) {
          lo = (lo)qo.getLastNonConfigurationInstance();
          if (lo != null)
            qo.h = lo.a; 
          if (qo.h == null)
            qo.h = new k32(); 
        } 
        qo.c.g(this);
        return;
      case 0:
        break;
    } 
    object = object;
    if (lo == om0.ON_CREATE) {
      qo.N().g(this);
      Bundle bundle = object.h().g("androidx.savedstate.Restarter");
      if (bundle != null) {
        ArrayList<lo> arrayList = bundle.getStringArrayList("classes_to_restore");
        if (arrayList != null) {
          int j = arrayList.size();
          i = 0;
          while (i < j) {
            StringBuilder stringBuilder1;
            lo = arrayList.get(i);
            int k = i + 1;
            String str = (String)lo;
            try {
              LinkedHashMap linkedHashMap;
              Class<? extends ri1> clazz = Class.forName(str, false, gd1.class.getClassLoader()).asSubclass(ri1.class);
              clazz.getClass();
              try {
                j01 j01;
                Constructor<? extends ri1> constructor = clazz.getDeclaredConstructor(null);
                constructor.setAccessible(true);
                try {
                  clazz = (Class<? extends ri1>)constructor.newInstance(null);
                  clazz.getClass();
                  ri1 ri1 = (ri1)clazz;
                  if (object instanceof l32) {
                    k32 k32 = ((l32)object).H();
                    j01 = object.h();
                    k32.getClass();
                    linkedHashMap = k32.a;
                    for (String str1 : new HashSet(linkedHashMap.keySet())) {
                      str1.getClass();
                      g32 g32 = (g32)linkedHashMap.get(str1);
                      if (g32 == null)
                        continue; 
                      qz1.c(g32, j01, object.N());
                    } 
                    i = k;
                    if (!(new HashSet(linkedHashMap.keySet())).isEmpty()) {
                      j01.B();
                      i = k;
                    } 
                    continue;
                  } 
                  StringBuilder stringBuilder2 = new StringBuilder("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                  stringBuilder2.append(object);
                  throw new IllegalStateException(stringBuilder2.toString().toString());
                } catch (Exception exception) {
                  k91.m(x41.k("Failed to instantiate ", (String)j01), exception);
                  break;
                } 
              } catch (NoSuchMethodException noSuchMethodException) {
                object = linkedHashMap.getSimpleName();
                stringBuilder1 = new StringBuilder("Class ");
                stringBuilder1.append((String)object);
                stringBuilder1.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(stringBuilder1.toString(), noSuchMethodException);
              } 
            } catch (ClassNotFoundException classNotFoundException) {
              k91.m(x41.w("Class ", (String)stringBuilder1, " wasn't found"), classNotFoundException);
              break;
            } 
          } 
        } else {
          tp.f("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        } 
      } 
      return;
    } 
    throw new AssertionError("Next event must be ON_CREATE");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */