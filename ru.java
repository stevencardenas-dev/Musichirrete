import java.util.Locale;

public class ru extends qu {
  public final int f;
  
  public ru(iu paramiu, int paramInt1, boolean paramBoolean, int paramInt2) {
    super(paramiu, paramInt1, paramBoolean);
    this.f = paramInt2;
  }
  
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
    int i = this.f;
    if (bool)
      try {
        ma0.a(paramStringBuilder, paramuo0.c(iu), i);
        return;
      } catch (RuntimeException runtimeException) {
        zu.n(i, paramStringBuilder);
        return;
      }  
    zu.n(i, paramStringBuilder);
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    paramInt = this.f;
    try {
      ma0.a(paramStringBuilder, this.b.a(paramdd1).b(paramLong), paramInt);
      return;
    } catch (RuntimeException runtimeException) {
      zu.n(paramInt, paramStringBuilder);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */