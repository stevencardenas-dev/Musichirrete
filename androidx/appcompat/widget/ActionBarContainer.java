package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import lj1;

public class ActionBarContainer extends FrameLayout {
  public boolean b;
  
  public View c;
  
  public View e;
  
  public Drawable f;
  
  public Drawable g;
  
  public Drawable h;
  
  public final boolean i;
  
  public boolean j;
  
  public final int k;
  
  public ActionBarContainer(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: new h1
    //   10: dup
    //   11: aload_0
    //   12: invokespecial <init> : (Landroidx/appcompat/widget/ActionBarContainer;)V
    //   15: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic nc1.a : [I
    //   23: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   26: astore_1
    //   27: iconst_0
    //   28: istore #4
    //   30: aload_0
    //   31: aload_1
    //   32: iconst_0
    //   33: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   36: putfield f : Landroid/graphics/drawable/Drawable;
    //   39: aload_0
    //   40: aload_1
    //   41: iconst_2
    //   42: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   45: putfield g : Landroid/graphics/drawable/Drawable;
    //   48: aload_0
    //   49: aload_1
    //   50: bipush #13
    //   52: iconst_m1
    //   53: invokevirtual getDimensionPixelSize : (II)I
    //   56: putfield k : I
    //   59: aload_0
    //   60: invokevirtual getId : ()I
    //   63: ldc 2131297523
    //   65: if_icmpne -> 82
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield i : Z
    //   73: aload_0
    //   74: aload_1
    //   75: iconst_1
    //   76: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   79: putfield h : Landroid/graphics/drawable/Drawable;
    //   82: aload_1
    //   83: invokevirtual recycle : ()V
    //   86: aload_0
    //   87: getfield i : Z
    //   90: ifeq -> 108
    //   93: iload #4
    //   95: istore_3
    //   96: aload_0
    //   97: getfield h : Landroid/graphics/drawable/Drawable;
    //   100: ifnonnull -> 131
    //   103: iconst_1
    //   104: istore_3
    //   105: goto -> 131
    //   108: iload #4
    //   110: istore_3
    //   111: aload_0
    //   112: getfield f : Landroid/graphics/drawable/Drawable;
    //   115: ifnonnull -> 131
    //   118: iload #4
    //   120: istore_3
    //   121: aload_0
    //   122: getfield g : Landroid/graphics/drawable/Drawable;
    //   125: ifnonnull -> 131
    //   128: goto -> 103
    //   131: aload_0
    //   132: iload_3
    //   133: invokevirtual setWillNotDraw : (Z)V
    //   136: return
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.f;
    if (drawable != null && drawable.isStateful())
      this.f.setState(getDrawableState()); 
    drawable = this.g;
    if (drawable != null && drawable.isStateful())
      this.g.setState(getDrawableState()); 
    drawable = this.h;
    if (drawable != null && drawable.isStateful())
      this.h.setState(getDrawableState()); 
  }
  
  public View getTabContainer() {
    return null;
  }
  
  public final void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.g;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    this.c = findViewById(2131296311);
    this.e = findViewById(2131296319);
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent) {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return (this.b || super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramBoolean = this.i;
    paramInt2 = 1;
    paramInt1 = 1;
    if (paramBoolean) {
      Drawable drawable = this.h;
      if (drawable != null) {
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = paramInt2;
      } else {
        paramInt1 = 0;
      } 
    } else {
      if (this.f != null) {
        if (this.c.getVisibility() == 0) {
          this.f.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
        } else {
          View view = this.e;
          if (view != null && view.getVisibility() == 0) {
            this.f.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
          } else {
            this.f.setBounds(0, 0, 0, 0);
          } 
        } 
      } else {
        paramInt1 = 0;
      } 
      this.j = false;
    } 
    if (paramInt1 != 0)
      invalidate(); 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (this.c == null) {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE) {
        int j = this.k;
        i = paramInt2;
        if (j >= 0)
          i = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), -2147483648); 
      } 
    } 
    super.onMeasure(paramInt1, i);
    if (this.c == null)
      return; 
    View.MeasureSpec.getMode(i);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 25
    //   11: aload #4
    //   13: aconst_null
    //   14: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield f : Landroid/graphics/drawable/Drawable;
    //   22: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield f : Landroid/graphics/drawable/Drawable;
    //   30: aload_1
    //   31: ifnull -> 80
    //   34: aload_1
    //   35: aload_0
    //   36: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   39: aload_0
    //   40: getfield c : Landroid/view/View;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull -> 80
    //   48: aload_0
    //   49: getfield f : Landroid/graphics/drawable/Drawable;
    //   52: aload_1
    //   53: invokevirtual getLeft : ()I
    //   56: aload_0
    //   57: getfield c : Landroid/view/View;
    //   60: invokevirtual getTop : ()I
    //   63: aload_0
    //   64: getfield c : Landroid/view/View;
    //   67: invokevirtual getRight : ()I
    //   70: aload_0
    //   71: getfield c : Landroid/view/View;
    //   74: invokevirtual getBottom : ()I
    //   77: invokevirtual setBounds : (IIII)V
    //   80: aload_0
    //   81: getfield i : Z
    //   84: istore_2
    //   85: iconst_0
    //   86: istore_3
    //   87: iload_2
    //   88: ifeq -> 105
    //   91: iload_3
    //   92: istore_2
    //   93: aload_0
    //   94: getfield h : Landroid/graphics/drawable/Drawable;
    //   97: ifnonnull -> 126
    //   100: iconst_1
    //   101: istore_2
    //   102: goto -> 126
    //   105: iload_3
    //   106: istore_2
    //   107: aload_0
    //   108: getfield f : Landroid/graphics/drawable/Drawable;
    //   111: ifnonnull -> 126
    //   114: iload_3
    //   115: istore_2
    //   116: aload_0
    //   117: getfield g : Landroid/graphics/drawable/Drawable;
    //   120: ifnonnull -> 126
    //   123: goto -> 100
    //   126: aload_0
    //   127: iload_2
    //   128: invokevirtual setWillNotDraw : (Z)V
    //   131: aload_0
    //   132: invokevirtual invalidate : ()V
    //   135: aload_0
    //   136: invokevirtual invalidateOutline : ()V
    //   139: return
  }
  
  public void setSplitBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 25
    //   11: aload #4
    //   13: aconst_null
    //   14: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield h : Landroid/graphics/drawable/Drawable;
    //   22: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield h : Landroid/graphics/drawable/Drawable;
    //   30: aload_0
    //   31: getfield i : Z
    //   34: istore_2
    //   35: iconst_0
    //   36: istore_3
    //   37: aload_1
    //   38: ifnull -> 73
    //   41: aload_1
    //   42: aload_0
    //   43: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   46: iload_2
    //   47: ifeq -> 73
    //   50: aload_0
    //   51: getfield h : Landroid/graphics/drawable/Drawable;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull -> 73
    //   59: aload_1
    //   60: iconst_0
    //   61: iconst_0
    //   62: aload_0
    //   63: invokevirtual getMeasuredWidth : ()I
    //   66: aload_0
    //   67: invokevirtual getMeasuredHeight : ()I
    //   70: invokevirtual setBounds : (IIII)V
    //   73: iload_2
    //   74: ifeq -> 91
    //   77: iload_3
    //   78: istore_2
    //   79: aload_0
    //   80: getfield h : Landroid/graphics/drawable/Drawable;
    //   83: ifnonnull -> 112
    //   86: iconst_1
    //   87: istore_2
    //   88: goto -> 112
    //   91: iload_3
    //   92: istore_2
    //   93: aload_0
    //   94: getfield f : Landroid/graphics/drawable/Drawable;
    //   97: ifnonnull -> 112
    //   100: iload_3
    //   101: istore_2
    //   102: aload_0
    //   103: getfield g : Landroid/graphics/drawable/Drawable;
    //   106: ifnonnull -> 112
    //   109: goto -> 86
    //   112: aload_0
    //   113: iload_2
    //   114: invokevirtual setWillNotDraw : (Z)V
    //   117: aload_0
    //   118: invokevirtual invalidate : ()V
    //   121: aload_0
    //   122: invokevirtual invalidateOutline : ()V
    //   125: return
  }
  
  public void setStackedBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 25
    //   11: aload #4
    //   13: aconst_null
    //   14: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield g : Landroid/graphics/drawable/Drawable;
    //   22: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield g : Landroid/graphics/drawable/Drawable;
    //   30: aload_1
    //   31: ifnull -> 58
    //   34: aload_1
    //   35: aload_0
    //   36: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   39: aload_0
    //   40: getfield j : Z
    //   43: ifeq -> 58
    //   46: aload_0
    //   47: getfield g : Landroid/graphics/drawable/Drawable;
    //   50: ifnonnull -> 56
    //   53: goto -> 58
    //   56: aconst_null
    //   57: athrow
    //   58: aload_0
    //   59: getfield i : Z
    //   62: istore_2
    //   63: iconst_0
    //   64: istore_3
    //   65: iload_2
    //   66: ifeq -> 83
    //   69: iload_3
    //   70: istore_2
    //   71: aload_0
    //   72: getfield h : Landroid/graphics/drawable/Drawable;
    //   75: ifnonnull -> 104
    //   78: iconst_1
    //   79: istore_2
    //   80: goto -> 104
    //   83: iload_3
    //   84: istore_2
    //   85: aload_0
    //   86: getfield f : Landroid/graphics/drawable/Drawable;
    //   89: ifnonnull -> 104
    //   92: iload_3
    //   93: istore_2
    //   94: aload_0
    //   95: getfield g : Landroid/graphics/drawable/Drawable;
    //   98: ifnonnull -> 104
    //   101: goto -> 78
    //   104: aload_0
    //   105: iload_2
    //   106: invokevirtual setWillNotDraw : (Z)V
    //   109: aload_0
    //   110: invokevirtual invalidate : ()V
    //   113: aload_0
    //   114: invokevirtual invalidateOutline : ()V
    //   117: return
  }
  
  public void setTabContainer(lj1 paramlj1) {}
  
  public void setTransitioning(boolean paramBoolean) {
    int i;
    this.b = paramBoolean;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    } 
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.g;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.h;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback) {
    return null;
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt) {
    return (paramInt != 0) ? super.startActionModeForChild(paramView, paramCallback, paramInt) : null;
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    Drawable drawable = this.f;
    boolean bool = this.i;
    return ((paramDrawable == drawable && !bool) || (paramDrawable == this.g && this.j) || (paramDrawable == this.h && bool) || super.verifyDrawable(paramDrawable));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */