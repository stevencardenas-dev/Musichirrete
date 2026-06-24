import java.util.concurrent.CancellationException;

public abstract class zz extends mt1 {
  public int e;
  
  public zz(int paramInt) {
    super(0L, false);
    this.e = paramInt;
  }
  
  public void b(CancellationException paramCancellationException) {}
  
  public abstract cs c();
  
  public Throwable g(Object paramObject) {
    if (paramObject instanceof bo) {
      paramObject = paramObject;
    } else {
      paramObject = null;
    } 
    return (paramObject != null) ? ((bo)paramObject).a : null;
  }
  
  public Object h(Object paramObject) {
    return paramObject;
  }
  
  public final void k(Throwable paramThrowable) {
    StringBuilder stringBuilder = new StringBuilder("Fatal exception in coroutines machinery for ");
    stringBuilder.append(this);
    stringBuilder.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
    paramThrowable = new Error(stringBuilder.toString(), paramThrowable);
    m92.G(c().e(), paramThrowable);
  }
  
  public abstract Object l();
  
  public final void run() {
    Object object1;
    Exception exception;
    vj0 vj0;
    os os;
    ds ds;
    Object object2;
    Throwable throwable;
    Object object3;
    try {
      cs cs = c();
      cs.getClass();
      cs = cs;
      ds = ((xz)cs).g;
      object1 = ((xz)cs).i;
      os = ds.e();
      object2 = wf2.m0(os, object1);
      object1 = wf2.o;
      vj0 = null;
      if (object2 != object1) {
        object1 = qz1.S(ds, os, object2);
      } else {
        object1 = null;
      } 
    } finally {}
    try {
      os os1 = ds.e();
      object3 = l();
      throwable = g(object3);
      vj0 vj01 = vj0;
      if (throwable == null) {
        int i = this.e;
        boolean bool2 = true;
        boolean bool1 = bool2;
        if (i != 1)
          if (i == 2) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }  
        vj01 = vj0;
        if (bool1)
          vj01 = (vj0)os1.l(vs2.g); 
      } 
    } finally {}
    if (exception != null && !exception.a()) {
      CancellationException cancellationException = ((dk0)exception).C();
      b(cancellationException);
      qg1 qg1 = new qg1();
      this(cancellationException);
      ds.f(qg1);
    } else if (throwable != null) {
      qg1 qg1 = new qg1();
      this(throwable);
      ds.f(qg1);
    } else {
      ds.f(h(object3));
    } 
    if (object1 == null || object1.k0()) {
      wf2.X(os, object2);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */