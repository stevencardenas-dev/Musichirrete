import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class nw0 implements Comparable {
  public static final Pattern c = Pattern.compile("[\\(\\)<>@,;:\\\\\"/\\[\\]\\?=]");
  
  public static final Pattern e = Pattern.compile("[\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]");
  
  public static final Pattern f = Pattern.compile("(?s)\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*/\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*($|;.*)");
  
  public static final Pattern g = Pattern.compile("(?is)\\s*(charset\\s*=\\s*[^\\c;\\s]+)\\s*;\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*/\\s*([^\\c\\(\\)<>@,;:\\\\\"/\\[\\]\\?=\\s]+)\\s*");
  
  public static final HashMap h = new HashMap<Object, Object>();
  
  public final String b;
  
  static {
    c("application/octet-stream");
    c("text/plain");
    c("application/xml");
    c("application/zip");
  }
  
  public nw0(String paramString, int paramInt) {
    if (paramInt != -1) {
      if (paramString.charAt(paramInt) == '/') {
        if (b(paramString.substring(0, paramInt))) {
          if (b(paramString.substring(paramInt + 1))) {
            this.b = paramString;
            return;
          } 
          throw new AssertionError();
        } 
        throw new AssertionError();
      } 
      throw new AssertionError();
    } 
    throw new AssertionError();
  }
  
  public nw0(String paramString1, String paramString2, Map paramMap) {
    String str = paramString1.trim();
    Locale locale = Locale.ENGLISH;
    str = str.toLowerCase(locale);
    paramString2 = paramString2.trim().toLowerCase(locale);
    str.getClass();
    paramString2.getClass();
    if (paramMap.isEmpty()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append('/');
      stringBuilder1.append(paramString2);
      this.b = stringBuilder1.toString();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append('/');
    stringBuilder.append(paramString2);
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    for (Map.Entry entry : paramMap.entrySet())
      treeMap.put(((String)entry.getKey()).trim().toLowerCase(Locale.ENGLISH), entry.getValue()); 
    for (Map.Entry<Object, Object> entry : treeMap.entrySet()) {
      stringBuilder.append("; ");
      stringBuilder.append((String)entry.getKey());
      stringBuilder.append("=");
      String str1 = (String)entry.getValue();
      if (e.matcher(str1).find()) {
        stringBuilder.append('"');
        stringBuilder.append(c.matcher(str1).replaceAll("\\\\$0"));
        stringBuilder.append('"');
        continue;
      } 
      stringBuilder.append(str1);
    } 
    this.b = stringBuilder.toString();
    Collections.unmodifiableSortedMap(treeMap);
  }
  
  public static nw0 a(String paramString) {
    return c("audio/".concat(paramString));
  }
  
  public static boolean b(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: aload_0
    //   4: invokevirtual length : ()I
    //   7: if_icmpge -> 73
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual charAt : (I)C
    //   15: istore_2
    //   16: iload_2
    //   17: bipush #45
    //   19: if_icmpeq -> 67
    //   22: iload_2
    //   23: bipush #43
    //   25: if_icmpeq -> 67
    //   28: iload_2
    //   29: bipush #46
    //   31: if_icmpeq -> 67
    //   34: iload_2
    //   35: bipush #95
    //   37: if_icmpeq -> 67
    //   40: bipush #48
    //   42: iload_2
    //   43: if_icmpgt -> 52
    //   46: iload_2
    //   47: bipush #57
    //   49: if_icmple -> 67
    //   52: bipush #97
    //   54: iload_2
    //   55: if_icmpgt -> 82
    //   58: iload_2
    //   59: bipush #122
    //   61: if_icmple -> 67
    //   64: goto -> 82
    //   67: iinc #1, 1
    //   70: goto -> 2
    //   73: aload_0
    //   74: invokevirtual length : ()I
    //   77: ifle -> 82
    //   80: iconst_1
    //   81: ireturn
    //   82: iconst_0
    //   83: ireturn
  }
  
  public static nw0 c(String paramString) {
    nw0 nw01;
    String str = null;
    if (paramString == null) {
      paramString = str;
    } else {
      nw0 nw02;
      HashMap<String, nw0> hashMap = h;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
      try {
        nw0 nw03 = (nw0)hashMap.get(paramString);
        nw02 = nw03;
        if (nw03 == null) {
          int i = paramString.indexOf('/');
          if (i == -1) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap}, name=null} */
            return null;
          } 
          nw02 = nw03;
          if (hashMap.size() < 10000) {
            nw02 = nw03;
            if (b(paramString.substring(0, i))) {
              boolean bool = b(paramString.substring(i + 1));
              nw02 = nw03;
              if (bool)
                try {
                
                } finally {
                  Exception exception2 = null;
                  nw02 = nw03;
                  Exception exception1 = exception2;
                }  
            } 
          } 
        } 
      } finally {}
      if (nw02 != null) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{nw0}]>}, name=null} */
        return nw02;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[ObjectType{java/lang/String}, ObjectType{nw0}]>}, name=null} */
      Matcher matcher = f.matcher(paramString);
      if (matcher.matches())
        return new nw0(matcher.group(1), matcher.group(2), d(matcher.group(3))); 
      matcher = g.matcher(paramString);
      paramString = str;
      if (matcher.matches())
        nw01 = new nw0(matcher.group(2), matcher.group(3), d(matcher.group(1))); 
    } 
    return nw01;
  }
  
  public static Map d(String paramString) {
    if (paramString.length() == 0)
      return Collections.EMPTY_MAP; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (paramString.length() > 0) {
      String str1;
      int i = paramString.indexOf(';');
      String str2 = "";
      if (i != -1) {
        str1 = paramString.substring(0, i);
        paramString = paramString.substring(i + 1);
      } else {
        String str = "";
        str1 = paramString;
        paramString = str;
      } 
      i = str1.indexOf('=');
      String str3 = str1;
      if (i != -1) {
        str2 = str1.substring(i + 1);
        str3 = str1.substring(0, i);
      } 
      str3 = str3.trim();
      if (str3.length() > 0) {
        str2 = str2.trim();
        if (str2.startsWith("\"") && str2.endsWith("\"")) {
          str1 = str2.substring(1, str2.length() - 1);
        } else {
          str1 = str2;
          if (str2.startsWith("'")) {
            str1 = str2;
            if (str2.endsWith("'"))
              str1 = str2.substring(1, str2.length() - 1); 
          } 
        } 
        hashMap.put(str3, str1);
      } 
    } 
    return hashMap;
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    return this.b.compareTo(((nw0)paramObject).b);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof nw0) {
      paramObject = paramObject;
      return this.b.equals(((nw0)paramObject).b);
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */