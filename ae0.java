import java.util.Collection;

public final class ae0 {
  public final ee0 a;
  
  public void a(wu0 paramwu0, su0 paramsu0, Collection paramCollection) {
    fv0 fv0;
    ee0 ee01 = this.a;
    if (paramwu0 == ee01.A && paramsu0 != null) {
      gv0 gv0 = ee01.z.a;
      String str = paramsu0.d();
      fv0 = new fv0(gv0, str, ee01.b(gv0, str));
      fv0.i(paramsu0);
      if (ee01.d != fv0) {
        ee01.j(ee01, fv0, ee01.A, 3, true, ee01.z, paramCollection);
        ee01.z = null;
        ee01.A = null;
        return;
      } 
    } else if (fv0 == ee01.e) {
      if (paramsu0 != null)
        ee01.p(ee01.d, paramsu0); 
      fv0 = ee01.d.a();
      if (fv0 != null)
        fv0.n(paramCollection); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ae0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */