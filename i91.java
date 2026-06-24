import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

public final class i91 {
  public final TextPaint a;
  
  public final TextDirectionHeuristic b;
  
  public final int c;
  
  public final int d;
  
  public i91(PrecomputedText.Params paramParams) {
    this.a = paramParams.getTextPaint();
    this.b = paramParams.getTextDirection();
    this.c = paramParams.getBreakStrategy();
    this.d = paramParams.getHyphenationFrequency();
  }
  
  public i91(TextPaint paramTextPaint, TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 29)
      (new PrecomputedText.Params.Builder(paramTextPaint)).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build(); 
    this.a = paramTextPaint;
    this.b = paramTextDirectionHeuristic;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof i91) {
      paramObject = paramObject;
      int i = ((i91)paramObject).c;
      TextPaint textPaint = ((i91)paramObject).a;
      if (this.c == i && this.d == ((i91)paramObject).d) {
        TextPaint textPaint1 = this.a;
        if (textPaint1.getTextSize() == textPaint.getTextSize() && textPaint1.getTextScaleX() == textPaint.getTextScaleX() && textPaint1.getTextSkewX() == textPaint.getTextSkewX() && textPaint1.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint1.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint1.getFlags() == textPaint.getFlags() && textPaint1.getTextLocales().equals(textPaint.getTextLocales()) && ((textPaint1.getTypeface() == null) ? (textPaint.getTypeface() != null) : !textPaint1.getTypeface().equals(textPaint.getTypeface())) && this.b == ((i91)paramObject).b)
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    TextPaint textPaint = this.a;
    float f1 = textPaint.getTextSize();
    float f4 = textPaint.getTextScaleX();
    float f2 = textPaint.getTextSkewX();
    float f3 = textPaint.getLetterSpacing();
    int i = textPaint.getFlags();
    LocaleList localeList = textPaint.getTextLocales();
    Typeface typeface = textPaint.getTypeface();
    boolean bool = textPaint.isElegantTextHeight();
    int j = this.c;
    int k = this.d;
    return Objects.hash(new Object[] { 
          Float.valueOf(f1), Float.valueOf(f4), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), localeList, typeface, Boolean.valueOf(bool), this.b, Integer.valueOf(j), 
          Integer.valueOf(k) });
  }
  
  public final String toString() {
    StringBuilder stringBuilder1 = new StringBuilder("{");
    StringBuilder stringBuilder3 = new StringBuilder("textSize=");
    TextPaint textPaint = this.a;
    stringBuilder3.append(textPaint.getTextSize());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", textScaleX=");
    stringBuilder3.append(textPaint.getTextScaleX());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", textSkewX=");
    stringBuilder3.append(textPaint.getTextSkewX());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", letterSpacing=");
    stringBuilder3.append(textPaint.getLetterSpacing());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", elegantTextHeight=");
    stringBuilder3.append(textPaint.isElegantTextHeight());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", textLocale=");
    stringBuilder3.append(textPaint.getTextLocales());
    stringBuilder1.append(stringBuilder3.toString());
    stringBuilder3 = new StringBuilder(", typeface=");
    stringBuilder3.append(textPaint.getTypeface());
    stringBuilder1.append(stringBuilder3.toString());
    if (Build.VERSION.SDK_INT >= 26) {
      stringBuilder3 = new StringBuilder(", variationSettings=");
      stringBuilder3.append(textPaint.getFontVariationSettings());
      stringBuilder1.append(stringBuilder3.toString());
    } 
    StringBuilder stringBuilder2 = new StringBuilder(", textDir=");
    stringBuilder2.append(this.b);
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder2 = new StringBuilder(", breakStrategy=");
    stringBuilder2.append(this.c);
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder2 = new StringBuilder(", hyphenationFrequency=");
    stringBuilder2.append(this.d);
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder1.append("}");
    return stringBuilder1.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */