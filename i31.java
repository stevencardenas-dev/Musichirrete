import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

public final class i31 extends jy1 {
  public static final h31 c = new h31(1);
  
  public final my a;
  
  public final int b;
  
  public i31(my parammy, int paramInt) {
    this.a = parammy;
    this.b = paramInt;
  }
  
  public final Object b(tk0 paramtk0) {
    ArrayList<Serializable> arrayList1;
    int i = paramtk0.C();
    int j = x41.y(i);
    if (j != 0) {
      if (j != 2) {
        arrayList1 = null;
      } else {
        paramtk0.c();
        qn0 qn0 = new qn0(true);
      } 
    } else {
      paramtk0.a();
      arrayList1 = new ArrayList();
    } 
    if (arrayList1 == null)
      return d(i, paramtk0); 
    ArrayDeque<ArrayList<Serializable>> arrayDeque = new ArrayDeque();
    ArrayList<Serializable> arrayList2 = arrayList1;
    while (true) {
      while (paramtk0.o()) {
        Object object;
        if (arrayList2 instanceof Map) {
          object = paramtk0.w();
        } else {
          object = null;
        } 
        j = paramtk0.C();
        i = x41.y(j);
        if (i != 0) {
          if (i != 2) {
            arrayList1 = null;
          } else {
            paramtk0.c();
            qn0 qn0 = new qn0(true);
          } 
        } else {
          paramtk0.a();
          arrayList1 = new ArrayList();
        } 
        if (arrayList1 != null) {
          i = 1;
        } else {
          i = 0;
        } 
        Serializable serializable1 = arrayList1;
        if (arrayList1 == null)
          serializable1 = d(j, paramtk0); 
        if (arrayList2 instanceof java.util.List) {
          arrayList2.add(serializable1);
        } else {
          ((Map)arrayList2).put(object, serializable1);
        } 
        if (i != 0) {
          arrayDeque.addLast(arrayList2);
          serializable = serializable1;
        } 
      } 
      if (serializable instanceof java.util.List) {
        paramtk0.h();
      } else {
        paramtk0.k();
      } 
      if (arrayDeque.isEmpty())
        return serializable; 
      Serializable serializable = arrayDeque.removeLast();
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    Class<?> clazz = paramObject.getClass();
    my my1 = this.a;
    my1.getClass();
    jy1 jy11 = my1.b(new rz1(clazz));
    if (jy11 instanceof i31) {
      paramcl0.d();
      paramcl0.k();
      return;
    } 
    jy11.c(paramcl0, paramObject);
  }
  
  public final Serializable d(int paramInt, tk0 paramtk0) {
    int i = x41.y(paramInt);
    if (i != 5) {
      if (i != 6) {
        if (i != 7) {
          if (i == 8) {
            paramtk0.y();
            return null;
          } 
          tp.f("Unexpected token: ".concat(x41.z(paramInt)));
          return null;
        } 
        return Boolean.valueOf(paramtk0.r());
      } 
      return ga1.b(this.b, paramtk0);
    } 
    return paramtk0.A();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */