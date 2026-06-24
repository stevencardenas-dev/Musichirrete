import android.content.Context;
import java.util.Objects;

public final class sa2 implements xc {
  public boolean b;
  
  public final Object c;
  
  public final Object e;
  
  public Object f;
  
  public Object g;
  
  public final Object h;
  
  public sa2(Context paramContext, lf paramlf, j01 paramj01) {
    this.c = paramContext;
    this.e = paramlf;
    this.f = paramj01;
    this.g = new jc2(this, true);
    this.h = new jc2(this, false);
  }
  
  public sa2(oe0 paramoe0, he0 paramhe0, m5 paramm5) {
    Objects.requireNonNull(paramoe0);
    this.h = paramoe0;
    this.f = null;
    this.g = null;
    this.b = false;
    this.c = paramhe0;
    this.e = paramm5;
  }
  
  public void a(sp paramsp) {
    qa2 qa2 = (qa2)((oe0)this.h).l.get(this.e);
    if (qa2 != null)
      qa2.k(paramsp); 
  }
  
  public void d(sp paramsp) {
    vi2 vi2 = new vi2(this, paramsp, 18, false);
    ((oe0)this.h).o.post(vi2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */