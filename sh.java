import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class sh {
  public static final String c;
  
  public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList((Object[])new j40[] { new j40("proto"), new j40("json") })));
  
  public static final sh e;
  
  public final String a;
  
  public final String b;
  
  static {
    e = new sh(str, null);
  }
  
  public sh(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public static sh a(byte[] paramArrayOfbyte) {
    String str = new String(paramArrayOfbyte, Charset.forName("UTF-8"));
    boolean bool = str.startsWith("1$");
    paramArrayOfbyte = null;
    if (bool) {
      String[] arrayOfString = str.substring(2).split(Pattern.quote("\\"), 2);
      if (arrayOfString.length == 2) {
        String str1 = arrayOfString[0];
        if (!str1.isEmpty()) {
          String str2;
          String str3 = arrayOfString[1];
          if (!str3.isEmpty())
            str2 = str3; 
          return new sh(str1, str2);
        } 
        l0.l("Missing endpoint in CCTDestination extras");
        return null;
      } 
      l0.l("Extra is not a valid encoded LegacyFlgDestination");
      return null;
    } 
    l0.l("Version marker missing from extras");
    return null;
  }
  
  static {
    String str = m92.M("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    c = str;
    m92.M("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    m92.M("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */