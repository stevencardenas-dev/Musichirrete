public class so0 extends g32 {
  public static final nb0 c = new nb0(1);
  
  public final eo1 b = new eo1();
  
  public final void d() {
    eo1 eo11 = this.b;
    int i = eo11.e;
    Object[] arrayOfObject = eo11.c;
    if (i <= 0) {
      for (byte b = 0; b < i; b++)
        arrayOfObject[b] = null; 
      eo11.e = 0;
      return;
    } 
    throw x41.f(arrayOfObject[0]);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\so0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */