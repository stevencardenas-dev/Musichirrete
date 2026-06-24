import android.graphics.Color;

public final class fi {
  public final float a;
  
  public final float b;
  
  public final float c;
  
  public final float d;
  
  public final float e;
  
  public final float f;
  
  public fi(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = paramFloat5;
    this.f = paramFloat6;
  }
  
  public static fi a(int paramInt) {
    k42 k42 = k42.k;
    float f4 = g92.Q(Color.red(paramInt));
    float f5 = g92.Q(Color.green(paramInt));
    float f3 = g92.Q(Color.blue(paramInt));
    float[][] arrayOfFloat4 = g92.d;
    float[] arrayOfFloat5 = arrayOfFloat4[0];
    float f1 = arrayOfFloat5[0];
    float f2 = arrayOfFloat5[1];
    f1 = arrayOfFloat5[2] * f3 + f2 * f5 + f1 * f4;
    arrayOfFloat5 = arrayOfFloat4[1];
    float f6 = arrayOfFloat5[0];
    f2 = arrayOfFloat5[1];
    f2 = arrayOfFloat5[2] * f3 + f2 * f5 + f6 * f4;
    float[] arrayOfFloat3 = arrayOfFloat4[2];
    f6 = arrayOfFloat3[0];
    float f7 = arrayOfFloat3[1];
    f7 = f3 * arrayOfFloat3[2] + f5 * f7 + f4 * f6;
    float[][] arrayOfFloat2 = g92.a;
    arrayOfFloat5 = arrayOfFloat2[0];
    f6 = arrayOfFloat5[0];
    float f14 = arrayOfFloat5[1];
    float f15 = arrayOfFloat5[2];
    arrayOfFloat5 = arrayOfFloat2[1];
    float f13 = arrayOfFloat5[0];
    float f11 = arrayOfFloat5[1];
    float f12 = arrayOfFloat5[2];
    float[] arrayOfFloat1 = arrayOfFloat2[2];
    float f8 = arrayOfFloat1[0];
    float f10 = arrayOfFloat1[1];
    float f9 = arrayOfFloat1[2];
    arrayOfFloat1 = k42.g;
    f3 = k42.i;
    f4 = k42.d;
    f5 = k42.a;
    f6 = arrayOfFloat1[0] * (f15 * f7 + f14 * f2 + f6 * f1);
    f11 = arrayOfFloat1[1] * (f12 * f7 + f11 * f2 + f13 * f1);
    f2 = arrayOfFloat1[2] * (f7 * f9 + f2 * f10 + f1 * f8);
    f8 = k42.h;
    f1 = (float)Math.pow((Math.abs(f6) * f8) / 100.0D, 0.42D);
    f7 = (float)Math.pow((Math.abs(f11) * f8) / 100.0D, 0.42D);
    f8 = (float)Math.pow((Math.abs(f2) * f8) / 100.0D, 0.42D);
    f1 = Math.signum(f6) * 400.0F * f1 / (f1 + 27.13F);
    f9 = Math.signum(f11) * 400.0F * f7 / (f7 + 27.13F);
    f2 = Math.signum(f2) * 400.0F * f8 / (f8 + 27.13F);
    double d1 = f1;
    double d2 = f9;
    double d3 = f2;
    f6 = (float)(d2 * -12.0D + d1 * 11.0D + d3) / 11.0F;
    f7 = (float)((f1 + f9) - d3 * 2.0D) / 9.0F;
    f9 *= 20.0F;
    f8 = (21.0F * f2 + f1 * 20.0F + f9) / 20.0F;
    f10 = (f1 * 40.0F + f9 + f2) / 20.0F;
    f2 = (float)Math.atan2(f7, f6) * 180.0F / 3.1415927F;
    if (f2 < 0.0F) {
      f1 = f2 + 360.0F;
    } else {
      f1 = f2;
      if (f2 >= 360.0F)
        f1 = f2 - 360.0F; 
    } 
    f9 = 3.1415927F * f1 / 180.0F;
    f10 = (float)Math.pow((f10 * k42.b / f5), (k42.j * f4)) * 100.0F;
    Math.sqrt((f10 / 100.0F));
    if (f1 < 20.14D) {
      f2 = 360.0F + f1;
    } else {
      f2 = f1;
    } 
    f2 = (float)(Math.cos(f2 * Math.PI / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F * k42.e * k42.c * (float)Math.sqrt((f7 * f7 + f6 * f6)) / (f8 + 0.305F);
    f6 = (float)Math.pow(1.64D - Math.pow(0.29D, k42.f), 0.73D) * (float)Math.pow(f2, 0.9D);
    f2 = f6 * (float)Math.sqrt(f10 / 100.0D);
    Math.sqrt((f6 * f4 / (f5 + 4.0F)));
    f4 = 1.7F * f10 / (0.007F * f10 + 1.0F);
    f3 = (float)Math.log((f3 * f2 * 0.0228F + 1.0F)) * 43.85965F;
    d1 = f9;
    return new fi(f1, f2, f10, f4, f3 * (float)Math.cos(d1), f3 * (float)Math.sin(d1));
  }
  
  public static fi b(float paramFloat1, float paramFloat2, float paramFloat3) {
    k42 k42 = k42.k;
    float f1 = k42.d;
    double d = paramFloat1 / 100.0D;
    Math.sqrt(d);
    f1 = k42.a;
    float f2 = k42.i;
    Math.sqrt((paramFloat2 / (float)Math.sqrt(d) * k42.d / (f1 + 4.0F)));
    f1 = 3.1415927F * paramFloat3 / 180.0F;
    float f3 = 1.7F * paramFloat1 / (0.007F * paramFloat1 + 1.0F);
    f2 = (float)Math.log((f2 * paramFloat2) * 0.0228D + 1.0D) * 43.85965F;
    d = f1;
    return new fi(paramFloat3, paramFloat2, paramFloat1, f3, f2 * (float)Math.cos(d), f2 * (float)Math.sin(d));
  }
  
  public final int c(k42 paramk42) {
    float f1 = this.b;
    double d = f1;
    float f2 = this.c;
    if (d != 0.0D) {
      d = f2;
      if (d == 0.0D) {
        f1 = 0.0F;
        d = f1;
        float f23 = paramk42.f;
        f1 = paramk42.h;
        float f24 = (float)Math.pow(d / Math.pow(1.64D - Math.pow(0.29D, f23), 0.73D), 1.1111111111111112D);
        d = (this.a * 3.1415927F / 180.0F);
        f23 = (float)(Math.cos(2.0D + d) + 3.8D);
        float f26 = paramk42.a;
        f2 = (float)Math.pow(f2 / 100.0D, 1.0D / paramk42.d / paramk42.j);
        float f27 = paramk42.e;
        float f25 = paramk42.c;
        f2 = f26 * f2 / paramk42.b;
        f26 = (float)Math.sin(d);
        float f28 = (float)Math.cos(d);
        f24 = (0.305F + f2) * 23.0F * f24 / (f24 * 108.0F * f26 + 11.0F * f24 * f28 + f23 * 0.25F * 3846.1538F * f27 * f25 * 23.0F);
        f23 = f28 * f24;
        f24 *= f26;
        f26 = f2 * 460.0F;
        f2 = (288.0F * f24 + 451.0F * f23 + f26) / 1403.0F;
        f25 = (f26 - 891.0F * f23 - 261.0F * f24) / 1403.0F;
        f24 = (f26 - f23 * 220.0F - f24 * 6300.0F) / 1403.0F;
        f26 = (float)Math.max(0.0D, Math.abs(f2) * 27.13D / (400.0D - Math.abs(f2)));
        f2 = Math.signum(f2);
        f23 = 100.0F / f1;
        f1 = (float)Math.pow(f26, 2.380952380952381D);
        f26 = (float)Math.max(0.0D, Math.abs(f25) * 27.13D / (400.0D - Math.abs(f25)));
        f25 = Math.signum(f25);
        f26 = (float)Math.pow(f26, 2.380952380952381D);
        f27 = (float)Math.max(0.0D, Math.abs(f24) * 27.13D / (400.0D - Math.abs(f24)));
        f24 = Math.signum(f24);
        f27 = (float)Math.pow(f27, 2.380952380952381D);
        float[] arrayOfFloat8 = paramk42.g;
        f1 = f2 * f23 * f1 / arrayOfFloat8[0];
        f2 = f25 * f23 * f26 / arrayOfFloat8[1];
        f27 = f24 * f23 * f27 / arrayOfFloat8[2];
        float[][] arrayOfFloat7 = g92.b;
        float[] arrayOfFloat9 = arrayOfFloat7[0];
        f28 = arrayOfFloat9[0];
        float f32 = arrayOfFloat9[1];
        float f29 = arrayOfFloat9[2];
        arrayOfFloat9 = arrayOfFloat7[1];
        f25 = arrayOfFloat9[0];
        f24 = arrayOfFloat9[1];
        float f31 = arrayOfFloat9[2];
        arrayOfFloat5 = arrayOfFloat7[2];
        float f30 = arrayOfFloat5[0];
        f23 = arrayOfFloat5[1];
        f26 = arrayOfFloat5[2];
        return jn.b((f29 * f27 + f32 * f2 + f28 * f1), (f31 * f27 + f24 * f2 + f25 * f1), (f27 * f26 + f2 * f23 + f1 * f30));
      } 
      f1 /= (float)Math.sqrt(d / 100.0D);
      d = f1;
      float f13 = ((k42)arrayOfFloat5).f;
      f1 = ((k42)arrayOfFloat5).h;
      float f14 = (float)Math.pow(d / Math.pow(1.64D - Math.pow(0.29D, f13), 0.73D), 1.1111111111111112D);
      d = (this.a * 3.1415927F / 180.0F);
      f13 = (float)(Math.cos(2.0D + d) + 3.8D);
      float f16 = ((k42)arrayOfFloat5).a;
      f2 = (float)Math.pow(f2 / 100.0D, 1.0D / ((k42)arrayOfFloat5).d / ((k42)arrayOfFloat5).j);
      float f17 = ((k42)arrayOfFloat5).e;
      float f15 = ((k42)arrayOfFloat5).c;
      f2 = f16 * f2 / ((k42)arrayOfFloat5).b;
      f16 = (float)Math.sin(d);
      float f18 = (float)Math.cos(d);
      f14 = (0.305F + f2) * 23.0F * f14 / (f14 * 108.0F * f16 + 11.0F * f14 * f18 + f13 * 0.25F * 3846.1538F * f17 * f15 * 23.0F);
      f13 = f18 * f14;
      f14 *= f16;
      f16 = f2 * 460.0F;
      f2 = (288.0F * f14 + 451.0F * f13 + f16) / 1403.0F;
      f15 = (f16 - 891.0F * f13 - 261.0F * f14) / 1403.0F;
      f14 = (f16 - f13 * 220.0F - f14 * 6300.0F) / 1403.0F;
      f16 = (float)Math.max(0.0D, Math.abs(f2) * 27.13D / (400.0D - Math.abs(f2)));
      f2 = Math.signum(f2);
      f13 = 100.0F / f1;
      f1 = (float)Math.pow(f16, 2.380952380952381D);
      f16 = (float)Math.max(0.0D, Math.abs(f15) * 27.13D / (400.0D - Math.abs(f15)));
      f15 = Math.signum(f15);
      f16 = (float)Math.pow(f16, 2.380952380952381D);
      f17 = (float)Math.max(0.0D, Math.abs(f14) * 27.13D / (400.0D - Math.abs(f14)));
      f14 = Math.signum(f14);
      f17 = (float)Math.pow(f17, 2.380952380952381D);
      float[] arrayOfFloat5 = ((k42)arrayOfFloat5).g;
      f1 = f2 * f13 * f1 / arrayOfFloat5[0];
      f2 = f15 * f13 * f16 / arrayOfFloat5[1];
      f17 = f14 * f13 * f17 / arrayOfFloat5[2];
      float[][] arrayOfFloat4 = g92.b;
      float[] arrayOfFloat6 = arrayOfFloat4[0];
      f18 = arrayOfFloat6[0];
      float f22 = arrayOfFloat6[1];
      float f19 = arrayOfFloat6[2];
      arrayOfFloat6 = arrayOfFloat4[1];
      f15 = arrayOfFloat6[0];
      f14 = arrayOfFloat6[1];
      float f21 = arrayOfFloat6[2];
      arrayOfFloat2 = arrayOfFloat4[2];
      float f20 = arrayOfFloat2[0];
      f13 = arrayOfFloat2[1];
      f16 = arrayOfFloat2[2];
      return jn.b((f19 * f17 + f22 * f2 + f18 * f1), (f21 * f17 + f14 * f2 + f15 * f1), (f17 * f16 + f2 * f13 + f1 * f20));
    } 
    f1 = 0.0F;
    d = f1;
    float f3 = ((k42)arrayOfFloat2).f;
    f1 = ((k42)arrayOfFloat2).h;
    float f4 = (float)Math.pow(d / Math.pow(1.64D - Math.pow(0.29D, f3), 0.73D), 1.1111111111111112D);
    d = (this.a * 3.1415927F / 180.0F);
    f3 = (float)(Math.cos(2.0D + d) + 3.8D);
    float f6 = ((k42)arrayOfFloat2).a;
    f2 = (float)Math.pow(f2 / 100.0D, 1.0D / ((k42)arrayOfFloat2).d / ((k42)arrayOfFloat2).j);
    float f7 = ((k42)arrayOfFloat2).e;
    float f5 = ((k42)arrayOfFloat2).c;
    f2 = f6 * f2 / ((k42)arrayOfFloat2).b;
    f6 = (float)Math.sin(d);
    float f8 = (float)Math.cos(d);
    f4 = (0.305F + f2) * 23.0F * f4 / (f4 * 108.0F * f6 + 11.0F * f4 * f8 + f3 * 0.25F * 3846.1538F * f7 * f5 * 23.0F);
    f3 = f8 * f4;
    f4 *= f6;
    f6 = f2 * 460.0F;
    f2 = (288.0F * f4 + 451.0F * f3 + f6) / 1403.0F;
    f5 = (f6 - 891.0F * f3 - 261.0F * f4) / 1403.0F;
    f4 = (f6 - f3 * 220.0F - f4 * 6300.0F) / 1403.0F;
    f6 = (float)Math.max(0.0D, Math.abs(f2) * 27.13D / (400.0D - Math.abs(f2)));
    f2 = Math.signum(f2);
    f3 = 100.0F / f1;
    f1 = (float)Math.pow(f6, 2.380952380952381D);
    f6 = (float)Math.max(0.0D, Math.abs(f5) * 27.13D / (400.0D - Math.abs(f5)));
    f5 = Math.signum(f5);
    f6 = (float)Math.pow(f6, 2.380952380952381D);
    f7 = (float)Math.max(0.0D, Math.abs(f4) * 27.13D / (400.0D - Math.abs(f4)));
    f4 = Math.signum(f4);
    f7 = (float)Math.pow(f7, 2.380952380952381D);
    float[] arrayOfFloat2 = ((k42)arrayOfFloat2).g;
    f1 = f2 * f3 * f1 / arrayOfFloat2[0];
    f2 = f5 * f3 * f6 / arrayOfFloat2[1];
    f7 = f4 * f3 * f7 / arrayOfFloat2[2];
    float[][] arrayOfFloat = g92.b;
    float[] arrayOfFloat3 = arrayOfFloat[0];
    f8 = arrayOfFloat3[0];
    float f12 = arrayOfFloat3[1];
    float f9 = arrayOfFloat3[2];
    arrayOfFloat3 = arrayOfFloat[1];
    f5 = arrayOfFloat3[0];
    f4 = arrayOfFloat3[1];
    float f11 = arrayOfFloat3[2];
    float[] arrayOfFloat1 = arrayOfFloat[2];
    float f10 = arrayOfFloat1[0];
    f3 = arrayOfFloat1[1];
    f6 = arrayOfFloat1[2];
    return jn.b((f9 * f7 + f12 * f2 + f8 * f1), (f11 * f7 + f4 * f2 + f5 * f1), (f7 * f6 + f2 * f3 + f1 * f10));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */