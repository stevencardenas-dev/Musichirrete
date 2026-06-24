package com.google.android.material.progressindicator;

import an0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import cn0;
import java.util.Objects;
import jn0;
import ly;
import n10;
import nd;
import p10;
import q10;
import r6;
import sh0;
import tp;
import zm0;

public class LinearProgressIndicator extends nd {
  public LinearProgressIndicator(Context paramContext) {
    this(paramContext, null);
  }
  
  public LinearProgressIndicator(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969507);
  }
  
  public LinearProgressIndicator(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    cn0 cn0;
    jn0 jn0 = this.b;
    q10 q10 = new q10(jn0);
    ((zm0)q10).f = 300.0F;
    ((zm0)q10).o = new Pair(new p10(), new p10());
    Context context = getContext();
    if (jn0.o == 0) {
      an0 an0 = new an0(jn0);
    } else {
      cn0 = new cn0(context, jn0);
    } 
    n10 n10 = new n10(context, jn0);
    ((sh0)n10).p = (zm0)q10;
    ((sh0)n10).q = (r6)cn0;
    ((r6)cn0).a = n10;
    setIndeterminateDrawable((Drawable)n10);
    setProgressDrawable((Drawable)new ly(getContext(), jn0, (zm0)q10));
    this.k = true;
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    jn0 jn0 = this.b;
    if (jn0 != null && jn0.o == 0 && isIndeterminate())
      return; 
    super.a(paramInt, paramBoolean);
  }
  
  public int getIndeterminateAnimationType() {
    return this.b.o;
  }
  
  public int getIndicatorDirection() {
    return this.b.p;
  }
  
  public int getTrackInnerCornerRadius() {
    return this.b.t;
  }
  
  public Integer getTrackStopIndicatorPadding() {
    return this.b.s;
  }
  
  public int getTrackStopIndicatorSize() {
    return this.b.r;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iload #5
    //   8: invokespecial onLayout : (ZIIII)V
    //   11: aload_0
    //   12: getfield b : Ljn0;
    //   15: astore #7
    //   17: aload #7
    //   19: getfield p : I
    //   22: istore_2
    //   23: iconst_1
    //   24: istore #6
    //   26: iload #6
    //   28: istore_1
    //   29: iload_2
    //   30: iconst_1
    //   31: if_icmpeq -> 78
    //   34: aload_0
    //   35: invokevirtual getLayoutDirection : ()I
    //   38: iconst_1
    //   39: if_icmpne -> 54
    //   42: iload #6
    //   44: istore_1
    //   45: aload #7
    //   47: getfield p : I
    //   50: iconst_2
    //   51: if_icmpeq -> 78
    //   54: aload_0
    //   55: invokevirtual getLayoutDirection : ()I
    //   58: ifne -> 76
    //   61: aload #7
    //   63: getfield p : I
    //   66: iconst_3
    //   67: if_icmpne -> 76
    //   70: iload #6
    //   72: istore_1
    //   73: goto -> 78
    //   76: iconst_0
    //   77: istore_1
    //   78: aload #7
    //   80: iload_1
    //   81: putfield q : Z
    //   84: return
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = getPaddingLeft();
    paramInt1 -= getPaddingRight() + paramInt3;
    paramInt3 = getPaddingTop();
    paramInt2 -= getPaddingBottom() + paramInt3;
    sh0 sh0 = getIndeterminateDrawable();
    if (sh0 != null)
      sh0.setBounds(0, 0, paramInt1, paramInt2); 
    ly ly = getProgressDrawable();
    if (ly != null)
      ly.setBounds(0, 0, paramInt1, paramInt2); 
  }
  
  public void setIndeterminateAnimationType(int paramInt) {
    jn0 jn0 = this.b;
    if (jn0.o == paramInt)
      return; 
    if (!b() || !isIndeterminate()) {
      an0 an0;
      jn0.o = paramInt;
      jn0.d();
      if (paramInt == 0) {
        sh0 sh0 = getIndeterminateDrawable();
        an0 = new an0(jn0);
        sh0.q = (r6)an0;
        ((r6)an0).a = sh0;
      } else {
        sh0 sh0 = getIndeterminateDrawable();
        cn0 cn0 = new cn0(getContext(), (jn0)an0);
        sh0.q = (r6)cn0;
        ((r6)cn0).a = sh0;
      } 
      if (getProgressDrawable() != null && getIndeterminateDrawable() != null)
        (getIndeterminateDrawable()).q.j(this.n); 
      invalidate();
      return;
    } 
    tp.f("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
  }
  
  public void setIndicatorColor(int... paramVarArgs) {
    super.setIndicatorColor(paramVarArgs);
    this.b.d();
  }
  
  public void setIndicatorDirection(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljn0;
    //   4: astore #4
    //   6: aload #4
    //   8: iload_1
    //   9: putfield p : I
    //   12: iconst_1
    //   13: istore_3
    //   14: iload_3
    //   15: istore_2
    //   16: iload_1
    //   17: iconst_1
    //   18: if_icmpeq -> 59
    //   21: aload_0
    //   22: invokevirtual getLayoutDirection : ()I
    //   25: iconst_1
    //   26: if_icmpne -> 40
    //   29: iload_3
    //   30: istore_2
    //   31: aload #4
    //   33: getfield p : I
    //   36: iconst_2
    //   37: if_icmpeq -> 59
    //   40: aload_0
    //   41: invokevirtual getLayoutDirection : ()I
    //   44: ifne -> 57
    //   47: iload_1
    //   48: iconst_3
    //   49: if_icmpne -> 57
    //   52: iload_3
    //   53: istore_2
    //   54: goto -> 59
    //   57: iconst_0
    //   58: istore_2
    //   59: aload #4
    //   61: iload_2
    //   62: putfield q : Z
    //   65: aload_0
    //   66: invokevirtual invalidate : ()V
    //   69: return
  }
  
  public void setTrackCornerRadius(int paramInt) {
    super.setTrackCornerRadius(paramInt);
    this.b.d();
    invalidate();
  }
  
  public void setTrackInnerCornerRadius(int paramInt) {
    jn0 jn0 = this.b;
    if (jn0.t != paramInt) {
      jn0.t = Math.round(Math.min(paramInt, jn0.a / 2.0F));
      jn0.v = false;
      jn0.w = true;
      jn0.d();
      invalidate();
    } 
  }
  
  public void setTrackInnerCornerRadiusFraction(float paramFloat) {
    jn0 jn0 = this.b;
    if (jn0.u != paramFloat) {
      jn0.u = Math.min(paramFloat, 0.5F);
      jn0.v = true;
      jn0.w = true;
      jn0.d();
      invalidate();
    } 
  }
  
  public void setTrackStopIndicatorPadding(Integer paramInteger) {
    jn0 jn0 = this.b;
    if (!Objects.equals(jn0.s, paramInteger)) {
      jn0.s = paramInteger;
      invalidate();
    } 
  }
  
  public void setTrackStopIndicatorSize(int paramInt) {
    jn0 jn0 = this.b;
    if (jn0.r != paramInt) {
      jn0.r = Math.min(paramInt, jn0.a);
      jn0.d();
      invalidate();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\progressindicator\LinearProgressIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */