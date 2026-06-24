import java.io.DataInput;

public final class lv {
  public final jv a;
  
  public final String b;
  
  public final int c;
  
  public lv(jv paramjv, String paramString, int paramInt) {
    this.a = paramjv;
    this.b = paramString;
    this.c = paramInt;
  }
  
  public static lv c(DataInput paramDataInput) {
    return new lv(new jv((char)paramDataInput.readUnsignedByte(), paramDataInput.readUnsignedByte(), paramDataInput.readByte(), paramDataInput.readUnsignedByte(), paramDataInput.readBoolean(), (int)qv.U(paramDataInput)), paramDataInput.readUTF(), (int)qv.U(paramDataInput));
  }
  
  public final long a(long paramLong, int paramInt1, int paramInt2) {
    jv jv1 = this.a;
    int i = jv1.b;
    char c = jv1.a;
    if (c == 'w') {
      paramInt1 += paramInt2;
    } else if (c != 's') {
      paramInt1 = 0;
    } 
    long l2 = paramInt1;
    long l3 = paramLong + l2;
    xg0 xg0 = xg0.b0;
    paramLong = xg0.U.w(i, l3);
    paramLong = xg0.E.w(0, paramLong);
    long l1 = jv1.b(xg0, xg0.E.a(jv1.f, paramLong));
    if (jv1.d == 0) {
      paramLong = l1;
      if (l1 <= l3)
        paramLong = jv1.b(xg0, xg0.V.a(1, l1)); 
    } else {
      l1 = jv1.d(xg0, l1);
      paramLong = l1;
      if (l1 <= l3) {
        paramLong = xg0.V.a(1, l1);
        paramLong = jv1.d(xg0, jv1.b(xg0, xg0.U.w(i, paramLong)));
      } 
    } 
    return paramLong - l2;
  }
  
  public final long b(long paramLong, int paramInt1, int paramInt2) {
    jv jv1 = this.a;
    int i = jv1.b;
    char c = jv1.a;
    if (c == 'w') {
      paramInt1 += paramInt2;
    } else if (c != 's') {
      paramInt1 = 0;
    } 
    long l2 = paramInt1;
    long l3 = paramLong + l2;
    xg0 xg0 = xg0.b0;
    paramLong = xg0.U.w(i, l3);
    paramLong = xg0.E.w(0, paramLong);
    long l1 = jv1.c(xg0, xg0.E.a(jv1.f, paramLong));
    if (jv1.d == 0) {
      paramLong = l1;
      if (l1 >= l3)
        paramLong = jv1.c(xg0, xg0.V.a(-1, l1)); 
    } else {
      l1 = jv1.d(xg0, l1);
      paramLong = l1;
      if (l1 >= l3) {
        paramLong = xg0.V.a(-1, l1);
        paramLong = jv1.d(xg0, jv1.c(xg0, xg0.U.w(i, paramLong)));
      } 
    } 
    return paramLong - l2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof lv) {
      paramObject = paramObject;
      if (this.c == ((lv)paramObject).c && this.b.equals(((lv)paramObject).b) && this.a.equals(((lv)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append(" named ");
    stringBuilder.append(this.b);
    stringBuilder.append(" at ");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */