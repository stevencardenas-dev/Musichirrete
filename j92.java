import android.os.RemoteException;
import java.util.HashSet;

public final class j92 extends ia2 {
  public final int c;
  
  public final Object e;
  
  public j92(bl parambl) {}
  
  public j92(k92 paramk92) {}
  
  public final void b() {
    k92 k92;
    switch (this.c) {
      default:
        k92 = (k92)this.e;
        object = k92.f;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (k92.l.get() > 0 && k92.l.decrementAndGet() > 0) {
            k92.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } else {
            if (k92.n != null) {
              k92.b.a("Unbind from service.", new Object[0]);
              k92.a.unbindService(k92.m);
              k92.g = false;
              k92.n = null;
              k92.m = null;
            } 
            HashSet hashSet = k92.e;
            for (nt1 nt1 : hashSet) {
              String str = String.valueOf(k92.c);
              RemoteException remoteException = new RemoteException();
              this(str.concat(" : Binder has died."));
              nt1.c((Exception)remoteException);
            } 
            hashSet.clear();
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } 
        } finally {
          Exception exception;
        } 
        return;
      case 0:
        break;
    } 
    Object object = ((bl)this.e).c;
    ((k92)object).b.a("unlinkToDeath", new Object[0]);
    ((k92)object).n.asBinder().unlinkToDeath(((k92)object).k, 0);
    ((k92)object).n = null;
    ((k92)object).g = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */