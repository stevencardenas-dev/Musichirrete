import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class ge1 implements Runnable {
  public int b;
  
  public int c;
  
  public OverScroller e;
  
  public Interpolator f;
  
  public boolean g;
  
  public boolean h;
  
  public final RecyclerView i;
  
  public ge1(RecyclerView paramRecyclerView) {
    this.i = paramRecyclerView;
    fj0 fj0 = RecyclerView.L0;
    this.f = fj0;
    this.g = false;
    this.h = false;
    this.e = new OverScroller(paramRecyclerView.getContext(), fj0);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    RecyclerView recyclerView = this.i;
    recyclerView.setScrollState(2);
    this.c = 0;
    this.b = 0;
    Interpolator interpolator = this.f;
    fj0 fj0 = RecyclerView.L0;
    if (interpolator != fj0) {
      this.f = fj0;
      this.e = new OverScroller(recyclerView.getContext(), fj0);
    } 
    this.e.fling(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
    b();
  }
  
  public final void b() {
    if (this.g) {
      this.h = true;
      return;
    } 
    RecyclerView recyclerView = this.i;
    recyclerView.removeCallbacks(this);
    WeakHashMap weakHashMap = v22.a;
    recyclerView.postOnAnimation(this);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator) {
    RecyclerView recyclerView = this.i;
    int i = paramInt3;
    if (paramInt3 == Integer.MIN_VALUE) {
      int k = Math.abs(paramInt1);
      int j = Math.abs(paramInt2);
      if (k > j) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        paramInt3 = recyclerView.getWidth();
      } else {
        paramInt3 = recyclerView.getHeight();
      } 
      if (i != 0) {
        i = k;
      } else {
        i = j;
      } 
      i = Math.min((int)((i / paramInt3 + 1.0F) * 300.0F), 2000);
    } 
    Interpolator interpolator = paramInterpolator;
    if (paramInterpolator == null)
      interpolator = RecyclerView.L0; 
    if (this.f != interpolator) {
      this.f = interpolator;
      this.e = new OverScroller(recyclerView.getContext(), interpolator);
    } 
    this.c = 0;
    this.b = 0;
    recyclerView.setScrollState(2);
    this.e.startScroll(0, 0, paramInt1, paramInt2, i);
    b();
  }
  
  public final void run() {
    RecyclerView recyclerView = this.i;
    int[] arrayOfInt = recyclerView.v0;
    if (recyclerView.p == null) {
      recyclerView.removeCallbacks(this);
      this.e.abortAnimation();
      return;
    } 
    this.h = false;
    this.g = true;
    recyclerView.o();
    OverScroller overScroller = this.e;
    if (overScroller.computeScrollOffset()) {
      int k = overScroller.getCurrX();
      int i = overScroller.getCurrY();
      int m = this.b;
      int j = this.c;
      this.b = k;
      this.c = i;
      k = RecyclerView.n(k - m, recyclerView.K, recyclerView.M, recyclerView.getWidth());
      m = RecyclerView.n(i - j, recyclerView.L, recyclerView.N, recyclerView.getHeight());
      int[] arrayOfInt1 = recyclerView.v0;
      arrayOfInt1[0] = 0;
      arrayOfInt1[1] = 0;
      j = k;
      i = m;
      if (recyclerView.u(k, m, 1, arrayOfInt1, null)) {
        j = k - arrayOfInt[0];
        i = m - arrayOfInt[1];
      } 
      if (recyclerView.getOverScrollMode() != 2)
        recyclerView.m(j, i); 
      if (recyclerView.o != null) {
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        recyclerView.j0(j, i, arrayOfInt);
        int i2 = arrayOfInt[0];
        k = arrayOfInt[1];
        kn0 kn02 = recyclerView.p.g;
        if (kn02 != null && !kn02.d && kn02.e) {
          m = recyclerView.j0.b();
          if (m == 0) {
            kn02.i();
          } else if (kn02.a >= m) {
            kn02.a = m - 1;
            kn02.g(i2, k);
          } else {
            kn02.g(i2, k);
          } 
        } 
        m = j - i2;
        j = i2;
        i2 = i - k;
        i = j;
        j = k;
        k = i2;
      } else {
        boolean bool1 = false;
        boolean bool2 = false;
        k = i;
        m = j;
        j = bool2;
        i = bool1;
      } 
      if (!recyclerView.r.isEmpty())
        recyclerView.invalidate(); 
      arrayOfInt1 = recyclerView.v0;
      arrayOfInt1[0] = 0;
      arrayOfInt1[1] = 0;
      recyclerView.v(i, j, m, k, null, 1, arrayOfInt1);
      int i1 = m - arrayOfInt[0];
      int n = k - arrayOfInt[1];
      if (i != 0 || j != 0)
        recyclerView.w(i, j); 
      if (!RecyclerView.c(recyclerView))
        recyclerView.invalidate(); 
      if (overScroller.getCurrX() == overScroller.getFinalX()) {
        k = 1;
      } else {
        k = 0;
      } 
      if (overScroller.getCurrY() == overScroller.getFinalY()) {
        m = 1;
      } else {
        m = 0;
      } 
      if (overScroller.isFinished() || ((k != 0 || i1 != 0) && (m != 0 || n != 0))) {
        k = 1;
      } else {
        k = 0;
      } 
      kn0 kn01 = recyclerView.p.g;
      if ((kn01 == null || !kn01.d) && k != 0) {
        if (recyclerView.getOverScrollMode() != 2) {
          j = (int)overScroller.getCurrVelocity();
          if (i1 < 0) {
            i = -j;
          } else if (i1 > 0) {
            i = j;
          } else {
            i = 0;
          } 
          if (n < 0) {
            j = -j;
          } else if (n <= 0) {
            j = 0;
          } 
          if (i < 0) {
            recyclerView.y();
            if (recyclerView.K.isFinished())
              recyclerView.K.onAbsorb(-i); 
          } else if (i > 0) {
            recyclerView.z();
            if (recyclerView.M.isFinished())
              recyclerView.M.onAbsorb(i); 
          } 
          if (j < 0) {
            recyclerView.A();
            if (recyclerView.L.isFinished())
              recyclerView.L.onAbsorb(-j); 
          } else if (j > 0) {
            recyclerView.x();
            if (recyclerView.N.isFinished())
              recyclerView.N.onAbsorb(j); 
          } 
          if (i != 0 || j != 0)
            recyclerView.postInvalidateOnAnimation(); 
        } 
        if (RecyclerView.J0) {
          il il = recyclerView.i0;
          arrayOfInt1 = (int[])il.d;
          if (arrayOfInt1 != null)
            Arrays.fill(arrayOfInt1, -1); 
          il.c = 0;
        } 
      } else {
        b();
        rd0 rd0 = recyclerView.h0;
        if (rd0 != null)
          rd0.a(recyclerView, i, j); 
      } 
      if (Build.VERSION.SDK_INT >= 35)
        ld1.a((View)recyclerView, Math.abs(overScroller.getCurrVelocity())); 
    } 
    kn0 kn0 = recyclerView.p.g;
    if (kn0 != null && kn0.d)
      kn0.g(0, 0); 
    this.g = false;
    if (this.h) {
      recyclerView.removeCallbacks(this);
      WeakHashMap weakHashMap = v22.a;
      recyclerView.postOnAnimation(this);
      return;
    } 
    recyclerView.setScrollState(0);
    recyclerView.r0(1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ge1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */