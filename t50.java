import android.content.Context;

public final class t50 implements j70 {
  public final int b;
  
  public final fb1 c;
  
  public final Object get() {
    Context context;
    int i = this.b;
    fb1 fb11 = this.c;
    switch (i) {
      default:
        context = (Context)fb11.get();
        return new fj1(Integer.valueOf(fj1.f).intValue(), context, "com.google.android.datatransport.events");
      case 0:
        break;
    } 
    String str = ((Context)context.get()).getPackageName();
    if (str == null) {
      k91.h("Cannot return null from a non-@Nullable @Provides method");
      str = null;
    } 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */