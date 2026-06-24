import java.util.HashMap;

public final class gb {
  public final am a;
  
  public final HashMap b;
  
  public gb(am paramam, HashMap paramHashMap) {
    this.a = paramam;
    this.b = paramHashMap;
  }
  
  public final long a(fa1 paramfa1, long paramLong, int paramInt) {
    long l1;
    long l3 = this.a.i();
    hb hb = (hb)this.b.get(paramfa1);
    long l2 = hb.a;
    paramInt--;
    if (l2 > 1L) {
      l1 = l2;
    } else {
      l1 = 2L;
    } 
    double d = Math.max(1.0D, Math.log(10000.0D) / Math.log((l1 * paramInt)));
    return Math.min(Math.max((long)(Math.pow(3.0D, paramInt) * l2 * d), paramLong - l3), hb.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof gb) {
      paramObject = paramObject;
      if (this.a.equals(((gb)paramObject).a) && this.b.equals(((gb)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("SchedulerConfig{clock=");
    stringBuilder.append(this.a);
    stringBuilder.append(", values=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */