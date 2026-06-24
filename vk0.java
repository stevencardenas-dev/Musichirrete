import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class vk0 {
  static {
    Pattern.compile("\\\\.");
    Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  }
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    if (paramObject1 != null || paramObject2 != null) {
      if (paramObject1 != null && paramObject2 != null)
        if (paramObject1 instanceof org.json.JSONObject && paramObject2 instanceof org.json.JSONObject) {
          paramObject1 = paramObject1;
          paramObject2 = paramObject2;
          if (paramObject1.length() == paramObject2.length()) {
            Iterator<String> iterator = paramObject1.keys();
            while (true) {
              if (iterator.hasNext()) {
                String str = iterator.next();
                if (paramObject2.has(str))
                  try {
                    n21.m(str);
                    boolean bool = a(paramObject1.get(str), paramObject2.get(str));
                    if (!bool)
                      return false; 
                    continue;
                  } catch (JSONException jSONException) {} 
              } else {
                return true;
              } 
              return false;
            } 
          } 
        } else {
          JSONArray jSONArray;
          if (jSONException instanceof JSONArray && paramObject2 instanceof JSONArray) {
            jSONArray = (JSONArray)jSONException;
            paramObject2 = paramObject2;
            if (jSONArray.length() == paramObject2.length()) {
              byte b = 0;
              while (b < jSONArray.length()) {
                boolean bool = a(jSONArray.get(b), paramObject2.get(b));
                if (bool) {
                  b++;
                  continue;
                } 
                // Byte code: goto -> 199
              } 
              return true;
            } 
          } else {
            return jSONArray.equals(paramObject2);
          } 
        }  
    } else {
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */