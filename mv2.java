import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class mv2 extends dv2 implements rv2, RandomAccess {
  public static final float[] f;
  
  public static final mv2 g;
  
  public float[] c;
  
  public int e;
  
  static {
    float[] arrayOfFloat = new float[0];
    f = arrayOfFloat;
    g = new mv2(arrayOfFloat, 0, false);
  }
  
  public mv2(float[] paramArrayOffloat, int paramInt, boolean paramBoolean) {
    super(paramBoolean);
    this.c = paramArrayOffloat;
    this.e = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject) {
    float f = ((Float)paramObject).floatValue();
    c();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        int k = paramInt + 1;
        paramObject = this.c;
        int j = paramObject.length;
        if (i < j) {
          System.arraycopy(paramObject, paramInt, paramObject, k, i - paramInt);
        } else {
          paramObject = new float[ga1.h(j, 3, 2, 1, 10)];
          System.arraycopy(this.c, 0, paramObject, 0, paramInt);
          System.arraycopy(this.c, paramInt, paramObject, k, this.e - paramInt);
          this.c = (float[])paramObject;
        } 
        this.c[paramInt] = f;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
  }
  
  public final boolean add(Object paramObject) {
    float f = ((Float)paramObject).floatValue();
    c();
    int i = this.e;
    int j = this.c.length;
    if (i == j) {
      paramObject = new float[ga1.h(j, 3, 2, 1, 10)];
      System.arraycopy(this.c, 0, paramObject, 0, this.e);
      this.c = (float[])paramObject;
    } 
    paramObject = this.c;
    i = this.e;
    this.e = i + 1;
    paramObject[i] = f;
    return true;
  }
  
  public final boolean addAll(Collection paramCollection) {
    c();
    Charset charset = vv2.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof mv2))
      return super.addAll(paramCollection); 
    mv2 mv21 = (mv2)paramCollection;
    int i = mv21.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      float[] arrayOfFloat = this.c;
      if (i > arrayOfFloat.length)
        this.c = Arrays.copyOf(arrayOfFloat, i); 
      System.arraycopy(mv21.c, 0, this.c, this.e, mv21.e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final uv2 b(int paramInt) {
    if (paramInt >= this.e) {
      float[] arrayOfFloat;
      if (paramInt == 0) {
        arrayOfFloat = f;
      } else {
        arrayOfFloat = Arrays.copyOf(this.c, paramInt);
      } 
      return new mv2(arrayOfFloat, this.e, true);
    } 
    l0.k();
    return null;
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final void d(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof mv2))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((mv2)paramObject).e)
      return false; 
    paramObject = ((mv2)paramObject).c;
    for (byte b = 0; b < this.e; b++) {
      if (Float.floatToIntBits(this.c[b]) != Float.floatToIntBits(paramObject[b]))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    byte b = 0;
    int i = 1;
    while (b < this.e) {
      i = i * 31 + Float.floatToIntBits(this.c[b]);
      b++;
    } 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Float))
      return -1; 
    float f = ((Float)paramObject).floatValue();
    int i = this.e;
    for (byte b = 0; b < i; b++) {
      if (this.c[b] == f)
        return b; 
    } 
    return -1;
  }
  
  public final void removeRange(int paramInt1, int paramInt2) {
    c();
    if (paramInt2 >= paramInt1) {
      float[] arrayOfFloat = this.c;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, this.e - paramInt2);
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */