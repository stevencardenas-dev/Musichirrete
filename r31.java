import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

public final class r31 implements Cloneable {
  public static final List g = Collections.unmodifiableList(Arrays.asList((Object[])(new vp[2]).clone()));
  
  public final List b;
  
  public final List c;
  
  public final SSLSocketFactory e;
  
  public final ws2 f;
  
  public r31(n2 paramn2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: getfield c : Ljava/lang/Object;
    //   8: checkcast java/util/List
    //   11: astore_3
    //   12: aload_0
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: aload_1
    //   18: getfield e : Ljava/lang/Object;
    //   21: checkcast java/util/ArrayList
    //   24: invokespecial <init> : (Ljava/util/Collection;)V
    //   27: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   30: putfield b : Ljava/util/List;
    //   33: aload_0
    //   34: new java/util/ArrayList
    //   37: dup
    //   38: aload_1
    //   39: getfield f : Ljava/lang/Object;
    //   42: checkcast java/util/ArrayList
    //   45: invokespecial <init> : (Ljava/util/Collection;)V
    //   48: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   51: putfield c : Ljava/util/List;
    //   54: aload_3
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #4
    //   62: iconst_0
    //   63: istore_2
    //   64: aload #4
    //   66: invokeinterface hasNext : ()Z
    //   71: ifeq -> 101
    //   74: aload #4
    //   76: invokeinterface next : ()Ljava/lang/Object;
    //   81: checkcast vp
    //   84: astore_3
    //   85: iload_2
    //   86: ifne -> 96
    //   89: aload_3
    //   90: getfield a : Z
    //   93: ifeq -> 62
    //   96: iconst_1
    //   97: istore_2
    //   98: goto -> 64
    //   101: iload_2
    //   102: ifne -> 118
    //   105: aload_0
    //   106: aconst_null
    //   107: putfield e : Ljavax/net/ssl/SSLSocketFactory;
    //   110: aload_0
    //   111: aconst_null
    //   112: putfield f : Lws2;
    //   115: goto -> 210
    //   118: invokestatic getDefaultAlgorithm : ()Ljava/lang/String;
    //   121: invokestatic getInstance : (Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   124: astore_3
    //   125: aload_3
    //   126: aconst_null
    //   127: invokevirtual init : (Ljava/security/KeyStore;)V
    //   130: aload_3
    //   131: invokevirtual getTrustManagers : ()[Ljavax/net/ssl/TrustManager;
    //   134: astore_3
    //   135: aload_3
    //   136: arraylength
    //   137: iconst_1
    //   138: if_icmpne -> 324
    //   141: aload_3
    //   142: iconst_0
    //   143: aaload
    //   144: astore #4
    //   146: aload #4
    //   148: instanceof javax/net/ssl/X509TrustManager
    //   151: ifeq -> 324
    //   154: aload #4
    //   156: checkcast javax/net/ssl/X509TrustManager
    //   159: astore_3
    //   160: getstatic e71.a : Le71;
    //   163: astore #4
    //   165: aload #4
    //   167: invokevirtual d : ()Ljavax/net/ssl/SSLContext;
    //   170: astore #5
    //   172: aload #5
    //   174: aconst_null
    //   175: iconst_1
    //   176: anewarray javax/net/ssl/TrustManager
    //   179: dup
    //   180: iconst_0
    //   181: aload_3
    //   182: aastore
    //   183: aconst_null
    //   184: invokevirtual init : ([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   187: aload #5
    //   189: invokevirtual getSocketFactory : ()Ljavax/net/ssl/SSLSocketFactory;
    //   192: astore #5
    //   194: aload_0
    //   195: aload #5
    //   197: putfield e : Ljavax/net/ssl/SSLSocketFactory;
    //   200: aload_0
    //   201: aload #4
    //   203: aload_3
    //   204: invokevirtual a : (Ljavax/net/ssl/X509TrustManager;)Lws2;
    //   207: putfield f : Lws2;
    //   210: aload_0
    //   211: getfield e : Ljavax/net/ssl/SSLSocketFactory;
    //   214: astore_3
    //   215: aload_3
    //   216: ifnull -> 226
    //   219: getstatic e71.a : Le71;
    //   222: aload_3
    //   223: invokevirtual c : (Ljavax/net/ssl/SSLSocketFactory;)V
    //   226: aload_1
    //   227: getfield g : Ljava/lang/Object;
    //   230: checkcast uj
    //   233: astore_3
    //   234: aload_0
    //   235: getfield f : Lws2;
    //   238: astore_1
    //   239: aload_3
    //   240: invokevirtual getClass : ()Ljava/lang/Class;
    //   243: pop
    //   244: aload_1
    //   245: ifnull -> 252
    //   248: new uj
    //   251: astore_1
    //   252: aload_0
    //   253: getfield b : Ljava/util/List;
    //   256: aconst_null
    //   257: invokeinterface contains : (Ljava/lang/Object;)Z
    //   262: ifne -> 290
    //   265: aload_0
    //   266: getfield c : Ljava/util/List;
    //   269: aconst_null
    //   270: invokeinterface contains : (Ljava/lang/Object;)Z
    //   275: ifne -> 279
    //   278: return
    //   279: ldc 'Null network interceptor: '
    //   281: aload_0
    //   282: getfield c : Ljava/util/List;
    //   285: invokestatic p : (Ljava/lang/String;Ljava/lang/Object;)V
    //   288: aconst_null
    //   289: athrow
    //   290: ldc 'Null interceptor: '
    //   292: aload_0
    //   293: getfield b : Ljava/util/List;
    //   296: invokestatic p : (Ljava/lang/String;Ljava/lang/Object;)V
    //   299: aconst_null
    //   300: athrow
    //   301: astore_3
    //   302: new java/lang/AssertionError
    //   305: dup
    //   306: ldc 'No System TLS'
    //   308: invokespecial <init> : (Ljava/lang/Object;)V
    //   311: astore_1
    //   312: aload_1
    //   313: aload_3
    //   314: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   317: pop
    //   318: aload_1
    //   319: athrow
    //   320: astore_3
    //   321: goto -> 361
    //   324: new java/lang/IllegalStateException
    //   327: astore_1
    //   328: new java/lang/StringBuilder
    //   331: astore #4
    //   333: aload #4
    //   335: ldc 'Unexpected default trust managers:'
    //   337: invokespecial <init> : (Ljava/lang/String;)V
    //   340: aload #4
    //   342: aload_3
    //   343: invokestatic toString : ([Ljava/lang/Object;)Ljava/lang/String;
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: pop
    //   350: aload_1
    //   351: aload #4
    //   353: invokevirtual toString : ()Ljava/lang/String;
    //   356: invokespecial <init> : (Ljava/lang/String;)V
    //   359: aload_1
    //   360: athrow
    //   361: new java/lang/AssertionError
    //   364: dup
    //   365: ldc 'No System TLS'
    //   367: invokespecial <init> : (Ljava/lang/Object;)V
    //   370: astore_1
    //   371: aload_1
    //   372: aload_3
    //   373: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   376: pop
    //   377: aload_1
    //   378: athrow
    //   379: astore_3
    //   380: goto -> 318
    //   383: astore_3
    //   384: goto -> 377
    // Exception table:
    //   from	to	target	type
    //   118	141	320	java/security/GeneralSecurityException
    //   146	160	320	java/security/GeneralSecurityException
    //   160	194	301	java/security/GeneralSecurityException
    //   312	318	379	java/lang/IllegalStateException
    //   324	361	320	java/security/GeneralSecurityException
    //   371	377	383	java/lang/IllegalStateException
  }
  
  static {
    db1 db12 = db1.e;
    db1 db11 = db1.c;
    Pattern pattern = b12.a;
    (new db1[2])[0] = db12;
    (new db1[2])[1] = db11;
    Collections.unmodifiableList(Arrays.asList((Object[])(new db1[2]).clone()));
    (new vp[2])[0] = vp.e;
    (new vp[2])[1] = vp.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */