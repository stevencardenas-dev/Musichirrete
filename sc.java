import android.graphics.Point;
import android.net.Uri;
import android.view.WindowManager;
import in.krosbits.musicolet.EPCsCSVActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SetLcWallActivity;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public final class sc extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public Object i;
  
  public final Object j;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    switch (i) {
      default:
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 10:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 9:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 8:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 7:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 6:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 5:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 4:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 3:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 2:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        paramObject1 = paramObject1;
        return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    return ((sc)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object = this.j;
    switch (i) {
      default:
        paramcs = new sc(object, paramcs, 11);
        ((sc)paramcs).i = paramObject;
        return paramcs;
      case 10:
        return new sc(this.i, object, paramcs, 10);
      case 9:
        return new sc(this.i, object, paramcs, 9);
      case 8:
        paramcs = new sc(object, paramcs, 8);
        ((sc)paramcs).i = paramObject;
        return paramcs;
      case 7:
        return new sc(this.i, object, paramcs, 7);
      case 6:
        return new sc(object, paramcs, 6);
      case 5:
        return new sc(this.i, object, paramcs, 5);
      case 4:
        return new sc(this.i, object, paramcs, 4);
      case 3:
        return new sc(this.i, object, paramcs, 3);
      case 2:
        paramcs = new sc(object, paramcs, 2);
        ((sc)paramcs).i = paramObject;
        return paramcs;
      case 1:
        paramcs = new sc(object, paramcs, 1);
        ((sc)paramcs).i = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    paramcs = new sc(object, paramcs, 0);
    ((sc)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    km0 km0;
    int i = this.g;
    ys ys = null;
    qp0 qp0 = null;
    String str = null;
    Object object4 = null;
    Object object1 = null;
    lc0 lc0 = null;
    Object object2 = null;
    Object object3 = null;
    qq qq = null;
    tc tc = null;
    switch (i) {
      default:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return tc;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = this.i;
          paramObject = this.j;
          this.h = 1;
          if (paramObject.k(object2, this) == object1)
            return object1; 
        } 
        return l02.a;
      case 10:
        lc0 = (lc0)this.j;
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            try {
              dd1.r0(paramObject);
            } finally {}
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return ys;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = this.i;
          this.h = 1;
          object2 = jx1.b((jx1)paramObject, this);
          paramObject = object2;
          if (object2 == object1)
            return object1; 
        } 
        paramObject = paramObject;
        lc0.a();
        return l02.a;
      case 9:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return qp0;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = MyApplication.i.getApplicationContext().getSystemService("window");
          paramObject.getClass();
          object2 = ((WindowManager)paramObject).getDefaultDisplay();
          paramObject = new Point();
          object2.getRealSize((Point)paramObject);
          i = ((Point)paramObject).y;
          i = Math.max(((Point)paramObject).x, i);
          paramObject = e00.a;
          paramObject = fw.e;
          object2 = new gl1((SetLcWallActivity)this.i, (Uri)this.j, i, null);
          this.h = 1;
          if (qv.l0((os)paramObject, (ad0)object2, this) == object1)
            return object1; 
        } 
        return l02.a;
      case 8:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return str;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = this.i;
          object2 = this.j;
          this.h = 1;
          if (object2.g(paramObject, this) == object1)
            return object1; 
        } 
        return l02.a;
      case 7:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return object4;
          } 
        } else {
          dd1.r0(paramObject);
          this.h = 1;
          if (ui0.o(1000L, this) == object1)
            return object1; 
        } 
        qp0.h().b(e72.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((pa1)this.j).n(new kr(7));
        return l02.a;
      case 6:
        object2 = this.j;
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          mq0 mq0;
          if (i == 1) {
            mq0 = (mq0)this.i;
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return mq0;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = cq0.a;
          km0 = ((mq0)object2).C0;
          iq0 iq0 = fb0.o();
          this.i = object2;
          this.h = 1;
          paramObject = e00.a;
          paramObject = qv.l0(fw.e, new vq(km0, iq0, null, 2), this);
          if (paramObject == ys) {
            paramObject = ys;
          } else {
            object1 = object2;
            ((mq0)object1).J0 = (aq0)paramObject;
            ((mq0)object2).H0 = null;
            paramObject = l02.a;
          } 
          return paramObject;
        } 
        ((mq0)object1).J0 = (aq0)paramObject;
        ((mq0)object2).H0 = null;
        paramObject = l02.a;
      case 5:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return km0;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = this.i;
          paramObject = this.j;
          this.h = 1;
          if (EPCsCSVActivity.l0((EPCsCSVActivity)object2, (Uri)paramObject, this) == object1)
            return object1; 
        } 
        return l02.a;
      case 4:
        object1 = ys.b;
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
          object2 = this.i;
          paramObject = ((me1)this.j).b;
          this.h = 1;
          object2 = object2.g(paramObject, this);
          paramObject = object2;
          if (object2 == object1)
            paramObject = object1; 
        } 
        return paramObject;
      case 3:
        object1 = ys.b;
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
          object2 = this.i;
          paramObject = this.j;
          this.h = 1;
          object2 = object2.g(paramObject, this);
          paramObject = object2;
          if (object2 == object1)
            paramObject = object1; 
        } 
        return paramObject;
      case 2:
        object1 = l02.a;
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return object2;
          } 
        } else {
          dd1.r0(paramObject);
          paramObject = this.i;
          object2 = this.j;
          this.h = 1;
          paramObject = ((gk)object2).f.a((x80)paramObject, this);
          if (paramObject != ys)
            paramObject = object1; 
          if (paramObject == ys)
            return ys; 
        } 
        return object1;
      case 1:
        object1 = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return object3;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = this.i;
          paramObject = this.j;
          this.h = 1;
          if (paramObject.c((pa1)object2, this) == object1)
            return object1; 
        } 
        return l02.a;
      case 0:
        break;
    } 
    object1 = ys.b;
    i = this.h;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f(fXMDNeMWaILNVh.dvksKlkOt);
        return qq;
      } 
    } else {
      dd1.r0(paramObject);
      pa1 pa1 = (pa1)this.i;
      tc = (tc)this.j;
      rc rc = new rc(tc, pa1);
      qq = tc.a;
      qq.getClass();
      object2 = qq.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (qq.d.add(rc)) {
          if (qq.d.size() == 1) {
            qq.e = qq.a();
            qp0 = qp0.h();
            str = rq.a;
            paramObject = new StringBuilder();
            super();
            paramObject.append(qq.getClass().getSimpleName());
            paramObject.append(": initial state = ");
            paramObject.append(qq.e);
            qp0.b(str, paramObject.toString());
            qq.c();
          } 
          if (tc.e(qq.e)) {
            paramObject = new kr();
            super(tc.d());
          } else {
            paramObject = jr.a;
          } 
          pa1.getClass();
          pa1.n(paramObject);
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      paramObject = new qc(0, this.j, rc);
      this.h = 1;
      if (g92.h(pa1, (lc0)paramObject, this) == object1)
        return object1; 
    } 
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */