public final class u2 {
  public int a;
  
  public int b;
  
  public Object c;
  
  public int d;
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof u2))
        return false; 
      u2 u21 = (u2)paramObject;
      int i = this.a;
      if (i != u21.a)
        return false; 
      if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != u21.b || this.b != u21.d) {
        if (this.d != u21.d || this.b != u21.b)
          return false; 
        paramObject = this.c;
        Object object = u21.c;
        if ((paramObject != null) ? !paramObject.equals(object) : (object != null))
          return false; 
      } 
    } 
    return true;
  }
  
  public final int hashCode() {
    return (this.a * 31 + this.b) * 31 + this.d;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("[");
    int i = this.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i != 8) {
            str = "??";
          } else {
            str = "mv";
          } 
        } else {
          str = "up";
        } 
      } else {
        str = "rm";
      } 
    } else {
      str = "add";
    } 
    stringBuilder.append(str);
    stringBuilder.append(",s:");
    stringBuilder.append(this.b);
    stringBuilder.append("c:");
    stringBuilder.append(this.d);
    stringBuilder.append(",p:");
    stringBuilder.append(this.c);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */