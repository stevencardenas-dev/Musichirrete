import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class nd extends ProgressBar {
  public final jn0 b;
  
  public int c;
  
  public boolean e;
  
  public final boolean f;
  
  public final int g;
  
  public h5 h;
  
  public boolean i;
  
  public int j;
  
  public boolean k;
  
  public final ld l;
  
  public final ld m;
  
  public final md n;
  
  public final md o;
  
  public nd(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952919), paramAttributeSet, paramInt);
    boolean bool;
    this.i = false;
    this.j = 4;
    this.l = new ld(this, 0);
    this.m = new ld(this, 1);
    this.n = new md((View)this, 0);
    this.o = new md((View)this, 1);
    paramContext = getContext();
    Object object = new Object();
    ((jn0)object).e = new int[0];
    int i = paramContext.getResources().getDimensionPixelSize(2131166275);
    g92.m(paramContext, paramAttributeSet, 2130969507, 2131952882);
    int[] arrayOfInt1 = zb1.d;
    g92.o(paramContext, paramAttributeSet, arrayOfInt1, 2130969507, 2131952882, new int[0]);
    TypedArray typedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt1, 2130969507, 2131952882);
    ((jn0)object).a = wf2.w(paramContext, typedArray2, 10, i);
    TypedValue typedValue2 = typedArray2.peekValue(9);
    if (typedValue2 != null) {
      i = typedValue2.type;
      if (i == 5) {
        ((jn0)object).b = Math.min(TypedValue.complexToDimensionPixelSize(typedValue2.data, typedArray2.getResources().getDisplayMetrics()), ((jn0)object).a / 2);
        ((jn0)object).d = false;
      } else if (i == 6) {
        ((jn0)object).c = Math.min(typedValue2.getFraction(1.0F, 1.0F), 0.5F);
        ((jn0)object).d = true;
      } 
    } 
    ((jn0)object).g = typedArray2.getInt(6, 0);
    ((jn0)object).h = typedArray2.getInt(1, 0);
    ((jn0)object).i = typedArray2.getDimensionPixelSize(4, 0);
    i = Math.abs(typedArray2.getDimensionPixelSize(13, 0));
    ((jn0)object).j = Math.abs(typedArray2.getDimensionPixelSize(14, i));
    ((jn0)object).k = Math.abs(typedArray2.getDimensionPixelSize(15, i));
    ((jn0)object).l = Math.abs(typedArray2.getDimensionPixelSize(11, 0));
    ((jn0)object).m = typedArray2.getDimensionPixelSize(12, 0);
    ((jn0)object).n = typedArray2.getFloat(2, 1.0F);
    if (!typedArray2.hasValue(3)) {
      ((jn0)object).e = new int[] { m92.w(paramContext, 2130968930, -1) };
    } else if ((typedArray2.peekValue(3)).type != 1) {
      ((jn0)object).e = new int[] { typedArray2.getColor(3, -1) };
    } else {
      int[] arrayOfInt = paramContext.getResources().getIntArray(typedArray2.getResourceId(3, -1));
      ((jn0)object).e = arrayOfInt;
      if (arrayOfInt.length == 0) {
        l0.l("indicatorColors cannot be empty when indicatorColor is not used.");
        throw null;
      } 
    } 
    if (typedArray2.hasValue(8)) {
      ((jn0)object).f = typedArray2.getColor(8, -1);
    } else {
      ((jn0)object).f = ((jn0)object).e[0];
      TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(new int[] { 16842803 });
      float f = typedArray.getFloat(0, 0.2F);
      typedArray.recycle();
      i = (int)(f * 255.0F);
      ((jn0)object).f = m92.l(((jn0)object).f, i);
    } 
    typedArray2.recycle();
    g92.m(paramContext, paramAttributeSet, 2130969507, 2131952882);
    int[] arrayOfInt2 = zb1.l;
    g92.o(paramContext, paramAttributeSet, arrayOfInt2, 2130969507, 2131952882, new int[0]);
    TypedArray typedArray3 = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt2, 2130969507, 2131952882);
    ((jn0)object).o = typedArray3.getInt(0, 1);
    ((jn0)object).p = typedArray3.getInt(1, 0);
    ((jn0)object).r = Math.min(typedArray3.getDimensionPixelSize(4, 0), ((jn0)object).a);
    if (typedArray3.hasValue(3))
      ((jn0)object).s = Integer.valueOf(typedArray3.getDimensionPixelSize(3, 0)); 
    TypedValue typedValue1 = typedArray3.peekValue(2);
    if (typedValue1 != null) {
      i = typedValue1.type;
      if (i == 5) {
        ((jn0)object).t = Math.min(TypedValue.complexToDimensionPixelSize(typedValue1.data, typedArray3.getResources().getDisplayMetrics()), ((jn0)object).a / 2);
        ((jn0)object).v = false;
        ((jn0)object).w = true;
      } else if (i == 6) {
        ((jn0)object).u = Math.min(typedValue1.getFraction(1.0F, 1.0F), 0.5F);
        ((jn0)object).v = true;
        ((jn0)object).w = true;
      } 
    } 
    typedArray3.recycle();
    object.d();
    if (((jn0)object).p == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    ((jn0)object).q = bool;
    this.b = (jn0)object;
    g92.m(paramContext, paramAttributeSet, paramInt, 2131952882);
    g92.o(paramContext, paramAttributeSet, arrayOfInt1, paramInt, 2131952882, new int[0]);
    TypedArray typedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt1, paramInt, 2131952882);
    typedArray1.getInt(7, -1);
    this.g = Math.min(typedArray1.getInt(5, -1), 1000);
    typedArray1.recycle();
    this.h = (h5)new Object();
    this.f = true;
  }
  
  private q10 getCurrentDrawingDelegate() {
    if (isIndeterminate()) {
      if (getIndeterminateDrawable() != null)
        return (getIndeterminateDrawable()).p; 
    } else if (getProgressDrawable() != null) {
      return (getProgressDrawable()).p;
    } 
    return null;
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    if (isIndeterminate()) {
      if (getProgressDrawable() != null) {
        this.c = paramInt;
        this.e = paramBoolean;
        this.i = true;
        if (getIndeterminateDrawable().isVisible()) {
          h5 h51 = this.h;
          ContentResolver contentResolver = getContext().getContentResolver();
          h51.getClass();
          if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0F) != 0.0F) {
            (getIndeterminateDrawable()).q.k();
            return;
          } 
        } 
        this.n.a(getIndeterminateDrawable());
        return;
      } 
    } else {
      super.setProgress(paramInt);
      if (getProgressDrawable() != null && !paramBoolean)
        getProgressDrawable().jumpToCurrentState(); 
    } 
  }
  
  public final boolean b() {
    if (isAttachedToWindow() && getWindowVisibility() == 0) {
      nd nd1 = this;
      while (nd1.getVisibility() == 0) {
        ViewParent viewParent = nd1.getParent();
        if (viewParent == null) {
          if (getWindowVisibility() == 0)
            return true; 
          break;
        } 
        if (!(viewParent instanceof View))
          return true; 
        View view = (View)viewParent;
      } 
    } 
    return false;
  }
  
  public Drawable getCurrentDrawable() {
    return (Drawable)(isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable());
  }
  
  public int getHideAnimationBehavior() {
    return this.b.h;
  }
  
  public sh0 getIndeterminateDrawable() {
    return (sh0)super.getIndeterminateDrawable();
  }
  
  public int[] getIndicatorColor() {
    return this.b.e;
  }
  
  public int getIndicatorTrackGapSize() {
    return this.b.i;
  }
  
  public ly getProgressDrawable() {
    return (ly)super.getProgressDrawable();
  }
  
  public int getShowAnimationBehavior() {
    return this.b.g;
  }
  
  public int getTrackColor() {
    return this.b.f;
  }
  
  public int getTrackCornerRadius() {
    return this.b.b;
  }
  
  public float getTrackCornerRadiusFraction() {
    return this.b.c;
  }
  
  public int getTrackThickness() {
    return this.b.a;
  }
  
  public int getWaveAmplitude() {
    return this.b.l;
  }
  
  public int getWaveSpeed() {
    return this.b.m;
  }
  
  public int getWavelengthDeterminate() {
    return this.b.j;
  }
  
  public int getWavelengthIndeterminate() {
    return this.b.k;
  }
  
  public final void invalidate() {
    super.invalidate();
    if (getCurrentDrawable() != null)
      getCurrentDrawable().invalidateSelf(); 
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (getProgressDrawable() != null && getIndeterminateDrawable() != null)
      (getIndeterminateDrawable()).q.j(this.n); 
    ly ly = getProgressDrawable();
    md md1 = this.o;
    if (ly != null) {
      ly = getProgressDrawable();
      if (ly.i == null)
        ly.i = new ArrayList(); 
      if (!ly.i.contains(md1))
        ly.i.add(md1); 
    } 
    if (getIndeterminateDrawable() != null) {
      sh0 sh0 = getIndeterminateDrawable();
      if (sh0.i == null)
        sh0.i = new ArrayList(); 
      if (!sh0.i.contains(md1))
        sh0.i.add(md1); 
    } 
    if (b()) {
      if (this.g > 0)
        SystemClock.uptimeMillis(); 
      setVisibility(0);
    } 
  }
  
  public final void onDetachedFromWindow() {
    removeCallbacks(this.m);
    removeCallbacks(this.l);
    ((n10)getCurrentDrawable()).d(false, false, false);
    sh0 sh0 = getIndeterminateDrawable();
    md md1 = this.o;
    if (sh0 != null) {
      getIndeterminateDrawable().f(md1);
      (getIndeterminateDrawable()).q.n();
    } 
    if (getProgressDrawable() != null)
      getProgressDrawable().f(md1); 
    super.onDetachedFromWindow();
  }
  
  public final void onDraw(Canvas paramCanvas) {
    int i;
    /* monitor enter ThisExpression{ObjectType{nd}} */
    try {
      i = paramCanvas.save();
      if (getPaddingLeft() != 0 || getPaddingTop() != 0)
        paramCanvas.translate(getPaddingLeft(), getPaddingTop()); 
    } finally {}
    if (getPaddingRight() != 0 || getPaddingBottom() != 0)
      paramCanvas.clipRect(0, 0, getWidth() - getPaddingLeft() + getPaddingRight(), getHeight() - getPaddingTop() + getPaddingBottom()); 
    getCurrentDrawable().draw(paramCanvas);
    paramCanvas.restoreToCount(i);
    /* monitor exit ThisExpression{ObjectType{nd}} */
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    getCurrentDrawingDelegate().b();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i;
    /* monitor enter ThisExpression{ObjectType{nd}} */
    try {
      q10 q10 = getCurrentDrawingDelegate();
      if (q10 == null) {
        /* monitor exit ThisExpression{ObjectType{nd}} */
        return;
      } 
      i = View.getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
      if (q10.a() < 0) {
        paramInt1 = View.getDefaultSize(getSuggestedMinimumHeight(), paramInt2);
      } else {
        paramInt1 = q10.a() + getPaddingTop() + getPaddingBottom();
      } 
    } finally {
      Exception exception;
    } 
    setMeasuredDimension(i, paramInt1);
    /* monitor exit ThisExpression{ObjectType{nd}} */
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
    boolean bool;
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!this.f)
      return; 
    ((n10)getCurrentDrawable()).d(b(), false, bool);
  }
  
  public final void onWindowVisibilityChanged(int paramInt) {
    super.onWindowVisibilityChanged(paramInt);
    if (!this.f)
      return; 
    ((n10)getCurrentDrawable()).d(b(), false, false);
  }
  
  public void setAnimatorDurationScaleProvider(h5 paramh5) {
    this.h = paramh5;
    if (getProgressDrawable() != null)
      (getProgressDrawable()).e = paramh5; 
    if (getIndeterminateDrawable() != null)
      (getIndeterminateDrawable()).e = paramh5; 
  }
  
  public void setHideAnimationBehavior(int paramInt) {
    this.b.h = paramInt;
    invalidate();
  }
  
  public void setIndeterminate(boolean paramBoolean) {
    /* monitor enter ThisExpression{ObjectType{nd}} */
    try {
      boolean bool = isIndeterminate();
      if (paramBoolean == bool) {
        /* monitor exit ThisExpression{ObjectType{nd}} */
        return;
      } 
      n10 n101 = (n10)getCurrentDrawable();
      if (n101 != null)
        n101.d(false, false, false); 
    } finally {
      Exception exception;
    } 
    super.setIndeterminate(paramBoolean);
    n10 n10 = (n10)getCurrentDrawable();
    if (n10 != null)
      n10.d(b(), false, false); 
    if (n10 instanceof sh0 && b())
      ((sh0)n10).q.m(); 
    this.i = false;
    /* monitor exit ThisExpression{ObjectType{nd}} */
  }
  
  public void setIndeterminateAnimatorDurationScale(float paramFloat) {
    jn0 jn01 = this.b;
    if (jn01.n != paramFloat) {
      jn01.n = paramFloat;
      (getIndeterminateDrawable()).q.h();
    } 
  }
  
  public void setIndeterminateDrawable(Drawable paramDrawable) {
    if (paramDrawable instanceof sh0) {
      ((n10)paramDrawable).d(false, false, false);
      super.setIndeterminateDrawable(paramDrawable);
      return;
    } 
    if (!this.k) {
      super.setIndeterminateDrawable(paramDrawable);
      return;
    } 
    l0.l("Cannot set framework drawable as indeterminate drawable.");
  }
  
  public void setIndicatorColor(int... paramVarArgs) {
    int[] arrayOfInt = paramVarArgs;
    if (paramVarArgs.length == 0) {
      arrayOfInt = new int[1];
      arrayOfInt[0] = m92.w(getContext(), 2130968930, -1);
    } 
    if (!Arrays.equals(getIndicatorColor(), arrayOfInt)) {
      this.b.e = arrayOfInt;
      (getIndeterminateDrawable()).q.h();
      invalidate();
    } 
  }
  
  public void setIndicatorTrackGapSize(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.i != paramInt) {
      jn01.i = paramInt;
      jn01.d();
      invalidate();
    } 
  }
  
  public void setProgress(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isIndeterminate : ()Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iload_1
    //   16: iconst_0
    //   17: invokevirtual a : (IZ)V
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: astore_3
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_3
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	23	finally
    //   14	20	23	finally
    //   24	26	23	finally
  }
  
  public void setProgressDrawable(Drawable paramDrawable) {
    if (paramDrawable instanceof ly) {
      paramDrawable = paramDrawable;
      paramDrawable.d(false, false, false);
      super.setProgressDrawable(paramDrawable);
      paramDrawable.setLevel((int)(getProgress() / getMax() * 10000.0F));
      return;
    } 
    if (!this.k) {
      super.setProgressDrawable(paramDrawable);
      return;
    } 
    l0.l("Cannot set framework drawable as progress drawable.");
  }
  
  public void setShowAnimationBehavior(int paramInt) {
    this.b.g = paramInt;
    invalidate();
  }
  
  public void setTrackColor(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.f != paramInt) {
      jn01.f = paramInt;
      invalidate();
    } 
  }
  
  public void setTrackCornerRadius(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.b != paramInt) {
      jn01.b = Math.min(paramInt, jn01.a / 2);
      jn01.d = false;
      invalidate();
    } 
  }
  
  public void setTrackCornerRadiusFraction(float paramFloat) {
    jn0 jn01 = this.b;
    if (jn01.c != paramFloat) {
      jn01.c = Math.min(paramFloat, 0.5F);
      jn01.d = true;
      invalidate();
    } 
  }
  
  public void setTrackThickness(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.a != paramInt) {
      jn01.a = paramInt;
      requestLayout();
    } 
  }
  
  public void setVisibilityAfterHide(int paramInt) {
    if (paramInt == 0 || paramInt == 4 || paramInt == 8) {
      this.j = paramInt;
      return;
    } 
    l0.l("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
  }
  
  public void setWaveAmplitude(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.l != paramInt) {
      jn01.l = Math.abs(paramInt);
      requestLayout();
    } 
  }
  
  public void setWaveSpeed(int paramInt) {
    jn0 jn01 = this.b;
    jn01.m = paramInt;
    ly ly = getProgressDrawable();
    if (jn01.m != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    ValueAnimator valueAnimator = ly.v;
    if (paramInt != 0 && !valueAnimator.isRunning()) {
      valueAnimator.start();
      return;
    } 
    if (paramInt == 0 && valueAnimator.isRunning())
      valueAnimator.cancel(); 
  }
  
  public void setWavelength(int paramInt) {
    setWavelengthDeterminate(paramInt);
    setWavelengthIndeterminate(paramInt);
  }
  
  public void setWavelengthDeterminate(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.j != paramInt) {
      jn01.j = Math.abs(paramInt);
      if (!isIndeterminate())
        requestLayout(); 
    } 
  }
  
  public void setWavelengthIndeterminate(int paramInt) {
    jn0 jn01 = this.b;
    if (jn01.k != paramInt) {
      jn01.k = Math.abs(paramInt);
      if (isIndeterminate())
        requestLayout(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */