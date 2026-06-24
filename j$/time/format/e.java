package j$.time.format;

public final class e implements g {
  public final char a;
  
  public e(char paramChar) {
    this.a = paramChar;
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    paramStringBuilder.append(this.a);
    return true;
  }
  
  public final String toString() {
    char c = this.a;
    if (c == '\'')
      return "''"; 
    StringBuilder stringBuilder = new StringBuilder("'");
    stringBuilder.append(c);
    stringBuilder.append("'");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */