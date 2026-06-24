public final class lv1 extends x32 {
  public final int a;
  
  public boolean b;
  
  public int c;
  
  public final Object d;
  
  public lv1(mv1 parammv1, int paramInt) {
    this.d = parammv1;
    this.c = paramInt;
    this.b = false;
  }
  
  public lv1(v32 paramv32) {
    this.d = paramv32;
    this.b = false;
    this.c = 0;
  }
  
  public final void a() {
    v32 v32;
    int i = this.a;
    Object object = this.d;
    switch (i) {
      default:
        i = this.c + 1;
        this.c = i;
        v32 = (v32)object;
        if (i == v32.b.size()) {
          object = v32.g;
          if (object != null)
            object.a(); 
          this.c = 0;
          this.b = false;
          v32.e = false;
        } 
        return;
      case 0:
        break;
    } 
    if (!this.b)
      ((mv1)object).a.setVisibility(this.c); 
  }
  
  public void b() {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    this.b = true;
  }
  
  public final void c() {
    int i = this.a;
    Object object = this.d;
    switch (i) {
      default:
        if (!this.b) {
          this.b = true;
          object = ((v32)object).g;
          if (object != null)
            object.c(); 
        } 
        return;
      case 0:
        break;
    } 
    ((mv1)object).a.setVisibility(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */