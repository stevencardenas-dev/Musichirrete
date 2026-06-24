import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class qv2 extends dv2 implements sv2, RandomAccess {
  public static final int[] f;
  
  public static final qv2 g;
  
  public int[] c;
  
  public int e;
  
  static {
    int[] arrayOfInt = new int[0];
    f = arrayOfInt;
    g = new qv2(arrayOfInt, 0, false);
  }
  
  public qv2(int[] paramArrayOfint, int paramInt, boolean paramBoolean) {
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
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
  }
  
  public final boolean addAll(Collection paramCollection) {
    c();
    Charset charset = vv2.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof qv2))
      return super.addAll(paramCollection); 
    qv2 qv21 = (qv2)paramCollection;
    int i = qv21.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      int[] arrayOfInt = this.c;
      if (i > arrayOfInt.length)
        this.c = Arrays.copyOf(arrayOfInt, i); 
      System.arraycopy(qv21.c, 0, this.c, this.e, qv21.e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final qv2 d(int paramInt) {
    if (paramInt >= this.e) {
      int[] arrayOfInt;
      if (paramInt == 0) {
        arrayOfInt = f;
      } else {
        arrayOfInt = Arrays.copyOf(this.c, paramInt);
      } 
      return new qv2(arrayOfInt, this.e, true);
    } 
    l0.k();
    return null;
  }
  
  public final int e(int paramInt) {
    g(paramInt);
    return this.c[paramInt];
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof qv2))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((qv2)paramObject).e)
      return false; 
    paramObject = ((qv2)paramObject).c;
    for (byte b = 0; b < this.e; b++) {
      if (this.c[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final void f(int paramInt) {
    c();
    int i = this.e;
    int j = this.c.length;
    if (i == j) {
      int[] arrayOfInt1 = new int[ga1.h(j, 3, 2, 1, 10)];
      System.arraycopy(this.c, 0, arrayOfInt1, 0, this.e);
      this.c = arrayOfInt1;
    } 
    int[] arrayOfInt = this.c;
    i = this.e;
    this.e = i + 1;
    arrayOfInt[i] = paramInt;
  }
  
  public final void g(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
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
    int j = ((Integer)paramObject).intValue();
    int i = this.e;
    for (byte b = 0; b < i; b++) {
      if (this.c[b] == j)
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */