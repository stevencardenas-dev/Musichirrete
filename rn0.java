import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class rn0 implements ListIterator, fl0 {
  public final int b;
  
  public int c;
  
  public int e;
  
  public int f;
  
  public final u g;
  
  public rn0(sn0 paramsn0, int paramInt) {
    this.g = paramsn0;
    this.c = paramInt;
    this.e = -1;
    this.f = sn0.e(paramsn0);
  }
  
  public rn0(tn0 paramtn0, int paramInt) {
    this.g = paramtn0;
    this.c = paramInt;
    this.e = -1;
    this.f = tn0.e(paramtn0);
  }
  
  public void a() {
    if (tn0.e(((sn0)this.g).g) == this.f)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public final void add(Object paramObject) {
    int i = this.b;
    u u1 = this.g;
    switch (i) {
      default:
        b();
        u1 = u1;
        i = this.c;
        this.c = i + 1;
        u1.add(i, paramObject);
        this.e = -1;
        this.f = tn0.e((tn0)u1);
        return;
      case 0:
        break;
    } 
    a();
    u1 = u1;
    i = this.c;
    this.c = i + 1;
    u1.add(i, paramObject);
    this.e = -1;
    this.f = sn0.e((sn0)u1);
  }
  
  public void b() {
    if (tn0.e((tn0)this.g) == this.f)
      return; 
    throw new ConcurrentModificationException();
  }
  
  public final boolean hasNext() {
    int i = this.b;
    boolean bool2 = false;
    boolean bool1 = false;
    u u1 = this.g;
    switch (i) {
      default:
        if (this.c < ((tn0)u1).c)
          bool1 = true; 
        return bool1;
      case 0:
        break;
    } 
    bool1 = bool2;
    if (this.c < ((sn0)u1).e)
      bool1 = true; 
    return bool1;
  }
  
  public final boolean hasPrevious() {
    boolean bool;
    switch (this.b) {
      default:
        if (this.c > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (this.c > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final Object next() {
    int i = this.b;
    u u1 = this.g;
    switch (i) {
      default:
        b();
        i = this.c;
        u1 = u1;
        if (i < ((tn0)u1).c) {
          this.c = i + 1;
          this.e = i;
          return ((tn0)u1).b[i];
        } 
        throw new NoSuchElementException();
      case 0:
        break;
    } 
    a();
    i = this.c;
    u1 = u1;
    if (i < ((sn0)u1).e) {
      this.c = i + 1;
      this.e = i;
      return ((sn0)u1).b[((sn0)u1).c + i];
    } 
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    switch (this.b) {
      default:
        return this.c;
      case 0:
        break;
    } 
    return this.c;
  }
  
  public final Object previous() {
    int i = this.b;
    u u1 = this.g;
    switch (i) {
      default:
        b();
        i = this.c;
        if (i > 0) {
          this.c = --i;
          this.e = i;
          return ((tn0)u1).b[i];
        } 
        throw new NoSuchElementException();
      case 0:
        break;
    } 
    a();
    i = this.c;
    if (i > 0) {
      this.c = --i;
      this.e = i;
      u1 = u1;
      return ((sn0)u1).b[((sn0)u1).c + i];
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    switch (this.b) {
      default:
        i = this.c;
        return i - 1;
      case 0:
        break;
    } 
    int i = this.c;
    return i - 1;
  }
  
  public final void remove() {
    int i = this.b;
    u u1 = this.g;
    switch (i) {
      default:
        u1 = u1;
        b();
        i = this.e;
        if (i != -1) {
          u1.d(i);
          this.c = this.e;
          this.e = -1;
          this.f = tn0.e((tn0)u1);
        } else {
          tp.f("Call next() or previous() before removing element from the iterator.");
        } 
        return;
      case 0:
        break;
    } 
    u1 = u1;
    a();
    i = this.e;
    if (i != -1) {
      u1.d(i);
      this.c = this.e;
      this.e = -1;
      this.f = sn0.e((sn0)u1);
    } else {
      tp.f("Call next() or previous() before removing element from the iterator.");
    } 
  }
  
  public final void set(Object paramObject) {
    int i = this.b;
    u u1 = this.g;
    switch (i) {
      default:
        b();
        i = this.e;
        if (i != -1) {
          ((tn0)u1).set(i, paramObject);
        } else {
          tp.f("Call next() or previous() before replacing element from the iterator.");
        } 
        return;
      case 0:
        break;
    } 
    a();
    i = this.e;
    if (i != -1) {
      ((sn0)u1).set(i, paramObject);
    } else {
      tp.f("Call next() or previous() before replacing element from the iterator.");
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */