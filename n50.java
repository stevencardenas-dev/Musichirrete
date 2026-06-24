public abstract class n50 extends rs {
  public static final int h = 0;
  
  public long e;
  
  public boolean f;
  
  public v8 g;
  
  public final void s(boolean paramBoolean) {
    long l2 = this.e;
    if (paramBoolean) {
      l1 = 4294967296L;
    } else {
      l1 = 1L;
    } 
    long l1 = l2 - l1;
    this.e = l1;
    if (l1 <= 0L && this.f)
      shutdown(); 
  }
  
  public abstract void shutdown();
  
  public final void u(zz paramzz) {
    v8 v82 = this.g;
    v8 v81 = v82;
    if (v82 == null) {
      v81 = new v8();
      this.g = v81;
    } 
    v81.addLast(paramzz);
  }
  
  public final void v(boolean paramBoolean) {
    long l1;
    long l2 = this.e;
    if (paramBoolean) {
      l1 = 4294967296L;
    } else {
      l1 = 1L;
    } 
    this.e = l1 + l2;
    if (!paramBoolean)
      this.f = true; 
  }
  
  public abstract long w();
  
  public final boolean x() {
    Object object = this.g;
    if (object == null)
      return false; 
    if (object.isEmpty()) {
      object = null;
    } else {
      object = object.removeFirst();
    } 
    object = object;
    if (object == null)
      return false; 
    object.run();
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */