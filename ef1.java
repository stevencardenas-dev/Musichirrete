import android.os.Bundle;
import android.os.Parcelable;

public final class ef1 extends xu0 implements bf1 {
  public final String a;
  
  public final String b;
  
  public final yu0 c;
  
  public boolean d;
  
  public int e;
  
  public int f;
  
  public af1 g;
  
  public int h;
  
  public final ff1 i;
  
  public ef1(ff1 paramff1, String paramString1, String paramString2, yu0 paramyu0) {
    this.i = paramff1;
    this.e = -1;
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramyu0;
  }
  
  public final int a() {
    return this.h;
  }
  
  public final void b(af1 paramaf1) {
    this.g = paramaf1;
    int i = paramaf1.e;
    paramaf1.e = i + 1;
    Bundle bundle = new Bundle();
    bundle.putString("routeId", this.a);
    bundle.putString("routeGroupId", this.b);
    bundle.putParcelable("routeControllerOptions", (Parcelable)this.c.a);
    int j = paramaf1.d;
    paramaf1.d = j + 1;
    paramaf1.b(3, j, i, null, bundle);
    this.h = i;
    if (this.d) {
      paramaf1.a(i);
      i = this.e;
      if (i >= 0) {
        paramaf1.c(this.h, i);
        this.e = -1;
      } 
      i = this.f;
      if (i != 0) {
        paramaf1.d(this.h, i);
        this.f = 0;
      } 
    } 
  }
  
  public final void c() {
    af1 af11 = this.g;
    if (af11 != null) {
      int i = this.h;
      int j = af11.d;
      af11.d = j + 1;
      af11.b(4, j, i, null, null);
      this.g = null;
      this.h = 0;
    } 
  }
  
  public final void d() {
    ff1 ff11 = this.i;
    ff11.m.remove(this);
    c();
    ff11.l();
  }
  
  public final void e() {
    this.d = true;
    af1 af11 = this.g;
    if (af11 != null)
      af11.a(this.h); 
  }
  
  public final void f(int paramInt) {
    af1 af11 = this.g;
    if (af11 != null) {
      af11.c(this.h, paramInt);
      return;
    } 
    this.e = paramInt;
    this.f = 0;
  }
  
  public final void g() {
    h(0);
  }
  
  public final void h(int paramInt) {
    this.d = false;
    af1 af11 = this.g;
    if (af11 != null) {
      int i = this.h;
      Bundle bundle = new Bundle();
      bundle.putInt("unselectReason", paramInt);
      paramInt = af11.d;
      af11.d = paramInt + 1;
      af11.b(6, paramInt, i, null, bundle);
    } 
  }
  
  public final void i(int paramInt) {
    af1 af11 = this.g;
    if (af11 != null) {
      af11.d(this.h, paramInt);
      return;
    } 
    this.f += paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ef1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */