import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

public final class t80 implements TypeEvaluator {
  public final FloatEvaluator a = new FloatEvaluator();
  
  public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    float f = this.a.evaluate(paramFloat, (Number)paramObject1, (Number)paramObject2).floatValue();
    paramFloat = f;
    if (f < 0.1F)
      paramFloat = 0.0F; 
    return Float.valueOf(paramFloat);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */