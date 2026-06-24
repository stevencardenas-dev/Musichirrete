import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;

public final class ij implements Comparator {
  public static final ij c = new ij(0);
  
  public static final ij e = new ij(1);
  
  public final int b;
  
  public final int compare(Object paramObject1, Object paramObject2) {
    float f1;
    float f2;
    byte b1;
    RecyclerView recyclerView;
    View view;
    int j = this.b;
    null = 1;
    byte b2 = 1;
    int i = 1;
    switch (j) {
      default:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        return ((p32)paramObject1).b - ((p32)paramObject2).b;
      case 13:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        return paramObject1.getTop() - paramObject2.getTop();
      case 12:
        return ws2.l(((et1)paramObject1).a, ((et1)paramObject2).a);
      case 11:
        return ws2.l(((ct1)paramObject1).a, ((ct1)paramObject2).a);
      case 10:
        return ws2.l((Integer)((Map.Entry)paramObject1).getKey(), (Integer)((Map.Entry)paramObject2).getKey());
      case 9:
        return ws2.l((Integer)((Map.Entry)paramObject1).getKey(), (Integer)((Map.Entry)paramObject2).getKey());
      case 8:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        return ((pn1)paramObject1).c - ((pn1)paramObject2).c;
      case 7:
        return ((Comparable<Comparable>)paramObject1).compareTo((Comparable)paramObject2);
      case 6:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        recyclerView = ((qd0)paramObject1).d;
        if (recyclerView == null) {
          null = 1;
        } else {
          null = 0;
        } 
        if (((qd0)paramObject2).d == null) {
          b2 = 1;
        } else {
          b2 = 0;
        } 
        if (null != b2) {
          if (recyclerView == null)
            return i; 
        } else {
          boolean bool = ((qd0)paramObject1).a;
          if (bool != ((qd0)paramObject2).a) {
            null = i;
            if (bool)
              return -1; 
          } else {
            null = ((qd0)paramObject2).b - ((qd0)paramObject1).b;
            if (null == 0) {
              null = ((qd0)paramObject1).c - ((qd0)paramObject2).c;
              if (null == 0)
                null = 0; 
            } 
          } 
          return null;
        } 
        return -1;
      case 5:
        paramObject1 = paramObject1;
        view = (View)paramObject2;
        paramObject2 = v22.a;
        f1 = paramObject1.getZ();
        f2 = view.getZ();
        if (f1 > f2) {
          b1 = -1;
        } else if (f1 >= f2) {
          b1 = 0;
        } 
        return b1;
      case 4:
        paramObject1 = paramObject1;
        return ((bn)paramObject2).b() - paramObject1.b();
      case 3:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        i = Math.min(paramObject1.length(), paramObject2.length());
        b1 = 4;
        while (b1 < i) {
          char c = paramObject1.charAt(b1);
          j = paramObject2.charAt(b1);
          if (c != j) {
            b1 = b2;
            if (c < j)
              return -1; 
          } else {
            b1++;
            continue;
          } 
          return b1;
        } 
        i = paramObject1.length();
        j = paramObject2.length();
        if (i != j) {
          b1 = b2;
          if (i < j)
            return -1; 
        } else {
          b1 = 0;
        } 
        return b1;
      case 2:
        paramObject1 = paramObject1;
        return ((la0)paramObject2).g - ((la0)paramObject1).g;
      case 1:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        return ((hv0)paramObject1).d.compareToIgnoreCase(((hv0)paramObject2).d);
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    return ((hv0)paramObject1).d.compareToIgnoreCase(((hv0)paramObject2).d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */