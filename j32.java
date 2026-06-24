public interface j32 {
  default g32 a(Class paramClass) {
    throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
  }
  
  default g32 g(Class paramClass, uz0 paramuz0) {
    return a(paramClass);
  }
  
  default g32 l(ll paramll, uz0 paramuz0) {
    Class clazz = paramll.a;
    clazz.getClass();
    return g(clazz, paramuz0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */