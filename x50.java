import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class x50 implements ky1, Cloneable {
  public static final x50 e = new x50();
  
  public final List b;
  
  public final List c;
  
  public x50() {
    List list = Collections.EMPTY_LIST;
    this.b = list;
    this.c = list;
  }
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    Class clazz = paramrz1.a;
    boolean bool2 = b(clazz, true);
    boolean bool1 = b(clazz, false);
    return (!bool2 && !bool1) ? null : new w50(this, bool1, bool2, parammy, paramrz1);
  }
  
  public final boolean b(Class<?> paramClass, boolean paramBoolean) {
    List list;
    if (!paramBoolean && !Enum.class.isAssignableFrom(paramClass)) {
      ws2 ws2 = re1.a;
      if (!Modifier.isStatic(paramClass.getModifiers()) && (paramClass.isAnonymousClass() || paramClass.isLocalClass()))
        return true; 
    } 
    if (paramBoolean) {
      list = this.b;
    } else {
      list = this.c;
    } 
    Iterator iterator = list.iterator();
    if (!iterator.hasNext())
      return false; 
    throw x41.g(iterator);
  }
  
  public final Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */