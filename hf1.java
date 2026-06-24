import android.graphics.RectF;
import java.util.Arrays;

public final class hf1 implements ls {
  public final float a;
  
  public hf1(float paramFloat) {
    this.a = paramFloat;
  }
  
  public final float a(RectF paramRectF) {
    return Math.min(paramRectF.width(), paramRectF.height()) * this.a;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof hf1))
      return false; 
    paramObject = paramObject;
    return (this.a == ((hf1)paramObject).a);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a) });
  }
  
  public final String toString() {
    return x41.m(new StringBuilder(), (int)(this.a * 100.0F), "%");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */