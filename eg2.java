import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;

public final class eg2 implements ue2, ke2, dw1, ul2, r41, bw2 {
  public static final eg2 c = new eg2(4);
  
  public final int b;
  
  public q20 a(Context paramContext, p20 paramp20) {
    Object object = new Object();
    ((q20)object).a = 0;
    ((q20)object).b = 0;
    ((q20)object).c = 0;
    int i = paramp20.e(paramContext, true);
    ((q20)object).b = i;
    if (i != 0) {
      ((q20)object).c = 1;
      return (q20)object;
    } 
    i = paramp20.c(paramContext);
    ((q20)object).a = i;
    if (i != 0)
      ((q20)object).c = -1; 
    return (q20)object;
  }
  
  public Object apply(Object paramObject) {
    av2 av2 = (av2)paramObject;
    try {
      int i = av2.a();
      byte[] arrayOfByte = new byte[i];
      jv2 jv2 = new jv2();
      this(i, arrayOfByte);
      pv2 pv2 = (pv2)av2;
      jw2 jw2 = gw2.c.a(pv2.getClass());
      paramObject = jv2.a;
      if (paramObject == null)
        paramObject = new a42(jv2); 
      jw2.f(pv2, (a42)paramObject);
      if (i - jv2.d == 0)
        return arrayOfByte; 
      paramObject = new IllegalStateException();
      super("Did not write as much data as expected.");
      throw paramObject;
    } catch (IOException iOException) {
      String str = av2.getClass().getName();
      k91.m(x41.o(new StringBuilder(str.length() + 72), "Serializing ", str, " to a byte array threw an IOException (should never happen)."), iOException);
      return null;
    } 
  }
  
  public dm2 b(Class paramClass) {
    throw new IllegalStateException("This should never be called.");
  }
  
  public boolean b(Class paramClass) {
    return false;
  }
  
  public iw2 c(Class paramClass) {
    throw new IllegalStateException("This should never be called.");
  }
  
  public boolean c(Class paramClass) {
    return false;
  }
  
  public boolean d(Object<?> paramObject, File paramFile1, File paramFile2) {
    boolean bool = false;
    try {
      paramObject = (Object<?>)Class.forName("dalvik.system.DexFile");
      String str = paramFile1.getPath();
      Method method = n21.h0((Class)paramObject, "isDexOptNeeded", new Class[] { String.class });
      try {
        method = (Method)Boolean.class.cast(method.invoke(null, new Object[] { str }));
        if (!((Boolean)method).booleanValue())
          bool = true; 
        return bool;
      } catch (Exception exception) {
        co co = new co();
        StringBuilder stringBuilder = new StringBuilder();
        this("Failed to invoke static method isDexOptNeeded on type ");
        stringBuilder.append(paramObject);
        super(stringBuilder.toString(), exception);
        throw co;
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
      return false;
    } 
  }
  
  public void i(Object paramObject) {
    ws2.v0("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle)paramObject);
  }
  
  public boolean k(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    switch (this.b) {
      default:
        return wf2.G0(paramClassLoader, paramFile1, paramFile2, paramBoolean, (fb0)new Object(), "path", new bg2(2));
      case 1:
        break;
    } 
    return wf2.G0(paramClassLoader, paramFile1, paramFile2, paramBoolean, (fb0)new Object(), "path", new eg2(0));
  }
  
  public void m(ClassLoader paramClassLoader, HashSet paramHashSet) {
    switch (this.b) {
      default:
        zo2.a0(paramClassLoader, paramHashSet, new bg2(0));
        return;
      case 1:
        break;
    } 
    zo2.a0(paramClassLoader, paramHashSet, new bg2(0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */