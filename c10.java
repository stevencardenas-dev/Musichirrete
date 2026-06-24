import java.io.IOException;

public final class c10 extends IOException {
  public final boolean b;
  
  public final int c;
  
  public c10(String paramString, int paramInt1, int paramInt2) {
    super(paramString);
    boolean bool;
    if ((paramInt1 & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
    this.c = paramInt2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */