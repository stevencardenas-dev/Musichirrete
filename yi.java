import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;

public final class yi extends zw0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
  public PopupWindow.OnDismissListener A;
  
  public boolean B;
  
  public final Context c;
  
  public final int e;
  
  public final int f;
  
  public final boolean g;
  
  public final Handler h;
  
  public final ArrayList i = new ArrayList();
  
  public final ArrayList j = new ArrayList();
  
  public final l7 k = new l7(2, this);
  
  public final vi l;
  
  public final gh1 m;
  
  public int n;
  
  public int o;
  
  public View p;
  
  public View q;
  
  public int r;
  
  public boolean s;
  
  public boolean t;
  
  public int u;
  
  public int v;
  
  public boolean w;
  
  public boolean x;
  
  public gx0 y;
  
  public ViewTreeObserver z;
  
  public yi(Context paramContext, View paramView, int paramInt, boolean paramBoolean) {
    boolean bool = false;
    this.l = new vi(0, this);
    this.m = new gh1(16, this);
    this.n = 0;
    this.o = 0;
    this.c = paramContext;
    this.p = paramView;
    this.f = paramInt;
    this.g = paramBoolean;
    this.w = false;
    if (paramView.getLayoutDirection() == 1) {
      paramInt = bool;
    } else {
      paramInt = 1;
    } 
    this.r = paramInt;
    Resources resources = paramContext.getResources();
    this.e = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(2131165207));
    this.h = new Handler();
  }
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/util/ArrayList;
    //   4: astore #6
    //   6: aload #6
    //   8: invokevirtual size : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: iload #4
    //   18: if_icmpge -> 46
    //   21: aload_1
    //   22: aload #6
    //   24: iload_3
    //   25: invokevirtual get : (I)Ljava/lang/Object;
    //   28: checkcast xi
    //   31: getfield b : Lrw0;
    //   34: if_acmpne -> 40
    //   37: goto -> 48
    //   40: iinc #3, 1
    //   43: goto -> 15
    //   46: iconst_m1
    //   47: istore_3
    //   48: iload_3
    //   49: ifge -> 55
    //   52: goto -> 308
    //   55: iload_3
    //   56: iconst_1
    //   57: iadd
    //   58: istore #4
    //   60: iload #4
    //   62: aload #6
    //   64: invokevirtual size : ()I
    //   67: if_icmpge -> 87
    //   70: aload #6
    //   72: iload #4
    //   74: invokevirtual get : (I)Ljava/lang/Object;
    //   77: checkcast xi
    //   80: getfield b : Lrw0;
    //   83: iconst_0
    //   84: invokevirtual c : (Z)V
    //   87: aload #6
    //   89: iload_3
    //   90: invokevirtual remove : (I)Ljava/lang/Object;
    //   93: checkcast xi
    //   96: astore #7
    //   98: aload #7
    //   100: getfield b : Lrw0;
    //   103: astore #5
    //   105: aload #7
    //   107: getfield a : Lfx0;
    //   110: astore #7
    //   112: aload #7
    //   114: getfield B : Lf7;
    //   117: astore #8
    //   119: aload #5
    //   121: aload_0
    //   122: invokevirtual r : (Lhx0;)V
    //   125: aload_0
    //   126: getfield B : Z
    //   129: ifeq -> 144
    //   132: aload #8
    //   134: aconst_null
    //   135: invokestatic b : (Landroid/widget/PopupWindow;Landroid/transition/Transition;)V
    //   138: aload #8
    //   140: iconst_0
    //   141: invokevirtual setAnimationStyle : (I)V
    //   144: aload #7
    //   146: invokevirtual dismiss : ()V
    //   149: aload #6
    //   151: invokevirtual size : ()I
    //   154: istore #4
    //   156: iload #4
    //   158: ifle -> 183
    //   161: aload_0
    //   162: aload #6
    //   164: iload #4
    //   166: iconst_1
    //   167: isub
    //   168: invokevirtual get : (I)Ljava/lang/Object;
    //   171: checkcast xi
    //   174: getfield c : I
    //   177: putfield r : I
    //   180: goto -> 206
    //   183: aload_0
    //   184: getfield p : Landroid/view/View;
    //   187: invokevirtual getLayoutDirection : ()I
    //   190: iconst_1
    //   191: if_icmpne -> 199
    //   194: iconst_0
    //   195: istore_3
    //   196: goto -> 201
    //   199: iconst_1
    //   200: istore_3
    //   201: aload_0
    //   202: iload_3
    //   203: putfield r : I
    //   206: iload #4
    //   208: ifne -> 288
    //   211: aload_0
    //   212: invokevirtual dismiss : ()V
    //   215: aload_0
    //   216: getfield y : Lgx0;
    //   219: astore #5
    //   221: aload #5
    //   223: ifnull -> 235
    //   226: aload #5
    //   228: aload_1
    //   229: iconst_1
    //   230: invokeinterface a : (Lrw0;Z)V
    //   235: aload_0
    //   236: getfield z : Landroid/view/ViewTreeObserver;
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull -> 267
    //   244: aload_1
    //   245: invokevirtual isAlive : ()Z
    //   248: ifeq -> 262
    //   251: aload_0
    //   252: getfield z : Landroid/view/ViewTreeObserver;
    //   255: aload_0
    //   256: getfield k : Ll7;
    //   259: invokevirtual removeGlobalOnLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   262: aload_0
    //   263: aconst_null
    //   264: putfield z : Landroid/view/ViewTreeObserver;
    //   267: aload_0
    //   268: getfield q : Landroid/view/View;
    //   271: aload_0
    //   272: getfield l : Lvi;
    //   275: invokevirtual removeOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
    //   278: aload_0
    //   279: getfield A : Landroid/widget/PopupWindow$OnDismissListener;
    //   282: invokeinterface onDismiss : ()V
    //   287: return
    //   288: iload_2
    //   289: ifeq -> 308
    //   292: aload #6
    //   294: iconst_0
    //   295: invokevirtual get : (I)Ljava/lang/Object;
    //   298: checkcast xi
    //   301: getfield b : Lrw0;
    //   304: iconst_0
    //   305: invokevirtual c : (Z)V
    //   308: return
  }
  
  public final boolean b() {
    ArrayList arrayList = this.j;
    return (arrayList.size() > 0 && ((xi)arrayList.get(0)).a.B.isShowing());
  }
  
  public final void d() {
    if (!b()) {
      ArrayList<Object> arrayList = this.i;
      int i = arrayList.size();
      boolean bool = false;
      byte b = 0;
      while (b < i) {
        rw0 rw0 = (rw0)arrayList.get(b);
        b++;
        u(rw0);
      } 
      arrayList.clear();
      View view = this.p;
      this.q = view;
      if (view != null) {
        b = bool;
        if (this.z == null)
          b = 1; 
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.z = viewTreeObserver;
        if (b != 0)
          viewTreeObserver.addOnGlobalLayoutListener(this.k); 
        this.q.addOnAttachStateChangeListener(this.l);
      } 
    } 
  }
  
  public final void dismiss() {
    ArrayList arrayList = this.j;
    int i = arrayList.size();
    if (i > 0) {
      xi[] arrayOfXi = (xi[])arrayList.toArray((Object[])new xi[i]);
      while (--i >= 0) {
        xi xi = arrayOfXi[i];
        if (xi.a.B.isShowing())
          xi.a.dismiss(); 
        i--;
      } 
    } 
  }
  
  public final void e(gx0 paramgx0) {
    this.y = paramgx0;
  }
  
  public final void g() {
    ArrayList<Object> arrayList = this.j;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      ow0 ow0;
      ListAdapter listAdapter = (ListAdapter)arrayList.get(b);
      b++;
      listAdapter = ((xi)listAdapter).a.e.getAdapter();
      if (listAdapter instanceof HeaderViewListAdapter) {
        ow0 = (ow0)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
      } else {
        ow0 = ow0;
      } 
      ow0.notifyDataSetChanged();
    } 
  }
  
  public final y10 h() {
    ArrayList arrayList = this.j;
    return arrayList.isEmpty() ? null : ((xi)arrayList.get(arrayList.size() - 1)).a.e;
  }
  
  public final boolean j(tq1 paramtq1) {
    ArrayList<Object> arrayList = this.j;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      xi xi = (xi)arrayList.get(b);
      b++;
      xi = xi;
      if (paramtq1 == xi.b) {
        xi.a.e.requestFocus();
        return true;
      } 
    } 
    if (paramtq1.hasVisibleItems()) {
      l(paramtq1);
      gx0 gx01 = this.y;
      if (gx01 != null)
        gx01.k(paramtq1); 
      return true;
    } 
    return false;
  }
  
  public final boolean k() {
    return false;
  }
  
  public final void l(rw0 paramrw0) {
    paramrw0.b(this, this.c);
    if (b()) {
      u(paramrw0);
      return;
    } 
    this.i.add(paramrw0);
  }
  
  public final void n(View paramView) {
    if (this.p != paramView) {
      this.p = paramView;
      this.o = Gravity.getAbsoluteGravity(this.n, paramView.getLayoutDirection());
    } 
  }
  
  public final void o(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public final void onDismiss() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/util/ArrayList;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual size : ()I
    //   11: istore_2
    //   12: iconst_0
    //   13: istore_1
    //   14: iload_1
    //   15: iload_2
    //   16: if_icmpge -> 51
    //   19: aload #4
    //   21: iload_1
    //   22: invokevirtual get : (I)Ljava/lang/Object;
    //   25: checkcast xi
    //   28: astore_3
    //   29: aload_3
    //   30: getfield a : Lfx0;
    //   33: getfield B : Lf7;
    //   36: invokevirtual isShowing : ()Z
    //   39: ifne -> 45
    //   42: goto -> 53
    //   45: iinc #1, 1
    //   48: goto -> 14
    //   51: aconst_null
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -> 65
    //   57: aload_3
    //   58: getfield b : Lrw0;
    //   61: iconst_0
    //   62: invokevirtual c : (Z)V
    //   65: return
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public final void p(int paramInt) {
    if (this.n != paramInt) {
      this.n = paramInt;
      this.o = Gravity.getAbsoluteGravity(paramInt, this.p.getLayoutDirection());
    } 
  }
  
  public final void q(int paramInt) {
    this.s = true;
    this.u = paramInt;
  }
  
  public final void r(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.A = paramOnDismissListener;
  }
  
  public final void s(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public final void t(int paramInt) {
    this.t = true;
    this.v = paramInt;
  }
  
  public final void u(rw0 paramrw0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/content/Context;
    //   4: astore #9
    //   6: aload #9
    //   8: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   11: astore #11
    //   13: new ow0
    //   16: dup
    //   17: aload_1
    //   18: aload #11
    //   20: aload_0
    //   21: getfield g : Z
    //   24: ldc_w 2131492875
    //   27: invokespecial <init> : (Lrw0;Landroid/view/LayoutInflater;ZI)V
    //   30: astore #8
    //   32: aload_0
    //   33: invokevirtual b : ()Z
    //   36: ifne -> 55
    //   39: aload_0
    //   40: getfield w : Z
    //   43: ifeq -> 55
    //   46: aload #8
    //   48: iconst_1
    //   49: putfield e : Z
    //   52: goto -> 126
    //   55: aload_0
    //   56: invokevirtual b : ()Z
    //   59: ifeq -> 126
    //   62: aload_1
    //   63: getfield f : Ljava/util/ArrayList;
    //   66: invokevirtual size : ()I
    //   69: istore_3
    //   70: iconst_0
    //   71: istore_2
    //   72: iload_2
    //   73: iload_3
    //   74: if_icmpge -> 116
    //   77: aload_1
    //   78: iload_2
    //   79: invokevirtual getItem : (I)Landroid/view/MenuItem;
    //   82: astore #10
    //   84: aload #10
    //   86: invokeinterface isVisible : ()Z
    //   91: ifeq -> 110
    //   94: aload #10
    //   96: invokeinterface getIcon : ()Landroid/graphics/drawable/Drawable;
    //   101: ifnull -> 110
    //   104: iconst_1
    //   105: istore #7
    //   107: goto -> 119
    //   110: iinc #2, 1
    //   113: goto -> 72
    //   116: iconst_0
    //   117: istore #7
    //   119: aload #8
    //   121: iload #7
    //   123: putfield e : Z
    //   126: aload #8
    //   128: aload #9
    //   130: aload_0
    //   131: getfield e : I
    //   134: invokestatic m : (Landroid/widget/ListAdapter;Landroid/content/Context;I)I
    //   137: istore #5
    //   139: new co0
    //   142: dup
    //   143: aload #9
    //   145: aconst_null
    //   146: aload_0
    //   147: getfield f : I
    //   150: iconst_0
    //   151: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;II)V
    //   154: astore #12
    //   156: aload #12
    //   158: aload_0
    //   159: getfield m : Lgh1;
    //   162: putfield E : Lgh1;
    //   165: aload #12
    //   167: aload_0
    //   168: putfield r : Landroid/widget/AdapterView$OnItemClickListener;
    //   171: aload #12
    //   173: getfield B : Lf7;
    //   176: astore #14
    //   178: aload #14
    //   180: aload_0
    //   181: invokevirtual setOnDismissListener : (Landroid/widget/PopupWindow$OnDismissListener;)V
    //   184: aload #12
    //   186: aload_0
    //   187: getfield p : Landroid/view/View;
    //   190: putfield q : Landroid/view/View;
    //   193: aload #12
    //   195: aload_0
    //   196: getfield o : I
    //   199: putfield n : I
    //   202: aload #12
    //   204: iconst_1
    //   205: putfield A : Z
    //   208: aload #14
    //   210: iconst_1
    //   211: invokevirtual setFocusable : (Z)V
    //   214: aload #14
    //   216: iconst_2
    //   217: invokevirtual setInputMethodMode : (I)V
    //   220: aload #12
    //   222: aload #8
    //   224: invokevirtual q : (Landroid/widget/ListAdapter;)V
    //   227: aload #12
    //   229: iload #5
    //   231: invokevirtual r : (I)V
    //   234: aload #12
    //   236: aload_0
    //   237: getfield o : I
    //   240: putfield n : I
    //   243: aload_0
    //   244: getfield j : Ljava/util/ArrayList;
    //   247: astore #13
    //   249: aload #13
    //   251: invokevirtual size : ()I
    //   254: ifle -> 506
    //   257: aload #13
    //   259: aload #13
    //   261: invokevirtual size : ()I
    //   264: iconst_1
    //   265: isub
    //   266: invokevirtual get : (I)Ljava/lang/Object;
    //   269: checkcast xi
    //   272: astore #10
    //   274: aload #10
    //   276: getfield b : Lrw0;
    //   279: astore #9
    //   281: aload #9
    //   283: getfield f : Ljava/util/ArrayList;
    //   286: invokevirtual size : ()I
    //   289: istore_3
    //   290: iconst_0
    //   291: istore_2
    //   292: iload_2
    //   293: iload_3
    //   294: if_icmpge -> 335
    //   297: aload #9
    //   299: iload_2
    //   300: invokevirtual getItem : (I)Landroid/view/MenuItem;
    //   303: astore #8
    //   305: aload #8
    //   307: invokeinterface hasSubMenu : ()Z
    //   312: ifeq -> 329
    //   315: aload_1
    //   316: aload #8
    //   318: invokeinterface getSubMenu : ()Landroid/view/SubMenu;
    //   323: if_acmpne -> 329
    //   326: goto -> 338
    //   329: iinc #2, 1
    //   332: goto -> 292
    //   335: aconst_null
    //   336: astore #8
    //   338: aload #8
    //   340: ifnonnull -> 353
    //   343: aconst_null
    //   344: astore #8
    //   346: aload #10
    //   348: astore #9
    //   350: goto -> 512
    //   353: aload #10
    //   355: getfield a : Lfx0;
    //   358: getfield e : Ly10;
    //   361: astore #15
    //   363: aload #15
    //   365: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   368: astore #9
    //   370: aload #9
    //   372: instanceof android/widget/HeaderViewListAdapter
    //   375: ifeq -> 404
    //   378: aload #9
    //   380: checkcast android/widget/HeaderViewListAdapter
    //   383: astore #9
    //   385: aload #9
    //   387: invokevirtual getHeadersCount : ()I
    //   390: istore_3
    //   391: aload #9
    //   393: invokevirtual getWrappedAdapter : ()Landroid/widget/ListAdapter;
    //   396: checkcast ow0
    //   399: astore #9
    //   401: goto -> 413
    //   404: aload #9
    //   406: checkcast ow0
    //   409: astore #9
    //   411: iconst_0
    //   412: istore_3
    //   413: aload #9
    //   415: invokevirtual getCount : ()I
    //   418: istore #4
    //   420: iconst_0
    //   421: istore_2
    //   422: iload_2
    //   423: iload #4
    //   425: if_icmpge -> 448
    //   428: aload #8
    //   430: aload #9
    //   432: iload_2
    //   433: invokevirtual b : (I)Luw0;
    //   436: if_acmpne -> 442
    //   439: goto -> 450
    //   442: iinc #2, 1
    //   445: goto -> 422
    //   448: iconst_m1
    //   449: istore_2
    //   450: iload_2
    //   451: iconst_m1
    //   452: if_icmpne -> 465
    //   455: aconst_null
    //   456: astore #8
    //   458: aload #10
    //   460: astore #9
    //   462: goto -> 512
    //   465: iload_2
    //   466: iload_3
    //   467: iadd
    //   468: aload #15
    //   470: invokevirtual getFirstVisiblePosition : ()I
    //   473: isub
    //   474: istore_2
    //   475: iload_2
    //   476: iflt -> 455
    //   479: iload_2
    //   480: aload #15
    //   482: invokevirtual getChildCount : ()I
    //   485: if_icmplt -> 491
    //   488: goto -> 455
    //   491: aload #15
    //   493: iload_2
    //   494: invokevirtual getChildAt : (I)Landroid/view/View;
    //   497: astore #8
    //   499: aload #10
    //   501: astore #9
    //   503: goto -> 512
    //   506: aconst_null
    //   507: astore #8
    //   509: aconst_null
    //   510: astore #9
    //   512: aload #8
    //   514: ifnull -> 913
    //   517: getstatic android/os/Build$VERSION.SDK_INT : I
    //   520: bipush #28
    //   522: if_icmpgt -> 571
    //   525: getstatic fx0.F : Ljava/lang/reflect/Method;
    //   528: astore #10
    //   530: aload #10
    //   532: ifnull -> 553
    //   535: aload #10
    //   537: aload #14
    //   539: iconst_1
    //   540: anewarray java/lang/Object
    //   543: dup
    //   544: iconst_0
    //   545: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   548: aastore
    //   549: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   552: pop
    //   553: goto -> 580
    //   556: astore #10
    //   558: ldc_w 'MenuPopupWindow'
    //   561: ldc_w 'Could not invoke setTouchModal() on PopupWindow. Oh well.'
    //   564: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   567: pop
    //   568: goto -> 553
    //   571: aload #14
    //   573: iconst_0
    //   574: invokestatic a : (Landroid/widget/PopupWindow;Z)V
    //   577: goto -> 553
    //   580: aload #14
    //   582: aconst_null
    //   583: invokestatic a : (Landroid/widget/PopupWindow;Landroid/transition/Transition;)V
    //   586: aload #13
    //   588: aload #13
    //   590: invokevirtual size : ()I
    //   593: iconst_1
    //   594: isub
    //   595: invokevirtual get : (I)Ljava/lang/Object;
    //   598: checkcast xi
    //   601: getfield a : Lfx0;
    //   604: getfield e : Ly10;
    //   607: astore #14
    //   609: iconst_2
    //   610: newarray int
    //   612: astore #15
    //   614: aload #14
    //   616: aload #15
    //   618: invokevirtual getLocationOnScreen : ([I)V
    //   621: new android/graphics/Rect
    //   624: dup
    //   625: invokespecial <init> : ()V
    //   628: astore #10
    //   630: aload_0
    //   631: getfield q : Landroid/view/View;
    //   634: aload #10
    //   636: invokevirtual getWindowVisibleDisplayFrame : (Landroid/graphics/Rect;)V
    //   639: aload_0
    //   640: getfield r : I
    //   643: iconst_1
    //   644: if_icmpne -> 680
    //   647: aload #15
    //   649: iconst_0
    //   650: iaload
    //   651: istore_2
    //   652: aload #14
    //   654: invokevirtual getWidth : ()I
    //   657: iload_2
    //   658: iadd
    //   659: iload #5
    //   661: iadd
    //   662: aload #10
    //   664: getfield right : I
    //   667: if_icmple -> 675
    //   670: iconst_0
    //   671: istore_2
    //   672: goto -> 698
    //   675: iconst_1
    //   676: istore_2
    //   677: goto -> 672
    //   680: aload #15
    //   682: iconst_0
    //   683: iaload
    //   684: iload #5
    //   686: isub
    //   687: ifge -> 693
    //   690: goto -> 675
    //   693: iconst_0
    //   694: istore_2
    //   695: goto -> 672
    //   698: iload_2
    //   699: iconst_1
    //   700: if_icmpne -> 708
    //   703: iconst_1
    //   704: istore_3
    //   705: goto -> 710
    //   708: iconst_0
    //   709: istore_3
    //   710: aload_0
    //   711: iload_2
    //   712: putfield r : I
    //   715: getstatic android/os/Build$VERSION.SDK_INT : I
    //   718: bipush #26
    //   720: if_icmplt -> 738
    //   723: aload #12
    //   725: aload #8
    //   727: putfield q : Landroid/view/View;
    //   730: iconst_0
    //   731: istore #4
    //   733: iconst_0
    //   734: istore_2
    //   735: goto -> 836
    //   738: iconst_2
    //   739: newarray int
    //   741: astore #10
    //   743: aload_0
    //   744: getfield p : Landroid/view/View;
    //   747: aload #10
    //   749: invokevirtual getLocationOnScreen : ([I)V
    //   752: iconst_2
    //   753: newarray int
    //   755: astore #14
    //   757: aload #8
    //   759: aload #14
    //   761: invokevirtual getLocationOnScreen : ([I)V
    //   764: aload_0
    //   765: getfield o : I
    //   768: bipush #7
    //   770: iand
    //   771: iconst_5
    //   772: if_icmpne -> 809
    //   775: aload #10
    //   777: iconst_0
    //   778: iaload
    //   779: istore_2
    //   780: aload #10
    //   782: iconst_0
    //   783: aload_0
    //   784: getfield p : Landroid/view/View;
    //   787: invokevirtual getWidth : ()I
    //   790: iload_2
    //   791: iadd
    //   792: iastore
    //   793: aload #14
    //   795: iconst_0
    //   796: iaload
    //   797: istore_2
    //   798: aload #14
    //   800: iconst_0
    //   801: aload #8
    //   803: invokevirtual getWidth : ()I
    //   806: iload_2
    //   807: iadd
    //   808: iastore
    //   809: aload #14
    //   811: iconst_0
    //   812: iaload
    //   813: istore #6
    //   815: aload #10
    //   817: iconst_0
    //   818: iaload
    //   819: istore_2
    //   820: aload #14
    //   822: iconst_1
    //   823: iaload
    //   824: aload #10
    //   826: iconst_1
    //   827: iaload
    //   828: isub
    //   829: istore #4
    //   831: iload #6
    //   833: iload_2
    //   834: isub
    //   835: istore_2
    //   836: aload_0
    //   837: getfield o : I
    //   840: iconst_5
    //   841: iand
    //   842: iconst_5
    //   843: if_icmpne -> 873
    //   846: iload_3
    //   847: ifeq -> 858
    //   850: iload_2
    //   851: iload #5
    //   853: iadd
    //   854: istore_2
    //   855: goto -> 885
    //   858: aload #8
    //   860: invokevirtual getWidth : ()I
    //   863: istore #5
    //   865: iload_2
    //   866: iload #5
    //   868: isub
    //   869: istore_2
    //   870: goto -> 885
    //   873: iload_3
    //   874: ifeq -> 865
    //   877: iload_2
    //   878: aload #8
    //   880: invokevirtual getWidth : ()I
    //   883: iadd
    //   884: istore_2
    //   885: aload #12
    //   887: iload_2
    //   888: putfield h : I
    //   891: aload #12
    //   893: iconst_1
    //   894: putfield m : Z
    //   897: aload #12
    //   899: iconst_1
    //   900: putfield l : Z
    //   903: aload #12
    //   905: iload #4
    //   907: invokevirtual k : (I)V
    //   910: goto -> 980
    //   913: aload_0
    //   914: getfield s : Z
    //   917: ifeq -> 929
    //   920: aload #12
    //   922: aload_0
    //   923: getfield u : I
    //   926: putfield h : I
    //   929: aload_0
    //   930: getfield t : Z
    //   933: ifeq -> 945
    //   936: aload #12
    //   938: aload_0
    //   939: getfield v : I
    //   942: invokevirtual k : (I)V
    //   945: aload_0
    //   946: getfield b : Landroid/graphics/Rect;
    //   949: astore #8
    //   951: aload #8
    //   953: ifnull -> 970
    //   956: new android/graphics/Rect
    //   959: dup
    //   960: aload #8
    //   962: invokespecial <init> : (Landroid/graphics/Rect;)V
    //   965: astore #8
    //   967: goto -> 973
    //   970: aconst_null
    //   971: astore #8
    //   973: aload #12
    //   975: aload #8
    //   977: putfield z : Landroid/graphics/Rect;
    //   980: aload #13
    //   982: new xi
    //   985: dup
    //   986: aload #12
    //   988: aload_1
    //   989: aload_0
    //   990: getfield r : I
    //   993: invokespecial <init> : (Lfx0;Lrw0;I)V
    //   996: invokevirtual add : (Ljava/lang/Object;)Z
    //   999: pop
    //   1000: aload #12
    //   1002: invokevirtual d : ()V
    //   1005: aload #12
    //   1007: getfield e : Ly10;
    //   1010: astore #8
    //   1012: aload #8
    //   1014: aload_0
    //   1015: invokevirtual setOnKeyListener : (Landroid/view/View$OnKeyListener;)V
    //   1018: aload #9
    //   1020: ifnonnull -> 1095
    //   1023: aload_0
    //   1024: getfield x : Z
    //   1027: ifeq -> 1095
    //   1030: aload_1
    //   1031: getfield m : Ljava/lang/CharSequence;
    //   1034: ifnull -> 1095
    //   1037: aload #11
    //   1039: ldc_w 2131492882
    //   1042: aload #8
    //   1044: iconst_0
    //   1045: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   1048: checkcast android/widget/FrameLayout
    //   1051: astore #10
    //   1053: aload #10
    //   1055: ldc_w 16908310
    //   1058: invokevirtual findViewById : (I)Landroid/view/View;
    //   1061: checkcast android/widget/TextView
    //   1064: astore #9
    //   1066: aload #10
    //   1068: iconst_0
    //   1069: invokevirtual setEnabled : (Z)V
    //   1072: aload #9
    //   1074: aload_1
    //   1075: getfield m : Ljava/lang/CharSequence;
    //   1078: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1081: aload #8
    //   1083: aload #10
    //   1085: aconst_null
    //   1086: iconst_0
    //   1087: invokevirtual addHeaderView : (Landroid/view/View;Ljava/lang/Object;Z)V
    //   1090: aload #12
    //   1092: invokevirtual d : ()V
    //   1095: return
    // Exception table:
    //   from	to	target	type
    //   535	553	556	java/lang/Exception
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */