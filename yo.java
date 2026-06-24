public abstract class yo {
  public static final Class a;
  
  static {
    String str = System.getProperty("ConcatenationKeyDerivationFunctionWithSha256");
    if (str != null)
      try {
        Class<?> clazz = Class.forName(str);
        a = clazz;
        xo xo = (xo)clazz.newInstance();
        byte[] arrayOfByte = new byte[8];
        return;
      } finally {
        str = null;
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */