package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import co0;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import f7;
import g92;
import java.util.List;
import java.util.Locale;
import p7;
import qv;
import vr0;
import wf2;
import ws0;
import zb1;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
  public final co0 g;
  
  public final AccessibilityManager h;
  
  public final Rect i = new Rect();
  
  public final int j;
  
  public final float k;
  
  public ColorStateList l;
  
  public int m;
  
  public ColorStateList n;
  
  public MaterialAutoCompleteTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968650);
  }
  
  public MaterialAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 0), paramAttributeSet, paramInt);
    Context context = getContext();
    TypedArray typedArray = g92.S(context, paramAttributeSet, zb1.m, paramInt, 2131952554, new int[0]);
    if (typedArray.hasValue(0) && typedArray.getInt(0, 0) == 0)
      setKeyListener(null); 
    this.j = typedArray.getResourceId(3, 2131493136);
    this.k = typedArray.getDimensionPixelOffset(1, 2131166213);
    if (typedArray.hasValue(2))
      this.l = ColorStateList.valueOf(typedArray.getColor(2, 0)); 
    this.m = typedArray.getColor(4, 0);
    this.n = wf2.u(context, typedArray, 5);
    this.h = (AccessibilityManager)context.getSystemService("accessibility");
    co0 co01 = new co0(context, null, 2130969515, 0);
    this.g = co01;
    co01.A = true;
    f7 f7 = co01.B;
    f7.setFocusable(true);
    co01.q = (View)this;
    f7.setInputMethodMode(2);
    co01.q(getAdapter());
    co01.r = (AdapterView.OnItemClickListener)new p7(1, this);
    if (typedArray.hasValue(6))
      setSimpleItems(typedArray.getResourceId(6, 0)); 
    typedArray.recycle();
  }
  
  public final TextInputLayout b() {
    for (ViewParent viewParent = getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent instanceof TextInputLayout)
        return (TextInputLayout)viewParent; 
    } 
    return null;
  }
  
  public final boolean c() {
    AccessibilityManager accessibilityManager = this.h;
    if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())
      return true; 
    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
      List list = accessibilityManager.getEnabledAccessibilityServiceList(16);
      if (list != null)
        for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
          if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess"))
            return true; 
        }  
    } 
    return false;
  }
  
  public final void dismissDropDown() {
    if (c()) {
      this.g.dismiss();
      return;
    } 
    super.dismissDropDown();
  }
  
  public ColorStateList getDropDownBackgroundTintList() {
    return this.l;
  }
  
  public CharSequence getHint() {
    TextInputLayout textInputLayout = b();
    return (textInputLayout != null && textInputLayout.H) ? textInputLayout.getHint() : super.getHint();
  }
  
  public float getPopupElevation() {
    return this.k;
  }
  
  public int getSimpleItemSelectedColor() {
    return this.m;
  }
  
  public ColorStateList getSimpleItemSelectedRippleColor() {
    return this.n;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    TextInputLayout textInputLayout = b();
    if (textInputLayout != null && textInputLayout.H && super.getHint() == null) {
      String str1 = Build.MANUFACTURER;
      String str2 = ybWnIKHovcRr.vIWi;
      if (str1 != null) {
        str1 = str1.toLowerCase(Locale.ENGLISH);
      } else {
        str1 = str2;
      } 
      if (str1.equals("meizu"))
        setHint(str2); 
    } 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.g.dismiss();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE) {
      int k = getMeasuredWidth();
      ListAdapter listAdapter = getAdapter();
      TextInputLayout textInputLayout = b();
      int i = 0;
      int j = 0;
      paramInt2 = i;
      if (listAdapter != null)
        if (textInputLayout == null) {
          paramInt2 = i;
        } else {
          int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
          int m = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
          co0 co01 = this.g;
          if (!co01.B.isShowing()) {
            paramInt2 = -1;
          } else {
            paramInt2 = co01.e.getSelectedItemPosition();
          } 
          paramInt2 = Math.max(0, paramInt2);
          int i1 = Math.min(listAdapter.getCount(), paramInt2 + 15);
          i = Math.max(0, i1 - 15);
          View view = null;
          paramInt2 = 0;
          while (i < i1) {
            int i3 = listAdapter.getItemViewType(i);
            int i2 = j;
            if (i3 != j) {
              view = null;
              i2 = i3;
            } 
            view = listAdapter.getView(i, view, (ViewGroup)textInputLayout);
            if (view.getLayoutParams() == null)
              view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
            view.measure(n, m);
            paramInt2 = Math.max(paramInt2, view.getMeasuredWidth());
            i++;
            j = i2;
          } 
          Drawable drawable = co01.B.getBackground();
          i = paramInt2;
          if (drawable != null) {
            Rect rect = this.i;
            drawable.getPadding(rect);
            i = paramInt2 + rect.left + rect.right;
          } 
          paramInt2 = textInputLayout.getEndIconView().getMeasuredWidth() + i;
        }  
      setMeasuredDimension(Math.min(Math.max(k, paramInt2), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    } 
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean) {
    if (c())
      return; 
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public <T extends ListAdapter & android.widget.Filterable> void setAdapter(T paramT) {
    super.setAdapter((ListAdapter)paramT);
    this.g.q(getAdapter());
  }
  
  public void setDropDownBackgroundDrawable(Drawable paramDrawable) {
    super.setDropDownBackgroundDrawable(paramDrawable);
    co0 co01 = this.g;
    if (co01 != null)
      co01.i(paramDrawable); 
  }
  
  public void setDropDownBackgroundTint(int paramInt) {
    setDropDownBackgroundTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setDropDownBackgroundTintList(ColorStateList paramColorStateList) {
    this.l = paramColorStateList;
    Drawable drawable = getDropDownBackground();
    if (drawable instanceof ws0)
      ((ws0)drawable).o(this.l); 
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener) {
    super.setOnItemSelectedListener(paramOnItemSelectedListener);
    this.g.s = getOnItemSelectedListener();
  }
  
  public void setRawInputType(int paramInt) {
    super.setRawInputType(paramInt);
    TextInputLayout textInputLayout = b();
    if (textInputLayout != null)
      textInputLayout.u(); 
  }
  
  public void setSimpleItemSelectedColor(int paramInt) {
    this.m = paramInt;
    if (getAdapter() instanceof vr0)
      ((vr0)getAdapter()).a(); 
  }
  
  public void setSimpleItemSelectedRippleColor(ColorStateList paramColorStateList) {
    this.n = paramColorStateList;
    if (getAdapter() instanceof vr0)
      ((vr0)getAdapter()).a(); 
  }
  
  public void setSimpleItems(int paramInt) {
    setSimpleItems(getResources().getStringArray(paramInt));
  }
  
  public void setSimpleItems(String[] paramArrayOfString) {
    setAdapter(new vr0(this, getContext(), this.j, paramArrayOfString));
  }
  
  public final void showDropDown() {
    if (c()) {
      this.g.d();
      return;
    } 
    super.showDropDown();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\textfield\MaterialAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */