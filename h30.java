import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.insets.ProtectionLayout;
import java.util.List;

public final class h30 extends g30 {
  public void b(hs1 paramhs11, hs1 paramhs12, Window paramWindow, View paramView, boolean paramBoolean1, boolean paramBoolean2) {
    y62 y62;
    paramhs11.getClass();
    paramhs12.getClass();
    paramWindow.getClass();
    paramView.getClass();
    boolean bool = false;
    qz1.P(paramWindow, false);
    paramWindow.setStatusBarColor(0);
    paramWindow.setNavigationBarColor(0);
    int j = paramhs11.a(paramBoolean1);
    int k = paramhs12.a(paramBoolean2);
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
    } else {
      paramhs11 = null;
    } 
    if (paramhs11 != null) {
      int m = 0;
      while (true) {
        ColorDrawable colorDrawable;
        boolean bool1;
        if (m < paramhs11.getChildCount()) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (bool1) {
          View view = paramhs11.getChildAt(m);
          if (view != null) {
            object = view.getTag();
            if (object instanceof List) {
              List list = (List)object;
              if (list.size() == 4 && list.get(0) instanceof hn) {
                for (Object object : object) {
                  if (object instanceof hn) {
                    hn hn = (hn)object;
                  } else {
                    paramhs11 = null;
                  } 
                  if (paramhs11 != null) {
                    object = object;
                    m = ((hn)object).a;
                    wa1 wa1 = ((hn)object).b;
                    colorDrawable = ((hn)object).f;
                    if (m != 1) {
                      if (m != 2) {
                        if (m != 4) {
                          if (m != 8)
                            continue; 
                          ((hn)object).g = true;
                          if (((hn)object).h != k) {
                            ((hn)object).h = k;
                            colorDrawable.setColor(k);
                            wa1.e = colorDrawable;
                            object = wa1.i;
                            if (object != null)
                              ((View)((j01)object).e).setBackground((Drawable)colorDrawable); 
                          } 
                          continue;
                        } 
                        ((hn)object).g = true;
                        if (((hn)object).h != k) {
                          ((hn)object).h = k;
                          colorDrawable.setColor(k);
                          wa1.e = colorDrawable;
                          object = wa1.i;
                          if (object != null)
                            ((View)((j01)object).e).setBackground((Drawable)colorDrawable); 
                        } 
                        continue;
                      } 
                      ((hn)object).g = true;
                      if (((hn)object).h != j) {
                        ((hn)object).h = j;
                        colorDrawable.setColor(j);
                        wa1.e = colorDrawable;
                        object = wa1.i;
                        if (object != null)
                          ((View)((j01)object).e).setBackground((Drawable)colorDrawable); 
                      } 
                      continue;
                    } 
                    ((hn)object).g = true;
                    if (((hn)object).h != k) {
                      ((hn)object).h = k;
                      colorDrawable.setColor(k);
                      wa1.e = colorDrawable;
                      object = wa1.i;
                      if (object != null)
                        ((View)((j01)object).e).setBackground((Drawable)colorDrawable); 
                    } 
                  } 
                } 
                break;
              } 
            } 
            m++;
            continue;
          } 
          throw new IndexOutOfBoundsException();
        } 
        if (j != 0 || k != 0) {
          List list = om.h0((Object[])new hn[] { new hn(2, j), new hn(1, k), new hn(4, k), new hn(8, k) });
          ProtectionLayout protectionLayout = new ProtectionLayout(((ViewGroup)paramView).getContext(), list);
          protectionLayout.setTag(list);
          colorDrawable.addView((View)protectionLayout);
        } 
        break;
      } 
    } 
    if (paramhs12.b == 0)
      bool = true; 
    paramWindow.setNavigationBarContrastEnforced(bool);
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      a72 a72 = new a72(paramWindow);
    } else if (i >= 30) {
      a72 a72 = new a72(paramWindow);
    } else if (i >= 26) {
      y62 = new y62(paramWindow);
    } else {
      y62 = new y62(paramWindow);
    } 
    y62.b0(paramBoolean1 ^ true);
    y62.a0(paramBoolean2 ^ true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */