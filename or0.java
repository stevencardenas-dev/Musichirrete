import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class or0 extends qz1 {
  public static Object Z(LinkedHashMap paramLinkedHashMap, Object paramObject) {
    paramLinkedHashMap.getClass();
    Object object = paramLinkedHashMap.get(paramObject);
    if (object != null || paramLinkedHashMap.containsKey(paramObject))
      return object; 
    StringBuilder stringBuilder = new StringBuilder("Key ");
    stringBuilder.append(paramObject);
    stringBuilder.append(" is missing in the map.");
    throw new NoSuchElementException(stringBuilder.toString());
  }
  
  public static int a0(int paramInt) {
    return (paramInt < 0) ? paramInt : ((paramInt < 3) ? (paramInt + 1) : ((paramInt < 1073741824) ? (int)(paramInt / 0.75F + 1.0F) : Integer.MAX_VALUE));
  }
  
  public static Map b0(ArrayList<Object> paramArrayList) {
    int i = paramArrayList.size();
    if (i != 0) {
      byte b = 0;
      if (i != 1) {
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(a0(paramArrayList.size()));
        i = paramArrayList.size();
        while (b < i) {
          t51 t511 = (t51)paramArrayList.get(b);
          b++;
          t511 = t511;
          linkedHashMap.put(t511.b, t511.c);
        } 
        return linkedHashMap;
      } 
      t51 t51 = (t51)paramArrayList.get(0);
      t51.getClass();
      Map<Object, Object> map = Collections.singletonMap(t51.b, t51.c);
      map.getClass();
      return map;
    } 
    return e40.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\or0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */