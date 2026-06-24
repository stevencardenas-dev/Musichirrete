import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class mw extends od1 {
  public static TimeInterpolator s;
  
  public boolean g;
  
  public ArrayList h;
  
  public ArrayList i;
  
  public ArrayList j;
  
  public ArrayList k;
  
  public ArrayList l;
  
  public ArrayList m;
  
  public ArrayList n;
  
  public ArrayList o;
  
  public ArrayList p;
  
  public ArrayList q;
  
  public ArrayList r;
  
  public static void h(ArrayList paramArrayList) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
      ((he1)paramArrayList.get(i)).b.animate().cancel(); 
  }
  
  public final boolean a(he1 paramhe11, he1 paramhe12, p11 paramp111, p11 paramp112) {
    int i;
    int j;
    int k = paramp111.a;
    int m = paramp111.b;
    if (paramhe12.q()) {
      i = paramp111.a;
      j = paramp111.b;
    } else {
      i = paramp112.a;
      j = paramp112.b;
    } 
    if (paramhe11 == paramhe12)
      return g(paramhe11, k, m, i, j); 
    View view = paramhe11.b;
    float f1 = view.getTranslationX();
    float f3 = view.getTranslationY();
    float f2 = view.getAlpha();
    l(paramhe11);
    int i1 = (int)((i - k) - f1);
    int n = (int)((j - m) - f3);
    view.setTranslationX(f1);
    view.setTranslationY(f3);
    view.setAlpha(f2);
    view = paramhe12.b;
    l(paramhe12);
    view.setTranslationX(-i1);
    view.setTranslationY(-n);
    view.setAlpha(0.0F);
    ArrayList<Object> arrayList = this.k;
    Object object = new Object();
    ((kw)object).a = paramhe11;
    ((kw)object).b = paramhe12;
    ((kw)object).c = k;
    ((kw)object).d = m;
    ((kw)object).e = i;
    ((kw)object).f = j;
    arrayList.add(object);
    return true;
  }
  
  public final void d(he1 paramhe1) {
    ArrayList<ArrayList<ArrayList<ArrayList>>> arrayList = this.l;
    ArrayList<ArrayList<ArrayList>> arrayList1 = this.m;
    ArrayList<ArrayList> arrayList2 = this.n;
    View view = paramhe1.b;
    view.animate().cancel();
    ArrayList arrayList3 = this.j;
    int i;
    for (i = arrayList3.size() - 1; i >= 0; i--) {
      if (((lw)arrayList3.get(i)).a == paramhe1) {
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        c(paramhe1);
        arrayList3.remove(i);
      } 
    } 
    j(this.k, paramhe1);
    if (this.h.remove(paramhe1)) {
      view.setAlpha(1.0F);
      c(paramhe1);
    } 
    if (this.i.remove(paramhe1)) {
      view.setAlpha(1.0F);
      c(paramhe1);
    } 
    for (i = arrayList2.size() - 1; i >= 0; i--) {
      arrayList3 = arrayList2.get(i);
      j(arrayList3, paramhe1);
      if (arrayList3.isEmpty())
        arrayList2.remove(i); 
    } 
    for (i = arrayList1.size() - 1; i >= 0; i--) {
      arrayList2 = arrayList1.get(i);
      for (int j = arrayList2.size() - 1; j >= 0; j--) {
        if (((lw)arrayList2.get(j)).a == paramhe1) {
          view.setTranslationY(0.0F);
          view.setTranslationX(0.0F);
          c(paramhe1);
          arrayList2.remove(j);
          if (arrayList2.isEmpty())
            arrayList1.remove(i); 
          break;
        } 
      } 
    } 
    for (i = arrayList.size() - 1; i >= 0; i--) {
      arrayList1 = arrayList.get(i);
      if (arrayList1.remove(paramhe1)) {
        view.setAlpha(1.0F);
        c(paramhe1);
        if (arrayList1.isEmpty())
          arrayList.remove(i); 
      } 
    } 
    this.q.remove(paramhe1);
    this.o.remove(paramhe1);
    this.r.remove(paramhe1);
    this.p.remove(paramhe1);
    i();
  }
  
  public final void e() {
    ArrayList<kw> arrayList3 = this.k;
    ArrayList<ArrayList<ArrayList<lw>>> arrayList1 = this.n;
    ArrayList<ArrayList<ArrayList<lw>>> arrayList2 = this.l;
    ArrayList<ArrayList<lw>> arrayList = this.m;
    ArrayList<he1> arrayList4 = this.i;
    ArrayList<he1> arrayList6 = this.h;
    ArrayList<lw> arrayList5 = this.j;
    int i;
    for (i = arrayList5.size() - 1; i >= 0; i--) {
      lw lw = arrayList5.get(i);
      View view = lw.a.b;
      view.setTranslationY(0.0F);
      view.setTranslationX(0.0F);
      c(lw.a);
      arrayList5.remove(i);
    } 
    for (i = arrayList6.size() - 1; i >= 0; i--) {
      c(arrayList6.get(i));
      arrayList6.remove(i);
    } 
    for (i = arrayList4.size() - 1; i >= 0; i--) {
      he1 he1 = arrayList4.get(i);
      he1.b.setAlpha(1.0F);
      c(he1);
      arrayList4.remove(i);
    } 
    for (i = arrayList3.size() - 1; i >= 0; i--) {
      kw kw = arrayList3.get(i);
      he1 he1 = kw.a;
      if (he1 != null)
        k(kw, he1); 
      he1 = kw.b;
      if (he1 != null)
        k(kw, he1); 
    } 
    arrayList3.clear();
    if (!f())
      return; 
    for (i = arrayList.size() - 1; i >= 0; i--) {
      arrayList5 = arrayList.get(i);
      for (int j = arrayList5.size() - 1; j >= 0; j--) {
        lw lw = arrayList5.get(j);
        View view = lw.a.b;
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        c(lw.a);
        arrayList5.remove(j);
        if (arrayList5.isEmpty())
          arrayList.remove(arrayList5); 
      } 
    } 
    for (i = arrayList2.size() - 1; i >= 0; i--) {
      arrayList = arrayList2.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        he1 he1 = (he1)arrayList.get(j);
        he1.b.setAlpha(1.0F);
        c(he1);
        arrayList.remove(j);
        if (arrayList.isEmpty())
          arrayList2.remove(arrayList); 
      } 
    } 
    for (i = arrayList1.size() - 1; i >= 0; i--) {
      arrayList = arrayList1.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        kw kw = (kw)arrayList.get(j);
        he1 he1 = kw.a;
        if (he1 != null)
          k(kw, he1); 
        he1 = kw.b;
        if (he1 != null)
          k(kw, he1); 
        if (arrayList.isEmpty())
          arrayList1.remove(arrayList); 
      } 
    } 
    h(this.q);
    h(this.p);
    h(this.o);
    h(this.r);
    arrayList1 = this.b;
    if (arrayList1.size() <= 0) {
      arrayList1.clear();
      return;
    } 
    arrayList1.get(0).getClass();
    tp.b();
  }
  
  public final boolean f() {
    return (!this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty());
  }
  
  public final boolean g(he1 paramhe1, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramhe1.b;
    paramInt1 += (int)view.getTranslationX();
    paramInt2 += (int)paramhe1.b.getTranslationY();
    l(paramhe1);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if (i == 0 && j == 0) {
      c(paramhe1);
      return false;
    } 
    if (i != 0)
      view.setTranslationX(-i); 
    if (j != 0)
      view.setTranslationY(-j); 
    ArrayList<Object> arrayList = this.j;
    Object object = new Object();
    ((lw)object).a = paramhe1;
    ((lw)object).b = paramInt1;
    ((lw)object).c = paramInt2;
    ((lw)object).d = paramInt3;
    ((lw)object).e = paramInt4;
    arrayList.add(object);
    return true;
  }
  
  public final void i() {
    if (!f()) {
      ArrayList<E> arrayList = this.b;
      if (arrayList.size() <= 0) {
        arrayList.clear();
        return;
      } 
      arrayList.get(0).getClass();
      tp.b();
    } 
  }
  
  public final void j(ArrayList<kw> paramArrayList, he1 paramhe1) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      kw kw = paramArrayList.get(i);
      if (k(kw, paramhe1) && kw.a == null && kw.b == null)
        paramArrayList.remove(kw); 
    } 
  }
  
  public final boolean k(kw paramkw, he1 paramhe1) {
    if (paramkw.b == paramhe1) {
      paramkw.b = null;
    } else {
      if (paramkw.a == paramhe1) {
        paramkw.a = null;
        View view3 = paramhe1.b;
        View view4 = paramhe1.b;
        view3.setAlpha(1.0F);
        view4.setTranslationX(0.0F);
        view4.setTranslationY(0.0F);
        c(paramhe1);
        return true;
      } 
      return false;
    } 
    View view1 = paramhe1.b;
    View view2 = paramhe1.b;
    view1.setAlpha(1.0F);
    view2.setTranslationX(0.0F);
    view2.setTranslationY(0.0F);
    c(paramhe1);
    return true;
  }
  
  public final void l(he1 paramhe1) {
    if (s == null)
      s = (new ValueAnimator()).getInterpolator(); 
    paramhe1.b.animate().setInterpolator(s);
    d(paramhe1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */