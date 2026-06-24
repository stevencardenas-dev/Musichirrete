import java.util.concurrent.atomic.AtomicReferenceArray;

public final class kk extends ek1 {
  public final lh g;
  
  public final AtomicReferenceArray h;
  
  public kk(long paramLong, kk paramkk, lh paramlh, int paramInt) {
    super(paramLong, paramkk, paramInt);
    this.g = paramlh;
    this.h = new AtomicReferenceArray(nh.b * 2);
  }
  
  public final int k() {
    return nh.b;
  }
  
  public final void l(int paramInt, os paramos) {
    boolean bool;
    int j = nh.b;
    if (paramInt >= j) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = paramInt;
    if (bool)
      i = paramInt - j; 
    this.h.get(i * 2);
    while (true) {
      Object object = p(i);
      boolean bool1 = object instanceof e52;
      lh lh1 = this.g;
      if (bool1 || object instanceof f52) {
        f1 f1;
        if (bool) {
          f1 = nh.j;
        } else {
          f1 = nh.k;
        } 
        if (o(i, object, f1)) {
          r(i, null);
          q(i, bool ^ true);
          if (bool)
            lh1.getClass(); 
          break;
        } 
        continue;
      } 
      if (object == nh.j || object == nh.k) {
        r(i, null);
        if (bool) {
          lh1.getClass();
          return;
        } 
        break;
      } 
      if (object == nh.g || object == nh.f)
        continue; 
      if (object == nh.i || object == nh.d || object == nh.l)
        break; 
      tp.k("unexpected state: ", object);
      return;
    } 
  }
  
  public final boolean o(int paramInt, Object paramObject1, Object paramObject2) {
    paramInt = paramInt * 2 + 1;
    while (true) {
      AtomicReferenceArray<Object> atomicReferenceArray = this.h;
      if (atomicReferenceArray.compareAndSet(paramInt, paramObject1, paramObject2))
        return true; 
      if (atomicReferenceArray.get(paramInt) != paramObject1)
        return false; 
    } 
  }
  
  public final Object p(int paramInt) {
    return this.h.get(paramInt * 2 + 1);
  }
  
  public final void q(int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      lh lh1 = this.g;
      lh1.getClass();
      long l = nh.b;
      lh1.N(this.e * l + paramInt);
    } 
    m();
  }
  
  public final void r(int paramInt, Object paramObject) {
    this.h.set(paramInt * 2, paramObject);
  }
  
  public final void s(int paramInt, Object paramObject) {
    this.h.set(paramInt * 2 + 1, paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */