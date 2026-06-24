import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class q31 implements HostnameVerifier {
  public static final q31 a = (q31)new Object();
  
  public static List a(X509Certificate paramX509Certificate, int paramInt) {
    ArrayList<String> arrayList = new ArrayList();
    try {
      Collection<List<?>> collection = paramX509Certificate.getSubjectAlternativeNames();
      if (collection == null)
        return Collections.EMPTY_LIST; 
      for (List<Integer> list : collection) {
        if (list == null || list.size() < 2)
          continue; 
        Integer integer = list.get(0);
        if (integer != null && integer.intValue() == paramInt) {
          String str = (String)list.get(1);
          if (str != null)
            arrayList.add(str); 
        } 
      } 
      return arrayList;
    } catch (CertificateParsingException certificateParsingException) {
      return Collections.EMPTY_LIST;
    } 
  }
  
  public static boolean b(String paramString, X509Certificate paramX509Certificate) {
    List<String> list;
    if (b12.a.matcher(paramString).matches()) {
      list = a(paramX509Certificate, 7);
      int i = list.size();
      byte b = 0;
      while (b < i) {
        if (!paramString.equalsIgnoreCase(list.get(b))) {
          b++;
          continue;
        } 
        return true;
      } 
    } else {
      String str = paramString.toLowerCase(Locale.US);
      for (String str1 : a((X509Certificate)list, 2)) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str1 != null && str1.length() != 0 && !str1.startsWith(".") && !str1.endsWith("..")) {
          if (!str.endsWith(".")) {
            paramString = str.concat(".");
          } else {
            paramString = str;
          } 
          String str2 = str1;
          if (!str1.endsWith("."))
            str2 = str1.concat("."); 
          str2 = str2.toLowerCase(Locale.US);
          if (!str2.contains("*")) {
            boolean bool1 = paramString.equals(str2);
            continue;
          } 
          if (str2.startsWith("*.") && str2.indexOf('*', 1) == -1 && paramString.length() >= str2.length() && !"*.".equals(str2)) {
            str2 = str2.substring(1);
            if (paramString.endsWith(str2)) {
              int i = paramString.length() - str2.length();
              if (i <= 0 || paramString.lastIndexOf('.', i - 1) == -1) {
                boolean bool1 = true;
                continue;
              } 
            } 
          } 
        } 
        boolean bool = false;
        continue;
        if (SYNTHETIC_LOCAL_VARIABLE_4 != null)
          return true; 
      } 
    } 
    return false;
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession) {
    boolean bool1;
    boolean bool2 = false;
    try {
      bool1 = b(paramString, (X509Certificate)paramSSLSession.getPeerCertificates()[0]);
    } catch (SSLException sSLException) {
      bool1 = bool2;
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */