public final class fz1 implements ky1 {
  public final int b;
  
  public final Class c;
  
  public final jy1 e;
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class<?> clazz;
    int i = this.b;
    lm lm = null;
    parammy = null;
    Class clazz1 = this.c;
    switch (i) {
      default:
        clazz = paramrz1.a;
        if (clazz1.isAssignableFrom(clazz))
          jy11 = new lm(this, clazz); 
        return jy11;
      case 0:
        break;
    } 
    jy1 jy11 = lm;
    if (((rz1)clazz).a == clazz1)
      jy11 = this.e; 
    return jy11;
  }
  
  public final String toString() {
    int i = this.b;
    jy1 jy11 = this.e;
    Class clazz = this.c;
    switch (i) {
      default:
        stringBuilder = new StringBuilder("Factory[typeHierarchy=");
        stringBuilder.append(clazz.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(jy11);
        stringBuilder.append("]");
        return stringBuilder.toString();
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("Factory[type=");
    stringBuilder.append(clazz.getName());
    stringBuilder.append(",adapter=");
    stringBuilder.append(jy11);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */