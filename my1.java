import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class my1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    ArrayList<Integer> arrayList = new ArrayList();
    paramtk0.a();
    while (paramtk0.o()) {
      try {
        arrayList.add(Integer.valueOf(paramtk0.u()));
      } catch (NumberFormatException numberFormatException) {
        throw new RuntimeException(numberFormatException);
      } 
    } 
    numberFormatException.h();
    int i = arrayList.size();
    AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(i);
    for (byte b = 0; b < i; b++)
      atomicIntegerArray.set(b, ((Integer)arrayList.get(b)).intValue()); 
    return atomicIntegerArray;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    paramcl0.c();
    int i = paramObject.length();
    for (byte b = 0; b < i; b++)
      paramcl0.u(paramObject.get(b)); 
    paramcl0.h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\my1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */