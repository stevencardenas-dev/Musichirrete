import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public abstract class wl2 {
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
      b(paramInt, paramStringBuilder);
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
        hk2 hk2;
        paramStringBuilder.append(": \"");
        paramString = (String)paramObject;
        paramObject = gk2.c;
        if (paramString.isEmpty()) {
          hk2 = gk2.c;
        } else {
          hk2 = new hk2(hk2.getBytes(il2.a));
        } 
        paramStringBuilder.append(n21.X(hk2));
        paramStringBuilder.append('"');
        return;
      } 
      if (paramObject instanceof gk2) {
        paramStringBuilder.append(": \"");
        paramStringBuilder.append(n21.X((gk2)paramObject));
        paramStringBuilder.append('"');
        return;
      } 
      boolean bool = paramObject instanceof wk2;
      paramString = hrSTyFuSIm.tYlopyw;
      if (bool) {
        paramStringBuilder.append(" {");
        c((wk2)paramObject, paramStringBuilder, paramInt + 2);
        paramStringBuilder.append(paramString);
        b(paramInt, paramStringBuilder);
        paramStringBuilder.append("}");
        return;
      } 
      if (paramObject instanceof Map.Entry) {
        int i = paramInt + 2;
        paramStringBuilder.append(" {");
        paramObject = paramObject;
        a(paramStringBuilder, i, "key", paramObject.getKey());
        a(paramStringBuilder, i, "value", paramObject.getValue());
        paramStringBuilder.append(paramString);
        b(paramInt, paramStringBuilder);
        paramStringBuilder.append("}");
        return;
      } 
      paramStringBuilder.append(": ");
      paramStringBuilder.append(paramObject);
      return;
    } 
  }
  
  public static void b(int paramInt, StringBuilder paramStringBuilder) {
    while (paramInt > 0) {
      int i = 80;
      if (paramInt <= 80)
        i = paramInt; 
      paramStringBuilder.append(a, 0, i);
      paramInt -= i;
    } 
  }
  
  public static void c(wk2 paramwk2, StringBuilder paramStringBuilder, int paramInt) {
    HashSet<String> hashSet = new HashSet();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    Method[] arrayOfMethod = paramwk2.getClass().getDeclaredMethods();
    int i = arrayOfMethod.length;
    boolean bool = false;
    byte b = 0;
    while (true) {
      byte b1 = 3;
      if (b < i) {
        Method method = arrayOfMethod[b];
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
        b++;
        continue;
      } 
      Iterator iterator = treeMap.entrySet().iterator();
      b = b1;
      while (true) {
        while (true)
          break; 
        if (SYNTHETIC_LOCAL_VARIABLE_7 != null)
          a(paramStringBuilder, paramInt, (String)arrayOfMethod, SYNTHETIC_LOCAL_VARIABLE_14); 
      } 
      nm2 nm2 = paramwk2.zzc;
      if (nm2 != null)
        for (b = bool; b < nm2.a; b++)
          a(paramStringBuilder, paramInt, String.valueOf(nm2.b[b] >>> 3), nm2.c[b]);  
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */