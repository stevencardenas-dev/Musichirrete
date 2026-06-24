public final class ua {
  public final int a;
  
  public final long b;
  
  public ua(int paramInt, long paramLong) {
    if (paramInt != 0) {
      this.a = paramInt;
      this.b = paramLong;
      return;
    } 
    k91.h("Null status");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ua) {
      paramObject = paramObject;
      if (x41.c(this.a, ((ua)paramObject).a) && this.b == ((ua)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = x41.y(this.a);
    long l = this.b;
    return (int)(l >>> 32L ^ l) ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("BackendResponse{status=");
    int i = this.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            str = "null";
          } else {
            str = "INVALID_PAYLOAD";
          } 
        } else {
          str = "FATAL_ERROR";
        } 
      } else {
        str = "TRANSIENT_ERROR";
      } 
    } else {
      str = "OK";
    } 
    stringBuilder.append(str);
    stringBuilder.append(", nextRequestWaitMillis=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */