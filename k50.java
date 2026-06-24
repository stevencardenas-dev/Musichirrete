public abstract class k50 {
  public static final String a = a("Gmbu");
  
  public static final String b = a("Cbtt");
  
  public static final String c = a("Njet");
  
  public static final String d = a("Usfcmf");
  
  public static final String e = a("Cbtt boe Usfcmf");
  
  public static final String f = a("Gvmm Cbtt");
  
  public static final String g = a("Gvmm Njet");
  
  public static final String h = a("Gvmm Usfcmf");
  
  public static final String i = a("Sfevdfe Cbtt");
  
  public static final String j = a("Sfevdfe Njet");
  
  public static final String k = a("Sfevdfe Usfcmf");
  
  public static final String l = a("Op Cbtt");
  
  public static final String m = a("Op Njet");
  
  public static final String n = a("Op Usfcmf");
  
  public static final String o = a("Dmbttjd");
  
  public static final String p = a("Ebodf");
  
  public static final String q = a("Mjwf");
  
  public static final String r = a("Tqfblfs");
  
  public static final String s = a("Qpq");
  
  public static final String t = a("Spdl");
  
  public static final String u = a("Tpgu");
  
  public static final String v = a("Ufdiop");
  
  public static String a(String paramString) {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    for (byte b = 0; b < i; b++) {
      char c1 = paramString.charAt(b);
      char c = c1;
      if (c1 >= 'A') {
        c = c1;
        if (c1 <= 'Z') {
          c1 = (char)(c1 - 1);
          c = c1;
          if (c1 < 'A')
            c = 'Z'; 
        } 
      } 
      c1 = c;
      if (c >= 'a') {
        c1 = c;
        if (c <= 'z') {
          c = (char)(c - 1);
          c1 = c;
          if (c < 'a')
            c1 = 'z'; 
        } 
      } 
      arrayOfChar[b] = c1;
    } 
    return new String(arrayOfChar);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */