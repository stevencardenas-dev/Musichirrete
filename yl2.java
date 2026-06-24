public final class yl2 implements em2 {
  public final yj2 a;
  
  public final bg2 b;
  
  public yl2(bg2 parambg2, yj2 paramyj2) {
    this.b = parambg2;
    this.a = paramyj2;
  }
  
  public final void a(Object paramObject) {
    this.b.getClass();
    nm2 nm2 = ((wk2)paramObject).zzc;
    if (nm2.e)
      nm2.e = false; 
    bg2 bg21 = ok2.a;
    throw x41.f(paramObject);
  }
  
  public final void b(Object paramObject, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, bk2 parambk2) {
    wk2 wk2 = (wk2)paramObject;
    if (wk2.zzc == nm2.f)
      wk2.zzc = nm2.b(); 
    throw x41.f(paramObject);
  }
  
  public final void c(Object paramObject1, Object paramObject2) {
    fm2.p(paramObject1, paramObject2);
  }
  
  public final boolean d(wk2 paramwk21, wk2 paramwk22) {
    return !!paramwk21.zzc.equals(paramwk22.zzc);
  }
  
  public final int e(wk2 paramwk2) {
    return paramwk2.zzc.hashCode();
  }
  
  public final wk2 f() {
    yj2 yj21 = this.a;
    if (yj21 instanceof wk2)
      return ((wk2)yj21).n(); 
    uk2 uk2 = (uk2)((wk2)yj21).j(5);
    boolean bool = uk2.c.h();
    yj21 = uk2.c;
    if (!bool)
      return (wk2)yj21; 
    yj21.getClass();
    bm2.c.a(yj21.getClass()).a(yj21);
    yj21.e();
    return uk2.c;
  }
  
  public final int g(yj2 paramyj2) {
    nm2 nm2 = ((wk2)paramyj2).zzc;
    int i = nm2.d;
    if (i == -1) {
      i = 0;
      int j = 0;
      while (i < nm2.a) {
        int n = nm2.b[i];
        gk2 gk2 = (gk2)nm2.c[i];
        int m = ik2.n(8);
        int k = ik2.n(16);
        int i1 = ik2.n(n >>> 3);
        n = ik2.n(24);
        int i2 = gk2.f();
        j += m + m + i1 + k + ga1.f(i2, i2, n);
        i++;
      } 
      nm2.d = j;
      return j;
    } 
    return i;
  }
  
  public final boolean h(Object paramObject) {
    throw x41.f(paramObject);
  }
  
  public final void i(Object paramObject, a42 parama42) {
    throw x41.f(paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */