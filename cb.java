import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.ArrayList;

public final class cb extends np0 {
  public final long a;
  
  public final long b;
  
  public final wa c;
  
  public final Integer d;
  
  public final String e;
  
  public final ArrayList f;
  
  public cb(long paramLong1, long paramLong2, wa paramwa, Integer paramInteger, String paramString, ArrayList paramArrayList) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramwa;
    this.d = paramInteger;
    this.e = paramString;
    this.f = paramArrayList;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof np0) {
      paramObject = paramObject;
      long l = ((cb)paramObject).a;
      if (this.a == l && this.b == ((cb)paramObject).b && this.c.equals(((cb)paramObject).c)) {
        Integer integer1 = ((cb)paramObject).d;
        Integer integer2 = this.d;
        if ((integer2 == null) ? (integer1 == null) : integer2.equals(integer1)) {
          String str1 = ((cb)paramObject).e;
          String str2 = this.e;
          if (((str2 == null) ? (str1 == null) : str2.equals(str1)) && this.f.equals(((cb)paramObject).f)) {
            paramObject = hb1.b;
            if (paramObject.equals(paramObject))
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    long l = this.a;
    int m = (int)(l ^ l >>> 32L);
    l = this.b;
    int k = (int)(l >>> 32L ^ l);
    int n = this.c.hashCode();
    int j = 0;
    Integer integer = this.d;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    String str = this.e;
    if (str != null)
      j = str.hashCode(); 
    return (this.f.hashCode() ^ (((((m ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ n) * 1000003 ^ i) * 1000003 ^ j) * 1000003) * 1000003 ^ hb1.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("LogRequest{requestTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", requestUptimeMs=");
    stringBuilder.append(this.b);
    stringBuilder.append(", clientInfo=");
    stringBuilder.append(this.c);
    stringBuilder.append(", logSource=");
    stringBuilder.append(this.d);
    stringBuilder.append(", logSourceName=");
    stringBuilder.append(this.e);
    stringBuilder.append(ckOPp.dXqCYxjSKNot);
    stringBuilder.append(this.f);
    stringBuilder.append(", qosTier=");
    stringBuilder.append(hb1.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */