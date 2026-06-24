import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

public final class j31 extends y92 implements sg0 {
  public final Object f;
  
  public j31(Object paramObject) {
    super("com.google.android.gms.dynamic.IObjectWrapper", 4);
    this.f = paramObject;
  }
  
  public static sg0 p0(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
    return (sg0)((iInterface instanceof sg0) ? iInterface : new na2(paramIBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2));
  }
  
  public static Object q0(sg0 paramsg0) {
    Field field;
    if (paramsg0 instanceof j31)
      return ((j31)paramsg0).f; 
    IBinder iBinder = paramsg0.asBinder();
    Field[] arrayOfField = iBinder.getClass().getDeclaredFields();
    int j = arrayOfField.length;
    byte b = 0;
    paramsg0 = null;
    int i;
    for (i = 0; b < j; i = k) {
      Field field1 = arrayOfField[b];
      int k = i;
      if (!field1.isSynthetic()) {
        k = i + 1;
        field = field1;
      } 
      b++;
    } 
    if (i == 1) {
      n21.m(field);
      if (!field.isAccessible()) {
        field.setAccessible(true);
        try {
          return field.get(iBinder);
        } catch (NullPointerException nullPointerException) {
          throw new IllegalArgumentException("Binder object is null.", nullPointerException);
        } catch (IllegalAccessException illegalAccessException) {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
        } 
      } 
      l0.l("IObjectWrapper declared field not private!");
      return null;
    } 
    i = arrayOfField.length;
    ck2.b(String.valueOf(i).length() + 53, i, "Unexpected number of IObjectWrapper declared fields: ");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */