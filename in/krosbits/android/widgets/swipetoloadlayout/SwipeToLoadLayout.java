package in.krosbits.android.widgets.swipetoloadlayout;

import ag0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import cc1;
import in.krosbits.musicolet.MyApplication;
import java.util.WeakHashMap;
import l41;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import o41;
import qv;
import sr1;
import tp;
import tr1;
import ur1;
import v22;
import wr1;

public class SwipeToLoadLayout extends ViewGroup {
  public static final int Q = 0;
  
  public float A;
  
  public float B;
  
  public float C;
  
  public float D;
  
  public int E = 300;
  
  public int F = 200;
  
  public int G = 500;
  
  public int H = 200;
  
  public int I = 300;
  
  public int J = 200;
  
  public boolean K;
  
  public float L = -1.0F;
  
  public float M = -1.0F;
  
  public final float N = MyApplication.p * 6.0F;
  
  public final sr1 O = new sr1(this);
  
  public final tr1 P = new tr1(this);
  
  public final ur1 b;
  
  public o41 c;
  
  public l41 e;
  
  public View f;
  
  public View g;
  
  public View h;
  
  public int i;
  
  public int j;
  
  public boolean k;
  
  public boolean l;
  
  public float m = 0.5F;
  
  public boolean n;
  
  public final int o;
  
  public int p = 0;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public float t;
  
  public float u;
  
  public float v;
  
  public int w;
  
  public boolean x = true;
  
  public boolean y = true;
  
  public int z = 0;
  
  public SwipeToLoadLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public SwipeToLoadLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SwipeToLoadLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.i, paramInt, 0);
    try {
      int i = typedArray.getIndexCount();
      for (paramInt = 0; paramInt < i; paramInt++) {
        int j = typedArray.getIndex(paramInt);
        if (j == 10) {
          setRefreshEnabled(typedArray.getBoolean(j, true));
        } else if (j == 5) {
          setLoadMoreEnabled(typedArray.getBoolean(j, true));
        } else if (j == 15) {
          setSwipeStyle(typedArray.getInt(j, 0));
        } else if (j == 2) {
          setDragRatio(typedArray.getFloat(j, 0.5F));
        } else if (j == 11) {
          setRefreshFinalDragOffset(typedArray.getDimensionPixelOffset(j, 0));
        } else if (j == 6) {
          setLoadMoreFinalDragOffset(typedArray.getDimensionPixelOffset(j, 0));
        } else if (j == 12) {
          setRefreshTriggerOffset(typedArray.getDimensionPixelOffset(j, 0));
        } else if (j == 7) {
          setLoadMoreTriggerOffset(typedArray.getDimensionPixelOffset(j, 0));
        } else if (j == 17) {
          setSwipingToRefreshToDefaultScrollingDuration(typedArray.getInt(j, 300));
        } else if (j == 14) {
          setReleaseToRefreshingScrollingDuration(typedArray.getInt(j, 200));
        } else if (j == 8) {
          setRefreshCompleteDelayDuration(typedArray.getInt(j, 200));
        } else if (j == 9) {
          setRefreshCompleteToDefaultScrollingDuration(typedArray.getInt(j, 500));
        } else if (j == 1) {
          setDefaultToRefreshingScrollingDuration(typedArray.getInt(j, 500));
        } else if (j == 16) {
          setSwipingToLoadMoreToDefaultScrollingDuration(typedArray.getInt(j, 300));
        } else if (j == 13) {
          setReleaseToLoadingMoreScrollingDuration(typedArray.getInt(j, 200));
        } else if (j == 3) {
          setLoadMoreCompleteDelayDuration(typedArray.getInt(j, 200));
        } else if (j == 4) {
          setLoadMoreCompleteToDefaultScrollingDuration(typedArray.getInt(j, 200));
        } else if (j == 0) {
          setDefaultToLoadingMoreScrollingDuration(typedArray.getInt(j, 200));
        } 
      } 
    } finally {}
    typedArray.recycle();
    this.o = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.b = new ur1(this);
  }
  
  public static boolean b(View paramView, int paramInt1, int paramInt2) {
    if (paramView == null)
      return false; 
    WeakHashMap weakHashMap = v22.a;
    boolean bool = paramView.canScrollVertically(1);
    return (!bool && paramView instanceof ViewGroup) ? b(ag0.q((ViewGroup)paramView, paramInt1, paramInt2), paramInt1, paramInt2) : bool;
  }
  
  public static boolean c(View paramView, int paramInt1, int paramInt2) {
    if (paramView == null)
      return false; 
    WeakHashMap weakHashMap = v22.a;
    boolean bool = paramView.canScrollVertically(-1);
    if (!bool && paramView instanceof ViewGroup) {
      paramView = ag0.q((ViewGroup)paramView, paramInt1, paramInt2);
      if (paramView != null)
        return c(paramView, paramInt1, paramInt2); 
    } 
    return bool;
  }
  
  public static float f(MotionEvent paramMotionEvent, int paramInt) {
    paramInt = paramMotionEvent.findPointerIndex(paramInt);
    return (paramInt < 0) ? -1.0F : paramMotionEvent.getX(paramInt);
  }
  
  public static float g(MotionEvent paramMotionEvent, int paramInt) {
    paramInt = paramMotionEvent.findPointerIndex(paramInt);
    return (paramInt < 0) ? -1.0F : paramMotionEvent.getY(paramInt);
  }
  
  private void setStatus(int paramInt) {
    this.p = paramInt;
    if (paramInt == 0) {
      View view1 = this.f;
      if (view1 != null)
        view1.setVisibility(8); 
      view1 = this.h;
      if (view1 != null)
        view1.setVisibility(8); 
    } 
    View view = this.f;
    if (view != null)
      ((wr1)view).b(paramInt); 
    view = this.h;
    if (view != null)
      ((wr1)view).b(paramInt); 
  }
  
  public final void a() {
    boolean bool = qv.b(this.p);
    sr1 sr11 = this.O;
    if (bool) {
      setStatus(-3);
      e();
      sr11.c();
      return;
    } 
    int i = this.p;
    if (i == -3) {
      setStatus(0);
      e();
      sr11.f();
      return;
    } 
    if (qv.c(i)) {
      if (this.n) {
        this.n = false;
        setStatus(-3);
        e();
        sr11.c();
        return;
      } 
      setStatus(0);
      e();
      sr11.f();
      return;
    } 
    i = this.p;
    if (i == 0)
      return; 
    tr1 tr11 = this.P;
    if (i == 1) {
      if (this.n) {
        this.n = false;
        setStatus(3);
        e();
        tr11.c();
        return;
      } 
      setStatus(0);
      e();
      tr11.f();
      return;
    } 
    if (i == 3) {
      setStatus(0);
      e();
      tr11.f();
      return;
    } 
    if (qv.a(i)) {
      setStatus(3);
      e();
      tr11.c();
      return;
    } 
    switch (this.p) {
      default:
        str = "status_illegal!";
        throw new IllegalStateException("illegal state: ".concat(str));
      case 4:
        str = "status_load_more_returning";
        throw new IllegalStateException("illegal state: ".concat(str));
      case 3:
        str = kOkiWEITVb.ndbbRsFpbS;
        throw new IllegalStateException("illegal state: ".concat(str));
      case 2:
        str = "status_release_to_load_more";
        throw new IllegalStateException("illegal state: ".concat(str));
      case 1:
        str = "status_swiping_to_load_more";
        throw new IllegalStateException("illegal state: ".concat(str));
      case 0:
        str = "status_default";
        throw new IllegalStateException("illegal state: ".concat(str));
      case -1:
        str = "status_swiping_to_refresh";
        throw new IllegalStateException("illegal state: ".concat(str));
      case -2:
        str = "status_release_to_refresh";
        throw new IllegalStateException("illegal state: ".concat(str));
      case -3:
        str = "status_refreshing";
        throw new IllegalStateException("illegal state: ".concat(str));
      case -4:
        break;
    } 
    String str = "status_refresh_returning";
    throw new IllegalStateException("illegal state: ".concat(str));
  }
  
  public final void d(float paramFloat) {
    // Byte code:
    //   0: fload_1
    //   1: aload_0
    //   2: getfield m : F
    //   5: fmul
    //   6: fstore_2
    //   7: aload_0
    //   8: getfield r : I
    //   11: istore #5
    //   13: iload #5
    //   15: i2f
    //   16: fload_2
    //   17: fadd
    //   18: fstore_3
    //   19: fload_3
    //   20: fconst_0
    //   21: fcmpl
    //   22: ifle -> 30
    //   25: iload #5
    //   27: iflt -> 45
    //   30: fload_2
    //   31: fstore_1
    //   32: fload_3
    //   33: fconst_0
    //   34: fcmpg
    //   35: ifge -> 50
    //   38: fload_2
    //   39: fstore_1
    //   40: iload #5
    //   42: ifle -> 50
    //   45: iload #5
    //   47: ineg
    //   48: i2f
    //   49: fstore_1
    //   50: aload_0
    //   51: getfield C : F
    //   54: fstore_2
    //   55: fload_2
    //   56: aload_0
    //   57: getfield A : F
    //   60: fcmpl
    //   61: iflt -> 79
    //   64: fload_3
    //   65: fload_2
    //   66: fcmpl
    //   67: ifle -> 79
    //   70: fload_2
    //   71: iload #5
    //   73: i2f
    //   74: fsub
    //   75: fstore_2
    //   76: goto -> 115
    //   79: aload_0
    //   80: getfield D : F
    //   83: fstore #4
    //   85: fload_1
    //   86: fstore_2
    //   87: fload #4
    //   89: aload_0
    //   90: getfield B : F
    //   93: fcmpl
    //   94: iflt -> 115
    //   97: fload_1
    //   98: fstore_2
    //   99: fload_3
    //   100: fneg
    //   101: fload #4
    //   103: fcmpl
    //   104: ifle -> 115
    //   107: fload #4
    //   109: fneg
    //   110: iload #5
    //   112: i2f
    //   113: fsub
    //   114: fstore_2
    //   115: aload_0
    //   116: getfield p : I
    //   119: istore #6
    //   121: iload #6
    //   123: ifge -> 140
    //   126: aload_0
    //   127: getfield O : Lsr1;
    //   130: iload #5
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual a : (IZZ)V
    //   137: goto -> 156
    //   140: iload #6
    //   142: ifle -> 156
    //   145: aload_0
    //   146: getfield P : Ltr1;
    //   149: iload #5
    //   151: iconst_0
    //   152: iconst_0
    //   153: invokevirtual a : (IZZ)V
    //   156: aload_0
    //   157: fload_2
    //   158: invokevirtual k : (F)V
    //   161: return
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 1 || i == 3) {
      boolean bool = qv.c(this.p);
      ur1 ur11 = this.b;
      if (bool) {
        ur1.a(ur11, -this.q, this.E);
      } else {
        i = this.p;
        if (i == 1) {
          ur1.a(ur11, -this.s, this.I);
        } else if (qv.b(i)) {
          this.O.d();
          ur1.a(ur11, -this.q, this.F);
        } else if (qv.a(this.p)) {
          this.P.d();
          ur1.a(ur11, -this.s, this.H);
        } 
      } 
    } 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void e() {
    int i = this.p;
    if (i == -3) {
      i = (int)(this.A + 0.5F);
      this.r = i;
      this.q = i;
      this.s = 0;
      h();
      invalidate();
      return;
    } 
    if (i == 0) {
      this.r = 0;
      this.q = 0;
      this.s = 0;
      h();
      invalidate();
      return;
    } 
    if (i == 3) {
      i = -((int)(this.B + 0.5F));
      this.r = i;
      this.q = 0;
      this.s = i;
      h();
      invalidate();
    } 
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -1);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(paramLayoutParams);
  }
  
  public final void h() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getMeasuredWidth : ()I
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual getMeasuredHeight : ()I
    //   9: istore #4
    //   11: aload_0
    //   12: invokevirtual getPaddingLeft : ()I
    //   15: istore #6
    //   17: aload_0
    //   18: invokevirtual getPaddingTop : ()I
    //   21: istore_3
    //   22: aload_0
    //   23: invokevirtual getPaddingRight : ()I
    //   26: pop
    //   27: aload_0
    //   28: invokevirtual getPaddingBottom : ()I
    //   31: istore #5
    //   33: aload_0
    //   34: getfield g : Landroid/view/View;
    //   37: ifnonnull -> 43
    //   40: goto -> 649
    //   43: aload_0
    //   44: getfield f : Landroid/view/View;
    //   47: astore #9
    //   49: aload #9
    //   51: ifnull -> 222
    //   54: aload #9
    //   56: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   59: checkcast android/view/ViewGroup$MarginLayoutParams
    //   62: astore #8
    //   64: aload #8
    //   66: getfield leftMargin : I
    //   69: iload #6
    //   71: iadd
    //   72: istore #7
    //   74: aload_0
    //   75: getfield z : I
    //   78: istore_2
    //   79: iload_2
    //   80: ifeq -> 178
    //   83: iload_2
    //   84: iconst_1
    //   85: if_icmpeq -> 157
    //   88: iload_2
    //   89: iconst_2
    //   90: if_icmpeq -> 146
    //   93: aload #8
    //   95: getfield topMargin : I
    //   98: istore_1
    //   99: iload_2
    //   100: iconst_3
    //   101: if_icmpeq -> 125
    //   104: iload_1
    //   105: iload_3
    //   106: iadd
    //   107: aload_0
    //   108: getfield i : I
    //   111: isub
    //   112: istore_1
    //   113: aload_0
    //   114: getfield q : I
    //   117: istore_2
    //   118: iload_1
    //   119: iload_2
    //   120: iadd
    //   121: istore_1
    //   122: goto -> 199
    //   125: iload_1
    //   126: iload_3
    //   127: iadd
    //   128: aload_0
    //   129: getfield i : I
    //   132: iconst_2
    //   133: idiv
    //   134: isub
    //   135: aload_0
    //   136: getfield q : I
    //   139: iconst_2
    //   140: idiv
    //   141: iadd
    //   142: istore_1
    //   143: goto -> 199
    //   146: aload #8
    //   148: getfield topMargin : I
    //   151: iload_3
    //   152: iadd
    //   153: istore_1
    //   154: goto -> 199
    //   157: aload #8
    //   159: getfield topMargin : I
    //   162: iload_3
    //   163: iadd
    //   164: aload_0
    //   165: getfield i : I
    //   168: isub
    //   169: istore_1
    //   170: aload_0
    //   171: getfield q : I
    //   174: istore_2
    //   175: goto -> 118
    //   178: aload #8
    //   180: getfield topMargin : I
    //   183: iload_3
    //   184: iadd
    //   185: aload_0
    //   186: getfield i : I
    //   189: isub
    //   190: istore_1
    //   191: aload_0
    //   192: getfield q : I
    //   195: istore_2
    //   196: goto -> 118
    //   199: aload #9
    //   201: iload #7
    //   203: iload_1
    //   204: aload #9
    //   206: invokevirtual getMeasuredWidth : ()I
    //   209: iload #7
    //   211: iadd
    //   212: aload #9
    //   214: invokevirtual getMeasuredHeight : ()I
    //   217: iload_1
    //   218: iadd
    //   219: invokevirtual layout : (IIII)V
    //   222: aload_0
    //   223: getfield g : Landroid/view/View;
    //   226: astore #9
    //   228: aload #9
    //   230: ifnull -> 377
    //   233: aload #9
    //   235: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   238: checkcast android/view/ViewGroup$MarginLayoutParams
    //   241: astore #8
    //   243: aload #8
    //   245: getfield leftMargin : I
    //   248: iload #6
    //   250: iadd
    //   251: istore #7
    //   253: aload_0
    //   254: getfield z : I
    //   257: istore_1
    //   258: iload_1
    //   259: ifeq -> 338
    //   262: iload_1
    //   263: iconst_1
    //   264: if_icmpeq -> 327
    //   267: iload_1
    //   268: iconst_2
    //   269: if_icmpeq -> 311
    //   272: aload #8
    //   274: getfield topMargin : I
    //   277: istore_2
    //   278: iload_1
    //   279: iconst_3
    //   280: if_icmpeq -> 299
    //   283: iload_3
    //   284: iload_2
    //   285: iadd
    //   286: istore_1
    //   287: aload_0
    //   288: getfield r : I
    //   291: istore_2
    //   292: iload_1
    //   293: iload_2
    //   294: iadd
    //   295: istore_1
    //   296: goto -> 354
    //   299: iload_3
    //   300: iload_2
    //   301: iadd
    //   302: istore_1
    //   303: aload_0
    //   304: getfield r : I
    //   307: istore_2
    //   308: goto -> 292
    //   311: iload_3
    //   312: aload #8
    //   314: getfield topMargin : I
    //   317: iadd
    //   318: istore_1
    //   319: aload_0
    //   320: getfield r : I
    //   323: istore_2
    //   324: goto -> 292
    //   327: aload #8
    //   329: getfield topMargin : I
    //   332: istore_2
    //   333: iload_3
    //   334: istore_1
    //   335: goto -> 292
    //   338: iload_3
    //   339: aload #8
    //   341: getfield topMargin : I
    //   344: iadd
    //   345: istore_1
    //   346: aload_0
    //   347: getfield r : I
    //   350: istore_2
    //   351: goto -> 292
    //   354: aload #9
    //   356: iload #7
    //   358: iload_1
    //   359: aload #9
    //   361: invokevirtual getMeasuredWidth : ()I
    //   364: iload #7
    //   366: iadd
    //   367: aload #9
    //   369: invokevirtual getMeasuredHeight : ()I
    //   372: iload_1
    //   373: iadd
    //   374: invokevirtual layout : (IIII)V
    //   377: aload_0
    //   378: getfield h : Landroid/view/View;
    //   381: astore #8
    //   383: aload #8
    //   385: ifnull -> 573
    //   388: aload #8
    //   390: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   393: checkcast android/view/ViewGroup$MarginLayoutParams
    //   396: astore #9
    //   398: iload #6
    //   400: aload #9
    //   402: getfield leftMargin : I
    //   405: iadd
    //   406: istore_3
    //   407: aload_0
    //   408: getfield z : I
    //   411: istore_2
    //   412: iload_2
    //   413: ifeq -> 527
    //   416: iload_2
    //   417: iconst_1
    //   418: if_icmpeq -> 502
    //   421: iload_2
    //   422: iconst_2
    //   423: if_icmpeq -> 487
    //   426: aload #9
    //   428: getfield bottomMargin : I
    //   431: istore_1
    //   432: iload_2
    //   433: iconst_3
    //   434: if_icmpeq -> 462
    //   437: iload #4
    //   439: iload #5
    //   441: isub
    //   442: iload_1
    //   443: isub
    //   444: aload_0
    //   445: getfield j : I
    //   448: iadd
    //   449: istore_1
    //   450: aload_0
    //   451: getfield s : I
    //   454: istore_2
    //   455: iload_1
    //   456: iload_2
    //   457: iadd
    //   458: istore_1
    //   459: goto -> 552
    //   462: aload_0
    //   463: getfield j : I
    //   466: iconst_2
    //   467: idiv
    //   468: iload #4
    //   470: iload #5
    //   472: isub
    //   473: iload_1
    //   474: isub
    //   475: iadd
    //   476: istore_2
    //   477: aload_0
    //   478: getfield s : I
    //   481: iconst_2
    //   482: idiv
    //   483: istore_1
    //   484: goto -> 455
    //   487: iload #4
    //   489: iload #5
    //   491: isub
    //   492: aload #9
    //   494: getfield bottomMargin : I
    //   497: isub
    //   498: istore_1
    //   499: goto -> 552
    //   502: iload #4
    //   504: iload #5
    //   506: isub
    //   507: aload #9
    //   509: getfield bottomMargin : I
    //   512: isub
    //   513: aload_0
    //   514: getfield j : I
    //   517: iadd
    //   518: istore_1
    //   519: aload_0
    //   520: getfield s : I
    //   523: istore_2
    //   524: goto -> 455
    //   527: iload #4
    //   529: iload #5
    //   531: isub
    //   532: aload #9
    //   534: getfield bottomMargin : I
    //   537: isub
    //   538: aload_0
    //   539: getfield j : I
    //   542: iadd
    //   543: istore_1
    //   544: aload_0
    //   545: getfield s : I
    //   548: istore_2
    //   549: goto -> 455
    //   552: aload #8
    //   554: iload_3
    //   555: iload_1
    //   556: aload #8
    //   558: invokevirtual getMeasuredHeight : ()I
    //   561: isub
    //   562: aload #8
    //   564: invokevirtual getMeasuredWidth : ()I
    //   567: iload_3
    //   568: iadd
    //   569: iload_1
    //   570: invokevirtual layout : (IIII)V
    //   573: aload_0
    //   574: getfield z : I
    //   577: istore_1
    //   578: iload_1
    //   579: ifeq -> 617
    //   582: iload_1
    //   583: iconst_1
    //   584: if_icmpne -> 590
    //   587: goto -> 617
    //   590: iload_1
    //   591: iconst_2
    //   592: if_icmpeq -> 600
    //   595: iload_1
    //   596: iconst_3
    //   597: if_icmpne -> 649
    //   600: aload_0
    //   601: getfield g : Landroid/view/View;
    //   604: astore #8
    //   606: aload #8
    //   608: ifnull -> 649
    //   611: aload #8
    //   613: invokevirtual bringToFront : ()V
    //   616: return
    //   617: aload_0
    //   618: getfield f : Landroid/view/View;
    //   621: astore #8
    //   623: aload #8
    //   625: ifnull -> 633
    //   628: aload #8
    //   630: invokevirtual bringToFront : ()V
    //   633: aload_0
    //   634: getfield h : Landroid/view/View;
    //   637: astore #8
    //   639: aload #8
    //   641: ifnull -> 649
    //   644: aload #8
    //   646: invokevirtual bringToFront : ()V
    //   649: return
  }
  
  public final boolean i(int paramInt1, int paramInt2) {
    return (this.y && !b(this.g, paramInt1, paramInt2) && this.l && this.B > 0.0F);
  }
  
  public final boolean j(int paramInt1, int paramInt2) {
    return (this.x && !c(this.g, paramInt1, paramInt2) && this.k && this.A > 0.0F);
  }
  
  public final void k(float paramFloat) {
    if (paramFloat == 0.0F)
      return; 
    int i = (int)(this.r + paramFloat);
    this.r = i;
    int j = this.p;
    if (j < 0) {
      this.q = i;
      this.s = 0;
    } else if (j > 0) {
      this.s = i;
      this.q = 0;
    } 
    h();
    invalidate();
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    int i = getChildCount();
    if (i != 0) {
      if (i > 0 && i < 4) {
        this.f = findViewById(2131297563);
        this.g = findViewById(2131297564);
        this.h = findViewById(2131297562);
        if (this.g != null) {
          View view = this.f;
          if (view != null && view instanceof wr1)
            view.setVisibility(8); 
          view = this.h;
          if (view != null && view instanceof wr1)
            view.setVisibility(8); 
        } 
        return;
      } 
      tp.f("Children num must equal or less than 3");
      return;
    } 
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #8
    //   6: iconst_0
    //   7: istore #7
    //   9: iconst_0
    //   10: istore #6
    //   12: iload #8
    //   14: ifeq -> 275
    //   17: iload #8
    //   19: iconst_1
    //   20: if_icmpeq -> 267
    //   23: iload #8
    //   25: iconst_2
    //   26: if_icmpeq -> 116
    //   29: iload #8
    //   31: iconst_3
    //   32: if_icmpeq -> 267
    //   35: iload #8
    //   37: bipush #6
    //   39: if_icmpeq -> 45
    //   42: goto -> 493
    //   45: aload_1
    //   46: invokevirtual getActionIndex : ()I
    //   49: istore #7
    //   51: aload_1
    //   52: iload #7
    //   54: invokevirtual getPointerId : (I)I
    //   57: aload_0
    //   58: getfield w : I
    //   61: if_icmpne -> 82
    //   64: iload #7
    //   66: ifne -> 72
    //   69: iconst_1
    //   70: istore #6
    //   72: aload_0
    //   73: aload_1
    //   74: iload #6
    //   76: invokevirtual getPointerId : (I)I
    //   79: putfield w : I
    //   82: aload_1
    //   83: aload_0
    //   84: getfield w : I
    //   87: invokestatic g : (Landroid/view/MotionEvent;I)F
    //   90: fstore_2
    //   91: aload_0
    //   92: fload_2
    //   93: putfield v : F
    //   96: aload_0
    //   97: fload_2
    //   98: putfield t : F
    //   101: aload_0
    //   102: aload_1
    //   103: aload_0
    //   104: getfield w : I
    //   107: invokestatic f : (Landroid/view/MotionEvent;I)F
    //   110: putfield u : F
    //   113: goto -> 493
    //   116: aload_0
    //   117: getfield w : I
    //   120: istore #6
    //   122: iload #6
    //   124: iconst_m1
    //   125: if_icmpne -> 130
    //   128: iconst_0
    //   129: ireturn
    //   130: aload_1
    //   131: iload #6
    //   133: invokestatic g : (Landroid/view/MotionEvent;I)F
    //   136: fstore_3
    //   137: aload_1
    //   138: aload_0
    //   139: getfield w : I
    //   142: invokestatic f : (Landroid/view/MotionEvent;I)F
    //   145: fstore #4
    //   147: fload_3
    //   148: aload_0
    //   149: getfield t : F
    //   152: fsub
    //   153: fstore #5
    //   155: aload_0
    //   156: getfield u : F
    //   159: fstore_2
    //   160: aload_0
    //   161: fload_3
    //   162: putfield v : F
    //   165: iload #7
    //   167: istore #6
    //   169: fload #5
    //   171: invokestatic abs : (F)F
    //   174: fload #4
    //   176: fload_2
    //   177: fsub
    //   178: invokestatic abs : (F)F
    //   181: fcmpl
    //   182: ifle -> 206
    //   185: iload #7
    //   187: istore #6
    //   189: fload #5
    //   191: invokestatic abs : (F)F
    //   194: aload_0
    //   195: getfield o : I
    //   198: i2f
    //   199: fcmpl
    //   200: ifle -> 206
    //   203: iconst_1
    //   204: istore #6
    //   206: fload #5
    //   208: fconst_0
    //   209: fcmpl
    //   210: ifle -> 235
    //   213: iload #6
    //   215: ifeq -> 235
    //   218: aload_0
    //   219: aload_1
    //   220: invokevirtual getRawX : ()F
    //   223: f2i
    //   224: aload_1
    //   225: invokevirtual getRawY : ()F
    //   228: f2i
    //   229: invokevirtual j : (II)Z
    //   232: ifne -> 499
    //   235: fload #5
    //   237: fconst_0
    //   238: fcmpg
    //   239: ifge -> 493
    //   242: iload #6
    //   244: ifeq -> 493
    //   247: aload_0
    //   248: aload_1
    //   249: invokevirtual getRawX : ()F
    //   252: f2i
    //   253: aload_1
    //   254: invokevirtual getRawY : ()F
    //   257: f2i
    //   258: invokevirtual i : (II)Z
    //   261: ifeq -> 493
    //   264: goto -> 499
    //   267: aload_0
    //   268: iconst_m1
    //   269: putfield w : I
    //   272: goto -> 493
    //   275: aload_1
    //   276: iconst_0
    //   277: invokevirtual getPointerId : (I)I
    //   280: istore #6
    //   282: aload_0
    //   283: iload #6
    //   285: putfield w : I
    //   288: aload_1
    //   289: iload #6
    //   291: invokestatic g : (Landroid/view/MotionEvent;I)F
    //   294: fstore_2
    //   295: aload_0
    //   296: fload_2
    //   297: putfield v : F
    //   300: aload_0
    //   301: fload_2
    //   302: putfield t : F
    //   305: aload_0
    //   306: aload_1
    //   307: aload_0
    //   308: getfield w : I
    //   311: invokestatic f : (Landroid/view/MotionEvent;I)F
    //   314: putfield u : F
    //   317: aload_0
    //   318: getfield p : I
    //   321: invokestatic c : (I)Z
    //   324: ifne -> 360
    //   327: aload_0
    //   328: getfield p : I
    //   331: istore #6
    //   333: iload #6
    //   335: iconst_1
    //   336: if_icmpne -> 342
    //   339: goto -> 360
    //   342: iload #6
    //   344: invokestatic b : (I)Z
    //   347: ifne -> 360
    //   350: aload_0
    //   351: getfield p : I
    //   354: invokestatic a : (I)Z
    //   357: ifeq -> 447
    //   360: aload_0
    //   361: getfield b : Lur1;
    //   364: astore #9
    //   366: aload #9
    //   368: getfield b : Landroid/widget/Scroller;
    //   371: astore #10
    //   373: aload #9
    //   375: getfield e : Z
    //   378: ifeq -> 447
    //   381: aload #10
    //   383: invokevirtual isFinished : ()Z
    //   386: ifne -> 401
    //   389: aload #9
    //   391: iconst_1
    //   392: putfield f : Z
    //   395: aload #10
    //   397: iconst_1
    //   398: invokevirtual forceFinished : (Z)V
    //   401: aload #9
    //   403: iconst_0
    //   404: putfield c : I
    //   407: aload #9
    //   409: iconst_0
    //   410: putfield e : Z
    //   413: aload #9
    //   415: getfield g : Lin/krosbits/android/widgets/swipetoloadlayout/SwipeToLoadLayout;
    //   418: astore #10
    //   420: aload #10
    //   422: aload #9
    //   424: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   427: pop
    //   428: aload #9
    //   430: getfield f : Z
    //   433: ifne -> 441
    //   436: aload #10
    //   438: invokevirtual a : ()V
    //   441: aload #9
    //   443: iconst_0
    //   444: putfield f : Z
    //   447: aload_0
    //   448: getfield p : I
    //   451: invokestatic c : (I)Z
    //   454: ifne -> 499
    //   457: aload_0
    //   458: getfield p : I
    //   461: invokestatic b : (I)Z
    //   464: ifne -> 499
    //   467: aload_0
    //   468: getfield p : I
    //   471: istore #6
    //   473: iload #6
    //   475: iconst_1
    //   476: if_icmpne -> 482
    //   479: goto -> 499
    //   482: iload #6
    //   484: invokestatic a : (I)Z
    //   487: ifeq -> 493
    //   490: goto -> 499
    //   493: aload_0
    //   494: aload_1
    //   495: invokespecial onInterceptTouchEvent : (Landroid/view/MotionEvent;)Z
    //   498: ireturn
    //   499: iconst_1
    //   500: ireturn
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    h();
    View view = this.f;
    boolean bool = false;
    if (view != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.k = paramBoolean;
    paramBoolean = bool;
    if (this.h != null)
      paramBoolean = true; 
    this.l = paramBoolean;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    View view2 = this.f;
    if (view2 != null) {
      measureChildWithMargins(view2, paramInt1, 0, paramInt2, 0);
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view2.getLayoutParams();
      int i = view2.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
      this.i = i;
      if (this.A < i)
        this.A = i; 
    } 
    View view1 = this.g;
    if (view1 != null)
      measureChildWithMargins(view1, paramInt1, 0, paramInt2, 0); 
    view2 = this.h;
    if (view2 != null) {
      measureChildWithMargins(view2, paramInt1, 0, paramInt2, 0);
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view2.getLayoutParams();
      paramInt1 = view2.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
      this.j = paramInt1;
      if (this.B < paramInt1)
        this.B = paramInt1; 
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int j = paramMotionEvent.getActionMasked();
    int i = 0;
    if (j != 0) {
      if (j != 1)
        if (j != 2) {
          if (j != 3) {
            if (j != 5) {
              if (j == 6) {
                j = paramMotionEvent.getActionIndex();
                if (paramMotionEvent.getPointerId(j) == this.w) {
                  if (j == 0)
                    i = 1; 
                  this.w = paramMotionEvent.getPointerId(i);
                } 
                float f = g(paramMotionEvent, this.w);
                this.v = f;
                this.t = f;
                this.u = f(paramMotionEvent, this.w);
                return true;
              } 
            } else {
              i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
              if (i != -1)
                this.w = i; 
              float f = g(paramMotionEvent, this.w);
              this.v = f;
              this.t = f;
              this.u = f(paramMotionEvent, this.w);
              return true;
            } 
            return true;
          } 
        } else {
          if (this.K)
            try {
              return true;
            } finally {
              paramMotionEvent = null;
              paramMotionEvent.printStackTrace();
            }  
          float f2 = paramMotionEvent.getY();
          float f4 = paramMotionEvent.getX();
          float f1 = f2 - this.v;
          this.v = f2;
          if (this.L == -1.0F)
            this.L = paramMotionEvent.getX(); 
          if (this.M == -1.0F)
            this.M = paramMotionEvent.getY(); 
          float f3 = this.L;
          f2 -= this.M;
          f3 = Math.abs(f4 - f3);
          f4 = Math.abs(f2);
          if (this.p == 0 && f3 > this.N && f3 > f4)
            this.K = true; 
          i = this.p;
          if (i == 0) {
            if (f2 > 0.0F && j((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY())) {
              this.O.e();
              setStatus(-1);
            } else if (f2 < 0.0F && i((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY())) {
              this.P.e();
              setStatus(1);
            } 
          } else if (i < 0) {
            if (this.r <= 0) {
              setStatus(0);
              e();
              return true;
            } 
          } else if (i > 0 && this.r >= 0) {
            setStatus(0);
            e();
            return true;
          } 
          i = this.p;
          if (i < 0) {
            if (qv.c(i) || qv.b(this.p)) {
              if (this.r >= this.A) {
                setStatus(-2);
              } else {
                setStatus(-1);
              } 
              d(f1);
            } 
          } else if (i > 0 && (i == 1 || qv.a(i))) {
            if (-this.r >= this.B) {
              setStatus(2);
            } else {
              setStatus(1);
            } 
            d(f1);
          } 
          return true;
        }  
      this.v = -1.0F;
      this.M = -1.0F;
      this.L = -1.0F;
      this.K = false;
      if (this.w == -1)
        return false; 
      this.w = -1;
      return true;
    } 
    this.L = paramMotionEvent.getX();
    this.M = paramMotionEvent.getY();
    this.w = paramMotionEvent.getPointerId(0);
    this.K = false;
    return true;
  }
  
  public void setDebug(boolean paramBoolean) {}
  
  public void setDefaultToLoadingMoreScrollingDuration(int paramInt) {
    this.J = paramInt;
  }
  
  public void setDefaultToRefreshingScrollingDuration(int paramInt) {
    this.G = paramInt;
  }
  
  public void setDragRatio(float paramFloat) {
    this.m = paramFloat;
  }
  
  public void setLoadMoreCompleteDelayDuration(int paramInt) {}
  
  public void setLoadMoreCompleteToDefaultScrollingDuration(int paramInt) {
    this.H = paramInt;
  }
  
  public void setLoadMoreEnabled(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void setLoadMoreFinalDragOffset(int paramInt) {
    this.D = paramInt;
  }
  
  public void setLoadMoreFooterView(View paramView) {
    Log.e("SwipeToLoadLayout", "Load more footer view must be an implement of SwipeLoadTrigger");
  }
  
  public void setLoadMoreTriggerOffset(int paramInt) {
    this.B = paramInt;
  }
  
  public void setLoadingMore(boolean paramBoolean) {
    if (this.y && this.h != null) {
      this.n = paramBoolean;
      int i = this.p;
      if (paramBoolean) {
        if (i == 0) {
          setStatus(1);
          i = -((int)(this.B + 0.5F));
          int j = this.J;
          ur1.a(this.b, i, j);
          return;
        } 
      } else if (i == 3) {
        this.P.onComplete();
        a();
      } 
    } 
  }
  
  public void setOnLoadMoreListener(l41 paraml41) {
    this.e = paraml41;
  }
  
  public void setOnRefreshListener(o41 paramo41) {
    this.c = paramo41;
  }
  
  public void setRefreshCompleteDelayDuration(int paramInt) {}
  
  public void setRefreshCompleteToDefaultScrollingDuration(int paramInt) {}
  
  public void setRefreshEnabled(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void setRefreshFinalDragOffset(int paramInt) {
    this.C = paramInt;
  }
  
  public void setRefreshHeaderView(View paramView) {
    if (paramView instanceof rr1) {
      View view = this.f;
      if (view != null && view != paramView)
        removeView(view); 
      if (this.f != paramView) {
        this.f = paramView;
        addView(paramView);
      } 
      return;
    } 
    Log.e("SwipeToLoadLayout", "Refresh header view must be an implement of SwipeRefreshTrigger");
  }
  
  public void setRefreshTriggerOffset(int paramInt) {
    this.A = paramInt;
  }
  
  public void setRefreshing(boolean paramBoolean) {
    if (this.x && this.f != null) {
      this.n = paramBoolean;
      int i = this.p;
      if (paramBoolean) {
        if (i == 0) {
          setStatus(-1);
          int j = (int)(this.A + 0.5F);
          i = this.G;
          ur1.a(this.b, j, i);
          return;
        } 
      } else if (i == -3) {
        this.O.onComplete();
        a();
      } 
    } 
  }
  
  public void setReleaseToLoadingMoreScrollingDuration(int paramInt) {}
  
  public void setReleaseToRefreshingScrollingDuration(int paramInt) {
    this.F = paramInt;
  }
  
  public void setSwipeStyle(int paramInt) {
    this.z = paramInt;
    requestLayout();
  }
  
  public void setSwipingToLoadMoreToDefaultScrollingDuration(int paramInt) {
    this.I = paramInt;
  }
  
  public void setSwipingToRefreshToDefaultScrollingDuration(int paramInt) {
    this.E = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\swipetoloadlayout\SwipeToLoadLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */