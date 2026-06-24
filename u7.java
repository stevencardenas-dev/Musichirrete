import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class u7 extends Spinner {
  public static final int[] k = new int[] { 16843505 };
  
  public final v2 b;
  
  public final Context c;
  
  public final k7 e;
  
  public SpinnerAdapter f;
  
  public final boolean g;
  
  public final t7 h;
  
  public int i;
  
  public final Rect j;
  
  public u7(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield j : Landroid/graphics/Rect;
    //   18: aload_0
    //   19: invokevirtual getContext : ()Landroid/content/Context;
    //   22: aload_0
    //   23: invokestatic a : (Landroid/content/Context;Landroid/view/View;)V
    //   26: getstatic nc1.v : [I
    //   29: astore #11
    //   31: iload_3
    //   32: iconst_0
    //   33: aload_1
    //   34: aload_2
    //   35: aload #11
    //   37: invokestatic y : (IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv0;
    //   40: astore #9
    //   42: aload #9
    //   44: getfield e : Ljava/lang/Object;
    //   47: checkcast android/content/res/TypedArray
    //   50: astore #10
    //   52: aload_0
    //   53: new v2
    //   56: dup
    //   57: aload_0
    //   58: invokespecial <init> : (Landroid/view/View;)V
    //   61: putfield b : Lv2;
    //   64: aload #10
    //   66: iconst_4
    //   67: iconst_0
    //   68: invokevirtual getResourceId : (II)I
    //   71: istore #4
    //   73: iload #4
    //   75: ifeq -> 95
    //   78: aload_0
    //   79: new bs
    //   82: dup
    //   83: aload_1
    //   84: iload #4
    //   86: invokespecial <init> : (Landroid/content/Context;I)V
    //   89: putfield c : Landroid/content/Context;
    //   92: goto -> 100
    //   95: aload_0
    //   96: aload_1
    //   97: putfield c : Landroid/content/Context;
    //   100: iconst_m1
    //   101: istore #5
    //   103: aconst_null
    //   104: astore #7
    //   106: aload_1
    //   107: aload_2
    //   108: getstatic u7.k : [I
    //   111: iload_3
    //   112: iconst_0
    //   113: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   116: astore #6
    //   118: aload #6
    //   120: astore #7
    //   122: iload #5
    //   124: istore #4
    //   126: aload #6
    //   128: astore #8
    //   130: aload #6
    //   132: iconst_0
    //   133: invokevirtual hasValue : (I)Z
    //   136: ifeq -> 171
    //   139: aload #6
    //   141: astore #7
    //   143: aload #6
    //   145: iconst_0
    //   146: iconst_0
    //   147: invokevirtual getInt : (II)I
    //   150: istore #4
    //   152: aload #6
    //   154: astore #8
    //   156: goto -> 171
    //   159: astore_2
    //   160: aload #7
    //   162: astore_1
    //   163: goto -> 441
    //   166: astore #8
    //   168: goto -> 191
    //   171: aload #8
    //   173: invokevirtual recycle : ()V
    //   176: goto -> 225
    //   179: astore_2
    //   180: aload #7
    //   182: astore_1
    //   183: goto -> 441
    //   186: astore #8
    //   188: aconst_null
    //   189: astore #6
    //   191: aload #6
    //   193: astore #7
    //   195: ldc 'AppCompatSpinner'
    //   197: ldc 'Could not read android:spinnerMode'
    //   199: aload #8
    //   201: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   204: pop
    //   205: iload #5
    //   207: istore #4
    //   209: aload #6
    //   211: ifnull -> 225
    //   214: iload #5
    //   216: istore #4
    //   218: aload #6
    //   220: astore #8
    //   222: goto -> 171
    //   225: iload #4
    //   227: ifeq -> 338
    //   230: iload #4
    //   232: iconst_1
    //   233: if_icmpeq -> 239
    //   236: goto -> 365
    //   239: new r7
    //   242: dup
    //   243: aload_0
    //   244: aload_0
    //   245: getfield c : Landroid/content/Context;
    //   248: aload_2
    //   249: iload_3
    //   250: invokespecial <init> : (Lu7;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   253: astore #6
    //   255: iload_3
    //   256: iconst_0
    //   257: aload_0
    //   258: getfield c : Landroid/content/Context;
    //   261: aload_2
    //   262: aload #11
    //   264: invokestatic y : (IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv0;
    //   267: astore #7
    //   269: aload_0
    //   270: aload #7
    //   272: getfield e : Ljava/lang/Object;
    //   275: checkcast android/content/res/TypedArray
    //   278: iconst_3
    //   279: bipush #-2
    //   281: invokevirtual getLayoutDimension : (II)I
    //   284: putfield i : I
    //   287: aload #6
    //   289: aload #7
    //   291: iconst_1
    //   292: invokevirtual o : (I)Landroid/graphics/drawable/Drawable;
    //   295: invokevirtual i : (Landroid/graphics/drawable/Drawable;)V
    //   298: aload #6
    //   300: aload #10
    //   302: iconst_2
    //   303: invokevirtual getString : (I)Ljava/lang/String;
    //   306: putfield E : Ljava/lang/CharSequence;
    //   309: aload #7
    //   311: invokevirtual z : ()V
    //   314: aload_0
    //   315: aload #6
    //   317: putfield h : Lt7;
    //   320: aload_0
    //   321: new k7
    //   324: dup
    //   325: aload_0
    //   326: aload_0
    //   327: aload #6
    //   329: invokespecial <init> : (Lu7;Lu7;Lr7;)V
    //   332: putfield e : Lk7;
    //   335: goto -> 365
    //   338: new n7
    //   341: dup
    //   342: aload_0
    //   343: invokespecial <init> : (Lu7;)V
    //   346: astore #6
    //   348: aload_0
    //   349: aload #6
    //   351: putfield h : Lt7;
    //   354: aload #6
    //   356: aload #10
    //   358: iconst_2
    //   359: invokevirtual getString : (I)Ljava/lang/String;
    //   362: putfield e : Ljava/lang/CharSequence;
    //   365: aload #10
    //   367: iconst_0
    //   368: invokevirtual getTextArray : (I)[Ljava/lang/CharSequence;
    //   371: astore #6
    //   373: aload #6
    //   375: ifnull -> 402
    //   378: new android/widget/ArrayAdapter
    //   381: dup
    //   382: aload_1
    //   383: ldc 17367048
    //   385: aload #6
    //   387: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   390: astore_1
    //   391: aload_1
    //   392: ldc 2131493213
    //   394: invokevirtual setDropDownViewResource : (I)V
    //   397: aload_0
    //   398: aload_1
    //   399: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   402: aload #9
    //   404: invokevirtual z : ()V
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield g : Z
    //   412: aload_0
    //   413: getfield f : Landroid/widget/SpinnerAdapter;
    //   416: astore_1
    //   417: aload_1
    //   418: ifnull -> 431
    //   421: aload_0
    //   422: aload_1
    //   423: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   426: aload_0
    //   427: aconst_null
    //   428: putfield f : Landroid/widget/SpinnerAdapter;
    //   431: aload_0
    //   432: getfield b : Lv2;
    //   435: aload_2
    //   436: iload_3
    //   437: invokevirtual k : (Landroid/util/AttributeSet;I)V
    //   440: return
    //   441: aload_1
    //   442: ifnull -> 449
    //   445: aload_1
    //   446: invokevirtual recycle : ()V
    //   449: aload_2
    //   450: athrow
    // Exception table:
    //   from	to	target	type
    //   106	118	186	java/lang/Exception
    //   106	118	179	finally
    //   130	139	166	java/lang/Exception
    //   130	139	159	finally
    //   143	152	166	java/lang/Exception
    //   143	152	159	finally
    //   195	205	159	finally
  }
  
  public final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    int k = 0;
    if (paramSpinnerAdapter == null)
      return 0; 
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i1 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    i = Math.max(0, i - 15 - i1 - i);
    View view = null;
    int j = 0;
    while (i < i1) {
      int i3 = paramSpinnerAdapter.getItemViewType(i);
      int i2 = k;
      if (i3 != k) {
        view = null;
        i2 = i3;
      } 
      view = paramSpinnerAdapter.getView(i, view, (ViewGroup)this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(n, m);
      j = Math.max(j, view.getMeasuredWidth());
      i++;
      k = i2;
    } 
    if (paramDrawable != null) {
      Rect rect = this.j;
      paramDrawable.getPadding(rect);
      return rect.left + rect.right + j;
    } 
    return j;
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    v2 v21 = this.b;
    if (v21 != null)
      v21.a(); 
  }
  
  public int getDropDownHorizontalOffset() {
    t7 t71 = this.h;
    return (t71 != null) ? t71.c() : super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset() {
    t7 t71 = this.h;
    return (t71 != null) ? t71.o() : super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth() {
    return (this.h != null) ? this.i : super.getDropDownWidth();
  }
  
  public final t7 getInternalPopup() {
    return this.h;
  }
  
  public Drawable getPopupBackground() {
    t7 t71 = this.h;
    return (t71 != null) ? t71.e() : super.getPopupBackground();
  }
  
  public Context getPopupContext() {
    return this.c;
  }
  
  public CharSequence getPrompt() {
    t7 t71 = this.h;
    return (t71 != null) ? t71.p() : super.getPrompt();
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.i() : null;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    t7 t71 = this.h;
    if (t71 != null && t71.b())
      t71.dismiss(); 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.h != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    s7 s7 = (s7)paramParcelable;
    super.onRestoreInstanceState(s7.getSuperState());
    if (s7.b) {
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.addOnGlobalLayoutListener(new l7(0, this)); 
    } 
  }
  
  public final Parcelable onSaveInstanceState() {
    boolean bool;
    View.BaseSavedState baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
    t7 t71 = this.h;
    if (t71 != null && t71.b()) {
      bool = true;
    } else {
      bool = false;
    } 
    ((s7)baseSavedState).b = bool;
    return (Parcelable)baseSavedState;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    k7 k71 = this.e;
    return (k71 != null && k71.onTouch((View)this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean performClick() {
    t7 t71 = this.h;
    if (t71 != null) {
      if (!t71.b())
        t71.n(getTextDirection(), getTextAlignment()); 
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.g) {
      this.f = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    t7 t71 = this.h;
    if (t71 != null) {
      Context context2 = this.c;
      Context context1 = context2;
      if (context2 == null)
        context1 = getContext(); 
      Resources.Theme theme = context1.getTheme();
      Object object = new Object();
      ((o7)object).b = paramSpinnerAdapter;
      if (paramSpinnerAdapter instanceof ListAdapter)
        ((o7)object).c = (ListAdapter)paramSpinnerAdapter; 
      if (theme != null && paramSpinnerAdapter instanceof ThemedSpinnerAdapter)
        m7.a((ThemedSpinnerAdapter)paramSpinnerAdapter, theme); 
      t71.q((ListAdapter)object);
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    v2 v21 = this.b;
    if (v21 != null)
      v21.m(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    v2 v21 = this.b;
    if (v21 != null)
      v21.n(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    t7 t71 = this.h;
    if (t71 != null) {
      t71.l(paramInt);
      t71.m(paramInt);
      return;
    } 
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    t7 t71 = this.h;
    if (t71 != null) {
      t71.k(paramInt);
      return;
    } 
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.h != null) {
      this.i = paramInt;
      return;
    } 
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    t7 t71 = this.h;
    if (t71 != null) {
      t71.i(paramDrawable);
      return;
    } 
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt) {
    setPopupBackgroundDrawable(ws2.I(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence) {
    t7 t71 = this.h;
    if (t71 != null) {
      t71.g(paramCharSequence);
      return;
    } 
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.s(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.t(paramMode); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */