package j$.time.temporal;

import j$.time.LocalDate;

public interface m extends n {
  default m a(long paramLong, s params) {
    if (paramLong == Long.MIN_VALUE) {
      m m2 = k(Long.MAX_VALUE, params);
      paramLong = 1L;
      return m2.k(paramLong, params);
    } 
    paramLong = -paramLong;
    m m1 = this;
    return m1.k(paramLong, params);
  }
  
  m h(long paramLong, q paramq);
  
  m i(LocalDate paramLocalDate);
  
  m k(long paramLong, s params);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */