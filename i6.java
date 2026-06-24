import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class i6 implements s31, rr, gx0 {
  public final int b;
  
  public final u6 c;
  
  public void a(rw0 paramrw0, boolean paramBoolean) {
    byte b1;
    byte b2;
    rw0 rw01;
    t6[] arrayOfT6;
    int i = this.b;
    u6 u61 = this.c;
    switch (i) {
      default:
        rw01 = paramrw0.k();
        b2 = 0;
        if (rw01 != paramrw0) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0)
          paramrw0 = rw01; 
        arrayOfT6 = u61.N;
        if (arrayOfT6 != null) {
          b1 = arrayOfT6.length;
        } else {
          b1 = 0;
        } 
        while (true) {
          if (b2 < b1) {
            t6 t6 = arrayOfT6[b2];
            if (t6 != null && t6.h == paramrw0) {
              t6 t61 = t6;
              break;
            } 
            b2++;
            continue;
          } 
          paramrw0 = null;
          break;
        } 
        if (paramrw0 != null)
          if (i != 0) {
            u61.q(((t6)paramrw0).a, (t6)paramrw0, rw01);
            u61.s((t6)paramrw0, true);
          } else {
            u61.s((t6)paramrw0, paramBoolean);
          }  
        return;
      case 2:
        break;
    } 
    u61.r(paramrw0);
  }
  
  public x62 e(View paramView, x62 paramx62) {
    int j;
    boolean bool;
    int k = paramx62.d();
    u6 u61 = this.c;
    Context context = u61.m;
    int i = paramx62.d();
    ActionBarContextView actionBarContextView = u61.w;
    byte b = 8;
    if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
      boolean bool1;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)u61.w.getLayoutParams();
      boolean bool2 = u61.w.isShown();
      int m = 1;
      bool = true;
      if (bool2) {
        if (u61.e0 == null) {
          u61.e0 = new Rect();
          u61.f0 = new Rect();
        } 
        Rect rect1 = u61.e0;
        Rect rect2 = u61.f0;
        rect1.set(paramx62.b(), paramx62.d(), paramx62.c(), paramx62.a());
        ViewGroup viewGroup2 = u61.C;
        if (Build.VERSION.SDK_INT >= 29) {
          bool2 = d42.a;
          b42.a((View)viewGroup2, rect1, rect2);
        } else {
          if (!d42.a) {
            d42.a = true;
            try {
              Method method1 = View.class.getDeclaredMethod(LHyji.ChyjKFKfF, new Class[] { Rect.class, Rect.class });
              d42.b = method1;
              if (!method1.isAccessible())
                d42.b.setAccessible(true); 
            } catch (NoSuchMethodException noSuchMethodException) {
              Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            } 
          } 
          Method method = d42.b;
          if (method != null)
            try {
              method.invoke(viewGroup2, new Object[] { rect1, rect2 });
            } catch (Exception exception) {
              Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", exception);
            }  
        } 
        int i1 = rect1.top;
        int i2 = rect1.left;
        bool1 = rect1.right;
        ViewGroup viewGroup1 = u61.C;
        WeakHashMap weakHashMap = v22.a;
        x62 x621 = n22.a((View)viewGroup1);
        if (x621 == null) {
          m = 0;
        } else {
          m = x621.b();
        } 
        if (x621 == null) {
          n = 0;
        } else {
          n = x621.c();
        } 
        if (marginLayoutParams.topMargin != i1 || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != bool1) {
          marginLayoutParams.topMargin = i1;
          marginLayoutParams.leftMargin = i2;
          marginLayoutParams.rightMargin = bool1;
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (i1 > 0 && u61.E == null) {
          View view2 = new View(context);
          u61.E = view2;
          view2.setVisibility(8);
          FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
          layoutParams.leftMargin = m;
          layoutParams.rightMargin = n;
          u61.C.addView(u61.E, -1, (ViewGroup.LayoutParams)layoutParams);
        } else {
          View view2 = u61.E;
          if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)view2.getLayoutParams();
            i2 = marginLayoutParams1.height;
            i1 = marginLayoutParams.topMargin;
            if (i2 != i1 || marginLayoutParams1.leftMargin != m || marginLayoutParams1.rightMargin != n) {
              marginLayoutParams1.height = i1;
              marginLayoutParams1.leftMargin = m;
              marginLayoutParams1.rightMargin = n;
              u61.E.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams1);
            } 
          } 
        } 
        View view1 = u61.E;
        if (view1 != null) {
          m = bool;
        } else {
          m = 0;
        } 
        if (m != 0 && view1.getVisibility() != 0) {
          view1 = u61.E;
          if ((view1.getWindowSystemUiVisibility() & 0x2000) != 0) {
            n = context.getColor(2131099654);
          } else {
            n = context.getColor(2131099653);
          } 
          view1.setBackgroundColor(n);
        } 
        int n = i;
        if (!u61.J) {
          n = i;
          if (m != 0)
            n = 0; 
        } 
        i = m;
        m = bool1;
        bool1 = i;
        i = n;
      } else if (marginLayoutParams.topMargin != 0) {
        marginLayoutParams.topMargin = 0;
        bool1 = false;
      } else {
        bool1 = false;
        m = 0;
      } 
      bool = bool1;
      j = i;
      if (m != 0) {
        u61.w.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        bool = bool1;
        j = i;
      } 
    } else {
      bool = false;
      j = i;
    } 
    View view = u61.E;
    if (view != null) {
      byte b1 = b;
      if (bool)
        b1 = 0; 
      view.setVisibility(b1);
    } 
    if (k != j)
      paramx62 = paramx62.f(paramx62.b(), j, paramx62.c(), paramx62.a()); 
    return v22.i(paramView, paramx62);
  }
  
  public boolean k(rw0 paramrw0) {
    int i = this.b;
    u6 u61 = this.c;
    switch (i) {
      default:
        if (paramrw0 == paramrw0.k() && u61.H) {
          Window.Callback callback1 = u61.n.getCallback();
          if (callback1 != null && !u61.S)
            callback1.onMenuOpened(108, paramrw0); 
        } 
        return true;
      case 2:
        break;
    } 
    Window.Callback callback = u61.n.getCallback();
    if (callback != null)
      callback.onMenuOpened(108, paramrw0); 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */