public final class ya {
  public final Integer a;
  
  public final Object b;
  
  public final fa1 c;
  
  public ya(Integer paramInteger, Object paramObject, fa1 paramfa1) {
    this.a = paramInteger;
    this.b = paramObject;
    this.c = paramfa1;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ya) {
      ya ya1 = (ya)paramObject;
      Integer integer = ya1.a;
      paramObject = this.a;
      if (((paramObject == null) ? (integer == null) : paramObject.equals(integer)) && this.b.equals(ya1.b) && this.c.equals(ya1.c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    Integer integer = this.a;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    int j = this.b.hashCode();
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Event{code=");
    stringBuilder.append(this.a);
    stringBuilder.append(", payload=");
    stringBuilder.append(this.b);
    stringBuilder.append(", priority=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */