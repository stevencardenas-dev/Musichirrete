import java.util.Set;

public final class hb {
  public final long a;
  
  public final long b;
  
  public final Set c;
  
  public hb(long paramLong1, long paramLong2, Set paramSet) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramSet;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof hb) {
      paramObject = paramObject;
      if (this.a == ((hb)paramObject).a && this.b == ((hb)paramObject).b && this.c.equals(((hb)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.a;
    int j = (int)(l ^ l >>> 32L);
    l = this.b;
    int i = (int)(l >>> 32L ^ l);
    return this.c.hashCode() ^ ((j ^ 0xF4243) * 1000003 ^ i) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ConfigValue{delta=");
    stringBuilder.append(this.a);
    stringBuilder.append(", maxAllowedDelay=");
    stringBuilder.append(this.b);
    stringBuilder.append(", flags=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */