public final class zt extends pr1 implements ad0 {
  public aw1 g;
  
  public int h;
  
  public Object i;
  
  public final boolean j;
  
  public final eh1 k;
  
  public final wc0 l;
  
  public zt(cs paramcs, wc0 paramwc0, eh1 parameh1, boolean paramBoolean) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((zt)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    eh1 eh11 = this.k;
    paramcs = new zt(paramcs, this.l, eh11, this.j);
    ((zt)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    int i = this.h;
    wc0 wc01 = this.l;
    if (i != 0) {
      Object object1;
      Object object2;
      eh1 eh11 = this.k;
      ys ys = ys.b;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4) {
              object1 = this.i;
              dd1.r0(paramObject);
              object2 = paramObject;
            } else {
              tp.f("call to 'resume' before 'invoke' with coroutine");
              return null;
            } 
          } else {
            object1 = this.i;
            dd1.r0(paramObject);
            if (!this.j) {
              this.i = paramObject;
              this.h = 4;
              Object object = object1.c(this);
              if (object == ys)
                return ys; 
              object2 = object;
              object = paramObject;
            } else {
              return paramObject;
            } 
          } 
        } else {
          aw1 aw11 = this.g;
          bw1 bw1 = (bw1)this.i;
          dd1.r0(paramObject);
          paramObject = bw1;
          ut ut = new ut(null, wc01, 1);
          this.i = paramObject;
          this.g = null;
          this.h = 3;
          object2 = paramObject.a(aw11, ut, this);
          object1 = paramObject;
          paramObject = object2;
        } 
      } else {
        aw1 aw11 = this.g;
        bw1 bw1 = (bw1)this.i;
        dd1.r0(paramObject);
        if (!((Boolean)paramObject).booleanValue()) {
          paramObject = eh11.f();
          this.i = bw1;
          this.g = aw11;
          this.h = 2;
          if (paramObject.a(this) == ys)
            return ys; 
          paramObject = bw1;
        } else {
          paramObject = bw1;
        } 
        ut ut = new ut(null, wc01, 1);
        this.i = paramObject;
        this.g = null;
        this.h = 3;
        object2 = paramObject.a(aw11, ut, this);
        object1 = paramObject;
        paramObject = object2;
      } 
      if (!((Boolean)object2).booleanValue()) {
        paramObject = eh11.f();
        ((yi0)paramObject).b.e(((yi0)paramObject).e, ((yi0)paramObject).f);
      } 
      return object1;
    } 
    dd1.r0(paramObject);
    paramObject = this.i;
    paramObject.getClass();
    return wc01.h(((ad1)paramObject).b());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */