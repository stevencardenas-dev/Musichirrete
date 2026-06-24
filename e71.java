import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class e71 {
  public static final e71 a;
  
  static {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 'com.android.org.conscrypt.SSLParametersImpl'
    //   4: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7: pop
    //   8: goto -> 18
    //   11: astore_1
    //   12: ldc 'org.apache.harmony.xnet.provider.jsse.SSLParametersImpl'
    //   14: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   17: pop
    //   18: ldc 'GMSCore_OpenSSL'
    //   20: invokestatic getProvider : (Ljava/lang/String;)Ljava/security/Provider;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull -> 31
    //   28: goto -> 37
    //   31: ldc 'android.net.Network'
    //   33: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   36: pop
    //   37: new v4
    //   40: astore_1
    //   41: aload_1
    //   42: iconst_0
    //   43: invokespecial <init> : (I)V
    //   46: ldc 'dalvik.system.CloseGuard'
    //   48: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   51: astore_3
    //   52: aload_3
    //   53: ldc 'get'
    //   55: aconst_null
    //   56: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   59: pop
    //   60: aload_3
    //   61: ldc 'open'
    //   63: iconst_1
    //   64: anewarray java/lang/Class
    //   67: dup
    //   68: iconst_0
    //   69: ldc java/lang/String
    //   71: aastore
    //   72: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   75: pop
    //   76: aload_3
    //   77: ldc 'warnIfOpen'
    //   79: aconst_null
    //   80: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   83: pop
    //   84: goto -> 90
    //   87: astore_1
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_1
    //   91: ifnull -> 97
    //   94: goto -> 292
    //   97: ldc 'conscrypt'
    //   99: ldc 'okhttp.platform'
    //   101: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   104: invokevirtual equals : (Ljava/lang/Object;)Z
    //   107: ifeq -> 115
    //   110: iconst_1
    //   111: istore_0
    //   112: goto -> 129
    //   115: ldc 'Conscrypt'
    //   117: invokestatic getProviders : ()[Ljava/security/Provider;
    //   120: iconst_0
    //   121: aaload
    //   122: invokevirtual getName : ()Ljava/lang/String;
    //   125: invokevirtual equals : (Ljava/lang/Object;)Z
    //   128: istore_0
    //   129: iload_0
    //   130: ifeq -> 144
    //   133: invokestatic e : ()Lzp;
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull -> 144
    //   141: goto -> 292
    //   144: ldc javax/net/ssl/SSLParameters
    //   146: ldc 'setApplicationProtocols'
    //   148: iconst_1
    //   149: anewarray java/lang/Class
    //   152: dup
    //   153: iconst_0
    //   154: ldc [Ljava/lang/String;
    //   156: aastore
    //   157: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   160: pop
    //   161: ldc javax/net/ssl/SSLSocket
    //   163: ldc 'getApplicationProtocol'
    //   165: aconst_null
    //   166: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   169: pop
    //   170: new v4
    //   173: astore_1
    //   174: aload_1
    //   175: iconst_1
    //   176: invokespecial <init> : (I)V
    //   179: goto -> 185
    //   182: astore_1
    //   183: aconst_null
    //   184: astore_1
    //   185: aload_1
    //   186: ifnull -> 192
    //   189: goto -> 292
    //   192: ldc 'org.eclipse.jetty.alpn.ALPN'
    //   194: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   197: astore_3
    //   198: ldc 'org.eclipse.jetty.alpn.ALPN$Provider'
    //   200: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   203: astore_1
    //   204: ldc 'org.eclipse.jetty.alpn.ALPN$ClientProvider'
    //   206: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   209: pop
    //   210: ldc 'org.eclipse.jetty.alpn.ALPN$ServerProvider'
    //   212: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   215: pop
    //   216: aload_3
    //   217: ldc 'put'
    //   219: iconst_2
    //   220: anewarray java/lang/Class
    //   223: dup
    //   224: iconst_0
    //   225: ldc javax/net/ssl/SSLSocket
    //   227: aastore
    //   228: dup
    //   229: iconst_1
    //   230: aload_1
    //   231: aastore
    //   232: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   235: pop
    //   236: aload_3
    //   237: ldc 'get'
    //   239: iconst_1
    //   240: anewarray java/lang/Class
    //   243: dup
    //   244: iconst_0
    //   245: ldc javax/net/ssl/SSLSocket
    //   247: aastore
    //   248: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   251: pop
    //   252: aload_3
    //   253: ldc 'remove'
    //   255: iconst_1
    //   256: anewarray java/lang/Class
    //   259: dup
    //   260: iconst_0
    //   261: ldc javax/net/ssl/SSLSocket
    //   263: aastore
    //   264: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   267: pop
    //   268: new v4
    //   271: astore_1
    //   272: aload_1
    //   273: iconst_2
    //   274: invokespecial <init> : (I)V
    //   277: aload_1
    //   278: ifnull -> 284
    //   281: goto -> 292
    //   284: new java/lang/Object
    //   287: dup
    //   288: invokespecial <init> : ()V
    //   291: astore_1
    //   292: aload_1
    //   293: putstatic e71.a : Le71;
    //   296: ldc r31
    //   298: invokevirtual getName : ()Ljava/lang/String;
    //   301: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
    //   304: pop
    //   305: return
    //   306: astore_1
    //   307: goto -> 37
    //   310: astore_3
    //   311: goto -> 90
    //   314: astore_1
    //   315: aload_2
    //   316: astore_1
    //   317: goto -> 277
    // Exception table:
    //   from	to	target	type
    //   2	8	11	java/lang/ClassNotFoundException
    //   12	18	87	java/lang/ClassNotFoundException
    //   18	24	87	java/lang/ClassNotFoundException
    //   31	37	306	java/lang/ClassNotFoundException
    //   37	46	87	java/lang/ClassNotFoundException
    //   46	84	310	java/lang/Exception
    //   144	179	182	java/lang/NoSuchMethodException
    //   192	277	314	java/lang/ClassNotFoundException
    //   192	277	314	java/lang/NoSuchMethodException
  }
  
  public ws2 a(X509TrustManager paramX509TrustManager) {
    return new le(b(paramX509TrustManager));
  }
  
  public ey1 b(X509TrustManager paramX509TrustManager) {
    return new se(paramX509TrustManager.getAcceptedIssuers());
  }
  
  public void c(SSLSocketFactory paramSSLSocketFactory) {}
  
  public SSLContext d() {
    if ("1.7".equals(System.getProperty("java.specification.version")))
      try {
        return SSLContext.getInstance("TLSv1.2");
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {} 
    try {
      return SSLContext.getInstance("TLS");
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw new IllegalStateException("No TLS provider", noSuchAlgorithmException);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */