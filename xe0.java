import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class xe0 {
  static {
    g7 g71 = new g7(16, Collections.EMPTY_MAP, Collections.EMPTY_LIST);
    o = g71;
    hk0 hk01 = new hk0(g71);
    p = hk01;
    xe0 xe01 = new xe0();
    q = xe01;
    ArrayList<fz1> arrayList1 = new ArrayList();
    arrayList1.add(pz1.B);
    int i = xe01.l;
    if (i == 1) {
      h31 = i31.c;
    } else {
      h31 = new h31(i);
    } 
    arrayList1.add(h31);
    arrayList1.add(xe01.a);
    ArrayList<?> arrayList = xe01.c;
    if (!arrayList.isEmpty()) {
      arrayList = new ArrayList(arrayList);
      Collections.reverse(arrayList);
      arrayList1.addAll(arrayList);
    } 
    arrayList = xe01.d;
    if (!arrayList.isEmpty()) {
      arrayList = new ArrayList(arrayList);
      Collections.reverse(arrayList);
      arrayList1.addAll(arrayList);
    } 
    boolean bool = so1.a;
    ReflectiveOperationException reflectiveOperationException = null;
    int j = xe01.e;
    i = xe01.f;
    if (j != 2 || i != 2) {
      fz1 fz11;
      fz1 fz12 = new fz1(Date.class, new bw(aw.b, j, i), 0);
      if (bool) {
        ro1 ro11 = so1.c;
        ro11.getClass();
        bw bw1 = new bw(ro11, j, i);
        fz1 fz1 = new fz1(ro11.a, bw1, 0);
        ro1 ro12 = so1.b;
        ro12.getClass();
        bw bw2 = new bw(ro12, j, i);
        fz11 = new fz1(ro12.a, bw2, 0);
      } else {
        fz11 = null;
        arrayList = null;
      } 
      arrayList1.add(fz12);
      if (bool) {
        arrayList1.add(arrayList);
        arrayList1.add(fz11);
      } 
    } 
    arrayList1.add(pz1.r);
    arrayList1.add(pz1.g);
    arrayList1.add(pz1.d);
    arrayList1.add(pz1.e);
    arrayList1.add(pz1.f);
    if (xe01.j != 0) {
      b31 b31;
      oy1 oy1 = pz1.k;
      arrayList1.add(new gz1(long.class, Long.class, oy1));
      nz1 nz1 = pz1.m;
      arrayList1.add(new gz1(double.class, Double.class, nz1));
      nz1 = pz1.l;
      arrayList1.add(new gz1(float.class, Float.class, nz1));
      i = xe01.m;
      if (i == 2) {
        b31 = c31.b;
      } else {
        b31 = new b31(new c31(i), 0);
      } 
      arrayList1.add(b31);
      arrayList1.add(pz1.h);
      arrayList1.add(pz1.i);
      Objects.requireNonNull(oy1);
      arrayList1.add(new fz1(AtomicLong.class, (new ny1(oy1, 1)).a(), 0));
      arrayList1.add(new fz1(AtomicLongArray.class, (new ny1(oy1, 0)).a(), 0));
      arrayList1.add(pz1.j);
      arrayList1.add(pz1.n);
      arrayList1.add(pz1.s);
      arrayList1.add(pz1.t);
      arrayList1.add(pz1.o);
      arrayList1.add(pz1.p);
      arrayList1.add(pz1.q);
      arrayList1.add(pz1.u);
      arrayList1.add(pz1.v);
      arrayList1.add(pz1.x);
      arrayList1.add(pz1.y);
      arrayList1.add(pz1.A);
      arrayList1.add(pz1.w);
      arrayList1.add(pz1.b);
      arrayList1.add(bw.c);
      arrayList1.add(pz1.z);
      try {
        qj0 qj0 = rj0.a;
        ((rj0)rj0.class.getDeclaredConstructor(null).newInstance(null)).getClass();
        rj0.b b = rj0.j;
      } catch (ReflectiveOperationException|LinkageError reflectiveOperationException1) {
        reflectiveOperationException1 = reflectiveOperationException;
      } 
      if (reflectiveOperationException1 != null)
        arrayList1.add(reflectiveOperationException1); 
      arrayList1.addAll(so1.d);
      arrayList1.add(f9.c);
      arrayList1.add(pz1.a);
      arrayList1.add(new mm(g71, 0));
      arrayList1.add(new mm(g71, 1));
      arrayList1.add(hk01);
      arrayList1.add(pz1.C);
      List list = a(xe01.i);
      arrayList1.add(new ye1(g71, xe01.k, xe01.a, hk01, list));
      arrayList1.trimToSize();
      r = Collections.unmodifiableList(arrayList1);
      return;
    } 
    throw null;
  }
  
  public static List a(AbstractCollection<AbstractCollection> paramAbstractCollection) {
    if (paramAbstractCollection.isEmpty())
      return Collections.EMPTY_LIST; 
    if (paramAbstractCollection.size() == 1) {
      if (paramAbstractCollection instanceof List) {
        paramAbstractCollection = ((List<AbstractCollection>)paramAbstractCollection).get(0);
      } else {
        paramAbstractCollection = paramAbstractCollection.iterator().next();
      } 
      return Collections.singletonList(paramAbstractCollection);
    } 
    return Collections.unmodifiableList(Arrays.asList(paramAbstractCollection.toArray()));
  }
  
  static {
    h31 h31;
  }
  
  public static final na0 n = na0.d;
  
  public static final g7 o;
  
  public static final hk0 p;
  
  public static final xe0 q;
  
  public static final List r;
  
  public static final int s = 1;
  
  public static final int t = 1;
  
  public static final int u = 2;
  
  public final x50 a = x50.e;
  
  public final HashMap b = new HashMap<Object, Object>();
  
  public final ArrayList c = new ArrayList();
  
  public final ArrayList d = new ArrayList();
  
  public final int e = 2;
  
  public final int f = 2;
  
  public final boolean g = true;
  
  public final na0 h = n;
  
  public final ArrayDeque i = new ArrayDeque();
  
  public final int j = 1;
  
  public final int k = s;
  
  public final int l = t;
  
  public final int m = u;
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xe0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */