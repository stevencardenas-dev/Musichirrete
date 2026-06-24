package j$.time;

import j$.time.chrono.m;
import j$.time.chrono.t;
import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;

public enum j implements n, o {
  APRIL, AUGUST, DECEMBER, FEBRUARY, JANUARY, JULY, JUNE, MARCH, MAY, NOVEMBER, OCTOBER, SEPTEMBER;
  
  public static final j[] a;
  
  public static final j[] b;
  
  static {
    Enum<Enum> enum_11 = new Enum<Enum>("JANUARY", 0);
    JANUARY = (j)enum_11;
    Enum<Enum> enum_3 = new Enum<Enum>("FEBRUARY", 1);
    FEBRUARY = (j)enum_3;
    Enum<Enum> enum_6 = new Enum<Enum>("MARCH", 2);
    MARCH = (j)enum_6;
    Enum<Enum> enum_4 = new Enum<Enum>("APRIL", 3);
    APRIL = (j)enum_4;
    Enum<Enum> enum_8 = new Enum<Enum>("MAY", 4);
    MAY = (j)enum_8;
    Enum<Enum> enum_2 = new Enum<Enum>("JUNE", 5);
    JUNE = (j)enum_2;
    Enum<Enum> enum_7 = new Enum<Enum>("JULY", 6);
    JULY = (j)enum_7;
    Enum<Enum> enum_5 = new Enum<Enum>("AUGUST", 7);
    AUGUST = (j)enum_5;
    Enum<Enum> enum_1 = new Enum<Enum>("SEPTEMBER", 8);
    SEPTEMBER = (j)enum_1;
    Enum<Enum> enum_12 = new Enum<Enum>("OCTOBER", 9);
    OCTOBER = (j)enum_12;
    Enum<Enum> enum_9 = new Enum<Enum>("NOVEMBER", 10);
    NOVEMBER = (j)enum_9;
    Enum<Enum> enum_10 = new Enum<Enum>("DECEMBER", 11);
    DECEMBER = (j)enum_10;
    b = new j[] { 
        (j)enum_11, (j)enum_3, (j)enum_6, (j)enum_4, (j)enum_8, (j)enum_2, (j)enum_7, (j)enum_5, (j)enum_1, (j)enum_12, 
        (j)enum_9, (j)enum_10 };
    a = values();
  }
  
  public static j E(int paramInt) {
    if (paramInt >= 1 && paramInt <= 12)
      return a[paramInt - 1]; 
    f.a("Invalid value for MonthOfYear: ", paramInt);
    return null;
  }
  
  public final Object b(b paramb) {
    return (paramb == r.b) ? t.c : ((paramb == r.c) ? b.MONTHS : super.b(paramb));
  }
  
  public final m c(m paramm) {
    if (m.m((n)paramm).equals(t.c)) {
      a a = a.MONTH_OF_YEAR;
      return paramm.h(getValue(), (q)a);
    } 
    throw new RuntimeException("Adjustment only supported on ISO date-time");
  }
  
  public final int e(q paramq) {
    return (paramq == a.MONTH_OF_YEAR) ? getValue() : super.e(paramq);
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.MONTH_OF_YEAR) : (paramq != null && paramq.r(this)));
  }
  
  public final long g(q paramq) {
    if (paramq == a.MONTH_OF_YEAR)
      return getValue(); 
    if (!(paramq instanceof a))
      return paramq.E(this); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  public final int getValue() {
    return ordinal() + 1;
  }
  
  public final u j(q paramq) {
    return (paramq == a.MONTH_OF_YEAR) ? paramq.z() : super.j(paramq);
  }
  
  public final int r(boolean paramBoolean) {
    switch (i.a[ordinal()]) {
      default:
        return paramBoolean + 335;
      case 11:
        return paramBoolean + 274;
      case 10:
        return paramBoolean + 213;
      case 9:
        return paramBoolean + 182;
      case 8:
        return paramBoolean + 121;
      case 7:
        return paramBoolean + 60;
      case 6:
        return 1;
      case 5:
        return paramBoolean + 305;
      case 4:
        return paramBoolean + 244;
      case 3:
        return paramBoolean + 152;
      case 2:
        return paramBoolean + 91;
      case 1:
        break;
    } 
    return 32;
  }
  
  public final int t(boolean paramBoolean) {
    int i = i.a[ordinal()];
    return (i != 1) ? ((i != 2 && i != 3 && i != 4 && i != 5) ? 31 : 30) : (paramBoolean ? 29 : 28);
  }
  
  public final int z() {
    int i = i.a[ordinal()];
    return (i != 1) ? ((i != 2 && i != 3 && i != 4 && i != 5) ? 31 : 30) : 29;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */