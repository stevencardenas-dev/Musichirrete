import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class ny1 extends jy1 {
  public final int a;
  
  public final jy1 b;
  
  public final Object b(tk0 paramtk0) {
    int i = this.a;
    jy1 jy11 = this.b;
    switch (i) {
      default:
        return new AtomicLong(((Number)jy11.b(paramtk0)).longValue());
      case 0:
        break;
    } 
    ArrayList<Long> arrayList = new ArrayList();
    paramtk0.a();
    while (paramtk0.o())
      arrayList.add(Long.valueOf(((Number)jy11.b(paramtk0)).longValue())); 
    paramtk0.h();
    int j = arrayList.size();
    AtomicLongArray atomicLongArray = new AtomicLongArray(j);
    for (i = 0; i < j; i++)
      atomicLongArray.set(i, ((Long)arrayList.get(i)).longValue()); 
    return atomicLongArray;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    int i = this.a;
    jy1 jy11 = this.b;
    switch (i) {
      default:
        jy11.c(paramcl0, Long.valueOf(((AtomicLong)paramObject).get()));
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    paramcl0.c();
    int j = paramObject.length();
    for (i = 0; i < j; i++)
      jy11.c(paramcl0, Long.valueOf(paramObject.get(i))); 
    paramcl0.h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ny1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */