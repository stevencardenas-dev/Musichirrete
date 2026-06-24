public final class bf {
  public static final byte[] e = new byte[1792];
  
  public final String a;
  
  public final int b;
  
  public int c;
  
  public char d;
  
  static {
    for (byte b = 0; b < '܀'; b++)
      e[b] = Character.getDirectionality(b); 
  }
  
  public bf(String paramString) {
    this.a = paramString;
    this.b = paramString.length();
  }
  
  public final byte a() {
    byte b;
    int i = this.c;
    String str = this.a;
    char c = str.charAt(i - 1);
    this.d = c;
    boolean bool = Character.isLowSurrogate(c);
    i = this.c;
    if (bool) {
      i = Character.codePointBefore(str, i);
      this.c -= Character.charCount(i);
      return Character.getDirectionality(i);
    } 
    this.c = i - 1;
    c = this.d;
    if (c < '܀') {
      b = e[c];
    } else {
      b = Character.getDirectionality(c);
    } 
    return b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */