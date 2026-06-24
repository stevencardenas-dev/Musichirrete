public final class xt extends pr1 implements ad0 {
  public int g;
  
  public final eh1 h;
  
  public final boolean i;
  
  public final wc0 j;
  
  public xt(cs paramcs, wc0 paramwc0, eh1 parameh1, boolean paramBoolean) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((xt)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    boolean bool = this.i;
    return new xt(paramcs, this.j, this.h, bool);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
        return paramObject;
      } 
      tp.f("call to 'resume' before 'invoke' with coroutine");
      return null;
    } 
    dd1.r0(paramObject);
    wc0 wc01 = this.j;
    paramObject = this.h;
    boolean bool = this.i;
    zt zt = new zt(null, wc01, (eh1)paramObject, bool);
    this.g = 1;
    Object object = paramObject.p(bool, zt, this);
    paramObject = ys.b;
    return (object == paramObject) ? paramObject : object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */