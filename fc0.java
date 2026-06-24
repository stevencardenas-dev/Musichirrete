import android.content.Context;

public final class fc0 implements ir1 {
  public final Context b;
  
  public final String c;
  
  public final mi2 e;
  
  public final boolean f;
  
  public final boolean g;
  
  public final cs1 h;
  
  public boolean i;
  
  public fc0(Context paramContext, String paramString, mi2 parammi2, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramContext;
    this.c = paramString;
    this.e = parammi2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.h = new cs1(new pp(1, this));
  }
  
  public final ac0 M() {
    return ((ec0)this.h.getValue()).a(true);
  }
  
  public final void close() {
    if (this.h.c != j30.g)
      ((ec0)this.h.getValue()).close(); 
  }
  
  public final String getDatabaseName() {
    return this.c;
  }
  
  public final void setWriteAheadLoggingEnabled(boolean paramBoolean) {
    if (this.h.c != j30.g)
      ((ec0)this.h.getValue()).setWriteAheadLoggingEnabled(paramBoolean); 
    this.i = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */