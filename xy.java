import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.Vuyf.nBRIsU;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

public final class xy implements qz {
  public final RecyclerView b;
  
  public xy(ConstraintLayout paramConstraintLayout, RecyclerView paramRecyclerView) {
    this.b = paramRecyclerView;
  }
  
  public void a(u2 paramu2) {
    int i = paramu2.a;
    RecyclerView recyclerView = this.b;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i != 8)
            return; 
          recyclerView.p.m0(paramu2.b, paramu2.d);
          return;
        } 
        recyclerView.p.p0(recyclerView, paramu2.b, paramu2.d);
        return;
      } 
      recyclerView.p.n0(paramu2.b, paramu2.d);
      return;
    } 
    recyclerView.p.k0(paramu2.b, paramu2.d);
  }
  
  public he1 b(int paramInt) {
    he1 he12;
    RecyclerView recyclerView = this.b;
    int i = recyclerView.h.h();
    byte b = 0;
    he1 he11 = null;
    while (true) {
      he12 = he11;
      if (b < i) {
        he12 = RecyclerView.O(recyclerView.h.g(b));
        he1 he1 = he11;
        if (he12 != null) {
          he1 = he11;
          if (!he12.j())
            if (he12.e != paramInt) {
              he1 = he11;
            } else {
              tk tk = recyclerView.h;
              View view = he12.b;
              if (((ArrayList)tk.e).contains(view)) {
                he1 = he12;
              } else {
                break;
              } 
            }  
        } 
        b++;
        he11 = he1;
        continue;
      } 
      break;
    } 
    if (he12 != null) {
      tk tk = recyclerView.h;
      View view = he12.b;
      if (((ArrayList)tk.e).contains(view)) {
        if (RecyclerView.F0)
          Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden"); 
        return null;
      } 
      return he12;
    } 
    return null;
  }
  
  public void c(int paramInt1, int paramInt2, Object paramObject) {
    RecyclerView recyclerView = this.b;
    int j = recyclerView.h.h();
    int i = paramInt2 + paramInt1;
    for (paramInt2 = 0; paramInt2 < j; paramInt2++) {
      View view = recyclerView.h.g(paramInt2);
      he1 he1 = RecyclerView.O(view);
      if (he1 != null && !he1.q()) {
        int k = he1.e;
        if (k >= paramInt1 && k < i) {
          he1.a(2);
          if (paramObject == null) {
            he1.a(1024);
          } else if ((0x400 & he1.l) == 0) {
            if (he1.m == null) {
              ArrayList<?> arrayList1 = new ArrayList();
              he1.m = arrayList1;
              he1.n = Collections.unmodifiableList(arrayList1);
            } 
            he1.m.add(paramObject);
          } 
          ((sd1)view.getLayoutParams()).e = true;
        } 
      } 
    } 
    paramObject = recyclerView.e;
    ArrayList<he1> arrayList = ((yd1)paramObject).c;
    for (paramInt2 = arrayList.size() - 1; paramInt2 >= 0; paramInt2--) {
      he1 he1 = arrayList.get(paramInt2);
      if (he1 != null) {
        j = he1.e;
        if (j >= paramInt1 && j < i) {
          he1.a(2);
          paramObject.h(paramInt2);
        } 
      } 
    } 
    recyclerView.n0 = true;
  }
  
  public void d(int paramInt1, int paramInt2) {
    RecyclerView recyclerView = this.b;
    int i = recyclerView.h.h();
    byte b;
    for (b = 0; b < i; b++) {
      he1 he1 = RecyclerView.O(recyclerView.h.g(b));
      if (he1 != null && !he1.q() && he1.e >= paramInt1) {
        if (RecyclerView.F0) {
          StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForInsert attached child ");
          stringBuilder.append(b);
          stringBuilder.append(" holder ");
          stringBuilder.append(he1);
          stringBuilder.append(" now at position ");
          stringBuilder.append(he1.e + paramInt2);
          Log.d("RecyclerView", stringBuilder.toString());
        } 
        he1.n(paramInt2, false);
        recyclerView.j0.f = true;
      } 
    } 
    ArrayList<he1> arrayList = recyclerView.e.c;
    i = arrayList.size();
    for (b = 0; b < i; b++) {
      he1 he1 = arrayList.get(b);
      if (he1 != null && he1.e >= paramInt1) {
        if (RecyclerView.F0) {
          StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForInsert cached ");
          stringBuilder.append(b);
          stringBuilder.append(" holder ");
          stringBuilder.append(he1);
          stringBuilder.append(" now at position ");
          stringBuilder.append(he1.e + paramInt2);
          Log.d("RecyclerView", stringBuilder.toString());
        } 
        he1.n(paramInt2, false);
      } 
    } 
    recyclerView.requestLayout();
    recyclerView.m0 = true;
  }
  
  public void e(int paramInt1, int paramInt2) {
    int i;
    int j;
    int k;
    RecyclerView recyclerView = this.b;
    int n = recyclerView.h.h();
    int m = -1;
    if (paramInt1 < paramInt2) {
      k = paramInt1;
      j = paramInt2;
      i = -1;
    } else {
      j = paramInt1;
      k = paramInt2;
      i = 1;
    } 
    byte b = 0;
    while (true) {
      String str = nBRIsU.otBKdd;
      if (b < n) {
        he1 he1 = RecyclerView.O(recyclerView.h.g(b));
        if (he1 != null) {
          int i1 = he1.e;
          if (i1 >= k && i1 <= j) {
            if (RecyclerView.F0) {
              StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForMove attached child ");
              stringBuilder.append(b);
              stringBuilder.append(str);
              stringBuilder.append(he1);
              Log.d("RecyclerView", stringBuilder.toString());
            } 
            if (he1.e == paramInt1) {
              he1.n(paramInt2 - paramInt1, false);
            } else {
              he1.n(i, false);
            } 
            recyclerView.j0.f = true;
          } 
        } 
        b++;
        continue;
      } 
      ArrayList<he1> arrayList = recyclerView.e.c;
      if (paramInt1 < paramInt2) {
        j = paramInt1;
        i = paramInt2;
        k = m;
      } else {
        i = paramInt1;
        j = paramInt2;
        k = 1;
      } 
      m = arrayList.size();
      for (b = 0; b < m; b++) {
        he1 he1 = arrayList.get(b);
        if (he1 != null) {
          n = he1.e;
          if (n >= j && n <= i) {
            if (n == paramInt1) {
              he1.n(paramInt2 - paramInt1, false);
            } else {
              he1.n(k, false);
            } 
            if (RecyclerView.F0) {
              StringBuilder stringBuilder = new StringBuilder("offsetPositionRecordsForMove cached child ");
              stringBuilder.append(b);
              stringBuilder.append(str);
              stringBuilder.append(he1);
              Log.d("RecyclerView", stringBuilder.toString());
            } 
          } 
        } 
      } 
      recyclerView.requestLayout();
      recyclerView.m0 = true;
      return;
    } 
  }
  
  public boolean f(float paramFloat) {
    boolean bool1;
    boolean bool2;
    RecyclerView recyclerView = this.b;
    if (recyclerView.p.p()) {
      bool1 = (int)paramFloat;
      bool2 = false;
    } else if (recyclerView.p.o()) {
      bool2 = (int)paramFloat;
      bool1 = false;
    } else {
      bool2 = false;
      bool1 = false;
    } 
    if (!bool2 && !bool1)
      return false; 
    recyclerView.s0();
    return recyclerView.J(bool2, bool1, 0, 2147483647);
  }
  
  public void g(he1 paramhe1, p11 paramp111, p11 paramp112) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: invokevirtual p : (Z)V
    //   5: aload_0
    //   6: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   9: astore #7
    //   11: aload #7
    //   13: getfield O : Lod1;
    //   16: checkcast mw
    //   19: astore #8
    //   21: aload_2
    //   22: ifnull -> 64
    //   25: aload #8
    //   27: invokevirtual getClass : ()Ljava/lang/Class;
    //   30: pop
    //   31: aload_2
    //   32: getfield a : I
    //   35: istore #4
    //   37: aload_3
    //   38: getfield a : I
    //   41: istore #5
    //   43: iload #4
    //   45: iload #5
    //   47: if_icmpne -> 67
    //   50: aload_2
    //   51: getfield b : I
    //   54: aload_3
    //   55: getfield b : I
    //   58: if_icmpeq -> 64
    //   61: goto -> 67
    //   64: goto -> 90
    //   67: aload #8
    //   69: aload_1
    //   70: iload #4
    //   72: aload_2
    //   73: getfield b : I
    //   76: iload #5
    //   78: aload_3
    //   79: getfield b : I
    //   82: invokevirtual g : (Lhe1;IIII)Z
    //   85: istore #6
    //   87: goto -> 117
    //   90: aload #8
    //   92: aload_1
    //   93: invokevirtual l : (Lhe1;)V
    //   96: aload_1
    //   97: getfield b : Landroid/view/View;
    //   100: fconst_0
    //   101: invokevirtual setAlpha : (F)V
    //   104: aload #8
    //   106: getfield i : Ljava/util/ArrayList;
    //   109: aload_1
    //   110: invokevirtual add : (Ljava/lang/Object;)Z
    //   113: pop
    //   114: iconst_1
    //   115: istore #6
    //   117: iload #6
    //   119: ifeq -> 127
    //   122: aload #7
    //   124: invokevirtual Z : ()V
    //   127: return
  }
  
  public void h(he1 paramhe1, p11 paramp111, p11 paramp112) {
    int i;
    int j;
    boolean bool;
    RecyclerView recyclerView = this.b;
    recyclerView.e.m(paramhe1);
    recyclerView.g(paramhe1);
    paramhe1.p(false);
    mw mw = (mw)recyclerView.O;
    mw.getClass();
    int m = paramp111.a;
    int k = paramp111.b;
    View view = paramhe1.b;
    if (paramp112 == null) {
      i = view.getLeft();
    } else {
      i = paramp112.a;
    } 
    if (paramp112 == null) {
      j = view.getTop();
    } else {
      j = paramp112.b;
    } 
    if (!paramhe1.j() && (m != i || k != j)) {
      view.layout(i, j, view.getWidth() + i, view.getHeight() + j);
      bool = mw.g(paramhe1, m, k, i, j);
    } else {
      mw.l(paramhe1);
      mw.h.add(paramhe1);
      bool = true;
    } 
    if (bool)
      recyclerView.Z(); 
  }
  
  public float i() {
    RecyclerView recyclerView = this.b;
    if (recyclerView.p.p()) {
      float f = recyclerView.e0;
      return -f;
    } 
    if (recyclerView.p.o()) {
      float f = recyclerView.d0;
      return -f;
    } 
    return 0.0F;
  }
  
  public void j(int paramInt) {
    RecyclerView recyclerView = this.b;
    View view = recyclerView.getChildAt(paramInt);
    if (view != null) {
      recyclerView.q(view);
      view.clearAnimation();
    } 
    recyclerView.removeViewAt(paramInt);
  }
  
  public void n() {
    this.b.s0();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */