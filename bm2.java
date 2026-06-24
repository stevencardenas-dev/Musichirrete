import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class bm2 {
  public static final bm2 c = new bm2();
  
  public final gh1 a = new gh1(1);
  
  public final ConcurrentHashMap b = new ConcurrentHashMap<Object, Object>();
  
  public final em2 a(Class<?> paramClass) {
    Charset charset = il2.a;
    charset = null;
    if (paramClass != null) {
      dm2 dm2;
      ConcurrentHashMap<Class<?>, em2> concurrentHashMap = this.b;
      em2 em2 = (em2)concurrentHashMap.get(paramClass);
      if (em2 == null) {
        int i;
        yl2 yl2;
        gh1 gh11 = this.a;
        gh11.getClass();
        bg2 bg2 = fm2.a;
        if (!wk2.class.isAssignableFrom(paramClass))
          i = ak2.a; 
        dm2 = ((a42)gh11.c).b(paramClass);
        if ((dm2.d & 0x2) == 2) {
          i = 1;
        } else {
          i = 0;
        } 
        if (!i) {
          bg2 bg21;
          i = ak2.a;
          i = am2.a;
          i = ql2.a;
          bg2 bg22 = fm2.a;
          if (dm2.a() - 1 != 1)
            bg21 = ok2.a; 
          i = tl2.a;
          xl2 xl2 = xl2.u(dm2, bg22, bg21);
        } else {
          i = ak2.a;
          bg2 bg22 = fm2.a;
          bg2 bg21 = ok2.a;
          yl2 = new yl2(bg22, dm2.a);
        } 
        em2 em21 = concurrentHashMap.putIfAbsent(paramClass, yl2);
        return (em21 != null) ? em21 : yl2;
      } 
      return (em2)dm2;
    } 
    k91.h("messageType");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */