public final class dm2 {
  public final yj2 a;
  
  public final String b;
  
  public final Object[] c;
  
  public final int d;
  
  public dm2(yj2 paramyj2, String paramString, Object[] paramArrayOfObject) {
    this.a = paramyj2;
    this.b = paramString;
    this.c = paramArrayOfObject;
    char c = paramString.charAt(0);
    if (c < '?') {
      this.d = c;
      return;
    } 
    int i = c & 0x1FFF;
    c = '\001';
    byte b = 13;
    while (true) {
      char c1 = paramString.charAt(c);
      if (c1 >= '?') {
        i |= (c1 & 0x1FFF) << b;
        b += 13;
        c++;
        continue;
      } 
      this.d = i | c1 << b;
      return;
    } 
  }
  
  public final int a() {
    int i = this.d;
    return ((i & 0x1) != 0) ? 1 : (((i & 0x4) == 4) ? 3 : 2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */