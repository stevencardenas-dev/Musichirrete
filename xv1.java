import java.util.Arrays;

public final class xv1 {
  public final int a;
  
  public final zd[] b;
  
  public int c;
  
  public xv1(zd... paramVarArgs) {
    this.b = paramVarArgs;
    this.a = paramVarArgs.length;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || xv1.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return Arrays.equals((Object[])this.b, (Object[])((xv1)paramObject).b);
  }
  
  public final int hashCode() {
    if (this.c == 0)
      this.c = Arrays.hashCode((Object[])this.b) + 527; 
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */