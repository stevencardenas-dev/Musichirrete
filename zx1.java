public final class zx1 extends pr1 implements ad0 {
  public int g;
  
  public Object h;
  
  public final by1 i;
  
  public final cy1 j;
  
  public final boolean k;
  
  public zx1(by1 paramby1, cy1 paramcy1, boolean paramBoolean, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((zx1)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    cy1 cy11 = this.j;
    boolean bool = this.k;
    paramcs = new zx1(this.i, cy11, bool, paramcs);
    ((zx1)paramcs).h = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    by1 by11 = this.i;
    ip1 ip1 = by11.c;
    xs xs = (xs)this.h;
    int i = this.g;
    if (i != 0) {
      if (i == 1) {
        try {
          dd1.r0(paramObject);
        } finally {}
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = by11.e;
      if (paramObject != null) {
        paramObject = ((vx1)paramObject).c;
        if (paramObject != null && !paramObject.O()) {
          this.h = xs;
          this.g = 1;
          paramObject = paramObject.Q(this);
          ys ys = ys.b;
          if (paramObject == ys)
            return ys; 
        } 
      } 
    } 
    wf2.q(xs);
    by1.f(by11, this.j, this.k, xs);
    while (true) {
      paramObject = ip1.f();
      if (ip1.e(paramObject, cy1.a((cy1)paramObject, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, null, null, null, null, null, null, null, null, null, null, 2093055)))
        return l02.a; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */