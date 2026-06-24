import android.util.Log;
import in.krosbits.utils.SgV.zpEN;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class c4 {
  public final LinkedHashMap a = new LinkedHashMap<Object, Object>();
  
  public c4(int paramInt) {}
  
  public void a(qx0 paramqx0) {
    paramqx0.getClass();
    int i = paramqx0.a;
    int j = paramqx0.b;
    Integer integer = Integer.valueOf(i);
    LinkedHashMap<Integer, Object<Object, Object>> linkedHashMap = this.a;
    Object<Object, Object> object2 = (Object<Object, Object>)linkedHashMap.get(integer);
    Object<Object, Object> object1 = object2;
    if (object2 == null) {
      object1 = (Object<Object, Object>)new TreeMap<Object, Object>();
      linkedHashMap.put(integer, object1);
    } 
    object1 = object1;
    if (object1.containsKey(Integer.valueOf(j))) {
      object2 = (Object<Object, Object>)new StringBuilder("Overriding migration ");
      object2.append(object1.get(Integer.valueOf(j)));
      object2.append(" with ");
      object2.append(paramqx0);
      object2 = (Object<Object, Object>)object2.toString();
      Log.w(zpEN.bwutgzIpy, (String)object2);
    } 
    object1.put(Integer.valueOf(j), paramqx0);
  }
  
  public a4 b(String paramString) {
    a4 a4 = (a4)this.a.get(paramString);
    if (a4 != null)
      return a4; 
    throw new Exception("");
  }
  
  public void c(HashMap paramHashMap) {
    paramHashMap.getClass();
    for (Object object1 : paramHashMap.entrySet()) {
      String str = (String)object1.getKey();
      Object object2 = object1.getValue();
      str.getClass();
      if (object2 == null) {
        object1 = null;
      } else {
        ll ll = ne1.a(object2.getClass());
        object1 = object2;
        if (!ll.equals(ne1.a(boolean.class))) {
          object1 = object2;
          if (!ll.equals(ne1.a(byte.class))) {
            object1 = object2;
            if (!ll.equals(ne1.a(int.class))) {
              object1 = object2;
              if (!ll.equals(ne1.a(long.class))) {
                object1 = object2;
                if (!ll.equals(ne1.a(float.class))) {
                  object1 = object2;
                  if (!ll.equals(ne1.a(double.class))) {
                    object1 = object2;
                    if (!ll.equals(ne1.a(String.class))) {
                      object1 = object2;
                      if (!ll.equals(ne1.a(Boolean[].class))) {
                        object1 = object2;
                        if (!ll.equals(ne1.a(Byte[].class))) {
                          object1 = object2;
                          if (!ll.equals(ne1.a(Integer[].class))) {
                            object1 = object2;
                            if (!ll.equals(ne1.a(Long[].class))) {
                              object1 = object2;
                              if (!ll.equals(ne1.a(Float[].class))) {
                                object1 = object2;
                                if (!ll.equals(ne1.a(Double[].class)))
                                  if (ll.equals(ne1.a(String[].class))) {
                                    object1 = object2;
                                  } else {
                                    boolean[] arrayOfBoolean;
                                    boolean bool = ll.equals(ne1.a(boolean[].class));
                                    byte b3 = 0;
                                    byte b1 = 0;
                                    byte b2 = 0;
                                    int j = 0;
                                    int k = 0;
                                    int i = 0;
                                    if (bool) {
                                      arrayOfBoolean = (boolean[])object2;
                                      object1 = fu.a;
                                      j = arrayOfBoolean.length;
                                      object2 = new Boolean[j];
                                      while (true) {
                                        object1 = object2;
                                        if (i < j) {
                                          object2[i] = Boolean.valueOf(arrayOfBoolean[i]);
                                          i++;
                                          continue;
                                        } 
                                        break;
                                      } 
                                    } else {
                                      byte[] arrayOfByte;
                                      if (arrayOfBoolean.equals(ne1.a(byte[].class))) {
                                        arrayOfByte = (byte[])object2;
                                        object1 = fu.a;
                                        j = arrayOfByte.length;
                                        object2 = new Byte[j];
                                        i = b3;
                                        while (true) {
                                          object1 = object2;
                                          if (i < j) {
                                            object2[i] = Byte.valueOf(arrayOfByte[i]);
                                            i++;
                                            continue;
                                          } 
                                          break;
                                        } 
                                      } else {
                                        int[] arrayOfInt;
                                        if (arrayOfByte.equals(ne1.a(int[].class))) {
                                          arrayOfInt = (int[])object2;
                                          object1 = fu.a;
                                          j = arrayOfInt.length;
                                          object2 = new Integer[j];
                                          i = b1;
                                          while (true) {
                                            object1 = object2;
                                            if (i < j) {
                                              object2[i] = Integer.valueOf(arrayOfInt[i]);
                                              i++;
                                              continue;
                                            } 
                                            break;
                                          } 
                                        } else {
                                          long[] arrayOfLong;
                                          if (arrayOfInt.equals(ne1.a(long[].class))) {
                                            arrayOfLong = (long[])object2;
                                            object1 = fu.a;
                                            j = arrayOfLong.length;
                                            object2 = new Long[j];
                                            i = b2;
                                            while (true) {
                                              object1 = object2;
                                              if (i < j) {
                                                object2[i] = Long.valueOf(arrayOfLong[i]);
                                                i++;
                                                continue;
                                              } 
                                              break;
                                            } 
                                          } else {
                                            float[] arrayOfFloat;
                                            if (arrayOfLong.equals(ne1.a(float[].class))) {
                                              arrayOfFloat = (float[])object2;
                                              object1 = fu.a;
                                              k = arrayOfFloat.length;
                                              object2 = new Float[k];
                                              i = j;
                                              while (true) {
                                                object1 = object2;
                                                if (i < k) {
                                                  object2[i] = Float.valueOf(arrayOfFloat[i]);
                                                  i++;
                                                  continue;
                                                } 
                                                break;
                                              } 
                                            } else {
                                              double[] arrayOfDouble;
                                              if (arrayOfFloat.equals(ne1.a(double[].class))) {
                                                arrayOfDouble = (double[])object2;
                                                object1 = fu.a;
                                                j = arrayOfDouble.length;
                                                object2 = new Double[j];
                                                i = k;
                                                while (true) {
                                                  object1 = object2;
                                                  if (i < j) {
                                                    object2[i] = Double.valueOf(arrayOfDouble[i]);
                                                    i++;
                                                    continue;
                                                  } 
                                                  break;
                                                } 
                                              } else {
                                                tp.h("Key ", str, " has invalid type ", arrayOfDouble);
                                                return;
                                              } 
                                            } 
                                          } 
                                        } 
                                      } 
                                    } 
                                  }  
                              } 
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      this.a.put(str, object1);
    } 
  }
  
  public void d(a4 parama4) {
    boolean bool;
    String str = parama4.f();
    try {
      bool = parama4.g();
    } finally {
      Exception exception = null;
    } 
  }
  
  public fp1 e(n72 paramn72) {
    paramn72.getClass();
    return (fp1)this.a.remove(paramn72);
  }
  
  public List f(String paramString) {
    paramString.getClass();
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    LinkedHashMap linkedHashMap1 = this.a;
    for (Map.Entry entry : linkedHashMap1.entrySet()) {
      if (ui0.c(((n72)entry.getKey()).a, paramString))
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
    } 
    Iterator<n72> iterator = linkedHashMap.keySet().iterator();
    while (iterator.hasNext())
      linkedHashMap1.remove(iterator.next()); 
    return nm.v0(linkedHashMap.values());
  }
  
  public fp1 g(n72 paramn72) {
    LinkedHashMap<n72, Object> linkedHashMap = this.a;
    Object object2 = linkedHashMap.get(paramn72);
    Object object1 = object2;
    if (object2 == null) {
      object1 = new fp1(paramn72);
      linkedHashMap.put(paramn72, object1);
    } 
    return (fp1)object1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */