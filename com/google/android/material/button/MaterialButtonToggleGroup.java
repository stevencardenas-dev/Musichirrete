package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import fe;
import fs0;
import g92;
import hs0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k;
import k0;
import kp1;
import ls;
import qv;
import v22;
import zb1;

public class MaterialButtonToggleGroup extends fs0 {
  public static final int s = 0;
  
  public final LinkedHashSet m = new LinkedHashSet();
  
  public boolean n = false;
  
  public boolean o;
  
  public boolean p;
  
  public final int q;
  
  public HashSet r = new HashSet();
  
  public MaterialButtonToggleGroup(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialButtonToggleGroup(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969551);
  }
  
  public MaterialButtonToggleGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952883), paramAttributeSet, paramInt);
    TypedArray typedArray = g92.S(getContext(), paramAttributeSet, zb1.p, paramInt, 2131952883, new int[0]);
    setSingleSelection(typedArray.getBoolean(7, false));
    this.q = typedArray.getResourceId(2, -1);
    this.p = typedArray.getBoolean(4, false);
    if (this.h == null)
      this.h = kp1.b((ls)new k(0.0F)); 
    setEnabled(typedArray.getBoolean(0, true));
    typedArray.recycle();
    setImportantForAccessibility(1);
  }
  
  private String getChildrenA11yClassName() {
    if (this.o) {
      Class<RadioButton> clazz1 = RadioButton.class;
      return clazz1.getName();
    } 
    Class<ToggleButton> clazz = ToggleButton.class;
    return clazz.getName();
  }
  
  private int getVisibleButtonCount() {
    byte b = 0;
    int i;
    for (i = 0; b < getChildCount(); i = j) {
      int j = i;
      if (getChildAt(b) instanceof MaterialButton) {
        j = i;
        if (getChildAt(b).getVisibility() != 8)
          j = i + 1; 
      } 
      b++;
    } 
    return i;
  }
  
  private void setupButtonChild(MaterialButton paramMaterialButton) {
    paramMaterialButton.setMaxLines(1);
    paramMaterialButton.setEllipsize(TextUtils.TruncateAt.END);
    paramMaterialButton.setCheckable(true);
    paramMaterialButton.setA11yClassName(getChildrenA11yClassName());
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (!(paramView instanceof MaterialButton)) {
      Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
      return;
    } 
    super.addView(paramView, paramInt, paramLayoutParams);
    MaterialButton materialButton = (MaterialButton)paramView;
    setupButtonChild(materialButton);
    g(materialButton.getId(), materialButton.q);
    v22.n((View)materialButton, (k0)new fe(3, this));
  }
  
  public final void f(hs0 paramhs0) {
    this.m.add(paramhs0);
  }
  
  public final void g(int paramInt, boolean paramBoolean) {
    if (paramInt == -1) {
      StringBuilder stringBuilder = new StringBuilder("Button ID is not valid: ");
      stringBuilder.append(paramInt);
      Log.e("MButtonToggleGroup", stringBuilder.toString());
      return;
    } 
    HashSet<Integer> hashSet = new HashSet(this.r);
    if (paramBoolean && !hashSet.contains(Integer.valueOf(paramInt))) {
      if (this.o && !hashSet.isEmpty())
        hashSet.clear(); 
      hashSet.add(Integer.valueOf(paramInt));
    } else if (!paramBoolean && hashSet.contains(Integer.valueOf(paramInt))) {
      if (!this.p || hashSet.size() > 1)
        hashSet.remove(Integer.valueOf(paramInt)); 
    } else {
      return;
    } 
    h(hashSet);
  }
  
  public int getCheckedButtonId() {
    return (this.o && !this.r.isEmpty()) ? ((Integer)this.r.iterator().next()).intValue() : -1;
  }
  
  public List<Integer> getCheckedButtonIds() {
    ArrayList<Integer> arrayList = new ArrayList();
    for (byte b = 0; b < getChildCount(); b++) {
      int i = ((MaterialButton)getChildAt(b)).getId();
      if (this.r.contains(Integer.valueOf(i)))
        arrayList.add(Integer.valueOf(i)); 
    } 
    return arrayList;
  }
  
  public final void h(Set<?> paramSet) {
    HashSet hashSet = this.r;
    this.r = new HashSet(paramSet);
    for (byte b = 0; b < getChildCount(); b++) {
      int i = ((MaterialButton)getChildAt(b)).getId();
      boolean bool = paramSet.contains(Integer.valueOf(i));
      View view = findViewById(i);
      if (view instanceof MaterialButton) {
        this.n = true;
        ((MaterialButton)view).setChecked(bool);
        this.n = false;
      } 
      if (hashSet.contains(Integer.valueOf(i)) != paramSet.contains(Integer.valueOf(i))) {
        bool = paramSet.contains(Integer.valueOf(i));
        Iterator<hs0> iterator = this.m.iterator();
        while (iterator.hasNext())
          ((hs0)iterator.next()).a(this, i, bool); 
      } 
    } 
    invalidate();
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    int i = this.q;
    if (i != -1)
      h(Collections.singleton(Integer.valueOf(i))); 
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    byte b;
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    int i = getVisibleButtonCount();
    if (this.o) {
      b = 1;
    } else {
      b = 2;
    } 
    paramAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i, false, b));
  }
  
  public void setSelectionRequired(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public void setSingleSelection(int paramInt) {
    setSingleSelection(getResources().getBoolean(paramInt));
  }
  
  public void setSingleSelection(boolean paramBoolean) {
    if (this.o != paramBoolean) {
      this.o = paramBoolean;
      h(new HashSet());
    } 
    String str = getChildrenA11yClassName();
    for (byte b = 0; b < getChildCount(); b++)
      ((MaterialButton)getChildAt(b)).setA11yClassName(str); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\button\MaterialButtonToggleGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */