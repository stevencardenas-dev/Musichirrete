public final class jd2 extends Exception {
  public final sp b;
  
  public jd2(sp paramsp) {
    boolean bool;
    if (paramsp.c != 0 && paramsp.e != null) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.g("ResolvableConnectionException can only be created with a connection result containing a resolution.", bool);
    this.b = paramsp;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */