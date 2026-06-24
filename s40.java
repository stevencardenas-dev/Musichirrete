public class s40 implements ky1 {
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class<?> clazz2 = paramrz1.a;
    if (!Enum.class.isAssignableFrom(clazz2) || clazz2 == Enum.class)
      return null; 
    Class<?> clazz1 = clazz2;
    if (!clazz2.isEnum())
      clazz1 = clazz2.getSuperclass(); 
    return new t40(clazz1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */