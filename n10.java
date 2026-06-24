import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

public abstract class n10 extends Drawable implements Animatable {
  public static final xj o = new xj(Float.class, "growFraction", 5);
  
  public final Context b;
  
  public final jn0 c;
  
  public h5 e;
  
  public ObjectAnimator f;
  
  public ObjectAnimator g;
  
  public final float h = -1.0F;
  
  public ArrayList i;
  
  public boolean j;
  
  public float k;
  
  public final Paint l = new Paint();
  
  public int m;
  
  public final Rect n;
  
  public n10(Context paramContext, jn0 paramjn0) {
    this.b = paramContext;
    this.c = paramjn0;
    this.n = new Rect();
    this.e = (h5)new Object();
    setAlpha(255);
  }
  
  public final float b() {
    jn0 jn01 = this.c;
    return (jn01.g != 0 || jn01.h != 0) ? this.k : 1.0F;
  }
  
  public final float c() {
    float f = this.h;
    if (f > 0.0F)
      return f; 
    boolean bool = this instanceof ly;
    jn0 jn01 = this.c;
    if (jn01.c(bool) && jn01.m != 0) {
      h5 h51 = this.e;
      ContentResolver contentResolver = this.b.getContentResolver();
      h51.getClass();
      f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0F);
      if (f > 0.0F) {
        if (bool) {
          i = jn01.j;
        } else {
          i = jn01.k;
        } 
        int i = (int)(i * 1000.0F / jn01.m * f);
        float f1 = (float)(SystemClock.uptimeMillis() % i) / i;
        f = f1;
        if (f1 < 0.0F)
          f = f1 % 1.0F + 1.0F; 
        return f;
      } 
    } 
    return 0.0F;
  }
  
  public final boolean d(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    h5 h51 = this.e;
    ContentResolver contentResolver = this.b.getContentResolver();
    h51.getClass();
    float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0F);
    if (paramBoolean3 && f > 0.0F) {
      paramBoolean3 = true;
    } else {
      paramBoolean3 = false;
    } 
    return e(paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    ObjectAnimator objectAnimator = this.f;
    xj xj1 = o;
    if (objectAnimator == null) {
      objectAnimator = ObjectAnimator.ofFloat(this, xj1, new float[] { 0.0F, 1.0F });
      this.f = objectAnimator;
      objectAnimator.setDuration(500L);
      this.f.setInterpolator((TimeInterpolator)g5.b);
      objectAnimator = this.f;
      if (objectAnimator == null || !objectAnimator.isRunning()) {
        this.f = objectAnimator;
        objectAnimator.addListener((Animator.AnimatorListener)new m10(this, 0));
      } else {
        l0.l("Cannot set showAnimator while the current showAnimator is running.");
        return false;
      } 
    } 
    if (this.g == null) {
      ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, xj1, new float[] { 1.0F, 0.0F });
      this.g = objectAnimator1;
      objectAnimator1.setDuration(500L);
      this.g.setInterpolator((TimeInterpolator)g5.b);
      objectAnimator1 = this.g;
      if (objectAnimator1 == null || !objectAnimator1.isRunning()) {
        this.g = objectAnimator1;
        objectAnimator1.addListener((Animator.AnimatorListener)new m10(this, 1));
      } else {
        l0.l("Cannot set hideAnimator while the current hideAnimator is running.");
        return false;
      } 
    } 
    if (isVisible() || paramBoolean1) {
      ObjectAnimator objectAnimator1;
      if (paramBoolean1) {
        objectAnimator1 = this.f;
      } else {
        objectAnimator1 = this.g;
      } 
      if (paramBoolean1) {
        objectAnimator = this.g;
      } else {
        objectAnimator = this.f;
      } 
      if (!paramBoolean3) {
        if (objectAnimator.isRunning()) {
          paramBoolean2 = this.j;
          this.j = true;
          (new ValueAnimator[1])[0] = (ValueAnimator)objectAnimator;
          (new ValueAnimator[1])[0].cancel();
          this.j = paramBoolean2;
        } 
        if (objectAnimator1.isRunning()) {
          objectAnimator1.end();
        } else {
          paramBoolean2 = this.j;
          this.j = true;
          (new ValueAnimator[1])[0] = (ValueAnimator)objectAnimator1;
          (new ValueAnimator[1])[0].end();
          this.j = paramBoolean2;
        } 
        return super.setVisible(paramBoolean1, false);
      } 
      if (!objectAnimator1.isRunning()) {
        if (!paramBoolean1 || super.setVisible(paramBoolean1, false)) {
          paramBoolean3 = true;
        } else {
          paramBoolean3 = false;
        } 
        jn0 jn01 = this.c;
        if (paramBoolean1 ? (jn01.g != 0) : (jn01.h != 0)) {
          if (paramBoolean2 || !objectAnimator1.isPaused()) {
            objectAnimator1.start();
            return paramBoolean3;
          } 
          objectAnimator1.resume();
          return paramBoolean3;
        } 
        paramBoolean1 = this.j;
        this.j = true;
        (new ValueAnimator[1])[0] = (ValueAnimator)objectAnimator1;
        (new ValueAnimator[1])[0].end();
        this.j = paramBoolean1;
        return paramBoolean3;
      } 
    } 
    return false;
  }
  
  public final void f(md parammd) {
    ArrayList arrayList = this.i;
    if (arrayList != null && arrayList.contains(parammd)) {
      this.i.remove(parammd);
      if (this.i.isEmpty())
        this.i = null; 
    } 
  }
  
  public final int getAlpha() {
    return this.m;
  }
  
  public final int getOpacity() {
    return -3;
  }
  
  public final boolean isRunning() {
    ObjectAnimator objectAnimator = this.f;
    if (objectAnimator == null || !objectAnimator.isRunning()) {
      objectAnimator = this.g;
      if (objectAnimator == null || !objectAnimator.isRunning())
        return false; 
    } 
    return true;
  }
  
  public final void setAlpha(int paramInt) {
    this.m = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    this.l.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return d(paramBoolean1, paramBoolean2, true);
  }
  
  public final void start() {
    e(true, true, false);
  }
  
  public final void stop() {
    e(false, true, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */