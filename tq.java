import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class tq extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final Object i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
      case 4:
        return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
      case 3:
        return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
      case 2:
        return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((tq)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.i;
    switch (i) {
      default:
        return new tq(paramObject, paramcs, 5);
      case 4:
        return new tq(paramObject, paramcs, 4);
      case 3:
        return new tq(paramObject, paramcs, 3);
      case 2:
        return new tq(paramObject, paramcs, 2);
      case 1:
        return new tq(paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new tq(paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    ys ys2;
    int i = this.g;
    l02 l02 = l02.a;
    Object object = this.i;
    ys ys1 = ys.b;
    switch (i) {
      default:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            l02 = null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = object;
          this.h = 1;
          if (paramObject.f(this) == ys1)
            ys2 = ys1; 
        } 
        return ys2;
      case 4:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            paramObject = null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = object;
          this.h = 1;
          while (true) {
            Object object1 = paramObject.I();
            if (!(object1 instanceof qh0)) {
              if (!(object1 instanceof bo)) {
                paramObject = wf2.k0(object1);
              } else {
                throw ((bo)object1).a;
              } 
            } else if (paramObject.b0(object1) >= 0) {
              object1 = new ak0(dd1.N(this), (dk0)paramObject);
              object1.x();
              object1.A(new gi(2, g92.M((vj0)paramObject, true, new vg1((ak0)object1))));
              paramObject = object1.v();
            } else {
              continue;
            } 
            object1 = paramObject;
            paramObject = object1;
            if (object1 == ys1)
              paramObject = ys1; 
            return paramObject;
          } 
        } 
        return paramObject;
      case 3:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            ys2 = null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = cq0.a;
          paramObject = object;
          this.h = 1;
          if (fb0.f((km0)paramObject, this) == ys1)
            ys2 = ys1; 
        } 
        return ys2;
      case 2:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            ys2 = null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = object;
          this.h = 1;
          if (paramObject.a(this) == ys1)
            ys2 = ys1; 
        } 
        return ys2;
      case 1:
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            ys2 = null;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = object;
          this.h = 1;
          paramObject = paramObject.a(h21.b, this);
          if (paramObject != ys1)
            paramObject = ys2; 
          if (paramObject == ys1)
            ys2 = ys1; 
        } 
        return ys2;
      case 0:
        break;
    } 
    i = this.h;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        paramObject = null;
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = object;
      this.h = 1;
      Object object1 = ConstraintTrackingWorker.e((ConstraintTrackingWorker)paramObject, this);
      paramObject = object1;
      if (object1 == ys1)
        paramObject = ys1; 
    } 
    return paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */