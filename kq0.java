public final class kq0 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public Object i;
  
  public final mq0 j;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((kq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 2:
        return ((kq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((kq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((kq0)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    mq0 mq01 = this.j;
    switch (i) {
      default:
        paramcs = new kq0(mq01, paramcs, 3);
        ((kq0)paramcs).i = paramObject;
        return paramcs;
      case 2:
        paramcs = new kq0(mq01, paramcs, 2);
        ((kq0)paramcs).i = paramObject;
        return paramcs;
      case 1:
        paramcs = new kq0(mq01, paramcs, 1);
        ((kq0)paramcs).i = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    paramcs = new kq0(mq01, paramcs, 0);
    ((kq0)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    l02 l02 = l02.a;
    ys ys = ys.b;
    mq0 mq01 = this.j;
    switch (i) {
      default:
        xs = (xs)this.i;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = e00.a;
          paramObject = fw.e;
          jq0 jq0 = new jq0(mq01, null, 2);
          this.i = xs;
          this.h = 1;
          if (qv.l0((os)paramObject, jq0, this) == ys)
            return ys; 
        } 
        wf2.q(xs);
        qv.L(mq01.I0, null, null, new kq0(mq01, null, 2), 3);
        return l02;
      case 2:
        xs = (xs)this.i;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return null;
          } 
        } else {
          dd1.r0(paramObject);
          wf2.q(xs);
          this.i = xs;
          this.h = 1;
          if (mq0.r(mq01, this) == ys)
            return ys; 
        } 
        wf2.q(xs);
        mq01.D0.a();
        return l02;
      case 1:
        xs = (xs)this.i;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = e00.a;
          fw fw = fw.e;
          paramObject = new jq0(mq01, null, 1);
          this.i = xs;
          this.h = 1;
          if (qv.l0(fw, (ad0)paramObject, this) == ys)
            return ys; 
        } 
        wf2.q(xs);
        qv.L(mq01.I0, null, null, new kq0(mq01, null, 0), 3);
        return l02;
      case 0:
        break;
    } 
    xs xs = (xs)this.i;
    i = this.h;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      wf2.q(xs);
      this.i = xs;
      this.h = 1;
      if (mq0.r(mq01, this) == ys)
        return ys; 
    } 
    wf2.q(xs);
    mq01.D0.a();
    return l02;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */