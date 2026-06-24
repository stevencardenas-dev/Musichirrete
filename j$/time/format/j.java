package j$.time.format;

import j$.time.temporal.q;

public class j implements g {
  public static final long[] f = new long[] { 
      0L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 
      10000000000L };
  
  public final q a;
  
  public final int b;
  
  public final int c;
  
  public final v d;
  
  public final int e;
  
  public j(q paramq, int paramInt1, int paramInt2, v paramv) {
    this.a = paramq;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramv;
    this.e = 0;
  }
  
  public j(q paramq, int paramInt1, int paramInt2, v paramv, int paramInt3) {
    this.a = paramq;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramv;
    this.e = paramInt3;
  }
  
  public j a() {
    if (this.e == -1)
      return this; 
    v v1 = this.d;
    return new j(this.a, this.b, this.c, v1, -1);
  }
  
  public j b(int paramInt) {
    int i = this.e;
    return new j(this.a, this.b, this.c, this.d, i + paramInt);
  }
  
  public boolean r(q paramq, StringBuilder paramStringBuilder) {
    String str;
    q q1 = this.a;
    Long long_ = paramq.a(q1);
    boolean bool = false;
    if (long_ == null)
      return false; 
    long l = long_.longValue();
    t t = paramq.b.c;
    if (l == Long.MIN_VALUE) {
      str = "9223372036854775808";
    } else {
      str = Long.toString(Math.abs(l));
    } 
    int k = str.length();
    int i = this.c;
    if (k <= i) {
      StringBuilder stringBuilder1;
      t.getClass();
      k = this.b;
      v v1 = this.d;
      if (l >= 0L) {
        i = d.a[v1.ordinal()];
        if (i != 1) {
          if (i != 2) {
            i = bool;
          } else {
            paramStringBuilder.append('+');
            i = bool;
          } 
        } else {
          i = bool;
          if (k < 19) {
            i = bool;
            if (l >= f[k]) {
              paramStringBuilder.append('+');
              i = bool;
            } 
          } 
        } 
      } else {
        i = d.a[v1.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
          if (i != 4) {
            i = bool;
          } else {
            stringBuilder1 = new StringBuilder("Field ");
            stringBuilder1.append(q1);
            stringBuilder1.append(" cannot be printed as the value ");
            stringBuilder1.append(l);
            stringBuilder1.append(" cannot be negative according to the SignStyle");
            throw new RuntimeException(stringBuilder1.toString());
          } 
        } else {
          paramStringBuilder.append('-');
          i = bool;
        } 
      } 
      while (i < k - stringBuilder1.length()) {
        paramStringBuilder.append('0');
        i++;
      } 
      paramStringBuilder.append((String)stringBuilder1);
      return true;
    } 
    StringBuilder stringBuilder = new StringBuilder("Field ");
    stringBuilder.append(q1);
    stringBuilder.append(" cannot be printed as the value ");
    stringBuilder.append(l);
    stringBuilder.append(" exceeds the maximum print width of ");
    stringBuilder.append(i);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder1;
    int k = this.c;
    q q1 = this.a;
    v v1 = this.d;
    int i = this.b;
    if (i == 1 && k == 19 && v1 == v.NORMAL) {
      stringBuilder1 = new StringBuilder("Value(");
      stringBuilder1.append(q1);
      stringBuilder1.append(")");
      return stringBuilder1.toString();
    } 
    if (i == k && stringBuilder1 == v.NOT_NEGATIVE) {
      stringBuilder1 = new StringBuilder("Value(");
      stringBuilder1.append(q1);
      stringBuilder1.append(",");
      stringBuilder1.append(i);
      stringBuilder1.append(")");
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder("Value(");
    stringBuilder2.append(q1);
    stringBuilder2.append(",");
    stringBuilder2.append(i);
    stringBuilder2.append(",");
    stringBuilder2.append(k);
    stringBuilder2.append(",");
    stringBuilder2.append(stringBuilder1);
    stringBuilder2.append(")");
    return stringBuilder2.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */