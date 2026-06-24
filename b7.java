import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

public final class b7 {
  public final TextView a;
  
  public final gh1 b;
  
  public b7(TextView paramTextView) {
    this.a = paramTextView;
    this.b = new gh1(paramTextView);
  }
  
  public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter) {
    return ((ws2)this.b.c).L(paramArrayOfInputFilter);
  }
  
  public final void b(AttributeSet paramAttributeSet, int paramInt) {
    boolean bool;
    TypedArray typedArray = this.a.getContext().obtainStyledAttributes(paramAttributeSet, nc1.i, paramInt, 0);
    try {
      boolean bool1 = typedArray.hasValue(14);
      bool = true;
      if (bool1)
        bool = typedArray.getBoolean(14, true); 
    } finally {
      Exception exception;
    } 
    typedArray.recycle();
    d(bool);
  }
  
  public final void c(boolean paramBoolean) {
    ((ws2)this.b.c).k0(paramBoolean);
  }
  
  public final void d(boolean paramBoolean) {
    ((ws2)this.b.c).l0(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */