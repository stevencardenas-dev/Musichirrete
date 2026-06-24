import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;

public final class aw0 {
  public final dw0 a;
  
  public aw0(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo) {
    String str = cw0.a(paramRemoteUserInfo);
    if (str != null) {
      if (!TextUtils.isEmpty(str)) {
        this.a = new cw0(paramRemoteUserInfo);
        return;
      } 
      l0.l("packageName should be nonempty");
      throw null;
    } 
    k91.h("package shouldn't be null");
    throw null;
  }
  
  public aw0(String paramString, int paramInt1, int paramInt2) {
    if (paramString != null) {
      if (!TextUtils.isEmpty(paramString)) {
        if (Build.VERSION.SDK_INT >= 28) {
          dw0 dw01 = new dw0(paramString, paramInt1, paramInt2);
          bw0.a(paramInt1, paramInt2, paramString);
          this.a = dw01;
          return;
        } 
        this.a = new dw0(paramString, paramInt1, paramInt2);
        return;
      } 
      l0.l(oXrNDUqUkE.ZBvcUJYmxskLHiV);
      throw null;
    } 
    k91.h("package shouldn't be null");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof aw0))
      return false; 
    paramObject = ((aw0)paramObject).a;
    return this.a.equals(paramObject);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */