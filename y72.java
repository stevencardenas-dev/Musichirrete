public final class y72 {
  public final String a;
  
  public o72 b;
  
  public final String c;
  
  public final String d;
  
  public final du e;
  
  public final du f;
  
  public long g;
  
  public final long h;
  
  public final long i;
  
  public final hr j;
  
  public final int k;
  
  public final qb l;
  
  public final long m;
  
  public long n;
  
  public final long o;
  
  public final long p;
  
  public boolean q;
  
  public final g51 r;
  
  public final int s;
  
  public final int t;
  
  public final long u;
  
  public final int v;
  
  public final int w;
  
  public String x;
  
  public final Boolean y;
  
  static {
    qp0.j("WorkSpec");
  }
  
  public y72(String paramString1, o72 paramo72, String paramString2, String paramString3, du paramdu1, du paramdu2, long paramLong1, long paramLong2, long paramLong3, hr paramhr, int paramInt1, qb paramqb, long paramLong4, long paramLong5, long paramLong6, long paramLong7, boolean paramBoolean, g51 paramg51, int paramInt2, int paramInt3, long paramLong8, int paramInt4, int paramInt5, String paramString4, Boolean paramBoolean1) {
    this.a = paramString1;
    this.b = paramo72;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramdu1;
    this.f = paramdu2;
    this.g = paramLong1;
    this.h = paramLong2;
    this.i = paramLong3;
    this.j = paramhr;
    this.k = paramInt1;
    this.l = paramqb;
    this.m = paramLong4;
    this.n = paramLong5;
    this.o = paramLong6;
    this.p = paramLong7;
    this.q = paramBoolean;
    this.r = paramg51;
    this.s = paramInt2;
    this.t = paramInt3;
    this.u = paramLong8;
    this.v = paramInt4;
    this.w = paramInt5;
    this.x = paramString4;
    this.y = paramBoolean1;
  }
  
  public static y72 b(y72 paramy72, String paramString, du paramdu) {
    String str3 = paramy72.a;
    o72 o721 = paramy72.b;
    String str1 = paramy72.d;
    du du1 = paramy72.f;
    long l8 = paramy72.g;
    long l1 = paramy72.h;
    long l2 = paramy72.i;
    hr hr1 = paramy72.j;
    int j = paramy72.k;
    qb qb1 = paramy72.l;
    long l5 = paramy72.m;
    long l3 = paramy72.n;
    long l6 = paramy72.o;
    long l7 = paramy72.p;
    boolean bool = paramy72.q;
    g51 g511 = paramy72.r;
    int m = paramy72.s;
    int i = paramy72.t;
    long l4 = paramy72.u;
    int k = paramy72.v;
    int n = paramy72.w;
    String str2 = paramy72.x;
    Boolean bool1 = paramy72.y;
    paramy72.getClass();
    str3.getClass();
    o721.getClass();
    str1.getClass();
    du1.getClass();
    hr1.getClass();
    qb1.getClass();
    g511.getClass();
    return new y72(str3, o721, paramString, str1, paramdu, du1, l8, l1, l2, hr1, j, qb1, l5, l3, l6, l7, bool, g511, m, i, l4, k, n, str2, bool1);
  }
  
  public final long a() {
    boolean bool;
    o72 o721 = this.b;
    o72 o722 = o72.b;
    int i = this.k;
    if (o721 == o722 && i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    long l3 = this.n;
    boolean bool1 = c();
    long l1 = this.g;
    qb qb1 = this.l;
    qb1.getClass();
    long l2 = this.u;
    int j = this.s;
    if (l2 != Long.MAX_VALUE && bool1) {
      if (j != 0) {
        l1 = l3 + 900000L;
        if (l2 < l1)
          return l1; 
      } 
      return l2;
    } 
    if (bool) {
      qb qb2 = qb.c;
      l1 = this.m;
      if (qb1 == qb2) {
        l1 *= i;
      } else {
        l1 = (long)Math.scalb((float)l1, i - 1);
      } 
      l2 = l1;
      if (l1 > 18000000L)
        l2 = 18000000L; 
      return l3 + l2;
    } 
    if (bool1) {
      l2 = this.h;
      if (j == 0) {
        l1 = l3 + l1;
      } else {
        l1 = l3 + l2;
      } 
      l3 = this.i;
      return (l3 != l2 && j == 0) ? (l2 - l3 + l1) : l1;
    } 
    return (l3 == -1L) ? Long.MAX_VALUE : (l3 + l1);
  }
  
  public final boolean c() {
    return (this.h != 0L);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof y72))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((y72)paramObject).a) ? false : ((this.b != ((y72)paramObject).b) ? false : (!ui0.c(this.c, ((y72)paramObject).c) ? false : (!ui0.c(this.d, ((y72)paramObject).d) ? false : (!ui0.c(this.e, ((y72)paramObject).e) ? false : (!ui0.c(this.f, ((y72)paramObject).f) ? false : ((this.g != ((y72)paramObject).g) ? false : ((this.h != ((y72)paramObject).h) ? false : ((this.i != ((y72)paramObject).i) ? false : (!ui0.c(this.j, ((y72)paramObject).j) ? false : ((this.k != ((y72)paramObject).k) ? false : ((this.l != ((y72)paramObject).l) ? false : ((this.m != ((y72)paramObject).m) ? false : ((this.n != ((y72)paramObject).n) ? false : ((this.o != ((y72)paramObject).o) ? false : ((this.p != ((y72)paramObject).p) ? false : ((this.q != ((y72)paramObject).q) ? false : ((this.r != ((y72)paramObject).r) ? false : ((this.s != ((y72)paramObject).s) ? false : ((this.t != ((y72)paramObject).t) ? false : ((this.u != ((y72)paramObject).u) ? false : ((this.v != ((y72)paramObject).v) ? false : ((this.w != ((y72)paramObject).w) ? false : (!ui0.c(this.x, ((y72)paramObject).x) ? false : (!!ui0.c(this.y, ((y72)paramObject).y)))))))))))))))))))))))));
  }
  
  public final int hashCode() {
    int i;
    int i8 = this.a.hashCode();
    int i4 = this.b.hashCode();
    int i20 = this.c.hashCode();
    int k = this.d.hashCode();
    int i17 = this.e.hashCode();
    int i10 = this.f.hashCode();
    int i6 = Long.hashCode(this.g);
    int m = Long.hashCode(this.h);
    int i2 = Long.hashCode(this.i);
    int i12 = this.j.hashCode();
    int i13 = Integer.hashCode(this.k);
    int i16 = this.l.hashCode();
    int i19 = Long.hashCode(this.m);
    int i9 = Long.hashCode(this.n);
    int i1 = Long.hashCode(this.o);
    int i5 = Long.hashCode(this.p);
    int i14 = Boolean.hashCode(this.q);
    int i7 = this.r.hashCode();
    int i15 = Integer.hashCode(this.s);
    int i18 = Integer.hashCode(this.t);
    int i11 = Long.hashCode(this.u);
    int n = Integer.hashCode(this.v);
    int i3 = Integer.hashCode(this.w);
    String str = this.x;
    int j = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    Boolean bool = this.y;
    if (bool != null)
      j = bool.hashCode(); 
    return ((i3 + (n + (i11 + (i18 + (i15 + (i7 + (i14 + (i5 + (i1 + (i9 + (i19 + (i16 + (i13 + (i12 + (i2 + (m + (i6 + (i10 + (i17 + (k + (i20 + (i4 + i8 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i) * 31 + j;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("{WorkSpec: ");
    stringBuilder.append(this.a);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */