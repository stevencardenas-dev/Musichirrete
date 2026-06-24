import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class kn0 {
  public int a = -1;
  
  public RecyclerView b;
  
  public a c;
  
  public boolean d;
  
  public boolean e;
  
  public View f;
  
  public final bd g;
  
  public boolean h;
  
  public final LinearInterpolator i;
  
  public final DecelerateInterpolator j;
  
  public PointF k;
  
  public final DisplayMetrics l;
  
  public boolean m;
  
  public float n;
  
  public int o;
  
  public int p;
  
  public kn0(Context paramContext) {
    Object object = new Object();
    ((bd)object).d = -1;
    ((bd)object).e = false;
    ((bd)object).f = 0;
    ((bd)object).a = 0;
    ((bd)object).b = 0;
    ((bd)object).c = Integer.MIN_VALUE;
    ((bd)object).g = null;
    this.g = (bd)object;
    this.i = new LinearInterpolator();
    this.j = new DecelerateInterpolator();
    this.m = false;
    this.o = 0;
    this.p = 0;
    this.l = paramContext.getResources().getDisplayMetrics();
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1)
          return paramInt4 - paramInt2; 
        l0.l("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        return 0;
      } 
      paramInt1 = paramInt3 - paramInt1;
      if (paramInt1 > 0)
        return paramInt1; 
      paramInt1 = paramInt4 - paramInt2;
      return (paramInt1 < 0) ? paramInt1 : 0;
    } 
    return paramInt3 - paramInt1;
  }
  
  public int b(View paramView, int paramInt) {
    a a1 = this.c;
    if (a1 == null || !a1.o())
      return 0; 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    return a(a.L(paramView) - sd1.leftMargin, a.O(paramView) + sd1.rightMargin, a1.getPaddingLeft(), a1.p - a1.getPaddingRight(), paramInt);
  }
  
  public int c(View paramView, int paramInt) {
    a a1 = this.c;
    if (a1 == null || !a1.p())
      return 0; 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    return a(a.P(paramView) - sd1.topMargin, a.J(paramView) + sd1.bottomMargin, a1.getPaddingTop(), a1.q - a1.getPaddingBottom(), paramInt);
  }
  
  public float d(DisplayMetrics paramDisplayMetrics) {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  public int e(int paramInt) {
    float f = Math.abs(paramInt);
    if (!this.m) {
      this.n = d(this.l);
      this.m = true;
    } 
    return (int)Math.ceil((f * this.n));
  }
  
  public PointF f(int paramInt) {
    a a1 = this.c;
    if (a1 instanceof ce1)
      return ((ce1)a1).e(paramInt); 
    StringBuilder stringBuilder = new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
    stringBuilder.append(ce1.class.getCanonicalName());
    Log.w("RecyclerView", stringBuilder.toString());
    return null;
  }
  
  public final void g(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   4: astore #8
    //   6: aload_0
    //   7: getfield a : I
    //   10: istore #6
    //   12: iconst_m1
    //   13: istore #5
    //   15: iload #6
    //   17: iconst_m1
    //   18: if_icmpeq -> 26
    //   21: aload #8
    //   23: ifnonnull -> 30
    //   26: aload_0
    //   27: invokevirtual i : ()V
    //   30: aload_0
    //   31: getfield d : Z
    //   34: ifeq -> 108
    //   37: aload_0
    //   38: getfield f : Landroid/view/View;
    //   41: ifnonnull -> 108
    //   44: aload_0
    //   45: getfield c : Landroidx/recyclerview/widget/a;
    //   48: ifnull -> 108
    //   51: aload_0
    //   52: aload_0
    //   53: getfield a : I
    //   56: invokevirtual f : (I)Landroid/graphics/PointF;
    //   59: astore #9
    //   61: aload #9
    //   63: ifnull -> 108
    //   66: aload #9
    //   68: getfield x : F
    //   71: fstore_3
    //   72: fload_3
    //   73: fconst_0
    //   74: fcmpl
    //   75: ifne -> 88
    //   78: aload #9
    //   80: getfield y : F
    //   83: fconst_0
    //   84: fcmpl
    //   85: ifeq -> 108
    //   88: aload #8
    //   90: fload_3
    //   91: invokestatic signum : (F)F
    //   94: f2i
    //   95: aload #9
    //   97: getfield y : F
    //   100: invokestatic signum : (F)F
    //   103: f2i
    //   104: aconst_null
    //   105: invokevirtual j0 : (II[I)V
    //   108: iconst_0
    //   109: istore #6
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield d : Z
    //   116: aload_0
    //   117: getfield f : Landroid/view/View;
    //   120: astore #10
    //   122: aload_0
    //   123: getfield g : Lbd;
    //   126: astore #9
    //   128: aload #10
    //   130: ifnull -> 218
    //   133: aload_0
    //   134: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   137: invokevirtual getClass : ()Ljava/lang/Class;
    //   140: pop
    //   141: aload #10
    //   143: invokestatic O : (Landroid/view/View;)Lhe1;
    //   146: astore #10
    //   148: aload #10
    //   150: ifnull -> 160
    //   153: aload #10
    //   155: invokevirtual d : ()I
    //   158: istore #5
    //   160: iload #5
    //   162: aload_0
    //   163: getfield a : I
    //   166: if_icmpne -> 204
    //   169: aload_0
    //   170: getfield f : Landroid/view/View;
    //   173: astore #10
    //   175: aload #8
    //   177: getfield j0 : Lde1;
    //   180: astore #11
    //   182: aload_0
    //   183: aload #10
    //   185: aload #9
    //   187: invokevirtual h : (Landroid/view/View;Lbd;)V
    //   190: aload #9
    //   192: aload #8
    //   194: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   197: aload_0
    //   198: invokevirtual i : ()V
    //   201: goto -> 218
    //   204: ldc 'RecyclerView'
    //   206: ldc_w 'Passed over target position while smooth scrolling.'
    //   209: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   212: pop
    //   213: aload_0
    //   214: aconst_null
    //   215: putfield f : Landroid/view/View;
    //   218: aload_0
    //   219: getfield e : Z
    //   222: ifeq -> 578
    //   225: aload #8
    //   227: getfield j0 : Lde1;
    //   230: astore #10
    //   232: aload_0
    //   233: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   236: getfield p : Landroidx/recyclerview/widget/a;
    //   239: invokevirtual G : ()I
    //   242: ifne -> 252
    //   245: aload_0
    //   246: invokevirtual i : ()V
    //   249: goto -> 534
    //   252: aload_0
    //   253: getfield o : I
    //   256: istore #7
    //   258: iload #7
    //   260: iload_1
    //   261: isub
    //   262: istore #5
    //   264: iload #5
    //   266: istore_1
    //   267: iload #7
    //   269: iload #5
    //   271: imul
    //   272: ifgt -> 277
    //   275: iconst_0
    //   276: istore_1
    //   277: aload_0
    //   278: iload_1
    //   279: putfield o : I
    //   282: aload_0
    //   283: getfield p : I
    //   286: istore #7
    //   288: iload #7
    //   290: iload_2
    //   291: isub
    //   292: istore #5
    //   294: iload #5
    //   296: istore_2
    //   297: iload #7
    //   299: iload #5
    //   301: imul
    //   302: ifgt -> 307
    //   305: iconst_0
    //   306: istore_2
    //   307: aload_0
    //   308: iload_2
    //   309: putfield p : I
    //   312: iload_1
    //   313: ifne -> 534
    //   316: iload_2
    //   317: ifne -> 534
    //   320: aload_0
    //   321: aload_0
    //   322: getfield a : I
    //   325: invokevirtual f : (I)Landroid/graphics/PointF;
    //   328: astore #10
    //   330: aload #10
    //   332: ifnull -> 521
    //   335: aload #10
    //   337: getfield x : F
    //   340: fstore #4
    //   342: fload #4
    //   344: fconst_0
    //   345: fcmpl
    //   346: ifne -> 362
    //   349: aload #10
    //   351: getfield y : F
    //   354: fconst_0
    //   355: fcmpl
    //   356: ifne -> 362
    //   359: goto -> 521
    //   362: aload #10
    //   364: getfield y : F
    //   367: fstore_3
    //   368: fload_3
    //   369: fload_3
    //   370: fmul
    //   371: fload #4
    //   373: fload #4
    //   375: fmul
    //   376: fadd
    //   377: f2d
    //   378: invokestatic sqrt : (D)D
    //   381: d2f
    //   382: fstore #4
    //   384: aload #10
    //   386: getfield x : F
    //   389: fload #4
    //   391: fdiv
    //   392: fstore_3
    //   393: aload #10
    //   395: fload_3
    //   396: putfield x : F
    //   399: aload #10
    //   401: getfield y : F
    //   404: fload #4
    //   406: fdiv
    //   407: fstore #4
    //   409: aload #10
    //   411: fload #4
    //   413: putfield y : F
    //   416: aload_0
    //   417: aload #10
    //   419: putfield k : Landroid/graphics/PointF;
    //   422: aload_0
    //   423: fload_3
    //   424: ldc_w 10000.0
    //   427: fmul
    //   428: f2i
    //   429: putfield o : I
    //   432: aload_0
    //   433: fload #4
    //   435: ldc_w 10000.0
    //   438: fmul
    //   439: f2i
    //   440: putfield p : I
    //   443: aload_0
    //   444: sipush #10000
    //   447: invokevirtual e : (I)I
    //   450: istore #5
    //   452: aload_0
    //   453: getfield o : I
    //   456: i2f
    //   457: ldc_w 1.2
    //   460: fmul
    //   461: f2i
    //   462: istore_2
    //   463: aload_0
    //   464: getfield p : I
    //   467: i2f
    //   468: ldc_w 1.2
    //   471: fmul
    //   472: f2i
    //   473: istore_1
    //   474: iload #5
    //   476: i2f
    //   477: ldc_w 1.2
    //   480: fmul
    //   481: f2i
    //   482: istore #5
    //   484: aload #9
    //   486: iload_2
    //   487: putfield a : I
    //   490: aload #9
    //   492: iload_1
    //   493: putfield b : I
    //   496: aload #9
    //   498: iload #5
    //   500: putfield c : I
    //   503: aload #9
    //   505: aload_0
    //   506: getfield i : Landroid/view/animation/LinearInterpolator;
    //   509: putfield g : Ljava/lang/Object;
    //   512: aload #9
    //   514: iconst_1
    //   515: putfield e : Z
    //   518: goto -> 534
    //   521: aload #9
    //   523: aload_0
    //   524: getfield a : I
    //   527: putfield d : I
    //   530: aload_0
    //   531: invokevirtual i : ()V
    //   534: iload #6
    //   536: istore_1
    //   537: aload #9
    //   539: getfield d : I
    //   542: iflt -> 547
    //   545: iconst_1
    //   546: istore_1
    //   547: aload #9
    //   549: aload #8
    //   551: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   554: iload_1
    //   555: ifeq -> 578
    //   558: aload_0
    //   559: getfield e : Z
    //   562: ifeq -> 578
    //   565: aload_0
    //   566: iconst_1
    //   567: putfield d : Z
    //   570: aload #8
    //   572: getfield g0 : Lge1;
    //   575: invokevirtual b : ()V
    //   578: return
  }
  
  public void h(View paramView, bd parambd) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Landroid/graphics/PointF;
    //   4: astore #6
    //   6: iconst_0
    //   7: istore #4
    //   9: aload #6
    //   11: ifnull -> 43
    //   14: aload #6
    //   16: getfield x : F
    //   19: fconst_0
    //   20: fcmpl
    //   21: istore_3
    //   22: iload_3
    //   23: ifne -> 29
    //   26: goto -> 43
    //   29: iload_3
    //   30: ifle -> 38
    //   33: iconst_1
    //   34: istore_3
    //   35: goto -> 45
    //   38: iconst_m1
    //   39: istore_3
    //   40: goto -> 45
    //   43: iconst_0
    //   44: istore_3
    //   45: aload_0
    //   46: aload_1
    //   47: iload_3
    //   48: invokevirtual b : (Landroid/view/View;I)I
    //   51: istore #5
    //   53: aload_0
    //   54: getfield k : Landroid/graphics/PointF;
    //   57: astore #6
    //   59: iload #4
    //   61: istore_3
    //   62: aload #6
    //   64: ifnull -> 96
    //   67: aload #6
    //   69: getfield y : F
    //   72: fconst_0
    //   73: fcmpl
    //   74: istore_3
    //   75: iload_3
    //   76: ifne -> 85
    //   79: iload #4
    //   81: istore_3
    //   82: goto -> 96
    //   85: iload_3
    //   86: ifle -> 94
    //   89: iconst_1
    //   90: istore_3
    //   91: goto -> 96
    //   94: iconst_m1
    //   95: istore_3
    //   96: aload_0
    //   97: aload_1
    //   98: iload_3
    //   99: invokevirtual c : (Landroid/view/View;I)I
    //   102: istore #4
    //   104: aload_0
    //   105: iload #4
    //   107: iload #4
    //   109: imul
    //   110: iload #5
    //   112: iload #5
    //   114: imul
    //   115: iadd
    //   116: i2d
    //   117: invokestatic sqrt : (D)D
    //   120: d2i
    //   121: invokevirtual e : (I)I
    //   124: i2d
    //   125: ldc2_w 0.3356
    //   128: ddiv
    //   129: invokestatic ceil : (D)D
    //   132: d2i
    //   133: istore_3
    //   134: iload_3
    //   135: ifle -> 178
    //   138: iload #5
    //   140: ineg
    //   141: istore #5
    //   143: iload #4
    //   145: ineg
    //   146: istore #4
    //   148: aload_2
    //   149: iload #5
    //   151: putfield a : I
    //   154: aload_2
    //   155: iload #4
    //   157: putfield b : I
    //   160: aload_2
    //   161: iload_3
    //   162: putfield c : I
    //   165: aload_2
    //   166: aload_0
    //   167: getfield j : Landroid/view/animation/DecelerateInterpolator;
    //   170: putfield g : Ljava/lang/Object;
    //   173: aload_2
    //   174: iconst_1
    //   175: putfield e : Z
    //   178: return
  }
  
  public final void i() {
    if (!this.e)
      return; 
    this.e = false;
    this.p = 0;
    this.o = 0;
    this.k = null;
    this.b.j0.a = -1;
    this.f = null;
    this.a = -1;
    this.d = false;
    a a1 = this.c;
    if (a1.g == this)
      a1.g = null; 
    this.c = null;
    this.b = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */