import java.util.List;

public final class hm2 extends im2 {
  public final transient int g;
  
  public final transient int h;
  
  public final im2 i;
  
  public hm2(im2 paramim2, int paramInt1, int paramInt2) {
    super(1);
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public final Object[] c() {
    return this.i.c();
  }
  
  public final int d() {
    return this.i.d() + this.g;
  }
  
  public final int e() {
    return this.i.d() + this.g + this.h;
  }
  
  public final im2 g(int paramInt1, int paramInt2) {
    wf2.C0(paramInt1, paramInt2, this.h);
    int i = this.g;
    return this.i.g(paramInt1 + i, paramInt2 + i);
  }
  
  public final Object get(int paramInt) {
    wf2.y0(paramInt, this.h);
    int i = this.g;
    return this.i.get(paramInt + i);
  }
  
  public final int size() {
    return this.h;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */