import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

public final class j02 extends pr1 implements ad0 {
  public boolean g;
  
  public final Context h;
  
  public j02(Context paramContext, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject1.booleanValue();
    paramObject1 = l((cs)paramObject2, paramObject1);
    paramObject2 = l02.a;
    paramObject1.n(paramObject2);
    return paramObject2;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    paramcs = new j02(this.h, paramcs);
    ((j02)paramcs).g = ((Boolean)paramObject).booleanValue();
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    dd1.r0(paramObject);
    boolean bool = this.g;
    n51.a(this.h, RescheduleReceiver.class, bool);
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */