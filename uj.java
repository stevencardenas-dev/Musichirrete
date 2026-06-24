import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

public final class uj {
  public static final uj b = new uj(new LinkedHashSet(new ArrayList()));
  
  public final LinkedHashSet a;
  
  public uj(LinkedHashSet paramLinkedHashSet) {
    this.a = paramLinkedHashSet;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof uj) {
      paramObject = paramObject;
      Pattern pattern = b12.a;
      if (this.a.equals(((uj)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */