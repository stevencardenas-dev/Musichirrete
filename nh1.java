import java.util.List;
import java.util.Objects;

public final class nh1 {
  public final List a;
  
  public final boolean b;
  
  public nh1(av0 paramav0) {
    this.a = paramav0.b;
    this.b = paramav0.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof nh1) {
      paramObject = paramObject;
      if (this.a.equals(((nh1)paramObject).a) && this.b == ((nh1)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    boolean bool = this.b;
    return Objects.hash(new Object[] { this.a, Boolean.valueOf(bool), null });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */