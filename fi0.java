import android.graphics.Insets;

public final class fi0 {
  public static final fi0 e = new fi0(0, 0, 0, 0);
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public fi0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public static fi0 a(fi0 paramfi01, fi0 paramfi02) {
    return c(Math.max(paramfi01.a, paramfi02.a), Math.max(paramfi01.b, paramfi02.b), Math.max(paramfi01.c, paramfi02.c), Math.max(paramfi01.d, paramfi02.d));
  }
  
  public static fi0 b(fi0 paramfi01, fi0 paramfi02) {
    return c(Math.min(paramfi01.a, paramfi02.a), Math.min(paramfi01.b, paramfi02.b), Math.min(paramfi01.c, paramfi02.c), Math.min(paramfi01.d, paramfi02.d));
  }
  
  public static fi0 c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0) ? e : new fi0(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static fi0 d(Insets paramInsets) {
    return c(tp.a(paramInsets), tp.i(paramInsets), tp.l(paramInsets), tp.n(paramInsets));
  }
  
  public final Insets e() {
    int j = this.c;
    int i = this.d;
    return p8.d(this.a, this.b, j, i);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || fi0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (this.d != ((fi0)paramObject).d) ? false : ((this.a != ((fi0)paramObject).a) ? false : ((this.c != ((fi0)paramObject).c) ? false : (!(this.b != ((fi0)paramObject).b))));
  }
  
  public final int hashCode() {
    return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Insets{left=");
    stringBuilder.append(this.a);
    stringBuilder.append(", top=");
    stringBuilder.append(this.b);
    stringBuilder.append(", right=");
    stringBuilder.append(this.c);
    stringBuilder.append(", bottom=");
    stringBuilder.append(this.d);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fi0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */