public final class gz1 implements ky1 {
  public final Class b;
  
  public final Class c;
  
  public final jy1 e;
  
  public gz1(Class paramClass1, Class paramClass2, jy1 paramjy1) {
    this.b = paramClass1;
    this.c = paramClass2;
    this.e = paramjy1;
  }
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class clazz = paramrz1.a;
    return (clazz == this.b || clazz == this.c) ? this.e : null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Factory[type=");
    stringBuilder.append(this.c.getName());
    stringBuilder.append("+");
    stringBuilder.append(this.b.getName());
    stringBuilder.append(",adapter=");
    stringBuilder.append(this.e);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */