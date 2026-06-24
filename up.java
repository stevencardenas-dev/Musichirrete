public final class up {
  public boolean a;
  
  public boolean b;
  
  public Object c;
  
  public Object d;
  
  public up(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public void a(gl... paramVarArgs) {
    boolean bool = this.a;
    if (bool) {
      int i = paramVarArgs.length;
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < paramVarArgs.length; b++)
        arrayOfString[b] = (paramVarArgs[b]).a; 
      if (bool) {
        if (i != 0) {
          this.c = arrayOfString.clone();
          return;
        } 
        l0.l("At least one cipher suite is required");
        return;
      } 
      tp.f("no cipher suites for cleartext connections");
      return;
    } 
    tp.f("no cipher suites for cleartext connections");
  }
  
  public void b(av1... paramVarArgs) {
    boolean bool = this.a;
    if (bool) {
      int i = paramVarArgs.length;
      String[] arrayOfString = new String[i];
      for (byte b = 0; b < paramVarArgs.length; b++)
        arrayOfString[b] = (paramVarArgs[b]).b; 
      if (bool) {
        if (i != 0) {
          this.d = arrayOfString.clone();
          return;
        } 
        l0.l("At least one TLS version is required");
        return;
      } 
      tp.f("no TLS versions for cleartext connections");
      return;
    } 
    tp.f("no TLS versions for cleartext connections");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\up.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */