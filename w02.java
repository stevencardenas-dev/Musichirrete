import java.io.Serializable;
import java.util.HashMap;

public final class w02 extends g20 implements Serializable {
  public static HashMap c;
  
  public final h20 b;
  
  public w02(h20 paramh20) {
    this.b = paramh20;
  }
  
  public static w02 g(h20 paramh20) {
    w02 w021;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{w02}} */
    try {
      HashMap<Object, Object> hashMap = c;
      if (hashMap == null) {
        hashMap = new HashMap<Object, Object>();
        this(7);
        c = hashMap;
        hashMap = null;
      } else {
        w021 = (w02)hashMap.get(paramh20);
      } 
    } finally {}
    w02 w022 = w021;
    if (w021 == null) {
      w022 = new w02();
      this(paramh20);
      c.put(paramh20, w022);
    } 
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{w02}} */
    return w022;
  }
  
  public final long a(int paramInt, long paramLong) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(" field is unsupported");
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public final long b(long paramLong1, long paramLong2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(" field is unsupported");
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public final h20 c() {
    return this.b;
  }
  
  public final long d() {
    return 0L;
  }
  
  public final boolean e() {
    return true;
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof w02) ? ((w02)paramObject).b.b.equals(this.b.b) : false);
  }
  
  public final boolean f() {
    return false;
  }
  
  public final int hashCode() {
    return this.b.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("UnsupportedDurationField[");
    stringBuilder.append(this.b.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */