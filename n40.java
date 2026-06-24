import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class n40 extends LinearLayout {
  public final TextInputLayout b;
  
  public final FrameLayout c;
  
  public final CheckableImageButton e;
  
  public ColorStateList f;
  
  public PorterDuff.Mode g;
  
  public View.OnLongClickListener h;
  
  public final CheckableImageButton i;
  
  public final m40 j;
  
  public int k = 0;
  
  public final LinkedHashSet l = new LinkedHashSet();
  
  public ColorStateList m;
  
  public PorterDuff.Mode n;
  
  public int o;
  
  public ImageView.ScaleType p;
  
  public View.OnLongClickListener q;
  
  public CharSequence r;
  
  public final AppCompatTextView s;
  
  public boolean t;
  
  public EditText u;
  
  public final AccessibilityManager v;
  
  public AccessibilityManager.TouchExplorationStateChangeListener w;
  
  public final vm x = new vm(2, this);
  
  public n40(TextInputLayout paramTextInputLayout, zv0 paramzv0) {
    super(paramTextInputLayout.getContext());
    l40 l40 = new l40(this);
    this.v = (AccessibilityManager)getContext().getSystemService("accessibility");
    this.b = paramTextInputLayout;
    setVisibility(8);
    setOrientation(0);
    setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1, 8388613));
    FrameLayout frameLayout = new FrameLayout(getContext());
    this.c = frameLayout;
    frameLayout.setVisibility(8);
    frameLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -1));
    LayoutInflater layoutInflater = LayoutInflater.from(getContext());
    CheckableImageButton checkableImageButton1 = (CheckableImageButton)layoutInflater.inflate(2131492945, (ViewGroup)this, false);
    checkableImageButton1.setId(2131297627);
    if (wf2.I(getContext()))
      ((ViewGroup.MarginLayoutParams)checkableImageButton1.getLayoutParams()).setMarginStart(0); 
    this.e = checkableImageButton1;
    CheckableImageButton checkableImageButton2 = (CheckableImageButton)layoutInflater.inflate(2131492945, (ViewGroup)frameLayout, false);
    checkableImageButton2.setId(2131297626);
    if (wf2.I(getContext()))
      ((ViewGroup.MarginLayoutParams)checkableImageButton2.getLayoutParams()).setMarginStart(0); 
    this.i = checkableImageButton2;
    this.j = new m40(this, paramzv0);
    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
    this.s = appCompatTextView;
    TypedArray typedArray = (TypedArray)paramzv0.e;
    if (typedArray.hasValue(38))
      this.f = wf2.t(getContext(), paramzv0, 38); 
    boolean bool = typedArray.hasValue(39);
    layoutInflater = null;
    if (bool)
      this.g = n21.N(typedArray.getInt(39, -1), null); 
    if (typedArray.hasValue(37))
      h(paramzv0.o(37)); 
    checkableImageButton1.setContentDescription(getResources().getText(2131886508));
    checkableImageButton1.setImportantForAccessibility(2);
    checkableImageButton1.setClickable(false);
    checkableImageButton1.setPressable(false);
    checkableImageButton1.setCheckable(false);
    checkableImageButton1.setFocusable(false);
    if (!typedArray.hasValue(54)) {
      if (typedArray.hasValue(32))
        this.m = wf2.t(getContext(), paramzv0, 32); 
      if (typedArray.hasValue(33))
        this.n = n21.N(typedArray.getInt(33, -1), null); 
    } 
    if (typedArray.hasValue(30)) {
      f(typedArray.getInt(30, 0));
      if (typedArray.hasValue(27)) {
        CharSequence charSequence = typedArray.getText(27);
        if (checkableImageButton2.getContentDescription() != charSequence)
          checkableImageButton2.setContentDescription(charSequence); 
      } 
      checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
    } else if (typedArray.hasValue(54)) {
      if (typedArray.hasValue(55))
        this.m = wf2.t(getContext(), paramzv0, 55); 
      if (typedArray.hasValue(56))
        this.n = n21.N(typedArray.getInt(56, -1), null); 
      f(typedArray.getBoolean(54, false));
      CharSequence charSequence = typedArray.getText(52);
      if (checkableImageButton2.getContentDescription() != charSequence)
        checkableImageButton2.setContentDescription(charSequence); 
    } 
    int i = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131166244));
    if (i >= 0) {
      CharSequence charSequence1;
      if (i != this.o) {
        this.o = i;
        checkableImageButton2.setMinimumWidth(i);
        checkableImageButton2.setMinimumHeight(i);
        checkableImageButton1.setMinimumWidth(i);
        checkableImageButton1.setMinimumHeight(i);
      } 
      if (typedArray.hasValue(31)) {
        ImageView.ScaleType scaleType = n21.s(typedArray.getInt(31, -1));
        this.p = scaleType;
        checkableImageButton2.setScaleType(scaleType);
        checkableImageButton1.setScaleType(scaleType);
      } 
      appCompatTextView.setVisibility(8);
      appCompatTextView.setId(2131297635);
      appCompatTextView.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2, 80.0F));
      appCompatTextView.setAccessibilityLiveRegion(1);
      appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
      if (typedArray.hasValue(74))
        appCompatTextView.setTextColor(paramzv0.n(74)); 
      CharSequence charSequence2 = typedArray.getText(72);
      if (TextUtils.isEmpty(charSequence2)) {
        LayoutInflater layoutInflater1 = layoutInflater;
      } else {
        charSequence1 = charSequence2;
      } 
      this.r = charSequence1;
      appCompatTextView.setText(charSequence2);
      m();
      frameLayout.addView((View)checkableImageButton2);
      addView((View)appCompatTextView);
      addView((View)frameLayout);
      addView((View)checkableImageButton1);
      paramTextInputLayout.h0.add(l40);
      if (paramTextInputLayout.g != null)
        l40.a(paramTextInputLayout); 
      addOnAttachStateChangeListener(new vi(1, this));
      return;
    } 
    l0.l("endIconSize cannot be less than 0");
    throw null;
  }
  
  public final o40 a() {
    n40 n401;
    int i = this.k;
    m40 m401 = this.j;
    SparseArray sparseArray = (SparseArray)m401.c;
    o40 o40 = (o40)sparseArray.get(i);
    if (o40 == null) {
      nt nt;
      n401 = (n40)m401.d;
      if (i != -1) {
        if (i != 0) {
          ul ul;
          if (i != 1) {
            if (i != 2) {
              if (i == 3) {
                c20 c20 = new c20(n401);
              } else {
                l0.l(ga1.i("Invalid end icon mode: ", i));
                return null;
              } 
            } else {
              ul = new ul(n401);
            } 
          } else {
            b61 b61 = new b61(n401, ((m40)ul).b);
          } 
        } else {
          nt = new nt(n401, 1);
        } 
      } else {
        nt = new nt(n401, 0);
      } 
      sparseArray.append(i, nt);
      return nt;
    } 
    return (o40)n401;
  }
  
  public final int b() {
    if (c() || d()) {
      CheckableImageButton checkableImageButton = this.i;
      int j = checkableImageButton.getMeasuredWidth();
      j = ((ViewGroup.MarginLayoutParams)checkableImageButton.getLayoutParams()).getMarginStart() + j;
      int k = getPaddingEnd();
      return this.s.getPaddingEnd() + k + j;
    } 
    byte b = 0;
    int i = getPaddingEnd();
    return this.s.getPaddingEnd() + i + b;
  }
  
  public final boolean c() {
    return (this.c.getVisibility() == 0 && this.i.getVisibility() == 0);
  }
  
  public final boolean d() {
    return (this.e.getVisibility() == 0);
  }
  
  public final void e(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual a : ()Lo40;
    //   4: astore #5
    //   6: aload #5
    //   8: invokevirtual j : ()Z
    //   11: istore #4
    //   13: aload_0
    //   14: getfield i : Lcom/google/android/material/internal/CheckableImageButton;
    //   17: astore #6
    //   19: iconst_1
    //   20: istore_3
    //   21: iload #4
    //   23: ifeq -> 57
    //   26: aload #6
    //   28: getfield f : Z
    //   31: istore #4
    //   33: iload #4
    //   35: aload #5
    //   37: invokevirtual k : ()Z
    //   40: if_icmpeq -> 57
    //   43: aload #6
    //   45: iload #4
    //   47: iconst_1
    //   48: ixor
    //   49: invokevirtual setChecked : (Z)V
    //   52: iconst_1
    //   53: istore_2
    //   54: goto -> 59
    //   57: iconst_0
    //   58: istore_2
    //   59: aload #5
    //   61: instanceof c20
    //   64: ifeq -> 101
    //   67: aload #6
    //   69: invokevirtual isActivated : ()Z
    //   72: istore #4
    //   74: iload #4
    //   76: aload #5
    //   78: checkcast c20
    //   81: getfield l : Z
    //   84: if_icmpeq -> 101
    //   87: aload #6
    //   89: iload #4
    //   91: iconst_1
    //   92: ixor
    //   93: invokevirtual setActivated : (Z)V
    //   96: iload_3
    //   97: istore_2
    //   98: goto -> 101
    //   101: iload_1
    //   102: ifne -> 113
    //   105: iload_2
    //   106: ifeq -> 112
    //   109: goto -> 113
    //   112: return
    //   113: aload_0
    //   114: getfield b : Lcom/google/android/material/textfield/TextInputLayout;
    //   117: aload #6
    //   119: aload_0
    //   120: getfield m : Landroid/content/res/ColorStateList;
    //   123: invokestatic O : (Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    //   126: return
  }
  
  public final void f(int paramInt) {
    CharSequence charSequence;
    if (this.k == paramInt)
      return; 
    o40 o40 = a();
    AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.w;
    AccessibilityManager accessibilityManager = this.v;
    if (touchExplorationStateChangeListener != null && accessibilityManager != null)
      accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener); 
    touchExplorationStateChangeListener = null;
    this.w = null;
    o40.r();
    this.k = paramInt;
    Iterator iterator = this.l.iterator();
    if (!iterator.hasNext()) {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      g(bool);
      o40 o401 = a();
      int j = this.j.a;
      int i = j;
      if (j == 0)
        i = o401.d(); 
      if (i != 0) {
        Drawable drawable = ws2.I(getContext(), i);
      } else {
        iterator = null;
      } 
      CheckableImageButton checkableImageButton = this.i;
      checkableImageButton.setImageDrawable((Drawable)iterator);
      TextInputLayout textInputLayout = this.b;
      if (iterator != null) {
        n21.c(textInputLayout, checkableImageButton, this.m, this.n);
        n21.O(textInputLayout, checkableImageButton, this.m);
      } 
      i = o401.c();
      AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener1 = touchExplorationStateChangeListener;
      if (i != 0)
        charSequence = getResources().getText(i); 
      if (checkableImageButton.getContentDescription() != charSequence)
        checkableImageButton.setContentDescription(charSequence); 
      checkableImageButton.setCheckable(o401.j());
      if (o401.i(textInputLayout.getBoxBackgroundMode())) {
        o401.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = o401.h();
        this.w = touchExplorationStateChangeListener2;
        if (touchExplorationStateChangeListener2 != null && accessibilityManager != null && isAttachedToWindow())
          accessibilityManager.addTouchExplorationStateChangeListener(this.w); 
        View.OnClickListener onClickListener = o401.f();
        View.OnLongClickListener onLongClickListener = this.q;
        checkableImageButton.setOnClickListener(onClickListener);
        n21.R(checkableImageButton, onLongClickListener);
        EditText editText = this.u;
        if (editText != null) {
          o401.l(editText);
          i(o401);
        } 
        n21.c(textInputLayout, checkableImageButton, this.m, this.n);
        e(true);
        return;
      } 
      i = textInputLayout.getBoxBackgroundMode();
      charSequence = new StringBuilder("The current box background mode ");
      charSequence.append(i);
      charSequence.append(" is not supported by the end icon mode ");
      charSequence.append(paramInt);
      throw new IllegalStateException(charSequence.toString());
    } 
    throw x41.g(charSequence);
  }
  
  public final void g(boolean paramBoolean) {
    if (c() != paramBoolean) {
      byte b;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      this.i.setVisibility(b);
      j();
      l();
      this.b.s();
    } 
  }
  
  public final void h(Drawable paramDrawable) {
    CheckableImageButton checkableImageButton = this.e;
    checkableImageButton.setImageDrawable(paramDrawable);
    k();
    ColorStateList colorStateList = this.f;
    PorterDuff.Mode mode = this.g;
    n21.c(this.b, checkableImageButton, colorStateList, mode);
  }
  
  public final void i(o40 paramo40) {
    if (this.u != null) {
      if (paramo40.e() != null)
        this.u.setOnFocusChangeListener(paramo40.e()); 
      if (paramo40.g() != null)
        this.i.setOnFocusChangeListener(paramo40.g()); 
    } 
  }
  
  public final void j() {
    int i = this.i.getVisibility();
    byte b = 8;
    if (i == 0 && !d()) {
      i = 0;
    } else {
      i = 8;
    } 
    this.c.setVisibility(i);
    if (this.r != null && !this.t) {
      i = 0;
    } else {
      i = 8;
    } 
    if (c() || d() || i == 0)
      b = 0; 
    setVisibility(b);
  }
  
  public final void k() {
    byte b;
    CheckableImageButton checkableImageButton = this.e;
    Drawable drawable = checkableImageButton.getDrawable();
    TextInputLayout textInputLayout = this.b;
    if (drawable != null && textInputLayout.m.q && textInputLayout.o()) {
      b = 0;
    } else {
      b = 8;
    } 
    checkableImageButton.setVisibility(b);
    j();
    l();
    if (this.k != 0)
      return; 
    textInputLayout.s();
  }
  
  public final void l() {
    int i;
    TextInputLayout textInputLayout = this.b;
    if (textInputLayout.g == null)
      return; 
    if (c() || d()) {
      i = 0;
    } else {
      i = textInputLayout.g.getPaddingEnd();
    } 
    int m = getContext().getResources().getDimensionPixelSize(2131166053);
    int j = textInputLayout.g.getPaddingTop();
    int k = textInputLayout.g.getPaddingBottom();
    this.s.setPaddingRelative(m, j, i, k);
  }
  
  public final void m() {
    byte b;
    AppCompatTextView appCompatTextView = this.s;
    int i = appCompatTextView.getVisibility();
    CharSequence charSequence = this.r;
    boolean bool = false;
    if (charSequence != null && !this.t) {
      b = 0;
    } else {
      b = 8;
    } 
    if (i != b) {
      o40 o40 = a();
      if (b == 0)
        bool = true; 
      o40.o(bool);
    } 
    j();
    appCompatTextView.setVisibility(b);
    this.b.s();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */