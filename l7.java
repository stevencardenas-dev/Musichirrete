import android.util.Size;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import in.krosbits.audio_cutter.TrimActivity;
import java.util.Collections;
import java.util.HashSet;

public final class l7 implements ViewTreeObserver.OnGlobalLayoutListener {
  public final int b;
  
  public final Object c;
  
  public final void onGlobalLayout() {
    fx0 fx0;
    HashSet hashSet;
    ss0 ss0;
    u7 u7;
    TrimActivity trimActivity;
    yi yi;
    by1 by1;
    int j = this.b;
    int i = 0;
    int k = 0;
    Object object = this.c;
    switch (j) {
      default:
        trimActivity = (TrimActivity)object;
        by1 = trimActivity.U;
        if (by1 != null) {
          object = trimActivity.R;
          if (object != null) {
            int m = ((o2)object).H.getWidth();
            object = trimActivity.R;
            if (object != null) {
              int n = ((o2)object).H.getPaddingLeft();
              object = trimActivity.R;
              if (object != null) {
                j = ((o2)object).H.getPaddingRight();
                object = trimActivity.R;
                if (object != null) {
                  i = ((o2)object).H.getHeight();
                  object = trimActivity.R;
                  if (object != null) {
                    k = ((o2)object).H.getPaddingTop();
                    object = trimActivity.R;
                    if (object != null) {
                      object = new Size(m - n - j, i - k - ((o2)object).H.getPaddingBottom());
                      float f = trimActivity.getResources().getDimension(2131165390);
                      ip1 ip1 = by1.c;
                      while (true) {
                        Object object1 = ip1.f();
                        cy1 cy1 = (cy1)object1;
                        if (!cy1.t.equals(object)) {
                          vj0 vj0 = ((cy1)by1.d.b.f()).l;
                          cm cm = qv.C(by1);
                          yw yw = e00.a;
                          cy1 = cy1.a(cy1, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, qv.L(cm, fw.e, null, new ay1(vj0, by1, (Size)object, f, null), 2), null, null, null, null, null, null, null, (Size)object, null, 1570815);
                        } 
                        if (ip1.e(object1, cy1)) {
                          object = trimActivity.R;
                          if (object != null) {
                            if (((o2)object).H.getViewTreeObserver().isAlive()) {
                              object = trimActivity.R;
                              if (object != null) {
                                ((o2)object).H.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                              } else {
                                ui0.n0("activityTrimBinding");
                                throw null;
                              } 
                            } 
                            return;
                          } 
                          ui0.n0("activityTrimBinding");
                          throw null;
                        } 
                      } 
                    } 
                    ui0.n0("activityTrimBinding");
                    throw null;
                  } 
                  ui0.n0("activityTrimBinding");
                  throw null;
                } 
                ui0.n0("activityTrimBinding");
                throw null;
              } 
              ui0.n0("activityTrimBinding");
              throw null;
            } 
            ui0.n0("activityTrimBinding");
            throw null;
          } 
          ui0.n0("activityTrimBinding");
          throw null;
        } 
        ui0.n0("mViewModel");
        throw null;
      case 5:
        object = object;
        fx0 = ((dp1)object).j;
        if (object.b() && !fx0.A) {
          View view = ((dp1)object).o;
          if (view == null || !view.isShown()) {
            object.dismiss();
            return;
          } 
          fx0.d();
        } 
        return;
      case 4:
        object = object;
        ((qu0)object).H.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        hashSet = ((qu0)object).K;
        if (hashSet != null && hashSet.size() != 0) {
          gu0 gu0 = new gu0((qu0)object, 0);
          int m = ((qu0)object).H.getFirstVisiblePosition();
          for (i = 0; k < ((qu0)object).H.getChildCount(); i = j) {
            View view = ((qu0)object).H.getChildAt(k);
            hv0 hv0 = (hv0)((qu0)object).I.getItem(m + k);
            j = i;
            if (((qu0)object).K.contains(hv0)) {
              AlphaAnimation alphaAnimation = new AlphaAnimation(0.0F, 1.0F);
              alphaAnimation.setDuration(((qu0)object).l0);
              alphaAnimation.setFillEnabled(true);
              alphaAnimation.setFillAfter(true);
              j = i;
              if (i == 0) {
                alphaAnimation.setAnimationListener(gu0);
                j = 1;
              } 
              view.clearAnimation();
              view.startAnimation((Animation)alphaAnimation);
            } 
            k++;
          } 
        } else {
          object.k(true);
        } 
        return;
      case 3:
        ss0 = (ss0)object;
        ss0.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        i = ss0.t;
        if (i == 2 || i == 3) {
          if (i == 2) {
            j = ss0.e.M;
            i = j;
            if (j < 0)
              return; 
          } else {
            object = ss0.u;
            if (object == null || object.size() == 0)
              return; 
            Collections.sort(ss0.u);
            i = ((Integer)ss0.u.get(0)).intValue();
          } 
          ss0.f.post(new sd(i, 3, this));
        } 
        return;
      case 2:
        yi = (yi)object;
        object = yi.j;
        if (yi.b() && object.size() > 0 && !((xi)object.get(0)).a.A) {
          View view = yi.q;
          if (view == null || !view.isShown()) {
            yi.dismiss();
            return;
          } 
          j = object.size();
          while (i < j) {
            view = object.get(i);
            i++;
            ((xi)view).a.d();
          } 
        } 
        return;
      case 1:
        object = object;
        u7 = ((r7)object).I;
        if (u7.isAttachedToWindow() && u7.getGlobalVisibleRect(((r7)object).G)) {
          object.s();
          object.d();
        } else {
          object.dismiss();
        } 
        return;
      case 0:
        break;
    } 
    object = object;
    if (!object.getInternalPopup().b())
      ((u7)object).h.n(object.getTextDirection(), object.getTextAlignment()); 
    object = object.getViewTreeObserver();
    if (object != null)
      object.removeOnGlobalLayoutListener(this); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */