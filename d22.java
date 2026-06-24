import java.util.ArrayList;

public final class d22 extends m52 {
  public iy k;
  
  public ke l;
  
  public final void a(cy paramcy) {
    if (x41.y(this.j) != 3) {
      paramcy = this.e;
      if (((iy)paramcy).c && !((iy)paramcy).j && this.d == 3) {
        er er1 = this.b;
        int i = er1.s;
        if (i != 2) {
          if (i == 3) {
            rz rz = er1.d.e;
            if (rz.j) {
              i = er1.X;
              if (i != -1) {
                if (i != 0) {
                  if (i != 1) {
                    i = 0;
                  } else {
                    float f2 = rz.g;
                    float f1 = er1.W;
                    f1 = f2 / f1;
                  } 
                } else {
                  float f = rz.g * er1.W;
                  i = (int)(f + 0.5F);
                } 
              } else {
                float f2 = rz.g;
                float f1 = er1.W;
                f1 = f2 / f1;
              } 
              paramcy.d(i);
            } 
          } 
        } else {
          er er2 = er1.T;
          if (er2 != null) {
            rz rz = er2.e.e;
            if (rz.j) {
              float f = er1.z;
              paramcy.d((int)(rz.g * f + 0.5F));
            } 
          } 
        } 
      } 
      iy iy1 = this.h;
      boolean bool = iy1.c;
      ArrayList<iy> arrayList = iy1.l;
      if (bool) {
        iy iy2 = this.i;
        bool = iy2.c;
        ArrayList<iy> arrayList1 = iy2.l;
        if (bool && (!iy1.j || !iy2.j || !((iy)paramcy).j)) {
          iy iy3;
          iy iy4;
          if (!((iy)paramcy).j && this.d == 3) {
            er er1 = this.b;
            if (er1.r == 0 && !er1.w()) {
              iy4 = arrayList.get(0);
              iy3 = arrayList1.get(0);
              int j = iy4.g + iy1.f;
              int i = iy3.g + iy2.f;
              iy1.d(j);
              iy2.d(i);
              paramcy.d(i - j);
              return;
            } 
          } 
          if (!((iy)paramcy).j && this.d == 3 && this.a == 1 && iy4.size() > 0 && iy3.size() > 0) {
            iy iy6 = iy4.get(0);
            iy iy5 = iy3.get(0);
            int i = iy6.g;
            int j = iy1.f;
            i = iy5.g + iy2.f - i + j;
            j = ((rz)paramcy).m;
            if (i < j) {
              paramcy.d(i);
            } else {
              paramcy.d(j);
            } 
          } 
          if (((iy)paramcy).j && iy4.size() > 0 && iy3.size() > 0) {
            iy4 = iy4.get(0);
            iy3 = iy3.get(0);
            int i = iy4.g;
            int m = iy1.f;
            int j = iy3.g;
            int k = iy2.f;
            float f1 = this.b.e0;
            if (iy4 == iy3) {
              f1 = 0.5F;
            } else {
              i = m + i;
              j = k + j;
            } 
            k = ((iy)paramcy).g;
            float f2 = i;
            iy1.d((int)((j - i - k) * f1 + f2 + 0.5F));
            iy2.d(iy1.g + ((iy)paramcy).g);
          } 
        } 
      } 
      return;
    } 
    er er = this.b;
    l(er.J, er.L, 1);
  }
  
  public final void d() {
    er er2;
    er er3;
    iy iy4;
    iy iy1 = this.k;
    er er1 = this.b;
    boolean bool = er1.a;
    rz rz = this.e;
    if (bool)
      rz.d(er1.i()); 
    bool = rz.j;
    ArrayList arrayList2 = rz.k;
    ArrayList arrayList1 = rz.l;
    iy iy3 = this.i;
    iy iy2 = this.h;
    if (!bool) {
      er er = this.b;
      this.d = er.p0[1];
      if (er.E)
        this.l = (ke)new rz(this); 
      int i = this.d;
      if (i != 3) {
        if (i == 4) {
          er = this.b.T;
          if (er != null && er.p0[1] == 1) {
            i = er.i();
            int j = this.b.J.d();
            int k = this.b.L.d();
            m52.b(iy2, er.e.h, this.b.J.d());
            m52.b(iy3, er.e.i, -this.b.L.d());
            rz.d(i - j - k);
            return;
          } 
        } 
        if (i == 1)
          rz.d(this.b.i()); 
      } 
    } else if (this.d == 4) {
      er er6 = this.b;
      er er5 = er6.T;
      if (er5 != null && er5.p0[1] == 1) {
        m52.b(iy2, er5.e.h, er6.J.d());
        m52.b(iy3, er5.e.i, -this.b.L.d());
        return;
      } 
    } 
    bool = rz.j;
    if (bool) {
      er er = this.b;
      if (er.a) {
        bq[] arrayOfBq1 = er.Q;
        bq bq3 = arrayOfBq1[2];
        bq bq4 = bq3.f;
        if (bq4 != null && (arrayOfBq1[3]).f != null) {
          bool = er.w();
          er2 = this.b;
          if (bool) {
            iy2.f = er2.Q[2].d();
            iy3.f = -this.b.Q[3].d();
          } else {
            iy iy5 = m52.h(er2.Q[2]);
            if (iy5 != null)
              m52.b(iy2, iy5, this.b.Q[2].d()); 
            iy5 = m52.h(this.b.Q[3]);
            if (iy5 != null)
              m52.b(iy3, iy5, -this.b.Q[3].d()); 
            iy2.b = true;
            iy3.b = true;
          } 
          er2 = this.b;
          if (er2.E) {
            m52.b(iy1, iy2, er2.a0);
            return;
          } 
        } else {
          iy iy5;
          if (bq4 != null) {
            iy5 = m52.h(bq3);
            if (iy5 != null) {
              m52.b(iy2, iy5, this.b.Q[2].d());
              m52.b(iy3, iy2, ((iy)er2).g);
              er2 = this.b;
              if (er2.E) {
                m52.b(iy1, iy2, er2.a0);
                return;
              } 
            } 
          } else {
            iy4 = iy5[3];
            if (((bq)iy4).f != null) {
              iy5 = m52.h((bq)iy4);
              if (iy5 != null) {
                m52.b(iy3, iy5, -this.b.Q[3].d());
                m52.b(iy2, iy3, -((iy)er2).g);
              } 
              er2 = this.b;
              if (er2.E) {
                m52.b(iy1, iy2, er2.a0);
                return;
              } 
            } else {
              iy5 = iy5[4];
              if (((bq)iy5).f != null) {
                iy5 = m52.h((bq)iy5);
                if (iy5 != null) {
                  m52.b(iy1, iy5, 0);
                  m52.b(iy2, iy1, -this.b.a0);
                  m52.b(iy3, iy2, ((iy)er2).g);
                  return;
                } 
              } else if (!(er instanceof yb) && er.T != null && (er.g(7)).f == null) {
                er3 = this.b;
                m52.b(iy2, er3.T.e.h, er3.q());
                m52.b(iy3, iy2, ((iy)er2).g);
                er2 = this.b;
                if (er2.E) {
                  m52.b(iy1, iy2, er2.a0);
                  return;
                } 
              } 
            } 
          } 
        } 
        return;
      } 
    } 
    if (!bool && this.d == 3) {
      rz rz1;
      er er = this.b;
      int i = er.s;
      if (i != 2) {
        if (i == 3 && !er.w()) {
          er = this.b;
          if (er.r != 3) {
            rz1 = er.d.e;
            er3.add(rz1);
            rz1.k.add(er2);
            ((iy)er2).b = true;
            iy4.add(iy2);
            iy4.add(iy3);
          } 
        } 
      } else {
        er er5 = ((er)rz1).T;
        if (er5 != null) {
          rz rz2 = er5.e.e;
          er3.add(rz2);
          rz2.k.add(er2);
          ((iy)er2).b = true;
          iy4.add(iy2);
          iy4.add(iy3);
        } 
      } 
    } else {
      er2.b(this);
    } 
    er er4 = this.b;
    bq[] arrayOfBq = er4.Q;
    bq bq2 = arrayOfBq[2];
    bq bq1 = bq2.f;
    if (bq1 != null && (arrayOfBq[3]).f != null) {
      bool = er4.w();
      er4 = this.b;
      if (bool) {
        iy2.f = er4.Q[2].d();
        iy3.f = -this.b.Q[3].d();
      } else {
        iy iy5 = m52.h(er4.Q[2]);
        iy3 = m52.h(this.b.Q[3]);
        if (iy5 != null)
          iy5.b(this); 
        if (iy3 != null)
          iy3.b(this); 
        this.j = 4;
      } 
      if (this.b.E)
        c(iy1, iy2, 1, this.l); 
    } else {
      fg0 fg0;
      if (bq1 != null) {
        iy iy5 = m52.h(bq2);
        if (iy5 != null) {
          m52.b(iy2, iy5, this.b.Q[2].d());
          c(iy3, iy2, 1, (rz)er2);
          if (this.b.E)
            c(iy1, iy2, 1, this.l); 
          if (this.d == 3) {
            er er = this.b;
            if (er.W > 0.0F) {
              fg0 = er.d;
              if (fg0.d == 3) {
                fg0.e.k.add(er2);
                er3.add(this.b.d.e);
                ((iy)er2).a = this;
              } 
            } 
          } 
        } 
      } else {
        bq1 = arrayOfBq[3];
        if (bq1.f != null) {
          iy iy5 = m52.h(bq1);
          if (iy5 != null) {
            m52.b(iy3, iy5, -this.b.Q[3].d());
            c(iy2, iy3, -1, (rz)er2);
            if (this.b.E)
              c((iy)fg0, iy2, 1, this.l); 
          } 
        } else {
          iy iy5;
          bq bq = arrayOfBq[4];
          if (bq.f != null) {
            iy5 = m52.h(bq);
            if (iy5 != null) {
              m52.b((iy)fg0, iy5, 0);
              c(iy2, (iy)fg0, -1, this.l);
              c(iy3, iy2, 1, (rz)er2);
            } 
          } else if (!(iy5 instanceof yb)) {
            er er = ((er)iy5).T;
            if (er != null) {
              m52.b(iy2, er.e.h, iy5.q());
              c(iy3, iy2, 1, (rz)er2);
              if (this.b.E)
                c((iy)fg0, iy2, 1, this.l); 
              if (this.d == 3) {
                er er5 = this.b;
                if (er5.W > 0.0F) {
                  fg0 fg01 = er5.d;
                  if (fg01.d == 3) {
                    fg01.e.k.add(er2);
                    er3.add(this.b.d.e);
                    ((iy)er2).a = this;
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    if (er3.size() == 0)
      ((iy)er2).c = true; 
  }
  
  public final void e() {
    iy iy1 = this.h;
    if (iy1.j)
      this.b.Z = iy1.g; 
  }
  
  public final void f() {
    this.c = null;
    this.h.c();
    this.i.c();
    this.k.c();
    this.e.c();
    this.g = false;
  }
  
  public final boolean k() {
    return (this.d != 3 || this.b.s == 0);
  }
  
  public final void m() {
    this.g = false;
    iy iy1 = this.h;
    iy1.c();
    iy1.j = false;
    iy1 = this.i;
    iy1.c();
    iy1.j = false;
    iy1 = this.k;
    iy1.c();
    iy1.j = false;
    this.e.j = false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("VerticalRun ");
    stringBuilder.append(this.b.h0);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */