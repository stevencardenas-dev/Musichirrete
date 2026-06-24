public final class ab {
  public static final ab f = new ab(10485760L, 200, 10000, 604800000L, 81920);
  
  public final long a;
  
  public final int b;
  
  public final int c;
  
  public final long d;
  
  public final int e;
  
  public ab(long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3) {
    this.a = paramLong1;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramLong2;
    this.e = paramInt3;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ab) {
      paramObject = paramObject;
      if (this.a == ((ab)paramObject).a && this.b == ((ab)paramObject).b && this.c == ((ab)paramObject).c && this.d == ((ab)paramObject).d && this.e == ((ab)paramObject).e)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.a;
    int m = (int)(l ^ l >>> 32L);
    int i = this.b;
    int j = this.c;
    l = this.d;
    int k = (int)(l >>> 32L ^ l);
    return this.e ^ ((((m ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
    stringBuilder.append(this.a);
    stringBuilder.append(", loadBatchSize=");
    stringBuilder.append(this.b);
    stringBuilder.append(", criticalSectionEnterTimeoutMs=");
    stringBuilder.append(this.c);
    stringBuilder.append(", eventCleanUpAge=");
    stringBuilder.append(this.d);
    stringBuilder.append(", maxBlobByteSizePerRow=");
    return x41.m(stringBuilder, this.e, "}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */