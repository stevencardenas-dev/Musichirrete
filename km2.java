import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public abstract class km2 extends ad2 implements Set {
  public static final int g = 0;
  
  public transient im2 f;
  
  public static int g(int paramInt) {
    int i = Math.max(paramInt, 2);
    if (i < 751619276) {
      paramInt = Integer.highestOneBit(i - 1);
      while (true) {
        paramInt += paramInt;
        if (paramInt * 0.7D < i)
          continue; 
        return paramInt;
      } 
    } 
    if (i < 1073741824)
      return 1073741824; 
    l0.l(GMDx.udRgMp);
    return 0;
  }
  
  public static km2 h(int paramInt, Object... paramVarArgs) {
    // Byte code:
    //   0: iload_0
    //   1: ifeq -> 254
    //   4: iload_0
    //   5: iconst_1
    //   6: if_icmpeq -> 236
    //   9: iload_0
    //   10: invokestatic g : (I)I
    //   13: istore #9
    //   15: iload #9
    //   17: anewarray java/lang/Object
    //   20: astore #12
    //   22: iload #9
    //   24: iconst_1
    //   25: isub
    //   26: istore #8
    //   28: iconst_0
    //   29: istore #4
    //   31: iconst_0
    //   32: istore_3
    //   33: iload_3
    //   34: istore_2
    //   35: iload #4
    //   37: iload_0
    //   38: if_icmpge -> 147
    //   41: aload_1
    //   42: iload #4
    //   44: aaload
    //   45: astore #13
    //   47: iload #4
    //   49: aload #13
    //   51: invokestatic Y : (ILjava/lang/Object;)V
    //   54: aload #13
    //   56: invokevirtual hashCode : ()I
    //   59: istore #10
    //   61: iload #10
    //   63: invokestatic a : (I)I
    //   66: istore #6
    //   68: iload #6
    //   70: iload #8
    //   72: iand
    //   73: istore #5
    //   75: aload #12
    //   77: iload #5
    //   79: aaload
    //   80: astore #11
    //   82: aload #11
    //   84: ifnonnull -> 113
    //   87: aload_1
    //   88: iload_2
    //   89: aload #13
    //   91: aastore
    //   92: aload #12
    //   94: iload #5
    //   96: aload #13
    //   98: aastore
    //   99: iload_3
    //   100: iload #10
    //   102: iadd
    //   103: istore #5
    //   105: iload_2
    //   106: iconst_1
    //   107: iadd
    //   108: istore #7
    //   110: goto -> 135
    //   113: iload_3
    //   114: istore #5
    //   116: iload_2
    //   117: istore #7
    //   119: aload #11
    //   121: aload #13
    //   123: invokevirtual equals : (Ljava/lang/Object;)Z
    //   126: ifne -> 135
    //   129: iinc #6, 1
    //   132: goto -> 68
    //   135: iinc #4, 1
    //   138: iload #5
    //   140: istore_3
    //   141: iload #7
    //   143: istore_2
    //   144: goto -> 35
    //   147: aload_1
    //   148: iload_2
    //   149: iload_0
    //   150: aconst_null
    //   151: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
    //   154: iload_2
    //   155: iconst_1
    //   156: if_icmpne -> 177
    //   159: aload_1
    //   160: iconst_0
    //   161: aaload
    //   162: astore_1
    //   163: aload_1
    //   164: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   167: pop
    //   168: new ym2
    //   171: dup
    //   172: aload_1
    //   173: invokespecial <init> : (Ljava/lang/Object;)V
    //   176: areturn
    //   177: iload #9
    //   179: iconst_2
    //   180: idiv
    //   181: istore_0
    //   182: iload_2
    //   183: invokestatic g : (I)I
    //   186: iload_0
    //   187: if_icmpge -> 196
    //   190: iload_2
    //   191: aload_1
    //   192: invokestatic h : (I[Ljava/lang/Object;)Lkm2;
    //   195: areturn
    //   196: aload_1
    //   197: arraylength
    //   198: istore_0
    //   199: aload_1
    //   200: astore #11
    //   202: iload_2
    //   203: iload_0
    //   204: iconst_1
    //   205: ishr
    //   206: iload_0
    //   207: iconst_2
    //   208: ishr
    //   209: iadd
    //   210: if_icmpge -> 220
    //   213: aload_1
    //   214: iload_2
    //   215: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   218: astore #11
    //   220: new xm2
    //   223: dup
    //   224: iload_3
    //   225: iload #8
    //   227: iload_2
    //   228: aload #11
    //   230: aload #12
    //   232: invokespecial <init> : (III[Ljava/lang/Object;[Ljava/lang/Object;)V
    //   235: areturn
    //   236: aload_1
    //   237: iconst_0
    //   238: aaload
    //   239: astore_1
    //   240: aload_1
    //   241: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   244: pop
    //   245: new ym2
    //   248: dup
    //   249: aload_1
    //   250: invokespecial <init> : (Ljava/lang/Object;)V
    //   253: areturn
    //   254: getstatic xm2.n : Lxm2;
    //   257: areturn
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof km2) || !(this instanceof xm2) || !((km2)paramObject instanceof xm2) || hashCode() == paramObject.hashCode()) {
      if (paramObject == this)
        return true; 
      if (paramObject instanceof Set) {
        paramObject = paramObject;
        try {
          if (size() == paramObject.size()) {
            boolean bool = containsAll((Collection<?>)paramObject);
            return !!bool;
          } 
        } catch (NullPointerException|ClassCastException nullPointerException) {}
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    Iterator<E> iterator = iterator();
    int i;
    for (i = 0; iterator.hasNext(); i += b) {
      byte b;
      E e = iterator.next();
      if (e != null) {
        b = e.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\km2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */