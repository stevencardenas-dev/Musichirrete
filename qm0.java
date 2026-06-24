public final class qm0 extends pr1 implements ad0 {
  public final int g;
  
  public Object h;
  
  public final Object i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((qm0)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((qm0)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    ((qm0)l((cs)paramObject2, paramObject1)).n(l02);
    return l02;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object = this.i;
    switch (i) {
      default:
        paramcs = new qm0(object, paramcs, 2);
        ((qm0)paramcs).h = paramObject;
        return paramcs;
      case 1:
        paramcs = new qm0(object, paramcs, 1);
        ((qm0)paramcs).h = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    paramcs = new qm0(object, paramcs, 0);
    ((qm0)paramcs).h = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    os os;
    rs rs;
    dk0 dk0;
    vs2 vs2;
    yw yw;
    int i = this.g;
    l02 l02 = l02.a;
    Object object = this.i;
    xs xs = null;
    switch (i) {
      default:
        dd1.r0(paramObject);
        paramObject = ((xs)this.h).g();
        vs2 = vs2.c;
        paramObject = paramObject.l(vs2);
        paramObject.getClass();
        rs = (rs)paramObject;
        dk0 = new dk0(true);
        dk0.L(null);
        object = new ek(dk0, object, null, 5);
        os = qz1.s(b40.b, rs, true);
        yw = e00.a;
        paramObject = os;
        if (os != yw) {
          paramObject = os;
          if (os.l(vs2) == null)
            paramObject = os.k(yw); 
        } 
        paramObject = new m((os)paramObject, true);
        paramObject.j0(at.f, (m)paramObject, (ad0)object);
        while (true) {
          if (!dk0.O())
            try {
              paramObject = new tq();
              super(dk0, null, 4);
              return qv.X(rs, (ad0)paramObject);
            } catch (InterruptedException interruptedException) {
              continue;
            }  
          paramObject = dk0.I();
          if (!(paramObject instanceof qh0)) {
            if (!(paramObject instanceof bo)) {
              paramObject = wf2.k0(paramObject);
            } else {
              throw ((bo)paramObject).a;
            } 
          } else {
            tp.f("This job has not completed yet");
            paramObject = xs;
          } 
          return paramObject;
        } 
      case 1:
        xs = (xs)this.h;
        dd1.r0(paramObject);
        paramObject = cq0.a;
        paramObject = fb0.d((km0)object);
        wf2.q(xs);
      case 0:
        break;
    } 
    dd1.r0(paramObject);
    paramObject = this.h;
    rm0 rm0 = (rm0)object;
    wm0 wm0 = rm0.b;
    if (((pm0<pm0>)wm0.i).compareTo(pm0.c) >= 0) {
      wm0.a(rm0);
    } else {
      g92.j(paramObject.g(), null);
    } 
    return os;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */