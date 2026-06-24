import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

public final class sh0 extends n10 {
  public zm0 p;
  
  public r6 q;
  
  public final void draw(Canvas paramCanvas) {
    if (!getBounds().isEmpty() && isVisible() && paramCanvas.getClipBounds(this.n)) {
      boolean bool1;
      boolean bool2;
      if (this.e != null)
        Settings.Global.getFloat(this.b.getContentResolver(), "animator_duration_scale", 1.0F); 
      paramCanvas.save();
      zm0 zm01 = this.p;
      Rect rect = getBounds();
      float f = b();
      ObjectAnimator objectAnimator = this.f;
      if (objectAnimator == null || !objectAnimator.isRunning()) {
        bool = false;
      } else {
        bool = true;
      } 
      objectAnimator = this.g;
      if (objectAnimator == null || !objectAnimator.isRunning()) {
        bool2 = false;
      } else {
        bool2 = true;
      } 
      zm01.c(paramCanvas, rect, f, bool, bool2);
      jn0 jn0 = this.c;
      int i = jn0.i;
      int j = this.m;
      boolean bool = jn0 instanceof jn0;
      if (bool && i == 0 && !jn0.c(false)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      Paint paint = this.l;
      if (bool1) {
        this.p.g(paramCanvas, paint, 0.0F, 1.0F, jn0.f, j, 0);
      } else if (bool) {
        o10 o101 = ((ArrayList<o10>)this.q.b).get(0);
        ArrayList<o10> arrayList = (ArrayList)this.q.b;
        o10 o102 = arrayList.get(arrayList.size() - 1);
        zm0 zm02 = this.p;
        if (zm02 != null) {
          zm02.g(paramCanvas, paint, 0.0F, o101.a, jn0.f, j, i);
          this.p.g(paramCanvas, paint, o102.b, 1.0F, jn0.f, j, i);
        } else {
          paramCanvas.save();
          o102.getClass();
          paramCanvas.rotate(0.0F);
          this.p.g(paramCanvas, paint, o102.b, o101.a + 1.0F, jn0.f, j, i);
          paramCanvas.restore();
        } 
      } 
      for (byte b = 0; b < ((ArrayList)this.q.b).size(); b++) {
        o10 o10 = ((ArrayList<o10>)this.q.b).get(b);
        o10.f = c();
        zm0 zm02 = this.p;
        int k = this.m;
        zm02.getClass();
        int m = m92.l(o10.c, k);
        zm02.m = o10.g;
        float f1 = o10.a;
        f = o10.b;
        k = o10.d;
        zm02.e(paramCanvas, paint, f1, f, m, k, k, o10.e, o10.f, true);
        if (b > 0 && !bool1 && bool) {
          o10 o101 = ((ArrayList<o10>)this.q.b).get(b - 1);
          this.p.g(paramCanvas, paint, o101.b, o10.a, jn0.f, j, i);
        } 
      } 
      paramCanvas.restore();
    } 
  }
  
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    paramBoolean2 = super.e(paramBoolean1, paramBoolean2, paramBoolean3);
    if (this.e != null)
      Settings.Global.getFloat(this.b.getContentResolver(), "animator_duration_scale", 1.0F); 
    if (!isRunning())
      this.q.c(); 
    if (paramBoolean1 && paramBoolean3)
      this.q.m(); 
    return paramBoolean2;
  }
  
  public final int getIntrinsicHeight() {
    return this.p.a();
  }
  
  public final int getIntrinsicWidth() {
    this.p.getClass();
    return -1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */