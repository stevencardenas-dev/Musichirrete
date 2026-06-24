import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class zk {
  public final int a;
  
  public final Object b;
  
  public zk(oj paramoj) {
    Objects.requireNonNull(paramoj);
    this.b = paramoj;
  }
  
  public final void a() {}
  
  public final void b() {}
  
  public final void c() {}
  
  public final void d() {}
  
  public void e(String paramString, long paramLong1, int paramInt, long paramLong2, long paramLong3) {
    switch (this.a) {
      default:
        return;
      case 2:
        break;
    } 
    mt2 mt2 = ((oj)this.b).l;
    if (mt2 != null) {
      gc2 gc2 = mt2.b.H();
      oi2 oi2 = new oi2(paramString);
      oi2.b = paramLong1;
      oi2.c = paramInt;
      oi2.d = paramLong2;
      oi2.e = paramLong3;
      ri2 ri2 = new ri2(oi2);
      ri2.f = gc2.h;
      gc2.d.add(ri2);
    } 
  }
  
  public final void f(String paramString, long paramLong1, int paramInt, long paramLong2, long paramLong3) {}
  
  public void g(int[] paramArrayOfint) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    rt0 rt0 = (rt0)this.b;
    ArrayList arrayList = qj.e(paramArrayOfint);
    if (!rt0.d.equals(arrayList)) {
      rt0.f();
      rt0.f.evictAll();
      rt0.g.clear();
      rt0.d = arrayList;
      rt0.c();
      rt0.h();
      rt0.g();
    } 
  }
  
  public final void h(int[] paramArrayOfint) {}
  
  public void i(int[] paramArrayOfint, int paramInt) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    rt0 rt0 = (rt0)this.b;
    if (paramInt == 0) {
      paramInt = rt0.d.size();
    } else {
      int i = rt0.e.get(paramInt, -1);
      paramInt = i;
      if (i == -1) {
        rt0.b();
        return;
      } 
    } 
    rt0 = (rt0)this.b;
    rt0.f();
    rt0.d.addAll(paramInt, qj.e(paramArrayOfint));
    rt0.c();
    Set set = rt0.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        rt0.g();
        return;
      } 
    } finally {}
    if (iterator.next() == null)
      throw null; 
    ClassCastException classCastException = new ClassCastException();
    this();
    Iterator iterator;
    throw classCastException;
  }
  
  public final void j(int[] paramArrayOfint, int paramInt) {}
  
  public void k(int[] paramArrayOfint) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    rt0 rt0 = (rt0)this.b;
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    while (true) {
      if (b < paramArrayOfint.length) {
        int i = paramArrayOfint[b];
        rt0.f.remove(Integer.valueOf(i));
        i = rt0.e.get(i, -1);
        if (i == -1) {
          rt0.b();
          break;
        } 
        arrayList.add(Integer.valueOf(i));
        b++;
        continue;
      } 
      Collections.sort(arrayList);
      rt0.f();
      qj.d(arrayList);
      rt0.d();
      rt0.g();
      break;
    } 
  }
  
  public final void l(int[] paramArrayOfint) {}
  
  public void m(int[] paramArrayOfint) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    ArrayList<Integer> arrayList = new ArrayList();
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      int i = paramArrayOfint[b];
      rt0 rt0 = (rt0)this.b;
      rt0.f.remove(Integer.valueOf(i));
      SparseIntArray sparseIntArray = rt0.e;
      int j = sparseIntArray.get(i, -1);
      if (j == -1) {
        rt0.b();
        // Byte code: goto -> 208
      } 
      sparseIntArray.delete(i);
      arrayList.add(Integer.valueOf(j));
    } 
    if (!arrayList.isEmpty()) {
      Iterator iterator;
      Collections.sort(arrayList);
      rt0 rt0 = (rt0)this.b;
      rt0.f();
      rt0.d.removeAll(qj.e(paramArrayOfint));
      rt0.c();
      qj.d(arrayList);
      Set set = rt0.m;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
      try {
        iterator = set.iterator();
        if (!iterator.hasNext()) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
          rt0.g();
          return;
        } 
      } finally {}
      if (iterator.next() == null)
        throw null; 
      ClassCastException classCastException = new ClassCastException();
      this();
      throw classCastException;
    } 
  }
  
  public final void n(int[] paramArrayOfint) {}
  
  public void o(ut0[] paramArrayOfut0) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    HashSet<Integer> hashSet = new HashSet();
    rt0 rt0 = (rt0)this.b;
    ArrayList<ut0[]> arrayList1 = rt0.g;
    SparseIntArray sparseIntArray = rt0.e;
    arrayList1.clear();
    int j = 0;
    int i;
    for (i = 0; i < paramArrayOfut0.length; i++) {
      ut0 ut01 = paramArrayOfut0[i];
      int m = ut01.c;
      rt0.f.put(Integer.valueOf(m), ut01);
      m = sparseIntArray.get(m, -1);
      if (m == -1) {
        rt0.b();
        // Byte code: goto -> 245
      } 
      hashSet.add(Integer.valueOf(m));
    } 
    int k = arrayList1.size();
    i = j;
    while (i < k) {
      paramArrayOfut0 = arrayList1.get(i);
      j = i + 1;
      int m = sparseIntArray.get(((Integer)paramArrayOfut0).intValue(), -1);
      i = j;
      if (m != -1) {
        hashSet.add(Integer.valueOf(m));
        i = j;
      } 
    } 
    arrayList1.clear();
    ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
    Collections.sort(arrayList);
    rt0.f();
    qj.d(arrayList);
    rt0.d();
    rt0.g();
  }
  
  public final void p(ut0[] paramArrayOfut0) {}
  
  public void q(ArrayList paramArrayList1, ArrayList<Integer> paramArrayList2, int paramInt) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    ArrayList<Integer> arrayList = new ArrayList();
    int i = 0;
    if (paramInt == 0) {
      ((rt0)this.b).d.size();
    } else {
      rp0 rp0;
      boolean bool = paramArrayList2.isEmpty();
      rt0 rt01 = (rt0)this.b;
      if (bool) {
        rp0 = rt01.a;
        Log.w(rp0.a, rp0.c("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
      } else {
        SparseIntArray sparseIntArray = ((rt0)rp0).e;
        if (sparseIntArray.get(paramInt, -1) == -1)
          sparseIntArray.get(((Integer)paramArrayList2.get(0)).intValue(), -1); 
      } 
    } 
    int j = paramArrayList2.size();
    paramInt = i;
    while (paramInt < j) {
      Integer integer = (Integer)paramArrayList2.get(paramInt);
      paramInt++;
      i = ((Integer)integer).intValue();
      rt0 rt01 = (rt0)this.b;
      i = rt01.e.get(i, -1);
      if (i == -1) {
        rt01.b();
        // Byte code: goto -> 281
      } 
      arrayList.add(Integer.valueOf(i));
    } 
    rt0 rt0 = (rt0)this.b;
    rt0.f();
    rt0.d = paramArrayList1;
    rt0.c();
    Set set = rt0.m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
    try {
      iterator = set.iterator();
      if (!iterator.hasNext()) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Set}, name=null} */
        rt0.g();
        return;
      } 
    } finally {}
    if (iterator.next() == null)
      throw null; 
    ClassCastException classCastException = new ClassCastException();
    this();
    Iterator iterator;
    throw classCastException;
  }
  
  public final void r(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt) {}
  
  public final void s() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */