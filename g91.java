public class g91 extends nh0 {
  public final int g;
  
  public final g20 h;
  
  public g91(iu paramiu, g20 paramg201, g20 paramg202) {
    super(paramiu, paramg201);
    if (paramg202.e()) {
      int i = (int)(paramg202.d() / this.e);
      this.g = i;
      if (i >= 2) {
        this.h = paramg202;
        return;
      } 
      l0.l("The effective range must be at least 2");
      throw null;
    } 
    l0.l("Range duration field must be precise");
    throw null;
  }
  
  public final int b(long paramLong) {
    int i = this.g;
    long l = this.e;
    return (paramLong >= 0L) ? (int)(paramLong / l % i) : (i - 1 + (int)((paramLong + 1L) / l % i));
  }
  
  public final int l() {
    return this.g - 1;
  }
  
  public final g20 p() {
    return this.h;
  }
  
  public final long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, 0, this.g - 1);
    return (paramInt - b(paramLong)) * this.e + paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */