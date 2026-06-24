import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class u31 implements OnBackAnimationCallback {
  public final v31 a;
  
  public u31(v31 paramv31) {
    this.a = paramv31;
  }
  
  public final void onBackCancelled() {
    v31 v311 = this.a;
    n2 n2 = v311.a;
    if (n2 != null) {
      if (!v311.b)
        n2.p(v311, null); 
      e11 e11 = (e11)n2.e;
      e11.getClass();
      if (v311.equals(e11.h) && -1 == e11.g) {
        w31 w312 = e11.f;
        w31 w311 = w312;
        if (w312 == null)
          w311 = e11.c(-1); 
        e11.f = null;
        e11.g = 0;
        e11.h = null;
        if (w311 != null)
          w311.d.a(); 
        ip1 ip1 = e11.a;
        f11 f11 = f11.i;
        ip1.getClass();
        ip1.g(null, f11);
      } 
      v311.b = false;
      return;
    } 
    tp.f("This input is not added to any dispatcher.");
  }
  
  public final void onBackInvoked() {
    this.a.a();
  }
  
  public final void onBackProgressed(BackEvent paramBackEvent) {
    paramBackEvent.getClass();
    b11 b11 = q0.a(paramBackEvent);
    v31 v311 = this.a;
    n2 n2 = v311.a;
    if (n2 != null) {
      if (v311.b) {
        e11 e11 = (e11)n2.e;
        e11.getClass();
        if (v311.equals(e11.h) && -1 == e11.g) {
          w31 w312 = e11.f;
          w31 w311 = w312;
          if (w312 == null)
            w311 = e11.c(-1); 
          if (w311 != null) {
            lb0 lb0;
            l90 l90 = w311.d;
            kb kb = new kb(b11);
            switch (l90.d) {
              case 1:
                lb0 = (lb0)l90.e;
                if (lb0.M(2)) {
                  StringBuilder stringBuilder = new StringBuilder("handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager ");
                  stringBuilder.append(lb0);
                  Log.v("FragmentManager", stringBuilder.toString());
                } 
                if (lb0.h != null) {
                  for (jx jx : lb0.f(new ArrayList(Collections.singletonList(lb0.h)), 0, 1)) {
                    jx.getClass();
                    if (lb0.M(2)) {
                      StringBuilder stringBuilder = new StringBuilder("SpecialEffectsController: Processing Progress ");
                      stringBuilder.append(kb.c);
                      Log.v("FragmentManager", stringBuilder.toString());
                    } 
                    ArrayList<Object> arrayList1 = jx.c;
                    ArrayList arrayList = new ArrayList();
                    int i = arrayList1.size();
                    byte b = 0;
                    while (b < i) {
                      Object object = arrayList1.get(b);
                      b++;
                      tm.l0(arrayList, ((go1)object).k);
                    } 
                    List<fo1> list = nm.v0(nm.x0(arrayList));
                    i = list.size();
                    for (b = 0; b < i; b++)
                      ((fo1)list.get(b)).c(kb, jx.a); 
                  } 
                  Iterator iterator = lb0.n.iterator();
                  if (!iterator.hasNext())
                    break; 
                  throw x41.g(iterator);
                } 
                break;
            } 
          } 
          ip1 ip1 = e11.a;
          g11 g11 = new g11(b11);
          ip1.getClass();
          ip1.g(null, g11);
        } 
      } 
      return;
    } 
    tp.f("This input is not added to any dispatcher.");
  }
  
  public final void onBackStarted(BackEvent paramBackEvent) {
    paramBackEvent.getClass();
    b11 b11 = q0.a(paramBackEvent);
    v31 v311 = this.a;
    n2 n2 = v311.a;
    if (n2 != null) {
      if (!v311.b) {
        n2.p(v311, b11);
        v311.b = true;
      } 
      return;
    } 
    tp.f("This input is not added to any dispatcher.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */