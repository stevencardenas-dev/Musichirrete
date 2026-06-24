import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public final class ku {
  public final ti0 a;
  
  public final ri0 b;
  
  public final dd1 c;
  
  public final hv d;
  
  public ku(ti0 paramti0, ri0 paramri0) {
    this.a = paramti0;
    this.b = paramri0;
    this.c = null;
    this.d = null;
  }
  
  public ku(ti0 paramti0, ri0 paramri0, dd1 paramdd1, hv paramhv) {
    this.a = paramti0;
    this.b = paramri0;
    this.c = paramdd1;
    this.d = paramhv;
  }
  
  public final String a(p paramp) {
    ti0 ti01 = this.a;
    if (ti01 != null) {
      StringBuilder stringBuilder = new StringBuilder(ti01.b());
      try {
        AtomicReference atomicReference = ev.a;
        long l = paramp.b();
        dd1 dd12 = paramp.a();
        dd1 dd11 = dd12;
        if (dd12 == null)
          dd11 = xg0.T0(); 
        if (ti01 != null) {
          dd12 = this.c;
          if (dd12 != null)
            dd11 = dd12; 
          hv hv2 = this.d;
          dd12 = dd11;
          if (hv2 != null)
            dd12 = dd11.z0(hv2); 
          hv hv1 = dd12.G();
          int i = hv1.h(l);
          long l2 = i;
          long l1 = l + l2;
          if ((l ^ l1) < 0L && (l2 ^ l) >= 0L) {
            hv1 = hv.c;
            i = 0;
          } else {
            l = l1;
          } 
          ti01.e(stringBuilder, l, dd12.y0(), i, hv1, null);
        } else {
          UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
          this("Printing not supported");
          throw unsupportedOperationException;
        } 
      } catch (IOException iOException) {}
      return stringBuilder.toString();
    } 
    tp.j("Printing not supported");
    return null;
  }
  
  public final String b(uo0 paramuo0) {
    ti0 ti01 = this.a;
    if (ti01 != null) {
      StringBuilder stringBuilder = new StringBuilder(ti01.b());
      if (ti01 != null) {
        try {
          ti01.c(stringBuilder, paramuo0, null);
        } catch (IOException iOException) {}
      } else {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        this("Printing not supported");
        throw unsupportedOperationException;
      } 
      return stringBuilder.toString();
    } 
    tp.j("Printing not supported");
    return null;
  }
  
  public final ku c() {
    a02 a02 = hv.c;
    if (this.d == a02)
      return this; 
    ri0 ri01 = this.b;
    dd1 dd11 = this.c;
    return new ku(this.a, ri01, dd11, a02);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */