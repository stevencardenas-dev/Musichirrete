import android.os.Bundle;
import android.os.Parcelable;

public final class df1 extends wu0 implements bf1 {
  public final String f;
  
  public final yu0 g;
  
  public boolean h;
  
  public int i = -1;
  
  public int j;
  
  public af1 k;
  
  public int l = -1;
  
  public final ff1 m;
  
  public df1(ff1 paramff1, String paramString, yu0 paramyu0) {
    this.f = paramString;
    this.g = paramyu0;
  }
  
  public final int a() {
    return this.l;
  }
  
  public final void b(af1 paramaf1) {
    cf1 cf1 = new cf1(this);
    this.k = paramaf1;
    int j = paramaf1.e;
    paramaf1.e = j + 1;
    int i = paramaf1.d;
    paramaf1.d = i + 1;
    Bundle bundle = new Bundle();
    bundle.putString("memberRouteId", this.f);
    bundle.putParcelable("routeControllerOptions", (Parcelable)this.g.a);
    paramaf1.b(11, i, j, null, bundle);
    paramaf1.h.put(i, cf1);
    this.l = j;
    if (this.h) {
      paramaf1.a(j);
      i = this.i;
      if (i >= 0) {
        paramaf1.c(this.l, i);
        this.i = -1;
      } 
      i = this.j;
      if (i != 0) {
        paramaf1.d(this.l, i);
        this.j = 0;
      } 
    } 
  }
  
  public final void c() {
    af1 af11 = this.k;
    if (af11 != null) {
      int i = this.l;
      int j = af11.d;
      af11.d = j + 1;
      af11.b(4, j, i, null, null);
      this.k = null;
      this.l = 0;
    } 
  }
  
  public final void d() {
    ff1 ff11 = this.m;
    ff11.m.remove(this);
    c();
    ff11.l();
  }
  
  public final void e() {
    this.h = true;
    af1 af11 = this.k;
    if (af11 != null)
      af11.a(this.l); 
  }
  
  public final void f(int paramInt) {
    af1 af11 = this.k;
    if (af11 != null) {
      af11.c(this.l, paramInt);
      return;
    } 
    this.i = paramInt;
    this.j = 0;
  }
  
  public final void g() {
    h(0);
  }
  
  public final void h(int paramInt) {
    this.h = false;
    af1 af11 = this.k;
    if (af11 != null) {
      int i = this.l;
      Bundle bundle = new Bundle();
      bundle.putInt("unselectReason", paramInt);
      paramInt = af11.d;
      af11.d = paramInt + 1;
      af11.b(6, paramInt, i, null, bundle);
    } 
  }
  
  public final void i(int paramInt) {
    af1 af11 = this.k;
    if (af11 != null) {
      af11.d(this.l, paramInt);
      return;
    } 
    this.j += paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\df1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */