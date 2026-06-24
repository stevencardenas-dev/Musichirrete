import java.util.List;

public abstract class fm2 {
  public static final bg2 a = new bg2(9);
  
  public static void a(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          ((Long)paramList.get(b)).getClass();
          paramInt += 8;
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.f(((Long)paramList.get(paramInt)).longValue()); 
      } else {
        while (b < paramList.size()) {
          ik2.e(paramInt, ((Long)paramList.get(b)).longValue());
          b++;
        } 
      } 
    } 
  }
  
  public static void b(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      byte b = 0;
      int j = 0;
      int i = 0;
      int k = 0;
      if (bool) {
        paramList = paramList;
        i = b;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < ((xk2)paramList).e) {
            j = paramList.d(i);
            paramInt += ik2.n(j >> 31 ^ j + j);
            i++;
          } 
          ik2.k(paramInt);
          for (paramInt = k; paramInt < ((xk2)paramList).e; paramInt++) {
            i = paramList.d(paramInt);
            ik2.k(i >> 31 ^ i + i);
          } 
        } else {
          while (i < ((xk2)paramList).e) {
            j = paramList.d(i);
            ik2.j(paramInt, j >> 31 ^ j + j);
            i++;
          } 
        } 
      } else if (paramBoolean) {
        ik2.i(paramInt, 2);
        paramInt = 0;
        i = 0;
        while (paramInt < paramList.size()) {
          k = ((Integer)paramList.get(paramInt)).intValue();
          i += ik2.n(k >> 31 ^ k + k);
          paramInt++;
        } 
        ik2.k(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          i = ((Integer)paramList.get(paramInt)).intValue();
          ik2.k(i >> 31 ^ i + i);
        } 
      } else {
        while (i < paramList.size()) {
          j = ((Integer)paramList.get(i)).intValue();
          ik2.j(paramInt, j >> 31 ^ j + j);
          i++;
        } 
      } 
    } 
  }
  
  public static void c(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          long l = ((Long)paramList.get(b)).longValue();
          paramInt += ik2.o(l >> 63L ^ l + l);
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++) {
          long l = ((Long)paramList.get(paramInt)).longValue();
          ik2.m(l >> 63L ^ l + l);
        } 
      } else {
        while (b < paramList.size()) {
          long l = ((Long)paramList.get(b)).longValue();
          ik2.l(paramInt, l >> 63L ^ l + l);
          b++;
        } 
      } 
    } 
  }
  
  public static void d(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      int i = 0;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((xk2)paramList).e) {
            i += ik2.n(paramList.d(paramInt));
            paramInt++;
          } 
          ik2.k(i);
          for (paramInt = bool1; paramInt < ((xk2)paramList).e; paramInt++)
            ik2.k(paramList.d(paramInt)); 
        } else {
          while (i < ((xk2)paramList).e) {
            ik2.j(paramInt, paramList.d(i));
            i++;
          } 
        } 
      } else {
        i = bool3;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < paramList.size()) {
            paramInt += ik2.n(((Integer)paramList.get(i)).intValue());
            i++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
            ik2.k(((Integer)paramList.get(paramInt)).intValue()); 
        } else {
          while (i < paramList.size()) {
            ik2.j(paramInt, ((Integer)paramList.get(i)).intValue());
            i++;
          } 
        } 
      } 
    } 
  }
  
  public static void e(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      int i = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        paramInt = 0;
        i = 0;
        while (paramInt < paramList.size()) {
          i += ik2.o(((Long)paramList.get(paramInt)).longValue());
          paramInt++;
        } 
        ik2.k(i);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.m(((Long)paramList.get(paramInt)).longValue()); 
      } else {
        while (i < paramList.size()) {
          ik2.l(paramInt, ((Long)paramList.get(i)).longValue());
          i++;
        } 
      } 
    } 
  }
  
  public static boolean f(Object paramObject1, Object paramObject2) {
    return (paramObject1 != paramObject2) ? ((paramObject1 != null && paramObject1.equals(paramObject2))) : true;
  }
  
  public static int g(List<Integer> paramList) {
    int j = paramList.size();
    boolean bool = false;
    byte b = 0;
    if (j == 0)
      return 0; 
    if (paramList instanceof xk2) {
      paramList = paramList;
      int k = 0;
      while (b < j) {
        k += ik2.o(paramList.d(b));
        b++;
      } 
      return k;
    } 
    int i = 0;
    for (b = bool; b < j; b++)
      i += ik2.o(((Integer)paramList.get(b)).intValue()); 
    return i;
  }
  
  public static int h(int paramInt, List paramList) {
    int i = paramList.size();
    return (i == 0) ? 0 : ((ik2.n(paramInt << 3) + 4) * i);
  }
  
  public static int i(int paramInt, List paramList) {
    int i = paramList.size();
    return (i == 0) ? 0 : ((ik2.n(paramInt << 3) + 8) * i);
  }
  
  public static int j(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof xk2) {
      paramList = paramList;
      i = 0;
      while (j < k) {
        i += ik2.o(paramList.d(j));
        j++;
      } 
      return i;
    } 
    j = 0;
    while (i < k) {
      j += ik2.o(((Integer)paramList.get(i)).intValue());
      i++;
    } 
    return j;
  }
  
  public static int k(List<Long> paramList) {
    int j = paramList.size();
    byte b = 0;
    if (j == 0)
      return 0; 
    int i = 0;
    while (b < j) {
      i += ik2.o(((Long)paramList.get(b)).longValue());
      b++;
    } 
    return i;
  }
  
  public static int l(List<Integer> paramList) {
    int m = paramList.size();
    int k = 0;
    int j = 0;
    if (m == 0)
      return 0; 
    if (paramList instanceof xk2) {
      paramList = paramList;
      int n = 0;
      while (j < m) {
        k = paramList.d(j);
        n += ik2.n(k >> 31 ^ k + k);
        j++;
      } 
      return n;
    } 
    int i = 0;
    for (j = k; j < m; j++) {
      k = ((Integer)paramList.get(j)).intValue();
      i += ik2.n(k >> 31 ^ k + k);
    } 
    return i;
  }
  
  public static int m(List<Long> paramList) {
    int j = paramList.size();
    byte b = 0;
    if (j == 0)
      return 0; 
    int i = 0;
    while (b < j) {
      long l = ((Long)paramList.get(b)).longValue();
      i += ik2.o(l >> 63L ^ l + l);
      b++;
    } 
    return i;
  }
  
  public static int n(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof xk2) {
      paramList = paramList;
      i = 0;
      while (j < k) {
        i += ik2.n(paramList.d(j));
        j++;
      } 
      return i;
    } 
    j = 0;
    while (i < k) {
      j += ik2.n(((Integer)paramList.get(i)).intValue());
      i++;
    } 
    return j;
  }
  
  public static int o(List<Long> paramList) {
    int j = paramList.size();
    byte b = 0;
    if (j == 0)
      return 0; 
    int i = 0;
    while (b < j) {
      i += ik2.o(((Long)paramList.get(b)).longValue());
      b++;
    } 
    return i;
  }
  
  public static void p(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast wk2
    //   4: astore #4
    //   6: aload #4
    //   8: getfield zzc : Lnm2;
    //   11: astore_3
    //   12: aload_1
    //   13: checkcast wk2
    //   16: getfield zzc : Lnm2;
    //   19: astore_1
    //   20: getstatic nm2.f : Lnm2;
    //   23: astore #5
    //   25: aload_3
    //   26: astore_0
    //   27: aload #5
    //   29: aload_1
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: ifne -> 224
    //   36: aload #5
    //   38: aload_3
    //   39: invokevirtual equals : (Ljava/lang/Object;)Z
    //   42: ifeq -> 125
    //   45: aload_3
    //   46: getfield a : I
    //   49: aload_1
    //   50: getfield a : I
    //   53: iadd
    //   54: istore_2
    //   55: aload_3
    //   56: getfield b : [I
    //   59: iload_2
    //   60: invokestatic copyOf : ([II)[I
    //   63: astore_0
    //   64: aload_1
    //   65: getfield b : [I
    //   68: iconst_0
    //   69: aload_0
    //   70: aload_3
    //   71: getfield a : I
    //   74: aload_1
    //   75: getfield a : I
    //   78: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   81: aload_3
    //   82: getfield c : [Ljava/lang/Object;
    //   85: iload_2
    //   86: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   89: astore #5
    //   91: aload_1
    //   92: getfield c : [Ljava/lang/Object;
    //   95: iconst_0
    //   96: aload #5
    //   98: aload_3
    //   99: getfield a : I
    //   102: aload_1
    //   103: getfield a : I
    //   106: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   109: new nm2
    //   112: dup
    //   113: iload_2
    //   114: aload_0
    //   115: aload #5
    //   117: iconst_1
    //   118: invokespecial <init> : (I[I[Ljava/lang/Object;Z)V
    //   121: astore_0
    //   122: goto -> 224
    //   125: aload_3
    //   126: invokevirtual getClass : ()Ljava/lang/Class;
    //   129: pop
    //   130: aload_1
    //   131: aload #5
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: ifeq -> 144
    //   139: aload_3
    //   140: astore_0
    //   141: goto -> 224
    //   144: aload_3
    //   145: getfield e : Z
    //   148: ifeq -> 216
    //   151: aload_3
    //   152: getfield a : I
    //   155: aload_1
    //   156: getfield a : I
    //   159: iadd
    //   160: istore_2
    //   161: aload_3
    //   162: iload_2
    //   163: invokevirtual e : (I)V
    //   166: aload_1
    //   167: getfield b : [I
    //   170: iconst_0
    //   171: aload_3
    //   172: getfield b : [I
    //   175: aload_3
    //   176: getfield a : I
    //   179: aload_1
    //   180: getfield a : I
    //   183: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   186: aload_1
    //   187: getfield c : [Ljava/lang/Object;
    //   190: iconst_0
    //   191: aload_3
    //   192: getfield c : [Ljava/lang/Object;
    //   195: aload_3
    //   196: getfield a : I
    //   199: aload_1
    //   200: getfield a : I
    //   203: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   206: aload_3
    //   207: iload_2
    //   208: putfield a : I
    //   211: aload_3
    //   212: astore_0
    //   213: goto -> 224
    //   216: new java/lang/UnsupportedOperationException
    //   219: dup
    //   220: invokespecial <init> : ()V
    //   223: athrow
    //   224: aload #4
    //   226: aload_0
    //   227: putfield zzc : Lnm2;
    //   230: return
  }
  
  public static void q(int paramInt, List<Boolean> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          ((Boolean)paramList.get(b)).getClass();
          paramInt++;
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.a(((Boolean)paramList.get(paramInt)).booleanValue()); 
      } else {
        while (b < paramList.size()) {
          boolean bool1 = ((Boolean)paramList.get(b)).booleanValue();
          ik2.k(paramInt << 3);
          ik2.a(bool1);
          b++;
        } 
      } 
    } 
  }
  
  public static void r(int paramInt, List<Double> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          ((Double)paramList.get(b)).getClass();
          paramInt += 8;
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.f(Double.doubleToRawLongBits(((Double)paramList.get(paramInt)).doubleValue())); 
      } else {
        while (b < paramList.size()) {
          ik2.e(paramInt, Double.doubleToRawLongBits(((Double)paramList.get(b)).doubleValue()));
          b++;
        } 
      } 
    } 
  }
  
  public static void s(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      byte b = 0;
      boolean bool1 = false;
      int i = 0;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        i = b;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((xk2)paramList).e) {
            i += ik2.o(paramList.d(paramInt));
            paramInt++;
          } 
          ik2.k(i);
          for (paramInt = bool2; paramInt < ((xk2)paramList).e; paramInt++)
            ik2.h(paramList.d(paramInt)); 
        } else {
          while (i < ((xk2)paramList).e) {
            ik2.g(paramInt, paramList.d(i));
            i++;
          } 
        } 
      } else if (paramBoolean) {
        ik2.i(paramInt, 2);
        i = 0;
        paramInt = 0;
        while (i < paramList.size()) {
          paramInt += ik2.o(((Integer)paramList.get(i)).intValue());
          i++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
          ik2.h(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (i < paramList.size()) {
          ik2.g(paramInt, ((Integer)paramList.get(i)).intValue());
          i++;
        } 
      } 
    } 
  }
  
  public static void t(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      byte b = 0;
      boolean bool1 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          b = 0;
          paramInt = 0;
          while (b < ((xk2)paramList).e) {
            paramList.d(b);
            paramInt += 4;
            b++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool2; paramInt < ((xk2)paramList).e; paramInt++)
            ik2.d(paramList.d(paramInt)); 
        } else {
          while (b < ((xk2)paramList).e) {
            ik2.c(paramInt, paramList.d(b));
            b++;
          } 
        } 
      } else {
        b = bool3;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          b = 0;
          paramInt = 0;
          while (b < paramList.size()) {
            ((Integer)paramList.get(b)).getClass();
            paramInt += 4;
            b++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
            ik2.d(((Integer)paramList.get(paramInt)).intValue()); 
        } else {
          while (b < paramList.size()) {
            ik2.c(paramInt, ((Integer)paramList.get(b)).intValue());
            b++;
          } 
        } 
      } 
    } 
  }
  
  public static void u(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          ((Long)paramList.get(b)).getClass();
          paramInt += 8;
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.f(((Long)paramList.get(paramInt)).longValue()); 
      } else {
        while (b < paramList.size()) {
          ik2.e(paramInt, ((Long)paramList.get(b)).longValue());
          b++;
        } 
      } 
    } 
  }
  
  public static void v(int paramInt, List<Float> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        b = 0;
        paramInt = 0;
        while (b < paramList.size()) {
          ((Float)paramList.get(b)).getClass();
          paramInt += 4;
          b++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.d(Float.floatToRawIntBits(((Float)paramList.get(paramInt)).floatValue())); 
      } else {
        while (b < paramList.size()) {
          ik2.c(paramInt, Float.floatToRawIntBits(((Float)paramList.get(b)).floatValue()));
          b++;
        } 
      } 
    } 
  }
  
  public static void w(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      byte b = 0;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          b = 0;
          paramInt = 0;
          while (b < ((xk2)paramList).e) {
            paramInt += ik2.o(paramList.d(b));
            b++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool1; paramInt < ((xk2)paramList).e; paramInt++)
            ik2.h(paramList.d(paramInt)); 
        } else {
          while (b < ((xk2)paramList).e) {
            ik2.g(paramInt, paramList.d(b));
            b++;
          } 
        } 
      } else {
        b = bool3;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          b = 0;
          paramInt = 0;
          while (b < paramList.size()) {
            paramInt += ik2.o(((Integer)paramList.get(b)).intValue());
            b++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
            ik2.h(((Integer)paramList.get(paramInt)).intValue()); 
        } else {
          while (b < paramList.size()) {
            ik2.g(paramInt, ((Integer)paramList.get(b)).intValue());
            b++;
          } 
        } 
      } 
    } 
  }
  
  public static void x(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      int i = 0;
      boolean bool = false;
      if (paramBoolean) {
        ik2.i(paramInt, 2);
        paramInt = 0;
        i = 0;
        while (paramInt < paramList.size()) {
          i += ik2.o(((Long)paramList.get(paramInt)).longValue());
          paramInt++;
        } 
        ik2.k(i);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          ik2.m(((Long)paramList.get(paramInt)).longValue()); 
      } else {
        while (i < paramList.size()) {
          ik2.l(paramInt, ((Long)paramList.get(i)).longValue());
          i++;
        } 
      } 
    } 
  }
  
  public static void y(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      ik2 ik2 = (ik2)parama42.c;
      boolean bool = paramList instanceof xk2;
      byte b2 = 0;
      boolean bool1 = false;
      byte b1 = 0;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        b1 = b2;
        if (paramBoolean) {
          ik2.i(paramInt, 2);
          b1 = 0;
          paramInt = 0;
          while (b1 < ((xk2)paramList).e) {
            paramList.d(b1);
            paramInt += 4;
            b1++;
          } 
          ik2.k(paramInt);
          for (paramInt = bool2; paramInt < ((xk2)paramList).e; paramInt++)
            ik2.d(paramList.d(paramInt)); 
        } else {
          while (b1 < ((xk2)paramList).e) {
            ik2.c(paramInt, paramList.d(b1));
            b1++;
          } 
        } 
      } else if (paramBoolean) {
        ik2.i(paramInt, 2);
        b1 = 0;
        paramInt = 0;
        while (b1 < paramList.size()) {
          ((Integer)paramList.get(b1)).getClass();
          paramInt += 4;
          b1++;
        } 
        ik2.k(paramInt);
        for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
          ik2.d(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (b1 < paramList.size()) {
          ik2.c(paramInt, ((Integer)paramList.get(b1)).intValue());
          b1++;
        } 
      } 
    } 
  }
  
  static {
    int i = ak2.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */