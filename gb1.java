import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public abstract class gb1 extends yk0 {
  public PrivateKey i;
  
  public final ArrayList j;
  
  public final String k;
  
  public final String l;
  
  public final String m;
  
  public gb1(Map paramMap) {
    super(paramMap);
    if (paramMap.containsKey("x5c")) {
      List list = (List)paramMap.get("x5c");
      this.j = new ArrayList(list.size());
      a42 a42 = new a42(2);
      Iterator<String> iterator = list.iterator();
      while (iterator.hasNext()) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qz1.o(iterator.next()));
        try {
          X509Certificate x509Certificate = (X509Certificate)((CertificateFactory)a42.c).generateCertificate(byteArrayInputStream);
          this.j.add(x509Certificate);
        } catch (CertificateException certificateException) {
          throw new Exception("", certificateException);
        } 
      } 
    } 
    String str = xveccWbRzqx.EQKy;
    this.k = yk0.c(str, (Map)certificateException);
    this.l = yk0.c("x5t#S256", (Map)certificateException);
    this.m = yk0.c("x5u", (Map)certificateException);
    f(new String[] { "x5c", "x5t#S256", str, "x5u" });
  }
  
  public static BigInteger i(Map paramMap, String paramString, boolean paramBoolean) {
    String str = yk0.d(paramMap, paramString, paramBoolean);
    return new BigInteger(1, (new zb(-1)).b(str));
  }
  
  public static void j(LinkedHashMap<String, String> paramLinkedHashMap, String paramString, BigInteger paramBigInteger) {
    paramLinkedHashMap.put(paramString, (new zb(-1)).d(m92.W(paramBigInteger)));
  }
  
  public static void k(LinkedHashMap<String, String> paramLinkedHashMap, String paramString, BigInteger paramBigInteger, int paramInt) {
    zb zb = new zb(-1);
    byte[] arrayOfByte2 = m92.W(paramBigInteger);
    byte[] arrayOfByte1 = arrayOfByte2;
    if (paramInt > arrayOfByte2.length)
      arrayOfByte1 = qz1.i(new byte[][] { new byte[paramInt - arrayOfByte2.length], arrayOfByte2 }); 
    paramLinkedHashMap.put(paramString, zb.d(arrayOfByte1));
  }
  
  public final void a(LinkedHashMap paramLinkedHashMap) {
    h(paramLinkedHashMap);
    ArrayList<Object> arrayList = this.j;
    if (arrayList != null) {
      new a42(2);
      ArrayList<String> arrayList1 = new ArrayList(arrayList.size());
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        X509Certificate x509Certificate = (X509Certificate)arrayList.get(b);
        b++;
        x509Certificate = x509Certificate;
        try {
          byte[] arrayOfByte = x509Certificate.getEncoded();
          zb zb = new zb();
          this(0);
          String str = zb.d(arrayOfByte);
          arrayList1.add(str);
        } catch (CertificateEncodingException certificateEncodingException) {
          throw new IllegalStateException("", certificateEncodingException);
        } 
      } 
      certificateEncodingException.put("x5c", arrayList1);
    } 
    yk0.e(fXMDNeMWaILNVh.SrqeDGGhpoFJKX, this.k, (LinkedHashMap)certificateEncodingException);
    yk0.e("x5t#S256", this.l, (LinkedHashMap)certificateEncodingException);
    yk0.e("x5u", this.m, (LinkedHashMap)certificateEncodingException);
  }
  
  public final void g() {
    ArrayList<X509Certificate> arrayList = this.j;
    if (arrayList != null && !arrayList.isEmpty()) {
      X509Certificate x509Certificate = arrayList.get(0);
    } else {
      arrayList = null;
    } 
    if (arrayList == null || arrayList.getPublicKey().equals(this.h))
      return; 
    PublicKey publicKey = (PublicKey)this.h;
    StringBuilder stringBuilder = new StringBuilder("The key in the first certificate MUST match the bare public key represented by other members of the JWK. Public key = ");
    stringBuilder.append(publicKey);
    stringBuilder.append(" cert = ");
    stringBuilder.append(arrayList);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public abstract void h(LinkedHashMap paramLinkedHashMap);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */