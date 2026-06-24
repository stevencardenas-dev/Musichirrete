import android.app.Activity;
import com.google.android.material.button.MaterialButton;
import in.krosbits.musicolet.SetLcWallActivity;

public final class hl1 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final SetLcWallActivity i;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((hl1)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((hl1)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    paramObject = this.i;
    switch (i) {
      default:
        return new hl1((SetLcWallActivity)paramObject, paramcs, 1);
      case 0:
        break;
    } 
    return new hl1((SetLcWallActivity)paramObject, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    int i = this.g;
    l02 l02 = l02.a;
    ys ys = ys.b;
    SetLcWallActivity setLcWallActivity = this.i;
    switch (i) {
      default:
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
          fl1 fl1 = new fl1(setLcWallActivity, null, 2);
          this.h = 1;
          if (qv.l0((os)paramObject, fl1, this) == ys)
            return ys; 
        } 
        setLcWallActivity.recreate();
        return l02;
      case 0:
        break;
    } 
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
      fl1 fl1 = new fl1(setLcWallActivity, null, 1);
      this.h = 1;
      Object object = qv.l0((os)paramObject, fl1, this);
      paramObject = object;
      if (object == ys)
        return ys; 
    } 
    boolean bool = ((Boolean)paramObject).booleanValue();
    paramObject = setLcWallActivity.S;
    if (bool) {
      if (paramObject != null) {
        ((MaterialButton)((n2)paramObject).e).setVisibility(0);
      } else {
        ui0.n0("binding");
        throw null;
      } 
    } else if (paramObject != null) {
      ((MaterialButton)((n2)paramObject).e).setVisibility(8);
    } else {
      ui0.n0("binding");
      throw null;
    } 
    (new Thread(new zf0((Activity)setLcWallActivity, 2131953018, 0))).start();
    return l02;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */