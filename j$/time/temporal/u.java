package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class u implements Serializable {
  private static final long serialVersionUID = -7317881728594519368L;
  
  public final long a;
  
  public final long b;
  
  public final long c;
  
  public final long d;
  
  public u(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramLong3;
    this.d = paramLong4;
  }
  
  public static u e(long paramLong1, long paramLong2) {
    if (paramLong1 <= paramLong2)
      return new u(paramLong1, paramLong1, paramLong2, paramLong2); 
    throw new IllegalArgumentException("Minimum value must be less than maximum value");
  }
  
  public static u f(long paramLong1, long paramLong2) {
    if (paramLong1 <= paramLong2) {
      if (1L <= paramLong2)
        return new u(1L, 1L, paramLong1, paramLong2); 
      throw new IllegalArgumentException("Minimum value must be less than maximum value");
    } 
    throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    paramObjectInputStream.defaultReadObject();
    long l2 = this.a;
    long l1 = this.b;
    if (l2 <= l1) {
      l2 = this.c;
      long l = this.d;
      if (l2 <= l) {
        if (l1 <= l)
          return; 
        throw new InvalidObjectException("Minimum value must be less than maximum value");
      } 
      throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
    } 
    throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
  }
  
  public final int a(long paramLong, q paramq) {
    if (this.a >= -2147483648L && this.d <= 2147483647L && d(paramLong))
      return (int)paramLong; 
    throw new RuntimeException(c(paramLong, paramq));
  }
  
  public final void b(long paramLong, q paramq) {
    if (d(paramLong))
      return; 
    throw new RuntimeException(c(paramLong, paramq));
  }
  
  public final String c(long paramLong, q paramq) {
    if (paramq != null) {
      StringBuilder stringBuilder1 = new StringBuilder("Invalid value for ");
      stringBuilder1.append(paramq);
      stringBuilder1.append(" (valid values ");
      stringBuilder1.append(this);
      stringBuilder1.append("): ");
      stringBuilder1.append(paramLong);
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder("Invalid value (valid values ");
    stringBuilder.append(this);
    stringBuilder.append("): ");
    stringBuilder.append(paramLong);
    return stringBuilder.toString();
  }
  
  public final boolean d(long paramLong) {
    return (paramLong >= this.a && paramLong <= this.d);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof u) {
      paramObject = paramObject;
      if (this.a == ((u)paramObject).a && this.b == ((u)paramObject).b && this.c == ((u)paramObject).c && this.d == ((u)paramObject).d)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    long l2 = this.a;
    long l4 = this.b;
    long l3 = this.c;
    long l1 = this.d;
    l1 = l2 + (l4 << 16L) + (l4 >> 48L) + (l3 << 32L) + (l3 >> 32L) + (l1 << 48L) + (l1 >> 16L);
    return (int)(l1 ^ l1 >>> 32L);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    if (this.a != this.b) {
      stringBuilder.append('/');
      stringBuilder.append(this.b);
    } 
    stringBuilder.append(" - ");
    stringBuilder.append(this.c);
    if (this.c != this.d) {
      stringBuilder.append('/');
      stringBuilder.append(this.d);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\tempora\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */