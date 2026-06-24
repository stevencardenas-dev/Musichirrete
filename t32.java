import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

public abstract class t32 extends ViewGroup {
  public static final int[] b0 = new int[] { 16842931 };
  
  public static final ij c0 = new ij(14);
  
  public static final fj0 d0 = new fj0(4);
  
  public boolean A;
  
  public int B;
  
  public int C;
  
  public int D;
  
  public float E;
  
  public float F;
  
  public float G;
  
  public float H;
  
  public int I = -1;
  
  public VelocityTracker J;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public EdgeEffect O;
  
  public EdgeEffect P;
  
  public boolean Q = true;
  
  public boolean R;
  
  public int S;
  
  public ArrayList T;
  
  public r32 U;
  
  public ArrayList V;
  
  public final yi1 W = new yi1(10, this);
  
  public int a0 = 0;
  
  public int b;
  
  public final ArrayList c = new ArrayList();
  
  public final p32 e = (p32)new Object();
  
  public final Rect f = new Rect();
  
  public p51 g;
  
  public int h;
  
  public int i = -1;
  
  public Parcelable j = null;
  
  public ClassLoader k = null;
  
  public Scroller l;
  
  public boolean m;
  
  public kt n;
  
  public int o;
  
  public Drawable p;
  
  public int q;
  
  public int r;
  
  public float s = -3.4028235E38F;
  
  public float t = Float.MAX_VALUE;
  
  public int u;
  
  public boolean v;
  
  public boolean w;
  
  public boolean x;
  
  public int y = 1;
  
  public boolean z;
  
  public t32(Context paramContext) {
    super(paramContext);
    l();
  }
  
  public t32(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    l();
  }
  
  public static boolean d(int paramInt1, int paramInt2, int paramInt3, View paramView, boolean paramBoolean) {
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int k = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
        View view = viewGroup.getChildAt(i);
        int m = paramInt2 + k;
        if (m >= view.getLeft() && m < view.getRight()) {
          int n = paramInt3 + j;
          if (n >= view.getTop() && n < view.getBottom() && d(paramInt1, m - view.getLeft(), n - view.getTop(), view, true))
            return true; 
        } 
      } 
    } 
    return (paramBoolean && paramView.canScrollHorizontally(-paramInt1));
  }
  
  private int getClientWidth() {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean) {
    if (this.w != paramBoolean)
      this.w = paramBoolean; 
  }
  
  public final p32 a(int paramInt1, int paramInt2) {
    Object object = new Object();
    ((p32)object).b = paramInt1;
    ((p32)object).a = this.g.d(this, paramInt1);
    this.g.getClass();
    ((p32)object).d = 1.0F;
    ArrayList<Object> arrayList = this.c;
    if (paramInt2 < 0 || paramInt2 >= arrayList.size()) {
      arrayList.add(object);
      return (p32)object;
    } 
    arrayList.add(paramInt2, object);
    return (p32)object;
  }
  
  public final void addFocusables(ArrayList<t32> paramArrayList, int paramInt1, int paramInt2) {
    int j = paramArrayList.size();
    int i = getDescendantFocusability();
    if (i != 393216)
      for (byte b = 0; b < getChildCount(); b++) {
        View view = getChildAt(b);
        if (view.getVisibility() == 0) {
          p32 p321 = i(view);
          if (p321 != null && p321.b == this.h)
            view.addFocusables(paramArrayList, paramInt1, paramInt2); 
        } 
      }  
    if ((i == 262144 && j != paramArrayList.size()) || !isFocusable() || ((paramInt2 & 0x1) == 1 && isInTouchMode() && !isFocusableInTouchMode()))
      return; 
    paramArrayList.add(this);
  }
  
  public final void addTouchables(ArrayList paramArrayList) {
    for (byte b = 0; b < getChildCount(); b++) {
      View view = getChildAt(b);
      if (view.getVisibility() == 0) {
        p32 p321 = i(view);
        if (p321 != null && p321.b == this.h)
          view.addTouchables(paramArrayList); 
      } 
    } 
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool1;
    ViewGroup.LayoutParams layoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams))
      layoutParams = generateDefaultLayoutParams(); 
    paramLayoutParams = layoutParams;
    boolean bool2 = ((q32)paramLayoutParams).a;
    if (paramView.getClass().getAnnotation(o32.class) != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    bool2 |= bool1;
    ((q32)paramLayoutParams).a = bool2;
    if (this.v) {
      if (!bool2) {
        ((q32)paramLayoutParams).d = true;
        addViewInLayout(paramView, paramInt, layoutParams);
        return;
      } 
      tp.f("Cannot add pager decor view during layout");
      return;
    } 
    super.addView(paramView, paramInt, layoutParams);
  }
  
  public final void b(r32 paramr32) {
    if (this.T == null)
      this.T = new ArrayList(); 
    this.T.add(paramr32);
  }
  
  public final boolean c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual findFocus : ()Landroid/view/View;
    //   4: astore #7
    //   6: aload #7
    //   8: aload_0
    //   9: if_acmpne -> 18
    //   12: aconst_null
    //   13: astore #6
    //   15: goto -> 165
    //   18: aload #7
    //   20: astore #6
    //   22: aload #7
    //   24: ifnull -> 165
    //   27: aload #7
    //   29: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   32: astore #6
    //   34: aload #6
    //   36: instanceof android/view/ViewGroup
    //   39: ifeq -> 67
    //   42: aload #6
    //   44: aload_0
    //   45: if_acmpne -> 55
    //   48: aload #7
    //   50: astore #6
    //   52: goto -> 165
    //   55: aload #6
    //   57: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   62: astore #6
    //   64: goto -> 34
    //   67: new java/lang/StringBuilder
    //   70: dup
    //   71: invokespecial <init> : ()V
    //   74: astore #8
    //   76: aload #8
    //   78: aload #7
    //   80: invokevirtual getClass : ()Ljava/lang/Class;
    //   83: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #7
    //   92: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   95: astore #6
    //   97: aload #6
    //   99: instanceof android/view/ViewGroup
    //   102: ifeq -> 140
    //   105: aload #8
    //   107: ldc_w ' => '
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload #8
    //   116: aload #6
    //   118: invokevirtual getClass : ()Ljava/lang/Class;
    //   121: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #6
    //   130: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   135: astore #6
    //   137: goto -> 97
    //   140: ldc_w 'arrowScroll tried to find focus based on non-child current focused view '
    //   143: aload #8
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   151: astore #6
    //   153: getstatic com/android/billingclient/api/wH/DJqHMztxflt.AsspocM : Ljava/lang/String;
    //   156: aload #6
    //   158: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   161: pop
    //   162: goto -> 12
    //   165: invokestatic getInstance : ()Landroid/view/FocusFinder;
    //   168: aload_0
    //   169: aload #6
    //   171: iload_1
    //   172: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   175: astore #8
    //   177: iconst_1
    //   178: istore #4
    //   180: iconst_0
    //   181: istore #5
    //   183: aload #8
    //   185: ifnull -> 334
    //   188: aload #8
    //   190: aload #6
    //   192: if_acmpeq -> 334
    //   195: aload_0
    //   196: getfield f : Landroid/graphics/Rect;
    //   199: astore #7
    //   201: iload_1
    //   202: bipush #17
    //   204: if_icmpne -> 271
    //   207: aload_0
    //   208: aload #8
    //   210: aload #7
    //   212: invokevirtual h : (Landroid/view/View;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   215: getfield left : I
    //   218: istore_3
    //   219: aload_0
    //   220: aload #6
    //   222: aload #7
    //   224: invokevirtual h : (Landroid/view/View;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   227: getfield left : I
    //   230: istore_2
    //   231: aload #6
    //   233: ifnull -> 261
    //   236: iload_3
    //   237: iload_2
    //   238: if_icmplt -> 261
    //   241: aload_0
    //   242: getfield h : I
    //   245: istore_2
    //   246: iload_2
    //   247: ifle -> 392
    //   250: aload_0
    //   251: iload_2
    //   252: iconst_1
    //   253: isub
    //   254: iconst_1
    //   255: invokevirtual w : (IZ)V
    //   258: goto -> 395
    //   261: aload #8
    //   263: invokevirtual requestFocus : ()Z
    //   266: istore #4
    //   268: goto -> 395
    //   271: iload #5
    //   273: istore #4
    //   275: iload_1
    //   276: bipush #66
    //   278: if_icmpne -> 395
    //   281: aload_0
    //   282: aload #8
    //   284: aload #7
    //   286: invokevirtual h : (Landroid/view/View;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   289: getfield left : I
    //   292: istore_3
    //   293: aload_0
    //   294: aload #6
    //   296: aload #7
    //   298: invokevirtual h : (Landroid/view/View;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    //   301: getfield left : I
    //   304: istore_2
    //   305: aload #6
    //   307: ifnull -> 324
    //   310: iload_3
    //   311: iload_2
    //   312: if_icmpgt -> 324
    //   315: aload_0
    //   316: invokevirtual o : ()Z
    //   319: istore #4
    //   321: goto -> 268
    //   324: aload #8
    //   326: invokevirtual requestFocus : ()Z
    //   329: istore #4
    //   331: goto -> 268
    //   334: iload_1
    //   335: bipush #17
    //   337: if_icmpeq -> 372
    //   340: iload_1
    //   341: iconst_1
    //   342: if_icmpne -> 348
    //   345: goto -> 372
    //   348: iload_1
    //   349: bipush #66
    //   351: if_icmpeq -> 363
    //   354: iload #5
    //   356: istore #4
    //   358: iload_1
    //   359: iconst_2
    //   360: if_icmpne -> 395
    //   363: aload_0
    //   364: invokevirtual o : ()Z
    //   367: istore #4
    //   369: goto -> 395
    //   372: aload_0
    //   373: getfield h : I
    //   376: istore_2
    //   377: iload_2
    //   378: ifle -> 392
    //   381: aload_0
    //   382: iload_2
    //   383: iconst_1
    //   384: isub
    //   385: iconst_1
    //   386: invokevirtual w : (IZ)V
    //   389: goto -> 395
    //   392: iconst_0
    //   393: istore #4
    //   395: iload #4
    //   397: ifeq -> 408
    //   400: aload_0
    //   401: iload_1
    //   402: invokestatic getContantForFocusDirection : (I)I
    //   405: invokevirtual playSoundEffect : (I)V
    //   408: iload #4
    //   410: ireturn
  }
  
  public final boolean canScrollHorizontally(int paramInt) {
    if (this.g == null)
      return false; 
    int j = getClientWidth();
    int i = getScrollX();
    return (paramInt < 0) ? ((i > (int)(j * this.s))) : ((paramInt > 0 && i < (int)(j * this.t)));
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof q32 && super.checkLayoutParams(paramLayoutParams));
  }
  
  public final void computeScroll() {
    this.m = true;
    if (!this.l.isFinished() && this.l.computeScrollOffset()) {
      int j = getScrollX();
      int m = getScrollY();
      int k = this.l.getCurrX();
      int i = this.l.getCurrY();
      if (j != k || m != i) {
        scrollTo(k, i);
        if (!p(k)) {
          this.l.abortAnimation();
          scrollTo(0, i);
        } 
      } 
      WeakHashMap weakHashMap = v22.a;
      postInvalidateOnAnimation();
      return;
    } 
    e(true);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial dispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   5: ifne -> 151
    //   8: aload_1
    //   9: invokevirtual getAction : ()I
    //   12: ifne -> 140
    //   15: aload_1
    //   16: invokevirtual getKeyCode : ()I
    //   19: istore_2
    //   20: iload_2
    //   21: bipush #21
    //   23: if_icmpeq -> 100
    //   26: iload_2
    //   27: bipush #22
    //   29: if_icmpeq -> 74
    //   32: iload_2
    //   33: bipush #61
    //   35: if_icmpeq -> 41
    //   38: goto -> 140
    //   41: aload_1
    //   42: invokevirtual hasNoModifiers : ()Z
    //   45: ifeq -> 57
    //   48: aload_0
    //   49: iconst_2
    //   50: invokevirtual c : (I)Z
    //   53: istore_3
    //   54: goto -> 142
    //   57: aload_1
    //   58: iconst_1
    //   59: invokevirtual hasModifiers : (I)Z
    //   62: ifeq -> 140
    //   65: aload_0
    //   66: iconst_1
    //   67: invokevirtual c : (I)Z
    //   70: istore_3
    //   71: goto -> 142
    //   74: aload_1
    //   75: iconst_2
    //   76: invokevirtual hasModifiers : (I)Z
    //   79: ifeq -> 90
    //   82: aload_0
    //   83: invokevirtual o : ()Z
    //   86: istore_3
    //   87: goto -> 142
    //   90: aload_0
    //   91: bipush #66
    //   93: invokevirtual c : (I)Z
    //   96: istore_3
    //   97: goto -> 142
    //   100: aload_1
    //   101: iconst_2
    //   102: invokevirtual hasModifiers : (I)Z
    //   105: ifeq -> 130
    //   108: aload_0
    //   109: getfield h : I
    //   112: istore_2
    //   113: iload_2
    //   114: ifle -> 140
    //   117: aload_0
    //   118: iload_2
    //   119: iconst_1
    //   120: isub
    //   121: iconst_1
    //   122: invokevirtual w : (IZ)V
    //   125: iconst_1
    //   126: istore_3
    //   127: goto -> 142
    //   130: aload_0
    //   131: bipush #17
    //   133: invokevirtual c : (I)Z
    //   136: istore_3
    //   137: goto -> 142
    //   140: iconst_0
    //   141: istore_3
    //   142: iload_3
    //   143: ifeq -> 149
    //   146: goto -> 151
    //   149: iconst_0
    //   150: ireturn
    //   151: iconst_1
    //   152: ireturn
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 4096)
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent); 
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() == 0) {
        p32 p321 = i(view);
        if (p321 != null && p321.b == this.h && view.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))
          return true; 
      } 
    } 
    return false;
  }
  
  public final void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: invokevirtual getOverScrollMode : ()I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore #8
    //   13: iconst_0
    //   14: istore #7
    //   16: iload_2
    //   17: ifeq -> 65
    //   20: iload_2
    //   21: iconst_1
    //   22: if_icmpne -> 48
    //   25: aload_0
    //   26: getfield g : Lp51;
    //   29: astore #9
    //   31: aload #9
    //   33: ifnull -> 48
    //   36: aload #9
    //   38: invokevirtual c : ()I
    //   41: iconst_1
    //   42: if_icmple -> 48
    //   45: goto -> 65
    //   48: aload_0
    //   49: getfield O : Landroid/widget/EdgeEffect;
    //   52: invokevirtual finish : ()V
    //   55: aload_0
    //   56: getfield P : Landroid/widget/EdgeEffect;
    //   59: invokevirtual finish : ()V
    //   62: goto -> 262
    //   65: aload_0
    //   66: getfield O : Landroid/widget/EdgeEffect;
    //   69: invokevirtual isFinished : ()Z
    //   72: ifne -> 158
    //   75: aload_1
    //   76: invokevirtual save : ()I
    //   79: istore_2
    //   80: aload_0
    //   81: invokevirtual getHeight : ()I
    //   84: aload_0
    //   85: invokevirtual getPaddingTop : ()I
    //   88: isub
    //   89: aload_0
    //   90: invokevirtual getPaddingBottom : ()I
    //   93: isub
    //   94: istore #5
    //   96: aload_0
    //   97: invokevirtual getWidth : ()I
    //   100: istore #4
    //   102: aload_1
    //   103: ldc_w 270.0
    //   106: invokevirtual rotate : (F)V
    //   109: iload #5
    //   111: ineg
    //   112: istore_3
    //   113: aload_1
    //   114: aload_0
    //   115: invokevirtual getPaddingTop : ()I
    //   118: iload_3
    //   119: iadd
    //   120: i2f
    //   121: aload_0
    //   122: getfield s : F
    //   125: iload #4
    //   127: i2f
    //   128: fmul
    //   129: invokevirtual translate : (FF)V
    //   132: aload_0
    //   133: getfield O : Landroid/widget/EdgeEffect;
    //   136: iload #5
    //   138: iload #4
    //   140: invokevirtual setSize : (II)V
    //   143: aload_0
    //   144: getfield O : Landroid/widget/EdgeEffect;
    //   147: aload_1
    //   148: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   151: istore #7
    //   153: aload_1
    //   154: iload_2
    //   155: invokevirtual restoreToCount : (I)V
    //   158: iload #7
    //   160: istore #8
    //   162: aload_0
    //   163: getfield P : Landroid/widget/EdgeEffect;
    //   166: invokevirtual isFinished : ()Z
    //   169: ifne -> 262
    //   172: aload_1
    //   173: invokevirtual save : ()I
    //   176: istore #4
    //   178: aload_0
    //   179: invokevirtual getWidth : ()I
    //   182: istore #5
    //   184: aload_0
    //   185: invokevirtual getHeight : ()I
    //   188: istore_2
    //   189: aload_0
    //   190: invokevirtual getPaddingTop : ()I
    //   193: istore #6
    //   195: aload_0
    //   196: invokevirtual getPaddingBottom : ()I
    //   199: istore_3
    //   200: aload_1
    //   201: ldc_w 90.0
    //   204: invokevirtual rotate : (F)V
    //   207: aload_1
    //   208: aload_0
    //   209: invokevirtual getPaddingTop : ()I
    //   212: ineg
    //   213: i2f
    //   214: aload_0
    //   215: getfield t : F
    //   218: fconst_1
    //   219: fadd
    //   220: fneg
    //   221: iload #5
    //   223: i2f
    //   224: fmul
    //   225: invokevirtual translate : (FF)V
    //   228: aload_0
    //   229: getfield P : Landroid/widget/EdgeEffect;
    //   232: iload_2
    //   233: iload #6
    //   235: isub
    //   236: iload_3
    //   237: isub
    //   238: iload #5
    //   240: invokevirtual setSize : (II)V
    //   243: iload #7
    //   245: aload_0
    //   246: getfield P : Landroid/widget/EdgeEffect;
    //   249: aload_1
    //   250: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   253: ior
    //   254: istore #8
    //   256: aload_1
    //   257: iload #4
    //   259: invokevirtual restoreToCount : (I)V
    //   262: iload #8
    //   264: ifeq -> 275
    //   267: getstatic v22.a : Ljava/util/WeakHashMap;
    //   270: astore_1
    //   271: aload_0
    //   272: invokevirtual postInvalidateOnAnimation : ()V
    //   275: return
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.p;
    if (drawable != null && drawable.isStateful())
      drawable.setState(getDrawableState()); 
  }
  
  public final void e(boolean paramBoolean) {
    boolean bool;
    if (this.a0 == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      setScrollingCacheEnabled(false);
      if (!this.l.isFinished()) {
        this.l.abortAnimation();
        int m = getScrollX();
        int i = getScrollY();
        int k = this.l.getCurrX();
        int j = this.l.getCurrY();
        if (m != k || i != j) {
          scrollTo(k, j);
          if (k != m)
            p(k); 
        } 
      } 
    } 
    this.x = false;
    byte b = 0;
    while (true) {
      ArrayList<p32> arrayList = this.c;
      if (b < arrayList.size()) {
        p32 p321 = arrayList.get(b);
        if (p321.c) {
          p321.c = false;
          bool = true;
        } 
        b++;
        continue;
      } 
      if (bool) {
        yi1 yi11 = this.W;
        if (paramBoolean) {
          WeakHashMap weakHashMap = v22.a;
          postOnAnimation(yi11);
          return;
        } 
        yi11.run();
      } 
      return;
    } 
  }
  
  public final void f() {
    int i = this.g.c();
    this.b = i;
    ArrayList<p32> arrayList = this.c;
    if (arrayList.size() < this.y * 2 + 1 && arrayList.size() < i) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = this.h;
    int j;
    for (j = 0; j < arrayList.size(); j++) {
      p32 p321 = arrayList.get(j);
      p51 p511 = this.g;
      Object object = p321.a;
      p511.getClass();
    } 
    Collections.sort(arrayList, c0);
    if (i != 0) {
      j = getChildCount();
      for (i = 0; i < j; i++) {
        q32 q32 = (q32)getChildAt(i).getLayoutParams();
        if (!q32.a)
          q32.c = 0.0F; 
      } 
      x(k, 0, false, true);
      requestLayout();
    } 
  }
  
  public final void g(int paramInt) {
    r32 r321 = this.U;
    if (r321 != null)
      r321.q(paramInt); 
    ArrayList arrayList = this.T;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        r32 r322 = this.T.get(b);
        if (r322 != null)
          r322.q(paramInt); 
      } 
    } 
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
    ((q32)layoutParams).c = 0.0F;
    return layoutParams;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    Context context = getContext();
    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(context, paramAttributeSet);
    ((q32)layoutParams).c = 0.0F;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, b0);
    ((q32)layoutParams).b = typedArray.getInteger(0, 48);
    typedArray.recycle();
    return layoutParams;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return generateDefaultLayoutParams();
  }
  
  public p51 getAdapter() {
    return this.g;
  }
  
  public final int getChildDrawingOrder(int paramInt1, int paramInt2) {
    throw null;
  }
  
  public int getCurrentItem() {
    return this.h;
  }
  
  public int getOffscreenPageLimit() {
    return this.y;
  }
  
  public int getPageMargin() {
    return this.o;
  }
  
  public final Rect h(View paramView, Rect paramRect) {
    Rect rect = paramRect;
    if (paramRect == null)
      rect = new Rect(); 
    if (paramView == null) {
      rect.set(0, 0, 0, 0);
      return rect;
    } 
    rect.left = paramView.getLeft();
    rect.right = paramView.getRight();
    rect.top = paramView.getTop();
    rect.bottom = paramView.getBottom();
    ViewParent viewParent = paramView.getParent();
    while (viewParent instanceof ViewGroup && viewParent != this) {
      ViewGroup viewGroup = (ViewGroup)viewParent;
      int i = rect.left;
      rect.left = viewGroup.getLeft() + i;
      i = rect.right;
      rect.right = viewGroup.getRight() + i;
      i = rect.top;
      rect.top = viewGroup.getTop() + i;
      i = rect.bottom;
      rect.bottom = viewGroup.getBottom() + i;
      ViewParent viewParent1 = viewGroup.getParent();
    } 
    return rect;
  }
  
  public final p32 i(View paramView) {
    byte b = 0;
    while (true) {
      ArrayList<p32> arrayList = this.c;
      if (b < arrayList.size()) {
        p32 p321 = arrayList.get(b);
        p51 p511 = this.g;
        Object object = p321.a;
        ((h50)p511).getClass();
        if (((ua0)object).K == paramView)
          return p321; 
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public final p32 j() {
    float f1;
    float f2;
    int i = getClientWidth();
    float f3 = 0.0F;
    if (i > 0) {
      f1 = getScrollX() / i;
    } else {
      f1 = 0.0F;
    } 
    if (i > 0) {
      f2 = this.o / i;
    } else {
      f2 = 0.0F;
    } 
    i = 0;
    boolean bool = true;
    p32 p321 = null;
    int j = -1;
    float f4 = 0.0F;
    while (true) {
      ArrayList<p32> arrayList = this.c;
      if (i < arrayList.size()) {
        p32 p322 = arrayList.get(i);
        if (!bool) {
          int k = p322.b;
          if (k != ++j) {
            p322 = this.e;
            p322.e = f3 + f4 + f2;
            p322.b = j;
            this.g.getClass();
            p322.d = 1.0F;
            i--;
          } 
        } 
        f3 = p322.e;
        f4 = p322.d;
        if (bool || f1 >= f3) {
          if (f1 < f4 + f3 + f2 || i == arrayList.size() - 1)
            return p322; 
          j = p322.b;
          f4 = p322.d;
          i++;
          bool = false;
          p321 = p322;
          continue;
        } 
      } 
      break;
    } 
    return p321;
  }
  
  public final p32 k(int paramInt) {
    byte b = 0;
    while (true) {
      ArrayList<p32> arrayList = this.c;
      if (b < arrayList.size()) {
        p32 p321 = arrayList.get(b);
        if (p321.b == paramInt)
          return p321; 
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public final void l() {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context context = getContext();
    this.l = new Scroller(context, d0);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
    float f = (context.getResources().getDisplayMetrics()).density;
    this.D = viewConfiguration.getScaledPagingTouchSlop();
    this.K = (int)(400.0F * f);
    this.L = viewConfiguration.getScaledMaximumFlingVelocity();
    this.O = new EdgeEffect(context);
    this.P = new EdgeEffect(context);
    this.M = (int)(25.0F * f);
    this.N = (int)(2.0F * f);
    this.B = (int)(f * 16.0F);
    v22.n((View)this, new fe(5, this));
    if (getImportantForAccessibility() == 0)
      setImportantForAccessibility(1); 
    m22.c((View)this, new j01(this));
  }
  
  public final void m(float paramFloat, int paramInt1, int paramInt2) {
    paramInt2 = this.S;
    boolean bool = false;
    if (paramInt2 > 0) {
      int j = getScrollX();
      paramInt2 = getPaddingLeft();
      int i = getPaddingRight();
      int m = getWidth();
      int k = getChildCount();
      for (byte b = 0; b < k; b++) {
        View view = getChildAt(b);
        q32 q32 = (q32)view.getLayoutParams();
        if (q32.a) {
          int n = q32.b & 0x7;
          if (n != 1) {
            if (n != 3) {
              if (n != 5) {
                int i1 = paramInt2;
                n = paramInt2;
                paramInt2 = i1;
              } else {
                n = m - i - view.getMeasuredWidth();
                i += view.getMeasuredWidth();
              } 
            } else {
              int i1 = view.getWidth() + paramInt2;
              n = paramInt2;
              paramInt2 = i1;
            } 
          } else {
            n = Math.max((m - view.getMeasuredWidth()) / 2, paramInt2);
          } 
          n = n + j - view.getLeft();
          if (n != 0)
            view.offsetLeftAndRight(n); 
        } 
      } 
    } 
    r32 r321 = this.U;
    if (r321 != null)
      r321.z(paramInt1, paramFloat); 
    ArrayList arrayList = this.T;
    if (arrayList != null) {
      int i = arrayList.size();
      for (paramInt2 = bool; paramInt2 < i; paramInt2++) {
        r32 r322 = this.T.get(paramInt2);
        if (r322 != null)
          r322.z(paramInt1, paramFloat); 
      } 
    } 
    this.R = true;
  }
  
  public final void n(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.I) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.E = paramMotionEvent.getX(i);
      this.I = paramMotionEvent.getPointerId(i);
      VelocityTracker velocityTracker = this.J;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  public final boolean o() {
    p51 p511 = this.g;
    if (p511 != null && this.h < p511.c() - 1) {
      w(this.h + 1, true);
      return true;
    } 
    return false;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.Q = true;
  }
  
  public final void onDetachedFromWindow() {
    removeCallbacks(this.W);
    Scroller scroller = this.l;
    if (scroller != null && !scroller.isFinished())
      this.l.abortAnimation(); 
    super.onDetachedFromWindow();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.o > 0 && this.p != null) {
      ArrayList<p32> arrayList = this.c;
      if (arrayList.size() > 0 && this.g != null) {
        int j = getScrollX();
        int k = getWidth();
        float f1 = this.o;
        float f2 = k;
        float f3 = f1 / f2;
        byte b = 0;
        p32 p321 = arrayList.get(0);
        f1 = p321.e;
        int n = arrayList.size();
        int i = p321.b;
        int m = ((p32)arrayList.get(n - 1)).b;
        while (i < m) {
          float f;
          int i1;
          while (true) {
            i1 = p321.b;
            if (i > i1 && b < n) {
              p321 = arrayList.get(++b);
              continue;
            } 
            break;
          } 
          if (i == i1) {
            float f4 = p321.e;
            f1 = p321.d;
            f = (f4 + f1) * f2;
            f1 = f4 + f1 + f3;
          } else {
            this.g.getClass();
            f = (f1 + 1.0F) * f2;
            f1 = 1.0F + f3 + f1;
          } 
          if (this.o + f > j) {
            this.p.setBounds(Math.round(f), this.q, Math.round(this.o + f), this.r);
            this.p.draw(paramCanvas);
          } 
          if (f > (j + k))
            break; 
          i++;
        } 
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i == 3 || i == 1) {
      u();
      return false;
    } 
    if (i != 0) {
      if (this.z)
        return true; 
      if (this.A)
        return false; 
    } 
    if (i != 0) {
      if (i != 2) {
        if (i == 6)
          n(paramMotionEvent); 
      } else {
        i = this.I;
        if (i != -1) {
          i = paramMotionEvent.findPointerIndex(i);
          float f3 = paramMotionEvent.getX(i);
          float f5 = f3 - this.E;
          float f1 = Math.abs(f5);
          float f2 = paramMotionEvent.getY(i);
          float f4 = Math.abs(f2 - this.H);
          i = f5 cmp 0.0F;
          if (i != 0) {
            float f = this.E;
            if ((f >= this.C || i <= 0) && (f <= (getWidth() - this.C) || f5 >= 0.0F) && d((int)f5, (int)f3, (int)f2, (View)this, false)) {
              this.E = f3;
              this.F = f2;
              this.A = true;
              return false;
            } 
          } 
          f5 = this.D;
          if (f1 > f5 && f1 * 0.5F > f4) {
            this.z = true;
            ViewParent viewParent = getParent();
            if (viewParent != null)
              viewParent.requestDisallowInterceptTouchEvent(true); 
            setScrollState(1);
            f4 = this.G;
            f1 = this.D;
            if (i > 0) {
              f1 = f4 + f1;
            } else {
              f1 = f4 - f1;
            } 
            this.E = f1;
            this.F = f2;
            setScrollingCacheEnabled(true);
          } else if (f4 > f5) {
            this.A = true;
          } 
          if (this.z && q(f3)) {
            WeakHashMap weakHashMap = v22.a;
            postInvalidateOnAnimation();
          } 
        } 
      } 
    } else {
      float f = paramMotionEvent.getX();
      this.G = f;
      this.E = f;
      f = paramMotionEvent.getY();
      this.H = f;
      this.F = f;
      this.I = paramMotionEvent.getPointerId(0);
      this.A = false;
      this.m = true;
      this.l.computeScrollOffset();
      if (this.a0 == 2 && Math.abs(this.l.getFinalX() - this.l.getCurrX()) > this.N) {
        this.l.abortAnimation();
        this.x = false;
        r();
        this.z = true;
        ViewParent viewParent = getParent();
        if (viewParent != null)
          viewParent.requestDisallowInterceptTouchEvent(true); 
        setScrollState(1);
      } else {
        e(false);
        this.z = false;
      } 
    } 
    if (this.J == null)
      this.J = VelocityTracker.obtain(); 
    this.J.addMovement(paramMotionEvent);
    return this.z;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int k = getChildCount();
    int m = paramInt3 - paramInt1;
    int n = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    paramInt4 = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i1 = getScrollX();
    int j = 0;
    int i;
    for (i = 0; j < k; i = i2) {
      View view = getChildAt(j);
      int i6 = paramInt2;
      int i5 = paramInt1;
      int i4 = paramInt4;
      int i3 = paramInt3;
      int i2 = i;
      if (view.getVisibility() != 8) {
        q32 q32 = (q32)view.getLayoutParams();
        i6 = paramInt2;
        i5 = paramInt1;
        i4 = paramInt4;
        i3 = paramInt3;
        i2 = i;
        if (q32.a) {
          i3 = q32.b;
          i2 = i3 & 0x7;
          i4 = i3 & 0x70;
          if (i2 != 1) {
            if (i2 != 3) {
              if (i2 != 5) {
                i2 = paramInt2;
                i3 = paramInt2;
                paramInt2 = i2;
              } else {
                i2 = m - paramInt4 - view.getMeasuredWidth();
                paramInt4 += view.getMeasuredWidth();
                i3 = i2;
              } 
            } else {
              i2 = view.getMeasuredWidth() + paramInt2;
              i3 = paramInt2;
              paramInt2 = i2;
            } 
          } else {
            i2 = Math.max((m - view.getMeasuredWidth()) / 2, paramInt2);
            i3 = i2;
          } 
          if (i4 != 16) {
            if (i4 != 48) {
              if (i4 != 80) {
                i4 = paramInt1;
                i2 = paramInt1;
                paramInt1 = i4;
              } else {
                i2 = n - paramInt3 - view.getMeasuredHeight();
                paramInt3 += view.getMeasuredHeight();
              } 
            } else {
              i4 = view.getMeasuredHeight() + paramInt1;
              i2 = paramInt1;
              paramInt1 = i4;
            } 
          } else {
            i2 = Math.max((n - view.getMeasuredHeight()) / 2, paramInt1);
          } 
          i3 += i1;
          view.layout(i3, i2, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i2);
          i2 = i + 1;
          i3 = paramInt3;
          i4 = paramInt4;
          i5 = paramInt1;
          i6 = paramInt2;
        } 
      } 
      j++;
      paramInt2 = i6;
      paramInt1 = i5;
      paramInt4 = i4;
      paramInt3 = i3;
    } 
    for (byte b = 0; b < k; b++) {
      View view = getChildAt(b);
      if (view.getVisibility() != 8) {
        q32 q32 = (q32)view.getLayoutParams();
        if (!q32.a) {
          p32 p321 = i(view);
          if (p321 != null) {
            float f = (m - paramInt2 - paramInt4);
            j = (int)(p321.e * f) + paramInt2;
            if (q32.d) {
              q32.d = false;
              view.measure(View.MeasureSpec.makeMeasureSpec((int)(f * q32.c), 1073741824), View.MeasureSpec.makeMeasureSpec(n - paramInt1 - paramInt3, 1073741824));
            } 
            view.layout(j, paramInt1, view.getMeasuredWidth() + j, view.getMeasuredHeight() + paramInt1);
          } 
        } 
      } 
    } 
    this.q = paramInt1;
    this.r = n - paramInt3;
    this.S = i;
    if (this.Q)
      v(this.h, 0, false, false); 
    this.Q = false;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = false;
    setMeasuredDimension(View.getDefaultSize(0, paramInt1), View.getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.C = Math.min(paramInt1 / 10, this.B);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i = getChildCount();
    byte b = 0;
    while (true) {
      int k = 1;
      int m = 1073741824;
      if (b < i) {
        View view = getChildAt(b);
        int n = paramInt1;
        int i1 = paramInt2;
        if (view.getVisibility() != 8) {
          q32 q32 = (q32)view.getLayoutParams();
          n = paramInt1;
          i1 = paramInt2;
          if (q32 != null) {
            n = paramInt1;
            i1 = paramInt2;
            if (q32.a) {
              boolean bool1;
              int i3;
              i1 = q32.b;
              n = i1 & 0x7;
              i1 &= 0x70;
              if (i1 == 48 || i1 == 80) {
                bool1 = true;
              } else {
                bool1 = false;
              } 
              int i2 = k;
              if (n != 3)
                if (n == 5) {
                  i2 = k;
                } else {
                  i2 = 0;
                }  
              i1 = Integer.MIN_VALUE;
              if (bool1) {
                n = Integer.MIN_VALUE;
                i1 = 1073741824;
              } else if (i2) {
                n = 1073741824;
              } else {
                n = Integer.MIN_VALUE;
              } 
              k = q32.width;
              if (k != -2) {
                if (k != -1) {
                  i1 = k;
                } else {
                  i1 = paramInt1;
                } 
                k = 1073741824;
                i3 = i1;
              } else {
                i3 = paramInt1;
                k = i1;
              } 
              i1 = q32.height;
              if (i1 != -2) {
                if (i1 != -1) {
                  n = i1;
                } else {
                  n = paramInt2;
                } 
              } else {
                i1 = paramInt2;
                m = n;
                n = i1;
              } 
              view.measure(View.MeasureSpec.makeMeasureSpec(i3, k), View.MeasureSpec.makeMeasureSpec(n, m));
              if (bool1) {
                i1 = paramInt2 - view.getMeasuredHeight();
                n = paramInt1;
              } else {
                n = paramInt1;
                i1 = paramInt2;
                if (i2 != 0) {
                  n = paramInt1 - view.getMeasuredWidth();
                  i1 = paramInt2;
                } 
              } 
            } 
          } 
        } 
        b++;
        paramInt1 = n;
        paramInt2 = i1;
        continue;
      } 
      View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      this.u = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      this.v = true;
      r();
      this.v = false;
      int j = getChildCount();
      for (paramInt2 = bool; paramInt2 < j; paramInt2++) {
        View view = getChildAt(paramInt2);
        if (view.getVisibility() != 8) {
          q32 q32 = (q32)view.getLayoutParams();
          if (q32 == null || !q32.a)
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * q32.c), 1073741824), this.u); 
        } 
      } 
      return;
    } 
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    int i;
    byte b;
    int j = getChildCount();
    if ((paramInt & 0x2) != 0) {
      i = 0;
      b = 1;
    } else {
      i = j - 1;
      j = -1;
      b = -1;
    } 
    while (i != j) {
      View view = getChildAt(i);
      if (view.getVisibility() == 0) {
        p32 p321 = i(view);
        if (p321 != null && p321.b == this.h && view.requestFocus(paramInt, paramRect))
          return true; 
      } 
      i += b;
    } 
    return false;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof s32)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    paramParcelable = paramParcelable;
    ClassLoader classLoader = ((s32)paramParcelable).g;
    super.onRestoreInstanceState(((j)paramParcelable).b);
    p51 p511 = this.g;
    if (p511 != null) {
      p511.e(((s32)paramParcelable).f, classLoader);
      x(((s32)paramParcelable).e, 0, false, true);
      return;
    } 
    this.i = ((s32)paramParcelable).e;
    this.j = ((s32)paramParcelable).f;
    this.k = classLoader;
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    ((s32)j).e = this.h;
    p51 p511 = this.g;
    if (p511 != null)
      ((s32)j).f = (Parcelable)p511.f(); 
    return j;
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      paramInt2 = this.o;
      t(paramInt1, paramInt3, paramInt2, paramInt2);
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getAction : ()I
    //   4: istore #6
    //   6: iconst_0
    //   7: istore #9
    //   9: iload #6
    //   11: ifne -> 24
    //   14: aload_1
    //   15: invokevirtual getEdgeFlags : ()I
    //   18: ifeq -> 24
    //   21: goto -> 751
    //   24: aload_0
    //   25: getfield g : Lp51;
    //   28: astore #10
    //   30: aload #10
    //   32: ifnull -> 751
    //   35: aload #10
    //   37: invokevirtual c : ()I
    //   40: ifne -> 46
    //   43: goto -> 751
    //   46: aload_0
    //   47: getfield J : Landroid/view/VelocityTracker;
    //   50: ifnonnull -> 60
    //   53: aload_0
    //   54: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   57: putfield J : Landroid/view/VelocityTracker;
    //   60: aload_0
    //   61: getfield J : Landroid/view/VelocityTracker;
    //   64: aload_1
    //   65: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   68: aload_1
    //   69: invokevirtual getAction : ()I
    //   72: sipush #255
    //   75: iand
    //   76: istore #6
    //   78: iload #6
    //   80: ifeq -> 681
    //   83: iload #6
    //   85: iconst_1
    //   86: if_icmpeq -> 413
    //   89: iload #6
    //   91: iconst_2
    //   92: if_icmpeq -> 197
    //   95: iload #6
    //   97: iconst_3
    //   98: if_icmpeq -> 170
    //   101: iload #6
    //   103: iconst_5
    //   104: if_icmpeq -> 141
    //   107: iload #6
    //   109: bipush #6
    //   111: if_icmpeq -> 117
    //   114: goto -> 736
    //   117: aload_0
    //   118: aload_1
    //   119: invokevirtual n : (Landroid/view/MotionEvent;)V
    //   122: aload_0
    //   123: aload_1
    //   124: aload_1
    //   125: aload_0
    //   126: getfield I : I
    //   129: invokevirtual findPointerIndex : (I)I
    //   132: invokevirtual getX : (I)F
    //   135: putfield E : F
    //   138: goto -> 736
    //   141: aload_1
    //   142: invokevirtual getActionIndex : ()I
    //   145: istore #6
    //   147: aload_0
    //   148: aload_1
    //   149: iload #6
    //   151: invokevirtual getX : (I)F
    //   154: putfield E : F
    //   157: aload_0
    //   158: aload_1
    //   159: iload #6
    //   161: invokevirtual getPointerId : (I)I
    //   164: putfield I : I
    //   167: goto -> 736
    //   170: aload_0
    //   171: getfield z : Z
    //   174: ifeq -> 736
    //   177: aload_0
    //   178: aload_0
    //   179: getfield h : I
    //   182: iconst_0
    //   183: iconst_1
    //   184: iconst_0
    //   185: invokevirtual v : (IIZZ)V
    //   188: aload_0
    //   189: invokevirtual u : ()Z
    //   192: istore #9
    //   194: goto -> 736
    //   197: aload_0
    //   198: getfield z : Z
    //   201: ifne -> 385
    //   204: aload_1
    //   205: aload_0
    //   206: getfield I : I
    //   209: invokevirtual findPointerIndex : (I)I
    //   212: istore #6
    //   214: iload #6
    //   216: iconst_m1
    //   217: if_icmpne -> 229
    //   220: aload_0
    //   221: invokevirtual u : ()Z
    //   224: istore #9
    //   226: goto -> 736
    //   229: aload_1
    //   230: iload #6
    //   232: invokevirtual getX : (I)F
    //   235: fstore_2
    //   236: fload_2
    //   237: aload_0
    //   238: getfield E : F
    //   241: fsub
    //   242: invokestatic abs : (F)F
    //   245: fstore #5
    //   247: aload_1
    //   248: iload #6
    //   250: invokevirtual getY : (I)F
    //   253: fstore_3
    //   254: fload_3
    //   255: aload_0
    //   256: getfield F : F
    //   259: fsub
    //   260: invokestatic abs : (F)F
    //   263: fstore #4
    //   265: fload #5
    //   267: aload_0
    //   268: getfield D : I
    //   271: i2f
    //   272: fcmpl
    //   273: ifle -> 385
    //   276: fload #5
    //   278: fload #4
    //   280: fcmpl
    //   281: ifle -> 385
    //   284: aload_0
    //   285: iconst_1
    //   286: putfield z : Z
    //   289: aload_0
    //   290: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   293: astore #10
    //   295: aload #10
    //   297: ifnull -> 308
    //   300: aload #10
    //   302: iconst_1
    //   303: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   308: aload_0
    //   309: getfield G : F
    //   312: fstore #4
    //   314: aload_0
    //   315: getfield D : I
    //   318: istore #6
    //   320: fload_2
    //   321: fload #4
    //   323: fsub
    //   324: fconst_0
    //   325: fcmpl
    //   326: ifle -> 339
    //   329: fload #4
    //   331: iload #6
    //   333: i2f
    //   334: fadd
    //   335: fstore_2
    //   336: goto -> 346
    //   339: fload #4
    //   341: iload #6
    //   343: i2f
    //   344: fsub
    //   345: fstore_2
    //   346: aload_0
    //   347: fload_2
    //   348: putfield E : F
    //   351: aload_0
    //   352: fload_3
    //   353: putfield F : F
    //   356: aload_0
    //   357: iconst_1
    //   358: invokevirtual setScrollState : (I)V
    //   361: aload_0
    //   362: iconst_1
    //   363: invokespecial setScrollingCacheEnabled : (Z)V
    //   366: aload_0
    //   367: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   370: astore #10
    //   372: aload #10
    //   374: ifnull -> 385
    //   377: aload #10
    //   379: iconst_1
    //   380: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   385: aload_0
    //   386: getfield z : Z
    //   389: ifeq -> 736
    //   392: aload_0
    //   393: aload_1
    //   394: aload_1
    //   395: aload_0
    //   396: getfield I : I
    //   399: invokevirtual findPointerIndex : (I)I
    //   402: invokevirtual getX : (I)F
    //   405: invokevirtual q : (F)Z
    //   408: istore #9
    //   410: goto -> 736
    //   413: aload_0
    //   414: getfield z : Z
    //   417: ifeq -> 736
    //   420: aload_0
    //   421: getfield J : Landroid/view/VelocityTracker;
    //   424: astore #10
    //   426: aload #10
    //   428: sipush #1000
    //   431: aload_0
    //   432: getfield L : I
    //   435: i2f
    //   436: invokevirtual computeCurrentVelocity : (IF)V
    //   439: aload #10
    //   441: aload_0
    //   442: getfield I : I
    //   445: invokevirtual getXVelocity : (I)F
    //   448: f2i
    //   449: istore #8
    //   451: aload_0
    //   452: iconst_1
    //   453: putfield x : Z
    //   456: aload_0
    //   457: invokespecial getClientWidth : ()I
    //   460: istore #6
    //   462: aload_0
    //   463: invokevirtual getScrollX : ()I
    //   466: istore #7
    //   468: aload_0
    //   469: invokevirtual j : ()Lp32;
    //   472: astore #10
    //   474: aload_0
    //   475: getfield o : I
    //   478: i2f
    //   479: fstore_3
    //   480: iload #6
    //   482: i2f
    //   483: fstore_2
    //   484: fload_3
    //   485: fload_2
    //   486: fdiv
    //   487: fstore_3
    //   488: aload #10
    //   490: getfield b : I
    //   493: istore #6
    //   495: iload #7
    //   497: i2f
    //   498: fload_2
    //   499: fdiv
    //   500: aload #10
    //   502: getfield e : F
    //   505: fsub
    //   506: aload #10
    //   508: getfield d : F
    //   511: fload_3
    //   512: fadd
    //   513: fdiv
    //   514: fstore_3
    //   515: aload_1
    //   516: aload_1
    //   517: aload_0
    //   518: getfield I : I
    //   521: invokevirtual findPointerIndex : (I)I
    //   524: invokevirtual getX : (I)F
    //   527: aload_0
    //   528: getfield G : F
    //   531: fsub
    //   532: f2i
    //   533: invokestatic abs : (I)I
    //   536: aload_0
    //   537: getfield M : I
    //   540: if_icmple -> 569
    //   543: iload #8
    //   545: invokestatic abs : (I)I
    //   548: aload_0
    //   549: getfield K : I
    //   552: if_icmple -> 569
    //   555: iload #8
    //   557: ifle -> 563
    //   560: goto -> 598
    //   563: iinc #6, 1
    //   566: goto -> 598
    //   569: iload #6
    //   571: aload_0
    //   572: getfield h : I
    //   575: if_icmplt -> 585
    //   578: ldc_w 0.4
    //   581: fstore_2
    //   582: goto -> 589
    //   585: ldc_w 0.6
    //   588: fstore_2
    //   589: iload #6
    //   591: fload_3
    //   592: fload_2
    //   593: fadd
    //   594: f2i
    //   595: iadd
    //   596: istore #6
    //   598: aload_0
    //   599: getfield c : Ljava/util/ArrayList;
    //   602: astore #10
    //   604: iload #6
    //   606: istore #7
    //   608: aload #10
    //   610: invokevirtual size : ()I
    //   613: ifle -> 662
    //   616: aload #10
    //   618: iconst_0
    //   619: invokevirtual get : (I)Ljava/lang/Object;
    //   622: checkcast p32
    //   625: astore_1
    //   626: aload #10
    //   628: aload #10
    //   630: invokevirtual size : ()I
    //   633: iconst_1
    //   634: isub
    //   635: invokevirtual get : (I)Ljava/lang/Object;
    //   638: checkcast p32
    //   641: astore #10
    //   643: aload_1
    //   644: getfield b : I
    //   647: iload #6
    //   649: aload #10
    //   651: getfield b : I
    //   654: invokestatic min : (II)I
    //   657: invokestatic max : (II)I
    //   660: istore #7
    //   662: aload_0
    //   663: iload #7
    //   665: iload #8
    //   667: iconst_1
    //   668: iconst_1
    //   669: invokevirtual x : (IIZZ)V
    //   672: aload_0
    //   673: invokevirtual u : ()Z
    //   676: istore #9
    //   678: goto -> 736
    //   681: aload_0
    //   682: getfield l : Landroid/widget/Scroller;
    //   685: invokevirtual abortAnimation : ()V
    //   688: aload_0
    //   689: iconst_0
    //   690: putfield x : Z
    //   693: aload_0
    //   694: invokevirtual r : ()V
    //   697: aload_1
    //   698: invokevirtual getX : ()F
    //   701: fstore_2
    //   702: aload_0
    //   703: fload_2
    //   704: putfield G : F
    //   707: aload_0
    //   708: fload_2
    //   709: putfield E : F
    //   712: aload_1
    //   713: invokevirtual getY : ()F
    //   716: fstore_2
    //   717: aload_0
    //   718: fload_2
    //   719: putfield H : F
    //   722: aload_0
    //   723: fload_2
    //   724: putfield F : F
    //   727: aload_0
    //   728: aload_1
    //   729: iconst_0
    //   730: invokevirtual getPointerId : (I)I
    //   733: putfield I : I
    //   736: iload #9
    //   738: ifeq -> 749
    //   741: getstatic v22.a : Ljava/util/WeakHashMap;
    //   744: astore_1
    //   745: aload_0
    //   746: invokevirtual postInvalidateOnAnimation : ()V
    //   749: iconst_1
    //   750: ireturn
    //   751: iconst_0
    //   752: ireturn
  }
  
  public final boolean p(int paramInt) {
    if (this.c.size() == 0) {
      if (!this.Q) {
        this.R = false;
        m(0.0F, 0, 0);
        if (!this.R) {
          tp.f("onPageScrolled did not call superclass implementation");
          return false;
        } 
      } 
      return false;
    } 
    p32 p321 = j();
    int j = getClientWidth();
    int k = this.o;
    float f2 = k;
    float f1 = j;
    f2 /= f1;
    int i = p321.b;
    f1 = (paramInt / f1 - p321.e) / (p321.d + f2);
    paramInt = (int)((j + k) * f1);
    this.R = false;
    m(f1, i, paramInt);
    if (this.R)
      return true; 
    tp.f("onPageScrolled did not call superclass implementation");
    return false;
  }
  
  public final boolean q(float paramFloat) {
    boolean bool1;
    float f1 = this.E;
    this.E = paramFloat;
    float f2 = getScrollX() + f1 - paramFloat;
    float f3 = getClientWidth();
    paramFloat = this.s * f3;
    f1 = this.t * f3;
    ArrayList<p32> arrayList = this.c;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool2 = false;
    p32 p321 = arrayList.get(0);
    p32 p322 = arrayList.get(arrayList.size() - 1);
    if (p321.b != 0) {
      paramFloat = p321.e * f3;
      i = 0;
    } else {
      i = 1;
    } 
    if (p322.b != this.g.c() - 1) {
      f1 = p322.e * f3;
      bool1 = false;
    } else {
      bool1 = true;
    } 
    if (f2 < paramFloat) {
      if (i) {
        this.O.onPull(Math.abs(paramFloat - f2) / f3);
        bool2 = true;
      } 
    } else {
      bool2 = bool4;
      paramFloat = f2;
      if (f2 > f1) {
        bool2 = bool3;
        if (bool1) {
          this.P.onPull(Math.abs(f2 - f1) / f3);
          bool2 = true;
        } 
        paramFloat = f1;
      } 
    } 
    f1 = this.E;
    int i = (int)paramFloat;
    this.E = paramFloat - i + f1;
    scrollTo(i, getScrollY());
    p(i);
    return bool2;
  }
  
  public final void r() {
    s(this.h);
  }
  
  public final void removeView(View paramView) {
    if (this.v) {
      removeViewInLayout(paramView);
      return;
    } 
    super.removeView(paramView);
  }
  
  public final void s(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: istore #6
    //   6: iload #6
    //   8: iload_1
    //   9: if_icmpeq -> 28
    //   12: aload_0
    //   13: iload #6
    //   15: invokevirtual k : (I)Lp32;
    //   18: astore #17
    //   20: aload_0
    //   21: iload_1
    //   22: putfield h : I
    //   25: goto -> 31
    //   28: aconst_null
    //   29: astore #17
    //   31: aload_0
    //   32: getfield g : Lp51;
    //   35: ifnonnull -> 41
    //   38: goto -> 1949
    //   41: aload_0
    //   42: getfield x : Z
    //   45: ifeq -> 51
    //   48: goto -> 1949
    //   51: aload_0
    //   52: invokevirtual getWindowToken : ()Landroid/os/IBinder;
    //   55: ifnonnull -> 61
    //   58: goto -> 1949
    //   61: aload_0
    //   62: getfield g : Lp51;
    //   65: aload_0
    //   66: invokevirtual g : (Lt32;)V
    //   69: aload_0
    //   70: getfield y : I
    //   73: istore_1
    //   74: aload_0
    //   75: getfield h : I
    //   78: istore #6
    //   80: iconst_0
    //   81: istore #10
    //   83: iconst_0
    //   84: iload #6
    //   86: iload_1
    //   87: isub
    //   88: invokestatic max : (II)I
    //   91: istore #13
    //   93: aload_0
    //   94: getfield g : Lp51;
    //   97: invokevirtual c : ()I
    //   100: istore #11
    //   102: iload #11
    //   104: iconst_1
    //   105: isub
    //   106: aload_0
    //   107: getfield h : I
    //   110: iload_1
    //   111: iadd
    //   112: invokestatic min : (II)I
    //   115: istore #12
    //   117: iload #11
    //   119: aload_0
    //   120: getfield b : I
    //   123: if_icmpne -> 1950
    //   126: iconst_0
    //   127: istore #7
    //   129: aload_0
    //   130: getfield c : Ljava/util/ArrayList;
    //   133: astore #19
    //   135: iload #7
    //   137: aload #19
    //   139: invokevirtual size : ()I
    //   142: if_icmpge -> 190
    //   145: aload #19
    //   147: iload #7
    //   149: invokevirtual get : (I)Ljava/lang/Object;
    //   152: checkcast p32
    //   155: astore #15
    //   157: aload #15
    //   159: getfield b : I
    //   162: istore_1
    //   163: aload_0
    //   164: getfield h : I
    //   167: istore #6
    //   169: iload_1
    //   170: iload #6
    //   172: if_icmplt -> 184
    //   175: iload_1
    //   176: iload #6
    //   178: if_icmpne -> 190
    //   181: goto -> 193
    //   184: iinc #7, 1
    //   187: goto -> 129
    //   190: aconst_null
    //   191: astore #15
    //   193: aload #15
    //   195: astore #16
    //   197: aload #15
    //   199: ifnonnull -> 223
    //   202: aload #15
    //   204: astore #16
    //   206: iload #11
    //   208: ifle -> 223
    //   211: aload_0
    //   212: aload_0
    //   213: getfield h : I
    //   216: iload #7
    //   218: invokevirtual a : (II)Lp32;
    //   221: astore #16
    //   223: aload #16
    //   225: ifnull -> 1706
    //   228: iload #7
    //   230: iconst_1
    //   231: isub
    //   232: istore #8
    //   234: iload #8
    //   236: iflt -> 254
    //   239: aload #19
    //   241: iload #8
    //   243: invokevirtual get : (I)Ljava/lang/Object;
    //   246: checkcast p32
    //   249: astore #15
    //   251: goto -> 257
    //   254: aconst_null
    //   255: astore #15
    //   257: aload_0
    //   258: invokespecial getClientWidth : ()I
    //   261: istore #14
    //   263: fconst_2
    //   264: fstore #5
    //   266: iload #14
    //   268: ifgt -> 277
    //   271: fconst_0
    //   272: fstore #4
    //   274: goto -> 298
    //   277: aload #16
    //   279: getfield d : F
    //   282: fstore_2
    //   283: aload_0
    //   284: invokevirtual getPaddingLeft : ()I
    //   287: i2f
    //   288: iload #14
    //   290: i2f
    //   291: fdiv
    //   292: fconst_2
    //   293: fload_2
    //   294: fsub
    //   295: fadd
    //   296: fstore #4
    //   298: aload_0
    //   299: getfield h : I
    //   302: iconst_1
    //   303: isub
    //   304: istore #9
    //   306: fconst_0
    //   307: fstore_3
    //   308: aload #15
    //   310: astore #18
    //   312: iload #9
    //   314: iflt -> 336
    //   317: fload_3
    //   318: fload #4
    //   320: fcmpl
    //   321: iflt -> 455
    //   324: iload #9
    //   326: iload #13
    //   328: if_icmpge -> 455
    //   331: aload #18
    //   333: ifnonnull -> 339
    //   336: goto -> 592
    //   339: iload #7
    //   341: istore #6
    //   343: iload #8
    //   345: istore_1
    //   346: aload #18
    //   348: astore #15
    //   350: fload_3
    //   351: fstore_2
    //   352: iload #9
    //   354: aload #18
    //   356: getfield b : I
    //   359: if_icmpne -> 573
    //   362: iload #7
    //   364: istore #6
    //   366: iload #8
    //   368: istore_1
    //   369: aload #18
    //   371: astore #15
    //   373: fload_3
    //   374: fstore_2
    //   375: aload #18
    //   377: getfield c : Z
    //   380: ifne -> 573
    //   383: aload #19
    //   385: iload #8
    //   387: invokevirtual remove : (I)Ljava/lang/Object;
    //   390: pop
    //   391: aload_0
    //   392: getfield g : Lp51;
    //   395: iload #9
    //   397: aload #18
    //   399: getfield a : Ljava/lang/Object;
    //   402: invokevirtual a : (ILjava/lang/Object;)V
    //   405: iinc #8, -1
    //   408: iinc #7, -1
    //   411: iload #7
    //   413: istore #6
    //   415: iload #8
    //   417: istore_1
    //   418: fload_3
    //   419: fstore_2
    //   420: iload #8
    //   422: iflt -> 449
    //   425: aload #19
    //   427: iload #8
    //   429: invokevirtual get : (I)Ljava/lang/Object;
    //   432: checkcast p32
    //   435: astore #15
    //   437: iload #7
    //   439: istore #6
    //   441: iload #8
    //   443: istore_1
    //   444: fload_3
    //   445: fstore_2
    //   446: goto -> 573
    //   449: aconst_null
    //   450: astore #15
    //   452: goto -> 573
    //   455: aload #18
    //   457: ifnull -> 519
    //   460: iload #9
    //   462: aload #18
    //   464: getfield b : I
    //   467: if_icmpne -> 519
    //   470: fload_3
    //   471: aload #18
    //   473: getfield d : F
    //   476: fadd
    //   477: fstore_3
    //   478: iinc #8, -1
    //   481: iload #7
    //   483: istore #6
    //   485: iload #8
    //   487: istore_1
    //   488: fload_3
    //   489: fstore_2
    //   490: iload #8
    //   492: iflt -> 449
    //   495: aload #19
    //   497: iload #8
    //   499: invokevirtual get : (I)Ljava/lang/Object;
    //   502: checkcast p32
    //   505: astore #15
    //   507: iload #7
    //   509: istore #6
    //   511: iload #8
    //   513: istore_1
    //   514: fload_3
    //   515: fstore_2
    //   516: goto -> 573
    //   519: fload_3
    //   520: aload_0
    //   521: iload #9
    //   523: iload #8
    //   525: iconst_1
    //   526: iadd
    //   527: invokevirtual a : (II)Lp32;
    //   530: getfield d : F
    //   533: fadd
    //   534: fstore_3
    //   535: iinc #7, 1
    //   538: iload #7
    //   540: istore #6
    //   542: iload #8
    //   544: istore_1
    //   545: fload_3
    //   546: fstore_2
    //   547: iload #8
    //   549: iflt -> 449
    //   552: aload #19
    //   554: iload #8
    //   556: invokevirtual get : (I)Ljava/lang/Object;
    //   559: checkcast p32
    //   562: astore #15
    //   564: fload_3
    //   565: fstore_2
    //   566: iload #8
    //   568: istore_1
    //   569: iload #7
    //   571: istore #6
    //   573: iinc #9, -1
    //   576: iload #6
    //   578: istore #7
    //   580: iload_1
    //   581: istore #8
    //   583: aload #15
    //   585: astore #18
    //   587: fload_2
    //   588: fstore_3
    //   589: goto -> 312
    //   592: aload #16
    //   594: getfield d : F
    //   597: fstore_3
    //   598: iload #7
    //   600: iconst_1
    //   601: iadd
    //   602: istore #8
    //   604: fload_3
    //   605: fload #5
    //   607: fcmpg
    //   608: ifge -> 937
    //   611: iload #8
    //   613: aload #19
    //   615: invokevirtual size : ()I
    //   618: if_icmpge -> 636
    //   621: aload #19
    //   623: iload #8
    //   625: invokevirtual get : (I)Ljava/lang/Object;
    //   628: checkcast p32
    //   631: astore #15
    //   633: goto -> 639
    //   636: aconst_null
    //   637: astore #15
    //   639: iload #14
    //   641: ifgt -> 650
    //   644: fconst_0
    //   645: fstore #4
    //   647: goto -> 664
    //   650: aload_0
    //   651: invokevirtual getPaddingRight : ()I
    //   654: i2f
    //   655: iload #14
    //   657: i2f
    //   658: fdiv
    //   659: fload #5
    //   661: fadd
    //   662: fstore #4
    //   664: aload_0
    //   665: getfield h : I
    //   668: iconst_1
    //   669: iadd
    //   670: istore #9
    //   672: iload #8
    //   674: istore #6
    //   676: aload #15
    //   678: astore #18
    //   680: iload #9
    //   682: iload #11
    //   684: if_icmpge -> 937
    //   687: fload_3
    //   688: fload #4
    //   690: fcmpl
    //   691: iflt -> 808
    //   694: iload #9
    //   696: iload #12
    //   698: if_icmple -> 808
    //   701: aload #18
    //   703: ifnonnull -> 709
    //   706: goto -> 937
    //   709: fload_3
    //   710: fstore_2
    //   711: aload #18
    //   713: astore #15
    //   715: iload #6
    //   717: istore_1
    //   718: iload #9
    //   720: aload #18
    //   722: getfield b : I
    //   725: if_icmpne -> 922
    //   728: fload_3
    //   729: fstore_2
    //   730: aload #18
    //   732: astore #15
    //   734: iload #6
    //   736: istore_1
    //   737: aload #18
    //   739: getfield c : Z
    //   742: ifne -> 922
    //   745: aload #19
    //   747: iload #6
    //   749: invokevirtual remove : (I)Ljava/lang/Object;
    //   752: pop
    //   753: aload_0
    //   754: getfield g : Lp51;
    //   757: iload #9
    //   759: aload #18
    //   761: getfield a : Ljava/lang/Object;
    //   764: invokevirtual a : (ILjava/lang/Object;)V
    //   767: fload_3
    //   768: fstore_2
    //   769: iload #6
    //   771: istore_1
    //   772: iload #6
    //   774: aload #19
    //   776: invokevirtual size : ()I
    //   779: if_icmpge -> 802
    //   782: aload #19
    //   784: iload #6
    //   786: invokevirtual get : (I)Ljava/lang/Object;
    //   789: checkcast p32
    //   792: astore #15
    //   794: fload_3
    //   795: fstore_2
    //   796: iload #6
    //   798: istore_1
    //   799: goto -> 922
    //   802: aconst_null
    //   803: astore #15
    //   805: goto -> 922
    //   808: aload #18
    //   810: ifnull -> 869
    //   813: iload #9
    //   815: aload #18
    //   817: getfield b : I
    //   820: if_icmpne -> 869
    //   823: fload_3
    //   824: aload #18
    //   826: getfield d : F
    //   829: fadd
    //   830: fstore_3
    //   831: iinc #6, 1
    //   834: fload_3
    //   835: fstore_2
    //   836: iload #6
    //   838: istore_1
    //   839: iload #6
    //   841: aload #19
    //   843: invokevirtual size : ()I
    //   846: if_icmpge -> 802
    //   849: aload #19
    //   851: iload #6
    //   853: invokevirtual get : (I)Ljava/lang/Object;
    //   856: checkcast p32
    //   859: astore #15
    //   861: fload_3
    //   862: fstore_2
    //   863: iload #6
    //   865: istore_1
    //   866: goto -> 922
    //   869: aload_0
    //   870: iload #9
    //   872: iload #6
    //   874: invokevirtual a : (II)Lp32;
    //   877: astore #15
    //   879: iinc #6, 1
    //   882: fload_3
    //   883: aload #15
    //   885: getfield d : F
    //   888: fadd
    //   889: fstore_3
    //   890: fload_3
    //   891: fstore_2
    //   892: iload #6
    //   894: istore_1
    //   895: iload #6
    //   897: aload #19
    //   899: invokevirtual size : ()I
    //   902: if_icmpge -> 802
    //   905: aload #19
    //   907: iload #6
    //   909: invokevirtual get : (I)Ljava/lang/Object;
    //   912: checkcast p32
    //   915: astore #15
    //   917: iload #6
    //   919: istore_1
    //   920: fload_3
    //   921: fstore_2
    //   922: iinc #9, 1
    //   925: fload_2
    //   926: fstore_3
    //   927: aload #15
    //   929: astore #18
    //   931: iload_1
    //   932: istore #6
    //   934: goto -> 680
    //   937: aload_0
    //   938: getfield g : Lp51;
    //   941: invokevirtual c : ()I
    //   944: istore #11
    //   946: aload_0
    //   947: invokespecial getClientWidth : ()I
    //   950: istore_1
    //   951: iload_1
    //   952: ifle -> 967
    //   955: aload_0
    //   956: getfield o : I
    //   959: i2f
    //   960: iload_1
    //   961: i2f
    //   962: fdiv
    //   963: fstore_3
    //   964: goto -> 969
    //   967: fconst_0
    //   968: fstore_3
    //   969: aload #17
    //   971: ifnull -> 1304
    //   974: aload #17
    //   976: getfield b : I
    //   979: istore_1
    //   980: aload #16
    //   982: getfield b : I
    //   985: istore #6
    //   987: iload_1
    //   988: iload #6
    //   990: if_icmpge -> 1153
    //   993: aload #17
    //   995: getfield e : F
    //   998: aload #17
    //   1000: getfield d : F
    //   1003: fadd
    //   1004: fload_3
    //   1005: fadd
    //   1006: fstore_2
    //   1007: iinc #1, 1
    //   1010: iconst_0
    //   1011: istore #6
    //   1013: iload_1
    //   1014: aload #16
    //   1016: getfield b : I
    //   1019: if_icmpgt -> 1304
    //   1022: iload #6
    //   1024: aload #19
    //   1026: invokevirtual size : ()I
    //   1029: if_icmpge -> 1304
    //   1032: aload #19
    //   1034: iload #6
    //   1036: invokevirtual get : (I)Ljava/lang/Object;
    //   1039: checkcast p32
    //   1042: astore #15
    //   1044: iload_1
    //   1045: istore #9
    //   1047: fload_2
    //   1048: fstore #4
    //   1050: iload_1
    //   1051: aload #15
    //   1053: getfield b : I
    //   1056: if_icmple -> 1095
    //   1059: iload_1
    //   1060: istore #9
    //   1062: fload_2
    //   1063: fstore #4
    //   1065: iload #6
    //   1067: aload #19
    //   1069: invokevirtual size : ()I
    //   1072: iconst_1
    //   1073: isub
    //   1074: if_icmpge -> 1095
    //   1077: iinc #6, 1
    //   1080: aload #19
    //   1082: iload #6
    //   1084: invokevirtual get : (I)Ljava/lang/Object;
    //   1087: checkcast p32
    //   1090: astore #15
    //   1092: goto -> 1044
    //   1095: iload #9
    //   1097: aload #15
    //   1099: getfield b : I
    //   1102: if_icmpge -> 1127
    //   1105: aload_0
    //   1106: getfield g : Lp51;
    //   1109: invokevirtual getClass : ()Ljava/lang/Class;
    //   1112: pop
    //   1113: fload #4
    //   1115: fconst_1
    //   1116: fload_3
    //   1117: fadd
    //   1118: fadd
    //   1119: fstore #4
    //   1121: iinc #9, 1
    //   1124: goto -> 1095
    //   1127: aload #15
    //   1129: fload #4
    //   1131: putfield e : F
    //   1134: fload #4
    //   1136: aload #15
    //   1138: getfield d : F
    //   1141: fload_3
    //   1142: fadd
    //   1143: fadd
    //   1144: fstore_2
    //   1145: iload #9
    //   1147: iconst_1
    //   1148: iadd
    //   1149: istore_1
    //   1150: goto -> 1013
    //   1153: iload_1
    //   1154: iload #6
    //   1156: if_icmple -> 1304
    //   1159: aload #19
    //   1161: invokevirtual size : ()I
    //   1164: iconst_1
    //   1165: isub
    //   1166: istore #6
    //   1168: aload #17
    //   1170: getfield e : F
    //   1173: fstore_2
    //   1174: iinc #1, -1
    //   1177: iload_1
    //   1178: aload #16
    //   1180: getfield b : I
    //   1183: if_icmplt -> 1304
    //   1186: iload #6
    //   1188: iflt -> 1304
    //   1191: aload #19
    //   1193: iload #6
    //   1195: invokevirtual get : (I)Ljava/lang/Object;
    //   1198: checkcast p32
    //   1201: astore #15
    //   1203: fload_2
    //   1204: fstore #4
    //   1206: iload_1
    //   1207: istore #9
    //   1209: iload_1
    //   1210: aload #15
    //   1212: getfield b : I
    //   1215: if_icmpge -> 1247
    //   1218: fload_2
    //   1219: fstore #4
    //   1221: iload_1
    //   1222: istore #9
    //   1224: iload #6
    //   1226: ifle -> 1247
    //   1229: iinc #6, -1
    //   1232: aload #19
    //   1234: iload #6
    //   1236: invokevirtual get : (I)Ljava/lang/Object;
    //   1239: checkcast p32
    //   1242: astore #15
    //   1244: goto -> 1203
    //   1247: iload #9
    //   1249: aload #15
    //   1251: getfield b : I
    //   1254: if_icmple -> 1279
    //   1257: aload_0
    //   1258: getfield g : Lp51;
    //   1261: invokevirtual getClass : ()Ljava/lang/Class;
    //   1264: pop
    //   1265: fload #4
    //   1267: fconst_1
    //   1268: fload_3
    //   1269: fadd
    //   1270: fsub
    //   1271: fstore #4
    //   1273: iinc #9, -1
    //   1276: goto -> 1247
    //   1279: fload #4
    //   1281: aload #15
    //   1283: getfield d : F
    //   1286: fload_3
    //   1287: fadd
    //   1288: fsub
    //   1289: fstore_2
    //   1290: aload #15
    //   1292: fload_2
    //   1293: putfield e : F
    //   1296: iload #9
    //   1298: iconst_1
    //   1299: isub
    //   1300: istore_1
    //   1301: goto -> 1177
    //   1304: aload #19
    //   1306: invokevirtual size : ()I
    //   1309: istore #9
    //   1311: aload #16
    //   1313: getfield e : F
    //   1316: fstore_2
    //   1317: aload #16
    //   1319: getfield b : I
    //   1322: istore #6
    //   1324: iload #6
    //   1326: iconst_1
    //   1327: isub
    //   1328: istore_1
    //   1329: iload #6
    //   1331: ifne -> 1340
    //   1334: fload_2
    //   1335: fstore #4
    //   1337: goto -> 1344
    //   1340: ldc -3.4028235E38
    //   1342: fstore #4
    //   1344: aload_0
    //   1345: fload #4
    //   1347: putfield s : F
    //   1350: iinc #11, -1
    //   1353: iload #6
    //   1355: iload #11
    //   1357: if_icmpne -> 1374
    //   1360: aload #16
    //   1362: getfield d : F
    //   1365: fload_2
    //   1366: fadd
    //   1367: fconst_1
    //   1368: fsub
    //   1369: fstore #4
    //   1371: goto -> 1378
    //   1374: ldc 3.4028235E38
    //   1376: fstore #4
    //   1378: aload_0
    //   1379: fload #4
    //   1381: putfield t : F
    //   1384: iload #7
    //   1386: iconst_1
    //   1387: isub
    //   1388: istore #6
    //   1390: iload #6
    //   1392: iflt -> 1479
    //   1395: aload #19
    //   1397: iload #6
    //   1399: invokevirtual get : (I)Ljava/lang/Object;
    //   1402: checkcast p32
    //   1405: astore #15
    //   1407: aload #15
    //   1409: getfield b : I
    //   1412: istore #7
    //   1414: iload_1
    //   1415: iload #7
    //   1417: if_icmple -> 1444
    //   1420: aload_0
    //   1421: getfield g : Lp51;
    //   1424: astore #17
    //   1426: iinc #1, -1
    //   1429: aload #17
    //   1431: invokevirtual getClass : ()Ljava/lang/Class;
    //   1434: pop
    //   1435: fload_2
    //   1436: fconst_1
    //   1437: fload_3
    //   1438: fadd
    //   1439: fsub
    //   1440: fstore_2
    //   1441: goto -> 1407
    //   1444: fload_2
    //   1445: aload #15
    //   1447: getfield d : F
    //   1450: fload_3
    //   1451: fadd
    //   1452: fsub
    //   1453: fstore_2
    //   1454: aload #15
    //   1456: fload_2
    //   1457: putfield e : F
    //   1460: iload #7
    //   1462: ifne -> 1470
    //   1465: aload_0
    //   1466: fload_2
    //   1467: putfield s : F
    //   1470: iinc #6, -1
    //   1473: iinc #1, -1
    //   1476: goto -> 1390
    //   1479: aload #16
    //   1481: getfield e : F
    //   1484: aload #16
    //   1486: getfield d : F
    //   1489: fadd
    //   1490: fload_3
    //   1491: fadd
    //   1492: fstore_2
    //   1493: aload #16
    //   1495: getfield b : I
    //   1498: iconst_1
    //   1499: iadd
    //   1500: istore_1
    //   1501: iload #8
    //   1503: iload #9
    //   1505: if_icmpge -> 1602
    //   1508: aload #19
    //   1510: iload #8
    //   1512: invokevirtual get : (I)Ljava/lang/Object;
    //   1515: checkcast p32
    //   1518: astore #15
    //   1520: aload #15
    //   1522: getfield b : I
    //   1525: istore #6
    //   1527: iload_1
    //   1528: iload #6
    //   1530: if_icmpge -> 1557
    //   1533: aload_0
    //   1534: getfield g : Lp51;
    //   1537: astore #17
    //   1539: iinc #1, 1
    //   1542: aload #17
    //   1544: invokevirtual getClass : ()Ljava/lang/Class;
    //   1547: pop
    //   1548: fload_2
    //   1549: fconst_1
    //   1550: fload_3
    //   1551: fadd
    //   1552: fadd
    //   1553: fstore_2
    //   1554: goto -> 1520
    //   1557: iload #6
    //   1559: iload #11
    //   1561: if_icmpne -> 1577
    //   1564: aload_0
    //   1565: aload #15
    //   1567: getfield d : F
    //   1570: fload_2
    //   1571: fadd
    //   1572: fconst_1
    //   1573: fsub
    //   1574: putfield t : F
    //   1577: aload #15
    //   1579: fload_2
    //   1580: putfield e : F
    //   1583: fload_2
    //   1584: aload #15
    //   1586: getfield d : F
    //   1589: fload_3
    //   1590: fadd
    //   1591: fadd
    //   1592: fstore_2
    //   1593: iinc #8, 1
    //   1596: iinc #1, 1
    //   1599: goto -> 1501
    //   1602: aload_0
    //   1603: getfield g : Lp51;
    //   1606: astore #15
    //   1608: aload #16
    //   1610: getfield a : Ljava/lang/Object;
    //   1613: astore #16
    //   1615: aload #15
    //   1617: checkcast h50
    //   1620: astore #15
    //   1622: aload #15
    //   1624: getfield b : Llb0;
    //   1627: astore #17
    //   1629: aload #16
    //   1631: checkcast ua0
    //   1634: astore #17
    //   1636: aload #15
    //   1638: getfield f : Lua0;
    //   1641: astore #16
    //   1643: aload #17
    //   1645: aload #16
    //   1647: if_acmpeq -> 1706
    //   1650: aload #16
    //   1652: ifnull -> 1675
    //   1655: aload #16
    //   1657: getfield H : Z
    //   1660: ifeq -> 1669
    //   1663: aload #16
    //   1665: iconst_0
    //   1666: putfield H : Z
    //   1669: aload #16
    //   1671: iconst_0
    //   1672: invokevirtual A0 : (Z)V
    //   1675: aload #17
    //   1677: getfield H : Z
    //   1680: iconst_1
    //   1681: if_icmpeq -> 1690
    //   1684: aload #17
    //   1686: iconst_1
    //   1687: putfield H : Z
    //   1690: aload #17
    //   1692: iconst_1
    //   1693: invokevirtual A0 : (Z)V
    //   1696: aload #15
    //   1698: aload #17
    //   1700: putfield f : Lua0;
    //   1703: goto -> 1706
    //   1706: aload_0
    //   1707: getfield g : Lp51;
    //   1710: invokevirtual b : ()V
    //   1713: aload_0
    //   1714: invokevirtual getChildCount : ()I
    //   1717: istore #6
    //   1719: iconst_0
    //   1720: istore_1
    //   1721: iload_1
    //   1722: iload #6
    //   1724: if_icmpge -> 1797
    //   1727: aload_0
    //   1728: iload_1
    //   1729: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1732: astore #16
    //   1734: aload #16
    //   1736: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1739: checkcast q32
    //   1742: astore #15
    //   1744: aload #15
    //   1746: invokevirtual getClass : ()Ljava/lang/Class;
    //   1749: pop
    //   1750: aload #15
    //   1752: getfield a : Z
    //   1755: ifne -> 1791
    //   1758: aload #15
    //   1760: getfield c : F
    //   1763: fconst_0
    //   1764: fcmpl
    //   1765: ifne -> 1791
    //   1768: aload_0
    //   1769: aload #16
    //   1771: invokevirtual i : (Landroid/view/View;)Lp32;
    //   1774: astore #16
    //   1776: aload #16
    //   1778: ifnull -> 1791
    //   1781: aload #15
    //   1783: aload #16
    //   1785: getfield d : F
    //   1788: putfield c : F
    //   1791: iinc #1, 1
    //   1794: goto -> 1721
    //   1797: aload_0
    //   1798: invokevirtual hasFocus : ()Z
    //   1801: ifeq -> 1949
    //   1804: aload_0
    //   1805: invokevirtual findFocus : ()Landroid/view/View;
    //   1808: astore #15
    //   1810: aload #15
    //   1812: ifnull -> 1865
    //   1815: aload #15
    //   1817: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   1820: astore #16
    //   1822: aload #16
    //   1824: aload_0
    //   1825: if_acmpeq -> 1854
    //   1828: aload #16
    //   1830: ifnull -> 1865
    //   1833: aload #16
    //   1835: instanceof android/view/View
    //   1838: ifne -> 1844
    //   1841: goto -> 1865
    //   1844: aload #16
    //   1846: checkcast android/view/View
    //   1849: astore #15
    //   1851: goto -> 1815
    //   1854: aload_0
    //   1855: aload #15
    //   1857: invokevirtual i : (Landroid/view/View;)Lp32;
    //   1860: astore #15
    //   1862: goto -> 1868
    //   1865: aconst_null
    //   1866: astore #15
    //   1868: iload #10
    //   1870: istore_1
    //   1871: aload #15
    //   1873: ifnull -> 1891
    //   1876: aload #15
    //   1878: getfield b : I
    //   1881: aload_0
    //   1882: getfield h : I
    //   1885: if_icmpeq -> 1949
    //   1888: iload #10
    //   1890: istore_1
    //   1891: iload_1
    //   1892: aload_0
    //   1893: invokevirtual getChildCount : ()I
    //   1896: if_icmpge -> 1949
    //   1899: aload_0
    //   1900: iload_1
    //   1901: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1904: astore #16
    //   1906: aload_0
    //   1907: aload #16
    //   1909: invokevirtual i : (Landroid/view/View;)Lp32;
    //   1912: astore #15
    //   1914: aload #15
    //   1916: ifnull -> 1943
    //   1919: aload #15
    //   1921: getfield b : I
    //   1924: aload_0
    //   1925: getfield h : I
    //   1928: if_icmpne -> 1943
    //   1931: aload #16
    //   1933: iconst_2
    //   1934: invokevirtual requestFocus : (I)Z
    //   1937: ifeq -> 1943
    //   1940: goto -> 1949
    //   1943: iinc #1, 1
    //   1946: goto -> 1891
    //   1949: return
    //   1950: aload_0
    //   1951: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1954: aload_0
    //   1955: invokevirtual getId : ()I
    //   1958: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   1961: astore #15
    //   1963: goto -> 1977
    //   1966: astore #15
    //   1968: aload_0
    //   1969: invokevirtual getId : ()I
    //   1972: invokestatic toHexString : (I)Ljava/lang/String;
    //   1975: astore #15
    //   1977: new java/lang/StringBuilder
    //   1980: dup
    //   1981: ldc_w 'The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: '
    //   1984: invokespecial <init> : (Ljava/lang/String;)V
    //   1987: astore #16
    //   1989: aload #16
    //   1991: aload_0
    //   1992: getfield b : I
    //   1995: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1998: pop
    //   1999: aload #16
    //   2001: ldc_w ', found: '
    //   2004: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2007: pop
    //   2008: aload #16
    //   2010: iload #11
    //   2012: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2015: pop
    //   2016: aload #16
    //   2018: ldc_w ' Pager id: '
    //   2021: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2024: pop
    //   2025: aload #16
    //   2027: aload #15
    //   2029: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2032: pop
    //   2033: aload #16
    //   2035: ldc_w ' Pager class: '
    //   2038: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2041: pop
    //   2042: aload #16
    //   2044: aload_0
    //   2045: invokevirtual getClass : ()Ljava/lang/Class;
    //   2048: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2051: pop
    //   2052: aload_0
    //   2053: getfield g : Lp51;
    //   2056: invokevirtual getClass : ()Ljava/lang/Class;
    //   2059: astore #15
    //   2061: aload #16
    //   2063: ldc_w ' Problematic adapter: '
    //   2066: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2069: pop
    //   2070: aload #16
    //   2072: aload #15
    //   2074: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2077: pop
    //   2078: new java/lang/IllegalStateException
    //   2081: dup
    //   2082: aload #16
    //   2084: invokevirtual toString : ()Ljava/lang/String;
    //   2087: invokespecial <init> : (Ljava/lang/String;)V
    //   2090: athrow
    // Exception table:
    //   from	to	target	type
    //   1950	1963	1966	android/content/res/Resources$NotFoundException
  }
  
  public void setAdapter(p51 paramp51) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/ArrayList;
    //   4: astore #7
    //   6: aload_0
    //   7: getfield g : Lp51;
    //   10: astore #6
    //   12: iconst_0
    //   13: istore #4
    //   15: aload #6
    //   17: ifnull -> 156
    //   20: aload #6
    //   22: monitorenter
    //   23: aload #6
    //   25: monitorexit
    //   26: aload_0
    //   27: getfield g : Lp51;
    //   30: aload_0
    //   31: invokevirtual g : (Lt32;)V
    //   34: iconst_0
    //   35: istore_2
    //   36: iload_2
    //   37: aload #7
    //   39: invokevirtual size : ()I
    //   42: if_icmpge -> 79
    //   45: aload #7
    //   47: iload_2
    //   48: invokevirtual get : (I)Ljava/lang/Object;
    //   51: checkcast p32
    //   54: astore #6
    //   56: aload_0
    //   57: getfield g : Lp51;
    //   60: aload #6
    //   62: getfield b : I
    //   65: aload #6
    //   67: getfield a : Ljava/lang/Object;
    //   70: invokevirtual a : (ILjava/lang/Object;)V
    //   73: iinc #2, 1
    //   76: goto -> 36
    //   79: aload_0
    //   80: getfield g : Lp51;
    //   83: invokevirtual b : ()V
    //   86: aload #7
    //   88: invokevirtual clear : ()V
    //   91: iconst_0
    //   92: istore_2
    //   93: iload_2
    //   94: aload_0
    //   95: invokevirtual getChildCount : ()I
    //   98: if_icmpge -> 136
    //   101: iload_2
    //   102: istore_3
    //   103: aload_0
    //   104: iload_2
    //   105: invokevirtual getChildAt : (I)Landroid/view/View;
    //   108: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   111: checkcast q32
    //   114: getfield a : Z
    //   117: ifne -> 129
    //   120: aload_0
    //   121: iload_2
    //   122: invokevirtual removeViewAt : (I)V
    //   125: iload_2
    //   126: iconst_1
    //   127: isub
    //   128: istore_3
    //   129: iload_3
    //   130: iconst_1
    //   131: iadd
    //   132: istore_2
    //   133: goto -> 93
    //   136: aload_0
    //   137: iconst_0
    //   138: putfield h : I
    //   141: aload_0
    //   142: iconst_0
    //   143: iconst_0
    //   144: invokevirtual scrollTo : (II)V
    //   147: goto -> 156
    //   150: astore_1
    //   151: aload #6
    //   153: monitorexit
    //   154: aload_1
    //   155: athrow
    //   156: aload_0
    //   157: aload_1
    //   158: putfield g : Lp51;
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield b : I
    //   166: aload_1
    //   167: ifnull -> 305
    //   170: aload_0
    //   171: getfield n : Lkt;
    //   174: ifnonnull -> 190
    //   177: aload_0
    //   178: new kt
    //   181: dup
    //   182: iconst_3
    //   183: aload_0
    //   184: invokespecial <init> : (ILjava/lang/Object;)V
    //   187: putfield n : Lkt;
    //   190: aload_0
    //   191: getfield g : Lp51;
    //   194: astore #6
    //   196: aload #6
    //   198: monitorenter
    //   199: aload #6
    //   201: monitorexit
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield x : Z
    //   207: aload_0
    //   208: getfield Q : Z
    //   211: istore #5
    //   213: aload_0
    //   214: iconst_1
    //   215: putfield Q : Z
    //   218: aload_0
    //   219: aload_0
    //   220: getfield g : Lp51;
    //   223: invokevirtual c : ()I
    //   226: putfield b : I
    //   229: aload_0
    //   230: getfield i : I
    //   233: iflt -> 280
    //   236: aload_0
    //   237: getfield g : Lp51;
    //   240: aload_0
    //   241: getfield j : Landroid/os/Parcelable;
    //   244: aload_0
    //   245: getfield k : Ljava/lang/ClassLoader;
    //   248: invokevirtual e : (Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    //   251: aload_0
    //   252: aload_0
    //   253: getfield i : I
    //   256: iconst_0
    //   257: iconst_0
    //   258: iconst_1
    //   259: invokevirtual x : (IIZZ)V
    //   262: aload_0
    //   263: iconst_m1
    //   264: putfield i : I
    //   267: aload_0
    //   268: aconst_null
    //   269: putfield j : Landroid/os/Parcelable;
    //   272: aload_0
    //   273: aconst_null
    //   274: putfield k : Ljava/lang/ClassLoader;
    //   277: goto -> 305
    //   280: iload #5
    //   282: ifne -> 292
    //   285: aload_0
    //   286: invokevirtual r : ()V
    //   289: goto -> 305
    //   292: aload_0
    //   293: invokevirtual requestLayout : ()V
    //   296: goto -> 305
    //   299: astore_1
    //   300: aload #6
    //   302: monitorexit
    //   303: aload_1
    //   304: athrow
    //   305: aload_0
    //   306: getfield V : Ljava/util/ArrayList;
    //   309: astore #6
    //   311: aload #6
    //   313: ifnull -> 386
    //   316: aload #6
    //   318: invokevirtual isEmpty : ()Z
    //   321: ifne -> 386
    //   324: aload_0
    //   325: getfield V : Ljava/util/ArrayList;
    //   328: invokevirtual size : ()I
    //   331: istore_3
    //   332: iload #4
    //   334: istore_2
    //   335: iload_2
    //   336: iload_3
    //   337: if_icmpge -> 386
    //   340: aload_0
    //   341: getfield V : Ljava/util/ArrayList;
    //   344: iload_2
    //   345: invokevirtual get : (I)Ljava/lang/Object;
    //   348: checkcast rs1
    //   351: astore #7
    //   353: aload #7
    //   355: getfield b : Lcom/google/android/material/tabs/TabLayout;
    //   358: astore #6
    //   360: aload #6
    //   362: getfield R : Lt32;
    //   365: aload_0
    //   366: if_acmpne -> 380
    //   369: aload #6
    //   371: aload_1
    //   372: aload #7
    //   374: getfield a : Z
    //   377: invokevirtual n : (Lp51;Z)V
    //   380: iinc #2, 1
    //   383: goto -> 335
    //   386: return
    // Exception table:
    //   from	to	target	type
    //   23	26	150	finally
    //   151	154	150	finally
    //   199	202	299	finally
    //   300	303	299	finally
  }
  
  public void setCurrentItem(int paramInt) {
    this.x = false;
    x(paramInt, 0, this.Q ^ true, false);
  }
  
  public void setOffscreenPageLimit(int paramInt) {
    int i = paramInt;
    if (paramInt < 1) {
      StringBuilder stringBuilder = new StringBuilder("Requested offscreen page limit ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" too small; defaulting to 1");
      Log.w("ViewPager", stringBuilder.toString());
      i = 1;
    } 
    if (i != this.y) {
      this.y = i;
      r();
    } 
  }
  
  @Deprecated
  public void setOnPageChangeListener(r32 paramr32) {
    this.U = paramr32;
  }
  
  public void setPageMargin(int paramInt) {
    int i = this.o;
    this.o = paramInt;
    int j = getWidth();
    t(j, j, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt) {
    setPageMarginDrawable(getContext().getDrawable(paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable) {
    boolean bool;
    this.p = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState(); 
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setScrollState(int paramInt) {
    if (this.a0 != paramInt) {
      this.a0 = paramInt;
      r32 r321 = this.U;
      if (r321 != null)
        r321.k(paramInt); 
      ArrayList arrayList = this.T;
      if (arrayList != null) {
        int i = arrayList.size();
        for (byte b = 0; b < i; b++) {
          r32 r322 = this.T.get(b);
          if (r322 != null)
            r322.k(paramInt); 
        } 
      } 
    } 
  }
  
  public final void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    float f;
    if (paramInt2 > 0 && !this.c.isEmpty()) {
      if (!this.l.isFinished()) {
        this.l.setFinalX(getCurrentItem() * getClientWidth());
        return;
      } 
      int m = getPaddingLeft();
      int k = getPaddingRight();
      int i = getPaddingLeft();
      int j = getPaddingRight();
      scrollTo((int)(getScrollX() / (paramInt2 - i - j + paramInt4) * (paramInt1 - m - k + paramInt3)), getScrollY());
      return;
    } 
    p32 p321 = k(this.h);
    if (p321 != null) {
      f = Math.min(p321.e, this.t);
    } else {
      f = 0.0F;
    } 
    paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
    if (paramInt1 != getScrollX()) {
      e(false);
      scrollTo(paramInt1, getScrollY());
    } 
  }
  
  public final boolean u() {
    this.I = -1;
    this.z = false;
    this.A = false;
    VelocityTracker velocityTracker = this.J;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.J = null;
    } 
    this.O.onRelease();
    this.P.onRelease();
    return (this.O.isFinished() || this.P.isFinished());
  }
  
  public final void v(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    p32 p321 = k(paramInt1);
    if (p321 != null) {
      float f = getClientWidth();
      i = (int)(Math.max(this.s, Math.min(p321.e, this.t)) * f);
    } else {
      i = 0;
    } 
    if (paramBoolean1) {
      if (getChildCount() == 0) {
        setScrollingCacheEnabled(false);
      } else {
        int j;
        Scroller scroller = this.l;
        if (scroller != null && !scroller.isFinished()) {
          paramBoolean1 = this.m;
          scroller = this.l;
          if (paramBoolean1) {
            j = scroller.getCurrX();
          } else {
            j = scroller.getStartX();
          } 
          this.l.abortAnimation();
          setScrollingCacheEnabled(false);
        } else {
          j = getScrollX();
        } 
        int k = getScrollY();
        int m = i - j;
        i = 0 - k;
        if (m == 0 && i == 0) {
          e(false);
          r();
          setScrollState(0);
        } else {
          setScrollingCacheEnabled(true);
          setScrollState(2);
          int i1 = getClientWidth();
          int n = i1 / 2;
          float f2 = Math.abs(m);
          float f1 = i1;
          float f3 = Math.min(1.0F, f2 * 1.0F / f1);
          f2 = n;
          f3 = (float)Math.sin(((f3 - 0.5F) * 0.47123894F));
          paramInt2 = Math.abs(paramInt2);
          if (paramInt2 > 0) {
            paramInt2 = Math.round(Math.abs((f3 * f2 + f2) / paramInt2) * 1000.0F) * 4;
          } else {
            this.g.getClass();
            paramInt2 = (int)((Math.abs(m) / (f1 * 1.0F + this.o) + 1.0F) * 100.0F);
          } 
          paramInt2 = Math.min(paramInt2, 600);
          this.m = false;
          this.l.startScroll(j, k, m, i, paramInt2);
          WeakHashMap weakHashMap = v22.a;
          postInvalidateOnAnimation();
        } 
      } 
      if (paramBoolean2)
        g(paramInt1); 
      return;
    } 
    if (paramBoolean2)
      g(paramInt1); 
    e(false);
    scrollTo(i, 0);
    p(i);
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.p);
  }
  
  public final void w(int paramInt, boolean paramBoolean) {
    this.x = false;
    x(paramInt, 0, paramBoolean, false);
  }
  
  public final void x(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    p51 p511 = this.g;
    boolean bool = false;
    if (p511 == null || p511.c() <= 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    ArrayList arrayList = this.c;
    if (!paramBoolean2 && this.h == paramInt1 && arrayList.size() != 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    if (paramInt1 < 0) {
      i = 0;
    } else {
      i = paramInt1;
      if (paramInt1 >= this.g.c())
        i = this.g.c() - 1; 
    } 
    int j = this.y;
    paramInt1 = this.h;
    if (i > paramInt1 + j || i < paramInt1 - j)
      for (paramInt1 = 0; paramInt1 < arrayList.size(); paramInt1++)
        ((p32)arrayList.get(paramInt1)).c = true;  
    paramBoolean2 = bool;
    if (this.h != i)
      paramBoolean2 = true; 
    if (this.Q) {
      this.h = i;
      if (paramBoolean2)
        g(i); 
      requestLayout();
      return;
    } 
    s(i);
    v(i, paramInt2, paramBoolean1, paramBoolean2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */