import java.util.ArrayList;

public final class bg0 extends m52 {
  public final void a(cy paramcy) {
    Object object1;
    Object object2;
    yb yb = (yb)this.b;
    int i = yb.s0;
    paramcy = this.h;
    ArrayList arrayList = ((iy)paramcy).l;
    int j = arrayList.size();
    byte b1 = 0;
    byte b = -1;
    byte b2 = 0;
    while (true) {
      while (true)
        break; 
      if (b1 < SYNTHETIC_LOCAL_VARIABLE_4) {
        object2 = SYNTHETIC_LOCAL_VARIABLE_4;
        Object object = SYNTHETIC_LOCAL_VARIABLE_7;
        object1 = SYNTHETIC_LOCAL_VARIABLE_3;
      } 
    } 
    if (i == 0 || i == 2) {
      paramcy.d(object1 + yb.u0);
      return;
    } 
    paramcy.d(object2 + yb.u0);
  }
  
  public final void d() {
    er er = this.b;
    if (er instanceof yb) {
      iy iy = this.h;
      iy.b = true;
      ArrayList<iy> arrayList = iy.l;
      er = er;
      int i = ((yb)er).s0;
      boolean bool = ((yb)er).t0;
      boolean bool1 = false;
      byte b1 = 0;
      boolean bool2 = false;
      byte b2 = 0;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              iy.e = 7;
              for (b1 = b2; b1 < ((yb)er).r0; b1++) {
                er er1 = ((yb)er).q0[b1];
                if (bool || er1.g0 != 8) {
                  iy iy1 = er1.e.i;
                  iy1.k.add(iy);
                  arrayList.add(iy1);
                } 
              } 
              m(this.b.e.h);
              m(this.b.e.i);
              return;
            } 
          } else {
            iy.e = 6;
            for (b1 = bool1; b1 < ((yb)er).r0; b1++) {
              er er1 = ((yb)er).q0[b1];
              if (bool || er1.g0 != 8) {
                iy iy1 = er1.e.h;
                iy1.k.add(iy);
                arrayList.add(iy1);
              } 
            } 
            m(this.b.e.h);
            m(this.b.e.i);
            return;
          } 
        } else {
          iy.e = 5;
          while (b1 < ((yb)er).r0) {
            er er1 = ((yb)er).q0[b1];
            if (bool || er1.g0 != 8) {
              iy iy1 = er1.d.i;
              iy1.k.add(iy);
              arrayList.add(iy1);
            } 
            b1++;
          } 
          m(this.b.d.h);
          m(this.b.d.i);
          return;
        } 
      } else {
        iy.e = 4;
        for (b1 = bool2; b1 < ((yb)er).r0; b1++) {
          er er1 = ((yb)er).q0[b1];
          if (bool || er1.g0 != 8) {
            iy iy1 = er1.d.h;
            iy1.k.add(iy);
            arrayList.add(iy1);
          } 
        } 
        m(this.b.d.h);
        m(this.b.d.i);
      } 
    } 
  }
  
  public final void e() {
    er er = this.b;
    if (er instanceof yb) {
      int i = ((yb)er).s0;
      iy iy = this.h;
      if (i == 0 || i == 1) {
        er.Y = iy.g;
        return;
      } 
      er.Z = iy.g;
      return;
    } 
  }
  
  public final void f() {
    this.c = null;
    this.h.c();
  }
  
  public final boolean k() {
    return false;
  }
  
  public final void m(iy paramiy) {
    iy iy1 = this.h;
    iy1.k.add(paramiy);
    paramiy.l.add(iy1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */