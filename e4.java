public abstract class e4 implements a4 {
  public String a;
  
  public String b;
  
  public final String f() {
    return this.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append("(");
    stringBuilder.append(this.a);
    stringBuilder.append("|");
    return x41.n(stringBuilder, this.b, ")");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */