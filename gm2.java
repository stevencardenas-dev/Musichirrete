import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class gm2 extends zd2 implements ListIterator {
  public final int c;
  
  public int e;
  
  public final im2 f;
  
  public gm2(im2 paramim2, int paramInt) {
    super(2);
    wf2.A0(paramInt, i);
    this.c = i;
    this.e = paramInt;
    this.f = paramim2;
  }
  
  public final Object a(int paramInt) {
    return this.f.get(paramInt);
  }
  
  public final void add(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  public final boolean hasNext() {
    return (this.e < this.c);
  }
  
  public final boolean hasPrevious() {
    return (this.e > 0);
  }
  
  public final Object next() {
    if (hasNext()) {
      int i = this.e;
      this.e = i + 1;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int nextIndex() {
    return this.e;
  }
  
  public final Object previous() {
    if (hasPrevious()) {
      int i = this.e - 1;
      this.e = i;
      return a(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final int previousIndex() {
    return this.e - 1;
  }
  
  public final void set(Object paramObject) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */