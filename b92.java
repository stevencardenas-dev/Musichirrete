import java.security.PrivilegedAction;

public final class b92 implements PrivilegedAction {
  public final String a;
  
  public final c92 b;
  
  public b92(c92 paramc92, String paramString) {
    this.b = paramc92;
    this.a = paramString;
  }
  
  public final Object run() {
    ClassLoader classLoader = this.b.c;
    String str = this.a;
    return (classLoader != null) ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */