public final class bn {
  public final int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public final cn j;
  
  public bn(cn paramcn, int paramInt1, int paramInt2) {
    this.j = paramcn;
    this.a = paramInt1;
    this.b = paramInt2;
    a();
  }
  
  public final void a() {
    cn cn1 = this.j;
    int[] arrayOfInt1 = (int[])cn1.c;
    int[] arrayOfInt2 = (int[])cn1.e;
    int i2 = Integer.MAX_VALUE;
    int i = this.a;
    int n = Integer.MIN_VALUE;
    int j = Integer.MIN_VALUE;
    int i1 = 0;
    int m = Integer.MAX_VALUE;
    int k = Integer.MAX_VALUE;
    int i3 = j;
    while (i <= this.b) {
      int i4 = arrayOfInt1[i];
      int i7 = i1 + arrayOfInt2[i4];
      int i5 = i4 >> 10 & 0x1F;
      int i6 = i4 >> 5 & 0x1F;
      i4 &= 0x1F;
      i1 = i3;
      if (i5 > i3)
        i1 = i5; 
      i3 = i2;
      if (i5 < i2)
        i3 = i5; 
      i5 = n;
      if (i6 > n)
        i5 = i6; 
      n = m;
      if (i6 < m)
        n = i6; 
      i6 = j;
      if (i4 > j)
        i6 = i4; 
      j = k;
      if (i4 < k)
        j = i4; 
      i++;
      i2 = i3;
      m = n;
      k = j;
      i3 = i1;
      n = i5;
      j = i6;
      i1 = i7;
    } 
    this.d = i2;
    this.e = i3;
    this.f = m;
    this.g = n;
    this.h = k;
    this.i = j;
    this.c = i1;
  }
  
  public final int b() {
    int m = this.e;
    int i = this.d;
    int j = this.g;
    int k = this.f;
    return (this.i - this.h + 1) * (j - k + 1) * (m - i + 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */