import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public final class mm implements ky1 {
  public final int b;
  
  public final g7 c;
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    sj0 sj0;
    Type type1;
    lm lm;
    Type type2;
    int i = this.b;
    g7 g71 = this.c;
    Class<Object> clazz = Object.class;
    Type type3 = null;
    my my1 = null;
    switch (i) {
      default:
        type2 = paramrz1.b;
        type3 = paramrz1.a;
        if (!Map.class.isAssignableFrom((Class<?>)type3)) {
          parammy = my1;
        } else {
          Type[] arrayOfType;
          jy1 jy1;
          if (Properties.class.isAssignableFrom((Class<?>)type3)) {
            arrayOfType = new Type[2];
            arrayOfType[0] = String.class;
            arrayOfType[1] = String.class;
          } else {
            Type type5 = g92.I((Type)arrayOfType, (Class)type3, Map.class);
            if (type5 instanceof ParameterizedType) {
              Type[] arrayOfType1 = ((ParameterizedType)type5).getActualTypeArguments();
            } else {
              arrayOfType = new Type[2];
              arrayOfType[0] = Object.class;
              arrayOfType[1] = Object.class;
            } 
          } 
          type3 = arrayOfType[0];
          Type type = arrayOfType[1];
          if (type3 == boolean.class || type3 == Boolean.class) {
            jy1 = pz1.c;
          } else {
            jy1 = parammy.b(new rz1(type3));
          } 
          sj0 = new sj0(this, new sj0(parammy, jy1, type3, 2), new sj0(parammy, parammy.b(new rz1(type)), type, 2), g71.t(paramrz1, false));
        } 
        return sj0;
      case 0:
        break;
    } 
    Type type4 = paramrz1.b;
    Class<?> clazz1 = paramrz1.a;
    if (!Collection.class.isAssignableFrom(clazz1)) {
      type1 = type3;
    } else {
      type3 = g92.I(type4, clazz1, Collection.class);
      if (type3 instanceof ParameterizedType)
        type2 = ((ParameterizedType)type3).getActualTypeArguments()[0]; 
      lm = new lm(new sj0(type1, type1.b(new rz1(type2)), type2, 2), g71.t(paramrz1, false), 0);
    } 
    return lm;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */