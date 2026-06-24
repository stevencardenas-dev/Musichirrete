package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

public final class Duration implements Comparable<Duration>, Serializable {
  public static final Duration c = new Duration(0L, 0);
  
  private static final long serialVersionUID = 3078945930695997490L;
  
  public final long a;
  
  public final int b;
  
  static {
    BigInteger.valueOf(1000000000L);
  }
  
  public Duration(long paramLong, int paramInt) {
    this.a = paramLong;
    this.b = paramInt;
  }
  
  public static Duration ofSeconds(long paramLong1, long paramLong2) {
    return r(Math.addExact(paramLong1, Math.floorDiv(paramLong2, 1000000000L)), (int)Math.floorMod(paramLong2, 1000000000L));
  }
  
  public static Duration r(long paramLong, int paramInt) {
    return ((paramInt | paramLong) == 0L) ? c : new Duration(paramLong, paramInt);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static Duration t(long paramLong) {
    long l = paramLong / 1000000000L;
    int j = (int)(paramLong % 1000000000L);
    paramLong = l;
    int i = j;
    if (j < 0) {
      i = (int)(j + 1000000000L);
      paramLong = l - 1L;
    } 
    return r(paramLong, i);
  }
  
  private Object writeReplace() {
    return new m((byte)1, this);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = Long.compare(this.a, ((Duration)paramObject).a);
    return (i != 0) ? i : (this.b - ((Duration)paramObject).b);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Duration) {
      paramObject = paramObject;
      if (this.a == ((Duration)paramObject).a && this.b == ((Duration)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public int getNano() {
    return this.b;
  }
  
  public long getSeconds() {
    return this.a;
  }
  
  public final int hashCode() {
    long l = this.a;
    int i = (int)(l ^ l >>> 32L);
    return this.b * 51 + i;
  }
  
  public final String toString() {
    if (this == c)
      return "PT0S"; 
    long l2 = this.a;
    long l1 = l2;
    if (l2 < 0L) {
      l1 = l2;
      if (this.b > 0)
        l1 = l2 + 1L; 
    } 
    l2 = l1 / 3600L;
    int i = (int)(l1 % 3600L / 60L);
    int j = (int)(l1 % 60L);
    StringBuilder stringBuilder = new StringBuilder(24);
    stringBuilder.append("PT");
    if (l2 != 0L) {
      stringBuilder.append(l2);
      stringBuilder.append('H');
    } 
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('M');
    } 
    if (j == 0 && this.b == 0 && stringBuilder.length() > 2)
      return stringBuilder.toString(); 
    if (this.a < 0L && this.b > 0) {
      if (j == 0) {
        stringBuilder.append("-0");
      } else {
        stringBuilder.append(j);
      } 
    } else {
      stringBuilder.append(j);
    } 
    if (this.b > 0) {
      j = stringBuilder.length();
      l1 = this.a;
      i = this.b;
      if (l1 < 0L) {
        stringBuilder.append(2000000000L - i);
      } else {
        stringBuilder.append(i + 1000000000L);
      } 
      while (stringBuilder.charAt(stringBuilder.length() - 1) == '0')
        stringBuilder.setLength(stringBuilder.length() - 1); 
      stringBuilder.setCharAt(j, '.');
    } 
    stringBuilder.append('S');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\Duration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */