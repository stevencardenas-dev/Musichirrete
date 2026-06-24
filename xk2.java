import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class xk2 extends zj2 implements al2, RandomAccess {
  public static final int[] f;
  
  public static final xk2 g;
  
  public int[] c;
  
  public int e;
  
  static {
    int[] arrayOfInt = new int[0];
    f = arrayOfInt;
    g = new xk2(arrayOfInt, 0, false);
  }
  
  public xk2(int[] paramArrayOfint, int paramInt, boolean paramBoolean) {
    super(paramBoolean);
    this.c = paramArrayOfint;
    this.e = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject) {
    int i = ((Integer)paramObject).intValue();
    c();
    if (paramInt >= 0) {
      int j = this.e;
      if (paramInt <= j) {
        int k = paramInt + 1;
        paramObject = this.c;
        int m = paramObject.length;
        if (j < m) {
          System.arraycopy(paramObject, paramInt, paramObject, k, j - paramInt);
        } else {
          paramObject = new int[ga1.h(m, 3, 2, 1, 10)];
          System.arraycopy(this.c, 0, paramObject, 0, paramInt);
          System.arraycopy(this.c, paramInt, paramObject, k, this.e - paramInt);
          this.c = (int[])paramObject;
        } 
        this.c[paramInt] = i;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    m60.m(ga1.j("Index:", paramInt, this.e, ", Size:"));
  }
  
  public final boolean addAll(Collection paramCollection) {
    c();
    Charset charset = il2.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof xk2))
      return super.addAll(paramCollection); 
    xk2 xk21 = (xk2)paramCollection;
    int i = xk21.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      int[] arrayOfInt = this.c;
      if (i > arrayOfInt.length)
        this.c = Arrays.copyOf(arrayOfInt, i); 
      System.arraycopy(xk21.c, 0, this.c, this.e, xk21.e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final int d(int paramInt) {
    f(paramInt);
    return this.c[paramInt];
  }
  
  public final void e(int paramInt) {
    c();
    int j = this.e;
    int i = this.c.length;
    if (j == i) {
      int[] arrayOfInt1 = new int[ga1.h(i, 3, 2, 1, 10)];
      System.arraycopy(this.c, 0, arrayOfInt1, 0, this.e);
      this.c = arrayOfInt1;
    } 
    int[] arrayOfInt = this.c;
    i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof xk2))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((xk2)paramObject).e)
      return false; 
    paramObject = ((xk2)paramObject).c;
    for (byte b = 0; b < this.e; b++) {
      if (this.c[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final void f(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    m60.m(ga1.j("Index:", paramInt, this.e, ", Size:"));
  }
  
  public final int hashCode() {
    byte b = 0;
    int i = 1;
    while (b < this.e) {
      i = i * 31 + this.c[b];
      b++;
    } 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Integer))
      return -1; 
    int i = ((Integer)paramObject).intValue();
    int j = this.e;
    for (byte b = 0; b < j; b++) {
      if (this.c[b] == i)
        return b; 
    } 
    return -1;
  }
  
  public final void removeRange(int paramInt1, int paramInt2) {
    c();
    if (paramInt2 >= paramInt1) {
      int[] arrayOfInt = this.c;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.e - paramInt2);
      this.e -= paramInt2 - paramInt1;
      this.modCount++;
      return;
    } 
    m60.m("toIndex < fromIndex");
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */