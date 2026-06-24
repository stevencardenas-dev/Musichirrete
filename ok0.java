import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public class ok0 extends jy1 {
  public static final ok0 a = new ok0();
  
  public static nk0 d(tk0 paramtk0) {
    ik0 ik01;
    int j = paramtk0.C();
    int i = x41.y(j);
    if (i != 0) {
      if (i != 2) {
        ik01 = null;
      } else {
        paramtk0.c();
        rk0 rk0 = new rk0();
      } 
    } else {
      paramtk0.a();
      ik01 = new ik0();
    } 
    if (ik01 == null)
      return e(j, paramtk0); 
    ArrayDeque<ik0> arrayDeque = new ArrayDeque();
    ik0 ik02 = ik01;
    while (true) {
      while (paramtk0.o()) {
        String str;
        if (ik02 instanceof rk0) {
          str = paramtk0.w();
        } else {
          str = null;
        } 
        j = paramtk0.C();
        i = x41.y(j);
        if (i != 0) {
          if (i != 2) {
            ik01 = null;
          } else {
            paramtk0.c();
            rk0 rk0 = new rk0();
          } 
        } else {
          paramtk0.a();
          ik01 = new ik0();
        } 
        if (ik01 != null) {
          i = 1;
        } else {
          i = 0;
        } 
        nk0 nk01 = ik01;
        if (ik01 == null)
          nk01 = e(j, paramtk0); 
        if (ik02 instanceof ik0) {
          ik02.j(nk01);
        } else {
          ((rk0)ik02).j(str, nk01);
        } 
        if (i != 0) {
          arrayDeque.addLast(ik02);
          nk0 = nk01;
        } 
      } 
      if (nk0 instanceof ik0) {
        paramtk0.h();
      } else {
        paramtk0.k();
      } 
      if (arrayDeque.isEmpty())
        return nk0; 
      nk0 nk0 = arrayDeque.removeLast();
    } 
  }
  
  public static nk0 e(int paramInt, tk0 paramtk0) {
    String str;
    int i = x41.y(paramInt);
    if (i != 5) {
      if (i != 6) {
        if (i != 7) {
          if (i == 8) {
            paramtk0.y();
            return qk0.b;
          } 
          str = x41.z(paramInt);
          tp.f(fXMDNeMWaILNVh.eQOVdGNAVbuHg.concat(str));
          return null;
        } 
        return new sk0(Boolean.valueOf(str.r()));
      } 
      return new sk0(new ul0(str.A()));
    } 
    return new sk0(str.A());
  }
  
  public static void f(nk0 paramnk0, cl0 paramcl0) {
    ArrayList<Object> arrayList;
    pn0 pn0;
    if (paramnk0 == null || paramnk0 instanceof qk0) {
      paramcl0.o();
      return;
    } 
    if (paramnk0 instanceof sk0) {
      paramnk0 = paramnk0;
      Serializable serializable = ((sk0)paramnk0).b;
      if (serializable instanceof Number) {
        paramcl0.v(paramnk0.k());
        return;
      } 
      if (serializable instanceof Boolean) {
        paramcl0.x(paramnk0.c());
        return;
      } 
      paramcl0.w(paramnk0.i());
      return;
    } 
    if (paramnk0 instanceof ik0) {
      paramcl0.c();
      arrayList = (paramnk0.f()).b;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        nk0 nk01 = (nk0)arrayList.get(b);
        b++;
        f(nk01, paramcl0);
      } 
      paramcl0.h();
      return;
    } 
    if (arrayList instanceof rk0) {
      paramcl0.d();
      Iterator iterator = ((on0)(arrayList.g()).b.entrySet()).iterator();
      while (((nn0)iterator).hasNext()) {
        pn0 = ((nn0)iterator).b();
        paramcl0.l((String)pn0.getKey());
        f((nk0)pn0.getValue(), paramcl0);
      } 
      paramcl0.k();
      return;
    } 
    tp.g(jLnXOLx.geKbsPPFAxjw, pn0.getClass());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ok0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */