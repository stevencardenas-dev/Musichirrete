public final class k42 {
  public static final k42 k;
  
  public final float a;
  
  public final float b;
  
  public final float c;
  
  public final float d;
  
  public final float e;
  
  public final float f;
  
  public final float[] g;
  
  public final float h;
  
  public final float i;
  
  public final float j;
  
  static {
    float[] arrayOfFloat1 = g92.c;
    float f4 = (float)(g92.f0() * 63.66197723675813D / 100.0D);
    float[][] arrayOfFloat = g92.a;
    float f5 = arrayOfFloat1[0];
    float[] arrayOfFloat3 = arrayOfFloat[0];
    float f2 = arrayOfFloat3[0];
    float f6 = arrayOfFloat1[1];
    float f3 = arrayOfFloat3[1];
    float f1 = arrayOfFloat1[2];
    f2 = arrayOfFloat3[2] * f1 + f3 * f6 + f2 * f5;
    arrayOfFloat3 = arrayOfFloat[1];
    f3 = arrayOfFloat3[0];
    float f7 = arrayOfFloat3[1];
    f3 = arrayOfFloat3[2] * f1 + f7 * f6 + f3 * f5;
    float[] arrayOfFloat2 = arrayOfFloat[2];
    f7 = arrayOfFloat2[0];
    float f8 = arrayOfFloat2[1];
    f5 = f1 * arrayOfFloat2[2] + f6 * f8 + f5 * f7;
    f1 = (1.0F - (float)Math.exp(((-f4 - 42.0F) / 92.0F)) * 0.2777778F) * 1.0F;
    double d = f1;
    if (d > 1.0D) {
      f1 = 1.0F;
    } else if (d < 0.0D) {
      f1 = 0.0F;
    } 
    f8 = 100.0F / f2;
    f6 = 100.0F / f3;
    f7 = 100.0F / f5;
    arrayOfFloat2 = new float[3];
    arrayOfFloat2[0] = f8 * f1 + 1.0F - f1;
    arrayOfFloat2[1] = f6 * f1 + 1.0F - f1;
    arrayOfFloat2[2] = f7 * f1 + 1.0F - f1;
    f1 = 1.0F / (5.0F * f4 + 1.0F);
    f1 = f1 * f1 * f1 * f1;
    f6 = 1.0F - f1;
    f4 = 0.1F * f6 * f6 * (float)Math.cbrt(f4 * 5.0D) + f1 * f4;
    f6 = g92.f0() / arrayOfFloat1[1];
    d = f6;
    f1 = (float)Math.sqrt(d);
    f7 = 0.725F / (float)Math.pow(d, 0.2D);
    f2 = (float)Math.pow((arrayOfFloat2[0] * f4 * f2) / 100.0D, 0.42D);
    f3 = (float)Math.pow((arrayOfFloat2[1] * f4 * f3) / 100.0D, 0.42D);
    f5 = (float)Math.pow((arrayOfFloat2[2] * f4 * f5) / 100.0D, 0.42D);
    arrayOfFloat1 = new float[3];
    arrayOfFloat1[0] = f2;
    arrayOfFloat1[1] = f3;
    arrayOfFloat1[2] = f5;
    f2 = arrayOfFloat1[0];
    f2 = f2 * 400.0F / (f2 + 27.13F);
    f3 = arrayOfFloat1[1];
    f3 = f3 * 400.0F / (f3 + 27.13F);
    f5 = arrayOfFloat1[2];
    f5 = 400.0F * f5 / (f5 + 27.13F);
    arrayOfFloat1 = new float[3];
    arrayOfFloat1[0] = f2;
    arrayOfFloat1[1] = f3;
    arrayOfFloat1[2] = f5;
    f2 = arrayOfFloat1[0];
    f3 = arrayOfFloat1[1];
    k = new k42(f6, (arrayOfFloat1[2] * 0.05F + f2 * 2.0F + f3) * f7, f7, f7, 0.69F, 1.0F, arrayOfFloat2, f4, (float)Math.pow(f4, 0.25D), f1 + 1.48F);
  }
  
  public k42(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float[] paramArrayOffloat, float paramFloat7, float paramFloat8, float paramFloat9) {
    this.f = paramFloat1;
    this.a = paramFloat2;
    this.b = paramFloat3;
    this.c = paramFloat4;
    this.d = paramFloat5;
    this.e = paramFloat6;
    this.g = paramArrayOffloat;
    this.h = paramFloat7;
    this.i = paramFloat8;
    this.j = paramFloat9;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */