public final class ro0 {
  public final gh1 a;
  
  public boolean b;
  
  public int c;
  
  public final vz0 d;
  
  public ro0(vz0 paramvz0, gh1 paramgh1) {
    this.d = paramvz0;
    this.c = -1;
    this.a = paramgh1;
  }
  
  public final void a(boolean paramBoolean) {
    int i;
    if (paramBoolean == this.b)
      return; 
    this.b = paramBoolean;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    } 
    vz0 vz01 = this.d;
    int j = vz01.c;
    vz01.c = i + j;
    if (!vz01.d) {
      vz01.d = true;
      i = j;
      try {
        while (true) {
          j = vz01.c;
          if (i != j) {
            i = j;
            continue;
          } 
          vz01.d = false;
          break;
        } 
        return;
      } finally {
        vz01.d = false;
      } 
    } 
    if (this.b)
      vz01.c(this); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ro0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */