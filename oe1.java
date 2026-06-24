public final class oe1 {
  public static String a(id0 paramid0) {
    String str2 = paramid0.getClass().getGenericInterfaces()[0].toString();
    String str1 = str2;
    if (str2.startsWith("kotlin.jvm.functions."))
      str1 = str2.substring(21); 
    return str1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oe1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */