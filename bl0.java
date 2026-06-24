import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class bl0 {
  public static final j01 j = new j01(5);
  
  public final gh1 a = new gh1(12);
  
  public final n2 b;
  
  public byte[] c;
  
  public Key d;
  
  public final boolean e;
  
  public String f;
  
  public b4 g;
  
  public final Set h;
  
  public final j01 i;
  
  public bl0() {
    n2 n21 = new n2(5, false);
    n21.c = new gh1(12);
    n21.e = new LinkedHashMap<Object, Object>();
    this.b = n21;
    this.e = true;
    this.g = b4.c;
    this.h = Collections.EMPTY_SET;
    this.i = j;
  }
  
  public static bl0 b(String paramString) {
    bl0 bl01;
    String[] arrayOfString2 = paramString.split("\\.");
    String[] arrayOfString1 = arrayOfString2;
    if (paramString.endsWith(".")) {
      arrayOfString1 = new String[arrayOfString2.length + 1];
      System.arraycopy(arrayOfString2, 0, arrayOfString1, 0, arrayOfString2.length);
      arrayOfString1[arrayOfString2.length] = "";
    } 
    if (arrayOfString1.length == 5) {
      bl01 = new bl0();
      ((xk0)bl01).k = new gh1(12);
      ((xk0)bl01).l = "UTF-8";
      ((xk0)bl01).q = b4.c;
    } else {
      if (arrayOfString1.length == 3) {
        bl0 bl02 = new bl0();
        ((zk0)bl02).l = "UTF-8";
        bl01 = bl02;
        if (!Boolean.getBoolean("org.jose4j.jws.default-allow-none")) {
          bl02.g = b4.d;
          bl01 = bl02;
        } 
        bl01.e(arrayOfString1);
        bl01.f = paramString;
        return bl01;
      } 
      throw new Exception("");
    } 
    bl01.e(arrayOfString1);
    bl01.f = paramString;
    return bl01;
  }
  
  public final void a() {
    object = (Object<String>)((Map)this.b.e).get("crit");
    if (object != null) {
      if (object instanceof java.util.List) {
        object = object;
      } else if (object instanceof String[]) {
        object = Arrays.asList((String[])object);
      } else {
        throw new Exception("crit");
      } 
      for (Object<String> object : object) {
        if (this.h.contains(object) || d((String)object))
          continue; 
        throw new Exception("");
      } 
    } 
  }
  
  public final String c() {
    n2 n21 = this.b;
    if ((String)n21.g == null) {
      String str = n21.w();
      gh1 gh11 = (gh1)n21.c;
      gh11.getClass();
      byte[] arrayOfByte = zo2.p(str, "UTF-8");
      n21.g = ((zb)gh11.c).d(arrayOfByte);
    } 
    return (String)n21.g;
  }
  
  public boolean d(String paramString) {
    return false;
  }
  
  public abstract void e(String[] paramArrayOfString);
  
  public final void f(String paramString) {
    if (paramString != null && paramString.length() != 0) {
      n2 n21 = this.b;
      n21.g = paramString;
      paramString = zo2.G("UTF-8", ((zb)((gh1)n21.c).c).b(paramString));
      n21.f = paramString;
      n21.e = zo2.M(paramString);
      return;
    } 
    throw new Exception("");
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append(this.b.w());
    if (this.f != null) {
      stringBuilder.append("->");
      stringBuilder.append(this.f);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */