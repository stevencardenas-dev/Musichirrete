import java.util.Arrays;
import java.util.RandomAccess;

public final class cm2 extends zj2 implements RandomAccess {
  public static final Object[] f;
  
  public static final cm2 g;
  
  public Object[] c;
  
  public int e;
  
  static {
    Object[] arrayOfObject = new Object[0];
    f = arrayOfObject;
    g = new cm2(arrayOfObject, 0, false);
  }
  
  public cm2(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean) {
    super(paramBoolean);
    this.c = paramArrayOfObject;
    this.e = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject) {
    c();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        int k = paramInt + 1;
        Object[] arrayOfObject = this.c;
        int j = arrayOfObject.length;
        if (i < j) {
          System.arraycopy(arrayOfObject, paramInt, arrayOfObject, k, i - paramInt);
        } else {
          arrayOfObject = new Object[ga1.h(j, 3, 2, 1, 10)];
          System.arraycopy(this.c, 0, arrayOfObject, 0, paramInt);
          System.arraycopy(this.c, paramInt, arrayOfObject, k, this.e - paramInt);
          this.c = arrayOfObject;
        } 
        this.c[paramInt] = paramObject;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    m60.m(ga1.j("Index:", paramInt, this.e, ", Size:"));
  }
  
  public final boolean add(Object paramObject) {
    c();
    int i = this.e;
    int j = this.c.length;
    if (i == j) {
      i = ga1.h(j, 3, 2, 1, 10);
      this.c = Arrays.copyOf(this.c, i);
    } 
    Object[] arrayOfObject = this.c;
    i = this.e;
    this.e = i + 1;
    arrayOfObject[i] = paramObject;
    this.modCount++;
    return true;
  }
  
  public final void d(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    m60.m(ga1.j("Index:", paramInt, this.e, ", Size:"));
  }
  
  public final Object get(int paramInt) {
    d(paramInt);
    return this.c[paramInt];
  }
  
  public final Object remove(int paramInt) {
    c();
    d(paramInt);
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[paramInt];
    int i = this.e;
    if (paramInt < i - 1)
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1); 
    this.e--;
    this.modCount++;
    return object;
  }
  
  public final Object set(int paramInt, Object paramObject) {
    c();
    d(paramInt);
    Object[] arrayOfObject = this.c;
    Object object = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    this.modCount++;
    return object;
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */