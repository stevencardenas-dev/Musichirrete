import com.android.billingclient.api.wH.DJqHMztxflt;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;

public enum av1 {
  c, e, f, g, h;
  
  public static final av1[] i;
  
  public final String b;
  
  static {
    av1 av15 = new av1("TLS_1_3", 0, "TLSv1.3");
    c = av15;
    av1 av12 = new av1("TLS_1_2", 1, "TLSv1.2");
    e = av12;
    av1 av13 = new av1(DJqHMztxflt.YjrXhVMN, 2, "TLSv1.1");
    f = av13;
    av1 av11 = new av1("TLS_1_0", 3, "TLSv1");
    g = av11;
    av1 av14 = new av1(jHxlGgUTadw.LhTXY, 4, "SSLv3");
    h = av14;
    i = new av1[] { av15, av12, av13, av11, av14 };
  }
  
  av1(String paramString1) {
    this.b = paramString1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\av1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */