import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

public final class ut1 extends m92 {
  public final Context p;
  
  public final TextPaint q;
  
  public final m92 r;
  
  public final vt1 s;
  
  public ut1(vt1 paramvt1, Context paramContext, TextPaint paramTextPaint, m92 paramm92) {
    this.s = paramvt1;
    this.p = paramContext;
    this.q = paramTextPaint;
    this.r = paramm92;
  }
  
  public final void P(int paramInt) {
    this.r.P(paramInt);
  }
  
  public final void Q(Typeface paramTypeface, boolean paramBoolean) {
    Context context = this.p;
    TextPaint textPaint = this.q;
    this.s.f(context, textPaint, paramTypeface);
    this.r.Q(paramTypeface, paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ut1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */