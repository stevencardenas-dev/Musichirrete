import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

public final class xe1 extends ue1 {
  public static final HashMap e;
  
  public final Constructor b;
  
  public final Object[] c;
  
  public final HashMap d = new HashMap<Object, Object>();
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(byte.class, Byte.valueOf((byte)0));
    hashMap.put(short.class, Short.valueOf((short)0));
    hashMap.put(int.class, Integer.valueOf(0));
    hashMap.put(long.class, Long.valueOf(0L));
    hashMap.put(float.class, Float.valueOf(0.0F));
    hashMap.put(double.class, Double.valueOf(0.0D));
    hashMap.put(char.class, Character.valueOf(false));
    hashMap.put(boolean.class, Boolean.FALSE);
    e = hashMap;
  }
  
  public xe1(Class paramClass, we1 paramwe1) {
    super(paramwe1);
    ws2 ws2 = re1.a;
    Constructor constructor = ws2.H(paramClass);
    this.b = constructor;
    re1.f(constructor);
    String[] arrayOfString = ws2.R(paramClass);
    boolean bool = false;
    byte b;
    for (b = 0; b < arrayOfString.length; b++)
      this.d.put(arrayOfString[b], Integer.valueOf(b)); 
    Class[] arrayOfClass = this.b.getParameterTypes();
    this.c = new Object[arrayOfClass.length];
    for (b = bool; b < arrayOfClass.length; b++)
      this.c[b] = e.get(arrayOfClass[b]); 
  }
  
  public final Object d() {
    return this.c.clone();
  }
  
  public final Object e(Object paramObject) {
    ws2 ws2;
    StringBuilder stringBuilder;
    String str;
    Object[] arrayOfObject = (Object[])paramObject;
    Constructor constructor = this.b;
    try {
      return constructor.newInstance(arrayOfObject);
    } catch (IllegalAccessException illegalAccessException) {
      ws2 = re1.a;
      k91.m("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
      return null;
    } catch (InstantiationException instantiationException) {
      str = re1.b(constructor);
      String str1 = Arrays.toString((Object[])ws2);
      stringBuilder = new StringBuilder("Failed to invoke constructor '");
      stringBuilder.append(str);
      stringBuilder.append("' with args ");
      stringBuilder.append(str1);
      throw new RuntimeException(stringBuilder.toString(), instantiationException);
    } catch (IllegalArgumentException illegalArgumentException) {
      str = re1.b((Constructor)str);
      String str1 = Arrays.toString((Object[])stringBuilder);
      stringBuilder = new StringBuilder("Failed to invoke constructor '");
      stringBuilder.append(str);
      stringBuilder.append("' with args ");
      stringBuilder.append(str1);
      throw new RuntimeException(stringBuilder.toString(), illegalArgumentException);
    } catch (InvocationTargetException invocationTargetException) {
      StringBuilder stringBuilder1 = new StringBuilder("Failed to invoke constructor '");
      stringBuilder1.append(re1.b((Constructor)str));
      stringBuilder1.append("' with args ");
      stringBuilder1.append(Arrays.toString((Object[])stringBuilder));
      k91.m(stringBuilder1.toString(), invocationTargetException.getCause());
      return null;
    } 
  }
  
  public final void f(Object paramObject, tk0 paramtk0, te1 paramte1) {
    Object[] arrayOfObject = (Object[])paramObject;
    paramObject = paramte1.c;
    Integer integer = (Integer)this.d.get(paramObject);
    if (integer != null) {
      int i = integer.intValue();
      Object object = paramte1.f.b(paramtk0);
      if (object != null || !paramte1.g) {
        arrayOfObject[i] = object;
        return;
      } 
      paramObject = x41.q("null is not allowed as value for record component '", (String)paramObject, "' of primitive type; at path ");
      paramObject.append(paramtk0.m(false));
      throw new RuntimeException(paramObject.toString());
    } 
    String str = re1.b(this.b);
    StringBuilder stringBuilder = new StringBuilder("Could not find the index in the constructor '");
    stringBuilder.append(str);
    stringBuilder.append("' for field with name '");
    stringBuilder.append((String)paramObject);
    stringBuilder.append("', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    throw new IllegalStateException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xe1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */