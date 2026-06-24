import android.graphics.Color;

public abstract class jn {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOffloat) {
    float f7 = paramInt1 / 255.0F;
    float f4 = paramInt2 / 255.0F;
    float f6 = paramInt3 / 255.0F;
    float f8 = Math.max(f7, Math.max(f4, f6));
    float f1 = Math.min(f7, Math.min(f4, f6));
    float f2 = f8 - f1;
    float f5 = (f8 + f1) / 2.0F;
    float f3 = 0.0F;
    if (f8 == f1) {
      f2 = 0.0F;
      f1 = 0.0F;
    } else {
      if (f8 == f7) {
        f1 = (f4 - f6) / f2 % 6.0F;
      } else if (f8 == f4) {
        f1 = (f6 - f7) / f2 + 2.0F;
      } else {
        f1 = 4.0F + (f7 - f4) / f2;
      } 
      f4 = f2 / (1.0F - Math.abs(2.0F * f5 - 1.0F));
      f2 = f1;
      f1 = f4;
    } 
    f4 = f2 * 60.0F % 360.0F;
    f2 = f4;
    if (f4 < 0.0F)
      f2 = f4 + 360.0F; 
    if (f2 < 0.0F) {
      f2 = 0.0F;
    } else {
      f2 = Math.min(f2, 360.0F);
    } 
    paramArrayOffloat[0] = f2;
    if (f1 < 0.0F) {
      f1 = 0.0F;
    } else {
      f1 = Math.min(f1, 1.0F);
    } 
    paramArrayOffloat[1] = f1;
    if (f5 < 0.0F) {
      f1 = f3;
    } else {
      f1 = Math.min(f5, 1.0F);
    } 
    paramArrayOffloat[2] = f1;
  }
  
  public static int b(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d2 = (-0.4986D * paramDouble3 + -1.5372D * paramDouble2 + 3.2406D * paramDouble1) / 100.0D;
    double d1 = (0.0415D * paramDouble3 + 1.8758D * paramDouble2 + -0.9689D * paramDouble1) / 100.0D;
    paramDouble3 = (1.057D * paramDouble3 + -0.204D * paramDouble2 + 0.0557D * paramDouble1) / 100.0D;
    if (d2 > 0.0031308D) {
      paramDouble1 = Math.pow(d2, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble1 = d2 * 12.92D;
    } 
    if (d1 > 0.0031308D) {
      paramDouble2 = Math.pow(d1, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble2 = d1 * 12.92D;
    } 
    if (paramDouble3 > 0.0031308D) {
      paramDouble3 = Math.pow(paramDouble3, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble3 *= 12.92D;
    } 
    int i = (int)Math.round(paramDouble1 * 255.0D);
    int k = 0;
    if (i < 0) {
      i = 0;
    } else {
      i = Math.min(i, 255);
    } 
    int j = (int)Math.round(paramDouble2 * 255.0D);
    if (j < 0) {
      j = 0;
    } else {
      j = Math.min(j, 255);
    } 
    int m = (int)Math.round(paramDouble3 * 255.0D);
    if (m >= 0)
      k = Math.min(m, 255); 
    return Color.rgb(i, j, k);
  }
  
  public static int c(float paramFloat, int paramInt1, int paramInt2) {
    float f4 = 1.0F - paramFloat;
    float f5 = Color.alpha(paramInt1);
    float f2 = Color.alpha(paramInt2);
    float f7 = Color.red(paramInt1);
    float f3 = Color.red(paramInt2);
    float f8 = Color.green(paramInt1);
    float f9 = Color.green(paramInt2);
    float f6 = Color.blue(paramInt1);
    float f1 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * paramFloat + f5 * f4), (int)(f3 * paramFloat + f7 * f4), (int)(f9 * paramFloat + f8 * f4), (int)(f1 * paramFloat + f6 * f4));
  }
  
  public static double d(int paramInt1, int paramInt2) {
    if (Color.alpha(paramInt2) == 255) {
      int i = paramInt1;
      if (Color.alpha(paramInt1) < 255)
        i = g(paramInt1, paramInt2); 
      double d2 = e(i) + 0.05D;
      double d1 = e(paramInt2) + 0.05D;
      return Math.max(d2, d1) / Math.min(d2, d1);
    } 
    tp.g("background can not be translucent: #", Integer.toHexString(paramInt2));
    return 0.0D;
  }
  
  public static double e(int paramInt) {
    ThreadLocal<double[]> threadLocal = a;
    double[] arrayOfDouble2 = threadLocal.get();
    double[] arrayOfDouble1 = arrayOfDouble2;
    if (arrayOfDouble2 == null) {
      arrayOfDouble1 = new double[3];
      threadLocal.set(arrayOfDouble1);
    } 
    int j = Color.red(paramInt);
    int i = Color.green(paramInt);
    paramInt = Color.blue(paramInt);
    if (arrayOfDouble1.length == 3) {
      double d1 = j / 255.0D;
      if (d1 < 0.04045D) {
        d1 /= 12.92D;
      } else {
        d1 = Math.pow((d1 + 0.055D) / 1.055D, 2.4D);
      } 
      double d2 = i / 255.0D;
      if (d2 < 0.04045D) {
        d2 /= 12.92D;
      } else {
        d2 = Math.pow((d2 + 0.055D) / 1.055D, 2.4D);
      } 
      double d3 = paramInt / 255.0D;
      if (d3 < 0.04045D) {
        d3 /= 12.92D;
      } else {
        d3 = Math.pow((d3 + 0.055D) / 1.055D, 2.4D);
      } 
      arrayOfDouble1[0] = (0.1805D * d3 + 0.3576D * d2 + 0.4124D * d1) * 100.0D;
      double d4 = (0.0722D * d3 + 0.7152D * d2 + 0.2126D * d1) * 100.0D;
      arrayOfDouble1[1] = d4;
      arrayOfDouble1[2] = (d3 * 0.9505D + d2 * 0.1192D + d1 * 0.0193D) * 100.0D;
      return d4 / 100.0D;
    } 
    l0.l("outXyz must have a length of 3.");
    return 0.0D;
  }
  
  public static int f(float paramFloat, int paramInt1, int paramInt2) {
    int i = Color.alpha(paramInt2);
    int j = 255;
    if (i == 255) {
      double d1 = d(i(paramInt1, 255), paramInt2);
      double d2 = paramFloat;
      if (d1 < d2)
        return -1; 
      i = 0;
      int k = 0;
      while (i <= 10 && j - k > 1) {
        int m = (k + j) / 2;
        if (d(i(paramInt1, m), paramInt2) < d2) {
          k = m;
        } else {
          j = m;
        } 
        i++;
      } 
      return j;
    } 
    tp.g("background can not be translucent: #", Integer.toHexString(paramInt2));
    return 0;
  }
  
  public static int g(int paramInt1, int paramInt2) {
    int j = Color.alpha(paramInt2);
    int i = Color.alpha(paramInt1);
    int k = 255 - (255 - i) * (255 - j) / 255;
    return Color.argb(k, h(Color.red(paramInt1), i, Color.red(paramInt2), j, k), h(Color.green(paramInt1), i, Color.green(paramInt2), j, k), h(Color.blue(paramInt1), i, Color.blue(paramInt2), j, k));
  }
  
  public static int h(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    return (paramInt5 == 0) ? 0 : (((255 - paramInt2) * paramInt3 * paramInt4 + paramInt1 * 255 * paramInt2) / paramInt5 * 255);
  }
  
  public static int i(int paramInt1, int paramInt2) {
    if (paramInt2 >= 0 && paramInt2 <= 255)
      return paramInt1 & 0xFFFFFF | paramInt2 << 24; 
    l0.l("alpha must be between 0 and 255.");
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */