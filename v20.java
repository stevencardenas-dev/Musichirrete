import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.KeyAgreement;

public final class v20 extends e4 implements il0 {
  public String c = "enc";
  
  public v20() {
    this.a = "ECDH-ES";
    this.b = "ECDH";
  }
  
  public final void a(Key paramKey, qr paramqr) {
    if (paramKey != null)
      try {
        paramKey = ECPrivateKey.class.cast(paramKey);
        return;
      } catch (ClassCastException classCastException) {
        m60.f();
        return;
      }  
    m60.f();
  }
  
  public final p01 d(Key paramKey, n2 paramn2, j01 paramj01) {
    Object object = paramj01.e;
    object = ((Map)paramn2.e).get("epk");
    if (object != null) {
      p30 p30;
      String str = yk0.d((Map)object, "kty", true);
      str.getClass();
      if (!str.equals("EC")) {
        if (str.equals("RSA")) {
          oh1 oh1 = new oh1((Map)object);
        } else {
          throw new Exception("");
        } 
      } else {
        p30 = new p30((Map)object);
      } 
      if (p30.i != null)
        throw new Exception(""); 
    } else {
      paramn2 = null;
    } 
    ECPublicKey eCPublicKey = (ECPublicKey)((yk0)paramn2).h;
    paramKey = paramKey;
    EllipticCurve ellipticCurve = paramKey.getParams().getCurve();
    ECPoint eCPoint = eCPublicKey.getW();
    object = eCPoint.getAffineX();
    BigInteger bigInteger1 = eCPoint.getAffineY();
    BigInteger bigInteger4 = ellipticCurve.getA();
    BigInteger bigInteger3 = ellipticCurve.getB();
    BigInteger bigInteger2 = ((ECFieldFp)ellipticCurve.getField()).getP();
    if (bigInteger1.pow(2).mod(bigInteger2).equals(object.pow(3).add(bigInteger4.multiply((BigInteger)object)).add(bigInteger3).mod(bigInteger2))) {
      object = this.b;
      try {
        object = KeyAgreement.getInstance((String)object);
        try {
          object.init(paramKey);
          object.doPhase(eCPublicKey, true);
          return new p01(null, null, object, 6);
        } catch (InvalidKeyException invalidKeyException) {
          throw new Exception("", invalidKeyException);
        } 
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new RuntimeException("", noSuchAlgorithmException);
      } catch (NoSuchProviderException noSuchProviderException) {
        throw new Exception("", noSuchProviderException);
      } 
    } 
    throw new Exception("");
  }
  
  public final boolean g() {
    Set<String> set = Security.getAlgorithms("KeyFactory");
    if (Security.getAlgorithms("KeyPairGenerator").contains("EC") && set.contains("EC")) {
      String str = this.b;
      Iterator<String> iterator = Security.getAlgorithms("KeyAgreement").iterator();
      while (iterator.hasNext()) {
        if (((String)iterator.next()).equalsIgnoreCase(str))
          return true; 
      } 
    } 
    return false;
  }
  
  public final Key h(p01 paramp01, byte[] paramArrayOfbyte, qp0 paramqp0, n2 paramn2, j01 paramj01) {
    // Byte code:
    //   0: aload_1
    //   1: getfield f : Ljava/lang/Object;
    //   4: checkcast javax/crypto/KeyAgreement
    //   7: invokevirtual generateSecret : ()[B
    //   10: astore #7
    //   12: getstatic qz1.b : [B
    //   15: astore_1
    //   16: aload #5
    //   18: getfield e : Ljava/lang/Object;
    //   21: astore_2
    //   22: new zb
    //   25: dup
    //   26: iconst_m1
    //   27: invokespecial <init> : (I)V
    //   30: astore #5
    //   32: getstatic yo.a : Ljava/lang/Class;
    //   35: astore_2
    //   36: aload_2
    //   37: ifnull -> 51
    //   40: aload_2
    //   41: invokevirtual newInstance : ()Ljava/lang/Object;
    //   44: checkcast xo
    //   47: astore_2
    //   48: goto -> 85
    //   51: new java/lang/Object
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore_2
    //   59: ldc_w 'SHA-256'
    //   62: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   65: astore #8
    //   67: aload_2
    //   68: aload #8
    //   70: putfield b : Ljava/security/MessageDigest;
    //   73: aload_2
    //   74: aload #8
    //   76: invokevirtual getDigestLength : ()I
    //   79: invokestatic e : (I)I
    //   82: putfield a : I
    //   85: aload_3
    //   86: getfield b : I
    //   89: invokestatic e : (I)I
    //   92: istore #6
    //   94: aload #4
    //   96: aload_0
    //   97: getfield c : Ljava/lang/String;
    //   100: invokevirtual y : (Ljava/lang/String;)Ljava/lang/String;
    //   103: astore_3
    //   104: aload #4
    //   106: ldc_w 'apu'
    //   109: invokevirtual y : (Ljava/lang/String;)Ljava/lang/String;
    //   112: astore #10
    //   114: aload #4
    //   116: ldc_w 'apv'
    //   119: invokevirtual y : (Ljava/lang/String;)Ljava/lang/String;
    //   122: astore #8
    //   124: aload_3
    //   125: ldc_w 'UTF-8'
    //   128: invokestatic p : (Ljava/lang/String;Ljava/lang/String;)[B
    //   131: astore #4
    //   133: aload #4
    //   135: astore_3
    //   136: aload #4
    //   138: ifnonnull -> 143
    //   141: aload_1
    //   142: astore_3
    //   143: iconst_2
    //   144: anewarray [B
    //   147: dup
    //   148: iconst_0
    //   149: aload_3
    //   150: arraylength
    //   151: invokestatic u : (I)[B
    //   154: aastore
    //   155: dup
    //   156: iconst_1
    //   157: aload_3
    //   158: aastore
    //   159: invokestatic i : ([[B)[B
    //   162: astore #9
    //   164: aload #5
    //   166: aload #10
    //   168: invokevirtual b : (Ljava/lang/String;)[B
    //   171: astore #4
    //   173: aload #4
    //   175: astore_3
    //   176: aload #4
    //   178: ifnonnull -> 183
    //   181: aload_1
    //   182: astore_3
    //   183: iconst_2
    //   184: anewarray [B
    //   187: dup
    //   188: iconst_0
    //   189: aload_3
    //   190: arraylength
    //   191: invokestatic u : (I)[B
    //   194: aastore
    //   195: dup
    //   196: iconst_1
    //   197: aload_3
    //   198: aastore
    //   199: invokestatic i : ([[B)[B
    //   202: astore #10
    //   204: aload #5
    //   206: aload #8
    //   208: invokevirtual b : (Ljava/lang/String;)[B
    //   211: astore #4
    //   213: aload #4
    //   215: astore_3
    //   216: aload #4
    //   218: ifnonnull -> 223
    //   221: aload_1
    //   222: astore_3
    //   223: new javax/crypto/spec/SecretKeySpec
    //   226: dup
    //   227: aload_2
    //   228: aload #7
    //   230: iconst_5
    //   231: anewarray [B
    //   234: dup
    //   235: iconst_0
    //   236: aload #9
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: aload #10
    //   243: aastore
    //   244: dup
    //   245: iconst_2
    //   246: iconst_2
    //   247: anewarray [B
    //   250: dup
    //   251: iconst_0
    //   252: aload_3
    //   253: arraylength
    //   254: invokestatic u : (I)[B
    //   257: aastore
    //   258: dup
    //   259: iconst_1
    //   260: aload_3
    //   261: aastore
    //   262: invokestatic i : ([[B)[B
    //   265: aastore
    //   266: dup
    //   267: iconst_3
    //   268: iload #6
    //   270: invokestatic u : (I)[B
    //   273: aastore
    //   274: dup
    //   275: iconst_4
    //   276: aload_1
    //   277: aastore
    //   278: invokestatic i : ([[B)[B
    //   281: iload #6
    //   283: invokevirtual a : ([B[BI)[B
    //   286: ldc_w 'AES'
    //   289: invokespecial <init> : ([BLjava/lang/String;)V
    //   292: areturn
    //   293: astore_1
    //   294: new java/lang/RuntimeException
    //   297: dup
    //   298: ldc ''
    //   300: aload_1
    //   301: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   304: athrow
    //   305: astore_1
    //   306: new java/lang/RuntimeException
    //   309: dup
    //   310: ldc_w 'SHA-256'
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: athrow
    //   317: astore_2
    //   318: goto -> 51
    // Exception table:
    //   from	to	target	type
    //   40	48	317	java/lang/Exception
    //   59	67	305	java/security/NoSuchAlgorithmException
    //   59	67	293	java/security/NoSuchProviderException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */