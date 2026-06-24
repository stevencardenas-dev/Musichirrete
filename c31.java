public final class c31 extends jy1 {
  public static final b31 b = new b31(new c31(2), 0);
  
  public final int a;
  
  public c31(int paramInt) {
    this.a = paramInt;
  }
  
  public final Object b(tk0 paramtk0) {
    String str;
    int i = paramtk0.C();
    int j = x41.y(i);
    if (j != 5 && j != 6) {
      if (j == 8) {
        paramtk0.y();
        return null;
      } 
      String str1 = x41.z(i);
      str = paramtk0.m(false);
      StringBuilder stringBuilder = new StringBuilder("Expecting number, got: ");
      stringBuilder.append(str1);
      stringBuilder.append("; at path ");
      stringBuilder.append(str);
      throw new RuntimeException(stringBuilder.toString());
    } 
    return ga1.b(this.a, (tk0)str);
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramcl0.v((Number)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */