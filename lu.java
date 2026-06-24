import java.util.Locale;

public final class lu implements ti0, ri0 {
  public final char b;
  
  public lu(char paramChar) {
    this.b = paramChar;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    if (paramInt >= paramCharSequence.length())
      return paramInt ^ 0xFFFFFFFF; 
    char c2 = paramCharSequence.charAt(paramInt);
    char c1 = this.b;
    if (c2 != c1) {
      c2 = Character.toUpperCase(c2);
      c1 = Character.toUpperCase(c1);
      if (c2 != c1 && Character.toLowerCase(c2) != Character.toLowerCase(c1))
        return paramInt ^ 0xFFFFFFFF; 
    } 
    return paramInt + 1;
  }
  
  public final int b() {
    return 1;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    paramStringBuilder.append(this.b);
  }
  
  public final int d() {
    return 1;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    paramStringBuilder.append(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */