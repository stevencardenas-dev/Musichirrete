import java.util.List;

public final class pd2 extends sd2 {
  public final transient int g;
  
  public final transient int h;
  
  public final sd2 i;
  
  public pd2(sd2 paramsd2, int paramInt1, int paramInt2) {
    super(0);
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
  
  public final Object get(int paramInt) {
    wf2.z0(paramInt, this.h);
    int i = this.g;
    return this.i.get(paramInt + i);
  }
  
  public final sd2 h(int paramInt1, int paramInt2) {
    wf2.E0(paramInt1, paramInt2, this.h);
    int i = this.g;
    return this.i.h(paramInt1 + i, paramInt2 + i);
  }
  
  public final int size() {
    return this.h;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */