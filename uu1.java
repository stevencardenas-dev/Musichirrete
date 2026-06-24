import android.util.Pair;

public abstract class uu1 {
  public static final ru1 a = (ru1)new Object();
  
  public int a(boolean paramBoolean) {
    return n() ? -1 : 0;
  }
  
  public abstract int b(Object paramObject);
  
  public int c(boolean paramBoolean) {
    return n() ? -1 : (m() - 1);
  }
  
  public final int d(int paramInt1, su1 paramsu1, tu1 paramtu1, int paramInt2, boolean paramBoolean) {
    int i = (f(paramInt1, paramsu1, false)).c;
    if ((l(i, paramtu1, 0L)).h == paramInt1) {
      paramInt1 = e(i, paramInt2, paramBoolean);
      return (paramInt1 == -1) ? -1 : (l(paramInt1, paramtu1, 0L)).g;
    } 
    return paramInt1 + 1;
  }
  
  public int e(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          return (paramInt1 == c(paramBoolean)) ? a(paramBoolean) : (paramInt1 + 1); 
        throw new IllegalStateException();
      } 
      return paramInt1;
    } 
    return (paramInt1 == c(paramBoolean)) ? -1 : (paramInt1 + 1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof uu1))
        return false; 
      uu1 uu11 = (uu1)paramObject;
      if (uu11.m() != m() || uu11.h() != h())
        return false; 
      tu1 tu1 = new tu1();
      su1 su12 = new su1();
      paramObject = new tu1();
      su1 su11 = new su1();
      byte b;
      for (b = 0; b < m(); b++) {
        if (!l(b, tu1, 0L).equals(uu11.l(b, (tu1)paramObject, 0L)))
          // Byte code: goto -> 169 
      } 
      for (b = 0; b < h(); b++) {
        if (!f(b, su12, true).equals(uu11.f(b, su11, true)))
          // Byte code: goto -> 169 
      } 
    } 
    return true;
  }
  
  public abstract su1 f(int paramInt, su1 paramsu1, boolean paramBoolean);
  
  public su1 g(Object paramObject, su1 paramsu1) {
    return f(b(paramObject), paramsu1, true);
  }
  
  public abstract int h();
  
  public final int hashCode() {
    tu1 tu1 = new tu1();
    su1 su1 = new su1();
    int i = m() + 217;
    boolean bool = false;
    byte b;
    for (b = 0; b < m(); b++)
      i = i * 31 + l(b, tu1, 0L).hashCode(); 
    i = h() + i * 31;
    for (b = bool; b < h(); b++)
      i = i * 31 + f(b, su1, true).hashCode(); 
    return i;
  }
  
  public final Pair i(tu1 paramtu1, su1 paramsu1, int paramInt, long paramLong) {
    Pair pair = j(paramtu1, paramsu1, paramInt, paramLong, 0L);
    pair.getClass();
    return pair;
  }
  
  public final Pair j(tu1 paramtu1, su1 paramsu1, int paramInt, long paramLong1, long paramLong2) {
    int i = m();
    if (paramInt >= 0 && paramInt < i) {
      l(paramInt, paramtu1, paramLong2);
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        paramLong1 = paramtu1.i;
        paramLong2 = paramLong1;
        if (paramLong1 == -9223372036854775807L)
          return null; 
      } 
      paramInt = paramtu1.g;
      for (paramLong1 = (f(paramInt, paramsu1, true)).d; paramLong1 != -9223372036854775807L && paramLong2 >= paramLong1 && paramInt < paramtu1.h; paramLong1 = (f(++paramInt, paramsu1, true)).d)
        paramLong2 -= paramLong1; 
      Object object = paramsu1.b;
      object.getClass();
      return Pair.create(object, Long.valueOf(paramLong2));
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public abstract Object k(int paramInt);
  
  public abstract tu1 l(int paramInt, tu1 paramtu1, long paramLong);
  
  public abstract int m();
  
  public final boolean n() {
    return (m() == 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */