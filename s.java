import java.util.List;
import java.util.RandomAccess;

public final class s extends t implements RandomAccess {
  public final t b;
  
  public final int c;
  
  public final int e;
  
  public s(t paramt, int paramInt1, int paramInt2) {
    this.b = paramt;
    this.c = paramInt1;
    wf2.j(paramInt1, paramInt2, paramt.c());
    this.e = paramInt2 - paramInt1;
  }
  
  public final int c() {
    return this.e;
  }
  
  public final Object get(int paramInt) {
    int i = this.e;
    if (paramInt >= 0 && paramInt < i) {
      i = this.c;
      return this.b.get(i + paramInt);
    } 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final List subList(int paramInt1, int paramInt2) {
    wf2.j(paramInt1, paramInt2, this.e);
    int i = this.c;
    return new s(this.b, paramInt1 + i, i + paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */