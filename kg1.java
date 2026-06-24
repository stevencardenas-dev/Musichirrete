import android.content.res.Resources;
import java.util.Objects;

public final class kg1 {
  public final Resources a;
  
  public final Resources.Theme b;
  
  public kg1(Resources paramResources, Resources.Theme paramTheme) {
    this.a = paramResources;
    this.b = paramTheme;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && kg1.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a.equals(((kg1)paramObject).a) && Objects.equals(this.b, ((kg1)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Objects.hash(new Object[] { this.a, this.b });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */