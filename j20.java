import java.util.concurrent.TimeUnit;

public enum j20 {
  c, e, f;
  
  public static final j20[] g;
  
  public final TimeUnit b;
  
  static {
    j20 j204 = new j20("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    c = j204;
    j20 j202 = new j20("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    j20 j201 = new j20("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    e = j201;
    j20 j203 = new j20("SECONDS", 3, TimeUnit.SECONDS);
    f = j203;
    g = new j20[] { j204, j202, j201, j203, new j20("MINUTES", 4, TimeUnit.MINUTES), new j20("HOURS", 5, TimeUnit.HOURS), new j20("DAYS", 6, TimeUnit.DAYS) };
  }
  
  j20(TimeUnit paramTimeUnit) {
    this.b = paramTimeUnit;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */