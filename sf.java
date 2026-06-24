import android.net.Uri;
import in.krosbits.musicolet.providers.AAProvider;
import java.util.List;

public final class sf extends dg1 {
  public final int a;
  
  public final boolean b(zf1 paramzf1) {
    Uri uri;
    int i = this.a;
    boolean bool2 = true;
    boolean bool1 = bool2;
    switch (i) {
      default:
        uri = paramzf1.b;
        if (uri != null) {
          String str = AAProvider.b;
          if ("in.krosbits.musicolet.providers.AAProvider".equals(uri.getAuthority())) {
            List<String> list = uri.getPathSegments();
            if (list != null && !list.isEmpty()) {
              String str1 = list.get(0);
              bool1 = bool2;
              if (!"raabl".equals(str1)) {
                if ("rgaabl".equals(str1)) {
                  bool1 = bool2;
                  break;
                } 
              } else {
                break;
              } 
            } 
          } 
        } 
        bool1 = false;
        break;
      case 0:
        break;
    } 
    return bool1;
  }
  
  public final m40 e(zf1 paramzf1) {
    String str1;
    String str2;
    switch (this.a) {
      default:
        str2 = null;
        try {
          int j = paramzf1.e;
          int i = paramzf1.f;
          Uri uri = paramzf1.b;
          List<String> list = uri.getPathSegments();
        } finally {
          paramzf1 = null;
          paramzf1.printStackTrace();
        } 
        return (m40)str1;
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("Unrecognized type of request: ");
    stringBuilder.append(paramzf1);
    throw new IllegalStateException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */