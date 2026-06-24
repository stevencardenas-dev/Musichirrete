import android.text.TextUtils;
import java.util.Objects;

public final class mh1 {
  public final String a;
  
  public final int b;
  
  public mh1(mi2 parammi2) {
    this.a = (String)parammi2.e;
    this.b = parammi2.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof mh1) {
      paramObject = paramObject;
      if (this.a.equals(((mh1)paramObject).a) && this.b == ((mh1)paramObject).b && TextUtils.equals(null, null))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.b;
    Integer integer = Integer.valueOf(0);
    return Objects.hash(new Object[] { this.a, Integer.valueOf(i), integer, integer, null });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */