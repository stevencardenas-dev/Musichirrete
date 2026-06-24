import java.util.Locale;

public final class yu extends qu {
  public final int b() {
    return this.c;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    boolean bool;
    iu iu = this.b;
    if (iu == null) {
      bool = false;
    } else {
      bool = iu.a(paramuo0.c).t();
    } 
    if (bool)
      try {
        ma0.b(paramuo0.c(iu), paramStringBuilder);
        return;
      } catch (RuntimeException runtimeException) {
        paramStringBuilder.append('�');
        return;
      }  
    paramStringBuilder.append('�');
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    try {
      ma0.b(this.b.a(paramdd1).b(paramLong), paramStringBuilder);
      return;
    } catch (RuntimeException runtimeException) {
      paramStringBuilder.append('�');
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */