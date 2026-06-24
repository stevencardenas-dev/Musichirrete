public final class a40 implements qh0 {
  public final boolean b;
  
  public a40(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final boolean a() {
    return this.b;
  }
  
  public final f21 d() {
    return null;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Empty{");
    if (this.b) {
      str = "Active";
    } else {
      str = "New";
    } 
    stringBuilder.append(str);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */