package j$.time.format;

public final class m implements g {
  public final String a;
  
  public m(String paramString) {
    this.a = paramString;
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    paramStringBuilder.append(this.a);
    return true;
  }
  
  public final String toString() {
    String str = this.a.replace("'", "''");
    StringBuilder stringBuilder = new StringBuilder("'");
    stringBuilder.append(str);
    stringBuilder.append("'");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */