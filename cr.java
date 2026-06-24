import android.content.Context;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import in.krosbits.musicolet.EPCsCSVActivity;

public final class cr extends pr1 implements ad0 {
  public final int g;
  
  public final Object h;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    switch (i) {
      default:
        paramObject1 = paramObject1;
        ((cr)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 2:
        paramObject1 = paramObject1;
        ((cr)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 1:
        paramObject1 = paramObject1;
        ((cr)l((cs)paramObject2, paramObject1)).n(l02);
        return l02;
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    ((cr)l((cs)paramObject2, paramObject1)).n(l02);
    return l02;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.h;
    switch (i) {
      default:
        return new cr(paramObject, paramcs, 3);
      case 2:
        return new cr(paramObject, paramcs, 2);
      case 1:
        return new cr(paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new cr(paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    l02 l02 = l02.a;
    Object object = this.h;
    switch (i) {
      default:
        dd1.r0(paramObject);
        try {
          paramObject = object;
        } finally {
          paramObject = null;
        } 
        return l02;
      case 2:
        dd1.r0(paramObject);
        ((mq0)object).s();
        return l02;
      case 1:
        dd1.r0(paramObject);
        paramObject = object;
        object = ((EPCsCSVActivity)paramObject).U;
        if (object != null)
          object.dismiss(); 
        object = new ms0((Context)paramObject);
        object.o(0, true);
        ((ms0)object).t0 = false;
        object.c(2131887105);
        ((ms0)object).J = false;
        ((ms0)object).K = false;
        ((EPCsCSVActivity)paramObject).U = object.p();
        return l02;
      case 0:
        break;
    } 
    dd1.r0(paramObject);
    paramObject = dr.a;
    y72 y72 = (y72)object;
    object = qp0.h();
    StringBuilder stringBuilder = new StringBuilder(RqlokDsQOju.BHZrPYHqnDy);
    stringBuilder.append(y72);
    object.b((String)paramObject, stringBuilder.toString());
    return l02;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */