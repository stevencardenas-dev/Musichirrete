import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ki0 implements Iterator, fl0 {
  public final int b;
  
  public final int c;
  
  public boolean e;
  
  public int f;
  
  public ki0(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt3;
    this.c = paramInt2;
    boolean bool = false;
    if ((paramInt3 > 0) ? (paramInt1 <= paramInt2) : (paramInt1 >= paramInt2))
      bool = true; 
    this.e = bool;
    if (!bool)
      paramInt1 = paramInt2; 
    this.f = paramInt1;
  }
  
  public final boolean hasNext() {
    return this.e;
  }
  
  public final Object next() {
    int i = this.f;
    if (i == this.c) {
      if (this.e) {
        this.e = false;
      } else {
        throw new NoSuchElementException();
      } 
    } else {
      this.f = this.b + i;
    } 
    return Integer.valueOf(i);
  }
  
  public final void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ki0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */