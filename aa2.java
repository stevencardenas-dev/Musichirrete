public final class aa2 {
  public final long a;
  
  public aa2(long paramLong) {
    this.a = paramLong;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof aa2) {
      paramObject = paramObject;
      if (this.a == ((aa2)paramObject).a)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.a;
    return 0xD4D2D6C0 ^ (int)(l >>> 32L ^ l);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("EventRecord{eventType=3, eventTimestamp=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */