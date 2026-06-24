import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class gw2 {
  public static final gw2 c = new gw2();
  
  public final gh1 a = new gh1(2);
  
  public final ConcurrentHashMap b = new ConcurrentHashMap<Object, Object>();
  
  public final jw2 a(Class<?> paramClass) {
    Charset charset = vv2.a;
    charset = null;
    if (paramClass != null) {
      iw2 iw2;
      ConcurrentHashMap<Class<?>, jw2> concurrentHashMap = this.b;
      jw2 jw2 = (jw2)concurrentHashMap.get(paramClass);
      if (jw2 == null) {
        int i;
        ew2 ew2;
        gh1 gh11 = this.a;
        gh11.getClass();
        zb0 zb0 = kw2.a;
        if (!pv2.class.isAssignableFrom(paramClass))
          i = ev2.a; 
        iw2 = ((a42)gh11.c).c(paramClass);
        if ((iw2.d & 0x2) == 2) {
          i = 1;
        } else {
          i = 0;
        } 
        if (!i) {
          eg2 eg2;
          i = ev2.a;
          i = fw2.a;
          i = xv2.a;
          zb0 zb01 = kw2.a;
          if (iw2.a() - 1 != 1)
            eg2 = kv2.a; 
          i = aw2.a;
          dw2 dw2 = dw2.l(iw2, zb01, eg2);
        } else {
          i = ev2.a;
          zb0 zb01 = kw2.a;
          eg2 eg2 = kv2.a;
          ew2 = new ew2(zb01, iw2.a);
        } 
        jw2 jw21 = concurrentHashMap.putIfAbsent(paramClass, ew2);
        return (jw21 != null) ? jw21 : ew2;
      } 
      return (jw2)iw2;
    } 
    k91.h("messageType");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gw2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */