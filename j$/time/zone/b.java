package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class b implements Comparable, Serializable {
  public static final int e = 0;
  
  private static final long serialVersionUID = -6946044323557704546L;
  
  public final long a;
  
  public final LocalDateTime b;
  
  public final ZoneOffset c;
  
  public final ZoneOffset d;
  
  public b(long paramLong, ZoneOffset paramZoneOffset1, ZoneOffset paramZoneOffset2) {
    this.a = paramLong;
    this.b = LocalDateTime.E(paramLong, 0, paramZoneOffset1);
    this.c = paramZoneOffset1;
    this.d = paramZoneOffset2;
  }
  
  public b(LocalDateTime paramLocalDateTime, ZoneOffset paramZoneOffset1, ZoneOffset paramZoneOffset2) {
    this.a = paramLocalDateTime.q(paramZoneOffset1);
    this.b = paramLocalDateTime;
    this.c = paramZoneOffset1;
    this.d = paramZoneOffset2;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new a((byte)2, this);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    return Long.compare(this.a, ((b)paramObject).a);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof b) {
      paramObject = paramObject;
      if (this.a == ((b)paramObject).a && this.c.equals(((b)paramObject).c) && this.d.equals(((b)paramObject).d))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.b.hashCode();
    int j = this.c.a;
    return Integer.rotateLeft(this.d.a, 16) ^ i ^ j;
  }
  
  public final boolean r() {
    return (this.d.getTotalSeconds() > this.c.getTotalSeconds());
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Transition[");
    if (r()) {
      str = "Gap";
    } else {
      str = "Overlap";
    } 
    stringBuilder.append(str);
    stringBuilder.append(" at ");
    stringBuilder.append(this.b);
    stringBuilder.append(this.c);
    stringBuilder.append(" to ");
    stringBuilder.append(this.d);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */