package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import g7;
import j51;
import java.util.ArrayList;
import java.util.Iterator;
import qu0;
import x41;

public final class OverlayListView extends ListView {
  public final ArrayList b = new ArrayList();
  
  public OverlayListView(Context paramContext) {
    super(paramContext);
  }
  
  public OverlayListView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public OverlayListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    ArrayList arrayList = this.b;
    if (arrayList.size() > 0) {
      Iterator<j51> iterator = arrayList.iterator();
      while (iterator.hasNext()) {
        int i;
        j51 j51 = iterator.next();
        BitmapDrawable bitmapDrawable = j51.a;
        if (bitmapDrawable != null)
          bitmapDrawable.draw(paramCanvas); 
        long l = getDrawingTime();
        bitmapDrawable = j51.a;
        Rect rect = j51.c;
        if (j51.k) {
          i = 0;
        } else {
          float f2 = Math.min(1.0F, (float)(l - j51.i) / (float)j51.e);
          float f1 = 0.0F;
          f2 = Math.max(0.0F, f2);
          if (j51.j)
            f1 = f2; 
          Interpolator interpolator = j51.d;
          if (interpolator == null) {
            f2 = f1;
          } else {
            f2 = interpolator.getInterpolation(f1);
          } 
          i = (int)(j51.g * f2);
          Rect rect1 = j51.f;
          rect1.top += i;
          rect1.bottom += i;
          f2 = x41.e(j51.h, 1.0F, f2, 1.0F);
          j51.b = f2;
          if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int)(f2 * 255.0F));
            bitmapDrawable.setBounds(rect);
          } 
          if (j51.j && f1 >= 1.0F) {
            j51.k = true;
            g7 g7 = j51.l;
            if (g7 != null) {
              qu0 qu0 = (qu0)g7.e;
              qu0.M.remove(g7.c);
              qu0.I.notifyDataSetChanged();
            } 
          } 
          i = j51.k ^ true;
        } 
        if (i == 0)
          iterator.remove(); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\mediarouter\app\OverlayListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */