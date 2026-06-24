import java.util.ArrayList;
import java.util.HashSet;

public final class ib1 {
  public ch2 a;
  
  public void a(ArrayList<Object> paramArrayList) {
    if (!paramArrayList.isEmpty()) {
      HashSet<String> hashSet = new HashSet();
      int j = paramArrayList.size();
      int i = 0;
      while (i < j) {
        jb1 jb1 = (jb1)paramArrayList.get(i);
        int k = i + 1;
        jb1 = jb1;
        i = k;
        if (!"play_pass_subs".equals(jb1.b)) {
          hashSet.add(jb1.b);
          i = k;
        } 
      } 
      if (hashSet.size() <= 1) {
        this.a = ch2.k(paramArrayList);
        return;
      } 
      l0.l("All products should be of the same product type.");
      return;
    } 
    l0.l("Product list cannot be empty.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ib1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */