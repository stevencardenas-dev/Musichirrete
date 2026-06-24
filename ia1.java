import android.util.SparseArray;
import java.util.HashMap;

public abstract class ia1 {
  public static final SparseArray a = new SparseArray();
  
  public static final HashMap b;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b = hashMap;
    hashMap.put(fa1.b, Integer.valueOf(0));
    hashMap.put(fa1.c, Integer.valueOf(1));
    hashMap.put(fa1.e, Integer.valueOf(2));
    for (fa1 fa1 : hashMap.keySet())
      a.append(((Integer)b.get(fa1)).intValue(), fa1); 
  }
  
  public static int a(fa1 paramfa1) {
    Integer integer = (Integer)b.get(paramfa1);
    if (integer != null)
      return integer.intValue(); 
    m60.o("PriorityMapping is missing known Priority value ", paramfa1);
    return 0;
  }
  
  public static fa1 b(int paramInt) {
    fa1 fa1 = (fa1)a.get(paramInt);
    if (fa1 != null)
      return fa1; 
    l0.l(ga1.i("Unknown Priority for value ", paramInt));
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ia1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */