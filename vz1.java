import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import in.krosbits.utils.SgV.zpEN;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class vz1 extends tz1 {
  public final Class p;
  
  public final Constructor q;
  
  public final Method r;
  
  public final Method s;
  
  public final Method t;
  
  public final Method u;
  
  public final Method v;
  
  public vz1() {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    ClassNotFoundException classNotFoundException3;
    ClassNotFoundException classNotFoundException4;
    ClassNotFoundException classNotFoundException5;
    ClassNotFoundException classNotFoundException6;
    ClassNotFoundException classNotFoundException7 = null;
    try {
      Class<?> clazz1 = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor = clazz1.getConstructor(null);
      Method method5 = e0(clazz1);
      String str = zpEN.QysfJxUMJrRrGk;
      Class<int> clazz = int.class;
      Method method4 = clazz1.getMethod(str, new Class[] { ByteBuffer.class, clazz, FontVariationAxis[].class, clazz, clazz });
      Method method2 = clazz1.getMethod("freeze", null);
      Method method3 = clazz1.getMethod("abortCreation", null);
      Method method1 = f0(clazz1);
    } catch (ClassNotFoundException classNotFoundException8) {
      Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(classNotFoundException8.getClass().getName()), classNotFoundException8);
      ClassNotFoundException classNotFoundException9 = null;
      classNotFoundException4 = null;
      classNotFoundException8 = classNotFoundException4;
      classNotFoundException1 = classNotFoundException8;
      classNotFoundException2 = classNotFoundException1;
      classNotFoundException3 = classNotFoundException2;
      classNotFoundException5 = classNotFoundException1;
      classNotFoundException6 = classNotFoundException8;
      classNotFoundException1 = classNotFoundException4;
      classNotFoundException8 = classNotFoundException9;
      classNotFoundException4 = classNotFoundException7;
    } catch (NoSuchMethodException noSuchMethodException) {}
    this.p = (Class)classNotFoundException4;
    this.q = (Constructor)classNotFoundException1;
    this.r = (Method)classNotFoundException6;
    this.s = (Method)classNotFoundException5;
    this.t = (Method)classNotFoundException2;
    this.u = (Method)classNotFoundException3;
    this.v = (Method)noSuchMethodException;
  }
  
  public static Method e0(Class paramClass) {
    Class<boolean> clazz1 = boolean.class;
    Class<int> clazz = int.class;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, clazz, clazz1, clazz, clazz, clazz, FontVariationAxis[].class });
  }
  
  public final boolean b0(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis) {
    try {
      return ((Boolean)this.r.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public Typeface c0(Object paramObject) {
    Integer integer = Integer.valueOf(-1);
    try {
      Object object = Array.newInstance(this.p, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.v.invoke(null, new Object[] { object, integer, integer });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public final boolean d0(Object paramObject) {
    try {
      return ((Boolean)this.t.invoke(paramObject, null)).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  public Method f0(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
  
  public final Typeface j(Context paramContext, ea0 paramea0, Resources paramResources, int paramInt) {
    vz1 vz11;
    Method method = this.r;
    if (method == null)
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
    if (method != null) {
      try {
        paramResources = this.q.newInstance(null);
      } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException2) {
        illegalAccessException2 = null;
      } 
      if (illegalAccessException2 != null) {
        fa0[] arrayOfFa0 = paramea0.a;
        int i = arrayOfFa0.length;
        paramInt = 0;
        vz11 = this;
        while (paramInt < i) {
          fa0 fa0 = arrayOfFa0[paramInt];
          if (!vz11.b0(paramContext, illegalAccessException2, fa0.a, fa0.e, fa0.b, fa0.c, FontVariationAxis.fromFontVariationSettings(fa0.d))) {
            try {
              vz11.u.invoke(illegalAccessException2, null);
              // Byte code: goto -> 140
            } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException1) {}
          } else {
            paramInt++;
            continue;
          } 
          return null;
        } 
        if (vz11.d0(illegalAccessException2))
          return vz11.c0(illegalAccessException2); 
      } 
      return null;
    } 
    return super.j((Context)illegalAccessException1, (ea0)vz11, (Resources)illegalAccessException2, paramInt);
  }
  
  public final Typeface k(Context paramContext, ha0[] paramArrayOfha0, int paramInt) {
    if (paramArrayOfha0.length >= 1) {
      Typeface typeface;
      Method method = this.r;
      if (method == null)
        Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
      if (method != null) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        int i = paramArrayOfha0.length;
        byte b;
        for (b = 0; b < i; b++) {
          ha0 ha01 = paramArrayOfha0[b];
          if (ha01.f == 0) {
            Uri uri = ha01.a;
            if (!hashMap.containsKey(uri))
              hashMap.put(uri, g92.R(paramContext, uri)); 
          } 
        } 
        Map<Object, Object> map = Collections.unmodifiableMap(hashMap);
        try {
          paramContext = this.q.newInstance(null);
        } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
          illegalAccessException = null;
        } 
        if (illegalAccessException != null) {
          int j = paramArrayOfha0.length;
          b = 0;
          i = 0;
          while (true) {
            boolean bool;
            Method method1 = this.u;
            if (b < j) {
              ha0 ha01 = paramArrayOfha0[b];
              ByteBuffer byteBuffer = (ByteBuffer)map.get(ha01.a);
              if (byteBuffer != null) {
                boolean bool1;
                int k = ha01.b;
                int m = ha01.c;
                bool = ha01.d;
                try {
                  bool1 = ((Boolean)this.s.invoke(illegalAccessException, new Object[] { byteBuffer, Integer.valueOf(k), null, Integer.valueOf(m), Integer.valueOf(bool) })).booleanValue();
                } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException2) {
                  bool1 = false;
                } 
                if (!bool1) {
                  try {
                    method1.invoke(illegalAccessException, null);
                  } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException1) {}
                  break;
                } 
                bool = true;
              } 
              b++;
              continue;
            } 
            if (!bool) {
              method1.invoke(illegalAccessException1, null);
            } else if (d0(illegalAccessException1)) {
              typeface = c0(illegalAccessException1);
              if (typeface != null)
                return Typeface.create(typeface, paramInt); 
            } 
            return null;
          } 
        } 
      } else {
        ha0 ha01 = qz1.r(paramArrayOfha0, paramInt);
        ContentResolver contentResolver = typeface.getContentResolver();
        ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(ha01.a, "r", null);
        if (parcelFileDescriptor == null) {
          if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
            return null;
          } 
        } else {
          try {
            Typeface.Builder builder = new Typeface.Builder();
            this(parcelFileDescriptor.getFileDescriptor());
            return builder.setWeight(ha01.c).setItalic(ha01.d).build();
          } finally {
            try {
              parcelFileDescriptor.close();
            } finally {
              parcelFileDescriptor = null;
            } 
          } 
        } 
      } 
    } 
    return null;
  }
  
  public final Typeface m(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    Method method = this.r;
    if (method == null)
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
    if (method != null) {
      try {
        paramResources = this.q.newInstance(null);
      } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException2) {
        illegalAccessException2 = null;
      } 
      if (illegalAccessException2 != null)
        if (!b0(paramContext, illegalAccessException2, paramString, 0, -1, -1, null)) {
          try {
            this.u.invoke(illegalAccessException2, null);
          } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException1) {}
        } else if (d0(illegalAccessException2)) {
          return c0(illegalAccessException2);
        }  
      return null;
    } 
    return super.m((Context)illegalAccessException1, (Resources)illegalAccessException2, paramInt1, paramString, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */