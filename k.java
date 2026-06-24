import android.graphics.RectF;
import java.util.Arrays;

public final class k implements ls {
  public final float a;
  
  public k(float paramFloat) {
    this.a = paramFloat;
  }
  
  public final float a(RectF paramRectF) {
    return this.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof k))
      return false; 
    paramObject = paramObject;
    return (this.a == ((k)paramObject).a);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a) });
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append("px");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */