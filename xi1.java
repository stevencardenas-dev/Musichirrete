public final class xi1 extends wc {
  public final g20 c;
  
  public final int e;
  
  public xi1(g20 paramg20, h20 paramh20) {
    super(paramh20);
    if (paramg20.f()) {
      this.c = paramg20;
      this.e = 100;
      return;
    } 
    l0.l("The field must be supported");
    throw null;
  }
  
  public final long a(int paramInt, long paramLong) {
    long l1 = paramInt;
    long l2 = this.e;
    return this.c.b(paramLong, l1 * l2);
  }
  
  public final long b(long paramLong1, long paramLong2) {
    long l;
    int i = this.e;
    if (i != -1) {
      if (i != 0) {
        l = paramLong2;
        if (i != 1) {
          long l1 = i;
          l = paramLong2 * l1;
          if (l / l1 != paramLong2) {
            StringBuilder stringBuilder = new StringBuilder("Multiplication overflows a long: ");
            stringBuilder.append(paramLong2);
            stringBuilder.append(" * ");
            stringBuilder.append(i);
            throw new ArithmeticException(stringBuilder.toString());
          } 
        } 
      } else {
        l = 0L;
      } 
    } else {
      if (paramLong2 != Long.MIN_VALUE) {
        l = -paramLong2;
        return this.c.b(paramLong1, l);
      } 
      StringBuilder stringBuilder = new StringBuilder("Multiplication overflows a long: ");
      stringBuilder.append(paramLong2);
      stringBuilder.append(" * ");
      stringBuilder.append(i);
      throw new ArithmeticException(stringBuilder.toString());
    } 
    return this.c.b(paramLong1, l);
  }
  
  public final long d() {
    return this.c.d() * this.e;
  }
  
  public final boolean e() {
    return this.c.e();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof xi1) {
      paramObject = paramObject;
      if (this.c.equals(((xi1)paramObject).c) && this.b == ((wc)paramObject).b && this.e == ((xi1)paramObject).e)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.e;
    int i = (int)(l ^ l >>> 32L);
    byte b = this.b.c;
    return this.c.hashCode() + i + (1 << b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */