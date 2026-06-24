import android.graphics.Path;
import android.util.Log;

public final class e61 {
  public char a;
  
  public final float[] b;
  
  public e61(char paramChar, float[] paramArrayOffloat) {
    this.a = paramChar;
    this.b = paramArrayOffloat;
  }
  
  public e61(e61 parame61) {
    this.a = parame61.a;
    float[] arrayOfFloat = parame61.b;
    this.b = g92.t(arrayOfFloat, arrayOfFloat.length);
  }
  
  public static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2) {
    double d7 = Math.toRadians(paramFloat7);
    double d15 = Math.cos(d7);
    double d16 = Math.sin(d7);
    double d6 = paramFloat1;
    double d5 = paramFloat2;
    double d14 = paramFloat5;
    double d1 = (d5 * d16 + d6 * d15) / d14;
    double d2 = -paramFloat1;
    double d9 = paramFloat6;
    double d8 = (d5 * d15 + d2 * d16) / d9;
    double d3 = paramFloat3;
    d2 = paramFloat4;
    double d4 = (d2 * d16 + d3 * d15) / d14;
    double d10 = (d2 * d15 + -paramFloat3 * d16) / d9;
    double d11 = d1 - d4;
    double d12 = d8 - d10;
    d3 = (d1 + d4) / 2.0D;
    d2 = (d8 + d10) / 2.0D;
    double d17 = d12 * d12 + d11 * d11;
    if (d17 == 0.0D) {
      Log.w("PathParser", " Points are coincident");
      return;
    } 
    double d13 = 1.0D / d17 - 0.25D;
    if (d13 < 0.0D) {
      StringBuilder stringBuilder = new StringBuilder("Points are too far apart ");
      stringBuilder.append(d17);
      Log.w("PathParser", stringBuilder.toString());
      float f = (float)(Math.sqrt(d17) / 1.99999D);
      a(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, f * paramFloat6, paramFloat7, paramBoolean1, paramBoolean2);
      return;
    } 
    d13 = Math.sqrt(d13);
    d11 = d13 * d11;
    d12 = d13 * d12;
    if (paramBoolean1 == paramBoolean2) {
      d3 -= d12;
      d2 += d11;
    } else {
      d3 += d12;
      d2 -= d11;
    } 
    d8 = Math.atan2(d8 - d2, d1 - d3);
    d4 = Math.atan2(d10 - d2, d4 - d3) - d8;
    int i = d4 cmp 0.0D;
    if (i >= 0) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    d1 = d4;
    if (paramBoolean2 != paramBoolean1)
      if (i > 0) {
        d1 = d4 - 6.283185307179586D;
      } else {
        d1 = d4 + 6.283185307179586D;
      }  
    d17 = d3 * d14;
    double d18 = d2 * d9;
    i = (int)Math.ceil(Math.abs(d1 * 4.0D / Math.PI));
    d3 = Math.cos(d7);
    double d19 = Math.sin(d7);
    d11 = Math.cos(d8);
    d10 = Math.sin(d8);
    d2 = -d14;
    double d20 = d2 * d3;
    double d21 = d9 * d19;
    d7 = d20 * d10 - d21 * d11;
    d4 = d2 * d19;
    double d22 = d9 * d3;
    d2 = d1 / i;
    d1 = d11 * d22 + d10 * d4;
    byte b = 0;
    while (b < i) {
      d11 = d8 + d2;
      d12 = Math.sin(d11);
      double d = Math.cos(d11);
      d10 = d14 * d3 * d + d17 * d15 - d18 * d16 - d21 * d12;
      d13 = d22 * d12 + d14 * d19 * d + d18 * d15 + d17 * d16;
      d9 = d20 * d12 - d21 * d;
      d12 = d * d22 + d12 * d4;
      d = d11 - d8;
      d8 = Math.tan(d / 2.0D);
      d = Math.sin(d);
      d8 = (Math.sqrt(d8 * 3.0D * d8 + 4.0D) - 1.0D) * d / 3.0D;
      paramPath.rLineTo(0.0F, 0.0F);
      paramPath.cubicTo((float)(d7 * d8 + d6), (float)(d1 * d8 + d5), (float)(d10 - d8 * d9), (float)(d13 - d8 * d12), (float)d10, (float)d13);
      b++;
      d5 = d13;
      d8 = d11;
      d1 = d12;
      d6 = d10;
      d7 = d9;
    } 
  }
  
  public static void b(e61[] paramArrayOfe61, Path paramPath) {
    float[] arrayOfFloat = new float[6];
    int i = paramArrayOfe61.length;
    byte b1 = 0;
    byte b2 = 0;
    char c = 'm';
    while (b2 < i) {
      byte b;
      e61 e611 = paramArrayOfe61[b2];
      char c1 = e611.a;
      float[] arrayOfFloat1 = e611.b;
      float f1 = arrayOfFloat[b1];
      float f2 = arrayOfFloat[1];
      float f4 = arrayOfFloat[2];
      float f3 = arrayOfFloat[3];
      float f6 = arrayOfFloat[4];
      float f5 = arrayOfFloat[5];
      switch (c1) {
        default:
          b = 2;
          break;
        case 'Z':
        case 'z':
          paramPath.close();
          paramPath.moveTo(f6, f5);
          f1 = f6;
          f4 = f1;
          f2 = f5;
          f3 = f2;
        case 'Q':
        case 'S':
        case 'q':
        case 's':
          b = 4;
          break;
        case 'H':
        case 'V':
        case 'h':
        case 'v':
          b = 1;
          break;
        case 'C':
        case 'c':
          b = 6;
          break;
        case 'A':
        case 'a':
          b = 7;
          break;
      } 
      float f7 = f1;
      f1 = f2;
      int j = b1;
      for (f2 = f7;; f2 = f7) {
        j += b;
        f7 = f1;
        f1 = f2;
        c = c1;
      } 
      continue;
      arrayOfFloat[b1] = SYNTHETIC_LOCAL_VARIABLE_3;
      arrayOfFloat[1] = SYNTHETIC_LOCAL_VARIABLE_2;
      arrayOfFloat[2] = SYNTHETIC_LOCAL_VARIABLE_5;
      arrayOfFloat[3] = SYNTHETIC_LOCAL_VARIABLE_4;
      arrayOfFloat[4] = SYNTHETIC_LOCAL_VARIABLE_7;
      arrayOfFloat[5] = SYNTHETIC_LOCAL_VARIABLE_6;
      c = ((e61)SYNTHETIC_LOCAL_VARIABLE_22).a;
      b2++;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */