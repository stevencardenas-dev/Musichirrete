import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class ie extends FrameLayout {
  public static final he n = new he(0);
  
  public je b;
  
  public final vl1 c;
  
  public int e;
  
  public final float f;
  
  public final float g;
  
  public final int h;
  
  public final int i;
  
  public ColorStateList j;
  
  public PorterDuff.Mode k;
  
  public Rect l;
  
  public boolean m;
  
  public ie(Context paramContext, AttributeSet paramAttributeSet) {
    super(qv.n0(paramContext, paramAttributeSet, 0, 0), paramAttributeSet);
    Context context = getContext();
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, zb1.E);
    if (typedArray.hasValue(6))
      setElevation(typedArray.getDimensionPixelSize(6, 0)); 
    this.e = typedArray.getInt(2, 0);
    if (typedArray.hasValue(8) || typedArray.hasValue(9))
      this.c = vl1.b(context, paramAttributeSet, 0, 0).a(); 
    this.f = typedArray.getFloat(3, 1.0F);
    setBackgroundTintList(wf2.u(context, typedArray, 4));
    setBackgroundTintMode(n21.N(typedArray.getInt(5, -1), PorterDuff.Mode.SRC_IN));
    this.g = typedArray.getFloat(1, 1.0F);
    this.h = typedArray.getDimensionPixelSize(0, -1);
    this.i = typedArray.getDimensionPixelSize(7, -1);
    typedArray.recycle();
    setOnTouchListener(n);
    setFocusable(true);
    if (getBackground() == null) {
      GradientDrawable gradientDrawable;
      int i = m92.L(getBackgroundOverlayColorAlpha(), m92.x((View)this, 2130968945), m92.x((View)this, 2130968921));
      vl1 vl11 = this.c;
      if (vl11 != null) {
        o70 o70 = je.v;
        ws0 ws0 = new ws0(vl11);
        ws0.o(ColorStateList.valueOf(i));
      } else {
        Resources resources = getResources();
        o70 o70 = je.v;
        float f = resources.getDimension(2131166291);
        gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
      } 
      ColorStateList colorStateList = this.j;
      if (colorStateList != null)
        gradientDrawable.setTintList(colorStateList); 
      setBackground((Drawable)gradientDrawable);
    } 
  }
  
  private void setBaseTransientBottomBar(je paramje) {
    this.b = paramje;
  }
  
  public float getActionTextColorAlpha() {
    return this.g;
  }
  
  public int getAnimationMode() {
    return this.e;
  }
  
  public float getBackgroundOverlayColorAlpha() {
    return this.f;
  }
  
  public int getMaxInlineActionWidth() {
    return this.i;
  }
  
  public int getMaxWidth() {
    return this.h;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    je je1 = this.b;
    if (je1 != null)
      je1.b(); 
    requestApplyInsets();
  }
  
  public final void onDetachedFromWindow() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial onDetachedFromWindow : ()V
    //   4: aload_0
    //   5: getfield b : Lje;
    //   8: astore #4
    //   10: aload #4
    //   12: ifnull -> 119
    //   15: invokestatic x : ()Ln2;
    //   18: astore #6
    //   20: aload #4
    //   22: getfield u : Lge;
    //   25: astore #5
    //   27: aload #6
    //   29: getfield c : Ljava/lang/Object;
    //   32: astore_3
    //   33: aload_3
    //   34: monitorenter
    //   35: aload #6
    //   37: aload #5
    //   39: invokevirtual A : (Lge;)Z
    //   42: ifne -> 86
    //   45: aload #6
    //   47: getfield g : Ljava/lang/Object;
    //   50: checkcast nn1
    //   53: astore #6
    //   55: iconst_0
    //   56: istore_2
    //   57: aload #6
    //   59: ifnull -> 80
    //   62: aload #6
    //   64: getfield a : Ljava/lang/ref/WeakReference;
    //   67: invokevirtual get : ()Ljava/lang/Object;
    //   70: aload #5
    //   72: if_acmpne -> 80
    //   75: iconst_1
    //   76: istore_1
    //   77: goto -> 82
    //   80: iconst_0
    //   81: istore_1
    //   82: iload_1
    //   83: ifeq -> 88
    //   86: iconst_1
    //   87: istore_2
    //   88: aload_3
    //   89: monitorexit
    //   90: iload_2
    //   91: ifeq -> 119
    //   94: getstatic je.y : Landroid/os/Handler;
    //   97: new de
    //   100: dup
    //   101: aload #4
    //   103: iconst_1
    //   104: invokespecial <init> : (Lje;I)V
    //   107: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   110: pop
    //   111: return
    //   112: astore #4
    //   114: aload_3
    //   115: monitorexit
    //   116: aload #4
    //   118: athrow
    //   119: return
    // Exception table:
    //   from	to	target	type
    //   35	55	112	finally
    //   62	75	112	finally
    //   88	90	112	finally
    //   114	116	112	finally
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    je je1 = this.b;
    if (je1 != null && je1.r) {
      je1.e();
      je1.r = false;
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = this.h;
    if (paramInt1 > 0 && getMeasuredWidth() > paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
  }
  
  public void setAnimationMode(int paramInt) {
    this.e = paramInt;
  }
  
  public void setBackground(Drawable paramDrawable) {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (paramDrawable != null) {
      drawable = paramDrawable;
      if (this.j != null) {
        drawable = paramDrawable.mutate();
        drawable.setTintList(this.j);
        drawable.setTintMode(this.k);
      } 
    } 
    super.setBackgroundDrawable(drawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    this.j = paramColorStateList;
    if (getBackground() != null) {
      Drawable drawable = getBackground().mutate();
      drawable.setTintList(paramColorStateList);
      drawable.setTintMode(this.k);
      if (drawable != getBackground())
        super.setBackgroundDrawable(drawable); 
    } 
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    this.k = paramMode;
    if (getBackground() != null) {
      Drawable drawable = getBackground().mutate();
      drawable.setTintMode(paramMode);
      if (drawable != getBackground())
        super.setBackgroundDrawable(drawable); 
    } 
  }
  
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    super.setLayoutParams(paramLayoutParams);
    if (!this.m && paramLayoutParams instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      this.l = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
      je je1 = this.b;
      if (je1 != null) {
        o70 o70 = je.v;
        je1.f();
      } 
    } 
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener) {
    he he1;
    if (paramOnClickListener != null) {
      he1 = null;
    } else {
      he1 = n;
    } 
    setOnTouchListener(he1);
    super.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */