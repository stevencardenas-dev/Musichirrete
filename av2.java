import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class av2 {
  public transient int zza;
  
  public static void c(ArrayList<Charset> paramArrayList, List<Charset> paramList) {
    Charset charset = vv2.a;
    int i = paramArrayList.size();
    if (paramList instanceof ArrayList) {
      ((ArrayList)paramList).ensureCapacity(paramList.size() + i);
    } else if (paramList instanceof hw2) {
      hw2 hw2 = (hw2)paramList;
      int m = hw2.e + i;
      i = hw2.c.length;
      if (m > i)
        if (i != 0) {
          while (i < m)
            i = ga1.h(i, 3, 2, 1, 10); 
          hw2.c = Arrays.copyOf(hw2.c, i);
        } else {
          hw2.c = new Object[Math.max(m, 10)];
        }  
    } 
    int j = paramList.size();
    int k = paramArrayList.size();
    for (i = 0; i < k; i++) {
      charset = paramArrayList.get(i);
      if (charset == null) {
        i = paramList.size() - j;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 26);
        stringBuilder.append("Element at index ");
        stringBuilder.append(i);
        stringBuilder.append(" is null.");
        String str = stringBuilder.toString();
        i = paramList.size();
        while (--i >= j)
          paramList.remove(i); 
        k91.h(str);
        return;
      } 
      paramList.add(charset);
    } 
  }
  
  public abstract int a();
  
  public abstract int b(jw2 paramjw2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\av2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */