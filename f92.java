import java.util.HashMap;

public final class f92 extends i9 {
  public static f92 V0(dd1 paramdd1, hv paramhv) {
    if (paramdd1 != null) {
      paramdd1 = paramdd1.y0();
      if (paramdd1 != null) {
        if (paramhv != null)
          return (f92)new i9(paramdd1, paramhv); 
        l0.l("DateTimeZone must not be null");
        return null;
      } 
      l0.l("UTC chronology must not be null");
      return null;
    } 
    l0.l("Must supply a chronology");
    return null;
  }
  
  public final hv G() {
    return (hv)this.q;
  }
  
  public final void S0(h9 paramh9) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    paramh9.l = U0(paramh9.l, hashMap);
    paramh9.k = U0(paramh9.k, hashMap);
    paramh9.j = U0(paramh9.j, hashMap);
    paramh9.i = U0(paramh9.i, hashMap);
    paramh9.h = U0(paramh9.h, hashMap);
    paramh9.g = U0(paramh9.g, hashMap);
    paramh9.f = U0(paramh9.f, hashMap);
    paramh9.e = U0(paramh9.e, hashMap);
    paramh9.d = U0(paramh9.d, hashMap);
    paramh9.c = U0(paramh9.c, hashMap);
    paramh9.b = U0(paramh9.b, hashMap);
    paramh9.a = U0(paramh9.a, hashMap);
    paramh9.E = T0(paramh9.E, hashMap);
    paramh9.F = T0(paramh9.F, hashMap);
    paramh9.G = T0(paramh9.G, hashMap);
    paramh9.H = T0(paramh9.H, hashMap);
    paramh9.I = T0(paramh9.I, hashMap);
    paramh9.x = T0(paramh9.x, hashMap);
    paramh9.y = T0(paramh9.y, hashMap);
    paramh9.z = T0(paramh9.z, hashMap);
    paramh9.D = T0(paramh9.D, hashMap);
    paramh9.A = T0(paramh9.A, hashMap);
    paramh9.B = T0(paramh9.B, hashMap);
    paramh9.C = T0(paramh9.C, hashMap);
    paramh9.m = T0(paramh9.m, hashMap);
    paramh9.n = T0(paramh9.n, hashMap);
    paramh9.o = T0(paramh9.o, hashMap);
    paramh9.p = T0(paramh9.p, hashMap);
    paramh9.q = T0(paramh9.q, hashMap);
    paramh9.r = T0(paramh9.r, hashMap);
    paramh9.s = T0(paramh9.s, hashMap);
    paramh9.u = T0(paramh9.u, hashMap);
    paramh9.t = T0(paramh9.t, hashMap);
    paramh9.v = T0(paramh9.v, hashMap);
    paramh9.w = T0(paramh9.w, hashMap);
  }
  
  public final hu T0(hu paramhu, HashMap<hu, d92> paramHashMap) {
    if (paramhu == null || !paramhu.t())
      return paramhu; 
    if (paramHashMap.containsKey(paramhu))
      return (hu)paramHashMap.get(paramhu); 
    d92 d92 = new d92(paramhu, (hv)this.q, U0(paramhu.i(), paramHashMap), U0(paramhu.p(), paramHashMap), U0(paramhu.j(), paramHashMap));
    paramHashMap.put(paramhu, d92);
    return d92;
  }
  
  public final g20 U0(g20 paramg20, HashMap<g20, e92> paramHashMap) {
    if (paramg20 == null || !paramg20.f())
      return paramg20; 
    if (paramHashMap.containsKey(paramg20))
      return (g20)paramHashMap.get(paramg20); 
    e92 e92 = new e92(paramg20, (hv)this.q);
    paramHashMap.put(paramg20, e92);
    return e92;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof f92))
      return false; 
    paramObject = paramObject;
    return (this.p.equals(((i9)paramObject).p) && ((hv)this.q).equals(((i9)paramObject).q));
  }
  
  public final int hashCode() {
    int i = ((hv)this.q).hashCode();
    return this.p.hashCode() * 7 + i * 11 + 326565;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ZonedChronology[");
    stringBuilder.append(this.p);
    stringBuilder.append(", ");
    stringBuilder.append(((hv)this.q).b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  public final dd1 y0() {
    return this.p;
  }
  
  public final long z(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    long l = this.p.z(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    if (l == Long.MAX_VALUE)
      return Long.MAX_VALUE; 
    if (l != Long.MIN_VALUE) {
      hv hv = (hv)this.q;
      paramInt1 = hv.i(l);
      long l1 = l - paramInt1;
      if (l > 604800000L && l1 < 0L)
        return Long.MAX_VALUE; 
      if (l >= -604800000L || l1 <= 0L) {
        if (paramInt1 == hv.h(l1))
          return l1; 
        throw new fh0(l, hv.b);
      } 
    } 
    return Long.MIN_VALUE;
  }
  
  public final dd1 z0(hv paramhv) {
    hv hv1 = paramhv;
    if (paramhv == null)
      hv1 = hv.e(); 
    if (hv1 == this.q)
      return this; 
    paramhv = hv.c;
    dd1 dd1 = this.p;
    return (hv1 == paramhv) ? dd1 : new i9(dd1, hv1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */