package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import fb0;
import fy0;
import g5;
import g7;
import g92;
import gy0;
import h70;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import is;
import java.util.ArrayList;
import tp;
import uk;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
  public final Rect c = new Rect();
  
  public final RectF d = new RectF();
  
  public final RectF e = new RectF();
  
  public final int[] f = new int[2];
  
  public float g;
  
  public float h;
  
  public FabTransformationBehavior() {}
  
  public FabTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public static float B(g7 paramg7, gy0 paramgy0, float paramFloat) {
    long l2 = paramgy0.a;
    long l1 = paramgy0.b;
    gy0 gy01 = ((fy0)paramg7.c).c("expansion");
    float f = (float)(gy01.a + gy01.b + 17L - l2) / (float)l1;
    return g5.a(paramFloat, 0.0F, paramgy0.b().getInterpolation(f));
  }
  
  public static Pair y(float paramFloat1, float paramFloat2, boolean paramBoolean, g7 paramg7) {
    if (paramFloat1 != 0.0F) {
      gy0 gy0;
      int i = paramFloat2 cmp 0.0F;
      if (i == 0) {
        gy0 gy04 = ((fy0)paramg7.c).c("translationXLinear");
        gy0 = ((fy0)paramg7.c).c("translationYLinear");
        gy01 = gy04;
        return new Pair(gy01, gy0);
      } 
      if ((paramBoolean && paramFloat2 < 0.0F) || (!paramBoolean && i > 0)) {
        gy0 gy04 = ((fy0)((g7)gy01).c).c("translationXCurveUpwards");
        gy0 = ((fy0)((g7)gy01).c).c("translationYCurveUpwards");
        gy01 = gy04;
      } else {
        gy0 gy04 = ((fy0)((g7)gy01).c).c("translationXCurveDownwards");
        gy0 = ((fy0)((g7)gy01).c).c("translationYCurveDownwards");
        gy01 = gy04;
      } 
      return new Pair(gy01, gy0);
    } 
    gy0 gy03 = ((fy0)((g7)gy01).c).c("translationXLinear");
    gy0 gy02 = ((fy0)((g7)gy01).c).c("translationYLinear");
    gy0 gy01 = gy03;
    return new Pair(gy01, gy02);
  }
  
  public final float A(View paramView1, View paramView2, fb0 paramfb0) {
    RectF rectF2 = this.d;
    C(paramView1, rectF2);
    rectF2.offset(this.g, this.h);
    RectF rectF1 = this.e;
    C(paramView2, rectF1);
    paramfb0.getClass();
    return rectF1.centerY() - rectF2.centerY() + 0.0F;
  }
  
  public final void C(View paramView, RectF paramRectF) {
    paramRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    int[] arrayOfInt = this.f;
    paramView.getLocationInWindow(arrayOfInt);
    paramRectF.offsetTo(arrayOfInt[0], arrayOfInt[1]);
    paramRectF.offset((int)-paramView.getTranslationX(), (int)-paramView.getTranslationY());
  }
  
  public abstract g7 D(Context paramContext, boolean paramBoolean);
  
  public final boolean f(View paramView1, View paramView2) {
    if (paramView1.getVisibility() != 8) {
      if (paramView2 instanceof FloatingActionButton) {
        int i = ((FloatingActionButton)paramView2).getExpandedComponentIdHint();
        if (i == 0 || i == paramView1.getId())
          return true; 
      } 
      return false;
    } 
    tp.f("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    return false;
  }
  
  public final void g(is paramis) {
    if (paramis.h == 0)
      paramis.h = 80; 
  }
  
  public final AnimatorSet x(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator3;
    g7 g7 = D(paramView2.getContext(), paramBoolean1);
    if (paramBoolean1) {
      this.g = paramView1.getTranslationX();
      this.h = paramView1.getTranslationY();
    } 
    ArrayList<ObjectAnimator> arrayList = new ArrayList();
    ArrayList<Animator.AnimatorListener> arrayList1 = new ArrayList();
    float f1 = paramView2.getElevation() - paramView1.getElevation();
    if (paramBoolean1) {
      if (!paramBoolean2)
        paramView2.setTranslationZ(-f1); 
      objectAnimator2 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { 0.0F });
    } else {
      objectAnimator2 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { -f1 });
    } 
    ((fy0)g7.c).c("elevation").a(objectAnimator2);
    arrayList.add(objectAnimator2);
    float f2 = z(paramView1, paramView2, (fb0)g7.e);
    f1 = A(paramView1, paramView2, (fb0)g7.e);
    Pair pair1 = y(f2, f1, paramBoolean1, g7);
    gy0 gy03 = (gy0)pair1.first;
    gy0 gy04 = (gy0)pair1.second;
    RectF rectF = this.d;
    if (paramBoolean1) {
      if (!paramBoolean2) {
        paramView2.setTranslationX(-f2);
        paramView2.setTranslationY(-f1);
      } 
      Property property = View.TRANSLATION_X;
      float[] arrayOfFloat1 = new float[1];
      arrayOfFloat1[0] = 0.0F;
      objectAnimator1 = ObjectAnimator.ofFloat(paramView2, property, arrayOfFloat1);
      property = View.TRANSLATION_Y;
      float[] arrayOfFloat2 = new float[1];
      arrayOfFloat2[0] = 0.0F;
      objectAnimator3 = ObjectAnimator.ofFloat(paramView2, property, arrayOfFloat2);
      f2 = -f2;
      float f = -f1;
      f1 = B(g7, gy03, f2);
      f2 = B(g7, gy04, f);
      Rect rect = this.c;
      paramView2.getWindowVisibleDisplayFrame(rect);
      rectF.set(rect);
      RectF rectF1 = this.e;
      C(paramView2, rectF1);
      rectF1.offset(f1, f2);
      rectF1.intersect(rectF);
      rectF.set(rectF1);
    } else {
      Property property3 = View.TRANSLATION_X;
      f2 = -f2;
      float[] arrayOfFloat1 = new float[1];
      arrayOfFloat1[0] = f2;
      objectAnimator1 = ObjectAnimator.ofFloat(paramView2, property3, arrayOfFloat1);
      Property property4 = View.TRANSLATION_Y;
      f1 = -f1;
      float[] arrayOfFloat2 = new float[1];
      arrayOfFloat2[0] = f1;
      objectAnimator3 = ObjectAnimator.ofFloat(paramView2, property4, arrayOfFloat2);
    } 
    gy03.a(objectAnimator1);
    gy04.a(objectAnimator3);
    arrayList.add(objectAnimator1);
    arrayList.add(objectAnimator3);
    rectF.width();
    rectF.height();
    f1 = z(paramView1, paramView2, (fb0)g7.e);
    f2 = A(paramView1, paramView2, (fb0)g7.e);
    Pair pair2 = y(f1, f2, paramBoolean1, g7);
    gy0 gy01 = (gy0)pair2.first;
    gy0 gy02 = (gy0)pair2.second;
    Property property1 = View.TRANSLATION_X;
    if (!paramBoolean1)
      f1 = this.g; 
    ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(paramView1, property1, new float[] { f1 });
    Property property2 = View.TRANSLATION_Y;
    if (paramBoolean1) {
      f1 = f2;
    } else {
      f1 = this.h;
    } 
    ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(paramView1, property2, new float[] { f1 });
    gy01.a(objectAnimator4);
    gy02.a(objectAnimator5);
    arrayList.add(objectAnimator4);
    arrayList.add(objectAnimator5);
    if (paramView2 instanceof ViewGroup) {
      ViewGroup viewGroup;
      View view = paramView2.findViewById(2131297227);
      if (view != null) {
        if (view instanceof ViewGroup) {
          viewGroup = (ViewGroup)view;
        } else {
          view = null;
        } 
      } else {
        viewGroup = (ViewGroup)paramView2;
      } 
      if (viewGroup != null) {
        ObjectAnimator objectAnimator;
        if (paramBoolean1) {
          if (!paramBoolean2)
            uk.a.set(viewGroup, Float.valueOf(0.0F)); 
          objectAnimator = ObjectAnimator.ofFloat(viewGroup, (Property)uk.a, new float[] { 1.0F });
        } else {
          objectAnimator = ObjectAnimator.ofFloat(objectAnimator, (Property)uk.a, new float[] { 0.0F });
        } 
        ((fy0)g7.c).c(LHyji.wyvw).a(objectAnimator);
        arrayList.add(objectAnimator);
      } 
    } 
    AnimatorSet animatorSet = new AnimatorSet();
    g92.U(animatorSet, arrayList);
    animatorSet.addListener((Animator.AnimatorListener)new h70(paramBoolean1, paramView2, paramView1));
    int i = arrayList1.size();
    for (byte b = 0; b < i; b++)
      animatorSet.addListener(arrayList1.get(b)); 
    return animatorSet;
  }
  
  public final float z(View paramView1, View paramView2, fb0 paramfb0) {
    RectF rectF2 = this.d;
    C(paramView1, rectF2);
    rectF2.offset(this.g, this.h);
    RectF rectF1 = this.e;
    C(paramView2, rectF1);
    paramfb0.getClass();
    return rectF1.centerX() - rectF2.centerX() + 0.0F;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\transformation\FabTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */