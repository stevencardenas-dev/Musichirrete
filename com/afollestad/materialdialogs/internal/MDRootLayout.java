package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import dd1;
import mc1;
import re0;
import vd1;
import vo1;
import wq0;
import xq0;

public class MDRootLayout extends ViewGroup {
  public static final int u = 0;
  
  public View b;
  
  public View c;
  
  public boolean e = false;
  
  public boolean f = false;
  
  public final MDButton[] g = new MDButton[3];
  
  public vo1 h = vo1.c;
  
  public boolean i = false;
  
  public boolean j = true;
  
  public boolean k;
  
  public boolean l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public re0 p = re0.b;
  
  public int q;
  
  public Paint r;
  
  public xq0 s;
  
  public int t;
  
  public MDRootLayout(Context paramContext) {
    super(paramContext);
    c(paramContext, null, 0);
  }
  
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    c(paramContext, paramAttributeSet, 0);
  }
  
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c(paramContext, paramAttributeSet, paramInt);
  }
  
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    c(paramContext, paramAttributeSet, paramInt1);
  }
  
  public static void a(MDRootLayout paramMDRootLayout, ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #5
    //   3: iload_2
    //   4: ifeq -> 71
    //   7: aload_1
    //   8: invokevirtual getChildCount : ()I
    //   11: ifle -> 71
    //   14: aload_0
    //   15: getfield b : Landroid/view/View;
    //   18: astore #6
    //   20: aload #6
    //   22: ifnull -> 64
    //   25: aload #6
    //   27: invokevirtual getVisibility : ()I
    //   30: bipush #8
    //   32: if_icmpeq -> 64
    //   35: aload_1
    //   36: invokevirtual getScrollY : ()I
    //   39: istore #4
    //   41: aload_1
    //   42: invokevirtual getPaddingTop : ()I
    //   45: iload #4
    //   47: iadd
    //   48: aload_1
    //   49: iconst_0
    //   50: invokevirtual getChildAt : (I)Landroid/view/View;
    //   53: invokevirtual getTop : ()I
    //   56: if_icmple -> 64
    //   59: iconst_1
    //   60: istore_2
    //   61: goto -> 66
    //   64: iconst_0
    //   65: istore_2
    //   66: aload_0
    //   67: iload_2
    //   68: putfield e : Z
    //   71: aload_1
    //   72: invokevirtual getChildCount : ()I
    //   75: ifle -> 129
    //   78: iload_3
    //   79: ifeq -> 122
    //   82: aload_1
    //   83: invokevirtual getScrollY : ()I
    //   86: istore #4
    //   88: aload_1
    //   89: invokevirtual getHeight : ()I
    //   92: iload #4
    //   94: iadd
    //   95: aload_1
    //   96: invokevirtual getPaddingBottom : ()I
    //   99: isub
    //   100: aload_1
    //   101: aload_1
    //   102: invokevirtual getChildCount : ()I
    //   105: iconst_1
    //   106: isub
    //   107: invokevirtual getChildAt : (I)Landroid/view/View;
    //   110: invokevirtual getBottom : ()I
    //   113: if_icmpge -> 122
    //   116: iload #5
    //   118: istore_2
    //   119: goto -> 124
    //   122: iconst_0
    //   123: istore_2
    //   124: aload_0
    //   125: iload_2
    //   126: putfield f : Z
    //   129: return
  }
  
  public static boolean d(View paramView) {
    boolean bool;
    if (paramView != null && paramView.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return (bool && paramView instanceof MDButton) ? ((((MDButton)paramView).getText().toString().trim().length() > 0)) : bool;
  }
  
  public final void b(ViewGroup paramViewGroup, boolean paramBoolean) {
    if (this.s == null) {
      RecyclerView recyclerView;
      if (paramViewGroup instanceof RecyclerView) {
        wq0 wq0 = new wq0(this, paramViewGroup, paramBoolean);
        recyclerView = (RecyclerView)paramViewGroup;
        recyclerView.i((vd1)wq0);
        wq0.b(recyclerView, 0, 0);
        return;
      } 
      xq0 xq01 = new xq0(this, (ViewGroup)recyclerView, paramBoolean);
      this.s = xq01;
      recyclerView.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this.s);
      xq01.onScrollChanged();
    } 
  }
  
  public final void c(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    Resources resources = paramContext.getResources();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, mc1.a, paramInt, 0);
    this.k = typedArray.getBoolean(0, true);
    typedArray.recycle();
    this.m = resources.getDimensionPixelSize(2131166089);
    this.n = resources.getDimensionPixelSize(2131166063);
    this.q = resources.getDimensionPixelSize(2131166068);
    this.o = resources.getDimensionPixelSize(2131166064);
    this.r = new Paint();
    this.t = resources.getDimensionPixelSize(2131166079);
    this.r.setColor(dd1.j0(paramContext, 2130969622, 0));
    setWillNotDraw(false);
  }
  
  public final void e(View paramView, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 7
    //   4: goto -> 488
    //   7: aload_1
    //   8: instanceof android/widget/ScrollView
    //   11: istore #5
    //   13: iconst_0
    //   14: istore #6
    //   16: iload #5
    //   18: ifeq -> 85
    //   21: aload_1
    //   22: checkcast android/widget/ScrollView
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual getChildCount : ()I
    //   30: ifne -> 36
    //   33: goto -> 70
    //   36: aload_1
    //   37: iconst_0
    //   38: invokevirtual getChildAt : (I)Landroid/view/View;
    //   41: invokevirtual getMeasuredHeight : ()I
    //   44: istore_3
    //   45: aload_1
    //   46: invokevirtual getMeasuredHeight : ()I
    //   49: aload_1
    //   50: invokevirtual getPaddingTop : ()I
    //   53: isub
    //   54: aload_1
    //   55: invokevirtual getPaddingBottom : ()I
    //   58: isub
    //   59: iload_3
    //   60: if_icmpge -> 70
    //   63: aload_0
    //   64: aload_1
    //   65: iload_2
    //   66: invokevirtual b : (Landroid/view/ViewGroup;Z)V
    //   69: return
    //   70: iload_2
    //   71: ifeq -> 79
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield e : Z
    //   79: aload_0
    //   80: iconst_0
    //   81: putfield f : Z
    //   84: return
    //   85: aload_1
    //   86: instanceof android/widget/AdapterView
    //   89: ifeq -> 228
    //   92: aload_1
    //   93: checkcast android/widget/AdapterView
    //   96: astore_1
    //   97: aload_1
    //   98: invokevirtual getLastVisiblePosition : ()I
    //   101: iconst_m1
    //   102: if_icmpne -> 108
    //   105: goto -> 206
    //   108: aload_1
    //   109: invokevirtual getFirstVisiblePosition : ()I
    //   112: ifne -> 120
    //   115: iconst_1
    //   116: istore_3
    //   117: goto -> 122
    //   120: iconst_0
    //   121: istore_3
    //   122: aload_1
    //   123: invokevirtual getLastVisiblePosition : ()I
    //   126: aload_1
    //   127: invokevirtual getCount : ()I
    //   130: iconst_1
    //   131: isub
    //   132: if_icmpne -> 141
    //   135: iconst_1
    //   136: istore #4
    //   138: goto -> 144
    //   141: iconst_0
    //   142: istore #4
    //   144: iload_3
    //   145: ifeq -> 221
    //   148: iload #4
    //   150: ifeq -> 221
    //   153: aload_1
    //   154: invokevirtual getChildCount : ()I
    //   157: ifle -> 221
    //   160: aload_1
    //   161: iconst_0
    //   162: invokevirtual getChildAt : (I)Landroid/view/View;
    //   165: invokevirtual getTop : ()I
    //   168: aload_1
    //   169: invokevirtual getPaddingTop : ()I
    //   172: if_icmpge -> 178
    //   175: goto -> 221
    //   178: aload_1
    //   179: aload_1
    //   180: invokevirtual getChildCount : ()I
    //   183: iconst_1
    //   184: isub
    //   185: invokevirtual getChildAt : (I)Landroid/view/View;
    //   188: invokevirtual getBottom : ()I
    //   191: aload_1
    //   192: invokevirtual getHeight : ()I
    //   195: aload_1
    //   196: invokevirtual getPaddingBottom : ()I
    //   199: isub
    //   200: if_icmple -> 206
    //   203: goto -> 221
    //   206: iload_2
    //   207: ifeq -> 215
    //   210: aload_0
    //   211: iconst_0
    //   212: putfield e : Z
    //   215: aload_0
    //   216: iconst_0
    //   217: putfield f : Z
    //   220: return
    //   221: aload_0
    //   222: aload_1
    //   223: iload_2
    //   224: invokevirtual b : (Landroid/view/ViewGroup;Z)V
    //   227: return
    //   228: aload_1
    //   229: instanceof android/webkit/WebView
    //   232: ifeq -> 253
    //   235: aload_1
    //   236: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   239: new vq0
    //   242: dup
    //   243: aload_0
    //   244: aload_1
    //   245: iload_2
    //   246: invokespecial <init> : (Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/View;Z)V
    //   249: invokevirtual addOnPreDrawListener : (Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //   252: return
    //   253: aload_1
    //   254: instanceof androidx/recyclerview/widget/RecyclerView
    //   257: ifeq -> 327
    //   260: aload_1
    //   261: checkcast androidx/recyclerview/widget/RecyclerView
    //   264: astore #7
    //   266: iload #6
    //   268: istore #5
    //   270: aload #7
    //   272: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   275: ifnull -> 296
    //   278: iload #6
    //   280: istore #5
    //   282: aload #7
    //   284: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   287: invokevirtual p : ()Z
    //   290: ifeq -> 296
    //   293: iconst_1
    //   294: istore #5
    //   296: iload_2
    //   297: ifeq -> 306
    //   300: aload_0
    //   301: iload #5
    //   303: putfield e : Z
    //   306: aload_0
    //   307: iload #5
    //   309: putfield f : Z
    //   312: iload #5
    //   314: ifeq -> 488
    //   317: aload_0
    //   318: aload_1
    //   319: checkcast android/view/ViewGroup
    //   322: iload_2
    //   323: invokevirtual b : (Landroid/view/ViewGroup;Z)V
    //   326: return
    //   327: aload_1
    //   328: instanceof android/view/ViewGroup
    //   331: ifeq -> 488
    //   334: aload_1
    //   335: checkcast android/view/ViewGroup
    //   338: astore #9
    //   340: aload #9
    //   342: invokevirtual getChildCount : ()I
    //   345: istore_3
    //   346: aconst_null
    //   347: astore #8
    //   349: iload_3
    //   350: ifne -> 358
    //   353: aconst_null
    //   354: astore_1
    //   355: goto -> 400
    //   358: aload #9
    //   360: invokevirtual getChildCount : ()I
    //   363: iconst_1
    //   364: isub
    //   365: istore_3
    //   366: iload_3
    //   367: iflt -> 353
    //   370: aload #9
    //   372: iload_3
    //   373: invokevirtual getChildAt : (I)Landroid/view/View;
    //   376: astore_1
    //   377: aload_1
    //   378: invokevirtual getVisibility : ()I
    //   381: ifne -> 394
    //   384: aload_1
    //   385: invokevirtual getTop : ()I
    //   388: ifne -> 394
    //   391: goto -> 400
    //   394: iinc #3, -1
    //   397: goto -> 366
    //   400: aload_0
    //   401: aload_1
    //   402: iload_2
    //   403: invokevirtual e : (Landroid/view/View;Z)V
    //   406: aload #9
    //   408: invokevirtual getChildCount : ()I
    //   411: ifne -> 421
    //   414: aload #8
    //   416: astore #7
    //   418: goto -> 475
    //   421: aload #9
    //   423: invokevirtual getChildCount : ()I
    //   426: iconst_1
    //   427: isub
    //   428: istore_3
    //   429: aload #8
    //   431: astore #7
    //   433: iload_3
    //   434: iflt -> 475
    //   437: aload #9
    //   439: iload_3
    //   440: invokevirtual getChildAt : (I)Landroid/view/View;
    //   443: astore #7
    //   445: aload #7
    //   447: invokevirtual getVisibility : ()I
    //   450: ifne -> 469
    //   453: aload #7
    //   455: invokevirtual getBottom : ()I
    //   458: aload #9
    //   460: invokevirtual getMeasuredHeight : ()I
    //   463: if_icmpne -> 469
    //   466: goto -> 475
    //   469: iinc #3, -1
    //   472: goto -> 429
    //   475: aload #7
    //   477: aload_1
    //   478: if_acmpeq -> 488
    //   481: aload_0
    //   482: aload #7
    //   484: iconst_0
    //   485: invokevirtual e : (Landroid/view/View;Z)V
    //   488: return
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    View view = this.c;
    if (view != null) {
      if (this.e) {
        int i = view.getTop();
        paramCanvas.drawRect(0.0F, (i - this.t), getMeasuredWidth(), i, this.r);
      } 
      if (this.f) {
        int i = this.c.getBottom();
        paramCanvas.drawRect(0.0F, i, getMeasuredWidth(), (i + this.t), this.r);
      } 
    } 
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    for (byte b = 0; b < getChildCount(); b++) {
      View view = getChildAt(b);
      if (view.getId() == 2131297109) {
        this.b = view;
      } else {
        int i = view.getId();
        MDButton[] arrayOfMDButton = this.g;
        if (i == 2131297079) {
          arrayOfMDButton[0] = (MDButton)view;
        } else if (view.getId() == 2131297078) {
          arrayOfMDButton[1] = (MDButton)view;
        } else if (view.getId() == 2131297080) {
          arrayOfMDButton[2] = (MDButton)view;
        } else {
          this.c = view;
        } 
      } 
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: iload_3
    //   1: istore #6
    //   3: aload_0
    //   4: getfield b : Landroid/view/View;
    //   7: invokestatic d : (Landroid/view/View;)Z
    //   10: ifeq -> 46
    //   13: aload_0
    //   14: getfield b : Landroid/view/View;
    //   17: invokevirtual getMeasuredHeight : ()I
    //   20: istore_3
    //   21: aload_0
    //   22: getfield b : Landroid/view/View;
    //   25: astore #10
    //   27: iload_3
    //   28: iload #6
    //   30: iadd
    //   31: istore_3
    //   32: aload #10
    //   34: iload_2
    //   35: iload #6
    //   37: iload #4
    //   39: iload_3
    //   40: invokevirtual layout : (IIII)V
    //   43: goto -> 74
    //   46: iload #6
    //   48: istore_3
    //   49: aload_0
    //   50: getfield l : Z
    //   53: ifne -> 74
    //   56: iload #6
    //   58: istore_3
    //   59: aload_0
    //   60: getfield j : Z
    //   63: ifeq -> 74
    //   66: iload #6
    //   68: aload_0
    //   69: getfield m : I
    //   72: iadd
    //   73: istore_3
    //   74: aload_0
    //   75: getfield c : Landroid/view/View;
    //   78: invokestatic d : (Landroid/view/View;)Z
    //   81: ifeq -> 106
    //   84: aload_0
    //   85: getfield c : Landroid/view/View;
    //   88: astore #10
    //   90: aload #10
    //   92: iload_2
    //   93: iload_3
    //   94: iload #4
    //   96: aload #10
    //   98: invokevirtual getMeasuredHeight : ()I
    //   101: iload_3
    //   102: iadd
    //   103: invokevirtual layout : (IIII)V
    //   106: aload_0
    //   107: getfield i : Z
    //   110: istore_1
    //   111: aload_0
    //   112: getfield g : [Lcom/afollestad/materialdialogs/internal/MDButton;
    //   115: astore #10
    //   117: iload_1
    //   118: ifeq -> 199
    //   121: iload #5
    //   123: aload_0
    //   124: getfield n : I
    //   127: isub
    //   128: istore #5
    //   130: aload #10
    //   132: arraylength
    //   133: istore #7
    //   135: iconst_0
    //   136: istore_3
    //   137: iload_3
    //   138: iload #7
    //   140: if_icmpge -> 646
    //   143: aload #10
    //   145: iload_3
    //   146: aaload
    //   147: astore #11
    //   149: iload #5
    //   151: istore #6
    //   153: aload #11
    //   155: invokestatic d : (Landroid/view/View;)Z
    //   158: ifeq -> 189
    //   161: aload #11
    //   163: iload_2
    //   164: iload #5
    //   166: aload #11
    //   168: invokevirtual getMeasuredHeight : ()I
    //   171: isub
    //   172: iload #4
    //   174: iload #5
    //   176: invokevirtual layout : (IIII)V
    //   179: iload #5
    //   181: aload #11
    //   183: invokevirtual getMeasuredHeight : ()I
    //   186: isub
    //   187: istore #6
    //   189: iinc #3, 1
    //   192: iload #6
    //   194: istore #5
    //   196: goto -> 137
    //   199: aload_0
    //   200: getfield j : Z
    //   203: ifeq -> 218
    //   206: iload #5
    //   208: aload_0
    //   209: getfield n : I
    //   212: isub
    //   213: istore #8
    //   215: goto -> 222
    //   218: iload #5
    //   220: istore #8
    //   222: iload #8
    //   224: aload_0
    //   225: getfield o : I
    //   228: isub
    //   229: istore #9
    //   231: aload_0
    //   232: getfield q : I
    //   235: istore #7
    //   237: aload #10
    //   239: iconst_2
    //   240: aaload
    //   241: invokestatic d : (Landroid/view/View;)Z
    //   244: istore_1
    //   245: getstatic re0.e : Lre0;
    //   248: astore #12
    //   250: iload_1
    //   251: ifeq -> 334
    //   254: aload_0
    //   255: getfield p : Lre0;
    //   258: aload #12
    //   260: if_acmpne -> 285
    //   263: iload_2
    //   264: iload #7
    //   266: iadd
    //   267: istore_3
    //   268: aload #10
    //   270: iconst_2
    //   271: aaload
    //   272: invokevirtual getMeasuredWidth : ()I
    //   275: iload_3
    //   276: iadd
    //   277: istore #6
    //   279: iconst_m1
    //   280: istore #5
    //   282: goto -> 306
    //   285: iload #4
    //   287: iload #7
    //   289: isub
    //   290: istore #6
    //   292: iload #6
    //   294: aload #10
    //   296: iconst_2
    //   297: aaload
    //   298: invokevirtual getMeasuredWidth : ()I
    //   301: isub
    //   302: istore_3
    //   303: iload_3
    //   304: istore #5
    //   306: aload #10
    //   308: iconst_2
    //   309: aaload
    //   310: iload_3
    //   311: iload #9
    //   313: iload #6
    //   315: iload #8
    //   317: invokevirtual layout : (IIII)V
    //   320: iload #7
    //   322: aload #10
    //   324: iconst_2
    //   325: aaload
    //   326: invokevirtual getMeasuredWidth : ()I
    //   329: iadd
    //   330: istore_3
    //   331: goto -> 340
    //   334: iconst_m1
    //   335: istore #5
    //   337: iload #7
    //   339: istore_3
    //   340: aload #10
    //   342: iconst_1
    //   343: aaload
    //   344: invokestatic d : (Landroid/view/View;)Z
    //   347: istore_1
    //   348: getstatic re0.b : Lre0;
    //   351: astore #11
    //   353: iload_1
    //   354: ifeq -> 463
    //   357: aload_0
    //   358: getfield p : Lre0;
    //   361: astore #13
    //   363: aload #13
    //   365: aload #12
    //   367: if_acmpne -> 391
    //   370: iload_3
    //   371: iload_2
    //   372: iadd
    //   373: istore_3
    //   374: aload #10
    //   376: iconst_1
    //   377: aaload
    //   378: invokevirtual getMeasuredWidth : ()I
    //   381: iload_3
    //   382: iadd
    //   383: istore #7
    //   385: iconst_m1
    //   386: istore #6
    //   388: goto -> 443
    //   391: aload #13
    //   393: aload #11
    //   395: if_acmpne -> 418
    //   398: iload #4
    //   400: iload_3
    //   401: isub
    //   402: istore #7
    //   404: iload #7
    //   406: aload #10
    //   408: iconst_1
    //   409: aaload
    //   410: invokevirtual getMeasuredWidth : ()I
    //   413: isub
    //   414: istore_3
    //   415: goto -> 385
    //   418: aload_0
    //   419: getfield q : I
    //   422: iload_2
    //   423: iadd
    //   424: istore_3
    //   425: aload #10
    //   427: iconst_1
    //   428: aaload
    //   429: invokevirtual getMeasuredWidth : ()I
    //   432: iload_3
    //   433: iadd
    //   434: istore #7
    //   436: iload #7
    //   438: istore #6
    //   440: goto -> 388
    //   443: aload #10
    //   445: iconst_1
    //   446: aaload
    //   447: iload_3
    //   448: iload #9
    //   450: iload #7
    //   452: iload #8
    //   454: invokevirtual layout : (IIII)V
    //   457: iload #6
    //   459: istore_3
    //   460: goto -> 465
    //   463: iconst_m1
    //   464: istore_3
    //   465: aload #10
    //   467: iconst_0
    //   468: aaload
    //   469: invokestatic d : (Landroid/view/View;)Z
    //   472: ifeq -> 646
    //   475: aload_0
    //   476: getfield p : Lre0;
    //   479: astore #13
    //   481: aload #13
    //   483: aload #12
    //   485: if_acmpne -> 509
    //   488: iload #4
    //   490: aload_0
    //   491: getfield q : I
    //   494: isub
    //   495: istore_2
    //   496: iload_2
    //   497: aload #10
    //   499: iconst_0
    //   500: aaload
    //   501: invokevirtual getMeasuredWidth : ()I
    //   504: isub
    //   505: istore_3
    //   506: goto -> 633
    //   509: aload #13
    //   511: aload #11
    //   513: if_acmpne -> 536
    //   516: aload_0
    //   517: getfield q : I
    //   520: iload_2
    //   521: iadd
    //   522: istore_3
    //   523: aload #10
    //   525: iconst_0
    //   526: aaload
    //   527: invokevirtual getMeasuredWidth : ()I
    //   530: iload_3
    //   531: iadd
    //   532: istore_2
    //   533: goto -> 633
    //   536: iload_3
    //   537: iconst_m1
    //   538: if_icmpne -> 565
    //   541: iload #5
    //   543: iconst_m1
    //   544: if_icmpeq -> 565
    //   547: iload #5
    //   549: aload #10
    //   551: iconst_0
    //   552: aaload
    //   553: invokevirtual getMeasuredWidth : ()I
    //   556: isub
    //   557: istore_3
    //   558: iload #5
    //   560: istore #6
    //   562: goto -> 630
    //   565: iload #5
    //   567: iconst_m1
    //   568: if_icmpne -> 592
    //   571: iload_3
    //   572: iconst_m1
    //   573: if_icmpeq -> 592
    //   576: aload #10
    //   578: iconst_0
    //   579: aaload
    //   580: invokevirtual getMeasuredWidth : ()I
    //   583: istore_2
    //   584: iload_2
    //   585: iload_3
    //   586: iadd
    //   587: istore #6
    //   589: goto -> 630
    //   592: iload #5
    //   594: istore #6
    //   596: iload #5
    //   598: iconst_m1
    //   599: if_icmpne -> 630
    //   602: iload #4
    //   604: iload_2
    //   605: isub
    //   606: iconst_2
    //   607: idiv
    //   608: aload #10
    //   610: iconst_0
    //   611: aaload
    //   612: invokevirtual getMeasuredWidth : ()I
    //   615: iconst_2
    //   616: idiv
    //   617: isub
    //   618: istore_3
    //   619: aload #10
    //   621: iconst_0
    //   622: aaload
    //   623: invokevirtual getMeasuredWidth : ()I
    //   626: istore_2
    //   627: goto -> 584
    //   630: iload #6
    //   632: istore_2
    //   633: aload #10
    //   635: iconst_0
    //   636: aaload
    //   637: iload_3
    //   638: iload #9
    //   640: iload_2
    //   641: iload #8
    //   643: invokevirtual layout : (IIII)V
    //   646: aload_0
    //   647: aload_0
    //   648: getfield c : Landroid/view/View;
    //   651: iconst_1
    //   652: invokevirtual e : (Landroid/view/View;Z)V
    //   655: return
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i;
    byte b1;
    int j;
    int k;
    byte b2;
    boolean bool2;
    int n = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    this.j = true;
    vo1 vo11 = this.h;
    vo1 vo12 = vo1.b;
    MDButton[] arrayOfMDButton = this.g;
    boolean bool1 = false;
    if (vo11 == vo12) {
      bool2 = true;
      i = 0;
    } else if (vo11 == vo1.e) {
      bool2 = false;
      i = 0;
    } else {
      int i1 = arrayOfMDButton.length;
      b1 = 0;
      k = 0;
      for (i = k; b1 < i1; i = j) {
        MDButton mDButton = arrayOfMDButton[b1];
        b2 = k;
        j = i;
        if (mDButton != null) {
          b2 = k;
          j = i;
          if (d((View)mDButton)) {
            mDButton.a(false, false);
            measureChild((View)mDButton, paramInt1, paramInt2);
            b2 = k + mDButton.getMeasuredWidth();
            j = 1;
          } 
        } 
        b1++;
        k = b2;
      } 
      if (k > n - getContext().getResources().getDimensionPixelSize(2131166088) * 2) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
    } 
    this.i = bool2;
    if (bool2) {
      int i1 = arrayOfMDButton.length;
      k = 0;
      b1 = 0;
      while (true) {
        b2 = b1;
        j = i;
        if (k < i1) {
          MDButton mDButton = arrayOfMDButton[k];
          b2 = b1;
          j = i;
          if (mDButton != null) {
            b2 = b1;
            j = i;
            if (d((View)mDButton)) {
              mDButton.a(true, false);
              measureChild((View)mDButton, paramInt1, paramInt2);
              b2 = b1 + mDButton.getMeasuredHeight();
              j = 1;
            } 
          } 
          k++;
          b1 = b2;
          i = j;
          continue;
        } 
        break;
      } 
    } else {
      b2 = 0;
      j = i;
    } 
    if (j != 0) {
      if (this.i) {
        paramInt1 = m - b2;
        paramInt2 = this.n * 2;
        b1 = paramInt2;
      } else {
        paramInt1 = m - this.o;
        paramInt2 = this.n * 2;
        b1 = 0;
      } 
    } else {
      paramInt2 = this.n * 2;
      paramInt1 = m;
      b1 = 0;
    } 
    if (d(this.b)) {
      this.b.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), 0);
      i = paramInt1 - this.b.getMeasuredHeight();
      k = paramInt2;
    } else {
      i = paramInt1;
      k = paramInt2;
      if (!this.l) {
        k = paramInt2 + this.m;
        i = paramInt1;
      } 
    } 
    if (d(this.c)) {
      this.c.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), View.MeasureSpec.makeMeasureSpec(i - b1, -2147483648));
      if (this.c.getMeasuredHeight() <= i - k) {
        if (!this.k || d(this.b) || j != 0) {
          this.j = true;
          paramInt1 = i - this.c.getMeasuredHeight() + k;
        } else {
          this.j = false;
          paramInt1 = i - this.c.getMeasuredHeight() + b1;
        } 
      } else {
        this.j = false;
        paramInt1 = bool1;
      } 
    } else {
      paramInt1 = i;
    } 
    setMeasuredDimension(n, m - paramInt1);
  }
  
  public void setButtonGravity(re0 paramre0) {
    this.p = paramre0;
    if (getResources().getConfiguration().getLayoutDirection() == 1) {
      int i = this.p.ordinal();
      if (i != 0) {
        if (i == 2) {
          this.p = re0.b;
          return;
        } 
      } else {
        this.p = re0.e;
      } 
    } 
  }
  
  public void setButtonStackedGravity(re0 paramre0) {
    for (MDButton mDButton : this.g) {
      if (mDButton != null)
        mDButton.setStackedGravity(paramre0); 
    } 
  }
  
  public void setDividerColor(int paramInt) {
    this.r.setColor(paramInt);
    invalidate();
  }
  
  public void setStackingBehavior(vo1 paramvo1) {
    this.h = paramvo1;
    invalidate();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\afollestad\materialdialogs\internal\MDRootLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */