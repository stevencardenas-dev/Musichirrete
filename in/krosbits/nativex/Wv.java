package in.krosbits.nativex;

public class Wv {
  public final int a;
  
  private boolean ic;
  
  public Wv(int paramInt) {
    this.a = paramInt;
  }
  
  private synchronized native double f(int paramInt, double[] paramArrayOfdouble, long paramLong);
  
  public final void a() {
    this.ic = true;
  }
  
  public final double b(double[] paramArrayOfdouble, long paramLong) {
    return f(this.a, paramArrayOfdouble, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\nativex\Wv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */