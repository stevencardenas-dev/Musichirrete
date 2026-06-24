package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import ix0;
import nc1;
import p1;
import q1;
import qw0;
import rw0;
import uw0;
import v1;

public class ActionMenuItemView extends AppCompatTextView implements ix0, View.OnClickListener, v1 {
  public uw0 j;
  
  public CharSequence k;
  
  public Drawable l;
  
  public qw0 m;
  
  public p1 n;
  
  public q1 o;
  
  public boolean p;
  
  public boolean q;
  
  public final int r;
  
  public int s;
  
  public final int t;
  
  public ActionMenuItemView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = paramContext.getResources();
    this.p = f();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, nc1.c, paramInt, 0);
    this.r = typedArray.getDimensionPixelSize(0, 0);
    typedArray.recycle();
    this.t = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    this.s = -1;
    setSaveEnabled(false);
  }
  
  public final boolean a() {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public final boolean b() {
    return (!TextUtils.isEmpty(getText()) && this.j.getIcon() == null);
  }
  
  public final boolean f() {
    Configuration configuration = getContext().getResources().getConfiguration();
    int i = configuration.screenWidthDp;
    int j = configuration.screenHeightDp;
    return (i >= 480 || (i >= 640 && j >= 480) || configuration.orientation == 2);
  }
  
  public final void g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/lang/CharSequence;
    //   4: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   7: istore_3
    //   8: iconst_1
    //   9: istore_2
    //   10: iload_2
    //   11: istore_1
    //   12: aload_0
    //   13: getfield l : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 55
    //   19: aload_0
    //   20: getfield j : Luw0;
    //   23: getfield y : I
    //   26: iconst_4
    //   27: iand
    //   28: iconst_4
    //   29: if_icmpne -> 53
    //   32: iload_2
    //   33: istore_1
    //   34: aload_0
    //   35: getfield p : Z
    //   38: ifne -> 55
    //   41: aload_0
    //   42: getfield q : Z
    //   45: ifeq -> 53
    //   48: iload_2
    //   49: istore_1
    //   50: goto -> 55
    //   53: iconst_0
    //   54: istore_1
    //   55: iload_3
    //   56: iconst_1
    //   57: ixor
    //   58: iload_1
    //   59: iand
    //   60: istore_1
    //   61: aconst_null
    //   62: astore #5
    //   64: iload_1
    //   65: ifeq -> 77
    //   68: aload_0
    //   69: getfield k : Ljava/lang/CharSequence;
    //   72: astore #4
    //   74: goto -> 80
    //   77: aconst_null
    //   78: astore #4
    //   80: aload_0
    //   81: aload #4
    //   83: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   86: aload_0
    //   87: getfield j : Luw0;
    //   90: getfield q : Ljava/lang/CharSequence;
    //   93: astore #4
    //   95: aload #4
    //   97: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   100: ifeq -> 131
    //   103: iload_1
    //   104: ifeq -> 113
    //   107: aconst_null
    //   108: astore #4
    //   110: goto -> 122
    //   113: aload_0
    //   114: getfield j : Luw0;
    //   117: getfield e : Ljava/lang/CharSequence;
    //   120: astore #4
    //   122: aload_0
    //   123: aload #4
    //   125: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   128: goto -> 137
    //   131: aload_0
    //   132: aload #4
    //   134: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   137: aload_0
    //   138: getfield j : Luw0;
    //   141: getfield r : Ljava/lang/CharSequence;
    //   144: astore #4
    //   146: aload #4
    //   148: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   151: ifeq -> 181
    //   154: iload_1
    //   155: ifeq -> 165
    //   158: aload #5
    //   160: astore #4
    //   162: goto -> 174
    //   165: aload_0
    //   166: getfield j : Luw0;
    //   169: getfield e : Ljava/lang/CharSequence;
    //   172: astore #4
    //   174: aload_0
    //   175: aload #4
    //   177: invokestatic Y : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   180: return
    //   181: aload_0
    //   182: aload #4
    //   184: invokestatic Y : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   187: return
  }
  
  public CharSequence getAccessibilityClassName() {
    return Button.class.getName();
  }
  
  public uw0 getItemData() {
    return this.j;
  }
  
  public final void initialize(uw0 paramuw0, int paramInt) {
    this.j = paramuw0;
    setIcon(paramuw0.getIcon());
    setTitle(paramuw0.getTitleCondensed());
    setId(paramuw0.a);
    if (paramuw0.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(paramuw0.isEnabled());
    if (paramuw0.hasSubMenu() && this.n == null)
      this.n = new p1(this); 
  }
  
  public final void onClick(View paramView) {
    qw0 qw01 = this.m;
    if (qw01 != null)
      qw01.a(this.j); 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.p = f();
    g();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = TextUtils.isEmpty(getText());
    if (!bool) {
      int m = this.s;
      if (m >= 0)
        super.setPadding(m, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    } 
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    int i = this.r;
    if (j == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, i);
    } else {
      paramInt1 = i;
    } 
    if (j != 1073741824 && i > 0 && k < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (bool && this.l != null)
      super.setPadding((getMeasuredWidth() - this.l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    super.onRestoreInstanceState(null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.j.hasSubMenu()) {
      p1 p11 = this.n;
      if (p11 != null && p11.onTouch((View)this, paramMotionEvent))
        return true; 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.q != paramBoolean) {
      this.q = paramBoolean;
      uw0 uw01 = this.j;
      if (uw01 != null) {
        rw0 rw0 = uw01.n;
        rw0.k = true;
        rw0.p(true);
      } 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.l = paramDrawable;
    if (paramDrawable != null) {
      int n = paramDrawable.getIntrinsicWidth();
      int m = paramDrawable.getIntrinsicHeight();
      int k = this.t;
      int i = n;
      int j = m;
      if (n > k) {
        float f = k / n;
        j = (int)(m * f);
        i = k;
      } 
      if (j > k) {
        float f = k / j;
        i = (int)(i * f);
      } else {
        k = j;
      } 
      paramDrawable.setBounds(0, 0, i, k);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    g();
  }
  
  public void setItemInvoker(qw0 paramqw0) {
    this.m = paramqw0;
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.s = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(q1 paramq1) {
    this.o = paramq1;
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    g();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\view\menu\ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */