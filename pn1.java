import java.util.Arrays;

public final class pn1 implements Comparable {
  public boolean b;
  
  public int c = -1;
  
  public int e = -1;
  
  public int f = 0;
  
  public float g;
  
  public boolean h = false;
  
  public final float[] i = new float[9];
  
  public final float[] j = new float[9];
  
  public c9[] k = new c9[16];
  
  public int l = 0;
  
  public int m = 0;
  
  public int n;
  
  public pn1(int paramInt) {
    this.n = paramInt;
  }
  
  public final void a(c9 paramc9) {
    int i = 0;
    while (true) {
      int j = this.l;
      c9[] arrayOfC9 = this.k;
      if (i < j) {
        if (arrayOfC9[i] == paramc9)
          return; 
        i++;
        continue;
      } 
      if (j >= arrayOfC9.length)
        this.k = Arrays.<c9>copyOf(arrayOfC9, arrayOfC9.length * 2); 
      arrayOfC9 = this.k;
      i = this.l;
      arrayOfC9[i] = paramc9;
      this.l = i + 1;
      return;
    } 
  }
  
  public final void b(c9 paramc9) {
    int j = this.l;
    for (int i = 0; i < j; i++) {
      if (this.k[i] == paramc9) {
        while (i < j - 1) {
          c9[] arrayOfC9 = this.k;
          int k = i + 1;
          arrayOfC9[i] = arrayOfC9[k];
          i = k;
        } 
        this.l--;
        return;
      } 
    } 
  }
  
  public final void c() {
    this.n = 5;
    this.f = 0;
    this.c = -1;
    this.e = -1;
    this.g = 0.0F;
    this.h = false;
    int i = this.l;
    for (byte b = 0; b < i; b++)
      this.k[b] = null; 
    this.l = 0;
    this.m = 0;
    this.b = false;
    Arrays.fill(this.j, 0.0F);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    return this.c - ((pn1)paramObject).c;
  }
  
  public final void d(ln0 paramln0, float paramFloat) {
    this.g = paramFloat;
    this.h = true;
    int i = this.l;
    this.e = -1;
    for (byte b = 0; b < i; b++)
      this.k[b].h(paramln0, this, false); 
    this.l = 0;
  }
  
  public final void e(ln0 paramln0, c9 paramc9) {
    int i = this.l;
    for (byte b = 0; b < i; b++)
      this.k[b].i(paramln0, paramc9, false); 
    this.l = 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */