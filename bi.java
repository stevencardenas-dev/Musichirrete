public final class bi {
  public Object a;
  
  public ei b;
  
  public hg1 c;
  
  public boolean d;
  
  public final void a(Object paramObject) {
    this.d = true;
    ei ei1 = this.b;
    if (ei1 != null) {
      di di = ei1.c;
      di.getClass();
      Object object = paramObject;
      if (paramObject == null)
        object = e0.i; 
      if (e0.h.j(di, null, object)) {
        e0.d(di);
        this.a = null;
        this.b = null;
        this.c = null;
      } 
    } 
  }
  
  public final void b(Throwable paramThrowable) {
    this.d = true;
    ei ei1 = this.b;
    if (ei1 != null && ei1.c.j(paramThrowable)) {
      this.a = null;
      this.b = null;
      this.c = null;
    } 
  }
  
  public final void finalize() {
    ei ei1 = this.b;
    if (ei1 != null) {
      di di = ei1.c;
      if (!di.isDone()) {
        StringBuilder stringBuilder = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
        stringBuilder.append(this.a);
        di.j(new y(stringBuilder.toString(), 1));
      } 
    } 
    if (!this.d) {
      hg1 hg11 = this.c;
      if (hg11 != null)
        hg11.k(null); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */