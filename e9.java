import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class e9 implements ky1 {
  public final jy1 a(my parammy, rz1 paramrz1) {
    Type<?> type = paramrz1.b;
    boolean bool = type instanceof GenericArrayType;
    if (!bool && (!(type instanceof Class) || !((Class)type).isArray()))
      return null; 
    if (bool) {
      type = ((GenericArrayType)type).getGenericComponentType();
    } else {
      type = ((Class)type).getComponentType();
    } 
    return new f9(parammy, parammy.b(new rz1(type)), g92.G(type));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */