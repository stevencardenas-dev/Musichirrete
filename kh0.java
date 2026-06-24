public final class kh0 {
  public final v61 a;
  
  public final zf1 b;
  
  public final g1 c;
  
  public final boolean d;
  
  public final int e;
  
  public final String f;
  
  public final Object g;
  
  public boolean h;
  
  public boolean i;
  
  public final int j;
  
  public kh0(v61 paramv61, Object paramObject, zf1 paramzf1, int paramInt1, String paramString1, String paramString2, boolean paramBoolean, int paramInt2) {
    g1 g11;
    kh0 kh01;
    this.a = paramv61;
    this.b = paramzf1;
    if (paramObject == null) {
      paramv61 = null;
    } else {
      g11 = new g1(this, paramObject, paramv61.h);
    } 
    this.c = g11;
    this.e = paramInt1;
    this.d = paramBoolean;
    this.f = paramString1;
    if (paramString2 != null) {
      String str = paramString2;
    } else {
      kh01 = this;
    } 
    this.g = kh01;
  }
  
  public final Object a() {
    g1 g11 = this.c;
    return (g11 == null) ? null : g11.get();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */