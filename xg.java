import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class xg extends qv {
  public final int i;
  
  public final fs j;
  
  public int B(View paramView) {
    switch (this.i) {
      default:
        return super.B(paramView);
      case 1:
        break;
    } 
    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior)this.j;
    return sideSheetBehavior.l + sideSheetBehavior.o;
  }
  
  public int D() {
    int i;
    switch (this.i) {
      default:
        return super.D();
      case 0:
        break;
    } 
    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)this.j;
    if (bottomSheetBehavior.I) {
      i = bottomSheetBehavior.V;
    } else {
      i = bottomSheetBehavior.G;
    } 
    return i;
  }
  
  public final void O(int paramInt) {
    SideSheetBehavior sideSheetBehavior;
    int i = this.i;
    fs fs1 = this.j;
    switch (i) {
      default:
        if (paramInt == 1) {
          sideSheetBehavior = (SideSheetBehavior)fs1;
          if (sideSheetBehavior.g)
            sideSheetBehavior.x(1); 
        } 
        return;
      case 0:
        break;
    } 
    if (paramInt == 1) {
      BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)sideSheetBehavior;
      if (bottomSheetBehavior.K)
        bottomSheetBehavior.J(1); 
    } 
  }
  
  public final void P(View paramView, int paramInt1, int paramInt2) {
    LinkedHashSet linkedHashSet;
    WeakReference<View> weakReference;
    SideSheetBehavior sideSheetBehavior;
    int i = this.i;
    fs fs1 = this.j;
    switch (i) {
      default:
        sideSheetBehavior = (SideSheetBehavior)fs1;
        weakReference = sideSheetBehavior.q;
        if (weakReference != null) {
          View view = weakReference.get();
        } else {
          weakReference = null;
        } 
        if (weakReference != null) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)weakReference.getLayoutParams();
          if (marginLayoutParams != null) {
            sideSheetBehavior.a.i0(marginLayoutParams, paramView.getLeft(), paramView.getRight());
            weakReference.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
          } 
        } 
        linkedHashSet = sideSheetBehavior.v;
        if (!linkedHashSet.isEmpty()) {
          sideSheetBehavior.a.g(paramInt1);
          Iterator iterator = linkedHashSet.iterator();
          if (iterator.hasNext())
            throw x41.g(iterator); 
        } 
        return;
      case 0:
        break;
    } 
    ((BottomSheetBehavior)weakReference).z(paramInt2);
  }
  
  public final void Q(View paramView, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : I
    //   4: istore #5
    //   6: iconst_3
    //   7: istore #4
    //   9: aload_0
    //   10: getfield j : Lfs;
    //   13: astore #7
    //   15: iload #5
    //   17: tableswitch default -> 36, 0 -> 173
    //   36: aload #7
    //   38: checkcast com/google/android/material/sidesheet/SideSheetBehavior
    //   41: astore #7
    //   43: aload #7
    //   45: getfield a : Lqv;
    //   48: fload_2
    //   49: invokevirtual H : (F)Z
    //   52: ifeq -> 58
    //   55: goto -> 163
    //   58: aload #7
    //   60: getfield a : Lqv;
    //   63: aload_1
    //   64: fload_2
    //   65: invokevirtual a0 : (Landroid/view/View;F)Z
    //   68: ifeq -> 99
    //   71: aload #7
    //   73: getfield a : Lqv;
    //   76: fload_2
    //   77: fload_3
    //   78: invokevirtual J : (FF)Z
    //   81: ifne -> 160
    //   84: aload #7
    //   86: getfield a : Lqv;
    //   89: aload_1
    //   90: invokevirtual I : (Landroid/view/View;)Z
    //   93: ifeq -> 163
    //   96: goto -> 160
    //   99: fload_2
    //   100: fconst_0
    //   101: fcmpl
    //   102: ifeq -> 120
    //   105: fload_2
    //   106: invokestatic abs : (F)F
    //   109: fload_3
    //   110: invokestatic abs : (F)F
    //   113: fcmpl
    //   114: ifle -> 120
    //   117: goto -> 160
    //   120: aload_1
    //   121: invokevirtual getLeft : ()I
    //   124: istore #5
    //   126: iload #5
    //   128: aload #7
    //   130: getfield a : Lqv;
    //   133: invokevirtual r : ()I
    //   136: isub
    //   137: invokestatic abs : (I)I
    //   140: iload #5
    //   142: aload #7
    //   144: getfield a : Lqv;
    //   147: invokevirtual t : ()I
    //   150: isub
    //   151: invokestatic abs : (I)I
    //   154: if_icmpge -> 160
    //   157: goto -> 163
    //   160: iconst_5
    //   161: istore #4
    //   163: aload #7
    //   165: aload_1
    //   166: iload #4
    //   168: iconst_1
    //   169: invokevirtual z : (Landroid/view/View;IZ)V
    //   172: return
    //   173: aload #7
    //   175: checkcast com/google/android/material/bottomsheet/BottomSheetBehavior
    //   178: astore #7
    //   180: fload_3
    //   181: fconst_0
    //   182: fcmpg
    //   183: ifge -> 220
    //   186: aload #7
    //   188: getfield b : Z
    //   191: ifeq -> 197
    //   194: goto -> 514
    //   197: aload_1
    //   198: invokevirtual getTop : ()I
    //   201: istore #5
    //   203: invokestatic uptimeMillis : ()J
    //   206: pop2
    //   207: iload #5
    //   209: aload #7
    //   211: getfield E : I
    //   214: if_icmple -> 514
    //   217: goto -> 338
    //   220: aload #7
    //   222: getfield I : Z
    //   225: ifeq -> 345
    //   228: aload #7
    //   230: aload_1
    //   231: fload_3
    //   232: invokevirtual K : (Landroid/view/View;F)Z
    //   235: ifeq -> 345
    //   238: fload_2
    //   239: invokestatic abs : (F)F
    //   242: fload_3
    //   243: invokestatic abs : (F)F
    //   246: fcmpg
    //   247: ifge -> 261
    //   250: fload_3
    //   251: aload #7
    //   253: getfield d : I
    //   256: i2f
    //   257: fcmpl
    //   258: ifgt -> 289
    //   261: aload_1
    //   262: invokevirtual getTop : ()I
    //   265: istore #6
    //   267: aload #7
    //   269: getfield V : I
    //   272: istore #5
    //   274: iload #6
    //   276: aload #7
    //   278: invokevirtual D : ()I
    //   281: iload #5
    //   283: iadd
    //   284: iconst_2
    //   285: idiv
    //   286: if_icmple -> 295
    //   289: iconst_5
    //   290: istore #4
    //   292: goto -> 514
    //   295: aload #7
    //   297: getfield b : Z
    //   300: ifeq -> 306
    //   303: goto -> 514
    //   306: aload_1
    //   307: invokevirtual getTop : ()I
    //   310: aload #7
    //   312: invokevirtual D : ()I
    //   315: isub
    //   316: invokestatic abs : (I)I
    //   319: aload_1
    //   320: invokevirtual getTop : ()I
    //   323: aload #7
    //   325: getfield E : I
    //   328: isub
    //   329: invokestatic abs : (I)I
    //   332: if_icmpge -> 338
    //   335: goto -> 514
    //   338: bipush #6
    //   340: istore #4
    //   342: goto -> 514
    //   345: fload_3
    //   346: fconst_0
    //   347: fcmpl
    //   348: ifeq -> 414
    //   351: fload_2
    //   352: invokestatic abs : (F)F
    //   355: fload_3
    //   356: invokestatic abs : (F)F
    //   359: fcmpl
    //   360: ifle -> 366
    //   363: goto -> 414
    //   366: aload #7
    //   368: getfield b : Z
    //   371: ifeq -> 380
    //   374: iconst_4
    //   375: istore #4
    //   377: goto -> 514
    //   380: aload_1
    //   381: invokevirtual getTop : ()I
    //   384: istore #4
    //   386: iload #4
    //   388: aload #7
    //   390: getfield E : I
    //   393: isub
    //   394: invokestatic abs : (I)I
    //   397: iload #4
    //   399: aload #7
    //   401: getfield G : I
    //   404: isub
    //   405: invokestatic abs : (I)I
    //   408: if_icmpge -> 374
    //   411: goto -> 338
    //   414: aload_1
    //   415: invokevirtual getTop : ()I
    //   418: istore #5
    //   420: aload #7
    //   422: getfield b : Z
    //   425: ifeq -> 456
    //   428: iload #5
    //   430: aload #7
    //   432: getfield D : I
    //   435: isub
    //   436: invokestatic abs : (I)I
    //   439: iload #5
    //   441: aload #7
    //   443: getfield G : I
    //   446: isub
    //   447: invokestatic abs : (I)I
    //   450: if_icmpge -> 374
    //   453: goto -> 514
    //   456: aload #7
    //   458: getfield E : I
    //   461: istore #6
    //   463: iload #5
    //   465: iload #6
    //   467: if_icmpge -> 489
    //   470: iload #5
    //   472: iload #5
    //   474: aload #7
    //   476: getfield G : I
    //   479: isub
    //   480: invokestatic abs : (I)I
    //   483: if_icmpge -> 338
    //   486: goto -> 514
    //   489: iload #5
    //   491: iload #6
    //   493: isub
    //   494: invokestatic abs : (I)I
    //   497: iload #5
    //   499: aload #7
    //   501: getfield G : I
    //   504: isub
    //   505: invokestatic abs : (I)I
    //   508: if_icmpge -> 374
    //   511: goto -> 338
    //   514: aload #7
    //   516: aload_1
    //   517: iload #4
    //   519: iconst_1
    //   520: invokevirtual L : (Landroid/view/View;IZ)V
    //   523: return
  }
  
  public final boolean g0(View paramView, int paramInt) {
    SideSheetBehavior sideSheetBehavior;
    WeakReference<View> weakReference;
    int i = this.i;
    boolean bool = true;
    null = true;
    fs fs1 = this.j;
    switch (i) {
      default:
        sideSheetBehavior = (SideSheetBehavior)fs1;
        if (sideSheetBehavior.h != 1) {
          weakReference = sideSheetBehavior.p;
          if (weakReference != null && weakReference.get() == paramView)
            return null; 
        } 
        return false;
      case 0:
        break;
    } 
    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)weakReference;
    i = bottomSheetBehavior.N;
    if (i != 1 && !bottomSheetBehavior.d0) {
      if (i == 3 && bottomSheetBehavior.b0 == paramInt) {
        weakReference = bottomSheetBehavior.X;
        if (weakReference != null) {
          View view = weakReference.get();
        } else {
          weakReference = null;
        } 
        if (weakReference != null && weakReference.canScrollVertically(-1))
          return false; 
      } 
      SystemClock.uptimeMillis();
      weakReference = bottomSheetBehavior.W;
      if (weakReference != null && weakReference.get() == paramView)
        return bool; 
    } 
    return false;
  }
  
  public final int j(View paramView, int paramInt) {
    SideSheetBehavior sideSheetBehavior;
    switch (this.i) {
      default:
        sideSheetBehavior = (SideSheetBehavior)this.j;
        return ui0.i(paramInt, sideSheetBehavior.a.w(), sideSheetBehavior.a.v());
      case 0:
        break;
    } 
    return sideSheetBehavior.getLeft();
  }
  
  public final int k(View paramView, int paramInt) {
    switch (this.i) {
      default:
        return paramView.getTop();
      case 0:
        break;
    } 
    return ui0.i(paramInt, ((BottomSheetBehavior)this.j).D(), D());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */