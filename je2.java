import android.os.Bundle;
import android.os.RemoteException;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import java.util.ArrayList;
import java.util.List;

public final class je2 extends ot2 {
  public final int c;
  
  public final nt1 e;
  
  public final Object f;
  
  public final Object g;
  
  public je2(dg2 paramdg2, nt1 paramnt11, List paramList, nt1 paramnt12) {
    super(paramnt11);
  }
  
  public je2(md2 parammd2, nt1 paramnt11, nt1 paramnt12, ot2 paramot2) {
    super(paramnt11);
  }
  
  public final void a() {
    switch (this.c) {
      default:
        object = ((md2)this.g).f;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          md2 md2 = (md2)this.g;
          nt1 nt11 = this.e;
          md2.e.add(nt11);
          du2 du2 = nt11.a;
          qj2 qj2 = new qj2();
          this(md2, nt11);
          du2.a(qj2);
          if (((md2)this.g).k.getAndIncrement() > 0)
            ((md2)this.g).b.e(jLnXOLx.KyXmUjKty, new Object[0]); 
        } finally {
          Exception exception;
        } 
        md2.b((md2)this.g, (ot2)this.f);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 0:
        break;
    } 
    Object object = this.e;
    List list = (List)this.f;
    dg2 dg2 = (dg2)this.g;
    try {
      ug2 ug2 = dg2.b.m;
      String str = dg2.a;
      ArrayList arrayList = dg2.c(list);
      Bundle bundle = dg2.d();
      ze2 ze2 = new ze2();
      this(dg2, (nt1)object, 1);
      ug2.f(str, arrayList, bundle, ze2);
    } catch (RemoteException remoteException) {
      dg2.c.c(remoteException, "deferredInstall(%s)", new Object[] { list });
      object.c(new RuntimeException((Throwable)remoteException));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\je2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */