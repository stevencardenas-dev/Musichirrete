package in.krosbits.nativex;

public class Cn {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  private boolean ic;
  
  private double pg;
  
  public Cn(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
  }
  
  private synchronized native boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public final void a() {
    this.ic = true;
  }
  
  public final boolean b() {
    int j = this.d;
    int i = this.e;
    return c(this.a, this.b, this.c, j, i);
  }
  
  public final double d() {
    return this.pg;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\nativex\Cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */