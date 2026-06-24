import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class w7 extends n21 {
  public final int k;
  
  public final int l;
  
  public final WeakReference m;
  
  public final b8 n;
  
  public w7(b8 paramb8, int paramInt1, int paramInt2, WeakReference paramWeakReference) {
    this.n = paramb8;
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = paramWeakReference;
  }
  
  public final void J(int paramInt) {}
  
  public final void K(Typeface paramTypeface) {
    Typeface typeface = paramTypeface;
    if (Build.VERSION.SDK_INT >= 28) {
      int i = this.k;
      typeface = paramTypeface;
      if (i != -1) {
        boolean bool;
        if ((this.l & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        typeface = a8.a(paramTypeface, i, bool);
      } 
    } 
    b8 b81 = this.n;
    if (b81.m) {
      b81.l = typeface;
      TextView textView = this.m.get();
      if (textView != null) {
        boolean bool = textView.isAttachedToWindow();
        int i = b81.j;
        if (bool) {
          textView.post(new x7(i, 0, textView, typeface));
          return;
        } 
        textView.setTypeface(typeface, i);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */