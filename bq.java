import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class bq {
  public HashSet a = null;
  
  public int b;
  
  public boolean c;
  
  public final er d;
  
  public final int e;
  
  public bq f;
  
  public int g = 0;
  
  public int h = Integer.MIN_VALUE;
  
  public pn1 i;
  
  public bq(er paramer, int paramInt) {
    this.d = paramer;
    this.e = paramInt;
  }
  
  public final void a(bq parambq, int paramInt1, int paramInt2) {
    if (parambq == null) {
      g();
      return;
    } 
    this.f = parambq;
    if (parambq.a == null)
      parambq.a = new HashSet(); 
    HashSet<bq> hashSet = this.f.a;
    if (hashSet != null)
      hashSet.add(this); 
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public final void b(int paramInt, k52 paramk52, ArrayList paramArrayList) {
    HashSet hashSet = this.a;
    if (hashSet != null) {
      Iterator iterator = hashSet.iterator();
      while (iterator.hasNext())
        m92.r(((bq)iterator.next()).d, paramInt, paramArrayList, paramk52); 
    } 
  }
  
  public final int c() {
    return !this.c ? 0 : this.b;
  }
  
  public final int d() {
    if (this.d.g0 == 8)
      return 0; 
    int i = this.h;
    if (i != Integer.MIN_VALUE) {
      bq bq1 = this.f;
      if (bq1 != null && bq1.d.g0 == 8)
        return i; 
    } 
    return this.g;
  }
  
  public final boolean e() {
    HashSet hashSet = this.a;
    if (hashSet != null)
      for (bq bq1 : hashSet) {
        er er1 = bq1.d;
        int i = bq1.e;
        switch (x41.y(i)) {
          default:
            throw new AssertionError(x41.x(i));
          case 4:
            bq1 = er1.J;
            break;
          case 3:
            bq1 = er1.I;
            break;
          case 2:
            bq1 = er1.L;
            break;
          case 1:
            bq1 = er1.K;
            break;
          case 0:
          case 5:
          case 6:
          case 7:
          case 8:
            bq1 = null;
            break;
        } 
        if (bq1.f())
          return true; 
      }  
    return false;
  }
  
  public final boolean f() {
    return (this.f != null);
  }
  
  public final void g() {
    bq bq1 = this.f;
    if (bq1 != null) {
      HashSet hashSet = bq1.a;
      if (hashSet != null) {
        hashSet.remove(this);
        if (this.f.a.size() == 0)
          this.f.a = null; 
      } 
    } 
    this.a = null;
    this.f = null;
    this.g = 0;
    this.h = Integer.MIN_VALUE;
    this.c = false;
    this.b = 0;
  }
  
  public final void h() {
    pn1 pn11 = this.i;
    if (pn11 == null) {
      this.i = new pn1(1);
      return;
    } 
    pn11.c();
  }
  
  public final void i(int paramInt) {
    this.b = paramInt;
    this.c = true;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.h0);
    stringBuilder.append(":");
    stringBuilder.append(x41.x(this.e));
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */