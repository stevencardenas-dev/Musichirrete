package j$.time;

import j$.time.temporal.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

public final class Period implements Serializable {
  public static final Period d = new Period(0, 0, 0);
  
  private static final long serialVersionUID = -3587258372562876L;
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  static {
    Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    b b1 = b.YEARS;
    b b3 = b.MONTHS;
    b b2 = b.DAYS;
    ArrayList<Object> arrayList = new ArrayList(3);
    while (b < 3) {
      (new Object[3])[0] = b1;
      (new Object[3])[1] = b3;
      (new Object[3])[2] = b2;
      Object object = (new Object[3])[b];
      Objects.requireNonNull(object);
      arrayList.add(object);
      b++;
    } 
    Collections.unmodifiableList(arrayList);
  }
  
  public Period(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public static Period of(int paramInt1, int paramInt2, int paramInt3) {
    return ((paramInt1 | paramInt2 | paramInt3) == 0) ? d : new Period(paramInt1, paramInt2, paramInt3);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)14, this);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof Period) {
      paramObject = paramObject;
      if (this.a == ((Period)paramObject).a && this.b == ((Period)paramObject).b && this.c == ((Period)paramObject).c)
        return true; 
    } 
    return false;
  }
  
  public int getDays() {
    return this.c;
  }
  
  public int getMonths() {
    return this.b;
  }
  
  public int getYears() {
    return this.a;
  }
  
  public final int hashCode() {
    int i = this.a;
    int j = Integer.rotateLeft(this.b, 8);
    return Integer.rotateLeft(this.c, 16) + j + i;
  }
  
  public final String toString() {
    if (this == d)
      return "P0D"; 
    StringBuilder stringBuilder = new StringBuilder("P");
    int i = this.a;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('Y');
    } 
    i = this.b;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('M');
    } 
    i = this.c;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('D');
    } 
    return stringBuilder.toString();
  }
  
  static {
    byte b = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\Period.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */