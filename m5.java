import java.util.Arrays;

public final class m5 {
  public final int a;
  
  public final g7 b;
  
  public final j5 c;
  
  public final String d;
  
  public m5(g7 paramg7, j5 paramj5, String paramString) {
    this.b = paramg7;
    this.c = paramj5;
    this.d = paramString;
    this.a = Arrays.hashCode(new Object[] { paramg7, paramj5, paramString });
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (paramObject == this)
        return true; 
      if (paramObject instanceof m5) {
        paramObject = paramObject;
        if (z51.g(this.b, ((m5)paramObject).b) && z51.g(this.c, ((m5)paramObject).c) && z51.g(this.d, ((m5)paramObject).d))
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */