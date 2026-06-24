public final class si0 implements ri0 {
  public final ri0 b;
  
  public si0(ri0 paramri0) {
    this.b = paramri0;
  }
  
  public static si0 b(ri0 paramri0) {
    return (paramri0 instanceof dv) ? ((dv)paramri0).b : ((paramri0 instanceof si0) ? (si0)paramri0 : ((paramri0 == null) ? null : new si0(paramri0)));
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    return this.b.a(paramcv, paramCharSequence, paramInt);
  }
  
  public final int d() {
    return this.b.d();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof si0) {
      paramObject = paramObject;
      return this.b.equals(((si0)paramObject).b);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\si0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */