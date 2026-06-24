import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class q implements Iterator, fl0 {
  public final int b;
  
  public int c;
  
  public final Object e;
  
  public final boolean hasNext() {
    int i = this.b;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = false;
    Object object = this.e;
    switch (i) {
      default:
        bool1 = bool2;
        if (this.c < ((ViewGroup)object).getChildCount())
          bool1 = true; 
        return bool1;
      case 1:
        bool1 = bool3;
        if (this.c < ((Object[])object).length)
          bool1 = true; 
        return bool1;
      case 0:
        break;
    } 
    if (this.c < ((t)object).c())
      bool1 = true; 
    return bool1;
  }
  
  public final Object next() {
    int i = this.b;
    object = this.e;
    switch (i) {
      default:
        object = object;
        i = this.c;
        this.c = i + 1;
        object = object.getChildAt(i);
        if (object != null)
          return object; 
        throw new IndexOutOfBoundsException();
      case 1:
        try {
          object = object;
          i = this.c;
          this.c = i + 1;
          return object[i];
        } catch (ArrayIndexOutOfBoundsException object) {
          this.c--;
          throw new NoSuchElementException(object.getMessage());
        } 
      case 0:
        break;
    } 
    if (hasNext()) {
      object = object;
      i = this.c;
      this.c = i + 1;
      return object.get(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    int i;
    ViewGroup viewGroup;
    switch (this.b) {
      default:
        viewGroup = (ViewGroup)this.e;
        i = this.c - 1;
        this.c = i;
        viewGroup.removeViewAt(i);
        return;
      case 1:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
      case 0:
        break;
    } 
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */