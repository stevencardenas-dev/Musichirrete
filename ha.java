public final class ha implements f31 {
  public static final ha a = (ha)new Object();
  
  public static final v70 b = v70.a("requestTimeMs");
  
  public static final v70 c = v70.a("requestUptimeMs");
  
  public static final v70 d = v70.a("clientInfo");
  
  public static final v70 e = v70.a("logSource");
  
  public static final v70 f = v70.a("logSourceName");
  
  public static final v70 g = v70.a("logEvent");
  
  public static final v70 h = v70.a("qosTier");
  
  public final void a(Object paramObject1, Object paramObject2) {
    np0 np0 = (np0)paramObject1;
    paramObject1 = paramObject2;
    long l = ((cb)np0).a;
    paramObject1.d(b, l);
    paramObject2 = np0;
    l = ((cb)paramObject2).b;
    paramObject1.d(c, l);
    paramObject1.a(d, ((cb)paramObject2).c);
    paramObject1.a(e, ((cb)paramObject2).d);
    paramObject1.a(f, ((cb)paramObject2).e);
    paramObject1.a(g, ((cb)paramObject2).f);
    paramObject1.a(h, hb1.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */