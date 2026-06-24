public final class tp2 {
  public Object a;
  
  public js2 b;
  
  public nt2 c;
  
  public boolean d;
  
  public final void a(Object paramObject) {
    this.d = true;
    js2 js21 = this.b;
    if (js21 != null) {
      rr2 rr2 = js21.c;
      rr2.getClass();
      Object object = paramObject;
      if (paramObject == null)
        object = pp2.i; 
      if (pp2.h.A0(rr2, null, object)) {
        pp2.d(rr2);
        this.a = null;
        this.b = null;
        this.c = null;
      } 
    } 
  }
  
  public final void finalize() {
    js2 js21 = this.b;
    if (js21 != null) {
      rr2 rr2 = js21.c;
      if (!rr2.isDone()) {
        gl2 gl2 = new gl2(new y("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 3));
        if (pp2.h.A0(rr2, null, gl2))
          pp2.d(rr2); 
      } 
    } 
    if (!this.d) {
      nt2 nt21 = this.c;
      if (nt21 != null)
        nt21.i(null); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */