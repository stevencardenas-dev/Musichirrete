import java.util.concurrent.ConcurrentHashMap;

public final class xg0 extends i9 {
  public static final xg0 b0;
  
  public static final ConcurrentHashMap c0;
  
  static {
    ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<Object, Object>();
    c0 = concurrentHashMap;
    i9 i91 = new i9(ue0.y0, null);
    b0 = (xg0)i91;
    concurrentHashMap.put(hv.c, i91);
  }
  
  public static xg0 T0() {
    return U0(hv.e());
  }
  
  public static xg0 U0(hv paramhv) {
    hv hv1 = paramhv;
    if (paramhv == null)
      hv1 = hv.e(); 
    ConcurrentHashMap<hv, i9> concurrentHashMap = c0;
    xg0 xg01 = (xg0)concurrentHashMap.get(hv1);
    i9 i91 = xg01;
    if (xg01 == null) {
      i91 = new i9(f92.V0(b0, hv1), null);
      xg0 xg02 = (xg0)concurrentHashMap.putIfAbsent(hv1, i91);
      if (xg02 != null)
        return xg02; 
    } 
    return (xg0)i91;
  }
  
  public final void S0(h9 paramh9) {
    if (this.p.G() == hv.c) {
      zg0 zg0 = zg0.e;
      iu iu1 = iu.f;
      p00 p00 = new p00(zg0);
      paramh9.H = p00;
      paramh9.k = p00.f;
      iu iu2 = iu.i;
      paramh9.G = new if1(p00, p00.c.i(), iu2);
      paramh9.C = new if1((p00)paramh9.H, paramh9.h, iu.n);
    } 
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof xg0) {
      paramObject = paramObject;
      return G().equals(paramObject.G());
    } 
    return false;
  }
  
  public final int hashCode() {
    return G().hashCode() + 800855;
  }
  
  public final String toString() {
    hv hv = G();
    if (hv != null) {
      StringBuilder stringBuilder = new StringBuilder("ISOChronology[");
      stringBuilder.append(hv.b);
      stringBuilder.append(']');
      return stringBuilder.toString();
    } 
    return "ISOChronology";
  }
  
  public final dd1 y0() {
    return b0;
  }
  
  public final dd1 z0(hv paramhv) {
    hv hv1 = paramhv;
    if (paramhv == null)
      hv1 = hv.e(); 
    return (hv1 == G()) ? this : U0(hv1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */