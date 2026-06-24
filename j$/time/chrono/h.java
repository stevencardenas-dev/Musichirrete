package j$.time.chrono;

import j$.time.temporal.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public final class h implements Serializable {
  public static final int e = 0;
  
  private static final long serialVersionUID = 57387258289L;
  
  public final m a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  static {
    b b1 = b.YEARS;
    b b3 = b.MONTHS;
    b b2 = b.DAYS;
    ArrayList<Object> arrayList = new ArrayList(3);
    for (byte b = 0; b < 3; b++) {
      (new Object[3])[0] = b1;
      (new Object[3])[1] = b3;
      (new Object[3])[2] = b2;
      Object object = (new Object[3])[b];
      Objects.requireNonNull(object);
      arrayList.add(object);
    } 
    Collections.unmodifiableList(arrayList);
  }
  
  public h(m paramm, int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramm;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h) {
      paramObject = paramObject;
      if (this.b == ((h)paramObject).b && this.c == ((h)paramObject).c && this.d == ((h)paramObject).d && this.a.equals(((h)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.b;
    int i = Integer.rotateLeft(this.c, 8);
    int k = Integer.rotateLeft(this.d, 16);
    return this.a.hashCode() ^ k + i + j;
  }
  
  public final String toString() {
    if (this.b == 0 && this.c == 0 && this.d == 0) {
      String str = this.a.toString();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append(" P0D");
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a.toString());
    stringBuilder.append(" P");
    int i = this.b;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('Y');
    } 
    i = this.c;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('M');
    } 
    i = this.d;
    if (i != 0) {
      stringBuilder.append(i);
      stringBuilder.append('D');
    } 
    return stringBuilder.toString();
  }
  
  public Object writeReplace() {
    return new f0((byte)9, this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */