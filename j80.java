public final class j80 implements Comparable {
  public int b;
  
  public int c;
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = this.c;
    int j = ((j80)paramObject).c;
    return (i != j) ? (i - j) : (this.b - ((j80)paramObject).b);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Order{order=");
    stringBuilder.append(this.c);
    stringBuilder.append(", index=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */