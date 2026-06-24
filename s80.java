import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public final class s80 implements TypeEvaluator {
  public final float[] a;
  
  public final float[] b;
  
  public final Matrix c;
  
  public final v80 d;
  
  public s80(v80 paramv80) {
    this.d = paramv80;
    this.a = new float[9];
    this.b = new float[9];
    this.c = new Matrix();
  }
  
  public final Object evaluate(float paramFloat, Object paramObject1, Object paramObject2) {
    Matrix matrix = (Matrix)paramObject1;
    paramObject1 = paramObject2;
    this.d.p = paramFloat;
    paramObject2 = this.a;
    matrix.getValues((float[])paramObject2);
    float[] arrayOfFloat = this.b;
    paramObject1.getValues(arrayOfFloat);
    for (byte b = 0; b < 9; b++) {
      float f = arrayOfFloat[b];
      Object object = paramObject2[b];
      arrayOfFloat[b] = x41.e(f, object, paramFloat, object);
    } 
    paramObject1 = this.c;
    paramObject1.setValues(arrayOfFloat);
    return paramObject1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */