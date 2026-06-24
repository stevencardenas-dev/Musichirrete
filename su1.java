public final class su1 {
  public Object a;
  
  public Object b;
  
  public int c;
  
  public long d;
  
  public long e;
  
  public t2 f = t2.e;
  
  public final int a(long paramLong) {
    t2 t21 = this.f;
    long l = this.d;
    long[] arrayOfLong = t21.b;
    if (paramLong != Long.MIN_VALUE && (l == -9223372036854775807L || paramLong < l)) {
      byte b = 0;
      while (b < arrayOfLong.length) {
        l = arrayOfLong[b];
        if (l != Long.MIN_VALUE) {
          if (paramLong < l) {
            t21.c[b].getClass();
            break;
          } 
          b++;
        } 
      } 
      if (b < arrayOfLong.length)
        return b; 
    } 
    return -1;
  }
  
  public final int b(long paramLong) {
    t2 t21 = this.f;
    long l = this.d;
    long[] arrayOfLong = t21.b;
    int i = arrayOfLong.length - 1;
    while (i >= 0 && paramLong != Long.MIN_VALUE) {
      long l1 = arrayOfLong[i];
      if ((l1 == Long.MIN_VALUE) ? (l == -9223372036854775807L || paramLong < l) : (paramLong < l1)) {
        i--;
        continue;
      } 
      break;
    } 
    if (i >= 0) {
      t21.c[i].getClass();
      return i;
    } 
    return -1;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && su1.class.equals(paramObject.getClass())) {
      paramObject = paramObject;
      if (d12.a(this.a, ((su1)paramObject).a) && d12.a(this.b, ((su1)paramObject).b) && this.c == ((su1)paramObject).c && this.d == ((su1)paramObject).d && this.e == ((su1)paramObject).e && d12.a(this.f, ((su1)paramObject).f))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j;
    Object object = this.a;
    int k = 0;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.b;
    if (object == null) {
      j = 0;
    } else {
      j = object.hashCode();
    } 
    int m = this.c;
    long l = this.d;
    int n = (int)(l ^ l >>> 32L);
    l = this.e;
    int i1 = (int)(l ^ l >>> 32L);
    object = this.f;
    if (object != null)
      k = object.hashCode(); 
    return (((((217 + i) * 31 + j) * 31 + m) * 31 + n) * 31 + i1) * 31 + k;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\su1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */