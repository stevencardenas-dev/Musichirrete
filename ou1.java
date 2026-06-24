import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class ou1 {
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ou1.class, "_size$volatile");
  
  public volatile int _size$volatile;
  
  public q50[] a;
  
  public final void a(q50 paramq50) {
    q50[] arrayOfQ501;
    paramq50.d((r50)this);
    q50[] arrayOfQ502 = this.a;
    AtomicIntegerFieldUpdater<ou1> atomicIntegerFieldUpdater = b;
    if (arrayOfQ502 == null) {
      arrayOfQ501 = new q50[4];
      this.a = arrayOfQ501;
    } else {
      arrayOfQ501 = arrayOfQ502;
      if (atomicIntegerFieldUpdater.get((T)this) >= arrayOfQ502.length) {
        arrayOfQ501 = Arrays.<q50>copyOf(arrayOfQ502, atomicIntegerFieldUpdater.get(this) * 2);
        this.a = arrayOfQ501;
      } 
    } 
    int i = atomicIntegerFieldUpdater.get(this);
    atomicIntegerFieldUpdater.set(this, i + 1);
    arrayOfQ501[i] = paramq50;
    paramq50.c = i;
    c(i);
  }
  
  public final q50 b(int paramInt) {
    q50[] arrayOfQ50 = this.a;
    arrayOfQ50.getClass();
    AtomicIntegerFieldUpdater<ou1> atomicIntegerFieldUpdater = b;
    atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
    if (paramInt < atomicIntegerFieldUpdater.get((T)this)) {
      d(paramInt, atomicIntegerFieldUpdater.get(this));
      int j = (paramInt - 1) / 2;
      int i = paramInt;
      if (paramInt > 0) {
        q50 q502 = arrayOfQ50[paramInt];
        q502.getClass();
        q50 q503 = arrayOfQ50[j];
        q503.getClass();
        i = paramInt;
        if (q502.compareTo(q503) < 0) {
          d(paramInt, j);
          c(j);
          q502 = arrayOfQ50[atomicIntegerFieldUpdater.get((T)this)];
          q502.getClass();
          q502.d(null);
          q502.c = -1;
          arrayOfQ50[atomicIntegerFieldUpdater.get((T)this)] = null;
          return q502;
        } 
      } 
      while (true) {
        j = i * 2;
        paramInt = j + 1;
        if (paramInt >= atomicIntegerFieldUpdater.get((T)this))
          break; 
        q50[] arrayOfQ501 = this.a;
        arrayOfQ501.getClass();
        j += 2;
        if (j < atomicIntegerFieldUpdater.get((T)this)) {
          q50 q504 = arrayOfQ501[j];
          q504.getClass();
          q50 q505 = arrayOfQ501[paramInt];
          q505.getClass();
          if (q504.compareTo(q505) < 0)
            paramInt = j; 
        } 
        q50 q503 = arrayOfQ501[i];
        q503.getClass();
        q50 q502 = arrayOfQ501[paramInt];
        q502.getClass();
        if (q503.compareTo(q502) <= 0)
          break; 
        d(i, paramInt);
        i = paramInt;
      } 
    } 
    q50 q501 = arrayOfQ50[atomicIntegerFieldUpdater.get((T)this)];
    q501.getClass();
    q501.d(null);
    q501.c = -1;
    arrayOfQ50[atomicIntegerFieldUpdater.get((T)this)] = null;
    return q501;
  }
  
  public final void c(int paramInt) {
    while (true) {
      if (paramInt > 0) {
        q50[] arrayOfQ50 = this.a;
        arrayOfQ50.getClass();
        int i = (paramInt - 1) / 2;
        q50 q501 = arrayOfQ50[i];
        q501.getClass();
        q50 q502 = arrayOfQ50[paramInt];
        q502.getClass();
        if (q501.compareTo(q502) > 0) {
          d(paramInt, i);
          paramInt = i;
          continue;
        } 
      } 
      return;
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    q50[] arrayOfQ50 = this.a;
    arrayOfQ50.getClass();
    q50 q501 = arrayOfQ50[paramInt2];
    q501.getClass();
    q50 q502 = arrayOfQ50[paramInt1];
    q502.getClass();
    arrayOfQ50[paramInt1] = q501;
    arrayOfQ50[paramInt2] = q502;
    q501.c = paramInt1;
    q502.c = paramInt2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ou1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */