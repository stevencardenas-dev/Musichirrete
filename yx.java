import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class yx implements Iterator, fl0 {
  public int b;
  
  public int c;
  
  public int e;
  
  public li0 f;
  
  public final zx g;
  
  public yx(zx paramzx) {
    this.g = paramzx;
    this.b = -1;
    int i = ((CharSequence)paramzx.b).length();
    if (i >= 0) {
      if (i >= 0)
        i = 0; 
      this.c = i;
      this.e = i;
      return;
    } 
    l0.l(x41.i(i, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    throw null;
  }
  
  public final void a() {
    zx zx1 = this.g;
    CharSequence charSequence = (CharSequence)zx1.b;
    int j = this.e;
    int i = 0;
    if (j < 0) {
      this.b = 0;
      this.f = null;
      return;
    } 
    if (j > charSequence.length()) {
      i = this.c;
      charSequence.getClass();
      this.f = (li0)new ji0(i, charSequence.length() - 1, 1);
      this.e = -1;
    } else {
      t51 t51 = (t51)((ei1)zx1.c).g(charSequence, Integer.valueOf(this.e));
      if (t51 == null) {
        i = this.c;
        charSequence.getClass();
        this.f = (li0)new ji0(i, charSequence.length() - 1, 1);
        this.e = -1;
      } else {
        ji0 ji0;
        int k = ((Number)t51.b).intValue();
        j = ((Number)t51.c).intValue();
        int m = this.c;
        if (k <= Integer.MIN_VALUE) {
          ji0 = li0.f;
        } else {
          ji0 = new ji0(m, k - 1, 1);
        } 
        this.f = (li0)ji0;
        k += j;
        this.c = k;
        if (j == 0)
          i = 1; 
        this.e = k + i;
      } 
    } 
    this.b = 1;
  }
  
  public final boolean hasNext() {
    if (this.b == -1)
      a(); 
    return (this.b == 1);
  }
  
  public final Object next() {
    if (this.b == -1)
      a(); 
    if (this.b != 0) {
      li0 li01 = this.f;
      li01.getClass();
      this.f = null;
      this.b = -1;
      return li01;
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException(xveccWbRzqx.uwtPXTk);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */