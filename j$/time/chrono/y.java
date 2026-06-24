package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.b;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class y extends d {
  public static final LocalDate d = LocalDate.of(1873, 1, 1);
  
  private static final long serialVersionUID = -305327627230580483L;
  
  public final transient LocalDate a;
  
  public final transient z b;
  
  public final transient int c;
  
  public y(LocalDate paramLocalDate) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: getstatic j$/time/chrono/y.d : Lj$/time/LocalDate;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull -> 28
    //   12: aload_1
    //   13: invokevirtual getClass : ()Ljava/lang/Class;
    //   16: pop
    //   17: aload_1
    //   18: aload_3
    //   19: invokevirtual r : (Lj$/time/LocalDate;)I
    //   22: ifge -> 45
    //   25: goto -> 40
    //   28: aload_1
    //   29: invokevirtual A : ()J
    //   32: aload_3
    //   33: invokevirtual A : ()J
    //   36: lcmp
    //   37: ifge -> 45
    //   40: iconst_1
    //   41: istore_2
    //   42: goto -> 47
    //   45: iconst_0
    //   46: istore_2
    //   47: iload_2
    //   48: ifne -> 85
    //   51: aload_1
    //   52: invokestatic m : (Lj$/time/LocalDate;)Lj$/time/chrono/z;
    //   55: astore_3
    //   56: aload_0
    //   57: aload_3
    //   58: putfield b : Lj$/time/chrono/z;
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual getYear : ()I
    //   66: aload_3
    //   67: getfield b : Lj$/time/LocalDate;
    //   70: invokevirtual getYear : ()I
    //   73: isub
    //   74: iconst_1
    //   75: iadd
    //   76: putfield c : I
    //   79: aload_0
    //   80: aload_1
    //   81: putfield a : Lj$/time/LocalDate;
    //   84: return
    //   85: new java/lang/RuntimeException
    //   88: dup
    //   89: ldc 'JapaneseDate before Meiji 6 is not supported'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new f0((byte)4, this);
  }
  
  public final long A() {
    return this.a.A();
  }
  
  public final e B(LocalTime paramLocalTime) {
    return new g(this, paramLocalTime);
  }
  
  public final n C() {
    return this.b;
  }
  
  public final b E(long paramLong) {
    return J(this.a.P(paramLong));
  }
  
  public final b G(o paramo) {
    return super.G(paramo);
  }
  
  public final y I(long paramLong, q paramq) {
    if (paramq instanceof a) {
      a a = (a)paramq;
      if (g((q)a) == paramLong)
        return this; 
      int[] arrayOfInt = x.a;
      int i = arrayOfInt[a.ordinal()];
      if (i == 3 || i == 8 || i == 9) {
        i = w.c.t(a).a(paramLong, (q)a);
        int j = arrayOfInt[a.ordinal()];
        return (j != 3) ? ((j != 8) ? ((j == 9) ? J(this.a.U(i)) : J(this.a.R(paramLong, paramq))) : K(z.r(i), this.c)) : K(this.b, i);
      } 
      return J(this.a.R(paramLong, paramq));
    } 
    return (y)super.h(paramLong, paramq);
  }
  
  public final y J(LocalDate paramLocalDate) {
    return paramLocalDate.equals(this.a) ? this : new y(paramLocalDate);
  }
  
  public final y K(z paramz, int paramInt) {
    w.c.getClass();
    if (paramz != null) {
      int i = paramz.b.getYear() + paramInt - 1;
      if (paramInt == 1 || (i >= -999999999 && i <= 999999999 && i >= paramz.b.getYear() && paramz == z.m(LocalDate.of(i, 1, 1))))
        return J(this.a.U(i)); 
      throw new RuntimeException("Invalid yearOfEra value");
    } 
    throw new ClassCastException("Era must be JapaneseEra");
  }
  
  public final b a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m a(long paramLong, s params) {
    return super.a(paramLong, params);
  }
  
  public final m d() {
    return w.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof y) {
      paramObject = paramObject;
      return this.a.equals(((y)paramObject).a);
    } 
    return false;
  }
  
  public final boolean f(q paramq) {
    if (paramq != a.ALIGNED_DAY_OF_WEEK_IN_MONTH && paramq != a.ALIGNED_DAY_OF_WEEK_IN_YEAR && paramq != a.ALIGNED_WEEK_OF_MONTH && paramq != a.ALIGNED_WEEK_OF_YEAR) {
      if (paramq instanceof a)
        return ((a)paramq).isDateBased(); 
      if (paramq != null && paramq.r((n)this))
        return true; 
    } 
    return false;
  }
  
  public final long g(q paramq) {
    LocalDate localDate;
    if (paramq instanceof a) {
      switch (x.a[((a)paramq).ordinal()]) {
        default:
          return this.a.g(paramq);
        case 8:
          return this.b.a;
        case 4:
        case 5:
        case 6:
        case 7:
          throw new RuntimeException(b.a("Unsupported field: ", paramq));
        case 3:
          return this.c;
        case 2:
          break;
      } 
      int i = this.c;
      localDate = this.a;
      return (i == 1) ? (localDate.I() - this.b.b.I() + 1) : localDate.I();
    } 
    return localDate.E((n)this);
  }
  
  public final int hashCode() {
    w.c.getClass();
    return this.a.hashCode() ^ 0xD6FCA3D1;
  }
  
  public final m i(LocalDate paramLocalDate) {
    return super.G((o)paramLocalDate);
  }
  
  public final u j(q paramq) {
    z z1;
    if (paramq instanceof a) {
      if (f(paramq)) {
        a a = (a)paramq;
        int i = x.a[a.ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i != 3)
              return w.c.t(a); 
            i = this.b.b.getYear();
            z z2 = this.b.p();
            return (z2 != null) ? u.e(1L, (z2.b.getYear() - i + 1)) : u.e(1L, (999999999 - i));
          } 
          z1 = this.b.p();
          if (z1 != null && z1.b.getYear() == this.a.getYear()) {
            i = z1.b.I() - 1;
          } else if (this.a.J()) {
            i = 366;
          } else {
            i = 365;
          } 
          int j = i;
          if (this.c == 1)
            j = i - this.b.b.I() - 1; 
          return u.e(1L, j);
        } 
        return u.e(1L, this.a.K());
      } 
      throw new RuntimeException(b.a("Unsupported field: ", z1));
    } 
    return z1.t((n)this);
  }
  
  public final b k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
  
  public final m k(long paramLong, s params) {
    return super.k(paramLong, params);
  }
  
  public final b t(long paramLong) {
    return J(this.a.N(paramLong));
  }
  
  public final b z(long paramLong) {
    return J(this.a.O(paramLong));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */