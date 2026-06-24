import android.net.Uri;
import in.krosbits.musicolet.EPCsCSVActivity;

public final class t20 extends pr1 implements ad0 {
  public final me1 g;
  
  public final Uri h;
  
  public final EPCsCSVActivity i;
  
  public final ke1 j;
  
  public t20(me1 paramme1, Uri paramUri, EPCsCSVActivity paramEPCsCSVActivity, ke1 paramke1, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((t20)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    EPCsCSVActivity ePCsCSVActivity = this.i;
    paramObject = this.j;
    return new t20(this.g, this.h, ePCsCSVActivity, (ke1)paramObject, paramcs);
  }
  
  public final Object n(Object paramObject) {
    dd1.r0(paramObject);
    paramObject = this.h.toString();
    v00 v00 = v00.q(n21.f, (String)paramObject);
    me1 me11 = this.g;
    me11.b = v00;
    paramObject = this.i;
    String str = ((EPCsCSVActivity)paramObject).R;
    if (str != null) {
      boolean bool = z51.U(v00, str, ((EPCsCSVActivity)paramObject).V);
      this.j.b = bool;
      if (!bool)
        try {
          paramObject = me11.b;
        } finally {
          paramObject = null;
        }  
      return l02.a;
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */