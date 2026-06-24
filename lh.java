import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import sun.misc.Unsafe;

public class lh implements dk {
  public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(lh.class, "sendersAndCloseStatus$volatile");
  
  public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(lh.class, "receivers$volatile");
  
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(lh.class, "bufferEnd$volatile");
  
  public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(lh.class, "completedExpandBuffersAndPauseFlag$volatile");
  
  public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(lh.class, Object.class, "sendSegment$volatile");
  
  public static final AtomicReferenceFieldUpdater i;
  
  public static final AtomicReferenceFieldUpdater j;
  
  public static final AtomicReferenceFieldUpdater k;
  
  public static final AtomicReferenceFieldUpdater l;
  
  public static final long m;
  
  public static final long n;
  
  public static final long o;
  
  public static final long p;
  
  public static final long q;
  
  public volatile Object _closeCause$volatile;
  
  public final int b;
  
  public volatile long bufferEnd$volatile;
  
  public volatile Object bufferEndSegment$volatile;
  
  public volatile Object closeHandler$volatile;
  
  public volatile long completedExpandBuffersAndPauseFlag$volatile;
  
  public volatile Object receiveSegment$volatile;
  
  public volatile long receivers$volatile;
  
  public volatile Object sendSegment$volatile;
  
  public volatile long sendersAndCloseStatus$volatile;
  
  static {
    Unsafe unsafe = oi.a;
    q = unsafe.objectFieldOffset(lh.class.getDeclaredField("sendSegment$volatile"));
    i = AtomicReferenceFieldUpdater.newUpdater(lh.class, Object.class, "receiveSegment$volatile");
    p = unsafe.objectFieldOffset(lh.class.getDeclaredField("receiveSegment$volatile"));
    j = AtomicReferenceFieldUpdater.newUpdater(lh.class, Object.class, "bufferEndSegment$volatile");
    n = unsafe.objectFieldOffset(lh.class.getDeclaredField("bufferEndSegment$volatile"));
    k = AtomicReferenceFieldUpdater.newUpdater(lh.class, Object.class, "_closeCause$volatile");
    m = unsafe.objectFieldOffset(lh.class.getDeclaredField("_closeCause$volatile"));
    l = AtomicReferenceFieldUpdater.newUpdater(lh.class, Object.class, "closeHandler$volatile");
    o = unsafe.objectFieldOffset(lh.class.getDeclaredField("closeHandler$volatile"));
  }
  
  public lh(int paramInt) {
    this.b = paramInt;
    if (paramInt >= 0) {
      long l;
      kk kk = nh.a;
      if (paramInt != 0) {
        if (paramInt != Integer.MAX_VALUE) {
          l = paramInt;
        } else {
          l = Long.MAX_VALUE;
        } 
      } else {
        l = 0L;
      } 
      this.bufferEnd$volatile = l;
      this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
      kk = new kk(0L, null, this, 3);
      this.sendSegment$volatile = kk;
      this.receiveSegment$volatile = kk;
      if (B()) {
        kk = nh.a;
        kk.getClass();
      } 
      this.bufferEndSegment$volatile = kk;
      this._closeCause$volatile = nh.s;
      return;
    } 
    k91.e(x41.i(paramInt, "Invalid channel capacity: ", ", should be >=0"));
    throw null;
  }
  
  public static Object E(lh paramlh, ds paramds) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof jh
    //   4: ifeq -> 38
    //   7: aload_1
    //   8: checkcast jh
    //   11: astore #9
    //   13: aload #9
    //   15: getfield h : I
    //   18: istore_2
    //   19: iload_2
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 38
    //   26: aload #9
    //   28: iload_2
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield h : I
    //   35: goto -> 52
    //   38: new jh
    //   41: dup
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial <init> : (Llh;Lds;)V
    //   47: astore #9
    //   49: goto -> 35
    //   52: aload #9
    //   54: getfield f : Ljava/lang/Object;
    //   57: astore_1
    //   58: aload #9
    //   60: getfield h : I
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq -> 92
    //   68: iload_2
    //   69: iconst_1
    //   70: if_icmpne -> 85
    //   73: aload_1
    //   74: invokestatic r0 : (Ljava/lang/Object;)V
    //   77: aload_1
    //   78: checkcast jk
    //   81: getfield a : Ljava/lang/Object;
    //   84: areturn
    //   85: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   87: invokestatic f : (Ljava/lang/String;)V
    //   90: aconst_null
    //   91: areturn
    //   92: aload_1
    //   93: invokestatic r0 : (Ljava/lang/Object;)V
    //   96: getstatic lh.i : Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   99: invokevirtual getClass : ()Ljava/lang/Class;
    //   102: pop
    //   103: getstatic oi.a : Lsun/misc/Unsafe;
    //   106: aload_0
    //   107: getstatic lh.p : J
    //   110: invokevirtual getObjectVolatile : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   113: checkcast kk
    //   116: astore_1
    //   117: aload_0
    //   118: astore #10
    //   120: aload #10
    //   122: getstatic lh.c : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   125: aload #10
    //   127: invokevirtual get : (Ljava/lang/Object;)J
    //   130: iconst_1
    //   131: invokevirtual y : (JZ)Z
    //   134: ifeq -> 150
    //   137: new hk
    //   140: dup
    //   141: aload #10
    //   143: invokevirtual r : ()Ljava/lang/Throwable;
    //   146: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   149: areturn
    //   150: getstatic lh.e : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   153: aload #10
    //   155: invokevirtual getAndIncrement : (Ljava/lang/Object;)J
    //   158: lstore #5
    //   160: getstatic nh.b : I
    //   163: i2l
    //   164: lstore_3
    //   165: lload #5
    //   167: lload_3
    //   168: ldiv
    //   169: lstore #7
    //   171: lload #5
    //   173: lload_3
    //   174: lrem
    //   175: l2i
    //   176: istore_2
    //   177: aload_1
    //   178: getfield e : J
    //   181: lload #7
    //   183: lcmp
    //   184: ifeq -> 206
    //   187: aload #10
    //   189: lload #7
    //   191: aload_1
    //   192: invokevirtual o : (JLkk;)Lkk;
    //   195: astore_0
    //   196: aload_0
    //   197: ifnonnull -> 203
    //   200: goto -> 120
    //   203: goto -> 208
    //   206: aload_1
    //   207: astore_0
    //   208: aload #10
    //   210: aload_0
    //   211: iload_2
    //   212: lload #5
    //   214: aconst_null
    //   215: invokevirtual L : (Lkk;IJLjava/lang/Object;)Ljava/lang/Object;
    //   218: astore_1
    //   219: aload_1
    //   220: getstatic nh.m : Lf1;
    //   223: if_acmpeq -> 297
    //   226: aload_1
    //   227: getstatic nh.o : Lf1;
    //   230: if_acmpne -> 253
    //   233: lload #5
    //   235: aload #10
    //   237: invokevirtual t : ()J
    //   240: lcmp
    //   241: ifge -> 248
    //   244: aload_0
    //   245: invokevirtual a : ()V
    //   248: aload_0
    //   249: astore_1
    //   250: goto -> 120
    //   253: aload_1
    //   254: getstatic nh.n : Lf1;
    //   257: if_acmpne -> 291
    //   260: aload #9
    //   262: iconst_1
    //   263: putfield h : I
    //   266: aload #10
    //   268: aload_0
    //   269: iload_2
    //   270: lload #5
    //   272: aload #9
    //   274: invokevirtual F : (Lkk;IJLds;)Ljava/lang/Object;
    //   277: astore_1
    //   278: getstatic ys.b : Lys;
    //   281: astore_0
    //   282: aload_1
    //   283: aload_0
    //   284: if_acmpne -> 289
    //   287: aload_0
    //   288: areturn
    //   289: aload_1
    //   290: areturn
    //   291: aload_0
    //   292: invokevirtual a : ()V
    //   295: aload_1
    //   296: areturn
    //   297: ldc 'unexpected'
    //   299: invokestatic f : (Ljava/lang/String;)V
    //   302: aconst_null
    //   303: areturn
  }
  
  public static Object H(lh paramlh, Object paramObject, cs paramcs) {
    AtomicReferenceFieldUpdater<Object, kk> atomicReferenceFieldUpdater = h;
    atomicReferenceFieldUpdater.getClass();
    for (Object<lh> object = (Object<lh>)oi.a.getObjectVolatile(paramlh, q);; object = SYNTHETIC_LOCAL_VARIABLE_14) {
      Object object1;
      AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = c;
      long l2 = atomicLongFieldUpdater.getAndIncrement(paramlh);
      long l1 = l2 & 0xFFFFFFFFFFFFFFFL;
      boolean bool = paramlh.y(l2, false);
      int j = nh.b;
      long l3 = j;
      l2 = l1 / l3;
      int i = (int)(l1 % l3);
      l3 = ((ek1)object).e;
      ys ys = ys.b;
      l02 l02 = l02.a;
      Object<lh> object2 = object;
      if (l3 != l2) {
        object2 = (Object<lh>)paramlh.q(l2, (kk)object);
        if (object2 == null) {
          if (bool) {
            object1 = paramlh.D(paramcs, paramObject);
            if (object1 == ys)
              return object1; 
            continue;
          } 
          continue;
        } 
      } 
      int k = d((lh)object1, (kk)object2, i, paramObject, l1, null, bool);
      if (k != 0) {
        if (k != 1) {
          Object<lh> object3;
          AtomicLongFieldUpdater<lh> atomicLongFieldUpdater1;
          if (k != 2) {
            AtomicLongFieldUpdater<Object> atomicLongFieldUpdater2 = e;
            if (k != 3) {
              if (k != 4) {
                if (k != 5)
                  continue; 
                object2.a();
                object = object2;
                continue;
              } 
              if (l1 < atomicLongFieldUpdater2.get(object1))
                object2.a(); 
              object1 = object1.D(paramcs, paramObject);
              if (object1 == ys)
                return object1; 
            } else {
              ni ni = g92.F(dd1.N(paramcs));
              try {
                k = d((lh)object1, (kk)object2, i, paramObject, l1, ni, false);
                if (k != 0) {
                  if (k != 1) {
                    if (k != 2) {
                      if (k != 4) {
                        if (k == 5) {
                          object2.a();
                          object2 = (Object<lh>)atomicReferenceFieldUpdater.get(object1);
                          ys ys1 = ys;
                          atomicLongFieldUpdater1 = atomicLongFieldUpdater;
                          while (true) {
                            l2 = atomicLongFieldUpdater1.getAndIncrement(object1);
                            l1 = l2 & 0xFFFFFFFFFFFFFFFL;
                            bool = object1.y(l2, false);
                            j = nh.b;
                            l3 = j;
                            l2 = l1 / l3;
                            k = (int)(l1 % l3);
                            object = object2;
                            object2 = object;
                          } 
                        } else {
                          object1 = new IllegalStateException();
                          super("unexpected");
                          throw object1;
                        } 
                      } else {
                        AtomicLongFieldUpdater<lh> atomicLongFieldUpdater3 = atomicLongFieldUpdater1;
                        atomicLongFieldUpdater1 = atomicLongFieldUpdater3;
                        if (l1 < atomicLongFieldUpdater2.get(object1)) {
                          object2.a();
                          atomicLongFieldUpdater1 = atomicLongFieldUpdater3;
                        } 
                        a((lh)object1, paramObject, ni);
                        atomicLongFieldUpdater3 = atomicLongFieldUpdater1;
                      } 
                    } else {
                      AtomicLongFieldUpdater<lh> atomicLongFieldUpdater3 = atomicLongFieldUpdater1;
                      ni.a((ek1)object2, i + j);
                    } 
                  } else {
                    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater3 = atomicLongFieldUpdater1;
                    ni.f(l02);
                  } 
                } else {
                  object2.a();
                  object2 = (Object<lh>)atomicLongFieldUpdater1;
                  ni.f(l02);
                  object3 = object2;
                } 
              } finally {}
              object1 = ni.v();
              if (object1 != object3)
                object1 = l02; 
              if (object1 == object3)
                return object1; 
            } 
          } else if (bool) {
            object2.m();
            object1 = object1.D((cs)object3, paramObject);
            if (object1 == atomicLongFieldUpdater1)
              return object1; 
          } 
          return l02;
        } 
        continue;
      } 
      object2.a();
      return l02;
    } 
  }
  
  public static boolean J(Object paramObject) {
    if (paramObject instanceof li)
      return nh.a((li)paramObject, l02.a, null); 
    tp.k("Unexpected waiter: ", paramObject);
    return false;
  }
  
  public static final void a(lh paramlh, Object paramObject, ni paramni) {
    paramni.f(new qg1(paramlh.s()));
  }
  
  public static final int d(lh paramlh, kk paramkk, int paramInt, Object paramObject1, long paramLong, Object paramObject2, boolean paramBoolean) {
    f1 f1;
    paramkk.r(paramInt, paramObject1);
    if (paramBoolean)
      return paramlh.M(paramkk, paramInt, paramObject1, paramLong, paramObject2, paramBoolean); 
    Object object = paramkk.p(paramInt);
    if (object == null) {
      if (paramlh.e(paramLong)) {
        if (paramkk.o(paramInt, null, nh.d))
          return 1; 
      } else {
        if (paramObject2 == null)
          return 3; 
        if (paramkk.o(paramInt, null, paramObject2))
          return 2; 
      } 
    } else if (object instanceof e52) {
      paramkk.r(paramInt, null);
      if (paramlh.I(object, paramObject1)) {
        paramkk.s(paramInt, nh.i);
        return 0;
      } 
      f1 = nh.k;
      if (paramkk.h.getAndSet(paramInt * 2 + 1, f1) != f1)
        paramkk.q(paramInt, true); 
      return 5;
    } 
    return f1.M(paramkk, paramInt, paramObject1, paramLong, paramObject2, paramBoolean);
  }
  
  public static void v(lh paramlh) {
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = g;
    if ((atomicLongFieldUpdater.addAndGet(paramlh, 1L) & 0x4000000000000000L) != 0L)
      while ((atomicLongFieldUpdater.get(paramlh) & 0x4000000000000000L) != 0L); 
  }
  
  public boolean A() {
    return false;
  }
  
  public final boolean B() {
    long l = f.get(this);
    return (l == 0L || l == Long.MAX_VALUE);
  }
  
  public final void C(long paramLong, kk paramkk) {
    kk kk1;
    lh lh1;
    while (true) {
      lh1 = this;
      kk1 = paramkk;
      if (paramkk.e < paramLong) {
        kk1 = (kk)paramkk.c();
        if (kk1 == null) {
          lh1 = this;
          kk1 = paramkk;
          break;
        } 
        paramkk = kk1;
        continue;
      } 
      break;
    } 
    label42: while (true) {
      lh lh2;
      lh lh3;
      paramkk = kk1;
      while (true) {
        lh3 = lh1;
        if (paramkk.f()) {
          kk kk2 = (kk)paramkk.c();
          if (kk2 == null) {
            lh3 = lh1;
            break;
          } 
          lh2 = lh3;
          continue;
        } 
        break;
      } 
      while (true) {
        j.getClass();
        Unsafe unsafe = oi.a;
        paramLong = n;
        ek1 ek1 = (ek1)unsafe.getObjectVolatile(lh3, paramLong);
        if (ek1.e >= ((ek1)lh2).e)
          continue; 
        lh lh4 = lh3;
        if (!lh2.n()) {
          lh4 = lh3;
          lh3 = lh2;
          continue label42;
        } 
        while (true) {
          Unsafe unsafe1 = oi.a;
          if (unsafe1.compareAndSwapObject(lh4, n, ek1, lh2)) {
            if (ek1.j())
              ek1.h(); 
            return;
          } 
          if (unsafe1.getObjectVolatile(lh4, paramLong) != ek1) {
            if (lh2.j())
              lh2.h(); 
            break;
          } 
        } 
        lh3 = lh4;
      } 
      break;
    } 
  }
  
  public final Object D(cs paramcs, Object paramObject) {
    paramcs = new ni(1, dd1.N(paramcs));
    paramcs.x();
    paramcs.f(new qg1(s()));
    Object object = paramcs.v();
    return (object == ys.b) ? object : l02.a;
  }
  
  public final Object F(kk paramkk, int paramInt, long paramLong, ds paramds) {
    // Byte code:
    //   0: aload #5
    //   2: instanceof kh
    //   5: ifeq -> 47
    //   8: aload #5
    //   10: checkcast kh
    //   13: astore #11
    //   15: aload #11
    //   17: getfield h : I
    //   20: istore #6
    //   22: iload #6
    //   24: ldc -2147483648
    //   26: iand
    //   27: ifeq -> 47
    //   30: aload #11
    //   32: iload #6
    //   34: ldc -2147483648
    //   36: iadd
    //   37: putfield h : I
    //   40: aload #11
    //   42: astore #5
    //   44: goto -> 59
    //   47: new kh
    //   50: dup
    //   51: aload_0
    //   52: aload #5
    //   54: invokespecial <init> : (Llh;Lds;)V
    //   57: astore #5
    //   59: aload #5
    //   61: getfield f : Ljava/lang/Object;
    //   64: astore #11
    //   66: aload #5
    //   68: getfield h : I
    //   71: istore #6
    //   73: iload #6
    //   75: ifeq -> 102
    //   78: iload #6
    //   80: iconst_1
    //   81: if_icmpne -> 95
    //   84: aload #11
    //   86: invokestatic r0 : (Ljava/lang/Object;)V
    //   89: aload #11
    //   91: astore_1
    //   92: goto -> 450
    //   95: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   97: invokestatic f : (Ljava/lang/String;)V
    //   100: aconst_null
    //   101: areturn
    //   102: aload #11
    //   104: invokestatic r0 : (Ljava/lang/Object;)V
    //   107: aload #5
    //   109: iconst_1
    //   110: putfield h : I
    //   113: aload #5
    //   115: invokestatic N : (Lcs;)Lcs;
    //   118: invokestatic F : (Lcs;)Lni;
    //   121: astore #11
    //   123: new fd1
    //   126: astore #12
    //   128: aload #12
    //   130: aload #11
    //   132: invokespecial <init> : (Lni;)V
    //   135: aload_0
    //   136: aload_1
    //   137: iload_2
    //   138: lload_3
    //   139: aload #12
    //   141: invokevirtual L : (Lkk;IJLjava/lang/Object;)Ljava/lang/Object;
    //   144: astore #5
    //   146: aload #5
    //   148: getstatic nh.m : Lf1;
    //   151: if_acmpne -> 168
    //   154: aload #12
    //   156: aload_1
    //   157: iload_2
    //   158: invokevirtual a : (Lek1;I)V
    //   161: goto -> 425
    //   164: astore_1
    //   165: goto -> 458
    //   168: aload #5
    //   170: getstatic nh.o : Lf1;
    //   173: if_acmpne -> 408
    //   176: lload_3
    //   177: aload_0
    //   178: invokevirtual t : ()J
    //   181: lcmp
    //   182: ifge -> 189
    //   185: aload_1
    //   186: invokevirtual a : ()V
    //   189: getstatic lh.i : Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   192: aload_0
    //   193: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   196: checkcast kk
    //   199: astore_1
    //   200: aload_0
    //   201: getstatic lh.c : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   204: aload_0
    //   205: invokevirtual get : (Ljava/lang/Object;)J
    //   208: iconst_1
    //   209: invokevirtual y : (JZ)Z
    //   212: ifeq -> 252
    //   215: aload_0
    //   216: invokevirtual r : ()Ljava/lang/Throwable;
    //   219: astore #5
    //   221: new hk
    //   224: astore_1
    //   225: aload_1
    //   226: aload #5
    //   228: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   231: new jk
    //   234: astore #5
    //   236: aload #5
    //   238: aload_1
    //   239: invokespecial <init> : (Ljava/lang/Object;)V
    //   242: aload #11
    //   244: aload #5
    //   246: invokevirtual f : (Ljava/lang/Object;)V
    //   249: goto -> 425
    //   252: getstatic lh.e : Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   255: aload_0
    //   256: invokevirtual getAndIncrement : (Ljava/lang/Object;)J
    //   259: lstore_3
    //   260: getstatic nh.b : I
    //   263: i2l
    //   264: lstore #9
    //   266: lload_3
    //   267: lload #9
    //   269: ldiv
    //   270: lstore #7
    //   272: lload_3
    //   273: lload #9
    //   275: lrem
    //   276: l2i
    //   277: istore_2
    //   278: aload_1
    //   279: getfield e : J
    //   282: lload #7
    //   284: lcmp
    //   285: ifeq -> 311
    //   288: aload_0
    //   289: lload #7
    //   291: aload_1
    //   292: invokevirtual o : (JLkk;)Lkk;
    //   295: astore #5
    //   297: aload #5
    //   299: ifnonnull -> 305
    //   302: goto -> 200
    //   305: aload #5
    //   307: astore_1
    //   308: goto -> 311
    //   311: aload_0
    //   312: aload_1
    //   313: iload_2
    //   314: lload_3
    //   315: aload #12
    //   317: invokevirtual L : (Lkk;IJLjava/lang/Object;)Ljava/lang/Object;
    //   320: astore #5
    //   322: aload #5
    //   324: getstatic nh.m : Lf1;
    //   327: if_acmpne -> 340
    //   330: aload #12
    //   332: aload_1
    //   333: iload_2
    //   334: invokevirtual a : (Lek1;I)V
    //   337: goto -> 425
    //   340: aload #5
    //   342: getstatic nh.o : Lf1;
    //   345: if_acmpne -> 364
    //   348: lload_3
    //   349: aload_0
    //   350: invokevirtual t : ()J
    //   353: lcmp
    //   354: ifge -> 361
    //   357: aload_1
    //   358: invokevirtual a : ()V
    //   361: goto -> 200
    //   364: aload #5
    //   366: getstatic nh.n : Lf1;
    //   369: if_acmpeq -> 396
    //   372: aload_1
    //   373: invokevirtual a : ()V
    //   376: new jk
    //   379: astore_1
    //   380: aload_1
    //   381: aload #5
    //   383: invokespecial <init> : (Ljava/lang/Object;)V
    //   386: aload #11
    //   388: aload_1
    //   389: aconst_null
    //   390: invokevirtual i : (Ljava/lang/Object;Lbd0;)V
    //   393: goto -> 425
    //   396: new java/lang/IllegalStateException
    //   399: astore_1
    //   400: aload_1
    //   401: ldc 'unexpected'
    //   403: invokespecial <init> : (Ljava/lang/String;)V
    //   406: aload_1
    //   407: athrow
    //   408: aload_1
    //   409: invokevirtual a : ()V
    //   412: new jk
    //   415: dup
    //   416: aload #5
    //   418: invokespecial <init> : (Ljava/lang/Object;)V
    //   421: astore_1
    //   422: goto -> 386
    //   425: aload #11
    //   427: invokevirtual v : ()Ljava/lang/Object;
    //   430: astore #5
    //   432: getstatic ys.b : Lys;
    //   435: astore #11
    //   437: aload #5
    //   439: astore_1
    //   440: aload #5
    //   442: aload #11
    //   444: if_acmpne -> 450
    //   447: aload #11
    //   449: areturn
    //   450: aload_1
    //   451: checkcast jk
    //   454: getfield a : Ljava/lang/Object;
    //   457: areturn
    //   458: aload #11
    //   460: invokevirtual E : ()V
    //   463: aload_1
    //   464: athrow
    // Exception table:
    //   from	to	target	type
    //   123	161	164	finally
    //   168	189	164	finally
    //   189	200	164	finally
    //   200	249	164	finally
    //   252	272	164	finally
    //   278	297	164	finally
    //   311	337	164	finally
    //   340	361	164	finally
    //   364	386	164	finally
    //   386	393	164	finally
    //   396	408	164	finally
    //   408	422	164	finally
  }
  
  public final void G(e52 parame52, boolean paramBoolean) {
    Throwable throwable;
    ni ni;
    if (parame52 instanceof li) {
      cs cs = (cs)parame52;
      if (paramBoolean) {
        Throwable throwable1 = r();
        throwable = throwable1;
        if (throwable1 == null)
          throwable = new NoSuchElementException("Channel was closed"); 
      } else {
        throwable = s();
      } 
      cs.f(new qg1(throwable));
      return;
    } 
    if (throwable instanceof fd1) {
      ((fd1)throwable).b.f(new jk(new hk(r())));
      return;
    } 
    if (throwable instanceof ih) {
      ih ih = (ih)throwable;
      ni = ih.c;
      ni.getClass();
      ih.c = null;
      ih.b = nh.l;
      Throwable throwable1 = ih.e.r();
      if (throwable1 == null) {
        ni.f(Boolean.FALSE);
        return;
      } 
      ni.f(new qg1(throwable1));
      return;
    } 
    tp.k("Unexpected waiter: ", ni);
  }
  
  public final boolean I(Object paramObject1, Object paramObject2) {
    if (paramObject1 instanceof fd1)
      return nh.a(((fd1)paramObject1).b, new jk(paramObject2), null); 
    if (paramObject1 instanceof ih) {
      paramObject1 = paramObject1;
      ni ni = ((ih)paramObject1).c;
      ni.getClass();
      ((ih)paramObject1).c = null;
      ((ih)paramObject1).b = paramObject2;
      return nh.a(ni, Boolean.TRUE, null);
    } 
    if (paramObject1 instanceof li)
      return nh.a((li)paramObject1, paramObject2, null); 
    tp.k("Unexpected receiver type: ", paramObject1);
    return false;
  }
  
  public final Object K(Object paramObject) {
    f1 f1 = nh.d;
    h.getClass();
    kk kk = (kk)oi.a.getObjectVolatile(this, q);
    Object object = paramObject;
    lh lh1 = this;
    paramObject = kk;
    while (true) {
      long l2 = c.getAndIncrement(lh1);
      long l1 = l2 & 0xFFFFFFFFFFFFFFFL;
      boolean bool = lh1.y(l2, false);
      int j = nh.b;
      long l3 = j;
      l2 = l1 / l3;
      int i = (int)(l1 % l3);
      if (((ek1)paramObject).e != l2) {
        kk = lh1.q(l2, (kk)paramObject);
        if (kk == null) {
          if (bool)
            return new hk(lh1.s()); 
          continue;
        } 
        paramObject = kk;
      } 
      int k = d(lh1, (kk)paramObject, i, object, l1, f1, bool);
      l02 l02 = l02.a;
      if (k != 0) {
        if (k != 1) {
          kk = null;
          if (k != 2) {
            if (k != 3) {
              if (k != 4) {
                if (k != 5)
                  continue; 
                paramObject.a();
                continue;
              } 
              if (l1 < e.get(lh1))
                paramObject.a(); 
              return new hk(lh1.s());
            } 
            tp.f("unexpected");
            return null;
          } 
          if (bool) {
            paramObject.m();
            return new hk(lh1.s());
          } 
          object = kk;
          if (f1 instanceof e52)
            object = f1; 
          if (object != null)
            object.a((ek1)paramObject, i + j); 
          lh1.j(((ek1)paramObject).e * l3 + i);
          return l02;
        } 
        continue;
      } 
      paramObject.a();
      return l02;
    } 
  }
  
  public final Object L(kk paramkk, int paramInt, long paramLong, Object paramObject) {
    Object object = paramkk.p(paramInt);
    AtomicReferenceArray atomicReferenceArray = paramkk.h;
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = c;
    if (object == null) {
      if (paramLong >= (atomicLongFieldUpdater.get(this) & 0xFFFFFFFFFFFFFFFL)) {
        if (paramObject == null)
          return nh.n; 
        if (paramkk.o(paramInt, object, paramObject)) {
          k();
          return nh.m;
        } 
      } 
    } else if (object == nh.d && paramkk.o(paramInt, object, nh.i)) {
      k();
      paramObject = atomicReferenceArray.get(paramInt * 2);
      paramkk.r(paramInt, null);
      return paramObject;
    } 
    while (true) {
      object = paramkk.p(paramInt);
      if (object == null || object == nh.e) {
        if (paramLong < (atomicLongFieldUpdater.get(this) & 0xFFFFFFFFFFFFFFFL)) {
          if (paramkk.o(paramInt, object, nh.h)) {
            k();
            return nh.o;
          } 
          continue;
        } 
        if (paramObject == null)
          return nh.n; 
        if (paramkk.o(paramInt, object, paramObject)) {
          k();
          return nh.m;
        } 
        continue;
      } 
      if (object == nh.d) {
        if (paramkk.o(paramInt, object, nh.i)) {
          k();
          paramObject = atomicReferenceArray.get(paramInt * 2);
          paramkk.r(paramInt, null);
          return paramObject;
        } 
        continue;
      } 
      f1 f1 = nh.j;
      if (object == f1)
        return nh.o; 
      if (object == nh.h)
        return nh.o; 
      if (object == nh.l) {
        k();
        return nh.o;
      } 
      if (object != nh.g && paramkk.o(paramInt, object, nh.f)) {
        boolean bool = object instanceof f52;
        paramObject = object;
        if (bool)
          paramObject = ((f52)object).a; 
        if (J(paramObject)) {
          paramkk.s(paramInt, nh.i);
          k();
          paramObject = atomicReferenceArray.get(paramInt * 2);
          paramkk.r(paramInt, null);
          return paramObject;
        } 
        paramkk.s(paramInt, f1);
        paramkk.m();
        if (bool)
          k(); 
        return nh.o;
      } 
    } 
  }
  
  public final int M(kk paramkk, int paramInt, Object paramObject1, long paramLong, Object paramObject2, boolean paramBoolean) {
    while (true) {
      Object object = paramkk.p(paramInt);
      if (object == null) {
        if (e(paramLong) && !paramBoolean) {
          if (paramkk.o(paramInt, null, nh.d))
            return 1; 
          continue;
        } 
        if (paramBoolean) {
          if (paramkk.o(paramInt, null, nh.j)) {
            paramkk.m();
            return 4;
          } 
          continue;
        } 
        if (paramObject2 == null)
          return 3; 
        if (paramkk.o(paramInt, null, paramObject2))
          return 2; 
        continue;
      } 
      if (object == nh.e) {
        if (paramkk.o(paramInt, object, nh.d))
          continue; 
        continue;
      } 
      f1 f1 = nh.k;
      if (object == f1) {
        paramkk.r(paramInt, null);
        return 5;
      } 
      if (object == nh.h) {
        paramkk.r(paramInt, null);
        return 5;
      } 
      if (object == nh.l) {
        paramkk.r(paramInt, null);
        z();
        return 4;
      } 
      paramkk.r(paramInt, null);
      paramObject2 = object;
      if (object instanceof f52)
        paramObject2 = ((f52)object).a; 
      if (I(paramObject2, paramObject1)) {
        paramkk.s(paramInt, nh.i);
        return 0;
      } 
      if (paramkk.h.getAndSet(paramInt * 2 + 1, f1) != f1)
        paramkk.q(paramInt, true); 
      return 5;
    } 
  }
  
  public final void N(long paramLong) {
    if (!B())
      while (true) {
        AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = f;
        if (atomicLongFieldUpdater.get(this) > paramLong) {
          int i = nh.c;
          byte b = 0;
          while (true) {
            AtomicLongFieldUpdater<lh> atomicLongFieldUpdater1 = g;
            if (b < i) {
              paramLong = atomicLongFieldUpdater.get(this);
              if (paramLong == (0x3FFFFFFFFFFFFFFFL & atomicLongFieldUpdater1.get(this)) && paramLong == atomicLongFieldUpdater.get(this))
                break; 
              b++;
              continue;
            } 
            do {
              paramLong = atomicLongFieldUpdater1.get(this);
            } while (!atomicLongFieldUpdater1.compareAndSet(this, paramLong, (paramLong & 0x3FFFFFFFFFFFFFFFL) + 4611686018427387904L));
            while (true) {
              long l1 = atomicLongFieldUpdater.get(this);
              paramLong = atomicLongFieldUpdater1.get(this);
              long l2 = paramLong & 0x3FFFFFFFFFFFFFFFL;
              if ((paramLong & 0x4000000000000000L) != 0L) {
                b = 1;
              } else {
                b = 0;
              } 
              if (l1 == l2 && l1 == atomicLongFieldUpdater.get(this)) {
                do {
                  paramLong = atomicLongFieldUpdater1.get(this);
                } while (!atomicLongFieldUpdater1.compareAndSet(this, paramLong, paramLong & 0x3FFFFFFFFFFFFFFFL));
                return;
              } 
              if (b == 0)
                atomicLongFieldUpdater1.compareAndSet(this, paramLong, 4611686018427387904L + l2); 
            } 
          } 
          break;
        } 
      }  
  }
  
  public Object b(cs paramcs, Object paramObject) {
    return H(this, paramObject, paramcs);
  }
  
  public final void c(CancellationException paramCancellationException) {
    CancellationException cancellationException = paramCancellationException;
    if (paramCancellationException == null)
      cancellationException = new CancellationException("Channel was cancelled"); 
    h(cancellationException, true);
  }
  
  public final boolean e(long paramLong) {
    return (paramLong < f.get(this) || paramLong < e.get(this) + this.b);
  }
  
  public final boolean f(Throwable paramThrowable) {
    return h(paramThrowable, false);
  }
  
  public final kk g() {
    j.getClass();
    Unsafe unsafe = oi.a;
    Object object3 = unsafe.getObjectVolatile(this, n);
    h.getClass();
    kk kk = (kk)unsafe.getObjectVolatile(this, q);
    Object object1 = object3;
    if (kk.e > ((kk)object3).e)
      object1 = kk; 
    i.getClass();
    object3 = unsafe.getObjectVolatile(this, p);
    Object object2 = object1;
    if (((ek1)object3).e > ((kk)object1).e)
      object2 = object3; 
    for (object1 = object2;; object1 = object2) {
      object2 = gp.a;
      object2 = object1.d();
      if (object2 == zo2.b)
        return (kk)object1; 
      object2 = object2;
      if (object2 == null) {
        if (object1.g())
          return (kk)object1; 
        continue;
      } 
    } 
  }
  
  public final boolean h(Throwable paramThrowable, boolean paramBoolean) {
    boolean bool;
    kk kk1;
    kk kk2;
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = c;
    lh lh1 = this;
    if (paramBoolean) {
      lh lh2 = this;
      while (true) {
        long l = atomicLongFieldUpdater.get(lh2);
        lh1 = lh2;
        if ((int)(l >> 60L) == 0) {
          kk2 = nh.a;
          if (atomicLongFieldUpdater.compareAndSet(lh2, l, (l & 0xFFFFFFFFFFFFFFFL) + 1152921504606846976L))
            break; 
          continue;
        } 
        // Byte code: goto -> 70
      } 
    } else {
      kk1 = kk2;
    } 
    f1 f1 = nh.s;
    while (true) {
      k.getClass();
      Unsafe unsafe = oi.a;
      long l = m;
      bool = unsafe.compareAndSwapObject(kk1, l, f1, paramThrowable);
      if (bool) {
        bool = true;
        break;
      } 
      if (unsafe.getObjectVolatile(kk1, l) != f1) {
        bool = false;
        break;
      } 
    } 
    if (paramBoolean) {
      long l;
      do {
        l = atomicLongFieldUpdater.get(kk1);
      } while (!atomicLongFieldUpdater.compareAndSet(kk1, l, 3458764513820540928L + (l & 0xFFFFFFFFFFFFFFFL)));
    } else {
      long l1;
      long l2;
      do {
        l2 = atomicLongFieldUpdater.get(kk1);
        int i = (int)(l2 >> 60L);
        if (i != 0) {
          if (i != 1)
            break; 
          l1 = (l2 & 0xFFFFFFFFFFFFFFFL) + 3458764513820540928L;
        } else {
          l1 = (l2 & 0xFFFFFFFFFFFFFFFL) + 2305843009213693952L;
        } 
      } while (!atomicLongFieldUpdater.compareAndSet(kk1, l2, l1));
    } 
    kk1.z();
    if (bool)
      kk1.w(); 
    return bool;
  }
  
  public final kk i(long paramLong) {
    long l;
    kk kk = g();
    if (A()) {
      kk kk1 = kk;
      label66: while (true) {
        for (int i = nh.b - 1; -1 < i; i--) {
          l = kk1.e * nh.b + i;
          if (l < e.get(this)) {
            l = -1L;
            continue label66;
          } 
          while (true) {
            Object object;
            while (true) {
              object = kk1.p(i);
              break;
            } 
            if (kk1.o(i, object, nh.l)) {
              kk1.m();
              break;
            } 
          } 
        } 
        kk kk2 = (kk)kk1.e();
        kk1 = kk2;
        if (kk2 == null)
          continue; 
      } 
    } else {
      Object object2;
      Object object1 = null;
      kk kk1 = kk;
      label70: while (true) {
        object2 = object1;
        if (kk1 != null) {
          int i = nh.b - 1;
          while (-1 < i) {
            object2 = object1;
            if (kk1.e * nh.b + i >= paramLong) {
              while (true) {
                Object object = kk1.p(i);
                if (object == null || object == nh.e) {
                  if (kk1.o(i, object, nh.l)) {
                    kk1.m();
                    object2 = object1;
                    break;
                  } 
                  continue;
                } 
                if (object instanceof f52) {
                  if (kk1.o(i, object, nh.l)) {
                    object2 = z51.D(object1, ((f52)object).a);
                    kk1.q(i, true);
                    break;
                  } 
                  continue;
                } 
                object2 = object1;
                if (object instanceof e52) {
                  if (kk1.o(i, object, nh.l)) {
                    object2 = z51.D(object1, object);
                    kk1.q(i, true);
                    break;
                  } 
                  continue;
                } 
                break;
              } 
              i--;
              object1 = object2;
              continue;
            } 
            break label70;
          } 
          kk1 = (kk)kk1.e();
          continue;
        } 
        break;
      } 
      if (object2 != null) {
        if (!(object2 instanceof ArrayList)) {
          G((e52)object2, true);
          return kk;
        } 
        object1 = object2;
        for (int i = object1.size() - 1; -1 < i; i--)
          G(object1.get(i), true); 
      } 
      return kk;
    } 
    if (l != -1L) {
      j(l);
      // Byte code: goto -> 161
    } 
    // Byte code: goto -> 161
  }
  
  public final ih iterator() {
    return new ih(this);
  }
  
  public final void j(long paramLong) {
    i.getClass();
    kk kk = (kk)oi.a.getObjectVolatile(this, p);
    lh lh1 = this;
    while (true) {
      AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = e;
      long l = atomicLongFieldUpdater.get(lh1);
      if (paramLong < Math.max(lh1.b + l, f.get(lh1)))
        return; 
      if (atomicLongFieldUpdater.compareAndSet(lh1, l, 1L + l)) {
        long l2 = nh.b;
        long l1 = l / l2;
        int i = (int)(l % l2);
        kk kk1 = kk;
        if (kk.e != l1) {
          kk1 = lh1.o(l1, kk);
          if (kk1 == null)
            continue; 
        } 
        if (lh1.L(kk1, i, l, null) == nh.o) {
          if (l < lh1.t())
            kk1.a(); 
        } else {
          kk1.a();
        } 
        kk = kk1;
      } 
    } 
  }
  
  public final void k() {
    if (B())
      return; 
    j.getClass();
    kk kk = (kk)oi.a.getObjectVolatile(this, n);
    lh lh1 = this;
    label61: while (true) {
      long l3 = f.getAndIncrement(lh1);
      long l2 = nh.b;
      long l1 = l3 / l2;
      if (lh1.t() <= l3) {
        if (kk.e < l1 && kk.c() != null)
          lh1.C(l1, kk); 
        v(lh1);
        return;
      } 
      kk kk1 = kk;
      if (kk.e != l1) {
        kk1 = lh1.l(l1, kk, l3);
        if (kk1 == null) {
          kk1 = kk;
          continue;
        } 
      } 
      int i = (int)(l3 % l2);
      Object object = kk1.p(i);
      boolean bool = object instanceof e52;
      AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = e;
      if (bool && l3 >= atomicLongFieldUpdater.get(lh1) && kk1.o(i, object, nh.g)) {
        if (J(object)) {
          kk1.s(i, nh.d);
          break;
        } 
        kk1.s(i, nh.j);
        kk1.m();
        continue;
      } 
      while (true) {
        object = kk1.p(i);
        if (object instanceof e52) {
          if (l3 < atomicLongFieldUpdater.get(lh1)) {
            if (kk1.o(i, object, new f52((e52)object)))
              break; 
            continue;
          } 
          if (kk1.o(i, object, nh.g)) {
            if (J(object)) {
              kk1.s(i, nh.d);
              break;
            } 
            kk1.s(i, nh.j);
            kk1.m();
          } else {
            continue;
          } 
        } else if (object != nh.j) {
          if (object == null) {
            if (kk1.o(i, object, nh.e))
              break; 
            continue;
          } 
          if (object == nh.d || object == nh.h || object == nh.i || object == nh.k || object == nh.l)
            break; 
          if (object == nh.f)
            continue; 
          tp.k("Unexpected cell state: ", object);
          return;
        } 
        v(lh1);
        kk kk2 = kk1;
        continue label61;
      } 
      break;
    } 
    v(lh1);
  }
  
  public final kk l(long paramLong1, kk paramkk, long paramLong2) {
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater;
    Object object;
    kk kk1 = nh.a;
    mh mh = mh.j;
    label36: while (true) {
      object = zo2.n(paramkk, paramLong1, mh);
      if (!g92.N(object)) {
        ek1 ek1 = g92.H(object);
        while (true) {
          j.getClass();
          Unsafe unsafe = oi.a;
          long l1 = n;
          ek1 ek11 = (ek1)unsafe.getObjectVolatile(this, l1);
          if (ek11.e >= ek1.e)
            break; 
          if (!ek1.n())
            continue label36; 
          while (true) {
            unsafe = oi.a;
            if (unsafe.compareAndSwapObject(this, n, ek11, ek1)) {
              if (ek11.j())
                ek11.h(); 
              break;
            } 
            if (unsafe.getObjectVolatile(this, l1) != ek11 && ek1.j())
              ek1.h(); 
          } 
          break;
        } 
      } 
      break;
    } 
    if (g92.N(object)) {
      z();
      C(paramLong1, paramkk);
      v(this);
      return null;
    } 
    paramkk = (kk)g92.H(object);
    long l = paramkk.e;
    if (l > paramLong1) {
      paramLong1 = l * nh.b;
      if (f.compareAndSet(this, paramLong2 + 1L, paramLong1)) {
        atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(this, paramLong1 - paramLong2) & 0x4000000000000000L) != 0L)
          while ((atomicLongFieldUpdater.get(this) & 0x4000000000000000L) != 0L); 
        return null;
      } 
      v(this);
      return null;
    } 
    return (kk)atomicLongFieldUpdater;
  }
  
  public final Object m() {
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater1 = e;
    long l2 = atomicLongFieldUpdater1.get(this);
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater2 = c;
    long l1 = atomicLongFieldUpdater2.get(this);
    if (y(l1, true))
      return new hk(r()); 
    ik ik = jk.b;
    if (l2 >= (l1 & 0xFFFFFFFFFFFFFFFL))
      return ik; 
    f1 f1 = nh.k;
    i.getClass();
    kk kk = (kk)oi.a.getObjectVolatile(this, p);
    lh lh1 = this;
    while (true) {
      if (lh1.y(atomicLongFieldUpdater2.get(lh1), true))
        return new hk(lh1.r()); 
      long l = atomicLongFieldUpdater1.getAndIncrement(lh1);
      l1 = nh.b;
      l2 = l / l1;
      int i = (int)(l % l1);
      if (kk.e != l2) {
        kk kk1 = lh1.o(l2, kk);
        if (kk1 == null)
          continue; 
        kk = kk1;
      } 
      Object object = lh1.L(kk, i, l, f1);
      f1 f11 = nh.m;
      e52 e52 = null;
      if (object == f11) {
        if (f1 instanceof e52)
          e52 = (e52)f1; 
        if (e52 != null)
          e52.a(kk, i); 
        lh1.N(l);
        kk.m();
        return ik;
      } 
      if (object == nh.o) {
        if (l < lh1.t())
          kk.a(); 
        continue;
      } 
      if (object != nh.n) {
        kk.a();
        return object;
      } 
      tp.f("unexpected");
      return null;
    } 
  }
  
  public Object n(Object paramObject) {
    int i;
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = c;
    long l = atomicLongFieldUpdater.get(this);
    if (y(l, false)) {
      i = 0;
    } else {
      i = e(l & 0xFFFFFFFFFFFFFFFL) ^ true;
    } 
    ik ik = jk.b;
    if (i != 0)
      return ik; 
    f1 f1 = nh.j;
    h.getClass();
    for (Object object = oi.a.getObjectVolatile(this, q);; object = SYNTHETIC_LOCAL_VARIABLE_12) {
      long l1 = atomicLongFieldUpdater.getAndIncrement(this);
      l = l1 & 0xFFFFFFFFFFFFFFFL;
      boolean bool = y(l1, false);
      int j = nh.b;
      l1 = j;
      long l2 = l / l1;
      int k = (int)(l % l1);
      Object object1 = object;
      if (((ek1)object).e != l2) {
        object1 = q(l2, (kk)object);
        if (object1 == null) {
          if (bool)
            return new hk(s()); 
          object1 = object;
          continue;
        } 
      } 
      i = d(this, (kk)object1, k, paramObject, l, f1, bool);
      object = l02.a;
      if (i != 0) {
        if (i != 1) {
          object = null;
          if (i != 2) {
            if (i != 3) {
              if (i != 4) {
                if (i == 5)
                  object1.a(); 
              } else {
                if (l < e.get(this))
                  object1.a(); 
                return new hk(s());
              } 
            } else {
              tp.f("unexpected");
              return null;
            } 
          } else {
            if (bool) {
              object1.m();
              return new hk(s());
            } 
            paramObject = object;
            if (f1 instanceof e52)
              paramObject = f1; 
            if (paramObject != null)
              paramObject.a((ek1)object1, k + j); 
            object1.m();
            return ik;
          } 
        } else {
          return object;
        } 
      } else {
        object1.a();
        return object;
      } 
      continue;
    } 
  }
  
  public final kk o(long paramLong, kk paramkk) {
    Object object;
    kk kk1 = nh.a;
    mh mh = mh.j;
    label58: while (true) {
      object = zo2.n(paramkk, paramLong, mh);
      if (!g92.N(object)) {
        ek1 ek1 = g92.H(object);
        while (true) {
          i.getClass();
          Unsafe unsafe = oi.a;
          long l = p;
          ek1 ek11 = (ek1)unsafe.getObjectVolatile(this, l);
          if (ek11.e >= ek1.e)
            break; 
          if (!ek1.n())
            continue label58; 
          while (true) {
            unsafe = oi.a;
            if (unsafe.compareAndSwapObject(this, p, ek11, ek1)) {
              if (ek11.j())
                ek11.h(); 
              break;
            } 
            if (unsafe.getObjectVolatile(this, l) != ek11 && ek1.j())
              ek1.h(); 
          } 
          break;
        } 
      } 
      break;
    } 
    if (g92.N(object)) {
      z();
      if (paramkk.e * nh.b < t()) {
        paramkk.a();
        return null;
      } 
    } else {
      kk kk2;
      paramkk = (kk)g92.H(object);
      long l = paramkk.e;
      kk1 = paramkk;
      if (!B()) {
        kk1 = paramkk;
        if (paramLong <= f.get(this) / nh.b)
          while (true) {
            j.getClass();
            Unsafe unsafe = oi.a;
            long l1 = n;
            object = unsafe.getObjectVolatile(this, l1);
            kk2 = paramkk;
            if (((ek1)object).e < l) {
              kk2 = paramkk;
              if (paramkk.n())
                while (true) {
                  Unsafe unsafe1 = oi.a;
                  boolean bool = unsafe1.compareAndSwapObject(this, n, object, paramkk);
                  if (bool) {
                    kk2 = paramkk;
                    if (object.j()) {
                      object.h();
                      kk2 = paramkk;
                    } 
                    break;
                  } 
                  if (kk2.getObjectVolatile(this, l1) != object && paramkk.j())
                    paramkk.h(); 
                }  
            } 
            break;
          }  
      } 
      if (l > paramLong) {
        long l1;
        paramLong = l * nh.b;
        do {
          l1 = e.get(this);
        } while (l1 < paramLong && !e.compareAndSet(this, l1, paramLong));
        if (l * nh.b < t())
          kk2.a(); 
        return null;
      } 
      return kk2;
    } 
    return null;
  }
  
  public final Object p(nn paramnn) {
    return E(this, paramnn);
  }
  
  public final kk q(long paramLong, kk paramkk) {
    Object object = nh.a;
    mh mh = mh.j;
    label40: while (true) {
      object = zo2.n(paramkk, paramLong, mh);
      if (!g92.N(object)) {
        ek1 ek1 = g92.H(object);
        while (true) {
          h.getClass();
          Unsafe unsafe = oi.a;
          long l = q;
          ek1 ek11 = (ek1)unsafe.getObjectVolatile(this, l);
          if (ek11.e >= ek1.e)
            break; 
          if (!ek1.n())
            continue label40; 
          while (true) {
            unsafe = oi.a;
            if (unsafe.compareAndSwapObject(this, q, ek11, ek1)) {
              if (ek11.j())
                ek11.h(); 
              break;
            } 
            if (unsafe.getObjectVolatile(this, l) != ek11 && ek1.j())
              ek1.h(); 
          } 
          break;
        } 
      } 
      break;
    } 
    boolean bool = g92.N(object);
    AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = e;
    if (bool) {
      z();
      if (paramkk.e * nh.b < atomicLongFieldUpdater.get(this)) {
        paramkk.a();
        return null;
      } 
    } else {
      paramkk = (kk)g92.H(object);
      long l = paramkk.e;
      if (l > paramLong) {
        long l2;
        long l3;
        long l1 = nh.b;
        do {
          l3 = c.get(this);
          paramLong = 0xFFFFFFFFFFFFFFFL & l3;
          if (paramLong >= l * l1)
            break; 
          l2 = (int)(l3 >> 60L);
        } while (!c.compareAndSet(this, l3, paramLong + (l2 << 60L)));
        if (l * nh.b < atomicLongFieldUpdater.get(this))
          paramkk.a(); 
        return null;
      } 
      return paramkk;
    } 
    return null;
  }
  
  public final Throwable r() {
    k.getClass();
    return (Throwable)oi.a.getObjectVolatile(this, m);
  }
  
  public final Throwable s() {
    Throwable throwable2 = r();
    Throwable throwable1 = throwable2;
    if (throwable2 == null)
      throwable1 = new IllegalStateException("Channel was closed"); 
    return throwable1;
  }
  
  public final long t() {
    return c.get(this) & 0xFFFFFFFFFFFFFFFL;
  }
  
  public final String toString() {
    StringBuilder stringBuilder2 = new StringBuilder();
    int i = (int)(c.get(this) >> 60L);
    if (i != 2) {
      if (i == 3)
        stringBuilder2.append("cancelled,"); 
    } else {
      stringBuilder2.append("closed,");
    } 
    StringBuilder stringBuilder1 = new StringBuilder("capacity=");
    stringBuilder1.append(this.b);
    stringBuilder1.append(',');
    stringBuilder2.append(stringBuilder1.toString());
    stringBuilder2.append("data=[");
    i.getClass();
    Unsafe unsafe = oi.a;
    object2 = unsafe.getObjectVolatile(this, p);
    h.getClass();
    Object object1 = unsafe.getObjectVolatile(this, q);
    i = 1;
    j.getClass();
    List list = om.h0((Object[])new kk[] { (kk)object2, (kk)object1, (kk)unsafe.getObjectVolatile(this, n) });
    object1 = new ArrayList();
    for (Object object2 : list) {
      if ((kk)object2 != nh.a)
        object1.add(object2); 
    } 
    Iterator<List> iterator = object1.iterator();
    if (iterator.hasNext()) {
      list = iterator.next();
      if (!iterator.hasNext()) {
        object1 = list;
      } else {
        long l = ((kk)list).e;
        do {
          object2 = iterator.next();
          long l4 = ((kk)object2).e;
          object1 = list;
          long l3 = l;
          if (l > l4) {
            object1 = object2;
            l3 = l4;
          } 
          Object object = object1;
          l = l3;
        } while (iterator.hasNext());
      } 
      kk kk = (kk)object1;
      long l1 = e.get(this);
      long l2 = t();
      do {
        int j = nh.b;
        for (byte b = 0; b < j; b++) {
          long l = kk.e * nh.b + b;
          int k = l cmp l2;
          if (k < 0 || l < l1) {
            Object object = kk.p(b);
            object2 = kk.h.get(b * 2);
            if (object instanceof li) {
              int m = l cmp l1;
              if (m < 0 && k >= 0) {
                object1 = "receive";
              } else if (k < 0 && m >= 0) {
                object1 = "send";
              } else {
                object1 = tlzLOCPTHRhep.ZRNbueGJffKxg;
              } 
            } else if (object instanceof fd1) {
              object1 = uvJYmft.FQcLeSzfXjYaD;
            } else if (object instanceof f52) {
              object1 = new StringBuilder("EB(");
              object1.append(object);
              object1.append(')');
              object1 = object1.toString();
            } else if (ui0.c(object, nh.f) || ui0.c(object, nh.g)) {
              object1 = "resuming_sender";
            } else {
              if (object == null || object.equals(nh.e) || object.equals(nh.i) || object.equals(nh.h) || object.equals(nh.k) || object.equals(nh.j) || object.equals(nh.l))
                continue; 
              object1 = object.toString();
            } 
            if (object2 != null) {
              object = new StringBuilder("(");
              object.append((String)object1);
              object.append(',');
              object.append(object2);
              object.append("),");
              stringBuilder2.append(object.toString());
            } else {
              object2 = new StringBuilder();
              object2.append((String)object1);
              object2.append(',');
              stringBuilder2.append(object2.toString());
            } 
            continue;
          } 
        } 
        kk = (kk)kk.c();
      } while (kk != null);
      if (stringBuilder2.length() != 0) {
        if (stringBuilder2.charAt(stringBuilder2.length() - i) == ',')
          stringBuilder2.deleteCharAt(stringBuilder2.length() - i).getClass(); 
        stringBuilder2.append("]");
        return stringBuilder2.toString();
      } 
      throw new NoSuchElementException(LHyji.OPzBmYUnx);
    } 
    throw new NoSuchElementException();
  }
  
  public final boolean u() {
    while (true) {
      i.getClass();
      Unsafe unsafe = oi.a;
      long l2 = p;
      kk kk2 = (kk)unsafe.getObjectVolatile(this, l2);
      AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = e;
      long l4 = atomicLongFieldUpdater.get(this);
      if (t() <= l4)
        return false; 
      long l1 = nh.b;
      long l3 = l4 / l1;
      kk kk1 = kk2;
      if (kk2.e != l3) {
        kk2 = o(l3, kk2);
        kk1 = kk2;
        if (kk2 == null) {
          if (((kk)unsafe.getObjectVolatile(this, l2)).e < l3)
            return false; 
          continue;
        } 
      } 
      kk1.a();
      int i = (int)(l4 % l1);
      while (true) {
        Object object = kk1.p(i);
        if (object == null || object == nh.e) {
          if (kk1.o(i, object, nh.h)) {
            k();
            break;
          } 
          continue;
        } 
        if (object == nh.d || (object != nh.j && object != nh.l && object != nh.i && object != nh.h && (object == nh.g || (object != nh.f && l4 == atomicLongFieldUpdater.get(this)))))
          return true; 
        break;
      } 
      e.compareAndSet(this, l4, l4 + 1L);
    } 
  }
  
  public final void w() {
    lh lh1 = this;
    label19: while (true) {
      f1 f1;
      l.getClass();
      Unsafe unsafe = oi.a;
      long l = o;
      Object object = unsafe.getObjectVolatile(lh1, l);
      if (object == null) {
        f1 = nh.q;
      } else {
        f1 = nh.r;
      } 
      while (true) {
        Unsafe unsafe1 = oi.a;
        if (unsafe1.compareAndSwapObject(lh1, o, object, f1)) {
          if (object == null)
            return; 
          qz1.d(1, object);
          ((wc0)object).h(lh1.r());
          return;
        } 
        if (unsafe1.getObjectVolatile(lh1, l) != object)
          continue label19; 
      } 
      break;
    } 
  }
  
  public final void x(oa1 paramoa1) {
    long l;
    Unsafe unsafe;
    lh lh1 = this;
    do {
      l.getClass();
      unsafe = oi.a;
      l = o;
      if (unsafe.compareAndSwapObject(lh1, l, null, paramoa1))
        return; 
      l = o;
    } while (unsafe.getObjectVolatile(lh1, l) == null);
    while (true) {
      Object object = oi.a.getObjectVolatile(lh1, l);
      f1 f1 = nh.q;
      if (object == f1) {
        f1 f11 = nh.r;
        while (true) {
          Unsafe unsafe1 = oi.a;
          boolean bool = unsafe1.compareAndSwapObject(lh1, o, f1, f11);
          object = lh1;
          if (bool) {
            paramoa1.h(object.r());
            return;
          } 
          Object object1 = object;
          if (unsafe1.getObjectVolatile(object, l) != f1)
            object1 = object; 
        } 
        break;
      } 
      if (object == nh.r) {
        tp.f("Another handler was already registered and successfully invoked");
        return;
      } 
      tp.k("Another handler is already registered: ", object);
      return;
    } 
  }
  
  public final boolean y(long paramLong, boolean paramBoolean) {
    int i = (int)(paramLong >> 60L);
    if (i != 0 && i != 1) {
      if (i != 2) {
        if (i == 3) {
          Object object;
          kk kk2;
          kk kk1 = i(paramLong & 0xFFFFFFFFFFFFFFFL);
          AtomicLongFieldUpdater<lh> atomicLongFieldUpdater = null;
          do {
            i = nh.b - 1;
            object = atomicLongFieldUpdater;
            label64: while (-1 < i) {
              paramLong = kk1.e * nh.b + i;
              while (true) {
                Object object2 = kk1.p(i);
                if (object2 != nh.i) {
                  f1 f12 = nh.d;
                  atomicLongFieldUpdater = e;
                  if (object2 == f12) {
                    if (paramLong >= atomicLongFieldUpdater.get(this)) {
                      if (kk1.o(i, object2, nh.l)) {
                        kk1.r(i, null);
                        kk1.m();
                        continue label64;
                      } 
                      continue;
                    } 
                    break;
                  } 
                  if (object2 == nh.e || object2 == null) {
                    if (kk1.o(i, object2, nh.l)) {
                      kk1.m();
                      i--;
                    } 
                    continue;
                  } 
                  if (object2 instanceof e52 || object2 instanceof f52) {
                    if (paramLong >= atomicLongFieldUpdater.get(this)) {
                      e52 e52;
                      if (object2 instanceof f52) {
                        e52 = ((f52)object2).a;
                      } else {
                        e52 = (e52)object2;
                      } 
                      if (kk1.o(i, object2, nh.l)) {
                        object = z51.D(object, e52);
                        kk1.r(i, null);
                        kk1.m();
                        continue label64;
                      } 
                      continue;
                    } 
                    break;
                  } 
                  f1 f11 = nh.g;
                  if (object2 == f11 || object2 == nh.f)
                    break; 
                  if (object2 != f11)
                    continue label64; 
                  continue;
                } 
                break;
              } 
            } 
            kk2 = (kk)kk1.e();
            kk1 = kk2;
            Object object1 = object;
          } while (kk2 != null);
          if (object != null)
            if (!(object instanceof ArrayList)) {
              G((e52)object, false);
            } else {
              ArrayList<e52> arrayList = (ArrayList)object;
              for (i = arrayList.size() - 1; -1 < i; i--)
                G(arrayList.get(i), false); 
            }  
        } else {
          throw new IllegalStateException(ga1.i("unexpected close status: ", i).toString());
        } 
      } else {
        i(paramLong & 0xFFFFFFFFFFFFFFFL);
        return (!paramBoolean || !u());
      } 
      return true;
    } 
    return false;
  }
  
  public final boolean z() {
    return y(c.get(this), false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */