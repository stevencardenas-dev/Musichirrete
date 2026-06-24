public final class kp extends lh {
  public final hh r;
  
  public kp(int paramInt, hh paramhh) {
    super(paramInt);
    this.r = paramhh;
    if (paramhh != hh.b) {
      if (paramInt >= 1)
        return; 
      k91.e(x41.i(paramInt, "Buffered channel capacity must be at least 1, but ", " was specified"));
      throw null;
    } 
    k91.g(ne1.a(lh.class).c(), " instead", "This implementation does not support suspension for senders, use ");
    throw null;
  }
  
  public final boolean A() {
    return (this.r == hh.c);
  }
  
  public final Object O(Object paramObject, boolean paramBoolean) {
    if (this.r == hh.e) {
      Object object = super.n(paramObject);
      paramObject = object;
      if (object instanceof ik)
        if (object instanceof hk) {
          paramObject = object;
        } else {
          paramObject = l02.a;
        }  
      return paramObject;
    } 
    return K(paramObject);
  }
  
  public final Object b(cs paramcs, Object paramObject) {
    if (!(O(paramObject, true) instanceof hk))
      return l02.a; 
    throw s();
  }
  
  public final Object n(Object paramObject) {
    return O(paramObject, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */