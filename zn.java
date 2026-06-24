import java.util.concurrent.CancellationException;

public final class zn {
  public final Object a;
  
  public final gi b;
  
  public final bd0 c;
  
  public final Object d;
  
  public final Throwable e;
  
  public zn(Object paramObject1, gi paramgi, bd0 parambd0, Object paramObject2, Throwable paramThrowable) {
    this.a = paramObject1;
    this.b = paramgi;
    this.c = parambd0;
    this.d = paramObject2;
    this.e = paramThrowable;
  }
  
  public static zn a(zn paramzn, gi paramgi, CancellationException paramCancellationException, int paramInt) {
    Throwable throwable;
    Object object1 = paramzn.a;
    if ((paramInt & 0x2) != 0)
      paramgi = paramzn.b; 
    bd0 bd01 = paramzn.c;
    Object object2 = paramzn.d;
    if ((paramInt & 0x10) != 0)
      throwable = paramzn.e; 
    return new zn(object1, paramgi, bd01, object2, throwable);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof zn))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((zn)paramObject).a) ? false : (!ui0.c(this.b, ((zn)paramObject).b) ? false : (!ui0.c(this.c, ((zn)paramObject).c) ? false : (!ui0.c(this.d, ((zn)paramObject).d) ? false : (!!ui0.c(this.e, ((zn)paramObject).e)))));
  }
  
  public final int hashCode() {
    int i;
    int j;
    int k;
    int m;
    int n = 0;
    Object object = this.a;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.b;
    if (object == null) {
      j = 0;
    } else {
      j = object.hashCode();
    } 
    object = this.c;
    if (object == null) {
      k = 0;
    } else {
      k = object.hashCode();
    } 
    object = this.d;
    if (object == null) {
      m = 0;
    } else {
      m = object.hashCode();
    } 
    object = this.e;
    if (object != null)
      n = object.hashCode(); 
    return (((i * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("CompletedContinuation(result=");
    stringBuilder.append(this.a);
    stringBuilder.append(", cancelHandler=");
    stringBuilder.append(this.b);
    stringBuilder.append(", onCancellation=");
    stringBuilder.append(this.c);
    stringBuilder.append(", idempotentResume=");
    stringBuilder.append(this.d);
    stringBuilder.append(", cancelCause=");
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */