public final class eo1 implements Cloneable {
  public int[] b;
  
  public Object[] c;
  
  public int e;
  
  public eo1() {
    int j;
    int i = 4;
    while (true) {
      j = 40;
      if (i < 32) {
        j = (1 << i) - 12;
        if (40 <= j)
          break; 
        i++;
        continue;
      } 
      break;
    } 
    i = j / 4;
    this.b = new int[i];
    this.c = new Object[i];
  }
  
  public final Object clone() {
    Object object = super.clone();
    object.getClass();
    object = object;
    ((eo1)object).b = (int[])this.b.clone();
    ((eo1)object).c = (Object[])this.c.clone();
    return object;
  }
  
  public final String toString() {
    int i = this.e;
    if (i <= 0)
      return "{}"; 
    StringBuilder stringBuilder = new StringBuilder(i * 28);
    stringBuilder.append('{');
    int j = this.e;
    for (i = 0; i < j; i++) {
      if (i > 0)
        stringBuilder.append(", "); 
      stringBuilder.append(this.b[i]);
      stringBuilder.append('=');
      Object object = this.c[i];
      if (object != this) {
        stringBuilder.append(object);
      } else {
        stringBuilder.append("(this Map)");
      } 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */