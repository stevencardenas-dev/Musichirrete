import android.net.Uri;
import java.util.Arrays;

public final class s2 {
  public final Uri[] a = new Uri[0];
  
  public final int[] b = new int[0];
  
  public final long[] c = new long[0];
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && s2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (Arrays.equals((Object[])this.a, (Object[])((s2)paramObject).a) && Arrays.equals(this.b, ((s2)paramObject).b) && Arrays.equals(this.c, ((s2)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = Arrays.hashCode((Object[])this.a);
    int j = Arrays.hashCode(this.b);
    return Arrays.hashCode(this.c) + (j + (-31 + i) * 31) * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */