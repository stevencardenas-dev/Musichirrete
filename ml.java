import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ml {
  public final HashMap a;
  
  public final HashMap b;
  
  public ml(HashMap paramHashMap) {
    this.b = paramHashMap;
    this.a = new HashMap<Object, Object>();
    for (Map.Entry entry : paramHashMap.entrySet()) {
      om0 om0 = (om0)entry.getValue();
      List<nl> list2 = (List)this.a.get(om0);
      List<nl> list1 = list2;
      if (list2 == null) {
        list1 = new ArrayList();
        this.a.put(om0, list1);
      } 
      list1.add((nl)entry.getKey());
    } 
  }
  
  public static void a(List<nl> paramList, um0 paramum0, om0 paramom0, sm0 paramsm0) {
    if (paramList != null) {
      int i = paramList.size() - 1;
      while (i >= 0) {
        nl nl = paramList.get(i);
        Method method = nl.b;
        try {
          int j = nl.a;
          if (j != 0) {
            if (j != 1) {
              if (j == 2)
                method.invoke(paramsm0, new Object[] { paramum0, paramom0 }); 
            } else {
              method.invoke(paramsm0, new Object[] { paramum0 });
            } 
          } else {
            method.invoke(paramsm0, null);
          } 
          i--;
        } catch (InvocationTargetException invocationTargetException) {
          k91.m("Failed to call observer method", invocationTargetException.getCause());
          break;
        } catch (IllegalAccessException illegalAccessException) {
          k91.n(illegalAccessException);
          return;
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */