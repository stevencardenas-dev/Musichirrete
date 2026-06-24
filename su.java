import java.util.Locale;

public final class su implements ti0, ri0 {
  public final String b;
  
  public su(String paramString) {
    this.b = paramString;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    String str = this.b;
    return zu.p(str, paramCharSequence, paramInt) ? (str.length() + paramInt) : (paramInt ^ 0xFFFFFFFF);
  }
  
  public final int b() {
    return this.b.length();
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    paramStringBuilder.append(this.b);
  }
  
  public final int d() {
    return this.b.length();
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    paramStringBuilder.append(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */