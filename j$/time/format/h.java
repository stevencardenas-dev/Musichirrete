package j$.time.format;

import j$.time.temporal.q;
import j$.time.temporal.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public final class h extends j {
  public final boolean g;
  
  public h(q paramq, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    super(paramq, paramInt1, paramInt2, v.NOT_NEGATIVE, paramInt3);
    this.g = paramBoolean;
  }
  
  public final j a() {
    if (this.e == -1)
      return this; 
    boolean bool = this.g;
    return new h(this.a, this.b, this.c, bool, -1);
  }
  
  public final j b(int paramInt) {
    int i = this.e;
    return new h(this.a, this.b, this.c, this.g, i + paramInt);
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    q q1 = this.a;
    Long long_ = paramq.a(q1);
    boolean bool = false;
    if (long_ == null)
      return false; 
    t t = paramq.b.c;
    long l = long_.longValue();
    u u = q1.z();
    u.b(l, q1);
    BigDecimal bigDecimal2 = BigDecimal.valueOf(u.a);
    BigDecimal bigDecimal1 = BigDecimal.valueOf(u.d).subtract(bigDecimal2).add(BigDecimal.ONE);
    BigDecimal bigDecimal3 = BigDecimal.valueOf(l).subtract(bigDecimal2);
    RoundingMode roundingMode = RoundingMode.FLOOR;
    bigDecimal3 = bigDecimal3.divide(bigDecimal1, 9, roundingMode);
    bigDecimal1 = BigDecimal.ZERO;
    if (bigDecimal3.compareTo(bigDecimal1) != 0)
      if (bigDecimal3.signum() == 0) {
        bigDecimal1 = new BigDecimal(BigInteger.ZERO, 0);
      } else {
        bigDecimal1 = bigDecimal3.stripTrailingZeros();
      }  
    int i = bigDecimal1.scale();
    boolean bool1 = this.g;
    int k = this.b;
    if (i == 0) {
      if (k > 0) {
        i = bool;
        if (bool1) {
          t.getClass();
          paramStringBuilder.append('.');
          i = bool;
        } 
        while (i < k) {
          t.getClass();
          paramStringBuilder.append('0');
          i++;
        } 
      } 
      return true;
    } 
    String str = bigDecimal1.setScale(Math.min(Math.max(bigDecimal1.scale(), k), this.c), roundingMode).toPlainString().substring(2);
    t.getClass();
    if (bool1)
      paramStringBuilder.append('.'); 
    paramStringBuilder.append(str);
    return true;
  }
  
  public final String toString() {
    String str;
    if (this.g) {
      str = ",DecimalPoint";
    } else {
      str = "";
    } 
    StringBuilder stringBuilder = new StringBuilder("Fraction(");
    stringBuilder.append(this.a);
    stringBuilder.append(",");
    stringBuilder.append(this.b);
    stringBuilder.append(",");
    stringBuilder.append(this.c);
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */