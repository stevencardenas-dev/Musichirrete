public final class lh1 extends z51 {
  public final void l(fm1 paramfm1, float paramFloat1, float paramFloat2) {
    paramFloat1 = paramFloat2 * paramFloat1;
    paramfm1.d(0.0F, paramFloat1, 180.0F, 90.0F);
    paramFloat2 = paramFloat1 * 2.0F;
    bm1 bm1 = new bm1(0.0F, 0.0F, paramFloat2, paramFloat2);
    bm1.f = 180.0F;
    bm1.g = 90.0F;
    paramfm1.g.add(bm1);
    zl1 zl1 = new zl1(bm1);
    paramfm1.a(180.0F);
    paramfm1.h.add(zl1);
    paramfm1.e = 270.0F;
    paramFloat1 = (0.0F + paramFloat2) * 0.5F;
    paramFloat2 = (paramFloat2 - 0.0F) / 2.0F;
    paramfm1.c = (float)Math.cos(Math.toRadians(270.0D)) * paramFloat2 + paramFloat1;
    paramfm1.d = paramFloat2 * (float)Math.sin(Math.toRadians(270.0D)) + paramFloat1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */