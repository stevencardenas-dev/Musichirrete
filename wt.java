public final class wt extends pr1 implements ad0 {
  public int g;
  
  public final eh1 h;
  
  public final boolean i;
  
  public final boolean j;
  
  public final wc0 k;
  
  public wt(cs paramcs, wc0 paramwc0, eh1 parameh1, boolean paramBoolean1, boolean paramBoolean2) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((wt)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    boolean bool = this.j;
    return new wt(paramcs, this.k, this.h, this.i, bool);
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
    wc0 wc01 = this.k;
    paramObject = this.h;
    boolean bool1 = this.j;
    boolean bool2 = this.i;
    vt vt = new vt(null, wc01, (eh1)paramObject, bool1, bool2);
    this.g = 1;
    paramObject = paramObject.p(bool2, vt, this);
    ys ys = ys.b;
    return (paramObject == ys) ? ys : paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */