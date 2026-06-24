public final class vh extends hv {
  public static final int j;
  
  public final kv h;
  
  public final transient uh[] i = new uh[j + 1];
  
  static {
    int i;
    try {
      Integer integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
    } catch (SecurityException securityException) {
      securityException = null;
    } 
    if (securityException == null) {
      i = 512;
    } else {
      int j = securityException.intValue() - 1;
      i = 0;
      while (j > 0) {
        i++;
        j >>= 1;
      } 
      i = 1 << i;
    } 
    j = i - 1;
  }
  
  public vh(kv paramkv) {
    super(paramkv.b);
    this.h = paramkv;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof vh) {
      paramObject = ((vh)paramObject).h;
      return this.h.equals(paramObject);
    } 
    return false;
  }
  
  public final String f(long paramLong) {
    return r(paramLong).a(paramLong);
  }
  
  public final int h(long paramLong) {
    return r(paramLong).b(paramLong);
  }
  
  public final int hashCode() {
    return this.h.hashCode();
  }
  
  public final int k(long paramLong) {
    return r(paramLong).c(paramLong);
  }
  
  public final boolean l() {
    this.h.getClass();
    return false;
  }
  
  public final long m(long paramLong) {
    return this.h.m(paramLong);
  }
  
  public final long o(long paramLong) {
    return this.h.o(paramLong);
  }
  
  public final uh r(long paramLong) {
    int j = (int)(paramLong >> 32L);
    int i = j & j;
    uh[] arrayOfUh = this.i;
    uh uh1 = arrayOfUh[i];
    if (uh1 == null || (int)(uh1.a >> 32L) != j) {
      long l = paramLong & 0xFFFFFFFF00000000L;
      kv kv1 = this.h;
      uh uh2 = new uh(kv1, l);
      uh1 = uh2;
      for (paramLong = l;; paramLong = l1) {
        long l1 = kv1.m(paramLong);
        if (l1 == paramLong || l1 > (0xFFFFFFFFL | l))
          break; 
        uh uh3 = new uh(kv1, l1);
        uh1.c = uh3;
        uh1 = uh3;
      } 
      arrayOfUh[i] = uh2;
      return uh2;
    } 
    return uh1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */