public abstract class uj0 {
  public static final int a;
  
  static {
    String str = System.getProperty("java.version");
    byte b = 0;
    try {
      String[] arrayOfString = str.split("[._]", 3);
      int k = Integer.parseInt(arrayOfString[0]);
      j = k;
      if (k == 1) {
        j = k;
        if (arrayOfString.length > 1)
          j = Integer.parseInt(arrayOfString[1]); 
      } 
    } catch (NumberFormatException numberFormatException) {
      j = -1;
    } 
    int i = j;
    if (j == -1)
      try {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        i = b;
        while (i < str.length()) {
          char c = str.charAt(i);
          if (Character.isDigit(c)) {
            stringBuilder.append(c);
            i++;
          } 
        } 
        i = Integer.parseInt(stringBuilder.toString());
      } catch (NumberFormatException numberFormatException) {
        i = -1;
      }  
    int j = i;
    if (i == -1)
      j = 6; 
    a = j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */