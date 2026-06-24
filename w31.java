import java.util.LinkedHashSet;

public final class w31 {
  public final x31 a;
  
  public boolean b;
  
  public n2 c;
  
  public final l90 d;
  
  public boolean e;
  
  public w31(l90 paraml90, x31 paramx31) {
    this.a = paramx31;
    this.b = bool;
    this.d = paraml90;
    this.e = true;
  }
  
  public final void a() {
    n2 n21 = this.c;
    if (n21 != null && ((LinkedHashSet)n21.f).remove(this)) {
      e11 e11 = (e11)n21.e;
      e11.getClass();
      if (this == e11.f) {
        if (e11.g == -1)
          this.d.a(); 
        e11.f = null;
        e11.g = 0;
        e11.h = null;
      } 
      e11.d.remove(this);
      e11.e.remove(this);
      this.c = null;
      e11.b();
    } 
  }
  
  public final void b(boolean paramBoolean) {
    this.e = paramBoolean;
    if (paramBoolean && this.d.b) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      n2 n21 = this.c;
      if (n21 != null) {
        e11 e11 = (e11)n21.e;
        if (e11 != null)
          e11.b(); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */