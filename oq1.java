public abstract class oq1 extends nq1 {
  public static boolean D0(String paramString1, String paramString2) {
    paramString1.getClass();
    return paramString1.endsWith(paramString2);
  }
  
  public static String E0(String paramString1, String paramString2, String paramString3) {
    int k = gq1.I0(paramString1, paramString2, 0, false);
    if (k < 0)
      return paramString1; 
    int m = paramString2.length();
    int i = 1;
    if (m >= 1)
      i = m; 
    int j = paramString1.length();
    j = paramString3.length() + j - m;
    if (j >= 0) {
      int n;
      StringBuilder stringBuilder = new StringBuilder(j);
      j = 0;
      while (true) {
        stringBuilder.append(paramString1, j, k);
        stringBuilder.append(paramString3);
        n = k + m;
        if (k < paramString1.length()) {
          int i1 = gq1.I0(paramString1, paramString2, k + i, false);
          k = i1;
          j = n;
          if (i1 <= 0)
            break; 
          continue;
        } 
        break;
      } 
      stringBuilder.append(paramString1, n, paramString1.length());
      return stringBuilder.toString();
    } 
    throw new OutOfMemoryError();
  }
  
  public static String F0(String paramString1, String paramString2, String paramString3) {
    int j = gq1.J0(paramString1, paramString2, 0, 2);
    if (j < 0)
      return paramString1; 
    int i = paramString2.length() + j;
    if (i >= j) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString1, 0, j);
      stringBuilder1.append(paramString3);
      stringBuilder1.append(paramString1, i, paramString1.length());
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder("End index (");
    stringBuilder.append(i);
    stringBuilder.append(") is less than start index (");
    stringBuilder.append(j);
    stringBuilder.append(").");
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public static boolean G0(String paramString1, String paramString2) {
    paramString1.getClass();
    return paramString1.startsWith(paramString2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */