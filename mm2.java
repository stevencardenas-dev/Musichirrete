import java.util.NoSuchElementException;

public final class mm2 extends zd2 {
  public final Object c;
  
  public boolean e;
  
  public mm2(Object paramObject) {
    super(2);
    this.c = paramObject;
  }
  
  public final boolean hasNext() {
    return !this.e;
  }
  
  public final Object next() {
    if (!this.e) {
      this.e = true;
      return this.c;
    } 
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */