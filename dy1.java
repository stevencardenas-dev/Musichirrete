import android.content.Intent;
import java.io.Serializable;

public final class dy1 implements Serializable {
  public final Integer b;
  
  public final Integer c;
  
  public final Object e;
  
  public dy1(Integer paramInteger1, Integer paramInteger2, Intent paramIntent) {
    this.b = paramInteger1;
    this.c = paramInteger2;
    this.e = paramIntent;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof dy1))
        return false; 
      paramObject = paramObject;
      if (!this.b.equals(((dy1)paramObject).b) || !this.c.equals(((dy1)paramObject).c) || !ui0.c(this.e, ((dy1)paramObject).e))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i;
    int j = this.b.hashCode();
    int k = this.c.hashCode();
    Object object = this.e;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    return (k + j * 31) * 31 + i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */