import java.util.List;

public final class bh2 extends ch2 {
  public final transient int e;
  
  public final transient int f;
  
  public final ch2 g;
  
  public bh2(ch2 paramch2, int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final int d() {
    return this.g.e() + this.e + this.f;
  }
  
  public final int e() {
    return this.g.e() + this.e;
  }
  
  public final boolean g() {
    return true;
  }
  
  public final Object get(int paramInt) {
    ui0.u0(paramInt, this.f);
    int i = this.e;
    return this.g.get(paramInt + i);
  }
  
  public final Object[] h() {
    return this.g.h();
  }
  
  public final ch2 i(int paramInt1, int paramInt2) {
    ui0.z0(paramInt1, paramInt2, this.f);
    int i = this.e;
    return this.g.i(paramInt1 + i, paramInt2 + i);
  }
  
  public final int size() {
    return this.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */