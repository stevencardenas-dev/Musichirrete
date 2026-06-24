import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import java.util.TreeMap;

public final class gl {
  public static final TreeMap b = new TreeMap<Object, Object>(new ij(3));
  
  public static final gl c = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
  
  public static final gl d = a("TLS_RSA_WITH_AES_128_CBC_SHA");
  
  public static final gl e = a("TLS_RSA_WITH_AES_256_CBC_SHA");
  
  public static final gl f = a("TLS_RSA_WITH_AES_128_GCM_SHA256");
  
  public static final gl g = a("TLS_RSA_WITH_AES_256_GCM_SHA384");
  
  public static final gl h = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
  
  public static final gl i = a(nBRIsU.DAxMyrXmoASB);
  
  public static final gl j = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
  
  public static final gl k = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
  
  public static final gl l = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
  
  public static final gl m = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
  
  public static final gl n = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
  
  public static final gl o = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
  
  public final String a;
  
  static {
    a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
  }
  
  public gl(String paramString) {
    paramString.getClass();
    this.a = paramString;
  }
  
  public static gl a(String paramString) {
    gl gl1;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{gl}} */
    try {
      TreeMap<String, gl> treeMap = b;
      gl gl2 = (gl)treeMap.get(paramString);
      gl1 = gl2;
      if (gl2 == null) {
        gl1 = new gl();
        this(paramString);
        treeMap.put(paramString, gl1);
      } 
    } finally {}
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{gl}} */
    return gl1;
  }
  
  public final String toString() {
    return this.a;
  }
  
  static {
    a(oXrNDUqUkE.CrzU);
    a("SSL_RSA_WITH_NULL_SHA");
    a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    a("SSL_RSA_WITH_RC4_128_MD5");
    a("SSL_RSA_WITH_RC4_128_SHA");
    a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    a("SSL_RSA_WITH_DES_CBC_SHA");
  }
  
  static {
    a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    a("SSL_DH_anon_WITH_RC4_128_MD5");
    a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    a("SSL_DH_anon_WITH_DES_CBC_SHA");
    a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    a("TLS_KRB5_WITH_DES_CBC_SHA");
    a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    a("TLS_KRB5_WITH_RC4_128_SHA");
    a("TLS_KRB5_WITH_DES_CBC_MD5");
    a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    a("TLS_KRB5_WITH_RC4_128_MD5");
    a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
  }
  
  static {
    a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
  }
  
  static {
    a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    a("TLS_RSA_WITH_NULL_SHA256");
    a("TLS_RSA_WITH_AES_128_CBC_SHA256");
    a("TLS_RSA_WITH_AES_256_CBC_SHA256");
    a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    a("TLS_PSK_WITH_RC4_128_SHA");
    a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    a("TLS_PSK_WITH_AES_128_CBC_SHA");
    a("TLS_PSK_WITH_AES_256_CBC_SHA");
    a("TLS_RSA_WITH_SEED_CBC_SHA");
  }
  
  static {
    a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    a("TLS_FALLBACK_SCSV");
    a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    a(tlzLOCPTHRhep.SvhhkSet);
    a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    a("TLS_ECDH_RSA_WITH_NULL_SHA");
    a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    a("TLS_ECDHE_RSA_WITH_NULL_SHA");
    a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
  }
  
  static {
    a("TLS_ECDH_anon_WITH_NULL_SHA");
    a("TLS_ECDH_anon_WITH_RC4_128_SHA");
    a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
  }
  
  static {
    a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
  }
  
  static {
    a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */