import com.android.billingclient.api.wH.DJqHMztxflt;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import r3.IKWi.AyxAR;

public final class d4 {
  public static final d4 e;
  
  public c4 a;
  
  public c4 b;
  
  public c4 c;
  
  public c4 d;
  
  static {
    Object object1 = new Object();
    System.currentTimeMillis();
    c4 c42 = new c4(0);
    ((d4)object1).a = c42;
    Object object2 = new Object();
    ((e4)object2).a = "none";
    c42.d((a4)object2);
    ((d4)object1).a.d(new eg0(256, "HS256", "HmacSHA256"));
    c42 = ((d4)object1).a;
    object2 = AyxAR.mtaGjYYtbHHx;
    c42.d(new eg0(384, "HS384", (String)object2));
    ((d4)object1).a.d(new eg0(512, "HS512", "HmacSHA512"));
    ((d4)object1).a.d(new x20("ES256", 64, "SHA256withECDSA", "P-256"));
    ((d4)object1).a.d(new x20("ES384", 96, "SHA384withECDSA", "P-384"));
    ((d4)object1).a.d(new x20("ES512", 132, "SHA512withECDSA", "P-521"));
    ((d4)object1).a.d(new od("RS256", "SHA256withRSA"));
    ((d4)object1).a.d(new od("RS384", "SHA384withRSA"));
    ((d4)object1).a.d(new od("RS512", "SHA512withRSA"));
    c4 c44 = ((d4)object1).a;
    od od2 = new od("PS256", qh1.l("SHA256withRSAandMGF1"));
    if (od2.b.equals("RSASSA-PSS")) {
      MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
      od2.c = new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1);
    } 
    c44.d(od2);
    c42 = ((d4)object1).a;
    od od1 = new od("PS384", qh1.l("SHA384withRSAandMGF1"));
    if (od1.b.equals("RSASSA-PSS")) {
      MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
      od1.c = new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 48, 1);
    } 
    c42.d(od1);
    c42 = ((d4)object1).a;
    od1 = new od("PS512", qh1.l("SHA512withRSAandMGF1"));
    if (od1.b.equals("RSASSA-PSS")) {
      MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
      od1.c = new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), DJqHMztxflt.ZtxyXOEtJRzUcp, mGF1ParameterSpec, 64, 1);
    } 
    c42.d(od1);
    c42 = new c4(0);
    ((d4)object1).b = c42;
    c42.d(new ph1(0, "RSA/ECB/PKCS1Padding", "RSA1_5"));
    ((d4)object1).b.d(new ph1(2, "RSA/ECB/OAEPWithSHA-1AndMGF1Padding", "RSA-OAEP"));
    c4 c43 = ((d4)object1).b;
    ph1 ph1 = new ph1(1, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding", "RSA-OAEP-256");
    ph1.c = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
    c43.d(ph1);
    c4 c41 = ((d4)object1).b;
    Object object3 = new Object();
    ((e4)object3).a = "dir";
    c41.d((a4)object3);
    ((d4)object1).b.d(new k3(0));
    ((d4)object1).b.d(new k3(1));
    ((d4)object1).b.d(new k3(2));
    ((d4)object1).b.d(new v20());
    ((d4)object1).b.d(new h61("ECDH-ES+A128KW", new k3(0)));
    ((d4)object1).b.d(new h61("ECDH-ES+A192KW", new k3(1)));
    ((d4)object1).b.d(new h61("ECDH-ES+A256KW", new k3(2)));
    ((d4)object1).b.d(new h61("PBES2-HS256+A128KW", "HmacSHA256", new k3(0)));
    ((d4)object1).b.d(new h61("PBES2-HS384+A192KW", (String)object2, new k3(1)));
    ((d4)object1).b.d(new h61("PBES2-HS512+A256KW", "HmacSHA512", new k3(2)));
    ((d4)object1).b.d(new i3("A128GCMKW", 16));
    ((d4)object1).b.d(new i3("A192GCMKW", 24));
    ((d4)object1).b.d(new i3("A256GCMKW", 32));
    c41 = new c4(0);
    ((d4)object1).c = c41;
    c41.d(new g3("A128CBC-HS256", 32, "HmacSHA256", 16));
    ((d4)object1).c.d(new g3("A192CBC-HS384", 48, (String)object2, 24));
    ((d4)object1).c.d(new g3(CKYHNesT.PyVsNaiEP, 64, "HmacSHA512", 32));
    ((d4)object1).c.d(new h3("A128GCM", 128));
    ((d4)object1).c.d(new h3("A192GCM", 192));
    ((d4)object1).c.d(new h3("A256GCM", 256));
    object2 = new c4(0);
    ((d4)object1).d = (c4)object2;
    object2.d((a4)new Object());
    e = (d4)object1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */