import java.util.Arrays;

public final class ra2 {
  public final m5 a;
  
  public final u70 b;
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof ra2) {
      paramObject = paramObject;
      if (z51.g(this.a, ((ra2)paramObject).a) && z51.g(this.b, ((ra2)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { this.a, this.b });
  }
  
  public final String toString() {
    zu zu = new zu(this);
    zu.a("key", this.a);
    zu.a("feature", this.b);
    return zu.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ra2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */