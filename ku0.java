import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class ku0 implements ViewTreeObserver.OnGlobalLayoutListener {
  public final Map b;
  
  public final Map c;
  
  public final qu0 e;
  
  public ku0(qu0 paramqu0, HashMap paramHashMap1, HashMap paramHashMap2) {
    this.e = paramqu0;
    this.b = paramHashMap1;
    this.c = paramHashMap2;
  }
  
  public final void onGlobalLayout() {
    qu0 qu01 = this.e;
    qu01.H.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    HashSet hashSet = qu01.K;
    if (hashSet != null && qu01.L != null) {
      int j = hashSet.size() - qu01.L.size();
      gu0 gu0 = new gu0(qu01, 1);
      int k = qu01.H.getFirstVisiblePosition();
      byte b = 0;
      int i = 0;
      while (true) {
        int m = qu01.H.getChildCount();
        Map map1 = this.b;
        Map map2 = this.c;
        if (b < m) {
          View view = qu01.H.getChildAt(b);
          hv0 hv0 = (hv0)qu01.I.getItem(k + b);
          Rect rect = (Rect)map1.get(hv0);
          int n = view.getTop();
          if (rect != null) {
            m = rect.top;
          } else {
            m = qu01.R * j + n;
          } 
          AnimationSet animationSet = new AnimationSet(true);
          HashSet hashSet1 = qu01.K;
          if (hashSet1 != null && hashSet1.contains(hv0)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0F, 0.0F);
            alphaAnimation.setDuration(qu01.l0);
            animationSet.addAnimation((Animation)alphaAnimation);
            m = n;
          } 
          TranslateAnimation translateAnimation = new TranslateAnimation(0.0F, 0.0F, (m - n), 0.0F);
          translateAnimation.setDuration(qu01.k0);
          animationSet.addAnimation((Animation)translateAnimation);
          animationSet.setFillAfter(true);
          animationSet.setFillEnabled(true);
          animationSet.setInterpolator(qu01.n0);
          m = i;
          if (!i) {
            animationSet.setAnimationListener(gu0);
            m = 1;
          } 
          view.clearAnimation();
          view.startAnimation((Animation)animationSet);
          map1.remove(hv0);
          map2.remove(hv0);
          b++;
          i = m;
          continue;
        } 
        for (Map.Entry entry : map2.entrySet()) {
          j51 j51;
          hv0 hv0 = (hv0)entry.getKey();
          BitmapDrawable bitmapDrawable = (BitmapDrawable)entry.getValue();
          Rect rect = (Rect)map1.get(hv0);
          if (qu01.L.contains(hv0)) {
            j51 = new j51(bitmapDrawable, rect);
            j51.h = 0.0F;
            j51.e = qu01.m0;
            j51.d = qu01.n0;
          } else {
            m = qu01.R;
            j51 = new j51((BitmapDrawable)j51, rect);
            j51.g = m * j;
            j51.e = qu01.k0;
            j51.d = qu01.n0;
            j51.l = new g7(qu01, hv0, 26, false);
            qu01.M.add(hv0);
          } 
          qu01.H.b.add(j51);
        } 
        break;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ku0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */