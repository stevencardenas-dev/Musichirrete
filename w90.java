import java.util.List;
import java.util.Objects;

public final class w90 {
  public String a;
  
  public String b;
  
  public List c;
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof w90))
      return false; 
    paramObject = paramObject;
    return (Objects.equals(this.a, ((w90)paramObject).a) && Objects.equals(this.b, ((w90)paramObject).b) && Objects.equals(this.c, ((w90)paramObject).c));
  }
  
  public final int hashCode() {
    return Objects.hash(new Object[] { this.a, this.b, this.c });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */