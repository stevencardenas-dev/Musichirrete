import java.util.Iterator;

public abstract class g32 {
  public final h32 a = new h32();
  
  public final void a(String paramString, AutoCloseable paramAutoCloseable) {
    h32 h321 = this.a;
    if (h321 != null) {
      if (h321.d) {
        h32.a(paramAutoCloseable);
        return;
      } 
      synchronized (h321.a) {
        AutoCloseable autoCloseable = h321.b.put(paramString, paramAutoCloseable);
        h32.a(autoCloseable);
        return;
      } 
    } 
  }
  
  public final void b() {
    h32 h321 = this.a;
    if (h321 != null && !h321.d) {
      h321.d = true;
      zb0 zb0 = h321.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{zb0}, name=null} */
      try {
        Iterator<AutoCloseable> iterator1 = h321.b.values().iterator();
        while (iterator1.hasNext())
          h32.a(iterator1.next()); 
      } finally {}
      Iterator<AutoCloseable> iterator = h321.c.iterator();
      while (iterator.hasNext())
        h32.a(iterator.next()); 
      h321.c.clear();
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zb0}, name=null} */
    } 
    d();
  }
  
  public final AutoCloseable c(String paramString) {
    h32 h321 = this.a;
    if (h321 != null)
      synchronized (h321.a) {
        return (AutoCloseable)h321.b.get(paramString);
      }  
    return null;
  }
  
  public void d() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */