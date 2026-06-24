import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public final class ep1 extends LinearLayout {
  public final TextInputLayout b;
  
  public final AppCompatTextView c;
  
  public CharSequence e;
  
  public final CheckableImageButton f;
  
  public ColorStateList g;
  
  public PorterDuff.Mode h;
  
  public int i;
  
  public ImageView.ScaleType j;
  
  public View.OnLongClickListener k;
  
  public boolean l;
  
  public ep1(TextInputLayout paramTextInputLayout, zv0 paramzv0) {
    super(paramTextInputLayout.getContext());
    this.b = paramTextInputLayout;
    setVisibility(8);
    setOrientation(0);
    setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1, 8388611));
    CheckableImageButton checkableImageButton = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(2131492946, (ViewGroup)this, false);
    this.f = checkableImageButton;
    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
    this.c = appCompatTextView;
    if (wf2.I(getContext()))
      ((ViewGroup.MarginLayoutParams)checkableImageButton.getLayoutParams()).setMarginEnd(0); 
    View.OnLongClickListener onLongClickListener = this.k;
    paramTextInputLayout = null;
    checkableImageButton.setOnClickListener(null);
    n21.R(checkableImageButton, onLongClickListener);
    this.k = null;
    checkableImageButton.setOnLongClickListener(null);
    n21.R(checkableImageButton, null);
    TypedArray typedArray = (TypedArray)paramzv0.e;
    if (typedArray.hasValue(70))
      this.g = wf2.t(getContext(), paramzv0, 70); 
    if (typedArray.hasValue(71))
      this.h = n21.N(typedArray.getInt(71, -1), null); 
    if (typedArray.hasValue(67)) {
      b(paramzv0.o(67));
      if (typedArray.hasValue(66)) {
        CharSequence charSequence = typedArray.getText(66);
        if (checkableImageButton.getContentDescription() != charSequence)
          checkableImageButton.setContentDescription(charSequence); 
      } 
      checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
    } 
    int i = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(2131166244));
    if (i >= 0) {
      CharSequence charSequence1;
      if (i != this.i) {
        this.i = i;
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
      } 
      if (typedArray.hasValue(69)) {
        ImageView.ScaleType scaleType = n21.s(typedArray.getInt(69, -1));
        this.j = scaleType;
        checkableImageButton.setScaleType(scaleType);
      } 
      appCompatTextView.setVisibility(8);
      appCompatTextView.setId(2131297634);
      appCompatTextView.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
      appCompatTextView.setAccessibilityLiveRegion(1);
      appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
      if (typedArray.hasValue(62))
        appCompatTextView.setTextColor(paramzv0.n(62)); 
      CharSequence charSequence2 = typedArray.getText(60);
      if (!TextUtils.isEmpty(charSequence2))
        charSequence1 = charSequence2; 
      this.e = charSequence1;
      appCompatTextView.setText(charSequence2);
      e();
      addView((View)checkableImageButton);
      addView((View)appCompatTextView);
      return;
    } 
    l0.l("startIconSize cannot be less than 0");
    throw null;
  }
  
  public final int a() {
    byte b;
    CheckableImageButton checkableImageButton = this.f;
    if (checkableImageButton.getVisibility() == 0) {
      b = checkableImageButton.getMeasuredWidth();
      b = ((ViewGroup.MarginLayoutParams)checkableImageButton.getLayoutParams()).getMarginEnd() + b;
    } else {
      b = 0;
    } 
    int i = getPaddingStart();
    return this.c.getPaddingStart() + i + b;
  }
  
  public final void b(Drawable paramDrawable) {
    CheckableImageButton checkableImageButton = this.f;
    checkableImageButton.setImageDrawable(paramDrawable);
    if (paramDrawable != null) {
      ColorStateList colorStateList = this.g;
      PorterDuff.Mode mode = this.h;
      TextInputLayout textInputLayout = this.b;
      n21.c(textInputLayout, checkableImageButton, colorStateList, mode);
      c(true);
      n21.O(textInputLayout, checkableImageButton, this.g);
      return;
    } 
    c(false);
    View.OnLongClickListener onLongClickListener = this.k;
    checkableImageButton.setOnClickListener(null);
    n21.R(checkableImageButton, onLongClickListener);
    this.k = null;
    checkableImageButton.setOnLongClickListener(null);
    n21.R(checkableImageButton, null);
    if (checkableImageButton.getContentDescription() != null)
      checkableImageButton.setContentDescription(null); 
  }
  
  public final void c(boolean paramBoolean) {
    boolean bool;
    CheckableImageButton checkableImageButton = this.f;
    int i = checkableImageButton.getVisibility();
    byte b = 0;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool != paramBoolean) {
      if (!paramBoolean)
        b = 8; 
      checkableImageButton.setVisibility(b);
      d();
      e();
    } 
  }
  
  public final void d() {
    int i;
    EditText editText = this.b.g;
    if (editText == null)
      return; 
    if (this.f.getVisibility() == 0) {
      i = 0;
    } else {
      i = editText.getPaddingStart();
    } 
    int j = editText.getCompoundPaddingTop();
    int k = getContext().getResources().getDimensionPixelSize(2131166053);
    int m = editText.getCompoundPaddingBottom();
    this.c.setPaddingRelative(i, j, k, m);
  }
  
  public final void e() {
    byte b1;
    CharSequence charSequence = this.e;
    byte b2 = 8;
    if (charSequence != null && !this.l) {
      b1 = 0;
    } else {
      b1 = 8;
    } 
    if (this.f.getVisibility() == 0 || b1 == 0)
      b2 = 0; 
    setVisibility(b2);
    this.c.setVisibility(b1);
    this.b.s();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    d();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ep1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */