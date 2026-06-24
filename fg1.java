import java.util.concurrent.atomic.AtomicReferenceArray;

public final class fg1 {
  public volatile AtomicReferenceArray<Object> array;
  
  public fg1(int paramInt) {
    this.array = new AtomicReferenceArray(paramInt);
  }
  
  public final int a() {
    return this.array.length();
  }
  
  public final Object b(int paramInt) {
    AtomicReferenceArray<Object> atomicReferenceArray = this.array;
    return (paramInt < atomicReferenceArray.length()) ? atomicReferenceArray.get(paramInt) : null;
  }
  
  public final void c(int paramInt, us paramus) {
    AtomicReferenceArray<Object> atomicReferenceArray1 = this.array;
    int m = atomicReferenceArray1.length();
    if (paramInt < m) {
      atomicReferenceArray1.set(paramInt, paramus);
      return;
    } 
    int k = paramInt + 1;
    int j = m * 2;
    int i = k;
    if (k < j)
      i = j; 
    AtomicReferenceArray<us> atomicReferenceArray = new AtomicReferenceArray(i);
    for (i = 0; i < m; i++)
      atomicReferenceArray.set(i, atomicReferenceArray1.get(i)); 
    atomicReferenceArray.set(paramInt, paramus);
    this.array = (AtomicReferenceArray)atomicReferenceArray;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */