import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class y22 {
  public static final fj0 w = new fj0(3);
  
  public int a;
  
  public final int b;
  
  public int c = -1;
  
  public float[] d;
  
  public float[] e;
  
  public float[] f;
  
  public float[] g;
  
  public int[] h;
  
  public int[] i;
  
  public int[] j;
  
  public int k;
  
  public VelocityTracker l;
  
  public final float m;
  
  public final float n;
  
  public final int o;
  
  public final OverScroller p;
  
  public final qv q;
  
  public View r;
  
  public boolean s;
  
  public final CoordinatorLayout t;
  
  public fj0 u;
  
  public final yi1 v = new yi1(9, this);
  
  public y22(Context paramContext, CoordinatorLayout paramCoordinatorLayout, qv paramqv) {
    if (paramqv != null) {
      this.t = paramCoordinatorLayout;
      this.q = paramqv;
      ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
      this.o = (int)((paramContext.getResources().getDisplayMetrics()).density * 20.0F + 0.5F);
      this.b = viewConfiguration.getScaledTouchSlop();
      this.m = viewConfiguration.getScaledMaximumFlingVelocity();
      this.n = viewConfiguration.getScaledMinimumFlingVelocity();
      this.u = w;
      this.p = new OverScroller(paramContext, new x22(this));
      return;
    } 
    k91.h("Callback may not be null");
    throw null;
  }
  
  public final void a() {
    this.c = -1;
    float[] arrayOfFloat = this.d;
    if (arrayOfFloat != null) {
      Arrays.fill(arrayOfFloat, 0.0F);
      Arrays.fill(this.e, 0.0F);
      Arrays.fill(this.f, 0.0F);
      Arrays.fill(this.g, 0.0F);
      Arrays.fill(this.h, 0);
      Arrays.fill(this.i, 0);
      Arrays.fill(this.j, 0);
      this.k = 0;
    } 
    VelocityTracker velocityTracker = this.l;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.l = null;
    } 
  }
  
  public final void b(View paramView, int paramInt) {
    ViewParent viewParent = paramView.getParent();
    CoordinatorLayout coordinatorLayout = this.t;
    if (viewParent == coordinatorLayout) {
      this.r = paramView;
      this.c = paramInt;
      this.q.N(paramView, paramInt);
      m(1);
      return;
    } 
    k91.o(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
  }
  
  public final boolean c(View paramView, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 7
    //   4: goto -> 121
    //   7: aload_0
    //   8: getfield q : Lqv;
    //   11: astore #7
    //   13: aload #7
    //   15: aload_1
    //   16: invokevirtual B : (Landroid/view/View;)I
    //   19: ifle -> 28
    //   22: iconst_1
    //   23: istore #4
    //   25: goto -> 31
    //   28: iconst_0
    //   29: istore #4
    //   31: aload #7
    //   33: invokevirtual D : ()I
    //   36: ifle -> 45
    //   39: iconst_1
    //   40: istore #5
    //   42: goto -> 48
    //   45: iconst_0
    //   46: istore #5
    //   48: aload_0
    //   49: getfield b : I
    //   52: istore #6
    //   54: iload #4
    //   56: ifeq -> 84
    //   59: iload #5
    //   61: ifeq -> 84
    //   64: fload_3
    //   65: fload_3
    //   66: fmul
    //   67: fload_2
    //   68: fload_2
    //   69: fmul
    //   70: fadd
    //   71: iload #6
    //   73: iload #6
    //   75: imul
    //   76: i2f
    //   77: fcmpl
    //   78: ifle -> 121
    //   81: goto -> 119
    //   84: iload #4
    //   86: ifeq -> 103
    //   89: fload_2
    //   90: invokestatic abs : (F)F
    //   93: iload #6
    //   95: i2f
    //   96: fcmpl
    //   97: ifle -> 121
    //   100: goto -> 119
    //   103: iload #5
    //   105: ifeq -> 121
    //   108: fload_3
    //   109: invokestatic abs : (F)F
    //   112: iload #6
    //   114: i2f
    //   115: fcmpl
    //   116: ifle -> 121
    //   119: iconst_1
    //   120: ireturn
    //   121: iconst_0
    //   122: ireturn
  }
  
  public final void d(int paramInt) {
    float[] arrayOfFloat = this.d;
    if (arrayOfFloat != null) {
      int j = this.k;
      int i = 1 << paramInt;
      if ((j & i) != 0) {
        arrayOfFloat[paramInt] = 0.0F;
        this.e[paramInt] = 0.0F;
        this.f[paramInt] = 0.0F;
        this.g[paramInt] = 0.0F;
        this.h[paramInt] = 0;
        this.i[paramInt] = 0;
        this.j[paramInt] = 0;
        this.k = (i ^ 0xFFFFFFFF) & j;
      } 
    } 
  }
  
  public final int e(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 0)
      return 0; 
    int i = this.t.getWidth();
    int j = i / 2;
    float f2 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f1 = j;
    f2 = (float)Math.sin(((f2 - 0.5F) * 0.47123894F));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {
      paramInt1 = Math.round(Math.abs((f2 * f1 + f1) / paramInt2) * 1000.0F) * 4;
    } else {
      paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F);
    } 
    return Math.min(paramInt1, 600);
  }
  
  public final boolean f() {
    if (this.a == 2) {
      OverScroller overScroller = this.p;
      boolean bool2 = overScroller.computeScrollOffset();
      int i = overScroller.getCurrX();
      int j = overScroller.getCurrY();
      int k = i - this.r.getLeft();
      int m = j - this.r.getTop();
      if (k != 0) {
        View view = this.r;
        WeakHashMap weakHashMap = v22.a;
        view.offsetLeftAndRight(k);
      } 
      if (m != 0) {
        View view = this.r;
        WeakHashMap weakHashMap = v22.a;
        view.offsetTopAndBottom(m);
      } 
      if (k != 0 || m != 0)
        this.q.P(this.r, i, j); 
      boolean bool1 = bool2;
      if (bool2) {
        bool1 = bool2;
        if (i == overScroller.getFinalX()) {
          bool1 = bool2;
          if (j == overScroller.getFinalY()) {
            overScroller.abortAnimation();
            bool1 = false;
          } 
        } 
      } 
      if (!bool1)
        this.t.post(this.v); 
    } 
    return (this.a == 2);
  }
  
  public final View g(int paramInt1, int paramInt2) {
    CoordinatorLayout coordinatorLayout = this.t;
    for (int i = coordinatorLayout.getChildCount() - 1; i >= 0; i--) {
      this.q.getClass();
      View view = coordinatorLayout.getChildAt(i);
      if (paramInt1 >= view.getLeft() && paramInt1 < view.getRight() && paramInt2 >= view.getTop() && paramInt2 < view.getBottom())
        return view; 
    } 
    return null;
  }
  
  public final boolean h(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    float f1;
    int j = this.r.getLeft();
    int k = this.r.getTop();
    int m = paramInt1 - j;
    int n = paramInt2 - k;
    OverScroller overScroller = this.p;
    if (m == 0 && n == 0) {
      overScroller.abortAnimation();
      m(0);
      return false;
    } 
    View view = this.r;
    paramInt2 = (int)this.n;
    int i = (int)this.m;
    int i1 = Math.abs(paramInt3);
    if (i1 < paramInt2) {
      paramInt1 = 0;
    } else {
      paramInt1 = paramInt3;
      if (i1 > i)
        if (paramInt3 > 0) {
          paramInt1 = i;
        } else {
          paramInt1 = -i;
        }  
    } 
    paramInt3 = Math.abs(paramInt4);
    if (paramInt3 < paramInt2) {
      paramInt2 = 0;
    } else {
      paramInt2 = paramInt4;
      if (paramInt3 > i)
        if (paramInt4 > 0) {
          paramInt2 = i;
        } else {
          paramInt2 = -i;
        }  
    } 
    int i3 = Math.abs(m);
    i1 = Math.abs(n);
    paramInt4 = Math.abs(paramInt1);
    int i2 = Math.abs(paramInt2);
    paramInt3 = paramInt4 + i2;
    i = i3 + i1;
    if (paramInt1 != 0) {
      f2 = paramInt4;
      f1 = paramInt3;
    } else {
      f2 = i3;
      f1 = i;
    } 
    float f3 = f2 / f1;
    if (paramInt2 != 0) {
      f1 = i2;
      f2 = paramInt3;
    } else {
      f1 = i1;
      f2 = i;
    } 
    f1 /= f2;
    qv qv1 = this.q;
    paramInt1 = e(m, paramInt1, qv1.B(view));
    paramInt2 = e(n, paramInt2, qv1.D());
    float f2 = paramInt1;
    paramInt1 = (int)(paramInt2 * f1 + f2 * f3);
    this.u = w;
    overScroller.startScroll(j, k, m, n, paramInt1);
    m(2);
    return true;
  }
  
  public final void i(MotionEvent paramMotionEvent) {
    int m = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getActionIndex();
    if (m == 0)
      a(); 
    if (this.l == null)
      this.l = VelocityTracker.obtain(); 
    this.l.addMovement(paramMotionEvent);
    int j = 0;
    int i = 0;
    if (m != 0) {
      if (m != 1) {
        View view1;
        qv qv1 = this.q;
        if (m != 2) {
          if (m != 3) {
            if (m != 5) {
              if (m == 6) {
                j = paramMotionEvent.getPointerId(k);
                if (this.a == 1 && j == this.c) {
                  k = paramMotionEvent.getPointerCount();
                  while (true) {
                    if (i < k) {
                      m = paramMotionEvent.getPointerId(i);
                      if (m != this.c) {
                        float f4 = paramMotionEvent.getX(i);
                        float f3 = paramMotionEvent.getY(i);
                        view1 = g((int)f4, (int)f3);
                        View view2 = this.r;
                        if (view1 == view2 && p(view2, m)) {
                          i = this.c;
                          break;
                        } 
                      } 
                      i++;
                      continue;
                    } 
                    i = -1;
                    break;
                  } 
                  if (i == -1)
                    j(); 
                } 
                d(j);
                return;
              } 
            } else {
              i = paramMotionEvent.getPointerId(k);
              float f3 = paramMotionEvent.getX(k);
              float f4 = paramMotionEvent.getY(k);
              k(f3, f4, i);
              if (this.a == 0) {
                p(g((int)f3, (int)f4), i);
                i = this.h[i];
                return;
              } 
              k = (int)f3;
              j = (int)f4;
              view = this.r;
              if (view != null && k >= view.getLeft() && k < view.getRight() && j >= view.getTop() && j < view.getBottom()) {
                p(this.r, i);
                return;
              } 
            } 
          } else {
            if (this.a == 1) {
              this.s = true;
              view1.Q(this.r, 0.0F, 0.0F);
              this.s = false;
              if (this.a == 1)
                m(0); 
            } 
            a();
            return;
          } 
        } else {
          if (this.a == 1) {
            i = this.c;
            if ((this.k & 1 << i) != 0) {
              i = view.findPointerIndex(i);
              if (i == -1)
                return; 
              float f4 = view.getX(i);
              float f3 = view.getY(i);
              float[] arrayOfFloat = this.f;
              i = this.c;
              m = (int)(f4 - arrayOfFloat[i]);
              int n = (int)(f3 - this.g[i]);
              j = this.r.getLeft() + m;
              k = this.r.getTop() + n;
              int i2 = this.r.getLeft();
              int i1 = this.r.getTop();
              i = j;
              if (m != 0) {
                i = view1.j(this.r, j);
                View view2 = this.r;
                WeakHashMap weakHashMap = v22.a;
                view2.offsetLeftAndRight(i - i2);
              } 
              j = k;
              if (n != 0) {
                j = view1.k(this.r, k);
                View view2 = this.r;
                WeakHashMap weakHashMap = v22.a;
                view2.offsetTopAndBottom(j - i1);
              } 
              if (m != 0 || n != 0)
                view1.P(this.r, i, j); 
            } else {
              return;
            } 
          } else {
            k = view.getPointerCount();
            for (i = j; i < k; i++) {
              j = view.getPointerId(i);
              if ((this.k & 1 << j) != 0) {
                float f4 = view.getX(i);
                float f6 = view.getY(i);
                float f5 = f4 - this.d[j];
                float f3 = f6 - this.e[j];
                Math.abs(f5);
                Math.abs(f3);
                m = this.h[j];
                Math.abs(f3);
                Math.abs(f5);
                m = this.h[j];
                Math.abs(f5);
                Math.abs(f3);
                m = this.h[j];
                Math.abs(f3);
                Math.abs(f5);
                m = this.h[j];
                if (this.a == 1)
                  break; 
                view1 = g((int)f4, (int)f6);
                if (c(view1, f5, f3) && p(view1, j))
                  break; 
              } 
            } 
          } 
          l((MotionEvent)view);
          return;
        } 
        return;
      } 
      if (this.a == 1)
        j(); 
      a();
      return;
    } 
    float f2 = view.getX();
    float f1 = view.getY();
    i = view.getPointerId(0);
    View view = g((int)f2, (int)f1);
    k(f2, f1, i);
    p(view, i);
    i = this.h[i];
  }
  
  public final void j() {
    float f1;
    VelocityTracker velocityTracker = this.l;
    float f2 = this.m;
    velocityTracker.computeCurrentVelocity(1000, f2);
    float f3 = this.l.getXVelocity(this.c);
    float f5 = Math.abs(f3);
    float f4 = this.n;
    if (f5 < f4) {
      f1 = 0.0F;
    } else {
      f1 = f3;
      if (f5 > f2)
        if (f3 > 0.0F) {
          f1 = f2;
        } else {
          f1 = -f2;
        }  
    } 
    f3 = this.l.getYVelocity(this.c);
    f5 = Math.abs(f3);
    if (f5 < f4) {
      f2 = 0.0F;
    } else if (f5 > f2) {
      if (f3 <= 0.0F)
        f2 = -f2; 
    } else {
      f2 = f3;
    } 
    this.s = true;
    this.q.Q(this.r, f1, f2);
    this.s = false;
    if (this.a == 1)
      m(0); 
  }
  
  public final void k(float paramFloat1, float paramFloat2, int paramInt) {
    float[] arrayOfFloat2 = this.d;
    int i = 0;
    if (arrayOfFloat2 == null || arrayOfFloat2.length <= paramInt) {
      int i1 = paramInt + 1;
      float[] arrayOfFloat3 = new float[i1];
      float[] arrayOfFloat6 = new float[i1];
      float[] arrayOfFloat4 = new float[i1];
      float[] arrayOfFloat5 = new float[i1];
      int[] arrayOfInt3 = new int[i1];
      int[] arrayOfInt1 = new int[i1];
      int[] arrayOfInt2 = new int[i1];
      if (arrayOfFloat2 != null) {
        System.arraycopy(arrayOfFloat2, 0, arrayOfFloat3, 0, arrayOfFloat2.length);
        arrayOfFloat2 = this.e;
        System.arraycopy(arrayOfFloat2, 0, arrayOfFloat6, 0, arrayOfFloat2.length);
        arrayOfFloat2 = this.f;
        System.arraycopy(arrayOfFloat2, 0, arrayOfFloat4, 0, arrayOfFloat2.length);
        arrayOfFloat2 = this.g;
        System.arraycopy(arrayOfFloat2, 0, arrayOfFloat5, 0, arrayOfFloat2.length);
        int[] arrayOfInt4 = this.h;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt3, 0, arrayOfInt4.length);
        arrayOfInt4 = this.i;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt1, 0, arrayOfInt4.length);
        arrayOfInt4 = this.j;
        System.arraycopy(arrayOfInt4, 0, arrayOfInt2, 0, arrayOfInt4.length);
      } 
      this.d = arrayOfFloat3;
      this.e = arrayOfFloat6;
      this.f = arrayOfFloat4;
      this.g = arrayOfFloat5;
      this.h = arrayOfInt3;
      this.i = arrayOfInt1;
      this.j = arrayOfInt2;
    } 
    float[] arrayOfFloat1 = this.d;
    this.f[paramInt] = paramFloat1;
    arrayOfFloat1[paramInt] = paramFloat1;
    arrayOfFloat1 = this.e;
    this.g[paramInt] = paramFloat2;
    arrayOfFloat1[paramInt] = paramFloat2;
    int[] arrayOfInt = this.h;
    int n = (int)paramFloat1;
    int m = (int)paramFloat2;
    CoordinatorLayout coordinatorLayout = this.t;
    int j = coordinatorLayout.getLeft();
    int k = this.o;
    if (n < j + k)
      i = 1; 
    j = i;
    if (m < coordinatorLayout.getTop() + k)
      j = i | 0x4; 
    i = j;
    if (n > coordinatorLayout.getRight() - k)
      i = j | 0x2; 
    j = i;
    if (m > coordinatorLayout.getBottom() - k)
      j = i | 0x8; 
    arrayOfInt[paramInt] = j;
    this.k |= 1 << paramInt;
  }
  
  public final void l(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getPointerCount();
    for (byte b = 0; b < i; b++) {
      int j = paramMotionEvent.getPointerId(b);
      if ((this.k & 1 << j) != 0) {
        float f1 = paramMotionEvent.getX(b);
        float f2 = paramMotionEvent.getY(b);
        this.f[j] = f1;
        this.g[j] = f2;
      } 
    } 
  }
  
  public final void m(int paramInt) {
    this.t.removeCallbacks(this.v);
    if (this.a != paramInt) {
      this.a = paramInt;
      this.q.O(paramInt);
      if (this.a == 0)
        this.r = null; 
    } 
  }
  
  public final boolean n(int paramInt1, int paramInt2) {
    if (this.s)
      return h(paramInt1, paramInt2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c)); 
    tp.f("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    return false;
  }
  
  public final boolean o(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #6
    //   6: aload_1
    //   7: invokevirtual getActionIndex : ()I
    //   10: istore #7
    //   12: iload #6
    //   14: ifne -> 21
    //   17: aload_0
    //   18: invokevirtual a : ()V
    //   21: aload_0
    //   22: getfield l : Landroid/view/VelocityTracker;
    //   25: ifnonnull -> 35
    //   28: aload_0
    //   29: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   32: putfield l : Landroid/view/VelocityTracker;
    //   35: aload_0
    //   36: getfield l : Landroid/view/VelocityTracker;
    //   39: aload_1
    //   40: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   43: iload #6
    //   45: ifeq -> 536
    //   48: iload #6
    //   50: iconst_1
    //   51: if_icmpeq -> 529
    //   54: iload #6
    //   56: iconst_2
    //   57: if_icmpeq -> 182
    //   60: iload #6
    //   62: iconst_3
    //   63: if_icmpeq -> 529
    //   66: iload #6
    //   68: iconst_5
    //   69: if_icmpeq -> 95
    //   72: iload #6
    //   74: bipush #6
    //   76: if_icmpeq -> 82
    //   79: goto -> 603
    //   82: aload_0
    //   83: aload_1
    //   84: iload #7
    //   86: invokevirtual getPointerId : (I)I
    //   89: invokevirtual d : (I)V
    //   92: goto -> 603
    //   95: aload_1
    //   96: iload #7
    //   98: invokevirtual getPointerId : (I)I
    //   101: istore #6
    //   103: aload_1
    //   104: iload #7
    //   106: invokevirtual getX : (I)F
    //   109: fstore_3
    //   110: aload_1
    //   111: iload #7
    //   113: invokevirtual getY : (I)F
    //   116: fstore_2
    //   117: aload_0
    //   118: fload_3
    //   119: fload_2
    //   120: iload #6
    //   122: invokevirtual k : (FFI)V
    //   125: aload_0
    //   126: getfield a : I
    //   129: istore #7
    //   131: iload #7
    //   133: ifne -> 148
    //   136: aload_0
    //   137: getfield h : [I
    //   140: iload #6
    //   142: iaload
    //   143: istore #6
    //   145: goto -> 603
    //   148: iload #7
    //   150: iconst_2
    //   151: if_icmpne -> 603
    //   154: aload_0
    //   155: fload_3
    //   156: f2i
    //   157: fload_2
    //   158: f2i
    //   159: invokevirtual g : (II)Landroid/view/View;
    //   162: astore_1
    //   163: aload_1
    //   164: aload_0
    //   165: getfield r : Landroid/view/View;
    //   168: if_acmpne -> 603
    //   171: aload_0
    //   172: aload_1
    //   173: iload #6
    //   175: invokevirtual p : (Landroid/view/View;I)Z
    //   178: pop
    //   179: goto -> 603
    //   182: aload_0
    //   183: getfield d : [F
    //   186: ifnull -> 603
    //   189: aload_0
    //   190: getfield e : [F
    //   193: ifnonnull -> 199
    //   196: goto -> 603
    //   199: aload_1
    //   200: invokevirtual getPointerCount : ()I
    //   203: istore #7
    //   205: iconst_0
    //   206: istore #6
    //   208: iload #6
    //   210: iload #7
    //   212: if_icmpge -> 521
    //   215: aload_1
    //   216: iload #6
    //   218: invokevirtual getPointerId : (I)I
    //   221: istore #8
    //   223: aload_0
    //   224: getfield k : I
    //   227: iconst_1
    //   228: iload #8
    //   230: ishl
    //   231: iand
    //   232: ifeq -> 515
    //   235: aload_1
    //   236: iload #6
    //   238: invokevirtual getX : (I)F
    //   241: fstore_2
    //   242: aload_1
    //   243: iload #6
    //   245: invokevirtual getY : (I)F
    //   248: fstore #4
    //   250: fload_2
    //   251: aload_0
    //   252: getfield d : [F
    //   255: iload #8
    //   257: faload
    //   258: fsub
    //   259: fstore_3
    //   260: fload #4
    //   262: aload_0
    //   263: getfield e : [F
    //   266: iload #8
    //   268: faload
    //   269: fsub
    //   270: fstore #5
    //   272: aload_0
    //   273: fload_2
    //   274: f2i
    //   275: fload #4
    //   277: f2i
    //   278: invokevirtual g : (II)Landroid/view/View;
    //   281: astore #16
    //   283: aload_0
    //   284: aload #16
    //   286: fload_3
    //   287: fload #5
    //   289: invokevirtual c : (Landroid/view/View;FF)Z
    //   292: istore #15
    //   294: iload #15
    //   296: ifeq -> 405
    //   299: aload #16
    //   301: invokevirtual getLeft : ()I
    //   304: istore #9
    //   306: fload_3
    //   307: f2i
    //   308: istore #10
    //   310: aload_0
    //   311: getfield q : Lqv;
    //   314: astore #17
    //   316: aload #17
    //   318: aload #16
    //   320: iload #10
    //   322: iload #9
    //   324: iadd
    //   325: invokevirtual j : (Landroid/view/View;I)I
    //   328: istore #12
    //   330: aload #16
    //   332: invokevirtual getTop : ()I
    //   335: istore #13
    //   337: aload #17
    //   339: aload #16
    //   341: fload #5
    //   343: f2i
    //   344: iload #13
    //   346: iadd
    //   347: invokevirtual k : (Landroid/view/View;I)I
    //   350: istore #10
    //   352: aload #17
    //   354: aload #16
    //   356: invokevirtual B : (Landroid/view/View;)I
    //   359: istore #14
    //   361: aload #17
    //   363: invokevirtual D : ()I
    //   366: istore #11
    //   368: iload #14
    //   370: ifeq -> 385
    //   373: iload #14
    //   375: ifle -> 405
    //   378: iload #12
    //   380: iload #9
    //   382: if_icmpne -> 405
    //   385: iload #11
    //   387: ifeq -> 521
    //   390: iload #11
    //   392: ifle -> 405
    //   395: iload #10
    //   397: iload #13
    //   399: if_icmpne -> 405
    //   402: goto -> 521
    //   405: fload_3
    //   406: invokestatic abs : (F)F
    //   409: pop
    //   410: fload #5
    //   412: invokestatic abs : (F)F
    //   415: pop
    //   416: aload_0
    //   417: getfield h : [I
    //   420: iload #8
    //   422: iaload
    //   423: istore #9
    //   425: fload #5
    //   427: invokestatic abs : (F)F
    //   430: pop
    //   431: fload_3
    //   432: invokestatic abs : (F)F
    //   435: pop
    //   436: aload_0
    //   437: getfield h : [I
    //   440: iload #8
    //   442: iaload
    //   443: istore #9
    //   445: fload_3
    //   446: invokestatic abs : (F)F
    //   449: pop
    //   450: fload #5
    //   452: invokestatic abs : (F)F
    //   455: pop
    //   456: aload_0
    //   457: getfield h : [I
    //   460: iload #8
    //   462: iaload
    //   463: istore #9
    //   465: fload #5
    //   467: invokestatic abs : (F)F
    //   470: pop
    //   471: fload_3
    //   472: invokestatic abs : (F)F
    //   475: pop
    //   476: aload_0
    //   477: getfield h : [I
    //   480: iload #8
    //   482: iaload
    //   483: istore #9
    //   485: aload_0
    //   486: getfield a : I
    //   489: iconst_1
    //   490: if_icmpne -> 496
    //   493: goto -> 521
    //   496: iload #15
    //   498: ifeq -> 515
    //   501: aload_0
    //   502: aload #16
    //   504: iload #8
    //   506: invokevirtual p : (Landroid/view/View;I)Z
    //   509: ifeq -> 515
    //   512: goto -> 521
    //   515: iinc #6, 1
    //   518: goto -> 208
    //   521: aload_0
    //   522: aload_1
    //   523: invokevirtual l : (Landroid/view/MotionEvent;)V
    //   526: goto -> 603
    //   529: aload_0
    //   530: invokevirtual a : ()V
    //   533: goto -> 603
    //   536: aload_1
    //   537: invokevirtual getX : ()F
    //   540: fstore_2
    //   541: aload_1
    //   542: invokevirtual getY : ()F
    //   545: fstore_3
    //   546: aload_1
    //   547: iconst_0
    //   548: invokevirtual getPointerId : (I)I
    //   551: istore #6
    //   553: aload_0
    //   554: fload_2
    //   555: fload_3
    //   556: iload #6
    //   558: invokevirtual k : (FFI)V
    //   561: aload_0
    //   562: fload_2
    //   563: f2i
    //   564: fload_3
    //   565: f2i
    //   566: invokevirtual g : (II)Landroid/view/View;
    //   569: astore_1
    //   570: aload_1
    //   571: aload_0
    //   572: getfield r : Landroid/view/View;
    //   575: if_acmpne -> 594
    //   578: aload_0
    //   579: getfield a : I
    //   582: iconst_2
    //   583: if_icmpne -> 594
    //   586: aload_0
    //   587: aload_1
    //   588: iload #6
    //   590: invokevirtual p : (Landroid/view/View;I)Z
    //   593: pop
    //   594: aload_0
    //   595: getfield h : [I
    //   598: iload #6
    //   600: iaload
    //   601: istore #6
    //   603: aload_0
    //   604: getfield a : I
    //   607: iconst_1
    //   608: if_icmpne -> 613
    //   611: iconst_1
    //   612: ireturn
    //   613: iconst_0
    //   614: ireturn
  }
  
  public final boolean p(View paramView, int paramInt) {
    if (paramView == this.r && this.c == paramInt)
      return true; 
    if (paramView != null && this.q.g0(paramView, paramInt)) {
      this.c = paramInt;
      b(paramView, paramInt);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */