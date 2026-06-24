package com.pairip;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class InitContextProvider {
  static Context tryToCreateContextForBindingApp() {
    try {
      Class<?> clazz2 = Class.forName("android.app.LoadedApk");
      Class<?> clazz1 = Class.forName("android.app.ActivityThread");
      Method method1 = clazz1.getMethod("currentActivityThread", null);
      Field field1 = clazz1.getDeclaredField("mBoundApplication");
      field1.setAccessible(true);
      Field field2 = Class.forName("android.app.ActivityThread$AppBindData").getDeclaredField("info");
      field2.setAccessible(true);
      Method method2 = Class.forName("android.app.ContextImpl").getDeclaredMethod("createAppContext", new Class[] { clazz1, clazz2 });
      method2.setAccessible(true);
      Object object2 = method1.invoke(null, null);
      Object object1 = method2.invoke(null, new Object[] { object2, field2.get(field1.get(object2)) });
      tryToInitializeBasicInstrumentationForStartActivity(clazz1, object2);
      return (Context)object1;
    } catch (ClassNotFoundException|IllegalAccessException|java.lang.reflect.InvocationTargetException|NoSuchMethodException|NoSuchFieldException|RuntimeException classNotFoundException) {
      return null;
    } 
  }
  
  private static void tryToInitializeBasicInstrumentationForStartActivity(Class<?> paramClass, Object paramObject) {
    try {
      Field field = paramClass.getDeclaredField("mInstrumentation");
      field.setAccessible(true);
      field.set(paramObject, Class.forName("android.app.Instrumentation").getDeclaredConstructor(null).newInstance(null));
    } catch (ClassNotFoundException|IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException|NoSuchFieldException|NoSuchMethodException|RuntimeException classNotFoundException) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pairip\InitContextProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */