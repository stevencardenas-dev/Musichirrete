import java.util.List;

public abstract class kw2 {
  public static final zb0 a = new zb0(25);
  
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 != paramObject2) ? ((paramObject1 != null && paramObject1.equals(paramObject2))) : true;
  }
  
  public static void b(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast pv2
    //   4: astore_3
    //   5: aload_3
    //   6: getfield zzc : Lkc2;
    //   9: astore_2
    //   10: aload_1
    //   11: checkcast pv2
    //   14: getfield zzc : Lkc2;
    //   17: astore_1
    //   18: getstatic kc2.e : Lkc2;
    //   21: astore #4
    //   23: aload_2
    //   24: astore_0
    //   25: aload #4
    //   27: aload_1
    //   28: invokevirtual equals : (Ljava/lang/Object;)Z
    //   31: ifne -> 173
    //   34: aload #4
    //   36: aload_2
    //   37: invokevirtual equals : (Ljava/lang/Object;)Z
    //   40: ifeq -> 107
    //   43: aload_2
    //   44: invokevirtual getClass : ()Ljava/lang/Class;
    //   47: pop
    //   48: aload_1
    //   49: invokevirtual getClass : ()Ljava/lang/Class;
    //   52: pop
    //   53: aload_2
    //   54: getfield a : [I
    //   57: iconst_0
    //   58: invokestatic copyOf : ([II)[I
    //   61: astore_0
    //   62: aload_1
    //   63: getfield a : [I
    //   66: iconst_0
    //   67: aload_0
    //   68: iconst_0
    //   69: iconst_0
    //   70: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   73: aload_2
    //   74: getfield b : [Ljava/lang/Object;
    //   77: iconst_0
    //   78: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   81: astore_2
    //   82: aload_1
    //   83: getfield b : [Ljava/lang/Object;
    //   86: iconst_0
    //   87: aload_2
    //   88: iconst_0
    //   89: iconst_0
    //   90: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   93: new kc2
    //   96: dup
    //   97: aload_0
    //   98: aload_2
    //   99: iconst_1
    //   100: invokespecial <init> : ([I[Ljava/lang/Object;Z)V
    //   103: astore_0
    //   104: goto -> 173
    //   107: aload_2
    //   108: invokevirtual getClass : ()Ljava/lang/Class;
    //   111: pop
    //   112: aload_2
    //   113: astore_0
    //   114: aload_1
    //   115: aload #4
    //   117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   120: ifne -> 173
    //   123: aload_2
    //   124: getfield d : Z
    //   127: ifeq -> 165
    //   130: aload_2
    //   131: getfield a : [I
    //   134: astore_0
    //   135: aload_1
    //   136: getfield a : [I
    //   139: iconst_0
    //   140: aload_0
    //   141: iconst_0
    //   142: iconst_0
    //   143: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   146: aload_1
    //   147: getfield b : [Ljava/lang/Object;
    //   150: iconst_0
    //   151: aload_2
    //   152: getfield b : [Ljava/lang/Object;
    //   155: iconst_0
    //   156: iconst_0
    //   157: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   160: aload_2
    //   161: astore_0
    //   162: goto -> 173
    //   165: new java/lang/UnsupportedOperationException
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: athrow
    //   173: aload_3
    //   174: aload_0
    //   175: putfield zzc : Lkc2;
    //   178: return
  }
  
  public static void c(int paramInt, List<Double> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      byte b = 0;
      boolean bool = false;
      if (paramBoolean) {
        jv2.c(paramInt, 2);
        paramInt = 0;
        b = 0;
        while (paramInt < paramList.size()) {
          ((Double)paramList.get(paramInt)).getClass();
          b += true;
          paramInt++;
        } 
        jv2.k(b);
        for (paramInt = bool; paramInt < paramList.size(); paramInt++)
          jv2.n(Double.doubleToRawLongBits(((Double)paramList.get(paramInt)).doubleValue())); 
      } else {
        while (b < paramList.size()) {
          jv2.h(paramInt, Double.doubleToRawLongBits(((Double)paramList.get(b)).doubleValue()));
          b++;
        } 
      } 
    } 
  }
  
  public static void d(int paramInt, List<Float> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof mv2;
      byte b2 = 0;
      boolean bool1 = false;
      byte b1 = 0;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        b1 = b2;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b1 = 0;
          while (paramInt < ((mv2)paramList).e) {
            paramList.d(paramInt);
            float f = ((mv2)paramList).c[paramInt];
            b1 += true;
            paramInt++;
          } 
          jv2.k(b1);
          for (paramInt = bool2; paramInt < ((mv2)paramList).e; paramInt++) {
            paramList.d(paramInt);
            jv2.l(Float.floatToRawIntBits(((mv2)paramList).c[paramInt]));
          } 
        } else {
          while (b1 < ((mv2)paramList).e) {
            paramList.d(b1);
            jv2.f(paramInt, Float.floatToRawIntBits(((mv2)paramList).c[b1]));
            b1++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        b1 = 0;
        paramInt = 0;
        while (b1 < paramList.size()) {
          ((Float)paramList.get(b1)).getClass();
          paramInt += 4;
          b1++;
        } 
        jv2.k(paramInt);
        for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
          jv2.l(Float.floatToRawIntBits(((Float)paramList.get(paramInt)).floatValue())); 
      } else {
        while (b1 < paramList.size()) {
          jv2.f(paramInt, Float.floatToRawIntBits(((Float)paramList.get(b1)).floatValue()));
          b1++;
        } 
      } 
    } 
  }
  
  public static void e(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof yv2;
      int i = 0;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((yv2)paramList).e) {
            i += jv2.q(paramList.d(paramInt));
            paramInt++;
          } 
          jv2.k(i);
          for (paramInt = bool1; paramInt < ((yv2)paramList).e; paramInt++)
            jv2.m(paramList.d(paramInt)); 
        } else {
          while (i < ((yv2)paramList).e) {
            jv2.g(paramInt, paramList.d(i));
            i++;
          } 
        } 
      } else {
        i = bool3;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < paramList.size()) {
            paramInt += jv2.q(((Long)paramList.get(i)).longValue());
            i++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
            jv2.m(((Long)paramList.get(paramInt)).longValue()); 
        } else {
          while (i < paramList.size()) {
            jv2.g(paramInt, ((Long)paramList.get(i)).longValue());
            i++;
          } 
        } 
      } 
    } 
  }
  
  public static void f(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof yv2;
      int i = 0;
      boolean bool1 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((yv2)paramList).e) {
            i += jv2.q(paramList.d(paramInt));
            paramInt++;
          } 
          jv2.k(i);
          for (paramInt = bool2; paramInt < ((yv2)paramList).e; paramInt++)
            jv2.m(paramList.d(paramInt)); 
        } else {
          while (i < ((yv2)paramList).e) {
            jv2.g(paramInt, paramList.d(i));
            i++;
          } 
        } 
      } else {
        i = bool3;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < paramList.size()) {
            paramInt += jv2.q(((Long)paramList.get(i)).longValue());
            i++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
            jv2.m(((Long)paramList.get(paramInt)).longValue()); 
        } else {
          while (i < paramList.size()) {
            jv2.g(paramInt, ((Long)paramList.get(i)).longValue());
            i++;
          } 
        } 
      } 
    } 
  }
  
  public static void g(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof yv2;
      int i = 0;
      boolean bool1 = false;
      byte b = 0;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < ((yv2)paramList).e) {
            long l = paramList.d(i);
            paramInt += jv2.q(l >> 63L ^ l + l);
            i++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool2; paramInt < ((yv2)paramList).e; paramInt++) {
            long l = paramList.d(paramInt);
            jv2.m(l >> 63L ^ l + l);
          } 
        } else {
          while (i < ((yv2)paramList).e) {
            long l = paramList.d(i);
            jv2.g(paramInt, l >> 63L ^ l + l);
            i++;
          } 
        } 
      } else {
        i = b;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < paramList.size()) {
            long l = ((Long)paramList.get(paramInt)).longValue();
            i += jv2.q(l >> 63L ^ l + l);
            paramInt++;
          } 
          jv2.k(i);
          for (paramInt = bool1; paramInt < paramList.size(); paramInt++) {
            long l = ((Long)paramList.get(paramInt)).longValue();
            jv2.m(l >> 63L ^ l + l);
          } 
        } else {
          while (i < paramList.size()) {
            long l = ((Long)paramList.get(i)).longValue();
            jv2.g(paramInt, l >> 63L ^ l + l);
            i++;
          } 
        } 
      } 
    } 
  }
  
  public static void h(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof yv2;
      byte b = 0;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b = 0;
          while (paramInt < ((yv2)paramList).e) {
            paramList.d(paramInt);
            b += true;
            paramInt++;
          } 
          jv2.k(b);
          for (paramInt = bool1; paramInt < ((yv2)paramList).e; paramInt++)
            jv2.n(paramList.d(paramInt)); 
        } else {
          while (b < ((yv2)paramList).e) {
            jv2.h(paramInt, paramList.d(b));
            b++;
          } 
        } 
      } else {
        b = bool3;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b = 0;
          while (paramInt < paramList.size()) {
            ((Long)paramList.get(paramInt)).getClass();
            b += 8;
            paramInt++;
          } 
          jv2.k(b);
          for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
            jv2.n(((Long)paramList.get(paramInt)).longValue()); 
        } else {
          while (b < paramList.size()) {
            jv2.h(paramInt, ((Long)paramList.get(b)).longValue());
            b++;
          } 
        } 
      } 
    } 
  }
  
  public static void i(int paramInt, List<Long> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof yv2;
      byte b2 = 0;
      boolean bool2 = false;
      byte b1 = 0;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        b1 = b2;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          b1 = 0;
          paramInt = 0;
          while (b1 < ((yv2)paramList).e) {
            paramList.d(b1);
            paramInt += 8;
            b1++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool1; paramInt < ((yv2)paramList).e; paramInt++)
            jv2.n(paramList.d(paramInt)); 
        } else {
          while (b1 < ((yv2)paramList).e) {
            jv2.h(paramInt, paramList.d(b1));
            b1++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        paramInt = 0;
        b1 = 0;
        while (paramInt < paramList.size()) {
          ((Long)paramList.get(paramInt)).getClass();
          b1 += 8;
          paramInt++;
        } 
        jv2.k(b1);
        for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
          jv2.n(((Long)paramList.get(paramInt)).longValue()); 
      } else {
        while (b1 < paramList.size()) {
          jv2.h(paramInt, ((Long)paramList.get(b1)).longValue());
          b1++;
        } 
      } 
    } 
  }
  
  public static void j(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b = 0;
      boolean bool2 = false;
      int i = 0;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        i = b;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          i = 0;
          paramInt = 0;
          while (i < ((qv2)paramList).e) {
            paramInt += jv2.q(paramList.e(i));
            i++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool1; paramInt < ((qv2)paramList).e; paramInt++)
            jv2.j(paramList.e(paramInt)); 
        } else {
          while (i < ((qv2)paramList).e) {
            jv2.d(paramInt, paramList.e(i));
            i++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        paramInt = 0;
        i = 0;
        while (paramInt < paramList.size()) {
          i += jv2.q(((Integer)paramList.get(paramInt)).intValue());
          paramInt++;
        } 
        jv2.k(i);
        for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
          jv2.j(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (i < paramList.size()) {
          jv2.d(paramInt, ((Integer)paramList.get(i)).intValue());
          i++;
        } 
      } 
    } 
  }
  
  public static void k(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b = 0;
      boolean bool2 = false;
      int i = 0;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        i = b;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((qv2)paramList).e) {
            i += jv2.p(paramList.e(paramInt));
            paramInt++;
          } 
          jv2.k(i);
          for (paramInt = bool1; paramInt < ((qv2)paramList).e; paramInt++)
            jv2.k(paramList.e(paramInt)); 
        } else {
          while (i < ((qv2)paramList).e) {
            jv2.e(paramInt, paramList.e(i));
            i++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        i = 0;
        paramInt = 0;
        while (i < paramList.size()) {
          paramInt += jv2.p(((Integer)paramList.get(i)).intValue());
          i++;
        } 
        jv2.k(paramInt);
        for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
          jv2.k(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (i < paramList.size()) {
          jv2.e(paramInt, ((Integer)paramList.get(i)).intValue());
          i++;
        } 
      } 
    } 
  }
  
  public static void l(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b = 0;
      int k = 0;
      int i = 0;
      int j = 0;
      if (bool) {
        paramList = paramList;
        i = b;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          i = 0;
          while (paramInt < ((qv2)paramList).e) {
            k = paramList.e(paramInt);
            i += jv2.p(k >> 31 ^ k + k);
            paramInt++;
          } 
          jv2.k(i);
          for (paramInt = j; paramInt < ((qv2)paramList).e; paramInt++) {
            i = paramList.e(paramInt);
            jv2.k(i >> 31 ^ i + i);
          } 
        } else {
          while (i < ((qv2)paramList).e) {
            j = paramList.e(i);
            jv2.e(paramInt, j >> 31 ^ j + j);
            i++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        i = 0;
        paramInt = 0;
        while (i < paramList.size()) {
          j = ((Integer)paramList.get(i)).intValue();
          paramInt += jv2.p(j >> 31 ^ j + j);
          i++;
        } 
        jv2.k(paramInt);
        for (paramInt = k; paramInt < paramList.size(); paramInt++) {
          i = ((Integer)paramList.get(paramInt)).intValue();
          jv2.k(i >> 31 ^ i + i);
        } 
      } else {
        while (i < paramList.size()) {
          j = ((Integer)paramList.get(i)).intValue();
          jv2.e(paramInt, j >> 31 ^ j + j);
          i++;
        } 
      } 
    } 
  }
  
  public static void m(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b2 = 0;
      boolean bool1 = false;
      byte b1 = 0;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        b1 = b2;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b1 = 0;
          while (paramInt < ((qv2)paramList).e) {
            paramList.e(paramInt);
            b1 += true;
            paramInt++;
          } 
          jv2.k(b1);
          for (paramInt = bool2; paramInt < ((qv2)paramList).e; paramInt++)
            jv2.l(paramList.e(paramInt)); 
        } else {
          while (b1 < ((qv2)paramList).e) {
            jv2.f(paramInt, paramList.e(b1));
            b1++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        b1 = 0;
        paramInt = 0;
        while (b1 < paramList.size()) {
          ((Integer)paramList.get(b1)).getClass();
          paramInt += 4;
          b1++;
        } 
        jv2.k(paramInt);
        for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
          jv2.l(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (b1 < paramList.size()) {
          jv2.f(paramInt, ((Integer)paramList.get(b1)).intValue());
          b1++;
        } 
      } 
    } 
  }
  
  public static void n(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b = 0;
      boolean bool1 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      if (bool) {
        paramList = paramList;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b = 0;
          while (paramInt < ((qv2)paramList).e) {
            paramList.e(paramInt);
            b += true;
            paramInt++;
          } 
          jv2.k(b);
          for (paramInt = bool2; paramInt < ((qv2)paramList).e; paramInt++)
            jv2.l(paramList.e(paramInt)); 
        } else {
          while (b < ((qv2)paramList).e) {
            jv2.f(paramInt, paramList.e(b));
            b++;
          } 
        } 
      } else {
        b = bool3;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          paramInt = 0;
          b = 0;
          while (paramInt < paramList.size()) {
            ((Integer)paramList.get(paramInt)).getClass();
            b += 4;
            paramInt++;
          } 
          jv2.k(b);
          for (paramInt = bool1; paramInt < paramList.size(); paramInt++)
            jv2.l(((Integer)paramList.get(paramInt)).intValue()); 
        } else {
          while (b < paramList.size()) {
            jv2.f(paramInt, ((Integer)paramList.get(b)).intValue());
            b++;
          } 
        } 
      } 
    } 
  }
  
  public static void o(int paramInt, List<Integer> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      boolean bool = paramList instanceof qv2;
      byte b2 = 0;
      boolean bool2 = false;
      byte b1 = 0;
      boolean bool1 = false;
      if (bool) {
        paramList = paramList;
        b1 = b2;
        if (paramBoolean) {
          jv2.c(paramInt, 2);
          b1 = 0;
          paramInt = 0;
          while (b1 < ((qv2)paramList).e) {
            paramInt += jv2.q(paramList.e(b1));
            b1++;
          } 
          jv2.k(paramInt);
          for (paramInt = bool1; paramInt < ((qv2)paramList).e; paramInt++)
            jv2.j(paramList.e(paramInt)); 
        } else {
          while (b1 < ((qv2)paramList).e) {
            jv2.d(paramInt, paramList.e(b1));
            b1++;
          } 
        } 
      } else if (paramBoolean) {
        jv2.c(paramInt, 2);
        b1 = 0;
        paramInt = 0;
        while (b1 < paramList.size()) {
          paramInt += jv2.q(((Integer)paramList.get(b1)).intValue());
          b1++;
        } 
        jv2.k(paramInt);
        for (paramInt = bool2; paramInt < paramList.size(); paramInt++)
          jv2.j(((Integer)paramList.get(paramInt)).intValue()); 
      } else {
        while (b1 < paramList.size()) {
          jv2.d(paramInt, ((Integer)paramList.get(b1)).intValue());
          b1++;
        } 
      } 
    } 
  }
  
  public static void p(int paramInt, List<Boolean> paramList, a42 parama42, boolean paramBoolean) {
    if (paramList != null && !paramList.isEmpty()) {
      jv2 jv2 = (jv2)parama42.c;
      int i = 0;
      int j = 0;
      if (paramBoolean) {
        jv2.c(paramInt, 2);
        i = 0;
        paramInt = 0;
        while (i < paramList.size()) {
          ((Boolean)paramList.get(i)).getClass();
          paramInt++;
          i++;
        } 
        jv2.k(paramInt);
        paramInt = j;
        while (paramInt < paramList.size()) {
          boolean bool = ((Boolean)paramList.get(paramInt)).booleanValue();
          i = jv2.d;
          try {
            byte[] arrayOfByte = jv2.b;
            arrayOfByte[i] = bool;
            jv2.d = i + 1;
            paramInt++;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            paramInt = jv2.c;
            throw new mk2(i, paramInt, 1, indexOutOfBoundsException, 1);
          } 
        } 
      } else {
        while (i < indexOutOfBoundsException.size()) {
          boolean bool = ((Boolean)indexOutOfBoundsException.get(i)).booleanValue();
          jv2.k(paramInt << 3);
          j = jv2.d;
          try {
            byte[] arrayOfByte = jv2.b;
            arrayOfByte[j] = bool;
            jv2.d = j + 1;
            i++;
          } catch (IndexOutOfBoundsException indexOutOfBoundsException1) {
            paramInt = jv2.c;
            throw new mk2(j, paramInt, 1, indexOutOfBoundsException1, 1);
          } 
        } 
      } 
    } 
  }
  
  public static int q(List<Long> paramList) {
    int j = paramList.size();
    boolean bool = false;
    byte b = 0;
    if (j == 0)
      return 0; 
    if (paramList instanceof yv2) {
      paramList = paramList;
      int k = 0;
      while (b < j) {
        k += jv2.q(paramList.d(b));
        b++;
      } 
      return k;
    } 
    int i = 0;
    for (b = bool; b < j; b++)
      i += jv2.q(((Long)paramList.get(b)).longValue()); 
    return i;
  }
  
  public static int r(List<Long> paramList) {
    int j = paramList.size();
    boolean bool = false;
    byte b = 0;
    if (j == 0)
      return 0; 
    if (paramList instanceof yv2) {
      paramList = paramList;
      int k = 0;
      while (b < j) {
        k += jv2.q(paramList.d(b));
        b++;
      } 
      return k;
    } 
    int i = 0;
    for (b = bool; b < j; b++)
      i += jv2.q(((Long)paramList.get(b)).longValue()); 
    return i;
  }
  
  public static int s(List<Long> paramList) {
    int k = paramList.size();
    int j = 0;
    int i = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof yv2) {
      paramList = paramList;
      j = 0;
      while (i < k) {
        long l = paramList.d(i);
        j += jv2.q(l >> 63L ^ l + l);
        i++;
      } 
      return j;
    } 
    i = 0;
    while (j < k) {
      long l = ((Long)paramList.get(j)).longValue();
      i += jv2.q(l >> 63L ^ l + l);
      j++;
    } 
    return i;
  }
  
  public static int t(List<Integer> paramList) {
    int k = paramList.size();
    int j = 0;
    int i = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof qv2) {
      paramList = paramList;
      j = 0;
      while (i < k) {
        j += jv2.q(paramList.e(i));
        i++;
      } 
      return j;
    } 
    i = 0;
    while (j < k) {
      i += jv2.q(((Integer)paramList.get(j)).intValue());
      j++;
    } 
    return i;
  }
  
  public static int u(List<Integer> paramList) {
    int k = paramList.size();
    int j = 0;
    int i = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof qv2) {
      paramList = paramList;
      j = 0;
      while (i < k) {
        j += jv2.q(paramList.e(i));
        i++;
      } 
      return j;
    } 
    i = 0;
    while (j < k) {
      i += jv2.q(((Integer)paramList.get(j)).intValue());
      j++;
    } 
    return i;
  }
  
  public static int v(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof qv2) {
      paramList = paramList;
      i = 0;
      while (j < k) {
        i += jv2.p(paramList.e(j));
        j++;
      } 
      return i;
    } 
    j = 0;
    while (i < k) {
      j += jv2.p(((Integer)paramList.get(i)).intValue());
      i++;
    } 
    return j;
  }
  
  public static int w(List<Integer> paramList) {
    int k = paramList.size();
    int i = 0;
    int j = 0;
    if (k == 0)
      return 0; 
    if (paramList instanceof qv2) {
      paramList = paramList;
      i = 0;
      while (j < k) {
        int m = paramList.e(j);
        i += jv2.p(m >> 31 ^ m + m);
        j++;
      } 
      return i;
    } 
    j = 0;
    while (i < k) {
      int m = ((Integer)paramList.get(i)).intValue();
      j += jv2.p(m >> 31 ^ m + m);
      i++;
    } 
    return j;
  }
  
  public static int x(int paramInt, List paramList) {
    int i = paramList.size();
    return (i == 0) ? 0 : ((jv2.p(paramInt << 3) + 4) * i);
  }
  
  public static int y(int paramInt, List paramList) {
    int i = paramList.size();
    return (i == 0) ? 0 : ((jv2.p(paramInt << 3) + 8) * i);
  }
  
  static {
    int i = ev2.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kw2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */