import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class ib2 extends za2 {
  public final nt1 b;
  
  public final int c;
  
  public final Object d;
  
  public ib2(int paramInt, nt1 paramnt1) {
    super(paramInt);
    this.b = paramnt1;
  }
  
  public ib2(bb2 parambb2, nt1 paramnt1) {
    this(3, paramnt1);
    this.d = parambb2;
  }
  
  public ib2(po0 parampo0, nt1 paramnt1) {
    this(4, paramnt1);
    this.d = parampo0;
  }
  
  public final u70[] a(qa2 paramqa2) {
    bb2 bb2;
    u70[] arrayOfU70;
    int i = this.c;
    Object object = this.d;
    switch (i) {
      default:
        bb2 = (bb2)paramqa2.j.get(object);
        if (bb2 == null) {
          bb2 = null;
        } else {
          arrayOfU70 = (u70[])bb2.a.c;
        } 
        return arrayOfU70;
      case 0:
        break;
    } 
    return (u70[])((bb2)object).a.c;
  }
  
  public final boolean b(qa2 paramqa2) {
    bb2 bb2;
    boolean bool;
    int i = this.c;
    Object object = this.d;
    switch (i) {
      default:
        bb2 = (bb2)paramqa2.j.get(object);
        if (bb2 != null && bb2.a.a) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    return ((bb2)object).a.a;
  }
  
  public final void c(Status paramStatus) {
    l5 l5 = new l5(paramStatus);
    this.b.c(l5);
  }
  
  public final void d(Exception paramException) {
    this.b.c(paramException);
  }
  
  public final void f(qa2 paramqa2) {
    try {
      j(paramqa2);
      return;
    } catch (DeadObjectException deadObjectException) {
      c(za2.g((RemoteException)deadObjectException));
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      c(za2.g(remoteException));
      return;
    } catch (RuntimeException runtimeException) {
      this.b.c(runtimeException);
      return;
    } 
  }
  
  public final void j(qa2 paramqa2) {
    he0 he01;
    switch (this.c) {
      default:
        bb2 = (bb2)paramqa2.j.remove(this.d);
        if (bb2 != null) {
          he01 = paramqa2.f;
          nt1 nt12 = this.b;
          ((fb0)((tk)bb2.b.c).d).accept(he01, nt12);
          ((qo0)bb2.a.b).a = null;
        } else {
          this.b.d(Boolean.FALSE);
        } 
        return;
      case 0:
        break;
    } 
    bb2 bb2 = (bb2)this.d;
    of of = bb2.a;
    he0 he02 = ((qa2)he01).f;
    nt1 nt11 = this.b;
    ((a42)((tk)of.d).c).accept(he02, nt11);
    po0 po0 = ((qo0)of.b).a;
    if (po0 != null)
      ((qa2)he01).j.put(po0, bb2); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ib2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */