import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class hd1 implements Runnable {
  public final int b;
  
  public final RecyclerView c;
  
  public final void run() {
    od1 od1;
    int i = this.b;
    RecyclerView recyclerView = this.c;
    switch (i) {
      default:
        od1 = recyclerView.O;
        if (od1 != null) {
          mw mw = (mw)od1;
          long l = mw.d;
          ArrayList<Object> arrayList = mw.h;
          boolean bool2 = arrayList.isEmpty();
          ArrayList arrayList3 = mw.j;
          boolean bool1 = arrayList3.isEmpty();
          ArrayList arrayList2 = mw.k;
          boolean bool4 = arrayList2.isEmpty();
          ArrayList arrayList1 = mw.i;
          boolean bool3 = arrayList1.isEmpty();
          if (!bool2 || !bool1 || !bool3 || !bool4) {
            int j = arrayList.size();
            i = 0;
            while (i < j) {
              he1 he1 = (he1)arrayList.get(i);
              i++;
              he1 = he1;
              View view = he1.b;
              ViewPropertyAnimator viewPropertyAnimator = view.animate();
              mw.q.add(he1);
              viewPropertyAnimator.setDuration(l).alpha(0.0F).setListener((Animator.AnimatorListener)new hw(mw, he1, viewPropertyAnimator, view)).start();
            } 
            arrayList.clear();
            if (!bool1) {
              ArrayList arrayList4 = new ArrayList();
              arrayList4.addAll(arrayList3);
              mw.m.add(arrayList4);
              arrayList3.clear();
              gw gw = new gw(mw, arrayList4, 0);
              if (!bool2) {
                View view = ((lw)arrayList4.get(0)).a.b;
                WeakHashMap weakHashMap = v22.a;
                view.postOnAnimationDelayed(gw, l);
              } else {
                gw.run();
              } 
            } 
            if (!bool4) {
              arrayList3 = new ArrayList();
              arrayList3.addAll(arrayList2);
              mw.n.add(arrayList3);
              arrayList2.clear();
              gw gw = new gw(mw, arrayList3, 1);
              if (!bool2) {
                View view = ((kw)arrayList3.get(0)).a.b;
                WeakHashMap weakHashMap = v22.a;
                view.postOnAnimationDelayed(gw, l);
              } else {
                gw.run();
              } 
            } 
            if (!bool3) {
              arrayList2 = new ArrayList();
              arrayList2.addAll(arrayList1);
              mw.l.add(arrayList2);
              arrayList1.clear();
              gw gw = new gw(mw, arrayList2, 2);
              if (!bool2 || !bool1 || !bool4) {
                long l2 = 0L;
                if (bool2)
                  l = 0L; 
                if (!bool1) {
                  l1 = mw.e;
                } else {
                  l1 = 0L;
                } 
                if (!bool4)
                  l2 = mw.f; 
                long l1 = Math.max(l1, l2);
                View view = ((he1)arrayList2.get(0)).b;
                WeakHashMap weakHashMap = v22.a;
                view.postOnAnimationDelayed(gw, l1 + l);
              } else {
                gw.run();
              } 
            } 
          } 
        } 
        recyclerView.p0 = false;
        return;
      case 0:
        break;
    } 
    if (recyclerView.w && !recyclerView.isLayoutRequested())
      if (!recyclerView.u) {
        recyclerView.requestLayout();
      } else if (recyclerView.z) {
        recyclerView.y = true;
      } else {
        recyclerView.o();
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */