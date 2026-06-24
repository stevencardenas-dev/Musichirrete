public final class i02 extends pr1 implements cd0 {
  public int g;
  
  public Throwable h;
  
  public long i;
  
  public final Object n(Object paramObject) {
    int i = this.g;
    if (i != 0) {
      if (i == 1) {
        dd1.r0(paramObject);
      } else {
        tp.f("call to 'resume' before 'invoke' with coroutine");
        return null;
      } 
    } else {
      dd1.r0(paramObject);
      paramObject = this.h;
      long l = this.i;
      qp0.h().g(k02.a, "Cannot check for unfinished work", (Throwable)paramObject);
      l = Math.min(l * 30000L, k02.b);
      this.g = 1;
      paramObject = ui0.o(l, this);
      ys ys = ys.b;
      if (paramObject == ys)
        return ys; 
    } 
    return Boolean.TRUE;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */