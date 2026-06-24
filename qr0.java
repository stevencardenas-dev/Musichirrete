public final class qr0 extends j30 {
  public final float D;
  
  public qr0(float paramFloat) {
    this.D = paramFloat - 0.001F;
  }
  
  public final void c(float paramFloat1, float paramFloat2, float paramFloat3, fm1 paramfm1) {
    double d = this.D;
    paramFloat1 = (float)(Math.sqrt(2.0D) * d / 2.0D);
    paramFloat3 = (float)Math.sqrt(Math.pow(d, 2.0D) - Math.pow(paramFloat1, 2.0D));
    paramfm1.d(paramFloat2 - paramFloat1, (float)-(Math.sqrt(2.0D) * d - d) + paramFloat3, 270.0F, 0.0F);
    paramfm1.c(paramFloat2, (float)-(Math.sqrt(2.0D) * d - d));
    paramfm1.c(paramFloat2 + paramFloat1, (float)-(Math.sqrt(2.0D) * d - d) + paramFloat3);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */