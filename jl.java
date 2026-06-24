import android.graphics.RectF;
import java.util.Arrays;

public final class jl implements ls {
  public final float a;
  
  public jl(float paramFloat) {
    this.a = paramFloat;
  }
  
  public final float a(RectF paramRectF) {
    float f = Math.min(paramRectF.width() / 2.0F, paramRectF.height() / 2.0F);
    return ui0.h(this.a, 0.0F, f);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof jl))
      return false; 
    paramObject = paramObject;
    return (this.a == ((jl)paramObject).a);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */