import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ye1 implements ky1 {
  public final g7 b;
  
  public final int c;
  
  public final x50 e;
  
  public final hk0 f;
  
  public final List g;
  
  public ye1(g7 paramg7, int paramInt, x50 paramx50, hk0 paramhk0, List paramList) {
    this.b = paramg7;
    this.c = paramInt;
    this.e = paramx50;
    this.f = paramhk0;
    this.g = paramList;
  }
  
  public static void b(Class paramClass, String paramString, Field paramField1, Field paramField2) {
    StringBuilder stringBuilder = new StringBuilder("Class ");
    stringBuilder.append(paramClass.getName());
    stringBuilder.append(" declares multiple JSON fields named '");
    stringBuilder.append(paramString);
    stringBuilder.append("'; conflict is caused by fields ");
    stringBuilder.append(re1.c(paramField1));
    stringBuilder.append(" and ");
    stringBuilder.append(re1.c(paramField2));
    stringBuilder.append("\nSee ");
    stringBuilder.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class<?> clazz = paramrz1.a;
    if (!Object.class.isAssignableFrom(clazz))
      return null; 
    ws2 ws2 = re1.a;
    if (!Modifier.isStatic(clazz.getModifiers()) && (clazz.isAnonymousClass() || clazz.isLocalClass()))
      return (jy1)new Object(); 
    zo2.t(this.g);
    return (jy1)(re1.a.V(clazz) ? new xe1(clazz, c(parammy, paramrz1, clazz, true)) : new ve1(this.b.t(paramrz1, true), c(parammy, paramrz1, clazz, false)));
  }
  
  public final we1 c(my parammy, rz1 paramrz1, Class<Object> paramClass, boolean paramBoolean) {
    if (paramClass.isInterface())
      return we1.c; 
    LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<Object, Object>();
    Class<Object> clazz = paramClass;
    while (true) {
      Type type = paramrz1.b;
      if (clazz != Object.class) {
        Field[] arrayOfField = clazz.getDeclaredFields();
        if (clazz != paramClass && arrayOfField.length > 0)
          zo2.t(this.g); 
        int i = arrayOfField.length;
        for (byte b = 0;; b++) {
          Object object;
          Field field;
          if (b < i) {
            field = arrayOfField[b];
            boolean bool2 = d(field, true);
            boolean bool1 = d(field, false);
            if (!bool2 && !bool1)
              continue; 
            if (paramBoolean)
              if (Modifier.isStatic(field.getModifiers())) {
                bool1 = false;
              } else {
                Method method = re1.a.F(clazz, field);
                re1.f(method);
                if (method.getAnnotation(vk1.class) != null && field.getAnnotation(vk1.class) == null)
                  throw new RuntimeException(x41.w("@SerializedName on ", re1.d(method, false), " is not supported")); 
                if (method == null)
                  re1.f(field); 
              }  
            object = null;
          } else {
            break;
          } 
          if (object == null)
            re1.f(field); 
        } 
        paramrz1 = new rz1(g92.Z(type, clazz, clazz.getGenericSuperclass(), new HashMap<Object, Object>()));
        clazz = paramrz1.a;
        continue;
      } 
      return new we1(linkedHashMap2, new ArrayList(linkedHashMap1.values()));
    } 
  }
  
  public final boolean d(Field paramField, boolean paramBoolean) {
    boolean bool;
    x50 x501 = this.e;
    x501.getClass();
    if ((0x88 & paramField.getModifiers()) != 0 || paramField.isSynthetic() || x501.b(paramField.getType(), paramBoolean)) {
      bool = true;
    } else {
      List list;
      if (paramBoolean) {
        list = x501.b;
      } else {
        list = x501.c;
      } 
      if (!list.isEmpty()) {
        Iterator iterator = list.iterator();
        if (iterator.hasNext())
          throw x41.g(iterator); 
      } 
      bool = false;
    } 
    return bool ^ true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ye1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */