import android.os.SystemClock;
import android.text.TextUtils;
import android.window.ldG.XUaAMlaMSa;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.json.JSONObject;

public abstract class qj {
  public static final Pattern a = Pattern.compile(XUaAMlaMSa.zhSxDHCuX);
  
  public static final Random b = new Random(SystemClock.elapsedRealtime());
  
  public static String a(JSONObject paramJSONObject, String paramString) {
    return (paramJSONObject != null && paramJSONObject.has(paramString)) ? paramJSONObject.optString(paramString) : null;
  }
  
  public static void b(String paramString) {
    if (!TextUtils.isEmpty(paramString)) {
      if (paramString.length() <= 128) {
        if (paramString.startsWith("urn:x-cast:")) {
          if (paramString.length() != 11)
            return; 
          l0.l(uvJYmft.LNUzwQHJNDEY);
          return;
        } 
        l0.l("Namespace must begin with the prefix \"urn:x-cast:\"");
        return;
      } 
      l0.l("Invalid namespace length");
      return;
    } 
    l0.l("Namespace cannot be null or empty");
  }
  
  public static boolean c(Object paramObject1, Object paramObject2) {
    return (paramObject1 != null || paramObject2 != null) ? ((paramObject1 != null && paramObject2 != null && paramObject1.equals(paramObject2))) : true;
  }
  
  public static int[] d(AbstractCollection paramAbstractCollection) {
    int[] arrayOfInt = new int[paramAbstractCollection.size()];
    Iterator iterator = paramAbstractCollection.iterator();
    for (byte b = 0; iterator.hasNext(); b++)
      arrayOfInt[b] = ((Integer)iterator.next()).intValue(); 
    return arrayOfInt;
  }
  
  public static ArrayList e(int[] paramArrayOfint) {
    ArrayList<Integer> arrayList = new ArrayList();
    int i = paramArrayOfint.length;
    for (byte b = 0; b < i; b++)
      arrayList.add(Integer.valueOf(paramArrayOfint[b])); 
    return arrayList;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */