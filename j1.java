import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class j1 extends AnimatorListenerAdapter {
  public final int a;
  
  public final Object b;
  
  public j1(w32 paramw32, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        super.onAnimationCancel(paramAnimator);
        return;
      case 13:
        ((w32)object).b();
        return;
      case 0:
        break;
    } 
    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)object;
    actionBarOverlayLayout.y = null;
    actionBarOverlayLayout.l = false;
  }
  
  public void onAnimationEnd(Animator paramAnimator) {
    WeakReference weakReference2;
    bs0 bs0;
    c20 c20;
    WeakReference weakReference1;
    ViewGroup viewGroup2;
    a42 a42;
    ViewGroup viewGroup1;
    ArrayList<ViewGroup> arrayList1;
    ViewOverlay viewOverlay;
    ArrayList<md> arrayList;
    BottomSheetBehavior bottomSheetBehavior;
    xd xd;
    ArrayList<ViewGroup> arrayList2;
    b5 b5;
    yd yd;
    int m = this.a;
    int i = 0;
    int k = 0;
    int j = 0;
    SideSheetBehavior sideSheetBehavior = null;
    ViewGroup viewGroup3 = null;
    Object object = this.b;
    switch (m) {
      default:
        super.onAnimationEnd(paramAnimator);
        return;
      case 13:
        ((w32)object).a();
        return;
      case 12:
        ((kw1)object).m();
        paramAnimator.removeListener((Animator.AnimatorListener)this);
        return;
      case 11:
        sideSheetBehavior = (SideSheetBehavior)object;
        sideSheetBehavior.x(5);
        weakReference2 = sideSheetBehavior.p;
        if (weakReference2 != null && weakReference2.get() != null)
          ((View)sideSheetBehavior.p.get()).requestLayout(); 
        return;
      case 10:
        bs0 = (bs0)object;
        bs0.b.setTranslationY(0.0F);
        bs0.b(0.0F);
        return;
      case 8:
        ((HideViewOnScrollBehavior)object).k = null;
        return;
      case 7:
        ((HideBottomViewOnScrollBehavior)object).k = null;
        return;
      case 6:
        ((ExpandableTransformationBehavior)object).b = null;
        return;
      case 5:
        c20 = (c20)object;
        c20.p();
        c20.r.start();
        return;
      case 4:
        bottomSheetBehavior = (BottomSheetBehavior)object;
        bottomSheetBehavior.J(5);
        weakReference1 = bottomSheetBehavior.W;
        if (weakReference1 != null && weakReference1.get() != null)
          ((View)bottomSheetBehavior.W.get()).requestLayout(); 
        return;
      case 3:
        super.onAnimationEnd((Animator)weakReference1);
        xd = (xd)object;
        viewGroup2 = n21.z(xd);
        if (viewGroup2 == null) {
          viewGroup2 = viewGroup3;
        } else {
          a42 = new a42(0, viewGroup2);
        } 
        arrayList2 = xd.m;
        k = arrayList2.size();
        i = j;
        while (i < k) {
          viewGroup3 = arrayList2.get(i);
          i++;
          qv1 qv1 = (qv1)viewGroup3;
          ((ViewGroup)a42.c).getOverlay().remove(qv1);
        } 
        return;
      case 2:
        super.onAnimationEnd((Animator)a42);
        yd = (yd)object;
        viewGroup1 = n21.z(yd);
        if (viewGroup1 == null) {
          arrayList1 = arrayList2;
        } else {
          viewOverlay = arrayList1.getOverlay();
        } 
        if (viewOverlay != null) {
          arrayList2 = yd.n;
          j = arrayList2.size();
          while (i < j) {
            yd = (yd)arrayList2.get(i);
            i++;
            viewOverlay.remove((qv1)yd);
          } 
        } 
        return;
      case 1:
        b5 = (b5)object;
        arrayList = new ArrayList(b5.g);
        j = arrayList.size();
        for (i = k; i < j; i++)
          ((md)arrayList.get(i)).a(b5); 
        return;
      case 0:
        break;
    } 
    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)object;
    actionBarOverlayLayout.y = null;
    actionBarOverlayLayout.l = false;
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationRepeat(paramAnimator);
        return;
      case 9:
        break;
    } 
    super.onAnimationRepeat(paramAnimator);
    an0 an0 = (an0)this.b;
    an0.f = (an0.f + 1) % an0.e.e.length;
    an0.g = true;
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 13:
        ((w32)object).c();
        return;
      case 1:
        break;
    } 
    b5 b5 = (b5)object;
    object = new ArrayList(b5.g);
    int j = object.size();
    for (i = 0; i < j; i++)
      ((md)object.get(i)).b(b5); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */