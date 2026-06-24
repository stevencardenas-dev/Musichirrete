import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class yv2 extends dv2 implements RandomAccess, tv2 {
  public static final long[] f;
  
  public static final yv2 g;
  
  public long[] c;
  
  public int e;
  
  static {
    long[] arrayOfLong = new long[0];
    f = arrayOfLong;
    g = new yv2(arrayOfLong, 0, false);
  }
  
  public yv2(long[] paramArrayOflong, int paramInt, boolean paramBoolean) {
    super(paramBoolean);
    this.c = paramArrayOflong;
    this.e = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject) {
    long l = ((Long)paramObject).longValue();
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
          paramObject = new long[ga1.h(j, 3, 2, 1, 10)];
          System.arraycopy(this.c, 0, paramObject, 0, paramInt);
          System.arraycopy(this.c, paramInt, paramObject, k, this.e - paramInt);
          this.c = (long[])paramObject;
        } 
        this.c[paramInt] = l;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
  }
  
  public final boolean add(Object paramObject) {
    long l = ((Long)paramObject).longValue();
    c();
    int j = this.e;
    int i = this.c.length;
    if (j == i) {
      paramObject = new long[ga1.h(i, 3, 2, 1, 10)];
      System.arraycopy(this.c, 0, paramObject, 0, this.e);
      this.c = (long[])paramObject;
    } 
    paramObject = this.c;
    i = this.e;
    this.e = i + 1;
    paramObject[i] = l;
    return true;
  }
  
  public final boolean addAll(Collection paramCollection) {
    c();
    Charset charset = vv2.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof yv2))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int j = ((yv2)paramCollection).e;
    if (j == 0)
      return false; 
    int i = this.e;
    if (Integer.MAX_VALUE - i >= j) {
      i += j;
      long[] arrayOfLong = this.c;
      if (i > arrayOfLong.length)
        this.c = Arrays.copyOf(arrayOfLong, i); 
      System.arraycopy(((yv2)paramCollection).c, 0, this.c, this.e, ((yv2)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final uv2 b(int paramInt) {
    if (paramInt >= this.e) {
      long[] arrayOfLong;
      if (paramInt == 0) {
        arrayOfLong = f;
      } else {
        arrayOfLong = Arrays.copyOf(this.c, paramInt);
      } 
      return new yv2(arrayOfLong, this.e, true);
    } 
    l0.k();
    return null;
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final long d(int paramInt) {
    e(paramInt);
    return this.c[paramInt];
  }
  
  public final void e(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    m60.m(fv2.b(this.e, paramInt, (byte)13, "Index:", ", Size:"));
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof yv2))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((yv2)paramObject).e)
      return false; 
    paramObject = ((yv2)paramObject).c;
    for (byte b = 0; b < this.e; b++) {
      if (this.c[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    byte b = 0;
    int i = 1;
    while (b < this.e) {
      long l = this.c[b];
      Charset charset = vv2.a;
      i = i * 31 + (int)(l ^ l >>> 32L);
      b++;
    } 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Long))
      return -1; 
    long l = ((Long)paramObject).longValue();
    int i = this.e;
    for (byte b = 0; b < i; b++) {
      if (this.c[b] == l)
        return b; 
    } 
    return -1;
  }
  
  public final void removeRange(int paramInt1, int paramInt2) {
    c();
    if (paramInt2 >= paramInt1) {
      long[] arrayOfLong = this.c;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, this.e - paramInt2);
      this.e -= paramInt2 - paramInt1;
      this.modCount++;
      return;
    } 
    m60.m(hrSTyFuSIm.BIPI);
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */