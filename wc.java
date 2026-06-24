import java.io.Serializable;

public abstract class wc extends g20 implements Serializable {
  public final h20 b;
  
  public wc(h20 paramh20) {
    if (paramh20 != null) {
      this.b = paramh20;
      return;
    } 
    l0.l("The type must not be null");
    throw null;
  }
  
  public final h20 c() {
    return this.b;
  }
  
  public final int compareTo(Object paramObject) {
    long l = ((g20)paramObject).d();
    int i = d() cmp l;
    return (i == 0) ? 0 : ((i < 0) ? -1 : 1);
  }
  
  public final boolean f() {
    return true;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DurationField[");
    stringBuilder.append(this.b.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */