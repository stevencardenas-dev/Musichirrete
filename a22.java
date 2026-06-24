import android.os.Parcel;
import android.os.Parcelable;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a22 {
  public final b9 a;
  
  public final b9 b;
  
  public final b9 c;
  
  public a22(b9 paramb91, b9 paramb92, b9 paramb93) {
    this.a = paramb91;
    this.b = paramb92;
    this.c = paramb93;
  }
  
  public abstract b22 a();
  
  public final Class b(Class paramClass) {
    String str = paramClass.getName();
    b9 b91 = this.c;
    Class clazz1 = (Class)b91.get(str);
    Class<?> clazz = clazz1;
    if (clazz1 == null) {
      String str1 = paramClass.getPackage().getName();
      String str2 = paramClass.getSimpleName();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(ckOPp.ziKRPZYDkOLBrxP);
      stringBuilder.append(str2);
      stringBuilder.append("Parcelizer");
      clazz = Class.forName(stringBuilder.toString(), false, paramClass.getClassLoader());
      b91.put(paramClass.getName(), clazz);
    } 
    return clazz;
  }
  
  public final Method c(String paramString) {
    b9 b91 = this.a;
    Method method2 = (Method)b91.get(paramString);
    Method method1 = method2;
    if (method2 == null) {
      System.currentTimeMillis();
      method1 = Class.forName(paramString, true, a22.class.getClassLoader()).getDeclaredMethod("read", new Class[] { a22.class });
      b91.put(paramString, method1);
    } 
    return method1;
  }
  
  public final Method d(Class paramClass) {
    String str = paramClass.getName();
    b9 b91 = this.b;
    Method method = (Method)b91.get(str);
    if (method == null) {
      Class clazz = b(paramClass);
      System.currentTimeMillis();
      method = clazz.getDeclaredMethod("write", new Class[] { paramClass, a22.class });
      b91.put(paramClass.getName(), method);
      return method;
    } 
    return method;
  }
  
  public abstract boolean e(int paramInt);
  
  public final int f(int paramInt1, int paramInt2) {
    return !e(paramInt2) ? paramInt1 : ((b22)this).e.readInt();
  }
  
  public final Parcelable g(Parcelable paramParcelable, int paramInt) {
    if (!e(paramInt))
      return paramParcelable; 
    b22 b22 = (b22)this;
    ClassLoader classLoader = b22.class.getClassLoader();
    return b22.e.readParcelable(classLoader);
  }
  
  public final c22 h() {
    String str = ((b22)this).e.readString();
    if (str == null)
      return null; 
    b22 b22 = a();
    try {
      return (c22)c(str).invoke(null, new Object[] { b22 });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {
    
    } catch (NoSuchMethodException noSuchMethodException) {
    
    } catch (ClassNotFoundException classNotFoundException) {}
    if (!(classNotFoundException.getCause() instanceof RuntimeException)) {
      k91.m("VersionedParcel encountered InvocationTargetException", classNotFoundException);
      return null;
    } 
    throw (RuntimeException)classNotFoundException.getCause();
  }
  
  public abstract void i(int paramInt);
  
  public final void j(int paramInt1, int paramInt2) {
    i(paramInt2);
    ((b22)this).e.writeInt(paramInt1);
  }
  
  public final void k(Parcelable paramParcelable, int paramInt) {
    i(paramInt);
    ((b22)this).e.writeParcelable(paramParcelable, 0);
  }
  
  public final void l(c22 paramc22) {
    if (paramc22 == null) {
      ((b22)this).e.writeString(null);
      return;
    } 
    try {
      Class clazz = b(paramc22.getClass());
      String str = clazz.getName();
      ((b22)this).e.writeString(str);
      b22 b22 = a();
      try {
        d(paramc22.getClass()).invoke(null, new Object[] { paramc22, b22 });
        Parcel parcel = b22.e;
        int i = b22.i;
        if (i >= 0) {
          int j = b22.d.get(i);
          i = parcel.dataPosition();
          parcel.setDataPosition(j);
          parcel.writeInt(i - j);
          parcel.setDataPosition(i);
        } 
        return;
      } catch (IllegalAccessException illegalAccessException) {
        k91.m("VersionedParcel encountered IllegalAccessException", illegalAccessException);
        return;
      } catch (InvocationTargetException invocationTargetException) {
        if (!(invocationTargetException.getCause() instanceof RuntimeException)) {
          k91.m("VersionedParcel encountered InvocationTargetException", invocationTargetException);
          return;
        } 
        throw (RuntimeException)invocationTargetException.getCause();
      } catch (NoSuchMethodException noSuchMethodException) {
        k91.m("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
        return;
      } catch (ClassNotFoundException classNotFoundException) {
        k91.m("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
        return;
      } 
    } catch (ClassNotFoundException classNotFoundException1) {
      k91.m(classNotFoundException.getClass().getSimpleName().concat(" does not have a Parcelizer"), classNotFoundException1);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */