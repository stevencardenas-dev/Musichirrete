import android.content.ComponentName;
import java.util.ArrayList;

public final class gv0 {
  public final zu0 a;
  
  public final ArrayList b = new ArrayList();
  
  public final boolean c;
  
  public final bh0 d;
  
  public av0 e;
  
  public gv0(zu0 paramzu0, boolean paramBoolean) {
    this.a = paramzu0;
    this.d = paramzu0.c;
    this.c = paramBoolean;
  }
  
  public final hv0 a(String paramString) {
    ArrayList<Object> arrayList = this.b;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      hv0 hv0 = (hv0)arrayList.get(b);
      b++;
      hv0 = hv0;
      if (hv0.b.equals(paramString))
        return hv0; 
    } 
    return null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=");
    stringBuilder.append(((ComponentName)this.d.c).getPackageName());
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */