import android.graphics.RectF;
import java.util.Arrays;

public final class d3 implements ls {
  public final ls a;
  
  public final float b;
  
  public d3(float paramFloat, ls paramls) {
    while (paramls instanceof d3) {
      paramls = ((d3)paramls).a;
      paramFloat += ((d3)paramls).b;
    } 
    this.a = paramls;
    this.b = paramFloat;
  }
  
  public final float a(RectF paramRectF) {
    return Math.max(0.0F, this.a.a(paramRectF) + this.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof d3))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((d3)paramObject).a) && this.b == ((d3)paramObject).b);
  }
  
  public final int hashCode() {
    float f = this.b;
    return Arrays.hashCode(new Object[] { this.a, Float.valueOf(f) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */