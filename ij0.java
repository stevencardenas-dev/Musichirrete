import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

public final class ij0 extends pd1 {
  public Rect A;
  
  public long B;
  
  public final ArrayList a = new ArrayList();
  
  public final float[] b = new float[2];
  
  public he1 c = null;
  
  public float d;
  
  public float e;
  
  public float f;
  
  public float g;
  
  public float h;
  
  public float i;
  
  public float j;
  
  public float k;
  
  public int l = -1;
  
  public final gj0 m;
  
  public int n = 0;
  
  public int o;
  
  public final ArrayList p = new ArrayList();
  
  public int q;
  
  public RecyclerView r;
  
  public final e3 s = new e3(15, this);
  
  public VelocityTracker t;
  
  public ArrayList u;
  
  public ArrayList v;
  
  public View w = null;
  
  public GestureDetector x;
  
  public hj0 y;
  
  public final dj0 z = new dj0(this);
  
  public ij0(gj0 paramgj0) {
    this.m = paramgj0;
  }
  
  public static boolean n(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return (paramFloat1 >= paramFloat3 && paramFloat1 <= paramFloat3 + paramView.getWidth() && paramFloat2 >= paramFloat4 && paramFloat2 <= paramFloat4 + paramView.getHeight());
  }
  
  public final void d(Rect paramRect, View paramView, RecyclerView paramRecyclerView, de1 paramde1) {
    paramRect.setEmpty();
  }
  
  public final void e(Canvas paramCanvas, RecyclerView paramRecyclerView) {
    float f1;
    float f2;
    if (this.c != null) {
      float[] arrayOfFloat = this.b;
      m(arrayOfFloat);
      f1 = arrayOfFloat[0];
      f2 = arrayOfFloat[1];
    } else {
      f1 = 0.0F;
      f2 = 0.0F;
    } 
    he1 he11 = this.c;
    this.m.getClass();
    ArrayList<ej0> arrayList = this.p;
    int j = arrayList.size();
    int i;
    for (i = 0; i < j; i++) {
      ej0 ej0 = arrayList.get(i);
      he1 he12 = ej0.e;
      float f4 = ej0.a;
      float f3 = ej0.c;
      if (f4 == f3) {
        ej0.i = he12.b.getTranslationX();
      } else {
        ej0.i = x41.e(f3, f4, ej0.m, f4);
      } 
      f4 = ej0.b;
      f3 = ej0.d;
      if (f4 == f3) {
        ej0.j = he12.b.getTranslationY();
      } else {
        ej0.j = x41.e(f3, f4, ej0.m, f4);
      } 
      int k = paramCanvas.save();
      gj0.n(paramRecyclerView, ej0.e, ej0.i, ej0.j, false);
      paramCanvas.restoreToCount(k);
    } 
    if (he11 != null) {
      i = paramCanvas.save();
      gj0.n(paramRecyclerView, he11, f1, f2, true);
      paramCanvas.restoreToCount(i);
    } 
  }
  
  public final void f(Canvas paramCanvas, RecyclerView paramRecyclerView) {
    he1 he11 = this.c;
    boolean bool = false;
    if (he11 != null) {
      float[] arrayOfFloat = this.b;
      m(arrayOfFloat);
      float f = arrayOfFloat[0];
      f = arrayOfFloat[1];
    } 
    he1 he12 = this.c;
    this.m.getClass();
    ArrayList<ej0> arrayList = this.p;
    int j = arrayList.size();
    int i;
    for (i = 0; i < j; i++) {
      ej0 ej0 = arrayList.get(i);
      int k = paramCanvas.save();
      View view = ej0.e.b;
      paramCanvas.restoreToCount(k);
    } 
    if (he12 != null)
      paramCanvas.restoreToCount(paramCanvas.save()); 
    for (i = j - 1; i >= 0; i--) {
      ej0 ej0 = arrayList.get(i);
      boolean bool1 = ej0.l;
      if (bool1 && !ej0.h) {
        arrayList.remove(i);
      } else if (!bool1) {
        bool = true;
      } 
    } 
    if (bool)
      paramRecyclerView.invalidate(); 
  }
  
  public final void g(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.r;
    if (recyclerView != paramRecyclerView) {
      dj0 dj01 = this.z;
      if (recyclerView != null) {
        recyclerView.g0(this);
        recyclerView = this.r;
        recyclerView.s.remove(dj01);
        if (recyclerView.t == dj01)
          recyclerView.t = null; 
        ArrayList arrayList = this.r.E;
        if (arrayList != null)
          arrayList.remove(this); 
        ArrayList<ej0> arrayList1 = this.p;
        for (int i = arrayList1.size() - 1; i >= 0; i--) {
          ej0 ej0 = arrayList1.get(0);
          ej0.g.cancel();
          RecyclerView recyclerView1 = this.r;
          he1 he11 = ej0.e;
          this.m.a(recyclerView1, he11);
        } 
        arrayList1.clear();
        this.w = null;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
          velocityTracker.recycle();
          this.t = null;
        } 
        hj0 hj01 = this.y;
        if (hj01 != null) {
          hj01.a = false;
          this.y = null;
        } 
        if (this.x != null)
          this.x = null; 
      } 
      this.r = paramRecyclerView;
      if (paramRecyclerView != null) {
        Resources resources = paramRecyclerView.getResources();
        this.f = resources.getDimension(2131165405);
        this.g = resources.getDimension(2131165404);
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.h(this);
        this.r.s.add(dj01);
        RecyclerView recyclerView1 = this.r;
        if (recyclerView1.E == null)
          recyclerView1.E = new ArrayList(); 
        recyclerView1.E.add(this);
        this.y = new hj0(this);
        this.x = new GestureDetector(this.r.getContext(), (GestureDetector.OnGestureListener)this.y);
      } 
    } 
  }
  
  public final int h(int paramInt) {
    if ((paramInt & 0xC) != 0) {
      byte b1;
      float f = this.h;
      byte b2 = 4;
      if (f > 0.0F) {
        b1 = 8;
      } else {
        b1 = 4;
      } 
      VelocityTracker velocityTracker = this.t;
      gj0 gj01 = this.m;
      if (velocityTracker != null && this.l > -1) {
        f = this.g;
        gj01.getClass();
        velocityTracker.computeCurrentVelocity(1000, f);
        float f1 = this.t.getXVelocity(this.l);
        f = this.t.getYVelocity(this.l);
        if (f1 > 0.0F)
          b2 = 8; 
        f1 = Math.abs(f1);
        if ((b2 & paramInt) != 0 && b1 == b2 && f1 >= this.f && f1 > Math.abs(f))
          return b2; 
      } 
      f = this.r.getWidth();
      gj01.getClass();
      if ((paramInt & b1) != 0 && Math.abs(this.h) > f * 0.5F)
        return b1; 
    } 
    return 0;
  }
  
  public final void i(int paramInt1, int paramInt2, MotionEvent paramMotionEvent) {
    if (this.c == null && paramInt1 == 2 && this.n != 2) {
      gj0 gj01 = this.m;
      if (gj01.k() && this.r.getScrollState() != 1) {
        a a = this.r.getLayoutManager();
        paramInt1 = this.l;
        he1 he11 = null;
        if (paramInt1 != -1) {
          paramInt1 = paramMotionEvent.findPointerIndex(paramInt1);
          float f4 = paramMotionEvent.getX(paramInt1);
          float f2 = this.d;
          float f1 = paramMotionEvent.getY(paramInt1);
          float f3 = this.e;
          f2 = Math.abs(f4 - f2);
          f1 = Math.abs(f1 - f3);
          f3 = this.q;
          if ((f2 >= f3 || f1 >= f3) && (f2 <= f1 || !a.o()) && (f1 <= f2 || !a.p())) {
            View view = l(paramMotionEvent);
            if (view != null)
              he11 = this.r.N(view); 
          } 
        } 
        if (he11 != null) {
          RecyclerView recyclerView = this.r;
          paramInt1 = (gj0.b(gj01.d(), recyclerView.getLayoutDirection()) & 0xFF00) >> 8;
          if (paramInt1 != 0) {
            float f1 = paramMotionEvent.getX(paramInt2);
            float f2 = paramMotionEvent.getY(paramInt2);
            f1 -= this.d;
            f2 -= this.e;
            float f3 = Math.abs(f1);
            float f5 = Math.abs(f2);
            float f4 = this.q;
            if ((f3 >= f4 || f5 >= f4) && ((f3 > f5) ? ((f1 < 0.0F && (paramInt1 & 0x4) == 0) || (f1 > 0.0F && (paramInt1 & 0x8) == 0)) : ((f2 < 0.0F && (paramInt1 & 0x1) == 0) || (f2 > 0.0F && (paramInt1 & 0x2) == 0)))) {
              this.i = 0.0F;
              this.h = 0.0F;
              this.l = paramMotionEvent.getPointerId(0);
              p(he11, 1);
            } 
          } 
        } 
      } 
    } 
  }
  
  public final int j(int paramInt) {
    if ((paramInt & 0x3) != 0) {
      byte b1;
      float f = this.i;
      byte b2 = 1;
      if (f > 0.0F) {
        b1 = 2;
      } else {
        b1 = 1;
      } 
      VelocityTracker velocityTracker = this.t;
      gj0 gj01 = this.m;
      if (velocityTracker != null && this.l > -1) {
        f = this.g;
        gj01.getClass();
        velocityTracker.computeCurrentVelocity(1000, f);
        f = this.t.getXVelocity(this.l);
        float f1 = this.t.getYVelocity(this.l);
        if (f1 > 0.0F)
          b2 = 2; 
        f1 = Math.abs(f1);
        if ((b2 & paramInt) != 0 && b2 == b1 && f1 >= this.f && f1 > Math.abs(f))
          return b2; 
      } 
      f = this.r.getHeight();
      gj01.getClass();
      if ((paramInt & b1) != 0 && Math.abs(this.i) > f * 0.5F)
        return b1; 
    } 
    return 0;
  }
  
  public final void k(he1 paramhe1, boolean paramBoolean) {
    ArrayList<ej0> arrayList = this.p;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      ej0 ej0 = arrayList.get(i);
      if (ej0.e == paramhe1) {
        ej0.k |= paramBoolean;
        if (!ej0.l)
          ej0.g.cancel(); 
        arrayList.remove(i);
        return;
      } 
    } 
  }
  
  public final View l(MotionEvent paramMotionEvent) {
    float f2 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    he1 he11 = this.c;
    if (he11 != null) {
      View view = he11.b;
      if (n(view, f2, f1, this.j + this.h, this.k + this.i))
        return view; 
    } 
    ArrayList<ej0> arrayList = this.p;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      ej0 ej0 = arrayList.get(i);
      View view = ej0.e.b;
      if (n(view, f2, f1, ej0.i, ej0.j))
        return view; 
    } 
    return this.r.D(f2, f1);
  }
  
  public final void m(float[] paramArrayOffloat) {
    if ((this.o & 0xC) != 0) {
      paramArrayOffloat[0] = this.j + this.h - this.c.b.getLeft();
    } else {
      paramArrayOffloat[0] = this.c.b.getTranslationX();
    } 
    if ((this.o & 0x3) != 0) {
      paramArrayOffloat[1] = this.k + this.i - this.c.b.getTop();
      return;
    } 
    paramArrayOffloat[1] = this.c.b.getTranslationY();
  }
  
  public final void o(he1 paramhe1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokevirtual isLayoutRequested : ()Z
    //   7: ifeq -> 13
    //   10: goto -> 1245
    //   13: aload_0
    //   14: getfield n : I
    //   17: iconst_2
    //   18: if_icmpeq -> 24
    //   21: goto -> 1245
    //   24: aload_0
    //   25: getfield m : Lgj0;
    //   28: astore #23
    //   30: aload #23
    //   32: invokevirtual getClass : ()Ljava/lang/Class;
    //   35: pop
    //   36: aload_0
    //   37: getfield j : F
    //   40: aload_0
    //   41: getfield h : F
    //   44: fadd
    //   45: f2i
    //   46: istore #5
    //   48: aload_0
    //   49: getfield k : F
    //   52: aload_0
    //   53: getfield i : F
    //   56: fadd
    //   57: f2i
    //   58: istore #4
    //   60: aload_1
    //   61: getfield b : Landroid/view/View;
    //   64: astore #22
    //   66: iload #4
    //   68: aload #22
    //   70: invokevirtual getTop : ()I
    //   73: isub
    //   74: invokestatic abs : (I)I
    //   77: i2f
    //   78: aload #22
    //   80: invokevirtual getHeight : ()I
    //   83: i2f
    //   84: ldc_w 0.5
    //   87: fmul
    //   88: fcmpg
    //   89: ifge -> 121
    //   92: iload #5
    //   94: aload #22
    //   96: invokevirtual getLeft : ()I
    //   99: isub
    //   100: invokestatic abs : (I)I
    //   103: i2f
    //   104: aload #22
    //   106: invokevirtual getWidth : ()I
    //   109: i2f
    //   110: ldc_w 0.5
    //   113: fmul
    //   114: fcmpg
    //   115: ifge -> 121
    //   118: goto -> 1245
    //   121: aload_0
    //   122: getfield u : Ljava/util/ArrayList;
    //   125: astore #17
    //   127: aload #17
    //   129: ifnonnull -> 157
    //   132: aload_0
    //   133: new java/util/ArrayList
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: putfield u : Ljava/util/ArrayList;
    //   143: aload_0
    //   144: new java/util/ArrayList
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: putfield v : Ljava/util/ArrayList;
    //   154: goto -> 169
    //   157: aload #17
    //   159: invokevirtual clear : ()V
    //   162: aload_0
    //   163: getfield v : Ljava/util/ArrayList;
    //   166: invokevirtual clear : ()V
    //   169: aload_0
    //   170: getfield j : F
    //   173: aload_0
    //   174: getfield h : F
    //   177: fadd
    //   178: invokestatic round : (F)I
    //   181: istore_2
    //   182: aload_0
    //   183: getfield k : F
    //   186: aload_0
    //   187: getfield i : F
    //   190: fadd
    //   191: invokestatic round : (F)I
    //   194: istore #14
    //   196: aload #22
    //   198: invokevirtual getWidth : ()I
    //   201: iload_2
    //   202: iadd
    //   203: istore #11
    //   205: aload #22
    //   207: invokevirtual getHeight : ()I
    //   210: iload #14
    //   212: iadd
    //   213: istore #12
    //   215: iload_2
    //   216: iload #11
    //   218: iadd
    //   219: iconst_2
    //   220: idiv
    //   221: istore #10
    //   223: iload #14
    //   225: iload #12
    //   227: iadd
    //   228: iconst_2
    //   229: idiv
    //   230: istore #13
    //   232: aload_0
    //   233: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   236: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   239: astore #18
    //   241: aload #18
    //   243: invokevirtual G : ()I
    //   246: istore #9
    //   248: iconst_0
    //   249: istore_3
    //   250: iload_3
    //   251: iload #9
    //   253: if_icmpge -> 472
    //   256: aload #18
    //   258: iload_3
    //   259: invokevirtual F : (I)Landroid/view/View;
    //   262: astore #19
    //   264: aload #19
    //   266: aload #22
    //   268: if_acmpne -> 274
    //   271: goto -> 466
    //   274: aload #19
    //   276: invokevirtual getBottom : ()I
    //   279: iload #14
    //   281: if_icmplt -> 271
    //   284: aload #19
    //   286: invokevirtual getTop : ()I
    //   289: iload #12
    //   291: if_icmpgt -> 271
    //   294: aload #19
    //   296: invokevirtual getRight : ()I
    //   299: iload_2
    //   300: if_icmplt -> 271
    //   303: aload #19
    //   305: invokevirtual getLeft : ()I
    //   308: iload #11
    //   310: if_icmple -> 316
    //   313: goto -> 271
    //   316: aload_0
    //   317: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   320: aload #19
    //   322: invokevirtual N : (Landroid/view/View;)Lhe1;
    //   325: astore #17
    //   327: aload #19
    //   329: invokevirtual getLeft : ()I
    //   332: istore #6
    //   334: iload #10
    //   336: aload #19
    //   338: invokevirtual getRight : ()I
    //   341: iload #6
    //   343: iadd
    //   344: iconst_2
    //   345: idiv
    //   346: isub
    //   347: invokestatic abs : (I)I
    //   350: istore #6
    //   352: aload #19
    //   354: invokevirtual getTop : ()I
    //   357: istore #7
    //   359: iload #13
    //   361: aload #19
    //   363: invokevirtual getBottom : ()I
    //   366: iload #7
    //   368: iadd
    //   369: iconst_2
    //   370: idiv
    //   371: isub
    //   372: invokestatic abs : (I)I
    //   375: istore #7
    //   377: iload #7
    //   379: iload #7
    //   381: imul
    //   382: iload #6
    //   384: iload #6
    //   386: imul
    //   387: iadd
    //   388: istore #15
    //   390: aload_0
    //   391: getfield u : Ljava/util/ArrayList;
    //   394: invokevirtual size : ()I
    //   397: istore #8
    //   399: iconst_0
    //   400: istore #7
    //   402: iconst_0
    //   403: istore #6
    //   405: iload #7
    //   407: iload #8
    //   409: if_icmpge -> 441
    //   412: iload #15
    //   414: aload_0
    //   415: getfield v : Ljava/util/ArrayList;
    //   418: iload #7
    //   420: invokevirtual get : (I)Ljava/lang/Object;
    //   423: checkcast java/lang/Integer
    //   426: invokevirtual intValue : ()I
    //   429: if_icmple -> 441
    //   432: iinc #6, 1
    //   435: iinc #7, 1
    //   438: goto -> 405
    //   441: aload_0
    //   442: getfield u : Ljava/util/ArrayList;
    //   445: iload #6
    //   447: aload #17
    //   449: invokevirtual add : (ILjava/lang/Object;)V
    //   452: aload_0
    //   453: getfield v : Ljava/util/ArrayList;
    //   456: iload #6
    //   458: iload #15
    //   460: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   463: invokevirtual add : (ILjava/lang/Object;)V
    //   466: iinc #3, 1
    //   469: goto -> 250
    //   472: aload_0
    //   473: getfield u : Ljava/util/ArrayList;
    //   476: astore #21
    //   478: aload #21
    //   480: invokevirtual size : ()I
    //   483: ifne -> 489
    //   486: goto -> 1245
    //   489: aload #22
    //   491: invokevirtual getWidth : ()I
    //   494: istore #10
    //   496: aload #22
    //   498: invokevirtual getHeight : ()I
    //   501: istore #9
    //   503: iload #5
    //   505: aload #22
    //   507: invokevirtual getLeft : ()I
    //   510: isub
    //   511: istore #12
    //   513: iload #4
    //   515: aload #22
    //   517: invokevirtual getTop : ()I
    //   520: isub
    //   521: istore #8
    //   523: aload #21
    //   525: invokeinterface size : ()I
    //   530: istore #11
    //   532: aconst_null
    //   533: astore #18
    //   535: iconst_m1
    //   536: istore_3
    //   537: iconst_0
    //   538: istore #6
    //   540: iload #6
    //   542: iload #11
    //   544: if_icmpge -> 906
    //   547: aload #21
    //   549: iload #6
    //   551: invokeinterface get : (I)Ljava/lang/Object;
    //   556: checkcast he1
    //   559: astore #17
    //   561: iload #12
    //   563: ifle -> 638
    //   566: aload #17
    //   568: getfield b : Landroid/view/View;
    //   571: invokevirtual getRight : ()I
    //   574: iload #10
    //   576: iload #5
    //   578: iadd
    //   579: isub
    //   580: istore #7
    //   582: iload #7
    //   584: ifge -> 638
    //   587: aload #18
    //   589: astore #20
    //   591: iload_3
    //   592: istore_2
    //   593: aload #17
    //   595: getfield b : Landroid/view/View;
    //   598: invokevirtual getRight : ()I
    //   601: aload #22
    //   603: invokevirtual getRight : ()I
    //   606: if_icmple -> 644
    //   609: iload #7
    //   611: invokestatic abs : (I)I
    //   614: istore #7
    //   616: aload #18
    //   618: astore #20
    //   620: iload_3
    //   621: istore_2
    //   622: iload #7
    //   624: iload_3
    //   625: if_icmple -> 644
    //   628: iload #7
    //   630: istore_2
    //   631: aload #17
    //   633: astore #20
    //   635: goto -> 644
    //   638: iload_3
    //   639: istore_2
    //   640: aload #18
    //   642: astore #20
    //   644: aload #20
    //   646: astore #19
    //   648: iload_2
    //   649: istore_3
    //   650: iload #12
    //   652: ifge -> 727
    //   655: aload #17
    //   657: getfield b : Landroid/view/View;
    //   660: invokevirtual getLeft : ()I
    //   663: iload #5
    //   665: isub
    //   666: istore #7
    //   668: aload #20
    //   670: astore #19
    //   672: iload_2
    //   673: istore_3
    //   674: iload #7
    //   676: ifle -> 727
    //   679: aload #20
    //   681: astore #19
    //   683: iload_2
    //   684: istore_3
    //   685: aload #17
    //   687: getfield b : Landroid/view/View;
    //   690: invokevirtual getLeft : ()I
    //   693: aload #22
    //   695: invokevirtual getLeft : ()I
    //   698: if_icmpge -> 727
    //   701: iload #7
    //   703: invokestatic abs : (I)I
    //   706: istore #7
    //   708: aload #20
    //   710: astore #19
    //   712: iload_2
    //   713: istore_3
    //   714: iload #7
    //   716: iload_2
    //   717: if_icmple -> 727
    //   720: iload #7
    //   722: istore_3
    //   723: aload #17
    //   725: astore #19
    //   727: aload #19
    //   729: astore #18
    //   731: iload_3
    //   732: istore_2
    //   733: iload #8
    //   735: ifge -> 810
    //   738: aload #17
    //   740: getfield b : Landroid/view/View;
    //   743: invokevirtual getTop : ()I
    //   746: iload #4
    //   748: isub
    //   749: istore #7
    //   751: aload #19
    //   753: astore #18
    //   755: iload_3
    //   756: istore_2
    //   757: iload #7
    //   759: ifle -> 810
    //   762: aload #19
    //   764: astore #18
    //   766: iload_3
    //   767: istore_2
    //   768: aload #17
    //   770: getfield b : Landroid/view/View;
    //   773: invokevirtual getTop : ()I
    //   776: aload #22
    //   778: invokevirtual getTop : ()I
    //   781: if_icmpge -> 810
    //   784: iload #7
    //   786: invokestatic abs : (I)I
    //   789: istore #7
    //   791: aload #19
    //   793: astore #18
    //   795: iload_3
    //   796: istore_2
    //   797: iload #7
    //   799: iload_3
    //   800: if_icmple -> 810
    //   803: iload #7
    //   805: istore_2
    //   806: aload #17
    //   808: astore #18
    //   810: aload #18
    //   812: astore #19
    //   814: iload_2
    //   815: istore_3
    //   816: iload #8
    //   818: ifle -> 896
    //   821: aload #17
    //   823: getfield b : Landroid/view/View;
    //   826: invokevirtual getBottom : ()I
    //   829: iload #9
    //   831: iload #4
    //   833: iadd
    //   834: isub
    //   835: istore #7
    //   837: aload #18
    //   839: astore #19
    //   841: iload_2
    //   842: istore_3
    //   843: iload #7
    //   845: ifge -> 896
    //   848: aload #18
    //   850: astore #19
    //   852: iload_2
    //   853: istore_3
    //   854: aload #17
    //   856: getfield b : Landroid/view/View;
    //   859: invokevirtual getBottom : ()I
    //   862: aload #22
    //   864: invokevirtual getBottom : ()I
    //   867: if_icmple -> 896
    //   870: iload #7
    //   872: invokestatic abs : (I)I
    //   875: istore #7
    //   877: aload #18
    //   879: astore #19
    //   881: iload_2
    //   882: istore_3
    //   883: iload #7
    //   885: iload_2
    //   886: if_icmple -> 896
    //   889: iload #7
    //   891: istore_3
    //   892: aload #17
    //   894: astore #19
    //   896: iinc #6, 1
    //   899: aload #19
    //   901: astore #18
    //   903: goto -> 540
    //   906: aload #18
    //   908: ifnonnull -> 926
    //   911: aload_0
    //   912: getfield u : Ljava/util/ArrayList;
    //   915: invokevirtual clear : ()V
    //   918: aload_0
    //   919: getfield v : Ljava/util/ArrayList;
    //   922: invokevirtual clear : ()V
    //   925: return
    //   926: aload #18
    //   928: getfield b : Landroid/view/View;
    //   931: astore #17
    //   933: aload #18
    //   935: invokevirtual b : ()I
    //   938: istore_2
    //   939: aload_1
    //   940: invokevirtual b : ()I
    //   943: pop
    //   944: aload #23
    //   946: aload_0
    //   947: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   950: aload_1
    //   951: aload #18
    //   953: invokevirtual o : (Landroidx/recyclerview/widget/RecyclerView;Lhe1;Lhe1;)Z
    //   956: ifeq -> 1245
    //   959: aload_0
    //   960: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   963: astore #18
    //   965: aload #18
    //   967: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   970: astore_1
    //   971: aload_1
    //   972: instanceof androidx/recyclerview/widget/LinearLayoutManager
    //   975: ifeq -> 1143
    //   978: aload_1
    //   979: checkcast androidx/recyclerview/widget/LinearLayoutManager
    //   982: astore_1
    //   983: aload_1
    //   984: ldc_w 'Cannot drop a view during a scroll or layout calculation'
    //   987: invokevirtual m : (Ljava/lang/String;)V
    //   990: aload_1
    //   991: invokevirtual W0 : ()V
    //   994: aload_1
    //   995: invokevirtual m1 : ()V
    //   998: aload #22
    //   1000: invokestatic R : (Landroid/view/View;)I
    //   1003: istore_2
    //   1004: aload #17
    //   1006: invokestatic R : (Landroid/view/View;)I
    //   1009: istore_3
    //   1010: iload_2
    //   1011: iload_3
    //   1012: if_icmpge -> 1020
    //   1015: iconst_1
    //   1016: istore_2
    //   1017: goto -> 1022
    //   1020: iconst_m1
    //   1021: istore_2
    //   1022: aload_1
    //   1023: getfield w : Z
    //   1026: istore #16
    //   1028: aload_1
    //   1029: getfield t : Lf51;
    //   1032: astore #18
    //   1034: iload #16
    //   1036: ifeq -> 1102
    //   1039: iload_2
    //   1040: iconst_1
    //   1041: if_icmpne -> 1081
    //   1044: aload #18
    //   1046: invokevirtual i : ()I
    //   1049: istore #4
    //   1051: aload_1
    //   1052: getfield t : Lf51;
    //   1055: aload #17
    //   1057: invokevirtual g : (Landroid/view/View;)I
    //   1060: istore_2
    //   1061: aload_1
    //   1062: iload_3
    //   1063: iload #4
    //   1065: aload_1
    //   1066: getfield t : Lf51;
    //   1069: aload #22
    //   1071: invokevirtual e : (Landroid/view/View;)I
    //   1074: iload_2
    //   1075: iadd
    //   1076: isub
    //   1077: invokevirtual o1 : (II)V
    //   1080: return
    //   1081: aload_1
    //   1082: iload_3
    //   1083: aload #18
    //   1085: invokevirtual i : ()I
    //   1088: aload_1
    //   1089: getfield t : Lf51;
    //   1092: aload #17
    //   1094: invokevirtual d : (Landroid/view/View;)I
    //   1097: isub
    //   1098: invokevirtual o1 : (II)V
    //   1101: return
    //   1102: iload_2
    //   1103: iconst_m1
    //   1104: if_icmpne -> 1120
    //   1107: aload_1
    //   1108: iload_3
    //   1109: aload #18
    //   1111: aload #17
    //   1113: invokevirtual g : (Landroid/view/View;)I
    //   1116: invokevirtual o1 : (II)V
    //   1119: return
    //   1120: aload_1
    //   1121: iload_3
    //   1122: aload #18
    //   1124: aload #17
    //   1126: invokevirtual d : (Landroid/view/View;)I
    //   1129: aload_1
    //   1130: getfield t : Lf51;
    //   1133: aload #22
    //   1135: invokevirtual e : (Landroid/view/View;)I
    //   1138: isub
    //   1139: invokevirtual o1 : (II)V
    //   1142: return
    //   1143: aload_1
    //   1144: invokevirtual o : ()Z
    //   1147: ifeq -> 1194
    //   1150: aload #17
    //   1152: invokestatic L : (Landroid/view/View;)I
    //   1155: aload #18
    //   1157: invokevirtual getPaddingLeft : ()I
    //   1160: if_icmpgt -> 1169
    //   1163: aload #18
    //   1165: iload_2
    //   1166: invokevirtual k0 : (I)V
    //   1169: aload #17
    //   1171: invokestatic O : (Landroid/view/View;)I
    //   1174: aload #18
    //   1176: invokevirtual getWidth : ()I
    //   1179: aload #18
    //   1181: invokevirtual getPaddingRight : ()I
    //   1184: isub
    //   1185: if_icmplt -> 1194
    //   1188: aload #18
    //   1190: iload_2
    //   1191: invokevirtual k0 : (I)V
    //   1194: aload_1
    //   1195: invokevirtual p : ()Z
    //   1198: ifeq -> 1245
    //   1201: aload #17
    //   1203: invokestatic P : (Landroid/view/View;)I
    //   1206: aload #18
    //   1208: invokevirtual getPaddingTop : ()I
    //   1211: if_icmpgt -> 1220
    //   1214: aload #18
    //   1216: iload_2
    //   1217: invokevirtual k0 : (I)V
    //   1220: aload #17
    //   1222: invokestatic J : (Landroid/view/View;)I
    //   1225: aload #18
    //   1227: invokevirtual getHeight : ()I
    //   1230: aload #18
    //   1232: invokevirtual getPaddingBottom : ()I
    //   1235: isub
    //   1236: if_icmplt -> 1245
    //   1239: aload #18
    //   1241: iload_2
    //   1242: invokevirtual k0 : (I)V
    //   1245: return
  }
  
  public final void p(he1 paramhe1, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield c : Lhe1;
    //   5: if_acmpne -> 17
    //   8: iload_2
    //   9: aload_0
    //   10: getfield n : I
    //   13: if_icmpne -> 17
    //   16: return
    //   17: aload_0
    //   18: ldc2_w -9223372036854775808
    //   21: putfield B : J
    //   24: aload_0
    //   25: getfield n : I
    //   28: istore #9
    //   30: aload_0
    //   31: aload_1
    //   32: iconst_1
    //   33: invokevirtual k : (Lhe1;Z)V
    //   36: aload_0
    //   37: iload_2
    //   38: putfield n : I
    //   41: iload_2
    //   42: iconst_2
    //   43: if_icmpne -> 68
    //   46: aload_1
    //   47: ifnull -> 61
    //   50: aload_0
    //   51: aload_1
    //   52: getfield b : Landroid/view/View;
    //   55: putfield w : Landroid/view/View;
    //   58: goto -> 68
    //   61: ldc_w 'Must pass a ViewHolder when dragging'
    //   64: invokestatic l : (Ljava/lang/String;)V
    //   67: return
    //   68: aload_0
    //   69: getfield c : Lhe1;
    //   72: astore #16
    //   74: aload_0
    //   75: getfield m : Lgj0;
    //   78: astore #15
    //   80: aload #16
    //   82: ifnull -> 642
    //   85: aload #16
    //   87: getfield b : Landroid/view/View;
    //   90: astore #17
    //   92: aload #17
    //   94: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   97: ifnull -> 603
    //   100: iload #9
    //   102: iconst_2
    //   103: if_icmpne -> 112
    //   106: iconst_0
    //   107: istore #7
    //   109: goto -> 301
    //   112: aload_0
    //   113: getfield n : I
    //   116: iconst_2
    //   117: if_icmpne -> 123
    //   120: goto -> 106
    //   123: aload #15
    //   125: invokevirtual d : ()I
    //   128: istore #7
    //   130: iload #7
    //   132: aload_0
    //   133: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   136: invokevirtual getLayoutDirection : ()I
    //   139: invokestatic b : (II)I
    //   142: ldc_w 65280
    //   145: iand
    //   146: bipush #8
    //   148: ishr
    //   149: istore #11
    //   151: iload #11
    //   153: ifne -> 159
    //   156: goto -> 106
    //   159: iload #7
    //   161: ldc_w 65280
    //   164: iand
    //   165: bipush #8
    //   167: ishr
    //   168: istore #10
    //   170: aload_0
    //   171: getfield h : F
    //   174: invokestatic abs : (F)F
    //   177: aload_0
    //   178: getfield i : F
    //   181: invokestatic abs : (F)F
    //   184: fcmpl
    //   185: ifle -> 246
    //   188: aload_0
    //   189: iload #11
    //   191: invokevirtual h : (I)I
    //   194: istore #8
    //   196: iload #8
    //   198: ifle -> 230
    //   201: iload #8
    //   203: istore #7
    //   205: iload #10
    //   207: iload #8
    //   209: iand
    //   210: ifne -> 301
    //   213: iload #8
    //   215: aload_0
    //   216: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   219: invokevirtual getLayoutDirection : ()I
    //   222: invokestatic c : (II)I
    //   225: istore #7
    //   227: goto -> 301
    //   230: aload_0
    //   231: iload #11
    //   233: invokevirtual j : (I)I
    //   236: istore #7
    //   238: iload #7
    //   240: ifle -> 106
    //   243: goto -> 301
    //   246: aload_0
    //   247: iload #11
    //   249: invokevirtual j : (I)I
    //   252: istore #7
    //   254: iload #7
    //   256: ifle -> 262
    //   259: goto -> 301
    //   262: aload_0
    //   263: iload #11
    //   265: invokevirtual h : (I)I
    //   268: istore #8
    //   270: iload #8
    //   272: ifle -> 106
    //   275: iload #8
    //   277: istore #7
    //   279: iload #10
    //   281: iload #8
    //   283: iand
    //   284: ifne -> 301
    //   287: iload #8
    //   289: aload_0
    //   290: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   293: invokevirtual getLayoutDirection : ()I
    //   296: invokestatic c : (II)I
    //   299: istore #7
    //   301: aload_0
    //   302: getfield t : Landroid/view/VelocityTracker;
    //   305: astore #17
    //   307: aload #17
    //   309: ifnull -> 322
    //   312: aload #17
    //   314: invokevirtual recycle : ()V
    //   317: aload_0
    //   318: aconst_null
    //   319: putfield t : Landroid/view/VelocityTracker;
    //   322: iconst_4
    //   323: istore #8
    //   325: fconst_0
    //   326: fstore #4
    //   328: iload #7
    //   330: iconst_1
    //   331: if_icmpeq -> 403
    //   334: iload #7
    //   336: iconst_2
    //   337: if_icmpeq -> 403
    //   340: iload #7
    //   342: iconst_4
    //   343: if_icmpeq -> 372
    //   346: iload #7
    //   348: bipush #8
    //   350: if_icmpeq -> 372
    //   353: iload #7
    //   355: bipush #16
    //   357: if_icmpeq -> 372
    //   360: iload #7
    //   362: bipush #32
    //   364: if_icmpeq -> 372
    //   367: fconst_0
    //   368: fstore_3
    //   369: goto -> 420
    //   372: aload_0
    //   373: getfield h : F
    //   376: invokestatic signum : (F)F
    //   379: fstore #5
    //   381: aload_0
    //   382: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   385: invokevirtual getWidth : ()I
    //   388: i2f
    //   389: fstore #4
    //   391: fconst_0
    //   392: fstore_3
    //   393: fload #5
    //   395: fload #4
    //   397: fmul
    //   398: fstore #4
    //   400: goto -> 420
    //   403: aload_0
    //   404: getfield i : F
    //   407: invokestatic signum : (F)F
    //   410: aload_0
    //   411: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   414: invokevirtual getHeight : ()I
    //   417: i2f
    //   418: fmul
    //   419: fstore_3
    //   420: iload #9
    //   422: iconst_2
    //   423: if_icmpne -> 433
    //   426: bipush #8
    //   428: istore #8
    //   430: goto -> 441
    //   433: iload #7
    //   435: ifle -> 441
    //   438: iconst_2
    //   439: istore #8
    //   441: aload_0
    //   442: getfield b : [F
    //   445: astore #17
    //   447: aload_0
    //   448: aload #17
    //   450: invokevirtual m : ([F)V
    //   453: aload #17
    //   455: iconst_0
    //   456: faload
    //   457: fstore #6
    //   459: aload #17
    //   461: iconst_1
    //   462: faload
    //   463: fstore #5
    //   465: new ej0
    //   468: dup
    //   469: aload_0
    //   470: aload #16
    //   472: iload #9
    //   474: fload #6
    //   476: fload #5
    //   478: fload #4
    //   480: fload_3
    //   481: iload #7
    //   483: aload #16
    //   485: invokespecial <init> : (Lij0;Lhe1;IFFFFILhe1;)V
    //   488: astore #17
    //   490: aload_0
    //   491: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   494: astore #18
    //   496: aload #15
    //   498: invokevirtual getClass : ()Ljava/lang/Class;
    //   501: pop
    //   502: aload #18
    //   504: invokevirtual getItemAnimator : ()Lod1;
    //   507: astore #18
    //   509: aload #18
    //   511: ifnonnull -> 537
    //   514: iload #8
    //   516: bipush #8
    //   518: if_icmpne -> 529
    //   521: ldc2_w 200
    //   524: lstore #13
    //   526: goto -> 561
    //   529: ldc2_w 250
    //   532: lstore #13
    //   534: goto -> 561
    //   537: iload #8
    //   539: bipush #8
    //   541: if_icmpne -> 554
    //   544: aload #18
    //   546: getfield e : J
    //   549: lstore #13
    //   551: goto -> 561
    //   554: aload #18
    //   556: getfield d : J
    //   559: lstore #13
    //   561: aload #17
    //   563: getfield g : Landroid/animation/ValueAnimator;
    //   566: astore #18
    //   568: aload #18
    //   570: lload #13
    //   572: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   575: pop
    //   576: aload_0
    //   577: getfield p : Ljava/util/ArrayList;
    //   580: aload #17
    //   582: invokevirtual add : (Ljava/lang/Object;)Z
    //   585: pop
    //   586: aload #16
    //   588: iconst_0
    //   589: invokevirtual p : (Z)V
    //   592: aload #18
    //   594: invokevirtual start : ()V
    //   597: iconst_1
    //   598: istore #7
    //   600: goto -> 634
    //   603: aload #17
    //   605: aload_0
    //   606: getfield w : Landroid/view/View;
    //   609: if_acmpne -> 620
    //   612: aload_0
    //   613: aconst_null
    //   614: putfield w : Landroid/view/View;
    //   617: goto -> 620
    //   620: aload #15
    //   622: aload_0
    //   623: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   626: aload #16
    //   628: invokevirtual a : (Landroidx/recyclerview/widget/RecyclerView;Lhe1;)V
    //   631: iconst_0
    //   632: istore #7
    //   634: aload_0
    //   635: aconst_null
    //   636: putfield c : Lhe1;
    //   639: goto -> 645
    //   642: iconst_0
    //   643: istore #7
    //   645: iconst_0
    //   646: istore #12
    //   648: aload_1
    //   649: ifnull -> 738
    //   652: aload_1
    //   653: getfield b : Landroid/view/View;
    //   656: astore #16
    //   658: aload_0
    //   659: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   662: astore #17
    //   664: aload_0
    //   665: aload #15
    //   667: invokevirtual d : ()I
    //   670: aload #17
    //   672: invokevirtual getLayoutDirection : ()I
    //   675: invokestatic b : (II)I
    //   678: iconst_1
    //   679: iload_2
    //   680: bipush #8
    //   682: imul
    //   683: bipush #8
    //   685: iadd
    //   686: ishl
    //   687: iconst_1
    //   688: isub
    //   689: iand
    //   690: aload_0
    //   691: getfield n : I
    //   694: bipush #8
    //   696: imul
    //   697: ishr
    //   698: putfield o : I
    //   701: aload_0
    //   702: aload #16
    //   704: invokevirtual getLeft : ()I
    //   707: i2f
    //   708: putfield j : F
    //   711: aload_0
    //   712: aload #16
    //   714: invokevirtual getTop : ()I
    //   717: i2f
    //   718: putfield k : F
    //   721: aload_0
    //   722: aload_1
    //   723: putfield c : Lhe1;
    //   726: iload_2
    //   727: iconst_2
    //   728: if_icmpne -> 738
    //   731: aload #16
    //   733: iconst_0
    //   734: invokevirtual performHapticFeedback : (I)Z
    //   737: pop
    //   738: aload_0
    //   739: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   742: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   745: astore_1
    //   746: aload_1
    //   747: ifnull -> 768
    //   750: aload_0
    //   751: getfield c : Lhe1;
    //   754: ifnull -> 760
    //   757: iconst_1
    //   758: istore #12
    //   760: aload_1
    //   761: iload #12
    //   763: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   768: iload #7
    //   770: ifne -> 784
    //   773: aload_0
    //   774: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   777: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   780: iconst_1
    //   781: putfield h : Z
    //   784: aload #15
    //   786: invokevirtual getClass : ()Ljava/lang/Class;
    //   789: pop
    //   790: aload_0
    //   791: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   794: invokevirtual invalidate : ()V
    //   797: return
  }
  
  public final void q(he1 paramhe1) {
    RecyclerView recyclerView = this.r;
    if ((gj0.b(this.m.d(), recyclerView.getLayoutDirection()) & 0xFF0000) != 0) {
      if (paramhe1.b.getParent() != this.r) {
        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        return;
      } 
      VelocityTracker velocityTracker = this.t;
      if (velocityTracker != null)
        velocityTracker.recycle(); 
      this.t = VelocityTracker.obtain();
      this.i = 0.0F;
      this.h = 0.0F;
      p(paramhe1, 2);
      return;
    } 
    Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
  }
  
  public final void r(he1 paramhe1) {
    RecyclerView recyclerView = this.r;
    if ((gj0.b(this.m.d(), recyclerView.getLayoutDirection()) & 0xFF00) != 0) {
      if (paramhe1.b.getParent() != this.r) {
        Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        return;
      } 
      VelocityTracker velocityTracker = this.t;
      if (velocityTracker != null)
        velocityTracker.recycle(); 
      this.t = VelocityTracker.obtain();
      this.i = 0.0F;
      this.h = 0.0F;
      p(paramhe1, 1);
      return;
    } 
    Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
  }
  
  public final void s(int paramInt1, int paramInt2, MotionEvent paramMotionEvent) {
    float f2 = paramMotionEvent.getX(paramInt2);
    float f1 = paramMotionEvent.getY(paramInt2);
    f2 -= this.d;
    this.h = f2;
    this.i = f1 - this.e;
    if ((paramInt1 & 0x4) == 0)
      this.h = Math.max(0.0F, f2); 
    if ((paramInt1 & 0x8) == 0)
      this.h = Math.min(0.0F, this.h); 
    if ((paramInt1 & 0x1) == 0)
      this.i = Math.max(0.0F, this.i); 
    if ((paramInt1 & 0x2) == 0)
      this.i = Math.min(0.0F, this.i); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ij0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */