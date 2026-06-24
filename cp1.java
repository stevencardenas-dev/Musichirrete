import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class cp1 {
  public final int a;
  
  public boolean b;
  
  public long c;
  
  public long d;
  
  public Object e;
  
  public cp1(dd1 paramdd1) {
    if (paramdd1 != null) {
      this.e = paramdd1;
      return;
    } 
    k91.h("ticker");
    throw null;
  }
  
  public long a() {
    long l = this.c;
    if (this.b) {
      long l1 = SystemClock.elapsedRealtime() - this.d;
      r71 r71 = (r71)this.e;
      if (r71.a == 1.0F) {
        l1 = rh.a(l1);
        return l1 + l;
      } 
      l1 *= r71.c;
      return l1 + l;
    } 
    return l;
  }
  
  public void b(long paramLong) {
    this.c = paramLong;
    if (this.b)
      this.d = SystemClock.elapsedRealtime(); 
  }
  
  public void c() {
    if (!this.b) {
      this.b = true;
      this.d = ((dd1)this.e).F0();
      return;
    } 
    tp.f("This stopwatch is already running.");
  }
  
  public String toString() {
    long l1;
    TimeUnit timeUnit1;
    switch (this.a) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    if (this.b) {
      l1 = ((dd1)this.e).F0() - this.d + this.c;
    } else {
      l1 = this.c;
    } 
    long l2 = l1 / 86400000000000L;
    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
    if (l2 > 0L) {
      timeUnit1 = TimeUnit.DAYS;
    } else if (l1 / 3600000000000L > 0L) {
      timeUnit1 = TimeUnit.HOURS;
    } else if (l1 / 60000000000L > 0L) {
      timeUnit1 = TimeUnit.MINUTES;
    } else if (l1 / 1000000000L > 0L) {
      timeUnit1 = TimeUnit.SECONDS;
    } else if (l1 / 1000000L > 0L) {
      timeUnit1 = TimeUnit.MILLISECONDS;
    } else if (l1 / 1000L > 0L) {
      timeUnit1 = TimeUnit.MICROSECONDS;
    } else {
      timeUnit1 = timeUnit2;
    } 
    double d1 = l1;
    double d2 = timeUnit2.convert(1L, timeUnit1);
    String str2 = String.format(Locale.ROOT, "%.4g", new Object[] { Double.valueOf(d1 / d2) });
    switch (lg2.a[timeUnit1.ordinal()]) {
      default:
        throw new AssertionError();
      case 7:
        str1 = "d";
        return x41.l(str2, " ", str1);
      case 6:
        str1 = "h";
        return x41.l(str2, " ", str1);
      case 5:
        str1 = "min";
        return x41.l(str2, " ", str1);
      case 4:
        str1 = "s";
        return x41.l(str2, " ", str1);
      case 3:
        str1 = "ms";
        return x41.l(str2, " ", str1);
      case 2:
        str1 = "μs";
        return x41.l(str2, " ", str1);
      case 1:
        break;
    } 
    String str1 = "ns";
    return x41.l(str2, " ", str1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */