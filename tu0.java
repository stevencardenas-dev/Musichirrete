import android.os.Bundle;
import com.google.android.material.tabs.xm.VDgS;

public final class tu0 {
  public final Bundle a;
  
  public cv0 b;
  
  public tu0(cv0 paramcv0, boolean paramBoolean) {
    if (paramcv0 != null) {
      Bundle bundle = new Bundle();
      this.a = bundle;
      this.b = paramcv0;
      bundle.putBundle("selector", paramcv0.a);
      bundle.putBoolean("activeScan", paramBoolean);
      return;
    } 
    l0.l("selector must not be null");
    throw null;
  }
  
  public final void a() {
    if (this.b == null) {
      cv0 cv01 = cv0.b(this.a.getBundle("selector"));
      this.b = cv01;
      if (cv01 == null)
        this.b = cv0.c; 
    } 
  }
  
  public final boolean b() {
    return this.a.getBoolean("activeScan");
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof tu0) {
      paramObject = paramObject;
      a();
      cv0 cv01 = this.b;
      paramObject.a();
      if (cv01.equals(((tu0)paramObject).b) && b() == paramObject.b())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    a();
    int i = this.b.hashCode();
    return b() ^ i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DiscoveryRequest{ selector=");
    a();
    stringBuilder.append(this.b);
    stringBuilder.append(VDgS.KHnXkCFtWuMBkUh);
    stringBuilder.append(b());
    stringBuilder.append(", isValid=");
    a();
    cv0 cv01 = this.b;
    cv01.a();
    stringBuilder.append(cv01.b.contains(null) ^ true);
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */