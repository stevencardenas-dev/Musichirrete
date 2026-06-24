import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class wm0 {
  public int a;
  
  public final boolean b;
  
  public final ArrayList c;
  
  public final WeakReference d;
  
  public boolean e;
  
  public boolean f;
  
  public Object g;
  
  public Object h;
  
  public Object i;
  
  public final Object j;
  
  public wm0(ee0 paramee0, hv0 paramhv01, xu0 paramxu0, int paramInt, boolean paramBoolean, hv0 paramhv02, Collection<?> paramCollection) {
    ArrayList arrayList;
    this.e = false;
    this.f = false;
    this.d = new WeakReference<ee0>(paramee0);
    this.i = paramhv01;
    this.g = paramxu0;
    this.a = paramInt;
    this.b = paramBoolean;
    this.h = paramee0.d;
    this.j = paramhv02;
    if (paramCollection == null) {
      paramhv01 = null;
    } else {
      arrayList = new ArrayList(paramCollection);
    } 
    this.c = arrayList;
    paramee0.a.postDelayed(new xt0(1, this), 15000L);
  }
  
  public wm0(um0 paramum0) {
    this.g = new gh1(10);
    this.b = true;
    this.h = new p70();
    pm0 pm0 = pm0.c;
    this.i = pm0;
    this.c = new ArrayList();
    this.d = new WeakReference<um0>(paramum0);
    this.j = new ip1(pm0);
  }
  
  public void a(sm0 paramsm0) {
    sm0 sm01;
    c(fXMDNeMWaILNVh.CzUQKJ);
    pm0 pm01 = (pm0)this.i;
    pm0 pm02 = pm0.b;
    if (pm01 != pm02)
      pm02 = pm0.c; 
    Object object2 = new Object();
    HashMap hashMap = xm0.a;
    boolean bool1 = paramsm0 instanceof sm0;
    boolean bool = false;
    if (bool1) {
      sm01 = paramsm0;
    } else {
      Class<?> clazz = paramsm0.getClass();
      if (xm0.b(clazz) == 2) {
        clazz = (Class<?>)xm0.b.get(clazz);
        clazz.getClass();
        List<Constructor> list = (List)clazz;
        if (list.size() != 1) {
          int i = list.size();
          sd0[] arrayOfSd0 = new sd0[i];
          if (i <= 0) {
            sm01 = new gd1(2, arrayOfSd0);
          } else {
            xm0.a(list.get(0), paramsm0);
            throw null;
          } 
        } else {
          xm0.a(list.get(0), paramsm0);
          throw null;
        } 
      } else {
        sm01 = new fm0(paramsm0);
      } 
    } 
    ((vm0)object2).b = sm01;
    ((vm0)object2).a = pm02;
    Object object1 = this.h;
    gi1 gi1 = object1.c(paramsm0);
    if (gi1 != null) {
      object1 = gi1.c;
    } else {
      HashMap<sm0, gi1> hashMap1 = ((p70)object1).g;
      gi1 = new gi1(paramsm0, object2);
      ((ji1)object1).f++;
      gi1 gi11 = ((ji1)object1).c;
      if (gi11 == null) {
        ((ji1)object1).b = gi1;
        ((ji1)object1).c = gi1;
      } else {
        gi11.e = gi1;
        gi1.f = gi11;
        ((ji1)object1).c = gi1;
      } 
      hashMap1.put(paramsm0, gi1);
      object1 = null;
    } 
    if ((vm0)object1 == null) {
      um0 um0 = this.d.get();
      if (um0 != null) {
        if (this.a != 0 || this.e)
          bool = true; 
        object1 = b(paramsm0);
        this.a++;
        while (((vm0)object2).a.compareTo(object1) < 0 && ((p70)this.h).g.containsKey(paramsm0)) {
          object1 = ((vm0)object2).a;
          ArrayList<Object> arrayList = this.c;
          arrayList.add(object1);
          mm0 mm0 = om0.Companion;
          object1 = ((vm0)object2).a;
          mm0.getClass();
          object1.getClass();
          int i = object1.ordinal();
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                object1 = null;
              } else {
                object1 = om0.ON_RESUME;
              } 
            } else {
              object1 = om0.ON_START;
            } 
          } else {
            object1 = om0.ON_CREATE;
          } 
          if (object1 != null) {
            object2.a(um0, (om0)object1);
            arrayList.remove(arrayList.size() - 1);
            object1 = b(paramsm0);
            continue;
          } 
          m60.p("no event up from ", ((vm0)object2).a);
          return;
        } 
        if (!bool)
          h(); 
        this.a--;
        return;
      } 
    } 
  }
  
  public pm0 b(sm0 paramsm0) {
    pm0 pm01;
    HashMap hashMap = ((p70)this.h).g;
    boolean bool = hashMap.containsKey(paramsm0);
    pm0 pm02 = null;
    if (bool) {
      gi1 gi1 = ((gi1)hashMap.get(paramsm0)).f;
    } else {
      paramsm0 = null;
    } 
    if (paramsm0 != null) {
      pm01 = ((vm0)((gi1)paramsm0).c).a;
    } else {
      paramsm0 = null;
    } 
    ArrayList<pm0> arrayList = this.c;
    if (!arrayList.isEmpty())
      pm02 = arrayList.get(arrayList.size() - 1); 
    pm0 pm03 = (pm0)this.i;
    pm03.getClass();
    if (paramsm0 == null || paramsm0.compareTo(pm03) >= 0)
      pm01 = pm03; 
    return (pm02 != null && pm02.compareTo(pm01) < 0) ? pm02 : pm01;
  }
  
  public void c(String paramString) {
    if (this.b) {
      (s8.Z()).k.getClass();
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
        return; 
      throw new IllegalStateException(x41.w("Method ", paramString, " must be called on the main thread").toString());
    } 
  }
  
  public void d() {
    xu0 xu0 = (xu0)this.g;
    hv0 hv0 = (hv0)this.h;
    int i = this.a;
    iv0.b();
    if (!this.e && !this.f) {
      fv0 fv0;
      WeakReference<ee0> weakReference = this.d;
      ee0 ee0 = weakReference.get();
      if (ee0 != null && ee0.g == this) {
        this.e = true;
        ee0.g = null;
        ee0 ee02 = weakReference.get();
        if (ee02 != null) {
          HashMap hashMap = ee02.b;
          if (ee02.d == hv0) {
            Message message = ee02.a.obtainMessage(263, hv0);
            message.arg1 = i;
            message.sendToTarget();
            xu01 = ee02.e;
            if (xu01 != null) {
              xu01.h(i);
              ee02.e.d();
            } 
            if (!hashMap.isEmpty()) {
              for (xu0 xu01 : hashMap.values()) {
                xu01.h(i);
                xu01.d();
              } 
              hashMap.clear();
            } 
            ee02.e = null;
          } 
        } 
        ee0 ee01 = weakReference.get();
        if (ee01 != null) {
          hv0 hv01 = (hv0)this.i;
          ee01.d = hv01;
          ee01.e = xu0;
          hv0 hv02 = (hv0)this.j;
          be0 be0 = ee01.a;
          boolean bool = this.b;
          if (hv02 == null) {
            be0.getClass();
            Message message = be0.obtainMessage(262, new de0(hv0, hv01, bool));
            message.arg1 = i;
            message.sendToTarget();
          } else {
            be0.getClass();
            Message message = be0.obtainMessage(264, new de0(hv02, hv01, bool));
            message.arg1 = i;
            message.sendToTarget();
          } 
          ee01.b.clear();
          ee01.i();
          ee01.n();
          ArrayList arrayList = this.c;
          if (arrayList != null) {
            fv0 = ee01.d.a();
            if (fv0 != null) {
              fv0.n(arrayList);
              return;
            } 
          } 
        } 
      } else if (!this.e && !this.f) {
        this.f = true;
        if (fv0 != null) {
          fv0.h(0);
          fv0.d();
        } 
      } 
    } 
  }
  
  public void e(om0 paramom0) {
    paramom0.getClass();
    c("handleLifecycleEvent");
    f(paramom0.a());
  }
  
  public void f(pm0 parampm0) {
    if ((pm0)this.i != parampm0) {
      um0 um0 = this.d.get();
      pm0 pm03 = (pm0)this.i;
      pm03.getClass();
      pm0 pm02 = pm0.c;
      pm0 pm01 = pm0.b;
      if (pm03 != pm02 || parampm0 != pm01) {
        if (pm03 != pm01 || pm03 == parampm0) {
          this.i = parampm0;
          if (this.e || this.a != 0) {
            this.f = true;
            return;
          } 
          this.e = true;
          h();
          this.e = false;
          if ((pm0)this.i == pm01)
            this.h = new p70(); 
          return;
        } 
        StringBuilder stringBuilder1 = new StringBuilder("State is '");
        stringBuilder1.append(pm01);
        stringBuilder1.append("' and cannot be moved to `");
        stringBuilder1.append(parampm0);
        stringBuilder1.append("` in component ");
        stringBuilder1.append(um0);
        throw new IllegalStateException(stringBuilder1.toString().toString());
      } 
      StringBuilder stringBuilder = new StringBuilder("State must be at least '");
      stringBuilder.append(pm0.e);
      stringBuilder.append("' to be moved to '");
      stringBuilder.append(parampm0);
      stringBuilder.append("' in component ");
      stringBuilder.append(um0);
      throw new IllegalStateException(stringBuilder.toString().toString());
    } 
  }
  
  public void g(sm0 paramsm0) {
    paramsm0.getClass();
    c("removeObserver");
    ((p70)this.h).d(paramsm0);
  }
  
  public void h() {
    um0 um0 = this.d.get();
    if (um0 != null)
      while (true) {
        f1 f1;
        p70 p70 = (p70)this.h;
        if (p70.f != 0) {
          gi1 gi11 = p70.b;
          gi11.getClass();
          pm0 pm03 = ((vm0)gi11.c).a;
          gi1 gi12 = ((p70)this.h).c;
          gi12.getClass();
          pm0 pm04 = ((vm0)gi12.c).a;
          if (pm03 != pm04 || (pm0)this.i != pm04) {
            this.f = false;
            pm03 = (pm0)this.i;
            gi1 gi14 = ((p70)this.h).b;
            gi14.getClass();
            int i = pm03.compareTo(((vm0)gi14.c).a);
            ArrayList<pm0> arrayList = this.c;
            if (i < 0) {
              p70 p701 = (p70)this.h;
              fi1 fi1 = new fi1(p701.c, p701.b, 1);
              p701.e.put(fi1, Boolean.FALSE);
              while (fi1.hasNext() && !this.f) {
                Map.Entry entry = (Map.Entry)fi1.next();
                entry.getClass();
                sm0 sm0 = (sm0)entry.getKey();
                vm0 vm0 = (vm0)entry.getValue();
                while (vm0.a.compareTo((pm0)this.i) > 0 && !this.f && ((p70)this.h).g.containsKey(sm0)) {
                  om0 om0;
                  mm0 mm0 = om0.Companion;
                  pm0 pm0 = vm0.a;
                  mm0.getClass();
                  pm0.getClass();
                  i = pm0.ordinal();
                  if (i != 2) {
                    if (i != 3) {
                      if (i != 4) {
                        mm0 = null;
                      } else {
                        om0 = om0.ON_PAUSE;
                      } 
                    } else {
                      om0 = om0.ON_STOP;
                    } 
                  } else {
                    om0 = om0.ON_DESTROY;
                  } 
                  if (om0 != null) {
                    arrayList.add(om0.a());
                    vm0.a(um0, om0);
                    arrayList.remove(arrayList.size() - 1);
                    continue;
                  } 
                  m60.p("no event down from ", vm0.a);
                  return;
                } 
              } 
            } 
            gi1 gi13 = ((p70)this.h).c;
            if (!this.f && gi13 != null && ((pm0<pm0>)this.i).compareTo(((vm0)gi13.c).a) > 0) {
              p70 p701 = (p70)this.h;
              p701.getClass();
              hi1 hi1 = new hi1(p701);
              p701.e.put(hi1, Boolean.FALSE);
              while (hi1.hasNext() && !this.f) {
                Map.Entry entry = (Map.Entry)hi1.next();
                sm0 sm0 = (sm0)entry.getKey();
                vm0 vm0 = (vm0)entry.getValue();
                while (vm0.a.compareTo((pm0)this.i) < 0 && !this.f && ((p70)this.h).g.containsKey(sm0)) {
                  om0 om0;
                  arrayList.add(vm0.a);
                  mm0 mm0 = om0.Companion;
                  pm0 pm0 = vm0.a;
                  mm0.getClass();
                  pm0.getClass();
                  i = pm0.ordinal();
                  if (i != 1) {
                    if (i != 2) {
                      if (i != 3) {
                        pm0 = null;
                      } else {
                        om0 = om0.ON_RESUME;
                      } 
                    } else {
                      om0 = om0.ON_START;
                    } 
                  } else {
                    om0 = om0.ON_CREATE;
                  } 
                  if (om0 != null) {
                    vm0.a(um0, om0);
                    arrayList.remove(arrayList.size() - 1);
                    continue;
                  } 
                  m60.p("no event up from ", vm0.a);
                  return;
                } 
              } 
            } 
            continue;
          } 
        } 
        this.f = false;
        ip1 ip1 = (ip1)this.j;
        pm0 pm02 = (pm0)this.i;
        ip1.getClass();
        pm0 pm01 = pm02;
        if (pm02 == null)
          f1 = dd1.f; 
        ip1.g(null, f1);
        return;
      }  
    tp.f("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */