public final class iw2 {
  public final av2 a;
  
  public final String b;
  
  public final Object[] c;
  
  public final int d;
  
  public iw2(av2 paramav2, String paramString, Object[] paramArrayOfObject) {
    this.a = paramav2;
    this.b = paramString;
    this.c = paramArrayOfObject;
    char c = paramString.charAt(0);
    if (c < '?') {
      this.d = c;
      return;
    } 
    int i = c & 0x1FFF;
    byte b = 1;
    c = '\r';
    while (true) {
      char c1 = paramString.charAt(b);
      if (c1 >= '?') {
        i |= (c1 & 0x1FFF) << c;
        c += '\r';
        b++;
        continue;
      } 
      this.d = i | c1 << c;
      return;
    } 
  }
  
  public final int a() {
    int i = this.d;
    return ((i & 0x1) != 0) ? 1 : (((i & 0x4) == 4) ? 3 : 2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iw2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */