import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public final class qi0 extends LinkMovementMethod {
  public static final m60 b = new m60(12);
  
  public final pi0 a;
  
  public qi0() {
    this(b);
  }
  
  public qi0(pi0 parampi0) {
    this.a = parampi0;
  }
  
  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 1) {
      int m = (int)paramMotionEvent.getX();
      int i = (int)paramMotionEvent.getY();
      int n = paramTextView.getTotalPaddingLeft();
      int j = paramTextView.getTotalPaddingTop();
      int i1 = paramTextView.getScrollX();
      int k = paramTextView.getScrollY();
      Layout layout = paramTextView.getLayout();
      i = layout.getOffsetForHorizontal(layout.getLineForVertical(k + i - j), (i1 + m - n));
      URLSpan[] arrayOfURLSpan = (URLSpan[])paramSpannable.getSpans(i, i, URLSpan.class);
      if (arrayOfURLSpan.length != 0) {
        String str = arrayOfURLSpan[0].getURL();
        return (this.a.e((View)paramTextView, str) || b.e((View)paramTextView, str)) ? true : super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
      } 
    } 
    return super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */