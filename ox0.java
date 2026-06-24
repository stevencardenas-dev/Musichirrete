import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

public final class ox0 {
  public final g7 a;
  
  public final zv0 b;
  
  public final HashMap c = new HashMap<Object, Object>();
  
  public ox0(Context paramContext, zv0 paramzv0) {
    this.a = g71;
    this.b = paramzv0;
  }
  
  public final uw1 a(String paramString) {
    /* monitor enter ThisExpression{ObjectType{ox0}} */
    try {
      if (this.c.containsKey(paramString)) {
        uw1 uw11 = (uw1)this.c.get(paramString);
        /* monitor exit ThisExpression{ObjectType{ox0}} */
        return uw11;
      } 
    } finally {}
    CctBackendFactory cctBackendFactory = this.a.u(paramString);
    if (cctBackendFactory == null) {
      /* monitor exit ThisExpression{ObjectType{ox0}} */
      return null;
    } 
    zv0 zv01 = this.b;
    Context context = (Context)zv01.c;
    am am1 = (am)zv01.e;
    am am2 = (am)zv01.f;
    xa xa = new xa();
    this(context, am1, am2, paramString);
    uw1 uw1 = cctBackendFactory.create(xa);
    this.c.put(paramString, uw1);
    /* monitor exit ThisExpression{ObjectType{ox0}} */
    return uw1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ox0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */