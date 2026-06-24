import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

public final class hr {
  public static final hr j = new hr();
  
  public final c21 a;
  
  public final v11 b;
  
  public final boolean c;
  
  public final boolean d;
  
  public final boolean e;
  
  public final boolean f;
  
  public final long g;
  
  public final long h;
  
  public final Set i;
  
  public hr() {
    this.b = new v11(null);
    this.a = c21.b;
    this.c = false;
    this.d = false;
    this.e = false;
    this.f = false;
    this.g = -1L;
    this.h = -1L;
    this.i = f40.b;
  }
  
  public hr(hr paramhr) {
    this.c = paramhr.c;
    this.d = paramhr.d;
    this.b = paramhr.b;
    this.a = paramhr.a;
    this.e = paramhr.e;
    this.f = paramhr.f;
    this.i = paramhr.i;
    this.g = paramhr.g;
    this.h = paramhr.h;
  }
  
  public hr(v11 paramv11, c21 paramc21, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong1, long paramLong2, LinkedHashSet paramLinkedHashSet) {
    this.b = paramv11;
    this.a = paramc21;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramBoolean4;
    this.g = paramLong1;
    this.h = paramLong2;
    this.i = paramLinkedHashSet;
  }
  
  public final NetworkRequest a() {
    return (NetworkRequest)this.b.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || !hr.class.equals(paramObject.getClass()))
      return false; 
    paramObject = paramObject;
    return (this.c != ((hr)paramObject).c) ? false : ((this.d != ((hr)paramObject).d) ? false : ((this.e != ((hr)paramObject).e) ? false : ((this.f != ((hr)paramObject).f) ? false : ((this.g != ((hr)paramObject).g) ? false : ((this.h != ((hr)paramObject).h) ? false : (!ui0.c(a(), paramObject.a()) ? false : ((this.a != ((hr)paramObject).a) ? false : ui0.c(this.i, ((hr)paramObject).i))))))));
  }
  
  public final int hashCode() {
    byte b;
    int i = this.a.hashCode();
    boolean bool3 = this.c;
    boolean bool2 = this.d;
    boolean bool1 = this.e;
    boolean bool4 = this.f;
    long l = this.g;
    int j = (int)(l ^ l >>> 32L);
    l = this.h;
    int k = (int)(l ^ l >>> 32L);
    int m = this.i.hashCode();
    NetworkRequest networkRequest = a();
    if (networkRequest != null) {
      b = networkRequest.hashCode();
    } else {
      b = 0;
    } 
    return (m + ((((((i * 31 + bool3) * 31 + bool2) * 31 + bool1) * 31 + bool4) * 31 + j) * 31 + k) * 31) * 31 + b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Constraints{requiredNetworkType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", requiresCharging=");
    stringBuilder.append(this.c);
    stringBuilder.append(", requiresDeviceIdle=");
    stringBuilder.append(this.d);
    stringBuilder.append(", requiresBatteryNotLow=");
    stringBuilder.append(this.e);
    stringBuilder.append(", requiresStorageNotLow=");
    stringBuilder.append(this.f);
    stringBuilder.append(", contentTriggerUpdateDelayMillis=");
    stringBuilder.append(this.g);
    stringBuilder.append(", contentTriggerMaxDelayMillis=");
    stringBuilder.append(this.h);
    stringBuilder.append(", contentUriTriggers=");
    stringBuilder.append(this.i);
    stringBuilder.append(", }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */