import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public class dk0 implements vj0 {
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(dk0.class, Object.class, "_state$volatile");
  
  public static final AtomicReferenceFieldUpdater c;
  
  public static final long e;
  
  public static final long f;
  
  public volatile Object _parentHandle$volatile;
  
  public volatile Object _state$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    f = unsafe.objectFieldOffset(dk0.class.getDeclaredField("_state$volatile"));
    c = AtomicReferenceFieldUpdater.newUpdater(dk0.class, Object.class, "_parentHandle$volatile");
    e = unsafe.objectFieldOffset(dk0.class.getDeclaredField("_parentHandle$volatile"));
  }
  
  public dk0(boolean paramBoolean) {
    a40 a40;
    if (paramBoolean) {
      a40 = wf2.l;
    } else {
      a40 = wf2.k;
    } 
    this._state$volatile = a40;
  }
  
  public static rk T(yo0 paramyo0) {
    yo0 yo01;
    while (true) {
      yo01 = paramyo0;
      if (paramyo0.n()) {
        paramyo0 = paramyo0.m();
        continue;
      } 
      break;
    } 
    while (true) {
      paramyo0 = yo01.l();
      yo01 = paramyo0;
      if (!paramyo0.n()) {
        if (paramyo0 instanceof rk)
          return (rk)paramyo0; 
        yo01 = paramyo0;
        if (paramyo0 instanceof f21)
          return null; 
      } 
    } 
  }
  
  public static String c0(Object paramObject) {
    if (paramObject instanceof ck0) {
      paramObject = paramObject;
      return paramObject.f() ? "Cancelling" : ((ck0.c.get(paramObject) != 0) ? "Completing" : "Active");
    } 
    return (paramObject instanceof qh0) ? (((qh0)paramObject).a() ? "Active" : "New") : ((paramObject instanceof bo) ? "Cancelled" : "Completed");
  }
  
  public final Throwable A(Object paramObject) {
    if (paramObject instanceof Throwable)
      return (Throwable)paramObject; 
    dk0 dk01 = (dk0)paramObject;
    Object object = dk01.I();
    boolean bool = object instanceof ck0;
    CancellationException cancellationException1 = null;
    if (bool) {
      paramObject = ((ck0)object).e();
    } else if (object instanceof bo) {
      paramObject = ((bo)object).a;
    } else if (!(object instanceof qh0)) {
      paramObject = null;
    } else {
      tp.k("Cannot be cancelling child in this state: ", object);
      return null;
    } 
    if (paramObject instanceof CancellationException)
      cancellationException1 = (CancellationException)paramObject; 
    CancellationException cancellationException2 = cancellationException1;
    if (cancellationException1 == null)
      cancellationException2 = new wj0("Parent job is ".concat(c0(object)), (Throwable)paramObject, dk01); 
    return cancellationException2;
  }
  
  public final Object B(ck0 paramck0, Object paramObject) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof bo
    //   4: istore #8
    //   6: aconst_null
    //   7: astore #9
    //   9: iload #8
    //   11: ifeq -> 23
    //   14: aload_2
    //   15: checkcast bo
    //   18: astore #10
    //   20: goto -> 26
    //   23: aconst_null
    //   24: astore #10
    //   26: aload #10
    //   28: ifnull -> 38
    //   31: aload #10
    //   33: getfield a : Ljava/lang/Throwable;
    //   36: astore #9
    //   38: aload_1
    //   39: monitorenter
    //   40: aload_1
    //   41: invokevirtual f : ()Z
    //   44: pop
    //   45: aload_1
    //   46: aload #9
    //   48: invokevirtual g : (Ljava/lang/Throwable;)Ljava/util/ArrayList;
    //   51: astore #11
    //   53: aload_0
    //   54: aload_1
    //   55: aload #11
    //   57: invokevirtual D : (Lck0;Ljava/util/ArrayList;)Ljava/lang/Throwable;
    //   60: astore #10
    //   62: aload #10
    //   64: ifnull -> 205
    //   67: aload #11
    //   69: invokeinterface size : ()I
    //   74: iconst_1
    //   75: if_icmpgt -> 81
    //   78: goto -> 205
    //   81: aload #11
    //   83: invokeinterface size : ()I
    //   88: istore_3
    //   89: new java/util/IdentityHashMap
    //   92: astore #12
    //   94: aload #12
    //   96: iload_3
    //   97: invokespecial <init> : (I)V
    //   100: aload #12
    //   102: invokestatic newSetFromMap : (Ljava/util/Map;)Ljava/util/Set;
    //   105: astore #12
    //   107: aload #11
    //   109: invokevirtual size : ()I
    //   112: istore #5
    //   114: iconst_0
    //   115: istore_3
    //   116: iload_3
    //   117: iload #5
    //   119: if_icmpge -> 205
    //   122: aload #11
    //   124: iload_3
    //   125: invokevirtual get : (I)Ljava/lang/Object;
    //   128: astore #13
    //   130: iload_3
    //   131: iconst_1
    //   132: iadd
    //   133: istore #4
    //   135: aload #13
    //   137: checkcast java/lang/Throwable
    //   140: astore #13
    //   142: iload #4
    //   144: istore_3
    //   145: aload #13
    //   147: aload #10
    //   149: if_acmpeq -> 116
    //   152: iload #4
    //   154: istore_3
    //   155: aload #13
    //   157: aload #10
    //   159: if_acmpeq -> 116
    //   162: iload #4
    //   164: istore_3
    //   165: aload #13
    //   167: instanceof java/util/concurrent/CancellationException
    //   170: ifne -> 116
    //   173: iload #4
    //   175: istore_3
    //   176: aload #12
    //   178: aload #13
    //   180: invokeinterface add : (Ljava/lang/Object;)Z
    //   185: ifeq -> 116
    //   188: aload #10
    //   190: aload #13
    //   192: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   195: iload #4
    //   197: istore_3
    //   198: goto -> 116
    //   201: astore_2
    //   202: goto -> 383
    //   205: aload_1
    //   206: monitorexit
    //   207: aload #10
    //   209: ifnonnull -> 215
    //   212: goto -> 236
    //   215: aload #10
    //   217: aload #9
    //   219: if_acmpne -> 225
    //   222: goto -> 236
    //   225: new bo
    //   228: dup
    //   229: aload #10
    //   231: iconst_0
    //   232: invokespecial <init> : (Ljava/lang/Throwable;Z)V
    //   235: astore_2
    //   236: aload #10
    //   238: ifnull -> 281
    //   241: aload_0
    //   242: aload #10
    //   244: invokevirtual w : (Ljava/lang/Throwable;)Z
    //   247: ifne -> 259
    //   250: aload_0
    //   251: aload #10
    //   253: invokevirtual J : (Ljava/lang/Throwable;)Z
    //   256: ifeq -> 281
    //   259: aload_2
    //   260: invokevirtual getClass : ()Ljava/lang/Class;
    //   263: pop
    //   264: aload_2
    //   265: checkcast bo
    //   268: astore #9
    //   270: getstatic bo.b : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   273: aload #9
    //   275: iconst_0
    //   276: iconst_1
    //   277: invokevirtual compareAndSet : (Ljava/lang/Object;II)Z
    //   280: pop
    //   281: aload_0
    //   282: aload_2
    //   283: invokevirtual V : (Ljava/lang/Object;)V
    //   286: getstatic dk0.b : Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   289: astore #11
    //   291: aload_2
    //   292: instanceof qh0
    //   295: ifeq -> 317
    //   298: new rh0
    //   301: dup
    //   302: aload_2
    //   303: checkcast qh0
    //   306: invokespecial <init> : (Lqh0;)V
    //   309: astore #9
    //   311: aload_0
    //   312: astore #10
    //   314: goto -> 323
    //   317: aload_2
    //   318: astore #9
    //   320: aload_0
    //   321: astore #10
    //   323: aload #11
    //   325: invokevirtual getClass : ()Ljava/lang/Class;
    //   328: pop
    //   329: getstatic oi.a : Lsun/misc/Unsafe;
    //   332: astore #12
    //   334: getstatic dk0.f : J
    //   337: lstore #6
    //   339: aload #12
    //   341: aload #10
    //   343: lload #6
    //   345: aload_1
    //   346: aload #9
    //   348: invokevirtual compareAndSwapObject : (Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z
    //   351: ifeq -> 357
    //   354: goto -> 370
    //   357: aload #12
    //   359: aload #10
    //   361: lload #6
    //   363: invokevirtual getObjectVolatile : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   366: aload_1
    //   367: if_acmpeq -> 379
    //   370: aload #10
    //   372: aload_1
    //   373: aload_2
    //   374: invokevirtual z : (Lqh0;Ljava/lang/Object;)V
    //   377: aload_2
    //   378: areturn
    //   379: goto -> 323
    //   382: astore_2
    //   383: aload_1
    //   384: monitorexit
    //   385: aload_2
    //   386: athrow
    // Exception table:
    //   from	to	target	type
    //   40	62	382	finally
    //   67	78	201	finally
    //   81	114	201	finally
    //   122	130	201	finally
    //   135	142	201	finally
    //   165	173	201	finally
    //   176	195	201	finally
  }
  
  public final CancellationException C() {
    Object object = I();
    boolean bool = object instanceof ck0;
    Throwable throwable = null;
    CancellationException cancellationException = null;
    if (bool) {
      throwable = ((ck0)object).e();
      if (throwable != null) {
        object = getClass().getSimpleName().concat(" is cancelling");
        if (throwable instanceof CancellationException)
          cancellationException = (CancellationException)throwable; 
        return (cancellationException == null) ? new wj0((String)object, throwable, this) : cancellationException;
      } 
      tp.k("Job is still new or active: ", this);
      return null;
    } 
    if (!(object instanceof qh0)) {
      if (object instanceof bo) {
        object = ((bo)object).a;
        Throwable throwable1 = throwable;
        if (object instanceof CancellationException)
          throwable1 = (CancellationException)object; 
        return (CancellationException)((throwable1 == null) ? new wj0(x(), (Throwable)object, this) : throwable1);
      } 
      return new wj0(getClass().getSimpleName().concat(" has completed normally"), null, this);
    } 
    tp.k("Job is still new or active: ", this);
    return null;
  }
  
  public final Throwable D(ck0 paramck0, ArrayList<ck0> paramArrayList) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface isEmpty : ()Z
    //   6: istore #6
    //   8: aconst_null
    //   9: astore #7
    //   11: iload #6
    //   13: ifeq -> 39
    //   16: aload_1
    //   17: invokevirtual f : ()Z
    //   20: ifeq -> 37
    //   23: new wj0
    //   26: dup
    //   27: aload_0
    //   28: invokevirtual x : ()Ljava/lang/String;
    //   31: aconst_null
    //   32: aload_0
    //   33: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;Ldk0;)V
    //   36: areturn
    //   37: aconst_null
    //   38: areturn
    //   39: aload_2
    //   40: invokevirtual size : ()I
    //   43: istore #5
    //   45: iconst_0
    //   46: istore #4
    //   48: iconst_0
    //   49: istore_3
    //   50: iload_3
    //   51: iload #5
    //   53: if_icmpge -> 78
    //   56: aload_2
    //   57: iload_3
    //   58: invokevirtual get : (I)Ljava/lang/Object;
    //   61: astore_1
    //   62: iinc #3, 1
    //   65: aload_1
    //   66: checkcast java/lang/Throwable
    //   69: instanceof java/util/concurrent/CancellationException
    //   72: ifne -> 50
    //   75: goto -> 80
    //   78: aconst_null
    //   79: astore_1
    //   80: aload_1
    //   81: checkcast java/lang/Throwable
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull -> 91
    //   89: aload_1
    //   90: areturn
    //   91: aload_2
    //   92: iconst_0
    //   93: invokeinterface get : (I)Ljava/lang/Object;
    //   98: checkcast java/lang/Throwable
    //   101: astore #8
    //   103: aload #8
    //   105: instanceof vu1
    //   108: ifeq -> 178
    //   111: aload_2
    //   112: invokevirtual size : ()I
    //   115: istore #5
    //   117: iload #4
    //   119: istore_3
    //   120: aload #7
    //   122: astore_1
    //   123: iload_3
    //   124: iload #5
    //   126: if_icmpge -> 167
    //   129: aload_2
    //   130: iload_3
    //   131: invokevirtual get : (I)Ljava/lang/Object;
    //   134: astore_1
    //   135: iload_3
    //   136: iconst_1
    //   137: iadd
    //   138: istore #4
    //   140: aload_1
    //   141: checkcast java/lang/Throwable
    //   144: astore #9
    //   146: iload #4
    //   148: istore_3
    //   149: aload #9
    //   151: aload #8
    //   153: if_acmpeq -> 120
    //   156: iload #4
    //   158: istore_3
    //   159: aload #9
    //   161: instanceof vu1
    //   164: ifeq -> 120
    //   167: aload_1
    //   168: checkcast java/lang/Throwable
    //   171: astore_1
    //   172: aload_1
    //   173: ifnull -> 178
    //   176: aload_1
    //   177: areturn
    //   178: aload #8
    //   180: areturn
  }
  
  public boolean E() {
    return true;
  }
  
  public boolean F() {
    return this instanceof yn;
  }
  
  public final f21 G(qh0 paramqh0) {
    f21 f21 = paramqh0.d();
    if (f21 == null) {
      if (paramqh0 instanceof a40)
        return (f21)new yo0(); 
      if (paramqh0 instanceof yj0) {
        Y((yj0)paramqh0);
        return null;
      } 
      tp.k("State should have list: ", paramqh0);
      return null;
    } 
    return f21;
  }
  
  public final qk H() {
    c.getClass();
    return (qk)oi.a.getObjectVolatile(this, e);
  }
  
  public final Object I() {
    b.getClass();
    return oi.a.getObjectVolatile(this, f);
  }
  
  public boolean J(Throwable paramThrowable) {
    return false;
  }
  
  public void K(co paramco) {
    throw paramco;
  }
  
  public final void L(vj0 paramvj0) {
    g21 g21 = g21.b;
    if (paramvj0 == null) {
      a0(g21);
      return;
    } 
    paramvj0 = paramvj0;
    while (true) {
      int i = paramvj0.b0(paramvj0.I());
      if (i != 0 && i != 1)
        continue; 
      break;
    } 
    qk qk = paramvj0.t(this);
    a0(qk);
    if (O()) {
      qk.b();
      a0(g21);
    } 
  }
  
  public final k00 M(boolean paramBoolean, yj0 paramyj0) {
    g21 g21;
    paramyj0.i = this;
    yj0 yj01 = paramyj0;
    dk0 dk01 = this;
    while (true) {
      dk0 dk02;
      Throwable throwable1;
      Object object3 = dk01.I();
      if (object3 instanceof a40) {
        dk0 dk03;
        Unsafe unsafe;
        a40 a40 = (a40)object3;
        if (a40.b) {
          while (true) {
            b.getClass();
            unsafe = oi.a;
            long l = f;
            dk0 dk04 = dk01;
            object1 = yj01;
            if (unsafe.compareAndSwapObject(dk04, l, object3, object1))
              return (k00)object1; 
            if (unsafe.getObjectVolatile(dk04, l) != object3) {
              dk02 = dk04;
              break;
            } 
            yj01 = (yj0)object1;
            dk03 = dk04;
          } 
        } else {
          yj0 yj02 = yj01;
          dk03.X((a40)unsafe);
          dk02 = dk03;
          object1 = yj02;
        } 
      } else {
        dk0 dk03;
        dk0 dk04 = dk02;
        boolean bool = object3 instanceof qh0;
        g21 = g21.b;
        dk02 = null;
        Throwable throwable = null;
        if (bool) {
          qh0 qh0 = (qh0)object3;
          f21 f21 = qh0.d();
          if (f21 == null) {
            object1.Y((yj0)object3);
            qh0 = (qh0)object1;
            dk03 = dk04;
          } else {
            if (dk04.r()) {
              if (qh0 instanceof ck0) {
                qh0 = qh0;
              } else {
                qh0 = null;
              } 
              if (qh0 != null)
                throwable = qh0.e(); 
              if (throwable == null) {
                bool = f21.e((yo0)dk04, 5);
              } else {
                if (paramBoolean) {
                  dk04.s(throwable);
                  return g21;
                } 
                break;
              } 
            } else {
              bool = f21.e((yo0)dk04, 1);
            } 
            dk0 dk05 = dk03;
            dk03 = dk04;
            if (bool) {
              dk03 = dk04;
              continue;
            } 
          } 
        } else {
          if (paramBoolean) {
            object1 = dk03.I();
            if (object1 instanceof bo) {
              object1 = object1;
            } else {
              object1 = null;
            } 
            if (object1 != null)
              throwable1 = ((bo)object1).a; 
            dk04.s(throwable1);
          } 
          break;
        } 
      } 
      Throwable throwable2 = throwable1;
      Object object2 = object1;
      Object object1 = throwable2;
    } 
    return g21;
  }
  
  public final boolean N() {
    Object object = I();
    return (object instanceof bo || (object instanceof ck0 && ((ck0)object).f()));
  }
  
  public final boolean O() {
    return I() instanceof qh0 ^ true;
  }
  
  public boolean P() {
    return this instanceof wf;
  }
  
  public final Object Q(ds paramds) {
    while (true) {
      Object object = I();
      boolean bool = object instanceof qh0;
      l02 l02 = l02.a;
      if (!bool) {
        g92.y(paramds.e());
        return l02;
      } 
      if (b0(object) >= 0) {
        ni ni = new ni(1, dd1.N(paramds));
        ni.x();
        ni.A(new gi(2, g92.M(this, true, new wg1(ni))));
        Object object1 = ni.v();
        object = ys.b;
        if (object1 != object)
          object1 = l02; 
        return (object1 == object) ? object1 : l02;
      } 
    } 
  }
  
  public final Object R(Object paramObject) {
    while (true) {
      Object object = f0(I(), paramObject);
      if (object == wf2.f) {
        object = new StringBuilder("Job ");
        object.append(this);
        object.append(" is already complete or completing, but is being completed with ");
        object.append(paramObject);
        String str = object.toString();
        boolean bool = paramObject instanceof bo;
        object = null;
        if (bool) {
          paramObject = paramObject;
        } else {
          paramObject = null;
        } 
        if (paramObject != null)
          object = ((bo)paramObject).a; 
        throw new IllegalStateException(str, object);
      } 
      if (object != wf2.h)
        return object; 
    } 
  }
  
  public String S() {
    return getClass().getSimpleName();
  }
  
  public final void U(f21 paramf21, Throwable paramThrowable) {
    paramf21.e(new un0(4), 4);
    Object object = paramf21.k();
    object.getClass();
    object = object;
    Exception exception;
    for (exception = null; !object.equals(paramf21); exception = exception1) {
      Exception exception1 = exception;
      if (object instanceof yj0) {
        exception1 = exception;
        if (((yj0)object).r())
          try {
            ((yj0)object).s(paramThrowable);
          } finally {
            exception1 = null;
          }  
      } 
      object = object.l();
    } 
    if (exception != null)
      K((co)exception); 
    w(paramThrowable);
  }
  
  public void V(Object paramObject) {}
  
  public void W() {}
  
  public final void X(a40 parama40) {
    long l;
    dk0 dk01;
    oh0 oh0;
    Unsafe unsafe;
    yo0 yo0 = new yo0();
    if (parama40.b) {
      dk01 = this;
    } else {
      oh0 = new oh0((f21)yo0);
      dk01 = this;
    } 
    do {
      b.getClass();
      unsafe = oi.a;
      l = f;
    } while (!unsafe.compareAndSwapObject(dk01, l, parama40, oh0) && unsafe.getObjectVolatile(dk01, l) == parama40);
  }
  
  public final void Y(yj0 paramyj0) {
    long l;
    Unsafe unsafe;
    paramyj0.g((f21)new yo0());
    yo0 yo0 = paramyj0.l();
    yj0 yj01 = paramyj0;
    dk0 dk01 = this;
    do {
      b.getClass();
      unsafe = oi.a;
      l = f;
    } while (!unsafe.compareAndSwapObject(dk01, l, yj01, yo0) && unsafe.getObjectVolatile(dk01, l) == yj01);
  }
  
  public final void Z(yj0 paramyj0) {
    dk0 dk01 = this;
    label19: while (true) {
      Object object = dk01.I();
      if (object instanceof yj0) {
        if (object != paramyj0)
          break; 
        a40 a40 = wf2.l;
        while (true) {
          b.getClass();
          Unsafe unsafe = oi.a;
          long l = f;
          if (unsafe.compareAndSwapObject(dk01, l, object, a40))
            break; 
          if (unsafe.getObjectVolatile(dk01, l) != object)
            continue label19; 
        } 
        break;
      } 
      if (object instanceof qh0 && ((qh0)object).d() != null)
        paramyj0.o(); 
      break;
    } 
  }
  
  public boolean a() {
    Object object = I();
    return (object instanceof qh0 && ((qh0)object).a());
  }
  
  public final void a0(qk paramqk) {
    c.getClass();
    oi.a.putObjectVolatile(this, e, paramqk);
  }
  
  public final int b0(Object paramObject) {
    boolean bool = paramObject instanceof a40;
    long l = f;
    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
    if (bool) {
      Unsafe unsafe;
      if (((a40)paramObject).b)
        return 0; 
      a40 a40 = wf2.l;
      do {
        atomicReferenceFieldUpdater.getClass();
        unsafe = oi.a;
        if (unsafe.compareAndSwapObject(this, f, paramObject, a40)) {
          W();
          return 1;
        } 
      } while (unsafe.getObjectVolatile(this, l) == paramObject);
    } else {
      if (paramObject instanceof oh0) {
        Unsafe unsafe;
        f21 f21 = ((oh0)paramObject).b;
        do {
          atomicReferenceFieldUpdater.getClass();
          unsafe = oi.a;
          if (unsafe.compareAndSwapObject(this, f, paramObject, f21)) {
            W();
            return 1;
          } 
        } while (unsafe.getObjectVolatile(this, l) == paramObject);
        return -1;
      } 
      return 0;
    } 
    return -1;
  }
  
  public void c(CancellationException paramCancellationException) {
    CancellationException cancellationException = paramCancellationException;
    if (paramCancellationException == null)
      cancellationException = new wj0(x(), null, this); 
    v(cancellationException);
  }
  
  public final boolean d0(qh0 paramqh0, Object paramObject) {
    dk0 dk01;
    Object object;
    if (paramObject instanceof qh0) {
      object = new rh0((qh0)paramObject);
      dk01 = this;
    } else {
      object = paramObject;
      dk01 = this;
    } 
    while (true) {
      b.getClass();
      Unsafe unsafe = oi.a;
      long l = f;
      if (unsafe.compareAndSwapObject(dk01, l, paramqh0, object)) {
        dk01.V(paramObject);
        dk01.z(paramqh0, paramObject);
        return true;
      } 
      if (unsafe.getObjectVolatile(dk01, l) != paramqh0)
        return false; 
    } 
  }
  
  public final boolean e0(qh0 paramqh0, Throwable paramThrowable) {
    f21 f21 = G(paramqh0);
    if (f21 != null) {
      long l;
      Unsafe unsafe;
      ck0 ck0 = new ck0(f21, paramThrowable);
      qh0 qh01 = paramqh0;
      dk0 dk01 = this;
      do {
        b.getClass();
        unsafe = oi.a;
        l = f;
        if (unsafe.compareAndSwapObject(dk01, l, qh01, ck0)) {
          dk01.U(f21, paramThrowable);
          return true;
        } 
      } while (unsafe.getObjectVolatile(dk01, l) == qh01);
    } 
    return false;
  }
  
  public final Object f0(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof qh0))
      return wf2.f; 
    if ((paramObject1 instanceof a40 || paramObject1 instanceof yj0) && !(paramObject1 instanceof rk) && !(paramObject2 instanceof bo))
      return d0((qh0)paramObject1, paramObject2) ? paramObject2 : wf2.h; 
    qh0 qh0 = (qh0)paramObject1;
    f21 f21 = G(qh0);
    if (f21 == null)
      return wf2.h; 
    boolean bool = qh0 instanceof ck0;
    Object object1 = null;
    if (bool) {
      paramObject1 = qh0;
    } else {
      paramObject1 = null;
    } 
    Object object = paramObject1;
    if (paramObject1 == null)
      object = new ck0(f21, null); 
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      boolean bool1;
      paramObject1 = ck0.c;
      if (paramObject1.get(object) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1) {
        paramObject1 = wf2.f;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return paramObject1;
      } 
    } finally {}
    paramObject1.set(object, 1);
    if (object != qh0) {
      paramObject1 = b;
      while (!paramObject1.compareAndSet(this, qh0, object)) {
        if (paramObject1.get(this) != qh0) {
          paramObject1 = wf2.h;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return paramObject1;
        } 
      } 
    } 
    bool = object.f();
    if (paramObject2 instanceof bo) {
      paramObject1 = paramObject2;
    } else {
      paramObject1 = null;
    } 
    if (paramObject1 != null)
      object.b(((bo)paramObject1).a); 
    Throwable throwable = object.e();
    paramObject1 = object1;
    if (!bool)
      paramObject1 = throwable; 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    if (paramObject1 != null)
      U(f21, (Throwable)paramObject1); 
    paramObject1 = T(f21);
    if (paramObject1 != null && g0((ck0)object, (rk)paramObject1, paramObject2))
      return wf2.g; 
    f21.e(new un0(2), 2);
    paramObject1 = T(f21);
    return (paramObject1 != null && g0((ck0)object, (rk)paramObject1, paramObject2)) ? wf2.g : B((ck0)object, paramObject2);
  }
  
  public final boolean g0(ck0 paramck0, rk paramrk, Object paramObject) {
    while (true) {
      if (g92.M(paramrk.j, false, new bk0(this, paramck0, paramrk, paramObject)) != g21.b)
        return true; 
      rk rk1 = T(paramrk);
      paramrk = rk1;
      if (rk1 == null)
        return false; 
    } 
  }
  
  public final ns getKey() {
    return vs2.g;
  }
  
  public final Object h(Object paramObject, ad0 paramad0) {
    return paramad0.g(paramObject, this);
  }
  
  public final os k(os paramos) {
    return dd1.f0(this, paramos);
  }
  
  public final ms l(ns paramns) {
    return dd1.v(this, paramns);
  }
  
  public final os o(ns paramns) {
    return dd1.V(this, paramns);
  }
  
  public void r(Object paramObject) {}
  
  public void s(Object paramObject) {
    r(paramObject);
  }
  
  public final qk t(dk0 paramdk0) {
    rk rk = new rk(paramdk0);
    rk.i = this;
    paramdk0 = this;
    label47: while (true) {
      Throwable throwable;
      Object object2 = paramdk0.I();
      if (object2 instanceof a40) {
        Unsafe unsafe;
        a40 a40 = (a40)object2;
        if (a40.b) {
          while (true) {
            b.getClass();
            unsafe = oi.a;
            long l = f;
            if (unsafe.compareAndSwapObject(paramdk0, l, object2, rk))
              break; 
            if (unsafe.getObjectVolatile(paramdk0, l) != object2)
              continue label47; 
          } 
          continue;
        } 
        paramdk0.X((a40)unsafe);
        continue;
      } 
      boolean bool = object2 instanceof qh0;
      g21 g21 = g21.b;
      f21 f21 = null;
      Object object = null;
      if (bool) {
        f21 = ((qh0)object2).d();
        if (f21 == null) {
          paramdk0.Y((yj0)object2);
          continue;
        } 
        if (!f21.e(rk, 7)) {
          bool = f21.e(rk, 3);
          object1 = paramdk0.I();
          if (object1 instanceof ck0) {
            object1 = ((ck0)object1).e();
          } else {
            if (object1 instanceof bo) {
              bo bo = (bo)object1;
            } else {
              f21 = null;
            } 
            object1 = object;
            if (f21 != null)
              object1 = ((bo)f21).a; 
          } 
          rk.s((Throwable)object1);
          if (!bool)
            return g21; 
        } 
        return rk;
      } 
      Object object1 = object1.I();
      if (object1 instanceof bo) {
        object1 = object1;
      } else {
        object1 = null;
      } 
      if (object1 != null)
        throwable = ((bo)object1).a; 
      rk.s(throwable);
      return g21;
    } 
  }
  
  public final String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(S());
    stringBuilder2.append('{');
    stringBuilder2.append(c0(I()));
    stringBuilder2.append('}');
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder1.append('@');
    stringBuilder1.append(qv.s(this));
    return stringBuilder1.toString();
  }
  
  public final boolean u(Object paramObject) {
    // Byte code:
    //   0: getstatic wf2.f : Lf1;
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual F : ()Z
    //   8: ifeq -> 100
    //   11: aload_0
    //   12: invokevirtual I : ()Ljava/lang/Object;
    //   15: astore_3
    //   16: aload_3
    //   17: instanceof qh0
    //   20: ifeq -> 81
    //   23: aload_3
    //   24: instanceof ck0
    //   27: ifeq -> 50
    //   30: aload_3
    //   31: checkcast ck0
    //   34: astore #4
    //   36: getstatic ck0.c : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   39: aload #4
    //   41: invokevirtual get : (Ljava/lang/Object;)I
    //   44: ifeq -> 50
    //   47: goto -> 81
    //   50: aload_0
    //   51: aload_3
    //   52: new bo
    //   55: dup
    //   56: aload_0
    //   57: aload_1
    //   58: invokevirtual A : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   61: iconst_0
    //   62: invokespecial <init> : (Ljava/lang/Throwable;Z)V
    //   65: invokevirtual f0 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   68: astore #4
    //   70: aload #4
    //   72: getstatic wf2.h : Lf1;
    //   75: if_acmpeq -> 11
    //   78: goto -> 86
    //   81: getstatic wf2.f : Lf1;
    //   84: astore #4
    //   86: aload #4
    //   88: astore_3
    //   89: aload #4
    //   91: getstatic wf2.g : Lf1;
    //   94: if_acmpne -> 100
    //   97: goto -> 386
    //   100: aload_3
    //   101: astore #4
    //   103: aload_3
    //   104: getstatic wf2.f : Lf1;
    //   107: if_acmpne -> 367
    //   110: aconst_null
    //   111: astore #5
    //   113: aconst_null
    //   114: astore_3
    //   115: aload_0
    //   116: invokevirtual I : ()Ljava/lang/Object;
    //   119: astore #7
    //   121: aload #7
    //   123: instanceof ck0
    //   126: ifeq -> 246
    //   129: aload #7
    //   131: monitorenter
    //   132: aload #7
    //   134: checkcast ck0
    //   137: invokevirtual c : ()Ljava/lang/Object;
    //   140: getstatic wf2.j : Lf1;
    //   143: if_acmpne -> 163
    //   146: getstatic wf2.i : Lf1;
    //   149: astore_1
    //   150: aload #7
    //   152: monitorexit
    //   153: aload_1
    //   154: astore #4
    //   156: goto -> 367
    //   159: astore_1
    //   160: goto -> 241
    //   163: aload #7
    //   165: checkcast ck0
    //   168: invokevirtual f : ()Z
    //   171: istore_2
    //   172: aload_3
    //   173: astore #4
    //   175: aload_3
    //   176: ifnonnull -> 186
    //   179: aload_0
    //   180: aload_1
    //   181: invokevirtual A : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   184: astore #4
    //   186: aload #7
    //   188: checkcast ck0
    //   191: aload #4
    //   193: invokevirtual b : (Ljava/lang/Throwable;)V
    //   196: aload #7
    //   198: checkcast ck0
    //   201: invokevirtual e : ()Ljava/lang/Throwable;
    //   204: astore_3
    //   205: aload #5
    //   207: astore_1
    //   208: iload_2
    //   209: ifne -> 214
    //   212: aload_3
    //   213: astore_1
    //   214: aload #7
    //   216: monitorexit
    //   217: aload_1
    //   218: ifnull -> 234
    //   221: aload_0
    //   222: aload #7
    //   224: checkcast ck0
    //   227: getfield b : Lf21;
    //   230: aload_1
    //   231: invokevirtual U : (Lf21;Ljava/lang/Throwable;)V
    //   234: getstatic wf2.f : Lf1;
    //   237: astore_1
    //   238: goto -> 153
    //   241: aload #7
    //   243: monitorexit
    //   244: aload_1
    //   245: athrow
    //   246: aload #7
    //   248: instanceof qh0
    //   251: ifeq -> 360
    //   254: aload_3
    //   255: astore #4
    //   257: aload_3
    //   258: ifnonnull -> 268
    //   261: aload_0
    //   262: aload_1
    //   263: invokevirtual A : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   266: astore #4
    //   268: aload #7
    //   270: checkcast qh0
    //   273: astore #6
    //   275: aload #6
    //   277: invokeinterface a : ()Z
    //   282: ifeq -> 306
    //   285: aload #4
    //   287: astore_3
    //   288: aload_0
    //   289: aload #6
    //   291: aload #4
    //   293: invokevirtual e0 : (Lqh0;Ljava/lang/Throwable;)Z
    //   296: ifeq -> 115
    //   299: getstatic wf2.f : Lf1;
    //   302: astore_1
    //   303: goto -> 153
    //   306: aload_0
    //   307: aload #7
    //   309: new bo
    //   312: dup
    //   313: aload #4
    //   315: iconst_0
    //   316: invokespecial <init> : (Ljava/lang/Throwable;Z)V
    //   319: invokevirtual f0 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   322: astore #6
    //   324: aload #6
    //   326: getstatic wf2.f : Lf1;
    //   329: if_acmpeq -> 350
    //   332: aload #4
    //   334: astore_3
    //   335: aload #6
    //   337: getstatic wf2.h : Lf1;
    //   340: if_acmpeq -> 115
    //   343: aload #6
    //   345: astore #4
    //   347: goto -> 367
    //   350: ldc_w 'Cannot happen in '
    //   353: aload #7
    //   355: invokestatic k : (Ljava/lang/String;Ljava/lang/Object;)V
    //   358: iconst_0
    //   359: ireturn
    //   360: getstatic wf2.i : Lf1;
    //   363: astore_1
    //   364: goto -> 153
    //   367: aload #4
    //   369: getstatic wf2.f : Lf1;
    //   372: if_acmpne -> 378
    //   375: goto -> 386
    //   378: aload #4
    //   380: getstatic wf2.g : Lf1;
    //   383: if_acmpne -> 388
    //   386: iconst_1
    //   387: ireturn
    //   388: aload #4
    //   390: getstatic wf2.i : Lf1;
    //   393: if_acmpne -> 398
    //   396: iconst_0
    //   397: ireturn
    //   398: aload_0
    //   399: aload #4
    //   401: invokevirtual r : (Ljava/lang/Object;)V
    //   404: iconst_1
    //   405: ireturn
    // Exception table:
    //   from	to	target	type
    //   132	150	159	finally
    //   163	172	159	finally
    //   179	186	159	finally
    //   186	205	159	finally
  }
  
  public void v(CancellationException paramCancellationException) {
    u(paramCancellationException);
  }
  
  public final boolean w(Throwable paramThrowable) {
    if (!P()) {
      boolean bool = paramThrowable instanceof CancellationException;
      qk qk = H();
      if (qk == null || qk == g21.b)
        return bool; 
      if (!qk.c(paramThrowable) && !bool)
        return false; 
    } 
    return true;
  }
  
  public String x() {
    return "Job was cancelled";
  }
  
  public boolean y(Throwable paramThrowable) {
    return (paramThrowable instanceof CancellationException || (u(paramThrowable) && E()));
  }
  
  public final void z(qh0 paramqh0, Object paramObject) {
    qk qk = H();
    if (qk != null) {
      qk.b();
      a0(g21.b);
    } 
    boolean bool = paramObject instanceof bo;
    qk = null;
    if (bool) {
      paramObject = paramObject;
    } else {
      paramObject = null;
    } 
    if (paramObject != null) {
      paramObject = ((bo)paramObject).a;
    } else {
      paramObject = null;
    } 
    if (paramqh0 instanceof yj0) {
      try {
        return;
      } finally {
        qk = null;
        paramObject = new StringBuilder("Exception in completion handler ");
        paramObject.append(paramqh0);
        paramObject.append(" for ");
        paramObject.append(this);
      } 
    } else {
      f21 f21 = paramqh0.d();
      if (f21 != null) {
        RuntimeException runtimeException;
        f21.e(new un0(1), 1);
        Object object = f21.k();
        object.getClass();
        object = object;
        while (!object.equals(f21)) {
          RuntimeException runtimeException1;
          qk qk1 = qk;
          if (object instanceof yj0)
            try {
              ((yj0)object).s((Throwable)paramObject);
            } finally {
              qk1 = null;
            }  
          object = object.l();
          runtimeException = runtimeException1;
        } 
        if (runtimeException != null)
          K((co)runtimeException); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */