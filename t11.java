import android.os.Build;

public final class t11 extends tc {
  public static final String c = qp0.j("NetworkMeteredCtrlr");
  
  public final int b = 7;
  
  public t11(b21 paramb21) {
    super(paramb21);
  }
  
  public final boolean b(y72 paramy72) {
    paramy72.getClass();
    return (paramy72.j.a == c21.g);
  }
  
  public final int d() {
    return this.b;
  }
  
  public final boolean e(Object paramObject) {
    paramObject = paramObject;
    paramObject.getClass();
    boolean bool1 = ((z11)paramObject).e;
    boolean bool2 = ((z11)paramObject).a;
    if (Build.VERSION.SDK_INT < 26) {
      qp0.h().b(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
      if (!bool2 || bool1)
        return true; 
    } else if (!bool2 || !((z11)paramObject).c || bool1) {
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */