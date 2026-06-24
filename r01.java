import java.util.Locale;

public final class r01 extends a {
  public final float b;
  
  public final float c;
  
  public float d;
  
  public r01(float paramFloat1, float paramFloat2) {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = 0.0F;
  }
  
  public final String a() {
    return yj1.d;
  }
  
  public final String b() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(yj1.e);
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
  
  public final String c() {
    return !this.a ? null : String.format(Locale.ENGLISH, yj1.g, new Object[] { Float.valueOf(this.b), Character.valueOf('o'), Float.valueOf(this.c), Float.valueOf(this.d) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */