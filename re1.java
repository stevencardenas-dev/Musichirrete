import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class re1 {
  public static final ws2 a;
  
  static {
    ws2 ws21;
    try {
      ws21 = new qe1();
      this();
    } catch (ReflectiveOperationException reflectiveOperationException) {
      ws21 = new ws2(19);
    } 
    a = ws21;
  }
  
  public static void a(AccessibleObject paramAccessibleObject, StringBuilder paramStringBuilder) {
    Class[] arrayOfClass;
    paramStringBuilder.append('(');
    if (paramAccessibleObject instanceof Method) {
      arrayOfClass = ((Method)paramAccessibleObject).getParameterTypes();
    } else {
      arrayOfClass = ((Constructor)arrayOfClass).getParameterTypes();
    } 
    for (byte b = 0; b < arrayOfClass.length; b++) {
      if (b > 0)
        paramStringBuilder.append(", "); 
      paramStringBuilder.append(arrayOfClass[b].getSimpleName());
    } 
    paramStringBuilder.append(')');
  }
  
  public static String b(Constructor paramConstructor) {
    StringBuilder stringBuilder = new StringBuilder(paramConstructor.getDeclaringClass().getName());
    a(paramConstructor, stringBuilder);
    return stringBuilder.toString();
  }
  
  public static String c(Field paramField) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramField.getDeclaringClass().getName());
    stringBuilder.append("#");
    stringBuilder.append(paramField.getName());
    return stringBuilder.toString();
  }
  
  public static String d(AccessibleObject paramAccessibleObject, boolean paramBoolean) {
    String str1;
    if (paramAccessibleObject instanceof Field) {
      StringBuilder stringBuilder = new StringBuilder("field '");
      stringBuilder.append(c((Field)paramAccessibleObject));
      stringBuilder.append("'");
      str1 = stringBuilder.toString();
    } else if (str1 instanceof Method) {
      Method method = (Method)str1;
      StringBuilder stringBuilder1 = new StringBuilder(method.getName());
      a(method, stringBuilder1);
      String str = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder("method '");
      stringBuilder2.append(method.getDeclaringClass().getName());
      stringBuilder2.append("#");
      stringBuilder2.append(str);
      stringBuilder2.append("'");
      str1 = stringBuilder2.toString();
    } else if (str1 instanceof Constructor) {
      StringBuilder stringBuilder = new StringBuilder("constructor '");
      stringBuilder.append(b((Constructor)str1));
      stringBuilder.append("'");
      str1 = stringBuilder.toString();
    } else {
      StringBuilder stringBuilder = new StringBuilder("<unknown AccessibleObject> ");
      stringBuilder.append(str1.toString());
      str1 = stringBuilder.toString();
    } 
    String str2 = str1;
    if (paramBoolean) {
      str2 = str1;
      if (Character.isLowerCase(str1.charAt(0))) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(str1.charAt(0)));
        stringBuilder.append(str1.substring(1));
        str2 = stringBuilder.toString();
      } 
    } 
    return str2;
  }
  
  public static String e(Exception paramException) {
    if (paramException.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
      String str = paramException.getMessage();
      if (str != null && str.contains("to module com.google.gson")) {
        str = "reflection-inaccessible-to-module-gson";
      } else {
        str = "reflection-inaccessible";
      } 
      return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str));
    } 
    return "";
  }
  
  public static void f(AccessibleObject paramAccessibleObject) {
    try {
      paramAccessibleObject.setAccessible(true);
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder = x41.q("Failed making ", d(paramAccessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
      stringBuilder.append(e(exception));
      throw new RuntimeException(stringBuilder.toString(), exception);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\re1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */