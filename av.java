import java.util.Locale;

public final class av implements Comparable {
  public hu b;
  
  public int c;
  
  public String e;
  
  public Locale f;
  
  public final int compareTo(Object paramObject) {
    paramObject = ((av)paramObject).b;
    int i = cv.a(this.b.p(), paramObject.p());
    return (i != 0) ? i : cv.a(this.b.i(), paramObject.i());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */