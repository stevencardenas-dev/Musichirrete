public final class s8 extends qz1 {
  public static volatile s8 l;
  
  public static final r8 m = new r8(0);
  
  public final lx k = new lx();
  
  public static s8 Z() {
    if (l != null)
      return l; 
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{s8}} */
    try {
      if (l == null) {
        s8 s81 = new s8();
        this();
        l = s81;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{s8}} */
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */