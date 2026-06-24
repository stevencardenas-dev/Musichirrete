import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class b5 extends n12 implements Animatable {
  public final z4 c;
  
  public final Context e;
  
  public j1 f = null;
  
  public ArrayList g = null;
  
  public final y4 h = new y4(this);
  
  public b5(Context paramContext) {
    this.e = paramContext;
    this.c = (z4)new Drawable.ConstantState();
  }
  
  public final void applyTheme(Resources.Theme paramTheme) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.applyTheme(paramTheme); 
  }
  
  public final boolean canApplyTheme() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.canApplyTheme() : false;
  }
  
  public final void draw(Canvas paramCanvas) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    z4 z41 = this.c;
    z41.a.draw(paramCanvas);
    if (z41.b.isStarted())
      invalidateSelf(); 
  }
  
  public final int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getAlpha() : this.c.a.getAlpha();
  }
  
  public final int getChangingConfigurations() {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.getChangingConfigurations(); 
    int i = super.getChangingConfigurations();
    this.c.getClass();
    return i;
  }
  
  public final ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getColorFilter() : this.c.a.getColorFilter();
  }
  
  public final Drawable.ConstantState getConstantState() {
    return (this.b != null) ? new a5(this.b.getConstantState()) : null;
  }
  
  public final int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : this.c.a.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : this.c.a.getIntrinsicWidth();
  }
  
  public final int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : this.c.a.getOpacity();
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    z4 z41;
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while (true) {
      z41 = this.c;
      if (i != 1 && (paramXmlPullParser.getDepth() >= j + 1 || i != 3)) {
        if (i == 2) {
          w12 w12;
          String str = paramXmlPullParser.getName();
          if ("animated-vector".equals(str)) {
            TypedArray typedArray = dd1.b0(paramResources, paramTheme, paramAttributeSet, z51.e);
            i = typedArray.getResourceId(0, 0);
            if (i != 0) {
              w12 = new w12();
              ThreadLocal threadLocal = lg1.a;
              w12.b = paramResources.getDrawable(i, paramTheme);
              new v12(w12.b.getConstantState());
              w12.h = false;
              w12.setCallback(this.h);
              w12 w121 = z41.a;
              if (w121 != null)
                w121.setCallback(null); 
              z41.a = w12;
            } 
            typedArray.recycle();
          } else if (ckOPp.giUVpjOKtXSYK.equals(w12)) {
            TypedArray typedArray = paramResources.obtainAttributes(paramAttributeSet, z51.f);
            String str1 = typedArray.getString(0);
            i = typedArray.getResourceId(1, 0);
            if (i != 0) {
              Context context = this.e;
              if (context != null) {
                Animator animator = AnimatorInflater.loadAnimator(context, i);
                animator.setTarget(z41.a.c.b.o.get(str1));
                if (z41.c == null) {
                  z41.c = new ArrayList();
                  z41.d = (b9)new zm1(0);
                } 
                z41.c.add(animator);
                z41.d.put(animator, str1);
              } else {
                typedArray.recycle();
                tp.f("Context can't be null when inflating animators");
                return;
              } 
            } 
            typedArray.recycle();
          } 
        } 
        i = paramXmlPullParser.next();
        continue;
      } 
      break;
    } 
    if (z41.b == null)
      z41.b = new AnimatorSet(); 
    z41.b.playTogether(z41.c);
  }
  
  public final boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isAutoMirrored() : this.c.a.isAutoMirrored();
  }
  
  public final boolean isRunning() {
    Drawable drawable = this.b;
    return (drawable != null) ? ((AnimatedVectorDrawable)drawable).isRunning() : this.c.b.isRunning();
  }
  
  public final boolean isStateful() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isStateful() : this.c.a.isStateful();
  }
  
  public final Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.mutate(); 
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setBounds(paramRect);
      return;
    } 
    this.c.a.setBounds(paramRect);
  }
  
  public final boolean onLevelChange(int paramInt) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setLevel(paramInt) : this.c.a.setLevel(paramInt);
  }
  
  public final boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : this.c.a.setState(paramArrayOfint);
  }
  
  public final void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    this.c.a.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAutoMirrored(paramBoolean);
      return;
    } 
    this.c.a.setAutoMirrored(paramBoolean);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.c.a.setColorFilter(paramColorFilter);
  }
  
  public final void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTint(paramInt);
      return;
    } 
    this.c.a.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTintList(paramColorStateList);
      return;
    } 
    this.c.a.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTintMode(paramMode);
      return;
    } 
    this.c.a.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.setVisible(paramBoolean1, paramBoolean2); 
    this.c.a.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void start() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).start();
      return;
    } 
    z4 z41 = this.c;
    if (z41.b.isStarted())
      return; 
    z41.b.start();
    invalidateSelf();
  }
  
  public final void stop() {
    Drawable drawable = this.b;
    if (drawable != null) {
      ((AnimatedVectorDrawable)drawable).stop();
      return;
    } 
    this.c.b.end();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */