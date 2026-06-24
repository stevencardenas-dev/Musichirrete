import java.util.Iterator;

public final class hi1 extends ii1 implements Iterator {
  public gi1 b;
  
  public boolean c;
  
  public final ji1 e;
  
  public hi1(ji1 paramji1) {
    this.e = paramji1;
    this.c = true;
  }
  
  public final void a(gi1 paramgi1) {
    gi1 gi11 = this.b;
    if (paramgi1 == gi11) {
      boolean bool;
      paramgi1 = gi11.f;
      this.b = paramgi1;
      if (paramgi1 == null) {
        bool = true;
      } else {
        bool = false;
      } 
      this.c = bool;
    } 
  }
  
  public final boolean hasNext() {
    if (this.c) {
      if (this.e.b != null)
        return true; 
    } else {
      gi1 gi11 = this.b;
      if (gi11 != null && gi11.e != null)
        return true; 
    } 
    return false;
  }
  
  public final Object next() {
    if (this.c) {
      this.c = false;
      this.b = this.e.b;
    } else {
      gi1 gi11 = this.b;
      if (gi11 != null) {
        gi11 = gi11.e;
      } else {
        gi11 = null;
      } 
      this.b = gi11;
    } 
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */