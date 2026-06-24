public final class h91 extends wc {
  public final long c;
  
  public h91(h20 paramh20, long paramLong) {
    super(paramh20);
    this.c = paramLong;
  }
  
  public final long a(int paramInt, long paramLong) {
    return wf2.Y(paramLong, paramInt * this.c);
  }
  
  public final long b(long paramLong1, long paramLong2) {
    long l = this.c;
    if (l != 1L)
      if (paramLong2 == 1L) {
        paramLong2 = l;
      } else {
        long l2 = 0L;
        long l1 = l2;
        if (paramLong2 != 0L)
          if (l == 0L) {
            l1 = l2;
          } else {
            l2 = paramLong2 * l;
            if (l2 / l == paramLong2 && (paramLong2 != Long.MIN_VALUE || l != -1L)) {
              l1 = l2;
              if (l == Long.MIN_VALUE)
                if (paramLong2 != -1L) {
                  l1 = l2;
                } else {
                  StringBuilder stringBuilder = new StringBuilder("Multiplication overflows a long: ");
                  stringBuilder.append(paramLong2);
                  stringBuilder.append(" * ");
                  stringBuilder.append(l);
                  throw new ArithmeticException(stringBuilder.toString());
                }  
            } else {
              StringBuilder stringBuilder = new StringBuilder("Multiplication overflows a long: ");
              stringBuilder.append(paramLong2);
              stringBuilder.append(" * ");
              stringBuilder.append(l);
              throw new ArithmeticException(stringBuilder.toString());
            } 
          }  
        paramLong2 = l1;
      }  
    return wf2.Y(paramLong1, paramLong2);
  }
  
  public final long d() {
    return this.c;
  }
  
  public final boolean e() {
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h91) {
      paramObject = paramObject;
      if (this.b == ((wc)paramObject).b && this.c == ((h91)paramObject).c)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l = this.c;
    return (int)(l ^ l >>> 32L) + (1 << this.b.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */