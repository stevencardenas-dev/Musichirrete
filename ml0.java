import java.io.Serializable;

public final class ml0 implements Serializable {
  public final String b;
  
  public ml0(String paramString) {
    this.b = paramString;
  }
  
  public static String a(String paramString) {
    return paramString.replace("/", " › ");
  }
  
  public static String b(String paramString) {
    String str;
    try {
      int i = paramString.lastIndexOf('/');
      str = paramString;
    } finally {
      Exception exception = null;
    } 
    return str;
  }
  
  public static String c(String paramString) {
    try {
      int i = paramString.lastIndexOf('/');
      if (i >= 0)
        return paramString.substring(0, i); 
    } finally {}
    return null;
  }
  
  public static String f(String paramString) {
    if (paramString != null) {
      String str = paramString;
      try {
        if (paramString.startsWith("Storage/")) {
          int i = paramString.indexOf('/', 8);
          if (i == -1)
            return ""; 
          str = paramString.substring(i + 1);
        } 
        return str;
      } finally {}
    } 
    return null;
  }
  
  public static String g(String paramString) {
    if (paramString != null)
      try {
      
      } finally {
        paramString = null;
      }  
    return null;
  }
  
  public final ml0 d() {
    String str = c(this.b);
    return (str == null) ? null : new ml0(str);
  }
  
  public final String e() {
    return this.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ml0) {
      paramObject = ((ml0)paramObject).b;
      String str = this.b;
      return (str == paramObject || (str != null && str.equalsIgnoreCase((String)paramObject)));
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ml0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */