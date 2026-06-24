package j$.time;

import j$.time.format.b;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;

public enum c implements n, o {
  FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY;
  
  public static final c[] a;
  
  public static final c[] b;
  
  static {
    Enum<Enum> enum_4 = new Enum<Enum>("MONDAY", 0);
    MONDAY = (c)enum_4;
    Enum<Enum> enum_1 = new Enum<Enum>("TUESDAY", 1);
    TUESDAY = (c)enum_1;
    Enum<Enum> enum_5 = new Enum<Enum>("WEDNESDAY", 2);
    WEDNESDAY = (c)enum_5;
    Enum<Enum> enum_2 = new Enum<Enum>("THURSDAY", 3);
    THURSDAY = (c)enum_2;
    Enum<Enum> enum_3 = new Enum<Enum>("FRIDAY", 4);
    FRIDAY = (c)enum_3;
    Enum<Enum> enum_7 = new Enum<Enum>("SATURDAY", 5);
    SATURDAY = (c)enum_7;
    Enum<Enum> enum_6 = new Enum<Enum>("SUNDAY", 6);
    SUNDAY = (c)enum_6;
    b = new c[] { (c)enum_4, (c)enum_1, (c)enum_5, (c)enum_2, (c)enum_3, (c)enum_7, (c)enum_6 };
    a = values();
  }
  
  public static c r(int paramInt) {
    if (paramInt >= 1 && paramInt <= 7)
      return a[paramInt - 1]; 
    f.a("Invalid value for DayOfWeek: ", paramInt);
    return null;
  }
  
  public final Object b(b paramb) {
    return (paramb == r.c) ? b.DAYS : super.b(paramb);
  }
  
  public final m c(m paramm) {
    a a = a.DAY_OF_WEEK;
    return paramm.h(getValue(), (q)a);
  }
  
  public final int e(q paramq) {
    return (paramq == a.DAY_OF_WEEK) ? getValue() : super.e(paramq);
  }
  
  public final boolean f(q paramq) {
    return ((paramq instanceof a) ? (paramq == a.DAY_OF_WEEK) : (paramq != null && paramq.r(this)));
  }
  
  public final long g(q paramq) {
    if (paramq == a.DAY_OF_WEEK)
      return getValue(); 
    if (!(paramq instanceof a))
      return paramq.E(this); 
    throw new RuntimeException(b.a("Unsupported field: ", paramq));
  }
  
  public final int getValue() {
    return ordinal() + 1;
  }
  
  public final u j(q paramq) {
    return (paramq == a.DAY_OF_WEEK) ? paramq.z() : super.j(paramq);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */