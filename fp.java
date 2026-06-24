import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fp extends vo {
  public final ArrayList i;
  
  public final HashSet j;
  
  public Handler k;
  
  public final ArrayList l;
  
  public final IdentityHashMap m;
  
  public final HashMap n;
  
  public final HashSet o;
  
  public final boolean p;
  
  public boolean q;
  
  public HashSet r;
  
  public sm1 s;
  
  public fp(sm1 paramsm1, ad... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_2
    //   5: arraylength
    //   6: istore #4
    //   8: iconst_0
    //   9: istore_3
    //   10: iload_3
    //   11: iload #4
    //   13: if_icmpge -> 29
    //   16: aload_2
    //   17: iload_3
    //   18: aaload
    //   19: invokevirtual getClass : ()Ljava/lang/Class;
    //   22: pop
    //   23: iinc #3, 1
    //   26: goto -> 10
    //   29: aload_1
    //   30: astore #5
    //   32: aload_1
    //   33: getfield a : I
    //   36: ifle -> 49
    //   39: new sm1
    //   42: dup
    //   43: iconst_0
    //   44: invokespecial <init> : (I)V
    //   47: astore #5
    //   49: aload_0
    //   50: aload #5
    //   52: putfield s : Lsm1;
    //   55: aload_0
    //   56: new java/util/IdentityHashMap
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: putfield m : Ljava/util/IdentityHashMap;
    //   66: aload_0
    //   67: new java/util/HashMap
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: putfield n : Ljava/util/HashMap;
    //   77: new java/util/ArrayList
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: astore_1
    //   85: aload_0
    //   86: aload_1
    //   87: putfield i : Ljava/util/ArrayList;
    //   90: aload_0
    //   91: new java/util/ArrayList
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: putfield l : Ljava/util/ArrayList;
    //   101: aload_0
    //   102: new java/util/HashSet
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: putfield r : Ljava/util/HashSet;
    //   112: aload_0
    //   113: new java/util/HashSet
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: putfield j : Ljava/util/HashSet;
    //   123: aload_0
    //   124: new java/util/HashSet
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: putfield o : Ljava/util/HashSet;
    //   134: aload_0
    //   135: iconst_1
    //   136: putfield p : Z
    //   139: aload_2
    //   140: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   143: astore_2
    //   144: aload_0
    //   145: monitorenter
    //   146: aload_0
    //   147: aload_1
    //   148: invokevirtual size : ()I
    //   151: aload_2
    //   152: invokevirtual u : (ILjava/util/List;)V
    //   155: aload_0
    //   156: monitorexit
    //   157: return
    //   158: astore_1
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_1
    //   162: athrow
    // Exception table:
    //   from	to	target	type
    //   146	155	158	finally
    //   159	161	158	finally
  }
  
  public final int A() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Ljava/util/ArrayList;
    //   6: invokevirtual size : ()I
    //   9: istore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_1
    //   13: ireturn
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
    //   15	17	14	finally
  }
  
  public final void B(dp paramdp) {
    if (paramdp.f && paramdp.c.isEmpty()) {
      this.o.remove(paramdp);
      uo uo = (uo)this.f.remove(paramdp);
      uo.getClass();
      ad ad = uo.a;
      ad.l(uo.b);
      ad.n(uo.c);
    } 
  }
  
  public final void C(int paramInt1, int paramInt2) {
    Handler handler = this.k;
    int i = d12.a;
    if (paramInt1 >= 0) {
      ArrayList arrayList = this.i;
      if (paramInt2 <= arrayList.size() && paramInt1 <= paramInt2) {
        if (paramInt1 != paramInt2)
          arrayList.subList(paramInt1, paramInt2).clear(); 
        if (handler != null)
          handler.obtainMessage(1, new ep(paramInt1, Integer.valueOf(paramInt2), null)).sendToTarget(); 
        return;
      } 
    } 
    l0.k();
  }
  
  public final void D(cp paramcp) {
    if (!this.q) {
      Handler handler = this.k;
      handler.getClass();
      handler.obtainMessage(4).sendToTarget();
      this.q = true;
    } 
  }
  
  public final void E() {
    this.q = false;
    HashSet hashSet = this.r;
    this.r = new HashSet();
    j(new ap(this.l, this.s));
    Handler handler = this.k;
    handler.getClass();
    handler.obtainMessage(5, hashSet).sendToTarget();
  }
  
  public final nt0 a(fw0 paramfw0, uv paramuv, long paramLong) {
    Pair pair = (Pair)paramfw0.a;
    Object object2 = pair.first;
    fw0 fw01 = paramfw0.a(pair.second);
    object2 = this.n.get(object2);
    Object object1 = object2;
    if (object2 == null) {
      object1 = new dp(new ad(), this.p);
      ((dp)object1).f = true;
      r((dp)object1, ((dp)object1).a);
    } 
    this.o.add(object1);
    object2 = this.f.get(object1);
    object2.getClass();
    ((uo)object2).a.d(((uo)object2).b);
    ((dp)object1).c.add(fw01);
    rr0 rr0 = ((dp)object1).a.t(fw01, paramuv, paramLong);
    this.m.put(rr0, object1);
    x();
    return rr0;
  }
  
  public final void c() {
    super.c();
    this.o.clear();
  }
  
  public final void e() {}
  
  public final Object f() {
    return null;
  }
  
  public final void i(wv paramwv) {
    /* monitor enter ThisExpression{ObjectType{fp}} */
    try {
      this.h = paramwv;
      Handler handler1 = new Handler();
      this();
      this.g = handler1;
      Handler handler2 = new Handler();
      zo zo = new zo();
      this(this);
      this(zo);
      this.k = handler2;
      if (this.i.isEmpty()) {
        E();
      } else {
        sm1 sm12 = this.s;
        int i = this.i.size();
        sm1 sm11 = new sm1();
        this(sm12.a + i);
        this.s = sm11;
        t(0, this.i);
        D(null);
      } 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{fp}} */
  }
  
  public final void k(nt0 paramnt0) {
    IdentityHashMap identityHashMap = this.m;
    dp dp = (dp)identityHashMap.remove(paramnt0);
    dp.getClass();
    dp.a.k(paramnt0);
    dp.c.remove(((rr0)paramnt0).c);
    if (!identityHashMap.isEmpty())
      x(); 
    B(dp);
  }
  
  public final void m() {
    /* monitor enter ThisExpression{ObjectType{fp}} */
    try {
      super.m();
      this.l.clear();
      this.o.clear();
      this.n.clear();
      this.s.getClass();
      sm1 sm11 = new sm1();
      this(0);
      this.s = sm11;
      Handler handler = this.k;
      if (handler != null) {
        handler.removeCallbacksAndMessages(null);
        this.k = null;
      } 
    } finally {
      Exception exception;
    } 
    this.q = false;
    this.r.clear();
    y(this.j);
    /* monitor exit ThisExpression{ObjectType{fp}} */
  }
  
  public final fw0 o(Object paramObject, fw0 paramfw0) {
    dp dp = (dp)paramObject;
    for (byte b = 0; b < dp.c.size(); b++) {
      if (((fw0)dp.c.get(b)).d == paramfw0.d) {
        paramObject = paramfw0.a;
        return paramfw0.a(Pair.create(dp.b, paramObject));
      } 
    } 
    return null;
  }
  
  public final int p(int paramInt, Object paramObject) {
    return paramInt + ((dp)paramObject).e;
  }
  
  public final void q(Object paramObject, uu1 paramuu1) {
    paramObject = paramObject;
    if (paramObject != null) {
      int i = ((dp)paramObject).d;
      ArrayList<dp> arrayList = this.l;
      if (i + 1 < arrayList.size()) {
        dp dp = arrayList.get(((dp)paramObject).d + 1);
        i = paramuu1.m() - dp.e - ((dp)paramObject).e;
        if (i != 0)
          w(((dp)paramObject).d + 1, 0, i); 
      } 
      D(null);
      return;
    } 
    l0.k();
  }
  
  public final void t(int paramInt, Collection paramCollection) {
    for (dp dp : paramCollection) {
      ArrayList<dp> arrayList = this.l;
      if (paramInt > 0) {
        dp dp1 = arrayList.get(paramInt - 1);
        tr0 tr0 = dp1.a.m;
        int i = dp1.e;
        int j = tr0.b.m();
        dp.d = paramInt;
        dp.e = j + i;
        dp.f = false;
        dp.c.clear();
      } else {
        dp.d = paramInt;
        dp.e = 0;
        dp.f = false;
        dp.c.clear();
      } 
      w(paramInt, 1, dp.a.m.b.m());
      arrayList.add(paramInt, dp);
      this.n.put(dp.b, dp);
      r(dp, dp.a);
      if (!this.b.isEmpty() && this.m.isEmpty()) {
        this.o.add(dp);
      } else {
        uo uo = (uo)this.f.get(dp);
        uo.getClass();
        uo.a.b(uo.b);
      } 
      paramInt++;
    } 
  }
  
  public final void u(int paramInt, List paramList) {
    Handler handler = this.k;
    Iterator<ad> iterator1 = paramList.iterator();
    while (iterator1.hasNext())
      ((ad)iterator1.next()).getClass(); 
    ArrayList<dp> arrayList = new ArrayList(paramList.size());
    Iterator<ad> iterator2 = paramList.iterator();
    while (iterator2.hasNext())
      arrayList.add(new dp(iterator2.next(), this.p)); 
    this.i.addAll(paramInt, arrayList);
    if (handler != null && !paramList.isEmpty())
      handler.obtainMessage(0, new ep(paramInt, arrayList, null)).sendToTarget(); 
  }
  
  public final void v() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual A : ()I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: iconst_0
    //   11: iload_1
    //   12: invokevirtual C : (II)V
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_2
    //   24: athrow
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	25	finally
    //   9	15	20	finally
    //   15	17	25	finally
    //   21	23	20	finally
    //   23	25	25	finally
    //   26	28	25	finally
  }
  
  public final void w(int paramInt1, int paramInt2, int paramInt3) {
    while (true) {
      ArrayList<dp> arrayList = this.l;
      if (paramInt1 < arrayList.size()) {
        dp dp = arrayList.get(paramInt1);
        dp.d += paramInt2;
        dp.e += paramInt3;
        paramInt1++;
        continue;
      } 
      break;
    } 
  }
  
  public final void x() {
    Iterator<dp> iterator = this.o.iterator();
    while (iterator.hasNext()) {
      dp dp = iterator.next();
      if (dp.c.isEmpty()) {
        uo uo = (uo)this.f.get(dp);
        uo.getClass();
        uo.a.b(uo.b);
        iterator.remove();
      } 
    } 
  }
  
  public final void y(Set<?> paramSet) {
    Iterator<cp> iterator;
    /* monitor enter ThisExpression{ObjectType{fp}} */
    try {
      iterator = paramSet.iterator();
      if (!iterator.hasNext()) {
        this.j.removeAll(paramSet);
        /* monitor exit ThisExpression{ObjectType{fp}} */
        return;
      } 
    } finally {}
    ((cp)iterator.next()).getClass();
    throw null;
  }
  
  public final ur0 z(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Ljava/util/ArrayList;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast dp
    //   13: getfield a : Lur0;
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: areturn
    //   21: astore_2
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_2
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	21	finally
    //   22	24	21	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */