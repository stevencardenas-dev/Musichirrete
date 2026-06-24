import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public final class y11 extends dg1 {
  public final d10 a;
  
  public final rp1 b;
  
  public y11(d10 paramd10, rp1 paramrp1) {
    this.a = paramd10;
    this.b = paramrp1;
  }
  
  public final boolean b(zf1 paramzf1) {
    String str = paramzf1.b.getScheme();
    return ("http".equals(str) || "https".equals(str));
  }
  
  public final int d() {
    return 2;
  }
  
  public final m40 e(zf1 paramzf1) {
    Uri uri = paramzf1.b;
    int i = paramzf1.a;
    b10 b10 = this.a.b(i, uri);
    if (b10 != null) {
      long l = b10.c;
      if (b10.b) {
        i = 2;
      } else {
        i = 3;
      } 
      InputStream inputStream = b10.a;
      if (inputStream != null) {
        if (i != 2 || l != 0L) {
          if (i == 3 && l > 0L) {
            cj cj = this.b.b;
            cj.sendMessage(cj.obtainMessage(4, Long.valueOf(l)));
          } 
          return new m40(null, inputStream, i, 0);
        } 
        try {
          inputStream.close();
        } catch (IOException iOException) {}
        throw new IOException("Received response with 0 content-length header.");
      } 
    } 
    return null;
  }
  
  public final boolean f(NetworkInfo paramNetworkInfo) {
    return (paramNetworkInfo == null || paramNetworkInfo.isConnected());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */