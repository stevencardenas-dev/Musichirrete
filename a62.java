import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class a62 extends WindowInsetsAnimation.Callback {
  public final hd a;
  
  public List b;
  
  public ArrayList c;
  
  public final HashMap d = new HashMap<Object, Object>();
  
  public a62(hd paramhd) {
    super(0);
    this.a = paramhd;
  }
  
  public final d62 a(WindowInsetsAnimation paramWindowInsetsAnimation) {
    HashMap<WindowInsetsAnimation, d62> hashMap = this.d;
    d62 d622 = (d62)hashMap.get(paramWindowInsetsAnimation);
    d62 d621 = d622;
    if (d622 == null) {
      d621 = new d62(0, null, 0L);
      d621.a = new b62(paramWindowInsetsAnimation);
      hashMap.put(paramWindowInsetsAnimation, d621);
    } 
    return d621;
  }
  
  public final void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation) {
    this.a.h(a(paramWindowInsetsAnimation));
    this.d.remove(paramWindowInsetsAnimation);
  }
  
  public final void onPrepare(WindowInsetsAnimation paramWindowInsetsAnimation) {
    this.a.i(a(paramWindowInsetsAnimation));
  }
  
  public final WindowInsets onProgress(WindowInsets paramWindowInsets, List<WindowInsetsAnimation> paramList) {
    ArrayList<?> arrayList = this.c;
    if (arrayList == null) {
      arrayList = new ArrayList(paramList.size());
      this.c = arrayList;
      this.b = Collections.unmodifiableList(arrayList);
    } else {
      arrayList.clear();
    } 
    for (int i = paramList.size() - 1; i >= 0; i--) {
      WindowInsetsAnimation windowInsetsAnimation = paramList.get(i);
      d62 d62 = a(windowInsetsAnimation);
      float f = windowInsetsAnimation.getFraction();
      d62.a.e(f);
      this.c.add(d62);
    } 
    x62 x62 = x62.h(null, paramWindowInsets);
    List list = this.b;
    return this.a.j(x62, list).g();
  }
  
  public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation paramWindowInsetsAnimation, WindowInsetsAnimation.Bounds paramBounds) {
    d62 d62 = a(paramWindowInsetsAnimation);
    j01 j012 = new j01(paramBounds);
    j01 j011 = this.a.k(d62, j012);
    j011.getClass();
    z52.c();
    return z52.a(((fi0)j011.c).e(), ((fi0)j011.e).e());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */