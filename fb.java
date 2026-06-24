public final class fb {
  public final long a;
  
  public final ib b;
  
  public final za c;
  
  public fb(long paramLong, ib paramib, za paramza) {
    this.a = paramLong;
    this.b = paramib;
    this.c = paramza;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof fb) {
      paramObject = paramObject;
      if (this.a == ((fb)paramObject).a && this.b.equals(((fb)paramObject).b) && this.c.equals(((fb)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.a;
    int i = (int)(l >>> 32L ^ l);
    int j = this.b.hashCode();
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("PersistedEvent{id=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportContext=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */