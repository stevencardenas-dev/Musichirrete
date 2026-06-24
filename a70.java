import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.slider.RangeSlider2;

public final class a70 extends gh1 {
  public final td i;
  
  public a70(td paramtd) {
    super(3);
  }
  
  public final t0 l(int paramInt) {
    return new t0(AccessibilityNodeInfo.obtain((this.i.n(paramInt)).a));
  }
  
  public final t0 m(int paramInt) {
    td td1 = this.i;
    if (paramInt == 2) {
      paramInt = td1.k;
    } else {
      paramInt = td1.l;
    } 
    return (paramInt == Integer.MIN_VALUE) ? null : l(paramInt);
  }
  
  public final boolean r(int paramInt1, int paramInt2, Bundle paramBundle) {
    AccessibilityManager accessibilityManager;
    td td1 = this.i;
    View view = td1.i;
    if (paramInt1 != -1) {
      boolean bool = true;
      if (paramInt2 != 1) {
        if (paramInt2 != 2) {
          if (paramInt2 != 64) {
            if (paramInt2 != 128) {
              RangeSlider2 rangeSlider2;
              int i = td1.n;
              float f = 1.0F;
              switch (i) {
                default:
                  rangeSlider2 = (RangeSlider2)td1.p;
                  if (rangeSlider2.isEnabled())
                    if (paramInt2 != 4096 && paramInt2 != 8192) {
                      if (paramInt2 == 16908349 && paramBundle != null && paramBundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && rangeSlider2.s(paramInt1, paramBundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        rangeSlider2.v();
                        rangeSlider2.postInvalidate();
                        td1.m(paramInt1);
                        return bool;
                      } 
                    } else {
                      float f1 = ((xd)rangeSlider2).O;
                      if (f1 != 0.0F)
                        f = f1; 
                      f1 = (((xd)rangeSlider2).K - ((xd)rangeSlider2).J) / f;
                      if (f1 <= 20.0F) {
                        f1 = f;
                      } else {
                        f1 = f * Math.round(f1 / 20.0F);
                      } 
                      f = f1;
                      if (paramInt2 == 8192)
                        f = -f1; 
                      f1 = f;
                      if (rangeSlider2.j())
                        f1 = -f; 
                      if (rangeSlider2.s(paramInt1, ui0.h(((Float)rangeSlider2.getValues().get(paramInt1)).floatValue() + f1, rangeSlider2.getValueFrom(), rangeSlider2.getValueTo()))) {
                        rangeSlider2.v();
                        rangeSlider2.postInvalidate();
                        td1.m(paramInt1);
                        return bool;
                      } 
                    }  
                  return false;
                case 0:
                  break;
              } 
              view = td1.p;
              if (view.isEnabled())
                if (paramInt2 != 4096 && paramInt2 != 8192) {
                  if (paramInt2 == 16908349 && paramBundle != null && paramBundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && view.C(paramInt1, paramBundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    view.F();
                    view.postInvalidate();
                    td1.m(paramInt1);
                    return bool;
                  } 
                } else {
                  float f1 = ((yd)view).r0;
                  if (f1 != 0.0F)
                    f = f1; 
                  f1 = (((yd)view).n0 - ((yd)view).m0) / f;
                  if (f1 <= 20.0F) {
                    f1 = f;
                  } else {
                    f1 = f * Math.round(f1 / 20.0F);
                  } 
                  f = f1;
                  if (paramInt2 == 8192)
                    f = -f1; 
                  f1 = f;
                  if (view.t())
                    f1 = -f; 
                  if (view.C(paramInt1, ui0.h(((Float)view.getValues().get(paramInt1)).floatValue() + f1, view.getValueFrom(), view.getValueTo()))) {
                    view.setActiveThumbIndex(paramInt1);
                    e e = ((yd)view).V0;
                    view.removeCallbacks(e);
                    view.postDelayed(e, ((yd)view).S0);
                    view.F();
                    view.postInvalidate();
                    td1.m(paramInt1);
                    return bool;
                  } 
                }  
            } else {
              if (td1.k == paramInt1) {
                td1.k = Integer.MIN_VALUE;
                view.invalidate();
                td1.p(paramInt1, 65536);
                return true;
              } 
              return false;
            } 
          } else {
            accessibilityManager = td1.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
              paramInt2 = td1.k;
              if (paramInt2 != paramInt1) {
                if (paramInt2 != Integer.MIN_VALUE) {
                  td1.k = Integer.MIN_VALUE;
                  view.invalidate();
                  td1.p(paramInt2, 65536);
                } 
                td1.k = paramInt1;
                view.invalidate();
                td1.p(paramInt1, 32768);
                return true;
              } 
            } 
            return false;
          } 
        } else {
          return td1.j(paramInt1);
        } 
      } else {
        return td1.o(paramInt1);
      } 
    } else {
      return view.performAccessibilityAction(paramInt2, (Bundle)accessibilityManager);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */