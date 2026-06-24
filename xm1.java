import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.security.spec.PSSParameterSpec;

public enum xm1 {
  public static final xm1[] g;
  
  public final int b;
  
  public final String c;
  
  public final pr e;
  
  public final s51 f;
  
  static {
    pr pr1 = pr.e;
    xm1 xm13 = new xm1("RSA_PSS_WITH_SHA256", 0, 257, pr1, ws2.y(new int[] { 7377, 7378, 7360 }, ), new s51(ws2.y(new int[] { 
              7378, 7367, 7360, 7345, 7348, 7349, 7414, 7400, 7411, 7399, 
              7377, 7378, 7360, 7342, 7375, 7378, 7378 }, ), new PSSParameterSpec(ws2.y(new int[] { 7378, 7367, 7360, 7340, 7345, 7348, 7349 }, ), ws2.y(new int[] { 7372, 7366, 7365, 7344 }, ), yq0.a, 32, 1)));
    pr pr2 = pr.f;
    xm1 xm14 = new xm1("RSA_PSS_WITH_SHA512", 1, 258, pr2, ws2.y(new int[] { 7377, 7378, 7360 }, ), new s51(ws2.y(new int[] { 
              7378, 7367, 7360, 7348, 7344, 7345, 7414, 7400, 7411, 7399, 
              7377, 7378, 7360, 7342, 7375, 7378, 7378 }, ), new PSSParameterSpec(ws2.y(new int[] { 7378, 7367, 7360, 7340, 7348, 7344, 7345 }, ), ws2.y(new int[] { 7372, 7366, 7365, 7344 }, ), yq0.b, 64, 1)));
    xm1 xm11 = new xm1("RSA_PKCS1_V1_5_WITH_SHA256", 2, 259, pr1, ws2.y(new int[] { 7377, 7378, 7360 }, ), new s51(ws2.y(new int[] { 
              7378, 7367, 7360, 7345, 7348, 7349, 7414, 7400, 7411, 7399, 
              7377, 7378, 7360 }, ), null));
    xm1 xm12 = new xm1("RSA_PKCS1_V1_5_WITH_SHA512", 3, 260, pr2, ws2.y(new int[] { 7377, 7378, 7360 }, ), new s51(ws2.y(new int[] { 
              7378, 7367, 7360, 7348, 7344, 7345, 7414, 7400, 7411, 7399, 
              7377, 7378, 7360 }, ), null));
    String str = ws2.y(new int[] { 7364, 7362 });
    s51 s511 = new s51(ws2.y(new int[] { 
            7378, 7367, 7360, 7345, 7348, 7349, 7414, 7400, 7411, 7399, 
            7364, 7362, 7363, 7378, 7360 }, ), null);
    g = new xm1[] { xm13, xm14, xm11, xm12, new xm1(ckOPp.xAJO, 4, 513, pr1, str, s511), new xm1("ECDSA_WITH_SHA512", 5, 514, pr2, ws2.y(new int[] { 7364, 7362 }, ), new s51(ws2.y(new int[] { 
                7378, 7367, 7360, 7348, 7344, 7345, 7414, 7400, 7411, 7399, 
                7364, 7362, 7363, 7378, 7360 }, ), null)), new xm1("DSA_WITH_SHA256", 6, 769, pr1, ws2.y(new int[] { 7363, 7378, 7360 }, ), new s51(ws2.y(new int[] { 
                7378, 7367, 7360, 7345, 7348, 7349, 7414, 7400, 7411, 7399, 
                7363, 7378, 7360 }, ), null)) };
  }
  
  xm1(int paramInt1, pr parampr, String paramString1, s51 params51) {
    this.b = paramInt1;
    this.e = parampr;
    this.c = paramString1;
    this.f = params51;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */