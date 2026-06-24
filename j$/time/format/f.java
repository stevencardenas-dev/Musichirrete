package j$.time.format;

import java.util.List;

public final class f implements g {
  public final g[] a;
  
  public final boolean b;
  
  public f(List paramList, boolean paramBoolean) {
    this((g[])paramList.toArray((Object[])new g[paramList.size()]), paramBoolean);
  }
  
  public f(g[] paramArrayOfg, boolean paramBoolean) {
    this.a = paramArrayOfg;
    this.b = paramBoolean;
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual length : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: getfield b : Z
    //   10: istore #6
    //   12: iload #6
    //   14: ifeq -> 27
    //   17: aload_1
    //   18: aload_1
    //   19: getfield c : I
    //   22: iconst_1
    //   23: iadd
    //   24: putfield c : I
    //   27: aload_0
    //   28: getfield a : [Lj$/time/format/g;
    //   31: astore #7
    //   33: aload #7
    //   35: arraylength
    //   36: istore #5
    //   38: iconst_0
    //   39: istore_3
    //   40: iload_3
    //   41: iload #5
    //   43: if_icmpge -> 93
    //   46: aload #7
    //   48: iload_3
    //   49: aaload
    //   50: aload_1
    //   51: aload_2
    //   52: invokeinterface r : (Lj$/time/format/q;Ljava/lang/StringBuilder;)Z
    //   57: ifne -> 87
    //   60: aload_2
    //   61: iload #4
    //   63: invokevirtual setLength : (I)V
    //   66: iload #6
    //   68: ifeq -> 101
    //   71: aload_1
    //   72: aload_1
    //   73: getfield c : I
    //   76: iconst_1
    //   77: isub
    //   78: putfield c : I
    //   81: iconst_1
    //   82: ireturn
    //   83: astore_2
    //   84: goto -> 103
    //   87: iinc #3, 1
    //   90: goto -> 40
    //   93: iload #6
    //   95: ifeq -> 101
    //   98: goto -> 71
    //   101: iconst_1
    //   102: ireturn
    //   103: iload #6
    //   105: ifeq -> 118
    //   108: aload_1
    //   109: aload_1
    //   110: getfield c : I
    //   113: iconst_1
    //   114: isub
    //   115: putfield c : I
    //   118: aload_2
    //   119: athrow
    // Exception table:
    //   from	to	target	type
    //   27	38	83	finally
    //   46	66	83	finally
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    g[] arrayOfG = this.a;
    if (arrayOfG != null) {
      String str;
      boolean bool = this.b;
      if (bool) {
        str = "[";
      } else {
        str = "(";
      } 
      stringBuilder.append(str);
      int i = arrayOfG.length;
      for (byte b = 0; b < i; b++)
        stringBuilder.append(arrayOfG[b]); 
      if (bool) {
        str = "]";
      } else {
        str = ")";
      } 
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */