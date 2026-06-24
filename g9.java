import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class g9 extends ui0 {
  public static boolean D0(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    if (paramArrayOfObject1 != paramArrayOfObject2) {
      if (paramArrayOfObject1.length != paramArrayOfObject2.length)
        return false; 
      int i = paramArrayOfObject1.length;
      for (byte b = 0; b < i; b++) {
        Object object1 = paramArrayOfObject1[b];
        Object object2 = paramArrayOfObject2[b];
        if (object1 != object2)
          if (object1 != null) {
            if (object2 == null)
              // Byte code: goto -> 395 
            if (object1 instanceof Object[] && object2 instanceof Object[]) {
              if (!D0((Object[])object1, (Object[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof byte[] && object2 instanceof byte[]) {
              if (!Arrays.equals((byte[])object1, (byte[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof short[] && object2 instanceof short[]) {
              if (!Arrays.equals((short[])object1, (short[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof int[] && object2 instanceof int[]) {
              if (!Arrays.equals((int[])object1, (int[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof long[] && object2 instanceof long[]) {
              if (!Arrays.equals((long[])object1, (long[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof float[] && object2 instanceof float[]) {
              if (!Arrays.equals((float[])object1, (float[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof double[] && object2 instanceof double[]) {
              if (!Arrays.equals((double[])object1, (double[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof char[] && object2 instanceof char[]) {
              if (!Arrays.equals((char[])object1, (char[])object2))
                // Byte code: goto -> 395 
            } else if (object1 instanceof boolean[] && object2 instanceof boolean[]) {
              if (!Arrays.equals((boolean[])object1, (boolean[])object2))
                // Byte code: goto -> 395 
            } else if (!object1.equals(object2)) {
              // Byte code: goto -> 395
            } 
          } else {
            // Byte code: goto -> 395
          }  
      } 
    } 
    return true;
  }
  
  public static void E0(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    paramArrayOfint1.getClass();
    paramArrayOfint2.getClass();
    System.arraycopy(paramArrayOfint1, paramInt2, paramArrayOfint2, paramInt1, paramInt3 - paramInt2);
  }
  
  public static void F0(int paramInt1, int paramInt2, int paramInt3, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2) {
    paramArrayOfObject1.getClass();
    paramArrayOfObject2.getClass();
    System.arraycopy(paramArrayOfObject1, paramInt2, paramArrayOfObject2, paramInt1, paramInt3 - paramInt2);
  }
  
  public static Object[] H0(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    paramArrayOfObject.getClass();
    int i = paramArrayOfObject.length;
    if (paramInt2 <= i) {
      paramArrayOfObject = Arrays.copyOfRange(paramArrayOfObject, paramInt1, paramInt2);
      paramArrayOfObject.getClass();
      return paramArrayOfObject;
    } 
    StringBuilder stringBuilder = new StringBuilder("toIndex (");
    stringBuilder.append(paramInt2);
    stringBuilder.append(") is greater than size (");
    stringBuilder.append(i);
    stringBuilder.append(").");
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public static final void I0(Object[] paramArrayOfObject, f1 paramf1, int paramInt1, int paramInt2) {
    paramArrayOfObject.getClass();
    Arrays.fill(paramArrayOfObject, paramInt1, paramInt2, paramf1);
  }
  
  public static List J0(Object[] paramArrayOfObject) {
    int i = paramArrayOfObject.length;
    if (i != 0) {
      List<?> list;
      if (i != 1) {
        list = Arrays.asList(Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length));
        list.getClass();
        return list;
      } 
      return zo2.E(list[0]);
    } 
    return d40.b;
  }
  
  public static Set K0(Object[] paramArrayOfObject) {
    paramArrayOfObject.getClass();
    int i = paramArrayOfObject.length;
    if (i != 0) {
      byte b = 0;
      if (i != 1) {
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet(or0.a0(paramArrayOfObject.length));
        i = paramArrayOfObject.length;
        while (b < i) {
          linkedHashSet.add(paramArrayOfObject[b]);
          b++;
        } 
        return linkedHashSet;
      } 
      Set set = Collections.singleton(paramArrayOfObject[0]);
      set.getClass();
      return set;
    } 
    return f40.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */