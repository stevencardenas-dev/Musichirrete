import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class v2 {
  public int a;
  
  public final Object b;
  
  public final Object c;
  
  public Object d;
  
  public Object e;
  
  public Object f;
  
  public v2(View paramView) {
    this.a = -1;
    this.b = paramView;
    this.c = y6.a();
  }
  
  public v2(xy paramxy) {
    this.b = new z81(30);
    this.c = new ArrayList();
    this.d = new ArrayList();
    this.a = 0;
    this.e = paramxy;
    this.f = new bh0(18, this);
  }
  
  public void a() {
    View view = (View)this.b;
    Drawable drawable = view.getBackground();
    if (drawable != null) {
      if ((up)this.d != null) {
        if ((up)this.f == null)
          this.f = new Object(); 
        up up1 = (up)this.f;
        up1.c = null;
        up1.b = false;
        up1.d = null;
        up1.a = false;
        WeakHashMap weakHashMap = v22.a;
        ColorStateList colorStateList = view.getBackgroundTintList();
        if (colorStateList != null) {
          up1.b = true;
          up1.c = colorStateList;
        } 
        PorterDuff.Mode mode = view.getBackgroundTintMode();
        if (mode != null) {
          up1.a = true;
          up1.d = mode;
        } 
        if (up1.b || up1.a) {
          y6.e(drawable, up1, view.getDrawableState());
          return;
        } 
      } 
      up up = (up)this.e;
      if (up != null) {
        y6.e(drawable, up, view.getDrawableState());
        return;
      } 
      up = (up)this.d;
      if (up != null)
        y6.e(drawable, up, view.getDrawableState()); 
    } 
  }
  
  public boolean b(int paramInt) {
    ArrayList<u2> arrayList = (ArrayList)this.d;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      u2 u2 = arrayList.get(b);
      int j = u2.a;
      if (j == 8) {
        if (g(u2.d, b + 1) == paramInt)
          continue; 
      } else if (j == 1) {
        int k = u2.b;
        int m = u2.d;
        for (j = k; j < m + k; j++) {
          if (g(j, b + 1) == paramInt)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public void c() {
    ArrayList<u2> arrayList = (ArrayList)this.d;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++)
      ((xy)this.e).a(arrayList.get(b)); 
    q(arrayList);
    this.a = 0;
  }
  
  public void d() {
    xy xy = (xy)this.e;
    c();
    ArrayList<u2> arrayList = (ArrayList)this.c;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      de1 de1;
      u2 u2 = arrayList.get(b);
      int j = u2.a;
      if (j != 1) {
        if (j != 2) {
          if (j != 4) {
            if (j == 8) {
              xy.a(u2);
              xy.e(u2.b, u2.d);
            } 
          } else {
            xy.a(u2);
            xy.c(u2.b, u2.d, u2.c);
          } 
        } else {
          xy.a(u2);
          int k = u2.b;
          j = u2.d;
          RecyclerView recyclerView = xy.b;
          recyclerView.U(k, j, true);
          recyclerView.m0 = true;
          de1 = recyclerView.j0;
          de1.c += j;
        } 
      } else {
        xy.a((u2)de1);
        xy.d(((u2)de1).b, ((u2)de1).d);
      } 
    } 
    q(arrayList);
    this.a = 0;
  }
  
  public void e(u2 paramu2) {
    z81 z81 = (z81)this.b;
    int i = paramu2.a;
    if (i != 1 && i != 8) {
      byte b1;
      int k = u(paramu2.b, i);
      i = paramu2.b;
      int j = paramu2.a;
      if (j != 2) {
        if (j == 4) {
          b1 = 1;
        } else {
          m60.k("op should be remove or update.", paramu2);
          return;
        } 
      } else {
        b1 = 0;
      } 
      byte b2 = 1;
      j = 1;
      while (b2 < paramu2.d) {
        int m = u(b1 * b2 + paramu2.b, paramu2.a);
        int n = paramu2.a;
        if ((n != 2) ? (n == 4 && m == k + 1) : (m == k)) {
          j++;
        } else {
          u2 u21 = l(paramu2.c, n, k, j);
          f(u21, i);
          u21.c = null;
          z81.a(u21);
          k = i;
          if (paramu2.a == 4)
            k = i + j; 
          j = 1;
          i = k;
          k = m;
        } 
        b2++;
      } 
      Object object = paramu2.c;
      paramu2.c = null;
      z81.a(paramu2);
      if (j > 0) {
        paramu2 = l(object, paramu2.a, k, j);
        f(paramu2, i);
        paramu2.c = null;
        z81.a(paramu2);
      } 
      return;
    } 
    l0.l("should not dispatch add or move for pre layout");
  }
  
  public void f(u2 paramu2, int paramInt) {
    xy xy = (xy)this.e;
    xy.a(paramu2);
    int i = paramu2.a;
    if (i != 2) {
      if (i == 4) {
        xy.c(paramInt, paramu2.d, paramu2.c);
        return;
      } 
      l0.l("only remove and update ops can be dispatched in first pass");
      return;
    } 
    i = paramu2.d;
    RecyclerView recyclerView = xy.b;
    recyclerView.U(paramInt, i, true);
    recyclerView.m0 = true;
    de1 de1 = recyclerView.j0;
    de1.c += i;
  }
  
  public int g(int paramInt1, int paramInt2) {
    ArrayList<u2> arrayList = (ArrayList)this.d;
    int j = arrayList.size();
    int i = paramInt2;
    for (paramInt2 = paramInt1; i < j; paramInt2 = paramInt1) {
      u2 u2 = arrayList.get(i);
      int k = u2.a;
      int m = u2.b;
      if (k == 8) {
        if (m == paramInt2) {
          paramInt1 = u2.d;
        } else {
          k = paramInt2;
          if (m < paramInt2)
            k = paramInt2 - 1; 
          paramInt1 = k;
          if (u2.d <= k)
            paramInt1 = k + 1; 
        } 
      } else {
        paramInt1 = paramInt2;
        if (m <= paramInt2)
          if (k == 2) {
            paramInt1 = u2.d;
            if (paramInt2 < m + paramInt1)
              return -1; 
            paramInt1 = paramInt2 - paramInt1;
          } else {
            paramInt1 = paramInt2;
            if (k == 1)
              paramInt1 = paramInt2 + u2.d; 
          }  
      } 
      i++;
    } 
    return paramInt2;
  }
  
  public ColorStateList h() {
    up up = (up)this.e;
    return (up != null) ? (ColorStateList)up.c : null;
  }
  
  public PorterDuff.Mode i() {
    up up = (up)this.e;
    return (up != null) ? (PorterDuff.Mode)up.d : null;
  }
  
  public boolean j() {
    return (((ArrayList)this.c).size() > 0);
  }
  
  public void k(AttributeSet paramAttributeSet, int paramInt) {
    View view1 = (View)this.b;
    Context context = view1.getContext();
    int[] arrayOfInt = nc1.A;
    zv0 zv0 = zv0.y(paramInt, 0, context, paramAttributeSet, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    View view2 = (View)this.b;
    v22.m(view2, view2.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    try {
      if (typedArray.hasValue(0)) {
        this.a = typedArray.getResourceId(0, -1);
        y6 y6 = (y6)this.c;
        Context context1 = view1.getContext();
        synchronized (this.a) {
          ColorStateList colorStateList = y6.a.g(context1, paramInt);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{y6}, name=null} */
          if (colorStateList != null)
            r(colorStateList); 
        } 
      } 
    } finally {}
    if (typedArray.hasValue(1))
      view1.setBackgroundTintList(zv0.n(1)); 
    if (typedArray.hasValue(2))
      view1.setBackgroundTintMode(l10.c(typedArray.getInt(2, -1), null)); 
    zv0.z();
  }
  
  public u2 l(Object paramObject, int paramInt1, int paramInt2, int paramInt3) {
    Object object = ((z81)this.b).b();
    if (object == null) {
      object = new Object();
      ((u2)object).a = paramInt1;
      ((u2)object).b = paramInt2;
      ((u2)object).d = paramInt3;
      ((u2)object).c = paramObject;
      return (u2)object;
    } 
    ((u2)object).a = paramInt1;
    ((u2)object).b = paramInt2;
    ((u2)object).d = paramInt3;
    ((u2)object).c = paramObject;
    return (u2)object;
  }
  
  public void m() {
    this.a = -1;
    r(null);
    a();
  }
  
  public void n(int paramInt) {
    ColorStateList colorStateList;
    this.a = paramInt;
    y6 y6 = (y6)this.c;
    if (y6 != null) {
      synchronized (((View)this.b).getContext()) {
        colorStateList = y6.a.g(null, paramInt);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{y6}, name=null} */
      } 
    } else {
      colorStateList = null;
    } 
    r(colorStateList);
    a();
  }
  
  public void o(u2 paramu2) {
    RecyclerView recyclerView;
    xy xy = (xy)this.e;
    ((ArrayList<u2>)this.d).add(paramu2);
    int i = paramu2.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i == 8) {
            xy.e(paramu2.b, paramu2.d);
            return;
          } 
          m60.k("Unknown update op type for ", paramu2);
          return;
        } 
        xy.c(paramu2.b, paramu2.d, paramu2.c);
        return;
      } 
      int j = paramu2.b;
      i = paramu2.d;
      recyclerView = xy.b;
      recyclerView.U(j, i, false);
      recyclerView.m0 = true;
      return;
    } 
    xy.d(((u2)recyclerView).b, ((u2)recyclerView).d);
  }
  
  public void p() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/Object;
    //   4: checkcast z81
    //   7: astore #14
    //   9: aload_0
    //   10: getfield e : Ljava/lang/Object;
    //   13: checkcast xy
    //   16: astore #15
    //   18: aload_0
    //   19: getfield f : Ljava/lang/Object;
    //   22: checkcast bh0
    //   25: astore #17
    //   27: aload_0
    //   28: getfield c : Ljava/lang/Object;
    //   31: checkcast java/util/ArrayList
    //   34: astore #16
    //   36: aload #17
    //   38: invokevirtual getClass : ()Ljava/lang/Class;
    //   41: pop
    //   42: aload #16
    //   44: invokevirtual size : ()I
    //   47: iconst_1
    //   48: isub
    //   49: istore_1
    //   50: iconst_0
    //   51: istore_2
    //   52: iload_1
    //   53: iflt -> 94
    //   56: aload #16
    //   58: iload_1
    //   59: invokevirtual get : (I)Ljava/lang/Object;
    //   62: checkcast u2
    //   65: getfield a : I
    //   68: bipush #8
    //   70: if_icmpne -> 84
    //   73: iload_2
    //   74: istore_3
    //   75: iload_2
    //   76: ifeq -> 86
    //   79: iload_1
    //   80: istore_2
    //   81: goto -> 96
    //   84: iconst_1
    //   85: istore_3
    //   86: iinc #1, -1
    //   89: iload_3
    //   90: istore_2
    //   91: goto -> 52
    //   94: iconst_m1
    //   95: istore_2
    //   96: iload_2
    //   97: iconst_m1
    //   98: if_icmpeq -> 1134
    //   101: iload_2
    //   102: iconst_1
    //   103: iadd
    //   104: istore #4
    //   106: aload #17
    //   108: getfield c : Ljava/lang/Object;
    //   111: checkcast v2
    //   114: astore #13
    //   116: aload #13
    //   118: getfield b : Ljava/lang/Object;
    //   121: checkcast z81
    //   124: astore #19
    //   126: aload #16
    //   128: iload_2
    //   129: invokevirtual get : (I)Ljava/lang/Object;
    //   132: checkcast u2
    //   135: astore #18
    //   137: aload #16
    //   139: iload #4
    //   141: invokevirtual get : (I)Ljava/lang/Object;
    //   144: checkcast u2
    //   147: astore #20
    //   149: aload #20
    //   151: getfield a : I
    //   154: istore_1
    //   155: iload_1
    //   156: iconst_1
    //   157: if_icmpeq -> 1011
    //   160: iload_1
    //   161: iconst_2
    //   162: if_icmpeq -> 412
    //   165: iload_1
    //   166: iconst_4
    //   167: if_icmpeq -> 173
    //   170: goto -> 42
    //   173: aload #18
    //   175: getfield d : I
    //   178: istore_3
    //   179: aload #20
    //   181: getfield b : I
    //   184: istore_1
    //   185: iload_3
    //   186: iload_1
    //   187: if_icmpge -> 201
    //   190: aload #20
    //   192: iload_1
    //   193: iconst_1
    //   194: isub
    //   195: putfield b : I
    //   198: goto -> 249
    //   201: aload #20
    //   203: getfield d : I
    //   206: istore #5
    //   208: iload_3
    //   209: iload_1
    //   210: iload #5
    //   212: iadd
    //   213: if_icmpge -> 249
    //   216: aload #20
    //   218: iload #5
    //   220: iconst_1
    //   221: isub
    //   222: putfield d : I
    //   225: aload #18
    //   227: getfield b : I
    //   230: istore_1
    //   231: aload #13
    //   233: aload #20
    //   235: getfield c : Ljava/lang/Object;
    //   238: iconst_4
    //   239: iload_1
    //   240: iconst_1
    //   241: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   244: astore #12
    //   246: goto -> 252
    //   249: aconst_null
    //   250: astore #12
    //   252: aload #18
    //   254: getfield b : I
    //   257: istore_1
    //   258: aload #20
    //   260: getfield b : I
    //   263: istore_3
    //   264: iload_1
    //   265: iload_3
    //   266: if_icmpgt -> 280
    //   269: aload #20
    //   271: iload_3
    //   272: iconst_1
    //   273: iadd
    //   274: putfield b : I
    //   277: goto -> 329
    //   280: iload_3
    //   281: aload #20
    //   283: getfield d : I
    //   286: iadd
    //   287: istore_3
    //   288: iload_1
    //   289: iload_3
    //   290: if_icmpge -> 329
    //   293: iload_3
    //   294: iload_1
    //   295: isub
    //   296: istore_3
    //   297: aload #13
    //   299: aload #20
    //   301: getfield c : Ljava/lang/Object;
    //   304: iconst_4
    //   305: iload_1
    //   306: iconst_1
    //   307: iadd
    //   308: iload_3
    //   309: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   312: astore #13
    //   314: aload #20
    //   316: aload #20
    //   318: getfield d : I
    //   321: iload_3
    //   322: isub
    //   323: putfield d : I
    //   326: goto -> 332
    //   329: aconst_null
    //   330: astore #13
    //   332: aload #16
    //   334: iload #4
    //   336: aload #18
    //   338: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   341: pop
    //   342: aload #20
    //   344: getfield d : I
    //   347: ifle -> 362
    //   350: aload #16
    //   352: iload_2
    //   353: aload #20
    //   355: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   358: pop
    //   359: goto -> 383
    //   362: aload #16
    //   364: iload_2
    //   365: invokevirtual remove : (I)Ljava/lang/Object;
    //   368: pop
    //   369: aload #20
    //   371: aconst_null
    //   372: putfield c : Ljava/lang/Object;
    //   375: aload #19
    //   377: aload #20
    //   379: invokevirtual a : (Ljava/lang/Object;)Z
    //   382: pop
    //   383: aload #12
    //   385: ifnull -> 396
    //   388: aload #16
    //   390: iload_2
    //   391: aload #12
    //   393: invokevirtual add : (ILjava/lang/Object;)V
    //   396: aload #13
    //   398: ifnull -> 42
    //   401: aload #16
    //   403: iload_2
    //   404: aload #13
    //   406: invokevirtual add : (ILjava/lang/Object;)V
    //   409: goto -> 42
    //   412: aload #18
    //   414: getfield b : I
    //   417: istore_1
    //   418: aload #18
    //   420: getfield d : I
    //   423: istore #5
    //   425: aload #20
    //   427: getfield b : I
    //   430: istore #6
    //   432: iload_1
    //   433: iload #5
    //   435: if_icmpge -> 470
    //   438: iload #6
    //   440: iload_1
    //   441: if_icmpne -> 463
    //   444: aload #20
    //   446: getfield d : I
    //   449: iload #5
    //   451: iload_1
    //   452: isub
    //   453: if_icmpne -> 463
    //   456: iconst_0
    //   457: istore_1
    //   458: iconst_1
    //   459: istore_3
    //   460: goto -> 501
    //   463: iconst_0
    //   464: istore_1
    //   465: iconst_0
    //   466: istore_3
    //   467: goto -> 501
    //   470: iload #6
    //   472: iload #5
    //   474: iconst_1
    //   475: iadd
    //   476: if_icmpne -> 496
    //   479: aload #20
    //   481: getfield d : I
    //   484: iload_1
    //   485: iload #5
    //   487: isub
    //   488: if_icmpne -> 496
    //   491: iconst_1
    //   492: istore_1
    //   493: goto -> 458
    //   496: iconst_1
    //   497: istore_1
    //   498: goto -> 465
    //   501: iload #5
    //   503: iload #6
    //   505: if_icmpge -> 520
    //   508: aload #20
    //   510: iload #6
    //   512: iconst_1
    //   513: isub
    //   514: putfield b : I
    //   517: goto -> 591
    //   520: aload #20
    //   522: getfield d : I
    //   525: istore #7
    //   527: iload #5
    //   529: iload #6
    //   531: iload #7
    //   533: iadd
    //   534: if_icmpge -> 591
    //   537: aload #20
    //   539: iload #7
    //   541: iconst_1
    //   542: isub
    //   543: putfield d : I
    //   546: aload #18
    //   548: iconst_2
    //   549: putfield a : I
    //   552: aload #18
    //   554: iconst_1
    //   555: putfield d : I
    //   558: aload #20
    //   560: getfield d : I
    //   563: ifne -> 42
    //   566: aload #16
    //   568: iload #4
    //   570: invokevirtual remove : (I)Ljava/lang/Object;
    //   573: pop
    //   574: aload #20
    //   576: aconst_null
    //   577: putfield c : Ljava/lang/Object;
    //   580: aload #19
    //   582: aload #20
    //   584: invokevirtual a : (Ljava/lang/Object;)Z
    //   587: pop
    //   588: goto -> 42
    //   591: aload #18
    //   593: getfield b : I
    //   596: istore #5
    //   598: aload #20
    //   600: getfield b : I
    //   603: istore #6
    //   605: iload #5
    //   607: iload #6
    //   609: if_icmpgt -> 624
    //   612: aload #20
    //   614: iload #6
    //   616: iconst_1
    //   617: iadd
    //   618: putfield b : I
    //   621: goto -> 678
    //   624: iload #6
    //   626: aload #20
    //   628: getfield d : I
    //   631: iadd
    //   632: istore #6
    //   634: iload #5
    //   636: iload #6
    //   638: if_icmpge -> 621
    //   641: aload #13
    //   643: aconst_null
    //   644: iconst_2
    //   645: iload #5
    //   647: iconst_1
    //   648: iadd
    //   649: iload #6
    //   651: iload #5
    //   653: isub
    //   654: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   657: astore #12
    //   659: aload #20
    //   661: aload #18
    //   663: getfield b : I
    //   666: aload #20
    //   668: getfield b : I
    //   671: isub
    //   672: putfield d : I
    //   675: goto -> 681
    //   678: aconst_null
    //   679: astore #12
    //   681: iload_3
    //   682: ifeq -> 719
    //   685: aload #16
    //   687: iload_2
    //   688: aload #20
    //   690: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   693: pop
    //   694: aload #16
    //   696: iload #4
    //   698: invokevirtual remove : (I)Ljava/lang/Object;
    //   701: pop
    //   702: aload #18
    //   704: aconst_null
    //   705: putfield c : Ljava/lang/Object;
    //   708: aload #19
    //   710: aload #18
    //   712: invokevirtual a : (Ljava/lang/Object;)Z
    //   715: pop
    //   716: goto -> 42
    //   719: iload_1
    //   720: ifeq -> 839
    //   723: aload #12
    //   725: ifnull -> 782
    //   728: aload #18
    //   730: getfield b : I
    //   733: istore_1
    //   734: iload_1
    //   735: aload #12
    //   737: getfield b : I
    //   740: if_icmple -> 755
    //   743: aload #18
    //   745: iload_1
    //   746: aload #12
    //   748: getfield d : I
    //   751: isub
    //   752: putfield b : I
    //   755: aload #18
    //   757: getfield d : I
    //   760: istore_1
    //   761: iload_1
    //   762: aload #12
    //   764: getfield b : I
    //   767: if_icmple -> 782
    //   770: aload #18
    //   772: iload_1
    //   773: aload #12
    //   775: getfield d : I
    //   778: isub
    //   779: putfield d : I
    //   782: aload #18
    //   784: getfield b : I
    //   787: istore_1
    //   788: iload_1
    //   789: aload #20
    //   791: getfield b : I
    //   794: if_icmple -> 809
    //   797: aload #18
    //   799: iload_1
    //   800: aload #20
    //   802: getfield d : I
    //   805: isub
    //   806: putfield b : I
    //   809: aload #18
    //   811: getfield d : I
    //   814: istore_1
    //   815: iload_1
    //   816: aload #20
    //   818: getfield b : I
    //   821: if_icmple -> 952
    //   824: aload #18
    //   826: iload_1
    //   827: aload #20
    //   829: getfield d : I
    //   832: isub
    //   833: putfield d : I
    //   836: goto -> 952
    //   839: aload #12
    //   841: ifnull -> 898
    //   844: aload #18
    //   846: getfield b : I
    //   849: istore_1
    //   850: iload_1
    //   851: aload #12
    //   853: getfield b : I
    //   856: if_icmplt -> 871
    //   859: aload #18
    //   861: iload_1
    //   862: aload #12
    //   864: getfield d : I
    //   867: isub
    //   868: putfield b : I
    //   871: aload #18
    //   873: getfield d : I
    //   876: istore_1
    //   877: iload_1
    //   878: aload #12
    //   880: getfield b : I
    //   883: if_icmplt -> 898
    //   886: aload #18
    //   888: iload_1
    //   889: aload #12
    //   891: getfield d : I
    //   894: isub
    //   895: putfield d : I
    //   898: aload #18
    //   900: getfield b : I
    //   903: istore_1
    //   904: iload_1
    //   905: aload #20
    //   907: getfield b : I
    //   910: if_icmplt -> 925
    //   913: aload #18
    //   915: iload_1
    //   916: aload #20
    //   918: getfield d : I
    //   921: isub
    //   922: putfield b : I
    //   925: aload #18
    //   927: getfield d : I
    //   930: istore_1
    //   931: iload_1
    //   932: aload #20
    //   934: getfield b : I
    //   937: if_icmplt -> 952
    //   940: aload #18
    //   942: iload_1
    //   943: aload #20
    //   945: getfield d : I
    //   948: isub
    //   949: putfield d : I
    //   952: aload #16
    //   954: iload_2
    //   955: aload #20
    //   957: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   960: pop
    //   961: aload #18
    //   963: getfield b : I
    //   966: aload #18
    //   968: getfield d : I
    //   971: if_icmpeq -> 987
    //   974: aload #16
    //   976: iload #4
    //   978: aload #18
    //   980: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   983: pop
    //   984: goto -> 995
    //   987: aload #16
    //   989: iload #4
    //   991: invokevirtual remove : (I)Ljava/lang/Object;
    //   994: pop
    //   995: aload #12
    //   997: ifnull -> 42
    //   1000: aload #16
    //   1002: iload_2
    //   1003: aload #12
    //   1005: invokevirtual add : (ILjava/lang/Object;)V
    //   1008: goto -> 42
    //   1011: aload #18
    //   1013: getfield d : I
    //   1016: istore #5
    //   1018: aload #20
    //   1020: getfield b : I
    //   1023: istore #6
    //   1025: iload #5
    //   1027: iload #6
    //   1029: if_icmpge -> 1037
    //   1032: iconst_m1
    //   1033: istore_1
    //   1034: goto -> 1039
    //   1037: iconst_0
    //   1038: istore_1
    //   1039: aload #18
    //   1041: getfield b : I
    //   1044: istore #7
    //   1046: iload_1
    //   1047: istore_3
    //   1048: iload #7
    //   1050: iload #6
    //   1052: if_icmpge -> 1059
    //   1055: iload_1
    //   1056: iconst_1
    //   1057: iadd
    //   1058: istore_3
    //   1059: iload #6
    //   1061: iload #7
    //   1063: if_icmpgt -> 1079
    //   1066: aload #18
    //   1068: iload #7
    //   1070: aload #20
    //   1072: getfield d : I
    //   1075: iadd
    //   1076: putfield b : I
    //   1079: aload #20
    //   1081: getfield b : I
    //   1084: istore_1
    //   1085: iload_1
    //   1086: iload #5
    //   1088: if_icmpgt -> 1104
    //   1091: aload #18
    //   1093: iload #5
    //   1095: aload #20
    //   1097: getfield d : I
    //   1100: iadd
    //   1101: putfield d : I
    //   1104: aload #20
    //   1106: iload_1
    //   1107: iload_3
    //   1108: iadd
    //   1109: putfield b : I
    //   1112: aload #16
    //   1114: iload_2
    //   1115: aload #20
    //   1117: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1120: pop
    //   1121: aload #16
    //   1123: iload #4
    //   1125: aload #18
    //   1127: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1130: pop
    //   1131: goto -> 42
    //   1134: aload #16
    //   1136: invokevirtual size : ()I
    //   1139: istore #10
    //   1141: iconst_0
    //   1142: istore #7
    //   1144: iload #7
    //   1146: iload #10
    //   1148: if_icmpge -> 1657
    //   1151: aload #16
    //   1153: iload #7
    //   1155: invokevirtual get : (I)Ljava/lang/Object;
    //   1158: checkcast u2
    //   1161: astore #12
    //   1163: aload #12
    //   1165: getfield a : I
    //   1168: istore_1
    //   1169: iload_1
    //   1170: iconst_1
    //   1171: if_icmpeq -> 1645
    //   1174: iload_1
    //   1175: iconst_2
    //   1176: if_icmpeq -> 1430
    //   1179: iload_1
    //   1180: iconst_4
    //   1181: if_icmpeq -> 1202
    //   1184: iload_1
    //   1185: bipush #8
    //   1187: if_icmpeq -> 1193
    //   1190: goto -> 1651
    //   1193: aload_0
    //   1194: aload #12
    //   1196: invokevirtual o : (Lu2;)V
    //   1199: goto -> 1190
    //   1202: aload #12
    //   1204: getfield b : I
    //   1207: istore #8
    //   1209: aload #12
    //   1211: getfield d : I
    //   1214: istore #11
    //   1216: iload #8
    //   1218: istore_2
    //   1219: iconst_0
    //   1220: istore_1
    //   1221: iconst_m1
    //   1222: istore #9
    //   1224: iload #8
    //   1226: istore_3
    //   1227: iload_3
    //   1228: iload #11
    //   1230: iload #8
    //   1232: iadd
    //   1233: if_icmpge -> 1362
    //   1236: aload #15
    //   1238: iload_3
    //   1239: invokevirtual b : (I)Lhe1;
    //   1242: ifnonnull -> 1299
    //   1245: aload_0
    //   1246: iload_3
    //   1247: invokevirtual b : (I)Z
    //   1250: ifeq -> 1256
    //   1253: goto -> 1299
    //   1256: iload_2
    //   1257: istore #5
    //   1259: iload_1
    //   1260: istore #6
    //   1262: iload #9
    //   1264: iconst_1
    //   1265: if_icmpne -> 1290
    //   1268: aload_0
    //   1269: aload_0
    //   1270: aload #12
    //   1272: getfield c : Ljava/lang/Object;
    //   1275: iconst_4
    //   1276: iload_2
    //   1277: iload_1
    //   1278: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1281: invokevirtual o : (Lu2;)V
    //   1284: iload_3
    //   1285: istore #5
    //   1287: iconst_0
    //   1288: istore #6
    //   1290: iconst_0
    //   1291: istore #4
    //   1293: iload #5
    //   1295: istore_2
    //   1296: goto -> 1347
    //   1299: iload_2
    //   1300: istore #5
    //   1302: iload_1
    //   1303: istore #4
    //   1305: iload #9
    //   1307: ifne -> 1332
    //   1310: aload_0
    //   1311: aload_0
    //   1312: aload #12
    //   1314: getfield c : Ljava/lang/Object;
    //   1317: iconst_4
    //   1318: iload_2
    //   1319: iload_1
    //   1320: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1323: invokevirtual e : (Lu2;)V
    //   1326: iload_3
    //   1327: istore #5
    //   1329: iconst_0
    //   1330: istore #4
    //   1332: iconst_1
    //   1333: istore_1
    //   1334: iload #5
    //   1336: istore_2
    //   1337: iload #4
    //   1339: istore #6
    //   1341: iload_1
    //   1342: istore #4
    //   1344: goto -> 1296
    //   1347: iload #6
    //   1349: iconst_1
    //   1350: iadd
    //   1351: istore_1
    //   1352: iinc #3, 1
    //   1355: iload #4
    //   1357: istore #9
    //   1359: goto -> 1227
    //   1362: aload #12
    //   1364: astore #13
    //   1366: iload_1
    //   1367: aload #12
    //   1369: getfield d : I
    //   1372: if_icmpeq -> 1407
    //   1375: aload #12
    //   1377: getfield c : Ljava/lang/Object;
    //   1380: astore #13
    //   1382: aload #12
    //   1384: aconst_null
    //   1385: putfield c : Ljava/lang/Object;
    //   1388: aload #14
    //   1390: aload #12
    //   1392: invokevirtual a : (Ljava/lang/Object;)Z
    //   1395: pop
    //   1396: aload_0
    //   1397: aload #13
    //   1399: iconst_4
    //   1400: iload_2
    //   1401: iload_1
    //   1402: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1405: astore #13
    //   1407: iload #9
    //   1409: ifne -> 1421
    //   1412: aload_0
    //   1413: aload #13
    //   1415: invokevirtual e : (Lu2;)V
    //   1418: goto -> 1190
    //   1421: aload_0
    //   1422: aload #13
    //   1424: invokevirtual o : (Lu2;)V
    //   1427: goto -> 1190
    //   1430: aload #12
    //   1432: getfield b : I
    //   1435: istore #6
    //   1437: aload #12
    //   1439: getfield d : I
    //   1442: iload #6
    //   1444: iadd
    //   1445: istore #4
    //   1447: iload #6
    //   1449: istore_1
    //   1450: iconst_0
    //   1451: istore #5
    //   1453: iconst_m1
    //   1454: istore_2
    //   1455: iload_1
    //   1456: iload #4
    //   1458: if_icmpge -> 1583
    //   1461: aload #15
    //   1463: iload_1
    //   1464: invokevirtual b : (I)Lhe1;
    //   1467: ifnonnull -> 1478
    //   1470: aload_0
    //   1471: iload_1
    //   1472: invokevirtual b : (I)Z
    //   1475: ifeq -> 1481
    //   1478: goto -> 1518
    //   1481: iload_2
    //   1482: iconst_1
    //   1483: if_icmpne -> 1505
    //   1486: aload_0
    //   1487: aload_0
    //   1488: aconst_null
    //   1489: iconst_2
    //   1490: iload #6
    //   1492: iload #5
    //   1494: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1497: invokevirtual o : (Lu2;)V
    //   1500: iconst_1
    //   1501: istore_2
    //   1502: goto -> 1507
    //   1505: iconst_0
    //   1506: istore_2
    //   1507: iconst_0
    //   1508: istore #8
    //   1510: iload_2
    //   1511: istore_3
    //   1512: iload #8
    //   1514: istore_2
    //   1515: goto -> 1545
    //   1518: iload_2
    //   1519: ifne -> 1541
    //   1522: aload_0
    //   1523: aload_0
    //   1524: aconst_null
    //   1525: iconst_2
    //   1526: iload #6
    //   1528: iload #5
    //   1530: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1533: invokevirtual e : (Lu2;)V
    //   1536: iconst_1
    //   1537: istore_3
    //   1538: goto -> 1543
    //   1541: iconst_0
    //   1542: istore_3
    //   1543: iconst_1
    //   1544: istore_2
    //   1545: iload_3
    //   1546: ifeq -> 1566
    //   1549: iload_1
    //   1550: iload #5
    //   1552: isub
    //   1553: istore_1
    //   1554: iload #4
    //   1556: iload #5
    //   1558: isub
    //   1559: istore #4
    //   1561: iconst_1
    //   1562: istore_3
    //   1563: goto -> 1574
    //   1566: iload #5
    //   1568: iconst_1
    //   1569: iadd
    //   1570: istore_3
    //   1571: goto -> 1563
    //   1574: iinc #1, 1
    //   1577: iload_3
    //   1578: istore #5
    //   1580: goto -> 1455
    //   1583: aload #12
    //   1585: astore #13
    //   1587: iload #5
    //   1589: aload #12
    //   1591: getfield d : I
    //   1594: if_icmpeq -> 1623
    //   1597: aload #12
    //   1599: aconst_null
    //   1600: putfield c : Ljava/lang/Object;
    //   1603: aload #14
    //   1605: aload #12
    //   1607: invokevirtual a : (Ljava/lang/Object;)Z
    //   1610: pop
    //   1611: aload_0
    //   1612: aconst_null
    //   1613: iconst_2
    //   1614: iload #6
    //   1616: iload #5
    //   1618: invokevirtual l : (Ljava/lang/Object;III)Lu2;
    //   1621: astore #13
    //   1623: iload_2
    //   1624: ifne -> 1636
    //   1627: aload_0
    //   1628: aload #13
    //   1630: invokevirtual e : (Lu2;)V
    //   1633: goto -> 1651
    //   1636: aload_0
    //   1637: aload #13
    //   1639: invokevirtual o : (Lu2;)V
    //   1642: goto -> 1651
    //   1645: aload_0
    //   1646: aload #12
    //   1648: invokevirtual o : (Lu2;)V
    //   1651: iinc #7, 1
    //   1654: goto -> 1144
    //   1657: aload #16
    //   1659: invokevirtual clear : ()V
    //   1662: return
  }
  
  public void q(ArrayList<u2> paramArrayList) {
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++) {
      u2 u2 = paramArrayList.get(b);
      u2.c = null;
      ((z81)this.b).a(u2);
    } 
    paramArrayList.clear();
  }
  
  public void r(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if ((up)this.d == null)
        this.d = new Object(); 
      up up = (up)this.d;
      up.c = paramColorStateList;
      up.b = true;
    } else {
      this.d = null;
    } 
    a();
  }
  
  public void s(ColorStateList paramColorStateList) {
    if ((up)this.e == null)
      this.e = new Object(); 
    up up = (up)this.e;
    up.c = paramColorStateList;
    up.b = true;
    a();
  }
  
  public void t(PorterDuff.Mode paramMode) {
    if ((up)this.e == null)
      this.e = new Object(); 
    up up = (up)this.e;
    up.d = paramMode;
    up.a = true;
    a();
  }
  
  public int u(int paramInt1, int paramInt2) {
    z81 z81 = (z81)this.b;
    ArrayList<u2> arrayList = (ArrayList)this.d;
    int j = arrayList.size() - 1;
    int i;
    for (i = paramInt1; j >= 0; i = paramInt1) {
      u2 u2 = arrayList.get(j);
      int m = u2.a;
      int k = u2.b;
      if (m == 8) {
        int n;
        m = u2.d;
        if (k < m) {
          n = m;
          paramInt1 = k;
        } else {
          paramInt1 = m;
          n = k;
        } 
        if (i >= paramInt1 && i <= n) {
          if (paramInt1 == k) {
            if (paramInt2 == 1) {
              u2.d = m + 1;
            } else if (paramInt2 == 2) {
              u2.d = m - 1;
            } 
            paramInt1 = i + 1;
          } else {
            if (paramInt2 == 1) {
              u2.b = k + 1;
            } else if (paramInt2 == 2) {
              u2.b = k - 1;
            } 
            paramInt1 = i - 1;
          } 
        } else {
          paramInt1 = i;
          if (i < k)
            if (paramInt2 == 1) {
              u2.b = k + 1;
              u2.d = m + 1;
              paramInt1 = i;
            } else {
              paramInt1 = i;
              if (paramInt2 == 2) {
                u2.b = k - 1;
                u2.d = m - 1;
                paramInt1 = i;
              } 
            }  
        } 
      } else if (k <= i) {
        if (m == 1) {
          paramInt1 = i - u2.d;
        } else {
          paramInt1 = i;
          if (m == 2)
            paramInt1 = i + u2.d; 
        } 
      } else if (paramInt2 == 1) {
        u2.b = k + 1;
        paramInt1 = i;
      } else {
        paramInt1 = i;
        if (paramInt2 == 2) {
          u2.b = k - 1;
          paramInt1 = i;
        } 
      } 
      j--;
    } 
    for (paramInt1 = arrayList.size() - 1; paramInt1 >= 0; paramInt1--) {
      u2 u2 = arrayList.get(paramInt1);
      j = u2.a;
      paramInt2 = u2.d;
      if (j == 8) {
        if (paramInt2 == u2.b || paramInt2 < 0) {
          arrayList.remove(paramInt1);
          u2.c = null;
          z81.a(u2);
        } 
      } else if (paramInt2 <= 0) {
        arrayList.remove(paramInt1);
        u2.c = null;
        z81.a(u2);
      } 
    } 
    return i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */