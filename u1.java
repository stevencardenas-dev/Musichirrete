import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public final class u1 implements hx0 {
  public final Context b;
  
  public Context c;
  
  public rw0 e;
  
  public final LayoutInflater f;
  
  public gx0 g;
  
  public final int h;
  
  public final int i;
  
  public jx0 j;
  
  public t1 k;
  
  public Drawable l;
  
  public boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public boolean s;
  
  public final SparseBooleanArray t;
  
  public r1 u;
  
  public r1 v;
  
  public vi2 w;
  
  public s1 x;
  
  public final gh1 y;
  
  public u1(Context paramContext) {
    this.b = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.h = 2131492867;
    this.i = 2131492866;
    this.t = new SparseBooleanArray();
    this.y = new gh1(4, this);
  }
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {
    d();
    r1 r11 = this.v;
    if (r11 != null && r11.b())
      r11.i.dismiss(); 
    gx0 gx01 = this.g;
    if (gx01 != null)
      gx01.a(paramrw0, paramBoolean); 
  }
  
  public final View b(uw0 paramuw0, View paramView, ViewGroup paramViewGroup) {
    View view = paramuw0.getActionView();
    byte b = 0;
    if (view == null || paramuw0.e()) {
      ix0 ix0;
      if (paramView instanceof ix0) {
        ix0 = (ix0)paramView;
      } else {
        ix0 = (ix0)this.f.inflate(this.i, paramViewGroup, false);
      } 
      ix0.initialize(paramuw0, 0);
      ActionMenuView actionMenuView1 = (ActionMenuView)this.j;
      ActionMenuItemView actionMenuItemView = (ActionMenuItemView)ix0;
      actionMenuItemView.setItemInvoker((qw0)actionMenuView1);
      if (this.x == null)
        this.x = new s1(this); 
      actionMenuItemView.setPopupCallback(this.x);
      view = (View)ix0;
    } 
    if (paramuw0.C)
      b = 8; 
    view.setVisibility(b);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    actionMenuView.getClass();
    if (!(layoutParams instanceof w1))
      view.setLayoutParams((ViewGroup.LayoutParams)ActionMenuView.c(layoutParams)); 
    return view;
  }
  
  public final boolean c(uw0 paramuw0) {
    return false;
  }
  
  public final boolean d() {
    vi2 vi21 = this.w;
    if (vi21 != null) {
      jx0 jx01 = this.j;
      if (jx01 != null) {
        ((View)jx01).removeCallbacks(vi21);
        this.w = null;
        return true;
      } 
    } 
    r1 r11 = this.u;
    if (r11 != null) {
      if (r11.b())
        r11.i.dismiss(); 
      return true;
    } 
    return false;
  }
  
  public final void e(gx0 paramgx0) {
    throw null;
  }
  
  public final boolean f(uw0 paramuw0) {
    return false;
  }
  
  public final void g() {
    ArrayList arrayList;
    ActionMenuView actionMenuView;
    ViewGroup viewGroup = (ViewGroup)this.j;
    rw0 rw02 = null;
    byte b = 0;
    if (viewGroup != null) {
      byte b1;
      rw0 rw04 = this.e;
      if (rw04 != null) {
        rw04.i();
        ArrayList<uw0> arrayList1 = this.e.l();
        int k = arrayList1.size();
        byte b2 = 0;
        int j = 0;
        while (true) {
          b1 = j;
          if (b2 < k) {
            uw0 uw0 = arrayList1.get(b2);
            b1 = j;
            if ((uw0.x & 0x20) == 32) {
              View view1 = viewGroup.getChildAt(j);
              if (view1 instanceof ix0) {
                uw0 uw01 = ((ix0)view1).getItemData();
              } else {
                rw04 = null;
              } 
              View view2 = b(uw0, view1, viewGroup);
              if (uw0 != rw04) {
                view2.setPressed(false);
                view2.jumpDrawablesToCurrentState();
              } 
              if (view2 != view1) {
                ViewGroup viewGroup1 = (ViewGroup)view2.getParent();
                if (viewGroup1 != null)
                  viewGroup1.removeView(view2); 
                ((ViewGroup)this.j).addView(view2, j);
              } 
              b1 = j + 1;
            } 
            b2++;
            j = b1;
            continue;
          } 
          break;
        } 
      } else {
        b1 = 0;
      } 
      while (b1 < viewGroup.getChildCount()) {
        if (viewGroup.getChildAt(b1) == this.k) {
          b1++;
          continue;
        } 
        viewGroup.removeViewAt(b1);
      } 
    } 
    ((View)this.j).requestLayout();
    rw0 rw01 = this.e;
    if (rw01 != null) {
      rw01.i();
      arrayList = rw01.i;
      int j = arrayList.size();
      for (byte b1 = 0; b1 < j; b1++)
        vw0 vw0 = ((uw0)arrayList.get(b1)).A; 
    } 
    rw0 rw03 = this.e;
    rw01 = rw02;
    if (rw03 != null) {
      rw03.i();
      arrayList = rw03.j;
    } 
    int i = b;
    if (this.n) {
      i = b;
      if (arrayList != null) {
        int j = arrayList.size();
        if (j == 1) {
          i = ((uw0)arrayList.get(0)).C ^ true;
        } else {
          i = b;
          if (j > 0)
            i = 1; 
        } 
      } 
    } 
    t1 t11 = this.k;
    if (i != 0) {
      if (t11 == null)
        this.k = new t1(this, this.b); 
      ViewGroup viewGroup1 = (ViewGroup)this.k.getParent();
      if (viewGroup1 != this.j) {
        if (viewGroup1 != null)
          viewGroup1.removeView((View)this.k); 
        actionMenuView = (ActionMenuView)this.j;
        t1 t12 = this.k;
        actionMenuView.getClass();
        w1 w1 = ActionMenuView.b();
        w1.a = true;
        actionMenuView.addView((View)t12, (ViewGroup.LayoutParams)w1);
      } 
    } else if (actionMenuView != null) {
      ViewParent viewParent = actionMenuView.getParent();
      jx0 jx01 = this.j;
      if (viewParent == jx01)
        ((ViewGroup)jx01).removeView((View)this.k); 
    } 
    ((ActionMenuView)this.j).setOverflowReserved(this.n);
  }
  
  public final boolean h() {
    r1 r11 = this.u;
    return (r11 != null && r11.b());
  }
  
  public final void i(Context paramContext, rw0 paramrw0) {
    this.c = paramContext;
    LayoutInflater.from(paramContext);
    this.e = paramrw0;
    Resources resources = paramContext.getResources();
    if (!this.o)
      this.n = true; 
    int j = (paramContext.getResources().getDisplayMetrics()).widthPixels;
    int i = 2;
    this.p = j / 2;
    Configuration configuration = paramContext.getResources().getConfiguration();
    j = configuration.screenWidthDp;
    int k = configuration.screenHeightDp;
    if (configuration.smallestScreenWidthDp > 600 || j > 600 || (j > 960 && k > 720) || (j > 720 && k > 960)) {
      i = 5;
    } else if (j >= 500 || (j > 640 && k > 480) || (j > 480 && k > 640)) {
      i = 4;
    } else if (j >= 360) {
      i = 3;
    } 
    this.r = i;
    i = this.p;
    if (this.n) {
      if (this.k == null) {
        t1 t11 = new t1(this, this.b);
        this.k = t11;
        if (this.m) {
          t11.setImageDrawable(this.l);
          this.l = null;
          this.m = false;
        } 
        j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.k.measure(j, j);
      } 
      i -= this.k.getMeasuredWidth();
    } else {
      this.k = null;
    } 
    this.q = i;
    float f = (resources.getDisplayMetrics()).density;
  }
  
  public final boolean j(tq1 paramtq1) {
    boolean bool = paramtq1.hasVisibleItems();
    boolean bool1 = false;
    if (bool) {
      tq1 tq11 = paramtq1;
      while (true) {
        View view;
        rw0 rw01 = tq11.z;
        if (rw01 != this.e) {
          tq11 = (tq1)rw01;
          continue;
        } 
        uw0 uw0 = tq11.A;
        ViewGroup viewGroup = (ViewGroup)this.j;
        rw01 = null;
        if (viewGroup == null) {
          rw0 rw02 = rw01;
        } else {
          int j = viewGroup.getChildCount();
          byte b1 = 0;
          while (true) {
            rw0 rw02 = rw01;
            if (b1 < j) {
              view = viewGroup.getChildAt(b1);
              if (view instanceof ix0 && ((ix0)view).getItemData() == uw0)
                break; 
              b1++;
              continue;
            } 
            break;
          } 
        } 
        if (view == null)
          break; 
        paramtq1.A.getClass();
        int i = paramtq1.f.size();
        byte b = 0;
        while (true) {
          bool = bool1;
          if (b < i) {
            MenuItem menuItem = paramtq1.getItem(b);
            if (menuItem.isVisible() && menuItem.getIcon() != null) {
              bool = true;
              break;
            } 
            b++;
            continue;
          } 
          break;
        } 
        r1 r11 = new r1(this, this.c, paramtq1, view);
        this.v = r11;
        r11.d(bool);
        this.v.e();
        gx0 gx01 = this.g;
        if (gx01 != null)
          gx01.k(paramtq1); 
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean k() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lrw0;
    //   4: astore #14
    //   6: aload #14
    //   8: ifnull -> 28
    //   11: aload #14
    //   13: invokevirtual l : ()Ljava/util/ArrayList;
    //   16: astore #14
    //   18: aload #14
    //   20: invokevirtual size : ()I
    //   23: istore #6
    //   25: goto -> 34
    //   28: iconst_0
    //   29: istore #6
    //   31: aconst_null
    //   32: astore #14
    //   34: aload_0
    //   35: getfield r : I
    //   38: istore #7
    //   40: aload_0
    //   41: getfield q : I
    //   44: istore #8
    //   46: iconst_0
    //   47: iconst_0
    //   48: invokestatic makeMeasureSpec : (II)I
    //   51: istore #9
    //   53: aload_0
    //   54: getfield j : Ljx0;
    //   57: checkcast android/view/ViewGroup
    //   60: astore #15
    //   62: iconst_0
    //   63: istore_2
    //   64: iconst_0
    //   65: istore #5
    //   67: iload #5
    //   69: istore_1
    //   70: iload_1
    //   71: istore_3
    //   72: iload_1
    //   73: istore #4
    //   75: iload #7
    //   77: istore_1
    //   78: iload_2
    //   79: iload #6
    //   81: if_icmpge -> 166
    //   84: aload #14
    //   86: iload_2
    //   87: invokevirtual get : (I)Ljava/lang/Object;
    //   90: checkcast uw0
    //   93: astore #16
    //   95: aload #16
    //   97: getfield y : I
    //   100: istore #7
    //   102: iload #7
    //   104: iconst_2
    //   105: iand
    //   106: iconst_2
    //   107: if_icmpne -> 116
    //   110: iinc #4, 1
    //   113: goto -> 133
    //   116: iload #7
    //   118: iconst_1
    //   119: iand
    //   120: iconst_1
    //   121: if_icmpne -> 130
    //   124: iinc #3, 1
    //   127: goto -> 133
    //   130: iconst_1
    //   131: istore #5
    //   133: iload_1
    //   134: istore #7
    //   136: aload_0
    //   137: getfield s : Z
    //   140: ifeq -> 157
    //   143: iload_1
    //   144: istore #7
    //   146: aload #16
    //   148: getfield C : Z
    //   151: ifeq -> 157
    //   154: iconst_0
    //   155: istore #7
    //   157: iinc #2, 1
    //   160: iload #7
    //   162: istore_1
    //   163: goto -> 78
    //   166: iload_1
    //   167: istore_2
    //   168: aload_0
    //   169: getfield n : Z
    //   172: ifeq -> 194
    //   175: iload #5
    //   177: ifne -> 190
    //   180: iload_1
    //   181: istore_2
    //   182: iload_3
    //   183: iload #4
    //   185: iadd
    //   186: iload_1
    //   187: if_icmple -> 194
    //   190: iload_1
    //   191: iconst_1
    //   192: isub
    //   193: istore_2
    //   194: iload_2
    //   195: iload #4
    //   197: isub
    //   198: istore_1
    //   199: aload_0
    //   200: getfield t : Landroid/util/SparseBooleanArray;
    //   203: astore #16
    //   205: aload #16
    //   207: invokevirtual clear : ()V
    //   210: iconst_0
    //   211: istore #7
    //   213: iconst_0
    //   214: istore_2
    //   215: iload #8
    //   217: istore #5
    //   219: iload #7
    //   221: iload #6
    //   223: if_icmpge -> 604
    //   226: aload #14
    //   228: iload #7
    //   230: invokevirtual get : (I)Ljava/lang/Object;
    //   233: checkcast uw0
    //   236: astore #17
    //   238: aload #17
    //   240: getfield y : I
    //   243: istore #4
    //   245: iload #4
    //   247: iconst_2
    //   248: iand
    //   249: iconst_2
    //   250: if_icmpne -> 258
    //   253: iconst_1
    //   254: istore_3
    //   255: goto -> 260
    //   258: iconst_0
    //   259: istore_3
    //   260: aload #17
    //   262: getfield b : I
    //   265: istore #10
    //   267: iload_3
    //   268: ifeq -> 338
    //   271: aload_0
    //   272: aload #17
    //   274: aconst_null
    //   275: aload #15
    //   277: invokevirtual b : (Luw0;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   280: astore #18
    //   282: aload #18
    //   284: iload #9
    //   286: iload #9
    //   288: invokevirtual measure : (II)V
    //   291: aload #18
    //   293: invokevirtual getMeasuredWidth : ()I
    //   296: istore #8
    //   298: iload #5
    //   300: iload #8
    //   302: isub
    //   303: istore #4
    //   305: iload_2
    //   306: istore_3
    //   307: iload_2
    //   308: ifne -> 314
    //   311: iload #8
    //   313: istore_3
    //   314: iload #10
    //   316: ifeq -> 327
    //   319: aload #16
    //   321: iload #10
    //   323: iconst_1
    //   324: invokevirtual put : (IZ)V
    //   327: aload #17
    //   329: iconst_1
    //   330: invokevirtual f : (Z)V
    //   333: iload_3
    //   334: istore_2
    //   335: goto -> 594
    //   338: iload #4
    //   340: iconst_1
    //   341: iand
    //   342: iconst_1
    //   343: if_icmpne -> 584
    //   346: aload #16
    //   348: iload #10
    //   350: invokevirtual get : (I)Z
    //   353: istore #13
    //   355: iload_1
    //   356: ifgt -> 364
    //   359: iload #13
    //   361: ifeq -> 375
    //   364: iload #5
    //   366: ifle -> 375
    //   369: iconst_1
    //   370: istore #11
    //   372: goto -> 378
    //   375: iconst_0
    //   376: istore #11
    //   378: iload #5
    //   380: istore #4
    //   382: iload_2
    //   383: istore_3
    //   384: iload #11
    //   386: istore #12
    //   388: iload #11
    //   390: ifeq -> 456
    //   393: aload_0
    //   394: aload #17
    //   396: aconst_null
    //   397: aload #15
    //   399: invokevirtual b : (Luw0;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   402: astore #18
    //   404: aload #18
    //   406: iload #9
    //   408: iload #9
    //   410: invokevirtual measure : (II)V
    //   413: aload #18
    //   415: invokevirtual getMeasuredWidth : ()I
    //   418: istore #8
    //   420: iload #5
    //   422: iload #8
    //   424: isub
    //   425: istore #4
    //   427: iload_2
    //   428: istore_3
    //   429: iload_2
    //   430: ifne -> 436
    //   433: iload #8
    //   435: istore_3
    //   436: iload #4
    //   438: iload_3
    //   439: iadd
    //   440: ifle -> 448
    //   443: iconst_1
    //   444: istore_2
    //   445: goto -> 450
    //   448: iconst_0
    //   449: istore_2
    //   450: iload #11
    //   452: iload_2
    //   453: iand
    //   454: istore #12
    //   456: iload #12
    //   458: ifeq -> 479
    //   461: iload #10
    //   463: ifeq -> 479
    //   466: aload #16
    //   468: iload #10
    //   470: iconst_1
    //   471: invokevirtual put : (IZ)V
    //   474: iload_1
    //   475: istore_2
    //   476: goto -> 563
    //   479: iload_1
    //   480: istore_2
    //   481: iload #13
    //   483: ifeq -> 563
    //   486: aload #16
    //   488: iload #10
    //   490: iconst_0
    //   491: invokevirtual put : (IZ)V
    //   494: iconst_0
    //   495: istore #5
    //   497: iload_1
    //   498: istore_2
    //   499: iload #5
    //   501: iload #7
    //   503: if_icmpge -> 563
    //   506: aload #14
    //   508: iload #5
    //   510: invokevirtual get : (I)Ljava/lang/Object;
    //   513: checkcast uw0
    //   516: astore #18
    //   518: iload_1
    //   519: istore_2
    //   520: aload #18
    //   522: getfield b : I
    //   525: iload #10
    //   527: if_icmpne -> 555
    //   530: iload_1
    //   531: istore_2
    //   532: aload #18
    //   534: getfield x : I
    //   537: bipush #32
    //   539: iand
    //   540: bipush #32
    //   542: if_icmpne -> 549
    //   545: iload_1
    //   546: iconst_1
    //   547: iadd
    //   548: istore_2
    //   549: aload #18
    //   551: iconst_0
    //   552: invokevirtual f : (Z)V
    //   555: iinc #5, 1
    //   558: iload_2
    //   559: istore_1
    //   560: goto -> 497
    //   563: iload_2
    //   564: istore_1
    //   565: iload #12
    //   567: ifeq -> 574
    //   570: iload_2
    //   571: iconst_1
    //   572: isub
    //   573: istore_1
    //   574: aload #17
    //   576: iload #12
    //   578: invokevirtual f : (Z)V
    //   581: goto -> 333
    //   584: aload #17
    //   586: iconst_0
    //   587: invokevirtual f : (Z)V
    //   590: iload #5
    //   592: istore #4
    //   594: iinc #7, 1
    //   597: iload #4
    //   599: istore #5
    //   601: goto -> 219
    //   604: iconst_1
    //   605: ireturn
  }
  
  public final boolean l() {
    if (this.n && !h()) {
      rw0 rw01 = this.e;
      if (rw01 != null && this.j != null && this.w == null) {
        rw01.i();
        if (!rw01.j.isEmpty()) {
          vi2 vi21 = new vi2(this, new r1(this, this.c, this.e, (View)this.k), 1, false);
          this.w = vi21;
          ((View)this.j).post(vi21);
          return true;
        } 
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */