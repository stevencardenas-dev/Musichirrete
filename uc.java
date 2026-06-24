import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public abstract class uc implements cs, zs, Serializable {
  public final cs b;
  
  public uc(cs paramcs) {
    this.b = paramcs;
  }
  
  public zs d() {
    cs cs1 = this.b;
    return (cs1 instanceof zs) ? (zs)cs1 : null;
  }
  
  public final void f(Object paramObject) {
    uc uc1 = this;
    while (true) {
      uc uc2 = uc1;
      cs cs1 = uc2.b;
      cs1.getClass();
      try {
        Object object = uc2.n(paramObject);
        ys ys = ys.b;
        paramObject = object;
      } finally {
        paramObject = null;
      } 
      uc2.o();
      if (cs1 instanceof uc)
        continue; 
      cs1.f(paramObject);
      return;
    } 
  }
  
  public cs l(cs paramcs, Object paramObject) {
    throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
  }
  
  public StackTraceElement m() {
    int i;
    Object object1;
    pv pv = getClass().<pv>getAnnotation(pv.class);
    zv0 zv02 = null;
    if (pv == null || pv.v() < 1)
      return null; 
    byte b = -1;
    try {
      Field field = getClass().getDeclaredField(LHyji.sSWBfUoJctiQ);
      field.setAccessible(true);
      object1 = field.get(this);
      if (object1 instanceof Integer) {
        object1 = object1;
      } else {
        object1 = null;
      } 
      if (object1 != null) {
        i = object1.intValue();
      } else {
        i = 0;
      } 
      i--;
    } catch (Exception null) {
      i = -1;
    } 
    if (i < 0) {
      i = b;
    } else {
      i = pv.l()[i];
    } 
    Object object2 = ui0.d;
    zv0 zv03 = ui0.e;
    zv0 zv01 = zv03;
    if (zv03 == null)
      try {
        Method method3 = Class.class.getDeclaredMethod(JkpGFvCVQHzgc.XKccvqdfUl, null);
        Method method2 = getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null);
        Method method1 = getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null);
        zv01 = new zv0();
        this(method3, method2, method1, 10);
        ui0.e = zv01;
      } catch (Exception null) {
        ui0.e = (zv0)object2;
        zv01 = (zv0)object2;
      }  
    if (zv01 == object2) {
      object2 = zv02;
    } else {
      Method method = (Method)zv01.c;
      object2 = zv02;
      if (method != null) {
        Object object = method.invoke(getClass(), null);
        if (object == null) {
          object2 = zv02;
        } else {
          Method method1 = (Method)zv01.e;
          object2 = zv02;
          if (method1 != null) {
            object2 = method1.invoke(object, null);
            if (object2 == null) {
              object2 = zv02;
            } else {
              object1 = zv01.f;
              if (object1 != null) {
                Object object3 = object1.invoke(object2, null);
              } else {
                object1 = null;
              } 
              object2 = zv02;
              if (object1 instanceof String)
                object2 = object1; 
            } 
          } 
        } 
      } 
    } 
    if (object2 == null) {
      object1 = pv.c();
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append((String)object2);
      stringBuilder.append('/');
      stringBuilder.append(pv.c());
      object1 = stringBuilder.toString();
    } 
    return new StackTraceElement((String)object1, pv.m(), pv.f(), i);
  }
  
  public abstract Object n(Object paramObject);
  
  public void o() {}
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Continuation at ");
    StackTraceElement stackTraceElement2 = m();
    StackTraceElement stackTraceElement1 = stackTraceElement2;
    if (stackTraceElement2 == null)
      str = getClass().getName(); 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */