import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class gh1 implements tw0, gx0, rs0, pw0, xc, c8, s31, j70 {
  public static gh1 e;
  
  public static final hh1 f = new hh1(0, false, false, 0, 0);
  
  public static final eg2 g = new eg2(6);
  
  public static final eg2 h = new eg2(10);
  
  public final int b;
  
  public Object c;
  
  public gh1(int paramInt) {
    Charset charset = vv2.a;
    this.c = a42;
  }
  
  public gh1(Context paramContext, l61 paraml61) {
    this.c = new GestureDetector(paramContext, (GestureDetector.OnGestureListener)paraml61, null);
  }
  
  public gh1(EditText paramEditText) {
    this.c = new g7(paramEditText, 17);
  }
  
  public gh1(TextView paramTextView) {
    this.c = new x30(paramTextView);
  }
  
  public gh1(yc paramyc) {
    Objects.requireNonNull(paramyc);
    this.c = paramyc;
  }
  
  public static gh1 n() {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{gh1}} */
    try {
      if (e == null) {
        gh1 gh12 = new gh1();
        this(0, false);
        e = gh12;
      } 
    } finally {
      Exception exception;
    } 
    gh1 gh11 = e;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{gh1}} */
    return gh11;
  }
  
  public void Q(ss0 paramss0, qy paramqy) {
    ((an)this.c).Q0(paramss0);
  }
  
  public void a(rw0 paramrw0, boolean paramBoolean) {
    if (paramrw0 instanceof tq1)
      ((tq1)paramrw0).z.k().c(false); 
    gx0 gx01 = ((u1)this.c).g;
    if (gx01 != null)
      gx01.a(paramrw0, paramBoolean); 
  }
  
  public void b(int paramInt) {}
  
  public boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    boolean bool;
    x1 x1 = ((ActionMenuView)this.c).n;
    if (x1 != null) {
      Toolbar toolbar = ((dv1)x1).b;
      Iterator iterator = ((CopyOnWriteArrayList)toolbar.I.e).iterator();
      while (true) {
        if (iterator.hasNext()) {
          if (((db0)iterator.next()).a.p()) {
            bool = true;
          } else {
            continue;
          } 
        } else {
          break;
        } 
        if (bool)
          return true; 
        // Byte code: goto -> 110
      } 
      hv1 hv1 = toolbar.K;
      if (hv1 != null) {
        bool = ((jv1)hv1).b.p.onMenuItemSelected(0, paramMenuItem);
      } else {
        bool = false;
      } 
    } else {
      return false;
    } 
    if (bool)
      return true; 
    // Byte code: goto -> 110
  }
  
  public void d(sp paramsp) {
    boolean bool;
    if (paramsp.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    yc yc = (yc)this.c;
    if (bool) {
      yc.h(null, ((he0)yc).z);
      return;
    } 
    a42 a42 = yc.p;
    if (a42 != null)
      ((ne0)a42.c).o(paramsp); 
  }
  
  public x62 e(View paramView, x62 paramx62) {
    u62 u62;
    x62 x622;
    dh dh;
    ch ch1;
    x62 x621;
    CollapsingToolbarLayout collapsingToolbarLayout;
    ch ch2;
    BottomSheetBehavior bottomSheetBehavior;
    ArrayList<ch> arrayList2;
    CoordinatorLayout coordinatorLayout;
    int k = this.b;
    WeakHashMap weakHashMap = null;
    paramView = null;
    boolean bool = true;
    int j = 0;
    int i = 0;
    switch (k) {
      default:
        u62 = paramx62.a;
        coordinatorLayout = (CoordinatorLayout)this.c;
        if (!Objects.equals(coordinatorLayout.p, paramx62)) {
          boolean bool1;
          coordinatorLayout.p = paramx62;
          if (paramx62.d() > 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          coordinatorLayout.q = bool1;
          if (!bool1 && coordinatorLayout.getBackground() == null) {
            bool1 = bool;
          } else {
            bool1 = false;
          } 
          coordinatorLayout.setWillNotDraw(bool1);
          if (!u62.r()) {
            j = coordinatorLayout.getChildCount();
            while (i < j) {
              View view = coordinatorLayout.getChildAt(i);
              weakHashMap = v22.a;
              if (view.getFitsSystemWindows() && ((is)view.getLayoutParams()).a != null && u62.r())
                break; 
              i++;
            } 
          } 
          coordinatorLayout.requestLayout();
        } 
        return paramx62;
      case 17:
        collapsingToolbarLayout = (CollapsingToolbarLayout)this.c;
        if (collapsingToolbarLayout.getFitsSystemWindows())
          x622 = paramx62; 
        if (!Objects.equals(collapsingToolbarLayout.G, x622)) {
          collapsingToolbarLayout.G = x622;
          collapsingToolbarLayout.requestLayout();
        } 
        return paramx62.a.c();
      case 15:
        dh = (dh)this.c;
        ch2 = dh.p;
        if (ch2 != null)
          dh.i.Y.remove(ch2); 
        ch2 = new ch((View)dh.l, paramx62);
        dh.p = ch2;
        ch2.e(dh.getWindow());
        bottomSheetBehavior = dh.i;
        ch1 = dh.p;
        arrayList2 = bottomSheetBehavior.Y;
        if (!arrayList2.contains(ch1))
          arrayList2.add(ch1); 
        return paramx62;
      case 8:
        break;
    } 
    AppBarLayout appBarLayout = (AppBarLayout)this.c;
    ArrayList<ch> arrayList1 = arrayList2;
    if (appBarLayout.getFitsSystemWindows())
      x621 = paramx62; 
    if (!Objects.equals(appBarLayout.i, x621)) {
      appBarLayout.i = x621;
      i = j;
      if (appBarLayout.z != null) {
        i = j;
        if (appBarLayout.getTopInset() > 0)
          i = 1; 
      } 
      appBarLayout.setWillNotDraw(i ^ 0x1);
      appBarLayout.requestLayout();
    } 
    return paramx62;
  }
  
  public void f(rw0 paramrw0, MenuItem paramMenuItem) {
    ((yi)this.c).h.removeCallbacksAndMessages(paramrw0);
  }
  
  public void g(rw0 paramrw0) {
    pw0 pw01 = ((ActionMenuView)this.c).i;
    if (pw01 != null)
      pw01.g(paramrw0); 
  }
  
  public Object get() {
    return new zv0(((s0)this.c).b, new zb0(20), new Object(), 6);
  }
  
  public void h(int paramInt) {}
  
  public void i(int paramInt, float paramFloat) {}
  
  public void j(rw0 paramrw0, uw0 paramuw0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: checkcast yi
    //   7: astore #7
    //   9: aload #7
    //   11: getfield h : Landroid/os/Handler;
    //   14: astore #6
    //   16: aconst_null
    //   17: astore #5
    //   19: aload #6
    //   21: aconst_null
    //   22: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
    //   25: aload #7
    //   27: getfield j : Ljava/util/ArrayList;
    //   30: astore #7
    //   32: aload #7
    //   34: invokevirtual size : ()I
    //   37: istore #4
    //   39: iconst_0
    //   40: istore_3
    //   41: iload_3
    //   42: iload #4
    //   44: if_icmpge -> 72
    //   47: aload_1
    //   48: aload #7
    //   50: iload_3
    //   51: invokevirtual get : (I)Ljava/lang/Object;
    //   54: checkcast xi
    //   57: getfield b : Lrw0;
    //   60: if_acmpne -> 66
    //   63: goto -> 74
    //   66: iinc #3, 1
    //   69: goto -> 41
    //   72: iconst_m1
    //   73: istore_3
    //   74: iload_3
    //   75: iconst_m1
    //   76: if_icmpne -> 80
    //   79: return
    //   80: iinc #3, 1
    //   83: iload_3
    //   84: aload #7
    //   86: invokevirtual size : ()I
    //   89: if_icmpge -> 103
    //   92: aload #7
    //   94: iload_3
    //   95: invokevirtual get : (I)Ljava/lang/Object;
    //   98: checkcast xi
    //   101: astore #5
    //   103: aload #6
    //   105: new wi
    //   108: dup
    //   109: aload_0
    //   110: aload #5
    //   112: aload_2
    //   113: aload_1
    //   114: invokespecial <init> : (Lgh1;Lxi;Luw0;Lrw0;)V
    //   117: aload_1
    //   118: invokestatic uptimeMillis : ()J
    //   121: ldc2_w 200
    //   124: ladd
    //   125: invokevirtual postAtTime : (Ljava/lang/Runnable;Ljava/lang/Object;J)Z
    //   128: pop
    //   129: return
  }
  
  public boolean k(rw0 paramrw0) {
    u1 u1 = (u1)this.c;
    if (paramrw0 != u1.e) {
      ((tq1)paramrw0).A.getClass();
      gx0 gx01 = u1.g;
      if (gx01 != null)
        return gx01.k(paramrw0); 
    } 
    return false;
  }
  
  public t0 l(int paramInt) {
    return null;
  }
  
  public t0 m(int paramInt) {
    return null;
  }
  
  public boolean o(char paramChar) {
    return ((Collator)this.c == null) ? ((paramChar >= '0' && paramChar <= '9')) : Character.isDigit(paramChar);
  }
  
  public void p(CharBuffer paramCharBuffer) {
    int j = paramCharBuffer.position();
    int i = paramCharBuffer.position();
    boolean bool = o(paramCharBuffer.get(j));
    while (i < paramCharBuffer.limit() && bool == o(paramCharBuffer.get(i))) {
      int k = i + 1;
      i = k;
      if (bool) {
        int m = j + 1;
        i = k;
        if (m < paramCharBuffer.limit()) {
          i = k;
          if (paramCharBuffer.get(j) == '0') {
            i = k;
            if (o(paramCharBuffer.get(k))) {
              j = m;
              i = k;
            } 
          } 
        } 
      } 
    } 
    paramCharBuffer.position(j).limit(i);
  }
  
  public void q() {
    ((wa0)this.c).n.S();
  }
  
  public boolean r(int paramInt1, int paramInt2, Bundle paramBundle) {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */