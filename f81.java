import java.util.HashMap;

public final class f81 {
  public final HashMap a = null;
  
  public f81() {
    this.a = new HashMap<Object, Object>();
  }
  
  public final String a(String paramString) {
    String[] arrayOfString = (String[])this.a.get(paramString);
    return (arrayOfString == null) ? null : arrayOfString[0];
  }
  
  public final void b(String paramString1, String paramString2) {
    this.a.put(paramString1, new String[] { paramString2 });
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof f81)
      try {
        HashMap hashMap2 = ((f81)paramObject).a;
        int i = hashMap2.size();
        HashMap hashMap1 = this.a;
        if (i == hashMap1.size()) {
          String[] arrayOfString = (String[])hashMap1.keySet().toArray((Object[])new String[0]);
          for (i = 0; i < arrayOfString.length; i++) {
            String[] arrayOfString1 = (String[])hashMap2.get(arrayOfString[i]);
            paramObject = arrayOfString1;
            if (arrayOfString1 == null)
              paramObject = new String[0]; 
            String[] arrayOfString2 = (String[])hashMap1.get(arrayOfString[i]);
            arrayOfString1 = arrayOfString2;
            if (arrayOfString2 == null)
              arrayOfString1 = new String[0]; 
            if (paramObject.length != arrayOfString1.length)
              continue; 
            byte b = 0;
            while (b < paramObject.length) {
              if (paramObject[b].equals(arrayOfString1[b])) {
                b++;
                continue;
              } 
              return false;
            } 
          } 
          return true;
        } 
        return false;
      } catch (ClassCastException classCastException) {
        return false;
      }  
    return false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    HashMap hashMap = this.a;
    String[] arrayOfString = (String[])hashMap.keySet().toArray((Object[])new String[0]);
    for (byte b = 0; b < arrayOfString.length; b++) {
      String[] arrayOfString2 = (String[])hashMap.get(arrayOfString[b]);
      String[] arrayOfString1 = arrayOfString2;
      if (arrayOfString2 == null)
        arrayOfString1 = new String[0]; 
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        stringBuilder.append(arrayOfString[b]);
        stringBuilder.append("=");
        stringBuilder.append(arrayOfString1[b1]);
        stringBuilder.append(" ");
      } 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */