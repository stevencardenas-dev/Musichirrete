import java.util.Arrays;

public final class bb extends kp0 {
  public final long a;
  
  public final Integer b;
  
  public final long c;
  
  public final byte[] d;
  
  public final String e;
  
  public final long f;
  
  public final s11 g;
  
  public bb(long paramLong1, Integer paramInteger, long paramLong2, byte[] paramArrayOfbyte, String paramString, long paramLong3, s11 params11) {
    this.a = paramLong1;
    this.b = paramInteger;
    this.c = paramLong2;
    this.d = paramArrayOfbyte;
    this.e = paramString;
    this.f = paramLong3;
    this.g = params11;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof kp0) {
      kp0 kp01 = (kp0)paramObject;
      bb bb1 = (bb)kp01;
      long l = bb1.a;
      if (this.a == l) {
        Integer integer = bb1.b;
        paramObject = this.b;
        if (((paramObject == null) ? (integer == null) : paramObject.equals(integer)) && this.c == bb1.c) {
          if (kp01 instanceof bb) {
            paramObject = ((bb)kp01).d;
          } else {
            paramObject = bb1.d;
          } 
          if (Arrays.equals(this.d, (byte[])paramObject)) {
            String str = bb1.e;
            paramObject = this.e;
            if (((paramObject == null) ? (str == null) : paramObject.equals(str)) && this.f == bb1.f) {
              s11 s111 = bb1.g;
              paramObject = this.g;
              if ((paramObject == null) ? (s111 == null) : paramObject.equals(s111))
                return true; 
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j;
    long l = this.a;
    int m = (int)(l ^ l >>> 32L);
    int k = 0;
    Integer integer = this.b;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    l = this.c;
    int i1 = (int)(l ^ l >>> 32L);
    int n = Arrays.hashCode(this.d);
    String str = this.e;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    l = this.f;
    int i2 = (int)(l ^ l >>> 32L);
    s11 s111 = this.g;
    if (s111 != null)
      k = s111.hashCode(); 
    return ((((((m ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ i1) * 1000003 ^ n) * 1000003 ^ j) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("LogEvent{eventTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", eventCode=");
    stringBuilder.append(this.b);
    stringBuilder.append(", eventUptimeMs=");
    stringBuilder.append(this.c);
    stringBuilder.append(", sourceExtension=");
    stringBuilder.append(Arrays.toString(this.d));
    stringBuilder.append(", sourceExtensionJsonProto3=");
    stringBuilder.append(this.e);
    stringBuilder.append(", timezoneOffsetSeconds=");
    stringBuilder.append(this.f);
    stringBuilder.append(", networkConnectionInfo=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */