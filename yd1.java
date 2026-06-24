import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

public final class yd1 {
  public final ArrayList a;
  
  public ArrayList b;
  
  public final ArrayList c;
  
  public final List d;
  
  public int e;
  
  public int f;
  
  public xd1 g;
  
  public final RecyclerView h;
  
  public yd1(RecyclerView paramRecyclerView) {
    this.h = paramRecyclerView;
    ArrayList<?> arrayList = new ArrayList();
    this.a = arrayList;
    this.b = null;
    this.c = new ArrayList();
    this.d = Collections.unmodifiableList(arrayList);
    this.e = 2;
    this.f = 2;
  }
  
  public final void a(he1 paramhe1, boolean paramBoolean) {
    RecyclerView.k(paramhe1);
    View view = paramhe1.b;
    RecyclerView recyclerView = this.h;
    je1 je1 = recyclerView.q0;
    if (je1 != null) {
      k0 k0 = je1.j();
      if (k0 instanceof ie1) {
        k0 = (k0)((ie1)k0).e.remove(view);
      } else {
        k0 = null;
      } 
      v22.n(view, k0);
    } 
    if (paramBoolean) {
      StringBuilder stringBuilder;
      ArrayList arrayList1 = recyclerView.q;
      if (arrayList1.size() <= 0) {
        id1 id1 = recyclerView.o;
        if (id1 != null)
          id1.k(paramhe1); 
        if (recyclerView.j0 != null)
          recyclerView.i.A(paramhe1); 
        if (RecyclerView.F0) {
          stringBuilder = new StringBuilder("dispatchViewRecycled: ");
          stringBuilder.append(paramhe1);
          Log.d("RecyclerView", stringBuilder.toString());
        } 
      } else {
        stringBuilder.get(0).getClass();
        tp.b();
        return;
      } 
    } 
    paramhe1.u = null;
    paramhe1.t = null;
    xd1 xd11 = c();
    xd11.getClass();
    int i = paramhe1.h;
    ArrayList<he1> arrayList = (xd11.a(i)).a;
    if (((wd1)xd11.a.get(i)).b <= arrayList.size()) {
      ui0.e(view);
      return;
    } 
    if (!RecyclerView.E0 || !arrayList.contains(paramhe1)) {
      paramhe1.o();
      arrayList.add(paramhe1);
      return;
    } 
    l0.l("this scrap item already exists");
  }
  
  public final int b(int paramInt) {
    RecyclerView recyclerView = this.h;
    de1 de1 = recyclerView.j0;
    if (paramInt >= 0 && paramInt < de1.b())
      return !de1.g ? paramInt : recyclerView.g.g(paramInt, 0); 
    StringBuilder stringBuilder = ga1.k(paramInt, "invalid position ", ". State item count is ");
    stringBuilder.append(de1.b());
    stringBuilder.append(recyclerView.B());
    throw new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public final xd1 c() {
    if (this.g == null) {
      Object object = new Object();
      ((xd1)object).a = new SparseArray();
      ((xd1)object).b = 0;
      ((xd1)object).c = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
      this.g = (xd1)object;
      e();
    } 
    return this.g;
  }
  
  public final View d(int paramInt) {
    return (l(paramInt, Long.MAX_VALUE)).b;
  }
  
  public final void e() {
    xd1 xd11 = this.g;
    if (xd11 != null) {
      RecyclerView recyclerView = this.h;
      id1 id1 = recyclerView.o;
      if (id1 != null && recyclerView.u)
        xd11.c.add(id1); 
    } 
  }
  
  public final void f(id1 paramid1, boolean paramBoolean) {
    xd1 xd11 = this.g;
    if (xd11 != null) {
      SparseArray sparseArray = xd11.a;
      Set set = xd11.c;
      set.remove(paramid1);
      if (set.size() == 0 && !paramBoolean)
        for (byte b = 0; b < sparseArray.size(); b++) {
          ArrayList arrayList = ((wd1)sparseArray.get(sparseArray.keyAt(b))).a;
          for (byte b1 = 0; b1 < arrayList.size(); b1++)
            ui0.e(((he1)arrayList.get(b1)).b); 
        }  
    } 
  }
  
  public final void g() {
    ArrayList arrayList = this.c;
    for (int i = arrayList.size() - 1; i >= 0; i--)
      h(i); 
    arrayList.clear();
    if (RecyclerView.J0) {
      il il = this.h.i0;
      int[] arrayOfInt = (int[])il.d;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      il.c = 0;
    } 
  }
  
  public final void h(int paramInt) {
    if (RecyclerView.F0) {
      StringBuilder stringBuilder = new StringBuilder("Recycling cached view at index ");
      stringBuilder.append(paramInt);
      Log.d("RecyclerView", stringBuilder.toString());
    } 
    ArrayList<he1> arrayList = this.c;
    he1 he1 = arrayList.get(paramInt);
    if (RecyclerView.F0) {
      StringBuilder stringBuilder = new StringBuilder("CachedViewHolder to be recycled: ");
      stringBuilder.append(he1);
      Log.d("RecyclerView", stringBuilder.toString());
    } 
    a(he1, true);
    arrayList.remove(paramInt);
  }
  
  public final void i(View paramView) {
    he1 he1 = RecyclerView.O(paramView);
    boolean bool = he1.l();
    RecyclerView recyclerView = this.h;
    if (bool)
      recyclerView.removeDetachedView(paramView, false); 
    if (he1.k()) {
      he1.p.m(he1);
    } else if (he1.r()) {
      he1.l &= 0xFFFFFFDF;
    } 
    j(he1);
    if (recyclerView.O != null && !he1.i())
      recyclerView.O.d(he1); 
  }
  
  public final void j(he1 paramhe1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroidx/recyclerview/widget/RecyclerView;
    //   4: astore #10
    //   6: aload #10
    //   8: getfield i0 : Lil;
    //   11: astore #12
    //   13: aload_1
    //   14: invokevirtual k : ()Z
    //   17: istore #9
    //   19: aload_1
    //   20: getfield b : Landroid/view/View;
    //   23: astore #11
    //   25: iconst_0
    //   26: istore #8
    //   28: iconst_0
    //   29: istore_2
    //   30: iconst_1
    //   31: istore #5
    //   33: iload #9
    //   35: ifne -> 511
    //   38: aload #11
    //   40: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   43: ifnull -> 49
    //   46: goto -> 511
    //   49: aload_1
    //   50: invokevirtual l : ()Z
    //   53: ifne -> 481
    //   56: aload_1
    //   57: invokevirtual q : ()Z
    //   60: ifne -> 464
    //   63: aload_1
    //   64: getfield l : I
    //   67: bipush #16
    //   69: iand
    //   70: ifne -> 92
    //   73: getstatic v22.a : Ljava/util/WeakHashMap;
    //   76: astore #13
    //   78: aload #11
    //   80: invokevirtual hasTransientState : ()Z
    //   83: ifeq -> 92
    //   86: iconst_1
    //   87: istore #4
    //   89: goto -> 95
    //   92: iconst_0
    //   93: istore #4
    //   95: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   98: istore #8
    //   100: aload_0
    //   101: getfield c : Ljava/util/ArrayList;
    //   104: astore #13
    //   106: iload #8
    //   108: ifeq -> 153
    //   111: aload #13
    //   113: aload_1
    //   114: invokevirtual contains : (Ljava/lang/Object;)Z
    //   117: ifne -> 123
    //   120: goto -> 153
    //   123: new java/lang/StringBuilder
    //   126: dup
    //   127: ldc_w 'cached view received recycle internal? '
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: astore #11
    //   135: aload #11
    //   137: aload_1
    //   138: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #11
    //   144: aload #10
    //   146: invokevirtual B : ()Ljava/lang/String;
    //   149: invokestatic j : (Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    //   152: return
    //   153: aload_1
    //   154: invokevirtual i : ()Z
    //   157: ifeq -> 401
    //   160: aload_0
    //   161: getfield f : I
    //   164: ifle -> 378
    //   167: aload_1
    //   168: getfield l : I
    //   171: sipush #526
    //   174: iand
    //   175: ifeq -> 181
    //   178: goto -> 378
    //   181: aload #13
    //   183: invokevirtual size : ()I
    //   186: istore_3
    //   187: iload_3
    //   188: istore_2
    //   189: iload_3
    //   190: aload_0
    //   191: getfield f : I
    //   194: if_icmplt -> 212
    //   197: iload_3
    //   198: istore_2
    //   199: iload_3
    //   200: ifle -> 212
    //   203: aload_0
    //   204: iconst_0
    //   205: invokevirtual h : (I)V
    //   208: iload_3
    //   209: iconst_1
    //   210: isub
    //   211: istore_2
    //   212: iload_2
    //   213: istore_3
    //   214: getstatic androidx/recyclerview/widget/RecyclerView.J0 : Z
    //   217: ifeq -> 366
    //   220: iload_2
    //   221: istore_3
    //   222: iload_2
    //   223: ifle -> 366
    //   226: aload_1
    //   227: getfield e : I
    //   230: istore #6
    //   232: aload #12
    //   234: getfield d : Ljava/lang/Object;
    //   237: checkcast [I
    //   240: ifnull -> 286
    //   243: aload #12
    //   245: getfield c : I
    //   248: istore #7
    //   250: iconst_0
    //   251: istore_3
    //   252: iload_3
    //   253: iload #7
    //   255: iconst_2
    //   256: imul
    //   257: if_icmpge -> 286
    //   260: aload #12
    //   262: getfield d : Ljava/lang/Object;
    //   265: checkcast [I
    //   268: iload_3
    //   269: iaload
    //   270: iload #6
    //   272: if_icmpne -> 280
    //   275: iload_2
    //   276: istore_3
    //   277: goto -> 366
    //   280: iinc #3, 2
    //   283: goto -> 252
    //   286: iinc #2, -1
    //   289: iload_2
    //   290: iflt -> 362
    //   293: aload #13
    //   295: iload_2
    //   296: invokevirtual get : (I)Ljava/lang/Object;
    //   299: checkcast he1
    //   302: getfield e : I
    //   305: istore #7
    //   307: aload #12
    //   309: getfield d : Ljava/lang/Object;
    //   312: checkcast [I
    //   315: ifnull -> 362
    //   318: aload #12
    //   320: getfield c : I
    //   323: istore #6
    //   325: iconst_0
    //   326: istore_3
    //   327: iload_3
    //   328: iload #6
    //   330: iconst_2
    //   331: imul
    //   332: if_icmpge -> 362
    //   335: aload #12
    //   337: getfield d : Ljava/lang/Object;
    //   340: checkcast [I
    //   343: iload_3
    //   344: iaload
    //   345: iload #7
    //   347: if_icmpne -> 356
    //   350: iinc #2, -1
    //   353: goto -> 289
    //   356: iinc #3, 2
    //   359: goto -> 327
    //   362: iload_2
    //   363: iconst_1
    //   364: iadd
    //   365: istore_3
    //   366: aload #13
    //   368: iload_3
    //   369: aload_1
    //   370: invokevirtual add : (ILjava/lang/Object;)V
    //   373: iconst_1
    //   374: istore_2
    //   375: goto -> 380
    //   378: iconst_0
    //   379: istore_2
    //   380: iload_2
    //   381: ifne -> 396
    //   384: aload_0
    //   385: aload_1
    //   386: iconst_1
    //   387: invokevirtual a : (Lhe1;Z)V
    //   390: iload #5
    //   392: istore_3
    //   393: goto -> 426
    //   396: iconst_0
    //   397: istore_3
    //   398: goto -> 393
    //   401: getstatic androidx/recyclerview/widget/RecyclerView.F0 : Z
    //   404: ifeq -> 424
    //   407: ldc 'RecyclerView'
    //   409: ldc_w 'trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists'
    //   412: aload #10
    //   414: invokevirtual B : ()Ljava/lang/String;
    //   417: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   420: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   423: pop
    //   424: iconst_0
    //   425: istore_3
    //   426: aload #10
    //   428: getfield i : Lj01;
    //   431: aload_1
    //   432: invokevirtual A : (Lhe1;)V
    //   435: iload_2
    //   436: ifne -> 463
    //   439: iload_3
    //   440: ifne -> 463
    //   443: iload #4
    //   445: ifeq -> 463
    //   448: aload #11
    //   450: invokestatic e : (Landroid/view/View;)V
    //   453: aload_1
    //   454: aconst_null
    //   455: putfield u : Lid1;
    //   458: aload_1
    //   459: aconst_null
    //   460: putfield t : Landroidx/recyclerview/widget/RecyclerView;
    //   463: return
    //   464: aload #10
    //   466: invokevirtual B : ()Ljava/lang/String;
    //   469: astore_1
    //   470: getstatic com/google/android/gms/dynamite/descriptors/com/google/android/gms/flags/Ou/tlzLOCPTHRhep.cZJYtSM : Ljava/lang/String;
    //   473: aload_1
    //   474: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   477: invokestatic l : (Ljava/lang/String;)V
    //   480: return
    //   481: new java/lang/StringBuilder
    //   484: dup
    //   485: ldc_w 'Tmp detached view should be removed from RecyclerView before it can be recycled: '
    //   488: invokespecial <init> : (Ljava/lang/String;)V
    //   491: astore #11
    //   493: aload #11
    //   495: aload_1
    //   496: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   499: pop
    //   500: aload #11
    //   502: aload #10
    //   504: invokevirtual B : ()Ljava/lang/String;
    //   507: invokestatic j : (Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    //   510: return
    //   511: new java/lang/StringBuilder
    //   514: dup
    //   515: getstatic androidx/profileinstaller/Vuyf/nBRIsU.gFjP : Ljava/lang/String;
    //   518: invokespecial <init> : (Ljava/lang/String;)V
    //   521: astore #12
    //   523: aload #12
    //   525: aload_1
    //   526: invokevirtual k : ()Z
    //   529: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   532: pop
    //   533: aload #12
    //   535: ldc_w ' isAttached:'
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: pop
    //   542: aload #11
    //   544: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   547: ifnull -> 553
    //   550: iconst_1
    //   551: istore #8
    //   553: aload #12
    //   555: iload #8
    //   557: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   560: pop
    //   561: aload #12
    //   563: aload #10
    //   565: invokevirtual B : ()Ljava/lang/String;
    //   568: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: pop
    //   572: new java/lang/IllegalArgumentException
    //   575: dup
    //   576: aload #12
    //   578: invokevirtual toString : ()Ljava/lang/String;
    //   581: invokespecial <init> : (Ljava/lang/String;)V
    //   584: athrow
  }
  
  public final void k(View paramView) {
    he1 he1 = RecyclerView.O(paramView);
    int i = he1.l;
    RecyclerView recyclerView = this.h;
    if ((i & 0xC) == 0 && he1.m()) {
      od1 od1 = recyclerView.O;
      if (od1 != null) {
        List list = he1.e();
        od1 = od1;
        if (list.isEmpty() && ((mw)od1).g && !he1.h()) {
          if (this.b == null)
            this.b = new ArrayList(); 
          he1.p = this;
          he1.q = true;
          this.b.add(he1);
          return;
        } 
      } 
    } 
    if (!he1.h() || he1.j() || recyclerView.o.b) {
      he1.p = this;
      he1.q = false;
      this.a.add(he1);
      return;
    } 
    l0.l("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
  }
  
  public final he1 l(int paramInt, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroidx/recyclerview/widget/RecyclerView;
    //   4: astore #17
    //   6: aload #17
    //   8: getfield j0 : Lde1;
    //   11: astore #18
    //   13: iload_1
    //   14: iflt -> 3120
    //   17: iload_1
    //   18: aload #18
    //   20: invokevirtual b : ()I
    //   23: if_icmpge -> 3120
    //   26: aload #18
    //   28: getfield g : Z
    //   31: ifeq -> 247
    //   34: aload_0
    //   35: getfield b : Ljava/util/ArrayList;
    //   38: astore #14
    //   40: aload #14
    //   42: ifnull -> 229
    //   45: aload #14
    //   47: invokevirtual size : ()I
    //   50: istore #5
    //   52: iload #5
    //   54: ifne -> 60
    //   57: goto -> 229
    //   60: iconst_0
    //   61: istore #4
    //   63: iload #4
    //   65: iload #5
    //   67: if_icmpge -> 117
    //   70: aload_0
    //   71: getfield b : Ljava/util/ArrayList;
    //   74: iload #4
    //   76: invokevirtual get : (I)Ljava/lang/Object;
    //   79: checkcast he1
    //   82: astore #14
    //   84: aload #14
    //   86: invokevirtual r : ()Z
    //   89: ifne -> 111
    //   92: aload #14
    //   94: invokevirtual d : ()I
    //   97: iload_1
    //   98: if_icmpne -> 111
    //   101: aload #14
    //   103: bipush #32
    //   105: invokevirtual a : (I)V
    //   108: goto -> 232
    //   111: iinc #4, 1
    //   114: goto -> 63
    //   117: aload #17
    //   119: getfield o : Lid1;
    //   122: getfield b : Z
    //   125: ifeq -> 229
    //   128: aload #17
    //   130: getfield g : Lv2;
    //   133: iload_1
    //   134: iconst_0
    //   135: invokevirtual g : (II)I
    //   138: istore #4
    //   140: iload #4
    //   142: ifle -> 229
    //   145: iload #4
    //   147: aload #17
    //   149: getfield o : Lid1;
    //   152: invokevirtual c : ()I
    //   155: if_icmpge -> 229
    //   158: aload #17
    //   160: getfield o : Lid1;
    //   163: iload #4
    //   165: invokevirtual e : (I)J
    //   168: lstore #8
    //   170: iconst_0
    //   171: istore #4
    //   173: iload #4
    //   175: iload #5
    //   177: if_icmpge -> 229
    //   180: aload_0
    //   181: getfield b : Ljava/util/ArrayList;
    //   184: iload #4
    //   186: invokevirtual get : (I)Ljava/lang/Object;
    //   189: checkcast he1
    //   192: astore #14
    //   194: aload #14
    //   196: invokevirtual r : ()Z
    //   199: ifne -> 223
    //   202: aload #14
    //   204: getfield g : J
    //   207: lload #8
    //   209: lcmp
    //   210: ifne -> 223
    //   213: aload #14
    //   215: bipush #32
    //   217: invokevirtual a : (I)V
    //   220: goto -> 232
    //   223: iinc #4, 1
    //   226: goto -> 173
    //   229: aconst_null
    //   230: astore #14
    //   232: aload #14
    //   234: astore #15
    //   236: aload #14
    //   238: ifnull -> 250
    //   241: iconst_1
    //   242: istore #5
    //   244: goto -> 257
    //   247: aconst_null
    //   248: astore #15
    //   250: iconst_0
    //   251: istore #5
    //   253: aload #15
    //   255: astore #14
    //   257: aload_0
    //   258: getfield a : Ljava/util/ArrayList;
    //   261: astore #16
    //   263: aload_0
    //   264: getfield c : Ljava/util/ArrayList;
    //   267: astore #19
    //   269: aload #14
    //   271: ifnonnull -> 1140
    //   274: aload #16
    //   276: invokevirtual size : ()I
    //   279: istore #6
    //   281: iconst_0
    //   282: istore #4
    //   284: iload #4
    //   286: iload #6
    //   288: if_icmpge -> 360
    //   291: aload #16
    //   293: iload #4
    //   295: invokevirtual get : (I)Ljava/lang/Object;
    //   298: checkcast he1
    //   301: astore #14
    //   303: aload #14
    //   305: invokevirtual r : ()Z
    //   308: ifne -> 354
    //   311: aload #14
    //   313: invokevirtual d : ()I
    //   316: iload_1
    //   317: if_icmpne -> 354
    //   320: aload #14
    //   322: invokevirtual h : ()Z
    //   325: ifne -> 354
    //   328: aload #18
    //   330: getfield g : Z
    //   333: ifne -> 344
    //   336: aload #14
    //   338: invokevirtual j : ()Z
    //   341: ifne -> 354
    //   344: aload #14
    //   346: bipush #32
    //   348: invokevirtual a : (I)V
    //   351: goto -> 845
    //   354: iinc #4, 1
    //   357: goto -> 284
    //   360: aload #17
    //   362: getfield h : Ltk;
    //   365: getfield e : Ljava/lang/Object;
    //   368: checkcast java/util/ArrayList
    //   371: astore #15
    //   373: aload #15
    //   375: invokevirtual size : ()I
    //   378: istore #6
    //   380: iconst_0
    //   381: istore #4
    //   383: iload #4
    //   385: iload #6
    //   387: if_icmpge -> 443
    //   390: aload #15
    //   392: iload #4
    //   394: invokevirtual get : (I)Ljava/lang/Object;
    //   397: checkcast android/view/View
    //   400: astore #14
    //   402: aload #14
    //   404: invokestatic O : (Landroid/view/View;)Lhe1;
    //   407: astore #20
    //   409: aload #20
    //   411: invokevirtual d : ()I
    //   414: iload_1
    //   415: if_icmpne -> 437
    //   418: aload #20
    //   420: invokevirtual h : ()Z
    //   423: ifne -> 437
    //   426: aload #20
    //   428: invokevirtual j : ()Z
    //   431: ifne -> 437
    //   434: goto -> 446
    //   437: iinc #4, 1
    //   440: goto -> 383
    //   443: aconst_null
    //   444: astore #14
    //   446: aload #14
    //   448: ifnull -> 718
    //   451: aload #14
    //   453: invokestatic O : (Landroid/view/View;)Lhe1;
    //   456: astore #15
    //   458: aload #17
    //   460: getfield h : Ltk;
    //   463: astore #21
    //   465: aload #21
    //   467: getfield d : Ljava/lang/Object;
    //   470: checkcast sk
    //   473: astore #20
    //   475: aload #21
    //   477: getfield c : Ljava/lang/Object;
    //   480: checkcast xy
    //   483: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   486: aload #14
    //   488: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   491: istore #4
    //   493: iload #4
    //   495: iflt -> 708
    //   498: aload #20
    //   500: iload #4
    //   502: invokevirtual d : (I)Z
    //   505: ifeq -> 675
    //   508: aload #20
    //   510: iload #4
    //   512: invokevirtual a : (I)V
    //   515: aload #21
    //   517: aload #14
    //   519: invokevirtual k : (Landroid/view/View;)V
    //   522: aload #17
    //   524: getfield h : Ltk;
    //   527: astore #20
    //   529: aload #20
    //   531: getfield d : Ljava/lang/Object;
    //   534: checkcast sk
    //   537: astore #21
    //   539: aload #20
    //   541: getfield c : Ljava/lang/Object;
    //   544: checkcast xy
    //   547: getfield b : Landroidx/recyclerview/widget/RecyclerView;
    //   550: aload #14
    //   552: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   555: istore #4
    //   557: iload #4
    //   559: iconst_m1
    //   560: if_icmpne -> 566
    //   563: goto -> 576
    //   566: aload #21
    //   568: iload #4
    //   570: invokevirtual d : (I)Z
    //   573: ifeq -> 582
    //   576: iconst_m1
    //   577: istore #4
    //   579: goto -> 594
    //   582: iload #4
    //   584: aload #21
    //   586: iload #4
    //   588: invokevirtual b : (I)I
    //   591: isub
    //   592: istore #4
    //   594: iload #4
    //   596: iconst_m1
    //   597: if_icmpeq -> 631
    //   600: aload #17
    //   602: getfield h : Ltk;
    //   605: iload #4
    //   607: invokevirtual c : (I)V
    //   610: aload_0
    //   611: aload #14
    //   613: invokevirtual k : (Landroid/view/View;)V
    //   616: aload #15
    //   618: sipush #8224
    //   621: invokevirtual a : (I)V
    //   624: aload #15
    //   626: astore #14
    //   628: goto -> 845
    //   631: new java/lang/StringBuilder
    //   634: dup
    //   635: ldc_w 'layout index should not be -1 after unhiding a view:'
    //   638: invokespecial <init> : (Ljava/lang/String;)V
    //   641: astore #14
    //   643: aload #14
    //   645: aload #15
    //   647: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   650: pop
    //   651: aload #14
    //   653: aload #17
    //   655: invokevirtual B : ()Ljava/lang/String;
    //   658: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   661: pop
    //   662: new java/lang/IllegalStateException
    //   665: dup
    //   666: aload #14
    //   668: invokevirtual toString : ()Ljava/lang/String;
    //   671: invokespecial <init> : (Ljava/lang/String;)V
    //   674: athrow
    //   675: new java/lang/StringBuilder
    //   678: dup
    //   679: ldc_w 'trying to unhide a view that was not hidden'
    //   682: invokespecial <init> : (Ljava/lang/String;)V
    //   685: astore #15
    //   687: aload #15
    //   689: aload #14
    //   691: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   694: pop
    //   695: new java/lang/RuntimeException
    //   698: dup
    //   699: aload #15
    //   701: invokevirtual toString : ()Ljava/lang/String;
    //   704: invokespecial <init> : (Ljava/lang/String;)V
    //   707: athrow
    //   708: ldc_w 'view is not a child, cannot hide '
    //   711: aload #14
    //   713: invokestatic k : (Ljava/lang/String;Ljava/lang/Object;)V
    //   716: aconst_null
    //   717: areturn
    //   718: aload #19
    //   720: invokevirtual size : ()I
    //   723: istore #6
    //   725: iconst_0
    //   726: istore #4
    //   728: iload #4
    //   730: iload #6
    //   732: if_icmpge -> 842
    //   735: aload #19
    //   737: iload #4
    //   739: invokevirtual get : (I)Ljava/lang/Object;
    //   742: checkcast he1
    //   745: astore #14
    //   747: aload #14
    //   749: invokevirtual h : ()Z
    //   752: ifne -> 836
    //   755: aload #14
    //   757: invokevirtual d : ()I
    //   760: iload_1
    //   761: if_icmpne -> 836
    //   764: aload #14
    //   766: invokevirtual f : ()Z
    //   769: ifne -> 836
    //   772: aload #19
    //   774: iload #4
    //   776: invokevirtual remove : (I)Ljava/lang/Object;
    //   779: pop
    //   780: getstatic androidx/recyclerview/widget/RecyclerView.F0 : Z
    //   783: ifeq -> 833
    //   786: new java/lang/StringBuilder
    //   789: dup
    //   790: ldc_w 'getScrapOrHiddenOrCachedHolderForPosition('
    //   793: invokespecial <init> : (Ljava/lang/String;)V
    //   796: astore #15
    //   798: aload #15
    //   800: iload_1
    //   801: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   804: pop
    //   805: aload #15
    //   807: ldc_w ') found match in cache: '
    //   810: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: pop
    //   814: aload #15
    //   816: aload #14
    //   818: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   821: pop
    //   822: ldc 'RecyclerView'
    //   824: aload #15
    //   826: invokevirtual toString : ()Ljava/lang/String;
    //   829: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   832: pop
    //   833: goto -> 845
    //   836: iinc #4, 1
    //   839: goto -> 728
    //   842: aconst_null
    //   843: astore #14
    //   845: iload #5
    //   847: istore #4
    //   849: aload #14
    //   851: astore #15
    //   853: aload #14
    //   855: ifnull -> 1148
    //   858: aload #14
    //   860: invokevirtual j : ()Z
    //   863: ifeq -> 909
    //   866: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   869: ifeq -> 899
    //   872: aload #18
    //   874: getfield g : Z
    //   877: ifeq -> 883
    //   880: goto -> 899
    //   883: ldc_w 'should not receive a removed view unless it is pre layout'
    //   886: aload #17
    //   888: invokevirtual B : ()Ljava/lang/String;
    //   891: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   894: invokestatic f : (Ljava/lang/String;)V
    //   897: aconst_null
    //   898: areturn
    //   899: aload #18
    //   901: getfield g : Z
    //   904: istore #12
    //   906: goto -> 1006
    //   909: aload #14
    //   911: getfield e : I
    //   914: istore #4
    //   916: iload #4
    //   918: iflt -> 1096
    //   921: iload #4
    //   923: aload #17
    //   925: getfield o : Lid1;
    //   928: invokevirtual c : ()I
    //   931: if_icmpge -> 1096
    //   934: aload #18
    //   936: getfield g : Z
    //   939: ifne -> 969
    //   942: aload #17
    //   944: getfield o : Lid1;
    //   947: aload #14
    //   949: getfield e : I
    //   952: invokevirtual f : (I)I
    //   955: aload #14
    //   957: getfield h : I
    //   960: if_icmpeq -> 969
    //   963: iconst_0
    //   964: istore #12
    //   966: goto -> 1006
    //   969: aload #17
    //   971: getfield o : Lid1;
    //   974: astore #15
    //   976: aload #15
    //   978: getfield b : Z
    //   981: ifeq -> 1003
    //   984: aload #14
    //   986: getfield g : J
    //   989: aload #15
    //   991: aload #14
    //   993: getfield e : I
    //   996: invokevirtual e : (I)J
    //   999: lcmp
    //   1000: ifne -> 963
    //   1003: iconst_1
    //   1004: istore #12
    //   1006: iload #12
    //   1008: ifne -> 1086
    //   1011: aload #14
    //   1013: iconst_4
    //   1014: invokevirtual a : (I)V
    //   1017: aload #14
    //   1019: invokevirtual k : ()Z
    //   1022: ifeq -> 1049
    //   1025: aload #17
    //   1027: aload #14
    //   1029: getfield b : Landroid/view/View;
    //   1032: iconst_0
    //   1033: invokevirtual removeDetachedView : (Landroid/view/View;Z)V
    //   1036: aload #14
    //   1038: getfield p : Lyd1;
    //   1041: aload #14
    //   1043: invokevirtual m : (Lhe1;)V
    //   1046: goto -> 1070
    //   1049: aload #14
    //   1051: invokevirtual r : ()Z
    //   1054: ifeq -> 1070
    //   1057: aload #14
    //   1059: aload #14
    //   1061: getfield l : I
    //   1064: bipush #-33
    //   1066: iand
    //   1067: putfield l : I
    //   1070: aload_0
    //   1071: aload #14
    //   1073: invokevirtual j : (Lhe1;)V
    //   1076: aconst_null
    //   1077: astore #15
    //   1079: iload #5
    //   1081: istore #4
    //   1083: goto -> 1148
    //   1086: iconst_1
    //   1087: istore #4
    //   1089: aload #14
    //   1091: astore #15
    //   1093: goto -> 1148
    //   1096: new java/lang/StringBuilder
    //   1099: dup
    //   1100: getstatic com/android/billingclient/api/wH/DJqHMztxflt.GazuRuBI : Ljava/lang/String;
    //   1103: invokespecial <init> : (Ljava/lang/String;)V
    //   1106: astore #15
    //   1108: aload #15
    //   1110: aload #14
    //   1112: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1115: pop
    //   1116: aload #15
    //   1118: aload #17
    //   1120: invokevirtual B : ()Ljava/lang/String;
    //   1123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1126: pop
    //   1127: new java/lang/IndexOutOfBoundsException
    //   1130: dup
    //   1131: aload #15
    //   1133: invokevirtual toString : ()Ljava/lang/String;
    //   1136: invokespecial <init> : (Ljava/lang/String;)V
    //   1139: athrow
    //   1140: aload #14
    //   1142: astore #15
    //   1144: iload #5
    //   1146: istore #4
    //   1148: aload #15
    //   1150: ifnonnull -> 2073
    //   1153: aload #17
    //   1155: getfield g : Lv2;
    //   1158: iload_1
    //   1159: iconst_0
    //   1160: invokevirtual g : (II)I
    //   1163: istore #7
    //   1165: iload #7
    //   1167: iflt -> 1985
    //   1170: iload #7
    //   1172: aload #17
    //   1174: getfield o : Lid1;
    //   1177: invokevirtual c : ()I
    //   1180: if_icmpge -> 1985
    //   1183: aload #17
    //   1185: getfield o : Lid1;
    //   1188: iload #7
    //   1190: invokevirtual f : (I)I
    //   1193: istore #6
    //   1195: aload #17
    //   1197: getfield o : Lid1;
    //   1200: astore #14
    //   1202: iload #4
    //   1204: istore #5
    //   1206: aload #14
    //   1208: getfield b : Z
    //   1211: ifeq -> 1520
    //   1214: aload #14
    //   1216: iload #7
    //   1218: invokevirtual e : (I)J
    //   1221: lstore #10
    //   1223: aload #16
    //   1225: invokevirtual size : ()I
    //   1228: iconst_1
    //   1229: isub
    //   1230: istore #5
    //   1232: aload #16
    //   1234: astore #14
    //   1236: iload #5
    //   1238: iflt -> 1409
    //   1241: aload #14
    //   1243: iload #5
    //   1245: invokevirtual get : (I)Ljava/lang/Object;
    //   1248: checkcast he1
    //   1251: astore #15
    //   1253: aload #15
    //   1255: getfield g : J
    //   1258: lstore #8
    //   1260: aload #15
    //   1262: getfield b : Landroid/view/View;
    //   1265: astore #16
    //   1267: lload #8
    //   1269: lload #10
    //   1271: lcmp
    //   1272: ifne -> 1403
    //   1275: aload #15
    //   1277: invokevirtual r : ()Z
    //   1280: ifne -> 1403
    //   1283: iload #6
    //   1285: aload #15
    //   1287: getfield h : I
    //   1290: if_icmpne -> 1346
    //   1293: aload #15
    //   1295: bipush #32
    //   1297: invokevirtual a : (I)V
    //   1300: aload #15
    //   1302: astore #14
    //   1304: aload #15
    //   1306: invokevirtual j : ()Z
    //   1309: ifeq -> 1343
    //   1312: aload #15
    //   1314: astore #14
    //   1316: aload #18
    //   1318: getfield g : Z
    //   1321: ifne -> 1343
    //   1324: aload #15
    //   1326: aload #15
    //   1328: getfield l : I
    //   1331: bipush #-15
    //   1333: iand
    //   1334: iconst_2
    //   1335: ior
    //   1336: putfield l : I
    //   1339: aload #15
    //   1341: astore #14
    //   1343: goto -> 1493
    //   1346: aload #14
    //   1348: iload #5
    //   1350: invokevirtual remove : (I)Ljava/lang/Object;
    //   1353: pop
    //   1354: aload #17
    //   1356: aload #16
    //   1358: iconst_0
    //   1359: invokevirtual removeDetachedView : (Landroid/view/View;Z)V
    //   1362: aload #16
    //   1364: invokestatic O : (Landroid/view/View;)Lhe1;
    //   1367: astore #15
    //   1369: aload #15
    //   1371: aconst_null
    //   1372: putfield p : Lyd1;
    //   1375: aload #15
    //   1377: iconst_0
    //   1378: putfield q : Z
    //   1381: aload #15
    //   1383: aload #15
    //   1385: getfield l : I
    //   1388: bipush #-33
    //   1390: iand
    //   1391: putfield l : I
    //   1394: aload_0
    //   1395: aload #15
    //   1397: invokevirtual j : (Lhe1;)V
    //   1400: goto -> 1403
    //   1403: iinc #5, -1
    //   1406: goto -> 1236
    //   1409: aload #19
    //   1411: invokevirtual size : ()I
    //   1414: iconst_1
    //   1415: isub
    //   1416: istore #5
    //   1418: iload #5
    //   1420: iflt -> 1481
    //   1423: aload #19
    //   1425: iload #5
    //   1427: invokevirtual get : (I)Ljava/lang/Object;
    //   1430: checkcast he1
    //   1433: astore #14
    //   1435: aload #14
    //   1437: getfield g : J
    //   1440: lload #10
    //   1442: lcmp
    //   1443: ifne -> 1487
    //   1446: aload #14
    //   1448: invokevirtual f : ()Z
    //   1451: ifne -> 1487
    //   1454: iload #6
    //   1456: aload #14
    //   1458: getfield h : I
    //   1461: if_icmpne -> 1475
    //   1464: aload #19
    //   1466: iload #5
    //   1468: invokevirtual remove : (I)Ljava/lang/Object;
    //   1471: pop
    //   1472: goto -> 1343
    //   1475: aload_0
    //   1476: iload #5
    //   1478: invokevirtual h : (I)V
    //   1481: aconst_null
    //   1482: astore #14
    //   1484: goto -> 1493
    //   1487: iinc #5, -1
    //   1490: goto -> 1418
    //   1493: iload #4
    //   1495: istore #5
    //   1497: aload #14
    //   1499: astore #15
    //   1501: aload #14
    //   1503: ifnull -> 1520
    //   1506: aload #14
    //   1508: iload #7
    //   1510: putfield e : I
    //   1513: iconst_1
    //   1514: istore #5
    //   1516: aload #14
    //   1518: astore #15
    //   1520: aload #15
    //   1522: astore #14
    //   1524: aload #15
    //   1526: ifnonnull -> 1680
    //   1529: getstatic androidx/recyclerview/widget/RecyclerView.F0 : Z
    //   1532: ifeq -> 1574
    //   1535: new java/lang/StringBuilder
    //   1538: dup
    //   1539: ldc_w 'tryGetViewHolderForPositionByDeadline('
    //   1542: invokespecial <init> : (Ljava/lang/String;)V
    //   1545: astore #14
    //   1547: aload #14
    //   1549: iload_1
    //   1550: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1553: pop
    //   1554: aload #14
    //   1556: ldc_w ') fetching from shared pool'
    //   1559: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1562: pop
    //   1563: ldc 'RecyclerView'
    //   1565: aload #14
    //   1567: invokevirtual toString : ()Ljava/lang/String;
    //   1570: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1573: pop
    //   1574: aload_0
    //   1575: invokevirtual c : ()Lxd1;
    //   1578: getfield a : Landroid/util/SparseArray;
    //   1581: iload #6
    //   1583: invokevirtual get : (I)Ljava/lang/Object;
    //   1586: checkcast wd1
    //   1589: astore #14
    //   1591: aload #14
    //   1593: ifnull -> 1662
    //   1596: aload #14
    //   1598: getfield a : Ljava/util/ArrayList;
    //   1601: astore #14
    //   1603: aload #14
    //   1605: invokevirtual isEmpty : ()Z
    //   1608: ifne -> 1662
    //   1611: aload #14
    //   1613: invokevirtual size : ()I
    //   1616: iconst_1
    //   1617: isub
    //   1618: istore #4
    //   1620: iload #4
    //   1622: iflt -> 1662
    //   1625: aload #14
    //   1627: iload #4
    //   1629: invokevirtual get : (I)Ljava/lang/Object;
    //   1632: checkcast he1
    //   1635: invokevirtual f : ()Z
    //   1638: ifne -> 1656
    //   1641: aload #14
    //   1643: iload #4
    //   1645: invokevirtual remove : (I)Ljava/lang/Object;
    //   1648: checkcast he1
    //   1651: astore #14
    //   1653: goto -> 1665
    //   1656: iinc #4, -1
    //   1659: goto -> 1620
    //   1662: aconst_null
    //   1663: astore #14
    //   1665: aload #14
    //   1667: ifnull -> 1680
    //   1670: aload #14
    //   1672: invokevirtual o : ()V
    //   1675: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   1678: istore #12
    //   1680: iload #5
    //   1682: istore #4
    //   1684: aload #14
    //   1686: astore #15
    //   1688: aload #14
    //   1690: ifnonnull -> 2073
    //   1693: aload #17
    //   1695: invokevirtual getNanoTime : ()J
    //   1698: lstore #8
    //   1700: lload_2
    //   1701: ldc2_w 9223372036854775807
    //   1704: lcmp
    //   1705: ifeq -> 1744
    //   1708: aload_0
    //   1709: getfield g : Lxd1;
    //   1712: iload #6
    //   1714: invokevirtual a : (I)Lwd1;
    //   1717: getfield c : J
    //   1720: lstore #10
    //   1722: lload #10
    //   1724: lconst_0
    //   1725: lcmp
    //   1726: ifeq -> 1744
    //   1729: lload #10
    //   1731: lload #8
    //   1733: ladd
    //   1734: lload_2
    //   1735: lcmp
    //   1736: ifge -> 1742
    //   1739: goto -> 1744
    //   1742: aconst_null
    //   1743: areturn
    //   1744: aload #17
    //   1746: getfield o : Lid1;
    //   1749: astore #14
    //   1751: aload #14
    //   1753: invokevirtual getClass : ()Ljava/lang/Class;
    //   1756: pop
    //   1757: invokestatic a : ()Z
    //   1760: ifeq -> 1784
    //   1763: ldc_w 'RV onCreateViewHolder type=0x%X'
    //   1766: iconst_1
    //   1767: anewarray java/lang/Object
    //   1770: dup
    //   1771: iconst_0
    //   1772: iload #6
    //   1774: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1777: aastore
    //   1778: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1781: invokestatic beginSection : (Ljava/lang/String;)V
    //   1784: aload #14
    //   1786: aload #17
    //   1788: iload #6
    //   1790: invokevirtual j : (Landroid/view/ViewGroup;I)Lhe1;
    //   1793: astore #14
    //   1795: aload #14
    //   1797: getfield b : Landroid/view/View;
    //   1800: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   1803: ifnonnull -> 1961
    //   1806: aload #14
    //   1808: iload #6
    //   1810: putfield h : I
    //   1813: invokestatic endSection : ()V
    //   1816: getstatic androidx/recyclerview/widget/RecyclerView.J0 : Z
    //   1819: ifeq -> 1851
    //   1822: aload #14
    //   1824: getfield b : Landroid/view/View;
    //   1827: invokestatic H : (Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    //   1830: astore #15
    //   1832: aload #15
    //   1834: ifnull -> 1851
    //   1837: aload #14
    //   1839: new java/lang/ref/WeakReference
    //   1842: dup
    //   1843: aload #15
    //   1845: invokespecial <init> : (Ljava/lang/Object;)V
    //   1848: putfield c : Ljava/lang/ref/WeakReference;
    //   1851: aload #17
    //   1853: invokevirtual getNanoTime : ()J
    //   1856: lstore #10
    //   1858: aload_0
    //   1859: getfield g : Lxd1;
    //   1862: astore #15
    //   1864: lload #10
    //   1866: lload #8
    //   1868: lsub
    //   1869: lstore #8
    //   1871: aload #15
    //   1873: iload #6
    //   1875: invokevirtual a : (I)Lwd1;
    //   1878: astore #15
    //   1880: aload #15
    //   1882: getfield c : J
    //   1885: lstore #10
    //   1887: lload #10
    //   1889: lconst_0
    //   1890: lcmp
    //   1891: ifne -> 1897
    //   1894: goto -> 1920
    //   1897: lload #10
    //   1899: ldc2_w 4
    //   1902: ldiv
    //   1903: lstore #10
    //   1905: lload #8
    //   1907: ldc2_w 4
    //   1910: ldiv
    //   1911: lload #10
    //   1913: ldc2_w 3
    //   1916: lmul
    //   1917: ladd
    //   1918: lstore #8
    //   1920: aload #15
    //   1922: lload #8
    //   1924: putfield c : J
    //   1927: iload #5
    //   1929: istore #4
    //   1931: aload #14
    //   1933: astore #15
    //   1935: getstatic androidx/recyclerview/widget/RecyclerView.F0 : Z
    //   1938: ifeq -> 2073
    //   1941: ldc 'RecyclerView'
    //   1943: ldc_w 'tryGetViewHolderForPositionByDeadline created new ViewHolder'
    //   1946: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1949: pop
    //   1950: iload #5
    //   1952: istore #4
    //   1954: aload #14
    //   1956: astore #15
    //   1958: goto -> 2073
    //   1961: new java/lang/IllegalStateException
    //   1964: astore #14
    //   1966: aload #14
    //   1968: ldc_w 'ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)'
    //   1971: invokespecial <init> : (Ljava/lang/String;)V
    //   1974: aload #14
    //   1976: athrow
    //   1977: astore #14
    //   1979: invokestatic endSection : ()V
    //   1982: aload #14
    //   1984: athrow
    //   1985: aload #18
    //   1987: invokevirtual b : ()I
    //   1990: istore #4
    //   1992: aload #17
    //   1994: invokevirtual B : ()Ljava/lang/String;
    //   1997: astore #14
    //   1999: new java/lang/StringBuilder
    //   2002: dup
    //   2003: ldc_w 'Inconsistency detected. Invalid item position '
    //   2006: invokespecial <init> : (Ljava/lang/String;)V
    //   2009: astore #15
    //   2011: aload #15
    //   2013: iload_1
    //   2014: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2017: pop
    //   2018: aload #15
    //   2020: ldc_w '(offset:'
    //   2023: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2026: pop
    //   2027: aload #15
    //   2029: iload #7
    //   2031: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2034: pop
    //   2035: aload #15
    //   2037: ldc_w ').state:'
    //   2040: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2043: pop
    //   2044: aload #15
    //   2046: iload #4
    //   2048: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2051: pop
    //   2052: aload #15
    //   2054: aload #14
    //   2056: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2059: pop
    //   2060: new java/lang/IndexOutOfBoundsException
    //   2063: dup
    //   2064: aload #15
    //   2066: invokevirtual toString : ()Ljava/lang/String;
    //   2069: invokespecial <init> : (Ljava/lang/String;)V
    //   2072: athrow
    //   2073: aload #15
    //   2075: getfield b : Landroid/view/View;
    //   2078: astore #16
    //   2080: iload #4
    //   2082: ifeq -> 2177
    //   2085: aload #18
    //   2087: getfield g : Z
    //   2090: ifne -> 2177
    //   2093: aload #15
    //   2095: getfield l : I
    //   2098: istore #5
    //   2100: iload #5
    //   2102: sipush #8192
    //   2105: iand
    //   2106: ifeq -> 2177
    //   2109: aload #15
    //   2111: iload #5
    //   2113: sipush #-8193
    //   2116: iand
    //   2117: putfield l : I
    //   2120: aload #18
    //   2122: getfield j : Z
    //   2125: ifeq -> 2177
    //   2128: aload #15
    //   2130: invokestatic b : (Lhe1;)V
    //   2133: aload #17
    //   2135: getfield O : Lod1;
    //   2138: astore #14
    //   2140: aload #15
    //   2142: invokevirtual e : ()Ljava/util/List;
    //   2145: pop
    //   2146: aload #14
    //   2148: invokevirtual getClass : ()Ljava/lang/Class;
    //   2151: pop
    //   2152: new java/lang/Object
    //   2155: dup
    //   2156: invokespecial <init> : ()V
    //   2159: astore #14
    //   2161: aload #14
    //   2163: aload #15
    //   2165: invokevirtual a : (Lhe1;)V
    //   2168: aload #17
    //   2170: aload #15
    //   2172: aload #14
    //   2174: invokevirtual c0 : (Lhe1;Lp11;)V
    //   2177: aload #18
    //   2179: getfield g : Z
    //   2182: ifeq -> 2202
    //   2185: aload #15
    //   2187: invokevirtual g : ()Z
    //   2190: ifeq -> 2202
    //   2193: aload #15
    //   2195: iload_1
    //   2196: putfield i : I
    //   2199: goto -> 2234
    //   2202: aload #15
    //   2204: invokevirtual g : ()Z
    //   2207: ifeq -> 2239
    //   2210: aload #15
    //   2212: getfield l : I
    //   2215: iconst_2
    //   2216: iand
    //   2217: ifeq -> 2223
    //   2220: goto -> 2239
    //   2223: aload #15
    //   2225: invokevirtual h : ()Z
    //   2228: ifeq -> 2234
    //   2231: goto -> 2239
    //   2234: iconst_0
    //   2235: istore_1
    //   2236: goto -> 3014
    //   2239: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   2242: ifeq -> 2300
    //   2245: aload #15
    //   2247: invokevirtual j : ()Z
    //   2250: ifne -> 2256
    //   2253: goto -> 2300
    //   2256: new java/lang/StringBuilder
    //   2259: dup
    //   2260: ldc_w 'Removed holder should be bound and it should come here only in pre-layout. Holder: '
    //   2263: invokespecial <init> : (Ljava/lang/String;)V
    //   2266: astore #14
    //   2268: aload #14
    //   2270: aload #15
    //   2272: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2275: pop
    //   2276: aload #14
    //   2278: aload #17
    //   2280: invokevirtual B : ()Ljava/lang/String;
    //   2283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2286: pop
    //   2287: new java/lang/IllegalStateException
    //   2290: dup
    //   2291: aload #14
    //   2293: invokevirtual toString : ()Ljava/lang/String;
    //   2296: invokespecial <init> : (Ljava/lang/String;)V
    //   2299: athrow
    //   2300: aload #17
    //   2302: getfield g : Lv2;
    //   2305: iload_1
    //   2306: iconst_0
    //   2307: invokevirtual g : (II)I
    //   2310: istore #7
    //   2312: aload #15
    //   2314: aconst_null
    //   2315: putfield u : Lid1;
    //   2318: aload #15
    //   2320: aload #17
    //   2322: putfield t : Landroidx/recyclerview/widget/RecyclerView;
    //   2325: aload #15
    //   2327: getfield h : I
    //   2330: istore #5
    //   2332: aload #17
    //   2334: invokevirtual getNanoTime : ()J
    //   2337: lstore #8
    //   2339: lload_2
    //   2340: ldc2_w 9223372036854775807
    //   2343: lcmp
    //   2344: ifeq -> 2386
    //   2347: aload_0
    //   2348: getfield g : Lxd1;
    //   2351: iload #5
    //   2353: invokevirtual a : (I)Lwd1;
    //   2356: getfield d : J
    //   2359: lstore #10
    //   2361: lload #10
    //   2363: lconst_0
    //   2364: lcmp
    //   2365: ifeq -> 2386
    //   2368: lload #10
    //   2370: lload #8
    //   2372: ladd
    //   2373: lload_2
    //   2374: lcmp
    //   2375: ifge -> 2381
    //   2378: goto -> 2386
    //   2381: iconst_0
    //   2382: istore_1
    //   2383: goto -> 3014
    //   2386: aload #15
    //   2388: invokevirtual l : ()Z
    //   2391: ifeq -> 2417
    //   2394: aload #17
    //   2396: aload #16
    //   2398: aload #17
    //   2400: invokevirtual getChildCount : ()I
    //   2403: aload #16
    //   2405: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   2408: invokestatic d : (Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //   2411: iconst_1
    //   2412: istore #5
    //   2414: goto -> 2420
    //   2417: iconst_0
    //   2418: istore #5
    //   2420: aload #17
    //   2422: getfield o : Lid1;
    //   2425: astore #14
    //   2427: aload #14
    //   2429: invokevirtual getClass : ()Ljava/lang/Class;
    //   2432: pop
    //   2433: aload #15
    //   2435: getfield u : Lid1;
    //   2438: ifnonnull -> 2447
    //   2441: iconst_1
    //   2442: istore #6
    //   2444: goto -> 2450
    //   2447: iconst_0
    //   2448: istore #6
    //   2450: iload #6
    //   2452: ifeq -> 2528
    //   2455: aload #15
    //   2457: iload #7
    //   2459: putfield e : I
    //   2462: aload #14
    //   2464: getfield b : Z
    //   2467: ifeq -> 2482
    //   2470: aload #15
    //   2472: aload #14
    //   2474: iload #7
    //   2476: invokevirtual e : (I)J
    //   2479: putfield g : J
    //   2482: aload #15
    //   2484: aload #15
    //   2486: getfield l : I
    //   2489: sipush #-520
    //   2492: iand
    //   2493: iconst_1
    //   2494: ior
    //   2495: putfield l : I
    //   2498: invokestatic a : ()Z
    //   2501: ifeq -> 2528
    //   2504: ldc_w 'RV onBindViewHolder type=0x%X'
    //   2507: iconst_1
    //   2508: anewarray java/lang/Object
    //   2511: dup
    //   2512: iconst_0
    //   2513: aload #15
    //   2515: getfield h : I
    //   2518: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2521: aastore
    //   2522: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2525: invokestatic beginSection : (Ljava/lang/String;)V
    //   2528: aload #15
    //   2530: aload #14
    //   2532: putfield u : Lid1;
    //   2535: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   2538: ifeq -> 2662
    //   2541: aload #16
    //   2543: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   2546: ifnonnull -> 2646
    //   2549: aload #16
    //   2551: invokevirtual isAttachedToWindow : ()Z
    //   2554: aload #15
    //   2556: invokevirtual l : ()Z
    //   2559: if_icmpne -> 2565
    //   2562: goto -> 2646
    //   2565: aload #15
    //   2567: invokevirtual l : ()Z
    //   2570: istore #13
    //   2572: aload #16
    //   2574: invokevirtual isAttachedToWindow : ()Z
    //   2577: istore #12
    //   2579: new java/lang/StringBuilder
    //   2582: dup
    //   2583: ldc_w 'Temp-detached state out of sync with reality. holder.isTmpDetached(): '
    //   2586: invokespecial <init> : (Ljava/lang/String;)V
    //   2589: astore #14
    //   2591: aload #14
    //   2593: iload #13
    //   2595: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   2598: pop
    //   2599: aload #14
    //   2601: ldc_w ', attached to window: '
    //   2604: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2607: pop
    //   2608: aload #14
    //   2610: iload #12
    //   2612: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   2615: pop
    //   2616: aload #14
    //   2618: ldc_w ', holder: '
    //   2621: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2624: pop
    //   2625: aload #14
    //   2627: aload #15
    //   2629: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2632: pop
    //   2633: new java/lang/IllegalStateException
    //   2636: dup
    //   2637: aload #14
    //   2639: invokevirtual toString : ()Ljava/lang/String;
    //   2642: invokespecial <init> : (Ljava/lang/String;)V
    //   2645: athrow
    //   2646: aload #16
    //   2648: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   2651: ifnonnull -> 2662
    //   2654: aload #16
    //   2656: invokevirtual isAttachedToWindow : ()Z
    //   2659: ifne -> 2665
    //   2662: goto -> 2675
    //   2665: ldc_w 'Attempting to bind attached holder with no parent (AKA temp detached): '
    //   2668: aload #15
    //   2670: invokestatic o : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2673: aconst_null
    //   2674: areturn
    //   2675: aload #15
    //   2677: invokevirtual e : ()Ljava/util/List;
    //   2680: pop
    //   2681: aload #14
    //   2683: aload #15
    //   2685: iload #7
    //   2687: invokevirtual i : (Lhe1;I)V
    //   2690: iload #6
    //   2692: ifeq -> 2753
    //   2695: aload #15
    //   2697: getfield m : Ljava/util/ArrayList;
    //   2700: astore #14
    //   2702: aload #14
    //   2704: ifnull -> 2712
    //   2707: aload #14
    //   2709: invokevirtual clear : ()V
    //   2712: aload #15
    //   2714: aload #15
    //   2716: getfield l : I
    //   2719: sipush #-1025
    //   2722: iand
    //   2723: putfield l : I
    //   2726: aload #16
    //   2728: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   2731: astore #14
    //   2733: aload #14
    //   2735: instanceof sd1
    //   2738: ifeq -> 2750
    //   2741: aload #14
    //   2743: checkcast sd1
    //   2746: iconst_1
    //   2747: putfield e : Z
    //   2750: invokestatic endSection : ()V
    //   2753: iload #5
    //   2755: ifeq -> 2765
    //   2758: aload #16
    //   2760: aload #17
    //   2762: invokestatic e : (Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V
    //   2765: aload #17
    //   2767: invokevirtual getNanoTime : ()J
    //   2770: lstore_2
    //   2771: aload_0
    //   2772: getfield g : Lxd1;
    //   2775: astore #14
    //   2777: aload #15
    //   2779: getfield h : I
    //   2782: istore #5
    //   2784: lload_2
    //   2785: lload #8
    //   2787: lsub
    //   2788: lstore_2
    //   2789: aload #14
    //   2791: iload #5
    //   2793: invokevirtual a : (I)Lwd1;
    //   2796: astore #14
    //   2798: aload #14
    //   2800: getfield d : J
    //   2803: lstore #8
    //   2805: lload #8
    //   2807: lconst_0
    //   2808: lcmp
    //   2809: ifne -> 2815
    //   2812: goto -> 2836
    //   2815: lload #8
    //   2817: ldc2_w 4
    //   2820: ldiv
    //   2821: lstore #8
    //   2823: lload_2
    //   2824: ldc2_w 4
    //   2827: ldiv
    //   2828: lload #8
    //   2830: ldc2_w 3
    //   2833: lmul
    //   2834: ladd
    //   2835: lstore_2
    //   2836: aload #14
    //   2838: lload_2
    //   2839: putfield d : J
    //   2842: aload #17
    //   2844: getfield D : Landroid/view/accessibility/AccessibilityManager;
    //   2847: astore #14
    //   2849: aload #14
    //   2851: ifnull -> 2998
    //   2854: aload #14
    //   2856: invokevirtual isEnabled : ()Z
    //   2859: ifeq -> 2998
    //   2862: aload #16
    //   2864: invokevirtual getImportantForAccessibility : ()I
    //   2867: ifne -> 2876
    //   2870: aload #16
    //   2872: iconst_1
    //   2873: invokevirtual setImportantForAccessibility : (I)V
    //   2876: aload #17
    //   2878: getfield q0 : Lje1;
    //   2881: astore #14
    //   2883: aload #14
    //   2885: ifnonnull -> 2891
    //   2888: goto -> 2998
    //   2891: aload #14
    //   2893: invokevirtual j : ()Lk0;
    //   2896: astore #19
    //   2898: aload #19
    //   2900: instanceof ie1
    //   2903: ifeq -> 2988
    //   2906: aload #19
    //   2908: checkcast ie1
    //   2911: astore #20
    //   2913: aload #16
    //   2915: invokestatic d : (Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    //   2918: astore #14
    //   2920: aload #14
    //   2922: ifnonnull -> 2931
    //   2925: aconst_null
    //   2926: astore #14
    //   2928: goto -> 2963
    //   2931: aload #14
    //   2933: instanceof j0
    //   2936: ifeq -> 2952
    //   2939: aload #14
    //   2941: checkcast j0
    //   2944: getfield a : Lk0;
    //   2947: astore #14
    //   2949: goto -> 2963
    //   2952: new k0
    //   2955: dup
    //   2956: aload #14
    //   2958: invokespecial <init> : (Landroid/view/View$AccessibilityDelegate;)V
    //   2961: astore #14
    //   2963: aload #14
    //   2965: ifnull -> 2988
    //   2968: aload #14
    //   2970: aload #20
    //   2972: if_acmpeq -> 2988
    //   2975: aload #20
    //   2977: getfield e : Ljava/util/WeakHashMap;
    //   2980: aload #16
    //   2982: aload #14
    //   2984: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2987: pop
    //   2988: aload #16
    //   2990: aload #19
    //   2992: invokestatic n : (Landroid/view/View;Lk0;)V
    //   2995: goto -> 2998
    //   2998: aload #18
    //   3000: getfield g : Z
    //   3003: ifeq -> 3012
    //   3006: aload #15
    //   3008: iload_1
    //   3009: putfield i : I
    //   3012: iconst_1
    //   3013: istore_1
    //   3014: aload #16
    //   3016: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   3019: astore #14
    //   3021: aload #14
    //   3023: ifnonnull -> 3046
    //   3026: aload #17
    //   3028: invokevirtual generateDefaultLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   3031: checkcast sd1
    //   3034: astore #14
    //   3036: aload #16
    //   3038: aload #14
    //   3040: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   3043: goto -> 3085
    //   3046: aload #17
    //   3048: aload #14
    //   3050: invokevirtual checkLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Z
    //   3053: ifne -> 3078
    //   3056: aload #17
    //   3058: aload #14
    //   3060: invokevirtual generateLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    //   3063: checkcast sd1
    //   3066: astore #14
    //   3068: aload #16
    //   3070: aload #14
    //   3072: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   3075: goto -> 3085
    //   3078: aload #14
    //   3080: checkcast sd1
    //   3083: astore #14
    //   3085: aload #14
    //   3087: aload #15
    //   3089: putfield b : Lhe1;
    //   3092: iload #4
    //   3094: ifeq -> 3107
    //   3097: iload_1
    //   3098: ifeq -> 3107
    //   3101: iconst_1
    //   3102: istore #12
    //   3104: goto -> 3110
    //   3107: iconst_0
    //   3108: istore #12
    //   3110: aload #14
    //   3112: iload #12
    //   3114: putfield f : Z
    //   3117: aload #15
    //   3119: areturn
    //   3120: aload #18
    //   3122: invokevirtual b : ()I
    //   3125: istore #4
    //   3127: aload #17
    //   3129: invokevirtual B : ()Ljava/lang/String;
    //   3132: astore #14
    //   3134: new java/lang/StringBuilder
    //   3137: dup
    //   3138: ldc_w 'Invalid item position '
    //   3141: invokespecial <init> : (Ljava/lang/String;)V
    //   3144: astore #15
    //   3146: aload #15
    //   3148: iload_1
    //   3149: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3152: pop
    //   3153: aload #15
    //   3155: ldc_w '('
    //   3158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3161: pop
    //   3162: aload #15
    //   3164: iload_1
    //   3165: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3168: pop
    //   3169: aload #15
    //   3171: ldc_w '). Item count:'
    //   3174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3177: pop
    //   3178: aload #15
    //   3180: iload #4
    //   3182: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3185: pop
    //   3186: aload #15
    //   3188: aload #14
    //   3190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3193: pop
    //   3194: new java/lang/IndexOutOfBoundsException
    //   3197: dup
    //   3198: aload #15
    //   3200: invokevirtual toString : ()Ljava/lang/String;
    //   3203: invokespecial <init> : (Ljava/lang/String;)V
    //   3206: athrow
    // Exception table:
    //   from	to	target	type
    //   1757	1784	1977	finally
    //   1784	1813	1977	finally
    //   1961	1977	1977	finally
  }
  
  public final void m(he1 paramhe1) {
    if (paramhe1.q) {
      this.b.remove(paramhe1);
    } else {
      this.a.remove(paramhe1);
    } 
    paramhe1.p = null;
    paramhe1.q = false;
    paramhe1.l &= 0xFFFFFFDF;
  }
  
  public final void n() {
    a a = this.h.p;
    if (a != null) {
      i = a.l;
    } else {
      i = 0;
    } 
    this.f = this.e + i;
    ArrayList arrayList = this.c;
    for (int i = arrayList.size() - 1; i >= 0 && arrayList.size() > this.f; i--)
      h(i); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */