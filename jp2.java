public final class jp2 {
  public final int a;
  
  public final long b;
  
  public jp2(int paramInt, long paramLong) {
    this.a = paramInt;
    this.b = paramLong;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof jp2) {
      paramObject = paramObject;
      if (this.a == ((jp2)paramObject).a && this.b == ((jp2)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a;
    long l = this.b;
    return (int)(l >>> 32L ^ l) ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("EventRecord{eventType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", eventTimestamp=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */