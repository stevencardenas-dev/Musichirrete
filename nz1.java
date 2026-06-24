public final class nz1 extends jy1 {
  public final int a;
  
  public final boolean b;
  
  public final Object b(tk0 paramtk0) {
    Float float_1;
    Double double_;
    int i = this.a;
    Float float_2 = null;
    tk0 tk01 = null;
    switch (i) {
      default:
        if (paramtk0.C() == 9) {
          paramtk0.y();
          paramtk0 = tk01;
        } else {
          float_1 = Float.valueOf((float)paramtk0.s());
        } 
        return float_1;
      case 0:
        break;
    } 
    if (float_1.C() == 9) {
      float_1.y();
      float_1 = float_2;
    } else {
      double_ = Double.valueOf(float_1.s());
    } 
    return double_;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    int i = this.a;
    boolean bool = this.b;
    switch (i) {
      default:
        paramObject = paramObject;
        if (paramObject == null) {
          paramcl0.o();
        } else {
          float f = paramObject.floatValue();
          if (bool)
            pz1.a(f); 
          if (!(paramObject instanceof Float))
            paramObject = Float.valueOf(f); 
          paramcl0.v((Number)paramObject);
        } 
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    if (paramObject == null) {
      paramcl0.o();
    } else {
      double d = paramObject.doubleValue();
      if (bool)
        pz1.a(d); 
      paramcl0.y();
      if (paramcl0.j == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
        paramcl0.a();
        paramcl0.b.append(Double.toString(d));
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder("Numeric values must be finite, but was ");
      stringBuilder.append(d);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */