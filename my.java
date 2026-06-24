import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class my {
  public final int a;
  
  public boolean b;
  
  public final Object c;
  
  public final Serializable d;
  
  public Object e;
  
  public final Object f;
  
  public final Object g;
  
  public Object h;
  
  public my() {
    this.c = new ThreadLocal();
    this.d = new ConcurrentHashMap<Object, Object>();
    x50 x50 = xe0.a;
    new HashMap<Object, Object>(xe0.b);
    this.b = xe0.g;
    this.h = xe0.h;
    xe0.a(xe0.c);
    xe0.a(xe0.d);
    xe0.a(xe0.i);
    this.e = xe0.o;
    this.f = xe0.p;
    this.g = xe0.r;
  }
  
  public my(AssetManager paramAssetManager, r8 paramr8, bh0 parambh0, String paramString, File paramFile) {
    byte[] arrayOfByte;
    this.b = false;
    this.c = parambh0;
    this.g = paramString;
    this.f = paramFile;
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      arrayOfByte = zo2.e;
    } else {
      switch (i) {
        default:
          paramAssetManager = null;
          break;
        case 28:
        case 29:
        case 30:
          arrayOfByte = zo2.f;
          break;
        case 27:
          arrayOfByte = zo2.g;
          break;
        case 26:
          arrayOfByte = zo2.h;
          break;
        case 24:
        case 25:
          arrayOfByte = zo2.i;
          break;
      } 
    } 
    this.d = (Serializable)arrayOfByte;
  }
  
  public Object a(String paramString) {
    rz1 rz1 = new rz1(aq0.class);
    tk0 tk0 = new tk0(new StringReader(paramString));
    tk0.F(2);
    int i = tk0.q;
    boolean bool = true;
    if (i == 2)
      tk0.q = 1; 
    try {
      tk0.C();
      boolean bool1 = false;
      bool = bool1;
      jy1 jy1 = b(rz1);
      bool = bool1;
      Class clazz1 = rz1.a;
      bool = bool1;
      object = jy1.b(tk0);
      bool = bool1;
      Class clazz2 = qz1.T(clazz1);
      if (object != null) {
        bool = bool1;
        if (!clazz2.isInstance(object)) {
          bool = bool1;
          ClassCastException classCastException = new ClassCastException();
          bool = bool1;
          StringBuilder stringBuilder = new StringBuilder();
          bool = bool1;
          this("Type adapter '");
          bool = bool1;
          stringBuilder.append(jy1);
          bool = bool1;
          stringBuilder.append("' returned wrong type; requested ");
          bool = bool1;
          stringBuilder.append(clazz1);
          bool = bool1;
          stringBuilder.append(LHyji.snJ);
          bool = bool1;
          stringBuilder.append(object.getClass());
          bool = bool1;
          stringBuilder.append("\nVerify that the adapter was registered for the correct type.");
          bool = bool1;
          this(stringBuilder.toString());
          bool = bool1;
          throw classCastException;
        } 
      } 
    } catch (EOFException null) {
    
    } catch (IllegalStateException null) {
    
    } catch (IOException null) {
    
    } catch (AssertionError assertionError) {
    
    } finally {}
    tk0.F(i);
    if (paramString != null)
      try {
        if (tk0.C() != 10) {
          object = new pk0();
          super("JSON document was not fully consumed.");
          throw object;
        } 
      } catch (gr0 null) {
        throw new RuntimeException(object);
      } catch (IOException object) {
        throw new RuntimeException(object);
      }  
    return object;
  }
  
  public jy1 b(rz1 paramrz1) {
    boolean bool;
    ThreadLocal<Map> threadLocal = (ThreadLocal)this.c;
    ConcurrentHashMap<Object, Object> concurrentHashMap = (ConcurrentHashMap)this.d;
    jy1 jy1 = (jy1)concurrentHashMap.get(paramrz1);
    if (jy1 != null)
      return jy1; 
    Map<Object, Object> map = threadLocal.get();
    if (map == null) {
      map = new HashMap<Object, Object>();
      threadLocal.set(map);
      bool = true;
    } else {
      jy1 = (jy1)map.get(paramrz1);
      if (jy1 != null)
        return jy1; 
      bool = false;
    } 
    try {
      we0 we0 = new we0();
      this();
      map.put(paramrz1, we0);
      Iterator<ky1> iterator = ((List)this.g).iterator();
      jy1 = null;
      while (iterator.hasNext()) {
        jy1 jy11 = ((ky1)iterator.next()).a(this, paramrz1);
        jy1 = jy11;
        if (jy11 != null) {
          if (we0.a == null) {
            we0.a = jy11;
            map.put(paramrz1, jy11);
            jy1 = jy11;
            break;
          } 
          AssertionError assertionError = new AssertionError();
          this("Delegate is already set");
          throw assertionError;
        } 
      } 
    } finally {}
    if (bool)
      threadLocal.remove(); 
    if (jy1 != null) {
      if (bool)
        concurrentHashMap.putAll(map); 
      return jy1;
    } 
    m60.k("GSON (2.14.0) cannot handle ", paramrz1);
    return null;
  }
  
  public FileInputStream c(AssetManager paramAssetManager, String paramString) {
    try {
      return paramAssetManager.openFd(paramString).createInputStream();
    } catch (FileNotFoundException fileNotFoundException) {
      String str = fileNotFoundException.getMessage();
      if (str != null && str.contains("compressed"))
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED"); 
      return null;
    } 
  }
  
  public void d(int paramInt, Serializable paramSerializable) {
    (new no(paramInt, 2, this, paramSerializable)).run();
  }
  
  public void e(nk0 paramnk0, cl0 paramcl0) {
    int i = paramcl0.j;
    boolean bool1 = paramcl0.k;
    boolean bool2 = paramcl0.m;
    paramcl0.k = this.b;
    paramcl0.m = false;
    if (i == 2)
      paramcl0.j = 1; 
    try {
      ok0.a.getClass();
      ok0.f(paramnk0, paramcl0);
      paramcl0.r(i);
      paramcl0.k = bool1;
      paramcl0.m = bool2;
      return;
    } catch (IOException iOException) {
      pk0 pk0 = new pk0();
      super(iOException);
      throw pk0;
    } catch (AssertionError assertionError2) {
      AssertionError assertionError1 = new AssertionError();
      StringBuilder stringBuilder = new StringBuilder();
      this("AssertionError (GSON 2.14.0): ");
      stringBuilder.append(assertionError2.getMessage());
      this(stringBuilder.toString(), assertionError2);
      throw assertionError1;
    } finally {}
    paramcl0.r(i);
    paramcl0.k = bool1;
    paramcl0.m = bool2;
    throw paramnk0;
  }
  
  public void f(Object paramObject, Class paramClass, cl0 paramcl0) {
    jy1 jy1 = b(new rz1(paramClass));
    int i = paramcl0.j;
    if (i == 2)
      paramcl0.j = 1; 
    boolean bool1 = paramcl0.k;
    boolean bool2 = paramcl0.m;
    paramcl0.k = this.b;
    paramcl0.m = false;
    try {
      jy1.c(paramcl0, paramObject);
      paramcl0.r(i);
      paramcl0.k = bool1;
      paramcl0.m = bool2;
      return;
    } catch (IOException iOException) {
      paramObject = new pk0();
      super(iOException);
      throw paramObject;
    } catch (AssertionError assertionError) {
      paramObject = new AssertionError();
      StringBuilder stringBuilder = new StringBuilder();
      this("AssertionError (GSON 2.14.0): ");
      stringBuilder.append(assertionError.getMessage());
      super(stringBuilder.toString(), assertionError);
      throw paramObject;
    } finally {}
    paramcl0.r(i);
    paramcl0.k = bool1;
    paramcl0.m = bool2;
    throw paramObject;
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("{serializeNulls:false,factories:");
    stringBuilder.append(this.g);
    stringBuilder.append(",instanceCreators:");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */