import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.util.concurrent.ConcurrentHashMap;

public final class hk0 implements ky1 {
  public static final gk0 e = new gk0(0);
  
  public final g7 b;
  
  public final ConcurrentHashMap c;
  
  static {
    new gk0(0);
  }
  
  public hk0(g7 paramg7) {
    this.b = paramg7;
    this.c = new ConcurrentHashMap<Object, Object>();
  }
  
  public final jy1 a(my parammy, rz1 paramrz1) {
    fk0 fk0 = (fk0)paramrz1.a.getAnnotation(fk0.class);
    return (fk0 == null) ? null : b(this.b, parammy, paramrz1, fk0, true);
  }
  
  public final jy1 b(g7 paramg7, my parammy, rz1 paramrz1, fk0 paramfk0, boolean paramBoolean) {
    Object object = paramg7.t(new rz1(paramfk0.value()), true).d();
    boolean bool = paramfk0.nullSafe();
    if (object instanceof jy1) {
      object = object;
    } else if (object instanceof ky1) {
      ky1 ky11 = (ky1)object;
      object = ky11;
      if (paramBoolean) {
        object = paramrz1.a;
        ky1 ky12 = this.c.putIfAbsent(object, ky11);
        object = ky11;
        if (ky12 != null)
          object = ky12; 
      } 
      object = object.a(parammy, paramrz1);
    } else {
      object = object.getClass().getName();
      String str = g92.e0(paramrz1.b);
      StringBuilder stringBuilder = new StringBuilder("Invalid attempt to bind an instance of ");
      stringBuilder.append((String)object);
      stringBuilder.append(" as a @JsonAdapter for ");
      stringBuilder.append(str);
      stringBuilder.append(oXrNDUqUkE.TcG);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return (jy1)((object != null && bool) ? object.a() : object);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */