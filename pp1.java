import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

public final class pp1 {
  public CharSequence a;
  
  public final TextPaint b;
  
  public final int c;
  
  public int d;
  
  public Layout.Alignment e;
  
  public int f;
  
  public float g;
  
  public float h;
  
  public int i;
  
  public boolean j;
  
  public boolean k;
  
  public TextUtils.TruncateAt l;
  
  public qp1 m;
  
  public pp1(CharSequence paramCharSequence, TextPaint paramTextPaint, int paramInt) {
    this.a = paramCharSequence;
    this.b = paramTextPaint;
    this.c = paramInt;
    this.d = paramCharSequence.length();
    this.e = Layout.Alignment.ALIGN_NORMAL;
    this.f = Integer.MAX_VALUE;
    this.g = 0.0F;
    this.h = 1.0F;
    this.i = 1;
    this.j = true;
    this.l = null;
  }
  
  public final StaticLayout a() {
    TextDirectionHeuristic textDirectionHeuristic;
    if (this.a == null)
      this.a = ""; 
    int i = Math.max(0, this.c);
    CharSequence charSequence2 = this.a;
    int j = this.f;
    TextPaint textPaint = this.b;
    CharSequence charSequence1 = charSequence2;
    if (j == 1)
      charSequence1 = TextUtils.ellipsize(charSequence2, textPaint, i, this.l); 
    j = Math.min(charSequence1.length(), this.d);
    this.d = j;
    if (this.k && this.f == 1)
      this.e = Layout.Alignment.ALIGN_OPPOSITE; 
    StaticLayout.Builder builder = StaticLayout.Builder.obtain(charSequence1, 0, j, textPaint, i);
    builder.setAlignment(this.e);
    builder.setIncludePad(this.j);
    if (this.k) {
      textDirectionHeuristic = TextDirectionHeuristics.RTL;
    } else {
      textDirectionHeuristic = TextDirectionHeuristics.LTR;
    } 
    builder.setTextDirection(textDirectionHeuristic);
    TextUtils.TruncateAt truncateAt = this.l;
    if (truncateAt != null)
      builder.setEllipsize(truncateAt); 
    builder.setMaxLines(this.f);
    float f = this.g;
    if (f != 0.0F || this.h != 1.0F)
      builder.setLineSpacing(f, this.h); 
    if (this.f > 1)
      builder.setHyphenationFrequency(this.i); 
    qp1 qp11 = this.m;
    if (qp11 != null)
      builder.setBreakStrategy(((TextInputLayout)((ds1)qp11).c).w.getBreakStrategy()); 
    return builder.build();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */