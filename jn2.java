import java.util.concurrent.Executor;

public final class jn2 {
  public final int a;
  
  public final Executor b;
  
  public final Object c = new Object();
  
  public final Object d;
  
  public jn2(Executor paramExecutor, c41 paramc41) {
    this.b = paramExecutor;
    this.d = paramc41;
  }
  
  public jn2(Executor paramExecutor, i41 parami41) {
    this.b = paramExecutor;
    this.d = parami41;
  }
  
  public jn2(Executor paramExecutor, r41 paramr41) {
    this.b = paramExecutor;
    this.d = paramr41;
  }
  
  public final void a(du2 paramdu2) {
    switch (this.a) {
      default:
        if (paramdu2.f())
          synchronized (this.c) {
            this.b.execute(new zn2(1, this, paramdu2));
          }  
        return;
      case 1:
        if (!paramdu2.f())
          synchronized (this.c) {
            this.b.execute(new zn2(0, this, paramdu2));
          }  
        return;
      case 0:
        break;
    } 
    synchronized (this.c) {
      this.b.execute(new vi2(this, paramdu2, 29, false));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */