public final class jn0 {
  public int a;
  
  public int b;
  
  public float c;
  
  public boolean d;
  
  public int[] e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public float n;
  
  public int o;
  
  public int p;
  
  public boolean q;
  
  public int r;
  
  public Integer s;
  
  public int t;
  
  public float u;
  
  public boolean v;
  
  public boolean w;
  
  public final int a() {
    return this.d ? (int)(this.a * this.c) : this.b;
  }
  
  public final int b() {
    return !this.w ? a() : (this.v ? (int)(this.a * this.u) : this.t);
  }
  
  public final boolean c(boolean paramBoolean) {
    return (this.l > 0 && ((!paramBoolean && this.k > 0) || (paramBoolean && this.j > 0)));
  }
  
  public final void d() {
    if (this.i >= 0) {
      if (this.r >= 0) {
        if (this.o == 0)
          if ((a() <= 0 && (!this.w || b() <= 0)) || this.i != 0) {
            if (this.e.length < 3) {
              l0.l("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
              return;
            } 
          } else {
            l0.l("Rounded corners without gap are not supported in contiguous indeterminate animation.");
          }  
        return;
      } 
      l0.l("Stop indicator size must be >= 0.");
      return;
    } 
    l0.l("indicatorTrackGapSize must be >= 0.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */