import android.graphics.Point;

public final class kh1 {
  public final int a;
  
  public final int b;
  
  public final Point c;
  
  public kh1(int paramInt1, int paramInt2, Point paramPoint) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = new Point(j, i);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof kh1) {
      paramObject = paramObject;
      if (this.a == ((kh1)paramObject).a && this.b == ((kh1)paramObject).b && this.c.equals(((kh1)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.a;
    int i = this.b;
    return this.c.hashCode() + (j * 31 + i) * 31;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("RoundedCornerCompat{position=");
    int i = this.a;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            str = "Invalid";
          } else {
            str = "BottomLeft";
          } 
        } else {
          str = "BottomRight";
        } 
      } else {
        str = "TopRight";
      } 
    } else {
      str = "TopLeft";
    } 
    stringBuilder.append(str);
    stringBuilder.append(", radius=");
    stringBuilder.append(this.b);
    stringBuilder.append(", center=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */