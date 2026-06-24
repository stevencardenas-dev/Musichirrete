import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.util.HashMap;

public abstract class h0 {
  public static final HashMap a;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a = hashMap;
    hashMap.put("0", "0000");
    hashMap.put("1", "0001");
    hashMap.put("2", "0010");
    hashMap.put("3", "0011");
    hashMap.put("4", "0100");
    hashMap.put("5", "0101");
    hashMap.put("6", "0110");
    hashMap.put("7", "0111");
    hashMap.put("8", "1000");
    hashMap.put("9", "1001");
    hashMap.put("a", "1010");
    hashMap.put("b", "1011");
    hashMap.put("c", "1100");
    hashMap.put("d", ybWnIKHovcRr.yUeDVhCGtJNHG);
    hashMap.put("e", "1110");
    hashMap.put(KjdXPYm.AYQYf, "1111");
  }
  
  public static String e(byte paramByte) {
    String str2 = Integer.toHexString(paramByte);
    String str1 = "";
    try {
      if (str2.length() == 8) {
        str = str2.substring(6, 7);
        str1 = str2.substring(7, 8);
      } else if (str2.length() == 2) {
        str = str2.substring(0, 1);
        str1 = str2.substring(1, 2);
      } else if (str2.length() == 1) {
        str = "0";
        str1 = str2.substring(0, 1);
      } else {
        str = "";
        StringBuilder stringBuilder1 = new StringBuilder();
        HashMap hashMap1 = a;
        stringBuilder1.append((String)hashMap1.get(str1));
        stringBuilder1.append((String)hashMap1.get(str));
        return stringBuilder1.toString();
      } 
      str2 = str1;
      str1 = str;
      String str = str2;
      StringBuilder stringBuilder = new StringBuilder();
      HashMap hashMap = a;
      stringBuilder.append((String)hashMap.get(str1));
      stringBuilder.append((String)hashMap.get(str));
      return stringBuilder.toString();
    } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
      return "";
    } 
  }
  
  public abstract void a(String paramString, int paramInt);
  
  public abstract void b(String paramString1, String paramString2);
  
  public abstract void c(String paramString, boolean paramBoolean);
  
  public abstract void d(String paramString);
  
  public abstract void f(String paramString1, String paramString2);
  
  public abstract String toString();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */