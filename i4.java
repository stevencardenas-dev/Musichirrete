import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

public final class i4 implements u71, jw0 {
  public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
  
  public final tu1 c = new tu1();
  
  public final h4 e = new h4();
  
  public p60 f;
  
  public final void a(int paramInt) {
    h4 h41 = this.e;
    h41.e = h41.d;
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void b() {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void c() {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void d(int paramInt, fw0 paramfw0) {
    j(paramInt, paramfw0);
    h4 h41 = this.e;
    ArrayList<g4> arrayList = h41.a;
    g4 g4 = (g4)h41.b.remove(paramfw0);
    if (g4 != null) {
      arrayList.remove(g4);
      g4 = h41.f;
      if (g4 != null && paramfw0.equals(g4.a)) {
        g4 g41;
        if (arrayList.isEmpty()) {
          paramfw0 = null;
        } else {
          g41 = arrayList.get(0);
        } 
        h41.f = g41;
      } 
      if (!arrayList.isEmpty())
        h41.d = arrayList.get(0); 
      Iterator iterator = this.b.iterator();
      if (iterator.hasNext())
        throw x41.g(iterator); 
    } 
  }
  
  public final ip2 e(int paramInt, fw0 paramfw0, uu1 paramuu1) {
    byte b;
    if (paramuu1.n())
      paramfw0 = null; 
    SystemClock.elapsedRealtime();
    p60 p601 = this.f;
    if (paramuu1 == p601.q.a && paramInt == p601.n()) {
      b = 1;
    } else {
      b = 0;
    } 
    if (paramfw0 != null && paramfw0.b()) {
      if (b) {
        p60 p602 = this.f;
        boolean bool = p602.p();
        b = -1;
        if (bool) {
          paramInt = p602.q.b.b;
        } else {
          paramInt = -1;
        } 
        if (paramInt == paramfw0.b) {
          p602 = this.f;
          paramInt = b;
          if (p602.p())
            paramInt = p602.q.b.c; 
          if (paramInt == paramfw0.c)
            this.f.m(); 
        } 
      } 
    } else {
      p60 p602;
      if (b != 0) {
        p602 = this.f;
        su1 su1 = p602.h;
        if (p602.p()) {
          q71 q71 = p602.q;
          q71.a.g(q71.b.a, su1);
          q71 = p602.q;
          if (q71.d == -9223372036854775807L) {
            rh.b((q71.a.l(p602.n(), (tu1)p602.a, 0L)).i);
          } else {
            rh.b(su1.e);
            rh.b(p602.q.d);
          } 
        } else {
          p602.m();
        } 
      } else if (!p602.n()) {
        long l = (p602.l(paramInt, this.c, 0L)).i;
        UUID uUID = rh.a;
      } 
    } 
    this.f.m();
    rh.b(this.f.q.l);
    return (ip2)new Object();
  }
  
  public final ip2 f(g4 paramg4) {
    this.f.getClass();
    g4 g41 = paramg4;
    if (paramg4 == null) {
      int i = this.f.n();
      h4 h41 = this.e;
      ArrayList<g4> arrayList = h41.a;
      paramg4 = null;
      byte b = 0;
      while (true) {
        g41 = paramg4;
        if (b < arrayList.size()) {
          g4 g42 = arrayList.get(b);
          int j = h41.g.b(g42.a.a);
          g41 = paramg4;
          if (j != -1) {
            g41 = paramg4;
            if ((h41.g.f(j, h41.c, false)).c == i) {
              if (paramg4 != null) {
                g41 = null;
                break;
              } 
              g41 = g42;
            } 
          } 
          b++;
          paramg4 = g41;
          continue;
        } 
        break;
      } 
      if (g41 == null) {
        uu1 uu11 = this.f.q.a;
        if (i >= uu11.m())
          uu11 = uu1.a; 
        return e(i, null, uu11);
      } 
    } 
    uu1 uu1 = g41.b;
    return e(g41.c, g41.a, uu1);
  }
  
  public final void g(l60 paraml60) {
    f(this.e.e);
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void h(int paramInt, fw0 paramfw0) {
    int i;
    uu1 uu1;
    h4 h41 = this.e;
    ArrayList<g4> arrayList = h41.a;
    int j = h41.g.b(paramfw0.a);
    if (j != -1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      uu1 = h41.g;
    } else {
      uu1 = uu1.a;
    } 
    if (i) {
      i = (h41.g.f(j, h41.c, false)).c;
    } else {
      i = paramInt;
    } 
    g4 g4 = new g4(i, paramfw0, uu1);
    arrayList.add(g4);
    h41.b.put(paramfw0, g4);
    h41.d = arrayList.get(0);
    if (arrayList.size() == 1 && !h41.g.n())
      h41.e = h41.d; 
    j(paramInt, paramfw0);
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void i() {
    h4 h41 = this.e;
    if (h41.h) {
      h41.h = false;
      h41.e = h41.d;
      k();
      Iterator iterator = this.b.iterator();
      if (iterator.hasNext())
        throw x41.g(iterator); 
    } 
  }
  
  public final void j(int paramInt, fw0 paramfw0) {
    this.f.getClass();
    ru1 ru1 = uu1.a;
    if (paramfw0 != null) {
      g4 g4 = (g4)this.e.b.get(paramfw0);
      if (g4 != null) {
        f(g4);
        return;
      } 
      e(paramInt, paramfw0, ru1);
      return;
    } 
    uu1 uu12 = this.f.q.a;
    uu1 uu11 = ru1;
    if (paramInt < uu12.m())
      uu11 = uu12; 
    e(paramInt, null, uu11);
  }
  
  public final void k() {
    g4 g4;
    h4 h41 = this.e;
    ArrayList<g4> arrayList = h41.a;
    if (arrayList.isEmpty() || h41.g.n() || h41.h) {
      h41 = null;
    } else {
      g4 = arrayList.get(0);
    } 
    f(g4);
  }
  
  public final void l() {
    ArrayList<Object> arrayList = new ArrayList(this.e.a);
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      g4 g4 = (g4)arrayList.get(b);
      b++;
      g4 = g4;
      d(g4.c, g4.a);
    } 
  }
  
  public final void n(int paramInt) {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void o() {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void q() {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void s() {
    k();
    Iterator iterator = this.b.iterator();
    if (!iterator.hasNext())
      return; 
    throw x41.g(iterator);
  }
  
  public final void t(uu1 paramuu1) {
    try {
      this.e.a(paramuu1);
      k();
      Iterator iterator = this.b.iterator();
      if (!iterator.hasNext())
        return; 
      if (iterator.next() == null)
        throw null; 
      ClassCastException classCastException = new ClassCastException();
      this();
      throw classCastException;
    } finally {
      paramuu1 = null;
      paramuu1.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */