import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

public final class gw implements Runnable {
  public final int b;
  
  public final ArrayList c;
  
  public final mw e;
  
  public final void run() {
    int m = this.b;
    int i = 0;
    int k = 0;
    int j = 0;
    ArrayList<Object> arrayList = this.c;
    switch (m) {
      default:
        k = arrayList.size();
        i = j;
        while (true) {
          mw mw1 = this.e;
          if (i < k) {
            he1 he11 = (he1)arrayList.get(i);
            i++;
            he1 he12 = he11;
            mw1.getClass();
            View view = he12.b;
            ViewPropertyAnimator viewPropertyAnimator = view.animate();
            mw1.o.add(he12);
            viewPropertyAnimator.alpha(1.0F).setDuration(mw1.c).setListener((Animator.AnimatorListener)new hw(mw1, he12, view, viewPropertyAnimator)).start();
            continue;
          } 
          arrayList.clear();
          mw1.l.remove(arrayList);
          return;
        } 
      case 1:
        j = arrayList.size();
        while (true) {
          mw mw1 = this.e;
          if (i < j) {
            View view1;
            kw kw1 = (kw)arrayList.get(i);
            i++;
            kw kw2 = kw1;
            ArrayList<he1> arrayList1 = mw1.r;
            long l = mw1.f;
            he1 he11 = kw2.a;
            View view2 = null;
            if (he11 == null) {
              he11 = null;
            } else {
              view1 = he11.b;
            } 
            he1 he12 = kw2.b;
            if (he12 != null)
              view2 = he12.b; 
            if (view1 != null) {
              ViewPropertyAnimator viewPropertyAnimator = view1.animate().setDuration(l);
              arrayList1.add(kw2.a);
              viewPropertyAnimator.translationX((kw2.e - kw2.c));
              viewPropertyAnimator.translationY((kw2.f - kw2.d));
              viewPropertyAnimator.alpha(0.0F).setListener((Animator.AnimatorListener)new jw(mw1, kw2, viewPropertyAnimator, view1, 0)).start();
            } 
            if (view2 != null) {
              ViewPropertyAnimator viewPropertyAnimator = view2.animate();
              arrayList1.add(kw2.b);
              viewPropertyAnimator.translationX(0.0F).translationY(0.0F).setDuration(l).alpha(1.0F).setListener((Animator.AnimatorListener)new jw(mw1, kw2, viewPropertyAnimator, view2, 1)).start();
            } 
            continue;
          } 
          arrayList.clear();
          mw1.n.remove(arrayList);
          return;
        } 
      case 0:
        break;
    } 
    j = arrayList.size();
    i = k;
    while (true) {
      mw mw1 = this.e;
      if (i < j) {
        lw lw1 = (lw)arrayList.get(i);
        i++;
        lw lw2 = lw1;
        he1 he1 = lw2.a;
        int n = lw2.b;
        k = lw2.c;
        int i1 = lw2.d;
        m = lw2.e;
        mw1.getClass();
        View view = he1.b;
        n = i1 - n;
        k = m - k;
        if (n != 0)
          view.animate().translationX(0.0F); 
        if (k != 0)
          view.animate().translationY(0.0F); 
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        mw1.p.add(he1);
        viewPropertyAnimator.setDuration(mw1.e).setListener((Animator.AnimatorListener)new iw(mw1, he1, n, view, k, viewPropertyAnimator)).start();
        continue;
      } 
      arrayList.clear();
      mw1.m.remove(arrayList);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */