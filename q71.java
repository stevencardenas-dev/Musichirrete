public final class q71 {
  public static final fw0 n = new fw0(-1L, new Object());
  
  public final uu1 a;
  
  public final fw0 b;
  
  public final long c;
  
  public final long d;
  
  public final int e;
  
  public final l60 f;
  
  public final boolean g;
  
  public final vv1 h;
  
  public final oz0 i;
  
  public final fw0 j;
  
  public volatile long k;
  
  public volatile long l;
  
  public volatile long m;
  
  public q71(uu1 paramuu1, fw0 paramfw01, long paramLong1, long paramLong2, int paramInt, l60 paraml60, boolean paramBoolean, vv1 paramvv1, oz0 paramoz0, fw0 paramfw02, long paramLong3, long paramLong4, long paramLong5) {
    this.a = paramuu1;
    this.b = paramfw01;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramInt;
    this.f = paraml60;
    this.g = paramBoolean;
    this.h = paramvv1;
    this.i = paramoz0;
    this.j = paramfw02;
    this.k = paramLong3;
    this.l = paramLong4;
    this.m = paramLong5;
  }
  
  public final q71 a(fw0 paramfw0, long paramLong1, long paramLong2, long paramLong3) {
    uu1 uu11 = this.a;
    if (!paramfw0.b())
      paramLong2 = -9223372036854775807L; 
    return new q71(uu11, paramfw0, paramLong1, paramLong2, this.e, this.f, this.g, this.h, this.i, this.j, this.k, paramLong3, paramLong1);
  }
  
  public final q71 b(l60 paraml60) {
    return new q71(this.a, this.b, this.c, this.d, this.e, paraml60, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
  }
  
  public final q71 c(vv1 paramvv1, oz0 paramoz0) {
    return new q71(this.a, this.b, this.c, this.d, this.e, this.f, this.g, paramvv1, paramoz0, this.j, this.k, this.l, this.m);
  }
  
  public final fw0 d(boolean paramBoolean, tu1 paramtu1, su1 paramsu1) {
    long l;
    uu1 uu11 = this.a;
    if (uu11.n())
      return n; 
    int j = uu11.a(paramBoolean);
    int k = (uu11.l(j, paramtu1, 0L)).g;
    fw0 fw01 = this.b;
    int i = uu11.b(fw01.a);
    if (i != -1 && j == (uu11.f(i, paramsu1, false)).c) {
      l = fw01.d;
    } else {
      l = -1L;
    } 
    return new fw0(l, uu11.k(k));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */