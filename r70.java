import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class r70 extends pd1 implements ud1 {
  public static final int[] C = new int[] { 16842919 };
  
  public static final int[] D = new int[0];
  
  public int A;
  
  public final e3 B;
  
  public final int a;
  
  public final int b;
  
  public final StateListDrawable c;
  
  public final Drawable d;
  
  public final int e;
  
  public final int f;
  
  public final StateListDrawable g;
  
  public final Drawable h;
  
  public final int i;
  
  public final int j;
  
  public int k;
  
  public int l;
  
  public float m;
  
  public int n;
  
  public int o;
  
  public float p;
  
  public int q = 0;
  
  public int r = 0;
  
  public final RecyclerView s;
  
  public boolean t = false;
  
  public boolean u = false;
  
  public int v = 0;
  
  public int w = 0;
  
  public final int[] x = new int[2];
  
  public final int[] y = new int[2];
  
  public final ValueAnimator z;
  
  public r70(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3) {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.z = valueAnimator;
    this.A = 0;
    e3 e31 = new e3(12, this);
    this.B = e31;
    q70 q70 = new q70(0, this);
    this.c = paramStateListDrawable1;
    this.d = paramDrawable1;
    this.g = paramStateListDrawable2;
    this.h = paramDrawable2;
    this.e = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.f = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.i = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.j = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.a = paramInt2;
    this.b = paramInt3;
    paramStateListDrawable1.setAlpha(255);
    paramDrawable1.setAlpha(255);
    valueAnimator.addListener((Animator.AnimatorListener)new i70(this));
    valueAnimator.addUpdateListener(new vd(3, this));
    RecyclerView recyclerView = this.s;
    if (recyclerView == paramRecyclerView)
      return; 
    if (recyclerView != null) {
      recyclerView.g0(this);
      recyclerView = this.s;
      recyclerView.s.remove(this);
      if (recyclerView.t == this)
        recyclerView.t = null; 
      ArrayList arrayList = this.s.l0;
      if (arrayList != null)
        arrayList.remove(q70); 
      this.s.removeCallbacks(e31);
    } 
    this.s = paramRecyclerView;
    paramRecyclerView.h(this);
    this.s.s.add(this);
    this.s.i(q70);
  }
  
  public static int i(float paramFloat1, float paramFloat2, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramArrayOfint[1] - paramArrayOfint[0];
    if (i != 0) {
      paramFloat1 = (paramFloat2 - paramFloat1) / i;
      paramInt3 = paramInt1 - paramInt3;
      paramInt1 = (int)(paramFloat1 * paramInt3);
      paramInt2 += paramInt1;
      if (paramInt2 < paramInt3 && paramInt2 >= 0)
        return paramInt1; 
    } 
    return 0;
  }
  
  public final void a(MotionEvent paramMotionEvent) {
    if (this.v != 0)
      if (paramMotionEvent.getAction() == 0) {
        boolean bool1 = h(paramMotionEvent.getX(), paramMotionEvent.getY());
        boolean bool2 = g(paramMotionEvent.getX(), paramMotionEvent.getY());
        if (bool1 || bool2) {
          if (bool2) {
            this.w = 1;
            this.p = (int)paramMotionEvent.getX();
          } else if (bool1) {
            this.w = 2;
            this.m = (int)paramMotionEvent.getY();
          } 
          j(2);
          return;
        } 
      } else {
        if (paramMotionEvent.getAction() == 1 && this.v == 2) {
          this.m = 0.0F;
          this.p = 0.0F;
          j(1);
          this.w = 0;
          return;
        } 
        if (paramMotionEvent.getAction() == 2 && this.v == 2) {
          k();
          int j = this.w;
          RecyclerView recyclerView = this.s;
          int i = this.b;
          if (j == 1) {
            float f = paramMotionEvent.getX();
            int[] arrayOfInt = this.y;
            arrayOfInt[0] = i;
            j = this.q - i;
            arrayOfInt[1] = j;
            f = Math.max(i, Math.min(j, f));
            if (Math.abs(this.o - f) >= 2.0F) {
              j = i(this.p, f, arrayOfInt, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.q);
              if (j != 0)
                recyclerView.scrollBy(j, 0); 
              this.p = f;
            } 
          } 
          if (this.w == 2) {
            float f = paramMotionEvent.getY();
            int[] arrayOfInt = this.x;
            arrayOfInt[0] = i;
            j = this.r - i;
            arrayOfInt[1] = j;
            f = Math.max(i, Math.min(j, f));
            if (Math.abs(this.l - f) >= 2.0F) {
              i = i(this.m, f, arrayOfInt, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.r);
              if (i != 0)
                recyclerView.scrollBy(0, i); 
              this.m = f;
            } 
          } 
        } 
      }  
  }
  
  public final boolean b(MotionEvent paramMotionEvent) {
    int i = this.v;
    if (i == 1) {
      boolean bool1 = h(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = g(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (paramMotionEvent.getAction() == 0 && (bool1 || bool2)) {
        if (bool2) {
          this.w = 1;
          this.p = (int)paramMotionEvent.getX();
        } else if (bool1) {
          this.w = 2;
          this.m = (int)paramMotionEvent.getY();
        } 
        j(2);
        return true;
      } 
    } else if (i == 2) {
      return true;
    } 
    return false;
  }
  
  public final void c(boolean paramBoolean) {}
  
  public final void f(Canvas paramCanvas, RecyclerView paramRecyclerView) {
    int i = this.q;
    RecyclerView recyclerView = this.s;
    if (i != recyclerView.getWidth() || this.r != recyclerView.getHeight()) {
      this.q = recyclerView.getWidth();
      this.r = recyclerView.getHeight();
      j(0);
      return;
    } 
    if (this.A != 0) {
      if (this.t) {
        int j = this.q;
        i = this.e;
        j -= i;
        int k = this.l;
        int m = this.k;
        k -= m / 2;
        StateListDrawable stateListDrawable = this.c;
        stateListDrawable.setBounds(0, 0, i, m);
        int n = this.f;
        m = this.r;
        Drawable drawable = this.d;
        drawable.setBounds(0, 0, n, m);
        if (recyclerView.getLayoutDirection() == 1) {
          drawable.draw(paramCanvas);
          paramCanvas.translate(i, k);
          paramCanvas.scale(-1.0F, 1.0F);
          stateListDrawable.draw(paramCanvas);
          paramCanvas.scale(-1.0F, 1.0F);
          paramCanvas.translate(-i, -k);
        } else {
          paramCanvas.translate(j, 0.0F);
          drawable.draw(paramCanvas);
          paramCanvas.translate(0.0F, k);
          stateListDrawable.draw(paramCanvas);
          paramCanvas.translate(-j, -k);
        } 
      } 
      if (this.u) {
        i = this.r;
        int j = this.i;
        i -= j;
        int k = this.o;
        int m = this.n;
        k -= m / 2;
        StateListDrawable stateListDrawable = this.g;
        stateListDrawable.setBounds(0, 0, m, j);
        j = this.q;
        m = this.j;
        Drawable drawable = this.h;
        drawable.setBounds(0, 0, j, m);
        paramCanvas.translate(0.0F, i);
        drawable.draw(paramCanvas);
        paramCanvas.translate(k, 0.0F);
        stateListDrawable.draw(paramCanvas);
        paramCanvas.translate(-k, -i);
      } 
    } 
  }
  
  public final boolean g(float paramFloat1, float paramFloat2) {
    if (paramFloat2 >= (this.r - this.i)) {
      int i = this.o;
      int j = this.n;
      if (paramFloat1 >= (i - j / 2) && paramFloat1 <= (j / 2 + i))
        return true; 
    } 
    return false;
  }
  
  public final boolean h(float paramFloat1, float paramFloat2) {
    int i = this.s.getLayoutDirection();
    int j = this.e;
    if ((i == 1) ? (paramFloat1 <= j) : (paramFloat1 >= (this.q - j))) {
      i = this.l;
      j = this.k / 2;
      if (paramFloat2 >= (i - j) && paramFloat2 <= (j + i))
        return true; 
    } 
    return false;
  }
  
  public final void j(int paramInt) {
    RecyclerView recyclerView = this.s;
    e3 e31 = this.B;
    StateListDrawable stateListDrawable = this.c;
    if (paramInt == 2 && this.v != 2) {
      stateListDrawable.setState(C);
      recyclerView.removeCallbacks(e31);
    } 
    if (paramInt == 0) {
      recyclerView.invalidate();
    } else {
      k();
    } 
    if (this.v == 2 && paramInt != 2) {
      stateListDrawable.setState(D);
      recyclerView.removeCallbacks(e31);
      recyclerView.postDelayed(e31, 1200L);
    } else if (paramInt == 1) {
      recyclerView.removeCallbacks(e31);
      recyclerView.postDelayed(e31, 1500L);
    } 
    this.v = paramInt;
  }
  
  public final void k() {
    int i = this.A;
    ValueAnimator valueAnimator = this.z;
    if (i != 0) {
      if (i != 3)
        return; 
      valueAnimator.cancel();
    } 
    this.A = 1;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0F });
    valueAnimator.setDuration(500L);
    valueAnimator.setStartDelay(0L);
    valueAnimator.start();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */