import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class ih implements e52 {
  public Object b;
  
  public ni c;
  
  public final lh e;
  
  public ih(lh paramlh) {
    this.e = paramlh;
    this.b = nh.p;
  }
  
  public final void a(ek1 paramek1, int paramInt) {
    ni ni1 = this.c;
    if (ni1 != null)
      ni1.a(paramek1, paramInt); 
  }
  
  public final Object b(z80 paramz80) {
    Object object = this.b;
    f1 f1 = nh.p;
    boolean bool = true;
    if (object == f1 || object == nh.l) {
      AtomicReferenceFieldUpdater<lh, kk> atomicReferenceFieldUpdater = lh.i;
      lh lh1 = this.e;
      kk kk = atomicReferenceFieldUpdater.get(lh1);
      while (true) {
        Throwable throwable;
        Object object1;
        if (lh1.y(lh.c.get(lh1), true)) {
          this.b = nh.l;
          throwable = lh1.r();
          if (throwable == null) {
            bool = false;
            continue;
          } 
          int j = uo1.a;
          throw throwable;
        } 
        long l1 = lh.e.getAndIncrement(lh1);
        long l3 = nh.b;
        long l2 = l1 / l3;
        int i = (int)(l1 % l3);
        if (kk.e != l2) {
          object = lh1.o(l2, kk);
          if (object == null)
            continue; 
          object1 = object;
        } 
        object = lh1.L((kk)object1, i, l1, null);
        f1 f11 = nh.m;
        if (object != f11) {
          f1 f12 = nh.o;
          if (object == f12) {
            if (l1 < lh1.t())
              object1.a(); 
            continue;
          } 
          if (object == nh.n) {
            object = g92.F(dd1.N((cs)throwable));
            try {
              this.c = (ni)object;
              Object object2 = lh1.L((kk)object1, i, l1, this);
              if (object2 == f11) {
                a((ek1)object1, i);
              } else if (object2 == f12) {
                if (l1 < lh1.t())
                  object1.a(); 
                for (object2 = lh.i.get(lh1);; object2 = Boolean.TRUE) {
                  Throwable throwable1;
                  if (lh1.y(lh.c.get(lh1), true)) {
                    object2 = this.c;
                    object2.getClass();
                    this.c = null;
                    this.b = nh.l;
                    throwable1 = lh1.r();
                    if (throwable1 == null) {
                      object2.f(Boolean.FALSE);
                      break;
                    } 
                    object1 = new qg1();
                    super(throwable1);
                    object2.f(object1);
                    break;
                  } 
                  l2 = lh.e.getAndIncrement(throwable1);
                  l3 = nh.b;
                  l1 = l2 / l3;
                  i = (int)(l2 % l3);
                  if (((ek1)object2).e != l1) {
                    object1 = throwable1.o(l1, (kk)object2);
                    if (object1 == null)
                      continue; 
                    object2 = object1;
                  } 
                  object1 = throwable1.L((kk)object2, i, l2, this);
                  if (object1 == nh.m) {
                    a((ek1)object2, i);
                    break;
                  } 
                  if (object1 == nh.o) {
                    if (l2 < throwable1.t())
                      object2.a(); 
                    continue;
                  } 
                  if (object1 != nh.n) {
                    object2.a();
                    this.b = object1;
                    this.c = null;
                  } else {
                    object2 = new IllegalStateException();
                    super("unexpected");
                    throw object2;
                  } 
                } 
              } else {
                object1.a();
                this.b = object2;
                this.c = null;
                object2 = Boolean.TRUE;
              } 
            } finally {}
            return object.v();
          } 
          object1.a();
          this.b = object;
          return Boolean.valueOf(bool);
        } 
        tp.f("unreachable");
        return null;
      } 
    } 
    return Boolean.valueOf(bool);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */