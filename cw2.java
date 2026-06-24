import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class cw2 {
  public static final char[] a;
  
  static {
    char[] arrayOfChar = new char[80];
    a = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  public static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject) {
    if (paramObject instanceof List) {
      paramObject = ((List)paramObject).iterator();
      while (paramObject.hasNext())
        a(paramStringBuilder, paramInt, paramString, paramObject.next()); 
    } else {
      if (paramObject instanceof Map) {
        paramObject = ((Map)paramObject).entrySet().iterator();
        while (paramObject.hasNext())
          a(paramStringBuilder, paramInt, paramString, paramObject.next()); 
        return;
      } 
      paramStringBuilder.append('\n');
      c(paramInt, paramStringBuilder);
      String str = paramString;
      if (!paramString.isEmpty()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toLowerCase(paramString.charAt(0)));
        for (byte b = 1; b < paramString.length(); b++) {
          char c = paramString.charAt(b);
          if (Character.isUpperCase(c))
            stringBuilder.append("_"); 
          stringBuilder.append(Character.toLowerCase(c));
        } 
        str = stringBuilder.toString();
      } 
      paramStringBuilder.append(str);
      if (paramObject instanceof String) {
        paramStringBuilder.append(": \"");
        paramObject = paramObject;
        iv2 iv2 = hv2.c;
        paramStringBuilder.append(qz1.W(new iv2(paramObject.getBytes(vv2.a))));
        paramStringBuilder.append('"');
        return;
      } 
      if (paramObject instanceof hv2) {
        paramStringBuilder.append(": \"");
        paramStringBuilder.append(qz1.W((hv2)paramObject));
        paramStringBuilder.append('"');
        return;
      } 
      if (paramObject instanceof pv2) {
        paramStringBuilder.append(" {");
        b((pv2)paramObject, paramStringBuilder, paramInt + 2);
        paramStringBuilder.append("\n");
        c(paramInt, paramStringBuilder);
        paramStringBuilder.append("}");
        return;
      } 
      if (paramObject instanceof Map.Entry) {
        int i = paramInt + 2;
        paramStringBuilder.append(" {");
        Map.Entry entry = (Map.Entry)paramObject;
        a(paramStringBuilder, i, "key", entry.getKey());
        a(paramStringBuilder, i, "value", entry.getValue());
        paramStringBuilder.append("\n");
        c(paramInt, paramStringBuilder);
        paramStringBuilder.append("}");
        return;
      } 
      paramStringBuilder.append(": ");
      paramStringBuilder.append(paramObject);
      return;
    } 
  }
  
  public static void b(pv2 parampv2, StringBuilder paramStringBuilder, int paramInt) {
    HashSet<String> hashSet = new HashSet();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    for (Method method : parampv2.getClass().getDeclaredMethods()) {
      if (!Modifier.isStatic(method.getModifiers()) && method.getName().length() >= 3)
        if (method.getName().startsWith("set")) {
          hashSet.add(method.getName());
        } else if (Modifier.isPublic(method.getModifiers()) && (method.getParameterTypes()).length == 0) {
          if (method.getName().startsWith("has")) {
            hashMap.put(method.getName(), method);
          } else if (method.getName().startsWith("get")) {
            treeMap.put(method.getName(), method);
          } 
        }  
    } 
    Iterator iterator = treeMap.entrySet().iterator();
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_5 != null)
        a(paramStringBuilder, paramInt, (String)method, SYNTHETIC_LOCAL_VARIABLE_12); 
    } 
  }
  
  public static void c(int paramInt, StringBuilder paramStringBuilder) {
    while (paramInt > 0) {
      int i = 80;
      if (paramInt <= 80)
        i = paramInt; 
      paramStringBuilder.append(a, 0, i);
      paramInt -= i;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cw2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */