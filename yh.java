import java.io.Serializable;

public abstract class yh implements el0, Serializable {
  public transient el0 b;
  
  public final Object c;
  
  public final Class e;
  
  public final String f;
  
  public final String g;
  
  public final boolean h;
  
  public yh(Object paramObject, Class paramClass, String paramString1, String paramString2, boolean paramBoolean) {
    this.c = paramObject;
    this.e = paramClass;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramBoolean;
  }
  
  public abstract el0 d();
  
  public final kl e() {
    boolean bool = this.h;
    Class clazz = this.e;
    if (bool) {
      ne1.a.getClass();
      return new o51(clazz);
    } 
    return ne1.a(clazz);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */