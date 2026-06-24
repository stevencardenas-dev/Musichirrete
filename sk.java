import java.util.Iterator;

public final class sk implements i41 {
  public final int b;
  
  public long c;
  
  public Object e;
  
  public sk(int paramInt) {}
  
  public void a(int paramInt) {
    if (paramInt >= 64) {
      sk sk1 = (sk)this.e;
      if (sk1 != null)
        sk1.a(paramInt - 64); 
      return;
    } 
    this.c &= 1L << paramInt ^ 0xFFFFFFFFFFFFFFFFL;
  }
  
  public int b(int paramInt) {
    sk sk1 = (sk)this.e;
    if (sk1 == null) {
      long l = this.c;
      return (paramInt >= 64) ? Long.bitCount(l) : Long.bitCount((1L << paramInt) - 1L & l);
    } 
    if (paramInt < 64)
      return Long.bitCount((1L << paramInt) - 1L & this.c); 
    paramInt = sk1.b(paramInt - 64);
    return Long.bitCount(this.c) + paramInt;
  }
  
  public void c() {
    if ((sk)this.e == null)
      this.e = new sk(0); 
  }
  
  public boolean d(int paramInt) {
    if (paramInt >= 64) {
      c();
      return ((sk)this.e).d(paramInt - 64);
    } 
    return ((1L << paramInt & this.c) != 0L);
  }
  
  public void e(int paramInt, boolean paramBoolean) {
    boolean bool;
    if (paramInt >= 64) {
      c();
      ((sk)this.e).e(paramInt - 64, paramBoolean);
      return;
    } 
    long l1 = this.c;
    if ((Long.MIN_VALUE & l1) != 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    long l2 = (1L << paramInt) - 1L;
    this.c = (l1 & (l2 ^ 0xFFFFFFFFFFFFFFFFL)) << 1L | l1 & l2;
    if (paramBoolean) {
      i(paramInt);
    } else {
      a(paramInt);
    } 
    if (bool || (sk)this.e != null) {
      c();
      ((sk)this.e).e(0, bool);
      return;
    } 
  }
  
  public void f(Exception paramException) {
    byte b;
    if (paramException instanceof l5) {
      b = ((l5)paramException).b.b;
    } else {
      b = 13;
    } 
    long l = this.c;
    Iterator<df2> iterator = ((nf1)((p01)this.e).f).c.d.iterator();
    while (iterator.hasNext())
      ((df2)iterator.next()).d(l, b, null); 
  }
  
  public boolean g(int paramInt) {
    boolean bool;
    if (paramInt >= 64) {
      c();
      return ((sk)this.e).g(paramInt - 64);
    } 
    long l2 = 1L << paramInt;
    long l1 = this.c;
    if ((l1 & l2) != 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    l1 &= l2 ^ 0xFFFFFFFFFFFFFFFFL;
    this.c = l1;
    l2--;
    this.c = l1 & l2 | Long.rotateRight((l2 ^ 0xFFFFFFFFFFFFFFFFL) & l1, 1);
    sk sk1 = (sk)this.e;
    if (sk1 != null) {
      if (sk1.d(0))
        i(63); 
      ((sk)this.e).g(0);
    } 
    return bool;
  }
  
  public void h() {
    this.c = 0L;
    sk sk1 = (sk)this.e;
    if (sk1 != null)
      sk1.h(); 
  }
  
  public void i(int paramInt) {
    if (paramInt >= 64) {
      c();
      ((sk)this.e).i(paramInt - 64);
      return;
    } 
    this.c |= 1L << paramInt;
  }
  
  public String toString() {
    String str;
    switch (this.b) {
      default:
        return super.toString();
      case 0:
        break;
    } 
    if ((sk)this.e == null) {
      str = Long.toBinaryString(this.c);
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(((sk)this.e).toString());
      stringBuilder.append("xx");
      stringBuilder.append(Long.toBinaryString(this.c));
      str = stringBuilder.toString();
    } 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */