import java.util.ArrayList;
import java.util.HashMap;

public final class h4 {
  public final ArrayList a = new ArrayList();
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public final su1 c = new su1();
  
  public g4 d;
  
  public g4 e;
  
  public g4 f;
  
  public uu1 g = uu1.a;
  
  public boolean h;
  
  public final void a(uu1 paramuu1) {
    int i = 0;
    while (true) {
      ArrayList<g4> arrayList = this.a;
      int j = arrayList.size();
      su1 su11 = this.c;
      if (i < j) {
        g4 g42 = arrayList.get(i);
        j = paramuu1.b(g42.a.a);
        if (j != -1)
          g42 = new g4((paramuu1.f(j, su11, false)).c, g42.a, paramuu1); 
        arrayList.set(i, g42);
        this.b.put(g42.a, g42);
        i++;
        continue;
      } 
      g4 g41 = this.f;
      if (g41 != null) {
        fw0 fw0 = g41.a;
        i = paramuu1.b(fw0.a);
        if (i != -1)
          g41 = new g4((paramuu1.f(i, su11, false)).c, fw0, paramuu1); 
        this.f = g41;
      } 
      this.g = paramuu1;
      this.e = this.d;
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */