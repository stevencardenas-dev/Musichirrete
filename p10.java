import android.graphics.Matrix;
import java.util.Arrays;

public final class p10 {
  public final float[] a;
  
  public final float[] b;
  
  public final Matrix c;
  
  public p10() {
    this.a = new float[2];
    float[] arrayOfFloat = new float[2];
    this.b = arrayOfFloat;
    arrayOfFloat[0] = 1.0F;
    this.c = new Matrix();
  }
  
  public p10(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    float[] arrayOfFloat1 = new float[2];
    this.a = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[2];
    this.b = arrayOfFloat2;
    System.arraycopy(paramArrayOffloat1, 0, arrayOfFloat1, 0, 2);
    System.arraycopy(paramArrayOffloat2, 0, arrayOfFloat2, 0, 2);
    this.c = new Matrix();
  }
  
  public final void a() {
    Arrays.fill(this.a, 0.0F);
    float[] arrayOfFloat = this.b;
    Arrays.fill(arrayOfFloat, 0.0F);
    arrayOfFloat[0] = 1.0F;
    this.c.reset();
  }
  
  public final void b(float paramFloat) {
    float[] arrayOfFloat = this.a;
    arrayOfFloat[0] = arrayOfFloat[0] * 1.0F;
    arrayOfFloat[1] = arrayOfFloat[1] * paramFloat;
    arrayOfFloat = this.b;
    arrayOfFloat[0] = arrayOfFloat[0] * 1.0F;
    arrayOfFloat[1] = arrayOfFloat[1] * paramFloat;
  }
  
  public final void c(float paramFloat) {
    float[] arrayOfFloat = this.a;
    arrayOfFloat[0] = arrayOfFloat[0] + paramFloat;
    arrayOfFloat[1] = arrayOfFloat[1] + 0.0F;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */