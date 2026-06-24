import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

public final class t40 extends jy1 {
  public static final s40 d = new s40();
  
  public final HashMap a;
  
  public final HashMap b;
  
  public final HashMap c;
  
  public t40(Class paramClass) {
    try {
      Field[] arrayOfField1 = paramClass.getDeclaredFields();
      int m = arrayOfField1.length;
      int i = 0;
      int j;
      for (j = 0; i < m; j = n) {
        Field field = arrayOfField1[i];
        int n = j;
        if (field.isEnumConstant()) {
          arrayOfField1[j] = field;
          n = j + 1;
        } 
        i++;
      } 
      Field[] arrayOfField2 = Arrays.<Field>copyOf(arrayOfField1, j);
      i = (int)Math.ceil((j / 0.75F));
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this(i);
      this.a = hashMap;
      hashMap = new HashMap<Object, Object>();
      this(i);
      this.b = hashMap;
      hashMap = new HashMap<Object, Object>();
      this(i);
      this.c = hashMap;
      AccessibleObject.setAccessible((AccessibleObject[])arrayOfField2, true);
      int k = arrayOfField2.length;
      for (i = 0; i < k; i++) {
        Field field = arrayOfField2[i];
        Enum enum_ = (Enum)field.get(null);
        String str1 = enum_.name();
        String str2 = enum_.toString();
        vk1 vk1 = field.<vk1>getAnnotation(vk1.class);
        if (vk1 != null) {
          String str = vk1.value();
          String[] arrayOfString = vk1.alternate();
          m = arrayOfString.length;
          j = 0;
          while (true) {
            str1 = str;
            if (j < m) {
              str1 = arrayOfString[j];
              this.a.put(str1, enum_);
              j++;
              continue;
            } 
            break;
          } 
        } 
        this.a.put(str1, enum_);
        this.b.put(str2, enum_);
        this.c.put(enum_, str1);
      } 
      return;
    } catch (IllegalAccessException illegalAccessException) {
      throw new AssertionError(illegalAccessException);
    } 
  }
  
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    String str = paramtk0.A();
    Enum enum_ = (Enum)this.a.get(str);
    return (enum_ == null) ? (Enum)this.b.get(str) : enum_;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = this.c.get(paramObject);
    } 
    paramcl0.w((String)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */