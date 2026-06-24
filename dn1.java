import in.krosbits.musicolet.MyApplication;
import org.json.JSONArray;

public abstract class dn1 {
  public static final String a = (new JSONArray()).put((new JSONArray()).put(1).put(30)).put((new JSONArray()).put(0).put(15)).toString();
  
  public static final String b = (new JSONArray()).put(10).put(5).toString();
  
  public static int[] a(int paramInt) {
    int[] arrayOfInt = new int[2];
    try {
      JSONArray jSONArray = new JSONArray();
      this(MyApplication.o().getString("k_jia_slptrh_hm", a));
      if (paramInt < jSONArray.length()) {
        jSONArray = jSONArray.getJSONArray(jSONArray.length() - 1 - paramInt);
        arrayOfInt[0] = jSONArray.getInt(0);
        arrayOfInt[1] = jSONArray.getInt(1);
        return arrayOfInt;
      } 
    } finally {
      Exception exception;
    } 
    return arrayOfInt;
  }
  
  public static int b(int paramInt) {
    try {
      JSONArray jSONArray = new JSONArray();
      this(MyApplication.o().getString("k_jia_slptrh_n", b));
      if (paramInt < jSONArray.length())
        return jSONArray.getInt(jSONArray.length() - 1 - paramInt); 
    } finally {
      Exception exception;
    } 
    return 0;
  }
  
  public static void c(int paramInt1, int paramInt2) {
    try {
      JSONArray jSONArray1 = new JSONArray();
      this(MyApplication.o().getString("k_jia_slptrh_hm", a));
      for (byte b = 0; b < jSONArray1.length(); b++) {
        JSONArray jSONArray = jSONArray1.getJSONArray(b);
        if (jSONArray.getInt(0) == paramInt1 && jSONArray.getInt(1) == paramInt2) {
          jSONArray1.remove(b);
          break;
        } 
      } 
      if (jSONArray1.length() == 5)
        jSONArray1.remove(0); 
      JSONArray jSONArray2 = new JSONArray();
      this();
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public static void d(int paramInt) {
    try {
      JSONArray jSONArray = new JSONArray();
      this(MyApplication.o().getString("k_jia_slptrh_n", b));
      for (byte b = 0; b < jSONArray.length(); b++) {
        if (jSONArray.getInt(b) == paramInt) {
          jSONArray.remove(b);
          break;
        } 
      } 
      if (jSONArray.length() == 5)
        jSONArray.remove(0); 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */