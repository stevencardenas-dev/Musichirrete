import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;

public final class xj extends Property {
  public final int a;
  
  public final Object get(Object paramObject) {
    switch (this.a) {
      default:
        return ((View)paramObject).getClipBounds();
      case 9:
        paramObject = paramObject;
        return Float.valueOf(c42.a.q((View)paramObject));
      case 8:
        return Float.valueOf(((SwitchCompat)paramObject).B);
      case 7:
        return Float.valueOf(((cn0)paramObject).i);
      case 6:
        return Float.valueOf(((an0)paramObject).h);
      case 5:
        return Float.valueOf(((n10)paramObject).b());
      case 4:
        paramObject = paramObject;
        return null;
      case 3:
        paramObject = paramObject;
        return null;
      case 2:
        paramObject = paramObject;
        return null;
      case 1:
        paramObject = paramObject;
        return null;
      case 0:
        break;
    } 
    paramObject = paramObject;
    return null;
  }
  
  public final void set(Object paramObject1, Object paramObject2) {
    float f1;
    float f2;
    Interpolator[] arrayOfInterpolator;
    o70 o70;
    o10 o101;
    o10 o102;
    switch (this.a) {
      default:
        ((View)paramObject1).setClipBounds((Rect)paramObject2);
        return;
      case 9:
        paramObject1 = paramObject1;
        f1 = ((Float)paramObject2).floatValue();
        c42.a.M((View)paramObject1, f1);
        return;
      case 8:
        ((SwitchCompat)paramObject1).setThumbPosition(((Float)paramObject2).floatValue());
        return;
      case 7:
        paramObject1 = paramObject1;
        f1 = ((Float)paramObject2).floatValue();
        ((cn0)paramObject1).i = f1;
        j = (int)(f1 * 1800.0F);
        arrayOfInterpolator = ((cn0)paramObject1).e;
        paramObject2 = ((r6)paramObject1).b;
        for (i = 0; i < paramObject2.size(); i++) {
          o10 o10 = paramObject2.get(i);
          int[] arrayOfInt1 = cn0.l;
          int n = i * 2;
          int m = arrayOfInt1[n];
          int[] arrayOfInt2 = cn0.k;
          int k = arrayOfInt2[n];
          f1 = ui0.h((j - m) / k, 0.0F, 1.0F);
          o10.a = ui0.h(arrayOfInterpolator[n].getInterpolation(f1), 0.0F, 1.0F);
          k = arrayOfInt1[++n];
          m = arrayOfInt2[n];
          f1 = ui0.h((j - k) / m, 0.0F, 1.0F);
          o10.b = ui0.h(arrayOfInterpolator[n].getInterpolation(f1), 0.0F, 1.0F);
        } 
        if (((cn0)paramObject1).h) {
          j = paramObject2.size();
          i = 0;
          while (i < j) {
            arrayOfInterpolator = paramObject2.get(i);
            i++;
            ((o10)arrayOfInterpolator).c = ((cn0)paramObject1).f.e[((cn0)paramObject1).g];
          } 
          ((cn0)paramObject1).h = false;
        } 
        ((sh0)((r6)paramObject1).a).invalidateSelf();
        return;
      case 6:
        paramObject1 = paramObject1;
        f1 = ((Float)paramObject2).floatValue();
        ((an0)paramObject1).h = f1;
        i = (int)(f1 * 333.0F);
        paramObject2 = ((r6)paramObject1).b;
        ((o10)paramObject2.get(0)).a = 0.0F;
        f2 = ui0.h(i / 667.0F, 0.0F, 1.0F);
        o101 = paramObject2.get(0);
        o102 = paramObject2.get(1);
        o70 = ((an0)paramObject1).d;
        f1 = o70.getInterpolation(f2);
        o102.a = f1;
        o101.b = f1;
        o101 = paramObject2.get(1);
        o102 = paramObject2.get(2);
        f1 = o70.getInterpolation(f2 + 0.49925038F);
        o102.a = f1;
        o101.b = f1;
        ((o10)paramObject2.get(2)).b = 1.0F;
        if (((an0)paramObject1).g && ((o10)paramObject2.get(1)).b < 1.0F) {
          ((o10)paramObject2.get(2)).c = ((o10)paramObject2.get(1)).c;
          ((o10)paramObject2.get(1)).c = ((o10)paramObject2.get(0)).c;
          ((o10)paramObject2.get(0)).c = ((an0)paramObject1).e.e[((an0)paramObject1).f];
          ((an0)paramObject1).g = false;
        } 
        ((sh0)((r6)paramObject1).a).invalidateSelf();
        return;
      case 5:
        paramObject1 = paramObject1;
        f1 = ((Float)paramObject2).floatValue();
        if (((n10)paramObject1).k != f1) {
          ((n10)paramObject1).k = f1;
          paramObject1.invalidateSelf();
        } 
        return;
      case 4:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        j = Math.round(((PointF)paramObject2).x);
        i = Math.round(((PointF)paramObject2).y);
        c42.a((View)paramObject1, j, i, paramObject1.getWidth() + j, paramObject1.getHeight() + i);
        return;
      case 3:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        c42.a((View)paramObject1, Math.round(((PointF)paramObject2).x), Math.round(((PointF)paramObject2).y), paramObject1.getRight(), paramObject1.getBottom());
        return;
      case 2:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        c42.a((View)paramObject1, paramObject1.getLeft(), paramObject1.getTop(), Math.round(((PointF)paramObject2).x), Math.round(((PointF)paramObject2).y));
        return;
      case 1:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        paramObject1.getClass();
        ((ak)paramObject1).c = Math.round(((PointF)paramObject2).x);
        i = Math.round(((PointF)paramObject2).y);
        ((ak)paramObject1).d = i;
        j = ((ak)paramObject1).g + 1;
        ((ak)paramObject1).g = j;
        if (((ak)paramObject1).f == j) {
          c42.a(((ak)paramObject1).e, ((ak)paramObject1).a, ((ak)paramObject1).b, ((ak)paramObject1).c, i);
          ((ak)paramObject1).f = 0;
          ((ak)paramObject1).g = 0;
        } 
        return;
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject1.getClass();
    ((ak)paramObject1).a = Math.round(((PointF)paramObject2).x);
    int i = Math.round(((PointF)paramObject2).y);
    ((ak)paramObject1).b = i;
    int j = ((ak)paramObject1).f + 1;
    ((ak)paramObject1).f = j;
    if (j == ((ak)paramObject1).g) {
      c42.a(((ak)paramObject1).e, ((ak)paramObject1).a, i, ((ak)paramObject1).c, ((ak)paramObject1).d);
      ((ak)paramObject1).f = 0;
      ((ak)paramObject1).g = 0;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */