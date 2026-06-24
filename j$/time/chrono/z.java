package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.f;
import j$.time.temporal.a;
import j$.time.temporal.q;
import j$.time.temporal.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class z implements n, Serializable {
  public static final z d;
  
  public static final z[] e;
  
  private static final long serialVersionUID = 1466499369062886794L;
  
  public final transient int a;
  
  public final transient LocalDate b;
  
  public final transient String c;
  
  static {
    z z2 = new z(-1, LocalDate.of(1868, 1, 1), "Meiji");
    d = z2;
    z z3 = new z(0, LocalDate.of(1912, 7, 30), "Taisho");
    z z4 = new z(1, LocalDate.of(1926, 12, 25), "Showa");
    z z1 = new z(2, LocalDate.of(1989, 1, 8), "Heisei");
    z z5 = new z(3, LocalDate.of(2019, 5, 1), "Reiwa");
    z[] arrayOfZ = new z[5];
    e = arrayOfZ;
    arrayOfZ[0] = z2;
    arrayOfZ[1] = z3;
    arrayOfZ[2] = z4;
    arrayOfZ[3] = z1;
    arrayOfZ[4] = z5;
  }
  
  public z(int paramInt, LocalDate paramLocalDate, String paramString) {
    this.a = paramInt;
    this.b = paramLocalDate;
    this.c = paramString;
  }
  
  public static z m(LocalDate paramLocalDate) {
    // Byte code:
    //   0: getstatic j$/time/chrono/y.d : Lj$/time/LocalDate;
    //   3: astore_2
    //   4: aload_2
    //   5: ifnull -> 24
    //   8: aload_0
    //   9: invokevirtual getClass : ()Ljava/lang/Class;
    //   12: pop
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual r : (Lj$/time/LocalDate;)I
    //   18: ifge -> 41
    //   21: goto -> 36
    //   24: aload_0
    //   25: invokevirtual A : ()J
    //   28: aload_2
    //   29: invokevirtual A : ()J
    //   32: lcmp
    //   33: ifge -> 41
    //   36: iconst_1
    //   37: istore_1
    //   38: goto -> 43
    //   41: iconst_0
    //   42: istore_1
    //   43: iload_1
    //   44: ifne -> 85
    //   47: getstatic j$/time/chrono/z.e : [Lj$/time/chrono/z;
    //   50: arraylength
    //   51: iconst_1
    //   52: isub
    //   53: istore_1
    //   54: iload_1
    //   55: iflt -> 83
    //   58: getstatic j$/time/chrono/z.e : [Lj$/time/chrono/z;
    //   61: iload_1
    //   62: aaload
    //   63: astore_2
    //   64: aload_0
    //   65: aload_2
    //   66: getfield b : Lj$/time/LocalDate;
    //   69: invokevirtual F : (Lj$/time/chrono/b;)I
    //   72: iflt -> 77
    //   75: aload_2
    //   76: areturn
    //   77: iinc #1, -1
    //   80: goto -> 54
    //   83: aconst_null
    //   84: areturn
    //   85: new java/lang/RuntimeException
    //   88: dup
    //   89: ldc 'JapaneseDate before Meiji 6 are not supported'
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: athrow
  }
  
  public static z r(int paramInt) {
    int i = paramInt + 1;
    if (i >= 0) {
      z[] arrayOfZ = e;
      if (i < arrayOfZ.length)
        return arrayOfZ[i]; 
    } 
    f.a("Invalid era: ", paramInt);
    return null;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new f0((byte)5, this);
  }
  
  public final int getValue() {
    return this.a;
  }
  
  public final u j(q paramq) {
    a a = a.ERA;
    return (paramq == a) ? w.c.t(a) : super.j(paramq);
  }
  
  public final z p() {
    z[] arrayOfZ = e;
    return (this == arrayOfZ[arrayOfZ.length - 1]) ? null : r(this.a + 1);
  }
  
  public final String toString() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */