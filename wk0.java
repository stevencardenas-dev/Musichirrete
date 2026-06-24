import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;

public final class wk0 implements g31, l12 {
  public final boolean a = true;
  
  public final JsonWriter b;
  
  public final Map c;
  
  public final Map d;
  
  public final f31 e;
  
  public final boolean f;
  
  public wk0(BufferedWriter paramBufferedWriter, HashMap paramHashMap1, HashMap paramHashMap2, jk0 paramjk0, boolean paramBoolean) {
    this.b = new JsonWriter(paramBufferedWriter);
    this.c = paramHashMap1;
    this.d = paramHashMap2;
    this.e = paramjk0;
    this.f = paramBoolean;
  }
  
  public final g31 a(v70 paramv70, Object paramObject) {
    f(paramv70.a, paramObject);
    return this;
  }
  
  public final l12 b(String paramString) {
    g();
    this.b.value(paramString);
    return this;
  }
  
  public final l12 c(boolean paramBoolean) {
    g();
    this.b.value(paramBoolean);
    return this;
  }
  
  public final g31 d(v70 paramv70, long paramLong) {
    String str = paramv70.a;
    g();
    JsonWriter jsonWriter = this.b;
    jsonWriter.name(str);
    g();
    jsonWriter.value(paramLong);
    return this;
  }
  
  public final wk0 e(Object paramObject) {
    JsonWriter jsonWriter = this.b;
    if (paramObject == null) {
      jsonWriter.nullValue();
      return this;
    } 
    if (paramObject instanceof Number) {
      jsonWriter.value((Number)paramObject);
      return this;
    } 
    if (paramObject.getClass().isArray()) {
      if (paramObject instanceof byte[]) {
        paramObject = paramObject;
        g();
        jsonWriter.value(Base64.encodeToString((byte[])paramObject, 2));
        return this;
      } 
      jsonWriter.beginArray();
      boolean bool = paramObject instanceof int[];
      int j = 0;
      boolean bool2 = false;
      boolean bool1 = false;
      int k = 0;
      int i = 0;
      byte b = 0;
      if (bool) {
        paramObject = paramObject;
        j = paramObject.length;
        for (i = b; i < j; i++)
          jsonWriter.value(paramObject[i]); 
      } else if (paramObject instanceof long[]) {
        paramObject = paramObject;
        k = paramObject.length;
        for (i = j; i < k; i++) {
          Object object = paramObject[i];
          g();
          jsonWriter.value(object);
        } 
      } else if (paramObject instanceof double[]) {
        paramObject = paramObject;
        j = paramObject.length;
        for (i = bool2; i < j; i++)
          jsonWriter.value(paramObject[i]); 
      } else if (paramObject instanceof boolean[]) {
        paramObject = paramObject;
        j = paramObject.length;
        for (i = bool1; i < j; i++)
          jsonWriter.value(paramObject[i]); 
      } else if (paramObject instanceof Number[]) {
        paramObject = paramObject;
        j = paramObject.length;
        for (i = k; i < j; i++)
          e(paramObject[i]); 
      } else {
        paramObject = paramObject;
        j = paramObject.length;
        while (i < j) {
          e(paramObject[i]);
          i++;
        } 
      } 
      jsonWriter.endArray();
      return this;
    } 
    if (paramObject instanceof java.util.Collection) {
      paramObject = paramObject;
      jsonWriter.beginArray();
      paramObject = paramObject.iterator();
      while (paramObject.hasNext())
        e(paramObject.next()); 
      jsonWriter.endArray();
      return this;
    } 
    if (paramObject instanceof Map) {
      paramObject = paramObject;
      jsonWriter.beginObject();
      for (Map.Entry entry : paramObject.entrySet()) {
        paramObject = entry.getKey();
        try {
          f((String)paramObject, entry.getValue());
        } catch (ClassCastException classCastException) {
          throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[] { paramObject, paramObject.getClass() }), classCastException);
        } 
      } 
      classCastException.endObject();
      return this;
    } 
    f31 f311 = (f31)this.c.get(paramObject.getClass());
    if (f311 != null) {
      classCastException.beginObject();
      f311.a(paramObject, this);
      classCastException.endObject();
      return this;
    } 
    k12 k12 = (k12)this.d.get(paramObject.getClass());
    if (k12 != null) {
      k12.a(paramObject, this);
      return this;
    } 
    if (paramObject instanceof Enum) {
      paramObject = ((Enum)paramObject).name();
      g();
      classCastException.value((String)paramObject);
      return this;
    } 
    classCastException.beginObject();
    this.e.a(paramObject, this);
    classCastException.endObject();
    return this;
  }
  
  public final wk0 f(String paramString, Object paramObject) {
    boolean bool = this.f;
    JsonWriter jsonWriter = this.b;
    if (bool) {
      if (paramObject == null)
        return this; 
      g();
      jsonWriter.name(paramString);
      e(paramObject);
      return this;
    } 
    g();
    jsonWriter.name(paramString);
    if (paramObject == null) {
      jsonWriter.nullValue();
      return this;
    } 
    e(paramObject);
    return this;
  }
  
  public final void g() {
    if (this.a)
      return; 
    tp.f("Parent context used since this context was created. Cannot use this context anymore.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */