import java.io.Serializable;

public final class sx0 extends g20 implements Serializable {
  public static final sx0 b = (sx0)new Object();
  
  public final long a(int paramInt, long paramLong) {
    return wf2.Y(paramLong, paramInt);
  }
  
  public final long b(long paramLong1, long paramLong2) {
    return wf2.Y(paramLong1, paramLong2);
  }
  
  public final h20 c() {
    return h20.p;
  }
  
  public final int compareTo(Object paramObject) {
    int i = 1L cmp ((g20)paramObject).d();
    return (i == 0) ? 0 : ((i < 0) ? -1 : 1);
  }
  
  public final long d() {
    return 1L;
  }
  
  public final boolean e() {
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof sx0);
  }
  
  public final boolean f() {
    return true;
  }
  
  public final int hashCode() {
    return 1;
  }
  
  public final String toString() {
    return "DurationField[millis]";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */