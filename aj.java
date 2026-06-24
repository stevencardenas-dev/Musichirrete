import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

public final class aj implements j5 {
  public final CastDevice b;
  
  public final fu2 c;
  
  public final Bundle d;
  
  public final String e;
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof aj))
      return false; 
    paramObject = paramObject;
    if (z51.g(this.b, ((aj)paramObject).b)) {
      Bundle bundle2 = ((aj)paramObject).d;
      Bundle bundle1 = this.d;
      if (bundle1 == null || bundle2 == null)
        return (bundle1 == bundle2) ? (z51.g(this.e, ((aj)paramObject).e)) : false; 
      if (bundle1.size() != bundle2.size())
        return false; 
      Set set = bundle1.keySet();
      if (!set.containsAll(bundle2.keySet()))
        return false; 
      for (String str : set) {
        if (!z51.g(bundle1.get(str), bundle2.get(str)))
          // Byte code: goto -> 166 
      } 
    } else {
      return false;
    } 
    return z51.g(this.e, ((aj)paramObject).e);
  }
  
  public final int hashCode() {
    String str = this.e;
    return Arrays.hashCode(new Object[] { this.b, this.d, Integer.valueOf(0), str });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */