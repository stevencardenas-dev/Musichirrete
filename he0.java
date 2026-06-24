import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

public abstract class he0 extends yc {
  public final Set z;
  
  public he0(Context paramContext, Looper paramLooper, int paramInt1, m2 paramm2, me0 paramme0, ne0 paramne0, int paramInt2) {
    super(paramContext, paramLooper, (bq2)object1, paramInt1, new a42(5, paramme0), new a42(6, paramne0), (String)paramm2.d);
    Set set = (Set)paramm2.b;
    Iterator<Scope> iterator = set.iterator();
    while (iterator.hasNext()) {
      if (set.contains(iterator.next()))
        continue; 
      tp.f("Expanding scopes is not permitted, use implied scopes instead");
      throw null;
    } 
    this.z = set;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\he0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */