import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class mf0 extends m32 {
  public lf0 c;
  
  public OverScroller d;
  
  public boolean e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public VelocityTracker i;
  
  public final void A(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    z(paramCoordinatorLayout, paramView, paramInt, -2147483648, 2147483647);
  }
  
  public final boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: ifge -> 21
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual getContext : ()Landroid/content/Context;
    //   12: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   15: invokevirtual getScaledTouchSlop : ()I
    //   18: putfield h : I
    //   21: aload_3
    //   22: invokevirtual getActionMasked : ()I
    //   25: iconst_2
    //   26: if_icmpne -> 102
    //   29: aload_0
    //   30: getfield e : Z
    //   33: ifeq -> 102
    //   36: aload_0
    //   37: getfield f : I
    //   40: istore #4
    //   42: iload #4
    //   44: iconst_m1
    //   45: if_icmpne -> 51
    //   48: goto -> 284
    //   51: aload_3
    //   52: iload #4
    //   54: invokevirtual findPointerIndex : (I)I
    //   57: istore #4
    //   59: iload #4
    //   61: iconst_m1
    //   62: if_icmpne -> 68
    //   65: goto -> 284
    //   68: aload_3
    //   69: iload #4
    //   71: invokevirtual getY : (I)F
    //   74: f2i
    //   75: istore #4
    //   77: iload #4
    //   79: aload_0
    //   80: getfield g : I
    //   83: isub
    //   84: invokestatic abs : (I)I
    //   87: aload_0
    //   88: getfield h : I
    //   91: if_icmple -> 102
    //   94: aload_0
    //   95: iload #4
    //   97: putfield g : I
    //   100: iconst_1
    //   101: ireturn
    //   102: aload_3
    //   103: invokevirtual getActionMasked : ()I
    //   106: ifne -> 270
    //   109: aload_0
    //   110: iconst_m1
    //   111: putfield f : I
    //   114: aload_3
    //   115: invokevirtual getX : ()F
    //   118: f2i
    //   119: istore #5
    //   121: aload_3
    //   122: invokevirtual getY : ()F
    //   125: f2i
    //   126: istore #4
    //   128: aload_0
    //   129: checkcast com/google/android/material/appbar/AppBarLayout$BaseBehavior
    //   132: astore #7
    //   134: aload_2
    //   135: checkcast com/google/android/material/appbar/AppBarLayout
    //   138: astore #8
    //   140: aload #7
    //   142: getfield n : Ljava/lang/ref/WeakReference;
    //   145: astore #7
    //   147: aload #7
    //   149: ifnull -> 184
    //   152: aload #7
    //   154: invokevirtual get : ()Ljava/lang/Object;
    //   157: checkcast android/view/View
    //   160: astore #7
    //   162: aload #7
    //   164: ifnull -> 202
    //   167: aload #7
    //   169: invokevirtual isShown : ()Z
    //   172: ifeq -> 202
    //   175: aload #7
    //   177: iconst_m1
    //   178: invokevirtual canScrollVertically : (I)Z
    //   181: ifne -> 202
    //   184: aload_1
    //   185: aload_2
    //   186: iload #5
    //   188: iload #4
    //   190: invokevirtual p : (Landroid/view/View;II)Z
    //   193: ifeq -> 202
    //   196: iconst_1
    //   197: istore #6
    //   199: goto -> 205
    //   202: iconst_0
    //   203: istore #6
    //   205: aload_0
    //   206: iload #6
    //   208: putfield e : Z
    //   211: iload #6
    //   213: ifeq -> 270
    //   216: aload_0
    //   217: iload #4
    //   219: putfield g : I
    //   222: aload_0
    //   223: aload_3
    //   224: iconst_0
    //   225: invokevirtual getPointerId : (I)I
    //   228: putfield f : I
    //   231: aload_0
    //   232: getfield i : Landroid/view/VelocityTracker;
    //   235: ifnonnull -> 245
    //   238: aload_0
    //   239: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   242: putfield i : Landroid/view/VelocityTracker;
    //   245: aload_0
    //   246: getfield d : Landroid/widget/OverScroller;
    //   249: astore_1
    //   250: aload_1
    //   251: ifnull -> 270
    //   254: aload_1
    //   255: invokevirtual isFinished : ()Z
    //   258: ifne -> 270
    //   261: aload_0
    //   262: getfield d : Landroid/widget/OverScroller;
    //   265: invokevirtual abortAnimation : ()V
    //   268: iconst_1
    //   269: ireturn
    //   270: aload_0
    //   271: getfield i : Landroid/view/VelocityTracker;
    //   274: astore_1
    //   275: aload_1
    //   276: ifnull -> 284
    //   279: aload_1
    //   280: aload_3
    //   281: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   284: iconst_0
    //   285: ireturn
  }
  
  public final boolean v(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #5
    //   6: iload #5
    //   8: iconst_1
    //   9: if_icmpeq -> 167
    //   12: iload #5
    //   14: iconst_2
    //   15: if_icmpeq -> 77
    //   18: iload #5
    //   20: iconst_3
    //   21: if_icmpeq -> 363
    //   24: iload #5
    //   26: bipush #6
    //   28: if_icmpeq -> 34
    //   31: goto -> 161
    //   34: aload_3
    //   35: invokevirtual getActionIndex : ()I
    //   38: ifne -> 47
    //   41: iconst_1
    //   42: istore #5
    //   44: goto -> 50
    //   47: iconst_0
    //   48: istore #5
    //   50: aload_0
    //   51: aload_3
    //   52: iload #5
    //   54: invokevirtual getPointerId : (I)I
    //   57: putfield f : I
    //   60: aload_0
    //   61: aload_3
    //   62: iload #5
    //   64: invokevirtual getY : (I)F
    //   67: ldc 0.5
    //   69: fadd
    //   70: f2i
    //   71: putfield g : I
    //   74: goto -> 161
    //   77: aload_3
    //   78: aload_0
    //   79: getfield f : I
    //   82: invokevirtual findPointerIndex : (I)I
    //   85: istore #5
    //   87: iload #5
    //   89: iconst_m1
    //   90: if_icmpne -> 96
    //   93: goto -> 431
    //   96: aload_3
    //   97: iload #5
    //   99: invokevirtual getY : (I)F
    //   102: f2i
    //   103: istore #5
    //   105: aload_0
    //   106: getfield g : I
    //   109: istore #6
    //   111: aload_0
    //   112: iload #5
    //   114: putfield g : I
    //   117: aload_2
    //   118: checkcast com/google/android/material/appbar/AppBarLayout
    //   121: astore #9
    //   123: aload #9
    //   125: invokevirtual getDownNestedScrollRange : ()I
    //   128: ineg
    //   129: istore #7
    //   131: aload #9
    //   133: invokevirtual getTopInset : ()I
    //   136: istore #8
    //   138: aload_0
    //   139: aload_1
    //   140: aload_2
    //   141: aload_0
    //   142: invokevirtual y : ()I
    //   145: iload #6
    //   147: iload #5
    //   149: isub
    //   150: isub
    //   151: iload #8
    //   153: iload #7
    //   155: iadd
    //   156: iconst_0
    //   157: invokevirtual z : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I
    //   160: pop
    //   161: iconst_0
    //   162: istore #6
    //   164: goto -> 402
    //   167: aload_0
    //   168: getfield i : Landroid/view/VelocityTracker;
    //   171: astore #9
    //   173: aload #9
    //   175: ifnull -> 363
    //   178: aload #9
    //   180: aload_3
    //   181: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   184: aload_0
    //   185: getfield i : Landroid/view/VelocityTracker;
    //   188: sipush #1000
    //   191: invokevirtual computeCurrentVelocity : (I)V
    //   194: aload_0
    //   195: getfield i : Landroid/view/VelocityTracker;
    //   198: aload_0
    //   199: getfield f : I
    //   202: invokevirtual getYVelocity : (I)F
    //   205: fstore #4
    //   207: aload_2
    //   208: checkcast com/google/android/material/appbar/AppBarLayout
    //   211: astore #9
    //   213: aload #9
    //   215: invokevirtual getTotalScrollRange : ()I
    //   218: ineg
    //   219: istore #5
    //   221: aload_0
    //   222: getfield c : Llf0;
    //   225: astore #10
    //   227: aload #10
    //   229: ifnull -> 244
    //   232: aload_2
    //   233: aload #10
    //   235: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   238: pop
    //   239: aload_0
    //   240: aconst_null
    //   241: putfield c : Llf0;
    //   244: aload_0
    //   245: getfield d : Landroid/widget/OverScroller;
    //   248: ifnonnull -> 266
    //   251: aload_0
    //   252: new android/widget/OverScroller
    //   255: dup
    //   256: aload_2
    //   257: invokevirtual getContext : ()Landroid/content/Context;
    //   260: invokespecial <init> : (Landroid/content/Context;)V
    //   263: putfield d : Landroid/widget/OverScroller;
    //   266: aload_0
    //   267: getfield d : Landroid/widget/OverScroller;
    //   270: iconst_0
    //   271: aload_0
    //   272: invokevirtual w : ()I
    //   275: iconst_0
    //   276: fload #4
    //   278: invokestatic round : (F)I
    //   281: iconst_0
    //   282: iconst_0
    //   283: iload #5
    //   285: iconst_0
    //   286: invokevirtual fling : (IIIIIIII)V
    //   289: aload_0
    //   290: getfield d : Landroid/widget/OverScroller;
    //   293: invokevirtual computeScrollOffset : ()Z
    //   296: ifeq -> 324
    //   299: new lf0
    //   302: dup
    //   303: aload_0
    //   304: aload_1
    //   305: aload_2
    //   306: iconst_0
    //   307: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   310: astore_1
    //   311: aload_0
    //   312: aload_1
    //   313: putfield c : Llf0;
    //   316: aload_2
    //   317: aload_1
    //   318: invokevirtual postOnAnimation : (Ljava/lang/Runnable;)V
    //   321: goto -> 357
    //   324: aload_0
    //   325: checkcast com/google/android/material/appbar/AppBarLayout$BaseBehavior
    //   328: aload_1
    //   329: aload #9
    //   331: invokevirtual H : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
    //   334: aload #9
    //   336: getfield n : Z
    //   339: ifeq -> 357
    //   342: aload #9
    //   344: aload #9
    //   346: aload_1
    //   347: invokestatic D : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
    //   350: invokevirtual h : (Landroid/view/View;)Z
    //   353: invokevirtual g : (Z)Z
    //   356: pop
    //   357: iconst_1
    //   358: istore #5
    //   360: goto -> 366
    //   363: iconst_0
    //   364: istore #5
    //   366: aload_0
    //   367: iconst_0
    //   368: putfield e : Z
    //   371: aload_0
    //   372: iconst_m1
    //   373: putfield f : I
    //   376: aload_0
    //   377: getfield i : Landroid/view/VelocityTracker;
    //   380: astore_1
    //   381: iload #5
    //   383: istore #6
    //   385: aload_1
    //   386: ifnull -> 402
    //   389: aload_1
    //   390: invokevirtual recycle : ()V
    //   393: aload_0
    //   394: aconst_null
    //   395: putfield i : Landroid/view/VelocityTracker;
    //   398: iload #5
    //   400: istore #6
    //   402: aload_0
    //   403: getfield i : Landroid/view/VelocityTracker;
    //   406: astore_1
    //   407: aload_1
    //   408: ifnull -> 416
    //   411: aload_1
    //   412: aload_3
    //   413: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   416: aload_0
    //   417: getfield e : Z
    //   420: ifne -> 433
    //   423: iload #6
    //   425: ifeq -> 431
    //   428: goto -> 433
    //   431: iconst_0
    //   432: ireturn
    //   433: iconst_1
    //   434: ireturn
  }
  
  public abstract int y();
  
  public abstract int z(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */