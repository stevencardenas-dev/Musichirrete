import java.io.Serializable;
import java.util.RandomAccess;

public final class r40 extends t implements q40, RandomAccess, Serializable {
  public final Enum[] b;
  
  public r40(Enum[] paramArrayOfEnum) {
    this.b = paramArrayOfEnum;
  }
  
  public final int c() {
    return this.b.length;
  }
  
  public final boolean contains(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Enum
    //   4: ifne -> 10
    //   7: goto -> 51
    //   10: aload_1
    //   11: checkcast java/lang/Enum
    //   14: astore_3
    //   15: aload_3
    //   16: invokevirtual ordinal : ()I
    //   19: istore_2
    //   20: iload_2
    //   21: iflt -> 42
    //   24: aload_0
    //   25: getfield b : [Ljava/lang/Enum;
    //   28: astore_1
    //   29: iload_2
    //   30: aload_1
    //   31: arraylength
    //   32: if_icmpge -> 42
    //   35: aload_1
    //   36: iload_2
    //   37: aaload
    //   38: astore_1
    //   39: goto -> 44
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_1
    //   45: aload_3
    //   46: if_acmpne -> 51
    //   49: iconst_1
    //   50: ireturn
    //   51: iconst_0
    //   52: ireturn
  }
  
  public final Object get(int paramInt) {
    Enum[] arrayOfEnum = this.b;
    int i = arrayOfEnum.length;
    if (paramInt >= 0 && paramInt < i)
      return arrayOfEnum[paramInt]; 
    m60.m(ga1.j("index: ", paramInt, i, ", size: "));
    return null;
  }
  
  public final int indexOf(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Enum
    //   4: ifne -> 9
    //   7: iconst_m1
    //   8: ireturn
    //   9: aload_1
    //   10: checkcast java/lang/Enum
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual ordinal : ()I
    //   18: istore_2
    //   19: iload_2
    //   20: iflt -> 41
    //   23: aload_0
    //   24: getfield b : [Ljava/lang/Enum;
    //   27: astore_1
    //   28: iload_2
    //   29: aload_1
    //   30: arraylength
    //   31: if_icmpge -> 41
    //   34: aload_1
    //   35: iload_2
    //   36: aaload
    //   37: astore_1
    //   38: goto -> 43
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_1
    //   44: aload_3
    //   45: if_acmpne -> 50
    //   48: iload_2
    //   49: ireturn
    //   50: iconst_m1
    //   51: ireturn
  }
  
  public final int lastIndexOf(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof java/lang/Enum
    //   4: ifne -> 9
    //   7: iconst_m1
    //   8: ireturn
    //   9: aload_1
    //   10: checkcast java/lang/Enum
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual ordinal : ()I
    //   18: istore_2
    //   19: iload_2
    //   20: iflt -> 41
    //   23: aload_0
    //   24: getfield b : [Ljava/lang/Enum;
    //   27: astore_1
    //   28: iload_2
    //   29: aload_1
    //   30: arraylength
    //   31: if_icmpge -> 41
    //   34: aload_1
    //   35: iload_2
    //   36: aaload
    //   37: astore_1
    //   38: goto -> 43
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_1
    //   44: aload_3
    //   45: if_acmpne -> 50
    //   48: iload_2
    //   49: ireturn
    //   50: iconst_m1
    //   51: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */