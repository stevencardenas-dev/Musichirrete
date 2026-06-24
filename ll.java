import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ll implements kl {
  public static final Map b;
  
  public final Class a;
  
  static {
    List list = om.h0((Object[])new Class[] { 
          lc0.class, wc0.class, ad0.class, bd0.class, cd0.class, dd0.class, r72.class, ed0.class, fd0.class, gd0.class, 
          mc0.class, nc0.class, oc0.class, pc0.class, qc0.class, rc0.class, sc0.class, tc0.class, uc0.class, vc0.class, 
          xc0.class, yc0.class, zc0.class });
    ArrayList<t51> arrayList = new ArrayList(pm.k0(list));
    Iterator<Object> iterator = list.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      Class clazz = (Class)iterator.next();
      if (b) {
        arrayList.add(new t51(clazz, Integer.valueOf(b)));
        b++;
        continue;
      } 
      om.j0();
      throw null;
    } 
    b = or0.b0(arrayList);
  }
  
  public ll(Class paramClass) {
    this.a = paramClass;
  }
  
  public final Class a() {
    return this.a;
  }
  
  public final String b() {
    String str1;
    Class clazz1 = this.a;
    clazz1.getClass();
    boolean bool = clazz1.isAnonymousClass();
    Class clazz2 = null;
    if (bool || clazz1.isLocalClass())
      return null; 
    if (clazz1.isArray()) {
      Class<?> clazz = clazz1.getComponentType();
      clazz1 = clazz2;
      if (clazz.isPrimitive()) {
        String str = g92.q(clazz.getName());
        clazz1 = clazz2;
        if (str != null)
          str1 = str.concat("Array"); 
      } 
      return (str1 == null) ? "kotlin.Array" : str1;
    } 
    String str2 = g92.q(str1.getName());
    return (str2 == null) ? str1.getCanonicalName() : str2;
  }
  
  public final String c() {
    Constructor<?> constructor;
    StringBuilder stringBuilder;
    String str2;
    Class clazz = this.a;
    clazz.getClass();
    boolean bool = clazz.isAnonymousClass();
    Method method = null;
    if (bool)
      return null; 
    if (clazz.isLocalClass()) {
      String str = clazz.getSimpleName();
      method = clazz.getEnclosingMethod();
      if (method != null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(method.getName());
        stringBuilder.append('$');
        return gq1.O0(str, stringBuilder.toString());
      } 
      constructor = stringBuilder.getEnclosingConstructor();
      if (constructor != null) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(constructor.getName());
        stringBuilder.append('$');
        return gq1.O0(str, stringBuilder.toString());
      } 
      int i = str.indexOf('$', 0);
      return (i == -1) ? str : str.substring(i + 1, str.length());
    } 
    if (stringBuilder.isArray()) {
      String str;
      Class<?> clazz1 = stringBuilder.getComponentType();
      Constructor<?> constructor1 = constructor;
      if (clazz1.isPrimitive()) {
        str2 = g92.c0(clazz1.getName());
        constructor1 = constructor;
        if (str2 != null)
          str = str2.concat("Array"); 
      } 
      return (str == null) ? "Array" : str;
    } 
    String str1 = g92.c0(str2.getName());
    return (str1 == null) ? str2.getSimpleName() : str1;
  }
  
  public final boolean d(Object paramObject) {
    Class clazz2 = this.a;
    clazz2.getClass();
    Map map = b;
    map.getClass();
    Integer integer = (Integer)map.get(clazz2);
    if (integer != null)
      return qz1.E(integer.intValue(), paramObject); 
    Class clazz1 = clazz2;
    if (clazz2.isPrimitive())
      clazz1 = wf2.z(ne1.a(clazz2)); 
    return clazz1.isInstance(paramObject);
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof ll && wf2.z(this).equals(wf2.z((ll)paramObject)));
  }
  
  public final int hashCode() {
    return wf2.z(this).hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a.toString());
    stringBuilder.append(" (Kotlin reflection is not available)");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */