import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class ya0 extends FrameLayout {
  public final ArrayList b = new ArrayList();
  
  public final ArrayList c = new ArrayList();
  
  public View.OnApplyWindowInsetsListener e;
  
  public boolean f = true;
  
  public ya0(Context paramContext, AttributeSet paramAttributeSet, lb0 paramlb0) {
    super(paramContext, paramAttributeSet);
    String str2 = paramAttributeSet.getClassAttribute();
    int[] arrayOfInt = ic1.b;
    int i = 0;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(0); 
    str2 = typedArray.getString(1);
    typedArray.recycle();
    int j = getId();
    ua0 ua0 = paramlb0.D(j);
    if (str1 != null && ua0 == null) {
      String str;
      x5 x5;
      if (j == -1) {
        if (str2 != null) {
          str = " with tag ".concat(str2);
        } else {
          str = "";
        } 
        tp.f(x41.w("FragmentContainerView must have an android:id to add Fragment ", str1, str));
        throw null;
      } 
      eb0 eb0 = paramlb0.J();
      str.getClassLoader();
      ua0 ua01 = eb0.a(str1);
      ua01.getClass();
      ua01.A = j;
      ua01.B = j;
      ua01.C = str2;
      ua01.w = paramlb0;
      wa0 wa0 = paramlb0.w;
      ua01.x = wa0;
      ua01.I = true;
      if (wa0 == null) {
        wa0 = null;
      } else {
        x5 = wa0.k;
      } 
      if (x5 != null)
        ua01.I = true; 
      lb lb = new lb(paramlb0);
      lb.p = true;
      ua01.J = (ViewGroup)this;
      ua01.s = true;
      lb.h(getId(), ua01, str2, 1);
      if (!lb.g) {
        lb.h = false;
        lb.r.A(lb, true);
      } else {
        tp.f("This transaction is already being added to the back stack");
        throw null;
      } 
    } 
    ArrayList<String> arrayList = paramlb0.c.t();
    int k = arrayList.size();
    while (i < k) {
      str1 = arrayList.get(i);
      j = i + 1;
      sb0 sb0 = (sb0)str1;
      ua0 ua01 = sb0.c;
      i = j;
      if (ua01.B == getId()) {
        View view = ua01.K;
        i = j;
        if (view != null) {
          i = j;
          if (view.getParent() == null) {
            ua01.J = (ViewGroup)this;
            sb0.b();
            sb0.k();
            i = j;
          } 
        } 
      } 
    } 
  }
  
  public final void a(View paramView) {
    if (this.c.contains(paramView))
      this.b.add(paramView); 
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    paramView.getClass();
    Object object = paramView.getTag(2131296752);
    if (object instanceof ua0) {
      object = object;
    } else {
      object = null;
    } 
    if (object != null) {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not associated with a Fragment.");
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public final WindowInsets dispatchApplyWindowInsets(WindowInsets paramWindowInsets) {
    paramWindowInsets.getClass();
    x62 x62 = x62.h(null, paramWindowInsets);
    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.e;
    if (onApplyWindowInsetsListener != null) {
      onApplyWindowInsetsListener.getClass();
      WindowInsets windowInsets = onApplyWindowInsetsListener.onApplyWindowInsets((View)this, paramWindowInsets);
      windowInsets.getClass();
      x62 = x62.h(null, windowInsets);
    } else {
      x62 = v22.i((View)this, x62);
    } 
    if (!x62.a.r()) {
      int i = getChildCount();
      for (byte b = 0; b < i; b++)
        v22.b(getChildAt(b), x62); 
    } 
    return paramWindowInsets;
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {
    paramCanvas.getClass();
    if (this.f) {
      ArrayList<Object> arrayList = this.b;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        View view = (View)arrayList.get(b);
        b++;
        super.drawChild(paramCanvas, view, getDrawingTime());
      } 
    } 
    super.dispatchDraw(paramCanvas);
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    paramCanvas.getClass();
    paramView.getClass();
    if (this.f) {
      ArrayList arrayList = this.b;
      if (!arrayList.isEmpty() && arrayList.contains(paramView))
        return false; 
    } 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void endViewTransition(View paramView) {
    paramView.getClass();
    this.c.remove(paramView);
    if (this.b.remove(paramView))
      this.f = true; 
    super.endViewTransition(paramView);
  }
  
  public final <F extends ua0> F getFragment() {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: aload_1
    //   3: ifnull -> 62
    //   6: aload_1
    //   7: ldc 2131296752
    //   9: invokevirtual getTag : (I)Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: instanceof ua0
    //   17: ifeq -> 28
    //   20: aload_2
    //   21: checkcast ua0
    //   24: astore_2
    //   25: goto -> 30
    //   28: aconst_null
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull -> 37
    //   34: goto -> 64
    //   37: aload_1
    //   38: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   41: astore_1
    //   42: aload_1
    //   43: instanceof android/view/View
    //   46: ifeq -> 57
    //   49: aload_1
    //   50: checkcast android/view/View
    //   53: astore_1
    //   54: goto -> 2
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -> 2
    //   62: aconst_null
    //   63: astore_2
    //   64: aload_2
    //   65: ifnull -> 134
    //   68: aload_2
    //   69: invokevirtual Y : ()Z
    //   72: ifeq -> 83
    //   75: aload_2
    //   76: invokevirtual O : ()Llb0;
    //   79: astore_1
    //   80: goto -> 183
    //   83: new java/lang/StringBuilder
    //   86: dup
    //   87: getstatic org/jaudiotagger/audio/dsf/qdA/GMDx.AMxqXOQ : Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: astore_1
    //   94: aload_1
    //   95: aload_2
    //   96: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_1
    //   101: ldc_w ' that owns View '
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_1
    //   109: aload_0
    //   110: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload_1
    //   115: ldc_w ' has already been destroyed. Nested fragments should always use the child FragmentManager.'
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: new java/lang/IllegalStateException
    //   125: dup
    //   126: aload_1
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: athrow
    //   134: aload_0
    //   135: invokevirtual getContext : ()Landroid/content/Context;
    //   138: astore_1
    //   139: aload_1
    //   140: instanceof android/content/ContextWrapper
    //   143: ifeq -> 172
    //   146: aload_1
    //   147: instanceof x5
    //   150: ifeq -> 161
    //   153: aload_1
    //   154: checkcast x5
    //   157: astore_1
    //   158: goto -> 174
    //   161: aload_1
    //   162: checkcast android/content/ContextWrapper
    //   165: invokevirtual getBaseContext : ()Landroid/content/Context;
    //   168: astore_1
    //   169: goto -> 139
    //   172: aconst_null
    //   173: astore_1
    //   174: aload_1
    //   175: ifnull -> 192
    //   178: aload_1
    //   179: invokevirtual Z : ()Llb0;
    //   182: astore_1
    //   183: aload_1
    //   184: aload_0
    //   185: invokevirtual getId : ()I
    //   188: invokevirtual D : (I)Lua0;
    //   191: areturn
    //   192: aload_0
    //   193: ldc_w ' is not within a subclass of FragmentActivity.'
    //   196: ldc_w 'View '
    //   199: invokestatic h : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   202: aconst_null
    //   203: areturn
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets) {
    paramWindowInsets.getClass();
    return paramWindowInsets;
  }
  
  public final void removeAllViewsInLayout() {
    for (int i = getChildCount() - 1; -1 < i; i--) {
      View view = getChildAt(i);
      view.getClass();
      a(view);
    } 
    super.removeAllViewsInLayout();
  }
  
  public final void removeView(View paramView) {
    paramView.getClass();
    a(paramView);
    super.removeView(paramView);
  }
  
  public final void removeViewAt(int paramInt) {
    View view = getChildAt(paramInt);
    view.getClass();
    a(view);
    super.removeViewAt(paramInt);
  }
  
  public final void removeViewInLayout(View paramView) {
    paramView.getClass();
    a(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public final void removeViews(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      View view = getChildAt(i);
      view.getClass();
      a(view);
    } 
    super.removeViews(paramInt1, paramInt2);
  }
  
  public final void removeViewsInLayout(int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      View view = getChildAt(i);
      view.getClass();
      a(view);
    } 
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public final void setDrawDisappearingViewsLast(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition) {
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener) {
    this.e = paramOnApplyWindowInsetsListener;
  }
  
  public final void startViewTransition(View paramView) {
    paramView.getClass();
    if (paramView.getParent() == this)
      this.c.add(paramView); 
    super.startViewTransition(paramView);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ya0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */