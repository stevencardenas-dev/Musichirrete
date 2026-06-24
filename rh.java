import java.util.UUID;

public abstract class rh {
  public static final UUID a = new UUID(0L, 0L);
  
  static {
    new UUID(1186680826959645954L, -5988876978535335093L);
    new UUID(-2129748144642739255L, 8654423357094679310L);
    new UUID(-1301668207276963122L, -6645017420763422227L);
    new UUID(-7348484286925749626L, -6083546864340672619L);
  }
  
  public static long a(long paramLong) {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong * 1000L;
      }  
    return l;
  }
  
  public static long b(long paramLong) {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong / 1000L;
      }  
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */