import java.util.concurrent.locks.ReentrantLock;

public final class n81 {
  public final int a;
  
  public final lc0 b;
  
  public final ReentrantLock c;
  
  public int d;
  
  public boolean e;
  
  public final yp[] f;
  
  public final ik1 g;
  
  public final il h;
  
  public n81(int paramInt, lc0 paramlc0) {
    this.a = paramInt;
    this.b = paramlc0;
    this.c = new ReentrantLock();
    this.f = new yp[paramInt];
    int i = jk1.a;
    this.g = (ik1)new hk1(paramInt);
    Object object = new Object();
    if (paramInt >= 1) {
      if (paramInt <= 1073741824) {
        i = paramInt;
        if (Integer.bitCount(paramInt) != 1)
          i = Integer.highestOneBit(paramInt - 1) << 1; 
        ((il)object).c = i - 1;
        ((il)object).d = new Object[i];
        this.h = (il)object;
        return;
      } 
      l0.l("capacity must be <= 2^30");
      throw null;
    } 
    l0.l("capacity must be >= 1");
    throw null;
  }
  
  public final Object a(ds paramds) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof m81
    //   4: ifeq -> 41
    //   7: aload_1
    //   8: checkcast m81
    //   11: astore #5
    //   13: aload #5
    //   15: getfield i : I
    //   18: istore_2
    //   19: iload_2
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #5
    //   28: iload_2
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield i : I
    //   35: aload #5
    //   37: astore_1
    //   38: goto -> 51
    //   41: new m81
    //   44: dup
    //   45: aload_0
    //   46: aload_1
    //   47: invokespecial <init> : (Ln81;Lds;)V
    //   50: astore_1
    //   51: aload_1
    //   52: getfield g : Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_1
    //   58: getfield i : I
    //   61: istore_2
    //   62: iload_2
    //   63: ifeq -> 91
    //   66: iload_2
    //   67: iconst_1
    //   68: if_icmpne -> 84
    //   71: aload_1
    //   72: getfield f : Ln81;
    //   75: astore_1
    //   76: aload #5
    //   78: invokestatic r0 : (Ljava/lang/Object;)V
    //   81: goto -> 255
    //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   86: invokestatic f : (Ljava/lang/String;)V
    //   89: aconst_null
    //   90: areturn
    //   91: aload #5
    //   93: invokestatic r0 : (Ljava/lang/Object;)V
    //   96: aload_1
    //   97: aload_0
    //   98: putfield f : Ln81;
    //   101: aload_1
    //   102: iconst_1
    //   103: putfield i : I
    //   106: aload_0
    //   107: getfield g : Lik1;
    //   110: astore #7
    //   112: aload #7
    //   114: invokevirtual getClass : ()Ljava/lang/Class;
    //   117: pop
    //   118: aload #7
    //   120: getfield b : I
    //   123: istore_2
    //   124: getstatic hk1.i : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   127: aload #7
    //   129: invokevirtual getAndDecrement : (Ljava/lang/Object;)I
    //   132: istore_3
    //   133: iload_3
    //   134: iload_2
    //   135: if_icmpgt -> 124
    //   138: getstatic l02.a : Ll02;
    //   141: astore #5
    //   143: getstatic ys.b : Lys;
    //   146: astore #6
    //   148: iload_3
    //   149: ifle -> 155
    //   152: goto -> 243
    //   155: aload_1
    //   156: invokestatic N : (Lcs;)Lcs;
    //   159: invokestatic F : (Lcs;)Lni;
    //   162: astore_1
    //   163: aload #7
    //   165: aload_1
    //   166: invokevirtual b : (Le52;)Z
    //   169: ifne -> 217
    //   172: getstatic hk1.i : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   175: aload #7
    //   177: invokevirtual getAndDecrement : (Ljava/lang/Object;)I
    //   180: istore_3
    //   181: iload_3
    //   182: iload_2
    //   183: if_icmpgt -> 172
    //   186: iload_3
    //   187: ifle -> 204
    //   190: aload_1
    //   191: aload #5
    //   193: aload #7
    //   195: getfield c : Lmi;
    //   198: invokevirtual i : (Ljava/lang/Object;Lbd0;)V
    //   201: goto -> 217
    //   204: aload #7
    //   206: aload_1
    //   207: invokevirtual b : (Le52;)Z
    //   210: istore #4
    //   212: iload #4
    //   214: ifeq -> 172
    //   217: aload_1
    //   218: invokevirtual v : ()Ljava/lang/Object;
    //   221: astore_1
    //   222: aload_1
    //   223: aload #6
    //   225: if_acmpne -> 231
    //   228: goto -> 234
    //   231: aload #5
    //   233: astore_1
    //   234: aload_1
    //   235: aload #6
    //   237: if_acmpne -> 243
    //   240: aload_1
    //   241: astore #5
    //   243: aload_0
    //   244: astore_1
    //   245: aload #5
    //   247: aload #6
    //   249: if_acmpne -> 255
    //   252: aload #6
    //   254: areturn
    //   255: aload_1
    //   256: getfield c : Ljava/util/concurrent/locks/ReentrantLock;
    //   259: astore #5
    //   261: aload_1
    //   262: getfield h : Lil;
    //   265: astore #6
    //   267: aload #5
    //   269: invokevirtual lock : ()V
    //   272: aload_1
    //   273: getfield e : Z
    //   276: ifne -> 447
    //   279: aload #6
    //   281: getfield a : I
    //   284: aload #6
    //   286: getfield b : I
    //   289: if_icmpne -> 359
    //   292: aload_1
    //   293: getfield d : I
    //   296: aload_1
    //   297: getfield a : I
    //   300: if_icmplt -> 306
    //   303: goto -> 359
    //   306: new yp
    //   309: astore #7
    //   311: aload #7
    //   313: aload_1
    //   314: getfield b : Llc0;
    //   317: invokeinterface a : ()Ljava/lang/Object;
    //   322: checkcast th1
    //   325: invokespecial <init> : (Lth1;)V
    //   328: aload_1
    //   329: getfield f : [Lyp;
    //   332: astore #8
    //   334: aload_1
    //   335: getfield d : I
    //   338: istore_2
    //   339: aload_1
    //   340: iload_2
    //   341: iconst_1
    //   342: iadd
    //   343: putfield d : I
    //   346: aload #8
    //   348: iload_2
    //   349: aload #7
    //   351: aastore
    //   352: aload #6
    //   354: aload #7
    //   356: invokevirtual a : (Lyp;)V
    //   359: aload #6
    //   361: getfield a : I
    //   364: istore_2
    //   365: iload_2
    //   366: aload #6
    //   368: getfield b : I
    //   371: if_icmpeq -> 434
    //   374: aload #6
    //   376: getfield d : Ljava/lang/Object;
    //   379: checkcast [Ljava/lang/Object;
    //   382: astore #7
    //   384: aload #7
    //   386: iload_2
    //   387: aaload
    //   388: astore #8
    //   390: aload #7
    //   392: iload_2
    //   393: aconst_null
    //   394: aastore
    //   395: aload #6
    //   397: iload_2
    //   398: iconst_1
    //   399: iadd
    //   400: aload #6
    //   402: getfield c : I
    //   405: iand
    //   406: putfield a : I
    //   409: aload #8
    //   411: checkcast yp
    //   414: astore #6
    //   416: aload #5
    //   418: invokevirtual unlock : ()V
    //   421: aload #6
    //   423: areturn
    //   424: astore #5
    //   426: goto -> 464
    //   429: astore #6
    //   431: goto -> 456
    //   434: new java/lang/ArrayIndexOutOfBoundsException
    //   437: astore #6
    //   439: aload #6
    //   441: invokespecial <init> : ()V
    //   444: aload #6
    //   446: athrow
    //   447: ldc 'Connection pool is closed'
    //   449: bipush #21
    //   451: invokestatic V : (Ljava/lang/String;I)V
    //   454: aconst_null
    //   455: athrow
    //   456: aload #5
    //   458: invokevirtual unlock : ()V
    //   461: aload #6
    //   463: athrow
    //   464: aload_1
    //   465: getfield g : Lik1;
    //   468: invokevirtual d : ()V
    //   471: aload #5
    //   473: athrow
    //   474: astore #5
    //   476: aload_1
    //   477: invokevirtual E : ()V
    //   480: aload #5
    //   482: athrow
    // Exception table:
    //   from	to	target	type
    //   163	172	474	finally
    //   172	181	474	finally
    //   190	201	474	finally
    //   204	212	474	finally
    //   255	272	424	finally
    //   272	303	429	finally
    //   306	346	429	finally
    //   352	359	429	finally
    //   359	384	429	finally
    //   395	416	429	finally
    //   416	421	424	finally
    //   434	447	429	finally
    //   447	456	429	finally
    //   456	464	424	finally
  }
  
  public final void b() {
    ReentrantLock reentrantLock = this.c;
    reentrantLock.lock();
    try {
      this.e = true;
      for (yp yp1 : this.f) {
        if (yp1 != null)
          yp1.close(); 
      } 
    } finally {
      Exception exception;
    } 
    reentrantLock.unlock();
  }
  
  public final void c(StringBuilder paramStringBuilder) {
    il il1 = this.h;
    ReentrantLock reentrantLock = this.c;
    reentrantLock.lock();
    try {
      tn0 = new tn0();
      this(10);
      int j = il1.b;
      int k = il1.a;
      int m = il1.c;
      b2 = 0;
      byte b = 0;
      while (b < (j - k & m)) {
        if (b >= 0) {
          int i2 = il1.b;
          int i1 = il1.a;
          int n = il1.c;
          if (b < (i2 - i1 & n)) {
            Object object = ((Object[])il1.d)[i1 + b & n];
            object.getClass();
            tn0.add(object);
            b++;
            continue;
          } 
        } 
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        this();
        throw arrayIndexOutOfBoundsException;
      } 
    } finally {}
    tn0 tn0 = zo2.b(tn0);
    StringBuilder stringBuilder2 = new StringBuilder();
    this();
    stringBuilder2.append('\t');
    stringBuilder2.append(toString());
    stringBuilder2.append(" (");
    paramStringBuilder.append(stringBuilder2.toString());
    stringBuilder2 = new StringBuilder();
    this();
    stringBuilder2.append("capacity=");
    stringBuilder2.append(this.a);
    stringBuilder2.append(", ");
    paramStringBuilder.append(stringBuilder2.toString());
    StringBuilder stringBuilder3 = new StringBuilder();
    this();
    stringBuilder3.append("permits=");
    ik1 ik11 = this.g;
    ik11.getClass();
    stringBuilder3.append(Math.max(hk1.i.get(ik11), 0));
    stringBuilder3.append(", ");
    paramStringBuilder.append(stringBuilder3.toString());
    StringBuilder stringBuilder1 = new StringBuilder();
    this();
    stringBuilder1.append("queue=(size=");
    stringBuilder1.append(tn0.c());
    stringBuilder1.append(")[");
    stringBuilder1.append(nm.p0(tn0, null, null, null, null, 63));
    stringBuilder1.append("], ");
    paramStringBuilder.append(stringBuilder1.toString());
    paramStringBuilder.append(")");
    paramStringBuilder.append('\n');
    yp[] arrayOfYp = this.f;
    int i = arrayOfYp.length;
    byte b3 = 0;
    byte b1 = b2;
    byte b2 = b3;
    while (b1 < i) {
      yp yp1 = arrayOfYp[b1];
      b2++;
      stringBuilder3 = new StringBuilder();
      this();
      stringBuilder3.append("\t\t[");
      stringBuilder3.append(b2);
      stringBuilder3.append("] - ");
      if (yp1 != null) {
        String str = yp1.b.toString();
      } else {
        tn0 = null;
      } 
      stringBuilder3.append((String)tn0);
      paramStringBuilder.append(stringBuilder3.toString());
      paramStringBuilder.append('\n');
      if (yp1 != null)
        yp1.d(paramStringBuilder); 
      b1++;
    } 
    reentrantLock.unlock();
  }
  
  public final void d(yp paramyp) {
    paramyp.getClass();
    ReentrantLock reentrantLock = this.c;
    reentrantLock.lock();
    try {
      this.h.a(paramyp);
      reentrantLock.unlock();
      return;
    } finally {
      reentrantLock.unlock();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */