import java.io.InputStream;

public final class b10 {
  public final InputStream a;
  
  public final boolean b;
  
  public final long c;
  
  public b10(InputStream paramInputStream, boolean paramBoolean, long paramLong) {
    if (paramInputStream != null) {
      this.a = paramInputStream;
      this.b = paramBoolean;
      this.c = paramLong;
      return;
    } 
    l0.l("Stream may not be null.");
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */