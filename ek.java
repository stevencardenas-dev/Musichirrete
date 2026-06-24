import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import in.krosbits.musicolet.ScreenSaverActivity;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class ek extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public Object i;
  
  public final Object j;
  
  public final Object k;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    switch (i) {
      default:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 7:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 6:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 5:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 4:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 3:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 2:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        paramObject1 = paramObject1;
        return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    return ((ek)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object1 = this.k;
    Object object2 = this.j;
    switch (i) {
      default:
        return new ek(this.i, object2, object1, paramcs, 8);
      case 7:
        return new ek(this.i, object2, object1, paramcs, 7);
      case 6:
        paramcs = new ek(object2, object1, paramcs, 6);
        ((ek)paramcs).i = paramObject;
        return paramcs;
      case 5:
        paramcs = new ek(object2, object1, paramcs, 5);
        ((ek)paramcs).i = paramObject;
        return paramcs;
      case 4:
        paramcs = new ek(object2, object1, paramcs, 4);
        ((ek)paramcs).i = paramObject;
        return paramcs;
      case 3:
        paramcs = new ek(object2, object1, paramcs, 3);
        ((ek)paramcs).i = paramObject;
        return paramcs;
      case 2:
        paramcs = new ek(object2, object1, paramcs, 2);
        ((ek)paramcs).i = paramObject;
        return paramcs;
      case 1:
        return new ek(object2, object1, paramcs, 1);
      case 0:
        break;
    } 
    paramcs = new ek(object2, object1, paramcs, 0);
    ((ek)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object<Object, Object> paramObject) {
    me1 me1;
    ScreenSaverActivity screenSaverActivity;
    bi bi;
    xs xs;
    f1 f11;
    Object<Object, Object> object3;
    le1 le1;
    f1 f12;
    ConnectivityManager connectivityManager;
    f1 f13;
    LinkedHashMap<Object, Object> linkedHashMap;
    int i = this.g;
    boolean bool = true;
    Object<Object, Object> object2 = null;
    ys ys = null;
    Context context = null;
    Object<Object, Object> object4 = null;
    oo0 oo0 = null;
    n2 n2 = null;
    y72 y72 = null;
    String str = null;
    switch (i) {
      default:
        oo0 = (oo0)this.j;
        object2 = (Object<Object, Object>)this.i;
        y72 = ((q82)object2).a;
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          if (i != 1) {
            if (i == 2) {
              dd1.r0(paramObject);
            } else {
              tp.f("call to 'resume' before 'invoke' with coroutine");
              paramObject = null;
            } 
          } else {
            dd1.r0(paramObject);
            str = s82.a;
            qp0 qp0 = qp0.h();
            paramObject = (Object<Object, Object>)new StringBuilder("Starting work for ");
            paramObject.append(y72.c);
            qp0.b(str, paramObject.toString());
            paramObject = (Object<Object, Object>)oo0.b();
            this.h = 2;
            object2 = (Object<Object, Object>)s82.a((ho0)paramObject, oo0, this);
            paramObject = object2;
          } 
        } else {
          dd1.r0(paramObject);
          context = ((q82)object2).b;
          m72 m72 = (m72)this.k;
          n2 = ((q82)object2).d;
          this.h = 1;
          paramObject = (Object<Object, Object>)k72.a;
          object2 = (Object<Object, Object>)l02.a;
          paramObject = object2;
          if (y72.q)
            if (Build.VERSION.SDK_INT >= 31) {
              paramObject = object2;
            } else {
              paramObject = (Object<Object, Object>)n2.g;
              paramObject.getClass();
              Object<Object, Object> object = (Object<Object, Object>)qv.l0(qz1.t((Executor)paramObject), new vq(oo0, y72, m72, context, null, 5), this);
              paramObject = object2;
              if (object == ys)
                paramObject = object; 
            }  
          if (paramObject == ys)
            return ys; 
          str = s82.a;
          object2 = (Object<Object, Object>)qp0.h();
          paramObject = (Object<Object, Object>)new StringBuilder("Starting work for ");
          paramObject.append(y72.c);
          object2.b(str, paramObject.toString());
          paramObject = (Object<Object, Object>)oo0.b();
          this.h = 2;
          object2 = (Object<Object, Object>)s82.a((ho0)paramObject, oo0, this);
          paramObject = object2;
        } 
        return paramObject;
      case 7:
        object2 = (Object<Object, Object>)this.j;
        ys = ys.b;
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
          paramObject = (Object<Object, Object>)((bv0)this.i).b((y72)object2);
          object2 = (Object<Object, Object>)new g90(1, this.k, object2);
          this.h = 1;
          if (paramObject.a((x80)object2, this) == ys)
            return ys; 
        } 
        return l02.a;
      case 6:
        screenSaverActivity = (ScreenSaverActivity)this.k;
        le1 = (le1)this.j;
        xs = (xs)this.i;
        ys = ys.b;
        i = this.h;
        if (i == 0 || i == 1) {
          dd1.r0(paramObject);
          while (true) {
            float f = le1.b - 0.006666667F;
            le1.b = f;
            if (f >= 0.0F) {
              ((ConstraintLayout)(screenSaverActivity.l0()).a).setAlpha(le1.b);
              this.i = xs;
              this.h = 1;
              if (ui0.o(60L, this) == ys)
                return ys; 
              continue;
            } 
            paramObject = (Object<Object, Object>)xs.g().l(vs2.g);
            if (paramObject != null)
              bool = paramObject.a(); 
            if (bool) {
              i = ScreenSaverActivity.W;
              paramObject = (Object<Object, Object>)screenSaverActivity.getWindow().getAttributes();
              ((WindowManager.LayoutParams)paramObject).screenBrightness = 0.0F;
              screenSaverActivity.getWindow().setAttributes((WindowManager.LayoutParams)paramObject);
            } 
            return l02.a;
          } 
        } 
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return object2;
      case 5:
        f13 = wf2.h;
        f12 = wf2.g;
        f11 = wf2.f;
        object2 = (Object<Object, Object>)ys.b;
        i = this.h;
        if (i != 0) {
          yn yn;
          if (i == 1) {
            yn = (yn)this.i;
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return yn;
          } 
        } else {
          dd1.r0(paramObject);
          xs xs1 = (xs)this.i;
          paramObject = (Object<Object, Object>)this.j;
          ad0 ad01 = (ad0)this.k;
          try {
            this.i = paramObject;
          } finally {
            object2 = null;
            object1 = paramObject;
            paramObject = object2;
          } 
          return paramObject;
        } 
        object2 = (Object<Object, Object>)rg1.a(paramObject);
      case 4:
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return f13;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = (Object<Object, Object>)this.i;
          paramObject = (Object<Object, Object>)e00.a;
          paramObject = (Object<Object, Object>)fr0.a.g;
          object2 = (Object<Object, Object>)new bq0((wm0)this.j, (xs)object2, (u20)this.k, null);
          this.h = 1;
          if (qv.l0((os)paramObject, (ad0)object2, this) == ys)
            return ys; 
        } 
        return l02.a;
      case 3:
        ys = ys.b;
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
          pa1 pa1 = (pa1)this.i;
          object2 = (Object<Object, Object>)((hr)this.j).a();
          paramObject = object2;
          if (object2 == null) {
            object2 = (Object<Object, Object>)((hr)this.j).a;
            object2.getClass();
            if (object2 == c21.b) {
              paramObject = null;
            } else {
              paramObject = (Object<Object, Object>)(new NetworkRequest.Builder()).addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
              if (Build.VERSION.SDK_INT >= 30 && object2 == c21.h) {
                paramObject = (Object<Object, Object>)paramObject.addCapability(25).build();
              } else {
                i = object2.ordinal();
                if (i != 2) {
                  if (i != 3) {
                    if (i == 4)
                      paramObject = (Object<Object, Object>)paramObject.addTransportType(0); 
                  } else {
                    paramObject = (Object<Object, Object>)paramObject.addCapability(18);
                  } 
                } else {
                  paramObject = (Object<Object, Object>)paramObject.addCapability(11);
                } 
                paramObject = (Object<Object, Object>)paramObject.build();
              } 
            } 
          } 
          if (paramObject == null) {
            pa1.getClass();
            pa1.h.h(null, false);
            paramObject = (Object<Object, Object>)l02.a;
          } else {
            object2 = (Object<Object, Object>)new dy(2, qv.L(pa1, null, null, new sc(this.k, pa1, null, 7), 3), pa1);
            if (Build.VERSION.SDK_INT >= 30) {
              im1 im1 = im1.a;
              connectivityManager = ((w11)this.k).a;
              im1.getClass();
              object3 = (Object<Object, Object>)im1.b;
              /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
              try {
                linkedHashMap = im1.c;
                bool = linkedHashMap.isEmpty();
                linkedHashMap.put(object2, paramObject);
                if (bool) {
                  qp0.h().b(e72.a, "NetworkRequestConstraintController register shared callback");
                  connectivityManager.registerDefaultNetworkCallback(im1);
                } else if (im1.e && im1.f != null) {
                  qp0.h().b(e72.a, "NetworkRequestConstraintController send initial capabilities");
                  if (im1.a((NetworkRequest)paramObject, im1.d)) {
                    paramObject = (Object<Object, Object>)jr.a;
                  } else {
                    paramObject = (Object<Object, Object>)new kr(7);
                  } 
                  object2.h(paramObject);
                } 
              } finally {}
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
              paramObject = (Object<Object, Object>)new qc(2, object2, connectivityManager);
            } else {
              i = zh0.c;
              connectivityManager = ((w11)this.k).a;
              object3 = (Object<Object, Object>)new zh0((dy)object2);
              Object object = new Object();
              try {
                qp0.h().b(e72.a, "NetworkRequestConstraintController register callback");
                connectivityManager.registerNetworkCallback((NetworkRequest)paramObject, (ConnectivityManager.NetworkCallback)object3);
                ((ke1)object).b = true;
              } catch (RuntimeException runtimeException) {
                if (runtimeException.getClass().getName().endsWith("TooManyRequestsException")) {
                  qp0.h().d(e72.a, "NetworkRequestConstraintController couldn't register callback", runtimeException);
                  object2.h(new kr(7));
                } else {
                  throw runtimeException;
                } 
              } 
              paramObject = (Object<Object, Object>)new yh0((ke1)object, connectivityManager, (zh0)object3);
            } 
            paramObject = (Object<Object, Object>)new pp(3, paramObject);
            this.h = 1;
            if (g92.h(pa1, (lc0)paramObject, this) == ys)
              return ys; 
            paramObject = (Object<Object, Object>)l02.a;
          } 
          return paramObject;
        } 
        paramObject = (Object<Object, Object>)l02.a;
      case 2:
        bi = (bi)this.k;
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            try {
              dd1.r0(paramObject);
              bi.a(paramObject);
            } catch (CancellationException cancellationException) {
              bi.d = true;
              ei ei = bi.b;
            } finally {
              paramObject = null;
            } 
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return object3;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = (Object<Object, Object>)this.i;
          paramObject = (Object<Object, Object>)this.j;
          this.h = 1;
          object2 = (Object<Object, Object>)paramObject.g(object2, this);
          paramObject = object2;
          if (object2 == ys)
            return ys; 
          bi.a(paramObject);
        } 
        return l02.a;
      case 1:
        ys = ys.b;
        i = this.h;
        if (i != 0) {
          if (i == 1) {
            me1 = (me1)this.i;
            dd1.r0(paramObject);
          } else {
            tp.f("call to 'resume' before 'invoke' with coroutine");
            return linkedHashMap;
          } 
        } else {
          dd1.r0(paramObject);
          object2 = (Object<Object, Object>)this.j;
          paramObject = (Object<Object, Object>)this.k;
          this.i = object2;
          this.h = 1;
          paramObject = (Object<Object, Object>)paramObject.a(this);
          if (paramObject == me1) {
            paramObject = (Object<Object, Object>)me1;
          } else {
            object1 = object2;
            ((me1)object1).b = paramObject;
            paramObject = (Object<Object, Object>)l02.a;
          } 
          return paramObject;
        } 
        ((me1)object1).b = paramObject;
        paramObject = (Object<Object, Object>)l02.a;
      case 0:
        break;
    } 
    Object<Object, Object> object1 = (Object<Object, Object>)l02.a;
    object2 = (Object<Object, Object>)ys.b;
    i = this.h;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return connectivityManager;
      } 
    } else {
      dd1.r0(paramObject);
      xs xs1 = (xs)this.i;
      object3 = (Object<Object, Object>)this.j;
      fk fk = (fk)this.k;
      paramObject = (Object<Object, Object>)fk.b;
      int j = fk.c;
      i = j;
      if (j == -3)
        i = -2; 
      hh hh = fk.e;
      at at = at.e;
      sc sc = new sc(fk, null, 1);
      lh lh = n21.a(i, hh, 4);
      os os = qz1.s(xs1.g(), (os)paramObject, true);
      object4 = (Object<Object, Object>)e00.a;
      paramObject = (Object<Object, Object>)os;
      if (os != object4) {
        paramObject = (Object<Object, Object>)os;
        if (os.l(vs2.c) == null)
          paramObject = (Object<Object, Object>)os.k((os)object4); 
      } 
      paramObject = (Object<Object, Object>)new pa1((os)paramObject, lh);
      paramObject.j0(at, (m)paramObject, sc);
      this.h = 1;
      paramObject = (Object<Object, Object>)n21.w((x80)object3, (dk)paramObject, true, this);
      if (paramObject != object2)
        paramObject = object1; 
      if (paramObject == object2)
        return object2; 
    } 
    return object1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */