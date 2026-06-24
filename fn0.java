import android.view.View;

public final class fn0 {
  public f51 a;
  
  public int b;
  
  public int c;
  
  public boolean d;
  
  public boolean e;
  
  public fn0() {
    c();
  }
  
  public final void a() {
    int i;
    boolean bool = this.d;
    f51 f511 = this.a;
    if (bool) {
      i = f511.i();
    } else {
      i = f511.m();
    } 
    this.c = i;
  }
  
  public final void b(View paramView, int paramInt) {
    int i = this.a.o();
    if (i >= 0) {
      boolean bool1 = this.d;
      f51 f512 = this.a;
      if (bool1) {
        i = f512.d(paramView);
        this.c = this.a.o() + i;
      } else {
        this.c = f512.g(paramView);
      } 
      this.b = paramInt;
      return;
    } 
    this.b = paramInt;
    boolean bool = this.d;
    f51 f511 = this.a;
    if (bool) {
      paramInt = f511.i() - i - this.a.d(paramView);
      this.c = this.a.i() - paramInt;
      if (paramInt > 0) {
        int k = this.a.e(paramView);
        int j = this.c;
        i = this.a.m();
        j = j - k - Math.min(this.a.g(paramView) - i, 0) + i;
        if (j < 0) {
          i = this.c;
          this.c = Math.min(paramInt, -j) + i;
          return;
        } 
      } 
    } else {
      int j = f511.g(paramView);
      paramInt = j - this.a.m();
      this.c = j;
      if (paramInt > 0) {
        int k = this.a.e(paramView);
        int n = this.a.i();
        int m = this.a.d(paramView);
        i = this.a.i() - Math.min(0, n - i - m) - k + j;
        if (i < 0)
          this.c -= Math.min(paramInt, -i); 
      } 
    } 
  }
  
  public final void c() {
    this.b = -1;
    this.c = Integer.MIN_VALUE;
    this.d = false;
    this.e = false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mCoordinate=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mLayoutFromEnd=");
    stringBuilder.append(this.d);
    stringBuilder.append(", mValid=");
    stringBuilder.append(this.e);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */