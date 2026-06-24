public final class q02 extends r02 {
  public final Object a(Class paramClass) {
    StringBuilder stringBuilder = new StringBuilder("Cannot allocate ");
    stringBuilder.append(paramClass);
    stringBuilder.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */