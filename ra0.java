import android.view.View;

public final class ra0 extends qz1 {
  public final ua0 k;
  
  public ra0(ua0 paramua0) {
    this.k = paramua0;
  }
  
  public final View K(int paramInt) {
    ua0 ua01 = this.k;
    View view = ua01.K;
    if (view != null)
      return view.findViewById(paramInt); 
    tp.f(x41.j("Fragment ", ua01, " does not have a view"));
    return null;
  }
  
  public final boolean L() {
    return (this.k.K != null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ra0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */