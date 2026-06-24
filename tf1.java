public final class tf1 {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public tf1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof tf1) {
      paramObject = paramObject;
      if (this.a == ((tf1)paramObject).a && this.b == ((tf1)paramObject).b && this.c == ((tf1)paramObject).c && this.d == ((tf1)paramObject).d)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
  }
  
  public final String toString() {
    String[] arrayOfString;
    int j = this.a;
    int k = this.b;
    int i = this.c;
    int m = this.d;
    byte b = 0;
    if ("a;b;c;d".length() == 0) {
      arrayOfString = new String[0];
    } else {
      arrayOfString = "a;b;c;d".split(";");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(tf1.class.getSimpleName());
    stringBuilder.append("[");
    while (b < arrayOfString.length) {
      stringBuilder.append(arrayOfString[b]);
      stringBuilder.append("=");
      (new Object[4])[0] = Integer.valueOf(j);
      (new Object[4])[1] = Integer.valueOf(k);
      (new Object[4])[2] = Integer.valueOf(i);
      (new Object[4])[3] = Integer.valueOf(m);
      stringBuilder.append((new Object[4])[b]);
      if (b != arrayOfString.length - 1)
        stringBuilder.append(", "); 
      b++;
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */