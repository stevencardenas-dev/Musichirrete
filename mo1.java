public final class mo1 {
  public double a = Math.sqrt(1500.0D);
  
  public double b = 0.5D;
  
  public boolean c = false;
  
  public double d;
  
  public double e;
  
  public double f;
  
  public double g;
  
  public double h;
  
  public double i;
  
  public final l20 j;
  
  public mo1() {
    this.i = Double.MAX_VALUE;
    this.j = (l20)new Object();
  }
  
  public mo1(float paramFloat) {
    this.j = (l20)new Object();
    this.i = paramFloat;
  }
  
  public final void a(float paramFloat) {
    if (paramFloat >= 0.0F) {
      this.b = paramFloat;
      this.c = false;
      return;
    } 
    l0.l("Damping ratio must be non-negative");
  }
  
  public final void b(float paramFloat) {
    if (paramFloat > 0.0F) {
      this.a = Math.sqrt(paramFloat);
      this.c = false;
      return;
    } 
    l0.l("Spring stiffness constant must be positive.");
  }
  
  public final l20 c(double paramDouble1, double paramDouble2, long paramLong) {
    if (!this.c)
      if (this.i != Double.MAX_VALUE) {
        double d = this.b;
        if (d > 1.0D) {
          double d4 = -d;
          double d3 = this.a;
          this.f = Math.sqrt(d * d - 1.0D) * d3 + d4 * d3;
          d3 = this.b;
          d4 = -d3;
          d = this.a;
          this.g = d4 * d - Math.sqrt(d3 * d3 - 1.0D) * d;
        } else if (d >= 0.0D && d < 1.0D) {
          double d3 = this.a;
          this.h = Math.sqrt(1.0D - d * d) * d3;
        } 
        this.c = true;
      } else {
        tp.f("Error: Final position of the spring must be set before the animation starts");
        return null;
      }  
    double d1 = paramLong / 1000.0D;
    paramDouble1 -= this.i;
    double d2 = this.b;
    int i = d2 cmp 1.0D;
    if (i > 0) {
      double d4 = this.g;
      double d3 = (d4 * paramDouble1 - paramDouble2) / (d4 - this.f);
      paramDouble1 -= d3;
      paramDouble2 = Math.pow(Math.E, d4 * d1);
      paramDouble2 = Math.pow(Math.E, this.f * d1) * d3 + paramDouble2 * paramDouble1;
      double d5 = this.g;
      d4 = Math.pow(Math.E, d5 * d1);
      d2 = this.f;
      paramDouble1 = Math.pow(Math.E, d2 * d1) * d3 * d2 + d4 * paramDouble1 * d5;
    } else if (i == 0) {
      double d4 = this.a;
      paramDouble2 = d4 * paramDouble1 + paramDouble2;
      double d3 = paramDouble2 * d1 + paramDouble1;
      d4 = Math.pow(Math.E, -d4 * d1);
      d2 = Math.pow(Math.E, -this.a * d1);
      paramDouble1 = -this.a;
      paramDouble1 = Math.pow(Math.E, paramDouble1 * d1) * paramDouble2 + d2 * d3 * paramDouble1;
      paramDouble2 = d4 * d3;
    } else {
      double d3 = 1.0D / this.h;
      double d4 = this.a;
      d3 = (d2 * d4 * paramDouble1 + paramDouble2) * d3;
      d4 = Math.pow(Math.E, -d2 * d4 * d1);
      paramDouble2 = Math.cos(this.h * d1);
      paramDouble2 = (Math.sin(this.h * d1) * d3 + paramDouble2 * paramDouble1) * d4;
      double d5 = this.a;
      d4 = -d5;
      d2 = this.b;
      d5 = Math.pow(Math.E, -d2 * d5 * d1);
      double d7 = this.h;
      double d6 = -d7;
      double d8 = Math.sin(d7 * d1);
      d7 = this.h;
      paramDouble1 = (Math.cos(d7 * d1) * d3 * d7 + d8 * d6 * paramDouble1) * d5 + d4 * paramDouble2 * d2;
    } 
    float f = (float)(paramDouble2 + this.i);
    l20 l201 = this.j;
    l201.a = f;
    l201.b = (float)paramDouble1;
    return l201;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */