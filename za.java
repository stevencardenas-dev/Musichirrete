import java.util.HashMap;
import java.util.Map;

public final class za {
  public final String a;
  
  public final Integer b;
  
  public final g40 c;
  
  public final long d;
  
  public final long e;
  
  public final Map f;
  
  public za(String paramString, Integer paramInteger, g40 paramg40, long paramLong1, long paramLong2, HashMap paramHashMap) {
    this.a = paramString;
    this.b = paramInteger;
    this.c = paramg40;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramHashMap;
  }
  
  public final String a(String paramString) {
    String str = (String)this.f.get(paramString);
    paramString = str;
    if (str == null)
      paramString = ""; 
    return paramString;
  }
  
  public final int b(String paramString) {
    paramString = (String)this.f.get(paramString);
    return (paramString == null) ? 0 : Integer.valueOf(paramString).intValue();
  }
  
  public final m2 c() {
    Object object = new Object();
    String str = this.a;
    if (str != null) {
      ((m2)object).a = str;
      ((m2)object).b = this.b;
      g40 g401 = this.c;
      if (g401 != null) {
        ((m2)object).c = g401;
        ((m2)object).d = Long.valueOf(this.d);
        ((m2)object).e = Long.valueOf(this.e);
        ((m2)object).f = new HashMap<Object, Object>(this.f);
        return (m2)object;
      } 
      k91.h("Null encodedPayload");
      return null;
    } 
    k91.h("Null transportName");
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof za) {
      za za1 = (za)paramObject;
      if (this.a.equals(za1.a)) {
        Integer integer = za1.b;
        paramObject = this.b;
        if (((paramObject == null) ? (integer == null) : paramObject.equals(integer)) && this.c.equals(za1.c) && this.d == za1.d && this.e == za1.e && this.f.equals(za1.f))
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j = this.a.hashCode();
    Integer integer = this.b;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    int k = this.c.hashCode();
    long l = this.d;
    int n = (int)(l ^ l >>> 32L);
    l = this.e;
    int m = (int)(l ^ l >>> 32L);
    return this.f.hashCode() ^ (((((j ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ k) * 1000003 ^ n) * 1000003 ^ m) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("EventInternal{transportName=");
    stringBuilder.append(this.a);
    stringBuilder.append(", code=");
    stringBuilder.append(this.b);
    stringBuilder.append(", encodedPayload=");
    stringBuilder.append(this.c);
    stringBuilder.append(", eventMillis=");
    stringBuilder.append(this.d);
    stringBuilder.append(", uptimeMillis=");
    stringBuilder.append(this.e);
    stringBuilder.append(", autoMetadata=");
    stringBuilder.append(this.f);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */