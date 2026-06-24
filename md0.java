import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public final class md0 {
  public static final ConcurrentHashMap n = new ConcurrentHashMap<Object, Object>();
  
  public final String[] a;
  
  public final String[] b;
  
  public final String[] c;
  
  public final String[] d;
  
  public final String[] e;
  
  public final String[] f;
  
  public final TreeMap g;
  
  public final TreeMap h;
  
  public final TreeMap i;
  
  public final int j;
  
  public final int k;
  
  public final int l;
  
  public final int m;
  
  public md0(Locale paramLocale) {
    DateFormatSymbols dateFormatSymbols = ev.a(paramLocale);
    this.a = dateFormatSymbols.getEras();
    String[] arrayOfString2 = dateFormatSymbols.getWeekdays();
    String[] arrayOfString1 = new String[8];
    boolean bool = true;
    byte b;
    for (b = 1; b < 8; b++) {
      boolean bool1;
      if (b < 7) {
        bool1 = b + 1;
      } else {
        bool1 = true;
      } 
      arrayOfString1[b] = arrayOfString2[bool1];
    } 
    this.b = arrayOfString1;
    arrayOfString1 = dateFormatSymbols.getShortWeekdays();
    arrayOfString2 = new String[8];
    for (b = 1; b < 8; b++) {
      boolean bool1;
      if (b < 7) {
        bool1 = b + 1;
      } else {
        bool1 = true;
      } 
      arrayOfString2[b] = arrayOfString1[bool1];
    } 
    this.c = arrayOfString2;
    arrayOfString1 = dateFormatSymbols.getMonths();
    arrayOfString2 = new String[13];
    for (b = 1; b < 13; b++)
      arrayOfString2[b] = arrayOfString1[b - 1]; 
    this.d = arrayOfString2;
    arrayOfString2 = dateFormatSymbols.getShortMonths();
    arrayOfString1 = new String[13];
    for (b = 1; b < 13; b++)
      arrayOfString1[b] = arrayOfString2[b - 1]; 
    this.e = arrayOfString1;
    this.f = dateFormatSymbols.getAmPmStrings();
    Integer[] arrayOfInteger = new Integer[13];
    for (b = 0; b < 13; b++)
      arrayOfInteger[b] = Integer.valueOf(b); 
    Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
    TreeMap<String, Object> treeMap2 = new TreeMap<String, Object>(comparator);
    this.g = treeMap2;
    a(treeMap2, this.a, arrayOfInteger);
    if ("en".equals(paramLocale.getLanguage())) {
      treeMap2.put("BCE", arrayOfInteger[0]);
      treeMap2.put("CE", arrayOfInteger[1]);
    } 
    TreeMap<String, Object> treeMap1 = new TreeMap<String, Object>(comparator);
    this.h = treeMap1;
    a(treeMap1, this.b, arrayOfInteger);
    a(treeMap1, this.c, arrayOfInteger);
    for (b = 1; b <= 7; b++)
      treeMap1.put(String.valueOf(b).intern(), arrayOfInteger[b]); 
    treeMap1 = new TreeMap<String, Object>(comparator);
    this.i = treeMap1;
    a(treeMap1, this.d, arrayOfInteger);
    a(treeMap1, this.e, arrayOfInteger);
    for (b = bool; b <= 12; b++)
      treeMap1.put(String.valueOf(b).intern(), arrayOfInteger[b]); 
    this.j = c(this.a);
    this.k = c(this.b);
    c(this.c);
    this.l = c(this.d);
    c(this.e);
    this.m = c(this.f);
  }
  
  public static void a(TreeMap<String, Integer> paramTreeMap, String[] paramArrayOfString, Integer[] paramArrayOfInteger) {
    int i = paramArrayOfString.length;
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        String str = paramArrayOfString[j];
        i = j;
        if (str != null) {
          paramTreeMap.put(str, paramArrayOfInteger[j]);
          i = j;
        } 
        continue;
      } 
      break;
    } 
  }
  
  public static md0 b(Locale paramLocale) {
    Locale locale = paramLocale;
    if (paramLocale == null)
      locale = Locale.getDefault(); 
    ConcurrentHashMap<Locale, md0> concurrentHashMap = n;
    md0 md02 = (md0)concurrentHashMap.get(locale);
    md0 md01 = md02;
    if (md02 == null) {
      md01 = new md0(locale);
      md0 md03 = concurrentHashMap.putIfAbsent(locale, md01);
      if (md03 != null)
        return md03; 
    } 
    return md01;
  }
  
  public static int c(String[] paramArrayOfString) {
    int i = paramArrayOfString.length;
    int j = 0;
    while (true) {
      int k = i - 1;
      if (k >= 0) {
        String str = paramArrayOfString[k];
        i = k;
        if (str != null) {
          int m = str.length();
          i = k;
          if (m > j) {
            j = m;
            i = k;
          } 
        } 
        continue;
      } 
      return j;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\md0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */